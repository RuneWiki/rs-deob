package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class48 implements class289 {

    @ObfuscatedName("client.w")
    public static class165[] field643 = new class165[4];

    @ObfuscatedName("client.ag")
    public static boolean field581 = true;

    @ObfuscatedName("client.bk")
    public static int field582 = 1;

    @ObfuscatedName("client.bp")
    public static int field633 = 0;

    @ObfuscatedName("client.bj")
    public static int field778 = 0;

    @ObfuscatedName("client.bh")
    public static boolean field669 = false;

    @ObfuscatedName("client.bz")
    public static boolean field586 = false;

    @ObfuscatedName("client.bu")
    public static int field828 = 0;

    @ObfuscatedName("client.bn")
    public static int field588 = -1;

    @ObfuscatedName("client.bb")
    public static boolean field589 = false;

    @ObfuscatedName("client.bx")
    public static int field590 = 0;

    @ObfuscatedName("client.bc")
    public static boolean field626 = true;

    @ObfuscatedName("client.bs")
    public static int field592 = 0;

    @ObfuscatedName("client.be")
    public static long field593 = 1L;

    @ObfuscatedName("client.bv")
    public static int field594 = -1;

    @ObfuscatedName("client.br")
    public static int field595 = -1;

    @ObfuscatedName("client.bd")
    public static int field596 = -1;

    @ObfuscatedName("client.bw")
    public static boolean field848 = true;

    @ObfuscatedName("client.bf")
    public static boolean field598 = false;

    @ObfuscatedName("client.bt")
    public static int field599 = 0;

    @ObfuscatedName("client.bm")
    public static int field600 = 0;

    @ObfuscatedName("client.cy")
    public static int field601 = 0;

    @ObfuscatedName("client.cd")
    public static int field580 = 0;

    @ObfuscatedName("client.cb")
    public static int field603 = 0;

    @ObfuscatedName("client.co")
    public static int field819 = 0;

    @ObfuscatedName("client.cq")
    public static int field605 = 0;

    @ObfuscatedName("client.cl")
    public static int field606 = 0;

    @ObfuscatedName("client.ce")
    public static int field638 = 0;

    @ObfuscatedName("client.cw")
    public static class78 field608 = class78.field1075;

    @ObfuscatedName("client.cf")
    public static class78 field781 = class78.field1075;

    @ObfuscatedName("client.cr")
    public static int field610 = 0;

    @ObfuscatedName("client.cs")
    public static int field693 = 0;

    @ObfuscatedName("client.ct")
    public static int field769 = 0;

    @ObfuscatedName("client.dp")
    public static int field615 = 0;

    @ObfuscatedName("client.db")
    public static int field616 = 0;

    @ObfuscatedName("client.dq")
    public static int field617 = 0;

    @ObfuscatedName("client.dx")
    public static int field618 = 0;

    @ObfuscatedName("client.du")
    public static int field619 = 0;

    @ObfuscatedName("client.da")
    public static class147 field620 = class147.field1908;

    @ObfuscatedName("client.di")
    public static byte[] field621 = null;

    @ObfuscatedName("client.df")
    public static class73[] field844 = new class73[32768];

    @ObfuscatedName("client.dr")
    public static int field623 = 0;

    @ObfuscatedName("client.dj")
    public static int[] field640 = new int[32768];

    @ObfuscatedName("client.ew")
    public static int field625 = 0;

    @ObfuscatedName("client.es")
    public static int[] field667 = new int[250];

    @ObfuscatedName("client.ek")
    public static final class88 field627 = new class88();

    @ObfuscatedName("client.eh")
    public static int field628 = 0;

    @ObfuscatedName("client.ey")
    public static boolean field757 = false;

    @ObfuscatedName("client.ep")
    public static boolean field630 = true;

    @ObfuscatedName("client.ec")
    public static class281 field805 = new class281();

    @ObfuscatedName("client.eb")
    public static HashMap field632 = new HashMap();

    @ObfuscatedName("client.en")
    public static int field634 = 0;

    @ObfuscatedName("client.ee")
    public static int field635 = 1;

    @ObfuscatedName("client.ev")
    public static int field636 = 0;

    @ObfuscatedName("client.ef")
    public static int field637 = 1;

    @ObfuscatedName("client.fp")
    public static int field752 = 0;

    @ObfuscatedName("client.fk")
    public static boolean field760 = false;

    @ObfuscatedName("client.fh")
    public static int[][][] field646 = new int[4][13][13];

    @ObfuscatedName("client.fw")
    public static final int[] field847 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fi")
    public static int field701 = 0;

    @ObfuscatedName("client.fb")
    public static int field644 = 2301979;

    @ObfuscatedName("client.gk")
    public static int field585 = 5063219;

    @ObfuscatedName("client.gg")
    public static int field837 = 3353893;

    @ObfuscatedName("client.gp")
    public static int field647 = 7759444;

    @ObfuscatedName("client.ge")
    public static boolean field747 = false;

    @ObfuscatedName("client.gv")
    public static int field661 = 0;

    @ObfuscatedName("client.go")
    public static int field650 = 128;

    @ObfuscatedName("client.gd")
    public static int field718 = 0;

    @ObfuscatedName("client.gq")
    public static int field609 = 0;

    @ObfuscatedName("client.gu")
    public static int field653 = 0;

    @ObfuscatedName("client.gh")
    public static int field654 = 0;

    @ObfuscatedName("client.gm")
    public static int field655 = 0;

    @ObfuscatedName("client.gj")
    public static int field656 = 0;

    @ObfuscatedName("client.gl")
    public static int field645 = 50;

    @ObfuscatedName("client.gn")
    public static int field658 = 0;

    @ObfuscatedName("client.gw")
    public static int field614 = 0;

    @ObfuscatedName("client.gf")
    public static int field660 = 0;

    @ObfuscatedName("client.hk")
    public static int field751 = 12;

    @ObfuscatedName("client.hf")
    public static int field662 = 6;

    @ObfuscatedName("client.hu")
    public static int field854 = 0;

    @ObfuscatedName("client.hh")
    public static boolean field664 = false;

    @ObfuscatedName("client.hw")
    public static int field665 = 0;

    @ObfuscatedName("client.hc")
    public static boolean field808 = false;

    @ObfuscatedName("client.hj")
    public static int field739 = 0;

    @ObfuscatedName("client.ho")
    public static int field668 = 0;

    @ObfuscatedName("client.hm")
    public static int field649 = 50;

    @ObfuscatedName("client.hg")
    public static int[] field670 = new int[field649];

    @ObfuscatedName("client.hn")
    public static int[] field671 = new int[field649];

    @ObfuscatedName("client.he")
    public static int[] field672 = new int[field649];

    @ObfuscatedName("client.hx")
    public static int[] field673 = new int[field649];

    @ObfuscatedName("client.hz")
    public static int[] field674 = new int[field649];

    @ObfuscatedName("client.hq")
    public static int[] field675 = new int[field649];

    @ObfuscatedName("client.hv")
    public static int[] field676 = new int[field649];

    @ObfuscatedName("client.hy")
    public static String[] field722 = new String[field649];

    @ObfuscatedName("client.ha")
    public static int[][] field762 = new int[104][104];

    @ObfuscatedName("client.hd")
    public static int field688 = 0;

    @ObfuscatedName("client.hr")
    public static int field680 = -1;

    @ObfuscatedName("client.hs")
    public static int field681 = -1;

    @ObfuscatedName("client.hi")
    public static int field682 = 0;

    @ObfuscatedName("client.hb")
    public static int field683 = 0;

    @ObfuscatedName("client.ht")
    public static int field804 = 0;

    @ObfuscatedName("client.hl")
    public static int field685 = 0;

    @ObfuscatedName("client.ih")
    public static boolean field622 = true;

    @ObfuscatedName("client.ik")
    public static int field687 = 0;

    @ObfuscatedName("client.im")
    public static int field583 = 0;

    @ObfuscatedName("client.if")
    public static int field689 = 0;

    @ObfuscatedName("client.id")
    public static int field679 = 0;

    @ObfuscatedName("client.iw")
    public static int field822 = 0;

    @ObfuscatedName("client.il")
    public static int field692 = 0;

    @ObfuscatedName("client.ig")
    public static boolean field690 = false;

    @ObfuscatedName("client.ir")
    public static int field694 = 0;

    @ObfuscatedName("client.iv")
    public static int field695 = 0;

    @ObfuscatedName("client.ia")
    public static boolean field678 = true;

    @ObfuscatedName("client.is")
    public static class61[] field611 = new class61[2048];

    @ObfuscatedName("client.it")
    public static String field735 = null;

    @ObfuscatedName("client.ie")
    public static int field629 = -1;

    @ObfuscatedName("client.io")
    public static int field699 = 0;

    @ObfuscatedName("client.ib")
    public static boolean field700 = true;

    @ObfuscatedName("client.jl")
    public static int field659 = 0;

    @ObfuscatedName("client.jo")
    public static int field702 = 0;

    @ObfuscatedName("client.ji")
    public static int[] field703 = new int[1000];

    @ObfuscatedName("client.jp")
    public static final int[] field704 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jj")
    public static String[] field705 = new String[8];

    @ObfuscatedName("client.jt")
    public static boolean[] field710 = new boolean[8];

    @ObfuscatedName("client.jd")
    public static int[] field707 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jq")
    public static int field708 = -1;

    @ObfuscatedName("client.jv")
    public static class206[][][] field709 = new class206[4][104][104];

    @ObfuscatedName("client.jn")
    public static class206 field715 = new class206();

    @ObfuscatedName("client.jc")
    public static class206 field711 = new class206();

    @ObfuscatedName("client.js")
    public static class206 field712 = new class206();

    @ObfuscatedName("client.jm")
    public static int[] field713 = new int[25];

    @ObfuscatedName("client.jw")
    public static int[] field714 = new int[25];

    @ObfuscatedName("client.jg")
    public static int[] field641 = new int[25];

    @ObfuscatedName("client.jr")
    public static int field716 = 0;

    @ObfuscatedName("client.jb")
    public static boolean field717 = false;

    @ObfuscatedName("client.kx")
    public static int field772 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field719 = new int[500];

    @ObfuscatedName("client.ke")
    public static int[] field852 = new int[500];

    @ObfuscatedName("client.kd")
    public static int[] field721 = new int[500];

    @ObfuscatedName("client.kf")
    public static int[] field795 = new int[500];

    @ObfuscatedName("client.km")
    public static String[] field736 = new String[500];

    @ObfuscatedName("client.kt")
    public static String[] field741 = new String[500];

    @ObfuscatedName("client.kn")
    public static boolean[] field591 = new boolean[500];

    @ObfuscatedName("client.ky")
    public static boolean field726 = false;

    @ObfuscatedName("client.kv")
    public static boolean field727 = false;

    @ObfuscatedName("client.ka")
    public static boolean field728 = false;

    @ObfuscatedName("client.kj")
    public static boolean field729 = true;

    @ObfuscatedName("client.kk")
    public static int field730 = -1;

    @ObfuscatedName("client.ko")
    public static int field731 = -1;

    @ObfuscatedName("client.kh")
    public static int field624 = 0;

    @ObfuscatedName("client.kq")
    public static int field733 = 50;

    @ObfuscatedName("client.ks")
    public static int field734 = 0;

    @ObfuscatedName("client.kp")
    public static boolean field786 = false;

    @ObfuscatedName("client.kg")
    public static int field737 = -1;

    @ObfuscatedName("client.kw")
    public static int field738 = -1;

    @ObfuscatedName("client.lj")
    public static String field613 = null;

    @ObfuscatedName("client.lt")
    public static String field740 = null;

    @ObfuscatedName("client.lc")
    public static int field684 = -1;

    @ObfuscatedName("client.li")
    public static class203 field742 = new class203(8);

    @ObfuscatedName("client.ly")
    public static int field743 = 0;

    @ObfuscatedName("client.ll")
    public static int field744 = 0;

    @ObfuscatedName("client.lo")
    public static class231 field745 = null;

    @ObfuscatedName("client.ld")
    public static int field746 = 0;

    @ObfuscatedName("client.lw")
    public static int field783 = 0;

    @ObfuscatedName("client.lm")
    public static int field748 = 0;

    @ObfuscatedName("client.lr")
    public static int field749 = -1;

    @ObfuscatedName("client.lg")
    public static boolean field777 = false;

    @ObfuscatedName("client.lx")
    public static class231 field785 = null;

    @ObfuscatedName("client.ln")
    public static class231 field584 = null;

    @ObfuscatedName("client.lq")
    public static class231 field753 = null;

    @ObfuscatedName("client.lf")
    public static int field754 = 0;

    @ObfuscatedName("client.lk")
    public static int field750 = 0;

    @ObfuscatedName("client.lb")
    public static class231 field756 = null;

    @ObfuscatedName("client.ls")
    public static boolean field602 = false;

    @ObfuscatedName("client.lh")
    public static int field758 = -1;

    @ObfuscatedName("client.la")
    public static int field759 = -1;

    @ObfuscatedName("client.lz")
    public static boolean field773 = false;

    @ObfuscatedName("client.lu")
    public static int field697 = -1;

    @ObfuscatedName("client.le")
    public static int field761 = -1;

    @ObfuscatedName("client.lp")
    public static boolean field764 = false;

    @ObfuscatedName("client.mc")
    public static int field802 = 1;

    @ObfuscatedName("client.mf")
    public static int[] field765 = new int[32];

    @ObfuscatedName("client.me")
    public static int field766 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field767 = new int[32];

    @ObfuscatedName("client.ml")
    public static int field768 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field691 = new int[32];

    @ObfuscatedName("client.mx")
    public static int field770 = 0;

    @ObfuscatedName("client.mz")
    public static int field771 = 0;

    @ObfuscatedName("client.mh")
    public static int field648 = 0;

    @ObfuscatedName("client.mv")
    public static int field829 = 0;

    @ObfuscatedName("client.mr")
    public static int field794 = 0;

    @ObfuscatedName("client.ms")
    public static int field775 = 0;

    @ObfuscatedName("client.md")
    public static int field776 = 0;

    @ObfuscatedName("client.mj")
    public static int field696 = 0;

    @ObfuscatedName("client.my")
    public static class206 field639 = new class206();

    @ObfuscatedName("client.mo")
    public static class206 field779 = new class206();

    @ObfuscatedName("client.mk")
    public static class206 field780 = new class206();

    @ObfuscatedName("client.mw")
    public static class203 field784 = new class203(512);

    @ObfuscatedName("client.ny")
    public static int field604 = 0;

    @ObfuscatedName("client.nl")
    public static int field831 = -2;

    @ObfuscatedName("client.nd")
    public static boolean[] field698 = new boolean[100];

    @ObfuscatedName("client.nm")
    public static boolean[] field789 = new boolean[100];

    @ObfuscatedName("client.nj")
    public static boolean[] field724 = new boolean[100];

    @ObfuscatedName("client.np")
    public static int[] field787 = new int[100];

    @ObfuscatedName("client.nx")
    public static int[] field788 = new int[100];

    @ObfuscatedName("client.nt")
    public static int[] field642 = new int[100];

    @ObfuscatedName("client.ne")
    public static int[] field790 = new int[100];

    @ObfuscatedName("client.nv")
    public static int field791 = 0;

    @ObfuscatedName("client.ni")
    public static long field792 = 0L;

    @ObfuscatedName("client.nc")
    public static boolean field793 = true;

    @ObfuscatedName("client.nu")
    public static int[] field732 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nz")
    public static int field631 = 0;

    @ObfuscatedName("client.nq")
    public static int field796 = 0;

    @ObfuscatedName("client.nb")
    public static String field797 = "";

    @ObfuscatedName("client.na")
    public static long[] field798 = new long[100];

    @ObfuscatedName("client.oh")
    public static int field799 = 0;

    @ObfuscatedName("client.ob")
    public static int field800 = 0;

    @ObfuscatedName("client.om")
    public static int[] field801 = new int[128];

    @ObfuscatedName("client.ou")
    public static int[] field774 = new int[128];

    @ObfuscatedName("client.ot")
    public static long field723 = -1L;

    @ObfuscatedName("client.ox")
    public static int field652 = -1;

    @ObfuscatedName("client.oy")
    public static int field725 = 0;

    @ObfuscatedName("client.od")
    public static int[] field806 = new int[1000];

    @ObfuscatedName("client.oc")
    public static int[] field807 = new int[1000];

    @ObfuscatedName("client.on")
    public static class319[] field817 = new class319[1000];

    @ObfuscatedName("client.or")
    public static int field809 = 0;

    @ObfuscatedName("client.ol")
    public static int field810 = 0;

    @ObfuscatedName("client.os")
    public static int field811 = 0;

    @ObfuscatedName("client.oi")
    public static int field812 = 255;

    @ObfuscatedName("client.ok")
    public static int field813 = -1;

    @ObfuscatedName("client.oq")
    public static boolean field814 = false;

    @ObfuscatedName("client.pa")
    public static int field815 = 127;

    @ObfuscatedName("client.py")
    public static int field816 = 127;

    @ObfuscatedName("client.pm")
    public static int field657 = 0;

    @ObfuscatedName("client.pc")
    public static int[] field818 = new int[50];

    @ObfuscatedName("client.pu")
    public static int[] field677 = new int[50];

    @ObfuscatedName("client.px")
    public static int[] field820 = new int[50];

    @ObfuscatedName("client.pf")
    public static int[] field821 = new int[50];

    @ObfuscatedName("client.pd")
    public static class92[] field720 = new class92[50];

    @ObfuscatedName("client.pb")
    public static boolean field823 = false;

    @ObfuscatedName("client.pe")
    public static boolean[] field824 = new boolean[5];

    @ObfuscatedName("client.qd")
    public static int[] field825 = new int[5];

    @ObfuscatedName("client.qr")
    public static int[] field826 = new int[5];

    @ObfuscatedName("client.qe")
    public static int[] field827 = new int[5];

    @ObfuscatedName("client.qv")
    public static int[] field706 = new int[5];

    @ObfuscatedName("client.qx")
    public static short field803 = 256;

    @ObfuscatedName("client.qc")
    public static short field830 = 205;

    @ObfuscatedName("client.qo")
    public static short field849 = 256;

    @ObfuscatedName("client.qz")
    public static short field832 = 320;

    @ObfuscatedName("client.qs")
    public static short field833 = 1;

    @ObfuscatedName("client.qt")
    public static short field834 = 32767;

    @ObfuscatedName("client.qh")
    public static short field835 = 1;

    @ObfuscatedName("client.qj")
    public static short field836 = 32767;

    @ObfuscatedName("client.qm")
    public static int field763 = 0;

    @ObfuscatedName("client.qu")
    public static int field838 = 0;

    @ObfuscatedName("client.qq")
    public static int field839 = 0;

    @ObfuscatedName("client.qb")
    public static int field663 = 0;

    @ObfuscatedName("client.qg")
    public static int field841 = 0;

    @ObfuscatedName("client.qy")
    public static class228 field842 = new class228();

    @ObfuscatedName("client.qw")
    public static int field843 = -1;

    @ObfuscatedName("client.qk")
    public static int field587 = -1;

    @ObfuscatedName("client.qp")
    public static class5[] field845 = new class5[8];

    @ObfuscatedName("client.rr")
    public static class62 field666 = new class62();

    @ObfuscatedName("client.ro")
    public static int field651 = -1;

    @ObfuscatedName("client.rd")
    public static ArrayList field782 = new ArrayList(10);

    @ObfuscatedName("client.rc")
    public static int field607 = 0;

    @ObfuscatedName("client.rl")
    public static final class60 field850 = new class60();

    @ObfuscatedName("client.ru")
    public static int[] field851 = new int[50];

    @ObfuscatedName("client.rg")
    public static int[] field597 = new int[50];

    @ObfuscatedName("o.el(I)Llw;")
    public static class322 method177() {
        return Statics.field477;
    }

    @ObfuscatedName("client.az(I)V")
    public final void method723() {
    }

    public final void init() {
        if (!this.method695()) {
            return;
        }
        class280[] var1 = class280.method917();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class280 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3592);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3592)) {
                    case 2:
                        if (field588 == -1) {
                            field588 = Integer.parseInt(var4);
                        }
                        break;
                    case 3:
                        field778 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field633 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field220 = var4;
                        break;
                    case 6:
                        field630 = Integer.parseInt(var4) != 0;
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class75.field1053)) {
                        }
                        break;
                    case 8:
                        field828 = Integer.parseInt(var4);
                    case 9:
                    case 12:
                    default:
                        break;
                    case 10:
                        Statics.field2014 = var4;
                        break;
                    case 11:
                        Statics.field3347 = class244.method3220(Integer.parseInt(var4));
                        break;
                    case 13:
                        field582 = Integer.parseInt(var4);
                        break;
                    case 14:
                        if (var4.equalsIgnoreCase(class75.field1053)) {
                            field669 = true;
                        } else {
                            field669 = false;
                        }
                        break;
                    case 15:
                        Statics.field1456 = (class245) class178.method1685(class245.method3562(), Integer.parseInt(var4));
                        if (Statics.field1456 == class245.field3146) {
                            Statics.field307 = class323.field3881;
                        } else {
                            Statics.field307 = class323.field3879;
                        }
                        break;
                    case 16:
                        Statics.field1710 = Integer.parseInt(var4);
                }
            }
        }
        method3216();
        Statics.field486 = this.getCodeBase().getHost();
        String var5 = Statics.field3347.field3136;
        byte var6 = 0;
        try {
            class156.method3212("oldschool", var5, var6, 17);
        } catch (Exception var8) {
            class153.method66((String) null, var8);
        }
        Statics.field2335 = this;
        Statics.field1941 = field588;
        this.method699(765, 503, 171);
    }

    @ObfuscatedName("fm.ed(I)V")
    public static final void method3216() {
        class126.field1761 = false;
        field586 = false;
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method776() {
        class184.method3149(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field224 = field778 == 0 ? 43594 : field582 + 40000;
        Statics.field997 = field778 == 0 ? 443 : field582 + 50000;
        Statics.field3637 = Statics.field224;
        Statics.field2576 = class229.field2583;
        Statics.field2573 = class229.field2584;
        Statics.field2578 = class229.field2587;
        Statics.field2579 = class229.field2586;
        Statics.field250 = new class136();
        this.method693();
        this.method712();
        Statics.field295 = this.method690();
        Statics.field303 = new class163(255, class156.field1970, class156.field1971, 500000);
        Statics.field62 = class67.method1734();
        this.method691();
        class46.method5282(this, Statics.field56);
        if (field778 != 0) {
            field598 = true;
        }
        method912(Statics.field62.field958);
        Statics.field2333 = new class68(Statics.field307);
    }

    @ObfuscatedName("client.at(I)V")
    public final void method714() {
        field592++;
        this.method1057();
        class249.method1826();
        try {
            if (class218.field2461 == 1) {
                int var1 = Statics.field2460.method3944();
                if (var1 > 0 && Statics.field2460.method3878()) {
                    int var2 = var1 - Statics.field38;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2460.method3901(var2);
                } else {
                    Statics.field2460.method3877();
                    Statics.field2460.method3875();
                    if (Statics.field1872 == null) {
                        class218.field2461 = 0;
                    } else {
                        class218.field2461 = 2;
                    }
                    Statics.field2286 = null;
                    Statics.field1150 = null;
                }
            }
        } catch (Exception var17) {
            var17.printStackTrace();
            Statics.field2460.method3877();
            class218.field2461 = 0;
            Statics.field2286 = null;
            Statics.field1150 = null;
            Statics.field1872 = null;
        }
        method938();
        class40 var4 = class40.field338;
        synchronized (class40.field338) {
            class40.field354++;
            class40.field351 = class40.field353;
            class40.field350 = 0;
            if (class40.field330 >= 0) {
                while (class40.field345 != class40.field330) {
                    int var6 = class40.field344[class40.field345];
                    class40.field345 = class40.field345 + 1 & 0x7F;
                    if (var6 < 0) {
                        class40.field342[~var6] = false;
                    } else {
                        if (!class40.field342[var6] && class40.field350 < class40.field339.length - 1) {
                            class40.field339[++class40.field350 - 1] = var6;
                        }
                        class40.field342[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class40.field342[var5] = false;
                }
                class40.field330 = class40.field345;
            }
            if (class40.field350 > 0) {
                class40.field354 = 0;
            }
            class40.field353 = class40.field352;
        }
        class49 var8 = class49.field430;
        synchronized (class49.field430) {
            class49.field420 = class49.field425;
            class49.field426 = class49.field423;
            class49.field427 = class49.field424 * -1660309769;
            class49.field432 = class49.field422;
            class49.field433 = class49.field421;
            class49.field429 = class49.field435;
            class49.field434 = class49.field431;
            class49.field422 = 0;
        }
        if (Statics.field295 != null) {
            int var10 = Statics.field295.method588();
            field696 = var10;
        }
        if (field590 == 0) {
            method439();
            Statics.field369.method2967();
            for (int var11 = 0; var11 < 32; var11++) {
                field395[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field405[var12] = 0L;
            }
            Statics.field49 = 0;
        } else if (field590 == 5) {
            class79.method3501(this);
            method439();
            Statics.field369.method2967();
            for (int var13 = 0; var13 < 32; var13++) {
                field395[var13] = 0L;
            }
            for (int var14 = 0; var14 < 32; var14++) {
                field405[var14] = 0L;
            }
            Statics.field49 = 0;
        } else if (field590 == 10 || field590 == 11) {
            class79.method3501(this);
        } else if (field590 == 20) {
            class79.method3501(this);
            this.method1060();
        } else if (field590 == 25) {
            method149();
        }
        if (field590 == 30) {
            this.method1061();
        } else if (field590 == 40 || field590 == 45) {
            this.method1060();
        }
    }

    @ObfuscatedName("client.ai(ZB)V")
    public final void method715(boolean arg0) {
        boolean var2 = class218.method2963();
        if (var2 && field814 && Statics.field245 != null) {
            Statics.field245.method2011();
        }
        if ((field590 == 10 || field590 == 20 || field590 == 30) && field792 != 0L && class185.method3250() > field792) {
            int var3 = field793 ? 2 : 1;
            method912(var3);
        }
        if (arg0) {
            for (int var4 = 0; var4 < 100; var4++) {
                field698[var4] = true;
            }
        }
        if (field590 == 0) {
            this.method717(class79.field1100, class79.field1101, arg0);
        } else if (field590 == 5) {
            class79.method4833(Statics.field3661, Statics.field1937, Statics.field934, arg0);
        } else if (field590 == 10 || field590 == 11) {
            class79.method4833(Statics.field3661, Statics.field1937, Statics.field934, arg0);
        } else if (field590 == 20) {
            class79.method4833(Statics.field3661, Statics.field1937, Statics.field934, arg0);
        } else if (field590 == 25) {
            if (field752 == 1) {
                if (field634 > field635) {
                    field635 = field634;
                }
                int var5 = (field635 * 50 - field634 * 50) / field635;
                method1804(class238.field2801 + class75.field1051 + class75.field1054 + var5 + "%" + class75.field1055, false);
            } else if (field752 == 2) {
                if (field636 > field637) {
                    field637 = field636;
                }
                int var6 = (field637 * 50 - field636 * 50) / field637 + 50;
                method1804(class238.field2801 + class75.field1051 + class75.field1054 + var6 + "%" + class75.field1055, false);
            } else {
                method1804(class238.field2801, false);
            }
        } else if (field590 == 30) {
            this.method1063();
        } else if (field590 == 40) {
            method1804(class238.field2802 + class75.field1051 + class238.field2803, false);
        } else if (field590 == 45) {
            method1804(class238.field2950, false);
        }
        if (field590 == 30 && field791 == 0 && !arg0 && !field793) {
            for (int var7 = 0; var7 < field604; var7++) {
                if (field789[var7]) {
                    Statics.field2015.method671(field787[var7], field788[var7], field642[var7], field790[var7]);
                    field789[var7] = false;
                }
            }
        } else if (field590 > 0) {
            Statics.field2015.method673(0, 0);
            for (int var8 = 0; var8 < field604; var8++) {
                field789[var8] = false;
            }
        }
    }

    @ObfuscatedName("client.ac(I)V")
    public final void method716() {
        if (Statics.field186.method1767()) {
            Statics.field186.method1764();
        }
        if (Statics.field221 != null) {
            Statics.field221.field530 = false;
        }
        Statics.field221 = null;
        field627.method1849();
        if (class40.field338 != null) {
            class40 var1 = class40.field338;
            synchronized (class40.field338) {
                class40.field338 = null;
            }
        }
        class49.method3490();
        Statics.field295 = null;
        if (Statics.field245 != null) {
            Statics.field245.method2012();
        }
        if (Statics.field880 != null) {
            Statics.field880.method2012();
        }
        class251.method4232();
        Object var3 = class249.field3185;
        synchronized (class249.field3185) {
            if (class249.field3180 != 0) {
                class249.field3180 = 1;
                try {
                    class249.field3185.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field250 != null) {
            Statics.field250.method2876();
            Statics.field250 = null;
        }
        try {
            class156.field1970.method2289();
            for (int var6 = 0; var6 < Statics.field1914; var6++) {
                Statics.field1069[var6].method2289();
            }
            class156.field1971.method2289();
            class156.field1969.method2289();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ax.ej(II)V")
    public static void method868(int arg0) {
        if (field590 == arg0) {
            return;
        }
        if (field590 == 0) {
            Statics.field2335.method763();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field616 = 0;
            field617 = 0;
            field618 = 0;
            field805.method4852(arg0);
            if (arg0 != 20) {
                method1872(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field870 != null) {
            Statics.field870.method3041();
            Statics.field870 = null;
        }
        if (field590 == 25) {
            field752 = 0;
            field634 = 0;
            field635 = 1;
            field636 = 0;
            field637 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class79.method1861(Statics.field184, Statics.field2271, true, 0);
        } else if (arg0 == 20) {
            class79.method1861(Statics.field184, Statics.field2271, true, field590 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class79.method1861(Statics.field184, Statics.field2271, false, 4);
        } else {
            class79.method1000();
        }
        field590 = arg0;
    }

    @ObfuscatedName("client.en(I)V")
    public void method1057() {
        if (field590 == 1000) {
            return;
        }
        long var1 = class185.method3250();
        int var3 = (int) (var1 - Statics.field3204);
        Statics.field3204 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class251.field3198 += var3;
        boolean var4;
        if (class251.field3208 == 0 && class251.field3199 == 0 && class251.field3206 == 0 && class251.field3212 == 0) {
            var4 = true;
        } else if (Statics.field3201 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class251.field3198 > 30000) {
                        throw new IOException();
                    }
                    while (class251.field3199 < 200 && class251.field3212 > 0) {
                        class247 var5 = (class247) class251.field3213.method3710();
                        class183 var6 = new class183(4);
                        var6.method3235(1);
                        var6.method3237((int) var5.field2422);
                        Statics.field3201.method3040(var6.field2339, 0, 4);
                        class251.field3200.method3708(var5, var5.field2422);
                        class251.field3212--;
                        class251.field3199++;
                    }
                    while (class251.field3208 < 200 && class251.field3206 > 0) {
                        class247 var7 = (class247) class251.field3203.method3624();
                        class183 var8 = new class183(4);
                        var8.method3235(0);
                        var8.method3237((int) var7.field2422);
                        Statics.field3201.method3040(var8.field2339, 0, 4);
                        var7.method3793();
                        class251.field3207.method3708(var7, var7.field2422);
                        class251.field3206--;
                        class251.field3208++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3201.method3037();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class251.field3198 = 0;
                        byte var11 = 0;
                        if (Statics.field3209 == null) {
                            var11 = 8;
                        } else if (class251.field3211 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class251.field3210.field2340;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3201.method3039(class251.field3210.field2339, class251.field3210.field2340, var12);
                            if (class251.field3214 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class251.field3210.field2339[class251.field3210.field2340 + var13] ^= class251.field3214;
                                }
                            }
                            class251.field3210.field2340 += var12;
                            if (class251.field3210.field2340 < var11) {
                                break;
                            }
                            if (Statics.field3209 == null) {
                                class251.field3210.field2340 = 0;
                                int var14 = class251.field3210.method3247();
                                int var15 = class251.field3210.method3253();
                                int var16 = class251.field3210.method3247();
                                int var17 = class251.field3210.method3374();
                                long var18 = (long) ((var14 << 16) + var15);
                                class247 var20 = (class247) class251.field3200.method3712(var18);
                                Statics.field2392 = true;
                                if (var20 == null) {
                                    var20 = (class247) class251.field3207.method3712(var18);
                                    Statics.field2392 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3209 = var20;
                                Statics.field3714 = new class183(var17 + var21 + Statics.field3209.field3158);
                                Statics.field3714.method3235(var16);
                                Statics.field3714.method3410(var17);
                                class251.field3211 = 8;
                                class251.field3210.field2340 = 0;
                            } else if (class251.field3211 == 0) {
                                if (class251.field3210.field2339[0] == -1) {
                                    class251.field3211 = 1;
                                    class251.field3210.field2340 = 0;
                                } else {
                                    Statics.field3209 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3714.field2339.length - Statics.field3209.field3158;
                            int var23 = 512 - class251.field3211;
                            if (var23 > var22 - Statics.field3714.field2340) {
                                var23 = var22 - Statics.field3714.field2340;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3201.method3039(Statics.field3714.field2339, Statics.field3714.field2340, var23);
                            if (class251.field3214 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3714.field2339[Statics.field3714.field2340 + var24] ^= class251.field3214;
                                }
                            }
                            Statics.field3714.field2340 += var23;
                            class251.field3211 += var23;
                            if (Statics.field3714.field2340 == var22) {
                                if (Statics.field3209.field2422 == 16711935L) {
                                    Statics.field2360 = Statics.field3714;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class250 var26 = class251.field3202[var25];
                                        if (var26 != null) {
                                            Statics.field2360.field2340 = var25 * 8 + 5;
                                            int var27 = Statics.field2360.method3374();
                                            int var28 = Statics.field2360.method3374();
                                            var26.method4342(var27, var28);
                                        }
                                    }
                                } else {
                                    class251.field3197.reset();
                                    class251.field3197.update(Statics.field3714.field2339, 0, var22);
                                    int var29 = (int) class251.field3197.getValue();
                                    if (Statics.field3209.field3157 != var29) {
                                        try {
                                            Statics.field3201.method3041();
                                        } catch (Exception var35) {
                                        }
                                        class251.field3215++;
                                        Statics.field3201 = null;
                                        class251.field3214 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class251.field3215 = 0;
                                    class251.field3216 = 0;
                                    Statics.field3209.field3156.method4347((int) (Statics.field3209.field2422 & 0xFFFFL), Statics.field3714.field2339, (Statics.field3209.field2422 & 0xFF0000L) == 16711680L, Statics.field2392);
                                }
                                Statics.field3209.method3756();
                                if (Statics.field2392) {
                                    class251.field3199--;
                                } else {
                                    class251.field3208--;
                                }
                                class251.field3211 = 0;
                                Statics.field3209 = null;
                                Statics.field3714 = null;
                            } else {
                                if (class251.field3211 != 512) {
                                    break;
                                }
                                class251.field3211 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3201.method3041();
                } catch (Exception var34) {
                }
                class251.field3216++;
                Statics.field3201 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1058();
        }
    }

    @ObfuscatedName("client.ee(I)V")
    public void method1058() {
        if (class251.field3215 >= 4) {
            this.method709("js5crc");
            field590 = 1000;
            return;
        }
        if (class251.field3216 >= 4) {
            if (field590 <= 5) {
                this.method709("js5io");
                field590 = 1000;
                return;
            }
            field769 = 3000;
            class251.field3216 = 3;
        }
        if (--field769 + 1 > 0) {
            return;
        }
        try {
            if (field693 == 0) {
                Statics.field840 = Statics.field393.method3018(Statics.field486, Statics.field3637);
                field693++;
            }
            if (field693 == 1) {
                if (Statics.field840.field1947 == 2) {
                    this.method1059(-1);
                    return;
                }
                if (Statics.field840.field1947 == 1) {
                    field693++;
                }
            }
            if (field693 == 2) {
                if (field630) {
                    Statics.field612 = class158.method832((Socket) Statics.field840.field1945, 40000, 5000);
                } else {
                    Statics.field612 = new class162((Socket) Statics.field840.field1945, Statics.field393, 5000);
                }
                class183 var1 = new class183(5);
                var1.method3235(15);
                var1.method3410(171);
                Statics.field612.method3040(var1.field2339, 0, 5);
                field693++;
                Statics.field2590 = class185.method3250();
            }
            if (field693 == 3) {
                if (Statics.field612.method3037() > 0 || !field630 && field590 <= 5) {
                    int var2 = Statics.field612.method3042();
                    if (var2 != 0) {
                        this.method1059(var2);
                        return;
                    }
                    field693++;
                } else if (class185.method3250() - Statics.field2590 > 30000L) {
                    this.method1059(-2);
                    return;
                }
            }
            if (field693 == 4) {
                class251.method574(Statics.field612, field590 > 20);
                Statics.field840 = null;
                Statics.field612 = null;
                field693 = 0;
                field615 = 0;
            }
        } catch (IOException var4) {
            this.method1059(-3);
        }
    }

    @ObfuscatedName("client.ev(II)V")
    public void method1059(int arg0) {
        Statics.field840 = null;
        Statics.field612 = null;
        field693 = 0;
        if (Statics.field3637 == Statics.field224) {
            Statics.field3637 = Statics.field997;
        } else {
            Statics.field3637 = Statics.field224;
        }
        field615++;
        if (field615 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field590 <= 5) {
                this.method709("js5connect_full");
                field590 = 1000;
            } else {
                field769 = 3000;
            }
        } else if (field615 >= 2 && arg0 == 6) {
            this.method709("js5connect_outofdate");
            field590 = 1000;
        } else if (field615 >= 4) {
            if (field590 <= 5) {
                this.method709("js5connect");
                field590 = 1000;
            } else {
                field769 = 3000;
            }
        }
    }

    @ObfuscatedName("an.ef(Lic;Ljava/lang/String;I)V")
    public static void method489(class250 arg0, String arg1) {
        class53 var2 = new class53(arg0, arg1);
        field782.add(var2);
    }

    @ObfuscatedName("p.fp(I)Z")
    public static boolean method93() {
        if (field782 == null || field607 >= field782.size()) {
            return true;
        }
        while (field607 < field782.size()) {
            class53 var0 = (class53) field782.get(field607);
            if (!var0.method921()) {
                return false;
            }
            field607++;
        }
        return true;
    }

    @ObfuscatedName("aw.fd(B)V")
    public static void method439() {
        if (field610 == 0) {
            Statics.field249 = new class126(4, 104, 104, class51.field460);
            for (int var0 = 0; var0 < 4; var0++) {
                field643[var0] = new class165(104, 104);
            }
            Statics.field1039 = new class319(512, 512);
            class79.field1101 = class238.field2804;
            class79.field1100 = 5;
            field610 = 20;
        } else if (field610 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class123.field1682[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class126.method2689(var1, 500, 800, 512, 334);
            class79.field1101 = class238.field2805;
            class79.field1100 = 10;
            field610 = 30;
        } else if (field610 == 30) {
            Statics.field1080 = method930(0, false, true, true);
            Statics.field327 = method930(1, false, true, true);
            Statics.field1330 = method930(2, true, false, true);
            Statics.field2549 = method930(3, false, true, true);
            Statics.field1853 = method930(4, false, true, true);
            Statics.field3160 = method930(5, true, true, true);
            Statics.field1148 = method930(6, true, true, true);
            Statics.field180 = method930(7, false, true, true);
            Statics.field2271 = method930(8, false, true, true);
            Statics.field3420 = method930(9, false, true, true);
            Statics.field184 = method930(10, false, true, true);
            Statics.field577 = method930(11, false, true, true);
            Statics.field855 = method930(12, false, true, true);
            Statics.field462 = method930(13, true, false, true);
            Statics.field544 = method930(14, false, true, true);
            Statics.field313 = method930(15, false, true, true);
            Statics.field208 = method930(16, true, true, true);
            class79.field1101 = class238.field2806;
            class79.field1100 = 20;
            field610 = 40;
        } else if (field610 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1080.method4341() * 4 / 100;
            int var8 = var7 + Statics.field327.method4341() * 4 / 100;
            int var9 = var8 + Statics.field1330.method4341() * 2 / 100;
            int var10 = var9 + Statics.field2549.method4341() * 2 / 100;
            int var11 = var10 + Statics.field1853.method4341() * 6 / 100;
            int var12 = var11 + Statics.field3160.method4341() * 4 / 100;
            int var13 = var12 + Statics.field1148.method4341() * 2 / 100;
            int var14 = var13 + Statics.field180.method4341() * 58 / 100;
            int var15 = var14 + Statics.field2271.method4341() * 2 / 100;
            int var16 = var15 + Statics.field3420.method4341() * 2 / 100;
            int var17 = var16 + Statics.field184.method4341() * 2 / 100;
            int var18 = var17 + Statics.field577.method4341() * 2 / 100;
            int var19 = var18 + Statics.field855.method4341() * 2 / 100;
            int var20 = var19 + Statics.field462.method4341() * 2 / 100;
            int var21 = var20 + Statics.field544.method4341() * 2 / 100;
            int var22 = var21 + Statics.field313.method4341() * 2 / 100;
            int var23 = var22 + Statics.field208.method4341() * 2 / 100;
            if (var23 == 100) {
                method489(Statics.field1080, "Animations");
                method489(Statics.field327, "Skeletons");
                method489(Statics.field1853, "Sound FX");
                method489(Statics.field3160, "Maps");
                method489(Statics.field1148, "Music Tracks");
                method489(Statics.field180, "Models");
                method489(Statics.field2271, "Sprites");
                method489(Statics.field577, "Music Jingles");
                method489(Statics.field544, "Music Samples");
                method489(Statics.field313, "Music Patches");
                method489(Statics.field208, "World Map");
                class79.field1101 = class238.field2848;
                class79.field1100 = 30;
                field610 = 45;
            } else {
                if (var23 != 0) {
                    class79.field1101 = class238.field2807 + var23 + "%";
                }
                class79.field1100 = 30;
            }
        } else if (field610 == 45) {
            class96.method1590(22050, !field586, 2);
            class219 var24 = new class219();
            var24.method3914(9, 128);
            Statics.field245 = Statics.method1475(Statics.field393, 0, 22050);
            Statics.field245.method2008(var24);
            class250 var25 = Statics.field313;
            class250 var26 = Statics.field544;
            class250 var27 = Statics.field1853;
            Statics.field2285 = var25;
            Statics.field2465 = var26;
            Statics.field2459 = var27;
            Statics.field2460 = var24;
            Statics.field880 = Statics.method1475(Statics.field393, 1, 2048);
            Statics.field311 = new class89();
            Statics.field880.method2008(Statics.field311);
            Statics.field578 = new class103(22050, Statics.field1301);
            class79.field1101 = class238.field2809;
            class79.field1100 = 35;
            field610 = 50;
            Statics.field15 = new class297(Statics.field2271, Statics.field462);
        } else if (field610 == 50) {
            int var28 = class296.method5073().length;
            field632 = Statics.field15.method5079(class296.method5073());
            if (field632.size() < var28) {
                class79.field1101 = class238.field2800 + field632.size() * 100 / var28 + "%";
                class79.field1100 = 40;
            } else {
                Statics.field1937 = (class299) field632.get(class296.field3679);
                Statics.field934 = (class299) field632.get(class296.field3673);
                Statics.field3661 = (class299) field632.get(class296.field3669);
                Statics.field229 = new class325(true);
                class79.field1101 = class238.field2811;
                class79.field1100 = 40;
                field610 = 60;
            }
        } else if (field610 == 60) {
            int var29 = class79.method4060(Statics.field184, Statics.field2271);
            int var30 = class79.method100();
            if (var29 < var30) {
                class79.field1101 = class238.field2812 + var29 * 100 / var30 + "%";
                class79.field1100 = 50;
            } else {
                class79.field1101 = class238.field2958;
                class79.field1100 = 50;
                method868(5);
                field610 = 70;
            }
        } else if (field610 == 70) {
            if (Statics.field1330.method4251()) {
                class273.method258(Statics.field1330);
                class260.method990(Statics.field1330);
                class261.method4460(Statics.field1330, Statics.field180);
                class250 var31 = Statics.field1330;
                class250 var32 = Statics.field180;
                boolean var33 = field586;
                Statics.field3378 = var31;
                Statics.field1802 = var32;
                class269.field3417 = var33;
                class250 var34 = Statics.field1330;
                class250 var35 = Statics.field180;
                Statics.field3491 = var34;
                Statics.field3488 = var35;
                class250 var36 = Statics.field1330;
                Statics.field43 = var36;
                class250 var37 = Statics.field1330;
                class250 var38 = Statics.field180;
                boolean var39 = field669;
                class299 var40 = Statics.field1937;
                Statics.field3425 = var37;
                Statics.field3455 = var38;
                Statics.field3427 = var39;
                Statics.field1213 = Statics.field3425.method4258(10);
                Statics.field3467 = var40;
                class250 var41 = Statics.field1330;
                class250 var42 = Statics.field1080;
                class250 var43 = Statics.field327;
                Statics.field3539 = var41;
                Statics.field3537 = var42;
                Statics.field3538 = var43;
                class250 var44 = Statics.field1330;
                class250 var45 = Statics.field180;
                Statics.field3273 = var44;
                Statics.field3280 = var45;
                class250 var46 = Statics.field1330;
                Statics.field3323 = var46;
                class250 var47 = Statics.field1330;
                Statics.field3 = var47;
                Statics.field3233 = Statics.field3.method4258(16);
                class231.method101(Statics.field2549, Statics.field180, Statics.field2271, Statics.field462);
                class254.method3071(Statics.field1330);
                class250 var48 = Statics.field1330;
                Statics.field3339 = var48;
                class257.method2859(Statics.field1330);
                class250 var49 = Statics.field1330;
                Statics.field3265 = var49;
                class250 var50 = Statics.field1330;
                Statics.field3328 = var50;
                Statics.field186 = new class83();
                class268.method4378(Statics.field1330, Statics.field2271, Statics.field462);
                class262.method2951(Statics.field1330, Statics.field2271);
                class250 var51 = Statics.field1330;
                class250 var52 = Statics.field2271;
                Statics.field3238 = var52;
                if (var51.method4251()) {
                    Statics.field3237 = var51.method4258(35);
                    Statics.field3247 = new class256[Statics.field3237];
                    for (int var53 = 0; var53 < Statics.field3237; var53++) {
                        byte[] var54 = var51.method4247(35, var53);
                        if (var54 != null) {
                            Statics.field3247[var53] = new class256(var53);
                            Statics.field3247[var53].method4425(new class183(var54));
                            Statics.field3247[var53].method4437();
                        }
                    }
                }
                class79.field1101 = class238.field2815;
                class79.field1100 = 60;
                field610 = 80;
            } else {
                class79.field1101 = class238.field2814 + Statics.field1330.method4367() + "%";
                class79.field1100 = 60;
            }
        } else if (field610 == 80) {
            int var55 = 0;
            if (Statics.field1792 == null) {
                Statics.field1792 = class320.method2897(Statics.field2271, "compass", "");
            } else {
                var55++;
            }
            if (Statics.field1863 == null) {
                Statics.field1863 = class320.method2897(Statics.field2271, "mapedge", "");
            } else {
                var55++;
            }
            if (Statics.field215 == null) {
                Statics.field215 = class320.method114(Statics.field2271, "mapscene", "");
            } else {
                var55++;
            }
            if (Statics.field1920 == null) {
                Statics.field1920 = class320.method260(Statics.field2271, "headicons_pk", "");
            } else {
                var55++;
            }
            if (Statics.field370 == null) {
                Statics.field370 = class320.method260(Statics.field2271, "headicons_prayer", "");
            } else {
                var55++;
            }
            if (Statics.field1927 == null) {
                Statics.field1927 = class320.method260(Statics.field2271, "headicons_hint", "");
            } else {
                var55++;
            }
            if (Statics.field1447 == null) {
                Statics.field1447 = class320.method260(Statics.field2271, "mapmarker", "");
            } else {
                var55++;
            }
            if (Statics.field1998 == null) {
                Statics.field1998 = class320.method260(Statics.field2271, "cross", "");
            } else {
                var55++;
            }
            if (Statics.field315 == null) {
                Statics.field315 = class320.method260(Statics.field2271, "mapdots", "");
            } else {
                var55++;
            }
            if (Statics.field3140 == null) {
                Statics.field3140 = class320.method114(Statics.field2271, "scrollbar", "");
            } else {
                var55++;
            }
            if (Statics.field3882 == null) {
                Statics.field3882 = class320.method114(Statics.field2271, "mod_icons", "");
            } else {
                var55++;
            }
            if (var55 < 11) {
                class79.field1101 = class238.field2816 + var55 * 100 / 12 + "%";
                class79.field1100 = 70;
            } else {
                Statics.field3699 = Statics.field3882;
                Statics.field1863.method5403();
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 41.0D) - 20;
                Statics.field215[0].method5382(var56 + var59, var57 + var59, var58 + var59);
                class79.field1101 = class238.field2817;
                class79.field1100 = 70;
                field610 = 90;
            }
        } else if (field610 == 90) {
            if (Statics.field3420.method4251()) {
                Statics.field251 = new class112(Statics.field3420, Statics.field2271, 20, 0.8D, field586 ? 64 : 128);
                class123.method2585(Statics.field251);
                class123.method2626(0.8D);
                field610 = 100;
            } else {
                class79.field1101 = class238.field2810 + "0%";
                class79.field1100 = 90;
            }
        } else if (field610 == 100) {
            int var60 = Statics.field251.method2326();
            if (var60 < 100) {
                class79.field1101 = class238.field2810 + var60 + "%";
                class79.field1100 = 90;
            } else {
                class79.field1101 = class238.field2819;
                class79.field1100 = 90;
                field610 = 110;
            }
        } else if (field610 == 110) {
            Statics.field221 = new class58();
            Statics.field393.method3008(Statics.field221, 10);
            class79.field1101 = class238.field2820;
            class79.field1100 = 92;
            field610 = 120;
        } else if (field610 == 120) {
            if (Statics.field184.method4268("huffman", "")) {
                class175 var61 = new class175(Statics.field184.method4306("huffman", ""));
                class301.method3232(var61);
                class79.field1101 = class238.field2822;
                class79.field1100 = 94;
                field610 = 130;
            } else {
                class79.field1101 = class238.field2890 + "%";
                class79.field1100 = 94;
            }
        } else if (field610 == 130) {
            if (!Statics.field2549.method4251()) {
                class79.field1101 = class238.field2823 + Statics.field2549.method4367() * 4 / 5 + "%";
                class79.field1100 = 96;
            } else if (!Statics.field855.method4251()) {
                class79.field1101 = class238.field2823 + (80 + Statics.field855.method4367() / 6) + "%";
                class79.field1100 = 96;
            } else if (Statics.field462.method4251()) {
                class79.field1101 = class238.field2824;
                class79.field1100 = 98;
                field610 = 140;
            } else {
                class79.field1101 = class238.field2823 + (96 + Statics.field462.method4367() / 50) + "%";
                class79.field1100 = 96;
            }
        } else if (field610 == 140) {
            class79.field1100 = 100;
            if (Statics.field208.method4326(class30.field253.field256)) {
                if (Statics.field477 == null) {
                    Statics.field477 = new class322();
                    Statics.field477.method5560(Statics.field208, Statics.field3661, field632, Statics.field215);
                }
                int var62 = Statics.field477.method5654();
                if (var62 < 100) {
                    class79.field1101 = class238.field2825 + (var62 * 9 / 10 + 10) + "%";
                } else {
                    class79.field1101 = class238.field3056;
                    field610 = 150;
                }
            } else {
                class79.field1101 = class238.field2825 + Statics.field208.method4309(class30.field253.field256) / 10 + "%";
            }
        } else if (field610 == 150) {
            method868(10);
        }
    }

    @ObfuscatedName("bp.fa(IZZZB)Lic;")
    public static class250 method930(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class163 var4 = null;
        if (class156.field1970 != null) {
            var4 = new class163(arg0, class156.field1970, Statics.field1069[arg0], 1000000);
        }
        return new class250(var4, Statics.field303, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1060() {
        class158 var1 = field627.method1850();
        class190 var2 = field627.field1220;
        try {
            if (field616 == 0) {
                if (var1 != null) {
                    var1.method3041();
                    var1 = null;
                }
                Statics.field2557 = null;
                field757 = false;
                field617 = 0;
                field616 = 1;
            }
            if (field616 == 1) {
                if (Statics.field2557 == null) {
                    Statics.field2557 = Statics.field393.method3018(Statics.field486, Statics.field3637);
                }
                if (Statics.field2557.field1947 == 2) {
                    throw new IOException();
                }
                if (Statics.field2557.field1947 == 1) {
                    if (field630) {
                        var1 = class158.method832((Socket) Statics.field2557.field1945, 40000, 5000);
                    } else {
                        var1 = new class162((Socket) Statics.field2557.field1945, Statics.field393, 5000);
                    }
                    field627.method1864(var1);
                    Statics.field2557 = null;
                    field616 = 2;
                }
            }
            if (field616 == 2) {
                field627.method1845();
                class173 var3 = class173.method1432();
                var3.field2258.method3235(class171.field2238.field2240);
                field627.method1847(var3);
                field627.method1846();
                var2.field2340 = 0;
                field616 = 3;
            }
            if (field616 == 3) {
                if (Statics.field245 != null) {
                    Statics.field245.method2010();
                }
                if (Statics.field880 != null) {
                    Statics.field880.method2010();
                }
                boolean var4 = true;
                if (field630 && !var1.method3046(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method3042();
                    if (Statics.field245 != null) {
                        Statics.field245.method2010();
                    }
                    if (Statics.field880 != null) {
                        Statics.field880.method2010();
                    }
                    if (var5 != 0) {
                        method500(var5);
                        return;
                    }
                    var2.field2340 = 0;
                    field616 = 4;
                }
            }
            if (field616 == 4) {
                if (var2.field2340 < 8) {
                    int var6 = var1.method3037();
                    if (var6 > 8 - var2.field2340) {
                        var6 = 8 - var2.field2340;
                    }
                    if (var6 > 0) {
                        var1.method3039(var2.field2339, var2.field2340, var6);
                        var2.field2340 += var6;
                    }
                }
                if (var2.field2340 == 8) {
                    var2.field2340 = 0;
                    Statics.field2536 = var2.method3257();
                    field616 = 5;
                }
            }
            if (field616 == 5) {
                field627.field1220.field2340 = 0;
                field627.method1845();
                class190 var7 = new class190(500);
                int[] var8 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field2536 >> 32), (int) (Statics.field2536 & 0xFFFFFFFFFFFFFFFFL) };
                var7.field2340 = 0;
                var7.method3235(1);
                var7.method3235(field620.method142());
                var7.method3410(var8[0]);
                var7.method3410(var8[1]);
                var7.method3410(var8[2]);
                var7.method3410(var8[3]);
                switch(field620.field1910) {
                    case 0:
                    case 1:
                        var7.method3237(Statics.field105);
                        var7.field2340 += 5;
                        break;
                    case 2:
                        var7.field2340 += 8;
                        break;
                    case 3:
                        var7.method3410((Integer) Statics.field62.field964.get(class306.method36(class79.field1107)));
                        var7.field2340 += 4;
                }
                var7.method3402(class79.field1087);
                var7.method3274(class77.field1072, class77.field1070);
                class173 var9 = class173.method1432();
                var9.field2258.field2340 = 0;
                if (field590 == 40) {
                    var9.field2258.method3235(class171.field2239.field2240);
                } else {
                    var9.field2258.method3235(class171.field2236.field2240);
                }
                var9.field2258.method3458(0);
                int var10 = var9.field2258.field2340;
                var9.field2258.method3410(171);
                var9.field2258.method3245(var7.field2339, 0, var7.field2340);
                int var11 = var9.field2258.field2340;
                var9.field2258.method3402(class79.field1107);
                var9.field2258.method3235((field793 ? 1 : 0) << 1 | (field586 ? 1 : 0));
                var9.field2258.method3458(Statics.field1180);
                var9.field2258.method3458(Statics.field3139);
                class190 var12 = var9.field2258;
                if (field621 == null) {
                    byte[] var13 = new byte[24];
                    try {
                        class156.field1969.method2272(0L);
                        class156.field1969.method2274(var13);
                        int var14;
                        for (var14 = 0; var14 < 24 && var13[var14] == 0; var14++) {
                        }
                        if (var14 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var51) {
                        for (int var16 = 0; var16 < 24; var16++) {
                            var13[var16] = -1;
                        }
                    }
                    var12.method3245(var13, 0, var13.length);
                } else {
                    var12.method3245(field621, 0, field621.length);
                }
                var9.field2258.method3402(Statics.field2014);
                var9.field2258.method3410(Statics.field1710);
                class183 var19 = new class183(Statics.field229.method5775());
                Statics.field229.method5777(var19);
                var9.field2258.method3245(var19.field2339, 0, var19.field2339.length);
                var9.field2258.method3235(field588);
                var9.field2258.method3410(0);
                var9.field2258.method3410(Statics.field1080.field3176);
                var9.field2258.method3410(Statics.field327.field3176);
                var9.field2258.method3410(Statics.field1330.field3176);
                var9.field2258.method3410(Statics.field2549.field3176);
                var9.field2258.method3410(Statics.field1853.field3176);
                var9.field2258.method3410(Statics.field3160.field3176);
                var9.field2258.method3410(Statics.field1148.field3176);
                var9.field2258.method3410(Statics.field180.field3176);
                var9.field2258.method3410(Statics.field2271.field3176);
                var9.field2258.method3410(Statics.field3420.field3176);
                var9.field2258.method3410(Statics.field184.field3176);
                var9.field2258.method3410(Statics.field577.field3176);
                var9.field2258.method3410(Statics.field855.field3176);
                var9.field2258.method3410(Statics.field462.field3176);
                var9.field2258.method3410(Statics.field544.field3176);
                var9.field2258.method3410(Statics.field313.field3176);
                var9.field2258.method3410(Statics.field208.field3176);
                var9.field2258.method3272(var8, var11, var9.field2258.field2340);
                var9.field2258.method3317(var9.field2258.field2340 - var10);
                field627.method1847(var9);
                field627.method1846();
                field627.field1219 = new class191(var8);
                for (int var20 = 0; var20 < 4; var20++) {
                    var8[var20] += 50;
                }
                var2.method3528(var8);
                field616 = 6;
            }
            if (field616 == 6 && var1.method3037() > 0) {
                int var21 = var1.method3042();
                if (var21 == 21 && field590 == 20) {
                    field616 = 7;
                } else if (var21 == 2) {
                    field616 = 9;
                } else if (var21 == 15 && field590 == 40) {
                    field627.field1226 = -1;
                    field616 = 13;
                } else if (var21 == 23 && field618 < 1) {
                    field618++;
                    field616 = 0;
                } else if (var21 == 29) {
                    field616 = 11;
                } else {
                    method500(var21);
                    return;
                }
            }
            if (field616 == 7 && var1.method3037() > 0) {
                field619 = (var1.method3042() + 3) * 60;
                field616 = 8;
            }
            if (field616 == 8) {
                field617 = 0;
                class79.method23(class238.field2830, class238.field2999, field619 / 60 + class238.field2832);
                if (--field619 <= 0) {
                    field616 = 0;
                }
            } else {
                if (field616 == 9 && var1.method3037() >= 13) {
                    boolean var22 = var1.method3042() == 1;
                    var1.method3039(var2.field2339, 0, 4);
                    var2.field2340 = 0;
                    boolean var23 = false;
                    if (var22) {
                        int var24 = var2.method3512() << 24;
                        int var25 = var24 | var2.method3512() << 16;
                        int var26 = var25 | var2.method3512() << 8;
                        int var27 = var26 | var2.method3512();
                        int var28 = class306.method36(class79.field1107);
                        if (Statics.field62.field964.size() >= 10 && !Statics.field62.field964.containsKey(var28)) {
                            Iterator var29 = Statics.field62.field964.entrySet().iterator();
                            var29.next();
                            var29.remove();
                        }
                        Statics.field62.field964.put(var28, var27);
                    }
                    if (class79.field1109) {
                        Statics.field62.field960 = class79.field1107;
                    } else {
                        Statics.field62.field960 = null;
                    }
                    class67.method939();
                    field748 = var1.method3042();
                    field777 = var1.method3042() == 1;
                    field629 = var1.method3042();
                    field629 <<= 0x8;
                    field629 += var1.method3042();
                    field699 = var1.method3042();
                    var1.method3039(var2.field2339, 0, 1);
                    var2.field2340 = 0;
                    class169[] var30 = new class169[] { class169.field2101, class169.field2051, class169.field2052, class169.field2071, class169.field2054, class169.field2055, class169.field2056, class169.field2123, class169.field2084, class169.field2066, class169.field2060, class169.field2061, class169.field2062, class169.field2063, class169.field2064, class169.field2107, class169.field2108, class169.field2070, class169.field2129, class169.field2106, class169.field2117, class169.field2112, class169.field2072, class169.field2073, class169.field2115, class169.field2075, class169.field2076, class169.field2059, class169.field2078, class169.field2079, class169.field2132, class169.field2081, class169.field2082, class169.field2128, class169.field2080, class169.field2085, class169.field2086, class169.field2087, class169.field2088, class169.field2089, class169.field2090, class169.field2091, class169.field2092, class169.field2093, class169.field2094, class169.field2077, class169.field2096, class169.field2097, class169.field2098, class169.field2099, class169.field2100, class169.field2083, class169.field2102, class169.field2103, class169.field2095, class169.field2105, class169.field2068, class169.field2065, class169.field2120, class169.field2109, class169.field2110, class169.field2050, class169.field2069, class169.field2113, class169.field2114, class169.field2130, class169.field2116, class169.field2074, class169.field2118, class169.field2119, class169.field2125, class169.field2121, class169.field2122, class169.field2104, class169.field2124, class169.field2067, class169.field2126, class169.field2131, class169.field2127, class169.field2058, class169.field2057, class169.field2111, class169.field2053, class169.field2133 };
                    int var32 = var2.method3533();
                    if (var32 < 0 || var32 >= var30.length) {
                        throw new IOException(var32 + " " + var2.field2340);
                    }
                    field627.field1221 = var30[var32];
                    field627.field1226 = field627.field1221.field2135;
                    var1.method3039(var2.field2339, 0, 2);
                    var2.field2340 = 0;
                    field627.field1226 = var2.method3253();
                    try {
                        class42.method623(Statics.field2335, "zap");
                    } catch (Throwable var50) {
                    }
                    field616 = 10;
                }
                if (field616 != 10) {
                    if (field616 == 11 && var1.method3037() >= 2) {
                        var2.field2340 = 0;
                        var1.method3039(var2.field2339, 0, 2);
                        var2.field2340 = 0;
                        Statics.field3193 = var2.method3253();
                        field616 = 12;
                    }
                    if (field616 == 12 && var1.method3037() >= Statics.field3193) {
                        var2.field2340 = 0;
                        var1.method3039(var2.field2339, 0, Statics.field3193);
                        var2.field2340 = 0;
                        String var45 = var2.method3441();
                        String var46 = var2.method3441();
                        String var47 = var2.method3441();
                        class79.method23(var45, var46, var47);
                        method868(10);
                    }
                    if (field616 == 13) {
                        if (field627.field1226 == -1) {
                            if (var1.method3037() < 2) {
                                return;
                            }
                            var1.method3039(var2.field2339, 0, 2);
                            var2.field2340 = 0;
                            field627.field1226 = var2.method3253();
                        }
                        if (var1.method3037() >= field627.field1226) {
                            var1.method3039(var2.field2339, 0, field627.field1226);
                            var2.field2340 = 0;
                            int var48 = field627.field1226;
                            field805.method4855();
                            method445();
                            Statics.method582(var2);
                            if (var2.field2340 != var48) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field617++;
                        if (field617 > 2000) {
                            if (field618 < 1) {
                                if (Statics.field3637 == Statics.field224) {
                                    Statics.field3637 = Statics.field997;
                                } else {
                                    Statics.field3637 = Statics.field224;
                                }
                                field618++;
                                field616 = 0;
                            } else {
                                method500(-3);
                            }
                        }
                    }
                } else if (var1.method3037() >= field627.field1226) {
                    var2.field2340 = 0;
                    var1.method3039(var2.field2339, 0, field627.field1226);
                    field805.method4853();
                    field593 = 1L;
                    field596 = -1;
                    Statics.field221.field523 = 0;
                    Statics.field147 = true;
                    field848 = true;
                    field723 = -1L;
                    class314.method5265();
                    field627.method1845();
                    field627.field1220.field2340 = 0;
                    field627.field1221 = null;
                    field627.field1216 = null;
                    field627.field1227 = null;
                    field627.field1228 = null;
                    field627.field1226 = 0;
                    field627.field1229 = 0;
                    field599 = 0;
                    field628 = 0;
                    field600 = 0;
                    field772 = 0;
                    field717 = false;
                    class49.method1737(0);
                    class84.method3159();
                    field734 = 0;
                    field786 = false;
                    field657 = 0;
                    field718 = 0;
                    field656 = 0;
                    Statics.field176 = null;
                    field811 = 0;
                    field652 = -1;
                    field809 = 0;
                    field810 = 0;
                    field608 = class78.field1075;
                    field781 = class78.field1075;
                    field623 = 0;
                    class82.method2358();
                    for (int var34 = 0; var34 < 2048; var34++) {
                        field611[var34] = null;
                    }
                    for (int var35 = 0; var35 < 32768; var35++) {
                        field844[var35] = null;
                    }
                    field708 = -1;
                    field711.method3764();
                    field712.method3764();
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 104; var37++) {
                            for (int var38 = 0; var38 < 104; var38++) {
                                field709[var36][var37][var38] = null;
                            }
                        }
                    }
                    field715 = new class206();
                    Statics.field2333.method1521();
                    for (int var39 = 0; var39 < Statics.field3233; var39++) {
                        class255 var40 = Statics.method1442(var39);
                        if (var40 != null) {
                            class226.field2560[var39] = 0;
                            class226.field2559[var39] = 0;
                        }
                    }
                    Statics.field186.method1762();
                    field749 = -1;
                    if (field684 != -1) {
                        class231.method1515(field684);
                    }
                    for (class56 var41 = (class56) field742.method3710(); var41 != null; var41 = (class56) field742.method3711()) {
                        method242(var41, true);
                    }
                    field684 = -1;
                    field742 = new class203(8);
                    field745 = null;
                    field772 = 0;
                    field717 = false;
                    field842.method4096((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var42 = 0; var42 < 8; var42++) {
                        field705[var42] = null;
                        field710[var42] = false;
                    }
                    class54.field475 = new class203(32);
                    field626 = true;
                    for (int var43 = 0; var43 < 100; var43++) {
                        field698[var43] = true;
                    }
                    method1497();
                    Statics.field95 = null;
                    for (int var44 = 0; var44 < 8; var44++) {
                        field845[var44] = new class5();
                    }
                    Statics.field155 = null;
                    Statics.method582(var2);
                    Statics.field225 = -1;
                    method915(false, var2);
                    field627.field1221 = null;
                }
            }
        } catch (IOException var52) {
            if (field618 < 1) {
                if (Statics.field3637 == Statics.field224) {
                    Statics.field3637 = Statics.field997;
                } else {
                    Statics.field3637 = Statics.field224;
                }
                field618++;
                field616 = 0;
            } else {
                method500(-2);
            }
        }
    }

    @ObfuscatedName("ak.fu(B)V")
    public static void method445() {
        field627.method1845();
        field627.field1220.field2340 = 0;
        field627.field1221 = null;
        field627.field1216 = null;
        field627.field1227 = null;
        field627.field1228 = null;
        field627.field1226 = 0;
        field627.field1229 = 0;
        field599 = 0;
        field772 = 0;
        field717 = false;
        field811 = 0;
        field809 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field611[var0] = null;
        }
        Statics.field1877 = null;
        for (int var1 = 0; var1 < field844.length; var1++) {
            class73 var2 = field844[var1];
            if (var2 != null) {
                var2.field898 = -1;
                var2.field899 = false;
            }
        }
        class54.field475 = new class203(32);
        method868(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field698[var3] = true;
        }
        class173 var4 = Statics.method414(class170.field2216, field627.field1219);
        class190 var5 = var4.field2258;
        int var6 = field793 ? 2 : 1;
        var5.method3235(var6);
        var4.field2258.method3458(Statics.field1180);
        var4.field2258.method3458(Statics.field3139);
        field627.method1847(var4);
    }

    @ObfuscatedName("ao.fr(II)V")
    public static void method500(int arg0) {
        if (arg0 == -3) {
            class79.method23(class238.field3058, class238.field2834, class238.field2813);
        } else if (arg0 == -2) {
            class79.method23(class238.field2836, class238.field3046, class238.field3024);
        } else if (arg0 == -1) {
            class79.method23(class238.field2839, class238.field2840, class238.field2933);
        } else if (arg0 == 3) {
            class79.field1082 = 3;
        } else if (arg0 == 4) {
            class79.method23(class238.field2829, class238.field2843, class238.field2844);
        } else if (arg0 == 5) {
            class79.method23(class238.field2845, class238.field2886, class238.field2847);
        } else if (arg0 == 6) {
            class79.method23(class238.field3061, class238.field2849, class238.field2850);
        } else if (arg0 == 7) {
            class79.method23(class238.field2851, class238.field2852, class238.field2853);
        } else if (arg0 == 8) {
            class79.method23(class238.field2854, class238.field3013, class238.field2856);
        } else if (arg0 == 9) {
            class79.method23(class238.field2857, class238.field2858, class238.field2859);
        } else if (arg0 == 10) {
            class79.method23(class238.field2860, class238.field2879, class238.field2862);
        } else if (arg0 == 11) {
            class79.method23(class238.field2863, class238.field2864, class238.field2865);
        } else if (arg0 == 12) {
            class79.method23(class238.field2881, class238.field2867, class238.field3011);
        } else if (arg0 == 13) {
            class79.method23(class238.field2869, class238.field2943, class238.field2989);
        } else if (arg0 == 14) {
            class79.method23(class238.field2965, class238.field2873, class238.field2874);
        } else if (arg0 == 16) {
            class79.method23(class238.field3044, class238.field2876, class238.field2799);
        } else if (arg0 == 17) {
            class79.method23(class238.field3080, class238.field2842, class238.field2880);
        } else if (arg0 == 18) {
            class79.method23(class238.field2835, class238.field2949, class238.field2883);
        } else if (arg0 == 19) {
            class79.method23(class238.field2884, class238.field2885, class238.field2986);
        } else if (arg0 == 20) {
            class79.method23(class238.field2887, class238.field2955, class238.field2889);
        } else if (arg0 == 22) {
            class79.method23(class238.field2877, class238.field2891, class238.field2892);
        } else if (arg0 == 23) {
            class79.method23(class238.field2861, class238.field2894, class238.field2895);
        } else if (arg0 == 24) {
            class79.method23(class238.field2896, class238.field2897, class238.field2898);
        } else if (arg0 == 25) {
            class79.method23(class238.field2899, class238.field2913, class238.field2901);
        } else if (arg0 == 26) {
            class79.method23(class238.field2902, class238.field2903, class238.field2904);
        } else if (arg0 == 27) {
            class79.method23(class238.field2905, class238.field3010, class238.field2907);
        } else if (arg0 == 31) {
            class79.method23(class238.field2846, class238.field2837, class238.field2916);
        } else if (arg0 == 32) {
            class79.method23(class238.field2906, class238.field2918, class238.field3054);
        } else if (arg0 == 37) {
            class79.method23(class238.field2920, class238.field2921, class238.field2922);
        } else if (arg0 == 38) {
            class79.method23(class238.field2923, class238.field2868, class238.field2925);
        } else if (arg0 == 55) {
            class79.field1082 = 8;
        } else if (arg0 == 56) {
            class79.method23(class238.field2930, class238.field2931, class238.field2932);
            method868(11);
            return;
        } else if (arg0 == 57) {
            class79.method23(class238.field2919, class238.field2934, class238.field2935);
            method868(11);
            return;
        } else if (arg0 == 61) {
            class79.field1082 = 7;
        } else {
            class79.method23(class238.field2936, class238.field2821, class238.field2938);
        }
        method868(10);
    }

    @ObfuscatedName("ci.ff(I)V")
    public static final void method2057() {
        field627.method1849();
        method941();
        Statics.field249.method2699();
        for (int var0 = 0; var0 < 4; var0++) {
            field643[var0].method3098();
        }
        System.gc();
        class218.method408(2);
        field813 = -1;
        field814 = false;
        for (class69 var1 = (class69) class69.field986.method3790(); var1 != null; var1 = (class69) class69.field986.method3771()) {
            if (var1.field994 != null) {
                Statics.field311.method1876(var1.field994);
                var1.field994 = null;
            }
            if (var1.field981 != null) {
                Statics.field311.method1876(var1.field981);
                var1.field981 = null;
            }
        }
        class69.field986.method3764();
        method868(10);
    }

    @ObfuscatedName("bi.fc(I)V")
    public static final void method941() {
        class273.method636();
        class260.field3283.method3676();
        class261.field3292.method3676();
        class269.method35();
        class272.field3489.method3676();
        class272.field3490.method3676();
        class270.method957();
        class274.field3553.method3676();
        class274.field3540.method3676();
        class259.field3268.method3676();
        class259.field3266.method3676();
        class264.field3322.method3676();
        class255.field3232.method3676();
        class268.field3350.method3676();
        class268.field3357.method3676();
        class268.field3352.method3676();
        class262.field3306.method3676();
        class262.field3307.method3676();
        class266.field3335.method3676();
        class265.field3329.method3676();
        class256.method3147();
        class228.method3563();
        class231.method1591();
        ((class112) Statics.field1668).method2357();
        class85.field1191.method3676();
        Statics.field1080.method4262();
        Statics.field327.method4262();
        Statics.field2549.method4262();
        Statics.field1853.method4262();
        Statics.field3160.method4262();
        Statics.field1148.method4262();
        Statics.field180.method4262();
        Statics.field2271.method4262();
        Statics.field3420.method4262();
        Statics.field184.method4262();
        Statics.field577.method4262();
        Statics.field855.method4262();
    }

    @ObfuscatedName("ak.fk(I)V")
    public static final void method477() {
        if (field628 > 0) {
            method2057();
        } else {
            field805.method4868();
            method868(40);
            Statics.field870 = field627.method1850();
            field627.method1851();
        }
    }

    @ObfuscatedName("cf.fh(ZI)V")
    public static final void method1872(boolean arg0) {
        if (arg0) {
            field620 = class79.field1105 ? class147.field1911 : class147.field1906;
        } else {
            field620 = Statics.field62.field964.containsKey(class306.method36(class79.field1107)) ? class147.field1909 : class147.field1908;
        }
    }

    @ObfuscatedName("client.fw(B)V")
    public final void method1061() {
        if (field599 > 1) {
            field599--;
        }
        if (field628 > 0) {
            field628--;
        }
        if (field757) {
            field757 = false;
            method477();
            return;
        }
        if (!field717) {
            method998();
        }
        for (int var1 = 0; var1 < 100 && this.method1064(field627); var1++) {
        }
        if (field590 != 30) {
            return;
        }
        while (true) {
            class313 var2 = (class313) class314.field3760.method3740();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field805.field3598) {
                    class173 var6 = Statics.method414(class170.field2202, field627.field1219);
                    var6.field2258.method3235(0);
                    int var7 = var6.field2258.field2340;
                    field805.method4851(var6.field2258);
                    var6.field2258.method3248(var6.field2258.field2340 - var7);
                    field627.method1847(var6);
                    field805.method4854();
                }
                Object var8 = Statics.field221.field524;
                synchronized (Statics.field221.field524) {
                    if (!field581) {
                        Statics.field221.field523 = 0;
                    } else if (class49.field432 != 0 || Statics.field221.field523 >= 40) {
                        class173 var9 = Statics.method414(class170.field2229, field627.field1219);
                        var9.field2258.method3235(0);
                        int var10 = var9.field2258.field2340;
                        int var11 = 0;
                        for (int var12 = 0; var12 < Statics.field221.field523 && var9.field2258.field2340 - var10 < 240; var12++) {
                            var11++;
                            int var13 = Statics.field221.field527[var12];
                            if (var13 < 0) {
                                var13 = 0;
                            } else if (var13 > 502) {
                                var13 = 502;
                            }
                            int var14 = Statics.field221.field526[var12];
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 764) {
                                var14 = 764;
                            }
                            int var15 = var13 * 765 + var14;
                            if (Statics.field221.field527[var12] == -1 && Statics.field221.field526[var12] == -1) {
                                var14 = -1;
                                var13 = -1;
                                var15 = 524287;
                            }
                            if (field594 != var14 || field595 != var13) {
                                int var16 = var14 - field594;
                                field594 = var14;
                                int var17 = var13 - field595;
                                field595 = var13;
                                if (field596 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                    var16 += 32;
                                    var17 += 32;
                                    var9.field2258.method3458((field596 << 12) + (var16 << 6) + var17);
                                    field596 = 0;
                                } else if (field596 < 8) {
                                    var9.field2258.method3237((field596 << 19) + 8388608 + var15);
                                    field596 = 0;
                                } else {
                                    var9.field2258.method3410((field596 << 19) + -1073741824 + var15);
                                    field596 = 0;
                                }
                            } else if (field596 < 2047) {
                                field596++;
                            }
                        }
                        var9.field2258.method3248(var9.field2258.field2340 - var10);
                        field627.method1847(var9);
                        if (var11 >= Statics.field221.field523) {
                            Statics.field221.field523 = 0;
                        } else {
                            Statics.field221.field523 -= var11;
                            for (int var18 = 0; var18 < Statics.field221.field523; var18++) {
                                Statics.field221.field526[var18] = Statics.field221.field526[var11 + var18];
                                Statics.field221.field527[var18] = Statics.field221.field527[var11 + var18];
                            }
                        }
                    }
                }
                if (class49.field432 == 1 || !Statics.field3230 && class49.field432 == 4 || class49.field432 == 2) {
                    long var20 = (class49.field434 - field593 * -1L) / 50L;
                    if (var20 > 4095L) {
                        var20 = 4095L;
                    }
                    field593 = class49.field434 * -1L;
                    int var22 = class49.field429;
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 > Statics.field3139) {
                        var22 = Statics.field3139;
                    }
                    int var23 = class49.field433;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > Statics.field1180) {
                        var23 = Statics.field1180;
                    }
                    int var24 = (int) var20;
                    class173 var25 = Statics.method414(class170.field2189, field627.field1219);
                    var25.field2258.method3458((class49.field432 == 2 ? 1 : 0) + (var24 << 1));
                    var25.field2258.method3458(var23);
                    var25.field2258.method3458(var22);
                    field627.method1847(var25);
                }
                if (class40.field350 > 0) {
                    class173 var26 = Statics.method414(class170.field2219, field627.field1219);
                    var26.field2258.method3458(0);
                    int var27 = var26.field2258.field2340;
                    long var28 = class185.method3250();
                    for (int var30 = 0; var30 < class40.field350; var30++) {
                        long var31 = var28 - field723;
                        if (var31 > 16777215L) {
                            var31 = 16777215L;
                        }
                        field723 = var28;
                        var26.field2258.method3235(class40.field339[var30]);
                        var26.field2258.method3434((int) var31);
                    }
                    var26.field2258.method3317(var26.field2258.field2340 - var27);
                    field627.method1847(var26);
                }
                if (field665 > 0) {
                    field665--;
                }
                if (class40.field342[96] || class40.field342[97] || class40.field342[98] || class40.field342[99]) {
                    field808 = true;
                }
                if (field808 && field665 <= 0) {
                    field665 = 20;
                    field808 = false;
                    class173 var33 = Statics.method414(class170.field2184, field627.field1219);
                    var33.field2258.method3285(field650);
                    var33.field2258.method3458(field718);
                    field627.method1847(var33);
                }
                if (Statics.field147 && !field848) {
                    field848 = true;
                    class173 var34 = Statics.method414(class170.field2228, field627.field1219);
                    var34.field2258.method3235(1);
                    field627.method1847(var34);
                }
                if (!Statics.field147 && field848) {
                    field848 = false;
                    class173 var35 = Statics.method414(class170.field2228, field627.field1219);
                    var35.field2258.method3235(0);
                    field627.method1847(var35);
                }
                if (Statics.field477 != null) {
                    Statics.field477.method5573();
                }
                if (Statics.field490) {
                    if (Statics.field95 != null) {
                        Statics.field95.method4943();
                    }
                    for (int var36 = 0; var36 < class82.field1168; var36++) {
                        class61 var37 = field611[class82.field1160[var36]];
                        var37.method1007();
                    }
                    Statics.field490 = false;
                }
                method1765();
                if (field590 != 30) {
                    return;
                }
                for (class63 var38 = (class63) field715.method3790(); var38 != null; var38 = (class63) field715.method3771()) {
                    if (var38.field861 > 0) {
                        var38.field861--;
                    }
                    if (var38.field861 == 0) {
                        if (var38.field860 >= 0) {
                            int var39 = var38.field860;
                            int var40 = var38.field867;
                            class269 var41 = class269.method2323(var39);
                            if (var40 == 11) {
                                var40 = 10;
                            }
                            if (var40 >= 5 && var40 <= 8) {
                                var40 = 4;
                            }
                            boolean var42 = var41.method4657(var40);
                            if (!var42) {
                                continue;
                            }
                        }
                        method3152(var38.field862, var38.field857, var38.field858, var38.field859, var38.field860, var38.field866, var38.field867);
                        var38.method3756();
                    } else {
                        if (var38.field856 > 0) {
                            var38.field856--;
                        }
                        if (var38.field856 == 0 && var38.field858 >= 1 && var38.field859 >= 1 && var38.field858 <= 102 && var38.field859 <= 102) {
                            if (var38.field863 >= 0) {
                                int var43 = var38.field863;
                                int var44 = var38.field865;
                                class269 var45 = class269.method2323(var43);
                                if (var44 == 11) {
                                    var44 = 10;
                                }
                                if (var44 >= 5 && var44 <= 8) {
                                    var44 = 4;
                                }
                                boolean var46 = var45.method4657(var44);
                                if (!var46) {
                                    continue;
                                }
                            }
                            method3152(var38.field862, var38.field857, var38.field858, var38.field859, var38.field863, var38.field864, var38.field865);
                            var38.field856 = -1;
                            if (var38.field863 == var38.field860 && var38.field860 == -1) {
                                var38.method3756();
                            } else if (var38.field863 == var38.field860 && var38.field866 == var38.field864 && var38.field867 == var38.field865) {
                                var38.method3756();
                            }
                        }
                    }
                }
                method4694();
                field627.field1229++;
                if (field627.field1229 > 750) {
                    method477();
                    return;
                }
                int var47 = class82.field1168;
                int[] var48 = class82.field1160;
                for (int var49 = 0; var49 < var47; var49++) {
                    class61 var50 = field611[var48[var49]];
                    if (var50 != null) {
                        method1001(var50, 1);
                    }
                }
                for (int var51 = 0; var51 < field623; var51++) {
                    int var52 = field640[var51];
                    class73 var53 = field844[var52];
                    if (var53 != null) {
                        method1001(var53, var53.field1038.field3498);
                    }
                }
                int[] var54 = class82.field1160;
                for (int var55 = 0; var55 < class82.field1168; var55++) {
                    class61 var56 = field611[var54[var55]];
                    if (var56 != null && var56.field888 > 0) {
                        var56.field888--;
                        if (var56.field888 == 0) {
                            var56.field885 = null;
                        }
                    }
                }
                for (int var57 = 0; var57 < field623; var57++) {
                    int var58 = field640[var57];
                    class73 var59 = field844[var58];
                    if (var59 != null && var59.field888 > 0) {
                        var59.field888--;
                        if (var59.field888 == 0) {
                            var59.field885 = null;
                        }
                    }
                }
                field701++;
                if (field685 != 0) {
                    field804 += 20;
                    if (field804 >= 400) {
                        field685 = 0;
                    }
                }
                if (Statics.field3097 != null) {
                    field687++;
                    if (field687 >= 15) {
                        method1035(Statics.field3097);
                        Statics.field3097 = null;
                    }
                }
                class231 var60 = Statics.field1898;
                class231 var61 = Statics.field1889;
                Statics.field1898 = null;
                Statics.field1889 = null;
                field756 = null;
                field773 = false;
                field602 = false;
                field800 = 0;
                while (class40.method9() && field800 < 128) {
                    if (field748 >= 2 && class40.field342[82] && Statics.field2017 == 66) {
                        String var62 = "";
                        Iterator var63 = class84.field1182.iterator();
                        while (var63.hasNext()) {
                            class59 var64 = (class59) var63.next();
                            var62 = var62 + var64.field532 + ':' + var64.field534 + '\n';
                        }
                        Statics.field2335.method692(var62);
                    } else if (field656 != 1 || Statics.field343 <= 0) {
                        field774[field800] = Statics.field2017;
                        field801[field800] = Statics.field343;
                        field800++;
                    }
                }
                if (method617() && class40.field342[82] && class40.field342[81] && field696 != 0) {
                    int var67 = Statics.field1877.field568 - field696;
                    if (var67 < 0) {
                        var67 = 0;
                    } else if (var67 > 3) {
                        var67 = 3;
                    }
                    if (Statics.field1877.field568 != var67) {
                        method178(Statics.field869 + Statics.field1877.field923[0], Statics.field755 + Statics.field1877.field873[0], var67, false);
                    }
                    field696 = 0;
                }
                if (field684 != -1) {
                    int var68 = field684;
                    int var69 = Statics.field1180;
                    int var70 = Statics.field3139;
                    if (class231.method4540(var68)) {
                        method103(Statics.field367[var68], -1, 0, 0, var69, var70, 0, 0);
                    }
                }
                field802++;
                while (true) {
                    class57 var71;
                    class231 var72;
                    class231 var73;
                    do {
                        var71 = (class57) field779.method3768();
                        if (var71 == null) {
                            while (true) {
                                class57 var74;
                                class231 var75;
                                class231 var76;
                                do {
                                    var74 = (class57) field780.method3768();
                                    if (var74 == null) {
                                        while (true) {
                                            class57 var77;
                                            class231 var78;
                                            class231 var79;
                                            do {
                                                var77 = (class57) field639.method3768();
                                                if (var77 == null) {
                                                    this.method1137();
                                                    method4845();
                                                    if (field584 != null) {
                                                        this.method1348();
                                                    }
                                                    if (Statics.field3560 != null) {
                                                        method1035(Statics.field3560);
                                                        field694++;
                                                        if (class49.field420 == 0) {
                                                            if (field690) {
                                                                if (Statics.field3560 == Statics.field1820 && field692 != field689) {
                                                                    class231 var80 = Statics.field3560;
                                                                    byte var81 = 0;
                                                                    if (field744 == 1 && var80.field2610 == 206) {
                                                                        var81 = 1;
                                                                    }
                                                                    if (var80.field2725[field692] <= 0) {
                                                                        var81 = 0;
                                                                    }
                                                                    if (class232.method2920(method406(var80))) {
                                                                        int var82 = field689;
                                                                        int var83 = field692;
                                                                        var80.field2725[var83] = var80.field2725[var82];
                                                                        var80.field2726[var83] = var80.field2726[var82];
                                                                        var80.field2725[var82] = -1;
                                                                        var80.field2726[var82] = 0;
                                                                    } else if (var81 == 1) {
                                                                        int var84 = field689;
                                                                        int var85 = field692;
                                                                        while (var84 != var85) {
                                                                            if (var84 > var85) {
                                                                                var80.method4141(var84 - 1, var84);
                                                                                var84--;
                                                                            } else if (var84 < var85) {
                                                                                var80.method4141(var84 + 1, var84);
                                                                                var84++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var80.method4141(field692, field689);
                                                                    }
                                                                    class173 var86 = Statics.method414(class170.field2171, field627.field1219);
                                                                    var86.field2258.method3279(var81);
                                                                    var86.field2258.method3285(field689);
                                                                    var86.field2258.method3390(Statics.field3560.field2692);
                                                                    var86.field2258.method3285(field692);
                                                                    field627.method1847(var86);
                                                                }
                                                            } else if (this.method1066()) {
                                                                this.method1375(field679, field822);
                                                            } else if (field772 > 0) {
                                                                method1041(field679, field822);
                                                            }
                                                            field687 = 10;
                                                            class49.field432 = 0;
                                                            Statics.field3560 = null;
                                                        } else if (field694 >= 5 && (class49.field426 > field679 + 5 || class49.field426 < field679 - 5 || class49.field427 * 673804999 > field822 + 5 || class49.field427 * 673804999 < field822 - 5)) {
                                                            field690 = true;
                                                        }
                                                    }
                                                    if (class126.method2707()) {
                                                        int var87 = class126.field1773;
                                                        int var88 = class126.field1748;
                                                        class173 var89 = Statics.method414(class170.field2220, field627.field1219);
                                                        var89.field2258.method3235(5);
                                                        var89.field2258.method3458(Statics.field869 + var87);
                                                        var89.field2258.method3278(class40.field342[82] ? (class40.field342[81] ? 2 : 1) : 0);
                                                        var89.field2258.method3285(Statics.field755 + var88);
                                                        field627.method1847(var89);
                                                        class126.method2768();
                                                        field682 = class49.field433;
                                                        field683 = class49.field429;
                                                        field685 = 1;
                                                        field804 = 0;
                                                        field809 = var87;
                                                        field810 = var88;
                                                    }
                                                    if (Statics.field1898 != var60) {
                                                        if (var60 != null) {
                                                            method1035(var60);
                                                        }
                                                        if (Statics.field1898 != null) {
                                                            method1035(Statics.field1898);
                                                        }
                                                    }
                                                    if (Statics.field1889 != var61 && field733 == field624) {
                                                        if (var61 != null) {
                                                            method1035(var61);
                                                        }
                                                        if (Statics.field1889 != null) {
                                                            method1035(Statics.field1889);
                                                        }
                                                    }
                                                    if (Statics.field1889 == null) {
                                                        if (field624 > 0) {
                                                            field624--;
                                                        }
                                                    } else if (field624 < field733) {
                                                        field624++;
                                                        if (field733 == field624) {
                                                            method1035(Statics.field1889);
                                                        }
                                                    }
                                                    method1829();
                                                    if (field823) {
                                                        int var90 = Statics.field204 * 128 + 64;
                                                        int var91 = Statics.field1929 * 128 + 64;
                                                        int var92 = method422(var90, var91, Statics.field83) - Statics.field2556;
                                                        if (Statics.field1432 < var90) {
                                                            Statics.field1432 += Statics.field1198 * (var90 - Statics.field1432) / 1000 + Statics.field3155;
                                                            if (Statics.field1432 > var90) {
                                                                Statics.field1432 = var90;
                                                            }
                                                        }
                                                        if (Statics.field1432 > var90) {
                                                            Statics.field1432 -= Statics.field1198 * (Statics.field1432 - var90) / 1000 + Statics.field3155;
                                                            if (Statics.field1432 < var90) {
                                                                Statics.field1432 = var90;
                                                            }
                                                        }
                                                        if (Statics.field1703 < var92) {
                                                            Statics.field1703 += Statics.field1198 * (var92 - Statics.field1703) / 1000 + Statics.field3155;
                                                            if (Statics.field1703 > var92) {
                                                                Statics.field1703 = var92;
                                                            }
                                                        }
                                                        if (Statics.field1703 > var92) {
                                                            Statics.field1703 -= Statics.field1198 * (Statics.field1703 - var92) / 1000 + Statics.field3155;
                                                            if (Statics.field1703 < var92) {
                                                                Statics.field1703 = var92;
                                                            }
                                                        }
                                                        if (Statics.field2564 < var91) {
                                                            Statics.field2564 += Statics.field1198 * (var91 - Statics.field2564) / 1000 + Statics.field3155;
                                                            if (Statics.field2564 > var91) {
                                                                Statics.field2564 = var91;
                                                            }
                                                        }
                                                        if (Statics.field2564 > var91) {
                                                            Statics.field2564 -= Statics.field1198 * (Statics.field2564 - var91) / 1000 + Statics.field3155;
                                                            if (Statics.field2564 < var91) {
                                                                Statics.field2564 = var91;
                                                            }
                                                        }
                                                        int var93 = Statics.field457 * 128 + 64;
                                                        int var94 = Statics.field3083 * 128 + 64;
                                                        int var95 = method422(var93, var94, Statics.field83) - Statics.field69;
                                                        int var96 = var93 - Statics.field1432;
                                                        int var97 = var95 - Statics.field1703;
                                                        int var98 = var94 - Statics.field2564;
                                                        int var99 = (int) Math.sqrt((double) (var96 * var96 + var98 * var98));
                                                        int var100 = (int) (Math.atan2((double) var97, (double) var99) * 325.949D) & 0x7FF;
                                                        int var101 = (int) (Math.atan2((double) var96, (double) var98) * -325.949D) & 0x7FF;
                                                        if (var100 < 128) {
                                                            var100 = 128;
                                                        }
                                                        if (var100 > 383) {
                                                            var100 = 383;
                                                        }
                                                        if (Statics.field42 < var100) {
                                                            Statics.field42 += Statics.field1835 * (var100 - Statics.field42) / 1000 + Statics.field1034;
                                                            if (Statics.field42 > var100) {
                                                                Statics.field42 = var100;
                                                            }
                                                        }
                                                        if (Statics.field42 > var100) {
                                                            Statics.field42 -= Statics.field1835 * (Statics.field42 - var100) / 1000 + Statics.field1034;
                                                            if (Statics.field42 < var100) {
                                                                Statics.field42 = var100;
                                                            }
                                                        }
                                                        int var102 = var101 - Statics.field1202;
                                                        if (var102 > 1024) {
                                                            var102 -= 2048;
                                                        }
                                                        if (var102 < -1024) {
                                                            var102 += 2048;
                                                        }
                                                        if (var102 > 0) {
                                                            Statics.field1202 += Statics.field1835 * var102 / 1000 + Statics.field1034;
                                                            Statics.field1202 &= 0x7FF;
                                                        }
                                                        if (var102 < 0) {
                                                            Statics.field1202 -= Statics.field1835 * -var102 / 1000 + Statics.field1034;
                                                            Statics.field1202 &= 0x7FF;
                                                        }
                                                        int var103 = var101 - Statics.field1202;
                                                        if (var103 > 1024) {
                                                            var103 -= 2048;
                                                        }
                                                        if (var103 < -1024) {
                                                            var103 += 2048;
                                                        }
                                                        if (var103 < 0 && var102 > 0 || var103 > 0 && var102 < 0) {
                                                            Statics.field1202 = var101;
                                                        }
                                                    }
                                                    for (int var104 = 0; var104 < 5; var104++) {
                                                        int var10002 = field706[var104]++;
                                                    }
                                                    Statics.field186.method1773();
                                                    int var105 = class49.method578();
                                                    int var106 = class40.field354;
                                                    if (var105 > 15000 && var106 > 15000) {
                                                        field628 = 250;
                                                        class49.method1737(14500);
                                                        class173 var108 = Statics.method414(class170.field2153, field627.field1219);
                                                        field627.method1847(var108);
                                                    }
                                                    Statics.field2333.method1520();
                                                    field627.field1225++;
                                                    if (field627.field1225 > 50) {
                                                        class173 var109 = Statics.method414(class170.field2212, field627.field1219);
                                                        field627.method1847(var109);
                                                    }
                                                    try {
                                                        field627.method1846();
                                                    } catch (IOException var111) {
                                                        method477();
                                                    }
                                                    return;
                                                }
                                                var78 = var77.field507;
                                                if (var78.field2607 < 0) {
                                                    break;
                                                }
                                                var79 = class231.method415(var78.field2606);
                                            } while (var79 == null || var79.field2737 == null || var78.field2607 >= var79.field2737.length || var79.field2737[var78.field2607] != var78);
                                            class70.method1589(var77);
                                        }
                                    }
                                    var75 = var74.field507;
                                    if (var75.field2607 < 0) {
                                        break;
                                    }
                                    var76 = class231.method415(var75.field2606);
                                } while (var76 == null || var76.field2737 == null || var75.field2607 >= var76.field2737.length || var76.field2737[var75.field2607] != var75);
                                class70.method1589(var74);
                            }
                        }
                        var72 = var71.field507;
                        if (var72.field2607 < 0) {
                            break;
                        }
                        var73 = class231.method415(var72.field2606);
                    } while (var73 == null || var73.field2737 == null || var72.field2607 >= var73.field2737.length || var73.field2737[var72.field2607] != var72);
                    class70.method1589(var71);
                }
            }
            class173 var4 = Statics.method414(class170.field2146, field627.field1219);
            var4.field2258.method3235(0);
            int var5 = var4.field2258.field2340;
            class314.method2665(var4.field2258);
            var4.field2258.method3248(var4.field2258.field2340 - var5);
            field627.method1847(var4);
        }
    }

    @ObfuscatedName("bi.fx(I)V")
    public static final void method938() {
        if (Statics.field880 != null) {
            Statics.field880.method2009();
        }
        if (Statics.field245 != null) {
            Statics.field245.method2009();
        }
    }

    @ObfuscatedName("jj.fj(I)V")
    public static final void method4694() {
        for (int var0 = 0; var0 < field657; var0++) {
            int var10002 = field820[var0]--;
            if (field820[var0] >= -10) {
                class92 var2 = field720[var0];
                if (var2 == null) {
                    class92 var10000 = (class92) null;
                    var2 = class92.method1936(Statics.field1853, field818[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field820[var0] += var2.method1935();
                    field720[var0] = var2;
                }
                if (field820[var0] < 0) {
                    int var9;
                    if (field821[var0] == 0) {
                        var9 = field815;
                    } else {
                        int var3 = (field821[var0] & 0xFF) * 128;
                        int var4 = field821[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1877.field932;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field821[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1877.field882;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field820[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field816 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class94 var10 = var2.method1934().method1980(Statics.field578);
                        class104 var11 = class104.method2125(var10, 100, var9);
                        var11.method2099(field677[var0] - 1);
                        Statics.field311.method1899(var11);
                    }
                    field820[var0] = -100;
                }
            } else {
                field657--;
                for (int var1 = var0; var1 < field657; var1++) {
                    field818[var1] = field818[var1 + 1];
                    field720[var1] = field720[var1 + 1];
                    field677[var1] = field677[var1 + 1];
                    field820[var1] = field820[var1 + 1];
                    field821[var1] = field821[var1 + 1];
                }
                var0--;
            }
        }
        if (!field814) {
            return;
        }
        boolean var12;
        if (class218.field2461 == 0) {
            var12 = Statics.field2460.method3878();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field812 != 0 && field813 != -1) {
                class218.method1447(Statics.field1148, field813, 0, field812, false);
            }
            field814 = false;
        }
    }

    @ObfuscatedName("fg.fi(Ljn;IIII)V")
    public static void method3174(class274 arg0, int arg1, int arg2, int arg3) {
        if (field657 >= 50 || field816 == 0 || arg0.field3544 == null || arg1 >= arg0.field3544.length) {
            return;
        }
        int var4 = arg0.field3544[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field818[field657] = var5;
        field677[field657] = var6;
        field820[field657] = 0;
        field720[field657] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field821[field657] = (var8 << 16) + (var9 << 8) + var7;
        field657++;
    }

    @ObfuscatedName("ay.fq(IIB)V")
    public static void method886(int arg0, int arg1) {
        if (field812 != 0 && arg0 != -1) {
            class218.method1447(Statics.field577, arg0, 0, field812, false);
            field814 = true;
        }
    }

    @ObfuscatedName("cq.fl(I)V")
    public static final void method1765() {
        if (Statics.field83 == field652) {
            return;
        }
        field652 = Statics.field83;
        int var0 = Statics.field83;
        int[] var1 = Statics.field1039.field3792;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class51.field444[var0][var6][var4] & 0x18) == 0) {
                    Statics.field249.method2702(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class51.field444[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field249.method2702(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1039.method5410();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class51.field444[var0][var10][var9] & 0x18) == 0) {
                    method4056(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class51.field444[var0 + 1][var10][var9] & 0x8) != 0) {
                    method4056(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field725 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field249.method2697(Statics.field83, var11, var12);
                if (var13 != 0L) {
                    int var15 = class121.method594(var13);
                    int var16 = class269.method2323(var15).field3398;
                    if (var16 >= 0) {
                        field817[field725] = Statics.field3247[var16].method4424(false);
                        field806[field725] = var11;
                        field807[field725] = var12;
                        field725++;
                    }
                }
            }
        }
        Statics.field2015.method5375();
    }

    @ObfuscatedName("ac.fn(Lhi;III)V")
    public static final void method573(class231 arg0, int arg1, int arg2) {
        if (field811 != 0 && field811 != 3 || class49.field432 != 1 && Statics.field3230 || class49.field432 != 4) {
            return;
        }
        class225 var3 = arg0.method4151(true);
        if (var3 == null) {
            return;
        }
        int var4 = class49.field433 - arg1;
        int var5 = class49.field429 - arg2;
        if (!var3.method4057(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2554 / 2;
        int var7 = var5 - var3.field2550 / 2;
        int var8 = field718 & 0x7FF;
        int var9 = class123.field1682[var8];
        int var10 = class123.field1694[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1877.field932 + var11 >> 7;
        int var14 = Statics.field1877.field882 - var12 >> 7;
        class173 var15 = Statics.method414(class170.field2136, field627.field1219);
        var15.field2258.method3235(18);
        var15.field2258.method3458(Statics.field869 + var13);
        var15.field2258.method3278(class40.field342[82] ? (class40.field342[81] ? 2 : 1) : 0);
        var15.field2258.method3285(Statics.field755 + var14);
        var15.field2258.method3235(var6);
        var15.field2258.method3235(var7);
        var15.field2258.method3458(field718);
        var15.field2258.method3235(57);
        var15.field2258.method3235(0);
        var15.field2258.method3235(0);
        var15.field2258.method3235(89);
        var15.field2258.method3458(Statics.field1877.field932);
        var15.field2258.method3458(Statics.field1877.field882);
        var15.field2258.method3235(63);
        field627.method1847(var15);
        field809 = var13;
        field810 = var14;
    }

    @ObfuscatedName("bo.fg(Ljava/lang/String;B)V")
    public static final void method952(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field62.field961 = !Statics.field62.field961;
            class67.method939();
            if (Statics.field62.field961) {
                class84.method2942(99, "", "Roofs are now all hidden");
            } else {
                class84.method2942(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field598 = !field598;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field700 = !field700;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field729 = !field729;
        }
        if (field748 >= 2) {
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field477.field3840 = !Statics.field477.field3840;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field598 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field598 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method477();
            }
        }
        class173 var1 = Statics.method414(class170.field2188, field627.field1219);
        var1.field2258.method3235(arg0.length() + 1);
        var1.field2258.method3402(arg0);
        field627.method1847(var1);
    }

    @ObfuscatedName("ch.fy(B)V")
    public static final void method1829() {
        if (field656 == 0) {
            int var0 = Statics.field1877.field932;
            int var1 = Statics.field1877.field882;
            if (Statics.field1429 - var0 < -500 || Statics.field1429 - var0 > 500 || Statics.field24 - var1 < -500 || Statics.field24 - var1 > 500) {
                Statics.field1429 = var0;
                Statics.field24 = var1;
            }
            if (Statics.field1429 != var0) {
                Statics.field1429 += (var0 - Statics.field1429) / 16;
            }
            if (Statics.field24 != var1) {
                Statics.field24 += (var1 - Statics.field24) / 16;
            }
            int var2 = Statics.field1429 >> 7;
            int var3 = Statics.field24 >> 7;
            int var4 = method422(Statics.field1429, Statics.field24, Statics.field83);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field83;
                        if (var8 < 3 && (class51.field444[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class51.field460[var8][var6][var7];
                        if (var9 > var5) {
                            var5 = var9;
                        }
                    }
                }
            }
            int var10 = var5 * 192;
            if (var10 > 98048) {
                var10 = 98048;
            }
            if (var10 < 32768) {
                var10 = 32768;
            }
            if (var10 > field739) {
                field739 += (var10 - field739) / 24;
            } else if (var10 < field739) {
                field739 += (var10 - field739) / 80;
            }
            Statics.field3479 = method422(Statics.field1877.field932, Statics.field1877.field882, Statics.field83) - field645;
        } else if (field656 == 1) {
            method3230();
            short var11 = -1;
            if (class40.field342[33]) {
                var11 = 0;
            } else if (class40.field342[49]) {
                var11 = 1024;
            }
            if (class40.field342[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class40.field342[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class40.field342[35]) {
                var12 = -1;
            } else if (class40.field342[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class40.field342[81] ? field662 : field751;
                var13 = var14 * 16;
                field614 = var11;
                field660 = var12;
            }
            if (field658 < var13) {
                field658 += var13 / 8;
                if (field658 > var13) {
                    field658 = var13;
                }
            } else if (field658 > var13) {
                field658 = field658 * 9 / 10;
            }
            if (field658 > 0) {
                int var15 = field658 / 16;
                if (field614 >= 0) {
                    int var16 = field614 - Statics.field1202 & 0x7FF;
                    int var17 = class123.field1682[var16];
                    int var18 = class123.field1694[var16];
                    Statics.field1429 += var15 * var17 / 65536;
                    Statics.field24 += var15 * var18 / 65536;
                }
                if (field660 != 0) {
                    Statics.field3479 += field660 * var15;
                    if (Statics.field3479 > 0) {
                        Statics.field3479 = 0;
                    }
                }
            } else {
                field614 = -1;
                field660 = -1;
            }
            if (class40.field342[13]) {
                field627.method1847(Statics.method414(class170.field2143, field627.field1219));
                field656 = 0;
            }
        }
        if (class49.field420 == 4 && Statics.field3230) {
            int var19 = class49.field427 * 673804999 - field655;
            field653 = var19 * 2;
            field655 = var19 == -1 || var19 == 1 ? class49.field427 * 673804999 : (field655 + class49.field427 * 673804999) / 2;
            int var20 = field654 - class49.field426;
            field609 = var20 * 2;
            field654 = var20 == -1 || var20 == 1 ? class49.field426 : (field654 + class49.field426) / 2;
        } else {
            if (class40.field342[96]) {
                field609 += (-24 - field609) / 2;
            } else if (class40.field342[97]) {
                field609 += (24 - field609) / 2;
            } else {
                field609 /= 2;
            }
            if (class40.field342[98]) {
                field653 += (12 - field653) / 2;
            } else if (class40.field342[99]) {
                field653 += (-12 - field653) / 2;
            } else {
                field653 /= 2;
            }
            field655 = class49.field427 * 673804999;
            field654 = class49.field426;
        }
        field718 = field609 / 2 + field718 & 0x7FF;
        field650 += field653 / 2;
        if (field650 < 128) {
            field650 = 128;
        }
        if (field650 > 383) {
            field650 = 383;
        }
    }

    @ObfuscatedName("bz.fv(Lba;II)V")
    public static final void method1001(class64 arg0, int arg1) {
        if (arg0.field918 > field592) {
            int var2 = arg0.field918 - field592;
            int var3 = arg0.field914 * 128 + arg0.field875 * 64;
            int var4 = arg0.field916 * 128 + arg0.field875 * 64;
            arg0.field932 += (var3 - arg0.field932) / var2;
            arg0.field882 += (var4 - arg0.field882) / var2;
            arg0.field924 = 0;
            arg0.field927 = arg0.field920;
        } else if (arg0.field919 >= field592) {
            method1736(arg0);
        } else {
            method550(arg0);
        }
        if (arg0.field932 < 128 || arg0.field882 < 128 || arg0.field932 >= 13184 || arg0.field882 >= 13184) {
            arg0.field904 = -1;
            arg0.field892 = -1;
            arg0.field918 = 0;
            arg0.field919 = 0;
            arg0.field932 = arg0.field923[0] * 128 + arg0.field875 * 64;
            arg0.field882 = arg0.field873[0] * 128 + arg0.field875 * 64;
            arg0.method1436();
        }
        if (Statics.field1877 == arg0 && (arg0.field932 < 1536 || arg0.field882 < 1536 || arg0.field932 >= 11776 || arg0.field882 >= 11776)) {
            arg0.field904 = -1;
            arg0.field892 = -1;
            arg0.field918 = 0;
            arg0.field919 = 0;
            arg0.field932 = arg0.field923[0] * 128 + arg0.field875 * 64;
            arg0.field882 = arg0.field873[0] * 128 + arg0.field875 * 64;
            arg0.method1436();
        }
        method27(arg0);
        method5077(arg0);
    }

    @ObfuscatedName("cb.fo(Lba;B)V")
    public static final void method1736(class64 arg0) {
        if (field592 == arg0.field919 || arg0.field904 == -1 || arg0.field907 != 0 || arg0.field902 + 1 > class274.method26(arg0.field904).field3542[arg0.field905]) {
            int var1 = arg0.field919 - arg0.field918;
            int var2 = field592 - arg0.field918;
            int var3 = arg0.field914 * 128 + arg0.field875 * 64;
            int var4 = arg0.field916 * 128 + arg0.field875 * 64;
            int var5 = arg0.field917 * 128 + arg0.field875 * 64;
            int var6 = arg0.field930 * 128 + arg0.field875 * 64;
            arg0.field932 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field882 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field924 = 0;
        arg0.field927 = arg0.field920;
        arg0.field906 = arg0.field927;
    }

    @ObfuscatedName("ai.fm(Lba;B)V")
    public static final void method550(class64 arg0) {
        arg0.field901 = arg0.field894;
        if (arg0.field910 == 0) {
            arg0.field924 = 0;
            return;
        }
        if (arg0.field904 != -1 && arg0.field907 == 0) {
            class274 var1 = class274.method26(arg0.field904);
            if (arg0.field931 > 0 && var1.field3552 == 0) {
                arg0.field924++;
                return;
            }
            if (arg0.field931 <= 0 && var1.field3536 == 0) {
                arg0.field924++;
                return;
            }
        }
        int var2 = arg0.field932;
        int var3 = arg0.field882;
        int var4 = arg0.field923[arg0.field910 - 1] * 128 + arg0.field875 * 64;
        int var5 = arg0.field873[arg0.field910 - 1] * 128 + arg0.field875 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field927 = 1280;
            } else if (var3 > var5) {
                arg0.field927 = 1792;
            } else {
                arg0.field927 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field927 = 768;
            } else if (var3 > var5) {
                arg0.field927 = 256;
            } else {
                arg0.field927 = 512;
            }
        } else if (var3 < var5) {
            arg0.field927 = 1024;
        } else if (var3 > var5) {
            arg0.field927 = 0;
        }
        byte var6 = arg0.field929[arg0.field910 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field932 = var4;
            arg0.field882 = var5;
            arg0.field910--;
            if (arg0.field931 > 0) {
                arg0.field931--;
            }
            return;
        }
        int var7 = arg0.field927 - arg0.field906 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field881;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field900;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field883;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field871;
        }
        if (var8 == -1) {
            var8 = arg0.field900;
        }
        arg0.field901 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class73) {
            var10 = ((class73) arg0).field1038.field3521;
        }
        if (var10) {
            if (arg0.field927 != arg0.field906 && arg0.field898 == -1 && arg0.field925 != 0) {
                var9 = 2;
            }
            if (arg0.field910 > 2) {
                var9 = 6;
            }
            if (arg0.field910 > 3) {
                var9 = 8;
            }
            if (arg0.field924 > 0 && arg0.field910 > 1) {
                var9 = 8;
                arg0.field924--;
            }
        } else {
            if (arg0.field910 > 1) {
                var9 = 6;
            }
            if (arg0.field910 > 2) {
                var9 = 8;
            }
            if (arg0.field924 > 0 && arg0.field910 > 1) {
                var9 = 8;
                arg0.field924--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field901 == arg0.field900 && arg0.field884 != -1) {
            arg0.field901 = arg0.field884;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field932 += var9;
                if (arg0.field932 > var4) {
                    arg0.field932 = var4;
                }
            } else if (var2 > var4) {
                arg0.field932 -= var9;
                if (arg0.field932 < var4) {
                    arg0.field932 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field882 += var9;
                if (arg0.field882 > var5) {
                    arg0.field882 = var5;
                }
            } else if (var3 > var5) {
                arg0.field882 -= var9;
                if (arg0.field882 < var5) {
                    arg0.field882 = var5;
                }
            }
        }
        if (arg0.field932 == var4 && arg0.field882 == var5) {
            arg0.field910--;
            if (arg0.field931 > 0) {
                arg0.field931--;
            }
        }
    }

    @ObfuscatedName("l.fz(Lba;I)V")
    public static final void method27(class64 arg0) {
        if (arg0.field925 == 0) {
            return;
        }
        if (arg0.field898 != -1) {
            class64 var1 = null;
            if (arg0.field898 < 32768) {
                var1 = field844[arg0.field898];
            } else if (arg0.field898 >= 32768) {
                var1 = field611[arg0.field898 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field932 - var1.field932;
                int var3 = arg0.field882 - var1.field882;
                if (var2 != 0 || var3 != 0) {
                    arg0.field927 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field899) {
                arg0.field898 = -1;
                arg0.field899 = false;
            }
        }
        if (arg0.field921 != -1 && (arg0.field910 == 0 || arg0.field924 > 0)) {
            arg0.field927 = arg0.field921;
            arg0.field921 = -1;
        }
        int var4 = arg0.field927 - arg0.field906 & 0x7FF;
        if (var4 == 0 && arg0.field899) {
            arg0.field898 = -1;
            arg0.field899 = false;
        }
        if (var4 == 0) {
            arg0.field876 = 0;
            return;
        }
        arg0.field876++;
        if (var4 > 1024) {
            arg0.field906 -= arg0.field925;
            boolean var5 = true;
            if (var4 < arg0.field925 || var4 > 2048 - arg0.field925) {
                arg0.field906 = arg0.field927;
                var5 = false;
            }
            if (arg0.field901 == arg0.field894 && (arg0.field876 > 25 || var5)) {
                if (arg0.field878 == -1) {
                    arg0.field901 = arg0.field900;
                } else {
                    arg0.field901 = arg0.field878;
                }
            }
        } else {
            arg0.field906 += arg0.field925;
            boolean var6 = true;
            if (var4 < arg0.field925 || var4 > 2048 - arg0.field925) {
                arg0.field906 = arg0.field927;
                var6 = false;
            }
            if (arg0.field901 == arg0.field894 && (arg0.field876 > 25 || var6)) {
                if (arg0.field879 == -1) {
                    arg0.field901 = arg0.field900;
                } else {
                    arg0.field901 = arg0.field879;
                }
            }
        }
        arg0.field906 &= 0x7FF;
    }

    @ObfuscatedName("kc.fs(Lba;I)V")
    public static final void method5077(class64 arg0) {
        arg0.field874 = false;
        if (arg0.field901 != -1) {
            class274 var1 = class274.method26(arg0.field901);
            if (var1 == null || var1.field3541 == null) {
                arg0.field901 = -1;
            } else {
                arg0.field903++;
                if (arg0.field909 < var1.field3541.length && arg0.field903 > var1.field3542[arg0.field909]) {
                    arg0.field903 = 1;
                    arg0.field909++;
                    method3174(var1, arg0.field909, arg0.field932, arg0.field882);
                }
                if (arg0.field909 >= var1.field3541.length) {
                    arg0.field903 = 0;
                    arg0.field909 = 0;
                    method3174(var1, arg0.field909, arg0.field932, arg0.field882);
                }
            }
        }
        if (arg0.field892 != -1 && field592 >= arg0.field912) {
            if (arg0.field877 < 0) {
                arg0.field877 = 0;
            }
            int var2 = class259.method956(arg0.field892).field3272;
            if (var2 == -1) {
                arg0.field892 = -1;
            } else {
                class274 var3 = class274.method26(var2);
                if (var3 == null || var3.field3541 == null) {
                    arg0.field892 = -1;
                } else {
                    arg0.field911++;
                    if (arg0.field877 < var3.field3541.length && arg0.field911 > var3.field3542[arg0.field877]) {
                        arg0.field911 = 1;
                        arg0.field877++;
                        method3174(var3, arg0.field877, arg0.field932, arg0.field882);
                    }
                    if (arg0.field877 >= var3.field3541.length && (arg0.field877 < 0 || arg0.field877 >= var3.field3541.length)) {
                        arg0.field892 = -1;
                    }
                }
            }
        }
        if (arg0.field904 != -1 && arg0.field907 <= 1) {
            class274 var4 = class274.method26(arg0.field904);
            if (var4.field3552 == 1 && arg0.field931 > 0 && arg0.field918 <= field592 && arg0.field919 < field592) {
                arg0.field907 = 1;
                return;
            }
        }
        if (arg0.field904 != -1 && arg0.field907 == 0) {
            class274 var5 = class274.method26(arg0.field904);
            if (var5 == null || var5.field3541 == null) {
                arg0.field904 = -1;
            } else {
                arg0.field902++;
                if (arg0.field905 < var5.field3541.length && arg0.field902 > var5.field3542[arg0.field905]) {
                    arg0.field902 = 1;
                    arg0.field905++;
                    method3174(var5, arg0.field905, arg0.field932, arg0.field882);
                }
                if (arg0.field905 >= var5.field3541.length) {
                    arg0.field905 -= var5.field3545;
                    arg0.field908++;
                    if (arg0.field908 >= var5.field3551) {
                        arg0.field904 = -1;
                    } else if (arg0.field905 >= 0 && arg0.field905 < var5.field3541.length) {
                        method3174(var5, arg0.field905, arg0.field932, arg0.field882);
                    } else {
                        arg0.field904 = -1;
                    }
                }
                arg0.field874 = var5.field3547;
            }
        }
        if (arg0.field907 > 0) {
            arg0.field907--;
        }
    }

    @ObfuscatedName("js.fe(I)V")
    public static void method4845() {
        if (Statics.field477 != null) {
            Statics.field477.method5571(Statics.field83, (Statics.field1877.field932 >> 7) + Statics.field869, (Statics.field1877.field882 >> 7) + Statics.field755, false);
            Statics.field477.method5587();
        }
    }

    @ObfuscatedName("ay.gk(IB)V")
    public static void method912(int arg0) {
        field792 = 0L;
        if (arg0 >= 2) {
            field793 = true;
        } else {
            field793 = false;
        }
        int var1 = field793 ? 2 : 1;
        if (var1 == 1) {
            Statics.field2335.method827(765, 503);
        } else {
            Statics.field2335.method827(7680, 2160);
        }
        if (field590 < 25) {
            return;
        }
        class173 var2 = Statics.method414(class170.field2216, field627.field1219);
        class190 var3 = var2.field2258;
        int var4 = field793 ? 2 : 1;
        var3.method3235(var4);
        var2.field2258.method3458(Statics.field1180);
        var2.field2258.method3458(Statics.field3139);
        field627.method1847(var2);
    }

    @ObfuscatedName("bb.gg(I)V")
    public static void method1497() {
        class173 var0 = Statics.method414(class170.field2216, field627.field1219);
        class190 var1 = var0.field2258;
        int var2 = field793 ? 2 : 1;
        var1.method3235(var2);
        var0.field2258.method3458(Statics.field1180);
        var0.field2258.method3458(Statics.field3139);
        field627.method1847(var0);
    }

    @ObfuscatedName("client.y(I)V")
    public final void method696() {
        field792 = class185.method3250() + 500L;
        this.method1062();
        if (field684 != -1) {
            this.method1068(true);
        }
    }

    @ObfuscatedName("client.gp(I)V")
    public void method1062() {
        int var1 = Statics.field1180;
        int var2 = Statics.field3139;
        if (this.field397 < var1) {
            int var3 = this.field397;
        }
        if (this.field398 < var2) {
            int var4 = this.field398;
        }
        if (Statics.field62 == null) {
            return;
        }
        try {
            client var5 = Statics.field2335;
            int var6 = field793 ? 2 : 1;
            class42.method621(var5, "resize", new Object[] { var6 });
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.ge(B)V")
    public final void method1063() {
        if (field684 != -1) {
            method251(field684);
        }
        for (int var1 = 0; var1 < field604; var1++) {
            if (field698[var1]) {
                field789[var1] = true;
            }
            field724[var1] = field698[var1];
            field698[var1] = false;
        }
        field831 = field592;
        field730 = -1;
        field731 = -1;
        Statics.field1820 = null;
        if (field684 != -1) {
            field604 = 0;
            method571(field684, 0, 0, Statics.field1180, Statics.field3139, 0, 0, -1);
        }
        class315.method5287();
        if (field717) {
            method1811();
        } else if (field730 != -1) {
            method918(field730, field731);
        }
        if (field791 == 3) {
            for (int var2 = 0; var2 < field604; var2++) {
                if (field724[var2]) {
                    class315.method5295(field787[var2], field788[var2], field642[var2], field790[var2], 16711935, 128);
                } else if (field789[var2]) {
                    class315.method5295(field787[var2], field788[var2], field642[var2], field790[var2], 16711680, 128);
                }
            }
        }
        int var3 = Statics.field83;
        int var4 = Statics.field1877.field932;
        int var5 = Statics.field1877.field882;
        int var6 = field701;
        for (class69 var7 = (class69) class69.field986.method3790(); var7 != null; var7 = (class69) class69.field986.method3771()) {
            if (var7.field988 != -1 || var7.field987 != null) {
                int var8 = 0;
                if (var4 > var7.field985) {
                    var8 += var4 - var7.field985;
                } else if (var4 < var7.field989) {
                    var8 += var7.field989 - var4;
                }
                if (var5 > var7.field993) {
                    var8 += var5 - var7.field993;
                } else if (var5 < var7.field984) {
                    var8 += var7.field984 - var5;
                }
                if (var8 - 64 > var7.field992 || field816 == 0 || var7.field982 != var3) {
                    if (var7.field994 != null) {
                        Statics.field311.method1876(var7.field994);
                        var7.field994 = null;
                    }
                    if (var7.field981 != null) {
                        Statics.field311.method1876(var7.field981);
                        var7.field981 = null;
                    }
                } else {
                    var8 -= 64;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = field816 * (var7.field992 - var8) / var7.field992;
                    class92 var10000;
                    if (var7.field994 != null) {
                        var7.field994.method2108(var9);
                    } else if (var7.field988 >= 0) {
                        var10000 = (class92) null;
                        class92 var10 = class92.method1936(Statics.field1853, var7.field988, 0);
                        if (var10 != null) {
                            class94 var11 = var10.method1934().method1980(Statics.field578);
                            class104 var12 = class104.method2125(var11, 100, var9);
                            var12.method2099(-1);
                            Statics.field311.method1899(var12);
                            var7.field994 = var12;
                        }
                    }
                    if (var7.field981 != null) {
                        var7.field981.method2108(var9);
                        if (!var7.field981.method3757()) {
                            var7.field981 = null;
                        }
                    } else if (var7.field987 != null && (var7.field991 -= var6) <= 0) {
                        int var13 = (int) (Math.random() * (double) var7.field987.length);
                        var10000 = (class92) null;
                        class92 var14 = class92.method1936(Statics.field1853, var7.field987[var13], 0);
                        if (var14 != null) {
                            class94 var15 = var14.method1934().method1980(Statics.field578);
                            class104 var16 = class104.method2125(var15, 100, var9);
                            var16.method2099(0);
                            Statics.field311.method1899(var16);
                            var7.field981 = var16;
                            var7.field991 = var7.field990 + (int) (Math.random() * (double) (var7.field983 - var7.field990));
                        }
                    }
                }
            }
        }
        field701 = 0;
    }

    @ObfuscatedName("cl.gv(Ljava/lang/String;ZI)V")
    public static final void method1804(String arg0, boolean arg1) {
        if (!field678) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field934.method5094(arg0, 250);
        int var6 = Statics.field934.method5095(arg0, 250) * 13;
        class315.method5331(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class315.method5302(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field934.method5101(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method869(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2015.method673(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field604; var11++) {
            if (field787[var11] + field642[var11] > var7 && field787[var11] < var7 + var9 && field790[var11] + field788[var11] > var8 && field788[var11] < var8 + var10) {
                field789[var11] = true;
            }
        }
    }

    @ObfuscatedName("ae.gb(IIIIZI)V")
    public static final void method635(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field830 - field803) * var5 / 100 + field803;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field835) {
            short var8 = field835;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field834) {
                var6 = field834;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class315.method5287();
                    class315.method5331(arg0, arg1, var10, arg3, -16777216);
                    class315.method5331(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field836) {
            short var11 = field836;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field833) {
                var6 = field833;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class315.method5287();
                    class315.method5331(arg0, arg1, arg2, var13, -16777216);
                    class315.method5331(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field832 - field849) * var5 / 100 + field849;
        field841 = arg3 * var6 * var14 / 85504 << 1;
        if (field839 != arg2 || field663 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class123.field1682[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class126.method2689(var15, 500, 800, arg2, arg3);
        }
        field763 = arg0;
        field838 = arg1;
        field839 = arg2;
        field663 = arg3;
    }

    @ObfuscatedName("el.gt(B)V")
    public static void method2965() {
        if (Statics.field1877.field932 >> 7 == field809 && Statics.field1877.field882 >> 7 == field810) {
            field809 = 0;
        }
    }

    @ObfuscatedName("ff.gi(B)V")
    public static void method3086() {
        if (field700) {
            method99(Statics.field1877, false);
        }
    }

    @ObfuscatedName("bi.gs(B)V")
    public static void method940() {
        if (field708 >= 0 && field611[field708] != null) {
            method99(field611[field708], false);
        }
    }

    @ObfuscatedName("bc.gc(I)V")
    public static void method1548() {
        int var0 = class82.field1168;
        int[] var1 = class82.field1160;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field708 != var1[var2] && field629 != var1[var2]) {
                method99(field611[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("b.gr(Lbu;ZI)V")
    public static void method99(class61 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1042() || arg0.field567) {
            return;
        }
        arg0.field561 = false;
        if ((field586 && class82.field1168 > 50 || class82.field1168 > 200) && arg1 && arg0.field901 == arg0.field894) {
            arg0.field561 = true;
        }
        int var2 = arg0.field932 >> 7;
        int var3 = arg0.field882 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class121.method1686(0, 0, 0, false, arg0.field575);
        if (arg0.field564 != null && field592 >= arg0.field546 && field592 < arg0.field556) {
            arg0.field561 = false;
            arg0.field563 = method422(arg0.field932, arg0.field882, Statics.field83);
            arg0.field890 = field592;
            Statics.field249.method2806(Statics.field83, arg0.field932, arg0.field882, arg0.field563, 60, arg0, arg0.field906, var4, arg0.field560, arg0.field548, arg0.field566, arg0.field554);
            return;
        }
        if ((arg0.field932 & 0x7F) == 64 && (arg0.field882 & 0x7F) == 64) {
            if (field688 == field762[var2][var3]) {
                return;
            }
            field762[var2][var3] = field688;
        }
        arg0.field563 = method422(arg0.field932, arg0.field882, Statics.field83);
        arg0.field890 = field592;
        Statics.field249.method2679(Statics.field83, arg0.field932, arg0.field882, arg0.field563, 60, arg0, arg0.field906, var4, arg0.field874);
    }

    @ObfuscatedName("c.gz(ZI)V")
    public static final void method405(boolean arg0) {
        for (int var1 = 0; var1 < field623; var1++) {
            class73 var2 = field844[field640[var1]];
            if (var2 != null && var2.method1042() && var2.field1038.field3512 == arg0 && var2.field1038.method4771()) {
                int var3 = var2.field932 >> 7;
                int var4 = var2.field882 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field875 == 1 && (var2.field932 & 0x7F) == 64 && (var2.field882 & 0x7F) == 64) {
                        if (field688 == field762[var3][var4]) {
                            continue;
                        }
                        field762[var3][var4] = field688;
                    }
                    long var5 = class121.method1686(0, 0, 1, !var2.field1038.field3505, field640[var1]);
                    var2.field890 = field592;
                    Statics.field249.method2679(Statics.field83, var2.field932, var2.field882, method422(var2.field932 + (var2.field875 * 64 - 64), var2.field882 + (var2.field875 * 64 - 64), Statics.field83), var2.field875 * 64 - 64 + 60, var2, var2.field906, var5, var2.field874);
                }
            }
        }
    }

    @ObfuscatedName("n.go(I)I")
    public static final int method109() {
        if (Statics.field62.field961) {
            return Statics.field83;
        }
        int var0 = 3;
        if (Statics.field42 < 310) {
            int var1;
            int var2;
            if (field656 == 1) {
                var1 = Statics.field1429 >> 7;
                var2 = Statics.field24 >> 7;
            } else {
                var1 = Statics.field1877.field932 >> 7;
                var2 = Statics.field1877.field882 >> 7;
            }
            int var3 = Statics.field1432 >> 7;
            int var4 = Statics.field2564 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field83;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field83;
            }
            if ((class51.field444[Statics.field83][var3][var4] & 0x4) != 0) {
                var0 = Statics.field83;
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
                    if ((class51.field444[Statics.field83][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field83;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class51.field444[Statics.field83][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field83;
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
                    if ((class51.field444[Statics.field83][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field83;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class51.field444[Statics.field83][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field83;
                        }
                    }
                }
            }
        }
        if (Statics.field1877.field932 >= 0 && Statics.field1877.field882 >= 0 && Statics.field1877.field932 < 13312 && Statics.field1877.field882 < 13312) {
            if ((class51.field444[Statics.field83][Statics.field1877.field932 >> 7][Statics.field1877.field882 >> 7] & 0x4) != 0) {
                var0 = Statics.field83;
            }
            return var0;
        } else {
            return Statics.field83;
        }
    }

    @ObfuscatedName("a.gd(I)Z")
    public static boolean method241() {
        return (field659 & 0x4) != 0;
    }

    @ObfuscatedName("ax.gq(B)Z")
    public static boolean method864() {
        return (field659 & 0x2) != 0;
    }

    @ObfuscatedName("ai.gu(Lba;IIIIIB)V")
    public static final void method569(class64 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1042()) {
            return;
        }
        if (arg0 instanceof class73) {
            class272 var6 = ((class73) arg0).field1038;
            if (var6.field3517 != null) {
                var6 = var6.method4795();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class82.field1168;
        int[] var8 = class82.field1160;
        byte var9 = 0;
        if (arg1 < var7 && field592 == arg0.field890) {
            class61 var10 = (class61) arg0;
            boolean var11;
            if (field659 == 0) {
                var11 = false;
            } else if (Statics.field1877 == var10) {
                boolean var14 = (field659 & 0x8) != 0;
                var11 = var14;
            } else {
                boolean var12 = method241();
                if (!var12) {
                    boolean var13 = (field659 & 0x1) != 0;
                    var12 = var13 && var10.method1004();
                }
                var11 = var12 || method864() && var10.method1025();
            }
            if (var11) {
                class61 var15 = (class61) arg0;
                if (arg1 < var7) {
                    method989(arg0, arg0.field926 + 15);
                    class300 var16 = (class300) field632.get(class296.field3673);
                    byte var17 = 9;
                    var16.method5100(var15.field553.method5033(), field680 + arg2, field681 + arg3 - var17, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var18 = -2;
        if (!arg0.field897.method3735()) {
            method989(arg0, arg0.field926 + 15);
            for (class72 var19 = (class72) arg0.field897.method3740(); var19 != null; var19 = (class72) arg0.field897.method3725()) {
                class65 var20 = var19.method1662(field592);
                if (var20 != null) {
                    class262 var21 = var19.field1026;
                    class319 var22 = var21.method4527();
                    class319 var23 = var21.method4526();
                    int var24 = 0;
                    int var25;
                    if (var22 == null || var23 == null) {
                        var25 = var21.field3312;
                    } else {
                        if (var21.field3319 * 2 < var23.field3788) {
                            var24 = var21.field3319;
                        }
                        var25 = var23.field3788 - var24 * 2;
                    }
                    int var26 = 255;
                    boolean var27 = true;
                    int var28 = field592 - var20.field935;
                    int var29 = var20.field939 * var25 / var21.field3312;
                    int var32;
                    if (var20.field938 > var28) {
                        int var30 = var21.field3309 == 0 ? 0 : var28 / var21.field3309 * var21.field3309;
                        int var31 = var20.field936 * var25 / var21.field3312;
                        var32 = (var29 - var31) * var30 / var20.field938 + var31;
                    } else {
                        var32 = var29;
                        int var33 = var20.field938 + var21.field3314 - var28;
                        if (var21.field3313 >= 0) {
                            var26 = (var33 << 8) / (var21.field3314 - var21.field3313);
                        }
                    }
                    if (var20.field939 > 0 && var32 < 1) {
                        var32 = 1;
                    }
                    if (var22 == null || var23 == null) {
                        var18 += 5;
                        if (field680 > -1) {
                            int var39 = field680 + arg2 - (var25 >> 1);
                            int var40 = field681 + arg3 - var18;
                            class315.method5331(var39, var40, var32, 5, 65280);
                            class315.method5331(var32 + var39, var40, var25 - var32, 5, 16711680);
                        }
                        var18 += 2;
                    } else {
                        int var34;
                        if (var25 == var32) {
                            var34 = var24 * 2 + var32;
                        } else {
                            var34 = var24 + var32;
                        }
                        int var35 = var22.field3789;
                        var18 += var35;
                        int var36 = field680 + arg2 - (var25 >> 1);
                        int var37 = field681 + arg3 - var18;
                        int var38 = var36 - var24;
                        if (var26 >= 0 && var26 < 255) {
                            var22.method5417(var38, var37, var26);
                            class315.method5358(var38, var37, var34 + var38, var35 + var37);
                            var23.method5417(var38, var37, var26);
                        } else {
                            var22.method5411(var38, var37);
                            class315.method5358(var38, var37, var34 + var38, var35 + var37);
                            var23.method5411(var38, var37);
                        }
                        class315.method5288(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var18 += 2;
                    }
                } else if (var19.method1663()) {
                    var19.method3756();
                }
            }
        }
        if (var18 == -2) {
            var18 += 7;
        }
        int var41 = var9 + var18;
        if (arg1 < var7) {
            class61 var42 = (class61) arg0;
            if (var42.field567) {
                return;
            }
            if (var42.field571 != -1 || var42.field549 != -1) {
                method989(arg0, arg0.field926 + 15);
                if (field680 > -1) {
                    if (var42.field571 != -1) {
                        var41 += 25;
                        Statics.field1920[var42.field571].method5411(field680 + arg2 - 12, field681 + arg3 - var41);
                    }
                    if (var42.field549 != -1) {
                        var41 += 25;
                        Statics.field370[var42.field549].method5411(field680 + arg2 - 12, field681 + arg3 - var41);
                    }
                }
            }
            if (arg1 >= 0 && field600 == 10 && field580 == var8[arg1]) {
                method989(arg0, arg0.field926 + 15);
                if (field680 > -1) {
                    int var43 = Statics.field1927[1].field3789 + var41;
                    Statics.field1927[1].method5411(field680 + arg2 - 12, field681 + arg3 - var43);
                }
            }
        } else {
            class272 var44 = ((class73) arg0).field1038;
            if (var44.field3517 != null) {
                var44 = var44.method4795();
            }
            if (var44.field3495 >= 0 && var44.field3495 < Statics.field370.length) {
                method989(arg0, arg0.field926 + 15);
                if (field680 > -1) {
                    Statics.field370[var44.field3495].method5411(field680 + arg2 - 12, field681 + arg3 - 30);
                }
            }
            if (field600 == 1 && field601 == field640[arg1 - var7] && field592 % 20 < 10) {
                method989(arg0, arg0.field926 + 15);
                if (field680 > -1) {
                    Statics.field1927[0].method5411(field680 + arg2 - 12, field681 + arg3 - 28);
                }
            }
        }
        if (arg0.field885 != null && (arg1 >= var7 || !arg0.field887 && (field631 == 4 || !arg0.field886 && (field631 == 0 || field631 == 3 || field631 == 1 && ((class61) arg0).method1004())))) {
            method989(arg0, arg0.field926);
            if (field680 > -1 && field668 < field649) {
                field673[field668] = Statics.field3661.method5092(arg0.field885) / 2;
                field672[field668] = Statics.field3661.field3696;
                field670[field668] = field680;
                field671[field668] = field681;
                field674[field668] = arg0.field889;
                field675[field668] = arg0.field928;
                field676[field668] = arg0.field888;
                field722[field668] = arg0.field885;
                field668++;
            }
        }
        for (int var45 = 0; var45 < 4; var45++) {
            int var46 = arg0.field896[var45];
            int var47 = arg0.field913[var45];
            class268 var48 = null;
            int var49 = 0;
            if (var47 >= 0) {
                if (var46 <= field592) {
                    continue;
                }
                var48 = class268.method124(arg0.field913[var45]);
                var49 = var48.field3356;
                if (var48 != null && var48.field3367 != null) {
                    var48 = var48.method4604();
                    if (var48 == null) {
                        arg0.field896[var45] = -1;
                        continue;
                    }
                }
            } else if (var46 < 0) {
                continue;
            }
            int var50 = arg0.field895[var45];
            class268 var51 = null;
            if (var50 >= 0) {
                var51 = class268.method124(var50);
                if (var51 != null && var51.field3367 != null) {
                    var51 = var51.method4604();
                }
            }
            if (var46 - var49 <= field592) {
                if (var48 == null) {
                    arg0.field896[var45] = -1;
                } else {
                    method989(arg0, arg0.field926 / 2);
                    if (field680 > -1) {
                        if (var45 == 1) {
                            field681 -= 20;
                        }
                        if (var45 == 2) {
                            field680 -= 15;
                            field681 -= 10;
                        }
                        if (var45 == 3) {
                            field680 += 15;
                            field681 -= 10;
                        }
                        Object var52 = null;
                        Object var53 = null;
                        Object var54 = null;
                        Object var55 = null;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class319 var64 = null;
                        class319 var65 = null;
                        class319 var66 = null;
                        class319 var67 = null;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        class319 var77 = var48.method4603();
                        if (var77 != null) {
                            var56 = var77.field3788;
                            int var78 = var77.field3789;
                            if (var78 > var76) {
                                var76 = var78;
                            }
                            var60 = var77.field3794;
                        }
                        class319 var79 = var48.method4609();
                        if (var79 != null) {
                            var57 = var79.field3788;
                            int var80 = var79.field3789;
                            if (var80 > var76) {
                                var76 = var80;
                            }
                            var61 = var79.field3794;
                        }
                        class319 var81 = var48.method4605();
                        if (var81 != null) {
                            var58 = var81.field3788;
                            int var82 = var81.field3789;
                            if (var82 > var76) {
                                var76 = var82;
                            }
                            var62 = var81.field3794;
                        }
                        class319 var83 = var48.method4606();
                        if (var83 != null) {
                            var59 = var83.field3788;
                            int var84 = var83.field3789;
                            if (var84 > var76) {
                                var76 = var84;
                            }
                            var63 = var83.field3794;
                        }
                        if (var51 != null) {
                            var64 = var51.method4603();
                            if (var64 != null) {
                                var68 = var64.field3788;
                                int var85 = var64.field3789;
                                if (var85 > var76) {
                                    var76 = var85;
                                }
                                var72 = var64.field3794;
                            }
                            var65 = var51.method4609();
                            if (var65 != null) {
                                var69 = var65.field3788;
                                int var86 = var65.field3789;
                                if (var86 > var76) {
                                    var76 = var86;
                                }
                                var73 = var65.field3794;
                            }
                            var66 = var51.method4605();
                            if (var66 != null) {
                                var70 = var66.field3788;
                                int var87 = var66.field3789;
                                if (var87 > var76) {
                                    var76 = var87;
                                }
                                var74 = var66.field3794;
                            }
                            var67 = var51.method4606();
                            if (var67 != null) {
                                var71 = var67.field3788;
                                int var88 = var67.field3789;
                                if (var88 > var76) {
                                    var76 = var88;
                                }
                                var75 = var67.field3794;
                            }
                        }
                        class299 var89 = var48.method4607();
                        if (var89 == null) {
                            var89 = Statics.field1937;
                        }
                        class299 var90;
                        if (var51 == null) {
                            var90 = Statics.field1937;
                        } else {
                            var90 = var51.method4607();
                            if (var90 == null) {
                                var90 = Statics.field1937;
                            }
                        }
                        Object var91 = null;
                        String var92 = null;
                        boolean var93 = false;
                        int var94 = 0;
                        String var95 = var48.method4623(arg0.field893[var45]);
                        int var96 = var89.method5092(var95);
                        if (var51 != null) {
                            var92 = var51.method4623(arg0.field922[var45]);
                            var94 = var90.method5092(var92);
                        }
                        int var97 = 0;
                        int var98 = 0;
                        if (var57 > 0) {
                            if (var81 == null && var83 == null) {
                                var97 = 1;
                            } else {
                                var97 = var96 / var57 + 1;
                            }
                        }
                        if (var51 != null && var69 > 0) {
                            if (var66 == null && var67 == null) {
                                var98 = 1;
                            } else {
                                var98 = var94 / var69 + 1;
                            }
                        }
                        int var99 = 0;
                        int var100 = var99;
                        if (var56 > 0) {
                            var99 += var56;
                        }
                        var99 += 2;
                        int var101 = var99;
                        if (var58 > 0) {
                            var99 += var58;
                        }
                        int var102 = var99;
                        int var103 = var99;
                        int var105;
                        if (var57 > 0) {
                            int var104 = var57 * var97;
                            var105 = var99 + var104;
                            var103 = (var104 - var96) / 2 + var99;
                        } else {
                            var105 = var96 + var99;
                        }
                        int var106 = var105;
                        if (var59 > 0) {
                            var105 += var59;
                        }
                        int var107 = 0;
                        int var108 = 0;
                        int var109 = 0;
                        int var110 = 0;
                        int var111 = 0;
                        if (var51 != null) {
                            var105 += 2;
                            var107 = var105;
                            if (var68 > 0) {
                                var105 += var68;
                            }
                            var105 += 2;
                            var108 = var105;
                            if (var70 > 0) {
                                var105 += var70;
                            }
                            var109 = var105;
                            var111 = var105;
                            if (var69 > 0) {
                                int var112 = var69 * var98;
                                var105 += var112;
                                var111 += (var112 - var94) / 2;
                            } else {
                                var105 += var94;
                            }
                            var110 = var105;
                            if (var71 > 0) {
                                var105 += var71;
                            }
                        }
                        int var113 = arg0.field896[var45] - field592;
                        int var114 = var48.field3366 - var48.field3366 * var113 / var48.field3356;
                        int var115 = var48.field3362 * var113 / var48.field3356 + -var48.field3362;
                        int var116 = field680 + arg2 - (var105 >> 1) + var114;
                        int var117 = field681 + arg3 - 12 + var115;
                        int var118 = var117;
                        int var119 = var76 + var117;
                        int var120 = var48.field3348 + var117 + 15;
                        int var121 = var120 - var89.field3697;
                        int var122 = var89.field3698 + var120;
                        if (var121 < var117) {
                            var118 = var121;
                        }
                        if (var122 > var119) {
                            var119 = var122;
                        }
                        int var123 = 0;
                        if (var51 != null) {
                            var123 = var51.field3348 + var117 + 15;
                            int var124 = var123 - var90.field3697;
                            int var125 = var90.field3698 + var123;
                            if (var124 < var118) {
                                ;
                            }
                            if (var125 > var119) {
                                ;
                            }
                        }
                        int var128 = 255;
                        if (var48.field3355 >= 0) {
                            var128 = (var113 << 8) / (var48.field3356 - var48.field3355);
                        }
                        if (var128 >= 0 && var128 < 255) {
                            if (var77 != null) {
                                var77.method5417(var100 + var116 - var60, var117, var128);
                            }
                            if (var81 != null) {
                                var81.method5417(var101 + var116 - var62, var117, var128);
                            }
                            if (var79 != null) {
                                for (int var129 = 0; var129 < var97; var129++) {
                                    var79.method5417(var57 * var129 + (var102 + var116 - var61), var117, var128);
                                }
                            }
                            if (var83 != null) {
                                var83.method5417(var106 + var116 - var63, var117, var128);
                            }
                            var89.method5098(var95, var103 + var116, var120, var48.field3365, 0, var128);
                            if (var51 != null) {
                                if (var64 != null) {
                                    var64.method5417(var107 + var116 - var72, var117, var128);
                                }
                                if (var66 != null) {
                                    var66.method5417(var108 + var116 - var74, var117, var128);
                                }
                                if (var65 != null) {
                                    for (int var130 = 0; var130 < var98; var130++) {
                                        var65.method5417(var69 * var130 + (var109 + var116 - var73), var117, var128);
                                    }
                                }
                                if (var67 != null) {
                                    var67.method5417(var110 + var116 - var75, var117, var128);
                                }
                                var90.method5098(var92, var111 + var116, var123, var51.field3365, 0, var128);
                            }
                        } else {
                            if (var77 != null) {
                                var77.method5411(var100 + var116 - var60, var117);
                            }
                            if (var81 != null) {
                                var81.method5411(var101 + var116 - var62, var117);
                            }
                            if (var79 != null) {
                                for (int var131 = 0; var131 < var97; var131++) {
                                    var79.method5411(var57 * var131 + (var102 + var116 - var61), var117);
                                }
                            }
                            if (var83 != null) {
                                var83.method5411(var106 + var116 - var63, var117);
                            }
                            var89.method5097(var95, var103 + var116, var120, var48.field3365 | 0xFF000000, 0);
                            if (var51 != null) {
                                if (var64 != null) {
                                    var64.method5411(var107 + var116 - var72, var117);
                                }
                                if (var66 != null) {
                                    var66.method5411(var108 + var116 - var74, var117);
                                }
                                if (var65 != null) {
                                    for (int var132 = 0; var132 < var98; var132++) {
                                        var65.method5411(var69 * var132 + (var109 + var116 - var73), var117);
                                    }
                                }
                                if (var67 != null) {
                                    var67.method5411(var110 + var116 - var75, var117);
                                }
                                var90.method5097(var92, var111 + var116, var123, var51.field3365 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.gh(IIIII)V")
    public static final void method159(int arg0, int arg1, int arg2, int arg3) {
        if (field622) {
            if (field685 == 1) {
                Statics.field1998[field804 / 100].method5411(field682 - 8, field683 - 8);
            }
            if (field685 == 2) {
                Statics.field1998[field804 / 100 + 4].method5411(field682 - 8, field683 - 8);
            }
        }
        field695 = 0;
        int var4 = (Statics.field1877.field932 >> 7) + Statics.field869;
        int var5 = (Statics.field1877.field882 >> 7) + Statics.field755;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field695 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field695 = 1;
        }
        if (field695 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field695 = 0;
        }
    }

    @ObfuscatedName("bh.gm(Lba;IB)V")
    public static final void method989(class64 arg0, int arg1) {
        method4225(arg0.field932, arg0.field882, arg1);
    }

    @ObfuscatedName("iy.gj(IIII)V")
    public static final void method4225(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field680 = -1;
            field681 = -1;
            return;
        }
        int var3 = method422(arg0, arg1, Statics.field83) - arg2;
        int var4 = arg0 - Statics.field1432;
        int var5 = var3 - Statics.field1703;
        int var6 = arg1 - Statics.field2564;
        int var7 = class123.field1682[Statics.field42];
        int var8 = class123.field1694[Statics.field42];
        int var9 = class123.field1682[Statics.field1202];
        int var10 = class123.field1694[Statics.field1202];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field680 = field841 * var11 / var15 + field839 / 2;
            field681 = field841 * var14 / var15 + field663 / 2;
        } else {
            field680 = -1;
            field681 = -1;
        }
    }

    @ObfuscatedName("ah.gl(IIII)I")
    public static final int method422(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class51.field444[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class51.field460[var5][var3][var4] + class51.field460[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class51.field460[var5][var3][var4 + 1] + class51.field460[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("am.gx(IIIIIIB)V")
    public static final void method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class123.field1682[var6];
            int var12 = class123.field1694[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class123.field1682[var7];
            int var15 = class123.field1694[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1432 = arg0 - var8;
        Statics.field1703 = arg1 - var9;
        Statics.field2564 = arg2 - var10;
        Statics.field42 = arg3;
        Statics.field1202 = arg4;
        if (field656 == 1 && field748 >= 2 && field592 % 50 == 0 && (Statics.field1429 >> 7 != Statics.field1877.field932 >> 7 || Statics.field24 >> 7 != Statics.field1877.field882 >> 7)) {
            int var17 = Statics.field1877.field568;
            int var18 = (Statics.field1429 >> 7) + Statics.field869;
            int var19 = (Statics.field24 >> 7) + Statics.field755;
            method178(var18, var19, var17, true);
        }
    }

    @ObfuscatedName("ag.gy(ZLgi;I)V")
    public static final void method915(boolean arg0, class190 arg1) {
        field760 = arg0;
        if (!field760) {
            int var2 = arg1.method3316();
            int var3 = arg1.method3349();
            int var4 = arg1.method3253();
            Statics.field974 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field974[var5][var6] = arg1.method3374();
                }
            }
            Statics.field1901 = new int[var4];
            Statics.field3677 = new int[var4];
            Statics.field57 = new int[var4];
            Statics.field2253 = new byte[var4][];
            Statics.field254 = new byte[var4][];
            boolean var7 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
                var7 = true;
            }
            if (var2 / 8 == 48 && var3 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                for (int var10 = (var3 - 6) / 8; var10 <= (var3 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field1901[var8] = var11;
                        Statics.field3677[var8] = Statics.field3160.method4264("m" + var9 + "_" + var10);
                        Statics.field57[var8] = Statics.field3160.method4264("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method1433(var2, var3, true);
            return;
        }
        int var12 = arg1.method3288();
        int var13 = arg1.method3288();
        boolean var14 = arg1.method3247() == 1;
        int var15 = arg1.method3253();
        arg1.method3515();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3509(1);
                    if (var19 == 1) {
                        field646[var16][var17][var18] = arg1.method3509(26);
                    } else {
                        field646[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3508();
        Statics.field974 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field974[var20][var21] = arg1.method3374();
            }
        }
        Statics.field1901 = new int[var15];
        Statics.field3677 = new int[var15];
        Statics.field57 = new int[var15];
        Statics.field2253 = new byte[var15][];
        Statics.field254 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field646[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1901[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1901[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field3677[var22] = Statics.field3160.method4264("m" + var31 + "_" + var32);
                            Statics.field57[var22] = Statics.field3160.method4264("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method1433(var12, var13, !var14);
    }

    @ObfuscatedName("bl.ga(IIZI)V")
    public static final void method1433(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field225 == arg0 && Statics.field302 == arg1) {
            return;
        }
        Statics.field225 = arg0;
        Statics.field302 = arg1;
        method868(25);
        method1804(class238.field2801, true);
        int var3 = Statics.field869;
        int var4 = Statics.field755;
        Statics.field869 = (arg0 - 6) * 8;
        Statics.field755 = (arg1 - 6) * 8;
        int var5 = Statics.field869 - var3;
        int var6 = Statics.field755 - var4;
        int var7 = Statics.field869;
        int var8 = Statics.field755;
        for (int var9 = 0; var9 < 32768; var9++) {
            class73 var10 = field844[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field923[var11] -= var5;
                    var10.field873[var11] -= var6;
                }
                var10.field932 -= var5 * 128;
                var10.field882 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class61 var13 = field611[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field923[var14] -= var5;
                    var13.field873[var14] -= var6;
                }
                var13.field932 -= var5 * 128;
                var13.field882 -= var6 * 128;
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
                        field709[var25][var21][var22] = field709[var25][var23][var24];
                    } else {
                        field709[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class63 var26 = (class63) field715.method3790(); var26 != null; var26 = (class63) field715.method3771()) {
            var26.field858 -= var5;
            var26.field859 -= var6;
            if (var26.field858 < 0 || var26.field859 < 0 || var26.field858 >= 104 || var26.field859 >= 104) {
                var26.method3756();
            }
        }
        if (field809 != 0) {
            field809 -= var5;
            field810 -= var6;
        }
        field657 = 0;
        field823 = false;
        Statics.field1432 -= var5 << 7;
        Statics.field2564 -= var6 << 7;
        Statics.field1429 -= var5 << 7;
        Statics.field24 -= var6 << 7;
        field652 = -1;
        field712.method3764();
        field711.method3764();
        for (int var27 = 0; var27 < 4; var27++) {
            field643[var27].method3098();
        }
    }

    @ObfuscatedName("g.gn(ZB)V")
    public static final void method138(boolean arg0) {
        method938();
        field627.field1225++;
        if (field627.field1225 < 50 && !arg0) {
            return;
        }
        field627.field1225 = 0;
        if (field757 || field627.method1850() == null) {
            return;
        }
        class173 var1 = Statics.method414(class170.field2212, field627.field1219);
        field627.method1847(var1);
        try {
            field627.method1846();
        } catch (IOException var3) {
            field757 = true;
        }
    }

    @ObfuscatedName("m.gw(I)V")
    public static final void method149() {
        method138(false);
        field634 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2253.length; var1++) {
            if (Statics.field3677[var1] != -1 && Statics.field2253[var1] == null) {
                Statics.field2253[var1] = Statics.field3160.method4247(Statics.field3677[var1], 0);
                if (Statics.field2253[var1] == null) {
                    var0 = false;
                    field634++;
                }
            }
            if (Statics.field57[var1] != -1 && Statics.field254[var1] == null) {
                Statics.field254[var1] = Statics.field3160.method4250(Statics.field57[var1], 0, Statics.field974[var1]);
                if (Statics.field254[var1] == null) {
                    var0 = false;
                    field634++;
                }
            }
        }
        if (!var0) {
            field752 = 1;
            return;
        }
        field636 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2253.length; var3++) {
            byte[] var4 = Statics.field254[var3];
            if (var4 != null) {
                int var5 = (Statics.field1901[var3] >> 8) * 64 - Statics.field869;
                int var6 = (Statics.field1901[var3] & 0xFF) * 64 - Statics.field755;
                if (field760) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class51.method498(var4, var5, var6);
            }
        }
        if (!var2) {
            field752 = 2;
            return;
        }
        if (field752 != 0) {
            method1804(class238.field2801 + class75.field1051 + class75.field1054 + 100 + "%" + class75.field1055, true);
        }
        method938();
        Statics.field249.method2699();
        for (int var7 = 0; var7 < 4; var7++) {
            field643[var7].method3098();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class51.field444[var8][var9][var10] = 0;
                }
            }
        }
        method938();
        class51.method616();
        int var11 = Statics.field2253.length;
        for (class69 var12 = (class69) class69.field986.method3790(); var12 != null; var12 = (class69) class69.field986.method3771()) {
            if (var12.field994 != null) {
                Statics.field311.method1876(var12.field994);
                var12.field994 = null;
            }
            if (var12.field981 != null) {
                Statics.field311.method1876(var12.field981);
                var12.field981 = null;
            }
        }
        class69.field986.method3764();
        method138(true);
        if (!field760) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field1901[var13] >> 8) * 64 - Statics.field869;
                int var15 = (Statics.field1901[var13] & 0xFF) * 64 - Statics.field755;
                byte[] var16 = Statics.field2253[var13];
                if (var16 != null) {
                    method938();
                    int var17 = Statics.field225 * 8 - 48;
                    int var18 = Statics.field302 * 8 - 48;
                    class165[] var19 = field643;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field2030[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class183 var23 = new class183(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                class51.method1496(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (Statics.field1901[var27] >> 8) * 64 - Statics.field869;
                int var29 = (Statics.field1901[var27] & 0xFF) * 64 - Statics.field755;
                byte[] var30 = Statics.field2253[var27];
                if (var30 == null && Statics.field302 < 800) {
                    method938();
                    class51.method3213(var28, var29, 64, 64);
                }
            }
            method138(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = Statics.field254[var31];
                if (var32 != null) {
                    int var33 = (Statics.field1901[var31] >> 8) * 64 - Statics.field869;
                    int var34 = (Statics.field1901[var31] & 0xFF) * 64 - Statics.field755;
                    method938();
                    class126 var35 = Statics.field249;
                    class165[] var36 = field643;
                    class183 var37 = new class183(var32);
                    int var38 = -1;
                    while (true) {
                        int var39 = var37.method3266();
                        if (var39 == 0) {
                            break;
                        }
                        var38 += var39;
                        int var40 = 0;
                        while (true) {
                            int var41 = var37.method3265();
                            if (var41 == 0) {
                                break;
                            }
                            var40 += var41 - 1;
                            int var42 = var40 & 0x3F;
                            int var43 = var40 >> 6 & 0x3F;
                            int var44 = var40 >> 12;
                            int var45 = var37.method3247();
                            int var46 = var45 >> 2;
                            int var47 = var45 & 0x3;
                            int var48 = var33 + var43;
                            int var49 = var34 + var42;
                            if (var48 > 0 && var49 > 0 && var48 < 103 && var49 < 103) {
                                int var50 = var44;
                                if ((class51.field444[1][var48][var49] & 0x2) == 2) {
                                    var50 = var44 - 1;
                                }
                                class165 var51 = null;
                                if (var50 >= 0) {
                                    var51 = var36[var50];
                                }
                                class51.method3153(var44, var48, var49, var38, var47, var46, var35, var51);
                            }
                        }
                    }
                }
            }
        }
        if (field760) {
            for (int var52 = 0; var52 < 4; var52++) {
                method938();
                for (int var53 = 0; var53 < 13; var53++) {
                    for (int var54 = 0; var54 < 13; var54++) {
                        boolean var55 = false;
                        int var56 = field646[var52][var53][var54];
                        if (var56 != -1) {
                            int var57 = var56 >> 24 & 0x3;
                            int var58 = var56 >> 1 & 0x3;
                            int var59 = var56 >> 14 & 0x3FF;
                            int var60 = var56 >> 3 & 0x7FF;
                            int var61 = (var59 / 8 << 8) + var60 / 8;
                            for (int var62 = 0; var62 < Statics.field1901.length; var62++) {
                                if (Statics.field1901[var62] == var61 && Statics.field2253[var62] != null) {
                                    byte[] var63 = Statics.field2253[var62];
                                    int var64 = var53 * 8;
                                    int var65 = var54 * 8;
                                    int var66 = (var59 & 0x7) * 8;
                                    int var67 = (var60 & 0x7) * 8;
                                    class165[] var68 = field643;
                                    for (int var69 = 0; var69 < 8; var69++) {
                                        for (int var70 = 0; var70 < 8; var70++) {
                                            if (var64 + var69 > 0 && var64 + var69 < 103 && var65 + var70 > 0 && var65 + var70 < 103) {
                                                var68[var52].field2030[var64 + var69][var65 + var70] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class183 var71 = new class183(var63);
                                    for (int var72 = 0; var72 < 4; var72++) {
                                        for (int var73 = 0; var73 < 64; var73++) {
                                            for (int var74 = 0; var74 < 64; var74++) {
                                                if (var57 == var72 && var73 >= var66 && var73 < var66 + 8 && var74 >= var67 && var74 < var67 + 8) {
                                                    int var78 = var73 & 0x7;
                                                    int var79 = var74 & 0x7;
                                                    int var81 = var58 & 0x3;
                                                    int var82;
                                                    if (var81 == 0) {
                                                        var82 = var78;
                                                    } else if (var81 == 1) {
                                                        var82 = var79;
                                                    } else if (var81 == 2) {
                                                        var82 = 7 - var78;
                                                    } else {
                                                        var82 = 7 - var79;
                                                    }
                                                    class51.method1496(var71, var52, var64 + var82, var65 + class230.method1684(var73 & 0x7, var74 & 0x7, var58), 0, 0, var58);
                                                } else {
                                                    class51.method1496(var71, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var55 = true;
                                    break;
                                }
                            }
                        }
                        if (!var55) {
                            class51.method3067(var52, var53 * 8, var54 * 8);
                        }
                    }
                }
            }
            for (int var83 = 0; var83 < 13; var83++) {
                for (int var84 = 0; var84 < 13; var84++) {
                    int var85 = field646[0][var83][var84];
                    if (var85 == -1) {
                        class51.method3213(var83 * 8, var84 * 8, 8, 8);
                    }
                }
            }
            method138(true);
            for (int var86 = 0; var86 < 4; var86++) {
                method938();
                for (int var87 = 0; var87 < 13; var87++) {
                    label972: for (int var88 = 0; var88 < 13; var88++) {
                        int var89 = field646[var86][var87][var88];
                        if (var89 != -1) {
                            int var90 = var89 >> 24 & 0x3;
                            int var91 = var89 >> 1 & 0x3;
                            int var92 = var89 >> 14 & 0x3FF;
                            int var93 = var89 >> 3 & 0x7FF;
                            int var94 = (var92 / 8 << 8) + var93 / 8;
                            for (int var95 = 0; var95 < Statics.field1901.length; var95++) {
                                if (Statics.field1901[var95] == var94 && Statics.field254[var95] != null) {
                                    byte[] var96 = Statics.field254[var95];
                                    int var97 = var87 * 8;
                                    int var98 = var88 * 8;
                                    int var99 = (var92 & 0x7) * 8;
                                    int var100 = (var93 & 0x7) * 8;
                                    class126 var101 = Statics.field249;
                                    class165[] var102 = field643;
                                    class183 var103 = new class183(var96);
                                    int var104 = -1;
                                    while (true) {
                                        int var105 = var103.method3266();
                                        if (var105 == 0) {
                                            continue label972;
                                        }
                                        var104 += var105;
                                        int var106 = 0;
                                        while (true) {
                                            int var107 = var103.method3265();
                                            if (var107 == 0) {
                                                break;
                                            }
                                            var106 += var107 - 1;
                                            int var108 = var106 & 0x3F;
                                            int var109 = var106 >> 6 & 0x3F;
                                            int var110 = var106 >> 12;
                                            int var111 = var103.method3247();
                                            int var112 = var111 >> 2;
                                            int var113 = var111 & 0x3;
                                            if (var90 == var110 && var109 >= var99 && var109 < var99 + 8 && var108 >= var100 && var108 < var100 + 8) {
                                                class269 var114 = class269.method2323(var104);
                                                int var116 = var109 & 0x7;
                                                int var117 = var108 & 0x7;
                                                int var119 = var114.field3385;
                                                int var120 = var114.field3386;
                                                if ((var113 & 0x1) == 1) {
                                                    int var121 = var119;
                                                    var119 = var120;
                                                    var120 = var121;
                                                }
                                                int var122 = var91 & 0x3;
                                                int var123;
                                                if (var122 == 0) {
                                                    var123 = var116;
                                                } else if (var122 == 1) {
                                                    var123 = var117;
                                                } else if (var122 == 2) {
                                                    var123 = 7 - var116 - (var119 - 1);
                                                } else {
                                                    var123 = 7 - var117 - (var120 - 1);
                                                }
                                                int var124 = var97 + var123;
                                                int var125 = var98 + class230.method1837(var109 & 0x7, var108 & 0x7, var91, var114.field3385, var114.field3386, var113);
                                                if (var124 > 0 && var125 > 0 && var124 < 103 && var125 < 103) {
                                                    int var126 = var86;
                                                    if ((class51.field444[1][var124][var125] & 0x2) == 2) {
                                                        var126 = var86 - 1;
                                                    }
                                                    class165 var127 = null;
                                                    if (var126 >= 0) {
                                                        var127 = var102[var126];
                                                    }
                                                    class51.method3153(var86, var124, var125, var104, var91 + var113 & 0x3, var112, var101, var127);
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
        method138(true);
        method938();
        class126 var128 = Statics.field249;
        class165[] var129 = field643;
        for (int var130 = 0; var130 < 4; var130++) {
            for (int var131 = 0; var131 < 104; var131++) {
                for (int var132 = 0; var132 < 104; var132++) {
                    if ((class51.field444[var130][var131][var132] & 0x1) == 1) {
                        int var133 = var130;
                        if ((class51.field444[1][var131][var132] & 0x2) == 2) {
                            var133 = var130 - 1;
                        }
                        if (var133 >= 0) {
                            var129[var133].method3101(var131, var132);
                        }
                    }
                }
            }
        }
        class51.field458 += (int) (Math.random() * 5.0D) - 2;
        if (class51.field458 < -8) {
            class51.field458 = -8;
        }
        if (class51.field458 > 8) {
            class51.field458 = 8;
        }
        class51.field456 += (int) (Math.random() * 5.0D) - 2;
        if (class51.field456 < -16) {
            class51.field456 = -16;
        }
        if (class51.field456 > 16) {
            class51.field456 = 16;
        }
        for (int var134 = 0; var134 < 4; var134++) {
            byte[][] var135 = Statics.field448[var134];
            int var136 = (int) Math.sqrt(5100.0D);
            int var137 = var136 * 768 >> 8;
            for (int var138 = 1; var138 < 103; var138++) {
                for (int var139 = 1; var139 < 103; var139++) {
                    int var140 = class51.field460[var134][var139 + 1][var138] - class51.field460[var134][var139 - 1][var138];
                    int var141 = class51.field460[var134][var139][var138 + 1] - class51.field460[var134][var139][var138 - 1];
                    int var142 = (int) Math.sqrt((double) (var141 * var141 + var140 * var140 + 65536));
                    int var143 = (var140 << 8) / var142;
                    int var144 = 65536 / var142;
                    int var145 = (var141 << 8) / var142;
                    int var146 = (var145 * -50 + var143 * -50 + var144 * -10) / var137 + 96;
                    int var147 = (var135[var139][var138] >> 1) + (var135[var139][var138 + 1] >> 3) + (var135[var139][var138 - 1] >> 2) + (var135[var139 - 1][var138] >> 2) + (var135[var139 + 1][var138] >> 3);
                    Statics.field449[var139][var138] = var146 - var147;
                }
            }
            for (int var148 = 0; var148 < 104; var148++) {
                Statics.field455[var148] = 0;
                Statics.field3726[var148] = 0;
                Statics.field1036[var148] = 0;
                Statics.field3326[var148] = 0;
                Statics.field3138[var148] = 0;
            }
            for (int var149 = -5; var149 < 109; var149++) {
                for (int var150 = 0; var150 < 104; var150++) {
                    int var151 = var149 + 5;
                    int var10002;
                    if (var151 >= 0 && var151 < 104) {
                        int var152 = Statics.field446[var134][var151][var150] & 0xFF;
                        if (var152 > 0) {
                            class260 var153 = class260.method874(var152 - 1);
                            Statics.field455[var150] += var153.field3285;
                            Statics.field3726[var150] += var153.field3288;
                            Statics.field1036[var150] += var153.field3287;
                            Statics.field3326[var150] += var153.field3282;
                            var10002 = Statics.field3138[var150]++;
                        }
                    }
                    int var154 = var149 - 5;
                    if (var154 >= 0 && var154 < 104) {
                        int var155 = Statics.field446[var134][var154][var150] & 0xFF;
                        if (var155 > 0) {
                            class260 var156 = class260.method874(var155 - 1);
                            Statics.field455[var150] -= var156.field3285;
                            Statics.field3726[var150] -= var156.field3288;
                            Statics.field1036[var150] -= var156.field3287;
                            Statics.field3326[var150] -= var156.field3282;
                            var10002 = Statics.field3138[var150]--;
                        }
                    }
                }
                if (var149 >= 1 && var149 < 103) {
                    int var157 = 0;
                    int var158 = 0;
                    int var159 = 0;
                    int var160 = 0;
                    int var161 = 0;
                    for (int var162 = -5; var162 < 109; var162++) {
                        int var163 = var162 + 5;
                        if (var163 >= 0 && var163 < 104) {
                            var157 += Statics.field455[var163];
                            var158 += Statics.field3726[var163];
                            var159 += Statics.field1036[var163];
                            var160 += Statics.field3326[var163];
                            var161 += Statics.field3138[var163];
                        }
                        int var164 = var162 - 5;
                        if (var164 >= 0 && var164 < 104) {
                            var157 -= Statics.field455[var164];
                            var158 -= Statics.field3726[var164];
                            var159 -= Statics.field1036[var164];
                            var160 -= Statics.field3326[var164];
                            var161 -= Statics.field3138[var164];
                        }
                        if (var162 >= 1 && var162 < 103 && (!field586 || (class51.field444[0][var149][var162] & 0x2) != 0 || (class51.field444[var134][var149][var162] & 0x10) == 0)) {
                            if (var134 < class51.field443) {
                                class51.field443 = var134;
                            }
                            int var165 = Statics.field446[var134][var149][var162] & 0xFF;
                            int var166 = Statics.field2034[var134][var149][var162] & 0xFF;
                            if (var165 > 0 || var166 > 0) {
                                int var167 = class51.field460[var134][var149][var162];
                                int var168 = class51.field460[var134][var149 + 1][var162];
                                int var169 = class51.field460[var134][var149 + 1][var162 + 1];
                                int var170 = class51.field460[var134][var149][var162 + 1];
                                int var171 = Statics.field449[var149][var162];
                                int var172 = Statics.field449[var149 + 1][var162];
                                int var173 = Statics.field449[var149 + 1][var162 + 1];
                                int var174 = Statics.field449[var149][var162 + 1];
                                int var175 = -1;
                                int var176 = -1;
                                if (var165 > 0) {
                                    int var177 = var157 * 256 / var160;
                                    int var178 = var158 / var161;
                                    int var179 = var159 / var161;
                                    var175 = class51.method501(var177, var178, var179);
                                    int var180 = class51.field458 + var177 & 0xFF;
                                    int var181 = class51.field456 + var179;
                                    if (var181 < 0) {
                                        var181 = 0;
                                    } else if (var181 > 255) {
                                        var181 = 255;
                                    }
                                    var176 = class51.method501(var180, var178, var181);
                                }
                                if (var134 > 0) {
                                    boolean var182 = true;
                                    if (var165 == 0 && Statics.field447[var134][var149][var162] != 0) {
                                        var182 = false;
                                    }
                                    if (var166 > 0 && !class273.method16(var166 - 1).field3524) {
                                        var182 = false;
                                    }
                                    if (var182 && var167 == var168 && var167 == var169 && var167 == var170) {
                                        Statics.field326[var134][var149][var162] |= 0x924;
                                    }
                                }
                                int var183 = 0;
                                if (var176 != -1) {
                                    var183 = class123.field1676[class51.method2092(var176, 96)];
                                }
                                if (var166 == 0) {
                                    var128.method2796(var134, var149, var162, 0, 0, -1, var167, var168, var169, var170, class51.method2092(var175, var171), class51.method2092(var175, var172), class51.method2092(var175, var173), class51.method2092(var175, var174), 0, 0, 0, 0, var183, 0);
                                } else {
                                    int var184 = Statics.field447[var134][var149][var162] + 1;
                                    byte var185 = Statics.field160[var134][var149][var162];
                                    class273 var186 = class273.method16(var166 - 1);
                                    int var187 = var186.field3527;
                                    int var188;
                                    int var189;
                                    if (var187 >= 0) {
                                        var188 = Statics.field1668.method2356(var187);
                                        var189 = -1;
                                    } else if (var186.field3534 == 16711935) {
                                        var189 = -2;
                                        var187 = -1;
                                        var188 = -2;
                                    } else {
                                        var189 = class51.method501(var186.field3526, var186.field3531, var186.field3532);
                                        int var190 = class51.field458 + var186.field3526 & 0xFF;
                                        int var191 = class51.field456 + var186.field3532;
                                        if (var191 < 0) {
                                            var191 = 0;
                                        } else if (var191 > 255) {
                                            var191 = 255;
                                        }
                                        var188 = class51.method501(var190, var186.field3531, var191);
                                    }
                                    int var192 = 0;
                                    if (var188 != -2) {
                                        var192 = class123.field1676[class51.method480(var188, 96)];
                                    }
                                    if (var186.field3529 != -1) {
                                        int var193 = class51.field458 + var186.field3528 & 0xFF;
                                        int var194 = class51.field456 + var186.field3535;
                                        if (var194 < 0) {
                                            var194 = 0;
                                        } else if (var194 > 255) {
                                            var194 = 255;
                                        }
                                        int var195 = class51.method501(var193, var186.field3533, var194);
                                        var192 = class123.field1676[class51.method480(var195, 96)];
                                    }
                                    var128.method2796(var134, var149, var162, var184, var185, var187, var167, var168, var169, var170, class51.method2092(var175, var171), class51.method2092(var175, var172), class51.method2092(var175, var173), class51.method2092(var175, var174), class51.method480(var189, var171), class51.method480(var189, var172), class51.method480(var189, var173), class51.method480(var189, var174), var183, var192);
                                }
                            }
                        }
                    }
                }
            }
            for (int var196 = 1; var196 < 103; var196++) {
                for (int var197 = 1; var197 < 103; var197++) {
                    int var202;
                    if ((class51.field444[var134][var197][var196] & 0x8) != 0) {
                        var202 = 0;
                    } else if (var134 <= 0 || (class51.field444[1][var197][var196] & 0x2) == 0) {
                        var202 = var134;
                    } else {
                        var202 = var134 - 1;
                    }
                    var128.method2672(var134, var197, var196, var202);
                }
            }
            Statics.field446[var134] = (byte[][]) null;
            Statics.field2034[var134] = (byte[][]) null;
            Statics.field447[var134] = (byte[][]) null;
            Statics.field160[var134] = (byte[][]) null;
            Statics.field448[var134] = (byte[][]) null;
        }
        var128.method2834(-50, -10, -50);
        for (int var203 = 0; var203 < 104; var203++) {
            for (int var204 = 0; var204 < 104; var204++) {
                if ((class51.field444[1][var203][var204] & 0x2) == 2) {
                    var128.method2837(var203, var204);
                }
            }
        }
        int var205 = 1;
        int var206 = 2;
        int var207 = 4;
        for (int var208 = 0; var208 < 4; var208++) {
            if (var208 > 0) {
                var205 <<= 0x3;
                var206 <<= 0x3;
                var207 <<= 0x3;
            }
            for (int var209 = 0; var209 <= var208; var209++) {
                for (int var210 = 0; var210 <= 104; var210++) {
                    for (int var211 = 0; var211 <= 104; var211++) {
                        if ((Statics.field326[var209][var211][var210] & var205) != 0) {
                            int var212 = var210;
                            int var213 = var210;
                            int var214 = var209;
                            int var215 = var209;
                            while (var212 > 0 && (Statics.field326[var209][var211][var212 - 1] & var205) != 0) {
                                var212--;
                            }
                            while (var213 < 104 && (Statics.field326[var209][var211][var213 + 1] & var205) != 0) {
                                var213++;
                            }
                            label700: while (var214 > 0) {
                                for (int var216 = var212; var216 <= var213; var216++) {
                                    if ((Statics.field326[var214 - 1][var211][var216] & var205) == 0) {
                                        break label700;
                                    }
                                }
                                var214--;
                            }
                            label689: while (var215 < var208) {
                                for (int var217 = var212; var217 <= var213; var217++) {
                                    if ((Statics.field326[var215 + 1][var211][var217] & var205) == 0) {
                                        break label689;
                                    }
                                }
                                var215++;
                            }
                            int var218 = (var215 + 1 - var214) * (var213 - var212 + 1);
                            if (var218 >= 8) {
                                short var219 = 240;
                                int var220 = class51.field460[var215][var211][var212] - var219;
                                int var221 = class51.field460[var214][var211][var212];
                                class126.method2793(var208, 1, var211 * 128, var211 * 128, var212 * 128, var213 * 128 + 128, var220, var221);
                                for (int var222 = var214; var222 <= var215; var222++) {
                                    for (int var223 = var212; var223 <= var213; var223++) {
                                        Statics.field326[var222][var211][var223] &= ~var205;
                                    }
                                }
                            }
                        }
                        if ((Statics.field326[var209][var211][var210] & var206) != 0) {
                            int var224 = var211;
                            int var225 = var211;
                            int var226 = var209;
                            int var227 = var209;
                            while (var224 > 0 && (Statics.field326[var209][var224 - 1][var210] & var206) != 0) {
                                var224--;
                            }
                            while (var225 < 104 && (Statics.field326[var209][var225 + 1][var210] & var206) != 0) {
                                var225++;
                            }
                            label753: while (var226 > 0) {
                                for (int var228 = var224; var228 <= var225; var228++) {
                                    if ((Statics.field326[var226 - 1][var228][var210] & var206) == 0) {
                                        break label753;
                                    }
                                }
                                var226--;
                            }
                            label742: while (var227 < var208) {
                                for (int var229 = var224; var229 <= var225; var229++) {
                                    if ((Statics.field326[var227 + 1][var229][var210] & var206) == 0) {
                                        break label742;
                                    }
                                }
                                var227++;
                            }
                            int var230 = (var227 + 1 - var226) * (var225 - var224 + 1);
                            if (var230 >= 8) {
                                short var231 = 240;
                                int var232 = class51.field460[var227][var224][var210] - var231;
                                int var233 = class51.field460[var226][var224][var210];
                                class126.method2793(var208, 2, var224 * 128, var225 * 128 + 128, var210 * 128, var210 * 128, var232, var233);
                                for (int var234 = var226; var234 <= var227; var234++) {
                                    for (int var235 = var224; var235 <= var225; var235++) {
                                        Statics.field326[var234][var235][var210] &= ~var206;
                                    }
                                }
                            }
                        }
                        if ((Statics.field326[var209][var211][var210] & var207) != 0) {
                            int var236 = var211;
                            int var237 = var211;
                            int var238 = var210;
                            int var239 = var210;
                            while (var238 > 0 && (Statics.field326[var209][var211][var238 - 1] & var207) != 0) {
                                var238--;
                            }
                            while (var239 < 104 && (Statics.field326[var209][var211][var239 + 1] & var207) != 0) {
                                var239++;
                            }
                            label806: while (var236 > 0) {
                                for (int var240 = var238; var240 <= var239; var240++) {
                                    if ((Statics.field326[var209][var236 - 1][var240] & var207) == 0) {
                                        break label806;
                                    }
                                }
                                var236--;
                            }
                            label795: while (var237 < 104) {
                                for (int var241 = var238; var241 <= var239; var241++) {
                                    if ((Statics.field326[var209][var237 + 1][var241] & var207) == 0) {
                                        break label795;
                                    }
                                }
                                var237++;
                            }
                            if ((var237 - var236 + 1) * (var239 - var238 + 1) >= 4) {
                                int var242 = class51.field460[var209][var236][var238];
                                class126.method2793(var208, 4, var236 * 128, var237 * 128 + 128, var238 * 128, var239 * 128 + 128, var242, var242);
                                for (int var243 = var236; var243 <= var237; var243++) {
                                    for (int var244 = var238; var244 <= var239; var244++) {
                                        Statics.field326[var209][var243][var244] &= ~var207;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method138(true);
        int var245 = class51.field443;
        if (var245 > Statics.field83) {
            var245 = Statics.field83;
        }
        if (var245 < Statics.field83 - 1) {
            int var246 = Statics.field83 - 1;
        }
        if (field586) {
            Statics.field249.method2700(class51.field443);
        } else {
            Statics.field249.method2700(0);
        }
        for (int var247 = 0; var247 < 104; var247++) {
            for (int var248 = 0; var248 < 104; var248++) {
                method4417(var247, var248);
            }
        }
        method938();
        method3070();
        class269.field3392.method3676();
        if (Statics.field2335.method722()) {
            class173 var249 = Statics.method414(class170.field2149, field627.field1219);
            var249.field2258.method3410(1057001181);
            field627.method1847(var249);
        }
        if (!field760) {
            int var250 = (Statics.field225 - 6) / 8;
            int var251 = (Statics.field225 + 6) / 8;
            int var252 = (Statics.field302 - 6) / 8;
            int var253 = (Statics.field302 + 6) / 8;
            for (int var254 = var250 - 1; var254 <= var251 + 1; var254++) {
                for (int var255 = var252 - 1; var255 <= var253 + 1; var255++) {
                    if (var254 < var250 || var254 > var251 || var255 < var252 || var255 > var253) {
                        Statics.field3160.method4270("m" + var254 + "_" + var255);
                        Statics.field3160.method4270("l" + var254 + "_" + var255);
                    }
                }
            }
        }
        method868(30);
        method938();
        Statics.method873();
        class173 var256 = Statics.method414(class170.field2225, field627.field1219);
        field627.method1847(var256);
        Statics.field369.method2967();
        for (int var257 = 0; var257 < 32; var257++) {
            field395[var257] = 0L;
        }
        for (int var258 = 0; var258 < 32; var258++) {
            field405[var258] = 0L;
        }
        Statics.field49 = 0;
    }

    @ObfuscatedName("hv.gf(IIIIII)V")
    public static final void method4056(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field249.method2694(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field249.method2698(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L;
            if (var11) {
                boolean var12 = (int) (var5 >>> 16 & 0x1L) == 1;
                var11 = !var12;
            }
            if (var11) {
                var10 = arg4;
            }
            int[] var14 = Statics.field1039.field3792;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class121.method594(var5);
            class269 var17 = class269.method2323(var16);
            if (var17.field3416 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var14[var15] = var10;
                        var14[var15 + 512] = var10;
                        var14[var15 + 1024] = var10;
                        var14[var15 + 1536] = var10;
                    } else if (var8 == 1) {
                        var14[var15] = var10;
                        var14[var15 + 1] = var10;
                        var14[var15 + 2] = var10;
                        var14[var15 + 3] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 3] = var10;
                        var14[var15 + 3 + 512] = var10;
                        var14[var15 + 3 + 1024] = var10;
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var14[var15 + 1536] = var10;
                        var14[var15 + 1536 + 1] = var10;
                        var14[var15 + 1536 + 2] = var10;
                        var14[var15 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var14[var15] = var10;
                    } else if (var8 == 1) {
                        var14[var15 + 3] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var14[var15 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var14[var15] = var10;
                        var14[var15 + 512] = var10;
                        var14[var15 + 1024] = var10;
                        var14[var15 + 1536] = var10;
                    } else if (var8 == 0) {
                        var14[var15] = var10;
                        var14[var15 + 1] = var10;
                        var14[var15 + 2] = var10;
                        var14[var15 + 3] = var10;
                    } else if (var8 == 1) {
                        var14[var15 + 3] = var10;
                        var14[var15 + 3 + 512] = var10;
                        var14[var15 + 3 + 1024] = var10;
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 1536] = var10;
                        var14[var15 + 1536 + 1] = var10;
                        var14[var15 + 1536 + 2] = var10;
                        var14[var15 + 1536 + 3] = var10;
                    }
                }
            } else {
                class318 var18 = Statics.field215[var17.field3416];
                if (var18 != null) {
                    int var19 = (var17.field3385 * 4 - var18.field3781) / 2;
                    int var20 = (var17.field3386 * 4 - var18.field3782) / 2;
                    var18.method5389(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field3386) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field249.method2696(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field249.method2698(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class121.method594(var21);
            class269 var27 = class269.method2323(var26);
            if (var27.field3416 != -1) {
                class318 var28 = Statics.field215[var27.field3416];
                if (var28 != null) {
                    int var29 = (var27.field3385 * 4 - var28.field3781) / 2;
                    int var30 = (var27.field3386 * 4 - var28.field3782) / 2;
                    var28.method5389(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field3386) * 4 + 48 + var30);
                }
            } else if (var25 == 9) {
                int var31 = 15658734;
                if (class121.method1576(var21)) {
                    var31 = 15597568;
                }
                int[] var32 = Statics.field1039.field3792;
                int var33 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var24 == 0 || var24 == 2) {
                    var32[var33 + 1536] = var31;
                    var32[var33 + 1024 + 1] = var31;
                    var32[var33 + 512 + 2] = var31;
                    var32[var33 + 3] = var31;
                } else {
                    var32[var33] = var31;
                    var32[var33 + 512 + 1] = var31;
                    var32[var33 + 1024 + 2] = var31;
                    var32[var33 + 1536 + 3] = var31;
                }
            }
        }
        long var34 = Statics.field249.method2697(arg0, arg1, arg2);
        if (var34 == 0L) {
            return;
        }
        int var36 = class121.method594(var34);
        class269 var37 = class269.method2323(var36);
        if (var37.field3416 == -1) {
            return;
        }
        class318 var38 = Statics.field215[var37.field3416];
        if (var38 != null) {
            int var39 = (var37.field3385 * 4 - var38.field3781) / 2;
            int var40 = (var37.field3386 * 4 - var38.field3782) / 2;
            var38.method5389(arg1 * 4 + 48 + var39, (104 - arg2 - var37.field3386) * 4 + 48 + var40);
        }
    }

    @ObfuscatedName("client.hp(Lcf;B)Z")
    public final boolean method1064(class88 arg0) {
        class158 var2 = arg0.method1850();
        class190 var3 = arg0.field1220;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1221 == null) {
                if (arg0.field1223) {
                    if (!var2.method3046(1)) {
                        return false;
                    }
                    var2.method3039(arg0.field1220.field2339, 0, 1);
                    arg0.field1229 = 0;
                    arg0.field1223 = false;
                }
                var3.field2340 = 0;
                if (var3.method3513()) {
                    if (!var2.method3046(1)) {
                        return false;
                    }
                    var2.method3039(arg0.field1220.field2339, 1, 1);
                    arg0.field1229 = 0;
                }
                arg0.field1223 = true;
                class169[] var4 = new class169[] { class169.field2101, class169.field2051, class169.field2052, class169.field2071, class169.field2054, class169.field2055, class169.field2056, class169.field2123, class169.field2084, class169.field2066, class169.field2060, class169.field2061, class169.field2062, class169.field2063, class169.field2064, class169.field2107, class169.field2108, class169.field2070, class169.field2129, class169.field2106, class169.field2117, class169.field2112, class169.field2072, class169.field2073, class169.field2115, class169.field2075, class169.field2076, class169.field2059, class169.field2078, class169.field2079, class169.field2132, class169.field2081, class169.field2082, class169.field2128, class169.field2080, class169.field2085, class169.field2086, class169.field2087, class169.field2088, class169.field2089, class169.field2090, class169.field2091, class169.field2092, class169.field2093, class169.field2094, class169.field2077, class169.field2096, class169.field2097, class169.field2098, class169.field2099, class169.field2100, class169.field2083, class169.field2102, class169.field2103, class169.field2095, class169.field2105, class169.field2068, class169.field2065, class169.field2120, class169.field2109, class169.field2110, class169.field2050, class169.field2069, class169.field2113, class169.field2114, class169.field2130, class169.field2116, class169.field2074, class169.field2118, class169.field2119, class169.field2125, class169.field2121, class169.field2122, class169.field2104, class169.field2124, class169.field2067, class169.field2126, class169.field2131, class169.field2127, class169.field2058, class169.field2057, class169.field2111, class169.field2053, class169.field2133 };
                int var6 = var3.method3533();
                if (var6 < 0 || var6 >= var4.length) {
                    throw new IOException(var6 + " " + var3.field2340);
                }
                arg0.field1221 = var4[var6];
                arg0.field1226 = arg0.field1221.field2135;
            }
            if (arg0.field1226 == -1) {
                if (!var2.method3046(1)) {
                    return false;
                }
                arg0.method1850().method3039(var3.field2339, 0, 1);
                arg0.field1226 = var3.field2339[0] & 0xFF;
            }
            if (arg0.field1226 == -2) {
                if (!var2.method3046(2)) {
                    return false;
                }
                arg0.method1850().method3039(var3.field2339, 0, 2);
                var3.field2340 = 0;
                arg0.field1226 = var3.method3253();
            }
            if (!var2.method3046(arg0.field1226)) {
                return false;
            }
            var3.field2340 = 0;
            var2.method3039(var3.field2339, 0, arg0.field1226);
            arg0.field1229 = 0;
            field805.method4850();
            arg0.field1228 = arg0.field1227;
            arg0.field1227 = arg0.field1216;
            arg0.field1216 = arg0.field1221;
            if (class169.field2132 == arg0.field1221) {
                String var7 = var3.method3441();
                long var8 = (long) var3.method3253();
                long var10 = (long) var3.method3255();
                class243 var12 = (class243) class178.method1685(class243.method197(), var3.method3247());
                long var13 = (var8 << 32) + var10;
                boolean var15 = false;
                for (int var16 = 0; var16 < 100; var16++) {
                    if (field798[var16] == var13) {
                        var15 = true;
                        break;
                    }
                }
                if (Statics.field2333.method1523(new class292(var7, Statics.field307))) {
                    var15 = true;
                }
                if (!var15 && field695 == 0) {
                    field798[field799] = var13;
                    field799 = (field799 + 1) % 100;
                    String var20;
                    try {
                        int var17 = var3.method3265();
                        if (var17 > 32767) {
                            var17 = 32767;
                        }
                        byte[] var18 = new byte[var17];
                        var3.field2340 += Statics.field3713.method3183(var3.field2339, var3.field2340, var18, 0, var17);
                        String var19 = class302.method1710(var18, 0, var17);
                        var20 = var19;
                    } catch (Exception var258) {
                        var20 = "Cabbage";
                    }
                    String var23 = class300.method5096(class306.method919(var20));
                    byte var24;
                    if (var12.field3127) {
                        var24 = 7;
                    } else {
                        var24 = 3;
                    }
                    if (var12.field3129 == -1) {
                        class84.method2942(var24, var7, var23);
                    } else {
                        int var26 = var12.field3129;
                        String var27 = "<img=" + var26 + ">";
                        class84.method2942(var24, var27 + var7, var23);
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2104 == arg0.field1221) {
                boolean var28 = var3.method3258();
                if (!var28) {
                    Statics.field176 = null;
                } else if (Statics.field176 == null) {
                    Statics.field176 = new class252();
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2085 == arg0.field1221) {
                int var29 = var3.method3316();
                if (var29 == 65535) {
                    var29 = -1;
                }
                int var30 = var3.method3312();
                int var31 = var3.method3473();
                int var32 = var3.method3349();
                if (var32 == 65535) {
                    var32 = -1;
                }
                for (int var33 = var29; var33 <= var32; var33++) {
                    long var34 = ((long) var30 << 32) + (long) var33;
                    class205 var36 = field784.method3712(var34);
                    if (var36 != null) {
                        var36.method3756();
                    }
                    field784.method3708(new class212(var31), var34);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2072 == arg0.field1221) {
                int var37 = var3.method3374();
                int var38 = var3.method3253();
                if (var37 < -70000) {
                    var38 += 32768;
                }
                class231 var39;
                if (var37 >= 0) {
                    var39 = class231.method415(var37);
                } else {
                    var39 = null;
                }
                while (var3.field2340 < arg0.field1226) {
                    int var40 = var3.method3265();
                    int var41 = var3.method3253();
                    int var42 = 0;
                    if (var41 != 0) {
                        var42 = var3.method3247();
                        if (var42 == 255) {
                            var42 = var3.method3374();
                        }
                    }
                    if (var39 != null && var40 >= 0 && var40 < var39.field2725.length) {
                        var39.field2725[var40] = var41;
                        var39.field2726[var40] = var42;
                    }
                    class54.method97(var38, var40, var41 - 1, var42);
                }
                if (var39 != null) {
                    method1035(var39);
                }
                Statics.method5076();
                field767[++field768 - 1 & 0x1F] = var38 & 0x7FFF;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2109 == arg0.field1221) {
                Statics.field2569 = var3.method3247();
                Statics.field525 = var3.method3280();
                while (var3.field2340 < arg0.field1226) {
                    int var43 = var3.method3247();
                    class172[] var44 = new class172[] { class172.field2250, class172.field2243, class172.field2245, class172.field2244, class172.field2246, class172.field2247, class172.field2242, class172.field2249, class172.field2248, class172.field2251 };
                    class172 var45 = var44[var43];
                    method440(var45);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2118 == arg0.field1221) {
                method2057();
                arg0.field1221 = null;
                return false;
            }
            if (class169.field2101 == arg0.field1221) {
                int var46 = var3.method3473();
                int var47 = var3.method3316();
                class231 var48 = class231.method415(var46);
                if (var48.field2666 != 2 || var48.field2594 != var47) {
                    var48.field2666 = 2;
                    var48.field2594 = var47;
                    method1035(var48);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2086 == arg0.field1221) {
                method915(false, arg0.field1220);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2117 == arg0.field1221) {
                int var49 = var3.method3312();
                boolean var50 = var3.method3310() == 1;
                class231 var51 = class231.method415(var49);
                if (var51.field2626 != var50) {
                    var51.field2626 = var50;
                    method1035(var51);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2071 == arg0.field1221) {
                String var52 = var3.method3441();
                Object[] var53 = new Object[var52.length() + 1];
                for (int var54 = var52.length() - 1; var54 >= 0; var54--) {
                    if (var52.charAt(var54) == 's') {
                        var53[var54 + 1] = var3.method3441();
                    } else {
                        var53[var54 + 1] = Integer.valueOf(var3.method3374());
                    }
                }
                var53[0] = Integer.valueOf(var3.method3374());
                class57 var55 = new class57();
                var55.field513 = var53;
                class70.method1589(var55);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2111 == arg0.field1221) {
                method915(true, arg0.field1220);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2122 == arg0.field1221) {
                for (int var56 = 0; var56 < Statics.field3233; var56++) {
                    class255 var57 = Statics.method1442(var56);
                    if (var57 != null) {
                        class226.field2560[var56] = 0;
                        class226.field2559[var56] = 0;
                    }
                }
                Statics.method5076();
                field766 += 32;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2115 == arg0.field1221) {
                String var58 = var3.method3441();
                long var59 = var3.method3257();
                long var61 = (long) var3.method3253();
                long var63 = (long) var3.method3255();
                class243 var65 = (class243) class178.method1685(class243.method197(), var3.method3247());
                long var66 = (var61 << 32) + var63;
                boolean var68 = false;
                for (int var69 = 0; var69 < 100; var69++) {
                    if (field798[var69] == var66) {
                        var68 = true;
                        break;
                    }
                }
                if (var65.field3128 && Statics.field2333.method1523(new class292(var58, Statics.field307))) {
                    var68 = true;
                }
                if (!var68 && field695 == 0) {
                    field798[field799] = var66;
                    field799 = (field799 + 1) % 100;
                    String var73;
                    try {
                        int var70 = var3.method3265();
                        if (var70 > 32767) {
                            var70 = 32767;
                        }
                        byte[] var71 = new byte[var70];
                        var3.field2340 += Statics.field3713.method3183(var3.field2339, var3.field2340, var71, 0, var70);
                        String var72 = class302.method1710(var71, 0, var70);
                        var73 = var72;
                    } catch (Exception var257) {
                        var73 = "Cabbage";
                    }
                    String var76 = class300.method5096(class306.method919(var73));
                    if (var65.field3129 == -1) {
                        class84.method3175(9, var58, var76, class304.method3160(var59));
                    } else {
                        int var77 = var65.field3129;
                        String var78 = "<img=" + var77 + ">";
                        class84.method3175(9, var78 + var58, var76, class304.method3160(var59));
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2053 == arg0.field1221) {
                field811 = var3.method3247();
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2112 == arg0.field1221) {
                int var79 = var3.method3265();
                boolean var80 = var3.method3247() == 1;
                String var81 = "";
                boolean var82 = false;
                if (var80) {
                    var81 = var3.method3441();
                    if (Statics.field2333.method1523(new class292(var81, Statics.field307))) {
                        var82 = true;
                    }
                }
                String var83 = var3.method3441();
                if (!var82) {
                    class84.method2942(var79, var81, var83);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2127 == arg0.field1221) {
                int var84 = var3.method3253();
                int var85 = var3.method3247();
                int var86 = var3.method3253();
                if (field815 != 0 && var85 != 0 && field657 < 50) {
                    field818[field657] = var84;
                    field677[field657] = var85;
                    field820[field657] = var86;
                    field720[field657] = null;
                    field821[field657] = 0;
                    field657++;
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2098 == arg0.field1221) {
                field823 = true;
                Statics.field457 = var3.method3247();
                Statics.field3083 = var3.method3247();
                Statics.field69 = var3.method3253();
                Statics.field1034 = var3.method3247();
                Statics.field1835 = var3.method3247();
                if (Statics.field1835 >= 100) {
                    int var90 = Statics.field457 * 128 + 64;
                    int var91 = Statics.field3083 * 128 + 64;
                    int var92 = method422(var90, var91, Statics.field83) - Statics.field69;
                    int var93 = var90 - Statics.field1432;
                    int var94 = var92 - Statics.field1703;
                    int var95 = var91 - Statics.field2564;
                    int var96 = (int) Math.sqrt((double) (var93 * var93 + var95 * var95));
                    Statics.field42 = (int) (Math.atan2((double) var94, (double) var96) * 325.949D) & 0x7FF;
                    Statics.field1202 = (int) (Math.atan2((double) var93, (double) var95) * -325.949D) & 0x7FF;
                    if (Statics.field42 < 128) {
                        Statics.field42 = 128;
                    }
                    if (Statics.field42 > 383) {
                        Statics.field42 = 383;
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2067 == arg0.field1221) {
                method440(class172.field2243);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2068 == arg0.field1221) {
                class82.method3855(var3, arg0.field1226);
                method2059();
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2062 == arg0.field1221) {
                method440(class172.field2249);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2057 == arg0.field1221) {
                Statics.field525 = var3.method3468();
                Statics.field2569 = var3.method3280();
                for (int var97 = Statics.field525; var97 < Statics.field525 + 8; var97++) {
                    for (int var98 = Statics.field2569; var98 < Statics.field2569 + 8; var98++) {
                        if (field709[Statics.field83][var97][var98] != null) {
                            field709[Statics.field83][var97][var98] = null;
                            method4417(var97, var98);
                        }
                    }
                }
                for (class63 var99 = (class63) field715.method3790(); var99 != null; var99 = (class63) field715.method3771()) {
                    if (var99.field858 >= Statics.field525 && var99.field858 < Statics.field525 + 8 && var99.field859 >= Statics.field2569 && var99.field859 < Statics.field2569 + 8 && Statics.field83 == var99.field862) {
                        var99.field861 = 0;
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2050 == arg0.field1221) {
                method440(class172.field2250);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2119 == arg0.field1221) {
                int var100 = var3.method3247();
                int var101 = var3.method3247();
                int var102 = var3.method3247();
                int var103 = var3.method3247();
                field824[var100] = true;
                field825[var100] = var101;
                field826[var100] = var102;
                field827[var100] = var103;
                field706[var100] = 0;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2070 == arg0.field1221) {
                int var104 = var3.method3468();
                int var105 = var3.method3310();
                String var106 = var3.method3441();
                if (var105 >= 1 && var105 <= 8) {
                    if (var106.equalsIgnoreCase(class238.field2798)) {
                        var106 = null;
                    }
                    field705[var105 - 1] = var106;
                    field710[var105 - 1] = var104 == 0;
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2106 == arg0.field1221) {
                method440(class172.field2245);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2093 == arg0.field1221) {
                method440(class172.field2251);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2076 == arg0.field1221) {
                field809 = var3.method3247();
                if (field809 == 255) {
                    field809 = 0;
                }
                field810 = var3.method3247();
                if (field810 == 255) {
                    field810 = 0;
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2123 == arg0.field1221) {
                int var107 = var3.method3374();
                int var108 = var3.method3253();
                if (var107 < -70000) {
                    var108 += 32768;
                }
                class231 var109;
                if (var107 >= 0) {
                    var109 = class231.method415(var107);
                } else {
                    var109 = null;
                }
                if (var109 != null) {
                    for (int var110 = 0; var110 < var109.field2725.length; var110++) {
                        var109.field2725[var110] = 0;
                        var109.field2726[var110] = 0;
                    }
                }
                class54.method2578(var108);
                int var111 = var3.method3253();
                for (int var112 = 0; var112 < var111; var112++) {
                    int var113 = var3.method3247();
                    if (var113 == 255) {
                        var113 = var3.method3312();
                    }
                    int var114 = var3.method3253();
                    if (var109 != null && var112 < var109.field2725.length) {
                        var109.field2725[var112] = var114;
                        var109.field2726[var112] = var113;
                    }
                    class54.method97(var108, var112, var114 - 1, var113);
                }
                if (var109 != null) {
                    method1035(var109);
                }
                Statics.method5076();
                field767[++field768 - 1 & 0x1F] = var108 & 0x7FFF;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2102 == arg0.field1221) {
                int var115 = var3.method3473();
                int var116 = var3.method3253();
                int var117 = var3.method3349();
                int var118 = var3.method3288();
                class231 var119 = class231.method415(var115);
                if (var119.field2657 != var118 || var119.field2658 != var116 || var119.field2705 != var117) {
                    var119.field2657 = var118;
                    var119.field2658 = var116;
                    var119.field2705 = var117;
                    method1035(var119);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2091 == arg0.field1221) {
                int var120 = var3.method3254();
                int var121 = var3.method3298();
                int var122 = var3.method3236();
                class231 var123 = class231.method415(var121);
                if (var123.field2608 != var122 || var123.field2616 != var120 || var123.field2611 != 0 || var123.field2612 != 0) {
                    var123.field2608 = var122;
                    var123.field2616 = var120;
                    var123.field2611 = 0;
                    var123.field2612 = 0;
                    method1035(var123);
                    this.method1069(var123);
                    if (var123.field2722 == 0) {
                        method3094(Statics.field367[var121 >> 16], var123, false);
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2113 == arg0.field1221) {
                var3.field2340 += 28;
                if (var3.method3459()) {
                    method3190(var3, var3.field2340 - 28);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2055 == arg0.field1221) {
                field599 = var3.method3288() * 30;
                field776 = field802;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2095 == arg0.field1221) {
                int var124 = var3.method3316();
                if (var124 == 65535) {
                    var124 = -1;
                }
                int var125 = var3.method3374();
                int var126 = var3.method3298();
                class231 var127 = class231.method415(var125);
                if (var127.field2605) {
                    var127.field2650 = var124;
                    var127.field2728 = var126;
                    class270 var129 = class270.method2359(var124);
                    var127.field2657 = var129.field3440;
                    var127.field2658 = var129.field3441;
                    var127.field2659 = var129.field3475;
                    var127.field2593 = var129.field3443;
                    var127.field2656 = var129.field3444;
                    var127.field2705 = var129.field3439;
                    if (var129.field3445 == 1) {
                        var127.field2665 = 1;
                    } else {
                        var127.field2665 = 2;
                    }
                    if (var127.field2661 > 0) {
                        var127.field2705 = var127.field2705 * 32 / var127.field2661;
                    } else if (var127.field2617 > 0) {
                        var127.field2705 = var127.field2705 * 32 / var127.field2617;
                    }
                    method1035(var127);
                } else if (var124 == -1) {
                    var127.field2666 = 0;
                    arg0.field1221 = null;
                    return true;
                } else {
                    class270 var128 = class270.method2359(var124);
                    var127.field2666 = 4;
                    var127.field2594 = var124;
                    var127.field2657 = var128.field3440;
                    var127.field2658 = var128.field3441;
                    var127.field2705 = var128.field3439 * 100 / var126;
                    method1035(var127);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2059 == arg0.field1221) {
                Statics.field1900 = class308.method3539(var3.method3247());
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2105 == arg0.field1221) {
                int var130 = var3.method3247();
                method2866(var130);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2084 == arg0.field1221) {
                method4241(true, var3);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2074 == arg0.field1221) {
                field823 = true;
                Statics.field204 = var3.method3247();
                Statics.field1929 = var3.method3247();
                Statics.field2556 = var3.method3253();
                Statics.field3155 = var3.method3247();
                Statics.field1198 = var3.method3247();
                if (Statics.field1198 >= 100) {
                    Statics.field1432 = Statics.field204 * 128 + 64;
                    Statics.field2564 = Statics.field1929 * 128 + 64;
                    Statics.field1703 = method422(Statics.field1432, Statics.field2564, Statics.field83) - Statics.field2556;
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2075 == arg0.field1221) {
                int var131 = var3.method3374();
                if (field854 != var131) {
                    field854 = var131;
                    if (field656 == 1) {
                        field664 = true;
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2110 == arg0.field1221) {
                field600 = var3.method3247();
                if (field600 == 1) {
                    field601 = var3.method3253();
                }
                if (field600 >= 2 && field600 <= 6) {
                    if (field600 == 2) {
                        field606 = 64;
                        field638 = 64;
                    }
                    if (field600 == 3) {
                        field606 = 0;
                        field638 = 64;
                    }
                    if (field600 == 4) {
                        field606 = 128;
                        field638 = 64;
                    }
                    if (field600 == 5) {
                        field606 = 64;
                        field638 = 0;
                    }
                    if (field600 == 6) {
                        field606 = 64;
                        field638 = 128;
                    }
                    field600 = 2;
                    field603 = var3.method3253();
                    field819 = var3.method3253();
                    field605 = var3.method3247();
                }
                if (field600 == 10) {
                    field580 = var3.method3253();
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2056 == arg0.field1221) {
                class314.method173(var3, arg0.field1226);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2087 == arg0.field1221) {
                int var132 = var3.method3374();
                String var133 = var3.method3441();
                class231 var134 = class231.method415(var132);
                if (!var133.equals(var134.field2668)) {
                    var134.field2668 = var133;
                    method1035(var134);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2100 == arg0.field1221) {
                int var135 = var3.method3298();
                int var136 = var3.method3288();
                class226.field2560[var136] = var135;
                if (class226.field2559[var136] != var135) {
                    class226.field2559[var136] = var135;
                }
                method670(var136);
                field765[++field766 - 1 & 0x1F] = var136;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2108 == arg0.field1221) {
                int var137 = var3.method3253();
                field684 = var137;
                this.method1068(false);
                method3854(var137);
                class70.method2884(field684);
                for (int var138 = 0; var138 < 100; var138++) {
                    field698[var138] = true;
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2061 == arg0.field1221) {
                int var139 = var3.method3374();
                class56 var140 = (class56) field742.method3712((long) var139);
                if (var140 != null) {
                    method242(var140, true);
                }
                if (field745 != null) {
                    method1035(field745);
                    field745 = null;
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2107 == arg0.field1221) {
                if (Statics.field95 != null) {
                    Statics.field95.method5064(var3);
                }
                method14();
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2130 == arg0.field1221) {
                int var141 = var3.method3291();
                int var142 = var3.method3312();
                class231 var143 = class231.method415(var142);
                if (var143.field2596 != var141 || var141 == -1) {
                    var143.field2596 = var141;
                    var143.field2729 = 0;
                    var143.field2614 = 0;
                    method1035(var143);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2073 == arg0.field1221) {
                for (int var144 = 0; var144 < field611.length; var144++) {
                    if (field611[var144] != null) {
                        field611[var144].field904 = -1;
                    }
                }
                for (int var145 = 0; var145 < field844.length; var145++) {
                    if (field844[var145] != null) {
                        field844[var145].field904 = -1;
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2124 == arg0.field1221) {
                Statics.field2333.method1518();
                field648 = field802;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2060 == arg0.field1221) {
                Statics.method5076();
                int var146 = var3.method3473();
                int var147 = var3.method3280();
                int var148 = var3.method3310();
                field641[var147] = var146;
                field713[var147] = var148;
                field714[var147] = 1;
                for (int var149 = 0; var149 < 98; var149++) {
                    if (var146 >= class235.field2780[var149]) {
                        field714[var147] = var149 + 2;
                    }
                }
                field691[++field770 - 1 & 0x1F] = var147;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2090 == arg0.field1221) {
                int var150 = var3.method3374();
                int var151 = var3.method3374();
                int var152 = class48.method583();
                class173 var153 = Statics.method414(class170.field2177, field627.field1219);
                var153.field2258.method3277(field394);
                var153.field2258.method3376(var150);
                var153.field2258.method3376(var151);
                var153.field2258.method3277(var152);
                field627.method1847(var153);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2103 == arg0.field1221) {
                Statics.method5076();
                field783 = var3.method3254();
                field776 = field802;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2077 == arg0.field1221) {
                if (field684 != -1) {
                    int var154 = field684;
                    if (class231.method4540(var154)) {
                        method1794(Statics.field367[var154], 0);
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2121 == arg0.field1221) {
                Statics.field2333.method1572(var3, arg0.field1226);
                field648 = field802;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2120 == arg0.field1221) {
                method440(class172.field2248);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2126 == arg0.field1221) {
                method440(class172.field2244);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2114 == arg0.field1221) {
                if (arg0.field1226 == 0) {
                    Statics.field95 = null;
                } else {
                    if (Statics.field95 == null) {
                        Statics.field95 = new class294(Statics.field307, Statics.field2335);
                    }
                    Statics.field95.method5043(var3);
                }
                method14();
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2116 == arg0.field1221) {
                String var155 = var3.method3441();
                Statics.field2014 = var155;
                try {
                    String var156 = Statics.field2335.getParameter(class280.field3597.field3592);
                    String var157 = Statics.field2335.getParameter(class280.field3582.field3592);
                    String var158 = var156 + "settings=" + var155 + "; version=1; path=/; domain=" + var157;
                    String var159;
                    if (var155.length() == 0) {
                        var159 = var158 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var160 = var158 + "; Expires=";
                        long var161 = class185.method3250() + 94608000000L;
                        class193.field2390.setTime(new Date(var161));
                        int var163 = class193.field2390.get(7);
                        int var164 = class193.field2390.get(5);
                        int var165 = class193.field2390.get(2);
                        int var166 = class193.field2390.get(1);
                        int var167 = class193.field2390.get(11);
                        int var168 = class193.field2390.get(12);
                        int var169 = class193.field2390.get(13);
                        String var170 = class193.field2391[var163 - 1] + ", " + var164 / 10 + var164 % 10 + "-" + class193.field2393[0][var165] + "-" + var166 + " " + var167 / 10 + var167 % 10 + ":" + var168 / 10 + var168 % 10 + ":" + var169 / 10 + var169 % 10 + " GMT";
                        var159 = var160 + var170 + "; Max-Age=" + 94608000L;
                    }
                    client var171 = Statics.field2335;
                    String var172 = "document.cookie=\"" + var159 + "\"";
                    JSObject.getWindow(var171).eval(var172);
                } catch (Throwable var256) {
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2081 == arg0.field1221) {
                int var174 = var3.method3247();
                if (var3.method3247() == 0) {
                    field845[var174] = new class5();
                    var3.field2340 += 18;
                } else {
                    var3.field2340--;
                    field845[var174] = new class5(var3, false);
                }
                field794 = field802;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2051 == arg0.field1221) {
                method440(class172.field2246);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2096 == arg0.field1221) {
                Statics.method5076();
                field746 = var3.method3247();
                field776 = field802;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2089 == arg0.field1221) {
                int var175 = var3.method3298();
                class231 var176 = class231.method415(var175);
                for (int var177 = 0; var177 < var176.field2725.length; var177++) {
                    var176.field2725[var177] = -1;
                    var176.field2725[var177] = 0;
                }
                method1035(var176);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2069 == arg0.field1221) {
                Statics.field2569 = var3.method3280();
                Statics.field525 = var3.method3468();
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2079 == arg0.field1221) {
                int var178 = var3.method3316();
                if (var178 == 65535) {
                    var178 = -1;
                }
                if (var178 == -1 && !field814) {
                    class218.method89();
                } else if (var178 != -1 && field813 != var178 && field812 != 0 && !field814) {
                    class218.method1495(2, Statics.field1148, var178, 0, field812, false);
                }
                field813 = var178;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2052 == arg0.field1221) {
                int var179 = var3.method3294();
                int var180 = var3.method3288();
                if (var180 == 65535) {
                    var180 = -1;
                }
                method886(var180, var179);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2083 == arg0.field1221) {
                field823 = false;
                for (int var181 = 0; var181 < 5; var181++) {
                    field824[var181] = false;
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2054 == arg0.field1221) {
                int var182 = var3.method3473();
                int var183 = var3.method3349();
                int var184 = var183 >> 10 & 0x1F;
                int var185 = var183 >> 5 & 0x1F;
                int var186 = var183 & 0x1F;
                int var187 = (var186 << 3) + (var184 << 19) + (var185 << 11);
                class231 var188 = class231.method415(var182);
                if (var188.field2631 != var187) {
                    var188.field2631 = var187;
                    method1035(var188);
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2125 == arg0.field1221) {
                int var189 = var3.method3312();
                class231 var190 = class231.method415(var189);
                var190.field2666 = 3;
                var190.field2594 = Statics.field1877.field547.method4117();
                method1035(var190);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2128 == arg0.field1221) {
                method4241(false, var3);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2066 == arg0.field1221) {
                method440(class172.field2247);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2082 == arg0.field1221) {
                method440(class172.field2242);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2094 == arg0.field1221) {
                field796 = var3.method3310();
                field631 = var3.method3310();
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2133 == arg0.field1221) {
                boolean var191 = var3.method3247() == 1;
                if (var191) {
                    Statics.field1014 = class185.method3250() - var3.method3257();
                    Statics.field155 = new class2(var3, true);
                } else {
                    Statics.field155 = null;
                }
                field775 = field802;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2099 == arg0.field1221) {
                byte var192 = var3.method3313();
                int var193 = var3.method3288();
                class226.field2560[var193] = var192;
                if (class226.field2559[var193] != var192) {
                    class226.field2559[var193] = var192;
                }
                method670(var193);
                field765[++field766 - 1 & 0x1F] = var193;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2078 == arg0.field1221) {
                int var194 = var3.method3316();
                class54.method3210(var194);
                field767[++field768 - 1 & 0x1F] = var194 & 0x7FFF;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2088 == arg0.field1221) {
                int var195 = var3.method3253();
                int var196 = var3.method3298();
                int var197 = var3.method3288();
                class231 var198 = class231.method415(var196);
                var198.field2733 = (var195 << 16) + var197;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2063 == arg0.field1221) {
                Statics.field2333.field976.method4923(var3, arg0.field1226);
                class84.method831();
                if (Statics.field95 != null) {
                    Statics.field95.method5048();
                }
                field648 = field802;
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2064 == arg0.field1221) {
                int var199 = var3.method3312();
                int var200 = var3.method3473();
                class56 var201 = (class56) field742.method3712((long) var199);
                class56 var202 = (class56) field742.method3712((long) var200);
                if (var202 != null) {
                    method242(var202, var201 == null || var201.field502 != var202.field502);
                }
                if (var201 != null) {
                    var201.method3756();
                    field742.method3708(var201, (long) var200);
                }
                class231 var203 = class231.method415(var199);
                if (var203 != null) {
                    method1035(var203);
                }
                class231 var204 = class231.method415(var200);
                if (var204 != null) {
                    method1035(var204);
                    method3094(Statics.field367[var204.field2692 >>> 16], var204, true);
                }
                if (field684 != -1) {
                    int var205 = field684;
                    if (class231.method4540(var205)) {
                        method1794(Statics.field367[var205], 1);
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2097 == arg0.field1221) {
                class66 var206 = new class66();
                var206.field951 = var3.method3441();
                var206.field948 = var3.method3253();
                int var207 = var3.method3374();
                var206.field949 = var207;
                method868(45);
                var2.method3041();
                Object var208 = null;
                class79.method1050(var206);
                arg0.field1221 = null;
                return false;
            }
            if (class169.field2058 == arg0.field1221) {
                int var209 = var3.method3468();
                int var210 = var3.method3298();
                int var211 = var3.method3316();
                class56 var212 = (class56) field742.method3712((long) var210);
                if (var212 != null) {
                    method242(var212, var212.field502 != var211);
                }
                class56 var213 = new class56();
                var213.field502 = var211;
                var213.field495 = var209;
                field742.method3708(var213, (long) var210);
                method3854(var211);
                class231 var214 = class231.method415(var210);
                method1035(var214);
                if (field745 != null) {
                    method1035(field745);
                    field745 = null;
                }
                method3151();
                method3094(Statics.field367[var210 >> 16], var214, false);
                class70.method2884(var211);
                if (field684 != -1) {
                    int var215 = field684;
                    if (class231.method4540(var215)) {
                        method1794(Statics.field367[var215], 1);
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2129 == arg0.field1221) {
                int var216 = var3.method3473();
                int var217 = var3.method3316();
                class231 var218 = class231.method415(var216);
                if (var218 != null && var218.field2722 == 0) {
                    if (var217 > var218.field2630 - var218.field2622) {
                        var217 = var218.field2630 - var218.field2622;
                    }
                    if (var217 < 0) {
                        var217 = 0;
                    }
                    if (var218.field2664 != var217) {
                        var218.field2664 = var217;
                        method1035(var218);
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2092 == arg0.field1221) {
                String var219 = var3.method3441();
                String var223;
                try {
                    int var220 = var3.method3265();
                    if (var220 > 32767) {
                        var220 = 32767;
                    }
                    byte[] var221 = new byte[var220];
                    var3.field2340 += Statics.field3713.method3183(var3.field2339, var3.field2340, var221, 0, var220);
                    String var222 = class302.method1710(var221, 0, var220);
                    var223 = var222;
                } catch (Exception var255) {
                    var223 = "Cabbage";
                }
                String var226 = class300.method5096(class306.method919(var223));
                class84.method2942(6, var219, var226);
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2080 == arg0.field1221) {
                int var227 = arg0.field1226 + var3.field2340;
                int var228 = var3.method3253();
                int var229 = var3.method3253();
                if (field684 != var228) {
                    field684 = var228;
                    this.method1068(false);
                    method3854(field684);
                    class70.method2884(field684);
                    for (int var230 = 0; var230 < 100; var230++) {
                        field698[var230] = true;
                    }
                }
                while (var229-- > 0) {
                    int var231 = var3.method3374();
                    int var232 = var3.method3253();
                    int var233 = var3.method3247();
                    class56 var234 = (class56) field742.method3712((long) var231);
                    if (var234 != null && var234.field502 != var232) {
                        method242(var234, true);
                        var234 = null;
                    }
                    if (var234 == null) {
                        class56 var235 = new class56();
                        var235.field502 = var232;
                        var235.field495 = var233;
                        field742.method3708(var235, (long) var231);
                        method3854(var232);
                        class231 var236 = class231.method415(var231);
                        method1035(var236);
                        if (field745 != null) {
                            method1035(field745);
                            field745 = null;
                        }
                        method3151();
                        method3094(Statics.field367[var231 >> 16], var236, false);
                        class70.method2884(var232);
                        if (field684 != -1) {
                            int var237 = field684;
                            if (class231.method4540(var237)) {
                                method1794(Statics.field367[var237], 1);
                            }
                        }
                        var234 = var235;
                    }
                    var234.field497 = true;
                }
                for (class56 var239 = (class56) field742.method3710(); var239 != null; var239 = (class56) field742.method3711()) {
                    if (var239.field497) {
                        var239.field497 = false;
                    } else {
                        method242(var239, true);
                    }
                }
                field784 = new class203(512);
                while (var3.field2340 < var227) {
                    int var240 = var3.method3374();
                    int var241 = var3.method3253();
                    int var242 = var3.method3253();
                    int var243 = var3.method3374();
                    for (int var244 = var241; var244 <= var242; var244++) {
                        long var245 = ((long) var240 << 32) + (long) var244;
                        field784.method3708(new class212(var243), var245);
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2065 == arg0.field1221) {
                for (int var247 = 0; var247 < class226.field2559.length; var247++) {
                    if (class226.field2560[var247] != class226.field2559[var247]) {
                        class226.field2559[var247] = class226.field2560[var247];
                        method670(var247);
                        field765[++field766 - 1 & 0x1F] = var247;
                    }
                }
                arg0.field1221 = null;
                return true;
            }
            if (class169.field2131 == arg0.field1221) {
                int var248 = var3.method3473();
                int var249 = var3.method3253();
                class231 var250 = class231.method415(var248);
                if (var250.field2666 != 1 || var250.field2594 != var249) {
                    var250.field2666 = 1;
                    var250.field2594 = var249;
                    method1035(var250);
                }
                arg0.field1221 = null;
                return true;
            }
            class153.method66("" + (arg0.field1221 == null ? -1 : arg0.field1221.field2134) + class75.field1052 + (arg0.field1227 == null ? -1 : arg0.field1227.field2134) + class75.field1052 + (arg0.field1228 == null ? -1 : arg0.field1228.field2134) + class75.field1052 + arg0.field1226, (Throwable) null);
            method2057();
        } catch (IOException var259) {
            method477();
        } catch (Exception var260) {
            String var253 = "" + (arg0.field1221 == null ? -1 : arg0.field1221.field2134) + class75.field1052 + (arg0.field1227 == null ? -1 : arg0.field1227.field2134) + class75.field1052 + (arg0.field1228 == null ? -1 : arg0.field1228.field2134) + class75.field1052 + arg0.field1226 + class75.field1052 + (Statics.field869 + Statics.field1877.field923[0]) + class75.field1052 + (Statics.field755 + Statics.field1877.field873[0]) + class75.field1052;
            for (int var254 = 0; var254 < arg0.field1226 && var254 < 50; var254++) {
                var253 = var253 + var3.field2339[var254] + class75.field1052;
            }
            class153.method66(var253, var260);
            method2057();
        }
        return true;
    }

    @ObfuscatedName("aw.hk(Lfl;S)V")
    public static final void method440(class172 arg0) {
        class190 var1 = field627.field1220;
        if (class172.field2247 == arg0) {
            int var2 = var1.method3253();
            int var3 = var1.method3254();
            byte var4 = var1.method3384();
            byte var5 = var1.method3363();
            int var6 = var1.method3247() * 4;
            int var7 = var1.method3468();
            int var8 = var1.method3468();
            int var9 = var1.method3468();
            int var10 = (var9 >> 4 & 0x7) + Statics.field525;
            int var11 = (var9 & 0x7) + Statics.field2569;
            int var12 = var1.method3316();
            int var13 = var1.method3280() * 4;
            int var14 = var1.method3253();
            int var15 = var4 + var10;
            int var16 = var5 + var11;
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var12 != 65535) {
                int var17 = var10 * 128 + 64;
                int var18 = var11 * 128 + 64;
                int var19 = var15 * 128 + 64;
                int var20 = var16 * 128 + 64;
                class80 var21 = new class80(var12, Statics.field83, var17, var18, method422(var17, var18, Statics.field83) - var13, field592 + var14, field592 + var2, var7, var8, var3, var6);
                var21.method1728(var19, var20, method422(var19, var20, Statics.field83) - var6, field592 + var14);
                field711.method3765(var21);
            }
        } else if (class172.field2244 == arg0) {
            int var22 = var1.method3310();
            int var23 = (var22 >> 4 & 0x7) + Statics.field525;
            int var24 = (var22 & 0x7) + Statics.field2569;
            int var25 = var1.method3468();
            int var26 = var25 >> 2;
            int var27 = var25 & 0x3;
            int var28 = field847[var26];
            int var29 = var1.method3316();
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                method4230(Statics.field83, var23, var24, var28, var29, var26, var27, 0, -1);
            }
        } else if (class172.field2249 == arg0) {
            int var30 = var1.method3349();
            int var31 = var1.method3247();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field847[var32];
            int var35 = var1.method3247();
            int var36 = (var35 >> 4 & 0x7) + Statics.field525;
            int var37 = (var35 & 0x7) + Statics.field2569;
            if (var36 >= 0 && var37 >= 0 && var36 < 103 && var37 < 103) {
                if (var34 == 0) {
                    class129 var38 = Statics.field249.method2690(Statics.field83, var36, var37);
                    if (var38 != null) {
                        int var39 = class121.method594(var38.field1787);
                        if (var32 == 2) {
                            var38.field1788 = new class86(var39, 2, var33 + 4, Statics.field83, var36, var37, var30, false, var38.field1788);
                            var38.field1789 = new class86(var39, 2, var33 + 1 & 0x3, Statics.field83, var36, var37, var30, false, var38.field1789);
                        } else {
                            var38.field1788 = new class86(var39, var32, var33, Statics.field83, var36, var37, var30, false, var38.field1788);
                        }
                    }
                }
                if (var34 == 1) {
                    class134 var40 = Statics.field249.method2691(Statics.field83, var36, var37);
                    if (var40 != null) {
                        int var41 = class121.method594(var40.field1825);
                        if (var32 == 4 || var32 == 5) {
                            var40.field1824 = new class86(var41, 4, var33, Statics.field83, var36, var37, var30, false, var40.field1824);
                        } else if (var32 == 6) {
                            var40.field1824 = new class86(var41, 4, var33 + 4, Statics.field83, var36, var37, var30, false, var40.field1824);
                        } else if (var32 == 7) {
                            var40.field1824 = new class86(var41, 4, (var33 + 2 & 0x3) + 4, Statics.field83, var36, var37, var30, false, var40.field1824);
                        } else if (var32 == 8) {
                            var40.field1824 = new class86(var41, 4, var33 + 4, Statics.field83, var36, var37, var30, false, var40.field1824);
                            var40.field1832 = new class86(var41, 4, (var33 + 2 & 0x3) + 4, Statics.field83, var36, var37, var30, false, var40.field1832);
                        }
                    }
                }
                if (var34 == 2) {
                    class135 var42 = Statics.field249.method2692(Statics.field83, var36, var37);
                    if (var32 == 11) {
                        var32 = 10;
                    }
                    if (var42 != null) {
                        var42.field1845 = new class86(class121.method594(var42.field1849), var32, var33, Statics.field83, var36, var37, var30, false, var42.field1845);
                    }
                }
                if (var34 == 3) {
                    class116 var43 = Statics.field249.method2749(Statics.field83, var36, var37);
                    if (var43 != null) {
                        var43.field1525 = new class86(class121.method594(var43.field1527), 22, var33, Statics.field83, var36, var37, var30, false, var43.field1525);
                    }
                }
            }
        } else if (class172.field2242 == arg0) {
            int var44 = var1.method3253();
            int var45 = var1.method3253();
            int var46 = var1.method3468();
            int var47 = (var46 >> 4 & 0x7) + Statics.field525;
            int var48 = (var46 & 0x7) + Statics.field2569;
            int var49 = var1.method3247();
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                int var50 = var47 * 128 + 64;
                int var51 = var48 * 128 + 64;
                class71 var52 = new class71(var44, Statics.field83, var50, var51, method422(var50, var51, Statics.field83) - var49, var45, field592);
                field712.method3765(var52);
            }
        } else if (class172.field2250 == arg0) {
            int var53 = var1.method3468();
            int var54 = (var53 >> 4 & 0x7) + Statics.field525;
            int var55 = (var53 & 0x7) + Statics.field2569;
            int var56 = var1.method3316();
            int var57 = var1.method3288();
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                class81 var58 = new class81();
                var58.field1152 = var56;
                var58.field1149 = var57;
                if (field709[Statics.field83][var54][var55] == null) {
                    field709[Statics.field83][var54][var55] = new class206();
                }
                field709[Statics.field83][var54][var55].method3765(var58);
                method4417(var54, var55);
            }
        } else if (class172.field2248 == arg0) {
            int var59 = var1.method3247();
            int var60 = var59 >> 2;
            int var61 = var59 & 0x3;
            int var62 = field847[var60];
            int var63 = var1.method3468();
            int var64 = (var63 >> 4 & 0x7) + Statics.field525;
            int var65 = (var63 & 0x7) + Statics.field2569;
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                method4230(Statics.field83, var64, var65, var62, -1, var60, var61, 0, -1);
            }
        } else if (class172.field2243 == arg0) {
            int var66 = var1.method3349();
            int var67 = var1.method3280();
            int var68 = (var67 >> 4 & 0x7) + Statics.field525;
            int var69 = (var67 & 0x7) + Statics.field2569;
            if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                class206 var70 = field709[Statics.field83][var68][var69];
                if (var70 != null) {
                    for (class81 var71 = (class81) var70.method3790(); var71 != null; var71 = (class81) var70.method3771()) {
                        if ((var66 & 0x7FFF) == var71.field1152) {
                            var71.method3756();
                            break;
                        }
                    }
                    if (var70.method3790() == null) {
                        field709[Statics.field83][var68][var69] = null;
                    }
                    method4417(var68, var69);
                }
            }
        } else {
            if (class172.field2246 == arg0) {
                int var72 = var1.method3310();
                int var73 = (var72 >> 4 & 0x7) + Statics.field525;
                int var74 = (var72 & 0x7) + Statics.field2569;
                byte var75 = var1.method3384();
                int var76 = var1.method3253();
                int var77 = var1.method3310();
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = field847[var78];
                byte var81 = var1.method3384();
                int var82 = var1.method3253();
                int var83 = var1.method3288();
                byte var84 = var1.method3313();
                int var85 = var1.method3316();
                byte var86 = var1.method3363();
                class61 var87;
                if (field629 == var85) {
                    var87 = Statics.field1877;
                } else {
                    var87 = field611[var85];
                }
                if (var87 != null) {
                    class269 var88 = class269.method2323(var76);
                    int var89;
                    int var90;
                    if (var79 == 1 || var79 == 3) {
                        var89 = var88.field3386;
                        var90 = var88.field3385;
                    } else {
                        var89 = var88.field3385;
                        var90 = var88.field3386;
                    }
                    int var91 = (var89 >> 1) + var73;
                    int var92 = (var89 + 1 >> 1) + var73;
                    int var93 = (var90 >> 1) + var74;
                    int var94 = (var90 + 1 >> 1) + var74;
                    int[][] var95 = class51.field460[Statics.field83];
                    int var96 = var95[var91][var93] + var95[var92][var93] + var95[var91][var94] + var95[var92][var94] >> 2;
                    int var97 = (var73 << 7) + (var89 << 6);
                    int var98 = (var74 << 7) + (var90 << 6);
                    class120 var99 = var88.method4640(var78, var79, var95, var97, var96, var98);
                    if (var99 != null) {
                        method4230(Statics.field83, var73, var74, var80, -1, 0, 0, var82 + 1, var83 + 1);
                        var87.field546 = field592 + var82;
                        var87.field556 = field592 + var83;
                        var87.field564 = var99;
                        var87.field557 = var73 * 128 + var89 * 64;
                        var87.field559 = var74 * 128 + var90 * 64;
                        var87.field558 = var96;
                        if (var84 > var75) {
                            byte var100 = var84;
                            var84 = var75;
                            var75 = var100;
                        }
                        if (var86 > var81) {
                            byte var101 = var86;
                            var86 = var81;
                            var81 = var101;
                        }
                        var87.field560 = var73 + var84;
                        var87.field566 = var73 + var75;
                        var87.field548 = var74 + var86;
                        var87.field554 = var74 + var81;
                    }
                }
            }
            if (class172.field2251 == arg0) {
                int var102 = var1.method3310();
                int var103 = var1.method3247();
                int var104 = var103 >> 4 & 0xF;
                int var105 = var103 & 0x7;
                int var106 = var1.method3310();
                int var107 = (var106 >> 4 & 0x7) + Statics.field525;
                int var108 = (var106 & 0x7) + Statics.field2569;
                int var109 = var1.method3349();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var110 = var104 + 1;
                    if (Statics.field1877.field923[0] >= var107 - var110 && Statics.field1877.field923[0] <= var107 + var110 && Statics.field1877.field873[0] >= var108 - var110 && Statics.field1877.field873[0] <= var108 + var110 && field816 != 0 && var105 > 0 && field657 < 50) {
                        field818[field657] = var109;
                        field677[field657] = var105;
                        field820[field657] = var102;
                        field720[field657] = null;
                        field821[field657] = (var107 << 16) + (var108 << 8) + var104;
                        field657++;
                    }
                }
            }
            if (class172.field2245 == arg0) {
                int var111 = var1.method3247();
                int var112 = (var111 >> 4 & 0x7) + Statics.field525;
                int var113 = (var111 & 0x7) + Statics.field2569;
                int var114 = var1.method3316();
                int var115 = var1.method3316();
                int var116 = var1.method3349();
                if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                    class206 var117 = field709[Statics.field83][var112][var113];
                    if (var117 != null) {
                        for (class81 var118 = (class81) var117.method3790(); var118 != null; var118 = (class81) var117.method3771()) {
                            if ((var115 & 0x7FFF) == var118.field1152 && var118.field1149 == var116) {
                                var118.field1149 = var114;
                                break;
                            }
                        }
                        method4417(var112, var113);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ix.hf(IIIIIIIIIB)V")
    public static final void method4230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class63 var9 = null;
        for (class63 var10 = (class63) field715.method3790(); var10 != null; var10 = (class63) field715.method3771()) {
            if (var10.field862 == arg0 && var10.field858 == arg1 && var10.field859 == arg2 && var10.field857 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class63();
            var9.field862 = arg0;
            var9.field857 = arg3;
            var9.field858 = arg1;
            var9.field859 = arg2;
            method1682(var9);
            field715.method3765(var9);
        }
        var9.field863 = arg4;
        var9.field865 = arg5;
        var9.field864 = arg6;
        var9.field856 = arg7;
        var9.field861 = arg8;
    }

    @ObfuscatedName("fu.hu(I)V")
    public static final void method3070() {
        for (class63 var0 = (class63) field715.method3790(); var0 != null; var0 = (class63) field715.method3771()) {
            if (var0.field861 == -1) {
                var0.field856 = 0;
                method1682(var0);
            } else {
                var0.method3756();
            }
        }
    }

    @ObfuscatedName("bw.hh(Lbl;B)V")
    public static final void method1682(class63 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field857 == 0) {
            var1 = Statics.field249.method2694(arg0.field862, arg0.field858, arg0.field859);
        }
        if (arg0.field857 == 1) {
            var1 = Statics.field249.method2695(arg0.field862, arg0.field858, arg0.field859);
        }
        if (arg0.field857 == 2) {
            var1 = Statics.field249.method2696(arg0.field862, arg0.field858, arg0.field859);
        }
        if (arg0.field857 == 3) {
            var1 = Statics.field249.method2697(arg0.field862, arg0.field858, arg0.field859);
        }
        if (var1 != 0L) {
            int var6 = Statics.field249.method2698(arg0.field862, arg0.field858, arg0.field859, var1);
            var3 = class121.method594(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field860 = var3;
        arg0.field867 = var4;
        arg0.field866 = var5;
    }

    @ObfuscatedName("fq.hw(IIIIIIIB)V")
    public static final void method3152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field586 && Statics.field83 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field249.method2694(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field249.method2695(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field249.method2696(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field249.method2697(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field249.method2698(arg0, arg2, arg3, var7);
            int var13 = class121.method594(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field249.method2685(arg0, arg2, arg3);
                class269 var16 = class269.method2323(var13);
                if (var16.field3387 != 0) {
                    field643[arg0].method3097(arg2, arg3, var14, var15, var16.field3405);
                }
            }
            if (arg1 == 1) {
                Statics.field249.method2686(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field249.method2687(arg0, arg2, arg3);
                class269 var17 = class269.method2323(var13);
                if (var17.field3385 + arg2 > 103 || var17.field3385 + arg3 > 103 || var17.field3386 + arg2 > 103 || var17.field3386 + arg3 > 103) {
                    return;
                }
                if (var17.field3387 != 0) {
                    field643[arg0].method3105(arg2, arg3, var17.field3385, var17.field3386, var15, var17.field3405);
                }
            }
            if (arg1 == 3) {
                Statics.field249.method2767(arg0, arg2, arg3);
                class269 var18 = class269.method2323(var13);
                if (var18.field3387 == 1) {
                    field643[arg0].method3107(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class51.field444[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class51.method4548(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field249, field643[arg0]);
    }

    @ObfuscatedName("iu.hc(III)V")
    public static final void method4417(int arg0, int arg1) {
        class206 var2 = field709[Statics.field83][arg0][arg1];
        if (var2 == null) {
            Statics.field249.method2673(Statics.field83, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class81 var5 = null;
        for (class81 var6 = (class81) var2.method3790(); var6 != null; var6 = (class81) var2.method3771()) {
            class270 var7 = class270.method2359(var6.field1152);
            long var8 = (long) var7.field3446;
            if (var7.field3445 == 1) {
                var8 = (long) (var6.field1149 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field249.method2673(Statics.field83, arg0, arg1);
            return;
        }
        var2.method3766(var5);
        class81 var10 = null;
        class81 var11 = null;
        for (class81 var12 = (class81) var2.method3790(); var12 != null; var12 = (class81) var2.method3771()) {
            if (var5.field1152 != var12.field1152) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1152 != var12.field1152 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class121.method1686(arg0, arg1, 3, false, 0);
        Statics.field249.method2675(Statics.field83, arg0, arg1, method422(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field83), var5, var13, var10, var11);
    }

    @ObfuscatedName("il.hj(ZLgi;B)V")
    public static final void method4241(boolean arg0, class190 arg1) {
        field702 = 0;
        field625 = 0;
        class190 var2 = field627.field1220;
        var2.method3515();
        int var3 = var2.method3509(8);
        if (var3 < field623) {
            for (int var4 = var3; var4 < field623; var4++) {
                field703[++field702 - 1] = field640[var4];
            }
        }
        if (var3 > field623) {
            throw new RuntimeException("");
        }
        field623 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field640[var5];
            class73 var7 = field844[var6];
            int var8 = var2.method3509(1);
            if (var8 == 0) {
                field640[++field623 - 1] = var6;
                var7.field915 = field592;
            } else {
                int var9 = var2.method3509(2);
                if (var9 == 0) {
                    field640[++field623 - 1] = var6;
                    var7.field915 = field592;
                    field667[++field625 - 1] = var6;
                } else if (var9 == 1) {
                    field640[++field623 - 1] = var6;
                    var7.field915 = field592;
                    int var10 = var2.method3509(3);
                    var7.method1677(var10, (byte) 1);
                    int var11 = var2.method3509(1);
                    if (var11 == 1) {
                        field667[++field625 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field640[++field623 - 1] = var6;
                    var7.field915 = field592;
                    int var12 = var2.method3509(3);
                    var7.method1677(var12, (byte) 2);
                    int var13 = var2.method3509(3);
                    var7.method1677(var13, (byte) 2);
                    int var14 = var2.method3509(1);
                    if (var14 == 1) {
                        field667[++field625 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field703[++field702 - 1] = var6;
                }
            }
        }
        method461(arg0, arg1);
        for (int var15 = 0; var15 < field625; var15++) {
            int var16 = field667[var15];
            class73 var17 = field844[var16];
            int var18 = arg1.method3247();
            if ((var18 & 0x4) != 0) {
                var17.field892 = arg1.method3349();
                int var19 = arg1.method3473();
                var17.field872 = var19 >> 16;
                var17.field912 = (var19 & 0xFFFF) + field592;
                var17.field877 = 0;
                var17.field911 = 0;
                if (var17.field912 > field592) {
                    var17.field877 = -1;
                }
                if (var17.field892 == 65535) {
                    var17.field892 = -1;
                }
            }
            if ((var18 & 0x1) != 0) {
                int var20 = arg1.method3288();
                int var21 = arg1.method3288();
                int var22 = var17.field932 - (var20 - Statics.field869 - Statics.field869) * 64;
                int var23 = var17.field882 - (var21 - Statics.field755 - Statics.field755) * 64;
                if (var22 != 0 || var23 != 0) {
                    var17.field921 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                }
            }
            if ((var18 & 0x40) != 0) {
                int var24 = arg1.method3280();
                if (var24 > 0) {
                    for (int var25 = 0; var25 < var24; var25++) {
                        int var26 = -1;
                        int var27 = -1;
                        int var28 = -1;
                        int var29 = arg1.method3265();
                        if (var29 == 32767) {
                            var29 = arg1.method3265();
                            var27 = arg1.method3265();
                            var26 = arg1.method3265();
                            var28 = arg1.method3265();
                        } else if (var29 == 32766) {
                            var29 = -1;
                        } else {
                            var27 = arg1.method3265();
                        }
                        int var30 = arg1.method3265();
                        var17.method1437(var29, var27, var26, var28, field592, var30);
                    }
                }
                int var31 = arg1.method3280();
                if (var31 > 0) {
                    for (int var32 = 0; var32 < var31; var32++) {
                        int var33 = arg1.method3265();
                        int var34 = arg1.method3265();
                        if (var34 == 32767) {
                            var17.method1450(var33);
                        } else {
                            int var35 = arg1.method3265();
                            int var36 = arg1.method3468();
                            int var37 = var34 > 0 ? arg1.method3468() : var36;
                            var17.method1438(var33, field592, var34, var35, var36, var37);
                        }
                    }
                }
            }
            if ((var18 & 0x8) != 0) {
                var17.field1038 = class272.method4763(arg1.method3316());
                var17.field875 = var17.field1038.field3498;
                var17.field925 = var17.field1038.field3501;
                var17.field900 = var17.field1038.field3499;
                var17.field881 = var17.field1038.field3496;
                var17.field871 = var17.field1038.field3503;
                var17.field883 = var17.field1038.field3502;
                var17.field894 = var17.field1038.field3520;
                var17.field878 = var17.field1038.field3497;
                var17.field879 = var17.field1038.field3487;
            }
            if ((var18 & 0x10) != 0) {
                var17.field898 = arg1.method3288();
                if (var17.field898 == 65535) {
                    var17.field898 = -1;
                }
            }
            if ((var18 & 0x20) != 0) {
                int var38 = arg1.method3316();
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var39 = arg1.method3247();
                if (var17.field904 == var38 && var38 != -1) {
                    int var40 = class274.method26(var38).field3554;
                    if (var40 == 1) {
                        var17.field905 = 0;
                        var17.field902 = 0;
                        var17.field907 = var39;
                        var17.field908 = 0;
                    }
                    if (var40 == 2) {
                        var17.field908 = 0;
                    }
                } else if (var38 == -1 || var17.field904 == -1 || class274.method26(var38).field3548 >= class274.method26(var17.field904).field3548) {
                    var17.field904 = var38;
                    var17.field905 = 0;
                    var17.field902 = 0;
                    var17.field907 = var39;
                    var17.field908 = 0;
                    var17.field931 = var17.field910;
                }
            }
            if ((var18 & 0x2) != 0) {
                var17.field885 = arg1.method3441();
                var17.field888 = 100;
            }
        }
        for (int var41 = 0; var41 < field702; var41++) {
            int var42 = field703[var41];
            if (field592 != field844[var42].field915) {
                field844[var42].field1038 = null;
                field844[var42] = null;
            }
        }
        if (field627.field1226 != arg1.field2340) {
            throw new RuntimeException(arg1.field2340 + class75.field1052 + field627.field1226);
        }
        for (int var43 = 0; var43 < field623; var43++) {
            if (field844[field640[var43]] == null) {
                throw new RuntimeException(var43 + class75.field1052 + field623);
            }
        }
    }

    @ObfuscatedName("ak.ho(ZLgi;I)V")
    public static final void method461(boolean arg0, class190 arg1) {
        while (true) {
            if (arg1.method3517(field627.field1226) >= 27) {
                int var2 = arg1.method3509(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field844[var2] == null) {
                        field844[var2] = new class73();
                        var3 = true;
                    }
                    class73 var4 = field844[var2];
                    field640[++field623 - 1] = var2;
                    var4.field915 = field592;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method3509(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method3509(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field707[arg1.method3509(3)];
                    if (var3) {
                        var4.field927 = var4.field906 = var6;
                    }
                    int var7 = arg1.method3509(1);
                    int var8;
                    if (arg0) {
                        var8 = arg1.method3509(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method3509(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var4.field1038 = class272.method4763(arg1.method3509(14));
                    int var9 = arg1.method3509(1);
                    if (var9 == 1) {
                        field667[++field625 - 1] = var2;
                    }
                    var4.field875 = var4.field1038.field3498;
                    var4.field925 = var4.field1038.field3501;
                    if (var4.field925 == 0) {
                        var4.field906 = 0;
                    }
                    var4.field900 = var4.field1038.field3499;
                    var4.field881 = var4.field1038.field3496;
                    var4.field871 = var4.field1038.field3503;
                    var4.field883 = var4.field1038.field3502;
                    var4.field894 = var4.field1038.field3520;
                    var4.field878 = var4.field1038.field3497;
                    var4.field879 = var4.field1038.field3487;
                    var4.method1673(Statics.field1877.field923[0] + var5, Statics.field1877.field873[0] + var8, var7 == 1);
                    continue;
                }
            }
            arg1.method3508();
            return;
        }
    }

    @ObfuscatedName("bl.hm(Lbu;IIBB)V")
    public static final void method1434(class61 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field923[0];
        int var5 = arg0.field873[0];
        int var6 = arg0.method1009();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method1009();
        field850.field2044 = arg1;
        field850.field2049 = arg2;
        field850.field2043 = 1;
        field850.field2046 = 1;
        class60 var10 = field850;
        int var11 = class166.method2362(var4, var5, var9, var10, field643[arg0.field568], true, field851, field597);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method1026(field851[var12], field597[var12], arg3);
            }
        }
    }

    @ObfuscatedName("bz.hg(I)V")
    public static void method998() {
        field772 = 0;
        field717 = false;
        field736[0] = class238.field3031;
        field741[0] = "";
        field721[0] = 1006;
        field591[0] = false;
        field772 = 1;
    }

    @ObfuscatedName("ag.hn(III)V")
    public static final void method918(int arg0, int arg1) {
        if (field772 < 2 && field734 == 0 && !field786 || !field729) {
            return;
        }
        int var2 = field772 - 1;
        String var4;
        if (field734 == 1 && field772 < 2) {
            var4 = class238.field2831 + class238.field2952 + field735 + " " + class75.field1056;
        } else if (field786 && field772 < 2) {
            var4 = field613 + class238.field2952 + field740 + " " + class75.field1056;
        } else {
            var4 = method174(var2);
        }
        if (field772 > 2) {
            var4 = var4 + class75.method72(16777215) + " " + '/' + " " + (field772 - 2) + class238.field3026;
        }
        Statics.field3661.method5105(var4, arg0 + 4, arg1 + 15, 16777215, 0, field592 / 1000);
    }

    @ObfuscatedName("cl.he(I)V")
    public static final void method1811() {
        int var0 = Statics.field436;
        int var1 = Statics.field2;
        int var2 = Statics.field1857;
        int var3 = Statics.field1934;
        int var4 = 6116423;
        class315.method5331(var0, var1, var2, var3, var4);
        class315.method5331(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class315.method5302(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field3661.method5097(class238.field2945, var0 + 3, var1 + 14, var4, -1);
        int var5 = class49.field426;
        int var6 = class49.field427 * 673804999;
        for (int var7 = 0; var7 < field772; var7++) {
            int var8 = (field772 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field3661.method5097(method174(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field436;
        int var11 = Statics.field2;
        int var12 = Statics.field1857;
        int var13 = Statics.field1934;
        for (int var14 = 0; var14 < field604; var14++) {
            if (field787[var14] + field642[var14] > var10 && field787[var14] < var10 + var12 && field790[var14] + field788[var14] > var11 && field788[var14] < var11 + var13) {
                field789[var14] = true;
            }
        }
    }

    @ObfuscatedName("ax.hx(IIIII)V")
    public static final void method869(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field604; var4++) {
            if (field787[var4] + field642[var4] > arg0 && field787[var4] < arg0 + arg2 && field790[var4] + field788[var4] > arg1 && field788[var4] < arg1 + arg3) {
                field698[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hz(I)V")
    public final void method1137() {
        method2873();
        if (Statics.field3560 != null || field584 != null) {
            return;
        }
        int var1 = class49.field432;
        if (field717) {
            if (var1 != 1 && (Statics.field3230 || var1 != 4)) {
                int var2 = class49.field426;
                int var3 = class49.field427 * 673804999;
                if (var2 < Statics.field436 - 10 || var2 > Statics.field436 + Statics.field1857 + 10 || var3 < Statics.field2 - 10 || var3 > Statics.field2 + Statics.field1934 + 10) {
                    field717 = false;
                    method869(Statics.field436, Statics.field2, Statics.field1857, Statics.field1934);
                }
            }
            if (var1 == 1 || !Statics.field3230 && var1 == 4) {
                int var4 = Statics.field436;
                int var5 = Statics.field2;
                int var6 = Statics.field1857;
                int var7 = class49.field433;
                int var8 = class49.field429;
                int var9 = -1;
                for (int var10 = 0; var10 < field772; var10++) {
                    int var11 = (field772 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    method2360(var9);
                }
                field717 = false;
                method869(Statics.field436, Statics.field2, Statics.field1857, Statics.field1934);
            }
            return;
        }
        int var12 = field772 - 1;
        if ((var1 == 1 || !Statics.field3230 && var1 == 4) && var12 >= 0) {
            int var14 = field721[var12];
            if (var14 == 39 || var14 == 40 || var14 == 41 || var14 == 42 || var14 == 43 || var14 == 33 || var14 == 34 || var14 == 35 || var14 == 36 || var14 == 37 || var14 == 38 || var14 == 1005) {
                int var15 = field719[var12];
                int var16 = field852[var12];
                class231 var17 = class231.method415(var16);
                if (class232.method84(method406(var17)) || class232.method2920(method406(var17))) {
                    if (Statics.field3560 != null && !field690 && field772 > 0 && !this.method1066()) {
                        method1041(field679, field822);
                    }
                    field690 = false;
                    field694 = 0;
                    if (Statics.field3560 != null) {
                        method1035(Statics.field3560);
                    }
                    Statics.field3560 = class231.method415(var16);
                    field689 = var15;
                    field679 = class49.field433;
                    field822 = class49.field429;
                    if (var12 >= 0) {
                        Statics.field2589 = new class76();
                        Statics.field2589.field1067 = field719[var12];
                        Statics.field2589.field1061 = field852[var12];
                        Statics.field2589.field1062 = field721[var12];
                        Statics.field2589.field1063 = field795[var12];
                        Statics.field2589.field1064 = field736[var12];
                    }
                    method1035(Statics.field3560);
                    return;
                }
            }
        }
        if ((var1 == 1 || !Statics.field3230 && var1 == 4) && this.method1066()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field3230 && var1 == 4) && field772 > 0) {
            method2360(var12);
        }
        if (var1 == 2 && field772 > 0) {
            this.method1375(class49.field433, class49.field429);
        }
    }

    @ObfuscatedName("client.hq(B)Z")
    public final boolean method1066() {
        int var1 = field772 - 1;
        return (field716 == 1 && field772 > 2 || method634(var1)) && !field591[var1];
    }

    @ObfuscatedName("client.hv(III)V")
    public final void method1375(int arg0, int arg1) {
        method3488(arg0, arg1);
        Statics.field249.method2705(Statics.field83, arg0, arg1, false);
        field717 = true;
    }

    @ObfuscatedName("gp.hy(III)V")
    public static void method3488(int arg0, int arg1) {
        int var2 = Statics.field3661.method5092(class238.field2945);
        for (int var3 = 0; var3 < field772; var3++) {
            int var4 = Statics.field3661.method5092(method174(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field772 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1180) {
            var6 = Statics.field1180 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field3139) {
            var7 = Statics.field3139 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field436 = var6;
        Statics.field2 = var7;
        Statics.field1857 = var2;
        Statics.field1934 = field772 * 15 + 22;
    }

    @ObfuscatedName("ae.ha(IB)Z")
    public static final boolean method634(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field721[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dp.hd(II)V")
    public static final void method2360(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field719[arg0];
        int var2 = field852[arg0];
        int var3 = field721[arg0];
        int var4 = field795[arg0];
        String var5 = field736[arg0];
        String var6 = field741[arg0];
        method613(var1, var2, var3, var4, var5, var6, class49.field433, class49.field429);
    }

    @ObfuscatedName("fl.hr(Lbf;III)V")
    public static final void method3154(class76 arg0, int arg1, int arg2) {
        method613(arg0.field1067, arg0.field1061, arg0.field1062, arg0.field1063, arg0.field1064, arg0.field1064, arg1, arg2);
    }

    @ObfuscatedName("ar.hs(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method613(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 31) {
            class173 var8 = Statics.method414(class170.field2197, field627.field1219);
            var8.field2258.method3390(Statics.field2373);
            var8.field2258.method3285(arg0);
            var8.field2258.method3285(Statics.field3684);
            var8.field2258.method3297(arg1);
            var8.field2258.method3458(Statics.field85);
            var8.field2258.method3285(arg3);
            field627.method1847(var8);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 8) {
            class73 var9 = field844[arg3];
            if (var9 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var10 = Statics.method414(class170.field2205, field627.field1219);
                var10.field2258.method3410(Statics.field362);
                var10.field2258.method3286(field737);
                var10.field2258.method3285(arg3);
                var10.field2258.method3235(class40.field342[82] ? 1 : 0);
                field627.method1847(var10);
            }
        }
        if (arg2 == 51) {
            class61 var11 = field611[arg3];
            if (var11 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var12 = Statics.method414(class170.field2179, field627.field1219);
                var12.field2258.method3474(arg3);
                var12.field2258.method3278(class40.field342[82] ? 1 : 0);
                field627.method1847(var12);
            }
        }
        if (arg2 == 36) {
            class173 var13 = Statics.method414(class170.field2192, field627.field1219);
            var13.field2258.method3474(arg3);
            var13.field2258.method3286(arg0);
            var13.field2258.method3376(arg1);
            field627.method1847(var13);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 38) {
            method526();
            class231 var14 = class231.method415(arg1);
            field734 = 1;
            Statics.field85 = arg0;
            Statics.field2373 = arg1;
            Statics.field3684 = arg3;
            method1035(var14);
            field735 = class75.method72(16748608) + class270.method2359(arg3).field3434 + class75.method72(16777215);
            if (field735 == null) {
                field735 = class238.field2798;
            }
            return;
        }
        if (arg2 == 44) {
            class61 var15 = field611[arg3];
            if (var15 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var16 = Statics.method414(class170.field2207, field627.field1219);
                var16.field2258.method3235(class40.field342[82] ? 1 : 0);
                var16.field2258.method3458(arg3);
                field627.method1847(var16);
            }
        }
        if (arg2 == 42) {
            class173 var17 = Statics.method414(class170.field2201, field627.field1219);
            var17.field2258.method3474(arg3);
            var17.field2258.method3297(arg1);
            var17.field2258.method3458(arg0);
            field627.method1847(var17);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 20) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var18 = Statics.method414(class170.field2162, field627.field1219);
            var18.field2258.method3458(Statics.field869 + arg0);
            var18.field2258.method3286(arg3);
            var18.field2258.method3285(Statics.field755 + arg1);
            var18.field2258.method3278(class40.field342[82] ? 1 : 0);
            field627.method1847(var18);
        }
        if (arg2 == 1004) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            class173 var19 = Statics.method414(class170.field2183, field627.field1219);
            var19.field2258.method3286(arg3);
            field627.method1847(var19);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field477.method5568(arg2, arg3, new class227(arg0), new class227(arg1));
        }
        if (arg2 == 26) {
            class173 var20 = Statics.method414(class170.field2196, field627.field1219);
            field627.method1847(var20);
            for (class56 var21 = (class56) field742.method3710(); var21 != null; var21 = (class56) field742.method3711()) {
                if (var21.field495 == 0 || var21.field495 == 3) {
                    method242(var21, true);
                }
            }
            if (field745 != null) {
                method1035(field745);
                field745 = null;
            }
        }
        if (arg2 == 14) {
            class61 var22 = field611[arg3];
            if (var22 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var23 = Statics.method414(class170.field2190, field627.field1219);
                var23.field2258.method3474(Statics.field85);
                var23.field2258.method3285(Statics.field3684);
                var23.field2258.method3376(Statics.field2373);
                var23.field2258.method3279(class40.field342[82] ? 1 : 0);
                var23.field2258.method3458(arg3);
                field627.method1847(var23);
            }
        }
        if (arg2 == 39) {
            class173 var24 = Statics.method414(class170.field2172, field627.field1219);
            var24.field2258.method3297(arg1);
            var24.field2258.method3286(arg3);
            var24.field2258.method3474(arg0);
            field627.method1847(var24);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 43) {
            class173 var25 = Statics.method414(class170.field2141, field627.field1219);
            var25.field2258.method3286(arg3);
            var25.field2258.method3410(arg1);
            var25.field2258.method3285(arg0);
            field627.method1847(var25);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 24) {
            class231 var26 = class231.method415(arg1);
            boolean var27 = true;
            if (var26.field2610 > 0) {
                var27 = method407(var26);
            }
            if (var27) {
                class173 var28 = Statics.method414(class170.field2231, field627.field1219);
                var28.field2258.method3410(arg1);
                field627.method1847(var28);
            }
        }
        if (arg2 == 13) {
            class73 var29 = field844[arg3];
            if (var29 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var30 = Statics.method414(class170.field2209, field627.field1219);
                var30.field2258.method3286(arg3);
                var30.field2258.method3278(class40.field342[82] ? 1 : 0);
                field627.method1847(var30);
            }
        }
        if (arg2 == 11) {
            class73 var31 = field844[arg3];
            if (var31 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var32 = Statics.method414(class170.field2199, field627.field1219);
                var32.field2258.method3277(class40.field342[82] ? 1 : 0);
                var32.field2258.method3474(arg3);
                field627.method1847(var32);
            }
        }
        if (arg2 == 48) {
            class61 var33 = field611[arg3];
            if (var33 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var34 = Statics.method414(class170.field2218, field627.field1219);
                var34.field2258.method3279(class40.field342[82] ? 1 : 0);
                var34.field2258.method3474(arg3);
                field627.method1847(var34);
            }
        }
        if (arg2 == 1001) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var35 = Statics.method414(class170.field2140, field627.field1219);
            var35.field2258.method3285(Statics.field755 + arg1);
            var35.field2258.method3474(arg3);
            var35.field2258.method3286(Statics.field869 + arg0);
            var35.field2258.method3235(class40.field342[82] ? 1 : 0);
            field627.method1847(var35);
        }
        if (arg2 == 15) {
            class61 var36 = field611[arg3];
            if (var36 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var37 = Statics.method414(class170.field2213, field627.field1219);
                var37.field2258.method3390(Statics.field362);
                var37.field2258.method3285(arg3);
                var37.field2258.method3286(field737);
                var37.field2258.method3277(class40.field342[82] ? 1 : 0);
                field627.method1847(var37);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class231 var38 = class231.method2960(arg1, arg0);
            if (var38 != null) {
                method668(arg3, arg1, arg0, var38.field2650, arg5);
            }
        }
        if (arg2 == 45) {
            class61 var39 = field611[arg3];
            if (var39 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var40 = Statics.method414(class170.field2182, field627.field1219);
                var40.field2258.method3279(class40.field342[82] ? 1 : 0);
                var40.field2258.method3458(arg3);
                field627.method1847(var40);
            }
        }
        if (arg2 == 18) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var41 = Statics.method414(class170.field2211, field627.field1219);
            var41.field2258.method3474(Statics.field755 + arg1);
            var41.field2258.method3278(class40.field342[82] ? 1 : 0);
            var41.field2258.method3286(Statics.field869 + arg0);
            var41.field2258.method3458(arg3);
            field627.method1847(var41);
        }
        if (arg2 == 58) {
            class231 var42 = class231.method2960(arg1, arg0);
            if (var42 != null) {
                class173 var43 = Statics.method414(class170.field2160, field627.field1219);
                var43.field2258.method3376(Statics.field362);
                var43.field2258.method3474(field738);
                var43.field2258.method3376(arg1);
                var43.field2258.method3285(var42.field2650);
                var43.field2258.method3458(arg0);
                var43.field2258.method3458(field737);
                field627.method1847(var43);
            }
        }
        if (arg2 == 47) {
            class61 var44 = field611[arg3];
            if (var44 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var45 = Statics.method414(class170.field2221, field627.field1219);
                var45.field2258.method3474(arg3);
                var45.field2258.method3235(class40.field342[82] ? 1 : 0);
                field627.method1847(var45);
            }
        }
        if (arg2 == 3) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var46 = Statics.method414(class170.field2187, field627.field1219);
            var46.field2258.method3458(Statics.field755 + arg1);
            var46.field2258.method3286(Statics.field869 + arg0);
            var46.field2258.method3458(arg3);
            var46.field2258.method3235(class40.field342[82] ? 1 : 0);
            field627.method1847(var46);
        }
        if (arg2 == 1) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var47 = Statics.method414(class170.field2200, field627.field1219);
            var47.field2258.method3474(Statics.field3684);
            var47.field2258.method3235(class40.field342[82] ? 1 : 0);
            var47.field2258.method3376(Statics.field2373);
            var47.field2258.method3285(Statics.field869 + arg0);
            var47.field2258.method3458(Statics.field755 + arg1);
            var47.field2258.method3286(arg3);
            var47.field2258.method3458(Statics.field85);
            field627.method1847(var47);
        }
        if (arg2 == 22) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var48 = Statics.method414(class170.field2148, field627.field1219);
            var48.field2258.method3285(arg3);
            var48.field2258.method3285(Statics.field869 + arg0);
            var48.field2258.method3458(Statics.field755 + arg1);
            var48.field2258.method3279(class40.field342[82] ? 1 : 0);
            field627.method1847(var48);
        }
        if (arg2 == 19) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var49 = Statics.method414(class170.field2215, field627.field1219);
            var49.field2258.method3285(arg3);
            var49.field2258.method3286(Statics.field869 + arg0);
            var49.field2258.method3285(Statics.field755 + arg1);
            var49.field2258.method3279(class40.field342[82] ? 1 : 0);
            field627.method1847(var49);
        }
        if (arg2 == 1005) {
            class231 var50 = class231.method415(arg1);
            if (var50 == null || var50.field2726[arg0] < 100000) {
                class173 var51 = Statics.method414(class170.field2183, field627.field1219);
                var51.field2258.method3286(arg3);
                field627.method1847(var51);
            } else {
                class84.method2942(27, "", var50.field2726[arg0] + " x " + class270.method2359(arg3).field3434);
            }
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 9) {
            class73 var52 = field844[arg3];
            if (var52 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var53 = Statics.method414(class170.field2208, field627.field1219);
                var53.field2258.method3286(arg3);
                var53.field2258.method3278(class40.field342[82] ? 1 : 0);
                field627.method1847(var53);
            }
        }
        if (arg2 == 2) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var54 = Statics.method414(class170.field2173, field627.field1219);
            var54.field2258.method3235(class40.field342[82] ? 1 : 0);
            var54.field2258.method3297(Statics.field362);
            var54.field2258.method3474(Statics.field755 + arg1);
            var54.field2258.method3474(field737);
            var54.field2258.method3286(Statics.field869 + arg0);
            var54.field2258.method3474(arg3);
            field627.method1847(var54);
        }
        if (arg2 == 46) {
            class61 var55 = field611[arg3];
            if (var55 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var56 = Statics.method414(class170.field2138, field627.field1219);
                var56.field2258.method3277(class40.field342[82] ? 1 : 0);
                var56.field2258.method3286(arg3);
                field627.method1847(var56);
            }
        }
        if (arg2 == 50) {
            class61 var57 = field611[arg3];
            if (var57 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var58 = Statics.method414(class170.field2223, field627.field1219);
                var58.field2258.method3285(arg3);
                var58.field2258.method3277(class40.field342[82] ? 1 : 0);
                field627.method1847(var58);
            }
        }
        if (arg2 == 30 && field745 == null) {
            method1792(arg1, arg0);
            field745 = class231.method2960(arg1, arg0);
            method1035(field745);
        }
        if (arg2 == 23) {
            if (field717) {
                Statics.field249.method2770();
            } else {
                Statics.field249.method2705(Statics.field83, arg0, arg1, true);
            }
        }
        if (arg2 == 29) {
            class173 var59 = Statics.method414(class170.field2231, field627.field1219);
            var59.field2258.method3410(arg1);
            field627.method1847(var59);
            class231 var60 = class231.method415(arg1);
            if (var60.field2660 != null && var60.field2660[0][0] == 5) {
                int var61 = var60.field2660[0][1];
                if (class226.field2559[var61] != var60.field2721[0]) {
                    class226.field2559[var61] = var60.field2721[0];
                    method670(var61);
                }
            }
        }
        if (arg2 == 35) {
            class173 var62 = Statics.method414(class170.field2167, field627.field1219);
            var62.field2258.method3285(arg0);
            var62.field2258.method3376(arg1);
            var62.field2258.method3285(arg3);
            field627.method1847(var62);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 16) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var63 = Statics.method414(class170.field2235, field627.field1219);
            var63.field2258.method3474(arg3);
            var63.field2258.method3235(class40.field342[82] ? 1 : 0);
            var63.field2258.method3286(Statics.field3684);
            var63.field2258.method3286(Statics.field869 + arg0);
            var63.field2258.method3458(Statics.field755 + arg1);
            var63.field2258.method3410(Statics.field2373);
            var63.field2258.method3458(Statics.field85);
            field627.method1847(var63);
        }
        if (arg2 == 1003) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            class73 var64 = field844[arg3];
            if (var64 != null) {
                class272 var65 = var64.field1038;
                if (var65.field3517 != null) {
                    var65 = var65.method4795();
                }
                if (var65 != null) {
                    class173 var66 = Statics.method414(class170.field2147, field627.field1219);
                    var66.field2258.method3285(var65.field3511);
                    field627.method1847(var66);
                }
            }
        }
        if (arg2 == 6) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var67 = Statics.method414(class170.field2233, field627.field1219);
            var67.field2258.method3286(arg3);
            var67.field2258.method3278(class40.field342[82] ? 1 : 0);
            var67.field2258.method3474(Statics.field869 + arg0);
            var67.field2258.method3285(Statics.field755 + arg1);
            field627.method1847(var67);
        }
        if (arg2 == 12) {
            class73 var68 = field844[arg3];
            if (var68 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var69 = Statics.method414(class170.field2230, field627.field1219);
                var69.field2258.method3277(class40.field342[82] ? 1 : 0);
                var69.field2258.method3285(arg3);
                field627.method1847(var69);
            }
        }
        if (arg2 == 17) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var70 = Statics.method414(class170.field2144, field627.field1219);
            var70.field2258.method3286(arg3);
            var70.field2258.method3285(Statics.field869 + arg0);
            var70.field2258.method3286(field737);
            var70.field2258.method3474(Statics.field755 + arg1);
            var70.field2258.method3376(Statics.field362);
            var70.field2258.method3235(class40.field342[82] ? 1 : 0);
            field627.method1847(var70);
        }
        if (arg2 == 25) {
            class231 var71 = class231.method2960(arg1, arg0);
            if (var71 != null) {
                method526();
                method3034(arg1, arg0, class232.method3011(method406(var71)), var71.field2650);
                field734 = 0;
                field613 = method2998(var71);
                if (field613 == null) {
                    field613 = "Null";
                }
                if (var71.field2605) {
                    field740 = var71.field2680 + class75.method72(16777215);
                } else {
                    field740 = class75.method72(65280) + var71.field2723 + class75.method72(16777215);
                }
            }
            return;
        }
        if (arg2 == 33) {
            class173 var72 = Statics.method414(class170.field2176, field627.field1219);
            var72.field2258.method3474(arg0);
            var72.field2258.method3286(arg3);
            var72.field2258.method3410(arg1);
            field627.method1847(var72);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 37) {
            class173 var73 = Statics.method414(class170.field2198, field627.field1219);
            var73.field2258.method3376(arg1);
            var73.field2258.method3285(arg0);
            var73.field2258.method3286(arg3);
            field627.method1847(var73);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 40) {
            class173 var74 = Statics.method414(class170.field2152, field627.field1219);
            var74.field2258.method3410(arg1);
            var74.field2258.method3285(arg3);
            var74.field2258.method3285(arg0);
            field627.method1847(var74);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 34) {
            class173 var75 = Statics.method414(class170.field2194, field627.field1219);
            var75.field2258.method3458(arg0);
            var75.field2258.method3285(arg3);
            var75.field2258.method3390(arg1);
            field627.method1847(var75);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 21) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var76 = Statics.method414(class170.field2206, field627.field1219);
            var76.field2258.method3286(Statics.field755 + arg1);
            var76.field2258.method3286(arg3);
            var76.field2258.method3285(Statics.field869 + arg0);
            var76.field2258.method3277(class40.field342[82] ? 1 : 0);
            field627.method1847(var76);
        }
        if (arg2 == 10) {
            class73 var77 = field844[arg3];
            if (var77 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var78 = Statics.method414(class170.field2224, field627.field1219);
                var78.field2258.method3474(arg3);
                var78.field2258.method3279(class40.field342[82] ? 1 : 0);
                field627.method1847(var78);
            }
        }
        if (arg2 == 4) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var79 = Statics.method414(class170.field2170, field627.field1219);
            var79.field2258.method3285(Statics.field869 + arg0);
            var79.field2258.method3458(Statics.field755 + arg1);
            var79.field2258.method3277(class40.field342[82] ? 1 : 0);
            var79.field2258.method3474(arg3);
            field627.method1847(var79);
        }
        if (arg2 == 41) {
            class173 var80 = Statics.method414(class170.field2203, field627.field1219);
            var80.field2258.method3285(arg3);
            var80.field2258.method3285(arg0);
            var80.field2258.method3390(arg1);
            field627.method1847(var80);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 49) {
            class61 var81 = field611[arg3];
            if (var81 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var82 = Statics.method414(class170.field2164, field627.field1219);
                var82.field2258.method3278(class40.field342[82] ? 1 : 0);
                var82.field2258.method3474(arg3);
                field627.method1847(var82);
            }
        }
        if (arg2 == 7) {
            class73 var83 = field844[arg3];
            if (var83 != null) {
                field682 = arg6;
                field683 = arg7;
                field685 = 2;
                field804 = 0;
                field809 = arg0;
                field810 = arg1;
                class173 var84 = Statics.method414(class170.field2185, field627.field1219);
                var84.field2258.method3458(Statics.field85);
                var84.field2258.method3279(class40.field342[82] ? 1 : 0);
                var84.field2258.method3285(arg3);
                var84.field2258.method3286(Statics.field3684);
                var84.field2258.method3297(Statics.field2373);
                field627.method1847(var84);
            }
        }
        if (arg2 == 28) {
            class173 var85 = Statics.method414(class170.field2231, field627.field1219);
            var85.field2258.method3410(arg1);
            field627.method1847(var85);
            class231 var86 = class231.method415(arg1);
            if (var86.field2660 != null && var86.field2660[0][0] == 5) {
                int var87 = var86.field2660[0][1];
                class226.field2559[var87] = 1 - class226.field2559[var87];
                method670(var87);
            }
        }
        if (arg2 == 1002) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            class173 var88 = Statics.method414(class170.field2163, field627.field1219);
            var88.field2258.method3458(arg3);
            field627.method1847(var88);
        }
        if (arg2 == 32) {
            class173 var89 = Statics.method414(class170.field2166, field627.field1219);
            var89.field2258.method3376(Statics.field362);
            var89.field2258.method3458(field737);
            var89.field2258.method3297(arg1);
            var89.field2258.method3474(arg0);
            var89.field2258.method3286(arg3);
            field627.method1847(var89);
            field687 = 0;
            Statics.field3097 = class231.method415(arg1);
            field583 = arg0;
        }
        if (arg2 == 5) {
            field682 = arg6;
            field683 = arg7;
            field685 = 2;
            field804 = 0;
            field809 = arg0;
            field810 = arg1;
            class173 var90 = Statics.method414(class170.field2217, field627.field1219);
            var90.field2258.method3474(Statics.field755 + arg1);
            var90.field2258.method3474(Statics.field869 + arg0);
            var90.field2258.method3474(arg3);
            var90.field2258.method3278(class40.field342[82] ? 1 : 0);
            field627.method1847(var90);
        }
        if (field734 != 0) {
            field734 = 0;
            method1035(class231.method415(Statics.field2373));
        }
        if (field786) {
            method526();
        }
        if (Statics.field3097 != null && field687 == 0) {
            method1035(Statics.field3097);
        }
    }

    @ObfuscatedName("ef.hi(IIIII)V")
    public static void method3034(int arg0, int arg1, int arg2, int arg3) {
        class231 var4 = class231.method2960(arg0, arg1);
        if (var4 != null && var4.field2735 != null) {
            class57 var5 = new class57();
            var5.field507 = var4;
            var5.field513 = var4.field2735;
            class70.method1589(var5);
        }
        field738 = arg3;
        field786 = true;
        Statics.field362 = arg0;
        field737 = arg1;
        Statics.field933 = arg2;
        method1035(var4);
    }

    @ObfuscatedName("at.hb(I)V")
    public static void method526() {
        if (!field786) {
            return;
        }
        class231 var0 = class231.method2960(Statics.field362, field737);
        if (var0 != null && var0.field2699 != null) {
            class57 var1 = new class57();
            var1.field507 = var0;
            var1.field513 = var0.field2699;
            class70.method1589(var1);
        }
        field786 = false;
        method1035(var0);
    }

    @ObfuscatedName("cq.ht(IIB)V")
    public static void method1792(int arg0, int arg1) {
        class173 var2 = Statics.method414(class170.field2159, field627.field1219);
        var2.field2258.method3390(arg0);
        var2.field2258.method3286(arg1);
        field627.method1847(var2);
    }

    @ObfuscatedName("aq.hl(IIIILjava/lang/String;B)V")
    public static void method668(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class231 var5 = class231.method2960(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2707 != null) {
            class57 var6 = new class57();
            var6.field507 = var5;
            var6.field518 = arg0;
            var6.field505 = arg4;
            var6.field513 = var5.field2707;
            class70.method1589(var6);
        }
        boolean var7 = true;
        if (var5.field2610 > 0) {
            var7 = method407(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method406(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class173 var11 = Statics.method414(class170.field2150, field627.field1219);
            var11.field2258.method3410(arg1);
            var11.field2258.method3458(arg2);
            var11.field2258.method3458(arg3);
            field627.method1847(var11);
        }
        if (arg0 == 2) {
            class173 var12 = Statics.method414(class170.field2142, field627.field1219);
            var12.field2258.method3410(arg1);
            var12.field2258.method3458(arg2);
            var12.field2258.method3458(arg3);
            field627.method1847(var12);
        }
        if (arg0 == 3) {
            class173 var13 = Statics.method414(class170.field2156, field627.field1219);
            var13.field2258.method3410(arg1);
            var13.field2258.method3458(arg2);
            var13.field2258.method3458(arg3);
            field627.method1847(var13);
        }
        if (arg0 == 4) {
            class173 var14 = Statics.method414(class170.field2145, field627.field1219);
            var14.field2258.method3410(arg1);
            var14.field2258.method3458(arg2);
            var14.field2258.method3458(arg3);
            field627.method1847(var14);
        }
        if (arg0 == 5) {
            class173 var15 = Statics.method414(class170.field2214, field627.field1219);
            var15.field2258.method3410(arg1);
            var15.field2258.method3458(arg2);
            var15.field2258.method3458(arg3);
            field627.method1847(var15);
        }
        if (arg0 == 6) {
            class173 var16 = Statics.method414(class170.field2232, field627.field1219);
            var16.field2258.method3410(arg1);
            var16.field2258.method3458(arg2);
            var16.field2258.method3458(arg3);
            field627.method1847(var16);
        }
        if (arg0 == 7) {
            class173 var17 = Statics.method414(class170.field2161, field627.field1219);
            var17.field2258.method3410(arg1);
            var17.field2258.method3458(arg2);
            var17.field2258.method3458(arg3);
            field627.method1847(var17);
        }
        if (arg0 == 8) {
            class173 var18 = Statics.method414(class170.field2227, field627.field1219);
            var18.field2258.method3410(arg1);
            var18.field2258.method3458(arg2);
            var18.field2258.method3458(arg3);
            field627.method1847(var18);
        }
        if (arg0 == 9) {
            class173 var19 = Statics.method414(class170.field2139, field627.field1219);
            var19.field2258.method3410(arg1);
            var19.field2258.method3458(arg2);
            var19.field2258.method3458(arg3);
            field627.method1847(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class173 var20 = Statics.method414(class170.field2181, field627.field1219);
        var20.field2258.method3410(arg1);
        var20.field2258.method3458(arg2);
        var20.field2258.method3458(arg3);
        field627.method1847(var20);
    }

    @ObfuscatedName("ek.ih(I)V")
    public static final void method2873() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field772 - 1; var1++) {
                if (field721[var1] < 1000 && field721[var1 + 1] > 1000) {
                    String var2 = field741[var1];
                    field741[var1] = field741[var1 + 1];
                    field741[var1 + 1] = var2;
                    String var3 = field736[var1];
                    field736[var1] = field736[var1 + 1];
                    field736[var1 + 1] = var3;
                    int var4 = field721[var1];
                    field721[var1] = field721[var1 + 1];
                    field721[var1 + 1] = var4;
                    int var5 = field719[var1];
                    field719[var1] = field719[var1 + 1];
                    field719[var1 + 1] = var5;
                    int var6 = field852[var1];
                    field852[var1] = field852[var1 + 1];
                    field852[var1 + 1] = var6;
                    int var7 = field795[var1];
                    field795[var1] = field795[var1 + 1];
                    field795[var1 + 1] = var7;
                    boolean var8 = field591[var1];
                    field591[var1] = field591[var1 + 1];
                    field591[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ay.ip(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method914(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method4237(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("id.ik(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method4237(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field717 || field772 >= 500) {
            return;
        }
        field736[field772] = arg0;
        field741[field772] = arg1;
        field721[field772] = arg2;
        field795[field772] = arg3;
        field719[field772] = arg4;
        field852[field772] = arg5;
        field591[field772] = arg6;
        field772++;
    }

    @ObfuscatedName("fq.im(I)V")
    public static void method3151() {
        for (int var0 = 0; var0 < field772; var0++) {
            if (method3173(field721[var0])) {
                if (var0 < field772 - 1) {
                    for (int var1 = var0; var1 < field772 - 1; var1++) {
                        field736[var1] = field736[var1 + 1];
                        field741[var1] = field741[var1 + 1];
                        field721[var1] = field721[var1 + 1];
                        field795[var1] = field795[var1 + 1];
                        field719[var1] = field719[var1 + 1];
                        field852[var1] = field852[var1 + 1];
                        field591[var1] = field591[var1 + 1];
                    }
                }
                var0--;
                field772--;
            }
        }
        method3488(Statics.field1857 / 2 + Statics.field436, Statics.field2);
    }

    @ObfuscatedName("fg.iy(IB)Z")
    public static boolean method3173(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("o.ij(II)Ljava/lang/String;")
    public static String method174(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field741[arg0].length() > 0) {
            return field736[arg0] + class238.field2952 + field741[arg0];
        } else {
            return field736[arg0];
        }
    }

    @ObfuscatedName("ab.if(Ljq;IIII)V")
    public static final void method435(class272 arg0, int arg1, int arg2, int arg3) {
        if (field772 >= 400) {
            return;
        }
        if (arg0.field3517 != null) {
            arg0 = arg0.method4795();
        }
        if (arg0 == null || !arg0.field3505 || arg0.field3518 && field749 != arg1) {
            return;
        }
        String var4 = arg0.field3492;
        if (arg0.field3509 != 0) {
            var4 = var4 + method2883(arg0.field3509, Statics.field1877.field552) + " " + class75.field1054 + class238.field2948 + arg0.field3509 + class75.field1055;
        }
        if (arg0.field3518 && field726) {
            method914(class238.field2808, class75.method72(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field734 == 1) {
            method914(class238.field2831, field735 + " " + class75.field1056 + " " + class75.method72(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field786) {
            int var5 = arg0.field3518 && field726 ? 2000 : 0;
            String[] var6 = arg0.field3507;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class238.field2944)) {
                        int var8 = 0;
                        if (var7 == 0) {
                            var8 = var5 + 9;
                        }
                        if (var7 == 1) {
                            var8 = var5 + 10;
                        }
                        if (var7 == 2) {
                            var8 = var5 + 11;
                        }
                        if (var7 == 3) {
                            var8 = var5 + 12;
                        }
                        if (var7 == 4) {
                            var8 = var5 + 13;
                        }
                        method914(var6[var7], class75.method72(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class238.field2944)) {
                        short var10 = 0;
                        if (field781 != class78.field1075) {
                            if (field781 == class78.field1076 || field781 == class78.field1081 && arg0.field3509 > Statics.field1877.field552) {
                                var10 = 2000;
                            }
                            int var11 = 0;
                            if (var9 == 0) {
                                var11 = var10 + 9;
                            }
                            if (var9 == 1) {
                                var11 = var10 + 10;
                            }
                            if (var9 == 2) {
                                var11 = var10 + 11;
                            }
                            if (var9 == 3) {
                                var11 = var10 + 12;
                            }
                            if (var9 == 4) {
                                var11 = var10 + 13;
                            }
                            method914(var6[var9], class75.method72(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3518 || !field726) {
                method914(class238.field2808, class75.method72(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field933 & 0x2) == 2) {
            method914(field613, field740 + " " + class75.field1056 + " " + class75.method72(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hx.ix(Lbu;IIII)V")
    public static final void method4026(class61 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1877 == arg0 || field772 >= 400) {
            return;
        }
        String var4;
        if (arg0.field565 == 0) {
            var4 = arg0.field551[0] + arg0.field553 + arg0.field551[1] + method2883(arg0.field552, Statics.field1877.field552) + " " + class75.field1054 + class238.field2948 + arg0.field552 + class75.field1055 + arg0.field551[2];
        } else {
            var4 = arg0.field551[0] + arg0.field553 + arg0.field551[1] + " " + class75.field1054 + class238.field2793 + arg0.field565 + class75.field1055 + arg0.field551[2];
        }
        if (field734 == 1) {
            method914(class238.field2831, field735 + " " + class75.field1056 + " " + class75.method72(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field786) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field705[var5] != null) {
                    short var6 = 0;
                    if (field705[var5].equalsIgnoreCase(class238.field2944)) {
                        if (field608 == class78.field1075) {
                            continue;
                        }
                        if (field608 == class78.field1076 || field608 == class78.field1081 && arg0.field552 > Statics.field1877.field552) {
                            var6 = 2000;
                        }
                        if (Statics.field1877.field569 != 0 && arg0.field569 != 0) {
                            if (Statics.field1877.field569 == arg0.field569) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field710[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field704[var5] + var6;
                    method914(field705[var5], class75.method72(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field933 & 0x8) == 8) {
            method914(field613, field740 + " " + class75.field1056 + " " + class75.method72(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field772; var9++) {
            if (field721[var9] == 23) {
                field741[var9] = class75.method72(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("er.iz(III)Ljava/lang/String;")
    public static final String method2883(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class75.method72(16711680);
        } else if (var2 < -6) {
            return class75.method72(16723968);
        } else if (var2 < -3) {
            return class75.method72(16740352);
        } else if (var2 < 0) {
            return class75.method72(16756736);
        } else if (var2 > 9) {
            return class75.method72(65280);
        } else if (var2 > 6) {
            return class75.method72(4259584);
        } else if (var2 > 3) {
            return class75.method72(8453888);
        } else if (var2 > 0) {
            return class75.method72(12648192);
        } else {
            return class75.method72(16776960);
        }
    }

    @ObfuscatedName("ai.id(IIIIIIIIB)V")
    public static final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class231.method4540(arg0)) {
            Statics.field1815 = null;
            Statics.method428(Statics.field367[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1815 != null) {
                Statics.method428(Statics.field1815, -1412584499, arg1, arg2, arg3, arg4, Statics.field3688, Statics.field16, arg7);
                Statics.field1815 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field698[var8] = true;
            }
        } else {
            field698[arg7] = true;
        }
    }

    @ObfuscatedName("w.il(Ljava/lang/String;Lhi;I)Ljava/lang/String;")
    public static String method12(String arg0, class231 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2889(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ai.ig(IB)Ljava/lang/String;")
    public static final String method564(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class75.field1052 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class75.method72(65408) + var1.substring(0, var1.length() - 8) + class238.field2953 + " " + class75.field1054 + var1 + class75.field1055 + class75.field1057;
        } else if (var1.length() > 6) {
            return " " + class75.method72(16777215) + var1.substring(0, var1.length() - 4) + class238.field2866 + " " + class75.field1054 + var1 + class75.field1055 + class75.field1057;
        } else {
            return " " + class75.method72(16776960) + var1 + class75.field1057;
        }
    }

    @ObfuscatedName("client.ir(ZI)V")
    public final void method1068(boolean arg0) {
        method1817(field684, Statics.field1180, Statics.field3139, arg0);
    }

    @ObfuscatedName("client.iv(Lhi;I)V")
    public void method1069(class231 arg0) {
        class231 var2 = arg0.field2606 == -1 ? null : class231.method415(arg0.field2606);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1180;
            var4 = Statics.field3139;
        } else {
            var3 = var2.field2676;
            var4 = var2.field2622;
        }
        method1456(arg0, var3, var4, false);
        method262(arg0, var3, var4);
    }

    @ObfuscatedName("fc.ic([Lhi;Lhi;ZI)V")
    public static void method3094(class231[] arg0, class231 arg1, boolean arg2) {
        int var3 = arg1.field2629 == 0 ? arg1.field2676 : arg1.field2629;
        int var4 = arg1.field2630 == 0 ? arg1.field2622 : arg1.field2630;
        method5203(arg0, arg1.field2692, var3, var4, arg2);
        if (arg1.field2737 != null) {
            method5203(arg1.field2737, arg1.field2692, var3, var4, arg2);
        }
        class56 var5 = (class56) field742.method3712((long) arg1.field2692);
        if (var5 != null) {
            method1817(var5.field502, var3, var4, arg2);
        }
        if (arg1.field2610 == 1337) {
        }
    }

    @ObfuscatedName("ce.ia(IIIZB)V")
    public static final void method1817(int arg0, int arg1, int arg2, boolean arg3) {
        if (class231.method4540(arg0)) {
            method5203(Statics.field367[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("kh.in([Lhi;IIIZB)V")
    public static void method5203(class231[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class231 var6 = arg0[var5];
            if (var6 != null && var6.field2606 == arg1) {
                method1456(var6, arg2, arg3, arg4);
                method262(var6, arg2, arg3);
                if (var6.field2627 > var6.field2629 - var6.field2676) {
                    var6.field2627 = var6.field2629 - var6.field2676;
                }
                if (var6.field2627 < 0) {
                    var6.field2627 = 0;
                }
                if (var6.field2664 > var6.field2630 - var6.field2622) {
                    var6.field2664 = var6.field2630 - var6.field2622;
                }
                if (var6.field2664 < 0) {
                    var6.field2664 = 0;
                }
                if (var6.field2722 == 0) {
                    method3094(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bn.is(Lhi;IIZI)V")
    public static void method1456(class231 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2676;
        int var5 = arg0.field2622;
        if (arg0.field2613 == 0) {
            arg0.field2676 = arg0.field2617;
        } else if (arg0.field2613 == 1) {
            arg0.field2676 = arg1 - arg0.field2617;
        } else if (arg0.field2613 == 2) {
            arg0.field2676 = arg0.field2617 * arg1 >> 14;
        }
        if (arg0.field2625 == 0) {
            arg0.field2622 = arg0.field2618;
        } else if (arg0.field2625 == 1) {
            arg0.field2622 = arg2 - arg0.field2618;
        } else if (arg0.field2625 == 2) {
            arg0.field2622 = arg0.field2618 * arg2 >> 14;
        }
        if (arg0.field2613 == 4) {
            arg0.field2676 = arg0.field2623 * arg0.field2622 / arg0.field2624;
        }
        if (arg0.field2625 == 4) {
            arg0.field2622 = arg0.field2676 * arg0.field2624 / arg0.field2623;
        }
        if (arg0.field2610 == 1337) {
            field785 = arg0;
        }
        if (arg3 && arg0.field2716 != null && (arg0.field2676 != var4 || arg0.field2622 != var5)) {
            class57 var6 = new class57();
            var6.field507 = arg0;
            var6.field513 = arg0.field2716;
            field639.method3765(var6);
        }
    }

    @ObfuscatedName("d.iu(Lhi;III)V")
    public static void method262(class231 arg0, int arg1, int arg2) {
        if (arg0.field2611 == 0) {
            arg0.field2619 = arg0.field2608;
        } else if (arg0.field2611 == 1) {
            arg0.field2619 = (arg1 - arg0.field2676) / 2 + arg0.field2608;
        } else if (arg0.field2611 == 2) {
            arg0.field2619 = arg1 - arg0.field2676 - arg0.field2608;
        } else if (arg0.field2611 == 3) {
            arg0.field2619 = arg0.field2608 * arg1 >> 14;
        } else if (arg0.field2611 == 4) {
            arg0.field2619 = (arg0.field2608 * arg1 >> 14) + (arg1 - arg0.field2676) / 2;
        } else {
            arg0.field2619 = arg1 - arg0.field2676 - (arg0.field2608 * arg1 >> 14);
        }
        if (arg0.field2612 == 0) {
            arg0.field2620 = arg0.field2616;
        } else if (arg0.field2612 == 1) {
            arg0.field2620 = (arg2 - arg0.field2622) / 2 + arg0.field2616;
        } else if (arg0.field2612 == 2) {
            arg0.field2620 = arg2 - arg0.field2622 - arg0.field2616;
        } else if (arg0.field2612 == 3) {
            arg0.field2620 = arg0.field2616 * arg2 >> 14;
        } else if (arg0.field2612 == 4) {
            arg0.field2620 = (arg0.field2616 * arg2 >> 14) + (arg2 - arg0.field2622) / 2;
        } else {
            arg0.field2620 = arg2 - arg0.field2622 - (arg0.field2616 * arg2 >> 14);
        }
    }

    @ObfuscatedName("em.it(Lhi;I)Z")
    public static final boolean method2867(class231 arg0) {
        if (arg0.field2720 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2720.length; var1++) {
            int var2 = method2889(arg0, var1);
            int var3 = arg0.field2721[var1];
            if (arg0.field2720[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2720[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2720[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ey.ie(Lhi;II)I")
    public static final int method2889(class231 arg0, int arg1) {
        if (arg0.field2660 == null || arg1 >= arg0.field2660.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2660[arg1];
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
                    var7 = field713[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field714[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field641[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class231 var11 = class231.method415(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class270.method2359(var12).field3447 || field669)) {
                        for (int var13 = 0; var13 < var11.field2725.length; var13++) {
                            if (var12 + 1 == var11.field2725[var13]) {
                                var7 += var11.field2726[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class226.field2559[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class235.field2780[field714[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class226.field2559[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1877.field552;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class235.field2781[var14]) {
                            var7 += field714[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class231 var17 = class231.method415(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class270.method2359(var18).field3447 || field669)) {
                        for (int var19 = 0; var19 < var17.field2725.length; var19++) {
                            if (var18 + 1 == var17.field2725[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field746;
                }
                if (var6 == 12) {
                    var7 = field783;
                }
                if (var6 == 13) {
                    int var20 = class226.field2559[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class226.method3095(var22);
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
                    var7 = (Statics.field1877.field932 >> 7) + Statics.field869;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1877.field882 >> 7) + Statics.field755;
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

    @ObfuscatedName("bo.io(Lhi;Ljt;IIZI)V")
    public static final void method948(class231 arg0, class270 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3426;
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
            var7 = class238.field2947;
        }
        if (var6 != -1 && var7 != null) {
            method4237(var7, class75.method72(16748608) + arg1.field3434, var6, arg1.field3432, arg2, arg0.field2692, arg4);
        }
    }

    @ObfuscatedName("n.ii([Lhi;IIIIIIII)V")
    public static final void method103(class231[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class231 var9 = arg0[var8];
            if (var9 != null && (!var9.field2605 || var9.field2722 == 0 || var9.field2687 || method406(var9) != 0 || field753 == var9 || var9.field2610 == 1338) && var9.field2606 == arg1 && (!var9.field2605 || !method1756(var9))) {
                int var10 = var9.field2619 + arg6;
                int var11 = var9.field2620 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2722 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2722 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2676 + var10;
                    int var19 = var9.field2622 + var11;
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
                    int var22 = var9.field2676 + var10;
                    int var23 = var9.field2622 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field584 == var9) {
                    field773 = true;
                    field697 = var10;
                    field761 = var11;
                }
                if (!var9.field2605 || var12 < var14 && var13 < var15) {
                    int var24 = class49.field426;
                    int var25 = class49.field427 * 673804999;
                    if (class49.field432 != 0) {
                        var24 = class49.field433;
                        var25 = class49.field429;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2610 == 1337) {
                        if (!field626 && !field717 && var26) {
                            if (field734 == 0 && !field786) {
                                method914(class238.field2893, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            long var27 = -1L;
                            long var29 = -1L;
                            int var31 = 0;
                            while (true) {
                                int var33 = class121.field1657;
                                if (var31 >= var33) {
                                    if (var27 != -1L) {
                                        int var34 = class121.method584(var27);
                                        int var35 = class121.method2280(var27);
                                        class61 var36 = field611[field708];
                                        method4026(var36, field708, var34, var35);
                                    }
                                    break;
                                }
                                long var37 = class121.method243(var31);
                                if (var29 != var37) {
                                    label1266: {
                                        var29 = var37;
                                        int var39 = class121.method33(var31);
                                        int var40 = class121.method416(var31);
                                        long var41 = class121.field1648[var31];
                                        int var43 = (int) (var41 >>> 14 & 0x3L);
                                        int var46 = class121.method1735(var31);
                                        if (var43 == 2 && Statics.field249.method2698(Statics.field83, var39, var40, var37) >= 0) {
                                            class269 var47 = class269.method2323(var46);
                                            if (var47.field3411 != null) {
                                                var47 = var47.method4665();
                                            }
                                            if (var47 == null) {
                                                break label1266;
                                            }
                                            if (field734 == 1) {
                                                method914(class238.field2831, field735 + " " + class75.field1056 + " " + class75.method72(65535) + var47.field3374, 1, var46, var39, var40);
                                            } else if (!field786) {
                                                String[] var48 = var47.field3388;
                                                if (var48 != null) {
                                                    for (int var49 = 4; var49 >= 0; var49--) {
                                                        if (var48[var49] != null) {
                                                            short var50 = 0;
                                                            if (var49 == 0) {
                                                                var50 = 3;
                                                            }
                                                            if (var49 == 1) {
                                                                var50 = 4;
                                                            }
                                                            if (var49 == 2) {
                                                                var50 = 5;
                                                            }
                                                            if (var49 == 3) {
                                                                var50 = 6;
                                                            }
                                                            if (var49 == 4) {
                                                                var50 = 1001;
                                                            }
                                                            method914(var48[var49], class75.method72(65535) + var47.field3374, var50, var46, var39, var40);
                                                        }
                                                    }
                                                }
                                                method914(class238.field2808, class75.method72(65535) + var47.field3374, 1002, var47.field3377, var39, var40);
                                            } else if ((Statics.field933 & 0x4) == 4) {
                                                method914(field613, field740 + " " + class75.field1056 + " " + class75.method72(65535) + var47.field3374, 2, var46, var39, var40);
                                            }
                                        }
                                        if (var43 == 1) {
                                            class73 var51 = field844[var46];
                                            if (var51 == null) {
                                                break label1266;
                                            }
                                            if (var51.field1038.field3498 == 1 && (var51.field932 & 0x7F) == 64 && (var51.field882 & 0x7F) == 64) {
                                                for (int var52 = 0; var52 < field623; var52++) {
                                                    class73 var53 = field844[field640[var52]];
                                                    if (var53 != null && var51 != var53 && var53.field1038.field3498 == 1 && var51.field932 == var53.field932 && var51.field882 == var53.field882) {
                                                        method435(var53.field1038, field640[var52], var39, var40);
                                                    }
                                                }
                                                int var54 = class82.field1168;
                                                int[] var55 = class82.field1160;
                                                for (int var56 = 0; var56 < var54; var56++) {
                                                    class61 var57 = field611[var55[var56]];
                                                    if (var57 != null && var51.field932 == var57.field932 && var51.field882 == var57.field882) {
                                                        method4026(var57, var55[var56], var39, var40);
                                                    }
                                                }
                                            }
                                            method435(var51.field1038, var46, var39, var40);
                                        }
                                        if (var43 == 0) {
                                            class61 var58 = field611[var46];
                                            if (var58 == null) {
                                                break label1266;
                                            }
                                            if ((var58.field932 & 0x7F) == 64 && (var58.field882 & 0x7F) == 64) {
                                                for (int var59 = 0; var59 < field623; var59++) {
                                                    class73 var60 = field844[field640[var59]];
                                                    if (var60 != null && var60.field1038.field3498 == 1 && var58.field932 == var60.field932 && var58.field882 == var60.field882) {
                                                        method435(var60.field1038, field640[var59], var39, var40);
                                                    }
                                                }
                                                int var61 = class82.field1168;
                                                int[] var62 = class82.field1160;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    class61 var64 = field611[var62[var63]];
                                                    if (var64 != null && var58 != var64 && var58.field932 == var64.field932 && var58.field882 == var64.field882) {
                                                        method4026(var64, var62[var63], var39, var40);
                                                    }
                                                }
                                            }
                                            if (field708 == var46) {
                                                var27 = var37;
                                            } else {
                                                method4026(var58, var46, var39, var40);
                                            }
                                        }
                                        if (var43 == 3) {
                                            class206 var65 = field709[Statics.field83][var39][var40];
                                            if (var65 != null) {
                                                for (class81 var66 = (class81) var65.method3775(); var66 != null; var66 = (class81) var65.method3785()) {
                                                    class270 var67 = class270.method2359(var66.field1152);
                                                    if (field734 == 1) {
                                                        method914(class238.field2831, field735 + " " + class75.field1056 + " " + class75.method72(16748608) + var67.field3434, 16, var66.field1152, var39, var40);
                                                    } else if (!field786) {
                                                        String[] var68 = var67.field3448;
                                                        for (int var69 = 4; var69 >= 0; var69--) {
                                                            if (var68 != null && var68[var69] != null) {
                                                                byte var70 = 0;
                                                                if (var69 == 0) {
                                                                    var70 = 18;
                                                                }
                                                                if (var69 == 1) {
                                                                    var70 = 19;
                                                                }
                                                                if (var69 == 2) {
                                                                    var70 = 20;
                                                                }
                                                                if (var69 == 3) {
                                                                    var70 = 21;
                                                                }
                                                                if (var69 == 4) {
                                                                    var70 = 22;
                                                                }
                                                                method914(var68[var69], class75.method72(16748608) + var67.field3434, var70, var66.field1152, var39, var40);
                                                            } else if (var69 == 2) {
                                                                method914(class238.field2791, class75.method72(16748608) + var67.field3434, 20, var66.field1152, var39, var40);
                                                            }
                                                        }
                                                        method914(class238.field2808, class75.method72(16748608) + var67.field3434, 1004, var66.field1152, var39, var40);
                                                    } else if ((Statics.field933 & 0x1) == 1) {
                                                        method914(field613, field740 + " " + class75.field1056 + " " + class75.method72(16748608) + var67.field3434, 17, var66.field1152, var39, var40);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                var31++;
                            }
                        }
                    } else if (var9.field2610 == 1338) {
                        method573(var9, var10, var11);
                    } else {
                        if (var9.field2610 == 1400) {
                            Statics.field477.method5563(class49.field426, class49.field427 * 673804999, var26, var10, var11, var9.field2676, var9.field2622);
                        }
                        if (!field717 && var26) {
                            if (var9.field2610 == 1400) {
                                Statics.field477.method5718(var10, var11, var9.field2676, var9.field2622, var24, var25);
                            } else {
                                int var71 = var24 - var10;
                                int var72 = var25 - var11;
                                if (var9.field2710 == 1) {
                                    method914(var9.field2724, "", 24, 0, 0, var9.field2692);
                                }
                                if (var9.field2710 == 2 && !field786) {
                                    String var73 = method2998(var9);
                                    if (var73 != null) {
                                        method914(var73, class75.method72(65280) + var9.field2723, 25, 0, -1, var9.field2692);
                                    }
                                }
                                if (var9.field2710 == 3) {
                                    method914(class238.field2951, "", 26, 0, 0, var9.field2692);
                                }
                                if (var9.field2710 == 4) {
                                    method914(var9.field2724, "", 28, 0, 0, var9.field2692);
                                }
                                if (var9.field2710 == 5) {
                                    method914(var9.field2724, "", 29, 0, 0, var9.field2692);
                                }
                                if (var9.field2710 == 6 && field745 == null) {
                                    method914(var9.field2724, "", 30, 0, -1, var9.field2692);
                                }
                                if (var9.field2722 == 2) {
                                    int var74 = 0;
                                    for (int var75 = 0; var75 < var9.field2622; var75++) {
                                        for (int var76 = 0; var76 < var9.field2676; var76++) {
                                            int var77 = (var9.field2673 + 32) * var76;
                                            int var78 = (var9.field2674 + 32) * var75;
                                            if (var74 < 20) {
                                                var77 += var9.field2686[var74];
                                                var78 += var9.field2739[var74];
                                            }
                                            if (var71 >= var77 && var72 >= var78 && var71 < var77 + 32 && var72 < var78 + 32) {
                                                field692 = var74;
                                                Statics.field1820 = var9;
                                                if (var9.field2725[var74] > 0) {
                                                    class270 var79 = class270.method2359(var9.field2725[var74] - 1);
                                                    if (field734 == 1 && class232.method2958(method406(var9))) {
                                                        if (Statics.field2373 != var9.field2692 || Statics.field85 != var74) {
                                                            method914(class238.field2831, field735 + " " + class75.field1056 + " " + class75.method72(16748608) + var79.field3434, 31, var79.field3432, var74, var9.field2692);
                                                        }
                                                    } else if (!field786 || !class232.method2958(method406(var9))) {
                                                        String[] var80 = var79.field3426;
                                                        int var81 = -1;
                                                        if (field727) {
                                                            boolean var82 = field728 || class40.field342[81];
                                                            if (var82) {
                                                                var81 = var79.method4710();
                                                            }
                                                        }
                                                        if (class232.method2958(method406(var9))) {
                                                            for (int var83 = 4; var83 >= 3; var83--) {
                                                                if (var81 != var83) {
                                                                    method948(var9, var79, var74, var83, false);
                                                                }
                                                            }
                                                        }
                                                        if (class232.method2964(method406(var9))) {
                                                            method914(class238.field2831, class75.method72(16748608) + var79.field3434, 38, var79.field3432, var74, var9.field2692);
                                                        }
                                                        if (class232.method2958(method406(var9))) {
                                                            for (int var84 = 2; var84 >= 0; var84--) {
                                                                if (var81 != var84) {
                                                                    method948(var9, var79, var74, var84, false);
                                                                }
                                                            }
                                                            if (var81 >= 0) {
                                                                method948(var9, var79, var74, var81, true);
                                                            }
                                                        }
                                                        String[] var85 = var9.field2678;
                                                        if (var85 != null) {
                                                            for (int var86 = 4; var86 >= 0; var86--) {
                                                                if (var85[var86] != null) {
                                                                    byte var87 = 0;
                                                                    if (var86 == 0) {
                                                                        var87 = 39;
                                                                    }
                                                                    if (var86 == 1) {
                                                                        var87 = 40;
                                                                    }
                                                                    if (var86 == 2) {
                                                                        var87 = 41;
                                                                    }
                                                                    if (var86 == 3) {
                                                                        var87 = 42;
                                                                    }
                                                                    if (var86 == 4) {
                                                                        var87 = 43;
                                                                    }
                                                                    method914(var85[var86], class75.method72(16748608) + var79.field3434, var87, var79.field3432, var74, var9.field2692);
                                                                }
                                                            }
                                                        }
                                                        method914(class238.field2808, class75.method72(16748608) + var79.field3434, 1005, var79.field3432, var74, var9.field2692);
                                                    } else if ((Statics.field933 & 0x10) == 16) {
                                                        method914(field613, field740 + " " + class75.field1056 + " " + class75.method72(16748608) + var79.field3434, 32, var79.field3432, var74, var9.field2692);
                                                    }
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                }
                                if (var9.field2605) {
                                    if (field786) {
                                        int var88 = method406(var9);
                                        boolean var89 = (var88 >> 21 & 0x1) != 0;
                                        if (var89 && (Statics.field933 & 0x20) == 32) {
                                            method914(field613, field740 + " " + class75.field1056 + " " + var9.field2680, 58, 0, var9.field2607, var9.field2692);
                                        }
                                    } else {
                                        for (int var90 = 9; var90 >= 5; var90--) {
                                            String var91 = method2361(var9, var90);
                                            if (var91 != null) {
                                                method914(var91, var9.field2680, 1007, var90 + 1, var9.field2607, var9.field2692);
                                            }
                                        }
                                        String var92 = method2998(var9);
                                        if (var92 != null) {
                                            method914(var92, var9.field2680, 25, 0, var9.field2607, var9.field2692);
                                        }
                                        for (int var93 = 4; var93 >= 0; var93--) {
                                            String var94 = method2361(var9, var93);
                                            if (var94 != null) {
                                                method914(var94, var9.field2680, 57, var93 + 1, var9.field2607, var9.field2692);
                                            }
                                        }
                                        int var95 = method406(var9);
                                        boolean var96 = (var95 & 0x1) != 0;
                                        if (var96) {
                                            method914(class238.field2937, "", 30, 0, var9.field2607, var9.field2692);
                                        }
                                    }
                                }
                            }
                        }
                        if (var9.field2722 == 0) {
                            if (!var9.field2605 && method1756(var9) && Statics.field1898 != var9) {
                                continue;
                            }
                            method103(arg0, var9.field2692, var12, var13, var14, var15, var10 - var9.field2627, var11 - var9.field2664);
                            if (var9.field2737 != null) {
                                method103(var9.field2737, var9.field2692, var12, var13, var14, var15, var10 - var9.field2627, var11 - var9.field2664);
                            }
                            class56 var97 = (class56) field742.method3712((long) var9.field2692);
                            if (var97 != null) {
                                if (var97.field495 == 0 && class49.field426 >= var12 && class49.field427 * 673804999 >= var13 && class49.field426 < var14 && class49.field427 * 673804999 < var15 && !field717) {
                                    for (class57 var98 = (class57) field639.method3790(); var98 != null; var98 = (class57) field639.method3771()) {
                                        if (var98.field506) {
                                            var98.method3756();
                                            var98.field507.field2732 = false;
                                        }
                                    }
                                    if (Statics.field40 == 0) {
                                        field584 = null;
                                        field753 = null;
                                    }
                                    if (!field717) {
                                        method998();
                                    }
                                }
                                int var99 = var97.field502;
                                if (class231.method4540(var99)) {
                                    method103(Statics.field367[var99], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2605) {
                            if (var9.field2649) {
                                if (class49.field426 >= var12 && class49.field427 * 673804999 >= var13 && class49.field426 < var14 && class49.field427 * 673804999 < var15) {
                                    for (class57 var100 = (class57) field639.method3790(); var100 != null; var100 = (class57) field639.method3771()) {
                                        if (var100.field506) {
                                            var100.method3756();
                                            var100.field507.field2732 = false;
                                        }
                                    }
                                    if (Statics.field40 == 0) {
                                        field584 = null;
                                        field753 = null;
                                    }
                                    if (!field717) {
                                        method998();
                                    }
                                }
                            } else if (var9.field2741 && class49.field426 >= var12 && class49.field427 * 673804999 >= var13 && class49.field426 < var14 && class49.field427 * 673804999 < var15) {
                                for (class57 var101 = (class57) field639.method3790(); var101 != null; var101 = (class57) field639.method3771()) {
                                    if (var101.field506 && var101.field507.field2708 == var101.field513) {
                                        var101.method3756();
                                    }
                                }
                            }
                            boolean var102;
                            if (class49.field426 >= var12 && class49.field427 * 673804999 >= var13 && class49.field426 < var14 && class49.field427 * 673804999 < var15) {
                                var102 = true;
                            } else {
                                var102 = false;
                            }
                            boolean var103 = false;
                            if ((class49.field420 == 1 || !Statics.field3230 && class49.field420 == 4) && var102) {
                                var103 = true;
                            }
                            boolean var104 = false;
                            if ((class49.field432 == 1 || !Statics.field3230 && class49.field432 == 4) && class49.field433 >= var12 && class49.field429 >= var13 && class49.field433 < var14 && class49.field429 < var15) {
                                var104 = true;
                            }
                            if (var104) {
                                method3150(var9, class49.field433 - var10, class49.field429 - var11);
                            }
                            if (var9.field2610 == 1400) {
                                Statics.field477.method5734(var24, var25, var102 & var103, var102 & var104);
                            }
                            if (field584 != null && field584 != var9 && var102) {
                                int var105 = method406(var9);
                                boolean var106 = (var105 >> 20 & 0x1) != 0;
                                if (var106) {
                                    field756 = var9;
                                }
                            }
                            if (field753 == var9) {
                                field602 = true;
                                field758 = var10;
                                field759 = var11;
                            }
                            if (var9.field2687) {
                                if (var102 && field696 != 0 && var9.field2708 != null) {
                                    class57 var107 = new class57();
                                    var107.field506 = true;
                                    var107.field507 = var9;
                                    var107.field509 = field696;
                                    var107.field513 = var9.field2708;
                                    field639.method3765(var107);
                                }
                                if (field584 != null || Statics.field3560 != null || field717) {
                                    var104 = false;
                                    var103 = false;
                                    var102 = false;
                                }
                                if (!var9.field2675 && var104) {
                                    var9.field2675 = true;
                                    if (var9.field2689 != null) {
                                        class57 var108 = new class57();
                                        var108.field506 = true;
                                        var108.field507 = var9;
                                        var108.field512 = class49.field433 - var10;
                                        var108.field509 = class49.field429 - var11;
                                        var108.field513 = var9.field2689;
                                        field639.method3765(var108);
                                    }
                                }
                                if (var9.field2675 && var103 && var9.field2690 != null) {
                                    class57 var109 = new class57();
                                    var109.field506 = true;
                                    var109.field507 = var9;
                                    var109.field512 = class49.field426 - var10;
                                    var109.field509 = class49.field427 * 673804999 - var11;
                                    var109.field513 = var9.field2690;
                                    field639.method3765(var109);
                                }
                                if (var9.field2675 && !var103) {
                                    var9.field2675 = false;
                                    if (var9.field2691 != null) {
                                        class57 var110 = new class57();
                                        var110.field506 = true;
                                        var110.field507 = var9;
                                        var110.field512 = class49.field426 - var10;
                                        var110.field509 = class49.field427 * 673804999 - var11;
                                        var110.field513 = var9.field2691;
                                        field780.method3765(var110);
                                    }
                                }
                                if (var103 && var9.field2615 != null) {
                                    class57 var111 = new class57();
                                    var111.field506 = true;
                                    var111.field507 = var9;
                                    var111.field512 = class49.field426 - var10;
                                    var111.field509 = class49.field427 * 673804999 - var11;
                                    var111.field513 = var9.field2615;
                                    field639.method3765(var111);
                                }
                                if (!var9.field2732 && var102) {
                                    var9.field2732 = true;
                                    if (var9.field2693 != null) {
                                        class57 var112 = new class57();
                                        var112.field506 = true;
                                        var112.field507 = var9;
                                        var112.field512 = class49.field426 - var10;
                                        var112.field509 = class49.field427 * 673804999 - var11;
                                        var112.field513 = var9.field2693;
                                        field639.method3765(var112);
                                    }
                                }
                                if (var9.field2732 && var102 && var9.field2595 != null) {
                                    class57 var113 = new class57();
                                    var113.field506 = true;
                                    var113.field507 = var9;
                                    var113.field512 = class49.field426 - var10;
                                    var113.field509 = class49.field427 * 673804999 - var11;
                                    var113.field513 = var9.field2595;
                                    field639.method3765(var113);
                                }
                                if (var9.field2732 && !var102) {
                                    var9.field2732 = false;
                                    if (var9.field2695 != null) {
                                        class57 var114 = new class57();
                                        var114.field506 = true;
                                        var114.field507 = var9;
                                        var114.field512 = class49.field426 - var10;
                                        var114.field509 = class49.field427 * 673804999 - var11;
                                        var114.field513 = var9.field2695;
                                        field780.method3765(var114);
                                    }
                                }
                                if (var9.field2706 != null) {
                                    class57 var115 = new class57();
                                    var115.field507 = var9;
                                    var115.field513 = var9.field2706;
                                    field779.method3765(var115);
                                }
                                if (var9.field2700 != null && field766 > var9.field2684) {
                                    if (var9.field2701 == null || field766 - var9.field2684 > 32) {
                                        class57 var120 = new class57();
                                        var120.field507 = var9;
                                        var120.field513 = var9.field2700;
                                        field639.method3765(var120);
                                    } else {
                                        label964: for (int var116 = var9.field2684; var116 < field766; var116++) {
                                            int var117 = field765[var116 & 0x1F];
                                            for (int var118 = 0; var118 < var9.field2701.length; var118++) {
                                                if (var9.field2701[var118] == var117) {
                                                    class57 var119 = new class57();
                                                    var119.field507 = var9;
                                                    var119.field513 = var9.field2700;
                                                    field639.method3765(var119);
                                                    break label964;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2684 = field766;
                                }
                                if (var9.field2671 != null && field768 > var9.field2736) {
                                    if (var9.field2734 == null || field768 - var9.field2736 > 32) {
                                        class57 var125 = new class57();
                                        var125.field507 = var9;
                                        var125.field513 = var9.field2671;
                                        field639.method3765(var125);
                                    } else {
                                        label940: for (int var121 = var9.field2736; var121 < field768; var121++) {
                                            int var122 = field767[var121 & 0x1F];
                                            for (int var123 = 0; var123 < var9.field2734.length; var123++) {
                                                if (var9.field2734[var123] == var122) {
                                                    class57 var124 = new class57();
                                                    var124.field507 = var9;
                                                    var124.field513 = var9.field2671;
                                                    field639.method3765(var124);
                                                    break label940;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2736 = field768;
                                }
                                if (var9.field2704 != null && field770 > var9.field2703) {
                                    if (var9.field2636 == null || field770 - var9.field2703 > 32) {
                                        class57 var130 = new class57();
                                        var130.field507 = var9;
                                        var130.field513 = var9.field2704;
                                        field639.method3765(var130);
                                    } else {
                                        label916: for (int var126 = var9.field2703; var126 < field770; var126++) {
                                            int var127 = field691[var126 & 0x1F];
                                            for (int var128 = 0; var128 < var9.field2636.length; var128++) {
                                                if (var9.field2636[var128] == var127) {
                                                    class57 var129 = new class57();
                                                    var129.field507 = var9;
                                                    var129.field513 = var9.field2704;
                                                    field639.method3765(var129);
                                                    break label916;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2703 = field770;
                                }
                                if (field771 > var9.field2698 && var9.field2709 != null) {
                                    class57 var131 = new class57();
                                    var131.field507 = var9;
                                    var131.field513 = var9.field2709;
                                    field639.method3765(var131);
                                }
                                if (field648 > var9.field2698 && var9.field2719 != null) {
                                    class57 var132 = new class57();
                                    var132.field507 = var9;
                                    var132.field513 = var9.field2719;
                                    field639.method3765(var132);
                                }
                                if (field829 > var9.field2698 && var9.field2712 != null) {
                                    class57 var133 = new class57();
                                    var133.field507 = var9;
                                    var133.field513 = var9.field2712;
                                    field639.method3765(var133);
                                }
                                if (field794 > var9.field2698 && var9.field2717 != null) {
                                    class57 var134 = new class57();
                                    var134.field507 = var9;
                                    var134.field513 = var9.field2717;
                                    field639.method3765(var134);
                                }
                                if (field775 > var9.field2698 && var9.field2694 != null) {
                                    class57 var135 = new class57();
                                    var135.field507 = var9;
                                    var135.field513 = var9.field2694;
                                    field639.method3765(var135);
                                }
                                if (field776 > var9.field2698 && var9.field2713 != null) {
                                    class57 var136 = new class57();
                                    var136.field507 = var9;
                                    var136.field513 = var9.field2713;
                                    field639.method3765(var136);
                                }
                                var9.field2698 = field802;
                                if (var9.field2638 != null) {
                                    for (int var137 = 0; var137 < field800; var137++) {
                                        class57 var138 = new class57();
                                        var138.field507 = var9;
                                        var138.field510 = field774[var137];
                                        var138.field514 = field801[var137];
                                        var138.field513 = var9.field2638;
                                        field639.method3765(var138);
                                    }
                                }
                            }
                        }
                        if (!var9.field2605 && field584 == null && Statics.field3560 == null && !field717) {
                            if ((var9.field2714 >= 0 || var9.field2633 != 0) && class49.field426 >= var12 && class49.field427 * 673804999 >= var13 && class49.field426 < var14 && class49.field427 * 673804999 < var15) {
                                if (var9.field2714 >= 0) {
                                    Statics.field1898 = arg0[var9.field2714];
                                } else {
                                    Statics.field1898 = var9;
                                }
                            }
                            if (var9.field2722 == 8 && class49.field426 >= var12 && class49.field427 * 673804999 >= var13 && class49.field426 < var14 && class49.field427 * 673804999 < var15) {
                                Statics.field1889 = var9;
                            }
                            if (var9.field2630 > var9.field2622) {
                                int var139 = var9.field2676 + var10;
                                int var140 = var9.field2622;
                                int var141 = var9.field2630;
                                int var142 = class49.field426;
                                int var143 = class49.field427 * 673804999;
                                if (field747) {
                                    field661 = 32;
                                } else {
                                    field661 = 0;
                                }
                                field747 = false;
                                if (class49.field420 == 1 || !Statics.field3230 && class49.field420 == 4) {
                                    if (var142 >= var139 && var142 < var139 + 16 && var143 >= var11 && var143 < var11 + 16) {
                                        var9.field2664 -= 4;
                                        method1035(var9);
                                    } else if (var142 >= var139 && var142 < var139 + 16 && var143 >= var11 + var140 - 16 && var143 < var11 + var140) {
                                        var9.field2664 += 4;
                                        method1035(var9);
                                    } else if (var142 >= var139 - field661 && var142 < field661 + var139 + 16 && var143 >= var11 + 16 && var143 < var11 + var140 - 16) {
                                        int var144 = (var140 - 32) * var140 / var141;
                                        if (var144 < 8) {
                                            var144 = 8;
                                        }
                                        int var145 = var143 - var11 - 16 - var144 / 2;
                                        int var146 = var140 - 32 - var144;
                                        var9.field2664 = (var141 - var140) * var145 / var146;
                                        method1035(var9);
                                        field747 = true;
                                    }
                                }
                                if (field696 != 0) {
                                    int var147 = var9.field2676;
                                    if (var142 >= var139 - var147 && var143 >= var11 && var142 < var139 + 16 && var143 <= var11 + var140) {
                                        var9.field2664 += field696 * 45;
                                        method1035(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.ib([Lhi;II)V")
    public static final void method1794(class231[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class231 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2722 == 0) {
                    if (var3.field2737 != null) {
                        method1794(var3.field2737, arg1);
                    }
                    class56 var4 = (class56) field742.method3712((long) var3.field2692);
                    if (var4 != null) {
                        int var5 = var4.field502;
                        if (class231.method4540(var5)) {
                            method1794(Statics.field367[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2655 != null) {
                    class57 var6 = new class57();
                    var6.field507 = var3;
                    var6.field513 = var3.field2655;
                    class70.method1589(var6);
                }
                if (arg1 == 1 && var3.field2715 != null) {
                    if (var3.field2607 >= 0) {
                        class231 var7 = class231.method415(var3.field2692);
                        if (var7 == null || var7.field2737 == null || var3.field2607 >= var7.field2737.length || var7.field2737[var3.field2607] != var3) {
                            continue;
                        }
                    }
                    class57 var8 = new class57();
                    var8.field507 = var3;
                    var8.field513 = var3.field2715;
                    class70.method1589(var8);
                }
            }
        }
    }

    @ObfuscatedName("fi.iq(Lhi;IIB)V")
    public static final void method3150(class231 arg0, int arg1, int arg2) {
        if (field584 != null || field717 || arg0 == null || method245(arg0) == null) {
            return;
        }
        field584 = arg0;
        field753 = method245(arg0);
        field754 = arg1;
        field750 = arg2;
        Statics.field40 = 0;
        field764 = false;
        int var3 = field772 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field2589 = new class76();
        Statics.field2589.field1067 = field719[var3];
        Statics.field2589.field1061 = field852[var3];
        Statics.field2589.field1062 = field721[var3];
        Statics.field2589.field1063 = field795[var3];
        Statics.field2589.field1064 = field736[var3];
    }

    @ObfuscatedName("client.jk(I)V")
    public final void method1348() {
        method1035(field584);
        Statics.field40++;
        if (field773 && field602) {
            int var1 = class49.field426;
            int var2 = class49.field427 * 673804999;
            int var3 = var1 - field754;
            int var4 = var2 - field750;
            if (var3 < field758) {
                var3 = field758;
            }
            if (field584.field2676 + var3 > field758 + field753.field2676) {
                var3 = field758 + field753.field2676 - field584.field2676;
            }
            if (var4 < field759) {
                var4 = field759;
            }
            if (field584.field2622 + var4 > field759 + field753.field2622) {
                var4 = field759 + field753.field2622 - field584.field2622;
            }
            int var5 = var3 - field697;
            int var6 = var4 - field761;
            int var7 = field584.field2683;
            if (Statics.field40 > field584.field2685 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field764 = true;
            }
            int var8 = field753.field2627 + (var3 - field758);
            int var9 = field753.field2664 + (var4 - field759);
            if (field584.field2696 != null && field764) {
                class57 var10 = new class57();
                var10.field507 = field584;
                var10.field512 = var8;
                var10.field509 = var9;
                var10.field513 = field584.field2696;
                class70.method1589(var10);
            }
            if (class49.field420 == 0) {
                if (field764) {
                    if (field584.field2697 != null) {
                        class57 var11 = new class57();
                        var11.field507 = field584;
                        var11.field512 = var8;
                        var11.field509 = var9;
                        var11.field508 = field756;
                        var11.field513 = field584.field2697;
                        class70.method1589(var11);
                    }
                    if (field756 != null) {
                        class231 var12 = field584;
                        int var13 = class232.method3557(method406(var12));
                        class231 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class231.method415(var12.field2606);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class173 var16 = Statics.method414(class170.field2165, field627.field1219);
                            var16.field2258.method3286(field584.field2607);
                            var16.field2258.method3474(field584.field2650);
                            var16.field2258.method3376(field756.field2692);
                            var16.field2258.method3285(field756.field2650);
                            var16.field2258.method3297(field584.field2692);
                            var16.field2258.method3458(field756.field2607);
                            field627.method1847(var16);
                        }
                    }
                } else if (this.method1066()) {
                    this.method1375(field754 + field697, field761 + field750);
                } else if (field772 > 0) {
                    method1041(field754 + field697, field761 + field750);
                }
                field584 = null;
            }
        } else if (Statics.field40 > 1) {
            field584 = null;
        }
    }

    @ObfuscatedName("bu.ja(III)V")
    public static void method1041(int arg0, int arg1) {
        method3154(Statics.field2589, arg0, arg1);
        Statics.field2589 = null;
    }

    @ObfuscatedName("bu.ju(Lhi;I)V")
    public static void method1035(class231 arg0) {
        if (field831 == arg0.field2628) {
            field698[arg0.field2738] = true;
        }
    }

    @ObfuscatedName("j.jo(Lhi;I)Lhi;")
    public static class231 method245(class231 arg0) {
        class231 var1 = arg0;
        int var2 = class232.method3557(method406(arg0));
        class231 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class231.method415(var1.field2606);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class231 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2667;
        }
        return var5;
    }

    @ObfuscatedName("ho.ji(II)V")
    public static final void method3854(int arg0) {
        if (!class231.method4540(arg0)) {
            return;
        }
        class231[] var1 = Statics.field367[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class231 var3 = var1[var2];
            if (var3 != null) {
                var3.field2729 = 0;
                var3.field2614 = 0;
            }
        }
    }

    @ObfuscatedName("j.jy(II)V")
    public static final void method251(int arg0) {
        if (class231.method4540(arg0)) {
            method4242(Statics.field367[arg0], -1);
        }
    }

    @ObfuscatedName("il.jp([Lhi;II)V")
    public static final void method4242(class231[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class231 var3 = arg0[var2];
            if (var3 != null && var3.field2606 == arg1 && (!var3.field2605 || !method1756(var3))) {
                if (var3.field2722 == 0) {
                    if (!var3.field2605 && method1756(var3) && Statics.field1898 != var3) {
                        continue;
                    }
                    method4242(arg0, var3.field2692);
                    if (var3.field2737 != null) {
                        method4242(var3.field2737, var3.field2692);
                    }
                    class56 var4 = (class56) field742.method3712((long) var3.field2692);
                    if (var4 != null) {
                        method251(var4.field502);
                    }
                }
                if (var3.field2722 == 6) {
                    if (var3.field2596 != -1 || var3.field2654 != -1) {
                        boolean var5 = method2867(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2654;
                        } else {
                            var6 = var3.field2596;
                        }
                        if (var6 != -1) {
                            class274 var7 = class274.method26(var6);
                            var3.field2614 += field701;
                            while (var3.field2614 > var7.field3542[var3.field2729]) {
                                var3.field2614 -= var7.field3542[var3.field2729];
                                var3.field2729++;
                                if (var3.field2729 >= var7.field3541.length) {
                                    var3.field2729 -= var7.field3545;
                                    if (var3.field2729 < 0 || var3.field2729 >= var7.field3541.length) {
                                        var3.field2729 = 0;
                                    }
                                }
                                method1035(var3);
                            }
                        }
                    }
                    if (var3.field2733 != 0 && !var3.field2605) {
                        int var8 = var3.field2733 >> 16;
                        int var9 = var3.field2733 << 16 >> 16;
                        int var10 = field701 * var8;
                        int var11 = field701 * var9;
                        var3.field2657 = var3.field2657 + var10 & 0x7FF;
                        var3.field2658 = var3.field2658 + var11 & 0x7FF;
                        method1035(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.jj(II)V")
    public static final void method670(int arg0) {
        Statics.method5076();
        class69.method76();
        int var1 = Statics.method1442(arg0).field3231;
        if (var1 == 0) {
            return;
        }
        int var2 = class226.field2559[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class123.method2626(0.9D);
                ((class112) Statics.field1668).method2340(0.9D);
            }
            if (var2 == 2) {
                class123.method2626(0.8D);
                ((class112) Statics.field1668).method2340(0.8D);
            }
            if (var2 == 3) {
                class123.method2626(0.7D);
                ((class112) Statics.field1668).method2340(0.7D);
            }
            if (var2 == 4) {
                class123.method2626(0.6D);
                ((class112) Statics.field1668).method2340(0.6D);
            }
            class270.field3430.method3676();
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
            if (field812 != var3) {
                if (field812 == 0 && field813 != -1) {
                    class218.method1447(Statics.field1148, field813, 0, var3, false);
                    field814 = false;
                } else if (var3 == 0) {
                    class218.method89();
                    field814 = false;
                } else if (class218.field2461 == 0) {
                    Statics.field2460.method3901(var3);
                } else {
                    Statics.field3741 = var3;
                }
                field812 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field815 = 127;
            }
            if (var2 == 1) {
                field815 = 96;
            }
            if (var2 == 2) {
                field815 = 64;
            }
            if (var2 == 3) {
                field815 = 32;
            }
            if (var2 == 4) {
                field815 = 0;
            }
        }
        if (var1 == 5) {
            field716 = var2;
        }
        if (var1 == 6) {
            field743 = var2;
        }
        if (var1 == 9) {
            field744 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field816 = 127;
            }
            if (var2 == 1) {
                field816 = 96;
            }
            if (var2 == 2) {
                field816 = 64;
            }
            if (var2 == 3) {
                field816 = 32;
            }
            if (var2 == 4) {
                field816 = 0;
            }
        }
        if (var1 == 17) {
            field749 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class78[] var4 = new class78[] { class78.field1081, class78.field1075, class78.field1076, class78.field1077 };
            field608 = (class78) class178.method1685(var4, var2);
            if (field608 == null) {
                field608 = class78.field1081;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field708 = -1;
            } else {
                field708 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class78[] var5 = new class78[] { class78.field1081, class78.field1075, class78.field1076, class78.field1077 };
        field781 = (class78) class178.method1685(var5, var2);
        if (field781 == null) {
            field781 = class78.field1081;
        }
    }

    @ObfuscatedName("a.jt(Lbj;ZI)V")
    public static final void method242(class56 arg0, boolean arg1) {
        int var2 = arg0.field502;
        int var3 = (int) arg0.field2422;
        arg0.method3756();
        if (arg1) {
            class231.method1515(var2);
        }
        method2864(var2);
        class231 var4 = class231.method415(var3);
        if (var4 != null) {
            method1035(var4);
        }
        method3151();
        if (field684 != -1) {
            int var5 = field684;
            if (class231.method4540(var5)) {
                method1794(Statics.field367[var5], 1);
            }
        }
    }

    @ObfuscatedName("v.jd(Lhi;I)Z")
    public static final boolean method407(class231 arg0) {
        int var1 = arg0.field2610;
        if (var1 == 205) {
            field628 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field842.method4112(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field842.method4127(var4, var5 == 1);
        }
        if (var1 == 324) {
            field842.method4099(false);
        }
        if (var1 == 325) {
            field842.method4099(true);
        }
        if (var1 == 326) {
            class173 var6 = Statics.method414(class170.field2174, field627.field1219);
            field842.method4100(var6.field2258);
            field627.method1847(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fg.jq(Lhi;IIIS)V")
    public static final void method3176(class231 arg0, int arg1, int arg2, int arg3) {
        method938();
        class225 var4 = arg0.method4151(false);
        if (var4 == null) {
            return;
        }
        class315.method5288(arg1, arg2, var4.field2554 + arg1, var4.field2550 + arg2);
        if (field811 == 2 || field811 == 5) {
            class315.method5310(arg1, arg2, 0, var4.field2552, var4.field2551);
        } else {
            int var5 = field718 & 0x7FF;
            int var6 = Statics.field1877.field932 / 32 + 48;
            int var7 = 464 - Statics.field1877.field882 / 32;
            Statics.field1039.method5405(arg1, arg2, var4.field2554, var4.field2550, var6, var7, var5, 256, var4.field2552, var4.field2551);
            for (int var8 = 0; var8 < field725; var8++) {
                int var9 = field806[var8] * 4 + 2 - Statics.field1877.field932 / 32;
                int var10 = field807[var8] * 4 + 2 - Statics.field1877.field882 / 32;
                method943(arg1, arg2, var9, var10, field817[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class206 var13 = field709[Statics.field83][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1877.field932 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1877.field882 / 32;
                        method943(arg1, arg2, var14, var15, Statics.field315[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field623; var16++) {
                class73 var17 = field844[field640[var16]];
                if (var17 != null && var17.method1042()) {
                    class272 var18 = var17.field1038;
                    if (var18 != null && var18.field3517 != null) {
                        var18 = var18.method4795();
                    }
                    if (var18 != null && var18.field3508 && var18.field3505) {
                        int var19 = var17.field932 / 32 - Statics.field1877.field932 / 32;
                        int var20 = var17.field882 / 32 - Statics.field1877.field882 / 32;
                        method943(arg1, arg2, var19, var20, Statics.field315[1], var4);
                    }
                }
            }
            int var21 = class82.field1168;
            int[] var22 = class82.field1160;
            for (int var23 = 0; var23 < var21; var23++) {
                class61 var24 = field611[var22[var23]];
                if (var24 != null && var24.method1042() && !var24.field567 && Statics.field1877 != var24) {
                    int var25 = var24.field932 / 32 - Statics.field1877.field932 / 32;
                    int var26 = var24.field882 / 32 - Statics.field1877.field882 / 32;
                    boolean var27 = false;
                    if (Statics.field1877.field569 != 0 && var24.field569 != 0 && Statics.field1877.field569 == var24.field569) {
                        var27 = true;
                    }
                    if (var24.method1004()) {
                        method943(arg1, arg2, var25, var26, Statics.field315[3], var4);
                    } else if (var27) {
                        method943(arg1, arg2, var25, var26, Statics.field315[4], var4);
                    } else if (var24.method1025()) {
                        method943(arg1, arg2, var25, var26, Statics.field315[5], var4);
                    } else {
                        method943(arg1, arg2, var25, var26, Statics.field315[2], var4);
                    }
                }
            }
            if (field600 != 0 && field592 % 20 < 10) {
                if (field600 == 1 && field601 >= 0 && field601 < field844.length) {
                    class73 var28 = field844[field601];
                    if (var28 != null) {
                        int var29 = var28.field932 / 32 - Statics.field1877.field932 / 32;
                        int var30 = var28.field882 / 32 - Statics.field1877.field882 / 32;
                        method2579(arg1, arg2, var29, var30, Statics.field1447[1], var4);
                    }
                }
                if (field600 == 2) {
                    int var31 = field603 * 4 - Statics.field869 * 4 + 2 - Statics.field1877.field932 / 32;
                    int var32 = field819 * 4 - Statics.field755 * 4 + 2 - Statics.field1877.field882 / 32;
                    method2579(arg1, arg2, var31, var32, Statics.field1447[1], var4);
                }
                if (field600 == 10 && field580 >= 0 && field580 < field611.length) {
                    class61 var33 = field611[field580];
                    if (var33 != null) {
                        int var34 = var33.field932 / 32 - Statics.field1877.field932 / 32;
                        int var35 = var33.field882 / 32 - Statics.field1877.field882 / 32;
                        method2579(arg1, arg2, var34, var35, Statics.field1447[1], var4);
                    }
                }
            }
            if (field809 != 0) {
                int var36 = field809 * 4 + 2 - Statics.field1877.field932 / 32;
                int var37 = field810 * 4 + 2 - Statics.field1877.field882 / 32;
                method943(arg1, arg2, var36, var37, Statics.field1447[0], var4);
            }
            if (!Statics.field1877.field567) {
                class315.method5331(var4.field2554 / 2 + arg1 - 1, var4.field2550 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field789[arg3] = true;
    }

    @ObfuscatedName("dw.jv(IIIILll;Lhv;I)V")
    public static final void method2579(int arg0, int arg1, int arg2, int arg3, class319 arg4, class225 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method943(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field718 & 0x7FF;
        int var8 = class123.field1682[var7];
        int var9 = class123.field1694[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2554 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1863.method5425(arg5.field2554 / 2 + arg0 - var17 / 2 + var15, arg5.field2550 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bj.jn(IIIILll;Lhv;B)V")
    public static final void method943(int arg0, int arg1, int arg2, int arg3, class319 arg4, class225 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field718 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class123.field1682[var6];
        int var9 = class123.field1694[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5427(arg5.field2554 / 2 + var10 - arg4.field3797 / 2, arg5.field2550 / 2 - var11 - arg4.field3793 / 2, arg0, arg1, arg5.field2554, arg5.field2550, arg5.field2552, arg5.field2551);
        } else {
            arg4.method5411(arg5.field2554 / 2 + arg0 + var10 - arg4.field3797 / 2, arg5.field2550 / 2 + arg1 - var11 - arg4.field3793 / 2);
        }
    }

    @ObfuscatedName("bp.jc(I)V")
    public static final void method933() {
        for (int var0 = 0; var0 < class82.field1168; var0++) {
            class61 var1 = field611[class82.field1160[var0]];
            var1.method1005();
        }
        class84.method576();
        if (Statics.field95 != null) {
            Statics.field95.method5047();
        }
    }

    @ObfuscatedName("w.js(I)V")
    public static final void method14() {
        field829 = field802;
        Statics.field490 = true;
    }

    @ObfuscatedName("fm.jm(Ljava/lang/String;I)V")
    public static final void method3211(String arg0) {
        if (Statics.field95 != null) {
            class173 var1 = Statics.method414(class170.field2175, field627.field1219);
            var1.field2258.method3235(class183.method5380(arg0));
            var1.field2258.method3402(arg0);
            field627.method1847(var1);
        }
    }

    @ObfuscatedName("ew.jg(IB)V")
    public static void method2864(int arg0) {
        for (class212 var1 = (class212) field784.method3710(); var1 != null; var1 = (class212) field784.method3711()) {
            if ((long) arg0 == (var1.field2422 >> 48 & 0xFFFFL)) {
                var1.method3756();
            }
        }
    }

    @ObfuscatedName("c.jr(Lhi;B)I")
    public static int method406(class231 arg0) {
        class212 var1 = (class212) field784.method3712(((long) arg0.field2692 << 32) + (long) arg0.field2607);
        return var1 == null ? arg0.field2679 : var1.field2439;
    }

    @ObfuscatedName("co.jb(Lhi;B)Z")
    public static boolean method1756(class231 arg0) {
        return arg0.field2626;
    }

    @ObfuscatedName("dp.jz(Lhi;II)Ljava/lang/String;")
    public static String method2361(class231 arg0, int arg1) {
        if (!class232.method2058(method406(arg0), arg1) && arg0.field2707 == null) {
            return null;
        } else if (arg0.field2681 == null || arg0.field2681.length <= arg1 || arg0.field2681[arg1] == null || arg0.field2681[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2681[arg1];
        }
    }

    @ObfuscatedName("ej.jx(Lhi;I)Ljava/lang/String;")
    public static String method2998(class231 arg0) {
        if (class232.method3011(method406(arg0)) == 0) {
            return null;
        } else if (arg0.field2662 == null || arg0.field2662.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2662;
        }
    }

    @ObfuscatedName("eu.jf(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2931(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field778 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field778 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field778 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field778 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field778 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2014 != null) {
            var3 = "/p=" + Statics.field2014;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field828 + "/a=" + Statics.field1710 + var3 + "/";
    }

    @ObfuscatedName("fv.je(Lgk;II)V")
    public static void method3190(class183 arg0, int arg1) {
        byte[] var2 = arg0.field2339;
        if (field621 == null) {
            field621 = new byte[24];
        }
        class194.method3565(var2, arg1, field621, 0, 24);
        class156.method2959(arg0, arg1);
    }

    @ObfuscatedName("client.jh(I)Lkm;")
    public class292 method1071() {
        return Statics.field1877 == null ? null : Statics.field1877.field553;
    }

    @ObfuscatedName("y.kx(IIIZI)V")
    public static void method178(int arg0, int arg1, int arg2, boolean arg3) {
        class173 var4 = Statics.method414(class170.field2157, field627.field1219);
        var4.field2258.method3278(arg2);
        var4.field2258.method3297(arg3 ? field854 : 0);
        var4.field2258.method3286(arg1);
        var4.field2258.method3474(arg0);
        field627.method1847(var4);
    }

    @ObfuscatedName("au.kz(B)Z")
    public static boolean method617() {
        return field748 >= 2;
    }

    @ObfuscatedName("em.ke(II)V")
    public static void method2866(int arg0) {
        field656 = arg0;
    }

    @ObfuscatedName("fb.kd(I)V")
    public static void method3230() {
        if (!field664 || Statics.field1877 == null) {
            return;
        }
        int var0 = Statics.field1877.field923[0];
        int var1 = Statics.field1877.field873[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1429 = Statics.field1877.field932;
        int var2 = method422(Statics.field1877.field932, Statics.field1877.field882, Statics.field83) - field645;
        if (var2 < Statics.field3479) {
            Statics.field3479 = var2;
        }
        Statics.field24 = Statics.field1877.field882;
        field664 = false;
    }

    @ObfuscatedName("ec.kf(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2908(String arg0) {
        class243[] var1 = class243.method197();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3.field3129 != -1) {
                int var5 = var3.field3129;
                String var6 = "<img=" + var5 + ">";
                if (arg0.startsWith(var6)) {
                    arg0 = arg0.substring(6 + Integer.toString(var3.field3129).length());
                    break;
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ci.km(I)V")
    public static void method2059() {
        if (Statics.field176 == null) {
            return;
        }
        field651 = field592;
        Statics.field176.method4386();
        for (int var0 = 0; var0 < field611.length; var0++) {
            if (field611[var0] != null) {
                Statics.field176.method4385((field611[var0].field932 >> 7) + Statics.field869, (field611[var0].field882 >> 7) + Statics.field755);
            }
        }
    }
}

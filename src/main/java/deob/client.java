package deob;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class53 implements class292 {

    @ObfuscatedName("client.w")
    public static class178[] field854 = new class178[4];

    @ObfuscatedName("client.ai")
    public static boolean field827 = true;

    @ObfuscatedName("client.ba")
    public static int field622 = 1;

    @ObfuscatedName("client.bb")
    public static int field623 = 0;

    @ObfuscatedName("client.bq")
    public static int field753 = 0;

    @ObfuscatedName("client.bd")
    public static boolean field625 = false;

    @ObfuscatedName("client.bc")
    public static boolean field626 = false;

    @ObfuscatedName("client.bo")
    public static int field671 = 0;

    @ObfuscatedName("client.bm")
    public static int field685 = -1;

    @ObfuscatedName("client.bl")
    public static boolean field629 = false;

    @ObfuscatedName("client.br")
    public static int field630 = 0;

    @ObfuscatedName("client.cj")
    public static boolean field862 = true;

    @ObfuscatedName("client.cu")
    public static int field633 = 0;

    @ObfuscatedName("client.cb")
    public static long field627 = -1L;

    @ObfuscatedName("client.cn")
    public static int field696 = -1;

    @ObfuscatedName("client.cq")
    public static int field744 = -1;

    @ObfuscatedName("client.ch")
    public static long field637 = -1L;

    @ObfuscatedName("client.cw")
    public static boolean field634 = true;

    @ObfuscatedName("client.cg")
    public static boolean field639 = false;

    @ObfuscatedName("client.cf")
    public static int field640 = 0;

    @ObfuscatedName("client.cp")
    public static int field821 = 0;

    @ObfuscatedName("client.cl")
    public static int field817 = 0;

    @ObfuscatedName("client.ct")
    public static int field643 = 0;

    @ObfuscatedName("client.cz")
    public static int field644 = 0;

    @ObfuscatedName("client.cc")
    public static int field886 = 0;

    @ObfuscatedName("client.ci")
    public static int field884 = 0;

    @ObfuscatedName("client.cd")
    public static int field648 = 0;

    @ObfuscatedName("client.cx")
    public static int field876 = 0;

    @ObfuscatedName("client.co")
    public static class85 field649 = class85.field1141;

    @ObfuscatedName("client.de")
    public static class85 field898 = class85.field1141;

    @ObfuscatedName("client.dt")
    public static int field651 = 0;

    @ObfuscatedName("client.da")
    public static int field652 = 0;

    @ObfuscatedName("client.dp")
    public static int field653 = 0;

    @ObfuscatedName("client.ek")
    public static int field654 = 0;

    @ObfuscatedName("client.ed")
    public static int field655 = 0;

    @ObfuscatedName("client.ex")
    public static int field656 = 0;

    @ObfuscatedName("client.ej")
    public static int field657 = 0;

    @ObfuscatedName("client.el")
    public static int field658 = 0;

    @ObfuscatedName("client.en")
    public static class160 field659 = class160.field1986;

    @ObfuscatedName("client.ew")
    public static boolean field752 = false;

    @ObfuscatedName("client.eu")
    public static class89 field662 = new class89();

    @ObfuscatedName("client.ev")
    public static byte[] field663 = null;

    @ObfuscatedName("client.ez")
    public static class80[] field664 = new class80[32768];

    @ObfuscatedName("client.ep")
    public static int field665 = 0;

    @ObfuscatedName("client.fq")
    public static int[] field666 = new int[32768];

    @ObfuscatedName("client.fw")
    public static int field667 = 0;

    @ObfuscatedName("client.fg")
    public static int[] field668 = new int[250];

    @ObfuscatedName("client.fj")
    public static final class96 field669 = new class96();

    @ObfuscatedName("client.fd")
    public static int field670 = 0;

    @ObfuscatedName("client.fh")
    public static boolean field852 = false;

    @ObfuscatedName("client.fx")
    public static boolean field672 = true;

    @ObfuscatedName("client.fm")
    public static class284 field673 = new class284();

    @ObfuscatedName("client.ft")
    public static HashMap field674 = new HashMap();

    @ObfuscatedName("client.fe")
    public static int field675 = 0;

    @ObfuscatedName("client.fn")
    public static int field866 = 1;

    @ObfuscatedName("client.fk")
    public static int field789 = 0;

    @ObfuscatedName("client.gp")
    public static int field678 = 1;

    @ObfuscatedName("client.gh")
    public static int field679 = 0;

    @ObfuscatedName("client.gg")
    public static boolean field681 = false;

    @ObfuscatedName("client.gq")
    public static int[][][] field635 = new int[4][13][13];

    @ObfuscatedName("client.gd")
    public static final int[] field683 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gy")
    public static int field684 = 0;

    @ObfuscatedName("client.hx")
    public static int field661 = 2301979;

    @ObfuscatedName("client.hn")
    public static int field820 = 5063219;

    @ObfuscatedName("client.hr")
    public static int field715 = 3353893;

    @ObfuscatedName("client.hg")
    public static int field688 = 7759444;

    @ObfuscatedName("client.hh")
    public static boolean field839 = false;

    @ObfuscatedName("client.hd")
    public static int field690 = 0;

    @ObfuscatedName("client.hw")
    public static int field693 = 128;

    @ObfuscatedName("client.hp")
    public static int field692 = 0;

    @ObfuscatedName("client.hv")
    public static int field885 = 0;

    @ObfuscatedName("client.hu")
    public static int field701 = 0;

    @ObfuscatedName("client.hi")
    public static int field695 = 0;

    @ObfuscatedName("client.ht")
    public static int field650 = 0;

    @ObfuscatedName("client.hj")
    public static int field778 = 0;

    @ObfuscatedName("client.ho")
    public static int field687 = 50;

    @ObfuscatedName("client.hc")
    public static int field699 = 0;

    @ObfuscatedName("client.hk")
    public static int field642 = 0;

    @ObfuscatedName("client.if")
    public static int field858 = 0;

    @ObfuscatedName("client.ie")
    public static int field702 = 12;

    @ObfuscatedName("client.in")
    public static int field812 = 6;

    @ObfuscatedName("client.il")
    public static int field704 = 0;

    @ObfuscatedName("client.ij")
    public static boolean field705 = false;

    @ObfuscatedName("client.iy")
    public static int field706 = 0;

    @ObfuscatedName("client.is")
    public static boolean field707 = false;

    @ObfuscatedName("client.ik")
    public static int field708 = 0;

    @ObfuscatedName("client.ir")
    public static int field709 = 0;

    @ObfuscatedName("client.iv")
    public static int field891 = 50;

    @ObfuscatedName("client.it")
    public static String field728 = null;

    @ObfuscatedName("client.iq")
    public static int[] field782 = new int[field891];

    @ObfuscatedName("client.iu")
    public static int[] field638 = new int[field891];

    @ObfuscatedName("client.ip")
    public static int[] field713 = new int[field891];

    @ObfuscatedName("client.ib")
    public static int[] field689 = new int[field891];

    @ObfuscatedName("client.ic")
    public static int[] field835 = new int[field891];

    @ObfuscatedName("client.iw")
    public static int[] field716 = new int[field891];

    @ObfuscatedName("client.io")
    public static int[] field836 = new int[field891];

    @ObfuscatedName("client.ih")
    public static String[] field718 = new String[field891];

    @ObfuscatedName("client.im")
    public static int[][] field719 = new int[104][104];

    @ObfuscatedName("client.ii")
    public static int field720 = 0;

    @ObfuscatedName("client.ig")
    public static int field725 = -1;

    @ObfuscatedName("client.ia")
    public static int field722 = -1;

    @ObfuscatedName("client.jb")
    public static int field723 = 0;

    @ObfuscatedName("client.jq")
    public static int field724 = 0;

    @ObfuscatedName("client.jw")
    public static int field647 = 0;

    @ObfuscatedName("client.jm")
    public static int field880 = 0;

    @ObfuscatedName("client.jr")
    public static boolean field727 = true;

    @ObfuscatedName("client.ju")
    public static int field700 = 0;

    @ObfuscatedName("client.jz")
    public static int field729 = 0;

    @ObfuscatedName("client.jp")
    public static int field732 = 0;

    @ObfuscatedName("client.ja")
    public static int field731 = 0;

    @ObfuscatedName("client.je")
    public static int field691 = 0;

    @ObfuscatedName("client.jy")
    public static int field733 = 0;

    @ObfuscatedName("client.jl")
    public static boolean field734 = false;

    @ObfuscatedName("client.jt")
    public static int field735 = 0;

    @ObfuscatedName("client.jc")
    public static int field710 = 0;

    @ObfuscatedName("client.jj")
    public static boolean field737 = true;

    @ObfuscatedName("client.jd")
    public static class67[] field738 = new class67[2048];

    @ObfuscatedName("client.ji")
    public static int field843 = -1;

    @ObfuscatedName("client.jo")
    public static int field740 = 0;

    @ObfuscatedName("client.js")
    public static boolean field779 = true;

    @ObfuscatedName("client.ke")
    public static int field686 = 0;

    @ObfuscatedName("client.ky")
    public static int field743 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field841 = new int[1000];

    @ObfuscatedName("client.kp")
    public static final int[] field726 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kq")
    public static String[] field746 = new String[8];

    @ObfuscatedName("client.kv")
    public static boolean[] field747 = new boolean[8];

    @ObfuscatedName("client.kn")
    public static int[] field748 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kx")
    public static int field636 = -1;

    @ObfuscatedName("client.kz")
    public static class273[][][] field893 = new class273[4][104][104];

    @ObfuscatedName("client.kh")
    public static class273 field751 = new class273();

    @ObfuscatedName("client.kk")
    public static class273 field861 = new class273();

    @ObfuscatedName("client.kt")
    public static class273 field881 = new class273();

    @ObfuscatedName("client.ki")
    public static int[] field754 = new int[25];

    @ObfuscatedName("client.kr")
    public static int[] field755 = new int[25];

    @ObfuscatedName("client.kb")
    public static int[] field756 = new int[25];

    @ObfuscatedName("client.ku")
    public static int field757 = 0;

    @ObfuscatedName("client.kc")
    public static boolean field758 = false;

    @ObfuscatedName("client.ll")
    public static int field759 = 0;

    @ObfuscatedName("client.ly")
    public static int[] field646 = new int[500];

    @ObfuscatedName("client.li")
    public static int[] field736 = new int[500];

    @ObfuscatedName("client.lh")
    public static int[] field762 = new int[500];

    @ObfuscatedName("client.lk")
    public static int[] field763 = new int[500];

    @ObfuscatedName("client.ld")
    public static String[] field776 = new String[500];

    @ObfuscatedName("client.la")
    public static String[] field694 = new String[500];

    @ObfuscatedName("client.lt")
    public static boolean[] field818 = new boolean[500];

    @ObfuscatedName("client.lw")
    public static boolean field767 = false;

    @ObfuscatedName("client.lf")
    public static boolean field739 = false;

    @ObfuscatedName("client.lp")
    public static boolean field698 = false;

    @ObfuscatedName("client.lj")
    public static boolean field770 = true;

    @ObfuscatedName("client.lq")
    public static int field761 = -1;

    @ObfuscatedName("client.ln")
    public static int field772 = -1;

    @ObfuscatedName("client.lb")
    public static int field773 = 0;

    @ObfuscatedName("client.ls")
    public static int field774 = 50;

    @ObfuscatedName("client.lz")
    public static int field783 = 0;

    @ObfuscatedName("client.lv")
    public static boolean field777 = false;

    @ObfuscatedName("client.lc")
    public static int field676 = -1;

    @ObfuscatedName("client.mh")
    public static int field873 = -1;

    @ObfuscatedName("client.mk")
    public static String field780 = null;

    @ObfuscatedName("client.mu")
    public static String field781 = null;

    @ObfuscatedName("client.mm")
    public static int field830 = -1;

    @ObfuscatedName("client.mj")
    public static class319 field703 = new class319(8);

    @ObfuscatedName("client.mf")
    public static int field784 = 0;

    @ObfuscatedName("client.ms")
    public static int field785 = -1;

    @ObfuscatedName("client.mg")
    public static int field786 = 0;

    @ObfuscatedName("client.mb")
    public static int field787 = 0;

    @ObfuscatedName("client.mo")
    public static class229 field788 = null;

    @ObfuscatedName("client.mi")
    public static int field721 = 0;

    @ObfuscatedName("client.mv")
    public static int field717 = 0;

    @ObfuscatedName("client.mw")
    public static int field791 = 0;

    @ObfuscatedName("client.ml")
    public static int field792 = -1;

    @ObfuscatedName("client.mn")
    public static boolean field811 = false;

    @ObfuscatedName("client.mx")
    public static class229 field794 = null;

    @ObfuscatedName("client.mc")
    public static class229 field887 = null;

    @ObfuscatedName("client.mr")
    public static class229 field796 = null;

    @ObfuscatedName("client.mt")
    public static int field797 = 0;

    @ObfuscatedName("client.me")
    public static int field798 = 0;

    @ObfuscatedName("client.md")
    public static class229 field799 = null;

    @ObfuscatedName("client.nn")
    public static boolean field800 = false;

    @ObfuscatedName("client.nw")
    public static int field801 = -1;

    @ObfuscatedName("client.nl")
    public static int field802 = -1;

    @ObfuscatedName("client.nt")
    public static boolean field803 = false;

    @ObfuscatedName("client.nk")
    public static int field804 = -1;

    @ObfuscatedName("client.np")
    public static int field805 = -1;

    @ObfuscatedName("client.ny")
    public static boolean field806 = false;

    @ObfuscatedName("client.ng")
    public static int field807 = 1;

    @ObfuscatedName("client.nr")
    public static int[] field808 = new int[32];

    @ObfuscatedName("client.nd")
    public static int field809 = 0;

    @ObfuscatedName("client.nz")
    public static int[] field810 = new int[32];

    @ObfuscatedName("client.ns")
    public static int field768 = 0;

    @ObfuscatedName("client.nf")
    public static int[] field624 = new int[32];

    @ObfuscatedName("client.nx")
    public static int field813 = 0;

    @ObfuscatedName("client.nq")
    public static int field814 = 0;

    @ObfuscatedName("client.na")
    public static int field815 = 0;

    @ObfuscatedName("client.nh")
    public static int field816 = 0;

    @ObfuscatedName("client.nv")
    public static int field677 = 0;

    @ObfuscatedName("client.nc")
    public static int field764 = 0;

    @ObfuscatedName("client.ni")
    public static int field819 = 0;

    @ObfuscatedName("client.oe")
    public static int field741 = 0;

    @ObfuscatedName("client.og")
    public static class273 field680 = new class273();

    @ObfuscatedName("client.oh")
    public static class273 field822 = new class273();

    @ObfuscatedName("client.oc")
    public static class273 field823 = new class273();

    @ObfuscatedName("client.on")
    public static class319 field824 = new class319(512);

    @ObfuscatedName("client.os")
    public static int field825 = 0;

    @ObfuscatedName("client.oo")
    public static int field826 = -2;

    @ObfuscatedName("client.od")
    public static boolean[] field864 = new boolean[100];

    @ObfuscatedName("client.ot")
    public static boolean[] field828 = new boolean[100];

    @ObfuscatedName("client.oq")
    public static boolean[] field829 = new boolean[100];

    @ObfuscatedName("client.oy")
    public static int[] field712 = new int[100];

    @ObfuscatedName("client.oi")
    public static int[] field849 = new int[100];

    @ObfuscatedName("client.oj")
    public static int[] field832 = new int[100];

    @ObfuscatedName("client.ox")
    public static int[] field833 = new int[100];

    @ObfuscatedName("client.oz")
    public static int field834 = 0;

    @ObfuscatedName("client.oa")
    public static long field745 = 0L;

    @ObfuscatedName("client.or")
    public static boolean field765 = true;

    @ObfuscatedName("client.pv")
    public static int[] field837 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pt")
    public static int field838 = 0;

    @ObfuscatedName("client.pl")
    public static int field628 = 0;

    @ObfuscatedName("client.pz")
    public static String field840 = "";

    @ObfuscatedName("client.pu")
    public static long[] field775 = new long[100];

    @ObfuscatedName("client.pb")
    public static int field842 = 0;

    @ObfuscatedName("client.pm")
    public static int field750 = 0;

    @ObfuscatedName("client.pq")
    public static int[] field844 = new int[128];

    @ObfuscatedName("client.pn")
    public static int[] field845 = new int[128];

    @ObfuscatedName("client.pp")
    public static long field711 = -1L;

    @ObfuscatedName("client.ph")
    public static int field847 = -1;

    @ObfuscatedName("client.pi")
    public static int field760 = 0;

    @ObfuscatedName("client.ps")
    public static int[] field771 = new int[1000];

    @ObfuscatedName("client.pw")
    public static int[] field850 = new int[1000];

    @ObfuscatedName("client.po")
    public static class328[] field851 = new class328[1000];

    @ObfuscatedName("client.pd")
    public static int field714 = 0;

    @ObfuscatedName("client.pk")
    public static int field853 = 0;

    @ObfuscatedName("client.qm")
    public static int field730 = 0;

    @ObfuscatedName("client.qf")
    public static int field831 = 255;

    @ObfuscatedName("client.qy")
    public static int field856 = -1;

    @ObfuscatedName("client.qq")
    public static boolean field857 = false;

    @ObfuscatedName("client.qp")
    public static int field697 = 127;

    @ObfuscatedName("client.qc")
    public static int field859 = 127;

    @ObfuscatedName("client.qa")
    public static int field860 = 0;

    @ObfuscatedName("client.qv")
    public static int[] field790 = new int[50];

    @ObfuscatedName("client.qn")
    public static int[] field621 = new int[50];

    @ObfuscatedName("client.qd")
    public static int[] field795 = new int[50];

    @ObfuscatedName("client.qk")
    public static int[] field869 = new int[50];

    @ObfuscatedName("client.qe")
    public static class100[] field865 = new class100[50];

    @ObfuscatedName("client.qz")
    public static boolean field742 = false;

    @ObfuscatedName("client.rh")
    public static boolean[] field867 = new boolean[5];

    @ObfuscatedName("client.rd")
    public static int[] field868 = new int[5];

    @ObfuscatedName("client.rl")
    public static int[] field769 = new int[5];

    @ObfuscatedName("client.rj")
    public static int[] field870 = new int[5];

    @ObfuscatedName("client.rk")
    public static int[] field871 = new int[5];

    @ObfuscatedName("client.rw")
    public static short field872 = 256;

    @ObfuscatedName("client.rm")
    public static short field632 = 205;

    @ObfuscatedName("client.re")
    public static short field874 = 256;

    @ObfuscatedName("client.rb")
    public static short field875 = 320;

    @ObfuscatedName("client.rv")
    public static short field892 = 1;

    @ObfuscatedName("client.ri")
    public static short field877 = 32767;

    @ObfuscatedName("client.rs")
    public static short field878 = 1;

    @ObfuscatedName("client.rp")
    public static short field879 = 32767;

    @ObfuscatedName("client.rr")
    public static int field793 = 0;

    @ObfuscatedName("client.rn")
    public static int field846 = 0;

    @ObfuscatedName("client.ry")
    public static int field882 = 0;

    @ObfuscatedName("client.rx")
    public static int field883 = 0;

    @ObfuscatedName("client.rz")
    public static int field645 = 0;

    @ObfuscatedName("client.ru")
    public static class226 field682 = new class226();

    @ObfuscatedName("client.sd")
    public static int field863 = -1;

    @ObfuscatedName("client.sl")
    public static int field749 = -1;

    @ObfuscatedName("client.sk")
    public static class331 field888 = new class330();

    @ObfuscatedName("client.sb")
    public static class10[] field889 = new class10[8];

    @ObfuscatedName("client.sj")
    public static class68 field890 = new class68();

    @ObfuscatedName("client.ss")
    public static int field848 = -1;

    @ObfuscatedName("client.sy")
    public static ArrayList field855 = new ArrayList(10);

    @ObfuscatedName("client.sq")
    public static int field641 = 0;

    @ObfuscatedName("client.sx")
    public static int field894 = 0;

    @ObfuscatedName("client.tb")
    public static final class66 field896 = new class66();

    @ObfuscatedName("client.tp")
    public static int[] field897 = new int[50];

    @ObfuscatedName("client.th")
    public static int[] field766 = new int[50];

    @ObfuscatedName("client.au(I)V")
    public final void method816() {
    }

    public final void init() {
        if (!this.method797()) {
            return;
        }
        class283[] var1 = class283.method34();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class283 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3665);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3665)) {
                    case 1:
                        field672 = Integer.parseInt(var4) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class82.field1113)) {
                            field625 = true;
                        } else {
                            field625 = false;
                        }
                        break;
                    case 4:
                        if (field685 == -1) {
                            field685 = Integer.parseInt(var4);
                        }
                        break;
                    case 5:
                        field623 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field671 = Integer.parseInt(var4);
                        break;
                    case 7:
                        int var5 = Integer.parseInt(var4);
                        class241[] var6 = new class241[] { class241.field3174, class241.field3175, class241.field3179, class241.field3172 };
                        class241[] var7 = var6;
                        int var8 = 0;
                        class241 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class241 var9 = var7[var8];
                            if (var9.field3177 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field80 = var10;
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class82.field1113)) {
                        }
                        break;
                    case 9:
                        Statics.field163 = var4;
                        break;
                    case 10:
                        Statics.field166 = (class242) class197.method999(class242.method3313(), Integer.parseInt(var4));
                        if (Statics.field166 == class242.field3186) {
                            Statics.field366 = class335.field4023;
                        } else {
                            Statics.field366 = class335.field4024;
                        }
                        break;
                    case 12:
                        field622 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field3226 = Integer.parseInt(var4);
                        break;
                    case 15:
                        field753 = Integer.parseInt(var4);
                        break;
                    case 17:
                        Statics.field3173 = var4;
                }
            }
        }
        Statics.method4142();
        Statics.field413 = this.getCodeBase().getHost();
        String var11 = Statics.field80.field3176;
        byte var12 = 0;
        try {
            Statics.field2043 = 21;
            Statics.field2467 = var12;
            try {
                Statics.field3532 = System.getProperty("os.name");
            } catch (Exception var51) {
                Statics.field3532 = "Unknown";
            }
            Statics.field196 = Statics.field3532.toLowerCase();
            try {
                Statics.field352 = System.getProperty("user.home");
                if (Statics.field352 != null) {
                    Statics.field352 = Statics.field352 + "/";
                }
            } catch (Exception var50) {
            }
            try {
                if (Statics.field196.startsWith("win")) {
                    if (Statics.field352 == null) {
                        Statics.field352 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field352 == null) {
                    Statics.field352 = System.getenv("HOME");
                }
                if (Statics.field352 != null) {
                    Statics.field352 = Statics.field352 + "/";
                }
            } catch (Exception var49) {
            }
            if (Statics.field352 == null) {
                Statics.field352 = "~/";
            }
            Statics.field276 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field352, "/tmp/", "" };
            Statics.field391 = new String[] { ".jagex_cache_" + Statics.field2467, ".file_store_" + Statics.field2467 };
            int var16 = 0;
            label257: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field4035 = new File(Statics.field352, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field4035.exists()) {
                    try {
                        class119 var21 = new class119(Statics.field4035, "rw", 10000L);
                        class202 var22 = new class202((int) var21.method2476());
                        while (var22.field2439 < var22.field2440.length) {
                            int var23 = var21.method2477(var22.field2440, var22.field2439, var22.field2440.length - var22.field2439);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field2439 += var23;
                        }
                        var22.field2439 = 0;
                        int var24 = var22.method3551();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method3551();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method3462();
                            if (var25 == 1) {
                                var19 = var22.method3462();
                            }
                        } else {
                            var18 = var22.method3428();
                            if (var25 == 1) {
                                var19 = var22.method3428();
                            }
                        }
                        var21.method2474();
                    } catch (IOException var53) {
                        var53.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class169.method709(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label232: for (int var29 = 0; var29 < Statics.field391.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field276.length; var30++) {
                            File var31 = new File(Statics.field276[var30] + Statics.field391[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class169.method709(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label232;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field352 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
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
                    } catch (Exception var52) {
                        var52.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    class169.method150(new File(var18), (File) null);
                }
                File var41 = new File(var18);
                Statics.field2042 = var41;
                if (!Statics.field2042.exists()) {
                    Statics.field2042.mkdirs();
                }
                File[] var42 = Statics.field2042.listFiles();
                if (var42 != null) {
                    File[] var43 = var42;
                    for (int var44 = 0; var44 < var43.length; var44++) {
                        File var45 = var43[var44];
                        if (!class169.method709(var45, false)) {
                            var16++;
                            continue label257;
                        }
                    }
                }
                break;
            }
            File var46 = Statics.field2042;
            Statics.field2054 = var46;
            if (!Statics.field2054.exists()) {
                throw new RuntimeException("");
            }
            class172.field2053 = true;
            class169.method1811();
            class169.field2048 = new class118(new class119(class172.method280("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class169.field2049 = new class118(new class119(class172.method280("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field3195 = new class118[Statics.field2043];
            for (int var47 = 0; var47 < Statics.field2043; var47++) {
                Statics.field3195[var47] = new class118(new class119(class172.method280("main_file_cache.idx" + var47), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var54) {
            class166.method4746((String) null, var54);
        }
        Statics.field1509 = this;
        Statics.field2014 = field685;
        this.method795(765, 503, 180);
    }

    @ObfuscatedName("client.aw(I)V")
    public final void method807() {
        class203.method542(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field13 = field753 == 0 ? 43594 : field622 + 40000;
        Statics.field216 = field753 == 0 ? 443 : field622 + 50000;
        Statics.field2451 = Statics.field13;
        Statics.field2609 = class227.field2625;
        Statics.field2788 = class227.field2622;
        Statics.field2627 = class227.field2621;
        Statics.field505 = class227.field2623;
        Statics.field3705 = new class144();
        this.method789();
        this.method790();
        Statics.field87 = this.method913();
        Statics.field3749 = new class176(255, class169.field2048, class169.field2049, 500000);
        Statics.field3868 = class74.method5315();
        this.method815();
        String var2 = Statics.field3698;
        class51.field411 = this;
        if (var2 != null) {
            class51.field404 = var2;
        }
        if (field753 != 0) {
            field639 = true;
        }
        method1911(Statics.field3868.field1024);
        Statics.field205 = new class75(Statics.field366);
    }

    @ObfuscatedName("client.al(I)V")
    public final void method832() {
        field633++;
        this.method1162();
        Statics.method30();
        try {
            if (class215.field2503 == 1) {
                int var1 = Statics.field2506.method3838();
                if (var1 > 0 && Statics.field2506.method3807()) {
                    int var2 = var1 - Statics.field1867;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2506.method3801(var2);
                } else {
                    Statics.field2506.method3806();
                    Statics.field2506.method3804();
                    if (Statics.field2505 == null) {
                        class215.field2503 = 0;
                    } else {
                        class215.field2503 = 2;
                    }
                    Statics.field75 = null;
                    Statics.field3795 = null;
                }
            }
        } catch (Exception var219) {
            var219.printStackTrace();
            Statics.field2506.method3806();
            class215.field2503 = 0;
            Statics.field75 = null;
            Statics.field3795 = null;
            Statics.field2505 = null;
        }
        method146();
        class45.method3206();
        class54 var4 = class54.field455;
        synchronized (class54.field455) {
            class54.field461 = class54.field476;
            class54.field456 = class54.field471;
            class54.field463 = class54.field459;
            class54.field464 = class54.field460;
            class54.field469 = class54.field472;
            class54.field462 = class54.field466;
            class54.field475 = class54.field467;
            class54.field470 = class54.field468;
            class54.field472 = 0;
        }
        if (Statics.field87 != null) {
            int var6 = Statics.field87.method676();
            field741 = var6;
        }
        if (field630 == 0) {
            method3205();
            class53.method128();
        } else if (field630 == 5) {
            class86.method954(this);
            method3205();
            class53.method128();
        } else if (field630 == 10 || field630 == 11) {
            class86.method954(this);
        } else if (field630 == 20) {
            class86.method954(this);
            this.method1385();
        } else if (field630 == 25) {
            method3070(false);
            field675 = 0;
            boolean var7 = true;
            for (int var8 = 0; var8 < Statics.field328.length; var8++) {
                if (Statics.field510[var8] != -1 && Statics.field328[var8] == null) {
                    Statics.field328[var8] = Statics.field1220.method4156(Statics.field510[var8], 0);
                    if (Statics.field328[var8] == null) {
                        var7 = false;
                        field675++;
                    }
                }
                if (Statics.field465[var8] != -1 && Statics.field982[var8] == null) {
                    Statics.field982[var8] = Statics.field1220.method4157(Statics.field465[var8], 0, Statics.field2352[var8]);
                    if (Statics.field982[var8] == null) {
                        var7 = false;
                        field675++;
                    }
                }
            }
            if (var7) {
                field789 = 0;
                boolean var9 = true;
                for (int var10 = 0; var10 < Statics.field328.length; var10++) {
                    byte[] var11 = Statics.field982[var10];
                    if (var11 != null) {
                        int var12 = (Statics.field3801[var10] >> 8) * 64 - Statics.field405;
                        int var13 = (Statics.field3801[var10] & 0xFF) * 64 - Statics.field1088;
                        if (field681) {
                            var12 = 10;
                            var13 = 10;
                        }
                        var9 &= class56.method2523(var11, var12, var13);
                    }
                }
                if (var9) {
                    if (field679 != 0) {
                        method1535(class236.field2852 + class82.field1114 + class82.field1116 + 100 + "%" + class82.field1117, true);
                    }
                    method146();
                    Statics.field582.method2902();
                    for (int var14 = 0; var14 < 4; var14++) {
                        field854[var14].method3257();
                    }
                    for (int var15 = 0; var15 < 4; var15++) {
                        for (int var16 = 0; var16 < 104; var16++) {
                            for (int var17 = 0; var17 < 104; var17++) {
                                class56.field481[var15][var16][var17] = 0;
                            }
                        }
                    }
                    method146();
                    class56.field480 = 99;
                    Statics.field483 = new byte[4][104][104];
                    Statics.field3745 = new byte[4][104][104];
                    Statics.field261 = new byte[4][104][104];
                    Statics.field3791 = new byte[4][104][104];
                    Statics.field485 = new int[4][105][105];
                    Statics.field495 = new byte[4][105][105];
                    Statics.field2374 = new int[105][105];
                    Statics.field73 = new int[104];
                    Statics.field1121 = new int[104];
                    Statics.field2510 = new int[104];
                    Statics.field139 = new int[104];
                    Statics.field579 = new int[104];
                    int var18 = Statics.field328.length;
                    class76.method3996();
                    method3070(true);
                    if (!field681) {
                        for (int var19 = 0; var19 < var18; var19++) {
                            int var20 = (Statics.field3801[var19] >> 8) * 64 - Statics.field405;
                            int var21 = (Statics.field3801[var19] & 0xFF) * 64 - Statics.field1088;
                            byte[] var22 = Statics.field328[var19];
                            if (var22 != null) {
                                method146();
                                class56.method1982(var22, var20, var21, Statics.field1910 * 8 - 48, Statics.field101 * 8 - 48, field854);
                            }
                        }
                        for (int var23 = 0; var23 < var18; var23++) {
                            int var24 = (Statics.field3801[var23] >> 8) * 64 - Statics.field405;
                            int var25 = (Statics.field3801[var23] & 0xFF) * 64 - Statics.field1088;
                            byte[] var26 = Statics.field328[var23];
                            if (var26 == null && Statics.field101 < 800) {
                                method146();
                                class56.method3108(var24, var25, 64, 64);
                            }
                        }
                        method3070(true);
                        for (int var27 = 0; var27 < var18; var27++) {
                            byte[] var28 = Statics.field982[var27];
                            if (var28 != null) {
                                int var29 = (Statics.field3801[var27] >> 8) * 64 - Statics.field405;
                                int var30 = (Statics.field3801[var27] & 0xFF) * 64 - Statics.field1088;
                                method146();
                                class134 var31 = Statics.field582;
                                class178[] var32 = field854;
                                class202 var33 = new class202(var28);
                                int var34 = -1;
                                while (true) {
                                    int var35 = var33.method3567();
                                    if (var35 == 0) {
                                        break;
                                    }
                                    var34 += var35;
                                    int var36 = 0;
                                    while (true) {
                                        int var37 = var33.method3431();
                                        if (var37 == 0) {
                                            break;
                                        }
                                        var36 += var37 - 1;
                                        int var38 = var36 & 0x3F;
                                        int var39 = var36 >> 6 & 0x3F;
                                        int var40 = var36 >> 12;
                                        int var41 = var33.method3551();
                                        int var42 = var41 >> 2;
                                        int var43 = var41 & 0x3;
                                        int var44 = var29 + var39;
                                        int var45 = var30 + var38;
                                        if (var44 > 0 && var45 > 0 && var44 < 103 && var45 < 103) {
                                            int var46 = var40;
                                            if ((class56.field481[1][var44][var45] & 0x2) == 2) {
                                                var46 = var40 - 1;
                                            }
                                            class178 var47 = null;
                                            if (var46 >= 0) {
                                                var47 = var32[var46];
                                            }
                                            class56.method4052(var40, var44, var45, var34, var43, var42, var31, var47);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field681) {
                        int var48 = 0;
                        label1002: while (true) {
                            if (var48 >= 4) {
                                for (int var66 = 0; var66 < 13; var66++) {
                                    for (int var67 = 0; var67 < 13; var67++) {
                                        int var68 = field635[0][var66][var67];
                                        if (var68 == -1) {
                                            class56.method3108(var66 * 8, var67 * 8, 8, 8);
                                        }
                                    }
                                }
                                method3070(true);
                                int var69 = 0;
                                while (true) {
                                    if (var69 >= 4) {
                                        break label1002;
                                    }
                                    method146();
                                    for (int var70 = 0; var70 < 13; var70++) {
                                        for (int var71 = 0; var71 < 13; var71++) {
                                            int var72 = field635[var69][var70][var71];
                                            if (var72 != -1) {
                                                int var73 = var72 >> 24 & 0x3;
                                                int var74 = var72 >> 1 & 0x3;
                                                int var75 = var72 >> 14 & 0x3FF;
                                                int var76 = var72 >> 3 & 0x7FF;
                                                int var77 = (var75 / 8 << 8) + var76 / 8;
                                                for (int var78 = 0; var78 < Statics.field3801.length; var78++) {
                                                    if (Statics.field3801[var78] == var77 && Statics.field982[var78] != null) {
                                                        class56.method3311(Statics.field982[var78], var69, var70 * 8, var71 * 8, var73, (var75 & 0x7) * 8, (var76 & 0x7) * 8, var74, Statics.field582, field854);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var69++;
                                }
                            }
                            method146();
                            for (int var49 = 0; var49 < 13; var49++) {
                                for (int var50 = 0; var50 < 13; var50++) {
                                    boolean var51 = false;
                                    int var52 = field635[var48][var49][var50];
                                    if (var52 != -1) {
                                        int var53 = var52 >> 24 & 0x3;
                                        int var54 = var52 >> 1 & 0x3;
                                        int var55 = var52 >> 14 & 0x3FF;
                                        int var56 = var52 >> 3 & 0x7FF;
                                        int var57 = (var55 / 8 << 8) + var56 / 8;
                                        for (int var58 = 0; var58 < Statics.field3801.length; var58++) {
                                            if (Statics.field3801[var58] == var57 && Statics.field328[var58] != null) {
                                                class56.method3662(Statics.field328[var58], var48, var49 * 8, var50 * 8, var53, (var55 & 0x7) * 8, (var56 & 0x7) * 8, var54, field854);
                                                var51 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var51) {
                                        int var59 = var48;
                                        int var60 = var49 * 8;
                                        int var61 = var50 * 8;
                                        for (int var62 = 0; var62 < 8; var62++) {
                                            for (int var63 = 0; var63 < 8; var63++) {
                                                class56.field494[var59][var60 + var62][var61 + var63] = 0;
                                            }
                                        }
                                        if (var60 > 0) {
                                            for (int var64 = 1; var64 < 8; var64++) {
                                                class56.field494[var59][var60][var61 + var64] = class56.field494[var59][var60 - 1][var61 + var64];
                                            }
                                        }
                                        if (var61 > 0) {
                                            for (int var65 = 1; var65 < 8; var65++) {
                                                class56.field494[var59][var60 + var65][var61] = class56.field494[var59][var60 + var65][var61 - 1];
                                            }
                                        }
                                        if (var60 > 0 && class56.field494[var59][var60 - 1][var61] != 0) {
                                            class56.field494[var59][var60][var61] = class56.field494[var59][var60 - 1][var61];
                                        } else if (var61 > 0 && class56.field494[var59][var60][var61 - 1] != 0) {
                                            class56.field494[var59][var60][var61] = class56.field494[var59][var60][var61 - 1];
                                        } else if (var60 > 0 && var61 > 0 && class56.field494[var59][var60 - 1][var61 - 1] != 0) {
                                            class56.field494[var59][var60][var61] = class56.field494[var59][var60 - 1][var61 - 1];
                                        }
                                    }
                                }
                            }
                            var48++;
                        }
                    }
                    method3070(true);
                    method146();
                    class134 var79 = Statics.field582;
                    class178[] var80 = field854;
                    for (int var81 = 0; var81 < 4; var81++) {
                        for (int var82 = 0; var82 < 104; var82++) {
                            for (int var83 = 0; var83 < 104; var83++) {
                                if ((class56.field481[var81][var82][var83] & 0x1) == 1) {
                                    int var84 = var81;
                                    if ((class56.field481[1][var82][var83] & 0x2) == 2) {
                                        var84 = var81 - 1;
                                    }
                                    if (var84 >= 0) {
                                        var80[var84].method3260(var82, var83);
                                    }
                                }
                            }
                        }
                    }
                    class56.field484 += (int) (Math.random() * 5.0D) - 2;
                    if (class56.field484 < -8) {
                        class56.field484 = -8;
                    }
                    if (class56.field484 > 8) {
                        class56.field484 = 8;
                    }
                    class56.field493 += (int) (Math.random() * 5.0D) - 2;
                    if (class56.field493 < -16) {
                        class56.field493 = -16;
                    }
                    if (class56.field493 > 16) {
                        class56.field493 = 16;
                    }
                    for (int var85 = 0; var85 < 4; var85++) {
                        byte[][] var86 = Statics.field495[var85];
                        int var87 = (int) Math.sqrt(5100.0D);
                        int var88 = var87 * 768 >> 8;
                        for (int var89 = 1; var89 < 103; var89++) {
                            for (int var90 = 1; var90 < 103; var90++) {
                                int var91 = class56.field494[var85][var90 + 1][var89] - class56.field494[var85][var90 - 1][var89];
                                int var92 = class56.field494[var85][var90][var89 + 1] - class56.field494[var85][var90][var89 - 1];
                                int var93 = (int) Math.sqrt((double) (var92 * var92 + var91 * var91 + 65536));
                                int var94 = (var91 << 8) / var93;
                                int var95 = 65536 / var93;
                                int var96 = (var92 << 8) / var93;
                                int var97 = (var96 * -50 + var94 * -50 + var95 * -10) / var88 + 96;
                                int var98 = (var86[var90][var89] >> 1) + (var86[var90][var89 + 1] >> 3) + (var86[var90][var89 - 1] >> 2) + (var86[var90 - 1][var89] >> 2) + (var86[var90 + 1][var89] >> 3);
                                Statics.field2374[var90][var89] = var97 - var98;
                            }
                        }
                        for (int var99 = 0; var99 < 104; var99++) {
                            Statics.field73[var99] = 0;
                            Statics.field1121[var99] = 0;
                            Statics.field2510[var99] = 0;
                            Statics.field139[var99] = 0;
                            Statics.field579[var99] = 0;
                        }
                        for (int var100 = -5; var100 < 109; var100++) {
                            for (int var101 = 0; var101 < 104; var101++) {
                                int var102 = var100 + 5;
                                int var10002;
                                if (var102 >= 0 && var102 < 104) {
                                    int var103 = Statics.field483[var85][var102][var101] & 0xFF;
                                    if (var103 > 0) {
                                        class256 var104 = class256.method4148(var103 - 1);
                                        Statics.field73[var101] += var104.field3330;
                                        Statics.field1121[var101] += var104.field3334;
                                        Statics.field2510[var101] += var104.field3335;
                                        Statics.field139[var101] += var104.field3336;
                                        var10002 = Statics.field579[var101]++;
                                    }
                                }
                                int var105 = var100 - 5;
                                if (var105 >= 0 && var105 < 104) {
                                    int var106 = Statics.field483[var85][var105][var101] & 0xFF;
                                    if (var106 > 0) {
                                        class256 var107 = class256.method4148(var106 - 1);
                                        Statics.field73[var101] -= var107.field3330;
                                        Statics.field1121[var101] -= var107.field3334;
                                        Statics.field2510[var101] -= var107.field3335;
                                        Statics.field139[var101] -= var107.field3336;
                                        var10002 = Statics.field579[var101]--;
                                    }
                                }
                            }
                            if (var100 >= 1 && var100 < 103) {
                                int var108 = 0;
                                int var109 = 0;
                                int var110 = 0;
                                int var111 = 0;
                                int var112 = 0;
                                for (int var113 = -5; var113 < 109; var113++) {
                                    int var114 = var113 + 5;
                                    if (var114 >= 0 && var114 < 104) {
                                        var108 += Statics.field73[var114];
                                        var109 += Statics.field1121[var114];
                                        var110 += Statics.field2510[var114];
                                        var111 += Statics.field139[var114];
                                        var112 += Statics.field579[var114];
                                    }
                                    int var115 = var113 - 5;
                                    if (var115 >= 0 && var115 < 104) {
                                        var108 -= Statics.field73[var115];
                                        var109 -= Statics.field1121[var115];
                                        var110 -= Statics.field2510[var115];
                                        var111 -= Statics.field139[var115];
                                        var112 -= Statics.field579[var115];
                                    }
                                    if (var113 >= 1 && var113 < 103 && (!field626 || (class56.field481[0][var100][var113] & 0x2) != 0 || (class56.field481[var85][var100][var113] & 0x10) == 0)) {
                                        if (var85 < class56.field480) {
                                            class56.field480 = var85;
                                        }
                                        int var116 = Statics.field483[var85][var100][var113] & 0xFF;
                                        int var117 = Statics.field3745[var85][var100][var113] & 0xFF;
                                        if (var116 > 0 || var117 > 0) {
                                            int var118 = class56.field494[var85][var100][var113];
                                            int var119 = class56.field494[var85][var100 + 1][var113];
                                            int var120 = class56.field494[var85][var100 + 1][var113 + 1];
                                            int var121 = class56.field494[var85][var100][var113 + 1];
                                            int var122 = Statics.field2374[var100][var113];
                                            int var123 = Statics.field2374[var100 + 1][var113];
                                            int var124 = Statics.field2374[var100 + 1][var113 + 1];
                                            int var125 = Statics.field2374[var100][var113 + 1];
                                            int var126 = -1;
                                            int var127 = -1;
                                            if (var116 > 0) {
                                                int var128 = var108 * 256 / var111;
                                                int var129 = var109 / var112;
                                                int var130 = var110 / var112;
                                                var126 = class56.method599(var128, var129, var130);
                                                int var131 = class56.field484 + var128 & 0xFF;
                                                int var132 = class56.field493 + var130;
                                                if (var132 < 0) {
                                                    var132 = 0;
                                                } else if (var132 > 255) {
                                                    var132 = 255;
                                                }
                                                var127 = class56.method599(var131, var129, var132);
                                            }
                                            if (var85 > 0) {
                                                boolean var133 = true;
                                                if (var116 == 0 && Statics.field261[var85][var100][var113] != 0) {
                                                    var133 = false;
                                                }
                                                if (var117 > 0) {
                                                    int var134 = var117 - 1;
                                                    class269 var135 = (class269) class269.field3572.method3011((long) var134);
                                                    class269 var136;
                                                    if (var135 == null) {
                                                        byte[] var137 = Statics.field3578.method4156(4, var134);
                                                        class269 var138 = new class269();
                                                        if (var137 != null) {
                                                            var138.method4750(new class202(var137), var134);
                                                        }
                                                        var138.method4754();
                                                        class269.field3572.method3009(var138, (long) var134);
                                                        var136 = var138;
                                                    } else {
                                                        var136 = var135;
                                                    }
                                                    if (!var136.field3574) {
                                                        var133 = false;
                                                    }
                                                }
                                                if (var133 && var118 == var119 && var118 == var120 && var118 == var121) {
                                                    Statics.field485[var85][var100][var113] |= 0x924;
                                                }
                                            }
                                            int var139 = 0;
                                            if (var127 != -1) {
                                                var139 = class131.field1755[class56.method166(var127, 96)];
                                            }
                                            if (var117 == 0) {
                                                var79.method2818(var85, var100, var113, 0, 0, -1, var118, var119, var120, var121, class56.method166(var126, var122), class56.method166(var126, var123), class56.method166(var126, var124), class56.method166(var126, var125), 0, 0, 0, 0, var139, 0);
                                            } else {
                                                int var140 = Statics.field261[var85][var100][var113] + 1;
                                                byte var141 = Statics.field3791[var85][var100][var113];
                                                int var142 = var117 - 1;
                                                class269 var143 = (class269) class269.field3572.method3011((long) var142);
                                                class269 var144;
                                                if (var143 == null) {
                                                    byte[] var145 = Statics.field3578.method4156(4, var142);
                                                    class269 var146 = new class269();
                                                    if (var145 != null) {
                                                        var146.method4750(new class202(var145), var142);
                                                    }
                                                    var146.method4754();
                                                    class269.field3572.method3009(var146, (long) var142);
                                                    var144 = var146;
                                                } else {
                                                    var144 = var143;
                                                }
                                                int var148 = var144.field3570;
                                                int var149;
                                                int var150;
                                                if (var148 >= 0) {
                                                    var149 = Statics.field1759.method2500(var148);
                                                    var150 = -1;
                                                } else if (var144.field3576 == 16711935) {
                                                    var150 = -2;
                                                    var148 = -1;
                                                    var149 = -2;
                                                } else {
                                                    var150 = class56.method599(var144.field3577, var144.field3571, var144.field3573);
                                                    int var151 = class56.field484 + var144.field3577 & 0xFF;
                                                    int var152 = class56.field493 + var144.field3573;
                                                    if (var152 < 0) {
                                                        var152 = 0;
                                                    } else if (var152 > 255) {
                                                        var152 = 255;
                                                    }
                                                    var149 = class56.method599(var151, var144.field3571, var152);
                                                }
                                                int var153 = 0;
                                                if (var149 != -2) {
                                                    var153 = class131.field1755[class56.method291(var149, 96)];
                                                }
                                                if (var144.field3575 != -1) {
                                                    int var154 = class56.field484 + var144.field3579 & 0xFF;
                                                    int var155 = class56.field493 + var144.field3581;
                                                    if (var155 < 0) {
                                                        var155 = 0;
                                                    } else if (var155 > 255) {
                                                        var155 = 255;
                                                    }
                                                    int var156 = class56.method599(var154, var144.field3580, var155);
                                                    var153 = class131.field1755[class56.method291(var156, 96)];
                                                }
                                                var79.method2818(var85, var100, var113, var140, var141, var148, var118, var119, var120, var121, class56.method166(var126, var122), class56.method166(var126, var123), class56.method166(var126, var124), class56.method166(var126, var125), class56.method291(var150, var122), class56.method291(var150, var123), class56.method291(var150, var124), class56.method291(var150, var125), var139, var153);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var157 = 1; var157 < 103; var157++) {
                            for (int var158 = 1; var158 < 103; var158++) {
                                int var163;
                                if ((class56.field481[var85][var158][var157] & 0x8) != 0) {
                                    var163 = 0;
                                } else if (var85 <= 0 || (class56.field481[1][var158][var157] & 0x2) == 0) {
                                    var163 = var85;
                                } else {
                                    var163 = var85 - 1;
                                }
                                var79.method2817(var85, var158, var157, var163);
                            }
                        }
                        Statics.field483[var85] = (byte[][]) null;
                        Statics.field3745[var85] = (byte[][]) null;
                        Statics.field261[var85] = (byte[][]) null;
                        Statics.field3791[var85] = (byte[][]) null;
                        Statics.field495[var85] = (byte[][]) null;
                    }
                    var79.method2844(-50, -10, -50);
                    for (int var164 = 0; var164 < 104; var164++) {
                        for (int var165 = 0; var165 < 104; var165++) {
                            if ((class56.field481[1][var164][var165] & 0x2) == 2) {
                                var79.method2972(var164, var165);
                            }
                        }
                    }
                    int var166 = 1;
                    int var167 = 2;
                    int var168 = 4;
                    for (int var169 = 0; var169 < 4; var169++) {
                        if (var169 > 0) {
                            var166 <<= 0x3;
                            var167 <<= 0x3;
                            var168 <<= 0x3;
                        }
                        for (int var170 = 0; var170 <= var169; var170++) {
                            for (int var171 = 0; var171 <= 104; var171++) {
                                for (int var172 = 0; var172 <= 104; var172++) {
                                    if ((Statics.field485[var170][var172][var171] & var166) != 0) {
                                        int var173 = var171;
                                        int var174 = var171;
                                        int var175 = var170;
                                        int var176 = var170;
                                        while (var173 > 0 && (Statics.field485[var170][var172][var173 - 1] & var166) != 0) {
                                            var173--;
                                        }
                                        while (var174 < 104 && (Statics.field485[var170][var172][var174 + 1] & var166) != 0) {
                                            var174++;
                                        }
                                        label653: while (var175 > 0) {
                                            for (int var177 = var173; var177 <= var174; var177++) {
                                                if ((Statics.field485[var175 - 1][var172][var177] & var166) == 0) {
                                                    break label653;
                                                }
                                            }
                                            var175--;
                                        }
                                        label642: while (var176 < var169) {
                                            for (int var178 = var173; var178 <= var174; var178++) {
                                                if ((Statics.field485[var176 + 1][var172][var178] & var166) == 0) {
                                                    break label642;
                                                }
                                            }
                                            var176++;
                                        }
                                        int var179 = (var176 + 1 - var175) * (var174 - var173 + 1);
                                        if (var179 >= 8) {
                                            short var180 = 240;
                                            int var181 = class56.field494[var176][var172][var173] - var180;
                                            int var182 = class56.field494[var175][var172][var173];
                                            class134.method2816(var169, 1, var172 * 128, var172 * 128, var173 * 128, var174 * 128 + 128, var181, var182);
                                            for (int var183 = var175; var183 <= var176; var183++) {
                                                for (int var184 = var173; var184 <= var174; var184++) {
                                                    Statics.field485[var183][var172][var184] &= ~var166;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field485[var170][var172][var171] & var167) != 0) {
                                        int var185 = var172;
                                        int var186 = var172;
                                        int var187 = var170;
                                        int var188 = var170;
                                        while (var185 > 0 && (Statics.field485[var170][var185 - 1][var171] & var167) != 0) {
                                            var185--;
                                        }
                                        while (var186 < 104 && (Statics.field485[var170][var186 + 1][var171] & var167) != 0) {
                                            var186++;
                                        }
                                        label706: while (var187 > 0) {
                                            for (int var189 = var185; var189 <= var186; var189++) {
                                                if ((Statics.field485[var187 - 1][var189][var171] & var167) == 0) {
                                                    break label706;
                                                }
                                            }
                                            var187--;
                                        }
                                        label695: while (var188 < var169) {
                                            for (int var190 = var185; var190 <= var186; var190++) {
                                                if ((Statics.field485[var188 + 1][var190][var171] & var167) == 0) {
                                                    break label695;
                                                }
                                            }
                                            var188++;
                                        }
                                        int var191 = (var188 + 1 - var187) * (var186 - var185 + 1);
                                        if (var191 >= 8) {
                                            short var192 = 240;
                                            int var193 = class56.field494[var188][var185][var171] - var192;
                                            int var194 = class56.field494[var187][var185][var171];
                                            class134.method2816(var169, 2, var185 * 128, var186 * 128 + 128, var171 * 128, var171 * 128, var193, var194);
                                            for (int var195 = var187; var195 <= var188; var195++) {
                                                for (int var196 = var185; var196 <= var186; var196++) {
                                                    Statics.field485[var195][var196][var171] &= ~var167;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field485[var170][var172][var171] & var168) != 0) {
                                        int var197 = var172;
                                        int var198 = var172;
                                        int var199 = var171;
                                        int var200 = var171;
                                        while (var199 > 0 && (Statics.field485[var170][var172][var199 - 1] & var168) != 0) {
                                            var199--;
                                        }
                                        while (var200 < 104 && (Statics.field485[var170][var172][var200 + 1] & var168) != 0) {
                                            var200++;
                                        }
                                        label759: while (var197 > 0) {
                                            for (int var201 = var199; var201 <= var200; var201++) {
                                                if ((Statics.field485[var170][var197 - 1][var201] & var168) == 0) {
                                                    break label759;
                                                }
                                            }
                                            var197--;
                                        }
                                        label748: while (var198 < 104) {
                                            for (int var202 = var199; var202 <= var200; var202++) {
                                                if ((Statics.field485[var170][var198 + 1][var202] & var168) == 0) {
                                                    break label748;
                                                }
                                            }
                                            var198++;
                                        }
                                        if ((var198 - var197 + 1) * (var200 - var199 + 1) >= 4) {
                                            int var203 = class56.field494[var170][var197][var199];
                                            class134.method2816(var169, 4, var197 * 128, var198 * 128 + 128, var199 * 128, var200 * 128 + 128, var203, var203);
                                            for (int var204 = var197; var204 <= var198; var204++) {
                                                for (int var205 = var199; var205 <= var200; var205++) {
                                                    Statics.field485[var170][var204][var205] &= ~var168;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method3070(true);
                    int var206 = class56.field480;
                    if (var206 > Statics.field1394) {
                        var206 = Statics.field1394;
                    }
                    if (var206 < Statics.field1394 - 1) {
                        int var207 = Statics.field1394 - 1;
                    }
                    if (field626) {
                        Statics.field582.method2814(class56.field480);
                    } else {
                        Statics.field582.method2814(0);
                    }
                    for (int var208 = 0; var208 < 104; var208++) {
                        for (int var209 = 0; var209 < 104; var209++) {
                            method2810(var208, var209);
                        }
                    }
                    method146();
                    method1041();
                    class265.field3425.method3010();
                    if (Statics.field1509.method905()) {
                        class192 var210 = class192.method1750(class189.field2241, field669.field1284);
                        var210.field2356.method3422(1057001181);
                        field669.method2056(var210);
                    }
                    if (!field681) {
                        int var211 = (Statics.field1910 - 6) / 8;
                        int var212 = (Statics.field1910 + 6) / 8;
                        int var213 = (Statics.field101 - 6) / 8;
                        int var214 = (Statics.field101 + 6) / 8;
                        for (int var215 = var211 - 1; var215 <= var212 + 1; var215++) {
                            for (int var216 = var213 - 1; var216 <= var214 + 1; var216++) {
                                if (var215 < var211 || var215 > var212 || var216 < var213 || var216 > var214) {
                                    Statics.field1220.method4180("m" + var215 + "_" + var216);
                                    Statics.field1220.method4180("l" + var215 + "_" + var216);
                                }
                            }
                        }
                    }
                    method906(30);
                    method146();
                    class56.method3255();
                    class192 var217 = class192.method1750(class189.field2306, field669.field1284);
                    field669.method2056(var217);
                    class53.method128();
                } else {
                    field679 = 2;
                }
            } else {
                field679 = 1;
            }
        }
        if (field630 == 30) {
            this.method1165();
        } else if (field630 == 40 || field630 == 45) {
            this.method1385();
        }
    }

    @ObfuscatedName("client.ab(ZI)V")
    public final void method846(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class215.field2503 == 2) {
                    if (Statics.field75 == null) {
                        Statics.field75 = class221.method3992(Statics.field2505, Statics.field251, Statics.field50);
                        if (Statics.field75 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field3795 == null) {
                        Statics.field3795 = new class107(Statics.field2504, Statics.field2507);
                    }
                    if (Statics.field2506.method3881(Statics.field75, Statics.field2, Statics.field3795, 22050)) {
                        Statics.field2506.method3803();
                        Statics.field2506.method3801(Statics.field233);
                        Statics.field2506.method3805(Statics.field75, Statics.field3887);
                        class215.field2503 = 0;
                        Statics.field75 = null;
                        Statics.field3795 = null;
                        Statics.field2505 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2506.method3806();
                class215.field2503 = 0;
                Statics.field75 = null;
                Statics.field3795 = null;
                Statics.field2505 = null;
            }
            var2 = false;
        }
        if (var2 && field857 && Statics.field294 != null) {
            Statics.field294.method2195();
        }
        if ((field630 == 10 || field630 == 20 || field630 == 30) && field745 != 0L && class204.method3658() > field745) {
            method1911(method4408());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field864[var5] = true;
            }
        }
        if (field630 == 0) {
            this.method810(class86.field1149, class86.field1158, arg0);
        } else if (field630 == 5) {
            class86.method1010(Statics.field12, Statics.field543, Statics.field384);
        } else if (field630 == 10 || field630 == 11) {
            class86.method1010(Statics.field12, Statics.field543, Statics.field384);
        } else if (field630 == 20) {
            class86.method1010(Statics.field12, Statics.field543, Statics.field384);
        } else if (field630 == 25) {
            if (field679 == 1) {
                if (field675 > field866) {
                    field866 = field675;
                }
                int var6 = (field866 * 50 - field675 * 50) / field866;
                method1535(class236.field2852 + class82.field1114 + class82.field1116 + var6 + "%" + class82.field1117, false);
            } else if (field679 == 2) {
                if (field789 > field678) {
                    field678 = field789;
                }
                int var7 = (field678 * 50 - field789 * 50) / field678 + 50;
                method1535(class236.field2852 + class82.field1114 + class82.field1116 + var7 + "%" + class82.field1117, false);
            } else {
                method1535(class236.field2852, false);
            }
        } else if (field630 == 30) {
            this.method1167();
        } else if (field630 == 40) {
            method1535(class236.field2853 + class82.field1114 + class236.field2854, false);
        } else if (field630 == 45) {
            method1535(class236.field3003, false);
        }
        if (field630 == 30 && field834 == 0 && !arg0 && !field765) {
            for (int var8 = 0; var8 < field825; var8++) {
                if (field828[var8]) {
                    Statics.field2396.method774(field712[var8], field849[var8], field832[var8], field833[var8]);
                    field828[var8] = false;
                }
            }
        } else if (field630 > 0) {
            Statics.field2396.method767(0, 0);
            for (int var9 = 0; var9 < field825; var9++) {
                field828[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method809() {
        if (Statics.field2390.method1950()) {
            Statics.field2390.method1956();
        }
        if (Statics.field1209 != null) {
            Statics.field1209.field568 = false;
        }
        Statics.field1209 = null;
        field669.method2058();
        if (class45.field371 != null) {
            class45 var1 = class45.field371;
            synchronized (class45.field371) {
                class45.field371 = null;
            }
        }
        if (class54.field455 != null) {
            class54 var3 = class54.field455;
            synchronized (class54.field455) {
                class54.field455 = null;
            }
        }
        Statics.field87 = null;
        if (Statics.field294 != null) {
            Statics.field294.method2196();
        }
        if (Statics.field3223 != null) {
            Statics.field3223.method2196();
        }
        if (Statics.field3261 != null) {
            Statics.field3261.method3179();
        }
        class246.method3142();
        if (Statics.field3705 != null) {
            Statics.field3705.method2990();
            Statics.field3705 = null;
        }
        try {
            class169.field2048.method2441();
            for (int var5 = 0; var5 < Statics.field2043; var5++) {
                Statics.field3195[var5].method2441();
            }
            class169.field2049.method2441();
            class169.field2047.method2441();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("ba.ec(IB)V")
    public static void method906(int arg0) {
        if (field630 == arg0) {
            return;
        }
        if (field630 == 0) {
            Statics.field1509.method842();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field655 = 0;
            field656 = 0;
            field657 = 0;
            field673.method4948(arg0);
            if (arg0 != 20) {
                method167(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3667 != null) {
            Statics.field3667.method3179();
            Statics.field3667 = null;
        }
        if (field630 == 25) {
            field679 = 0;
            field675 = 0;
            field866 = 1;
            field789 = 0;
            field678 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class86.method17(Statics.field85, Statics.field194, true, 0);
        } else if (arg0 == 20) {
            class86.method17(Statics.field85, Statics.field194, true, field630 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class86.method17(Statics.field85, Statics.field194, false, 4);
        } else {
            class86.method1840();
        }
        field630 = arg0;
    }

    @ObfuscatedName("client.ef(B)V")
    public void method1162() {
        if (field630 == 1000) {
            return;
        }
        long var1 = class204.method3658();
        int var3 = (int) (var1 - Statics.field3244);
        Statics.field3244 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class248.field3252 += var3;
        boolean var4;
        if (class248.field3243 == 0 && class248.field3248 == 0 && class248.field3251 == 0 && class248.field3242 == 0) {
            var4 = true;
        } else if (Statics.field3261 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class248.field3252 > 30000) {
                        throw new IOException();
                    }
                    while (class248.field3248 < 200 && class248.field3242 > 0) {
                        class244 var5 = (class244) class248.field3245.method5411();
                        class202 var6 = new class202(4);
                        var6.method3565(1);
                        var6.method3419((int) var5.field2139);
                        Statics.field3261.method3178(var6.field2440, 0, 4);
                        class248.field3247.method5412(var5, var5.field2139);
                        class248.field3242--;
                        class248.field3248++;
                    }
                    while (class248.field3243 < 200 && class248.field3251 > 0) {
                        class244 var7 = (class244) class248.field3249.method4802();
                        class202 var8 = new class202(4);
                        var8.method3565(0);
                        var8.method3419((int) var7.field2139);
                        Statics.field3261.method3178(var8.field2440, 0, 4);
                        var7.method3294();
                        class248.field3259.method5412(var7, var7.field2139);
                        class248.field3251--;
                        class248.field3243++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3261.method3173();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class248.field3252 = 0;
                        byte var11 = 0;
                        if (Statics.field1847 == null) {
                            var11 = 8;
                        } else if (class248.field3255 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class248.field3254.field2439;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3261.method3180(class248.field3254.field2440, class248.field3254.field2439, var12);
                            if (class248.field3257 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class248.field3254.field2440[class248.field3254.field2439 + var13] ^= class248.field3257;
                                }
                            }
                            class248.field3254.field2439 += var12;
                            if (class248.field3254.field2439 < var11) {
                                break;
                            }
                            if (Statics.field1847 == null) {
                                class248.field3254.field2439 = 0;
                                int var14 = class248.field3254.method3551();
                                int var15 = class248.field3254.method3530();
                                int var16 = class248.field3254.method3551();
                                int var17 = class248.field3254.method3620();
                                long var18 = (long) ((var14 << 16) + var15);
                                class244 var20 = (class244) class248.field3247.method5416(var18);
                                Statics.field28 = true;
                                if (var20 == null) {
                                    var20 = (class244) class248.field3259.method5416(var18);
                                    Statics.field28 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1847 = var20;
                                Statics.field172 = new class202(var17 + var21 + Statics.field1847.field3202);
                                Statics.field172.method3565(var16);
                                Statics.field172.method3422(var17);
                                class248.field3255 = 8;
                                class248.field3254.field2439 = 0;
                            } else if (class248.field3255 == 0) {
                                if (class248.field3254.field2440[0] == -1) {
                                    class248.field3255 = 1;
                                    class248.field3254.field2439 = 0;
                                } else {
                                    Statics.field1847 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field172.field2440.length - Statics.field1847.field3202;
                            int var23 = 512 - class248.field3255;
                            if (var23 > var22 - Statics.field172.field2439) {
                                var23 = var22 - Statics.field172.field2439;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3261.method3180(Statics.field172.field2440, Statics.field172.field2439, var23);
                            if (class248.field3257 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field172.field2440[Statics.field172.field2439 + var24] ^= class248.field3257;
                                }
                            }
                            Statics.field172.field2439 += var23;
                            class248.field3255 += var23;
                            if (Statics.field172.field2439 == var22) {
                                if (Statics.field1847.field2139 == 16711935L) {
                                    Statics.field1240 = Statics.field172;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class247 var26 = class248.field3253[var25];
                                        if (var26 != null) {
                                            Statics.field1240.field2439 = var25 * 8 + 5;
                                            int var27 = Statics.field1240.method3620();
                                            int var28 = Statics.field1240.method3620();
                                            var26.method4274(var27, var28);
                                        }
                                    }
                                } else {
                                    class248.field3258.reset();
                                    class248.field3258.update(Statics.field172.field2440, 0, var22);
                                    int var29 = (int) class248.field3258.getValue();
                                    if (Statics.field1847.field3200 != var29) {
                                        try {
                                            Statics.field3261.method3179();
                                        } catch (Exception var35) {
                                        }
                                        class248.field3260++;
                                        Statics.field3261 = null;
                                        class248.field3257 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class248.field3260 = 0;
                                    class248.field3256 = 0;
                                    Statics.field1847.field3201.method4267((int) (Statics.field1847.field2139 & 0xFFFFL), Statics.field172.field2440, (Statics.field1847.field2139 & 0xFF0000L) == 16711680L, Statics.field28);
                                }
                                Statics.field1847.method3306();
                                if (Statics.field28) {
                                    class248.field3248--;
                                } else {
                                    class248.field3243--;
                                }
                                class248.field3255 = 0;
                                Statics.field1847 = null;
                                Statics.field172 = null;
                            } else {
                                if (class248.field3255 != 512) {
                                    break;
                                }
                                class248.field3255 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3261.method3179();
                } catch (Exception var34) {
                }
                class248.field3256++;
                Statics.field3261 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1373();
        }
    }

    @ObfuscatedName("client.ev(B)V")
    public void method1373() {
        if (class248.field3260 >= 4) {
            this.method812("js5crc");
            field630 = 1000;
            return;
        }
        if (class248.field3256 >= 4) {
            if (field630 <= 5) {
                this.method812("js5io");
                field630 = 1000;
                return;
            }
            field653 = 3000;
            class248.field3256 = 3;
        }
        if (--field653 + 1 > 0) {
            return;
        }
        try {
            if (field652 == 0) {
                Statics.field2481 = Statics.field419.method3146(Statics.field413, Statics.field2451);
                field652++;
            }
            if (field652 == 1) {
                if (Statics.field2481.field2026 == 2) {
                    this.method1177(-1);
                    return;
                }
                if (Statics.field2481.field2026 == 1) {
                    field652++;
                }
            }
            if (field652 == 2) {
                if (field672) {
                    Statics.field1277 = class171.method2468((Socket) Statics.field2481.field2030, 40000, 5000);
                } else {
                    Statics.field1277 = new class175((Socket) Statics.field2481.field2030, Statics.field419, 5000);
                }
                class202 var1 = new class202(5);
                var1.method3565(15);
                var1.method3422(180);
                Statics.field1277.method3178(var1.field2440, 0, 5);
                field652++;
                Statics.field1917 = class204.method3658();
            }
            if (field652 == 3) {
                if (Statics.field1277.method3173() > 0 || !field672 && field630 <= 5) {
                    int var2 = Statics.field1277.method3177();
                    if (var2 != 0) {
                        this.method1177(var2);
                        return;
                    }
                    field652++;
                } else if (class204.method3658() - Statics.field1917 > 30000L) {
                    this.method1177(-2);
                    return;
                }
            }
            if (field652 == 4) {
                class171 var3 = Statics.field1277;
                boolean var4 = field630 > 20;
                if (Statics.field3261 != null) {
                    try {
                        Statics.field3261.method3179();
                    } catch (Exception var14) {
                    }
                    Statics.field3261 = null;
                }
                Statics.field3261 = var3;
                class248.method3061(var4);
                class248.field3254.field2439 = 0;
                Statics.field1847 = null;
                Statics.field172 = null;
                class248.field3255 = 0;
                while (true) {
                    class244 var6 = (class244) class248.field3247.method5411();
                    if (var6 == null) {
                        while (true) {
                            class244 var7 = (class244) class248.field3259.method5411();
                            if (var7 == null) {
                                if (class248.field3257 != 0) {
                                    try {
                                        class202 var8 = new class202(4);
                                        var8.method3565(4);
                                        var8.method3565(class248.field3257);
                                        var8.method3402(0);
                                        Statics.field3261.method3178(var8.field2440, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3261.method3179();
                                        } catch (Exception var12) {
                                        }
                                        class248.field3256++;
                                        Statics.field3261 = null;
                                    }
                                }
                                class248.field3252 = 0;
                                Statics.field3244 = class204.method3658();
                                Statics.field2481 = null;
                                Statics.field1277 = null;
                                field652 = 0;
                                field654 = 0;
                                return;
                            }
                            class248.field3249.method4810(var7);
                            class248.field3250.method5412(var7, var7.field2139);
                            class248.field3251++;
                            class248.field3243--;
                        }
                    }
                    class248.field3245.method5412(var6, var6.field2139);
                    class248.field3242++;
                    class248.field3248--;
                }
            }
        } catch (IOException var15) {
            this.method1177(-3);
        }
    }

    @ObfuscatedName("client.ea(IS)V")
    public void method1177(int arg0) {
        Statics.field2481 = null;
        Statics.field1277 = null;
        field652 = 0;
        if (Statics.field2451 == Statics.field13) {
            Statics.field2451 = Statics.field216;
        } else {
            Statics.field2451 = Statics.field13;
        }
        field654++;
        if (field654 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field630 <= 5) {
                this.method812("js5connect_full");
                field630 = 1000;
            } else {
                field653 = 3000;
            }
        } else if (field654 >= 2 && arg0 == 6) {
            this.method812("js5connect_outofdate");
            field630 = 1000;
        } else if (field654 >= 4) {
            if (field630 <= 5) {
                this.method812("js5connect");
                field630 = 1000;
            } else {
                field653 = 3000;
            }
        }
    }

    @ObfuscatedName("ak.es(Lit;Ljava/lang/String;I)V")
    public static void method536(class247 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field855.add(var2);
        field894 += var2.field508;
    }

    @ObfuscatedName("ir.eg(I)Z")
    public static boolean method4182() {
        if (field855 == null || field641 >= field855.size()) {
            return true;
        }
        while (field641 < field855.size()) {
            class59 var0 = (class59) field855.get(field641);
            if (!var0.method1011()) {
                return false;
            }
            field641++;
        }
        return true;
    }

    @ObfuscatedName("x.ez(B)I")
    public static int method84() {
        if (field855 == null || field641 >= field855.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field641; var1++) {
            var0 += ((class59) field855.get(var1)).field512;
        }
        return var0 * 10000 / field894;
    }

    @ObfuscatedName("by.ep(IIB)V")
    public static void method1045(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class131.field1757[var4];
            int var8 = method1038(var5, arg1);
            var2[var3] = var7 * var8 >> 16;
        }
        class134.method2848(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("fo.fq(B)V")
    public static void method3205() {
        if (field651 == 0) {
            Statics.field582 = new class134(4, 104, 104, class56.field494);
            for (int var0 = 0; var0 < 4; var0++) {
                field854[var0] = new class178(104, 104);
            }
            Statics.field538 = new class328(512, 512);
            class86.field1158 = class236.field2957;
            class86.field1149 = 5;
            field651 = 20;
        } else if (field651 == 20) {
            class86.field1158 = class236.field2856;
            class86.field1149 = 10;
            field651 = 30;
        } else if (field651 == 30) {
            Statics.field3225 = method275(0, false, true, true);
            Statics.field1778 = method275(1, false, true, true);
            Statics.field1056 = method275(2, true, false, true);
            Statics.field111 = method275(3, false, true, true);
            Statics.field204 = method275(4, false, true, true);
            Statics.field1220 = method275(5, true, true, true);
            Statics.field1968 = method275(6, true, true, true);
            Statics.field326 = method275(7, false, true, true);
            Statics.field194 = method275(8, false, true, true);
            Statics.field3160 = method275(9, false, true, true);
            Statics.field85 = method275(10, false, true, true);
            Statics.field1156 = method275(11, false, true, true);
            Statics.field1120 = method275(12, false, true, true);
            Statics.field2449 = method275(13, true, false, true);
            Statics.field10 = method275(14, false, true, true);
            Statics.field347 = method275(15, false, true, true);
            Statics.field171 = method275(17, true, true, true);
            Statics.field95 = method275(18, false, true, true);
            Statics.field519 = method275(19, false, true, true);
            Statics.field2465 = method275(20, false, true, true);
            class86.field1158 = class236.field2857;
            class86.field1149 = 20;
            field651 = 40;
        } else if (field651 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field3225.method4275() * 4 / 100;
            int var3 = var2 + Statics.field1778.method4275() * 4 / 100;
            int var4 = var3 + Statics.field1056.method4275() * 2 / 100;
            int var5 = var4 + Statics.field111.method4275() * 2 / 100;
            int var6 = var5 + Statics.field204.method4275() * 6 / 100;
            int var7 = var6 + Statics.field1220.method4275() * 4 / 100;
            int var8 = var7 + Statics.field1968.method4275() * 2 / 100;
            int var9 = var8 + Statics.field326.method4275() * 56 / 100;
            int var10 = var9 + Statics.field194.method4275() * 2 / 100;
            int var11 = var10 + Statics.field3160.method4275() * 2 / 100;
            int var12 = var11 + Statics.field85.method4275() * 2 / 100;
            int var13 = var12 + Statics.field1156.method4275() * 2 / 100;
            int var14 = var13 + Statics.field1120.method4275() * 2 / 100;
            int var15 = var14 + Statics.field2449.method4275() * 2 / 100;
            int var16 = var15 + Statics.field10.method4275() * 2 / 100;
            int var17 = var16 + Statics.field347.method4275() * 2 / 100;
            int var18 = var17 + Statics.field519.method4275() / 100;
            int var19 = var18 + Statics.field95.method4275() / 100;
            int var20 = var19 + Statics.field2465.method4275() / 100;
            int var21 = var20 + (Statics.field171.method4265() && Statics.field171.method4161() ? 1 : 0);
            if (var21 == 100) {
                method536(Statics.field3225, "Animations");
                method536(Statics.field1778, "Skeletons");
                method536(Statics.field204, "Sound FX");
                method536(Statics.field1220, "Maps");
                method536(Statics.field1968, "Music Tracks");
                method536(Statics.field326, "Models");
                method536(Statics.field194, "Sprites");
                method536(Statics.field1156, "Music Jingles");
                method536(Statics.field10, "Music Samples");
                method536(Statics.field347, "Music Patches");
                method536(Statics.field519, "World Map");
                method536(Statics.field95, "World Map Geography");
                method536(Statics.field2465, "World Map Ground");
                Statics.field2488 = new class313();
                Statics.field2488.method5360(Statics.field171);
                class86.field1158 = class236.field2859;
                class86.field1149 = 30;
                field651 = 45;
            } else {
                if (var21 != 0) {
                    class86.field1158 = class236.field2858 + var21 + "%";
                }
                class86.field1149 = 30;
            }
        } else if (field651 == 45) {
            class104.method959(22050, !field626, 2);
            class216 var22 = new class216();
            var22.method3808(9, 128);
            Statics.field294 = class104.method1932(Statics.field419, 0, 22050);
            Statics.field294.method2193(var22);
            class215.method3214(Statics.field347, Statics.field10, Statics.field204, var22);
            Statics.field3223 = class104.method1932(Statics.field419, 1, 2048);
            Statics.field2033 = new class97();
            Statics.field3223.method2193(Statics.field2033);
            Statics.field1998 = new class111(22050, Statics.field3803);
            class86.field1158 = class236.field2860;
            class86.field1149 = 35;
            field651 = 50;
            Statics.field3307 = new class300(Statics.field194, Statics.field2449);
        } else if (field651 == 50) {
            class299[] var23 = new class299[] { class299.field3738, class299.field3734, class299.field3736, class299.field3735, class299.field3737, class299.field3739 };
            int var24 = var23.length;
            class300 var25 = Statics.field3307;
            class299[] var26 = new class299[] { class299.field3738, class299.field3734, class299.field3736, class299.field3735, class299.field3737, class299.field3739 };
            field674 = var25.method5184(var26);
            if (field674.size() < var24) {
                class86.field1158 = class236.field2861 + field674.size() * 100 / var24 + "%";
                class86.field1149 = 40;
            } else {
                Statics.field543 = (class302) field674.get(class299.field3737);
                Statics.field384 = (class302) field674.get(class299.field3736);
                Statics.field12 = (class302) field674.get(class299.field3734);
                Statics.field102 = field888.method5707();
                class86.field1158 = class236.field2862;
                class86.field1149 = 40;
                field651 = 60;
            }
        } else if (field651 == 60) {
            int var27 = class86.method2602(Statics.field85, Statics.field194);
            int var28 = class86.method25();
            if (var27 < var28) {
                class86.field1158 = class236.field3064 + var27 * 100 / var28 + "%";
                class86.field1149 = 50;
            } else {
                class86.field1158 = class236.field2997;
                class86.field1149 = 50;
                method906(5);
                field651 = 70;
            }
        } else if (field651 == 70) {
            if (Statics.field1056.method4161()) {
                class269.method1976(Statics.field1056);
                class256.method3999(Statics.field1056);
                class247 var29 = Statics.field1056;
                class247 var30 = Statics.field326;
                Statics.field3347 = var29;
                Statics.field3339 = var30;
                Statics.field3350 = Statics.field3347.method4168(3);
                class265.method5548(Statics.field1056, Statics.field326, field626);
                class268.method3724(Statics.field1056, Statics.field326);
                class247 var31 = Statics.field1056;
                Statics.field3385 = var31;
                class247 var32 = Statics.field1056;
                class247 var33 = Statics.field326;
                boolean var34 = field625;
                class302 var35 = Statics.field543;
                Statics.field3512 = var32;
                Statics.field3500 = var33;
                Statics.field250 = var34;
                Statics.field1136 = Statics.field3512.method4168(10);
                Statics.field2462 = var35;
                class247 var36 = Statics.field1056;
                class247 var37 = Statics.field3225;
                class247 var38 = Statics.field1778;
                Statics.field3582 = var36;
                Statics.field3583 = var37;
                Statics.field3599 = var38;
                class247 var39 = Statics.field1056;
                class247 var40 = Statics.field326;
                Statics.field3320 = var39;
                Statics.field3314 = var40;
                class260.method118(Statics.field1056);
                class247 var41 = Statics.field1056;
                Statics.field3285 = var41;
                Statics.field3283 = Statics.field3285.method4168(16);
                class247 var42 = Statics.field111;
                class247 var43 = Statics.field326;
                class247 var44 = Statics.field194;
                class247 var45 = Statics.field2449;
                Statics.field2636 = var42;
                Statics.field2004 = var43;
                Statics.field2649 = var44;
                Statics.field225 = var45;
                Statics.field2634 = new class229[Statics.field2636.method4205()][];
                Statics.field2635 = new boolean[Statics.field2636.method4205()];
                class247 var46 = Statics.field1056;
                Statics.field25 = var46;
                class247 var47 = Statics.field1056;
                Statics.field3388 = var47;
                class254.method2983(Statics.field1056);
                class247 var48 = Statics.field1056;
                Statics.field3378 = var48;
                Statics.field2390 = new class91();
                class264.method1034(Statics.field1056, Statics.field194, Statics.field2449);
                class247 var49 = Statics.field1056;
                class247 var50 = Statics.field194;
                Statics.field3366 = var49;
                Statics.field3353 = var50;
                class247 var51 = Statics.field1056;
                class247 var52 = Statics.field194;
                Statics.field3301 = var52;
                if (var51.method4161()) {
                    Statics.field1947 = var51.method4168(35);
                    Statics.field2787 = new class253[Statics.field1947];
                    for (int var53 = 0; var53 < Statics.field1947; var53++) {
                        byte[] var54 = var51.method4156(35, var53);
                        Statics.field2787[var53] = new class253(var53);
                        if (var54 != null) {
                            Statics.field2787[var53].method4360(new class202(var54));
                            Statics.field2787[var53].method4362();
                        }
                    }
                }
                class86.field1158 = class236.field2866;
                class86.field1149 = 60;
                field651 = 80;
            } else {
                class86.field1158 = class236.field2973 + Statics.field1056.method4273() + "%";
                class86.field1149 = 60;
            }
        } else if (field651 == 80) {
            int var55 = 0;
            if (Statics.field59 == null) {
                Statics.field59 = class329.method5456(Statics.field194, Statics.field2488.field3817, 0);
            } else {
                var55++;
            }
            if (Statics.field1864 == null) {
                Statics.field1864 = class329.method5456(Statics.field194, Statics.field2488.field3820, 0);
            } else {
                var55++;
            }
            if (Statics.field2366 == null) {
                class247 var56 = Statics.field194;
                int var57 = Statics.field2488.field3815;
                class327[] var58;
                if (class329.method3998(var56, var57, 0)) {
                    var58 = class329.method387();
                } else {
                    var58 = null;
                }
                Statics.field2366 = var58;
            } else {
                var55++;
            }
            if (Statics.field78 == null) {
                class247 var59 = Statics.field194;
                int var60 = Statics.field2488.field3814;
                class328[] var61;
                if (class329.method3998(var59, var60, 0)) {
                    var61 = class329.method3062();
                } else {
                    var61 = null;
                }
                Statics.field78 = var61;
            } else {
                var55++;
            }
            if (Statics.field1032 == null) {
                class247 var62 = Statics.field194;
                int var63 = Statics.field2488.field3816;
                class328[] var64;
                if (class329.method3998(var62, var63, 0)) {
                    var64 = class329.method3062();
                } else {
                    var64 = null;
                }
                Statics.field1032 = var64;
            } else {
                var55++;
            }
            if (Statics.field615 == null) {
                class247 var65 = Statics.field194;
                int var66 = Statics.field2488.field3819;
                class328[] var67;
                if (class329.method3998(var65, var66, 0)) {
                    var67 = class329.method3062();
                } else {
                    var67 = null;
                }
                Statics.field615 = var67;
            } else {
                var55++;
            }
            if (Statics.field89 == null) {
                class247 var68 = Statics.field194;
                int var69 = Statics.field2488.field3818;
                class328[] var70;
                if (class329.method3998(var68, var69, 0)) {
                    var70 = class329.method3062();
                } else {
                    var70 = null;
                }
                Statics.field89 = var70;
            } else {
                var55++;
            }
            if (Statics.field379 == null) {
                class247 var71 = Statics.field194;
                int var72 = Statics.field2488.field3821;
                class328[] var73;
                if (class329.method3998(var71, var72, 0)) {
                    var73 = class329.method3062();
                } else {
                    var73 = null;
                }
                Statics.field379 = var73;
            } else {
                var55++;
            }
            if (Statics.field323 == null) {
                class247 var74 = Statics.field194;
                int var75 = Statics.field2488.field3822;
                class328[] var76;
                if (class329.method3998(var74, var75, 0)) {
                    var76 = class329.method3062();
                } else {
                    var76 = null;
                }
                Statics.field323 = var76;
            } else {
                var55++;
            }
            if (Statics.field266 == null) {
                class247 var77 = Statics.field194;
                int var78 = Statics.field2488.field3823;
                class327[] var79;
                if (class329.method3998(var77, var78, 0)) {
                    var79 = class329.method387();
                } else {
                    var79 = null;
                }
                Statics.field266 = var79;
            } else {
                var55++;
            }
            if (Statics.field140 == null) {
                class247 var80 = Statics.field194;
                int var81 = Statics.field2488.field3824;
                class327[] var82;
                if (class329.method3998(var80, var81, 0)) {
                    var82 = class329.method387();
                } else {
                    var82 = null;
                }
                Statics.field140 = var82;
            } else {
                var55++;
            }
            if (var55 < 11) {
                class86.field1158 = class236.field2867 + var55 * 100 / 12 + "%";
                class86.field1149 = 70;
            } else {
                Statics.field3765 = Statics.field140;
                Statics.field1864.method5575();
                int var83 = (int) (Math.random() * 21.0D) - 10;
                int var84 = (int) (Math.random() * 21.0D) - 10;
                int var85 = (int) (Math.random() * 21.0D) - 10;
                int var86 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2366[0].method5551(var83 + var86, var84 + var86, var85 + var86);
                class86.field1158 = class236.field2868;
                class86.field1149 = 70;
                field651 = 90;
            }
        } else if (field651 == 90) {
            if (Statics.field3160.method4161()) {
                Statics.field1219 = new class120(Statics.field3160, Statics.field194, 20, 0.8D, field626 ? 64 : 128);
                class131.method2739(Statics.field1219);
                class131.method2740(0.8D);
                field651 = 100;
            } else {
                class86.field1158 = class236.field3005 + "0%";
                class86.field1149 = 90;
            }
        } else if (field651 == 100) {
            int var87 = Statics.field1219.method2497();
            if (var87 < 100) {
                class86.field1158 = class236.field3005 + var87 + "%";
                class86.field1149 = 90;
            } else {
                class86.field1158 = class236.field2875;
                class86.field1149 = 90;
                field651 = 110;
            }
        } else if (field651 == 110) {
            Statics.field1209 = new class64();
            Statics.field419.method3147(Statics.field1209, 10);
            class86.field1158 = class236.field3108;
            class86.field1149 = 92;
            field651 = 120;
        } else if (field651 == 120) {
            if (Statics.field85.method4178("huffman", "")) {
                class194 var88 = new class194(Statics.field85.method4163("huffman", ""));
                Statics.field3779 = var88;
                class86.field1158 = class236.field2873;
                class86.field1149 = 94;
                field651 = 130;
            } else {
                class86.field1158 = class236.field2872 + "%";
                class86.field1149 = 94;
            }
        } else if (field651 == 130) {
            if (!Statics.field111.method4161()) {
                class86.field1158 = class236.field2874 + Statics.field111.method4273() * 4 / 5 + "%";
                class86.field1149 = 96;
            } else if (!Statics.field1120.method4161()) {
                class86.field1158 = class236.field2874 + (80 + Statics.field1120.method4273() / 6) + "%";
                class86.field1149 = 96;
            } else if (Statics.field2449.method4161()) {
                class86.field1158 = class236.field3089;
                class86.field1149 = 98;
                field651 = 140;
            } else {
                class86.field1158 = class236.field2874 + (96 + Statics.field2449.method4273() / 50) + "%";
                class86.field1149 = 96;
            }
        } else if (field651 == 140) {
            class86.field1149 = 100;
            if (Statics.field519.method4177(class36.field290.field293)) {
                if (Statics.field533 == null) {
                    Statics.field533 = new class334();
                    Statics.field533.method5731(Statics.field519, Statics.field95, Statics.field2465, Statics.field12, field674, Statics.field2366);
                }
                class86.field1158 = class236.field3026;
                field651 = 150;
            } else {
                class86.field1158 = class236.field2876 + Statics.field519.method4242(class36.field290.field293) / 10 + "%";
            }
        } else if (field651 == 150) {
            method906(10);
        }
    }

    @ObfuscatedName("c.fw(IZZZB)Lit;")
    public static class247 method275(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class176 var4 = null;
        if (class169.field2048 != null) {
            var4 = new class176(arg0, class169.field2048, Statics.field3195[arg0], 1000000);
        }
        return new class247(var4, Statics.field3749, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fg(B)V")
    public final void method1385() {
        class171 var1 = field669.method2061();
        class209 var2 = field669.field1289;
        try {
            if (field655 == 0) {
                if (Statics.field113 == null && (field662.method1921() || field656 > 250)) {
                    Statics.field113 = field662.method1912();
                    field662.method1913();
                    field662 = null;
                }
                if (Statics.field113 != null) {
                    if (var1 != null) {
                        var1.method3179();
                        var1 = null;
                    }
                    Statics.field1966 = null;
                    field852 = false;
                    field656 = 0;
                    field655 = 1;
                }
            }
            if (field655 == 1) {
                if (Statics.field1966 == null) {
                    Statics.field1966 = Statics.field419.method3146(Statics.field413, Statics.field2451);
                }
                if (Statics.field1966.field2026 == 2) {
                    throw new IOException();
                }
                if (Statics.field1966.field2026 == 1) {
                    if (field672) {
                        var1 = class171.method2468((Socket) Statics.field1966.field2030, 40000, 5000);
                    } else {
                        var1 = new class175((Socket) Statics.field1966.field2030, Statics.field419, 5000);
                    }
                    field669.method2057(var1);
                    Statics.field1966 = null;
                    field655 = 2;
                }
            }
            if (field655 == 2) {
                field669.method2054();
                class192 var3;
                if (class192.field2359 == 0) {
                    var3 = new class192();
                } else {
                    var3 = class192.field2361[--class192.field2359];
                }
                var3.field2358 = null;
                var3.field2355 = 0;
                var3.field2356 = new class209(5000);
                var3.field2356.method3565(class190.field2337.field2338);
                field669.method2056(var3);
                field669.method2071();
                var2.field2439 = 0;
                field655 = 3;
            }
            if (field655 == 3) {
                if (Statics.field294 != null) {
                    Statics.field294.method2194();
                }
                if (Statics.field3223 != null) {
                    Statics.field3223.method2194();
                }
                boolean var7 = true;
                if (field672 && !var1.method3174(1)) {
                    var7 = false;
                }
                if (var7) {
                    int var8 = var1.method3177();
                    if (Statics.field294 != null) {
                        Statics.field294.method2194();
                    }
                    if (Statics.field3223 != null) {
                        Statics.field3223.method2194();
                    }
                    if (var8 != 0) {
                        method3735(var8);
                        return;
                    }
                    var2.field2439 = 0;
                    field655 = 4;
                }
            }
            if (field655 == 4) {
                if (var2.field2439 < 8) {
                    int var9 = var1.method3173();
                    if (var9 > 8 - var2.field2439) {
                        var9 = 8 - var2.field2439;
                    }
                    if (var9 > 0) {
                        var1.method3180(var2.field2440, var2.field2439, var9);
                        var2.field2439 += var9;
                    }
                }
                if (var2.field2439 == 8) {
                    var2.field2439 = 0;
                    Statics.field2502 = var2.method3423();
                    field655 = 5;
                }
            }
            if (field655 == 5) {
                field669.field1289.field2439 = 0;
                field669.method2054();
                class209 var10 = new class209(500);
                int[] var11 = new int[] { Statics.field113.nextInt(), Statics.field113.nextInt(), Statics.field113.nextInt(), Statics.field113.nextInt() };
                var10.field2439 = 0;
                var10.method3565(1);
                var10.method3422(var11[0]);
                var10.method3422(var11[1]);
                var10.method3422(var11[2]);
                var10.method3422(var11[3]);
                var10.method3558(Statics.field2502);
                if (field630 == 40) {
                    var10.method3422(Statics.field2832[0]);
                    var10.method3422(Statics.field2832[1]);
                    var10.method3422(Statics.field2832[2]);
                    var10.method3422(Statics.field2832[3]);
                } else {
                    var10.method3565(field659.method29());
                    switch(field659.field1985) {
                        case 0:
                        case 3:
                            var10.method3419(Statics.field70);
                            var10.field2439++;
                            break;
                        case 1:
                            var10.field2439 += 4;
                            break;
                        case 2:
                            var10.method3422((Integer) Statics.field3868.field1027.get(class309.method4940(class86.field1166)));
                    }
                    var10.method3565(class314.field3835.method29());
                    var10.method3591(class86.field1155);
                }
                var10.method3573(class84.field1137, class84.field1134);
                Statics.field2832 = var11;
                class192 var12;
                if (class192.field2359 == 0) {
                    var12 = new class192();
                } else {
                    var12 = class192.field2361[--class192.field2359];
                }
                var12.field2358 = null;
                var12.field2355 = 0;
                var12.field2356 = new class209(5000);
                var12.field2356.field2439 = 0;
                if (field630 == 40) {
                    var12.field2356.method3565(class190.field2334.field2338);
                } else {
                    var12.field2356.method3565(class190.field2335.field2338);
                }
                var12.field2356.method3402(0);
                int var16 = var12.field2356.field2439;
                var12.field2356.method3422(180);
                var12.field2356.method3422(1);
                var12.field2356.method3565(field685);
                var12.field2356.method3546(var10.field2440, 0, var10.field2439);
                int var17 = var12.field2356.field2439;
                var12.field2356.method3591(class86.field1166);
                var12.field2356.method3565((field765 ? 1 : 0) << 1 | (field626 ? 1 : 0));
                var12.field2356.method3402(Statics.field1402);
                var12.field2356.method3402(Statics.field2370);
                method4006(var12.field2356);
                var12.field2356.method3591(Statics.field163);
                var12.field2356.method3422(Statics.field3226);
                class202 var18 = new class202(Statics.field102.method5709());
                Statics.field102.method5708(var18);
                var12.field2356.method3546(var18.field2440, 0, var18.field2440.length);
                var12.field2356.method3565(field685);
                var12.field2356.method3422(0);
                var12.field2356.method3422(Statics.field3225.field3215);
                var12.field2356.method3422(Statics.field1778.field3215);
                var12.field2356.method3422(Statics.field1056.field3215);
                var12.field2356.method3422(Statics.field111.field3215);
                var12.field2356.method3422(Statics.field204.field3215);
                var12.field2356.method3422(Statics.field1220.field3215);
                var12.field2356.method3422(Statics.field1968.field3215);
                var12.field2356.method3422(Statics.field326.field3215);
                var12.field2356.method3422(Statics.field194.field3215);
                var12.field2356.method3422(Statics.field3160.field3215);
                var12.field2356.method3422(Statics.field85.field3215);
                var12.field2356.method3422(Statics.field1156.field3215);
                var12.field2356.method3422(Statics.field1120.field3215);
                var12.field2356.method3422(Statics.field2449.field3215);
                var12.field2356.method3422(Statics.field10.field3215);
                var12.field2356.method3422(Statics.field347.field3215);
                var12.field2356.method3422(0);
                var12.field2356.method3422(Statics.field171.field3215);
                var12.field2356.method3422(Statics.field95.field3215);
                var12.field2356.method3422(Statics.field519.field3215);
                var12.field2356.method3422(Statics.field2465.field3215);
                var12.field2356.method3438(var11, var17, var12.field2356.field2439);
                var12.field2356.method3413(var12.field2356.field2439 - var16);
                field669.method2056(var12);
                field669.method2071();
                field669.field1284 = new class210(var11);
                int[] var19 = new int[4];
                for (int var20 = 0; var20 < 4; var20++) {
                    var19[var20] = var11[var20] + 50;
                }
                var2.method3697(var19);
                field655 = 6;
            }
            if (field655 == 6 && var1.method3173() > 0) {
                int var21 = var1.method3177();
                if (var21 == 21 && field630 == 20) {
                    field655 = 9;
                } else if (var21 == 2) {
                    field655 = 11;
                } else if (var21 == 15 && field630 == 40) {
                    field669.field1297 = -1;
                    field655 = 16;
                } else if (var21 == 64) {
                    field655 = 7;
                } else if (var21 == 23 && field657 < 1) {
                    field657++;
                    field655 = 0;
                } else if (var21 == 29) {
                    field655 = 14;
                } else {
                    method3735(var21);
                    return;
                }
            }
            if (field655 == 7 && var1.method3173() > 0) {
                Statics.field342 = var1.method3177();
                field655 = 8;
            }
            if (field655 == 8 && var1.method3173() >= Statics.field342) {
                var1.method3180(var2.field2440, 0, Statics.field342);
                var2.field2439 = 0;
                field655 = 6;
            }
            if (field655 == 9 && var1.method3173() > 0) {
                field658 = (var1.method3177() + 3) * 60;
                field655 = 10;
            }
            if (field655 == 10) {
                field656 = 0;
                class86.method951(class236.field3098, class236.field2884, field658 / 60 + class236.field2885);
                if (--field658 <= 0) {
                    field655 = 0;
                }
            } else {
                if (field655 == 11 && var1.method3173() >= 1) {
                    Statics.field660 = var1.method3177();
                    field655 = 12;
                }
                if (field655 == 12 && var1.method3173() >= Statics.field660) {
                    boolean var22 = var1.method3177() == 1;
                    var1.method3180(var2.field2440, 0, 4);
                    var2.field2439 = 0;
                    boolean var23 = false;
                    if (var22) {
                        int var24 = var2.method3686() << 24;
                        int var25 = var24 | var2.method3686() << 16;
                        int var26 = var25 | var2.method3686() << 8;
                        int var27 = var26 | var2.method3686();
                        int var28 = class309.method4940(class86.field1166);
                        if (Statics.field3868.field1027.size() >= 10 && !Statics.field3868.field1027.containsKey(var28)) {
                            Iterator var29 = Statics.field3868.field1027.entrySet().iterator();
                            var29.next();
                            var29.remove();
                        }
                        Statics.field3868.field1027.put(var28, var27);
                    }
                    if (field752) {
                        Statics.field3868.field1026 = class86.field1166;
                    } else {
                        Statics.field3868.field1026 = null;
                    }
                    class74.method230();
                    field791 = var1.method3177();
                    field811 = var1.method3177() == 1;
                    field843 = var1.method3177();
                    field843 <<= 0x8;
                    field843 += var1.method3177();
                    field740 = var1.method3177();
                    var1.method3180(var2.field2440, 0, 1);
                    var2.field2439 = 0;
                    class188[] var30 = class188.method372();
                    int var31 = var2.method3688();
                    if (var31 < 0 || var31 >= var30.length) {
                        throw new IOException(var31 + " " + var2.field2439);
                    }
                    field669.field1285 = var30[var31];
                    field669.field1297 = field669.field1285.field2163;
                    var1.method3180(var2.field2440, 0, 2);
                    var2.field2439 = 0;
                    field669.field1297 = var2.method3530();
                    try {
                        client var32 = Statics.field1509;
                        JSObject.getWindow(var32).call("zap", (Object[]) null);
                    } catch (Throwable var43) {
                    }
                    field655 = 13;
                }
                if (field655 != 13) {
                    if (field655 == 14 && var1.method3173() >= 2) {
                        var2.field2439 = 0;
                        var1.method3180(var2.field2440, 0, 2);
                        var2.field2439 = 0;
                        Statics.field509 = var2.method3530();
                        field655 = 15;
                    }
                    if (field655 == 15 && var1.method3173() >= Statics.field509) {
                        var2.field2439 = 0;
                        var1.method3180(var2.field2440, 0, Statics.field509);
                        var2.field2439 = 0;
                        String var34 = var2.method3426();
                        String var35 = var2.method3426();
                        String var36 = var2.method3426();
                        class86.method951(var34, var35, var36);
                        method906(10);
                    }
                    if (field655 == 16) {
                        if (field669.field1297 == -1) {
                            if (var1.method3173() < 2) {
                                return;
                            }
                            var1.method3180(var2.field2440, 0, 2);
                            var2.field2439 = 0;
                            field669.field1297 = var2.method3530();
                        }
                        if (var1.method3173() >= field669.field1297) {
                            var1.method3180(var2.field2440, 0, field669.field1297);
                            var2.field2439 = 0;
                            int var37 = field669.field1297;
                            field673.method4951();
                            field669.method2054();
                            field669.field1289.field2439 = 0;
                            field669.field1285 = null;
                            field669.field1295 = null;
                            field669.field1296 = null;
                            field669.field1288 = null;
                            field669.field1297 = 0;
                            field669.field1293 = 0;
                            field640 = 0;
                            field759 = 0;
                            field758 = false;
                            field730 = 0;
                            field714 = 0;
                            for (int var38 = 0; var38 < 2048; var38++) {
                                field738[var38] = null;
                            }
                            Statics.field389 = null;
                            for (int var39 = 0; var39 < field664.length; var39++) {
                                class80 var40 = field664[var39];
                                if (var40 != null) {
                                    var40.field933 = -1;
                                    var40.field943 = false;
                                }
                            }
                            class60.method3995();
                            method906(30);
                            for (int var41 = 0; var41 < 100; var41++) {
                                field864[var41] = true;
                            }
                            method3669();
                            class90.method130(var2);
                            if (var2.field2439 != var37) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field656++;
                        if (field656 > 2000) {
                            if (field657 < 1) {
                                if (Statics.field2451 == Statics.field13) {
                                    Statics.field2451 = Statics.field216;
                                } else {
                                    Statics.field2451 = Statics.field13;
                                }
                                field657++;
                                field655 = 0;
                            } else {
                                method3735(-3);
                            }
                        }
                    }
                } else if (var1.method3173() >= field669.field1297) {
                    var2.field2439 = 0;
                    var1.method3180(var2.field2440, 0, field669.field1297);
                    field673.method4960();
                    method671();
                    class90.method130(var2);
                    Statics.field1910 = -1;
                    Statics.method760(false, var2);
                    field669.field1285 = null;
                }
            }
        } catch (IOException var44) {
            if (field657 < 1) {
                if (Statics.field2451 == Statics.field13) {
                    Statics.field2451 = Statics.field216;
                } else {
                    Statics.field2451 = Statics.field13;
                }
                field657++;
                field655 = 0;
            } else {
                method3735(-2);
            }
        }
    }

    @ObfuscatedName("as.fc(I)V")
    public static void method671() {
        field627 = -1L;
        Statics.field1209.field564 = 0;
        Statics.field2800 = true;
        field634 = true;
        field711 = -1L;
        Statics.method1533();
        field669.method2054();
        field669.field1289.field2439 = 0;
        field669.field1285 = null;
        field669.field1295 = null;
        field669.field1296 = null;
        field669.field1288 = null;
        field669.field1297 = 0;
        field669.field1293 = 0;
        field640 = 0;
        field670 = 0;
        field821 = 0;
        field759 = 0;
        field758 = false;
        class54.field453 = 0;
        class92.method1910();
        field783 = 0;
        field777 = false;
        field860 = 0;
        field692 = 0;
        field778 = 0;
        Statics.field3646 = null;
        field730 = 0;
        field847 = -1;
        field714 = 0;
        field853 = 0;
        field649 = class85.field1141;
        field898 = class85.field1141;
        field665 = 0;
        class90.field1225 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class90.field1234[var0] = null;
            class90.field1235[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field738[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field664[var2] = null;
        }
        field636 = -1;
        field861.method4850();
        field881.method4850();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field893[var3][var4][var5] = null;
                }
            }
        }
        field751 = new class273();
        Statics.field205.method1649();
        for (int var6 = 0; var6 < Statics.field3283; var6++) {
            class252 var7 = class252.method1002(var6);
            if (var7 != null) {
                class224.field2600[var6] = 0;
                class224.field2601[var6] = 0;
            }
        }
        Statics.field2390.method1943();
        field792 = -1;
        if (field830 != -1) {
            class229.method3668(field830);
        }
        for (class62 var8 = (class62) field703.method5411(); var8 != null; var8 = (class62) field703.method5415()) {
            method1849(var8, true);
        }
        field830 = -1;
        field703 = new class319(8);
        field788 = null;
        field759 = 0;
        field758 = false;
        field682.method4026((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field746[var9] = null;
            field747[var9] = false;
        }
        class60.method3995();
        field862 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field864[var10] = true;
        }
        method3669();
        Statics.field1298 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field889[var11] = new class10();
        }
        Statics.field1590 = null;
    }

    @ObfuscatedName("hn.fl(II)V")
    public static void method3735(int arg0) {
        if (arg0 == -3) {
            class86.method951(class236.field3007, class236.field2879, class236.field2888);
        } else if (arg0 == -2) {
            class86.method951(class236.field2889, class236.field2890, class236.field3072);
        } else if (arg0 == -1) {
            class86.method951(class236.field2892, class236.field2893, class236.field2894);
        } else if (arg0 == 3) {
            class86.field1161 = 3;
            class86.field1160 = 1;
        } else if (arg0 == 4) {
            class86.method521(0);
        } else if (arg0 == 5) {
            class86.field1160 = 2;
            class86.method951(class236.field2898, class236.field3021, class236.field2900);
        } else if (arg0 == 68 || !(field629 || arg0 != 6)) {
            class86.method951(class236.field3135, class236.field2975, class236.field2903);
        } else if (arg0 == 7) {
            class86.method951(class236.field2904, class236.field2905, class236.field3117);
        } else if (arg0 == 8) {
            class86.method951(class236.field2907, class236.field3102, class236.field2909);
        } else if (arg0 == 9) {
            class86.method951(class236.field3011, class236.field2911, class236.field2843);
        } else if (arg0 == 10) {
            class86.method951(class236.field2913, class236.field2914, class236.field2915);
        } else if (arg0 == 11) {
            class86.method951(class236.field2916, class236.field2917, class236.field2918);
        } else if (arg0 == 12) {
            class86.method951(class236.field2943, class236.field2920, class236.field2921);
        } else if (arg0 == 13) {
            class86.method951(class236.field2922, class236.field2923, class236.field3126);
        } else if (arg0 == 14) {
            class86.method951(class236.field3008, class236.field3071, class236.field2927);
        } else if (arg0 == 16) {
            class86.method951(class236.field2878, class236.field2929, class236.field2842);
        } else if (arg0 == 17) {
            class86.method951(class236.field2912, class236.field2932, class236.field3118);
        } else if (arg0 == 18) {
            class86.method521(1);
        } else if (arg0 == 19) {
            class86.method951(class236.field2937, class236.field2938, class236.field2939);
        } else if (arg0 == 20) {
            class86.method951(class236.field2940, class236.field2941, class236.field2942);
        } else if (arg0 == 22) {
            class86.method951(class236.field3039, class236.field3122, class236.field3095);
        } else if (arg0 == 23) {
            class86.method951(class236.field2945, class236.field3046, class236.field2948);
        } else if (arg0 == 24) {
            class86.method951(class236.field2949, class236.field2950, class236.field2951);
        } else if (arg0 == 25) {
            class86.method951(class236.field2952, class236.field2953, class236.field2970);
        } else if (arg0 == 26) {
            class86.method951(class236.field2959, class236.field2956, class236.field2930);
        } else if (arg0 == 27) {
            class86.method951(class236.field2958, class236.field3009, class236.field2960);
        } else if (arg0 == 31) {
            class86.method951(class236.field2967, class236.field3013, class236.field2969);
        } else if (arg0 == 32) {
            class86.method951(class236.field2863, class236.field2971, class236.field2928);
        } else if (arg0 == 37) {
            class86.method951(class236.field2931, class236.field2974, class236.field2965);
        } else if (arg0 == 38) {
            class86.method951(class236.field2910, class236.field2925, class236.field2955);
        } else if (arg0 == 55) {
            class86.field1161 = 8;
        } else if (arg0 == 56) {
            class86.method951(class236.field2983, class236.field2984, class236.field2985);
            method906(11);
            return;
        } else if (arg0 == 57) {
            class86.method951(class236.field2986, class236.field2987, class236.field2988);
            method906(11);
            return;
        } else if (arg0 == 61) {
            class86.field1161 = 7;
        } else {
            class86.method951(class236.field2989, class236.field3006, class236.field2991);
        }
        method906(10);
    }

    @ObfuscatedName("dl.fj(I)V")
    public static final void method2522() {
        field669.method2058();
        method5183();
        Statics.field582.method2902();
        for (int var0 = 0; var0 < 4; var0++) {
            field854[var0].method3257();
        }
        System.gc();
        class215.method3196(2);
        field856 = -1;
        field857 = false;
        class76.method3996();
        method906(10);
    }

    @ObfuscatedName("kx.fp(I)V")
    public static final void method5183() {
        class269.method38();
        class256.method2616();
        class257.method703();
        class265.method582();
        class268.method383();
        class266.method1615();
        class270.field3592.method3010();
        class270.field3586.method3010();
        class255.method3097();
        class260.field3373.method3010();
        class252.field3282.method3010();
        class264.method52();
        class258.method3564();
        class262.field3384.method3010();
        class261.method4340();
        class253.method1908();
        class226.field2616.method3010();
        class229.method3100();
        ((class120) Statics.field1759).method2503();
        class93.field1267.method3010();
        Statics.field3225.method4172();
        Statics.field1778.method4172();
        Statics.field111.method4172();
        Statics.field204.method4172();
        Statics.field1220.method4172();
        Statics.field1968.method4172();
        Statics.field326.method4172();
        Statics.field194.method4172();
        Statics.field3160.method4172();
        Statics.field85.method4172();
        Statics.field1156.method4172();
        Statics.field1120.method4172();
    }

    @ObfuscatedName("aa.fd(I)V")
    public static final void method730() {
        if (field670 > 0) {
            method2522();
        } else {
            field673.method4953();
            method906(40);
            Statics.field3667 = field669.method2061();
            field669.method2055();
        }
    }

    @ObfuscatedName("z.fh(ZI)V")
    public static final void method167(boolean arg0) {
        if (arg0) {
            field659 = class86.field1171 ? class160.field1981 : class160.field1984;
        } else {
            field659 = Statics.field3868.field1027.containsKey(class309.method4940(class86.field1166)) ? class160.field1983 : class160.field1986;
        }
    }

    @ObfuscatedName("client.fx(I)V")
    public final void method1165() {
        if (field640 > 1) {
            field640--;
        }
        if (field670 > 0) {
            field670--;
        }
        if (field852) {
            field852 = false;
            method730();
            return;
        }
        if (!field758) {
            Statics.method512();
        }
        for (int var1 = 0; var1 < 100 && this.method1421(field669); var1++) {
        }
        if (field630 != 30) {
            return;
        }
        while (true) {
            class322 var2 = (class322) class323.field3870.method4823();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field673.field3673) {
                    class192 var6 = class192.method1750(class189.field2234, field669.field1284);
                    var6.field2356.method3565(0);
                    int var7 = var6.field2356.field2439;
                    field673.method4947(var6.field2356);
                    var6.field2356.method3409(var6.field2356.field2439 - var7);
                    field669.method2056(var6);
                    field673.method4950();
                }
                Object var8 = Statics.field1209.field562;
                synchronized (Statics.field1209.field562) {
                    if (!field827) {
                        Statics.field1209.field564 = 0;
                    } else if (class54.field469 != 0 || Statics.field1209.field564 >= 40) {
                        class192 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field1209.field564 && (var9 == null || var9.field2356.field2439 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field1209.field565[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field1209.field561[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field696 != var16 || field744 != var15) {
                                if (var9 == null) {
                                    var9 = class192.method1750(class189.field2273, field669.field1284);
                                    var9.field2356.method3565(0);
                                    var10 = var9.field2356.field2439;
                                    var9.field2356.field2439 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field637 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field696;
                                    var18 = var15 - field744;
                                    var19 = (int) ((Statics.field1209.field566[var14] - field637) / 20L);
                                    var12 = (int) ((Statics.field1209.field566[var14] - field637) % 20L + (long) var12);
                                }
                                field696 = var16;
                                field744 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2356.method3402((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2356.method3565(var19 + 128);
                                    var9.field2356.method3402((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2356.method3565(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2356.method3422(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2356.method3422(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2356.method3402((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2356.method3422(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2356.method3422(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field637 = Statics.field1209.field566[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2356.method3409(var9.field2356.field2439 - var10);
                            int var20 = var9.field2356.field2439;
                            var9.field2356.field2439 = var10;
                            var9.field2356.method3565(var12 / var13);
                            var9.field2356.method3565(var12 % var13);
                            var9.field2356.field2439 = var20;
                            field669.method2056(var9);
                        }
                        if (var11 >= Statics.field1209.field564) {
                            Statics.field1209.field564 = 0;
                        } else {
                            Statics.field1209.field564 -= var11;
                            System.arraycopy(Statics.field1209.field561, var11, Statics.field1209.field561, 0, Statics.field1209.field564);
                            System.arraycopy(Statics.field1209.field565, var11, Statics.field1209.field565, 0, Statics.field1209.field564);
                            System.arraycopy(Statics.field1209.field566, var11, Statics.field1209.field566, 0, Statics.field1209.field564);
                        }
                    }
                }
                if (class54.field469 == 1 || !Statics.field3880 && class54.field469 == 4 || class54.field469 == 2) {
                    long var22 = (class54.field470 - field627) / 50L;
                    if (var22 > 4095L) {
                        var22 = 4095L;
                    }
                    field627 = class54.field470;
                    int var24 = class54.field475;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field2370) {
                        var24 = Statics.field2370;
                    }
                    int var25 = class54.field462;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field1402) {
                        var25 = Statics.field1402;
                    }
                    int var26 = (int) var22;
                    class192 var27 = class192.method1750(class189.field2271, field669.field1284);
                    var27.field2356.method3402((var26 << 1) + (class54.field469 == 2 ? 1 : 0));
                    var27.field2356.method3402(var25);
                    var27.field2356.method3402(var24);
                    field669.method2056(var27);
                }
                if (class45.field372 > 0) {
                    class192 var28 = class192.method1750(class189.field2297, field669.field1284);
                    var28.field2356.method3402(0);
                    int var29 = var28.field2356.field2439;
                    long var30 = class204.method3658();
                    for (int var32 = 0; var32 < class45.field372; var32++) {
                        long var33 = var30 - field711;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field711 = var30;
                        var28.field2356.method3444(class45.field370[var32]);
                        var28.field2356.method3419((int) var33);
                    }
                    var28.field2356.method3413(var28.field2356.field2439 - var29);
                    field669.method2056(var28);
                }
                if (field706 > 0) {
                    field706--;
                }
                if (class45.field365[96] || class45.field365[97] || class45.field365[98] || class45.field365[99]) {
                    field707 = true;
                }
                if (field707 && field706 <= 0) {
                    field706 = 20;
                    field707 = false;
                    class192 var35 = class192.method1750(class189.field2269, field669.field1284);
                    var35.field2356.method3454(field693);
                    var35.field2356.method3452(field692);
                    field669.method2056(var35);
                }
                if (Statics.field2800 && !field634) {
                    field634 = true;
                    class192 var36 = class192.method1750(class189.field2303, field669.field1284);
                    var36.field2356.method3565(1);
                    field669.method2056(var36);
                }
                if (!Statics.field2800 && field634) {
                    field634 = false;
                    class192 var37 = class192.method1750(class189.field2303, field669.field1284);
                    var37.field2356.method3565(0);
                    field669.method2056(var37);
                }
                if (Statics.field533 != null) {
                    Statics.field533.method5732();
                }
                method4703();
                method1090();
                if (field630 != 30) {
                    return;
                }
                method717();
                method195();
                field669.field1293++;
                if (field669.field1293 > 750) {
                    method730();
                    return;
                }
                int var38 = class90.field1225;
                int[] var39 = class90.field1238;
                for (int var40 = 0; var40 < var38; var40++) {
                    class67 var41 = field738[var39[var40]];
                    if (var41 != null) {
                        method1094(var41, 1);
                    }
                }
                for (int var42 = 0; var42 < field665; var42++) {
                    int var43 = field666[var42];
                    class80 var44 = field664[var43];
                    if (var44 != null) {
                        method1094(var44, var44.field1097.field3539);
                    }
                }
                method5123();
                field684++;
                if (field880 != 0) {
                    field647 += 20;
                    if (field647 >= 400) {
                        field880 = 0;
                    }
                }
                if (Statics.field1862 != null) {
                    field700++;
                    if (field700 >= 15) {
                        method272(Statics.field1862);
                        Statics.field1862 = null;
                    }
                }
                class229 var45 = Statics.field2065;
                class229 var46 = Statics.field1498;
                Statics.field2065 = null;
                Statics.field1498 = null;
                field799 = null;
                field803 = false;
                field800 = false;
                field750 = 0;
                while (class45.method2277() && field750 < 128) {
                    if (field791 >= 2 && class45.field365[82] && Statics.field3192 == 66) {
                        String var47 = class92.method701();
                        Statics.field1509.method788(var47);
                    } else if (field778 != 1 || Statics.field2380 <= 0) {
                        field845[field750] = Statics.field3192;
                        field844[field750] = Statics.field2380;
                        field750++;
                    }
                }
                if (method1703() && class45.field365[82] && class45.field365[81] && field741 != 0) {
                    int var48 = Statics.field389.field608 - field741;
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 3) {
                        var48 = 3;
                    }
                    if (Statics.field389.field608 != var48) {
                        int var49 = Statics.field405 + Statics.field389.field953[0];
                        int var50 = Statics.field1088 + Statics.field389.field935[0];
                        class192 var51 = class192.method1750(class189.field2264, field669.field1284);
                        var51.field2356.method3508(0);
                        var51.field2356.method3452(var50);
                        var51.field2356.method3444(var48);
                        var51.field2356.method3402(var49);
                        field669.method2056(var51);
                    }
                    field741 = 0;
                }
                if (field830 != -1) {
                    method4123(field830, 0, 0, Statics.field1402, Statics.field2370, 0, 0);
                }
                field807++;
                while (true) {
                    class63 var52;
                    class229 var53;
                    class229 var54;
                    do {
                        var52 = (class63) field822.method4891();
                        if (var52 == null) {
                            while (true) {
                                class63 var55;
                                class229 var56;
                                class229 var57;
                                do {
                                    var55 = (class63) field823.method4891();
                                    if (var55 == null) {
                                        while (true) {
                                            class63 var58;
                                            class229 var59;
                                            class229 var60;
                                            do {
                                                var58 = (class63) field680.method4891();
                                                if (var58 == null) {
                                                    this.method1169();
                                                    method234();
                                                    if (field887 != null) {
                                                        this.method1174();
                                                    }
                                                    if (Statics.field387 != null) {
                                                        method272(Statics.field387);
                                                        field735++;
                                                        if (class54.field461 == 0) {
                                                            if (field734) {
                                                                if (Statics.field387 == Statics.field1976 && field733 != field732) {
                                                                    class229 var61 = Statics.field387;
                                                                    byte var62 = 0;
                                                                    if (field787 == 1 && var61.field2648 == 206) {
                                                                        var62 = 1;
                                                                    }
                                                                    if (var61.field2768[field733] <= 0) {
                                                                        var62 = 0;
                                                                    }
                                                                    if (class230.method3172(method12(var61))) {
                                                                        int var63 = field732;
                                                                        int var64 = field733;
                                                                        var61.field2768[var64] = var61.field2768[var63];
                                                                        var61.field2769[var64] = var61.field2769[var63];
                                                                        var61.field2768[var63] = -1;
                                                                        var61.field2769[var63] = 0;
                                                                    } else if (var62 == 1) {
                                                                        int var65 = field732;
                                                                        int var66 = field733;
                                                                        while (var65 != var66) {
                                                                            if (var65 > var66) {
                                                                                var61.method4078(var65 - 1, var65);
                                                                                var65--;
                                                                            } else if (var65 < var66) {
                                                                                var61.method4078(var65 + 1, var65);
                                                                                var65++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var61.method4078(field733, field732);
                                                                    }
                                                                    class192 var67 = class192.method1750(class189.field2310, field669.field1284);
                                                                    var67.field2356.method3402(field733);
                                                                    var67.field2356.method3452(field732);
                                                                    var67.field2356.method3422(Statics.field387.field2644);
                                                                    var67.field2356.method3444(var62);
                                                                    field669.method2056(var67);
                                                                }
                                                            } else if (this.method1170()) {
                                                                this.method1268(field731, field691);
                                                            } else if (field759 > 0) {
                                                                int var68 = field731;
                                                                int var69 = field691;
                                                                method4124(Statics.field60, var68, var69);
                                                                Statics.field60 = null;
                                                            }
                                                            field700 = 10;
                                                            class54.field469 = 0;
                                                            Statics.field387 = null;
                                                        } else if (field735 >= 5 && (class54.field456 > field731 + 5 || class54.field456 < field731 - 5 || class54.field463 > field691 + 5 || class54.field463 < field691 - 5)) {
                                                            field734 = true;
                                                        }
                                                    }
                                                    if (class134.method2936()) {
                                                        int var70 = class134.field1804;
                                                        int var71 = class134.field1815;
                                                        class192 var72 = class192.method1750(class189.field2326, field669.field1284);
                                                        var72.field2356.method3565(5);
                                                        var72.field2356.method3453(Statics.field1088 + var71);
                                                        var72.field2356.method3453(Statics.field405 + var70);
                                                        var72.field2356.method3443(class45.field365[82] ? (class45.field365[81] ? 2 : 1) : 0);
                                                        field669.method2056(var72);
                                                        class134.method2852();
                                                        field723 = class54.field462;
                                                        field724 = class54.field475;
                                                        field880 = 1;
                                                        field647 = 0;
                                                        field714 = var70;
                                                        field853 = var71;
                                                    }
                                                    if (Statics.field2065 != var45) {
                                                        if (var45 != null) {
                                                            method272(var45);
                                                        }
                                                        if (Statics.field2065 != null) {
                                                            method272(Statics.field2065);
                                                        }
                                                    }
                                                    if (Statics.field1498 != var46 && field774 == field773) {
                                                        if (var46 != null) {
                                                            method272(var46);
                                                        }
                                                        if (Statics.field1498 != null) {
                                                            method272(Statics.field1498);
                                                        }
                                                    }
                                                    if (Statics.field1498 == null) {
                                                        if (field773 > 0) {
                                                            field773--;
                                                        }
                                                    } else if (field773 < field774) {
                                                        field773++;
                                                        if (field774 == field773) {
                                                            method272(Statics.field1498);
                                                        }
                                                    }
                                                    method953();
                                                    if (field742) {
                                                        int var73 = Statics.field24 * 128 + 64;
                                                        int var74 = Statics.field2589 * 128 + 64;
                                                        int var75 = method520(var73, var74, Statics.field1394) - Statics.field282;
                                                        if (Statics.field350 < var73) {
                                                            Statics.field350 += Statics.field252 * (var73 - Statics.field350) / 1000 + Statics.field2332;
                                                            if (Statics.field350 > var73) {
                                                                Statics.field350 = var73;
                                                            }
                                                        }
                                                        if (Statics.field350 > var73) {
                                                            Statics.field350 -= Statics.field252 * (Statics.field350 - var73) / 1000 + Statics.field2332;
                                                            if (Statics.field350 < var73) {
                                                                Statics.field350 = var73;
                                                            }
                                                        }
                                                        if (Statics.field35 < var75) {
                                                            Statics.field35 += Statics.field252 * (var75 - Statics.field35) / 1000 + Statics.field2332;
                                                            if (Statics.field35 > var75) {
                                                                Statics.field35 = var75;
                                                            }
                                                        }
                                                        if (Statics.field35 > var75) {
                                                            Statics.field35 -= Statics.field252 * (Statics.field35 - var75) / 1000 + Statics.field2332;
                                                            if (Statics.field35 < var75) {
                                                                Statics.field35 = var75;
                                                            }
                                                        }
                                                        if (Statics.field63 < var74) {
                                                            Statics.field63 += Statics.field252 * (var74 - Statics.field63) / 1000 + Statics.field2332;
                                                            if (Statics.field63 > var74) {
                                                                Statics.field63 = var74;
                                                            }
                                                        }
                                                        if (Statics.field63 > var74) {
                                                            Statics.field63 -= Statics.field252 * (Statics.field63 - var74) / 1000 + Statics.field2332;
                                                            if (Statics.field63 < var74) {
                                                                Statics.field63 = var74;
                                                            }
                                                        }
                                                        int var76 = Statics.field53 * 128 + 64;
                                                        int var77 = Statics.field359 * 128 + 64;
                                                        int var78 = method520(var76, var77, Statics.field1394) - Statics.field3194;
                                                        int var79 = var76 - Statics.field350;
                                                        int var80 = var78 - Statics.field35;
                                                        int var81 = var77 - Statics.field63;
                                                        int var82 = (int) Math.sqrt((double) (var79 * var79 + var81 * var81));
                                                        int var83 = (int) (Math.atan2((double) var80, (double) var82) * 325.949D) & 0x7FF;
                                                        int var84 = (int) (Math.atan2((double) var79, (double) var81) * -325.949D) & 0x7FF;
                                                        if (var83 < 128) {
                                                            var83 = 128;
                                                        }
                                                        if (var83 > 383) {
                                                            var83 = 383;
                                                        }
                                                        if (Statics.field114 < var83) {
                                                            Statics.field114 += Statics.field2057 * (var83 - Statics.field114) / 1000 + Statics.field1732;
                                                            if (Statics.field114 > var83) {
                                                                Statics.field114 = var83;
                                                            }
                                                        }
                                                        if (Statics.field114 > var83) {
                                                            Statics.field114 -= Statics.field2057 * (Statics.field114 - var83) / 1000 + Statics.field1732;
                                                            if (Statics.field114 < var83) {
                                                                Statics.field114 = var83;
                                                            }
                                                        }
                                                        int var85 = var84 - Statics.field2551;
                                                        if (var85 > 1024) {
                                                            var85 -= 2048;
                                                        }
                                                        if (var85 < -1024) {
                                                            var85 += 2048;
                                                        }
                                                        if (var85 > 0) {
                                                            Statics.field2551 += Statics.field2057 * var85 / 1000 + Statics.field1732;
                                                            Statics.field2551 &= 0x7FF;
                                                        }
                                                        if (var85 < 0) {
                                                            Statics.field2551 -= Statics.field2057 * -var85 / 1000 + Statics.field1732;
                                                            Statics.field2551 &= 0x7FF;
                                                        }
                                                        int var86 = var84 - Statics.field2551;
                                                        if (var86 > 1024) {
                                                            var86 -= 2048;
                                                        }
                                                        if (var86 < -1024) {
                                                            var86 += 2048;
                                                        }
                                                        if (var86 < 0 && var85 > 0 || var86 > 0 && var85 < 0) {
                                                            Statics.field2551 = var84;
                                                        }
                                                    }
                                                    for (int var87 = 0; var87 < 5; var87++) {
                                                        int var10002 = field871[var87]++;
                                                    }
                                                    Statics.field2390.method1970();
                                                    int var88 = class54.method274();
                                                    int var89 = class45.field376;
                                                    if (var88 > 15000 && var89 > 15000) {
                                                        field670 = 250;
                                                        class54.field453 = 14500;
                                                        class192 var91 = class192.method1750(class189.field2272, field669.field1284);
                                                        field669.method2056(var91);
                                                    }
                                                    Statics.field205.method1688();
                                                    field669.field1294++;
                                                    if (field669.field1294 > 50) {
                                                        class192 var92 = class192.method1750(class189.field2252, field669.field1284);
                                                        field669.method2056(var92);
                                                    }
                                                    try {
                                                        field669.method2071();
                                                    } catch (IOException var94) {
                                                        method730();
                                                    }
                                                    return;
                                                }
                                                var59 = var58.field558;
                                                if (var59.field2645 < 0) {
                                                    break;
                                                }
                                                var60 = class229.method3345(var59.field2663);
                                            } while (var60 == null || var60.field2774 == null || var59.field2645 >= var60.field2774.length || var60.field2774[var59.field2645] != var59);
                                            class77.method4251(var58);
                                        }
                                    }
                                    var56 = var55.field558;
                                    if (var56.field2645 < 0) {
                                        break;
                                    }
                                    var57 = class229.method3345(var56.field2663);
                                } while (var57 == null || var57.field2774 == null || var56.field2645 >= var57.field2774.length || var57.field2774[var56.field2645] != var56);
                                class77.method4251(var55);
                            }
                        }
                        var53 = var52.field558;
                        if (var53.field2645 < 0) {
                            break;
                        }
                        var54 = class229.method3345(var53.field2663);
                    } while (var54 == null || var54.field2774 == null || var53.field2645 >= var54.field2774.length || var54.field2774[var53.field2645] != var53);
                    class77.method4251(var52);
                }
            }
            class192 var4 = class192.method1750(class189.field2304, field669.field1284);
            var4.field2356.method3565(0);
            int var5 = var4.field2356.field2439;
            Statics.method386(var4.field2356);
            var4.field2356.method3409(var4.field2356.field2439 - var5);
            field669.method2056(var4);
        }
    }

    @ObfuscatedName("i.fm(B)V")
    public static final void method146() {
        if (Statics.field3223 != null) {
            Statics.field3223.method2222();
        }
        if (Statics.field294 != null) {
            Statics.field294.method2222();
        }
    }

    @ObfuscatedName("t.fz(I)V")
    public static final void method195() {
        for (int var0 = 0; var0 < field860; var0++) {
            int var10002 = field795[var0]--;
            if (field795[var0] >= -10) {
                class100 var2 = field865[var0];
                if (var2 == null) {
                    class100 var10000 = (class100) null;
                    var2 = class100.method2133(Statics.field204, field790[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field795[var0] += var2.method2130();
                    field865[var0] = var2;
                }
                if (field795[var0] < 0) {
                    int var9;
                    if (field869[var0] == 0) {
                        var9 = field697;
                    } else {
                        int var3 = (field869[var0] & 0xFF) * 128;
                        int var4 = field869[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field389.field957;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field869[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field389.field916;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field795[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field859 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class102 var10 = var2.method2128().method2169(Statics.field1998);
                        class112 var11 = class112.method2284(var10, 100, var9);
                        var11.method2308(field621[var0] - 1);
                        Statics.field2033.method2095(var11);
                    }
                    field795[var0] = -100;
                }
            } else {
                field860--;
                for (int var1 = var0; var1 < field860; var1++) {
                    field790[var1] = field790[var1 + 1];
                    field865[var1] = field865[var1 + 1];
                    field621[var1] = field621[var1 + 1];
                    field795[var1] = field795[var1 + 1];
                    field869[var1] = field869[var1 + 1];
                }
                var0--;
            }
        }
        if (!field857) {
            return;
        }
        boolean var12;
        if (class215.field2503 == 0) {
            var12 = Statics.field2506.method3807();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field831 != 0 && field856 != -1) {
                class215.method1898(Statics.field1968, field856, 0, field831, false);
            }
            field857 = false;
        }
    }

    @ObfuscatedName("cg.fs(Ljh;IIII)V")
    public static void method2017(class270 arg0, int arg1, int arg2, int arg3) {
        if (field860 >= 50 || field859 == 0 || arg0.field3590 == null || arg1 >= arg0.field3590.length) {
            return;
        }
        int var4 = arg0.field3590[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field790[field860] = var5;
        field621[field860] = var6;
        field795[field860] = 0;
        field865[field860] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field869[field860] = (var8 << 16) + (var9 << 8) + var7;
        field860++;
    }

    @ObfuscatedName("ks.fv(IIIB)V")
    public static void method5111(int arg0, int arg1, int arg2) {
        if (field697 == 0 || arg1 == 0 || field860 >= 50) {
            return;
        }
        field790[field860] = arg0;
        field621[field860] = arg1;
        field795[field860] = arg2;
        field865[field860] = null;
        field869[field860] = 0;
        field860++;
    }

    @ObfuscatedName("kf.fu(II)V")
    public static void method5020(int arg0) {
        if (arg0 == -1 && !field857) {
            Statics.field2506.method3806();
            class215.field2503 = 1;
            Statics.field2505 = null;
        } else if (arg0 != -1 && field856 != arg0 && field831 != 0 && !field857) {
            class247 var1 = Statics.field1968;
            int var2 = field831;
            class215.field2503 = 1;
            Statics.field2505 = var1;
            Statics.field251 = arg0;
            Statics.field50 = 0;
            Statics.field233 = var2;
            Statics.field3887 = false;
            Statics.field1867 = 2;
        }
        field856 = arg0;
    }

    @ObfuscatedName("cr.fo(III)V")
    public static void method1826(int arg0, int arg1) {
        if (field831 != 0 && arg0 != -1) {
            class215.method1898(Statics.field1156, arg0, 0, field831, false);
            field857 = true;
        }
    }

    @ObfuscatedName("ju.ft(I)V")
    public static final void method4703() {
        if (!Statics.field1731) {
            return;
        }
        if (Statics.field1298 != null) {
            Statics.field1298.method5047();
        }
        method5177();
        Statics.field1731 = false;
    }

    @ObfuscatedName("bm.fa(I)V")
    public static final void method1090() {
        if (Statics.field1394 == field847) {
            return;
        }
        field847 = Statics.field1394;
        int var0 = Statics.field1394;
        int[] var1 = Statics.field538.field3900;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class56.field481[var0][var6][var4] & 0x18) == 0) {
                    Statics.field582.method2842(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class56.field481[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field582.method2842(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field538.method5574();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class56.field481[var0][var10][var9] & 0x18) == 0) {
                    method1050(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class56.field481[var0 + 1][var10][var9] & 0x8) != 0) {
                    method1050(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field760 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field582.method2948(Statics.field1394, var11, var12);
                if (var13 != 0L) {
                    int var15 = class129.method4558(var13);
                    int var16 = class265.method763(var15).field3450;
                    if (var16 >= 0) {
                        field851[field760] = class253.method2731(var16).method4376(false);
                        field771[field760] = var11;
                        field850[field760] = var12;
                        field760++;
                    }
                }
            }
        }
        Statics.field2396.method5540();
    }

    @ObfuscatedName("av.fb(Lho;IIS)V")
    public static final void method510(class229 arg0, int arg1, int arg2) {
        if (field730 != 0 && field730 != 3 || field758 || !(class54.field469 == 1 || !Statics.field3880 && class54.field469 == 4)) {
            return;
        }
        class223 var3 = arg0.method4084(true);
        if (var3 == null) {
            return;
        }
        int var4 = class54.field462 - arg1;
        int var5 = class54.field475 - arg2;
        if (!var3.method3994(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2594 / 2;
        int var7 = var5 - var3.field2595 / 2;
        int var8 = field692 & 0x7FF;
        int var9 = class131.field1757[var8];
        int var10 = class131.field1760[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field389.field957 + var11 >> 7;
        int var14 = Statics.field389.field916 - var12 >> 7;
        class192 var15 = class192.method1750(class189.field2327, field669.field1284);
        var15.field2356.method3565(18);
        var15.field2356.method3453(Statics.field1088 + var14);
        var15.field2356.method3453(Statics.field405 + var13);
        var15.field2356.method3443(class45.field365[82] ? (class45.field365[81] ? 2 : 1) : 0);
        var15.field2356.method3565(var6);
        var15.field2356.method3565(var7);
        var15.field2356.method3402(field692);
        var15.field2356.method3565(57);
        var15.field2356.method3565(0);
        var15.field2356.method3565(0);
        var15.field2356.method3565(89);
        var15.field2356.method3402(Statics.field389.field957);
        var15.field2356.method3402(Statics.field389.field916);
        var15.field2356.method3565(63);
        field669.method2056(var15);
        field714 = var13;
        field853 = var14;
    }

    @ObfuscatedName("ke.ff(I)V")
    public static final void method5123() {
        int[] var0 = class90.field1238;
        for (int var1 = 0; var1 < class90.field1225; var1++) {
            class67 var2 = field738[var0[var1]];
            if (var2 != null && var2.field932 > 0) {
                var2.field932--;
                if (var2.field932 == 0) {
                    var2.field929 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field665; var3++) {
            int var4 = field666[var3];
            class80 var5 = field664[var4];
            if (var5 != null && var5.field932 > 0) {
                var5.field932--;
                if (var5.field932 == 0) {
                    var5.field929 = null;
                }
            }
        }
    }

    @ObfuscatedName("bs.fy(S)V")
    public static final void method953() {
        if (field778 == 0) {
            int var0 = Statics.field389.field957;
            int var1 = Statics.field389.field916;
            if (Statics.field474 - var0 < -500 || Statics.field474 - var0 > 500 || Statics.field557 - var1 < -500 || Statics.field557 - var1 > 500) {
                Statics.field474 = var0;
                Statics.field557 = var1;
            }
            if (Statics.field474 != var0) {
                Statics.field474 += (var0 - Statics.field474) / 16;
            }
            if (Statics.field557 != var1) {
                Statics.field557 += (var1 - Statics.field557) / 16;
            }
            int var2 = Statics.field474 >> 7;
            int var3 = Statics.field557 >> 7;
            int var4 = method520(Statics.field474, Statics.field557, Statics.field1394);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field1394;
                        if (var8 < 3 && (class56.field481[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class56.field494[var8][var6][var7];
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
            if (var10 > field708) {
                field708 += (var10 - field708) / 24;
            } else if (var10 < field708) {
                field708 += (var10 - field708) / 80;
            }
            Statics.field569 = method520(Statics.field389.field957, Statics.field389.field916, Statics.field1394) - field687;
        } else if (field778 == 1) {
            if (field705 && Statics.field389 != null) {
                int var11 = Statics.field389.field953[0];
                int var12 = Statics.field389.field935[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field474 = Statics.field389.field957;
                    int var13 = method520(Statics.field389.field957, Statics.field389.field916, Statics.field1394) - field687;
                    if (var13 < Statics.field569) {
                        Statics.field569 = var13;
                    }
                    Statics.field557 = Statics.field389.field916;
                    field705 = false;
                }
            }
            short var14 = -1;
            if (class45.field365[33]) {
                var14 = 0;
            } else if (class45.field365[49]) {
                var14 = 1024;
            }
            if (class45.field365[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class45.field365[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class45.field365[35]) {
                var15 = -1;
            } else if (class45.field365[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class45.field365[81] ? field812 : field702;
                var16 = var17 * 16;
                field642 = var14;
                field858 = var15;
            }
            if (field699 < var16) {
                field699 += var16 / 8;
                if (field699 > var16) {
                    field699 = var16;
                }
            } else if (field699 > var16) {
                field699 = field699 * 9 / 10;
            }
            if (field699 > 0) {
                int var18 = field699 / 16;
                if (field642 >= 0) {
                    int var19 = field642 - Statics.field2551 & 0x7FF;
                    int var20 = class131.field1757[var19];
                    int var21 = class131.field1760[var19];
                    Statics.field474 += var18 * var20 / 65536;
                    Statics.field557 += var18 * var21 / 65536;
                }
                if (field858 != 0) {
                    Statics.field569 += field858 * var18;
                    if (Statics.field569 > 0) {
                        Statics.field569 = 0;
                    }
                }
            } else {
                field642 = -1;
                field858 = -1;
            }
            if (class45.field365[13]) {
                field669.method2056(class192.method1750(class189.field2232, field669.field1284));
                field778 = 0;
            }
        }
        if (class54.field461 == 4 && Statics.field3880) {
            int var22 = class54.field463 - field650;
            field701 = var22 * 2;
            field650 = var22 == -1 || var22 == 1 ? class54.field463 : (field650 + class54.field463) / 2;
            int var23 = field695 - class54.field456;
            field885 = var23 * 2;
            field695 = var23 == -1 || var23 == 1 ? class54.field456 : (field695 + class54.field456) / 2;
        } else {
            if (class45.field365[96]) {
                field885 += (-24 - field885) / 2;
            } else if (class45.field365[97]) {
                field885 += (24 - field885) / 2;
            } else {
                field885 /= 2;
            }
            if (class45.field365[98]) {
                field701 += (12 - field701) / 2;
            } else if (class45.field365[99]) {
                field701 += (-12 - field701) / 2;
            } else {
                field701 /= 2;
            }
            field650 = class54.field463;
            field695 = class54.field456;
        }
        field692 = field885 / 2 + field692 & 0x7FF;
        field693 += field701 / 2;
        if (field693 < 128) {
            field693 = 128;
        }
        if (field693 > 383) {
            field693 = 383;
        }
    }

    @ObfuscatedName("bl.fi(Lbz;II)V")
    public static final void method1094(class70 arg0, int arg1) {
        if (arg0.field954 > field633) {
            method5363(arg0);
        } else if (arg0.field963 >= field633) {
            if (field633 == arg0.field963 || arg0.field948 == -1 || arg0.field947 != 0 || arg0.field971 + 1 > class270.method596(arg0.field948).field3589[arg0.field926]) {
                int var2 = arg0.field963 - arg0.field954;
                int var3 = field633 - arg0.field954;
                int var4 = arg0.field958 * 128 + arg0.field919 * 64;
                int var5 = arg0.field960 * 128 + arg0.field919 * 64;
                int var6 = arg0.field959 * 128 + arg0.field919 * 64;
                int var7 = arg0.field961 * 128 + arg0.field919 * 64;
                arg0.field957 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field916 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field951 = 0;
            arg0.field967 = arg0.field964;
            arg0.field917 = arg0.field967;
        } else {
            arg0.field945 = arg0.field962;
            if (arg0.field970 == 0) {
                arg0.field951 = 0;
            } else {
                label225: {
                    if (arg0.field948 != -1 && arg0.field947 == 0) {
                        class270 var8 = class270.method596(arg0.field948);
                        if (arg0.field975 > 0 && var8.field3598 == 0) {
                            arg0.field951++;
                            break label225;
                        }
                        if (arg0.field975 <= 0 && var8.field3593 == 0) {
                            arg0.field951++;
                            break label225;
                        }
                    }
                    int var9 = arg0.field957;
                    int var10 = arg0.field916;
                    int var11 = arg0.field953[arg0.field970 - 1] * 128 + arg0.field919 * 64;
                    int var12 = arg0.field935[arg0.field970 - 1] * 128 + arg0.field919 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field967 = 1280;
                        } else if (var10 > var12) {
                            arg0.field967 = 1792;
                        } else {
                            arg0.field967 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field967 = 768;
                        } else if (var10 > var12) {
                            arg0.field967 = 256;
                        } else {
                            arg0.field967 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field967 = 1024;
                    } else if (var10 > var12) {
                        arg0.field967 = 0;
                    }
                    byte var13 = arg0.field973[arg0.field970 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field967 - arg0.field917 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field925;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field924;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field927;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field915;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field924;
                        }
                        arg0.field945 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class80) {
                            var17 = ((class80) arg0).field1097.field3567;
                        }
                        if (var17) {
                            if (arg0.field967 != arg0.field917 && arg0.field933 == -1 && arg0.field969 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field970 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field970 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field951 > 0 && arg0.field970 > 1) {
                                var16 = 8;
                                arg0.field951--;
                            }
                        } else {
                            if (arg0.field970 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field970 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field951 > 0 && arg0.field970 > 1) {
                                var16 = 8;
                                arg0.field951--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field945 == arg0.field924 && arg0.field920 != -1) {
                            arg0.field945 = arg0.field920;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field957 += var16;
                                if (arg0.field957 > var11) {
                                    arg0.field957 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field957 -= var16;
                                if (arg0.field957 < var11) {
                                    arg0.field957 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field916 += var16;
                                if (arg0.field916 > var12) {
                                    arg0.field916 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field916 -= var16;
                                if (arg0.field916 < var12) {
                                    arg0.field916 = var12;
                                }
                            }
                        }
                        if (arg0.field957 == var11 && arg0.field916 == var12) {
                            arg0.field970--;
                            if (arg0.field975 > 0) {
                                arg0.field975--;
                            }
                        }
                    } else {
                        arg0.field957 = var11;
                        arg0.field916 = var12;
                        arg0.field970--;
                        if (arg0.field975 > 0) {
                            arg0.field975--;
                        }
                    }
                }
            }
        }
        if (arg0.field957 < 128 || arg0.field916 < 128 || arg0.field957 >= 13184 || arg0.field916 >= 13184) {
            arg0.field948 = -1;
            arg0.field934 = -1;
            arg0.field954 = 0;
            arg0.field963 = 0;
            arg0.field957 = arg0.field953[0] * 128 + arg0.field919 * 64;
            arg0.field916 = arg0.field935[0] * 128 + arg0.field919 * 64;
            arg0.method1537();
        }
        if (Statics.field389 == arg0 && (arg0.field957 < 1536 || arg0.field916 < 1536 || arg0.field957 >= 11776 || arg0.field916 >= 11776)) {
            arg0.field948 = -1;
            arg0.field934 = -1;
            arg0.field954 = 0;
            arg0.field963 = 0;
            arg0.field957 = arg0.field953[0] * 128 + arg0.field919 * 64;
            arg0.field916 = arg0.field935[0] * 128 + arg0.field919 * 64;
            arg0.method1537();
        }
        method4150(arg0);
        method2038(arg0);
    }

    @ObfuscatedName("lg.fe(Lbz;B)V")
    public static final void method5363(class70 arg0) {
        int var1 = arg0.field954 - field633;
        int var2 = arg0.field958 * 128 + arg0.field919 * 64;
        int var3 = arg0.field960 * 128 + arg0.field919 * 64;
        arg0.field957 += (var2 - arg0.field957) / var1;
        arg0.field916 += (var3 - arg0.field916) / var1;
        arg0.field951 = 0;
        arg0.field967 = arg0.field964;
    }

    @ObfuscatedName("ik.fn(Lbz;I)V")
    public static final void method4150(class70 arg0) {
        if (arg0.field969 == 0) {
            return;
        }
        if (arg0.field933 != -1) {
            class70 var1 = null;
            if (arg0.field933 < 32768) {
                var1 = field664[arg0.field933];
            } else if (arg0.field933 >= 32768) {
                var1 = field738[arg0.field933 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field957 - var1.field957;
                int var3 = arg0.field916 - var1.field916;
                if (var2 != 0 || var3 != 0) {
                    arg0.field967 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field943) {
                arg0.field933 = -1;
                arg0.field943 = false;
            }
        }
        if (arg0.field944 != -1 && (arg0.field970 == 0 || arg0.field951 > 0)) {
            arg0.field967 = arg0.field944;
            arg0.field944 = -1;
        }
        int var4 = arg0.field967 - arg0.field917 & 0x7FF;
        if (var4 == 0 && arg0.field943) {
            arg0.field933 = -1;
            arg0.field943 = false;
        }
        if (var4 == 0) {
            arg0.field955 = 0;
            return;
        }
        arg0.field955++;
        if (var4 > 1024) {
            arg0.field917 -= arg0.field969;
            boolean var5 = true;
            if (var4 < arg0.field969 || var4 > 2048 - arg0.field969) {
                arg0.field917 = arg0.field967;
                var5 = false;
            }
            if (arg0.field962 == arg0.field945 && (arg0.field955 > 25 || var5)) {
                if (arg0.field922 == -1) {
                    arg0.field945 = arg0.field924;
                } else {
                    arg0.field945 = arg0.field922;
                }
            }
        } else {
            arg0.field917 += arg0.field969;
            boolean var6 = true;
            if (var4 < arg0.field969 || var4 > 2048 - arg0.field969) {
                arg0.field917 = arg0.field967;
                var6 = false;
            }
            if (arg0.field962 == arg0.field945 && (arg0.field955 > 25 || var6)) {
                if (arg0.field923 == -1) {
                    arg0.field945 = arg0.field924;
                } else {
                    arg0.field945 = arg0.field923;
                }
            }
        }
        arg0.field917 &= 0x7FF;
    }

    @ObfuscatedName("cp.fk(Lbz;I)V")
    public static final void method2038(class70 arg0) {
        arg0.field918 = false;
        if (arg0.field945 != -1) {
            class270 var1 = class270.method596(arg0.field945);
            if (var1 == null || var1.field3587 == null) {
                arg0.field945 = -1;
            } else {
                arg0.field956++;
                if (arg0.field946 < var1.field3587.length && arg0.field956 > var1.field3589[arg0.field946]) {
                    arg0.field956 = 1;
                    arg0.field946++;
                    method2017(var1, arg0.field946, arg0.field957, arg0.field916);
                }
                if (arg0.field946 >= var1.field3587.length) {
                    arg0.field956 = 0;
                    arg0.field946 = 0;
                    method2017(var1, arg0.field946, arg0.field957, arg0.field916);
                }
            }
        }
        if (arg0.field934 != -1 && field633 >= arg0.field972) {
            if (arg0.field921 < 0) {
                arg0.field921 = 0;
            }
            int var2 = class255.method756(arg0.field934).field3315;
            if (var2 == -1) {
                arg0.field934 = -1;
            } else {
                class270 var3 = class270.method596(var2);
                if (var3 == null || var3.field3587 == null) {
                    arg0.field934 = -1;
                } else {
                    arg0.field928++;
                    if (arg0.field921 < var3.field3587.length && arg0.field928 > var3.field3589[arg0.field921]) {
                        arg0.field928 = 1;
                        arg0.field921++;
                        method2017(var3, arg0.field921, arg0.field957, arg0.field916);
                    }
                    if (arg0.field921 >= var3.field3587.length && (arg0.field921 < 0 || arg0.field921 >= var3.field3587.length)) {
                        arg0.field934 = -1;
                    }
                }
            }
        }
        if (arg0.field948 != -1 && arg0.field947 <= 1) {
            class270 var4 = class270.method596(arg0.field948);
            if (var4.field3598 == 1 && arg0.field975 > 0 && arg0.field954 <= field633 && arg0.field963 < field633) {
                arg0.field947 = 1;
                return;
            }
        }
        if (arg0.field948 != -1 && arg0.field947 == 0) {
            class270 var5 = class270.method596(arg0.field948);
            if (var5 == null || var5.field3587 == null) {
                arg0.field948 = -1;
            } else {
                arg0.field971++;
                if (arg0.field926 < var5.field3587.length && arg0.field971 > var5.field3589[arg0.field926]) {
                    arg0.field971 = 1;
                    arg0.field926++;
                    method2017(var5, arg0.field926, arg0.field957, arg0.field916);
                }
                if (arg0.field926 >= var5.field3587.length) {
                    arg0.field926 -= var5.field3591;
                    arg0.field952++;
                    if (arg0.field952 >= var5.field3597) {
                        arg0.field948 = -1;
                    } else if (arg0.field926 >= 0 && arg0.field926 < var5.field3587.length) {
                        method2017(var5, arg0.field926, arg0.field957, arg0.field916);
                    } else {
                        arg0.field948 = -1;
                    }
                }
                arg0.field918 = var5.field3594;
            }
        }
        if (arg0.field947 > 0) {
            arg0.field947--;
        }
    }

    @ObfuscatedName("h.gp(I)V")
    public static void method234() {
        if (Statics.field533 != null) {
            Statics.field533.method5742(Statics.field1394, (Statics.field389.field957 >> 7) + Statics.field405, (Statics.field389.field916 >> 7) + Statics.field1088, false);
            Statics.field533.method5758();
        }
    }

    @ObfuscatedName("if.gh(Lbr;III)V")
    public static void method4137(class67 arg0, int arg1, int arg2) {
        if (arg0.field948 == arg1 && arg1 != -1) {
            int var3 = class270.method596(arg1).field3600;
            if (var3 == 1) {
                arg0.field926 = 0;
                arg0.field971 = 0;
                arg0.field947 = arg2;
                arg0.field952 = 0;
            }
            if (var3 == 2) {
                arg0.field952 = 0;
            }
        } else if (arg1 == -1 || arg0.field948 == -1 || class270.method596(arg1).field3585 >= class270.method596(arg0.field948).field3585) {
            arg0.field948 = arg1;
            arg0.field926 = 0;
            arg0.field971 = 0;
            arg0.field947 = arg2;
            arg0.field952 = 0;
            arg0.field975 = arg0.field970;
        }
    }

    @ObfuscatedName("io.gn(B)I")
    public static int method4408() {
        return field765 ? 2 : 1;
    }

    @ObfuscatedName("ck.gw(II)V")
    public static void method1911(int arg0) {
        field745 = 0L;
        if (arg0 >= 2) {
            field765 = true;
        } else {
            field765 = false;
        }
        if (method4408() == 1) {
            Statics.field1509.method784(765, 503);
        } else {
            Statics.field1509.method784(7680, 2160);
        }
        if (field630 >= 25) {
            method3669();
        }
    }

    @ObfuscatedName("gu.gb(I)V")
    public static void method3669() {
        class192 var0 = class192.method1750(class189.field2265, field669.field1284);
        var0.field2356.method3565(method4408());
        var0.field2356.method3402(Statics.field1402);
        var0.field2356.method3402(Statics.field2370);
        field669.method2056(var0);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method920() {
        field745 = class204.method3658() + 500L;
        this.method1359();
        if (field830 != -1) {
            this.method1337(true);
        }
    }

    @ObfuscatedName("client.ge(I)V")
    public void method1359() {
        int var1 = Statics.field1402;
        int var2 = Statics.field2370;
        if (this.field429 < var1) {
            int var3 = this.field429;
        }
        if (this.field435 < var2) {
            int var4 = this.field435;
        }
        if (Statics.field3868 == null) {
            return;
        }
        try {
            client var5 = Statics.field1509;
            Object[] var6 = new Object[] { method4408() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gs(I)V")
    public final void method1167() {
        if (field830 != -1) {
            method1644(field830);
        }
        for (int var1 = 0; var1 < field825; var1++) {
            if (field864[var1]) {
                field828[var1] = true;
            }
            field829[var1] = field864[var1];
            field864[var1] = false;
        }
        field826 = field633;
        field761 = -1;
        field772 = -1;
        Statics.field1976 = null;
        if (field830 != -1) {
            field825 = 0;
            method1812(field830, 0, 0, Statics.field1402, Statics.field2370, 0, 0, -1);
        }
        class324.method5459();
        if (field727) {
            if (field880 == 1) {
                Statics.field379[field647 / 100].method5584(field723 - 8, field724 - 8);
            }
            if (field880 == 2) {
                Statics.field379[field647 / 100 + 4].method5584(field723 - 8, field724 - 8);
            }
        }
        if (field758) {
            int var2 = Statics.field202;
            int var3 = Statics.field425;
            int var4 = Statics.field2509;
            int var5 = Statics.field286;
            int var6 = 6116423;
            class324.method5468(var2, var3, var4, var5, var6);
            class324.method5468(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class324.method5466(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field12.method5207(class236.field2998, var2 + 3, var3 + 14, var6, -1);
            int var7 = class54.field456;
            int var8 = class54.field463;
            for (int var9 = 0; var9 < field759; var9++) {
                int var10 = (field759 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                class302 var12 = Statics.field12;
                String var13;
                if (var9 < 0) {
                    var13 = "";
                } else if (field694[var9].length() > 0) {
                    var13 = field776[var9] + class236.field2993 + field694[var9];
                } else {
                    var13 = field776[var9];
                }
                var12.method5207(var13, var2 + 3, var10, var11, 0);
            }
            int var14 = Statics.field202;
            int var15 = Statics.field425;
            int var16 = Statics.field2509;
            int var17 = Statics.field286;
            for (int var18 = 0; var18 < field825; var18++) {
                if (field832[var18] + field712[var18] > var14 && field712[var18] < var14 + var16 && field849[var18] + field833[var18] > var15 && field849[var18] < var15 + var17) {
                    field828[var18] = true;
                }
            }
        } else if (field761 != -1) {
            method625(field761, field772);
        }
        if (field834 == 3) {
            for (int var19 = 0; var19 < field825; var19++) {
                if (field829[var19]) {
                    class324.method5471(field712[var19], field849[var19], field832[var19], field833[var19], 16711935, 128);
                } else if (field828[var19]) {
                    class324.method5471(field712[var19], field849[var19], field832[var19], field833[var19], 16711680, 128);
                }
            }
        }
        int var20 = Statics.field1394;
        int var21 = Statics.field389.field957;
        int var22 = Statics.field389.field916;
        int var23 = field684;
        for (class76 var24 = (class76) class76.field1053.method4856(); var24 != null; var24 = (class76) class76.field1053.method4858()) {
            if (var24.field1048 != -1 || var24.field1054 != null) {
                int var25 = 0;
                if (var21 > var24.field1041) {
                    var25 += var21 - var24.field1041;
                } else if (var21 < var24.field1045) {
                    var25 += var24.field1045 - var21;
                }
                if (var22 > var24.field1046) {
                    var25 += var22 - var24.field1046;
                } else if (var22 < var24.field1051) {
                    var25 += var24.field1051 - var22;
                }
                if (var25 - 64 > var24.field1047 || field859 == 0 || var24.field1042 != var20) {
                    if (var24.field1052 != null) {
                        Statics.field2033.method2074(var24.field1052);
                        var24.field1052 = null;
                    }
                    if (var24.field1044 != null) {
                        Statics.field2033.method2074(var24.field1044);
                        var24.field1044 = null;
                    }
                } else {
                    var25 -= 64;
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    int var26 = field859 * (var24.field1047 - var25) / var24.field1047;
                    class100 var10000;
                    if (var24.field1052 != null) {
                        var24.field1052.method2333(var26);
                    } else if (var24.field1048 >= 0) {
                        var10000 = (class100) null;
                        class100 var27 = class100.method2133(Statics.field204, var24.field1048, 0);
                        if (var27 != null) {
                            class102 var28 = var27.method2128().method2169(Statics.field1998);
                            class112 var29 = class112.method2284(var28, 100, var26);
                            var29.method2308(-1);
                            Statics.field2033.method2095(var29);
                            var24.field1052 = var29;
                        }
                    }
                    if (var24.field1044 != null) {
                        var24.field1044.method2333(var26);
                        if (!var24.field1044.method3302()) {
                            var24.field1044 = null;
                        }
                    } else if (var24.field1054 != null && (var24.field1057 -= var23) <= 0) {
                        int var30 = (int) (Math.random() * (double) var24.field1054.length);
                        var10000 = (class100) null;
                        class100 var31 = class100.method2133(Statics.field204, var24.field1054[var30], 0);
                        if (var31 != null) {
                            class102 var32 = var31.method2128().method2169(Statics.field1998);
                            class112 var33 = class112.method2284(var32, 100, var26);
                            var33.method2308(0);
                            Statics.field2033.method2095(var33);
                            var24.field1044 = var33;
                            var24.field1057 = var24.field1050 + (int) (Math.random() * (double) (var24.field1049 - var24.field1050));
                        }
                    }
                }
            }
        }
        field684 = 0;
    }

    @ObfuscatedName("bi.gl(Ljava/lang/String;ZI)V")
    public static final void method1535(String arg0, boolean arg1) {
        if (!field737) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field384.method5264(arg0, 250);
        int var6 = Statics.field384.method5205(arg0, 250) * 13;
        class324.method5468(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class324.method5466(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field384.method5211(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1928(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2396.method767(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field825; var11++) {
            if (field832[var11] + field712[var11] > var7 && field712[var11] < var7 + var9 && field849[var11] + field833[var11] > var8 && field849[var11] < var8 + var10) {
                field828[var11] = true;
            }
        }
    }

    @ObfuscatedName("ad.gf(IIIII)V")
    public static final void method662(int arg0, int arg1, int arg2, int arg3) {
        field720++;
        method4120();
        method292();
        method5124();
        method3134(true);
        int var4 = class90.field1225;
        int[] var5 = class90.field1238;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field636 != var5[var6] && field843 != var5[var6]) {
                method541(field738[var5[var6]], true);
            }
        }
        method3134(false);
        for (class87 var7 = (class87) field861.method4856(); var7 != null; var7 = (class87) field861.method4858()) {
            if (Statics.field1394 != var7.field1186 || field633 > var7.field1190) {
                var7.method3306();
            } else if (field633 >= var7.field1189) {
                if (var7.field1208 > 0) {
                    class80 var8 = field664[var7.field1208 - 1];
                    if (var8 != null && var8.field957 >= 0 && var8.field957 < 13312 && var8.field916 >= 0 && var8.field916 < 13312) {
                        var7.method1900(var8.field957, var8.field916, method520(var8.field957, var8.field916, var7.field1186) - var7.field1188, field633);
                    }
                }
                if (var7.field1208 < 0) {
                    int var9 = -var7.field1208 - 1;
                    class67 var10;
                    if (field843 == var9) {
                        var10 = Statics.field389;
                    } else {
                        var10 = field738[var9];
                    }
                    if (var10 != null && var10.field957 >= 0 && var10.field957 < 13312 && var10.field916 >= 0 && var10.field916 < 13312) {
                        var7.method1900(var10.field957, var10.field916, method520(var10.field957, var10.field916, var7.field1186) - var7.field1188, field633);
                    }
                }
                var7.method1906(field684);
                Statics.field582.method2952(Statics.field1394, (int) var7.field1195, (int) var7.field1196, (int) var7.field1197, 60, var7, var7.field1203, -1L, false);
            }
        }
        for (class78 var11 = (class78) field881.method4856(); var11 != null; var11 = (class78) field881.method4858()) {
            if (Statics.field1394 != var11.field1079 || var11.field1076) {
                var11.method3306();
            } else if (field633 >= var11.field1078) {
                var11.method1817(field684);
                if (var11.field1076) {
                    var11.method3306();
                } else {
                    Statics.field582.method2952(var11.field1079, var11.field1080, var11.field1085, var11.field1081, 60, var11, 0, -1L, false);
                }
            }
        }
        method5182(arg0, arg1, arg2, arg3, true);
        int var12 = field793;
        int var13 = field846;
        int var14 = field882;
        int var15 = field883;
        class324.method5506(var12, var13, var12 + var14, var13 + var15);
        class131.method2766();
        if (!field742) {
            int var16 = field693;
            if (field708 / 256 > var16) {
                var16 = field708 / 256;
            }
            if (field867[4] && field769[4] + 128 > var16) {
                var16 = field769[4] + 128;
            }
            int var17 = field692 & 0x7FF;
            int var18 = Statics.field474;
            int var19 = Statics.field569;
            int var20 = Statics.field557;
            int var21 = var16 * 3 + 600;
            int var23 = method1038(var21, var15);
            int var24 = 2048 - var16 & 0x7FF;
            int var25 = 2048 - var17 & 0x7FF;
            int var26 = 0;
            int var27 = 0;
            int var28 = var23;
            if (var24 != 0) {
                int var29 = class131.field1757[var24];
                int var30 = class131.field1760[var24];
                int var31 = var27 * var30 - var23 * var29 >> 16;
                var28 = var27 * var29 + var23 * var30 >> 16;
                var27 = var31;
            }
            if (var25 != 0) {
                int var32 = class131.field1757[var25];
                int var33 = class131.field1760[var25];
                int var34 = var26 * var33 + var28 * var32 >> 16;
                var28 = var28 * var33 - var26 * var32 >> 16;
                var26 = var34;
            }
            Statics.field350 = var18 - var26;
            Statics.field35 = var19 - var27;
            Statics.field63 = var20 - var28;
            Statics.field114 = var16;
            Statics.field2551 = var17;
            if (field778 == 1 && field791 >= 2 && field633 % 50 == 0 && (Statics.field474 >> 7 != Statics.field389.field957 >> 7 || Statics.field557 >> 7 != Statics.field389.field916 >> 7)) {
                int var35 = Statics.field389.field608;
                int var36 = (Statics.field474 >> 7) + Statics.field405;
                int var37 = (Statics.field557 >> 7) + Statics.field1088;
                class192 var38 = class192.method1750(class189.field2264, field669.field1284);
                var38.field2356.method3508(field704);
                var38.field2356.method3452(var37);
                var38.field2356.method3444(var35);
                var38.field2356.method3402(var36);
                field669.method2056(var38);
            }
        }
        int var39;
        if (field742) {
            var39 = method1883();
        } else {
            var39 = method114();
        }
        int var40 = Statics.field350;
        int var41 = Statics.field35;
        int var42 = Statics.field63;
        int var43 = Statics.field114;
        int var44 = Statics.field2551;
        for (int var45 = 0; var45 < 5; var45++) {
            if (field867[var45]) {
                int var46 = (int) (Math.random() * (double) (field868[var45] * 2 + 1) - (double) field868[var45] + Math.sin((double) field870[var45] / 100.0D * (double) field871[var45]) * (double) field769[var45]);
                if (var45 == 0) {
                    Statics.field350 += var46;
                }
                if (var45 == 1) {
                    Statics.field35 += var46;
                }
                if (var45 == 2) {
                    Statics.field63 += var46;
                }
                if (var45 == 3) {
                    Statics.field2551 = Statics.field2551 + var46 & 0x7FF;
                }
                if (var45 == 4) {
                    Statics.field114 += var46;
                    if (Statics.field114 < 128) {
                        Statics.field114 = 128;
                    }
                    if (Statics.field114 > 383) {
                        Statics.field114 = 383;
                    }
                }
            }
        }
        int var47 = class54.field456;
        int var48 = class54.field463;
        if (class54.field469 != 0) {
            var47 = class54.field462;
            var48 = class54.field475;
        }
        if (var47 >= var12 && var47 < var12 + var14 && var48 >= var13 && var48 < var13 + var15) {
            int var49 = var47 - var12;
            int var50 = var48 - var13;
            class129.field1714 = var49;
            class129.field1726 = var50;
            class129.field1724 = true;
            class129.field1725 = 0;
            class129.field1716 = false;
        } else {
            class129.field1724 = false;
            class129.field1725 = 0;
        }
        method146();
        class324.method5468(var12, var13, var14, var15, 0);
        method146();
        int var51 = class131.field1745;
        class131.field1745 = field645;
        Statics.field582.method2853(Statics.field350, Statics.field35, Statics.field63, Statics.field114, Statics.field2551, var39);
        class131.field1745 = var51;
        method146();
        Statics.field582.method2827();
        Statics.method2988(var12, var13, var14, var15);
        method119(var12, var13);
        ((class120) Statics.field1759).method2525(field684);
        field710 = 0;
        int var52 = (Statics.field389.field957 >> 7) + Statics.field405;
        int var53 = (Statics.field389.field916 >> 7) + Statics.field1088;
        if (var52 >= 3053 && var52 <= 3156 && var53 >= 3056 && var53 <= 3136) {
            field710 = 1;
        }
        if (var52 >= 3072 && var52 <= 3118 && var53 >= 9492 && var53 <= 9535) {
            field710 = 1;
        }
        if (field710 == 1 && var52 >= 3139 && var52 <= 3199 && var53 >= 3008 && var53 <= 3062) {
            field710 = 0;
        }
        Statics.field350 = var40;
        Statics.field35 = var41;
        Statics.field63 = var42;
        Statics.field114 = var43;
        Statics.field2551 = var44;
        if (field862) {
            byte var54 = 0;
            int var55 = class248.field3248 + class248.field3242 + var54;
            if (var55 == 0) {
                field862 = false;
            }
        }
        if (field862) {
            class324.method5468(var12, var13, var14, var15, 0);
            method1535(class236.field2852, false);
        }
    }

    @ObfuscatedName("kx.gg(IIIIZI)V")
    public static final void method5182(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field872;
        } else if (var5 >= 100) {
            var6 = field632;
        } else {
            var6 = (field632 - field872) * var5 / 100 + field872;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field878) {
            short var8 = field878;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field877) {
                var6 = field877;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class324.method5459();
                    class324.method5468(arg0, arg1, var10, arg3, -16777216);
                    class324.method5468(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field879) {
            short var11 = field879;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field892) {
                var6 = field892;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class324.method5459();
                    class324.method5468(arg0, arg1, arg2, var13, -16777216);
                    class324.method5468(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field645 = arg3 * var6 / 334;
        if (field882 != arg2 || field883 != arg3) {
            method1045(arg2, arg3);
        }
        field793 = arg0;
        field846 = arg1;
        field882 = arg2;
        field883 = arg3;
    }

    @ObfuscatedName("hz.gq(B)V")
    public static void method4120() {
        if (Statics.field389.field957 >> 7 == field714 && Statics.field389.field916 >> 7 == field853) {
            field714 = 0;
        }
    }

    @ObfuscatedName("v.gd(I)V")
    public static void method292() {
        if (field779) {
            method541(Statics.field389, false);
        }
    }

    @ObfuscatedName("kd.go(I)V")
    public static void method5124() {
        if (field636 >= 0 && field738[field636] != null) {
            method541(field738[field636], false);
        }
    }

    @ObfuscatedName("aw.gk(Lbr;ZI)V")
    public static void method541(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1109() || arg0.field587) {
            return;
        }
        arg0.field605 = false;
        if ((field626 && class90.field1225 > 50 || class90.field1225 > 200) && arg1 && arg0.field962 == arg0.field945) {
            arg0.field605 = true;
        }
        int var2 = arg0.field957 >> 7;
        int var3 = arg0.field916 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class129.method5179(0, 0, 0, false, arg0.field609);
        if (arg0.field600 != null && field633 >= arg0.field595 && field633 < arg0.field596) {
            arg0.field605 = false;
            arg0.field601 = method520(arg0.field957, arg0.field916, Statics.field1394);
            arg0.field937 = field633;
            Statics.field582.method2825(Statics.field1394, arg0.field957, arg0.field916, arg0.field601, 60, arg0, arg0.field917, var4, arg0.field606, arg0.field594, arg0.field603, arg0.field602);
            return;
        }
        if ((arg0.field957 & 0x7F) == 64 && (arg0.field916 & 0x7F) == 64) {
            if (field720 == field719[var2][var3]) {
                return;
            }
            field719[var2][var3] = field720;
        }
        arg0.field601 = method520(arg0.field957, arg0.field916, Statics.field1394);
        arg0.field937 = field633;
        Statics.field582.method2952(Statics.field1394, arg0.field957, arg0.field916, arg0.field601, 60, arg0, arg0.field917, var4, arg0.field918);
    }

    @ObfuscatedName("fh.gy(ZB)V")
    public static final void method3134(boolean arg0) {
        for (int var1 = 0; var1 < field665; var1++) {
            class80 var2 = field664[field666[var1]];
            if (var2 != null && var2.method1109() && var2.field1097.field3558 == arg0 && var2.field1097.method4740()) {
                int var3 = var2.field957 >> 7;
                int var4 = var2.field916 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field919 == 1 && (var2.field957 & 0x7F) == 64 && (var2.field916 & 0x7F) == 64) {
                        if (field720 == field719[var3][var4]) {
                            continue;
                        }
                        field719[var3][var4] = field720;
                    }
                    long var5 = class129.method5179(0, 0, 1, !var2.field1097.field3566, field666[var1]);
                    var2.field937 = field633;
                    Statics.field582.method2952(Statics.field1394, var2.field957, var2.field916, method520(var2.field957 + (var2.field919 * 64 - 64), var2.field916 + (var2.field919 * 64 - 64), Statics.field1394), var2.field919 * 64 - 64 + 60, var2, var2.field917, var5, var2.field918);
                }
            }
        }
    }

    @ObfuscatedName("d.gz(I)I")
    public static final int method114() {
        if (Statics.field3868.field1022) {
            return Statics.field1394;
        }
        int var0 = 3;
        if (Statics.field114 < 310) {
            int var1;
            int var2;
            if (field778 == 1) {
                var1 = Statics.field474 >> 7;
                var2 = Statics.field557 >> 7;
            } else {
                var1 = Statics.field389.field957 >> 7;
                var2 = Statics.field389.field916 >> 7;
            }
            int var3 = Statics.field350 >> 7;
            int var4 = Statics.field63 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field1394;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1394;
            }
            if ((class56.field481[Statics.field1394][var3][var4] & 0x4) != 0) {
                var0 = Statics.field1394;
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
                    if ((class56.field481[Statics.field1394][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1394;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class56.field481[Statics.field1394][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1394;
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
                    if ((class56.field481[Statics.field1394][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1394;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class56.field481[Statics.field1394][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1394;
                        }
                    }
                }
            }
        }
        if (Statics.field389.field957 >= 0 && Statics.field389.field916 >= 0 && Statics.field389.field957 < 13312 && Statics.field389.field916 < 13312) {
            if ((class56.field481[Statics.field1394][Statics.field389.field957 >> 7][Statics.field389.field916 >> 7] & 0x4) != 0) {
                var0 = Statics.field1394;
            }
            return var0;
        } else {
            return Statics.field1394;
        }
    }

    @ObfuscatedName("cu.gm(B)I")
    public static final int method1883() {
        if (Statics.field3868.field1022) {
            return Statics.field1394;
        } else {
            int var0 = method520(Statics.field350, Statics.field63, Statics.field1394);
            return var0 - Statics.field35 >= 800 || (class56.field481[Statics.field1394][Statics.field350 >> 7][Statics.field63 >> 7] & 0x4) == 0 ? 3 : Statics.field1394;
        }
    }

    @ObfuscatedName("d.gv(III)V")
    public static final void method119(int arg0, int arg1) {
        if (field821 == 2) {
            method384((field644 - Statics.field405 << 7) + field648, (field886 - Statics.field1088 << 7) + field876, field884 * 2);
            if (field725 > -1 && field633 % 20 < 10) {
                Statics.field615[0].method5584(field725 + arg0 - 12, field722 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("a.gt(I)Z")
    public static boolean method152() {
        return (field686 & 0x8) != 0;
    }

    @ObfuscatedName("at.gr(Lbz;IIIIIB)V")
    public static final void method624(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1109()) {
            return;
        }
        if (arg0 instanceof class80) {
            class268 var6 = ((class80) arg0).field1097;
            if (var6.field3563 != null) {
                var6 = var6.method4713();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class90.field1225;
        int[] var8 = class90.field1238;
        byte var9 = 0;
        if (arg1 < var7 && field633 == arg0.field937) {
            class67 var10 = (class67) arg0;
            boolean var11;
            if (field686 == 0) {
                var11 = false;
            } else if (Statics.field389 == var10) {
                var11 = method152();
            } else {
                boolean var12 = (field686 & 0x4) != 0;
                boolean var13 = var12;
                if (!var12) {
                    boolean var14 = (field686 & 0x1) != 0;
                    var13 = var14 && var10.method1098();
                }
                boolean var15 = var13;
                if (!var13) {
                    boolean var16 = (field686 & 0x2) != 0;
                    var15 = var16 && var10.method1108();
                }
                var11 = var15;
            }
            if (var11) {
                class67 var17 = (class67) arg0;
                if (arg1 < var7) {
                    method702(arg0, arg0.field966 + 15);
                    class303 var18 = (class303) field674.get(class299.field3736);
                    byte var19 = 9;
                    var18.method5210(var17.field599.method5136(), field725 + arg2, field722 + arg3 - var19, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var20 = -2;
        if (!arg0.field941.method4834()) {
            method702(arg0, arg0.field966 + 15);
            for (class79 var21 = (class79) arg0.field941.method4823(); var21 != null; var21 = (class79) arg0.field941.method4825()) {
                class71 var22 = var21.method1822(field633);
                if (var22 != null) {
                    class258 var23 = var21.field1092;
                    class328 var24 = var23.method4468();
                    class328 var25 = var23.method4469();
                    int var26 = 0;
                    int var27;
                    if (var24 == null || var25 == null) {
                        var27 = var23.field3365;
                    } else {
                        if (var23.field3355 * 2 < var25.field3897) {
                            var26 = var23.field3355;
                        }
                        var27 = var25.field3897 - var26 * 2;
                    }
                    int var28 = 255;
                    boolean var29 = true;
                    int var30 = field633 - var22.field983;
                    int var31 = var22.field979 * var27 / var23.field3365;
                    int var34;
                    if (var22.field980 > var30) {
                        int var32 = var23.field3361 == 0 ? 0 : var30 / var23.field3361 * var23.field3361;
                        int var33 = var22.field978 * var27 / var23.field3365;
                        var34 = (var31 - var33) * var32 / var22.field980 + var33;
                    } else {
                        var34 = var31;
                        int var35 = var22.field980 + var23.field3362 - var30;
                        if (var23.field3360 >= 0) {
                            var28 = (var35 << 8) / (var23.field3362 - var23.field3360);
                        }
                    }
                    if (var22.field979 > 0 && var34 < 1) {
                        var34 = 1;
                    }
                    if (var24 == null || var25 == null) {
                        var20 += 5;
                        if (field725 > -1) {
                            int var41 = field725 + arg2 - (var27 >> 1);
                            int var42 = field722 + arg3 - var20;
                            class324.method5468(var41, var42, var34, 5, 65280);
                            class324.method5468(var34 + var41, var42, var27 - var34, 5, 16711680);
                        }
                        var20 += 2;
                    } else {
                        int var36;
                        if (var27 == var34) {
                            var36 = var26 * 2 + var34;
                        } else {
                            var36 = var26 + var34;
                        }
                        int var37 = var24.field3904;
                        var20 += var37;
                        int var38 = field725 + arg2 - (var27 >> 1);
                        int var39 = field722 + arg3 - var20;
                        int var40 = var38 - var26;
                        if (var28 >= 0 && var28 < 255) {
                            var24.method5589(var40, var39, var28);
                            class324.method5461(var40, var39, var36 + var40, var37 + var39);
                            var25.method5589(var40, var39, var28);
                        } else {
                            var24.method5584(var40, var39);
                            class324.method5461(var40, var39, var36 + var40, var37 + var39);
                            var25.method5584(var40, var39);
                        }
                        class324.method5506(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var20 += 2;
                    }
                } else if (var21.method1819()) {
                    var21.method3306();
                }
            }
        }
        if (var20 == -2) {
            var20 += 7;
        }
        int var43 = var9 + var20;
        if (arg1 < var7) {
            class67 var44 = (class67) arg0;
            if (var44.field587) {
                return;
            }
            if (var44.field614 != -1 || var44.field590 != -1) {
                method702(arg0, arg0.field966 + 15);
                if (field725 > -1) {
                    if (var44.field614 != -1) {
                        var43 += 25;
                        Statics.field78[var44.field614].method5584(field725 + arg2 - 12, field722 + arg3 - var43);
                    }
                    if (var44.field590 != -1) {
                        var43 += 25;
                        Statics.field1032[var44.field590].method5584(field725 + arg2 - 12, field722 + arg3 - var43);
                    }
                }
            }
            if (arg1 >= 0 && field821 == 10 && field643 == var8[arg1]) {
                method702(arg0, arg0.field966 + 15);
                if (field725 > -1) {
                    int var45 = Statics.field615[1].field3904 + var43;
                    Statics.field615[1].method5584(field725 + arg2 - 12, field722 + arg3 - var45);
                }
            }
        } else {
            class268 var46 = ((class80) arg0).field1097;
            if (var46.field3563 != null) {
                var46 = var46.method4713();
            }
            if (var46.field3533 >= 0 && var46.field3533 < Statics.field1032.length) {
                method702(arg0, arg0.field966 + 15);
                if (field725 > -1) {
                    Statics.field1032[var46.field3533].method5584(field725 + arg2 - 12, field722 + arg3 - 30);
                }
            }
            if (field821 == 1 && field817 == field666[arg1 - var7] && field633 % 20 < 10) {
                method702(arg0, arg0.field966 + 15);
                if (field725 > -1) {
                    Statics.field615[0].method5584(field725 + arg2 - 12, field722 + arg3 - 28);
                }
            }
        }
        if (arg0.field929 != null && (arg1 >= var7 || !arg0.field931 && (field838 == 4 || !arg0.field930 && (field838 == 0 || field838 == 3 || field838 == 1 && ((class67) arg0).method1098())))) {
            method702(arg0, arg0.field966);
            if (field725 > -1 && field709 < field891) {
                field689[field709] = Statics.field12.method5202(arg0.field929) / 2;
                field713[field709] = Statics.field12.field3762;
                field782[field709] = field725;
                field638[field709] = field722;
                field835[field709] = arg0.field974;
                field716[field709] = arg0.field968;
                field836[field709] = arg0.field932;
                field718[field709] = arg0.field929;
                field709++;
            }
        }
        for (int var47 = 0; var47 < 4; var47++) {
            int var48 = arg0.field938[var47];
            int var49 = arg0.field936[var47];
            class264 var50 = null;
            int var51 = 0;
            if (var49 >= 0) {
                if (var48 <= field633) {
                    continue;
                }
                var50 = class264.method1627(arg0.field936[var47]);
                var51 = var50.field3407;
                if (var50 != null && var50.field3418 != null) {
                    var50 = var50.method4559();
                    if (var50 == null) {
                        arg0.field938[var47] = -1;
                        continue;
                    }
                }
            } else if (var48 < 0) {
                continue;
            }
            int var52 = arg0.field939[var47];
            class264 var53 = null;
            if (var52 >= 0) {
                var53 = class264.method1627(var52);
                if (var53 != null && var53.field3418 != null) {
                    var53 = var53.method4559();
                }
            }
            if (var48 - var51 <= field633) {
                if (var50 == null) {
                    arg0.field938[var47] = -1;
                } else {
                    method702(arg0, arg0.field966 / 2);
                    if (field725 > -1) {
                        if (var47 == 1) {
                            field722 -= 20;
                        }
                        if (var47 == 2) {
                            field725 -= 15;
                            field722 -= 10;
                        }
                        if (var47 == 3) {
                            field725 += 15;
                            field722 -= 10;
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
                        class328 var66 = null;
                        class328 var67 = null;
                        class328 var68 = null;
                        class328 var69 = null;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        class328 var79 = var50.method4553();
                        if (var79 != null) {
                            var58 = var79.field3897;
                            int var80 = var79.field3904;
                            if (var80 > var78) {
                                var78 = var80;
                            }
                            var62 = var79.field3906;
                        }
                        class328 var81 = var50.method4554();
                        if (var81 != null) {
                            var59 = var81.field3897;
                            int var82 = var81.field3904;
                            if (var82 > var78) {
                                var78 = var82;
                            }
                            var63 = var81.field3906;
                        }
                        class328 var83 = var50.method4555();
                        if (var83 != null) {
                            var60 = var83.field3897;
                            int var84 = var83.field3904;
                            if (var84 > var78) {
                                var78 = var84;
                            }
                            var64 = var83.field3906;
                        }
                        class328 var85 = var50.method4548();
                        if (var85 != null) {
                            var61 = var85.field3897;
                            int var86 = var85.field3904;
                            if (var86 > var78) {
                                var78 = var86;
                            }
                            var65 = var85.field3906;
                        }
                        if (var53 != null) {
                            var66 = var53.method4553();
                            if (var66 != null) {
                                var70 = var66.field3897;
                                int var87 = var66.field3904;
                                if (var87 > var78) {
                                    var78 = var87;
                                }
                                var74 = var66.field3906;
                            }
                            var67 = var53.method4554();
                            if (var67 != null) {
                                var71 = var67.field3897;
                                int var88 = var67.field3904;
                                if (var88 > var78) {
                                    var78 = var88;
                                }
                                var75 = var67.field3906;
                            }
                            var68 = var53.method4555();
                            if (var68 != null) {
                                var72 = var68.field3897;
                                int var89 = var68.field3904;
                                if (var89 > var78) {
                                    var78 = var89;
                                }
                                var76 = var68.field3906;
                            }
                            var69 = var53.method4548();
                            if (var69 != null) {
                                var73 = var69.field3897;
                                int var90 = var69.field3904;
                                if (var90 > var78) {
                                    var78 = var90;
                                }
                                var77 = var69.field3906;
                            }
                        }
                        class302 var91 = var50.method4557();
                        if (var91 == null) {
                            var91 = Statics.field543;
                        }
                        class302 var92;
                        if (var53 == null) {
                            var92 = Statics.field543;
                        } else {
                            var92 = var53.method4557();
                            if (var92 == null) {
                                var92 = Statics.field543;
                            }
                        }
                        Object var93 = null;
                        String var94 = null;
                        boolean var95 = false;
                        int var96 = 0;
                        String var97 = var50.method4552(arg0.field950[var47]);
                        int var98 = var91.method5202(var97);
                        if (var53 != null) {
                            var94 = var53.method4552(arg0.field940[var47]);
                            var96 = var92.method5202(var94);
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
                        if (var53 != null && var71 > 0) {
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
                        if (var53 != null) {
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
                        int var115 = arg0.field938[var47] - field633;
                        int var116 = var50.field3401 - var50.field3401 * var115 / var50.field3407;
                        int var117 = var50.field3413 * var115 / var50.field3407 + -var50.field3413;
                        int var118 = field725 + arg2 - (var107 >> 1) + var116;
                        int var119 = field722 + arg3 - 12 + var117;
                        int var120 = var119;
                        int var121 = var78 + var119;
                        int var122 = var50.field3417 + var119 + 15;
                        int var123 = var122 - var91.field3763;
                        int var124 = var91.field3761 + var122;
                        if (var123 < var119) {
                            var120 = var123;
                        }
                        if (var124 > var121) {
                            var121 = var124;
                        }
                        int var125 = 0;
                        if (var53 != null) {
                            var125 = var53.field3417 + var119 + 15;
                            int var126 = var125 - var92.field3763;
                            int var127 = var92.field3761 + var125;
                            if (var126 < var120) {
                                ;
                            }
                            if (var127 > var121) {
                                ;
                            }
                        }
                        int var130 = 255;
                        if (var50.field3414 >= 0) {
                            var130 = (var115 << 8) / (var50.field3407 - var50.field3414);
                        }
                        if (var130 >= 0 && var130 < 255) {
                            if (var79 != null) {
                                var79.method5589(var102 + var118 - var62, var119, var130);
                            }
                            if (var83 != null) {
                                var83.method5589(var103 + var118 - var64, var119, var130);
                            }
                            if (var81 != null) {
                                for (int var131 = 0; var131 < var99; var131++) {
                                    var81.method5589(var59 * var131 + (var104 + var118 - var63), var119, var130);
                                }
                            }
                            if (var85 != null) {
                                var85.method5589(var108 + var118 - var65, var119, var130);
                            }
                            var91.method5208(var97, var105 + var118, var122, var50.field3406, 0, var130);
                            if (var53 != null) {
                                if (var66 != null) {
                                    var66.method5589(var109 + var118 - var74, var119, var130);
                                }
                                if (var68 != null) {
                                    var68.method5589(var110 + var118 - var76, var119, var130);
                                }
                                if (var67 != null) {
                                    for (int var132 = 0; var132 < var100; var132++) {
                                        var67.method5589(var71 * var132 + (var111 + var118 - var75), var119, var130);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method5589(var112 + var118 - var77, var119, var130);
                                }
                                var92.method5208(var94, var113 + var118, var125, var53.field3406, 0, var130);
                            }
                        } else {
                            if (var79 != null) {
                                var79.method5584(var102 + var118 - var62, var119);
                            }
                            if (var83 != null) {
                                var83.method5584(var103 + var118 - var64, var119);
                            }
                            if (var81 != null) {
                                for (int var133 = 0; var133 < var99; var133++) {
                                    var81.method5584(var59 * var133 + (var104 + var118 - var63), var119);
                                }
                            }
                            if (var85 != null) {
                                var85.method5584(var108 + var118 - var65, var119);
                            }
                            var91.method5207(var97, var105 + var118, var122, var50.field3406 | 0xFF000000, 0);
                            if (var53 != null) {
                                if (var66 != null) {
                                    var66.method5584(var109 + var118 - var74, var119);
                                }
                                if (var68 != null) {
                                    var68.method5584(var110 + var118 - var76, var119);
                                }
                                if (var67 != null) {
                                    for (int var134 = 0; var134 < var100; var134++) {
                                        var67.method5584(var71 * var134 + (var111 + var118 - var75), var119);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method5584(var112 + var118 - var77, var119);
                                }
                                var92.method5207(var94, var113 + var118, var125, var53.field3406 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.ga(Lbz;II)V")
    public static final void method702(class70 arg0, int arg1) {
        method384(arg0.field957, arg0.field916, arg1);
    }

    @ObfuscatedName("aj.gx(IIII)V")
    public static final void method384(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field725 = -1;
            field722 = -1;
            return;
        }
        int var3 = method520(arg0, arg1, Statics.field1394) - arg2;
        int var4 = arg0 - Statics.field350;
        int var5 = var3 - Statics.field35;
        int var6 = arg1 - Statics.field63;
        int var7 = class131.field1757[Statics.field114];
        int var8 = class131.field1760[Statics.field114];
        int var9 = class131.field1757[Statics.field2551];
        int var10 = class131.field1760[Statics.field2551];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field725 = field645 * var11 / var15 + field882 / 2;
            field722 = field645 * var14 / var15 + field883 / 2;
        } else {
            field725 = -1;
            field722 = -1;
        }
    }

    @ObfuscatedName("ay.gu(IIII)I")
    public static final int method520(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class56.field481[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class56.field494[var5][var3][var4] + class56.field494[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field494[var5][var3][var4 + 1] + class56.field494[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("by.gj(III)I")
    public static int method1038(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field875 - field874) * var2 / 100 + field874;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("cf.hx(IIZI)V")
    public static final void method2037(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1910 == arg0 && Statics.field101 == arg1) {
            return;
        }
        Statics.field1910 = arg0;
        Statics.field101 = arg1;
        method906(25);
        method1535(class236.field2852, true);
        int var3 = Statics.field405;
        int var4 = Statics.field1088;
        Statics.field405 = (arg0 - 6) * 8;
        Statics.field1088 = (arg1 - 6) * 8;
        int var5 = Statics.field405 - var3;
        int var6 = Statics.field1088 - var4;
        int var7 = Statics.field405;
        int var8 = Statics.field1088;
        for (int var9 = 0; var9 < 32768; var9++) {
            class80 var10 = field664[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field953[var11] -= var5;
                    var10.field935[var11] -= var6;
                }
                var10.field957 -= var5 * 128;
                var10.field916 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field738[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field953[var14] -= var5;
                    var13.field935[var14] -= var6;
                }
                var13.field957 -= var5 * 128;
                var13.field916 -= var6 * 128;
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
                        field893[var25][var21][var22] = field893[var25][var23][var24];
                    } else {
                        field893[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field751.method4856(); var26 != null; var26 = (class69) field751.method4858()) {
            var26.field914 -= var5;
            var26.field902 -= var6;
            if (var26.field914 < 0 || var26.field902 < 0 || var26.field914 >= 104 || var26.field902 >= 104) {
                var26.method3306();
            }
        }
        if (field714 != 0) {
            field714 -= var5;
            field853 -= var6;
        }
        field860 = 0;
        field742 = false;
        Statics.field350 -= var5 << 7;
        Statics.field63 -= var6 << 7;
        Statics.field474 -= var5 << 7;
        Statics.field557 -= var6 << 7;
        field847 = -1;
        field881.method4850();
        field861.method4850();
        for (int var27 = 0; var27 < 4; var27++) {
            field854[var27].method3257();
        }
    }

    @ObfuscatedName("eg.hn(ZI)V")
    public static final void method3070(boolean arg0) {
        method146();
        field669.field1294++;
        if (field669.field1294 < 50 && !arg0) {
            return;
        }
        field669.field1294 = 0;
        if (field852 || field669.method2061() == null) {
            return;
        }
        class192 var1 = class192.method1750(class189.field2252, field669.field1284);
        field669.method2056(var1);
        try {
            field669.method2071();
        } catch (IOException var3) {
            field852 = true;
        }
    }

    @ObfuscatedName("bu.hr(IIIIIB)V")
    public static final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field582.method2839(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field582.method2968(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field538.field3900;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class129.method4558(var5);
            class265 var17 = class265.method763(var16);
            if (var17.field3451 == -1) {
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
                class327 var18 = Statics.field2366[var17.field3451];
                if (var18 != null) {
                    int var19 = (var17.field3437 * 4 - var18.field3892) / 2;
                    int var20 = (var17.field3465 * 4 - var18.field3888) / 2;
                    var18.method5552(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field3465) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field582.method2883(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field582.method2968(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class129.method4558(var21);
            class265 var27 = class265.method763(var26);
            if (var27.field3451 != -1) {
                class327 var28 = Statics.field2366[var27.field3451];
                if (var28 != null) {
                    int var29 = (var27.field3437 * 4 - var28.field3892) / 2;
                    int var30 = (var27.field3465 * 4 - var28.field3888) / 2;
                    var28.method5552(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field3465) * 4 + 48 + var30);
                }
            } else if (var25 == 9) {
                int var31 = 15658734;
                boolean var32 = var21 != 0L;
                if (var32) {
                    boolean var33 = (int) (var21 >>> 16 & 0x1L) == 1;
                    var32 = !var33;
                }
                if (var32) {
                    var31 = 15597568;
                }
                int[] var35 = Statics.field538.field3900;
                int var36 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var24 == 0 || var24 == 2) {
                    var35[var36 + 1536] = var31;
                    var35[var36 + 1024 + 1] = var31;
                    var35[var36 + 512 + 2] = var31;
                    var35[var36 + 3] = var31;
                } else {
                    var35[var36] = var31;
                    var35[var36 + 512 + 1] = var31;
                    var35[var36 + 1024 + 2] = var31;
                    var35[var36 + 1536 + 3] = var31;
                }
            }
        }
        long var37 = Statics.field582.method2948(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class129.method4558(var37);
        class265 var40 = class265.method763(var39);
        if (var40.field3451 == -1) {
            return;
        }
        class327 var41 = Statics.field2366[var40.field3451];
        if (var41 != null) {
            int var42 = (var40.field3437 * 4 - var41.field3892) / 2;
            int var43 = (var40.field3465 * 4 - var41.field3888) / 2;
            var41.method5552(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field3465) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.hg(Lcl;I)Z")
    public final boolean method1421(class96 arg0) {
        class171 var2 = arg0.method2061();
        class209 var3 = arg0.field1289;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1285 == null) {
                if (arg0.field1292) {
                    if (!var2.method3174(1)) {
                        return false;
                    }
                    var2.method3180(arg0.field1289.field2440, 0, 1);
                    arg0.field1293 = 0;
                    arg0.field1292 = false;
                }
                var3.field2439 = 0;
                if (var3.method3687()) {
                    if (!var2.method3174(1)) {
                        return false;
                    }
                    var2.method3180(arg0.field1289.field2440, 1, 1);
                    arg0.field1293 = 0;
                }
                arg0.field1292 = true;
                class188[] var4 = class188.method372();
                int var5 = var3.method3688();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2439);
                }
                arg0.field1285 = var4[var5];
                arg0.field1297 = arg0.field1285.field2163;
            }
            if (arg0.field1297 == -1) {
                if (!var2.method3174(1)) {
                    return false;
                }
                arg0.method2061().method3180(var3.field2440, 0, 1);
                arg0.field1297 = var3.field2440[0] & 0xFF;
            }
            if (arg0.field1297 == -2) {
                if (!var2.method3174(2)) {
                    return false;
                }
                arg0.method2061().method3180(var3.field2440, 0, 2);
                var3.field2439 = 0;
                arg0.field1297 = var3.method3530();
            }
            if (!var2.method3174(arg0.field1297)) {
                return false;
            }
            var3.field2439 = 0;
            var2.method3180(var3.field2440, 0, arg0.field1297);
            arg0.field1293 = 0;
            field673.method4946();
            arg0.field1288 = arg0.field1296;
            arg0.field1296 = arg0.field1295;
            arg0.field1295 = arg0.field1285;
            if (class188.field2212 == arg0.field1285) {
                method172(class191.field2345);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2217 == arg0.field1285) {
                field742 = true;
                Statics.field24 = var3.method3551();
                Statics.field2589 = var3.method3551();
                Statics.field282 = var3.method3530();
                Statics.field2332 = var3.method3551();
                Statics.field252 = var3.method3551();
                if (Statics.field252 >= 100) {
                    Statics.field350 = Statics.field24 * 128 + 64;
                    Statics.field63 = Statics.field2589 * 128 + 64;
                    Statics.field35 = method520(Statics.field350, Statics.field63, Statics.field1394) - Statics.field282;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2222 == arg0.field1285) {
                for (int var6 = 0; var6 < field738.length; var6++) {
                    if (field738[var6] != null) {
                        field738[var6].field948 = -1;
                    }
                }
                for (int var7 = 0; var7 < field664.length; var7++) {
                    if (field664[var7] != null) {
                        field664[var7].field948 = -1;
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2159 == arg0.field1285) {
                Statics.field392 = var3.method3404();
                Statics.field191 = var3.method3447();
                while (var3.field2439 < arg0.field1297) {
                    int var8 = var3.method3551();
                    class191 var9 = class191.method3141()[var8];
                    method172(var9);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2203 == arg0.field1285) {
                int var10 = var3.method3420();
                int var11 = var3.method3466();
                class229 var12 = class229.method3345(var11);
                if (var12.field2691 != var10 || var10 == -1) {
                    var12.field2691 = var10;
                    var12.field2771 = 0;
                    var12.field2773 = 0;
                    method272(var12);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2144 == arg0.field1285) {
                int var13 = var3.method3466();
                class229 var14 = class229.method3345(var13);
                var14.field2757 = 3;
                var14.field2688 = Statics.field389.field588.method4032();
                method272(var14);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2143 == arg0.field1285) {
                method2522();
                arg0.field1285 = null;
                return false;
            }
            if (class188.field2149 == arg0.field1285) {
                int var15 = var3.method3465();
                class229 var16 = class229.method3345(var15);
                for (int var17 = 0; var17 < var16.field2768.length; var17++) {
                    var16.field2768[var17] = -1;
                    var16.field2768[var17] = 0;
                }
                method272(var16);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2218 == arg0.field1285) {
                int var18 = var3.method3620();
                int var19 = var3.method3530();
                if (var18 < -70000) {
                    var19 += 32768;
                }
                class229 var20;
                if (var18 >= 0) {
                    var20 = class229.method3345(var18);
                } else {
                    var20 = null;
                }
                if (var20 != null) {
                    for (int var21 = 0; var21 < var20.field2768.length; var21++) {
                        var20.field2768[var21] = 0;
                        var20.field2769[var21] = 0;
                    }
                }
                class60.method4147(var19);
                int var22 = var3.method3530();
                for (int var23 = 0; var23 < var22; var23++) {
                    int var24 = var3.method3530();
                    int var25 = var3.method3551();
                    if (var25 == 255) {
                        var25 = var3.method3466();
                    }
                    if (var20 != null && var23 < var20.field2768.length) {
                        var20.field2768[var23] = var24;
                        var20.field2769[var23] = var25;
                    }
                    class60.method579(var19, var23, var24 - 1, var25);
                }
                if (var20 != null) {
                    method272(var20);
                }
                method142();
                field810[++field768 - 1 & 0x1F] = var19 & 0x7FFF;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2150 == arg0.field1285) {
                method172(class191.field2342);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2195 == arg0.field1285) {
                class323.method3078(var3, arg0.field1297);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2165 == arg0.field1285) {
                Statics.field191 = var3.method3447();
                Statics.field392 = var3.method3404();
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2170 == arg0.field1285) {
                int var26 = var3.method3620();
                boolean var27 = var3.method3551() == 1;
                class229 var28 = class229.method3345(var26);
                if (var28.field2664 != var27) {
                    var28.field2664 = var27;
                    method272(var28);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2162 == arg0.field1285) {
                byte var29 = var3.method3449();
                int var30 = var3.method3574();
                class224.field2600[var30] = var29;
                if (class224.field2601[var30] != var29) {
                    class224.field2601[var30] = var29;
                }
                method4292(var30);
                field808[++field809 - 1 & 0x1F] = var30;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2156 == arg0.field1285) {
                method172(class191.field2348);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2172 == arg0.field1285) {
                int var31 = var3.method3551();
                if (var3.method3551() == 0) {
                    field889[var31] = new class10();
                    var3.field2439 += 18;
                } else {
                    var3.field2439--;
                    field889[var31] = new class10(var3, false);
                }
                field677 = field807;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2226 == arg0.field1285) {
                int var32 = var3.method3457();
                field830 = var32;
                this.method1337(false);
                method707(var32);
                class77.method289(field830);
                for (int var33 = 0; var33 < 100; var33++) {
                    field864[var33] = true;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2202 == arg0.field1285) {
                method142();
                field721 = var3.method3551();
                field819 = field807;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2192 == arg0.field1285) {
                int var34 = var3.method3457();
                int var35 = var3.method3457();
                int var36 = var3.method3457();
                int var37 = var3.method3466();
                class229 var38 = class229.method3345(var37);
                if (var38.field2641 != var34 || var38.field2696 != var36 || var38.field2698 != var35) {
                    var38.field2641 = var34;
                    var38.field2696 = var36;
                    var38.field2698 = var35;
                    method272(var38);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2178 == arg0.field1285) {
                field821 = var3.method3551();
                if (field821 == 1) {
                    field817 = var3.method3530();
                }
                if (field821 >= 2 && field821 <= 6) {
                    if (field821 == 2) {
                        field648 = 64;
                        field876 = 64;
                    }
                    if (field821 == 3) {
                        field648 = 0;
                        field876 = 64;
                    }
                    if (field821 == 4) {
                        field648 = 128;
                        field876 = 64;
                    }
                    if (field821 == 5) {
                        field648 = 64;
                        field876 = 0;
                    }
                    if (field821 == 6) {
                        field648 = 64;
                        field876 = 128;
                    }
                    field821 = 2;
                    field644 = var3.method3530();
                    field886 = var3.method3530();
                    field884 = var3.method3551();
                }
                if (field821 == 10) {
                    field643 = var3.method3530();
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2221 == arg0.field1285) {
                class90.method2811(var3, arg0.field1297);
                method1000();
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2214 == arg0.field1285) {
                Statics.method760(false, arg0.field1289);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2183 == arg0.field1285) {
                int var39 = var3.method3574();
                int var40 = var3.method3455();
                int var41 = var3.method3465();
                class229 var42 = class229.method3345(var41);
                var42.field2700 = (var40 << 16) + var39;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2194 == arg0.field1285) {
                if (field830 != -1) {
                    method57(field830, 0);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2171 == arg0.field1285) {
                int var43 = var3.method3620();
                int var44 = var3.method3530();
                if (var44 == 65535) {
                    var44 = -1;
                }
                int var45 = var3.method3466();
                class229 var46 = class229.method3345(var43);
                if (var46.field2643) {
                    var46.field2770 = var44;
                    var46.field2720 = var45;
                    class266 var48 = class266.method4129(var44);
                    var46.field2641 = var48.field3488;
                    var46.field2696 = var48.field3516;
                    var46.field2697 = var48.field3490;
                    var46.field2693 = var48.field3496;
                    var46.field2718 = var48.field3492;
                    var46.field2698 = var48.field3487;
                    if (var48.field3493 == 1) {
                        var46.field2729 = 1;
                    } else {
                        var46.field2729 = 2;
                    }
                    if (var46.field2741 > 0) {
                        var46.field2698 = var46.field2698 * 32 / var46.field2741;
                    } else if (var46.field2655 > 0) {
                        var46.field2698 = var46.field2698 * 32 / var46.field2655;
                    }
                    method272(var46);
                } else if (var44 == -1) {
                    var46.field2757 = 0;
                    arg0.field1285 = null;
                    return true;
                } else {
                    class266 var47 = class266.method4129(var44);
                    var46.field2757 = 4;
                    var46.field2688 = var44;
                    var46.field2641 = var47.field3488;
                    var46.field2696 = var47.field3516;
                    var46.field2698 = var47.field3487 * 100 / var45;
                    method272(var46);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2145 == arg0.field1285) {
                int var49 = var3.method3431();
                boolean var50 = var3.method3551() == 1;
                String var51 = "";
                boolean var52 = false;
                if (var50) {
                    var51 = var3.method3426();
                    if (Statics.field205.method1684(new class295(var51, Statics.field366))) {
                        var52 = true;
                    }
                }
                String var53 = var3.method3426();
                if (!var52) {
                    class92.method202(var49, var51, var53);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2210 == arg0.field1285) {
                Statics.field513 = class311.method4369(var3.method3551());
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2154 == arg0.field1285) {
                method172(class191.field2346);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2158 == arg0.field1285) {
                boolean var54 = var3.method3424();
                if (!var54) {
                    Statics.field3646 = null;
                } else if (Statics.field3646 == null) {
                    Statics.field3646 = new class249();
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2164 == arg0.field1285) {
                int var55 = var3.method3464();
                int var56 = var3.method3574();
                if (var56 == 65535) {
                    var56 = -1;
                }
                int var57 = var3.method3466();
                int var58 = var3.method3530();
                if (var58 == 65535) {
                    var58 = -1;
                }
                for (int var59 = var58; var59 <= var56; var59++) {
                    long var60 = ((long) var57 << 32) + (long) var59;
                    class186 var62 = field824.method5416(var60);
                    if (var62 != null) {
                        var62.method3306();
                    }
                    field824.method5412(new class185(var55), var60);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2205 == arg0.field1285) {
                method32(true, var3);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2187 == arg0.field1285) {
                if (Statics.field1298 != null) {
                    Statics.field1298.method5156(var3);
                }
                Statics.method3067();
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2174 == arg0.field1285) {
                method172(class191.field2347);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2204 == arg0.field1285) {
                String var63 = var3.method3426();
                Object[] var64 = new Object[var63.length() + 1];
                for (int var65 = var63.length() - 1; var65 >= 0; var65--) {
                    if (var63.charAt(var65) == 's') {
                        var64[var65 + 1] = var3.method3426();
                    } else {
                        var64[var65 + 1] = Integer.valueOf(var3.method3620());
                    }
                }
                var64[0] = Integer.valueOf(var3.method3620());
                class63 var66 = new class63();
                var66.field554 = var64;
                class77.method4251(var66);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2168 == arg0.field1285) {
                method172(class191.field2344);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2147 == arg0.field1285) {
                method172(class191.field2351);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2209 == arg0.field1285) {
                field714 = var3.method3551();
                if (field714 == 255) {
                    field714 = 0;
                }
                field853 = var3.method3551();
                if (field853 == 255) {
                    field853 = 0;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2220 == arg0.field1285) {
                for (int var67 = 0; var67 < Statics.field3283; var67++) {
                    class252 var68 = class252.method1002(var67);
                    if (var68 != null) {
                        class224.field2600[var67] = 0;
                        class224.field2601[var67] = 0;
                    }
                }
                method142();
                field809 += 32;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2186 == arg0.field1285) {
                int var69 = var3.method3620();
                int var70 = var3.method3530();
                if (var69 < -70000) {
                    var70 += 32768;
                }
                class229 var71;
                if (var69 >= 0) {
                    var71 = class229.method3345(var69);
                } else {
                    var71 = null;
                }
                while (var3.field2439 < arg0.field1297) {
                    int var72 = var3.method3431();
                    int var73 = var3.method3530();
                    int var74 = 0;
                    if (var73 != 0) {
                        var74 = var3.method3551();
                        if (var74 == 255) {
                            var74 = var3.method3620();
                        }
                    }
                    if (var71 != null && var72 >= 0 && var72 < var71.field2768.length) {
                        var71.field2768[var72] = var73;
                        var71.field2769[var72] = var74;
                    }
                    class60.method579(var70, var72, var73 - 1, var74);
                }
                if (var71 != null) {
                    method272(var71);
                }
                method142();
                field810[++field768 - 1 & 0x1F] = var70 & 0x7FFF;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2197 == arg0.field1285) {
                int var75 = var3.method3530();
                int var76 = var3.method3551();
                int var77 = var3.method3530();
                method5111(var75, var76, var77);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2201 == arg0.field1285) {
                int var78 = var3.method3465();
                int var79 = var3.method3459();
                int var80 = var3.method3458();
                class229 var81 = class229.method3345(var78);
                if (var81.field2653 != var80 || var81.field2654 != var79 || var81.field2633 != 0 || var81.field2650 != 0) {
                    var81.field2653 = var80;
                    var81.field2654 = var79;
                    var81.field2633 = 0;
                    var81.field2650 = 0;
                    method272(var81);
                    this.method1455(var81);
                    if (var81.field2646 == 0) {
                        method620(Statics.field2634[var78 >> 16], var81, false);
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2177 == arg0.field1285) {
                int var82 = var3.method3457();
                int var83 = var3.method3466();
                class229 var84 = class229.method3345(var83);
                if (var84.field2757 != 2 || var84.field2688 != var82) {
                    var84.field2757 = 2;
                    var84.field2688 = var82;
                    method272(var84);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2155 == arg0.field1285) {
                class72 var85 = new class72();
                var85.field988 = var3.method3426();
                var85.field990 = var3.method3530();
                int var86 = var3.method3620();
                var85.field996 = var86;
                method906(45);
                var2.method3179();
                Object var87 = null;
                class86.method515(var85);
                arg0.field1285 = null;
                return false;
            }
            if (class188.field2153 == arg0.field1285) {
                Statics.field205.field1034.method5024(var3, arg0.field1297);
                method4118();
                field815 = field807;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2175 == arg0.field1285) {
                method32(false, var3);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2224 == arg0.field1285) {
                int var88 = var3.method3620();
                int var89 = var3.method3620();
                class62 var90 = (class62) field703.method5416((long) var89);
                class62 var91 = (class62) field703.method5416((long) var88);
                if (var91 != null) {
                    method1849(var91, var90 == null || var90.field539 != var91.field539);
                }
                if (var90 != null) {
                    var90.method3306();
                    field703.method5412(var90, (long) var88);
                }
                class229 var92 = class229.method3345(var89);
                if (var92 != null) {
                    method272(var92);
                }
                class229 var93 = class229.method3345(var88);
                if (var93 != null) {
                    method272(var93);
                    method620(Statics.field2634[var93.field2644 >>> 16], var93, true);
                }
                if (field830 != -1) {
                    method57(field830, 1);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2166 == arg0.field1285) {
                int var94 = var3.method3465();
                int var95 = var3.method3574();
                int var96 = var95 >> 10 & 0x1F;
                int var97 = var95 >> 5 & 0x1F;
                int var98 = var95 & 0x1F;
                int var99 = (var98 << 3) + (var96 << 19) + (var97 << 11);
                class229 var100 = class229.method3345(var94);
                if (var100.field2669 != var99) {
                    var100.field2669 = var99;
                    method272(var100);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2181 == arg0.field1285) {
                int var101 = var3.method3551();
                int var102 = var3.method3551();
                int var103 = var3.method3551();
                int var104 = var3.method3551();
                field867[var101] = true;
                field868[var101] = var102;
                field769[var101] = var103;
                field870[var101] = var104;
                field871[var101] = 0;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2169 == arg0.field1285) {
                field628 = var3.method3447();
                field838 = var3.method3447();
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2191 == arg0.field1285) {
                field640 = var3.method3530() * 30;
                field819 = field807;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2167 == arg0.field1285) {
                Statics.field392 = var3.method3447();
                Statics.field191 = var3.method3551();
                for (int var105 = Statics.field191; var105 < Statics.field191 + 8; var105++) {
                    for (int var106 = Statics.field392; var106 < Statics.field392 + 8; var106++) {
                        if (field893[Statics.field1394][var105][var106] != null) {
                            field893[Statics.field1394][var105][var106] = null;
                            method2810(var105, var106);
                        }
                    }
                }
                for (class69 var107 = (class69) field751.method4856(); var107 != null; var107 = (class69) field751.method4858()) {
                    if (var107.field914 >= Statics.field191 && var107.field914 < Statics.field191 + 8 && var107.field902 >= Statics.field392 && var107.field902 < Statics.field392 + 8 && Statics.field1394 == var107.field912) {
                        var107.field911 = 0;
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2173 == arg0.field1285) {
                int var108 = var3.method3466();
                int var109 = var3.method3457();
                class229 var110 = class229.method3345(var108);
                if (var110.field2757 != 1 || var110.field2688 != var109) {
                    var110.field2757 = 1;
                    var110.field2688 = var109;
                    method272(var110);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2176 == arg0.field1285) {
                int var111 = var3.method3551();
                Statics.method3207(var111);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2196 == arg0.field1285) {
                String var112 = var3.method3426();
                long var113 = var3.method3423();
                long var115 = (long) var3.method3530();
                long var117 = (long) var3.method3421();
                class240 var119 = (class240) class197.method999(class240.method727(), var3.method3551());
                long var120 = (var115 << 32) + var117;
                boolean var122 = false;
                for (int var123 = 0; var123 < 100; var123++) {
                    if (field775[var123] == var120) {
                        var122 = true;
                        break;
                    }
                }
                if (var119.field3170 && Statics.field205.method1684(new class295(var112, Statics.field366))) {
                    var122 = true;
                }
                if (!var122 && field710 == 0) {
                    field775[field842] = var120;
                    field842 = (field842 + 1) % 100;
                    String var124 = class303.method5206(class309.method4130(class304.method4452(var3)));
                    if (var119.field3171 == -1) {
                        class92.method59(9, var112, var124, class307.method3212(var113));
                    } else {
                        class92.method59(9, class82.method1032(var119.field3171) + var112, var124, class307.method3212(var113));
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2184 == arg0.field1285) {
                method172(class191.field2343);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2161 == arg0.field1285) {
                int var125 = var3.method3620();
                String var126 = var3.method3426();
                class229 var127 = class229.method3345(var125);
                if (!var126.equals(var127.field2705)) {
                    var127.field2705 = var126;
                    method272(var127);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2193 == arg0.field1285) {
                Statics.method760(true, arg0.field1289);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2148 == arg0.field1285) {
                field742 = false;
                for (int var128 = 0; var128 < 5; var128++) {
                    field867[var128] = false;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2225 == arg0.field1285) {
                field742 = true;
                Statics.field53 = var3.method3551();
                Statics.field359 = var3.method3551();
                Statics.field3194 = var3.method3530();
                Statics.field1732 = var3.method3551();
                Statics.field2057 = var3.method3551();
                if (Statics.field2057 >= 100) {
                    int var129 = Statics.field53 * 128 + 64;
                    int var130 = Statics.field359 * 128 + 64;
                    int var131 = method520(var129, var130, Statics.field1394) - Statics.field3194;
                    int var132 = var129 - Statics.field350;
                    int var133 = var131 - Statics.field35;
                    int var134 = var130 - Statics.field63;
                    int var135 = (int) Math.sqrt((double) (var132 * var132 + var134 * var134));
                    Statics.field114 = (int) (Math.atan2((double) var133, (double) var135) * 325.949D) & 0x7FF;
                    Statics.field2551 = (int) (Math.atan2((double) var132, (double) var134) * -325.949D) & 0x7FF;
                    if (Statics.field114 < 128) {
                        Statics.field114 = 128;
                    }
                    if (Statics.field114 > 383) {
                        Statics.field114 = 383;
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2206 == arg0.field1285) {
                int var136 = var3.method3466();
                int var137 = var3.method3457();
                class229 var138 = class229.method3345(var136);
                if (var138 != null && var138.field2646 == 0) {
                    if (var137 > var138.field2668 - var138.field2678) {
                        var137 = var138.field2668 - var138.field2678;
                    }
                    if (var137 < 0) {
                        var137 = 0;
                    }
                    if (var138.field2734 != var137) {
                        var138.field2734 = var137;
                        method272(var138);
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2188 == arg0.field1285) {
                int var139 = var3.method3455();
                class60.method2032(var139);
                field810[++field768 - 1 & 0x1F] = var139 & 0x7FFF;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2199 == arg0.field1285) {
                var3.field2439 += 28;
                if (var3.method3638()) {
                    method4138(var3, var3.field2439 - 28);
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2157 == arg0.field1285) {
                method142();
                int var140 = var3.method3464();
                int var141 = var3.method3447();
                int var142 = var3.method3551();
                field756[var141] = var140;
                field754[var141] = var142;
                field755[var141] = 1;
                for (int var143 = 0; var143 < 98; var143++) {
                    if (var140 >= class233.field2831[var143]) {
                        field755[var141] = var143 + 2;
                    }
                }
                field624[++field813 - 1 & 0x1F] = var141;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2211 == arg0.field1285) {
                int var144 = var3.method3620();
                int var145 = var3.method3620();
                int var146 = class53.method2035();
                class192 var147 = class192.method1750(class189.field2231, field669.field1284);
                var147.field2356.method3444(var146);
                var147.field2356.method3565(field430);
                var147.field2356.method3508(var144);
                var147.field2356.method3461(var145);
                field669.method2056(var147);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2213 == arg0.field1285) {
                method142();
                field717 = var3.method3420();
                field819 = field807;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2228 == arg0.field1285) {
                boolean var148 = var3.method3551() == 1;
                if (var148) {
                    Statics.field82 = class204.method3658() - var3.method3423();
                    Statics.field1590 = new class7(var3, true);
                } else {
                    Statics.field1590 = null;
                }
                field764 = field807;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2223 == arg0.field1285) {
                Statics.field205.method1647();
                field815 = field807;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2160 == arg0.field1285) {
                byte[] var149 = new byte[arg0.field1297];
                var3.method3695(var149, 0, var149.length);
                class202 var150 = new class202(var149);
                String var151 = var150.method3426();
                class51.method544(var151, true, false);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2179 == arg0.field1285) {
                method172(class191.field2353);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2198 == arg0.field1285) {
                int var152 = arg0.field1297 + var3.field2439;
                int var153 = var3.method3530();
                int var154 = var3.method3530();
                if (field830 != var153) {
                    field830 = var153;
                    this.method1337(false);
                    method707(field830);
                    class77.method289(field830);
                    for (int var155 = 0; var155 < 100; var155++) {
                        field864[var155] = true;
                    }
                }
                while (var154-- > 0) {
                    int var156 = var3.method3620();
                    int var157 = var3.method3530();
                    int var158 = var3.method3551();
                    class62 var159 = (class62) field703.method5416((long) var156);
                    if (var159 != null && var159.field539 != var157) {
                        method1849(var159, true);
                        var159 = null;
                    }
                    if (var159 == null) {
                        var159 = method1005(var156, var157, var158);
                    }
                    var159.field537 = true;
                }
                for (class62 var160 = (class62) field703.method5411(); var160 != null; var160 = (class62) field703.method5415()) {
                    if (var160.field537) {
                        var160.field537 = false;
                    } else {
                        method1849(var160, true);
                    }
                }
                field824 = new class319(512);
                while (var3.field2439 < var152) {
                    int var161 = var3.method3620();
                    int var162 = var3.method3530();
                    int var163 = var3.method3530();
                    int var164 = var3.method3620();
                    for (int var165 = var162; var165 <= var163; var165++) {
                        long var166 = ((long) var161 << 32) + (long) var165;
                        field824.method5412(new class185(var164), var166);
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2208 == arg0.field1285) {
                int var168 = var3.method3446();
                int var169 = var3.method3446();
                String var170 = var3.method3426();
                if (var169 >= 1 && var169 <= 8) {
                    if (var170.equalsIgnoreCase(class236.field2980)) {
                        var170 = null;
                    }
                    field746[var169 - 1] = var170;
                    field747[var169 - 1] = var168 == 0;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2142 == arg0.field1285) {
                method3211(var3.method3426());
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2227 == arg0.field1285) {
                if (arg0.field1297 == 0) {
                    Statics.field1298 = null;
                } else {
                    if (Statics.field1298 == null) {
                        Statics.field1298 = new class297(Statics.field366, Statics.field1509);
                    }
                    Statics.field1298.method5157(var3);
                }
                Statics.method3067();
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2146 == arg0.field1285) {
                int var171 = var3.method3530();
                int var172 = var3.method3620();
                class224.field2600[var171] = var172;
                if (class224.field2601[var171] != var172) {
                    class224.field2601[var171] = var172;
                }
                method4292(var171);
                field808[++field809 - 1 & 0x1F] = var171;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2189 == arg0.field1285) {
                method172(class191.field2350);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2151 == arg0.field1285) {
                int var173 = var3.method3620();
                class62 var174 = (class62) field703.method5416((long) var173);
                if (var174 != null) {
                    method1849(var174, true);
                }
                if (field788 != null) {
                    method272(field788);
                    field788 = null;
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2215 == arg0.field1285) {
                for (int var175 = 0; var175 < class224.field2601.length; var175++) {
                    if (class224.field2601[var175] != class224.field2600[var175]) {
                        class224.field2601[var175] = class224.field2600[var175];
                        method4292(var175);
                        field808[++field809 - 1 & 0x1F] = var175;
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2200 == arg0.field1285) {
                Statics.field205.method1675(var3, arg0.field1297);
                field815 = field807;
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2190 == arg0.field1285) {
                int var176 = var3.method3457();
                if (var176 == 65535) {
                    var176 = -1;
                }
                method5020(var176);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2182 == arg0.field1285) {
                int var177 = var3.method3460();
                int var178 = var3.method3574();
                if (var178 == 65535) {
                    var178 = -1;
                }
                method1826(var178, var177);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2219 == arg0.field1285) {
                int var179 = var3.method3446();
                int var180 = var3.method3465();
                int var181 = var3.method3457();
                class62 var182 = (class62) field703.method5416((long) var180);
                if (var182 != null) {
                    method1849(var182, var182.field539 != var181);
                }
                method1005(var180, var181, var179);
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2152 == arg0.field1285) {
                String var183 = var3.method3426();
                long var184 = (long) var3.method3530();
                long var186 = (long) var3.method3421();
                class240 var188 = (class240) class197.method999(class240.method727(), var3.method3551());
                long var189 = (var184 << 32) + var186;
                boolean var191 = false;
                for (int var192 = 0; var192 < 100; var192++) {
                    if (field775[var192] == var189) {
                        var191 = true;
                        break;
                    }
                }
                if (Statics.field205.method1684(new class295(var183, Statics.field366))) {
                    var191 = true;
                }
                if (!var191 && field710 == 0) {
                    field775[field842] = var189;
                    field842 = (field842 + 1) % 100;
                    String var193 = class303.method5206(class309.method4130(class304.method4452(var3)));
                    byte var194;
                    if (var188.field3164) {
                        var194 = 7;
                    } else {
                        var194 = 3;
                    }
                    if (var188.field3171 == -1) {
                        class92.method202(var194, var183, var193);
                    } else {
                        class92.method202(var194, class82.method1032(var188.field3171) + var183, var193);
                    }
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2207 == arg0.field1285) {
                int var195 = var3.method3620();
                if (field704 != var195) {
                    field704 = var195;
                    method371();
                }
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2216 == arg0.field1285) {
                field730 = var3.method3551();
                arg0.field1285 = null;
                return true;
            }
            if (class188.field2180 == arg0.field1285) {
                String var196 = var3.method3426();
                String var197 = class303.method5206(class309.method4130(class304.method4452(var3)));
                class92.method202(6, var196, var197);
                arg0.field1285 = null;
                return true;
            }
            class166.method4746("" + (arg0.field1285 == null ? -1 : arg0.field1285.field2185) + class82.field1119 + (arg0.field1296 == null ? -1 : arg0.field1296.field2185) + class82.field1119 + (arg0.field1288 == null ? -1 : arg0.field1288.field2185) + class82.field1119 + arg0.field1297, (Throwable) null);
            method2522();
        } catch (IOException var202) {
            method730();
        } catch (Exception var203) {
            String var200 = "" + (arg0.field1285 == null ? -1 : arg0.field1285.field2185) + class82.field1119 + (arg0.field1296 == null ? -1 : arg0.field1296.field2185) + class82.field1119 + (arg0.field1288 == null ? -1 : arg0.field1288.field2185) + class82.field1119 + arg0.field1297 + class82.field1119 + (Statics.field405 + Statics.field389.field953[0]) + class82.field1119 + (Statics.field1088 + Statics.field389.field935[0]) + class82.field1119;
            for (int var201 = 0; var201 < arg0.field1297 && var201 < 50; var201++) {
                var200 = var200 + var3.field2440[var201] + class82.field1119;
            }
            class166.method4746(var200, var203);
            method2522();
        }
        return true;
    }

    @ObfuscatedName("j.hh(Lgf;I)V")
    public static final void method172(class191 arg0) {
        class209 var1 = field669.field1289;
        if (class191.field2343 == arg0) {
            byte var2 = var1.method3450();
            int var3 = var1.method3457();
            byte var4 = var1.method3450();
            int var5 = var1.method3574();
            int var6 = var1.method3530();
            int var7 = var1.method3446();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field683[var8];
            byte var11 = var1.method3449();
            int var12 = var1.method3455();
            byte var13 = var1.method3450();
            int var14 = var1.method3447();
            int var15 = (var14 >> 4 & 0x7) + Statics.field191;
            int var16 = (var14 & 0x7) + Statics.field392;
            class67 var17;
            if (field843 == var12) {
                var17 = Statics.field389;
            } else {
                var17 = field738[var12];
            }
            if (var17 != null) {
                class265 var18 = class265.method763(var5);
                int var19;
                int var20;
                if (var9 == 1 || var9 == 3) {
                    var19 = var18.field3465;
                    var20 = var18.field3437;
                } else {
                    var19 = var18.field3437;
                    var20 = var18.field3465;
                }
                int var21 = (var19 >> 1) + var15;
                int var22 = (var19 + 1 >> 1) + var15;
                int var23 = (var20 >> 1) + var16;
                int var24 = (var20 + 1 >> 1) + var16;
                int[][] var25 = class56.field494[Statics.field1394];
                int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
                int var27 = (var15 << 7) + (var19 << 6);
                int var28 = (var16 << 7) + (var20 << 6);
                class128 var29 = var18.method4591(var8, var9, var25, var27, var26, var28);
                if (var29 != null) {
                    method4484(Statics.field1394, var15, var16, var10, -1, 0, 0, var6 + 1, var3 + 1);
                    var17.field595 = field633 + var6;
                    var17.field596 = field633 + var3;
                    var17.field600 = var29;
                    var17.field597 = var15 * 128 + var19 * 64;
                    var17.field607 = var16 * 128 + var20 * 64;
                    var17.field598 = var26;
                    if (var2 > var13) {
                        byte var30 = var2;
                        var2 = var13;
                        var13 = var30;
                    }
                    if (var11 > var4) {
                        byte var31 = var11;
                        var11 = var4;
                        var4 = var31;
                    }
                    var17.field606 = var2 + var15;
                    var17.field603 = var13 + var15;
                    var17.field594 = var11 + var16;
                    var17.field602 = var4 + var16;
                }
            }
        }
        if (class191.field2350 == arg0) {
            int var32 = var1.method3446();
            int var33 = (var32 >> 4 & 0x7) + Statics.field191;
            int var34 = (var32 & 0x7) + Statics.field392;
            int var35 = var1.method3404();
            int var36 = var35 >> 2;
            int var37 = var35 & 0x3;
            int var38 = field683[var36];
            int var39 = var1.method3574();
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                method4484(Statics.field1394, var33, var34, var38, var39, var36, var37, 0, -1);
            }
            return;
        }
        if (class191.field2346 == arg0) {
            int var40 = var1.method3551();
            int var41 = (var40 >> 4 & 0x7) + Statics.field191;
            int var42 = (var40 & 0x7) + Statics.field392;
            int var43 = var1.method3404();
            int var44 = var1.method3446();
            int var45 = var44 >> 4 & 0xF;
            int var46 = var44 & 0x7;
            int var47 = var1.method3457();
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                int var48 = var45 + 1;
                if (Statics.field389.field953[0] >= var41 - var48 && Statics.field389.field953[0] <= var41 + var48 && Statics.field389.field935[0] >= var42 - var48 && Statics.field389.field935[0] <= var42 + var48 && field859 != 0 && var46 > 0 && field860 < 50) {
                    field790[field860] = var47;
                    field621[field860] = var46;
                    field795[field860] = var43;
                    field865[field860] = null;
                    field869[field860] = (var41 << 16) + (var42 << 8) + var45;
                    field860++;
                }
            }
        }
        if (class191.field2342 == arg0) {
            int var49 = var1.method3530();
            int var50 = var1.method3446();
            int var51 = var1.method3574();
            int var52 = var1.method3551();
            int var53 = (var52 >> 4 & 0x7) + Statics.field191;
            int var54 = (var52 & 0x7) + Statics.field392;
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                int var55 = var53 * 128 + 64;
                int var56 = var54 * 128 + 64;
                class78 var57 = new class78(var49, Statics.field1394, var55, var56, method520(var55, var56, Statics.field1394) - var50, var51, field633);
                field881.method4851(var57);
            }
        } else if (class191.field2345 == arg0) {
            int var58 = var1.method3404();
            int var59 = var58 >> 2;
            int var60 = var58 & 0x3;
            int var61 = field683[var59];
            int var62 = var1.method3447();
            int var63 = (var62 >> 4 & 0x7) + Statics.field191;
            int var64 = (var62 & 0x7) + Statics.field392;
            int var65 = var1.method3530();
            if (var63 >= 0 && var64 >= 0 && var63 < 103 && var64 < 103) {
                if (var61 == 0) {
                    class137 var66 = Statics.field582.method2835(Statics.field1394, var63, var64);
                    if (var66 != null) {
                        int var67 = class129.method4558(var66.field1860);
                        if (var59 == 2) {
                            var66.field1859 = new class94(var67, 2, var60 + 4, Statics.field1394, var63, var64, var65, false, var66.field1859);
                            var66.field1857 = new class94(var67, 2, var60 + 1 & 0x3, Statics.field1394, var63, var64, var65, false, var66.field1857);
                        } else {
                            var66.field1859 = new class94(var67, var59, var60, Statics.field1394, var63, var64, var65, false, var66.field1859);
                        }
                    }
                }
                if (var61 == 1) {
                    class142 var68 = Statics.field582.method2836(Statics.field1394, var63, var64);
                    if (var68 != null) {
                        int var69 = class129.method4558(var68.field1900);
                        if (var59 == 4 || var59 == 5) {
                            var68.field1893 = new class94(var69, 4, var60, Statics.field1394, var63, var64, var65, false, var68.field1893);
                        } else if (var59 == 6) {
                            var68.field1893 = new class94(var69, 4, var60 + 4, Statics.field1394, var63, var64, var65, false, var68.field1893);
                        } else if (var59 == 7) {
                            var68.field1893 = new class94(var69, 4, (var60 + 2 & 0x3) + 4, Statics.field1394, var63, var64, var65, false, var68.field1893);
                        } else if (var59 == 8) {
                            var68.field1893 = new class94(var69, 4, var60 + 4, Statics.field1394, var63, var64, var65, false, var68.field1893);
                            var68.field1898 = new class94(var69, 4, (var60 + 2 & 0x3) + 4, Statics.field1394, var63, var64, var65, false, var68.field1898);
                        }
                    }
                }
                if (var61 == 2) {
                    class143 var70 = Statics.field582.method2837(Statics.field1394, var63, var64);
                    if (var59 == 11) {
                        var59 = 10;
                    }
                    if (var70 != null) {
                        var70.field1912 = new class94(class129.method4558(var70.field1913), var59, var60, Statics.field1394, var63, var64, var65, false, var70.field1912);
                    }
                }
                if (var61 == 3) {
                    class124 var71 = Statics.field582.method2838(Statics.field1394, var63, var64);
                    if (var71 != null) {
                        var71.field1586 = new class94(class129.method4558(var71.field1587), 22, var60, Statics.field1394, var63, var64, var65, false, var71.field1586);
                    }
                }
            }
        } else if (class191.field2348 == arg0) {
            int var72 = var1.method3446();
            int var73 = (var72 >> 4 & 0x7) + Statics.field191;
            int var74 = (var72 & 0x7) + Statics.field392;
            int var75 = var1.method3457();
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                class273 var76 = field893[Statics.field1394][var73][var74];
                if (var76 != null) {
                    for (class88 var77 = (class88) var76.method4856(); var77 != null; var77 = (class88) var76.method4858()) {
                        if ((var75 & 0x7FFF) == var77.field1215) {
                            var77.method3306();
                            break;
                        }
                    }
                    if (var76.method4856() == null) {
                        field893[Statics.field1394][var73][var74] = null;
                    }
                    method2810(var73, var74);
                }
            }
        } else if (class191.field2351 == arg0) {
            int var78 = var1.method3404();
            int var79 = var78 >> 2;
            int var80 = var78 & 0x3;
            int var81 = field683[var79];
            int var82 = var1.method3404();
            int var83 = (var82 >> 4 & 0x7) + Statics.field191;
            int var84 = (var82 & 0x7) + Statics.field392;
            if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                method4484(Statics.field1394, var83, var84, var81, -1, var79, var80, 0, -1);
            }
        } else if (class191.field2353 == arg0) {
            int var85 = var1.method3404() * 4;
            int var86 = var1.method3530();
            int var87 = var1.method3574();
            int var88 = var1.method3404() * 4;
            int var89 = var1.method3458();
            int var90 = var1.method3551();
            int var91 = var1.method3404();
            int var92 = var1.method3455();
            int var93 = var1.method3446();
            int var94 = (var93 >> 4 & 0x7) + Statics.field191;
            int var95 = (var93 & 0x7) + Statics.field392;
            byte var96 = var1.method3449();
            byte var97 = var1.method3450();
            int var98 = var94 + var97;
            int var99 = var95 + var96;
            if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var87 != 65535) {
                int var100 = var94 * 128 + 64;
                int var101 = var95 * 128 + 64;
                int var102 = var98 * 128 + 64;
                int var103 = var99 * 128 + 64;
                class87 var104 = new class87(var87, Statics.field1394, var100, var101, method520(var100, var101, Statics.field1394) - var88, field633 + var92, field633 + var86, var90, var91, var89, var85);
                var104.method1900(var102, var103, method520(var102, var103, Statics.field1394) - var85, field633 + var92);
                field861.method4851(var104);
            }
        } else if (class191.field2347 == arg0) {
            int var105 = var1.method3455();
            int var106 = var1.method3457();
            int var107 = var1.method3455();
            int var108 = var1.method3446();
            int var109 = (var108 >> 4 & 0x7) + Statics.field191;
            int var110 = (var108 & 0x7) + Statics.field392;
            if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                class273 var111 = field893[Statics.field1394][var109][var110];
                if (var111 != null) {
                    for (class88 var112 = (class88) var111.method4856(); var112 != null; var112 = (class88) var111.method4858()) {
                        if ((var105 & 0x7FFF) == var112.field1215 && var112.field1212 == var107) {
                            var112.field1212 = var106;
                            break;
                        }
                    }
                    method2810(var109, var110);
                }
            }
        } else if (class191.field2344 == arg0) {
            int var113 = var1.method3574();
            int var114 = var1.method3457();
            int var115 = var1.method3446();
            int var116 = (var115 >> 4 & 0x7) + Statics.field191;
            int var117 = (var115 & 0x7) + Statics.field392;
            if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                class88 var118 = new class88();
                var118.field1215 = var114;
                var118.field1212 = var113;
                if (field893[Statics.field1394][var116][var117] == null) {
                    field893[Statics.field1394][var116][var117] = new class273();
                }
                field893[Statics.field1394][var116][var117].method4851(var118);
                method2810(var116, var117);
            }
        }
    }

    @ObfuscatedName("ig.hd(IIIIIIIIII)V")
    public static final void method4484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field751.method4856(); var10 != null; var10 = (class69) field751.method4858()) {
            if (var10.field912 == arg0 && var10.field914 == arg1 && var10.field902 == arg2 && var10.field907 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field912 = arg0;
            var9.field907 = arg3;
            var9.field914 = arg1;
            var9.field902 = arg2;
            method148(var9);
            field751.method4851(var9);
        }
        var9.field900 = arg4;
        var9.field909 = arg5;
        var9.field908 = arg6;
        var9.field910 = arg7;
        var9.field911 = arg8;
    }

    @ObfuscatedName("by.hf(B)V")
    public static final void method1041() {
        for (class69 var0 = (class69) field751.method4856(); var0 != null; var0 = (class69) field751.method4858()) {
            if (var0.field911 == -1) {
                var0.field910 = 0;
                method148(var0);
            } else {
                var0.method3306();
            }
        }
    }

    @ObfuscatedName("i.hm(Lbi;I)V")
    public static final void method148(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field907 == 0) {
            var1 = Statics.field582.method2839(arg0.field912, arg0.field914, arg0.field902);
        }
        if (arg0.field907 == 1) {
            var1 = Statics.field582.method2840(arg0.field912, arg0.field914, arg0.field902);
        }
        if (arg0.field907 == 2) {
            var1 = Statics.field582.method2883(arg0.field912, arg0.field914, arg0.field902);
        }
        if (arg0.field907 == 3) {
            var1 = Statics.field582.method2948(arg0.field912, arg0.field914, arg0.field902);
        }
        if (var1 != 0L) {
            int var6 = Statics.field582.method2968(arg0.field912, arg0.field914, arg0.field902, var1);
            var3 = class129.method4558(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field904 = var3;
        arg0.field906 = var4;
        arg0.field905 = var5;
    }

    @ObfuscatedName("ao.ha(I)V")
    public static final void method717() {
        for (class69 var0 = (class69) field751.method4856(); var0 != null; var0 = (class69) field751.method4858()) {
            if (var0.field911 > 0) {
                var0.field911--;
            }
            if (var0.field911 != 0) {
                if (var0.field910 > 0) {
                    var0.field910--;
                }
                if (var0.field910 == 0 && var0.field914 >= 1 && var0.field902 >= 1 && var0.field914 <= 102 && var0.field902 <= 102 && (var0.field900 < 0 || class56.method4496(var0.field900, var0.field909))) {
                    method4519(var0.field912, var0.field907, var0.field914, var0.field902, var0.field900, var0.field908, var0.field909);
                    var0.field910 = -1;
                    if (var0.field904 == var0.field900 && var0.field904 == -1) {
                        var0.method3306();
                    } else if (var0.field904 == var0.field900 && var0.field908 == var0.field905 && var0.field909 == var0.field906) {
                        var0.method3306();
                    }
                }
            } else if (var0.field904 < 0 || class56.method4496(var0.field904, var0.field906)) {
                method4519(var0.field912, var0.field907, var0.field914, var0.field902, var0.field904, var0.field905, var0.field906);
                var0.method3306();
            }
        }
    }

    @ObfuscatedName("jb.hs(IIIIIIII)V")
    public static final void method4519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field626 && Statics.field1394 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field582.method2839(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field582.method2840(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field582.method2883(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field582.method2948(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field582.method2968(arg0, arg2, arg3, var7);
            int var13 = class129.method4558(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field582.method2830(arg0, arg2, arg3);
                class265 var16 = class265.method763(var13);
                if (var16.field3442 != 0) {
                    field854[arg0].method3263(arg2, arg3, var14, var15, var16.field3440);
                }
            }
            if (arg1 == 1) {
                Statics.field582.method2831(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field582.method2832(arg0, arg2, arg3);
                class265 var17 = class265.method763(var13);
                if (var17.field3437 + arg2 > 103 || var17.field3437 + arg3 > 103 || var17.field3465 + arg2 > 103 || var17.field3465 + arg3 > 103) {
                    return;
                }
                if (var17.field3442 != 0) {
                    field854[arg0].method3276(arg2, arg3, var17.field3437, var17.field3465, var15, var17.field3440);
                }
            }
            if (arg1 == 3) {
                Statics.field582.method2833(arg0, arg2, arg3);
                class265 var18 = class265.method763(var13);
                if (var18.field3442 == 1) {
                    field854[arg0].method3265(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class56.field481[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class134 var20 = Statics.field582;
        class178 var21 = field854[arg0];
        class265 var22 = class265.method763(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3465;
            var24 = var22.field3437;
        } else {
            var23 = var22.field3437;
            var24 = var22.field3465;
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
        int[][] var29 = class56.field494[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class129.method5179(arg2, arg3, 2, var22.field3456 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3462 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class136 var36;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var36 = var22.method4591(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class94(arg4, 22, arg5, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2819(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3442 == 1) {
                var21.method3258(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class136 var62;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var62 = var22.method4591(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class94(arg4, 10, arg5, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            if (var62 != null) {
                var20.method2823(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3442 != 0) {
                var21.method3259(arg2, arg3, var23, var24, var22.field3440);
            }
        } else if (arg6 >= 12) {
            class136 var37;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var37 = var22.method4591(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class94(arg4, arg6, arg5, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2823(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3442 != 0) {
                var21.method3259(arg2, arg3, var23, var24, var22.field3440);
            }
        } else if (arg6 == 0) {
            class136 var38;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var38 = var22.method4591(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class94(arg4, 0, arg5, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2821(arg0, arg2, arg3, var30, var38, (class136) null, class56.field487[arg5], 0, var33, var35);
            if (var22.field3442 != 0) {
                var21.method3256(arg2, arg3, arg6, arg5, var22.field3440);
            }
        } else if (arg6 == 1) {
            class136 var39;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var39 = var22.method4591(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class94(arg4, 1, arg5, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2821(arg0, arg2, arg3, var30, var39, (class136) null, class56.field482[arg5], 0, var33, var35);
            if (var22.field3442 != 0) {
                var21.method3256(arg2, arg3, arg6, arg5, var22.field3440);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class136 var41;
            class136 var42;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var41 = var22.method4591(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4591(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class94(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3445, true, (class136) null);
                var42 = new class94(arg4, 2, var40, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2821(arg0, arg2, arg3, var30, var41, var42, class56.field487[arg5], class56.field487[var40], var33, var35);
            if (var22.field3442 != 0) {
                var21.method3256(arg2, arg3, arg6, arg5, var22.field3440);
            }
        } else if (arg6 == 3) {
            class136 var43;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var43 = var22.method4591(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class94(arg4, 3, arg5, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2821(arg0, arg2, arg3, var30, var43, (class136) null, class56.field482[arg5], 0, var33, var35);
            if (var22.field3442 != 0) {
                var21.method3256(arg2, arg3, arg6, arg5, var22.field3440);
            }
        } else if (arg6 == 9) {
            class136 var44;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var44 = var22.method4591(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class94(arg4, arg6, arg5, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2823(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3442 != 0) {
                var21.method3259(arg2, arg3, var23, var24, var22.field3440);
            }
        } else if (arg6 == 4) {
            class136 var45;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var45 = var22.method4591(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class94(arg4, 4, arg5, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2881(arg0, arg2, arg3, var30, var45, (class136) null, class56.field487[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2839(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class265.method763(class129.method4558(var47)).field3446;
            }
            class136 var49;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var49 = var22.method4591(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class94(arg4, 4, arg5, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2881(arg0, arg2, arg3, var30, var49, (class136) null, class56.field487[arg5], 0, class56.field489[arg5] * var46, class56.field490[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2839(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class265.method763(class129.method4558(var51)).field3446 / 2;
            }
            class136 var53;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var53 = var22.method4591(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class94(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2881(arg0, arg2, arg3, var30, var53, (class136) null, 256, arg5, class56.field491[arg5] * var50, class56.field492[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class136 var55;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var55 = var22.method4591(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class94(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2881(arg0, arg2, arg3, var30, var55, (class136) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2839(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class265.method763(class129.method4558(var57)).field3446 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class136 var60;
            class136 var61;
            if (var22.field3445 == -1 && var22.field3463 == null) {
                var60 = var22.method4591(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4591(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class94(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3445, true, (class136) null);
                var61 = new class94(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3445, true, (class136) null);
            }
            var20.method2881(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class56.field491[arg5] * var56, class56.field492[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("eb.hl(IIB)V")
    public static final void method2810(int arg0, int arg1) {
        class273 var2 = field893[Statics.field1394][arg0][arg1];
        if (var2 == null) {
            Statics.field582.method2834(Statics.field1394, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class88 var5 = null;
        for (class88 var6 = (class88) var2.method4856(); var6 != null; var6 = (class88) var2.method4858()) {
            class266 var7 = class266.method4129(var6.field1215);
            long var8 = (long) var7.field3494;
            if (var7.field3493 == 1) {
                var8 = (long) (var6.field1212 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field582.method2834(Statics.field1394, arg0, arg1);
            return;
        }
        var2.method4889(var5);
        class88 var10 = null;
        class88 var11 = null;
        for (class88 var12 = (class88) var2.method4856(); var12 != null; var12 = (class88) var2.method4858()) {
            if (var5.field1215 != var12.field1215) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1215 != var12.field1215 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class129.method5179(arg0, arg1, 3, false, 0);
        Statics.field582.method2820(Statics.field1394, arg0, arg1, method520(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1394), var5, var13, var10, var11);
    }

    @ObfuscatedName("w.hq(ZLhx;B)V")
    public static final void method32(boolean arg0, class209 arg1) {
        field743 = 0;
        field667 = 0;
        class209 var2 = field669.field1289;
        var2.method3690();
        int var3 = var2.method3692(8);
        if (var3 < field665) {
            for (int var4 = var3; var4 < field665; var4++) {
                field841[++field743 - 1] = field666[var4];
            }
        }
        if (var3 > field665) {
            throw new RuntimeException("");
        }
        field665 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field666[var5];
            class80 var7 = field664[var6];
            int var8 = var2.method3692(1);
            if (var8 == 0) {
                field666[++field665 - 1] = var6;
                var7.field965 = field633;
            } else {
                int var9 = var2.method3692(2);
                if (var9 == 0) {
                    field666[++field665 - 1] = var6;
                    var7.field965 = field633;
                    field668[++field667 - 1] = var6;
                } else if (var9 == 1) {
                    field666[++field665 - 1] = var6;
                    var7.field965 = field633;
                    int var10 = var2.method3692(3);
                    var7.method1828(var10, (byte) 1);
                    int var11 = var2.method3692(1);
                    if (var11 == 1) {
                        field668[++field667 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field666[++field665 - 1] = var6;
                    var7.field965 = field633;
                    int var12 = var2.method3692(3);
                    var7.method1828(var12, (byte) 2);
                    int var13 = var2.method3692(3);
                    var7.method1828(var13, (byte) 2);
                    int var14 = var2.method3692(1);
                    if (var14 == 1) {
                        field668[++field667 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field841[++field743 - 1] = var6;
                }
            }
        }
        while (arg1.method3693(field669.field1297) >= 27) {
            int var15 = arg1.method3692(15);
            if (var15 == 32767) {
                break;
            }
            boolean var19 = false;
            if (field664[var15] == null) {
                field664[var15] = new class80();
                var19 = true;
            }
            class80 var20 = field664[var15];
            field666[++field665 - 1] = var15;
            var20.field965 = field633;
            int var21;
            if (arg0) {
                var21 = arg1.method3692(8);
                if (var21 > 127) {
                    var21 -= 256;
                }
            } else {
                var21 = arg1.method3692(5);
                if (var21 > 15) {
                    var21 -= 32;
                }
            }
            int var22 = arg1.method3692(1);
            int var23 = field748[arg1.method3692(3)];
            if (var19) {
                var20.field967 = var20.field917 = var23;
            }
            int var24 = arg1.method3692(1);
            if (var24 == 1) {
                field668[++field667 - 1] = var15;
            }
            int var25;
            if (arg0) {
                var25 = arg1.method3692(8);
                if (var25 > 127) {
                    var25 -= 256;
                }
            } else {
                var25 = arg1.method3692(5);
                if (var25 > 15) {
                    var25 -= 32;
                }
            }
            var20.field1097 = class268.method4643(arg1.method3692(14));
            var20.field919 = var20.field1097.field3539;
            var20.field969 = var20.field1097.field3561;
            if (var20.field969 == 0) {
                var20.field917 = 0;
            }
            var20.field924 = var20.field1097.field3545;
            var20.field925 = var20.field1097.field3568;
            var20.field915 = var20.field1097.field3547;
            var20.field927 = var20.field1097.field3548;
            var20.field962 = var20.field1097.field3542;
            var20.field922 = var20.field1097.field3569;
            var20.field923 = var20.field1097.field3544;
            var20.method1829(Statics.field389.field953[0] + var21, Statics.field389.field935[0] + var25, var22 == 1);
        }
        arg1.method3713();
        method50(arg1);
        for (int var16 = 0; var16 < field743; var16++) {
            int var17 = field841[var16];
            if (field633 != field664[var17].field965) {
                field664[var17].field1097 = null;
                field664[var17] = null;
            }
        }
        if (field669.field1297 != arg1.field2439) {
            throw new RuntimeException(arg1.field2439 + class82.field1119 + field669.field1297);
        }
        for (int var18 = 0; var18 < field665; var18++) {
            if (field664[field666[var18]] == null) {
                throw new RuntimeException(var18 + class82.field1119 + field665);
            }
        }
    }

    @ObfuscatedName("u.he(Lhx;B)V")
    public static final void method50(class209 arg0) {
        for (int var1 = 0; var1 < field667; var1++) {
            int var2 = field668[var1];
            class80 var3 = field664[var2];
            int var4 = arg0.method3551();
            if ((var4 & 0x1) != 0) {
                var3.field933 = arg0.method3455();
                if (var3.field933 == 65535) {
                    var3.field933 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var5 = arg0.method3457();
                int var6 = arg0.method3457();
                int var7 = var3.field957 - (var5 - Statics.field405 - Statics.field405) * 64;
                int var8 = var3.field916 - (var6 - Statics.field1088 - Statics.field1088) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.field944 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var9 = arg0.method3530();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method3404();
                if (var3.field948 == var9 && var9 != -1) {
                    int var11 = class270.method596(var9).field3600;
                    if (var11 == 1) {
                        var3.field926 = 0;
                        var3.field971 = 0;
                        var3.field947 = var10;
                        var3.field952 = 0;
                    }
                    if (var11 == 2) {
                        var3.field952 = 0;
                    }
                } else if (var9 == -1 || var3.field948 == -1 || class270.method596(var9).field3585 >= class270.method596(var3.field948).field3585) {
                    var3.field948 = var9;
                    var3.field926 = 0;
                    var3.field971 = 0;
                    var3.field947 = var10;
                    var3.field952 = 0;
                    var3.field975 = var3.field970;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1097 = class268.method4643(arg0.method3530());
                var3.field919 = var3.field1097.field3539;
                var3.field969 = var3.field1097.field3561;
                var3.field924 = var3.field1097.field3545;
                var3.field925 = var3.field1097.field3568;
                var3.field915 = var3.field1097.field3547;
                var3.field927 = var3.field1097.field3548;
                var3.field962 = var3.field1097.field3542;
                var3.field922 = var3.field1097.field3569;
                var3.field923 = var3.field1097.field3544;
            }
            if ((var4 & 0x10) != 0) {
                int var12 = arg0.method3447();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg0.method3431();
                        if (var17 == 32767) {
                            var17 = arg0.method3431();
                            var15 = arg0.method3431();
                            var14 = arg0.method3431();
                            var16 = arg0.method3431();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg0.method3431();
                        }
                        int var18 = arg0.method3431();
                        var3.method1539(var17, var15, var14, var16, field633, var18);
                    }
                }
                int var19 = arg0.method3446();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg0.method3431();
                        int var22 = arg0.method3431();
                        if (var22 == 32767) {
                            var3.method1544(var21);
                        } else {
                            int var23 = arg0.method3431();
                            int var24 = arg0.method3551();
                            int var25 = var22 > 0 ? arg0.method3404() : var24;
                            var3.method1540(var21, field633, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field934 = arg0.method3455();
                int var26 = arg0.method3465();
                var3.field949 = var26 >> 16;
                var3.field972 = (var26 & 0xFFFF) + field633;
                var3.field921 = 0;
                var3.field928 = 0;
                if (var3.field972 > field633) {
                    var3.field921 = -1;
                }
                if (var3.field934 == 65535) {
                    var3.field934 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field929 = arg0.method3426();
                var3.field932 = 100;
            }
        }
    }

    @ObfuscatedName("r.hw(Lbr;IIBB)V")
    public static final void method281(class67 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field953[0];
        int var5 = arg0.field935[0];
        int var6 = arg0.method1112();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method1112();
        field896.field2121 = arg1;
        field896.field2122 = arg2;
        field896.field2123 = 1;
        field896.field2124 = 1;
        class66 var10 = field896;
        int var11 = class179.method3224(var4, var5, var9, var10, field854[arg0.field608], true, field897, field766);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method1113(field897[var12], field766[var12], arg3);
            }
        }
    }

    @ObfuscatedName("at.hv(IIB)V")
    public static final void method625(int arg0, int arg1) {
        if (field759 < 2 && field783 == 0 && !field777 || !field770) {
            return;
        }
        int var2 = field759 - 1;
        String var4;
        if (field783 == 1 && field759 < 2) {
            var4 = class236.field2924 + class236.field2993 + field728 + " " + class82.field1118;
        } else if (field777 && field759 < 2) {
            var4 = field780 + class236.field2993 + field781 + " " + class82.field1118;
        } else {
            String var5;
            if (var2 < 0) {
                var5 = "";
            } else if (field694[var2].length() > 0) {
                var5 = field776[var2] + class236.field2993 + field694[var2];
            } else {
                var5 = field776[var2];
            }
            var4 = var5;
        }
        if (field759 > 2) {
            var4 = var4 + class82.method2442(16777215) + " " + '/' + " " + (field759 - 2) + class236.field2999;
        }
        Statics.field12.method5257(var4, arg0 + 4, arg1 + 15, 16777215, 0, field633 / 1000);
    }

    @ObfuscatedName("cq.hu(IIIII)V")
    public static final void method1928(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field825; var4++) {
            if (field832[var4] + field712[var4] > arg0 && field712[var4] < arg0 + arg2 && field849[var4] + field833[var4] > arg1 && field849[var4] < arg1 + arg3) {
                field864[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hi(I)V")
    public final void method1169() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field759 - 1; var2++) {
                if (field762[var2] < 1000 && field762[var2 + 1] > 1000) {
                    String var3 = field694[var2];
                    field694[var2] = field694[var2 + 1];
                    field694[var2 + 1] = var3;
                    String var4 = field776[var2];
                    field776[var2] = field776[var2 + 1];
                    field776[var2 + 1] = var4;
                    int var5 = field762[var2];
                    field762[var2] = field762[var2 + 1];
                    field762[var2 + 1] = var5;
                    int var6 = field646[var2];
                    field646[var2] = field646[var2 + 1];
                    field646[var2 + 1] = var6;
                    int var7 = field736[var2];
                    field736[var2] = field736[var2 + 1];
                    field736[var2 + 1] = var7;
                    int var8 = field763[var2];
                    field763[var2] = field763[var2 + 1];
                    field763[var2 + 1] = var8;
                    boolean var9 = field818[var2];
                    field818[var2] = field818[var2 + 1];
                    field818[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field387 != null || field887 != null) {
            return;
        }
        int var10 = class54.field469;
        if (field758) {
            if (var10 != 1 && (Statics.field3880 || var10 != 4)) {
                int var11 = class54.field456;
                int var12 = class54.field463;
                if (var11 < Statics.field202 - 10 || var11 > Statics.field2509 + Statics.field202 + 10 || var12 < Statics.field425 - 10 || var12 > Statics.field425 + Statics.field286 + 10) {
                    field758 = false;
                    method1928(Statics.field202, Statics.field425, Statics.field2509, Statics.field286);
                }
            }
            if (var10 == 1 || !Statics.field3880 && var10 == 4) {
                int var13 = Statics.field202;
                int var14 = Statics.field425;
                int var15 = Statics.field2509;
                int var16 = class54.field462;
                int var17 = class54.field475;
                int var18 = -1;
                for (int var19 = 0; var19 < field759; var19++) {
                    int var20 = (field759 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1) {
                    method228(var18);
                }
                field758 = false;
                method1928(Statics.field202, Statics.field425, Statics.field2509, Statics.field286);
            }
            return;
        }
        int var21 = field759 - 1;
        if ((var10 == 1 || !Statics.field3880 && var10 == 4) && var21 >= 0) {
            int var23 = field762[var21];
            if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                label208: {
                    int var24 = field646[var21];
                    int var25 = field736[var21];
                    class229 var26 = class229.method3345(var25);
                    int var27 = method12(var26);
                    boolean var28 = (var27 >> 28 & 0x1) != 0;
                    if (!var28) {
                        class230 var10000 = (class230) null;
                        if (!class230.method3172(method12(var26))) {
                            break label208;
                        }
                    }
                    if (Statics.field387 != null && !field734 && field759 > 0 && !this.method1170()) {
                        int var29 = field731;
                        int var30 = field691;
                        method4124(Statics.field60, var29, var30);
                        Statics.field60 = null;
                    }
                    field734 = false;
                    field735 = 0;
                    if (Statics.field387 != null) {
                        method272(Statics.field387);
                    }
                    Statics.field387 = class229.method3345(var25);
                    field732 = var24;
                    field731 = class54.field462;
                    field691 = class54.field475;
                    if (var21 >= 0) {
                        Statics.field60 = new class83();
                        Statics.field60.field1129 = field646[var21];
                        Statics.field60.field1130 = field736[var21];
                        Statics.field60.field1126 = field762[var21];
                        Statics.field60.field1127 = field763[var21];
                        Statics.field60.field1128 = field776[var21];
                    }
                    method272(Statics.field387);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field3880 && var10 == 4) && this.method1170()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field3880 && var10 == 4) && field759 > 0) {
            method228(var21);
        }
        if (var10 == 2 && field759 > 0) {
            this.method1268(class54.field462, class54.field475);
        }
    }

    @ObfuscatedName("client.ht(B)Z")
    public final boolean method1170() {
        int var1 = field759 - 1;
        return (field757 == 1 && field759 > 2 || method3082(var1)) && !field818[var1];
    }

    @ObfuscatedName("client.hj(IIB)V")
    public final void method1268(int arg0, int arg1) {
        int var3 = Statics.field12.method5202(class236.field2998);
        for (int var4 = 0; var4 < field759; var4++) {
            class302 var5 = Statics.field12;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field694[var4].length() > 0) {
                var6 = field776[var4] + class236.field2993 + field694[var4];
            } else {
                var6 = field776[var4];
            }
            int var7 = var5.method5202(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field759 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field1402) {
            var9 = Statics.field1402 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field2370) {
            var10 = Statics.field2370 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field202 = var9;
        Statics.field425 = var10;
        Statics.field2509 = var3;
        Statics.field286 = field759 * 15 + 22;
        Statics.field582.method2850(Statics.field1394, arg0, arg1, false);
        field758 = true;
    }

    @ObfuscatedName("ez.ho(II)Z")
    public static final boolean method3082(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field762[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("y.hz(II)V")
    public static final void method228(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field646[arg0];
        int var2 = field736[arg0];
        int var3 = field762[arg0];
        int var4 = field763[arg0];
        String var5 = field776[arg0];
        String var6 = field694[arg0];
        method1536(var1, var2, var3, var4, var5, var6, class54.field462, class54.field475);
    }

    @ObfuscatedName("hb.hy(Lcs;IIB)V")
    public static final void method4124(class83 arg0, int arg1, int arg2) {
        method1536(arg0.field1129, arg0.field1130, arg0.field1126, arg0.field1127, arg0.field1128, arg0.field1128, arg1, arg2);
    }

    @ObfuscatedName("bz.hb(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 44) {
            class67 var8 = field738[arg3];
            if (var8 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var9 = class192.method1750(class189.field2277, field669.field1284);
                var9.field2356.method3402(arg3);
                var9.field2356.method3444(class45.field365[82] ? 1 : 0);
                field669.method2056(var9);
            }
        }
        if (arg2 == 46) {
            class67 var10 = field738[arg3];
            if (var10 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var11 = class192.method1750(class189.field2292, field669.field1284);
                var11.field2356.method3453(arg3);
                var11.field2356.method3565(class45.field365[82] ? 1 : 0);
                field669.method2056(var11);
            }
        }
        if (arg2 == 45) {
            class67 var12 = field738[arg3];
            if (var12 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var13 = class192.method1750(class189.field2287, field669.field1284);
                var13.field2356.method3443(class45.field365[82] ? 1 : 0);
                var13.field2356.method3453(arg3);
                field669.method2056(var13);
            }
        }
        if (arg2 == 18) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var14 = class192.method1750(class189.field2235, field669.field1284);
            var14.field2356.method3454(Statics.field1088 + arg1);
            var14.field2356.method3452(arg3);
            var14.field2356.method3452(Statics.field405 + arg0);
            var14.field2356.method3565(class45.field365[82] ? 1 : 0);
            field669.method2056(var14);
        }
        if (arg2 == 43) {
            class192 var15 = class192.method1750(class189.field2262, field669.field1284);
            var15.field2356.method3402(arg3);
            var15.field2356.method3508(arg1);
            var15.field2356.method3402(arg0);
            field669.method2056(var15);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 11) {
            class80 var16 = field664[arg3];
            if (var16 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var17 = class192.method1750(class189.field2263, field669.field1284);
                var17.field2356.method3454(arg3);
                var17.field2356.method3565(class45.field365[82] ? 1 : 0);
                field669.method2056(var17);
            }
        }
        if (arg2 == 49) {
            class67 var18 = field738[arg3];
            if (var18 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var19 = class192.method1750(class189.field2323, field669.field1284);
                var19.field2356.method3453(arg3);
                var19.field2356.method3445(class45.field365[82] ? 1 : 0);
                field669.method2056(var19);
            }
        }
        if (arg2 == 34) {
            class192 var20 = class192.method1750(class189.field2328, field669.field1284);
            var20.field2356.method3453(arg3);
            var20.field2356.method3472(arg1);
            var20.field2356.method3454(arg0);
            field669.method2056(var20);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 16) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var21 = class192.method1750(class189.field2248, field669.field1284);
            var21.field2356.method3508(Statics.field2229);
            var21.field2356.method3454(Statics.field1131);
            var21.field2356.method3443(class45.field365[82] ? 1 : 0);
            var21.field2356.method3452(Statics.field3368);
            var21.field2356.method3454(arg3);
            var21.field2356.method3454(Statics.field405 + arg0);
            var21.field2356.method3452(Statics.field1088 + arg1);
            field669.method2056(var21);
        }
        if (arg2 == 39) {
            class192 var22 = class192.method1750(class189.field2276, field669.field1284);
            var22.field2356.method3454(arg3);
            var22.field2356.method3472(arg1);
            var22.field2356.method3452(arg0);
            field669.method2056(var22);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 38) {
            method1143();
            class229 var23 = class229.method3345(arg1);
            field783 = 1;
            Statics.field3368 = arg0;
            Statics.field2229 = arg1;
            Statics.field1131 = arg3;
            method272(var23);
            field728 = class82.method2442(16748608) + class266.method4129(arg3).field3482 + class82.method2442(16777215);
            if (field728 == null) {
                field728 = class236.field2980;
            }
            return;
        }
        if (arg2 == 9) {
            class80 var24 = field664[arg3];
            if (var24 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var25 = class192.method1750(class189.field2301, field669.field1284);
                var25.field2356.method3444(class45.field365[82] ? 1 : 0);
                var25.field2356.method3452(arg3);
                field669.method2056(var25);
            }
        }
        if (arg2 == 47) {
            class67 var26 = field738[arg3];
            if (var26 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var27 = class192.method1750(class189.field2257, field669.field1284);
                var27.field2356.method3454(arg3);
                var27.field2356.method3444(class45.field365[82] ? 1 : 0);
                field669.method2056(var27);
            }
        }
        if (arg2 == 1002) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            class192 var28 = class192.method1750(class189.field2266, field669.field1284);
            var28.field2356.method3453(arg3);
            field669.method2056(var28);
        }
        if (arg2 == 4) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var29 = class192.method1750(class189.field2242, field669.field1284);
            var29.field2356.method3443(class45.field365[82] ? 1 : 0);
            var29.field2356.method3402(arg3);
            var29.field2356.method3402(Statics.field1088 + arg1);
            var29.field2356.method3402(Statics.field405 + arg0);
            field669.method2056(var29);
        }
        if (arg2 == 40) {
            class192 var30 = class192.method1750(class189.field2256, field669.field1284);
            var30.field2356.method3472(arg1);
            var30.field2356.method3452(arg0);
            var30.field2356.method3453(arg3);
            field669.method2056(var30);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 8) {
            class80 var31 = field664[arg3];
            if (var31 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var32 = class192.method1750(class189.field2316, field669.field1284);
                var32.field2356.method3454(arg3);
                var32.field2356.method3444(class45.field365[82] ? 1 : 0);
                var32.field2356.method3461(Statics.field3180);
                var32.field2356.method3453(field676);
                field669.method2056(var32);
            }
        }
        if (arg2 == 22) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var33 = class192.method1750(class189.field2281, field669.field1284);
            var33.field2356.method3565(class45.field365[82] ? 1 : 0);
            var33.field2356.method3454(arg3);
            var33.field2356.method3453(Statics.field1088 + arg1);
            var33.field2356.method3402(Statics.field405 + arg0);
            field669.method2056(var33);
        }
        if (arg2 == 10) {
            class80 var34 = field664[arg3];
            if (var34 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var35 = class192.method1750(class189.field2294, field669.field1284);
                var35.field2356.method3453(arg3);
                var35.field2356.method3565(class45.field365[82] ? 1 : 0);
                field669.method2056(var35);
            }
        }
        if (arg2 == 1001) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var36 = class192.method1750(class189.field2293, field669.field1284);
            var36.field2356.method3402(arg3);
            var36.field2356.method3443(class45.field365[82] ? 1 : 0);
            var36.field2356.method3453(Statics.field405 + arg0);
            var36.field2356.method3454(Statics.field1088 + arg1);
            field669.method2056(var36);
        }
        if (arg2 == 19) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var37 = class192.method1750(class189.field2246, field669.field1284);
            var37.field2356.method3454(arg3);
            var37.field2356.method3453(Statics.field405 + arg0);
            var37.field2356.method3402(Statics.field1088 + arg1);
            var37.field2356.method3565(class45.field365[82] ? 1 : 0);
            field669.method2056(var37);
        }
        if (arg2 == 42) {
            class192 var38 = class192.method1750(class189.field2312, field669.field1284);
            var38.field2356.method3422(arg1);
            var38.field2356.method3453(arg0);
            var38.field2356.method3402(arg3);
            field669.method2056(var38);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 25) {
            class229 var39 = class229.method3661(arg1, arg0);
            if (var39 != null) {
                method1143();
                method293(arg1, arg0, class230.method3749(method12(var39)), var39.field2770);
                field783 = 0;
                field780 = method3394(var39);
                if (field780 == null) {
                    field780 = class236.field2980;
                }
                if (var39.field2643) {
                    field781 = var39.field2723 + class82.method2442(16777215);
                } else {
                    field781 = class82.method2442(65280) + var39.field2766 + class82.method2442(16777215);
                }
            }
            return;
        }
        if (arg2 == 26) {
            method181();
        }
        if (arg2 == 15) {
            class67 var40 = field738[arg3];
            if (var40 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var41 = class192.method1750(class189.field2285, field669.field1284);
                var41.field2356.method3472(Statics.field3180);
                var41.field2356.method3445(class45.field365[82] ? 1 : 0);
                var41.field2356.method3453(field676);
                var41.field2356.method3402(arg3);
                field669.method2056(var41);
            }
        }
        if (arg2 == 31) {
            class192 var42 = class192.method1750(class189.field2250, field669.field1284);
            var42.field2356.method3508(arg1);
            var42.field2356.method3472(Statics.field2229);
            var42.field2356.method3454(Statics.field3368);
            var42.field2356.method3452(Statics.field1131);
            var42.field2356.method3452(arg0);
            var42.field2356.method3454(arg3);
            field669.method2056(var42);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class229 var43 = class229.method3661(arg1, arg0);
            if (var43 != null) {
                method3202(arg3, arg1, arg0, var43.field2770, arg5);
            }
        }
        if (arg2 == 58) {
            class229 var44 = class229.method3661(arg1, arg0);
            if (var44 != null) {
                class192 var45 = class192.method1750(class189.field2230, field669.field1284);
                var45.field2356.method3452(field676);
                var45.field2356.method3472(arg1);
                var45.field2356.method3452(field873);
                var45.field2356.method3454(arg0);
                var45.field2356.method3422(Statics.field3180);
                var45.field2356.method3454(var44.field2770);
                field669.method2056(var45);
            }
        }
        if (arg2 == 12) {
            class80 var46 = field664[arg3];
            if (var46 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var47 = class192.method1750(class189.field2289, field669.field1284);
                var47.field2356.method3402(arg3);
                var47.field2356.method3443(class45.field365[82] ? 1 : 0);
                field669.method2056(var47);
            }
        }
        if (arg2 == 13) {
            class80 var48 = field664[arg3];
            if (var48 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var49 = class192.method1750(class189.field2261, field669.field1284);
                var49.field2356.method3565(class45.field365[82] ? 1 : 0);
                var49.field2356.method3453(arg3);
                field669.method2056(var49);
            }
        }
        if (arg2 == 1003) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            class80 var50 = field664[arg3];
            if (var50 != null) {
                class268 var51 = var50.field1097;
                if (var51.field3563 != null) {
                    var51 = var51.method4713();
                }
                if (var51 != null) {
                    class192 var52 = class192.method1750(class189.field2260, field669.field1284);
                    var52.field2356.method3453(var51.field3537);
                    field669.method2056(var52);
                }
            }
        }
        if (arg2 == 1) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var53 = class192.method1750(class189.field2299, field669.field1284);
            var53.field2356.method3454(Statics.field1088 + arg1);
            var53.field2356.method3452(Statics.field3368);
            var53.field2356.method3443(class45.field365[82] ? 1 : 0);
            var53.field2356.method3461(Statics.field2229);
            var53.field2356.method3454(Statics.field405 + arg0);
            var53.field2356.method3402(arg3);
            var53.field2356.method3452(Statics.field1131);
            field669.method2056(var53);
        }
        if (arg2 == 28) {
            class192 var54 = class192.method1750(class189.field2282, field669.field1284);
            var54.field2356.method3422(arg1);
            field669.method2056(var54);
            class229 var55 = class229.method3345(arg1);
            if (var55.field2732 != null && var55.field2732[0][0] == 5) {
                int var56 = var55.field2732[0][1];
                class224.field2601[var56] = 1 - class224.field2601[var56];
                method4292(var56);
            }
        }
        if (arg2 == 32) {
            class192 var57 = class192.method1750(class189.field2233, field669.field1284);
            var57.field2356.method3508(Statics.field3180);
            var57.field2356.method3422(arg1);
            var57.field2356.method3402(arg0);
            var57.field2356.method3452(arg3);
            var57.field2356.method3452(field676);
            field669.method2056(var57);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 17) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var58 = class192.method1750(class189.field2309, field669.field1284);
            var58.field2356.method3508(Statics.field3180);
            var58.field2356.method3402(field676);
            var58.field2356.method3453(Statics.field1088 + arg1);
            var58.field2356.method3453(Statics.field405 + arg0);
            var58.field2356.method3443(class45.field365[82] ? 1 : 0);
            var58.field2356.method3452(arg3);
            field669.method2056(var58);
        }
        if (arg2 == 14) {
            class67 var59 = field738[arg3];
            if (var59 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var60 = class192.method1750(class189.field2311, field669.field1284);
                var60.field2356.method3454(Statics.field3368);
                var60.field2356.method3445(class45.field365[82] ? 1 : 0);
                var60.field2356.method3508(Statics.field2229);
                var60.field2356.method3402(arg3);
                var60.field2356.method3402(Statics.field1131);
                field669.method2056(var60);
            }
        }
        if (arg2 == 36) {
            class192 var61 = class192.method1750(class189.field2302, field669.field1284);
            var61.field2356.method3454(arg3);
            var61.field2356.method3422(arg1);
            var61.field2356.method3454(arg0);
            field669.method2056(var61);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 30 && field788 == null) {
            method2809(arg1, arg0);
            field788 = class229.method3661(arg1, arg0);
            method272(field788);
        }
        if (arg2 == 7) {
            class80 var62 = field664[arg3];
            if (var62 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var63 = class192.method1750(class189.field2253, field669.field1284);
                var63.field2356.method3454(Statics.field1131);
                var63.field2356.method3402(Statics.field3368);
                var63.field2356.method3454(arg3);
                var63.field2356.method3444(class45.field365[82] ? 1 : 0);
                var63.field2356.method3422(Statics.field2229);
                field669.method2056(var63);
            }
        }
        if (arg2 == 50) {
            class67 var64 = field738[arg3];
            if (var64 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var65 = class192.method1750(class189.field2305, field669.field1284);
                var65.field2356.method3445(class45.field365[82] ? 1 : 0);
                var65.field2356.method3452(arg3);
                field669.method2056(var65);
            }
        }
        if (arg2 == 24) {
            class229 var66 = class229.method3345(arg1);
            boolean var67 = true;
            if (var66.field2648 > 0) {
                var67 = method2706(var66);
            }
            if (var67) {
                class192 var68 = class192.method1750(class189.field2282, field669.field1284);
                var68.field2356.method3422(arg1);
                field669.method2056(var68);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field533.method5818(arg2, arg3, new class225(arg0), new class225(arg1));
        }
        if (arg2 == 48) {
            class67 var69 = field738[arg3];
            if (var69 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var70 = class192.method1750(class189.field2267, field669.field1284);
                var70.field2356.method3443(class45.field365[82] ? 1 : 0);
                var70.field2356.method3453(arg3);
                field669.method2056(var70);
            }
        }
        if (arg2 == 37) {
            class192 var71 = class192.method1750(class189.field2288, field669.field1284);
            var71.field2356.method3422(arg1);
            var71.field2356.method3402(arg0);
            var71.field2356.method3402(arg3);
            field669.method2056(var71);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 23) {
            if (field758) {
                Statics.field582.method2851();
            } else {
                Statics.field582.method2850(Statics.field1394, arg0, arg1, true);
            }
        }
        if (arg2 == 2) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var72 = class192.method1750(class189.field2321, field669.field1284);
            var72.field2356.method3565(class45.field365[82] ? 1 : 0);
            var72.field2356.method3402(Statics.field405 + arg0);
            var72.field2356.method3453(arg3);
            var72.field2356.method3472(Statics.field3180);
            var72.field2356.method3402(field676);
            var72.field2356.method3452(Statics.field1088 + arg1);
            field669.method2056(var72);
        }
        if (arg2 == 6) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var73 = class192.method1750(class189.field2258, field669.field1284);
            var73.field2356.method3443(class45.field365[82] ? 1 : 0);
            var73.field2356.method3453(Statics.field1088 + arg1);
            var73.field2356.method3453(Statics.field405 + arg0);
            var73.field2356.method3452(arg3);
            field669.method2056(var73);
        }
        if (arg2 == 5) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var74 = class192.method1750(class189.field2319, field669.field1284);
            var74.field2356.method3454(Statics.field405 + arg0);
            var74.field2356.method3453(arg3);
            var74.field2356.method3454(Statics.field1088 + arg1);
            var74.field2356.method3443(class45.field365[82] ? 1 : 0);
            field669.method2056(var74);
        }
        if (arg2 == 1005) {
            class229 var75 = class229.method3345(arg1);
            if (var75 == null || var75.field2769[arg0] < 100000) {
                class192 var76 = class192.method1750(class189.field2254, field669.field1284);
                var76.field2356.method3452(arg3);
                field669.method2056(var76);
            } else {
                class92.method202(27, "", var75.field2769[arg0] + " x " + class266.method4129(arg3).field3482);
            }
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 35) {
            class192 var77 = class192.method1750(class189.field2291, field669.field1284);
            var77.field2356.method3461(arg1);
            var77.field2356.method3454(arg0);
            var77.field2356.method3454(arg3);
            field669.method2056(var77);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 41) {
            class192 var78 = class192.method1750(class189.field2295, field669.field1284);
            var78.field2356.method3461(arg1);
            var78.field2356.method3453(arg0);
            var78.field2356.method3402(arg3);
            field669.method2056(var78);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 29) {
            class192 var79 = class192.method1750(class189.field2282, field669.field1284);
            var79.field2356.method3422(arg1);
            field669.method2056(var79);
            class229 var80 = class229.method3345(arg1);
            if (var80.field2732 != null && var80.field2732[0][0] == 5) {
                int var81 = var80.field2732[0][1];
                if (class224.field2601[var81] != var80.field2764[0]) {
                    class224.field2601[var81] = var80.field2764[0];
                    method4292(var81);
                }
            }
        }
        if (arg2 == 51) {
            class67 var82 = field738[arg3];
            if (var82 != null) {
                field723 = arg6;
                field724 = arg7;
                field880 = 2;
                field647 = 0;
                field714 = arg0;
                field853 = arg1;
                class192 var83 = class192.method1750(class189.field2280, field669.field1284);
                var83.field2356.method3444(class45.field365[82] ? 1 : 0);
                var83.field2356.method3454(arg3);
                field669.method2056(var83);
            }
        }
        if (arg2 == 33) {
            class192 var84 = class192.method1750(class189.field2313, field669.field1284);
            var84.field2356.method3452(arg3);
            var84.field2356.method3508(arg1);
            var84.field2356.method3402(arg0);
            field669.method2056(var84);
            field700 = 0;
            Statics.field1862 = class229.method3345(arg1);
            field729 = arg0;
        }
        if (arg2 == 3) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var85 = class192.method1750(class189.field2240, field669.field1284);
            var85.field2356.method3402(Statics.field1088 + arg1);
            var85.field2356.method3445(class45.field365[82] ? 1 : 0);
            var85.field2356.method3453(arg3);
            var85.field2356.method3454(Statics.field405 + arg0);
            field669.method2056(var85);
        }
        if (arg2 == 20) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var86 = class192.method1750(class189.field2236, field669.field1284);
            var86.field2356.method3452(Statics.field1088 + arg1);
            var86.field2356.method3445(class45.field365[82] ? 1 : 0);
            var86.field2356.method3452(Statics.field405 + arg0);
            var86.field2356.method3452(arg3);
            field669.method2056(var86);
        }
        if (arg2 == 21) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            field714 = arg0;
            field853 = arg1;
            class192 var87 = class192.method1750(class189.field2259, field669.field1284);
            var87.field2356.method3453(Statics.field1088 + arg1);
            var87.field2356.method3452(arg3);
            var87.field2356.method3402(Statics.field405 + arg0);
            var87.field2356.method3445(class45.field365[82] ? 1 : 0);
            field669.method2056(var87);
        }
        if (arg2 == 1004) {
            field723 = arg6;
            field724 = arg7;
            field880 = 2;
            field647 = 0;
            class192 var88 = class192.method1750(class189.field2254, field669.field1284);
            var88.field2356.method3452(arg3);
            field669.method2056(var88);
        }
        if (field783 != 0) {
            field783 = 0;
            method272(class229.method3345(Statics.field2229));
        }
        if (field777) {
            method1143();
        }
        if (Statics.field1862 != null && field700 == 0) {
            method272(Statics.field1862);
        }
    }

    @ObfuscatedName("ah.hc(ILjava/lang/String;I)V")
    public static void method523(int arg0, String arg1) {
        int var2 = class90.field1225;
        int[] var3 = class90.field1238;
        boolean var4 = false;
        class295 var5 = new class295(arg1, Statics.field366);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field738[var3[var6]];
            if (var7 != null && Statics.field389 != var7 && var7.field599 != null && var7.field599.equals(var5)) {
                if (arg0 == 1) {
                    class192 var8 = class192.method1750(class189.field2277, field669.field1284);
                    var8.field2356.method3402(var3[var6]);
                    var8.field2356.method3444(0);
                    field669.method2056(var8);
                } else if (arg0 == 4) {
                    class192 var9 = class192.method1750(class189.field2257, field669.field1284);
                    var9.field2356.method3454(var3[var6]);
                    var9.field2356.method3444(0);
                    field669.method2056(var9);
                } else if (arg0 == 6) {
                    class192 var10 = class192.method1750(class189.field2323, field669.field1284);
                    var10.field2356.method3453(var3[var6]);
                    var10.field2356.method3445(0);
                    field669.method2056(var10);
                } else if (arg0 == 7) {
                    class192 var11 = class192.method1750(class189.field2305, field669.field1284);
                    var11.field2356.method3445(0);
                    var11.field2356.method3452(var3[var6]);
                    field669.method2056(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class92.method202(4, "", class236.field2994 + arg1);
        }
    }

    @ObfuscatedName("v.hk(IIIII)V")
    public static void method293(int arg0, int arg1, int arg2, int arg3) {
        class229 var4 = class229.method3661(arg0, arg1);
        if (var4 != null && var4.field2647 != null) {
            class63 var5 = new class63();
            var5.field558 = var4;
            var5.field554 = var4.field2647;
            class77.method4251(var5);
        }
        field873 = arg3;
        field777 = true;
        Statics.field3180 = arg0;
        field676 = arg1;
        Statics.field1589 = arg2;
        method272(var4);
    }

    @ObfuscatedName("br.if(B)V")
    public static void method1143() {
        if (!field777) {
            return;
        }
        class229 var0 = class229.method3661(Statics.field3180, field676);
        if (var0 != null && var0.field2738 != null) {
            class63 var1 = new class63();
            var1.field558 = var0;
            var1.field554 = var0.field2738;
            class77.method4251(var1);
        }
        field777 = false;
        method272(var0);
    }

    @ObfuscatedName("eb.id(III)V")
    public static void method2809(int arg0, int arg1) {
        class192 var2 = class192.method1750(class189.field2300, field669.field1284);
        var2.field2356.method3472(arg0);
        var2.field2356.method3453(arg1);
        field669.method2056(var2);
    }

    @ObfuscatedName("fo.ie(IIIILjava/lang/String;I)V")
    public static void method3202(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class229 var5 = class229.method3661(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2750 != null) {
            class63 var6 = new class63();
            var6.field558 = var5;
            var6.field548 = arg0;
            var6.field552 = arg4;
            var6.field554 = var5.field2750;
            class77.method4251(var6);
        }
        boolean var7 = true;
        if (var5.field2648 > 0) {
            var7 = method2706(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method12(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class192 var11 = class192.method1750(class189.field2298, field669.field1284);
            var11.field2356.method3422(arg1);
            var11.field2356.method3402(arg2);
            var11.field2356.method3402(arg3);
            field669.method2056(var11);
        }
        if (arg0 == 2) {
            class192 var12 = class192.method1750(class189.field2251, field669.field1284);
            var12.field2356.method3422(arg1);
            var12.field2356.method3402(arg2);
            var12.field2356.method3402(arg3);
            field669.method2056(var12);
        }
        if (arg0 == 3) {
            class192 var13 = class192.method1750(class189.field2278, field669.field1284);
            var13.field2356.method3422(arg1);
            var13.field2356.method3402(arg2);
            var13.field2356.method3402(arg3);
            field669.method2056(var13);
        }
        if (arg0 == 4) {
            class192 var14 = class192.method1750(class189.field2249, field669.field1284);
            var14.field2356.method3422(arg1);
            var14.field2356.method3402(arg2);
            var14.field2356.method3402(arg3);
            field669.method2056(var14);
        }
        if (arg0 == 5) {
            class192 var15 = class192.method1750(class189.field2270, field669.field1284);
            var15.field2356.method3422(arg1);
            var15.field2356.method3402(arg2);
            var15.field2356.method3402(arg3);
            field669.method2056(var15);
        }
        if (arg0 == 6) {
            class192 var16 = class192.method1750(class189.field2296, field669.field1284);
            var16.field2356.method3422(arg1);
            var16.field2356.method3402(arg2);
            var16.field2356.method3402(arg3);
            field669.method2056(var16);
        }
        if (arg0 == 7) {
            class192 var17 = class192.method1750(class189.field2315, field669.field1284);
            var17.field2356.method3422(arg1);
            var17.field2356.method3402(arg2);
            var17.field2356.method3402(arg3);
            field669.method2056(var17);
        }
        if (arg0 == 8) {
            class192 var18 = class192.method1750(class189.field2244, field669.field1284);
            var18.field2356.method3422(arg1);
            var18.field2356.method3402(arg2);
            var18.field2356.method3402(arg3);
            field669.method2056(var18);
        }
        if (arg0 == 9) {
            class192 var19 = class192.method1750(class189.field2314, field669.field1284);
            var19.field2356.method3422(arg1);
            var19.field2356.method3402(arg2);
            var19.field2356.method3402(arg3);
            field669.method2056(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class192 var20 = class192.method1750(class189.field2283, field669.field1284);
        var20.field2356.method3422(arg1);
        var20.field2356.method3402(arg2);
        var20.field2356.method3402(arg3);
        field669.method2056(var20);
    }

    @ObfuscatedName("bq.in(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method968(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method174(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("j.il(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method174(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field758 || field759 >= 500) {
            return;
        }
        field776[field759] = arg0;
        field694[field759] = arg1;
        field762[field759] = arg2;
        field763[field759] = arg3;
        field646[field759] = arg4;
        field736[field759] = arg5;
        field818[field759] = arg6;
        field759++;
    }

    @ObfuscatedName("al.ij(II)Z")
    public static boolean method581(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ap.iy(IIIIB)V")
    public static final void method665(int arg0, int arg1, int arg2, int arg3) {
        if (field783 == 0 && !field777) {
            method968(class236.field2871, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class129.field1725;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class129.method117(var4);
                    int var12 = (int) (var4 >>> 7 & 0x7FL);
                    class67 var14 = field738[field636];
                    method74(var14, field636, var11, var12);
                }
                return;
            }
            long var15 = class129.field1723[var8];
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var19 = class129.method664(var8);
                    long var20 = class129.field1723[var8];
                    int var22 = (int) (var20 >>> 7 & 0x7FL);
                    int var24 = var22;
                    int var25 = class129.method63(var8);
                    int var26 = class129.method1643(var8);
                    if (var25 == 2 && Statics.field582.method2968(Statics.field1394, var19, var22, var15) >= 0) {
                        class265 var27 = class265.method763(var26);
                        if (var27.field3463 != null) {
                            var27 = var27.method4601();
                        }
                        if (var27 == null) {
                            break label277;
                        }
                        if (field783 == 1) {
                            method968(class236.field2924, field728 + " " + class82.field1118 + " " + class82.method2442(65535) + var27.field3432, 1, var26, var19, var22);
                        } else if (!field777) {
                            String[] var28 = var27.field3452;
                            if (var28 != null) {
                                for (int var29 = 4; var29 >= 0; var29--) {
                                    if (var28[var29] != null) {
                                        short var30 = 0;
                                        if (var29 == 0) {
                                            var30 = 3;
                                        }
                                        if (var29 == 1) {
                                            var30 = 4;
                                        }
                                        if (var29 == 2) {
                                            var30 = 5;
                                        }
                                        if (var29 == 3) {
                                            var30 = 6;
                                        }
                                        if (var29 == 4) {
                                            var30 = 1001;
                                        }
                                        method968(var28[var29], class82.method2442(65535) + var27.field3432, var30, var26, var19, var24);
                                    }
                                }
                            }
                            method968(class236.field2996, class82.method2442(65535) + var27.field3432, 1002, var27.field3423, var19, var24);
                        } else if ((Statics.field1589 & 0x4) == 4) {
                            method968(field780, field781 + " " + class82.field1118 + " " + class82.method2442(65535) + var27.field3432, 2, var26, var19, var22);
                        }
                    }
                    if (var25 == 1) {
                        class80 var31 = field664[var26];
                        if (var31 == null) {
                            break label277;
                        }
                        if (var31.field1097.field3539 == 1 && (var31.field957 & 0x7F) == 64 && (var31.field916 & 0x7F) == 64) {
                            for (int var32 = 0; var32 < field665; var32++) {
                                class80 var33 = field664[field666[var32]];
                                if (var33 != null && var31 != var33 && var33.field1097.field3539 == 1 && var31.field957 == var33.field957 && var31.field916 == var33.field916) {
                                    method2615(var33.field1097, field666[var32], var19, var24);
                                }
                            }
                            int var34 = class90.field1225;
                            int[] var35 = class90.field1238;
                            for (int var36 = 0; var36 < var34; var36++) {
                                class67 var37 = field738[var35[var36]];
                                if (var37 != null && var31.field957 == var37.field957 && var31.field916 == var37.field916) {
                                    method74(var37, var35[var36], var19, var24);
                                }
                            }
                        }
                        method2615(var31.field1097, var26, var19, var24);
                    }
                    if (var25 == 0) {
                        class67 var38 = field738[var26];
                        if (var38 == null) {
                            break label277;
                        }
                        if ((var38.field957 & 0x7F) == 64 && (var38.field916 & 0x7F) == 64) {
                            for (int var39 = 0; var39 < field665; var39++) {
                                class80 var40 = field664[field666[var39]];
                                if (var40 != null && var40.field1097.field3539 == 1 && var38.field957 == var40.field957 && var38.field916 == var40.field916) {
                                    method2615(var40.field1097, field666[var39], var19, var24);
                                }
                            }
                            int var41 = class90.field1225;
                            int[] var42 = class90.field1238;
                            for (int var43 = 0; var43 < var41; var43++) {
                                class67 var44 = field738[var42[var43]];
                                if (var44 != null && var38 != var44 && var38.field957 == var44.field957 && var38.field916 == var44.field916) {
                                    method74(var44, var42[var43], var19, var24);
                                }
                            }
                        }
                        if (field636 == var26) {
                            var4 = var15;
                        } else {
                            method74(var38, var26, var19, var24);
                        }
                    }
                    if (var25 == 3) {
                        class273 var45 = field893[Statics.field1394][var19][var24];
                        if (var45 != null) {
                            for (class88 var46 = (class88) var45.method4857(); var46 != null; var46 = (class88) var45.method4859()) {
                                class266 var47 = class266.method4129(var46.field1215);
                                if (field783 == 1) {
                                    method968(class236.field2924, field728 + " " + class82.field1118 + " " + class82.method2442(16748608) + var47.field3482, 16, var46.field1215, var19, var24);
                                } else if (!field777) {
                                    String[] var48 = var47.field3509;
                                    for (int var49 = 4; var49 >= 0; var49--) {
                                        if (var48 != null && var48[var49] != null) {
                                            byte var50 = 0;
                                            if (var49 == 0) {
                                                var50 = 18;
                                            }
                                            if (var49 == 1) {
                                                var50 = 19;
                                            }
                                            if (var49 == 2) {
                                                var50 = 20;
                                            }
                                            if (var49 == 3) {
                                                var50 = 21;
                                            }
                                            if (var49 == 4) {
                                                var50 = 22;
                                            }
                                            method968(var48[var49], class82.method2442(16748608) + var47.field3482, var50, var46.field1215, var19, var24);
                                        } else if (var49 == 2) {
                                            method968(class236.field2908, class82.method2442(16748608) + var47.field3482, 20, var46.field1215, var19, var24);
                                        }
                                    }
                                    method968(class236.field2996, class82.method2442(16748608) + var47.field3482, 1004, var46.field1215, var19, var24);
                                } else if ((Statics.field1589 & 0x1) == 1) {
                                    method968(field780, field781 + " " + class82.field1118 + " " + class82.method2442(16748608) + var47.field3482, 17, var46.field1215, var19, var24);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("dj.is(Ljz;IIIB)V")
    public static final void method2615(class268 arg0, int arg1, int arg2, int arg3) {
        if (field759 >= 400) {
            return;
        }
        if (arg0.field3563 != null) {
            arg0 = arg0.method4713();
        }
        if (arg0 == null || !arg0.field3566 || arg0.field3541 && field792 != arg1) {
            return;
        }
        String var4 = arg0.field3538;
        if (arg0.field3546 != 0) {
            int var6 = arg0.field3546;
            int var7 = Statics.field389.field592;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class82.method2442(16711680);
            } else if (var8 < -6) {
                var9 = class82.method2442(16723968);
            } else if (var8 < -3) {
                var9 = class82.method2442(16740352);
            } else if (var8 < 0) {
                var9 = class82.method2442(16756736);
            } else if (var8 > 9) {
                var9 = class82.method2442(65280);
            } else if (var8 > 6) {
                var9 = class82.method2442(4259584);
            } else if (var8 > 3) {
                var9 = class82.method2442(8453888);
            } else if (var8 > 0) {
                var9 = class82.method2442(12648192);
            } else {
                var9 = class82.method2442(16776960);
            }
            var4 = var4 + var9 + " " + class82.field1116 + class236.field3001 + arg0.field3546 + class82.field1117;
        }
        if (arg0.field3541 && field767) {
            method968(class236.field2996, class82.method2442(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field783 == 1) {
            method968(class236.field2924, field728 + " " + class82.field1118 + " " + class82.method2442(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field777) {
            int var10 = arg0.field3541 && field767 ? 2000 : 0;
            String[] var11 = arg0.field3553;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class236.field3100)) {
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
                        method968(var11[var12], class82.method2442(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class236.field3100)) {
                        short var15 = 0;
                        if (field898 != class85.field1141) {
                            if (field898 == class85.field1140 || field898 == class85.field1144 && arg0.field3546 > Statics.field389.field592) {
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
                            method968(var11[var14], class82.method2442(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3541 || !field767) {
                method968(class236.field2996, class82.method2442(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1589 & 0x2) == 2) {
            method968(field780, field781 + " " + class82.field1118 + " " + class82.method2442(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("e.ik(Lbr;IIII)V")
    public static final void method74(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field389 == arg0 || field759 >= 400) {
            return;
        }
        String var9;
        if (arg0.field589 == 0) {
            String var4 = arg0.field591[0] + arg0.field599 + arg0.field591[1];
            int var5 = arg0.field592;
            int var6 = Statics.field389.field592;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class82.method2442(16711680);
            } else if (var7 < -6) {
                var8 = class82.method2442(16723968);
            } else if (var7 < -3) {
                var8 = class82.method2442(16740352);
            } else if (var7 < 0) {
                var8 = class82.method2442(16756736);
            } else if (var7 > 9) {
                var8 = class82.method2442(65280);
            } else if (var7 > 6) {
                var8 = class82.method2442(4259584);
            } else if (var7 > 3) {
                var8 = class82.method2442(8453888);
            } else if (var7 > 0) {
                var8 = class82.method2442(12648192);
            } else {
                var8 = class82.method2442(16776960);
            }
            var9 = var4 + var8 + " " + class82.field1116 + class236.field3001 + arg0.field592 + class82.field1117 + arg0.field591[2];
        } else {
            var9 = arg0.field591[0] + arg0.field599 + arg0.field591[1] + " " + class82.field1116 + class236.field3002 + arg0.field589 + class82.field1117 + arg0.field591[2];
        }
        if (field783 == 1) {
            method968(class236.field2924, field728 + " " + class82.field1118 + " " + class82.method2442(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field777) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field746[var10] != null) {
                    short var11 = 0;
                    if (field746[var10].equalsIgnoreCase(class236.field3100)) {
                        if (field649 == class85.field1141) {
                            continue;
                        }
                        if (field649 == class85.field1140 || field649 == class85.field1144 && arg0.field592 > Statics.field389.field592) {
                            var11 = 2000;
                        }
                        if (Statics.field389.field611 != 0 && arg0.field611 != 0) {
                            if (Statics.field389.field611 == arg0.field611) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field747[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field726[var10] + var11;
                    method968(field746[var10], class82.method2442(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1589 & 0x8) == 8) {
            method968(field780, field781 + " " + class82.field1118 + " " + class82.method2442(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field759; var14++) {
            if (field762[var14] == 23) {
                field694[var14] = class82.method2442(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bv.iz(IIIIIIIIB)V")
    public static final void method1812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class229.method2527(arg0)) {
            Statics.field3623 = null;
            method706(Statics.field2634[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3623 != null) {
                method706(Statics.field3623, -1412584499, arg1, arg2, arg3, arg4, Statics.field479, Statics.field1969, arg7);
                Statics.field3623 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field864[var8] = true;
            }
        } else {
            field864[arg7] = true;
        }
    }

    @ObfuscatedName("az.ir([Lho;IIIIIIIII)V")
    public static final void method706(class229[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class324.method5506(arg2, arg3, arg4, arg5);
        class131.method2766();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class229 var10 = arg0[var9];
            if (var10 != null && (var10.field2663 == arg1 || arg1 == -1412584499 && field887 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field712[field825] = var10.field2762 + arg6;
                    field849[field825] = var10.field2707 + arg7;
                    field832[field825] = var10.field2765;
                    field833[field825] = var10.field2678;
                    var11 = ++field825 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2726 = var11;
                var10.field2730 = field633;
                if (!var10.field2643 || !method3322(var10)) {
                    if (var10.field2648 > 0) {
                        method169(var10);
                    }
                    int var12 = var10.field2762 + arg6;
                    int var13 = var10.field2707 + arg7;
                    int var14 = var10.field2778;
                    if (field887 == var10) {
                        if (arg1 != -1412584499 && !var10.field2728) {
                            Statics.field3623 = arg0;
                            Statics.field479 = arg6;
                            Statics.field1969 = arg7;
                            continue;
                        }
                        if (field806 && field800) {
                            int var15 = class54.field456;
                            int var16 = class54.field463;
                            int var17 = var15 - field797;
                            int var18 = var16 - field798;
                            if (var17 < field801) {
                                var17 = field801;
                            }
                            if (var10.field2765 + var17 > field801 + field796.field2765) {
                                var17 = field801 + field796.field2765 - var10.field2765;
                            }
                            if (var18 < field802) {
                                var18 = field802;
                            }
                            if (var10.field2678 + var18 > field802 + field796.field2678) {
                                var18 = field802 + field796.field2678 - var10.field2678;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2728) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2646 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2646 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2765 + var12;
                        int var26 = var10.field2678 + var13;
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
                        int var29 = var10.field2765 + var12;
                        int var30 = var10.field2678 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2643 || var19 < var21 && var20 < var22) {
                        if (var10.field2648 != 0) {
                            if (var10.field2648 == 1336) {
                                if (field639) {
                                    var13 += 15;
                                    Statics.field384.method5209("Fps:" + field430, var10.field2765 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field626) {
                                        var33 = 16711680;
                                    }
                                    Statics.field384.method5209("Mem:" + var32 + "k", var10.field2765 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2648 == 1337) {
                                field761 = var12;
                                field772 = var13;
                                method662(var12, var13, var10.field2765, var10.field2678);
                                field864[var10.field2726] = true;
                                class324.method5506(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2648 == 1338) {
                                method1051(var10, var12, var13, var11);
                                class324.method5506(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2648 == 1339) {
                                method273(var10, var12, var13, var11);
                                class324.method5506(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2648 == 1400) {
                                Statics.field533.method5750(var12, var13, var10.field2765, var10.field2678, field633);
                            }
                            if (var10.field2648 == 1401) {
                                Statics.field533.method5780(var12, var13, var10.field2765, var10.field2678);
                            }
                            if (var10.field2648 == 1402) {
                                Statics.field86.method1617(var12, field633);
                            }
                        }
                        if (var10.field2646 == 0) {
                            if (!var10.field2643 && method3322(var10) && Statics.field2065 != var10) {
                                continue;
                            }
                            if (!var10.field2643) {
                                if (var10.field2734 > var10.field2668 - var10.field2678) {
                                    var10.field2734 = var10.field2668 - var10.field2678;
                                }
                                if (var10.field2734 < 0) {
                                    var10.field2734 = 0;
                                }
                            }
                            method706(arg0, var10.field2644, var19, var20, var21, var22, var12 - var10.field2665, var13 - var10.field2734, var11);
                            if (var10.field2774 != null) {
                                method706(var10.field2774, var10.field2644, var19, var20, var21, var22, var12 - var10.field2665, var13 - var10.field2734, var11);
                            }
                            class62 var34 = (class62) field703.method5416((long) var10.field2644);
                            if (var34 != null) {
                                method1812(var34.field539, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class324.method5506(arg2, arg3, arg4, arg5);
                            class131.method2766();
                        }
                        if (field765 || field829[var11] || field834 > 1) {
                            if (var10.field2646 == 0 && !var10.field2643 && var10.field2668 > var10.field2678) {
                                method131(var10.field2765 + var12, var13, var10.field2734, var10.field2678, var10.field2668);
                            }
                            if (var10.field2646 != 1) {
                                if (var10.field2646 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2717; var36++) {
                                        for (int var37 = 0; var37 < var10.field2655; var37++) {
                                            int var38 = (var10.field2777 + 32) * var37 + var12;
                                            int var39 = (var10.field2772 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2713[var35];
                                                var39 += var10.field2714[var35];
                                            }
                                            if (var10.field2768[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2768[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field387 == var10 && field732 == var35) {
                                                    class328 var43;
                                                    if (field783 == 1 && Statics.field3368 == var35 && Statics.field2229 == var10.field2644) {
                                                        var43 = class266.method4051(var42, var10.field2769[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class266.method4051(var42, var10.field2769[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method272(var10);
                                                    } else if (Statics.field387 == var10 && field732 == var35) {
                                                        int var44 = class54.field456 - field731;
                                                        int var45 = class54.field463 - field691;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field735 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5589(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class229 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class324.field3872 && var46.field2734 > 0) {
                                                                int var47 = field684 * (class324.field3872 - var39 - var45) / 3;
                                                                if (var47 > field684 * 10) {
                                                                    var47 = field684 * 10;
                                                                }
                                                                if (var47 > var46.field2734) {
                                                                    var47 = var46.field2734;
                                                                }
                                                                var46.field2734 -= var47;
                                                                field691 += var47;
                                                                method272(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class324.field3875 && var46.field2734 < var46.field2668 - var46.field2678) {
                                                                int var48 = field684 * (var39 + var45 + 32 - class324.field3875) / 3;
                                                                if (var48 > field684 * 10) {
                                                                    var48 = field684 * 10;
                                                                }
                                                                if (var48 > var46.field2668 - var46.field2678 - var46.field2734) {
                                                                    var48 = var46.field2668 - var46.field2678 - var46.field2734;
                                                                }
                                                                var46.field2734 += var48;
                                                                field691 -= var48;
                                                                method272(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field1862 == var10 && field729 == var35) {
                                                        var43.method5589(var38, var39, 128);
                                                    } else {
                                                        var43.method5584(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2715 != null && var35 < 20) {
                                                class328 var49 = var10.method4065(var35);
                                                if (var49 != null) {
                                                    var49.method5584(var38, var39);
                                                } else if (class229.field2642) {
                                                    method272(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2646 == 3) {
                                    int var50;
                                    if (Statics.method4143(var10)) {
                                        var50 = var10.field2670;
                                        if (Statics.field2065 == var10 && var10.field2672 != 0) {
                                            var50 = var10.field2672;
                                        }
                                    } else {
                                        var50 = var10.field2669;
                                        if (Statics.field2065 == var10 && var10.field2671 != 0) {
                                            var50 = var10.field2671;
                                        }
                                    }
                                    if (var10.field2760) {
                                        switch(var10.field2666.field3884) {
                                            case 1:
                                                class324.method5469(var12, var13, var10.field2765, var10.field2678, var10.field2669, var10.field2670);
                                                break;
                                            case 2:
                                                class324.method5470(var12, var13, var10.field2765, var10.field2678, var10.field2669, var10.field2670, 255 - (var10.field2778 & 0xFF), 255 - (var10.field2676 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class324.method5468(var12, var13, var10.field2765, var10.field2678, var50);
                                                } else {
                                                    class324.method5471(var12, var13, var10.field2765, var10.field2678, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class324.method5466(var12, var13, var10.field2765, var10.field2678, var50);
                                    } else {
                                        class324.method5478(var12, var13, var10.field2765, var10.field2678, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2646 == 4) {
                                    class302 var51 = var10.method4064();
                                    if (var51 != null) {
                                        String var52 = var10.field2705;
                                        int var53;
                                        if (Statics.method4143(var10)) {
                                            var53 = var10.field2670;
                                            if (Statics.field2065 == var10 && var10.field2672 != 0) {
                                                var53 = var10.field2672;
                                            }
                                            if (var10.field2706.length() > 0) {
                                                var52 = var10.field2706;
                                            }
                                        } else {
                                            var53 = var10.field2669;
                                            if (Statics.field2065 == var10 && var10.field2671 != 0) {
                                                var53 = var10.field2671;
                                            }
                                        }
                                        if (var10.field2643 && var10.field2770 != -1) {
                                            class266 var54 = class266.method4129(var10.field2770);
                                            var52 = var54.field3482;
                                            if (var52 == null) {
                                                var52 = class236.field2980;
                                            }
                                            if ((var54.field3493 == 1 || var10.field2720 != 1) && var10.field2720 != -1) {
                                                var52 = class82.method2442(16748608) + var52 + class82.field1122 + " " + 'x' + method71(var10.field2720);
                                            }
                                        }
                                        if (field788 == var10) {
                                            var52 = class236.field3003;
                                            var53 = var10.field2669;
                                        }
                                        if (!var10.field2643) {
                                            var52 = method1056(var52, var10);
                                        }
                                        var51.method5211(var52, var12, var13, var10.field2765, var10.field2678, var53, var10.field2710 ? 0 : -1, var10.field2708, var10.field2709, var10.field2763);
                                    } else if (class229.field2642) {
                                        method272(var10);
                                    }
                                } else if (var10.field2646 == 5) {
                                    if (var10.field2643) {
                                        class328 var56;
                                        if (var10.field2770 == -1) {
                                            var56 = var10.method4063(false);
                                        } else {
                                            var56 = class266.method4051(var10.field2770, var10.field2720, var10.field2673, var10.field2684, var10.field2729, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3901;
                                            int var58 = var56.field3902;
                                            if (var10.field2682) {
                                                class324.method5461(var12, var13, var10.field2765 + var12, var10.field2678 + var13);
                                                int var59 = (var10.field2765 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2678 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2662 != 0) {
                                                            var56.method5602(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2662, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5584(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5589(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class324.method5506(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2765 * 4096 / var57;
                                                if (var10.field2662 != 0) {
                                                    var56.method5602(var10.field2765 / 2 + var12, var10.field2678 / 2 + var13, var10.field2662, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5626(var12, var13, var10.field2765, var10.field2678, 256 - (var14 & 0xFF));
                                                } else if (var10.field2765 == var57 && var10.field2678 == var58) {
                                                    var56.method5584(var12, var13);
                                                } else {
                                                    var56.method5656(var12, var13, var10.field2765, var10.field2678);
                                                }
                                            }
                                        } else if (class229.field2642) {
                                            method272(var10);
                                        }
                                    } else {
                                        class328 var55 = var10.method4063(Statics.method4143(var10));
                                        if (var55 != null) {
                                            var55.method5584(var12, var13);
                                        } else if (class229.field2642) {
                                            method272(var10);
                                        }
                                    }
                                } else if (var10.field2646 == 6) {
                                    boolean var64 = Statics.method4143(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2692;
                                    } else {
                                        var65 = var10.field2691;
                                    }
                                    class128 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2770 != -1) {
                                        class266 var68 = class266.method4129(var10.field2770);
                                        if (var68 != null) {
                                            class266 var69 = var68.method4653(var10.field2720);
                                            var66 = var69.method4667(1);
                                            if (var66 == null) {
                                                method272(var10);
                                            } else {
                                                var66.method2659();
                                                var67 = var66.field1851 / 2;
                                            }
                                        }
                                    } else if (var10.field2757 == 5) {
                                        if (var10.field2688 == 0) {
                                            var66 = field682.method4031((class270) null, -1, (class270) null, -1);
                                        } else {
                                            var66 = Statics.field389.method1105();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4066((class270) null, -1, var64, Statics.field389.field588);
                                        if (var66 == null && class229.field2642) {
                                            method272(var10);
                                        }
                                    } else {
                                        class270 var70 = class270.method596(var65);
                                        var66 = var10.method4066(var70, var10.field2771, var64, Statics.field389.field588);
                                        if (var66 == null && class229.field2642) {
                                            method272(var10);
                                        }
                                    }
                                    class131.method2738(var10.field2765 / 2 + var12, var10.field2678 / 2 + var13);
                                    int var71 = var10.field2698 * class131.field1757[var10.field2641] >> 16;
                                    int var72 = var10.field2698 * class131.field1760[var10.field2641] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2643) {
                                            var66.method2659();
                                            if (var10.field2701) {
                                                var66.method2637(0, var10.field2696, var10.field2697, var10.field2641, var10.field2693, var10.field2718 + var67 + var71, var10.field2718 + var72, var10.field2698);
                                            } else {
                                                var66.method2636(0, var10.field2696, var10.field2697, var10.field2641, var10.field2693, var10.field2718 + var67 + var71, var10.field2718 + var72);
                                            }
                                        } else {
                                            var66.method2636(0, var10.field2696, 0, var10.field2641, 0, var71, var72);
                                        }
                                    }
                                    class131.method2737();
                                } else {
                                    if (var10.field2646 == 7) {
                                        class302 var73 = var10.method4064();
                                        if (var73 == null) {
                                            if (class229.field2642) {
                                                method272(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2717; var75++) {
                                            for (int var76 = 0; var76 < var10.field2655; var76++) {
                                                if (var10.field2768[var74] > 0) {
                                                    class266 var77 = class266.method4129(var10.field2768[var74] - 1);
                                                    String var78;
                                                    if (var77.field3493 != 1 && var10.field2769[var74] == 1) {
                                                        var78 = class82.method2442(16748608) + var77.field3482 + class82.field1122;
                                                    } else {
                                                        var78 = class82.method2442(16748608) + var77.field3482 + class82.field1122 + " " + 'x' + method71(var10.field2769[var74]);
                                                    }
                                                    int var79 = (var10.field2777 + 115) * var76 + var12;
                                                    int var80 = (var10.field2772 + 12) * var75 + var13;
                                                    if (var10.field2708 == 0) {
                                                        var73.method5207(var78, var79, var80, var10.field2669, var10.field2710 ? 0 : -1);
                                                    } else if (var10.field2708 == 1) {
                                                        var73.method5210(var78, var10.field2765 / 2 + var79, var80, var10.field2669, var10.field2710 ? 0 : -1);
                                                    } else {
                                                        var73.method5209(var78, var10.field2765 + var79 - 1, var80, var10.field2669, var10.field2710 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2646 == 8 && Statics.field1498 == var10 && field774 == field773) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class302 var83 = Statics.field384;
                                        String var84 = var10.field2705;
                                        String var85 = method1056(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class82.field1114);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5202(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3762 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2765 + var12 - 5 - var81;
                                        int var90 = var10.field2678 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class324.method5468(var89, var90, var81, var82, 16777120);
                                        class324.method5466(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2705;
                                        int var92 = var83.field3762 + var90 + 2;
                                        String var93 = method1056(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class82.field1114);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5207(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3762 + 1;
                                        }
                                    }
                                    if (var10.field2646 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2694) {
                                            var96 = var12;
                                            var97 = var10.field2678 + var13;
                                            var98 = var10.field2765 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2765 + var12;
                                            var99 = var10.field2678 + var13;
                                        }
                                        if (var10.field2677 == 1) {
                                            class324.method5467(var96, var97, var98, var99, var10.field2669);
                                        } else {
                                            method3318(var96, var97, var98, var99, var10.field2669, var10.field2677);
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

    @ObfuscatedName("gf.iv(IIIIIIB)V")
    public static final void method3318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class324.field3876;
        int var18 = arg1 - class324.field3872;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class131.method2734(var19, var20, var21);
        class131.method2769(var23, var24, var25, var19, var20, var21, arg4);
        class131.method2734(var19, var21, var22);
        class131.method2769(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bu.it(Ljava/lang/String;Lho;B)Ljava/lang/String;")
    public static String method1056(String arg0, class229 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method170(arg1, var2 - 1);
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

    @ObfuscatedName("l.iq(II)Ljava/lang/String;")
    public static final String method71(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class82.field1119 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class82.method2442(65408) + var1.substring(0, var1.length() - 8) + class236.field3028 + " " + class82.field1116 + var1 + class82.field1117 + class82.field1122;
        } else if (var1.length() > 6) {
            return " " + class82.method2442(16777215) + var1.substring(0, var1.length() - 4) + class236.field3068 + " " + class82.field1116 + var1 + class82.field1117 + class82.field1122;
        } else {
            return " " + class82.method2442(16776960) + var1 + class82.field1122;
        }
    }

    @ObfuscatedName("client.iu(ZI)V")
    public final void method1337(boolean arg0) {
        int var2 = field830;
        int var3 = Statics.field1402;
        int var4 = Statics.field2370;
        if (class229.method2527(var2)) {
            method508(Statics.field2634[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ip(Lho;B)V")
    public void method1455(class229 arg0) {
        class229 var2 = arg0.field2663 == -1 ? null : class229.method3345(arg0.field2663);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1402;
            var4 = Statics.field2370;
        } else {
            var3 = var2.field2765;
            var4 = var2.field2678;
        }
        method290(arg0, var3, var4, false);
        method4763(arg0, var3, var4);
    }

    @ObfuscatedName("at.ib([Lho;Lho;ZI)V")
    public static void method620(class229[] arg0, class229 arg1, boolean arg2) {
        int var3 = arg1.field2667 == 0 ? arg1.field2765 : arg1.field2667;
        int var4 = arg1.field2668 == 0 ? arg1.field2678 : arg1.field2668;
        method508(arg0, arg1.field2644, var3, var4, arg2);
        if (arg1.field2774 != null) {
            method508(arg1.field2774, arg1.field2644, var3, var4, arg2);
        }
        class62 var5 = (class62) field703.method5416((long) arg1.field2644);
        if (var5 != null) {
            int var6 = var5.field539;
            if (class229.method2527(var6)) {
                method508(Statics.field2634[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2648 == 1337) {
        }
    }

    @ObfuscatedName("av.ix([Lho;IIIZS)V")
    public static void method508(class229[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class229 var6 = arg0[var5];
            if (var6 != null && var6.field2663 == arg1) {
                method290(var6, arg2, arg3, arg4);
                method4763(var6, arg2, arg3);
                if (var6.field2665 > var6.field2667 - var6.field2765) {
                    var6.field2665 = var6.field2667 - var6.field2765;
                }
                if (var6.field2665 < 0) {
                    var6.field2665 = 0;
                }
                if (var6.field2734 > var6.field2668 - var6.field2678) {
                    var6.field2734 = var6.field2668 - var6.field2678;
                }
                if (var6.field2734 < 0) {
                    var6.field2734 = 0;
                }
                if (var6.field2646 == 0) {
                    method620(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("p.ic(Lho;IIZB)V")
    public static void method290(class229 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2765;
        int var5 = arg0.field2678;
        if (arg0.field2651 == 0) {
            arg0.field2765 = arg0.field2655;
        } else if (arg0.field2651 == 1) {
            arg0.field2765 = arg1 - arg0.field2655;
        } else if (arg0.field2651 == 2) {
            arg0.field2765 = arg0.field2655 * arg1 >> 14;
        }
        if (arg0.field2652 == 0) {
            arg0.field2678 = arg0.field2717;
        } else if (arg0.field2652 == 1) {
            arg0.field2678 = arg2 - arg0.field2717;
        } else if (arg0.field2652 == 2) {
            arg0.field2678 = arg0.field2717 * arg2 >> 14;
        }
        if (arg0.field2651 == 4) {
            arg0.field2765 = arg0.field2742 * arg0.field2678 / arg0.field2731;
        }
        if (arg0.field2652 == 4) {
            arg0.field2678 = arg0.field2765 * arg0.field2731 / arg0.field2742;
        }
        if (arg0.field2648 == 1337) {
            field794 = arg0;
        }
        if (arg3 && arg0.field2759 != null && (arg0.field2765 != var4 || arg0.field2678 != var5)) {
            class63 var6 = new class63();
            var6.field558 = arg0;
            var6.field554 = arg0.field2759;
            field680.method4851(var6);
        }
    }

    @ObfuscatedName("jf.iw(Lho;IIB)V")
    public static void method4763(class229 arg0, int arg1, int arg2) {
        if (arg0.field2633 == 0) {
            arg0.field2762 = arg0.field2653;
        } else if (arg0.field2633 == 1) {
            arg0.field2762 = (arg1 - arg0.field2765) / 2 + arg0.field2653;
        } else if (arg0.field2633 == 2) {
            arg0.field2762 = arg1 - arg0.field2765 - arg0.field2653;
        } else if (arg0.field2633 == 3) {
            arg0.field2762 = arg0.field2653 * arg1 >> 14;
        } else if (arg0.field2633 == 4) {
            arg0.field2762 = (arg0.field2653 * arg1 >> 14) + (arg1 - arg0.field2765) / 2;
        } else {
            arg0.field2762 = arg1 - arg0.field2765 - (arg0.field2653 * arg1 >> 14);
        }
        if (arg0.field2650 == 0) {
            arg0.field2707 = arg0.field2654;
        } else if (arg0.field2650 == 1) {
            arg0.field2707 = (arg2 - arg0.field2678) / 2 + arg0.field2654;
        } else if (arg0.field2650 == 2) {
            arg0.field2707 = arg2 - arg0.field2678 - arg0.field2654;
        } else if (arg0.field2650 == 3) {
            arg0.field2707 = arg0.field2654 * arg2 >> 14;
        } else if (arg0.field2650 == 4) {
            arg0.field2707 = (arg0.field2654 * arg2 >> 14) + (arg2 - arg0.field2678) / 2;
        } else {
            arg0.field2707 = arg2 - arg0.field2678 - (arg0.field2654 * arg2 >> 14);
        }
    }

    @ObfuscatedName("y.io(Lho;IIIIIII)V")
    public static final void method229(class229 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field839) {
            field690 = 32;
        } else {
            field690 = 0;
        }
        field839 = false;
        if (class54.field461 == 1 || !Statics.field3880 && class54.field461 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2734 -= 4;
                method272(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2734 += 4;
                method272(arg0);
            } else if (arg5 >= arg1 - field690 && arg5 < field690 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2734 = (arg4 - arg3) * var8 / var9;
                method272(arg0);
                field839 = true;
            }
        }
        if (field741 == 0) {
            return;
        }
        int var10 = arg0.field2765;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2734 += field741 * 45;
            method272(arg0);
        }
    }

    @ObfuscatedName("k.ih(IIIIII)V")
    public static final void method131(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field266[0].method5552(arg0, arg1);
        Statics.field266[1].method5552(arg0, arg1 + arg3 - 16);
        class324.method5468(arg0, arg1 + 16, 16, arg3 - 32, field661);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class324.method5468(arg0, arg1 + 16 + var6, 16, var5, field820);
        class324.method5537(arg0, arg1 + 16 + var6, var5, field688);
        class324.method5537(arg0 + 1, arg1 + 16 + var6, var5, field688);
        class324.method5517(arg0, arg1 + 16 + var6, 16, field688);
        class324.method5517(arg0, arg1 + 17 + var6, 16, field688);
        class324.method5537(arg0 + 15, arg1 + 16 + var6, var5, field715);
        class324.method5537(arg0 + 14, arg1 + 17 + var6, var5 - 1, field715);
        class324.method5517(arg0, arg1 + 15 + var6 + var5, 16, field715);
        class324.method5517(arg0 + 1, arg1 + 14 + var6 + var5, 15, field715);
    }

    @ObfuscatedName("j.ii(Lho;II)I")
    public static final int method170(class229 arg0, int arg1) {
        if (arg0.field2732 == null || arg1 >= arg0.field2732.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2732[arg1];
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
                    var7 = field754[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field755[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field756[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class229 var11 = class229.method3345(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class266.method4129(var12).field3495 || field625)) {
                        for (int var13 = 0; var13 < var11.field2768.length; var13++) {
                            if (var12 + 1 == var11.field2768[var13]) {
                                var7 += var11.field2769[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class224.field2601[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class233.field2831[field755[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class224.field2601[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field389.field592;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class233.field2829[var14]) {
                            var7 += field755[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class229 var17 = class229.method3345(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class266.method4129(var18).field3495 || field625)) {
                        for (int var19 = 0; var19 < var17.field2768.length; var19++) {
                            if (var18 + 1 == var17.field2768[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field721;
                }
                if (var6 == 12) {
                    var7 = field717;
                }
                if (var6 == 13) {
                    int var20 = class224.field2601[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class224.method529(var22);
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
                    var7 = (Statics.field389.field957 >> 7) + Statics.field405;
                }
                if (var6 == 19) {
                    var7 = (Statics.field389.field916 >> 7) + Statics.field1088;
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

    @ObfuscatedName("dk.ig(Lho;Ljv;IIZI)V")
    public static final void method2475(class229 arg0, class266 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3477;
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
            var7 = class236.field3136;
        }
        if (var6 != -1 && var7 != null) {
            method174(var7, class82.method2442(16748608) + arg1.field3482, var6, arg1.field3480, arg2, arg0.field2644, arg4);
        }
    }

    @ObfuscatedName("cp.ia(Lho;IIB)V")
    public static final void method2050(class229 arg0, int arg1, int arg2) {
        if (arg0.field2674 == 1) {
            method968(arg0.field2637, "", 24, 0, 0, arg0.field2644);
        }
        if (arg0.field2674 == 2 && !field777) {
            String var3 = method3394(arg0);
            if (var3 != null) {
                method968(var3, class82.method2442(65280) + arg0.field2766, 25, 0, -1, arg0.field2644);
            }
        }
        if (arg0.field2674 == 3) {
            method968(class236.field3004, "", 26, 0, 0, arg0.field2644);
        }
        if (arg0.field2674 == 4) {
            method968(arg0.field2637, "", 28, 0, 0, arg0.field2644);
        }
        if (arg0.field2674 == 5) {
            method968(arg0.field2637, "", 29, 0, 0, arg0.field2644);
        }
        if (arg0.field2674 == 6 && field788 == null) {
            method968(arg0.field2637, "", 30, 0, -1, arg0.field2644);
        }
        if (arg0.field2646 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2678; var5++) {
                for (int var6 = 0; var6 < arg0.field2765; var6++) {
                    int var7 = (arg0.field2777 + 32) * var6;
                    int var8 = (arg0.field2772 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2713[var4];
                        var8 += arg0.field2714[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field733 = var4;
                        Statics.field1976 = arg0;
                        if (arg0.field2768[var4] > 0) {
                            class266 var9 = class266.method4129(arg0.field2768[var4] - 1);
                            if (field783 == 1 && class230.method595(method12(arg0))) {
                                if (Statics.field2229 != arg0.field2644 || Statics.field3368 != var4) {
                                    method968(class236.field2924, field728 + " " + class82.field1118 + " " + class82.method2442(16748608) + var9.field3482, 31, var9.field3480, var4, arg0.field2644);
                                }
                            } else if (!field777 || !class230.method595(method12(arg0))) {
                                String[] var10 = var9.field3477;
                                int var11 = -1;
                                if (field739 && method663()) {
                                    var11 = var9.method4660();
                                }
                                if (class230.method595(method12(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method2475(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                if (class230.method1917(method12(arg0))) {
                                    method968(class236.field2924, class82.method2442(16748608) + var9.field3482, 38, var9.field3480, var4, arg0.field2644);
                                }
                                if (class230.method595(method12(arg0))) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var11 != var13) {
                                            method2475(arg0, var9, var4, var13, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method2475(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var14 = arg0.field2716;
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
                                            method968(var14[var15], class82.method2442(16748608) + var9.field3482, var16, var9.field3480, var4, arg0.field2644);
                                        }
                                    }
                                }
                                method968(class236.field2996, class82.method2442(16748608) + var9.field3482, 1005, var9.field3480, var4, arg0.field2644);
                            } else if ((Statics.field1589 & 0x10) == 16) {
                                method968(field780, field781 + " " + class82.field1118 + " " + class82.method2442(16748608) + var9.field3482, 32, var9.field3480, var4, arg0.field2644);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2643) {
            return;
        }
        if (!field777) {
            for (int var17 = 9; var17 >= 5; var17--) {
                String var18 = method922(arg0, var17);
                if (var18 != null) {
                    method968(var18, arg0.field2723, 1007, var17 + 1, arg0.field2645, arg0.field2644);
                }
            }
            String var19 = method3394(arg0);
            if (var19 != null) {
                method968(var19, arg0.field2723, 25, 0, arg0.field2645, arg0.field2644);
            }
            for (int var20 = 4; var20 >= 0; var20--) {
                String var21 = method922(arg0, var20);
                if (var21 != null) {
                    method174(var21, arg0.field2723, 57, var20 + 1, arg0.field2645, arg0.field2644, arg0.field2786);
                }
            }
            int var22 = method12(arg0);
            boolean var23 = (var22 & 0x1) != 0;
            if (var23) {
                method968(class236.field3130, "", 30, 0, arg0.field2645, arg0.field2644);
            }
        } else if (class230.method41(method12(arg0)) && (Statics.field1589 & 0x20) == 32) {
            method968(field780, field781 + " " + class82.field1118 + " " + arg0.field2723, 58, 0, arg0.field2645, arg0.field2644);
        }
    }

    @ObfuscatedName("ae.jb(ZI)V")
    public static void method592(boolean arg0) {
        field698 = arg0;
    }

    @ObfuscatedName("gj.jq(I)Z")
    public static boolean method3673() {
        return field698;
    }

    @ObfuscatedName("ap.jw(B)Z")
    public static boolean method663() {
        return field698 || class45.field365[81];
    }

    @ObfuscatedName("hb.jm(IIIIIIII)V")
    public static final void method4123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class229.method2527(arg0)) {
            method4144(Statics.field2634[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("il.jr([Lho;IIIIIIII)V")
    public static final void method4144(class229[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class229 var9 = arg0[var8];
            if (var9 != null && var9.field2663 == arg1 && (!var9.field2643 || var9.field2646 == 0 || var9.field2767 || method12(var9) != 0 || field796 == var9 || var9.field2648 == 1338)) {
                if (var9.field2643) {
                    if (method3322(var9)) {
                        continue;
                    }
                } else if (var9.field2646 == 0 && Statics.field2065 != var9 && method3322(var9)) {
                    continue;
                }
                int var10 = var9.field2762 + arg6;
                int var11 = var9.field2707 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2646 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2646 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2765 + var10;
                    int var19 = var9.field2678 + var11;
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
                    int var22 = var9.field2765 + var10;
                    int var23 = var9.field2678 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field887 == var9) {
                    field803 = true;
                    field804 = var10;
                    field805 = var11;
                }
                boolean var24 = false;
                if (var9.field2724) {
                    switch(field784) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2644 >>> 16 == field785) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field785 == var9.field2644) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2643 || var12 < var14 && var13 < var15) {
                    if (var9.field2643) {
                        if (var9.field2659) {
                            if (class54.field456 >= var12 && class54.field463 >= var13 && class54.field456 < var14 && class54.field463 < var15) {
                                for (class63 var25 = (class63) field680.method4856(); var25 != null; var25 = (class63) field680.method4858()) {
                                    if (var25.field544) {
                                        var25.method3306();
                                        var25.field558.field2775 = false;
                                    }
                                }
                                if (Statics.field563 == 0) {
                                    field887 = null;
                                    field796 = null;
                                }
                                if (!field758) {
                                    Statics.method512();
                                }
                            }
                        } else if (var9.field2658 && class54.field456 >= var12 && class54.field463 >= var13 && class54.field456 < var14 && class54.field463 < var15) {
                            for (class63 var26 = (class63) field680.method4856(); var26 != null; var26 = (class63) field680.method4858()) {
                                if (var26.field544 && var26.field558.field2751 == var26.field554) {
                                    var26.method3306();
                                }
                            }
                        }
                    }
                    int var27 = class54.field456;
                    int var28 = class54.field463;
                    if (class54.field469 != 0) {
                        var27 = class54.field462;
                        var28 = class54.field475;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2648 == 1337) {
                        if (!field862 && !field758 && var29) {
                            method665(var27, var28, var12, var13);
                        }
                    } else if (var9.field2648 == 1338) {
                        method510(var9, var10, var11);
                    } else {
                        if (var9.field2648 == 1400) {
                            Statics.field533.method5733(class54.field456, class54.field463, var29, var10, var11, var9.field2765, var9.field2678);
                        }
                        if (!field758 && var29) {
                            if (var9.field2648 == 1400) {
                                Statics.field533.method5785(var10, var11, var9.field2765, var9.field2678, var27, var28);
                            } else {
                                method2050(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2719.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2719[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2719[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2687 != null) {
                                            var34 = class45.field365[var9.field2719[var30][var33]];
                                        }
                                        if (method10(var9.field2719[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2687 != null && var9.field2687[var30] > field633) {
                                                break;
                                            }
                                            byte var35 = var9.field2695[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class45.field365[86] && !class45.field365[82] && !class45.field365[81]) && ((var35 & 0x2) == 0 || class45.field365[86]) && ((var35 & 0x1) == 0 || class45.field365[82]) && ((var35 & 0x4) == 0 || class45.field365[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method3202(var30 + 1, var9.field2644, var9.field2645, var9.field2770, "");
                                    } else if (var30 == 10) {
                                        method1143();
                                        method293(var9.field2644, var9.field2645, class230.method3749(method12(var9)), var9.field2770);
                                        field780 = method3394(var9);
                                        if (field780 == null) {
                                            field780 = class236.field2980;
                                        }
                                        field781 = var9.field2723 + class82.method2442(16777215);
                                    }
                                    int var36 = var9.field2721[var30];
                                    if (var9.field2687 == null) {
                                        var9.field2687 = new int[var9.field2719.length];
                                    }
                                    if (var9.field2725 == null) {
                                        var9.field2725 = new int[var9.field2719.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2687[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2687[var30] == 0) {
                                        var9.field2687[var30] = field633 + var36 + var9.field2725[var30];
                                    } else {
                                        var9.field2687[var30] = field633 + var36;
                                    }
                                }
                                if (!var31 && var9.field2687 != null) {
                                    var9.field2687[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2643) {
                            boolean var37;
                            if (class54.field456 >= var12 && class54.field463 >= var13 && class54.field456 < var14 && class54.field463 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class54.field461 == 1 || !Statics.field3880 && class54.field461 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class54.field469 == 1 || !Statics.field3880 && class54.field469 == 4) && class54.field462 >= var12 && class54.field475 >= var13 && class54.field462 < var14 && class54.field475 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method1934(var9, class54.field462 - var10, class54.field475 - var11);
                            }
                            if (var9.field2648 == 1400) {
                                Statics.field533.method5804(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field887 != null && field887 != var9 && var37 && class230.method952(method12(var9))) {
                                field799 = var9;
                            }
                            if (field796 == var9) {
                                field800 = true;
                                field801 = var10;
                                field802 = var11;
                            }
                            if (var9.field2767) {
                                if (var37 && field741 != 0 && var9.field2751 != null) {
                                    class63 var40 = new class63();
                                    var40.field544 = true;
                                    var40.field558 = var9;
                                    var40.field547 = field741;
                                    var40.field554 = var9.field2751;
                                    field680.method4851(var40);
                                }
                                if (field887 != null || Statics.field387 != null || field758) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2776 && var39) {
                                    var9.field2776 = true;
                                    if (var9.field2683 != null) {
                                        class63 var41 = new class63();
                                        var41.field544 = true;
                                        var41.field558 = var9;
                                        var41.field546 = class54.field462 - var10;
                                        var41.field547 = class54.field475 - var11;
                                        var41.field554 = var9.field2683;
                                        field680.method4851(var41);
                                    }
                                }
                                if (var9.field2776 && var38 && var9.field2733 != null) {
                                    class63 var42 = new class63();
                                    var42.field544 = true;
                                    var42.field558 = var9;
                                    var42.field546 = class54.field456 - var10;
                                    var42.field547 = class54.field463 - var11;
                                    var42.field554 = var9.field2733;
                                    field680.method4851(var42);
                                }
                                if (var9.field2776 && !var38) {
                                    var9.field2776 = false;
                                    if (var9.field2784 != null) {
                                        class63 var43 = new class63();
                                        var43.field544 = true;
                                        var43.field558 = var9;
                                        var43.field546 = class54.field456 - var10;
                                        var43.field547 = class54.field463 - var11;
                                        var43.field554 = var9.field2784;
                                        field823.method4851(var43);
                                    }
                                }
                                if (var38 && var9.field2735 != null) {
                                    class63 var44 = new class63();
                                    var44.field544 = true;
                                    var44.field558 = var9;
                                    var44.field546 = class54.field456 - var10;
                                    var44.field547 = class54.field463 - var11;
                                    var44.field554 = var9.field2735;
                                    field680.method4851(var44);
                                }
                                if (!var9.field2775 && var37) {
                                    var9.field2775 = true;
                                    if (var9.field2736 != null) {
                                        class63 var45 = new class63();
                                        var45.field544 = true;
                                        var45.field558 = var9;
                                        var45.field546 = class54.field456 - var10;
                                        var45.field547 = class54.field463 - var11;
                                        var45.field554 = var9.field2736;
                                        field680.method4851(var45);
                                    }
                                }
                                if (var9.field2775 && var37 && var9.field2737 != null) {
                                    class63 var46 = new class63();
                                    var46.field544 = true;
                                    var46.field558 = var9;
                                    var46.field546 = class54.field456 - var10;
                                    var46.field547 = class54.field463 - var11;
                                    var46.field554 = var9.field2737;
                                    field680.method4851(var46);
                                }
                                if (var9.field2775 && !var37) {
                                    var9.field2775 = false;
                                    if (var9.field2722 != null) {
                                        class63 var47 = new class63();
                                        var47.field544 = true;
                                        var47.field558 = var9;
                                        var47.field546 = class54.field456 - var10;
                                        var47.field547 = class54.field463 - var11;
                                        var47.field554 = var9.field2722;
                                        field823.method4851(var47);
                                    }
                                }
                                if (var9.field2681 != null) {
                                    class63 var48 = new class63();
                                    var48.field558 = var9;
                                    var48.field554 = var9.field2681;
                                    field822.method4851(var48);
                                }
                                if (var9.field2745 != null && field809 > var9.field2782) {
                                    if (var9.field2744 == null || field809 - var9.field2782 > 32) {
                                        class63 var53 = new class63();
                                        var53.field558 = var9;
                                        var53.field554 = var9.field2745;
                                        field680.method4851(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2782; var49 < field809; var49++) {
                                            int var50 = field808[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2744.length; var51++) {
                                                if (var9.field2744[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field558 = var9;
                                                    var52.field554 = var9.field2745;
                                                    field680.method4851(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2782 = field809;
                                }
                                if (var9.field2748 != null && field768 > var9.field2711) {
                                    if (var9.field2746 == null || field768 - var9.field2711 > 32) {
                                        class63 var58 = new class63();
                                        var58.field558 = var9;
                                        var58.field554 = var9.field2748;
                                        field680.method4851(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2711; var54 < field768; var54++) {
                                            int var55 = field810[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2746.length; var56++) {
                                                if (var9.field2746[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field558 = var9;
                                                    var57.field554 = var9.field2748;
                                                    field680.method4851(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2711 = field768;
                                }
                                if (var9.field2699 != null && field813 > var9.field2780) {
                                    if (var9.field2779 == null || field813 - var9.field2780 > 32) {
                                        class63 var63 = new class63();
                                        var63.field558 = var9;
                                        var63.field554 = var9.field2699;
                                        field680.method4851(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2780; var59 < field813; var59++) {
                                            int var60 = field624[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2779.length; var61++) {
                                                if (var9.field2779[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field558 = var9;
                                                    var62.field554 = var9.field2699;
                                                    field680.method4851(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2780 = field813;
                                }
                                if (field814 > var9.field2749 && var9.field2752 != null) {
                                    class63 var64 = new class63();
                                    var64.field558 = var9;
                                    var64.field554 = var9.field2752;
                                    field680.method4851(var64);
                                }
                                if (field815 > var9.field2749 && var9.field2754 != null) {
                                    class63 var65 = new class63();
                                    var65.field558 = var9;
                                    var65.field554 = var9.field2754;
                                    field680.method4851(var65);
                                }
                                if (field816 > var9.field2749 && var9.field2755 != null) {
                                    class63 var66 = new class63();
                                    var66.field558 = var9;
                                    var66.field554 = var9.field2755;
                                    field680.method4851(var66);
                                }
                                if (field677 > var9.field2749 && var9.field2753 != null) {
                                    class63 var67 = new class63();
                                    var67.field558 = var9;
                                    var67.field554 = var9.field2753;
                                    field680.method4851(var67);
                                }
                                if (field764 > var9.field2749 && var9.field2761 != null) {
                                    class63 var68 = new class63();
                                    var68.field558 = var9;
                                    var68.field554 = var9.field2761;
                                    field680.method4851(var68);
                                }
                                if (field819 > var9.field2749 && var9.field2756 != null) {
                                    class63 var69 = new class63();
                                    var69.field558 = var9;
                                    var69.field554 = var9.field2756;
                                    field680.method4851(var69);
                                }
                                var9.field2749 = field807;
                                if (var9.field2657 != null) {
                                    for (int var70 = 0; var70 < field750; var70++) {
                                        class63 var71 = new class63();
                                        var71.field558 = var9;
                                        var71.field550 = field845[var70];
                                        var71.field551 = field844[var70];
                                        var71.field554 = var9.field2657;
                                        field680.method4851(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2643) {
                            if (field887 != null || Statics.field387 != null || field758) {
                                continue;
                            }
                            if ((var9.field2781 >= 0 || var9.field2671 != 0) && class54.field456 >= var12 && class54.field463 >= var13 && class54.field456 < var14 && class54.field463 < var15) {
                                if (var9.field2781 >= 0) {
                                    Statics.field2065 = arg0[var9.field2781];
                                } else {
                                    Statics.field2065 = var9;
                                }
                            }
                            if (var9.field2646 == 8 && class54.field456 >= var12 && class54.field463 >= var13 && class54.field456 < var14 && class54.field463 < var15) {
                                Statics.field1498 = var9;
                            }
                            if (var9.field2668 > var9.field2678) {
                                method229(var9, var9.field2765 + var10, var11, var9.field2678, var9.field2668, class54.field456, class54.field463);
                            }
                        }
                        if (var9.field2646 == 0) {
                            method4144(arg0, var9.field2644, var12, var13, var14, var15, var10 - var9.field2665, var11 - var9.field2734);
                            if (var9.field2774 != null) {
                                method4144(var9.field2774, var9.field2644, var12, var13, var14, var15, var10 - var9.field2665, var11 - var9.field2734);
                            }
                            class62 var72 = (class62) field703.method5416((long) var9.field2644);
                            if (var72 != null) {
                                if (var72.field541 == 0 && class54.field456 >= var12 && class54.field463 >= var13 && class54.field456 < var14 && class54.field463 < var15 && !field758) {
                                    for (class63 var73 = (class63) field680.method4856(); var73 != null; var73 = (class63) field680.method4858()) {
                                        if (var73.field544) {
                                            var73.method3306();
                                            var73.field558.field2775 = false;
                                        }
                                    }
                                    if (Statics.field563 == 0) {
                                        field887 = null;
                                        field796 = null;
                                    }
                                    if (!field758) {
                                        Statics.method512();
                                    }
                                }
                                method4123(var72.field539, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.jv(II)Z")
    public static boolean method10(int arg0) {
        for (int var1 = 0; var1 < field750; var1++) {
            if (field845[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("g.ju(III)V")
    public static final void method57(int arg0, int arg1) {
        if (class229.method2527(arg0)) {
            method513(Statics.field2634[arg0], arg1);
        }
    }

    @ObfuscatedName("ar.jz([Lho;II)V")
    public static final void method513(class229[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class229 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2646 == 0) {
                    if (var3.field2774 != null) {
                        method513(var3.field2774, arg1);
                    }
                    class62 var4 = (class62) field703.method5416((long) var3.field2644);
                    if (var4 != null) {
                        method57(var4.field539, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2656 != null) {
                    class63 var5 = new class63();
                    var5.field558 = var3;
                    var5.field554 = var3.field2656;
                    class77.method4251(var5);
                }
                if (arg1 == 1 && var3.field2758 != null) {
                    if (var3.field2645 >= 0) {
                        class229 var6 = class229.method3345(var3.field2644);
                        if (var6 == null || var6.field2774 == null || var3.field2645 >= var6.field2774.length || var6.field2774[var3.field2645] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field558 = var3;
                    var7.field554 = var3.field2758;
                    class77.method4251(var7);
                }
            }
        }
    }

    @ObfuscatedName("cq.jf(Lho;III)V")
    public static final void method1934(class229 arg0, int arg1, int arg2) {
        if (field887 != null || field758 || arg0 == null || method731(arg0) == null) {
            return;
        }
        field887 = arg0;
        field796 = method731(arg0);
        field797 = arg1;
        field798 = arg2;
        Statics.field563 = 0;
        field806 = false;
        int var3 = field759 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field60 = new class83();
        Statics.field60.field1129 = field646[var3];
        Statics.field60.field1130 = field736[var3];
        Statics.field60.field1126 = field762[var3];
        Statics.field60.field1127 = field763[var3];
        Statics.field60.field1128 = field776[var3];
    }

    @ObfuscatedName("client.jh(I)V")
    public final void method1174() {
        method272(field887);
        Statics.field563++;
        if (field803 && field800) {
            int var1 = class54.field456;
            int var2 = class54.field463;
            int var3 = var1 - field797;
            int var4 = var2 - field798;
            if (var3 < field801) {
                var3 = field801;
            }
            if (field887.field2765 + var3 > field801 + field796.field2765) {
                var3 = field801 + field796.field2765 - field887.field2765;
            }
            if (var4 < field802) {
                var4 = field802;
            }
            if (field887.field2678 + var4 > field802 + field796.field2678) {
                var4 = field802 + field796.field2678 - field887.field2678;
            }
            int var5 = var3 - field804;
            int var6 = var4 - field805;
            int var7 = field887.field2661;
            if (Statics.field563 > field887.field2727 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field806 = true;
            }
            int var8 = field796.field2665 + (var3 - field801);
            int var9 = field796.field2734 + (var4 - field802);
            if (field887.field2739 != null && field806) {
                class63 var10 = new class63();
                var10.field558 = field887;
                var10.field546 = var8;
                var10.field547 = var9;
                var10.field554 = field887.field2739;
                class77.method4251(var10);
            }
            if (class54.field461 == 0) {
                if (field806) {
                    if (field887.field2740 != null) {
                        class63 var11 = new class63();
                        var11.field558 = field887;
                        var11.field546 = var8;
                        var11.field547 = var9;
                        var11.field553 = field799;
                        var11.field554 = field887.field2740;
                        class77.method4251(var11);
                    }
                    if (field799 != null) {
                        class229 var12 = field887;
                        int var13 = class230.method511(method12(var12));
                        class229 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class229.method3345(var12.field2663);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class192 var16 = class192.method1750(class189.field2239, field669.field1284);
                            var16.field2356.method3453(field887.field2645);
                            var16.field2356.method3453(field799.field2770);
                            var16.field2356.method3402(field799.field2645);
                            var16.field2356.method3461(field887.field2644);
                            var16.field2356.method3508(field799.field2644);
                            var16.field2356.method3402(field887.field2770);
                            field669.method2056(var16);
                        }
                    }
                } else if (this.method1170()) {
                    this.method1268(field804 + field797, field805 + field798);
                } else if (field759 > 0) {
                    int var17 = field804 + field797;
                    int var18 = field805 + field798;
                    method4124(Statics.field60, var17, var18);
                    Statics.field60 = null;
                }
                field887 = null;
            }
        } else if (Statics.field563 > 1) {
            field887 = null;
        }
    }

    @ObfuscatedName("c.jp(Lho;I)V")
    public static void method272(class229 arg0) {
        if (field826 == arg0.field2730) {
            field864[arg0.field2726] = true;
        }
    }

    @ObfuscatedName("n.ja(I)V")
    public static void method142() {
        for (class62 var0 = (class62) field703.method5411(); var0 != null; var0 = (class62) field703.method5415()) {
            int var1 = var0.field539;
            if (class229.method2527(var1)) {
                boolean var2 = true;
                class229[] var3 = Statics.field2634[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2643;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2139;
                    class229 var6 = class229.method3345(var5);
                    if (var6 != null) {
                        method272(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.je(Lho;I)Lho;")
    public static class229 method731(class229 arg0) {
        class229 var1 = arg0;
        int var2 = class230.method511(method12(arg0));
        class229 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class229.method3345(var1.field2663);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class229 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2747;
        }
        return var5;
    }

    @ObfuscatedName("az.jy(II)V")
    public static final void method707(int arg0) {
        if (!class229.method2527(arg0)) {
            return;
        }
        class229[] var1 = Statics.field2634[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class229 var3 = var1[var2];
            if (var3 != null) {
                var3.field2771 = 0;
                var3.field2773 = 0;
            }
        }
    }

    @ObfuscatedName("bf.jl(IB)V")
    public static final void method1644(int arg0) {
        if (class229.method2527(arg0)) {
            method4152(Statics.field2634[arg0], -1);
        }
    }

    @ObfuscatedName("iz.jt([Lho;II)V")
    public static final void method4152(class229[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class229 var3 = arg0[var2];
            if (var3 != null && var3.field2663 == arg1 && (!var3.field2643 || !method3322(var3))) {
                if (var3.field2646 == 0) {
                    if (!var3.field2643 && method3322(var3) && Statics.field2065 != var3) {
                        continue;
                    }
                    method4152(arg0, var3.field2644);
                    if (var3.field2774 != null) {
                        method4152(var3.field2774, var3.field2644);
                    }
                    class62 var4 = (class62) field703.method5416((long) var3.field2644);
                    if (var4 != null) {
                        method1644(var4.field539);
                    }
                }
                if (var3.field2646 == 6) {
                    if (var3.field2691 != -1 || var3.field2692 != -1) {
                        boolean var5 = Statics.method4143(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2692;
                        } else {
                            var6 = var3.field2691;
                        }
                        if (var6 != -1) {
                            class270 var7 = class270.method596(var6);
                            var3.field2773 += field684;
                            while (var3.field2773 > var7.field3589[var3.field2771]) {
                                var3.field2773 -= var7.field3589[var3.field2771];
                                var3.field2771++;
                                if (var3.field2771 >= var7.field3587.length) {
                                    var3.field2771 -= var7.field3591;
                                    if (var3.field2771 < 0 || var3.field2771 >= var7.field3587.length) {
                                        var3.field2771 = 0;
                                    }
                                }
                                method272(var3);
                            }
                        }
                    }
                    if (var3.field2700 != 0 && !var3.field2643) {
                        int var8 = var3.field2700 >> 16;
                        int var9 = var3.field2700 << 16 >> 16;
                        int var10 = field684 * var8;
                        int var11 = field684 * var9;
                        var3.field2641 = var3.field2641 + var10 & 0x7FF;
                        var3.field2696 = var3.field2696 + var11 & 0x7FF;
                        method272(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("it.jc(IB)V")
    public static final void method4292(int arg0) {
        method142();
        for (class76 var1 = (class76) class76.field1053.method4856(); var1 != null; var1 = (class76) class76.field1053.method4858()) {
            if (var1.field1055 != null) {
                var1.method1705();
            }
        }
        int var2 = class252.method1002(arg0).field3284;
        if (var2 == 0) {
            return;
        }
        int var3 = class224.field2601[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class131.method2740(0.9D);
                ((class120) Statics.field1759).method2511(0.9D);
            }
            if (var3 == 2) {
                class131.method2740(0.8D);
                ((class120) Statics.field1759).method2511(0.8D);
            }
            if (var3 == 3) {
                class131.method2740(0.7D);
                ((class120) Statics.field1759).method2511(0.7D);
            }
            if (var3 == 4) {
                class131.method2740(0.6D);
                ((class120) Statics.field1759).method2511(0.6D);
            }
            class266.method4627();
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
            if (field831 != var4) {
                if (field831 == 0 && field856 != -1) {
                    class215.method1898(Statics.field1968, field856, 0, var4, false);
                    field857 = false;
                } else if (var4 == 0) {
                    Statics.field2506.method3806();
                    class215.field2503 = 1;
                    Statics.field2505 = null;
                    field857 = false;
                } else {
                    class215.method3657(var4);
                }
                field831 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field697 = 127;
            }
            if (var3 == 1) {
                field697 = 96;
            }
            if (var3 == 2) {
                field697 = 64;
            }
            if (var3 == 3) {
                field697 = 32;
            }
            if (var3 == 4) {
                field697 = 0;
            }
        }
        if (var2 == 5) {
            field757 = var3;
        }
        if (var2 == 6) {
            field786 = var3;
        }
        if (var2 == 9) {
            field787 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field859 = 127;
            }
            if (var3 == 1) {
                field859 = 96;
            }
            if (var3 == 2) {
                field859 = 64;
            }
            if (var3 == 3) {
                field859 = 32;
            }
            if (var3 == 4) {
                field859 = 0;
            }
        }
        if (var2 == 17) {
            field792 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field649 = (class85) class197.method999(Statics.method3314(), var3);
            if (field649 == null) {
                field649 = class85.field1144;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field636 = -1;
            } else {
                field636 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field898 = (class85) class197.method999(Statics.method3314(), var3);
            if (field898 == null) {
                field898 = class85.field1144;
            }
        }
    }

    @ObfuscatedName("z.jn(Lho;I)V")
    public static final void method169(class229 arg0) {
        int var1 = arg0.field2648;
        if (var1 == 324) {
            if (field863 == -1) {
                field863 = arg0.field2679;
                field749 = arg0.field2680;
            }
            if (field682.field2611) {
                arg0.field2679 = field863;
            } else {
                arg0.field2679 = field749;
            }
        } else if (var1 == 325) {
            if (field863 == -1) {
                field863 = arg0.field2679;
                field749 = arg0.field2680;
            }
            if (field682.field2611) {
                arg0.field2679 = field749;
            } else {
                arg0.field2679 = field863;
            }
        } else if (var1 == 327) {
            arg0.field2641 = 150;
            arg0.field2696 = (int) (Math.sin((double) field633 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2757 = 5;
            arg0.field2688 = 0;
        } else if (var1 == 328) {
            arg0.field2641 = 150;
            arg0.field2696 = (int) (Math.sin((double) field633 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2757 = 5;
            arg0.field2688 = 1;
        }
    }

    @ObfuscatedName("s.jj(I)V")
    public static final void method181() {
        class192 var0 = class192.method1750(class189.field2245, field669.field1284);
        field669.method2056(var0);
        for (class62 var1 = (class62) field703.method5411(); var1 != null; var1 = (class62) field703.method5415()) {
            if (var1.field541 == 0 || var1.field541 == 3) {
                method1849(var1, true);
            }
        }
        if (field788 != null) {
            method272(field788);
            field788 = null;
        }
    }

    @ObfuscatedName("bk.jx(IIII)Lbx;")
    public static final class62 method1005(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field539 = arg1;
        var3.field541 = arg2;
        field703.method5412(var3, (long) arg0);
        method707(arg1);
        class229 var4 = class229.method3345(arg0);
        method272(var4);
        if (field788 != null) {
            method272(field788);
            field788 = null;
        }
        for (int var5 = 0; var5 < field759; var5++) {
            if (method581(field762[var5])) {
                if (var5 < field759 - 1) {
                    for (int var6 = var5; var6 < field759 - 1; var6++) {
                        field776[var6] = field776[var6 + 1];
                        field694[var6] = field694[var6 + 1];
                        field762[var6] = field762[var6 + 1];
                        field763[var6] = field763[var6 + 1];
                        field646[var6] = field646[var6 + 1];
                        field736[var6] = field736[var6 + 1];
                        field818[var6] = field818[var6 + 1];
                    }
                }
                var5--;
                field759--;
            }
        }
        int var7 = Statics.field2509 / 2 + Statics.field202;
        int var8 = Statics.field425;
        int var9 = Statics.field12.method5202(class236.field2998);
        for (int var10 = 0; var10 < field759; var10++) {
            class302 var11 = Statics.field12;
            String var12;
            if (var10 < 0) {
                var12 = "";
            } else if (field694[var10].length() > 0) {
                var12 = field776[var10] + class236.field2993 + field694[var10];
            } else {
                var12 = field776[var10];
            }
            int var13 = var11.method5202(var12);
            if (var13 > var9) {
                var9 = var13;
            }
        }
        var9 += 8;
        int var14 = field759 * 15 + 22;
        int var15 = var7 - var9 / 2;
        if (var9 + var15 > Statics.field1402) {
            var15 = Statics.field1402 - var9;
        }
        if (var15 < 0) {
            var15 = 0;
        }
        int var16 = var8;
        if (var14 + var8 > Statics.field2370) {
            var16 = Statics.field2370 - var14;
        }
        if (var16 < 0) {
            var16 = 0;
        }
        Statics.field202 = var15;
        Statics.field425 = var16;
        Statics.field2509 = var9;
        Statics.field286 = field759 * 15 + 22;
        method620(Statics.field2634[arg0 >> 16], var4, false);
        class77.method289(arg1);
        if (field830 != -1) {
            method57(field830, 1);
        }
        return var3;
    }

    @ObfuscatedName("cs.jd(Lbx;ZI)V")
    public static final void method1849(class62 arg0, boolean arg1) {
        int var2 = arg0.field539;
        int var3 = (int) arg0.field2139;
        arg0.method3306();
        if (arg1) {
            class229.method3668(var2);
        }
        for (class185 var4 = (class185) field824.method5411(); var4 != null; var4 = (class185) field824.method5415()) {
            if ((long) var2 == (var4.field2139 >> 48 & 0xFFFFL)) {
                var4.method3306();
            }
        }
        class229 var5 = class229.method3345(var3);
        if (var5 != null) {
            method272(var5);
        }
        for (int var6 = 0; var6 < field759; var6++) {
            if (method581(field762[var6])) {
                if (var6 < field759 - 1) {
                    for (int var7 = var6; var7 < field759 - 1; var7++) {
                        field776[var7] = field776[var7 + 1];
                        field694[var7] = field694[var7 + 1];
                        field762[var7] = field762[var7 + 1];
                        field763[var7] = field763[var7 + 1];
                        field646[var7] = field646[var7 + 1];
                        field736[var7] = field736[var7 + 1];
                        field818[var7] = field818[var7 + 1];
                    }
                }
                var6--;
                field759--;
            }
        }
        int var8 = Statics.field2509 / 2 + Statics.field202;
        int var9 = Statics.field425;
        int var10 = Statics.field12.method5202(class236.field2998);
        for (int var11 = 0; var11 < field759; var11++) {
            class302 var12 = Statics.field12;
            String var13;
            if (var11 < 0) {
                var13 = "";
            } else if (field694[var11].length() > 0) {
                var13 = field776[var11] + class236.field2993 + field694[var11];
            } else {
                var13 = field776[var11];
            }
            int var14 = var12.method5202(var13);
            if (var14 > var10) {
                var10 = var14;
            }
        }
        var10 += 8;
        int var15 = field759 * 15 + 22;
        int var16 = var8 - var10 / 2;
        if (var10 + var16 > Statics.field1402) {
            var16 = Statics.field1402 - var10;
        }
        if (var16 < 0) {
            var16 = 0;
        }
        int var17 = var9;
        if (var15 + var9 > Statics.field2370) {
            var17 = Statics.field2370 - var15;
        }
        if (var17 < 0) {
            var17 = 0;
        }
        Statics.field202 = var16;
        Statics.field425 = var17;
        Statics.field2509 = var10;
        Statics.field286 = field759 * 15 + 22;
        if (field830 != -1) {
            method57(field830, 1);
        }
    }

    @ObfuscatedName("dm.jg(Lho;I)Z")
    public static final boolean method2706(class229 arg0) {
        int var1 = arg0.field2648;
        if (var1 == 205) {
            field670 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field682.method4027(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field682.method4028(var4, var5 == 1);
        }
        if (var1 == 324) {
            field682.method4029(false);
        }
        if (var1 == 325) {
            field682.method4029(true);
        }
        if (var1 == 326) {
            class192 var6 = class192.method1750(class189.field2274, field669.field1284);
            field682.method4030(var6.field2356);
            field669.method2056(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bu.ji(Lho;IIII)V")
    public static final void method1051(class229 arg0, int arg1, int arg2, int arg3) {
        method146();
        class223 var4 = arg0.method4084(false);
        if (var4 == null) {
            return;
        }
        class324.method5506(arg1, arg2, var4.field2594 + arg1, var4.field2595 + arg2);
        if (field730 == 2 || field730 == 5) {
            class324.method5480(arg1, arg2, 0, var4.field2598, var4.field2596);
        } else {
            int var5 = field692 & 0x7FF;
            int var6 = Statics.field389.field957 / 32 + 48;
            int var7 = 464 - Statics.field389.field916 / 32;
            Statics.field538.method5629(arg1, arg2, var4.field2594, var4.field2595, var6, var7, var5, 256, var4.field2598, var4.field2596);
            for (int var8 = 0; var8 < field760; var8++) {
                int var9 = field771[var8] * 4 + 2 - Statics.field389.field957 / 32;
                int var10 = field850[var8] * 4 + 2 - Statics.field389.field916 / 32;
                method4151(arg1, arg2, var9, var10, field851[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class273 var13 = field893[Statics.field1394][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field389.field957 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field389.field916 / 32;
                        method4151(arg1, arg2, var14, var15, Statics.field323[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field665; var16++) {
                class80 var17 = field664[field666[var16]];
                if (var17 != null && var17.method1109()) {
                    class268 var18 = var17.field1097;
                    if (var18 != null && var18.field3563 != null) {
                        var18 = var18.method4713();
                    }
                    if (var18 != null && var18.field3564 && var18.field3566) {
                        int var19 = var17.field957 / 32 - Statics.field389.field957 / 32;
                        int var20 = var17.field916 / 32 - Statics.field389.field916 / 32;
                        method4151(arg1, arg2, var19, var20, Statics.field323[1], var4);
                    }
                }
            }
            int var21 = class90.field1225;
            int[] var22 = class90.field1238;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field738[var22[var23]];
                if (var24 != null && var24.method1109() && !var24.field587 && Statics.field389 != var24) {
                    int var25 = var24.field957 / 32 - Statics.field389.field957 / 32;
                    int var26 = var24.field916 / 32 - Statics.field389.field916 / 32;
                    boolean var27 = false;
                    if (Statics.field389.field611 != 0 && var24.field611 != 0 && Statics.field389.field611 == var24.field611) {
                        var27 = true;
                    }
                    if (var24.method1098()) {
                        method4151(arg1, arg2, var25, var26, Statics.field323[3], var4);
                    } else if (var27) {
                        method4151(arg1, arg2, var25, var26, Statics.field323[4], var4);
                    } else if (var24.method1108()) {
                        method4151(arg1, arg2, var25, var26, Statics.field323[5], var4);
                    } else {
                        method4151(arg1, arg2, var25, var26, Statics.field323[2], var4);
                    }
                }
            }
            if (field821 != 0 && field633 % 20 < 10) {
                if (field821 == 1 && field817 >= 0 && field817 < field664.length) {
                    class80 var28 = field664[field817];
                    if (var28 != null) {
                        int var29 = var28.field957 / 32 - Statics.field389.field957 / 32;
                        int var30 = var28.field916 / 32 - Statics.field389.field916 / 32;
                        Statics.method3083(arg1, arg2, var29, var30, Statics.field89[1], var4);
                    }
                }
                if (field821 == 2) {
                    int var31 = field644 * 4 - Statics.field405 * 4 + 2 - Statics.field389.field957 / 32;
                    int var32 = field886 * 4 - Statics.field1088 * 4 + 2 - Statics.field389.field916 / 32;
                    Statics.method3083(arg1, arg2, var31, var32, Statics.field89[1], var4);
                }
                if (field821 == 10 && field643 >= 0 && field643 < field738.length) {
                    class67 var33 = field738[field643];
                    if (var33 != null) {
                        int var34 = var33.field957 / 32 - Statics.field389.field957 / 32;
                        int var35 = var33.field916 / 32 - Statics.field389.field916 / 32;
                        Statics.method3083(arg1, arg2, var34, var35, Statics.field89[1], var4);
                    }
                }
            }
            if (field714 != 0) {
                int var36 = field714 * 4 + 2 - Statics.field389.field957 / 32;
                int var37 = field853 * 4 + 2 - Statics.field389.field916 / 32;
                method4151(arg1, arg2, var36, var37, Statics.field89[0], var4);
            }
            if (!Statics.field389.field587) {
                class324.method5468(var4.field2594 / 2 + arg1 - 1, var4.field2595 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field828[arg3] = true;
    }

    @ObfuscatedName("c.jo(Lho;IIII)V")
    public static final void method273(class229 arg0, int arg1, int arg2, int arg3) {
        class223 var4 = arg0.method4084(false);
        if (var4 == null) {
            return;
        }
        if (field730 < 3) {
            Statics.field59.method5629(arg1, arg2, var4.field2594, var4.field2595, 25, 25, field692, 256, var4.field2598, var4.field2596);
        } else {
            class324.method5480(arg1, arg2, 0, var4.field2598, var4.field2596);
        }
    }

    @ObfuscatedName("iz.js(IIIILln;Lhp;B)V")
    public static final void method4151(int arg0, int arg1, int arg2, int arg3, class328 arg4, class223 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field692 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class131.field1757[var6];
        int var9 = class131.field1760[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5579(arg5.field2594 / 2 + var10 - arg4.field3901 / 2, arg5.field2595 / 2 - var11 - arg4.field3902 / 2, arg0, arg1, arg5.field2594, arg5.field2595, arg5.field2598, arg5.field2596);
        } else {
            arg4.method5584(arg5.field2594 / 2 + arg0 + var10 - arg4.field3901 / 2, arg5.field2595 / 2 + arg1 - var11 - arg4.field3902 / 2);
        }
    }

    @ObfuscatedName("x.kf(I)V")
    public static final void method104() {
        for (int var0 = 0; var0 < class90.field1225; var0++) {
            class67 var1 = field738[class90.field1238[var0]];
            var1.method1099();
        }
        Iterator var2 = class92.field1250.iterator();
        while (var2.hasNext()) {
            class65 var3 = (class65) var2.next();
            var3.method1059();
        }
        if (Statics.field1298 != null) {
            Statics.field1298.method5159();
        }
    }

    @ObfuscatedName("hz.kj(B)V")
    public static final void method4118() {
        class92.method1920();
        if (Statics.field1298 != null) {
            Statics.field1298.method5158();
        }
    }

    @ObfuscatedName("kx.km(B)V")
    public static final void method5177() {
        for (int var0 = 0; var0 < class90.field1225; var0++) {
            class67 var1 = field738[class90.field1238[var0]];
            var1.method1102();
        }
    }

    @ObfuscatedName("iv.ky(Ljava/lang/String;B)V")
    public static final void method4252(String arg0) {
        if (Statics.field1298 != null) {
            class192 var1 = class192.method1750(class189.field2243, field669.field1284);
            var1.field2356.method3565(class202.method493(arg0));
            var1.field2356.method3591(arg0);
            field669.method2056(var1);
        }
    }

    @ObfuscatedName("ac.kd(Ljava/lang/String;B)V")
    public static final void method517(String arg0) {
        if (!arg0.equals("")) {
            class192 var1 = class192.method1750(class189.field2308, field669.field1284);
            var1.field2356.method3565(class202.method493(arg0));
            var1.field2356.method3591(arg0);
            field669.method2056(var1);
        }
    }

    @ObfuscatedName("n.kg(B)V")
    public static final void method141() {
        class192 var0 = class192.method1750(class189.field2308, field669.field1284);
        var0.field2356.method3565(0);
        field669.method2056(var0);
    }

    @ObfuscatedName("f.kp(Lho;I)I")
    public static int method12(class229 arg0) {
        class185 var1 = (class185) field824.method5416(((long) arg0.field2644 << 32) + (long) arg0.field2645);
        return var1 == null ? arg0.field2712 : var1.field2138;
    }

    @ObfuscatedName("gg.kq(Lho;I)Z")
    public static boolean method3322(class229 arg0) {
        return arg0.field2664;
    }

    @ObfuscatedName("ba.kv(Lho;II)Ljava/lang/String;")
    public static String method922(class229 arg0, int arg1) {
        int var2 = method12(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2750 == null) {
            return null;
        } else if (arg0.field2783 == null || arg0.field2783.length <= arg1 || arg0.field2783[arg1] == null || arg0.field2783[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2783[arg1];
        }
    }

    @ObfuscatedName("gm.kn(Lho;I)Ljava/lang/String;")
    public static String method3394(class229 arg0) {
        if (class230.method3749(method12(arg0)) == 0) {
            return null;
        } else if (arg0.field2675 == null || arg0.field2675.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2675;
        }
    }

    @ObfuscatedName("bm.kx(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1089(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field753 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field753 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field753 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field753 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field753 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field163 != null) {
            var3 = "/p=" + Statics.field163;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field671 + "/a=" + Statics.field3226 + var3 + "/";
    }

    @ObfuscatedName("fa.kz(Ljava/lang/String;I)V")
    public static void method3211(String arg0) {
        Statics.field163 = arg0;
        try {
            String var1 = Statics.field1509.getParameter(class283.field3658.field3665);
            String var2 = Statics.field1509.getParameter(class283.field3659.field3665);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class212.method232(class204.method3658() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class47.method712(Statics.field1509, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("af.kh(Ljava/lang/String;ZI)V")
    public static void method762(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1136; var5++) {
            class266 var6 = class266.method4129(var5);
            if ((!arg1 || var6.field3489) && var6.field3476 == -1 && var6.field3482.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field127 = -1;
                    Statics.field1148 = null;
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
        Statics.field1148 = var3;
        Statics.field2826 = 0;
        Statics.field127 = var4;
        String[] var9 = new String[Statics.field127];
        for (int var10 = 0; var10 < Statics.field127; var10++) {
            var9[var10] = class266.method4129(var3[var10]).field3482;
        }
        class199.method3344(var9, Statics.field1148);
    }

    @ObfuscatedName("af.kk([BII)V")
    public static void method764(byte[] arg0, int arg1) {
        if (field663 == null) {
            field663 = new byte[24];
        }
        class213.method3751(arg0, arg1, field663, 0, 24);
    }

    @ObfuscatedName("if.kt(Lgr;IS)V")
    public static void method4138(class202 arg0, int arg1) {
        method764(arg0.field2440, arg1);
        if (class169.field2047 == null) {
            return;
        }
        try {
            class169.field2047.method2458(0L);
            class169.field2047.method2447(arg0.field2440, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("hv.ki(Lgr;I)V")
    public static void method4006(class202 arg0) {
        if (field663 == null) {
            byte[] var1 = class169.method1854();
            arg0.method3546(var1, 0, var1.length);
        } else {
            arg0.method3546(field663, 0, field663.length);
        }
    }

    @ObfuscatedName("client.kr(B)Lkp;")
    public class295 method1503() {
        return Statics.field389 == null ? null : Statics.field389.field599;
    }

    @ObfuscatedName("bh.kb(B)Z")
    public static boolean method1703() {
        return field791 >= 2;
    }

    @ObfuscatedName("ag.kc(B)V")
    public static void method371() {
        if (field778 == 1) {
            field705 = true;
        }
    }

    @ObfuscatedName("jz.kw(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4744(String arg0) {
        class240[] var1 = class240.method727();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class240 var3 = var1[var2];
            if (var3.field3171 != -1 && arg0.startsWith(class82.method1032(var3.field3171))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3171).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bn.kl(I)V")
    public static void method1000() {
        if (Statics.field3646 == null) {
            return;
        }
        field848 = field633;
        Statics.field3646.method4308();
        for (int var0 = 0; var0 < field738.length; var0++) {
            if (field738[var0] != null) {
                Statics.field3646.method4327((field738[var0].field957 >> 7) + Statics.field405, (field738[var0].field916 >> 7) + Statics.field1088);
            }
        }
    }
}

package deob;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class client extends class47 implements class316 {

    @ObfuscatedName("client.w")
    public static class158[] field700 = new class158[4];

    @ObfuscatedName("client.an")
    public static boolean field890 = true;

    @ObfuscatedName("client.bd")
    public static int field638 = 1;

    @ObfuscatedName("client.bt")
    public static int field639 = 0;

    @ObfuscatedName("client.bu")
    public static int field851 = 0;

    @ObfuscatedName("client.bm")
    public static boolean field641 = false;

    @ObfuscatedName("client.bz")
    public static boolean field642 = false;

    @ObfuscatedName("client.ba")
    public static int field643 = -1;

    @ObfuscatedName("client.be")
    public static int field644 = -1;

    @ObfuscatedName("client.bj")
    public static boolean field824 = false;

    @ObfuscatedName("client.bx")
    public static int field646 = 0;

    @ObfuscatedName("client.cs")
    public static boolean field802 = true;

    @ObfuscatedName("client.cg")
    public static int field650 = 0;

    @ObfuscatedName("client.co")
    public static long field651 = 1L;

    @ObfuscatedName("client.cj")
    public static int field652 = -1;

    @ObfuscatedName("client.cc")
    public static int field813 = -1;

    @ObfuscatedName("client.cu")
    public static long field654 = -1L;

    @ObfuscatedName("client.cz")
    public static boolean field731 = true;

    @ObfuscatedName("client.cb")
    public static boolean field656 = false;

    @ObfuscatedName("client.ce")
    public static int field657 = 0;

    @ObfuscatedName("client.ch")
    public static int field658 = 0;

    @ObfuscatedName("client.cy")
    public static int field812 = 0;

    @ObfuscatedName("client.cx")
    public static int field916 = 0;

    @ObfuscatedName("client.ca")
    public static int field661 = 0;

    @ObfuscatedName("client.cl")
    public static int field662 = 0;

    @ObfuscatedName("client.cw")
    public static int field663 = 0;

    @ObfuscatedName("client.db")
    public static int field716 = 0;

    @ObfuscatedName("client.dz")
    public static int field665 = 0;

    @ObfuscatedName("client.dr")
    public static class107 field667 = class107.field1360;

    @ObfuscatedName("client.di")
    public static class107 field668 = class107.field1360;

    @ObfuscatedName("client.dk")
    public static int field669 = 0;

    @ObfuscatedName("client.df")
    public static int field794 = 0;

    @ObfuscatedName("client.dv")
    public static int field671 = 0;

    @ObfuscatedName("client.ep")
    public static int field887 = 0;

    @ObfuscatedName("client.ew")
    public static int field673 = 0;

    @ObfuscatedName("client.ej")
    public static int field674 = 0;

    @ObfuscatedName("client.el")
    public static int field846 = 0;

    @ObfuscatedName("client.et")
    public static int field676 = 0;

    @ObfuscatedName("client.eb")
    public static class126 field677 = class126.field1469;

    @ObfuscatedName("client.ei")
    public static boolean field678 = false;

    @ObfuscatedName("client.ev")
    public static class86 field679 = new class86();

    @ObfuscatedName("client.eo")
    public class383 field680;

    @ObfuscatedName("client.fl")
    public class36 field681;

    @ObfuscatedName("client.fz")
    public static byte[] field682 = null;

    @ObfuscatedName("client.fs")
    public static class105[] field683 = new class105[32768];

    @ObfuscatedName("client.fp")
    public static int field684 = 0;

    @ObfuscatedName("client.fe")
    public static int[] field685 = new int[32768];

    @ObfuscatedName("client.fb")
    public static int field686 = 0;

    @ObfuscatedName("client.fo")
    public static int[] field687 = new int[250];

    @ObfuscatedName("client.fw")
    public static final class112 field688 = new class112();

    @ObfuscatedName("client.fg")
    public static int field691 = 0;

    @ObfuscatedName("client.fi")
    public static boolean field747 = false;

    @ObfuscatedName("client.fy")
    public static boolean field692 = true;

    @ObfuscatedName("client.fx")
    public static class310 field693 = new class310();

    @ObfuscatedName("client.fn")
    public static HashMap field757 = new HashMap();

    @ObfuscatedName("client.gz")
    public static int field695 = 0;

    @ObfuscatedName("client.gb")
    public static int field696 = 1;

    @ObfuscatedName("client.gs")
    public static int field697 = 0;

    @ObfuscatedName("client.gv")
    public static int field698 = 1;

    @ObfuscatedName("client.gm")
    public static int field699 = 0;

    @ObfuscatedName("client.gl")
    public static boolean field701 = false;

    @ObfuscatedName("client.gk")
    public static int[][][] field702 = new int[4][13][13];

    @ObfuscatedName("client.gd")
    public static final int[] field703 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gp")
    public static int field914 = 0;

    @ObfuscatedName("client.ht")
    public static int field705 = 2301979;

    @ObfuscatedName("client.hm")
    public static int field706 = 5063219;

    @ObfuscatedName("client.hh")
    public static int field707 = 3353893;

    @ObfuscatedName("client.hn")
    public static int field708 = 7759444;

    @ObfuscatedName("client.hc")
    public static boolean field709 = false;

    @ObfuscatedName("client.hz")
    public static int field710 = 0;

    @ObfuscatedName("client.hv")
    public static int field711 = 128;

    @ObfuscatedName("client.hu")
    public static int field854 = 0;

    @ObfuscatedName("client.hi")
    public static int field647 = 0;

    @ObfuscatedName("client.hk")
    public static int field714 = 0;

    @ObfuscatedName("client.hx")
    public static int field715 = 0;

    @ObfuscatedName("client.hp")
    public static int field640 = 0;

    @ObfuscatedName("client.ir")
    public static int field885 = 0;

    @ObfuscatedName("client.in")
    public static int field821 = 50;

    @ObfuscatedName("client.it")
    public static String field796 = null;

    @ObfuscatedName("client.ik")
    public static int field719 = 0;

    @ObfuscatedName("client.ii")
    public static int field733 = 0;

    @ObfuscatedName("client.iu")
    public static int field721 = 0;

    @ObfuscatedName("client.ig")
    public static int field722 = 12;

    @ObfuscatedName("client.io")
    public static int field645 = 6;

    @ObfuscatedName("client.is")
    public static int field724 = 0;

    @ObfuscatedName("client.id")
    public static boolean field725 = false;

    @ObfuscatedName("client.il")
    public static int field726 = 0;

    @ObfuscatedName("client.im")
    public static boolean field727 = false;

    @ObfuscatedName("client.ip")
    public static int field728 = 0;

    @ObfuscatedName("client.if")
    public static int field729 = 0;

    @ObfuscatedName("client.ia")
    public static int field730 = 50;

    @ObfuscatedName("client.ij")
    public static int[] field740 = new int[field730];

    @ObfuscatedName("client.iw")
    public static int[] field886 = new int[field730];

    @ObfuscatedName("client.iv")
    public static int[] field732 = new int[field730];

    @ObfuscatedName("client.iy")
    public static int[] field734 = new int[field730];

    @ObfuscatedName("client.ib")
    public static int[] field832 = new int[field730];

    @ObfuscatedName("client.ji")
    public static int[] field736 = new int[field730];

    @ObfuscatedName("client.jw")
    public static int[] field737 = new int[field730];

    @ObfuscatedName("client.jk")
    public static String[] field738 = new String[field730];

    @ObfuscatedName("client.jd")
    public static int[][] field739 = new int[104][104];

    @ObfuscatedName("client.jl")
    public static int field784 = 0;

    @ObfuscatedName("client.jh")
    public static int field659 = -1;

    @ObfuscatedName("client.jq")
    public static int field742 = -1;

    @ObfuscatedName("client.jo")
    public static int field792 = 0;

    @ObfuscatedName("client.jn")
    public static int field744 = 0;

    @ObfuscatedName("client.ja")
    public static int field870 = 0;

    @ObfuscatedName("client.jy")
    public static int field746 = 0;

    @ObfuscatedName("client.jg")
    public static boolean field712 = true;

    @ObfuscatedName("client.jf")
    public static int field748 = 0;

    @ObfuscatedName("client.jv")
    public static int field842 = 0;

    @ObfuscatedName("client.jr")
    public static int field773 = 0;

    @ObfuscatedName("client.jc")
    public static int field751 = 0;

    @ObfuscatedName("client.jt")
    public static int field752 = 0;

    @ObfuscatedName("client.jb")
    public static int field771 = 0;

    @ObfuscatedName("client.jj")
    public static boolean field849 = false;

    @ObfuscatedName("client.js")
    public static int field755 = 0;

    @ObfuscatedName("client.ju")
    public static int field756 = 0;

    @ObfuscatedName("client.je")
    public static boolean field814 = true;

    @ObfuscatedName("client.kj")
    public static class98[] field830 = new class98[2048];

    @ObfuscatedName("client.kk")
    public static int field759 = -1;

    @ObfuscatedName("client.kl")
    public static int field760 = 0;

    @ObfuscatedName("client.ka")
    public static boolean field761 = true;

    @ObfuscatedName("client.kg")
    public static int field809 = 0;

    @ObfuscatedName("client.ko")
    public static int field763 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field772 = new int[1000];

    @ObfuscatedName("client.kz")
    public static final int[] field765 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kd")
    public static String[] field766 = new String[8];

    @ObfuscatedName("client.kp")
    public static boolean[] field672 = new boolean[8];

    @ObfuscatedName("client.kw")
    public static int[] field768 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ku")
    public static int field769 = -1;

    @ObfuscatedName("client.kb")
    public static class294[][][] field860 = new class294[4][104][104];

    @ObfuscatedName("client.ke")
    public static class294 field799 = new class294();

    @ObfuscatedName("client.kf")
    public static class294 field908 = new class294();

    @ObfuscatedName("client.kv")
    public static class294 field919 = new class294();

    @ObfuscatedName("client.kn")
    public static int[] field774 = new int[25];

    @ObfuscatedName("client.ks")
    public static int[] field775 = new int[25];

    @ObfuscatedName("client.lr")
    public static int[] field776 = new int[25];

    @ObfuscatedName("client.lk")
    public static int field777 = 0;

    @ObfuscatedName("client.lo")
    public static boolean field778 = false;

    @ObfuscatedName("client.ll")
    public static int field779 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field780 = new int[500];

    @ObfuscatedName("client.ln")
    public static int[] field835 = new int[500];

    @ObfuscatedName("client.lj")
    public static int[] field782 = new int[500];

    @ObfuscatedName("client.la")
    public static int[] field783 = new int[500];

    @ObfuscatedName("client.lv")
    public static String[] field856 = new String[500];

    @ObfuscatedName("client.lu")
    public static String[] field785 = new String[500];

    @ObfuscatedName("client.ly")
    public static boolean[] field717 = new boolean[500];

    @ObfuscatedName("client.ls")
    public static boolean field649 = false;

    @ObfuscatedName("client.lw")
    public static boolean field788 = false;

    @ObfuscatedName("client.le")
    public static boolean field723 = false;

    @ObfuscatedName("client.lh")
    public static boolean field790 = true;

    @ObfuscatedName("client.lm")
    public static int field791 = -1;

    @ObfuscatedName("client.lf")
    public static int field754 = -1;

    @ObfuscatedName("client.mi")
    public static int field793 = 0;

    @ObfuscatedName("client.ms")
    public static int field834 = 50;

    @ObfuscatedName("client.me")
    public static int field795 = 0;

    @ObfuscatedName("client.ml")
    public static boolean field797 = false;

    @ObfuscatedName("client.mp")
    public static int field798 = -1;

    @ObfuscatedName("client.mz")
    public static int field789 = -1;

    @ObfuscatedName("client.mk")
    public static String field800 = null;

    @ObfuscatedName("client.mn")
    public static String field770 = null;

    @ObfuscatedName("client.mx")
    public static int field637 = -1;

    @ObfuscatedName("client.mo")
    public static class362 field803 = new class362(8);

    @ObfuscatedName("client.ma")
    public static int field804 = 0;

    @ObfuscatedName("client.mc")
    public static int field806 = -1;

    @ObfuscatedName("client.mu")
    public static int field889 = 0;

    @ObfuscatedName("client.mv")
    public static int field913 = 0;

    @ObfuscatedName("client.mj")
    public static class247 field808 = null;

    @ObfuscatedName("client.mr")
    public static int field899 = 0;

    @ObfuscatedName("client.md")
    public static int field767 = 0;

    @ObfuscatedName("client.mg")
    public static int field811 = 0;

    @ObfuscatedName("client.mt")
    public static int field825 = -1;

    @ObfuscatedName("client.nc")
    public static boolean field843 = false;

    @ObfuscatedName("client.nk")
    public static class247 field839 = null;

    @ObfuscatedName("client.nm")
    public static class247 field815 = null;

    @ObfuscatedName("client.nf")
    public static class247 field816 = null;

    @ObfuscatedName("client.ni")
    public static int field817 = 0;

    @ObfuscatedName("client.nu")
    public static int field670 = 0;

    @ObfuscatedName("client.nv")
    public static class247 field819 = null;

    @ObfuscatedName("client.no")
    public static boolean field820 = false;

    @ObfuscatedName("client.nx")
    public static int field741 = -1;

    @ObfuscatedName("client.nw")
    public static int field822 = -1;

    @ObfuscatedName("client.np")
    public static boolean field823 = false;

    @ObfuscatedName("client.nq")
    public static int field855 = -1;

    @ObfuscatedName("client.nl")
    public static int field805 = -1;

    @ObfuscatedName("client.nz")
    public static boolean field826 = false;

    @ObfuscatedName("client.nd")
    public static int field827 = 1;

    @ObfuscatedName("client.nn")
    public static int[] field828 = new int[32];

    @ObfuscatedName("client.na")
    public static int field664 = 0;

    @ObfuscatedName("client.ns")
    public static int[] field883 = new int[32];

    @ObfuscatedName("client.nj")
    public static int field831 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field675 = new int[32];

    @ObfuscatedName("client.oc")
    public static int field833 = 0;

    @ObfuscatedName("client.oi")
    public static int[] field912 = new int[32];

    @ObfuscatedName("client.oe")
    public static int field853 = 0;

    @ObfuscatedName("client.on")
    public static int field836 = 0;

    @ObfuscatedName("client.op")
    public static int field837 = 0;

    @ObfuscatedName("client.oh")
    public static int field845 = 0;

    @ObfuscatedName("client.ox")
    public static int field655 = 0;

    @ObfuscatedName("client.of")
    public static int field840 = 0;

    @ObfuscatedName("client.oy")
    public static int field841 = 0;

    @ObfuscatedName("client.og")
    public static int field749 = 0;

    @ObfuscatedName("client.ou")
    public static int field660 = 0;

    @ObfuscatedName("client.ow")
    public static int field844 = 0;

    @ObfuscatedName("client.ot")
    public static class294 field801 = new class294();

    @ObfuscatedName("client.oj")
    public static class294 field653 = new class294();

    @ObfuscatedName("client.om")
    public static class294 field847 = new class294();

    @ObfuscatedName("client.oq")
    public static class362 field848 = new class362(512);

    @ObfuscatedName("client.ok")
    public static int field871 = 0;

    @ObfuscatedName("client.ol")
    public static int field850 = -2;

    @ObfuscatedName("client.ov")
    public static boolean[] field720 = new boolean[100];

    @ObfuscatedName("client.or")
    public static boolean[] field781 = new boolean[100];

    @ObfuscatedName("client.pc")
    public static boolean[] field861 = new boolean[100];

    @ObfuscatedName("client.pz")
    public static int[] field920 = new int[100];

    @ObfuscatedName("client.pl")
    public static int[] field743 = new int[100];

    @ObfuscatedName("client.pv")
    public static int[] field764 = new int[100];

    @ObfuscatedName("client.pa")
    public static int[] field857 = new int[100];

    @ObfuscatedName("client.pm")
    public static int field858 = 0;

    @ObfuscatedName("client.pq")
    public static long field859 = 0L;

    @ObfuscatedName("client.pb")
    public static boolean field900 = true;

    @ObfuscatedName("client.py")
    public static int[] field878 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ps")
    public static int field818 = 0;

    @ObfuscatedName("client.pg")
    public static int field863 = 0;

    @ObfuscatedName("client.pp")
    public static String field864 = "";

    @ObfuscatedName("client.pe")
    public static long[] field865 = new long[100];

    @ObfuscatedName("client.pn")
    public static int field866 = 0;

    @ObfuscatedName("client.pw")
    public static int field807 = 0;

    @ObfuscatedName("client.pi")
    public static int[] field868 = new int[128];

    @ObfuscatedName("client.ph")
    public static int[] field869 = new int[128];

    @ObfuscatedName("client.qb")
    public static long field810 = -1L;

    @ObfuscatedName("client.qh")
    public static class12[] field735 = new class12[1];

    @ObfuscatedName("client.qv")
    public static class4[] field872 = new class4[1];

    @ObfuscatedName("client.qq")
    public static int field873 = -1;

    @ObfuscatedName("client.qs")
    public static int field874 = 0;

    @ObfuscatedName("client.qu")
    public static int[] field875 = new int[1000];

    @ObfuscatedName("client.qp")
    public static int[] field876 = new int[1000];

    @ObfuscatedName("client.qz")
    public static class396[] field877 = new class396[1000];

    @ObfuscatedName("client.qy")
    public static int field745 = 0;

    @ObfuscatedName("client.qw")
    public static int field787 = 0;

    @ObfuscatedName("client.qj")
    public static int field880 = 0;

    @ObfuscatedName("client.qe")
    public static int field881 = -1;

    @ObfuscatedName("client.qr")
    public static boolean field882 = false;

    @ObfuscatedName("client.rj")
    public static int field867 = 0;

    @ObfuscatedName("client.rb")
    public static int[] field884 = new int[50];

    @ObfuscatedName("client.rt")
    public static int[] field758 = new int[50];

    @ObfuscatedName("client.rq")
    public static int[] field918 = new int[50];

    @ObfuscatedName("client.rx")
    public static int[] field704 = new int[50];

    @ObfuscatedName("client.rc")
    public static class50[] field888 = new class50[50];

    @ObfuscatedName("client.rg")
    public static boolean field762 = false;

    @ObfuscatedName("client.rs")
    public static boolean[] field694 = new boolean[5];

    @ObfuscatedName("client.rv")
    public static int[] field891 = new int[5];

    @ObfuscatedName("client.rd")
    public static int[] field892 = new int[5];

    @ObfuscatedName("client.rh")
    public static int[] field893 = new int[5];

    @ObfuscatedName("client.sb")
    public static int[] field894 = new int[5];

    @ObfuscatedName("client.sg")
    public static short field895 = 256;

    @ObfuscatedName("client.sp")
    public static short field896 = 205;

    @ObfuscatedName("client.si")
    public static short field897 = 256;

    @ObfuscatedName("client.so")
    public static short field898 = 320;

    @ObfuscatedName("client.sk")
    public static short field910 = 1;

    @ObfuscatedName("client.sm")
    public static short field829 = 32767;

    @ObfuscatedName("client.sa")
    public static short field901 = 1;

    @ObfuscatedName("client.su")
    public static short field902 = 32767;

    @ObfuscatedName("client.st")
    public static int field903 = 0;

    @ObfuscatedName("client.sw")
    public static int field904 = 0;

    @ObfuscatedName("client.sc")
    public static int field905 = 0;

    @ObfuscatedName("client.sy")
    public static int field906 = 0;

    @ObfuscatedName("client.ss")
    public static int field907 = 0;

    @ObfuscatedName("client.sj")
    public static class245 field838 = new class245();

    @ObfuscatedName("client.sd")
    public static int field909 = -1;

    @ObfuscatedName("client.sh")
    public static int field753 = -1;

    @ObfuscatedName("client.sn")
    public static class355 field911 = new class353();

    @ObfuscatedName("client.sv")
    public static class284[] field862 = new class284[8];

    @ObfuscatedName("client.sz")
    public static class75 field879 = new class75();

    @ObfuscatedName("client.tr")
    public static int field718 = -1;

    @ObfuscatedName("client.to")
    public static ArrayList field915 = new ArrayList(10);

    @ObfuscatedName("client.te")
    public static int field713 = 0;

    @ObfuscatedName("client.tx")
    public static int field917 = 0;

    @ObfuscatedName("client.ty")
    public static final class74 field786 = new class74();

    @ObfuscatedName("client.tu")
    public static int[] field690 = new int[50];

    @ObfuscatedName("client.tt")
    public static int[] field852 = new int[50];

    @ObfuscatedName("cx.ey(B)Lmc;")
    public static class357 method1995() {
        return Statics.field2928;
    }

    @ObfuscatedName("client.av(I)V")
    public final void method407() {
    }

    public final void init() {
        if (!this.method386()) {
            return;
        }
        for (int var1 = 0; var1 <= 20; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field692 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class106.field1347)) {
                            field641 = true;
                        } else {
                            field641 = false;
                        }
                        break;
                    case 4:
                        if (field643 == -1) {
                            field643 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field639 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field4141 = class290.method4690(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class263[] var4 = new class263[] { class263.field3205, class263.field3208, class263.field3207, class263.field3206 };
                        class263[] var5 = var4;
                        int var6 = 0;
                        class263 var8;
                        while (true) {
                            if (var6 >= var5.length) {
                                var8 = null;
                                break;
                            }
                            class263 var7 = var5[var6];
                            if (var7.field3210 == var3) {
                                var8 = var7;
                                break;
                            }
                            var6++;
                        }
                        Statics.field2366 = var8;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class106.field1347)) {
                        }
                        break;
                    case 9:
                        Statics.field4080 = var2;
                        break;
                    case 10:
                        class264[] var9 = new class264[] { class264.field3213, class264.field3218, class264.field3216, class264.field3212, class264.field3214, class264.field3215 };
                        Statics.field462 = (class264) class289.method2163(var9, Integer.parseInt(var2));
                        if (Statics.field462 == class264.field3212) {
                            Statics.field2039 = class365.field4091;
                        } else {
                            Statics.field2039 = class365.field4092;
                        }
                        break;
                    case 12:
                        field638 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field1095 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field851 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field59 = var2;
                }
            }
        }
        class198.field2324 = false;
        field642 = false;
        Statics.field1004 = this.getCodeBase().getHost();
        String var10 = Statics.field2366.field3209;
        byte var11 = 0;
        try {
            Statics.field470 = 21;
            Statics.field1459 = var11;
            try {
                Statics.field260 = System.getProperty("os.name");
            } catch (Exception var25) {
                Statics.field260 = "Unknown";
            }
            Statics.field1439 = Statics.field260.toLowerCase();
            try {
                Statics.field197 = System.getProperty("user.home");
                if (Statics.field197 != null) {
                    Statics.field197 = Statics.field197 + "/";
                }
            } catch (Exception var24) {
            }
            try {
                if (Statics.field1439.startsWith("win")) {
                    if (Statics.field197 == null) {
                        Statics.field197 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field197 == null) {
                    Statics.field197 = System.getenv("HOME");
                }
                if (Statics.field197 != null) {
                    Statics.field197 = Statics.field197 + "/";
                }
            } catch (Exception var23) {
            }
            if (Statics.field197 == null) {
                Statics.field197 = "~/";
            }
            Statics.field1167 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field197, "/tmp/", "" };
            Statics.field3554 = new String[] { ".jagex_cache_" + Statics.field1459, ".file_store_" + Statics.field1459 };
            label135: for (int var15 = 0; var15 < 4; var15++) {
                Statics.field123 = class129.method294("oldschool", var10, var15);
                if (!Statics.field123.exists()) {
                    Statics.field123.mkdirs();
                }
                File[] var16 = Statics.field123.listFiles();
                if (var16 == null) {
                    break;
                }
                File[] var17 = var16;
                int var18 = 0;
                while (true) {
                    if (var18 >= var17.length) {
                        break label135;
                    }
                    File var19 = var17[var18];
                    if (!class129.method3745(var19, false)) {
                        break;
                    }
                    var18++;
                }
            }
            File var20 = Statics.field123;
            Statics.field1495 = var20;
            if (!Statics.field1495.exists()) {
                throw new RuntimeException("");
            }
            class131.field1497 = true;
            class129.method708();
            class129.field1493 = new class368(new class367(class131.method966("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class129.field1488 = new class368(new class367(class131.method966("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1160 = new class368[Statics.field470];
            for (int var21 = 0; var21 < Statics.field470; var21++) {
                Statics.field1160[var21] = new class368(new class367(class131.method966("main_file_cache.idx" + var21), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var26) {
            class406.method4407((String) null, var26);
        }
        Statics.field204 = this;
        Statics.field4293 = field643;
        if (field644 == -1) {
            field644 = 0;
        }
        this.method384(765, 503, 196);
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method397() {
        class308.method1794(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field1931 = field851 == 0 ? 43594 : field638 + 40000;
        Statics.field3630 = field851 == 0 ? 443 : field638 + 50000;
        Statics.field3948 = Statics.field1931;
        Statics.field234 = class246.field2945;
        Statics.field138 = class246.field2941;
        Statics.field1443 = class246.field2942;
        Statics.field1709 = class246.field2943;
        Statics.field2759 = new class113();
        this.method378();
        this.method396();
        Statics.field2839 = this.method375();
        Statics.field317 = new class333(255, class129.field1493, class129.field1488, 500000);
        class367 var1 = null;
        class103 var2 = new class103();
        try {
            var1 = class129.method1727("", Statics.field462.field3217, false);
            byte[] var3 = new byte[(int) var1.method5809()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method5810(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class103(new class383(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method5823();
            }
        } catch (Exception var11) {
        }
        Statics.field1804 = var2;
        this.method515();
        String var10 = Statics.field1417;
        class45.field323 = this;
        if (var10 != null) {
            class45.field319 = var10;
        }
        if (field851 != 0) {
            field656 = true;
        }
        method2945(Statics.field1804.field1329);
        Statics.field1508 = new class77(Statics.field2039);
    }

    @ObfuscatedName("client.al(B)V")
    public final void method490() {
        field650++;
        this.method1021();
        while (true) {
            class294 var1 = class272.field3566;
            class271 var2;
            synchronized (class272.field3566) {
                var2 = (class271) class272.field3564.method4743();
            }
            if (var2 == null) {
                class233.method1687();
                method1997();
                class39 var4 = class39.field292;
                synchronized (class39.field292) {
                    class39.field291++;
                    class39.field294 = class39.field296;
                    class39.field293 = 0;
                    if (class39.field289 >= 0) {
                        while (class39.field297 != class39.field289) {
                            int var6 = class39.field288[class39.field297];
                            class39.field297 = class39.field297 + 1 & 0x7F;
                            if (var6 < 0) {
                                class39.field286[~var6] = false;
                            } else {
                                if (!class39.field286[var6] && class39.field293 < class39.field275.length - 1) {
                                    class39.field275[++class39.field293 - 1] = var6;
                                }
                                class39.field286[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class39.field286[var5] = false;
                        }
                        class39.field289 = class39.field297;
                    }
                    if (class39.field293 > 0) {
                        class39.field291 = 0;
                    }
                    class39.field296 = class39.field295;
                }
                class48.method1971();
                if (Statics.field2839 != null) {
                    int var8 = Statics.field2839.method254();
                    field844 = var8;
                }
                if (field646 == 0) {
                    method2361();
                    Statics.field339.method2285();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field363[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field342[var10] = 0L;
                    }
                    Statics.field3194 = 0;
                } else if (field646 == 5) {
                    class84.method3247(this);
                    method2361();
                    Statics.field339.method2285();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field363[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field342[var12] = 0L;
                    }
                    Statics.field3194 = 0;
                } else if (field646 == 10 || field646 == 11) {
                    class84.method3247(this);
                } else if (field646 == 20) {
                    class84.method3247(this);
                    this.method1381();
                } else if (field646 == 25) {
                    method3354();
                }
                if (field646 == 30) {
                    this.method1334();
                } else if (field646 == 40 || field646 == 45) {
                    this.method1381();
                }
                return;
            }
            var2.field3558.method4445(var2.field3555, (int) var2.field3938, var2.field3556, false);
        }
    }

    @ObfuscatedName("client.ad(ZS)V")
    public final void method399(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class233.field2828 == 2) {
                    if (Statics.field26 == null) {
                        Statics.field26 = class238.method4206(Statics.field2520, Statics.field241, Statics.field159);
                        if (Statics.field26 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field1397 == null) {
                        Statics.field1397 = new class56(Statics.field1559, Statics.field2832);
                    }
                    if (Statics.field1467.method4019(Statics.field26, Statics.field2830, Statics.field1397, 22050)) {
                        Statics.field1467.method4120();
                        Statics.field1467.method4040(Statics.field2829);
                        Statics.field1467.method4022(Statics.field26, Statics.field2827);
                        class233.field2828 = 0;
                        Statics.field26 = null;
                        Statics.field1397 = null;
                        Statics.field2520 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field1467.method4017();
                class233.field2828 = 0;
                Statics.field26 = null;
                Statics.field1397 = null;
                Statics.field2520 = null;
            }
            var2 = false;
        }
        if (var2 && field882 && Statics.field3945 != null) {
            Statics.field3945.method665();
        }
        if ((field646 == 10 || field646 == 20 || field646 == 30) && field859 != 0L && class380.method2744() > field859) {
            method2945(method2559());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field720[var5] = true;
            }
        }
        if (field646 == 0) {
            this.method401(class84.field1031, class84.field1050, arg0);
        } else if (field646 == 5) {
            class84.method1562(Statics.field3099, Statics.field1297, Statics.field1447);
        } else if (field646 == 10 || field646 == 11) {
            class84.method1562(Statics.field3099, Statics.field1297, Statics.field1447);
        } else if (field646 == 20) {
            class84.method1562(Statics.field3099, Statics.field1297, Statics.field1447);
        } else if (field646 == 25) {
            if (field699 == 1) {
                if (field695 > field696) {
                    field696 = field695;
                }
                int var6 = (field696 * 50 - field695 * 50) / field696;
                method4386(class268.field3265 + class106.field1353 + class106.field1350 + var6 + "%" + class106.field1351, false);
            } else if (field699 == 2) {
                if (field697 > field698) {
                    field698 = field697;
                }
                int var7 = (field698 * 50 - field697 * 50) / field698 + 50;
                method4386(class268.field3265 + class106.field1353 + class106.field1350 + var7 + "%" + class106.field1351, false);
            } else {
                method4386(class268.field3265, false);
            }
        } else if (field646 == 30) {
            this.method1028();
        } else if (field646 == 40) {
            method4386(class268.field3246 + class106.field1353 + class268.field3247, false);
        } else if (field646 == 45) {
            method4386(class268.field3411, false);
        }
        if (field646 == 30 && field858 == 0 && !arg0 && !field900) {
            for (int var8 = 0; var8 < field871; var8++) {
                if (field781[var8]) {
                    Statics.field222.method356(field920[var8], field743[var8], field764[var8], field857[var8]);
                    field781[var8] = false;
                }
            }
        } else if (field646 > 0) {
            Statics.field222.method371(0, 0);
            for (int var9 = 0; var9 < field871; var9++) {
                field781[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ai(I)V")
    public final void method400() {
        if (Statics.field636.method2106()) {
            Statics.field636.method2103();
        }
        if (Statics.field3171 != null) {
            Statics.field3171.field1189 = false;
        }
        Statics.field3171 = null;
        field688.method2185();
        if (class39.field292 != null) {
            class39 var1 = class39.field292;
            synchronized (class39.field292) {
                class39.field292 = null;
            }
        }
        if (class48.field371 != null) {
            class48 var3 = class48.field371;
            synchronized (class48.field371) {
                class48.field371 = null;
            }
        }
        Statics.field2839 = null;
        if (Statics.field3945 != null) {
            Statics.field3945.method635();
        }
        if (Statics.field1192 != null) {
            Statics.field1192.method635();
        }
        class276.method2438();
        class272.method4333();
        if (Statics.field2759 != null) {
            Statics.field2759.method2190();
            Statics.field2759 = null;
        }
        class129.method1563();
    }

    @ObfuscatedName("o.eh(IB)V")
    public static void method140(int arg0) {
        if (field646 == arg0) {
            return;
        }
        if (field646 == 0) {
            Statics.field204.method402();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field673 = 0;
            field674 = 0;
            field846 = 0;
            field693.method5118(arg0);
            if (arg0 != 20) {
                method2608(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field689 != null) {
            Statics.field689.method2357();
            Statics.field689 = null;
        }
        if (field646 == 25) {
            field699 = 0;
            field695 = 0;
            field696 = 1;
            field697 = 0;
            field698 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method3331(Statics.field468, Statics.field3632, true, 0);
        } else if (arg0 == 20) {
            Statics.method3331(Statics.field468, Statics.field3632, true, field646 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method3331(Statics.field468, Statics.field3632, false, 4);
        } else if (Statics.field1047) {
            Statics.field3197 = null;
            Statics.field1026 = null;
            Statics.field1025 = null;
            Statics.field1027 = null;
            Statics.field172 = null;
            Statics.field4053 = null;
            Statics.field550 = null;
            Statics.field952 = null;
            Statics.field3660 = null;
            Statics.field3914 = null;
            Statics.field212 = null;
            Statics.field1751 = null;
            Statics.field155 = null;
            Statics.field598 = null;
            Statics.field210.method2001();
            class233.method2947(2);
            class276.method4405(true);
            Statics.field1047 = false;
        }
        field646 = arg0;
    }

    @ObfuscatedName("client.ei(I)V")
    public void method1021() {
        if (field646 == 1000) {
            return;
        }
        long var1 = class380.method2744();
        int var3 = (int) (var1 - Statics.field160);
        Statics.field160 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class276.field3602 += var3;
        boolean var4;
        if (class276.field3611 == 0 && class276.field3616 == 0 && class276.field3609 == 0 && class276.field3604 == 0) {
            var4 = true;
        } else if (Statics.field3607 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class276.field3602 > 30000) {
                        throw new IOException();
                    }
                    while (class276.field3616 < 200 && class276.field3604 > 0) {
                        class274 var5 = (class274) class276.field3603.method5774();
                        class383 var6 = new class383(4);
                        var6.method6043(1);
                        var6.method5950((int) var5.field3938);
                        Statics.field3607.method2333(var6.field4155, 0, 4);
                        class276.field3615.method5768(var5, var5.field3938);
                        class276.field3604--;
                        class276.field3616++;
                    }
                    while (class276.field3611 < 200 && class276.field3609 > 0) {
                        class274 var7 = (class274) class276.field3610.method4702();
                        class383 var8 = new class383(4);
                        var8.method6043(0);
                        var8.method5950((int) var7.field3938);
                        Statics.field3607.method2333(var8.field4155, 0, 4);
                        var7.method5487();
                        class276.field3605.method5768(var7, var7.field3938);
                        class276.field3609--;
                        class276.field3611++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3607.method2327();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class276.field3602 = 0;
                        byte var11 = 0;
                        if (Statics.field1462 == null) {
                            var11 = 8;
                        } else if (class276.field3613 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class276.field3612.field4158;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3607.method2352(class276.field3612.field4155, class276.field3612.field4158, var12);
                            if (class276.field3608 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class276.field3612.field4155[class276.field3612.field4158 + var13] ^= class276.field3608;
                                }
                            }
                            class276.field3612.field4158 += var12;
                            if (class276.field3612.field4158 < var11) {
                                break;
                            }
                            if (Statics.field1462 == null) {
                                class276.field3612.field4158 = 0;
                                int var14 = class276.field3612.method5965();
                                int var15 = class276.field3612.method5967();
                                int var16 = class276.field3612.method5965();
                                int var17 = class276.field3612.method5970();
                                long var18 = (long) ((var14 << 16) + var15);
                                class274 var20 = (class274) class276.field3615.method5766(var18);
                                Statics.field76 = true;
                                if (var20 == null) {
                                    var20 = (class274) class276.field3605.method5766(var18);
                                    Statics.field76 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1462 = var20;
                                Statics.field457 = new class383(var17 + var21 + Statics.field1462.field3580);
                                Statics.field457.method6043(var16);
                                Statics.field457.method5951(var17);
                                class276.field3613 = 8;
                                class276.field3612.field4158 = 0;
                            } else if (class276.field3613 == 0) {
                                if (class276.field3612.field4155[0] == -1) {
                                    class276.field3613 = 1;
                                    class276.field3612.field4158 = 0;
                                } else {
                                    Statics.field1462 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field457.field4155.length - Statics.field1462.field3580;
                            int var23 = 512 - class276.field3613;
                            if (var23 > var22 - Statics.field457.field4158) {
                                var23 = var22 - Statics.field457.field4158;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3607.method2352(Statics.field457.field4155, Statics.field457.field4158, var23);
                            if (class276.field3608 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field457.field4155[Statics.field457.field4158 + var24] ^= class276.field3608;
                                }
                            }
                            Statics.field457.field4158 += var23;
                            class276.field3613 += var23;
                            if (Statics.field457.field4158 == var22) {
                                if (Statics.field1462.field3938 == 16711935L) {
                                    Statics.field1476 = Statics.field457;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class273 var26 = class276.field3601[var25];
                                        if (var26 != null) {
                                            Statics.field1476.field4158 = var25 * 8 + 5;
                                            int var27 = Statics.field1476.method5970();
                                            int var28 = Statics.field1476.method5970();
                                            var26.method4425(var27, var28);
                                        }
                                    }
                                } else {
                                    class276.field3606.reset();
                                    class276.field3606.update(Statics.field457.field4155, 0, var22);
                                    int var29 = (int) class276.field3606.getValue();
                                    if (Statics.field1462.field3582 != var29) {
                                        try {
                                            Statics.field3607.method2357();
                                        } catch (Exception var35) {
                                        }
                                        class276.field3614++;
                                        Statics.field3607 = null;
                                        class276.field3608 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class276.field3614 = 0;
                                    class276.field3618 = 0;
                                    Statics.field1462.field3581.method4426((int) (Statics.field1462.field3938 & 0xFFFFL), Statics.field457.field4155, (Statics.field1462.field3938 & 0xFF0000L) == 16711680L, Statics.field76);
                                }
                                Statics.field1462.method5496();
                                if (Statics.field76) {
                                    class276.field3616--;
                                } else {
                                    class276.field3611--;
                                }
                                class276.field3613 = 0;
                                Statics.field1462 = null;
                                Statics.field457 = null;
                            } else {
                                if (class276.field3613 != 512) {
                                    break;
                                }
                                class276.field3613 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3607.method2357();
                } catch (Exception var34) {
                }
                class276.field3618++;
                Statics.field3607 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1356();
        }
    }

    @ObfuscatedName("client.ev(I)V")
    public void method1356() {
        if (class276.field3614 >= 4) {
            this.method403("js5crc");
            field646 = 1000;
            return;
        }
        if (class276.field3618 >= 4) {
            if (field646 <= 5) {
                this.method403("js5io");
                field646 = 1000;
                return;
            }
            field671 = 3000;
            class276.field3618 = 3;
        }
        if (--field671 + 1 > 0) {
            return;
        }
        try {
            if (field794 == 0) {
                Statics.field1920 = Statics.field348.method2294(Statics.field1004, Statics.field3948);
                field794++;
            }
            if (field794 == 1) {
                if (Statics.field1920.field1524 == 2) {
                    this.method1023(-1);
                    return;
                }
                if (Statics.field1920.field1524 == 1) {
                    field794++;
                }
            }
            if (field794 == 2) {
                if (field692) {
                    Socket var1 = (Socket) Statics.field1920.field1532;
                    class330 var2 = new class330(var1, 40000, 5000);
                    Statics.field2109 = var2;
                } else {
                    Statics.field2109 = new class132((Socket) Statics.field1920.field1532, Statics.field348, 5000);
                }
                class383 var3 = new class383(5);
                var3.method6043(15);
                var3.method5951(196);
                Statics.field2109.method2333(var3.field4155, 0, 5);
                field794++;
                Statics.field3557 = class380.method2744();
            }
            if (field794 == 3) {
                if (Statics.field2109.method2327() > 0 || !field692 && field646 <= 5) {
                    int var4 = Statics.field2109.method2328();
                    if (var4 != 0) {
                        this.method1023(var4);
                        return;
                    }
                    field794++;
                } else if (class380.method2744() - Statics.field3557 > 30000L) {
                    this.method1023(-2);
                    return;
                }
            }
            if (field794 == 4) {
                class329 var5 = Statics.field2109;
                boolean var6 = field646 > 20;
                if (Statics.field3607 != null) {
                    try {
                        Statics.field3607.method2357();
                    } catch (Exception var16) {
                    }
                    Statics.field3607 = null;
                }
                Statics.field3607 = var5;
                class276.method4405(var6);
                class276.field3612.field4158 = 0;
                Statics.field1462 = null;
                Statics.field457 = null;
                class276.field3613 = 0;
                while (true) {
                    class274 var8 = (class274) class276.field3615.method5774();
                    if (var8 == null) {
                        while (true) {
                            class274 var9 = (class274) class276.field3605.method5774();
                            if (var9 == null) {
                                if (class276.field3608 != 0) {
                                    try {
                                        class383 var10 = new class383(4);
                                        var10.method6043(4);
                                        var10.method6043(class276.field3608);
                                        var10.method6166(0);
                                        Statics.field3607.method2333(var10.field4155, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field3607.method2357();
                                        } catch (Exception var14) {
                                        }
                                        class276.field3618++;
                                        Statics.field3607 = null;
                                    }
                                }
                                class276.field3602 = 0;
                                Statics.field160 = class380.method2744();
                                Statics.field1920 = null;
                                Statics.field2109 = null;
                                field794 = 0;
                                field887 = 0;
                                return;
                            }
                            class276.field3610.method4699(var9);
                            class276.field3617.method5768(var9, var9.field3938);
                            class276.field3609++;
                            class276.field3611--;
                        }
                    }
                    class276.field3603.method5768(var8, var8.field3938);
                    class276.field3604++;
                    class276.field3616--;
                }
            }
        } catch (IOException var17) {
            this.method1023(-3);
        }
    }

    @ObfuscatedName("client.eq(II)V")
    public void method1023(int arg0) {
        Statics.field1920 = null;
        Statics.field2109 = null;
        field794 = 0;
        if (Statics.field3948 == Statics.field1931) {
            Statics.field3948 = Statics.field3630;
        } else {
            Statics.field3948 = Statics.field1931;
        }
        field887++;
        if (field887 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field646 <= 5) {
                this.method403("js5connect_full");
                field646 = 1000;
            } else {
                field671 = 3000;
            }
        } else if (field887 >= 2 && arg0 == 6) {
            this.method403("js5connect_outofdate");
            field646 = 1000;
        } else if (field887 >= 4) {
            if (field646 <= 5) {
                this.method403("js5connect");
                field646 = 1000;
            } else {
                field671 = 3000;
            }
        }
    }

    @ObfuscatedName("c.fz(Ljp;Ljava/lang/String;I)V")
    public static void method142(class273 arg0, String arg1) {
        class92 var2 = new class92(arg0, arg1);
        field915.add(var2);
        field917 += var2.field1141;
    }

    @ObfuscatedName("ao.fc(I)I")
    public static int method341() {
        if (field915 == null || field713 >= field915.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field713; var1++) {
            var0 += ((class92) field915.get(var1)).field1142;
        }
        return var0 * 10000 / field917;
    }

    @ObfuscatedName("cr.fa(II)I")
    public static int method1793(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("k.ft(IIB)V")
    public static void method153(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method1793(var4);
            int var6 = class196.field2275[var4];
            int var7 = method3324(var5, arg1);
            var2[var3] = var6 * var7 >> 16;
        }
        class198.method3706(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ek.fs(B)V")
    public static void method2361() {
        if (field669 == 0) {
            Statics.field3862 = new class198(4, 104, 104, class90.field1128);
            for (int var0 = 0; var0 < 4; var0++) {
                field700[var0] = new class158(104, 104);
            }
            Statics.field366 = new class396(512, 512);
            class84.field1050 = class268.field3248;
            class84.field1031 = 5;
            field669 = 20;
        } else if (field669 == 20) {
            class84.field1050 = class268.field3249;
            class84.field1031 = 10;
            field669 = 30;
        } else if (field669 == 30) {
            Statics.field3619 = method5729(0, false, true, true);
            Statics.field227 = method5729(1, false, true, true);
            Statics.field74 = method5729(2, true, false, true);
            Statics.field37 = method5729(3, false, true, true);
            Statics.field243 = method5729(4, false, true, true);
            Statics.field3108 = method5729(5, true, true, true);
            Statics.field1427 = method5729(6, true, true, true);
            Statics.field549 = method5729(7, false, true, true);
            Statics.field3632 = method5729(8, false, true, true);
            Statics.field1904 = method5729(9, false, true, true);
            Statics.field468 = method5729(10, false, true, true);
            Statics.field2004 = method5729(11, false, true, true);
            Statics.field1440 = method5729(12, false, true, true);
            Statics.field547 = method5729(13, true, false, true);
            Statics.field1475 = method5729(14, false, true, true);
            Statics.field3832 = method5729(15, false, true, true);
            Statics.field71 = method5729(17, true, true, true);
            Statics.field4062 = method5729(18, false, true, true);
            Statics.field2105 = method5729(19, false, true, true);
            Statics.field55 = method5729(20, false, true, true);
            class84.field1050 = class268.field3323;
            class84.field1031 = 20;
            field669 = 40;
        } else if (field669 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field3619.method4422() * 4 / 100;
            int var3 = var2 + Statics.field227.method4422() * 4 / 100;
            int var4 = var3 + Statics.field74.method4422() * 2 / 100;
            int var5 = var4 + Statics.field37.method4422() * 2 / 100;
            int var6 = var5 + Statics.field243.method4422() * 6 / 100;
            int var7 = var6 + Statics.field3108.method4422() * 4 / 100;
            int var8 = var7 + Statics.field1427.method4422() * 2 / 100;
            int var9 = var8 + Statics.field549.method4422() * 56 / 100;
            int var10 = var9 + Statics.field3632.method4422() * 2 / 100;
            int var11 = var10 + Statics.field1904.method4422() * 2 / 100;
            int var12 = var11 + Statics.field468.method4422() * 2 / 100;
            int var13 = var12 + Statics.field2004.method4422() * 2 / 100;
            int var14 = var13 + Statics.field1440.method4422() * 2 / 100;
            int var15 = var14 + Statics.field547.method4422() * 2 / 100;
            int var16 = var15 + Statics.field1475.method4422() * 2 / 100;
            int var17 = var16 + Statics.field3832.method4422() * 2 / 100;
            int var18 = var17 + Statics.field2105.method4422() / 100;
            int var19 = var18 + Statics.field4062.method4422() / 100;
            int var20 = var19 + Statics.field55.method4422() / 100;
            int var21 = var20 + (Statics.field71.method4421() && Statics.field71.method4504() ? 1 : 0);
            if (var21 == 100) {
                method142(Statics.field3619, "Animations");
                method142(Statics.field227, "Skeletons");
                method142(Statics.field243, "Sound FX");
                method142(Statics.field3108, "Maps");
                method142(Statics.field1427, "Music Tracks");
                method142(Statics.field549, "Models");
                method142(Statics.field3632, "Sprites");
                method142(Statics.field2004, "Music Jingles");
                method142(Statics.field1475, "Music Samples");
                method142(Statics.field3832, "Music Patches");
                method142(Statics.field2105, "World Map");
                method142(Statics.field4062, "World Map Geography");
                method142(Statics.field55, "World Map Ground");
                Statics.field1486 = new class336();
                Statics.field1486.method5416(Statics.field71);
                class84.field1050 = class268.field3252;
                class84.field1031 = 30;
                field669 = 45;
            } else {
                if (var21 != 0) {
                    class84.field1050 = class268.field3251 + var21 + "%";
                }
                class84.field1031 = 30;
            }
        } else if (field669 == 45) {
            boolean var22 = !field642;
            Statics.field429 = 22050;
            Statics.field417 = var22;
            Statics.field419 = 2;
            class234 var23 = new class234();
            var23.method4093(9, 128);
            Statics.field3945 = class53.method2525(Statics.field348, 0, 22050);
            Statics.field3945.method632(var23);
            class233.method3333(Statics.field3832, Statics.field1475, Statics.field243, var23);
            Statics.field1192 = class53.method2525(Statics.field348, 1, 2048);
            Statics.field3765 = new class49();
            Statics.field1192.method632(Statics.field3765);
            Statics.field1370 = new class66(22050, Statics.field429);
            class84.field1050 = class268.field3399;
            class84.field1031 = 35;
            field669 = 50;
            Statics.field923 = new class358(Statics.field3632, Statics.field547);
        } else if (field669 == 50) {
            class359[] var24 = new class359[] { class359.field4063, class359.field4055, class359.field4058, class359.field4054, class359.field4057, class359.field4056 };
            int var25 = var24.length;
            class358 var26 = Statics.field923;
            class359[] var27 = new class359[] { class359.field4063, class359.field4055, class359.field4058, class359.field4054, class359.field4057, class359.field4056 };
            field757 = var26.method5727(var27);
            if (field757.size() < var25) {
                class84.field1050 = class268.field3254 + field757.size() * 100 / var25 + "%";
                class84.field1031 = 40;
            } else {
                Statics.field1297 = (class300) field757.get(class359.field4055);
                Statics.field1447 = (class300) field757.get(class359.field4063);
                Statics.field3099 = (class300) field757.get(class359.field4056);
                Statics.field89 = field911.method5499();
                class84.field1050 = class268.field3255;
                class84.field1031 = 40;
                field669 = 60;
            }
        } else if (field669 == 60) {
            class273 var28 = Statics.field468;
            class273 var29 = Statics.field3632;
            int var30 = 0;
            if (var28.method4488("title.jpg", "")) {
                var30++;
            }
            if (var29.method4488("logo", "")) {
                var30++;
            }
            if (var29.method4488("logo_deadman_mode", "")) {
                var30++;
            }
            if (var29.method4488("logo_seasonal_mode", "")) {
                var30++;
            }
            if (var29.method4488("titlebox", "")) {
                var30++;
            }
            if (var29.method4488("titlebutton", "")) {
                var30++;
            }
            if (var29.method4488("runes", "")) {
                var30++;
            }
            if (var29.method4488("title_mute", "")) {
                var30++;
            }
            if (var29.method4488("options_radio_buttons,0", "")) {
                var30++;
            }
            if (var29.method4488("options_radio_buttons,2", "")) {
                var30++;
            }
            if (var29.method4488("options_radio_buttons,4", "")) {
                var30++;
            }
            if (var29.method4488("options_radio_buttons,6", "")) {
                var30++;
            }
            var29.method4488("sl_back", "");
            var29.method4488("sl_flags", "");
            var29.method4488("sl_arrows", "");
            var29.method4488("sl_stars", "");
            var29.method4488("sl_button", "");
            int var33 = class84.method5365();
            if (var30 < var33) {
                class84.field1050 = class268.field3333 + var30 * 100 / var33 + "%";
                class84.field1031 = 50;
            } else {
                class84.field1050 = class268.field3257;
                class84.field1031 = 50;
                method140(5);
                field669 = 70;
            }
        } else if (field669 == 70) {
            if (Statics.field74.method4504()) {
                class273 var34 = Statics.field74;
                Statics.field1611 = var34;
                class149.method186(Statics.field74);
                class141.method1821(Statics.field74, Statics.field549);
                class273 var35 = Statics.field74;
                class273 var36 = Statics.field549;
                boolean var37 = field642;
                Statics.field1754 = var35;
                Statics.field3779 = var36;
                class154.field1758 = var37;
                class273 var38 = Statics.field74;
                class273 var39 = Statics.field549;
                Statics.field1668 = var38;
                Statics.field1656 = var39;
                class152.method144(Statics.field74);
                class273 var40 = Statics.field74;
                class273 var41 = Statics.field549;
                boolean var42 = field641;
                class300 var43 = Statics.field1297;
                Statics.field3927 = var40;
                Statics.field3784 = var41;
                Statics.field1153 = var42;
                Statics.field1809 = Statics.field3927.method4478(10);
                Statics.field3673 = var43;
                class273 var44 = Statics.field74;
                class273 var45 = Statics.field3619;
                class273 var46 = Statics.field227;
                Statics.field1874 = var44;
                Statics.field1890 = var45;
                Statics.field1875 = var46;
                class148.method9(Statics.field74, Statics.field549);
                class150.method2253(Statics.field74);
                class138.method4614(Statics.field74);
                class273 var47 = Statics.field37;
                class273 var48 = Statics.field549;
                class273 var49 = Statics.field3632;
                class273 var50 = Statics.field547;
                Statics.field1299 = var47;
                Statics.field2917 = var48;
                Statics.field2940 = var49;
                Statics.field2509 = var50;
                Statics.field2951 = new class247[Statics.field1299.method4536()][];
                Statics.field2952 = new boolean[Statics.field1299.method4536()];
                class137.method2009(Statics.field74);
                class144.method4653(Statics.field74);
                class140.method2166(Statics.field74);
                class273 var51 = Statics.field74;
                Statics.field1715 = var51;
                Statics.field635 = new class370(Statics.field462, 54, Statics.field4141, Statics.field74);
                Statics.field2505 = new class370(Statics.field462, 47, Statics.field4141, Statics.field74);
                Statics.field636 = new class110();
                class273 var52 = Statics.field74;
                class273 var53 = Statics.field3632;
                class273 var54 = Statics.field547;
                Statics.field1726 = var52;
                Statics.field1735 = var53;
                Statics.field1734 = var54;
                class273 var55 = Statics.field74;
                class273 var56 = Statics.field3632;
                Statics.field1595 = var55;
                Statics.field1602 = var56;
                class139.method2231(Statics.field74, Statics.field3632);
                class84.field1050 = class268.field3259;
                class84.field1031 = 60;
                field669 = 80;
            } else {
                class84.field1050 = class268.field3258 + Statics.field74.method4430() + "%";
                class84.field1031 = 60;
            }
        } else if (field669 == 80) {
            int var57 = 0;
            if (Statics.field1669 == null) {
                Statics.field1669 = class397.method3963(Statics.field3632, Statics.field1486.field3900, 0);
            } else {
                var57++;
            }
            if (Statics.field992 == null) {
                Statics.field992 = class397.method3963(Statics.field3632, Statics.field1486.field3898, 0);
            } else {
                var57++;
            }
            if (Statics.field88 == null) {
                Statics.field88 = class397.method2558(Statics.field3632, Statics.field1486.field3897, 0);
            } else {
                var57++;
            }
            if (Statics.field264 == null) {
                Statics.field264 = class397.method2846(Statics.field3632, Statics.field1486.field3903, 0);
            } else {
                var57++;
            }
            if (Statics.field2398 == null) {
                Statics.field2398 = class397.method2846(Statics.field3632, Statics.field1486.field3901, 0);
            } else {
                var57++;
            }
            if (Statics.field2700 == null) {
                Statics.field2700 = class397.method2846(Statics.field3632, Statics.field1486.field3902, 0);
            } else {
                var57++;
            }
            if (Statics.field1960 == null) {
                Statics.field1960 = class397.method2846(Statics.field3632, Statics.field1486.field3906, 0);
            } else {
                var57++;
            }
            if (Statics.field1149 == null) {
                Statics.field1149 = class397.method2846(Statics.field3632, Statics.field1486.field3904, 0);
            } else {
                var57++;
            }
            if (Statics.field2022 == null) {
                Statics.field2022 = class397.method2846(Statics.field3632, Statics.field1486.field3905, 0);
            } else {
                var57++;
            }
            if (Statics.field1202 == null) {
                Statics.field1202 = class397.method2558(Statics.field3632, Statics.field1486.field3899, 0);
            } else {
                var57++;
            }
            if (Statics.field2086 == null) {
                Statics.field2086 = class397.method2558(Statics.field3632, Statics.field1486.field3907, 0);
            } else {
                var57++;
            }
            if (var57 < 11) {
                class84.field1050 = class268.field3330 + var57 * 100 / 12 + "%";
                class84.field1031 = 70;
            } else {
                Statics.field3735 = Statics.field2086;
                Statics.field992.method6347();
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 41.0D) - 20;
                Statics.field88[0].method6323(var58 + var61, var59 + var61, var60 + var61);
                class84.field1050 = class268.field3239;
                class84.field1031 = 70;
                field669 = 90;
            }
        } else if (field669 == 90) {
            if (Statics.field1904.method4504()) {
                Statics.field936 = new class203(Statics.field1904, Statics.field3632, 20, Statics.field1804.field1338, field642 ? 64 : 128);
                class196.method3551(Statics.field936);
                class196.method3496(Statics.field1804.field1338);
                field669 = 100;
            } else {
                class84.field1050 = class268.field3331 + "0%";
                class84.field1031 = 90;
            }
        } else if (field669 == 100) {
            int var62 = Statics.field936.method3754();
            if (var62 < 100) {
                class84.field1050 = class268.field3331 + var62 + "%";
                class84.field1031 = 90;
            } else {
                class84.field1050 = class268.field3263;
                class84.field1031 = 90;
                field669 = 110;
            }
        } else if (field669 == 110) {
            Statics.field3171 = new class97();
            Statics.field348.method2295(Statics.field3171, 10);
            class84.field1050 = class268.field3289;
            class84.field1031 = 92;
            field669 = 120;
        } else if (field669 == 120) {
            if (Statics.field468.method4488("huffman", "")) {
                class249 var63 = new class249(Statics.field468.method4471("huffman", ""));
                class250.method65(var63);
                class84.field1050 = class268.field3261;
                class84.field1031 = 94;
                field669 = 130;
            } else {
                class84.field1050 = class268.field3357 + "%";
                class84.field1031 = 94;
            }
        } else if (field669 == 130) {
            if (!Statics.field37.method4504()) {
                class84.field1050 = class268.field3531 + Statics.field37.method4430() * 4 / 5 + "%";
                class84.field1031 = 96;
            } else if (!Statics.field1440.method4504()) {
                class84.field1050 = class268.field3531 + (80 + Statics.field1440.method4430() / 6) + "%";
                class84.field1031 = 96;
            } else if (Statics.field547.method4504()) {
                class84.field1050 = class268.field3253;
                class84.field1031 = 98;
                field669 = 140;
            } else {
                class84.field1050 = class268.field3531 + (96 + Statics.field547.method4430() / 50) + "%";
                class84.field1031 = 96;
            }
        } else if (field669 == 140) {
            class84.field1031 = 100;
            if (Statics.field2105.method4489(class185.field2138.field2137)) {
                if (Statics.field2928 == null) {
                    Statics.field2928 = new class357();
                    Statics.field2928.method5595(Statics.field2105, Statics.field4062, Statics.field55, Statics.field3099, field757, Statics.field88);
                }
                class84.field1050 = class268.field3270;
                field669 = 150;
            } else {
                class84.field1050 = class268.field3464 + Statics.field2105.method4492(class185.field2138.field2137) / 10 + "%";
            }
        } else if (field669 == 150) {
            method140(10);
        }
    }

    @ObfuscatedName("mv.fp(IZZZB)Ljp;")
    public static class273 method5729(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class333 var4 = null;
        if (class129.field1493 != null) {
            var4 = new class333(arg0, class129.field1493, Statics.field1160[arg0], 1000000);
        }
        return new class273(var4, Statics.field317, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fe(I)V")
    public final void method1381() {
        class329 var1 = field688.method2171();
        class382 var2 = field688.field1406;
        try {
            if (field673 == 0) {
                if (Statics.field1335 == null && (field679.method1782() || field674 > 250)) {
                    Statics.field1335 = field679.method1784();
                    field679.method1781();
                    field679 = null;
                }
                if (Statics.field1335 != null) {
                    if (var1 != null) {
                        var1.method2357();
                        var1 = null;
                    }
                    Statics.field1454 = null;
                    field747 = false;
                    field674 = 0;
                    field673 = 1;
                }
            }
            if (field673 == 1) {
                if (Statics.field1454 == null) {
                    Statics.field1454 = Statics.field348.method2294(Statics.field1004, Statics.field3948);
                }
                if (Statics.field1454.field1524 == 2) {
                    throw new IOException();
                }
                if (Statics.field1454.field1524 == 1) {
                    if (field692) {
                        Socket var3 = (Socket) Statics.field1454.field1532;
                        class330 var4 = new class330(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class132((Socket) Statics.field1454.field1532, Statics.field348, 5000);
                    }
                    field688.method2168(var1);
                    Statics.field1454 = null;
                    field673 = 2;
                }
            }
            if (field673 == 2) {
                field688.method2165();
                class227 var5 = class227.method173();
                var5.field2693.method6043(class229.field2807.field2806);
                field688.method2167(var5);
                field688.method2164();
                var2.field4158 = 0;
                field673 = 3;
            }
            if (field673 == 3) {
                if (Statics.field3945 != null) {
                    Statics.field3945.method634();
                }
                if (Statics.field1192 != null) {
                    Statics.field1192.method634();
                }
                boolean var6 = true;
                if (field692 && !var1.method2342(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method2328();
                    if (Statics.field3945 != null) {
                        Statics.field3945.method634();
                    }
                    if (Statics.field1192 != null) {
                        Statics.field1192.method634();
                    }
                    if (var7 != 0) {
                        method544(var7);
                        return;
                    }
                    var2.field4158 = 0;
                    field673 = 4;
                }
            }
            if (field673 == 4) {
                if (var2.field4158 < 8) {
                    int var8 = var1.method2327();
                    if (var8 > 8 - var2.field4158) {
                        var8 = 8 - var2.field4158;
                    }
                    if (var8 > 0) {
                        var1.method2352(var2.field4155, var2.field4158, var8);
                        var2.field4158 += var8;
                    }
                }
                if (var2.field4158 == 8) {
                    var2.field4158 = 0;
                    Statics.field3635 = var2.method5971();
                    field673 = 5;
                }
            }
            if (field673 == 5) {
                field688.field1406.field4158 = 0;
                field688.method2165();
                class382 var9 = new class382(500);
                int[] var10 = new int[] { Statics.field1335.nextInt(), Statics.field1335.nextInt(), Statics.field1335.nextInt(), Statics.field1335.nextInt() };
                var9.field4158 = 0;
                var9.method6043(1);
                var9.method5951(var10[0]);
                var9.method5951(var10[1]);
                var9.method5951(var10[2]);
                var9.method5951(var10[3]);
                var9.method6174(Statics.field3635);
                if (field646 == 40) {
                    var9.method5951(Statics.field1604[0]);
                    var9.method5951(Statics.field1604[1]);
                    var9.method5951(Statics.field1604[2]);
                    var9.method5951(Statics.field1604[3]);
                } else {
                    var9.method6043(field677.method227());
                    switch(field677.field1473) {
                        case 0:
                            var9.field4158 += 4;
                            break;
                        case 1:
                        case 3:
                            var9.method5950(Statics.field54);
                            var9.field4158++;
                            break;
                        case 2:
                            LinkedHashMap var12 = Statics.field1804.field1336;
                            String var13 = class84.field1041;
                            int var14 = var13.length();
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15 = (var15 << 5) - var15 + var13.charAt(var16);
                            }
                            var9.method5951((Integer) var12.get(var15));
                    }
                    var9.method6043(class387.field4211.method227());
                    var9.method5955(class84.field1053);
                }
                var9.method5988(class83.field1019, class83.field1018);
                Statics.field1604 = var10;
                class227 var18 = class227.method173();
                var18.field2693.field4158 = 0;
                if (field646 == 40) {
                    var18.field2693.method6043(class229.field2800.field2806);
                } else {
                    var18.field2693.method6043(class229.field2803.field2806);
                }
                var18.field2693.method6166(0);
                int var19 = var18.field2693.field4158;
                var18.field2693.method5951(196);
                var18.field2693.method5951(1);
                var18.field2693.method6043(field643);
                var18.field2693.method6043(field644);
                var18.field2693.method5995(var9.field4155, 0, var9.field4158);
                int var20 = var18.field2693.field4158;
                var18.field2693.method5955(class84.field1041);
                var18.field2693.method6043((field900 ? 1 : 0) << 1 | (field642 ? 1 : 0));
                var18.field2693.method6166(Statics.field247);
                var18.field2693.method6166(Statics.field603);
                class382 var21 = var18.field2693;
                if (field682 == null) {
                    byte[] var22 = new byte[24];
                    try {
                        class129.field1491.method5825(0L);
                        class129.field1491.method5827(var22);
                        int var23;
                        for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                        }
                        if (var23 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var75) {
                        for (int var25 = 0; var25 < 24; var25++) {
                            var22[var25] = -1;
                        }
                    }
                    var21.method5995(var22, 0, var22.length);
                } else {
                    var21.method5995(field682, 0, field682.length);
                }
                var18.field2693.method5955(Statics.field4080);
                var18.field2693.method5951(Statics.field1095);
                class383 var28 = new class383(Statics.field89.method5517());
                Statics.field89.method5516(var28);
                var18.field2693.method5995(var28.field4155, 0, var28.field4155.length);
                var18.field2693.method6043(field643);
                var18.field2693.method5951(0);
                var18.field2693.method5951(Statics.field1427.field3597);
                var18.field2693.method6011(0);
                var18.field2693.method6011(Statics.field71.field3597);
                var18.field2693.method6027(Statics.field227.field3597);
                var18.field2693.method6011(Statics.field37.field3597);
                var18.field2693.method6027(Statics.field55.field3597);
                var18.field2693.method5951(Statics.field2105.field3597);
                var18.field2693.method6010(Statics.field3619.field3597);
                var18.field2693.method5951(Statics.field3832.field3597);
                var18.field2693.method5951(Statics.field468.field3597);
                var18.field2693.method5951(Statics.field74.field3597);
                var18.field2693.method6010(Statics.field2004.field3597);
                var18.field2693.method6027(Statics.field243.field3597);
                var18.field2693.method5951(Statics.field547.field3597);
                var18.field2693.method6027(Statics.field1475.field3597);
                var18.field2693.method6011(Statics.field1904.field3597);
                var18.field2693.method6010(Statics.field1440.field3597);
                var18.field2693.method6027(Statics.field4062.field3597);
                var18.field2693.method6010(Statics.field3108.field3597);
                var18.field2693.method5951(Statics.field549.field3597);
                var18.field2693.method5951(Statics.field3632.field3597);
                var18.field2693.method5986(var10, var20, var18.field2693.field4158);
                var18.field2693.method5961(var18.field2693.field4158 - var19);
                field688.method2167(var18);
                field688.method2164();
                field688.field1415 = new class399(var10);
                int[] var29 = new int[4];
                for (int var30 = 0; var30 < 4; var30++) {
                    var29[var30] = var10[var30] + 50;
                }
                var2.method5915(var29);
                field673 = 6;
            }
            if (field673 == 6 && var1.method2327() > 0) {
                int var31 = var1.method2328();
                if (var31 == 21 && field646 == 20) {
                    field673 = 12;
                } else if (var31 == 2) {
                    field673 = 14;
                } else if (var31 == 15 && field646 == 40) {
                    field688.field1411 = -1;
                    field673 = 19;
                } else if (var31 == 64) {
                    field673 = 10;
                } else if (var31 == 23 && field846 < 1) {
                    field846++;
                    field673 = 0;
                } else if (var31 == 29) {
                    field673 = 17;
                } else if (var31 == 69) {
                    field673 = 7;
                } else {
                    method544(var31);
                    return;
                }
            }
            if (field673 == 7 && var1.method2327() >= 2) {
                var1.method2352(var2.field4155, 0, 2);
                var2.field4158 = 0;
                Statics.field232 = var2.method5967();
                field673 = 8;
            }
            if (field673 == 8 && var1.method2327() >= Statics.field232) {
                var2.field4158 = 0;
                var1.method2352(var2.field4155, var2.field4158, Statics.field232);
                class35[] var32 = new class35[] { class35.field257 };
                class35 var33 = var32[var2.method5965()];
                try {
                    class32 var34 = class33.method5886(var33);
                    this.field681 = new class36(var2, var34);
                    field673 = 9;
                } catch (Exception var74) {
                    method544(22);
                    return;
                }
            }
            if (field673 == 9 && this.field681.method243()) {
                this.field680 = this.field681.method232();
                this.field681.method233();
                this.field681 = null;
                if (this.field680 == null) {
                    method544(22);
                    return;
                }
                field688.method2165();
                class227 var36 = class227.method173();
                var36.field2693.method6043(class229.field2804.field2806);
                var36.field2693.method6166(this.field680.field4158);
                var36.field2693.method6167(this.field680);
                field688.method2167(var36);
                field688.method2164();
                this.field680 = null;
                field673 = 6;
            }
            if (field673 == 10 && var1.method2327() > 0) {
                Statics.field1111 = var1.method2328();
                field673 = 11;
            }
            if (field673 == 11 && var1.method2327() >= Statics.field1111) {
                var1.method2352(var2.field4155, 0, Statics.field1111);
                var2.field4158 = 0;
                field673 = 6;
            }
            if (field673 == 12 && var1.method2327() > 0) {
                field676 = (var1.method2328() + 3) * 60;
                field673 = 13;
            }
            if (field673 == 13) {
                field674 = 0;
                class84.method4400(class268.field3471, class268.field3277, field676 / 60 + class268.field3278);
                if (--field676 <= 0) {
                    field673 = 0;
                }
            } else {
                if (field673 == 14 && var1.method2327() >= 1) {
                    Statics.field185 = var1.method2328();
                    field673 = 15;
                }
                if (field673 == 15 && var1.method2327() >= Statics.field185) {
                    boolean var37 = var1.method2328() == 1;
                    var1.method2352(var2.field4155, 0, 4);
                    var2.field4158 = 0;
                    boolean var38 = false;
                    if (var37) {
                        int var39 = var2.method5939() << 24;
                        int var40 = var39 | var2.method5939() << 16;
                        int var41 = var40 | var2.method5939() << 8;
                        int var42 = var41 | var2.method5939();
                        String var43 = class84.field1041;
                        int var44 = var43.length();
                        int var45 = 0;
                        int var46 = 0;
                        while (true) {
                            if (var46 >= var44) {
                                if (Statics.field1804.field1336.size() >= 10 && !Statics.field1804.field1336.containsKey(var45)) {
                                    Iterator var49 = Statics.field1804.field1336.entrySet().iterator();
                                    var49.next();
                                    var49.remove();
                                }
                                Statics.field1804.field1336.put(var45, var42);
                                break;
                            }
                            var45 = (var45 << 5) - var45 + var43.charAt(var46);
                            var46++;
                        }
                    }
                    if (field678) {
                        Statics.field1804.field1330 = class84.field1041;
                    } else {
                        Statics.field1804.field1330 = null;
                    }
                    class103.method2073();
                    field811 = var1.method2328();
                    field843 = var1.method2328() == 1;
                    field759 = var1.method2328();
                    field759 <<= 0x8;
                    field759 += var1.method2328();
                    field760 = var1.method2328();
                    var1.method2352(var2.field4155, 0, 1);
                    var2.field4158 = 0;
                    class228[] var50 = class228.method177();
                    int var51 = var2.method5937();
                    if (var51 < 0 || var51 >= var50.length) {
                        throw new IOException(var51 + " " + var2.field4158);
                    }
                    field688.field1407 = var50[var51];
                    field688.field1411 = field688.field1407.field2797;
                    var1.method2352(var2.field4155, 0, 2);
                    var2.field4158 = 0;
                    field688.field1411 = var2.method5967();
                    try {
                        class43.method322(Statics.field204, "zap");
                    } catch (Throwable var73) {
                    }
                    field673 = 16;
                }
                if (field673 != 16) {
                    if (field673 == 17 && var1.method2327() >= 2) {
                        var2.field4158 = 0;
                        var1.method2352(var2.field4155, 0, 2);
                        var2.field4158 = 0;
                        Statics.field2009 = var2.method5967();
                        field673 = 18;
                    }
                    if (field673 == 18 && var1.method2327() >= Statics.field2009) {
                        var2.field4158 = 0;
                        var1.method2352(var2.field4155, 0, Statics.field2009);
                        var2.field4158 = 0;
                        String var68 = var2.method5974();
                        String var69 = var2.method5974();
                        String var70 = var2.method5974();
                        class84.method4400(var68, var69, var70);
                        method140(10);
                    }
                    if (field673 == 19) {
                        if (field688.field1411 == -1) {
                            if (var1.method2327() < 2) {
                                return;
                            }
                            var1.method2352(var2.field4155, 0, 2);
                            var2.field4158 = 0;
                            field688.field1411 = var2.method5967();
                        }
                        if (var1.method2327() >= field688.field1411) {
                            var1.method2352(var2.field4155, 0, field688.field1411);
                            var2.field4158 = 0;
                            int var71 = field688.field1411;
                            field693.method5121();
                            Statics.method3294();
                            class109.method4241(var2);
                            if (var2.field4158 != var71) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field674++;
                        if (field674 > 2000) {
                            if (field846 < 1) {
                                if (Statics.field3948 == Statics.field1931) {
                                    Statics.field3948 = Statics.field3630;
                                } else {
                                    Statics.field3948 = Statics.field1931;
                                }
                                field846++;
                                field673 = 0;
                            } else {
                                method544(-3);
                            }
                        }
                    }
                } else if (var1.method2327() >= field688.field1411) {
                    var2.field4158 = 0;
                    var1.method2352(var2.field4155, 0, field688.field1411);
                    field693.method5119();
                    field651 = 1L;
                    Statics.field3171.field1186 = 0;
                    Statics.field2127 = true;
                    field731 = true;
                    field810 = -1L;
                    class70.method689();
                    field688.method2165();
                    field688.field1406.field4158 = 0;
                    field688.field1407 = null;
                    field688.field1412 = null;
                    field688.field1413 = null;
                    field688.field1401 = null;
                    field688.field1411 = 0;
                    field688.field1410 = 0;
                    field657 = 0;
                    field691 = 0;
                    field658 = 0;
                    method8();
                    class48.method4419(0);
                    class111.method338();
                    field795 = 0;
                    field797 = false;
                    field867 = 0;
                    field854 = 0;
                    field885 = 0;
                    Statics.field1445 = null;
                    field880 = 0;
                    field873 = -1;
                    field745 = 0;
                    field787 = 0;
                    field667 = class107.field1360;
                    field668 = class107.field1360;
                    field684 = 0;
                    class109.method1919();
                    for (int var53 = 0; var53 < 2048; var53++) {
                        field830[var53] = null;
                    }
                    for (int var54 = 0; var54 < 32768; var54++) {
                        field683[var54] = null;
                    }
                    field769 = -1;
                    field908.method4735();
                    field919.method4735();
                    for (int var55 = 0; var55 < 4; var55++) {
                        for (int var56 = 0; var56 < 104; var56++) {
                            for (int var57 = 0; var57 < 104; var57++) {
                                field860[var55][var56][var57] = null;
                            }
                        }
                    }
                    field799 = new class294();
                    Statics.field1508.method1510();
                    for (int var58 = 0; var58 < Statics.field1544; var58++) {
                        class138 var59 = class138.method136(var58);
                        if (var59 != null) {
                            class242.field2919[var58] = 0;
                            class242.field2918[var58] = 0;
                        }
                    }
                    Statics.field636.method2102();
                    field825 = -1;
                    if (field637 != -1) {
                        int var60 = field637;
                        if (var60 != -1 && Statics.field2952[var60]) {
                            Statics.field1299.method4481(var60);
                            if (Statics.field2951[var60] != null) {
                                boolean var61 = true;
                                for (int var62 = 0; var62 < Statics.field2951[var60].length; var62++) {
                                    if (Statics.field2951[var60][var62] != null) {
                                        if (Statics.field2951[var60][var62].field2961 == 2) {
                                            var61 = false;
                                        } else {
                                            Statics.field2951[var60][var62] = null;
                                        }
                                    }
                                }
                                if (var61) {
                                    Statics.field2951[var60] = null;
                                }
                                Statics.field2952[var60] = false;
                            }
                        }
                    }
                    for (class95 var63 = (class95) field803.method5774(); var63 != null; var63 = (class95) field803.method5770()) {
                        method335(var63, true);
                    }
                    field637 = -1;
                    field803 = new class362(8);
                    field808 = null;
                    method8();
                    field838.method4260((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var64 = 0; var64 < 8; var64++) {
                        field766[var64] = null;
                        field672[var64] = false;
                    }
                    class93.method3567();
                    field802 = true;
                    for (int var65 = 0; var65 < 100; var65++) {
                        field720[var65] = true;
                    }
                    class227 var66 = class227.method171(class225.field2663, field688.field1415);
                    var66.field2693.method6043(method2559());
                    var66.field2693.method6166(Statics.field247);
                    var66.field2693.method6166(Statics.field603);
                    field688.method2167(var66);
                    Statics.field1987 = null;
                    Statics.field1634 = null;
                    Arrays.fill(field735, (Object) null);
                    Statics.field631 = null;
                    Arrays.fill(field872, (Object) null);
                    for (int var67 = 0; var67 < 8; var67++) {
                        field862[var67] = new class284();
                    }
                    Statics.field1463 = null;
                    class109.method4241(var2);
                    Statics.field633 = -1;
                    Statics.method5451(false, var2);
                    field688.field1407 = null;
                }
            }
        } catch (IOException var76) {
            if (field846 < 1) {
                if (Statics.field3948 == Statics.field1931) {
                    Statics.field3948 = Statics.field3630;
                } else {
                    Statics.field3948 = Statics.field1931;
                }
                field846++;
                field673 = 0;
            } else {
                method544(-2);
            }
        }
    }

    @ObfuscatedName("ak.fo(II)V")
    public static void method544(int arg0) {
        if (arg0 == -3) {
            class84.method4400(class268.field3301, class268.field3283, class268.field3281);
        } else if (arg0 == -2) {
            class84.method4400(class268.field3282, class268.field3503, class268.field3284);
        } else if (arg0 == -1) {
            class84.method4400(class268.field3285, class268.field3286, class268.field3287);
        } else if (arg0 == 3) {
            class84.field1035 = 3;
            class84.field1040 = 1;
        } else if (arg0 == 4) {
            class84.method473(0);
        } else if (arg0 == 5) {
            class84.field1040 = 2;
            class84.method4400(class268.field3291, class268.field3292, class268.field3392);
        } else if (arg0 == 68 || !(field824 || arg0 != 6)) {
            class84.method4400(class268.field3294, class268.field3520, class268.field3296);
        } else if (arg0 == 7) {
            class84.method4400(class268.field3402, class268.field3499, class268.field3299);
        } else if (arg0 == 8) {
            class84.method4400(class268.field3300, class268.field3303, class268.field3302);
        } else if (arg0 == 9) {
            class84.method4400(class268.field3447, class268.field3532, class268.field3305);
        } else if (arg0 == 10) {
            class84.method4400(class268.field3306, class268.field3474, class268.field3308);
        } else if (arg0 == 11) {
            class84.method4400(class268.field3312, class268.field3310, class268.field3311);
        } else if (arg0 == 12) {
            class84.method4400(class268.field3438, class268.field3455, class268.field3522);
        } else if (arg0 == 13) {
            class84.method4400(class268.field3315, class268.field3316, class268.field3317);
        } else if (arg0 == 14) {
            class84.method4400(class268.field3352, class268.field3319, class268.field3320);
        } else if (arg0 == 16) {
            class84.method4400(class268.field3321, class268.field3322, class268.field3484);
        } else if (arg0 == 17) {
            class84.method4400(class268.field3324, class268.field3325, class268.field3521);
        } else if (arg0 == 18) {
            class84.method473(1);
        } else if (arg0 == 19) {
            class84.method4400(class268.field3524, class268.field3269, class268.field3332);
        } else if (arg0 == 20) {
            class84.method4400(class268.field3410, class268.field3390, class268.field3335);
        } else if (arg0 == 22) {
            class84.method4400(class268.field3409, class268.field3314, class268.field3338);
        } else if (arg0 == 23) {
            class84.method4400(class268.field3386, class268.field3298, class268.field3264);
        } else if (arg0 == 24) {
            class84.method4400(class268.field3511, class268.field3343, class268.field3344);
        } else if (arg0 == 25) {
            class84.method4400(class268.field3256, class268.field3297, class268.field3347);
        } else if (arg0 == 26) {
            class84.method4400(class268.field3309, class268.field3365, class268.field3350);
        } else if (arg0 == 27) {
            class84.method4400(class268.field3351, class268.field3396, class268.field3353);
        } else if (arg0 == 31) {
            class84.method4400(class268.field3490, class268.field3341, class268.field3362);
        } else if (arg0 == 32) {
            class84.method4400(class268.field3363, class268.field3364, class268.field3525);
        } else if (arg0 == 37) {
            class84.method4400(class268.field3374, class268.field3367, class268.field3368);
        } else if (arg0 == 38) {
            class84.method4400(class268.field3369, class268.field3370, class268.field3371);
        } else if (arg0 == 55) {
            class84.field1035 = 8;
        } else if (arg0 == 56) {
            class84.method4400(class268.field3376, class268.field3377, class268.field3389);
            method140(11);
            return;
        } else if (arg0 == 57) {
            class84.method4400(class268.field3379, class268.field3342, class268.field3381);
            method140(11);
            return;
        } else if (arg0 == 61) {
            class84.field1035 = 7;
        } else {
            class84.method4400(class268.field3382, class268.field3383, class268.field3459);
        }
        method140(10);
    }

    @ObfuscatedName("b.fq(B)V")
    public static final void method55() {
        field688.method2185();
        class156.field1861.method3957();
        class149.method4406();
        class141.method2366();
        class154.method179();
        class146.field1662.method3957();
        class146.field1654.method3957();
        class155.method3897();
        class157.method1864();
        class148.field1678.method3957();
        class148.field1679.method3957();
        class150.method1996();
        class138.field1546.method3957();
        Statics.field635.method5860();
        Statics.field2505.method5860();
        class153.method2267();
        class142.method279();
        class152.field1721.method3957();
        class151.method2325();
        class139.field1551.method3957();
        class245.method1824();
        class247.field3082.method3957();
        class247.field3047.method3957();
        class247.field3016.method3957();
        class247.field2956.method3957();
        ((class203) Statics.field2282).method3777();
        class87.field1087.method3957();
        Statics.field3619.method4529();
        Statics.field227.method4529();
        Statics.field37.method4529();
        Statics.field243.method4529();
        Statics.field3108.method4529();
        Statics.field1427.method4529();
        Statics.field549.method4529();
        Statics.field3632.method4529();
        Statics.field1904.method4529();
        Statics.field468.method4529();
        Statics.field2004.method4529();
        Statics.field1440.method4529();
        Statics.field3862.method3571();
        for (int var0 = 0; var0 < 4; var0++) {
            field700[var0].method2910();
        }
        System.gc();
        class233.method2947(2);
        field881 = -1;
        field882 = false;
        class78.method3328();
        method140(10);
    }

    @ObfuscatedName("g.ff(II)V")
    public static final void method148(int arg0) {
        method55();
        switch(arg0) {
            case 1:
                class84.method2973();
                break;
            case 2:
                class84.method3284();
        }
    }

    @ObfuscatedName("jf.fw(I)V")
    public static final void method4464() {
        if (field691 > 0) {
            method55();
        } else {
            field693.method5117();
            method140(40);
            Statics.field689 = field688.method2171();
            field688.method2170();
        }
    }

    @ObfuscatedName("ee.fj(ZB)V")
    public static final void method2608(boolean arg0) {
        if (arg0) {
            field677 = class84.field1044 ? class126.field1470 : class126.field1472;
            return;
        }
        LinkedHashMap var1 = Statics.field1804.field1336;
        String var2 = class84.field1041;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field677 = var1.containsKey(var4) ? class126.field1471 : class126.field1469;
    }

    @ObfuscatedName("client.fg(I)V")
    public final void method1334() {
        if (field657 > 1) {
            field657--;
        }
        if (field691 > 0) {
            field691--;
        }
        if (field747) {
            field747 = false;
            method4464();
            return;
        }
        if (!field778) {
            method2358();
        }
        for (int var1 = 0; var1 < 100 && this.method1029(field688); var1++) {
        }
        if (field646 != 30) {
            return;
        }
        while (class70.method166()) {
            class227 var2 = class227.method171(class225.field2585, field688.field1415);
            var2.field2693.method6043(0);
            int var3 = var2.field2693.field4158;
            class70.method2239(var2.field2693);
            var2.field2693.method6150(var2.field2693.field4158 - var3);
            field688.method2167(var2);
        }
        if (field693.field3770) {
            class227 var4 = class227.method171(class225.field2646, field688.field1415);
            var4.field2693.method6043(0);
            int var5 = var4.field2693.field4158;
            field693.method5125(var4.field2693);
            var4.field2693.method6150(var4.field2693.field4158 - var5);
            field688.method2167(var4);
            field693.method5120();
        }
        Object var6 = Statics.field3171.field1185;
        synchronized (Statics.field3171.field1185) {
            if (!field890) {
                Statics.field3171.field1186 = 0;
            } else if (class48.field384 != 0 || Statics.field3171.field1186 >= 40) {
                class227 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field3171.field1186 && (var7 == null || var7.field2693.field4158 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field3171.field1188[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field3171.field1184[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field652 != var14 || field813 != var13) {
                        if (var7 == null) {
                            var7 = class227.method171(class225.field2629, field688.field1415);
                            var7.field2693.method6043(0);
                            var8 = var7.field2693.field4158;
                            var7.field2693.field4158 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field654 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field652;
                            var16 = var13 - field813;
                            var17 = (int) ((Statics.field3171.field1187[var12] - field654) / 20L);
                            var10 = (int) ((Statics.field3171.field1187[var12] - field654) % 20L + (long) var10);
                        }
                        field652 = var14;
                        field813 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2693.method6166((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2693.method6043(var17 + 128);
                            var7.field2693.method6166((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2693.method6043(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2693.method5951(Integer.MIN_VALUE);
                            } else {
                                var7.field2693.method5951(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2693.method6166((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2693.method5951(Integer.MIN_VALUE);
                            } else {
                                var7.field2693.method5951(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field654 = Statics.field3171.field1187[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2693.method6150(var7.field2693.field4158 - var8);
                    int var18 = var7.field2693.field4158;
                    var7.field2693.field4158 = var8;
                    var7.field2693.method6043(var10 / var11);
                    var7.field2693.method6043(var10 % var11);
                    var7.field2693.field4158 = var18;
                    field688.method2167(var7);
                }
                if (var9 >= Statics.field3171.field1186) {
                    Statics.field3171.field1186 = 0;
                } else {
                    Statics.field3171.field1186 -= var9;
                    System.arraycopy(Statics.field3171.field1184, var9, Statics.field3171.field1184, 0, Statics.field3171.field1186);
                    System.arraycopy(Statics.field3171.field1188, var9, Statics.field3171.field1188, 0, Statics.field3171.field1186);
                    System.arraycopy(Statics.field3171.field1187, var9, Statics.field3171.field1187, 0, Statics.field3171.field1186);
                }
            }
        }
        if (class48.field384 == 1 || !Statics.field666 && class48.field384 == 4 || class48.field384 == 2) {
            long var20 = class48.field387 - field651 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field651 = class48.field387 * -1L;
            int var22 = class48.field378;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field603) {
                var22 = Statics.field603;
            }
            int var23 = class48.field368;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field247) {
                var23 = Statics.field247;
            }
            int var24 = (int) var20;
            class227 var25 = class227.method171(class225.field2664, field688.field1415);
            var25.field2693.method6166((class48.field384 == 2 ? 1 : 0) + (var24 << 1));
            var25.field2693.method6166(var23);
            var25.field2693.method6166(var22);
            field688.method2167(var25);
        }
        if (class39.field293 > 0) {
            class227 var26 = class227.method171(class225.field2574, field688.field1415);
            var26.field2693.method6166(0);
            int var27 = var26.field2693.field4158;
            long var28 = class380.method2744();
            for (int var30 = 0; var30 < class39.field293; var30++) {
                long var31 = var28 - field810;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field810 = var28;
                var26.field2693.method5993(class39.field275[var30]);
                var26.field2693.method6157((int) var31);
            }
            var26.field2693.method5961(var26.field2693.field4158 - var27);
            field688.method2167(var26);
        }
        if (field726 > 0) {
            field726--;
        }
        if (class39.field286[96] || class39.field286[97] || class39.field286[98] || class39.field286[99]) {
            field727 = true;
        }
        if (field727 && field726 <= 0) {
            field726 = 20;
            field727 = false;
            class227 var33 = class227.method171(class225.field2631, field688.field1415);
            var33.field2693.method6018(field711);
            var33.field2693.method6166(field854);
            field688.method2167(var33);
        }
        if (Statics.field2127 && !field731) {
            field731 = true;
            class227 var34 = class227.method171(class225.field2581, field688.field1415);
            var34.field2693.method6043(1);
            field688.method2167(var34);
        }
        if (!Statics.field2127 && field731) {
            field731 = false;
            class227 var35 = class227.method171(class225.field2581, field688.field1415);
            var35.field2693.method6043(0);
            field688.method2167(var35);
        }
        if (Statics.field2928 != null) {
            Statics.field2928.method5534();
        }
        if (Statics.field2885) {
            if (Statics.field1987 != null) {
                Statics.field1987.method5298();
            }
            method62();
            Statics.field2885 = false;
        }
        Statics.method2605();
        if (Statics.field196 != field873) {
            field873 = Statics.field196;
            method1716(Statics.field196);
        }
        if (field646 != 30) {
            return;
        }
        for (class99 var36 = (class99) field799.method4714(); var36 != null; var36 = (class99) field799.method4741()) {
            if (var36.field1235 > 0) {
                var36.field1235--;
            }
            if (var36.field1235 == 0) {
                if (var36.field1228 >= 0) {
                    int var37 = var36.field1228;
                    int var38 = var36.field1230;
                    class154 var39 = class154.method175(var37);
                    if (var38 == 11) {
                        var38 = 10;
                    }
                    if (var38 >= 5 && var38 <= 8) {
                        var38 = 4;
                    }
                    boolean var40 = var39.method2715(var38);
                    if (!var40) {
                        continue;
                    }
                }
                method4344(var36.field1229, var36.field1225, var36.field1224, var36.field1227, var36.field1228, var36.field1226, var36.field1230);
                var36.method5496();
            } else {
                if (var36.field1234 > 0) {
                    var36.field1234--;
                }
                if (var36.field1234 == 0 && var36.field1224 >= 1 && var36.field1227 >= 1 && var36.field1224 <= 102 && var36.field1227 <= 102) {
                    if (var36.field1231 >= 0) {
                        int var41 = var36.field1231;
                        int var42 = var36.field1233;
                        class154 var43 = class154.method175(var41);
                        if (var42 == 11) {
                            var42 = 10;
                        }
                        if (var42 >= 5 && var42 <= 8) {
                            var42 = 4;
                        }
                        boolean var44 = var43.method2715(var42);
                        if (!var44) {
                            continue;
                        }
                    }
                    method4344(var36.field1229, var36.field1225, var36.field1224, var36.field1227, var36.field1231, var36.field1232, var36.field1233);
                    var36.field1234 = -1;
                    if (var36.field1231 == var36.field1228 && var36.field1228 == -1) {
                        var36.method5496();
                    } else if (var36.field1231 == var36.field1228 && var36.field1232 == var36.field1226 && var36.field1233 == var36.field1230) {
                        var36.method5496();
                    }
                }
            }
        }
        int var10002;
        for (int var45 = 0; var45 < field867; var45++) {
            var10002 = field918[var45]--;
            if (field918[var45] >= -10) {
                class50 var47 = field888[var45];
                if (var47 == null) {
                    class50 var10000 = (class50) null;
                    var47 = class50.method593(Statics.field243, field884[var45], 0);
                    if (var47 == null) {
                        continue;
                    }
                    field918[var45] += var47.method591();
                    field888[var45] = var47;
                }
                if (field918[var45] < 0) {
                    int var54;
                    if (field704[var45] == 0) {
                        var54 = Statics.field1804.field1331;
                    } else {
                        int var48 = (field704[var45] & 0xFF) * 128;
                        int var49 = field704[var45] >> 16 & 0xFF;
                        int var50 = var49 * 128 + 64 - Statics.field1163.field1238;
                        if (var50 < 0) {
                            var50 = -var50;
                        }
                        int var51 = field704[var45] >> 8 & 0xFF;
                        int var52 = var51 * 128 + 64 - Statics.field1163.field1237;
                        if (var52 < 0) {
                            var52 = -var52;
                        }
                        int var53 = var50 + var52 - 128;
                        if (var53 > var48) {
                            field918[var45] = -100;
                            continue;
                        }
                        if (var53 < 0) {
                            var53 = 0;
                        }
                        var54 = Statics.field1804.field1325 * (var48 - var53) / var48;
                    }
                    if (var54 > 0) {
                        class51 var55 = var47.method592().method601(Statics.field1370);
                        class58 var56 = class58.method719(var55, 100, var54);
                        var56.method722(field758[var45] - 1);
                        Statics.field3765.method550(var56);
                    }
                    field918[var45] = -100;
                }
            } else {
                field867--;
                for (int var46 = var45; var46 < field867; var46++) {
                    field884[var46] = field884[var46 + 1];
                    field888[var46] = field888[var46 + 1];
                    field758[var46] = field758[var46 + 1];
                    field918[var46] = field918[var46 + 1];
                    field704[var46] = field704[var46 + 1];
                }
                var45--;
            }
        }
        if (field882) {
            boolean var57;
            if (class233.field2828 == 0) {
                var57 = Statics.field1467.method4024();
            } else {
                var57 = true;
            }
            if (!var57) {
                if (Statics.field1804.field1332 != 0 && field881 != -1) {
                    class233.method2018(Statics.field1427, field881, 0, Statics.field1804.field1332, false);
                }
                field882 = false;
            }
        }
        field688.field1410++;
        if (field688.field1410 > 750) {
            method4464();
            return;
        }
        int var58 = class109.field1376;
        int[] var59 = class109.field1381;
        for (int var60 = 0; var60 < var58; var60++) {
            class98 var61 = field830[var59[var60]];
            if (var61 != null) {
                method57(var61, 1);
            }
        }
        for (int var62 = 0; var62 < field684; var62++) {
            int var63 = field685[var62];
            class105 var64 = field683[var63];
            if (var64 != null) {
                method57(var64, var64.field1346.field1637);
            }
        }
        method137();
        field914++;
        if (field746 != 0) {
            field870 += 20;
            if (field870 >= 400) {
                field746 = 0;
            }
        }
        if (Statics.field3627 != null) {
            field748++;
            if (field748 >= 15) {
                method3353(Statics.field3627);
                Statics.field3627 = null;
            }
        }
        class247 var65 = Statics.field937;
        class247 var66 = Statics.field610;
        Statics.field937 = null;
        Statics.field610 = null;
        field819 = null;
        field823 = false;
        field820 = false;
        field807 = 0;
        while (Statics.method64() && field807 < 128) {
            if (field811 >= 2 && class39.field286[82] && Statics.field1860 == 66) {
                String var67 = "";
                Iterator var68 = class111.field1396.iterator();
                while (var68.hasNext()) {
                    class73 var69 = (class73) var68.next();
                    var67 = var67 + var69.field623 + ':' + var69.field624 + '\n';
                }
                Statics.field204.method467(var67);
            } else if (field885 != 1 || Statics.field3117 <= 0) {
                field869[field807] = Statics.field1860;
                field868[field807] = Statics.field3117;
                field807++;
            }
        }
        if (method5731() && class39.field286[82] && class39.field286[81] && field844 != 0) {
            int var72 = Statics.field1163.field1214 - field844;
            if (var72 < 0) {
                var72 = 0;
            } else if (var72 > 3) {
                var72 = 3;
            }
            if (Statics.field1163.field1214 != var72) {
                method41(Statics.field2512 + Statics.field1163.field1273[0], Statics.field458 + Statics.field1163.field1287[0], var72, false);
            }
            field844 = 0;
        }
        if (field637 != -1) {
            method201(field637, 0, 0, Statics.field247, Statics.field603, 0, 0);
        }
        field827++;
        while (true) {
            class96 var73;
            class247 var74;
            class247 var75;
            do {
                var73 = (class96) field653.method4743();
                if (var73 == null) {
                    while (true) {
                        class96 var76;
                        class247 var77;
                        class247 var78;
                        do {
                            var76 = (class96) field847.method4743();
                            if (var76 == null) {
                                while (true) {
                                    class96 var79;
                                    class247 var80;
                                    class247 var81;
                                    do {
                                        var79 = (class96) field801.method4743();
                                        if (var79 == null) {
                                            this.method1030();
                                            if (Statics.field2928 != null) {
                                                Statics.field2928.method5544(Statics.field196, (Statics.field1163.field1238 >> 7) + Statics.field2512, (Statics.field1163.field1237 >> 7) + Statics.field458, false);
                                                Statics.field2928.method5628();
                                            }
                                            if (field815 != null) {
                                                this.method1035();
                                            }
                                            if (Statics.field1086 != null) {
                                                method3353(Statics.field1086);
                                                field755++;
                                                if (class48.field376 == 0) {
                                                    if (field849) {
                                                        if (Statics.field156 == Statics.field1086 && field773 != field771) {
                                                            class247 var82 = Statics.field1086;
                                                            byte var83 = 0;
                                                            if (field913 == 1 && var82.field3065 == 206) {
                                                                var83 = 1;
                                                            }
                                                            if (var82.field3085[field771] <= 0) {
                                                                var83 = 0;
                                                            }
                                                            if (class248.method295(method169(var82))) {
                                                                int var84 = field773;
                                                                int var85 = field771;
                                                                var82.field3085[var85] = var82.field3085[var84];
                                                                var82.field3086[var85] = var82.field3086[var84];
                                                                var82.field3085[var84] = -1;
                                                                var82.field3086[var84] = 0;
                                                            } else if (var83 == 1) {
                                                                int var86 = field773;
                                                                int var87 = field771;
                                                                while (var86 != var87) {
                                                                    if (var86 > var87) {
                                                                        var82.method4310(var86 - 1, var86);
                                                                        var86--;
                                                                    } else if (var86 < var87) {
                                                                        var82.method4310(var86 + 1, var86);
                                                                        var86++;
                                                                    }
                                                                }
                                                            } else {
                                                                var82.method4310(field771, field773);
                                                            }
                                                            class227 var88 = class227.method171(class225.field2659, field688.field1415);
                                                            var88.field2693.method6011(Statics.field1086.field2959);
                                                            var88.field2693.method5993(var83);
                                                            var88.field2693.method6001(field773);
                                                            var88.field2693.method6166(field771);
                                                            field688.method2167(var88);
                                                        }
                                                    } else if (this.method1031()) {
                                                        this.method1032(field751, field752);
                                                    } else if (field779 > 0) {
                                                        int var89 = field751;
                                                        int var90 = field752;
                                                        class82 var91 = Statics.field608;
                                                        method1810(var91.field1014, var91.field1013, var91.field1016, var91.field1015, var91.field1012, var91.field1012, var89, var90);
                                                        Statics.field608 = null;
                                                    }
                                                    field748 = 10;
                                                    class48.field384 = 0;
                                                    Statics.field1086 = null;
                                                } else if (field755 >= 5 && (class48.field389 > field751 + 5 || class48.field389 < field751 - 5 || class48.field370 > field752 + 5 || class48.field370 < field752 - 5)) {
                                                    field849 = true;
                                                }
                                            }
                                            if (class198.method3670()) {
                                                int var92 = class198.field2328;
                                                int var93 = class198.field2329;
                                                class227 var94 = class227.method171(class225.field2643, field688.field1415);
                                                var94.field2693.method6043(5);
                                                var94.field2693.method5983(class39.field286[82] ? (class39.field286[81] ? 2 : 1) : 0);
                                                var94.field2693.method6166(Statics.field458 + var93);
                                                var94.field2693.method6166(Statics.field2512 + var92);
                                                field688.method2167(var94);
                                                class198.method3693();
                                                field792 = class48.field368;
                                                field744 = class48.field378;
                                                field746 = 1;
                                                field870 = 0;
                                                field745 = var92;
                                                field787 = var93;
                                            }
                                            if (Statics.field937 != var65) {
                                                if (var65 != null) {
                                                    method3353(var65);
                                                }
                                                if (Statics.field937 != null) {
                                                    method3353(Statics.field937);
                                                }
                                            }
                                            if (Statics.field610 != var66 && field834 == field793) {
                                                if (var66 != null) {
                                                    method3353(var66);
                                                }
                                                if (Statics.field610 != null) {
                                                    method3353(Statics.field610);
                                                }
                                            }
                                            if (Statics.field610 == null) {
                                                if (field793 > 0) {
                                                    field793--;
                                                }
                                            } else if (field793 < field834) {
                                                field793++;
                                                if (field834 == field793) {
                                                    method3353(Statics.field610);
                                                }
                                            }
                                            method2863();
                                            if (field762) {
                                                int var95 = Statics.field1545 * 128 + 64;
                                                int var96 = Statics.field3848 * 128 + 64;
                                                int var97 = method2069(var95, var96, Statics.field196) - Statics.field3120;
                                                if (Statics.field386 < var95) {
                                                    Statics.field386 += Statics.field157 * (var95 - Statics.field386) / 1000 + Statics.field265;
                                                    if (Statics.field386 > var95) {
                                                        Statics.field386 = var95;
                                                    }
                                                }
                                                if (Statics.field386 > var95) {
                                                    Statics.field386 -= Statics.field157 * (Statics.field386 - var95) / 1000 + Statics.field265;
                                                    if (Statics.field386 < var95) {
                                                        Statics.field386 = var95;
                                                    }
                                                }
                                                if (Statics.field1138 < var97) {
                                                    Statics.field1138 += Statics.field157 * (var97 - Statics.field1138) / 1000 + Statics.field265;
                                                    if (Statics.field1138 > var97) {
                                                        Statics.field1138 = var97;
                                                    }
                                                }
                                                if (Statics.field1138 > var97) {
                                                    Statics.field1138 -= Statics.field157 * (Statics.field1138 - var97) / 1000 + Statics.field265;
                                                    if (Statics.field1138 < var97) {
                                                        Statics.field1138 = var97;
                                                    }
                                                }
                                                if (Statics.field1348 < var96) {
                                                    Statics.field1348 += Statics.field157 * (var96 - Statics.field1348) / 1000 + Statics.field265;
                                                    if (Statics.field1348 > var96) {
                                                        Statics.field1348 = var96;
                                                    }
                                                }
                                                if (Statics.field1348 > var96) {
                                                    Statics.field1348 -= Statics.field157 * (Statics.field1348 - var96) / 1000 + Statics.field265;
                                                    if (Statics.field1348 < var96) {
                                                        Statics.field1348 = var96;
                                                    }
                                                }
                                                int var98 = Statics.field3887 * 128 + 64;
                                                int var99 = Statics.field48 * 128 + 64;
                                                int var100 = method2069(var98, var99, Statics.field196) - Statics.field154;
                                                int var101 = var98 - Statics.field386;
                                                int var102 = var100 - Statics.field1138;
                                                int var103 = var99 - Statics.field1348;
                                                int var104 = (int) Math.sqrt((double) (var101 * var101 + var103 * var103));
                                                int var105 = (int) (Math.atan2((double) var102, (double) var104) * 325.949D) & 0x7FF;
                                                int var106 = (int) (Math.atan2((double) var101, (double) var103) * -325.949D) & 0x7FF;
                                                if (var105 < 128) {
                                                    var105 = 128;
                                                }
                                                if (var105 > 383) {
                                                    var105 = 383;
                                                }
                                                if (Statics.field1693 < var105) {
                                                    Statics.field1693 += Statics.field469 * (var105 - Statics.field1693) / 1000 + Statics.field3813;
                                                    if (Statics.field1693 > var105) {
                                                        Statics.field1693 = var105;
                                                    }
                                                }
                                                if (Statics.field1693 > var105) {
                                                    Statics.field1693 -= Statics.field469 * (Statics.field1693 - var105) / 1000 + Statics.field3813;
                                                    if (Statics.field1693 < var105) {
                                                        Statics.field1693 = var105;
                                                    }
                                                }
                                                int var107 = var106 - Statics.field4140;
                                                if (var107 > 1024) {
                                                    var107 -= 2048;
                                                }
                                                if (var107 < -1024) {
                                                    var107 += 2048;
                                                }
                                                if (var107 > 0) {
                                                    Statics.field4140 += Statics.field469 * var107 / 1000 + Statics.field3813;
                                                    Statics.field4140 &= 0x7FF;
                                                }
                                                if (var107 < 0) {
                                                    Statics.field4140 -= Statics.field469 * -var107 / 1000 + Statics.field3813;
                                                    Statics.field4140 &= 0x7FF;
                                                }
                                                int var108 = var106 - Statics.field4140;
                                                if (var108 > 1024) {
                                                    var108 -= 2048;
                                                }
                                                if (var108 < -1024) {
                                                    var108 += 2048;
                                                }
                                                if (var108 < 0 && var107 > 0 || var108 > 0 && var107 < 0) {
                                                    Statics.field4140 = var106;
                                                }
                                            }
                                            for (int var109 = 0; var109 < 5; var109++) {
                                                var10002 = field894[var109]++;
                                            }
                                            Statics.field636.method2105();
                                            int var110 = ++class48.field385 - 1;
                                            int var112 = class39.method2961();
                                            if (var110 > 15000 && var112 > 15000) {
                                                field691 = 250;
                                                class48.method4419(14500);
                                                class227 var113 = class227.method171(class225.field2645, field688.field1415);
                                                field688.method2167(var113);
                                            }
                                            Statics.field1508.method1509();
                                            field688.field1403++;
                                            if (field688.field1403 > 50) {
                                                class227 var114 = class227.method171(class225.field2591, field688.field1415);
                                                field688.method2167(var114);
                                            }
                                            try {
                                                field688.method2164();
                                            } catch (IOException var116) {
                                                method4464();
                                            }
                                            return;
                                        }
                                        var80 = var79.field1173;
                                        if (var80.field2960 < 0) {
                                            break;
                                        }
                                        var81 = class247.method3749(var80.field3010);
                                    } while (var81 == null || var81.field3091 == null || var80.field2960 >= var81.field3091.length || var81.field3091[var80.field2960] != var80);
                                    class79.method2186(var79);
                                }
                            }
                            var77 = var76.field1173;
                            if (var77.field2960 < 0) {
                                break;
                            }
                            var78 = class247.method3749(var77.field3010);
                        } while (var78 == null || var78.field3091 == null || var77.field2960 >= var78.field3091.length || var78.field3091[var77.field2960] != var77);
                        class79.method2186(var76);
                    }
                }
                var74 = var73.field1173;
                if (var74.field2960 < 0) {
                    break;
                }
                var75 = class247.method3749(var74.field3010);
            } while (var75 == null || var75.field3091 == null || var74.field2960 >= var75.field3091.length || var75.field3091[var74.field2960] != var74);
            class79.method2186(var73);
        }
    }

    @ObfuscatedName("cx.fi(I)V")
    public static final void method1997() {
        if (Statics.field1192 != null) {
            Statics.field1192.method633();
        }
        if (Statics.field3945 != null) {
            Statics.field3945.method633();
        }
    }

    @ObfuscatedName("be.fy(Lfl;IIII)V")
    public static void method913(class157 arg0, int arg1, int arg2, int arg3) {
        if (field867 >= 50 || Statics.field1804.field1325 == 0 || arg0.field1882 == null || arg1 >= arg0.field1882.length) {
            return;
        }
        int var4 = arg0.field1882[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field884[field867] = var5;
        field758[field867] = var6;
        field918[field867] = 0;
        field888[field867] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field704[field867] = (var8 << 16) + (var9 << 8) + var7;
        field867++;
    }

    @ObfuscatedName("lw.fx(IIII)V")
    public static void method5381(int arg0, int arg1, int arg2) {
        if (Statics.field1804.field1331 == 0 || arg1 == 0 || field867 >= 50) {
            return;
        }
        field884[field867] = arg0;
        field758[field867] = arg1;
        field918[field867] = arg2;
        field888[field867] = null;
        field704[field867] = 0;
        field867++;
    }

    @ObfuscatedName("ap.fm(IB)V")
    public static void method190(int arg0) {
        if (arg0 == -1 && !field882) {
            Statics.field1467.method4017();
            class233.field2828 = 1;
            Statics.field2520 = null;
        } else if (arg0 != -1 && field881 != arg0 && Statics.field1804.field1332 != 0 && !field882) {
            class233.method296(2, Statics.field1427, arg0, 0, Statics.field1804.field1332, false);
        }
        field881 = arg0;
    }

    @ObfuscatedName("jc.fu(III)V")
    public static void method4603(int arg0, int arg1) {
        if (Statics.field1804.field1332 != 0 && arg0 != -1) {
            class233.method2018(Statics.field2004, arg0, 0, Statics.field1804.field1332, false);
            field882 = true;
        }
    }

    @ObfuscatedName("bn.fd(Lio;III)V")
    public static final void method963(class247 arg0, int arg1, int arg2) {
        if (field880 != 0 && field880 != 3 || field778 || !(class48.field384 == 1 || !Statics.field666 && class48.field384 == 4)) {
            return;
        }
        class241 var3 = arg0.method4300(true);
        if (var3 == null) {
            return;
        }
        int var4 = class48.field368 - arg1;
        int var5 = class48.field378 - arg2;
        if (!var3.method4213(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2916 / 2;
        int var7 = var5 - var3.field2914 / 2;
        int var8 = field854 & 0x7FF;
        int var9 = class196.field2275[var8];
        int var10 = class196.field2286[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1163.field1238 + var11 >> 7;
        int var14 = Statics.field1163.field1237 - var12 >> 7;
        class227 var15 = class227.method171(class225.field2590, field688.field1415);
        var15.field2693.method6043(18);
        var15.field2693.method5983(class39.field286[82] ? (class39.field286[81] ? 2 : 1) : 0);
        var15.field2693.method6166(Statics.field458 + var14);
        var15.field2693.method6166(Statics.field2512 + var13);
        var15.field2693.method6043(var6);
        var15.field2693.method6043(var7);
        var15.field2693.method6166(field854);
        var15.field2693.method6043(57);
        var15.field2693.method6043(0);
        var15.field2693.method6043(0);
        var15.field2693.method6043(89);
        var15.field2693.method6166(Statics.field1163.field1238);
        var15.field2693.method6166(Statics.field1163.field1237);
        var15.field2693.method6043(63);
        field688.method2167(var15);
        field745 = var13;
        field787 = var14;
    }

    @ObfuscatedName("l.fv(I)V")
    public static final void method137() {
        int[] var0 = class109.field1381;
        for (int var1 = 0; var1 < class109.field1376; var1++) {
            class98 var2 = field830[var0[var1]];
            if (var2 != null && var2.field1253 > 0) {
                var2.field1253--;
                if (var2.field1253 == 0) {
                    var2.field1250 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field684; var3++) {
            int var4 = field685[var3];
            class105 var5 = field683[var4];
            if (var5 != null && var5.field1253 > 0) {
                var5.field1253--;
                if (var5.field1253 == 0) {
                    var5.field1250 = null;
                }
            }
        }
    }

    @ObfuscatedName("kd.fn(Ljava/lang/String;I)V")
    public static final void method4996(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1804.field1327 = !Statics.field1804.field1327;
            class103.method2073();
            if (Statics.field1804.field1327) {
                class111.method1459(99, "", "Roofs are now all hidden");
            } else {
                class111.method1459(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field656 = !field656;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field761 = !field761;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field790 = !field790;
        }
        if (field811 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field2928.field4039 = !Statics.field2928.field4039;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field656 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field656 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method4464();
            }
        }
        class227 var1 = class227.method171(class225.field2611, field688.field1415);
        var1.field2693.method6043(arg0.length() + 1);
        var1.field2693.method5955(arg0);
        field688.method2167(var1);
    }

    @ObfuscatedName("eo.fr(I)V")
    public static final void method2863() {
        if (field885 == 0) {
            int var0 = Statics.field1163.field1238;
            int var1 = Statics.field1163.field1237;
            if (Statics.field1911 - var0 < -500 || Statics.field1911 - var0 > 500 || Statics.field2522 - var1 < -500 || Statics.field2522 - var1 > 500) {
                Statics.field1911 = var0;
                Statics.field2522 = var1;
            }
            if (Statics.field1911 != var0) {
                Statics.field1911 += (var0 - Statics.field1911) / 16;
            }
            if (Statics.field2522 != var1) {
                Statics.field2522 += (var1 - Statics.field2522) / 16;
            }
            int var2 = Statics.field1911 >> 7;
            int var3 = Statics.field2522 >> 7;
            int var4 = method2069(Statics.field1911, Statics.field2522, Statics.field196);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field196;
                        if (var8 < 3 && (class90.field1119[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class90.field1128[var8][var6][var7];
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
            if (var10 > field728) {
                field728 += (var10 - field728) / 24;
            } else if (var10 < field728) {
                field728 += (var10 - field728) / 80;
            }
            Statics.field149 = method2069(Statics.field1163.field1238, Statics.field1163.field1237, Statics.field196) - field821;
        } else if (field885 == 1) {
            method2553();
            short var11 = -1;
            if (class39.field286[33]) {
                var11 = 0;
            } else if (class39.field286[49]) {
                var11 = 1024;
            }
            if (class39.field286[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class39.field286[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class39.field286[35]) {
                var12 = -1;
            } else if (class39.field286[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class39.field286[81] ? field645 : field722;
                var13 = var14 * 16;
                field733 = var11;
                field721 = var12;
            }
            if (field719 < var13) {
                field719 += var13 / 8;
                if (field719 > var13) {
                    field719 = var13;
                }
            } else if (field719 > var13) {
                field719 = field719 * 9 / 10;
            }
            if (field719 > 0) {
                int var15 = field719 / 16;
                if (field733 >= 0) {
                    int var16 = field733 - Statics.field4140 & 0x7FF;
                    int var17 = class196.field2275[var16];
                    int var18 = class196.field2286[var16];
                    Statics.field1911 += var15 * var17 / 65536;
                    Statics.field2522 += var15 * var18 / 65536;
                }
                if (field721 != 0) {
                    Statics.field149 += field721 * var15;
                    if (Statics.field149 > 0) {
                        Statics.field149 = 0;
                    }
                }
            } else {
                field733 = -1;
                field721 = -1;
            }
            if (class39.field286[13]) {
                method535();
            }
        }
        if (class48.field376 == 4 && Statics.field666) {
            int var19 = class48.field370 - field640;
            field714 = var19 * 2;
            field640 = var19 == -1 || var19 == 1 ? class48.field370 : (field640 + class48.field370) / 2;
            int var20 = field715 - class48.field389;
            field647 = var20 * 2;
            field715 = var20 == -1 || var20 == 1 ? class48.field389 : (field715 + class48.field389) / 2;
        } else {
            if (class39.field286[96]) {
                field647 += (-24 - field647) / 2;
            } else if (class39.field286[97]) {
                field647 += (24 - field647) / 2;
            } else {
                field647 /= 2;
            }
            if (class39.field286[98]) {
                field714 += (12 - field714) / 2;
            } else if (class39.field286[99]) {
                field714 += (-12 - field714) / 2;
            } else {
                field714 /= 2;
            }
            field640 = class48.field370;
            field715 = class48.field389;
        }
        field854 = field647 / 2 + field854 & 0x7FF;
        field711 += field714 / 2;
        if (field711 < 128) {
            field711 = 128;
        }
        if (field711 > 383) {
            field711 = 383;
        }
    }

    @ObfuscatedName("b.fk(Lcy;II)V")
    public static final void method57(class100 arg0, int arg1) {
        if (arg0.field1266 >= field650) {
            int var2 = Math.max(1, arg0.field1266 - field650);
            int var3 = arg0.field1279 * 128 + arg0.field1240 * 64;
            int var4 = arg0.field1281 * 128 + arg0.field1240 * 64;
            arg0.field1238 += (var3 - arg0.field1238) / var2;
            arg0.field1237 += (var4 - arg0.field1237) / var2;
            arg0.field1295 = 0;
            arg0.field1267 = arg0.field1285;
        } else if (arg0.field1284 >= field650) {
            method17(arg0);
        } else {
            method1892(arg0);
        }
        if (arg0.field1238 < 128 || arg0.field1237 < 128 || arg0.field1238 >= 13184 || arg0.field1237 >= 13184) {
            arg0.field1269 = -1;
            arg0.field1274 = -1;
            arg0.field1266 = 0;
            arg0.field1284 = 0;
            arg0.field1238 = arg0.field1273[0] * 128 + arg0.field1240 * 64;
            arg0.field1237 = arg0.field1287[0] * 128 + arg0.field1240 * 64;
            arg0.method1975();
        }
        if (Statics.field1163 == arg0 && (arg0.field1238 < 1536 || arg0.field1237 < 1536 || arg0.field1238 >= 11776 || arg0.field1237 >= 11776)) {
            arg0.field1269 = -1;
            arg0.field1274 = -1;
            arg0.field1266 = 0;
            arg0.field1284 = 0;
            arg0.field1238 = arg0.field1273[0] * 128 + arg0.field1240 * 64;
            arg0.field1237 = arg0.field1287[0] * 128 + arg0.field1240 * 64;
            arg0.method1975();
        }
        method4408(arg0);
        method350(arg0);
    }

    @ObfuscatedName("f.gg(Lcy;B)V")
    public static final void method17(class100 arg0) {
        if (field650 == arg0.field1284 || arg0.field1269 == -1 || arg0.field1272 != 0 || arg0.field1271 + 1 > class157.method2030(arg0.field1269).field1881[arg0.field1292]) {
            int var1 = arg0.field1284 - arg0.field1266;
            int var2 = field650 - arg0.field1266;
            int var3 = arg0.field1279 * 128 + arg0.field1240 * 64;
            int var4 = arg0.field1281 * 128 + arg0.field1240 * 64;
            int var5 = arg0.field1270 * 128 + arg0.field1240 * 64;
            int var6 = arg0.field1240 * 64 + arg0.field1239 * 128;
            arg0.field1238 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1237 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1295 = 0;
        arg0.field1267 = arg0.field1285;
        arg0.field1280 = arg0.field1267;
    }

    @ObfuscatedName("cu.gq(Lcy;I)V")
    public static final void method1892(class100 arg0) {
        arg0.field1243 = arg0.field1242;
        if (arg0.field1291 == 0) {
            arg0.field1295 = 0;
            return;
        }
        if (arg0.field1269 != -1 && arg0.field1272 == 0) {
            class157 var1 = class157.method2030(arg0.field1269);
            if (arg0.field1275 > 0 && var1.field1884 == 0) {
                arg0.field1295++;
                return;
            }
            if (arg0.field1275 <= 0 && var1.field1891 == 0) {
                arg0.field1295++;
                return;
            }
        }
        int var2 = arg0.field1238;
        int var3 = arg0.field1237;
        int var4 = arg0.field1273[arg0.field1291 - 1] * 128 + arg0.field1240 * 64;
        int var5 = arg0.field1287[arg0.field1291 - 1] * 128 + arg0.field1240 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1267 = 1280;
            } else if (var3 > var5) {
                arg0.field1267 = 1792;
            } else {
                arg0.field1267 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1267 = 768;
            } else if (var3 > var5) {
                arg0.field1267 = 256;
            } else {
                arg0.field1267 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1267 = 1024;
        } else if (var3 > var5) {
            arg0.field1267 = 0;
        }
        byte var6 = arg0.field1247[arg0.field1291 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1238 = var4;
            arg0.field1237 = var5;
            arg0.field1291--;
            if (arg0.field1275 > 0) {
                arg0.field1275--;
            }
            return;
        }
        int var7 = arg0.field1267 - arg0.field1280 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1268;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1245;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1248;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1293;
        }
        if (var8 == -1) {
            var8 = arg0.field1245;
        }
        arg0.field1243 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class105) {
            var10 = ((class105) arg0).field1346.field1665;
        }
        if (var10) {
            if (arg0.field1280 != arg0.field1267 && arg0.field1289 == -1 && arg0.field1290 != 0) {
                var9 = 2;
            }
            if (arg0.field1291 > 2) {
                var9 = 6;
            }
            if (arg0.field1291 > 3) {
                var9 = 8;
            }
            if (arg0.field1295 > 0 && arg0.field1291 > 1) {
                var9 = 8;
                arg0.field1295--;
            }
        } else {
            if (arg0.field1291 > 1) {
                var9 = 6;
            }
            if (arg0.field1291 > 2) {
                var9 = 8;
            }
            if (arg0.field1295 > 0 && arg0.field1291 > 1) {
                var9 = 8;
                arg0.field1295--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1245 == arg0.field1243 && arg0.field1294 != -1) {
            arg0.field1243 = arg0.field1294;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1238 += var9;
                if (arg0.field1238 > var4) {
                    arg0.field1238 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1238 -= var9;
                if (arg0.field1238 < var4) {
                    arg0.field1238 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1237 += var9;
                if (arg0.field1237 > var5) {
                    arg0.field1237 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1237 -= var9;
                if (arg0.field1237 < var5) {
                    arg0.field1237 = var5;
                }
            }
        }
        if (arg0.field1238 == var4 && arg0.field1237 == var5) {
            arg0.field1291--;
            if (arg0.field1275 > 0) {
                arg0.field1275--;
            }
        }
    }

    @ObfuscatedName("jo.gw(Lcy;I)V")
    public static final void method4408(class100 arg0) {
        if (arg0.field1290 == 0) {
            return;
        }
        if (arg0.field1289 != -1) {
            class100 var1 = null;
            if (arg0.field1289 < 32768) {
                var1 = field683[arg0.field1289];
            } else if (arg0.field1289 >= 32768) {
                var1 = field830[arg0.field1289 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1238 - var1.field1238;
                int var3 = arg0.field1237 - var1.field1237;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1267 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1264) {
                arg0.field1289 = -1;
                arg0.field1264 = false;
            }
        }
        if (arg0.field1265 != -1 && (arg0.field1291 == 0 || arg0.field1295 > 0)) {
            arg0.field1267 = arg0.field1265;
            arg0.field1265 = -1;
        }
        int var4 = arg0.field1267 - arg0.field1280 & 0x7FF;
        if (var4 == 0 && arg0.field1264) {
            arg0.field1289 = -1;
            arg0.field1264 = false;
        }
        if (var4 == 0) {
            arg0.field1283 = 0;
            return;
        }
        arg0.field1283++;
        if (var4 > 1024) {
            arg0.field1280 -= arg0.field1290;
            boolean var5 = true;
            if (var4 < arg0.field1290 || var4 > 2048 - arg0.field1290) {
                arg0.field1280 = arg0.field1267;
                var5 = false;
            }
            if (arg0.field1243 == arg0.field1242 && (arg0.field1283 > 25 || var5)) {
                if (arg0.field1282 == -1) {
                    arg0.field1243 = arg0.field1245;
                } else {
                    arg0.field1243 = arg0.field1282;
                }
            }
        } else {
            arg0.field1280 += arg0.field1290;
            boolean var6 = true;
            if (var4 < arg0.field1290 || var4 > 2048 - arg0.field1290) {
                arg0.field1280 = arg0.field1267;
                var6 = false;
            }
            if (arg0.field1243 == arg0.field1242 && (arg0.field1283 > 25 || var6)) {
                if (arg0.field1244 == -1) {
                    arg0.field1243 = arg0.field1245;
                } else {
                    arg0.field1243 = arg0.field1244;
                }
            }
        }
        arg0.field1280 &= 0x7FF;
    }

    @ObfuscatedName("aq.gi(Lcy;I)V")
    public static final void method350(class100 arg0) {
        arg0.field1256 = false;
        if (arg0.field1243 != -1) {
            class157 var1 = class157.method2030(arg0.field1243);
            if (var1 == null || var1.field1879 == null) {
                arg0.field1243 = -1;
            } else {
                arg0.field1296++;
                if (arg0.field1252 < var1.field1879.length && arg0.field1296 > var1.field1881[arg0.field1252]) {
                    arg0.field1296 = 1;
                    arg0.field1252++;
                    method913(var1, arg0.field1252, arg0.field1238, arg0.field1237);
                }
                if (arg0.field1252 >= var1.field1879.length) {
                    arg0.field1296 = 0;
                    arg0.field1252 = 0;
                    method913(var1, arg0.field1252, arg0.field1238, arg0.field1237);
                }
            }
        }
        if (arg0.field1274 != -1 && field650 >= arg0.field1288) {
            if (arg0.field1263 < 0) {
                arg0.field1263 = 0;
            }
            int var2 = class148.method2427(arg0.field1274).field1690;
            if (var2 == -1) {
                arg0.field1274 = -1;
            } else {
                class157 var3 = class157.method2030(var2);
                if (var3 == null || var3.field1879 == null) {
                    arg0.field1274 = -1;
                } else {
                    arg0.field1276++;
                    if (arg0.field1263 < var3.field1879.length && arg0.field1276 > var3.field1881[arg0.field1263]) {
                        arg0.field1276 = 1;
                        arg0.field1263++;
                        method913(var3, arg0.field1263, arg0.field1238, arg0.field1237);
                    }
                    if (arg0.field1263 >= var3.field1879.length && (arg0.field1263 < 0 || arg0.field1263 >= var3.field1879.length)) {
                        arg0.field1274 = -1;
                    }
                }
            }
        }
        if (arg0.field1269 != -1 && arg0.field1272 <= 1) {
            class157 var4 = class157.method2030(arg0.field1269);
            if (var4.field1884 == 1 && arg0.field1275 > 0 && arg0.field1266 <= field650 && arg0.field1284 < field650) {
                arg0.field1272 = 1;
                return;
            }
        }
        if (arg0.field1269 != -1 && arg0.field1272 == 0) {
            class157 var5 = class157.method2030(arg0.field1269);
            if (var5 == null || var5.field1879 == null) {
                arg0.field1269 = -1;
            } else {
                arg0.field1271++;
                if (arg0.field1292 < var5.field1879.length && arg0.field1271 > var5.field1881[arg0.field1292]) {
                    arg0.field1271 = 1;
                    arg0.field1292++;
                    method913(var5, arg0.field1292, arg0.field1238, arg0.field1237);
                }
                if (arg0.field1292 >= var5.field1879.length) {
                    arg0.field1292 -= var5.field1878;
                    arg0.field1246++;
                    if (arg0.field1246 >= var5.field1889) {
                        arg0.field1269 = -1;
                    } else if (arg0.field1292 >= 0 && arg0.field1292 < var5.field1879.length) {
                        method913(var5, arg0.field1292, arg0.field1238, arg0.field1237);
                    } else {
                        arg0.field1269 = -1;
                    }
                }
                arg0.field1256 = var5.field1883;
            }
        }
        if (arg0.field1272 > 0) {
            arg0.field1272--;
        }
    }

    @ObfuscatedName("ar.gz(Lce;IIB)V")
    public static void method204(class98 arg0, int arg1, int arg2) {
        if (arg0.field1269 == arg1 && arg1 != -1) {
            int var3 = class157.method2030(arg1).field1892;
            if (var3 == 1) {
                arg0.field1292 = 0;
                arg0.field1271 = 0;
                arg0.field1272 = arg2;
                arg0.field1246 = 0;
            }
            if (var3 == 2) {
                arg0.field1246 = 0;
            }
        } else if (arg1 == -1 || arg0.field1269 == -1 || class157.method2030(arg1).field1886 >= class157.method2030(arg0.field1269).field1886) {
            arg0.field1269 = arg1;
            arg0.field1292 = 0;
            arg0.field1271 = 0;
            arg0.field1272 = arg2;
            arg0.field1246 = 0;
            arg0.field1275 = arg0.field1291;
        }
    }

    @ObfuscatedName("es.gb(I)I")
    public static int method2559() {
        return field900 ? 2 : 1;
    }

    @ObfuscatedName("fz.gs(II)V")
    public static void method2945(int arg0) {
        field859 = 0L;
        if (arg0 >= 2) {
            field900 = true;
        } else {
            field900 = false;
        }
        if (method2559() == 1) {
            Statics.field204.method373(765, 503);
        } else {
            Statics.field204.method373(7680, 2160);
        }
        if (field646 < 25) {
            return;
        }
        class227 var1 = class227.method171(class225.field2663, field688.field1415);
        var1.field2693.method6043(method2559());
        var1.field2693.method6166(Statics.field247);
        var1.field2693.method6166(Statics.field603);
        field688.method2167(var1);
    }

    @ObfuscatedName("client.o(B)V")
    public final void method381() {
        field859 = class380.method2744() + 500L;
        this.method1027();
        if (field637 != -1) {
            this.method1033(true);
        }
    }

    @ObfuscatedName("client.gv(I)V")
    public void method1027() {
        int var1 = Statics.field247;
        int var2 = Statics.field603;
        if (this.field360 < var1) {
            int var3 = this.field360;
        }
        if (this.field345 < var2) {
            int var4 = this.field345;
        }
        if (Statics.field1804 != null) {
            try {
                class43.method323(Statics.field204, "resize", new Object[] { method2559() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gm(I)V")
    public final void method1028() {
        if (field637 != -1) {
            int var1 = field637;
            if (class247.method2363(var1)) {
                method293(Statics.field2951[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field871; var2++) {
            if (field720[var2]) {
                field781[var2] = true;
            }
            field861[var2] = field720[var2];
            field720[var2] = false;
        }
        field850 = field650;
        field791 = -1;
        field754 = -1;
        Statics.field156 = null;
        if (field637 != -1) {
            field871 = 0;
            method3965(field637, 0, 0, Statics.field247, Statics.field603, 0, 0, -1);
        }
        class392.method6241();
        if (field712) {
            if (field746 == 1) {
                Statics.field1149[field870 / 100].method6355(field792 - 8, field744 - 8);
            }
            if (field746 == 2) {
                Statics.field1149[field870 / 100 + 4].method6355(field792 - 8, field744 - 8);
            }
        }
        if (field778) {
            int var3 = Statics.field134;
            int var4 = Statics.field2927;
            int var5 = Statics.field240;
            int var6 = Statics.field209;
            int var7 = 6116423;
            class392.method6265(var3, var4, var5, var6, var7);
            class392.method6265(var3 + 1, var4 + 1, var5 - 2, 16, 0);
            class392.method6254(var3 + 1, var4 + 18, var5 - 2, var6 - 19, 0);
            Statics.field3099.method4891(class268.field3391, var3 + 3, var4 + 14, var7, -1);
            int var8 = class48.field389;
            int var9 = class48.field370;
            for (int var10 = 0; var10 < field779; var10++) {
                int var11 = (field779 - 1 - var10) * 15 + var4 + 31;
                int var12 = 16777215;
                if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                    var12 = 16776960;
                }
                Statics.field3099.method4891(method1907(var10), var3 + 3, var11, var12, 0);
            }
            method664(Statics.field134, Statics.field2927, Statics.field240, Statics.field209);
        } else if (field791 != -1) {
            method2324(field791, field754);
        }
        if (field858 == 3) {
            for (int var13 = 0; var13 < field871; var13++) {
                if (field861[var13]) {
                    class392.method6249(field920[var13], field743[var13], field764[var13], field857[var13], 16711935, 128);
                } else if (field781[var13]) {
                    class392.method6249(field920[var13], field743[var13], field764[var13], field857[var13], 16711680, 128);
                }
            }
        }
        class78.method3282(Statics.field196, Statics.field1163.field1238, Statics.field1163.field1237, field914);
        field914 = 0;
    }

    @ObfuscatedName("if.go(Ljava/lang/String;ZI)V")
    public static final void method4386(String arg0, boolean arg1) {
        if (!field814) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1447.method4888(arg0, 250);
        int var6 = Statics.field1447.method4889(arg0, 250) * 13;
        class392.method6265(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class392.method6254(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1447.method4905(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field871; var11++) {
            if (field920[var11] + field764[var11] > var7 && field920[var11] < var7 + var9 && field857[var11] + field743[var11] > var8 && field743[var11] < var8 + var10) {
                field720[var11] = true;
            }
        }
        if (arg1) {
            Statics.field222.method371(0, 0);
        } else {
            method664(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("bw.gf(IIIII)V")
    public static final void method967(int arg0, int arg1, int arg2, int arg3) {
        field784++;
        if (Statics.field1163.field1238 >> 7 == field745 && Statics.field1163.field1237 >> 7 == field787) {
            field745 = 0;
        }
        method907();
        method3903();
        method1012(true);
        method5883();
        method1012(false);
        for (class85 var4 = (class85) field908.method4714(); var4 != null; var4 = (class85) field908.method4741()) {
            if (Statics.field196 != var4.field1058 || field650 > var4.field1075) {
                var4.method5496();
            } else if (field650 >= var4.field1063) {
                if (var4.field1067 > 0) {
                    class105 var5 = field683[var4.field1067 - 1];
                    if (var5 != null && var5.field1238 >= 0 && var5.field1238 < 13312 && var5.field1237 >= 0 && var5.field1237 < 13312) {
                        var4.method1774(var5.field1238, var5.field1237, method2069(var5.field1238, var5.field1237, var4.field1058) - var4.field1062, field650);
                    }
                }
                if (var4.field1067 < 0) {
                    int var6 = -var4.field1067 - 1;
                    class98 var7;
                    if (field759 == var6) {
                        var7 = Statics.field1163;
                    } else {
                        var7 = field830[var6];
                    }
                    if (var7 != null && var7.field1238 >= 0 && var7.field1238 < 13312 && var7.field1237 >= 0 && var7.field1237 < 13312) {
                        var4.method1774(var7.field1238, var7.field1237, method2069(var7.field1238, var7.field1237, var4.field1058) - var4.field1062, field650);
                    }
                }
                var4.method1773(field914);
                Statics.field3862.method3721(Statics.field196, (int) var4.field1069, (int) var4.field1070, (int) var4.field1071, 60, var4, var4.field1077, -1L, false);
            }
        }
        for (class80 var8 = (class80) field919.method4714(); var8 != null; var8 = (class80) field919.method4741()) {
            if (Statics.field196 != var8.field995 || var8.field994) {
                var8.method5496();
            } else if (field650 >= var8.field1002) {
                var8.method1708(field914);
                if (var8.field994) {
                    var8.method5496();
                } else {
                    Statics.field3862.method3721(var8.field995, var8.field996, var8.field997, var8.field998, 60, var8, 0, -1L, false);
                }
            }
        }
        method2193(arg0, arg1, arg2, arg3, true);
        int var9 = field903;
        int var10 = field904;
        int var11 = field905;
        int var12 = field906;
        class392.method6277(var9, var10, var9 + var11, var10 + var12);
        class196.method3491();
        if (!field762) {
            int var13 = field711;
            if (field728 / 256 > var13) {
                var13 = field728 / 256;
            }
            if (field694[4] && field892[4] + 128 > var13) {
                var13 = field892[4] + 128;
            }
            int var14 = field854 & 0x7FF;
            int var15 = Statics.field1911;
            int var16 = Statics.field149;
            int var17 = Statics.field2522;
            int var18 = method1793(var13);
            int var19 = method3324(var18, var12);
            int var20 = 2048 - var13 & 0x7FF;
            int var21 = 2048 - var14 & 0x7FF;
            int var22 = 0;
            int var23 = 0;
            int var24 = var19;
            if (var20 != 0) {
                int var25 = class196.field2275[var20];
                int var26 = class196.field2286[var20];
                int var27 = var23 * var26 - var19 * var25 >> 16;
                var24 = var23 * var25 + var19 * var26 >> 16;
                var23 = var27;
            }
            if (var21 != 0) {
                int var28 = class196.field2275[var21];
                int var29 = class196.field2286[var21];
                int var30 = var22 * var29 + var24 * var28 >> 16;
                var24 = var24 * var29 - var22 * var28 >> 16;
                var22 = var30;
            }
            Statics.field386 = var15 - var22;
            Statics.field1138 = var16 - var23;
            Statics.field1348 = var17 - var24;
            Statics.field1693 = var13;
            Statics.field4140 = var14;
            if (field885 == 1 && field811 >= 2 && field650 % 50 == 0 && (Statics.field1911 >> 7 != Statics.field1163.field1238 >> 7 || Statics.field2522 >> 7 != Statics.field1163.field1237 >> 7)) {
                int var31 = Statics.field1163.field1214;
                int var32 = (Statics.field1911 >> 7) + Statics.field2512;
                int var33 = (Statics.field2522 >> 7) + Statics.field458;
                method41(var32, var33, var31, true);
            }
        }
        int var46;
        if (field762) {
            var46 = method206();
        } else {
            int var34;
            if (Statics.field1804.field1327) {
                var34 = Statics.field196;
            } else {
                label353: {
                    int var35 = 3;
                    if (Statics.field1693 < 310) {
                        int var36;
                        int var37;
                        if (field885 == 1) {
                            var36 = Statics.field1911 >> 7;
                            var37 = Statics.field2522 >> 7;
                        } else {
                            var36 = Statics.field1163.field1238 >> 7;
                            var37 = Statics.field1163.field1237 >> 7;
                        }
                        int var38 = Statics.field386 >> 7;
                        int var39 = Statics.field1348 >> 7;
                        if (var38 < 0 || var39 < 0 || var38 >= 104 || var39 >= 104) {
                            var34 = Statics.field196;
                            break label353;
                        }
                        if (var36 < 0 || var37 < 0 || var36 >= 104 || var37 >= 104) {
                            var34 = Statics.field196;
                            break label353;
                        }
                        if ((class90.field1119[Statics.field196][var38][var39] & 0x4) != 0) {
                            var35 = Statics.field196;
                        }
                        int var40;
                        if (var36 > var38) {
                            var40 = var36 - var38;
                        } else {
                            var40 = var38 - var36;
                        }
                        int var41;
                        if (var37 > var39) {
                            var41 = var37 - var39;
                        } else {
                            var41 = var39 - var37;
                        }
                        if (var40 > var41) {
                            int var42 = var41 * 65536 / var40;
                            int var43 = 32768;
                            while (var36 != var38) {
                                if (var38 < var36) {
                                    var38++;
                                } else if (var38 > var36) {
                                    var38--;
                                }
                                if ((class90.field1119[Statics.field196][var38][var39] & 0x4) != 0) {
                                    var35 = Statics.field196;
                                }
                                var43 += var42;
                                if (var43 >= 65536) {
                                    var43 -= 65536;
                                    if (var39 < var37) {
                                        var39++;
                                    } else if (var39 > var37) {
                                        var39--;
                                    }
                                    if ((class90.field1119[Statics.field196][var38][var39] & 0x4) != 0) {
                                        var35 = Statics.field196;
                                    }
                                }
                            }
                        } else if (var41 > 0) {
                            int var44 = var40 * 65536 / var41;
                            int var45 = 32768;
                            while (var37 != var39) {
                                if (var39 < var37) {
                                    var39++;
                                } else if (var39 > var37) {
                                    var39--;
                                }
                                if ((class90.field1119[Statics.field196][var38][var39] & 0x4) != 0) {
                                    var35 = Statics.field196;
                                }
                                var45 += var44;
                                if (var45 >= 65536) {
                                    var45 -= 65536;
                                    if (var38 < var36) {
                                        var38++;
                                    } else if (var38 > var36) {
                                        var38--;
                                    }
                                    if ((class90.field1119[Statics.field196][var38][var39] & 0x4) != 0) {
                                        var35 = Statics.field196;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field1163.field1238 >= 0 && Statics.field1163.field1237 >= 0 && Statics.field1163.field1238 < 13312 && Statics.field1163.field1237 < 13312) {
                        if ((class90.field1119[Statics.field196][Statics.field1163.field1238 >> 7][Statics.field1163.field1237 >> 7] & 0x4) != 0) {
                            var35 = Statics.field196;
                        }
                        var34 = var35;
                    } else {
                        var34 = Statics.field196;
                    }
                }
            }
            var46 = var34;
        }
        int var47 = Statics.field386;
        int var48 = Statics.field1138;
        int var49 = Statics.field1348;
        int var50 = Statics.field1693;
        int var51 = Statics.field4140;
        for (int var52 = 0; var52 < 5; var52++) {
            if (field694[var52]) {
                int var53 = (int) (Math.random() * (double) (field891[var52] * 2 + 1) - (double) field891[var52] + Math.sin((double) field893[var52] / 100.0D * (double) field894[var52]) * (double) field892[var52]);
                if (var52 == 0) {
                    Statics.field386 += var53;
                }
                if (var52 == 1) {
                    Statics.field1138 += var53;
                }
                if (var52 == 2) {
                    Statics.field1348 += var53;
                }
                if (var52 == 3) {
                    Statics.field4140 = Statics.field4140 + var53 & 0x7FF;
                }
                if (var52 == 4) {
                    Statics.field1693 += var53;
                    if (Statics.field1693 < 128) {
                        Statics.field1693 = 128;
                    }
                    if (Statics.field1693 > 383) {
                        Statics.field1693 = 383;
                    }
                }
            }
        }
        int var54 = class48.field389;
        int var55 = class48.field370;
        if (class48.field384 != 0) {
            var54 = class48.field368;
            var55 = class48.field378;
        }
        if (var54 >= var9 && var54 < var9 + var11 && var55 >= var10 && var55 < var10 + var12) {
            class206.method2364(var54 - var9, var55 - var10);
        } else {
            class206.method1723();
        }
        method1997();
        class392.method6265(var9, var10, var11, var12, 0);
        method1997();
        int var56 = class196.field2271;
        class196.field2271 = field907;
        Statics.field3862.method3707(Statics.field386, Statics.field1138, Statics.field1348, Statics.field1693, Statics.field4140, var46);
        class196.field2271 = var56;
        method1997();
        Statics.field3862.method3585();
        method4569(var9, var10, var11, var12);
        method1823(var9, var10);
        ((class203) Statics.field2282).method3761(field914);
        method189(var9, var10, var11, var12);
        Statics.field386 = var47;
        Statics.field1138 = var48;
        Statics.field1348 = var49;
        Statics.field1693 = var50;
        Statics.field4140 = var51;
        if (field802) {
            byte var57 = 0;
            int var58 = class276.field3616 + class276.field3604 + var57;
            if (var58 == 0) {
                field802 = false;
            }
        }
        if (field802) {
            class392.method6265(var9, var10, var11, var12, 0);
            method4386(class268.field3265, false);
        }
    }

    @ObfuscatedName("do.gu(IIIIZI)V")
    public static final void method2193(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field895;
        } else if (var5 >= 100) {
            var6 = field896;
        } else {
            var6 = (field896 - field895) * var5 / 100 + field895;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field901) {
            short var8 = field901;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field829) {
                var6 = field829;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class392.method6241();
                    class392.method6265(arg0, arg1, var10, arg3, -16777216);
                    class392.method6265(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field902) {
            short var11 = field902;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field910) {
                var6 = field910;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class392.method6241();
                    class392.method6265(arg0, arg1, arg2, var13, -16777216);
                    class392.method6265(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field907 = arg3 * var6 / 334;
        if (field905 != arg2 || field906 != arg3) {
            method153(arg2, arg3);
        }
        field903 = arg0;
        field904 = arg1;
        field905 = arg2;
        field906 = arg3;
    }

    @ObfuscatedName("be.gx(B)V")
    public static void method907() {
        if (field761) {
            method2329(Statics.field1163, false);
        }
    }

    @ObfuscatedName("hj.gj(B)V")
    public static void method3903() {
        if (field769 >= 0 && field830[field769] != null) {
            method2329(field830[field769], false);
        }
    }

    @ObfuscatedName("nw.ge(I)V")
    public static void method5883() {
        int var0 = class109.field1376;
        int[] var1 = class109.field1381;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field769 != var1[var2] && field759 != var1[var2]) {
                method2329(field830[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ea.gt(Lce;ZI)V")
    public static void method2329(class98 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1968() || arg0.field1205) {
            return;
        }
        arg0.field1211 = false;
        if ((field642 && class109.field1376 > 50 || class109.field1376 > 200) && arg1 && arg0.field1243 == arg0.field1242) {
            arg0.field1211 = true;
        }
        int var2 = arg0.field1238 >> 7;
        int var3 = arg0.field1237 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class206.method281(0, 0, 0, false, arg0.field1193);
        if (arg0.field1213 != null && field650 >= arg0.field1201 && field650 < arg0.field1222) {
            arg0.field1211 = false;
            arg0.field1200 = method2069(arg0.field1238, arg0.field1237, Statics.field196);
            arg0.field1241 = field650;
            Statics.field3862.method3583(Statics.field196, arg0.field1238, arg0.field1237, arg0.field1200, 60, arg0, arg0.field1280, var4, arg0.field1207, arg0.field1208, arg0.field1209, arg0.field1210);
            return;
        }
        if ((arg0.field1238 & 0x7F) == 64 && (arg0.field1237 & 0x7F) == 64) {
            if (field784 == field739[var2][var3]) {
                return;
            }
            field739[var2][var3] = field784;
        }
        arg0.field1200 = method2069(arg0.field1238, arg0.field1237, Statics.field196);
        arg0.field1241 = field650;
        Statics.field3862.method3721(Statics.field196, arg0.field1238, arg0.field1237, arg0.field1200, 60, arg0, arg0.field1280, var4, arg0.field1256);
    }

    @ObfuscatedName("bk.gl(ZI)V")
    public static final void method1012(boolean arg0) {
        for (int var1 = 0; var1 < field684; var1++) {
            class105 var2 = field683[field685[var1]];
            if (var2 != null && var2.method1968() && var2.field1346.field1649 == arg0 && var2.field1346.method2533()) {
                int var3 = var2.field1238 >> 7;
                int var4 = var2.field1237 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1240 == 1 && (var2.field1238 & 0x7F) == 64 && (var2.field1237 & 0x7F) == 64) {
                        if (field784 == field739[var3][var4]) {
                            continue;
                        }
                        field739[var3][var4] = field784;
                    }
                    long var5 = class206.method281(0, 0, 1, !var2.field1346.field1664, field685[var1]);
                    var2.field1241 = field650;
                    Statics.field3862.method3721(Statics.field196, var2.field1238, var2.field1237, method2069(var2.field1238 + (var2.field1240 * 64 - 64), var2.field1237 + (var2.field1240 * 64 - 64), Statics.field196), var2.field1240 * 64 - 64 + 60, var2, var2.field1280, var5, var2.field1256);
                }
            }
        }
    }

    @ObfuscatedName("ar.gk(B)I")
    public static final int method206() {
        if (Statics.field1804.field1327) {
            return Statics.field196;
        } else {
            int var0 = method2069(Statics.field386, Statics.field1348, Statics.field196);
            return var0 - Statics.field1138 >= 800 || (class90.field1119[Statics.field196][Statics.field386 >> 7][Statics.field1348 >> 7] & 0x4) == 0 ? 3 : Statics.field196;
        }
    }

    @ObfuscatedName("cs.gd(III)V")
    public static final void method1823(int arg0, int arg1) {
        if (field658 == 2) {
            method4585((field661 - Statics.field2512 << 7) + field716, (field662 - Statics.field458 << 7) + field665, field663 * 2);
            if (field659 > -1 && field650 % 20 < 10) {
                Statics.field2700[0].method6355(field659 + arg0 - 12, field742 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("client.gn(I)Z")
    public static boolean method1333() {
        return (field809 & 0x4) != 0;
    }

    @ObfuscatedName("aq.gh(B)Z")
    public static boolean method352() {
        return (field809 & 0x2) != 0;
    }

    @ObfuscatedName("hp.gp(I)Z")
    public static boolean method4049() {
        return (field809 & 0x8) != 0;
    }

    @ObfuscatedName("fe.gr(Lce;I)Z")
    public static boolean method2987(class98 arg0) {
        if (field809 == 0) {
            return false;
        } else if (Statics.field1163 == arg0) {
            return method4049();
        } else {
            boolean var1 = method1333();
            if (!var1) {
                boolean var2 = (field809 & 0x1) != 0;
                var1 = var2 && arg0.method1912();
            }
            return var1 || method352() && arg0.method1956();
        }
    }

    @ObfuscatedName("la.gy(Lcy;IIIIII)V")
    public static final void method5327(class100 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1968()) {
            return;
        }
        if (arg0 instanceof class105) {
            class146 var6 = ((class105) arg0).field1346;
            if (var6.field1640 != null) {
                var6 = var6.method2532();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class109.field1376;
        int[] var8 = class109.field1381;
        byte var9 = 0;
        if (arg1 < var7 && field650 == arg0.field1241 && method2987((class98) arg0)) {
            class98 var10 = (class98) arg0;
            if (arg1 < var7) {
                int var11 = arg0.field1277 + 15;
                method4585(arg0.field1238, arg0.field1237, var11);
                class301 var12 = (class301) field757.get(class359.field4063);
                byte var13 = 9;
                var12.method4894(var10.field1199.method5338(), field659 + arg2, field742 + arg3 - var13, 16777215, 0);
                var9 = 18;
            }
        }
        int var14 = -2;
        if (!arg0.field1262.method4771()) {
            int var15 = arg0.field1277 + 15;
            method4585(arg0.field1238, arg0.field1237, var15);
            for (class104 var16 = (class104) arg0.field1262.method4767(); var16 != null; var16 = (class104) arg0.field1262.method4769()) {
                class101 var17 = var16.method2049(field650);
                if (var17 != null) {
                    class142 var18 = var16.field1340;
                    class396 var19 = var18.method2475();
                    class396 var20 = var18.method2474();
                    int var21 = 0;
                    int var22;
                    if (var19 == null || var20 == null) {
                        var22 = var18.field1605;
                    } else {
                        if (var18.field1601 * 2 < var20.field4253) {
                            var21 = var18.field1601;
                        }
                        var22 = var20.field4253 - var21 * 2;
                    }
                    int var23 = 255;
                    boolean var24 = true;
                    int var25 = field650 - var17.field1300;
                    int var26 = var17.field1301 * var22 / var18.field1605;
                    int var29;
                    if (var17.field1302 > var25) {
                        int var27 = var18.field1609 == 0 ? 0 : var25 / var18.field1609 * var18.field1609;
                        int var28 = var17.field1304 * var22 / var18.field1605;
                        var29 = (var26 - var28) * var27 / var17.field1302 + var28;
                    } else {
                        var29 = var26;
                        int var30 = var17.field1302 + var18.field1606 - var25;
                        if (var18.field1600 >= 0) {
                            var23 = (var30 << 8) / (var18.field1606 - var18.field1600);
                        }
                    }
                    if (var17.field1301 > 0 && var29 < 1) {
                        var29 = 1;
                    }
                    if (var19 == null || var20 == null) {
                        var14 += 5;
                        if (field659 > -1) {
                            int var36 = field659 + arg2 - (var22 >> 1);
                            int var37 = field742 + arg3 - var14;
                            class392.method6265(var36, var37, var29, 5, 65280);
                            class392.method6265(var29 + var36, var37, var22 - var29, 5, 16711680);
                        }
                        var14 += 2;
                    } else {
                        int var31;
                        if (var22 == var29) {
                            var31 = var21 * 2 + var29;
                        } else {
                            var31 = var21 + var29;
                        }
                        int var32 = var19.field4245;
                        var14 += var32;
                        int var33 = field659 + arg2 - (var22 >> 1);
                        int var34 = field742 + arg3 - var14;
                        int var35 = var33 - var21;
                        if (var23 >= 0 && var23 < 255) {
                            var19.method6361(var35, var34, var23);
                            class392.method6263(var35, var34, var31 + var35, var32 + var34);
                            var20.method6361(var35, var34, var23);
                        } else {
                            var19.method6355(var35, var34);
                            class392.method6263(var35, var34, var31 + var35, var32 + var34);
                            var20.method6355(var35, var34);
                        }
                        class392.method6277(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var14 += 2;
                    }
                } else if (var16.method2050()) {
                    var16.method5496();
                }
            }
        }
        if (var14 == -2) {
            var14 += 7;
        }
        int var38 = var9 + var14;
        if (arg1 < var7) {
            class98 var39 = (class98) arg0;
            if (var39.field1205) {
                return;
            }
            if (var39.field1217 != -1 || var39.field1196 != -1) {
                int var40 = arg0.field1277 + 15;
                method4585(arg0.field1238, arg0.field1237, var40);
                if (field659 > -1) {
                    if (var39.field1217 != -1) {
                        var38 += 25;
                        Statics.field264[var39.field1217].method6355(field659 + arg2 - 12, field742 + arg3 - var38);
                    }
                    if (var39.field1196 != -1) {
                        var38 += 25;
                        Statics.field2398[var39.field1196].method6355(field659 + arg2 - 12, field742 + arg3 - var38);
                    }
                }
            }
            if (arg1 >= 0 && field658 == 10 && field916 == var8[arg1]) {
                int var41 = arg0.field1277 + 15;
                method4585(arg0.field1238, arg0.field1237, var41);
                if (field659 > -1) {
                    int var42 = Statics.field2700[1].field4245 + var38;
                    Statics.field2700[1].method6355(field659 + arg2 - 12, field742 + arg3 - var42);
                }
            }
        } else {
            class146 var43 = ((class105) arg0).field1346;
            if (var43.field1640 != null) {
                var43 = var43.method2532();
            }
            if (var43.field1659 >= 0 && var43.field1659 < Statics.field2398.length) {
                int var44 = arg0.field1277 + 15;
                method4585(arg0.field1238, arg0.field1237, var44);
                if (field659 > -1) {
                    Statics.field2398[var43.field1659].method6355(field659 + arg2 - 12, field742 + arg3 - 30);
                }
            }
            if (field658 == 1 && field812 == field685[arg1 - var7] && field650 % 20 < 10) {
                int var45 = arg0.field1277 + 15;
                method4585(arg0.field1238, arg0.field1237, var45);
                if (field659 > -1) {
                    Statics.field2700[0].method6355(field659 + arg2 - 12, field742 + arg3 - 28);
                }
            }
        }
        if (arg0.field1250 != null && (arg1 >= var7 || !arg0.field1249 && (field818 == 4 || !arg0.field1251 && (field818 == 0 || field818 == 3 || field818 == 1 && ((class98) arg0).method1912())))) {
            int var46 = arg0.field1277;
            method4585(arg0.field1238, arg0.field1237, var46);
            if (field659 > -1 && field729 < field730) {
                field734[field729] = Statics.field3099.method4906(arg0.field1250) / 2;
                field732[field729] = Statics.field3099.field3730;
                field740[field729] = field659;
                field886[field729] = field742;
                field832[field729] = arg0.field1254;
                field736[field729] = arg0.field1255;
                field737[field729] = arg0.field1253;
                field738[field729] = arg0.field1250;
                field729++;
            }
        }
        for (int var47 = 0; var47 < 4; var47++) {
            int var48 = arg0.field1259[var47];
            int var49 = arg0.field1257[var47];
            class153 var50 = null;
            int var51 = 0;
            if (var49 >= 0) {
                if (var48 <= field650) {
                    continue;
                }
                var50 = class153.method1779(arg0.field1257[var47]);
                var51 = var50.field1732;
                if (var50 != null && var50.field1727 != null) {
                    var50 = var50.method2673();
                    if (var50 == null) {
                        arg0.field1259[var47] = -1;
                        continue;
                    }
                }
            } else if (var48 < 0) {
                continue;
            }
            int var52 = arg0.field1260[var47];
            class153 var53 = null;
            if (var52 >= 0) {
                var53 = class153.method1779(var52);
                if (var53 != null && var53.field1727 != null) {
                    var53 = var53.method2673();
                }
            }
            if (var48 - var51 <= field650) {
                if (var50 == null) {
                    arg0.field1259[var47] = -1;
                } else {
                    int var54 = arg0.field1277 / 2;
                    method4585(arg0.field1238, arg0.field1237, var54);
                    if (field659 > -1) {
                        if (var47 == 1) {
                            field742 -= 20;
                        }
                        if (var47 == 2) {
                            field659 -= 15;
                            field742 -= 10;
                        }
                        if (var47 == 3) {
                            field659 += 15;
                            field742 -= 10;
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
                        class396 var67 = null;
                        class396 var68 = null;
                        class396 var69 = null;
                        class396 var70 = null;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        class396 var80 = var50.method2675();
                        if (var80 != null) {
                            var59 = var80.field4253;
                            int var81 = var80.field4245;
                            if (var81 > var79) {
                                var79 = var81;
                            }
                            var63 = var80.field4249;
                        }
                        class396 var82 = var50.method2690();
                        if (var82 != null) {
                            var60 = var82.field4253;
                            int var83 = var82.field4245;
                            if (var83 > var79) {
                                var79 = var83;
                            }
                            var64 = var82.field4249;
                        }
                        class396 var84 = var50.method2710();
                        if (var84 != null) {
                            var61 = var84.field4253;
                            int var85 = var84.field4245;
                            if (var85 > var79) {
                                var79 = var85;
                            }
                            var65 = var84.field4249;
                        }
                        class396 var86 = var50.method2704();
                        if (var86 != null) {
                            var62 = var86.field4253;
                            int var87 = var86.field4245;
                            if (var87 > var79) {
                                var79 = var87;
                            }
                            var66 = var86.field4249;
                        }
                        if (var53 != null) {
                            var67 = var53.method2675();
                            if (var67 != null) {
                                var71 = var67.field4253;
                                int var88 = var67.field4245;
                                if (var88 > var79) {
                                    var79 = var88;
                                }
                                var75 = var67.field4249;
                            }
                            var68 = var53.method2690();
                            if (var68 != null) {
                                var72 = var68.field4253;
                                int var89 = var68.field4245;
                                if (var89 > var79) {
                                    var79 = var89;
                                }
                                var76 = var68.field4249;
                            }
                            var69 = var53.method2710();
                            if (var69 != null) {
                                var73 = var69.field4253;
                                int var90 = var69.field4245;
                                if (var90 > var79) {
                                    var79 = var90;
                                }
                                var77 = var69.field4249;
                            }
                            var70 = var53.method2704();
                            if (var70 != null) {
                                var74 = var70.field4253;
                                int var91 = var70.field4245;
                                if (var91 > var79) {
                                    var79 = var91;
                                }
                                var78 = var70.field4249;
                            }
                        }
                        class300 var92 = var50.method2679();
                        if (var92 == null) {
                            var92 = Statics.field1297;
                        }
                        class300 var93;
                        if (var53 == null) {
                            var93 = Statics.field1297;
                        } else {
                            var93 = var53.method2679();
                            if (var93 == null) {
                                var93 = Statics.field1297;
                            }
                        }
                        Object var94 = null;
                        String var95 = null;
                        boolean var96 = false;
                        int var97 = 0;
                        String var98 = var50.method2674(arg0.field1258[var47]);
                        int var99 = var92.method4906(var98);
                        if (var53 != null) {
                            var95 = var53.method2674(arg0.field1261[var47]);
                            var97 = var93.method4906(var95);
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
                        int var116 = arg0.field1259[var47] - field650;
                        int var117 = var50.field1740 - var50.field1740 * var116 / var50.field1732;
                        int var118 = var50.field1741 * var116 / var50.field1732 + -var50.field1741;
                        int var119 = field659 + arg2 - (var108 >> 1) + var117;
                        int var120 = field742 + arg3 - 12 + var118;
                        int var121 = var120;
                        int var122 = var79 + var120;
                        int var123 = var50.field1745 + var120 + 15;
                        int var124 = var123 - var92.field3726;
                        int var125 = var92.field3727 + var123;
                        if (var124 < var120) {
                            var121 = var124;
                        }
                        if (var125 > var122) {
                            var122 = var125;
                        }
                        int var126 = 0;
                        if (var53 != null) {
                            var126 = var53.field1745 + var120 + 15;
                            int var127 = var126 - var93.field3726;
                            int var128 = var93.field3727 + var126;
                            if (var127 < var121) {
                                ;
                            }
                            if (var128 > var122) {
                                ;
                            }
                        }
                        int var131 = 255;
                        if (var50.field1750 >= 0) {
                            var131 = (var116 << 8) / (var50.field1732 - var50.field1750);
                        }
                        if (var131 >= 0 && var131 < 255) {
                            if (var80 != null) {
                                var80.method6361(var103 + var119 - var63, var120, var131);
                            }
                            if (var84 != null) {
                                var84.method6361(var104 + var119 - var65, var120, var131);
                            }
                            if (var82 != null) {
                                for (int var132 = 0; var132 < var100; var132++) {
                                    var82.method6361(var60 * var132 + (var105 + var119 - var64), var120, var131);
                                }
                            }
                            if (var86 != null) {
                                var86.method6361(var109 + var119 - var66, var120, var131);
                            }
                            var92.method4892(var98, var106 + var119, var123, var50.field1746, 0, var131);
                            if (var53 != null) {
                                if (var67 != null) {
                                    var67.method6361(var110 + var119 - var75, var120, var131);
                                }
                                if (var69 != null) {
                                    var69.method6361(var111 + var119 - var77, var120, var131);
                                }
                                if (var68 != null) {
                                    for (int var133 = 0; var133 < var101; var133++) {
                                        var68.method6361(var72 * var133 + (var112 + var119 - var76), var120, var131);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method6361(var113 + var119 - var78, var120, var131);
                                }
                                var93.method4892(var95, var114 + var119, var126, var53.field1746, 0, var131);
                            }
                        } else {
                            if (var80 != null) {
                                var80.method6355(var103 + var119 - var63, var120);
                            }
                            if (var84 != null) {
                                var84.method6355(var104 + var119 - var65, var120);
                            }
                            if (var82 != null) {
                                for (int var134 = 0; var134 < var100; var134++) {
                                    var82.method6355(var60 * var134 + (var105 + var119 - var64), var120);
                                }
                            }
                            if (var86 != null) {
                                var86.method6355(var109 + var119 - var66, var120);
                            }
                            var92.method4891(var98, var106 + var119, var123, var50.field1746 | 0xFF000000, 0);
                            if (var53 != null) {
                                if (var67 != null) {
                                    var67.method6355(var110 + var119 - var75, var120);
                                }
                                if (var69 != null) {
                                    var69.method6355(var111 + var119 - var77, var120);
                                }
                                if (var68 != null) {
                                    for (int var135 = 0; var135 < var101; var135++) {
                                        var68.method6355(var72 * var135 + (var112 + var119 - var76), var120);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method6355(var113 + var119 - var78, var120);
                                }
                                var93.method4891(var95, var114 + var119, var126, var53.field1746 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jx.gc(IIIII)V")
    public static final void method4569(int arg0, int arg1, int arg2, int arg3) {
        field729 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class109.field1376;
        int[] var8 = class109.field1381;
        for (int var9 = 0; var9 < field684 + var7; var9++) {
            class100 var10;
            if (var9 < var7) {
                var10 = field830[var8[var9]];
                if (field769 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field1163 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field683[field685[var9 - var7]];
            }
            method5327(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field761 && var6 != -1) {
            method5327(Statics.field1163, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method5327(field830[field769], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field729; var11++) {
            int var12 = field740[var11];
            int var13 = field886[var11];
            int var14 = field734[var11];
            int var15 = field732[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field886[var17] - field732[var17] && var13 - var15 < field886[var17] + 2 && var12 - var14 < field740[var17] + field734[var17] && var12 + var14 > field740[var17] - field734[var17] && field886[var17] - field732[var17] < var13) {
                        var13 = field886[var17] - field732[var17];
                        var16 = true;
                    }
                }
            }
            field659 = field740[var11];
            field742 = field886[var11] = var13;
            String var18 = field738[var11];
            if (field889 == 0) {
                int var19 = 16776960;
                if (field832[var11] < 6) {
                    var19 = field878[field832[var11]];
                }
                if (field832[var11] == 6) {
                    var19 = field784 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field832[var11] == 7) {
                    var19 = field784 % 20 < 10 ? 255 : 65535;
                }
                if (field832[var11] == 8) {
                    var19 = field784 % 20 < 10 ? 45056 : 8454016;
                }
                if (field832[var11] == 9) {
                    int var20 = 150 - field737[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field832[var11] == 10) {
                    int var21 = 150 - field737[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field832[var11] == 11) {
                    int var22 = 150 - field737[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field736[var11] == 0) {
                    Statics.field3099.method4894(var18, field659 + arg0, field742 + arg1, var19, 0);
                }
                if (field736[var11] == 1) {
                    Statics.field3099.method4916(var18, field659 + arg0, field742 + arg1, var19, 0, field784);
                }
                if (field736[var11] == 2) {
                    Statics.field3099.method4949(var18, field659 + arg0, field742 + arg1, var19, 0, field784);
                }
                if (field736[var11] == 3) {
                    Statics.field3099.method4898(var18, field659 + arg0, field742 + arg1, var19, 0, field784, 150 - field737[var11]);
                }
                if (field736[var11] == 4) {
                    int var23 = (150 - field737[var11]) * (Statics.field3099.method4906(var18) + 100) / 150;
                    class392.method6263(field659 + arg0 - 50, arg1, field659 + arg0 + 50, arg1 + arg3);
                    Statics.field3099.method4891(var18, field659 + arg0 + 50 - var23, field742 + arg1, var19, 0);
                    class392.method6277(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field736[var11] == 5) {
                    int var24 = 150 - field737[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class392.method6263(arg0, field742 + arg1 - Statics.field3099.field3730 - 1, arg0 + arg2, field742 + arg1 + 5);
                    Statics.field3099.method4894(var18, field659 + arg0, field742 + arg1 + var25, var19, 0);
                    class392.method6277(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field3099.method4894(var18, field659 + arg0, field742 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ap.ga(IIIII)V")
    public static final void method189(int arg0, int arg1, int arg2, int arg3) {
        field756 = 0;
        int var4 = (Statics.field1163.field1238 >> 7) + Statics.field2512;
        int var5 = (Statics.field1163.field1237 >> 7) + Statics.field458;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field756 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field756 = 1;
        }
        if (field756 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field756 = 0;
        }
    }

    @ObfuscatedName("jm.hy(IIII)V")
    public static final void method4585(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field659 = -1;
            field742 = -1;
            return;
        }
        int var3 = method2069(arg0, arg1, Statics.field196) - arg2;
        int var4 = arg0 - Statics.field386;
        int var5 = var3 - Statics.field1138;
        int var6 = arg1 - Statics.field1348;
        int var7 = class196.field2275[Statics.field1693];
        int var8 = class196.field2286[Statics.field1693];
        int var9 = class196.field2275[Statics.field4140];
        int var10 = class196.field2286[Statics.field4140];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field659 = field907 * var11 / var15 + field905 / 2;
            field742 = field907 * var14 / var15 + field906 / 2;
        } else {
            field659 = -1;
            field742 = -1;
        }
    }

    @ObfuscatedName("dz.hw(IIII)I")
    public static final int method2069(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class90.field1119[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class90.field1128[var5][var3][var4] + class90.field1128[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class90.field1128[var5][var3][var4 + 1] + class90.field1128[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("fh.hb(III)I")
    public static int method3324(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field898 - field897) * var2 / 100 + field897;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("ac.hj(IIZI)V")
    public static final void method292(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field633 == arg0 && Statics.field1428 == arg1) {
            return;
        }
        Statics.field633 = arg0;
        Statics.field1428 = arg1;
        method140(25);
        method4386(class268.field3265, true);
        int var3 = Statics.field2512;
        int var4 = Statics.field458;
        Statics.field2512 = (arg0 - 6) * 8;
        Statics.field458 = (arg1 - 6) * 8;
        int var5 = Statics.field2512 - var3;
        int var6 = Statics.field458 - var4;
        int var7 = Statics.field2512;
        int var8 = Statics.field458;
        for (int var9 = 0; var9 < 32768; var9++) {
            class105 var10 = field683[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1273[var11] -= var5;
                    var10.field1287[var11] -= var6;
                }
                var10.field1238 -= var5 * 128;
                var10.field1237 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class98 var13 = field830[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1273[var14] -= var5;
                    var13.field1287[var14] -= var6;
                }
                var13.field1238 -= var5 * 128;
                var13.field1237 -= var6 * 128;
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
                        field860[var25][var21][var22] = field860[var25][var23][var24];
                    } else {
                        field860[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class99 var26 = (class99) field799.method4714(); var26 != null; var26 = (class99) field799.method4741()) {
            var26.field1224 -= var5;
            var26.field1227 -= var6;
            if (var26.field1224 < 0 || var26.field1227 < 0 || var26.field1224 >= 104 || var26.field1227 >= 104) {
                var26.method5496();
            }
        }
        if (field745 != 0) {
            field745 -= var5;
            field787 -= var6;
        }
        field867 = 0;
        field762 = false;
        Statics.field386 -= var5 << 7;
        Statics.field1348 -= var6 << 7;
        Statics.field1911 -= var5 << 7;
        Statics.field2522 -= var6 << 7;
        field873 = -1;
        field919.method4735();
        field908.method4735();
        for (int var27 = 0; var27 < 4; var27++) {
            field700[var27].method2910();
        }
    }

    @ObfuscatedName("gh.hg(ZI)V")
    public static final void method3784(boolean arg0) {
        method1997();
        field688.field1403++;
        if (field688.field1403 < 50 && !arg0) {
            return;
        }
        field688.field1403 = 0;
        if (field747 || field688.method2171() == null) {
            return;
        }
        class227 var1 = class227.method171(class225.field2591, field688.field1415);
        field688.method2167(var1);
        try {
            field688.method2164();
        } catch (IOException var3) {
            field747 = true;
        }
    }

    @ObfuscatedName("gz.hf(B)V")
    public static final void method3354() {
        method3784(false);
        field695 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field153.length; var1++) {
            if (Statics.field142[var1] != -1 && Statics.field153[var1] == null) {
                Statics.field153[var1] = Statics.field3108.method4468(Statics.field142[var1], 0);
                if (Statics.field153[var1] == null) {
                    var0 = false;
                    field695++;
                }
            }
            if (Statics.field207[var1] != -1 && Statics.field1022[var1] == null) {
                Statics.field1022[var1] = Statics.field3108.method4469(Statics.field207[var1], 0, Statics.field2140[var1]);
                if (Statics.field1022[var1] == null) {
                    var0 = false;
                    field695++;
                }
            }
        }
        if (!var0) {
            field699 = 1;
            return;
        }
        field697 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field153.length; var3++) {
            byte[] var4 = Statics.field1022[var3];
            if (var4 != null) {
                int var5 = (Statics.field2939[var3] >> 8) * 64 - Statics.field2512;
                int var6 = (Statics.field2939[var3] & 0xFF) * 64 - Statics.field458;
                if (field701) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class383 var9 = new class383(var4);
                int var10 = -1;
                label507: while (true) {
                    int var11 = var9.method5959();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method5979();
                            if (var16 == 0) {
                                continue label507;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method5965() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class154 var22 = class154.method175(var10);
                                if (var19 != 22 || !field642 || var22.field1772 != 0 || var22.field1770 == 1 || var22.field1795) {
                                    if (!var22.method2766()) {
                                        field697++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method5979();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method5965();
                    }
                }
            }
        }
        if (!var2) {
            field699 = 2;
            return;
        }
        if (field699 != 0) {
            method4386(class268.field3265 + class106.field1353 + class106.field1350 + 100 + "%" + class106.field1351, true);
        }
        method1997();
        Statics.field3862.method3571();
        for (int var23 = 0; var23 < 4; var23++) {
            field700[var23].method2910();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class90.field1119[var24][var25][var26] = 0;
                }
            }
        }
        method1997();
        class90.method228();
        int var27 = Statics.field153.length;
        class78.method3328();
        method3784(true);
        if (!field701) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field2939[var28] >> 8) * 64 - Statics.field2512;
                int var30 = (Statics.field2939[var28] & 0xFF) * 64 - Statics.field458;
                byte[] var31 = Statics.field153[var28];
                if (var31 != null) {
                    method1997();
                    class90.method3329(var31, var29, var30, Statics.field633 * 8 - 48, Statics.field1428 * 8 - 48, field700);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field2939[var32] >> 8) * 64 - Statics.field2512;
                int var34 = (Statics.field2939[var32] & 0xFF) * 64 - Statics.field458;
                byte[] var35 = Statics.field153[var32];
                if (var35 == null && Statics.field1428 < 800) {
                    method1997();
                    class90.method2844(var33, var34, 64, 64);
                }
            }
            method3784(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field1022[var36];
                if (var37 != null) {
                    int var38 = (Statics.field2939[var36] >> 8) * 64 - Statics.field2512;
                    int var39 = (Statics.field2939[var36] & 0xFF) * 64 - Statics.field458;
                    method1997();
                    class198 var40 = Statics.field3862;
                    class158[] var41 = field700;
                    class383 var42 = new class383(var37);
                    int var43 = -1;
                    while (true) {
                        int var44 = var42.method5959();
                        if (var44 == 0) {
                            break;
                        }
                        var43 += var44;
                        int var45 = 0;
                        while (true) {
                            int var46 = var42.method5979();
                            if (var46 == 0) {
                                break;
                            }
                            var45 += var46 - 1;
                            int var47 = var45 & 0x3F;
                            int var48 = var45 >> 6 & 0x3F;
                            int var49 = var45 >> 12;
                            int var50 = var42.method5965();
                            int var51 = var50 >> 2;
                            int var52 = var50 & 0x3;
                            int var53 = var38 + var48;
                            int var54 = var39 + var47;
                            if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                int var55 = var49;
                                if ((class90.field1119[1][var53][var54] & 0x2) == 2) {
                                    var55 = var49 - 1;
                                }
                                class158 var56 = null;
                                if (var55 >= 0) {
                                    var56 = var41[var55];
                                }
                                class90.method66(var49, var53, var54, var43, var52, var51, var40, var56);
                            }
                        }
                    }
                }
            }
        }
        if (field701) {
            for (int var57 = 0; var57 < 4; var57++) {
                method1997();
                for (int var58 = 0; var58 < 13; var58++) {
                    for (int var59 = 0; var59 < 13; var59++) {
                        boolean var60 = false;
                        int var61 = field702[var57][var58][var59];
                        if (var61 != -1) {
                            int var62 = var61 >> 24 & 0x3;
                            int var63 = var61 >> 1 & 0x3;
                            int var64 = var61 >> 14 & 0x3FF;
                            int var65 = var61 >> 3 & 0x7FF;
                            int var66 = (var64 / 8 << 8) + var65 / 8;
                            for (int var67 = 0; var67 < Statics.field2939.length; var67++) {
                                if (Statics.field2939[var67] == var66 && Statics.field153[var67] != null) {
                                    byte[] var68 = Statics.field153[var67];
                                    int var69 = var58 * 8;
                                    int var70 = var59 * 8;
                                    int var71 = (var64 & 0x7) * 8;
                                    int var72 = (var65 & 0x7) * 8;
                                    class158[] var73 = field700;
                                    for (int var74 = 0; var74 < 8; var74++) {
                                        for (int var75 = 0; var75 < 8; var75++) {
                                            if (var69 + var74 > 0 && var69 + var74 < 103 && var70 + var75 > 0 && var70 + var75 < 103) {
                                                var73[var57].field1903[var69 + var74][var70 + var75] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class383 var76 = new class383(var68);
                                    for (int var77 = 0; var77 < 4; var77++) {
                                        for (int var78 = 0; var78 < 64; var78++) {
                                            for (int var79 = 0; var79 < 64; var79++) {
                                                if (var62 == var77 && var78 >= var71 && var78 < var71 + 8 && var79 >= var72 && var79 < var72 + 8) {
                                                    int var83 = var78 & 0x7;
                                                    int var84 = var79 & 0x7;
                                                    int var86 = var63 & 0x3;
                                                    int var87;
                                                    if (var86 == 0) {
                                                        var87 = var83;
                                                    } else if (var86 == 1) {
                                                        var87 = var84;
                                                    } else if (var86 == 2) {
                                                        var87 = 7 - var83;
                                                    } else {
                                                        var87 = 7 - var84;
                                                    }
                                                    class90.method3362(var76, var57, var69 + var87, var70 + class244.method63(var78 & 0x7, var79 & 0x7, var63), 0, 0, var63);
                                                } else {
                                                    class90.method3362(var76, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var60 = true;
                                    break;
                                }
                            }
                        }
                        if (!var60) {
                            class90.method1908(var57, var58 * 8, var59 * 8);
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < 13; var88++) {
                for (int var89 = 0; var89 < 13; var89++) {
                    int var90 = field702[0][var88][var89];
                    if (var90 == -1) {
                        class90.method2844(var88 * 8, var89 * 8, 8, 8);
                    }
                }
            }
            method3784(true);
            for (int var91 = 0; var91 < 4; var91++) {
                method1997();
                for (int var92 = 0; var92 < 13; var92++) {
                    for (int var93 = 0; var93 < 13; var93++) {
                        int var94 = field702[var91][var92][var93];
                        if (var94 != -1) {
                            int var95 = var94 >> 24 & 0x3;
                            int var96 = var94 >> 1 & 0x3;
                            int var97 = var94 >> 14 & 0x3FF;
                            int var98 = var94 >> 3 & 0x7FF;
                            int var99 = (var97 / 8 << 8) + var98 / 8;
                            for (int var100 = 0; var100 < Statics.field2939.length; var100++) {
                                if (Statics.field2939[var100] == var99 && Statics.field1022[var100] != null) {
                                    class90.method5730(Statics.field1022[var100], var91, var92 * 8, var93 * 8, var95, (var97 & 0x7) * 8, (var98 & 0x7) * 8, var96, Statics.field3862, field700);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method3784(true);
        method1997();
        class90.method154(Statics.field3862, field700);
        method3784(true);
        int var101 = class90.field1120;
        if (var101 > Statics.field196) {
            var101 = Statics.field196;
        }
        if (var101 < Statics.field196 - 1) {
            int var102 = Statics.field196 - 1;
        }
        if (field642) {
            Statics.field3862.method3661(class90.field1120);
        } else {
            Statics.field3862.method3661(0);
        }
        for (int var103 = 0; var103 < 104; var103++) {
            for (int var104 = 0; var104 < 104; var104++) {
                method123(var103, var104);
            }
        }
        method1997();
        for (class99 var105 = (class99) field799.method4714(); var105 != null; var105 = (class99) field799.method4741()) {
            if (var105.field1235 == -1) {
                var105.field1234 = 0;
                method2230(var105);
            } else {
                var105.method5496();
            }
        }
        class154.field1769.method3957();
        if (Statics.field204.method516()) {
            class227 var106 = class227.method171(class225.field2584, field688.field1415);
            var106.field2693.method5951(1057001181);
            field688.method2167(var106);
        }
        if (!field701) {
            int var107 = (Statics.field633 - 6) / 8;
            int var108 = (Statics.field633 + 6) / 8;
            int var109 = (Statics.field1428 - 6) / 8;
            int var110 = (Statics.field1428 + 6) / 8;
            for (int var111 = var107 - 1; var111 <= var108 + 1; var111++) {
                for (int var112 = var109 - 1; var112 <= var110 + 1; var112++) {
                    if (var111 < var107 || var111 > var108 || var112 < var109 || var112 > var110) {
                        Statics.field3108.method4490("m" + var111 + "_" + var112);
                        Statics.field3108.method4490("l" + var111 + "_" + var112);
                    }
                }
            }
        }
        method140(30);
        method1997();
        class90.method229();
        class227 var113 = class227.method171(class225.field2670, field688.field1415);
        field688.method2167(var113);
        Statics.field339.method2285();
        for (int var114 = 0; var114 < 32; var114++) {
            field363[var114] = 0L;
        }
        for (int var115 = 0; var115 < 32; var115++) {
            field342[var115] = 0L;
        }
        Statics.field3194 = 0;
    }

    @ObfuscatedName("cm.ht(IB)V")
    public static final void method1716(int arg0) {
        int[] var1 = Statics.field366.field4247;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class90.field1119[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field3862.method3699(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class90.field1119[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3862.method3699(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field366.method6346();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class90.field1119[arg0][var10][var9] & 0x18) == 0) {
                    method4233(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class90.field1119[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method4233(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field874 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field3862.method3599(Statics.field196, var11, var12);
                if (var13 != 0L) {
                    int var15 = Statics.method1888(var13);
                    int var16 = class154.method175(var15).field1767;
                    if (var16 >= 0 && class139.method52(var16).field1562) {
                        field877[field874] = class139.method52(var16).method2400(false);
                        field875[field874] = var11;
                        field876[field874] = var12;
                        field874++;
                    }
                }
            }
        }
        Statics.field222.method6316();
    }

    @ObfuscatedName("ii.hm(IIIIII)V")
    public static final void method4233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3862.method3596(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3862.method3600(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field366.field4247;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = Statics.method1888(var5);
            class154 var17 = class154.method175(var16);
            if (var17.field1782 == -1) {
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
                class395 var18 = Statics.field88[var17.field1782];
                if (var18 != null) {
                    int var19 = (var17.field1791 * 4 - var18.field4243) / 2;
                    int var20 = (var17.field1803 * 4 - var18.field4237) / 2;
                    var18.method6324(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field1803) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field3862.method3664(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field3862.method3600(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = Statics.method1888(var21);
            class154 var27 = class154.method175(var26);
            if (var27.field1782 != -1) {
                class395 var28 = Statics.field88[var27.field1782];
                if (var28 != null) {
                    int var29 = (var27.field1791 * 4 - var28.field4243) / 2;
                    int var30 = (var27.field1803 * 4 - var28.field4237) / 2;
                    var28.method6324(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field1803) * 4 + 48 + var30);
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
                int[] var35 = Statics.field366.field4247;
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
        long var37 = Statics.field3862.method3599(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = Statics.method1888(var37);
        class154 var40 = class154.method175(var39);
        if (var40.field1782 == -1) {
            return;
        }
        class395 var41 = Statics.field88[var40.field1782];
        if (var41 != null) {
            int var42 = (var40.field1791 * 4 - var41.field4243) / 2;
            int var43 = (var40.field1803 * 4 - var41.field4237) / 2;
            var41.method6324(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field1803) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.hh(Lds;I)Z")
    public final boolean method1029(class112 arg0) {
        class329 var2 = arg0.method2171();
        class382 var3 = arg0.field1406;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1407 == null) {
                if (arg0.field1409) {
                    if (!var2.method2342(1)) {
                        return false;
                    }
                    var2.method2352(arg0.field1406.field4155, 0, 1);
                    arg0.field1410 = 0;
                    arg0.field1409 = false;
                }
                var3.field4158 = 0;
                if (var3.method5928()) {
                    if (!var2.method2342(1)) {
                        return false;
                    }
                    var2.method2352(arg0.field1406.field4155, 1, 1);
                    arg0.field1410 = 0;
                }
                arg0.field1409 = true;
                class228[] var4 = class228.method177();
                int var5 = var3.method5937();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4158);
                }
                arg0.field1407 = var4[var5];
                arg0.field1411 = arg0.field1407.field2797;
            }
            if (arg0.field1411 == -1) {
                if (!var2.method2342(1)) {
                    return false;
                }
                arg0.method2171().method2352(var3.field4155, 0, 1);
                arg0.field1411 = var3.field4155[0] & 0xFF;
            }
            if (arg0.field1411 == -2) {
                if (!var2.method2342(2)) {
                    return false;
                }
                arg0.method2171().method2352(var3.field4155, 0, 2);
                var3.field4158 = 0;
                arg0.field1411 = var3.method5967();
            }
            if (!var2.method2342(arg0.field1411)) {
                return false;
            }
            var3.field4158 = 0;
            var2.method2352(var3.field4155, 0, arg0.field1411);
            arg0.field1410 = 0;
            field693.method5129();
            arg0.field1401 = arg0.field1413;
            arg0.field1413 = arg0.field1412;
            arg0.field1412 = arg0.field1407;
            if (class228.field2733 == arg0.field1407) {
                int var6 = var3.method5967();
                int var7 = var3.method5970();
                int var8 = var6 >> 10 & 0x1F;
                int var9 = var6 >> 5 & 0x1F;
                int var10 = var6 & 0x1F;
                int var11 = (var10 << 3) + (var8 << 19) + (var9 << 11);
                class247 var12 = class247.method3749(var7);
                if (var12.field3103 != var11) {
                    var12.field3103 = var11;
                    method3353(var12);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2735 == arg0.field1407) {
                boolean var13 = var3.method5954();
                if (!var13) {
                    Statics.field1445 = null;
                } else if (Statics.field1445 == null) {
                    Statics.field1445 = new class286();
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2758 == arg0.field1407) {
                Statics.field597 = var3.method5965();
                Statics.field2388 = var3.method5965();
                while (var3.field4158 < arg0.field1411) {
                    int var14 = var3.method5965();
                    class226 var15 = class226.method4279()[var14];
                    method3489(var15);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2751 == arg0.field1407) {
                method3489(class226.field2688);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2782 == arg0.field1407) {
                String var16 = var3.method5974();
                Object[] var17 = new Object[var16.length() + 1];
                for (int var18 = var16.length() - 1; var18 >= 0; var18--) {
                    if (var16.charAt(var18) == 's') {
                        var17[var18 + 1] = var3.method5974();
                    } else {
                        var17[var18 + 1] = Integer.valueOf(var3.method5970());
                    }
                }
                var17[0] = Integer.valueOf(var3.method5970());
                class96 var19 = new class96();
                var19.field1178 = var17;
                class79.method2186(var19);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2760 == arg0.field1407) {
                field658 = var3.method5965();
                if (field658 == 1) {
                    field812 = var3.method5967();
                }
                if (field658 >= 2 && field658 <= 6) {
                    if (field658 == 2) {
                        field716 = 64;
                        field665 = 64;
                    }
                    if (field658 == 3) {
                        field716 = 0;
                        field665 = 64;
                    }
                    if (field658 == 4) {
                        field716 = 128;
                        field665 = 64;
                    }
                    if (field658 == 5) {
                        field716 = 64;
                        field665 = 0;
                    }
                    if (field658 == 6) {
                        field716 = 64;
                        field665 = 128;
                    }
                    field658 = 2;
                    field661 = var3.method5967();
                    field662 = var3.method5967();
                    field663 = var3.method5965();
                }
                if (field658 == 10) {
                    field916 = var3.method5967();
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2712 == arg0.field1407) {
                method3489(class226.field2684);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2731 == arg0.field1407) {
                Statics.field255 = new class340(Statics.field2505);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2778 == arg0.field1407) {
                int var20 = var3.method5965();
                method148(var20);
                arg0.field1407 = null;
                return false;
            }
            if (class228.field2753 == arg0.field1407) {
                int var21 = var3.method5965();
                if (var3.method5965() == 0) {
                    field862[var21] = new class284();
                    var3.field4158 += 18;
                } else {
                    var3.field4158--;
                    field862[var21] = new class284(var3, false);
                }
                field841 = field827;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2742 == arg0.field1407) {
                Statics.field1179 = class334.method2280(var3.method5965());
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2747 == arg0.field1407) {
                method3489(class226.field2682);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2705 == arg0.field1407) {
                int var22 = var3.method5967();
                int var23 = var3.method5965();
                int var24 = var3.method5967();
                method5381(var22, var23, var24);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2718 == arg0.field1407) {
                int var25 = var3.method5970();
                int var26 = var3.method5967();
                class247 var27 = class247.method3749(var25);
                if (var27.field3002 != 2 || var27.field3003 != var26) {
                    var27.field3002 = 2;
                    var27.field3003 = var26;
                    method3353(var27);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2789 == arg0.field1407) {
                field762 = true;
                Statics.field3887 = var3.method5965();
                Statics.field48 = var3.method5965();
                Statics.field154 = var3.method5967();
                Statics.field3813 = var3.method5965();
                Statics.field469 = var3.method5965();
                if (Statics.field469 >= 100) {
                    int var28 = Statics.field3887 * 128 + 64;
                    int var29 = Statics.field48 * 128 + 64;
                    int var30 = method2069(var28, var29, Statics.field196) - Statics.field154;
                    int var31 = var28 - Statics.field386;
                    int var32 = var30 - Statics.field1138;
                    int var33 = var29 - Statics.field1348;
                    int var34 = (int) Math.sqrt((double) (var31 * var31 + var33 * var33));
                    Statics.field1693 = (int) (Math.atan2((double) var32, (double) var34) * 325.949D) & 0x7FF;
                    Statics.field4140 = (int) (Math.atan2((double) var31, (double) var33) * -325.949D) & 0x7FF;
                    if (Statics.field1693 < 128) {
                        Statics.field1693 = 128;
                    }
                    if (Statics.field1693 > 383) {
                        Statics.field1693 = 383;
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2777 == arg0.field1407) {
                int var35 = var3.method6012();
                int var36 = var3.method6125();
                class247 var37 = class247.method3749(var35);
                if (var37.field3006 != var36 || var36 == -1) {
                    var37.field3006 = var36;
                    var37.field2974 = 0;
                    var37.field3090 = 0;
                    method3353(var37);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2722 == arg0.field1407) {
                method3489(class226.field2690);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2710 == arg0.field1407) {
                method3489(class226.field2687);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2715 == arg0.field1407) {
                int var38 = var3.method5965();
                method135(var38);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2739 == arg0.field1407) {
                if (Statics.field255 == null) {
                    Statics.field255 = new class340(Statics.field2505);
                }
                class391 var39 = Statics.field2505.method5460(var3);
                Statics.field255.field3922.method5791(var39.field4220, var39.field4219);
                field912[++field853 - 1 & 0x1F] = var39.field4220;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2736 == arg0.field1407) {
                Statics.field1508.method1508(var3, arg0.field1411);
                field837 = field827;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2702 == arg0.field1407) {
                field762 = true;
                Statics.field1545 = var3.method5965();
                Statics.field3848 = var3.method5965();
                Statics.field3120 = var3.method5967();
                Statics.field265 = var3.method5965();
                Statics.field157 = var3.method5965();
                if (Statics.field157 >= 100) {
                    Statics.field386 = Statics.field1545 * 128 + 64;
                    Statics.field1348 = Statics.field3848 * 128 + 64;
                    Statics.field1138 = method2069(Statics.field386, Statics.field1348, Statics.field196) - Statics.field3120;
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2768 == arg0.field1407) {
                method688(true, var3);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2773 == arg0.field1407) {
                field745 = var3.method5965();
                if (field745 == 255) {
                    field745 = 0;
                }
                field787 = var3.method5965();
                if (field787 == 255) {
                    field787 = 0;
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2744 == arg0.field1407) {
                int var40 = var3.method6013();
                int var41 = var3.method6013();
                class95 var42 = (class95) field803.method5766((long) var41);
                class95 var43 = (class95) field803.method5766((long) var40);
                if (var43 != null) {
                    method335(var43, var42 == null || var42.field1164 != var43.field1164);
                }
                if (var42 != null) {
                    var42.method5496();
                    field803.method5768(var42, (long) var40);
                }
                class247 var44 = class247.method3749(var41);
                if (var44 != null) {
                    method3353(var44);
                }
                class247 var45 = class247.method3749(var40);
                if (var45 != null) {
                    method3353(var45);
                    method5145(Statics.field2951[var45.field2959 >>> 16], var45, true);
                }
                if (field637 != -1) {
                    method1737(field637, 1);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2730 == arg0.field1407) {
                method5200(var3.method5974());
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2737 == arg0.field1407) {
                int var46 = var3.method5970();
                class95 var47 = (class95) field803.method5766((long) var46);
                if (var47 != null) {
                    method335(var47, true);
                }
                if (field808 != null) {
                    method3353(field808);
                    field808 = null;
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2723 == arg0.field1407) {
                if (field637 != -1) {
                    method1737(field637, 0);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2776 == arg0.field1407) {
                int var48 = arg0.field1411 + var3.field4158;
                int var49 = var3.method5967();
                int var50 = var3.method5967();
                if (field637 != var49) {
                    field637 = var49;
                    this.method1033(false);
                    method170(field637);
                    Statics.method3479(field637);
                    for (int var51 = 0; var51 < 100; var51++) {
                        field720[var51] = true;
                    }
                }
                while (var50-- > 0) {
                    int var52 = var3.method5970();
                    int var53 = var3.method5967();
                    int var54 = var3.method5965();
                    class95 var55 = (class95) field803.method5766((long) var52);
                    if (var55 != null && var55.field1164 != var53) {
                        method335(var55, true);
                        var55 = null;
                    }
                    if (var55 == null) {
                        var55 = method152(var52, var53, var54);
                    }
                    var55.field1166 = true;
                }
                for (class95 var56 = (class95) field803.method5774(); var56 != null; var56 = (class95) field803.method5770()) {
                    if (var56.field1166) {
                        var56.field1166 = false;
                    } else {
                        method335(var56, true);
                    }
                }
                field848 = new class362(512);
                while (var3.field4158 < var48) {
                    int var57 = var3.method5970();
                    int var58 = var3.method5967();
                    int var59 = var3.method5967();
                    int var60 = var3.method5970();
                    for (int var61 = var58; var61 <= var59; var61++) {
                        long var62 = ((long) var57 << 32) + (long) var61;
                        field848.method5768(new class351(var60), var62);
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2706 == arg0.field1407) {
                boolean var64 = var3.method5948() == 1;
                int var65 = var3.method5997();
                class247 var66 = class247.method3749(var65);
                if (var66.field2979 != var64) {
                    var66.field2979 = var64;
                    method3353(var66);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2752 == arg0.field1407) {
                Statics.field255 = null;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2786 == arg0.field1407) {
                String var67 = var3.method5974();
                long var68 = var3.method5971();
                long var70 = (long) var3.method5967();
                long var72 = (long) var3.method5969();
                class270 var74 = (class270) class289.method2163(class270.method5880(), var3.method5965());
                long var75 = (var70 << 32) + var72;
                boolean var77 = false;
                for (int var78 = 0; var78 < 100; var78++) {
                    if (field865[var78] == var75) {
                        var77 = true;
                        break;
                    }
                }
                if (var74.field3553 && Statics.field1508.method1512(new class328(var67, Statics.field2039))) {
                    var77 = true;
                }
                if (!var77 && field756 == 0) {
                    field865[field866] = var75;
                    field866 = (field866 + 1) % 100;
                    String var79 = class301.method4890(class304.method334(class250.method4183(var3)));
                    if (var74.field3551 == -1) {
                        class111.method48(9, var67, var79, class306.method4398(var68));
                    } else {
                        class111.method48(9, class106.method1795(var74.field3551) + var67, var79, class306.method4398(var68));
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2771 == arg0.field1407) {
                method3489(class226.field2686);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2780 == arg0.field1407) {
                String var80 = var3.method5974();
                int var81 = var3.method6013();
                class247 var82 = class247.method3749(var81);
                if (!var80.equals(var82.field2994)) {
                    var82.field2994 = var80;
                    method3353(var82);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2788 == arg0.field1407) {
                int var83 = var3.method6002();
                int var84 = var3.method5997();
                class247 var85 = class247.method3749(var84);
                if (var85.field3002 != 1 || var85.field3003 != var83) {
                    var85.field3002 = 1;
                    var85.field3003 = var83;
                    method3353(var85);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2707 == arg0.field1407) {
                int var86 = var3.method5970();
                if (field724 != var86) {
                    field724 = var86;
                    method1812();
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2779 == arg0.field1407) {
                method55();
                arg0.field1407 = null;
                return false;
            }
            if (class228.field2738 == arg0.field1407) {
                class76 var87 = new class76();
                var87.field929 = var3.method5974();
                var87.field938 = var3.method5967();
                int var88 = var3.method5970();
                var87.field934 = var88;
                method140(45);
                var2.method2357();
                Object var89 = null;
                class84.method6(var87);
                arg0.field1407 = null;
                return false;
            }
            if (class228.field2729 == arg0.field1407) {
                field657 = var3.method5967() * 30;
                field660 = field827;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2766 == arg0.field1407) {
                byte[] var90 = new byte[arg0.field1411];
                var3.method5920(var90, 0, var90.length);
                class383 var91 = new class383(var90);
                String var92 = var91.method5974();
                class45.method2094(var92, true, false);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2740 == arg0.field1407) {
                method2278();
                byte var93 = var3.method5966();
                if (arg0.field1411 == 1) {
                    if (var93 >= 0) {
                        field735[var93] = null;
                    } else {
                        Statics.field1634 = null;
                    }
                    arg0.field1407 = null;
                    return true;
                }
                if (var93 >= 0) {
                    field735[var93] = new class12(var3);
                } else {
                    Statics.field1634 = new class12(var3);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2725 == arg0.field1407) {
                int var94 = var3.method5997();
                int var95 = var3.method6002();
                class247 var96 = class247.method3749(var94);
                if (var96 != null && var96.field2961 == 0) {
                    if (var95 > var96.field2983 - var96.field2975) {
                        var95 = var96.field2983 - var96.field2975;
                    }
                    if (var95 < 0) {
                        var95 = 0;
                    }
                    if (var96.field2981 != var95) {
                        var96.field2981 = var95;
                        method3353(var96);
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2791 == arg0.field1407) {
                for (int var97 = 0; var97 < class242.field2918.length; var97++) {
                    if (class242.field2919[var97] != class242.field2918[var97]) {
                        class242.field2918[var97] = class242.field2919[var97];
                        method997(var97);
                        field828[++field664 - 1 & 0x1F] = var97;
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2711 == arg0.field1407) {
                class70.method4247(var3, arg0.field1411);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2793 == arg0.field1407) {
                int var98 = var3.method5970();
                int var99 = var3.method5967();
                if (var98 < -70000) {
                    var99 += 32768;
                }
                class247 var100;
                if (var98 >= 0) {
                    var100 = class247.method3749(var98);
                } else {
                    var100 = null;
                }
                while (var3.field4158 < arg0.field1411) {
                    int var101 = var3.method5979();
                    int var102 = var3.method5967();
                    int var103 = 0;
                    if (var102 != 0) {
                        var103 = var3.method5965();
                        if (var103 == 255) {
                            var103 = var3.method5970();
                        }
                    }
                    if (var100 != null && var101 >= 0 && var101 < var100.field3085.length) {
                        var100.field3085[var101] = var102;
                        var100.field3086[var101] = var103;
                    }
                    class93.method40(var99, var101, var102 - 1, var103);
                }
                if (var100 != null) {
                    method3353(var100);
                }
                method3287();
                field883[++field831 - 1 & 0x1F] = var99 & 0x7FFF;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2781 == arg0.field1407) {
                Statics.method5451(false, arg0.field1406);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2727 == arg0.field1407) {
                class109.method1564(var3, arg0.field1411);
                method1578();
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2770 == arg0.field1407) {
                method3489(class226.field2681);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2761 == arg0.field1407) {
                method3287();
                field899 = var3.method5965();
                field660 = field827;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2719 == arg0.field1407) {
                int var104 = var3.method5967();
                if (var104 == 65535) {
                    var104 = -1;
                }
                int var105 = var3.method6012();
                int var106 = var3.method6004();
                if (var106 == 65535) {
                    var106 = -1;
                }
                int var107 = var3.method5997();
                for (int var108 = var104; var108 <= var106; var108++) {
                    long var109 = ((long) var107 << 32) + (long) var108;
                    class352 var111 = field848.method5766(var109);
                    if (var111 != null) {
                        var111.method5496();
                    }
                    field848.method5768(new class351(var105), var109);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2765 == arg0.field1407) {
                int var112 = var3.method5970();
                int var113 = var3.method5970();
                int var114 = class47.method339();
                class227 var115 = class227.method171(class225.field2635, field688.field1415);
                var115.field2693.method6010(var112);
                var115.field2693.method5951(var113);
                var115.field2693.method5980(field338);
                var115.field2693.method5983(var114);
                field688.method2167(var115);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2787 == arg0.field1407) {
                Statics.method5451(true, arg0.field1406);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2713 == arg0.field1407) {
                method3489(class226.field2683);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2728 == arg0.field1407) {
                boolean var116 = var3.method5965() == 1;
                if (var116) {
                    Statics.field3100 = class380.method2744() - var3.method5971();
                    Statics.field1463 = new class277(var3, true);
                } else {
                    Statics.field1463 = null;
                }
                field749 = field827;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2790 == arg0.field1407) {
                field762 = false;
                for (int var117 = 0; var117 < 5; var117++) {
                    field694[var117] = false;
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2754 == arg0.field1407) {
                int var118 = var3.method5997();
                int var119 = var3.method6013();
                int var120 = var3.method6003();
                if (var120 == 65535) {
                    var120 = -1;
                }
                class247 var121 = class247.method3749(var119);
                if (var121.field2958) {
                    var121.field3087 = var120;
                    var121.field3019 = var118;
                    class155 var123 = class155.method4399(var120);
                    var121.field3000 = var123.field1841;
                    var121.field3011 = var123.field1822;
                    var121.field2995 = var123.field1823;
                    var121.field3008 = var123.field1824;
                    var121.field3009 = var123.field1825;
                    var121.field3063 = var123.field1821;
                    if (var123.field1813 == 1) {
                        var121.field3018 = 1;
                    } else {
                        var121.field3018 = 2;
                    }
                    if (var121.field3014 > 0) {
                        var121.field3063 = var121.field3063 * 32 / var121.field3014;
                    } else if (var121.field2970 > 0) {
                        var121.field3063 = var121.field3063 * 32 / var121.field2970;
                    }
                    method3353(var121);
                } else if (var120 == -1) {
                    var121.field3002 = 0;
                    arg0.field1407 = null;
                    return true;
                } else {
                    class155 var122 = class155.method4399(var120);
                    var121.field3002 = 4;
                    var121.field3003 = var120;
                    var121.field3000 = var122.field1841;
                    var121.field3011 = var122.field1822;
                    var121.field3063 = var122.field1821 * 100 / var118;
                    method3353(var121);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2795 == arg0.field1407) {
                field880 = var3.method5965();
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2746 == arg0.field1407) {
                String var124 = var3.method5974();
                String var125 = class301.method4890(class304.method334(class250.method4183(var3)));
                class111.method1459(6, var124, var125);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2720 == arg0.field1407) {
                byte var126 = var3.method5966();
                long var127 = (long) var3.method5967();
                long var129 = (long) var3.method5969();
                long var131 = (var127 << 32) + var129;
                boolean var133 = false;
                class4 var134 = var126 >= 0 ? field872[var126] : Statics.field631;
                if (var134 == null) {
                    var133 = true;
                } else {
                    for (int var135 = 0; var135 < 100; var135++) {
                        if (field865[var135] == var131) {
                            var133 = true;
                            break;
                        }
                    }
                }
                if (!var133) {
                    field865[field866] = var131;
                    field866 = (field866 + 1) % 100;
                    String var136 = class250.method4183(var3);
                    int var137 = var126 >= 0 ? 43 : 46;
                    class111.method48(var137, "", var136, var134.field32);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2709 == arg0.field1407) {
                Statics.field2388 = var3.method5994();
                Statics.field597 = var3.method5948();
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2763 == arg0.field1407) {
                int var138 = var3.method6002();
                int var139 = var3.method6004();
                int var140 = var3.method6003();
                int var141 = var3.method5997();
                class247 var142 = class247.method3749(var141);
                if (var142.field3000 != var138 || var142.field3011 != var139 || var142.field3063 != var140) {
                    var142.field3000 = var138;
                    var142.field3011 = var139;
                    var142.field3063 = var140;
                    method3353(var142);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2762 == arg0.field1407) {
                int var143 = var3.method6013();
                class247 var144 = class247.method3749(var143);
                var144.field3002 = 3;
                var144.field3003 = Statics.field1163.field1194.method4256();
                method3353(var144);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2764 == arg0.field1407) {
                int var145 = var3.method5979();
                boolean var146 = var3.method5965() == 1;
                String var147 = "";
                boolean var148 = false;
                if (var146) {
                    var147 = var3.method5974();
                    if (Statics.field1508.method1512(new class328(var147, Statics.field2039))) {
                        var148 = true;
                    }
                }
                String var149 = var3.method5974();
                if (!var148) {
                    class111.method1459(var145, var147, var149);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2794 == arg0.field1407) {
                method3287();
                field767 = var3.method6102();
                field660 = field827;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2792 == arg0.field1407) {
                field818 = var3.method5965();
                field863 = var3.method5948();
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2785 == arg0.field1407) {
                var3.field4158 += 28;
                if (var3.method5990()) {
                    method4288(var3, var3.field4158 - 28);
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2741 == arg0.field1407) {
                int var150 = var3.method5967();
                if (var150 == 65535) {
                    var150 = -1;
                }
                method190(var150);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2726 == arg0.field1407) {
                int var151 = var3.method6003();
                if (var151 == 65535) {
                    var151 = -1;
                }
                int var152 = var3.method6009();
                method4603(var151, var152);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2755 == arg0.field1407) {
                String var153 = var3.method5974();
                int var154 = var3.method5948();
                int var155 = var3.method6070();
                if (var154 >= 1 && var154 <= 8) {
                    if (var153.equalsIgnoreCase(class268.field3242)) {
                        var153 = null;
                    }
                    field766[var154 - 1] = var153;
                    field672[var154 - 1] = var155 == 0;
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2749 == arg0.field1407) {
                int var156 = var3.method5965();
                int var157 = var3.method5965();
                int var158 = var3.method5965();
                int var159 = var3.method5965();
                field694[var156] = true;
                field891[var156] = var157;
                field892[var156] = var158;
                field893[var156] = var159;
                field894[var156] = 0;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2784 == arg0.field1407) {
                Statics.field597 = var3.method5965();
                Statics.field2388 = var3.method5965();
                for (int var160 = Statics.field2388; var160 < Statics.field2388 + 8; var160++) {
                    for (int var161 = Statics.field597; var161 < Statics.field597 + 8; var161++) {
                        if (field860[Statics.field196][var160][var161] != null) {
                            field860[Statics.field196][var160][var161] = null;
                            method123(var160, var161);
                        }
                    }
                }
                for (class99 var162 = (class99) field799.method4714(); var162 != null; var162 = (class99) field799.method4741()) {
                    if (var162.field1224 >= Statics.field2388 && var162.field1224 < Statics.field2388 + 8 && var162.field1227 >= Statics.field597 && var162.field1227 < Statics.field597 + 8 && Statics.field196 == var162.field1229) {
                        var162.field1235 = 0;
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2724 == arg0.field1407) {
                for (int var163 = 0; var163 < field830.length; var163++) {
                    if (field830[var163] != null) {
                        field830[var163].field1269 = -1;
                    }
                }
                for (int var164 = 0; var164 < field683.length; var164++) {
                    if (field683[var164] != null) {
                        field683[var164].field1269 = -1;
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2716 == arg0.field1407) {
                int var165 = var3.method6012();
                class247 var166 = class247.method3749(var165);
                for (int var167 = 0; var167 < var166.field3085.length; var167++) {
                    var166.field3085[var167] = -1;
                    var166.field3085[var167] = 0;
                }
                method3353(var166);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2775 == arg0.field1407) {
                method3287();
                int var168 = var3.method5994();
                int var169 = var3.method5948();
                int var170 = var3.method6013();
                field776[var169] = var170;
                field774[var169] = var168;
                field775[var169] = 1;
                for (int var171 = 0; var171 < 98; var171++) {
                    if (var170 >= class257.field3169[var171]) {
                        field775[var169] = var171 + 2;
                    }
                }
                field675[++field833 - 1 & 0x1F] = var169;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2783 == arg0.field1407) {
                Statics.field1508.method1515();
                field837 = field827;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2748 == arg0.field1407) {
                int var172 = var3.method6013();
                int var173 = var3.method6004();
                int var174 = var3.method6004();
                class247 var175 = class247.method3749(var172);
                var175.field3015 = (var173 << 16) + var174;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2732 == arg0.field1407) {
                int var176 = var3.method6013();
                int var177 = var3.method5967();
                class242.field2919[var177] = var176;
                if (class242.field2918[var177] != var176) {
                    class242.field2918[var177] = var176;
                }
                method997(var177);
                field828[++field664 - 1 & 0x1F] = var177;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2772 == arg0.field1407) {
                int var178 = var3.method5970();
                int var179 = var3.method5967();
                if (var178 < -70000) {
                    var179 += 32768;
                }
                class247 var180;
                if (var178 >= 0) {
                    var180 = class247.method3749(var178);
                } else {
                    var180 = null;
                }
                if (var180 != null) {
                    for (int var181 = 0; var181 < var180.field3085.length; var181++) {
                        var180.field3085[var181] = 0;
                        var180.field3086[var181] = 0;
                    }
                }
                class93.method1013(var179);
                int var182 = var3.method5967();
                for (int var183 = 0; var183 < var182; var183++) {
                    int var184 = var3.method6003();
                    int var185 = var3.method5994();
                    if (var185 == 255) {
                        var185 = var3.method6012();
                    }
                    if (var180 != null && var183 < var180.field3085.length) {
                        var180.field3085[var183] = var184;
                        var180.field3086[var183] = var185;
                    }
                    class93.method40(var179, var183, var184 - 1, var185);
                }
                if (var180 != null) {
                    method3353(var180);
                }
                method3287();
                field883[++field831 - 1 & 0x1F] = var179 & 0x7FFF;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2757 == arg0.field1407) {
                int var186 = var3.method6003();
                Statics.method1758(var186);
                field883[++field831 - 1 & 0x1F] = var186 & 0x7FFF;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2721 == arg0.field1407) {
                if (Statics.field1987 != null) {
                    Statics.field1987.method5173(var3);
                }
                method2914();
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2756 == arg0.field1407) {
                for (int var187 = 0; var187 < Statics.field1544; var187++) {
                    class138 var188 = class138.method136(var187);
                    if (var188 != null) {
                        class242.field2919[var187] = 0;
                        class242.field2918[var187] = 0;
                    }
                }
                method3287();
                field664 += 32;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2708 == arg0.field1407) {
                method688(false, var3);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2703 == arg0.field1407) {
                int var189 = var3.method5967();
                byte var190 = var3.method5966();
                class242.field2919[var189] = var190;
                if (class242.field2918[var189] != var190) {
                    class242.field2918[var189] = var190;
                }
                method997(var189);
                field828[++field664 - 1 & 0x1F] = var189;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2769 == arg0.field1407) {
                Statics.field1508.field946.method5147(var3, arg0.field1411);
                method1909();
                field837 = field827;
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2745 == arg0.field1407) {
                method3489(class226.field2685);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2714 == arg0.field1407) {
                String var191 = var3.method5974();
                long var192 = (long) var3.method5967();
                long var194 = (long) var3.method5969();
                class270 var196 = (class270) class289.method2163(class270.method5880(), var3.method5965());
                long var197 = (var192 << 32) + var194;
                boolean var199 = false;
                for (int var200 = 0; var200 < 100; var200++) {
                    if (field865[var200] == var197) {
                        var199 = true;
                        break;
                    }
                }
                if (Statics.field1508.method1512(new class328(var191, Statics.field2039))) {
                    var199 = true;
                }
                if (!var199 && field756 == 0) {
                    field865[field866] = var197;
                    field866 = (field866 + 1) % 100;
                    String var201 = class301.method4890(class304.method334(class250.method4183(var3)));
                    byte var202;
                    if (var196.field3552) {
                        var202 = 7;
                    } else {
                        var202 = 3;
                    }
                    if (var196.field3551 == -1) {
                        class111.method1459(var202, var191, var201);
                    } else {
                        class111.method1459(var202, class106.method1795(var196.field3551) + var191, var201);
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2743 == arg0.field1407) {
                byte var203 = var3.method5966();
                String var204 = var3.method5974();
                long var205 = (long) var3.method5967();
                long var207 = (long) var3.method5969();
                class270 var209 = (class270) class289.method2163(class270.method5880(), var3.method5965());
                long var210 = (var205 << 32) + var207;
                boolean var212 = false;
                Object var213 = null;
                class4 var214 = var203 >= 0 ? field872[var203] : Statics.field631;
                if (var214 == null) {
                    var212 = true;
                } else {
                    int var215 = 0;
                    while (true) {
                        if (var215 >= 100) {
                            if (var209.field3553 && Statics.field1508.method1512(new class328(var204, Statics.field2039))) {
                                var212 = true;
                            }
                            break;
                        }
                        if (field865[var215] == var210) {
                            var212 = true;
                            break;
                        }
                        var215++;
                    }
                }
                if (!var212) {
                    field865[field866] = var210;
                    field866 = (field866 + 1) % 100;
                    String var216 = class301.method4890(class250.method4183(var3));
                    int var217 = var203 >= 0 ? 41 : 44;
                    if (var209.field3551 == -1) {
                        class111.method48(var217, var204, var216, var214.field32);
                    } else {
                        class111.method48(var217, class106.method1795(var209.field3551) + var204, var216, var214.field32);
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2717 == arg0.field1407) {
                field840 = field827;
                byte var218 = var3.method5966();
                class20 var219 = new class20(var3);
                class4 var220;
                if (var218 >= 0) {
                    var220 = field872[var218];
                } else {
                    var220 = Statics.field631;
                }
                var219.method157(var220);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2799 == arg0.field1407) {
                method2278();
                byte var221 = var3.method5966();
                class3 var222 = new class3(var3);
                class12 var223;
                if (var221 >= 0) {
                    var223 = field735[var221];
                } else {
                    var223 = Statics.field1634;
                }
                var222.method12(var223);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2704 == arg0.field1407) {
                int var224 = var3.method6060();
                int var225 = var3.method5997();
                int var226 = var3.method6020();
                class247 var227 = class247.method3749(var225);
                if (var227.field3017 != var226 || var227.field2969 != var224 || var227.field2964 != 0 || var227.field2965 != 0) {
                    var227.field3017 = var226;
                    var227.field2969 = var224;
                    var227.field2964 = 0;
                    var227.field2965 = 0;
                    method3353(var227);
                    this.method1034(var227);
                    if (var227.field2961 == 0) {
                        method5145(Statics.field2951[var225 >> 16], var227, false);
                    }
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2774 == arg0.field1407) {
                int var228 = var3.method5965();
                int var229 = var3.method6004();
                int var230 = var3.method6012();
                class95 var231 = (class95) field803.method5766((long) var230);
                if (var231 != null) {
                    method335(var231, var231.field1164 != var229);
                }
                method152(var230, var229, var228);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2701 == arg0.field1407) {
                int var232 = var3.method6002();
                field637 = var232;
                this.method1033(false);
                method170(var232);
                Statics.method3479(field637);
                for (int var233 = 0; var233 < 100; var233++) {
                    field720[var233] = true;
                }
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2750 == arg0.field1407) {
                if (arg0.field1411 == 0) {
                    Statics.field1987 = null;
                } else {
                    if (Statics.field1987 == null) {
                        Statics.field1987 = new class318(Statics.field2039, Statics.field204);
                    }
                    Statics.field1987.method5170(var3);
                }
                method2914();
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2796 == arg0.field1407) {
                method3489(class226.field2689);
                arg0.field1407 = null;
                return true;
            }
            if (class228.field2767 == arg0.field1407) {
                field840 = field827;
                byte var234 = var3.method5966();
                if (arg0.field1411 == 1) {
                    if (var234 >= 0) {
                        field872[var234] = null;
                    } else {
                        Statics.field631 = null;
                    }
                    arg0.field1407 = null;
                    return true;
                }
                if (var234 >= 0) {
                    field872[var234] = new class4(var3);
                } else {
                    Statics.field631 = new class4(var3);
                }
                arg0.field1407 = null;
                return true;
            }
            class406.method4407("" + (arg0.field1407 == null ? -1 : arg0.field1407.field2734) + class106.field1355 + (arg0.field1413 == null ? -1 : arg0.field1413.field2734) + class106.field1355 + (arg0.field1401 == null ? -1 : arg0.field1401.field2734) + class106.field1355 + arg0.field1411, (Throwable) null);
            method55();
        } catch (IOException var239) {
            method4464();
        } catch (Exception var240) {
            String var237 = "" + (arg0.field1407 == null ? -1 : arg0.field1407.field2734) + class106.field1355 + (arg0.field1413 == null ? -1 : arg0.field1413.field2734) + class106.field1355 + (arg0.field1401 == null ? -1 : arg0.field1401.field2734) + class106.field1355 + arg0.field1411 + class106.field1355 + (Statics.field2512 + Statics.field1163.field1273[0]) + class106.field1355 + (Statics.field458 + Statics.field1163.field1287[0]) + class106.field1355;
            for (int var238 = 0; var238 < arg0.field1411 && var238 < 50; var238++) {
                var237 = var237 + var3.field4155[var238] + class106.field1355;
            }
            class406.method4407(var237, var240);
            method55();
        }
        return true;
    }

    @ObfuscatedName("gx.hn(Lha;I)V")
    public static final void method3489(class226 arg0) {
        class382 var1 = field688.field1406;
        if (class226.field2684 == arg0) {
            int var2 = var1.method5994();
            int var3 = (var2 >> 4 & 0x7) + Statics.field2388;
            int var4 = (var2 & 0x7) + Statics.field597;
            int var5 = var1.method5994();
            int var6 = var1.method5965();
            int var7 = var6 >> 4 & 0xF;
            int var8 = var6 & 0x7;
            int var9 = var1.method6002();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                int var10 = var7 + 1;
                if (Statics.field1163.field1273[0] >= var3 - var10 && Statics.field1163.field1273[0] <= var3 + var10 && Statics.field1163.field1287[0] >= var4 - var10 && Statics.field1163.field1287[0] <= var4 + var10 && Statics.field1804.field1325 != 0 && var8 > 0 && field867 < 50) {
                    field884[field867] = var9;
                    field758[field867] = var8;
                    field918[field867] = var5;
                    field888[field867] = null;
                    field704[field867] = (var3 << 16) + (var4 << 8) + var7;
                    field867++;
                }
            }
        }
        if (class226.field2689 == arg0) {
            int var11 = var1.method6002();
            int var12 = var1.method5948();
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = field703[var13];
            int var16 = var1.method5994();
            int var17 = (var16 >> 4 & 0x7) + Statics.field2388;
            int var18 = (var16 & 0x7) + Statics.field597;
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                method285(Statics.field196, var17, var18, var15, var11, var13, var14, 0, -1);
            }
        } else if (class226.field2681 == arg0) {
            int var19 = var1.method6002();
            int var20 = var1.method6003();
            int var21 = var1.method6002();
            int var22 = var1.method5965();
            int var23 = (var22 >> 4 & 0x7) + Statics.field2388;
            int var24 = (var22 & 0x7) + Statics.field597;
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class294 var25 = field860[Statics.field196][var23][var24];
                if (var25 != null) {
                    for (class108 var26 = (class108) var25.method4714(); var26 != null; var26 = (class108) var25.method4741()) {
                        if ((var21 & 0x7FFF) == var26.field1367 && var26.field1368 == var20) {
                            var26.field1368 = var19;
                            break;
                        }
                    }
                    method123(var23, var24);
                }
            }
        } else if (class226.field2685 == arg0) {
            int var27 = var1.method6070();
            int var28 = (var27 >> 4 & 0x7) + Statics.field2388;
            int var29 = (var27 & 0x7) + Statics.field597;
            int var30 = var1.method6004();
            int var31 = var1.method5948();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field703[var32];
            if (var28 >= 0 && var29 >= 0 && var28 < 103 && var29 < 103) {
                if (var34 == 0) {
                    class210 var35 = Statics.field3862.method3735(Statics.field196, var28, var29);
                    if (var35 != null) {
                        int var36 = Statics.method1888(var35.field2523);
                        if (var32 == 2) {
                            var35.field2532 = new class88(var36, 2, var33 + 4, Statics.field196, var28, var29, var30, false, var35.field2532);
                            var35.field2529 = new class88(var36, 2, var33 + 1 & 0x3, Statics.field196, var28, var29, var30, false, var35.field2529);
                        } else {
                            var35.field2532 = new class88(var36, var32, var33, Statics.field196, var28, var29, var30, false, var35.field2532);
                        }
                    }
                }
                if (var34 == 1) {
                    class212 var37 = Statics.field3862.method3594(Statics.field196, var28, var29);
                    if (var37 != null) {
                        int var38 = Statics.method1888(var37.field2533);
                        if (var32 == 4 || var32 == 5) {
                            var37.field2537 = new class88(var38, 4, var33, Statics.field196, var28, var29, var30, false, var37.field2537);
                        } else if (var32 == 6) {
                            var37.field2537 = new class88(var38, 4, var33 + 4, Statics.field196, var28, var29, var30, false, var37.field2537);
                        } else if (var32 == 7) {
                            var37.field2537 = new class88(var38, 4, (var33 + 2 & 0x3) + 4, Statics.field196, var28, var29, var30, false, var37.field2537);
                        } else if (var32 == 8) {
                            var37.field2537 = new class88(var38, 4, var33 + 4, Statics.field196, var28, var29, var30, false, var37.field2537);
                            var37.field2541 = new class88(var38, 4, (var33 + 2 & 0x3) + 4, Statics.field196, var28, var29, var30, false, var37.field2541);
                        }
                    }
                }
                if (var34 == 2) {
                    class213 var39 = Statics.field3862.method3572(Statics.field196, var28, var29);
                    if (var32 == 11) {
                        var32 = 10;
                    }
                    if (var39 != null) {
                        var39.field2554 = new class88(Statics.method1888(var39.field2556), var32, var33, Statics.field196, var28, var29, var30, false, var39.field2554);
                    }
                }
                if (var34 == 3) {
                    class192 var40 = Statics.field3862.method3581(Statics.field196, var28, var29);
                    if (var40 != null) {
                        var40.field2205 = new class88(Statics.method1888(var40.field2206), 22, var33, Statics.field196, var28, var29, var30, false, var40.field2205);
                    }
                }
            }
        } else if (class226.field2683 == arg0) {
            int var41 = var1.method5994();
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = field703[var42];
            int var45 = var1.method5994();
            int var46 = (var45 >> 4 & 0x7) + Statics.field2388;
            int var47 = (var45 & 0x7) + Statics.field597;
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                method285(Statics.field196, var46, var47, var44, -1, var42, var43, 0, -1);
            }
        } else if (class226.field2686 == arg0) {
            int var48 = var1.method5967();
            int var49 = var1.method5994();
            int var50 = (var49 >> 4 & 0x7) + Statics.field2388;
            int var51 = (var49 & 0x7) + Statics.field597;
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                class294 var52 = field860[Statics.field196][var50][var51];
                if (var52 != null) {
                    for (class108 var53 = (class108) var52.method4714(); var53 != null; var53 = (class108) var52.method4741()) {
                        if ((var48 & 0x7FFF) == var53.field1367) {
                            var53.method5496();
                            break;
                        }
                    }
                    if (var52.method4714() == null) {
                        field860[Statics.field196][var50][var51] = null;
                    }
                    method123(var50, var51);
                }
            }
        } else if (class226.field2687 == arg0) {
            int var54 = var1.method6125();
            int var55 = var1.method5994() * 4;
            byte var56 = var1.method5958();
            int var57 = var1.method6070() * 4;
            int var58 = var1.method5948();
            int var59 = (var58 >> 4 & 0x7) + Statics.field2388;
            int var60 = (var58 & 0x7) + Statics.field597;
            int var61 = var1.method5948();
            int var62 = var1.method6003();
            byte var63 = var1.method5958();
            int var64 = var1.method6004();
            int var65 = var1.method5967();
            int var66 = var1.method5994();
            int var67 = var59 + var63;
            int var68 = var56 + var60;
            if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104 && var65 != 65535) {
                int var69 = var59 * 128 + 64;
                int var70 = var60 * 128 + 64;
                int var71 = var67 * 128 + 64;
                int var72 = var68 * 128 + 64;
                class85 var73 = new class85(var65, Statics.field196, var69, var70, method2069(var69, var70, Statics.field196) - var55, field650 + var64, field650 + var62, var61, var66, var54, var57);
                var73.method1774(var71, var72, method2069(var71, var72, Statics.field196) - var57, field650 + var64);
                field908.method4709(var73);
            }
        } else {
            if (class226.field2682 == arg0) {
                byte var74 = var1.method5966();
                int var75 = var1.method6003();
                int var76 = var1.method6002();
                byte var77 = var1.method5996();
                int var78 = var1.method5967();
                int var79 = var1.method6002();
                byte var80 = var1.method5992();
                int var81 = var1.method5948();
                int var82 = (var81 >> 4 & 0x7) + Statics.field2388;
                int var83 = (var81 & 0x7) + Statics.field597;
                int var84 = var1.method5994();
                int var85 = var84 >> 2;
                int var86 = var84 & 0x3;
                int var87 = field703[var85];
                byte var88 = var1.method5966();
                class98 var89;
                if (field759 == var78) {
                    var89 = Statics.field1163;
                } else {
                    var89 = field830[var78];
                }
                if (var89 != null) {
                    class154 var90 = class154.method175(var75);
                    int var91;
                    int var92;
                    if (var86 == 1 || var86 == 3) {
                        var91 = var90.field1803;
                        var92 = var90.field1791;
                    } else {
                        var91 = var90.field1791;
                        var92 = var90.field1803;
                    }
                    int var93 = (var91 >> 1) + var82;
                    int var94 = (var91 + 1 >> 1) + var82;
                    int var95 = (var92 >> 1) + var83;
                    int var96 = (var92 + 1 >> 1) + var83;
                    int[][] var97 = class90.field1128[Statics.field196];
                    int var98 = var97[var93][var95] + var97[var94][var95] + var97[var93][var96] + var97[var94][var96] >> 2;
                    int var99 = (var82 << 7) + (var91 << 6);
                    int var100 = (var83 << 7) + (var92 << 6);
                    class205 var101 = var90.method2718(var85, var86, var97, var99, var98, var100);
                    if (var101 != null) {
                        method285(Statics.field196, var82, var83, var87, -1, 0, 0, var76 + 1, var79 + 1);
                        var89.field1201 = field650 + var76;
                        var89.field1222 = field650 + var79;
                        var89.field1213 = var101;
                        var89.field1203 = var82 * 128 + var91 * 64;
                        var89.field1221 = var83 * 128 + var92 * 64;
                        var89.field1204 = var98;
                        if (var88 > var77) {
                            byte var102 = var88;
                            var88 = var77;
                            var77 = var102;
                        }
                        if (var74 > var80) {
                            byte var103 = var74;
                            var74 = var80;
                            var80 = var103;
                        }
                        var89.field1207 = var82 + var88;
                        var89.field1209 = var77 + var82;
                        var89.field1208 = var74 + var83;
                        var89.field1210 = var80 + var83;
                    }
                }
            }
            if (class226.field2688 == arg0) {
                int var104 = var1.method6004();
                int var105 = var1.method5967();
                int var106 = var1.method5965();
                int var107 = (var106 >> 4 & 0x7) + Statics.field2388;
                int var108 = (var106 & 0x7) + Statics.field597;
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    class108 var109 = new class108();
                    var109.field1367 = var105;
                    var109.field1368 = var104;
                    if (field860[Statics.field196][var107][var108] == null) {
                        field860[Statics.field196][var107][var108] = new class294();
                    }
                    field860[Statics.field196][var107][var108].method4709(var109);
                    method123(var107, var108);
                }
            } else if (class226.field2690 == arg0) {
                int var110 = var1.method5967();
                int var111 = var1.method5994();
                int var112 = var1.method5994();
                int var113 = (var112 >> 4 & 0x7) + Statics.field2388;
                int var114 = (var112 & 0x7) + Statics.field597;
                int var115 = var1.method6004();
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    int var116 = var113 * 128 + 64;
                    int var117 = var114 * 128 + 64;
                    class80 var118 = new class80(var110, Statics.field196, var116, var117, method2069(var116, var117, Statics.field196) - var111, var115, field650);
                    field919.method4709(var118);
                }
            }
        }
    }

    @ObfuscatedName("av.hc(IIIIIIIIIB)V")
    public static final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class99 var9 = null;
        for (class99 var10 = (class99) field799.method4714(); var10 != null; var10 = (class99) field799.method4741()) {
            if (var10.field1229 == arg0 && var10.field1224 == arg1 && var10.field1227 == arg2 && var10.field1225 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class99();
            var9.field1229 = arg0;
            var9.field1225 = arg3;
            var9.field1224 = arg1;
            var9.field1227 = arg2;
            method2230(var9);
            field799.method4709(var9);
        }
        var9.field1231 = arg4;
        var9.field1233 = arg5;
        var9.field1232 = arg6;
        var9.field1234 = arg7;
        var9.field1235 = arg8;
    }

    @ObfuscatedName("da.hz(Lch;I)V")
    public static final void method2230(class99 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1225 == 0) {
            var1 = Statics.field3862.method3596(arg0.field1229, arg0.field1224, arg0.field1227);
        }
        if (arg0.field1225 == 1) {
            var1 = Statics.field3862.method3597(arg0.field1229, arg0.field1224, arg0.field1227);
        }
        if (arg0.field1225 == 2) {
            var1 = Statics.field3862.method3664(arg0.field1229, arg0.field1224, arg0.field1227);
        }
        if (arg0.field1225 == 3) {
            var1 = Statics.field3862.method3599(arg0.field1229, arg0.field1224, arg0.field1227);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3862.method3600(arg0.field1229, arg0.field1224, arg0.field1227, var1);
            var3 = Statics.method1888(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1228 = var3;
        arg0.field1230 = var4;
        arg0.field1226 = var5;
    }

    @ObfuscatedName("is.hd(IIIIIIII)V")
    public static final void method4344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field642 && Statics.field196 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3862.method3596(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3862.method3597(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3862.method3664(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3862.method3599(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3862.method3600(arg0, arg2, arg3, var7);
            int var13 = Statics.method1888(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3862.method3588(arg0, arg2, arg3);
                class154 var16 = class154.method175(var13);
                if (var16.field1770 != 0) {
                    field700[arg0].method2915(arg2, arg3, var14, var15, var16.field1789);
                }
            }
            if (arg1 == 1) {
                Statics.field3862.method3589(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3862.method3654(arg0, arg2, arg3);
                class154 var17 = class154.method175(var13);
                if (var17.field1791 + arg2 > 103 || var17.field1791 + arg3 > 103 || var17.field1803 + arg2 > 103 || var17.field1803 + arg3 > 103) {
                    return;
                }
                if (var17.field1770 != 0) {
                    field700[arg0].method2916(arg2, arg3, var17.field1791, var17.field1803, var15, var17.field1789);
                }
            }
            if (arg1 == 3) {
                Statics.field3862.method3591(arg0, arg2, arg3);
                class154 var18 = class154.method175(var13);
                if (var18.field1770 == 1) {
                    field700[arg0].method2909(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class90.field1119[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class90.method287(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field3862, field700[arg0]);
    }

    @ObfuscatedName("l.he(IIB)V")
    public static final void method123(int arg0, int arg1) {
        class294 var2 = field860[Statics.field196][arg0][arg1];
        if (var2 == null) {
            Statics.field3862.method3651(Statics.field196, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class108 var5 = null;
        for (class108 var6 = (class108) var2.method4714(); var6 != null; var6 = (class108) var2.method4741()) {
            class155 var7 = class155.method4399(var6.field1367);
            long var8 = (long) var7.field1827;
            if (var7.field1813 == 1) {
                var8 = (long) (var6.field1368 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3862.method3651(Statics.field196, arg0, arg1);
            return;
        }
        var2.method4739(var5);
        class108 var10 = null;
        class108 var11 = null;
        for (class108 var12 = (class108) var2.method4714(); var12 != null; var12 = (class108) var2.method4741()) {
            if (var5.field1367 != var12.field1367) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1367 != var12.field1367 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class206.method281(arg0, arg1, 3, false, 0);
        Statics.field3862.method3578(Statics.field196, arg0, arg1, method2069(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field196), var5, var13, var10, var11);
    }

    @ObfuscatedName("bq.hr(ZLnb;I)V")
    public static final void method688(boolean arg0, class382 arg1) {
        field763 = 0;
        field686 = 0;
        class382 var2 = field688.field1406;
        var2.method5918();
        int var3 = var2.method5921(8);
        if (var3 < field684) {
            for (int var4 = var3; var4 < field684; var4++) {
                field772[++field763 - 1] = field685[var4];
            }
        }
        if (var3 > field684) {
            throw new RuntimeException("");
        }
        field684 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field685[var5];
            class105 var7 = field683[var6];
            int var8 = var2.method5921(1);
            if (var8 == 0) {
                field685[++field684 - 1] = var6;
                var7.field1286 = field650;
            } else {
                int var9 = var2.method5921(2);
                if (var9 == 0) {
                    field685[++field684 - 1] = var6;
                    var7.field1286 = field650;
                    field687[++field686 - 1] = var6;
                } else if (var9 == 1) {
                    field685[++field684 - 1] = var6;
                    var7.field1286 = field650;
                    int var10 = var2.method5921(3);
                    var7.method2058(var10, (byte) 1);
                    int var11 = var2.method5921(1);
                    if (var11 == 1) {
                        field687[++field686 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field685[++field684 - 1] = var6;
                    var7.field1286 = field650;
                    int var12 = var2.method5921(3);
                    var7.method2058(var12, (byte) 2);
                    int var13 = var2.method5921(3);
                    var7.method2058(var13, (byte) 2);
                    int var14 = var2.method5921(1);
                    if (var14 == 1) {
                        field687[++field686 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field772[++field763 - 1] = var6;
                }
            }
        }
        while (arg1.method5923(field688.field1411) >= 27) {
            int var15 = arg1.method5921(15);
            if (var15 == 32767) {
                break;
            }
            boolean var19 = false;
            if (field683[var15] == null) {
                field683[var15] = new class105();
                var19 = true;
            }
            class105 var20 = field683[var15];
            field685[++field684 - 1] = var15;
            var20.field1286 = field650;
            var20.field1346 = class146.method2653(arg1.method5921(14));
            int var21;
            if (arg0) {
                var21 = arg1.method5921(8);
                if (var21 > 127) {
                    var21 -= 256;
                }
            } else {
                var21 = arg1.method5921(5);
                if (var21 > 15) {
                    var21 -= 32;
                }
            }
            int var22;
            if (arg0) {
                var22 = arg1.method5921(8);
                if (var22 > 127) {
                    var22 -= 256;
                }
            } else {
                var22 = arg1.method5921(5);
                if (var22 > 15) {
                    var22 -= 32;
                }
            }
            int var23 = field768[arg1.method5921(3)];
            if (var19) {
                var20.field1267 = var20.field1280 = var23;
            }
            int var24 = arg1.method5921(1);
            if (var24 == 1) {
                field687[++field686 - 1] = var15;
            }
            boolean var25 = arg1.method5921(1) == 1;
            if (var25) {
                arg1.method5921(32);
            }
            int var26 = arg1.method5921(1);
            var20.field1240 = var20.field1346.field1637;
            var20.field1290 = var20.field1346.field1660;
            if (var20.field1290 == 0) {
                var20.field1280 = 0;
            }
            var20.field1245 = var20.field1346.field1643;
            var20.field1268 = var20.field1346.field1648;
            var20.field1293 = var20.field1346.field1645;
            var20.field1248 = var20.field1346.field1646;
            var20.field1242 = var20.field1346.field1653;
            var20.field1282 = var20.field1346.field1641;
            var20.field1244 = var20.field1346.field1652;
            var20.method2059(Statics.field1163.field1273[0] + var22, Statics.field1163.field1287[0] + var21, var26 == 1);
        }
        arg1.method5922();
        method1903(arg1);
        for (int var16 = 0; var16 < field763; var16++) {
            int var17 = field772[var16];
            if (field650 != field683[var17].field1286) {
                field683[var17].field1346 = null;
                field683[var17] = null;
            }
        }
        if (field688.field1411 != arg1.field4158) {
            throw new RuntimeException(arg1.field4158 + class106.field1355 + field688.field1411);
        }
        for (int var18 = 0; var18 < field684; var18++) {
            if (field683[field685[var18]] == null) {
                throw new RuntimeException(var18 + class106.field1355 + field684);
            }
        }
    }

    @ObfuscatedName("cz.hs(Lnb;I)V")
    public static final void method1903(class382 arg0) {
        for (int var1 = 0; var1 < field686; var1++) {
            int var2 = field687[var1];
            class105 var3 = field683[var2];
            int var4 = arg0.method5965();
            if ((var4 & 0x20) != 0) {
                int var5 = arg0.method6002();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = arg0.method5948();
                if (var3.field1269 == var5 && var5 != -1) {
                    int var7 = class157.method2030(var5).field1892;
                    if (var7 == 1) {
                        var3.field1292 = 0;
                        var3.field1271 = 0;
                        var3.field1272 = var6;
                        var3.field1246 = 0;
                    }
                    if (var7 == 2) {
                        var3.field1246 = 0;
                    }
                } else if (var5 == -1 || var3.field1269 == -1 || class157.method2030(var5).field1886 >= class157.method2030(var3.field1269).field1886) {
                    var3.field1269 = var5;
                    var3.field1292 = 0;
                    var3.field1271 = 0;
                    var3.field1272 = var6;
                    var3.field1246 = 0;
                    var3.field1275 = var3.field1291;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var8 = arg0.method6004();
                int var9 = arg0.method5967();
                int var10 = var3.field1238 - (var8 - Statics.field2512 - Statics.field2512) * 64;
                int var11 = var3.field1237 - (var9 - Statics.field458 - Statics.field458) * 64;
                if (var10 != 0 || var11 != 0) {
                    var3.field1265 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1346 = class146.method2653(arg0.method6002());
                var3.field1240 = var3.field1346.field1637;
                var3.field1290 = var3.field1346.field1660;
                var3.field1245 = var3.field1346.field1643;
                var3.field1268 = var3.field1346.field1648;
                var3.field1293 = var3.field1346.field1645;
                var3.field1248 = var3.field1346.field1646;
                var3.field1242 = var3.field1346.field1653;
                var3.field1282 = var3.field1346.field1641;
                var3.field1244 = var3.field1346.field1652;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1289 = arg0.method6002();
                if (var3.field1289 == 65535) {
                    var3.field1289 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1279 = arg0.method5996();
                var3.field1281 = arg0.method5996();
                var3.field1270 = arg0.method5958();
                var3.field1239 = arg0.method5992();
                var3.field1266 = arg0.method6003() + field650;
                var3.field1284 = arg0.method6002() + field650;
                var3.field1285 = arg0.method6003();
                var3.field1291 = 1;
                var3.field1275 = 0;
                var3.field1279 += var3.field1273[0];
                var3.field1281 += var3.field1287[0];
                var3.field1270 += var3.field1273[0];
                var3.field1239 += var3.field1287[0];
            }
            if ((var4 & 0x40) != 0) {
                int var12 = arg0.method5948();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg0.method5979();
                        if (var17 == 32767) {
                            var17 = arg0.method5979();
                            var15 = arg0.method5979();
                            var14 = arg0.method5979();
                            var16 = arg0.method5979();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg0.method5979();
                        }
                        int var18 = arg0.method5979();
                        var3.method1977(var17, var15, var14, var16, field650, var18);
                    }
                }
                int var19 = arg0.method6070();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg0.method5979();
                        int var22 = arg0.method5979();
                        if (var22 == 32767) {
                            var3.method1987(var21);
                        } else {
                            int var23 = arg0.method5979();
                            int var24 = arg0.method6070();
                            int var25 = var22 > 0 ? arg0.method5948() : var24;
                            var3.method1983(var21, field650, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1274 = arg0.method6004();
                int var26 = arg0.method5997();
                var3.field1278 = var26 >> 16;
                var3.field1288 = (var26 & 0xFFFF) + field650;
                var3.field1263 = 0;
                var3.field1276 = 0;
                if (var3.field1288 > field650) {
                    var3.field1263 = -1;
                }
                if (var3.field1274 == 65535) {
                    var3.field1274 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1250 = arg0.method5974();
                var3.field1253 = 100;
            }
        }
    }

    @ObfuscatedName("nx.ha(III)Lfc;")
    public static class159 method5879(int arg0, int arg1) {
        field786.field1909 = arg0;
        field786.field1907 = arg1;
        field786.field1912 = 1;
        field786.field1908 = 1;
        return field786;
    }

    @ObfuscatedName("n.hq(B)V")
    public static void method8() {
        field779 = 0;
        field778 = false;
    }

    @ObfuscatedName("ea.hl(I)V")
    public static void method2358() {
        field779 = 0;
        field778 = false;
        field856[0] = class268.field3483;
        field785[0] = "";
        field782[0] = 1006;
        field717[0] = false;
        field779 = 1;
    }

    @ObfuscatedName("ec.hv(III)V")
    public static final void method2324(int arg0, int arg1) {
        if (field779 < 2 && field795 == 0 && !field797 || !field790) {
            return;
        }
        int var2 = method2360();
        String var3;
        if (field795 == 1 && field779 < 2) {
            var3 = class268.field3388 + class268.field3398 + field796 + " " + class106.field1352;
        } else if (field797 && field779 < 2) {
            var3 = field800 + class268.field3398 + field770 + " " + class106.field1352;
        } else {
            var3 = method1907(var2);
        }
        if (field779 > 2) {
            var3 = var3 + class106.method348(16777215) + " " + '/' + " " + (field779 - 2) + class268.field3276;
        }
        Statics.field3099.method4899(var3, arg0 + 4, arg1 + 15, 16777215, 0, field650 / 1000);
    }

    @ObfuscatedName("fe.hu(I)Z")
    public static final boolean method2990() {
        return field778;
    }

    @ObfuscatedName("bd.hi(IIIII)V")
    public static final void method664(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field871; var4++) {
            if (field920[var4] + field764[var4] > arg0 && field920[var4] < arg0 + arg2 && field857[var4] + field743[var4] > arg1 && field743[var4] < arg1 + arg3) {
                field781[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hk(B)V")
    public final void method1030() {
        method5908();
        if (Statics.field1086 != null || field815 != null) {
            return;
        }
        int var22;
        int var24;
        int var25;
        label221: {
            int var1 = class48.field384;
            if (field778) {
                if (var1 != 1 && (Statics.field666 || var1 != 4)) {
                    int var2 = class48.field389;
                    int var3 = class48.field370;
                    if (var2 < Statics.field134 - 10 || var2 > Statics.field240 + Statics.field134 + 10 || var3 < Statics.field2927 - 10 || var3 > Statics.field2927 + Statics.field209 + 10) {
                        field778 = false;
                        int var4 = Statics.field134;
                        int var5 = Statics.field2927;
                        int var6 = Statics.field240;
                        int var7 = Statics.field209;
                        for (int var8 = 0; var8 < field871; var8++) {
                            if (field920[var8] + field764[var8] > var4 && field920[var8] < var4 + var6 && field857[var8] + field743[var8] > var5 && field743[var8] < var5 + var7) {
                                field720[var8] = true;
                            }
                        }
                    }
                }
                if (var1 == 1 || !Statics.field666 && var1 == 4) {
                    int var9 = Statics.field134;
                    int var10 = Statics.field2927;
                    int var11 = Statics.field240;
                    int var12 = class48.field368;
                    int var13 = class48.field378;
                    int var14 = -1;
                    for (int var15 = 0; var15 < field779; var15++) {
                        int var16 = (field779 - 1 - var15) * 15 + var10 + 31;
                        if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                            var14 = var15;
                        }
                    }
                    if (var14 != -1) {
                        method1705(var14);
                    }
                    field778 = false;
                    int var17 = Statics.field134;
                    int var18 = Statics.field2927;
                    int var19 = Statics.field240;
                    int var20 = Statics.field209;
                    for (int var21 = 0; var21 < field871; var21++) {
                        if (field920[var21] + field764[var21] > var17 && field920[var21] < var17 + var19 && field857[var21] + field743[var21] > var18 && field743[var21] < var18 + var20) {
                            field720[var21] = true;
                        }
                    }
                }
            } else {
                var22 = method2360();
                if ((var1 == 1 || !Statics.field666 && var1 == 4) && var22 >= 0) {
                    int var23 = field782[var22];
                    if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                        var24 = field780[var22];
                        var25 = field835[var22];
                        class247 var26 = class247.method3749(var25);
                        int var27 = method169(var26);
                        boolean var28 = (var27 >> 28 & 0x1) != 0;
                        if (var28) {
                            break label221;
                        }
                        class248 var10000 = (class248) null;
                        if (class248.method295(method169(var26))) {
                            break label221;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field666 && var1 == 4) && this.method1031()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field666 && var1 == 4) && field779 > 0) {
                    method1705(var22);
                }
                if (var1 == 2 && field779 > 0) {
                    this.method1032(class48.field368, class48.field378);
                }
            }
            return;
        }
        if (Statics.field1086 != null && !field849 && field779 > 0 && !this.method1031()) {
            int var29 = field751;
            int var30 = field752;
            class82 var31 = Statics.field608;
            method1810(var31.field1014, var31.field1013, var31.field1016, var31.field1015, var31.field1012, var31.field1012, var29, var30);
            Statics.field608 = null;
        }
        field849 = false;
        field755 = 0;
        if (Statics.field1086 != null) {
            method3353(Statics.field1086);
        }
        Statics.field1086 = class247.method3749(var25);
        field773 = var24;
        field751 = class48.field368;
        field752 = class48.field378;
        if (var22 >= 0) {
            Statics.field608 = new class82();
            Statics.field608.field1014 = field780[var22];
            Statics.field608.field1013 = field835[var22];
            Statics.field608.field1016 = field782[var22];
            Statics.field608.field1015 = field783[var22];
            Statics.field608.field1012 = field856[var22];
        }
        method3353(Statics.field1086);
    }

    @ObfuscatedName("client.hx(I)Z")
    public final boolean method1031() {
        int var1 = method2360();
        return (field777 == 1 && field779 > 2 || method42(var1)) && !field717[var1];
    }

    @ObfuscatedName("client.hp(III)V")
    public final void method1032(int arg0, int arg1) {
        Statics.method965(arg0, arg1);
        Statics.field3862.method3602(Statics.field196, arg0, arg1, false);
        field778 = true;
    }

    @ObfuscatedName("g.ir(S)V")
    public static void method149() {
        Statics.method965(Statics.field240 / 2 + Statics.field134, Statics.field2927);
    }

    @ObfuscatedName("j.ih(IB)Z")
    public static final boolean method42(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field782[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cd.ie(II)V")
    public static final void method1705(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field780[arg0];
        int var2 = field835[arg0];
        int var3 = field782[arg0];
        int var4 = field783[arg0];
        String var5 = field856[arg0];
        String var6 = field785[arg0];
        method1810(var1, var2, var3, var4, var5, var6, class48.field368, class48.field378);
    }

    @ObfuscatedName("cf.iq(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1810(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 37) {
            class227 var8 = class227.method171(class225.field2674, field688.field1415);
            var8.field2693.method6027(arg1);
            var8.field2693.method6001(arg0);
            var8.field2693.method6166(arg3);
            field688.method2167(var8);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 16) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var9 = class227.method171(class225.field2578, field688.field1415);
            var9.field2693.method5999(Statics.field83);
            var9.field2693.method6018(arg3);
            var9.field2693.method5999(Statics.field1441);
            var9.field2693.method6001(Statics.field458 + arg1);
            var9.field2693.method5999(Statics.field2512 + arg0);
            var9.field2693.method6011(Statics.field1223);
            var9.field2693.method5983(class39.field286[82] ? 1 : 0);
            field688.method2167(var9);
        }
        if (arg2 == 47) {
            class98 var10 = field830[arg3];
            if (var10 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var11 = class227.method171(class225.field2606, field688.field1415);
                var11.field2693.method6018(arg3);
                var11.field2693.method5983(class39.field286[82] ? 1 : 0);
                field688.method2167(var11);
            }
        }
        if (arg2 == 58) {
            class247 var12 = class247.method4694(arg1, arg0);
            if (var12 != null) {
                class227 var13 = class227.method171(class225.field2599, field688.field1415);
                var13.field2693.method6027(arg1);
                var13.field2693.method6018(var12.field3087);
                var13.field2693.method5999(field789);
                var13.field2693.method5951(Statics.field553);
                var13.field2693.method6018(field798);
                var13.field2693.method5999(arg0);
                field688.method2167(var13);
            }
        }
        if (arg2 == 13) {
            class105 var14 = field683[arg3];
            if (var14 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var15 = class227.method171(class225.field2626, field688.field1415);
                var15.field2693.method5993(class39.field286[82] ? 1 : 0);
                var15.field2693.method6001(arg3);
                field688.method2167(var15);
            }
        }
        if (arg2 == 28) {
            class227 var16 = class227.method171(class225.field2620, field688.field1415);
            var16.field2693.method5951(arg1);
            field688.method2167(var16);
            class247 var17 = class247.method3749(arg1);
            if (var17.field3079 != null && var17.field3079[0][0] == 5) {
                int var18 = var17.field3079[0][1];
                class242.field2918[var18] = 1 - class242.field2918[var18];
                method997(var18);
            }
        }
        if (arg2 == 43) {
            class227 var19 = class227.method171(class225.field2634, field688.field1415);
            var19.field2693.method6018(arg3);
            var19.field2693.method6001(arg0);
            var19.field2693.method6010(arg1);
            field688.method2167(var19);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 34) {
            class227 var20 = class227.method171(class225.field2577, field688.field1415);
            var20.field2693.method6027(arg1);
            var20.field2693.method5999(arg0);
            var20.field2693.method5999(arg3);
            field688.method2167(var20);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 8) {
            class105 var21 = field683[arg3];
            if (var21 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var22 = class227.method171(class225.field2600, field688.field1415);
                var22.field2693.method6011(Statics.field553);
                var22.field2693.method5999(field789);
                var22.field2693.method5999(arg3);
                var22.field2693.method6166(field798);
                var22.field2693.method5993(class39.field286[82] ? 1 : 0);
                field688.method2167(var22);
            }
        }
        if (arg2 == 1002) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            class227 var23 = class227.method171(class225.field2592, field688.field1415);
            var23.field2693.method5999(arg3);
            field688.method2167(var23);
        }
        if (arg2 == 42) {
            class227 var24 = class227.method171(class225.field2636, field688.field1415);
            var24.field2693.method6011(arg1);
            var24.field2693.method6166(arg3);
            var24.field2693.method6018(arg0);
            field688.method2167(var24);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 31) {
            class227 var25 = class227.method171(class225.field2632, field688.field1415);
            var25.field2693.method5951(arg1);
            var25.field2693.method6027(Statics.field1223);
            var25.field2693.method6018(arg0);
            var25.field2693.method6166(arg3);
            var25.field2693.method6001(Statics.field83);
            var25.field2693.method6001(Statics.field1441);
            field688.method2167(var25);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 5) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var26 = class227.method171(class225.field2673, field688.field1415);
            var26.field2693.method5999(Statics.field2512 + arg0);
            var26.field2693.method6001(Statics.field458 + arg1);
            var26.field2693.method5980(class39.field286[82] ? 1 : 0);
            var26.field2693.method6018(arg3);
            field688.method2167(var26);
        }
        if (arg2 == 41) {
            class227 var27 = class227.method171(class225.field2640, field688.field1415);
            var27.field2693.method5999(arg3);
            var27.field2693.method6018(arg0);
            var27.field2693.method6027(arg1);
            field688.method2167(var27);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 32) {
            class227 var28 = class227.method171(class225.field2610, field688.field1415);
            var28.field2693.method6011(Statics.field553);
            var28.field2693.method6018(field798);
            var28.field2693.method6011(arg1);
            var28.field2693.method5999(arg3);
            var28.field2693.method6018(arg0);
            field688.method2167(var28);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 21) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var29 = class227.method171(class225.field2576, field688.field1415);
            var29.field2693.method6001(arg3);
            var29.field2693.method6166(Statics.field458 + arg1);
            var29.field2693.method5980(class39.field286[82] ? 1 : 0);
            var29.field2693.method6166(Statics.field2512 + arg0);
            field688.method2167(var29);
        }
        if (arg2 == 30 && field808 == null) {
            method172(arg1, arg0);
            field808 = class247.method4694(arg1, arg0);
            method3353(field808);
        }
        if (arg2 == 18) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var30 = class227.method171(class225.field2667, field688.field1415);
            var30.field2693.method6166(arg3);
            var30.field2693.method5983(class39.field286[82] ? 1 : 0);
            var30.field2693.method6001(Statics.field458 + arg1);
            var30.field2693.method6166(Statics.field2512 + arg0);
            field688.method2167(var30);
        }
        if (arg2 == 36) {
            class227 var31 = class227.method171(class225.field2662, field688.field1415);
            var31.field2693.method6010(arg1);
            var31.field2693.method5999(arg3);
            var31.field2693.method6001(arg0);
            field688.method2167(var31);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 3) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var32 = class227.method171(class225.field2642, field688.field1415);
            var32.field2693.method5993(class39.field286[82] ? 1 : 0);
            var32.field2693.method6001(arg3);
            var32.field2693.method6166(Statics.field2512 + arg0);
            var32.field2693.method5999(Statics.field458 + arg1);
            field688.method2167(var32);
        }
        if (arg2 == 4) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var33 = class227.method171(class225.field2627, field688.field1415);
            var33.field2693.method6166(Statics.field2512 + arg0);
            var33.field2693.method6001(arg3);
            var33.field2693.method5980(class39.field286[82] ? 1 : 0);
            var33.field2693.method6001(Statics.field458 + arg1);
            field688.method2167(var33);
        }
        if (arg2 == 14) {
            class98 var34 = field830[arg3];
            if (var34 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var35 = class227.method171(class225.field2624, field688.field1415);
                var35.field2693.method6027(Statics.field1223);
                var35.field2693.method6018(Statics.field1441);
                var35.field2693.method5980(class39.field286[82] ? 1 : 0);
                var35.field2693.method6018(Statics.field83);
                var35.field2693.method6166(arg3);
                field688.method2167(var35);
            }
        }
        if (arg2 == 17) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var36 = class227.method171(class225.field2669, field688.field1415);
            var36.field2693.method5980(class39.field286[82] ? 1 : 0);
            var36.field2693.method6010(Statics.field553);
            var36.field2693.method5999(Statics.field458 + arg1);
            var36.field2693.method6001(field789);
            var36.field2693.method6018(arg3);
            var36.field2693.method6166(Statics.field2512 + arg0);
            var36.field2693.method5999(field798);
            field688.method2167(var36);
        }
        if (arg2 == 49) {
            class98 var37 = field830[arg3];
            if (var37 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var38 = class227.method171(class225.field2637, field688.field1415);
                var38.field2693.method5980(class39.field286[82] ? 1 : 0);
                var38.field2693.method6001(arg3);
                field688.method2167(var38);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class247 var39 = class247.method4694(arg1, arg0);
            if (var39 != null) {
                method5900(arg3, arg1, arg0, var39.field3087, arg5);
            }
        }
        if (arg2 == 1001) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var40 = class227.method171(class225.field2641, field688.field1415);
            var40.field2693.method6001(Statics.field2512 + arg0);
            var40.field2693.method5993(class39.field286[82] ? 1 : 0);
            var40.field2693.method6166(arg3);
            var40.field2693.method6001(Statics.field458 + arg1);
            field688.method2167(var40);
        }
        if (arg2 == 1) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var41 = class227.method171(class225.field2678, field688.field1415);
            var41.field2693.method6018(Statics.field1441);
            var41.field2693.method6001(arg3);
            var41.field2693.method5993(class39.field286[82] ? 1 : 0);
            var41.field2693.method6001(Statics.field458 + arg1);
            var41.field2693.method5951(Statics.field1223);
            var41.field2693.method6001(Statics.field2512 + arg0);
            var41.field2693.method6166(Statics.field83);
            field688.method2167(var41);
        }
        if (arg2 == 23) {
            if (field778) {
                Statics.field3862.method3687();
            } else {
                Statics.field3862.method3602(Statics.field196, arg0, arg1, true);
            }
        }
        if (arg2 == 46) {
            class98 var42 = field830[arg3];
            if (var42 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var43 = class227.method171(class225.field2638, field688.field1415);
                var43.field2693.method5983(class39.field286[82] ? 1 : 0);
                var43.field2693.method6166(arg3);
                field688.method2167(var43);
            }
        }
        if (arg2 == 48) {
            class98 var44 = field830[arg3];
            if (var44 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var45 = class227.method171(class225.field2603, field688.field1415);
                var45.field2693.method6001(arg3);
                var45.field2693.method6043(class39.field286[82] ? 1 : 0);
                field688.method2167(var45);
            }
        }
        if (arg2 == 38) {
            method47();
            class247 var46 = class247.method3749(arg1);
            field795 = 1;
            Statics.field83 = arg0;
            Statics.field1223 = arg1;
            Statics.field1441 = arg3;
            method3353(var46);
            field796 = class106.method348(16748608) + class155.method4399(arg3).field1815 + class106.method348(16777215);
            if (field796 == null) {
                field796 = class268.field3242;
            }
            return;
        }
        if (arg2 == 45) {
            class98 var47 = field830[arg3];
            if (var47 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var48 = class227.method171(class225.field2655, field688.field1415);
                var48.field2693.method5999(arg3);
                var48.field2693.method6043(class39.field286[82] ? 1 : 0);
                field688.method2167(var48);
            }
        }
        if (arg2 == 50) {
            class98 var49 = field830[arg3];
            if (var49 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var50 = class227.method171(class225.field2621, field688.field1415);
                var50.field2693.method6043(class39.field286[82] ? 1 : 0);
                var50.field2693.method6001(arg3);
                field688.method2167(var50);
            }
        }
        if (arg2 == 1004) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            class227 var51 = class227.method171(class225.field2647, field688.field1415);
            var51.field2693.method5999(arg3);
            field688.method2167(var51);
        }
        if (arg2 == 44) {
            class98 var52 = field830[arg3];
            if (var52 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var53 = class227.method171(class225.field2598, field688.field1415);
                var53.field2693.method6018(arg3);
                var53.field2693.method5983(class39.field286[82] ? 1 : 0);
                field688.method2167(var53);
            }
        }
        if (arg2 == 9) {
            class105 var54 = field683[arg3];
            if (var54 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var55 = class227.method171(class225.field2625, field688.field1415);
                var55.field2693.method5980(class39.field286[82] ? 1 : 0);
                var55.field2693.method5999(arg3);
                field688.method2167(var55);
            }
        }
        if (arg2 == 7) {
            class105 var56 = field683[arg3];
            if (var56 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var57 = class227.method171(class225.field2676, field688.field1415);
                var57.field2693.method6043(class39.field286[82] ? 1 : 0);
                var57.field2693.method6001(Statics.field1441);
                var57.field2693.method6011(Statics.field1223);
                var57.field2693.method6018(arg3);
                var57.field2693.method5999(Statics.field83);
                field688.method2167(var57);
            }
        }
        if (arg2 == 29) {
            class227 var58 = class227.method171(class225.field2620, field688.field1415);
            var58.field2693.method5951(arg1);
            field688.method2167(var58);
            class247 var59 = class247.method3749(arg1);
            if (var59.field3079 != null && var59.field3079[0][0] == 5) {
                int var60 = var59.field3079[0][1];
                if (class242.field2918[var60] != var59.field3051[0]) {
                    class242.field2918[var60] = var59.field3051[0];
                    method997(var60);
                }
            }
        }
        if (arg2 == 1003) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            class105 var61 = field683[arg3];
            if (var61 != null) {
                class146 var62 = var61.field1346;
                if (var62.field1640 != null) {
                    var62 = var62.method2532();
                }
                if (var62 != null) {
                    class227 var63 = class227.method171(class225.field2579, field688.field1415);
                    var63.field2693.method5999(var62.field1635);
                    field688.method2167(var63);
                }
            }
        }
        if (arg2 == 6) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var64 = class227.method171(class225.field2573, field688.field1415);
            var64.field2693.method6018(arg3);
            var64.field2693.method6018(Statics.field458 + arg1);
            var64.field2693.method5980(class39.field286[82] ? 1 : 0);
            var64.field2693.method6001(Statics.field2512 + arg0);
            field688.method2167(var64);
        }
        if (arg2 == 12) {
            class105 var65 = field683[arg3];
            if (var65 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var66 = class227.method171(class225.field2602, field688.field1415);
                var66.field2693.method6043(class39.field286[82] ? 1 : 0);
                var66.field2693.method6018(arg3);
                field688.method2167(var66);
            }
        }
        if (arg2 == 2) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var67 = class227.method171(class225.field2644, field688.field1415);
            var67.field2693.method5999(Statics.field2512 + arg0);
            var67.field2693.method6166(arg3);
            var67.field2693.method5999(field789);
            var67.field2693.method6166(Statics.field458 + arg1);
            var67.field2693.method6166(field798);
            var67.field2693.method5993(class39.field286[82] ? 1 : 0);
            var67.field2693.method6011(Statics.field553);
            field688.method2167(var67);
        }
        if (arg2 == 26) {
            method39();
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2928.method5588(arg2, arg3, new class243(arg0), new class243(arg1));
        }
        if (arg2 == 11) {
            class105 var68 = field683[arg3];
            if (var68 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var69 = class227.method171(class225.field2619, field688.field1415);
                var69.field2693.method5999(arg3);
                var69.field2693.method6043(class39.field286[82] ? 1 : 0);
                field688.method2167(var69);
            }
        }
        if (arg2 == 24) {
            class247 var70 = class247.method3749(arg1);
            boolean var71 = true;
            if (var70.field3065 > 0) {
                var71 = method2907(var70);
            }
            if (var71) {
                class227 var72 = class227.method171(class225.field2620, field688.field1415);
                var72.field2693.method5951(arg1);
                field688.method2167(var72);
            }
        }
        if (arg2 == 22) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var73 = class227.method171(class225.field2650, field688.field1415);
            var73.field2693.method6001(arg3);
            var73.field2693.method6018(Statics.field2512 + arg0);
            var73.field2693.method5993(class39.field286[82] ? 1 : 0);
            var73.field2693.method6018(Statics.field458 + arg1);
            field688.method2167(var73);
        }
        if (arg2 == 39) {
            class227 var74 = class227.method171(class225.field2582, field688.field1415);
            var74.field2693.method6001(arg0);
            var74.field2693.method5999(arg3);
            var74.field2693.method6010(arg1);
            field688.method2167(var74);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 35) {
            class227 var75 = class227.method171(class225.field2628, field688.field1415);
            var75.field2693.method6166(arg3);
            var75.field2693.method6011(arg1);
            var75.field2693.method6001(arg0);
            field688.method2167(var75);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 15) {
            class98 var76 = field830[arg3];
            if (var76 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var77 = class227.method171(class225.field2616, field688.field1415);
                var77.field2693.method6018(field798);
                var77.field2693.method6001(arg3);
                var77.field2693.method6010(Statics.field553);
                var77.field2693.method5983(class39.field286[82] ? 1 : 0);
                var77.field2693.method6001(field789);
                field688.method2167(var77);
            }
        }
        if (arg2 == 20) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var78 = class227.method171(class225.field2677, field688.field1415);
            var78.field2693.method6018(arg3);
            var78.field2693.method5999(Statics.field2512 + arg0);
            var78.field2693.method5983(class39.field286[82] ? 1 : 0);
            var78.field2693.method6001(Statics.field458 + arg1);
            field688.method2167(var78);
        }
        if (arg2 == 51) {
            class98 var79 = field830[arg3];
            if (var79 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var80 = class227.method171(class225.field2657, field688.field1415);
                var80.field2693.method6166(arg3);
                var80.field2693.method5993(class39.field286[82] ? 1 : 0);
                field688.method2167(var80);
            }
        }
        if (arg2 == 25) {
            class247 var81 = class247.method4694(arg1, arg0);
            if (var81 != null) {
                method47();
                method2033(arg1, arg0, class248.method2072(method169(var81)), var81.field3087);
                field795 = 0;
                field800 = method3901(var81);
                if (field800 == null) {
                    field800 = class268.field3242;
                }
                if (var81.field2958) {
                    field770 = var81.field2949 + class106.method348(16777215);
                } else {
                    field770 = class106.method348(65280) + var81.field3083 + class106.method348(16777215);
                }
            }
            return;
        }
        if (arg2 == 40) {
            class227 var82 = class227.method171(class225.field2580, field688.field1415);
            var82.field2693.method5999(arg0);
            var82.field2693.method6027(arg1);
            var82.field2693.method6018(arg3);
            field688.method2167(var82);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 10) {
            class105 var83 = field683[arg3];
            if (var83 != null) {
                field792 = arg6;
                field744 = arg7;
                field746 = 2;
                field870 = 0;
                field745 = arg0;
                field787 = arg1;
                class227 var84 = class227.method171(class225.field2671, field688.field1415);
                var84.field2693.method6018(arg3);
                var84.field2693.method5980(class39.field286[82] ? 1 : 0);
                field688.method2167(var84);
            }
        }
        if (arg2 == 33) {
            class227 var85 = class227.method171(class225.field2586, field688.field1415);
            var85.field2693.method6011(arg1);
            var85.field2693.method5999(arg0);
            var85.field2693.method6166(arg3);
            field688.method2167(var85);
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 1005) {
            class247 var86 = class247.method3749(arg1);
            if (var86 == null || var86.field3086[arg0] < 100000) {
                class227 var87 = class227.method171(class225.field2647, field688.field1415);
                var87.field2693.method5999(arg3);
                field688.method2167(var87);
            } else {
                class111.method1459(27, "", var86.field3086[arg0] + " x " + class155.method4399(arg3).field1815);
            }
            field748 = 0;
            Statics.field3627 = class247.method3749(arg1);
            field842 = arg0;
        }
        if (arg2 == 19) {
            field792 = arg6;
            field744 = arg7;
            field746 = 2;
            field870 = 0;
            field745 = arg0;
            field787 = arg1;
            class227 var88 = class227.method171(class225.field2660, field688.field1415);
            var88.field2693.method5999(Statics.field2512 + arg0);
            var88.field2693.method6001(Statics.field458 + arg1);
            var88.field2693.method5980(class39.field286[82] ? 1 : 0);
            var88.field2693.method5999(arg3);
            field688.method2167(var88);
        }
        if (field795 != 0) {
            field795 = 0;
            method3353(class247.method3749(Statics.field1223));
        }
        if (field797) {
            method47();
        }
        if (Statics.field3627 != null && field748 == 0) {
            method3353(Statics.field3627);
        }
    }

    @ObfuscatedName("ca.it(IIIII)V")
    public static void method2033(int arg0, int arg1, int arg2, int arg3) {
        class247 var4 = class247.method4694(arg0, arg1);
        if (var4 != null && var4.field3056 != null) {
            class96 var5 = new class96();
            var5.field1173 = var4;
            var5.field1178 = var4.field3056;
            class79.method2186(var5);
        }
        field789 = arg3;
        field797 = true;
        Statics.field553 = arg0;
        field798 = arg1;
        Statics.field49 = arg2;
        method3353(var4);
    }

    @ObfuscatedName("j.ik(I)V")
    public static void method47() {
        if (!field797) {
            return;
        }
        class247 var0 = class247.method4694(Statics.field553, field798);
        if (var0 != null && var0.field3057 != null) {
            class96 var1 = new class96();
            var1.field1173 = var0;
            var1.field1178 = var0.field3057;
            class79.method2186(var1);
        }
        field789 = -1;
        field797 = false;
        method3353(var0);
    }

    @ObfuscatedName("t.ii(III)V")
    public static void method172(int arg0, int arg1) {
        class227 var2 = class227.method171(class225.field2653, field688.field1415);
        var2.field2693.method6018(arg1);
        var2.field2693.method6027(arg0);
        field688.method2167(var2);
    }

    @ObfuscatedName("nl.iu(IIIILjava/lang/String;I)V")
    public static void method5900(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class247 var5 = class247.method4694(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3022 != null) {
            class96 var6 = new class96();
            var6.field1173 = var5;
            var6.field1176 = arg0;
            var6.field1180 = arg4;
            var6.field1178 = var5.field3022;
            class79.method2186(var6);
        }
        boolean var7 = true;
        if (var5.field3065 > 0) {
            var7 = method2907(var5);
        }
        if (!var7 || !class248.method3783(method169(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class227 var8 = class227.method171(class225.field2605, field688.field1415);
            var8.field2693.method5951(arg1);
            var8.field2693.method6166(arg2);
            var8.field2693.method6166(arg3);
            field688.method2167(var8);
        }
        if (arg0 == 2) {
            class227 var9 = class227.method171(class225.field2604, field688.field1415);
            var9.field2693.method5951(arg1);
            var9.field2693.method6166(arg2);
            var9.field2693.method6166(arg3);
            field688.method2167(var9);
        }
        if (arg0 == 3) {
            class227 var10 = class227.method171(class225.field2617, field688.field1415);
            var10.field2693.method5951(arg1);
            var10.field2693.method6166(arg2);
            var10.field2693.method6166(arg3);
            field688.method2167(var10);
        }
        if (arg0 == 4) {
            class227 var11 = class227.method171(class225.field2679, field688.field1415);
            var11.field2693.method5951(arg1);
            var11.field2693.method6166(arg2);
            var11.field2693.method6166(arg3);
            field688.method2167(var11);
        }
        if (arg0 == 5) {
            class227 var12 = class227.method171(class225.field2593, field688.field1415);
            var12.field2693.method5951(arg1);
            var12.field2693.method6166(arg2);
            var12.field2693.method6166(arg3);
            field688.method2167(var12);
        }
        if (arg0 == 6) {
            class227 var13 = class227.method171(class225.field2651, field688.field1415);
            var13.field2693.method5951(arg1);
            var13.field2693.method6166(arg2);
            var13.field2693.method6166(arg3);
            field688.method2167(var13);
        }
        if (arg0 == 7) {
            class227 var14 = class227.method171(class225.field2649, field688.field1415);
            var14.field2693.method5951(arg1);
            var14.field2693.method6166(arg2);
            var14.field2693.method6166(arg3);
            field688.method2167(var14);
        }
        if (arg0 == 8) {
            class227 var15 = class227.method171(class225.field2614, field688.field1415);
            var15.field2693.method5951(arg1);
            var15.field2693.method6166(arg2);
            var15.field2693.method6166(arg3);
            field688.method2167(var15);
        }
        if (arg0 == 9) {
            class227 var16 = class227.method171(class225.field2594, field688.field1415);
            var16.field2693.method5951(arg1);
            var16.field2693.method6166(arg2);
            var16.field2693.method6166(arg3);
            field688.method2167(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class227 var17 = class227.method171(class225.field2633, field688.field1415);
        var17.field2693.method5951(arg1);
        var17.field2693.method6166(arg2);
        var17.field2693.method6166(arg3);
        field688.method2167(var17);
    }

    @ObfuscatedName("nz.ic(I)V")
    public static final void method5908() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field779 - 1; var1++) {
                if (field782[var1] < 1000 && field782[var1 + 1] > 1000) {
                    String var2 = field785[var1];
                    field785[var1] = field785[var1 + 1];
                    field785[var1 + 1] = var2;
                    String var3 = field856[var1];
                    field856[var1] = field856[var1 + 1];
                    field856[var1 + 1] = var3;
                    int var4 = field782[var1];
                    field782[var1] = field782[var1 + 1];
                    field782[var1 + 1] = var4;
                    int var5 = field780[var1];
                    field780[var1] = field780[var1 + 1];
                    field780[var1 + 1] = var5;
                    int var6 = field835[var1];
                    field835[var1] = field835[var1 + 1];
                    field835[var1 + 1] = var6;
                    int var7 = field783[var1];
                    field783[var1] = field783[var1 + 1];
                    field783[var1 + 1] = var7;
                    boolean var8 = field717[var1];
                    field717[var1] = field717[var1 + 1];
                    field717[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("gn.ig(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3750(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3902(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("hw.io(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3902(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field778 || field779 >= 500) {
            return;
        }
        field856[field779] = arg0;
        field785[field779] = arg1;
        field782[field779] = arg2;
        field783[field779] = arg3;
        field780[field779] = arg4;
        field835[field779] = arg5;
        field717[field779] = arg6;
        field779++;
    }

    @ObfuscatedName("ek.is(I)I")
    public static final int method2360() {
        return field779 - 1;
    }

    @ObfuscatedName("b.id(B)V")
    public static void method54() {
        for (int var0 = 0; var0 < field779; var0++) {
            int var1 = field782[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field779 - 1) {
                    for (int var3 = var0; var3 < field779 - 1; var3++) {
                        field856[var3] = field856[var3 + 1];
                        field785[var3] = field785[var3 + 1];
                        field782[var3] = field782[var3 + 1];
                        field783[var3] = field783[var3 + 1];
                        field780[var3] = field780[var3 + 1];
                        field835[var3] = field835[var3 + 1];
                        field717[var3] = field717[var3 + 1];
                    }
                }
                var0--;
                field779--;
            }
        }
        method149();
    }

    @ObfuscatedName("cb.il(II)Ljava/lang/String;")
    public static String method1907(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field785[arg0].length() > 0) {
            return field856[arg0] + class268.field3398 + field785[arg0];
        } else {
            return field856[arg0];
        }
    }

    @ObfuscatedName("f.im(IIIII)V")
    public static final void method18(int arg0, int arg1, int arg2, int arg3) {
        if (field795 == 0 && !field797) {
            method3750(class268.field3393, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class206.method2843(); var8++) {
            long var9 = class206.method2485(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class206.method49(var8);
                int var12 = class206.method1005(var8);
                int var13 = class206.method4403(var8);
                int var14 = Statics.method1888(class206.field2501[var8]);
                int var15 = var14;
                if (var13 == 2 && Statics.field3862.method3600(Statics.field196, var11, var12, var9) >= 0) {
                    class154 var16 = class154.method175(var14);
                    if (var16.field1794 != null) {
                        var16 = var16.method2720();
                    }
                    if (var16 == null) {
                        continue;
                    }
                    if (field795 == 1) {
                        method3750(class268.field3388, field796 + " " + class106.field1352 + " " + class106.method348(65535) + var16.field1763, 1, var14, var11, var12);
                    } else if (!field797) {
                        String[] var17 = var16.field1780;
                        if (var17 != null) {
                            for (int var18 = 4; var18 >= 0; var18--) {
                                if (var17[var18] != null) {
                                    short var19 = 0;
                                    if (var18 == 0) {
                                        var19 = 3;
                                    }
                                    if (var18 == 1) {
                                        var19 = 4;
                                    }
                                    if (var18 == 2) {
                                        var19 = 5;
                                    }
                                    if (var18 == 3) {
                                        var19 = 6;
                                    }
                                    if (var18 == 4) {
                                        var19 = 1001;
                                    }
                                    method3750(var17[var18], class106.method348(65535) + var16.field1763, var19, var15, var11, var12);
                                }
                            }
                        }
                        method3750(class268.field3313, class106.method348(65535) + var16.field1763, 1002, var16.field1760, var11, var12);
                    } else if ((Statics.field49 & 0x4) == 4) {
                        method3750(field800, field770 + " " + class106.field1352 + " " + class106.method348(65535) + var16.field1763, 2, var14, var11, var12);
                    }
                }
                if (var13 == 1) {
                    class105 var20 = field683[var15];
                    if (var20 == null) {
                        continue;
                    }
                    if (var20.field1346.field1637 == 1 && (var20.field1238 & 0x7F) == 64 && (var20.field1237 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field684; var21++) {
                            class105 var22 = field683[field685[var21]];
                            if (var22 != null && var20 != var22 && var22.field1346.field1637 == 1 && var20.field1238 == var22.field1238 && var20.field1237 == var22.field1237) {
                                method231(var22.field1346, field685[var21], var11, var12);
                            }
                        }
                        int var23 = class109.field1376;
                        int[] var24 = class109.field1381;
                        for (int var25 = 0; var25 < var23; var25++) {
                            class98 var26 = field830[var24[var25]];
                            if (var26 != null && var20.field1238 == var26.field1238 && var20.field1237 == var26.field1237) {
                                Statics.method2695(var26, var24[var25], var11, var12);
                            }
                        }
                    }
                    method231(var20.field1346, var15, var11, var12);
                }
                if (var13 == 0) {
                    class98 var27 = field830[var15];
                    if (var27 == null) {
                        continue;
                    }
                    if ((var27.field1238 & 0x7F) == 64 && (var27.field1237 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < field684; var28++) {
                            class105 var29 = field683[field685[var28]];
                            if (var29 != null && var29.field1346.field1637 == 1 && var27.field1238 == var29.field1238 && var27.field1237 == var29.field1237) {
                                method231(var29.field1346, field685[var28], var11, var12);
                            }
                        }
                        int var30 = class109.field1376;
                        int[] var31 = class109.field1381;
                        for (int var32 = 0; var32 < var30; var32++) {
                            class98 var33 = field830[var31[var32]];
                            if (var33 != null && var27 != var33 && var27.field1238 == var33.field1238 && var27.field1237 == var33.field1237) {
                                Statics.method2695(var33, var31[var32], var11, var12);
                            }
                        }
                    }
                    if (field769 == var15) {
                        var4 = var9;
                    } else {
                        Statics.method2695(var27, var15, var11, var12);
                    }
                }
                if (var13 == 3) {
                    class294 var34 = field860[Statics.field196][var11][var12];
                    if (var34 != null) {
                        for (class108 var35 = (class108) var34.method4715(); var35 != null; var35 = (class108) var34.method4717()) {
                            class155 var36 = class155.method4399(var35.field1367);
                            if (field795 == 1) {
                                method3750(class268.field3388, field796 + " " + class106.field1352 + " " + class106.method348(16748608) + var36.field1815, 16, var35.field1367, var11, var12);
                            } else if (!field797) {
                                String[] var37 = var36.field1829;
                                for (int var38 = 4; var38 >= 0; var38--) {
                                    if (var37 != null && var37[var38] != null) {
                                        byte var39 = 0;
                                        if (var38 == 0) {
                                            var39 = 18;
                                        }
                                        if (var38 == 1) {
                                            var39 = 19;
                                        }
                                        if (var38 == 2) {
                                            var39 = 20;
                                        }
                                        if (var38 == 3) {
                                            var39 = 21;
                                        }
                                        if (var38 == 4) {
                                            var39 = 22;
                                        }
                                        method3750(var37[var38], class106.method348(16748608) + var36.field1815, var39, var35.field1367, var11, var12);
                                    } else if (var38 == 2) {
                                        method3750(class268.field3235, class106.method348(16748608) + var36.field1815, 20, var35.field1367, var11, var12);
                                    }
                                }
                                method3750(class268.field3313, class106.method348(16748608) + var36.field1815, 1004, var35.field1367, var11, var12);
                            } else if ((Statics.field49 & 0x1) == 1) {
                                method3750(field800, field770 + " " + class106.field1352 + " " + class106.method348(16748608) + var36.field1815, 17, var35.field1367, var11, var12);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var40 = class206.method2395(var4);
            int var41 = class206.method3982(var4);
            class98 var42 = field830[field769];
            Statics.method2695(var42, field769, var40, var41);
        }
    }

    @ObfuscatedName("as.ip(Lef;IIII)V")
    public static final void method231(class146 arg0, int arg1, int arg2, int arg3) {
        if (field779 >= 400) {
            return;
        }
        if (arg0.field1640 != null) {
            arg0 = arg0.method2532();
        }
        if (arg0 == null || !arg0.field1664 || arg0.field1666 && field825 != arg1) {
            return;
        }
        String var4 = arg0.field1636;
        if (arg0.field1631 != 0) {
            int var6 = arg0.field1631;
            int var7 = Statics.field1163.field1198;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class106.method348(16711680);
            } else if (var8 < -6) {
                var9 = class106.method348(16723968);
            } else if (var8 < -3) {
                var9 = class106.method348(16740352);
            } else if (var8 < 0) {
                var9 = class106.method348(16756736);
            } else if (var8 > 9) {
                var9 = class106.method348(65280);
            } else if (var8 > 6) {
                var9 = class106.method348(4259584);
            } else if (var8 > 3) {
                var9 = class106.method348(8453888);
            } else if (var8 > 0) {
                var9 = class106.method348(12648192);
            } else {
                var9 = class106.method348(16776960);
            }
            var4 = var4 + var9 + " " + class106.field1350 + class268.field3394 + arg0.field1631 + class106.field1351;
        }
        if (arg0.field1666 && field649) {
            method3750(class268.field3313, class106.method348(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field795 == 1) {
            method3750(class268.field3388, field796 + " " + class106.field1352 + " " + class106.method348(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field797) {
            int var10 = arg0.field1666 && field649 ? 2000 : 0;
            String[] var11 = arg0.field1651;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class268.field3384)) {
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
                        method3750(var11[var12], class106.method348(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class268.field3384)) {
                        short var15 = 0;
                        if (field668 != class107.field1360) {
                            if (field668 == class107.field1359 || field668 == class107.field1363 && arg0.field1631 > Statics.field1163.field1198) {
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
                            method3750(var11[var14], class106.method348(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field1666 || !field649) {
                method3750(class268.field3313, class106.method348(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field49 & 0x2) == 2) {
            method3750(field800, field770 + " " + class106.field1352 + " " + class106.method348(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ha.ia(IIIIIIIIB)V")
    public static final void method3965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class247.method2363(arg0)) {
            Statics.field50 = null;
            method5041(Statics.field2951[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field50 != null) {
                method5041(Statics.field50, -1412584499, arg1, arg2, arg3, arg4, Statics.field39, Statics.field1021, arg7);
                Statics.field50 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field720[var8] = true;
            }
        } else {
            field720[arg7] = true;
        }
    }

    @ObfuscatedName("kp.ij([Lio;IIIIIIIII)V")
    public static final void method5041(class247[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class392.method6277(arg2, arg3, arg4, arg5);
        class196.method3491();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class247 var10 = arg0[var9];
            if (var10 != null && (var10.field3010 == arg1 || arg1 == -1412584499 && field815 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field920[field871] = var10.field2972 + arg6;
                    field743[field871] = var10.field2973 + arg7;
                    field764[field871] = var10.field2962;
                    field857[field871] = var10.field2975;
                    var11 = ++field871 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3098 = var11;
                var10.field2947 = field650;
                if (!var10.field2958 || !method2709(var10)) {
                    if (var10.field3065 > 0) {
                        method4397(var10);
                    }
                    int var12 = var10.field2972 + arg6;
                    int var13 = var10.field2973 + arg7;
                    int var14 = var10.field2990;
                    if (field815 == var10) {
                        if (arg1 != -1412584499 && !var10.field2954) {
                            Statics.field50 = arg0;
                            Statics.field39 = arg6;
                            Statics.field1021 = arg7;
                            continue;
                        }
                        if (field826 && field820) {
                            int var15 = class48.field389;
                            int var16 = class48.field370;
                            int var17 = var15 - field817;
                            int var18 = var16 - field670;
                            if (var17 < field741) {
                                var17 = field741;
                            }
                            if (var10.field2962 + var17 > field741 + field816.field2962) {
                                var17 = field741 + field816.field2962 - var10.field2962;
                            }
                            if (var18 < field822) {
                                var18 = field822;
                            }
                            if (var10.field2975 + var18 > field822 + field816.field2975) {
                                var18 = field822 + field816.field2975 - var10.field2975;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2954) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2961 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2961 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2962 + var12;
                        int var26 = var10.field2975 + var13;
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
                        int var29 = var10.field2962 + var12;
                        int var30 = var10.field2975 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2958 || var19 < var21 && var20 < var22) {
                        if (var10.field3065 != 0) {
                            if (var10.field3065 == 1336) {
                                if (field656) {
                                    var13 += 15;
                                    Statics.field1447.method4964("Fps:" + field338, var10.field2962 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field642) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1447.method4964("Mem:" + var32 + "k", var10.field2962 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3065 == 1337) {
                                field791 = var12;
                                field754 = var13;
                                method967(var12, var13, var10.field2962, var10.field2975);
                                field720[var10.field3098] = true;
                                class392.method6277(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3065 == 1338) {
                                method1567(var10, var12, var13, var11);
                                class392.method6277(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3065 == 1339) {
                                method143(var10, var12, var13, var11);
                                class392.method6277(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3065 == 1400) {
                                Statics.field2928.method5552(var12, var13, var10.field2962, var10.field2975, field650);
                            }
                            if (var10.field3065 == 1401) {
                                Statics.field2928.method5640(var12, var13, var10.field2962, var10.field2975);
                            }
                            if (var10.field3065 == 1402) {
                                Statics.field210.method2020(var12, field650);
                            }
                        }
                        if (var10.field2961 == 0) {
                            if (!var10.field2958 && method2709(var10) && Statics.field937 != var10) {
                                continue;
                            }
                            if (!var10.field2958) {
                                if (var10.field2981 > var10.field2983 - var10.field2975) {
                                    var10.field2981 = var10.field2983 - var10.field2975;
                                }
                                if (var10.field2981 < 0) {
                                    var10.field2981 = 0;
                                }
                            }
                            method5041(arg0, var10.field2959, var19, var20, var21, var22, var12 - var10.field2980, var13 - var10.field2981, var11);
                            if (var10.field3091 != null) {
                                method5041(var10.field3091, var10.field2959, var19, var20, var21, var22, var12 - var10.field2980, var13 - var10.field2981, var11);
                            }
                            class95 var34 = (class95) field803.method5766((long) var10.field2959);
                            if (var34 != null) {
                                method3965(var34.field1164, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class392.method6277(arg2, arg3, arg4, arg5);
                            class196.method3491();
                        }
                        if (field900 || field861[var11] || field858 > 1) {
                            if (var10.field2961 == 0 && !var10.field2958 && var10.field2983 > var10.field2975) {
                                method207(var10.field2962 + var12, var13, var10.field2981, var10.field2975, var10.field2983);
                            }
                            if (var10.field2961 != 1) {
                                if (var10.field2961 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2971; var36++) {
                                        for (int var37 = 0; var37 < var10.field2970; var37++) {
                                            int var38 = (var10.field2982 + 32) * var37 + var12;
                                            int var39 = (var10.field3027 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2955[var35];
                                                var39 += var10.field3029[var35];
                                            }
                                            if (var10.field3085[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3085[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field1086 == var10 && field773 == var35) {
                                                    class396 var43;
                                                    if (field795 == 1 && Statics.field83 == var35 && Statics.field1223 == var10.field2959) {
                                                        var43 = class155.method3900(var42, var10.field3086[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class155.method3900(var42, var10.field3086[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method3353(var10);
                                                    } else if (Statics.field1086 == var10 && field773 == var35) {
                                                        int var44 = class48.field389 - field751;
                                                        int var45 = class48.field370 - field752;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field755 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method6361(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class247 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class392.field4224 && var46.field2981 > 0) {
                                                                int var47 = field914 * (class392.field4224 - var39 - var45) / 3;
                                                                if (var47 > field914 * 10) {
                                                                    var47 = field914 * 10;
                                                                }
                                                                if (var47 > var46.field2981) {
                                                                    var47 = var46.field2981;
                                                                }
                                                                var46.field2981 -= var47;
                                                                field752 += var47;
                                                                method3353(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class392.field4222 && var46.field2981 < var46.field2983 - var46.field2975) {
                                                                int var48 = field914 * (var39 + var45 + 32 - class392.field4222) / 3;
                                                                if (var48 > field914 * 10) {
                                                                    var48 = field914 * 10;
                                                                }
                                                                if (var48 > var46.field2983 - var46.field2975 - var46.field2981) {
                                                                    var48 = var46.field2983 - var46.field2975 - var46.field2981;
                                                                }
                                                                var46.field2981 += var48;
                                                                field752 -= var48;
                                                                method3353(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field3627 == var10 && field842 == var35) {
                                                        var43.method6361(var38, var39, 128);
                                                    } else {
                                                        var43.method6355(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3064 != null && var35 < 20) {
                                                class396 var49 = var10.method4321(var35);
                                                if (var49 != null) {
                                                    var49.method6355(var38, var39);
                                                } else if (class247.field2957) {
                                                    method3353(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2961 == 3) {
                                    int var50;
                                    if (method2382(var10)) {
                                        var50 = var10.field2985;
                                        if (Statics.field937 == var10 && var10.field3088 != 0) {
                                            var50 = var10.field3088;
                                        }
                                    } else {
                                        var50 = var10.field3103;
                                        if (Statics.field937 == var10 && var10.field2986 != 0) {
                                            var50 = var10.field2986;
                                        }
                                    }
                                    if (var10.field2988) {
                                        switch(var10.field2989.field4231) {
                                            case 1:
                                                class392.method6293(var12, var13, var10.field2962, var10.field2975, var10.field3103, var10.field2985);
                                                break;
                                            case 2:
                                                class392.method6252(var12, var13, var10.field2962, var10.field2975, var10.field3103, var10.field2985, 255 - (var10.field2990 & 0xFF), 255 - (var10.field3012 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class392.method6265(var12, var13, var10.field2962, var10.field2975, var50);
                                                } else {
                                                    class392.method6249(var12, var13, var10.field2962, var10.field2975, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class392.method6254(var12, var13, var10.field2962, var10.field2975, var50);
                                    } else {
                                        class392.method6255(var12, var13, var10.field2962, var10.field2975, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2961 == 4) {
                                    class300 var51 = var10.method4297();
                                    if (var51 != null) {
                                        String var52 = var10.field2994;
                                        int var53;
                                        if (method2382(var10)) {
                                            var53 = var10.field2985;
                                            if (Statics.field937 == var10 && var10.field3088 != 0) {
                                                var53 = var10.field3088;
                                            }
                                            if (var10.field3021.length() > 0) {
                                                var52 = var10.field3021;
                                            }
                                        } else {
                                            var53 = var10.field3103;
                                            if (Statics.field937 == var10 && var10.field2986 != 0) {
                                                var53 = var10.field2986;
                                            }
                                        }
                                        if (var10.field2958 && var10.field3087 != -1) {
                                            class155 var54 = class155.method4399(var10.field3087);
                                            var52 = var54.field1815;
                                            if (var52 == null) {
                                                var52 = class268.field3242;
                                            }
                                            if ((var54.field1813 == 1 || var10.field3019 != 1) && var10.field3019 != -1) {
                                                var52 = class106.method348(16748608) + var52 + class106.field1354 + " " + 'x' + method2240(var10.field3019);
                                            }
                                        }
                                        if (field808 == var10) {
                                            var52 = class268.field3411;
                                            var53 = var10.field3103;
                                        }
                                        if (!var10.field2958) {
                                            var52 = method2319(var52, var10);
                                        }
                                        var51.method4905(var52, var12, var13, var10.field2962, var10.field2975, var53, var10.field3025 ? 0 : -1, var10.field3081, var10.field2976, var10.field3038);
                                    } else if (class247.field2957) {
                                        method3353(var10);
                                    }
                                } else if (var10.field2961 == 5) {
                                    if (var10.field2958) {
                                        class396 var56;
                                        if (var10.field3087 == -1) {
                                            var56 = var10.method4296(false);
                                        } else {
                                            var56 = class155.method3900(var10.field3087, var10.field3019, var10.field2998, var10.field2999, var10.field3018, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4246;
                                            int var58 = var56.field4250;
                                            if (var10.field2997) {
                                                class392.method6263(var12, var13, var10.field2962 + var12, var10.field2975 + var13);
                                                int var59 = (var10.field2962 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2975 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2996 != 0) {
                                                            var56.method6373(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2996, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method6355(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method6361(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class392.method6277(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2962 * 4096 / var57;
                                                if (var10.field2996 != 0) {
                                                    var56.method6373(var10.field2962 / 2 + var12, var10.field2975 / 2 + var13, var10.field2996, var63);
                                                } else if (var14 != 0) {
                                                    var56.method6363(var12, var13, var10.field2962, var10.field2975, 256 - (var14 & 0xFF));
                                                } else if (var10.field2962 == var57 && var10.field2975 == var58) {
                                                    var56.method6355(var12, var13);
                                                } else {
                                                    var56.method6357(var12, var13, var10.field2962, var10.field2975);
                                                }
                                            }
                                        } else if (class247.field2957) {
                                            method3353(var10);
                                        }
                                    } else {
                                        class396 var55 = var10.method4296(method2382(var10));
                                        if (var55 != null) {
                                            var55.method6355(var12, var13);
                                        } else if (class247.field2957) {
                                            method3353(var10);
                                        }
                                    }
                                } else if (var10.field2961 == 6) {
                                    boolean var64 = method2382(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2953;
                                    } else {
                                        var65 = var10.field3006;
                                    }
                                    class205 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3087 != -1) {
                                        class155 var68 = class155.method4399(var10.field3087);
                                        if (var68 != null) {
                                            class155 var69 = var68.method2781(var10.field3019);
                                            var66 = var69.method2776(1);
                                            if (var66 == null) {
                                                method3353(var10);
                                            } else {
                                                var66.method3791();
                                                var67 = var66.field2360 / 2;
                                            }
                                        }
                                    } else if (var10.field3002 == 5) {
                                        if (var10.field3003 == 0) {
                                            var66 = field838.method4254((class157) null, -1, (class157) null, -1);
                                        } else {
                                            var66 = Statics.field1163.method1710();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4299((class157) null, -1, var64, Statics.field1163.field1194);
                                        if (var66 == null && class247.field2957) {
                                            method3353(var10);
                                        }
                                    } else {
                                        class157 var70 = class157.method2030(var65);
                                        var66 = var10.method4299(var70, var10.field2974, var64, Statics.field1163.field1194);
                                        if (var66 == null && class247.field2957) {
                                            method3353(var10);
                                        }
                                    }
                                    class196.method3494(var10.field2962 / 2 + var12, var10.field2975 / 2 + var13);
                                    int var71 = var10.field3063 * class196.field2275[var10.field3000] >> 16;
                                    int var72 = var10.field3063 * class196.field2286[var10.field3000] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2958) {
                                            var66.method3791();
                                            if (var10.field2946) {
                                                var66.method3847(0, var10.field3011, var10.field2995, var10.field3000, var10.field3008, var10.field3009 + var67 + var71, var10.field3009 + var72, var10.field3063);
                                            } else {
                                                var66.method3855(0, var10.field3011, var10.field2995, var10.field3000, var10.field3008, var10.field3009 + var67 + var71, var10.field3009 + var72);
                                            }
                                        } else {
                                            var66.method3855(0, var10.field3011, 0, var10.field3000, 0, var71, var72);
                                        }
                                    }
                                    class196.method3495();
                                } else {
                                    if (var10.field2961 == 7) {
                                        class300 var73 = var10.method4297();
                                        if (var73 == null) {
                                            if (class247.field2957) {
                                                method3353(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2971; var75++) {
                                            for (int var76 = 0; var76 < var10.field2970; var76++) {
                                                if (var10.field3085[var74] > 0) {
                                                    class155 var77 = class155.method4399(var10.field3085[var74] - 1);
                                                    String var78;
                                                    if (var77.field1813 != 1 && var10.field3086[var74] == 1) {
                                                        var78 = class106.method348(16748608) + var77.field1815 + class106.field1354;
                                                    } else {
                                                        var78 = class106.method348(16748608) + var77.field1815 + class106.field1354 + " " + 'x' + method2240(var10.field3086[var74]);
                                                    }
                                                    int var79 = (var10.field2982 + 115) * var76 + var12;
                                                    int var80 = (var10.field3027 + 12) * var75 + var13;
                                                    if (var10.field3081 == 0) {
                                                        var73.method4891(var78, var79, var80, var10.field3103, var10.field3025 ? 0 : -1);
                                                    } else if (var10.field3081 == 1) {
                                                        var73.method4894(var78, var10.field2962 / 2 + var79, var80, var10.field3103, var10.field3025 ? 0 : -1);
                                                    } else {
                                                        var73.method4964(var78, var10.field2962 + var79 - 1, var80, var10.field3103, var10.field3025 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2961 == 8 && Statics.field610 == var10 && field834 == field793) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class300 var83 = Statics.field1447;
                                        String var84 = var10.field2994;
                                        String var85 = method2319(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class106.field1353);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4906(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3730 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2962 + var12 - 5 - var81;
                                        int var90 = var10.field2975 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class392.method6265(var89, var90, var81, var82, 16777120);
                                        class392.method6254(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2994;
                                        int var92 = var83.field3730 + var90 + 2;
                                        String var93 = method2319(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class106.field1353);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4891(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3730 + 1;
                                        }
                                    }
                                    if (var10.field2961 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2993) {
                                            var96 = var12;
                                            var97 = var10.field2975 + var13;
                                            var98 = var10.field2962 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2962 + var12;
                                            var99 = var10.field2975 + var13;
                                        }
                                        if (var10.field3020 == 1) {
                                            class392.method6248(var96, var97, var98, var99, var10.field3103);
                                        } else {
                                            method32(var96, var97, var98, var99, var10.field3103, var10.field3020);
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

    @ObfuscatedName("y.ix(IIIIIII)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class392.field4226;
        int var18 = arg1 - class392.field4224;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class196.method3502(var19, var20, var21);
        class196.method3565(var23, var24, var25, var19, var20, var21, arg4);
        class196.method3502(var19, var21, var22);
        class196.method3565(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("dm.iw(Ljava/lang/String;Lio;B)Ljava/lang/String;")
    public static String method2319(String arg0, class247 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method4695(arg1, var2 - 1);
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

    @ObfuscatedName("dx.iv(II)Ljava/lang/String;")
    public static final String method2240(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class106.field1355 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class106.method348(65408) + var1.substring(0, var1.length() - 8) + class268.field3334 + " " + class106.field1350 + var1 + class106.field1351 + class106.field1354;
        } else if (var1.length() > 6) {
            return " " + class106.method348(16777215) + var1.substring(0, var1.length() - 4) + class268.field3401 + " " + class106.field1350 + var1 + class106.field1351 + class106.field1354;
        } else {
            return " " + class106.method348(16776960) + var1 + class106.field1354;
        }
    }

    @ObfuscatedName("client.iy(ZI)V")
    public final void method1033(boolean arg0) {
        method4412(field637, Statics.field247, Statics.field603, arg0);
    }

    @ObfuscatedName("client.ib(Lio;I)V")
    public void method1034(class247 arg0) {
        class247 var2 = arg0.field3010 == -1 ? null : class247.method3749(arg0.field3010);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field247;
            var4 = Statics.field603;
        } else {
            var3 = var2.field2962;
            var4 = var2.field2975;
        }
        method2362(arg0, var3, var4, false);
        method178(arg0, var3, var4);
    }

    @ObfuscatedName("lk.ji([Lio;Lio;ZI)V")
    public static void method5145(class247[] arg0, class247 arg1, boolean arg2) {
        int var3 = arg1.field3077 == 0 ? arg1.field2962 : arg1.field3077;
        int var4 = arg1.field2983 == 0 ? arg1.field2975 : arg1.field2983;
        method188(arg0, arg1.field2959, var3, var4, arg2);
        if (arg1.field3091 != null) {
            method188(arg1.field3091, arg1.field2959, var3, var4, arg2);
        }
        class95 var5 = (class95) field803.method5766((long) arg1.field2959);
        if (var5 != null) {
            method4412(var5.field1164, var3, var4, arg2);
        }
        if (arg1.field3065 == 1337) {
        }
    }

    @ObfuscatedName("ja.jw(IIIZB)V")
    public static final void method4412(int arg0, int arg1, int arg2, boolean arg3) {
        if (class247.method2363(arg0)) {
            method188(Statics.field2951[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ap.jk([Lio;IIIZI)V")
    public static void method188(class247[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class247 var6 = arg0[var5];
            if (var6 != null && var6.field3010 == arg1) {
                method2362(var6, arg2, arg3, arg4);
                method178(var6, arg2, arg3);
                if (var6.field2980 > var6.field3077 - var6.field2962) {
                    var6.field2980 = var6.field3077 - var6.field2962;
                }
                if (var6.field2980 < 0) {
                    var6.field2980 = 0;
                }
                if (var6.field2981 > var6.field2983 - var6.field2975) {
                    var6.field2981 = var6.field2983 - var6.field2975;
                }
                if (var6.field2981 < 0) {
                    var6.field2981 = 0;
                }
                if (var6.field2961 == 0) {
                    method5145(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ez.jd(Lio;IIZI)V")
    public static void method2362(class247 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2962;
        int var5 = arg0.field2975;
        if (arg0.field2966 == 0) {
            arg0.field2962 = arg0.field2970;
        } else if (arg0.field2966 == 1) {
            arg0.field2962 = arg1 - arg0.field2970;
        } else if (arg0.field2966 == 2) {
            arg0.field2962 = arg0.field2970 * arg1 >> 14;
        }
        if (arg0.field2967 == 0) {
            arg0.field2975 = arg0.field2971;
        } else if (arg0.field2967 == 1) {
            arg0.field2975 = arg2 - arg0.field2971;
        } else if (arg0.field2967 == 2) {
            arg0.field2975 = arg0.field2971 * arg2 >> 14;
        }
        if (arg0.field2966 == 4) {
            arg0.field2962 = arg0.field3061 * arg0.field2975 / arg0.field2977;
        }
        if (arg0.field2967 == 4) {
            arg0.field2975 = arg0.field2977 * arg0.field2962 / arg0.field3061;
        }
        if (arg0.field3065 == 1337) {
            field839 = arg0;
        }
        if (arg3 && arg0.field3076 != null && (arg0.field2962 != var4 || arg0.field2975 != var5)) {
            class96 var6 = new class96();
            var6.field1173 = arg0;
            var6.field1178 = arg0.field3076;
            field801.method4709(var6);
        }
    }

    @ObfuscatedName("q.jl(Lio;III)V")
    public static void method178(class247 arg0, int arg1, int arg2) {
        if (arg0.field2964 == 0) {
            arg0.field2972 = arg0.field3017;
        } else if (arg0.field2964 == 1) {
            arg0.field2972 = (arg1 - arg0.field2962) / 2 + arg0.field3017;
        } else if (arg0.field2964 == 2) {
            arg0.field2972 = arg1 - arg0.field2962 - arg0.field3017;
        } else if (arg0.field2964 == 3) {
            arg0.field2972 = arg0.field3017 * arg1 >> 14;
        } else if (arg0.field2964 == 4) {
            arg0.field2972 = (arg0.field3017 * arg1 >> 14) + (arg1 - arg0.field2962) / 2;
        } else {
            arg0.field2972 = arg1 - arg0.field2962 - (arg0.field3017 * arg1 >> 14);
        }
        if (arg0.field2965 == 0) {
            arg0.field2973 = arg0.field2969;
        } else if (arg0.field2965 == 1) {
            arg0.field2973 = (arg2 - arg0.field2975) / 2 + arg0.field2969;
        } else if (arg0.field2965 == 2) {
            arg0.field2973 = arg2 - arg0.field2975 - arg0.field2969;
        } else if (arg0.field2965 == 3) {
            arg0.field2973 = arg0.field2969 * arg2 >> 14;
        } else if (arg0.field2965 == 4) {
            arg0.field2973 = (arg0.field2969 * arg2 >> 14) + (arg2 - arg0.field2975) / 2;
        } else {
            arg0.field2973 = arg2 - arg0.field2975 - (arg0.field2969 * arg2 >> 14);
        }
    }

    @ObfuscatedName("lk.jh(Lio;IIIIIII)V")
    public static final void method5144(class247 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field709) {
            field710 = 32;
        } else {
            field710 = 0;
        }
        field709 = false;
        if (class48.field376 == 1 || !Statics.field666 && class48.field376 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2981 -= 4;
                method3353(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2981 += 4;
                method3353(arg0);
            } else if (arg5 >= arg1 - field710 && arg5 < field710 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2981 = (arg4 - arg3) * var8 / var9;
                method3353(arg0);
                field709 = true;
            }
        }
        if (field844 == 0) {
            return;
        }
        int var10 = arg0.field2962;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2981 += field844 * 45;
            method3353(arg0);
        }
    }

    @ObfuscatedName("ar.jq(IIIIIB)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1202[0].method6324(arg0, arg1);
        Statics.field1202[1].method6324(arg0, arg1 + arg3 - 16);
        class392.method6265(arg0, arg1 + 16, 16, arg3 - 32, field705);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class392.method6265(arg0, arg1 + 16 + var6, 16, var5, field706);
        class392.method6258(arg0, arg1 + 16 + var6, var5, field708);
        class392.method6258(arg0 + 1, arg1 + 16 + var6, var5, field708);
        class392.method6309(arg0, arg1 + 16 + var6, 16, field708);
        class392.method6309(arg0, arg1 + 17 + var6, 16, field708);
        class392.method6258(arg0 + 15, arg1 + 16 + var6, var5, field707);
        class392.method6258(arg0 + 14, arg1 + 17 + var6, var5 - 1, field707);
        class392.method6309(arg0, arg1 + 15 + var6 + var5, 16, field707);
        class392.method6309(arg0 + 1, arg1 + 14 + var6 + var5, 15, field707);
    }

    @ObfuscatedName("ep.jo(Lio;I)Z")
    public static final boolean method2382(class247 arg0) {
        if (arg0.field3028 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3028.length; var1++) {
            int var2 = method4695(arg0, var1);
            int var3 = arg0.field3051[var1];
            if (arg0.field3028[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3028[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3028[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("kl.jn(Lio;II)I")
    public static final int method4695(class247 arg0, int arg1) {
        if (arg0.field3079 == null || arg1 >= arg0.field3079.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3079[arg1];
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
                    var7 = field774[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field775[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field776[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class247 var11 = class247.method3749(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class155.method4399(var12).field1828 || field641)) {
                        for (int var13 = 0; var13 < var11.field3085.length; var13++) {
                            if (var12 + 1 == var11.field3085[var13]) {
                                var7 += var11.field3086[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class242.field2918[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class257.field3169[field775[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class242.field2918[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1163.field1198;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class257.field3172[var14]) {
                            var7 += field775[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class247 var17 = class247.method3749(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class155.method4399(var18).field1828 || field641)) {
                        for (int var19 = 0; var19 < var17.field3085.length; var19++) {
                            if (var18 + 1 == var17.field3085[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field899;
                }
                if (var6 == 12) {
                    var7 = field767;
                }
                if (var6 == 13) {
                    int var20 = class242.field2918[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class242.method3569(var22);
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
                    var7 = (Statics.field1163.field1238 >> 7) + Statics.field2512;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1163.field1237 >> 7) + Statics.field458;
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

    @ObfuscatedName("dq.ja(Lio;Leq;IIZI)V")
    public static final void method2282(class247 arg0, class155 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field1838;
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
            var7 = class268.field3236;
        }
        if (var6 != -1 && var7 != null) {
            method3902(var7, class106.method348(16748608) + arg1.field1815, var6, arg1.field1856, arg2, arg0.field2959, arg4);
        }
    }

    @ObfuscatedName("cx.jy(Lio;III)V")
    public static final void method1998(class247 arg0, int arg1, int arg2) {
        if (arg0.field2984 == 1) {
            method3750(arg0.field3084, "", 24, 0, 0, arg0.field2959);
        }
        if (arg0.field2984 == 2 && !field797) {
            String var3 = method3901(arg0);
            if (var3 != null) {
                method3750(var3, class106.method348(65280) + arg0.field3083, 25, 0, -1, arg0.field2959);
            }
        }
        if (arg0.field2984 == 3) {
            method3750(class268.field3397, "", 26, 0, 0, arg0.field2959);
        }
        if (arg0.field2984 == 4) {
            method3750(arg0.field3084, "", 28, 0, 0, arg0.field2959);
        }
        if (arg0.field2984 == 5) {
            method3750(arg0.field3084, "", 29, 0, 0, arg0.field2959);
        }
        if (arg0.field2984 == 6 && field808 == null) {
            method3750(arg0.field3084, "", 30, 0, -1, arg0.field2959);
        }
        if (arg0.field2961 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2975; var5++) {
                for (int var6 = 0; var6 < arg0.field2962; var6++) {
                    int var7 = (arg0.field2982 + 32) * var6;
                    int var8 = (arg0.field3027 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2955[var4];
                        var8 += arg0.field3029[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field771 = var4;
                        Statics.field156 = arg0;
                        if (arg0.field3085[var4] > 0) {
                            class155 var9 = class155.method4399(arg0.field3085[var4] - 1);
                            if (field795 == 1 && class248.method1480(method169(arg0))) {
                                if (Statics.field1223 != arg0.field2959 || Statics.field83 != var4) {
                                    method3750(class268.field3388, field796 + " " + class106.field1352 + " " + class106.method348(16748608) + var9.field1815, 31, var9.field1856, var4, arg0.field2959);
                                }
                            } else if (!field797 || !class248.method1480(method169(arg0))) {
                                String[] var10 = var9.field1838;
                                int var11 = -1;
                                if (field788) {
                                    boolean var12 = field723 || class39.field286[81];
                                    if (var12) {
                                        var11 = var9.method2782();
                                    }
                                }
                                if (class248.method1480(method169(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method2282(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                if (class248.method2667(method169(arg0))) {
                                    method3750(class268.field3388, class106.method348(16748608) + var9.field1815, 38, var9.field1856, var4, arg0.field2959);
                                }
                                if (class248.method1480(method169(arg0))) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11 != var14) {
                                            method2282(arg0, var9, var4, var14, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method2282(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var15 = arg0.field3039;
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
                                            method3750(var15[var16], class106.method348(16748608) + var9.field1815, var17, var9.field1856, var4, arg0.field2959);
                                        }
                                    }
                                }
                                method3750(class268.field3313, class106.method348(16748608) + var9.field1815, 1005, var9.field1856, var4, arg0.field2959);
                            } else if ((Statics.field49 & 0x10) == 16) {
                                method3750(field800, field770 + " " + class106.field1352 + " " + class106.method348(16748608) + var9.field1815, 32, var9.field1856, var4, arg0.field2959);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2958) {
            return;
        }
        if (field797) {
            int var18 = method169(arg0);
            boolean var19 = (var18 >> 21 & 0x1) != 0;
            if (var19 && (Statics.field49 & 0x20) == 32) {
                method3750(field800, field770 + " " + class106.field1352 + " " + arg0.field2949, 58, 0, arg0.field2960, arg0.field2959);
            }
            return;
        }
        for (int var20 = 9; var20 >= 5; var20--) {
            String var21;
            if (!class248.method3783(method169(arg0), var20) && arg0.field3022 == null) {
                var21 = null;
            } else if (arg0.field2987 == null || arg0.field2987.length <= var20 || arg0.field2987[var20] == null || arg0.field2987[var20].trim().length() == 0) {
                var21 = null;
            } else {
                var21 = arg0.field2987[var20];
            }
            if (var21 != null) {
                method3750(var21, arg0.field2949, 1007, var20 + 1, arg0.field2960, arg0.field2959);
            }
        }
        String var23 = method3901(arg0);
        if (var23 != null) {
            method3750(var23, arg0.field2949, 25, 0, arg0.field2960, arg0.field2959);
        }
        for (int var24 = 4; var24 >= 0; var24--) {
            String var25;
            if (!class248.method3783(method169(arg0), var24) && arg0.field3022 == null) {
                var25 = null;
            } else if (arg0.field2987 == null || arg0.field2987.length <= var24 || arg0.field2987[var24] == null || arg0.field2987[var24].trim().length() == 0) {
                var25 = null;
            } else {
                var25 = arg0.field2987[var24];
            }
            if (var25 != null) {
                method3902(var25, arg0.field2949, 57, var24 + 1, arg0.field2960, arg0.field2959, arg0.field3030);
            }
        }
        int var27 = method169(arg0);
        boolean var28 = (var27 & 0x1) != 0;
        if (var28) {
            method3750(class268.field3240, "", 30, 0, arg0.field2960, arg0.field2959);
        }
    }

    @ObfuscatedName("dv.jg(ZB)V")
    public static void method2207(boolean arg0) {
        field723 = arg0;
    }

    @ObfuscatedName("d.jp(I)Z")
    public static boolean method59() {
        return field723;
    }

    @ObfuscatedName("ar.jf(IIIIIIIB)V")
    public static final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class247.method2363(arg0)) {
            method3246(Statics.field2951[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ff.jv([Lio;IIIIIIII)V")
    public static final void method3246(class247[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class247 var9 = arg0[var8];
            if (var9 != null && var9.field3010 == arg1 && (!var9.field2958 || var9.field2961 == 0 || var9.field3045 || method169(var9) != 0 || field816 == var9 || var9.field3065 == 1338)) {
                if (var9.field2958) {
                    if (method2709(var9)) {
                        continue;
                    }
                } else if (var9.field2961 == 0 && Statics.field937 != var9 && method2709(var9)) {
                    continue;
                }
                int var10 = var9.field2972 + arg6;
                int var11 = var9.field2973 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2961 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2961 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2962 + var10;
                    int var19 = var9.field2975 + var11;
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
                    int var22 = var9.field2962 + var10;
                    int var23 = var9.field2975 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field815 == var9) {
                    field823 = true;
                    field855 = var10;
                    field805 = var11;
                }
                boolean var24 = false;
                if (var9.field3033) {
                    switch(field804) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2959 >>> 16 == field806) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field806 == var9.field2959) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2958 || var12 < var14 && var13 < var15) {
                    if (var9.field2958) {
                        if (var9.field3101) {
                            if (class48.field389 >= var12 && class48.field370 >= var13 && class48.field389 < var14 && class48.field370 < var15) {
                                for (class96 var25 = (class96) field801.method4714(); var25 != null; var25 = (class96) field801.method4741()) {
                                    if (var25.field1172) {
                                        var25.method5496();
                                        var25.field1173.field3092 = false;
                                    }
                                }
                                if (Statics.field1298 == 0) {
                                    field815 = null;
                                    field816 = null;
                                }
                                if (!field778) {
                                    method2358();
                                }
                            }
                        } else if (var9.field3102 && class48.field389 >= var12 && class48.field370 >= var13 && class48.field389 < var14 && class48.field370 < var15) {
                            for (class96 var26 = (class96) field801.method4714(); var26 != null; var26 = (class96) field801.method4741()) {
                                if (var26.field1172 && var26.field1173.field3066 == var26.field1178) {
                                    var26.method5496();
                                }
                            }
                        }
                    }
                    int var27 = class48.field389;
                    int var28 = class48.field370;
                    if (class48.field384 != 0) {
                        var27 = class48.field368;
                        var28 = class48.field378;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field3065 == 1337) {
                        if (!field802 && !field778 && var29) {
                            method18(var27, var28, var12, var13);
                        }
                    } else if (var9.field3065 == 1338) {
                        method963(var9, var10, var11);
                    } else {
                        if (var9.field3065 == 1400) {
                            Statics.field2928.method5653(class48.field389, class48.field370, var29, var10, var11, var9.field2962, var9.field2975);
                        }
                        if (!field778 && var29) {
                            if (var9.field3065 == 1400) {
                                Statics.field2928.method5565(var10, var11, var9.field2962, var9.field2975, var27, var28);
                            } else {
                                method1998(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field3034.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field3034[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field3034[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field3013 != null) {
                                            var34 = class39.field286[var9.field3034[var30][var33]];
                                        }
                                        if (method2057(var9.field3034[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field3013 != null && var9.field3013[var30] > field650) {
                                                break;
                                            }
                                            byte var35 = var9.field3035[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class39.field286[86] && !class39.field286[82] && !class39.field286[81]) && ((var35 & 0x2) == 0 || class39.field286[86]) && ((var35 & 0x1) == 0 || class39.field286[82]) && ((var35 & 0x4) == 0 || class39.field286[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method5900(var30 + 1, var9.field2959, var9.field2960, var9.field3087, "");
                                    } else if (var30 == 10) {
                                        method47();
                                        method2033(var9.field2959, var9.field2960, class248.method2072(method169(var9)), var9.field3087);
                                        field800 = method3901(var9);
                                        if (field800 == null) {
                                            field800 = class268.field3242;
                                        }
                                        field770 = var9.field2949 + class106.method348(16777215);
                                    }
                                    int var36 = var9.field3036[var30];
                                    if (var9.field3013 == null) {
                                        var9.field3013 = new int[var9.field3034.length];
                                    }
                                    if (var9.field3080 == null) {
                                        var9.field3080 = new int[var9.field3034.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field3013[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field3013[var30] == 0) {
                                        var9.field3013[var30] = field650 + var36 + var9.field3080[var30];
                                    } else {
                                        var9.field3013[var30] = field650 + var36;
                                    }
                                }
                                if (!var31 && var9.field3013 != null) {
                                    var9.field3013[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2958) {
                            boolean var37;
                            if (class48.field389 >= var12 && class48.field370 >= var13 && class48.field389 < var14 && class48.field370 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class48.field376 == 1 || !Statics.field666 && class48.field376 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class48.field384 == 1 || !Statics.field666 && class48.field384 == 4) && class48.field368 >= var12 && class48.field378 >= var13 && class48.field368 < var14 && class48.field378 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method2436(var9, class48.field368 - var10, class48.field378 - var11);
                            }
                            if (var9.field3065 == 1400) {
                                Statics.field2928.method5622(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field815 != null && field815 != var9 && var37 && class248.method3285(method169(var9))) {
                                field819 = var9;
                            }
                            if (field816 == var9) {
                                field820 = true;
                                field741 = var10;
                                field822 = var11;
                            }
                            if (var9.field3045) {
                                if (var37 && field844 != 0 && var9.field3066 != null) {
                                    class96 var40 = new class96();
                                    var40.field1172 = true;
                                    var40.field1173 = var9;
                                    var40.field1175 = field844;
                                    var40.field1178 = var9.field3066;
                                    field801.method4709(var40);
                                }
                                if (field815 != null || Statics.field1086 != null || field778) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field3093 && var39) {
                                    var9.field3093 = true;
                                    if (var9.field2978 != null) {
                                        class96 var41 = new class96();
                                        var41.field1172 = true;
                                        var41.field1173 = var9;
                                        var41.field1174 = class48.field368 - var10;
                                        var41.field1175 = class48.field378 - var11;
                                        var41.field1178 = var9.field2978;
                                        field801.method4709(var41);
                                    }
                                }
                                if (var9.field3093 && var38 && var9.field3048 != null) {
                                    class96 var42 = new class96();
                                    var42.field1172 = true;
                                    var42.field1173 = var9;
                                    var42.field1174 = class48.field389 - var10;
                                    var42.field1175 = class48.field370 - var11;
                                    var42.field1178 = var9.field3048;
                                    field801.method4709(var42);
                                }
                                if (var9.field3093 && !var38) {
                                    var9.field3093 = false;
                                    if (var9.field3049 != null) {
                                        class96 var43 = new class96();
                                        var43.field1172 = true;
                                        var43.field1173 = var9;
                                        var43.field1174 = class48.field389 - var10;
                                        var43.field1175 = class48.field370 - var11;
                                        var43.field1178 = var9.field3049;
                                        field847.method4709(var43);
                                    }
                                }
                                if (var38 && var9.field3050 != null) {
                                    class96 var44 = new class96();
                                    var44.field1172 = true;
                                    var44.field1173 = var9;
                                    var44.field1174 = class48.field389 - var10;
                                    var44.field1175 = class48.field370 - var11;
                                    var44.field1178 = var9.field3050;
                                    field801.method4709(var44);
                                }
                                if (!var9.field3092 && var37) {
                                    var9.field3092 = true;
                                    if (var9.field3071 != null) {
                                        class96 var45 = new class96();
                                        var45.field1172 = true;
                                        var45.field1173 = var9;
                                        var45.field1174 = class48.field389 - var10;
                                        var45.field1175 = class48.field370 - var11;
                                        var45.field1178 = var9.field3071;
                                        field801.method4709(var45);
                                    }
                                }
                                if (var9.field3092 && var37 && var9.field3052 != null) {
                                    class96 var46 = new class96();
                                    var46.field1172 = true;
                                    var46.field1173 = var9;
                                    var46.field1174 = class48.field389 - var10;
                                    var46.field1175 = class48.field370 - var11;
                                    var46.field1178 = var9.field3052;
                                    field801.method4709(var46);
                                }
                                if (var9.field3092 && !var37) {
                                    var9.field3092 = false;
                                    if (var9.field3053 != null) {
                                        class96 var47 = new class96();
                                        var47.field1172 = true;
                                        var47.field1173 = var9;
                                        var47.field1174 = class48.field389 - var10;
                                        var47.field1175 = class48.field370 - var11;
                                        var47.field1178 = var9.field3053;
                                        field847.method4709(var47);
                                    }
                                }
                                if (var9.field3026 != null) {
                                    class96 var48 = new class96();
                                    var48.field1173 = var9;
                                    var48.field1178 = var9.field3026;
                                    field653.method4709(var48);
                                }
                                if (var9.field3058 != null && field664 > var9.field2991) {
                                    if (var9.field3059 == null || field664 - var9.field2991 > 32) {
                                        class96 var53 = new class96();
                                        var53.field1173 = var9;
                                        var53.field1178 = var9.field3058;
                                        field801.method4709(var53);
                                    } else {
                                        label610: for (int var49 = var9.field2991; var49 < field664; var49++) {
                                            int var50 = field828[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field3059.length; var51++) {
                                                if (var9.field3059[var51] == var50) {
                                                    class96 var52 = new class96();
                                                    var52.field1173 = var9;
                                                    var52.field1178 = var9.field3058;
                                                    field801.method4709(var52);
                                                    break label610;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2991 = field664;
                                }
                                if (var9.field3060 != null && field831 > var9.field3096) {
                                    if (var9.field3024 == null || field831 - var9.field3096 > 32) {
                                        class96 var58 = new class96();
                                        var58.field1173 = var9;
                                        var58.field1178 = var9.field3060;
                                        field801.method4709(var58);
                                    } else {
                                        label586: for (int var54 = var9.field3096; var54 < field831; var54++) {
                                            int var55 = field883[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field3024.length; var56++) {
                                                if (var9.field3024[var56] == var55) {
                                                    class96 var57 = new class96();
                                                    var57.field1173 = var9;
                                                    var57.field1178 = var9.field3060;
                                                    field801.method4709(var57);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3096 = field831;
                                }
                                if (var9.field3062 != null && field833 > var9.field3097) {
                                    if (var9.field3007 == null || field833 - var9.field3097 > 32) {
                                        class96 var63 = new class96();
                                        var63.field1173 = var9;
                                        var63.field1178 = var9.field3062;
                                        field801.method4709(var63);
                                    } else {
                                        label562: for (int var59 = var9.field3097; var59 < field833; var59++) {
                                            int var60 = field675[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field3007.length; var61++) {
                                                if (var9.field3007[var61] == var60) {
                                                    class96 var62 = new class96();
                                                    var62.field1173 = var9;
                                                    var62.field1178 = var9.field3062;
                                                    field801.method4709(var62);
                                                    break label562;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3097 = field833;
                                }
                                if (field836 > var9.field3105 && var9.field3067 != null) {
                                    class96 var64 = new class96();
                                    var64.field1173 = var9;
                                    var64.field1178 = var9.field3067;
                                    field801.method4709(var64);
                                }
                                if (field837 > var9.field3105 && var9.field3069 != null) {
                                    class96 var65 = new class96();
                                    var65.field1173 = var9;
                                    var65.field1178 = var9.field3069;
                                    field801.method4709(var65);
                                }
                                if (field845 > var9.field3105 && var9.field3070 != null) {
                                    class96 var66 = new class96();
                                    var66.field1173 = var9;
                                    var66.field1178 = var9.field3070;
                                    field801.method4709(var66);
                                }
                                if (field655 > var9.field3105 && var9.field3044 != null) {
                                    class96 var67 = new class96();
                                    var67.field1173 = var9;
                                    var67.field1178 = var9.field3044;
                                    field801.method4709(var67);
                                }
                                if (field840 > var9.field3105 && var9.field3072 != null) {
                                    class96 var68 = new class96();
                                    var68.field1173 = var9;
                                    var68.field1178 = var9.field3072;
                                    field801.method4709(var68);
                                }
                                if (field841 > var9.field3105 && var9.field3095 != null) {
                                    class96 var69 = new class96();
                                    var69.field1173 = var9;
                                    var69.field1178 = var9.field3095;
                                    field801.method4709(var69);
                                }
                                if (field749 > var9.field3105 && var9.field3078 != null) {
                                    class96 var70 = new class96();
                                    var70.field1173 = var9;
                                    var70.field1178 = var9.field3078;
                                    field801.method4709(var70);
                                }
                                if (field660 > var9.field3105 && var9.field3073 != null) {
                                    class96 var71 = new class96();
                                    var71.field1173 = var9;
                                    var71.field1178 = var9.field3073;
                                    field801.method4709(var71);
                                }
                                var9.field3105 = field827;
                                if (var9.field3068 != null) {
                                    for (int var72 = 0; var72 < field807; var72++) {
                                        class96 var73 = new class96();
                                        var73.field1173 = var9;
                                        var73.field1183 = field869[var72];
                                        var73.field1171 = field868[var72];
                                        var73.field1178 = var9.field3068;
                                        field801.method4709(var73);
                                    }
                                }
                            }
                        }
                        if (!var9.field2958) {
                            if (field815 != null || Statics.field1086 != null || field778) {
                                continue;
                            }
                            if ((var9.field3023 >= 0 || var9.field2986 != 0) && class48.field389 >= var12 && class48.field370 >= var13 && class48.field389 < var14 && class48.field370 < var15) {
                                if (var9.field3023 >= 0) {
                                    Statics.field937 = arg0[var9.field3023];
                                } else {
                                    Statics.field937 = var9;
                                }
                            }
                            if (var9.field2961 == 8 && class48.field389 >= var12 && class48.field370 >= var13 && class48.field389 < var14 && class48.field370 < var15) {
                                Statics.field610 = var9;
                            }
                            if (var9.field2983 > var9.field2975) {
                                method5144(var9, var9.field2962 + var10, var11, var9.field2975, var9.field2983, class48.field389, class48.field370);
                            }
                        }
                        if (var9.field2961 == 0) {
                            method3246(arg0, var9.field2959, var12, var13, var14, var15, var10 - var9.field2980, var11 - var9.field2981);
                            if (var9.field3091 != null) {
                                method3246(var9.field3091, var9.field2959, var12, var13, var14, var15, var10 - var9.field2980, var11 - var9.field2981);
                            }
                            class95 var74 = (class95) field803.method5766((long) var9.field2959);
                            if (var74 != null) {
                                if (var74.field1165 == 0 && class48.field389 >= var12 && class48.field370 >= var13 && class48.field389 < var14 && class48.field370 < var15 && !field778) {
                                    for (class96 var75 = (class96) field801.method4714(); var75 != null; var75 = (class96) field801.method4741()) {
                                        if (var75.field1172) {
                                            var75.method5496();
                                            var75.field1173.field3092 = false;
                                        }
                                    }
                                    if (Statics.field1298 == 0) {
                                        field815 = null;
                                        field816 = null;
                                    }
                                    if (!field778) {
                                        method2358();
                                    }
                                }
                                method201(var74.field1164, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.jx(IB)Z")
    public static boolean method2057(int arg0) {
        for (int var1 = 0; var1 < field807; var1++) {
            if (field869[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ct.jm(III)V")
    public static final void method1737(int arg0, int arg1) {
        if (class247.method2363(arg0)) {
            method964(Statics.field2951[arg0], arg1);
        }
    }

    @ObfuscatedName("bo.jr([Lio;II)V")
    public static final void method964(class247[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class247 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2961 == 0) {
                    if (var3.field3091 != null) {
                        method964(var3.field3091, arg1);
                    }
                    class95 var4 = (class95) field803.method5766((long) var3.field2959);
                    if (var4 != null) {
                        method1737(var4.field1164, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3074 != null) {
                    class96 var5 = new class96();
                    var5.field1173 = var3;
                    var5.field1178 = var3.field3074;
                    class79.method2186(var5);
                }
                if (arg1 == 1 && var3.field3075 != null) {
                    if (var3.field2960 >= 0) {
                        class247 var6 = class247.method3749(var3.field2959);
                        if (var6 == null || var6.field3091 == null || var3.field2960 >= var6.field3091.length || var6.field3091[var3.field2960] != var3) {
                            continue;
                        }
                    }
                    class96 var7 = new class96();
                    var7.field1173 = var3;
                    var7.field1178 = var3.field3075;
                    class79.method2186(var7);
                }
            }
        }
    }

    @ObfuscatedName("ej.jc(Lio;IIB)V")
    public static final void method2436(class247 arg0, int arg1, int arg2) {
        if (field815 != null || field778 || arg0 == null || method97(arg0) == null) {
            return;
        }
        field815 = arg0;
        field816 = method97(arg0);
        field817 = arg1;
        field670 = arg2;
        Statics.field1298 = 0;
        field826 = false;
        int var3 = method2360();
        if (var3 == -1) {
            return;
        }
        Statics.field608 = new class82();
        Statics.field608.field1014 = field780[var3];
        Statics.field608.field1013 = field835[var3];
        Statics.field608.field1016 = field782[var3];
        Statics.field608.field1015 = field783[var3];
        Statics.field608.field1012 = field856[var3];
    }

    @ObfuscatedName("client.jt(B)V")
    public final void method1035() {
        method3353(field815);
        Statics.field1298++;
        if (field823 && field820) {
            int var1 = class48.field389;
            int var2 = class48.field370;
            int var3 = var1 - field817;
            int var4 = var2 - field670;
            if (var3 < field741) {
                var3 = field741;
            }
            if (field815.field2962 + var3 > field741 + field816.field2962) {
                var3 = field741 + field816.field2962 - field815.field2962;
            }
            if (var4 < field822) {
                var4 = field822;
            }
            if (field815.field2975 + var4 > field822 + field816.field2975) {
                var4 = field822 + field816.field2975 - field815.field2975;
            }
            int var5 = var3 - field855;
            int var6 = var4 - field805;
            int var7 = field815.field3041;
            if (Statics.field1298 > field815.field3042 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field826 = true;
            }
            int var8 = field816.field2980 + (var3 - field741);
            int var9 = field816.field2981 + (var4 - field822);
            if (field815.field3054 != null && field826) {
                class96 var10 = new class96();
                var10.field1173 = field815;
                var10.field1174 = var8;
                var10.field1175 = var9;
                var10.field1178 = field815.field3054;
                class79.method2186(var10);
            }
            if (class48.field376 == 0) {
                if (field826) {
                    if (field815.field3055 != null) {
                        class96 var11 = new class96();
                        var11.field1173 = field815;
                        var11.field1174 = var8;
                        var11.field1175 = var9;
                        var11.field1177 = field819;
                        var11.field1178 = field815.field3055;
                        class79.method2186(var11);
                    }
                    if (field819 != null && method2651(field815) != null) {
                        class227 var12 = class227.method171(class225.field2587, field688.field1415);
                        var12.field2693.method6010(field819.field2959);
                        var12.field2693.method6001(field815.field3087);
                        var12.field2693.method6166(field819.field2960);
                        var12.field2693.method5951(field815.field2959);
                        var12.field2693.method6166(field819.field3087);
                        var12.field2693.method6001(field815.field2960);
                        field688.method2167(var12);
                    }
                } else if (this.method1031()) {
                    this.method1032(field855 + field817, field805 + field670);
                } else if (field779 > 0) {
                    int var13 = field855 + field817;
                    int var14 = field805 + field670;
                    class82 var15 = Statics.field608;
                    method1810(var15.field1014, var15.field1013, var15.field1016, var15.field1015, var15.field1012, var15.field1012, var13, var14);
                    Statics.field608 = null;
                }
                field815 = null;
            }
        } else if (Statics.field1298 > 1) {
            field815 = null;
        }
    }

    @ObfuscatedName("gw.jb(Lio;B)V")
    public static void method3353(class247 arg0) {
        if (field850 == arg0.field2947) {
            field720[arg0.field3098] = true;
        }
    }

    @ObfuscatedName("fg.jj(I)V")
    public static void method3287() {
        for (class95 var0 = (class95) field803.method5774(); var0 != null; var0 = (class95) field803.method5770()) {
            int var1 = var0.field1164;
            if (class247.method2363(var1)) {
                boolean var2 = true;
                class247[] var3 = Statics.field2951[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2958;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3938;
                    class247 var6 = class247.method3749(var5);
                    if (var6 != null) {
                        method3353(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.js(Lio;I)Lio;")
    public static class247 method97(class247 arg0) {
        class247 var1 = method2651(arg0);
        if (var1 == null) {
            var1 = arg0.field3040;
        }
        return var1;
    }

    @ObfuscatedName("w.ju(II)V")
    public static final void method170(int arg0) {
        if (!class247.method2363(arg0)) {
            return;
        }
        class247[] var1 = Statics.field2951[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class247 var3 = var1[var2];
            if (var3 != null) {
                var3.field2974 = 0;
                var3.field3090 = 0;
            }
        }
    }

    @ObfuscatedName("ac.jz([Lio;II)V")
    public static final void method293(class247[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class247 var3 = arg0[var2];
            if (var3 != null && var3.field3010 == arg1 && (!var3.field2958 || !method2709(var3))) {
                if (var3.field2961 == 0) {
                    if (!var3.field2958 && method2709(var3) && Statics.field937 != var3) {
                        continue;
                    }
                    method293(arg0, var3.field2959);
                    if (var3.field3091 != null) {
                        method293(var3.field3091, var3.field2959);
                    }
                    class95 var4 = (class95) field803.method5766((long) var3.field2959);
                    if (var4 != null) {
                        int var5 = var4.field1164;
                        if (class247.method2363(var5)) {
                            method293(Statics.field2951[var5], -1);
                        }
                    }
                }
                if (var3.field2961 == 6) {
                    if (var3.field3006 != -1 || var3.field2953 != -1) {
                        boolean var6 = method2382(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2953;
                        } else {
                            var7 = var3.field3006;
                        }
                        if (var7 != -1) {
                            class157 var8 = class157.method2030(var7);
                            var3.field3090 += field914;
                            while (var3.field3090 > var8.field1881[var3.field2974]) {
                                var3.field3090 -= var8.field1881[var3.field2974];
                                var3.field2974++;
                                if (var3.field2974 >= var8.field1879.length) {
                                    var3.field2974 -= var8.field1878;
                                    if (var3.field2974 < 0 || var3.field2974 >= var8.field1879.length) {
                                        var3.field2974 = 0;
                                    }
                                }
                                method3353(var3);
                            }
                        }
                    }
                    if (var3.field3015 != 0 && !var3.field2958) {
                        int var9 = var3.field3015 >> 16;
                        int var10 = var3.field3015 << 16 >> 16;
                        int var11 = field914 * var9;
                        int var12 = field914 * var10;
                        var3.field3000 = var3.field3000 + var11 & 0x7FF;
                        var3.field3011 = var3.field3011 + var12 & 0x7FF;
                        method3353(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cu.je(D)V")
    public static final void method1891(double arg0) {
        class196.method3496(arg0);
        ((class203) Statics.field2282).method3755(arg0);
        class155.method912();
        Statics.field1804.field1338 = arg0;
        class103.method2073();
    }

    @ObfuscatedName("ds.ky(II)V")
    public static final void method2184(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field1804.field1332 == var1) {
            return;
        }
        if (Statics.field1804.field1332 == 0 && field881 != -1) {
            class233.method2018(Statics.field1427, field881, 0, var1, false);
            field882 = false;
        } else if (var1 == 0) {
            Statics.field1467.method4017();
            class233.field2828 = 1;
            Statics.field2520 = null;
            field882 = false;
        } else if (class233.field2828 == 0) {
            Statics.field1467.method4040(var1);
        } else {
            Statics.field2829 = var1;
        }
        Statics.field1804.field1332 = var1;
        class103.method2073();
    }

    @ObfuscatedName("fp.kj(II)V")
    public static final void method2975(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1804.field1331 = var1;
        class103.method2073();
    }

    @ObfuscatedName("hv.kh(II)V")
    public static final void method3981(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1804.field1325 = var1;
        class103.method2073();
    }

    @ObfuscatedName("bb.kk(II)V")
    public static final void method997(int arg0) {
        method3287();
        class78.method3962();
        int var1 = class138.method136(arg0).field1550;
        if (var1 == 0) {
            return;
        }
        int var2 = class242.field2918[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method1891(0.9D);
            }
            if (var2 == 2) {
                method1891(0.8D);
            }
            if (var2 == 3) {
                method1891(0.7D);
            }
            if (var2 == 4) {
                method1891(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method2184(255);
            }
            if (var2 == 1) {
                method2184(192);
            }
            if (var2 == 2) {
                method2184(128);
            }
            if (var2 == 3) {
                method2184(64);
            }
            if (var2 == 4) {
                method2184(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method2975(127);
            }
            if (var2 == 1) {
                method2975(96);
            }
            if (var2 == 2) {
                method2975(64);
            }
            if (var2 == 3) {
                method2975(32);
            }
            if (var2 == 4) {
                method2975(0);
            }
        }
        if (var1 == 5) {
            field777 = var2;
        }
        if (var1 == 6) {
            field889 = var2;
        }
        if (var1 == 9) {
            field913 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method3981(127);
            }
            if (var2 == 1) {
                method3981(96);
            }
            if (var2 == 2) {
                method3981(64);
            }
            if (var2 == 3) {
                method3981(32);
            }
            if (var2 == 4) {
                method3981(0);
            }
        }
        if (var1 == 17) {
            field825 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class107[] var3 = new class107[] { class107.field1358, class107.field1359, class107.field1363, class107.field1360 };
            field667 = (class107) class289.method2163(var3, var2);
            if (field667 == null) {
                field667 = class107.field1363;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field769 = -1;
            } else {
                field769 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class107[] var4 = new class107[] { class107.field1358, class107.field1359, class107.field1363, class107.field1360 };
        field668 = (class107) class289.method2163(var4, var2);
        if (field668 == null) {
            field668 = class107.field1363;
        }
    }

    @ObfuscatedName("iy.kl(Lio;I)V")
    public static final void method4397(class247 arg0) {
        int var1 = arg0.field3065;
        if (var1 == 324) {
            if (field909 == -1) {
                field909 = arg0.field3037;
                field753 = arg0.field3094;
            }
            if (field838.field2931) {
                arg0.field3037 = field909;
            } else {
                arg0.field3037 = field753;
            }
        } else if (var1 == 325) {
            if (field909 == -1) {
                field909 = arg0.field3037;
                field753 = arg0.field3094;
            }
            if (field838.field2931) {
                arg0.field3037 = field753;
            } else {
                arg0.field3037 = field909;
            }
        } else if (var1 == 327) {
            arg0.field3000 = 150;
            arg0.field3011 = (int) (Math.sin((double) field650 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3002 = 5;
            arg0.field3003 = 0;
        } else if (var1 == 328) {
            arg0.field3000 = 150;
            arg0.field3011 = (int) (Math.sin((double) field650 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3002 = 5;
            arg0.field3003 = 1;
        }
    }

    @ObfuscatedName("p.kr(S)V")
    public static final void method39() {
        class227 var0 = class227.method171(class225.field2595, field688.field1415);
        field688.method2167(var0);
        for (class95 var1 = (class95) field803.method5774(); var1 != null; var1 = (class95) field803.method5770()) {
            if (var1.field1165 == 0 || var1.field1165 == 3) {
                method335(var1, true);
            }
        }
        if (field808 != null) {
            method3353(field808);
            field808 = null;
        }
    }

    @ObfuscatedName("k.ka(IIII)Lcu;")
    public static final class95 method152(int arg0, int arg1, int arg2) {
        class95 var3 = new class95();
        var3.field1164 = arg1;
        var3.field1165 = arg2;
        field803.method5768(var3, (long) arg0);
        method170(arg1);
        class247 var4 = class247.method3749(arg0);
        method3353(var4);
        if (field808 != null) {
            method3353(field808);
            field808 = null;
        }
        method54();
        method5145(Statics.field2951[arg0 >> 16], var4, false);
        Statics.method3479(arg1);
        if (field637 != -1) {
            method1737(field637, 1);
        }
        return var3;
    }

    @ObfuscatedName("ao.kx(Lcu;ZI)V")
    public static final void method335(class95 arg0, boolean arg1) {
        int var2 = arg0.field1164;
        int var3 = (int) arg0.field3938;
        arg0.method5496();
        if (arg1 && var2 != -1 && Statics.field2952[var2]) {
            Statics.field1299.method4481(var2);
            if (Statics.field2951[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2951[var2].length; var5++) {
                    if (Statics.field2951[var2][var5] != null) {
                        if (Statics.field2951[var2][var5].field2961 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2951[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2951[var2] = null;
                }
                Statics.field2952[var2] = false;
            }
        }
        for (class351 var6 = (class351) field848.method5774(); var6 != null; var6 = (class351) field848.method5770()) {
            if ((var6.field3938 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method5496();
            }
        }
        class247 var7 = class247.method3749(var3);
        if (var7 != null) {
            method3353(var7);
        }
        method54();
        if (field637 != -1) {
            method1737(field637, 1);
        }
    }

    @ObfuscatedName("fl.kq(Lio;I)Z")
    public static final boolean method2907(class247 arg0) {
        int var1 = arg0.field3065;
        if (var1 == 205) {
            field691 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field838.method4249(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field838.method4277(var4, var5 == 1);
        }
        if (var1 == 324) {
            field838.method4251(false);
        }
        if (var1 == 325) {
            field838.method4251(true);
        }
        if (var1 == 326) {
            class227 var6 = class227.method171(class225.field2675, field688.field1415);
            field838.method4252(var6.field2693);
            field688.method2167(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bc.ki(Lio;IIII)V")
    public static final void method1567(class247 arg0, int arg1, int arg2, int arg3) {
        method1997();
        class241 var4 = arg0.method4300(false);
        if (var4 == null) {
            return;
        }
        class392.method6277(arg1, arg2, var4.field2916 + arg1, var4.field2914 + arg2);
        if (field880 == 2 || field880 == 5) {
            class392.method6291(arg1, arg2, 0, var4.field2913, var4.field2915);
        } else {
            int var5 = field854 & 0x7FF;
            int var6 = Statics.field1163.field1238 / 32 + 48;
            int var7 = 464 - Statics.field1163.field1237 / 32;
            Statics.field366.method6429(arg1, arg2, var4.field2916, var4.field2914, var6, var7, var5, 256, var4.field2913, var4.field2915);
            for (int var8 = 0; var8 < field874; var8++) {
                int var9 = field875[var8] * 4 + 2 - Statics.field1163.field1238 / 32;
                int var10 = field876[var8] * 4 + 2 - Statics.field1163.field1237 / 32;
                method2763(arg1, arg2, var9, var10, field877[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class294 var13 = field860[Statics.field196][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1163.field1238 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1163.field1237 / 32;
                        method2763(arg1, arg2, var14, var15, Statics.field2022[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field684; var16++) {
                class105 var17 = field683[field685[var16]];
                if (var17 != null && var17.method1968()) {
                    class146 var18 = var17.field1346;
                    if (var18 != null && var18.field1640 != null) {
                        var18 = var18.method2532();
                    }
                    if (var18 != null && var18.field1661 && var18.field1664) {
                        int var19 = var17.field1238 / 32 - Statics.field1163.field1238 / 32;
                        int var20 = var17.field1237 / 32 - Statics.field1163.field1237 / 32;
                        method2763(arg1, arg2, var19, var20, Statics.field2022[1], var4);
                    }
                }
            }
            int var21 = class109.field1376;
            int[] var22 = class109.field1381;
            for (int var23 = 0; var23 < var21; var23++) {
                class98 var24 = field830[var22[var23]];
                if (var24 != null && var24.method1968() && !var24.field1205 && Statics.field1163 != var24) {
                    int var25 = var24.field1238 / 32 - Statics.field1163.field1238 / 32;
                    int var26 = var24.field1237 / 32 - Statics.field1163.field1237 / 32;
                    if (var24.method1912()) {
                        method2763(arg1, arg2, var25, var26, Statics.field2022[3], var4);
                    } else if (Statics.field1163.field1212 != 0 && var24.field1212 != 0 && Statics.field1163.field1212 == var24.field1212) {
                        method2763(arg1, arg2, var25, var26, Statics.field2022[4], var4);
                    } else if (var24.method1956()) {
                        method2763(arg1, arg2, var25, var26, Statics.field2022[5], var4);
                    } else if (var24.method1931()) {
                        method2763(arg1, arg2, var25, var26, Statics.field2022[6], var4);
                    } else {
                        method2763(arg1, arg2, var25, var26, Statics.field2022[2], var4);
                    }
                }
            }
            if (field658 != 0 && field650 % 20 < 10) {
                if (field658 == 1 && field812 >= 0 && field812 < field683.length) {
                    class105 var27 = field683[field812];
                    if (var27 != null) {
                        int var28 = var27.field1238 / 32 - Statics.field1163.field1238 / 32;
                        int var29 = var27.field1237 / 32 - Statics.field1163.field1237 / 32;
                        method1724(arg1, arg2, var28, var29, Statics.field1960[1], var4);
                    }
                }
                if (field658 == 2) {
                    int var30 = field661 * 4 - Statics.field2512 * 4 + 2 - Statics.field1163.field1238 / 32;
                    int var31 = field662 * 4 - Statics.field458 * 4 + 2 - Statics.field1163.field1237 / 32;
                    method1724(arg1, arg2, var30, var31, Statics.field1960[1], var4);
                }
                if (field658 == 10 && field916 >= 0 && field916 < field830.length) {
                    class98 var32 = field830[field916];
                    if (var32 != null) {
                        int var33 = var32.field1238 / 32 - Statics.field1163.field1238 / 32;
                        int var34 = var32.field1237 / 32 - Statics.field1163.field1237 / 32;
                        method1724(arg1, arg2, var33, var34, Statics.field1960[1], var4);
                    }
                }
            }
            if (field745 != 0) {
                int var35 = field745 * 4 + 2 - Statics.field1163.field1238 / 32;
                int var36 = field787 * 4 + 2 - Statics.field1163.field1237 / 32;
                method2763(arg1, arg2, var35, var36, Statics.field1960[0], var4);
            }
            if (!Statics.field1163.field1205) {
                class392.method6265(var4.field2916 / 2 + arg1 - 1, var4.field2914 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field781[arg3] = true;
    }

    @ObfuscatedName("c.km(Lio;IIII)V")
    public static final void method143(class247 arg0, int arg1, int arg2, int arg3) {
        class241 var4 = arg0.method4300(false);
        if (var4 == null) {
            return;
        }
        if (field880 < 3) {
            Statics.field1669.method6429(arg1, arg2, var4.field2916, var4.field2914, 25, 25, field854, 256, var4.field2913, var4.field2915);
        } else {
            class392.method6291(arg1, arg2, 0, var4.field2913, var4.field2915);
        }
    }

    @ObfuscatedName("cp.kg(IIIILoh;Lit;I)V")
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, class396 arg4, class241 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2763(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field854 & 0x7FF;
        int var8 = class196.field2275[var7];
        int var9 = class196.field2286[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2916 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field992.method6372(arg5.field2916 / 2 + arg0 - var17 / 2 + var15, arg5.field2914 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("eg.ko(IIIILoh;Lit;I)V")
    public static final void method2763(int arg0, int arg1, int arg2, int arg3, class396 arg4, class241 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field854 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class196.field2275[var6];
        int var9 = class196.field2286[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method6371(arg5.field2916 / 2 + var10 - arg4.field4246 / 2, arg5.field2914 / 2 - var11 - arg4.field4250 / 2, arg0, arg1, arg5.field2916, arg5.field2914, arg5.field2913, arg5.field2915);
        } else {
            arg4.method6355(arg5.field2916 / 2 + arg0 + var10 - arg4.field4246 / 2, arg5.field2914 / 2 + arg1 - var11 - arg4.field4250 / 2);
        }
    }

    @ObfuscatedName("ik.kt(B)V")
    public static final void method4221() {
        for (int var0 = 0; var0 < class109.field1376; var0++) {
            class98 var1 = field830[class109.field1381[var0]];
            var1.method1913();
        }
        Iterator var2 = class111.field1396.iterator();
        while (var2.hasNext()) {
            class73 var3 = (class73) var2.next();
            var3.method992();
        }
        if (Statics.field1987 != null) {
            Statics.field1987.method5172();
        }
    }

    @ObfuscatedName("cb.kc(I)V")
    public static final void method1909() {
        class111.method5505();
        if (Statics.field1987 != null) {
            Statics.field1987.method5183();
        }
    }

    @ObfuscatedName("s.kz(I)V")
    public static final void method62() {
        for (int var0 = 0; var0 < class109.field1376; var0++) {
            class98 var1 = field830[class109.field1381[var0]];
            var1.method1915();
        }
    }

    @ObfuscatedName("be.kd(I)V")
    public static final void method910() {
        field837 = field827;
    }

    @ObfuscatedName("fz.kp(B)V")
    public static final void method2914() {
        field845 = field827;
        Statics.field2885 = true;
    }

    @ObfuscatedName("dl.kw(B)V")
    public static final void method2278() {
        field655 = field827;
        Statics.field191 = true;
    }

    @ObfuscatedName("dz.ku(Ljava/lang/String;I)V")
    public static final void method2071(String arg0) {
        if (Statics.field1987 != null) {
            class227 var1 = class227.method171(class225.field2666, field688.field1415);
            var1.field2693.method6043(class383.method1863(arg0));
            var1.field2693.method5955(arg0);
            field688.method2167(var1);
        }
    }

    @ObfuscatedName("ef.kb(Ljava/lang/String;S)V")
    public static final void method2550(String arg0) {
        if (!arg0.equals("")) {
            class227 var1 = class227.method171(class225.field2575, field688.field1415);
            var1.field2693.method6043(class383.method1863(arg0));
            var1.field2693.method5955(arg0);
            field688.method2167(var1);
        }
    }

    @ObfuscatedName("ak.ke(B)V")
    public static final void method547() {
        class227 var0 = class227.method171(class225.field2575, field688.field1415);
        var0.field2693.method6043(0);
        field688.method2167(var0);
    }

    @ObfuscatedName("n.kf(III)V")
    public static final void method7(int arg0, int arg1) {
        class4 var2 = arg0 >= 0 ? field872[arg0] : Statics.field631;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method23()) {
            return;
        }
        class10 var3 = (class10) var2.field29.get(arg1);
        if (var3.field84 != -1) {
            return;
        }
        String var4 = var3.field85;
        class112 var5 = field688;
        class227 var6 = class227.method171(class225.field2652, var5.field1415);
        var6.field2693.method6043(3 + class383.method1863(var4));
        var6.field2693.method6043(arg0);
        var6.field2693.method6166(arg1);
        var6.field2693.method5955(var4);
        var5.method2167(var6);
    }

    @ObfuscatedName("ku.kv(IIB)V")
    public static final void method5060(int arg0, int arg1) {
        if (field872[arg0] == null || arg1 < 0 || arg1 >= field872[arg0].method23()) {
            return;
        }
        class10 var2 = (class10) field872[arg0].field29.get(arg1);
        if (var2.field84 != -1) {
            return;
        }
        class112 var3 = field688;
        class227 var4 = class227.method171(class225.field2613, var3.field1415);
        var4.field2693.method6043(3 + class383.method1863(var2.field85));
        var4.field2693.method6043(arg0);
        var4.field2693.method6166(arg1);
        var4.field2693.method5955(var2.field85);
        var3.method2167(var4);
    }

    @ObfuscatedName("m.kn(IIZB)V")
    public static final void method156(int arg0, int arg1, boolean arg2) {
        if (field872[arg0] == null || arg1 < 0 || arg1 >= field872[arg0].method23()) {
            return;
        }
        class10 var3 = (class10) field872[arg0].field29.get(arg1);
        class112 var4 = field688;
        class227 var5 = class227.method171(class225.field2608, var4.field1415);
        var5.field2693.method6043(4 + class383.method1863(var3.field85));
        var5.field2693.method6043(arg0);
        var5.field2693.method6166(arg1);
        var5.field2693.method6083(arg2);
        var5.field2693.method5955(var3.field85);
        var4.method2167(var5);
    }

    @ObfuscatedName("w.ks(Lio;I)I")
    public static int method169(class247 arg0) {
        class351 var1 = (class351) field848.method5766(((long) arg0.field2959 << 32) + (long) arg0.field2960);
        return var1 == null ? arg0.field3032 : var1.field3937;
    }

    @ObfuscatedName("ei.lr(Lio;I)Lio;")
    public static class247 method2651(class247 arg0) {
        int var1 = class248.method155(method169(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class247.method3749(arg0.field3010);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ev.lk(Lio;I)Z")
    public static boolean method2709(class247 arg0) {
        return arg0.field2979;
    }

    @ObfuscatedName("hw.lo(Lio;I)Ljava/lang/String;")
    public static String method3901(class247 arg0) {
        if (class248.method2072(method169(arg0)) == 0) {
            return null;
        } else if (arg0.field2968 == null || arg0.field2968.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2968;
        }
    }

    @ObfuscatedName("el.lc(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2470(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field851 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field851 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field851 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field851 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field851 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4080 != null) {
            var3 = "/p=" + Statics.field4080;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field4141 + "/a=" + Statics.field1095 + var3 + "/";
    }

    @ObfuscatedName("lq.lb(Ljava/lang/String;I)V")
    public static void method5200(String arg0) {
        Statics.field4080 = arg0;
        try {
            String var1 = Statics.field204.getParameter(Integer.toString(18));
            String var2 = Statics.field204.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class380.method2744() + 94608000000L;
                class252.field3124.setTime(new Date(var6));
                int var8 = class252.field3124.get(7);
                int var9 = class252.field3124.get(5);
                int var10 = class252.field3124.get(2);
                int var11 = class252.field3124.get(1);
                int var12 = class252.field3124.get(11);
                int var13 = class252.field3124.get(12);
                int var14 = class252.field3124.get(13);
                String var15 = class252.field3123[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class252.field3125[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class43.method321(Statics.field204, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("eg.lt(Ljava/lang/String;ZB)V")
    public static void method2727(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1809; var5++) {
            class155 var6 = class155.method4399(var5);
            if ((!arg1 || var6.field1855) && var6.field1851 == -1 && var6.field1815.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field117 = -1;
                    Statics.field1533 = null;
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
        Statics.field1533 = var3;
        Statics.field305 = 0;
        Statics.field117 = var4;
        String[] var9 = new String[Statics.field117];
        for (int var10 = 0; var10 < Statics.field117; var10++) {
            var9[var10] = class155.method4399(var3[var10]).field1815;
        }
        short[] var11 = Statics.field1533;
        class378.method3973(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("el.lp([BII)V")
    public static void method2452(byte[] arg0, int arg1) {
        if (field682 == null) {
            field682 = new byte[24];
        }
        class307.method5064(arg0, arg1, field682, 0, 24);
    }

    @ObfuscatedName("ig.lq(Lnd;II)V")
    public static void method4288(class383 arg0, int arg1) {
        method2452(arg0.field4155, arg1);
        if (class129.field1491 == null) {
            return;
        }
        try {
            class129.field1491.method5825(0L);
            class129.field1491.method5830(arg0.field4155, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("client.ll(I)Lly;")
    public class328 method1036() {
        return Statics.field1163 == null ? null : Statics.field1163.field1199;
    }

    @ObfuscatedName("p.lx(IIIZI)V")
    public static void method41(int arg0, int arg1, int arg2, boolean arg3) {
        class227 var4 = class227.method171(class225.field2658, field688.field1415);
        var4.field2693.method6001(arg1);
        var4.field2693.method5951(arg3 ? field724 : 0);
        var4.field2693.method6043(arg2);
        var4.field2693.method6018(arg0);
        field688.method2167(var4);
    }

    @ObfuscatedName("mv.ln(I)Z")
    public static boolean method5731() {
        return field811 >= 2;
    }

    @ObfuscatedName("l.lj(IB)V")
    public static void method135(int arg0) {
        field885 = arg0;
    }

    @ObfuscatedName("ak.la(I)V")
    public static void method535() {
        field688.method2167(class227.method171(class225.field2609, field688.field1415));
        field885 = 0;
    }

    @ObfuscatedName("cf.lv(I)V")
    public static void method1812() {
        if (field885 == 1) {
            field725 = true;
        }
    }

    @ObfuscatedName("ef.lu(I)V")
    public static void method2553() {
        if (!field725 || Statics.field1163 == null) {
            return;
        }
        int var0 = Statics.field1163.field1273[0];
        int var1 = Statics.field1163.field1287[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1911 = Statics.field1163.field1238;
        int var2 = method2069(Statics.field1163.field1238, Statics.field1163.field1237, Statics.field196) - field821;
        if (var2 < Statics.field149) {
            Statics.field149 = var2;
        }
        Statics.field2522 = Statics.field1163.field1237;
        field725 = false;
    }

    @ObfuscatedName("g.ly(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method147(String arg0) {
        class270[] var1 = class270.method5880();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class270 var3 = var1[var2];
            if (var3.field3551 != -1 && arg0.startsWith(class106.method1795(var3.field3551))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3551).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bc.ls(I)V")
    public static void method1578() {
        if (Statics.field1445 == null) {
            return;
        }
        field718 = field650;
        Statics.field1445.method4670();
        for (int var0 = 0; var0 < field830.length; var0++) {
            if (field830[var0] != null) {
                Statics.field1445.method4661((field830[var0].field1238 >> 7) + Statics.field2512, (field830[var0].field1237 >> 7) + Statics.field458);
            }
        }
    }
}

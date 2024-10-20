package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class63 implements class291 {

    @ObfuscatedName("client.w")
    public static class182[] field772 = new class182[4];

    @ObfuscatedName("client.ao")
    public static boolean field864 = true;

    @ObfuscatedName("client.bj")
    public static int field844 = 1;

    @ObfuscatedName("client.bn")
    public static int field663 = 0;

    @ObfuscatedName("client.bp")
    public static int field664 = 0;

    @ObfuscatedName("client.bx")
    public static boolean field665 = false;

    @ObfuscatedName("client.bc")
    public static boolean field666 = false;

    @ObfuscatedName("client.bh")
    public static int field667 = -1;

    @ObfuscatedName("client.bz")
    public static int field668 = -1;

    @ObfuscatedName("client.bg")
    public static boolean field742 = false;

    @ObfuscatedName("client.bm")
    public static int field670 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field673 = true;

    @ObfuscatedName("client.cz")
    public static int field729 = 0;

    @ObfuscatedName("client.cs")
    public static long field806 = 1L;

    @ObfuscatedName("client.cu")
    public static int field676 = -1;

    @ObfuscatedName("client.ci")
    public static int field688 = -1;

    @ObfuscatedName("client.cy")
    public static long field854 = -1L;

    @ObfuscatedName("client.cm")
    public static boolean field687 = true;

    @ObfuscatedName("client.cc")
    public static boolean field680 = false;

    @ObfuscatedName("client.co")
    public static int field681 = 0;

    @ObfuscatedName("client.cx")
    public static int field682 = 0;

    @ObfuscatedName("client.cg")
    public static int field683 = 0;

    @ObfuscatedName("client.ch")
    public static int field684 = 0;

    @ObfuscatedName("client.cl")
    public static int field911 = 0;

    @ObfuscatedName("client.cw")
    public static int field686 = 0;

    @ObfuscatedName("client.ct")
    public static int field934 = 0;

    @ObfuscatedName("client.dx")
    public static int field843 = 0;

    @ObfuscatedName("client.do")
    public static int field802 = 0;

    @ObfuscatedName("client.di")
    public static class94 field690 = class94.field1192;

    @ObfuscatedName("client.dk")
    public static class94 field773 = class94.field1192;

    @ObfuscatedName("client.db")
    public static int field692 = 0;

    @ObfuscatedName("client.dj")
    public static int field733 = 0;

    @ObfuscatedName("client.dh")
    public static int field762 = 0;

    @ObfuscatedName("client.ef")
    public static int field695 = 0;

    @ObfuscatedName("client.eh")
    public static int field696 = 0;

    @ObfuscatedName("client.et")
    public static int field697 = 0;

    @ObfuscatedName("client.ec")
    public static int field787 = 0;

    @ObfuscatedName("client.ev")
    public static int field702 = 0;

    @ObfuscatedName("client.eq")
    public static class170 field662 = class170.field2013;

    @ObfuscatedName("client.ej")
    public static boolean field701 = false;

    @ObfuscatedName("client.ed")
    public static class98 field677 = new class98();

    @ObfuscatedName("client.ez")
    public class311 field703;

    @ObfuscatedName("client.fi")
    public class10 field783;

    @ObfuscatedName("client.fa")
    public static byte[] field794 = null;

    @ObfuscatedName("client.fs")
    public static class89[] field722 = new class89[32768];

    @ObfuscatedName("client.fq")
    public static int field707 = 0;

    @ObfuscatedName("client.fn")
    public static int[] field708 = new int[32768];

    @ObfuscatedName("client.fc")
    public static int field726 = 0;

    @ObfuscatedName("client.fg")
    public static int[] field698 = new int[250];

    @ObfuscatedName("client.fk")
    public static final class105 field751 = new class105();

    @ObfuscatedName("client.ff")
    public static int field712 = 0;

    @ObfuscatedName("client.fd")
    public static boolean field713 = false;

    @ObfuscatedName("client.fx")
    public static boolean field714 = true;

    @ObfuscatedName("client.fz")
    public static class283 field693 = new class283();

    @ObfuscatedName("client.fm")
    public static HashMap field716 = new HashMap();

    @ObfuscatedName("client.gt")
    public static int field786 = 0;

    @ObfuscatedName("client.gm")
    public static int field718 = 1;

    @ObfuscatedName("client.gq")
    public static int field719 = 0;

    @ObfuscatedName("client.ga")
    public static int field720 = 1;

    @ObfuscatedName("client.gu")
    public static int field721 = 0;

    @ObfuscatedName("client.gi")
    public static boolean field723 = false;

    @ObfuscatedName("client.gp")
    public static int[][][] field724 = new int[4][13][13];

    @ObfuscatedName("client.gx")
    public static final int[] field725 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gh")
    public static int field809 = 0;

    @ObfuscatedName("client.hf")
    public static int field728 = 2301979;

    @ObfuscatedName("client.hc")
    public static int field778 = 5063219;

    @ObfuscatedName("client.hg")
    public static int field730 = 3353893;

    @ObfuscatedName("client.hp")
    public static int field731 = 7759444;

    @ObfuscatedName("client.hh")
    public static boolean field732 = false;

    @ObfuscatedName("client.ht")
    public static int field704 = 0;

    @ObfuscatedName("client.hx")
    public static int field734 = 128;

    @ObfuscatedName("client.hw")
    public static int field735 = 0;

    @ObfuscatedName("client.hl")
    public static int field689 = 0;

    @ObfuscatedName("client.hy")
    public static int field737 = 0;

    @ObfuscatedName("client.hk")
    public static int field938 = 0;

    @ObfuscatedName("client.hi")
    public static int field797 = 0;

    @ObfuscatedName("client.iq")
    public static int field740 = 0;

    @ObfuscatedName("client.ir")
    public static int field896 = 50;

    @ObfuscatedName("client.iu")
    public static int field819 = 0;

    @ObfuscatedName("client.im")
    public static int field743 = 0;

    @ObfuscatedName("client.ik")
    public static int field744 = 0;

    @ObfuscatedName("client.ig")
    public static int field745 = 12;

    @ObfuscatedName("client.if")
    public static int field746 = 6;

    @ObfuscatedName("client.iy")
    public static int field747 = 0;

    @ObfuscatedName("client.ii")
    public static boolean field748 = false;

    @ObfuscatedName("client.io")
    public static int field927 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field679 = false;

    @ObfuscatedName("client.ij")
    public static int field881 = 0;

    @ObfuscatedName("client.il")
    public static int field868 = 0;

    @ObfuscatedName("client.ic")
    public static int field753 = 50;

    @ObfuscatedName("client.ia")
    public static int[] field918 = new int[field753];

    @ObfuscatedName("client.is")
    public static int[] field792 = new int[field753];

    @ObfuscatedName("client.iw")
    public static int[] field756 = new int[field753];

    @ObfuscatedName("client.it")
    public static String field705 = null;

    @ObfuscatedName("client.in")
    public static int[] field757 = new int[field753];

    @ObfuscatedName("client.ih")
    public static int[] field758 = new int[field753];

    @ObfuscatedName("client.jl")
    public static int[] field759 = new int[field753];

    @ObfuscatedName("client.jp")
    public static int[] field760 = new int[field753];

    @ObfuscatedName("client.jx")
    public static String[] field761 = new String[field753];

    @ObfuscatedName("client.jz")
    public static int[][] field904 = new int[104][104];

    @ObfuscatedName("client.jg")
    public static int field763 = 0;

    @ObfuscatedName("client.jj")
    public static int field764 = -1;

    @ObfuscatedName("client.je")
    public static int field765 = -1;

    @ObfuscatedName("client.jy")
    public static int field766 = 0;

    @ObfuscatedName("client.jo")
    public static int field855 = 0;

    @ObfuscatedName("client.js")
    public static int field669 = 0;

    @ObfuscatedName("client.jd")
    public static int field769 = 0;

    @ObfuscatedName("client.jv")
    public static boolean field776 = true;

    @ObfuscatedName("client.jw")
    public static int field771 = 0;

    @ObfuscatedName("client.ju")
    public static int field932 = 0;

    @ObfuscatedName("client.jm")
    public static int field920 = 0;

    @ObfuscatedName("client.jt")
    public static int field774 = 0;

    @ObfuscatedName("client.jk")
    public static int field775 = 0;

    @ObfuscatedName("client.jc")
    public static int field741 = 0;

    @ObfuscatedName("client.jq")
    public static boolean field777 = false;

    @ObfuscatedName("client.jr")
    public static int field839 = 0;

    @ObfuscatedName("client.jb")
    public static int field779 = 0;

    @ObfuscatedName("client.jh")
    public static boolean field898 = true;

    @ObfuscatedName("client.ku")
    public static class76[] field671 = new class76[2048];

    @ObfuscatedName("client.ky")
    public static int field750 = -1;

    @ObfuscatedName("client.kg")
    public static int field674 = 0;

    @ObfuscatedName("client.km")
    public static boolean field784 = true;

    @ObfuscatedName("client.kw")
    public static int field899 = 0;

    @ObfuscatedName("client.kb")
    public static int field852 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field846 = new int[1000];

    @ObfuscatedName("client.kz")
    public static final int[] field788 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kq")
    public static String[] field901 = new String[8];

    @ObfuscatedName("client.ki")
    public static boolean[] field790 = new boolean[8];

    @ObfuscatedName("client.kn")
    public static int[] field791 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kl")
    public static int field770 = -1;

    @ObfuscatedName("client.ks")
    public static class273[][][] field793 = new class273[4][104][104];

    @ObfuscatedName("client.kc")
    public static class273 field694 = new class273();

    @ObfuscatedName("client.kh")
    public static class273 field795 = new class273();

    @ObfuscatedName("client.kd")
    public static class273 field796 = new class273();

    @ObfuscatedName("client.kx")
    public static int[] field834 = new int[25];

    @ObfuscatedName("client.kv")
    public static int[] field798 = new int[25];

    @ObfuscatedName("client.lk")
    public static int[] field799 = new int[25];

    @ObfuscatedName("client.lx")
    public static int field815 = 0;

    @ObfuscatedName("client.lh")
    public static boolean field752 = false;

    @ObfuscatedName("client.ld")
    public static int field736 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field803 = new int[500];

    @ObfuscatedName("client.lv")
    public static int[] field804 = new int[500];

    @ObfuscatedName("client.ln")
    public static int[] field805 = new int[500];

    @ObfuscatedName("client.la")
    public static int[] field865 = new int[500];

    @ObfuscatedName("client.lr")
    public static String[] field876 = new String[500];

    @ObfuscatedName("client.lg")
    public static String[] field808 = new String[500];

    @ObfuscatedName("client.lj")
    public static boolean[] field824 = new boolean[500];

    @ObfuscatedName("client.lq")
    public static boolean field767 = false;

    @ObfuscatedName("client.lb")
    public static boolean field811 = false;

    @ObfuscatedName("client.lo")
    public static boolean field812 = false;

    @ObfuscatedName("client.lc")
    public static boolean field813 = true;

    @ObfuscatedName("client.lp")
    public static int field814 = -1;

    @ObfuscatedName("client.ly")
    public static int field870 = -1;

    @ObfuscatedName("client.mw")
    public static int field816 = 0;

    @ObfuscatedName("client.mi")
    public static int field926 = 50;

    @ObfuscatedName("client.md")
    public static int field818 = 0;

    @ObfuscatedName("client.mj")
    public static boolean field820 = false;

    @ObfuscatedName("client.mg")
    public static int field821 = -1;

    @ObfuscatedName("client.ma")
    public static int field822 = -1;

    @ObfuscatedName("client.mk")
    public static String field823 = null;

    @ObfuscatedName("client.ml")
    public static String field685 = null;

    @ObfuscatedName("client.mp")
    public static int field827 = -1;

    @ObfuscatedName("client.mu")
    public static class329 field826 = new class329(8);

    @ObfuscatedName("client.mm")
    public static int field706 = 0;

    @ObfuscatedName("client.mv")
    public static int field700 = -1;

    @ObfuscatedName("client.ms")
    public static int field829 = 0;

    @ObfuscatedName("client.mq")
    public static int field830 = 0;

    @ObfuscatedName("client.mh")
    public static class227 field831 = null;

    @ObfuscatedName("client.mx")
    public static int field832 = 0;

    @ObfuscatedName("client.my")
    public static int field833 = 0;

    @ObfuscatedName("client.mz")
    public static int field754 = 0;

    @ObfuscatedName("client.mo")
    public static int field835 = -1;

    @ObfuscatedName("client.ne")
    public static boolean field853 = false;

    @ObfuscatedName("client.nk")
    public static class227 field699 = null;

    @ObfuscatedName("client.nj")
    public static class227 field838 = null;

    @ObfuscatedName("client.nc")
    public static class227 field781 = null;

    @ObfuscatedName("client.nl")
    public static int field840 = 0;

    @ObfuscatedName("client.ni")
    public static int field841 = 0;

    @ObfuscatedName("client.nv")
    public static class227 field842 = null;

    @ObfuscatedName("client.nf")
    public static boolean field913 = false;

    @ObfuscatedName("client.nx")
    public static int field715 = -1;

    @ObfuscatedName("client.nb")
    public static int field845 = -1;

    @ObfuscatedName("client.no")
    public static boolean field755 = false;

    @ObfuscatedName("client.nr")
    public static int field785 = -1;

    @ObfuscatedName("client.ns")
    public static int field848 = -1;

    @ObfuscatedName("client.nq")
    public static boolean field849 = false;

    @ObfuscatedName("client.na")
    public static int field850 = 1;

    @ObfuscatedName("client.nh")
    public static int[] field856 = new int[32];

    @ObfuscatedName("client.np")
    public static int field768 = 0;

    @ObfuscatedName("client.nm")
    public static int[] field836 = new int[32];

    @ObfuscatedName("client.nu")
    public static int field871 = 0;

    @ObfuscatedName("client.ng")
    public static int[] field749 = new int[32];

    @ObfuscatedName("client.ol")
    public static int field678 = 0;

    @ObfuscatedName("client.oe")
    public static int field710 = 0;

    @ObfuscatedName("client.ob")
    public static int field858 = 0;

    @ObfuscatedName("client.os")
    public static int field859 = 0;

    @ObfuscatedName("client.od")
    public static int field711 = 0;

    @ObfuscatedName("client.oc")
    public static int field861 = 0;

    @ObfuscatedName("client.ov")
    public static int field862 = 0;

    @ObfuscatedName("client.ow")
    public static int field863 = 0;

    @ObfuscatedName("client.oi")
    public static class273 field810 = new class273();

    @ObfuscatedName("client.om")
    public static class273 field661 = new class273();

    @ObfuscatedName("client.or")
    public static class273 field866 = new class273();

    @ObfuscatedName("client.oh")
    public static class329 field867 = new class329(512);

    @ObfuscatedName("client.of")
    public static int field937 = 0;

    @ObfuscatedName("client.oy")
    public static int field869 = -2;

    @ObfuscatedName("client.ok")
    public static boolean[] field817 = new boolean[100];

    @ObfuscatedName("client.ou")
    public static boolean[] field828 = new boolean[100];

    @ObfuscatedName("client.oq")
    public static boolean[] field872 = new boolean[100];

    @ObfuscatedName("client.oz")
    public static int[] field873 = new int[100];

    @ObfuscatedName("client.oj")
    public static int[] field874 = new int[100];

    @ObfuscatedName("client.ox")
    public static int[] field875 = new int[100];

    @ObfuscatedName("client.on")
    public static int[] field717 = new int[100];

    @ObfuscatedName("client.oo")
    public static int field877 = 0;

    @ObfuscatedName("client.ot")
    public static long field939 = 0L;

    @ObfuscatedName("client.pz")
    public static boolean field879 = true;

    @ObfuscatedName("client.pi")
    public static int[] field880 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pp")
    public static int field738 = 0;

    @ObfuscatedName("client.pg")
    public static int field882 = 0;

    @ObfuscatedName("client.pe")
    public static String field883 = "";

    @ObfuscatedName("client.py")
    public static long[] field884 = new long[100];

    @ObfuscatedName("client.pa")
    public static int field885 = 0;

    @ObfuscatedName("client.pr")
    public static int field886 = 0;

    @ObfuscatedName("client.pk")
    public static int[] field887 = new int[128];

    @ObfuscatedName("client.pb")
    public static int[] field739 = new int[128];

    @ObfuscatedName("client.pj")
    public static long field889 = -1L;

    @ObfuscatedName("client.pf")
    public static int field890 = -1;

    @ObfuscatedName("client.ps")
    public static int field801 = 0;

    @ObfuscatedName("client.pn")
    public static int[] field892 = new int[1000];

    @ObfuscatedName("client.pd")
    public static int[] field893 = new int[1000];

    @ObfuscatedName("client.qi")
    public static class336[] field894 = new class336[1000];

    @ObfuscatedName("client.qm")
    public static int field895 = 0;

    @ObfuscatedName("client.qc")
    public static int field789 = 0;

    @ObfuscatedName("client.qx")
    public static int field888 = 0;

    @ObfuscatedName("client.qd")
    public static int field807 = -1;

    @ObfuscatedName("client.qy")
    public static boolean field900 = false;

    @ObfuscatedName("client.qb")
    public static int field878 = 0;

    @ObfuscatedName("client.qz")
    public static int[] field902 = new int[50];

    @ObfuscatedName("client.qg")
    public static int[] field903 = new int[50];

    @ObfuscatedName("client.qt")
    public static int[] field837 = new int[50];

    @ObfuscatedName("client.qa")
    public static int[] field905 = new int[50];

    @ObfuscatedName("client.qh")
    public static class111[] field906 = new class111[50];

    @ObfuscatedName("client.ql")
    public static boolean field907 = false;

    @ObfuscatedName("client.rj")
    public static boolean[] field908 = new boolean[5];

    @ObfuscatedName("client.rp")
    public static int[] field909 = new int[5];

    @ObfuscatedName("client.re")
    public static int[] field910 = new int[5];

    @ObfuscatedName("client.rm")
    public static int[] field800 = new int[5];

    @ObfuscatedName("client.rc")
    public static int[] field912 = new int[5];

    @ObfuscatedName("client.ra")
    public static short field780 = 256;

    @ObfuscatedName("client.ru")
    public static short field914 = 205;

    @ObfuscatedName("client.rs")
    public static short field915 = 256;

    @ObfuscatedName("client.rw")
    public static short field916 = 320;

    @ObfuscatedName("client.rf")
    public static short field917 = 1;

    @ObfuscatedName("client.rt")
    public static short field691 = 32767;

    @ObfuscatedName("client.rn")
    public static short field919 = 1;

    @ObfuscatedName("client.ry")
    public static short field847 = 32767;

    @ObfuscatedName("client.rx")
    public static int field921 = 0;

    @ObfuscatedName("client.rr")
    public static int field922 = 0;

    @ObfuscatedName("client.ro")
    public static int field923 = 0;

    @ObfuscatedName("client.so")
    public static int field924 = 0;

    @ObfuscatedName("client.sa")
    public static int field925 = 0;

    @ObfuscatedName("client.sq")
    public static class224 field857 = new class224();

    @ObfuscatedName("client.sn")
    public static int field851 = -1;

    @ObfuscatedName("client.sp")
    public static int field928 = -1;

    @ObfuscatedName("client.sj")
    public static class341 field929 = new class340();

    @ObfuscatedName("client.sb")
    public static class19[] field930 = new class19[8];

    @ObfuscatedName("client.sz")
    public static class77 field931 = new class77();

    @ObfuscatedName("client.sw")
    public static int field675 = -1;

    @ObfuscatedName("client.sd")
    public static ArrayList field933 = new ArrayList(10);

    @ObfuscatedName("client.ss")
    public static int field891 = 0;

    @ObfuscatedName("client.sk")
    public static int field935 = 0;

    @ObfuscatedName("client.tz")
    public static final class75 field936 = new class75();

    @ObfuscatedName("client.to")
    public static int[] field709 = new int[50];

    @ObfuscatedName("client.tl")
    public static int[] field860 = new int[50];

    @ObfuscatedName("ag.ew(I)Lmf;")
    public static class344 method265() {
        return Statics.field1453;
    }

    @ObfuscatedName("client.ap(B)V")
    public final void method889() {
    }

    public final void init() {
        if (!this.method942()) {
            return;
        }
        for (int var1 = 0; var1 <= 20; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field714 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class91.field1167)) {
                            field665 = true;
                        } else {
                            field665 = false;
                        }
                        break;
                    case 4:
                        if (field667 == -1) {
                            field667 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field663 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field3535 = class200.method3538(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class241[] var4 = class241.method12();
                        int var5 = 0;
                        class241 var7;
                        while (true) {
                            if (var5 >= var4.length) {
                                var7 = null;
                                break;
                            }
                            class241 var6 = var4[var5];
                            if (var6.field3148 == var3) {
                                var7 = var6;
                                break;
                            }
                            var5++;
                        }
                        Statics.field2775 = var7;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class91.field1167)) {
                        }
                        break;
                    case 9:
                        Statics.field4101 = var2;
                        break;
                    case 10:
                        Statics.field3700 = (class242) class205.method1123(class242.method5980(), Integer.parseInt(var2));
                        if (Statics.field3700 == class242.field3154) {
                            Statics.field617 = class349.field4066;
                        } else {
                            Statics.field617 = class349.field4073;
                        }
                        break;
                    case 12:
                        field844 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field1563 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field664 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1255 = var2;
                }
            }
        }
        class143.field1866 = false;
        field666 = false;
        Statics.field2471 = this.getCodeBase().getHost();
        String var8 = Statics.field2775.field3146;
        byte var9 = 0;
        try {
            class177.method2080("oldschool", var8, var9, 21);
        } catch (Exception var11) {
            class352.method4617((String) null, var11);
        }
        Statics.field7 = this;
        Statics.field2534 = field667;
        if (field668 == -1) {
            field668 = 0;
        }
        this.method920(765, 503, 194);
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method879() {
        class313.method3959(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field603 = field664 == 0 ? 43594 : field844 + 40000;
        Statics.field2020 = field664 == 0 ? 443 : field844 + 50000;
        Statics.field1313 = Statics.field603;
        Statics.field2566 = class225.field2578;
        Statics.field1340 = class225.field2574;
        Statics.field1144 = class225.field2576;
        Statics.field260 = class225.field2575;
        Statics.field537 = new class153();
        this.method858();
        this.method859();
        Statics.field3130 = this.method856();
        Statics.field373 = new class319(255, class177.field2068, class177.field2063, 500000);
        class354 var1 = null;
        class83 var2 = new class83();
        try {
            var1 = class177.method327("", Statics.field3700.field3155, false);
            byte[] var3 = new byte[(int) var1.method6272()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method6269(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class83(new class311(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method6267();
            }
        } catch (Exception var9) {
        }
        Statics.field191 = var2;
        this.method874();
        class61.method774(this, Statics.field368);
        if (field664 != 0) {
            field680 = true;
        }
        method3976(Statics.field191.field1075);
        Statics.field574 = new class84(Statics.field617);
    }

    @ObfuscatedName("client.at(B)V")
    public final void method880() {
        field729++;
        this.method1247();
        while (true) {
            class273 var1 = class246.field3192;
            class243 var2;
            synchronized (class246.field3192) {
                var2 = (class243) class246.field3187.method4702();
            }
            if (var2 == null) {
                class207.method3500();
                method3319();
                class55 var4 = class55.field409;
                synchronized (class55.field409) {
                    class55.field426++;
                    class55.field419 = class55.field425;
                    class55.field422 = 0;
                    if (class55.field418 >= 0) {
                        while (class55.field418 != class55.field417) {
                            int var6 = class55.field408[class55.field417];
                            class55.field417 = class55.field417 + 1 & 0x7F;
                            if (var6 < 0) {
                                class55.field416[~var6] = false;
                            } else {
                                if (!class55.field416[var6] && class55.field422 < class55.field421.length - 1) {
                                    class55.field421[++class55.field422 - 1] = var6;
                                }
                                class55.field416[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class55.field416[var5] = false;
                        }
                        class55.field418 = class55.field417;
                    }
                    if (class55.field422 > 0) {
                        class55.field426 = 0;
                    }
                    class55.field425 = class55.field424;
                }
                class64.method829();
                if (Statics.field3130 != null) {
                    int var8 = Statics.field3130.method750();
                    field863 = var8;
                }
                if (field670 == 0) {
                    method939();
                    Statics.field262.method3365();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field478[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field475[var10] = 0L;
                    }
                    Statics.field1771 = 0;
                } else if (field670 == 5) {
                    class95.method91(this);
                    method939();
                    Statics.field262.method3365();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field478[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field475[var12] = 0L;
                    }
                    Statics.field1771 = 0;
                } else if (field670 == 10 || field670 == 11) {
                    class95.method91(this);
                } else if (field670 == 20) {
                    class95.method91(this);
                    this.method1250();
                } else if (field670 == 25) {
                    method332();
                }
                if (field670 == 30) {
                    this.method1446();
                } else if (field670 == 40 || field670 == 45) {
                    this.method1250();
                }
                return;
            }
            var2.field3161.method4084(var2.field3160, (int) var2.field2141, var2.field3159, false);
        }
    }

    @ObfuscatedName("client.ak(ZI)V")
    public final void method881(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class207.field2436 == 2) {
                    if (Statics.field2422 == null) {
                        Statics.field2422 = class213.method3761(Statics.field2438, Statics.field2434, Statics.field1454);
                        if (Statics.field2422 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2124 == null) {
                        Statics.field2124 = new class118(Statics.field2440, Statics.field2435);
                    }
                    if (Statics.field1773.method3582(Statics.field2422, Statics.field2437, Statics.field2124, 22050)) {
                        Statics.field1773.method3583();
                        Statics.field1773.method3637(Statics.field436);
                        Statics.field1773.method3684(Statics.field2422, Statics.field2439);
                        class207.field2436 = 0;
                        Statics.field2422 = null;
                        Statics.field2124 = null;
                        Statics.field2438 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field1773.method3586();
                class207.field2436 = 0;
                Statics.field2422 = null;
                Statics.field2124 = null;
                Statics.field2438 = null;
            }
            var2 = false;
        }
        if (var2 && field900 && Statics.field2379 != null) {
            Statics.field2379.method2428();
        }
        if ((field670 == 10 || field670 == 20 || field670 == 30) && field939 != 0L && class308.method1082() > field939) {
            method3976(method3174());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field817[var5] = true;
            }
        }
        if (field670 == 0) {
            this.method883(class95.field1205, class95.field1206, arg0);
        } else if (field670 == 5) {
            class95.method3369(Statics.field597, Statics.field542, Statics.field1228);
        } else if (field670 == 10 || field670 == 11) {
            class95.method3369(Statics.field597, Statics.field542, Statics.field1228);
        } else if (field670 == 20) {
            class95.method3369(Statics.field597, Statics.field542, Statics.field1228);
        } else if (field670 == 25) {
            if (field721 == 1) {
                if (field786 > field718) {
                    field718 = field786;
                }
                int var6 = (field718 * 50 - field786 * 50) / field718;
                method331(class234.field2798 + class91.field1165 + class91.field1169 + var6 + "%" + class91.field1163, false);
            } else if (field721 == 2) {
                if (field719 > field720) {
                    field720 = field719;
                }
                int var7 = (field720 * 50 - field719 * 50) / field720 + 50;
                method331(class234.field2798 + class91.field1165 + class91.field1169 + var7 + "%" + class91.field1163, false);
            } else {
                method331(class234.field2798, false);
            }
        } else if (field670 == 30) {
            this.method1254();
        } else if (field670 == 40) {
            method331(class234.field2799 + class91.field1165 + class234.field2800, false);
        } else if (field670 == 45) {
            method331(class234.field2814, false);
        }
        if (field670 == 30 && field877 == 0 && !arg0 && !field879) {
            for (int var8 = 0; var8 < field937; var8++) {
                if (field828[var8]) {
                    Statics.field2072.method839(field873[var8], field874[var8], field875[var8], field717[var8]);
                    field828[var8] = false;
                }
            }
        } else if (field670 > 0) {
            Statics.field2072.method838(0, 0);
            for (int var9 = 0; var9 < field937; var9++) {
                field828[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ax(I)V")
    public final void method985() {
        if (Statics.field99.method2132()) {
            Statics.field99.method2129();
        }
        if (Statics.field3663 != null) {
            Statics.field3663.field600 = false;
        }
        Statics.field3663 = null;
        field751.method2241();
        if (class55.field409 != null) {
            class55 var1 = class55.field409;
            synchronized (class55.field409) {
                class55.field409 = null;
            }
        }
        if (class64.field495 != null) {
            class64 var3 = class64.field495;
            synchronized (class64.field495) {
                class64.field495 = null;
            }
        }
        Statics.field3130 = null;
        if (Statics.field2379 != null) {
            Statics.field2379.method2429();
        }
        if (Statics.field2772 != null) {
            Statics.field2772.method2429();
        }
        class248.method667();
        Object var5 = class246.field3189;
        synchronized (class246.field3189) {
            if (class246.field3188 != 0) {
                class246.field3188 = 1;
                try {
                    class246.field3189.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field537 != null) {
            Statics.field537.method3199();
            Statics.field537 = null;
        }
        class177.method337();
    }

    @ObfuscatedName("bf.eu(II)V")
    public static void method1104(int arg0) {
        if (field670 == arg0) {
            return;
        }
        if (field670 == 0) {
            Statics.field7.method940();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field696 = 0;
            field697 = 0;
            field787 = 0;
            field693.method4811(arg0);
            if (arg0 != 20) {
                method211(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2009 != null) {
            Statics.field2009.method3413();
            Statics.field2009 = null;
        }
        if (field670 == 25) {
            field721 = 0;
            field786 = 0;
            field718 = 1;
            field719 = 0;
            field720 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class95.method1117(Statics.field1062, Statics.field2419, true, 0);
        } else if (arg0 == 20) {
            class95.method1117(Statics.field1062, Statics.field2419, true, field670 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class95.method1117(Statics.field1062, Statics.field2419, false, 4);
        } else {
            class95.method436();
        }
        field670 = arg0;
    }

    @ObfuscatedName("client.ej(B)V")
    public void method1247() {
        if (field670 == 1000) {
            return;
        }
        long var1 = class308.method1082();
        int var3 = (int) (var1 - Statics.field3223);
        Statics.field3223 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class248.field3206 += var3;
        boolean var4;
        if (class248.field3216 == 0 && class248.field3209 == 0 && class248.field3217 == 0 && class248.field3207 == 0) {
            var4 = true;
        } else if (Statics.field3678 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class248.field3206 > 30000) {
                        throw new IOException();
                    }
                    while (class248.field3209 < 200 && class248.field3207 > 0) {
                        class244 var5 = (class244) class248.field3218.method5684();
                        class311 var6 = new class311(4);
                        var6.method5279(1);
                        var6.method5230((int) var5.field2141);
                        Statics.field3678.method3419(var6.field3746, 0, 4);
                        class248.field3208.method5683(var5, var5.field2141);
                        class248.field3207--;
                        class248.field3209++;
                    }
                    while (class248.field3216 < 200 && class248.field3217 > 0) {
                        class244 var7 = (class244) class248.field3210.method4621();
                        class311 var8 = new class311(4);
                        var8.method5279(0);
                        var8.method5230((int) var7.field2141);
                        Statics.field3678.method3419(var8.field3746, 0, 4);
                        var7.method3481();
                        class248.field3213.method5683(var7, var7.field2141);
                        class248.field3217--;
                        class248.field3216++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3678.method3415();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class248.field3206 = 0;
                        byte var11 = 0;
                        if (Statics.field541 == null) {
                            var11 = 8;
                        } else if (class248.field3220 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class248.field3215.field3747;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3678.method3428(class248.field3215.field3746, class248.field3215.field3747, var12);
                            if (class248.field3214 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class248.field3215.field3746[class248.field3215.field3747 + var13] ^= class248.field3214;
                                }
                            }
                            class248.field3215.field3747 += var12;
                            if (class248.field3215.field3747 < var11) {
                                break;
                            }
                            if (Statics.field541 == null) {
                                class248.field3215.field3747 = 0;
                                int var14 = class248.field3215.method5310();
                                int var15 = class248.field3215.method5247();
                                int var16 = class248.field3215.method5310();
                                int var17 = class248.field3215.method5455();
                                long var18 = (long) ((var14 << 16) + var15);
                                class244 var20 = (class244) class248.field3208.method5682(var18);
                                Statics.field3138 = true;
                                if (var20 == null) {
                                    var20 = (class244) class248.field3213.method5682(var18);
                                    Statics.field3138 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field541 = var20;
                                Statics.field3205 = new class311(var17 + var21 + Statics.field541.field3165);
                                Statics.field3205.method5279(var16);
                                Statics.field3205.method5231(var17);
                                class248.field3220 = 8;
                                class248.field3215.field3747 = 0;
                            } else if (class248.field3220 == 0) {
                                if (class248.field3215.field3746[0] == -1) {
                                    class248.field3220 = 1;
                                    class248.field3215.field3747 = 0;
                                } else {
                                    Statics.field541 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3205.field3746.length - Statics.field541.field3165;
                            int var23 = 512 - class248.field3220;
                            if (var23 > var22 - Statics.field3205.field3747) {
                                var23 = var22 - Statics.field3205.field3747;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3678.method3428(Statics.field3205.field3746, Statics.field3205.field3747, var23);
                            if (class248.field3214 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3205.field3746[Statics.field3205.field3747 + var24] ^= class248.field3214;
                                }
                            }
                            Statics.field3205.field3747 += var23;
                            class248.field3220 += var23;
                            if (Statics.field3205.field3747 == var22) {
                                if (Statics.field541.field2141 == 16711935L) {
                                    Statics.field1456 = Statics.field3205;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class247 var26 = class248.field3219[var25];
                                        if (var26 != null) {
                                            Statics.field1456.field3747 = var25 * 8 + 5;
                                            int var27 = Statics.field1456.method5455();
                                            int var28 = Statics.field1456.method5455();
                                            var26.method4082(var27, var28);
                                        }
                                    }
                                } else {
                                    class248.field3204.reset();
                                    class248.field3204.update(Statics.field3205.field3746, 0, var22);
                                    int var29 = (int) class248.field3204.getValue();
                                    if (Statics.field541.field3163 != var29) {
                                        try {
                                            Statics.field3678.method3413();
                                        } catch (Exception var35) {
                                        }
                                        class248.field3221++;
                                        Statics.field3678 = null;
                                        class248.field3214 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class248.field3221 = 0;
                                    class248.field3222 = 0;
                                    Statics.field541.field3164.method4083((int) (Statics.field541.field2141 & 0xFFFFL), Statics.field3205.field3746, (Statics.field541.field2141 & 0xFF0000L) == 16711680L, Statics.field3138);
                                }
                                Statics.field541.method3486();
                                if (Statics.field3138) {
                                    class248.field3209--;
                                } else {
                                    class248.field3216--;
                                }
                                class248.field3220 = 0;
                                Statics.field541 = null;
                                Statics.field3205 = null;
                            } else {
                                if (class248.field3220 != 512) {
                                    break;
                                }
                                class248.field3220 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3678.method3413();
                } catch (Exception var34) {
                }
                class248.field3222++;
                Statics.field3678 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1295();
        }
    }

    @ObfuscatedName("client.ed(I)V")
    public void method1295() {
        if (class248.field3221 >= 4) {
            this.method885("js5crc");
            field670 = 1000;
            return;
        }
        if (class248.field3222 >= 4) {
            if (field670 <= 5) {
                this.method885("js5io");
                field670 = 1000;
                return;
            }
            field762 = 3000;
            class248.field3222 = 3;
        }
        if (--field762 + 1 > 0) {
            return;
        }
        try {
            if (field733 == 0) {
                Statics.field2051 = Statics.field465.method3375(Statics.field2471, Statics.field1313);
                field733++;
            }
            if (field733 == 1) {
                if (Statics.field2051.field2039 == 2) {
                    this.method1249(-1);
                    return;
                }
                if (Statics.field2051.field2039 == 1) {
                    field733++;
                }
            }
            if (field733 == 2) {
                if (field714) {
                    Statics.field249 = class316.method1682((Socket) Statics.field2051.field2043, 40000, 5000);
                } else {
                    Statics.field249 = new class181((Socket) Statics.field2051.field2043, Statics.field465, 5000);
                }
                class311 var1 = new class311(5);
                var1.method5279(15);
                var1.method5231(194);
                Statics.field249.method3419(var1.field3746, 0, 5);
                field733++;
                Statics.field1037 = class308.method1082();
            }
            if (field733 == 3) {
                if (Statics.field249.method3415() > 0 || !field714 && field670 <= 5) {
                    int var2 = Statics.field249.method3414();
                    if (var2 != 0) {
                        this.method1249(var2);
                        return;
                    }
                    field733++;
                } else if (class308.method1082() - Statics.field1037 > 30000L) {
                    this.method1249(-2);
                    return;
                }
            }
            if (field733 == 4) {
                class316 var3 = Statics.field249;
                boolean var4 = field670 > 20;
                if (Statics.field3678 != null) {
                    try {
                        Statics.field3678.method3413();
                    } catch (Exception var14) {
                    }
                    Statics.field3678 = null;
                }
                Statics.field3678 = var3;
                Statics.method1705(var4);
                class248.field3215.field3747 = 0;
                Statics.field541 = null;
                Statics.field3205 = null;
                class248.field3220 = 0;
                while (true) {
                    class244 var6 = (class244) class248.field3208.method5684();
                    if (var6 == null) {
                        while (true) {
                            class244 var7 = (class244) class248.field3213.method5684();
                            if (var7 == null) {
                                if (class248.field3214 != 0) {
                                    try {
                                        class311 var8 = new class311(4);
                                        var8.method5279(4);
                                        var8.method5279(class248.field3214);
                                        var8.method5229(0);
                                        Statics.field3678.method3419(var8.field3746, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3678.method3413();
                                        } catch (Exception var12) {
                                        }
                                        class248.field3222++;
                                        Statics.field3678 = null;
                                    }
                                }
                                class248.field3206 = 0;
                                Statics.field3223 = class308.method1082();
                                Statics.field2051 = null;
                                Statics.field249 = null;
                                field733 = 0;
                                field695 = 0;
                                return;
                            }
                            class248.field3210.method4624(var7);
                            class248.field3211.method5683(var7, var7.field2141);
                            class248.field3217++;
                            class248.field3216--;
                        }
                    }
                    class248.field3218.method5683(var6, var6.field2141);
                    class248.field3207++;
                    class248.field3209--;
                }
            }
        } catch (IOException var15) {
            this.method1249(-3);
        }
    }

    @ObfuscatedName("client.ei(IB)V")
    public void method1249(int arg0) {
        Statics.field2051 = null;
        Statics.field249 = null;
        field733 = 0;
        if (Statics.field603 == Statics.field1313) {
            Statics.field1313 = Statics.field2020;
        } else {
            Statics.field1313 = Statics.field603;
        }
        field695++;
        if (field695 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field670 <= 5) {
                this.method885("js5connect_full");
                field670 = 1000;
            } else {
                field762 = 3000;
            }
        } else if (field695 >= 2 && arg0 == 6) {
            this.method885("js5connect_outofdate");
            field670 = 1000;
        } else if (field695 >= 4) {
            if (field670 <= 5) {
                this.method885("js5connect");
                field670 = 1000;
            } else {
                field762 = 3000;
            }
        }
    }

    @ObfuscatedName("hg.ex(Liy;Ljava/lang/String;I)V")
    public static void method3790(class247 arg0, String arg1) {
        class68 var2 = new class68(arg0, arg1);
        field933.add(var2);
        field935 += var2.field553;
    }

    @ObfuscatedName("il.ez(I)Z")
    public static boolean method4157() {
        if (field933 == null || field891 >= field933.size()) {
            return true;
        }
        while (field891 < field933.size()) {
            class68 var0 = (class68) field933.get(field891);
            if (!var0.method1098()) {
                return false;
            }
            field891++;
        }
        return true;
    }

    @ObfuscatedName("eb.fi(I)I")
    public static int method2921() {
        if (field933 == null || field891 >= field933.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field891; var1++) {
            var0 += ((class68) field933.get(var1)).field550;
        }
        return var0 * 10000 / field935;
    }

    @ObfuscatedName("bt.fa(I)V")
    public static void method939() {
        if (field692 == 0) {
            Statics.field2034 = new class143(4, 104, 104, class65.field525);
            for (int var0 = 0; var0 < 4; var0++) {
                field772[var0] = new class182(104, 104);
            }
            Statics.field115 = new class336(512, 512);
            class95.field1206 = class234.field2801;
            class95.field1205 = 5;
            field692 = 20;
        } else if (field692 == 20) {
            class95.field1206 = class234.field3030;
            class95.field1205 = 10;
            field692 = 30;
        } else if (field692 == 30) {
            Statics.field401 = method2920(0, false, true, true);
            Statics.field2549 = method2920(1, false, true, true);
            Statics.field158 = method2920(2, true, false, true);
            Statics.field2573 = method2920(3, false, true, true);
            Statics.field333 = method2920(4, false, true, true);
            Statics.field48 = method2920(5, true, true, true);
            Statics.field1954 = method2920(6, true, true, true);
            Statics.field135 = method2920(7, false, true, true);
            Statics.field2419 = method2920(8, false, true, true);
            Statics.field1761 = method2920(9, false, true, true);
            Statics.field1062 = method2920(10, false, true, true);
            Statics.field354 = method2920(11, false, true, true);
            Statics.field183 = method2920(12, false, true, true);
            Statics.field2113 = method2920(13, true, false, true);
            Statics.field533 = method2920(14, false, true, true);
            Statics.field2553 = method2920(15, false, true, true);
            Statics.field3488 = method2920(17, true, true, true);
            Statics.field144 = method2920(18, false, true, true);
            Statics.field551 = method2920(19, false, true, true);
            Statics.field1221 = method2920(20, false, true, true);
            class95.field1206 = class234.field2803;
            class95.field1205 = 20;
            field692 = 40;
        } else if (field692 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field401.method4085() * 4 / 100;
            int var3 = var2 + Statics.field2549.method4085() * 4 / 100;
            int var4 = var3 + Statics.field158.method4085() * 2 / 100;
            int var5 = var4 + Statics.field2573.method4085() * 2 / 100;
            int var6 = var5 + Statics.field333.method4085() * 6 / 100;
            int var7 = var6 + Statics.field48.method4085() * 4 / 100;
            int var8 = var7 + Statics.field1954.method4085() * 2 / 100;
            int var9 = var8 + Statics.field135.method4085() * 56 / 100;
            int var10 = var9 + Statics.field2419.method4085() * 2 / 100;
            int var11 = var10 + Statics.field1761.method4085() * 2 / 100;
            int var12 = var11 + Statics.field1062.method4085() * 2 / 100;
            int var13 = var12 + Statics.field354.method4085() * 2 / 100;
            int var14 = var13 + Statics.field183.method4085() * 2 / 100;
            int var15 = var14 + Statics.field2113.method4085() * 2 / 100;
            int var16 = var15 + Statics.field533.method4085() * 2 / 100;
            int var17 = var16 + Statics.field2553.method4085() * 2 / 100;
            int var18 = var17 + Statics.field551.method4085() / 100;
            int var19 = var18 + Statics.field144.method4085() / 100;
            int var20 = var19 + Statics.field1221.method4085() / 100;
            int var21 = var20 + (Statics.field3488.method4081() && Statics.field3488.method4034() ? 1 : 0);
            if (var21 == 100) {
                method3790(Statics.field401, "Animations");
                method3790(Statics.field2549, "Skeletons");
                method3790(Statics.field333, "Sound FX");
                method3790(Statics.field48, "Maps");
                method3790(Statics.field1954, "Music Tracks");
                method3790(Statics.field135, "Models");
                method3790(Statics.field2419, "Sprites");
                method3790(Statics.field354, "Music Jingles");
                method3790(Statics.field533, "Music Samples");
                method3790(Statics.field2553, "Music Patches");
                method3790(Statics.field551, "World Map");
                method3790(Statics.field144, "World Map Geography");
                method3790(Statics.field1221, "World Map Ground");
                Statics.field450 = new class323();
                Statics.field450.method5627(Statics.field3488);
                class95.field1206 = class234.field2805;
                class95.field1205 = 30;
                field692 = 45;
            } else {
                if (var21 != 0) {
                    class95.field1206 = class234.field2804 + var21 + "%";
                }
                class95.field1205 = 30;
            }
        } else if (field692 == 45) {
            boolean var22 = !field666;
            Statics.field3339 = 22050;
            Statics.field1432 = var22;
            Statics.field1420 = 2;
            class208 var23 = new class208();
            var23.method3588(9, 128);
            Statics.field2379 = class115.method144(Statics.field465, 0, 22050);
            Statics.field2379.method2425(var23);
            class207.method1118(Statics.field2553, Statics.field533, Statics.field333, var23);
            Statics.field2772 = class115.method144(Statics.field465, 1, 2048);
            Statics.field3325 = new class108();
            Statics.field2772.method2425(Statics.field3325);
            Statics.field1041 = new class122(22050, Statics.field3339);
            class95.field1206 = class234.field2950;
            class95.field1205 = 35;
            field692 = 50;
            Statics.field4082 = new class304(Statics.field2419, Statics.field2113);
        } else if (field692 == 50) {
            class303[] var24 = new class303[] { class303.field3697, class303.field3696, class303.field3701, class303.field3692, class303.field3693, class303.field3695 };
            int var25 = var24.length;
            class304 var26 = Statics.field4082;
            class303[] var27 = new class303[] { class303.field3697, class303.field3696, class303.field3701, class303.field3692, class303.field3693, class303.field3695 };
            field716 = var26.method5067(var27);
            if (field716.size() < var25) {
                class95.field1206 = class234.field2993 + field716.size() * 100 / var25 + "%";
                class95.field1205 = 40;
            } else {
                Statics.field542 = (class306) field716.get(class303.field3697);
                Statics.field1228 = (class306) field716.get(class303.field3695);
                Statics.field597 = (class306) field716.get(class303.field3692);
                Statics.field105 = field929.method5988();
                class95.field1206 = class234.field2955;
                class95.field1205 = 40;
                field692 = 60;
            }
        } else if (field692 == 60) {
            class247 var28 = Statics.field1062;
            class247 var29 = Statics.field2419;
            int var30 = 0;
            if (var28.method4019("title.jpg", "")) {
                var30++;
            }
            if (var29.method4019("logo", "")) {
                var30++;
            }
            if (var29.method4019("logo_deadman_mode", "")) {
                var30++;
            }
            if (var29.method4019("logo_seasonal_mode", "")) {
                var30++;
            }
            if (var29.method4019("titlebox", "")) {
                var30++;
            }
            if (var29.method4019("titlebutton", "")) {
                var30++;
            }
            if (var29.method4019("runes", "")) {
                var30++;
            }
            if (var29.method4019("title_mute", "")) {
                var30++;
            }
            if (var29.method4019("options_radio_buttons,0", "")) {
                var30++;
            }
            if (var29.method4019("options_radio_buttons,2", "")) {
                var30++;
            }
            if (var29.method4019("options_radio_buttons,4", "")) {
                var30++;
            }
            if (var29.method4019("options_radio_buttons,6", "")) {
                var30++;
            }
            var29.method4019("sl_back", "");
            var29.method4019("sl_flags", "");
            var29.method4019("sl_arrows", "");
            var29.method4019("sl_stars", "");
            var29.method4019("sl_button", "");
            int var33 = class95.method263();
            if (var30 < var33) {
                class95.field1206 = class234.field2787 + var30 * 100 / var33 + "%";
                class95.field1205 = 50;
            } else {
                class95.field1206 = class234.field2806;
                class95.field1205 = 50;
                method1104(5);
                field692 = 70;
            }
        } else if (field692 == 70) {
            if (Statics.field158.method4034()) {
                class269.method3945(Statics.field158);
                class247 var34 = Statics.field158;
                Statics.field3291 = var34;
                class257.method3961(Statics.field158, Statics.field135);
                class265.method3184(Statics.field158, Statics.field135, field666);
                class268.method32(Statics.field158, Statics.field135);
                class262.method3787(Statics.field158);
                class247 var35 = Statics.field158;
                class247 var36 = Statics.field135;
                boolean var37 = field665;
                class306 var38 = Statics.field542;
                Statics.field3682 = var35;
                Statics.field50 = var36;
                Statics.field3880 = var37;
                Statics.field405 = Statics.field3682.method4008(10);
                Statics.field3472 = var38;
                class270.method2695(Statics.field158, Statics.field401, Statics.field2549);
                class247 var39 = Statics.field158;
                class247 var40 = Statics.field135;
                Statics.field3280 = var39;
                Statics.field3277 = var40;
                class247 var41 = Statics.field158;
                Statics.field3331 = var41;
                class247 var42 = Statics.field158;
                Statics.field3242 = var42;
                Statics.field444 = Statics.field3242.method4008(16);
                class227.method1013(Statics.field2573, Statics.field135, Statics.field2419, Statics.field2113);
                class251.method3789(Statics.field158);
                class247 var43 = Statics.field158;
                Statics.field3350 = var43;
                class254.method204(Statics.field158);
                class261.method3513(Statics.field158);
                Statics.field99 = new class100();
                class264.method4339(Statics.field158, Statics.field2419, Statics.field2113);
                class258.method3282(Statics.field158, Statics.field2419);
                class247 var44 = Statics.field158;
                class247 var45 = Statics.field2419;
                Statics.field3253 = var45;
                if (var44.method4034()) {
                    Statics.field3247 = var44.method4008(35);
                    Statics.field3261 = new class253[Statics.field3247];
                    for (int var46 = 0; var46 < Statics.field3247; var46++) {
                        byte[] var47 = var44.method4032(35, var46);
                        Statics.field3261[var46] = new class253(var46);
                        if (var47 != null) {
                            Statics.field3261[var46].method4175(new class311(var47));
                            Statics.field3261[var46].method4181();
                        }
                    }
                }
                class95.field1206 = class234.field2853;
                class95.field1205 = 60;
                field692 = 80;
            } else {
                class95.field1206 = class234.field2922 + Statics.field158.method4094() + "%";
                class95.field1205 = 60;
            }
        } else if (field692 == 80) {
            int var48 = 0;
            if (Statics.field1063 == null) {
                Statics.field1063 = class337.method5613(Statics.field2419, Statics.field450.field3845, 0);
            } else {
                var48++;
            }
            if (Statics.field3114 == null) {
                Statics.field3114 = class337.method5613(Statics.field2419, Statics.field450.field3848, 0);
            } else {
                var48++;
            }
            if (Statics.field315 == null) {
                Statics.field315 = class337.method3175(Statics.field2419, Statics.field450.field3843, 0);
            } else {
                var48++;
            }
            if (Statics.field727 == null) {
                Statics.field727 = class337.method245(Statics.field2419, Statics.field450.field3842, 0);
            } else {
                var48++;
            }
            if (Statics.field2017 == null) {
                Statics.field2017 = class337.method245(Statics.field2419, Statics.field450.field3839, 0);
            } else {
                var48++;
            }
            if (Statics.field67 == null) {
                Statics.field67 = class337.method245(Statics.field2419, Statics.field450.field3844, 0);
            } else {
                var48++;
            }
            if (Statics.field70 == null) {
                Statics.field70 = class337.method245(Statics.field2419, Statics.field450.field3840, 0);
            } else {
                var48++;
            }
            if (Statics.field1904 == null) {
                Statics.field1904 = class337.method245(Statics.field2419, Statics.field450.field3846, 0);
            } else {
                var48++;
            }
            if (Statics.field1321 == null) {
                Statics.field1321 = class337.method245(Statics.field2419, Statics.field450.field3847, 0);
            } else {
                var48++;
            }
            if (Statics.field1104 == null) {
                Statics.field1104 = class337.method3175(Statics.field2419, Statics.field450.field3841, 0);
            } else {
                var48++;
            }
            if (Statics.field965 == null) {
                Statics.field965 = class337.method3175(Statics.field2419, Statics.field450.field3849, 0);
            } else {
                var48++;
            }
            if (var48 < 11) {
                class95.field1206 = class234.field2813 + var48 * 100 / 12 + "%";
                class95.field1205 = 70;
            } else {
                Statics.field3721 = Statics.field965;
                Statics.field3114.method5828();
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 41.0D) - 20;
                Statics.field315[0].method5813(var49 + var52, var50 + var52, var51 + var52);
                class95.field1206 = class234.field2939;
                class95.field1205 = 70;
                field692 = 90;
            }
        } else if (field692 == 90) {
            if (Statics.field1761.method4034()) {
                Statics.field1888 = new class129(Statics.field1761, Statics.field2419, 20, Statics.field191.field1073, field666 ? 64 : 128);
                class140.method2936(Statics.field1888);
                class140.method2931(Statics.field191.field1073);
                field692 = 100;
            } else {
                class95.field1206 = class234.field2815 + "0%";
                class95.field1205 = 90;
            }
        } else if (field692 == 100) {
            int var53 = Statics.field1888.method2666();
            if (var53 < 100) {
                class95.field1206 = class234.field2815 + var53 + "%";
                class95.field1205 = 90;
            } else {
                class95.field1206 = class234.field2816;
                class95.field1205 = 90;
                field692 = 110;
            }
        } else if (field692 == 110) {
            Statics.field3663 = new class73();
            Statics.field465.method3387(Statics.field3663, 10);
            class95.field1206 = class234.field2817;
            class95.field1205 = 92;
            field692 = 120;
        } else if (field692 == 120) {
            if (Statics.field1062.method4019("huffman", "")) {
                class219 var54 = new class219(Statics.field1062.method3980("huffman", ""));
                Statics.field2541 = var54;
                class95.field1206 = class234.field2819;
                class95.field1205 = 94;
                field692 = 130;
            } else {
                class95.field1206 = class234.field2976 + "%";
                class95.field1205 = 94;
            }
        } else if (field692 == 130) {
            if (!Statics.field2573.method4034()) {
                class95.field1206 = class234.field2828 + Statics.field2573.method4094() * 4 / 5 + "%";
                class95.field1205 = 96;
            } else if (!Statics.field183.method4034()) {
                class95.field1206 = class234.field2828 + (80 + Statics.field183.method4094() / 6) + "%";
                class95.field1205 = 96;
            } else if (Statics.field2113.method4034()) {
                class95.field1206 = class234.field2821;
                class95.field1205 = 98;
                field692 = 140;
            } else {
                class95.field1206 = class234.field2828 + (96 + Statics.field2113.method4094() / 50) + "%";
                class95.field1205 = 96;
            }
        } else if (field692 == 140) {
            class95.field1205 = 100;
            if (Statics.field551.method4006(class45.field334.field335)) {
                if (Statics.field1453 == null) {
                    Statics.field1453 = new class344();
                    Statics.field1453.method6042(Statics.field551, Statics.field144, Statics.field1221, Statics.field597, field716, Statics.field315);
                }
                class95.field1206 = class234.field2871;
                field692 = 150;
            } else {
                class95.field1206 = class234.field2822 + Statics.field551.method4073(class45.field334.field335) / 10 + "%";
            }
        } else if (field692 == 150) {
            method1104(10);
        }
    }

    @ObfuscatedName("eb.fh(IZZZI)Liy;")
    public static class247 method2920(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class319 var4 = null;
        if (class177.field2068 != null) {
            var4 = new class319(arg0, class177.field2068, Statics.field382[arg0], 1000000);
        }
        return new class247(var4, Statics.field373, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1250() {
        class316 var1 = field751.method2240();
        class310 var2 = field751.field1327;
        try {
            if (field696 == 0) {
                if (Statics.field339 == null && (field677.method2089() || field697 > 250)) {
                    Statics.field339 = field677.method2090();
                    field677.method2097();
                    field677 = null;
                }
                if (Statics.field339 != null) {
                    if (var1 != null) {
                        var1.method3413();
                        var1 = null;
                    }
                    Statics.field2095 = null;
                    field713 = false;
                    field697 = 0;
                    field696 = 1;
                }
            }
            if (field696 == 1) {
                if (Statics.field2095 == null) {
                    Statics.field2095 = Statics.field465.method3375(Statics.field2471, Statics.field1313);
                }
                if (Statics.field2095.field2039 == 2) {
                    throw new IOException();
                }
                if (Statics.field2095.field2039 == 1) {
                    if (field714) {
                        var1 = class316.method1682((Socket) Statics.field2095.field2043, 40000, 5000);
                    } else {
                        var1 = new class181((Socket) Statics.field2095.field2043, Statics.field465, 5000);
                    }
                    field751.method2231(var1);
                    Statics.field2095 = null;
                    field696 = 2;
                }
            }
            if (field696 == 2) {
                field751.method2228();
                class197 var3;
                if (class197.field2370 == 0) {
                    var3 = new class197();
                } else {
                    var3 = class197.field2369[--class197.field2370];
                }
                var3.field2367 = null;
                var3.field2365 = 0;
                var3.field2372 = new class310(5000);
                var3.field2372.method5279(class194.field2343.field2336);
                field751.method2239(var3);
                field751.method2229();
                var2.field3747 = 0;
                field696 = 3;
            }
            if (field696 == 3) {
                if (Statics.field2379 != null) {
                    Statics.field2379.method2427();
                }
                if (Statics.field2772 != null) {
                    Statics.field2772.method2427();
                }
                boolean var7 = true;
                if (field714 && !var1.method3418(1)) {
                    var7 = false;
                }
                if (var7) {
                    int var8 = var1.method3414();
                    if (Statics.field2379 != null) {
                        Statics.field2379.method2427();
                    }
                    if (Statics.field2772 != null) {
                        Statics.field2772.method2427();
                    }
                    if (var8 != 0) {
                        method742(var8);
                        return;
                    }
                    var2.field3747 = 0;
                    field696 = 4;
                }
            }
            if (field696 == 4) {
                if (var2.field3747 < 8) {
                    int var9 = var1.method3415();
                    if (var9 > 8 - var2.field3747) {
                        var9 = 8 - var2.field3747;
                    }
                    if (var9 > 0) {
                        var1.method3428(var2.field3746, var2.field3747, var9);
                        var2.field3747 += var9;
                    }
                }
                if (var2.field3747 == 8) {
                    var2.field3747 = 0;
                    Statics.field3109 = var2.method5251();
                    field696 = 5;
                }
            }
            if (field696 == 5) {
                field751.field1327.field3747 = 0;
                field751.method2228();
                class310 var10 = new class310(500);
                int[] var11 = new int[] { Statics.field339.nextInt(), Statics.field339.nextInt(), Statics.field339.nextInt(), Statics.field339.nextInt() };
                var10.field3747 = 0;
                var10.method5279(1);
                var10.method5231(var11[0]);
                var10.method5231(var11[1]);
                var10.method5231(var11[2]);
                var10.method5231(var11[3]);
                var10.method5233(Statics.field3109);
                if (field670 == 40) {
                    var10.method5231(Statics.field6[0]);
                    var10.method5231(Statics.field6[1]);
                    var10.method5231(Statics.field6[2]);
                    var10.method5231(Statics.field6[3]);
                } else {
                    var10.method5279(field662.method30());
                    switch(field662.field2015) {
                        case 0:
                        case 2:
                            var10.method5230(Statics.field440);
                            var10.field3747++;
                            break;
                        case 1:
                            var10.field3747 += 4;
                            break;
                        case 3:
                            LinkedHashMap var13 = Statics.field191.field1070;
                            String var14 = class95.field1226;
                            int var15 = var14.length();
                            int var16 = 0;
                            for (int var17 = 0; var17 < var15; var17++) {
                                var16 = (var16 << 5) - var16 + var14.charAt(var17);
                            }
                            var10.method5231((Integer) var13.get(var16));
                    }
                    var10.method5279(class324.field3853.method30());
                    var10.method5257(class95.field1215);
                }
                var10.method5341(class93.field1185, class93.field1178);
                Statics.field6 = var11;
                class197 var19;
                if (class197.field2370 == 0) {
                    var19 = new class197();
                } else {
                    var19 = class197.field2369[--class197.field2370];
                }
                var19.field2367 = null;
                var19.field2365 = 0;
                var19.field2372 = new class310(5000);
                var19.field2372.field3747 = 0;
                if (field670 == 40) {
                    var19.field2372.method5279(class194.field2339.field2336);
                } else {
                    var19.field2372.method5279(class194.field2337.field2336);
                }
                var19.field2372.method5229(0);
                int var23 = var19.field2372.field3747;
                var19.field2372.method5231(194);
                var19.field2372.method5231(1);
                var19.field2372.method5279(field667);
                var19.field2372.method5279(field668);
                var19.field2372.method5238(var10.field3746, 0, var10.field3747);
                int var24 = var19.field2372.field3747;
                var19.field2372.method5257(class95.field1226);
                var19.field2372.method5279((field879 ? 1 : 0) << 1 | (field666 ? 1 : 0));
                var19.field2372.method5229(Statics.field88);
                var19.field2372.method5229(Statics.field145);
                method1240(var19.field2372);
                var19.field2372.method5257(Statics.field4101);
                var19.field2372.method5231(Statics.field1563);
                class311 var25 = new class311(Statics.field105.method5993());
                Statics.field105.method5999(var25);
                var19.field2372.method5238(var25.field3746, 0, var25.field3746.length);
                var19.field2372.method5279(field667);
                var19.field2372.method5231(0);
                var19.field2372.method5432(Statics.field48.field3181);
                var19.field2372.method5337(Statics.field1954.field3181);
                var19.field2372.method5337(Statics.field135.field3181);
                var19.field2372.method5292(Statics.field354.field3181);
                var19.field2372.method5292(Statics.field2419.field3181);
                var19.field2372.method5292(Statics.field183.field3181);
                var19.field2372.method5292(Statics.field2573.field3181);
                var19.field2372.method5337(Statics.field2113.field3181);
                var19.field2372.method5231(Statics.field1221.field3181);
                var19.field2372.method5231(Statics.field144.field3181);
                var19.field2372.method5231(Statics.field1761.field3181);
                var19.field2372.method5231(Statics.field533.field3181);
                var19.field2372.method5231(Statics.field1062.field3181);
                var19.field2372.method5337(Statics.field551.field3181);
                var19.field2372.method5432(Statics.field158.field3181);
                var19.field2372.method5231(Statics.field3488.field3181);
                var19.field2372.method5337(Statics.field401.field3181);
                var19.field2372.method5337(0);
                var19.field2372.method5231(Statics.field333.field3181);
                var19.field2372.method5432(Statics.field2553.field3181);
                var19.field2372.method5432(Statics.field2549.field3181);
                var19.field2372.method5266(var11, var24, var19.field2372.field3747);
                var19.field2372.method5241(var19.field2372.field3747 - var23);
                field751.method2239(var19);
                field751.method2229();
                field751.field1333 = new class339(var11);
                int[] var26 = new int[4];
                for (int var27 = 0; var27 < 4; var27++) {
                    var26[var27] = var11[var27] + 50;
                }
                var2.method5186(var26);
                field696 = 6;
            }
            if (field696 == 6 && var1.method3415() > 0) {
                int var28 = var1.method3414();
                if (var28 == 21 && field670 == 20) {
                    field696 = 12;
                } else if (var28 == 2) {
                    field696 = 14;
                } else if (var28 == 15 && field670 == 40) {
                    field751.field1329 = -1;
                    field696 = 19;
                } else if (var28 == 64) {
                    field696 = 10;
                } else if (var28 == 23 && field787 < 1) {
                    field787++;
                    field696 = 0;
                } else if (var28 == 29) {
                    field696 = 17;
                } else if (var28 == 69) {
                    field696 = 7;
                } else {
                    method742(var28);
                    return;
                }
            }
            if (field696 == 7 && var1.method3415() >= 2) {
                var1.method3428(var2.field3746, 0, 2);
                var2.field3747 = 0;
                Statics.field1481 = var2.method5247();
                field696 = 8;
            }
            if (field696 == 8 && var1.method3415() >= Statics.field1481) {
                var2.field3747 = 0;
                var1.method3428(var2.field3746, var2.field3747, Statics.field1481);
                class8 var29 = class8.method333()[var2.method5310()];
                try {
                    switch(var29.field37) {
                        case 0:
                            class6 var30 = new class6();
                            this.field783 = new class10(var2, var30);
                            field696 = 9;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var75) {
                    method742(22);
                    return;
                }
            }
            if (field696 == 9 && this.field783.method89()) {
                this.field703 = this.field783.method75();
                this.field783.method74();
                this.field783 = null;
                if (this.field703 == null) {
                    method742(22);
                    return;
                }
                field751.method2228();
                class197 var33;
                if (class197.field2370 == 0) {
                    var33 = new class197();
                } else {
                    var33 = class197.field2369[--class197.field2370];
                }
                var33.field2367 = null;
                var33.field2365 = 0;
                var33.field2372 = new class310(5000);
                var33.field2372.method5279(class194.field2338.field2336);
                var33.field2372.method5229(this.field703.field3747);
                var33.field2372.method5239(this.field703);
                field751.method2239(var33);
                field751.method2229();
                this.field703 = null;
                field696 = 6;
            }
            if (field696 == 10 && var1.method3415() > 0) {
                Statics.field2033 = var1.method3414();
                field696 = 11;
            }
            if (field696 == 11 && var1.method3415() >= Statics.field2033) {
                var1.method3428(var2.field3746, 0, Statics.field2033);
                var2.field3747 = 0;
                field696 = 6;
            }
            if (field696 == 12 && var1.method3415() > 0) {
                field702 = (var1.method3414() + 3) * 60;
                field696 = 13;
            }
            if (field696 == 13) {
                field697 = 0;
                class95.method4156(class234.field2829, class234.field2830, field702 / 60 + class234.field2831);
                if (--field702 <= 0) {
                    field696 = 0;
                }
            } else {
                if (field696 == 14 && var1.method3415() >= 1) {
                    Statics.field2000 = var1.method3414();
                    field696 = 15;
                }
                if (field696 == 15 && var1.method3415() >= Statics.field2000) {
                    boolean var37 = var1.method3414() == 1;
                    var1.method3428(var2.field3746, 0, 4);
                    var2.field3747 = 0;
                    boolean var38 = false;
                    if (var37) {
                        int var39 = var2.method5189() << 24;
                        int var40 = var39 | var2.method5189() << 16;
                        int var41 = var40 | var2.method5189() << 8;
                        int var42 = var41 | var2.method5189();
                        String var43 = class95.field1226;
                        int var44 = var43.length();
                        int var45 = 0;
                        int var46 = 0;
                        while (true) {
                            if (var46 >= var44) {
                                if (Statics.field191.field1070.size() >= 10 && !Statics.field191.field1070.containsKey(var45)) {
                                    Iterator var49 = Statics.field191.field1070.entrySet().iterator();
                                    var49.next();
                                    var49.remove();
                                }
                                Statics.field191.field1070.put(var45, var42);
                                break;
                            }
                            var45 = (var45 << 5) - var45 + var43.charAt(var46);
                            var46++;
                        }
                    }
                    if (field701) {
                        Statics.field191.field1076 = class95.field1226;
                    } else {
                        Statics.field191.field1076 = null;
                    }
                    class83.method213();
                    field754 = var1.method3414();
                    field853 = var1.method3414() == 1;
                    field750 = var1.method3414();
                    field750 <<= 0x8;
                    field750 += var1.method3414();
                    field674 = var1.method3414();
                    var1.method3428(var2.field3746, 0, 1);
                    var2.field3747 = 0;
                    class192[] var50 = class192.method578();
                    int var51 = var2.method5201();
                    if (var51 < 0 || var51 >= var50.length) {
                        throw new IOException(var51 + " " + var2.field3747);
                    }
                    field751.field1326 = var50[var51];
                    field751.field1329 = field751.field1326.field2229;
                    var1.method3428(var2.field3746, 0, 2);
                    var2.field3747 = 0;
                    field751.field1329 = var2.method5247();
                    try {
                        client var52 = Statics.field7;
                        JSObject.getWindow(var52).call("zap", (Object[]) null);
                    } catch (Throwable var74) {
                    }
                    field696 = 16;
                }
                if (field696 != 16) {
                    if (field696 == 17 && var1.method3415() >= 2) {
                        var2.field3747 = 0;
                        var1.method3428(var2.field3746, 0, 2);
                        var2.field3747 = 0;
                        Statics.field1117 = var2.method5247();
                        field696 = 18;
                    }
                    if (field696 == 18 && var1.method3415() >= Statics.field1117) {
                        var2.field3747 = 0;
                        var1.method3428(var2.field3746, 0, Statics.field1117);
                        var2.field3747 = 0;
                        String var69 = var2.method5465();
                        String var70 = var2.method5465();
                        String var71 = var2.method5465();
                        class95.method4156(var69, var70, var71);
                        method1104(10);
                    }
                    if (field696 == 19) {
                        if (field751.field1329 == -1) {
                            if (var1.method3415() < 2) {
                                return;
                            }
                            var1.method3428(var2.field3746, 0, 2);
                            var2.field3747 = 0;
                            field751.field1329 = var2.method5247();
                        }
                        if (var1.method3415() >= field751.field1329) {
                            var1.method3428(var2.field3746, 0, field751.field1329);
                            var2.field3747 = 0;
                            int var72 = field751.field1329;
                            field693.method4800();
                            method3953();
                            class99.method3960(var2);
                            if (var2.field3747 != var72) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field697++;
                        if (field697 > 2000) {
                            if (field787 < 1) {
                                if (Statics.field603 == Statics.field1313) {
                                    Statics.field1313 = Statics.field2020;
                                } else {
                                    Statics.field1313 = Statics.field603;
                                }
                                field787++;
                                field696 = 0;
                            } else {
                                method742(-3);
                            }
                        }
                    }
                } else if (var1.method3415() >= field751.field1329) {
                    var2.field3747 = 0;
                    var1.method3428(var2.field3746, 0, field751.field1329);
                    field693.method4798();
                    field806 = 1L;
                    Statics.field3663.field605 = 0;
                    Statics.field1441 = true;
                    field687 = true;
                    field889 = -1L;
                    class106.method1133();
                    field751.method2228();
                    field751.field1327.field3747 = 0;
                    field751.field1326 = null;
                    field751.field1332 = null;
                    field751.field1334 = null;
                    field751.field1335 = null;
                    field751.field1329 = 0;
                    field751.field1331 = 0;
                    field681 = 0;
                    field712 = 0;
                    field682 = 0;
                    field736 = 0;
                    field752 = false;
                    class64.field496 = 0;
                    class101.field1290.clear();
                    class101.field1291.method5650();
                    class101.field1289.method4785();
                    class101.field1292 = 0;
                    field818 = 0;
                    field820 = false;
                    field878 = 0;
                    field735 = 0;
                    field740 = 0;
                    Statics.field1017 = null;
                    field888 = 0;
                    field890 = -1;
                    field895 = 0;
                    field789 = 0;
                    field690 = class94.field1192;
                    field773 = class94.field1192;
                    field707 = 0;
                    class99.method2022();
                    for (int var54 = 0; var54 < 2048; var54++) {
                        field671[var54] = null;
                    }
                    for (int var55 = 0; var55 < 32768; var55++) {
                        field722[var55] = null;
                    }
                    field770 = -1;
                    field795.method4709();
                    field796.method4709();
                    for (int var56 = 0; var56 < 4; var56++) {
                        for (int var57 = 0; var57 < 104; var57++) {
                            for (int var58 = 0; var58 < 104; var58++) {
                                field793[var56][var57][var58] = null;
                            }
                        }
                    }
                    field694 = new class273();
                    Statics.field574.method1825();
                    for (int var59 = 0; var59 < Statics.field444; var59++) {
                        class252 var60 = class252.method3559(var59);
                        if (var60 != null) {
                            class222.field2555[var59] = 0;
                            class222.field2556[var59] = 0;
                        }
                    }
                    Statics.field99.method2127();
                    field835 = -1;
                    if (field827 != -1) {
                        int var61 = field827;
                        if (var61 != -1 && Statics.field2723[var61]) {
                            Statics.field3694.method4068(var61);
                            if (Statics.field3836[var61] != null) {
                                boolean var62 = true;
                                for (int var63 = 0; var63 < Statics.field3836[var61].length; var63++) {
                                    if (Statics.field3836[var61][var63] != null) {
                                        if (Statics.field3836[var61][var63].field2596 == 2) {
                                            var62 = false;
                                        } else {
                                            Statics.field3836[var61][var63] = null;
                                        }
                                    }
                                }
                                if (var62) {
                                    Statics.field3836[var61] = null;
                                }
                                Statics.field2723[var61] = false;
                            }
                        }
                    }
                    for (class71 var64 = (class71) field826.method5684(); var64 != null; var64 = (class71) field826.method5685()) {
                        method162(var64, true);
                    }
                    field827 = -1;
                    field826 = new class329(8);
                    field831 = null;
                    field736 = 0;
                    field752 = false;
                    field857.method3839((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var65 = 0; var65 < 8; var65++) {
                        field901[var65] = null;
                        field790[var65] = false;
                    }
                    class69.field557 = new class329(32);
                    field673 = true;
                    for (int var66 = 0; var66 < 100; var66++) {
                        field817[var66] = true;
                    }
                    class197 var67 = class197.method434(class193.field2291, field751.field1333);
                    var67.field2372.method5279(method3174());
                    var67.field2372.method5229(Statics.field88);
                    var67.field2372.method5229(Statics.field145);
                    field751.method2239(var67);
                    Statics.field295 = null;
                    for (int var68 = 0; var68 < 8; var68++) {
                        field930[var68] = new class19();
                    }
                    Statics.field187 = null;
                    class99.method3960(var2);
                    Statics.field25 = -1;
                    method2267(false, var2);
                    field751.field1326 = null;
                }
            }
        } catch (IOException var76) {
            if (field787 < 1) {
                if (Statics.field603 == Statics.field1313) {
                    Statics.field1313 = Statics.field2020;
                } else {
                    Statics.field1313 = Statics.field603;
                }
                field787++;
                field696 = 0;
            } else {
                method742(-2);
            }
        }
    }

    @ObfuscatedName("hk.fb(I)V")
    public static void method3953() {
        field751.method2228();
        field751.field1327.field3747 = 0;
        field751.field1326 = null;
        field751.field1332 = null;
        field751.field1334 = null;
        field751.field1335 = null;
        field751.field1329 = 0;
        field751.field1331 = 0;
        field681 = 0;
        field736 = 0;
        field752 = false;
        field888 = 0;
        field895 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field671[var0] = null;
        }
        Statics.field1986 = null;
        for (int var1 = 0; var1 < field722.length; var1++) {
            class89 var2 = field722[var1];
            if (var2 != null) {
                var2.field980 = -1;
                var2.field1010 = false;
            }
        }
        class69.field557 = new class329(32);
        method1104(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field817[var3] = true;
        }
        class197 var4 = class197.method434(class193.field2291, field751.field1333);
        var4.field2372.method5279(method3174());
        var4.field2372.method5229(Statics.field88);
        var4.field2372.method5229(Statics.field145);
        field751.method2239(var4);
    }

    @ObfuscatedName("bj.fs(II)V")
    public static void method742(int arg0) {
        if (arg0 == -3) {
            class95.method4156(class234.field2832, class234.field2949, class234.field2834);
        } else if (arg0 == -2) {
            class95.method4156(class234.field2902, class234.field2836, class234.field2889);
        } else if (arg0 == -1) {
            class95.method4156(class234.field2838, class234.field2839, class234.field2966);
        } else if (arg0 == 3) {
            class95.field1209 = 3;
            class95.field1208 = 1;
        } else if (arg0 == 4) {
            class95.method343(0);
        } else if (arg0 == 5) {
            class95.field1208 = 2;
            class95.method4156(class234.field2844, class234.field2845, class234.field2846);
        } else if (arg0 == 68 || !(field742 || arg0 != 6)) {
            class95.method4156(class234.field2847, class234.field2848, class234.field2849);
        } else if (arg0 == 7) {
            class95.method4156(class234.field2850, class234.field2851, class234.field2852);
        } else if (arg0 == 8) {
            class95.method4156(class234.field2960, class234.field2854, class234.field2855);
        } else if (arg0 == 9) {
            class95.method4156(class234.field2833, class234.field2857, class234.field2858);
        } else if (arg0 == 10) {
            class95.method4156(class234.field2859, class234.field2860, class234.field2861);
        } else if (arg0 == 11) {
            class95.method4156(class234.field2862, class234.field2863, class234.field3068);
        } else if (arg0 == 12) {
            class95.method4156(class234.field2865, class234.field2866, class234.field2867);
        } else if (arg0 == 13) {
            class95.method4156(class234.field2868, class234.field2869, class234.field2870);
        } else if (arg0 == 14) {
            class95.method4156(class234.field2875, class234.field2872, class234.field2873);
        } else if (arg0 == 16) {
            class95.method4156(class234.field2874, class234.field2968, class234.field2876);
        } else if (arg0 == 17) {
            class95.method4156(class234.field3004, class234.field2818, class234.field2879);
        } else if (arg0 == 18) {
            class95.method343(1);
        } else if (arg0 == 19) {
            class95.method4156(class234.field2883, class234.field2884, class234.field2885);
        } else if (arg0 == 20) {
            class95.method4156(class234.field2886, class234.field2887, class234.field3046);
        } else if (arg0 == 22) {
            class95.method4156(class234.field2963, class234.field2923, class234.field2888);
        } else if (arg0 == 23) {
            class95.method4156(class234.field2892, class234.field2893, class234.field3039);
        } else if (arg0 == 24) {
            class95.method4156(class234.field2895, class234.field3043, class234.field2897);
        } else if (arg0 == 25) {
            class95.method4156(class234.field2898, class234.field2946, class234.field2974);
        } else if (arg0 == 26) {
            class95.method4156(class234.field2901, class234.field2791, class234.field2903);
        } else if (arg0 == 27) {
            class95.method4156(class234.field2953, class234.field2905, class234.field2906);
        } else if (arg0 == 31) {
            class95.method4156(class234.field3013, class234.field2878, class234.field2924);
        } else if (arg0 == 32) {
            class95.method4156(class234.field2826, class234.field2917, class234.field2918);
        } else if (arg0 == 37) {
            class95.method4156(class234.field3008, class234.field2920, class234.field3079);
        } else if (arg0 == 38) {
            class95.method4156(class234.field3063, class234.field3010, class234.field3047);
        } else if (arg0 == 55) {
            class95.field1209 = 8;
        } else if (arg0 == 56) {
            class95.method4156(class234.field2820, class234.field2930, class234.field2931);
            method1104(11);
            return;
        } else if (arg0 == 57) {
            class95.method4156(class234.field2932, class234.field2933, class234.field3061);
            method1104(11);
            return;
        } else if (arg0 == 61) {
            class95.field1209 = 7;
        } else {
            class95.method4156(class234.field2935, class234.field3070, class234.field2937);
        }
        method1104(10);
    }

    @ObfuscatedName("bg.fq(B)V")
    public static final void method1093() {
        field751.method2241();
        class269.method3946();
        class256.field3293.method3218();
        class257.field3300.method3218();
        class265.field3383.method3218();
        class265.field3424.method3218();
        class265.field3413.method3218();
        class265.field3386.method3218();
        class268.field3508.method3218();
        class268.field3501.method3218();
        class266.field3437.method3218();
        class266.field3485.method3218();
        class266.field3467.method3218();
        class270.field3552.method3218();
        class270.field3551.method3218();
        class255.method733();
        class260.field3326.method3218();
        class252.method1762();
        class264.method775();
        class258.method2792();
        class262.field3340.method3218();
        class261.field3333.method3218();
        class253.method2698();
        class224.field2571.method3218();
        class227.method732();
        ((class129) Statics.field1777).method2671();
        class102.field1299.method3218();
        Statics.field401.method4070();
        Statics.field2549.method4070();
        Statics.field2573.method4070();
        Statics.field333.method4070();
        Statics.field48.method4070();
        Statics.field1954.method4070();
        Statics.field135.method4070();
        Statics.field2419.method4070();
        Statics.field1761.method4070();
        Statics.field1062.method4070();
        Statics.field354.method4070();
        Statics.field183.method4070();
        Statics.field2034.method3003();
        for (int var0 = 0; var0 < 4; var0++) {
            field772[var0].method3440();
        }
        System.gc();
        class207.field2436 = 1;
        Statics.field2438 = null;
        Statics.field2434 = -1;
        Statics.field1454 = -1;
        Statics.field436 = 0;
        Statics.field2439 = false;
        Statics.field43 = 2;
        field807 = -1;
        field900 = false;
        for (class85 var1 = (class85) class85.field1101.method4721(); var1 != null; var1 = (class85) class85.field1101.method4706()) {
            if (var1.field1105 != null) {
                Statics.field3325.method2284(var1.field1105);
                var1.field1105 = null;
            }
            if (var1.field1100 != null) {
                Statics.field3325.method2284(var1.field1100);
                var1.field1100 = null;
            }
        }
        class85.field1101.method4709();
        method1104(10);
    }

    @ObfuscatedName("ak.fn(II)V")
    public static final void method335(int arg0) {
        method1093();
        switch(arg0) {
            case 1:
                class95.field1209 = 24;
                class95.method4156(class234.field3026, class234.field3027, class234.field3028);
                break;
            case 2:
                class95.field1209 = 24;
                class95.method4156(class234.field3050, class234.field3016, class234.field2793);
        }
    }

    @ObfuscatedName("q.fc(I)V")
    public static final void method71() {
        if (field712 > 0) {
            method1093();
        } else {
            field693.method4806();
            method1104(40);
            Statics.field2009 = field751.method2240();
            field751.method2250();
        }
    }

    @ObfuscatedName("r.fg(ZI)V")
    public static final void method211(boolean arg0) {
        if (arg0) {
            field662 = class95.field1218 ? class170.field2012 : class170.field2019;
            return;
        }
        LinkedHashMap var1 = Statics.field191.field1070;
        String var2 = class95.field1226;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field662 = var1.containsKey(var4) ? class170.field2014 : class170.field2013;
    }

    @ObfuscatedName("client.fv(I)V")
    public final void method1446() {
        if (field681 > 1) {
            field681--;
        }
        if (field712 > 0) {
            field712--;
        }
        if (field713) {
            field713 = false;
            method71();
            return;
        }
        if (!field752) {
            method1223();
        }
        for (int var1 = 0; var1 < 100 && this.method1543(field751); var1++) {
        }
        if (field670 != 30) {
            return;
        }
        while (class106.method1228()) {
            class197 var2 = class197.method434(class193.field2316, field751.field1333);
            var2.field2372.method5279(0);
            int var3 = var2.field2372.field3747;
            class106.method320(var2.field2372);
            var2.field2372.method5343(var2.field2372.field3747 - var3);
            field751.method2239(var2);
        }
        if (field693.field3617) {
            class197 var4 = class197.method434(class193.field2302, field751.field1333);
            var4.field2372.method5279(0);
            int var5 = var4.field2372.field3747;
            field693.method4801(var4.field2372);
            var4.field2372.method5343(var4.field2372.field3747 - var5);
            field751.method2239(var4);
            field693.method4799();
        }
        Object var6 = Statics.field3663.field601;
        synchronized (Statics.field3663.field601) {
            if (!field864) {
                Statics.field3663.field605 = 0;
            } else if (class64.field509 != 0 || Statics.field3663.field605 >= 40) {
                class197 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field3663.field605 && (var7 == null || var7.field2372.field3747 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field3663.field606[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field3663.field602[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field676 != var14 || field688 != var13) {
                        if (var7 == null) {
                            var7 = class197.method434(class193.field2241, field751.field1333);
                            var7.field2372.method5279(0);
                            var8 = var7.field2372.field3747;
                            var7.field2372.field3747 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field854 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field676;
                            var16 = var13 - field688;
                            var17 = (int) ((Statics.field3663.field604[var12] - field854) / 20L);
                            var10 = (int) ((Statics.field3663.field604[var12] - field854) % 20L + (long) var10);
                        }
                        field676 = var14;
                        field688 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2372.method5229((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2372.method5279(var17 + 128);
                            var7.field2372.method5229((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2372.method5279(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2372.method5231(Integer.MIN_VALUE);
                            } else {
                                var7.field2372.method5231(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2372.method5229((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2372.method5231(Integer.MIN_VALUE);
                            } else {
                                var7.field2372.method5231(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field854 = Statics.field3663.field604[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2372.method5343(var7.field2372.field3747 - var8);
                    int var18 = var7.field2372.field3747;
                    var7.field2372.field3747 = var8;
                    var7.field2372.method5279(var10 / var11);
                    var7.field2372.method5279(var10 % var11);
                    var7.field2372.field3747 = var18;
                    field751.method2239(var7);
                }
                if (var9 >= Statics.field3663.field605) {
                    Statics.field3663.field605 = 0;
                } else {
                    Statics.field3663.field605 -= var9;
                    System.arraycopy(Statics.field3663.field602, var9, Statics.field3663.field602, 0, Statics.field3663.field605);
                    System.arraycopy(Statics.field3663.field606, var9, Statics.field3663.field606, 0, Statics.field3663.field605);
                    System.arraycopy(Statics.field3663.field604, var9, Statics.field3663.field604, 0, Statics.field3663.field605);
                }
            }
        }
        if (class64.field509 == 1 || !Statics.field47 && class64.field509 == 4 || class64.field509 == 2) {
            long var20 = class64.field504 - field806 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field806 = class64.field504 * -1L;
            int var22 = class64.field511;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field145) {
                var22 = Statics.field145;
            }
            int var23 = class64.field510;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field88) {
                var23 = Statics.field88;
            }
            int var24 = (int) var20;
            class197 var25 = class197.method434(class193.field2277, field751.field1333);
            var25.field2372.method5229((var24 << 1) + (class64.field509 == 2 ? 1 : 0));
            var25.field2372.method5229(var23);
            var25.field2372.method5229(var22);
            field751.method2239(var25);
        }
        if (class55.field422 > 0) {
            class197 var26 = class197.method434(class193.field2300, field751.field1333);
            var26.field2372.method5229(0);
            int var27 = var26.field2372.field3747;
            long var28 = class308.method1082();
            for (int var30 = 0; var30 < class55.field422; var30++) {
                long var31 = var28 - field889;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field889 = var28;
                var26.field2372.method5288((int) var31);
                var26.field2372.method5439(class55.field421[var30]);
            }
            var26.field2372.method5241(var26.field2372.field3747 - var27);
            field751.method2239(var26);
        }
        if (field927 > 0) {
            field927--;
        }
        if (class55.field416[96] || class55.field416[97] || class55.field416[98] || class55.field416[99]) {
            field679 = true;
        }
        if (field679 && field927 <= 0) {
            field927 = 20;
            field679 = false;
            class197 var33 = class197.method434(class193.field2335, field751.field1333);
            var33.field2372.method5411(field735);
            var33.field2372.method5246(field734);
            field751.method2239(var33);
        }
        if (Statics.field1441 && !field687) {
            field687 = true;
            class197 var34 = class197.method434(class193.field2235, field751.field1333);
            var34.field2372.method5279(1);
            field751.method2239(var34);
        }
        if (!Statics.field1441 && field687) {
            field687 = false;
            class197 var35 = class197.method434(class193.field2235, field751.field1333);
            var35.field2372.method5279(0);
            field751.method2239(var35);
        }
        if (Statics.field1453 != null) {
            Statics.field1453.method6083();
        }
        if (Statics.field431) {
            if (Statics.field295 != null) {
                Statics.field295.method4922();
            }
            for (int var36 = 0; var36 < class99.field1271; var36++) {
                class76 var37 = field671[class99.field1272[var36]];
                var37.method1181();
            }
            Statics.field431 = false;
        }
        method3173();
        if (field670 != 30) {
            return;
        }
        method291();
        method439();
        field751.field1331++;
        if (field751.field1331 > 750) {
            method71();
            return;
        }
        method323();
        for (int var38 = 0; var38 < field707; var38++) {
            int var39 = field708[var38];
            class89 var40 = field722[var39];
            if (var40 != null) {
                method3355(var40, var40.field1150.field3504);
            }
        }
        method1706();
        field809++;
        if (field769 != 0) {
            field669 += 20;
            if (field669 >= 400) {
                field769 = 0;
            }
        }
        if (Statics.field261 != null) {
            field771++;
            if (field771 >= 15) {
                method5979(Statics.field261);
                Statics.field261 = null;
            }
        }
        class227 var41 = Statics.field438;
        class227 var42 = Statics.field101;
        Statics.field438 = null;
        Statics.field101 = null;
        field842 = null;
        field755 = false;
        field913 = false;
        field886 = 0;
        while (class55.method2169() && field886 < 128) {
            if (field754 >= 2 && class55.field416[82] && Statics.field2418 == 66) {
                String var43 = "";
                Iterator var44 = class101.field1291.iterator();
                while (var44.hasNext()) {
                    class74 var45 = (class74) var44.next();
                    var43 = var43 + var45.field611 + ':' + var45.field618 + '\n';
                }
                Statics.field7.method857(var43);
            } else if (field740 != 1 || Statics.field300 <= 0) {
                field739[field886] = Statics.field2418;
                field887[field886] = Statics.field300;
                field886++;
            }
        }
        if (method4955() && class55.field416[82] && class55.field416[81] && field863 != 0) {
            int var48 = Statics.field1986.field650 - field863;
            if (var48 < 0) {
                var48 = 0;
            } else if (var48 > 3) {
                var48 = 3;
            }
            if (Statics.field1986.field650 != var48) {
                int var49 = Statics.field109 + Statics.field1986.field1009[0];
                int var50 = Statics.field3212 + Statics.field1986.field986[0];
                class197 var51 = class197.method434(class193.field2231, field751.field1333);
                var51.field2372.method5411(var50);
                var51.field2372.method5439(var48);
                var51.field2372.method5292(0);
                var51.field2372.method5246(var49);
                field751.method2239(var51);
            }
            field863 = 0;
        }
        if (field827 != -1) {
            method205(field827, 0, 0, Statics.field88, Statics.field145, 0, 0);
        }
        field850++;
        while (true) {
            class72 var52;
            class227 var53;
            class227 var54;
            do {
                var52 = (class72) field661.method4702();
                if (var52 == null) {
                    while (true) {
                        class72 var55;
                        class227 var56;
                        class227 var57;
                        do {
                            var55 = (class72) field866.method4702();
                            if (var55 == null) {
                                while (true) {
                                    class72 var58;
                                    class227 var59;
                                    class227 var60;
                                    do {
                                        var58 = (class72) field810.method4702();
                                        if (var58 == null) {
                                            this.method1256();
                                            method18();
                                            if (field838 != null) {
                                                this.method1261();
                                            }
                                            if (Statics.field2060 != null) {
                                                method5979(Statics.field2060);
                                                field839++;
                                                if (class64.field501 == 0) {
                                                    if (field777) {
                                                        if (Statics.field3490 == Statics.field2060 && field920 != field741) {
                                                            class227 var61 = Statics.field2060;
                                                            byte var62 = 0;
                                                            if (field830 == 1 && var61.field2727 == 206) {
                                                                var62 = 1;
                                                            }
                                                            if (var61.field2631[field741] <= 0) {
                                                                var62 = 0;
                                                            }
                                                            if (class228.method3546(method836(var61))) {
                                                                int var63 = field920;
                                                                int var64 = field741;
                                                                var61.field2631[var64] = var61.field2631[var63];
                                                                var61.field2674[var64] = var61.field2674[var63];
                                                                var61.field2631[var63] = -1;
                                                                var61.field2674[var63] = 0;
                                                            } else if (var62 == 1) {
                                                                int var65 = field920;
                                                                int var66 = field741;
                                                                while (var65 != var66) {
                                                                    if (var65 > var66) {
                                                                        var61.method3892(var65 - 1, var65);
                                                                        var65--;
                                                                    } else if (var65 < var66) {
                                                                        var61.method3892(var65 + 1, var65);
                                                                        var65++;
                                                                    }
                                                                }
                                                            } else {
                                                                var61.method3892(field741, field920);
                                                            }
                                                            class197 var67 = class197.method434(class193.field2244, field751.field1333);
                                                            var67.field2372.method5281(field920);
                                                            var67.field2372.method5432(Statics.field2060.field2594);
                                                            var67.field2372.method5411(field741);
                                                            var67.field2372.method5279(var62);
                                                            field751.method2239(var67);
                                                        }
                                                    } else if (this.method1257()) {
                                                        this.method1560(field774, field775);
                                                    } else if (field736 > 0) {
                                                        method3497(field774, field775);
                                                    }
                                                    field771 = 10;
                                                    class64.field509 = 0;
                                                    Statics.field2060 = null;
                                                } else if (field839 >= 5 && (class64.field502 > field774 + 5 || class64.field502 < field774 - 5 || class64.field503 > field775 + 5 || class64.field503 < field775 - 5)) {
                                                    field777 = true;
                                                }
                                            }
                                            if (class143.method3033()) {
                                                int var68 = class143.field1825;
                                                int var69 = class143.field1832;
                                                class197 var70 = class197.method434(class193.field2264, field751.field1333);
                                                var70.field2372.method5279(5);
                                                var70.field2372.method5334(class55.field416[82] ? (class55.field416[81] ? 2 : 1) : 0);
                                                var70.field2372.method5246(Statics.field3212 + var69);
                                                var70.field2372.method5229(Statics.field109 + var68);
                                                field751.method2239(var70);
                                                class143.method3041();
                                                field766 = class64.field510;
                                                field855 = class64.field511;
                                                field769 = 1;
                                                field669 = 0;
                                                field895 = var68;
                                                field789 = var69;
                                            }
                                            if (Statics.field438 != var41) {
                                                if (var41 != null) {
                                                    method5979(var41);
                                                }
                                                if (Statics.field438 != null) {
                                                    method5979(Statics.field438);
                                                }
                                            }
                                            if (Statics.field101 != var42 && field926 == field816) {
                                                if (var42 != null) {
                                                    method5979(var42);
                                                }
                                                if (Statics.field101 != null) {
                                                    method5979(Statics.field101);
                                                }
                                            }
                                            if (Statics.field101 == null) {
                                                if (field816 > 0) {
                                                    field816--;
                                                }
                                            } else if (field816 < field926) {
                                                field816++;
                                                if (field926 == field816) {
                                                    method5979(Statics.field101);
                                                }
                                            }
                                            if (field740 == 0) {
                                                int var71 = Statics.field1986.field957;
                                                int var72 = Statics.field1986.field954;
                                                if (Statics.field1021 - var71 < -500 || Statics.field1021 - var71 > 500 || Statics.field625 - var72 < -500 || Statics.field625 - var72 > 500) {
                                                    Statics.field1021 = var71;
                                                    Statics.field625 = var72;
                                                }
                                                if (Statics.field1021 != var71) {
                                                    Statics.field1021 += (var71 - Statics.field1021) / 16;
                                                }
                                                if (Statics.field625 != var72) {
                                                    Statics.field625 += (var72 - Statics.field625) / 16;
                                                }
                                                int var73 = Statics.field1021 >> 7;
                                                int var74 = Statics.field625 >> 7;
                                                int var75 = method576(Statics.field1021, Statics.field625, Statics.field1162);
                                                int var76 = 0;
                                                if (var73 > 3 && var74 > 3 && var73 < 100 && var74 < 100) {
                                                    for (int var77 = var73 - 4; var77 <= var73 + 4; var77++) {
                                                        for (int var78 = var74 - 4; var78 <= var74 + 4; var78++) {
                                                            int var79 = Statics.field1162;
                                                            if (var79 < 3 && (class65.field516[1][var77][var78] & 0x2) == 2) {
                                                                var79++;
                                                            }
                                                            int var80 = var75 - class65.field525[var79][var77][var78];
                                                            if (var80 > var76) {
                                                                var76 = var80;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var81 = var76 * 192;
                                                if (var81 > 98048) {
                                                    var81 = 98048;
                                                }
                                                if (var81 < 32768) {
                                                    var81 = 32768;
                                                }
                                                if (var81 > field881) {
                                                    field881 += (var81 - field881) / 24;
                                                } else if (var81 < field881) {
                                                    field881 += (var81 - field881) / 80;
                                                }
                                                Statics.field1883 = method576(Statics.field1986.field957, Statics.field1986.field954, Statics.field1162) - field896;
                                            } else if (field740 == 1) {
                                                method99();
                                                short var82 = -1;
                                                if (class55.field416[33]) {
                                                    var82 = 0;
                                                } else if (class55.field416[49]) {
                                                    var82 = 1024;
                                                }
                                                if (class55.field416[48]) {
                                                    if (var82 == 0) {
                                                        var82 = 1792;
                                                    } else if (var82 == 1024) {
                                                        var82 = 1280;
                                                    } else {
                                                        var82 = 1536;
                                                    }
                                                } else if (class55.field416[50]) {
                                                    if (var82 == 0) {
                                                        var82 = 256;
                                                    } else if (var82 == 1024) {
                                                        var82 = 768;
                                                    } else {
                                                        var82 = 512;
                                                    }
                                                }
                                                byte var83 = 0;
                                                if (class55.field416[35]) {
                                                    var83 = -1;
                                                } else if (class55.field416[51]) {
                                                    var83 = 1;
                                                }
                                                int var84 = 0;
                                                if (var82 >= 0 || var83 != 0) {
                                                    int var85 = class55.field416[81] ? field746 : field745;
                                                    var84 = var85 * 16;
                                                    field743 = var82;
                                                    field744 = var83;
                                                }
                                                if (field819 < var84) {
                                                    field819 += var84 / 8;
                                                    if (field819 > var84) {
                                                        field819 = var84;
                                                    }
                                                } else if (field819 > var84) {
                                                    field819 = field819 * 9 / 10;
                                                }
                                                if (field819 > 0) {
                                                    int var86 = field819 / 16;
                                                    if (field743 >= 0) {
                                                        int var87 = field743 - Statics.field287 & 0x7FF;
                                                        int var88 = class140.field1800[var87];
                                                        int var89 = class140.field1801[var87];
                                                        Statics.field1021 += var86 * var88 / 65536;
                                                        Statics.field625 += var86 * var89 / 65536;
                                                    }
                                                    if (field744 != 0) {
                                                        Statics.field1883 += field744 * var86;
                                                        if (Statics.field1883 > 0) {
                                                            Statics.field1883 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field743 = -1;
                                                    field744 = -1;
                                                }
                                                if (class55.field416[13]) {
                                                    field751.method2239(class197.method434(class193.field2297, field751.field1333));
                                                    field740 = 0;
                                                }
                                            }
                                            if (class64.field501 == 4 && Statics.field47) {
                                                int var90 = class64.field503 - field797;
                                                field737 = var90 * 2;
                                                field797 = var90 == -1 || var90 == 1 ? class64.field503 : (field797 + class64.field503) / 2;
                                                int var91 = field938 - class64.field502;
                                                field689 = var91 * 2;
                                                field938 = var91 == -1 || var91 == 1 ? class64.field502 : (field938 + class64.field502) / 2;
                                            } else {
                                                if (class55.field416[96]) {
                                                    field689 += (-24 - field689) / 2;
                                                } else if (class55.field416[97]) {
                                                    field689 += (24 - field689) / 2;
                                                } else {
                                                    field689 /= 2;
                                                }
                                                if (class55.field416[98]) {
                                                    field737 += (12 - field737) / 2;
                                                } else if (class55.field416[99]) {
                                                    field737 += (-12 - field737) / 2;
                                                } else {
                                                    field737 /= 2;
                                                }
                                                field797 = class64.field503;
                                                field938 = class64.field502;
                                            }
                                            field735 = field689 / 2 + field735 & 0x7FF;
                                            field734 += field737 / 2;
                                            if (field734 < 128) {
                                                field734 = 128;
                                            }
                                            if (field734 > 383) {
                                                field734 = 383;
                                            }
                                            if (field907) {
                                                int var92 = Statics.field346 * 128 + 64;
                                                int var93 = Statics.field1476 * 128 + 64;
                                                int var94 = method576(var92, var93, Statics.field1162) - Statics.field2080;
                                                if (Statics.field1261 < var92) {
                                                    Statics.field1261 += Statics.field2741 * (var92 - Statics.field1261) / 1000 + Statics.field2057;
                                                    if (Statics.field1261 > var92) {
                                                        Statics.field1261 = var92;
                                                    }
                                                }
                                                if (Statics.field1261 > var92) {
                                                    Statics.field1261 -= Statics.field2741 * (Statics.field1261 - var92) / 1000 + Statics.field2057;
                                                    if (Statics.field1261 < var92) {
                                                        Statics.field1261 = var92;
                                                    }
                                                }
                                                if (Statics.field555 < var94) {
                                                    Statics.field555 += Statics.field2741 * (var94 - Statics.field555) / 1000 + Statics.field2057;
                                                    if (Statics.field555 > var94) {
                                                        Statics.field555 = var94;
                                                    }
                                                }
                                                if (Statics.field555 > var94) {
                                                    Statics.field555 -= Statics.field2741 * (Statics.field555 - var94) / 1000 + Statics.field2057;
                                                    if (Statics.field555 < var94) {
                                                        Statics.field555 = var94;
                                                    }
                                                }
                                                if (Statics.field1102 < var93) {
                                                    Statics.field1102 += Statics.field2741 * (var93 - Statics.field1102) / 1000 + Statics.field2057;
                                                    if (Statics.field1102 > var93) {
                                                        Statics.field1102 = var93;
                                                    }
                                                }
                                                if (Statics.field1102 > var93) {
                                                    Statics.field1102 -= Statics.field2741 * (Statics.field1102 - var93) / 1000 + Statics.field2057;
                                                    if (Statics.field1102 < var93) {
                                                        Statics.field1102 = var93;
                                                    }
                                                }
                                                int var95 = Statics.field139 * 128 + 64;
                                                int var96 = Statics.field103 * 128 + 64;
                                                int var97 = method576(var95, var96, Statics.field1162) - Statics.field1810;
                                                int var98 = var95 - Statics.field1261;
                                                int var99 = var97 - Statics.field555;
                                                int var100 = var96 - Statics.field1102;
                                                int var101 = (int) Math.sqrt((double) (var98 * var98 + var100 * var100));
                                                int var102 = (int) (Math.atan2((double) var99, (double) var101) * 325.949D) & 0x7FF;
                                                int var103 = (int) (Math.atan2((double) var98, (double) var100) * -325.949D) & 0x7FF;
                                                if (var102 < 128) {
                                                    var102 = 128;
                                                }
                                                if (var102 > 383) {
                                                    var102 = 383;
                                                }
                                                if (Statics.field428 < var102) {
                                                    Statics.field428 += Statics.field2071 * (var102 - Statics.field428) / 1000 + Statics.field381;
                                                    if (Statics.field428 > var102) {
                                                        Statics.field428 = var102;
                                                    }
                                                }
                                                if (Statics.field428 > var102) {
                                                    Statics.field428 -= Statics.field2071 * (Statics.field428 - var102) / 1000 + Statics.field381;
                                                    if (Statics.field428 < var102) {
                                                        Statics.field428 = var102;
                                                    }
                                                }
                                                int var104 = var103 - Statics.field287;
                                                if (var104 > 1024) {
                                                    var104 -= 2048;
                                                }
                                                if (var104 < -1024) {
                                                    var104 += 2048;
                                                }
                                                if (var104 > 0) {
                                                    Statics.field287 += Statics.field2071 * var104 / 1000 + Statics.field381;
                                                    Statics.field287 &= 0x7FF;
                                                }
                                                if (var104 < 0) {
                                                    Statics.field287 -= Statics.field2071 * -var104 / 1000 + Statics.field381;
                                                    Statics.field287 &= 0x7FF;
                                                }
                                                int var105 = var103 - Statics.field287;
                                                if (var105 > 1024) {
                                                    var105 -= 2048;
                                                }
                                                if (var105 < -1024) {
                                                    var105 += 2048;
                                                }
                                                if (var105 < 0 && var104 > 0 || var105 > 0 && var104 < 0) {
                                                    Statics.field287 = var103;
                                                }
                                            }
                                            for (int var106 = 0; var106 < 5; var106++) {
                                                int var10002 = field912[var106]++;
                                            }
                                            Statics.field99.method2155();
                                            int var107 = ++class64.field496 - 1;
                                            int var109 = class55.field426;
                                            if (var107 > 15000 && var109 > 15000) {
                                                field712 = 250;
                                                class64.field496 = 14500;
                                                class197 var111 = class197.method434(class193.field2299, field751.field1333);
                                                field751.method2239(var111);
                                            }
                                            Statics.field574.method1815();
                                            field751.field1324++;
                                            if (field751.field1324 > 50) {
                                                class197 var112 = class197.method434(class193.field2306, field751.field1333);
                                                field751.method2239(var112);
                                            }
                                            try {
                                                field751.method2229();
                                            } catch (IOException var114) {
                                                method71();
                                            }
                                            return;
                                        }
                                        var59 = var58.field587;
                                        if (var59.field2595 < 0) {
                                            break;
                                        }
                                        var60 = class227.method3963(var59.field2613);
                                    } while (var60 == null || var60.field2584 == null || var59.field2595 >= var60.field2584.length || var60.field2584[var59.field2595] != var59);
                                    class86.method2227(var58);
                                }
                            }
                            var56 = var55.field587;
                            if (var56.field2595 < 0) {
                                break;
                            }
                            var57 = class227.method3963(var56.field2613);
                        } while (var57 == null || var57.field2584 == null || var56.field2595 >= var57.field2584.length || var57.field2584[var56.field2595] != var56);
                        class86.method2227(var55);
                    }
                }
                var53 = var52.field587;
                if (var53.field2595 < 0) {
                    break;
                }
                var54 = class227.method3963(var53.field2613);
            } while (var54 == null || var54.field2584 == null || var53.field2595 >= var54.field2584.length || var54.field2584[var53.field2595] != var53);
            class86.method2227(var52);
        }
    }

    @ObfuscatedName("fg.fy(I)V")
    public static final void method3319() {
        if (Statics.field2772 != null) {
            Statics.field2772.method2431();
        }
        if (Statics.field2379 != null) {
            Statics.field2379.method2431();
        }
    }

    @ObfuscatedName("aa.fk(S)V")
    public static final void method439() {
        for (int var0 = 0; var0 < field878; var0++) {
            int var10002 = field837[var0]--;
            if (field837[var0] >= -10) {
                class111 var2 = field906[var0];
                if (var2 == null) {
                    class111 var10000 = (class111) null;
                    var2 = class111.method2351(Statics.field333, field902[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field837[var0] += var2.method2346();
                    field906[var0] = var2;
                }
                if (field837[var0] < 0) {
                    int var9;
                    if (field905[var0] == 0) {
                        var9 = Statics.field191.field1066;
                    } else {
                        int var3 = (field905[var0] & 0xFF) * 128;
                        int var4 = field905[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1986.field957;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field905[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1986.field954;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field837[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = Statics.field191.field1071 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class113 var10 = var2.method2343().method2397(Statics.field1041);
                        class123 var11 = class123.method2508(var10, 100, var9);
                        var11.method2572(field903[var0] - 1);
                        Statics.field3325.method2304(var11);
                    }
                    field837[var0] = -100;
                }
            } else {
                field878--;
                for (int var1 = var0; var1 < field878; var1++) {
                    field902[var1] = field902[var1 + 1];
                    field906[var1] = field906[var1 + 1];
                    field903[var1] = field903[var1 + 1];
                    field837[var1] = field837[var1 + 1];
                    field905[var1] = field905[var1 + 1];
                }
                var0--;
            }
        }
        if (field900 && !class207.method42()) {
            if (Statics.field191.field1074 != 0 && field807 != -1) {
                class207.method2270(Statics.field1954, field807, 0, Statics.field191.field1074, false);
            }
            field900 = false;
        }
    }

    @ObfuscatedName("fw.fw(Ljs;IIII)V")
    public static void method3352(class270 arg0, int arg1, int arg2, int arg3) {
        if (field878 >= 50 || Statics.field191.field1071 == 0 || arg0.field3557 == null || arg1 >= arg0.field3557.length) {
            return;
        }
        int var4 = arg0.field3557[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field902[field878] = var5;
        field903[field878] = var6;
        field837[field878] = 0;
        field906[field878] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field905[field878] = (var8 << 16) + (var9 << 8) + var7;
        field878++;
    }

    @ObfuscatedName("bx.ff(IIII)V")
    public static void method798(int arg0, int arg1, int arg2) {
        if (Statics.field191.field1066 == 0 || arg1 == 0 || field878 >= 50) {
            return;
        }
        field902[field878] = arg0;
        field903[field878] = arg1;
        field837[field878] = arg2;
        field906[field878] = null;
        field905[field878] = 0;
        field878++;
    }

    @ObfuscatedName("ls.fd(IB)V")
    public static void method5567(int arg0) {
        if (arg0 == -1 && !field900) {
            class207.method1134();
        } else if (arg0 != -1 && field807 != arg0 && Statics.field191.field1074 != 0 && !field900) {
            class207.method1238(2, Statics.field1954, arg0, 0, Statics.field191.field1074, false);
        }
        field807 = arg0;
    }

    @ObfuscatedName("ca.fx(IIB)V")
    public static void method2011(int arg0, int arg1) {
        if (Statics.field191.field1074 != 0 && arg0 != -1) {
            class207.method2270(Statics.field354, arg0, 0, Statics.field191.field1074, false);
            field900 = true;
        }
    }

    @ObfuscatedName("em.fz(B)V")
    public static final void method3173() {
        if (Statics.field1162 != field890) {
            field890 = Statics.field1162;
            Statics.method3867(Statics.field1162);
        }
    }

    @ObfuscatedName("bg.fl(Lhz;III)V")
    public static final void method1096(class227 arg0, int arg1, int arg2) {
        if (field888 != 0 && field888 != 3 || field752 || !(class64.field509 == 1 || !Statics.field47 && class64.field509 == 4)) {
            return;
        }
        class221 var3 = arg0.method3891(true);
        if (var3 == null) {
            return;
        }
        int var4 = class64.field510 - arg1;
        int var5 = class64.field511 - arg2;
        if (!var3.method3812(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2546 / 2;
        int var7 = var5 - var3.field2547 / 2;
        int var8 = field735 & 0x7FF;
        int var9 = class140.field1800[var8];
        int var10 = class140.field1801[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1986.field957 + var11 >> 7;
        int var14 = Statics.field1986.field954 - var12 >> 7;
        class197 var15 = class197.method434(class193.field2261, field751.field1333);
        var15.field2372.method5279(18);
        var15.field2372.method5334(class55.field416[82] ? (class55.field416[81] ? 2 : 1) : 0);
        var15.field2372.method5246(Statics.field3212 + var14);
        var15.field2372.method5229(Statics.field109 + var13);
        var15.field2372.method5279(var6);
        var15.field2372.method5279(var7);
        var15.field2372.method5229(field735);
        var15.field2372.method5279(57);
        var15.field2372.method5279(0);
        var15.field2372.method5279(0);
        var15.field2372.method5279(89);
        var15.field2372.method5229(Statics.field1986.field957);
        var15.field2372.method5229(Statics.field1986.field954);
        var15.field2372.method5279(63);
        field751.method2239(var15);
        field895 = var13;
        field789 = var14;
    }

    @ObfuscatedName("cv.fu(I)V")
    public static final void method1706() {
        int[] var0 = class99.field1272;
        for (int var1 = 0; var1 < class99.field1271; var1++) {
            class76 var2 = field671[var0[var1]];
            if (var2 != null && var2.field970 > 0) {
                var2.field970--;
                if (var2.field970 == 0) {
                    var2.field967 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field707; var3++) {
            int var4 = field708[var3];
            class89 var5 = field722[var4];
            if (var5 != null && var5.field970 > 0) {
                var5.field970--;
                if (var5.field970 == 0) {
                    var5.field967 = null;
                }
            }
        }
    }

    @ObfuscatedName("ag.fp(Ljava/lang/String;B)V")
    public static final void method289(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field191.field1068 = !Statics.field191.field1068;
            class83.method213();
            if (Statics.field191.field1068) {
                class101.method314(99, "", "Roofs are now all hidden");
            } else {
                class101.method314(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field680 = !field680;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field784 = !field784;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field813 = !field813;
        }
        if (field754 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1453.field4040 = !Statics.field1453.field4040;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field680 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field680 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method71();
            }
        }
        class197 var1 = class197.method434(class193.field2262, field751.field1333);
        var1.field2372.method5279(arg0.length() + 1);
        var1.field2372.method5257(arg0);
        field751.method2239(var1);
    }

    @ObfuscatedName("aq.fo(I)V")
    public static final void method323() {
        int var0 = class99.field1271;
        int[] var1 = class99.field1272;
        for (int var2 = 0; var2 < var0; var2++) {
            class76 var3 = field671[var1[var2]];
            if (var3 != null) {
                method3355(var3, 1);
            }
        }
    }

    @ObfuscatedName("fd.fj(Lcv;II)V")
    public static final void method3355(class79 arg0, int arg1) {
        if (arg0.field1000 >= field729) {
            method124(arg0);
        } else if (arg0.field1001 >= field729) {
            if (field729 == arg0.field1001 || arg0.field998 == -1 || arg0.field989 != 0 || arg0.field962 + 1 > Statics.method1124(arg0.field998).field3556[arg0.field996]) {
                int var2 = arg0.field1001 - arg0.field1000;
                int var3 = field729 - arg0.field1000;
                int var4 = arg0.field993 * 128 + arg0.field1008 * 64;
                int var5 = arg0.field953 * 128 + arg0.field1008 * 64;
                int var6 = arg0.field997 * 128 + arg0.field1008 * 64;
                int var7 = arg0.field999 * 128 + arg0.field1008 * 64;
                arg0.field957 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field954 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field990 = 0;
            arg0.field1005 = arg0.field1002;
            arg0.field955 = arg0.field1005;
        } else {
            arg0.field983 = arg0.field973;
            if (arg0.field964 == 0) {
                arg0.field990 = 0;
            } else {
                label225: {
                    if (arg0.field998 != -1 && arg0.field989 == 0) {
                        class270 var8 = Statics.method1124(arg0.field998);
                        if (arg0.field1013 > 0 && var8.field3565 == 0) {
                            arg0.field990++;
                            break label225;
                        }
                        if (arg0.field1013 <= 0 && var8.field3566 == 0) {
                            arg0.field990++;
                            break label225;
                        }
                    }
                    int var9 = arg0.field957;
                    int var10 = arg0.field954;
                    int var11 = arg0.field1009[arg0.field964 - 1] * 128 + arg0.field1008 * 64;
                    int var12 = arg0.field986[arg0.field964 - 1] * 128 + arg0.field1008 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field1005 = 1280;
                        } else if (var10 > var12) {
                            arg0.field1005 = 1792;
                        } else {
                            arg0.field1005 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field1005 = 768;
                        } else if (var10 > var12) {
                            arg0.field1005 = 256;
                        } else {
                            arg0.field1005 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field1005 = 1024;
                    } else if (var10 > var12) {
                        arg0.field1005 = 0;
                    }
                    byte var13 = arg0.field1011[arg0.field964 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field1005 - arg0.field955 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field963;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field981;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field1012;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field985;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field981;
                        }
                        arg0.field983 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class89) {
                            var17 = ((class89) arg0).field1150.field3532;
                        }
                        if (var17) {
                            if (arg0.field955 != arg0.field1005 && arg0.field980 == -1 && arg0.field1007 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field964 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field964 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field990 > 0 && arg0.field964 > 1) {
                                var16 = 8;
                                arg0.field990--;
                            }
                        } else {
                            if (arg0.field964 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field964 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field990 > 0 && arg0.field964 > 1) {
                                var16 = 8;
                                arg0.field990--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field983 == arg0.field981 && arg0.field966 != -1) {
                            arg0.field983 = arg0.field966;
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
                                arg0.field954 += var16;
                                if (arg0.field954 > var12) {
                                    arg0.field954 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field954 -= var16;
                                if (arg0.field954 < var12) {
                                    arg0.field954 = var12;
                                }
                            }
                        }
                        if (arg0.field957 == var11 && arg0.field954 == var12) {
                            arg0.field964--;
                            if (arg0.field1013 > 0) {
                                arg0.field1013--;
                            }
                        }
                    } else {
                        arg0.field957 = var11;
                        arg0.field954 = var12;
                        arg0.field964--;
                        if (arg0.field1013 > 0) {
                            arg0.field1013--;
                        }
                    }
                }
            }
        }
        if (arg0.field957 < 128 || arg0.field954 < 128 || arg0.field957 >= 13184 || arg0.field954 >= 13184) {
            arg0.field998 = -1;
            arg0.field988 = -1;
            arg0.field1000 = 0;
            arg0.field1001 = 0;
            arg0.field957 = arg0.field1009[0] * 128 + arg0.field1008 * 64;
            arg0.field954 = arg0.field986[0] * 128 + arg0.field1008 * 64;
            arg0.method1689();
        }
        if (Statics.field1986 == arg0 && (arg0.field957 < 1536 || arg0.field954 < 1536 || arg0.field957 >= 11776 || arg0.field954 >= 11776)) {
            arg0.field998 = -1;
            arg0.field988 = -1;
            arg0.field1000 = 0;
            arg0.field1001 = 0;
            arg0.field957 = arg0.field1009[0] * 128 + arg0.field1008 * 64;
            arg0.field954 = arg0.field986[0] * 128 + arg0.field1008 * 64;
            arg0.method1689();
        }
        method3191(arg0);
        method2108(arg0);
    }

    @ObfuscatedName("x.fm(Lcv;I)V")
    public static final void method124(class79 arg0) {
        int var1 = Math.max(1, arg0.field1000 - field729);
        int var2 = arg0.field993 * 128 + arg0.field1008 * 64;
        int var3 = arg0.field953 * 128 + arg0.field1008 * 64;
        arg0.field957 += (var2 - arg0.field957) / var1;
        arg0.field954 += (var3 - arg0.field954) / var1;
        arg0.field990 = 0;
        arg0.field1005 = arg0.field1002;
    }

    @ObfuscatedName("ej.fr(Lcv;I)V")
    public static final void method3191(class79 arg0) {
        if (arg0.field1007 == 0) {
            return;
        }
        if (arg0.field980 != -1) {
            class79 var1 = null;
            if (arg0.field980 < 32768) {
                var1 = field722[arg0.field980];
            } else if (arg0.field980 >= 32768) {
                var1 = field671[arg0.field980 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field957 - var1.field957;
                int var3 = arg0.field954 - var1.field954;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1005 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1010) {
                arg0.field980 = -1;
                arg0.field1010 = false;
            }
        }
        if (arg0.field982 != -1 && (arg0.field964 == 0 || arg0.field990 > 0)) {
            arg0.field1005 = arg0.field982;
            arg0.field982 = -1;
        }
        int var4 = arg0.field1005 - arg0.field955 & 0x7FF;
        if (var4 == 0 && arg0.field1010) {
            arg0.field980 = -1;
            arg0.field1010 = false;
        }
        if (var4 == 0) {
            arg0.field958 = 0;
            return;
        }
        arg0.field958++;
        if (var4 > 1024) {
            arg0.field955 -= arg0.field1007;
            boolean var5 = true;
            if (var4 < arg0.field1007 || var4 > 2048 - arg0.field1007) {
                arg0.field955 = arg0.field1005;
                var5 = false;
            }
            if (arg0.field983 == arg0.field973 && (arg0.field958 > 25 || var5)) {
                if (arg0.field1014 == -1) {
                    arg0.field983 = arg0.field981;
                } else {
                    arg0.field983 = arg0.field1014;
                }
            }
        } else {
            arg0.field955 += arg0.field1007;
            boolean var6 = true;
            if (var4 < arg0.field1007 || var4 > 2048 - arg0.field1007) {
                arg0.field955 = arg0.field1005;
                var6 = false;
            }
            if (arg0.field983 == arg0.field973 && (arg0.field958 > 25 || var6)) {
                if (arg0.field961 == -1) {
                    arg0.field983 = arg0.field981;
                } else {
                    arg0.field983 = arg0.field961;
                }
            }
        }
        arg0.field955 &= 0x7FF;
    }

    @ObfuscatedName("cx.fe(Lcv;I)V")
    public static final void method2108(class79 arg0) {
        arg0.field956 = false;
        if (arg0.field983 != -1) {
            class270 var1 = Statics.method1124(arg0.field983);
            if (var1 == null || var1.field3554 == null) {
                arg0.field983 = -1;
            } else {
                arg0.field960++;
                if (arg0.field984 < var1.field3554.length && arg0.field960 > var1.field3556[arg0.field984]) {
                    arg0.field960 = 1;
                    arg0.field984++;
                    method3352(var1, arg0.field984, arg0.field957, arg0.field954);
                }
                if (arg0.field984 >= var1.field3554.length) {
                    arg0.field960 = 0;
                    arg0.field984 = 0;
                    method3352(var1, arg0.field984, arg0.field957, arg0.field954);
                }
            }
        }
        if (arg0.field988 != -1 && field729 >= arg0.field994) {
            if (arg0.field992 < 0) {
                arg0.field992 = 0;
            }
            int var2 = class255.method4871(arg0.field988).field3279;
            if (var2 == -1) {
                arg0.field988 = -1;
            } else {
                class270 var3 = Statics.method1124(var2);
                if (var3 == null || var3.field3554 == null) {
                    arg0.field988 = -1;
                } else {
                    arg0.field987++;
                    if (arg0.field992 < var3.field3554.length && arg0.field987 > var3.field3556[arg0.field992]) {
                        arg0.field987 = 1;
                        arg0.field992++;
                        method3352(var3, arg0.field992, arg0.field957, arg0.field954);
                    }
                    if (arg0.field992 >= var3.field3554.length && (arg0.field992 < 0 || arg0.field992 >= var3.field3554.length)) {
                        arg0.field988 = -1;
                    }
                }
            }
        }
        if (arg0.field998 != -1 && arg0.field989 <= 1) {
            class270 var4 = Statics.method1124(arg0.field998);
            if (var4.field3565 == 1 && arg0.field1013 > 0 && arg0.field1000 <= field729 && arg0.field1001 < field729) {
                arg0.field989 = 1;
                return;
            }
        }
        if (arg0.field998 != -1 && arg0.field989 == 0) {
            class270 var5 = Statics.method1124(arg0.field998);
            if (var5 == null || var5.field3554 == null) {
                arg0.field998 = -1;
            } else {
                arg0.field962++;
                if (arg0.field996 < var5.field3554.length && arg0.field962 > var5.field3556[arg0.field996]) {
                    arg0.field962 = 1;
                    arg0.field996++;
                    method3352(var5, arg0.field996, arg0.field957, arg0.field954);
                }
                if (arg0.field996 >= var5.field3554.length) {
                    arg0.field996 -= var5.field3558;
                    arg0.field974++;
                    if (arg0.field974 >= var5.field3564) {
                        arg0.field998 = -1;
                    } else if (arg0.field996 >= 0 && arg0.field996 < var5.field3554.length) {
                        method3352(var5, arg0.field996, arg0.field957, arg0.field954);
                    } else {
                        arg0.field998 = -1;
                    }
                }
                arg0.field956 = var5.field3560;
            }
        }
        if (arg0.field989 > 0) {
            arg0.field989--;
        }
    }

    @ObfuscatedName("d.gl(I)V")
    public static void method18() {
        if (Statics.field1453 != null) {
            Statics.field1453.method6029(Statics.field1162, (Statics.field1986.field957 >> 7) + Statics.field109, (Statics.field1986.field954 >> 7) + Statics.field3212, false);
            Statics.field1453.method6045();
        }
    }

    @ObfuscatedName("fc.gz(Lbk;IIB)V")
    public static void method3304(class76 arg0, int arg1, int arg2) {
        if (arg0.field998 == arg1 && arg1 != -1) {
            int var3 = Statics.method1124(arg1).field3549;
            if (var3 == 1) {
                arg0.field996 = 0;
                arg0.field962 = 0;
                arg0.field989 = arg2;
                arg0.field974 = 0;
            }
            if (var3 == 2) {
                arg0.field974 = 0;
            }
        } else if (arg1 == -1 || arg0.field998 == -1 || Statics.method1124(arg1).field3561 >= Statics.method1124(arg0.field998).field3561) {
            arg0.field998 = arg1;
            arg0.field996 = 0;
            arg0.field962 = 0;
            arg0.field989 = arg2;
            arg0.field974 = 0;
            arg0.field1013 = arg0.field964;
        }
    }

    @ObfuscatedName("ee.gj(B)I")
    public static int method3174() {
        return field879 ? 2 : 1;
    }

    @ObfuscatedName("iu.gf(II)V")
    public static void method3976(int arg0) {
        field939 = 0L;
        if (arg0 >= 2) {
            field879 = true;
        } else {
            field879 = false;
        }
        if (method3174() == 1) {
            Statics.field7.method899(765, 503);
        } else {
            Statics.field7.method899(7680, 2160);
        }
        if (field670 < 25) {
            return;
        }
        class197 var1 = class197.method434(class193.field2291, field751.field1333);
        var1.field2372.method5279(method3174());
        var1.field2372.method5229(Statics.field88);
        var1.field2372.method5229(Statics.field145);
        field751.method2239(var1);
    }

    @ObfuscatedName("client.b(I)V")
    public final void method861() {
        field939 = class308.method1082() + 500L;
        this.method1253();
        if (field827 != -1) {
            this.method1259(true);
        }
    }

    @ObfuscatedName("client.gt(I)V")
    public void method1253() {
        int var1 = Statics.field88;
        int var2 = Statics.field145;
        if (this.field467 < var1) {
            int var3 = this.field467;
        }
        if (this.field471 < var2) {
            int var4 = this.field471;
        }
        if (Statics.field191 != null) {
            try {
                class57.method785(Statics.field7, "resize", new Object[] { method3174() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gm(I)V")
    public final void method1254() {
        if (field827 != -1) {
            int var1 = field827;
            if (class227.method619(var1)) {
                method1178(Statics.field3836[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field937; var2++) {
            if (field817[var2]) {
                field828[var2] = true;
            }
            field872[var2] = field817[var2];
            field817[var2] = false;
        }
        field869 = field729;
        field814 = -1;
        field870 = -1;
        Statics.field3490 = null;
        if (field827 != -1) {
            field937 = 0;
            method2922(field827, 0, 0, Statics.field88, Statics.field145, 0, 0, -1);
        }
        class332.method5749();
        if (field776) {
            if (field769 == 1) {
                Statics.field1904[field669 / 100].method5836(field766 - 8, field855 - 8);
            }
            if (field769 == 2) {
                Statics.field1904[field669 / 100 + 4].method5836(field766 - 8, field855 - 8);
            }
        }
        if (field752) {
            int var8 = Statics.field624;
            int var9 = Statics.field3628;
            int var10 = Statics.field2112;
            int var11 = Statics.field91;
            int var12 = 6116423;
            class332.method5763(var8, var9, var10, var11, var12);
            class332.method5763(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class332.method5741(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field597.method5093(class234.field2944, var8 + 3, var9 + 14, var12, -1);
            int var13 = class64.field502;
            int var14 = class64.field503;
            for (int var15 = 0; var15 < field736; var15++) {
                int var16 = (field736 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                Statics.field597.method5093(method441(var15), var8 + 3, var16, var17, 0);
            }
            int var18 = Statics.field624;
            int var19 = Statics.field3628;
            int var20 = Statics.field2112;
            int var21 = Statics.field91;
            for (int var22 = 0; var22 < field937; var22++) {
                if (field875[var22] + field873[var22] > var18 && field873[var22] < var18 + var20 && field874[var22] + field717[var22] > var19 && field874[var22] < var19 + var21) {
                    field828[var22] = true;
                }
            }
        } else if (field814 != -1) {
            int var3 = field814;
            int var4 = field870;
            if ((field736 >= 2 || field818 != 0 || field820) && field813) {
                int var5 = field736 - 1;
                String var7;
                if (field818 == 1 && field736 < 2) {
                    var7 = class234.field2941 + class234.field2951 + field705 + " " + class91.field1160;
                } else if (field820 && field736 < 2) {
                    var7 = field823 + class234.field2951 + field685 + " " + class91.field1160;
                } else {
                    var7 = method441(var5);
                }
                if (field736 > 2) {
                    var7 = var7 + class91.method3410(16777215) + " " + '/' + " " + (field736 - 2) + class234.field2896;
                }
                Statics.field597.method5089(var7, var3 + 4, var4 + 15, 16777215, 0, field729 / 1000);
            }
        }
        if (field877 == 3) {
            for (int var23 = 0; var23 < field937; var23++) {
                if (field872[var23]) {
                    class332.method5797(field873[var23], field874[var23], field875[var23], field717[var23], 16711935, 128);
                } else if (field828[var23]) {
                    class332.method5797(field873[var23], field874[var23], field875[var23], field717[var23], 16711680, 128);
                }
            }
        }
        class85.method285(Statics.field1162, Statics.field1986.field957, Statics.field1986.field954, field809);
        field809 = 0;
    }

    @ObfuscatedName("at.gq(Ljava/lang/String;ZI)V")
    public static final void method331(String arg0, boolean arg1) {
        if (!field898) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1228.method5110(arg0, 250);
        int var6 = Statics.field1228.method5083(arg0, 250) * 13;
        class332.method5763(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class332.method5741(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1228.method5160(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2086(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2072.method838(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field937; var11++) {
            if (field875[var11] + field873[var11] > var7 && field873[var11] < var7 + var9 && field874[var11] + field717[var11] > var8 && field874[var11] < var8 + var10) {
                field828[var11] = true;
            }
        }
    }

    @ObfuscatedName("w.ga(IIIII)V")
    public static final void method100(int arg0, int arg1, int arg2, int arg3) {
        field763++;
        method1763();
        if (field784) {
            method714(Statics.field1986, false);
        }
        method3479();
        method891(true);
        int var4 = class99.field1271;
        int[] var5 = class99.field1272;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field770 != var5[var6] && field750 != var5[var6]) {
                method714(field671[var5[var6]], true);
            }
        }
        method891(false);
        method2502();
        method782();
        method2025(arg0, arg1, arg2, arg3, true);
        int var7 = field921;
        int var8 = field922;
        int var9 = field923;
        int var10 = field924;
        class332.method5729(var7, var8, var7 + var9, var8 + var10);
        class140.method2926();
        if (!field907) {
            int var11 = field734;
            if (field881 / 256 > var11) {
                var11 = field881 / 256;
            }
            if (field908[4] && field910[4] + 128 > var11) {
                var11 = field910[4] + 128;
            }
            int var12 = field735 & 0x7FF;
            int var13 = Statics.field1021;
            int var14 = Statics.field1883;
            int var15 = Statics.field625;
            int var18 = var11 * 3 + 600;
            method4290(var13, var14, var15, var11, var12, var18, var10);
        }
        int var19;
        if (field907) {
            var19 = method3354();
        } else {
            var19 = method617();
        }
        int var20 = Statics.field1261;
        int var21 = Statics.field555;
        int var22 = Statics.field1102;
        int var23 = Statics.field428;
        int var24 = Statics.field287;
        for (int var25 = 0; var25 < 5; var25++) {
            if (field908[var25]) {
                int var26 = (int) (Math.random() * (double) (field909[var25] * 2 + 1) - (double) field909[var25] + Math.sin((double) field800[var25] / 100.0D * (double) field912[var25]) * (double) field910[var25]);
                if (var25 == 0) {
                    Statics.field1261 += var26;
                }
                if (var25 == 1) {
                    Statics.field555 += var26;
                }
                if (var25 == 2) {
                    Statics.field1102 += var26;
                }
                if (var25 == 3) {
                    Statics.field287 = Statics.field287 + var26 & 0x7FF;
                }
                if (var25 == 4) {
                    Statics.field428 += var26;
                    if (Statics.field428 < 128) {
                        Statics.field428 = 128;
                    }
                    if (Statics.field428 > 383) {
                        Statics.field428 = 383;
                    }
                }
            }
        }
        int var27 = class64.field502;
        int var28 = class64.field503;
        if (class64.field509 != 0) {
            var27 = class64.field510;
            var28 = class64.field511;
        }
        if (var27 >= var7 && var27 < var7 + var9 && var28 >= var8 && var28 < var8 + var10) {
            class138.method114(var27 - var7, var28 - var8);
        } else {
            class138.field1754 = false;
            class138.field1765 = 0;
        }
        method3319();
        class332.method5763(var7, var8, var9, var10, 0);
        method3319();
        int var29 = class140.field1786;
        class140.field1786 = field925;
        Statics.field2034.method3042(Statics.field1261, Statics.field555, Statics.field1102, Statics.field428, Statics.field287, var19);
        class140.field1786 = var29;
        method3319();
        Statics.field2034.method3083();
        field868 = 0;
        boolean var30 = false;
        int var31 = -1;
        int var32 = -1;
        int var33 = class99.field1271;
        int[] var34 = class99.field1272;
        for (int var35 = 0; var35 < field707 + var33; var35++) {
            class79 var36;
            if (var35 < var33) {
                var36 = field671[var34[var35]];
                if (field770 == var34[var35]) {
                    var30 = true;
                    var31 = var35;
                    continue;
                }
                if (Statics.field1986 == var36) {
                    var32 = var35;
                    continue;
                }
            } else {
                var36 = field722[field708[var35 - var33]];
            }
            method3323(var36, var35, var7, var8, var9, var10);
        }
        if (field784 && var32 != -1) {
            method3323(Statics.field1986, var32, var7, var8, var9, var10);
        }
        if (var30) {
            method3323(field671[field770], var31, var7, var8, var9, var10);
        }
        for (int var37 = 0; var37 < field868; var37++) {
            int var38 = field918[var37];
            int var39 = field792[var37];
            int var40 = field757[var37];
            int var41 = field756[var37];
            boolean var42 = true;
            while (var42) {
                var42 = false;
                for (int var43 = 0; var43 < var37; var43++) {
                    if (var39 + 2 > field792[var43] - field756[var43] && var39 - var41 < field792[var43] + 2 && var38 - var40 < field918[var43] + field757[var43] && var38 + var40 > field918[var43] - field757[var43] && field792[var43] - field756[var43] < var39) {
                        var39 = field792[var43] - field756[var43];
                        var42 = true;
                    }
                }
            }
            field764 = field918[var37];
            field765 = field792[var37] = var39;
            String var44 = field761[var37];
            if (field829 == 0) {
                int var45 = 16776960;
                if (field758[var37] < 6) {
                    var45 = field880[field758[var37]];
                }
                if (field758[var37] == 6) {
                    var45 = field763 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field758[var37] == 7) {
                    var45 = field763 % 20 < 10 ? 255 : 65535;
                }
                if (field758[var37] == 8) {
                    var45 = field763 % 20 < 10 ? 45056 : 8454016;
                }
                if (field758[var37] == 9) {
                    int var46 = 150 - field760[var37];
                    if (var46 < 50) {
                        var45 = var46 * 1280 + 16711680;
                    } else if (var46 < 100) {
                        var45 = 16776960 - (var46 - 50) * 327680;
                    } else if (var46 < 150) {
                        var45 = (var46 - 100) * 5 + 65280;
                    }
                }
                if (field758[var37] == 10) {
                    int var47 = 150 - field760[var37];
                    if (var47 < 50) {
                        var45 = var47 * 5 + 16711680;
                    } else if (var47 < 100) {
                        var45 = 16711935 - (var47 - 50) * 327680;
                    } else if (var47 < 150) {
                        var45 = (var47 - 100) * 327680 + 255 - (var47 - 100) * 5;
                    }
                }
                if (field758[var37] == 11) {
                    int var48 = 150 - field760[var37];
                    if (var48 < 50) {
                        var45 = 16777215 - var48 * 327685;
                    } else if (var48 < 100) {
                        var45 = (var48 - 50) * 327685 + 65280;
                    } else if (var48 < 150) {
                        var45 = 16777215 - (var48 - 100) * 327680;
                    }
                }
                if (field759[var37] == 0) {
                    Statics.field597.method5092(var44, field764 + var7, field765 + var8, var45, 0);
                }
                if (field759[var37] == 1) {
                    Statics.field597.method5146(var44, field764 + var7, field765 + var8, var45, 0, field763);
                }
                if (field759[var37] == 2) {
                    Statics.field597.method5095(var44, field764 + var7, field765 + var8, var45, 0, field763);
                }
                if (field759[var37] == 3) {
                    Statics.field597.method5096(var44, field764 + var7, field765 + var8, var45, 0, field763, 150 - field760[var37]);
                }
                if (field759[var37] == 4) {
                    int var49 = (150 - field760[var37]) * (Statics.field597.method5084(var44) + 100) / 150;
                    class332.method5730(field764 + var7 - 50, var8, field764 + var7 + 50, var8 + var10);
                    Statics.field597.method5093(var44, field764 + var7 + 50 - var49, field765 + var8, var45, 0);
                    class332.method5729(var7, var8, var7 + var9, var8 + var10);
                }
                if (field759[var37] == 5) {
                    int var50 = 150 - field760[var37];
                    int var51 = 0;
                    if (var50 < 25) {
                        var51 = var50 - 25;
                    } else if (var50 > 125) {
                        var51 = var50 - 125;
                    }
                    class332.method5730(var7, field765 + var8 - Statics.field597.field3712 - 1, var7 + var9, field765 + var8 + 5);
                    Statics.field597.method5092(var44, field764 + var7, field765 + var8 + var51, var45, 0);
                    class332.method5729(var7, var8, var7 + var9, var8 + var10);
                }
            } else {
                Statics.field597.method5092(var44, field764 + var7, field765 + var8, 16776960, 0);
            }
        }
        if (field682 == 2) {
            method4322((field911 - Statics.field109 << 7) + field843, (field686 - Statics.field3212 << 7) + field802, field934 * 2);
            if (field764 > -1 && field729 % 20 < 10) {
                Statics.field67[0].method5836(field764 + var7 - 12, field765 + var8 - 28);
            }
        }
        ((class129) Statics.field1777).method2672(field809);
        method290(var7, var8, var9, var10);
        Statics.field1261 = var20;
        Statics.field555 = var21;
        Statics.field1102 = var22;
        Statics.field428 = var23;
        Statics.field287 = var24;
        if (field673) {
            byte var52 = 0;
            int var53 = class248.field3209 + class248.field3207 + var52;
            if (var53 == 0) {
                field673 = false;
            }
        }
        if (field673) {
            class332.method5763(var7, var8, var9, var10, 0);
            method331(class234.field2798, false);
        }
    }

    @ObfuscatedName("ce.gu(IIIIZI)V")
    public static final void method2025(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field780;
        } else if (var5 >= 100) {
            var6 = field914;
        } else {
            var6 = (field914 - field780) * var5 / 100 + field780;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field919) {
            short var8 = field919;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field691) {
                var6 = field691;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class332.method5749();
                    class332.method5763(arg0, arg1, var10, arg3, -16777216);
                    class332.method5763(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field847) {
            short var11 = field847;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field917) {
                var6 = field917;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class332.method5749();
                    class332.method5763(arg0, arg1, arg2, var13, -16777216);
                    class332.method5763(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field925 = arg3 * var6 / 334;
        if (field923 != arg2 || field924 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class140.field1800[var16];
                int var20 = method1095(var17, arg3);
                var14[var15] = var19 * var20 >> 16;
            }
            class143.method3064(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field921 = arg0;
        field922 = arg1;
        field923 = arg2;
        field924 = arg3;
    }

    @ObfuscatedName("cq.gb(I)V")
    public static void method1763() {
        if (Statics.field1986.field957 >> 7 == field895 && Statics.field1986.field954 >> 7 == field789) {
            field895 = 0;
        }
    }

    @ObfuscatedName("gz.gd(I)V")
    public static void method3479() {
        if (field770 >= 0 && field671[field770] != null) {
            method714(field671[field770], false);
        }
    }

    @ObfuscatedName("af.gv(Lbk;ZI)V")
    public static void method714(class76 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1192() || arg0.field649) {
            return;
        }
        arg0.field646 = false;
        if ((field666 && class99.field1271 > 50 || class99.field1271 > 200) && arg1 && arg0.field983 == arg0.field973) {
            arg0.field646 = true;
        }
        int var2 = arg0.field957 >> 7;
        int var3 = arg0.field954 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class138.method2665(0, 0, 0, false, arg0.field637);
        if (arg0.field636 != null && field729 >= arg0.field639 && field729 < arg0.field635) {
            arg0.field646 = false;
            arg0.field648 = method576(arg0.field957, arg0.field954, Statics.field1162);
            arg0.field991 = field729;
            Statics.field2034.method3143(Statics.field1162, arg0.field957, arg0.field954, arg0.field648, 60, arg0, arg0.field955, var4, arg0.field642, arg0.field643, arg0.field641, arg0.field645);
            return;
        }
        if ((arg0.field957 & 0x7F) == 64 && (arg0.field954 & 0x7F) == 64) {
            if (field763 == field904[var2][var3]) {
                return;
            }
            field904[var2][var3] = field763;
        }
        arg0.field648 = method576(arg0.field957, arg0.field954, Statics.field1162);
        arg0.field991 = field729;
        Statics.field2034.method3152(Statics.field1162, arg0.field957, arg0.field954, arg0.field648, 60, arg0, arg0.field955, var4, arg0.field956);
    }

    @ObfuscatedName("bt.gs(ZI)V")
    public static final void method891(boolean arg0) {
        for (int var1 = 0; var1 < field707; var1++) {
            class89 var2 = field722[field708[var1]];
            if (var2 != null && var2.method1192() && var2.field1150.field3523 == arg0 && var2.field1150.method4535()) {
                int var3 = var2.field957 >> 7;
                int var4 = var2.field954 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1008 == 1 && (var2.field957 & 0x7F) == 64 && (var2.field954 & 0x7F) == 64) {
                        if (field763 == field904[var3][var4]) {
                            continue;
                        }
                        field904[var3][var4] = field763;
                    }
                    long var5 = class138.method2665(0, 0, 1, !var2.field1150.field3531, field708[var1]);
                    var2.field991 = field729;
                    Statics.field2034.method3152(Statics.field1162, var2.field957, var2.field954, method576(var2.field957 + (var2.field1008 * 64 - 64), var2.field954 + (var2.field1008 * 64 - 64), Statics.field1162), var2.field1008 * 64 - 64 + 60, var2, var2.field955, var5, var2.field956);
                }
            }
        }
    }

    @ObfuscatedName("dq.gn(I)V")
    public static final void method2502() {
        for (class96 var0 = (class96) field795.method4721(); var0 != null; var0 = (class96) field795.method4706()) {
            if (Statics.field1162 != var0.field1231 || field729 > var0.field1237) {
                var0.method3486();
            } else if (field729 >= var0.field1236) {
                if (var0.field1252 > 0) {
                    class89 var1 = field722[var0.field1252 - 1];
                    if (var1 != null && var1.field957 >= 0 && var1.field957 < 13312 && var1.field954 >= 0 && var1.field954 < 13312) {
                        var0.method2077(var1.field957, var1.field954, method576(var1.field957, var1.field954, var0.field1231) - var0.field1235, field729);
                    }
                }
                if (var0.field1252 < 0) {
                    int var2 = -var0.field1252 - 1;
                    class76 var3;
                    if (field750 == var2) {
                        var3 = Statics.field1986;
                    } else {
                        var3 = field671[var2];
                    }
                    if (var3 != null && var3.field957 >= 0 && var3.field957 < 13312 && var3.field954 >= 0 && var3.field954 < 13312) {
                        var0.method2077(var3.field957, var3.field954, method576(var3.field957, var3.field954, var0.field1231) - var0.field1235, field729);
                    }
                }
                var0.method2078(field809);
                Statics.field2034.method3152(Statics.field1162, (int) var0.field1240, (int) var0.field1243, (int) var0.field1242, 60, var0, var0.field1250, -1L, false);
            }
        }
    }

    @ObfuscatedName("bp.gk(I)V")
    public static final void method782() {
        for (class87 var0 = (class87) field796.method4721(); var0 != null; var0 = (class87) field796.method4706()) {
            if (Statics.field1162 != var0.field1130 || var0.field1135) {
                var0.method3486();
            } else if (field729 >= var0.field1134) {
                var0.method1985(field809);
                if (var0.field1135) {
                    var0.method3486();
                } else {
                    Statics.field2034.method3152(var0.field1130, var0.field1131, var0.field1132, var0.field1128, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("aj.gr(I)I")
    public static final int method617() {
        if (Statics.field191.field1068) {
            return Statics.field1162;
        }
        int var0 = 3;
        if (Statics.field428 < 310) {
            int var1;
            int var2;
            if (field740 == 1) {
                var1 = Statics.field1021 >> 7;
                var2 = Statics.field625 >> 7;
            } else {
                var1 = Statics.field1986.field957 >> 7;
                var2 = Statics.field1986.field954 >> 7;
            }
            int var3 = Statics.field1261 >> 7;
            int var4 = Statics.field1102 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field1162;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1162;
            }
            if ((class65.field516[Statics.field1162][var3][var4] & 0x4) != 0) {
                var0 = Statics.field1162;
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
                    if ((class65.field516[Statics.field1162][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1162;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class65.field516[Statics.field1162][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1162;
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
                    if ((class65.field516[Statics.field1162][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1162;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class65.field516[Statics.field1162][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1162;
                        }
                    }
                }
            }
        }
        if (Statics.field1986.field957 >= 0 && Statics.field1986.field954 >= 0 && Statics.field1986.field957 < 13312 && Statics.field1986.field954 < 13312) {
            if ((class65.field516[Statics.field1162][Statics.field1986.field957 >> 7][Statics.field1986.field954 >> 7] & 0x4) != 0) {
                var0 = Statics.field1162;
            }
            return var0;
        } else {
            return Statics.field1162;
        }
    }

    @ObfuscatedName("fd.gi(I)I")
    public static final int method3354() {
        if (Statics.field191.field1068) {
            return Statics.field1162;
        } else {
            int var0 = method576(Statics.field1261, Statics.field1102, Statics.field1162);
            return var0 - Statics.field555 >= 800 || (class65.field516[Statics.field1162][Statics.field1261 >> 7][Statics.field1102 >> 7] & 0x4) == 0 ? 3 : Statics.field1162;
        }
    }

    @ObfuscatedName("iu.gp(B)Z")
    public static boolean method3975() {
        return (field899 & 0x4) != 0;
    }

    @ObfuscatedName("ik.gx(B)Z")
    public static boolean method3979() {
        return (field899 & 0x8) != 0;
    }

    @ObfuscatedName("fg.gw(Lcv;IIIIIB)V")
    public static final void method3323(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1192()) {
            return;
        }
        if (arg0 instanceof class89) {
            class268 var6 = ((class89) arg0).field1150;
            if (var6.field3528 != null) {
                var6 = var6.method4534();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class99.field1271;
        int[] var8 = class99.field1272;
        byte var9 = 0;
        if (arg1 < var7 && field729 == arg0.field991) {
            class76 var10 = (class76) arg0;
            boolean var11;
            if (field899 == 0) {
                var11 = false;
            } else if (Statics.field1986 == var10) {
                var11 = method3979();
            } else {
                boolean var12 = method3975();
                if (!var12) {
                    boolean var13 = (field899 & 0x1) != 0;
                    var12 = var13 && var10.method1196();
                }
                boolean var14 = var12;
                if (!var12) {
                    boolean var15 = (field899 & 0x2) != 0;
                    var14 = var15 && var10.method1184();
                }
                var11 = var14;
            }
            if (var11) {
                class76 var16 = (class76) arg0;
                if (arg1 < var7) {
                    method2483(arg0, arg0.field1004 + 15);
                    class307 var17 = (class307) field716.get(class303.field3695);
                    byte var18 = 9;
                    var17.method5092(var16.field630.method4963(), field764 + arg2, field765 + arg3 - var18, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var19 = -2;
        if (!arg0.field979.method4664()) {
            method2483(arg0, arg0.field1004 + 15);
            for (class88 var20 = (class88) arg0.field979.method4682(); var20 != null; var20 = (class88) arg0.field979.method4642()) {
                class80 var21 = var20.method1993(field729);
                if (var21 != null) {
                    class258 var22 = var20.field1142;
                    class336 var23 = var22.method4266();
                    class336 var24 = var22.method4268();
                    int var25 = 0;
                    int var26;
                    if (var23 == null || var24 == null) {
                        var26 = var22.field3322;
                    } else {
                        if (var22.field3323 * 2 < var24.field3913) {
                            var25 = var22.field3323;
                        }
                        var26 = var24.field3913 - var25 * 2;
                    }
                    int var27 = 255;
                    boolean var28 = true;
                    int var29 = field729 - var21.field1019;
                    int var30 = var21.field1015 * var26 / var22.field3322;
                    int var33;
                    if (var21.field1018 > var29) {
                        int var31 = var22.field3317 == 0 ? 0 : var29 / var22.field3317 * var22.field3317;
                        int var32 = var21.field1016 * var26 / var22.field3322;
                        var33 = (var30 - var32) * var31 / var21.field1018 + var32;
                    } else {
                        var33 = var30;
                        int var34 = var21.field1018 + var22.field3318 - var29;
                        if (var22.field3319 >= 0) {
                            var27 = (var34 << 8) / (var22.field3318 - var22.field3319);
                        }
                    }
                    if (var21.field1015 > 0 && var33 < 1) {
                        var33 = 1;
                    }
                    if (var23 == null || var24 == null) {
                        var19 += 5;
                        if (field764 > -1) {
                            int var40 = field764 + arg2 - (var26 >> 1);
                            int var41 = field765 + arg3 - var19;
                            class332.method5763(var40, var41, var33, 5, 65280);
                            class332.method5763(var33 + var40, var41, var26 - var33, 5, 16711680);
                        }
                        var19 += 2;
                    } else {
                        int var35;
                        if (var26 == var33) {
                            var35 = var25 * 2 + var33;
                        } else {
                            var35 = var25 + var33;
                        }
                        int var36 = var23.field3912;
                        var19 += var36;
                        int var37 = field764 + arg2 - (var26 >> 1);
                        int var38 = field765 + arg3 - var19;
                        int var39 = var37 - var25;
                        if (var27 >= 0 && var27 < 255) {
                            var23.method5842(var39, var38, var27);
                            class332.method5730(var39, var38, var35 + var39, var36 + var38);
                            var24.method5842(var39, var38, var27);
                        } else {
                            var23.method5836(var39, var38);
                            class332.method5730(var39, var38, var35 + var39, var36 + var38);
                            var24.method5836(var39, var38);
                        }
                        class332.method5729(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var19 += 2;
                    }
                } else if (var20.method1994()) {
                    var20.method3486();
                }
            }
        }
        if (var19 == -2) {
            var19 += 7;
        }
        int var42 = var9 + var19;
        if (arg1 < var7) {
            class76 var43 = (class76) arg0;
            if (var43.field649) {
                return;
            }
            if (var43.field652 != -1 || var43.field631 != -1) {
                method2483(arg0, arg0.field1004 + 15);
                if (field764 > -1) {
                    if (var43.field652 != -1) {
                        var42 += 25;
                        Statics.field727[var43.field652].method5836(field764 + arg2 - 12, field765 + arg3 - var42);
                    }
                    if (var43.field631 != -1) {
                        var42 += 25;
                        Statics.field2017[var43.field631].method5836(field764 + arg2 - 12, field765 + arg3 - var42);
                    }
                }
            }
            if (arg1 >= 0 && field682 == 10 && field684 == var8[arg1]) {
                method2483(arg0, arg0.field1004 + 15);
                if (field764 > -1) {
                    int var44 = Statics.field67[1].field3912 + var42;
                    Statics.field67[1].method5836(field764 + arg2 - 12, field765 + arg3 - var44);
                }
            }
        } else {
            class268 var45 = ((class89) arg0).field1150;
            if (var45.field3528 != null) {
                var45 = var45.method4534();
            }
            if (var45.field3526 >= 0 && var45.field3526 < Statics.field2017.length) {
                method2483(arg0, arg0.field1004 + 15);
                if (field764 > -1) {
                    Statics.field2017[var45.field3526].method5836(field764 + arg2 - 12, field765 + arg3 - 30);
                }
            }
            if (field682 == 1 && field683 == field708[arg1 - var7] && field729 % 20 < 10) {
                method2483(arg0, arg0.field1004 + 15);
                if (field764 > -1) {
                    Statics.field67[0].method5836(field764 + arg2 - 12, field765 + arg3 - 28);
                }
            }
        }
        if (arg0.field967 != null && (arg1 >= var7 || !arg0.field969 && (field738 == 4 || !arg0.field968 && (field738 == 0 || field738 == 3 || field738 == 1 && ((class76) arg0).method1196())))) {
            method2483(arg0, arg0.field1004);
            if (field764 > -1 && field868 < field753) {
                field757[field868] = Statics.field597.method5084(arg0.field967) / 2;
                field756[field868] = Statics.field597.field3712;
                field918[field868] = field764;
                field792[field868] = field765;
                field758[field868] = arg0.field971;
                field759[field868] = arg0.field972;
                field760[field868] = arg0.field970;
                field761[field868] = arg0.field967;
                field868++;
            }
        }
        for (int var46 = 0; var46 < 4; var46++) {
            int var47 = arg0.field976[var46];
            int var48 = arg0.field1006[var46];
            class264 var49 = null;
            int var50 = 0;
            if (var48 >= 0) {
                if (var47 <= field729) {
                    continue;
                }
                var49 = class264.method1084(arg0.field1006[var46]);
                var50 = var49.field3365;
                if (var49 != null && var49.field3356 != null) {
                    var49 = var49.method4367();
                    if (var49 == null) {
                        arg0.field976[var46] = -1;
                        continue;
                    }
                }
            } else if (var47 < 0) {
                continue;
            }
            int var51 = arg0.field977[var46];
            class264 var52 = null;
            if (var51 >= 0) {
                var52 = class264.method1084(var51);
                if (var52 != null && var52.field3356 != null) {
                    var52 = var52.method4367();
                }
            }
            if (var47 - var50 <= field729) {
                if (var49 == null) {
                    arg0.field976[var46] = -1;
                } else {
                    method2483(arg0, arg0.field1004 / 2);
                    if (field764 > -1) {
                        if (var46 == 1) {
                            field765 -= 20;
                        }
                        if (var46 == 2) {
                            field764 -= 15;
                            field765 -= 10;
                        }
                        if (var46 == 3) {
                            field764 += 15;
                            field765 -= 10;
                        }
                        Object var53 = null;
                        Object var54 = null;
                        Object var55 = null;
                        Object var56 = null;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        class336 var65 = null;
                        class336 var66 = null;
                        class336 var67 = null;
                        class336 var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        class336 var78 = var49.method4369();
                        if (var78 != null) {
                            var57 = var78.field3913;
                            int var79 = var78.field3912;
                            if (var79 > var77) {
                                var77 = var79;
                            }
                            var61 = var78.field3914;
                        }
                        class336 var80 = var49.method4375();
                        if (var80 != null) {
                            var58 = var80.field3913;
                            int var81 = var80.field3912;
                            if (var81 > var77) {
                                var77 = var81;
                            }
                            var62 = var80.field3914;
                        }
                        class336 var82 = var49.method4374();
                        if (var82 != null) {
                            var59 = var82.field3913;
                            int var83 = var82.field3912;
                            if (var83 > var77) {
                                var77 = var83;
                            }
                            var63 = var82.field3914;
                        }
                        class336 var84 = var49.method4371();
                        if (var84 != null) {
                            var60 = var84.field3913;
                            int var85 = var84.field3912;
                            if (var85 > var77) {
                                var77 = var85;
                            }
                            var64 = var84.field3914;
                        }
                        if (var52 != null) {
                            var65 = var52.method4369();
                            if (var65 != null) {
                                var69 = var65.field3913;
                                int var86 = var65.field3912;
                                if (var86 > var77) {
                                    var77 = var86;
                                }
                                var73 = var65.field3914;
                            }
                            var66 = var52.method4375();
                            if (var66 != null) {
                                var70 = var66.field3913;
                                int var87 = var66.field3912;
                                if (var87 > var77) {
                                    var77 = var87;
                                }
                                var74 = var66.field3914;
                            }
                            var67 = var52.method4374();
                            if (var67 != null) {
                                var71 = var67.field3913;
                                int var88 = var67.field3912;
                                if (var88 > var77) {
                                    var77 = var88;
                                }
                                var75 = var67.field3914;
                            }
                            var68 = var52.method4371();
                            if (var68 != null) {
                                var72 = var68.field3913;
                                int var89 = var68.field3912;
                                if (var89 > var77) {
                                    var77 = var89;
                                }
                                var76 = var68.field3914;
                            }
                        }
                        class306 var90 = var49.method4372();
                        if (var90 == null) {
                            var90 = Statics.field542;
                        }
                        class306 var91;
                        if (var52 == null) {
                            var91 = Statics.field542;
                        } else {
                            var91 = var52.method4372();
                            if (var91 == null) {
                                var91 = Statics.field542;
                            }
                        }
                        Object var92 = null;
                        String var93 = null;
                        boolean var94 = false;
                        int var95 = 0;
                        String var96 = var49.method4401(arg0.field975[var46]);
                        int var97 = var90.method5084(var96);
                        if (var52 != null) {
                            var93 = var52.method4401(arg0.field959[var46]);
                            var95 = var91.method5084(var93);
                        }
                        int var98 = 0;
                        int var99 = 0;
                        if (var58 > 0) {
                            if (var82 == null && var84 == null) {
                                var98 = 1;
                            } else {
                                var98 = var97 / var58 + 1;
                            }
                        }
                        if (var52 != null && var70 > 0) {
                            if (var67 == null && var68 == null) {
                                var99 = 1;
                            } else {
                                var99 = var95 / var70 + 1;
                            }
                        }
                        int var100 = 0;
                        int var101 = var100;
                        if (var57 > 0) {
                            var100 += var57;
                        }
                        var100 += 2;
                        int var102 = var100;
                        if (var59 > 0) {
                            var100 += var59;
                        }
                        int var103 = var100;
                        int var104 = var100;
                        int var106;
                        if (var58 > 0) {
                            int var105 = var58 * var98;
                            var106 = var100 + var105;
                            var104 = (var105 - var97) / 2 + var100;
                        } else {
                            var106 = var97 + var100;
                        }
                        int var107 = var106;
                        if (var60 > 0) {
                            var106 += var60;
                        }
                        int var108 = 0;
                        int var109 = 0;
                        int var110 = 0;
                        int var111 = 0;
                        int var112 = 0;
                        if (var52 != null) {
                            var106 += 2;
                            var108 = var106;
                            if (var69 > 0) {
                                var106 += var69;
                            }
                            var106 += 2;
                            var109 = var106;
                            if (var71 > 0) {
                                var106 += var71;
                            }
                            var110 = var106;
                            var112 = var106;
                            if (var70 > 0) {
                                int var113 = var70 * var99;
                                var106 += var113;
                                var112 += (var113 - var95) / 2;
                            } else {
                                var106 += var95;
                            }
                            var111 = var106;
                            if (var72 > 0) {
                                var106 += var72;
                            }
                        }
                        int var114 = arg0.field976[var46] - field729;
                        int var115 = var49.field3379 - var49.field3379 * var114 / var49.field3365;
                        int var116 = var49.field3371 * var114 / var49.field3365 + -var49.field3371;
                        int var117 = field764 + arg2 - (var106 >> 1) + var115;
                        int var118 = field765 + arg3 - 12 + var116;
                        int var119 = var118;
                        int var120 = var77 + var118;
                        int var121 = var49.field3369 + var118 + 15;
                        int var122 = var121 - var90.field3719;
                        int var123 = var90.field3720 + var121;
                        if (var122 < var118) {
                            var119 = var122;
                        }
                        if (var123 > var120) {
                            var120 = var123;
                        }
                        int var124 = 0;
                        if (var52 != null) {
                            var124 = var52.field3369 + var118 + 15;
                            int var125 = var124 - var91.field3719;
                            int var126 = var91.field3720 + var124;
                            if (var125 < var119) {
                                ;
                            }
                            if (var126 > var120) {
                                ;
                            }
                        }
                        int var129 = 255;
                        if (var49.field3372 >= 0) {
                            var129 = (var114 << 8) / (var49.field3365 - var49.field3372);
                        }
                        if (var129 >= 0 && var129 < 255) {
                            if (var78 != null) {
                                var78.method5842(var101 + var117 - var61, var118, var129);
                            }
                            if (var82 != null) {
                                var82.method5842(var102 + var117 - var63, var118, var129);
                            }
                            if (var80 != null) {
                                for (int var130 = 0; var130 < var98; var130++) {
                                    var80.method5842(var58 * var130 + (var103 + var117 - var62), var118, var129);
                                }
                            }
                            if (var84 != null) {
                                var84.method5842(var107 + var117 - var64, var118, var129);
                            }
                            var90.method5090(var96, var104 + var117, var121, var49.field3374, 0, var129);
                            if (var52 != null) {
                                if (var65 != null) {
                                    var65.method5842(var108 + var117 - var73, var118, var129);
                                }
                                if (var67 != null) {
                                    var67.method5842(var109 + var117 - var75, var118, var129);
                                }
                                if (var66 != null) {
                                    for (int var131 = 0; var131 < var99; var131++) {
                                        var66.method5842(var70 * var131 + (var110 + var117 - var74), var118, var129);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method5842(var111 + var117 - var76, var118, var129);
                                }
                                var91.method5090(var93, var112 + var117, var124, var52.field3374, 0, var129);
                            }
                        } else {
                            if (var78 != null) {
                                var78.method5836(var101 + var117 - var61, var118);
                            }
                            if (var82 != null) {
                                var82.method5836(var102 + var117 - var63, var118);
                            }
                            if (var80 != null) {
                                for (int var132 = 0; var132 < var98; var132++) {
                                    var80.method5836(var58 * var132 + (var103 + var117 - var62), var118);
                                }
                            }
                            if (var84 != null) {
                                var84.method5836(var107 + var117 - var64, var118);
                            }
                            var90.method5093(var96, var104 + var117, var121, var49.field3374 | 0xFF000000, 0);
                            if (var52 != null) {
                                if (var65 != null) {
                                    var65.method5836(var108 + var117 - var73, var118);
                                }
                                if (var67 != null) {
                                    var67.method5836(var109 + var117 - var75, var118);
                                }
                                if (var66 != null) {
                                    for (int var133 = 0; var133 < var99; var133++) {
                                        var66.method5836(var70 * var133 + (var110 + var117 - var74), var118);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method5836(var111 + var117 - var76, var118);
                                }
                                var91.method5093(var93, var112 + var117, var124, var52.field3374 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.go(IIIII)V")
    public static final void method290(int arg0, int arg1, int arg2, int arg3) {
        field779 = 0;
        int var4 = (Statics.field1986.field957 >> 7) + Statics.field109;
        int var5 = (Statics.field1986.field954 >> 7) + Statics.field3212;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field779 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field779 = 1;
        }
        if (field779 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field779 = 0;
        }
    }

    @ObfuscatedName("dy.gh(Lcv;II)V")
    public static final void method2483(class79 arg0, int arg1) {
        method4322(arg0.field957, arg0.field954, arg1);
    }

    @ObfuscatedName("jl.gc(IIII)V")
    public static final void method4322(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field764 = -1;
            field765 = -1;
            return;
        }
        int var3 = method576(arg0, arg1, Statics.field1162) - arg2;
        int var4 = arg0 - Statics.field1261;
        int var5 = var3 - Statics.field555;
        int var6 = arg1 - Statics.field1102;
        int var7 = class140.field1800[Statics.field428];
        int var8 = class140.field1801[Statics.field428];
        int var9 = class140.field1800[Statics.field287];
        int var10 = class140.field1801[Statics.field287];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field764 = field925 * var11 / var15 + field923 / 2;
            field765 = field925 * var14 / var15 + field924 / 2;
        } else {
            field764 = -1;
            field765 = -1;
        }
    }

    @ObfuscatedName("as.gy(IIII)I")
    public static final int method576(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class65.field516[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class65.field525[var5][var3][var4] + class65.field525[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class65.field525[var5][var3][var4 + 1] + class65.field525[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bg.ge(III)I")
    public static int method1095(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field916 - field915) * var2 / 100 + field915;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("in.gg(IIIIIIII)V")
    public static final void method4290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method1095(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class140.field1800[var8];
            int var14 = class140.field1801[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class140.field1800[var9];
            int var17 = class140.field1801[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        Statics.field1261 = arg0 - var10;
        Statics.field555 = arg1 - var11;
        Statics.field1102 = arg2 - var12;
        Statics.field428 = arg3;
        Statics.field287 = arg4;
        if (field740 != 1 || field754 < 2 || field729 % 50 != 0 || !(Statics.field1021 >> 7 != Statics.field1986.field957 >> 7 || Statics.field625 >> 7 != Statics.field1986.field954 >> 7)) {
            return;
        }
        int var19 = Statics.field1986.field650;
        int var20 = (Statics.field1021 >> 7) + Statics.field109;
        int var21 = (Statics.field625 >> 7) + Statics.field3212;
        class197 var22 = class197.method434(class193.field2231, field751.field1333);
        var22.field2372.method5411(var21);
        var22.field2372.method5439(var19);
        var22.field2372.method5292(field747);
        var22.field2372.method5246(var20);
        field751.method2239(var22);
    }

    @ObfuscatedName("do.hq(ZLkd;I)V")
    public static final void method2267(boolean arg0, class310 arg1) {
        field723 = arg0;
        if (!field723) {
            int var2 = arg1.method5284();
            int var3 = arg1.method5283();
            int var4 = arg1.method5247();
            Statics.field3882 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field3882[var5][var6] = arg1.method5455();
                }
            }
            Statics.field3126 = new int[var4];
            Statics.field1182 = new int[var4];
            Statics.field2433 = new int[var4];
            Statics.field10 = new byte[var4][];
            Statics.field1127 = new byte[var4][];
            boolean var7 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var7 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field3126[var8] = var11;
                        Statics.field1182[var8] = Statics.field48.method4001("m" + var9 + "_" + var10);
                        Statics.field2433[var8] = Statics.field48.method4001("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2455(var3, var2, true);
            return;
        }
        int var12 = arg1.method5285();
        boolean var13 = arg1.method5332() == 1;
        int var14 = arg1.method5283();
        int var15 = arg1.method5247();
        arg1.method5193();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5194(1);
                    if (var19 == 1) {
                        field724[var16][var17][var18] = arg1.method5194(26);
                    } else {
                        field724[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5195();
        Statics.field3882 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field3882[var20][var21] = arg1.method5455();
            }
        }
        Statics.field3126 = new int[var15];
        Statics.field1182 = new int[var15];
        Statics.field2433 = new int[var15];
        Statics.field10 = new byte[var15][];
        Statics.field1127 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field724[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field3126[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field3126[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1182[var22] = Statics.field48.method4001("m" + var31 + "_" + var32);
                            Statics.field2433[var22] = Statics.field48.method4001("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2455(var14, var12, !var13);
    }

    @ObfuscatedName("dh.ho(IIZI)V")
    public static final void method2455(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field25 == arg0 && Statics.field285 == arg1) {
            return;
        }
        Statics.field25 = arg0;
        Statics.field285 = arg1;
        method1104(25);
        method331(class234.field2798, true);
        int var3 = Statics.field109;
        int var4 = Statics.field3212;
        Statics.field109 = (arg0 - 6) * 8;
        Statics.field3212 = (arg1 - 6) * 8;
        int var5 = Statics.field109 - var3;
        int var6 = Statics.field3212 - var4;
        int var7 = Statics.field109;
        int var8 = Statics.field3212;
        for (int var9 = 0; var9 < 32768; var9++) {
            class89 var10 = field722[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1009[var11] -= var5;
                    var10.field986[var11] -= var6;
                }
                var10.field957 -= var5 * 128;
                var10.field954 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class76 var13 = field671[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1009[var14] -= var5;
                    var13.field986[var14] -= var6;
                }
                var13.field957 -= var5 * 128;
                var13.field954 -= var6 * 128;
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
                        field793[var25][var21][var22] = field793[var25][var23][var24];
                    } else {
                        field793[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class78 var26 = (class78) field694.method4721(); var26 != null; var26 = (class78) field694.method4706()) {
            var26.field942 -= var5;
            var26.field941 -= var6;
            if (var26.field942 < 0 || var26.field941 < 0 || var26.field942 >= 104 || var26.field941 >= 104) {
                var26.method3486();
            }
        }
        if (field895 != 0) {
            field895 -= var5;
            field789 -= var6;
        }
        field878 = 0;
        field907 = false;
        Statics.field1261 -= var5 << 7;
        Statics.field1102 -= var6 << 7;
        Statics.field1021 -= var5 << 7;
        Statics.field625 -= var6 << 7;
        field890 = -1;
        field796.method4709();
        field795.method4709();
        for (int var27 = 0; var27 < 4; var27++) {
            field772[var27].method3440();
        }
    }

    @ObfuscatedName("cr.ha(ZS)V")
    public static final void method2002(boolean arg0) {
        method3319();
        field751.field1324++;
        if (field751.field1324 < 50 && !arg0) {
            return;
        }
        field751.field1324 = 0;
        if (field713 || field751.method2240() == null) {
            return;
        }
        class197 var1 = class197.method434(class193.field2306, field751.field1333);
        field751.method2239(var1);
        try {
            field751.method2229();
        } catch (IOException var3) {
            field713 = true;
        }
    }

    @ObfuscatedName("at.he(I)V")
    public static final void method332() {
        method2002(false);
        field786 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field10.length; var1++) {
            if (Statics.field1182[var1] != -1 && Statics.field10[var1] == null) {
                Statics.field10[var1] = Statics.field48.method4032(Statics.field1182[var1], 0);
                if (Statics.field10[var1] == null) {
                    var0 = false;
                    field786++;
                }
            }
            if (Statics.field2433[var1] != -1 && Statics.field1127[var1] == null) {
                Statics.field1127[var1] = Statics.field48.method3984(Statics.field2433[var1], 0, Statics.field3882[var1]);
                if (Statics.field1127[var1] == null) {
                    var0 = false;
                    field786++;
                }
            }
        }
        if (!var0) {
            field721 = 1;
            return;
        }
        field719 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field10.length; var3++) {
            byte[] var4 = Statics.field1127[var3];
            if (var4 != null) {
                int var5 = (Statics.field3126[var3] >> 8) * 64 - Statics.field109;
                int var6 = (Statics.field3126[var3] & 0xFF) * 64 - Statics.field3212;
                if (field723) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class311 var9 = new class311(var4);
                int var10 = -1;
                label1073: while (true) {
                    int var11 = var9.method5260();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method5259();
                            if (var16 == 0) {
                                continue label1073;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method5310() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class265 var22 = class265.method668(var10);
                                if (var19 != 22 || !field666 || var22.field3400 != 0 || var22.field3398 == 1 || var22.field3419) {
                                    if (!var22.method4427()) {
                                        field719++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method5259();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method5310();
                    }
                }
            }
        }
        if (!var2) {
            field721 = 2;
            return;
        }
        if (field721 != 0) {
            method331(class234.field2798 + class91.field1165 + class91.field1169 + 100 + "%" + class91.field1163, true);
        }
        method3319();
        Statics.field2034.method3003();
        for (int var23 = 0; var23 < 4; var23++) {
            field772[var23].method3440();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class65.field516[var24][var25][var26] = 0;
                }
            }
        }
        method3319();
        class65.method801();
        int var27 = Statics.field10.length;
        for (class85 var28 = (class85) class85.field1101.method4721(); var28 != null; var28 = (class85) class85.field1101.method4706()) {
            if (var28.field1105 != null) {
                Statics.field3325.method2284(var28.field1105);
                var28.field1105 = null;
            }
            if (var28.field1100 != null) {
                Statics.field3325.method2284(var28.field1100);
                var28.field1100 = null;
            }
        }
        class85.field1101.method4709();
        method2002(true);
        if (!field723) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field3126[var29] >> 8) * 64 - Statics.field109;
                int var31 = (Statics.field3126[var29] & 0xFF) * 64 - Statics.field3212;
                byte[] var32 = Statics.field10[var29];
                if (var32 != null) {
                    method3319();
                    Statics.method3171(var32, var30, var31, Statics.field25 * 8 - 48, Statics.field285 * 8 - 48, field772);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field3126[var33] >> 8) * 64 - Statics.field109;
                int var35 = (Statics.field3126[var33] & 0xFF) * 64 - Statics.field3212;
                byte[] var36 = Statics.field10[var33];
                if (var36 == null && Statics.field285 < 800) {
                    method3319();
                    class65.method41(var34, var35, 64, 64);
                }
            }
            method2002(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field1127[var37];
                if (var38 != null) {
                    int var39 = (Statics.field3126[var37] >> 8) * 64 - Statics.field109;
                    int var40 = (Statics.field3126[var37] & 0xFF) * 64 - Statics.field3212;
                    method3319();
                    class143 var41 = Statics.field2034;
                    class182[] var42 = field772;
                    class311 var43 = new class311(var38);
                    int var44 = -1;
                    while (true) {
                        int var45 = var43.method5260();
                        if (var45 == 0) {
                            break;
                        }
                        var44 += var45;
                        int var46 = 0;
                        while (true) {
                            int var47 = var43.method5259();
                            if (var47 == 0) {
                                break;
                            }
                            var46 += var47 - 1;
                            int var48 = var46 & 0x3F;
                            int var49 = var46 >> 6 & 0x3F;
                            int var50 = var46 >> 12;
                            int var51 = var43.method5310();
                            int var52 = var51 >> 2;
                            int var53 = var51 & 0x3;
                            int var54 = var39 + var49;
                            int var55 = var40 + var48;
                            if (var54 > 0 && var55 > 0 && var54 < 103 && var55 < 103) {
                                int var56 = var50;
                                if ((class65.field516[1][var54][var55] & 0x2) == 2) {
                                    var56 = var50 - 1;
                                }
                                class182 var57 = null;
                                if (var56 >= 0) {
                                    var57 = var42[var56];
                                }
                                class65.method996(var50, var54, var55, var44, var53, var52, var41, var57);
                            }
                        }
                    }
                }
            }
        }
        if (field723) {
            for (int var58 = 0; var58 < 4; var58++) {
                method3319();
                for (int var59 = 0; var59 < 13; var59++) {
                    for (int var60 = 0; var60 < 13; var60++) {
                        boolean var61 = false;
                        int var62 = field724[var58][var59][var60];
                        if (var62 != -1) {
                            int var63 = var62 >> 24 & 0x3;
                            int var64 = var62 >> 1 & 0x3;
                            int var65 = var62 >> 14 & 0x3FF;
                            int var66 = var62 >> 3 & 0x7FF;
                            int var67 = (var65 / 8 << 8) + var66 / 8;
                            for (int var68 = 0; var68 < Statics.field3126.length; var68++) {
                                if (Statics.field3126[var68] == var67 && Statics.field10[var68] != null) {
                                    class65.method654(Statics.field10[var68], var58, var59 * 8, var60 * 8, var63, (var65 & 0x7) * 8, (var66 & 0x7) * 8, var64, field772);
                                    var61 = true;
                                    break;
                                }
                            }
                        }
                        if (!var61) {
                            int var69 = var58;
                            int var70 = var59 * 8;
                            int var71 = var60 * 8;
                            for (int var72 = 0; var72 < 8; var72++) {
                                for (int var73 = 0; var73 < 8; var73++) {
                                    class65.field525[var69][var70 + var72][var71 + var73] = 0;
                                }
                            }
                            if (var70 > 0) {
                                for (int var74 = 1; var74 < 8; var74++) {
                                    class65.field525[var69][var70][var71 + var74] = class65.field525[var69][var70 - 1][var71 + var74];
                                }
                            }
                            if (var71 > 0) {
                                for (int var75 = 1; var75 < 8; var75++) {
                                    class65.field525[var69][var70 + var75][var71] = class65.field525[var69][var70 + var75][var71 - 1];
                                }
                            }
                            if (var70 > 0 && class65.field525[var69][var70 - 1][var71] != 0) {
                                class65.field525[var69][var70][var71] = class65.field525[var69][var70 - 1][var71];
                            } else if (var71 > 0 && class65.field525[var69][var70][var71 - 1] != 0) {
                                class65.field525[var69][var70][var71] = class65.field525[var69][var70][var71 - 1];
                            } else if (var70 > 0 && var71 > 0 && class65.field525[var69][var70 - 1][var71 - 1] != 0) {
                                class65.field525[var69][var70][var71] = class65.field525[var69][var70 - 1][var71 - 1];
                            }
                        }
                    }
                }
            }
            for (int var76 = 0; var76 < 13; var76++) {
                for (int var77 = 0; var77 < 13; var77++) {
                    int var78 = field724[0][var76][var77];
                    if (var78 == -1) {
                        class65.method41(var76 * 8, var77 * 8, 8, 8);
                    }
                }
            }
            method2002(true);
            for (int var79 = 0; var79 < 4; var79++) {
                method3319();
                for (int var80 = 0; var80 < 13; var80++) {
                    for (int var81 = 0; var81 < 13; var81++) {
                        int var82 = field724[var79][var80][var81];
                        if (var82 != -1) {
                            int var83 = var82 >> 24 & 0x3;
                            int var84 = var82 >> 1 & 0x3;
                            int var85 = var82 >> 14 & 0x3FF;
                            int var86 = var82 >> 3 & 0x7FF;
                            int var87 = (var85 / 8 << 8) + var86 / 8;
                            for (int var88 = 0; var88 < Statics.field3126.length; var88++) {
                                if (Statics.field3126[var88] == var87 && Statics.field1127[var88] != null) {
                                    class65.method287(Statics.field1127[var88], var79, var80 * 8, var81 * 8, var83, (var85 & 0x7) * 8, (var86 & 0x7) * 8, var84, Statics.field2034, field772);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2002(true);
        method3319();
        class143 var89 = Statics.field2034;
        class182[] var90 = field772;
        for (int var91 = 0; var91 < 4; var91++) {
            for (int var92 = 0; var92 < 104; var92++) {
                for (int var93 = 0; var93 < 104; var93++) {
                    if ((class65.field516[var91][var92][var93] & 0x1) == 1) {
                        int var94 = var91;
                        if ((class65.field516[1][var92][var93] & 0x2) == 2) {
                            var94 = var91 - 1;
                        }
                        if (var94 >= 0) {
                            var90[var94].method3442(var92, var93);
                        }
                    }
                }
            }
        }
        class65.field519 += (int) (Math.random() * 5.0D) - 2;
        if (class65.field519 < -8) {
            class65.field519 = -8;
        }
        if (class65.field519 > 8) {
            class65.field519 = 8;
        }
        class65.field529 += (int) (Math.random() * 5.0D) - 2;
        if (class65.field529 < -16) {
            class65.field529 = -16;
        }
        if (class65.field529 > 16) {
            class65.field529 = 16;
        }
        for (int var95 = 0; var95 < 4; var95++) {
            byte[][] var96 = Statics.field2046[var95];
            int var97 = (int) Math.sqrt(5100.0D);
            int var98 = var97 * 768 >> 8;
            for (int var99 = 1; var99 < 103; var99++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    int var101 = class65.field525[var95][var100 + 1][var99] - class65.field525[var95][var100 - 1][var99];
                    int var102 = class65.field525[var95][var100][var99 + 1] - class65.field525[var95][var100][var99 - 1];
                    int var103 = (int) Math.sqrt((double) (var102 * var102 + var101 * var101 + 65536));
                    int var104 = (var101 << 8) / var103;
                    int var105 = 65536 / var103;
                    int var106 = (var102 << 8) / var103;
                    int var107 = (var106 * -50 + var104 * -50 + var105 * -10) / var98 + 96;
                    int var108 = (var96[var100][var99] >> 1) + (var96[var100][var99 + 1] >> 3) + (var96[var100][var99 - 1] >> 2) + (var96[var100 - 1][var99] >> 2) + (var96[var100 + 1][var99] >> 3);
                    Statics.field258[var100][var99] = var107 - var108;
                }
            }
            for (int var109 = 0; var109 < 104; var109++) {
                Statics.field119[var109] = 0;
                Statics.field523[var109] = 0;
                Statics.field268[var109] = 0;
                Statics.field2053[var109] = 0;
                Statics.field293[var109] = 0;
            }
            for (int var110 = -5; var110 < 109; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    int var112 = var110 + 5;
                    int var10002;
                    if (var112 >= 0 && var112 < 104) {
                        int var113 = Statics.field518[var95][var112][var111] & 0xFF;
                        if (var113 > 0) {
                            class256 var114 = class256.method738(var113 - 1);
                            Statics.field119[var111] += var114.field3292;
                            Statics.field523[var111] += var114.field3289;
                            Statics.field268[var111] += var114.field3294;
                            Statics.field2053[var111] += var114.field3295;
                            var10002 = Statics.field293[var111]++;
                        }
                    }
                    int var115 = var110 - 5;
                    if (var115 >= 0 && var115 < 104) {
                        int var116 = Statics.field518[var95][var115][var111] & 0xFF;
                        if (var116 > 0) {
                            class256 var117 = class256.method738(var116 - 1);
                            Statics.field119[var111] -= var117.field3292;
                            Statics.field523[var111] -= var117.field3289;
                            Statics.field268[var111] -= var117.field3294;
                            Statics.field2053[var111] -= var117.field3295;
                            var10002 = Statics.field293[var111]--;
                        }
                    }
                }
                if (var110 >= 1 && var110 < 103) {
                    int var118 = 0;
                    int var119 = 0;
                    int var120 = 0;
                    int var121 = 0;
                    int var122 = 0;
                    for (int var123 = -5; var123 < 109; var123++) {
                        int var124 = var123 + 5;
                        if (var124 >= 0 && var124 < 104) {
                            var118 += Statics.field119[var124];
                            var119 += Statics.field523[var124];
                            var120 += Statics.field268[var124];
                            var121 += Statics.field2053[var124];
                            var122 += Statics.field293[var124];
                        }
                        int var125 = var123 - 5;
                        if (var125 >= 0 && var125 < 104) {
                            var118 -= Statics.field119[var125];
                            var119 -= Statics.field523[var125];
                            var120 -= Statics.field268[var125];
                            var121 -= Statics.field2053[var125];
                            var122 -= Statics.field293[var125];
                        }
                        if (var123 >= 1 && var123 < 103 && (!field666 || (class65.field516[0][var110][var123] & 0x2) != 0 || (class65.field516[var95][var110][var123] & 0x10) == 0)) {
                            if (var95 < class65.field517) {
                                class65.field517 = var95;
                            }
                            int var126 = Statics.field518[var95][var110][var123] & 0xFF;
                            int var127 = Statics.field2400[var95][var110][var123] & 0xFF;
                            if (var126 > 0 || var127 > 0) {
                                int var128 = class65.field525[var95][var110][var123];
                                int var129 = class65.field525[var95][var110 + 1][var123];
                                int var130 = class65.field525[var95][var110 + 1][var123 + 1];
                                int var131 = class65.field525[var95][var110][var123 + 1];
                                int var132 = Statics.field258[var110][var123];
                                int var133 = Statics.field258[var110 + 1][var123];
                                int var134 = Statics.field258[var110 + 1][var123 + 1];
                                int var135 = Statics.field258[var110][var123 + 1];
                                int var136 = -1;
                                int var137 = -1;
                                if (var126 > 0) {
                                    int var138 = var118 * 256 / var121;
                                    int var139 = var119 / var122;
                                    int var140 = var120 / var122;
                                    var136 = Statics.method1977(var138, var139, var140);
                                    int var141 = class65.field519 + var138 & 0xFF;
                                    int var142 = class65.field529 + var140;
                                    if (var142 < 0) {
                                        var142 = 0;
                                    } else if (var142 > 255) {
                                        var142 = 255;
                                    }
                                    var137 = Statics.method1977(var141, var139, var142);
                                }
                                if (var95 > 0) {
                                    boolean var143 = true;
                                    if (var126 == 0 && Statics.field531[var95][var110][var123] != 0) {
                                        var143 = false;
                                    }
                                    if (var127 > 0 && !class269.method3187(var127 - 1).field3541) {
                                        var143 = false;
                                    }
                                    if (var143 && var128 == var129 && var128 == var130 && var128 == var131) {
                                        Statics.field13[var95][var110][var123] |= 0x924;
                                    }
                                }
                                int var144 = 0;
                                if (var137 != -1) {
                                    var144 = class140.field1796[class65.method3189(var137, 96)];
                                }
                                if (var127 == 0) {
                                    var89.method3055(var95, var110, var123, 0, 0, -1, var128, var129, var130, var131, class65.method3189(var136, var132), class65.method3189(var136, var133), class65.method3189(var136, var134), class65.method3189(var136, var135), 0, 0, 0, 0, var144, 0);
                                } else {
                                    int var145 = Statics.field531[var95][var110][var123] + 1;
                                    byte var146 = Statics.field2[var95][var110][var123];
                                    class269 var147 = class269.method3187(var127 - 1);
                                    int var148 = var147.field3539;
                                    int var149;
                                    int var150;
                                    if (var148 >= 0) {
                                        var149 = Statics.field1777.method2677(var148);
                                        var150 = -1;
                                    } else if (var147.field3536 == 16711935) {
                                        var150 = -2;
                                        var148 = -1;
                                        var149 = -2;
                                    } else {
                                        var150 = Statics.method1977(var147.field3542, var147.field3543, var147.field3537);
                                        int var151 = class65.field519 + var147.field3542 & 0xFF;
                                        int var152 = class65.field529 + var147.field3537;
                                        if (var152 < 0) {
                                            var152 = 0;
                                        } else if (var152 > 255) {
                                            var152 = 255;
                                        }
                                        var149 = Statics.method1977(var151, var147.field3543, var152);
                                    }
                                    int var153 = 0;
                                    if (var149 != -2) {
                                        var153 = class140.field1796[class65.method1088(var149, 96)];
                                    }
                                    if (var147.field3538 != -1) {
                                        int var154 = class65.field519 + var147.field3547 & 0xFF;
                                        int var155 = class65.field529 + var147.field3544;
                                        if (var155 < 0) {
                                            var155 = 0;
                                        } else if (var155 > 255) {
                                            var155 = 255;
                                        }
                                        int var156 = Statics.method1977(var154, var147.field3546, var155);
                                        var153 = class140.field1796[class65.method1088(var156, 96)];
                                    }
                                    var89.method3055(var95, var110, var123, var145, var146, var148, var128, var129, var130, var131, class65.method3189(var136, var132), class65.method3189(var136, var133), class65.method3189(var136, var134), class65.method3189(var136, var135), class65.method1088(var150, var132), class65.method1088(var150, var133), class65.method1088(var150, var134), class65.method1088(var150, var135), var144, var153);
                                }
                            }
                        }
                    }
                }
            }
            for (int var157 = 1; var157 < 103; var157++) {
                for (int var158 = 1; var158 < 103; var158++) {
                    var89.method3007(var95, var158, var157, class65.method227(var95, var158, var157));
                }
            }
            Statics.field518[var95] = (byte[][]) null;
            Statics.field2400[var95] = (byte[][]) null;
            Statics.field531[var95] = (byte[][]) null;
            Statics.field2[var95] = (byte[][]) null;
            Statics.field2046[var95] = (byte[][]) null;
        }
        var89.method3023(-50, -10, -50);
        for (int var159 = 0; var159 < 104; var159++) {
            for (int var160 = 0; var160 < 104; var160++) {
                if ((class65.field516[1][var159][var160] & 0x2) == 2) {
                    var89.method3112(var159, var160);
                }
            }
        }
        int var161 = 1;
        int var162 = 2;
        int var163 = 4;
        for (int var164 = 0; var164 < 4; var164++) {
            if (var164 > 0) {
                var161 <<= 0x3;
                var162 <<= 0x3;
                var163 <<= 0x3;
            }
            for (int var165 = 0; var165 <= var164; var165++) {
                for (int var166 = 0; var166 <= 104; var166++) {
                    for (int var167 = 0; var167 <= 104; var167++) {
                        if ((Statics.field13[var165][var167][var166] & var161) != 0) {
                            int var168 = var166;
                            int var169 = var166;
                            int var170 = var165;
                            int var171 = var165;
                            while (var168 > 0 && (Statics.field13[var165][var167][var168 - 1] & var161) != 0) {
                                var168--;
                            }
                            while (var169 < 104 && (Statics.field13[var165][var167][var169 + 1] & var161) != 0) {
                                var169++;
                            }
                            label639: while (var170 > 0) {
                                for (int var172 = var168; var172 <= var169; var172++) {
                                    if ((Statics.field13[var170 - 1][var167][var172] & var161) == 0) {
                                        break label639;
                                    }
                                }
                                var170--;
                            }
                            label628: while (var171 < var164) {
                                for (int var173 = var168; var173 <= var169; var173++) {
                                    if ((Statics.field13[var171 + 1][var167][var173] & var161) == 0) {
                                        break label628;
                                    }
                                }
                                var171++;
                            }
                            int var174 = (var171 + 1 - var170) * (var169 - var168 + 1);
                            if (var174 >= 8) {
                                short var175 = 240;
                                int var176 = class65.field525[var171][var167][var168] - var175;
                                int var177 = class65.field525[var170][var167][var168];
                                class143.method3006(var164, 1, var167 * 128, var167 * 128, var168 * 128, var169 * 128 + 128, var176, var177);
                                for (int var178 = var170; var178 <= var171; var178++) {
                                    for (int var179 = var168; var179 <= var169; var179++) {
                                        Statics.field13[var178][var167][var179] &= ~var161;
                                    }
                                }
                            }
                        }
                        if ((Statics.field13[var165][var167][var166] & var162) != 0) {
                            int var180 = var167;
                            int var181 = var167;
                            int var182 = var165;
                            int var183 = var165;
                            while (var180 > 0 && (Statics.field13[var165][var180 - 1][var166] & var162) != 0) {
                                var180--;
                            }
                            while (var181 < 104 && (Statics.field13[var165][var181 + 1][var166] & var162) != 0) {
                                var181++;
                            }
                            label692: while (var182 > 0) {
                                for (int var184 = var180; var184 <= var181; var184++) {
                                    if ((Statics.field13[var182 - 1][var184][var166] & var162) == 0) {
                                        break label692;
                                    }
                                }
                                var182--;
                            }
                            label681: while (var183 < var164) {
                                for (int var185 = var180; var185 <= var181; var185++) {
                                    if ((Statics.field13[var183 + 1][var185][var166] & var162) == 0) {
                                        break label681;
                                    }
                                }
                                var183++;
                            }
                            int var186 = (var183 + 1 - var182) * (var181 - var180 + 1);
                            if (var186 >= 8) {
                                short var187 = 240;
                                int var188 = class65.field525[var183][var180][var166] - var187;
                                int var189 = class65.field525[var182][var180][var166];
                                class143.method3006(var164, 2, var180 * 128, var181 * 128 + 128, var166 * 128, var166 * 128, var188, var189);
                                for (int var190 = var182; var190 <= var183; var190++) {
                                    for (int var191 = var180; var191 <= var181; var191++) {
                                        Statics.field13[var190][var191][var166] &= ~var162;
                                    }
                                }
                            }
                        }
                        if ((Statics.field13[var165][var167][var166] & var163) != 0) {
                            int var192 = var167;
                            int var193 = var167;
                            int var194 = var166;
                            int var195 = var166;
                            while (var194 > 0 && (Statics.field13[var165][var167][var194 - 1] & var163) != 0) {
                                var194--;
                            }
                            while (var195 < 104 && (Statics.field13[var165][var167][var195 + 1] & var163) != 0) {
                                var195++;
                            }
                            label745: while (var192 > 0) {
                                for (int var196 = var194; var196 <= var195; var196++) {
                                    if ((Statics.field13[var165][var192 - 1][var196] & var163) == 0) {
                                        break label745;
                                    }
                                }
                                var192--;
                            }
                            label734: while (var193 < 104) {
                                for (int var197 = var194; var197 <= var195; var197++) {
                                    if ((Statics.field13[var165][var193 + 1][var197] & var163) == 0) {
                                        break label734;
                                    }
                                }
                                var193++;
                            }
                            if ((var193 - var192 + 1) * (var195 - var194 + 1) >= 4) {
                                int var198 = class65.field525[var165][var192][var194];
                                class143.method3006(var164, 4, var192 * 128, var193 * 128 + 128, var194 * 128, var195 * 128 + 128, var198, var198);
                                for (int var199 = var192; var199 <= var193; var199++) {
                                    for (int var200 = var194; var200 <= var195; var200++) {
                                        Statics.field13[var165][var199][var200] &= ~var163;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method2002(true);
        int var201 = class65.field517;
        if (var201 > Statics.field1162) {
            var201 = Statics.field1162;
        }
        if (var201 < Statics.field1162 - 1) {
            int var202 = Statics.field1162 - 1;
        }
        if (field666) {
            Statics.field2034.method3004(class65.field517);
        } else {
            Statics.field2034.method3004(0);
        }
        for (int var203 = 0; var203 < 104; var203++) {
            for (int var204 = 0; var204 < 104; var204++) {
                method4406(var203, var204);
            }
        }
        method3319();
        for (class78 var205 = (class78) field694.method4721(); var205 != null; var205 = (class78) field694.method4706()) {
            if (var205.field951 == -1) {
                var205.field950 = 0;
                method4197(var205);
            } else {
                var205.method3486();
            }
        }
        class265.field3424.method3218();
        if (Statics.field7.method888()) {
            class197 var206 = class197.method434(class193.field2296, field751.field1333);
            var206.field2372.method5231(1057001181);
            field751.method2239(var206);
        }
        if (!field723) {
            int var207 = (Statics.field25 - 6) / 8;
            int var208 = (Statics.field25 + 6) / 8;
            int var209 = (Statics.field285 - 6) / 8;
            int var210 = (Statics.field285 + 6) / 8;
            for (int var211 = var207 - 1; var211 <= var208 + 1; var211++) {
                for (int var212 = var209 - 1; var212 <= var210 + 1; var212++) {
                    if (var211 < var207 || var211 > var208 || var212 < var209 || var212 > var210) {
                        Statics.field48.method4007("m" + var211 + "_" + var212);
                        Statics.field48.method4007("l" + var211 + "_" + var212);
                    }
                }
            }
        }
        method1104(30);
        method3319();
        class65.method209();
        class197 var213 = class197.method434(class193.field2278, field751.field1333);
        field751.method2239(var213);
        Statics.field262.method3365();
        for (int var214 = 0; var214 < 32; var214++) {
            field478[var214] = 0L;
        }
        for (int var215 = 0; var215 < 32; var215++) {
            field475[var215] = 0L;
        }
        Statics.field1771 = 0;
    }

    @ObfuscatedName("kk.hb(IIIIII)V")
    public static final void method4964(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field2034.method3015(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field2034.method3031(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class138.method2087(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field115.field3915;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class138.method229(var5);
            class265 var14 = class265.method668(var13);
            if (var14.field3410 == -1) {
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
                class335 var15 = Statics.field315[var14.field3410];
                if (var15 != null) {
                    int var16 = (var14.field3396 * 4 - var15.field3908) / 2;
                    int var17 = (var14.field3397 * 4 - var15.field3905) / 2;
                    var15.method5806(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3397) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field2034.method3029(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field2034.method3031(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class138.method229(var18);
            class265 var24 = class265.method668(var23);
            if (var24.field3410 != -1) {
                class335 var25 = Statics.field315[var24.field3410];
                if (var25 != null) {
                    int var26 = (var24.field3396 * 4 - var25.field3908) / 2;
                    int var27 = (var24.field3397 * 4 - var25.field3905) / 2;
                    var25.method5806(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3397) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class138.method2087(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field115.field3915;
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
        long var31 = Statics.field2034.method3030(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class138.method229(var31);
        class265 var34 = class265.method668(var33);
        if (var34.field3410 == -1) {
            return;
        }
        class335 var35 = Statics.field315[var34.field3410];
        if (var35 != null) {
            int var36 = (var34.field3396 * 4 - var35.field3908) / 2;
            int var37 = (var34.field3397 * 4 - var35.field3905) / 2;
            var35.method5806(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3397) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hs(Ldx;B)Z")
    public final boolean method1543(class105 arg0) {
        class316 var2 = arg0.method2240();
        class310 var3 = arg0.field1327;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1326 == null) {
                if (arg0.field1328) {
                    if (!var2.method3418(1)) {
                        return false;
                    }
                    var2.method3428(arg0.field1327.field3746, 0, 1);
                    arg0.field1331 = 0;
                    arg0.field1328 = false;
                }
                var3.field3747 = 0;
                if (var3.method5190()) {
                    if (!var2.method3418(1)) {
                        return false;
                    }
                    var2.method3428(arg0.field1327.field3746, 1, 1);
                    arg0.field1331 = 0;
                }
                arg0.field1328 = true;
                class192[] var4 = class192.method578();
                int var5 = var3.method5201();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3747);
                }
                arg0.field1326 = var4[var5];
                arg0.field1329 = arg0.field1326.field2229;
            }
            if (arg0.field1329 == -1) {
                if (!var2.method3418(1)) {
                    return false;
                }
                arg0.method2240().method3428(var3.field3746, 0, 1);
                arg0.field1329 = var3.field3746[0] & 0xFF;
            }
            if (arg0.field1329 == -2) {
                if (!var2.method3418(2)) {
                    return false;
                }
                arg0.method2240().method3428(var3.field3746, 0, 2);
                var3.field3747 = 0;
                arg0.field1329 = var3.method5247();
            }
            if (!var2.method3418(arg0.field1329)) {
                return false;
            }
            var3.field3747 = 0;
            var2.method3428(var3.field3746, 0, arg0.field1329);
            arg0.field1331 = 0;
            field693.method4812();
            arg0.field1335 = arg0.field1334;
            arg0.field1334 = arg0.field1332;
            arg0.field1332 = arg0.field1326;
            if (class192.field2165 == arg0.field1326) {
                int var6 = var3.method5455();
                int var7 = var3.method5283();
                class222.field2555[var7] = var6;
                if (class222.field2556[var7] != var6) {
                    class222.field2556[var7] = var6;
                }
                method615(var7);
                field856[++field768 - 1 & 0x1F] = var7;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2214 == arg0.field1326) {
                method2249(class195.field2351);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2215 == arg0.field1326) {
                method3496(var3.method5465());
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2184 == arg0.field1326) {
                method2249(class195.field2347);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2161 == arg0.field1326) {
                Statics.field574.method1814(var3, arg0.field1329);
                field858 = field850;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2206 == arg0.field1326) {
                field907 = true;
                Statics.field139 = var3.method5310();
                Statics.field103 = var3.method5310();
                Statics.field1810 = var3.method5247();
                Statics.field381 = var3.method5310();
                Statics.field2071 = var3.method5310();
                if (Statics.field2071 >= 100) {
                    int var8 = Statics.field139 * 128 + 64;
                    int var9 = Statics.field103 * 128 + 64;
                    int var10 = method576(var8, var9, Statics.field1162) - Statics.field1810;
                    int var11 = var8 - Statics.field1261;
                    int var12 = var10 - Statics.field555;
                    int var13 = var9 - Statics.field1102;
                    int var14 = (int) Math.sqrt((double) (var11 * var11 + var13 * var13));
                    Statics.field428 = (int) (Math.atan2((double) var12, (double) var14) * 325.949D) & 0x7FF;
                    Statics.field287 = (int) (Math.atan2((double) var11, (double) var13) * -325.949D) & 0x7FF;
                    if (Statics.field428 < 128) {
                        Statics.field428 = 128;
                    }
                    if (Statics.field428 > 383) {
                        Statics.field428 = 383;
                    }
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2207 == arg0.field1326) {
                int var15 = var3.method5247();
                int var16 = var3.method5310();
                int var17 = var3.method5247();
                method798(var15, var16, var17);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2171 == arg0.field1326) {
                int var18 = var3.method5285();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = var3.method5451();
                int var20 = var3.method5455();
                class227 var21 = class227.method3963(var20);
                if (var21.field2593) {
                    var21.field2677 = var18;
                    var21.field2721 = var19;
                    class266 var23 = class266.method4793(var18);
                    var21.field2645 = var23.field3449;
                    var21.field2646 = var23.field3450;
                    var21.field2662 = var23.field3451;
                    var21.field2643 = var23.field3481;
                    var21.field2627 = var23.field3466;
                    var21.field2648 = var23.field3434;
                    if (var23.field3443 == 1) {
                        var21.field2653 = 1;
                    } else {
                        var21.field2653 = 2;
                    }
                    if (var21.field2649 > 0) {
                        var21.field2648 = var21.field2648 * 32 / var21.field2649;
                    } else if (var21.field2605 > 0) {
                        var21.field2648 = var21.field2648 * 32 / var21.field2605;
                    }
                    method5979(var21);
                } else if (var18 == -1) {
                    var21.field2637 = 0;
                    arg0.field1326 = null;
                    return true;
                } else {
                    class266 var22 = class266.method4793(var18);
                    var21.field2637 = 4;
                    var21.field2683 = var18;
                    var21.field2645 = var22.field3449;
                    var21.field2646 = var22.field3450;
                    var21.field2648 = var22.field3434 * 100 / var19;
                    method5979(var21);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2154 == arg0.field1326) {
                boolean var24 = var3.method5276() == 1;
                int var25 = var3.method5455();
                class227 var26 = class227.method3963(var25);
                if (var26.field2614 != var24) {
                    var26.field2614 = var24;
                    method5979(var26);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2150 == arg0.field1326) {
                int var27 = var3.method5284();
                int var28 = var3.method5283();
                int var29 = var3.method5283();
                int var30 = var3.method5451();
                class227 var31 = class227.method3963(var30);
                if (var31.field2645 != var28 || var31.field2646 != var29 || var31.field2648 != var27) {
                    var31.field2645 = var28;
                    var31.field2646 = var29;
                    var31.field2648 = var27;
                    method5979(var31);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2159 == arg0.field1326) {
                method2249(class195.field2352);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2211 == arg0.field1326) {
                int var32 = var3.method5226();
                int var33 = var3.method5286();
                int var34 = var3.method5455();
                class227 var35 = class227.method3963(var34);
                if (var35.field2691 != var33 || var35.field2652 != var32 || var35.field2599 != 0 || var35.field2671 != 0) {
                    var35.field2691 = var33;
                    var35.field2652 = var32;
                    var35.field2599 = 0;
                    var35.field2671 = 0;
                    method5979(var35);
                    this.method1308(var35);
                    if (var35.field2596 == 0) {
                        method3478(Statics.field3836[var34 >> 16], var35, false);
                    }
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2176 == arg0.field1326) {
                int var36 = var3.method5247();
                int var37 = var3.method5295();
                int var38 = var3.method5310();
                class71 var39 = (class71) field826.method5682((long) var37);
                if (var39 != null) {
                    method162(var39, var39.field577 != var36);
                }
                method3807(var37, var36, var38);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2222 == arg0.field1326) {
                method2267(true, arg0.field1327);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2182 == arg0.field1326) {
                String var40 = var3.method5465();
                String var41 = class307.method5122(class302.method3205(class220.method3388(var3)));
                class101.method314(6, var40, var41);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2172 == arg0.field1326) {
                int var42 = var3.method5259();
                boolean var43 = var3.method5310() == 1;
                String var44 = "";
                boolean var45 = false;
                if (var43) {
                    var44 = var3.method5465();
                    if (Statics.field574.method1818(new class294(var44, Statics.field617))) {
                        var45 = true;
                    }
                }
                String var46 = var3.method5465();
                if (!var45) {
                    class101.method314(var42, var44, var46);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2197 == arg0.field1326) {
                class81 var47 = new class81();
                var47.field1035 = var3.method5465();
                var47.field1033 = var3.method5247();
                int var48 = var3.method5455();
                var47.field1028 = var48;
                method1104(45);
                var2.method3413();
                Object var49 = null;
                class95.method2224(var47);
                arg0.field1326 = null;
                return false;
            }
            if (class192.field2199 == arg0.field1326) {
                int var50 = var3.method5310();
                int var51 = var3.method5310();
                int var52 = var3.method5310();
                int var53 = var3.method5310();
                field908[var50] = true;
                field909[var50] = var51;
                field910[var50] = var52;
                field800[var50] = var53;
                field912[var50] = 0;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2145 == arg0.field1326) {
                for (int var54 = 0; var54 < Statics.field444; var54++) {
                    class252 var55 = class252.method3559(var54);
                    if (var55 != null) {
                        class222.field2555[var54] = 0;
                        class222.field2556[var54] = 0;
                    }
                }
                method3806();
                field768 += 32;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2225 == arg0.field1326) {
                method2249(class195.field2356);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2181 == arg0.field1326) {
                Statics.field83 = var3.method5310();
                Statics.field104 = var3.method5273();
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2220 == arg0.field1326) {
                field895 = var3.method5310();
                if (field895 == 255) {
                    field895 = 0;
                }
                field789 = var3.method5310();
                if (field789 == 255) {
                    field789 = 0;
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2142 == arg0.field1326) {
                int var56 = var3.method5451();
                int var57 = var3.method5285();
                int var58 = var57 >> 10 & 0x1F;
                int var59 = var57 >> 5 & 0x1F;
                int var60 = var57 & 0x1F;
                int var61 = (var60 << 3) + (var58 << 19) + (var59 << 11);
                class227 var62 = class227.method3963(var56);
                if (var62.field2619 != var61) {
                    var62.field2619 = var61;
                    method5979(var62);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2196 == arg0.field1326) {
                int var63 = arg0.field1329 + var3.field3747;
                int var64 = var3.method5247();
                int var65 = var3.method5247();
                if (field827 != var64) {
                    field827 = var64;
                    this.method1259(false);
                    method127(field827);
                    class86.method2467(field827);
                    for (int var66 = 0; var66 < 100; var66++) {
                        field817[var66] = true;
                    }
                }
                while (var65-- > 0) {
                    int var67 = var3.method5455();
                    int var68 = var3.method5247();
                    int var69 = var3.method5310();
                    class71 var70 = (class71) field826.method5682((long) var67);
                    if (var70 != null && var70.field577 != var68) {
                        method162(var70, true);
                        var70 = null;
                    }
                    if (var70 == null) {
                        var70 = method3807(var67, var68, var69);
                    }
                    var70.field576 = true;
                }
                for (class71 var71 = (class71) field826.method5684(); var71 != null; var71 = (class71) field826.method5685()) {
                    if (var71.field576) {
                        var71.field576 = false;
                    } else {
                        method162(var71, true);
                    }
                }
                field867 = new class329(512);
                while (var3.field3747 < var63) {
                    int var72 = var3.method5455();
                    int var73 = var3.method5247();
                    int var74 = var3.method5247();
                    int var75 = var3.method5455();
                    for (int var76 = var73; var76 <= var74; var76++) {
                        long var77 = ((long) var72 << 32) + (long) var76;
                        field867.method5683(new class189(var75), var77);
                    }
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2180 == arg0.field1326) {
                Statics.field83 = var3.method5332();
                Statics.field104 = var3.method5310();
                while (var3.field3747 < arg0.field1329) {
                    int var79 = var3.method5310();
                    class195 var80 = class195.method66()[var79];
                    method2249(var80);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2218 == arg0.field1326) {
                int var81 = var3.method5455();
                class71 var82 = (class71) field826.method5682((long) var81);
                if (var82 != null) {
                    method162(var82, true);
                }
                if (field831 != null) {
                    method5979(field831);
                    field831 = null;
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2202 == arg0.field1326) {
                int var83 = var3.method5310();
                method433(var83);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2212 == arg0.field1326) {
                method1093();
                arg0.field1326 = null;
                return false;
            }
            if (class192.field2224 == arg0.field1326) {
                field888 = var3.method5310();
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2152 == arg0.field1326) {
                for (int var84 = 0; var84 < class222.field2556.length; var84++) {
                    if (class222.field2556[var84] != class222.field2555[var84]) {
                        class222.field2556[var84] = class222.field2555[var84];
                        method615(var84);
                        field856[++field768 - 1 & 0x1F] = var84;
                    }
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2183 == arg0.field1326) {
                Statics.field83 = var3.method5273();
                Statics.field104 = var3.method5276();
                for (int var85 = Statics.field83; var85 < Statics.field83 + 8; var85++) {
                    for (int var86 = Statics.field104; var86 < Statics.field104 + 8; var86++) {
                        if (field793[Statics.field1162][var85][var86] != null) {
                            field793[Statics.field1162][var85][var86] = null;
                            method4406(var85, var86);
                        }
                    }
                }
                for (class78 var87 = (class78) field694.method4721(); var87 != null; var87 = (class78) field694.method4706()) {
                    if (var87.field942 >= Statics.field83 && var87.field942 < Statics.field83 + 8 && var87.field941 >= Statics.field104 && var87.field941 < Statics.field104 + 8 && Statics.field1162 == var87.field948) {
                        var87.field951 = 0;
                    }
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2179 == arg0.field1326) {
                if (field827 != -1) {
                    method3943(field827, 0);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2177 == arg0.field1326) {
                int var88 = var3.method5455();
                int var89 = var3.method5247();
                if (var88 < -70000) {
                    var89 += 32768;
                }
                class227 var90;
                if (var88 >= 0) {
                    var90 = class227.method3963(var88);
                } else {
                    var90 = null;
                }
                while (var3.field3747 < arg0.field1329) {
                    int var91 = var3.method5259();
                    int var92 = var3.method5247();
                    int var93 = 0;
                    if (var92 != 0) {
                        var93 = var3.method5310();
                        if (var93 == 255) {
                            var93 = var3.method5455();
                        }
                    }
                    if (var90 != null && var91 >= 0 && var91 < var90.field2631.length) {
                        var90.field2631[var91] = var92;
                        var90.field2674[var91] = var93;
                    }
                    class69.method437(var89, var91, var92 - 1, var93);
                }
                if (var90 != null) {
                    method5979(var90);
                }
                method3806();
                field836[++field871 - 1 & 0x1F] = var89 & 0x7FFF;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2194 == arg0.field1326) {
                method3806();
                field832 = var3.method5310();
                field862 = field850;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2147 == arg0.field1326) {
                method3477(true, var3);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2156 == arg0.field1326) {
                int var94 = var3.method5451();
                int var95 = var3.method5287();
                class227 var96 = class227.method3963(var94);
                if (var96.field2641 != var95 || var95 == -1) {
                    var96.field2641 = var95;
                    var96.field2722 = 0;
                    var96.field2696 = 0;
                    method5979(var96);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2227 == arg0.field1326) {
                byte[] var97 = new byte[arg0.field1329];
                var3.method5198(var97, 0, var97.length);
                class311 var98 = new class311(var97);
                String var99 = var98.method5465();
                class61.method324(var99, true, false);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2226 == arg0.field1326) {
                int var100 = var3.method5247();
                if (var100 == 65535) {
                    var100 = -1;
                }
                method5567(var100);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2168 == arg0.field1326) {
                int var101 = var3.method5344();
                int var102 = var3.method5284();
                if (var102 == 65535) {
                    var102 = -1;
                }
                method2011(var102, var101);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2149 == arg0.field1326) {
                field681 = var3.method5285() * 30;
                field862 = field850;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2219 == arg0.field1326) {
                method2249(class195.field2353);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2210 == arg0.field1326) {
                int var103 = var3.method5451();
                int var104 = var3.method5283();
                if (var104 == 65535) {
                    var104 = -1;
                }
                int var105 = var3.method5247();
                if (var105 == 65535) {
                    var105 = -1;
                }
                int var106 = var3.method5294();
                for (int var107 = var105; var107 <= var104; var107++) {
                    long var108 = ((long) var106 << 32) + (long) var107;
                    class190 var110 = field867.method5682(var108);
                    if (var110 != null) {
                        var110.method3486();
                    }
                    field867.method5683(new class189(var103), var108);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2173 == arg0.field1326) {
                method2249(class195.field2349);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2221 == arg0.field1326) {
                method2249(class195.field2355);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2185 == arg0.field1326) {
                var3.field3747 += 28;
                if (var3.method5290()) {
                    method3494(var3, var3.field3747 - 28);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2157 == arg0.field1326) {
                String var111 = var3.method5465();
                long var112 = (long) var3.method5247();
                long var114 = (long) var3.method5263();
                class240 var116 = (class240) class205.method1123(class240.method1119(), var3.method5310());
                long var117 = (var112 << 32) + var114;
                boolean var119 = false;
                for (int var120 = 0; var120 < 100; var120++) {
                    if (field884[var120] == var117) {
                        var119 = true;
                        break;
                    }
                }
                if (Statics.field574.method1818(new class294(var111, Statics.field617))) {
                    var119 = true;
                }
                if (!var119 && field779 == 0) {
                    field884[field885] = var117;
                    field885 = (field885 + 1) % 100;
                    String var121 = class307.method5122(class302.method3205(class220.method3388(var3)));
                    byte var122;
                    if (var116.field3136) {
                        var122 = 7;
                    } else {
                        var122 = 3;
                    }
                    if (var116.field3132 == -1) {
                        class101.method314(var122, var111, var121);
                    } else {
                        class101.method314(var122, class91.method3300(var116.field3132) + var111, var121);
                    }
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2201 == arg0.field1326) {
                method3477(false, var3);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2203 == arg0.field1326) {
                int var123 = var3.method5455();
                int var124 = var3.method5455();
                int var125 = class63.method150();
                class197 var126 = class197.method434(class193.field2242, field751.field1333);
                var126.field2372.method5439(field459);
                var126.field2372.method5292(var123);
                var126.field2372.method5337(var124);
                var126.field2372.method5439(var125);
                field751.method2239(var126);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2163 == arg0.field1326) {
                String var127 = var3.method5465();
                int var128 = var3.method5273();
                int var129 = var3.method5273();
                if (var128 >= 1 && var128 <= 8) {
                    if (var127.equalsIgnoreCase(class234.field2795)) {
                        var127 = null;
                    }
                    field901[var128 - 1] = var127;
                    field790[var128 - 1] = var129 == 0;
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2153 == arg0.field1326) {
                int var130 = var3.method5310();
                method335(var130);
                arg0.field1326 = null;
                return false;
            }
            if (class192.field2158 == arg0.field1326) {
                field682 = var3.method5310();
                if (field682 == 1) {
                    field683 = var3.method5247();
                }
                if (field682 >= 2 && field682 <= 6) {
                    if (field682 == 2) {
                        field843 = 64;
                        field802 = 64;
                    }
                    if (field682 == 3) {
                        field843 = 0;
                        field802 = 64;
                    }
                    if (field682 == 4) {
                        field843 = 128;
                        field802 = 64;
                    }
                    if (field682 == 5) {
                        field843 = 64;
                        field802 = 0;
                    }
                    if (field682 == 6) {
                        field843 = 64;
                        field802 = 128;
                    }
                    field682 = 2;
                    field911 = var3.method5247();
                    field686 = var3.method5247();
                    field934 = var3.method5310();
                }
                if (field682 == 10) {
                    field684 = var3.method5247();
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2169 == arg0.field1326) {
                method3806();
                field833 = var3.method5226();
                field862 = field850;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2193 == arg0.field1326) {
                int var131 = var3.method5455();
                if (field747 != var131) {
                    field747 = var131;
                    method620();
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2175 == arg0.field1326) {
                int var132 = var3.method5295();
                class227 var133 = class227.method3963(var132);
                var133.field2637 = 3;
                var133.field2683 = Statics.field1986.field629.method3847();
                method5979(var133);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2204 == arg0.field1326) {
                int var134 = var3.method5285();
                class69.method438(var134);
                field836[++field871 - 1 & 0x1F] = var134 & 0x7FFF;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2143 == arg0.field1326) {
                int var135 = var3.method5455();
                int var136 = var3.method5247();
                if (var135 < -70000) {
                    var136 += 32768;
                }
                class227 var137;
                if (var135 >= 0) {
                    var137 = class227.method3963(var135);
                } else {
                    var137 = null;
                }
                if (var137 != null) {
                    for (int var138 = 0; var138 < var137.field2631.length; var138++) {
                        var137.field2631[var138] = 0;
                        var137.field2674[var138] = 0;
                    }
                }
                class69.method586(var136);
                int var139 = var3.method5247();
                for (int var140 = 0; var140 < var139; var140++) {
                    int var141 = var3.method5310();
                    if (var141 == 255) {
                        var141 = var3.method5295();
                    }
                    int var142 = var3.method5285();
                    if (var137 != null && var140 < var137.field2631.length) {
                        var137.field2631[var140] = var142;
                        var137.field2674[var140] = var141;
                    }
                    class69.method437(var136, var140, var142 - 1, var141);
                }
                if (var137 != null) {
                    method5979(var137);
                }
                method3806();
                field836[++field871 - 1 & 0x1F] = var136 & 0x7FFF;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2167 == arg0.field1326) {
                int var143 = var3.method5294();
                int var144 = var3.method5451();
                class71 var145 = (class71) field826.method5682((long) var144);
                class71 var146 = (class71) field826.method5682((long) var143);
                if (var146 != null) {
                    method162(var146, var145 == null || var145.field577 != var146.field577);
                }
                if (var145 != null) {
                    var145.method3486();
                    field826.method5683(var145, (long) var143);
                }
                class227 var147 = class227.method3963(var144);
                if (var147 != null) {
                    method5979(var147);
                }
                class227 var148 = class227.method3963(var143);
                if (var148 != null) {
                    method5979(var148);
                    method3478(Statics.field3836[var148.field2594 >>> 16], var148, true);
                }
                if (field827 != -1) {
                    method3943(field827, 1);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2223 == arg0.field1326) {
                byte var149 = var3.method5277();
                int var150 = var3.method5247();
                class222.field2555[var150] = var149;
                if (class222.field2556[var150] != var149) {
                    class222.field2556[var150] = var149;
                }
                method615(var150);
                field856[++field768 - 1 & 0x1F] = var150;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2200 == arg0.field1326) {
                String var151 = var3.method5465();
                Object[] var152 = new Object[var151.length() + 1];
                for (int var153 = var151.length() - 1; var153 >= 0; var153--) {
                    if (var151.charAt(var153) == 's') {
                        var152[var153 + 1] = var3.method5465();
                    } else {
                        var152[var153 + 1] = Integer.valueOf(var3.method5455());
                    }
                }
                var152[0] = Integer.valueOf(var3.method5455());
                class72 var154 = new class72();
                var154.field595 = var152;
                class86.method2227(var154);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2187 == arg0.field1326) {
                for (int var155 = 0; var155 < field671.length; var155++) {
                    if (field671[var155] != null) {
                        field671[var155].field998 = -1;
                    }
                }
                for (int var156 = 0; var156 < field722.length; var156++) {
                    if (field722[var156] != null) {
                        field722[var156].field998 = -1;
                    }
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2151 == arg0.field1326) {
                int var157 = var3.method5451();
                class227 var158 = class227.method3963(var157);
                for (int var159 = 0; var159 < var158.field2631.length; var159++) {
                    var158.field2631[var159] = -1;
                    var158.field2631[var159] = 0;
                }
                method5979(var158);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2208 == arg0.field1326) {
                int var160 = var3.method5285();
                int var161 = var3.method5451();
                class227 var162 = class227.method3963(var161);
                if (var162 != null && var162.field2596 == 0) {
                    if (var160 > var162.field2618 - var162.field2647) {
                        var160 = var162.field2618 - var162.field2647;
                    }
                    if (var160 < 0) {
                        var160 = 0;
                    }
                    if (var162.field2736 != var160) {
                        var162.field2736 = var160;
                        method5979(var162);
                    }
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2174 == arg0.field1326) {
                if (arg0.field1329 == 0) {
                    Statics.field295 = null;
                } else {
                    if (Statics.field295 == null) {
                        Statics.field295 = new class296(Statics.field617, Statics.field7);
                    }
                    Statics.field295.method4989(var3);
                }
                method773();
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2160 == arg0.field1326) {
                method2267(false, arg0.field1327);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2217 == arg0.field1326) {
                int var163 = var3.method5294();
                int var164 = var3.method5283();
                int var165 = var3.method5283();
                class227 var166 = class227.method3963(var163);
                var166.field2650 = (var164 << 16) + var165;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2178 == arg0.field1326) {
                method2249(class195.field2354);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2146 == arg0.field1326) {
                boolean var167 = var3.method5252();
                if (!var167) {
                    Statics.field1017 = null;
                } else if (Statics.field1017 == null) {
                    Statics.field1017 = new class249();
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2186 == arg0.field1326) {
                field882 = var3.method5276();
                field738 = var3.method5332();
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2216 == arg0.field1326) {
                class99.method3172(var3, arg0.field1329);
                method4962();
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2162 == arg0.field1326) {
                Statics.field549 = class321.method3324(var3.method5310());
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2213 == arg0.field1326) {
                int var168 = var3.method5284();
                int var169 = var3.method5295();
                class227 var170 = class227.method3963(var169);
                if (var170.field2637 != 2 || var170.field2683 != var168) {
                    var170.field2637 = 2;
                    var170.field2683 = var168;
                    method5979(var170);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2190 == arg0.field1326) {
                int var171 = var3.method5247();
                field827 = var171;
                this.method1259(false);
                method127(var171);
                class86.method2467(field827);
                for (int var172 = 0; var172 < 100; var172++) {
                    field817[var172] = true;
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2198 == arg0.field1326) {
                int var173 = var3.method5310();
                if (var3.method5310() == 0) {
                    field930[var173] = new class19();
                    var3.field3747 += 18;
                } else {
                    var3.field3747--;
                    field930[var173] = new class19(var3, false);
                }
                field711 = field850;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2195 == arg0.field1326) {
                Statics.field574.field1078.method4875(var3, arg0.field1329);
                method737();
                field858 = field850;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2209 == arg0.field1326) {
                field907 = false;
                for (int var174 = 0; var174 < 5; var174++) {
                    field908[var174] = false;
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2205 == arg0.field1326) {
                class106.method5184(var3, arg0.field1329);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2170 == arg0.field1326) {
                method3806();
                int var175 = var3.method5451();
                int var176 = var3.method5273();
                int var177 = var3.method5310();
                field799[var177] = var175;
                field834[var177] = var176;
                field798[var177] = 1;
                for (int var178 = 0; var178 < 98; var178++) {
                    if (var175 >= class231.field2776[var178]) {
                        field798[var177] = var178 + 2;
                    }
                }
                field749[++field678 - 1 & 0x1F] = var177;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2166 == arg0.field1326) {
                field907 = true;
                Statics.field346 = var3.method5310();
                Statics.field1476 = var3.method5310();
                Statics.field2080 = var3.method5247();
                Statics.field2057 = var3.method5310();
                Statics.field2741 = var3.method5310();
                if (Statics.field2741 >= 100) {
                    Statics.field1261 = Statics.field346 * 128 + 64;
                    Statics.field1102 = Statics.field1476 * 128 + 64;
                    Statics.field555 = method576(Statics.field1261, Statics.field1102, Statics.field1162) - Statics.field2080;
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2189 == arg0.field1326) {
                Statics.field574.method1813();
                field858 = field850;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2144 == arg0.field1326) {
                boolean var179 = var3.method5310() == 1;
                if (var179) {
                    Statics.field58 = class308.method1082() - var3.method5251();
                    Statics.field187 = new class16(var3, true);
                } else {
                    Statics.field187 = null;
                }
                field861 = field850;
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2155 == arg0.field1326) {
                int var180 = var3.method5295();
                String var181 = var3.method5465();
                class227 var182 = class227.method3963(var180);
                if (!var181.equals(var182.field2655)) {
                    var182.field2655 = var181;
                    method5979(var182);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2192 == arg0.field1326) {
                if (Statics.field295 != null) {
                    Statics.field295.method4993(var3);
                }
                method773();
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2148 == arg0.field1326) {
                method2249(class195.field2348);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2191 == arg0.field1326) {
                int var183 = var3.method5451();
                int var184 = var3.method5283();
                class227 var185 = class227.method3963(var183);
                if (var185.field2637 != 1 || var185.field2683 != var184) {
                    var185.field2637 = 1;
                    var185.field2683 = var184;
                    method5979(var185);
                }
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2164 == arg0.field1326) {
                method2249(class195.field2357);
                arg0.field1326 = null;
                return true;
            }
            if (class192.field2188 == arg0.field1326) {
                String var186 = var3.method5465();
                long var187 = var3.method5251();
                long var189 = (long) var3.method5247();
                long var191 = (long) var3.method5263();
                class240 var193 = (class240) class205.method1123(class240.method1119(), var3.method5310());
                long var194 = (var189 << 32) + var191;
                boolean var196 = false;
                for (int var197 = 0; var197 < 100; var197++) {
                    if (field884[var197] == var194) {
                        var196 = true;
                        break;
                    }
                }
                if (var193.field3137 && Statics.field574.method1818(new class294(var186, Statics.field617))) {
                    var196 = true;
                }
                if (!var196 && field779 == 0) {
                    field884[field885] = var194;
                    field885 = (field885 + 1) % 100;
                    String var198 = class307.method5122(class302.method3205(class220.method3388(var3)));
                    if (var193.field3132 == -1) {
                        class101.method5998(9, var186, var198, class300.method2178(var187));
                    } else {
                        class101.method5998(9, class91.method3300(var193.field3132) + var186, var198, class300.method2178(var187));
                    }
                }
                arg0.field1326 = null;
                return true;
            }
            class352.method4617("" + (arg0.field1326 == null ? -1 : arg0.field1326.field2228) + class91.field1159 + (arg0.field1334 == null ? -1 : arg0.field1334.field2228) + class91.field1159 + (arg0.field1335 == null ? -1 : arg0.field1335.field2228) + class91.field1159 + arg0.field1329, (Throwable) null);
            method1093();
        } catch (IOException var203) {
            method71();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1326 == null ? -1 : arg0.field1326.field2228) + class91.field1159 + (arg0.field1334 == null ? -1 : arg0.field1334.field2228) + class91.field1159 + (arg0.field1335 == null ? -1 : arg0.field1335.field2228) + class91.field1159 + arg0.field1329 + class91.field1159 + (Statics.field109 + Statics.field1986.field1009[0]) + class91.field1159 + (Statics.field3212 + Statics.field1986.field986[0]) + class91.field1159;
            for (int var202 = 0; var202 < arg0.field1329 && var202 < 50; var202++) {
                var201 = var201 + var3.field3746[var202] + class91.field1159;
            }
            class352.method4617(var201, var204);
            method1093();
        }
        return true;
    }

    @ObfuscatedName("dx.hf(Lgs;I)V")
    public static final void method2249(class195 arg0) {
        class310 var1 = field751.field1327;
        if (class195.field2355 == arg0) {
            int var2 = var1.method5276();
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = field725[var3];
            int var6 = var1.method5310();
            int var7 = (var6 >> 4 & 0x7) + Statics.field83;
            int var8 = (var6 & 0x7) + Statics.field104;
            int var9 = var1.method5283();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method796(Statics.field1162, var7, var8, var5, var9, var3, var4, 0, -1);
            }
        } else if (class195.field2348 == arg0) {
            int var10 = var1.method5285();
            int var11 = var1.method5310();
            int var12 = var1.method5247();
            int var13 = var1.method5332();
            int var14 = (var13 >> 4 & 0x7) + Statics.field83;
            int var15 = (var13 & 0x7) + Statics.field104;
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                int var16 = var14 * 128 + 64;
                int var17 = var15 * 128 + 64;
                class87 var18 = new class87(var10, Statics.field1162, var16, var17, method576(var16, var17, Statics.field1162) - var11, var12, field729);
                field796.method4699(var18);
            }
        } else if (class195.field2349 == arg0) {
            int var19 = var1.method5273();
            int var20 = (var19 >> 4 & 0x7) + Statics.field83;
            int var21 = (var19 & 0x7) + Statics.field104;
            int var22 = var1.method5247();
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class273 var23 = field793[Statics.field1162][var20][var21];
                if (var23 != null) {
                    for (class97 var24 = (class97) var23.method4721(); var24 != null; var24 = (class97) var23.method4706()) {
                        if ((var22 & 0x7FFF) == var24.field1257) {
                            var24.method3486();
                            break;
                        }
                    }
                    if (var23.method4721() == null) {
                        field793[Statics.field1162][var20][var21] = null;
                    }
                    method4406(var20, var21);
                }
            }
        } else {
            if (class195.field2347 == arg0) {
                int var25 = var1.method5284();
                int var26 = var1.method5276();
                int var27 = (var26 >> 4 & 0x7) + Statics.field83;
                int var28 = (var26 & 0x7) + Statics.field104;
                int var29 = var1.method5310();
                int var30 = var29 >> 4 & 0xF;
                int var31 = var29 & 0x7;
                int var32 = var1.method5273();
                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                    int var33 = var30 + 1;
                    if (Statics.field1986.field1009[0] >= var27 - var33 && Statics.field1986.field1009[0] <= var27 + var33 && Statics.field1986.field986[0] >= var28 - var33 && Statics.field1986.field986[0] <= var28 + var33 && Statics.field191.field1071 != 0 && var31 > 0 && field878 < 50) {
                        field902[field878] = var25;
                        field903[field878] = var31;
                        field837[field878] = var32;
                        field906[field878] = null;
                        field905[field878] = (var27 << 16) + (var28 << 8) + var30;
                        field878++;
                    }
                }
            }
            if (class195.field2357 == arg0) {
                int var34 = var1.method5285();
                int var35 = var1.method5284();
                int var36 = var1.method5310();
                int var37 = (var36 >> 4 & 0x7) + Statics.field83;
                int var38 = (var36 & 0x7) + Statics.field104;
                if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                    class97 var39 = new class97();
                    var39.field1257 = var34;
                    var39.field1256 = var35;
                    if (field793[Statics.field1162][var37][var38] == null) {
                        field793[Statics.field1162][var37][var38] = new class273();
                    }
                    field793[Statics.field1162][var37][var38].method4699(var39);
                    method4406(var37, var38);
                }
            } else if (class195.field2353 == arg0) {
                int var40 = var1.method5332();
                int var41 = var1.method5273() * 4;
                int var42 = var1.method5287();
                int var43 = var1.method5285();
                byte var44 = var1.method5303();
                int var45 = var1.method5247();
                int var46 = var1.method5332() * 4;
                byte var47 = var1.method5278();
                int var48 = var1.method5332();
                int var49 = var1.method5285();
                int var50 = var1.method5273();
                int var51 = (var50 >> 4 & 0x7) + Statics.field83;
                int var52 = (var50 & 0x7) + Statics.field104;
                int var53 = var44 + var51;
                int var54 = var47 + var52;
                if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104 && var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var43 != 65535) {
                    int var55 = var51 * 128 + 64;
                    int var56 = var52 * 128 + 64;
                    int var57 = var53 * 128 + 64;
                    int var58 = var54 * 128 + 64;
                    class96 var59 = new class96(var43, Statics.field1162, var55, var56, method576(var55, var56, Statics.field1162) - var41, field729 + var45, field729 + var49, var48, var40, var42, var46);
                    var59.method2077(var57, var58, method576(var57, var58, Statics.field1162) - var46, field729 + var45);
                    field795.method4699(var59);
                }
            } else if (class195.field2352 == arg0) {
                int var60 = var1.method5310();
                int var61 = (var60 >> 4 & 0x7) + Statics.field83;
                int var62 = (var60 & 0x7) + Statics.field104;
                int var63 = var1.method5283();
                int var64 = var1.method5283();
                int var65 = var1.method5283();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                    class273 var66 = field793[Statics.field1162][var61][var62];
                    if (var66 != null) {
                        for (class97 var67 = (class97) var66.method4721(); var67 != null; var67 = (class97) var66.method4706()) {
                            if ((var65 & 0x7FFF) == var67.field1257 && var67.field1256 == var63) {
                                var67.field1256 = var64;
                                break;
                            }
                        }
                        method4406(var61, var62);
                    }
                }
            } else if (class195.field2354 == arg0) {
                int var68 = var1.method5273();
                int var69 = var68 >> 2;
                int var70 = var68 & 0x3;
                int var71 = field725[var69];
                int var72 = var1.method5285();
                int var73 = var1.method5310();
                int var74 = (var73 >> 4 & 0x7) + Statics.field83;
                int var75 = (var73 & 0x7) + Statics.field104;
                if (var74 >= 0 && var75 >= 0 && var74 < 103 && var75 < 103) {
                    if (var71 == 0) {
                        class146 var76 = Statics.field2034.method3111(Statics.field1162, var74, var75);
                        if (var76 != null) {
                            int var77 = class138.method229(var76.field1893);
                            if (var69 == 2) {
                                var76.field1891 = new class103(var77, 2, var70 + 4, Statics.field1162, var74, var75, var72, false, var76.field1891);
                                var76.field1895 = new class103(var77, 2, var70 + 1 & 0x3, Statics.field1162, var74, var75, var72, false, var76.field1895);
                            } else {
                                var76.field1891 = new class103(var77, var69, var70, Statics.field1162, var74, var75, var72, false, var76.field1891);
                            }
                        }
                    }
                    if (var71 == 1) {
                        class151 var78 = Statics.field2034.method3024(Statics.field1162, var74, var75);
                        if (var78 != null) {
                            int var79 = class138.method229(var78.field1936);
                            if (var69 == 4 || var69 == 5) {
                                var78.field1934 = new class103(var79, 4, var70, Statics.field1162, var74, var75, var72, false, var78.field1934);
                            } else if (var69 == 6) {
                                var78.field1934 = new class103(var79, 4, var70 + 4, Statics.field1162, var74, var75, var72, false, var78.field1934);
                            } else if (var69 == 7) {
                                var78.field1934 = new class103(var79, 4, (var70 + 2 & 0x3) + 4, Statics.field1162, var74, var75, var72, false, var78.field1934);
                            } else if (var69 == 8) {
                                var78.field1934 = new class103(var79, 4, var70 + 4, Statics.field1162, var74, var75, var72, false, var78.field1934);
                                var78.field1935 = new class103(var79, 4, (var70 + 2 & 0x3) + 4, Statics.field1162, var74, var75, var72, false, var78.field1935);
                            }
                        }
                    }
                    if (var71 == 2) {
                        class152 var80 = Statics.field2034.method3145(Statics.field1162, var74, var75);
                        if (var69 == 11) {
                            var69 = 10;
                        }
                        if (var80 != null) {
                            var80.field1943 = new class103(class138.method229(var80.field1951), var69, var70, Statics.field1162, var74, var75, var72, false, var80.field1943);
                        }
                    }
                    if (var71 == 3) {
                        class133 var81 = Statics.field2034.method3088(Statics.field1162, var74, var75);
                        if (var81 != null) {
                            var81.field1631 = new class103(class138.method229(var81.field1633), 22, var70, Statics.field1162, var74, var75, var72, false, var81.field1631);
                        }
                    }
                }
            } else if (class195.field2356 == arg0) {
                int var82 = var1.method5273();
                int var83 = var82 >> 2;
                int var84 = var82 & 0x3;
                int var85 = field725[var83];
                int var86 = var1.method5276();
                int var87 = (var86 >> 4 & 0x7) + Statics.field83;
                int var88 = (var86 & 0x7) + Statics.field104;
                if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                    method796(Statics.field1162, var87, var88, var85, -1, var83, var84, 0, -1);
                }
            } else if (class195.field2351 == arg0) {
                int var89 = var1.method5285();
                int var90 = var1.method5276();
                int var91 = var90 >> 2;
                int var92 = var90 & 0x3;
                int var93 = field725[var91];
                byte var94 = var1.method5278();
                int var95 = var1.method5283();
                int var96 = var1.method5276();
                int var97 = (var96 >> 4 & 0x7) + Statics.field83;
                int var98 = (var96 & 0x7) + Statics.field104;
                int var99 = var1.method5247();
                byte var100 = var1.method5278();
                int var101 = var1.method5283();
                byte var102 = var1.method5277();
                byte var103 = var1.method5293();
                class76 var104;
                if (field750 == var101) {
                    var104 = Statics.field1986;
                } else {
                    var104 = field671[var101];
                }
                if (var104 != null) {
                    class265 var105 = class265.method668(var99);
                    int var106;
                    int var107;
                    if (var92 == 1 || var92 == 3) {
                        var106 = var105.field3397;
                        var107 = var105.field3396;
                    } else {
                        var106 = var105.field3396;
                        var107 = var105.field3397;
                    }
                    int var108 = (var106 >> 1) + var97;
                    int var109 = (var106 + 1 >> 1) + var97;
                    int var110 = (var107 >> 1) + var98;
                    int var111 = (var107 + 1 >> 1) + var98;
                    int[][] var112 = class65.field525[Statics.field1162];
                    int var113 = var112[var108][var110] + var112[var109][var110] + var112[var108][var111] + var112[var109][var111] >> 2;
                    int var114 = (var97 << 7) + (var106 << 6);
                    int var115 = (var98 << 7) + (var107 << 6);
                    class137 var116 = var105.method4414(var91, var92, var112, var114, var113, var115);
                    if (var116 != null) {
                        method796(Statics.field1162, var97, var98, var93, -1, 0, 0, var95 + 1, var89 + 1);
                        var104.field639 = field729 + var95;
                        var104.field635 = field729 + var89;
                        var104.field636 = var116;
                        var104.field638 = var97 * 128 + var106 * 64;
                        var104.field640 = var98 * 128 + var107 * 64;
                        var104.field644 = var113;
                        if (var102 > var100) {
                            byte var117 = var102;
                            var102 = var100;
                            var100 = var117;
                        }
                        if (var103 > var94) {
                            byte var118 = var103;
                            var103 = var94;
                            var94 = var118;
                        }
                        var104.field642 = var97 + var102;
                        var104.field641 = var97 + var100;
                        var104.field643 = var98 + var103;
                        var104.field645 = var94 + var98;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.hc(IIIIIIIIII)V")
    public static final void method796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class78 var9 = null;
        for (class78 var10 = (class78) field694.method4721(); var10 != null; var10 = (class78) field694.method4706()) {
            if (var10.field948 == arg0 && var10.field942 == arg1 && var10.field941 == arg2 && var10.field947 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class78();
            var9.field948 = arg0;
            var9.field947 = arg3;
            var9.field942 = arg1;
            var9.field941 = arg2;
            method4197(var9);
            field694.method4699(var9);
        }
        var9.field940 = arg4;
        var9.field949 = arg5;
        var9.field944 = arg6;
        var9.field950 = arg7;
        var9.field951 = arg8;
    }

    @ObfuscatedName("ic.hg(Lbo;B)V")
    public static final void method4197(class78 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field947 == 0) {
            var1 = Statics.field2034.method3015(arg0.field948, arg0.field942, arg0.field941);
        }
        if (arg0.field947 == 1) {
            var1 = Statics.field2034.method3010(arg0.field948, arg0.field942, arg0.field941);
        }
        if (arg0.field947 == 2) {
            var1 = Statics.field2034.method3029(arg0.field948, arg0.field942, arg0.field941);
        }
        if (arg0.field947 == 3) {
            var1 = Statics.field2034.method3030(arg0.field948, arg0.field942, arg0.field941);
        }
        if (var1 != 0L) {
            int var6 = Statics.field2034.method3031(arg0.field948, arg0.field942, arg0.field941, var1);
            var3 = class138.method229(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field943 = var3;
        arg0.field946 = var4;
        arg0.field945 = var5;
    }

    @ObfuscatedName("ae.hp(I)V")
    public static final void method291() {
        for (class78 var0 = (class78) field694.method4721(); var0 != null; var0 = (class78) field694.method4706()) {
            if (var0.field951 > 0) {
                var0.field951--;
            }
            if (var0.field951 != 0) {
                if (var0.field950 > 0) {
                    var0.field950--;
                }
                if (var0.field950 == 0 && var0.field942 >= 1 && var0.field941 >= 1 && var0.field942 <= 102 && var0.field941 <= 102 && (var0.field940 < 0 || class65.method3378(var0.field940, var0.field949))) {
                    method3811(var0.field948, var0.field947, var0.field942, var0.field941, var0.field940, var0.field944, var0.field949);
                    var0.field950 = -1;
                    if (var0.field943 == var0.field940 && var0.field943 == -1) {
                        var0.method3486();
                    } else if (var0.field943 == var0.field940 && var0.field945 == var0.field944 && var0.field949 == var0.field946) {
                        var0.method3486();
                    }
                }
            } else if (var0.field943 < 0 || class65.method3378(var0.field943, var0.field946)) {
                method3811(var0.field948, var0.field947, var0.field942, var0.field941, var0.field943, var0.field945, var0.field946);
                var0.method3486();
            }
        }
    }

    @ObfuscatedName("ht.hh(IIIIIIIB)V")
    public static final void method3811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field666 && Statics.field1162 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field2034.method3015(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2034.method3010(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2034.method3029(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2034.method3030(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field2034.method3031(arg0, arg2, arg3, var7);
            int var13 = class138.method229(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2034.method3019(arg0, arg2, arg3);
                class265 var16 = class265.method668(var13);
                if (var16.field3398 != 0) {
                    field772[arg0].method3445(arg2, arg3, var14, var15, var16.field3399);
                }
            }
            if (arg1 == 1) {
                Statics.field2034.method3020(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2034.method3032(arg0, arg2, arg3);
                class265 var17 = class265.method668(var13);
                if (var17.field3396 + arg2 > 103 || var17.field3396 + arg3 > 103 || var17.field3397 + arg2 > 103 || var17.field3397 + arg3 > 103) {
                    return;
                }
                if (var17.field3398 != 0) {
                    field772[arg0].method3464(arg2, arg3, var17.field3396, var17.field3397, var15, var17.field3399);
                }
            }
            if (arg1 == 3) {
                Statics.field2034.method3013(arg0, arg2, arg3);
                class265 var18 = class265.method668(var13);
                if (var18.field3398 == 1) {
                    field772[arg0].method3448(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class65.field516[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class143 var20 = Statics.field2034;
        class182 var21 = field772[arg0];
        class265 var22 = class265.method668(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3397;
            var24 = var22.field3396;
        } else {
            var23 = var22.field3396;
            var24 = var22.field3397;
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
        int[][] var29 = class65.field525[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class138.method2665(arg2, arg3, 2, var22.field3400 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3417 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class145 var36;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var36 = var22.method4414(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class103(arg4, 22, arg5, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3136(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3398 == 1) {
                var21.method3443(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class145 var62;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var62 = var22.method4414(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class103(arg4, 10, arg5, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            if (var62 != null) {
                var20.method3160(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3398 != 0) {
                var21.method3469(arg2, arg3, var23, var24, var22.field3399);
            }
        } else if (arg6 >= 12) {
            class145 var37;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var37 = var22.method4414(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class103(arg4, arg6, arg5, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3160(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3398 != 0) {
                var21.method3469(arg2, arg3, var23, var24, var22.field3399);
            }
        } else if (arg6 == 0) {
            class145 var38;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var38 = var22.method4414(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class103(arg4, 0, arg5, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3086(arg0, arg2, arg3, var30, var38, (class145) null, class65.field522[arg5], 0, var33, var35);
            if (var22.field3398 != 0) {
                var21.method3439(arg2, arg3, arg6, arg5, var22.field3399);
            }
        } else if (arg6 == 1) {
            class145 var39;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var39 = var22.method4414(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class103(arg4, 1, arg5, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3086(arg0, arg2, arg3, var30, var39, (class145) null, class65.field515[arg5], 0, var33, var35);
            if (var22.field3398 != 0) {
                var21.method3439(arg2, arg3, arg6, arg5, var22.field3399);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class145 var41;
            class145 var42;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var41 = var22.method4414(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4414(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class103(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
                var42 = new class103(arg4, 2, var40, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3086(arg0, arg2, arg3, var30, var41, var42, class65.field522[arg5], class65.field522[var40], var33, var35);
            if (var22.field3398 != 0) {
                var21.method3439(arg2, arg3, arg6, arg5, var22.field3399);
            }
        } else if (arg6 == 3) {
            class145 var43;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var43 = var22.method4414(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class103(arg4, 3, arg5, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3086(arg0, arg2, arg3, var30, var43, (class145) null, class65.field515[arg5], 0, var33, var35);
            if (var22.field3398 != 0) {
                var21.method3439(arg2, arg3, arg6, arg5, var22.field3399);
            }
        } else if (arg6 == 9) {
            class145 var44;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var44 = var22.method4414(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class103(arg4, arg6, arg5, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3160(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3398 != 0) {
                var21.method3469(arg2, arg3, var23, var24, var22.field3399);
            }
        } else if (arg6 == 4) {
            class145 var45;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var45 = var22.method4414(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class103(arg4, 4, arg5, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3011(arg0, arg2, arg3, var30, var45, (class145) null, class65.field522[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method3015(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class265.method668(class138.method229(var47)).field3405;
            }
            class145 var49;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var49 = var22.method4414(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class103(arg4, 4, arg5, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3011(arg0, arg2, arg3, var30, var49, (class145) null, class65.field522[arg5], 0, class65.field524[arg5] * var46, class65.field528[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method3015(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class265.method668(class138.method229(var51)).field3405 / 2;
            }
            class145 var53;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var53 = var22.method4414(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class103(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3011(arg0, arg2, arg3, var30, var53, (class145) null, 256, arg5, class65.field526[arg5] * var50, class65.field527[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class145 var55;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var55 = var22.method4414(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class103(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3011(arg0, arg2, arg3, var30, var55, (class145) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method3015(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class265.method668(class138.method229(var57)).field3405 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class145 var60;
            class145 var61;
            if (var22.field3403 == -1 && var22.field3422 == null) {
                var60 = var22.method4414(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4414(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class103(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
                var61 = new class103(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3403, var22.field3430, (class145) null);
            }
            var20.method3011(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class65.field526[arg5] * var56, class65.field527[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("jz.ht(III)V")
    public static final void method4406(int arg0, int arg1) {
        class273 var2 = field793[Statics.field1162][arg0][arg1];
        if (var2 == null) {
            Statics.field2034.method3022(Statics.field1162, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class97 var5 = null;
        for (class97 var6 = (class97) var2.method4721(); var6 != null; var6 = (class97) var2.method4706()) {
            class266 var7 = class266.method4793(var6.field1257);
            long var8 = (long) var7.field3455;
            if (var7.field3443 == 1) {
                var8 = (long) (var6.field1256 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2034.method3022(Statics.field1162, arg0, arg1);
            return;
        }
        var2.method4700(var5);
        class97 var10 = null;
        class97 var11 = null;
        for (class97 var12 = (class97) var2.method4721(); var12 != null; var12 = (class97) var2.method4706()) {
            if (var5.field1257 != var12.field1257) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1257 != var12.field1257 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class138.method2665(arg0, arg1, 3, false, 0);
        Statics.field2034.method3009(Statics.field1162, arg0, arg1, method576(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1162), var5, var13, var10, var11);
    }

    @ObfuscatedName("gl.hj(ZLkd;B)V")
    public static final void method3477(boolean arg0, class310 arg1) {
        field852 = 0;
        field726 = 0;
        class310 var2 = field751.field1327;
        var2.method5193();
        int var3 = var2.method5194(8);
        if (var3 < field707) {
            for (int var4 = var3; var4 < field707; var4++) {
                field846[++field852 - 1] = field708[var4];
            }
        }
        if (var3 > field707) {
            throw new RuntimeException("");
        }
        field707 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field708[var5];
            class89 var7 = field722[var6];
            int var8 = var2.method5194(1);
            if (var8 == 0) {
                field708[++field707 - 1] = var6;
                var7.field1003 = field729;
            } else {
                int var9 = var2.method5194(2);
                if (var9 == 0) {
                    field708[++field707 - 1] = var6;
                    var7.field1003 = field729;
                    field698[++field726 - 1] = var6;
                } else if (var9 == 1) {
                    field708[++field707 - 1] = var6;
                    var7.field1003 = field729;
                    int var10 = var2.method5194(3);
                    var7.method2009(var10, (byte) 1);
                    int var11 = var2.method5194(1);
                    if (var11 == 1) {
                        field698[++field726 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field708[++field707 - 1] = var6;
                    var7.field1003 = field729;
                    int var12 = var2.method5194(3);
                    var7.method2009(var12, (byte) 2);
                    int var13 = var2.method5194(3);
                    var7.method2009(var13, (byte) 2);
                    int var14 = var2.method5194(1);
                    if (var14 == 1) {
                        field698[++field726 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field846[++field852 - 1] = var6;
                }
            }
        }
        method3809(arg0, arg1);
        for (int var15 = 0; var15 < field726; var15++) {
            int var16 = field698[var15];
            class89 var17 = field722[var16];
            int var18 = arg1.method5310();
            if ((var18 & 0x10) != 0) {
                var17.field993 = arg1.method5277();
                var17.field953 = arg1.method5277();
                var17.field997 = arg1.method5303();
                var17.field999 = arg1.method5293();
                var17.field1000 = arg1.method5247() + field729;
                var17.field1001 = arg1.method5285() + field729;
                var17.field1002 = arg1.method5285();
                var17.field964 = 1;
                var17.field1013 = 0;
                var17.field993 += var17.field1009[0];
                var17.field953 += var17.field986[0];
                var17.field997 += var17.field1009[0];
                var17.field999 += var17.field986[0];
            }
            if ((var18 & 0x1) != 0) {
                var17.field988 = arg1.method5283();
                int var19 = arg1.method5455();
                var17.field995 = var19 >> 16;
                var17.field994 = (var19 & 0xFFFF) + field729;
                var17.field992 = 0;
                var17.field987 = 0;
                if (var17.field994 > field729) {
                    var17.field992 = -1;
                }
                if (var17.field988 == 65535) {
                    var17.field988 = -1;
                }
            }
            if ((var18 & 0x2) != 0) {
                var17.field1150 = class268.method2020(arg1.method5284());
                var17.field1008 = var17.field1150.field3504;
                var17.field1007 = var17.field1150.field3511;
                var17.field981 = var17.field1150.field3510;
                var17.field963 = var17.field1150.field3514;
                var17.field985 = var17.field1150.field3529;
                var17.field1012 = var17.field1150.field3500;
                var17.field973 = var17.field1150.field3507;
                var17.field1014 = var17.field1150.field3520;
                var17.field961 = var17.field1150.field3509;
            }
            if ((var18 & 0x4) != 0) {
                int var20 = arg1.method5283();
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = arg1.method5273();
                if (var17.field998 == var20 && var20 != -1) {
                    int var22 = Statics.method1124(var20).field3549;
                    if (var22 == 1) {
                        var17.field996 = 0;
                        var17.field962 = 0;
                        var17.field989 = var21;
                        var17.field974 = 0;
                    }
                    if (var22 == 2) {
                        var17.field974 = 0;
                    }
                } else if (var20 == -1 || var17.field998 == -1 || Statics.method1124(var20).field3561 >= Statics.method1124(var17.field998).field3561) {
                    var17.field998 = var20;
                    var17.field996 = 0;
                    var17.field962 = 0;
                    var17.field989 = var21;
                    var17.field974 = 0;
                    var17.field1013 = var17.field964;
                }
            }
            if ((var18 & 0x80) != 0) {
                int var23 = arg1.method5310();
                if (var23 > 0) {
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = -1;
                        int var26 = -1;
                        int var27 = -1;
                        int var28 = arg1.method5259();
                        if (var28 == 32767) {
                            var28 = arg1.method5259();
                            var26 = arg1.method5259();
                            var25 = arg1.method5259();
                            var27 = arg1.method5259();
                        } else if (var28 == 32766) {
                            var28 = -1;
                        } else {
                            var26 = arg1.method5259();
                        }
                        int var29 = arg1.method5259();
                        var17.method1690(var28, var26, var25, var27, field729, var29);
                    }
                }
                int var30 = arg1.method5273();
                if (var30 > 0) {
                    for (int var31 = 0; var31 < var30; var31++) {
                        int var32 = arg1.method5259();
                        int var33 = arg1.method5259();
                        if (var33 == 32767) {
                            var17.method1699(var32);
                        } else {
                            int var34 = arg1.method5259();
                            int var35 = arg1.method5332();
                            int var36 = var33 > 0 ? arg1.method5273() : var35;
                            var17.method1691(var32, field729, var33, var34, var35, var36);
                        }
                    }
                }
            }
            if ((var18 & 0x20) != 0) {
                int var37 = arg1.method5283();
                int var38 = arg1.method5247();
                int var39 = var17.field957 - (var37 - Statics.field109 - Statics.field109) * 64;
                int var40 = var17.field954 - (var38 - Statics.field3212 - Statics.field3212) * 64;
                if (var39 != 0 || var40 != 0) {
                    var17.field982 = (int) (Math.atan2((double) var39, (double) var40) * 325.949D) & 0x7FF;
                }
            }
            if ((var18 & 0x40) != 0) {
                var17.field980 = arg1.method5283();
                if (var17.field980 == 65535) {
                    var17.field980 = -1;
                }
            }
            if ((var18 & 0x8) != 0) {
                var17.field967 = arg1.method5465();
                var17.field970 = 100;
            }
        }
        for (int var41 = 0; var41 < field852; var41++) {
            int var42 = field846[var41];
            if (field729 != field722[var42].field1003) {
                field722[var42].field1150 = null;
                field722[var42] = null;
            }
        }
        if (field751.field1329 != arg1.field3747) {
            throw new RuntimeException(arg1.field3747 + class91.field1159 + field751.field1329);
        }
        for (int var43 = 0; var43 < field707; var43++) {
            if (field722[field708[var43]] == null) {
                throw new RuntimeException(var43 + class91.field1159 + field707);
            }
        }
    }

    @ObfuscatedName("ht.hd(ZLkd;B)V")
    public static final void method3809(boolean arg0, class310 arg1) {
        while (true) {
            if (arg1.method5218(field751.field1329) >= 27) {
                int var2 = arg1.method5194(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field722[var2] == null) {
                        field722[var2] = new class89();
                        var3 = true;
                    }
                    class89 var4 = field722[var2];
                    field708[++field707 - 1] = var2;
                    var4.field1003 = field729;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method5194(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method5194(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    var4.field1150 = class268.method2020(arg1.method5194(14));
                    int var6 = field791[arg1.method5194(3)];
                    if (var3) {
                        var4.field1005 = var4.field955 = var6;
                    }
                    int var7 = arg1.method5194(1);
                    if (var7 == 1) {
                        field698[++field726 - 1] = var2;
                    }
                    int var8 = arg1.method5194(1);
                    int var9;
                    if (arg0) {
                        var9 = arg1.method5194(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method5194(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field1008 = var4.field1150.field3504;
                    var4.field1007 = var4.field1150.field3511;
                    if (var4.field1007 == 0) {
                        var4.field955 = 0;
                    }
                    var4.field981 = var4.field1150.field3510;
                    var4.field963 = var4.field1150.field3514;
                    var4.field985 = var4.field1150.field3529;
                    var4.field1012 = var4.field1150.field3500;
                    var4.field973 = var4.field1150.field3507;
                    var4.field1014 = var4.field1150.field3520;
                    var4.field961 = var4.field1150.field3509;
                    var4.method2012(Statics.field1986.field1009[0] + var5, Statics.field1986.field986[0] + var9, var8 == 1);
                    continue;
                }
            }
            arg1.method5195();
            return;
        }
    }

    @ObfuscatedName("p.hu(III)Lgz;")
    public static class184 method191(int arg0, int arg1) {
        field936.field2129 = arg0;
        field936.field2128 = arg1;
        field936.field2126 = 1;
        field936.field2127 = 1;
        return field936;
    }

    @ObfuscatedName("bk.hn(I)V")
    public static void method1223() {
        field736 = 0;
        field752 = false;
        field876[0] = class234.field3036;
        field808[0] = "";
        field805[0] = 1006;
        field824[0] = false;
        field736 = 1;
    }

    @ObfuscatedName("cm.hv(IIIIB)V")
    public static final void method2086(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field937; var4++) {
            if (field875[var4] + field873[var4] > arg0 && field873[var4] < arg0 + arg2 && field874[var4] + field717[var4] > arg1 && field874[var4] < arg1 + arg3) {
                field817[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hz(B)V")
    public final void method1256() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field736 - 1; var2++) {
                if (field805[var2] < 1000 && field805[var2 + 1] > 1000) {
                    String var3 = field808[var2];
                    field808[var2] = field808[var2 + 1];
                    field808[var2 + 1] = var3;
                    String var4 = field876[var2];
                    field876[var2] = field876[var2 + 1];
                    field876[var2 + 1] = var4;
                    int var5 = field805[var2];
                    field805[var2] = field805[var2 + 1];
                    field805[var2 + 1] = var5;
                    int var6 = field803[var2];
                    field803[var2] = field803[var2 + 1];
                    field803[var2 + 1] = var6;
                    int var7 = field804[var2];
                    field804[var2] = field804[var2 + 1];
                    field804[var2 + 1] = var7;
                    int var8 = field865[var2];
                    field865[var2] = field865[var2 + 1];
                    field865[var2 + 1] = var8;
                    boolean var9 = field824[var2];
                    field824[var2] = field824[var2 + 1];
                    field824[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field2060 != null || field838 != null) {
            return;
        }
        int var27;
        int var30;
        int var31;
        label212: {
            int var10 = class64.field509;
            if (field752) {
                if (var10 != 1 && (Statics.field47 || var10 != 4)) {
                    int var11 = class64.field502;
                    int var12 = class64.field503;
                    if (var11 < Statics.field624 - 10 || var11 > Statics.field624 + Statics.field2112 + 10 || var12 < Statics.field3628 - 10 || var12 > Statics.field91 + Statics.field3628 + 10) {
                        field752 = false;
                        method2086(Statics.field624, Statics.field3628, Statics.field2112, Statics.field91);
                    }
                }
                if (var10 == 1 || !Statics.field47 && var10 == 4) {
                    int var13 = Statics.field624;
                    int var14 = Statics.field3628;
                    int var15 = Statics.field2112;
                    int var16 = class64.field510;
                    int var17 = class64.field511;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field736; var19++) {
                        int var20 = (field736 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1 && var18 >= 0) {
                        int var21 = field803[var18];
                        int var22 = field804[var18];
                        int var23 = field805[var18];
                        int var24 = field865[var18];
                        String var25 = field876[var18];
                        String var26 = field808[var18];
                        method614(var21, var22, var23, var24, var25, var26, class64.field510, class64.field511);
                    }
                    field752 = false;
                    method2086(Statics.field624, Statics.field3628, Statics.field2112, Statics.field91);
                }
            } else {
                var27 = field736 - 1;
                if ((var10 == 1 || !Statics.field47 && var10 == 4) && var27 >= 0) {
                    int var29 = field805[var27];
                    if (var29 == 39 || var29 == 40 || var29 == 41 || var29 == 42 || var29 == 43 || var29 == 33 || var29 == 34 || var29 == 35 || var29 == 36 || var29 == 37 || var29 == 38 || var29 == 1005) {
                        var30 = field803[var27];
                        var31 = field804[var27];
                        class227 var32 = class227.method3963(var31);
                        int var33 = method836(var32);
                        boolean var34 = (var33 >> 28 & 0x1) != 0;
                        if (var34) {
                            break label212;
                        }
                        class228 var10000 = (class228) null;
                        if (class228.method3546(method836(var32))) {
                            break label212;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field47 && var10 == 4) && this.method1257()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field47 && var10 == 4) && field736 > 0 && var27 >= 0) {
                    int var35 = field803[var27];
                    int var36 = field804[var27];
                    int var37 = field805[var27];
                    int var38 = field865[var27];
                    String var39 = field876[var27];
                    String var40 = field808[var27];
                    method614(var35, var36, var37, var38, var39, var40, class64.field510, class64.field511);
                }
                if (var10 == 2 && field736 > 0) {
                    this.method1560(class64.field510, class64.field511);
                }
            }
            return;
        }
        if (Statics.field2060 != null && !field777 && field736 > 0 && !this.method1257()) {
            method3497(field774, field775);
        }
        field777 = false;
        field839 = 0;
        if (Statics.field2060 != null) {
            method5979(Statics.field2060);
        }
        Statics.field2060 = class227.method3963(var31);
        field920 = var30;
        field774 = class64.field510;
        field775 = class64.field511;
        if (var27 >= 0) {
            Statics.field2364 = new class92();
            Statics.field2364.field1170 = field803[var27];
            Statics.field2364.field1173 = field804[var27];
            Statics.field2364.field1171 = field805[var27];
            Statics.field2364.field1172 = field865[var27];
            Statics.field2364.field1174 = field876[var27];
        }
        method5979(Statics.field2060);
    }

    @ObfuscatedName("client.hm(I)Z")
    public final boolean method1257() {
        int var1 = field736 - 1;
        return (field815 == 1 && field736 > 2 || method4282(var1)) && !field824[var1];
    }

    @ObfuscatedName("client.hx(III)V")
    public final void method1560(int arg0, int arg1) {
        method139(arg0, arg1);
        Statics.field2034.method3038(Statics.field1162, arg0, arg1, false);
        field752 = true;
    }

    @ObfuscatedName("ah.hw(I)V")
    public static void method587() {
        method139(Statics.field2112 / 2 + Statics.field624, Statics.field3628);
    }

    @ObfuscatedName("f.hl(III)V")
    public static void method139(int arg0, int arg1) {
        int var2 = Statics.field597.method5084(class234.field2944);
        for (int var3 = 0; var3 < field736; var3++) {
            int var4 = Statics.field597.method5084(method441(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field736 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field88) {
            var6 = Statics.field88 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field145) {
            var7 = Statics.field145 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field624 = var6;
        Statics.field3628 = var7;
        Statics.field2112 = var2;
        Statics.field91 = field736 * 15 + 22;
    }

    @ObfuscatedName("ix.hy(II)Z")
    public static final boolean method4282(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field805[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("aj.hk(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method614(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 35) {
            class197 var8 = class197.method434(class193.field2317, field751.field1333);
            var8.field2372.method5246(arg0);
            var8.field2372.method5231(arg1);
            var8.field2372.method5411(arg3);
            field751.method2239(var8);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 1005) {
            class227 var9 = class227.method3963(arg1);
            if (var9 == null || var9.field2674[arg0] < 100000) {
                class197 var10 = class197.method434(class193.field2334, field751.field1333);
                var10.field2372.method5281(arg3);
                field751.method2239(var10);
            } else {
                class101.method314(27, "", var9.field2674[arg0] + " x " + class266.method4793(arg3).field3448);
            }
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 44) {
            class76 var11 = field671[arg3];
            if (var11 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var12 = class197.method434(class193.field2314, field751.field1333);
                var12.field2372.method5411(arg3);
                var12.field2372.method5487(class55.field416[82] ? 1 : 0);
                field751.method2239(var12);
            }
        }
        if (arg2 == 7) {
            class89 var13 = field722[arg3];
            if (var13 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var14 = class197.method434(class193.field2272, field751.field1333);
                var14.field2372.method5337(Statics.field2275);
                var14.field2372.method5334(class55.field416[82] ? 1 : 0);
                var14.field2372.method5229(Statics.field430);
                var14.field2372.method5281(arg3);
                var14.field2372.method5229(Statics.field2363);
                field751.method2239(var14);
            }
        }
        if (arg2 == 8) {
            class89 var15 = field722[arg3];
            if (var15 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var16 = class197.method434(class193.field2268, field751.field1333);
                var16.field2372.method5279(class55.field416[82] ? 1 : 0);
                var16.field2372.method5246(arg3);
                var16.field2372.method5231(Statics.field2470);
                var16.field2372.method5229(field821);
                field751.method2239(var16);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class227 var17 = class227.method1102(arg1, arg0);
            if (var17 != null) {
                method1174(arg3, arg1, arg0, var17.field2677, arg5);
            }
        }
        if (arg2 == 1001) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var18 = class197.method434(class193.field2289, field751.field1333);
            var18.field2372.method5411(Statics.field109 + arg0);
            var18.field2372.method5246(arg3);
            var18.field2372.method5334(class55.field416[82] ? 1 : 0);
            var18.field2372.method5281(Statics.field3212 + arg1);
            field751.method2239(var18);
        }
        if (arg2 == 16) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var19 = class197.method434(class193.field2239, field751.field1333);
            var19.field2372.method5411(arg3);
            var19.field2372.method5229(Statics.field430);
            var19.field2372.method5229(Statics.field3212 + arg1);
            var19.field2372.method5246(Statics.field109 + arg0);
            var19.field2372.method5439(class55.field416[82] ? 1 : 0);
            var19.field2372.method5229(Statics.field2363);
            var19.field2372.method5432(Statics.field2275);
            field751.method2239(var19);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1453.method6073(arg2, arg3, new class223(arg0), new class223(arg1));
        }
        if (arg2 == 43) {
            class197 var20 = class197.method434(class193.field2298, field751.field1333);
            var20.field2372.method5411(arg0);
            var20.field2372.method5292(arg1);
            var20.field2372.method5229(arg3);
            field751.method2239(var20);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 25) {
            class227 var21 = class227.method1102(arg1, arg0);
            if (var21 != null) {
                method340();
                method5582(arg1, arg0, Statics.method3749(method836(var21)), var21.field2677);
                field818 = 0;
                field823 = method1226(var21);
                if (field823 == null) {
                    field823 = class234.field2795;
                }
                if (var21.field2593) {
                    field685 = var21.field2673 + class91.method3410(16777215);
                } else {
                    field685 = class91.method3410(65280) + var21.field2716 + class91.method3410(16777215);
                }
            }
            return;
        }
        if (arg2 == 15) {
            class76 var22 = field671[arg3];
            if (var22 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var23 = class197.method434(class193.field2326, field751.field1333);
                var23.field2372.method5334(class55.field416[82] ? 1 : 0);
                var23.field2372.method5246(arg3);
                var23.field2372.method5246(field821);
                var23.field2372.method5432(Statics.field2470);
                field751.method2239(var23);
            }
        }
        if (arg2 == 10) {
            class89 var24 = field722[arg3];
            if (var24 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var25 = class197.method434(class193.field2236, field751.field1333);
                var25.field2372.method5334(class55.field416[82] ? 1 : 0);
                var25.field2372.method5229(arg3);
                field751.method2239(var25);
            }
        }
        if (arg2 == 47) {
            class76 var26 = field671[arg3];
            if (var26 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var27 = class197.method434(class193.field2276, field751.field1333);
                var27.field2372.method5411(arg3);
                var27.field2372.method5487(class55.field416[82] ? 1 : 0);
                field751.method2239(var27);
            }
        }
        if (arg2 == 42) {
            class197 var28 = class197.method434(class193.field2282, field751.field1333);
            var28.field2372.method5281(arg0);
            var28.field2372.method5229(arg3);
            var28.field2372.method5292(arg1);
            field751.method2239(var28);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 4) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var29 = class197.method434(class193.field2308, field751.field1333);
            var29.field2372.method5281(Statics.field3212 + arg1);
            var29.field2372.method5334(class55.field416[82] ? 1 : 0);
            var29.field2372.method5411(arg3);
            var29.field2372.method5229(Statics.field109 + arg0);
            field751.method2239(var29);
        }
        if (arg2 == 20) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var30 = class197.method434(class193.field2288, field751.field1333);
            var30.field2372.method5229(arg3);
            var30.field2372.method5411(Statics.field3212 + arg1);
            var30.field2372.method5487(class55.field416[82] ? 1 : 0);
            var30.field2372.method5411(Statics.field109 + arg0);
            field751.method2239(var30);
        }
        if (arg2 == 2) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var31 = class197.method434(class193.field2310, field751.field1333);
            var31.field2372.method5439(class55.field416[82] ? 1 : 0);
            var31.field2372.method5337(Statics.field2470);
            var31.field2372.method5246(arg3);
            var31.field2372.method5229(Statics.field3212 + arg1);
            var31.field2372.method5246(field821);
            var31.field2372.method5411(Statics.field109 + arg0);
            field751.method2239(var31);
        }
        if (arg2 == 3) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var32 = class197.method434(class193.field2324, field751.field1333);
            var32.field2372.method5281(Statics.field3212 + arg1);
            var32.field2372.method5281(Statics.field109 + arg0);
            var32.field2372.method5279(class55.field416[82] ? 1 : 0);
            var32.field2372.method5229(arg3);
            field751.method2239(var32);
        }
        if (arg2 == 21) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var33 = class197.method434(class193.field2250, field751.field1333);
            var33.field2372.method5229(Statics.field3212 + arg1);
            var33.field2372.method5334(class55.field416[82] ? 1 : 0);
            var33.field2372.method5246(arg3);
            var33.field2372.method5281(Statics.field109 + arg0);
            field751.method2239(var33);
        }
        if (arg2 == 1002) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            class197 var34 = class197.method434(class193.field2270, field751.field1333);
            var34.field2372.method5246(arg3);
            field751.method2239(var34);
        }
        if (arg2 == 9) {
            class89 var35 = field722[arg3];
            if (var35 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var36 = class197.method434(class193.field2237, field751.field1333);
                var36.field2372.method5439(class55.field416[82] ? 1 : 0);
                var36.field2372.method5281(arg3);
                field751.method2239(var36);
            }
        }
        if (arg2 == 17) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var37 = class197.method434(class193.field2267, field751.field1333);
            var37.field2372.method5281(field821);
            var37.field2372.method5292(Statics.field2470);
            var37.field2372.method5411(arg3);
            var37.field2372.method5487(class55.field416[82] ? 1 : 0);
            var37.field2372.method5229(Statics.field3212 + arg1);
            var37.field2372.method5229(Statics.field109 + arg0);
            field751.method2239(var37);
        }
        if (arg2 == 12) {
            class89 var38 = field722[arg3];
            if (var38 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var39 = class197.method434(class193.field2232, field751.field1333);
                var39.field2372.method5334(class55.field416[82] ? 1 : 0);
                var39.field2372.method5281(arg3);
                field751.method2239(var39);
            }
        }
        if (arg2 == 6) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var40 = class197.method434(class193.field2247, field751.field1333);
            var40.field2372.method5246(Statics.field3212 + arg1);
            var40.field2372.method5487(class55.field416[82] ? 1 : 0);
            var40.field2372.method5246(Statics.field109 + arg0);
            var40.field2372.method5246(arg3);
            field751.method2239(var40);
        }
        if (arg2 == 31) {
            class197 var41 = class197.method434(class193.field2331, field751.field1333);
            var41.field2372.method5337(Statics.field2275);
            var41.field2372.method5411(arg0);
            var41.field2372.method5411(arg3);
            var41.field2372.method5246(Statics.field430);
            var41.field2372.method5229(Statics.field2363);
            var41.field2372.method5432(arg1);
            field751.method2239(var41);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 19) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var42 = class197.method434(class193.field2257, field751.field1333);
            var42.field2372.method5411(Statics.field109 + arg0);
            var42.field2372.method5281(arg3);
            var42.field2372.method5279(class55.field416[82] ? 1 : 0);
            var42.field2372.method5229(Statics.field3212 + arg1);
            field751.method2239(var42);
        }
        if (arg2 == 34) {
            class197 var43 = class197.method434(class193.field2252, field751.field1333);
            var43.field2372.method5246(arg3);
            var43.field2372.method5246(arg0);
            var43.field2372.method5337(arg1);
            field751.method2239(var43);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 50) {
            class76 var44 = field671[arg3];
            if (var44 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var45 = class197.method434(class193.field2309, field751.field1333);
                var45.field2372.method5439(class55.field416[82] ? 1 : 0);
                var45.field2372.method5246(arg3);
                field751.method2239(var45);
            }
        }
        if (arg2 == 37) {
            class197 var46 = class197.method434(class193.field2230, field751.field1333);
            var46.field2372.method5292(arg1);
            var46.field2372.method5229(arg3);
            var46.field2372.method5246(arg0);
            field751.method2239(var46);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 32) {
            class197 var47 = class197.method434(class193.field2285, field751.field1333);
            var47.field2372.method5411(arg3);
            var47.field2372.method5246(arg0);
            var47.field2372.method5432(Statics.field2470);
            var47.field2372.method5292(arg1);
            var47.field2372.method5411(field821);
            field751.method2239(var47);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 46) {
            class76 var48 = field671[arg3];
            if (var48 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var49 = class197.method434(class193.field2279, field751.field1333);
                var49.field2372.method5487(class55.field416[82] ? 1 : 0);
                var49.field2372.method5281(arg3);
                field751.method2239(var49);
            }
        }
        if (arg2 == 14) {
            class76 var50 = field671[arg3];
            if (var50 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var51 = class197.method434(class193.field2266, field751.field1333);
                var51.field2372.method5487(class55.field416[82] ? 1 : 0);
                var51.field2372.method5432(Statics.field2275);
                var51.field2372.method5281(Statics.field2363);
                var51.field2372.method5411(arg3);
                var51.field2372.method5411(Statics.field430);
                field751.method2239(var51);
            }
        }
        if (arg2 == 22) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var52 = class197.method434(class193.field2251, field751.field1333);
            var52.field2372.method5229(Statics.field3212 + arg1);
            var52.field2372.method5246(Statics.field109 + arg0);
            var52.field2372.method5229(arg3);
            var52.field2372.method5279(class55.field416[82] ? 1 : 0);
            field751.method2239(var52);
        }
        if (arg2 == 45) {
            class76 var53 = field671[arg3];
            if (var53 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var54 = class197.method434(class193.field2243, field751.field1333);
                var54.field2372.method5334(class55.field416[82] ? 1 : 0);
                var54.field2372.method5411(arg3);
                field751.method2239(var54);
            }
        }
        if (arg2 == 58) {
            class227 var55 = class227.method1102(arg1, arg0);
            if (var55 != null) {
                class197 var56 = class197.method434(class193.field2245, field751.field1333);
                var56.field2372.method5231(Statics.field2470);
                var56.field2372.method5246(var55.field2677);
                var56.field2372.method5281(field822);
                var56.field2372.method5246(arg0);
                var56.field2372.method5432(arg1);
                var56.field2372.method5411(field821);
                field751.method2239(var56);
            }
        }
        if (arg2 == 13) {
            class89 var57 = field722[arg3];
            if (var57 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var58 = class197.method434(class193.field2313, field751.field1333);
                var58.field2372.method5246(arg3);
                var58.field2372.method5487(class55.field416[82] ? 1 : 0);
                field751.method2239(var58);
            }
        }
        if (arg2 == 5) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var59 = class197.method434(class193.field2325, field751.field1333);
            var59.field2372.method5279(class55.field416[82] ? 1 : 0);
            var59.field2372.method5411(arg3);
            var59.field2372.method5411(Statics.field109 + arg0);
            var59.field2372.method5246(Statics.field3212 + arg1);
            field751.method2239(var59);
        }
        if (arg2 == 26) {
            method3554();
        }
        if (arg2 == 23) {
            if (field752) {
                Statics.field2034.method3017();
            } else {
                Statics.field2034.method3038(Statics.field1162, arg0, arg1, true);
            }
        }
        if (arg2 == 40) {
            class197 var60 = class197.method434(class193.field2295, field751.field1333);
            var60.field2372.method5231(arg1);
            var60.field2372.method5281(arg3);
            var60.field2372.method5281(arg0);
            field751.method2239(var60);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 28) {
            class197 var61 = class197.method434(class193.field2263, field751.field1333);
            var61.field2372.method5231(arg1);
            field751.method2239(var61);
            class227 var62 = class227.method3963(arg1);
            if (var62.field2712 != null && var62.field2712[0][0] == 5) {
                int var63 = var62.field2712[0][1];
                class222.field2556[var63] = 1 - class222.field2556[var63];
                method615(var63);
            }
        }
        if (arg2 == 39) {
            class197 var64 = class197.method434(class193.field2256, field751.field1333);
            var64.field2372.method5411(arg3);
            var64.field2372.method5411(arg0);
            var64.field2372.method5432(arg1);
            field751.method2239(var64);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 38) {
            method340();
            class227 var65 = class227.method3963(arg1);
            field818 = 1;
            Statics.field2363 = arg0;
            Statics.field2275 = arg1;
            Statics.field430 = arg3;
            method5979(var65);
            field705 = class91.method3410(16748608) + class266.method4793(arg3).field3448 + class91.method3410(16777215);
            if (field705 == null) {
                field705 = class234.field2795;
            }
            return;
        }
        if (arg2 == 1) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var66 = class197.method434(class193.field2248, field751.field1333);
            var66.field2372.method5411(Statics.field430);
            var66.field2372.method5281(arg3);
            var66.field2372.method5281(Statics.field2363);
            var66.field2372.method5411(Statics.field3212 + arg1);
            var66.field2372.method5334(class55.field416[82] ? 1 : 0);
            var66.field2372.method5246(Statics.field109 + arg0);
            var66.field2372.method5432(Statics.field2275);
            field751.method2239(var66);
        }
        if (arg2 == 48) {
            class76 var67 = field671[arg3];
            if (var67 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var68 = class197.method434(class193.field2234, field751.field1333);
                var68.field2372.method5281(arg3);
                var68.field2372.method5487(class55.field416[82] ? 1 : 0);
                field751.method2239(var68);
            }
        }
        if (arg2 == 33) {
            class197 var69 = class197.method434(class193.field2287, field751.field1333);
            var69.field2372.method5337(arg1);
            var69.field2372.method5229(arg3);
            var69.field2372.method5411(arg0);
            field751.method2239(var69);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 30 && field831 == null) {
            method230(arg1, arg0);
            field831 = class227.method1102(arg1, arg0);
            method5979(field831);
        }
        if (arg2 == 41) {
            class197 var70 = class197.method434(class193.field2233, field751.field1333);
            var70.field2372.method5432(arg1);
            var70.field2372.method5246(arg0);
            var70.field2372.method5229(arg3);
            field751.method2239(var70);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 18) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            field895 = arg0;
            field789 = arg1;
            class197 var71 = class197.method434(class193.field2283, field751.field1333);
            var71.field2372.method5246(Statics.field3212 + arg1);
            var71.field2372.method5281(arg3);
            var71.field2372.method5229(Statics.field109 + arg0);
            var71.field2372.method5334(class55.field416[82] ? 1 : 0);
            field751.method2239(var71);
        }
        if (arg2 == 11) {
            class89 var72 = field722[arg3];
            if (var72 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var73 = class197.method434(class193.field2293, field751.field1333);
                var73.field2372.method5281(arg3);
                var73.field2372.method5439(class55.field416[82] ? 1 : 0);
                field751.method2239(var73);
            }
        }
        if (arg2 == 51) {
            class76 var74 = field671[arg3];
            if (var74 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var75 = class197.method434(class193.field2328, field751.field1333);
                var75.field2372.method5487(class55.field416[82] ? 1 : 0);
                var75.field2372.method5411(arg3);
                field751.method2239(var75);
            }
        }
        if (arg2 == 1003) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            class89 var76 = field722[arg3];
            if (var76 != null) {
                class268 var77 = var76.field1150;
                if (var77.field3528 != null) {
                    var77 = var77.method4534();
                }
                if (var77 != null) {
                    class197 var78 = class197.method434(class193.field2280, field751.field1333);
                    var78.field2372.method5229(var77.field3502);
                    field751.method2239(var78);
                }
            }
        }
        if (arg2 == 1004) {
            field766 = arg6;
            field855 = arg7;
            field769 = 2;
            field669 = 0;
            class197 var79 = class197.method434(class193.field2334, field751.field1333);
            var79.field2372.method5281(arg3);
            field751.method2239(var79);
        }
        if (arg2 == 24) {
            class227 var80 = class227.method3963(arg1);
            boolean var81 = true;
            if (var80.field2727 > 0) {
                var81 = method231(var80);
            }
            if (var81) {
                class197 var82 = class197.method434(class193.field2263, field751.field1333);
                var82.field2372.method5231(arg1);
                field751.method2239(var82);
            }
        }
        if (arg2 == 36) {
            class197 var83 = class197.method434(class193.field2319, field751.field1333);
            var83.field2372.method5246(arg0);
            var83.field2372.method5281(arg3);
            var83.field2372.method5432(arg1);
            field751.method2239(var83);
            field771 = 0;
            Statics.field261 = class227.method3963(arg1);
            field932 = arg0;
        }
        if (arg2 == 49) {
            class76 var84 = field671[arg3];
            if (var84 != null) {
                field766 = arg6;
                field855 = arg7;
                field769 = 2;
                field669 = 0;
                field895 = arg0;
                field789 = arg1;
                class197 var85 = class197.method434(class193.field2240, field751.field1333);
                var85.field2372.method5229(arg3);
                var85.field2372.method5279(class55.field416[82] ? 1 : 0);
                field751.method2239(var85);
            }
        }
        if (arg2 == 29) {
            class197 var86 = class197.method434(class193.field2263, field751.field1333);
            var86.field2372.method5231(arg1);
            field751.method2239(var86);
            class227 var87 = class227.method3963(arg1);
            if (var87.field2712 != null && var87.field2712[0][0] == 5) {
                int var88 = var87.field2712[0][1];
                if (class222.field2556[var88] != var87.field2624[0]) {
                    class222.field2556[var88] = var87.field2624[0];
                    method615(var88);
                }
            }
        }
        if (field818 != 0) {
            field818 = 0;
            method5979(class227.method3963(Statics.field2275));
        }
        if (field820) {
            method340();
        }
        if (Statics.field261 != null && field771 == 0) {
            method5979(Statics.field261);
        }
    }

    @ObfuscatedName("e.hi(ILjava/lang/String;B)V")
    public static void method64(int arg0, String arg1) {
        int var2 = class99.field1271;
        int[] var3 = class99.field1272;
        boolean var4 = false;
        class294 var5 = new class294(arg1, Statics.field617);
        for (int var6 = 0; var6 < var2; var6++) {
            class76 var7 = field671[var3[var6]];
            if (var7 != null && Statics.field1986 != var7 && var7.field630 != null && var7.field630.equals(var5)) {
                if (arg0 == 1) {
                    class197 var8 = class197.method434(class193.field2314, field751.field1333);
                    var8.field2372.method5411(var3[var6]);
                    var8.field2372.method5487(0);
                    field751.method2239(var8);
                } else if (arg0 == 4) {
                    class197 var9 = class197.method434(class193.field2276, field751.field1333);
                    var9.field2372.method5411(var3[var6]);
                    var9.field2372.method5487(0);
                    field751.method2239(var9);
                } else if (arg0 == 6) {
                    class197 var10 = class197.method434(class193.field2240, field751.field1333);
                    var10.field2372.method5229(var3[var6]);
                    var10.field2372.method5279(0);
                    field751.method2239(var10);
                } else if (arg0 == 7) {
                    class197 var11 = class197.method434(class193.field2309, field751.field1333);
                    var11.field2372.method5439(0);
                    var11.field2372.method5246(var3[var6]);
                    field751.method2239(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class101.method314(4, "", class234.field2940 + arg1);
        }
    }

    @ObfuscatedName("lu.iq(IIIII)V")
    public static void method5582(int arg0, int arg1, int arg2, int arg3) {
        class227 var4 = class227.method1102(arg0, arg1);
        if (var4 != null && var4.field2590 != null) {
            class72 var5 = new class72();
            var5.field587 = var4;
            var5.field595 = var4.field2590;
            class86.method2227(var5);
        }
        field822 = arg3;
        field820 = true;
        Statics.field2470 = arg0;
        field821 = arg1;
        Statics.field110 = arg2;
        method5979(var4);
    }

    @ObfuscatedName("ak.ir(I)V")
    public static void method340() {
        if (!field820) {
            return;
        }
        class227 var0 = class227.method1102(Statics.field2470, field821);
        if (var0 != null && var0.field2635 != null) {
            class72 var1 = new class72();
            var1.field587 = var0;
            var1.field595 = var0.field2635;
            class86.method2227(var1);
        }
        field820 = false;
        method5979(var0);
    }

    @ObfuscatedName("j.id(IIB)V")
    public static void method230(int arg0, int arg1) {
        class197 var2 = class197.method434(class193.field2258, field751.field1333);
        var2.field2372.method5337(arg0);
        var2.field2372.method5246(arg1);
        field751.method2239(var2);
    }

    @ObfuscatedName("ba.iz(IIIILjava/lang/String;B)V")
    public static void method1174(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class227 var5 = class227.method1102(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2632 != null) {
            class72 var6 = new class72();
            var6.field587 = var5;
            var6.field590 = arg0;
            var6.field585 = arg4;
            var6.field595 = var5.field2632;
            class86.method2227(var6);
        }
        boolean var7 = true;
        if (var5.field2727 > 0) {
            var7 = method231(var5);
        }
        if (!var7 || !class228.method3629(method836(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class197 var8 = class197.method434(class193.field2321, field751.field1333);
            var8.field2372.method5231(arg1);
            var8.field2372.method5229(arg2);
            var8.field2372.method5229(arg3);
            field751.method2239(var8);
        }
        if (arg0 == 2) {
            class197 var9 = class197.method434(class193.field2292, field751.field1333);
            var9.field2372.method5231(arg1);
            var9.field2372.method5229(arg2);
            var9.field2372.method5229(arg3);
            field751.method2239(var9);
        }
        if (arg0 == 3) {
            class197 var10 = class197.method434(class193.field2327, field751.field1333);
            var10.field2372.method5231(arg1);
            var10.field2372.method5229(arg2);
            var10.field2372.method5229(arg3);
            field751.method2239(var10);
        }
        if (arg0 == 4) {
            class197 var11 = class197.method434(class193.field2249, field751.field1333);
            var11.field2372.method5231(arg1);
            var11.field2372.method5229(arg2);
            var11.field2372.method5229(arg3);
            field751.method2239(var11);
        }
        if (arg0 == 5) {
            class197 var12 = class197.method434(class193.field2255, field751.field1333);
            var12.field2372.method5231(arg1);
            var12.field2372.method5229(arg2);
            var12.field2372.method5229(arg3);
            field751.method2239(var12);
        }
        if (arg0 == 6) {
            class197 var13 = class197.method434(class193.field2281, field751.field1333);
            var13.field2372.method5231(arg1);
            var13.field2372.method5229(arg2);
            var13.field2372.method5229(arg3);
            field751.method2239(var13);
        }
        if (arg0 == 7) {
            class197 var14 = class197.method434(class193.field2259, field751.field1333);
            var14.field2372.method5231(arg1);
            var14.field2372.method5229(arg2);
            var14.field2372.method5229(arg3);
            field751.method2239(var14);
        }
        if (arg0 == 8) {
            class197 var15 = class197.method434(class193.field2329, field751.field1333);
            var15.field2372.method5231(arg1);
            var15.field2372.method5229(arg2);
            var15.field2372.method5229(arg3);
            field751.method2239(var15);
        }
        if (arg0 == 9) {
            class197 var16 = class197.method434(class193.field2254, field751.field1333);
            var16.field2372.method5231(arg1);
            var16.field2372.method5229(arg2);
            var16.field2372.method5229(arg3);
            field751.method2239(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class197 var17 = class197.method434(class193.field2301, field751.field1333);
        var17.field2372.method5231(arg1);
        var17.field2372.method5229(arg2);
        var17.field2372.method5229(arg3);
        field751.method2239(var17);
    }

    @ObfuscatedName("ai.ib(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method657(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method731(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("av.iv(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method731(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field752 || field736 >= 500) {
            return;
        }
        field876[field736] = arg0;
        field808[field736] = arg1;
        field805[field736] = arg2;
        field865[field736] = arg3;
        field803[field736] = arg4;
        field804[field736] = arg5;
        field824[field736] = arg6;
        field736++;
    }

    @ObfuscatedName("ac.iu(I)V")
    public static void method321() {
        for (int var0 = 0; var0 < field736; var0++) {
            if (Statics.method599(field805[var0])) {
                if (var0 < field736 - 1) {
                    for (int var1 = var0; var1 < field736 - 1; var1++) {
                        field876[var1] = field876[var1 + 1];
                        field808[var1] = field808[var1 + 1];
                        field805[var1] = field805[var1 + 1];
                        field865[var1] = field865[var1 + 1];
                        field803[var1] = field803[var1 + 1];
                        field804[var1] = field804[var1 + 1];
                        field824[var1] = field824[var1 + 1];
                    }
                }
                var0--;
                field736--;
            }
        }
        method587();
    }

    @ObfuscatedName("aa.ik(IB)Ljava/lang/String;")
    public static String method441(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field808[arg0].length() > 0) {
            return field876[arg0] + class234.field2951 + field808[arg0];
        } else {
            return field876[arg0];
        }
    }

    @ObfuscatedName("cm.ip(IIIIB)V")
    public static final void method2085(int arg0, int arg1, int arg2, int arg3) {
        if (field818 == 0 && !field820) {
            method657(class234.field2921, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class138.method311(); var8++) {
            long var9 = class138.method1882(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class138.method3545(var8);
                int var12 = class138.method2010(var8);
                int var13 = class138.method5066(class138.field1762[var8]);
                int var15 = class138.method616(var8);
                if (var13 == 2 && Statics.field2034.method3031(Statics.field1162, var11, var12, var9) >= 0) {
                    class265 var16 = class265.method668(var15);
                    if (var16.field3422 != null) {
                        var16 = var16.method4417();
                    }
                    if (var16 == null) {
                        continue;
                    }
                    if (field818 == 1) {
                        method657(class234.field2941, field705 + " " + class91.field1160 + " " + class91.method3410(65535) + var16.field3391, 1, var15, var11, var12);
                    } else if (!field820) {
                        String[] var17 = var16.field3408;
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
                                    method657(var17[var18], class91.method3410(65535) + var16.field3391, var19, var15, var11, var12);
                                }
                            }
                        }
                        method657(class234.field2942, class91.method3410(65535) + var16.field3391, 1002, var16.field3407, var11, var12);
                    } else if ((Statics.field110 & 0x4) == 4) {
                        method657(field823, field685 + " " + class91.field1160 + " " + class91.method3410(65535) + var16.field3391, 2, var15, var11, var12);
                    }
                }
                if (var13 == 1) {
                    class89 var20 = field722[var15];
                    if (var20 == null) {
                        continue;
                    }
                    if (var20.field1150.field3504 == 1 && (var20.field957 & 0x7F) == 64 && (var20.field954 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field707; var21++) {
                            class89 var22 = field722[field708[var21]];
                            if (var22 != null && var20 != var22 && var22.field1150.field3504 == 1 && var20.field957 == var22.field957 && var20.field954 == var22.field954) {
                                method3973(var22.field1150, field708[var21], var11, var12);
                            }
                        }
                        int var23 = class99.field1271;
                        int[] var24 = class99.field1272;
                        for (int var25 = 0; var25 < var23; var25++) {
                            class76 var26 = field671[var24[var25]];
                            if (var26 != null && var20.field957 == var26.field957 && var20.field954 == var26.field954) {
                                method175(var26, var24[var25], var11, var12);
                            }
                        }
                    }
                    method3973(var20.field1150, var15, var11, var12);
                }
                if (var13 == 0) {
                    class76 var27 = field671[var15];
                    if (var27 == null) {
                        continue;
                    }
                    if ((var27.field957 & 0x7F) == 64 && (var27.field954 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < field707; var28++) {
                            class89 var29 = field722[field708[var28]];
                            if (var29 != null && var29.field1150.field3504 == 1 && var27.field957 == var29.field957 && var27.field954 == var29.field954) {
                                method3973(var29.field1150, field708[var28], var11, var12);
                            }
                        }
                        int var30 = class99.field1271;
                        int[] var31 = class99.field1272;
                        for (int var32 = 0; var32 < var30; var32++) {
                            class76 var33 = field671[var31[var32]];
                            if (var33 != null && var27 != var33 && var27.field957 == var33.field957 && var27.field954 == var33.field954) {
                                method175(var33, var31[var32], var11, var12);
                            }
                        }
                    }
                    if (field770 == var15) {
                        var4 = var9;
                    } else {
                        method175(var27, var15, var11, var12);
                    }
                }
                if (var13 == 3) {
                    class273 var34 = field793[Statics.field1162][var11][var12];
                    if (var34 != null) {
                        for (class97 var35 = (class97) var34.method4705(); var35 != null; var35 = (class97) var34.method4698()) {
                            class266 var36 = class266.method4793(var35.field1257);
                            if (field818 == 1) {
                                method657(class234.field2941, field705 + " " + class91.field1160 + " " + class91.method3410(16748608) + var36.field3448, 16, var35.field1257, var11, var12);
                            } else if (!field820) {
                                String[] var37 = var36.field3457;
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
                                        method657(var37[var38], class91.method3410(16748608) + var36.field3448, var39, var35.field1257, var11, var12);
                                    } else if (var38 == 2) {
                                        method657(class234.field2788, class91.method3410(16748608) + var36.field3448, 20, var35.field1257, var11, var12);
                                    }
                                }
                                method657(class234.field2942, class91.method3410(16748608) + var36.field3448, 1004, var35.field1257, var11, var12);
                            } else if ((Statics.field110 & 0x1) == 1) {
                                method657(field823, field685 + " " + class91.field1160 + " " + class91.method3410(16748608) + var36.field3448, 17, var35.field1257, var11, var12);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var40 = class138.method2271(var4);
            int var41 = class138.method178(var4);
            class76 var42 = field671[field770];
            method175(var42, field770, var40, var41);
        }
    }

    @ObfuscatedName("iu.ig(Ljy;IIII)V")
    public static final void method3973(class268 arg0, int arg1, int arg2, int arg3) {
        if (field736 >= 400) {
            return;
        }
        if (arg0.field3528 != null) {
            arg0 = arg0.method4534();
        }
        if (arg0 == null || !arg0.field3531 || arg0.field3533 && field835 != arg1) {
            return;
        }
        String var4 = arg0.field3524;
        if (arg0.field3518 != 0) {
            int var6 = arg0.field3518;
            int var7 = Statics.field1986.field633;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class91.method3410(16711680);
            } else if (var8 < -6) {
                var9 = class91.method3410(16723968);
            } else if (var8 < -3) {
                var9 = class91.method3410(16740352);
            } else if (var8 < 0) {
                var9 = class91.method3410(16756736);
            } else if (var8 > 9) {
                var9 = class91.method3410(65280);
            } else if (var8 > 6) {
                var9 = class91.method3410(4259584);
            } else if (var8 > 3) {
                var9 = class91.method3410(8453888);
            } else if (var8 > 0) {
                var9 = class91.method3410(12648192);
            } else {
                var9 = class91.method3410(16776960);
            }
            var4 = var4 + var9 + " " + class91.field1169 + class234.field2947 + arg0.field3518 + class91.field1163;
        }
        if (arg0.field3533 && field767) {
            method657(class234.field2942, class91.method3410(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field818 == 1) {
            method657(class234.field2941, field705 + " " + class91.field1160 + " " + class91.method3410(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field820) {
            int var10 = arg0.field3533 && field767 ? 2000 : 0;
            String[] var11 = arg0.field3498;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class234.field2943)) {
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
                        method657(var11[var12], class91.method3410(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class234.field2943)) {
                        short var15 = 0;
                        if (field773 != class94.field1192) {
                            if (field773 == class94.field1187 || field773 == class94.field1193 && arg0.field3518 > Statics.field1986.field633) {
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
                            method657(var11[var14], class91.method3410(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3533 || !field767) {
                method657(class234.field2942, class91.method3410(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field110 & 0x2) == 2) {
            method657(field823, field685 + " " + class91.field1160 + " " + class91.method3410(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("u.if(Lbk;IIII)V")
    public static final void method175(class76 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1986 == arg0 || field736 >= 400) {
            return;
        }
        String var9;
        if (arg0.field634 == 0) {
            String var4 = arg0.field654[0] + arg0.field630 + arg0.field654[1];
            int var5 = arg0.field633;
            int var6 = Statics.field1986.field633;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class91.method3410(16711680);
            } else if (var7 < -6) {
                var8 = class91.method3410(16723968);
            } else if (var7 < -3) {
                var8 = class91.method3410(16740352);
            } else if (var7 < 0) {
                var8 = class91.method3410(16756736);
            } else if (var7 > 9) {
                var8 = class91.method3410(65280);
            } else if (var7 > 6) {
                var8 = class91.method3410(4259584);
            } else if (var7 > 3) {
                var8 = class91.method3410(8453888);
            } else if (var7 > 0) {
                var8 = class91.method3410(12648192);
            } else {
                var8 = class91.method3410(16776960);
            }
            var9 = var4 + var8 + " " + class91.field1169 + class234.field2947 + arg0.field633 + class91.field1163 + arg0.field654[2];
        } else {
            var9 = arg0.field654[0] + arg0.field630 + arg0.field654[1] + " " + class91.field1169 + class234.field2948 + arg0.field634 + class91.field1163 + arg0.field654[2];
        }
        if (field818 == 1) {
            method657(class234.field2941, field705 + " " + class91.field1160 + " " + class91.method3410(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field820) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field901[var10] != null) {
                    short var11 = 0;
                    if (field901[var10].equalsIgnoreCase(class234.field2943)) {
                        if (field690 == class94.field1192) {
                            continue;
                        }
                        if (field690 == class94.field1187 || field690 == class94.field1193 && arg0.field633 > Statics.field1986.field633) {
                            var11 = 2000;
                        }
                        if (Statics.field1986.field647 != 0 && arg0.field647 != 0) {
                            if (Statics.field1986.field647 == arg0.field647) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field790[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field788[var10] + var11;
                    method657(field901[var10], class91.method3410(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field110 & 0x8) == 8) {
            method657(field823, field685 + " " + class91.field1160 + " " + class91.method3410(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field736; var14++) {
            if (field805[var14] == 23) {
                field808[var14] = class91.method3410(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("eb.iy(IIIIIIIII)V")
    public static final void method2922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class227.method619(arg0)) {
            Statics.field363 = null;
            method588(Statics.field3836[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field363 != null) {
                method588(Statics.field363, -1412584499, arg1, arg2, arg3, arg4, Statics.field219, Statics.field657, arg7);
                Statics.field363 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field817[var8] = true;
            }
        } else {
            field817[arg7] = true;
        }
    }

    @ObfuscatedName("ah.ii([Lhz;IIIIIIIII)V")
    public static final void method588(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class332.method5729(arg2, arg3, arg4, arg5);
        class140.method2926();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class227 var10 = arg0[var9];
            if (var10 != null && (var10.field2613 == arg1 || arg1 == -1412584499 && field838 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field873[field937] = var10.field2607 + arg6;
                    field874[field937] = var10.field2608 + arg7;
                    field875[field937] = var10.field2609;
                    field717[field937] = var10.field2647;
                    var11 = ++field937 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2731 = var11;
                var10.field2732 = field729;
                if (!var10.field2593 || !method779(var10)) {
                    if (var10.field2727 > 0) {
                        method339(var10);
                    }
                    int var12 = var10.field2607 + arg6;
                    int var13 = var10.field2608 + arg7;
                    int var14 = var10.field2625;
                    if (field838 == var10) {
                        if (arg1 != -1412584499 && !var10.field2678) {
                            Statics.field363 = arg0;
                            Statics.field219 = arg6;
                            Statics.field657 = arg7;
                            continue;
                        }
                        if (field849 && field913) {
                            int var15 = class64.field502;
                            int var16 = class64.field503;
                            int var17 = var15 - field840;
                            int var18 = var16 - field841;
                            if (var17 < field715) {
                                var17 = field715;
                            }
                            if (var10.field2609 + var17 > field715 + field781.field2609) {
                                var17 = field715 + field781.field2609 - var10.field2609;
                            }
                            if (var18 < field845) {
                                var18 = field845;
                            }
                            if (var10.field2647 + var18 > field845 + field781.field2647) {
                                var18 = field845 + field781.field2647 - var10.field2647;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2678) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2596 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2596 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2609 + var12;
                        int var26 = var10.field2647 + var13;
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
                        int var29 = var10.field2609 + var12;
                        int var30 = var10.field2647 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2593 || var19 < var21 && var20 < var22) {
                        if (var10.field2727 != 0) {
                            if (var10.field2727 == 1336) {
                                if (field680) {
                                    var13 += 15;
                                    Statics.field1228.method5091("Fps:" + field459, var10.field2609 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field666) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1228.method5091("Mem:" + var32 + "k", var10.field2609 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2727 == 1337) {
                                field814 = var12;
                                field870 = var13;
                                method100(var12, var13, var10.field2609, var10.field2647);
                                field817[var10.field2731] = true;
                                class332.method5729(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2727 == 1338) {
                                method3555(var10, var12, var13, var11);
                                class332.method5729(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2727 == 1339) {
                                method1165(var10, var12, var13, var11);
                                class332.method5729(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2727 == 1400) {
                                Statics.field1453.method6032(var12, var13, var10.field2609, var10.field2647, field729);
                            }
                            if (var10.field2727 == 1401) {
                                Statics.field1453.method6176(var12, var13, var10.field2609, var10.field2647);
                            }
                            if (var10.field2727 == 1402) {
                                Statics.field55.method1767(var12, field729);
                            }
                        }
                        if (var10.field2596 == 0) {
                            if (!var10.field2593 && method779(var10) && Statics.field438 != var10) {
                                continue;
                            }
                            if (!var10.field2593) {
                                if (var10.field2736 > var10.field2618 - var10.field2647) {
                                    var10.field2736 = var10.field2618 - var10.field2647;
                                }
                                if (var10.field2736 < 0) {
                                    var10.field2736 = 0;
                                }
                            }
                            method588(arg0, var10.field2594, var19, var20, var21, var22, var12 - var10.field2615, var13 - var10.field2736, var11);
                            if (var10.field2584 != null) {
                                method588(var10.field2584, var10.field2594, var19, var20, var21, var22, var12 - var10.field2615, var13 - var10.field2736, var11);
                            }
                            class71 var34 = (class71) field826.method5682((long) var10.field2594);
                            if (var34 != null) {
                                method2922(var34.field577, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class332.method5729(arg2, arg3, arg4, arg5);
                            class140.method2926();
                        }
                        if (field879 || field872[var11] || field877 > 1) {
                            if (var10.field2596 == 0 && !var10.field2593 && var10.field2618 > var10.field2647) {
                                method244(var10.field2609 + var12, var13, var10.field2736, var10.field2647, var10.field2618);
                            }
                            if (var10.field2596 != 1) {
                                if (var10.field2596 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2606; var36++) {
                                        for (int var37 = 0; var37 < var10.field2605; var37++) {
                                            int var38 = (var10.field2663 + 32) * var37 + var12;
                                            int var39 = (var10.field2601 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2660[var35];
                                                var39 += var10.field2664[var35];
                                            }
                                            if (var10.field2631[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2631[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field2060 == var10 && field920 == var35) {
                                                    class336 var43;
                                                    if (field818 == 1 && Statics.field2363 == var35 && Statics.field2275 == var10.field2594) {
                                                        var43 = class266.method3373(var42, var10.field2674[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class266.method3373(var42, var10.field2674[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method5979(var10);
                                                    } else if (Statics.field2060 == var10 && field920 == var35) {
                                                        int var44 = class64.field502 - field774;
                                                        int var45 = class64.field503 - field775;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field839 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5842(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class227 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class332.field3888 && var46.field2736 > 0) {
                                                                int var47 = field809 * (class332.field3888 - var39 - var45) / 3;
                                                                if (var47 > field809 * 10) {
                                                                    var47 = field809 * 10;
                                                                }
                                                                if (var47 > var46.field2736) {
                                                                    var47 = var46.field2736;
                                                                }
                                                                var46.field2736 -= var47;
                                                                field775 += var47;
                                                                method5979(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class332.field3889 && var46.field2736 < var46.field2618 - var46.field2647) {
                                                                int var48 = field809 * (var39 + var45 + 32 - class332.field3889) / 3;
                                                                if (var48 > field809 * 10) {
                                                                    var48 = field809 * 10;
                                                                }
                                                                if (var48 > var46.field2618 - var46.field2647 - var46.field2736) {
                                                                    var48 = var46.field2618 - var46.field2647 - var46.field2736;
                                                                }
                                                                var46.field2736 += var48;
                                                                field775 -= var48;
                                                                method5979(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field261 == var10 && field932 == var35) {
                                                        var43.method5842(var38, var39, 128);
                                                    } else {
                                                        var43.method5836(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2665 != null && var35 < 20) {
                                                class336 var49 = var10.method3923(var35);
                                                if (var49 != null) {
                                                    var49.method5836(var38, var39);
                                                } else if (class227.field2592) {
                                                    method5979(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2596 == 3) {
                                    int var50;
                                    if (method101(var10)) {
                                        var50 = var10.field2610;
                                        if (Statics.field438 == var10 && var10.field2622 != 0) {
                                            var50 = var10.field2622;
                                        }
                                    } else {
                                        var50 = var10.field2619;
                                        if (Statics.field438 == var10 && var10.field2621 != 0) {
                                            var50 = var10.field2621;
                                        }
                                    }
                                    if (var10.field2640) {
                                        switch(var10.field2711.field3899) {
                                            case 1:
                                                class332.method5738(var12, var13, var10.field2609, var10.field2647, var10.field2619, var10.field2610);
                                                break;
                                            case 2:
                                                class332.method5753(var12, var13, var10.field2609, var10.field2647, var10.field2619, var10.field2610, 255 - (var10.field2625 & 0xFF), 255 - (var10.field2623 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class332.method5763(var12, var13, var10.field2609, var10.field2647, var50);
                                                } else {
                                                    class332.method5797(var12, var13, var10.field2609, var10.field2647, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class332.method5741(var12, var13, var10.field2609, var10.field2647, var50);
                                    } else {
                                        class332.method5742(var12, var13, var10.field2609, var10.field2647, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2596 == 4) {
                                    class306 var51 = var10.method3884();
                                    if (var51 != null) {
                                        String var52 = var10.field2655;
                                        int var53;
                                        if (method101(var10)) {
                                            var53 = var10.field2610;
                                            if (Statics.field438 == var10 && var10.field2622 != 0) {
                                                var53 = var10.field2622;
                                            }
                                            if (var10.field2656.length() > 0) {
                                                var52 = var10.field2656;
                                            }
                                        } else {
                                            var53 = var10.field2619;
                                            if (Statics.field438 == var10 && var10.field2621 != 0) {
                                                var53 = var10.field2621;
                                            }
                                        }
                                        if (var10.field2593 && var10.field2677 != -1) {
                                            class266 var54 = class266.method4793(var10.field2677);
                                            var52 = var54.field3448;
                                            if (var52 == null) {
                                                var52 = class234.field2795;
                                            }
                                            if ((var54.field3443 == 1 || var10.field2721 != 1) && var10.field2721 != -1) {
                                                var52 = class91.method3410(16748608) + var52 + class91.field1166 + " " + 'x' + method325(var10.field2721);
                                            }
                                        }
                                        if (field831 == var10) {
                                            var52 = class234.field2814;
                                            var53 = var10.field2619;
                                        }
                                        if (!var10.field2593) {
                                            var52 = method76(var52, var10);
                                        }
                                        var51.method5160(var52, var12, var13, var10.field2609, var10.field2647, var53, var10.field2651 ? 0 : -1, var10.field2658, var10.field2659, var10.field2644);
                                    } else if (class227.field2592) {
                                        method5979(var10);
                                    }
                                } else if (var10.field2596 == 5) {
                                    if (var10.field2593) {
                                        class336 var56;
                                        if (var10.field2677 == -1) {
                                            var56 = var10.method3883(false);
                                        } else {
                                            var56 = class266.method3373(var10.field2677, var10.field2721, var10.field2633, var10.field2634, var10.field2653, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3910;
                                            int var58 = var56.field3916;
                                            if (var10.field2719) {
                                                class332.method5730(var12, var13, var10.field2609 + var12, var10.field2647 + var13);
                                                int var59 = (var10.field2609 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2647 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2724 != 0) {
                                                            var56.method5927(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2724, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5836(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5842(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class332.method5729(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2609 * 4096 / var57;
                                                if (var10.field2724 != 0) {
                                                    var56.method5927(var10.field2609 / 2 + var12, var10.field2647 / 2 + var13, var10.field2724, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5844(var12, var13, var10.field2609, var10.field2647, 256 - (var14 & 0xFF));
                                                } else if (var10.field2609 == var57 && var10.field2647 == var58) {
                                                    var56.method5836(var12, var13);
                                                } else {
                                                    var56.method5848(var12, var13, var10.field2609, var10.field2647);
                                                }
                                            }
                                        } else if (class227.field2592) {
                                            method5979(var10);
                                        }
                                    } else {
                                        class336 var55 = var10.method3883(method101(var10));
                                        if (var55 != null) {
                                            var55.method5836(var12, var13);
                                        } else if (class227.field2592) {
                                            method5979(var10);
                                        }
                                    }
                                } else if (var10.field2596 == 6) {
                                    boolean var64 = method101(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2642;
                                    } else {
                                        var65 = var10.field2641;
                                    }
                                    class137 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2677 != -1) {
                                        class266 var68 = class266.method4793(var10.field2677);
                                        if (var68 != null) {
                                            class266 var69 = var68.method4469(var10.field2721);
                                            var66 = var69.method4494(1);
                                            if (var66 == null) {
                                                method5979(var10);
                                            } else {
                                                var66.method2793();
                                                var67 = var66.field1885 / 2;
                                            }
                                        }
                                    } else if (var10.field2637 == 5) {
                                        if (var10.field2683 == 0) {
                                            var66 = field857.method3845((class270) null, -1, (class270) null, -1);
                                        } else {
                                            var66 = Statics.field1986.method1214();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3886((class270) null, -1, var64, Statics.field1986.field629);
                                        if (var66 == null && class227.field2592) {
                                            method5979(var10);
                                        }
                                    } else {
                                        class270 var70 = Statics.method1124(var65);
                                        var66 = var10.method3886(var70, var10.field2722, var64, Statics.field1986.field629);
                                        if (var66 == null && class227.field2592) {
                                            method5979(var10);
                                        }
                                    }
                                    class140.method2929(var10.field2609 / 2 + var12, var10.field2647 / 2 + var13);
                                    int var71 = var10.field2648 * class140.field1800[var10.field2645] >> 16;
                                    int var72 = var10.field2648 * class140.field1801[var10.field2645] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2593) {
                                            var66.method2793();
                                            if (var10.field2700) {
                                                var66.method2813(0, var10.field2646, var10.field2662, var10.field2645, var10.field2643, var10.field2627 + var67 + var71, var10.field2627 + var72, var10.field2648);
                                            } else {
                                                var66.method2866(0, var10.field2646, var10.field2662, var10.field2645, var10.field2643, var10.field2627 + var67 + var71, var10.field2627 + var72);
                                            }
                                        } else {
                                            var66.method2866(0, var10.field2646, 0, var10.field2645, 0, var71, var72);
                                        }
                                    }
                                    class140.method2928();
                                } else {
                                    if (var10.field2596 == 7) {
                                        class306 var73 = var10.method3884();
                                        if (var73 == null) {
                                            if (class227.field2592) {
                                                method5979(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2606; var75++) {
                                            for (int var76 = 0; var76 < var10.field2605; var76++) {
                                                if (var10.field2631[var74] > 0) {
                                                    class266 var77 = class266.method4793(var10.field2631[var74] - 1);
                                                    String var78;
                                                    if (var77.field3443 != 1 && var10.field2674[var74] == 1) {
                                                        var78 = class91.method3410(16748608) + var77.field3448 + class91.field1166;
                                                    } else {
                                                        var78 = class91.method3410(16748608) + var77.field3448 + class91.field1166 + " " + 'x' + method325(var10.field2674[var74]);
                                                    }
                                                    int var79 = (var10.field2663 + 115) * var76 + var12;
                                                    int var80 = (var10.field2601 + 12) * var75 + var13;
                                                    if (var10.field2658 == 0) {
                                                        var73.method5093(var78, var79, var80, var10.field2619, var10.field2651 ? 0 : -1);
                                                    } else if (var10.field2658 == 1) {
                                                        var73.method5092(var78, var10.field2609 / 2 + var79, var80, var10.field2619, var10.field2651 ? 0 : -1);
                                                    } else {
                                                        var73.method5091(var78, var10.field2609 + var79 - 1, var80, var10.field2619, var10.field2651 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2596 == 8 && Statics.field101 == var10 && field926 == field816) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class306 var83 = Statics.field1228;
                                        String var84 = var10.field2655;
                                        String var85 = method76(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class91.field1165);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5084(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3712 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2609 + var12 - 5 - var81;
                                        int var90 = var10.field2647 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class332.method5763(var89, var90, var81, var82, 16777120);
                                        class332.method5741(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2655;
                                        int var92 = var83.field3712 + var90 + 2;
                                        String var93 = method76(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class91.field1165);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5093(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3712 + 1;
                                        }
                                    }
                                    if (var10.field2596 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2628) {
                                            var96 = var12;
                                            var97 = var10.field2647 + var13;
                                            var98 = var10.field2609 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2609 + var12;
                                            var99 = var10.field2647 + var13;
                                        }
                                        if (var10.field2705 == 1) {
                                            class332.method5747(var96, var97, var98, var99, var10.field2619);
                                        } else {
                                            method176(var96, var97, var98, var99, var10.field2619, var10.field2705);
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

    @ObfuscatedName("t.io(IIIIIII)V")
    public static final void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class332.field3890;
        int var18 = arg1 - class332.field3888;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class140.method2997(var19, var20, var21);
        class140.method2939(var23, var24, var25, var19, var20, var21, arg4);
        class140.method2997(var19, var21, var22);
        class140.method2939(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("l.ie(Ljava/lang/String;Lhz;I)Ljava/lang/String;")
    public static String method76(String arg0, class227 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method164(method2004(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("aq.ij(II)Ljava/lang/String;")
    public static final String method325(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class91.field1159 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class91.method3410(65408) + var1.substring(0, var1.length() - 8) + class234.field2952 + " " + class91.field1169 + var1 + class91.field1163 + class91.field1166;
        } else if (var1.length() > 6) {
            return " " + class91.method3410(16777215) + var1.substring(0, var1.length() - 4) + class234.field2954 + " " + class91.field1169 + var1 + class91.field1163 + class91.field1166;
        } else {
            return " " + class91.method3410(16776960) + var1 + class91.field1166;
        }
    }

    @ObfuscatedName("client.il(ZS)V")
    public final void method1259(boolean arg0) {
        int var2 = field827;
        int var3 = Statics.field88;
        int var4 = Statics.field145;
        if (class227.method619(var2)) {
            method1883(Statics.field3836[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ic(Lhz;S)V")
    public void method1308(class227 arg0) {
        class227 var2 = arg0.field2613 == -1 ? null : class227.method3963(arg0.field2613);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field88;
            var4 = Statics.field145;
        } else {
            var3 = var2.field2609;
            var4 = var2.field2647;
        }
        method658(arg0, var3, var4, false);
        method1808(arg0, var3, var4);
    }

    @ObfuscatedName("gl.ia([Lhz;Lhz;ZI)V")
    public static void method3478(class227[] arg0, class227 arg1, boolean arg2) {
        int var3 = arg1.field2617 == 0 ? arg1.field2609 : arg1.field2617;
        int var4 = arg1.field2618 == 0 ? arg1.field2647 : arg1.field2618;
        method1883(arg0, arg1.field2594, var3, var4, arg2);
        if (arg1.field2584 != null) {
            method1883(arg1.field2584, arg1.field2594, var3, var4, arg2);
        }
        class71 var5 = (class71) field826.method5682((long) arg1.field2594);
        if (var5 != null) {
            int var6 = var5.field577;
            if (class227.method619(var6)) {
                method1883(Statics.field3836[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2727 == 1337) {
        }
    }

    @ObfuscatedName("ck.is([Lhz;IIIZI)V")
    public static void method1883(class227[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class227 var6 = arg0[var5];
            if (var6 != null && var6.field2613 == arg1) {
                method658(var6, arg2, arg3, arg4);
                method1808(var6, arg2, arg3);
                if (var6.field2615 > var6.field2617 - var6.field2609) {
                    var6.field2615 = var6.field2617 - var6.field2609;
                }
                if (var6.field2615 < 0) {
                    var6.field2615 = 0;
                }
                if (var6.field2736 > var6.field2618 - var6.field2647) {
                    var6.field2736 = var6.field2618 - var6.field2647;
                }
                if (var6.field2736 < 0) {
                    var6.field2736 = 0;
                }
                if (var6.field2596 == 0) {
                    method3478(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ai.iw(Lhz;IIZB)V")
    public static void method658(class227 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2609;
        int var5 = arg0.field2647;
        if (arg0.field2657 == 0) {
            arg0.field2609 = arg0.field2605;
        } else if (arg0.field2657 == 1) {
            arg0.field2609 = arg1 - arg0.field2605;
        } else if (arg0.field2657 == 2) {
            arg0.field2609 = arg0.field2605 * arg1 >> 14;
        }
        if (arg0.field2602 == 0) {
            arg0.field2647 = arg0.field2606;
        } else if (arg0.field2602 == 1) {
            arg0.field2647 = arg2 - arg0.field2606;
        } else if (arg0.field2602 == 2) {
            arg0.field2647 = arg0.field2606 * arg2 >> 14;
        }
        if (arg0.field2657 == 4) {
            arg0.field2609 = arg0.field2647 * arg0.field2611 / arg0.field2612;
        }
        if (arg0.field2602 == 4) {
            arg0.field2647 = arg0.field2612 * arg0.field2609 / arg0.field2611;
        }
        if (arg0.field2727 == 1337) {
            field699 = arg0;
        }
        if (arg3 && arg0.field2709 != null && (arg0.field2609 != var4 || arg0.field2647 != var5)) {
            class72 var6 = new class72();
            var6.field587 = arg0;
            var6.field595 = arg0.field2709;
            field810.method4699(var6);
        }
    }

    @ObfuscatedName("cf.it(Lhz;III)V")
    public static void method1808(class227 arg0, int arg1, int arg2) {
        if (arg0.field2599 == 0) {
            arg0.field2607 = arg0.field2691;
        } else if (arg0.field2599 == 1) {
            arg0.field2607 = (arg1 - arg0.field2609) / 2 + arg0.field2691;
        } else if (arg0.field2599 == 2) {
            arg0.field2607 = arg1 - arg0.field2609 - arg0.field2691;
        } else if (arg0.field2599 == 3) {
            arg0.field2607 = arg0.field2691 * arg1 >> 14;
        } else if (arg0.field2599 == 4) {
            arg0.field2607 = (arg0.field2691 * arg1 >> 14) + (arg1 - arg0.field2609) / 2;
        } else {
            arg0.field2607 = arg1 - arg0.field2609 - (arg0.field2691 * arg1 >> 14);
        }
        if (arg0.field2671 == 0) {
            arg0.field2608 = arg0.field2652;
        } else if (arg0.field2671 == 1) {
            arg0.field2608 = (arg2 - arg0.field2647) / 2 + arg0.field2652;
        } else if (arg0.field2671 == 2) {
            arg0.field2608 = arg2 - arg0.field2647 - arg0.field2652;
        } else if (arg0.field2671 == 3) {
            arg0.field2608 = arg0.field2652 * arg2 >> 14;
        } else if (arg0.field2671 == 4) {
            arg0.field2608 = (arg0.field2652 * arg2 >> 14) + (arg2 - arg0.field2647) / 2;
        } else {
            arg0.field2608 = arg2 - arg0.field2647 - (arg0.field2652 * arg2 >> 14);
        }
    }

    @ObfuscatedName("ld.ix(Lhz;IIIIIII)V")
    public static final void method5625(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field732) {
            field704 = 32;
        } else {
            field704 = 0;
        }
        field732 = false;
        if (class64.field501 == 1 || !Statics.field47 && class64.field501 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2736 -= 4;
                method5979(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2736 += 4;
                method5979(arg0);
            } else if (arg5 >= arg1 - field704 && arg5 < field704 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2736 = (arg4 - arg3) * var8 / var9;
                method5979(arg0);
                field732 = true;
            }
        }
        if (field863 == 0) {
            return;
        }
        int var10 = arg0.field2609;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2736 += field863 * 45;
            method5979(arg0);
        }
    }

    @ObfuscatedName("ay.in(IIIIII)V")
    public static final void method244(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1104[0].method5806(arg0, arg1);
        Statics.field1104[1].method5806(arg0, arg1 + arg3 - 16);
        class332.method5763(arg0, arg1 + 16, 16, arg3 - 32, field728);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class332.method5763(arg0, arg1 + 16 + var6, 16, var5, field778);
        class332.method5745(arg0, arg1 + 16 + var6, var5, field731);
        class332.method5745(arg0 + 1, arg1 + 16 + var6, var5, field731);
        class332.method5736(arg0, arg1 + 16 + var6, 16, field731);
        class332.method5736(arg0, arg1 + 17 + var6, 16, field731);
        class332.method5745(arg0 + 15, arg1 + 16 + var6, var5, field730);
        class332.method5745(arg0 + 14, arg1 + 17 + var6, var5 - 1, field730);
        class332.method5736(arg0, arg1 + 15 + var6 + var5, 16, field730);
        class332.method5736(arg0 + 1, arg1 + 14 + var6 + var5, 15, field730);
    }

    @ObfuscatedName("g.ih(IB)Ljava/lang/String;")
    public static final String method164(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("k.jl(Lhz;I)Z")
    public static final boolean method101(class227 arg0) {
        if (arg0.field2713 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2713.length; var1++) {
            int var2 = method2004(arg0, var1);
            int var3 = arg0.field2624[var1];
            if (arg0.field2713[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2713[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2713[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cr.jp(Lhz;II)I")
    public static final int method2004(class227 arg0, int arg1) {
        if (arg0.field2712 == null || arg1 >= arg0.field2712.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2712[arg1];
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
                    var7 = field834[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field798[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field799[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class227 var11 = class227.method3963(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class266.method4793(var12).field3456 || field665)) {
                        for (int var13 = 0; var13 < var11.field2631.length; var13++) {
                            if (var12 + 1 == var11.field2631[var13]) {
                                var7 += var11.field2674[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class222.field2556[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class231.field2776[field798[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class222.field2556[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1986.field633;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class231.field2777[var14]) {
                            var7 += field798[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class227 var17 = class227.method3963(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class266.method4793(var18).field3456 || field665)) {
                        for (int var19 = 0; var19 < var17.field2631.length; var19++) {
                            if (var18 + 1 == var17.field2631[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field832;
                }
                if (var6 == 12) {
                    var7 = field833;
                }
                if (var6 == 13) {
                    int var20 = class222.field2556[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class222.method5065(var22);
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
                    var7 = (Statics.field1986.field957 >> 7) + Statics.field109;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1986.field954 >> 7) + Statics.field3212;
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

    @ObfuscatedName("gc.jx(Lhz;Ljj;IIZI)V")
    public static final void method3557(class227 arg0, class266 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3458;
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
            var7 = class234.field2789;
        }
        if (var6 != -1 && var7 != null) {
            method731(var7, class91.method3410(16748608) + arg1.field3448, var6, arg1.field3441, arg2, arg0.field2594, arg4);
        }
    }

    @ObfuscatedName("bx.jz(Lhz;III)V")
    public static final void method802(class227 arg0, int arg1, int arg2) {
        if (arg0.field2597 == 1) {
            method657(arg0.field2717, "", 24, 0, 0, arg0.field2594);
        }
        if (arg0.field2597 == 2 && !field820) {
            String var3 = method1226(arg0);
            if (var3 != null) {
                method657(var3, class91.method3410(65280) + arg0.field2716, 25, 0, -1, arg0.field2594);
            }
        }
        if (arg0.field2597 == 3) {
            method657(class234.field2881, "", 26, 0, 0, arg0.field2594);
        }
        if (arg0.field2597 == 4) {
            method657(arg0.field2717, "", 28, 0, 0, arg0.field2594);
        }
        if (arg0.field2597 == 5) {
            method657(arg0.field2717, "", 29, 0, 0, arg0.field2594);
        }
        if (arg0.field2597 == 6 && field831 == null) {
            method657(arg0.field2717, "", 30, 0, -1, arg0.field2594);
        }
        if (arg0.field2596 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2647; var5++) {
                for (int var6 = 0; var6 < arg0.field2609; var6++) {
                    int var7 = (arg0.field2663 + 32) * var6;
                    int var8 = (arg0.field2601 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2660[var4];
                        var8 += arg0.field2664[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field741 = var4;
                        Statics.field3490 = arg0;
                        if (arg0.field2631[var4] > 0) {
                            class266 var9 = class266.method4793(arg0.field2631[var4] - 1);
                            if (field818 == 1 && class228.method2070(method836(arg0))) {
                                if (Statics.field2275 != arg0.field2594 || Statics.field2363 != var4) {
                                    method657(class234.field2941, field705 + " " + class91.field1160 + " " + class91.method3410(16748608) + var9.field3448, 31, var9.field3441, var4, arg0.field2594);
                                }
                            } else if (!field820 || !class228.method2070(method836(arg0))) {
                                String[] var10 = var9.field3458;
                                int var11 = -1;
                                if (field811 && method3551()) {
                                    var11 = var9.method4476();
                                }
                                if (class228.method2070(method836(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method3557(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                int var13 = method836(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method657(class234.field2941, class91.method3410(16748608) + var9.field3448, 38, var9.field3441, var4, arg0.field2594);
                                }
                                class228 var10000 = (class228) null;
                                if (class228.method2070(method836(arg0))) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var11 != var15) {
                                            method3557(arg0, var9, var4, var15, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method3557(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var16 = arg0.field2666;
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 39;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 42;
                                            }
                                            if (var17 == 4) {
                                                var18 = 43;
                                            }
                                            method657(var16[var17], class91.method3410(16748608) + var9.field3448, var18, var9.field3441, var4, arg0.field2594);
                                        }
                                    }
                                }
                                method657(class234.field2942, class91.method3410(16748608) + var9.field3448, 1005, var9.field3441, var4, arg0.field2594);
                            } else if ((Statics.field110 & 0x10) == 16) {
                                method657(field823, field685 + " " + class91.field1160 + " " + class91.method3410(16748608) + var9.field3448, 32, var9.field3441, var4, arg0.field2594);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2593) {
            return;
        }
        if (field820) {
            int var19 = method836(arg0);
            boolean var20 = (var19 >> 21 & 0x1) != 0;
            if (var20 && (Statics.field110 & 0x20) == 32) {
                method657(field823, field685 + " " + class91.field1160 + " " + arg0.field2673, 58, 0, arg0.field2595, arg0.field2594);
            }
            return;
        }
        for (int var21 = 9; var21 >= 5; var21--) {
            String var22;
            if (!class228.method3629(method836(arg0), var21) && arg0.field2632 == null) {
                var22 = null;
            } else if (arg0.field2699 == null || arg0.field2699.length <= var21 || arg0.field2699[var21] == null || arg0.field2699[var21].trim().length() == 0) {
                var22 = null;
            } else {
                var22 = arg0.field2699[var21];
            }
            if (var22 != null) {
                method657(var22, arg0.field2673, 1007, var21 + 1, arg0.field2595, arg0.field2594);
            }
        }
        String var24 = method1226(arg0);
        if (var24 != null) {
            method657(var24, arg0.field2673, 25, 0, arg0.field2595, arg0.field2594);
        }
        for (int var25 = 4; var25 >= 0; var25--) {
            String var26;
            if (!class228.method3629(method836(arg0), var25) && arg0.field2632 == null) {
                var26 = null;
            } else if (arg0.field2699 == null || arg0.field2699.length <= var25 || arg0.field2699[var25] == null || arg0.field2699[var25].trim().length() == 0) {
                var26 = null;
            } else {
                var26 = arg0.field2699[var25];
            }
            if (var26 != null) {
                method731(var26, arg0.field2673, 57, var25 + 1, arg0.field2595, arg0.field2594, arg0.field2714);
            }
        }
        int var28 = method836(arg0);
        boolean var29 = (var28 & 0x1) != 0;
        if (var29) {
            method657(class234.field2981, "", 30, 0, arg0.field2595, arg0.field2594);
        }
    }

    @ObfuscatedName("bh.jg(ZI)V")
    public static void method1078(boolean arg0) {
        field812 = arg0;
    }

    @ObfuscatedName("ar.jj(I)Z")
    public static boolean method410() {
        return field812;
    }

    @ObfuscatedName("gw.je(B)Z")
    public static boolean method3551() {
        return field812 || class55.field416[81];
    }

    @ObfuscatedName("m.jy(IIIIIIII)V")
    public static final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class227.method619(arg0)) {
            method3353(Statics.field3836[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("fw.jo([Lhz;IIIIIIII)V")
    public static final void method3353(class227[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class227 var9 = arg0[var8];
            if (var9 != null && var9.field2613 == arg1 && (!var9.field2593 || var9.field2596 == 0 || var9.field2616 || method836(var9) != 0 || field781 == var9 || var9.field2727 == 1338)) {
                if (var9.field2593) {
                    if (method779(var9)) {
                        continue;
                    }
                } else if (var9.field2596 == 0 && Statics.field438 != var9 && method779(var9)) {
                    continue;
                }
                int var10 = var9.field2607 + arg6;
                int var11 = var9.field2608 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2596 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2596 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2609 + var10;
                    int var19 = var9.field2647 + var11;
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
                    int var22 = var9.field2609 + var10;
                    int var23 = var9.field2647 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field838 == var9) {
                    field755 = true;
                    field785 = var10;
                    field848 = var11;
                }
                boolean var24 = false;
                if (var9.field2668) {
                    switch(field706) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2594 >>> 16 == field700) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field700 == var9.field2594) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2593 || var12 < var14 && var13 < var15) {
                    if (var9.field2593) {
                        if (var9.field2734) {
                            if (class64.field502 >= var12 && class64.field503 >= var13 && class64.field502 < var14 && class64.field503 < var15) {
                                for (class72 var25 = (class72) field810.method4721(); var25 != null; var25 = (class72) field810.method4706()) {
                                    if (var25.field586) {
                                        var25.method3486();
                                        var25.field587.field2725 = false;
                                    }
                                }
                                if (Statics.field2572 == 0) {
                                    field838 = null;
                                    field781 = null;
                                }
                                if (!field752) {
                                    method1223();
                                }
                            }
                        } else if (var9.field2735 && class64.field502 >= var12 && class64.field503 >= var13 && class64.field502 < var14 && class64.field503 < var15) {
                            for (class72 var26 = (class72) field810.method4721(); var26 != null; var26 = (class72) field810.method4706()) {
                                if (var26.field586 && var26.field587.field2701 == var26.field595) {
                                    var26.method3486();
                                }
                            }
                        }
                    }
                    int var27 = class64.field502;
                    int var28 = class64.field503;
                    if (class64.field509 != 0) {
                        var27 = class64.field510;
                        var28 = class64.field511;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2727 == 1337) {
                        if (!field673 && !field752 && var29) {
                            method2085(var27, var28, var12, var13);
                        }
                    } else if (var9.field2727 == 1338) {
                        method1096(var9, var10, var11);
                    } else {
                        if (var9.field2727 == 1400) {
                            Statics.field1453.method6020(class64.field502, class64.field503, var29, var10, var11, var9.field2609, var9.field2647);
                        }
                        if (!field752 && var29) {
                            if (var9.field2727 == 1400) {
                                Statics.field1453.method6071(var10, var11, var9.field2609, var9.field2647, var27, var28);
                            } else {
                                method802(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2669.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2669[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2669[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2661 != null) {
                                            var34 = class55.field416[var9.field2669[var30][var33]];
                                        }
                                        if (method440(var9.field2669[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2661 != null && var9.field2661[var30] > field729) {
                                                break;
                                            }
                                            byte var35 = var9.field2670[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class55.field416[86] && !class55.field416[82] && !class55.field416[81]) && ((var35 & 0x2) == 0 || class55.field416[86]) && ((var35 & 0x1) == 0 || class55.field416[82]) && ((var35 & 0x4) == 0 || class55.field416[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method1174(var30 + 1, var9.field2594, var9.field2595, var9.field2677, "");
                                    } else if (var30 == 10) {
                                        method340();
                                        method5582(var9.field2594, var9.field2595, Statics.method3749(method836(var9)), var9.field2677);
                                        field823 = method1226(var9);
                                        if (field823 == null) {
                                            field823 = class234.field2795;
                                        }
                                        field685 = var9.field2673 + class91.method3410(16777215);
                                    }
                                    int var36 = var9.field2687[var30];
                                    if (var9.field2661 == null) {
                                        var9.field2661 = new int[var9.field2669.length];
                                    }
                                    if (var9.field2600 == null) {
                                        var9.field2600 = new int[var9.field2669.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2661[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2661[var30] == 0) {
                                        var9.field2661[var30] = field729 + var36 + var9.field2600[var30];
                                    } else {
                                        var9.field2661[var30] = field729 + var36;
                                    }
                                }
                                if (!var31 && var9.field2661 != null) {
                                    var9.field2661[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2593) {
                            boolean var37;
                            if (class64.field502 >= var12 && class64.field503 >= var13 && class64.field502 < var14 && class64.field503 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class64.field501 == 1 || !Statics.field47 && class64.field501 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class64.field509 == 1 || !Statics.field47 && class64.field509 == 4) && class64.field510 >= var12 && class64.field511 >= var13 && class64.field510 < var14 && class64.field511 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method1849(var9, class64.field510 - var10, class64.field511 - var11);
                            }
                            if (var9.field2727 == 1400) {
                                Statics.field1453.method6024(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field838 != null && field838 != var9 && var37 && class228.method3471(method836(var9))) {
                                field842 = var9;
                            }
                            if (field781 == var9) {
                                field913 = true;
                                field715 = var10;
                                field845 = var11;
                            }
                            if (var9.field2616) {
                                if (var37 && field863 != 0 && var9.field2701 != null) {
                                    class72 var40 = new class72();
                                    var40.field586 = true;
                                    var40.field587 = var9;
                                    var40.field589 = field863;
                                    var40.field595 = var9.field2701;
                                    field810.method4699(var40);
                                }
                                if (field838 != null || Statics.field2060 != null || field752) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2726 && var39) {
                                    var9.field2726 = true;
                                    if (var9.field2682 != null) {
                                        class72 var41 = new class72();
                                        var41.field586 = true;
                                        var41.field587 = var9;
                                        var41.field588 = class64.field510 - var10;
                                        var41.field589 = class64.field511 - var11;
                                        var41.field595 = var9.field2682;
                                        field810.method4699(var41);
                                    }
                                }
                                if (var9.field2726 && var38 && var9.field2733 != null) {
                                    class72 var42 = new class72();
                                    var42.field586 = true;
                                    var42.field587 = var9;
                                    var42.field588 = class64.field502 - var10;
                                    var42.field589 = class64.field503 - var11;
                                    var42.field595 = var9.field2733;
                                    field810.method4699(var42);
                                }
                                if (var9.field2726 && !var38) {
                                    var9.field2726 = false;
                                    if (var9.field2684 != null) {
                                        class72 var43 = new class72();
                                        var43.field586 = true;
                                        var43.field587 = var9;
                                        var43.field588 = class64.field502 - var10;
                                        var43.field589 = class64.field503 - var11;
                                        var43.field595 = var9.field2684;
                                        field866.method4699(var43);
                                    }
                                }
                                if (var38 && var9.field2685 != null) {
                                    class72 var44 = new class72();
                                    var44.field586 = true;
                                    var44.field587 = var9;
                                    var44.field588 = class64.field502 - var10;
                                    var44.field589 = class64.field503 - var11;
                                    var44.field595 = var9.field2685;
                                    field810.method4699(var44);
                                }
                                if (!var9.field2725 && var37) {
                                    var9.field2725 = true;
                                    if (var9.field2686 != null) {
                                        class72 var45 = new class72();
                                        var45.field586 = true;
                                        var45.field587 = var9;
                                        var45.field588 = class64.field502 - var10;
                                        var45.field589 = class64.field503 - var11;
                                        var45.field595 = var9.field2686;
                                        field810.method4699(var45);
                                    }
                                }
                                if (var9.field2725 && var37 && var9.field2586 != null) {
                                    class72 var46 = new class72();
                                    var46.field586 = true;
                                    var46.field587 = var9;
                                    var46.field588 = class64.field502 - var10;
                                    var46.field589 = class64.field503 - var11;
                                    var46.field595 = var9.field2586;
                                    field810.method4699(var46);
                                }
                                if (var9.field2725 && !var37) {
                                    var9.field2725 = false;
                                    if (var9.field2688 != null) {
                                        class72 var47 = new class72();
                                        var47.field586 = true;
                                        var47.field587 = var9;
                                        var47.field588 = class64.field502 - var10;
                                        var47.field589 = class64.field503 - var11;
                                        var47.field595 = var9.field2688;
                                        field866.method4699(var47);
                                    }
                                }
                                if (var9.field2604 != null) {
                                    class72 var48 = new class72();
                                    var48.field587 = var9;
                                    var48.field595 = var9.field2604;
                                    field661.method4699(var48);
                                }
                                if (var9.field2693 != null && field768 > var9.field2728) {
                                    if (var9.field2694 == null || field768 - var9.field2728 > 32) {
                                        class72 var53 = new class72();
                                        var53.field587 = var9;
                                        var53.field595 = var9.field2693;
                                        field810.method4699(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2728; var49 < field768; var49++) {
                                            int var50 = field856[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2694.length; var51++) {
                                                if (var9.field2694[var51] == var50) {
                                                    class72 var52 = new class72();
                                                    var52.field587 = var9;
                                                    var52.field595 = var9.field2693;
                                                    field810.method4699(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2728 = field768;
                                }
                                if (var9.field2695 != null && field871 > var9.field2729) {
                                    if (var9.field2676 == null || field871 - var9.field2729 > 32) {
                                        class72 var58 = new class72();
                                        var58.field587 = var9;
                                        var58.field595 = var9.field2695;
                                        field810.method4699(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2729; var54 < field871; var54++) {
                                            int var55 = field836[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2676.length; var56++) {
                                                if (var9.field2676[var56] == var55) {
                                                    class72 var57 = new class72();
                                                    var57.field587 = var9;
                                                    var57.field595 = var9.field2695;
                                                    field810.method4699(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2729 = field871;
                                }
                                if (var9.field2672 != null && field678 > var9.field2730) {
                                    if (var9.field2698 == null || field678 - var9.field2730 > 32) {
                                        class72 var63 = new class72();
                                        var63.field587 = var9;
                                        var63.field595 = var9.field2672;
                                        field810.method4699(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2730; var59 < field678; var59++) {
                                            int var60 = field749[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2698.length; var61++) {
                                                if (var9.field2698[var61] == var60) {
                                                    class72 var62 = new class72();
                                                    var62.field587 = var9;
                                                    var62.field595 = var9.field2672;
                                                    field810.method4699(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2730 = field678;
                                }
                                if (field710 > var9.field2720 && var9.field2702 != null) {
                                    class72 var64 = new class72();
                                    var64.field587 = var9;
                                    var64.field595 = var9.field2702;
                                    field810.method4699(var64);
                                }
                                if (field858 > var9.field2720 && var9.field2718 != null) {
                                    class72 var65 = new class72();
                                    var65.field587 = var9;
                                    var65.field595 = var9.field2718;
                                    field810.method4699(var65);
                                }
                                if (field859 > var9.field2720 && var9.field2689 != null) {
                                    class72 var66 = new class72();
                                    var66.field587 = var9;
                                    var66.field595 = var9.field2689;
                                    field810.method4699(var66);
                                }
                                if (field711 > var9.field2720 && var9.field2704 != null) {
                                    class72 var67 = new class72();
                                    var67.field587 = var9;
                                    var67.field595 = var9.field2704;
                                    field810.method4699(var67);
                                }
                                if (field861 > var9.field2720 && var9.field2679 != null) {
                                    class72 var68 = new class72();
                                    var68.field587 = var9;
                                    var68.field595 = var9.field2679;
                                    field810.method4699(var68);
                                }
                                if (field862 > var9.field2720 && var9.field2706 != null) {
                                    class72 var69 = new class72();
                                    var69.field587 = var9;
                                    var69.field595 = var9.field2706;
                                    field810.method4699(var69);
                                }
                                var9.field2720 = field850;
                                if (var9.field2626 != null) {
                                    for (int var70 = 0; var70 < field886; var70++) {
                                        class72 var71 = new class72();
                                        var71.field587 = var9;
                                        var71.field592 = field739[var70];
                                        var71.field593 = field887[var70];
                                        var71.field595 = var9.field2626;
                                        field810.method4699(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2593) {
                            if (field838 != null || Statics.field2060 != null || field752) {
                                continue;
                            }
                            if ((var9.field2715 >= 0 || var9.field2621 != 0) && class64.field502 >= var12 && class64.field503 >= var13 && class64.field502 < var14 && class64.field503 < var15) {
                                if (var9.field2715 >= 0) {
                                    Statics.field438 = arg0[var9.field2715];
                                } else {
                                    Statics.field438 = var9;
                                }
                            }
                            if (var9.field2596 == 8 && class64.field502 >= var12 && class64.field503 >= var13 && class64.field502 < var14 && class64.field503 < var15) {
                                Statics.field101 = var9;
                            }
                            if (var9.field2618 > var9.field2647) {
                                method5625(var9, var9.field2609 + var10, var11, var9.field2647, var9.field2618, class64.field502, class64.field503);
                            }
                        }
                        if (var9.field2596 == 0) {
                            method3353(arg0, var9.field2594, var12, var13, var14, var15, var10 - var9.field2615, var11 - var9.field2736);
                            if (var9.field2584 != null) {
                                method3353(var9.field2584, var9.field2594, var12, var13, var14, var15, var10 - var9.field2615, var11 - var9.field2736);
                            }
                            class71 var72 = (class71) field826.method5682((long) var9.field2594);
                            if (var72 != null) {
                                if (var72.field575 == 0 && class64.field502 >= var12 && class64.field503 >= var13 && class64.field502 < var14 && class64.field503 < var15 && !field752) {
                                    for (class72 var73 = (class72) field810.method4721(); var73 != null; var73 = (class72) field810.method4706()) {
                                        if (var73.field586) {
                                            var73.method3486();
                                            var73.field587.field2725 = false;
                                        }
                                    }
                                    if (Statics.field2572 == 0) {
                                        field838 = null;
                                        field781 = null;
                                    }
                                    if (!field752) {
                                        method1223();
                                    }
                                }
                                method205(var72.field577, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.js(II)Z")
    public static boolean method440(int arg0) {
        for (int var1 = 0; var1 < field886; var1++) {
            if (field739[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("hx.jd(IIS)V")
    public static final void method3943(int arg0, int arg1) {
        if (class227.method619(arg0)) {
            method685(Statics.field3836[arg0], arg1);
        }
    }

    @ObfuscatedName("ad.jv([Lhz;IS)V")
    public static final void method685(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2596 == 0) {
                    if (var3.field2584 != null) {
                        method685(var3.field2584, arg1);
                    }
                    class71 var4 = (class71) field826.method5682((long) var3.field2594);
                    if (var4 != null) {
                        method3943(var4.field577, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2707 != null) {
                    class72 var5 = new class72();
                    var5.field587 = var3;
                    var5.field595 = var3.field2707;
                    class86.method2227(var5);
                }
                if (arg1 == 1 && var3.field2708 != null) {
                    if (var3.field2595 >= 0) {
                        class227 var6 = class227.method3963(var3.field2594);
                        if (var6 == null || var6.field2584 == null || var3.field2595 >= var6.field2584.length || var6.field2584[var3.field2595] != var3) {
                            continue;
                        }
                    }
                    class72 var7 = new class72();
                    var7.field587 = var3;
                    var7.field595 = var3.field2708;
                    class86.method2227(var7);
                }
            }
        }
    }

    @ObfuscatedName("cp.ji(Lhz;IIB)V")
    public static final void method1849(class227 arg0, int arg1, int arg2) {
        if (field838 != null || field752 || arg0 == null) {
            return;
        }
        class227 var3 = method3955(arg0);
        if (var3 == null) {
            var3 = arg0.field2697;
        }
        if (var3 == null) {
            return;
        }
        field838 = arg0;
        class227 var5 = method3955(arg0);
        if (var5 == null) {
            var5 = arg0.field2697;
        }
        field781 = var5;
        field840 = arg1;
        field841 = arg2;
        Statics.field2572 = 0;
        field849 = false;
        int var7 = field736 - 1;
        if (var7 != -1) {
            Statics.field2364 = new class92();
            Statics.field2364.field1170 = field803[var7];
            Statics.field2364.field1173 = field804[var7];
            Statics.field2364.field1171 = field805[var7];
            Statics.field2364.field1172 = field865[var7];
            Statics.field2364.field1174 = field876[var7];
        }
        return;
    }

    @ObfuscatedName("client.jw(I)V")
    public final void method1261() {
        method5979(field838);
        Statics.field2572++;
        if (field755 && field913) {
            int var1 = class64.field502;
            int var2 = class64.field503;
            int var3 = var1 - field840;
            int var4 = var2 - field841;
            if (var3 < field715) {
                var3 = field715;
            }
            if (field838.field2609 + var3 > field715 + field781.field2609) {
                var3 = field715 + field781.field2609 - field838.field2609;
            }
            if (var4 < field845) {
                var4 = field845;
            }
            if (field838.field2647 + var4 > field845 + field781.field2647) {
                var4 = field845 + field781.field2647 - field838.field2647;
            }
            int var5 = var3 - field785;
            int var6 = var4 - field848;
            int var7 = field838.field2703;
            if (Statics.field2572 > field838.field2675 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field849 = true;
            }
            int var8 = field781.field2615 + (var3 - field715);
            int var9 = field781.field2736 + (var4 - field845);
            if (field838.field2710 != null && field849) {
                class72 var10 = new class72();
                var10.field587 = field838;
                var10.field588 = var8;
                var10.field589 = var9;
                var10.field595 = field838.field2710;
                class86.method2227(var10);
            }
            if (class64.field501 == 0) {
                if (field849) {
                    if (field838.field2690 != null) {
                        class72 var11 = new class72();
                        var11.field587 = field838;
                        var11.field588 = var8;
                        var11.field589 = var9;
                        var11.field591 = field842;
                        var11.field595 = field838.field2690;
                        class86.method2227(var11);
                    }
                    if (field842 != null && method3955(field838) != null) {
                        class197 var12 = class197.method434(class193.field2273, field751.field1333);
                        var12.field2372.method5292(field842.field2594);
                        var12.field2372.method5229(field838.field2595);
                        var12.field2372.method5246(field838.field2677);
                        var12.field2372.method5281(field842.field2595);
                        var12.field2372.method5281(field842.field2677);
                        var12.field2372.method5292(field838.field2594);
                        field751.method2239(var12);
                    }
                } else if (this.method1257()) {
                    this.method1560(field840 + field785, field848 + field841);
                } else if (field736 > 0) {
                    method3497(field840 + field785, field848 + field841);
                }
                field838 = null;
            }
        } else if (Statics.field2572 > 1) {
            field838 = null;
        }
    }

    @ObfuscatedName("gv.ju(IIB)V")
    public static void method3497(int arg0, int arg1) {
        class92 var2 = Statics.field2364;
        method614(var2.field1170, var2.field1173, var2.field1171, var2.field1172, var2.field1174, var2.field1174, arg0, arg1);
        Statics.field2364 = null;
    }

    @ObfuscatedName("mw.ja(Lhz;S)V")
    public static void method5979(class227 arg0) {
        if (field869 == arg0.field2732) {
            field817[arg0.field2731] = true;
        }
    }

    @ObfuscatedName("hh.jf(I)V")
    public static void method3806() {
        for (class71 var0 = (class71) field826.method5684(); var0 != null; var0 = (class71) field826.method5685()) {
            int var1 = var0.field577;
            if (class227.method619(var1)) {
                boolean var2 = true;
                class227[] var3 = Statics.field3836[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2593;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2141;
                    class227 var6 = class227.method3963(var5);
                    if (var6 != null) {
                        method5979(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.jm(II)V")
    public static final void method127(int arg0) {
        if (!class227.method619(arg0)) {
            return;
        }
        class227[] var1 = Statics.field3836[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3 != null) {
                var3.field2722 = 0;
                var3.field2696 = 0;
            }
        }
    }

    @ObfuscatedName("ba.jt([Lhz;II)V")
    public static final void method1178(class227[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class227 var3 = arg0[var2];
            if (var3 != null && var3.field2613 == arg1 && (!var3.field2593 || !method779(var3))) {
                if (var3.field2596 == 0) {
                    if (!var3.field2593 && method779(var3) && Statics.field438 != var3) {
                        continue;
                    }
                    method1178(arg0, var3.field2594);
                    if (var3.field2584 != null) {
                        method1178(var3.field2584, var3.field2594);
                    }
                    class71 var4 = (class71) field826.method5682((long) var3.field2594);
                    if (var4 != null) {
                        int var5 = var4.field577;
                        if (class227.method619(var5)) {
                            method1178(Statics.field3836[var5], -1);
                        }
                    }
                }
                if (var3.field2596 == 6) {
                    if (var3.field2641 != -1 || var3.field2642 != -1) {
                        boolean var6 = method101(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2642;
                        } else {
                            var7 = var3.field2641;
                        }
                        if (var7 != -1) {
                            class270 var8 = Statics.method1124(var7);
                            var3.field2696 += field809;
                            while (var3.field2696 > var8.field3556[var3.field2722]) {
                                var3.field2696 -= var8.field3556[var3.field2722];
                                var3.field2722++;
                                if (var3.field2722 >= var8.field3554.length) {
                                    var3.field2722 -= var8.field3558;
                                    if (var3.field2722 < 0 || var3.field2722 >= var8.field3554.length) {
                                        var3.field2722 = 0;
                                    }
                                }
                                method5979(var3);
                            }
                        }
                    }
                    if (var3.field2650 != 0 && !var3.field2593) {
                        int var9 = var3.field2650 >> 16;
                        int var10 = var3.field2650 << 16 >> 16;
                        int var11 = field809 * var9;
                        int var12 = field809 * var10;
                        var3.field2645 = var3.field2645 + var11 & 0x7FF;
                        var3.field2646 = var3.field2646 + var12 & 0x7FF;
                        method5979(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dq.jk(D)V")
    public static final void method2501(double arg0) {
        class140.method2931(arg0);
        ((class129) Statics.field1777).method2667(arg0);
        class266.method216();
        Statics.field191.field1073 = arg0;
        class83.method213();
    }

    @ObfuscatedName("gs.jc(II)V")
    public static final void method3505(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field191.field1074 == var1) {
            return;
        }
        if (Statics.field191.field1074 == 0 && field807 != -1) {
            class207.method2270(Statics.field1954, field807, 0, var1, false);
            field900 = false;
        } else if (var1 == 0) {
            class207.method1134();
            field900 = false;
        } else if (class207.field2436 == 0) {
            Statics.field1773.method3637(var1);
        } else {
            Statics.field436 = var1;
        }
        Statics.field191.field1074 = var1;
        class83.method213();
    }

    @ObfuscatedName("fd.jq(IB)V")
    public static final void method3356(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field191.field1066 = var1;
        class83.method213();
    }

    @ObfuscatedName("ad.jr(IB)V")
    public static final void method692(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field191.field1071 = var1;
        class83.method213();
    }

    @ObfuscatedName("aj.jb(IB)V")
    public static final void method615(int arg0) {
        method3806();
        for (class85 var1 = (class85) class85.field1101.method4721(); var1 != null; var1 = (class85) class85.field1101.method4706()) {
            if (var1.field1103 != null) {
                var1.method1875();
            }
        }
        int var2 = class252.method3559(arg0).field3244;
        if (var2 == 0) {
            return;
        }
        int var3 = class222.field2556[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                method2501(0.9D);
            }
            if (var3 == 2) {
                method2501(0.8D);
            }
            if (var3 == 3) {
                method2501(0.7D);
            }
            if (var3 == 4) {
                method2501(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method3505(255);
            }
            if (var3 == 1) {
                method3505(192);
            }
            if (var3 == 2) {
                method3505(128);
            }
            if (var3 == 3) {
                method3505(64);
            }
            if (var3 == 4) {
                method3505(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method3356(127);
            }
            if (var3 == 1) {
                method3356(96);
            }
            if (var3 == 2) {
                method3356(64);
            }
            if (var3 == 3) {
                method3356(32);
            }
            if (var3 == 4) {
                method3356(0);
            }
        }
        if (var2 == 5) {
            field815 = var3;
        }
        if (var2 == 6) {
            field829 = var3;
        }
        if (var2 == 9) {
            field830 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method692(127);
            }
            if (var3 == 1) {
                method692(96);
            }
            if (var3 == 2) {
                method692(64);
            }
            if (var3 == 3) {
                method692(32);
            }
            if (var3 == 4) {
                method692(0);
            }
        }
        if (var2 == 17) {
            field835 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field690 = (class94) class205.method1123(class94.method1172(), var3);
            if (field690 == null) {
                field690 = class94.field1193;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field770 = -1;
            } else {
                field770 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field773 = (class94) class205.method1123(class94.method1172(), var3);
            if (field773 == null) {
                field773 = class94.field1193;
            }
        }
    }

    @ObfuscatedName("ak.jn(Lhz;B)V")
    public static final void method339(class227 arg0) {
        int var1 = arg0.field2727;
        if (var1 == 324) {
            if (field851 == -1) {
                field851 = arg0.field2629;
                field928 = arg0.field2630;
            }
            if (field857.field2565) {
                arg0.field2629 = field851;
            } else {
                arg0.field2629 = field928;
            }
        } else if (var1 == 325) {
            if (field851 == -1) {
                field851 = arg0.field2629;
                field928 = arg0.field2630;
            }
            if (field857.field2565) {
                arg0.field2629 = field928;
            } else {
                arg0.field2629 = field851;
            }
        } else if (var1 == 327) {
            arg0.field2645 = 150;
            arg0.field2646 = (int) (Math.sin((double) field729 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2637 = 5;
            arg0.field2683 = 0;
        } else if (var1 == 328) {
            arg0.field2645 = 150;
            arg0.field2646 = (int) (Math.sin((double) field729 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2637 = 5;
            arg0.field2683 = 1;
        }
    }

    @ObfuscatedName("gw.jh(B)V")
    public static final void method3554() {
        class197 var0 = class197.method434(class193.field2284, field751.field1333);
        field751.method2239(var0);
        for (class71 var1 = (class71) field826.method5684(); var1 != null; var1 = (class71) field826.method5685()) {
            if (var1.field575 == 0 || var1.field575 == 3) {
                method162(var1, true);
            }
        }
        if (field831 != null) {
            method5979(field831);
            field831 = null;
        }
    }

    @ObfuscatedName("hh.kp(IIII)Lbs;")
    public static final class71 method3807(int arg0, int arg1, int arg2) {
        class71 var3 = new class71();
        var3.field577 = arg1;
        var3.field575 = arg2;
        field826.method5683(var3, (long) arg0);
        method127(arg1);
        class227 var4 = class227.method3963(arg0);
        method5979(var4);
        if (field831 != null) {
            method5979(field831);
            field831 = null;
        }
        method321();
        method3478(Statics.field3836[arg0 >> 16], var4, false);
        class86.method2467(arg1);
        if (field827 != -1) {
            method3943(field827, 1);
        }
        return var3;
    }

    @ObfuscatedName("g.ku(Lbs;ZS)V")
    public static final void method162(class71 arg0, boolean arg1) {
        int var2 = arg0.field577;
        int var3 = (int) arg0.field2141;
        arg0.method3486();
        if (arg1 && var2 != -1 && Statics.field2723[var2]) {
            Statics.field3694.method4068(var2);
            if (Statics.field3836[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field3836[var2].length; var5++) {
                    if (Statics.field3836[var2][var5] != null) {
                        if (Statics.field3836[var2][var5].field2596 == 2) {
                            var4 = false;
                        } else {
                            Statics.field3836[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field3836[var2] = null;
                }
                Statics.field2723[var2] = false;
            }
        }
        method3548(var2);
        class227 var6 = class227.method3963(var3);
        if (var6 != null) {
            method5979(var6);
        }
        method321();
        if (field827 != -1) {
            method3943(field827, 1);
        }
    }

    @ObfuscatedName("ay.ke(Lhz;I)Z")
    public static final boolean method231(class227 arg0) {
        int var1 = arg0.field2727;
        if (var1 == 205) {
            field712 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field857.method3840(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field857.method3841(var4, var5 == 1);
        }
        if (var1 == 324) {
            field857.method3842(false);
        }
        if (var1 == 325) {
            field857.method3842(true);
        }
        if (var1 == 326) {
            class197 var6 = class197.method434(class193.field2323, field751.field1333);
            field857.method3843(var6.field2372);
            field751.method2239(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gc.ky(Lhz;IIII)V")
    public static final void method3555(class227 arg0, int arg1, int arg2, int arg3) {
        method3319();
        class221 var4 = arg0.method3891(false);
        if (var4 == null) {
            return;
        }
        class332.method5729(arg1, arg2, var4.field2546 + arg1, var4.field2547 + arg2);
        if (field888 == 2 || field888 == 5) {
            class332.method5784(arg1, arg2, 0, var4.field2552, var4.field2548);
        } else {
            int var5 = field735 & 0x7FF;
            int var6 = Statics.field1986.field957 / 32 + 48;
            int var7 = 464 - Statics.field1986.field954 / 32;
            Statics.field115.method5890(arg1, arg2, var4.field2546, var4.field2547, var6, var7, var5, 256, var4.field2552, var4.field2548);
            for (int var8 = 0; var8 < field801; var8++) {
                int var9 = field892[var8] * 4 + 2 - Statics.field1986.field957 / 32;
                int var10 = field893[var8] * 4 + 2 - Statics.field1986.field954 / 32;
                method4074(arg1, arg2, var9, var10, field894[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class273 var13 = field793[Statics.field1162][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1986.field957 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1986.field954 / 32;
                        method4074(arg1, arg2, var14, var15, Statics.field1321[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field707; var16++) {
                class89 var17 = field722[field708[var16]];
                if (var17 != null && var17.method1192()) {
                    class268 var18 = var17.field1150;
                    if (var18 != null && var18.field3528 != null) {
                        var18 = var18.method4534();
                    }
                    if (var18 != null && var18.field3519 && var18.field3531) {
                        int var19 = var17.field957 / 32 - Statics.field1986.field957 / 32;
                        int var20 = var17.field954 / 32 - Statics.field1986.field954 / 32;
                        method4074(arg1, arg2, var19, var20, Statics.field1321[1], var4);
                    }
                }
            }
            int var21 = class99.field1271;
            int[] var22 = class99.field1272;
            for (int var23 = 0; var23 < var21; var23++) {
                class76 var24 = field671[var22[var23]];
                if (var24 != null && var24.method1192() && !var24.field649 && Statics.field1986 != var24) {
                    int var25 = var24.field957 / 32 - Statics.field1986.field957 / 32;
                    int var26 = var24.field954 / 32 - Statics.field1986.field954 / 32;
                    boolean var27 = false;
                    if (Statics.field1986.field647 != 0 && var24.field647 != 0 && Statics.field1986.field647 == var24.field647) {
                        var27 = true;
                    }
                    if (var24.method1196()) {
                        method4074(arg1, arg2, var25, var26, Statics.field1321[3], var4);
                    } else if (var27) {
                        method4074(arg1, arg2, var25, var26, Statics.field1321[4], var4);
                    } else if (var24.method1184()) {
                        method4074(arg1, arg2, var25, var26, Statics.field1321[5], var4);
                    } else {
                        method4074(arg1, arg2, var25, var26, Statics.field1321[2], var4);
                    }
                }
            }
            if (field682 != 0 && field729 % 20 < 10) {
                if (field682 == 1 && field683 >= 0 && field683 < field722.length) {
                    class89 var28 = field722[field683];
                    if (var28 != null) {
                        int var29 = var28.field957 / 32 - Statics.field1986.field957 / 32;
                        int var30 = var28.field954 / 32 - Statics.field1986.field954 / 32;
                        method342(arg1, arg2, var29, var30, Statics.field70[1], var4);
                    }
                }
                if (field682 == 2) {
                    int var31 = field911 * 4 - Statics.field109 * 4 + 2 - Statics.field1986.field957 / 32;
                    int var32 = field686 * 4 - Statics.field3212 * 4 + 2 - Statics.field1986.field954 / 32;
                    method342(arg1, arg2, var31, var32, Statics.field70[1], var4);
                }
                if (field682 == 10 && field684 >= 0 && field684 < field671.length) {
                    class76 var33 = field671[field684];
                    if (var33 != null) {
                        int var34 = var33.field957 / 32 - Statics.field1986.field957 / 32;
                        int var35 = var33.field954 / 32 - Statics.field1986.field954 / 32;
                        method342(arg1, arg2, var34, var35, Statics.field70[1], var4);
                    }
                }
            }
            if (field895 != 0) {
                int var36 = field895 * 4 + 2 - Statics.field1986.field957 / 32;
                int var37 = field789 * 4 + 2 - Statics.field1986.field954 / 32;
                method4074(arg1, arg2, var36, var37, Statics.field70[0], var4);
            }
            if (!Statics.field1986.field649) {
                class332.method5763(var4.field2546 / 2 + arg1 - 1, var4.field2547 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field828[arg3] = true;
    }

    @ObfuscatedName("bd.kg(Lhz;IIIB)V")
    public static final void method1165(class227 arg0, int arg1, int arg2, int arg3) {
        class221 var4 = arg0.method3891(false);
        if (var4 == null) {
            return;
        }
        if (field888 < 3) {
            Statics.field1063.method5890(arg1, arg2, var4.field2546, var4.field2547, 25, 25, field735, 256, var4.field2552, var4.field2548);
        } else {
            class332.method5784(arg1, arg2, 0, var4.field2552, var4.field2548);
        }
    }

    @ObfuscatedName("ax.ka(IIIILlm;Lht;I)V")
    public static final void method342(int arg0, int arg1, int arg2, int arg3, class336 arg4, class221 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method4074(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field735 & 0x7FF;
        int var8 = class140.field1800[var7];
        int var9 = class140.field1801[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2546 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field3114.method5895(arg5.field2546 / 2 + arg0 - var17 / 2 + var15, arg5.field2547 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ig.km(IIIILlm;Lht;I)V")
    public static final void method4074(int arg0, int arg1, int arg2, int arg3, class336 arg4, class221 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field735 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class140.field1800[var6];
        int var9 = class140.field1801[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5852(arg5.field2546 / 2 + var10 - arg4.field3910 / 2, arg5.field2547 / 2 - var11 - arg4.field3916 / 2, arg0, arg1, arg5.field2546, arg5.field2547, arg5.field2552, arg5.field2548);
        } else {
            arg4.method5836(arg5.field2546 / 2 + arg0 + var10 - arg4.field3910 / 2, arg5.field2547 / 2 + arg1 - var11 - arg4.field3916 / 2);
        }
    }

    @ObfuscatedName("do.kk(I)V")
    public static final void method2268() {
        for (int var0 = 0; var0 < class99.field1271; var0++) {
            class76 var1 = field671[class99.field1272[var0]];
            var1.method1208();
        }
        class101.method3480();
        if (Statics.field295 != null) {
            Statics.field295.method5007();
        }
    }

    @ObfuscatedName("ao.ko(B)V")
    public static final void method737() {
        class101.method1761();
        if (Statics.field295 != null) {
            Statics.field295.method4991();
        }
    }

    @ObfuscatedName("bi.kt(I)V")
    public static final void method773() {
        field859 = field850;
        Statics.field431 = true;
    }

    @ObfuscatedName("dx.kj(Ljava/lang/String;I)V")
    public static final void method2251(String arg0) {
        if (Statics.field295 != null) {
            class197 var1 = class197.method434(class193.field2269, field751.field1333);
            var1.field2372.method5279(class311.method235(arg0));
            var1.field2372.method5257(arg0);
            field751.method2239(var1);
        }
    }

    @ObfuscatedName("ih.kw(Ljava/lang/String;I)V")
    public static final void method4301(String arg0) {
        if (!arg0.equals("")) {
            class197 var1 = class197.method434(class193.field2271, field751.field1333);
            var1.field2372.method5279(class311.method235(arg0));
            var1.field2372.method5257(arg0);
            field751.method2239(var1);
        }
    }

    @ObfuscatedName("bq.kb(I)V")
    public static final void method792() {
        class197 var0 = class197.method434(class193.field2271, field751.field1333);
        var0.field2372.method5279(0);
        field751.method2239(var0);
    }

    @ObfuscatedName("gw.kf(II)V")
    public static void method3548(int arg0) {
        for (class189 var1 = (class189) field867.method5684(); var1 != null; var1 = (class189) field867.method5685()) {
            if ((long) arg0 == (var1.field2141 >> 48 & 0xFFFFL)) {
                var1.method3486();
            }
        }
    }

    @ObfuscatedName("bw.kr(Lhz;B)I")
    public static int method836(class227 arg0) {
        class189 var1 = (class189) field867.method5682(((long) arg0.field2594 << 32) + (long) arg0.field2595);
        return var1 == null ? arg0.field2667 : var1.field2138;
    }

    @ObfuscatedName("hi.kz(Lhz;B)Lhz;")
    public static class227 method3955(class227 arg0) {
        int var1 = method836(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class227.method3963(arg0.field2613);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bp.kq(Lhz;B)Z")
    public static boolean method779(class227 arg0) {
        return arg0.field2614;
    }

    @ObfuscatedName("bk.ki(Lhz;B)Ljava/lang/String;")
    public static String method1226(class227 arg0) {
        if (Statics.method3749(method836(arg0)) == 0) {
            return null;
        } else if (arg0.field2692 == null || arg0.field2692.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2692;
        }
    }

    @ObfuscatedName("t.kn(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method186(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field664 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field664 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field664 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field664 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field664 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4101 != null) {
            var3 = "/p=" + Statics.field4101;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3535 + "/a=" + Statics.field1563 + var3 + "/";
    }

    @ObfuscatedName("gd.kl(Ljava/lang/String;B)V")
    public static void method3496(String arg0) {
        Statics.field4101 = arg0;
        try {
            String var1 = Statics.field7.getParameter(Integer.toString(18));
            String var2 = Statics.field7.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class308.method1082() + 94608000000L;
                class217.field2529.setTime(new Date(var6));
                int var8 = class217.field2529.get(7);
                int var9 = class217.field2529.get(5);
                int var10 = class217.field2529.get(2);
                int var11 = class217.field2529.get(1);
                int var12 = class217.field2529.get(11);
                int var13 = class217.field2529.get(12);
                int var14 = class217.field2529.get(13);
                String var15 = class217.field2527[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class217.field2528[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class57.method790(Statics.field7, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("bo.ks(Ljava/lang/String;ZI)V")
    public static void method1683(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field405; var5++) {
            class266 var6 = class266.method4793(var5);
            if ((!arg1 || var6.field3476) && var6.field3470 == -1 && var6.field3448.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1149 = -1;
                    Statics.field404 = null;
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
        Statics.field404 = var3;
        Statics.field156 = 0;
        Statics.field1149 = var4;
        String[] var9 = new String[Statics.field1149];
        for (int var10 = 0; var10 < Statics.field1149; var10++) {
            var9[var10] = class266.method4793(var3[var10]).field3448;
        }
        class199.method1711(var9, Statics.field404);
    }

    @ObfuscatedName("gb.kc(Lkx;IB)V")
    public static void method3494(class311 arg0, int arg1) {
        byte[] var2 = arg0.field3746;
        if (field794 == null) {
            field794 = new byte[24];
        }
        class312.method5490(var2, arg1, field794, 0, 24);
        if (class177.field2062 == null) {
            return;
        }
        try {
            class177.field2062.method6242(0L);
            class177.field2062.method6246(arg0.field3746, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("bu.kh(Lkx;I)V")
    public static void method1240(class311 arg0) {
        if (field794 == null) {
            byte[] var1 = class177.method2084();
            arg0.method5238(var1, 0, var1.length);
        } else {
            arg0.method5238(field794, 0, field794.length);
        }
    }

    @ObfuscatedName("client.kd(B)Lkk;")
    public class294 method1494() {
        return Statics.field1986 == null ? null : Statics.field1986.field630;
    }

    @ObfuscatedName("ka.kx(B)Z")
    public static boolean method4955() {
        return field754 >= 2;
    }

    @ObfuscatedName("al.kv(II)V")
    public static void method433(int arg0) {
        field740 = arg0;
    }

    @ObfuscatedName("an.lk(S)V")
    public static void method620() {
        if (field740 == 1) {
            field748 = true;
        }
    }

    @ObfuscatedName("w.lx(I)V")
    public static void method99() {
        if (!field748 || Statics.field1986 == null) {
            return;
        }
        int var0 = Statics.field1986.field1009[0];
        int var1 = Statics.field1986.field986[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1021 = Statics.field1986.field957;
        int var2 = method576(Statics.field1986.field957, Statics.field1986.field954, Statics.field1162) - field896;
        if (var2 < Statics.field1883) {
            Statics.field1883 = var2;
        }
        Statics.field625 = Statics.field1986.field954;
        field748 = false;
    }

    @ObfuscatedName("hc.lh(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3788(String arg0) {
        class240[] var1 = class240.method1119();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class240 var3 = var1[var2];
            if (var3.field3132 != -1 && arg0.startsWith(class91.method3300(var3.field3132))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3132).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("km.ls(B)V")
    public static void method4962() {
        if (Statics.field1017 == null) {
            return;
        }
        field675 = field729;
        Statics.field1017.method4120();
        for (int var0 = 0; var0 < field671.length; var0++) {
            if (field671[var0] != null) {
                Statics.field1017.method4119((field671[var0].field957 >> 7) + Statics.field109, (field671[var0].field954 >> 7) + Statics.field3212);
            }
        }
    }
}

package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class54 implements class281 {

    @ObfuscatedName("client.w")
    public static class173[] field711 = new class173[4];

    @ObfuscatedName("client.ab")
    public static boolean field913 = true;

    @ObfuscatedName("client.bp")
    public static int field808 = 1;

    @ObfuscatedName("client.bz")
    public static int field654 = 0;

    @ObfuscatedName("client.bg")
    public static int field704 = 0;

    @ObfuscatedName("client.bn")
    public static boolean field656 = false;

    @ObfuscatedName("client.bc")
    public static boolean field657 = false;

    @ObfuscatedName("client.bj")
    public static int field762 = -1;

    @ObfuscatedName("client.bl")
    public static boolean field659 = false;

    @ObfuscatedName("client.bd")
    public static int field663 = 0;

    @ObfuscatedName("client.ct")
    public static boolean field662 = true;

    @ObfuscatedName("client.cq")
    public static int field882 = 0;

    @ObfuscatedName("client.cp")
    public static long field664 = -1L;

    @ObfuscatedName("client.co")
    public static int field718 = -1;

    @ObfuscatedName("client.cw")
    public static int field666 = -1;

    @ObfuscatedName("client.ca")
    public static long field667 = -1L;

    @ObfuscatedName("client.cb")
    public static boolean field668 = true;

    @ObfuscatedName("client.cx")
    public static boolean field885 = false;

    @ObfuscatedName("client.cu")
    public static int field670 = 0;

    @ObfuscatedName("client.cs")
    public static int field709 = 0;

    @ObfuscatedName("client.cg")
    public static int field825 = 0;

    @ObfuscatedName("client.cv")
    public static int field690 = 0;

    @ObfuscatedName("client.ce")
    public static int field738 = 0;

    @ObfuscatedName("client.cz")
    public static int field778 = 0;

    @ObfuscatedName("client.cm")
    public static int field676 = 0;

    @ObfuscatedName("client.ck")
    public static int field822 = 0;

    @ObfuscatedName("client.cc")
    public static int field678 = 0;

    @ObfuscatedName("client.cd")
    public static class85 field679 = class85.field1171;

    @ObfuscatedName("client.dr")
    public static class85 field680 = class85.field1171;

    @ObfuscatedName("client.dw")
    public static int field681 = 0;

    @ObfuscatedName("client.dt")
    public static int field682 = 0;

    @ObfuscatedName("client.dj")
    public static int field683 = 0;

    @ObfuscatedName("client.ej")
    public static int field686 = 0;

    @ObfuscatedName("client.eu")
    public static int field687 = 0;

    @ObfuscatedName("client.eo")
    public static int field688 = 0;

    @ObfuscatedName("client.em")
    public static int field689 = 0;

    @ObfuscatedName("client.en")
    public static int field837 = 0;

    @ObfuscatedName("client.ek")
    public static class161 field691 = class161.field2002;

    @ObfuscatedName("client.ep")
    public static boolean field692 = false;

    @ObfuscatedName("client.eq")
    public static class89 field693 = new class89();

    @ObfuscatedName("client.ee")
    public static byte[] field694 = null;

    @ObfuscatedName("client.ec")
    public static class80[] field695 = new class80[32768];

    @ObfuscatedName("client.eb")
    public static int field696 = 0;

    @ObfuscatedName("client.fi")
    public static int[] field697 = new int[32768];

    @ObfuscatedName("client.fk")
    public static int field698 = 0;

    @ObfuscatedName("client.fg")
    public static int[] field860 = new int[250];

    @ObfuscatedName("client.fr")
    public static final class96 field881 = new class96();

    @ObfuscatedName("client.ft")
    public static int field701 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field702 = false;

    @ObfuscatedName("client.fa")
    public static boolean field816 = true;

    @ObfuscatedName("client.fs")
    public static class273 field798 = new class273();

    @ObfuscatedName("client.fv")
    public static HashMap field705 = new HashMap();

    @ObfuscatedName("client.fc")
    public static int field706 = 0;

    @ObfuscatedName("client.fw")
    public static int field707 = 1;

    @ObfuscatedName("client.fh")
    public static int field708 = 0;

    @ObfuscatedName("client.gc")
    public static int field897 = 1;

    @ObfuscatedName("client.gx")
    public static int field710 = 0;

    @ObfuscatedName("client.gj")
    public static boolean field799 = false;

    @ObfuscatedName("client.gd")
    public static int[][][] field713 = new int[4][13][13];

    @ObfuscatedName("client.gt")
    public static final int[] field714 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gk")
    public static int field719 = 0;

    @ObfuscatedName("client.ha")
    public static int field716 = 2301979;

    @ObfuscatedName("client.hk")
    public static int field717 = 5063219;

    @ObfuscatedName("client.hu")
    public static int field721 = 3353893;

    @ObfuscatedName("client.hg")
    public static int field773 = 7759444;

    @ObfuscatedName("client.he")
    public static boolean field720 = false;

    @ObfuscatedName("client.hv")
    public static int field883 = 0;

    @ObfuscatedName("client.hz")
    public static int field722 = 128;

    @ObfuscatedName("client.ho")
    public static int field723 = 0;

    @ObfuscatedName("client.hs")
    public static int field724 = 0;

    @ObfuscatedName("client.hx")
    public static int field725 = 0;

    @ObfuscatedName("client.hf")
    public static int field726 = 0;

    @ObfuscatedName("client.hw")
    public static int field727 = 0;

    @ObfuscatedName("client.hi")
    public static int field728 = 0;

    @ObfuscatedName("client.hn")
    public static int field729 = 50;

    @ObfuscatedName("client.hq")
    public static int field929 = 0;

    @ObfuscatedName("client.hp")
    public static int field732 = 0;

    @ObfuscatedName("client.ir")
    public static int field872 = 0;

    @ObfuscatedName("client.ii")
    public static int field734 = 12;

    @ObfuscatedName("client.ih")
    public static int field735 = 6;

    @ObfuscatedName("client.if")
    public static int field856 = 0;

    @ObfuscatedName("client.ig")
    public static boolean field737 = false;

    @ObfuscatedName("client.ik")
    public static int field823 = 0;

    @ObfuscatedName("client.iw")
    public static boolean field879 = false;

    @ObfuscatedName("client.id")
    public static int field740 = 0;

    @ObfuscatedName("client.ib")
    public static int field741 = 0;

    @ObfuscatedName("client.ic")
    public static int field868 = 50;

    @ObfuscatedName("client.im")
    public static int[] field743 = new int[field868];

    @ObfuscatedName("client.ip")
    public static int[] field744 = new int[field868];

    @ObfuscatedName("client.il")
    public static int[] field745 = new int[field868];

    @ObfuscatedName("client.ia")
    public static int[] field677 = new int[field868];

    @ObfuscatedName("client.ie")
    public static int[] field703 = new int[field868];

    @ObfuscatedName("client.in")
    public static int[] field806 = new int[field868];

    @ObfuscatedName("client.iv")
    public static int[] field749 = new int[field868];

    @ObfuscatedName("client.io")
    public static String[] field750 = new String[field868];

    @ObfuscatedName("client.iy")
    public static int[][] field751 = new int[104][104];

    @ObfuscatedName("client.iq")
    public static int field752 = 0;

    @ObfuscatedName("client.ij")
    public static int field753 = -1;

    @ObfuscatedName("client.it")
    public static String field739 = null;

    @ObfuscatedName("client.is")
    public static int field754 = -1;

    @ObfuscatedName("client.ju")
    public static int field877 = 0;

    @ObfuscatedName("client.jh")
    public static int field756 = 0;

    @ObfuscatedName("client.je")
    public static int field757 = 0;

    @ObfuscatedName("client.jl")
    public static int field758 = 0;

    @ObfuscatedName("client.jq")
    public static boolean field759 = true;

    @ObfuscatedName("client.jt")
    public static int field760 = 0;

    @ObfuscatedName("client.jn")
    public static int field699 = 0;

    @ObfuscatedName("client.jm")
    public static int field766 = 0;

    @ObfuscatedName("client.jj")
    public static int field655 = 0;

    @ObfuscatedName("client.jr")
    public static int field764 = 0;

    @ObfuscatedName("client.jw")
    public static int field765 = 0;

    @ObfuscatedName("client.jd")
    public static boolean field875 = false;

    @ObfuscatedName("client.ja")
    public static int field767 = 0;

    @ObfuscatedName("client.jf")
    public static int field768 = 0;

    @ObfuscatedName("client.jo")
    public static boolean field785 = true;

    @ObfuscatedName("client.jg")
    public static class67[] field910 = new class67[2048];

    @ObfuscatedName("client.jc")
    public static int field771 = -1;

    @ObfuscatedName("client.jv")
    public static int field772 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field774 = true;

    @ObfuscatedName("client.kk")
    public static int field775 = 0;

    @ObfuscatedName("client.kv")
    public static int field776 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field777 = new int[1000];

    @ObfuscatedName("client.kz")
    public static final int[] field812 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ke")
    public static String[] field779 = new String[8];

    @ObfuscatedName("client.kn")
    public static boolean[] field780 = new boolean[8];

    @ObfuscatedName("client.kh")
    public static int[] field781 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kq")
    public static int field782 = -1;

    @ObfuscatedName("client.kx")
    public static class262[][][] field888 = new class262[4][104][104];

    @ObfuscatedName("client.kf")
    public static class262 field784 = new class262();

    @ObfuscatedName("client.kw")
    public static class262 field671 = new class262();

    @ObfuscatedName("client.kr")
    public static class262 field786 = new class262();

    @ObfuscatedName("client.ki")
    public static int[] field761 = new int[25];

    @ObfuscatedName("client.kg")
    public static int[] field788 = new int[25];

    @ObfuscatedName("client.ky")
    public static int[] field789 = new int[25];

    @ObfuscatedName("client.kb")
    public static int field790 = 0;

    @ObfuscatedName("client.kp")
    public static boolean field675 = false;

    @ObfuscatedName("client.ln")
    public static int field792 = 0;

    @ObfuscatedName("client.lq")
    public static int[] field793 = new int[500];

    @ObfuscatedName("client.le")
    public static int[] field794 = new int[500];

    @ObfuscatedName("client.la")
    public static int[] field795 = new int[500];

    @ObfuscatedName("client.lg")
    public static int[] field796 = new int[500];

    @ObfuscatedName("client.lc")
    public static String[] field797 = new String[500];

    @ObfuscatedName("client.ls")
    public static String[] field669 = new String[500];

    @ObfuscatedName("client.lk")
    public static boolean[] field770 = new boolean[500];

    @ObfuscatedName("client.lb")
    public static boolean field800 = false;

    @ObfuscatedName("client.ll")
    public static boolean field801 = false;

    @ObfuscatedName("client.lx")
    public static boolean field802 = false;

    @ObfuscatedName("client.ly")
    public static boolean field803 = true;

    @ObfuscatedName("client.lm")
    public static int field804 = -1;

    @ObfuscatedName("client.lz")
    public static int field805 = -1;

    @ObfuscatedName("client.lo")
    public static int field841 = 0;

    @ObfuscatedName("client.lh")
    public static int field834 = 50;

    @ObfuscatedName("client.lw")
    public static int field901 = 0;

    @ObfuscatedName("client.lj")
    public static boolean field811 = false;

    @ObfuscatedName("client.li")
    public static int field849 = -1;

    @ObfuscatedName("client.mu")
    public static int field813 = -1;

    @ObfuscatedName("client.mq")
    public static String field814 = null;

    @ObfuscatedName("client.ml")
    public static String field815 = null;

    @ObfuscatedName("client.mn")
    public static int field906 = -1;

    @ObfuscatedName("client.ma")
    public static class319 field817 = new class319(8);

    @ObfuscatedName("client.mc")
    public static int field818 = 0;

    @ObfuscatedName("client.mw")
    public static int field819 = -1;

    @ObfuscatedName("client.mx")
    public static int field820 = 0;

    @ObfuscatedName("client.mt")
    public static int field810 = 0;

    @ObfuscatedName("client.mv")
    public static class218 field851 = null;

    @ObfuscatedName("client.my")
    public static int field911 = 0;

    @ObfuscatedName("client.mh")
    public static int field824 = 0;

    @ObfuscatedName("client.md")
    public static int field891 = 0;

    @ObfuscatedName("client.ms")
    public static int field826 = -1;

    @ObfuscatedName("client.mm")
    public static boolean field827 = false;

    @ObfuscatedName("client.mg")
    public static class218 field828 = null;

    @ObfuscatedName("client.mz")
    public static class218 field829 = null;

    @ObfuscatedName("client.mf")
    public static class218 field830 = null;

    @ObfuscatedName("client.mo")
    public static int field831 = 0;

    @ObfuscatedName("client.mi")
    public static int field832 = 0;

    @ObfuscatedName("client.me")
    public static class218 field833 = null;

    @ObfuscatedName("client.nr")
    public static boolean field874 = false;

    @ObfuscatedName("client.nx")
    public static int field835 = -1;

    @ObfuscatedName("client.ni")
    public static int field836 = -1;

    @ObfuscatedName("client.nt")
    public static boolean field746 = false;

    @ObfuscatedName("client.ns")
    public static int field838 = -1;

    @ObfuscatedName("client.nq")
    public static int field839 = -1;

    @ObfuscatedName("client.nn")
    public static boolean field840 = false;

    @ObfuscatedName("client.nh")
    public static int field674 = 1;

    @ObfuscatedName("client.nk")
    public static int[] field864 = new int[32];

    @ObfuscatedName("client.nf")
    public static int field807 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field889 = new int[32];

    @ObfuscatedName("client.nm")
    public static int field672 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field846 = new int[32];

    @ObfuscatedName("client.no")
    public static int field847 = 0;

    @ObfuscatedName("client.nw")
    public static int field848 = 0;

    @ObfuscatedName("client.ny")
    public static int field673 = 0;

    @ObfuscatedName("client.nv")
    public static int field850 = 0;

    @ObfuscatedName("client.nb")
    public static int field916 = 0;

    @ObfuscatedName("client.nz")
    public static int field852 = 0;

    @ObfuscatedName("client.nu")
    public static int field845 = 0;

    @ObfuscatedName("client.oc")
    public static int field854 = 0;

    @ObfuscatedName("client.og")
    public static class262 field855 = new class262();

    @ObfuscatedName("client.ok")
    public static class262 field853 = new class262();

    @ObfuscatedName("client.ov")
    public static class262 field857 = new class262();

    @ObfuscatedName("client.of")
    public static class319 field858 = new class319(512);

    @ObfuscatedName("client.ou")
    public static int field859 = 0;

    @ObfuscatedName("client.on")
    public static int field742 = -2;

    @ObfuscatedName("client.os")
    public static boolean[] field844 = new boolean[100];

    @ObfuscatedName("client.ot")
    public static boolean[] field862 = new boolean[100];

    @ObfuscatedName("client.oh")
    public static boolean[] field863 = new boolean[100];

    @ObfuscatedName("client.oj")
    public static int[] field809 = new int[100];

    @ObfuscatedName("client.oo")
    public static int[] field865 = new int[100];

    @ObfuscatedName("client.od")
    public static int[] field866 = new int[100];

    @ObfuscatedName("client.om")
    public static int[] field861 = new int[100];

    @ObfuscatedName("client.op")
    public static int field769 = 0;

    @ObfuscatedName("client.oz")
    public static long field869 = 0L;

    @ObfuscatedName("client.ob")
    public static boolean field870 = true;

    @ObfuscatedName("client.ps")
    public static int[] field871 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pv")
    public static int field908 = 0;

    @ObfuscatedName("client.pl")
    public static int field873 = 0;

    @ObfuscatedName("client.pj")
    public static String field763 = "";

    @ObfuscatedName("client.pa")
    public static long[] field923 = new long[100];

    @ObfuscatedName("client.pw")
    public static int field876 = 0;

    @ObfuscatedName("client.pc")
    public static int field755 = 0;

    @ObfuscatedName("client.pd")
    public static int[] field878 = new int[128];

    @ObfuscatedName("client.pk")
    public static int[] field922 = new int[128];

    @ObfuscatedName("client.po")
    public static long field880 = -1L;

    @ObfuscatedName("client.pb")
    public static int field748 = -1;

    @ObfuscatedName("client.pg")
    public static int field731 = 0;

    @ObfuscatedName("client.pz")
    public static int[] field665 = new int[1000];

    @ObfuscatedName("client.ph")
    public static int[] field884 = new int[1000];

    @ObfuscatedName("client.pu")
    public static class326[] field787 = new class326[1000];

    @ObfuscatedName("client.py")
    public static int field886 = 0;

    @ObfuscatedName("client.pe")
    public static int field843 = 0;

    @ObfuscatedName("client.qc")
    public static int field653 = 0;

    @ObfuscatedName("client.qh")
    public static int field912 = 255;

    @ObfuscatedName("client.qf")
    public static int field890 = -1;

    @ObfuscatedName("client.qe")
    public static boolean field700 = false;

    @ObfuscatedName("client.qg")
    public static int field892 = 127;

    @ObfuscatedName("client.qr")
    public static int field893 = 127;

    @ObfuscatedName("client.qq")
    public static int field894 = 0;

    @ObfuscatedName("client.qd")
    public static int[] field895 = new int[50];

    @ObfuscatedName("client.qs")
    public static int[] field896 = new int[50];

    @ObfuscatedName("client.qo")
    public static int[] field898 = new int[50];

    @ObfuscatedName("client.qt")
    public static int[] field842 = new int[50];

    @ObfuscatedName("client.qx")
    public static class102[] field899 = new class102[50];

    @ObfuscatedName("client.qi")
    public static boolean field900 = false;

    @ObfuscatedName("client.rt")
    public static boolean[] field887 = new boolean[5];

    @ObfuscatedName("client.rh")
    public static int[] field902 = new int[5];

    @ObfuscatedName("client.rl")
    public static int[] field903 = new int[5];

    @ObfuscatedName("client.rn")
    public static int[] field904 = new int[5];

    @ObfuscatedName("client.ri")
    public static int[] field905 = new int[5];

    @ObfuscatedName("client.rf")
    public static short field783 = 256;

    @ObfuscatedName("client.rs")
    public static short field652 = 205;

    @ObfuscatedName("client.ra")
    public static short field907 = 256;

    @ObfuscatedName("client.rv")
    public static short field909 = 320;

    @ObfuscatedName("client.re")
    public static short field821 = 1;

    @ObfuscatedName("client.ry")
    public static short field791 = 32767;

    @ObfuscatedName("client.rm")
    public static short field733 = 1;

    @ObfuscatedName("client.rp")
    public static short field660 = 32767;

    @ObfuscatedName("client.rd")
    public static int field914 = 0;

    @ObfuscatedName("client.rq")
    public static int field915 = 0;

    @ObfuscatedName("client.rw")
    public static int field747 = 0;

    @ObfuscatedName("client.ro")
    public static int field715 = 0;

    @ObfuscatedName("client.ru")
    public static int field918 = 0;

    @ObfuscatedName("client.rg")
    public static class215 field919 = new class215();

    @ObfuscatedName("client.sc")
    public static int field920 = -1;

    @ObfuscatedName("client.sp")
    public static int field921 = -1;

    @ObfuscatedName("client.sn")
    public static class331 field712 = new class330();

    @ObfuscatedName("client.sf")
    public static class10[] field867 = new class10[8];

    @ObfuscatedName("client.sb")
    public static class68 field924 = new class68();

    @ObfuscatedName("client.sl")
    public static int field925 = -1;

    @ObfuscatedName("client.so")
    public static ArrayList field926 = new ArrayList(10);

    @ObfuscatedName("client.sj")
    public static int field927 = 0;

    @ObfuscatedName("client.st")
    public static int field928 = 0;

    @ObfuscatedName("client.tn")
    public static final class66 field736 = new class66();

    @ObfuscatedName("client.tq")
    public static int[] field930 = new int[50];

    @ObfuscatedName("client.tz")
    public static int[] field931 = new int[50];

    @ObfuscatedName("ag.ek(I)Llw;")
    public static class334 method482() {
        return Statics.field1876;
    }

    @ObfuscatedName("client.ap(I)V")
    public final void method797() {
    }

    public final void init() {
        if (!this.method796()) {
            return;
        }
        class272[] var1 = class272.method2999();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class272 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3598);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3598)) {
                    case 1:
                        field816 = Integer.parseInt(var4) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class82.field1148)) {
                            field656 = true;
                        } else {
                            field656 = false;
                        }
                        break;
                    case 4:
                        if (field762 == -1) {
                            field762 = Integer.parseInt(var4);
                        }
                        break;
                    case 5:
                        field654 = Integer.parseInt(var4);
                        break;
                    case 6:
                        int var6 = Integer.parseInt(var4);
                        class191 var7;
                        if (var6 >= 0 && var6 < class191.field2356.length) {
                            var7 = class191.field2356[var6];
                        } else {
                            var7 = null;
                        }
                        Statics.field529 = var7;
                        break;
                    case 7:
                        Statics.field2338 = class230.method3766(Integer.parseInt(var4));
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class82.field1148)) {
                        }
                        break;
                    case 9:
                        Statics.field3696 = var4;
                        break;
                    case 10:
                        class231[] var5 = new class231[] { class231.field3111, class231.field3108, class231.field3110, class231.field3107, class231.field3109, class231.field3113 };
                        Statics.field249 = (class231) class196.method2257(var5, Integer.parseInt(var4));
                        if (Statics.field249 == class231.field3111) {
                            Statics.field354 = class339.field4053;
                        } else {
                            Statics.field354 = class339.field4057;
                        }
                        break;
                    case 12:
                        field808 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field3200 = Integer.parseInt(var4);
                        break;
                    case 15:
                        field704 = Integer.parseInt(var4);
                        break;
                    case 17:
                        Statics.field214 = var4;
                }
            }
        }
        method3659();
        Statics.field1069 = this.getCodeBase().getHost();
        String var8 = Statics.field2338.field3101;
        byte var9 = 0;
        try {
            class168.method3151("oldschool", var8, var9, 21);
        } catch (Exception var11) {
            class342.method4173((String) null, var11);
        }
        Statics.field234 = this;
        Statics.field4067 = field762;
        this.method858(765, 503, 181);
    }

    @ObfuscatedName("hy.eg(I)V")
    public static final void method3659() {
        class134.field1849 = false;
        field657 = false;
    }

    @ObfuscatedName("client.aw(I)V")
    public final void method757() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field3741 = null;
            Statics.field382 = null;
            Statics.field2344 = (byte[][][]) null;
        } else {
            Statics.field3741 = var1;
            Statics.field382 = new int[var1.length];
            Statics.field2344 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field3741.length; var3++) {
                Statics.field2344[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field2359 = field704 == 0 ? 43594 : field808 + 40000;
        Statics.field1801 = field704 == 0 ? 443 : field808 + 50000;
        Statics.field1267 = Statics.field2359;
        Statics.field1871 = class216.field2541;
        Statics.field3292 = class216.field2542;
        Statics.field310 = class216.field2543;
        Statics.field605 = class216.field2547;
        Statics.field3535 = new class144();
        this.method834();
        this.method794();
        Statics.field330 = this.method739();
        Statics.field574 = new class309(255, class168.field2043, class168.field2040, 500000);
        Statics.field118 = class74.method2992();
        this.method740();
        class52.method3747(this, Statics.field567);
        if (field704 != 0) {
            field885 = true;
        }
        method3197(Statics.field118.field1065);
        Statics.field547 = new class75(Statics.field354);
    }

    @ObfuscatedName("client.ad(B)V")
    public final void method758() {
        field882++;
        this.method1106();
        while (true) {
            class262 var1 = class235.field3147;
            class232 var2;
            synchronized (class235.field3147) {
                var2 = (class232) class235.field3146.method4515();
            }
            if (var2 == null) {
                try {
                    if (class198.field2403 == 1) {
                        int var4 = Statics.field1100.method3380();
                        if (var4 > 0 && Statics.field1100.method3386()) {
                            int var5 = var4 - Statics.field2405;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field1100.method3379(var5);
                        } else {
                            Statics.field1100.method3385();
                            Statics.field1100.method3383();
                            if (Statics.field77 == null) {
                                class198.field2403 = 0;
                            } else {
                                class198.field2403 = 2;
                            }
                            Statics.field1982 = null;
                            Statics.field120 = null;
                        }
                    }
                } catch (Exception var17) {
                    var17.printStackTrace();
                    Statics.field1100.method3385();
                    class198.field2403 = 0;
                    Statics.field1982 = null;
                    Statics.field120 = null;
                    Statics.field77 = null;
                }
                method3298();
                class46 var7 = class46.field393;
                synchronized (class46.field393) {
                    class46.field407++;
                    class46.field397 = class46.field386;
                    class46.field387 = 0;
                    if (class46.field399 >= 0) {
                        while (class46.field399 != class46.field389) {
                            int var9 = class46.field392[class46.field389];
                            class46.field389 = class46.field389 + 1 & 0x7F;
                            if (var9 < 0) {
                                class46.field396[~var9] = false;
                            } else {
                                if (!class46.field396[var9] && class46.field387 < class46.field402.length - 1) {
                                    class46.field402[++class46.field387 - 1] = var9;
                                }
                                class46.field396[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class46.field396[var8] = false;
                        }
                        class46.field399 = class46.field389;
                    }
                    if (class46.field387 > 0) {
                        class46.field407 = 0;
                    }
                    class46.field386 = class46.field405;
                }
                class55 var11 = class55.field480;
                synchronized (class55.field480) {
                    class55.field486 = class55.field482;
                    class55.field493 = class55.field489;
                    class55.field488 = class55.field478;
                    class55.field483 = class55.field485;
                    class55.field494 = class55.field490;
                    class55.field484 = class55.field491;
                    class55.field496 = class55.field492;
                    class55.field498 = class55.field501;
                    class55.field490 = 0;
                }
                if (Statics.field330 != null) {
                    int var13 = Statics.field330.method640();
                    field854 = var13;
                }
                if (field663 == 0) {
                    method4631();
                    class54.method3010();
                } else if (field663 == 5) {
                    class86.method4101(this);
                    method4631();
                    class54.method3010();
                } else if (field663 == 10 || field663 == 11) {
                    class86.method4101(this);
                } else if (field663 == 20) {
                    class86.method4101(this);
                    this.method1109();
                } else if (field663 == 25) {
                    method3307();
                }
                if (field663 == 30) {
                    this.method1110();
                } else if (field663 == 40 || field663 == 45) {
                    this.method1109();
                }
                return;
            }
            var2.field3118.method3893(var2.field3117, (int) var2.field2114, var2.field3116, false);
        }
    }

    @ObfuscatedName("client.ag(ZB)V")
    public final void method759(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class198.field2403 == 2) {
                    if (Statics.field1982 == null) {
                        Statics.field1982 = class204.method3558(Statics.field77, Statics.field2404, Statics.field2408);
                        if (Statics.field1982 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field120 == null) {
                        Statics.field120 = new class109(Statics.field2402, Statics.field2401);
                    }
                    if (Statics.field1100.method3392(Statics.field1982, Statics.field2407, Statics.field120, 22050)) {
                        Statics.field1100.method3434();
                        Statics.field1100.method3379(Statics.field530);
                        Statics.field1100.method3461(Statics.field1982, Statics.field1993);
                        class198.field2403 = 0;
                        Statics.field1982 = null;
                        Statics.field120 = null;
                        Statics.field77 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field1100.method3385();
                class198.field2403 = 0;
                Statics.field1982 = null;
                Statics.field120 = null;
                Statics.field77 = null;
            }
            var2 = false;
        }
        if (var2 && field700 && Statics.field1145 != null) {
            Statics.field1145.method2208();
        }
        if ((field663 == 10 || field663 == 20 || field663 == 30) && field869 != 0L && class298.method3576() > field869) {
            method3197(method506());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field844[var5] = true;
            }
        }
        if (field663 == 0) {
            this.method761(class86.field1189, class86.field1190, arg0);
        } else if (field663 == 5) {
            class86.method3333(Statics.field194, Statics.field2530, Statics.field2055);
        } else if (field663 == 10 || field663 == 11) {
            class86.method3333(Statics.field194, Statics.field2530, Statics.field2055);
        } else if (field663 == 20) {
            class86.method3333(Statics.field194, Statics.field2530, Statics.field2055);
        } else if (field663 == 25) {
            if (field710 == 1) {
                if (field706 > field707) {
                    field707 = field706;
                }
                int var6 = (field707 * 50 - field706 * 50) / field707;
                method4780(class225.field2768 + class82.field1152 + class82.field1151 + var6 + "%" + class82.field1154, false);
            } else if (field710 == 2) {
                if (field708 > field897) {
                    field897 = field708;
                }
                int var7 = (field897 * 50 - field708 * 50) / field897 + 50;
                method4780(class225.field2768 + class82.field1152 + class82.field1151 + var7 + "%" + class82.field1154, false);
            } else {
                method4780(class225.field2768, false);
            }
        } else if (field663 == 30) {
            this.method1112();
        } else if (field663 == 40) {
            method4780(class225.field2937 + class82.field1152 + class225.field2761, false);
        } else if (field663 == 45) {
            method4780(class225.field2919, false);
        }
        if (field663 == 30 && field769 == 0 && !arg0 && !field870) {
            for (int var8 = 0; var8 < field859; var8++) {
                if (field862[var8]) {
                    Statics.field2487.method720(field809[var8], field865[var8], field866[var8], field861[var8]);
                    field862[var8] = false;
                }
            }
        } else if (field663 > 0) {
            Statics.field2487.method719(0, 0);
            for (int var9 = 0; var9 < field859; var9++) {
                field862[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ar(I)V")
    public final void method845() {
        if (Statics.field2058.method1908()) {
            Statics.field2058.method1909();
        }
        if (Statics.field349 != null) {
            Statics.field349.field591 = false;
        }
        Statics.field349 = null;
        field881.method2037();
        class46.method2585();
        class55.method3728();
        Statics.field330 = null;
        if (Statics.field1145 != null) {
            Statics.field1145.method2219();
        }
        if (Statics.field2362 != null) {
            Statics.field2362.method2219();
        }
        if (Statics.field3177 != null) {
            Statics.field3177.method3204();
        }
        class235.method1902();
        if (Statics.field3535 != null) {
            Statics.field3535.method3016();
            Statics.field3535 = null;
        }
        try {
            class168.field2043.method6056();
            for (int var1 = 0; var1 < Statics.field351; var1++) {
                Statics.field2042[var1].method6056();
            }
            class168.field2040.method6056();
            class168.field2041.method6056();
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("client.es(I)V")
    public void method1106() {
        if (field663 != 1000) {
            boolean var1 = class237.method309();
            if (!var1) {
                this.method1107();
            }
        }
    }

    @ObfuscatedName("client.ez(I)V")
    public void method1107() {
        if (class237.field3180 >= 4) {
            this.method763("js5crc");
            field663 = 1000;
            return;
        }
        if (class237.field3179 >= 4) {
            if (field663 <= 5) {
                this.method763("js5io");
                field663 = 1000;
                return;
            }
            field683 = 3000;
            class237.field3179 = 3;
        }
        if (--field683 + 1 > 0) {
            return;
        }
        try {
            if (field682 == 0) {
                Statics.field2364 = Statics.field464.method3176(Statics.field1069, Statics.field1267);
                field682++;
            }
            if (field682 == 1) {
                if (Statics.field2364.field2023 == 2) {
                    this.method1108(-1);
                    return;
                }
                if (Statics.field2364.field2023 == 1) {
                    field682++;
                }
            }
            if (field682 == 2) {
                if (field816) {
                    Statics.field1016 = class306.method5343((Socket) Statics.field2364.field2026, 40000, 5000);
                } else {
                    Statics.field1016 = new class172((Socket) Statics.field2364.field2026, Statics.field464, 5000);
                }
                class301 var1 = new class301(5);
                var1.method5228(15);
                var1.method5054(181);
                Statics.field1016.method3210(var1.field3731, 0, 5);
                field682++;
                Statics.field2383 = class298.method3576();
            }
            if (field682 == 3) {
                if (Statics.field1016.method3206() > 0 || !field816 && field663 <= 5) {
                    int var2 = Statics.field1016.method3205();
                    if (var2 != 0) {
                        this.method1108(var2);
                        return;
                    }
                    field682++;
                } else if (class298.method3576() - Statics.field2383 > 30000L) {
                    this.method1108(-2);
                    return;
                }
            }
            if (field682 == 4) {
                class237.method2002(Statics.field1016, field663 > 20);
                Statics.field2364 = null;
                Statics.field1016 = null;
                field682 = 0;
                field686 = 0;
            }
        } catch (IOException var4) {
            this.method1108(-3);
        }
    }

    @ObfuscatedName("client.ex(IB)V")
    public void method1108(int arg0) {
        Statics.field2364 = null;
        Statics.field1016 = null;
        field682 = 0;
        if (Statics.field2359 == Statics.field1267) {
            Statics.field1267 = Statics.field1801;
        } else {
            Statics.field1267 = Statics.field2359;
        }
        field686++;
        if (field686 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field663 <= 5) {
                this.method763("js5connect_full");
                field663 = 1000;
            } else {
                field683 = 3000;
            }
        } else if (field686 >= 2 && arg0 == 6) {
            this.method763("js5connect_outofdate");
            field663 = 1000;
        } else if (field686 >= 4) {
            if (field663 <= 5) {
                this.method763("js5connect");
                field663 = 1000;
            } else {
                field683 = 3000;
            }
        }
    }

    @ObfuscatedName("aa.el(Liu;Ljava/lang/String;I)V")
    public static void method625(class236 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field926.add(var2);
        field928 += var2.field540;
    }

    @ObfuscatedName("gu.ep(I)Z")
    public static boolean method3344() {
        if (field926 == null || field927 >= field926.size()) {
            return true;
        }
        while (field927 < field926.size()) {
            class59 var0 = (class59) field926.get(field927);
            if (!var0.method957()) {
                return false;
            }
            field927++;
        }
        return true;
    }

    @ObfuscatedName("jz.eq(B)I")
    public static int method4779() {
        if (field926 == null || field927 >= field926.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field927; var1++) {
            var0 += ((class59) field926.get(var1)).field543;
        }
        return var0 * 10000 / field928;
    }

    @ObfuscatedName("ap.ew(IB)I")
    public static int method583(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("jr.ed(I)V")
    public static void method4631() {
        if (field681 == 0) {
            Statics.field23 = new class134(4, 104, 104, class56.field517);
            for (int var0 = 0; var0 < 4; var0++) {
                field711[var0] = new class173(104, 104);
            }
            Statics.field2103 = new class326(512, 512);
            class86.field1190 = class225.field2771;
            class86.field1189 = 5;
            field681 = 20;
        } else if (field681 == 20) {
            class86.field1190 = class225.field2933;
            class86.field1189 = 10;
            field681 = 30;
        } else if (field681 == 30) {
            Statics.field2406 = method1031(0, false, true, true);
            Statics.field2050 = method1031(1, false, true, true);
            Statics.field2545 = method1031(2, true, false, true);
            Statics.field383 = method1031(3, false, true, true);
            Statics.field90 = method1031(4, false, true, true);
            Statics.field308 = method1031(5, true, true, true);
            Statics.field254 = method1031(6, true, true, true);
            Statics.field3501 = method1031(7, false, true, true);
            Statics.field684 = method1031(8, false, true, true);
            Statics.field19 = method1031(9, false, true, true);
            Statics.field111 = method1031(10, false, true, true);
            Statics.field280 = method1031(11, false, true, true);
            Statics.field1972 = method1031(12, false, true, true);
            Statics.field7 = method1031(13, true, false, true);
            Statics.field1648 = method1031(14, false, true, true);
            Statics.field651 = method1031(15, false, true, true);
            Statics.field233 = method1031(17, true, true, true);
            Statics.field685 = method1031(18, false, true, true);
            Statics.field3458 = method1031(19, false, true, true);
            Statics.field1875 = method1031(20, false, true, true);
            class86.field1190 = class225.field2773;
            class86.field1189 = 20;
            field681 = 40;
        } else if (field681 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field2406.method3890() * 4 / 100;
            int var3 = var2 + Statics.field2050.method3890() * 4 / 100;
            int var4 = var3 + Statics.field2545.method3890() * 2 / 100;
            int var5 = var4 + Statics.field383.method3890() * 2 / 100;
            int var6 = var5 + Statics.field90.method3890() * 6 / 100;
            int var7 = var6 + Statics.field308.method3890() * 4 / 100;
            int var8 = var7 + Statics.field254.method3890() * 2 / 100;
            int var9 = var8 + Statics.field3501.method3890() * 56 / 100;
            int var10 = var9 + Statics.field684.method3890() * 2 / 100;
            int var11 = var10 + Statics.field19.method3890() * 2 / 100;
            int var12 = var11 + Statics.field111.method3890() * 2 / 100;
            int var13 = var12 + Statics.field280.method3890() * 2 / 100;
            int var14 = var13 + Statics.field1972.method3890() * 2 / 100;
            int var15 = var14 + Statics.field7.method3890() * 2 / 100;
            int var16 = var15 + Statics.field1648.method3890() * 2 / 100;
            int var17 = var16 + Statics.field651.method3890() * 2 / 100;
            int var18 = var17 + Statics.field3458.method3890() / 100;
            int var19 = var18 + Statics.field685.method3890() / 100;
            int var20 = var19 + Statics.field1875.method3890() / 100;
            int var21 = var20 + (Statics.field233.method3889() && Statics.field233.method3779() ? 1 : 0);
            if (var21 == 100) {
                method625(Statics.field2406, "Animations");
                method625(Statics.field2050, "Skeletons");
                method625(Statics.field90, "Sound FX");
                method625(Statics.field308, "Maps");
                method625(Statics.field254, "Music Tracks");
                method625(Statics.field3501, "Models");
                method625(Statics.field684, "Sprites");
                method625(Statics.field280, "Music Jingles");
                method625(Statics.field1648, "Music Samples");
                method625(Statics.field651, "Music Patches");
                method625(Statics.field3458, "World Map");
                method625(Statics.field685, "World Map Geography");
                method625(Statics.field1875, "World Map Ground");
                Statics.field1996 = new class313();
                Statics.field1996.method5432(Statics.field233);
                class86.field1190 = class225.field2775;
                class86.field1189 = 30;
                field681 = 45;
            } else {
                if (var21 != 0) {
                    class86.field1190 = class225.field2795 + var21 + "%";
                }
                class86.field1189 = 30;
            }
        } else if (field681 == 45) {
            class106.method2596(22050, !field657, 2);
            class199 var22 = new class199();
            var22.method3393(9, 128);
            Statics.field1145 = class106.method3887(Statics.field464, 0, 22050);
            Statics.field1145.method2217(var22);
            class198.method956(Statics.field651, Statics.field1648, Statics.field90, var22);
            Statics.field2362 = class106.method3887(Statics.field464, 1, 2048);
            Statics.field533 = new class99();
            Statics.field2362.method2217(Statics.field533);
            Statics.field1178 = new class113(22050, Statics.field2079);
            class86.field1190 = class225.field2776;
            class86.field1189 = 35;
            field681 = 50;
            Statics.field2057 = new class294(Statics.field684, Statics.field7);
        } else if (field681 == 50) {
            class293[] var23 = new class293[] { class293.field3682, class293.field3678, class293.field3677, class293.field3680, class293.field3685, class293.field3679 };
            int var24 = var23.length;
            class294 var25 = Statics.field2057;
            class293[] var26 = new class293[] { class293.field3682, class293.field3678, class293.field3677, class293.field3680, class293.field3685, class293.field3679 };
            field705 = var25.method4902(var26);
            if (field705.size() < var24) {
                class86.field1190 = class225.field2873 + field705.size() * 100 / var24 + "%";
                class86.field1189 = 40;
            } else {
                Statics.field2530 = (class296) field705.get(class293.field3677);
                Statics.field2055 = (class296) field705.get(class293.field3678);
                Statics.field194 = (class296) field705.get(class293.field3679);
                Statics.field175 = field712.method5787();
                class86.field1190 = class225.field2778;
                class86.field1189 = 40;
                field681 = 60;
            }
        } else if (field681 == 60) {
            class236 var27 = Statics.field111;
            class236 var28 = Statics.field684;
            int var29 = 0;
            if (var27.method3795("title.jpg", "")) {
                var29++;
            }
            if (var28.method3795("logo", "")) {
                var29++;
            }
            if (var28.method3795("logo_deadman_mode", "")) {
                var29++;
            }
            if (var28.method3795("titlebox", "")) {
                var29++;
            }
            if (var28.method3795("titlebutton", "")) {
                var29++;
            }
            if (var28.method3795("runes", "")) {
                var29++;
            }
            if (var28.method3795("title_mute", "")) {
                var29++;
            }
            if (var28.method3795("options_radio_buttons,0", "")) {
                var29++;
            }
            if (var28.method3795("options_radio_buttons,2", "")) {
                var29++;
            }
            if (var28.method3795("options_radio_buttons,4", "")) {
                var29++;
            }
            if (var28.method3795("options_radio_buttons,6", "")) {
                var29++;
            }
            var28.method3795("sl_back", "");
            var28.method3795("sl_flags", "");
            var28.method3795("sl_arrows", "");
            var28.method3795("sl_stars", "");
            var28.method3795("sl_button", "");
            int var32 = class86.method983();
            if (var29 < var32) {
                class86.field1190 = class225.field2779 + var29 * 100 / var32 + "%";
                class86.field1189 = 50;
            } else {
                class86.field1190 = class225.field2780;
                class86.field1189 = 50;
                Statics.method2069(5);
                field681 = 70;
            }
        } else if (field681 == 70) {
            if (Statics.field2545.method3779()) {
                class236 var33 = Statics.field2545;
                Statics.field3506 = var33;
                class245.method358(Statics.field2545);
                class246.method52(Statics.field2545, Statics.field3501);
                class236 var34 = Statics.field2545;
                class236 var35 = Statics.field3501;
                boolean var36 = field657;
                Statics.field3396 = var34;
                Statics.field3352 = var35;
                class254.field3353 = var36;
                class257.method2997(Statics.field2545, Statics.field3501);
                class251.method1863(Statics.field2545);
                class236 var37 = Statics.field2545;
                class236 var38 = Statics.field3501;
                boolean var39 = field656;
                class296 var40 = Statics.field2530;
                Statics.field1277 = var37;
                Statics.field3406 = var38;
                Statics.field1869 = var39;
                Statics.field3456 = Statics.field1277.method3785(10);
                Statics.field1130 = var40;
                class236 var41 = Statics.field2545;
                class236 var42 = Statics.field2406;
                class236 var43 = Statics.field2050;
                Statics.field3528 = var41;
                Statics.field3517 = var42;
                Statics.field3518 = var43;
                class236 var44 = Statics.field2545;
                class236 var45 = Statics.field3501;
                Statics.field3248 = var44;
                Statics.field380 = var45;
                class236 var46 = Statics.field2545;
                Statics.field3299 = var46;
                class241.method54(Statics.field2545);
                class218.method3036(Statics.field383, Statics.field3501, Statics.field684, Statics.field7);
                class240.method159(Statics.field2545);
                class236 var47 = Statics.field2545;
                Statics.field3315 = var47;
                class243.method48(Statics.field2545);
                class250.method656(Statics.field2545);
                Statics.field2058 = new class91();
                class236 var48 = Statics.field2545;
                class236 var49 = Statics.field684;
                class236 var50 = Statics.field7;
                Statics.field3328 = var48;
                Statics.field3344 = var49;
                Statics.field3327 = var50;
                class236 var51 = Statics.field2545;
                class236 var52 = Statics.field684;
                Statics.field3282 = var51;
                Statics.field3281 = var52;
                class236 var53 = Statics.field2545;
                class236 var54 = Statics.field684;
                Statics.field3226 = var54;
                if (var53.method3779()) {
                    Statics.field3847 = var53.method3785(35);
                    Statics.field3220 = new class242[Statics.field3847];
                    for (int var55 = 0; var55 < Statics.field3847; var55++) {
                        byte[] var56 = var53.method3775(35, var55);
                        Statics.field3220[var55] = new class242(var55);
                        if (var56 != null) {
                            Statics.field3220[var55].method3986(new class301(var56));
                            Statics.field3220[var55].method3987();
                        }
                    }
                }
                class86.field1190 = class225.field2782;
                class86.field1189 = 60;
                field681 = 80;
            } else {
                class86.field1190 = class225.field2947 + Statics.field2545.method3888() + "%";
                class86.field1189 = 60;
            }
        } else if (field681 == 80) {
            int var57 = 0;
            if (Statics.field608 == null) {
                Statics.field608 = class327.method1040(Statics.field684, Statics.field1996.field3827, 0);
            } else {
                var57++;
            }
            if (Statics.field1973 == null) {
                Statics.field1973 = class327.method1040(Statics.field684, Statics.field1996.field3824, 0);
            } else {
                var57++;
            }
            if (Statics.field3661 == null) {
                Statics.field3661 = Statics.method4862(Statics.field684, Statics.field1996.field3825, 0);
            } else {
                var57++;
            }
            if (Statics.field1990 == null) {
                Statics.field1990 = class327.method2805(Statics.field684, Statics.field1996.field3826, 0);
            } else {
                var57++;
            }
            if (Statics.field1443 == null) {
                Statics.field1443 = class327.method2805(Statics.field684, Statics.field1996.field3831, 0);
            } else {
                var57++;
            }
            if (Statics.field2097 == null) {
                Statics.field2097 = class327.method2805(Statics.field684, Statics.field1996.field3828, 0);
            } else {
                var57++;
            }
            if (Statics.field343 == null) {
                Statics.field343 = class327.method2805(Statics.field684, Statics.field1996.field3829, 0);
            } else {
                var57++;
            }
            if (Statics.field1916 == null) {
                Statics.field1916 = class327.method2805(Statics.field684, Statics.field1996.field3830, 0);
            } else {
                var57++;
            }
            if (Statics.field2747 == null) {
                Statics.field2747 = class327.method2805(Statics.field684, Statics.field1996.field3833, 0);
            } else {
                var57++;
            }
            if (Statics.field83 == null) {
                Statics.field83 = Statics.method4862(Statics.field684, Statics.field1996.field3832, 0);
            } else {
                var57++;
            }
            if (Statics.field73 == null) {
                Statics.field73 = Statics.method4862(Statics.field684, Statics.field1996.field3823, 0);
            } else {
                var57++;
            }
            if (var57 < 11) {
                class86.field1190 = class225.field2863 + var57 * 100 / 12 + "%";
                class86.field1189 = 70;
            } else {
                Statics.field3721 = Statics.field73;
                Statics.field1973.method5665();
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3661[0].method5611(var58 + var61, var59 + var61, var60 + var61);
                class86.field1190 = class225.field2784;
                class86.field1189 = 70;
                field681 = 90;
            }
        } else if (field681 == 90) {
            if (Statics.field19.method3779()) {
                Statics.field41 = new class120(Statics.field19, Statics.field684, 20, 0.8D, field657 ? 64 : 128);
                class131.method2726(Statics.field41);
                class131.method2721(0.8D);
                field681 = 100;
            } else {
                class86.field1190 = class225.field2785 + "0%";
                class86.field1189 = 90;
            }
        } else if (field681 == 100) {
            int var62 = Statics.field41.method2506();
            if (var62 < 100) {
                class86.field1190 = class225.field2785 + var62 + "%";
                class86.field1189 = 90;
            } else {
                class86.field1190 = class225.field2786;
                class86.field1189 = 90;
                field681 = 110;
            }
        } else if (field681 == 110) {
            Statics.field349 = new class64();
            Statics.field464.method3170(Statics.field349, 10);
            class86.field1190 = class225.field2976;
            class86.field1189 = 92;
            field681 = 120;
        } else if (field681 == 120) {
            if (Statics.field111.method3795("huffman", "")) {
                class210 var63 = new class210(Statics.field111.method3794("huffman", ""));
                Statics.field2516 = var63;
                class86.field1190 = class225.field2839;
                class86.field1189 = 94;
                field681 = 130;
            } else {
                class86.field1190 = class225.field2788 + "%";
                class86.field1189 = 94;
            }
        } else if (field681 == 130) {
            if (!Statics.field383.method3779()) {
                class86.field1190 = class225.field2790 + Statics.field383.method3888() * 4 / 5 + "%";
                class86.field1189 = 96;
            } else if (!Statics.field1972.method3779()) {
                class86.field1190 = class225.field2790 + (80 + Statics.field1972.method3888() / 6) + "%";
                class86.field1189 = 96;
            } else if (Statics.field7.method3779()) {
                class86.field1190 = class225.field3000;
                class86.field1189 = 98;
                field681 = 140;
            } else {
                class86.field1190 = class225.field2790 + (96 + Statics.field7.method3888() / 50) + "%";
                class86.field1189 = 96;
            }
        } else if (field681 == 140) {
            class86.field1189 = 100;
            if (Statics.field3458.method3796(class36.field309.field307)) {
                if (Statics.field1876 == null) {
                    Statics.field1876 = new class334();
                    Statics.field1876.method5814(Statics.field3458, Statics.field685, Statics.field1875, Statics.field194, field705, Statics.field3661);
                }
                class86.field1190 = class225.field3053;
                field681 = 150;
            } else {
                class86.field1190 = class225.field2792 + Statics.field3458.method3869(class36.field309.field307) / 10 + "%";
            }
        } else if (field681 == 150) {
            Statics.method2069(10);
        }
    }

    @ObfuscatedName("bl.ee(IZZZB)Liu;")
    public static class236 method1031(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class309 var4 = null;
        if (class168.field2043 != null) {
            var4 = new class309(arg0, class168.field2043, Statics.field2042[arg0], 1000000);
        }
        return new class236(var4, Statics.field574, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ea(I)V")
    public final void method1109() {
        class306 var1 = field881.method2027();
        class300 var2 = field881.field1315;
        try {
            if (field687 == 0) {
                if (Statics.field188 == null && (field693.method1876() || field688 > 250)) {
                    Statics.field188 = field693.method1866();
                    field693.method1873();
                    field693 = null;
                }
                if (Statics.field188 != null) {
                    if (var1 != null) {
                        var1.method3204();
                        var1 = null;
                    }
                    Statics.field3629 = null;
                    field702 = false;
                    field688 = 0;
                    field687 = 1;
                }
            }
            if (field687 == 1) {
                if (Statics.field3629 == null) {
                    Statics.field3629 = Statics.field464.method3176(Statics.field1069, Statics.field1267);
                }
                if (Statics.field3629.field2023 == 2) {
                    throw new IOException();
                }
                if (Statics.field3629.field2023 == 1) {
                    if (field816) {
                        var1 = class306.method5343((Socket) Statics.field3629.field2026, 40000, 5000);
                    } else {
                        var1 = new class172((Socket) Statics.field3629.field2026, Statics.field464, 5000);
                    }
                    field881.method2025(var1);
                    Statics.field3629 = null;
                    field687 = 2;
                }
            }
            if (field687 == 2) {
                field881.method2022();
                class188 var3;
                if (class188.field2337 == 0) {
                    var3 = new class188();
                } else {
                    var3 = class188.field2336[--class188.field2337];
                }
                var3.field2339 = null;
                var3.field2333 = 0;
                var3.field2334 = new class300(5000);
                var3.field2334.method5228(class185.field2307.field2314);
                field881.method2023(var3);
                field881.method2038();
                var2.field3733 = 0;
                field687 = 3;
            }
            if (field687 == 3) {
                if (Statics.field1145 != null) {
                    Statics.field1145.method2207();
                }
                if (Statics.field2362 != null) {
                    Statics.field2362.method2207();
                }
                boolean var7 = true;
                if (field816 && !var1.method3216(1)) {
                    var7 = false;
                }
                if (var7) {
                    int var8 = var1.method3205();
                    if (Statics.field1145 != null) {
                        Statics.field1145.method2207();
                    }
                    if (Statics.field2362 != null) {
                        Statics.field2362.method2207();
                    }
                    if (var8 != 0) {
                        method261(var8);
                        return;
                    }
                    var2.field3733 = 0;
                    field687 = 4;
                }
            }
            if (field687 == 4) {
                if (var2.field3733 < 8) {
                    int var9 = var1.method3206();
                    if (var9 > 8 - var2.field3733) {
                        var9 = 8 - var2.field3733;
                    }
                    if (var9 > 0) {
                        var1.method3208(var2.field3731, var2.field3733, var9);
                        var2.field3733 += var9;
                    }
                }
                if (var2.field3733 == 8) {
                    var2.field3733 = 0;
                    Statics.field1873 = var2.method5104();
                    field687 = 5;
                }
            }
            if (field687 == 5) {
                field881.field1315.field3733 = 0;
                field881.method2022();
                class300 var10 = new class300(500);
                int[] var11 = new int[] { Statics.field188.nextInt(), Statics.field188.nextInt(), Statics.field188.nextInt(), Statics.field188.nextInt() };
                var10.field3733 = 0;
                var10.method5228(1);
                var10.method5054(var11[0]);
                var10.method5054(var11[1]);
                var10.method5054(var11[2]);
                var10.method5054(var11[3]);
                var10.method5056(Statics.field1873);
                if (field663 == 40) {
                    var10.method5054(Statics.field1075[0]);
                    var10.method5054(Statics.field1075[1]);
                    var10.method5054(Statics.field1075[2]);
                    var10.method5054(Statics.field1075[3]);
                } else {
                    var10.method5228(field691.method30());
                    switch(field691.field2004) {
                        case 0:
                            var10.method5054((Integer) Statics.field118.field1068.get(class292.method2714(class86.field1181)));
                            break;
                        case 1:
                        case 2:
                            var10.method5053(Statics.field66);
                            var10.field3733++;
                            break;
                        case 3:
                            var10.field3733 += 4;
                    }
                    var10.method5228(class314.field3838.method30());
                    var10.method5058(class86.field1199);
                }
                var10.method5090(class84.field1166, class84.field1163);
                Statics.field1075 = var11;
                class188 var12;
                if (class188.field2337 == 0) {
                    var12 = new class188();
                } else {
                    var12 = class188.field2336[--class188.field2337];
                }
                var12.field2339 = null;
                var12.field2333 = 0;
                var12.field2334 = new class300(5000);
                var12.field2334.field3733 = 0;
                if (field663 == 40) {
                    var12.field2334.method5228(class185.field2312.field2314);
                } else {
                    var12.field2334.method5228(class185.field2309.field2314);
                }
                var12.field2334.method5052(0);
                int var16 = var12.field2334.field3733;
                var12.field2334.method5054(181);
                var12.field2334.method5054(1);
                var12.field2334.method5228(field762);
                var12.field2334.method5061(var10.field3731, 0, var10.field3733);
                int var17 = var12.field2334.field3733;
                var12.field2334.method5058(class86.field1181);
                var12.field2334.method5228((field870 ? 1 : 0) << 1 | (field657 ? 1 : 0));
                var12.field2334.method5052(Statics.field47);
                var12.field2334.method5052(Statics.field3309);
                class300 var18 = var12.field2334;
                if (field694 == null) {
                    byte[] var19 = new byte[24];
                    try {
                        class168.field2041.method6037(0L);
                        class168.field2041.method6063(var19);
                        int var20;
                        for (var20 = 0; var20 < 24 && var19[var20] == 0; var20++) {
                        }
                        if (var20 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var51) {
                        for (int var22 = 0; var22 < 24; var22++) {
                            var19[var22] = -1;
                        }
                    }
                    var18.method5061(var19, 0, var19.length);
                } else {
                    var18.method5061(field694, 0, field694.length);
                }
                var12.field2334.method5058(Statics.field3696);
                var12.field2334.method5054(Statics.field3200);
                class301 var25 = new class301(Statics.field175.method5798());
                Statics.field175.method5797(var25);
                var12.field2334.method5061(var25.field3731, 0, var25.field3731.length);
                var12.field2334.method5228(field762);
                var12.field2334.method5054(0);
                var12.field2334.method5054(Statics.field2406.field3137);
                var12.field2334.method5054(Statics.field2050.field3137);
                var12.field2334.method5054(Statics.field2545.field3137);
                var12.field2334.method5054(Statics.field383.field3137);
                var12.field2334.method5054(Statics.field90.field3137);
                var12.field2334.method5054(Statics.field308.field3137);
                var12.field2334.method5054(Statics.field254.field3137);
                var12.field2334.method5054(Statics.field3501.field3137);
                var12.field2334.method5054(Statics.field684.field3137);
                var12.field2334.method5054(Statics.field19.field3137);
                var12.field2334.method5054(Statics.field111.field3137);
                var12.field2334.method5054(Statics.field280.field3137);
                var12.field2334.method5054(Statics.field1972.field3137);
                var12.field2334.method5054(Statics.field7.field3137);
                var12.field2334.method5054(Statics.field1648.field3137);
                var12.field2334.method5054(Statics.field651.field3137);
                var12.field2334.method5054(0);
                var12.field2334.method5054(Statics.field233.field3137);
                var12.field2334.method5054(Statics.field685.field3137);
                var12.field2334.method5054(Statics.field3458.field3137);
                var12.field2334.method5054(Statics.field1875.field3137);
                var12.field2334.method5264(var11, var17, var12.field2334.field3733);
                var12.field2334.method5063(var12.field2334.field3733 - var16);
                field881.method2023(var12);
                field881.method2038();
                field881.field1314 = new class329(var11);
                int[] var26 = new int[4];
                for (int var27 = 0; var27 < 4; var27++) {
                    var26[var27] = var11[var27] + 50;
                }
                var2.method5010(var26);
                field687 = 6;
            }
            if (field687 == 6 && var1.method3206() > 0) {
                int var28 = var1.method3205();
                if (var28 == 21 && field663 == 20) {
                    field687 = 9;
                } else if (var28 == 2) {
                    field687 = 11;
                } else if (var28 == 15 && field663 == 40) {
                    field881.field1316 = -1;
                    field687 = 16;
                } else if (var28 == 64) {
                    field687 = 7;
                } else if (var28 == 23 && field689 < 1) {
                    field689++;
                    field687 = 0;
                } else if (var28 == 29) {
                    field687 = 14;
                } else {
                    method261(var28);
                    return;
                }
            }
            if (field687 == 7 && var1.method3206() > 0) {
                Statics.field3885 = var1.method3205();
                field687 = 8;
            }
            if (field687 == 8 && var1.method3206() >= Statics.field3885) {
                var1.method3208(var2.field3731, 0, Statics.field3885);
                var2.field3733 = 0;
                field687 = 6;
            }
            if (field687 == 9 && var1.method3206() > 0) {
                field837 = (var1.method3205() + 3) * 60;
                field687 = 10;
            }
            if (field687 == 10) {
                field688 = 0;
                class86.method4603(class225.field2983, class225.field2891, field837 / 60 + class225.field2824);
                if (--field837 <= 0) {
                    field687 = 0;
                }
            } else {
                if (field687 == 11 && var1.method3206() >= 1) {
                    Statics.field3325 = var1.method3205();
                    field687 = 12;
                }
                if (field687 == 12 && var1.method3206() >= Statics.field3325) {
                    boolean var29 = var1.method3205() == 1;
                    var1.method3208(var2.field3731, 0, 4);
                    var2.field3733 = 0;
                    boolean var30 = false;
                    if (var29) {
                        int var31 = var2.method5013() << 24;
                        int var32 = var31 | var2.method5013() << 16;
                        int var33 = var32 | var2.method5013() << 8;
                        int var34 = var33 | var2.method5013();
                        int var35 = class292.method2714(class86.field1181);
                        if (Statics.field118.field1068.size() >= 10 && !Statics.field118.field1068.containsKey(var35)) {
                            Iterator var36 = Statics.field118.field1068.entrySet().iterator();
                            var36.next();
                            var36.remove();
                        }
                        Statics.field118.field1068.put(var35, var34);
                    }
                    if (field692) {
                        Statics.field118.field1066 = class86.field1181;
                    } else {
                        Statics.field118.field1066 = null;
                    }
                    class74.method2072();
                    field891 = var1.method3205();
                    field827 = var1.method3205() == 1;
                    field771 = var1.method3205();
                    field771 <<= 0x8;
                    field771 += var1.method3205();
                    field772 = var1.method3205();
                    var1.method3208(var2.field3731, 0, 1);
                    var2.field3733 = 0;
                    class183[] var37 = class183.method1769();
                    int var38 = var2.method5024();
                    if (var38 < 0 || var38 >= var37.length) {
                        throw new IOException(var38 + " " + var2.field3733);
                    }
                    field881.field1311 = var37[var38];
                    field881.field1316 = field881.field1311.field2147;
                    var1.method3208(var2.field3731, 0, 2);
                    var2.field3733 = 0;
                    field881.field1316 = var2.method5069();
                    try {
                        client var39 = Statics.field234;
                        JSObject.getWindow(var39).call("zap", (Object[]) null);
                    } catch (Throwable var50) {
                    }
                    field687 = 13;
                }
                if (field687 != 13) {
                    if (field687 == 14 && var1.method3206() >= 2) {
                        var2.field3733 = 0;
                        var1.method3208(var2.field3731, 0, 2);
                        var2.field3733 = 0;
                        Statics.field156 = var2.method5069();
                        field687 = 15;
                    }
                    if (field687 == 15 && var1.method3206() >= Statics.field156) {
                        var2.field3733 = 0;
                        var1.method3208(var2.field3731, 0, Statics.field156);
                        var2.field3733 = 0;
                        String var41 = var2.method5076();
                        String var42 = var2.method5076();
                        String var43 = var2.method5076();
                        class86.method4603(var41, var42, var43);
                        Statics.method2069(10);
                    }
                    if (field687 == 16) {
                        if (field881.field1316 == -1) {
                            if (var1.method3206() < 2) {
                                return;
                            }
                            var1.method3208(var2.field3731, 0, 2);
                            var2.field3733 = 0;
                            field881.field1316 = var2.method5069();
                        }
                        if (var1.method3206() >= field881.field1316) {
                            var1.method3208(var2.field3731, 0, field881.field1316);
                            var2.field3733 = 0;
                            int var44 = field881.field1316;
                            field798.method4615();
                            field881.method2022();
                            field881.field1315.field3733 = 0;
                            field881.field1311 = null;
                            field881.field1310 = null;
                            field881.field1322 = null;
                            field881.field1318 = null;
                            field881.field1316 = 0;
                            field881.field1319 = 0;
                            field670 = 0;
                            method3756();
                            field653 = 0;
                            field886 = 0;
                            for (int var45 = 0; var45 < 2048; var45++) {
                                field910[var45] = null;
                            }
                            Statics.field658 = null;
                            for (int var46 = 0; var46 < field695.length; var46++) {
                                class80 var47 = field695[var46];
                                if (var47 != null) {
                                    var47.field976 = -1;
                                    var47.field965 = false;
                                }
                            }
                            class60.field553 = new class319(32);
                            Statics.method2069(30);
                            for (int var48 = 0; var48 < 100; var48++) {
                                field844[var48] = true;
                            }
                            method1512();
                            class90.method224(var2);
                            if (var2.field3733 != var44) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field688++;
                        if (field688 > 2000) {
                            if (field689 < 1) {
                                if (Statics.field2359 == Statics.field1267) {
                                    Statics.field1267 = Statics.field1801;
                                } else {
                                    Statics.field1267 = Statics.field2359;
                                }
                                field689++;
                                field687 = 0;
                            } else {
                                method261(-3);
                            }
                        }
                    }
                } else if (var1.method3206() >= field881.field1316) {
                    var2.field3733 = 0;
                    var1.method3208(var2.field3731, 0, field881.field1316);
                    field798.method4629();
                    method2998();
                    class90.method224(var2);
                    Statics.field419 = -1;
                    method946(false, var2);
                    field881.field1311 = null;
                }
            }
        } catch (IOException var52) {
            if (field689 < 1) {
                if (Statics.field2359 == Statics.field1267) {
                    Statics.field1267 = Statics.field1801;
                } else {
                    Statics.field1267 = Statics.field2359;
                }
                field689++;
                field687 = 0;
            } else {
                method261(-2);
            }
        }
    }

    @ObfuscatedName("en.eh(I)V")
    public static void method2998() {
        field664 = -1L;
        Statics.field349.field593 = 0;
        Statics.field3558 = true;
        field668 = true;
        field880 = -1L;
        class97.method3353();
        field881.method2022();
        field881.field1315.field3733 = 0;
        field881.field1311 = null;
        field881.field1310 = null;
        field881.field1322 = null;
        field881.field1318 = null;
        field881.field1316 = 0;
        field881.field1319 = 0;
        field670 = 0;
        field701 = 0;
        field709 = 0;
        method3756();
        class55.field481 = 0;
        class92.field1280.clear();
        class92.field1278.method5453();
        class92.field1279.method4564();
        class92.field1283 = 0;
        field901 = 0;
        field811 = false;
        field894 = 0;
        field723 = 0;
        field728 = 0;
        Statics.field945 = null;
        field653 = 0;
        field748 = -1;
        field886 = 0;
        field843 = 0;
        field679 = class85.field1171;
        field680 = class85.field1171;
        field696 = 0;
        class90.field1256 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class90.field1255[var0] = null;
            class90.field1251[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field910[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field695[var2] = null;
        }
        field782 = -1;
        field671.method4501();
        field786.method4501();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field888[var3][var4][var5] = null;
                }
            }
        }
        field784 = new class262();
        Statics.field547.method1615();
        for (int var6 = 0; var6 < Statics.field3204; var6++) {
            class241 var7 = class241.method47(var6);
            if (var7 != null) {
                class213.field2525[var6] = 0;
                class213.field2526[var6] = 0;
            }
        }
        Statics.field2058.method1910();
        field826 = -1;
        if (field906 != -1) {
            int var8 = field906;
            if (var8 != -1 && Statics.field1756[var8]) {
                Statics.field2558.method3788(var8);
                if (Statics.field2557[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2557[var8].length; var10++) {
                        if (Statics.field2557[var8][var10] != null) {
                            if (Statics.field2557[var8][var10].field2567 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2557[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2557[var8] = null;
                    }
                    Statics.field1756[var8] = false;
                }
            }
        }
        for (class62 var11 = (class62) field817.method5477(); var11 != null; var11 = (class62) field817.method5480()) {
            method3370(var11, true);
        }
        field906 = -1;
        field817 = new class319(8);
        field851 = null;
        method3756();
        field919.method3646((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field779[var12] = null;
            field780[var12] = false;
        }
        class60.field553 = new class319(32);
        field662 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field844[var13] = true;
        }
        method1512();
        Statics.field411 = null;
        for (int var14 = 0; var14 < 8; var14++) {
            field867[var14] = new class10();
        }
        Statics.field943 = null;
    }

    @ObfuscatedName("d.ey(IB)V")
    public static void method261(int arg0) {
        if (arg0 == -3) {
            class86.method4603(class225.field2920, class225.field2803, class225.field2804);
        } else if (arg0 == -2) {
            class86.method4603(class225.field2805, class225.field2908, class225.field2807);
        } else if (arg0 == -1) {
            class86.method4603(class225.field2808, class225.field2809, class225.field2978);
        } else if (arg0 == 3) {
            class86.field1210 = 3;
            class86.field1213 = 1;
        } else if (arg0 == 4) {
            class86.method999(0);
        } else if (arg0 == 5) {
            class86.field1213 = 2;
            class86.method4603(class225.field2814, class225.field2815, class225.field2886);
        } else if (arg0 == 68 || !(field659 || arg0 != 6)) {
            class86.method4603(class225.field2817, class225.field2818, class225.field2819);
        } else if (arg0 == 7) {
            class86.method4603(class225.field2820, class225.field2841, class225.field2852);
        } else if (arg0 == 8) {
            class86.method4603(class225.field2914, class225.field2928, class225.field2825);
        } else if (arg0 == 9) {
            class86.method4603(class225.field2826, class225.field3043, class225.field2828);
        } else if (arg0 == 10) {
            class86.method4603(class225.field2953, class225.field2830, class225.field2846);
        } else if (arg0 == 11) {
            class86.method4603(class225.field2832, class225.field2833, class225.field2834);
        } else if (arg0 == 12) {
            class86.method4603(class225.field3057, class225.field2861, class225.field2837);
        } else if (arg0 == 13) {
            class86.method4603(class225.field2857, class225.field2940, class225.field2840);
        } else if (arg0 == 14) {
            class86.method4603(class225.field2829, class225.field3016, class225.field2766);
        } else if (arg0 == 16) {
            class86.method4603(class225.field2844, class225.field2845, class225.field2770);
        } else if (arg0 == 17) {
            class86.method4603(class225.field2847, class225.field2806, class225.field2849);
        } else if (arg0 == 18) {
            class86.method999(1);
        } else if (arg0 == 19) {
            class86.method4603(class225.field3039, class225.field2789, class225.field2855);
        } else if (arg0 == 20) {
            class86.method4603(class225.field2822, class225.field2831, class225.field2858);
        } else if (arg0 == 22) {
            class86.method4603(class225.field2993, class225.field3026, class225.field2765);
        } else if (arg0 == 23) {
            class86.method4603(class225.field3027, class225.field2903, class225.field2864);
        } else if (arg0 == 24) {
            class86.method4603(class225.field2865, class225.field2866, class225.field2867);
        } else if (arg0 == 25) {
            class86.method4603(class225.field2868, class225.field2882, class225.field2870);
        } else if (arg0 == 26) {
            class86.method4603(class225.field2871, class225.field2952, class225.field2963);
        } else if (arg0 == 27) {
            class86.method4603(class225.field2874, class225.field2875, class225.field2876);
        } else if (arg0 == 31) {
            class86.method4603(class225.field2759, class225.field2884, class225.field2787);
        } else if (arg0 == 32) {
            class86.method4603(class225.field3008, class225.field2887, class225.field2934);
        } else if (arg0 == 37) {
            class86.method4603(class225.field2889, class225.field2890, class225.field2926);
        } else if (arg0 == 38) {
            class86.method4603(class225.field2892, class225.field2913, class225.field2894);
        } else if (arg0 == 55) {
            class86.field1210 = 8;
        } else if (arg0 == 56) {
            class86.method4603(class225.field2899, class225.field2900, class225.field2901);
            Statics.method2069(11);
            return;
        } else if (arg0 == 57) {
            class86.method4603(class225.field2902, class225.field2793, class225.field2904);
            Statics.method2069(11);
            return;
        } else if (arg0 == 61) {
            class86.field1210 = 7;
        } else {
            class86.method4603(class225.field2905, class225.field2906, class225.field2907);
        }
        Statics.method2069(10);
    }

    @ObfuscatedName("fl.ec(I)V")
    public static final void method3275() {
        field881.method2037();
        class258.method3361();
        class245.field3255.method3042();
        class246.field3274.method3042();
        class254.method2509();
        class257.method507();
        class255.field3408.method3042();
        class255.field3409.method3042();
        class255.field3446.method3042();
        class259.field3525.method3042();
        class259.field3520.method3042();
        class244.field3240.method3042();
        class244.field3241.method3042();
        class249.method3545();
        class241.method955();
        class253.field3326.method3042();
        class253.field3330.method3042();
        class253.field3331.method3042();
        Statics.method257();
        class251.field3312.method3042();
        class250.method3626();
        class242.method996();
        class215.field2537.method3042();
        class218.method3577();
        ((class120) Statics.field1782).method2505();
        class93.field1292.method3042();
        Statics.field2406.method3789();
        Statics.field2050.method3789();
        Statics.field383.method3789();
        Statics.field90.method3789();
        Statics.field308.method3789();
        Statics.field254.method3789();
        Statics.field3501.method3789();
        Statics.field684.method3789();
        Statics.field19.method3789();
        Statics.field111.method3789();
        Statics.field280.method3789();
        Statics.field1972.method3789();
        Statics.field23.method2809();
        for (int var0 = 0; var0 < 4; var0++) {
            field711[var0].method3240();
        }
        System.gc();
        class198.method612(2);
        field890 = -1;
        field700 = false;
        for (class76 var1 = (class76) class76.field1081.method4507(); var1 != null; var1 = (class76) class76.field1081.method4509()) {
            if (var1.field1086 != null) {
                Statics.field533.method2097(var1.field1086);
                var1.field1086 = null;
            }
            if (var1.field1085 != null) {
                Statics.field533.method2097(var1.field1085);
                var1.field1085 = null;
            }
        }
        class76.field1081.method4501();
        Statics.method2069(10);
    }

    @ObfuscatedName("df.eb(II)V")
    public static final void method2272(int arg0) {
        method3275();
        switch(arg0) {
            case 1:
                class86.method3627();
                break;
            case 2:
                class86.method901();
        }
    }

    @ObfuscatedName("bh.fi(I)V")
    public static final void method952() {
        if (field701 > 0) {
            method3275();
        } else {
            field798.method4608();
            Statics.method2069(40);
            Statics.field3564 = field881.method2027();
            field881.method2028();
        }
    }

    @ObfuscatedName("f.fk(ZI)V")
    public static final void method85(boolean arg0) {
        if (arg0) {
            field691 = class86.field1202 ? class161.field2005 : class161.field2003;
        } else {
            field691 = Statics.field118.field1068.containsKey(class292.method2714(class86.field1181)) ? class161.field2006 : class161.field2002;
        }
    }

    @ObfuscatedName("client.fg(I)V")
    public final void method1110() {
        if (field670 > 1) {
            field670--;
        }
        if (field701 > 0) {
            field701--;
        }
        if (field702) {
            field702 = false;
            method952();
            return;
        }
        if (!field675) {
            method1776();
        }
        for (int var1 = 0; var1 < 100 && this.method1297(field881); var1++) {
        }
        if (field663 != 30) {
            return;
        }
        while (class97.method3470()) {
            class188 var2 = class188.method3894(class184.field2253, field881.field1314);
            var2.field2334.method5228(0);
            int var3 = var2.field2334.field3733;
            class97.method1506(var2.field2334);
            var2.field2334.method5064(var2.field2334.field3733 - var3);
            field881.method2023(var2);
        }
        if (field798.field3606) {
            class188 var4 = class188.method3894(class184.field2218, field881.field1314);
            var4.field2334.method5228(0);
            int var5 = var4.field2334.field3733;
            field798.method4614(var4.field2334);
            var4.field2334.method5064(var4.field2334.field3733 - var5);
            field881.method2023(var4);
            field798.method4613();
        }
        Object var6 = Statics.field349.field590;
        synchronized (Statics.field349.field590) {
            if (!field913) {
                Statics.field349.field593 = 0;
            } else if (class55.field494 != 0 || Statics.field349.field593 >= 40) {
                class188 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field349.field593 && (var7 == null || var7.field2334.field3733 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field349.field589[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field349.field592[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field718 != var14 || field666 != var13) {
                        if (var7 == null) {
                            var7 = class188.method3894(class184.field2238, field881.field1314);
                            var7.field2334.method5228(0);
                            var8 = var7.field2334.field3733;
                            var7.field2334.field3733 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field667 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field718;
                            var16 = var13 - field666;
                            var17 = (int) ((Statics.field349.field594[var12] - field667) / 20L);
                            var10 = (int) ((Statics.field349.field594[var12] - field667) % 20L + (long) var10);
                        }
                        field718 = var14;
                        field666 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2334.method5052((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2334.method5228(var17 + 128);
                            var7.field2334.method5052((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2334.method5228(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2334.method5054(Integer.MIN_VALUE);
                            } else {
                                var7.field2334.method5054(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2334.method5052((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2334.method5054(Integer.MIN_VALUE);
                            } else {
                                var7.field2334.method5054(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field667 = Statics.field349.field594[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2334.method5064(var7.field2334.field3733 - var8);
                    int var18 = var7.field2334.field3733;
                    var7.field2334.field3733 = var8;
                    var7.field2334.method5228(var10 / var11);
                    var7.field2334.method5228(var10 % var11);
                    var7.field2334.field3733 = var18;
                    field881.method2023(var7);
                }
                if (var9 >= Statics.field349.field593) {
                    Statics.field349.field593 = 0;
                } else {
                    Statics.field349.field593 -= var9;
                    System.arraycopy(Statics.field349.field592, var9, Statics.field349.field592, 0, Statics.field349.field593);
                    System.arraycopy(Statics.field349.field589, var9, Statics.field349.field589, 0, Statics.field349.field593);
                    System.arraycopy(Statics.field349.field594, var9, Statics.field349.field594, 0, Statics.field349.field593);
                }
            }
        }
        if (class55.field494 == 1 || !Statics.field414 && class55.field494 == 4 || class55.field494 == 2) {
            long var20 = (class55.field498 - field664) / 50L;
            if (var20 > 4095L) {
                var20 = 4095L;
            }
            field664 = class55.field498;
            int var22 = class55.field496;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field3309) {
                var22 = Statics.field3309;
            }
            int var23 = class55.field484;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field47) {
                var23 = Statics.field47;
            }
            int var24 = (int) var20;
            class188 var25 = class188.method3894(class184.field2235, field881.field1314);
            var25.field2334.method5052((class55.field494 == 2 ? 1 : 0) + (var24 << 1));
            var25.field2334.method5052(var23);
            var25.field2334.method5052(var22);
            field881.method2023(var25);
        }
        if (class46.field387 > 0) {
            class188 var26 = class188.method3894(class184.field2271, field881.field1314);
            var26.field2334.method5052(0);
            int var27 = var26.field2334.field3733;
            long var28 = class298.method3576();
            for (int var30 = 0; var30 < class46.field387; var30++) {
                long var31 = var28 - field880;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field880 = var28;
                var26.field2334.method5094(class46.field402[var30]);
                var26.field2334.method5053((int) var31);
            }
            var26.field2334.method5063(var26.field2334.field3733 - var27);
            field881.method2023(var26);
        }
        if (field823 > 0) {
            field823--;
        }
        if (class46.field396[96] || class46.field396[97] || class46.field396[98] || class46.field396[99]) {
            field879 = true;
        }
        if (field879 && field823 <= 0) {
            field823 = 20;
            field879 = false;
            class188 var33 = class188.method3894(class184.field2243, field881.field1314);
            var33.field2334.method5048(field722);
            var33.field2334.method5207(field723);
            field881.method2023(var33);
        }
        if (Statics.field3558 && !field668) {
            field668 = true;
            class188 var34 = class188.method3894(class184.field2277, field881.field1314);
            var34.field2334.method5228(1);
            field881.method2023(var34);
        }
        if (!Statics.field3558 && field668) {
            field668 = false;
            class188 var35 = class188.method3894(class184.field2277, field881.field1314);
            var35.field2334.method5228(0);
            field881.method2023(var35);
        }
        if (Statics.field1876 != null) {
            Statics.field1876.method5815();
        }
        method663();
        if (Statics.field373 != field748) {
            field748 = Statics.field373;
            int var36 = Statics.field373;
            int[] var37 = Statics.field2103.field3909;
            int var38 = var37.length;
            for (int var39 = 0; var39 < var38; var39++) {
                var37[var39] = 0;
            }
            for (int var40 = 1; var40 < 103; var40++) {
                int var41 = (103 - var40) * 2048 + 24628;
                for (int var42 = 1; var42 < 103; var42++) {
                    if ((class56.field503[var36][var42][var40] & 0x18) == 0) {
                        Statics.field23.method2975(var37, var41, 512, var36, var42, var40);
                    }
                    if (var36 < 3 && (class56.field503[var36 + 1][var42][var40] & 0x8) != 0) {
                        Statics.field23.method2975(var37, var41, 512, var36 + 1, var42, var40);
                    }
                    var41 += 4;
                }
            }
            int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field2103.method5634();
            for (int var45 = 1; var45 < 103; var45++) {
                for (int var46 = 1; var46 < 103; var46++) {
                    if ((class56.field503[var36][var46][var45] & 0x18) == 0) {
                        method28(var36, var46, var45, var43, var44);
                    }
                    if (var36 < 3 && (class56.field503[var36 + 1][var46][var45] & 0x8) != 0) {
                        method28(var36 + 1, var46, var45, var43, var44);
                    }
                }
            }
            field731 = 0;
            for (int var47 = 0; var47 < 104; var47++) {
                for (int var48 = 0; var48 < 104; var48++) {
                    long var49 = Statics.field23.method2838(Statics.field373, var47, var48);
                    if (var49 != 0L) {
                        int var51 = class129.method632(var49);
                        int var52 = class254.method2713(var51).field3379;
                        if (var52 >= 0) {
                            field787[field731] = class242.method3753(var52).method3996(false);
                            field665[field731] = var47;
                            field884[field731] = var48;
                            field731++;
                        }
                    }
                }
            }
            Statics.field2487.method5603();
        }
        if (field663 != 30) {
            return;
        }
        for (class69 var53 = (class69) field784.method4507(); var53 != null; var53 = (class69) field784.method4509()) {
            if (var53.field932 > 0) {
                var53.field932--;
            }
            if (var53.field932 != 0) {
                if (var53.field942 > 0) {
                    var53.field942--;
                }
                if (var53.field942 == 0 && var53.field938 >= 1 && var53.field935 >= 1 && var53.field938 <= 102 && var53.field935 <= 102 && (var53.field939 < 0 || class56.method1900(var53.field939, var53.field941))) {
                    method3575(var53.field944, var53.field933, var53.field938, var53.field935, var53.field939, var53.field940, var53.field941);
                    var53.field942 = -1;
                    if (var53.field939 == var53.field936 && var53.field936 == -1) {
                        var53.method3286();
                    } else if (var53.field939 == var53.field936 && var53.field940 == var53.field937 && var53.field941 == var53.field934) {
                        var53.method3286();
                    }
                }
            } else if (var53.field936 < 0 || class56.method1900(var53.field936, var53.field934)) {
                method3575(var53.field944, var53.field933, var53.field938, var53.field935, var53.field936, var53.field937, var53.field934);
                var53.method3286();
            }
        }
        method4078();
        field881.field1319++;
        if (field881.field1319 > 750) {
            method952();
            return;
        }
        int var54 = class90.field1256;
        int[] var55 = class90.field1258;
        for (int var56 = 0; var56 < var54; var56++) {
            class67 var57 = field910[var55[var56]];
            if (var57 != null) {
                method4148(var57, 1);
            }
        }
        method1003();
        method1065();
        field719++;
        if (field758 != 0) {
            field757 += 20;
            if (field757 >= 400) {
                field758 = 0;
            }
        }
        if (Statics.field550 != null) {
            field760++;
            if (field760 >= 15) {
                method3755(Statics.field550);
                Statics.field550 = null;
            }
        }
        class218 var58 = Statics.field1060;
        class218 var59 = Statics.field285;
        Statics.field1060 = null;
        Statics.field285 = null;
        field833 = null;
        field746 = false;
        field874 = false;
        field755 = 0;
        while (class46.method3746() && field755 < 128) {
            if (field891 >= 2 && class46.field396[82] && Statics.field1339 == 66) {
                String var60 = class92.method3024();
                Statics.field234.method741(var60);
            } else if (field728 != 1 || Statics.field2509 <= 0) {
                field922[field755] = Statics.field1339;
                field878[field755] = Statics.field2509;
                field755++;
            }
        }
        boolean var61 = field891 >= 2;
        if (var61 && class46.field396[82] && class46.field396[81] && field854 != 0) {
            int var62 = Statics.field658.field630 - field854;
            if (var62 < 0) {
                var62 = 0;
            } else if (var62 > 3) {
                var62 = 3;
            }
            if (Statics.field658.field630 != var62) {
                method362(Statics.field2390 + Statics.field658.field995[0], Statics.field2 + Statics.field658.field963[0], var62, false);
            }
            field854 = 0;
        }
        if (field906 != -1) {
            method3751(field906, 0, 0, Statics.field47, Statics.field3309, 0, 0);
        }
        field674++;
        while (true) {
            class63 var63;
            class218 var64;
            class218 var65;
            do {
                var63 = (class63) field853.method4515();
                if (var63 == null) {
                    while (true) {
                        class63 var66;
                        class218 var67;
                        class218 var68;
                        do {
                            var66 = (class63) field857.method4515();
                            if (var66 == null) {
                                while (true) {
                                    class63 var69;
                                    class218 var70;
                                    class218 var71;
                                    do {
                                        var69 = (class63) field855.method4515();
                                        if (var69 == null) {
                                            this.method1183();
                                            method4032();
                                            if (field829 != null) {
                                                this.method1480();
                                            }
                                            if (Statics.field128 != null) {
                                                method3755(Statics.field128);
                                                field767++;
                                                if (class55.field486 == 0) {
                                                    if (field875) {
                                                        if (Statics.field3698 == Statics.field128 && field766 != field765) {
                                                            class218 var72 = Statics.field128;
                                                            byte var73 = 0;
                                                            if (field810 == 1 && var72.field2569 == 206) {
                                                                var73 = 1;
                                                            }
                                                            if (var72.field2561[field765] <= 0) {
                                                                var73 = 0;
                                                            }
                                                            if (class219.method3093(method4602(var72))) {
                                                                int var74 = field766;
                                                                int var75 = field765;
                                                                var72.field2561[var75] = var72.field2561[var74];
                                                                var72.field2706[var75] = var72.field2706[var74];
                                                                var72.field2561[var74] = -1;
                                                                var72.field2706[var74] = 0;
                                                            } else if (var73 == 1) {
                                                                int var76 = field766;
                                                                int var77 = field765;
                                                                while (var76 != var77) {
                                                                    if (var76 > var77) {
                                                                        var72.method3700(var76 - 1, var76);
                                                                        var76--;
                                                                    } else if (var76 < var77) {
                                                                        var72.method3700(var76 + 1, var76);
                                                                        var76++;
                                                                    }
                                                                }
                                                            } else {
                                                                var72.method3700(field765, field766);
                                                            }
                                                            class188 var78 = class188.method3894(class184.field2284, field881.field1314);
                                                            var78.field2334.method5052(field765);
                                                            var78.field2334.method5207(field766);
                                                            var78.field2334.method5054(Statics.field128.field2689);
                                                            var78.field2334.method5094(var73);
                                                            field881.method2023(var78);
                                                        }
                                                    } else if (this.method1115()) {
                                                        this.method1126(field655, field764);
                                                    } else if (field792 > 0) {
                                                        int var79 = field655;
                                                        int var80 = field764;
                                                        class83 var81 = Statics.field917;
                                                        method1979(var81.field1158, var81.field1157, var81.field1156, var81.field1159, var81.field1160, var81.field1160, var79, var80);
                                                        Statics.field917 = null;
                                                    }
                                                    field760 = 10;
                                                    class55.field494 = 0;
                                                    Statics.field128 = null;
                                                } else if (field767 >= 5 && (class55.field493 > field655 + 5 || class55.field493 < field655 - 5 || class55.field488 > field764 + 5 || class55.field488 < field764 - 5)) {
                                                    field875 = true;
                                                }
                                            }
                                            if (class134.method2848()) {
                                                int var82 = class134.field1851;
                                                int var83 = class134.field1838;
                                                class188 var84 = class188.method3894(class184.field2300, field881.field1314);
                                                var84.field2334.method5228(5);
                                                var84.field2334.method5103(Statics.field2 + var83);
                                                var84.field2334.method5103(Statics.field2390 + var82);
                                                var84.field2334.method5093(class46.field396[82] ? (class46.field396[81] ? 2 : 1) : 0);
                                                field881.method2023(var84);
                                                class134.method2965();
                                                field877 = class55.field484;
                                                field756 = class55.field496;
                                                field758 = 1;
                                                field757 = 0;
                                                field886 = var82;
                                                field843 = var83;
                                            }
                                            if (Statics.field1060 != var58) {
                                                if (var58 != null) {
                                                    method3755(var58);
                                                }
                                                if (Statics.field1060 != null) {
                                                    method3755(Statics.field1060);
                                                }
                                            }
                                            if (Statics.field285 != var59 && field841 == field834) {
                                                if (var59 != null) {
                                                    method3755(var59);
                                                }
                                                if (Statics.field285 != null) {
                                                    method3755(Statics.field285);
                                                }
                                            }
                                            if (Statics.field285 == null) {
                                                if (field841 > 0) {
                                                    field841--;
                                                }
                                            } else if (field841 < field834) {
                                                field841++;
                                                if (field841 == field834) {
                                                    method3755(Statics.field285);
                                                }
                                            }
                                            method1803();
                                            if (field900) {
                                                int var85 = Statics.field413 * 128 + 64;
                                                int var86 = Statics.field2517 * 128 + 64;
                                                int var87 = method992(var85, var86, Statics.field373) - Statics.field2346;
                                                if (Statics.field3728 < var85) {
                                                    Statics.field3728 += Statics.field1328 * (var85 - Statics.field3728) / 1000 + Statics.field1167;
                                                    if (Statics.field3728 > var85) {
                                                        Statics.field3728 = var85;
                                                    }
                                                }
                                                if (Statics.field3728 > var85) {
                                                    Statics.field3728 -= Statics.field1328 * (Statics.field3728 - var85) / 1000 + Statics.field1167;
                                                    if (Statics.field3728 < var85) {
                                                        Statics.field3728 = var85;
                                                    }
                                                }
                                                if (Statics.field384 < var87) {
                                                    Statics.field384 += Statics.field1328 * (var87 - Statics.field384) / 1000 + Statics.field1167;
                                                    if (Statics.field384 > var87) {
                                                        Statics.field384 = var87;
                                                    }
                                                }
                                                if (Statics.field384 > var87) {
                                                    Statics.field384 -= Statics.field1328 * (Statics.field384 - var87) / 1000 + Statics.field1167;
                                                    if (Statics.field384 < var87) {
                                                        Statics.field384 = var87;
                                                    }
                                                }
                                                if (Statics.field4 < var86) {
                                                    Statics.field4 += Statics.field1328 * (var86 - Statics.field4) / 1000 + Statics.field1167;
                                                    if (Statics.field4 > var86) {
                                                        Statics.field4 = var86;
                                                    }
                                                }
                                                if (Statics.field4 > var86) {
                                                    Statics.field4 -= Statics.field1328 * (Statics.field4 - var86) / 1000 + Statics.field1167;
                                                    if (Statics.field4 < var86) {
                                                        Statics.field4 = var86;
                                                    }
                                                }
                                                int var88 = Statics.field1018 * 128 + 64;
                                                int var89 = Statics.field260 * 128 + 64;
                                                int var90 = method992(var88, var89, Statics.field373) - Statics.field269;
                                                int var91 = var88 - Statics.field3728;
                                                int var92 = var90 - Statics.field384;
                                                int var93 = var89 - Statics.field4;
                                                int var94 = (int) Math.sqrt((double) (var91 * var91 + var93 * var93));
                                                int var95 = (int) (Math.atan2((double) var92, (double) var94) * 325.949D) & 0x7FF;
                                                int var96 = (int) (Math.atan2((double) var91, (double) var93) * -325.949D) & 0x7FF;
                                                if (var95 < 128) {
                                                    var95 = 128;
                                                }
                                                if (var95 > 383) {
                                                    var95 = 383;
                                                }
                                                if (Statics.field78 < var95) {
                                                    Statics.field78 += Statics.field502 * (var95 - Statics.field78) / 1000 + Statics.field527;
                                                    if (Statics.field78 > var95) {
                                                        Statics.field78 = var95;
                                                    }
                                                }
                                                if (Statics.field78 > var95) {
                                                    Statics.field78 -= Statics.field502 * (Statics.field78 - var95) / 1000 + Statics.field527;
                                                    if (Statics.field78 < var95) {
                                                        Statics.field78 = var95;
                                                    }
                                                }
                                                int var97 = var96 - Statics.field1113;
                                                if (var97 > 1024) {
                                                    var97 -= 2048;
                                                }
                                                if (var97 < -1024) {
                                                    var97 += 2048;
                                                }
                                                if (var97 > 0) {
                                                    Statics.field1113 += Statics.field502 * var97 / 1000 + Statics.field527;
                                                    Statics.field1113 &= 0x7FF;
                                                }
                                                if (var97 < 0) {
                                                    Statics.field1113 -= Statics.field502 * -var97 / 1000 + Statics.field527;
                                                    Statics.field1113 &= 0x7FF;
                                                }
                                                int var98 = var96 - Statics.field1113;
                                                if (var98 > 1024) {
                                                    var98 -= 2048;
                                                }
                                                if (var98 < -1024) {
                                                    var98 += 2048;
                                                }
                                                if (var98 < 0 && var97 > 0 || var98 > 0 && var97 < 0) {
                                                    Statics.field1113 = var96;
                                                }
                                            }
                                            for (int var99 = 0; var99 < 5; var99++) {
                                                int var10002 = field905[var99]++;
                                            }
                                            Statics.field2058.method1914();
                                            int var100 = ++class55.field481 - 1;
                                            int var102 = class46.field407;
                                            if (var100 > 15000 && var102 > 15000) {
                                                field701 = 250;
                                                class55.field481 = 14500;
                                                class188 var104 = class188.method3894(class184.field2301, field881.field1314);
                                                field881.method2023(var104);
                                            }
                                            Statics.field547.method1597();
                                            field881.field1320++;
                                            if (field881.field1320 > 50) {
                                                class188 var105 = class188.method3894(class184.field2226, field881.field1314);
                                                field881.method2023(var105);
                                            }
                                            try {
                                                field881.method2038();
                                            } catch (IOException var107) {
                                                method952();
                                            }
                                            return;
                                        }
                                        var70 = var69.field576;
                                        if (var70.field2566 < 0) {
                                            break;
                                        }
                                        var71 = class218.method1799(var70.field2584);
                                    } while (var71 == null || var71.field2676 == null || var70.field2566 >= var71.field2676.length || var71.field2676[var70.field2566] != var70);
                                    class77.method3292(var69);
                                }
                            }
                            var67 = var66.field576;
                            if (var67.field2566 < 0) {
                                break;
                            }
                            var68 = class218.method1799(var67.field2584);
                        } while (var68 == null || var68.field2676 == null || var67.field2566 >= var68.field2676.length || var68.field2676[var67.field2566] != var67);
                        class77.method3292(var66);
                    }
                }
                var64 = var63.field576;
                if (var64.field2566 < 0) {
                    break;
                }
                var65 = class218.method1799(var64.field2584);
            } while (var65 == null || var65.field2676 == null || var64.field2566 >= var65.field2676.length || var65.field2676[var64.field2566] != var64);
            class77.method3292(var63);
        }
    }

    @ObfuscatedName("gs.fz(B)V")
    public static final void method3298() {
        if (Statics.field2362 != null) {
            Statics.field2362.method2225();
        }
        if (Statics.field1145 != null) {
            Statics.field1145.method2225();
        }
    }

    @ObfuscatedName("im.fn(I)V")
    public static final void method4078() {
        for (int var0 = 0; var0 < field894; var0++) {
            int var10002 = field898[var0]--;
            if (field898[var0] >= -10) {
                class102 var2 = field899[var0];
                if (var2 == null) {
                    class102 var10000 = (class102) null;
                    var2 = class102.method2135(Statics.field90, field895[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field898[var0] += var2.method2132();
                    field899[var0] = var2;
                }
                if (field898[var0] < 0) {
                    int var9;
                    if (field842[var0] == 0) {
                        var9 = field892;
                    } else {
                        int var3 = (field842[var0] & 0xFF) * 128;
                        int var4 = field842[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field658.field1006;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field842[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field658.field950;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field898[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field893 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class104 var10 = var2.method2131().method2177(Statics.field1178);
                        class114 var11 = class114.method2309(var10, 100, var9);
                        var11.method2393(field896[var0] - 1);
                        Statics.field533.method2090(var11);
                    }
                    field898[var0] = -100;
                }
            } else {
                field894--;
                for (int var1 = var0; var1 < field894; var1++) {
                    field895[var1] = field895[var1 + 1];
                    field899[var1] = field899[var1 + 1];
                    field896[var1] = field896[var1 + 1];
                    field898[var1] = field898[var1 + 1];
                    field842[var1] = field842[var1 + 1];
                }
                var0--;
            }
        }
        if (!field700) {
            return;
        }
        boolean var12;
        if (class198.field2403 == 0) {
            var12 = Statics.field1100.method3386();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field912 != 0 && field890 != -1) {
                class198.method3196(Statics.field254, field890, 0, field912, false);
            }
            field700 = false;
        }
    }

    @ObfuscatedName("cl.fm(IIII)V")
    public static void method1810(int arg0, int arg1, int arg2) {
        if (field892 == 0 || arg1 == 0 || field894 >= 50) {
            return;
        }
        field895[field894] = arg0;
        field896[field894] = arg1;
        field898[field894] = arg2;
        field899[field894] = null;
        field842[field894] = 0;
        field894++;
    }

    @ObfuscatedName("c.ft(II)V")
    public static void method79(int arg0) {
        if (arg0 == -1 && !field700) {
            class198.method3235();
        } else if (arg0 != -1 && field890 != arg0 && field912 != 0 && !field700) {
            class236 var1 = Statics.field254;
            int var2 = field912;
            class198.field2403 = 1;
            Statics.field77 = var1;
            Statics.field2404 = arg0;
            Statics.field2408 = 0;
            Statics.field530 = var2;
            Statics.field1993 = false;
            Statics.field2405 = 2;
        }
        field890 = arg0;
    }

    @ObfuscatedName("a.fe(III)V")
    public static void method174(int arg0, int arg1) {
        if (field912 != 0 && arg0 != -1) {
            class198.method3196(Statics.field280, arg0, 0, field912, false);
            field700 = true;
        }
    }

    @ObfuscatedName("ai.fa(I)V")
    public static final void method663() {
        if (!Statics.field50) {
            return;
        }
        if (Statics.field411 != null) {
            Statics.field411.method4742();
        }
        for (int var0 = 0; var0 < class90.field1256; var0++) {
            class67 var1 = field910[class90.field1258[var0]];
            var1.method1047();
        }
        Statics.field50 = false;
    }

    @ObfuscatedName("j.fs(Lhj;III)V")
    public static final void method194(class218 arg0, int arg1, int arg2) {
        if (field653 != 0 && field653 != 3 || field675 || !(class55.field494 == 1 || !Statics.field414 && class55.field494 == 4)) {
            return;
        }
        class212 var3 = arg0.method3677(true);
        if (var3 == null) {
            return;
        }
        int var4 = class55.field484 - arg1;
        int var5 = class55.field496 - arg2;
        if (!var3.method3596(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2520 / 2;
        int var7 = var5 - var3.field2523 / 2;
        int var8 = field723 & 0x7FF;
        int var9 = class131.field1788[var8];
        int var10 = class131.field1785[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field658.field1006 + var11 >> 7;
        int var14 = Statics.field658.field950 - var12 >> 7;
        class188 var15 = class188.method3894(class184.field2263, field881.field1314);
        var15.field2334.method5228(18);
        var15.field2334.method5103(Statics.field2 + var14);
        var15.field2334.method5103(Statics.field2390 + var13);
        var15.field2334.method5093(class46.field396[82] ? (class46.field396[81] ? 2 : 1) : 0);
        var15.field2334.method5228(var6);
        var15.field2334.method5228(var7);
        var15.field2334.method5052(field723);
        var15.field2334.method5228(57);
        var15.field2334.method5228(0);
        var15.field2334.method5228(0);
        var15.field2334.method5228(89);
        var15.field2334.method5052(Statics.field658.field1006);
        var15.field2334.method5052(Statics.field658.field950);
        var15.field2334.method5228(63);
        field881.method2023(var15);
        field886 = var13;
        field843 = var14;
    }

    @ObfuscatedName("bd.ff(I)V")
    public static final void method1065() {
        int[] var0 = class90.field1258;
        for (int var1 = 0; var1 < class90.field1256; var1++) {
            class67 var2 = field910[var0[var1]];
            if (var2 != null && var2.field1003 > 0) {
                var2.field1003--;
                if (var2.field1003 == 0) {
                    var2.field978 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field696; var3++) {
            int var4 = field697[var3];
            class80 var5 = field695[var4];
            if (var5 != null && var5.field1003 > 0) {
                var5.field1003--;
                if (var5.field1003 == 0) {
                    var5.field978 = null;
                }
            }
        }
    }

    @ObfuscatedName("lq.fj(Ljava/lang/String;I)V")
    public static final void method5434(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field118.field1061 = !Statics.field118.field1061;
            class74.method2072();
            if (Statics.field118.field1061) {
                class92.method994(99, "", "Roofs are now all hidden");
            } else {
                class92.method994(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field885 = !field885;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field774 = !field774;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field803 = !field803;
        }
        if (field891 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1876.field4026 = !Statics.field1876.field4026;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field885 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field885 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method952();
            }
        }
        class188 var1 = class188.method3894(class184.field2264, field881.field1314);
        var1.field2334.method5228(arg0.length() + 1);
        var1.field2334.method5058(arg0);
        field881.method2023(var1);
    }

    @ObfuscatedName("cj.fy(I)V")
    public static final void method1803() {
        if (field728 == 0) {
            int var0 = Statics.field658.field1006;
            int var1 = Statics.field658.field950;
            if (Statics.field500 - var0 < -500 || Statics.field500 - var0 > 500 || Statics.field228 - var1 < -500 || Statics.field228 - var1 > 500) {
                Statics.field500 = var0;
                Statics.field228 = var1;
            }
            if (Statics.field500 != var0) {
                Statics.field500 += (var0 - Statics.field500) / 16;
            }
            if (Statics.field228 != var1) {
                Statics.field228 += (var1 - Statics.field228) / 16;
            }
            int var2 = Statics.field500 >> 7;
            int var3 = Statics.field228 >> 7;
            int var4 = method992(Statics.field500, Statics.field228, Statics.field373);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field373;
                        if (var8 < 3 && (class56.field503[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class56.field517[var8][var6][var7];
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
            if (var10 > field740) {
                field740 += (var10 - field740) / 24;
            } else if (var10 < field740) {
                field740 += (var10 - field740) / 80;
            }
            Statics.field730 = method992(Statics.field658.field1006, Statics.field658.field950, Statics.field373) - field729;
        } else if (field728 == 1) {
            method3727();
            short var11 = -1;
            if (class46.field396[33]) {
                var11 = 0;
            } else if (class46.field396[49]) {
                var11 = 1024;
            }
            if (class46.field396[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class46.field396[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class46.field396[35]) {
                var12 = -1;
            } else if (class46.field396[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class46.field396[81] ? field735 : field734;
                var13 = var14 * 16;
                field732 = var11;
                field872 = var12;
            }
            if (field929 < var13) {
                field929 += var13 / 8;
                if (field929 > var13) {
                    field929 = var13;
                }
            } else if (field929 > var13) {
                field929 = field929 * 9 / 10;
            }
            if (field929 > 0) {
                int var15 = field929 / 16;
                if (field732 >= 0) {
                    int var16 = field732 - Statics.field1113 & 0x7FF;
                    int var17 = class131.field1788[var16];
                    int var18 = class131.field1785[var16];
                    Statics.field500 += var15 * var17 / 65536;
                    Statics.field228 += var15 * var18 / 65536;
                }
                if (field872 != 0) {
                    Statics.field730 += field872 * var15;
                    if (Statics.field730 > 0) {
                        Statics.field730 = 0;
                    }
                }
            } else {
                field732 = -1;
                field872 = -1;
            }
            if (class46.field396[13]) {
                method667();
            }
        }
        if (class55.field486 == 4 && Statics.field414) {
            int var19 = class55.field488 - field727;
            field725 = var19 * 2;
            field727 = var19 == -1 || var19 == 1 ? class55.field488 : (field727 + class55.field488) / 2;
            int var20 = field726 - class55.field493;
            field724 = var20 * 2;
            field726 = var20 == -1 || var20 == 1 ? class55.field493 : (field726 + class55.field493) / 2;
        } else {
            if (class46.field396[96]) {
                field724 += (-24 - field724) / 2;
            } else if (class46.field396[97]) {
                field724 += (24 - field724) / 2;
            } else {
                field724 /= 2;
            }
            if (class46.field396[98]) {
                field725 += (12 - field725) / 2;
            } else if (class46.field396[99]) {
                field725 += (-12 - field725) / 2;
            } else {
                field725 /= 2;
            }
            field727 = class55.field488;
            field726 = class55.field493;
        }
        field723 = field724 / 2 + field723 & 0x7FF;
        field722 += field725 / 2;
        if (field722 < 128) {
            field722 = 128;
        }
        if (field722 > 383) {
            field722 = 383;
        }
    }

    @ObfuscatedName("bs.fu(I)V")
    public static final void method1003() {
        for (int var0 = 0; var0 < field696; var0++) {
            int var1 = field697[var0];
            class80 var2 = field695[var1];
            if (var2 != null) {
                method4148(var2, var2.field1135.field3470);
            }
        }
    }

    @ObfuscatedName("in.fp(Lbq;IB)V")
    public static final void method4148(class70 arg0, int arg1) {
        if (arg0.field996 > field882) {
            int var2 = arg0.field996 - field882;
            int var3 = arg0.field992 * 128 + arg0.field953 * 64;
            int var4 = arg0.field994 * 128 + arg0.field953 * 64;
            arg0.field1006 += (var3 - arg0.field1006) / var2;
            arg0.field950 += (var4 - arg0.field950) / var2;
            arg0.field1008 = 0;
            arg0.field1001 = arg0.field998;
        } else if (arg0.field997 >= field882) {
            if (field882 == arg0.field997 || arg0.field982 == -1 || arg0.field985 != 0 || arg0.field975 + 1 > class259.method67(arg0.field982).field3523[arg0.field952]) {
                int var5 = arg0.field997 - arg0.field996;
                int var6 = field882 - arg0.field996;
                int var7 = arg0.field992 * 128 + arg0.field953 * 64;
                int var8 = arg0.field994 * 128 + arg0.field953 * 64;
                int var9 = arg0.field993 * 128 + arg0.field953 * 64;
                int var10 = arg0.field984 * 128 + arg0.field953 * 64;
                arg0.field1006 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field950 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1008 = 0;
            arg0.field1001 = arg0.field998;
            arg0.field951 = arg0.field1001;
        } else {
            arg0.field979 = arg0.field1005;
            if (arg0.field1004 == 0) {
                arg0.field1008 = 0;
            } else {
                label334: {
                    if (arg0.field982 != -1 && arg0.field985 == 0) {
                        class259 var11 = class259.method67(arg0.field982);
                        if (arg0.field1009 > 0 && var11.field3526 == 0) {
                            arg0.field1008++;
                            break label334;
                        }
                        if (arg0.field1009 <= 0 && var11.field3533 == 0) {
                            arg0.field1008++;
                            break label334;
                        }
                    }
                    int var12 = arg0.field1006;
                    int var13 = arg0.field950;
                    int var14 = arg0.field995[arg0.field1004 - 1] * 128 + arg0.field953 * 64;
                    int var15 = arg0.field963[arg0.field1004 - 1] * 128 + arg0.field953 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field1001 = 1280;
                        } else if (var13 > var15) {
                            arg0.field1001 = 1792;
                        } else {
                            arg0.field1001 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field1001 = 768;
                        } else if (var13 > var15) {
                            arg0.field1001 = 256;
                        } else {
                            arg0.field1001 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field1001 = 1024;
                    } else if (var13 > var15) {
                        arg0.field1001 = 0;
                    }
                    byte var16 = arg0.field1007[arg0.field1004 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field1001 - arg0.field951 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field959;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field958;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field961;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field960;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field958;
                        }
                        arg0.field979 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class80) {
                            var20 = ((class80) arg0).field1135.field3498;
                        }
                        if (var20) {
                            if (arg0.field951 != arg0.field1001 && arg0.field976 == -1 && arg0.field949 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field1004 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field1004 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field1008 > 0 && arg0.field1004 > 1) {
                                var19 = 8;
                                arg0.field1008--;
                            }
                        } else {
                            if (arg0.field1004 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field1004 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field1008 > 0 && arg0.field1004 > 1) {
                                var19 = 8;
                                arg0.field1008--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field979 == arg0.field958 && arg0.field962 != -1) {
                            arg0.field979 = arg0.field962;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field1006 += var19;
                                if (arg0.field1006 > var14) {
                                    arg0.field1006 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field1006 -= var19;
                                if (arg0.field1006 < var14) {
                                    arg0.field1006 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field950 += var19;
                                if (arg0.field950 > var15) {
                                    arg0.field950 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field950 -= var19;
                                if (arg0.field950 < var15) {
                                    arg0.field950 = var15;
                                }
                            }
                        }
                        if (arg0.field1006 == var14 && arg0.field950 == var15) {
                            arg0.field1004--;
                            if (arg0.field1009 > 0) {
                                arg0.field1009--;
                            }
                        }
                    } else {
                        arg0.field1006 = var14;
                        arg0.field950 = var15;
                        arg0.field1004--;
                        if (arg0.field1009 > 0) {
                            arg0.field1009--;
                        }
                    }
                }
            }
        }
        if (arg0.field1006 < 128 || arg0.field950 < 128 || arg0.field1006 >= 13184 || arg0.field950 >= 13184) {
            arg0.field982 = -1;
            arg0.field987 = -1;
            arg0.field996 = 0;
            arg0.field997 = 0;
            arg0.field1006 = arg0.field995[0] * 128 + arg0.field953 * 64;
            arg0.field950 = arg0.field963[0] * 128 + arg0.field953 * 64;
            arg0.method1495();
        }
        if (Statics.field658 == arg0 && (arg0.field1006 < 1536 || arg0.field950 < 1536 || arg0.field1006 >= 11776 || arg0.field950 >= 11776)) {
            arg0.field982 = -1;
            arg0.field987 = -1;
            arg0.field996 = 0;
            arg0.field997 = 0;
            arg0.field1006 = arg0.field995[0] * 128 + arg0.field953 * 64;
            arg0.field950 = arg0.field963[0] * 128 + arg0.field953 * 64;
            arg0.method1495();
        }
        method4815(arg0);
        arg0.field968 = false;
        if (arg0.field979 != -1) {
            class259 var21 = class259.method67(arg0.field979);
            if (var21 == null || var21.field3521 == null) {
                arg0.field979 = -1;
            } else {
                arg0.field1002++;
                if (arg0.field980 < var21.field3521.length && arg0.field1002 > var21.field3523[arg0.field980]) {
                    arg0.field1002 = 1;
                    arg0.field980++;
                    Statics.method210(var21, arg0.field980, arg0.field1006, arg0.field950);
                }
                if (arg0.field980 >= var21.field3521.length) {
                    arg0.field1002 = 0;
                    arg0.field980 = 0;
                    Statics.method210(var21, arg0.field980, arg0.field1006, arg0.field950);
                }
            }
        }
        if (arg0.field987 != -1 && field882 >= arg0.field990) {
            if (arg0.field988 < 0) {
                arg0.field988 = 0;
            }
            int var22 = class244.method3544(arg0.field987).field3239;
            if (var22 == -1) {
                arg0.field987 = -1;
            } else {
                class259 var23 = class259.method67(var22);
                if (var23 == null || var23.field3521 == null) {
                    arg0.field987 = -1;
                } else {
                    arg0.field989++;
                    if (arg0.field988 < var23.field3521.length && arg0.field989 > var23.field3523[arg0.field988]) {
                        arg0.field989 = 1;
                        arg0.field988++;
                        Statics.method210(var23, arg0.field988, arg0.field1006, arg0.field950);
                    }
                    if (arg0.field988 >= var23.field3521.length && (arg0.field988 < 0 || arg0.field988 >= var23.field3521.length)) {
                        arg0.field987 = -1;
                    }
                }
            }
        }
        if (arg0.field982 != -1 && arg0.field985 <= 1) {
            class259 var24 = class259.method67(arg0.field982);
            if (var24.field3526 == 1 && arg0.field1009 > 0 && arg0.field996 <= field882 && arg0.field997 < field882) {
                arg0.field985 = 1;
                return;
            }
        }
        if (arg0.field982 != -1 && arg0.field985 == 0) {
            class259 var25 = class259.method67(arg0.field982);
            if (var25 == null || var25.field3521 == null) {
                arg0.field982 = -1;
            } else {
                arg0.field975++;
                if (arg0.field952 < var25.field3521.length && arg0.field975 > var25.field3523[arg0.field952]) {
                    arg0.field975 = 1;
                    arg0.field952++;
                    Statics.method210(var25, arg0.field952, arg0.field1006, arg0.field950);
                }
                if (arg0.field952 >= var25.field3521.length) {
                    arg0.field952 -= var25.field3516;
                    arg0.field986++;
                    if (arg0.field986 >= var25.field3536) {
                        arg0.field982 = -1;
                    } else if (arg0.field952 >= 0 && arg0.field952 < var25.field3521.length) {
                        Statics.method210(var25, arg0.field952, arg0.field1006, arg0.field950);
                    } else {
                        arg0.field982 = -1;
                    }
                }
                arg0.field968 = var25.field3527;
            }
        }
        if (arg0.field985 > 0) {
            arg0.field985--;
        }
    }

    @ObfuscatedName("js.fv(Lbq;I)V")
    public static final void method4815(class70 arg0) {
        if (arg0.field949 == 0) {
            return;
        }
        if (arg0.field976 != -1) {
            class70 var1 = null;
            if (arg0.field976 < 32768) {
                var1 = field695[arg0.field976];
            } else if (arg0.field976 >= 32768) {
                var1 = field910[arg0.field976 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1006 - var1.field1006;
                int var3 = arg0.field950 - var1.field950;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1001 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field965) {
                arg0.field976 = -1;
                arg0.field965 = false;
            }
        }
        if (arg0.field977 != -1 && (arg0.field1004 == 0 || arg0.field1008 > 0)) {
            arg0.field1001 = arg0.field977;
            arg0.field977 = -1;
        }
        int var4 = arg0.field1001 - arg0.field951 & 0x7FF;
        if (var4 == 0 && arg0.field965) {
            arg0.field976 = -1;
            arg0.field965 = false;
        }
        if (var4 == 0) {
            arg0.field1010 = 0;
            return;
        }
        arg0.field1010++;
        if (var4 > 1024) {
            arg0.field951 -= arg0.field949;
            boolean var5 = true;
            if (var4 < arg0.field949 || var4 > 2048 - arg0.field949) {
                arg0.field951 = arg0.field1001;
                var5 = false;
            }
            if (arg0.field979 == arg0.field1005 && (arg0.field1010 > 25 || var5)) {
                if (arg0.field956 == -1) {
                    arg0.field979 = arg0.field958;
                } else {
                    arg0.field979 = arg0.field956;
                }
            }
        } else {
            arg0.field951 += arg0.field949;
            boolean var6 = true;
            if (var4 < arg0.field949 || var4 > 2048 - arg0.field949) {
                arg0.field951 = arg0.field1001;
                var6 = false;
            }
            if (arg0.field979 == arg0.field1005 && (arg0.field1010 > 25 || var6)) {
                if (arg0.field957 == -1) {
                    arg0.field979 = arg0.field958;
                } else {
                    arg0.field979 = arg0.field957;
                }
            }
        }
        arg0.field951 &= 0x7FF;
    }

    @ObfuscatedName("ib.fo(I)V")
    public static void method4032() {
        if (Statics.field1876 != null) {
            Statics.field1876.method5825(Statics.field373, (Statics.field658.field1006 >> 7) + Statics.field2390, (Statics.field658.field950 >> 7) + Statics.field2, false);
            Statics.field1876.method5987();
        }
    }

    @ObfuscatedName("bs.fl(Lbd;IIB)V")
    public static void method1001(class67 arg0, int arg1, int arg2) {
        if (arg0.field982 == arg1 && arg1 != -1) {
            int var3 = class259.method67(arg1).field3530;
            if (var3 == 1) {
                arg0.field952 = 0;
                arg0.field975 = 0;
                arg0.field985 = arg2;
                arg0.field986 = 0;
            }
            if (var3 == 2) {
                arg0.field986 = 0;
            }
        } else if (arg1 == -1 || arg0.field982 == -1 || class259.method67(arg1).field3534 >= class259.method67(arg0.field982).field3534) {
            arg0.field982 = arg1;
            arg0.field952 = 0;
            arg0.field975 = 0;
            arg0.field985 = arg2;
            arg0.field986 = 0;
            arg0.field1009 = arg0.field1004;
        }
    }

    @ObfuscatedName("az.fb(B)I")
    public static int method506() {
        return field870 ? 2 : 1;
    }

    @ObfuscatedName("fu.fx(II)V")
    public static void method3197(int arg0) {
        field869 = 0L;
        if (arg0 >= 2) {
            field870 = true;
        } else {
            field870 = false;
        }
        if (method506() == 1) {
            Statics.field234.method850(765, 503);
        } else {
            Statics.field234.method850(7680, 2160);
        }
        if (field663 >= 25) {
            method1512();
        }
    }

    @ObfuscatedName("bu.fd(I)V")
    public static void method1512() {
        class188 var0 = class188.method3894(class184.field2239, field881.field1314);
        var0.field2334.method5228(method506());
        var0.field2334.method5052(Statics.field47);
        var0.field2334.method5052(Statics.field3309);
        field881.method2023(var0);
    }

    @ObfuscatedName("client.x(I)V")
    public final void method745() {
        field869 = class298.method3576() + 500L;
        this.method1111();
        if (field906 != -1) {
            this.method1143(true);
        }
    }

    @ObfuscatedName("client.fq(I)V")
    public void method1111() {
        int var1 = Statics.field47;
        int var2 = Statics.field3309;
        if (this.field455 < var1) {
            int var3 = this.field455;
        }
        if (this.field456 < var2) {
            int var4 = this.field456;
        }
        if (Statics.field118 != null) {
            try {
                class48.method668(Statics.field234, "resize", new Object[] { method506() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.fc(I)V")
    public final void method1112() {
        if (field906 != -1) {
            method3897(field906);
        }
        for (int var1 = 0; var1 < field859; var1++) {
            if (field844[var1]) {
                field862[var1] = true;
            }
            field863[var1] = field844[var1];
            field844[var1] = false;
        }
        field742 = field882;
        field804 = -1;
        field805 = -1;
        Statics.field3698 = null;
        if (field906 != -1) {
            field859 = 0;
            method3345(field906, 0, 0, Statics.field47, Statics.field3309, 0, 0, -1);
        }
        class322.method5523();
        if (field759) {
            if (field758 == 1) {
                Statics.field1916[field757 / 100].method5646(field877 - 8, field756 - 8);
            }
            if (field758 == 2) {
                Statics.field1916[field757 / 100 + 4].method5646(field877 - 8, field756 - 8);
            }
        }
        if (field675) {
            int var2 = Statics.field3293;
            int var3 = Statics.field268;
            int var4 = Statics.field374;
            int var5 = Statics.field1093;
            int var6 = 6116423;
            class322.method5539(var2, var3, var4, var5, var6);
            class322.method5539(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class322.method5535(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field194.method4927(class225.field2859, var2 + 3, var3 + 14, var6, -1);
            int var7 = class55.field493;
            int var8 = class55.field488;
            for (int var9 = 0; var9 < field792; var9++) {
                int var10 = (field792 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field194.method4927(method361(var9), var2 + 3, var10, var11, 0);
            }
            int var12 = Statics.field3293;
            int var13 = Statics.field268;
            int var14 = Statics.field374;
            int var15 = Statics.field1093;
            for (int var16 = 0; var16 < field859; var16++) {
                if (field866[var16] + field809[var16] > var12 && field809[var16] < var12 + var14 && field865[var16] + field861[var16] > var13 && field865[var16] < var13 + var15) {
                    field862[var16] = true;
                }
            }
        } else if (field804 != -1) {
            method356(field804, field805);
        }
        if (field769 == 3) {
            for (int var17 = 0; var17 < field859; var17++) {
                if (field863[var17]) {
                    class322.method5531(field809[var17], field865[var17], field866[var17], field861[var17], 16711935, 128);
                } else if (field862[var17]) {
                    class322.method5531(field809[var17], field865[var17], field866[var17], field861[var17], 16711680, 128);
                }
            }
        }
        int var18 = Statics.field373;
        int var19 = Statics.field658.field1006;
        int var20 = Statics.field658.field950;
        int var21 = field719;
        for (class76 var22 = (class76) class76.field1081.method4507(); var22 != null; var22 = (class76) class76.field1081.method4509()) {
            if (var22.field1080 != -1 || var22.field1089 != null) {
                int var23 = 0;
                if (var19 > var22.field1078) {
                    var23 += var19 - var22.field1078;
                } else if (var19 < var22.field1084) {
                    var23 += var22.field1084 - var19;
                }
                if (var20 > var22.field1083) {
                    var23 += var20 - var22.field1083;
                } else if (var20 < var22.field1091) {
                    var23 += var22.field1091 - var20;
                }
                if (var23 - 64 > var22.field1092 || field893 == 0 || var22.field1079 != var18) {
                    if (var22.field1086 != null) {
                        Statics.field533.method2097(var22.field1086);
                        var22.field1086 = null;
                    }
                    if (var22.field1085 != null) {
                        Statics.field533.method2097(var22.field1085);
                        var22.field1085 = null;
                    }
                } else {
                    var23 -= 64;
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    int var24 = field893 * (var22.field1092 - var23) / var22.field1092;
                    class102 var10000;
                    if (var22.field1086 != null) {
                        var22.field1086.method2307(var24);
                    } else if (var22.field1080 >= 0) {
                        var10000 = (class102) null;
                        class102 var25 = class102.method2135(Statics.field90, var22.field1080, 0);
                        if (var25 != null) {
                            class104 var26 = var25.method2131().method2177(Statics.field1178);
                            class114 var27 = class114.method2309(var26, 100, var24);
                            var27.method2393(-1);
                            Statics.field533.method2090(var27);
                            var22.field1086 = var27;
                        }
                    }
                    if (var22.field1085 != null) {
                        var22.field1085.method2307(var24);
                        if (!var22.field1085.method3285()) {
                            var22.field1085 = null;
                        }
                    } else if (var22.field1089 != null && (var22.field1090 -= var21) <= 0) {
                        int var28 = (int) (Math.random() * (double) var22.field1089.length);
                        var10000 = (class102) null;
                        class102 var29 = class102.method2135(Statics.field90, var22.field1089[var28], 0);
                        if (var29 != null) {
                            class104 var30 = var29.method2131().method2177(Statics.field1178);
                            class114 var31 = class114.method2309(var30, 100, var24);
                            var31.method2393(0);
                            Statics.field533.method2090(var31);
                            var22.field1085 = var31;
                            var22.field1090 = var22.field1087 + (int) (Math.random() * (double) (var22.field1082 - var22.field1087));
                        }
                    }
                }
            }
        }
        field719 = 0;
    }

    @ObfuscatedName("jy.fw(Ljava/lang/String;ZI)V")
    public static final void method4780(String arg0, boolean arg1) {
        if (!field785) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2055.method4924(arg0, 250);
        int var6 = Statics.field2055.method4964(arg0, 250) * 13;
        class322.method5539(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class322.method5535(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2055.method4931(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2019(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2487.method719(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field859; var11++) {
            if (field866[var11] + field809[var11] > var7 && field809[var11] < var7 + var9 && field865[var11] + field861[var11] > var8 && field865[var11] < var8 + var10) {
                field862[var11] = true;
            }
        }
    }

    @ObfuscatedName("k.fh(IIIII)V")
    public static final void method34(int arg0, int arg1, int arg2, int arg3) {
        field752++;
        method947();
        if (field774) {
            method3759(Statics.field658, false);
        }
        if (field782 >= 0 && field910[field782] != null) {
            method3759(field910[field782], false);
        }
        method441(true);
        int var4 = class90.field1256;
        int[] var5 = class90.field1258;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field782 != var5[var6] && field771 != var5[var6]) {
                method3759(field910[var5[var6]], true);
            }
        }
        method441(false);
        method2049();
        method255();
        method3037(arg0, arg1, arg2, arg3, true);
        int var7 = field914;
        int var8 = field915;
        int var9 = field747;
        int var10 = field715;
        class322.method5524(var7, var8, var7 + var9, var8 + var10);
        class131.method2794();
        if (!field900) {
            int var11 = field722;
            if (field740 / 256 > var11) {
                var11 = field740 / 256;
            }
            if (field887[4] && field903[4] + 128 > var11) {
                var11 = field903[4] + 128;
            }
            int var12 = field723 & 0x7FF;
            method1559(Statics.field500, Statics.field730, Statics.field228, var11, var12, method583(var11), var10);
        }
        int var25;
        if (field900) {
            var25 = method1816();
        } else {
            int var13;
            if (Statics.field118.field1061) {
                var13 = Statics.field373;
            } else {
                label466: {
                    int var14 = 3;
                    if (Statics.field78 < 310) {
                        int var15;
                        int var16;
                        if (field728 == 1) {
                            var15 = Statics.field500 >> 7;
                            var16 = Statics.field228 >> 7;
                        } else {
                            var15 = Statics.field658.field1006 >> 7;
                            var16 = Statics.field658.field950 >> 7;
                        }
                        int var17 = Statics.field3728 >> 7;
                        int var18 = Statics.field4 >> 7;
                        if (var17 < 0 || var18 < 0 || var17 >= 104 || var18 >= 104) {
                            var13 = Statics.field373;
                            break label466;
                        }
                        if (var15 < 0 || var16 < 0 || var15 >= 104 || var16 >= 104) {
                            var13 = Statics.field373;
                            break label466;
                        }
                        if ((class56.field503[Statics.field373][var17][var18] & 0x4) != 0) {
                            var14 = Statics.field373;
                        }
                        int var19;
                        if (var15 > var17) {
                            var19 = var15 - var17;
                        } else {
                            var19 = var17 - var15;
                        }
                        int var20;
                        if (var16 > var18) {
                            var20 = var16 - var18;
                        } else {
                            var20 = var18 - var16;
                        }
                        if (var19 > var20) {
                            int var21 = var20 * 65536 / var19;
                            int var22 = 32768;
                            while (var15 != var17) {
                                if (var17 < var15) {
                                    var17++;
                                } else if (var17 > var15) {
                                    var17--;
                                }
                                if ((class56.field503[Statics.field373][var17][var18] & 0x4) != 0) {
                                    var14 = Statics.field373;
                                }
                                var22 += var21;
                                if (var22 >= 65536) {
                                    var22 -= 65536;
                                    if (var18 < var16) {
                                        var18++;
                                    } else if (var18 > var16) {
                                        var18--;
                                    }
                                    if ((class56.field503[Statics.field373][var17][var18] & 0x4) != 0) {
                                        var14 = Statics.field373;
                                    }
                                }
                            }
                        } else if (var20 > 0) {
                            int var23 = var19 * 65536 / var20;
                            int var24 = 32768;
                            while (var16 != var18) {
                                if (var18 < var16) {
                                    var18++;
                                } else if (var18 > var16) {
                                    var18--;
                                }
                                if ((class56.field503[Statics.field373][var17][var18] & 0x4) != 0) {
                                    var14 = Statics.field373;
                                }
                                var24 += var23;
                                if (var24 >= 65536) {
                                    var24 -= 65536;
                                    if (var17 < var15) {
                                        var17++;
                                    } else if (var17 > var15) {
                                        var17--;
                                    }
                                    if ((class56.field503[Statics.field373][var17][var18] & 0x4) != 0) {
                                        var14 = Statics.field373;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field658.field1006 >= 0 && Statics.field658.field950 >= 0 && Statics.field658.field1006 < 13312 && Statics.field658.field950 < 13312) {
                        if ((class56.field503[Statics.field373][Statics.field658.field1006 >> 7][Statics.field658.field950 >> 7] & 0x4) != 0) {
                            var14 = Statics.field373;
                        }
                        var13 = var14;
                    } else {
                        var13 = Statics.field373;
                    }
                }
            }
            var25 = var13;
        }
        int var26 = Statics.field3728;
        int var27 = Statics.field384;
        int var28 = Statics.field4;
        int var29 = Statics.field78;
        int var30 = Statics.field1113;
        for (int var31 = 0; var31 < 5; var31++) {
            if (field887[var31]) {
                int var32 = (int) (Math.random() * (double) (field902[var31] * 2 + 1) - (double) field902[var31] + Math.sin((double) field904[var31] / 100.0D * (double) field905[var31]) * (double) field903[var31]);
                if (var31 == 0) {
                    Statics.field3728 += var32;
                }
                if (var31 == 1) {
                    Statics.field384 += var32;
                }
                if (var31 == 2) {
                    Statics.field4 += var32;
                }
                if (var31 == 3) {
                    Statics.field1113 = Statics.field1113 + var32 & 0x7FF;
                }
                if (var31 == 4) {
                    Statics.field78 += var32;
                    if (Statics.field78 < 128) {
                        Statics.field78 = 128;
                    }
                    if (Statics.field78 > 383) {
                        Statics.field78 = 383;
                    }
                }
            }
        }
        int var33 = class55.field493;
        int var34 = class55.field488;
        if (class55.field494 != 0) {
            var33 = class55.field484;
            var34 = class55.field496;
        }
        if (var33 >= var7 && var33 < var7 + var9 && var34 >= var8 && var34 < var8 + var10) {
            int var35 = var33 - var7;
            int var36 = var34 - var8;
            class129.field1743 = var35;
            class129.field1744 = var36;
            class129.field1754 = true;
            class129.field1749 = 0;
            class129.field1745 = false;
        } else {
            class129.method3342();
        }
        method3298();
        class322.method5539(var7, var8, var9, var10, 0);
        method3298();
        int var37 = class131.field1774;
        class131.field1774 = field918;
        Statics.field23.method2835(Statics.field3728, Statics.field384, Statics.field4, Statics.field78, Statics.field1113, var25);
        class131.field1774 = var37;
        method3298();
        Statics.field23.method2858();
        field741 = 0;
        boolean var38 = false;
        int var39 = -1;
        int var40 = -1;
        int var41 = class90.field1256;
        int[] var42 = class90.field1258;
        for (int var43 = 0; var43 < field696 + var41; var43++) {
            class70 var44;
            if (var43 < var41) {
                var44 = field910[var42[var43]];
                if (field782 == var42[var43]) {
                    var38 = true;
                    var39 = var43;
                    continue;
                }
                if (Statics.field658 == var44) {
                    var40 = var43;
                    continue;
                }
            } else {
                var44 = field695[field697[var43 - var41]];
            }
            method2287(var44, var43, var7, var8, var9, var10);
        }
        if (field774 && var40 != -1) {
            method2287(Statics.field658, var40, var7, var8, var9, var10);
        }
        if (var38) {
            method2287(field910[field782], var39, var7, var8, var9, var10);
        }
        for (int var45 = 0; var45 < field741; var45++) {
            int var46 = field743[var45];
            int var47 = field744[var45];
            int var48 = field677[var45];
            int var49 = field745[var45];
            boolean var50 = true;
            while (var50) {
                var50 = false;
                for (int var51 = 0; var51 < var45; var51++) {
                    if (var47 + 2 > field744[var51] - field745[var51] && var47 - var49 < field744[var51] + 2 && var46 - var48 < field743[var51] + field677[var51] && var46 + var48 > field743[var51] - field677[var51] && field744[var51] - field745[var51] < var47) {
                        var47 = field744[var51] - field745[var51];
                        var50 = true;
                    }
                }
            }
            field753 = field743[var45];
            field754 = field744[var45] = var47;
            String var52 = field750[var45];
            if (field820 == 0) {
                int var53 = 16776960;
                if (field703[var45] < 6) {
                    var53 = field871[field703[var45]];
                }
                if (field703[var45] == 6) {
                    var53 = field752 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field703[var45] == 7) {
                    var53 = field752 % 20 < 10 ? 255 : 65535;
                }
                if (field703[var45] == 8) {
                    var53 = field752 % 20 < 10 ? 45056 : 8454016;
                }
                if (field703[var45] == 9) {
                    int var54 = 150 - field749[var45];
                    if (var54 < 50) {
                        var53 = var54 * 1280 + 16711680;
                    } else if (var54 < 100) {
                        var53 = 16776960 - (var54 - 50) * 327680;
                    } else if (var54 < 150) {
                        var53 = (var54 - 100) * 5 + 65280;
                    }
                }
                if (field703[var45] == 10) {
                    int var55 = 150 - field749[var45];
                    if (var55 < 50) {
                        var53 = var55 * 5 + 16711680;
                    } else if (var55 < 100) {
                        var53 = 16711935 - (var55 - 50) * 327680;
                    } else if (var55 < 150) {
                        var53 = (var55 - 100) * 327680 + 255 - (var55 - 100) * 5;
                    }
                }
                if (field703[var45] == 11) {
                    int var56 = 150 - field749[var45];
                    if (var56 < 50) {
                        var53 = 16777215 - var56 * 327685;
                    } else if (var56 < 100) {
                        var53 = (var56 - 50) * 327685 + 65280;
                    } else if (var56 < 150) {
                        var53 = 16777215 - (var56 - 100) * 327680;
                    }
                }
                if (field806[var45] == 0) {
                    Statics.field194.method4922(var52, field753 + var7, field754 + var8, var53, 0);
                }
                if (field806[var45] == 1) {
                    Statics.field194.method4932(var52, field753 + var7, field754 + var8, var53, 0, field752);
                }
                if (field806[var45] == 2) {
                    Statics.field194.method4934(var52, field753 + var7, field754 + var8, var53, 0, field752);
                }
                if (field806[var45] == 3) {
                    Statics.field194.method4948(var52, field753 + var7, field754 + var8, var53, 0, field752, 150 - field749[var45]);
                }
                if (field806[var45] == 4) {
                    int var57 = (150 - field749[var45]) * (Statics.field194.method4990(var52) + 100) / 150;
                    class322.method5525(field753 + var7 - 50, var8, field753 + var7 + 50, var8 + var10);
                    Statics.field194.method4927(var52, field753 + var7 + 50 - var57, field754 + var8, var53, 0);
                    class322.method5524(var7, var8, var7 + var9, var8 + var10);
                }
                if (field806[var45] == 5) {
                    int var58 = 150 - field749[var45];
                    int var59 = 0;
                    if (var58 < 25) {
                        var59 = var58 - 25;
                    } else if (var58 > 125) {
                        var59 = var58 - 125;
                    }
                    class322.method5525(var7, field754 + var8 - Statics.field194.field3710 - 1, var7 + var9, field754 + var8 + 5);
                    Statics.field194.method4922(var52, field753 + var7, field754 + var8 + var59, var53, 0);
                    class322.method5524(var7, var8, var7 + var9, var8 + var10);
                }
            } else {
                Statics.field194.method4922(var52, field753 + var7, field754 + var8, 16776960, 0);
            }
        }
        if (field709 == 2) {
            method488((field738 - Statics.field2390 << 7) + field822, (field778 - Statics.field2 << 7) + field678, field676 * 2);
            if (field753 > -1 && field882 % 20 < 10) {
                Statics.field2097[0].method5646(field753 + var7 - 12, field754 + var8 - 28);
            }
        }
        ((class120) Statics.field1782).method2479(field719);
        method253(var7, var8, var9, var10);
        Statics.field3728 = var26;
        Statics.field384 = var27;
        Statics.field4 = var28;
        Statics.field78 = var29;
        Statics.field1113 = var30;
        if (field662) {
            byte var60 = 0;
            int var61 = class237.field3169 + class237.field3167 + var60;
            if (var61 == 0) {
                field662 = false;
            }
        }
        if (field662) {
            class322.method5539(var7, var8, var9, var10, 0);
            method4780(class225.field2768, false);
        }
    }

    @ObfuscatedName("ex.gc(IIIIZB)V")
    public static final void method3037(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field783;
        } else if (var5 >= 100) {
            var6 = field652;
        } else {
            var6 = (field652 - field783) * var5 / 100 + field783;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field733) {
            short var8 = field733;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field791) {
                var6 = field791;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class322.method5523();
                    class322.method5539(arg0, arg1, var10, arg3, -16777216);
                    class322.method5539(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field660) {
            short var11 = field660;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field821) {
                var6 = field821;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class322.method5523();
                    class322.method5539(arg0, arg1, arg2, var13, -16777216);
                    class322.method5539(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field918 = arg3 * var6 / 334;
        if (field747 != arg2 || field715 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method583(var16);
                int var18 = class131.field1788[var16];
                int var19 = arg3 - 334;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 100) {
                    var19 = 100;
                }
                int var20 = (field909 - field907) * var19 / 100 + field907;
                int var21 = var17 * var20 / 256;
                var14[var15] = var18 * var21 >> 16;
            }
            class134.method2844(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field914 = arg0;
        field915 = arg1;
        field747 = arg2;
        field715 = arg3;
    }

    @ObfuscatedName("bh.gx(I)V")
    public static void method947() {
        if (Statics.field658.field1006 >> 7 == field886 && Statics.field658.field950 >> 7 == field843) {
            field886 = 0;
        }
    }

    @ObfuscatedName("hi.gh(Lbd;ZB)V")
    public static void method3759(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1045() || arg0.field629) {
            return;
        }
        arg0.field635 = false;
        if ((field657 && class90.field1256 > 50 || class90.field1256 > 200) && arg1 && arg0.field979 == arg0.field1005) {
            arg0.field635 = true;
        }
        int var2 = arg0.field1006 >> 7;
        int var3 = arg0.field950 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class129.method2597(0, 0, 0, false, arg0.field638);
        if (arg0.field627 != null && field882 >= arg0.field615 && field882 < arg0.field623) {
            arg0.field635 = false;
            arg0.field624 = method992(arg0.field1006, arg0.field950, Statics.field373);
            arg0.field954 = field882;
            Statics.field23.method2822(Statics.field373, arg0.field1006, arg0.field950, arg0.field624, 60, arg0, arg0.field951, var4, arg0.field628, arg0.field626, arg0.field613, arg0.field631);
            return;
        }
        if ((arg0.field1006 & 0x7F) == 64 && (arg0.field950 & 0x7F) == 64) {
            if (field752 == field751[var2][var3]) {
                return;
            }
            field751[var2][var3] = field752;
        }
        arg0.field624 = method992(arg0.field1006, arg0.field950, Statics.field373);
        arg0.field954 = field882;
        Statics.field23.method2820(Statics.field373, arg0.field1006, arg0.field950, arg0.field624, 60, arg0, arg0.field951, var4, arg0.field968);
    }

    @ObfuscatedName("aw.gw(ZI)V")
    public static final void method441(boolean arg0) {
        for (int var1 = 0; var1 < field696; var1++) {
            class80 var2 = field695[field697[var1]];
            if (var2 != null && var2.method1045() && var2.field1135.field3474 == arg0 && var2.field1135.method4325()) {
                int var3 = var2.field1006 >> 7;
                int var4 = var2.field950 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field953 == 1 && (var2.field1006 & 0x7F) == 64 && (var2.field950 & 0x7F) == 64) {
                        if (field752 == field751[var3][var4]) {
                            continue;
                        }
                        field751[var3][var4] = field752;
                    }
                    long var5 = class129.method2597(0, 0, 1, !var2.field1135.field3497, field697[var1]);
                    var2.field954 = field882;
                    Statics.field23.method2820(Statics.field373, var2.field1006, var2.field950, method992(var2.field1006 + (var2.field953 * 64 - 64), var2.field950 + (var2.field953 * 64 - 64), Statics.field373), var2.field953 * 64 - 64 + 60, var2, var2.field951, var5, var2.field968);
                }
            }
        }
    }

    @ObfuscatedName("cg.gs(B)V")
    public static final void method2049() {
        for (class87 var0 = (class87) field671.method4507(); var0 != null; var0 = (class87) field671.method4509()) {
            if (Statics.field373 != var0.field1216 || field882 > var0.field1241) {
                var0.method3286();
            } else if (field882 >= var0.field1218) {
                if (var0.field1225 > 0) {
                    class80 var1 = field695[var0.field1225 - 1];
                    if (var1 != null && var1.field1006 >= 0 && var1.field1006 < 13312 && var1.field950 >= 0 && var1.field950 < 13312) {
                        var0.method1851(var1.field1006, var1.field950, method992(var1.field1006, var1.field950, var0.field1216) - var0.field1226, field882);
                    }
                }
                if (var0.field1225 < 0) {
                    int var2 = -var0.field1225 - 1;
                    class67 var3;
                    if (field771 == var2) {
                        var3 = Statics.field658;
                    } else {
                        var3 = field910[var2];
                    }
                    if (var3 != null && var3.field1006 >= 0 && var3.field1006 < 13312 && var3.field950 >= 0 && var3.field950 < 13312) {
                        var0.method1851(var3.field1006, var3.field950, method992(var3.field1006, var3.field950, var0.field1216) - var0.field1226, field882);
                    }
                }
                var0.method1857(field719);
                Statics.field23.method2820(Statics.field373, (int) var0.field1219, (int) var0.field1228, (int) var0.field1229, 60, var0, var0.field1235, -1L, false);
            }
        }
    }

    @ObfuscatedName("n.gb(I)V")
    public static final void method255() {
        for (class78 var0 = (class78) field786.method4507(); var0 != null; var0 = (class78) field786.method4509()) {
            if (Statics.field373 != var0.field1125 || var0.field1123) {
                var0.method3286();
            } else if (field882 >= var0.field1115) {
                var0.method1773(field719);
                if (var0.field1123) {
                    var0.method3286();
                } else {
                    Statics.field23.method2820(var0.field1125, var0.field1118, var0.field1114, var0.field1119, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("cy.gp(I)I")
    public static final int method1816() {
        if (Statics.field118.field1061) {
            return Statics.field373;
        } else {
            int var0 = method992(Statics.field3728, Statics.field4, Statics.field373);
            return var0 - Statics.field384 >= 800 || (class56.field503[Statics.field373][Statics.field3728 >> 7][Statics.field4 >> 7] & 0x4) == 0 ? 3 : Statics.field373;
        }
    }

    @ObfuscatedName("dz.ge(Lbq;IIIIII)V")
    public static final void method2287(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1045()) {
            return;
        }
        if (arg0 instanceof class80) {
            class257 var6 = ((class80) arg0).field1135;
            if (var6.field3477 != null) {
                var6 = var6.method4324();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class90.field1256;
        int[] var8 = class90.field1258;
        byte var9 = 0;
        if (arg1 < var7 && field882 == arg0.field954) {
            class67 var10 = (class67) arg0;
            boolean var11;
            if (field775 == 0) {
                var11 = false;
            } else if (Statics.field658 == var10) {
                boolean var17 = (field775 & 0x8) != 0;
                var11 = var17;
            } else {
                boolean var12 = (field775 & 0x4) != 0;
                boolean var13 = var12;
                if (!var12) {
                    boolean var14 = (field775 & 0x1) != 0;
                    var13 = var14 && var10.method1043();
                }
                boolean var15 = var13;
                if (!var13) {
                    boolean var16 = (field775 & 0x2) != 0;
                    var15 = var16 && var10.method1046();
                }
                var11 = var15;
            }
            if (var11) {
                class67 var18 = (class67) arg0;
                if (arg1 < var7) {
                    method3750(arg0, arg0.field1000 + 15);
                    class297 var19 = (class297) field705.get(class293.field3678);
                    byte var20 = 9;
                    var19.method4922(var18.field622.method4790(), field753 + arg2, field754 + arg3 - var20, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var21 = -2;
        if (!arg0.field955.method4425()) {
            method3750(arg0, arg0.field1000 + 15);
            for (class79 var22 = (class79) arg0.field955.method4453(); var22 != null; var22 = (class79) arg0.field955.method4423()) {
                class71 var23 = var22.method1780(field882);
                if (var23 != null) {
                    class247 var24 = var22.field1129;
                    class326 var25 = var24.method4083();
                    class326 var26 = var24.method4082();
                    int var27 = 0;
                    int var28;
                    if (var25 == null || var26 == null) {
                        var28 = var24.field3289;
                    } else {
                        if (var24.field3290 * 2 < var26.field3900) {
                            var27 = var24.field3290;
                        }
                        var28 = var26.field3900 - var27 * 2;
                    }
                    int var29 = 255;
                    boolean var30 = true;
                    int var31 = field882 - var23.field1017;
                    int var32 = var23.field1013 * var28 / var24.field3289;
                    int var35;
                    if (var23.field1011 > var31) {
                        int var33 = var24.field3278 == 0 ? 0 : var31 / var24.field3278 * var24.field3278;
                        int var34 = var23.field1012 * var28 / var24.field3289;
                        var35 = (var32 - var34) * var33 / var23.field1011 + var34;
                    } else {
                        var35 = var32;
                        int var36 = var23.field1011 + var24.field3286 - var31;
                        if (var24.field3284 >= 0) {
                            var29 = (var36 << 8) / (var24.field3286 - var24.field3284);
                        }
                    }
                    if (var23.field1013 > 0 && var35 < 1) {
                        var35 = 1;
                    }
                    if (var25 == null || var26 == null) {
                        var21 += 5;
                        if (field753 > -1) {
                            int var42 = field753 + arg2 - (var28 >> 1);
                            int var43 = field754 + arg3 - var21;
                            class322.method5539(var42, var43, var35, 5, 65280);
                            class322.method5539(var35 + var42, var43, var28 - var35, 5, 16711680);
                        }
                        var21 += 2;
                    } else {
                        int var37;
                        if (var28 == var35) {
                            var37 = var27 * 2 + var35;
                        } else {
                            var37 = var27 + var35;
                        }
                        int var38 = var25.field3901;
                        var21 += var38;
                        int var39 = field753 + arg2 - (var28 >> 1);
                        int var40 = field754 + arg3 - var21;
                        int var41 = var39 - var27;
                        if (var29 >= 0 && var29 < 255) {
                            var25.method5649(var41, var40, var29);
                            class322.method5525(var41, var40, var37 + var41, var38 + var40);
                            var26.method5649(var41, var40, var29);
                        } else {
                            var25.method5646(var41, var40);
                            class322.method5525(var41, var40, var37 + var41, var38 + var40);
                            var26.method5646(var41, var40);
                        }
                        class322.method5524(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var21 += 2;
                    }
                } else if (var22.method1790()) {
                    var22.method3286();
                }
            }
        }
        if (var21 == -2) {
            var21 += 7;
        }
        int var44 = var9 + var21;
        if (arg1 < var7) {
            class67 var45 = (class67) arg0;
            if (var45.field629) {
                return;
            }
            if (var45.field636 != -1 || var45.field616 != -1) {
                method3750(arg0, arg0.field1000 + 15);
                if (field753 > -1) {
                    if (var45.field636 != -1) {
                        var44 += 25;
                        Statics.field1990[var45.field636].method5646(field753 + arg2 - 12, field754 + arg3 - var44);
                    }
                    if (var45.field616 != -1) {
                        var44 += 25;
                        Statics.field1443[var45.field616].method5646(field753 + arg2 - 12, field754 + arg3 - var44);
                    }
                }
            }
            if (arg1 >= 0 && field709 == 10 && field690 == var8[arg1]) {
                method3750(arg0, arg0.field1000 + 15);
                if (field753 > -1) {
                    int var46 = Statics.field2097[1].field3901 + var44;
                    Statics.field2097[1].method5646(field753 + arg2 - 12, field754 + arg3 - var46);
                }
            }
        } else {
            class257 var47 = ((class80) arg0).field1135;
            if (var47.field3477 != null) {
                var47 = var47.method4324();
            }
            if (var47.field3492 >= 0 && var47.field3492 < Statics.field1443.length) {
                method3750(arg0, arg0.field1000 + 15);
                if (field753 > -1) {
                    Statics.field1443[var47.field3492].method5646(field753 + arg2 - 12, field754 + arg3 - 30);
                }
            }
            if (field709 == 1 && field825 == field697[arg1 - var7] && field882 % 20 < 10) {
                method3750(arg0, arg0.field1000 + 15);
                if (field753 > -1) {
                    Statics.field2097[0].method5646(field753 + arg2 - 12, field754 + arg3 - 28);
                }
            }
        }
        if (arg0.field978 != null && (arg1 >= var7 || !arg0.field999 && (field908 == 4 || !arg0.field964 && (field908 == 0 || field908 == 3 || field908 == 1 && ((class67) arg0).method1043())))) {
            method3750(arg0, arg0.field1000);
            if (field753 > -1 && field741 < field868) {
                field677[field741] = Statics.field194.method4990(arg0.field978) / 2;
                field745[field741] = Statics.field194.field3710;
                field743[field741] = field753;
                field744[field741] = field754;
                field703[field741] = arg0.field967;
                field806[field741] = arg0.field983;
                field749[field741] = arg0.field1003;
                field750[field741] = arg0.field978;
                field741++;
            }
        }
        for (int var48 = 0; var48 < 4; var48++) {
            int var49 = arg0.field972[var48];
            int var50 = arg0.field970[var48];
            class253 var51 = null;
            int var52 = 0;
            if (var50 >= 0) {
                if (var49 <= field882) {
                    continue;
                }
                var51 = class253.method1860(arg0.field970[var48]);
                var52 = var51.field3345;
                if (var51 != null && var51.field3346 != null) {
                    var51 = var51.method4171();
                    if (var51 == null) {
                        arg0.field972[var48] = -1;
                        continue;
                    }
                }
            } else if (var49 < 0) {
                continue;
            }
            int var53 = arg0.field973[var48];
            class253 var54 = null;
            if (var53 >= 0) {
                var54 = class253.method1860(var53);
                if (var54 != null && var54.field3346 != null) {
                    var54 = var54.method4171();
                }
            }
            if (var49 - var52 <= field882) {
                if (var51 == null) {
                    arg0.field972[var48] = -1;
                } else {
                    method3750(arg0, arg0.field1000 / 2);
                    if (field753 > -1) {
                        if (var48 == 1) {
                            field754 -= 20;
                        }
                        if (var48 == 2) {
                            field753 -= 15;
                            field754 -= 10;
                        }
                        if (var48 == 3) {
                            field753 += 15;
                            field754 -= 10;
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
                        class326 var67 = null;
                        class326 var68 = null;
                        class326 var69 = null;
                        class326 var70 = null;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        class326 var80 = var51.method4168();
                        if (var80 != null) {
                            var59 = var80.field3900;
                            int var81 = var80.field3901;
                            if (var81 > var79) {
                                var79 = var81;
                            }
                            var63 = var80.field3902;
                        }
                        class326 var82 = var51.method4174();
                        if (var82 != null) {
                            var60 = var82.field3900;
                            int var83 = var82.field3901;
                            if (var83 > var79) {
                                var79 = var83;
                            }
                            var64 = var82.field3902;
                        }
                        class326 var84 = var51.method4175();
                        if (var84 != null) {
                            var61 = var84.field3900;
                            int var85 = var84.field3901;
                            if (var85 > var79) {
                                var79 = var85;
                            }
                            var65 = var84.field3902;
                        }
                        class326 var86 = var51.method4200();
                        if (var86 != null) {
                            var62 = var86.field3900;
                            int var87 = var86.field3901;
                            if (var87 > var79) {
                                var79 = var87;
                            }
                            var66 = var86.field3902;
                        }
                        if (var54 != null) {
                            var67 = var54.method4168();
                            if (var67 != null) {
                                var71 = var67.field3900;
                                int var88 = var67.field3901;
                                if (var88 > var79) {
                                    var79 = var88;
                                }
                                var75 = var67.field3902;
                            }
                            var68 = var54.method4174();
                            if (var68 != null) {
                                var72 = var68.field3900;
                                int var89 = var68.field3901;
                                if (var89 > var79) {
                                    var79 = var89;
                                }
                                var76 = var68.field3902;
                            }
                            var69 = var54.method4175();
                            if (var69 != null) {
                                var73 = var69.field3900;
                                int var90 = var69.field3901;
                                if (var90 > var79) {
                                    var79 = var90;
                                }
                                var77 = var69.field3902;
                            }
                            var70 = var54.method4200();
                            if (var70 != null) {
                                var74 = var70.field3900;
                                int var91 = var70.field3901;
                                if (var91 > var79) {
                                    var79 = var91;
                                }
                                var78 = var70.field3902;
                            }
                        }
                        class296 var92 = var51.method4182();
                        if (var92 == null) {
                            var92 = Statics.field2530;
                        }
                        class296 var93;
                        if (var54 == null) {
                            var93 = Statics.field2530;
                        } else {
                            var93 = var54.method4182();
                            if (var93 == null) {
                                var93 = Statics.field2530;
                            }
                        }
                        Object var94 = null;
                        String var95 = null;
                        boolean var96 = false;
                        int var97 = 0;
                        String var98 = var51.method4172(arg0.field981[var48]);
                        int var99 = var92.method4990(var98);
                        if (var54 != null) {
                            var95 = var54.method4172(arg0.field971[var48]);
                            var97 = var93.method4990(var95);
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
                        if (var54 != null && var72 > 0) {
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
                        if (var54 != null) {
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
                        int var116 = arg0.field972[var48] - field882;
                        int var117 = var51.field3336 - var51.field3336 * var116 / var51.field3345;
                        int var118 = var51.field3341 * var116 / var51.field3345 + -var51.field3341;
                        int var119 = field753 + arg2 - (var108 >> 1) + var117;
                        int var120 = field754 + arg3 - 12 + var118;
                        int var121 = var120;
                        int var122 = var79 + var120;
                        int var123 = var51.field3329 + var120 + 15;
                        int var124 = var123 - var92.field3715;
                        int var125 = var92.field3708 + var123;
                        if (var124 < var120) {
                            var121 = var124;
                        }
                        if (var125 > var122) {
                            var122 = var125;
                        }
                        int var126 = 0;
                        if (var54 != null) {
                            var126 = var54.field3329 + var120 + 15;
                            int var127 = var126 - var93.field3715;
                            int var128 = var93.field3708 + var126;
                            if (var127 < var121) {
                                ;
                            }
                            if (var128 > var122) {
                                ;
                            }
                        }
                        int var131 = 255;
                        if (var51.field3342 >= 0) {
                            var131 = (var116 << 8) / (var51.field3345 - var51.field3342);
                        }
                        if (var131 >= 0 && var131 < 255) {
                            if (var80 != null) {
                                var80.method5649(var103 + var119 - var63, var120, var131);
                            }
                            if (var84 != null) {
                                var84.method5649(var104 + var119 - var65, var120, var131);
                            }
                            if (var82 != null) {
                                for (int var132 = 0; var132 < var100; var132++) {
                                    var82.method5649(var60 * var132 + (var105 + var119 - var64), var120, var131);
                                }
                            }
                            if (var86 != null) {
                                var86.method5649(var109 + var119 - var66, var120, var131);
                            }
                            var92.method4928(var98, var106 + var119, var123, var51.field3334, 0, var131);
                            if (var54 != null) {
                                if (var67 != null) {
                                    var67.method5649(var110 + var119 - var75, var120, var131);
                                }
                                if (var69 != null) {
                                    var69.method5649(var111 + var119 - var77, var120, var131);
                                }
                                if (var68 != null) {
                                    for (int var133 = 0; var133 < var101; var133++) {
                                        var68.method5649(var72 * var133 + (var112 + var119 - var76), var120, var131);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method5649(var113 + var119 - var78, var120, var131);
                                }
                                var93.method4928(var95, var114 + var119, var126, var54.field3334, 0, var131);
                            }
                        } else {
                            if (var80 != null) {
                                var80.method5646(var103 + var119 - var63, var120);
                            }
                            if (var84 != null) {
                                var84.method5646(var104 + var119 - var65, var120);
                            }
                            if (var82 != null) {
                                for (int var134 = 0; var134 < var100; var134++) {
                                    var82.method5646(var60 * var134 + (var105 + var119 - var64), var120);
                                }
                            }
                            if (var86 != null) {
                                var86.method5646(var109 + var119 - var66, var120);
                            }
                            var92.method4927(var98, var106 + var119, var123, var51.field3334 | 0xFF000000, 0);
                            if (var54 != null) {
                                if (var67 != null) {
                                    var67.method5646(var110 + var119 - var75, var120);
                                }
                                if (var69 != null) {
                                    var69.method5646(var111 + var119 - var77, var120);
                                }
                                if (var68 != null) {
                                    for (int var135 = 0; var135 < var101; var135++) {
                                        var68.method5646(var72 * var135 + (var112 + var119 - var76), var120);
                                    }
                                }
                                if (var70 != null) {
                                    var70.method5646(var113 + var119 - var78, var120);
                                }
                                var93.method4927(var95, var114 + var119, var126, var54.field3334 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bv.gu(I)V")
    public static final void method1661() {
        field768 = 0;
        int var0 = (Statics.field658.field1006 >> 7) + Statics.field2390;
        int var1 = (Statics.field658.field950 >> 7) + Statics.field2;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field768 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field768 = 1;
        }
        if (field768 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field768 = 0;
        }
    }

    @ObfuscatedName("o.gj(IIIII)V")
    public static final void method253(int arg0, int arg1, int arg2, int arg3) {
        method1661();
    }

    @ObfuscatedName("hm.gd(Lbq;II)V")
    public static final void method3750(class70 arg0, int arg1) {
        method488(arg0.field1006, arg0.field950, arg1);
    }

    @ObfuscatedName("ar.gt(IIII)V")
    public static final void method488(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field753 = -1;
            field754 = -1;
            return;
        }
        int var3 = method992(arg0, arg1, Statics.field373) - arg2;
        int var4 = arg0 - Statics.field3728;
        int var5 = var3 - Statics.field384;
        int var6 = arg1 - Statics.field4;
        int var7 = class131.field1788[Statics.field78];
        int var8 = class131.field1785[Statics.field78];
        int var9 = class131.field1788[Statics.field1113];
        int var10 = class131.field1785[Statics.field1113];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field753 = field918 * var11 / var15 + field747 / 2;
            field754 = field918 * var14 / var15 + field715 / 2;
        } else {
            field753 = -1;
            field754 = -1;
        }
    }

    @ObfuscatedName("bb.go(IIIS)I")
    public static final int method992(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class56.field503[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class56.field517[var5][var3][var4] + class56.field517[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field517[var5][var3][var4 + 1] + class56.field517[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("br.gr(IIIIIIII)V")
    public static final void method1559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field909 - field907) * var7 / 100 + field907;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class131.field1788[var11];
            int var17 = class131.field1785[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class131.field1788[var12];
            int var20 = class131.field1785[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        Statics.field3728 = arg0 - var13;
        Statics.field384 = arg1 - var14;
        Statics.field4 = arg2 - var15;
        Statics.field78 = arg3;
        Statics.field1113 = arg4;
        if (field728 == 1 && field891 >= 2 && field882 % 50 == 0 && (Statics.field500 >> 7 != Statics.field658.field1006 >> 7 || Statics.field228 >> 7 != Statics.field658.field950 >> 7)) {
            int var22 = Statics.field658.field630;
            int var23 = (Statics.field500 >> 7) + Statics.field2390;
            int var24 = (Statics.field228 >> 7) + Statics.field2;
            method362(var23, var24, var22, true);
        }
    }

    @ObfuscatedName("bg.gk(ZLkx;I)V")
    public static final void method946(boolean arg0, class300 arg1) {
        field799 = arg0;
        if (!field799) {
            int var2 = arg1.method5107();
            int var3 = arg1.method5091();
            int var4 = arg1.method5069();
            Statics.field256 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field256[var5][var6] = arg1.method5072();
                }
            }
            Statics.field2502 = new int[var4];
            Statics.field1249 = new int[var4];
            Statics.field179 = new int[var4];
            Statics.field91 = new byte[var4][];
            Statics.field1146 = new byte[var4][];
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
                        Statics.field2502[var8] = var11;
                        Statics.field1249[var8] = Statics.field308.method3791("m" + var9 + "_" + var10);
                        Statics.field179[var8] = Statics.field308.method3791("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method3110(var3, var2, true);
            return;
        }
        int var12 = arg1.method5091();
        int var13 = arg1.method5107();
        boolean var14 = arg1.method5077() == 1;
        int var15 = arg1.method5069();
        arg1.method5011();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5018(1);
                    if (var19 == 1) {
                        field713[var16][var17][var18] = arg1.method5018(26);
                    } else {
                        field713[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5019();
        Statics.field256 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field256[var20][var21] = arg1.method5072();
            }
        }
        Statics.field2502 = new int[var15];
        Statics.field1249 = new int[var15];
        Statics.field179 = new int[var15];
        Statics.field91 = new byte[var15][];
        Statics.field1146 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field713[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field2502[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field2502[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1249[var22] = Statics.field308.method3791("m" + var31 + "_" + var32);
                            Statics.field179[var22] = Statics.field308.method3791("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method3110(var13, var12, !var14);
    }

    @ObfuscatedName("ey.gf(IIZI)V")
    public static final void method3110(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field419 == arg0 && Statics.field1748 == arg1) {
            return;
        }
        Statics.field419 = arg0;
        Statics.field1748 = arg1;
        Statics.method2069(25);
        method4780(class225.field2768, true);
        int var3 = Statics.field2390;
        int var4 = Statics.field2;
        Statics.field2390 = (arg0 - 6) * 8;
        Statics.field2 = (arg1 - 6) * 8;
        int var5 = Statics.field2390 - var3;
        int var6 = Statics.field2 - var4;
        int var7 = Statics.field2390;
        int var8 = Statics.field2;
        for (int var9 = 0; var9 < 32768; var9++) {
            class80 var10 = field695[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field995[var11] -= var5;
                    var10.field963[var11] -= var6;
                }
                var10.field1006 -= var5 * 128;
                var10.field950 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field910[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field995[var14] -= var5;
                    var13.field963[var14] -= var6;
                }
                var13.field1006 -= var5 * 128;
                var13.field950 -= var6 * 128;
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
                        field888[var25][var21][var22] = field888[var25][var23][var24];
                    } else {
                        field888[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field784.method4507(); var26 != null; var26 = (class69) field784.method4509()) {
            var26.field938 -= var5;
            var26.field935 -= var6;
            if (var26.field938 < 0 || var26.field935 < 0 || var26.field938 >= 104 || var26.field935 >= 104) {
                var26.method3286();
            }
        }
        if (field886 != 0) {
            field886 -= var5;
            field843 -= var6;
        }
        field894 = 0;
        field900 = false;
        Statics.field3728 -= var5 << 7;
        Statics.field4 -= var6 << 7;
        Statics.field500 -= var5 << 7;
        Statics.field228 -= var6 << 7;
        field748 = -1;
        field786.method4501();
        field671.method4501();
        for (int var27 = 0; var27 < 4; var27++) {
            field711[var27].method3240();
        }
    }

    @ObfuscatedName("iw.ga(ZI)V")
    public static final void method3985(boolean arg0) {
        method3298();
        field881.field1320++;
        if (field881.field1320 < 50 && !arg0) {
            return;
        }
        field881.field1320 = 0;
        if (field702 || field881.method2027() == null) {
            return;
        }
        class188 var1 = class188.method3894(class184.field2226, field881.field1314);
        field881.method2023(var1);
        try {
            field881.method2038();
        } catch (IOException var3) {
            field702 = true;
        }
    }

    @ObfuscatedName("gb.gi(I)V")
    public static final void method3307() {
        method3985(false);
        field706 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field91.length; var1++) {
            if (Statics.field1249[var1] != -1 && Statics.field91[var1] == null) {
                Statics.field91[var1] = Statics.field308.method3775(Statics.field1249[var1], 0);
                if (Statics.field91[var1] == null) {
                    var0 = false;
                    field706++;
                }
            }
            if (Statics.field179[var1] != -1 && Statics.field1146[var1] == null) {
                Statics.field1146[var1] = Statics.field308.method3812(Statics.field179[var1], 0, Statics.field256[var1]);
                if (Statics.field1146[var1] == null) {
                    var0 = false;
                    field706++;
                }
            }
        }
        if (!var0) {
            field710 = 1;
            return;
        }
        field708 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field91.length; var3++) {
            byte[] var4 = Statics.field1146[var3];
            if (var4 != null) {
                int var5 = (Statics.field2502[var3] >> 8) * 64 - Statics.field2390;
                int var6 = (Statics.field2502[var3] & 0xFF) * 64 - Statics.field2;
                if (field799) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class56.method3584(var4, var5, var6);
            }
        }
        if (!var2) {
            field710 = 2;
            return;
        }
        if (field710 != 0) {
            method4780(class225.field2768 + class82.field1152 + class82.field1151 + 100 + "%" + class82.field1154, true);
        }
        method3298();
        Statics.field23.method2809();
        for (int var7 = 0; var7 < 4; var7++) {
            field711[var7].method3240();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class56.field503[var8][var9][var10] = 0;
                }
            }
        }
        method3298();
        class56.field504 = 99;
        Statics.field505 = new byte[4][104][104];
        Statics.field506 = new byte[4][104][104];
        Statics.field507 = new byte[4][104][104];
        Statics.field3562 = new byte[4][104][104];
        Statics.field1888 = new int[4][105][105];
        Statics.field283 = new byte[4][105][105];
        Statics.field516 = new int[105][105];
        Statics.field3104 = new int[104];
        Statics.field509 = new int[104];
        Statics.field508 = new int[104];
        Statics.field1302 = new int[104];
        Statics.field3690 = new int[104];
        int var11 = Statics.field91.length;
        for (class76 var12 = (class76) class76.field1081.method4507(); var12 != null; var12 = (class76) class76.field1081.method4509()) {
            if (var12.field1086 != null) {
                Statics.field533.method2097(var12.field1086);
                var12.field1086 = null;
            }
            if (var12.field1085 != null) {
                Statics.field533.method2097(var12.field1085);
                var12.field1085 = null;
            }
        }
        class76.field1081.method4501();
        method3985(true);
        if (!field799) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field2502[var13] >> 8) * 64 - Statics.field2390;
                int var15 = (Statics.field2502[var13] & 0xFF) * 64 - Statics.field2;
                byte[] var16 = Statics.field91[var13];
                if (var16 != null) {
                    method3298();
                    int var17 = Statics.field419 * 8 - 48;
                    int var18 = Statics.field1748 * 8 - 48;
                    class173[] var19 = field711;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field2086[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class301 var23 = new class301(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                class56.method363(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (Statics.field2502[var27] >> 8) * 64 - Statics.field2390;
                int var29 = (Statics.field2502[var27] & 0xFF) * 64 - Statics.field2;
                byte[] var30 = Statics.field91[var27];
                if (var30 == null && Statics.field1748 < 800) {
                    method3298();
                    class56.method1901(var28, var29, 64, 64);
                }
            }
            method3985(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = Statics.field1146[var31];
                if (var32 != null) {
                    int var33 = (Statics.field2502[var31] >> 8) * 64 - Statics.field2390;
                    int var34 = (Statics.field2502[var31] & 0xFF) * 64 - Statics.field2;
                    method3298();
                    class56.method3574(var32, var33, var34, Statics.field23, field711);
                }
            }
        }
        if (field799) {
            for (int var35 = 0; var35 < 4; var35++) {
                method3298();
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        boolean var38 = false;
                        int var39 = field713[var35][var36][var37];
                        if (var39 != -1) {
                            int var40 = var39 >> 24 & 0x3;
                            int var41 = var39 >> 1 & 0x3;
                            int var42 = var39 >> 14 & 0x3FF;
                            int var43 = var39 >> 3 & 0x7FF;
                            int var44 = (var42 / 8 << 8) + var43 / 8;
                            for (int var45 = 0; var45 < Statics.field2502.length; var45++) {
                                if (Statics.field2502[var45] == var44 && Statics.field91[var45] != null) {
                                    class56.method950(Statics.field91[var45], var35, var36 * 8, var37 * 8, var40, (var42 & 0x7) * 8, (var43 & 0x7) * 8, var41, field711);
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
                                    class56.field517[var46][var47 + var49][var48 + var50] = 0;
                                }
                            }
                            if (var47 > 0) {
                                for (int var51 = 1; var51 < 8; var51++) {
                                    class56.field517[var46][var47][var48 + var51] = class56.field517[var46][var47 - 1][var48 + var51];
                                }
                            }
                            if (var48 > 0) {
                                for (int var52 = 1; var52 < 8; var52++) {
                                    class56.field517[var46][var47 + var52][var48] = class56.field517[var46][var47 + var52][var48 - 1];
                                }
                            }
                            if (var47 > 0 && class56.field517[var46][var47 - 1][var48] != 0) {
                                class56.field517[var46][var47][var48] = class56.field517[var46][var47 - 1][var48];
                            } else if (var48 > 0 && class56.field517[var46][var47][var48 - 1] != 0) {
                                class56.field517[var46][var47][var48] = class56.field517[var46][var47][var48 - 1];
                            } else if (var47 > 0 && var48 > 0 && class56.field517[var46][var47 - 1][var48 - 1] != 0) {
                                class56.field517[var46][var47][var48] = class56.field517[var46][var47 - 1][var48 - 1];
                            }
                        }
                    }
                }
            }
            for (int var53 = 0; var53 < 13; var53++) {
                for (int var54 = 0; var54 < 13; var54++) {
                    int var55 = field713[0][var53][var54];
                    if (var55 == -1) {
                        class56.method1901(var53 * 8, var54 * 8, 8, 8);
                    }
                }
            }
            method3985(true);
            for (int var56 = 0; var56 < 4; var56++) {
                method3298();
                for (int var57 = 0; var57 < 13; var57++) {
                    label362: for (int var58 = 0; var58 < 13; var58++) {
                        int var59 = field713[var56][var57][var58];
                        if (var59 != -1) {
                            int var60 = var59 >> 24 & 0x3;
                            int var61 = var59 >> 1 & 0x3;
                            int var62 = var59 >> 14 & 0x3FF;
                            int var63 = var59 >> 3 & 0x7FF;
                            int var64 = (var62 / 8 << 8) + var63 / 8;
                            for (int var65 = 0; var65 < Statics.field2502.length; var65++) {
                                if (Statics.field2502[var65] == var64 && Statics.field1146[var65] != null) {
                                    byte[] var66 = Statics.field1146[var65];
                                    int var67 = var57 * 8;
                                    int var68 = var58 * 8;
                                    int var69 = (var62 & 0x7) * 8;
                                    int var70 = (var63 & 0x7) * 8;
                                    class134 var71 = Statics.field23;
                                    class173[] var72 = field711;
                                    class301 var73 = new class301(var66);
                                    int var74 = -1;
                                    while (true) {
                                        int var75 = var73.method5082();
                                        if (var75 == 0) {
                                            continue label362;
                                        }
                                        var74 += var75;
                                        int var76 = 0;
                                        while (true) {
                                            int var77 = var73.method5081();
                                            if (var77 == 0) {
                                                break;
                                            }
                                            var76 += var77 - 1;
                                            int var78 = var76 & 0x3F;
                                            int var79 = var76 >> 6 & 0x3F;
                                            int var80 = var76 >> 12;
                                            int var81 = var73.method5077();
                                            int var82 = var81 >> 2;
                                            int var83 = var81 & 0x3;
                                            if (var60 == var80 && var79 >= var69 && var79 < var69 + 8 && var78 >= var70 && var78 < var70 + 8) {
                                                class254 var84 = class254.method2713(var74);
                                                int var86 = var79 & 0x7;
                                                int var87 = var78 & 0x7;
                                                int var89 = var84.field3366;
                                                int var90 = var84.field3367;
                                                if ((var83 & 0x1) == 1) {
                                                    int var91 = var89;
                                                    var89 = var90;
                                                    var90 = var91;
                                                }
                                                int var92 = var61 & 0x3;
                                                int var93;
                                                if (var92 == 0) {
                                                    var93 = var86;
                                                } else if (var92 == 1) {
                                                    var93 = var87;
                                                } else if (var92 == 2) {
                                                    var93 = 7 - var86 - (var89 - 1);
                                                } else {
                                                    var93 = 7 - var87 - (var90 - 1);
                                                }
                                                int var94 = var67 + var93;
                                                int var96 = var79 & 0x7;
                                                int var97 = var78 & 0x7;
                                                int var99 = var84.field3366;
                                                int var100 = var84.field3367;
                                                if ((var83 & 0x1) == 1) {
                                                    int var101 = var99;
                                                    var99 = var100;
                                                    var100 = var101;
                                                }
                                                int var102 = var61 & 0x3;
                                                int var103;
                                                if (var102 == 0) {
                                                    var103 = var97;
                                                } else if (var102 == 1) {
                                                    var103 = 7 - var96 - (var99 - 1);
                                                } else if (var102 == 2) {
                                                    var103 = 7 - var97 - (var100 - 1);
                                                } else {
                                                    var103 = var96;
                                                }
                                                int var104 = var68 + var103;
                                                if (var94 > 0 && var104 > 0 && var94 < 103 && var104 < 103) {
                                                    int var105 = var56;
                                                    if ((class56.field503[1][var94][var104] & 0x2) == 2) {
                                                        var105 = var56 - 1;
                                                    }
                                                    class173 var106 = null;
                                                    if (var105 >= 0) {
                                                        var106 = var72[var105];
                                                    }
                                                    class56.method1098(var56, var94, var104, var74, var61 + var83 & 0x3, var82, var71, var106);
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
        method3985(true);
        method3298();
        class56.method58(Statics.field23, field711);
        method3985(true);
        int var107 = class56.field504;
        if (var107 > Statics.field373) {
            var107 = Statics.field373;
        }
        if (var107 < Statics.field373 - 1) {
            int var108 = Statics.field373 - 1;
        }
        if (field657) {
            Statics.field23.method2810(class56.field504);
        } else {
            Statics.field23.method2810(0);
        }
        for (int var109 = 0; var109 < 104; var109++) {
            for (int var110 = 0; var110 < 104; var110++) {
                method46(var109, var110);
            }
        }
        method3298();
        for (class69 var111 = (class69) field784.method4507(); var111 != null; var111 = (class69) field784.method4509()) {
            if (var111.field932 == -1) {
                var111.field942 = 0;
                method4908(var111);
            } else {
                var111.method3286();
            }
        }
        class254.field3388.method3042();
        if (Statics.field234.method793()) {
            class188 var112 = class188.method3894(class184.field2213, field881.field1314);
            var112.field2334.method5054(1057001181);
            field881.method2023(var112);
        }
        if (!field799) {
            int var113 = (Statics.field419 - 6) / 8;
            int var114 = (Statics.field419 + 6) / 8;
            int var115 = (Statics.field1748 - 6) / 8;
            int var116 = (Statics.field1748 + 6) / 8;
            for (int var117 = var113 - 1; var117 <= var114 + 1; var117++) {
                for (int var118 = var115 - 1; var118 <= var116 + 1; var118++) {
                    if (var117 < var113 || var117 > var114 || var118 < var115 || var118 > var116) {
                        Statics.field308.method3797("m" + var117 + "_" + var118);
                        Statics.field308.method3797("l" + var117 + "_" + var118);
                    }
                }
            }
        }
        Statics.method2069(30);
        method3298();
        class56.method649();
        class188 var119 = class188.method3894(class184.field2280, field881.field1314);
        field881.method2023(var119);
        class54.method3010();
    }

    @ObfuscatedName("p.gm(IIIIII)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field23.method2873(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field23.method2839(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field2103.field3909;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class129.method632(var5);
            class254 var17 = class254.method2713(var16);
            if (var17.field3380 == -1) {
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
                class325 var18 = Statics.field3661[var17.field3380];
                if (var18 != null) {
                    int var19 = (var17.field3366 * 4 - var18.field3898) / 2;
                    int var20 = (var17.field3367 * 4 - var18.field3894) / 2;
                    var18.method5621(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field3367) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field23.method2837(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field23.method2839(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class129.method632(var21);
            class254 var27 = class254.method2713(var26);
            if (var27.field3380 != -1) {
                class325 var28 = Statics.field3661[var27.field3380];
                if (var28 != null) {
                    int var29 = (var27.field3366 * 4 - var28.field3898) / 2;
                    int var30 = (var27.field3367 * 4 - var28.field3894) / 2;
                    var28.method5621(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field3367) * 4 + 48 + var30);
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
                int[] var35 = Statics.field2103.field3909;
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
        long var37 = Statics.field23.method2838(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class129.method632(var37);
        class254 var40 = class254.method2713(var39);
        if (var40.field3380 == -1) {
            return;
        }
        class325 var41 = Statics.field3661[var40.field3380];
        if (var41 != null) {
            int var42 = (var40.field3366 * 4 - var41.field3898) / 2;
            int var43 = (var40.field3367 * 4 - var41.field3894) / 2;
            var41.method5621(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field3367) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.gg(Lcg;I)Z")
    public final boolean method1297(class96 arg0) {
        class306 var2 = arg0.method2027();
        class300 var3 = arg0.field1315;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1311 == null) {
                if (arg0.field1323) {
                    if (!var2.method3216(1)) {
                        return false;
                    }
                    var2.method3208(arg0.field1315.field3731, 0, 1);
                    arg0.field1319 = 0;
                    arg0.field1323 = false;
                }
                var3.field3733 = 0;
                if (var3.method5014()) {
                    if (!var2.method3216(1)) {
                        return false;
                    }
                    var2.method3208(arg0.field1315.field3731, 1, 1);
                    arg0.field1319 = 0;
                }
                arg0.field1323 = true;
                class183[] var4 = class183.method1769();
                int var5 = var3.method5024();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field3733);
                }
                arg0.field1311 = var4[var5];
                arg0.field1316 = arg0.field1311.field2147;
            }
            if (arg0.field1316 == -1) {
                if (!var2.method3216(1)) {
                    return false;
                }
                arg0.method2027().method3208(var3.field3731, 0, 1);
                arg0.field1316 = var3.field3731[0] & 0xFF;
            }
            if (arg0.field1316 == -2) {
                if (!var2.method3216(2)) {
                    return false;
                }
                arg0.method2027().method3208(var3.field3731, 0, 2);
                var3.field3733 = 0;
                arg0.field1316 = var3.method5069();
            }
            if (!var2.method3216(arg0.field1316)) {
                return false;
            }
            var3.field3733 = 0;
            var2.method3208(var3.field3731, 0, arg0.field1316);
            arg0.field1319 = 0;
            field798.method4620();
            arg0.field1318 = arg0.field1322;
            arg0.field1322 = arg0.field1310;
            arg0.field1310 = arg0.field1311;
            if (class183.field2137 == arg0.field1311) {
                int var6 = var3.method5072();
                boolean var7 = var3.method5077() == 1;
                class218 var8 = class218.method1799(var6);
                if (var8.field2707 != var7) {
                    var8.field2707 = var7;
                    method3755(var8);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2116 == arg0.field1311) {
                field653 = var3.method5077();
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2201 == arg0.field1311) {
                int var9 = var3.method5077();
                method2272(var9);
                arg0.field1311 = null;
                return false;
            }
            if (class183.field2129 == arg0.field1311) {
                method8(class186.field2321);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2169 == arg0.field1311) {
                byte var10 = var3.method5267();
                int var11 = var3.method5091();
                class213.field2525[var11] = var10;
                if (class213.field2526[var11] != var10) {
                    class213.field2526[var11] = var10;
                }
                method110(var11);
                field864[++field807 - 1 & 0x1F] = var11;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2180 == arg0.field1311) {
                Statics.field3820 = var3.method5097();
                Statics.field1307 = var3.method5098();
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2162 == arg0.field1311) {
                int var12 = var3.method5105();
                class60.method2507(var12);
                field889[++field672 - 1 & 0x1F] = var12 & 0x7FFF;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2150 == arg0.field1311) {
                int var13 = var3.method5077();
                method3350(var13);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2138 == arg0.field1311) {
                method8(class186.field2316);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2188 == arg0.field1311) {
                field670 = var3.method5069() * 30;
                field845 = field674;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2124 == arg0.field1311) {
                int var14 = var3.method5107();
                int var15 = var3.method5107();
                int var16 = var3.method5107();
                int var17 = var3.method5116();
                class218 var18 = class218.method1799(var17);
                if (var18.field2616 != var14 || var18.field2617 != var16 || var18.field2619 != var15) {
                    var18.field2616 = var14;
                    var18.field2617 = var16;
                    var18.field2619 = var15;
                    method3755(var18);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2121 == arg0.field1311) {
                Statics.field1307 = var3.method5098();
                Statics.field3820 = var3.method5097();
                while (var3.field3733 < arg0.field1316) {
                    int var19 = var3.method5077();
                    class186 var20 = class186.method56()[var19];
                    method8(var20);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2126 == arg0.field1311) {
                int var21 = var3.method5072();
                int var22 = var3.method5069();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = var3.method5116();
                class218 var24 = class218.method1799(var21);
                if (var24.field2564) {
                    var24.field2691 = var22;
                    var24.field2656 = var23;
                    class255 var26 = class255.method348(var22);
                    var24.field2616 = var26.field3419;
                    var24.field2617 = var26.field3448;
                    var24.field2641 = var26.field3421;
                    var24.field2594 = var26.field3407;
                    var24.field2615 = var26.field3422;
                    var24.field2619 = var26.field3423;
                    if (var26.field3424 == 1) {
                        var24.field2704 = 1;
                    } else {
                        var24.field2704 = 2;
                    }
                    if (var24.field2620 > 0) {
                        var24.field2619 = var24.field2619 * 32 / var24.field2620;
                    } else if (var24.field2671 > 0) {
                        var24.field2619 = var24.field2619 * 32 / var24.field2671;
                    }
                    method3755(var24);
                } else if (var22 == -1) {
                    var24.field2608 = 0;
                    arg0.field1311 = null;
                    return true;
                } else {
                    class255 var25 = class255.method348(var22);
                    var24.field2608 = 4;
                    var24.field2650 = var22;
                    var24.field2616 = var25.field3419;
                    var24.field2617 = var25.field3448;
                    var24.field2619 = var25.field3423 * 100 / var23;
                    method3755(var24);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2159 == arg0.field1311) {
                int var27 = var3.method5069();
                int var28 = var3.method5077();
                int var29 = var3.method5069();
                method1810(var27, var28, var29);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2155 == arg0.field1311) {
                int var30 = var3.method5077();
                int var31 = var3.method5077();
                int var32 = var3.method5077();
                int var33 = var3.method5077();
                field887[var30] = true;
                field902[var30] = var31;
                field903[var30] = var32;
                field904[var30] = var33;
                field905[var30] = 0;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2167 == arg0.field1311) {
                method946(true, arg0.field1315);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2195 == arg0.field1311) {
                class90.method982(var3, arg0.field1316);
                method1662();
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2199 == arg0.field1311) {
                field900 = true;
                Statics.field1018 = var3.method5077();
                Statics.field260 = var3.method5077();
                Statics.field269 = var3.method5069();
                Statics.field527 = var3.method5077();
                Statics.field502 = var3.method5077();
                if (Statics.field502 >= 100) {
                    int var34 = Statics.field1018 * 128 + 64;
                    int var35 = Statics.field260 * 128 + 64;
                    int var36 = method992(var34, var35, Statics.field373) - Statics.field269;
                    int var37 = var34 - Statics.field3728;
                    int var38 = var36 - Statics.field384;
                    int var39 = var35 - Statics.field4;
                    int var40 = (int) Math.sqrt((double) (var37 * var37 + var39 * var39));
                    Statics.field78 = (int) (Math.atan2((double) var38, (double) var40) * 325.949D) & 0x7FF;
                    Statics.field1113 = (int) (Math.atan2((double) var37, (double) var39) * -325.949D) & 0x7FF;
                    if (Statics.field78 < 128) {
                        Statics.field78 = 128;
                    }
                    if (Statics.field78 > 383) {
                        Statics.field78 = 383;
                    }
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2117 == arg0.field1311) {
                method3275();
                arg0.field1311 = null;
                return false;
            }
            if (class183.field2151 == arg0.field1311) {
                class72 var41 = new class72();
                var41.field1030 = var3.method5076();
                var41.field1026 = var3.method5069();
                int var42 = var3.method5072();
                var41.field1024 = var42;
                Statics.method2069(45);
                var2.method3204();
                Object var43 = null;
                class86.method3552(var41);
                arg0.field1311 = null;
                return false;
            }
            if (class183.field2158 == arg0.field1311) {
                method8(class186.field2319);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2165 == arg0.field1311) {
                method8(class186.field2325);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2146 == arg0.field1311) {
                int var44 = var3.method5116();
                int var45 = var3.method5107();
                class218 var46 = class218.method1799(var44);
                if (var46 != null && var46.field2567 == 0) {
                    if (var45 > var46.field2570 - var46.field2668) {
                        var45 = var46.field2570 - var46.field2668;
                    }
                    if (var45 < 0) {
                        var45 = 0;
                    }
                    if (var46.field2587 != var45) {
                        var46.field2587 = var45;
                        method3755(var46);
                    }
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2164 == arg0.field1311) {
                int var47 = var3.method5114();
                int var48 = var3.method5091();
                if (var48 == 65535) {
                    var48 = -1;
                }
                int var49 = var3.method5116();
                int var50 = var3.method5069();
                if (var50 == 65535) {
                    var50 = -1;
                }
                for (int var51 = var50; var51 <= var48; var51++) {
                    long var52 = ((long) var49 << 32) + (long) var51;
                    class181 var54 = field858.method5479(var52);
                    if (var54 != null) {
                        var54.method3286();
                    }
                    field858.method5478(new class180(var47), var52);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2123 == arg0.field1311) {
                int var55 = var3.method5115();
                class218 var56 = class218.method1799(var55);
                for (int var57 = 0; var57 < var56.field2561.length; var57++) {
                    var56.field2561[var57] = -1;
                    var56.field2561[var57] = 0;
                }
                method3755(var56);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2166 == arg0.field1311) {
                int var58 = var3.method5072();
                if (field856 != var58) {
                    field856 = var58;
                    method1505();
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2193 == arg0.field1311) {
                int var59 = var3.method5295();
                int var60 = var3.method5115();
                int var61 = var3.method5107();
                class62 var62 = (class62) field817.method5479((long) var60);
                if (var62 != null) {
                    method3370(var62, var62.field572 != var61);
                }
                Statics.method1491(var60, var61, var59);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2184 == arg0.field1311) {
                Statics.field3073 = class311.method3212(var3.method5077());
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2139 == arg0.field1311) {
                int var63 = var3.method5107();
                if (var63 == 65535) {
                    var63 = -1;
                }
                method79(var63);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2156 == arg0.field1311) {
                int var64 = var3.method5164();
                int var65 = var3.method5091();
                if (var65 == 65535) {
                    var65 = -1;
                }
                method174(var65, var64);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2125 == arg0.field1311) {
                int var66 = var3.method5179();
                int var67 = var3.method5116();
                class218 var68 = class218.method1799(var67);
                if (var68.field2612 != var66 || var66 == -1) {
                    var68.field2612 = var66;
                    var68.field2693 = 0;
                    var68.field2585 = 0;
                    method3755(var68);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2148 == arg0.field1311) {
                Statics.field547.field1072.method4690(var3, arg0.field1316);
                method19();
                field673 = field674;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2197 == arg0.field1311) {
                method949(true, var3);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2143 == arg0.field1311) {
                String var69 = var3.method5076();
                long var70 = var3.method5104();
                long var72 = (long) var3.method5069();
                long var74 = (long) var3.method5140();
                class229 var76 = (class229) class196.method2257(class229.method3130(), var3.method5077());
                long var77 = (var72 << 32) + var74;
                boolean var79 = false;
                for (int var80 = 0; var80 < 100; var80++) {
                    if (field923[var80] == var77) {
                        var79 = true;
                        break;
                    }
                }
                if (var76.field3093 && Statics.field547.method1600(new class284(var69, Statics.field354))) {
                    var79 = true;
                }
                if (!var79 && field768 == 0) {
                    field923[field876] = var77;
                    field876 = (field876 + 1) % 100;
                    String var81 = class297.method4941(class292.method13(class211.method5427(var3)));
                    if (var76.field3091 == -1) {
                        class92.method143(9, var69, var81, class290.method3660(var70));
                    } else {
                        class92.method143(9, class82.method491(var76.field3091) + var69, var81, class290.method3660(var70));
                    }
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2178 == arg0.field1311) {
                String var82 = var3.method5076();
                Object[] var83 = new Object[var82.length() + 1];
                for (int var84 = var82.length() - 1; var84 >= 0; var84--) {
                    if (var82.charAt(var84) == 's') {
                        var83[var84 + 1] = var3.method5076();
                    } else {
                        var83[var84 + 1] = Integer.valueOf(var3.method5072());
                    }
                }
                var83[0] = Integer.valueOf(var3.method5072());
                class63 var85 = new class63();
                var85.field582 = var83;
                class77.method3292(var85);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2134 == arg0.field1311) {
                byte[] var86 = new byte[arg0.field1316];
                var3.method5016(var86, 0, var86.length);
                class301 var87 = new class301(var86);
                String var88 = var87.method5076();
                class52.method36(var88, true, false);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2163 == arg0.field1311) {
                if (arg0.field1316 == 0) {
                    Statics.field411 = null;
                } else {
                    if (Statics.field411 == null) {
                        Statics.field411 = new class286(Statics.field354, Statics.field234);
                    }
                    Statics.field411.method4819(var3);
                }
                method4601();
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2144 == arg0.field1311) {
                for (int var89 = 0; var89 < field910.length; var89++) {
                    if (field910[var89] != null) {
                        field910[var89].field982 = -1;
                    }
                }
                for (int var90 = 0; var90 < field695.length; var90++) {
                    if (field695[var90] != null) {
                        field695[var90].field982 = -1;
                    }
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2190 == arg0.field1311) {
                if (Statics.field411 != null) {
                    Statics.field411.method4820(var3);
                }
                method4601();
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2122 == arg0.field1311) {
                field900 = true;
                Statics.field413 = var3.method5077();
                Statics.field2517 = var3.method5077();
                Statics.field2346 = var3.method5069();
                Statics.field1167 = var3.method5077();
                Statics.field1328 = var3.method5077();
                if (Statics.field1328 >= 100) {
                    Statics.field3728 = Statics.field413 * 128 + 64;
                    Statics.field4 = Statics.field2517 * 128 + 64;
                    Statics.field384 = method992(Statics.field3728, Statics.field4, Statics.field373) - Statics.field2346;
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2118 == arg0.field1311) {
                field900 = false;
                for (int var91 = 0; var91 < 5; var91++) {
                    field887[var91] = false;
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2128 == arg0.field1311) {
                method8(class186.field2320);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2145 == arg0.field1311) {
                Statics.field547.method1595();
                field673 = field674;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2192 == arg0.field1311) {
                method1038();
                int var92 = var3.method5114();
                int var93 = var3.method5097();
                int var94 = var3.method5077();
                field789[var93] = var92;
                field761[var93] = var94;
                field788[var93] = 1;
                for (int var95 = 0; var95 < 98; var95++) {
                    if (var92 >= class222.field2744[var95]) {
                        field788[var93] = var95 + 2;
                    }
                }
                field846[++field847 - 1 & 0x1F] = var93;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2191 == arg0.field1311) {
                method8(class186.field2318);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2130 == arg0.field1311) {
                method8(class186.field2322);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2131 == arg0.field1311) {
                method8(class186.field2323);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2174 == arg0.field1311) {
                int var96 = var3.method5295();
                int var97 = var3.method5295();
                String var98 = var3.method5076();
                if (var97 >= 1 && var97 <= 8) {
                    if (var98.equalsIgnoreCase(class225.field2772)) {
                        var98 = null;
                    }
                    field779[var97 - 1] = var98;
                    field780[var97 - 1] = var96 == 0;
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2177 == arg0.field1311) {
                int var99 = var3.method5072();
                class62 var100 = (class62) field817.method5479((long) var99);
                if (var100 != null) {
                    method3370(var100, true);
                }
                if (field851 != null) {
                    method3755(field851);
                    field851 = null;
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2171 == arg0.field1311) {
                int var101 = var3.method5077();
                if (var3.method5077() == 0) {
                    field867[var101] = new class10();
                    var3.field3733 += 18;
                } else {
                    var3.field3733--;
                    field867[var101] = new class10(var3, false);
                }
                field916 = field674;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2189 == arg0.field1311) {
                for (int var102 = 0; var102 < class213.field2526.length; var102++) {
                    if (class213.field2526[var102] != class213.field2525[var102]) {
                        class213.field2526[var102] = class213.field2525[var102];
                        method110(var102);
                        field864[++field807 - 1 & 0x1F] = var102;
                    }
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2119 == arg0.field1311) {
                int var103 = var3.method5107();
                int var104 = var3.method5116();
                class218 var105 = class218.method1799(var104);
                if (var105.field2608 != 2 || var105.field2650 != var103) {
                    var105.field2608 = 2;
                    var105.field2650 = var103;
                    method3755(var105);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2175 == arg0.field1311) {
                int var106 = var3.method5115();
                int var107 = var3.method5073();
                int var108 = var3.method5108();
                class218 var109 = class218.method1799(var106);
                if (var109.field2652 != var108 || var109.field2575 != var107 || var109.field2695 != 0 || var109.field2571 != 0) {
                    var109.field2652 = var108;
                    var109.field2575 = var107;
                    var109.field2695 = 0;
                    var109.field2571 = 0;
                    method3755(var109);
                    this.method1117(var109);
                    if (var109.field2567 == 0) {
                        method357(Statics.field2557[var106 >> 16], var109, false);
                    }
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2161 == arg0.field1311) {
                method946(false, arg0.field1315);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2153 == arg0.field1311) {
                int var110 = var3.method5081();
                boolean var111 = var3.method5077() == 1;
                String var112 = "";
                boolean var113 = false;
                if (var111) {
                    var112 = var3.method5076();
                    if (Statics.field547.method1600(new class284(var112, Statics.field354))) {
                        var113 = true;
                    }
                }
                String var114 = var3.method5076();
                if (!var113) {
                    class92.method994(var110, var112, var114);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2120 == arg0.field1311) {
                int var115 = var3.method5069();
                int var116 = var3.method5072();
                class213.field2525[var115] = var116;
                if (class213.field2526[var115] != var116) {
                    class213.field2526[var115] = var116;
                }
                method110(var115);
                field864[++field807 - 1 & 0x1F] = var115;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2141 == arg0.field1311) {
                Statics.field1307 = var3.method5097();
                Statics.field3820 = var3.method5077();
                for (int var117 = Statics.field3820; var117 < Statics.field3820 + 8; var117++) {
                    for (int var118 = Statics.field1307; var118 < Statics.field1307 + 8; var118++) {
                        if (field888[Statics.field373][var117][var118] != null) {
                            field888[Statics.field373][var117][var118] = null;
                            method46(var117, var118);
                        }
                    }
                }
                for (class69 var119 = (class69) field784.method4507(); var119 != null; var119 = (class69) field784.method4509()) {
                    if (var119.field938 >= Statics.field3820 && var119.field938 < Statics.field3820 + 8 && var119.field935 >= Statics.field1307 && var119.field935 < Statics.field1307 + 8 && Statics.field373 == var119.field944) {
                        var119.field932 = 0;
                    }
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2185 == arg0.field1311) {
                int var120 = var3.method5072();
                int var121 = var3.method5072();
                int var122 = class54.method2260();
                class188 var123 = class188.method3894(class184.field2237, field881.field1314);
                var123.field2334.method5094(var122);
                var123.field2334.method5228(field463);
                var123.field2334.method5112(var120);
                var123.field2334.method5111(var121);
                field881.method2023(var123);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2200 == arg0.field1311) {
                int var124 = var3.method5107();
                field906 = var124;
                this.method1143(false);
                method132(var124);
                class77.method675(field906);
                for (int var125 = 0; var125 < 100; var125++) {
                    field844[var125] = true;
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2182 == arg0.field1311) {
                int var126 = var3.method5116();
                class218 var127 = class218.method1799(var126);
                var127.field2608 = 3;
                var127.field2650 = Statics.field658.field614.method3631();
                method3755(var127);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2181 == arg0.field1311) {
                String var128 = var3.method5076();
                String var129 = class297.method4941(class292.method13(class211.method5427(var3)));
                class92.method994(6, var128, var129);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2154 == arg0.field1311) {
                class97.method2017(var3, arg0.field1316);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2152 == arg0.field1311) {
                field709 = var3.method5077();
                if (field709 == 1) {
                    field825 = var3.method5069();
                }
                if (field709 >= 2 && field709 <= 6) {
                    if (field709 == 2) {
                        field822 = 64;
                        field678 = 64;
                    }
                    if (field709 == 3) {
                        field822 = 0;
                        field678 = 64;
                    }
                    if (field709 == 4) {
                        field822 = 128;
                        field678 = 64;
                    }
                    if (field709 == 5) {
                        field822 = 64;
                        field678 = 0;
                    }
                    if (field709 == 6) {
                        field822 = 64;
                        field678 = 128;
                    }
                    field709 = 2;
                    field738 = var3.method5069();
                    field778 = var3.method5069();
                    field676 = var3.method5077();
                }
                if (field709 == 10) {
                    field690 = var3.method5069();
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2179 == arg0.field1311) {
                method8(class186.field2324);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2194 == arg0.field1311) {
                for (int var130 = 0; var130 < Statics.field3204; var130++) {
                    class241 var131 = class241.method47(var130);
                    if (var131 != null) {
                        class213.field2525[var130] = 0;
                        class213.field2526[var130] = 0;
                    }
                }
                method1038();
                field807 += 32;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2172 == arg0.field1311) {
                int var132 = arg0.field1316 + var3.field3733;
                int var133 = var3.method5069();
                int var134 = var3.method5069();
                if (field906 != var133) {
                    field906 = var133;
                    this.method1143(false);
                    method132(field906);
                    class77.method675(field906);
                    for (int var135 = 0; var135 < 100; var135++) {
                        field844[var135] = true;
                    }
                }
                while (var134-- > 0) {
                    int var136 = var3.method5072();
                    int var137 = var3.method5069();
                    int var138 = var3.method5077();
                    class62 var139 = (class62) field817.method5479((long) var136);
                    if (var139 != null && var139.field572 != var137) {
                        method3370(var139, true);
                        var139 = null;
                    }
                    if (var139 == null) {
                        var139 = Statics.method1491(var136, var137, var138);
                    }
                    var139.field568 = true;
                }
                for (class62 var140 = (class62) field817.method5477(); var140 != null; var140 = (class62) field817.method5480()) {
                    if (var140.field568) {
                        var140.field568 = false;
                    } else {
                        method3370(var140, true);
                    }
                }
                field858 = new class319(512);
                while (var3.field3733 < var132) {
                    int var141 = var3.method5072();
                    int var142 = var3.method5069();
                    int var143 = var3.method5069();
                    int var144 = var3.method5072();
                    for (int var145 = var142; var145 <= var143; var145++) {
                        long var146 = ((long) var141 << 32) + (long) var145;
                        field858.method5478(new class180(var144), var146);
                    }
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2186 == arg0.field1311) {
                int var148 = var3.method5072();
                int var149 = var3.method5069();
                if (var148 < -70000) {
                    var149 += 32768;
                }
                class218 var150;
                if (var148 >= 0) {
                    var150 = class218.method1799(var148);
                } else {
                    var150 = null;
                }
                if (var150 != null) {
                    for (int var151 = 0; var151 < var150.field2561.length; var151++) {
                        var150.field2561[var151] = 0;
                        var150.field2706[var151] = 0;
                    }
                }
                class60.method130(var149);
                int var152 = var3.method5069();
                for (int var153 = 0; var153 < var152; var153++) {
                    int var154 = var3.method5069();
                    int var155 = var3.method5077();
                    if (var155 == 255) {
                        var155 = var3.method5116();
                    }
                    if (var150 != null && var153 < var150.field2561.length) {
                        var150.field2561[var153] = var154;
                        var150.field2706[var153] = var155;
                    }
                    class60.method120(var149, var153, var154 - 1, var155);
                }
                if (var150 != null) {
                    method3755(var150);
                }
                method1038();
                field889[++field672 - 1 & 0x1F] = var149 & 0x7FFF;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2183 == arg0.field1311) {
                field886 = var3.method5077();
                if (field886 == 255) {
                    field886 = 0;
                }
                field843 = var3.method5077();
                if (field843 == 255) {
                    field843 = 0;
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2187 == arg0.field1311) {
                method1038();
                field824 = var3.method5179();
                field845 = field674;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2196 == arg0.field1311) {
                field873 = var3.method5097();
                field908 = var3.method5097();
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2135 == arg0.field1311) {
                int var156 = var3.method5072();
                String var157 = var3.method5076();
                class218 var158 = class218.method1799(var156);
                if (!var157.equals(var158.field2602)) {
                    var158.field2602 = var157;
                    method3755(var158);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2168 == arg0.field1311) {
                if (field906 != -1) {
                    method161(field906, 0);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2132 == arg0.field1311) {
                boolean var159 = var3.method5271();
                if (!var159) {
                    Statics.field945 = null;
                } else if (Statics.field945 == null) {
                    Statics.field945 = new class238();
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2136 == arg0.field1311) {
                boolean var160 = var3.method5077() == 1;
                if (var160) {
                    Statics.field3633 = class298.method3576() - var3.method5104();
                    Statics.field943 = new class7(var3, true);
                } else {
                    Statics.field943 = null;
                }
                field852 = field674;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2140 == arg0.field1311) {
                int var161 = var3.method5115();
                int var162 = var3.method5091();
                int var163 = var162 >> 10 & 0x1F;
                int var164 = var162 >> 5 & 0x1F;
                int var165 = var162 & 0x1F;
                int var166 = (var165 << 3) + (var163 << 19) + (var164 << 11);
                class218 var167 = class218.method1799(var161);
                if (var167.field2696 != var166) {
                    var167.field2696 = var166;
                    method3755(var167);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2173 == arg0.field1311) {
                var3.field3733 += 28;
                if (var3.method5092()) {
                    method351(var3, var3.field3733 - 28);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2127 == arg0.field1311) {
                method8(class186.field2317);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2198 == arg0.field1311) {
                int var168 = var3.method5072();
                int var169 = var3.method5072();
                class62 var170 = (class62) field817.method5479((long) var169);
                class62 var171 = (class62) field817.method5479((long) var168);
                if (var171 != null) {
                    method3370(var171, var170 == null || var170.field572 != var171.field572);
                }
                if (var170 != null) {
                    var170.method3286();
                    field817.method5478(var170, (long) var168);
                }
                class218 var172 = class218.method1799(var169);
                if (var172 != null) {
                    method3755(var172);
                }
                class218 var173 = class218.method1799(var168);
                if (var173 != null) {
                    method3755(var173);
                    method357(Statics.field2557[var173.field2689 >>> 16], var173, true);
                }
                if (field906 != -1) {
                    method161(field906, 1);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2142 == arg0.field1311) {
                String var174 = var3.method5076();
                long var175 = (long) var3.method5069();
                long var177 = (long) var3.method5140();
                class229 var179 = (class229) class196.method2257(class229.method3130(), var3.method5077());
                long var180 = (var175 << 32) + var177;
                boolean var182 = false;
                for (int var183 = 0; var183 < 100; var183++) {
                    if (field923[var183] == var180) {
                        var182 = true;
                        break;
                    }
                }
                if (Statics.field547.method1600(new class284(var174, Statics.field354))) {
                    var182 = true;
                }
                if (!var182 && field768 == 0) {
                    field923[field876] = var180;
                    field876 = (field876 + 1) % 100;
                    String var184 = class297.method4941(class292.method13(class211.method5427(var3)));
                    byte var185;
                    if (var179.field3092) {
                        var185 = 7;
                    } else {
                        var185 = 3;
                    }
                    if (var179.field3091 == -1) {
                        class92.method994(var185, var174, var184);
                    } else {
                        class92.method994(var185, class82.method491(var179.field3091) + var174, var184);
                    }
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2149 == arg0.field1311) {
                method949(false, var3);
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2157 == arg0.field1311) {
                int var186 = var3.method5091();
                int var187 = var3.method5105();
                int var188 = var3.method5115();
                class218 var189 = class218.method1799(var188);
                var189.field2576 = (var187 << 16) + var186;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2133 == arg0.field1311) {
                Statics.field547.method1640(var3, arg0.field1316);
                field673 = field674;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2176 == arg0.field1311) {
                int var190 = var3.method5116();
                int var191 = var3.method5107();
                class218 var192 = class218.method1799(var190);
                if (var192.field2608 != 1 || var192.field2650 != var191) {
                    var192.field2608 = 1;
                    var192.field2650 = var191;
                    method3755(var192);
                }
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2160 == arg0.field1311) {
                int var193 = var3.method5072();
                int var194 = var3.method5069();
                if (var193 < -70000) {
                    var194 += 32768;
                }
                class218 var195;
                if (var193 >= 0) {
                    var195 = class218.method1799(var193);
                } else {
                    var195 = null;
                }
                while (var3.field3733 < arg0.field1316) {
                    int var196 = var3.method5081();
                    int var197 = var3.method5069();
                    int var198 = 0;
                    if (var197 != 0) {
                        var198 = var3.method5077();
                        if (var198 == 255) {
                            var198 = var3.method5072();
                        }
                    }
                    if (var195 != null && var196 >= 0 && var196 < var195.field2561.length) {
                        var195.field2561[var196] = var197;
                        var195.field2706[var196] = var198;
                    }
                    class60.method120(var194, var196, var197 - 1, var198);
                }
                if (var195 != null) {
                    method3755(var195);
                }
                method1038();
                field889[++field672 - 1 & 0x1F] = var194 & 0x7FFF;
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2203 == arg0.field1311) {
                method141(var3.method5076());
                arg0.field1311 = null;
                return true;
            }
            if (class183.field2170 == arg0.field1311) {
                method1038();
                field911 = var3.method5077();
                field845 = field674;
                arg0.field1311 = null;
                return true;
            }
            class342.method4173("" + (arg0.field1311 == null ? -1 : arg0.field1311.field2202) + class82.field1149 + (arg0.field1322 == null ? -1 : arg0.field1322.field2202) + class82.field1149 + (arg0.field1318 == null ? -1 : arg0.field1318.field2202) + class82.field1149 + arg0.field1316, (Throwable) null);
            method3275();
        } catch (IOException var203) {
            method952();
        } catch (Exception var204) {
            String var201 = "" + (arg0.field1311 == null ? -1 : arg0.field1311.field2202) + class82.field1149 + (arg0.field1322 == null ? -1 : arg0.field1322.field2202) + class82.field1149 + (arg0.field1318 == null ? -1 : arg0.field1318.field2202) + class82.field1149 + arg0.field1316 + class82.field1149 + (Statics.field2390 + Statics.field658.field995[0]) + class82.field1149 + (Statics.field2 + Statics.field658.field963[0]) + class82.field1149;
            for (int var202 = 0; var202 < arg0.field1316 && var202 < 50; var202++) {
                var201 = var201 + var3.field3731[var202] + class82.field1149;
            }
            class342.method4173(var201, var204);
            method3275();
        }
        return true;
    }

    @ObfuscatedName("w.gq(Lgw;I)V")
    public static final void method8(class186 arg0) {
        class300 var1 = field881.field1315;
        if (class186.field2321 == arg0) {
            int var2 = var1.method5098();
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = field714[var3];
            int var6 = var1.method5098();
            int var7 = (var6 >> 4 & 0x7) + Statics.field3820;
            int var8 = (var6 & 0x7) + Statics.field1307;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method3542(Statics.field373, var7, var8, var5, -1, var3, var4, 0, -1);
            }
        } else if (class186.field2322 == arg0) {
            int var9 = var1.method5295();
            int var10 = (var9 >> 4 & 0x7) + Statics.field3820;
            int var11 = (var9 & 0x7) + Statics.field1307;
            int var12 = var1.method5107();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                class262 var13 = field888[Statics.field373][var10][var11];
                if (var13 != null) {
                    for (class88 var14 = (class88) var13.method4507(); var14 != null; var14 = (class88) var13.method4509()) {
                        if ((var12 & 0x7FFF) == var14.field1245) {
                            var14.method3286();
                            break;
                        }
                    }
                    if (var13.method4507() == null) {
                        field888[Statics.field373][var10][var11] = null;
                    }
                    method46(var10, var11);
                }
            }
        } else if (class186.field2317 == arg0) {
            int var15 = var1.method5098() * 4;
            int var16 = var1.method5069();
            int var17 = var1.method5091();
            int var18 = var1.method5098() * 4;
            int var19 = var1.method5108();
            int var20 = var1.method5077();
            int var21 = var1.method5098();
            int var22 = var1.method5105();
            int var23 = var1.method5295();
            int var24 = (var23 >> 4 & 0x7) + Statics.field3820;
            int var25 = (var23 & 0x7) + Statics.field1307;
            byte var26 = var1.method5267();
            byte var27 = var1.method5100();
            int var28 = var24 + var27;
            int var29 = var25 + var26;
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104 && var17 != 65535) {
                int var30 = var24 * 128 + 64;
                int var31 = var25 * 128 + 64;
                int var32 = var28 * 128 + 64;
                int var33 = var29 * 128 + 64;
                class87 var34 = new class87(var17, Statics.field373, var30, var31, method992(var30, var31, Statics.field373) - var18, field882 + var22, field882 + var16, var20, var21, var19, var15);
                var34.method1851(var32, var33, method992(var32, var33, Statics.field373) - var15, field882 + var22);
                field671.method4532(var34);
            }
        } else if (class186.field2323 == arg0) {
            int var35 = var1.method5105();
            int var36 = var1.method5107();
            int var37 = var1.method5105();
            int var38 = var1.method5295();
            int var39 = (var38 >> 4 & 0x7) + Statics.field3820;
            int var40 = (var38 & 0x7) + Statics.field1307;
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class262 var41 = field888[Statics.field373][var39][var40];
                if (var41 != null) {
                    for (class88 var42 = (class88) var41.method4507(); var42 != null; var42 = (class88) var41.method4509()) {
                        if ((var35 & 0x7FFF) == var42.field1245 && var42.field1246 == var37) {
                            var42.field1246 = var36;
                            break;
                        }
                    }
                    method46(var39, var40);
                }
            }
        } else if (class186.field2316 == arg0) {
            int var43 = var1.method5091();
            int var44 = var1.method5107();
            int var45 = var1.method5295();
            int var46 = (var45 >> 4 & 0x7) + Statics.field3820;
            int var47 = (var45 & 0x7) + Statics.field1307;
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                class88 var48 = new class88();
                var48.field1245 = var44;
                var48.field1246 = var43;
                if (field888[Statics.field373][var46][var47] == null) {
                    field888[Statics.field373][var46][var47] = new class262();
                }
                field888[Statics.field373][var46][var47].method4532(var48);
                method46(var46, var47);
            }
        } else {
            if (class186.field2320 == arg0) {
                int var49 = var1.method5077();
                int var50 = (var49 >> 4 & 0x7) + Statics.field3820;
                int var51 = (var49 & 0x7) + Statics.field1307;
                int var52 = var1.method5098();
                int var53 = var1.method5295();
                int var54 = var53 >> 4 & 0xF;
                int var55 = var53 & 0x7;
                int var56 = var1.method5107();
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    int var57 = var54 + 1;
                    if (Statics.field658.field995[0] >= var50 - var57 && Statics.field658.field995[0] <= var50 + var57 && Statics.field658.field963[0] >= var51 - var57 && Statics.field658.field963[0] <= var51 + var57 && field893 != 0 && var55 > 0 && field894 < 50) {
                        field895[field894] = var56;
                        field896[field894] = var55;
                        field898[field894] = var52;
                        field899[field894] = null;
                        field842[field894] = (var50 << 16) + (var51 << 8) + var54;
                        field894++;
                    }
                }
            }
            if (class186.field2319 == arg0) {
                byte var58 = var1.method5100();
                int var59 = var1.method5107();
                byte var60 = var1.method5100();
                int var61 = var1.method5091();
                int var62 = var1.method5069();
                int var63 = var1.method5295();
                int var64 = var63 >> 2;
                int var65 = var63 & 0x3;
                int var66 = field714[var64];
                byte var67 = var1.method5267();
                int var68 = var1.method5105();
                byte var69 = var1.method5100();
                int var70 = var1.method5097();
                int var71 = (var70 >> 4 & 0x7) + Statics.field3820;
                int var72 = (var70 & 0x7) + Statics.field1307;
                class67 var73;
                if (field771 == var68) {
                    var73 = Statics.field658;
                } else {
                    var73 = field910[var68];
                }
                if (var73 != null) {
                    class254 var74 = class254.method2713(var61);
                    int var75;
                    int var76;
                    if (var65 == 1 || var65 == 3) {
                        var75 = var74.field3367;
                        var76 = var74.field3366;
                    } else {
                        var75 = var74.field3366;
                        var76 = var74.field3367;
                    }
                    int var77 = (var75 >> 1) + var71;
                    int var78 = (var75 + 1 >> 1) + var71;
                    int var79 = (var76 >> 1) + var72;
                    int var80 = (var76 + 1 >> 1) + var72;
                    int[][] var81 = class56.field517[Statics.field373];
                    int var82 = var81[var77][var79] + var81[var78][var79] + var81[var77][var80] + var81[var78][var80] >> 2;
                    int var83 = (var71 << 7) + (var75 << 6);
                    int var84 = (var72 << 7) + (var76 << 6);
                    class128 var85 = var74.method4209(var64, var65, var81, var83, var82, var84);
                    if (var85 != null) {
                        method3542(Statics.field373, var71, var72, var66, -1, 0, 0, var62 + 1, var59 + 1);
                        var73.field615 = field882 + var62;
                        var73.field623 = field882 + var59;
                        var73.field627 = var85;
                        var73.field634 = var71 * 128 + var75 * 64;
                        var73.field621 = var72 * 128 + var76 * 64;
                        var73.field625 = var82;
                        if (var58 > var69) {
                            byte var86 = var58;
                            var58 = var69;
                            var69 = var86;
                        }
                        if (var67 > var60) {
                            byte var87 = var67;
                            var67 = var60;
                            var60 = var87;
                        }
                        var73.field628 = var58 + var71;
                        var73.field613 = var69 + var71;
                        var73.field626 = var67 + var72;
                        var73.field631 = var60 + var72;
                    }
                }
            }
            if (class186.field2324 == arg0) {
                int var88 = var1.method5295();
                int var89 = (var88 >> 4 & 0x7) + Statics.field3820;
                int var90 = (var88 & 0x7) + Statics.field1307;
                int var91 = var1.method5098();
                int var92 = var91 >> 2;
                int var93 = var91 & 0x3;
                int var94 = field714[var92];
                int var95 = var1.method5091();
                if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                    method3542(Statics.field373, var89, var90, var94, var95, var92, var93, 0, -1);
                }
            } else if (class186.field2318 == arg0) {
                int var96 = var1.method5069();
                int var97 = var1.method5295();
                int var98 = var1.method5091();
                int var99 = var1.method5077();
                int var100 = (var99 >> 4 & 0x7) + Statics.field3820;
                int var101 = (var99 & 0x7) + Statics.field1307;
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    int var102 = var100 * 128 + 64;
                    int var103 = var101 * 128 + 64;
                    class78 var104 = new class78(var96, Statics.field373, var102, var103, method992(var102, var103, Statics.field373) - var97, var98, field882);
                    field786.method4532(var104);
                }
            } else if (class186.field2325 == arg0) {
                int var105 = var1.method5098();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = field714[var106];
                int var109 = var1.method5097();
                int var110 = (var109 >> 4 & 0x7) + Statics.field3820;
                int var111 = (var109 & 0x7) + Statics.field1307;
                int var112 = var1.method5069();
                if (var110 >= 0 && var111 >= 0 && var110 < 103 && var111 < 103) {
                    if (var108 == 0) {
                        class137 var113 = Statics.field23.method2831(Statics.field373, var110, var111);
                        if (var113 != null) {
                            int var114 = class129.method632(var113.field1883);
                            if (var106 == 2) {
                                var113.field1885 = new class94(var114, 2, var107 + 4, Statics.field373, var110, var111, var112, false, var113.field1885);
                                var113.field1882 = new class94(var114, 2, var107 + 1 & 0x3, Statics.field373, var110, var111, var112, false, var113.field1882);
                            } else {
                                var113.field1885 = new class94(var114, var106, var107, Statics.field373, var110, var111, var112, false, var113.field1885);
                            }
                        }
                    }
                    if (var108 == 1) {
                        class142 var115 = Statics.field23.method2861(Statics.field373, var110, var111);
                        if (var115 != null) {
                            int var116 = class129.method632(var115.field1918);
                            if (var106 == 4 || var106 == 5) {
                                var115.field1925 = new class94(var116, 4, var107, Statics.field373, var110, var111, var112, false, var115.field1925);
                            } else if (var106 == 6) {
                                var115.field1925 = new class94(var116, 4, var107 + 4, Statics.field373, var110, var111, var112, false, var115.field1925);
                            } else if (var106 == 7) {
                                var115.field1925 = new class94(var116, 4, (var107 + 2 & 0x3) + 4, Statics.field373, var110, var111, var112, false, var115.field1925);
                            } else if (var106 == 8) {
                                var115.field1925 = new class94(var116, 4, var107 + 4, Statics.field373, var110, var111, var112, false, var115.field1925);
                                var115.field1926 = new class94(var116, 4, (var107 + 2 & 0x3) + 4, Statics.field373, var110, var111, var112, false, var115.field1926);
                            }
                        }
                    }
                    if (var108 == 2) {
                        class143 var117 = Statics.field23.method2938(Statics.field373, var110, var111);
                        if (var106 == 11) {
                            var106 = 10;
                        }
                        if (var117 != null) {
                            var117.field1934 = new class94(class129.method632(var117.field1942), var106, var107, Statics.field373, var110, var111, var112, false, var117.field1934);
                        }
                    }
                    if (var108 == 3) {
                        class124 var118 = Statics.field23.method2834(Statics.field373, var110, var111);
                        if (var118 != null) {
                            var118.field1615 = new class94(class129.method632(var118.field1618), 22, var107, Statics.field373, var110, var111, var112, false, var118.field1615);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gg.gl(IIIIIIIIII)V")
    public static final void method3542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field784.method4507(); var10 != null; var10 = (class69) field784.method4509()) {
            if (var10.field944 == arg0 && var10.field938 == arg1 && var10.field935 == arg2 && var10.field933 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field944 = arg0;
            var9.field933 = arg3;
            var9.field938 = arg1;
            var9.field935 = arg2;
            method4908(var9);
            field784.method4532(var9);
        }
        var9.field939 = arg4;
        var9.field941 = arg5;
        var9.field940 = arg6;
        var9.field942 = arg7;
        var9.field932 = arg8;
    }

    @ObfuscatedName("kz.gy(Lbt;I)V")
    public static final void method4908(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field933 == 0) {
            var1 = Statics.field23.method2873(arg0.field944, arg0.field938, arg0.field935);
        }
        if (arg0.field933 == 1) {
            var1 = Statics.field23.method2923(arg0.field944, arg0.field938, arg0.field935);
        }
        if (arg0.field933 == 2) {
            var1 = Statics.field23.method2837(arg0.field944, arg0.field938, arg0.field935);
        }
        if (arg0.field933 == 3) {
            var1 = Statics.field23.method2838(arg0.field944, arg0.field938, arg0.field935);
        }
        if (var1 != 0L) {
            int var6 = Statics.field23.method2839(arg0.field944, arg0.field938, arg0.field935, var1);
            var3 = class129.method632(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field936 = var3;
        arg0.field934 = var4;
        arg0.field937 = var5;
    }

    @ObfuscatedName("gn.gz(IIIIIIII)V")
    public static final void method3575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field657 && Statics.field373 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field23.method2873(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field23.method2923(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field23.method2837(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field23.method2838(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field23.method2839(arg0, arg2, arg3, var7);
            int var13 = class129.method632(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field23.method2951(arg0, arg2, arg3);
                class254 var16 = class254.method2713(var13);
                if (var16.field3383 != 0) {
                    field711[arg0].method3246(arg2, arg3, var14, var15, var16.field3369);
                }
            }
            if (arg1 == 1) {
                Statics.field23.method2827(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field23.method2897(arg0, arg2, arg3);
                class254 var17 = class254.method2713(var13);
                if (var17.field3366 + arg2 > 103 || var17.field3366 + arg3 > 103 || var17.field3367 + arg2 > 103 || var17.field3367 + arg3 > 103) {
                    return;
                }
                if (var17.field3383 != 0) {
                    field711[arg0].method3247(arg2, arg3, var17.field3366, var17.field3367, var15, var17.field3369);
                }
            }
            if (arg1 == 3) {
                Statics.field23.method2944(arg0, arg2, arg3);
                class254 var18 = class254.method2713(var13);
                if (var18.field3383 == 1) {
                    field711[arg0].method3249(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class56.field503[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class56.method3290(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field23, field711[arg0]);
    }

    @ObfuscatedName("l.gn(IIB)V")
    public static final void method46(int arg0, int arg1) {
        class262 var2 = field888[Statics.field373][arg0][arg1];
        if (var2 == null) {
            Statics.field23.method2830(Statics.field373, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class88 var5 = null;
        for (class88 var6 = (class88) var2.method4507(); var6 != null; var6 = (class88) var2.method4509()) {
            class255 var7 = class255.method348(var6.field1245);
            long var8 = (long) var7.field3429;
            if (var7.field3424 == 1) {
                var8 = (long) (var6.field1246 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field23.method2830(Statics.field373, arg0, arg1);
            return;
        }
        var2.method4503(var5);
        class88 var10 = null;
        class88 var11 = null;
        for (class88 var12 = (class88) var2.method4507(); var12 != null; var12 = (class88) var2.method4509()) {
            if (var5.field1245 != var12.field1245) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1245 != var12.field1245 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class129.method2597(arg0, arg1, 3, false, 0);
        Statics.field23.method2816(Statics.field373, arg0, arg1, method992(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field373), var5, var13, var10, var11);
    }

    @ObfuscatedName("bh.gv(ZLkx;I)V")
    public static final void method949(boolean arg0, class300 arg1) {
        field776 = 0;
        field698 = 0;
        method4147();
        while (arg1.method5034(field881.field1316) >= 27) {
            int var2 = arg1.method5018(15);
            if (var2 == 32767) {
                break;
            }
            boolean var32 = false;
            if (field695[var2] == null) {
                field695[var2] = new class80();
                var32 = true;
            }
            class80 var33 = field695[var2];
            field697[++field696 - 1] = var2;
            var33.field974 = field882;
            int var34;
            if (arg0) {
                var34 = arg1.method5018(8);
                if (var34 > 127) {
                    var34 -= 256;
                }
            } else {
                var34 = arg1.method5018(5);
                if (var34 > 15) {
                    var34 -= 32;
                }
            }
            int var35 = arg1.method5018(1);
            int var36 = field781[arg1.method5018(3)];
            if (var32) {
                var33.field1001 = var33.field951 = var36;
            }
            int var37 = arg1.method5018(1);
            if (var37 == 1) {
                field860[++field698 - 1] = var2;
            }
            int var38;
            if (arg0) {
                var38 = arg1.method5018(8);
                if (var38 > 127) {
                    var38 -= 256;
                }
            } else {
                var38 = arg1.method5018(5);
                if (var38 > 15) {
                    var38 -= 32;
                }
            }
            var33.field1135 = class257.method867(arg1.method5018(14));
            var33.field953 = var33.field1135.field3470;
            var33.field949 = var33.field1135.field3493;
            if (var33.field949 == 0) {
                var33.field951 = 0;
            }
            var33.field958 = var33.field1135.field3476;
            var33.field959 = var33.field1135.field3500;
            var33.field960 = var33.field1135.field3486;
            var33.field961 = var33.field1135.field3502;
            var33.field1005 = var33.field1135.field3473;
            var33.field956 = var33.field1135.field3483;
            var33.field957 = var33.field1135.field3475;
            var33.method1792(Statics.field658.field995[0] + var34, Statics.field658.field963[0] + var38, var35 == 1);
        }
        arg1.method5019();
        for (int var3 = 0; var3 < field698; var3++) {
            int var4 = field860[var3];
            class80 var5 = field695[var4];
            int var6 = arg1.method5077();
            if ((var6 & 0x1) != 0) {
                var5.field976 = arg1.method5105();
                if (var5.field976 == 65535) {
                    var5.field976 = -1;
                }
            }
            if ((var6 & 0x40) != 0) {
                int var7 = arg1.method5107();
                int var8 = arg1.method5107();
                int var9 = var5.field1006 - (var7 - Statics.field2390 - Statics.field2390) * 64;
                int var10 = var5.field950 - (var8 - Statics.field2 - Statics.field2) * 64;
                if (var9 != 0 || var10 != 0) {
                    var5.field977 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var6 & 0x20) != 0) {
                int var11 = arg1.method5069();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg1.method5098();
                if (var5.field982 == var11 && var11 != -1) {
                    int var13 = class259.method67(var11).field3530;
                    if (var13 == 1) {
                        var5.field952 = 0;
                        var5.field975 = 0;
                        var5.field985 = var12;
                        var5.field986 = 0;
                    }
                    if (var13 == 2) {
                        var5.field986 = 0;
                    }
                } else if (var11 == -1 || var5.field982 == -1 || class259.method67(var11).field3534 >= class259.method67(var5.field982).field3534) {
                    var5.field982 = var11;
                    var5.field952 = 0;
                    var5.field975 = 0;
                    var5.field985 = var12;
                    var5.field986 = 0;
                    var5.field1009 = var5.field1004;
                }
            }
            if ((var6 & 0x4) != 0) {
                var5.field1135 = class257.method867(arg1.method5069());
                var5.field953 = var5.field1135.field3470;
                var5.field949 = var5.field1135.field3493;
                var5.field958 = var5.field1135.field3476;
                var5.field959 = var5.field1135.field3500;
                var5.field960 = var5.field1135.field3486;
                var5.field961 = var5.field1135.field3502;
                var5.field1005 = var5.field1135.field3473;
                var5.field956 = var5.field1135.field3483;
                var5.field957 = var5.field1135.field3475;
            }
            if ((var6 & 0x10) != 0) {
                int var14 = arg1.method5097();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = -1;
                        int var19 = arg1.method5081();
                        if (var19 == 32767) {
                            var19 = arg1.method5081();
                            var17 = arg1.method5081();
                            var16 = arg1.method5081();
                            var18 = arg1.method5081();
                        } else if (var19 == 32766) {
                            var19 = -1;
                        } else {
                            var17 = arg1.method5081();
                        }
                        int var20 = arg1.method5081();
                        var5.method1494(var19, var17, var16, var18, field882, var20);
                    }
                }
                int var21 = arg1.method5295();
                if (var21 > 0) {
                    for (int var22 = 0; var22 < var21; var22++) {
                        int var23 = arg1.method5081();
                        int var24 = arg1.method5081();
                        if (var24 == 32767) {
                            var5.method1496(var23);
                        } else {
                            int var25 = arg1.method5081();
                            int var26 = arg1.method5077();
                            int var27 = var24 > 0 ? arg1.method5098() : var26;
                            var5.method1493(var23, field882, var24, var25, var26, var27);
                        }
                    }
                }
            }
            if ((var6 & 0x8) != 0) {
                var5.field987 = arg1.method5105();
                int var28 = arg1.method5115();
                var5.field991 = var28 >> 16;
                var5.field990 = (var28 & 0xFFFF) + field882;
                var5.field988 = 0;
                var5.field989 = 0;
                if (var5.field990 > field882) {
                    var5.field988 = -1;
                }
                if (var5.field987 == 65535) {
                    var5.field987 = -1;
                }
            }
            if ((var6 & 0x2) != 0) {
                var5.field978 = arg1.method5076();
                var5.field1003 = 100;
            }
        }
        for (int var29 = 0; var29 < field776; var29++) {
            int var30 = field777[var29];
            if (field882 != field695[var30].field974) {
                field695[var30].field1135 = null;
                field695[var30] = null;
            }
        }
        if (field881.field1316 != arg1.field3733) {
            throw new RuntimeException(arg1.field3733 + class82.field1149 + field881.field1316);
        }
        for (int var31 = 0; var31 < field696; var31++) {
            if (field695[field697[var31]] == null) {
                throw new RuntimeException(var31 + class82.field1149 + field696);
            }
        }
    }

    @ObfuscatedName("in.ha(I)V")
    public static final void method4147() {
        class300 var0 = field881.field1315;
        var0.method5011();
        int var1 = var0.method5018(8);
        if (var1 < field696) {
            for (int var2 = var1; var2 < field696; var2++) {
                field777[++field776 - 1] = field697[var2];
            }
        }
        if (var1 > field696) {
            throw new RuntimeException("");
        }
        field696 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field697[var3];
            class80 var5 = field695[var4];
            int var6 = var0.method5018(1);
            if (var6 == 0) {
                field697[++field696 - 1] = var4;
                var5.field974 = field882;
            } else {
                int var7 = var0.method5018(2);
                if (var7 == 0) {
                    field697[++field696 - 1] = var4;
                    var5.field974 = field882;
                    field860[++field698 - 1] = var4;
                } else if (var7 == 1) {
                    field697[++field696 - 1] = var4;
                    var5.field974 = field882;
                    int var8 = var0.method5018(3);
                    var5.method1795(var8, (byte) 1);
                    int var9 = var0.method5018(1);
                    if (var9 == 1) {
                        field860[++field698 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field697[++field696 - 1] = var4;
                    var5.field974 = field882;
                    int var10 = var0.method5018(3);
                    var5.method1795(var10, (byte) 2);
                    int var11 = var0.method5018(3);
                    var5.method1795(var11, (byte) 2);
                    int var12 = var0.method5018(1);
                    if (var12 == 1) {
                        field860[++field698 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field777[++field776 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("hj.hk(Lbd;IIBI)V")
    public static final void method3693(class67 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field995[0];
        int var5 = arg0.field963[0];
        int var6 = arg0.method1049();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1049();
        class175 var8 = method554(arg1, arg2);
        class173 var9 = field711[arg0.field630];
        int[] var10 = field930;
        int[] var11 = field931;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class174.field2090[var12][var13] = 0;
                class174.field2091[var12][var13] = 99999999;
            }
        }
        boolean var29;
        if (var7 == 1) {
            int var14 = var4;
            int var15 = var5;
            byte var16 = 64;
            byte var17 = 64;
            int var18 = var4 - var16;
            int var19 = var5 - var17;
            class174.field2090[var16][var17] = 99;
            class174.field2091[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class174.field2093[var20] = var4;
            int var78 = var20 + 1;
            class174.field2095[var20] = var5;
            int[][] var22 = var9.field2086;
            boolean var27;
            while (true) {
                if (var78 == var21) {
                    Statics.field2089 = var14;
                    Statics.field2708 = var15;
                    var27 = false;
                    break;
                }
                var14 = class174.field2093[var21];
                var15 = class174.field2095[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field2072;
                int var26 = var15 - var9.field2083;
                if (var8.method1035(1, var14, var15, var9)) {
                    Statics.field2089 = var14;
                    Statics.field2708 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class174.field2091[var23][var24] + 1;
                if (var23 > 0 && class174.field2090[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class174.field2093[var78] = var14 - 1;
                    class174.field2095[var78] = var15;
                    var78 = var78 + 1 & 0xFFF;
                    class174.field2090[var23 - 1][var24] = 2;
                    class174.field2091[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class174.field2090[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class174.field2093[var78] = var14 + 1;
                    class174.field2095[var78] = var15;
                    var78 = var78 + 1 & 0xFFF;
                    class174.field2090[var23 + 1][var24] = 8;
                    class174.field2091[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class174.field2090[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class174.field2093[var78] = var14;
                    class174.field2095[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class174.field2090[var23][var24 - 1] = 1;
                    class174.field2091[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class174.field2090[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class174.field2093[var78] = var14;
                    class174.field2095[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class174.field2090[var23][var24 + 1] = 4;
                    class174.field2091[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class174.field2090[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class174.field2093[var78] = var14 - 1;
                    class174.field2095[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class174.field2090[var23 - 1][var24 - 1] = 3;
                    class174.field2091[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class174.field2090[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class174.field2093[var78] = var14 + 1;
                    class174.field2095[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class174.field2090[var23 + 1][var24 - 1] = 9;
                    class174.field2091[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class174.field2090[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class174.field2093[var78] = var14 - 1;
                    class174.field2095[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class174.field2090[var23 - 1][var24 + 1] = 6;
                    class174.field2091[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class174.field2090[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class174.field2093[var78] = var14 + 1;
                    class174.field2095[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class174.field2090[var23 + 1][var24 + 1] = 12;
                    class174.field2091[var23 + 1][var24 + 1] = var28;
                }
            }
            var29 = var27;
        } else if (var7 == 2) {
            var29 = class174.method3001(var4, var5, var8, var9);
        } else {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class174.field2090[var32][var33] = 99;
            class174.field2091[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class174.field2093[var36] = var4;
            int var79 = var36 + 1;
            class174.field2095[var36] = var5;
            int[][] var38 = var9.field2086;
            boolean var43;
            label514: while (true) {
                label512: while (true) {
                    int var39;
                    int var40;
                    int var41;
                    int var42;
                    int var44;
                    do {
                        do {
                            do {
                                label489: do {
                                    if (var79 == var37) {
                                        Statics.field2089 = var30;
                                        Statics.field2708 = var31;
                                        var43 = false;
                                        break label514;
                                    }
                                    var30 = class174.field2093[var37];
                                    var31 = class174.field2095[var37];
                                    var37 = var37 + 1 & 0xFFF;
                                    var39 = var30 - var34;
                                    var40 = var31 - var35;
                                    var41 = var30 - var9.field2072;
                                    var42 = var31 - var9.field2083;
                                    if (var8.method1035(var7, var30, var31, var9)) {
                                        Statics.field2089 = var30;
                                        Statics.field2708 = var31;
                                        var43 = true;
                                        break label514;
                                    }
                                    var44 = class174.field2091[var39][var40] + 1;
                                    if (var39 > 0 && class174.field2090[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var7 + var42 - 1] & 0x1240138) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= var7 - 1) {
                                                class174.field2093[var79] = var30 - 1;
                                                class174.field2095[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class174.field2090[var39 - 1][var40] = 2;
                                                class174.field2091[var39 - 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 + var45] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && class174.field2090[var39 + 1][var40] == 0 && (var38[var7 + var41][var42] & 0x1240183) == 0 && (var38[var7 + var41][var7 + var42 - 1] & 0x12401E0) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class174.field2093[var79] = var30 + 1;
                                                class174.field2095[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class174.field2090[var39 + 1][var40] = 8;
                                                class174.field2091[var39 + 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 + var46] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 > 0 && class174.field2090[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var7 + var41 - 1][var42 - 1] & 0x1240183) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class174.field2093[var79] = var30;
                                                class174.field2095[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class174.field2090[var39][var40 - 1] = 1;
                                                class174.field2091[var39][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var47][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class174.field2090[var39][var40 + 1] == 0 && (var38[var41][var7 + var42] & 0x1240138) == 0 && (var38[var7 + var41 - 1][var7 + var42] & 0x12401E0) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class174.field2093[var79] = var30;
                                                class174.field2095[var79] = var31 + 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class174.field2090[var39][var40 + 1] = 4;
                                                class174.field2091[var39][var40 + 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var48][var7 + var42] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var39 > 0 && var40 > 0 && class174.field2090[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7) {
                                                class174.field2093[var79] = var30 - 1;
                                                class174.field2095[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class174.field2090[var39 - 1][var40 - 1] = 3;
                                                class174.field2091[var39 - 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 - 1 + var49] & 0x124013E) != 0 || (var38[var41 - 1 + var49][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && var40 > 0 && class174.field2090[var39 + 1][var40 - 1] == 0 && (var38[var7 + var41][var42 - 1] & 0x1240183) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class174.field2093[var79] = var30 + 1;
                                                class174.field2095[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class174.field2090[var39 + 1][var40 - 1] = 9;
                                                class174.field2091[var39 + 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 - 1 + var50] & 0x12401E3) != 0 || (var38[var41 + var50][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var39 > 0 && var40 < 128 - var7 && class174.field2090[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var7 + var42] & 0x1240138) == 0) {
                                        for (int var51 = 1; var51 < var7; var51++) {
                                            if ((var38[var41 - 1][var42 + var51] & 0x124013E) != 0 || (var38[var41 - 1 + var51][var7 + var42] & 0x12401F8) != 0) {
                                                continue label489;
                                            }
                                        }
                                        class174.field2093[var79] = var30 - 1;
                                        class174.field2095[var79] = var31 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class174.field2090[var39 - 1][var40 + 1] = 6;
                                        class174.field2091[var39 - 1][var40 + 1] = var44;
                                    }
                                } while (var39 >= 128 - var7);
                            } while (var40 >= 128 - var7);
                        } while (class174.field2090[var39 + 1][var40 + 1] != 0);
                    } while ((var38[var7 + var41][var7 + var42] & 0x12401E0) != 0);
                    for (int var52 = 1; var52 < var7; var52++) {
                        if ((var38[var41 + var52][var7 + var42] & 0x12401F8) != 0 || (var38[var7 + var41][var42 + var52] & 0x12401E3) != 0) {
                            continue label512;
                        }
                    }
                    class174.field2093[var79] = var30 + 1;
                    class174.field2095[var79] = var31 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class174.field2090[var39 + 1][var40 + 1] = 12;
                    class174.field2091[var39 + 1][var40 + 1] = var44;
                }
            }
            var29 = var43;
        }
        int var71;
        label570: {
            int var53 = var4 - 64;
            int var54 = var5 - 64;
            int var55 = Statics.field2089;
            int var56 = Statics.field2708;
            if (!var29) {
                int var57 = Integer.MAX_VALUE;
                int var58 = Integer.MAX_VALUE;
                byte var59 = 10;
                int var60 = var8.field2099;
                int var61 = var8.field2102;
                int var62 = var8.field2100;
                int var63 = var8.field2098;
                for (int var64 = var60 - var59; var64 <= var59 + var60; var64++) {
                    for (int var65 = var61 - var59; var65 <= var59 + var61; var65++) {
                        int var66 = var64 - var53;
                        int var67 = var65 - var54;
                        if (var66 >= 0 && var67 >= 0 && var66 < 128 && var67 < 128 && class174.field2091[var66][var67] < 100) {
                            int var68 = 0;
                            if (var64 < var60) {
                                var68 = var60 - var64;
                            } else if (var64 > var60 + var62 - 1) {
                                var68 = var64 - (var60 + var62 - 1);
                            }
                            int var69 = 0;
                            if (var65 < var61) {
                                var69 = var61 - var65;
                            } else if (var65 > var61 + var63 - 1) {
                                var69 = var65 - (var61 + var63 - 1);
                            }
                            int var70 = var68 * var68 + var69 * var69;
                            if (var70 < var57 || var57 == var70 && class174.field2091[var66][var67] < var58) {
                                var57 = var70;
                                var58 = class174.field2091[var66][var67];
                                var55 = var64;
                                var56 = var65;
                            }
                        }
                    }
                }
                if (var57 == Integer.MAX_VALUE) {
                    var71 = -1;
                    break label570;
                }
            }
            if (var4 == var55 && var5 == var56) {
                var71 = 0;
            } else {
                byte var72 = 0;
                class174.field2093[var72] = var55;
                int var80 = var72 + 1;
                class174.field2095[var72] = var56;
                int var73;
                int var74 = var73 = class174.field2090[var55 - var53][var56 - var54];
                while (var4 != var55 || var5 != var56) {
                    if (var73 != var74) {
                        var73 = var74;
                        class174.field2093[var80] = var55;
                        class174.field2095[var80++] = var56;
                    }
                    if ((var74 & 0x2) != 0) {
                        var55++;
                    } else if ((var74 & 0x8) != 0) {
                        var55--;
                    }
                    if ((var74 & 0x1) != 0) {
                        var56++;
                    } else if ((var74 & 0x4) != 0) {
                        var56--;
                    }
                    var74 = class174.field2090[var55 - var53][var56 - var54];
                }
                int var75 = 0;
                while (var80-- > 0) {
                    var10[var75] = class174.field2093[var80];
                    var11[var75++] = class174.field2095[var80];
                    if (var75 >= var10.length) {
                        break;
                    }
                }
                var71 = var75;
            }
        }
        int var76 = var71;
        if (var71 >= 1) {
            for (int var77 = 0; var77 < var76 - 1; var77++) {
                arg0.method1053(field930[var77], field931[var77], arg3);
            }
        }
    }

    @ObfuscatedName("at.hu(III)Lfl;")
    public static class175 method554(int arg0, int arg1) {
        field736.field2099 = arg0;
        field736.field2102 = arg1;
        field736.field2100 = 1;
        field736.field2098 = 1;
        return field736;
    }

    @ObfuscatedName("hx.hg(I)V")
    public static void method3756() {
        field792 = 0;
        field675 = false;
    }

    @ObfuscatedName("ba.he(I)V")
    public static void method1776() {
        method3756();
        field797[0] = class225.field2995;
        field669[0] = "";
        field795[0] = 1006;
        field770[0] = false;
        field792 = 1;
    }

    @ObfuscatedName("av.hv(III)V")
    public static final void method356(int arg0, int arg1) {
        if (field792 < 2 && field901 == 0 && !field811 || !field803) {
            return;
        }
        int var2 = method137();
        String var3;
        if (field901 == 1 && field792 < 2) {
            var3 = class225.field2911 + class225.field2921 + field739 + " " + class82.field1153;
        } else if (field811 && field792 < 2) {
            var3 = field814 + class225.field2921 + field815 + " " + class82.field1153;
        } else {
            var3 = method361(var2);
        }
        if (field792 > 2) {
            var3 = var3 + class82.method1591(16777215) + " " + '/' + " " + (field792 - 2) + class225.field2915;
        }
        Statics.field194.method4930(var3, arg0 + 4, arg1 + 15, 16777215, 0, field882 / 1000);
    }

    @ObfuscatedName("cs.hh(IIIII)V")
    public static final void method2019(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field859; var4++) {
            if (field866[var4] + field809[var4] > arg0 && field809[var4] < arg0 + arg2 && field865[var4] + field861[var4] > arg1 && field865[var4] < arg1 + arg3) {
                field844[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hy(B)V")
    public final void method1183() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field792 - 1; var2++) {
                if (field795[var2] < 1000 && field795[var2 + 1] > 1000) {
                    String var3 = field669[var2];
                    field669[var2] = field669[var2 + 1];
                    field669[var2 + 1] = var3;
                    String var4 = field797[var2];
                    field797[var2] = field797[var2 + 1];
                    field797[var2 + 1] = var4;
                    int var5 = field795[var2];
                    field795[var2] = field795[var2 + 1];
                    field795[var2 + 1] = var5;
                    int var6 = field793[var2];
                    field793[var2] = field793[var2 + 1];
                    field793[var2 + 1] = var6;
                    int var7 = field794[var2];
                    field794[var2] = field794[var2 + 1];
                    field794[var2 + 1] = var7;
                    int var8 = field796[var2];
                    field796[var2] = field796[var2 + 1];
                    field796[var2 + 1] = var8;
                    boolean var9 = field770[var2];
                    field770[var2] = field770[var2 + 1];
                    field770[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field128 != null || field829 != null) {
            return;
        }
        int var27;
        int var29;
        int var30;
        label212: {
            int var10 = class55.field494;
            if (field675) {
                if (var10 != 1 && (Statics.field414 || var10 != 4)) {
                    int var11 = class55.field493;
                    int var12 = class55.field488;
                    if (var11 < Statics.field3293 - 10 || var11 > Statics.field374 + Statics.field3293 + 10 || var12 < Statics.field268 - 10 || var12 > Statics.field268 + Statics.field1093 + 10) {
                        field675 = false;
                        method2019(Statics.field3293, Statics.field268, Statics.field374, Statics.field1093);
                    }
                }
                if (var10 == 1 || !Statics.field414 && var10 == 4) {
                    int var13 = Statics.field3293;
                    int var14 = Statics.field268;
                    int var15 = Statics.field374;
                    int var16 = class55.field484;
                    int var17 = class55.field496;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field792; var19++) {
                        int var20 = (field792 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1 && var18 >= 0) {
                        int var21 = field793[var18];
                        int var22 = field794[var18];
                        int var23 = field795[var18];
                        int var24 = field796[var18];
                        String var25 = field797[var18];
                        String var26 = field669[var18];
                        method1979(var21, var22, var23, var24, var25, var26, class55.field484, class55.field496);
                    }
                    field675 = false;
                    method2019(Statics.field3293, Statics.field268, Statics.field374, Statics.field1093);
                }
            } else {
                var27 = method137();
                if ((var10 == 1 || !Statics.field414 && var10 == 4) && var27 >= 0) {
                    int var28 = field795[var27];
                    if (var28 == 39 || var28 == 40 || var28 == 41 || var28 == 42 || var28 == 43 || var28 == 33 || var28 == 34 || var28 == 35 || var28 == 36 || var28 == 37 || var28 == 38 || var28 == 1005) {
                        var29 = field793[var27];
                        var30 = field794[var27];
                        class218 var31 = class218.method1799(var30);
                        int var32 = method4602(var31);
                        boolean var33 = (var32 >> 28 & 0x1) != 0;
                        if (var33) {
                            break label212;
                        }
                        class219 var10000 = (class219) null;
                        if (class219.method3093(method4602(var31))) {
                            break label212;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field414 && var10 == 4) && this.method1115()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field414 && var10 == 4) && field792 > 0 && var27 >= 0) {
                    int var37 = field793[var27];
                    int var38 = field794[var27];
                    int var39 = field795[var27];
                    int var40 = field796[var27];
                    String var41 = field797[var27];
                    String var42 = field669[var27];
                    method1979(var37, var38, var39, var40, var41, var42, class55.field484, class55.field496);
                }
                if (var10 == 2 && field792 > 0) {
                    this.method1126(class55.field484, class55.field496);
                }
            }
            return;
        }
        if (Statics.field128 != null && !field875 && field792 > 0 && !this.method1115()) {
            int var34 = field655;
            int var35 = field764;
            class83 var36 = Statics.field917;
            method1979(var36.field1158, var36.field1157, var36.field1156, var36.field1159, var36.field1160, var36.field1160, var34, var35);
            Statics.field917 = null;
        }
        field875 = false;
        field767 = 0;
        if (Statics.field128 != null) {
            method3755(Statics.field128);
        }
        Statics.field128 = class218.method1799(var30);
        field766 = var29;
        field655 = class55.field484;
        field764 = class55.field496;
        if (var27 >= 0) {
            method2291(var27);
        }
        method3755(Statics.field128);
    }

    @ObfuscatedName("client.hd(I)Z")
    public final boolean method1115() {
        int var1 = method137();
        return (field790 == 1 && field792 > 2 || method1771(var1)) && !field770[var1];
    }

    @ObfuscatedName("client.hj(III)V")
    public final void method1126(int arg0, int arg1) {
        method3931(arg0, arg1);
        Statics.field23.method2846(Statics.field373, arg0, arg1, false);
        field675 = true;
    }

    @ObfuscatedName("x.hb(B)V")
    public static void method131() {
        method3931(Statics.field374 / 2 + Statics.field3293, Statics.field268);
    }

    @ObfuscatedName("ii.hm(III)V")
    public static void method3931(int arg0, int arg1) {
        int var2 = Statics.field194.method4990(class225.field2859);
        for (int var3 = 0; var3 < field792; var3++) {
            int var4 = Statics.field194.method4990(method361(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field792 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field47) {
            var6 = Statics.field47 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field3309) {
            var7 = Statics.field3309 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field3293 = var6;
        Statics.field268 = var7;
        Statics.field374 = var2;
        Statics.field1093 = field792 * 15 + 22;
    }

    @ObfuscatedName("be.hr(II)Z")
    public static final boolean method1771(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field795[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cb.hz(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1979(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 14) {
            class67 var8 = field910[arg3];
            if (var8 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var9 = class188.method3894(class184.field2285, field881.field1314);
                var9.field2334.method5048(Statics.field183);
                var9.field2334.method5075(class46.field396[82] ? 1 : 0);
                var9.field2334.method5112(Statics.field595);
                var9.field2334.method5052(arg3);
                var9.field2334.method5052(Statics.field20);
                field881.method2023(var9);
            }
        }
        if (arg2 == 25) {
            class218 var10 = class218.method1488(arg1, arg0);
            if (var10 != null) {
                method486();
                method1862(arg1, arg0, class219.method1787(method4602(var10)), var10.field2691);
                field901 = 0;
                field814 = method4899(var10);
                if (field814 == null) {
                    field814 = class225.field2772;
                }
                if (var10.field2564) {
                    field815 = var10.field2644 + class82.method1591(16777215);
                } else {
                    field815 = class82.method1591(65280) + var10.field2687 + class82.method1591(16777215);
                }
            }
            return;
        }
        if (arg2 == 1005) {
            class218 var11 = class218.method1799(arg1);
            if (var11 == null || var11.field2706[arg0] < 100000) {
                class188 var12 = class188.method3894(class184.field2228, field881.field1314);
                var12.field2334.method5207(arg3);
                field881.method2023(var12);
            } else {
                class92.method994(27, "", var11.field2706[arg0] + " x " + class255.method348(arg3).field3450);
            }
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 1003) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            class80 var13 = field695[arg3];
            if (var13 != null) {
                class257 var14 = var13.field1135;
                if (var14.field3477 != null) {
                    var14 = var14.method4324();
                }
                if (var14 != null) {
                    class188 var15 = class188.method3894(class184.field2234, field881.field1314);
                    var15.field2334.method5103(var14.field3468);
                    field881.method2023(var15);
                }
            }
        }
        if (arg2 == 28) {
            class188 var16 = class188.method3894(class184.field2273, field881.field1314);
            var16.field2334.method5054(arg1);
            field881.method2023(var16);
            class218 var17 = class218.method1799(arg1);
            if (var17.field2683 != null && var17.field2683[0][0] == 5) {
                int var18 = var17.field2683[0][1];
                class213.field2526[var18] = 1 - class213.field2526[var18];
                method110(var18);
            }
        }
        if (arg2 == 1004) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            class188 var19 = class188.method3894(class184.field2228, field881.field1314);
            var19.field2334.method5207(arg3);
            field881.method2023(var19);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1876.method5986(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 12) {
            class80 var20 = field695[arg3];
            if (var20 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var21 = class188.method3894(class184.field2304, field881.field1314);
                var21.field2334.method5052(arg3);
                var21.field2334.method5093(class46.field396[82] ? 1 : 0);
                field881.method2023(var21);
            }
        }
        if (arg2 == 31) {
            class188 var22 = class188.method3894(class184.field2267, field881.field1314);
            var22.field2334.method5112(arg1);
            var22.field2334.method5113(Statics.field595);
            var22.field2334.method5048(Statics.field183);
            var22.field2334.method5207(Statics.field20);
            var22.field2334.method5207(arg0);
            var22.field2334.method5048(arg3);
            field881.method2023(var22);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 8) {
            class80 var23 = field695[arg3];
            if (var23 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var24 = class188.method3894(class184.field2305, field881.field1314);
                var24.field2334.method5048(arg3);
                var24.field2334.method5094(class46.field396[82] ? 1 : 0);
                var24.field2334.method5111(Statics.field360);
                var24.field2334.method5103(field849);
                field881.method2023(var24);
            }
        }
        if (arg2 == 32) {
            class188 var25 = class188.method3894(class184.field2233, field881.field1314);
            var25.field2334.method5112(Statics.field360);
            var25.field2334.method5054(arg1);
            var25.field2334.method5052(arg0);
            var25.field2334.method5207(arg3);
            var25.field2334.method5207(field849);
            field881.method2023(var25);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 3) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var26 = class188.method3894(class184.field2214, field881.field1314);
            var26.field2334.method5052(Statics.field2 + arg1);
            var26.field2334.method5075(class46.field396[82] ? 1 : 0);
            var26.field2334.method5103(arg3);
            var26.field2334.method5048(Statics.field2390 + arg0);
            field881.method2023(var26);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var27 = class218.method1488(arg1, arg0);
            if (var27 != null) {
                method1972(arg3, arg1, arg0, var27.field2691, arg5);
            }
        }
        if (arg2 == 35) {
            class188 var28 = class188.method3894(class184.field2266, field881.field1314);
            var28.field2334.method5111(arg1);
            var28.field2334.method5048(arg0);
            var28.field2334.method5048(arg3);
            field881.method2023(var28);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 36) {
            class188 var29 = class188.method3894(class184.field2282, field881.field1314);
            var29.field2334.method5048(arg3);
            var29.field2334.method5054(arg1);
            var29.field2334.method5048(arg0);
            field881.method2023(var29);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 34) {
            class188 var30 = class188.method3894(class184.field2240, field881.field1314);
            var30.field2334.method5103(arg3);
            var30.field2334.method5113(arg1);
            var30.field2334.method5048(arg0);
            field881.method2023(var30);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 15) {
            class67 var31 = field910[arg3];
            if (var31 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var32 = class188.method3894(class184.field2278, field881.field1314);
                var32.field2334.method5113(Statics.field360);
                var32.field2334.method5075(class46.field396[82] ? 1 : 0);
                var32.field2334.method5103(field849);
                var32.field2334.method5052(arg3);
                field881.method2023(var32);
            }
        }
        if (arg2 == 1001) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var33 = class188.method3894(class184.field2227, field881.field1314);
            var33.field2334.method5052(arg3);
            var33.field2334.method5093(class46.field396[82] ? 1 : 0);
            var33.field2334.method5103(Statics.field2390 + arg0);
            var33.field2334.method5048(Statics.field2 + arg1);
            field881.method2023(var33);
        }
        if (arg2 == 43) {
            class188 var34 = class188.method3894(class184.field2236, field881.field1314);
            var34.field2334.method5052(arg3);
            var34.field2334.method5112(arg1);
            var34.field2334.method5052(arg0);
            field881.method2023(var34);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 4) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var35 = class188.method3894(class184.field2283, field881.field1314);
            var35.field2334.method5093(class46.field396[82] ? 1 : 0);
            var35.field2334.method5052(arg3);
            var35.field2334.method5052(Statics.field2 + arg1);
            var35.field2334.method5052(Statics.field2390 + arg0);
            field881.method2023(var35);
        }
        if (arg2 == 37) {
            class188 var36 = class188.method3894(class184.field2262, field881.field1314);
            var36.field2334.method5054(arg1);
            var36.field2334.method5052(arg0);
            var36.field2334.method5052(arg3);
            field881.method2023(var36);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 44) {
            class67 var37 = field910[arg3];
            if (var37 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var38 = class188.method3894(class184.field2251, field881.field1314);
                var38.field2334.method5052(arg3);
                var38.field2334.method5094(class46.field396[82] ? 1 : 0);
                field881.method2023(var38);
            }
        }
        if (arg2 == 29) {
            class188 var39 = class188.method3894(class184.field2273, field881.field1314);
            var39.field2334.method5054(arg1);
            field881.method2023(var39);
            class218 var40 = class218.method1799(arg1);
            if (var40.field2683 != null && var40.field2683[0][0] == 5) {
                int var41 = var40.field2683[0][1];
                if (class213.field2526[var41] != var40.field2685[0]) {
                    class213.field2526[var41] = var40.field2685[0];
                    method110(var41);
                }
            }
        }
        if (arg2 == 9) {
            class80 var42 = field695[arg3];
            if (var42 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var43 = class188.method3894(class184.field2275, field881.field1314);
                var43.field2334.method5094(class46.field396[82] ? 1 : 0);
                var43.field2334.method5207(arg3);
                field881.method2023(var43);
            }
        }
        if (arg2 == 40) {
            class188 var44 = class188.method3894(class184.field2230, field881.field1314);
            var44.field2334.method5113(arg1);
            var44.field2334.method5207(arg0);
            var44.field2334.method5103(arg3);
            field881.method2023(var44);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 45) {
            class67 var45 = field910[arg3];
            if (var45 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var46 = class188.method3894(class184.field2302, field881.field1314);
                var46.field2334.method5093(class46.field396[82] ? 1 : 0);
                var46.field2334.method5103(arg3);
                field881.method2023(var46);
            }
        }
        if (arg2 == 13) {
            class80 var47 = field695[arg3];
            if (var47 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var48 = class188.method3894(class184.field2215, field881.field1314);
                var48.field2334.method5228(class46.field396[82] ? 1 : 0);
                var48.field2334.method5103(arg3);
                field881.method2023(var48);
            }
        }
        if (arg2 == 30 && field851 == null) {
            method948(arg1, arg0);
            field851 = class218.method1488(arg1, arg0);
            method3755(field851);
        }
        if (arg2 == 51) {
            class67 var49 = field910[arg3];
            if (var49 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var50 = class188.method3894(class184.field2254, field881.field1314);
                var50.field2334.method5094(class46.field396[82] ? 1 : 0);
                var50.field2334.method5048(arg3);
                field881.method2023(var50);
            }
        }
        if (arg2 == 6) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var51 = class188.method3894(class184.field2260, field881.field1314);
            var51.field2334.method5093(class46.field396[82] ? 1 : 0);
            var51.field2334.method5103(Statics.field2 + arg1);
            var51.field2334.method5103(Statics.field2390 + arg0);
            var51.field2334.method5207(arg3);
            field881.method2023(var51);
        }
        if (arg2 == 10) {
            class80 var52 = field695[arg3];
            if (var52 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var53 = class188.method3894(class184.field2205, field881.field1314);
                var53.field2334.method5103(arg3);
                var53.field2334.method5228(class46.field396[82] ? 1 : 0);
                field881.method2023(var53);
            }
        }
        if (arg2 == 21) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var54 = class188.method3894(class184.field2204, field881.field1314);
            var54.field2334.method5103(Statics.field2 + arg1);
            var54.field2334.method5207(arg3);
            var54.field2334.method5052(Statics.field2390 + arg0);
            var54.field2334.method5075(class46.field396[82] ? 1 : 0);
            field881.method2023(var54);
        }
        if (arg2 == 42) {
            class188 var55 = class188.method3894(class184.field2268, field881.field1314);
            var55.field2334.method5054(arg1);
            var55.field2334.method5103(arg0);
            var55.field2334.method5052(arg3);
            field881.method2023(var55);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 38) {
            method486();
            class218 var56 = class218.method1799(arg1);
            field901 = 1;
            Statics.field183 = arg0;
            Statics.field595 = arg1;
            Statics.field20 = arg3;
            method3755(var56);
            field739 = class82.method1591(16748608) + class255.method348(arg3).field3450 + class82.method1591(16777215);
            if (field739 == null) {
                field739 = class225.field2772;
            }
            return;
        }
        if (arg2 == 26) {
            method59();
        }
        if (arg2 == 50) {
            class67 var57 = field910[arg3];
            if (var57 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var58 = class188.method3894(class184.field2279, field881.field1314);
                var58.field2334.method5075(class46.field396[82] ? 1 : 0);
                var58.field2334.method5207(arg3);
                field881.method2023(var58);
            }
        }
        if (arg2 == 33) {
            class188 var59 = class188.method3894(class184.field2291, field881.field1314);
            var59.field2334.method5207(arg3);
            var59.field2334.method5112(arg1);
            var59.field2334.method5052(arg0);
            field881.method2023(var59);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 1002) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            class188 var60 = class188.method3894(class184.field2245, field881.field1314);
            var60.field2334.method5103(arg3);
            field881.method2023(var60);
        }
        if (arg2 == 46) {
            class67 var61 = field910[arg3];
            if (var61 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var62 = class188.method3894(class184.field2210, field881.field1314);
                var62.field2334.method5103(arg3);
                var62.field2334.method5228(class46.field396[82] ? 1 : 0);
                field881.method2023(var62);
            }
        }
        if (arg2 == 11) {
            class80 var63 = field695[arg3];
            if (var63 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var64 = class188.method3894(class184.field2255, field881.field1314);
                var64.field2334.method5048(arg3);
                var64.field2334.method5228(class46.field396[82] ? 1 : 0);
                field881.method2023(var64);
            }
        }
        if (arg2 == 23) {
            if (field675) {
                Statics.field23.method2847();
            } else {
                Statics.field23.method2846(Statics.field373, arg0, arg1, true);
            }
        }
        if (arg2 == 19) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var65 = class188.method3894(class184.field2257, field881.field1314);
            var65.field2334.method5048(arg3);
            var65.field2334.method5103(Statics.field2390 + arg0);
            var65.field2334.method5052(Statics.field2 + arg1);
            var65.field2334.method5228(class46.field396[82] ? 1 : 0);
            field881.method2023(var65);
        }
        if (arg2 == 18) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var66 = class188.method3894(class184.field2209, field881.field1314);
            var66.field2334.method5048(Statics.field2 + arg1);
            var66.field2334.method5207(arg3);
            var66.field2334.method5207(Statics.field2390 + arg0);
            var66.field2334.method5228(class46.field396[82] ? 1 : 0);
            field881.method2023(var66);
        }
        if (arg2 == 58) {
            class218 var67 = class218.method1488(arg1, arg0);
            if (var67 != null) {
                class188 var68 = class188.method3894(class184.field2286, field881.field1314);
                var68.field2334.method5207(field849);
                var68.field2334.method5113(arg1);
                var68.field2334.method5207(field813);
                var68.field2334.method5048(arg0);
                var68.field2334.method5054(Statics.field360);
                var68.field2334.method5048(var67.field2691);
                field881.method2023(var68);
            }
        }
        if (arg2 == 39) {
            class188 var69 = class188.method3894(class184.field2250, field881.field1314);
            var69.field2334.method5048(arg3);
            var69.field2334.method5113(arg1);
            var69.field2334.method5207(arg0);
            field881.method2023(var69);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 24) {
            class218 var70 = class218.method1799(arg1);
            boolean var71 = true;
            if (var70.field2569 > 0) {
                var71 = Statics.method135(var70);
            }
            if (var71) {
                class188 var72 = class188.method3894(class184.field2273, field881.field1314);
                var72.field2334.method5054(arg1);
                field881.method2023(var72);
            }
        }
        if (arg2 == 22) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var73 = class188.method3894(class184.field2219, field881.field1314);
            var73.field2334.method5228(class46.field396[82] ? 1 : 0);
            var73.field2334.method5048(arg3);
            var73.field2334.method5103(Statics.field2 + arg1);
            var73.field2334.method5052(Statics.field2390 + arg0);
            field881.method2023(var73);
        }
        if (arg2 == 1) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var74 = class188.method3894(class184.field2248, field881.field1314);
            var74.field2334.method5048(Statics.field2 + arg1);
            var74.field2334.method5207(Statics.field183);
            var74.field2334.method5093(class46.field396[82] ? 1 : 0);
            var74.field2334.method5111(Statics.field595);
            var74.field2334.method5048(Statics.field2390 + arg0);
            var74.field2334.method5052(arg3);
            var74.field2334.method5207(Statics.field20);
            field881.method2023(var74);
        }
        if (arg2 == 47) {
            class67 var75 = field910[arg3];
            if (var75 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var76 = class188.method3894(class184.field2231, field881.field1314);
                var76.field2334.method5048(arg3);
                var76.field2334.method5094(class46.field396[82] ? 1 : 0);
                field881.method2023(var76);
            }
        }
        if (arg2 == 5) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var77 = class188.method3894(class184.field2293, field881.field1314);
            var77.field2334.method5048(Statics.field2390 + arg0);
            var77.field2334.method5103(arg3);
            var77.field2334.method5048(Statics.field2 + arg1);
            var77.field2334.method5093(class46.field396[82] ? 1 : 0);
            field881.method2023(var77);
        }
        if (arg2 == 17) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var78 = class188.method3894(class184.field2294, field881.field1314);
            var78.field2334.method5112(Statics.field360);
            var78.field2334.method5052(field849);
            var78.field2334.method5103(Statics.field2 + arg1);
            var78.field2334.method5103(Statics.field2390 + arg0);
            var78.field2334.method5093(class46.field396[82] ? 1 : 0);
            var78.field2334.method5207(arg3);
            field881.method2023(var78);
        }
        if (arg2 == 16) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var79 = class188.method3894(class184.field2222, field881.field1314);
            var79.field2334.method5112(Statics.field595);
            var79.field2334.method5048(Statics.field20);
            var79.field2334.method5093(class46.field396[82] ? 1 : 0);
            var79.field2334.method5207(Statics.field183);
            var79.field2334.method5048(arg3);
            var79.field2334.method5048(Statics.field2390 + arg0);
            var79.field2334.method5207(Statics.field2 + arg1);
            field881.method2023(var79);
        }
        if (arg2 == 49) {
            class67 var80 = field910[arg3];
            if (var80 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var81 = class188.method3894(class184.field2258, field881.field1314);
                var81.field2334.method5103(arg3);
                var81.field2334.method5075(class46.field396[82] ? 1 : 0);
                field881.method2023(var81);
            }
        }
        if (arg2 == 7) {
            class80 var82 = field695[arg3];
            if (var82 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var83 = class188.method3894(class184.field2208, field881.field1314);
                var83.field2334.method5048(Statics.field20);
                var83.field2334.method5052(Statics.field183);
                var83.field2334.method5048(arg3);
                var83.field2334.method5094(class46.field396[82] ? 1 : 0);
                var83.field2334.method5054(Statics.field595);
                field881.method2023(var83);
            }
        }
        if (arg2 == 41) {
            class188 var84 = class188.method3894(class184.field2269, field881.field1314);
            var84.field2334.method5111(arg1);
            var84.field2334.method5103(arg0);
            var84.field2334.method5052(arg3);
            field881.method2023(var84);
            field760 = 0;
            Statics.field550 = class218.method1799(arg1);
            field699 = arg0;
        }
        if (arg2 == 48) {
            class67 var85 = field910[arg3];
            if (var85 != null) {
                field877 = arg6;
                field756 = arg7;
                field758 = 2;
                field757 = 0;
                field886 = arg0;
                field843 = arg1;
                class188 var86 = class188.method3894(class184.field2242, field881.field1314);
                var86.field2334.method5093(class46.field396[82] ? 1 : 0);
                var86.field2334.method5103(arg3);
                field881.method2023(var86);
            }
        }
        if (arg2 == 20) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var87 = class188.method3894(class184.field2270, field881.field1314);
            var87.field2334.method5207(Statics.field2 + arg1);
            var87.field2334.method5075(class46.field396[82] ? 1 : 0);
            var87.field2334.method5207(Statics.field2390 + arg0);
            var87.field2334.method5207(arg3);
            field881.method2023(var87);
        }
        if (arg2 == 2) {
            field877 = arg6;
            field756 = arg7;
            field758 = 2;
            field757 = 0;
            field886 = arg0;
            field843 = arg1;
            class188 var88 = class188.method3894(class184.field2296, field881.field1314);
            var88.field2334.method5228(class46.field396[82] ? 1 : 0);
            var88.field2334.method5052(Statics.field2390 + arg0);
            var88.field2334.method5103(arg3);
            var88.field2334.method5113(Statics.field360);
            var88.field2334.method5052(field849);
            var88.field2334.method5207(Statics.field2 + arg1);
            field881.method2023(var88);
        }
        if (field901 != 0) {
            field901 = 0;
            method3755(class218.method1799(Statics.field595));
        }
        if (field811) {
            method486();
        }
        if (Statics.field550 != null && field760 == 0) {
            method3755(Statics.field550);
        }
    }

    @ObfuscatedName("cl.ho(ILjava/lang/String;I)V")
    public static void method1809(int arg0, String arg1) {
        int var2 = class90.field1256;
        int[] var3 = class90.field1258;
        boolean var4 = false;
        class284 var5 = new class284(arg1, Statics.field354);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field910[var3[var6]];
            if (var7 != null && Statics.field658 != var7 && var7.field622 != null && var7.field622.equals(var5)) {
                if (arg0 == 1) {
                    class188 var8 = class188.method3894(class184.field2251, field881.field1314);
                    var8.field2334.method5052(var3[var6]);
                    var8.field2334.method5094(0);
                    field881.method2023(var8);
                } else if (arg0 == 4) {
                    class188 var9 = class188.method3894(class184.field2231, field881.field1314);
                    var9.field2334.method5048(var3[var6]);
                    var9.field2334.method5094(0);
                    field881.method2023(var9);
                } else if (arg0 == 6) {
                    class188 var10 = class188.method3894(class184.field2258, field881.field1314);
                    var10.field2334.method5103(var3[var6]);
                    var10.field2334.method5075(0);
                    field881.method2023(var10);
                } else if (arg0 == 7) {
                    class188 var11 = class188.method3894(class184.field2279, field881.field1314);
                    var11.field2334.method5075(0);
                    var11.field2334.method5207(var3[var6]);
                    field881.method2023(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class92.method994(4, "", class225.field2910 + arg1);
        }
    }

    @ObfuscatedName("ch.hs(IIIII)V")
    public static void method1862(int arg0, int arg1, int arg2, int arg3) {
        class218 var4 = class218.method1488(arg0, arg1);
        if (var4 != null && var4.field2662 != null) {
            class63 var5 = new class63();
            var5.field576 = var4;
            var5.field582 = var4.field2662;
            class77.method3292(var5);
        }
        field813 = arg3;
        field811 = true;
        Statics.field360 = arg0;
        field849 = arg1;
        Statics.field302 = arg2;
        method3755(var4);
    }

    @ObfuscatedName("ag.hx(I)V")
    public static void method486() {
        if (!field811) {
            return;
        }
        class218 var0 = class218.method1488(Statics.field360, field849);
        if (var0 != null && var0.field2663 != null) {
            class63 var1 = new class63();
            var1.field576 = var0;
            var1.field582 = var0.field2663;
            class77.method3292(var1);
        }
        field811 = false;
        method3755(var0);
    }

    @ObfuscatedName("bh.hf(III)V")
    public static void method948(int arg0, int arg1) {
        class188 var2 = class188.method3894(class184.field2274, field881.field1314);
        var2.field2334.method5113(arg0);
        var2.field2334.method5103(arg1);
        field881.method2023(var2);
    }

    @ObfuscatedName("cb.hw(IIIILjava/lang/String;B)V")
    public static void method1972(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = class218.method1488(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2657 != null) {
            class63 var6 = new class63();
            var6.field576 = var5;
            var6.field579 = arg0;
            var6.field583 = arg4;
            var6.field582 = var5.field2657;
            class77.method3292(var6);
        }
        boolean var7 = true;
        if (var5.field2569 > 0) {
            var7 = Statics.method135(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method4602(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class188 var11 = class188.method3894(class184.field2272, field881.field1314);
            var11.field2334.method5054(arg1);
            var11.field2334.method5052(arg2);
            var11.field2334.method5052(arg3);
            field881.method2023(var11);
        }
        if (arg0 == 2) {
            class188 var12 = class188.method3894(class184.field2256, field881.field1314);
            var12.field2334.method5054(arg1);
            var12.field2334.method5052(arg2);
            var12.field2334.method5052(arg3);
            field881.method2023(var12);
        }
        if (arg0 == 3) {
            class188 var13 = class188.method3894(class184.field2207, field881.field1314);
            var13.field2334.method5054(arg1);
            var13.field2334.method5052(arg2);
            var13.field2334.method5052(arg3);
            field881.method2023(var13);
        }
        if (arg0 == 4) {
            class188 var14 = class188.method3894(class184.field2223, field881.field1314);
            var14.field2334.method5054(arg1);
            var14.field2334.method5052(arg2);
            var14.field2334.method5052(arg3);
            field881.method2023(var14);
        }
        if (arg0 == 5) {
            class188 var15 = class188.method3894(class184.field2244, field881.field1314);
            var15.field2334.method5054(arg1);
            var15.field2334.method5052(arg2);
            var15.field2334.method5052(arg3);
            field881.method2023(var15);
        }
        if (arg0 == 6) {
            class188 var16 = class188.method3894(class184.field2265, field881.field1314);
            var16.field2334.method5054(arg1);
            var16.field2334.method5052(arg2);
            var16.field2334.method5052(arg3);
            field881.method2023(var16);
        }
        if (arg0 == 7) {
            class188 var17 = class188.method3894(class184.field2289, field881.field1314);
            var17.field2334.method5054(arg1);
            var17.field2334.method5052(arg2);
            var17.field2334.method5052(arg3);
            field881.method2023(var17);
        }
        if (arg0 == 8) {
            class188 var18 = class188.method3894(class184.field2252, field881.field1314);
            var18.field2334.method5054(arg1);
            var18.field2334.method5052(arg2);
            var18.field2334.method5052(arg3);
            field881.method2023(var18);
        }
        if (arg0 == 9) {
            class188 var19 = class188.method3894(class184.field2288, field881.field1314);
            var19.field2334.method5054(arg1);
            var19.field2334.method5052(arg2);
            var19.field2334.method5052(arg3);
            field881.method2023(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class188 var20 = class188.method3894(class184.field2290, field881.field1314);
        var20.field2334.method5054(arg1);
        var20.field2334.method5052(arg2);
        var20.field2334.method5052(arg3);
        field881.method2023(var20);
    }

    @ObfuscatedName("gp.hi(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3323(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2994(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("eo.hn(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method2994(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field675 || field792 >= 500) {
            return;
        }
        field797[field792] = arg0;
        field669[field792] = arg1;
        field795[field792] = arg2;
        field796[field792] = arg3;
        field793[field792] = arg4;
        field794[field792] = arg5;
        field770[field792] = arg6;
        field792++;
    }

    @ObfuscatedName("r.ht(I)I")
    public static final int method137() {
        return field792 - 1;
    }

    @ObfuscatedName("w.hl(II)Z")
    public static boolean method6(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("as.hc(IB)Ljava/lang/String;")
    public static String method361(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field669[arg0].length() > 0) {
            return field797[arg0] + class225.field2921 + field669[arg0];
        } else {
            return field797[arg0];
        }
    }

    @ObfuscatedName("bl.hq(IIIII)V")
    public static final void method1036(int arg0, int arg1, int arg2, int arg3) {
        if (field901 == 0 && !field811) {
            method3323(class225.field2916, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class129.field1749;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = (int) (var4 >>> 7 & 0x7FL);
                    class67 var15 = field910[field782];
                    method509(var15, field782, var11, var13);
                }
                return;
            }
            long var16 = class129.field1751[var8];
            if (var6 != var16) {
                label277: {
                    var6 = var16;
                    int var20 = class129.method4773(var8);
                    int var21 = class129.method1985(var8);
                    int var22 = class129.method24(var8);
                    int var23 = class129.method1619(var8);
                    if (var22 == 2 && Statics.field23.method2839(Statics.field373, var20, var21, var16) >= 0) {
                        class254 var24 = class254.method2713(var23);
                        if (var24.field3392 != null) {
                            var24 = var24.method4212();
                        }
                        if (var24 == null) {
                            break label277;
                        }
                        if (field901 == 1) {
                            method3323(class225.field2911, field739 + " " + class82.field1153 + " " + class82.method1591(65535) + var24.field3361, 1, var23, var20, var21);
                        } else if (!field811) {
                            String[] var25 = var24.field3378;
                            if (var25 != null) {
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25[var26] != null) {
                                        short var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 3;
                                        }
                                        if (var26 == 1) {
                                            var27 = 4;
                                        }
                                        if (var26 == 2) {
                                            var27 = 5;
                                        }
                                        if (var26 == 3) {
                                            var27 = 6;
                                        }
                                        if (var26 == 4) {
                                            var27 = 1001;
                                        }
                                        method3323(var25[var26], class82.method1591(65535) + var24.field3361, var27, var23, var20, var21);
                                    }
                                }
                            }
                            method3323(class225.field2912, class82.method1591(65535) + var24.field3361, 1002, var24.field3358, var20, var21);
                        } else if ((Statics.field302 & 0x4) == 4) {
                            method3323(field814, field815 + " " + class82.field1153 + " " + class82.method1591(65535) + var24.field3361, 2, var23, var20, var21);
                        }
                    }
                    if (var22 == 1) {
                        class80 var28 = field695[var23];
                        if (var28 == null) {
                            break label277;
                        }
                        if (var28.field1135.field3470 == 1 && (var28.field1006 & 0x7F) == 64 && (var28.field950 & 0x7F) == 64) {
                            for (int var29 = 0; var29 < field696; var29++) {
                                class80 var30 = field695[field697[var29]];
                                if (var30 != null && var28 != var30 && var30.field1135.field3470 == 1 && var28.field1006 == var30.field1006 && var28.field950 == var30.field950) {
                                    method252(var30.field1135, field697[var29], var20, var21);
                                }
                            }
                            int var31 = class90.field1256;
                            int[] var32 = class90.field1258;
                            for (int var33 = 0; var33 < var31; var33++) {
                                class67 var34 = field910[var32[var33]];
                                if (var34 != null && var28.field1006 == var34.field1006 && var28.field950 == var34.field950) {
                                    method509(var34, var32[var33], var20, var21);
                                }
                            }
                        }
                        method252(var28.field1135, var23, var20, var21);
                    }
                    if (var22 == 0) {
                        class67 var35 = field910[var23];
                        if (var35 == null) {
                            break label277;
                        }
                        if ((var35.field1006 & 0x7F) == 64 && (var35.field950 & 0x7F) == 64) {
                            for (int var36 = 0; var36 < field696; var36++) {
                                class80 var37 = field695[field697[var36]];
                                if (var37 != null && var37.field1135.field3470 == 1 && var35.field1006 == var37.field1006 && var35.field950 == var37.field950) {
                                    method252(var37.field1135, field697[var36], var20, var21);
                                }
                            }
                            int var38 = class90.field1256;
                            int[] var39 = class90.field1258;
                            for (int var40 = 0; var40 < var38; var40++) {
                                class67 var41 = field910[var39[var40]];
                                if (var41 != null && var35 != var41 && var35.field1006 == var41.field1006 && var35.field950 == var41.field950) {
                                    method509(var41, var39[var40], var20, var21);
                                }
                            }
                        }
                        if (field782 == var23) {
                            var4 = var16;
                        } else {
                            method509(var35, var23, var20, var21);
                        }
                    }
                    if (var22 == 3) {
                        class262 var42 = field888[Statics.field373][var20][var21];
                        if (var42 != null) {
                            for (class88 var43 = (class88) var42.method4508(); var43 != null; var43 = (class88) var42.method4502()) {
                                class255 var44 = class255.method348(var43.field1245);
                                if (field901 == 1) {
                                    method3323(class225.field2911, field739 + " " + class82.field1153 + " " + class82.method1591(16748608) + var44.field3450, 16, var43.field1245, var20, var21);
                                } else if (!field811) {
                                    String[] var45 = var44.field3427;
                                    for (int var46 = 4; var46 >= 0; var46--) {
                                        if (var45 != null && var45[var46] != null) {
                                            byte var47 = 0;
                                            if (var46 == 0) {
                                                var47 = 18;
                                            }
                                            if (var46 == 1) {
                                                var47 = 19;
                                            }
                                            if (var46 == 2) {
                                                var47 = 20;
                                            }
                                            if (var46 == 3) {
                                                var47 = 21;
                                            }
                                            if (var46 == 4) {
                                                var47 = 22;
                                            }
                                            method3323(var45[var46], class82.method1591(16748608) + var44.field3450, var47, var43.field1245, var20, var21);
                                        } else if (var46 == 2) {
                                            method3323(class225.field2758, class82.method1591(16748608) + var44.field3450, 20, var43.field1245, var20, var21);
                                        }
                                    }
                                    method3323(class225.field2912, class82.method1591(16748608) + var44.field3450, 1004, var43.field1245, var20, var21);
                                } else if ((Statics.field302 & 0x1) == 1) {
                                    method3323(field814, field815 + " " + class82.field1153 + " " + class82.method1591(16748608) + var44.field3450, 17, var43.field1245, var20, var21);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("o.hp(Lij;IIII)V")
    public static final void method252(class257 arg0, int arg1, int arg2, int arg3) {
        if (field792 >= 400) {
            return;
        }
        if (arg0.field3477 != null) {
            arg0 = arg0.method4324();
        }
        if (arg0 == null || !arg0.field3497 || arg0.field3499 && field826 != arg1) {
            return;
        }
        String var4 = arg0.field3469;
        if (arg0.field3479 != 0) {
            int var6 = arg0.field3479;
            int var7 = Statics.field658.field619;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class82.method1591(16711680);
            } else if (var8 < -6) {
                var9 = class82.method1591(16723968);
            } else if (var8 < -3) {
                var9 = class82.method1591(16740352);
            } else if (var8 < 0) {
                var9 = class82.method1591(16756736);
            } else if (var8 > 9) {
                var9 = class82.method1591(65280);
            } else if (var8 > 6) {
                var9 = class82.method1591(4259584);
            } else if (var8 > 3) {
                var9 = class82.method1591(8453888);
            } else if (var8 > 0) {
                var9 = class82.method1591(12648192);
            } else {
                var9 = class82.method1591(16776960);
            }
            var4 = var4 + var9 + " " + class82.field1151 + class225.field2917 + arg0.field3479 + class82.field1154;
        }
        if (arg0.field3499 && field800) {
            method3323(class225.field2912, class82.method1591(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field901 == 1) {
            method3323(class225.field2911, field739 + " " + class82.field1153 + " " + class82.method1591(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field811) {
            int var10 = arg0.field3499 && field800 ? 2000 : 0;
            String[] var11 = arg0.field3484;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class225.field3037)) {
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
                        method3323(var11[var12], class82.method1591(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class225.field3037)) {
                        short var15 = 0;
                        if (field680 != class85.field1171) {
                            if (field680 == class85.field1168 || field680 == class85.field1174 && arg0.field3479 > Statics.field658.field619) {
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
                            method3323(var11[var14], class82.method1591(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3499 || !field800) {
                method3323(class225.field2912, class82.method1591(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field302 & 0x2) == 2) {
            method3323(field814, field815 + " " + class82.field1153 + " " + class82.method1591(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ao.ir(Lbd;IIIB)V")
    public static final void method509(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field658 == arg0 || field792 >= 400) {
            return;
        }
        String var9;
        if (arg0.field618 == 0) {
            String var4 = arg0.field620[0] + arg0.field622 + arg0.field620[1];
            int var5 = arg0.field619;
            int var6 = Statics.field658.field619;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class82.method1591(16711680);
            } else if (var7 < -6) {
                var8 = class82.method1591(16723968);
            } else if (var7 < -3) {
                var8 = class82.method1591(16740352);
            } else if (var7 < 0) {
                var8 = class82.method1591(16756736);
            } else if (var7 > 9) {
                var8 = class82.method1591(65280);
            } else if (var7 > 6) {
                var8 = class82.method1591(4259584);
            } else if (var7 > 3) {
                var8 = class82.method1591(8453888);
            } else if (var7 > 0) {
                var8 = class82.method1591(12648192);
            } else {
                var8 = class82.method1591(16776960);
            }
            var9 = var4 + var8 + " " + class82.field1151 + class225.field2917 + arg0.field619 + class82.field1154 + arg0.field620[2];
        } else {
            var9 = arg0.field620[0] + arg0.field622 + arg0.field620[1] + " " + class82.field1151 + class225.field2862 + arg0.field618 + class82.field1154 + arg0.field620[2];
        }
        if (field901 == 1) {
            method3323(class225.field2911, field739 + " " + class82.field1153 + " " + class82.method1591(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field811) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field779[var10] != null) {
                    short var11 = 0;
                    if (field779[var10].equalsIgnoreCase(class225.field3037)) {
                        if (field679 == class85.field1171) {
                            continue;
                        }
                        if (field679 == class85.field1168 || field679 == class85.field1174 && arg0.field619 > Statics.field658.field619) {
                            var11 = 2000;
                        }
                        if (Statics.field658.field633 != 0 && arg0.field633 != 0) {
                            if (Statics.field658.field633 == arg0.field633) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field780[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field812[var10] + var11;
                    method3323(field779[var10], class82.method1591(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field302 & 0x8) == 8) {
            method3323(field814, field815 + " " + class82.field1153 + " " + class82.method1591(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field792; var14++) {
            if (field795[var14] == 23) {
                field669[var14] = class82.method1591(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("gj.iu(IIIIIIIII)V")
    public static final void method3345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class218.method3154(arg0)) {
            Statics.field189 = null;
            method4900(Statics.field2557[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field189 != null) {
                method4900(Statics.field189, -1412584499, arg1, arg2, arg3, arg4, Statics.field2743, Statics.field2306, arg7);
                Statics.field189 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field844[var8] = true;
            }
        } else {
            field844[arg7] = true;
        }
    }

    @ObfuscatedName("kd.ii([Lhj;IIIIIIIII)V")
    public static final void method4900(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class322.method5524(arg2, arg3, arg4, arg5);
        class131.method2794();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2584 == arg1 || arg1 == -1412584499 && field829 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field809[field859] = var10.field2578 + arg6;
                    field865[field859] = var10.field2700 + arg7;
                    field866[field859] = var10.field2580;
                    field861[field859] = var10.field2668;
                    var11 = ++field859 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2702 = var11;
                var10.field2703 = field882;
                if (!var10.field2564 || !method995(var10)) {
                    if (var10.field2569 > 0) {
                        method71(var10);
                    }
                    int var12 = var10.field2578 + arg6;
                    int var13 = var10.field2700 + arg7;
                    int var14 = var10.field2596;
                    if (field829 == var10) {
                        if (arg1 != -1412584499 && !var10.field2649) {
                            Statics.field189 = arg0;
                            Statics.field2743 = arg6;
                            Statics.field2306 = arg7;
                            continue;
                        }
                        if (field840 && field874) {
                            int var15 = class55.field493;
                            int var16 = class55.field488;
                            int var17 = var15 - field831;
                            int var18 = var16 - field832;
                            if (var17 < field835) {
                                var17 = field835;
                            }
                            if (var10.field2580 + var17 > field835 + field830.field2580) {
                                var17 = field835 + field830.field2580 - var10.field2580;
                            }
                            if (var18 < field836) {
                                var18 = field836;
                            }
                            if (var10.field2668 + var18 > field836 + field830.field2668) {
                                var18 = field836 + field830.field2668 - var10.field2668;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2649) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2567 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2567 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2580 + var12;
                        int var26 = var10.field2668 + var13;
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
                        int var29 = var10.field2580 + var12;
                        int var30 = var10.field2668 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2564 || var19 < var21 && var20 < var22) {
                        if (var10.field2569 != 0) {
                            if (var10.field2569 == 1336) {
                                if (field885) {
                                    var13 += 15;
                                    Statics.field2055.method4929("Fps:" + field463, var10.field2580 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field657) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2055.method4929("Mem:" + var32 + "k", var10.field2580 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2569 == 1337) {
                                field804 = var12;
                                field805 = var13;
                                method34(var12, var13, var10.field2580, var10.field2668);
                                field844[var10.field2702] = true;
                                class322.method5524(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2569 == 1338) {
                                method960(var10, var12, var13, var11);
                                class322.method5524(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2569 == 1339) {
                                method191(var10, var12, var13, var11);
                                class322.method5524(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2569 == 1400) {
                                Statics.field1876.method5833(var12, var13, var10.field2580, var10.field2668, field882);
                            }
                            if (var10.field2569 == 1401) {
                                Statics.field1876.method5836(var12, var13, var10.field2580, var10.field2668);
                            }
                            if (var10.field2569 == 1402) {
                                Statics.field3632.method1570(var12, field882);
                            }
                        }
                        if (var10.field2567 == 0) {
                            if (!var10.field2564 && method995(var10) && Statics.field1060 != var10) {
                                continue;
                            }
                            if (!var10.field2564) {
                                if (var10.field2587 > var10.field2570 - var10.field2668) {
                                    var10.field2587 = var10.field2570 - var10.field2668;
                                }
                                if (var10.field2587 < 0) {
                                    var10.field2587 = 0;
                                }
                            }
                            method4900(arg0, var10.field2689, var19, var20, var21, var22, var12 - var10.field2586, var13 - var10.field2587, var11);
                            if (var10.field2676 != null) {
                                method4900(var10.field2676, var10.field2689, var19, var20, var21, var22, var12 - var10.field2586, var13 - var10.field2587, var11);
                            }
                            class62 var34 = (class62) field817.method5479((long) var10.field2689);
                            if (var34 != null) {
                                method3345(var34.field572, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class322.method5524(arg2, arg3, arg4, arg5);
                            class131.method2794();
                        }
                        if (field870 || field863[var11] || field769 > 1) {
                            if (var10.field2567 == 0 && !var10.field2564 && var10.field2570 > var10.field2668) {
                                method3770(var10.field2580 + var12, var13, var10.field2587, var10.field2668, var10.field2570);
                            }
                            if (var10.field2567 != 1) {
                                if (var10.field2567 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2577; var36++) {
                                        for (int var37 = 0; var37 < var10.field2671; var37++) {
                                            int var38 = (var10.field2632 + 32) * var37 + var12;
                                            int var39 = (var10.field2633 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2634[var35];
                                                var39 += var10.field2635[var35];
                                            }
                                            if (var10.field2561[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2561[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field128 == var10 && field766 == var35) {
                                                    class326 var43;
                                                    if (field901 == 1 && Statics.field183 == var35 && Statics.field595 == var10.field2689) {
                                                        var43 = class255.method222(var42, var10.field2706[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class255.method222(var42, var10.field2706[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method3755(var10);
                                                    } else if (Statics.field128 == var10 && field766 == var35) {
                                                        int var44 = class55.field493 - field655;
                                                        int var45 = class55.field488 - field764;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field767 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5649(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class218 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class322.field3871 && var46.field2587 > 0) {
                                                                int var47 = field719 * (class322.field3871 - var39 - var45) / 3;
                                                                if (var47 > field719 * 10) {
                                                                    var47 = field719 * 10;
                                                                }
                                                                if (var47 > var46.field2587) {
                                                                    var47 = var46.field2587;
                                                                }
                                                                var46.field2587 -= var47;
                                                                field764 += var47;
                                                                method3755(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class322.field3874 && var46.field2587 < var46.field2570 - var46.field2668) {
                                                                int var48 = field719 * (var39 + var45 + 32 - class322.field3874) / 3;
                                                                if (var48 > field719 * 10) {
                                                                    var48 = field719 * 10;
                                                                }
                                                                if (var48 > var46.field2570 - var46.field2668 - var46.field2587) {
                                                                    var48 = var46.field2570 - var46.field2668 - var46.field2587;
                                                                }
                                                                var46.field2587 += var48;
                                                                field764 -= var48;
                                                                method3755(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field550 == var10 && field699 == var35) {
                                                        var43.method5649(var38, var39, 128);
                                                    } else {
                                                        var43.method5646(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2636 != null && var35 < 20) {
                                                class326 var49 = var10.method3675(var35);
                                                if (var49 != null) {
                                                    var49.method5646(var38, var39);
                                                } else if (class218.field2563) {
                                                    method3755(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2567 == 3) {
                                    int var50;
                                    if (method2011(var10)) {
                                        var50 = var10.field2640;
                                        if (Statics.field1060 == var10 && var10.field2664 != 0) {
                                            var50 = var10.field2664;
                                        }
                                    } else {
                                        var50 = var10.field2696;
                                        if (Statics.field1060 == var10 && var10.field2588 != 0) {
                                            var50 = var10.field2588;
                                        }
                                    }
                                    if (var10.field2572) {
                                        switch(var10.field2694.field3887) {
                                            case 1:
                                                class322.method5532(var12, var13, var10.field2580, var10.field2668, var10.field2696, var10.field2640);
                                                break;
                                            case 2:
                                                class322.method5533(var12, var13, var10.field2580, var10.field2668, var10.field2696, var10.field2640, 255 - (var10.field2596 & 0xFF), 255 - (var10.field2597 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class322.method5539(var12, var13, var10.field2580, var10.field2668, var50);
                                                } else {
                                                    class322.method5531(var12, var13, var10.field2580, var10.field2668, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class322.method5535(var12, var13, var10.field2580, var10.field2668, var50);
                                    } else {
                                        class322.method5536(var12, var13, var10.field2580, var10.field2668, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2567 == 4) {
                                    class296 var51 = var10.method3674();
                                    if (var51 != null) {
                                        String var52 = var10.field2602;
                                        int var53;
                                        if (method2011(var10)) {
                                            var53 = var10.field2640;
                                            if (Statics.field1060 == var10 && var10.field2664 != 0) {
                                                var53 = var10.field2664;
                                            }
                                            if (var10.field2591.length() > 0) {
                                                var52 = var10.field2591;
                                            }
                                        } else {
                                            var53 = var10.field2696;
                                            if (Statics.field1060 == var10 && var10.field2588 != 0) {
                                                var53 = var10.field2588;
                                            }
                                        }
                                        if (var10.field2564 && var10.field2691 != -1) {
                                            class255 var54 = class255.method348(var10.field2691);
                                            var52 = var54.field3450;
                                            if (var52 == null) {
                                                var52 = class225.field2772;
                                            }
                                            if ((var54.field3424 == 1 || var10.field2656 != 1) && var10.field2656 != -1) {
                                                var52 = class82.method1591(16748608) + var52 + class82.field1155 + " " + 'x' + method3310(var10.field2656);
                                            }
                                        }
                                        if (field851 == var10) {
                                            var52 = class225.field2919;
                                            var53 = var10.field2696;
                                        }
                                        if (!var10.field2564) {
                                            var52 = method78(var52, var10);
                                        }
                                        var51.method4931(var52, var12, var13, var10.field2580, var10.field2668, var53, var10.field2660 ? 0 : -1, var10.field2629, var10.field2630, var10.field2628);
                                    } else if (class218.field2563) {
                                        method3755(var10);
                                    }
                                } else if (var10.field2567 == 5) {
                                    if (var10.field2564) {
                                        class326 var56;
                                        if (var10.field2691 == -1) {
                                            var56 = var10.method3673(false);
                                        } else {
                                            var56 = class255.method222(var10.field2691, var10.field2656, var10.field2560, var10.field2605, var10.field2704, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3899;
                                            int var58 = var56.field3905;
                                            if (var10.field2614) {
                                                class322.method5525(var12, var13, var10.field2580 + var12, var10.field2668 + var13);
                                                int var59 = (var10.field2580 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2668 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2592 != 0) {
                                                            var56.method5706(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2592, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5646(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5649(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class322.method5524(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2580 * 4096 / var57;
                                                if (var10.field2592 != 0) {
                                                    var56.method5706(var10.field2580 / 2 + var12, var10.field2668 / 2 + var13, var10.field2592, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5651(var12, var13, var10.field2580, var10.field2668, 256 - (var14 & 0xFF));
                                                } else if (var10.field2580 == var57 && var10.field2668 == var58) {
                                                    var56.method5646(var12, var13);
                                                } else {
                                                    var56.method5645(var12, var13, var10.field2580, var10.field2668);
                                                }
                                            }
                                        } else if (class218.field2563) {
                                            method3755(var10);
                                        }
                                    } else {
                                        class326 var55 = var10.method3673(method2011(var10));
                                        if (var55 != null) {
                                            var55.method5646(var12, var13);
                                        } else if (class218.field2563) {
                                            method3755(var10);
                                        }
                                    }
                                } else if (var10.field2567 == 6) {
                                    boolean var64 = method2011(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2613;
                                    } else {
                                        var65 = var10.field2612;
                                    }
                                    class128 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2691 != -1) {
                                        class255 var68 = class255.method348(var10.field2691);
                                        if (var68 != null) {
                                            class255 var69 = var68.method4273(var10.field2656);
                                            var66 = var69.method4261(1);
                                            if (var66 == null) {
                                                method3755(var10);
                                            } else {
                                                var66.method2642();
                                                var67 = var66.field1874 / 2;
                                            }
                                        }
                                    } else if (var10.field2608 == 5) {
                                        if (var10.field2650 == 0) {
                                            var66 = field919.method3634((class259) null, -1, (class259) null, -1);
                                        } else {
                                            var66 = Statics.field658.method1087();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3686((class259) null, -1, var64, Statics.field658.field614);
                                        if (var66 == null && class218.field2563) {
                                            method3755(var10);
                                        }
                                    } else {
                                        class259 var70 = class259.method67(var65);
                                        var66 = var10.method3686(var70, var10.field2693, var64, Statics.field658.field614);
                                        if (var66 == null && class218.field2563) {
                                            method3755(var10);
                                        }
                                    }
                                    class131.method2719(var10.field2580 / 2 + var12, var10.field2668 / 2 + var13);
                                    int var71 = var10.field2619 * class131.field1788[var10.field2616] >> 16;
                                    int var72 = var10.field2619 * class131.field1785[var10.field2616] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2564) {
                                            var66.method2642();
                                            if (var10.field2622) {
                                                var66.method2619(0, var10.field2617, var10.field2641, var10.field2616, var10.field2594, var10.field2615 + var67 + var71, var10.field2615 + var72, var10.field2619);
                                            } else {
                                                var66.method2609(0, var10.field2617, var10.field2641, var10.field2616, var10.field2594, var10.field2615 + var67 + var71, var10.field2615 + var72);
                                            }
                                        } else {
                                            var66.method2609(0, var10.field2617, 0, var10.field2616, 0, var71, var72);
                                        }
                                    }
                                    class131.method2716();
                                } else {
                                    if (var10.field2567 == 7) {
                                        class296 var73 = var10.method3674();
                                        if (var73 == null) {
                                            if (class218.field2563) {
                                                method3755(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2577; var75++) {
                                            for (int var76 = 0; var76 < var10.field2671; var76++) {
                                                if (var10.field2561[var74] > 0) {
                                                    class255 var77 = class255.method348(var10.field2561[var74] - 1);
                                                    String var78;
                                                    if (var77.field3424 != 1 && var10.field2706[var74] == 1) {
                                                        var78 = class82.method1591(16748608) + var77.field3450 + class82.field1155;
                                                    } else {
                                                        var78 = class82.method1591(16748608) + var77.field3450 + class82.field1155 + " " + 'x' + method3310(var10.field2706[var74]);
                                                    }
                                                    int var79 = (var10.field2632 + 115) * var76 + var12;
                                                    int var80 = (var10.field2633 + 12) * var75 + var13;
                                                    if (var10.field2629 == 0) {
                                                        var73.method4927(var78, var79, var80, var10.field2696, var10.field2660 ? 0 : -1);
                                                    } else if (var10.field2629 == 1) {
                                                        var73.method4922(var78, var10.field2580 / 2 + var79, var80, var10.field2696, var10.field2660 ? 0 : -1);
                                                    } else {
                                                        var73.method4929(var78, var10.field2580 + var79 - 1, var80, var10.field2696, var10.field2660 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2567 == 8 && Statics.field285 == var10 && field841 == field834) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class296 var83 = Statics.field2055;
                                        String var84 = var10.field2602;
                                        String var85 = method78(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class82.field1152);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4990(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3710 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2580 + var12 - 5 - var81;
                                        int var90 = var10.field2668 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class322.method5539(var89, var90, var81, var82, 16777120);
                                        class322.method5535(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2602;
                                        int var92 = var83.field3710 + var90 + 2;
                                        String var93 = method78(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class82.field1152);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4927(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3710 + 1;
                                        }
                                    }
                                    if (var10.field2567 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2599) {
                                            var96 = var12;
                                            var97 = var10.field2668 + var13;
                                            var98 = var10.field2580 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2580 + var12;
                                            var99 = var10.field2668 + var13;
                                        }
                                        if (var10.field2598 == 1) {
                                            class322.method5541(var96, var97, var98, var99, var10.field2696);
                                        } else {
                                            method3553(var96, var97, var98, var99, var10.field2696, var10.field2598);
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

    @ObfuscatedName("gq.ih(IIIIIII)V")
    public static final void method3553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class322.field3875;
        int var18 = arg1 - class322.field3871;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class131.method2724(var19, var20, var21);
        class131.method2750(var23, var24, var25, var19, var20, var21, arg4);
        class131.method2724(var19, var21, var22);
        class131.method2750(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("c.if(Ljava/lang/String;Lhj;I)Ljava/lang/String;")
    public static String method78(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3606(arg1, var2 - 1);
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

    @ObfuscatedName("gp.ig(II)Ljava/lang/String;")
    public static final String method3310(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class82.field1149 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class82.method1591(65408) + var1.substring(0, var1.length() - 8) + class225.field2922 + " " + class82.field1151 + var1 + class82.field1154 + class82.field1155;
        } else if (var1.length() > 6) {
            return " " + class82.method1591(16777215) + var1.substring(0, var1.length() - 4) + class225.field2924 + " " + class82.field1151 + var1 + class82.field1154 + class82.field1155;
        } else {
            return " " + class82.method1591(16776960) + var1 + class82.field1155;
        }
    }

    @ObfuscatedName("client.ik(ZI)V")
    public final void method1143(boolean arg0) {
        method360(field906, Statics.field47, Statics.field3309, arg0);
    }

    @ObfuscatedName("client.iw(Lhj;I)V")
    public void method1117(class218 arg0) {
        class218 var2 = arg0.field2584 == -1 ? null : class218.method1799(arg0.field2584);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field47;
            var4 = Statics.field3309;
        } else {
            var3 = var2.field2580;
            var4 = var2.field2668;
        }
        method3749(arg0, var3, var4, false);
        method2223(arg0, var3, var4);
    }

    @ObfuscatedName("av.id([Lhj;Lhj;ZI)V")
    public static void method357(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2688 == 0 ? arg1.field2580 : arg1.field2688;
        int var4 = arg1.field2570 == 0 ? arg1.field2668 : arg1.field2570;
        method136(arg0, arg1.field2689, var3, var4, arg2);
        if (arg1.field2676 != null) {
            method136(arg1.field2676, arg1.field2689, var3, var4, arg2);
        }
        class62 var5 = (class62) field817.method5479((long) arg1.field2689);
        if (var5 != null) {
            method360(var5.field572, var3, var4, arg2);
        }
        if (arg1.field2569 == 1337) {
        }
    }

    @ObfuscatedName("av.ib(IIIZI)V")
    public static final void method360(int arg0, int arg1, int arg2, boolean arg3) {
        if (class218.method3154(arg0)) {
            method136(Statics.field2557[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("r.ic([Lhj;IIIZI)V")
    public static void method136(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2584 == arg1) {
                method3749(var6, arg2, arg3, arg4);
                method2223(var6, arg2, arg3);
                if (var6.field2586 > var6.field2688 - var6.field2580) {
                    var6.field2586 = var6.field2688 - var6.field2580;
                }
                if (var6.field2586 < 0) {
                    var6.field2586 = 0;
                }
                if (var6.field2587 > var6.field2570 - var6.field2668) {
                    var6.field2587 = var6.field2570 - var6.field2668;
                }
                if (var6.field2587 < 0) {
                    var6.field2587 = 0;
                }
                if (var6.field2567 == 0) {
                    method357(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("hm.im(Lhj;IIZI)V")
    public static void method3749(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2580;
        int var5 = arg0.field2668;
        if (arg0.field2639 == 0) {
            arg0.field2580 = arg0.field2671;
        } else if (arg0.field2639 == 1) {
            arg0.field2580 = arg1 - arg0.field2671;
        } else if (arg0.field2639 == 2) {
            arg0.field2580 = arg0.field2671 * arg1 >> 14;
        }
        if (arg0.field2573 == 0) {
            arg0.field2668 = arg0.field2577;
        } else if (arg0.field2573 == 1) {
            arg0.field2668 = arg2 - arg0.field2577;
        } else if (arg0.field2573 == 2) {
            arg0.field2668 = arg0.field2577 * arg2 >> 14;
        }
        if (arg0.field2639 == 4) {
            arg0.field2580 = arg0.field2668 * arg0.field2637 / arg0.field2583;
        }
        if (arg0.field2573 == 4) {
            arg0.field2668 = arg0.field2583 * arg0.field2580 / arg0.field2637;
        }
        if (arg0.field2569 == 1337) {
            field828 = arg0;
        }
        if (arg3 && arg0.field2680 != null && (arg0.field2580 != var4 || arg0.field2668 != var5)) {
            class63 var6 = new class63();
            var6.field576 = arg0;
            var6.field582 = arg0.field2680;
            field855.method4532(var6);
        }
    }

    @ObfuscatedName("dn.ip(Lhj;IIB)V")
    public static void method2223(class218 arg0, int arg1, int arg2) {
        if (arg0.field2695 == 0) {
            arg0.field2578 = arg0.field2652;
        } else if (arg0.field2695 == 1) {
            arg0.field2578 = (arg1 - arg0.field2580) / 2 + arg0.field2652;
        } else if (arg0.field2695 == 2) {
            arg0.field2578 = arg1 - arg0.field2580 - arg0.field2652;
        } else if (arg0.field2695 == 3) {
            arg0.field2578 = arg0.field2652 * arg1 >> 14;
        } else if (arg0.field2695 == 4) {
            arg0.field2578 = (arg0.field2652 * arg1 >> 14) + (arg1 - arg0.field2580) / 2;
        } else {
            arg0.field2578 = arg1 - arg0.field2580 - (arg0.field2652 * arg1 >> 14);
        }
        if (arg0.field2571 == 0) {
            arg0.field2700 = arg0.field2575;
        } else if (arg0.field2571 == 1) {
            arg0.field2700 = (arg2 - arg0.field2668) / 2 + arg0.field2575;
        } else if (arg0.field2571 == 2) {
            arg0.field2700 = arg2 - arg0.field2668 - arg0.field2575;
        } else if (arg0.field2571 == 3) {
            arg0.field2700 = arg0.field2575 * arg2 >> 14;
        } else if (arg0.field2571 == 4) {
            arg0.field2700 = (arg0.field2575 * arg2 >> 14) + (arg2 - arg0.field2668) / 2;
        } else {
            arg0.field2700 = arg2 - arg0.field2668 - (arg0.field2575 * arg2 >> 14);
        }
    }

    @ObfuscatedName("b.il(Lhj;IIIIIII)V")
    public static final void method57(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field720) {
            field883 = 32;
        } else {
            field883 = 0;
        }
        field720 = false;
        if (class55.field486 == 1 || !Statics.field414 && class55.field486 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2587 -= 4;
                method3755(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2587 += 4;
                method3755(arg0);
            } else if (arg5 >= arg1 - field883 && arg5 < field883 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2587 = (arg4 - arg3) * var8 / var9;
                method3755(arg0);
                field720 = true;
            }
        }
        if (field854 == 0) {
            return;
        }
        int var10 = arg0.field2580;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2587 += field854 * 45;
            method3755(arg0);
        }
    }

    @ObfuscatedName("hq.ia(IIIIIB)V")
    public static final void method3770(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field83[0].method5621(arg0, arg1);
        Statics.field83[1].method5621(arg0, arg1 + arg3 - 16);
        class322.method5539(arg0, arg1 + 16, 16, arg3 - 32, field716);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class322.method5539(arg0, arg1 + 16 + var6, 16, var5, field717);
        class322.method5527(arg0, arg1 + 16 + var6, var5, field773);
        class322.method5527(arg0 + 1, arg1 + 16 + var6, var5, field773);
        class322.method5537(arg0, arg1 + 16 + var6, 16, field773);
        class322.method5537(arg0, arg1 + 17 + var6, 16, field773);
        class322.method5527(arg0 + 15, arg1 + 16 + var6, var5, field721);
        class322.method5527(arg0 + 14, arg1 + 17 + var6, var5 - 1, field721);
        class322.method5537(arg0, arg1 + 15 + var6 + var5, 16, field721);
        class322.method5537(arg0 + 1, arg1 + 14 + var6 + var5, 15, field721);
    }

    @ObfuscatedName("cs.ie(Lhj;I)Z")
    public static final boolean method2011(class218 arg0) {
        if (arg0.field2684 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2684.length; var1++) {
            int var2 = method3606(arg0, var1);
            int var3 = arg0.field2685[var1];
            if (arg0.field2684[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2684[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2684[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("he.in(Lhj;II)I")
    public static final int method3606(class218 arg0, int arg1) {
        if (arg0.field2683 == null || arg1 >= arg0.field2683.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2683[arg1];
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
                    var7 = field761[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field788[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field789[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method1799(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class255.method348(var12).field3426 || field656)) {
                        for (int var13 = 0; var13 < var11.field2561.length; var13++) {
                            if (var12 + 1 == var11.field2561[var13]) {
                                var7 += var11.field2706[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2526[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class222.field2744[field788[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2526[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field658.field619;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class222.field2745[var14]) {
                            var7 += field788[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method1799(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class255.method348(var18).field3426 || field656)) {
                        for (int var19 = 0; var19 < var17.field2561.length; var19++) {
                            if (var18 + 1 == var17.field2561[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field911;
                }
                if (var6 == 12) {
                    var7 = field824;
                }
                if (var6 == 13) {
                    int var20 = class213.field2526[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class213.method1099(var22);
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
                    var7 = (Statics.field658.field1006 >> 7) + Statics.field2390;
                }
                if (var6 == 19) {
                    var7 = (Statics.field658.field950 >> 7) + Statics.field2;
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

    @ObfuscatedName("n.iv(Lhj;Liq;IIZI)V")
    public static final void method256(class218 arg0, class255 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3428;
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
            var7 = class225.field3047;
        }
        if (var6 != -1 && var7 != null) {
            method2994(var7, class82.method1591(16748608) + arg1.field3450, var6, arg1.field3411, arg2, arg0.field2689, arg4);
        }
    }

    @ObfuscatedName("ap.io(Lhj;III)V")
    public static final void method586(class218 arg0, int arg1, int arg2) {
        if (arg0.field2568 == 1) {
            method3323(arg0.field2574, "", 24, 0, 0, arg0.field2689);
        }
        if (arg0.field2568 == 2 && !field811) {
            String var3 = method4899(arg0);
            if (var3 != null) {
                method3323(var3, class82.method1591(65280) + arg0.field2687, 25, 0, -1, arg0.field2689);
            }
        }
        if (arg0.field2568 == 3) {
            method3323(class225.field2856, "", 26, 0, 0, arg0.field2689);
        }
        if (arg0.field2568 == 4) {
            method3323(arg0.field2574, "", 28, 0, 0, arg0.field2689);
        }
        if (arg0.field2568 == 5) {
            method3323(arg0.field2574, "", 29, 0, 0, arg0.field2689);
        }
        if (arg0.field2568 == 6 && field851 == null) {
            method3323(arg0.field2574, "", 30, 0, -1, arg0.field2689);
        }
        if (arg0.field2567 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2668; var5++) {
                for (int var6 = 0; var6 < arg0.field2580; var6++) {
                    int var7 = (arg0.field2632 + 32) * var6;
                    int var8 = (arg0.field2633 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2634[var4];
                        var8 += arg0.field2635[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field765 = var4;
                        Statics.field3698 = arg0;
                        if (arg0.field2561[var4] > 0) {
                            class255 var9 = class255.method348(arg0.field2561[var4] - 1);
                            if (field901 == 1 && class219.method1994(method4602(arg0))) {
                                if (Statics.field595 != arg0.field2689 || Statics.field183 != var4) {
                                    method3323(class225.field2911, field739 + " " + class82.field1153 + " " + class82.method1591(16748608) + var9.field3450, 31, var9.field3411, var4, arg0.field2689);
                                }
                            } else if (!field811 || !class219.method1994(method4602(arg0))) {
                                String[] var10 = var9.field3428;
                                int var11 = -1;
                                if (field801) {
                                    boolean var12 = field802 || class46.field396[81];
                                    if (var12) {
                                        var11 = var9.method4269();
                                    }
                                }
                                if (class219.method1994(method4602(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method256(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                if (class219.method3358(method4602(arg0))) {
                                    method3323(class225.field2911, class82.method1591(16748608) + var9.field3450, 38, var9.field3411, var4, arg0.field2689);
                                }
                                if (class219.method1994(method4602(arg0))) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11 != var14) {
                                            method256(arg0, var9, var4, var14, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method256(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var15 = arg0.field2681;
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
                                            method3323(var15[var16], class82.method1591(16748608) + var9.field3450, var17, var9.field3411, var4, arg0.field2689);
                                        }
                                    }
                                }
                                method3323(class225.field2912, class82.method1591(16748608) + var9.field3450, 1005, var9.field3411, var4, arg0.field2689);
                            } else if ((Statics.field302 & 0x10) == 16) {
                                method3323(field814, field815 + " " + class82.field1153 + " " + class82.method1591(16748608) + var9.field3450, 32, var9.field3411, var4, arg0.field2689);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2564) {
            return;
        }
        if (!field811) {
            for (int var18 = 9; var18 >= 5; var18--) {
                String var19 = method3118(arg0, var18);
                if (var19 != null) {
                    method3323(var19, arg0.field2644, 1007, var18 + 1, arg0.field2566, arg0.field2689);
                }
            }
            String var20 = method4899(arg0);
            if (var20 != null) {
                method3323(var20, arg0.field2644, 25, 0, arg0.field2566, arg0.field2689);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                String var22 = method3118(arg0, var21);
                if (var22 != null) {
                    method2994(var22, arg0.field2644, 57, var21 + 1, arg0.field2566, arg0.field2689, arg0.field2692);
                }
            }
            if (class219.method981(method4602(arg0))) {
                method3323(class225.field2763, "", 30, 0, arg0.field2566, arg0.field2689);
            }
        } else if (class219.method2070(method4602(arg0)) && (Statics.field302 & 0x20) == 32) {
            method3323(field814, field815 + " " + class82.field1153 + " " + arg0.field2644, 58, 0, arg0.field2566, arg0.field2689);
        }
    }

    @ObfuscatedName("fi.iy(ZI)V")
    public static void method3126(boolean arg0) {
        field802 = arg0;
    }

    @ObfuscatedName("hz.iz(IIIIIIII)V")
    public static final void method3751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class218.method3154(arg0)) {
            method17(Statics.field2557[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("e.ij([Lhj;IIIIIIIS)V")
    public static final void method17(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && var9.field2584 == arg1 && (!var9.field2564 || var9.field2567 == 0 || var9.field2552 || method4602(var9) != 0 || field830 == var9 || var9.field2569 == 1338)) {
                if (var9.field2564) {
                    if (method995(var9)) {
                        continue;
                    }
                } else if (var9.field2567 == 0 && Statics.field1060 != var9 && method995(var9)) {
                    continue;
                }
                int var10 = var9.field2578 + arg6;
                int var11 = var9.field2700 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2567 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2567 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2580 + var10;
                    int var19 = var9.field2668 + var11;
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
                    int var22 = var9.field2580 + var10;
                    int var23 = var9.field2668 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field829 == var9) {
                    field746 = true;
                    field838 = var10;
                    field839 = var11;
                }
                boolean var24 = false;
                if (var9.field2705) {
                    switch(field818) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2689 >>> 16 == field819) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field819 == var9.field2689) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2564 || var12 < var14 && var13 < var15) {
                    if (var9.field2564) {
                        if (var9.field2581) {
                            if (class55.field493 >= var12 && class55.field488 >= var13 && class55.field493 < var14 && class55.field488 < var15) {
                                for (class63 var25 = (class63) field855.method4507(); var25 != null; var25 = (class63) field855.method4509()) {
                                    if (var25.field575) {
                                        var25.method3286();
                                        var25.field576.field2643 = false;
                                    }
                                }
                                if (Statics.field1144 == 0) {
                                    field829 = null;
                                    field830 = null;
                                }
                                if (!field675) {
                                    method1776();
                                }
                            }
                        } else if (var9.field2698 && class55.field493 >= var12 && class55.field488 >= var13 && class55.field493 < var14 && class55.field488 < var15) {
                            for (class63 var26 = (class63) field855.method4507(); var26 != null; var26 = (class63) field855.method4509()) {
                                if (var26.field575 && var26.field576.field2672 == var26.field582) {
                                    var26.method3286();
                                }
                            }
                        }
                    }
                    int var27 = class55.field493;
                    int var28 = class55.field488;
                    if (class55.field494 != 0) {
                        var27 = class55.field484;
                        var28 = class55.field496;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2569 == 1337) {
                        if (!field662 && !field675 && var29) {
                            method1036(var27, var28, var12, var13);
                        }
                    } else if (var9.field2569 == 1338) {
                        method194(var9, var10, var11);
                    } else {
                        if (var9.field2569 == 1400) {
                            Statics.field1876.method5851(class55.field493, class55.field488, var29, var10, var11, var9.field2580, var9.field2668);
                        }
                        if (!field675 && var29) {
                            if (var9.field2569 == 1400) {
                                Statics.field1876.method5998(var10, var11, var9.field2580, var9.field2668, var27, var28);
                            } else {
                                method586(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2651.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2651[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2651[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2579 != null) {
                                            var34 = class46.field396[var9.field2651[var30][var33]];
                                        }
                                        if (method2048(var9.field2651[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2579 != null && var9.field2579[var30] > field882) {
                                                break;
                                            }
                                            byte var35 = var9.field2626[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class46.field396[86] && !class46.field396[82] && !class46.field396[81]) && ((var35 & 0x2) == 0 || class46.field396[86]) && ((var35 & 0x1) == 0 || class46.field396[82]) && ((var35 & 0x4) == 0 || class46.field396[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method1972(var30 + 1, var9.field2689, var9.field2566, var9.field2691, "");
                                    } else if (var30 == 10) {
                                        method486();
                                        method1862(var9.field2689, var9.field2566, class219.method1787(method4602(var9)), var9.field2691);
                                        field814 = method4899(var9);
                                        if (field814 == null) {
                                            field814 = class225.field2772;
                                        }
                                        field815 = var9.field2644 + class82.method1591(16777215);
                                    }
                                    int var36 = var9.field2642[var30];
                                    if (var9.field2579 == null) {
                                        var9.field2579 = new int[var9.field2651.length];
                                    }
                                    if (var9.field2589 == null) {
                                        var9.field2589 = new int[var9.field2651.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2579[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2579[var30] == 0) {
                                        var9.field2579[var30] = field882 + var36 + var9.field2589[var30];
                                    } else {
                                        var9.field2579[var30] = field882 + var36;
                                    }
                                }
                                if (!var31 && var9.field2579 != null) {
                                    var9.field2579[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2564) {
                            boolean var37;
                            if (class55.field493 >= var12 && class55.field488 >= var13 && class55.field493 < var14 && class55.field488 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class55.field486 == 1 || !Statics.field414 && class55.field486 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class55.field494 == 1 || !Statics.field414 && class55.field494 == 4) && class55.field484 >= var12 && class55.field496 >= var13 && class55.field484 < var14 && class55.field496 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                Statics.method980(var9, class55.field484 - var10, class55.field496 - var11);
                            }
                            if (var9.field2569 == 1400) {
                                Statics.field1876.method5817(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field829 != null && field829 != var9 && var37 && class219.method260(method4602(var9))) {
                                field833 = var9;
                            }
                            if (field830 == var9) {
                                field874 = true;
                                field835 = var10;
                                field836 = var11;
                            }
                            if (var9.field2552) {
                                if (var37 && field854 != 0 && var9.field2672 != null) {
                                    class63 var40 = new class63();
                                    var40.field575 = true;
                                    var40.field576 = var9;
                                    var40.field578 = field854;
                                    var40.field582 = var9.field2672;
                                    field855.method4532(var40);
                                }
                                if (field829 != null || Statics.field128 != null || field675) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2590 && var39) {
                                    var9.field2590 = true;
                                    if (var9.field2653 != null) {
                                        class63 var41 = new class63();
                                        var41.field575 = true;
                                        var41.field576 = var9;
                                        var41.field577 = class55.field484 - var10;
                                        var41.field578 = class55.field496 - var11;
                                        var41.field582 = var9.field2653;
                                        field855.method4532(var41);
                                    }
                                }
                                if (var9.field2590 && var38 && var9.field2654 != null) {
                                    class63 var42 = new class63();
                                    var42.field575 = true;
                                    var42.field576 = var9;
                                    var42.field577 = class55.field493 - var10;
                                    var42.field578 = class55.field488 - var11;
                                    var42.field582 = var9.field2654;
                                    field855.method4532(var42);
                                }
                                if (var9.field2590 && !var38) {
                                    var9.field2590 = false;
                                    if (var9.field2655 != null) {
                                        class63 var43 = new class63();
                                        var43.field575 = true;
                                        var43.field576 = var9;
                                        var43.field577 = class55.field493 - var10;
                                        var43.field578 = class55.field488 - var11;
                                        var43.field582 = var9.field2655;
                                        field857.method4532(var43);
                                    }
                                }
                                if (var38 && var9.field2638 != null) {
                                    class63 var44 = new class63();
                                    var44.field575 = true;
                                    var44.field576 = var9;
                                    var44.field577 = class55.field493 - var10;
                                    var44.field578 = class55.field488 - var11;
                                    var44.field582 = var9.field2638;
                                    field855.method4532(var44);
                                }
                                if (!var9.field2643 && var37) {
                                    var9.field2643 = true;
                                    if (var9.field2609 != null) {
                                        class63 var45 = new class63();
                                        var45.field575 = true;
                                        var45.field576 = var9;
                                        var45.field577 = class55.field493 - var10;
                                        var45.field578 = class55.field488 - var11;
                                        var45.field582 = var9.field2609;
                                        field855.method4532(var45);
                                    }
                                }
                                if (var9.field2643 && var37 && var9.field2582 != null) {
                                    class63 var46 = new class63();
                                    var46.field575 = true;
                                    var46.field576 = var9;
                                    var46.field577 = class55.field493 - var10;
                                    var46.field578 = class55.field488 - var11;
                                    var46.field582 = var9.field2582;
                                    field855.method4532(var46);
                                }
                                if (var9.field2643 && !var37) {
                                    var9.field2643 = false;
                                    if (var9.field2659 != null) {
                                        class63 var47 = new class63();
                                        var47.field575 = true;
                                        var47.field576 = var9;
                                        var47.field577 = class55.field493 - var10;
                                        var47.field578 = class55.field488 - var11;
                                        var47.field582 = var9.field2659;
                                        field857.method4532(var47);
                                    }
                                }
                                if (var9.field2603 != null) {
                                    class63 var48 = new class63();
                                    var48.field576 = var9;
                                    var48.field582 = var9.field2603;
                                    field853.method4532(var48);
                                }
                                if (var9.field2627 != null && field807 > var9.field2593) {
                                    if (var9.field2665 == null || field807 - var9.field2593 > 32) {
                                        class63 var53 = new class63();
                                        var53.field576 = var9;
                                        var53.field582 = var9.field2627;
                                        field855.method4532(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2593; var49 < field807; var49++) {
                                            int var50 = field864[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2665.length; var51++) {
                                                if (var9.field2665[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field576 = var9;
                                                    var52.field582 = var9.field2627;
                                                    field855.method4532(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2593 = field807;
                                }
                                if (var9.field2666 != null && field672 > var9.field2604) {
                                    if (var9.field2667 == null || field672 - var9.field2604 > 32) {
                                        class63 var58 = new class63();
                                        var58.field576 = var9;
                                        var58.field582 = var9.field2666;
                                        field855.method4532(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2604; var54 < field672; var54++) {
                                            int var55 = field889[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2667.length; var56++) {
                                                if (var9.field2667[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field576 = var9;
                                                    var57.field582 = var9.field2666;
                                                    field855.method4532(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2604 = field672;
                                }
                                if (var9.field2595 != null && field847 > var9.field2701) {
                                    if (var9.field2669 == null || field847 - var9.field2701 > 32) {
                                        class63 var63 = new class63();
                                        var63.field576 = var9;
                                        var63.field582 = var9.field2595;
                                        field855.method4532(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2701; var59 < field847; var59++) {
                                            int var60 = field846[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2669.length; var61++) {
                                                if (var9.field2669[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field576 = var9;
                                                    var62.field582 = var9.field2595;
                                                    field855.method4532(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2701 = field847;
                                }
                                if (field848 > var9.field2690 && var9.field2673 != null) {
                                    class63 var64 = new class63();
                                    var64.field576 = var9;
                                    var64.field582 = var9.field2673;
                                    field855.method4532(var64);
                                }
                                if (field673 > var9.field2690 && var9.field2675 != null) {
                                    class63 var65 = new class63();
                                    var65.field576 = var9;
                                    var65.field582 = var9.field2675;
                                    field855.method4532(var65);
                                }
                                if (field850 > var9.field2690 && var9.field2624 != null) {
                                    class63 var66 = new class63();
                                    var66.field576 = var9;
                                    var66.field582 = var9.field2624;
                                    field855.method4532(var66);
                                }
                                if (field916 > var9.field2690 && var9.field2623 != null) {
                                    class63 var67 = new class63();
                                    var67.field576 = var9;
                                    var67.field582 = var9.field2623;
                                    field855.method4532(var67);
                                }
                                if (field852 > var9.field2690 && var9.field2682 != null) {
                                    class63 var68 = new class63();
                                    var68.field576 = var9;
                                    var68.field582 = var9.field2682;
                                    field855.method4532(var68);
                                }
                                if (field845 > var9.field2690 && var9.field2677 != null) {
                                    class63 var69 = new class63();
                                    var69.field576 = var9;
                                    var69.field582 = var9.field2677;
                                    field855.method4532(var69);
                                }
                                var9.field2690 = field674;
                                if (var9.field2674 != null) {
                                    for (int var70 = 0; var70 < field755; var70++) {
                                        class63 var71 = new class63();
                                        var71.field576 = var9;
                                        var71.field581 = field922[var70];
                                        var71.field588 = field878[var70];
                                        var71.field582 = var9.field2674;
                                        field855.method4532(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2564) {
                            if (field829 != null || Statics.field128 != null || field675) {
                                continue;
                            }
                            if ((var9.field2686 >= 0 || var9.field2588 != 0) && class55.field493 >= var12 && class55.field488 >= var13 && class55.field493 < var14 && class55.field488 < var15) {
                                if (var9.field2686 >= 0) {
                                    Statics.field1060 = arg0[var9.field2686];
                                } else {
                                    Statics.field1060 = var9;
                                }
                            }
                            if (var9.field2567 == 8 && class55.field493 >= var12 && class55.field488 >= var13 && class55.field493 < var14 && class55.field488 < var15) {
                                Statics.field285 = var9;
                            }
                            if (var9.field2570 > var9.field2668) {
                                method57(var9, var9.field2580 + var10, var11, var9.field2668, var9.field2570, class55.field493, class55.field488);
                            }
                        }
                        if (var9.field2567 == 0) {
                            method17(arg0, var9.field2689, var12, var13, var14, var15, var10 - var9.field2586, var11 - var9.field2587);
                            if (var9.field2676 != null) {
                                method17(var9.field2676, var9.field2689, var12, var13, var14, var15, var10 - var9.field2586, var11 - var9.field2587);
                            }
                            class62 var72 = (class62) field817.method5479((long) var9.field2689);
                            if (var72 != null) {
                                if (var72.field570 == 0 && class55.field493 >= var12 && class55.field488 >= var13 && class55.field493 < var14 && class55.field488 < var15 && !field675) {
                                    for (class63 var73 = (class63) field855.method4507(); var73 != null; var73 = (class63) field855.method4509()) {
                                        if (var73.field575) {
                                            var73.method3286();
                                            var73.field576.field2643 = false;
                                        }
                                    }
                                    if (Statics.field1144 == 0) {
                                        field829 = null;
                                        field830 = null;
                                    }
                                    if (!field675) {
                                        method1776();
                                    }
                                }
                                method3751(var72.field572, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.it(II)Z")
    public static boolean method2048(int arg0) {
        for (int var1 = 0; var1 < field755; var1++) {
            if (field922[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("a.is(III)V")
    public static final void method161(int arg0, int arg1) {
        if (class218.method3154(arg0)) {
            method483(Statics.field2557[arg0], arg1);
        }
    }

    @ObfuscatedName("ag.ix([Lhj;IS)V")
    public static final void method483(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2567 == 0) {
                    if (var3.field2676 != null) {
                        method483(var3.field2676, arg1);
                    }
                    class62 var4 = (class62) field817.method5479((long) var3.field2689);
                    if (var4 != null) {
                        method161(var4.field572, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2678 != null) {
                    class63 var5 = new class63();
                    var5.field576 = var3;
                    var5.field582 = var3.field2678;
                    class77.method3292(var5);
                }
                if (arg1 == 1 && var3.field2679 != null) {
                    if (var3.field2566 >= 0) {
                        class218 var6 = class218.method1799(var3.field2689);
                        if (var6 == null || var6.field2676 == null || var3.field2566 >= var6.field2676.length || var6.field2676[var3.field2566] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field576 = var3;
                    var7.field582 = var3.field2679;
                    class77.method3292(var7);
                }
            }
        }
    }

    @ObfuscatedName("client.jh(B)V")
    public final void method1480() {
        method3755(field829);
        Statics.field1144++;
        if (field746 && field874) {
            int var1 = class55.field493;
            int var2 = class55.field488;
            int var3 = var1 - field831;
            int var4 = var2 - field832;
            if (var3 < field835) {
                var3 = field835;
            }
            if (field829.field2580 + var3 > field835 + field830.field2580) {
                var3 = field835 + field830.field2580 - field829.field2580;
            }
            if (var4 < field836) {
                var4 = field836;
            }
            if (field829.field2668 + var4 > field836 + field830.field2668) {
                var4 = field836 + field830.field2668 - field829.field2668;
            }
            int var5 = var3 - field838;
            int var6 = var4 - field839;
            int var7 = field829.field2647;
            if (Statics.field1144 > field829.field2648 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field840 = true;
            }
            int var8 = field830.field2586 + (var3 - field835);
            int var9 = field830.field2587 + (var4 - field836);
            if (field829.field2621 != null && field840) {
                class63 var10 = new class63();
                var10.field576 = field829;
                var10.field577 = var8;
                var10.field578 = var9;
                var10.field582 = field829.field2621;
                class77.method3292(var10);
            }
            if (class55.field486 == 0) {
                if (field840) {
                    if (field829.field2661 != null) {
                        class63 var11 = new class63();
                        var11.field576 = field829;
                        var11.field577 = var8;
                        var11.field578 = var9;
                        var11.field580 = field833;
                        var11.field582 = field829.field2661;
                        class77.method3292(var11);
                    }
                    if (field833 != null) {
                        class218 var12 = field829;
                        int var13 = class219.method489(method4602(var12));
                        class218 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class218.method1799(var12.field2584);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class188 var16 = class188.method3894(class184.field2261, field881.field1314);
                            var16.field2334.method5103(field829.field2566);
                            var16.field2334.method5103(field833.field2691);
                            var16.field2334.method5052(field833.field2566);
                            var16.field2334.method5111(field829.field2689);
                            var16.field2334.method5112(field833.field2689);
                            var16.field2334.method5052(field829.field2691);
                            field881.method2023(var16);
                        }
                    }
                } else if (this.method1115()) {
                    this.method1126(field838 + field831, field839 + field832);
                } else if (field792 > 0) {
                    int var17 = field838 + field831;
                    int var18 = field839 + field832;
                    class83 var19 = Statics.field917;
                    method1979(var19.field1158, var19.field1157, var19.field1156, var19.field1159, var19.field1160, var19.field1160, var17, var18);
                    Statics.field917 = null;
                }
                field829 = null;
            }
        } else if (Statics.field1144 > 1) {
            field829 = null;
        }
    }

    @ObfuscatedName("dz.je(II)V")
    public static void method2291(int arg0) {
        Statics.field917 = new class83();
        Statics.field917.field1158 = field793[arg0];
        Statics.field917.field1157 = field794[arg0];
        Statics.field917.field1156 = field795[arg0];
        Statics.field917.field1159 = field796[arg0];
        Statics.field917.field1160 = field797[arg0];
    }

    @ObfuscatedName("hx.jl(Lhj;I)V")
    public static void method3755(class218 arg0) {
        if (field742 == arg0.field2703) {
            field844[arg0.field2702] = true;
        }
    }

    @ObfuscatedName("bl.jq(B)V")
    public static void method1038() {
        for (class62 var0 = (class62) field817.method5477(); var0 != null; var0 = (class62) field817.method5480()) {
            int var1 = var0.field572;
            if (class218.method3154(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field2557[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2564;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2114;
                    class218 var6 = class218.method1799(var5);
                    if (var6 != null) {
                        method3755(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bn.jk(Lhj;I)Lhj;")
    public static class218 method961(class218 arg0) {
        class218 var1 = arg0;
        int var2 = class219.method489(method4602(arg0));
        class218 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class218.method1799(var1.field2584);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class218 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2646;
        }
        return var5;
    }

    @ObfuscatedName("x.jt(II)V")
    public static final void method132(int arg0) {
        if (!class218.method3154(arg0)) {
            return;
        }
        class218[] var1 = Statics.field2557[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2693 = 0;
                var3.field2585 = 0;
            }
        }
    }

    @ObfuscatedName("iu.jn(IB)V")
    public static final void method3897(int arg0) {
        if (class218.method3154(arg0)) {
            method3757(Statics.field2557[arg0], -1);
        }
    }

    @ObfuscatedName("hf.ji([Lhj;II)V")
    public static final void method3757(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2584 == arg1 && (!var3.field2564 || !method995(var3))) {
                if (var3.field2567 == 0) {
                    if (!var3.field2564 && method995(var3) && Statics.field1060 != var3) {
                        continue;
                    }
                    method3757(arg0, var3.field2689);
                    if (var3.field2676 != null) {
                        method3757(var3.field2676, var3.field2689);
                    }
                    class62 var4 = (class62) field817.method5479((long) var3.field2689);
                    if (var4 != null) {
                        method3897(var4.field572);
                    }
                }
                if (var3.field2567 == 6) {
                    if (var3.field2612 != -1 || var3.field2613 != -1) {
                        boolean var5 = method2011(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2613;
                        } else {
                            var6 = var3.field2612;
                        }
                        if (var6 != -1) {
                            class259 var7 = class259.method67(var6);
                            var3.field2585 += field719;
                            while (var3.field2585 > var7.field3523[var3.field2693]) {
                                var3.field2585 -= var7.field3523[var3.field2693];
                                var3.field2693++;
                                if (var3.field2693 >= var7.field3521.length) {
                                    var3.field2693 -= var7.field3516;
                                    if (var3.field2693 < 0 || var3.field2693 >= var7.field3521.length) {
                                        var3.field2693 = 0;
                                    }
                                }
                                method3755(var3);
                            }
                        }
                    }
                    if (var3.field2576 != 0 && !var3.field2564) {
                        int var8 = var3.field2576 >> 16;
                        int var9 = var3.field2576 << 16 >> 16;
                        int var10 = field719 * var8;
                        int var11 = field719 * var9;
                        var3.field2616 = var3.field2616 + var10 & 0x7FF;
                        var3.field2617 = var3.field2617 + var11 & 0x7FF;
                        method3755(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.jp(IB)V")
    public static final void method110(int arg0) {
        method1038();
        for (class76 var1 = (class76) class76.field1081.method4507(); var1 != null; var1 = (class76) class76.field1081.method4509()) {
            if (var1.field1088 != null) {
                var1.method1656();
            }
        }
        int var2 = class241.method47(arg0).field3207;
        if (var2 == 0) {
            return;
        }
        int var3 = class213.field2526[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class131.method2721(0.9D);
                ((class120) Statics.field1782).method2488(0.9D);
            }
            if (var3 == 2) {
                class131.method2721(0.8D);
                ((class120) Statics.field1782).method2488(0.8D);
            }
            if (var3 == 3) {
                class131.method2721(0.7D);
                ((class120) Statics.field1782).method2488(0.7D);
            }
            if (var3 == 4) {
                class131.method2721(0.6D);
                ((class120) Statics.field1782).method2488(0.6D);
            }
            class255.method4898();
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
            if (field912 != var4) {
                if (field912 == 0 && field890 != -1) {
                    class198.method3196(Statics.field254, field890, 0, var4, false);
                    field700 = false;
                } else if (var4 == 0) {
                    class198.method3235();
                    field700 = false;
                } else if (class198.field2403 == 0) {
                    Statics.field1100.method3379(var4);
                } else {
                    Statics.field530 = var4;
                }
                field912 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field892 = 127;
            }
            if (var3 == 1) {
                field892 = 96;
            }
            if (var3 == 2) {
                field892 = 64;
            }
            if (var3 == 3) {
                field892 = 32;
            }
            if (var3 == 4) {
                field892 = 0;
            }
        }
        if (var2 == 5) {
            field790 = var3;
        }
        if (var2 == 6) {
            field820 = var3;
        }
        if (var2 == 9) {
            field810 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field893 = 127;
            }
            if (var3 == 1) {
                field893 = 96;
            }
            if (var3 == 2) {
                field893 = 64;
            }
            if (var3 == 3) {
                field893 = 32;
            }
            if (var3 == 4) {
                field893 = 0;
            }
        }
        if (var2 == 17) {
            field826 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field679 = (class85) class196.method2257(class85.method3772(), var3);
            if (field679 == null) {
                field679 = class85.field1174;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field782 = -1;
            } else {
                field782 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field680 = (class85) class196.method2257(class85.method3772(), var3);
            if (field680 == null) {
                field680 = class85.field1174;
            }
        }
    }

    @ObfuscatedName("c.jm(Lhj;I)V")
    public static final void method71(class218 arg0) {
        int var1 = arg0.field2569;
        if (var1 == 324) {
            if (field920 == -1) {
                field920 = arg0.field2600;
                field921 = arg0.field2601;
            }
            if (field919.field2536) {
                arg0.field2600 = field920;
            } else {
                arg0.field2600 = field921;
            }
        } else if (var1 == 325) {
            if (field920 == -1) {
                field920 = arg0.field2600;
                field921 = arg0.field2601;
            }
            if (field919.field2536) {
                arg0.field2600 = field921;
            } else {
                arg0.field2600 = field920;
            }
        } else if (var1 == 327) {
            arg0.field2616 = 150;
            arg0.field2617 = (int) (Math.sin((double) field882 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2608 = 5;
            arg0.field2650 = 0;
        } else if (var1 == 328) {
            arg0.field2616 = 150;
            arg0.field2617 = (int) (Math.sin((double) field882 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2608 = 5;
            arg0.field2650 = 1;
        }
    }

    @ObfuscatedName("i.jj(I)V")
    public static final void method59() {
        class188 var0 = class188.method3894(class184.field2224, field881.field1314);
        field881.method2023(var0);
        for (class62 var1 = (class62) field817.method5477(); var1 != null; var1 = (class62) field817.method5480()) {
            if (var1.field570 == 0 || var1.field570 == 3) {
                method3370(var1, true);
            }
        }
        if (field851 != null) {
            method3755(field851);
            field851 = null;
        }
    }

    @ObfuscatedName("gf.jw(Lbo;ZI)V")
    public static final void method3370(class62 arg0, boolean arg1) {
        int var2 = arg0.field572;
        int var3 = (int) arg0.field2114;
        arg0.method3286();
        if (arg1 && var2 != -1 && Statics.field1756[var2]) {
            Statics.field2558.method3788(var2);
            if (Statics.field2557[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2557[var2].length; var5++) {
                    if (Statics.field2557[var2][var5] != null) {
                        if (Statics.field2557[var2][var5].field2567 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2557[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2557[var2] = null;
                }
                Statics.field1756[var2] = false;
            }
        }
        for (class180 var6 = (class180) field858.method5477(); var6 != null; var6 = (class180) field858.method5480()) {
            if ((var6.field2114 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3286();
            }
        }
        class218 var7 = class218.method1799(var3);
        if (var7 != null) {
            method3755(var7);
        }
        for (int var8 = 0; var8 < field792; var8++) {
            if (method6(field795[var8])) {
                if (var8 < field792 - 1) {
                    for (int var9 = var8; var9 < field792 - 1; var9++) {
                        field797[var9] = field797[var9 + 1];
                        field669[var9] = field669[var9 + 1];
                        field795[var9] = field795[var9 + 1];
                        field796[var9] = field796[var9 + 1];
                        field793[var9] = field793[var9 + 1];
                        field794[var9] = field794[var9 + 1];
                        field770[var9] = field770[var9 + 1];
                    }
                }
                var8--;
                field792--;
            }
        }
        method131();
        if (field906 != -1) {
            method161(field906, 1);
        }
    }

    @ObfuscatedName("bn.ja(Lhj;IIIB)V")
    public static final void method960(class218 arg0, int arg1, int arg2, int arg3) {
        method3298();
        class212 var4 = arg0.method3677(false);
        if (var4 == null) {
            return;
        }
        class322.method5524(arg1, arg2, var4.field2520 + arg1, var4.field2523 + arg2);
        if (field653 == 2 || field653 == 5) {
            class322.method5543(arg1, arg2, 0, var4.field2522, var4.field2521);
        } else {
            int var5 = field723 & 0x7FF;
            int var6 = Statics.field658.field1006 / 32 + 48;
            int var7 = 464 - Statics.field658.field950 / 32;
            Statics.field2103.method5660(arg1, arg2, var4.field2520, var4.field2523, var6, var7, var5, 256, var4.field2522, var4.field2521);
            for (int var8 = 0; var8 < field731; var8++) {
                int var9 = field665[var8] * 4 + 2 - Statics.field658.field1006 / 32;
                int var10 = field884[var8] * 4 + 2 - Statics.field658.field950 / 32;
                method1770(arg1, arg2, var9, var10, field787[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class262 var13 = field888[Statics.field373][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field658.field1006 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field658.field950 / 32;
                        method1770(arg1, arg2, var14, var15, Statics.field2747[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field696; var16++) {
                class80 var17 = field695[field697[var16]];
                if (var17 != null && var17.method1045()) {
                    class257 var18 = var17.field1135;
                    if (var18 != null && var18.field3477 != null) {
                        var18 = var18.method4324();
                    }
                    if (var18 != null && var18.field3494 && var18.field3497) {
                        int var19 = var17.field1006 / 32 - Statics.field658.field1006 / 32;
                        int var20 = var17.field950 / 32 - Statics.field658.field950 / 32;
                        method1770(arg1, arg2, var19, var20, Statics.field2747[1], var4);
                    }
                }
            }
            int var21 = class90.field1256;
            int[] var22 = class90.field1258;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field910[var22[var23]];
                if (var24 != null && var24.method1045() && !var24.field629 && Statics.field658 != var24) {
                    int var25 = var24.field1006 / 32 - Statics.field658.field1006 / 32;
                    int var26 = var24.field950 / 32 - Statics.field658.field950 / 32;
                    boolean var27 = false;
                    if (Statics.field658.field633 != 0 && var24.field633 != 0 && Statics.field658.field633 == var24.field633) {
                        var27 = true;
                    }
                    if (var24.method1043()) {
                        method1770(arg1, arg2, var25, var26, Statics.field2747[3], var4);
                    } else if (var27) {
                        method1770(arg1, arg2, var25, var26, Statics.field2747[4], var4);
                    } else if (var24.method1046()) {
                        method1770(arg1, arg2, var25, var26, Statics.field2747[5], var4);
                    } else {
                        method1770(arg1, arg2, var25, var26, Statics.field2747[2], var4);
                    }
                }
            }
            if (field709 != 0 && field882 % 20 < 10) {
                if (field709 == 1 && field825 >= 0 && field825 < field695.length) {
                    class80 var28 = field695[field825];
                    if (var28 != null) {
                        int var29 = var28.field1006 / 32 - Statics.field658.field1006 / 32;
                        int var30 = var28.field950 / 32 - Statics.field658.field950 / 32;
                        method672(arg1, arg2, var29, var30, Statics.field343[1], var4);
                    }
                }
                if (field709 == 2) {
                    int var31 = field738 * 4 - Statics.field2390 * 4 + 2 - Statics.field658.field1006 / 32;
                    int var32 = field778 * 4 - Statics.field2 * 4 + 2 - Statics.field658.field950 / 32;
                    method672(arg1, arg2, var31, var32, Statics.field343[1], var4);
                }
                if (field709 == 10 && field690 >= 0 && field690 < field910.length) {
                    class67 var33 = field910[field690];
                    if (var33 != null) {
                        int var34 = var33.field1006 / 32 - Statics.field658.field1006 / 32;
                        int var35 = var33.field950 / 32 - Statics.field658.field950 / 32;
                        method672(arg1, arg2, var34, var35, Statics.field343[1], var4);
                    }
                }
            }
            if (field886 != 0) {
                int var36 = field886 * 4 + 2 - Statics.field658.field1006 / 32;
                int var37 = field843 * 4 + 2 - Statics.field658.field950 / 32;
                method1770(arg1, arg2, var36, var37, Statics.field343[0], var4);
            }
            if (!Statics.field658.field629) {
                class322.method5539(var4.field2520 / 2 + arg1 - 1, var4.field2523 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field862[arg3] = true;
    }

    @ObfuscatedName("j.jf(Lhj;IIIB)V")
    public static final void method191(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3677(false);
        if (var4 == null) {
            return;
        }
        if (field653 < 3) {
            Statics.field608.method5660(arg1, arg2, var4.field2520, var4.field2523, 25, 25, field723, 256, var4.field2522, var4.field2521);
        } else {
            class322.method5543(arg1, arg2, 0, var4.field2522, var4.field2521);
        }
    }

    @ObfuscatedName("am.jb(IIIILly;Lhg;I)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3, class326 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1770(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field723 & 0x7FF;
        int var8 = class131.field1788[var7];
        int var9 = class131.field1785[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2520 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1973.method5713(arg5.field2520 / 2 + arg0 - var17 / 2 + var15, arg5.field2523 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("be.jo(IIIILly;Lhg;B)V")
    public static final void method1770(int arg0, int arg1, int arg2, int arg3, class326 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field723 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class131.field1788[var6];
        int var9 = class131.field1785[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5666(arg5.field2520 / 2 + var10 - arg4.field3899 / 2, arg5.field2523 / 2 - var11 - arg4.field3905 / 2, arg0, arg1, arg5.field2520, arg5.field2523, arg5.field2522, arg5.field2521);
        } else {
            arg4.method5646(arg5.field2520 / 2 + arg0 + var10 - arg4.field3899 / 2, arg5.field2523 / 2 + arg1 - var11 - arg4.field3905 / 2);
        }
    }

    @ObfuscatedName("dd.jz(B)V")
    public static final void method2715() {
        for (int var0 = 0; var0 < class90.field1256; var0++) {
            class67 var1 = field910[class90.field1258[var0]];
            var1.method1044();
        }
        Iterator var2 = class92.field1278.iterator();
        while (var2.hasNext()) {
            class65 var3 = (class65) var2.next();
            var3.method1020();
        }
        if (Statics.field411 != null) {
            Statics.field411.method4816();
        }
    }

    @ObfuscatedName("e.jg(I)V")
    public static final void method19() {
        class92.method3116();
        if (Statics.field411 != null) {
            Statics.field411.method4821();
        }
    }

    @ObfuscatedName("jn.jy(I)V")
    public static final void method4601() {
        field850 = field674;
        Statics.field50 = true;
    }

    @ObfuscatedName("dv.jc(Ljava/lang/String;I)V")
    public static final void method2599(String arg0) {
        if (Statics.field411 != null) {
            class188 var1 = class188.method3894(class184.field2217, field881.field1314);
            var1.field2334.method5228(class301.method3582(arg0));
            var1.field2334.method5058(arg0);
            field881.method2023(var1);
        }
    }

    @ObfuscatedName("bl.jv(Ljava/lang/String;I)V")
    public static final void method1032(String arg0) {
        if (!arg0.equals("")) {
            class188 var1 = class188.method3894(class184.field2287, field881.field1314);
            var1.field2334.method5228(class301.method3582(arg0));
            var1.field2334.method5058(arg0);
            field881.method2023(var1);
        }
    }

    @ObfuscatedName("bh.js(B)V")
    public static final void method951() {
        class188 var0 = class188.method3894(class184.field2287, field881.field1314);
        var0.field2334.method5228(0);
        field881.method2023(var0);
    }

    @ObfuscatedName("ji.jx(Lhj;I)I")
    public static int method4602(class218 arg0) {
        class180 var1 = (class180) field858.method5479(((long) arg0.field2689 << 32) + (long) arg0.field2566);
        return var1 == null ? arg0.field2670 : var1.field2112;
    }

    @ObfuscatedName("bb.kc(Lhj;I)Z")
    public static boolean method995(class218 arg0) {
        return arg0.field2707;
    }

    @ObfuscatedName("ec.kj(Lhj;IS)Ljava/lang/String;")
    public static String method3118(class218 arg0, int arg1) {
        int var2 = method4602(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2657 == null) {
            return null;
        } else if (arg0.field2645 == null || arg0.field2645.length <= arg1 || arg0.field2645[arg1] == null || arg0.field2645[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2645[arg1];
        }
    }

    @ObfuscatedName("kd.ka(Lhj;B)Ljava/lang/String;")
    public static String method4899(class218 arg0) {
        if (class219.method1787(method4602(arg0)) == 0) {
            return null;
        } else if (arg0.field2658 == null || arg0.field2658.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2658;
        }
    }

    @ObfuscatedName("gu.ko(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3343(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field704 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field704 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field704 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field704 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field704 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field3696 != null) {
            var3 = "/p=" + Statics.field3696;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field529 + "/a=" + Statics.field3200 + var3 + "/";
    }

    @ObfuscatedName("v.kk(Ljava/lang/String;B)V")
    public static void method141(String arg0) {
        Statics.field3696 = arg0;
        try {
            String var1 = Statics.field234.getParameter(class272.field3588.field3598);
            String var2 = Statics.field234.getParameter(class272.field3595.field3598);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class298.method3576() + 94608000000L;
                class208.field2505.setTime(new Date(var6));
                int var8 = class208.field2505.get(7);
                int var9 = class208.field2505.get(5);
                int var10 = class208.field2505.get(2);
                int var11 = class208.field2505.get(1);
                int var12 = class208.field2505.get(11);
                int var13 = class208.field2505.get(12);
                int var14 = class208.field2505.get(13);
                String var15 = class208.field2506[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class208.field2504[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field234;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("z.kv(Ljava/lang/String;ZB)V")
    public static void method267(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3456; var5++) {
            class255 var6 = class255.method348(var5);
            if ((!arg1 || var6.field3453) && var6.field3445 == -1 && var6.field3450.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field3503 = -1;
                    Statics.field337 = null;
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
        Statics.field337 = var3;
        Statics.field281 = 0;
        Statics.field3503 = var4;
        String[] var9 = new String[Statics.field3503];
        for (int var10 = 0; var10 < Statics.field3503; var10++) {
            var9[var10] = class255.method348(var3[var10]).field3450;
        }
        class190.method1812(var9, Statics.field337);
    }

    @ObfuscatedName("av.kd(Lkf;II)V")
    public static void method351(class301 arg0, int arg1) {
        byte[] var2 = arg0.field3731;
        if (field694 == null) {
            field694 = new byte[24];
        }
        class302.method5325(var2, arg1, field694, 0, 24);
        if (class168.field2041 == null) {
            return;
        }
        try {
            class168.field2041.method6037(0L);
            class168.field2041.method6040(arg0.field3731, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("client.ku(B)Ljv;")
    public class284 method1119() {
        return Statics.field658 == null ? null : Statics.field658.field622;
    }

    @ObfuscatedName("as.kz(IIIZI)V")
    public static void method362(int arg0, int arg1, int arg2, boolean arg3) {
        class188 var4 = class188.method3894(class184.field2297, field881.field1314);
        var4.field2334.method5112(arg3 ? field856 : 0);
        var4.field2334.method5207(arg1);
        var4.field2334.method5094(arg2);
        var4.field2334.method5052(arg0);
        field881.method2023(var4);
    }

    @ObfuscatedName("gd.ke(II)V")
    public static void method3350(int arg0) {
        field728 = arg0;
    }

    @ObfuscatedName("ak.kn(B)V")
    public static void method667() {
        field881.method2023(class188.method3894(class184.field2241, field881.field1314));
        field728 = 0;
    }

    @ObfuscatedName("bq.kh(B)V")
    public static void method1505() {
        if (field728 == 1) {
            field737 = true;
        }
    }

    @ObfuscatedName("hj.kq(I)V")
    public static void method3727() {
        if (!field737 || Statics.field658 == null) {
            return;
        }
        int var0 = Statics.field658.field995[0];
        int var1 = Statics.field658.field963[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field500 = Statics.field658.field1006;
        int var2 = method992(Statics.field658.field1006, Statics.field658.field950, Statics.field373) - field729;
        if (var2 < Statics.field730) {
            Statics.field730 = var2;
        }
        Statics.field228 = Statics.field658.field950;
        field737 = false;
    }

    @ObfuscatedName("c.kx(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method80(String arg0) {
        class229[] var1 = class229.method3130();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class229 var3 = var1[var2];
            if (var3.field3091 != -1 && arg0.startsWith(class82.method491(var3.field3091))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3091).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bv.kf(I)V")
    public static void method1662() {
        if (Statics.field945 == null) {
            return;
        }
        field925 = field882;
        Statics.field945.method3939();
        for (int var0 = 0; var0 < field910.length; var0++) {
            if (field910[var0] != null) {
                Statics.field945.method3935((field910[var0].field1006 >> 7) + Statics.field2390, (field910[var0].field950 >> 7) + Statics.field2);
            }
        }
    }
}

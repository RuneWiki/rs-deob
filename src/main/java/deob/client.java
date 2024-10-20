package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 implements class278 {

    @ObfuscatedName("client.w")
    public static class167[] field1017 = new class167[4];

    @ObfuscatedName("client.al")
    public static boolean field914 = true;

    @ObfuscatedName("client.bw")
    public static int field996 = 1;

    @ObfuscatedName("client.bt")
    public static int field824 = 0;

    @ObfuscatedName("client.bq")
    public static int field958 = 0;

    @ObfuscatedName("client.bn")
    public static boolean field902 = false;

    @ObfuscatedName("client.bb")
    public static boolean field827 = false;

    @ObfuscatedName("client.bm")
    public static int field828 = 0;

    @ObfuscatedName("client.bs")
    public static int field830 = 0;

    @ObfuscatedName("client.be")
    public static boolean field831 = true;

    @ObfuscatedName("client.bk")
    public static int field832 = 0;

    @ObfuscatedName("client.bd")
    public static long field833 = -1L;

    @ObfuscatedName("client.bo")
    public static int field1066 = -1;

    @ObfuscatedName("client.bc")
    public static int field835 = -1;

    @ObfuscatedName("client.bv")
    public static int field916 = -1;

    @ObfuscatedName("client.ba")
    public static boolean field846 = true;

    @ObfuscatedName("client.bx")
    public static boolean field997 = false;

    @ObfuscatedName("client.bj")
    public static int field905 = 0;

    @ObfuscatedName("client.bi")
    public static int field840 = 0;

    @ObfuscatedName("client.bh")
    public static int field841 = 0;

    @ObfuscatedName("client.cx")
    public static int field998 = 0;

    @ObfuscatedName("client.cv")
    public static int field1049 = 0;

    @ObfuscatedName("client.cc")
    public static int field1018 = 0;

    @ObfuscatedName("client.cg")
    public static int field845 = 0;

    @ObfuscatedName("client.cw")
    public static int field869 = 0;

    @ObfuscatedName("client.ch")
    public static int field847 = 0;

    @ObfuscatedName("client.ct")
    public static class89 field900 = class89.field1296;

    @ObfuscatedName("client.cl")
    public static class89 field850 = class89.field1296;

    @ObfuscatedName("client.cu")
    public static int field851 = 0;

    @ObfuscatedName("client.cm")
    public static int field975 = 0;

    @ObfuscatedName("client.cn")
    public static int field854 = 0;

    @ObfuscatedName("client.di")
    public static int field1054 = 0;

    @ObfuscatedName("client.da")
    public static int field944 = 0;

    @ObfuscatedName("client.ds")
    public static int field1079 = 0;

    @ObfuscatedName("client.dm")
    public static int field844 = 0;

    @ObfuscatedName("client.dw")
    public static int field1037 = 0;

    @ObfuscatedName("client.dj")
    public static class149 field861 = class149.field2076;

    @ObfuscatedName("client.dx")
    public static byte[] field1016 = null;

    @ObfuscatedName("client.dt")
    public static class84[] field837 = new class84[32768];

    @ObfuscatedName("client.dv")
    public static int field864 = 0;

    @ObfuscatedName("client.dz")
    public static int[] field865 = new int[32768];

    @ObfuscatedName("client.dd")
    public static int field866 = 0;

    @ObfuscatedName("client.en")
    public static int[] field867 = new int[250];

    @ObfuscatedName("client.ea")
    public static final class99 field868 = new class99();

    @ObfuscatedName("client.ey")
    public static int field1044 = 0;

    @ObfuscatedName("client.ee")
    public static boolean field870 = false;

    @ObfuscatedName("client.em")
    public static boolean field871 = true;

    @ObfuscatedName("client.ec")
    public static class300 field1077 = new class300();

    @ObfuscatedName("client.ek")
    public static HashMap field873 = new HashMap();

    @ObfuscatedName("client.ev")
    public static int field874 = 0;

    @ObfuscatedName("client.ex")
    public static int field875 = 1;

    @ObfuscatedName("client.ez")
    public static int field876 = 0;

    @ObfuscatedName("client.ef")
    public static int field1069 = 1;

    @ObfuscatedName("client.ed")
    public static int field878 = 0;

    @ObfuscatedName("client.fl")
    public static boolean field1005 = false;

    @ObfuscatedName("client.fx")
    public static int[][][] field881 = new int[4][13][13];

    @ObfuscatedName("client.fb")
    public static final int[] field1071 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fd")
    public static int field883 = 0;

    @ObfuscatedName("client.fm")
    public static int field886 = 2301979;

    @ObfuscatedName("client.ff")
    public static int field885 = 5063219;

    @ObfuscatedName("client.ge")
    public static int field926 = 3353893;

    @ObfuscatedName("client.gv")
    public static int field887 = 7759444;

    @ObfuscatedName("client.gj")
    public static boolean field959 = false;

    @ObfuscatedName("client.gg")
    public static int field889 = 0;

    @ObfuscatedName("client.go")
    public static int field890 = 128;

    @ObfuscatedName("client.gq")
    public static int field853 = 0;

    @ObfuscatedName("client.ga")
    public static int field892 = 0;

    @ObfuscatedName("client.gn")
    public static int field893 = 0;

    @ObfuscatedName("client.gz")
    public static int field894 = 0;

    @ObfuscatedName("client.gh")
    public static int field838 = 0;

    @ObfuscatedName("client.gs")
    public static int field896 = 50;

    @ObfuscatedName("client.gm")
    public static int field1078 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field898 = false;

    @ObfuscatedName("client.gk")
    public static int field899 = 0;

    @ObfuscatedName("client.gw")
    public static int field825 = 0;

    @ObfuscatedName("client.gy")
    public static int field901 = 50;

    @ObfuscatedName("client.gf")
    public static int[] field911 = new int[field901];

    @ObfuscatedName("client.gb")
    public static int[] field903 = new int[field901];

    @ObfuscatedName("client.gu")
    public static int[] field904 = new int[field901];

    @ObfuscatedName("client.hd")
    public static int[] field862 = new int[field901];

    @ObfuscatedName("client.hw")
    public static int[] field906 = new int[field901];

    @ObfuscatedName("client.hp")
    public static int[] field888 = new int[field901];

    @ObfuscatedName("client.hg")
    public static int[] field908 = new int[field901];

    @ObfuscatedName("client.hc")
    public static String[] field920 = new String[field901];

    @ObfuscatedName("client.hh")
    public static int[][] field910 = new int[104][104];

    @ObfuscatedName("client.hr")
    public static int field822 = 0;

    @ObfuscatedName("client.hq")
    public static int field907 = -1;

    @ObfuscatedName("client.hz")
    public static int field913 = -1;

    @ObfuscatedName("client.hm")
    public static int field945 = 0;

    @ObfuscatedName("client.hf")
    public static int field921 = 0;

    @ObfuscatedName("client.hl")
    public static int field872 = 0;

    @ObfuscatedName("client.hk")
    public static int field917 = 0;

    @ObfuscatedName("client.hb")
    public static int field882 = 0;

    @ObfuscatedName("client.hn")
    public static int field933 = 0;

    @ObfuscatedName("client.hv")
    public static int field1003 = 0;

    @ObfuscatedName("client.ho")
    public static int field915 = 0;

    @ObfuscatedName("client.hs")
    public static int field1045 = 0;

    @ObfuscatedName("client.hx")
    public static int field923 = 0;

    @ObfuscatedName("client.he")
    public static boolean field924 = false;

    @ObfuscatedName("client.ha")
    public static int field925 = 0;

    @ObfuscatedName("client.hy")
    public static int field1040 = 0;

    @ObfuscatedName("client.iq")
    public static class72[] field927 = new class72[2048];

    @ObfuscatedName("client.ig")
    public static int field928 = -1;

    @ObfuscatedName("client.iv")
    public static int field929 = 0;

    @ObfuscatedName("client.it")
    public static String field962 = null;

    @ObfuscatedName("client.ia")
    public static int field930 = 0;

    @ObfuscatedName("client.iu")
    public static int[] field931 = new int[1000];

    @ObfuscatedName("client.ic")
    public static final int[] field932 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.if")
    public static String[] field985 = new String[8];

    @ObfuscatedName("client.ik")
    public static boolean[] field934 = new boolean[8];

    @ObfuscatedName("client.iy")
    public static int[] field935 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.io")
    public static int field936 = -1;

    @ObfuscatedName("client.is")
    public static class205[][][] field937 = new class205[4][104][104];

    @ObfuscatedName("client.ih")
    public static class205 field938 = new class205();

    @ObfuscatedName("client.ip")
    public static class205 field939 = new class205();

    @ObfuscatedName("client.iw")
    public static class205 field940 = new class205();

    @ObfuscatedName("client.il")
    public static int[] field941 = new int[25];

    @ObfuscatedName("client.ib")
    public static int[] field942 = new int[25];

    @ObfuscatedName("client.ie")
    public static int[] field943 = new int[25];

    @ObfuscatedName("client.in")
    public static int field1050 = 0;

    @ObfuscatedName("client.ij")
    public static boolean field839 = false;

    @ObfuscatedName("client.jg")
    public static int field946 = 0;

    @ObfuscatedName("client.jv")
    public static int[] field947 = new int[500];

    @ObfuscatedName("client.jj")
    public static int[] field948 = new int[500];

    @ObfuscatedName("client.jl")
    public static int[] field949 = new int[500];

    @ObfuscatedName("client.jp")
    public static int[] field919 = new int[500];

    @ObfuscatedName("client.jn")
    public static String[] field951 = new String[500];

    @ObfuscatedName("client.jm")
    public static String[] field952 = new String[500];

    @ObfuscatedName("client.jy")
    public static boolean[] field884 = new boolean[500];

    @ObfuscatedName("client.ju")
    public static boolean field954 = false;

    @ObfuscatedName("client.ja")
    public static boolean field955 = false;

    @ObfuscatedName("client.jt")
    public static int field956 = -1;

    @ObfuscatedName("client.jh")
    public static int field1026 = -1;

    @ObfuscatedName("client.jc")
    public static int field1012 = 0;

    @ObfuscatedName("client.jk")
    public static int field1004 = 50;

    @ObfuscatedName("client.jb")
    public static int field960 = 0;

    @ObfuscatedName("client.je")
    public static boolean field963 = false;

    @ObfuscatedName("client.kb")
    public static int field964 = -1;

    @ObfuscatedName("client.kl")
    public static int field965 = -1;

    @ObfuscatedName("client.ks")
    public static String field1002 = null;

    @ObfuscatedName("client.ke")
    public static String field967 = null;

    @ObfuscatedName("client.kj")
    public static int field968 = -1;

    @ObfuscatedName("client.kc")
    public static class202 field969 = new class202(8);

    @ObfuscatedName("client.ki")
    public static int field1043 = 0;

    @ObfuscatedName("client.km")
    public static int field971 = 0;

    @ObfuscatedName("client.ku")
    public static class228 field972 = null;

    @ObfuscatedName("client.kg")
    public static int field973 = 0;

    @ObfuscatedName("client.kq")
    public static int field974 = 0;

    @ObfuscatedName("client.kv")
    public static int field957 = 0;

    @ObfuscatedName("client.ka")
    public static int field891 = -1;

    @ObfuscatedName("client.kx")
    public static boolean field977 = false;

    @ObfuscatedName("client.kw")
    public static boolean field978 = false;

    @ObfuscatedName("client.kf")
    public static boolean field979 = false;

    @ObfuscatedName("client.kt")
    public static class228 field980 = null;

    @ObfuscatedName("client.ky")
    public static class228 field981 = null;

    @ObfuscatedName("client.kk")
    public static class228 field982 = null;

    @ObfuscatedName("client.kn")
    public static int field983 = 0;

    @ObfuscatedName("client.kh")
    public static int field984 = 0;

    @ObfuscatedName("client.ko")
    public static class228 field859 = null;

    @ObfuscatedName("client.kp")
    public static boolean field986 = false;

    @ObfuscatedName("client.kr")
    public static int field987 = -1;

    @ObfuscatedName("client.li")
    public static int field988 = -1;

    @ObfuscatedName("client.ld")
    public static boolean field989 = false;

    @ObfuscatedName("client.le")
    public static int field990 = -1;

    @ObfuscatedName("client.ls")
    public static int field991 = -1;

    @ObfuscatedName("client.lk")
    public static boolean field992 = false;

    @ObfuscatedName("client.lw")
    public static int field993 = 1;

    @ObfuscatedName("client.lx")
    public static int[] field994 = new int[32];

    @ObfuscatedName("client.lo")
    public static int field995 = 0;

    @ObfuscatedName("client.lm")
    public static int[] field877 = new int[32];

    @ObfuscatedName("client.lf")
    public static int field1074 = 0;

    @ObfuscatedName("client.lu")
    public static int[] field1060 = new int[32];

    @ObfuscatedName("client.ly")
    public static int field999 = 0;

    @ObfuscatedName("client.lc")
    public static int field1000 = 0;

    @ObfuscatedName("client.la")
    public static int field1001 = 0;

    @ObfuscatedName("client.lr")
    public static int field950 = 0;

    @ObfuscatedName("client.ll")
    public static int field1022 = 0;

    @ObfuscatedName("client.lt")
    public static int field860 = 0;

    @ObfuscatedName("client.lg")
    public static int field863 = 0;

    @ObfuscatedName("client.mg")
    public static int field1006 = 0;

    @ObfuscatedName("client.mt")
    public static class205 field1007 = new class205();

    @ObfuscatedName("client.mi")
    public static class205 field1008 = new class205();

    @ObfuscatedName("client.mv")
    public static class205 field918 = new class205();

    @ObfuscatedName("client.ms")
    public static class202 field1010 = new class202(512);

    @ObfuscatedName("client.me")
    public static int field1011 = 0;

    @ObfuscatedName("client.ma")
    public static int field1025 = -2;

    @ObfuscatedName("client.mj")
    public static boolean[] field1013 = new boolean[100];

    @ObfuscatedName("client.mq")
    public static boolean[] field1014 = new boolean[100];

    @ObfuscatedName("client.mx")
    public static boolean[] field834 = new boolean[100];

    @ObfuscatedName("client.mk")
    public static int[] field1027 = new int[100];

    @ObfuscatedName("client.mp")
    public static int[] field826 = new int[100];

    @ObfuscatedName("client.mz")
    public static int[] field836 = new int[100];

    @ObfuscatedName("client.md")
    public static int[] field922 = new int[100];

    @ObfuscatedName("client.my")
    public static int field1020 = 0;

    @ObfuscatedName("client.mu")
    public static long field1021 = 0L;

    @ObfuscatedName("client.mf")
    public static boolean field879 = true;

    @ObfuscatedName("client.mn")
    public static int[] field1023 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.mc")
    public static int field1024 = 0;

    @ObfuscatedName("client.ne")
    public static int field976 = 0;

    @ObfuscatedName("client.na")
    public static String field858 = "";

    @ObfuscatedName("client.nu")
    public static long[] field966 = new long[100];

    @ObfuscatedName("client.nc")
    public static int field1028 = 0;

    @ObfuscatedName("client.ni")
    public static int field1029 = 0;

    @ObfuscatedName("client.nz")
    public static int[] field1030 = new int[128];

    @ObfuscatedName("client.nn")
    public static int[] field1031 = new int[128];

    @ObfuscatedName("client.nf")
    public static long field823 = -1L;

    @ObfuscatedName("client.nw")
    public static int field953 = -1;

    @ObfuscatedName("client.nh")
    public static int field1034 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field1035 = new int[1000];

    @ObfuscatedName("client.np")
    public static int[] field1036 = new int[1000];

    @ObfuscatedName("client.no")
    public static class310[] field970 = new class310[1000];

    @ObfuscatedName("client.nm")
    public static int field1038 = 0;

    @ObfuscatedName("client.nb")
    public static int field1039 = 0;

    @ObfuscatedName("client.nl")
    public static int field1051 = 0;

    @ObfuscatedName("client.oi")
    public static int field1041 = 255;

    @ObfuscatedName("client.op")
    public static int field1042 = -1;

    @ObfuscatedName("client.on")
    public static boolean field1015 = false;

    @ObfuscatedName("client.ok")
    public static int field1009 = 127;

    @ObfuscatedName("client.ob")
    public static int field880 = 127;

    @ObfuscatedName("client.ot")
    public static int field1046 = 0;

    @ObfuscatedName("client.oj")
    public static int[] field1047 = new int[50];

    @ObfuscatedName("client.ov")
    public static int[] field1048 = new int[50];

    @ObfuscatedName("client.oe")
    public static int[] field895 = new int[50];

    @ObfuscatedName("client.of")
    public static int[] field843 = new int[50];

    @ObfuscatedName("client.oh")
    public static class103[] field856 = new class103[50];

    @ObfuscatedName("client.ou")
    public static boolean field1052 = false;

    @ObfuscatedName("client.pj")
    public static boolean[] field1053 = new boolean[5];

    @ObfuscatedName("client.pc")
    public static int[] field909 = new int[5];

    @ObfuscatedName("client.pb")
    public static int[] field1055 = new int[5];

    @ObfuscatedName("client.pe")
    public static int[] field1056 = new int[5];

    @ObfuscatedName("client.pk")
    public static int[] field1057 = new int[5];

    @ObfuscatedName("client.pl")
    public static short field1058 = 256;

    @ObfuscatedName("client.pn")
    public static short field1059 = 205;

    @ObfuscatedName("client.pz")
    public static short field857 = 256;

    @ObfuscatedName("client.pd")
    public static short field1061 = 320;

    @ObfuscatedName("client.ps")
    public static short field1062 = 1;

    @ObfuscatedName("client.pw")
    public static short field1063 = 32767;

    @ObfuscatedName("client.ph")
    public static short field1064 = 1;

    @ObfuscatedName("client.pu")
    public static short field1065 = 32767;

    @ObfuscatedName("client.po")
    public static int field1075 = 0;

    @ObfuscatedName("client.pa")
    public static int field1067 = 0;

    @ObfuscatedName("client.pf")
    public static int field1068 = 0;

    @ObfuscatedName("client.pr")
    public static int field912 = 0;

    @ObfuscatedName("client.pp")
    public static int field1070 = 0;

    @ObfuscatedName("client.pq")
    public static class225 field1082 = new class225();

    @ObfuscatedName("client.px")
    public static int field1072 = -1;

    @ObfuscatedName("client.py")
    public static int field1073 = -1;

    @ObfuscatedName("client.qx")
    public static class17[] field1019 = new class17[8];

    @ObfuscatedName("client.qo")
    public static class73 field842 = new class73();

    @ObfuscatedName("client.qk")
    public static ArrayList field1076 = new ArrayList(10);

    @ObfuscatedName("client.qj")
    public static int field1032 = 0;

    @ObfuscatedName("client.qc")
    public static final class71 field897 = new class71();

    @ObfuscatedName("client.qe")
    public static int[] field849 = new int[50];

    @ObfuscatedName("client.qv")
    public static int[] field1080 = new int[50];

    @ObfuscatedName("n.fx(I)Lli;")
    public static class313 method89() {
        return Statics.field711;
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method825() {
    }

    public final void init() {
        if (!this.method746()) {
            return;
        }
        class299[] var1 = class299.method4933();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class299 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3812);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3812)) {
                    case 1:
                        Statics.field702 = var4;
                        break;
                    case 2:
                        field828 = Integer.parseInt(var4);
                        break;
                    case 3:
                        field996 = Integer.parseInt(var4);
                        break;
                    case 4:
                        Statics.field829 = var4;
                        break;
                    case 5:
                        int var5 = Integer.parseInt(var4);
                        class243[] var6 = new class243[] { class243.field3261, class243.field3264, class243.field3262, class243.field3260 };
                        class243[] var7 = var6;
                        int var8 = 0;
                        class243 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class243 var9 = var7[var8];
                            if (var9.field3259 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field473 = var10;
                        break;
                    case 6:
                        Statics.field262 = (class244) class180.method4646(class244.method1868(), Integer.parseInt(var4));
                        if (Statics.field262 == class244.field3273) {
                            Statics.field459 = class314.field3963;
                        } else {
                            Statics.field459 = class314.field3956;
                        }
                    case 7:
                    case 10:
                    case 11:
                    default:
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class86.field1271)) {
                            field902 = true;
                        } else {
                            field902 = false;
                        }
                        break;
                    case 9:
                        field871 = Integer.parseInt(var4) != 0;
                        break;
                    case 12:
                        field824 = Integer.parseInt(var4);
                        break;
                    case 13:
                        if (var4.equalsIgnoreCase(class86.field1271)) {
                        }
                        break;
                    case 14:
                        Statics.field478 = Integer.parseInt(var4);
                        break;
                    case 15:
                        Statics.field2082 = Integer.parseInt(var4);
                        break;
                    case 16:
                        field958 = Integer.parseInt(var4);
                }
            }
        }
        class137.field1971 = false;
        field827 = false;
        Statics.field1928 = this.getCodeBase().getHost();
        String var11 = Statics.field473.field3263;
        byte var12 = 0;
        try {
            Statics.field2122 = 17;
            Statics.field546 = var12;
            try {
                Statics.field3248 = System.getProperty("os.name");
            } catch (Exception var37) {
                Statics.field3248 = "Unknown";
            }
            Statics.field1884 = Statics.field3248.toLowerCase();
            try {
                Statics.field3824 = System.getProperty("user.home");
                if (Statics.field3824 != null) {
                    Statics.field3824 = Statics.field3824 + "/";
                }
            } catch (Exception var36) {
            }
            try {
                if (Statics.field1884.startsWith("win")) {
                    if (Statics.field3824 == null) {
                        Statics.field3824 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field3824 == null) {
                    Statics.field3824 = System.getenv("HOME");
                }
                if (Statics.field3824 != null) {
                    Statics.field3824 = Statics.field3824 + "/";
                }
            } catch (Exception var35) {
            }
            if (Statics.field3824 == null) {
                Statics.field3824 = "~/";
            }
            Statics.field336 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3824, "/tmp/", "" };
            Statics.field491 = new String[] { ".jagex_cache_" + Statics.field546, ".file_store_" + Statics.field546 };
            label169: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field3770 = class158.method3328("oldschool", var11, var16);
                if (!Statics.field3770.exists()) {
                    Statics.field3770.mkdirs();
                }
                File[] var17 = Statics.field3770.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label169;
                    }
                    File var20 = var18[var19];
                    boolean var23;
                    try {
                        RandomAccessFile var21 = new RandomAccessFile(var20, "rw");
                        int var22 = var21.read();
                        var21.seek(0L);
                        var21.write(var22);
                        var21.seek(0L);
                        var21.close();
                        var23 = true;
                    } catch (Exception var34) {
                        var23 = false;
                    }
                    if (!var23) {
                        break;
                    }
                    var19++;
                }
            }
            class161.method4027(Statics.field3770);
            try {
                File var25 = new File(Statics.field3824, "random.dat");
                if (var25.exists()) {
                    class158.field2124 = new class121(new class122(var25, "rw", 25L), 24, 0);
                } else {
                    label148: for (int var26 = 0; var26 < Statics.field491.length; var26++) {
                        for (int var27 = 0; var27 < Statics.field336.length; var27++) {
                            File var28 = new File(Statics.field336[var27] + Statics.field491[var26] + File.separatorChar + "random.dat");
                            if (var28.exists()) {
                                class158.field2124 = new class121(new class122(var28, "rw", 25L), 24, 0);
                                break label148;
                            }
                        }
                    }
                }
                if (class158.field2124 == null) {
                    RandomAccessFile var29 = new RandomAccessFile(var25, "rw");
                    int var30 = var29.read();
                    var29.seek(0L);
                    var29.write(var30);
                    var29.seek(0L);
                    var29.close();
                    class158.field2124 = new class121(new class122(var25, "rw", 25L), 24, 0);
                }
            } catch (IOException var38) {
            }
            class158.field2125 = new class121(new class122(class161.method214("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class158.field2126 = new class121(new class122(class161.method214("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field16 = new class121[Statics.field2122];
            for (int var32 = 0; var32 < Statics.field2122; var32++) {
                Statics.field16[var32] = new class121(new class122(class161.method214("main_file_cache.idx" + var32), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var39) {
            class155.method1770((String) null, var39);
        }
        Statics.field481 = this;
        this.method744(765, 503, 162);
    }

    @ObfuscatedName("client.ah(I)V")
    public final void method756() {
        class186.method4166(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field765 = field958 == 0 ? 43594 : field996 + 40000;
        Statics.field251 = field958 == 0 ? 443 : field996 + 50000;
        Statics.field726 = Statics.field765;
        Statics.field420 = class226.field2711;
        Statics.field785 = class226.field2717;
        Statics.field246 = class226.field2713;
        Statics.field3891 = class226.field2714;
        Statics.field722 = new class147();
        this.method757();
        this.method739();
        Statics.field766 = this.method858();
        Statics.field2933 = new class165(255, class158.field2125, class158.field2126, 500000);
        Statics.field2688 = class78.method48();
        this.method736();
        class57.method333(this, Statics.field1548);
        if (field958 != 0) {
            field997 = true;
        }
        method1659(Statics.field2688.field1190);
        Statics.field2282 = new class79(Statics.field459);
    }

    @ObfuscatedName("client.ai(I)V")
    public final void method758() {
        field832++;
        this.method1098();
        class248.method925();
        class215.method1750();
        method4774();
        class51 var1 = class51.field584;
        synchronized (class51.field584) {
            class51.field571++;
            class51.field594 = class51.field596;
            class51.field593 = 0;
            if (class51.field589 >= 0) {
                while (class51.field589 != class51.field588) {
                    int var3 = class51.field587[class51.field588];
                    class51.field588 = class51.field588 + 1 & 0x7F;
                    if (var3 < 0) {
                        class51.field586[~var3] = false;
                    } else {
                        if (!class51.field586[var3] && class51.field593 < class51.field592.length - 1) {
                            class51.field592[++class51.field593 - 1] = var3;
                        }
                        class51.field586[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class51.field586[var2] = false;
                }
                class51.field589 = class51.field588;
            }
            if (class51.field593 > 0) {
                class51.field571 = 0;
            }
            class51.field596 = class51.field591;
        }
        class60 var5 = class60.field670;
        synchronized (class60.field670) {
            class60.field667 = class60.field666;
            class60.field662 = class60.field668;
            class60.field672 = class60.field669;
            class60.field677 = class60.field679;
            class60.field678 = class60.field674;
            class60.field671 = class60.field675;
            class60.field673 = class60.field676;
            class60.field679 = 0;
        }
        if (Statics.field766 != null) {
            int var7 = Statics.field766.method638();
            field1006 = var7;
        }
        if (field830 == 0) {
            method996();
            class59.method981();
        } else if (field830 == 5) {
            class90.method25(this);
            method996();
            class59.method981();
        } else if (field830 == 10 || field830 == 11) {
            class90.method25(this);
        } else if (field830 == 20) {
            class90.method25(this);
            this.method1101();
        } else if (field830 == 25) {
            method156(false);
            field874 = 0;
            boolean var8 = true;
            for (int var9 = 0; var9 < Statics.field2438.length; var9++) {
                if (Statics.field1919[var9] != -1 && Statics.field2438[var9] == null) {
                    Statics.field2438[var9] = Statics.field3722.method4032(Statics.field1919[var9], 0);
                    if (Statics.field2438[var9] == null) {
                        var8 = false;
                        field874++;
                    }
                }
                if (Statics.field20[var9] != -1 && Statics.field2133[var9] == null) {
                    Statics.field2133[var9] = Statics.field3722.method4033(Statics.field20[var9], 0, Statics.field1223[var9]);
                    if (Statics.field2133[var9] == null) {
                        var8 = false;
                        field874++;
                    }
                }
            }
            if (var8) {
                field876 = 0;
                boolean var10 = true;
                for (int var11 = 0; var11 < Statics.field2438.length; var11++) {
                    byte[] var12 = Statics.field2133[var11];
                    if (var12 != null) {
                        int var13 = (Statics.field1651[var11] >> 8) * 64 - Statics.field407;
                        int var14 = (Statics.field1651[var11] & 0xFF) * 64 - Statics.field1272;
                        if (field1005) {
                            var13 = 10;
                            var14 = 10;
                        }
                        boolean var16 = true;
                        class185 var17 = new class185(var12);
                        int var18 = -1;
                        label1212: while (true) {
                            int var19 = var17.method3136();
                            if (var19 == 0) {
                                var10 &= var16;
                                break;
                            }
                            var18 += var19;
                            int var20 = 0;
                            boolean var21 = false;
                            while (true) {
                                while (!var21) {
                                    int var23 = var17.method3136();
                                    if (var23 == 0) {
                                        continue label1212;
                                    }
                                    var20 += var23 - 1;
                                    int var24 = var20 & 0x3F;
                                    int var25 = var20 >> 6 & 0x3F;
                                    int var26 = var17.method3197() >> 2;
                                    int var27 = var13 + var25;
                                    int var28 = var14 + var24;
                                    if (var27 > 0 && var28 > 0 && var27 < 103 && var28 < 103) {
                                        class267 var29 = class267.method2363(var18);
                                        if (var26 != 22 || !field827 || var29.field3515 != 0 || var29.field3513 == 1 || var29.field3496) {
                                            if (!var29.method4472()) {
                                                field876++;
                                                var16 = false;
                                            }
                                            var21 = true;
                                        }
                                    }
                                }
                                int var22 = var17.method3136();
                                if (var22 == 0) {
                                    break;
                                }
                                var17.method3197();
                            }
                        }
                    }
                }
                if (var10) {
                    if (field878 != 0) {
                        method993(class237.field3098 + class86.field1275 + class86.field1277 + 100 + "%" + class86.field1273, true);
                    }
                    method4774();
                    method47();
                    method4774();
                    Statics.field569.method2616();
                    method4774();
                    System.gc();
                    for (int var31 = 0; var31 < 4; var31++) {
                        field1017[var31].method2975();
                    }
                    for (int var32 = 0; var32 < 4; var32++) {
                        for (int var33 = 0; var33 < 104; var33++) {
                            for (int var34 = 0; var34 < 104; var34++) {
                                class62.field704[var32][var33][var34] = 0;
                            }
                        }
                    }
                    method4774();
                    class62.method890();
                    int var35 = Statics.field2438.length;
                    class80.method2362();
                    method156(true);
                    if (!field1005) {
                        int var36 = 0;
                        label1150: while (true) {
                            if (var36 >= var35) {
                                for (int var50 = 0; var50 < var35; var50++) {
                                    int var51 = (Statics.field1651[var50] >> 8) * 64 - Statics.field407;
                                    int var52 = (Statics.field1651[var50] & 0xFF) * 64 - Statics.field1272;
                                    byte[] var53 = Statics.field2438[var50];
                                    if (var53 == null && Statics.field346 < 800) {
                                        method4774();
                                        class62.method4238(var51, var52, 64, 64);
                                    }
                                }
                                method156(true);
                                int var54 = 0;
                                while (true) {
                                    if (var54 >= var35) {
                                        break label1150;
                                    }
                                    byte[] var55 = Statics.field2133[var54];
                                    if (var55 != null) {
                                        int var56 = (Statics.field1651[var54] >> 8) * 64 - Statics.field407;
                                        int var57 = (Statics.field1651[var54] & 0xFF) * 64 - Statics.field1272;
                                        method4774();
                                        class137 var58 = Statics.field569;
                                        class167[] var59 = field1017;
                                        class185 var60 = new class185(var55);
                                        int var61 = -1;
                                        while (true) {
                                            int var62 = var60.method3136();
                                            if (var62 == 0) {
                                                break;
                                            }
                                            var61 += var62;
                                            int var63 = 0;
                                            while (true) {
                                                int var64 = var60.method3136();
                                                if (var64 == 0) {
                                                    break;
                                                }
                                                var63 += var64 - 1;
                                                int var65 = var63 & 0x3F;
                                                int var66 = var63 >> 6 & 0x3F;
                                                int var67 = var63 >> 12;
                                                int var68 = var60.method3197();
                                                int var69 = var68 >> 2;
                                                int var70 = var68 & 0x3;
                                                int var71 = var56 + var66;
                                                int var72 = var57 + var65;
                                                if (var71 > 0 && var72 > 0 && var71 < 103 && var72 < 103) {
                                                    int var73 = var67;
                                                    if ((class62.field704[1][var71][var72] & 0x2) == 2) {
                                                        var73 = var67 - 1;
                                                    }
                                                    class167 var74 = null;
                                                    if (var73 >= 0) {
                                                        var74 = var59[var73];
                                                    }
                                                    class62.method169(var67, var71, var72, var61, var70, var69, var58, var74);
                                                }
                                            }
                                        }
                                    }
                                    var54++;
                                }
                            }
                            int var37 = (Statics.field1651[var36] >> 8) * 64 - Statics.field407;
                            int var38 = (Statics.field1651[var36] & 0xFF) * 64 - Statics.field1272;
                            byte[] var39 = Statics.field2438[var36];
                            if (var39 != null) {
                                method4774();
                                int var40 = Statics.field270 * 8 - 48;
                                int var41 = Statics.field346 * 8 - 48;
                                class167[] var42 = field1017;
                                int var43 = 0;
                                label1147: while (true) {
                                    if (var43 >= 4) {
                                        class185 var46 = new class185(var39);
                                        int var47 = 0;
                                        while (true) {
                                            if (var47 >= 4) {
                                                break label1147;
                                            }
                                            for (int var48 = 0; var48 < 64; var48++) {
                                                for (int var49 = 0; var49 < 64; var49++) {
                                                    class62.method4176(var46, var47, var37 + var48, var38 + var49, var40, var41, 0);
                                                }
                                            }
                                            var47++;
                                        }
                                    }
                                    for (int var44 = 0; var44 < 64; var44++) {
                                        for (int var45 = 0; var45 < 64; var45++) {
                                            if (var37 + var44 > 0 && var37 + var44 < 103 && var38 + var45 > 0 && var38 + var45 < 103) {
                                                var42[var43].field2184[var37 + var44][var38 + var45] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var43++;
                                }
                            }
                            var36++;
                        }
                    }
                    if (field1005) {
                        int var75 = 0;
                        label1083: while (true) {
                            if (var75 >= 4) {
                                for (int var115 = 0; var115 < 13; var115++) {
                                    for (int var116 = 0; var116 < 13; var116++) {
                                        int var117 = field881[0][var115][var116];
                                        if (var117 == -1) {
                                            class62.method4238(var115 * 8, var116 * 8, 8, 8);
                                        }
                                    }
                                }
                                method156(true);
                                int var118 = 0;
                                while (true) {
                                    if (var118 >= 4) {
                                        break label1083;
                                    }
                                    method4774();
                                    for (int var119 = 0; var119 < 13; var119++) {
                                        for (int var120 = 0; var120 < 13; var120++) {
                                            int var121 = field881[var118][var119][var120];
                                            if (var121 != -1) {
                                                int var122 = var121 >> 24 & 0x3;
                                                int var123 = var121 >> 1 & 0x3;
                                                int var124 = var121 >> 14 & 0x3FF;
                                                int var125 = var121 >> 3 & 0x7FF;
                                                int var126 = (var124 / 8 << 8) + var125 / 8;
                                                for (int var127 = 0; var127 < Statics.field1651.length; var127++) {
                                                    if (Statics.field1651[var127] == var126 && Statics.field2133[var127] != null) {
                                                        class62.method3891(Statics.field2133[var127], var118, var119 * 8, var120 * 8, var122, (var124 & 0x7) * 8, (var125 & 0x7) * 8, var123, Statics.field569, field1017);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var118++;
                                }
                            }
                            method4774();
                            for (int var76 = 0; var76 < 13; var76++) {
                                for (int var77 = 0; var77 < 13; var77++) {
                                    boolean var78 = false;
                                    int var79 = field881[var75][var76][var77];
                                    if (var79 != -1) {
                                        int var80 = var79 >> 24 & 0x3;
                                        int var81 = var79 >> 1 & 0x3;
                                        int var82 = var79 >> 14 & 0x3FF;
                                        int var83 = var79 >> 3 & 0x7FF;
                                        int var84 = (var82 / 8 << 8) + var83 / 8;
                                        for (int var85 = 0; var85 < Statics.field1651.length; var85++) {
                                            if (Statics.field1651[var85] == var84 && Statics.field2438[var85] != null) {
                                                byte[] var86 = Statics.field2438[var85];
                                                int var87 = var76 * 8;
                                                int var88 = var77 * 8;
                                                int var89 = (var82 & 0x7) * 8;
                                                int var90 = (var83 & 0x7) * 8;
                                                class167[] var91 = field1017;
                                                for (int var92 = 0; var92 < 8; var92++) {
                                                    for (int var93 = 0; var93 < 8; var93++) {
                                                        if (var87 + var92 > 0 && var87 + var92 < 103 && var88 + var93 > 0 && var88 + var93 < 103) {
                                                            var91[var75].field2184[var87 + var92][var88 + var93] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class185 var94 = new class185(var86);
                                                for (int var95 = 0; var95 < 4; var95++) {
                                                    for (int var96 = 0; var96 < 64; var96++) {
                                                        for (int var97 = 0; var97 < 64; var97++) {
                                                            if (var80 == var95 && var96 >= var89 && var96 < var89 + 8 && var97 >= var90 && var97 < var90 + 8) {
                                                                int var101 = var96 & 0x7;
                                                                int var102 = var97 & 0x7;
                                                                int var104 = var81 & 0x3;
                                                                int var105;
                                                                if (var104 == 0) {
                                                                    var105 = var101;
                                                                } else if (var104 == 1) {
                                                                    var105 = var102;
                                                                } else if (var104 == 2) {
                                                                    var105 = 7 - var101;
                                                                } else {
                                                                    var105 = 7 - var102;
                                                                }
                                                                int var108 = var87 + var105;
                                                                int var110 = var96 & 0x7;
                                                                int var111 = var97 & 0x7;
                                                                int var113 = var81 & 0x3;
                                                                int var114;
                                                                if (var113 == 0) {
                                                                    var114 = var111;
                                                                } else if (var113 == 1) {
                                                                    var114 = 7 - var110;
                                                                } else if (var113 == 2) {
                                                                    var114 = 7 - var111;
                                                                } else {
                                                                    var114 = var110;
                                                                }
                                                                class62.method4176(var94, var75, var108, var88 + var114, 0, 0, var81);
                                                            } else {
                                                                class62.method4176(var94, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var78 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var78) {
                                        class62.method332(var75, var76 * 8, var77 * 8);
                                    }
                                }
                            }
                            var75++;
                        }
                    }
                    method156(true);
                    method47();
                    method4774();
                    class137 var128 = Statics.field569;
                    class167[] var129 = field1017;
                    for (int var130 = 0; var130 < 4; var130++) {
                        for (int var131 = 0; var131 < 104; var131++) {
                            for (int var132 = 0; var132 < 104; var132++) {
                                if ((class62.field704[var130][var131][var132] & 0x1) == 1) {
                                    int var133 = var130;
                                    if ((class62.field704[1][var131][var132] & 0x2) == 2) {
                                        var133 = var130 - 1;
                                    }
                                    if (var133 >= 0) {
                                        var129[var133].method2970(var131, var132);
                                    }
                                }
                            }
                        }
                    }
                    class62.field700 += (int) (Math.random() * 5.0D) - 2;
                    if (class62.field700 < -8) {
                        class62.field700 = -8;
                    }
                    if (class62.field700 > 8) {
                        class62.field700 = 8;
                    }
                    class62.field685 += (int) (Math.random() * 5.0D) - 2;
                    if (class62.field685 < -16) {
                        class62.field685 = -16;
                    }
                    if (class62.field685 > 16) {
                        class62.field685 = 16;
                    }
                    for (int var134 = 0; var134 < 4; var134++) {
                        byte[][] var135 = Statics.field393[var134];
                        int var136 = (int) Math.sqrt(5100.0D);
                        int var137 = var136 * 768 >> 8;
                        for (int var138 = 1; var138 < 103; var138++) {
                            for (int var139 = 1; var139 < 103; var139++) {
                                int var140 = class62.field690[var134][var139 + 1][var138] - class62.field690[var134][var139 - 1][var138];
                                int var141 = class62.field690[var134][var139][var138 + 1] - class62.field690[var134][var139][var138 - 1];
                                int var142 = (int) Math.sqrt((double) (var141 * var141 + var140 * var140 + 65536));
                                int var143 = (var140 << 8) / var142;
                                int var144 = 65536 / var142;
                                int var145 = (var141 << 8) / var142;
                                int var146 = (var145 * -50 + var143 * -50 + var144 * -10) / var137 + 96;
                                int var147 = (var135[var139][var138] >> 1) + (var135[var139][var138 + 1] >> 3) + (var135[var139][var138 - 1] >> 2) + (var135[var139 - 1][var138] >> 2) + (var135[var139 + 1][var138] >> 3);
                                Statics.field1372[var139][var138] = var146 - var147;
                            }
                        }
                        for (int var148 = 0; var148 < 104; var148++) {
                            Statics.field414[var148] = 0;
                            Statics.field25[var148] = 0;
                            Statics.field686[var148] = 0;
                            Statics.field1670[var148] = 0;
                            Statics.field3689[var148] = 0;
                        }
                        for (int var149 = -5; var149 < 109; var149++) {
                            for (int var150 = 0; var150 < 104; var150++) {
                                int var151 = var149 + 5;
                                int var10002;
                                if (var151 >= 0 && var151 < 104) {
                                    int var152 = Statics.field353[var134][var151][var150] & 0xFF;
                                    if (var152 > 0) {
                                        class258 var153 = class258.method21(var152 - 1);
                                        Statics.field414[var150] += var153.field3405;
                                        Statics.field25[var150] += var153.field3403;
                                        Statics.field686[var150] += var153.field3404;
                                        Statics.field1670[var150] += var153.field3402;
                                        var10002 = Statics.field3689[var150]++;
                                    }
                                }
                                int var154 = var149 - 5;
                                if (var154 >= 0 && var154 < 104) {
                                    int var155 = Statics.field353[var134][var154][var150] & 0xFF;
                                    if (var155 > 0) {
                                        class258 var156 = class258.method21(var155 - 1);
                                        Statics.field414[var150] -= var156.field3405;
                                        Statics.field25[var150] -= var156.field3403;
                                        Statics.field686[var150] -= var156.field3404;
                                        Statics.field1670[var150] -= var156.field3402;
                                        var10002 = Statics.field3689[var150]--;
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
                                        var157 += Statics.field414[var163];
                                        var158 += Statics.field25[var163];
                                        var159 += Statics.field686[var163];
                                        var160 += Statics.field1670[var163];
                                        var161 += Statics.field3689[var163];
                                    }
                                    int var164 = var162 - 5;
                                    if (var164 >= 0 && var164 < 104) {
                                        var157 -= Statics.field414[var164];
                                        var158 -= Statics.field25[var164];
                                        var159 -= Statics.field686[var164];
                                        var160 -= Statics.field1670[var164];
                                        var161 -= Statics.field3689[var164];
                                    }
                                    if (var162 >= 1 && var162 < 103 && (!field827 || (class62.field704[0][var149][var162] & 0x2) != 0 || (class62.field704[var134][var149][var162] & 0x10) == 0)) {
                                        if (var134 < class62.field687) {
                                            class62.field687 = var134;
                                        }
                                        int var165 = Statics.field353[var134][var149][var162] & 0xFF;
                                        int var166 = Statics.field688[var134][var149][var162] & 0xFF;
                                        if (var165 > 0 || var166 > 0) {
                                            int var167 = class62.field690[var134][var149][var162];
                                            int var168 = class62.field690[var134][var149 + 1][var162];
                                            int var169 = class62.field690[var134][var149 + 1][var162 + 1];
                                            int var170 = class62.field690[var134][var149][var162 + 1];
                                            int var171 = Statics.field1372[var149][var162];
                                            int var172 = Statics.field1372[var149 + 1][var162];
                                            int var173 = Statics.field1372[var149 + 1][var162 + 1];
                                            int var174 = Statics.field1372[var149][var162 + 1];
                                            int var175 = -1;
                                            int var176 = -1;
                                            if (var165 > 0) {
                                                int var177 = var157 * 256 / var160;
                                                int var178 = var158 / var161;
                                                int var179 = var159 / var161;
                                                var175 = class62.method546(var177, var178, var179);
                                                int var180 = class62.field700 + var177 & 0xFF;
                                                int var181 = class62.field685 + var179;
                                                if (var181 < 0) {
                                                    var181 = 0;
                                                } else if (var181 > 255) {
                                                    var181 = 255;
                                                }
                                                var176 = class62.method546(var180, var178, var181);
                                            }
                                            if (var134 > 0) {
                                                boolean var182 = true;
                                                if (var165 == 0 && Statics.field689[var134][var149][var162] != 0) {
                                                    var182 = false;
                                                }
                                                if (var166 > 0 && !class271.method4297(var166 - 1).field3647) {
                                                    var182 = false;
                                                }
                                                if (var182 && var167 == var168 && var167 == var169 && var167 == var170) {
                                                    Statics.field691[var134][var149][var162] |= 0x924;
                                                }
                                            }
                                            int var183 = 0;
                                            if (var176 != -1) {
                                                var183 = class134.field1906[class62.method497(var176, 96)];
                                            }
                                            if (var166 == 0) {
                                                var128.method2795(var134, var149, var162, 0, 0, -1, var167, var168, var169, var170, class62.method497(var175, var171), class62.method497(var175, var172), class62.method497(var175, var173), class62.method497(var175, var174), 0, 0, 0, 0, var183, 0);
                                            } else {
                                                int var184 = Statics.field689[var134][var149][var162] + 1;
                                                byte var185 = Statics.field2160[var134][var149][var162];
                                                class271 var186 = class271.method4297(var166 - 1);
                                                int var187 = var186.field3646;
                                                int var188;
                                                int var189;
                                                if (var187 >= 0) {
                                                    var188 = Statics.field1895.method2340(var187);
                                                    var189 = -1;
                                                } else if (var186.field3645 == 16711935) {
                                                    var189 = -2;
                                                    var187 = -1;
                                                    var188 = -2;
                                                } else {
                                                    var189 = class62.method546(var186.field3651, var186.field3650, var186.field3652);
                                                    int var190 = class62.field700 + var186.field3651 & 0xFF;
                                                    int var191 = class62.field685 + var186.field3652;
                                                    if (var191 < 0) {
                                                        var191 = 0;
                                                    } else if (var191 > 255) {
                                                        var191 = 255;
                                                    }
                                                    var188 = class62.method546(var190, var186.field3650, var191);
                                                }
                                                int var192 = 0;
                                                if (var188 != -2) {
                                                    var192 = class134.field1906[class62.method328(var188, 96)];
                                                }
                                                if (var186.field3648 != -1) {
                                                    int var193 = class62.field700 + var186.field3643 & 0xFF;
                                                    int var194 = class62.field685 + var186.field3654;
                                                    if (var194 < 0) {
                                                        var194 = 0;
                                                    } else if (var194 > 255) {
                                                        var194 = 255;
                                                    }
                                                    int var195 = class62.method546(var193, var186.field3653, var194);
                                                    var192 = class134.field1906[class62.method328(var195, 96)];
                                                }
                                                var128.method2795(var134, var149, var162, var184, var185, var187, var167, var168, var169, var170, class62.method497(var175, var171), class62.method497(var175, var172), class62.method497(var175, var173), class62.method497(var175, var174), class62.method328(var189, var171), class62.method328(var189, var172), class62.method328(var189, var173), class62.method328(var189, var174), var183, var192);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var196 = 1; var196 < 103; var196++) {
                            for (int var197 = 1; var197 < 103; var197++) {
                                int var202;
                                if ((class62.field704[var134][var197][var196] & 0x8) != 0) {
                                    var202 = 0;
                                } else if (var134 <= 0 || (class62.field704[1][var197][var196] & 0x2) == 0) {
                                    var202 = var134;
                                } else {
                                    var202 = var134 - 1;
                                }
                                var128.method2620(var134, var197, var196, var202);
                            }
                        }
                        Statics.field353[var134] = (byte[][]) null;
                        Statics.field688[var134] = (byte[][]) null;
                        Statics.field689[var134] = (byte[][]) null;
                        Statics.field2160[var134] = (byte[][]) null;
                        Statics.field393[var134] = (byte[][]) null;
                    }
                    var128.method2647(-50, -10, -50);
                    for (int var203 = 0; var203 < 104; var203++) {
                        for (int var204 = 0; var204 < 104; var204++) {
                            if ((class62.field704[1][var203][var204] & 0x2) == 2) {
                                var128.method2681(var203, var204);
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
                                    if ((Statics.field691[var209][var211][var210] & var205) != 0) {
                                        int var212 = var210;
                                        int var213 = var210;
                                        int var214 = var209;
                                        int var215 = var209;
                                        while (var212 > 0 && (Statics.field691[var209][var211][var212 - 1] & var205) != 0) {
                                            var212--;
                                        }
                                        while (var213 < 104 && (Statics.field691[var209][var211][var213 + 1] & var205) != 0) {
                                            var213++;
                                        }
                                        label734: while (var214 > 0) {
                                            for (int var216 = var212; var216 <= var213; var216++) {
                                                if ((Statics.field691[var214 - 1][var211][var216] & var205) == 0) {
                                                    break label734;
                                                }
                                            }
                                            var214--;
                                        }
                                        label723: while (var215 < var208) {
                                            for (int var217 = var212; var217 <= var213; var217++) {
                                                if ((Statics.field691[var215 + 1][var211][var217] & var205) == 0) {
                                                    break label723;
                                                }
                                            }
                                            var215++;
                                        }
                                        int var218 = (var215 + 1 - var214) * (var213 - var212 + 1);
                                        if (var218 >= 8) {
                                            short var219 = 240;
                                            int var220 = class62.field690[var215][var211][var212] - var219;
                                            int var221 = class62.field690[var214][var211][var212];
                                            class137.method2619(var208, 1, var211 * 128, var211 * 128, var212 * 128, var213 * 128 + 128, var220, var221);
                                            for (int var222 = var214; var222 <= var215; var222++) {
                                                for (int var223 = var212; var223 <= var213; var223++) {
                                                    Statics.field691[var222][var211][var223] &= ~var205;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field691[var209][var211][var210] & var206) != 0) {
                                        int var224 = var211;
                                        int var225 = var211;
                                        int var226 = var209;
                                        int var227 = var209;
                                        while (var224 > 0 && (Statics.field691[var209][var224 - 1][var210] & var206) != 0) {
                                            var224--;
                                        }
                                        while (var225 < 104 && (Statics.field691[var209][var225 + 1][var210] & var206) != 0) {
                                            var225++;
                                        }
                                        label787: while (var226 > 0) {
                                            for (int var228 = var224; var228 <= var225; var228++) {
                                                if ((Statics.field691[var226 - 1][var228][var210] & var206) == 0) {
                                                    break label787;
                                                }
                                            }
                                            var226--;
                                        }
                                        label776: while (var227 < var208) {
                                            for (int var229 = var224; var229 <= var225; var229++) {
                                                if ((Statics.field691[var227 + 1][var229][var210] & var206) == 0) {
                                                    break label776;
                                                }
                                            }
                                            var227++;
                                        }
                                        int var230 = (var227 + 1 - var226) * (var225 - var224 + 1);
                                        if (var230 >= 8) {
                                            short var231 = 240;
                                            int var232 = class62.field690[var227][var224][var210] - var231;
                                            int var233 = class62.field690[var226][var224][var210];
                                            class137.method2619(var208, 2, var224 * 128, var225 * 128 + 128, var210 * 128, var210 * 128, var232, var233);
                                            for (int var234 = var226; var234 <= var227; var234++) {
                                                for (int var235 = var224; var235 <= var225; var235++) {
                                                    Statics.field691[var234][var235][var210] &= ~var206;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field691[var209][var211][var210] & var207) != 0) {
                                        int var236 = var211;
                                        int var237 = var211;
                                        int var238 = var210;
                                        int var239 = var210;
                                        while (var238 > 0 && (Statics.field691[var209][var211][var238 - 1] & var207) != 0) {
                                            var238--;
                                        }
                                        while (var239 < 104 && (Statics.field691[var209][var211][var239 + 1] & var207) != 0) {
                                            var239++;
                                        }
                                        label840: while (var236 > 0) {
                                            for (int var240 = var238; var240 <= var239; var240++) {
                                                if ((Statics.field691[var209][var236 - 1][var240] & var207) == 0) {
                                                    break label840;
                                                }
                                            }
                                            var236--;
                                        }
                                        label829: while (var237 < 104) {
                                            for (int var241 = var238; var241 <= var239; var241++) {
                                                if ((Statics.field691[var209][var237 + 1][var241] & var207) == 0) {
                                                    break label829;
                                                }
                                            }
                                            var237++;
                                        }
                                        if ((var237 - var236 + 1) * (var239 - var238 + 1) >= 4) {
                                            int var242 = class62.field690[var209][var236][var238];
                                            class137.method2619(var208, 4, var236 * 128, var237 * 128 + 128, var238 * 128, var239 * 128 + 128, var242, var242);
                                            for (int var243 = var236; var243 <= var237; var243++) {
                                                for (int var244 = var238; var244 <= var239; var244++) {
                                                    Statics.field691[var209][var243][var244] &= ~var207;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method156(true);
                    int var245 = class62.field687;
                    if (var245 > Statics.field780) {
                        var245 = Statics.field780;
                    }
                    if (var245 < Statics.field780 - 1) {
                        int var246 = Statics.field780 - 1;
                    }
                    if (field827) {
                        Statics.field569.method2724(class62.field687);
                    } else {
                        Statics.field569.method2724(0);
                    }
                    for (int var247 = 0; var247 < 104; var247++) {
                        for (int var248 = 0; var248 < 104; var248++) {
                            method2069(var247, var248);
                        }
                    }
                    method4774();
                    for (class74 var249 = (class74) field938.method3581(); var249 != null; var249 = (class74) field938.method3597()) {
                        if (var249.field1094 == -1) {
                            var249.field1093 = 0;
                            method669(var249);
                        } else {
                            var249.method3561();
                        }
                    }
                    class267.field3499.method3513();
                    if (Statics.field481.method765()) {
                        class175 var250 = class175.method470(class172.field2290, field868.field1440);
                        var250.field2403.method3110(1057001181);
                        field868.method1879(var250);
                    }
                    if (!field1005) {
                        int var251 = (Statics.field270 - 6) / 8;
                        int var252 = (Statics.field270 + 6) / 8;
                        int var253 = (Statics.field346 - 6) / 8;
                        int var254 = (Statics.field346 + 6) / 8;
                        for (int var255 = var251 - 1; var255 <= var252 + 1; var255++) {
                            for (int var256 = var253 - 1; var256 <= var254 + 1; var256++) {
                                if (var255 < var251 || var255 > var252 || var256 < var253 || var256 > var254) {
                                    Statics.field3722.method4030("m" + var255 + "_" + var256);
                                    Statics.field3722.method4030("l" + var255 + "_" + var256);
                                }
                            }
                        }
                    }
                    method22(30);
                    method4774();
                    class62.method1774();
                    class175 var257 = class175.method470(class172.field2368, field868.field1440);
                    field868.method1879(var257);
                    class59.method981();
                } else {
                    field878 = 2;
                }
            } else {
                field878 = 1;
            }
        }
        if (field830 == 30) {
            this.method1402();
        } else if (field830 == 40 || field830 == 45) {
            this.method1101();
        }
    }

    @ObfuscatedName("client.au(ZI)V")
    public final void method745(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class215.field2597 == 2) {
                    if (Statics.field2600 == null) {
                        Statics.field2600 = class221.method3854(Statics.field1370, Statics.field2421, Statics.field2506);
                        if (Statics.field2600 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field1282 == null) {
                        Statics.field1282 = new class110(Statics.field2593, Statics.field2594);
                    }
                    if (Statics.field2596.method3753(Statics.field2600, Statics.field2599, Statics.field1282, 22050)) {
                        Statics.field2596.method3740();
                        Statics.field2596.method3667(Statics.field2598);
                        Statics.field2596.method3672(Statics.field2600, Statics.field2595);
                        class215.field2597 = 0;
                        Statics.field2600 = null;
                        Statics.field1282 = null;
                        Statics.field1370 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2596.method3673();
                class215.field2597 = 0;
                Statics.field2600 = null;
                Statics.field1282 = null;
                Statics.field1370 = null;
            }
            var2 = false;
        }
        if (var2 && field1015 && Statics.field1249 != null) {
            Statics.field1249.method2038();
        }
        if ((field830 == 10 || field830 == 20 || field830 == 30) && field1021 != 0L && class187.method35() > field1021) {
            method1659(method1528());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field1013[var5] = true;
            }
        }
        if (field830 == 0) {
            this.method760(class90.field1318, class90.field1319, arg0);
        } else if (field830 == 5) {
            class90.method2614(Statics.field1288, Statics.field289, Statics.field234, arg0);
        } else if (field830 == 10 || field830 == 11) {
            class90.method2614(Statics.field1288, Statics.field289, Statics.field234, arg0);
        } else if (field830 == 20) {
            class90.method2614(Statics.field1288, Statics.field289, Statics.field234, arg0);
        } else if (field830 == 25) {
            if (field878 == 1) {
                if (field874 > field875) {
                    field875 = field874;
                }
                int var6 = (field875 * 50 - field874 * 50) / field875;
                method993(class237.field3098 + class86.field1275 + class86.field1277 + var6 + "%" + class86.field1273, false);
            } else if (field878 == 2) {
                if (field876 > field1069) {
                    field1069 = field876;
                }
                int var7 = (field1069 * 50 - field876 * 50) / field1069 + 50;
                method993(class237.field3098 + class86.field1275 + class86.field1277 + var7 + "%" + class86.field1273, false);
            } else {
                method993(class237.field3098, false);
            }
        } else if (field830 == 30) {
            this.method1104();
        } else if (field830 == 40) {
            method993(class237.field2945 + class86.field1275 + class237.field3063, false);
        } else if (field830 == 45) {
            method993(class237.field3092, false);
        }
        if (field830 == 30 && field1020 == 0 && !arg0 && !field879) {
            for (int var8 = 0; var8 < field1011; var8++) {
                if (field1014[var8]) {
                    Statics.field3432.method719(field1027[var8], field826[var8], field836[var8], field922[var8]);
                    field1014[var8] = false;
                }
            }
        } else if (field830 > 0) {
            Statics.field3432.method712(0, 0);
            for (int var9 = 0; var9 < field1011; var9++) {
                field1014[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.am(I)V")
    public final void method759() {
        if (Statics.field701.method1815()) {
            Statics.field701.method1812();
        }
        if (Statics.field15 != null) {
            Statics.field15.field761 = false;
        }
        Statics.field15 = null;
        field868.method1877();
        class51.method8();
        if (class60.field670 != null) {
            class60 var1 = class60.field670;
            synchronized (class60.field670) {
                class60.field670 = null;
            }
        }
        Statics.field766 = null;
        if (Statics.field1249 != null) {
            Statics.field1249.method2042();
        }
        if (Statics.field2051 != null) {
            Statics.field2051.method2042();
        }
        if (Statics.field3321 != null) {
            Statics.field3321.method2897();
        }
        class248.method2941();
        if (Statics.field722 != null) {
            Statics.field722.method2808();
            Statics.field722 = null;
        }
        try {
            class158.field2125.method2277();
            for (int var3 = 0; var3 < Statics.field2122; var3++) {
                Statics.field16[var3].method2277();
            }
            class158.field2126.method2277();
            class158.field2124.method2277();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("a.fg(II)V")
    public static void method22(int arg0) {
        if (field830 == arg0) {
            return;
        }
        if (field830 == 0) {
            Statics.field481.method761();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field944 = 0;
            field1079 = 0;
            field844 = 0;
            field1077.method4941(arg0);
            if (arg0 != 20) {
                method3094(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field388 != null) {
            Statics.field388.method2897();
            Statics.field388 = null;
        }
        if (field830 == 25) {
            field878 = 0;
            field874 = 0;
            field875 = 1;
            field876 = 0;
            field1069 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class90.method3342(Statics.field855, Statics.field1798, true, 0);
        } else if (arg0 == 20) {
            class90.method3342(Statics.field855, Statics.field1798, true, field830 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class90.method3342(Statics.field855, Statics.field1798, false, 4);
        } else {
            class90.method1032();
        }
        field830 = arg0;
    }

    @ObfuscatedName("client.fc(I)V")
    public void method1098() {
        if (field830 != 1000) {
            boolean var1 = class250.method51();
            if (!var1) {
                this.method1161();
            }
        }
    }

    @ObfuscatedName("client.fd(B)V")
    public void method1161() {
        if (class250.field3337 >= 4) {
            this.method762("js5crc");
            field830 = 1000;
            return;
        }
        if (class250.field3338 >= 4) {
            if (field830 <= 5) {
                this.method762("js5io");
                field830 = 1000;
                return;
            }
            field854 = 3000;
            class250.field3338 = 3;
        }
        if (--field854 + 1 > 0) {
            return;
        }
        try {
            if (field975 == 0) {
                Statics.field299 = Statics.field655.method2870(Statics.field1928, Statics.field726);
                field975++;
            }
            if (field975 == 1) {
                if (Statics.field299.field2106 == 2) {
                    this.method1163(-1);
                    return;
                }
                if (Statics.field299.field2106 == 1) {
                    field975++;
                }
            }
            if (field975 == 2) {
                if (field871) {
                    Socket var1 = (Socket) Statics.field299.field2111;
                    class162 var2 = new class162(var1, 40000, 5000);
                    Statics.field852 = var2;
                } else {
                    Statics.field852 = new class164((Socket) Statics.field299.field2111, Statics.field655, 5000);
                }
                class185 var3 = new class185(5);
                var3.method3107(15);
                var3.method3110(162);
                Statics.field852.method2896(var3.field2491, 0, 5);
                field975++;
                Statics.field2486 = class187.method35();
            }
            if (field975 == 3) {
                if (Statics.field852.method2893() > 0 || !field871 && field830 <= 5) {
                    int var4 = Statics.field852.method2908();
                    if (var4 != 0) {
                        this.method1163(var4);
                        return;
                    }
                    field975++;
                } else if (class187.method35() - Statics.field2486 > 30000L) {
                    this.method1163(-2);
                    return;
                }
            }
            if (field975 == 4) {
                class160 var5 = Statics.field852;
                boolean var6 = field830 > 20;
                if (Statics.field3321 != null) {
                    try {
                        Statics.field3321.method2897();
                    } catch (Exception var16) {
                    }
                    Statics.field3321 = null;
                }
                Statics.field3321 = var5;
                class250.method255(var6);
                class250.field3332.field2488 = 0;
                Statics.field310 = null;
                Statics.field1406 = null;
                class250.field3333 = 0;
                while (true) {
                    class246 var8 = (class246) class250.field3325.method3520();
                    if (var8 == null) {
                        while (true) {
                            class246 var9 = (class246) class250.field3323.method3520();
                            if (var9 == null) {
                                if (class250.field3336 != 0) {
                                    try {
                                        class185 var10 = new class185(4);
                                        var10.method3107(4);
                                        var10.method3107(class250.field3336);
                                        var10.method3250(0);
                                        Statics.field3321.method2896(var10.field2491, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field3321.method2897();
                                        } catch (Exception var14) {
                                        }
                                        class250.field3338++;
                                        Statics.field3321 = null;
                                    }
                                }
                                class250.field3322 = 0;
                                Statics.field352 = class187.method35();
                                Statics.field299 = null;
                                Statics.field852 = null;
                                field975 = 0;
                                field1054 = 0;
                                return;
                            }
                            class250.field3324.method3456(var9);
                            class250.field3328.method3518(var9, var9.field2563);
                            class250.field3329++;
                            class250.field3331--;
                        }
                    }
                    class250.field3330.method3518(var8, var8.field2563);
                    class250.field3327++;
                    class250.field3326--;
                }
            }
        } catch (IOException var17) {
            this.method1163(-3);
        }
    }

    @ObfuscatedName("client.ft(II)V")
    public void method1163(int arg0) {
        Statics.field299 = null;
        Statics.field852 = null;
        field975 = 0;
        if (Statics.field765 == Statics.field726) {
            Statics.field726 = Statics.field251;
        } else {
            Statics.field726 = Statics.field765;
        }
        field1054++;
        if (field1054 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field830 <= 5) {
                this.method762("js5connect_full");
                field830 = 1000;
            } else {
                field854 = 3000;
            }
        } else if (field1054 >= 2 && arg0 == 6) {
            this.method762("js5connect_outofdate");
            field830 = 1000;
        } else if (field1054 >= 4) {
            if (field830 <= 5) {
                this.method762("js5connect");
                field830 = 1000;
            } else {
                field854 = 3000;
            }
        }
    }

    @ObfuscatedName("ap.fo(Lio;Ljava/lang/String;I)V")
    public static void method217(class249 arg0, String arg1) {
        class64 var2 = new class64(arg0, arg1);
        field1076.add(var2);
    }

    @ObfuscatedName("bd.fy(I)V")
    public static void method996() {
        if (field851 == 0) {
            Statics.field569 = new class137(4, 104, 104, class62.field690);
            for (int var0 = 0; var0 < 4; var0++) {
                field1017[var0] = new class167(104, 104);
            }
            Statics.field394 = new class310(512, 512);
            class90.field1319 = class237.field2947;
            class90.field1318 = 5;
            field851 = 20;
        } else if (field851 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class134.field1889[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class137.method2651(var1, 500, 800, 512, 334);
            class90.field1319 = class237.field2948;
            class90.field1318 = 10;
            field851 = 30;
        } else if (field851 == 30) {
            Statics.field602 = method541(0, false, true, true);
            Statics.field1746 = method541(1, false, true, true);
            Statics.field3776 = method541(2, true, false, true);
            Statics.field1300 = method541(3, false, true, true);
            Statics.field326 = method541(4, false, true, true);
            Statics.field3722 = method541(5, true, true, true);
            Statics.field2074 = method541(6, true, true, true);
            Statics.field764 = method541(7, false, true, true);
            Statics.field1798 = method541(8, false, true, true);
            Statics.field243 = method541(9, false, true, true);
            Statics.field855 = method541(10, false, true, true);
            Statics.field784 = method541(11, false, true, true);
            Statics.field390 = method541(12, false, true, true);
            Statics.field3850 = method541(13, true, false, true);
            Statics.field542 = method541(14, false, true, true);
            Statics.field3495 = method541(15, false, true, true);
            Statics.field3717 = method541(16, false, true, true);
            class90.field1319 = class237.field3182;
            class90.field1318 = 20;
            field851 = 40;
        } else if (field851 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field602.method4160() * 4 / 100;
            int var8 = var7 + Statics.field1746.method4160() * 4 / 100;
            int var9 = var8 + Statics.field3776.method4160() * 2 / 100;
            int var10 = var9 + Statics.field1300.method4160() * 2 / 100;
            int var11 = var10 + Statics.field326.method4160() * 6 / 100;
            int var12 = var11 + Statics.field3722.method4160() * 4 / 100;
            int var13 = var12 + Statics.field2074.method4160() * 2 / 100;
            int var14 = var13 + Statics.field764.method4160() * 58 / 100;
            int var15 = var14 + Statics.field1798.method4160() * 2 / 100;
            int var16 = var15 + Statics.field243.method4160() * 2 / 100;
            int var17 = var16 + Statics.field855.method4160() * 2 / 100;
            int var18 = var17 + Statics.field784.method4160() * 2 / 100;
            int var19 = var18 + Statics.field390.method4160() * 2 / 100;
            int var20 = var19 + Statics.field3850.method4160() * 2 / 100;
            int var21 = var20 + Statics.field542.method4160() * 2 / 100;
            int var22 = var21 + Statics.field3495.method4160() * 2 / 100;
            int var23 = var22 + Statics.field3717.method4160() * 2 / 100;
            if (var23 == 100) {
                method217(Statics.field602, "Animations");
                method217(Statics.field1746, "Skeletons");
                method217(Statics.field326, "Sound FX");
                method217(Statics.field3722, "Maps");
                method217(Statics.field2074, "Music Tracks");
                method217(Statics.field764, "Models");
                method217(Statics.field1798, "Sprites");
                method217(Statics.field784, "Music Jingles");
                method217(Statics.field542, "Music Samples");
                method217(Statics.field3495, "Music Patches");
                method217(Statics.field3717, "World Map");
                class90.field1319 = class237.field2951;
                class90.field1318 = 30;
                field851 = 45;
            } else {
                if (var23 != 0) {
                    class90.field1319 = class237.field3128 + var23 + "%";
                }
                class90.field1318 = 30;
            }
        } else if (field851 == 45) {
            class107.method983(22050, !field827, 2);
            class216 var24 = new class216();
            var24.method3675(9, 128);
            Statics.field1249 = class107.method1354(Statics.field655, 0, 22050);
            Statics.field1249.method2059(var24);
            class215.method2281(Statics.field3495, Statics.field542, Statics.field326, var24);
            Statics.field2051 = class107.method1354(Statics.field655, 1, 2048);
            Statics.field1252 = new class100();
            Statics.field2051.method2059(Statics.field1252);
            Statics.field2407 = new class114(22050, Statics.field311);
            class90.field1319 = class237.field2952;
            class90.field1318 = 35;
            field851 = 50;
            Statics.field2924 = new class286(Statics.field1798, Statics.field3850);
        } else if (field851 == 50) {
            int var25 = class285.method4800().length;
            field873 = Statics.field2924.method4803(class285.method4800());
            if (field873.size() < var25) {
                class90.field1319 = class237.field3059 + field873.size() * 100 / var25 + "%";
                class90.field1318 = 40;
            } else {
                Statics.field289 = (class287) field873.get(class285.field3726);
                Statics.field234 = (class287) field873.get(class285.field3723);
                Statics.field1288 = (class287) field873.get(class285.field3721);
                Statics.field375 = new class316(true);
                class90.field1319 = class237.field2954;
                class90.field1318 = 40;
                field851 = 60;
            }
        } else if (field851 == 60) {
            int var26 = class90.method1033(Statics.field855, Statics.field1798);
            int var27 = class90.method3046();
            if (var26 < var27) {
                class90.field1319 = class237.field3148 + var26 * 100 / var27 + "%";
                class90.field1318 = 50;
            } else {
                class90.field1319 = class237.field3158;
                class90.field1318 = 50;
                method22(5);
                field851 = 70;
            }
        } else if (field851 == 70) {
            if (Statics.field3776.method4037()) {
                class249 var28 = Statics.field3776;
                Statics.field3649 = var28;
                class249 var29 = Statics.field3776;
                Statics.field3399 = var29;
                class259.method2919(Statics.field3776, Statics.field764);
                class249 var30 = Statics.field3776;
                class249 var31 = Statics.field764;
                boolean var32 = field827;
                Statics.field1547 = var30;
                Statics.field3497 = var31;
                class267.field3541 = var32;
                class270.method2866(Statics.field3776, Statics.field764);
                class264.method2807(Statics.field3776);
                class249 var33 = Statics.field3776;
                class249 var34 = Statics.field764;
                boolean var35 = field902;
                class287 var36 = Statics.field289;
                Statics.field335 = var33;
                Statics.field3551 = var34;
                Statics.field3382 = var35;
                Statics.field1550 = Statics.field335.method4044(10);
                Statics.field3419 = var36;
                class249 var37 = Statics.field3776;
                class249 var38 = Statics.field602;
                class249 var39 = Statics.field1746;
                Statics.field3658 = var37;
                Statics.field3662 = var38;
                Statics.field3668 = var39;
                class257.method498(Statics.field3776, Statics.field764);
                class249 var40 = Statics.field3776;
                Statics.field3444 = var40;
                class253.method4022(Statics.field3776);
                class249 var41 = Statics.field1300;
                class249 var42 = Statics.field764;
                class249 var43 = Statics.field1798;
                class249 var44 = Statics.field3850;
                Statics.field2846 = var41;
                Statics.field2732 = var42;
                Statics.field302 = var43;
                Statics.field2526 = var44;
                Statics.field3286 = new class228[Statics.field2846.method4045()][];
                Statics.field2730 = new boolean[Statics.field2846.method4045()];
                class252.method4010(Statics.field3776);
                class249 var45 = Statics.field3776;
                Statics.field3467 = var45;
                class255.method2120(Statics.field3776);
                class256.method2365(Statics.field3776);
                class263.method3333(Statics.field3776);
                Statics.field701 = new class94();
                class266.method2825(Statics.field3776, Statics.field1798, Statics.field3850);
                class249 var46 = Statics.field3776;
                class249 var47 = Statics.field1798;
                Statics.field3424 = var46;
                Statics.field3421 = var47;
                class254.method2915(Statics.field3776, Statics.field1798);
                class90.field1319 = class237.field2946;
                class90.field1318 = 60;
                field851 = 80;
            } else {
                class90.field1319 = class237.field2957 + Statics.field3776.method4146() + "%";
                class90.field1318 = 60;
            }
        } else if (field851 == 80) {
            int var48 = 0;
            if (Statics.field3845 == null) {
                class249 var49 = Statics.field1798;
                int var50 = var49.method4117("compass");
                int var51 = var49.method4050(var50, "");
                class310 var52 = class311.method18(var49, var50, var51);
                Statics.field3845 = var52;
            } else {
                var48++;
            }
            if (Statics.field1389 == null) {
                class249 var53 = Statics.field1798;
                int var54 = var53.method4117("mapedge");
                int var55 = var53.method4050(var54, "");
                class310 var56 = class311.method18(var53, var54, var55);
                Statics.field1389 = var56;
            } else {
                var48++;
            }
            if (Statics.field2436 == null) {
                Statics.field2436 = class311.method3987(Statics.field1798, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field293 == null) {
                Statics.field293 = class311.method55(Statics.field1798, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field794 == null) {
                Statics.field794 = class311.method55(Statics.field1798, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field282 == null) {
                Statics.field282 = class311.method55(Statics.field1798, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field2485 == null) {
                Statics.field2485 = class311.method55(Statics.field1798, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field503 == null) {
                Statics.field503 = class311.method55(Statics.field1798, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field2874 == null) {
                Statics.field2874 = class311.method55(Statics.field1798, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field1217 == null) {
                Statics.field1217 = class311.method3987(Statics.field1798, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field2409 == null) {
                Statics.field2409 = class311.method3987(Statics.field1798, "mod_icons", "");
            } else {
                var48++;
            }
            if (var48 < 11) {
                class90.field1319 = class237.field2968 + var48 * 100 / 12 + "%";
                class90.field1318 = 70;
            } else {
                Statics.field3744 = Statics.field2409;
                Statics.field1389.method5130();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2436[0].method5090(var57 + var60, var58 + var60, var59 + var60);
                class90.field1319 = class237.field2950;
                class90.field1318 = 70;
                field851 = 90;
            }
        } else if (field851 == 90) {
            if (Statics.field243.method4037()) {
                Statics.field260 = new class123(Statics.field243, Statics.field1798, 20, 0.8D, field827 ? 64 : 128);
                class134.method2551(Statics.field260);
                class134.method2552(0.8D);
                field851 = 100;
            } else {
                class90.field1319 = class237.field3100 + "0%";
                class90.field1318 = 90;
            }
        } else if (field851 == 100) {
            int var61 = Statics.field260.method2336();
            if (var61 < 100) {
                class90.field1319 = class237.field3100 + var61 + "%";
                class90.field1318 = 90;
            } else {
                class90.field1319 = class237.field2962;
                class90.field1318 = 90;
                field851 = 110;
            }
        } else if (field851 == 110) {
            Statics.field15 = new class69();
            Statics.field655.method2873(Statics.field15, 10);
            class90.field1319 = class237.field2963;
            class90.field1318 = 92;
            field851 = 120;
        } else if (field851 == 120) {
            if (Statics.field855.method4053("huffman", "")) {
                class177 var62 = new class177(Statics.field855.method4052("huffman", ""));
                Statics.field3762 = var62;
                class90.field1319 = class237.field2965;
                class90.field1318 = 94;
                field851 = 130;
            } else {
                class90.field1319 = class237.field3094 + "%";
                class90.field1318 = 94;
            }
        } else if (field851 == 130) {
            if (!Statics.field1300.method4037()) {
                class90.field1319 = class237.field2966 + Statics.field1300.method4146() * 4 / 5 + "%";
                class90.field1318 = 96;
            } else if (!Statics.field390.method4037()) {
                class90.field1319 = class237.field2966 + (80 + Statics.field390.method4146() / 6) + "%";
                class90.field1318 = 96;
            } else if (Statics.field3850.method4037()) {
                class90.field1319 = class237.field3026;
                class90.field1318 = 98;
                field851 = 140;
            } else {
                class90.field1319 = class237.field2966 + (96 + Statics.field3850.method4146() / 50) + "%";
                class90.field1318 = 96;
            }
        } else if (field851 == 140) {
            class90.field1318 = 100;
            if (Statics.field3717.method4054(class41.field509.field510)) {
                if (Statics.field711 == null) {
                    Statics.field711 = new class313();
                    Statics.field711.method5412(Statics.field3717, Statics.field1288, field873, Statics.field2436);
                }
                int var63 = Statics.field711.method5249();
                if (var63 < 100) {
                    class90.field1319 = class237.field3002 + (var63 * 9 / 10 + 10) + "%";
                } else {
                    class90.field1319 = class237.field2969;
                    field851 = 150;
                }
            } else {
                class90.field1319 = class237.field3002 + Statics.field3717.method4056(class41.field509.field510) / 10 + "%";
            }
        } else if (field851 == 150) {
            method22(10);
        }
    }

    @ObfuscatedName("ab.fu(IZZZI)Lio;")
    public static class249 method541(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class165 var4 = null;
        if (class158.field2125 != null) {
            var4 = new class165(arg0, class158.field2125, Statics.field16[arg0], 1000000);
        }
        return new class249(var4, Statics.field2933, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fh(I)V")
    public final void method1101() {
        class160 var1 = field868.method1880();
        class191 var2 = field868.field1442;
        try {
            if (field944 == 0) {
                if (var1 != null) {
                    var1.method2897();
                    var1 = null;
                }
                Statics.field2905 = null;
                field870 = false;
                field1079 = 0;
                field944 = 1;
            }
            if (field944 == 1) {
                if (Statics.field2905 == null) {
                    Statics.field2905 = Statics.field655.method2870(Statics.field1928, Statics.field726);
                }
                if (Statics.field2905.field2106 == 2) {
                    throw new IOException();
                }
                if (Statics.field2905.field2106 == 1) {
                    if (field871) {
                        Socket var3 = (Socket) Statics.field2905.field2111;
                        class162 var4 = new class162(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class164((Socket) Statics.field2905.field2111, Statics.field655, 5000);
                    }
                    field868.method1885(var1);
                    Statics.field2905 = null;
                    field944 = 2;
                }
            }
            if (field944 == 2) {
                field868.method1898();
                class175 var5 = class175.method3345();
                var5.field2404 = null;
                var5.field2400 = 0;
                var5.field2403 = new class191(5000);
                var5.field2403.method3107(class173.field2386.field2384);
                field868.method1879(var5);
                field868.method1878();
                var2.field2488 = 0;
                field944 = 3;
            }
            if (field944 == 3) {
                if (Statics.field1249 != null) {
                    Statics.field1249.method2055();
                }
                if (Statics.field2051 != null) {
                    Statics.field2051.method2055();
                }
                boolean var8 = true;
                if (field871 && !var1.method2894(1)) {
                    var8 = false;
                }
                if (var8) {
                    int var9 = var1.method2908();
                    if (Statics.field1249 != null) {
                        Statics.field1249.method2055();
                    }
                    if (Statics.field2051 != null) {
                        Statics.field2051.method2055();
                    }
                    if (var9 != 0) {
                        method19(var9);
                        return;
                    }
                    var2.field2488 = 0;
                    field944 = 4;
                }
            }
            if (field944 == 4) {
                if (var2.field2488 < 8) {
                    int var10 = var1.method2893();
                    if (var10 > 8 - var2.field2488) {
                        var10 = 8 - var2.field2488;
                    }
                    if (var10 > 0) {
                        var1.method2901(var2.field2491, var2.field2488, var10);
                        var2.field2488 += var10;
                    }
                }
                if (var2.field2488 == 8) {
                    var2.field2488 = 0;
                    Statics.field3702 = var2.method3128();
                    field944 = 5;
                }
            }
            if (field944 == 5) {
                field868.field1442.field2488 = 0;
                field868.method1898();
                class191 var11 = new class191(500);
                int[] var12 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field3702 >> 32), (int) (Statics.field3702 & 0xFFFFFFFFFFFFFFFFL) };
                var11.field2488 = 0;
                var11.method3107(1);
                var11.method3107(field861.method13());
                var11.method3110(var12[0]);
                var11.method3110(var12[1]);
                var11.method3110(var12[2]);
                var11.method3110(var12[3]);
                switch(field861.field2078) {
                    case 0:
                        var11.field2488 += 8;
                        break;
                    case 1:
                    case 3:
                        var11.method3109(Statics.field3690);
                        var11.field2488 += 5;
                        break;
                    case 2:
                        var11.method3110((Integer) Statics.field2688.field1189.get(class294.method3341(class90.field1325)));
                        var11.field2488 += 4;
                }
                var11.method3189(class90.field1327);
                var11.method3108(class88.field1292, class88.field1290);
                class175 var13 = class175.method3345();
                var13.field2404 = null;
                var13.field2400 = 0;
                var13.field2403 = new class191(5000);
                var13.field2403.field2488 = 0;
                if (field830 == 40) {
                    var13.field2403.method3107(class173.field2383.field2384);
                } else {
                    var13.field2403.method3107(class173.field2381.field2384);
                }
                var13.field2403.method3250(0);
                int var16 = var13.field2403.field2488;
                var13.field2403.method3110(162);
                var13.field2403.method3117(var11.field2491, 0, var11.field2488);
                int var17 = var13.field2403.field2488;
                var13.field2403.method3189(class90.field1325);
                var13.field2403.method3107((field879 ? 1 : 0) << 1 | (field827 ? 1 : 0));
                var13.field2403.method3250(Statics.field408);
                var13.field2403.method3250(Statics.field3453);
                class191 var18 = var13.field2403;
                if (field1016 == null) {
                    byte[] var19 = new byte[24];
                    try {
                        class158.field2124.method2276(0L);
                        class158.field2124.method2280(var19);
                        int var20;
                        for (var20 = 0; var20 < 24 && var19[var20] == 0; var20++) {
                        }
                        if (var20 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var49) {
                        for (int var22 = 0; var22 < 24; var22++) {
                            var19[var22] = -1;
                        }
                    }
                    var18.method3117(var19, 0, var19.length);
                } else {
                    var18.method3117(field1016, 0, field1016.length);
                }
                var13.field2403.method3189(Statics.field702);
                var13.field2403.method3110(Statics.field2082);
                class185 var25 = new class185(Statics.field375.method5442());
                Statics.field375.method5441(var25);
                var13.field2403.method3117(var25.field2491, 0, var25.field2491.length);
                var13.field2403.method3107(Statics.field478);
                var13.field2403.method3110(0);
                var13.field2403.method3110(Statics.field602.field3294);
                var13.field2403.method3110(Statics.field1746.field3294);
                var13.field2403.method3110(Statics.field3776.field3294);
                var13.field2403.method3110(Statics.field1300.field3294);
                var13.field2403.method3110(Statics.field326.field3294);
                var13.field2403.method3110(Statics.field3722.field3294);
                var13.field2403.method3110(Statics.field2074.field3294);
                var13.field2403.method3110(Statics.field764.field3294);
                var13.field2403.method3110(Statics.field1798.field3294);
                var13.field2403.method3110(Statics.field243.field3294);
                var13.field2403.method3110(Statics.field855.field3294);
                var13.field2403.method3110(Statics.field784.field3294);
                var13.field2403.method3110(Statics.field390.field3294);
                var13.field2403.method3110(Statics.field3850.field3294);
                var13.field2403.method3110(Statics.field542.field3294);
                var13.field2403.method3110(Statics.field3495.field3294);
                var13.field2403.method3110(Statics.field3717.field3294);
                var13.field2403.method3142(var12, var17, var13.field2403.field2488);
                var13.field2403.method3210(var13.field2403.field2488 - var16);
                field868.method1879(var13);
                field868.method1878();
                field868.field1440 = new class192(var12);
                for (int var26 = 0; var26 < 4; var26++) {
                    var12[var26] += 50;
                }
                var2.method3364(var12);
                field944 = 6;
            }
            if (field944 == 6 && var1.method2893() > 0) {
                int var27 = var1.method2908();
                if (var27 == 21 && field830 == 20) {
                    field944 = 7;
                } else if (var27 == 2) {
                    field944 = 9;
                } else if (var27 == 15 && field830 == 40) {
                    field868.field1443 = -1;
                    field944 = 13;
                } else if (var27 == 23 && field844 < 1) {
                    field844++;
                    field944 = 0;
                } else if (var27 == 29) {
                    field944 = 11;
                } else {
                    method19(var27);
                    return;
                }
            }
            if (field944 == 7 && var1.method2893() > 0) {
                field1037 = (var1.method2908() + 3) * 60;
                field944 = 8;
            }
            if (field944 == 8) {
                field1079 = 0;
                class90.method3032(class237.field2973, class237.field2974, field1037 / 60 + class237.field2975);
                if (--field1037 <= 0) {
                    field944 = 0;
                }
            } else {
                if (field944 == 9 && var1.method2893() >= 13) {
                    boolean var28 = var1.method2908() == 1;
                    var1.method2901(var2.field2491, 0, 4);
                    var2.field2488 = 0;
                    boolean var29 = false;
                    if (var28) {
                        int var30 = var2.method3367() << 24;
                        int var31 = var30 | var2.method3367() << 16;
                        int var32 = var31 | var2.method3367() << 8;
                        int var33 = var32 | var2.method3367();
                        int var34 = class294.method3341(class90.field1325);
                        if (Statics.field2688.field1189.size() >= 10 && !Statics.field2688.field1189.containsKey(var34)) {
                            Iterator var35 = Statics.field2688.field1189.entrySet().iterator();
                            var35.next();
                            var35.remove();
                        }
                        Statics.field2688.field1189.put(var34, var33);
                    }
                    if (class90.field1332) {
                        Statics.field2688.field1182 = class90.field1325;
                    } else {
                        Statics.field2688.field1182 = null;
                    }
                    class78.method1030();
                    field957 = var1.method2908();
                    field977 = var1.method2908() == 1;
                    field928 = var1.method2908();
                    field928 <<= 0x8;
                    field928 += var1.method2908();
                    field929 = var1.method2908();
                    var1.method2901(var2.field2491, 0, 1);
                    var2.field2488 = 0;
                    class171[] var36 = class171.method2544();
                    int var37 = var2.method3383();
                    if (var37 < 0 || var37 >= var36.length) {
                        throw new IOException(var37 + " " + var2.field2488);
                    }
                    field868.field1445 = var36[var37];
                    field868.field1443 = field868.field1445.field2281;
                    var1.method2901(var2.field2491, 0, 2);
                    var2.field2488 = 0;
                    field868.field1443 = var2.method3124();
                    try {
                        class53.method673(Statics.field481, "zap");
                    } catch (Throwable var48) {
                    }
                    field944 = 10;
                }
                if (field944 != 10) {
                    if (field944 == 11 && var1.method2893() >= 2) {
                        var2.field2488 = 0;
                        var1.method2901(var2.field2491, 0, 2);
                        var2.field2488 = 0;
                        Statics.field2702 = var2.method3124();
                        field944 = 12;
                    }
                    if (field944 == 12 && var1.method2893() >= Statics.field2702) {
                        var2.field2488 = 0;
                        var1.method2901(var2.field2491, 0, Statics.field2702);
                        var2.field2488 = 0;
                        String var39 = var2.method3131();
                        String var40 = var2.method3131();
                        String var41 = var2.method3131();
                        class90.method3032(var39, var40, var41);
                        method22(10);
                    }
                    if (field944 == 13) {
                        if (field868.field1443 == -1) {
                            if (var1.method2893() < 2) {
                                return;
                            }
                            var1.method2901(var2.field2491, 0, 2);
                            var2.field2488 = 0;
                            field868.field1443 = var2.method3124();
                        }
                        if (var1.method2893() >= field868.field1443) {
                            var1.method2901(var2.field2491, 0, field868.field1443);
                            var2.field2488 = 0;
                            int var42 = field868.field1443;
                            field1077.method4952();
                            field868.method1898();
                            field868.field1442.field2488 = 0;
                            field868.field1445 = null;
                            field868.field1447 = null;
                            field868.field1436 = null;
                            field868.field1449 = null;
                            field868.field1443 = 0;
                            field868.field1451 = 0;
                            field905 = 0;
                            method957();
                            field1051 = 0;
                            field1038 = 0;
                            for (int var43 = 0; var43 < 2048; var43++) {
                                field927[var43] = null;
                            }
                            Statics.field470 = null;
                            for (int var44 = 0; var44 < field837.length; var44++) {
                                class84 var45 = field837[var44];
                                if (var45 != null) {
                                    var45.field1113 = -1;
                                    var45.field1125 = false;
                                }
                            }
                            class65.method1();
                            method22(30);
                            for (int var46 = 0; var46 < 100; var46++) {
                                field1013[var46] = true;
                            }
                            method4013();
                            class93.method3771(var2);
                            if (var2.field2488 != var42) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field1079++;
                        if (field1079 > 2000) {
                            if (field844 < 1) {
                                if (Statics.field765 == Statics.field726) {
                                    Statics.field726 = Statics.field251;
                                } else {
                                    Statics.field726 = Statics.field765;
                                }
                                field844++;
                                field944 = 0;
                            } else {
                                method19(-3);
                            }
                        }
                    }
                } else if (var1.method2893() >= field868.field1443) {
                    var2.field2488 = 0;
                    var1.method2901(var2.field2491, 0, field868.field1443);
                    field1077.method4950();
                    method536();
                    class93.method3771(var2);
                    Statics.field270 = -1;
                    method150(false, var2);
                    field868.field1445 = null;
                }
            }
        } catch (IOException var50) {
            if (field844 < 1) {
                if (Statics.field765 == Statics.field726) {
                    Statics.field726 = Statics.field251;
                } else {
                    Statics.field726 = Statics.field765;
                }
                field844++;
                field944 = 0;
            } else {
                method19(-2);
            }
        }
    }

    @ObfuscatedName("aw.fa(I)V")
    public static void method536() {
        field833 = -1L;
        field916 = -1;
        Statics.field15.field767 = 0;
        Statics.field306 = true;
        field846 = true;
        field823 = -1L;
        class305.method4544();
        field868.method1898();
        field868.field1442.field2488 = 0;
        field868.field1445 = null;
        field868.field1447 = null;
        field868.field1436 = null;
        field868.field1449 = null;
        field868.field1443 = 0;
        field868.field1451 = 0;
        field905 = 0;
        field1044 = 0;
        field840 = 0;
        method957();
        class60.method582(0);
        class95.method1714();
        field960 = 0;
        field963 = false;
        field1046 = 0;
        field853 = 0;
        field1051 = 0;
        field953 = -1;
        field1038 = 0;
        field1039 = 0;
        field900 = class89.field1296;
        field850 = class89.field1296;
        field864 = 0;
        class93.method102();
        for (int var0 = 0; var0 < 2048; var0++) {
            field927[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field837[var1] = null;
        }
        field936 = -1;
        field939.method3586();
        field940.method3586();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field937[var2][var3][var4] = null;
                }
            }
        }
        field938 = new class205();
        Statics.field2282.method1552();
        for (int var5 = 0; var5 < Statics.field3352; var5++) {
            class253 var6 = (class253) class253.field3349.method3504((long) var5);
            class253 var7;
            if (var6 == null) {
                byte[] var8 = Statics.field2414.method4032(16, var5);
                class253 var9 = new class253();
                if (var8 != null) {
                    var9.method4197(new class185(var8));
                }
                class253.field3349.method3506(var9, (long) var5);
                var7 = var9;
            } else {
                var7 = var6;
            }
            if (var7 != null) {
                class223.field2690[var5] = 0;
                class223.field2691[var5] = 0;
            }
        }
        Statics.field701.method1810();
        field891 = -1;
        if (field968 != -1) {
            class228.method10(field968);
        }
        for (class67 var11 = (class67) field969.method3520(); var11 != null; var11 = (class67) field969.method3516()) {
            method1681(var11, true);
        }
        field968 = -1;
        field969 = new class202(8);
        field972 = null;
        method957();
        field1082.method3889((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field985[var12] = null;
            field934[var12] = false;
        }
        class65.method1();
        field831 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field1013[var13] = true;
        }
        method4013();
        Statics.field2926 = null;
        for (int var14 = 0; var14 < 8; var14++) {
            field1019[var14] = new class17();
        }
        Statics.field1398 = null;
    }

    @ObfuscatedName("a.fe(II)V")
    public static void method19(int arg0) {
        if (arg0 == -3) {
            class90.method3032(class237.field2976, class237.field2977, class237.field2978);
        } else if (arg0 == -2) {
            class90.method3032(class237.field2979, class237.field2980, class237.field2981);
        } else if (arg0 == -1) {
            class90.method3032(class237.field2982, class237.field2983, class237.field3206);
        } else if (arg0 == 3) {
            class90.field1339 = 3;
        } else if (arg0 == 4) {
            class90.method3032(class237.field3006, class237.field2938, class237.field2987);
        } else if (arg0 == 5) {
            class90.method3032(class237.field2988, class237.field2989, class237.field2990);
        } else if (arg0 == 6) {
            class90.method3032(class237.field2991, class237.field3216, class237.field2993);
        } else if (arg0 == 7) {
            class90.method3032(class237.field2994, class237.field3196, class237.field2996);
        } else if (arg0 == 8) {
            class90.method3032(class237.field2997, class237.field3211, class237.field2999);
        } else if (arg0 == 9) {
            class90.method3032(class237.field3000, class237.field3001, class237.field3020);
        } else if (arg0 == 10) {
            class90.method3032(class237.field3003, class237.field3004, class237.field3005);
        } else if (arg0 == 11) {
            class90.method3032(class237.field2935, class237.field3125, class237.field3181);
        } else if (arg0 == 12) {
            class90.method3032(class237.field3009, class237.field3010, class237.field3011);
        } else if (arg0 == 13) {
            class90.method3032(class237.field3054, class237.field3013, class237.field3154);
        } else if (arg0 == 14) {
            class90.method3032(class237.field3113, class237.field3016, class237.field3017);
        } else if (arg0 == 16) {
            class90.method3032(class237.field3117, class237.field3019, class237.field2984);
        } else if (arg0 == 17) {
            class90.method3032(class237.field3021, class237.field3022, class237.field3051);
        } else if (arg0 == 18) {
            class90.method3032(class237.field3139, class237.field3111, class237.field3012);
        } else if (arg0 == 19) {
            class90.method3032(class237.field3027, class237.field3028, class237.field3029);
        } else if (arg0 == 20) {
            class90.method3032(class237.field3202, class237.field3031, class237.field3032);
        } else if (arg0 == 22) {
            class90.method3032(class237.field3033, class237.field3034, class237.field3035);
        } else if (arg0 == 23) {
            class90.method3032(class237.field3036, class237.field3137, class237.field3115);
        } else if (arg0 == 24) {
            class90.method3032(class237.field3039, class237.field3023, class237.field3045);
        } else if (arg0 == 25) {
            class90.method3032(class237.field2992, class237.field3043, class237.field3044);
        } else if (arg0 == 26) {
            class90.method3032(class237.field2995, class237.field3046, class237.field3047);
        } else if (arg0 == 27) {
            class90.method3032(class237.field3048, class237.field3049, class237.field3050);
        } else if (arg0 == 31) {
            class90.method3032(class237.field3057, class237.field3178, class237.field3087);
        } else if (arg0 == 32) {
            class90.method3032(class237.field3060, class237.field3061, class237.field3062);
        } else if (arg0 == 37) {
            class90.method3032(class237.field3040, class237.field3141, class237.field3127);
        } else if (arg0 == 38) {
            class90.method3032(class237.field3066, class237.field3067, class237.field3068);
        } else if (arg0 == 55) {
            class90.method3032(class237.field3069, class237.field3070, class237.field3071);
        } else if (arg0 == 56) {
            class90.method3032(class237.field3072, class237.field3073, class237.field2949);
            method22(11);
            return;
        } else if (arg0 == 57) {
            class90.method3032(class237.field3075, class237.field3076, class237.field3077);
            method22(11);
            return;
        } else {
            class90.method3032(class237.field3038, class237.field3079, class237.field3080);
        }
        method22(10);
    }

    @ObfuscatedName("v.fz(I)V")
    public static final void method81() {
        field868.method1877();
        method47();
        Statics.field569.method2616();
        for (int var0 = 0; var0 < 4; var0++) {
            field1017[var0].method2975();
        }
        System.gc();
        class215.field2597 = 1;
        Statics.field1370 = null;
        Statics.field2421 = -1;
        Statics.field2506 = -1;
        Statics.field2598 = 0;
        Statics.field2595 = false;
        Statics.field1269 = 2;
        field1042 = -1;
        field1015 = false;
        class80.method2362();
        method22(10);
    }

    @ObfuscatedName("r.fp(I)V")
    public static final void method47() {
        class271.field3644.method3513();
        class258.field3400.method3513();
        class259.method919();
        Statics.method3089();
        class270.method17();
        class268.method668();
        class272.method4004();
        class257.field3384.method3513();
        class257.field3390.method3513();
        class262.field3441.method3513();
        class253.field3349.method3513();
        class266.method2459();
        class260.field3422.method3513();
        class260.field3423.method3513();
        class264.field3454.method3513();
        class263.method4586();
        class254.method1035();
        class225.method566();
        class228.method2444();
        ((class123) Statics.field1895).method2351();
        class96.field1422.method3513();
        Statics.field602.method4047();
        Statics.field1746.method4047();
        Statics.field1300.method4047();
        Statics.field326.method4047();
        Statics.field3722.method4047();
        Statics.field2074.method4047();
        Statics.field764.method4047();
        Statics.field1798.method4047();
        Statics.field243.method4047();
        Statics.field855.method4047();
        Statics.field784.method4047();
        Statics.field390.method4047();
    }

    @ObfuscatedName("l.fv(B)V")
    public static final void method130() {
        if (field1044 > 0) {
            method81();
        } else {
            field1077.method4940();
            method22(40);
            Statics.field388 = field868.method1880();
            field868.method1881();
        }
    }

    @ObfuscatedName("fi.fi(ZI)V")
    public static final void method3094(boolean arg0) {
        if (arg0) {
            field861 = class90.field1330 ? class149.field2080 : class149.field2075;
        } else {
            field861 = Statics.field2688.field1189.containsKey(class294.method3341(class90.field1325)) ? class149.field2081 : class149.field2076;
        }
    }

    @ObfuscatedName("client.fm(I)V")
    public final void method1402() {
        if (field905 > 1) {
            field905--;
        }
        if (field1044 > 0) {
            field1044--;
        }
        if (field870) {
            field870 = false;
            method130();
            return;
        }
        if (!field839) {
            method3983();
        }
        for (int var1 = 0; var1 < 100 && this.method1105(field868); var1++) {
        }
        if (field830 != 30) {
            return;
        }
        while (class305.method1698()) {
            class175 var2 = class175.method470(class172.field2375, field868.field1440);
            var2.field2403.method3107(0);
            int var3 = var2.field2403.field2488;
            class305.method478(var2.field2403);
            var2.field2403.method3120(var2.field2403.field2488 - var3);
            field868.method1879(var2);
        }
        if (field1077.field3816) {
            class175 var4 = class175.method470(class172.field2360, field868.field1440);
            var4.field2403.method3107(0);
            int var5 = var4.field2403.field2488;
            field1077.method4945(var4.field2403);
            var4.field2403.method3120(var4.field2403.field2488 - var5);
            field868.method1879(var4);
            field1077.method4942();
        }
        Object var6 = Statics.field15.field759;
        synchronized (Statics.field15.field759) {
            if (!field914) {
                Statics.field15.field767 = 0;
            } else if (class60.field677 != 0 || Statics.field15.field767 >= 40) {
                class175 var7 = class175.method470(class172.field2341, field868.field1440);
                var7.field2403.method3107(0);
                int var8 = var7.field2403.field2488;
                int var9 = 0;
                for (int var10 = 0; var10 < Statics.field15.field767 && var7.field2403.field2488 - var8 < 240; var10++) {
                    var9++;
                    int var11 = Statics.field15.field763[var10];
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 502) {
                        var11 = 502;
                    }
                    int var12 = Statics.field15.field760[var10];
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 764) {
                        var12 = 764;
                    }
                    int var13 = var11 * 765 + var12;
                    if (Statics.field15.field763[var10] == -1 && Statics.field15.field760[var10] == -1) {
                        var12 = -1;
                        var11 = -1;
                        var13 = 524287;
                    }
                    if (field1066 != var12 || field835 != var11) {
                        int var14 = var12 - field1066;
                        field1066 = var12;
                        int var15 = var11 - field835;
                        field835 = var11;
                        if (field916 < 8 && var14 >= -32 && var14 <= 31 && var15 >= -32 && var15 <= 31) {
                            var14 += 32;
                            var15 += 32;
                            var7.field2403.method3250((field916 << 12) + (var14 << 6) + var15);
                            field916 = 0;
                        } else if (field916 < 8) {
                            var7.field2403.method3109((field916 << 19) + 8388608 + var13);
                            field916 = 0;
                        } else {
                            var7.field2403.method3110((field916 << 19) + -1073741824 + var13);
                            field916 = 0;
                        }
                    } else if (field916 < 2047) {
                        field916++;
                    }
                }
                var7.field2403.method3120(var7.field2403.field2488 - var8);
                field868.method1879(var7);
                if (var9 >= Statics.field15.field767) {
                    Statics.field15.field767 = 0;
                } else {
                    Statics.field15.field767 -= var9;
                    for (int var16 = 0; var16 < Statics.field15.field767; var16++) {
                        Statics.field15.field760[var16] = Statics.field15.field760[var9 + var16];
                        Statics.field15.field763[var16] = Statics.field15.field763[var9 + var16];
                    }
                }
            }
        }
        if (class60.field677 == 1 || !Statics.field848 && class60.field677 == 4 || class60.field677 == 2) {
            long var18 = (class60.field673 - field833) / 50L;
            if (var18 > 4095L) {
                var18 = 4095L;
            }
            field833 = class60.field673;
            int var20 = class60.field671;
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > Statics.field3453) {
                var20 = Statics.field3453;
            }
            int var21 = class60.field678;
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > Statics.field408) {
                var21 = Statics.field408;
            }
            int var22 = (int) var18;
            class175 var23 = class175.method470(class172.field2344, field868.field1440);
            var23.field2403.method3250((class60.field677 == 2 ? 1 : 0) + (var22 << 1));
            var23.field2403.method3250(var21);
            var23.field2403.method3250(var20);
            field868.method1879(var23);
        }
        if (class51.field593 > 0) {
            class175 var24 = class175.method470(class172.field2363, field868.field1440);
            var24.field2403.method3250(0);
            int var25 = var24.field2403.field2488;
            long var26 = class187.method35();
            for (int var28 = 0; var28 < class51.field593; var28++) {
                long var29 = var26 - field823;
                if (var29 > 16777215L) {
                    var29 = 16777215L;
                }
                field823 = var26;
                var24.field2403.method3148(class51.field592[var28]);
                var24.field2403.method3163((int) var29);
            }
            var24.field2403.method3210(var24.field2403.field2488 - var25);
            field868.method1879(var24);
        }
        if (field1078 > 0) {
            field1078--;
        }
        if (class51.field586[96] || class51.field586[97] || class51.field586[98] || class51.field586[99]) {
            field898 = true;
        }
        if (field898 && field1078 <= 0) {
            field1078 = 20;
            field898 = false;
            class175 var31 = class175.method470(class172.field2331, field868.field1440);
            var31.field2403.method3156(field853);
            var31.field2403.method3156(field890);
            field868.method1879(var31);
        }
        if (Statics.field306 && !field846) {
            field846 = true;
            class175 var32 = class175.method470(class172.field2316, field868.field1440);
            var32.field2403.method3107(1);
            field868.method1879(var32);
        }
        if (!Statics.field306 && field846) {
            field846 = false;
            class175 var33 = class175.method470(class172.field2316, field868.field1440);
            var33.field2403.method3107(0);
            field868.method1879(var33);
        }
        method684();
        if (Statics.field780 != field953) {
            field953 = Statics.field780;
            Statics.method254(Statics.field780);
        }
        if (field830 != 30) {
            return;
        }
        method2798();
        method3652();
        field868.field1451++;
        if (field868.field1451 > 750) {
            method130();
            return;
        }
        method569();
        for (int var34 = 0; var34 < field864; var34++) {
            int var35 = field865[var34];
            class84 var36 = field837[var35];
            if (var36 != null) {
                method182(var36, var36.field1259.field3612);
            }
        }
        method159();
        field883++;
        if (field917 != 0) {
            field872 += 20;
            if (field872 >= 400) {
                field917 = 0;
            }
        }
        if (Statics.field350 != null) {
            field882++;
            if (field882 >= 15) {
                method924(Statics.field350);
                Statics.field350 = null;
            }
        }
        class228 var37 = Statics.field3288;
        class228 var38 = Statics.field26;
        Statics.field3288 = null;
        Statics.field26 = null;
        field859 = null;
        field989 = false;
        field986 = false;
        field1029 = 0;
        while (class51.method4333() && field1029 < 128) {
            if (field957 >= 2 && class51.field586[82] && Statics.field428 == 66) {
                String var39 = "";
                Iterator var40 = class95.field1401.iterator();
                while (var40.hasNext()) {
                    class70 var41 = (class70) var40.next();
                    var39 = var39 + var41.field774 + ':' + var41.field779 + '\n';
                }
                Statics.field481.method821(var39);
            } else {
                field1031[field1029] = Statics.field428;
                field1030[field1029] = Statics.field723;
                field1029++;
            }
        }
        boolean var44 = field957 >= 2;
        if (var44 && class51.field586[82] && class51.field586[81] && field1006 != 0) {
            int var45 = Statics.field470.field809 - field1006;
            if (var45 < 0) {
                var45 = 0;
            } else if (var45 > 3) {
                var45 = 3;
            }
            if (Statics.field470.field809 != var45) {
                int var46 = Statics.field407 + Statics.field470.field1153[0];
                int var47 = Statics.field1272 + Statics.field470.field1154[0];
                class175 var48 = class175.method470(class172.field2376, field868.field1440);
                var48.field2403.method3107(var45);
                var48.field2403.method3157(var46);
                var48.field2403.method3250(var47);
                field868.method1879(var48);
            }
            field1006 = 0;
        }
        if (field968 != -1) {
            method4324(field968, 0, 0, Statics.field408, Statics.field3453, 0, 0);
        }
        field993++;
        while (true) {
            class68 var49;
            class228 var50;
            class228 var51;
            do {
                var49 = (class68) field1008.method3570();
                if (var49 == null) {
                    while (true) {
                        class68 var52;
                        class228 var53;
                        class228 var54;
                        do {
                            var52 = (class68) field918.method3570();
                            if (var52 == null) {
                                while (true) {
                                    class68 var55;
                                    class228 var56;
                                    class228 var57;
                                    do {
                                        var55 = (class68) field1007.method3570();
                                        if (var55 == null) {
                                            this.method1106();
                                            if (Statics.field711 != null) {
                                                Statics.field711.method5257(Statics.field780, (Statics.field470.field1152 >> 7) + Statics.field407, (Statics.field470.field1117 >> 7) + Statics.field1272, false);
                                                Statics.field711.method5271();
                                            }
                                            if (field981 != null) {
                                                this.method1111();
                                            }
                                            if (Statics.field480 != null) {
                                                method924(Statics.field480);
                                                field925++;
                                                if (class60.field667 == 0) {
                                                    if (field924) {
                                                        if (Statics.field480 == Statics.field3733 && field923 != field1003) {
                                                            class228 var58 = Statics.field480;
                                                            byte var59 = 0;
                                                            if (field971 == 1 && var58.field2746 == 206) {
                                                                var59 = 1;
                                                            }
                                                            if (var58.field2728[field923] <= 0) {
                                                                var59 = 0;
                                                            }
                                                            if (class229.method2335(method920(var58))) {
                                                                int var60 = field1003;
                                                                int var61 = field923;
                                                                var58.field2728[var61] = var58.field2728[var60];
                                                                var58.field2858[var61] = var58.field2858[var60];
                                                                var58.field2728[var60] = -1;
                                                                var58.field2858[var60] = 0;
                                                            } else if (var59 == 1) {
                                                                int var62 = field1003;
                                                                int var63 = field923;
                                                                while (var62 != var63) {
                                                                    if (var62 > var63) {
                                                                        var58.method3960(var62 - 1, var62);
                                                                        var62--;
                                                                    } else if (var62 < var63) {
                                                                        var58.method3960(var62 + 1, var62);
                                                                        var62++;
                                                                    }
                                                                }
                                                            } else {
                                                                var58.method3960(field923, field1003);
                                                            }
                                                            class175 var64 = class175.method470(class172.field2322, field868.field1440);
                                                            var64.field2403.method3119(Statics.field480.field2739);
                                                            var64.field2403.method3147(var59);
                                                            var64.field2403.method3157(field923);
                                                            var64.field2403.method3121(field1003);
                                                            field868.method1879(var64);
                                                        }
                                                    } else if (this.method1107()) {
                                                        this.method1378(field915, field1045);
                                                    } else if (field946 > 0) {
                                                        method991(field915, field1045);
                                                    }
                                                    field882 = 10;
                                                    class60.field677 = 0;
                                                    Statics.field480 = null;
                                                } else if (field925 >= 5 && (class60.field662 > field915 + 5 || class60.field662 < field915 - 5 || class60.field672 > field1045 + 5 || class60.field672 < field1045 - 5)) {
                                                    field924 = true;
                                                }
                                            }
                                            if (class137.method2655()) {
                                                int var65 = class137.field1965;
                                                int var66 = class137.field1966;
                                                class175 var67 = class175.method470(class172.field2328, field868.field1440);
                                                var67.field2403.method3107(5);
                                                var67.field2403.method3156(Statics.field1272 + var66);
                                                var67.field2403.method3121(Statics.field407 + var65);
                                                var67.field2403.method3148(class51.field586[82] ? (class51.field586[81] ? 2 : 1) : 0);
                                                field868.method1879(var67);
                                                class137.method2656();
                                                field945 = class60.field678;
                                                field921 = class60.field671;
                                                field917 = 1;
                                                field872 = 0;
                                                field1038 = var65;
                                                field1039 = var66;
                                            }
                                            if (Statics.field3288 != var37) {
                                                if (var37 != null) {
                                                    method924(var37);
                                                }
                                                if (Statics.field3288 != null) {
                                                    method924(Statics.field3288);
                                                }
                                            }
                                            if (Statics.field26 != var38 && field1012 == field1004) {
                                                if (var38 != null) {
                                                    method924(var38);
                                                }
                                                if (Statics.field26 != null) {
                                                    method924(Statics.field26);
                                                }
                                            }
                                            if (Statics.field26 == null) {
                                                if (field1012 > 0) {
                                                    field1012--;
                                                }
                                            } else if (field1012 < field1004) {
                                                field1012++;
                                                if (field1012 == field1004) {
                                                    method924(Statics.field26);
                                                }
                                            }
                                            int var68 = Statics.field470.field1152;
                                            int var69 = Statics.field470.field1117;
                                            if (Statics.field536 - var68 < -500 || Statics.field536 - var68 > 500 || Statics.field3730 - var69 < -500 || Statics.field3730 - var69 > 500) {
                                                Statics.field536 = var68;
                                                Statics.field3730 = var69;
                                            }
                                            if (Statics.field536 != var68) {
                                                Statics.field536 += (var68 - Statics.field536) / 16;
                                            }
                                            if (Statics.field3730 != var69) {
                                                Statics.field3730 += (var69 - Statics.field3730) / 16;
                                            }
                                            if (class60.field667 == 4 && Statics.field848) {
                                                int var70 = class60.field672 - field838;
                                                field893 = var70 * 2;
                                                field838 = var70 == -1 || var70 == 1 ? class60.field672 : (field838 + class60.field672) / 2;
                                                int var71 = field894 - class60.field662;
                                                field892 = var71 * 2;
                                                field894 = var71 == -1 || var71 == 1 ? class60.field662 : (field894 + class60.field662) / 2;
                                            } else {
                                                if (class51.field586[96]) {
                                                    field892 += (-24 - field892) / 2;
                                                } else if (class51.field586[97]) {
                                                    field892 += (24 - field892) / 2;
                                                } else {
                                                    field892 /= 2;
                                                }
                                                if (class51.field586[98]) {
                                                    field893 += (12 - field893) / 2;
                                                } else if (class51.field586[99]) {
                                                    field893 += (-12 - field893) / 2;
                                                } else {
                                                    field893 /= 2;
                                                }
                                                field838 = class60.field672;
                                                field894 = class60.field662;
                                            }
                                            field853 = field892 / 2 + field853 & 0x7FF;
                                            field890 += field893 / 2;
                                            if (field890 < 128) {
                                                field890 = 128;
                                            }
                                            if (field890 > 383) {
                                                field890 = 383;
                                            }
                                            int var72 = Statics.field536 >> 7;
                                            int var73 = Statics.field3730 >> 7;
                                            int var74 = method683(Statics.field536, Statics.field3730, Statics.field780);
                                            int var75 = 0;
                                            if (var72 > 3 && var73 > 3 && var72 < 100 && var73 < 100) {
                                                for (int var76 = var72 - 4; var76 <= var72 + 4; var76++) {
                                                    for (int var77 = var73 - 4; var77 <= var73 + 4; var77++) {
                                                        int var78 = Statics.field780;
                                                        if (var78 < 3 && (class62.field704[1][var76][var77] & 0x2) == 2) {
                                                            var78++;
                                                        }
                                                        int var79 = var74 - class62.field690[var78][var76][var77];
                                                        if (var79 > var75) {
                                                            var75 = var79;
                                                        }
                                                    }
                                                }
                                            }
                                            int var80 = var75 * 192;
                                            if (var80 > 98048) {
                                                var80 = 98048;
                                            }
                                            if (var80 < 32768) {
                                                var80 = 32768;
                                            }
                                            if (var80 > field899) {
                                                field899 += (var80 - field899) / 24;
                                            } else if (var80 < field899) {
                                                field899 += (var80 - field899) / 80;
                                            }
                                            if (field1052) {
                                                method672();
                                            }
                                            for (int var81 = 0; var81 < 5; var81++) {
                                                int var10002 = field1057[var81]++;
                                            }
                                            Statics.field701.method1816();
                                            int var82 = ++class60.field665 - 1;
                                            int var84 = class51.method935();
                                            if (var82 > 15000 && var84 > 15000) {
                                                field1044 = 250;
                                                class60.method582(14500);
                                                class175 var85 = class175.method470(class172.field2293, field868.field1440);
                                                field868.method1879(var85);
                                            }
                                            Statics.field2282.method1555();
                                            field868.field1439++;
                                            if (field868.field1439 > 50) {
                                                class175 var86 = class175.method470(class172.field2326, field868.field1440);
                                                field868.method1879(var86);
                                            }
                                            try {
                                                field868.method1878();
                                            } catch (IOException var88) {
                                                method130();
                                            }
                                            return;
                                        }
                                        var56 = var55.field750;
                                        if (var56.field2841 < 0) {
                                            break;
                                        }
                                        var57 = class228.method471(var56.field2758);
                                    } while (var57 == null || var57.field2794 == null || var56.field2841 >= var57.field2794.length || var57.field2794[var56.field2841] != var56);
                                    class81.method1724(var55);
                                }
                            }
                            var53 = var52.field750;
                            if (var53.field2841 < 0) {
                                break;
                            }
                            var54 = class228.method471(var53.field2758);
                        } while (var54 == null || var54.field2794 == null || var53.field2841 >= var54.field2794.length || var54.field2794[var53.field2841] != var53);
                        class81.method1724(var52);
                    }
                }
                var50 = var49.field750;
                if (var50.field2841 < 0) {
                    break;
                }
                var51 = class228.method471(var50.field2758);
            } while (var51 == null || var51.field2794 == null || var50.field2841 >= var51.field2794.length || var51.field2794[var50.field2841] != var50);
            class81.method1724(var49);
        }
    }

    @ObfuscatedName("jc.ff(B)V")
    public static final void method4774() {
        if (Statics.field2051 != null) {
            Statics.field2051.method2040();
        }
        if (Statics.field1249 != null) {
            Statics.field1249.method2040();
        }
    }

    @ObfuscatedName("hh.ge(B)V")
    public static final void method3652() {
        for (int var0 = 0; var0 < field1046; var0++) {
            int var10002 = field895[var0]--;
            if (field895[var0] >= -10) {
                class103 var2 = field856[var0];
                if (var2 == null) {
                    class103 var10000 = (class103) null;
                    var2 = class103.method1961(Statics.field326, field1047[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field895[var0] += var2.method1959();
                    field856[var0] = var2;
                }
                if (field895[var0] < 0) {
                    int var9;
                    if (field843[var0] == 0) {
                        var9 = field1009;
                    } else {
                        int var3 = (field843[var0] & 0xFF) * 128;
                        int var4 = field843[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field470.field1152;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field843[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field470.field1117;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field895[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field880 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class105 var10 = var2.method1965().method2004(Statics.field2407);
                        class115 var11 = class115.method2124(var10, 100, var9);
                        var11.method2126(field1048[var0] - 1);
                        Statics.field1252.method1938(var11);
                    }
                    field895[var0] = -100;
                }
            } else {
                field1046--;
                for (int var1 = var0; var1 < field1046; var1++) {
                    field1047[var1] = field1047[var1 + 1];
                    field856[var1] = field856[var1 + 1];
                    field1048[var1] = field1048[var1 + 1];
                    field895[var1] = field895[var1 + 1];
                    field843[var1] = field843[var1 + 1];
                }
                var0--;
            }
        }
        if (field1015 && !class215.method1863()) {
            if (field1041 != 0 && field1042 != -1) {
                class215.method2935(Statics.field2074, field1042, 0, field1041, false);
            }
            field1015 = false;
        }
    }

    @ObfuscatedName("ae.gv(Ljm;IIII)V")
    public static void method279(class272 arg0, int arg1, int arg2, int arg3) {
        if (field1046 >= 50 || field880 == 0 || arg0.field3663 == null || arg1 >= arg0.field3663.length) {
            return;
        }
        int var4 = arg0.field3663[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1047[field1046] = var5;
        field1048[field1046] = var6;
        field895[field1046] = 0;
        field856[field1046] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field843[field1046] = (var8 << 16) + (var9 << 8) + var7;
        field1046++;
    }

    @ObfuscatedName("br.gj(II)V")
    public static void method976(int arg0) {
        if (arg0 == -1 && !field1015) {
            Statics.field2596.method3673();
            class215.field2597 = 1;
            Statics.field1370 = null;
        } else if (arg0 != -1 && field1042 != arg0 && field1041 != 0 && !field1015) {
            class249 var1 = Statics.field2074;
            int var2 = field1041;
            class215.field2597 = 1;
            Statics.field1370 = var1;
            Statics.field2421 = arg0;
            Statics.field2506 = 0;
            Statics.field2598 = var2;
            Statics.field2595 = false;
            Statics.field1269 = 2;
        }
        field1042 = arg0;
    }

    @ObfuscatedName("by.gg(B)V")
    public static final void method684() {
        if (field950 != field832) {
            return;
        }
        if (Statics.field2926 != null) {
            Statics.field2926.method4693();
        }
        for (int var0 = 0; var0 < class93.field1379; var0++) {
            class72 var1 = field927[class93.field1380[var0]];
            var1.method1042();
        }
    }

    @ObfuscatedName("cd.gl(Lho;III)V")
    public static final void method1862(class228 arg0, int arg1, int arg2) {
        if (field1051 != 0 && field1051 != 3 || class60.field677 != 1 && Statics.field848 || class60.field677 != 4) {
            return;
        }
        class222 var3 = arg0.method3969(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field678 - arg1;
        int var5 = class60.field671 - arg2;
        if (!var3.method3856(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2687 / 2;
        int var7 = var5 - var3.field2685 / 2;
        int var8 = field853 & 0x7FF;
        int var9 = class134.field1889[var8];
        int var10 = class134.field1911[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field470.field1152 + var11 >> 7;
        int var14 = Statics.field470.field1117 - var12 >> 7;
        class175 var15 = class175.method470(class172.field2367, field868.field1440);
        var15.field2403.method3107(18);
        var15.field2403.method3156(Statics.field1272 + var14);
        var15.field2403.method3121(Statics.field407 + var13);
        var15.field2403.method3148(class51.field586[82] ? (class51.field586[81] ? 2 : 1) : 0);
        var15.field2403.method3107(var6);
        var15.field2403.method3107(var7);
        var15.field2403.method3250(field853);
        var15.field2403.method3107(57);
        var15.field2403.method3107(0);
        var15.field2403.method3107(0);
        var15.field2403.method3107(89);
        var15.field2403.method3250(Statics.field470.field1152);
        var15.field2403.method3250(Statics.field470.field1117);
        var15.field2403.method3107(63);
        field868.method1879(var15);
        field1038 = var13;
        field1039 = var14;
    }

    @ObfuscatedName("u.gx(I)V")
    public static final void method159() {
        int[] var0 = class93.field1380;
        for (int var1 = 0; var1 < class93.field1379; var1++) {
            class72 var2 = field927[var0[var1]];
            if (var2 != null && var2.field1114 > 0) {
                var2.field1114--;
                if (var2.field1114 == 0) {
                    var2.field1111 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field864; var3++) {
            int var4 = field865[var3];
            class84 var5 = field837[var4];
            if (var5 != null && var5.field1114 > 0) {
                var5.field1114--;
                if (var5.field1114 == 0) {
                    var5.field1111 = null;
                }
            }
        }
    }

    @ObfuscatedName("al.gc(I)V")
    public static final void method672() {
        int var0 = Statics.field3782 * 128 + 64;
        int var1 = Statics.field323 * 128 + 64;
        int var2 = method683(var0, var1, Statics.field780) - Statics.field682;
        if (Statics.field1158 < var0) {
            Statics.field1158 += Statics.field492 * (var0 - Statics.field1158) / 1000 + Statics.field2037;
            if (Statics.field1158 > var0) {
                Statics.field1158 = var0;
            }
        }
        if (Statics.field1158 > var0) {
            Statics.field1158 -= Statics.field492 * (Statics.field1158 - var0) / 1000 + Statics.field2037;
            if (Statics.field1158 < var0) {
                Statics.field1158 = var0;
            }
        }
        if (Statics.field683 < var2) {
            Statics.field683 += Statics.field492 * (var2 - Statics.field683) / 1000 + Statics.field2037;
            if (Statics.field683 > var2) {
                Statics.field683 = var2;
            }
        }
        if (Statics.field683 > var2) {
            Statics.field683 -= Statics.field492 * (Statics.field683 - var2) / 1000 + Statics.field2037;
            if (Statics.field683 < var2) {
                Statics.field683 = var2;
            }
        }
        if (Statics.field603 < var1) {
            Statics.field603 += Statics.field492 * (var1 - Statics.field603) / 1000 + Statics.field2037;
            if (Statics.field603 > var1) {
                Statics.field603 = var1;
            }
        }
        if (Statics.field603 > var1) {
            Statics.field603 -= Statics.field492 * (Statics.field603 - var1) / 1000 + Statics.field2037;
            if (Statics.field603 < var1) {
                Statics.field603 = var1;
            }
        }
        int var3 = Statics.field1410 * 128 + 64;
        int var4 = Statics.field1159 * 128 + 64;
        int var5 = method683(var3, var4, Statics.field780) - Statics.field599;
        int var6 = var3 - Statics.field1158;
        int var7 = var5 - Statics.field683;
        int var8 = var4 - Statics.field603;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1923 < var10) {
            Statics.field1923 += Statics.field295 * (var10 - Statics.field1923) / 1000 + Statics.field3719;
            if (Statics.field1923 > var10) {
                Statics.field1923 = var10;
            }
        }
        if (Statics.field1923 > var10) {
            Statics.field1923 -= Statics.field295 * (Statics.field1923 - var10) / 1000 + Statics.field3719;
            if (Statics.field1923 < var10) {
                Statics.field1923 = var10;
            }
        }
        int var12 = var11 - Statics.field437;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field437 += Statics.field295 * var12 / 1000 + Statics.field3719;
            Statics.field437 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field437 -= Statics.field295 * -var12 / 1000 + Statics.field3719;
            Statics.field437 &= 0x7FF;
        }
        int var13 = var11 - Statics.field437;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field437 = var11;
        }
    }

    @ObfuscatedName("ac.gp(I)V")
    public static final void method569() {
        int var0 = class93.field1379;
        int[] var1 = class93.field1380;
        for (int var2 = 0; var2 < var0; var2++) {
            class72 var3 = field927[var1[var2]];
            if (var3 != null) {
                method182(var3, 1);
            }
        }
    }

    @ObfuscatedName("c.gd(Lbx;IB)V")
    public static final void method182(class75 arg0, int arg1) {
        if (arg0.field1144 > field832) {
            method1721(arg0);
        } else if (arg0.field1108 >= field832) {
            if (field832 == arg0.field1108 || arg0.field1130 == -1 || arg0.field1101 != 0 || arg0.field1124 + 1 > class272.method2308(arg0.field1130).field3670[arg0.field1098]) {
                int var2 = arg0.field1108 - arg0.field1144;
                int var3 = field832 - arg0.field1144;
                int var4 = arg0.field1128 * 64 + arg0.field1121 * 128;
                int var5 = arg0.field1142 * 128 + arg0.field1128 * 64;
                int var6 = arg0.field1141 * 128 + arg0.field1128 * 64;
                int var7 = arg0.field1143 * 128 + arg0.field1128 * 64;
                arg0.field1152 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field1117 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field1137 = 0;
            arg0.field1149 = arg0.field1146;
            arg0.field1100 = arg0.field1149;
        } else {
            arg0.field1127 = arg0.field1103;
            if (arg0.field1099 == 0) {
                arg0.field1137 = 0;
            } else {
                label334: {
                    if (arg0.field1130 != -1 && arg0.field1101 == 0) {
                        class272 var8 = class272.method2308(arg0.field1130);
                        if (arg0.field1157 > 0 && var8.field3671 == 0) {
                            arg0.field1137++;
                            break label334;
                        }
                        if (arg0.field1157 <= 0 && var8.field3672 == 0) {
                            arg0.field1137++;
                            break label334;
                        }
                    }
                    int var9 = arg0.field1152;
                    int var10 = arg0.field1117;
                    int var11 = arg0.field1153[arg0.field1099 - 1] * 128 + arg0.field1128 * 64;
                    int var12 = arg0.field1154[arg0.field1099 - 1] * 128 + arg0.field1128 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field1149 = 1280;
                        } else if (var10 > var12) {
                            arg0.field1149 = 1792;
                        } else {
                            arg0.field1149 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field1149 = 768;
                        } else if (var10 > var12) {
                            arg0.field1149 = 256;
                        } else {
                            arg0.field1149 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field1149 = 1024;
                    } else if (var10 > var12) {
                        arg0.field1149 = 0;
                    }
                    byte var13 = arg0.field1155[arg0.field1099 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field1149 - arg0.field1100 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field1145;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field1106;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field1109;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field1105;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field1106;
                        }
                        arg0.field1127 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class84) {
                            var17 = ((class84) arg0).field1259.field3620;
                        }
                        if (var17) {
                            if (arg0.field1149 != arg0.field1100 && arg0.field1113 == -1 && arg0.field1151 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field1099 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field1099 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field1137 > 0 && arg0.field1099 > 1) {
                                var16 = 8;
                                arg0.field1137--;
                            }
                        } else {
                            if (arg0.field1099 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field1099 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field1137 > 0 && arg0.field1099 > 1) {
                                var16 = 8;
                                arg0.field1137--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field1127 == arg0.field1106 && arg0.field1110 != -1) {
                            arg0.field1127 = arg0.field1110;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field1152 += var16;
                                if (arg0.field1152 > var11) {
                                    arg0.field1152 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field1152 -= var16;
                                if (arg0.field1152 < var11) {
                                    arg0.field1152 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field1117 += var16;
                                if (arg0.field1117 > var12) {
                                    arg0.field1117 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field1117 -= var16;
                                if (arg0.field1117 < var12) {
                                    arg0.field1117 = var12;
                                }
                            }
                        }
                        if (arg0.field1152 == var11 && arg0.field1117 == var12) {
                            arg0.field1099--;
                            if (arg0.field1157 > 0) {
                                arg0.field1157--;
                            }
                        }
                    } else {
                        arg0.field1152 = var11;
                        arg0.field1117 = var12;
                        arg0.field1099--;
                        if (arg0.field1157 > 0) {
                            arg0.field1157--;
                        }
                    }
                }
            }
        }
        if (arg0.field1152 < 128 || arg0.field1117 < 128 || arg0.field1152 >= 13184 || arg0.field1117 >= 13184) {
            arg0.field1130 = -1;
            arg0.field1135 = -1;
            arg0.field1144 = 0;
            arg0.field1108 = 0;
            arg0.field1152 = arg0.field1153[0] * 128 + arg0.field1128 * 64;
            arg0.field1117 = arg0.field1154[0] * 128 + arg0.field1128 * 64;
            arg0.method1467();
        }
        if (Statics.field470 == arg0 && (arg0.field1152 < 1536 || arg0.field1117 < 1536 || arg0.field1152 >= 11776 || arg0.field1117 >= 11776)) {
            arg0.field1130 = -1;
            arg0.field1135 = -1;
            arg0.field1144 = 0;
            arg0.field1108 = 0;
            arg0.field1152 = arg0.field1153[0] * 128 + arg0.field1128 * 64;
            arg0.field1117 = arg0.field1154[0] * 128 + arg0.field1128 * 64;
            arg0.method1467();
        }
        method624(arg0);
        arg0.field1133 = false;
        if (arg0.field1127 != -1) {
            class272 var18 = class272.method2308(arg0.field1127);
            if (var18 == null || var18.field3660 == null) {
                arg0.field1127 = -1;
            } else {
                arg0.field1156++;
                if (arg0.field1118 < var18.field3660.length && arg0.field1156 > var18.field3670[arg0.field1118]) {
                    arg0.field1156 = 1;
                    arg0.field1118++;
                    method279(var18, arg0.field1118, arg0.field1152, arg0.field1117);
                }
                if (arg0.field1118 >= var18.field3660.length) {
                    arg0.field1156 = 0;
                    arg0.field1118 = 0;
                    method279(var18, arg0.field1118, arg0.field1152, arg0.field1117);
                }
            }
        }
        if (arg0.field1135 != -1 && field832 >= arg0.field1147) {
            if (arg0.field1136 < 0) {
                arg0.field1136 = 0;
            }
            int var19 = class257.method82(arg0.field1135).field3396;
            if (var19 == -1) {
                arg0.field1135 = -1;
            } else {
                class272 var20 = class272.method2308(var19);
                if (var20 == null || var20.field3660 == null) {
                    arg0.field1135 = -1;
                } else {
                    arg0.field1132++;
                    if (arg0.field1136 < var20.field3660.length && arg0.field1132 > var20.field3670[arg0.field1136]) {
                        arg0.field1132 = 1;
                        arg0.field1136++;
                        method279(var20, arg0.field1136, arg0.field1152, arg0.field1117);
                    }
                    if (arg0.field1136 >= var20.field3660.length && (arg0.field1136 < 0 || arg0.field1136 >= var20.field3660.length)) {
                        arg0.field1135 = -1;
                    }
                }
            }
        }
        if (arg0.field1130 != -1 && arg0.field1101 <= 1) {
            class272 var21 = class272.method2308(arg0.field1130);
            if (var21.field3671 == 1 && arg0.field1157 > 0 && arg0.field1144 <= field832 && arg0.field1108 < field832) {
                arg0.field1101 = 1;
                return;
            }
        }
        if (arg0.field1130 != -1 && arg0.field1101 == 0) {
            class272 var22 = class272.method2308(arg0.field1130);
            if (var22 == null || var22.field3660 == null) {
                arg0.field1130 = -1;
            } else {
                arg0.field1124++;
                if (arg0.field1098 < var22.field3660.length && arg0.field1124 > var22.field3670[arg0.field1098]) {
                    arg0.field1124 = 1;
                    arg0.field1098++;
                    method279(var22, arg0.field1098, arg0.field1152, arg0.field1117);
                }
                if (arg0.field1098 >= var22.field3660.length) {
                    arg0.field1098 -= var22.field3664;
                    arg0.field1134++;
                    if (arg0.field1134 >= var22.field3669) {
                        arg0.field1130 = -1;
                    } else if (arg0.field1098 >= 0 && arg0.field1098 < var22.field3660.length) {
                        method279(var22, arg0.field1098, arg0.field1152, arg0.field1117);
                    } else {
                        arg0.field1130 = -1;
                    }
                }
                arg0.field1133 = var22.field3666;
            }
        }
        if (arg0.field1101 > 0) {
            arg0.field1101--;
        }
    }

    @ObfuscatedName("cl.go(Lbx;I)V")
    public static final void method1721(class75 arg0) {
        int var1 = arg0.field1144 - field832;
        int var2 = arg0.field1128 * 64 + arg0.field1121 * 128;
        int var3 = arg0.field1142 * 128 + arg0.field1128 * 64;
        arg0.field1152 += (var2 - arg0.field1152) / var1;
        arg0.field1117 += (var3 - arg0.field1117) / var1;
        arg0.field1137 = 0;
        arg0.field1149 = arg0.field1146;
    }

    @ObfuscatedName("ak.gq(Lbx;I)V")
    public static final void method624(class75 arg0) {
        if (arg0.field1151 == 0) {
            return;
        }
        if (arg0.field1113 != -1) {
            class75 var1 = null;
            if (arg0.field1113 < 32768) {
                var1 = field837[arg0.field1113];
            } else if (arg0.field1113 >= 32768) {
                var1 = field927[arg0.field1113 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1152 - var1.field1152;
                int var3 = arg0.field1117 - var1.field1117;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1149 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1125) {
                arg0.field1113 = -1;
                arg0.field1125 = false;
            }
        }
        if (arg0.field1126 != -1 && (arg0.field1099 == 0 || arg0.field1137 > 0)) {
            arg0.field1149 = arg0.field1126;
            arg0.field1126 = -1;
        }
        int var4 = arg0.field1149 - arg0.field1100 & 0x7FF;
        if (var4 == 0 && arg0.field1125) {
            arg0.field1113 = -1;
            arg0.field1125 = false;
        }
        if (var4 == 0) {
            arg0.field1140 = 0;
            return;
        }
        arg0.field1140++;
        if (var4 > 1024) {
            arg0.field1100 -= arg0.field1151;
            boolean var5 = true;
            if (var4 < arg0.field1151 || var4 > 2048 - arg0.field1151) {
                arg0.field1100 = arg0.field1149;
                var5 = false;
            }
            if (arg0.field1127 == arg0.field1103 && (arg0.field1140 > 25 || var5)) {
                if (arg0.field1107 == -1) {
                    arg0.field1127 = arg0.field1106;
                } else {
                    arg0.field1127 = arg0.field1107;
                }
            }
        } else {
            arg0.field1100 += arg0.field1151;
            boolean var6 = true;
            if (var4 < arg0.field1151 || var4 > 2048 - arg0.field1151) {
                arg0.field1100 = arg0.field1149;
                var6 = false;
            }
            if (arg0.field1127 == arg0.field1103 && (arg0.field1140 > 25 || var6)) {
                if (arg0.field1150 == -1) {
                    arg0.field1127 = arg0.field1106;
                } else {
                    arg0.field1127 = arg0.field1150;
                }
            }
        }
        arg0.field1100 &= 0x7FF;
    }

    @ObfuscatedName("b.ga(Lbc;IIB)V")
    public static void method180(class72 arg0, int arg1, int arg2) {
        if (arg0.field1130 == arg1 && arg1 != -1) {
            int var3 = class272.method2308(arg1).field3673;
            if (var3 == 1) {
                arg0.field1098 = 0;
                arg0.field1124 = 0;
                arg0.field1101 = arg2;
                arg0.field1134 = 0;
            }
            if (var3 == 2) {
                arg0.field1134 = 0;
            }
        } else if (arg1 == -1 || arg0.field1130 == -1 || class272.method2308(arg1).field3667 >= class272.method2308(arg0.field1130).field3667) {
            arg0.field1130 = arg1;
            arg0.field1098 = 0;
            arg0.field1124 = 0;
            arg0.field1101 = arg2;
            arg0.field1134 = 0;
            arg0.field1157 = arg0.field1099;
        }
    }

    @ObfuscatedName("bi.gn(I)I")
    public static int method1528() {
        return field879 ? 2 : 1;
    }

    @ObfuscatedName("cc.gz(IS)V")
    public static void method1659(int arg0) {
        field1021 = 0L;
        if (arg0 >= 2) {
            field879 = true;
        } else {
            field879 = false;
        }
        if (method1528() == 1) {
            Statics.field481.method733(765, 503);
        } else {
            Statics.field481.method733(7680, 2160);
        }
        if (field830 >= 25) {
            method4013();
        }
    }

    @ObfuscatedName("ig.gh(B)V")
    public static void method4013() {
        class175 var0 = class175.method470(class172.field2298, field868.field1440);
        var0.field2403.method3107(method1528());
        var0.field2403.method3250(Statics.field408);
        var0.field2403.method3250(Statics.field3453);
        field868.method1879(var0);
    }

    @ObfuscatedName("client.d(B)V")
    public final void method741() {
        field1021 = class187.method35() + 500L;
        this.method1103();
        if (field968 != -1) {
            this.method1109(true);
        }
    }

    @ObfuscatedName("client.gs(I)V")
    public void method1103() {
        int var1 = Statics.field408;
        int var2 = Statics.field3453;
        if (this.field657 < var1) {
            int var3 = this.field657;
        }
        if (this.field641 < var2) {
            int var4 = this.field641;
        }
        if (Statics.field2688 == null) {
            return;
        }
        try {
            client var5 = Statics.field481;
            Object[] var6 = new Object[] { method1528() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gi(S)V")
    public final void method1104() {
        if (field968 != -1) {
            method1479(field968);
        }
        for (int var1 = 0; var1 < field1011; var1++) {
            if (field1013[var1]) {
                field1014[var1] = true;
            }
            field834[var1] = field1013[var1];
            field1013[var1] = false;
        }
        field1025 = field832;
        field956 = -1;
        field1026 = -1;
        Statics.field3733 = null;
        if (field968 != -1) {
            field1011 = 0;
            method4239(field968, 0, 0, Statics.field408, Statics.field3453, 0, 0, -1);
        }
        class306.method4993();
        if (field839) {
            int var7 = Statics.field411;
            int var8 = Statics.field261;
            int var9 = Statics.field795;
            int var10 = Statics.field2001;
            int var11 = 6116423;
            class306.method5002(var7, var8, var9, var10, var11);
            class306.method5002(var7 + 1, var8 + 1, var9 - 2, 16, 0);
            class306.method5009(var7 + 1, var8 + 18, var9 - 2, var10 - 19, 0);
            Statics.field1288.method4830(class237.field2961, var7 + 3, var8 + 14, var11, -1);
            int var12 = class60.field662;
            int var13 = class60.field672;
            for (int var14 = 0; var14 < field946; var14++) {
                int var15 = (field946 - 1 - var14) * 15 + var8 + 31;
                int var16 = 16777215;
                if (var12 > var7 && var12 < var7 + var9 && var13 > var15 - 13 && var13 < var15 + 3) {
                    var16 = 16776960;
                }
                class287 var17 = Statics.field1288;
                String var18;
                if (var14 < 0) {
                    var18 = "";
                } else if (field952[var14].length() > 0) {
                    var18 = field951[var14] + class237.field3109 + field952[var14];
                } else {
                    var18 = field951[var14];
                }
                var17.method4830(var18, var7 + 3, var15, var16, 0);
            }
            int var19 = Statics.field411;
            int var20 = Statics.field261;
            int var21 = Statics.field795;
            int var22 = Statics.field2001;
            for (int var23 = 0; var23 < field1011; var23++) {
                if (field836[var23] + field1027[var23] > var19 && field1027[var23] < var19 + var21 && field922[var23] + field826[var23] > var20 && field826[var23] < var20 + var22) {
                    field1014[var23] = true;
                }
            }
        } else if (field956 != -1) {
            int var2 = field956;
            int var3 = field1026;
            if (field946 >= 2 || field960 != 0 || field963) {
                int var4 = method334();
                String var5;
                if (field960 == 1 && field946 < 2) {
                    var5 = class237.field3064 + class237.field3109 + field962 + " " + class86.field1274;
                } else if (field963 && field946 < 2) {
                    var5 = field1002 + class237.field3109 + field967 + " " + class86.field1274;
                } else {
                    String var6;
                    if (var4 < 0) {
                        var6 = "";
                    } else if (field952[var4].length() > 0) {
                        var6 = field951[var4] + class237.field3109 + field952[var4];
                    } else {
                        var6 = field951[var4];
                    }
                    var5 = var6;
                }
                if (field946 > 2) {
                    var5 = var5 + class86.method3(16777215) + " " + '/' + " " + (field946 - 2) + class237.field3097;
                }
                Statics.field1288.method4826(var5, var2 + 4, var3 + 15, 16777215, 0, field832 / 1000);
            }
        }
        if (field1020 == 3) {
            for (int var24 = 0; var24 < field1011; var24++) {
                if (field834[var24]) {
                    class306.method5001(field1027[var24], field826[var24], field836[var24], field922[var24], 16711935, 128);
                } else if (field1014[var24]) {
                    class306.method5001(field1027[var24], field826[var24], field836[var24], field922[var24], 16711680, 128);
                }
            }
        }
        class80.method1031(Statics.field780, Statics.field470.field1152, Statics.field470.field1117, field883);
        field883 = 0;
    }

    @ObfuscatedName("bk.gt(Ljava/lang/String;ZS)V")
    public static final void method993(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field234.method4815(arg0, 250);
        int var6 = Statics.field234.method4813(arg0, 250) * 13;
        class306.method5002(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class306.method5009(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field234.method4822(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1091(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3432.method712(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field1011; var11++) {
            if (field836[var11] + field1027[var11] > var7 && field1027[var11] < var7 + var9 && field922[var11] + field826[var11] > var8 && field826[var11] < var8 + var10) {
                field1014[var11] = true;
            }
        }
    }

    @ObfuscatedName("s.gm(IIIII)V")
    public static final void method7(int arg0, int arg1, int arg2, int arg3) {
        field822++;
        if (Statics.field470.field1152 >> 7 == field1038 && Statics.field470.field1117 >> 7 == field1039) {
            field1038 = 0;
        }
        method157();
        method490();
        method52(true);
        int var4 = class93.field1379;
        int[] var5 = class93.field1380;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field936 != var5[var6] && field928 != var5[var6]) {
                method3099(field927[var5[var6]], true);
            }
        }
        method52(false);
        method468();
        for (class82 var7 = (class82) field940.method3581(); var7 != null; var7 = (class82) field940.method3597()) {
            if (Statics.field780 != var7.field1238 || var7.field1245) {
                var7.method3561();
            } else if (field832 >= var7.field1237) {
                var7.method1682(field883);
                if (var7.field1245) {
                    var7.method3561();
                } else {
                    Statics.field569.method2627(var7.field1238, var7.field1239, var7.field1241, var7.field1236, 60, var7, 0, -1, false);
                }
            }
        }
        method978(arg0, arg1, arg2, arg3, true);
        int var8 = field1075;
        int var9 = field1067;
        int var10 = field1068;
        int var11 = field912;
        class306.method5029(var8, var9, var8 + var10, var9 + var11);
        class134.method2547();
        if (!field1052) {
            int var12 = field890;
            if (field899 / 256 > var12) {
                var12 = field899 / 256;
            }
            if (field1053[4] && field1055[4] + 128 > var12) {
                var12 = field1055[4] + 128;
            }
            int var13 = field853 & 0x7FF;
            method555(Statics.field536, method683(Statics.field470.field1152, Statics.field470.field1117, Statics.field780) - field896, Statics.field3730, var12, var13, var12 * 3 + 600);
        }
        int var14;
        if (field1052) {
            var14 = method4578();
        } else {
            var14 = method245();
        }
        int var15 = Statics.field1158;
        int var16 = Statics.field683;
        int var17 = Statics.field603;
        int var18 = Statics.field1923;
        int var19 = Statics.field437;
        for (int var20 = 0; var20 < 5; var20++) {
            if (field1053[var20]) {
                int var21 = (int) (Math.random() * (double) (field909[var20] * 2 + 1) - (double) field909[var20] + Math.sin((double) field1056[var20] / 100.0D * (double) field1057[var20]) * (double) field1055[var20]);
                if (var20 == 0) {
                    Statics.field1158 += var21;
                }
                if (var20 == 1) {
                    Statics.field683 += var21;
                }
                if (var20 == 2) {
                    Statics.field603 += var21;
                }
                if (var20 == 3) {
                    Statics.field437 = Statics.field437 + var21 & 0x7FF;
                }
                if (var20 == 4) {
                    Statics.field1923 += var21;
                    if (Statics.field1923 < 128) {
                        Statics.field1923 = 128;
                    }
                    if (Statics.field1923 > 383) {
                        Statics.field1923 = 383;
                    }
                }
            }
        }
        int var22 = class60.field662;
        int var23 = class60.field672;
        if (class60.field677 != 0) {
            var22 = class60.field678;
            var23 = class60.field671;
        }
        if (var22 >= var8 && var22 < var8 + var10 && var23 >= var9 && var23 < var9 + var11) {
            int var24 = var22 - var8;
            int var25 = var23 - var9;
            class132.field1871 = var24;
            class132.field1872 = var25;
            class132.field1877 = true;
            class132.field1878 = 0;
            class132.field1873 = false;
        } else {
            class132.method4012();
        }
        method4774();
        class306.method5002(var8, var9, var10, var11, 0);
        method4774();
        int var26 = class134.field1896;
        class134.field1896 = field1070;
        Statics.field569.method2657(Statics.field1158, Statics.field683, Statics.field603, Statics.field1923, Statics.field437, var14);
        class8.method4260();
        class134.field1896 = var26;
        method4774();
        Statics.field569.method2630();
        field825 = 0;
        boolean var27 = false;
        int var28 = -1;
        int var29 = class93.field1379;
        int[] var30 = class93.field1380;
        for (int var31 = 0; var31 < field864 + var29; var31++) {
            class75 var32;
            if (var31 < var29) {
                var32 = field927[var30[var31]];
                if (field936 == var30[var31]) {
                    var27 = true;
                    var28 = var31;
                    continue;
                }
            } else {
                var32 = field837[field865[var31 - var29]];
            }
            method9(var32, var31, var8, var9, var10, var11);
        }
        if (var27) {
            method9(field927[field936], var28, var8, var9, var10, var11);
        }
        for (int var33 = 0; var33 < field825; var33++) {
            int var34 = field911[var33];
            int var35 = field903[var33];
            int var36 = field862[var33];
            int var37 = field904[var33];
            boolean var38 = true;
            while (var38) {
                var38 = false;
                for (int var39 = 0; var39 < var33; var39++) {
                    if (var35 + 2 > field903[var39] - field904[var39] && var35 - var37 < field903[var39] + 2 && var34 - var36 < field911[var39] + field862[var39] && var34 + var36 > field911[var39] - field862[var39] && field903[var39] - field904[var39] < var35) {
                        var35 = field903[var39] - field904[var39];
                        var38 = true;
                    }
                }
            }
            field907 = field911[var33];
            field913 = field903[var33] = var35;
            String var40 = field920[var33];
            if (field1043 == 0) {
                int var41 = 16776960;
                if (field906[var33] < 6) {
                    var41 = field1023[field906[var33]];
                }
                if (field906[var33] == 6) {
                    var41 = field822 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field906[var33] == 7) {
                    var41 = field822 % 20 < 10 ? 255 : 65535;
                }
                if (field906[var33] == 8) {
                    var41 = field822 % 20 < 10 ? 45056 : 8454016;
                }
                if (field906[var33] == 9) {
                    int var42 = 150 - field908[var33];
                    if (var42 < 50) {
                        var41 = var42 * 1280 + 16711680;
                    } else if (var42 < 100) {
                        var41 = 16776960 - (var42 - 50) * 327680;
                    } else if (var42 < 150) {
                        var41 = (var42 - 100) * 5 + 65280;
                    }
                }
                if (field906[var33] == 10) {
                    int var43 = 150 - field908[var33];
                    if (var43 < 50) {
                        var41 = var43 * 5 + 16711680;
                    } else if (var43 < 100) {
                        var41 = 16711935 - (var43 - 50) * 327680;
                    } else if (var43 < 150) {
                        var41 = (var43 - 100) * 327680 + 255 - (var43 - 100) * 5;
                    }
                }
                if (field906[var33] == 11) {
                    int var44 = 150 - field908[var33];
                    if (var44 < 50) {
                        var41 = 16777215 - var44 * 327685;
                    } else if (var44 < 100) {
                        var41 = (var44 - 50) * 327685 + 65280;
                    } else if (var44 < 150) {
                        var41 = 16777215 - (var44 - 100) * 327680;
                    }
                }
                if (field888[var33] == 0) {
                    Statics.field1288.method4821(var40, field907 + var8, field913 + var9, var41, 0);
                }
                if (field888[var33] == 1) {
                    Statics.field1288.method4823(var40, field907 + var8, field913 + var9, var41, 0, field822);
                }
                if (field888[var33] == 2) {
                    Statics.field1288.method4824(var40, field907 + var8, field913 + var9, var41, 0, field822);
                }
                if (field888[var33] == 3) {
                    Statics.field1288.method4825(var40, field907 + var8, field913 + var9, var41, 0, field822, 150 - field908[var33]);
                }
                if (field888[var33] == 4) {
                    int var45 = (150 - field908[var33]) * (Statics.field1288.method4848(var40) + 100) / 150;
                    class306.method4995(field907 + var8 - 50, var9, field907 + var8 + 50, var9 + var11);
                    Statics.field1288.method4830(var40, field907 + var8 + 50 - var45, field913 + var9, var41, 0);
                    class306.method5029(var8, var9, var8 + var10, var9 + var11);
                }
                if (field888[var33] == 5) {
                    int var46 = 150 - field908[var33];
                    int var47 = 0;
                    if (var46 < 25) {
                        var47 = var46 - 25;
                    } else if (var46 > 125) {
                        var47 = var46 - 125;
                    }
                    class306.method4995(var8, field913 + var9 - Statics.field1288.field3746 - 1, var8 + var10, field913 + var9 + 5);
                    Statics.field1288.method4821(var40, field907 + var8, field913 + var9 + var47, var41, 0);
                    class306.method5029(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field1288.method4821(var40, field907 + var8, field913 + var9, 16776960, 0);
            }
        }
        method6(var8, var9);
        ((class123) Statics.field1895).method2344(field883);
        if (field917 == 1) {
            Statics.field503[field872 / 100].method5123(field945 - 8, field921 - 8);
        }
        if (field917 == 2) {
            Statics.field503[field872 / 100 + 4].method5123(field945 - 8, field921 - 8);
        }
        field1040 = 0;
        int var48 = (Statics.field470.field1152 >> 7) + Statics.field407;
        int var49 = (Statics.field470.field1117 >> 7) + Statics.field1272;
        if (var48 >= 3053 && var48 <= 3156 && var49 >= 3056 && var49 <= 3136) {
            field1040 = 1;
        }
        if (var48 >= 3072 && var48 <= 3118 && var49 >= 9492 && var49 <= 9535) {
            field1040 = 1;
        }
        if (field1040 == 1 && var48 >= 3139 && var48 <= 3199 && var49 >= 3008 && var49 <= 3062) {
            field1040 = 0;
        }
        Statics.field1158 = var15;
        Statics.field683 = var16;
        Statics.field603 = var17;
        Statics.field1923 = var18;
        Statics.field437 = var19;
        if (field831 && class250.method4015(true, false) == 0) {
            field831 = false;
        }
        if (field831) {
            class306.method5002(var8, var9, var10, var11, 0);
            method993(class237.field3098, false);
        }
    }

    @ObfuscatedName("bs.gr(IIIIZS)V")
    public static final void method978(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1059 - field1058) * var5 / 100 + field1058;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1064) {
            short var8 = field1064;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1063) {
                var6 = field1063;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class306.method4993();
                    class306.method5002(arg0, arg1, var10, arg3, -16777216);
                    class306.method5002(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1065) {
            short var11 = field1065;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1062) {
                var6 = field1062;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class306.method4993();
                    class306.method5002(arg0, arg1, arg2, var13, -16777216);
                    class306.method5002(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1061 - field857) * var5 / 100 + field857;
        field1070 = arg3 * var6 * var14 / 85504 << 1;
        if (field1068 != arg2 || field912 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class134.field1889[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class137.method2651(var15, 500, 800, arg2, arg3);
        }
        field1075 = arg0;
        field1067 = arg1;
        field1068 = arg2;
        field912 = arg3;
    }

    @ObfuscatedName("k.gk(I)V")
    public static void method157() {
        method3099(Statics.field470, false);
    }

    @ObfuscatedName("ag.gw(I)V")
    public static void method490() {
        if (field936 >= 0 && field927[field936] != null) {
            method3099(field927[field936], false);
        }
    }

    @ObfuscatedName("ff.gy(Lbc;ZI)V")
    public static void method3099(class72 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1048() || arg0.field808) {
            return;
        }
        int var2 = arg0.field810 << 14;
        arg0.field806 = false;
        if ((field827 && class93.field1379 > 50 || class93.field1379 > 200) && arg1 && arg0.field1127 == arg0.field1103) {
            arg0.field806 = true;
        }
        int var3 = arg0.field1152 >> 7;
        int var4 = arg0.field1117 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field801 != null && field832 >= arg0.field796 && field832 < arg0.field797) {
            arg0.field806 = false;
            arg0.field800 = method683(arg0.field1152, arg0.field1117, Statics.field780);
            Statics.field569.method2705(Statics.field780, arg0.field1152, arg0.field1117, arg0.field800, 60, arg0, arg0.field1100, var2, arg0.field802, arg0.field805, arg0.field804, arg0.field817);
            return;
        }
        if ((arg0.field1152 & 0x7F) == 64 && (arg0.field1117 & 0x7F) == 64) {
            if (field822 == field910[var3][var4]) {
                return;
            }
            field910[var3][var4] = field822;
        }
        arg0.field800 = method683(arg0.field1152, arg0.field1117, Statics.field780);
        Statics.field569.method2627(Statics.field780, arg0.field1152, arg0.field1117, arg0.field800, 60, arg0, arg0.field1100, var2, arg0.field1133);
    }

    @ObfuscatedName("m.gf(ZI)V")
    public static final void method52(boolean arg0) {
        for (int var1 = 0; var1 < field864; var1++) {
            class84 var2 = field837[field865[var1]];
            int var3 = (field865[var1] << 14) + 536870912;
            if (var2 != null && var2.method1048() && var2.field1259.field3640 == arg0 && var2.field1259.method4551()) {
                int var4 = var2.field1152 >> 7;
                int var5 = var2.field1117 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1128 == 1 && (var2.field1152 & 0x7F) == 64 && (var2.field1117 & 0x7F) == 64) {
                        if (field822 == field910[var4][var5]) {
                            continue;
                        }
                        field910[var4][var5] = field822;
                    }
                    if (!var2.field1259.field3631) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field569.method2627(Statics.field780, var2.field1152, var2.field1117, method683(var2.field1152 + (var2.field1128 * 64 - 64), var2.field1117 + (var2.field1128 * 64 - 64), Statics.field780), var2.field1128 * 64 - 64 + 60, var2, var2.field1100, var3, var2.field1133);
                }
            }
        }
    }

    @ObfuscatedName("au.gb(I)V")
    public static final void method468() {
        for (class91 var0 = (class91) field939.method3581(); var0 != null; var0 = (class91) field939.method3597()) {
            if (Statics.field780 != var0.field1355 || field832 > var0.field1349) {
                var0.method3561();
            } else if (field832 >= var0.field1352) {
                if (var0.field1346 > 0) {
                    class84 var1 = field837[var0.field1346 - 1];
                    if (var1 != null && var1.field1152 >= 0 && var1.field1152 < 13312 && var1.field1117 >= 0 && var1.field1117 < 13312) {
                        var0.method1775(var1.field1152, var1.field1117, method683(var1.field1152, var1.field1117, var0.field1355) - var0.field1347, field832);
                    }
                }
                if (var0.field1346 < 0) {
                    int var2 = -var0.field1346 - 1;
                    class72 var3;
                    if (field928 == var2) {
                        var3 = Statics.field470;
                    } else {
                        var3 = field927[var2];
                    }
                    if (var3 != null && var3.field1152 >= 0 && var3.field1152 < 13312 && var3.field1117 >= 0 && var3.field1117 < 13312) {
                        var0.method1775(var3.field1152, var3.field1117, method683(var3.field1152, var3.field1117, var0.field1355) - var0.field1347, field832);
                    }
                }
                var0.method1778(field883);
                Statics.field569.method2627(Statics.field780, (int) var0.field1354, (int) var0.field1363, (int) var0.field1356, 60, var0, var0.field1362, -1, false);
            }
        }
    }

    @ObfuscatedName("ao.gu(B)I")
    public static final int method245() {
        if (Statics.field2688.field1184) {
            return Statics.field780;
        }
        int var0 = 3;
        if (Statics.field1923 < 310) {
            int var1 = Statics.field1158 >> 7;
            int var2 = Statics.field603 >> 7;
            int var3 = Statics.field470.field1152 >> 7;
            int var4 = Statics.field470.field1117 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field780;
            }
            if ((class62.field704[Statics.field780][var1][var2] & 0x4) != 0) {
                var0 = Statics.field780;
            }
            int var5;
            if (var3 > var1) {
                var5 = var3 - var1;
            } else {
                var5 = var1 - var3;
            }
            int var6;
            if (var4 > var2) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var1 < var3) {
                        var1++;
                    } else if (var1 > var3) {
                        var1--;
                    }
                    if ((class62.field704[Statics.field780][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field780;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class62.field704[Statics.field780][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field780;
                        }
                    }
                }
            } else {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class62.field704[Statics.field780][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field780;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class62.field704[Statics.field780][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field780;
                        }
                    }
                }
            }
        }
        if (Statics.field470.field1152 >= 0 && Statics.field470.field1117 >= 0 && Statics.field470.field1152 < 13312 && Statics.field470.field1117 < 13312) {
            if ((class62.field704[Statics.field780][Statics.field470.field1152 >> 7][Statics.field470.field1117 >> 7] & 0x4) != 0) {
                var0 = Statics.field780;
            }
            return var0;
        } else {
            return Statics.field780;
        }
    }

    @ObfuscatedName("jp.hd(I)I")
    public static final int method4578() {
        if (Statics.field2688.field1184) {
            return Statics.field780;
        } else {
            int var0 = method683(Statics.field1158, Statics.field603, Statics.field780);
            return var0 - Statics.field683 >= 800 || (class62.field704[Statics.field780][Statics.field1158 >> 7][Statics.field603 >> 7] & 0x4) == 0 ? 3 : Statics.field780;
        }
    }

    @ObfuscatedName("w.hw(III)V")
    public static final void method6(int arg0, int arg1) {
        if (field840 == 2) {
            method2836((field1049 - Statics.field407 << 7) + field869, (field1018 - Statics.field1272 << 7) + field847, field845 * 2);
            if (field907 > -1 && field832 % 20 < 10) {
                Statics.field282[0].method5123(field907 + arg0 - 12, field913 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("s.hp(Lbx;IIIIIB)V")
    public static final void method9(class75 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1048()) {
            return;
        }
        if (arg0 instanceof class84) {
            class270 var6 = ((class84) arg0).field1259;
            if (var6.field3636 != null) {
                var6 = var6.method4554();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class93.field1379;
        int[] var8 = class93.field1380;
        int var9 = 3;
        if (!arg0.field1123.method3538()) {
            method628(arg0, arg0.field1148 + 15);
            for (class83 var10 = (class83) arg0.field1123.method3556(); var10 != null; var10 = (class83) arg0.field1123.method3537()) {
                class76 var11 = var10.method1690(field832);
                if (var11 != null) {
                    class260 var12 = var10.field1250;
                    class310 var13 = var12.method4319();
                    class310 var14 = var12.method4307();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3427;
                    } else {
                        if (var12.field3434 * 2 < var14.field3885) {
                            var15 = var12.field3434;
                        }
                        var16 = var14.field3885 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field832 - var11.field1160;
                    int var20 = var11.field1162 * var16 / var12.field3427;
                    int var23;
                    if (var11.field1163 > var19) {
                        int var21 = var12.field3429 == 0 ? 0 : var19 / var12.field3429 * var12.field3429;
                        int var22 = var11.field1161 * var16 / var12.field3427;
                        var23 = (var20 - var22) * var21 / var11.field1163 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1163 + var12.field3430 - var19;
                        if (var12.field3428 >= 0) {
                            var17 = (var24 << 8) / (var12.field3430 - var12.field3428);
                        }
                    }
                    if (var11.field1162 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field907 + arg2 - (var16 >> 1);
                    int var26 = field913 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field907 > -1) {
                            class306.method5002(var25, var26, var23, 5, 65280);
                            class306.method5002(var23 + var25, var26, var16 - var23, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var27 = var25 - var15;
                        int var28;
                        if (var16 == var23) {
                            var28 = var15 * 2 + var23;
                        } else {
                            var28 = var15 + var23;
                        }
                        int var29 = var13.field3882;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method5129(var27, var26, var17);
                            class306.method4995(var27, var26, var27 + var28, var26 + var29);
                            var14.method5129(var27, var26, var17);
                        } else {
                            var13.method5123(var27, var26);
                            class306.method4995(var27, var26, var27 + var28, var26 + var29);
                            var14.method5123(var27, var26);
                        }
                        class306.method5029(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1689()) {
                    var10.method3561();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class72 var30 = (class72) arg0;
            if (var30.field808) {
                return;
            }
            if (var30.field789 != -1 || var30.field790 != -1) {
                method628(arg0, arg0.field1148 + 15);
                if (field907 > -1) {
                    if (var30.field789 != -1) {
                        Statics.field293[var30.field789].method5123(field907 + arg2 - 12, field913 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field790 != -1) {
                        Statics.field794[var30.field790].method5123(field907 + arg2 - 12, field913 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field840 == 10 && field998 == var8[arg1]) {
                method628(arg0, arg0.field1148 + 15);
                if (field907 > -1) {
                    Statics.field282[1].method5123(field907 + arg2 - 12, field913 + arg3 - var9);
                }
            }
        } else {
            class270 var31 = ((class84) arg0).field1259;
            if (var31.field3636 != null) {
                var31 = var31.method4554();
            }
            if (var31.field3634 >= 0 && var31.field3634 < Statics.field794.length) {
                method628(arg0, arg0.field1148 + 15);
                if (field907 > -1) {
                    Statics.field794[var31.field3634].method5123(field907 + arg2 - 12, field913 + arg3 - 30);
                }
            }
            if (field840 == 1 && field841 == field865[arg1 - var7] && field832 % 20 < 10) {
                method628(arg0, arg0.field1148 + 15);
                if (field907 > -1) {
                    Statics.field282[0].method5123(field907 + arg2 - 12, field913 + arg3 - 28);
                }
            }
        }
        if (arg0.field1111 != null && (arg1 >= var7 || !arg0.field1131 && (field1024 == 4 || !arg0.field1104 && (field1024 == 0 || field1024 == 3 || field1024 == 1 && ((class72) arg0).method1038())))) {
            method628(arg0, arg0.field1148);
            if (field907 > -1 && field825 < field901) {
                field862[field825] = Statics.field1288.method4848(arg0.field1111) / 2;
                field904[field825] = Statics.field1288.field3746;
                field911[field825] = field907;
                field903[field825] = field913;
                field906[field825] = arg0.field1115;
                field888[field825] = arg0.field1116;
                field908[field825] = arg0.field1114;
                field920[field825] = arg0.field1111;
                field825++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1120[var32];
            int var34 = arg0.field1112[var32];
            class266 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field832) {
                    continue;
                }
                var35 = class266.method2942(arg0.field1112[var32]);
                var36 = var35.field3488;
                if (var35 != null && var35.field3492 != null) {
                    var35 = var35.method4423();
                    if (var35 == null) {
                        arg0.field1120[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1138[var32];
            class266 var38 = null;
            if (var37 >= 0) {
                var38 = class266.method2942(var37);
                if (var38 != null && var38.field3492 != null) {
                    var38 = var38.method4423();
                }
            }
            if (var33 - var36 <= field832) {
                if (var35 == null) {
                    arg0.field1120[var32] = -1;
                } else {
                    method628(arg0, arg0.field1148 / 2);
                    if (field907 > -1) {
                        if (var32 == 1) {
                            field913 -= 20;
                        }
                        if (var32 == 2) {
                            field907 -= 15;
                            field913 -= 10;
                        }
                        if (var32 == 3) {
                            field907 += 15;
                            field913 -= 10;
                        }
                        Object var39 = null;
                        Object var40 = null;
                        Object var41 = null;
                        Object var42 = null;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        class310 var51 = null;
                        class310 var52 = null;
                        class310 var53 = null;
                        class310 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class310 var64 = var35.method4414();
                        if (var64 != null) {
                            var43 = var64.field3885;
                            int var65 = var64.field3882;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3879;
                        }
                        class310 var66 = var35.method4393();
                        if (var66 != null) {
                            var44 = var66.field3885;
                            int var67 = var66.field3882;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3879;
                        }
                        class310 var68 = var35.method4388();
                        if (var68 != null) {
                            var45 = var68.field3885;
                            int var69 = var68.field3882;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3879;
                        }
                        class310 var70 = var35.method4395();
                        if (var70 != null) {
                            var46 = var70.field3885;
                            int var71 = var70.field3882;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3879;
                        }
                        if (var38 != null) {
                            var51 = var38.method4414();
                            if (var51 != null) {
                                var55 = var51.field3885;
                                int var72 = var51.field3882;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3879;
                            }
                            var52 = var38.method4393();
                            if (var52 != null) {
                                var56 = var52.field3885;
                                int var73 = var52.field3882;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3879;
                            }
                            var53 = var38.method4388();
                            if (var53 != null) {
                                var57 = var53.field3885;
                                int var74 = var53.field3882;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3879;
                            }
                            var54 = var38.method4395();
                            if (var54 != null) {
                                var58 = var54.field3885;
                                int var75 = var54.field3882;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3879;
                            }
                        }
                        class287 var76 = var35.method4396();
                        if (var76 == null) {
                            var76 = Statics.field289;
                        }
                        class287 var77;
                        if (var38 == null) {
                            var77 = Statics.field289;
                        } else {
                            var77 = var38.method4396();
                            if (var77 == null) {
                                var77 = Statics.field289;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4409(arg0.field1119[var32]);
                        int var83 = var76.method4848(var82);
                        if (var38 != null) {
                            var79 = var38.method4409(arg0.field1122[var32]);
                            var81 = var77.method4848(var79);
                        }
                        int var84 = 0;
                        int var85 = 0;
                        if (var44 > 0) {
                            if (var68 == null && var70 == null) {
                                var84 = 1;
                            } else {
                                var84 = var83 / var44 + 1;
                            }
                        }
                        if (var38 != null && var56 > 0) {
                            if (var53 == null && var54 == null) {
                                var85 = 1;
                            } else {
                                var85 = var81 / var56 + 1;
                            }
                        }
                        int var86 = 0;
                        int var87 = var86;
                        if (var43 > 0) {
                            var86 += var43;
                        }
                        var86 += 2;
                        int var88 = var86;
                        if (var45 > 0) {
                            var86 += var45;
                        }
                        int var89 = var86;
                        int var90 = var86;
                        int var92;
                        if (var44 > 0) {
                            int var91 = var44 * var84;
                            var92 = var86 + var91;
                            var90 = (var91 - var83) / 2 + var86;
                        } else {
                            var92 = var83 + var86;
                        }
                        int var93 = var92;
                        if (var46 > 0) {
                            var92 += var46;
                        }
                        int var94 = 0;
                        int var95 = 0;
                        int var96 = 0;
                        int var97 = 0;
                        int var98 = 0;
                        if (var38 != null) {
                            var92 += 2;
                            var94 = var92;
                            if (var55 > 0) {
                                var92 += var55;
                            }
                            var92 += 2;
                            var95 = var92;
                            if (var57 > 0) {
                                var92 += var57;
                            }
                            var96 = var92;
                            var98 = var92;
                            if (var56 > 0) {
                                int var99 = var56 * var85;
                                var92 += var99;
                                var98 += (var99 - var81) / 2;
                            } else {
                                var92 += var81;
                            }
                            var97 = var92;
                            if (var58 > 0) {
                                var92 += var58;
                            }
                        }
                        int var100 = arg0.field1120[var32] - field832;
                        int var101 = var35.field3486 - var35.field3486 * var100 / var35.field3488;
                        int var102 = var35.field3471 * var100 / var35.field3488 + -var35.field3471;
                        int var103 = field907 + arg2 - (var92 >> 1) + var101;
                        int var104 = field913 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3473 + var104 + 15;
                        int var108 = var107 - var76.field3759;
                        int var109 = var76.field3747 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3473 + var104 + 15;
                            int var111 = var110 - var77.field3759;
                            int var112 = var77.field3747 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3482 >= 0) {
                            var115 = (var100 << 8) / (var35.field3488 - var35.field3482);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method5129(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method5129(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method5129(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method5129(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4819(var82, var90 + var103, var107, var35.field3484, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method5129(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method5129(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method5129(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method5129(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4819(var79, var98 + var103, var110, var38.field3484, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method5123(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method5123(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method5123(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method5123(var93 + var103 - var50, var104);
                            }
                            var76.method4830(var82, var90 + var103, var107, var35.field3484 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method5123(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method5123(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method5123(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method5123(var97 + var103 - var62, var104);
                                }
                                var77.method4830(var79, var98 + var103, var110, var38.field3484 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.hg(Lbx;II)V")
    public static final void method628(class75 arg0, int arg1) {
        method2836(arg0.field1152, arg0.field1117, arg1);
    }

    @ObfuscatedName("ex.hc(IIII)V")
    public static final void method2836(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field907 = -1;
            field913 = -1;
            return;
        }
        int var3 = method683(arg0, arg1, Statics.field780) - arg2;
        int var4 = arg0 - Statics.field1158;
        int var5 = var3 - Statics.field683;
        int var6 = arg1 - Statics.field603;
        int var7 = class134.field1889[Statics.field1923];
        int var8 = class134.field1911[Statics.field1923];
        int var9 = class134.field1889[Statics.field437];
        int var10 = class134.field1911[Statics.field437];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field907 = field1070 * var11 / var15 + field1068 / 2;
            field913 = field1070 * var14 / var15 + field912 / 2;
        } else {
            field907 = -1;
            field913 = -1;
        }
    }

    @ObfuscatedName("bt.hh(IIII)I")
    public static final int method683(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field704[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field690[var5][var3][var4] + class62.field690[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field690[var5][var3][var4 + 1] + class62.field690[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("aq.hr(IIIIIII)V")
    public static final void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class134.field1889[var6];
            int var12 = class134.field1911[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class134.field1889[var7];
            int var15 = class134.field1911[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1158 = arg0 - var8;
        Statics.field683 = arg1 - var9;
        Statics.field603 = arg2 - var10;
        Statics.field1923 = arg3;
        Statics.field437 = arg4;
    }

    @ObfuscatedName("k.hq(ZLgd;I)V")
    public static final void method150(boolean arg0, class191 arg1) {
        field1005 = arg0;
        if (!field1005) {
            int var2 = arg1.method3158();
            int var3 = arg1.method3160();
            int var4 = arg1.method3124();
            Statics.field1223 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1223[var5][var6] = arg1.method3127();
                }
            }
            Statics.field1651 = new int[var4];
            Statics.field1919 = new int[var4];
            Statics.field20 = new int[var4];
            Statics.field2438 = new byte[var4][];
            Statics.field2133 = new byte[var4][];
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
                        Statics.field1651[var8] = var11;
                        Statics.field1919[var8] = Statics.field3722.method4117("m" + var9 + "_" + var10);
                        Statics.field20[var8] = Statics.field3722.method4117("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method3866(var3, var2, true);
            return;
        }
        int var12 = arg1.method3158();
        boolean var13 = arg1.method3151() == 1;
        int var14 = arg1.method3160();
        int var15 = arg1.method3124();
        arg1.method3380();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3371(1);
                    if (var19 == 1) {
                        field881[var16][var17][var18] = arg1.method3371(26);
                    } else {
                        field881[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3372();
        Statics.field1223 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1223[var20][var21] = arg1.method3127();
            }
        }
        Statics.field1651 = new int[var15];
        Statics.field1919 = new int[var15];
        Statics.field20 = new int[var15];
        Statics.field2438 = new byte[var15][];
        Statics.field2133 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field881[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1651[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1651[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1919[var22] = Statics.field3722.method4117("m" + var31 + "_" + var32);
                            Statics.field20[var22] = Statics.field3722.method4117("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method3866(var12, var14, !var13);
    }

    @ObfuscatedName("hb.hz(IIZI)V")
    public static final void method3866(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field270 == arg0 && Statics.field346 == arg1) {
            return;
        }
        Statics.field270 = arg0;
        Statics.field346 = arg1;
        method22(25);
        method993(class237.field3098, true);
        int var3 = Statics.field407;
        int var4 = Statics.field1272;
        Statics.field407 = (arg0 - 6) * 8;
        Statics.field1272 = (arg1 - 6) * 8;
        int var5 = Statics.field407 - var3;
        int var6 = Statics.field1272 - var4;
        int var7 = Statics.field407;
        int var8 = Statics.field1272;
        for (int var9 = 0; var9 < 32768; var9++) {
            class84 var10 = field837[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1153[var11] -= var5;
                    var10.field1154[var11] -= var6;
                }
                var10.field1152 -= var5 * 128;
                var10.field1117 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class72 var13 = field927[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1153[var14] -= var5;
                    var13.field1154[var14] -= var6;
                }
                var13.field1152 -= var5 * 128;
                var13.field1117 -= var6 * 128;
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
                        field937[var25][var21][var22] = field937[var25][var23][var24];
                    } else {
                        field937[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class74 var26 = (class74) field938.method3581(); var26 != null; var26 = (class74) field938.method3597()) {
            var26.field1090 -= var5;
            var26.field1086 -= var6;
            if (var26.field1090 < 0 || var26.field1086 < 0 || var26.field1090 >= 104 || var26.field1086 >= 104) {
                var26.method3561();
            }
        }
        if (field1038 != 0) {
            field1038 -= var5;
            field1039 -= var6;
        }
        field1046 = 0;
        field1052 = false;
        field953 = -1;
        field940.method3586();
        field939.method3586();
        for (int var27 = 0; var27 < 4; var27++) {
            field1017[var27].method2975();
        }
    }

    @ObfuscatedName("k.hm(ZI)V")
    public static final void method156(boolean arg0) {
        method4774();
        field868.field1439++;
        if (field868.field1439 < 50 && !arg0) {
            return;
        }
        field868.field1439 = 0;
        if (field870 || field868.method1880() == null) {
            return;
        }
        class175 var1 = class175.method470(class172.field2326, field868.field1440);
        field868.method1879(var1);
        try {
            field868.method1878();
        } catch (IOException var3) {
            field870 = true;
        }
    }

    @ObfuscatedName("aw.hl(IIIIII)V")
    public static final void method499(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field569.method2700(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field569.method2750(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field394.field3887;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class267 var13 = class267.method2363(var12);
            if (var13.field3525 == -1) {
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
                class309 var14 = Statics.field2436[var13.field3525];
                if (var14 != null) {
                    int var15 = (var13.field3511 * 4 - var14.field3873) / 2;
                    int var16 = (var13.field3512 * 4 - var14.field3871) / 2;
                    var14.method5091(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3512) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field569.method2644(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field569.method2750(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class267 var22 = class267.method2363(var21);
            if (var22.field3525 != -1) {
                class309 var23 = Statics.field2436[var22.field3525];
                if (var23 != null) {
                    int var24 = (var22.field3511 * 4 - var23.field3873) / 2;
                    int var25 = (var22.field3512 * 4 - var23.field3871) / 2;
                    var23.method5091(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3512) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field394.field3887;
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
        int var29 = Statics.field569.method2645(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class267 var31 = class267.method2363(var30);
        if (var31.field3525 == -1) {
            return;
        }
        class309 var32 = Statics.field2436[var31.field3525];
        if (var32 != null) {
            int var33 = (var31.field3511 * 4 - var32.field3873) / 2;
            int var34 = (var31.field3512 * 4 - var32.field3871) / 2;
            var32.method5091(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3512) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.hk(Lcj;I)Z")
    public final boolean method1105(class99 arg0) {
        class160 var2 = arg0.method1880();
        class191 var3 = arg0.field1442;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1445 == null) {
                if (arg0.field1444) {
                    if (!var2.method2894(1)) {
                        return false;
                    }
                    var2.method2901(arg0.field1442.field2491, 0, 1);
                    arg0.field1451 = 0;
                    arg0.field1444 = false;
                }
                var3.field2488 = 0;
                if (var3.method3368()) {
                    if (!var2.method2894(1)) {
                        return false;
                    }
                    var2.method2901(arg0.field1442.field2491, 1, 1);
                    arg0.field1451 = 0;
                }
                arg0.field1444 = true;
                class171[] var4 = class171.method2544();
                int var5 = var3.method3383();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2488);
                }
                arg0.field1445 = var4[var5];
                arg0.field1443 = arg0.field1445.field2281;
            }
            if (arg0.field1443 == -1) {
                if (!var2.method2894(1)) {
                    return false;
                }
                arg0.method1880().method2901(var3.field2491, 0, 1);
                arg0.field1443 = var3.field2491[0] & 0xFF;
            }
            if (arg0.field1443 == -2) {
                if (!var2.method2894(2)) {
                    return false;
                }
                arg0.method1880().method2901(var3.field2491, 0, 2);
                var3.field2488 = 0;
                arg0.field1443 = var3.method3124();
            }
            if (!var2.method2894(arg0.field1443)) {
                return false;
            }
            var3.field2488 = 0;
            var2.method2901(var3.field2491, 0, arg0.field1443);
            arg0.field1451 = 0;
            field1077.method4939();
            arg0.field1449 = arg0.field1436;
            arg0.field1436 = arg0.field1447;
            arg0.field1447 = arg0.field1445;
            if (class171.field2217 == arg0.field1445) {
                String var6 = var3.method3131();
                Object[] var7 = new Object[var6.length() + 1];
                for (int var8 = var6.length() - 1; var8 >= 0; var8--) {
                    if (var6.charAt(var8) == 's') {
                        var7[var8 + 1] = var3.method3131();
                    } else {
                        var7[var8 + 1] = Integer.valueOf(var3.method3127());
                    }
                }
                var7[0] = Integer.valueOf(var3.method3127());
                class68 var9 = new class68();
                var9.field748 = var7;
                class81.method1724(var9);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2251 == arg0.field1445) {
                int var10 = var3.method3136();
                boolean var11 = var3.method3197() == 1;
                String var12 = "";
                boolean var13 = false;
                if (var11) {
                    var12 = var3.method3131();
                    if (Statics.field2282.method1554(new class281(var12, Statics.field459))) {
                        var13 = true;
                    }
                }
                String var14 = var3.method3131();
                if (!var13) {
                    Statics.method4020(var10, var12, var14);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2262 == arg0.field1445) {
                int var15 = var3.method3168();
                String var16 = var3.method3131();
                class228 var17 = class228.method471(var15);
                if (!var16.equals(var17.field2823)) {
                    var17.field2823 = var16;
                    method924(var17);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2230 == arg0.field1445) {
                int var18 = var3.method3160();
                byte var19 = var3.method3123();
                class223.field2690[var18] = var19;
                if (class223.field2691[var18] != var19) {
                    class223.field2691[var18] = var19;
                }
                method252(var18);
                field994[++field995 - 1 & 0x1F] = var18;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2204 == arg0.field1445) {
                String var20 = var3.method3131();
                long var21 = var3.method3128();
                long var23 = (long) var3.method3124();
                long var25 = (long) var3.method3138();
                class242[] var27 = new class242[] { class242.field3258, class242.field3254, class242.field3249, class242.field3253, class242.field3252, class242.field3251 };
                class242 var28 = (class242) class180.method4646(var27, var3.method3197());
                long var29 = (var23 << 32) + var25;
                boolean var31 = false;
                for (int var32 = 0; var32 < 100; var32++) {
                    if (field966[var32] == var29) {
                        var31 = true;
                        break;
                    }
                }
                if (var28.field3257 && Statics.field2282.method1554(new class281(var20, Statics.field459))) {
                    var31 = true;
                }
                if (!var31 && field1040 == 0) {
                    field966[field1028] = var29;
                    field1028 = (field1028 + 1) % 100;
                    String var33 = class289.method4147(var3, 32767);
                    String var34 = class288.method4817(class294.method3927(var33));
                    if (var28.field3255 == -1) {
                        class95.method3858(9, var20, var34, class292.method4542(var21));
                    } else {
                        int var35 = var28.field3255;
                        String var36 = "<img=" + var35 + ">";
                        class95.method3858(9, var36 + var20, var34, class292.method4542(var21));
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2210 == arg0.field1445) {
                method150(true, arg0.field1442);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2247 == arg0.field1445) {
                int var37 = var3.method3124();
                if (var37 == 65535) {
                    var37 = -1;
                }
                int var38 = var3.method3168();
                int var39 = var3.method3159();
                if (var39 == 65535) {
                    var39 = -1;
                }
                int var40 = var3.method3169();
                for (int var41 = var37; var41 <= var39; var41++) {
                    long var42 = ((long) var38 << 32) + (long) var41;
                    class204 var44 = field1010.method3517(var42);
                    if (var44 != null) {
                        var44.method3561();
                    }
                    field1010.method3518(new class210(var40), var42);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2202 == arg0.field1445) {
                var3.field2488 += 28;
                if (var3.method3146()) {
                    int var45 = var3.field2488 - 28;
                    byte[] var46 = var3.field2491;
                    if (field1016 == null) {
                        field1016 = new byte[24];
                    }
                    class195.method3423(var46, var45, field1016, 0, 24);
                    if (class158.field2124 != null) {
                        try {
                            class158.field2124.method2276(0L);
                            class158.field2124.method2283(var3.field2491, var45, 24);
                        } catch (Exception var258) {
                        }
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2267 == arg0.field1445) {
                if (arg0.field1443 == 0) {
                    Statics.field2926 = null;
                } else {
                    if (Statics.field2926 == null) {
                        Statics.field2926 = new class283(Statics.field459, Statics.field481);
                    }
                    Statics.field2926.method4777(var3);
                }
                field950 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2205 == arg0.field1445) {
                field1052 = false;
                for (int var48 = 0; var48 < 5; var48++) {
                    field1053[var48] = false;
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2271 == arg0.field1445) {
                Statics.field466 = var3.method3152();
                Statics.field2424 = var3.method3150();
                for (int var49 = Statics.field2424; var49 < Statics.field2424 + 8; var49++) {
                    for (int var50 = Statics.field466; var50 < Statics.field466 + 8; var50++) {
                        if (field937[Statics.field780][var49][var50] != null) {
                            field937[Statics.field780][var49][var50] = null;
                            method2069(var49, var50);
                        }
                    }
                }
                for (class74 var51 = (class74) field938.method3581(); var51 != null; var51 = (class74) field938.method3597()) {
                    if (var51.field1090 >= Statics.field2424 && var51.field1090 < Statics.field2424 + 8 && var51.field1086 >= Statics.field466 && var51.field1086 < Statics.field466 + 8 && Statics.field780 == var51.field1097) {
                        var51.field1094 = 0;
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2212 == arg0.field1445) {
                int var52 = var3.method3127();
                int var53 = var3.method3124();
                if (var52 < -70000) {
                    var53 += 32768;
                }
                class228 var54;
                if (var52 >= 0) {
                    var54 = class228.method471(var52);
                } else {
                    var54 = null;
                }
                while (var3.field2488 < arg0.field1443) {
                    int var55 = var3.method3136();
                    int var56 = var3.method3124();
                    int var57 = 0;
                    if (var56 != 0) {
                        var57 = var3.method3197();
                        if (var57 == 255) {
                            var57 = var3.method3127();
                        }
                    }
                    if (var54 != null && var55 >= 0 && var55 < var54.field2728.length) {
                        var54.field2728[var55] = var56;
                        var54.field2858[var55] = var57;
                    }
                    class65.method247(var53, var55, var56 - 1, var57);
                }
                if (var54 != null) {
                    method924(var54);
                }
                method211();
                field877[++field1074 - 1 & 0x1F] = var53 & 0x7FFF;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2229 == arg0.field1445) {
                method248(false, var3);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2273 == arg0.field1445) {
                Statics.field2282.field1197.method4676(var3, arg0.field1443);
                method960();
                field1001 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2222 == arg0.field1445) {
                for (int var58 = 0; var58 < Statics.field3352; var58++) {
                    class253 var59 = (class253) class253.field3349.method3504((long) var58);
                    class253 var60;
                    if (var59 == null) {
                        byte[] var61 = Statics.field2414.method4032(16, var58);
                        class253 var62 = new class253();
                        if (var61 != null) {
                            var62.method4197(new class185(var61));
                        }
                        class253.field3349.method3506(var62, (long) var58);
                        var60 = var62;
                    } else {
                        var60 = var59;
                    }
                    if (var60 != null) {
                        class223.field2690[var58] = 0;
                        class223.field2691[var58] = 0;
                    }
                }
                method211();
                field995 += 32;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2244 == arg0.field1445) {
                int var64 = var3.method3127();
                class67 var65 = (class67) field969.method3517((long) var64);
                if (var65 != null) {
                    method1681(var65, true);
                }
                if (field972 != null) {
                    method924(field972);
                    field972 = null;
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2214 == arg0.field1445) {
                String var66 = var3.method3131();
                int var67 = var3.method3150();
                int var68 = var3.method3197();
                if (var67 >= 1 && var67 <= 8) {
                    if (var66.equalsIgnoreCase("null")) {
                        var66 = null;
                    }
                    field985[var67 - 1] = var66;
                    field934[var67 - 1] = var68 == 0;
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2257 == arg0.field1445) {
                method131(class174.field2397);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2261 == arg0.field1445) {
                int var69 = var3.method3127();
                int var70 = var3.method3124();
                if (var69 < -70000) {
                    var70 += 32768;
                }
                class228 var71;
                if (var69 >= 0) {
                    var71 = class228.method471(var69);
                } else {
                    var71 = null;
                }
                if (var71 != null) {
                    for (int var72 = 0; var72 < var71.field2728.length; var72++) {
                        var71.field2728[var72] = 0;
                        var71.field2858[var72] = 0;
                    }
                }
                class65 var73 = (class65) class65.field724.method3517((long) var70);
                if (var73 != null) {
                    for (int var74 = 0; var74 < var73.field728.length; var74++) {
                        var73.field728[var74] = -1;
                        var73.field725[var74] = 0;
                    }
                }
                int var75 = var3.method3124();
                for (int var76 = 0; var76 < var75; var76++) {
                    int var77 = var3.method3197();
                    if (var77 == 255) {
                        var77 = var3.method3169();
                    }
                    int var78 = var3.method3159();
                    if (var71 != null && var76 < var71.field2728.length) {
                        var71.field2728[var76] = var78;
                        var71.field2858[var76] = var77;
                    }
                    class65.method247(var70, var76, var78 - 1, var77);
                }
                if (var71 != null) {
                    method924(var71);
                }
                method211();
                field877[++field1074 - 1 & 0x1F] = var70 & 0x7FFF;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2275 == arg0.field1445) {
                field1052 = true;
                Statics.field1410 = var3.method3197();
                Statics.field1159 = var3.method3197();
                Statics.field599 = var3.method3124();
                Statics.field3719 = var3.method3197();
                Statics.field295 = var3.method3197();
                if (Statics.field295 >= 100) {
                    int var79 = Statics.field1410 * 128 + 64;
                    int var80 = Statics.field1159 * 128 + 64;
                    int var81 = method683(var79, var80, Statics.field780) - Statics.field599;
                    int var82 = var79 - Statics.field1158;
                    int var83 = var81 - Statics.field683;
                    int var84 = var80 - Statics.field603;
                    int var85 = (int) Math.sqrt((double) (var82 * var82 + var84 * var84));
                    Statics.field1923 = (int) (Math.atan2((double) var83, (double) var85) * 325.949D) & 0x7FF;
                    Statics.field437 = (int) (Math.atan2((double) var82, (double) var84) * -325.949D) & 0x7FF;
                    if (Statics.field1923 < 128) {
                        Statics.field1923 = 128;
                    }
                    if (Statics.field1923 > 383) {
                        Statics.field1923 = 383;
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2234 == arg0.field1445) {
                int var86 = var3.method3158();
                if (var86 == 65535) {
                    var86 = -1;
                }
                int var87 = var3.method3170();
                int var88 = var3.method3127();
                class228 var89 = class228.method471(var87);
                if (var89.field2738) {
                    var89.field2848 = var86;
                    var89.field2860 = var88;
                    class268 var91 = class268.method1489(var86);
                    var89.field2727 = var91.field3563;
                    var89.field2791 = var91.field3570;
                    var89.field2792 = var91.field3565;
                    var89.field2788 = var91.field3567;
                    var89.field2783 = var91.field3584;
                    var89.field2793 = var91.field3562;
                    if (var91.field3568 == 1) {
                        var89.field2740 = 1;
                    } else {
                        var89.field2740 = 2;
                    }
                    if (var89.field2725 > 0) {
                        var89.field2793 = var89.field2793 * 32 / var89.field2725;
                    } else if (var89.field2750 > 0) {
                        var89.field2793 = var89.field2793 * 32 / var89.field2750;
                    }
                    method924(var89);
                } else if (var86 == -1) {
                    var89.field2755 = 0;
                    arg0.field1445 = null;
                    return true;
                } else {
                    class268 var90 = class268.method1489(var86);
                    var89.field2755 = 4;
                    var89.field2834 = var86;
                    var89.field2727 = var90.field3563;
                    var89.field2791 = var90.field3570;
                    var89.field2793 = var90.field3562 * 100 / var88;
                    method924(var89);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2254 == arg0.field1445) {
                method81();
                arg0.field1445 = null;
                return false;
            }
            if (class171.field2209 == arg0.field1445) {
                int var92 = var3.method3170();
                int var93 = var3.method3160();
                int var94 = var3.method3124();
                int var95 = var3.method3124();
                class228 var96 = class228.method471(var92);
                if (var96.field2727 != var95 || var96.field2791 != var93 || var96.field2793 != var94) {
                    var96.field2727 = var95;
                    var96.field2791 = var93;
                    var96.field2793 = var94;
                    method924(var96);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2252 == arg0.field1445) {
                int var97 = var3.method3127();
                int var98 = var3.method3127();
                int var99 = class59.method3402();
                class175 var100 = class175.method470(class172.field2313, field868.field1440);
                var100.field2403.method3105(var97);
                var100.field2403.method3165(var98);
                var100.field2403.method3115(field636);
                var100.field2403.method3107(var99);
                field868.method1879(var100);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2219 == arg0.field1445) {
                if (Statics.field2926 != null) {
                    Statics.field2926.method4778(var3);
                }
                field950 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2253 == arg0.field1445) {
                int var101 = var3.method3160();
                if (var101 == 65535) {
                    var101 = -1;
                }
                method976(var101);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2203 == arg0.field1445) {
                int var102 = var3.method3164();
                int var103 = var3.method3158();
                if (var103 == 65535) {
                    var103 = -1;
                }
                if (field1041 != 0 && var103 != -1) {
                    class215.method2935(Statics.field784, var103, 0, field1041, false);
                    field1015 = true;
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2200 == arg0.field1445) {
                Statics.field416 = class302.method3006(var3.method3197());
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2228 == arg0.field1445) {
                int var104 = var3.method3150();
                int var105 = var3.method3170();
                int var106 = var3.method3124();
                class67 var107 = (class67) field969.method3517((long) var105);
                if (var107 != null) {
                    method1681(var107, var107.field744 != var106);
                }
                class67 var108 = new class67();
                var108.field744 = var106;
                var108.field743 = var104;
                field969.method3518(var108, (long) var105);
                method244(var106);
                class228 var109 = class228.method471(var105);
                method924(var109);
                if (field972 != null) {
                    method924(field972);
                    field972 = null;
                }
                method53();
                method331(Statics.field3286[var105 >> 16], var109, false);
                class81.method3095(var106);
                if (field968 != -1) {
                    int var110 = field968;
                    if (class228.method3651(var110)) {
                        method4592(Statics.field3286[var110], 1);
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2246 == arg0.field1445) {
                int var111 = var3.method3127();
                int var112 = var3.method3175();
                class228 var113 = class228.method471(var111);
                if (var113.field2786 != var112 || var112 == -1) {
                    var113.field2786 = var112;
                    var113.field2861 = 0;
                    var113.field2872 = 0;
                    method924(var113);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2269 == arg0.field1445) {
                int var114 = var3.method3124();
                int var115 = var3.method3197();
                int var116 = var3.method3124();
                if (field1009 != 0 && var115 != 0 && field1046 < 50) {
                    field1047[field1046] = var114;
                    field1048[field1046] = var115;
                    field895[field1046] = var116;
                    field856[field1046] = null;
                    field843[field1046] = 0;
                    field1046++;
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2268 == arg0.field1445) {
                String var120 = var3.method3131();
                String var121 = class289.method4147(var3, 32767);
                String var122 = class288.method4817(class294.method3927(var121));
                Statics.method4020(6, var120, var122);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2223 == arg0.field1445) {
                Statics.field2282.method1549();
                field1001 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2233 == arg0.field1445) {
                field840 = var3.method3197();
                if (field840 == 1) {
                    field841 = var3.method3124();
                }
                if (field840 >= 2 && field840 <= 6) {
                    if (field840 == 2) {
                        field869 = 64;
                        field847 = 64;
                    }
                    if (field840 == 3) {
                        field869 = 0;
                        field847 = 64;
                    }
                    if (field840 == 4) {
                        field869 = 128;
                        field847 = 64;
                    }
                    if (field840 == 5) {
                        field869 = 64;
                        field847 = 0;
                    }
                    if (field840 == 6) {
                        field869 = 64;
                        field847 = 128;
                    }
                    field840 = 2;
                    field1049 = var3.method3124();
                    field1018 = var3.method3124();
                    field845 = var3.method3197();
                }
                if (field840 == 10) {
                    field998 = var3.method3124();
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2279 == arg0.field1445) {
                int var123 = var3.method3160();
                int var124 = var3.method3169();
                class228 var125 = class228.method471(var124);
                if (var125.field2755 != 1 || var125.field2834 != var123) {
                    var125.field2755 = 1;
                    var125.field2834 = var123;
                    method924(var125);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2250 == arg0.field1445) {
                int var126 = var3.method3159();
                class65.method64(var126);
                field877[++field1074 - 1 & 0x1F] = var126 & 0x7FFF;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2276 == arg0.field1445) {
                for (int var127 = 0; var127 < class223.field2691.length; var127++) {
                    if (class223.field2691[var127] != class223.field2690[var127]) {
                        class223.field2691[var127] = class223.field2690[var127];
                        method252(var127);
                        field994[++field995 - 1 & 0x1F] = var127;
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2225 == arg0.field1445) {
                method131(class174.field2390);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2206 == arg0.field1445) {
                int var128 = var3.method3170();
                int var129 = var3.method3160();
                int var130 = var3.method3160();
                class228 var131 = class228.method471(var128);
                var131.field2795 = (var130 << 16) + var129;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2235 == arg0.field1445) {
                if (field968 != -1) {
                    int var132 = field968;
                    if (class228.method3651(var132)) {
                        method4592(Statics.field3286[var132], 0);
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2208 == arg0.field1445) {
                int var133 = var3.method3124();
                field968 = var133;
                this.method1109(false);
                method244(var133);
                class81.method3095(field968);
                for (int var134 = 0; var134 < 100; var134++) {
                    field1013[var134] = true;
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2272 == arg0.field1445) {
                int var135 = var3.method3127();
                class228 var136 = class228.method471(var135);
                for (int var137 = 0; var137 < var136.field2728.length; var137++) {
                    var136.field2728[var137] = -1;
                    var136.field2728[var137] = 0;
                }
                method924(var136);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2248 == arg0.field1445) {
                Statics.field2282.method1578(var3, arg0.field1443);
                field1001 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2215 == arg0.field1445) {
                field1051 = var3.method3197();
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2216 == arg0.field1445) {
                method131(class174.field2396);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2237 == arg0.field1445) {
                for (int var138 = 0; var138 < field927.length; var138++) {
                    if (field927[var138] != null) {
                        field927[var138].field1130 = -1;
                    }
                }
                for (int var139 = 0; var139 < field837.length; var139++) {
                    if (field837[var139] != null) {
                        field837[var139].field1130 = -1;
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2232 == arg0.field1445) {
                method131(class174.field2389);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2245 == arg0.field1445) {
                method131(class174.field2392);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2241 == arg0.field1445) {
                method131(class174.field2391);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2258 == arg0.field1445) {
                method154(var3.method3131());
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2277 == arg0.field1445) {
                int var140 = var3.method3160();
                int var141 = var3.method3168();
                class228 var142 = class228.method471(var141);
                if (var142.field2755 != 2 || var142.field2834 != var140) {
                    var142.field2755 = 2;
                    var142.field2834 = var140;
                    method924(var142);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2199 == arg0.field1445) {
                String var143 = var3.method3131();
                long var144 = (long) var3.method3124();
                long var146 = (long) var3.method3138();
                class242[] var148 = new class242[] { class242.field3258, class242.field3254, class242.field3249, class242.field3253, class242.field3252, class242.field3251 };
                class242 var149 = (class242) class180.method4646(var148, var3.method3197());
                long var150 = (var144 << 32) + var146;
                boolean var152 = false;
                for (int var153 = 0; var153 < 100; var153++) {
                    if (field966[var153] == var150) {
                        var152 = true;
                        break;
                    }
                }
                if (Statics.field2282.method1554(new class281(var143, Statics.field459))) {
                    var152 = true;
                }
                if (!var152 && field1040 == 0) {
                    field966[field1028] = var150;
                    field1028 = (field1028 + 1) % 100;
                    String var154 = class289.method4147(var3, 32767);
                    String var155 = class288.method4817(class294.method3927(var154));
                    byte var156;
                    if (var149.field3256) {
                        var156 = 7;
                    } else {
                        var156 = 3;
                    }
                    if (var149.field3255 == -1) {
                        Statics.method4020(var156, var143, var155);
                    } else {
                        int var158 = var149.field3255;
                        String var159 = "<img=" + var158 + ">";
                        Statics.method4020(var156, var159 + var143, var155);
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2220 == arg0.field1445) {
                int var160 = var3.method3197();
                if (var3.method3197() == 0) {
                    field1019[var160] = new class17();
                    var3.field2488 += 18;
                } else {
                    var3.field2488--;
                    field1019[var160] = new class17(var3, false);
                }
                field1022 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2221 == arg0.field1445) {
                Statics.field466 = var3.method3152();
                Statics.field2424 = var3.method3151();
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2207 == arg0.field1445) {
                int var161 = var3.method3170();
                boolean var162 = var3.method3150() == 1;
                class228 var163 = class228.method471(var161);
                if (var163.field2797 != var162) {
                    var163.field2797 = var162;
                    method924(var163);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2278 == arg0.field1445) {
                method131(class174.field2395);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2231 == arg0.field1445) {
                class77 var164 = new class77();
                var164.field1179 = var3.method3131();
                var164.field1175 = var3.method3124();
                int var165 = var3.method3127();
                var164.field1173 = var165;
                method22(45);
                var2.method2897();
                Object var166 = null;
                class90.method3011(var164);
                arg0.field1445 = null;
                return false;
            }
            if (class171.field2266 == arg0.field1445) {
                int var167 = arg0.field1443 + var3.field2488;
                int var168 = var3.method3124();
                int var169 = var3.method3124();
                if (field968 != var168) {
                    field968 = var168;
                    this.method1109(false);
                    method244(field968);
                    class81.method3095(field968);
                    for (int var170 = 0; var170 < 100; var170++) {
                        field1013[var170] = true;
                    }
                }
                while (var169-- > 0) {
                    int var171 = var3.method3127();
                    int var172 = var3.method3124();
                    int var173 = var3.method3197();
                    class67 var174 = (class67) field969.method3517((long) var171);
                    if (var174 != null && var174.field744 != var172) {
                        method1681(var174, true);
                        var174 = null;
                    }
                    if (var174 == null) {
                        class67 var175 = new class67();
                        var175.field744 = var172;
                        var175.field743 = var173;
                        field969.method3518(var175, (long) var171);
                        method244(var172);
                        class228 var176 = class228.method471(var171);
                        method924(var176);
                        if (field972 != null) {
                            method924(field972);
                            field972 = null;
                        }
                        method53();
                        method331(Statics.field3286[var171 >> 16], var176, false);
                        class81.method3095(var172);
                        if (field968 != -1) {
                            int var177 = field968;
                            if (class228.method3651(var177)) {
                                method4592(Statics.field3286[var177], 1);
                            }
                        }
                        var174 = var175;
                    }
                    var174.field745 = true;
                }
                for (class67 var179 = (class67) field969.method3520(); var179 != null; var179 = (class67) field969.method3516()) {
                    if (var179.field745) {
                        var179.field745 = false;
                    } else {
                        method1681(var179, true);
                    }
                }
                field1010 = new class202(512);
                while (var3.field2488 < var167) {
                    int var180 = var3.method3127();
                    int var181 = var3.method3124();
                    int var182 = var3.method3124();
                    int var183 = var3.method3127();
                    for (int var184 = var181; var184 <= var182; var184++) {
                        long var185 = ((long) var180 << 32) + (long) var184;
                        field1010.method3518(new class210(var183), var185);
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2227 == arg0.field1445) {
                field1024 = var3.method3152();
                field976 = var3.method3197();
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2249 == arg0.field1445) {
                field905 = var3.method3158() * 30;
                field863 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2265 == arg0.field1445) {
                field1052 = true;
                Statics.field3782 = var3.method3197();
                Statics.field323 = var3.method3197();
                Statics.field682 = var3.method3124();
                Statics.field2037 = var3.method3197();
                Statics.field492 = var3.method3197();
                if (Statics.field492 >= 100) {
                    Statics.field1158 = Statics.field3782 * 128 + 64;
                    Statics.field603 = Statics.field323 * 128 + 64;
                    Statics.field683 = method683(Statics.field1158, Statics.field603, Statics.field780) - Statics.field682;
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2255 == arg0.field1445) {
                boolean var187 = var3.method3197() == 1;
                if (var187) {
                    Statics.field474 = class187.method35() - var3.method3128();
                    Statics.field1398 = new class14(var3, true);
                } else {
                    Statics.field1398 = null;
                }
                field860 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2256 == arg0.field1445) {
                int var188 = var3.method3170();
                int var189 = var3.method3168();
                class67 var190 = (class67) field969.method3517((long) var188);
                class67 var191 = (class67) field969.method3517((long) var189);
                if (var191 != null) {
                    method1681(var191, var190 == null || var190.field744 != var191.field744);
                }
                if (var190 != null) {
                    var190.method3561();
                    field969.method3518(var190, (long) var189);
                }
                class228 var192 = class228.method471(var188);
                if (var192 != null) {
                    method924(var192);
                }
                class228 var193 = class228.method471(var189);
                if (var193 != null) {
                    method924(var193);
                    method331(Statics.field3286[var193.field2739 >>> 16], var193, true);
                }
                if (field968 != -1) {
                    int var194 = field968;
                    if (class228.method3651(var194)) {
                        method4592(Statics.field3286[var194], 1);
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2226 == arg0.field1445) {
                method211();
                field973 = var3.method3197();
                field863 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2240 == arg0.field1445) {
                method131(class174.field2394);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2264 == arg0.field1445) {
                int var195 = var3.method3169();
                int var196 = var3.method3124();
                class223.field2690[var196] = var195;
                if (class223.field2691[var196] != var195) {
                    class223.field2691[var196] = var195;
                }
                method252(var196);
                field994[++field995 - 1 & 0x1F] = var196;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2218 == arg0.field1445) {
                int var197 = var3.method3125();
                int var198 = var3.method3161();
                int var199 = var3.method3168();
                class228 var200 = class228.method471(var199);
                if (var200.field2748 != var197 || var200.field2749 != var198 || var200.field2857 != 0 || var200.field2743 != 0) {
                    var200.field2748 = var197;
                    var200.field2749 = var198;
                    var200.field2857 = 0;
                    var200.field2743 = 0;
                    method924(var200);
                    this.method1110(var200);
                    if (var200.field2741 == 0) {
                        method331(Statics.field3286[var199 >> 16], var200, false);
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2238 == arg0.field1445) {
                method150(false, arg0.field1442);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2211 == arg0.field1445) {
                method131(class174.field2393);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2224 == arg0.field1445) {
                field1038 = var3.method3197();
                if (field1038 == 255) {
                    field1038 = 0;
                }
                field1039 = var3.method3197();
                if (field1039 == 255) {
                    field1039 = 0;
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2242 == arg0.field1445) {
                int var201 = var3.method3160();
                int var202 = var3.method3170();
                int var203 = var201 >> 10 & 0x1F;
                int var204 = var201 >> 5 & 0x1F;
                int var205 = var201 & 0x1F;
                int var206 = (var205 << 3) + (var203 << 19) + (var204 << 11);
                class228 var207 = class228.method471(var202);
                if (var207.field2830 != var206) {
                    var207.field2830 = var206;
                    method924(var207);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2201 == arg0.field1445) {
                Statics.field466 = var3.method3152();
                Statics.field2424 = var3.method3197();
                while (var3.field2488 < arg0.field1443) {
                    int var208 = var3.method3197();
                    class174 var209 = class174.method1720()[var208];
                    method131(var209);
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2259 == arg0.field1445) {
                method248(true, var3);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2239 == arg0.field1445) {
                class93.method1546(var3, arg0.field1443);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2243 == arg0.field1445) {
                method131(class174.field2398);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2260 == arg0.field1445) {
                int var210 = var3.method3169();
                class228 var211 = class228.method471(var210);
                var211.field2755 = 3;
                var211.field2834 = Statics.field470.field788.method3897();
                method924(var211);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2274 == arg0.field1445) {
                method211();
                field974 = var3.method3125();
                field863 = field993;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2236 == arg0.field1445) {
                method211();
                int var212 = var3.method3151();
                int var213 = var3.method3197();
                int var214 = var3.method3170();
                field943[var212] = var214;
                field941[var212] = var213;
                field942[var212] = 1;
                for (int var215 = 0; var215 < 98; var215++) {
                    if (var214 >= class234.field2921[var215]) {
                        field942[var212] = var215 + 2;
                    }
                }
                field1060[++field999 - 1 & 0x1F] = var212;
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2270 == arg0.field1445) {
                int var216 = var3.method3158();
                int var217 = var3.method3168();
                class228 var218 = class228.method471(var217);
                if (var218 != null && var218.field2741 == 0) {
                    if (var216 > var218.field2763 - var218.field2764) {
                        var216 = var218.field2763 - var218.field2764;
                    }
                    if (var216 < 0) {
                        var216 = 0;
                    }
                    if (var218.field2778 != var216) {
                        var218.field2778 = var216;
                        method924(var218);
                    }
                }
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2263 == arg0.field1445) {
                int var219 = arg0.field1443;
                class304 var220 = new class304();
                var220.field3839 = var3.method3197();
                var220.field3837 = var3.method3127();
                var220.field3843 = new int[var220.field3839];
                var220.field3840 = new int[var220.field3839];
                var220.field3841 = new Field[var220.field3839];
                var220.field3842 = new int[var220.field3839];
                var220.field3838 = new Method[var220.field3839];
                var220.field3844 = new byte[var220.field3839][][];
                for (int var221 = 0; var221 < var220.field3839; var221++) {
                    try {
                        int var222 = var3.method3197();
                        if (var222 == 0 || var222 == 1 || var222 == 2) {
                            String var223 = var3.method3131();
                            String var224 = var3.method3131();
                            int var225 = 0;
                            if (var222 == 1) {
                                var225 = var3.method3127();
                            }
                            var220.field3843[var221] = var222;
                            var220.field3842[var221] = var225;
                            if (class305.method626(var223).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var220.field3841[var221] = class305.method626(var223).getDeclaredField(var224);
                        } else if (var222 == 3 || var222 == 4) {
                            String var226 = var3.method3131();
                            String var227 = var3.method3131();
                            int var228 = var3.method3197();
                            String[] var229 = new String[var228];
                            for (int var230 = 0; var230 < var228; var230++) {
                                var229[var230] = var3.method3131();
                            }
                            String var231 = var3.method3131();
                            byte[][] var232 = new byte[var228][];
                            if (var222 == 3) {
                                for (int var233 = 0; var233 < var228; var233++) {
                                    int var234 = var3.method3127();
                                    var232[var233] = new byte[var234];
                                    var3.method3134(var232[var233], 0, var234);
                                }
                            }
                            var220.field3843[var221] = var222;
                            Class[] var235 = new Class[var228];
                            for (int var236 = 0; var236 < var228; var236++) {
                                var235[var236] = class305.method626(var229[var236]);
                            }
                            Class var237 = class305.method626(var231);
                            if (class305.method626(var226).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var238 = class305.method626(var226).getDeclaredMethods();
                            Method[] var239 = var238;
                            for (int var240 = 0; var240 < var239.length; var240++) {
                                Method var241 = var239[var240];
                                if (var241.getName().equals(var227)) {
                                    Class[] var242 = var241.getParameterTypes();
                                    if (var235.length == var242.length) {
                                        boolean var243 = true;
                                        for (int var244 = 0; var244 < var235.length; var244++) {
                                            if (var235[var244] != var242[var244]) {
                                                var243 = false;
                                                break;
                                            }
                                        }
                                        if (var243 && var237 == var241.getReturnType()) {
                                            var220.field3838[var221] = var241;
                                        }
                                    }
                                }
                            }
                            var220.field3844[var221] = var232;
                        }
                    } catch (ClassNotFoundException var259) {
                        var220.field3840[var221] = -1;
                    } catch (SecurityException var260) {
                        var220.field3840[var221] = -2;
                    } catch (NullPointerException var261) {
                        var220.field3840[var221] = -3;
                    } catch (Exception var262) {
                        var220.field3840[var221] = -4;
                    } catch (Throwable var263) {
                        var220.field3840[var221] = -5;
                    }
                }
                class305.field3848.method3533(var220);
                arg0.field1445 = null;
                return true;
            }
            if (class171.field2213 == arg0.field1445) {
                int var250 = var3.method3197();
                int var251 = var3.method3197();
                int var252 = var3.method3197();
                int var253 = var3.method3197();
                field1053[var250] = true;
                field909[var250] = var251;
                field1055[var250] = var252;
                field1056[var250] = var253;
                field1057[var250] = 0;
                arg0.field1445 = null;
                return true;
            }
            class155.method1770("" + (arg0.field1445 == null ? -1 : arg0.field1445.field2280) + class86.field1270 + (arg0.field1436 == null ? -1 : arg0.field1436.field2280) + class86.field1270 + (arg0.field1449 == null ? -1 : arg0.field1449.field2280) + class86.field1270 + arg0.field1443, (Throwable) null);
            method81();
        } catch (IOException var264) {
            method130();
        } catch (Exception var265) {
            String var256 = "" + (arg0.field1445 == null ? -1 : arg0.field1445.field2280) + class86.field1270 + (arg0.field1436 == null ? -1 : arg0.field1436.field2280) + class86.field1270 + (arg0.field1449 == null ? -1 : arg0.field1449.field2280) + class86.field1270 + arg0.field1443 + class86.field1270 + (Statics.field407 + Statics.field470.field1153[0]) + class86.field1270 + (Statics.field1272 + Statics.field470.field1154[0]) + class86.field1270;
            for (int var257 = 0; var257 < arg0.field1443 && var257 < 50; var257++) {
                var256 = var256 + var3.field2491[var257] + class86.field1270;
            }
            class155.method1770(var256, var265);
            method81();
        }
        return true;
    }

    @ObfuscatedName("l.hu(Lfh;I)V")
    public static final void method131(class174 arg0) {
        class191 var1 = field868.field1442;
        if (class174.field2394 == arg0) {
            int var2 = var1.method3152();
            int var3 = (var2 >> 4 & 0x7) + Statics.field2424;
            int var4 = (var2 & 0x7) + Statics.field466;
            int var5 = var1.method3160();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class205 var6 = field937[Statics.field780][var3][var4];
                if (var6 != null) {
                    for (class92 var7 = (class92) var6.method3581(); var7 != null; var7 = (class92) var6.method3597()) {
                        if ((var5 & 0x7FFF) == var7.field1373) {
                            var7.method3561();
                            break;
                        }
                    }
                    if (var6.method3581() == null) {
                        field937[Statics.field780][var3][var4] = null;
                    }
                    method2069(var3, var4);
                }
            }
            return;
        }
        if (class174.field2393 == arg0) {
            int var8 = var1.method3150();
            int var9 = var1.method3150();
            int var10 = (var9 >> 4 & 0x7) + Statics.field2424;
            int var11 = (var9 & 0x7) + Statics.field466;
            int var12 = var1.method3160();
            int var13 = var1.method3197();
            int var14 = var13 >> 4 & 0xF;
            int var15 = var13 & 0x7;
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                int var16 = var14 + 1;
                if (Statics.field470.field1153[0] >= var10 - var16 && Statics.field470.field1153[0] <= var10 + var16 && Statics.field470.field1154[0] >= var11 - var16 && Statics.field470.field1154[0] <= var11 + var16 && field880 != 0 && var15 > 0 && field1046 < 50) {
                    field1047[field1046] = var12;
                    field1048[field1046] = var15;
                    field895[field1046] = var8;
                    field856[field1046] = null;
                    field843[field1046] = (var10 << 16) + (var11 << 8) + var14;
                    field1046++;
                }
            }
        }
        if (class174.field2397 == arg0) {
            int var17 = var1.method3124();
            int var18 = var1.method3150();
            int var19 = (var18 >> 4 & 0x7) + Statics.field2424;
            int var20 = (var18 & 0x7) + Statics.field466;
            int var21 = var1.method3152();
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = field1071[var22];
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                method1685(Statics.field780, var19, var20, var24, var17, var22, var23, 0, -1);
            }
        } else if (class174.field2396 == arg0) {
            int var25 = var1.method3159();
            int var26 = var1.method3152();
            int var27 = (var26 >> 4 & 0x7) + Statics.field2424;
            int var28 = (var26 & 0x7) + Statics.field466;
            int var29 = var1.method3158();
            int var30 = var1.method3160();
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                class205 var31 = field937[Statics.field780][var27][var28];
                if (var31 != null) {
                    for (class92 var32 = (class92) var31.method3581(); var32 != null; var32 = (class92) var31.method3597()) {
                        if ((var30 & 0x7FFF) == var32.field1373 && var32.field1368 == var25) {
                            var32.field1368 = var29;
                            break;
                        }
                    }
                    method2069(var27, var28);
                }
            }
        } else if (class174.field2392 == arg0) {
            int var33 = var1.method3152();
            int var34 = (var33 >> 4 & 0x7) + Statics.field2424;
            int var35 = (var33 & 0x7) + Statics.field466;
            int var36 = var1.method3160();
            int var37 = var1.method3158();
            int var38 = var1.method3197();
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                int var39 = var34 * 128 + 64;
                int var40 = var35 * 128 + 64;
                class82 var41 = new class82(var36, Statics.field780, var39, var40, method683(var39, var40, Statics.field780) - var38, var37, field832);
                field940.method3572(var41);
            }
        } else {
            if (class174.field2391 == arg0) {
                byte var42 = var1.method3176();
                byte var43 = var1.method3114();
                int var44 = var1.method3159();
                int var45 = var1.method3124();
                int var46 = var1.method3197();
                int var47 = (var46 >> 4 & 0x7) + Statics.field2424;
                int var48 = (var46 & 0x7) + Statics.field466;
                byte var49 = var1.method3123();
                int var50 = var1.method3158();
                int var51 = var1.method3150();
                int var52 = var51 >> 2;
                int var53 = var51 & 0x3;
                int var54 = field1071[var52];
                byte var55 = var1.method3114();
                int var56 = var1.method3159();
                class72 var57;
                if (field928 == var44) {
                    var57 = Statics.field470;
                } else {
                    var57 = field927[var44];
                }
                if (var57 != null) {
                    class267 var58 = class267.method2363(var50);
                    int var59;
                    int var60;
                    if (var53 == 1 || var53 == 3) {
                        var59 = var58.field3512;
                        var60 = var58.field3511;
                    } else {
                        var59 = var58.field3511;
                        var60 = var58.field3512;
                    }
                    int var61 = (var59 >> 1) + var47;
                    int var62 = (var59 + 1 >> 1) + var47;
                    int var63 = (var60 >> 1) + var48;
                    int var64 = (var60 + 1 >> 1) + var48;
                    int[][] var65 = class62.field690[Statics.field780];
                    int var66 = var65[var61][var63] + var65[var62][var63] + var65[var61][var64] + var65[var62][var64] >> 2;
                    int var67 = (var47 << 7) + (var59 << 6);
                    int var68 = (var48 << 7) + (var60 << 6);
                    class131 var69 = var58.method4449(var52, var53, var65, var67, var66, var68);
                    if (var69 != null) {
                        method1685(Statics.field780, var47, var48, var54, -1, 0, 0, var45 + 1, var56 + 1);
                        var57.field796 = field832 + var45;
                        var57.field797 = field832 + var56;
                        var57.field801 = var69;
                        var57.field798 = var47 * 128 + var59 * 64;
                        var57.field807 = var48 * 128 + var60 * 64;
                        var57.field792 = var66;
                        if (var49 > var42) {
                            byte var70 = var49;
                            var49 = var42;
                            var42 = var70;
                        }
                        if (var55 > var43) {
                            byte var71 = var55;
                            var55 = var43;
                            var43 = var71;
                        }
                        var57.field802 = var47 + var49;
                        var57.field804 = var42 + var47;
                        var57.field805 = var48 + var55;
                        var57.field817 = var43 + var48;
                    }
                }
            }
            if (class174.field2390 == arg0) {
                int var72 = var1.method3197();
                int var73 = var1.method3152();
                int var74 = var1.method3159();
                byte var75 = var1.method3123();
                int var76 = var1.method3152() * 4;
                int var77 = var1.method3150() * 4;
                int var78 = var1.method3159();
                byte var79 = var1.method3184();
                int var80 = var1.method3197();
                int var81 = (var80 >> 4 & 0x7) + Statics.field2424;
                int var82 = (var80 & 0x7) + Statics.field466;
                int var83 = var1.method3158();
                int var84 = var1.method3161();
                int var85 = var79 + var81;
                int var86 = var75 + var82;
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var74 != 65535) {
                    int var87 = var81 * 128 + 64;
                    int var88 = var82 * 128 + 64;
                    int var89 = var85 * 128 + 64;
                    int var90 = var86 * 128 + 64;
                    class91 var91 = new class91(var74, Statics.field780, var87, var88, method683(var87, var88, Statics.field780) - var77, field832 + var83, field832 + var78, var72, var73, var84, var76);
                    var91.method1775(var89, var90, method683(var89, var90, Statics.field780) - var76, field832 + var83);
                    field939.method3572(var91);
                }
            } else if (class174.field2395 == arg0) {
                int var92 = var1.method3124();
                int var93 = var1.method3197();
                int var94 = var93 >> 2;
                int var95 = var93 & 0x3;
                int var96 = field1071[var94];
                int var97 = var1.method3151();
                int var98 = (var97 >> 4 & 0x7) + Statics.field2424;
                int var99 = (var97 & 0x7) + Statics.field466;
                if (var98 >= 0 && var99 >= 0 && var98 < 103 && var99 < 103) {
                    if (var96 == 0) {
                        class140 var100 = Statics.field569.method2638(Statics.field780, var98, var99);
                        if (var100 != null) {
                            int var101 = var100.field2006 >> 14 & 0x7FFF;
                            if (var94 == 2) {
                                var100.field2004 = new class97(var101, 2, var95 + 4, Statics.field780, var98, var99, var92, false, var100.field2004);
                                var100.field2005 = new class97(var101, 2, var95 + 1 & 0x3, Statics.field780, var98, var99, var92, false, var100.field2005);
                            } else {
                                var100.field2004 = new class97(var101, var94, var95, Statics.field780, var98, var99, var92, false, var100.field2004);
                            }
                        }
                    }
                    if (var96 == 1) {
                        class145 var102 = Statics.field569.method2639(Statics.field780, var98, var99);
                        if (var102 != null) {
                            int var103 = var102.field2042 >> 14 & 0x7FFF;
                            if (var94 == 4 || var94 == 5) {
                                var102.field2045 = new class97(var103, 4, var95, Statics.field780, var98, var99, var92, false, var102.field2045);
                            } else if (var94 == 6) {
                                var102.field2045 = new class97(var103, 4, var95 + 4, Statics.field780, var98, var99, var92, false, var102.field2045);
                            } else if (var94 == 7) {
                                var102.field2045 = new class97(var103, 4, (var95 + 2 & 0x3) + 4, Statics.field780, var98, var99, var92, false, var102.field2045);
                            } else if (var94 == 8) {
                                var102.field2045 = new class97(var103, 4, var95 + 4, Statics.field780, var98, var99, var92, false, var102.field2045);
                                var102.field2043 = new class97(var103, 4, (var95 + 2 & 0x3) + 4, Statics.field780, var98, var99, var92, false, var102.field2043);
                            }
                        }
                    }
                    if (var96 == 2) {
                        class146 var104 = Statics.field569.method2640(Statics.field780, var98, var99);
                        if (var94 == 11) {
                            var94 = 10;
                        }
                        if (var104 != null) {
                            var104.field2056 = new class97(var104.field2064 >> 14 & 0x7FFF, var94, var95, Statics.field780, var98, var99, var92, false, var104.field2056);
                        }
                    }
                    if (var96 == 3) {
                        class127 var105 = Statics.field569.method2641(Statics.field780, var98, var99);
                        if (var105 != null) {
                            var105.field1743 = new class97(var105.field1740 >> 14 & 0x7FFF, 22, var95, Statics.field780, var98, var99, var92, false, var105.field1743);
                        }
                    }
                }
            } else if (class174.field2389 == arg0) {
                int var106 = var1.method3197();
                int var107 = (var106 >> 4 & 0x7) + Statics.field2424;
                int var108 = (var106 & 0x7) + Statics.field466;
                int var109 = var1.method3152();
                int var110 = var109 >> 2;
                int var111 = var109 & 0x3;
                int var112 = field1071[var110];
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    method1685(Statics.field780, var107, var108, var112, -1, var110, var111, 0, -1);
                }
            } else if (class174.field2398 == arg0) {
                int var113 = var1.method3158();
                int var114 = var1.method3197();
                int var115 = (var114 >> 4 & 0x7) + Statics.field2424;
                int var116 = (var114 & 0x7) + Statics.field466;
                int var117 = var1.method3158();
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                    class92 var118 = new class92();
                    var118.field1373 = var117;
                    var118.field1368 = var113;
                    if (field937[Statics.field780][var115][var116] == null) {
                        field937[Statics.field780][var115][var116] = new class205();
                    }
                    field937[Statics.field780][var115][var116].method3572(var118);
                    method2069(var115, var116);
                }
            }
        }
    }

    @ObfuscatedName("cg.hb(IIIIIIIIII)V")
    public static final void method1685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74 var9 = null;
        for (class74 var10 = (class74) field938.method3581(); var10 != null; var10 = (class74) field938.method3597()) {
            if (var10.field1097 == arg0 && var10.field1090 == arg1 && var10.field1086 == arg2 && var10.field1089 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class74();
            var9.field1097 = arg0;
            var9.field1089 = arg3;
            var9.field1090 = arg1;
            var9.field1086 = arg2;
            method669(var9);
            field938.method3572(var9);
        }
        var9.field1095 = arg4;
        var9.field1092 = arg5;
        var9.field1091 = arg6;
        var9.field1093 = arg7;
        var9.field1094 = arg8;
    }

    @ObfuscatedName("aj.hn(Lba;B)V")
    public static final void method669(class74 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1089 == 0) {
            var1 = Statics.field569.method2700(arg0.field1097, arg0.field1090, arg0.field1086);
        }
        if (arg0.field1089 == 1) {
            var1 = Statics.field569.method2678(arg0.field1097, arg0.field1090, arg0.field1086);
        }
        if (arg0.field1089 == 2) {
            var1 = Statics.field569.method2644(arg0.field1097, arg0.field1090, arg0.field1086);
        }
        if (arg0.field1089 == 3) {
            var1 = Statics.field569.method2645(arg0.field1097, arg0.field1090, arg0.field1086);
        }
        if (var1 != 0) {
            int var5 = Statics.field569.method2750(arg0.field1097, arg0.field1090, arg0.field1086, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1087 = var2;
        arg0.field1088 = var3;
        arg0.field1085 = var4;
    }

    @ObfuscatedName("em.hj(I)V")
    public static final void method2798() {
        for (class74 var0 = (class74) field938.method3581(); var0 != null; var0 = (class74) field938.method3597()) {
            if (var0.field1094 > 0) {
                var0.field1094--;
            }
            if (var0.field1094 != 0) {
                if (var0.field1093 > 0) {
                    var0.field1093--;
                }
                if (var0.field1093 == 0 && var0.field1090 >= 1 && var0.field1086 >= 1 && var0.field1090 <= 102 && var0.field1086 <= 102 && (var0.field1095 < 0 || class62.method1026(var0.field1095, var0.field1092))) {
                    method2458(var0.field1097, var0.field1089, var0.field1090, var0.field1086, var0.field1095, var0.field1091, var0.field1092);
                    var0.field1093 = -1;
                    if (var0.field1095 == var0.field1087 && var0.field1087 == -1) {
                        var0.method3561();
                    } else if (var0.field1095 == var0.field1087 && var0.field1091 == var0.field1085 && var0.field1092 == var0.field1088) {
                        var0.method3561();
                    }
                }
            } else if (var0.field1087 < 0 || class62.method1026(var0.field1087, var0.field1088)) {
                method2458(var0.field1097, var0.field1089, var0.field1090, var0.field1086, var0.field1087, var0.field1085, var0.field1088);
                var0.method3561();
            }
        }
    }

    @ObfuscatedName("dd.hi(IIIIIIII)V")
    public static final void method2458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field827 && Statics.field780 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field569.method2700(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field569.method2678(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field569.method2644(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field569.method2645(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field569.method2750(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field569.method2633(arg0, arg2, arg3);
                class267 var15 = class267.method2363(var12);
                if (var15.field3513 != 0) {
                    field1017[arg0].method2977(arg2, arg3, var13, var14, var15.field3514);
                }
            }
            if (arg1 == 1) {
                Statics.field569.method2634(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field569.method2635(arg0, arg2, arg3);
                class267 var16 = class267.method2363(var12);
                if (var16.field3511 + arg2 > 103 || var16.field3511 + arg3 > 103 || var16.field3512 + arg2 > 103 || var16.field3512 + arg3 > 103) {
                    return;
                }
                if (var16.field3513 != 0) {
                    field1017[arg0].method2978(arg2, arg3, var16.field3511, var16.field3512, var14, var16.field3514);
                }
            }
            if (arg1 == 3) {
                Statics.field569.method2636(arg0, arg2, arg3);
                class267 var17 = class267.method2363(var12);
                if (var17.field3513 == 1) {
                    field1017[arg0].method2974(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field704[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method473(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field569, field1017[arg0]);
    }

    @ObfuscatedName("do.hv(III)V")
    public static final void method2069(int arg0, int arg1) {
        class205 var2 = field937[Statics.field780][arg0][arg1];
        if (var2 == null) {
            Statics.field569.method2637(Statics.field780, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class92 var5 = null;
        for (class92 var6 = (class92) var2.method3581(); var6 != null; var6 = (class92) var2.method3597()) {
            class268 var7 = class268.method1489(var6.field1373);
            long var8 = (long) var7.field3589;
            if (var7.field3568 == 1) {
                var8 = (long) (var6.field1368 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field569.method2637(Statics.field780, arg0, arg1);
            return;
        }
        var2.method3567(var5);
        class92 var10 = null;
        class92 var11 = null;
        for (class92 var12 = (class92) var2.method3581(); var12 != null; var12 = (class92) var2.method3597()) {
            if (var5.field1373 != var12.field1373) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1373 != var12.field1373 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field569.method2623(Statics.field780, arg0, arg1, method683(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field780), var5, var13, var10, var11);
    }

    @ObfuscatedName("ar.ho(ZLgd;I)V")
    public static final void method248(boolean arg0, class191 arg1) {
        field930 = 0;
        field866 = 0;
        class191 var2 = field868.field1442;
        var2.method3380();
        int var3 = var2.method3371(8);
        if (var3 < field864) {
            for (int var4 = var3; var4 < field864; var4++) {
                field931[++field930 - 1] = field865[var4];
            }
        }
        if (var3 > field864) {
            throw new RuntimeException("");
        }
        field864 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field865[var5];
            class84 var7 = field837[var6];
            int var8 = var2.method3371(1);
            if (var8 == 0) {
                field865[++field864 - 1] = var6;
                var7.field1102 = field832;
            } else {
                int var9 = var2.method3371(2);
                if (var9 == 0) {
                    field865[++field864 - 1] = var6;
                    var7.field1102 = field832;
                    field867[++field866 - 1] = var6;
                } else if (var9 == 1) {
                    field865[++field864 - 1] = var6;
                    var7.field1102 = field832;
                    int var10 = var2.method3371(3);
                    var7.method1699(var10, (byte) 1);
                    int var11 = var2.method3371(1);
                    if (var11 == 1) {
                        field867[++field866 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field865[++field864 - 1] = var6;
                    var7.field1102 = field832;
                    int var12 = var2.method3371(3);
                    var7.method1699(var12, (byte) 2);
                    int var13 = var2.method3371(3);
                    var7.method1699(var13, (byte) 2);
                    int var14 = var2.method3371(1);
                    if (var14 == 1) {
                        field867[++field866 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field931[++field930 - 1] = var6;
                }
            }
        }
        method3019(arg0, arg1);
        method1713(arg1);
        for (int var15 = 0; var15 < field930; var15++) {
            int var16 = field931[var15];
            if (field832 != field837[var16].field1102) {
                field837[var16].field1259 = null;
                field837[var16] = null;
            }
        }
        if (field868.field1443 != arg1.field2488) {
            throw new RuntimeException(arg1.field2488 + class86.field1270 + field868.field1443);
        }
        for (int var17 = 0; var17 < field864; var17++) {
            if (field837[field865[var17]] == null) {
                throw new RuntimeException(var17 + class86.field1270 + field864);
            }
        }
    }

    @ObfuscatedName("fa.hs(ZLgd;B)V")
    public static final void method3019(boolean arg0, class191 arg1) {
        while (true) {
            if (arg1.method3373(field868.field1443) >= 27) {
                int var2 = arg1.method3371(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field837[var2] == null) {
                        field837[var2] = new class84();
                        var3 = true;
                    }
                    class84 var4 = field837[var2];
                    field865[++field864 - 1] = var2;
                    var4.field1102 = field832;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method3371(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method3371(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field935[arg1.method3371(3)];
                    if (var3) {
                        var4.field1149 = var4.field1100 = var6;
                    }
                    var4.field1259 = class270.method4001(arg1.method3371(14));
                    int var7 = arg1.method3371(1);
                    int var8;
                    if (arg0) {
                        var8 = arg1.method3371(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method3371(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9 = arg1.method3371(1);
                    if (var9 == 1) {
                        field867[++field866 - 1] = var2;
                    }
                    var4.field1128 = var4.field1259.field3612;
                    var4.field1151 = var4.field1259.field3635;
                    if (var4.field1151 == 0) {
                        var4.field1100 = 0;
                    }
                    var4.field1106 = var4.field1259.field3633;
                    var4.field1145 = var4.field1259.field3630;
                    var4.field1105 = var4.field1259.field3607;
                    var4.field1109 = var4.field1259.field3637;
                    var4.field1103 = var4.field1259.field3615;
                    var4.field1107 = var4.field1259.field3616;
                    var4.field1150 = var4.field1259.field3617;
                    var4.method1700(Statics.field470.field1153[0] + var5, Statics.field470.field1154[0] + var8, var7 == 1);
                    continue;
                }
            }
            arg1.method3372();
            return;
        }
    }

    @ObfuscatedName("ca.hx(Lgd;I)V")
    public static final void method1713(class191 arg0) {
        for (int var1 = 0; var1 < field866; var1++) {
            int var2 = field867[var1];
            class84 var3 = field837[var2];
            int var4 = arg0.method3197();
            if ((var4 & 0x20) != 0) {
                int var5 = arg0.method3150();
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = arg0.method3136();
                        if (var10 == 32767) {
                            var10 = arg0.method3136();
                            var8 = arg0.method3136();
                            var7 = arg0.method3136();
                            var9 = arg0.method3136();
                        } else if (var10 == 32766) {
                            var10 = -1;
                        } else {
                            var8 = arg0.method3136();
                        }
                        int var11 = arg0.method3136();
                        var3.method1466(var10, var8, var7, var9, field832, var11);
                    }
                }
                int var12 = arg0.method3197();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = arg0.method3136();
                        int var15 = arg0.method3136();
                        if (var15 == 32767) {
                            var3.method1473(var14);
                        } else {
                            int var16 = arg0.method3136();
                            int var17 = arg0.method3152();
                            int var18 = var15 > 0 ? arg0.method3152() : var17;
                            var3.method1480(var14, field832, var15, var16, var17, var18);
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1111 = arg0.method3131();
                var3.field1114 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var19 = arg0.method3159();
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = arg0.method3150();
                if (var3.field1130 == var19 && var19 != -1) {
                    int var21 = class272.method2308(var19).field3673;
                    if (var21 == 1) {
                        var3.field1098 = 0;
                        var3.field1124 = 0;
                        var3.field1101 = var20;
                        var3.field1134 = 0;
                    }
                    if (var21 == 2) {
                        var3.field1134 = 0;
                    }
                } else if (var19 == -1 || var3.field1130 == -1 || class272.method2308(var19).field3667 >= class272.method2308(var3.field1130).field3667) {
                    var3.field1130 = var19;
                    var3.field1098 = 0;
                    var3.field1124 = 0;
                    var3.field1101 = var20;
                    var3.field1134 = 0;
                    var3.field1157 = var3.field1099;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1113 = arg0.method3159();
                if (var3.field1113 == 65535) {
                    var3.field1113 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1259 = class270.method4001(arg0.method3159());
                var3.field1128 = var3.field1259.field3612;
                var3.field1151 = var3.field1259.field3635;
                var3.field1106 = var3.field1259.field3633;
                var3.field1145 = var3.field1259.field3630;
                var3.field1105 = var3.field1259.field3607;
                var3.field1109 = var3.field1259.field3637;
                var3.field1103 = var3.field1259.field3615;
                var3.field1107 = var3.field1259.field3616;
                var3.field1150 = var3.field1259.field3617;
            }
            if ((var4 & 0x10) != 0) {
                int var22 = arg0.method3159();
                int var23 = arg0.method3159();
                int var24 = var3.field1152 - (var22 - Statics.field407 - Statics.field407) * 64;
                int var25 = var3.field1117 - (var23 - Statics.field1272 - Statics.field1272) * 64;
                if (var24 != 0 || var25 != 0) {
                    var3.field1126 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1135 = arg0.method3158();
                int var26 = arg0.method3170();
                var3.field1139 = var26 >> 16;
                var3.field1147 = (var26 & 0xFFFF) + field832;
                var3.field1136 = 0;
                var3.field1132 = 0;
                if (var3.field1147 > field832) {
                    var3.field1136 = -1;
                }
                if (var3.field1135 == 65535) {
                    var3.field1135 = -1;
                }
            }
        }
    }

    @ObfuscatedName("ja.he(Lbc;IIBB)V")
    public static final void method4741(class72 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1153[0];
        int var5 = arg0.field1154[0];
        int var6 = arg0.method1049();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1049();
        class169 var8 = method979(arg1, arg2);
        class167 var9 = field1017[arg0.field809];
        int[] var10 = field849;
        int[] var11 = field1080;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class168.field2192[var12][var13] = 0;
                class168.field2189[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class168.method2117(var4, var5, var8, var9);
        } else if (var7 == 2) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class168.field2192[var17][var18] = 99;
            class168.field2189[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class168.field2187[var21] = var4;
            int var78 = var21 + 1;
            class168.field2193[var21] = var5;
            int[][] var23 = var9.field2184;
            boolean var28;
            while (true) {
                if (var78 == var22) {
                    Statics.field601 = var15;
                    Statics.field2191 = var16;
                    var28 = false;
                    break;
                }
                var15 = class168.field2187[var22];
                var16 = class168.field2193[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var9.field2180;
                int var27 = var16 - var9.field2177;
                if (var8.method1027(2, var15, var16, var9)) {
                    Statics.field601 = var15;
                    Statics.field2191 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class168.field2189[var24][var25] + 1;
                if (var24 > 0 && class168.field2192[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0) {
                    class168.field2187[var78] = var15 - 1;
                    class168.field2193[var78] = var16;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2192[var24 - 1][var25] = 2;
                    class168.field2189[var24 - 1][var25] = var29;
                }
                if (var24 < 126 && class168.field2192[var24 + 1][var25] == 0 && (var23[var26 + 2][var27] & 0x1240183) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E0) == 0) {
                    class168.field2187[var78] = var15 + 1;
                    class168.field2193[var78] = var16;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2192[var24 + 1][var25] = 8;
                    class168.field2189[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class168.field2192[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0) {
                    class168.field2187[var78] = var15;
                    class168.field2193[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2192[var24][var25 - 1] = 1;
                    class168.field2189[var24][var25 - 1] = var29;
                }
                if (var25 < 126 && class168.field2192[var24][var25 + 1] == 0 && (var23[var26][var27 + 2] & 0x1240138) == 0 && (var23[var26 + 1][var27 + 2] & 0x12401E0) == 0) {
                    class168.field2187[var78] = var15;
                    class168.field2193[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2192[var24][var25 + 1] = 4;
                    class168.field2189[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class168.field2192[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27] & 0x124013E) == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26][var27 - 1] & 0x124018F) == 0) {
                    class168.field2187[var78] = var15 - 1;
                    class168.field2193[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2192[var24 - 1][var25 - 1] = 3;
                    class168.field2189[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 126 && var25 > 0 && class168.field2192[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x124018F) == 0 && (var23[var26 + 2][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 2][var27] & 0x12401E3) == 0) {
                    class168.field2187[var78] = var15 + 1;
                    class168.field2193[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2192[var24 + 1][var25 - 1] = 9;
                    class168.field2189[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 126 && class168.field2192[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x124013E) == 0 && (var23[var26 - 1][var27 + 2] & 0x1240138) == 0 && (var23[var26][var27 + 2] & 0x12401F8) == 0) {
                    class168.field2187[var78] = var15 - 1;
                    class168.field2193[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2192[var24 - 1][var25 + 1] = 6;
                    class168.field2189[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 126 && var25 < 126 && class168.field2192[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 2] & 0x12401F8) == 0 && (var23[var26 + 2][var27 + 2] & 0x12401E0) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E3) == 0) {
                    class168.field2187[var78] = var15 + 1;
                    class168.field2193[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2192[var24 + 1][var25 + 1] = 12;
                    class168.field2189[var24 + 1][var25 + 1] = var29;
                }
            }
            var14 = var28;
        } else {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class168.field2192[var32][var33] = 99;
            class168.field2189[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class168.field2187[var36] = var4;
            int var79 = var36 + 1;
            class168.field2193[var36] = var5;
            int[][] var38 = var9.field2184;
            boolean var43;
            label550: while (true) {
                label548: while (true) {
                    int var39;
                    int var40;
                    int var41;
                    int var42;
                    int var44;
                    do {
                        do {
                            do {
                                label525: do {
                                    if (var79 == var37) {
                                        Statics.field601 = var30;
                                        Statics.field2191 = var31;
                                        var43 = false;
                                        break label550;
                                    }
                                    var30 = class168.field2187[var37];
                                    var31 = class168.field2193[var37];
                                    var37 = var37 + 1 & 0xFFF;
                                    var39 = var30 - var34;
                                    var40 = var31 - var35;
                                    var41 = var30 - var9.field2180;
                                    var42 = var31 - var9.field2177;
                                    if (var8.method1027(var7, var30, var31, var9)) {
                                        Statics.field601 = var30;
                                        Statics.field2191 = var31;
                                        var43 = true;
                                        break label550;
                                    }
                                    var44 = class168.field2189[var39][var40] + 1;
                                    if (var39 > 0 && class168.field2192[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var7 + var42 - 1] & 0x1240138) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= var7 - 1) {
                                                class168.field2187[var79] = var30 - 1;
                                                class168.field2193[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2192[var39 - 1][var40] = 2;
                                                class168.field2189[var39 - 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 + var45] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && class168.field2192[var39 + 1][var40] == 0 && (var38[var7 + var41][var42] & 0x1240183) == 0 && (var38[var7 + var41][var7 + var42 - 1] & 0x12401E0) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class168.field2187[var79] = var30 + 1;
                                                class168.field2193[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2192[var39 + 1][var40] = 8;
                                                class168.field2189[var39 + 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 + var46] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 > 0 && class168.field2192[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var7 + var41 - 1][var42 - 1] & 0x1240183) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class168.field2187[var79] = var30;
                                                class168.field2193[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2192[var39][var40 - 1] = 1;
                                                class168.field2189[var39][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var47][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class168.field2192[var39][var40 + 1] == 0 && (var38[var41][var7 + var42] & 0x1240138) == 0 && (var38[var7 + var41 - 1][var7 + var42] & 0x12401E0) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class168.field2187[var79] = var30;
                                                class168.field2193[var79] = var31 + 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2192[var39][var40 + 1] = 4;
                                                class168.field2189[var39][var40 + 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var48][var7 + var42] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var39 > 0 && var40 > 0 && class168.field2192[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7) {
                                                class168.field2187[var79] = var30 - 1;
                                                class168.field2193[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2192[var39 - 1][var40 - 1] = 3;
                                                class168.field2189[var39 - 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 - 1 + var49] & 0x124013E) != 0 || (var38[var41 - 1 + var49][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && var40 > 0 && class168.field2192[var39 + 1][var40 - 1] == 0 && (var38[var7 + var41][var42 - 1] & 0x1240183) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class168.field2187[var79] = var30 + 1;
                                                class168.field2193[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2192[var39 + 1][var40 - 1] = 9;
                                                class168.field2189[var39 + 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 - 1 + var50] & 0x12401E3) != 0 || (var38[var41 + var50][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var39 > 0 && var40 < 128 - var7 && class168.field2192[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var7 + var42] & 0x1240138) == 0) {
                                        for (int var51 = 1; var51 < var7; var51++) {
                                            if ((var38[var41 - 1][var42 + var51] & 0x124013E) != 0 || (var38[var41 - 1 + var51][var7 + var42] & 0x12401F8) != 0) {
                                                continue label525;
                                            }
                                        }
                                        class168.field2187[var79] = var30 - 1;
                                        class168.field2193[var79] = var31 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class168.field2192[var39 - 1][var40 + 1] = 6;
                                        class168.field2189[var39 - 1][var40 + 1] = var44;
                                    }
                                } while (var39 >= 128 - var7);
                            } while (var40 >= 128 - var7);
                        } while (class168.field2192[var39 + 1][var40 + 1] != 0);
                    } while ((var38[var7 + var41][var7 + var42] & 0x12401E0) != 0);
                    for (int var52 = 1; var52 < var7; var52++) {
                        if ((var38[var41 + var52][var7 + var42] & 0x12401F8) != 0 || (var38[var7 + var41][var42 + var52] & 0x12401E3) != 0) {
                            continue label548;
                        }
                    }
                    class168.field2187[var79] = var30 + 1;
                    class168.field2193[var79] = var31 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2192[var39 + 1][var40 + 1] = 12;
                    class168.field2189[var39 + 1][var40 + 1] = var44;
                }
            }
            var14 = var43;
        }
        int var71;
        label606: {
            int var53 = var4 - 64;
            int var54 = var5 - 64;
            int var55 = Statics.field601;
            int var56 = Statics.field2191;
            if (!var14) {
                int var57 = Integer.MAX_VALUE;
                int var58 = Integer.MAX_VALUE;
                byte var59 = 10;
                int var60 = var8.field2198;
                int var61 = var8.field2195;
                int var62 = var8.field2196;
                int var63 = var8.field2194;
                for (int var64 = var60 - var59; var64 <= var59 + var60; var64++) {
                    for (int var65 = var61 - var59; var65 <= var59 + var61; var65++) {
                        int var66 = var64 - var53;
                        int var67 = var65 - var54;
                        if (var66 >= 0 && var67 >= 0 && var66 < 128 && var67 < 128 && class168.field2189[var66][var67] < 100) {
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
                            if (var70 < var57 || var57 == var70 && class168.field2189[var66][var67] < var58) {
                                var57 = var70;
                                var58 = class168.field2189[var66][var67];
                                var55 = var64;
                                var56 = var65;
                            }
                        }
                    }
                }
                if (var57 == Integer.MAX_VALUE) {
                    var71 = -1;
                    break label606;
                }
            }
            if (var4 == var55 && var5 == var56) {
                var71 = 0;
            } else {
                byte var72 = 0;
                class168.field2187[var72] = var55;
                int var80 = var72 + 1;
                class168.field2193[var72] = var56;
                int var73;
                int var74 = var73 = class168.field2192[var55 - var53][var56 - var54];
                while (var4 != var55 || var5 != var56) {
                    if (var73 != var74) {
                        var73 = var74;
                        class168.field2187[var80] = var55;
                        class168.field2193[var80++] = var56;
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
                    var74 = class168.field2192[var55 - var53][var56 - var54];
                }
                int var75 = 0;
                while (var80-- > 0) {
                    var10[var75] = class168.field2187[var80];
                    var11[var75++] = class168.field2193[var80];
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
                arg0.method1060(field849[var77], field1080[var77], arg3);
            }
        }
    }

    @ObfuscatedName("bs.ha(III)Lfd;")
    public static class169 method979(int arg0, int arg1) {
        field897.field2198 = arg0;
        field897.field2195 = arg1;
        field897.field2196 = 1;
        field897.field2194 = 1;
        return field897;
    }

    @ObfuscatedName("bg.hy(I)V")
    public static void method957() {
        field946 = 0;
        field839 = false;
    }

    @ObfuscatedName("ho.ht(B)V")
    public static void method3983() {
        method957();
        field951[0] = class237.field3173;
        field952[0] = "";
        field949[0] = 1006;
        field884[0] = false;
        field946 = 1;
    }

    @ObfuscatedName("bv.im(IIIII)V")
    public static final void method1091(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1011; var4++) {
            if (field836[var4] + field1027[var4] > arg0 && field1027[var4] < arg0 + arg2 && field922[var4] + field826[var4] > arg1 && field826[var4] < arg1 + arg3) {
                field1013[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.iq(S)V")
    public final void method1106() {
        method584();
        if (Statics.field480 != null || field981 != null) {
            return;
        }
        int var1 = class60.field677;
        if (field839) {
            if (var1 != 1 && (Statics.field848 || var1 != 4)) {
                int var2 = class60.field662;
                int var3 = class60.field672;
                if (var2 < Statics.field411 - 10 || var2 > Statics.field795 + Statics.field411 + 10 || var3 < Statics.field261 - 10 || var3 > Statics.field261 + Statics.field2001 + 10) {
                    field839 = false;
                    method1091(Statics.field411, Statics.field261, Statics.field795, Statics.field2001);
                }
            }
            if (var1 == 1 || !Statics.field848 && var1 == 4) {
                int var4 = Statics.field411;
                int var5 = Statics.field261;
                int var6 = Statics.field795;
                int var7 = class60.field678;
                int var8 = class60.field671;
                int var9 = -1;
                for (int var10 = 0; var10 < field946; var10++) {
                    int var11 = (field946 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    Statics.method1545(var9);
                }
                field839 = false;
                method1091(Statics.field411, Statics.field261, Statics.field795, Statics.field2001);
            }
            return;
        }
        int var12 = method334();
        if ((var1 == 1 || !Statics.field848 && var1 == 4) && var12 >= 0) {
            int var13 = field949[var12];
            if (var13 == 39 || var13 == 40 || var13 == 41 || var13 == 42 || var13 == 43 || var13 == 33 || var13 == 34 || var13 == 35 || var13 == 36 || var13 == 37 || var13 == 38 || var13 == 1005) {
                int var14 = field947[var12];
                int var15 = field948[var12];
                class228 var16 = class228.method471(var15);
                if (class229.method2370(method920(var16)) || class229.method2335(method920(var16))) {
                    if (Statics.field480 != null && !field924 && field946 > 0 && !this.method1107()) {
                        method991(field915, field1045);
                    }
                    field924 = false;
                    field925 = 0;
                    if (Statics.field480 != null) {
                        method924(Statics.field480);
                    }
                    Statics.field480 = class228.method471(var15);
                    field1003 = var14;
                    field915 = class60.field678;
                    field1045 = class60.field671;
                    if (var12 >= 0) {
                        method3984(var12);
                    }
                    method924(Statics.field480);
                    return;
                }
            }
        }
        if ((var1 == 1 || !Statics.field848 && var1 == 4) && this.method1107()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field848 && var1 == 4) && field946 > 0) {
            Statics.method1545(var12);
        }
        if (var1 == 2 && field946 > 0) {
            this.method1378(class60.field678, class60.field671);
        }
    }

    @ObfuscatedName("client.ii(I)Z")
    public final boolean method1107() {
        int var1 = method334();
        if (field946 > 2) {
            if (field1050 == 1 && !field884[var1]) {
                return true;
            }
            boolean var2;
            if (var1 < 0) {
                var2 = false;
            } else {
                int var3 = field949[var1];
                if (var3 >= 2000) {
                    var3 -= 2000;
                }
                if (var3 == 1007) {
                    var2 = true;
                } else {
                    var2 = false;
                }
            }
            if (var2) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("client.ig(III)V")
    public final void method1378(int arg0, int arg1) {
        int var3 = Statics.field1288.method4848(class237.field2961);
        for (int var4 = 0; var4 < field946; var4++) {
            class287 var5 = Statics.field1288;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field952[var4].length() > 0) {
                var6 = field951[var4] + class237.field3109 + field952[var4];
            } else {
                var6 = field951[var4];
            }
            int var7 = var5.method4848(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field946 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field408) {
            var9 = Statics.field408 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field3453) {
            var10 = Statics.field3453 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field569.method2751(Statics.field780, arg0, arg1, false);
        field839 = true;
        Statics.field411 = var9;
        Statics.field261 = var10;
        Statics.field795 = var3;
        Statics.field2001 = field946 * 15 + 22;
    }

    @ObfuscatedName("fz.it(Lcl;III)V")
    public static final void method3056(class87 arg0, int arg1, int arg2) {
        method1081(arg0.field1286, arg0.field1281, arg0.field1283, arg0.field1284, arg0.field1287, arg0.field1287, arg1, arg2);
    }

    @ObfuscatedName("bc.id(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1081(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 25) {
            class228 var8 = class228.method256(arg1, arg0);
            if (var8 != null) {
                method1782();
                method201(arg1, arg0, class229.method3003(method920(var8)), var8.field2848);
                field960 = 0;
                field1002 = method538(var8);
                if (field1002 == null) {
                    field1002 = "Null";
                }
                if (var8.field2738) {
                    field967 = var8.field2812 + class86.method3(16777215);
                } else {
                    field967 = class86.method3(65280) + var8.field2855 + class86.method3(16777215);
                }
            }
            return;
        }
        if (arg2 == 58) {
            class228 var9 = class228.method256(arg1, arg0);
            if (var9 != null) {
                class175 var10 = class175.method470(class172.field2347, field868.field1440);
                var10.field2403.method3121(var9.field2848);
                var10.field2403.method3250(arg0);
                var10.field2403.method3121(field965);
                var10.field2403.method3110(arg1);
                var10.field2403.method3105(Statics.field465);
                var10.field2403.method3157(field964);
                field868.method1879(var10);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class228 var11 = class228.method256(arg1, arg0);
            if (var11 != null) {
                int var12 = var11.field2848;
                class228 var13 = class228.method256(arg1, arg0);
                if (var13 != null) {
                    if (var13.field2839 != null) {
                        class68 var14 = new class68();
                        var14.field750 = var13;
                        var14.field751 = arg3;
                        var14.field755 = arg5;
                        var14.field748 = var13.field2839;
                        class81.method1724(var14);
                    }
                    boolean var15 = true;
                    if (var13.field2746 > 0) {
                        var15 = method2357(var13);
                    }
                    if (var15 && class229.method160(method920(var13), arg3 - 1)) {
                        if (arg3 == 1) {
                            class175 var16 = class175.method470(class172.field2329, field868.field1440);
                            var16.field2403.method3110(arg1);
                            var16.field2403.method3250(arg0);
                            var16.field2403.method3250(var12);
                            field868.method1879(var16);
                        }
                        if (arg3 == 2) {
                            class175 var17 = class175.method470(class172.field2373, field868.field1440);
                            var17.field2403.method3110(arg1);
                            var17.field2403.method3250(arg0);
                            var17.field2403.method3250(var12);
                            field868.method1879(var17);
                        }
                        if (arg3 == 3) {
                            class175 var18 = class175.method470(class172.field2306, field868.field1440);
                            var18.field2403.method3110(arg1);
                            var18.field2403.method3250(arg0);
                            var18.field2403.method3250(var12);
                            field868.method1879(var18);
                        }
                        if (arg3 == 4) {
                            class175 var19 = class175.method470(class172.field2358, field868.field1440);
                            var19.field2403.method3110(arg1);
                            var19.field2403.method3250(arg0);
                            var19.field2403.method3250(var12);
                            field868.method1879(var19);
                        }
                        if (arg3 == 5) {
                            class175 var20 = class175.method470(class172.field2374, field868.field1440);
                            var20.field2403.method3110(arg1);
                            var20.field2403.method3250(arg0);
                            var20.field2403.method3250(var12);
                            field868.method1879(var20);
                        }
                        if (arg3 == 6) {
                            class175 var21 = class175.method470(class172.field2338, field868.field1440);
                            var21.field2403.method3110(arg1);
                            var21.field2403.method3250(arg0);
                            var21.field2403.method3250(var12);
                            field868.method1879(var21);
                        }
                        if (arg3 == 7) {
                            class175 var22 = class175.method470(class172.field2365, field868.field1440);
                            var22.field2403.method3110(arg1);
                            var22.field2403.method3250(arg0);
                            var22.field2403.method3250(var12);
                            field868.method1879(var22);
                        }
                        if (arg3 == 8) {
                            class175 var23 = class175.method470(class172.field2350, field868.field1440);
                            var23.field2403.method3110(arg1);
                            var23.field2403.method3250(arg0);
                            var23.field2403.method3250(var12);
                            field868.method1879(var23);
                        }
                        if (arg3 == 9) {
                            class175 var24 = class175.method470(class172.field2369, field868.field1440);
                            var24.field2403.method3110(arg1);
                            var24.field2403.method3250(arg0);
                            var24.field2403.method3250(var12);
                            field868.method1879(var24);
                        }
                        if (arg3 == 10) {
                            class175 var25 = class175.method470(class172.field2287, field868.field1440);
                            var25.field2403.method3110(arg1);
                            var25.field2403.method3250(arg0);
                            var25.field2403.method3250(var12);
                            field868.method1879(var25);
                        }
                    }
                }
            }
        }
        if (arg2 == 1005) {
            class228 var26 = class228.method471(arg1);
            if (var26 == null || var26.field2858[arg0] < 100000) {
                class175 var27 = class175.method470(class172.field2296, field868.field1440);
                var27.field2403.method3156(arg3);
                field868.method1879(var27);
            } else {
                Statics.method4020(27, "", var26.field2858[arg0] + " x " + class268.method1489(arg3).field3557);
            }
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 34) {
            class175 var28 = class175.method470(class172.field2355, field868.field1440);
            var28.field2403.method3157(arg3);
            var28.field2403.method3156(arg0);
            var28.field2403.method3110(arg1);
            field868.method1879(var28);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field711.method5403(arg2, arg3, new class224(arg0), new class224(arg1));
        }
        if (arg2 == 11) {
            class84 var29 = field837[arg3];
            if (var29 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var30 = class175.method470(class172.field2346, field868.field1440);
                var30.field2403.method3115(class51.field586[82] ? 1 : 0);
                var30.field2403.method3250(arg3);
                field868.method1879(var30);
            }
        }
        if (arg2 == 41) {
            class175 var31 = class175.method470(class172.field2301, field868.field1440);
            var31.field2403.method3157(arg0);
            var31.field2403.method3121(arg3);
            var31.field2403.method3105(arg1);
            field868.method1879(var31);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 38) {
            method1782();
            class228 var32 = class228.method471(arg1);
            field960 = 1;
            Statics.field3731 = arg0;
            Statics.field477 = arg1;
            Statics.field961 = arg3;
            method924(var32);
            field962 = class86.method3(16748608) + class268.method1489(arg3).field3557 + class86.method3(16777215);
            if (field962 == null) {
                field962 = "null";
            }
            return;
        }
        if (arg2 == 31) {
            class175 var33 = class175.method470(class172.field2286, field868.field1440);
            var33.field2403.method3121(Statics.field961);
            var33.field2403.method3157(Statics.field3731);
            var33.field2403.method3110(Statics.field477);
            var33.field2403.method3250(arg3);
            var33.field2403.method3110(arg1);
            var33.field2403.method3250(arg0);
            field868.method1879(var33);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 15) {
            class72 var34 = field927[arg3];
            if (var34 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var35 = class175.method470(class172.field2284, field868.field1440);
                var35.field2403.method3156(field964);
                var35.field2403.method3156(arg3);
                var35.field2403.method3147(class51.field586[82] ? 1 : 0);
                var35.field2403.method3165(Statics.field465);
                field868.method1879(var35);
            }
        }
        if (arg2 == 14) {
            class72 var36 = field927[arg3];
            if (var36 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var37 = class175.method470(class172.field2354, field868.field1440);
                var37.field2403.method3157(arg3);
                var37.field2403.method3119(Statics.field477);
                var37.field2403.method3147(class51.field586[82] ? 1 : 0);
                var37.field2403.method3250(Statics.field961);
                var37.field2403.method3156(Statics.field3731);
                field868.method1879(var37);
            }
        }
        if (arg2 == 23) {
            if (field839) {
                Statics.field569.method2653();
            } else {
                Statics.field569.method2751(Statics.field780, arg0, arg1, true);
            }
        }
        if (arg2 == 32) {
            class175 var38 = class175.method470(class172.field2343, field868.field1440);
            var38.field2403.method3110(arg1);
            var38.field2403.method3157(arg0);
            var38.field2403.method3250(arg3);
            var38.field2403.method3119(Statics.field465);
            var38.field2403.method3157(field964);
            field868.method1879(var38);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 12) {
            class84 var39 = field837[arg3];
            if (var39 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var40 = class175.method470(class172.field2317, field868.field1440);
                var40.field2403.method3107(class51.field586[82] ? 1 : 0);
                var40.field2403.method3250(arg3);
                field868.method1879(var40);
            }
        }
        if (arg2 == 19) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var41 = class175.method470(class172.field2311, field868.field1440);
            var41.field2403.method3157(Statics.field407 + arg0);
            var41.field2403.method3107(class51.field586[82] ? 1 : 0);
            var41.field2403.method3156(arg3);
            var41.field2403.method3121(Statics.field1272 + arg1);
            field868.method1879(var41);
        }
        if (arg2 == 36) {
            class175 var42 = class175.method470(class172.field2345, field868.field1440);
            var42.field2403.method3156(arg0);
            var42.field2403.method3110(arg1);
            var42.field2403.method3121(arg3);
            field868.method1879(var42);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 5) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var43 = class175.method470(class172.field2336, field868.field1440);
            var43.field2403.method3157(arg3 >> 14 & 0x7FFF);
            var43.field2403.method3121(Statics.field1272 + arg1);
            var43.field2403.method3107(class51.field586[82] ? 1 : 0);
            var43.field2403.method3157(Statics.field407 + arg0);
            field868.method1879(var43);
        }
        if (arg2 == 48) {
            class72 var44 = field927[arg3];
            if (var44 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var45 = class175.method470(class172.field2314, field868.field1440);
                var45.field2403.method3147(class51.field586[82] ? 1 : 0);
                var45.field2403.method3121(arg3);
                field868.method1879(var45);
            }
        }
        if (arg2 == 29) {
            class175 var46 = class175.method470(class172.field2315, field868.field1440);
            var46.field2403.method3110(arg1);
            field868.method1879(var46);
            class228 var47 = class228.method471(arg1);
            if (var47.field2851 != null && var47.field2851[0][0] == 5) {
                int var48 = var47.field2851[0][1];
                if (class223.field2691[var48] != var47.field2853[0]) {
                    class223.field2691[var48] = var47.field2853[0];
                    method252(var48);
                }
            }
        }
        if (arg2 == 21) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var49 = class175.method470(class172.field2335, field868.field1440);
            var49.field2403.method3250(arg3);
            var49.field2403.method3121(Statics.field1272 + arg1);
            var49.field2403.method3107(class51.field586[82] ? 1 : 0);
            var49.field2403.method3156(Statics.field407 + arg0);
            field868.method1879(var49);
        }
        if (arg2 == 20) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var50 = class175.method470(class172.field2325, field868.field1440);
            var50.field2403.method3121(arg3);
            var50.field2403.method3121(Statics.field407 + arg0);
            var50.field2403.method3147(class51.field586[82] ? 1 : 0);
            var50.field2403.method3121(Statics.field1272 + arg1);
            field868.method1879(var50);
        }
        if (arg2 == 3) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var51 = class175.method470(class172.field2330, field868.field1440);
            var51.field2403.method3156(Statics.field407 + arg0);
            var51.field2403.method3157(arg3 >> 14 & 0x7FFF);
            var51.field2403.method3157(Statics.field1272 + arg1);
            var51.field2403.method3147(class51.field586[82] ? 1 : 0);
            field868.method1879(var51);
        }
        if (arg2 == 47) {
            class72 var52 = field927[arg3];
            if (var52 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var53 = class175.method470(class172.field2289, field868.field1440);
                var53.field2403.method3115(class51.field586[82] ? 1 : 0);
                var53.field2403.method3250(arg3);
                field868.method1879(var53);
            }
        }
        if (arg2 == 37) {
            class175 var54 = class175.method470(class172.field2297, field868.field1440);
            var54.field2403.method3157(arg0);
            var54.field2403.method3156(arg3);
            var54.field2403.method3165(arg1);
            field868.method1879(var54);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 43) {
            class175 var55 = class175.method470(class172.field2349, field868.field1440);
            var55.field2403.method3250(arg0);
            var55.field2403.method3165(arg1);
            var55.field2403.method3156(arg3);
            field868.method1879(var55);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 1001) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var56 = class175.method470(class172.field2327, field868.field1440);
            var56.field2403.method3147(class51.field586[82] ? 1 : 0);
            var56.field2403.method3250(arg3 >> 14 & 0x7FFF);
            var56.field2403.method3121(Statics.field1272 + arg1);
            var56.field2403.method3156(Statics.field407 + arg0);
            field868.method1879(var56);
        }
        if (arg2 == 30 && field972 == null) {
            method1679(arg1, arg0);
            field972 = class228.method256(arg1, arg0);
            method924(field972);
        }
        if (arg2 == 18) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var57 = class175.method470(class172.field2318, field868.field1440);
            var57.field2403.method3148(class51.field586[82] ? 1 : 0);
            var57.field2403.method3156(Statics.field1272 + arg1);
            var57.field2403.method3250(arg3);
            var57.field2403.method3157(Statics.field407 + arg0);
            field868.method1879(var57);
        }
        if (arg2 == 51) {
            class72 var58 = field927[arg3];
            if (var58 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var59 = class175.method470(class172.field2332, field868.field1440);
                var59.field2403.method3107(class51.field586[82] ? 1 : 0);
                var59.field2403.method3250(arg3);
                field868.method1879(var59);
            }
        }
        if (arg2 == 9) {
            class84 var60 = field837[arg3];
            if (var60 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var61 = class175.method470(class172.field2285, field868.field1440);
                var61.field2403.method3250(arg3);
                var61.field2403.method3148(class51.field586[82] ? 1 : 0);
                field868.method1879(var61);
            }
        }
        if (arg2 == 40) {
            class175 var62 = class175.method470(class172.field2294, field868.field1440);
            var62.field2403.method3250(arg0);
            var62.field2403.method3105(arg1);
            var62.field2403.method3157(arg3);
            field868.method1879(var62);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 1) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var63 = class175.method470(class172.field2321, field868.field1440);
            var63.field2403.method3121(Statics.field961);
            var63.field2403.method3157(Statics.field3731);
            var63.field2403.method3148(class51.field586[82] ? 1 : 0);
            var63.field2403.method3157(Statics.field407 + arg0);
            var63.field2403.method3250(Statics.field1272 + arg1);
            var63.field2403.method3110(Statics.field477);
            var63.field2403.method3121(arg3 >> 14 & 0x7FFF);
            field868.method1879(var63);
        }
        if (arg2 == 26) {
            Statics.method2824();
        }
        if (arg2 == 46) {
            class72 var64 = field927[arg3];
            if (var64 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var65 = class175.method470(class172.field2366, field868.field1440);
                var65.field2403.method3121(arg3);
                var65.field2403.method3147(class51.field586[82] ? 1 : 0);
                field868.method1879(var65);
            }
        }
        if (arg2 == 8) {
            class84 var66 = field837[arg3];
            if (var66 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var67 = class175.method470(class172.field2377, field868.field1440);
                var67.field2403.method3110(Statics.field465);
                var67.field2403.method3107(class51.field586[82] ? 1 : 0);
                var67.field2403.method3121(arg3);
                var67.field2403.method3157(field964);
                field868.method1879(var67);
            }
        }
        if (arg2 == 13) {
            class84 var68 = field837[arg3];
            if (var68 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var69 = class175.method470(class172.field2303, field868.field1440);
                var69.field2403.method3147(class51.field586[82] ? 1 : 0);
                var69.field2403.method3156(arg3);
                field868.method1879(var69);
            }
        }
        if (arg2 == 10) {
            class84 var70 = field837[arg3];
            if (var70 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var71 = class175.method470(class172.field2339, field868.field1440);
                var71.field2403.method3115(class51.field586[82] ? 1 : 0);
                var71.field2403.method3156(arg3);
                field868.method1879(var71);
            }
        }
        if (arg2 == 1003) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            class84 var72 = field837[arg3];
            if (var72 != null) {
                class270 var73 = var72.field1259;
                if (var73.field3636 != null) {
                    var73 = var73.method4554();
                }
                if (var73 != null) {
                    class175 var74 = class175.method470(class172.field2372, field868.field1440);
                    var74.field2403.method3250(var73.field3610);
                    field868.method1879(var74);
                }
            }
        }
        if (arg2 == 7) {
            class84 var75 = field837[arg3];
            if (var75 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var76 = class175.method470(class172.field2283, field868.field1440);
                var76.field2403.method3121(Statics.field961);
                var76.field2403.method3107(class51.field586[82] ? 1 : 0);
                var76.field2403.method3156(Statics.field3731);
                var76.field2403.method3110(Statics.field477);
                var76.field2403.method3157(arg3);
                field868.method1879(var76);
            }
        }
        if (arg2 == 49) {
            class72 var77 = field927[arg3];
            if (var77 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var78 = class175.method470(class172.field2320, field868.field1440);
                var78.field2403.method3156(arg3);
                var78.field2403.method3115(class51.field586[82] ? 1 : 0);
                field868.method1879(var78);
            }
        }
        if (arg2 == 22) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var79 = class175.method470(class172.field2307, field868.field1440);
            var79.field2403.method3156(arg3);
            var79.field2403.method3121(Statics.field1272 + arg1);
            var79.field2403.method3157(Statics.field407 + arg0);
            var79.field2403.method3107(class51.field586[82] ? 1 : 0);
            field868.method1879(var79);
        }
        if (arg2 == 17) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var80 = class175.method470(class172.field2310, field868.field1440);
            var80.field2403.method3165(Statics.field465);
            var80.field2403.method3156(field964);
            var80.field2403.method3250(arg3);
            var80.field2403.method3148(class51.field586[82] ? 1 : 0);
            var80.field2403.method3250(Statics.field407 + arg0);
            var80.field2403.method3121(Statics.field1272 + arg1);
            field868.method1879(var80);
        }
        if (arg2 == 44) {
            class72 var81 = field927[arg3];
            if (var81 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var82 = class175.method470(class172.field2364, field868.field1440);
                var82.field2403.method3121(arg3);
                var82.field2403.method3148(class51.field586[82] ? 1 : 0);
                field868.method1879(var82);
            }
        }
        if (arg2 == 33) {
            class175 var83 = class175.method470(class172.field2353, field868.field1440);
            var83.field2403.method3110(arg1);
            var83.field2403.method3157(arg0);
            var83.field2403.method3156(arg3);
            field868.method1879(var83);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 28) {
            class175 var84 = class175.method470(class172.field2315, field868.field1440);
            var84.field2403.method3110(arg1);
            field868.method1879(var84);
            class228 var85 = class228.method471(arg1);
            if (var85.field2851 != null && var85.field2851[0][0] == 5) {
                int var86 = var85.field2851[0][1];
                class223.field2691[var86] = 1 - class223.field2691[var86];
                method252(var86);
            }
        }
        if (arg2 == 42) {
            class175 var87 = class175.method470(class172.field2348, field868.field1440);
            var87.field2403.method3121(arg3);
            var87.field2403.method3119(arg1);
            var87.field2403.method3157(arg0);
            field868.method1879(var87);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 35) {
            class175 var88 = class175.method470(class172.field2288, field868.field1440);
            var88.field2403.method3157(arg3);
            var88.field2403.method3110(arg1);
            var88.field2403.method3156(arg0);
            field868.method1879(var88);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 45) {
            class72 var89 = field927[arg3];
            if (var89 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var90 = class175.method470(class172.field2378, field868.field1440);
                var90.field2403.method3148(class51.field586[82] ? 1 : 0);
                var90.field2403.method3156(arg3);
                field868.method1879(var90);
            }
        }
        if (arg2 == 2) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var91 = class175.method470(class172.field2362, field868.field1440);
            var91.field2403.method3156(field964);
            var91.field2403.method3148(class51.field586[82] ? 1 : 0);
            var91.field2403.method3119(Statics.field465);
            var91.field2403.method3157(arg3 >> 14 & 0x7FFF);
            var91.field2403.method3250(Statics.field1272 + arg1);
            var91.field2403.method3156(Statics.field407 + arg0);
            field868.method1879(var91);
        }
        if (arg2 == 1004) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            class175 var92 = class175.method470(class172.field2296, field868.field1440);
            var92.field2403.method3156(arg3);
            field868.method1879(var92);
        }
        if (arg2 == 4) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var93 = class175.method470(class172.field2308, field868.field1440);
            var93.field2403.method3107(class51.field586[82] ? 1 : 0);
            var93.field2403.method3250(Statics.field1272 + arg1);
            var93.field2403.method3156(Statics.field407 + arg0);
            var93.field2403.method3250(arg3 >> 14 & 0x7FFF);
            field868.method1879(var93);
        }
        if (arg2 == 39) {
            class175 var94 = class175.method470(class172.field2340, field868.field1440);
            var94.field2403.method3121(arg3);
            var94.field2403.method3110(arg1);
            var94.field2403.method3121(arg0);
            field868.method1879(var94);
            field882 = 0;
            Statics.field350 = class228.method471(arg1);
            field933 = arg0;
        }
        if (arg2 == 50) {
            class72 var95 = field927[arg3];
            if (var95 != null) {
                field945 = arg6;
                field921 = arg7;
                field917 = 2;
                field872 = 0;
                field1038 = arg0;
                field1039 = arg1;
                class175 var96 = class175.method470(class172.field2333, field868.field1440);
                var96.field2403.method3107(class51.field586[82] ? 1 : 0);
                var96.field2403.method3156(arg3);
                field868.method1879(var96);
            }
        }
        if (arg2 == 24) {
            class228 var97 = class228.method471(arg1);
            boolean var98 = true;
            if (var97.field2746 > 0) {
                var98 = method2357(var97);
            }
            if (var98) {
                class175 var99 = class175.method470(class172.field2315, field868.field1440);
                var99.field2403.method3110(arg1);
                field868.method1879(var99);
            }
        }
        if (arg2 == 6) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var100 = class175.method470(class172.field2304, field868.field1440);
            var100.field2403.method3250(Statics.field407 + arg0);
            var100.field2403.method3250(arg3 >> 14 & 0x7FFF);
            var100.field2403.method3107(class51.field586[82] ? 1 : 0);
            var100.field2403.method3250(Statics.field1272 + arg1);
            field868.method1879(var100);
        }
        if (arg2 == 1002) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            class175 var101 = class175.method470(class172.field2299, field868.field1440);
            var101.field2403.method3121(arg3 >> 14 & 0x7FFF);
            field868.method1879(var101);
        }
        if (arg2 == 16) {
            field945 = arg6;
            field921 = arg7;
            field917 = 2;
            field872 = 0;
            field1038 = arg0;
            field1039 = arg1;
            class175 var102 = class175.method470(class172.field2292, field868.field1440);
            var102.field2403.method3250(Statics.field1272 + arg1);
            var102.field2403.method3105(Statics.field477);
            var102.field2403.method3121(Statics.field407 + arg0);
            var102.field2403.method3107(class51.field586[82] ? 1 : 0);
            var102.field2403.method3157(arg3);
            var102.field2403.method3156(Statics.field961);
            var102.field2403.method3156(Statics.field3731);
            field868.method1879(var102);
        }
        if (field960 != 0) {
            field960 = 0;
            method924(class228.method471(Statics.field477));
        }
        if (field963) {
            method1782();
        }
        if (Statics.field350 != null && field882 == 0) {
            method924(Statics.field350);
        }
    }

    @ObfuscatedName("aa.iu(IIIII)V")
    public static void method201(int arg0, int arg1, int arg2, int arg3) {
        class228 var4 = class228.method256(arg0, arg1);
        if (var4 != null && var4.field2781 != null) {
            class68 var5 = new class68();
            var5.field750 = var4;
            var5.field748 = var4.field2781;
            class81.method1724(var5);
        }
        field965 = arg3;
        field963 = true;
        Statics.field465 = arg0;
        field964 = arg1;
        Statics.field604 = arg2;
        method924(var4);
    }

    @ObfuscatedName("cy.ir(I)V")
    public static void method1782() {
        if (!field963) {
            return;
        }
        class228 var0 = class228.method256(Statics.field465, field964);
        if (var0 != null && var0.field2831 != null) {
            class68 var1 = new class68();
            var1.field750 = var0;
            var1.field748 = var0.field2831;
            class81.method1724(var1);
        }
        field963 = false;
        method924(var0);
    }

    @ObfuscatedName("cc.ic(III)V")
    public static void method1679(int arg0, int arg1) {
        class175 var2 = class175.method470(class172.field2309, field868.field1440);
        var2.field2403.method3165(arg0);
        var2.field2403.method3121(arg1);
        field868.method1879(var2);
    }

    @ObfuscatedName("ac.if(I)V")
    public static final void method584() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field946 - 1; var1++) {
                if (field949[var1] < 1000 && field949[var1 + 1] > 1000) {
                    String var2 = field952[var1];
                    field952[var1] = field952[var1 + 1];
                    field952[var1 + 1] = var2;
                    String var3 = field951[var1];
                    field951[var1] = field951[var1 + 1];
                    field951[var1 + 1] = var3;
                    int var4 = field949[var1];
                    field949[var1] = field949[var1 + 1];
                    field949[var1 + 1] = var4;
                    int var5 = field947[var1];
                    field947[var1] = field947[var1 + 1];
                    field947[var1 + 1] = var5;
                    int var6 = field948[var1];
                    field948[var1] = field948[var1 + 1];
                    field948[var1 + 1] = var6;
                    int var7 = field919[var1];
                    field919[var1] = field919[var1 + 1];
                    field919[var1 + 1] = var7;
                    boolean var8 = field884[var1];
                    field884[var1] = field884[var1 + 1];
                    field884[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("s.ik(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method12(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method4934(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("kq.iy(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method4934(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field839 || field946 >= 500) {
            return;
        }
        field951[field946] = arg0;
        field952[field946] = arg1;
        field949[field946] = arg2;
        field919[field946] = arg3;
        field947[field946] = arg4;
        field948[field946] = arg5;
        field884[field946] = arg6;
        field946++;
    }

    @ObfuscatedName("ai.io(B)I")
    public static final int method334() {
        return field946 - 1;
    }

    @ObfuscatedName("m.is(B)V")
    public static void method53() {
        for (int var0 = 0; var0 < field946; var0++) {
            int var1 = field949[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field946 - 1) {
                    for (int var3 = var0; var3 < field946 - 1; var3++) {
                        field951[var3] = field951[var3 + 1];
                        field952[var3] = field952[var3 + 1];
                        field949[var3] = field949[var3 + 1];
                        field919[var3] = field919[var3 + 1];
                        field947[var3] = field947[var3 + 1];
                        field948[var3] = field948[var3 + 1];
                        field884[var3] = field884[var3 + 1];
                    }
                }
                field946--;
            }
        }
    }

    @ObfuscatedName("fz.ih(Ljp;IIII)V")
    public static final void method3053(class270 arg0, int arg1, int arg2, int arg3) {
        if (field946 >= 400) {
            return;
        }
        if (arg0.field3636 != null) {
            arg0 = arg0.method4554();
        }
        if (arg0 == null || !arg0.field3631 || arg0.field3641 && field891 != arg1) {
            return;
        }
        String var4 = arg0.field3611;
        if (arg0.field3628 != 0) {
            var4 = var4 + method992(arg0.field3628, Statics.field470.field793) + " " + class86.field1277 + class237.field3090 + arg0.field3628 + class86.field1273;
        }
        if (arg0.field3641 && field954) {
            method12(class237.field3085, class86.method3(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field960 == 1) {
            method12(class237.field3064, field962 + " " + class86.field1274 + " " + class86.method3(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field963) {
            int var5 = arg0.field3641 && field954 ? 2000 : 0;
            String[] var6 = arg0.field3626;
            if (field979) {
                var6 = method121(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class237.field3086)) {
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
                        method12(var6[var7], class86.method3(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class237.field3086)) {
                        short var10 = 0;
                        if (field850 != class89.field1296) {
                            if (field850 == class89.field1297 || field850 == class89.field1299 && arg0.field3628 > Statics.field470.field793) {
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
                            method12(var6[var9], class86.method3(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3641 || !field954) {
                method12(class237.field3085, class86.method3(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field604 & 0x2) == 2) {
            method12(field1002, field967 + " " + class86.field1274 + " " + class86.method3(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ar.iz(Lbc;IIII)V")
    public static final void method246(class72 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field470 == arg0 || field946 >= 400) {
            return;
        }
        String var4;
        if (arg0.field816 == 0) {
            var4 = arg0.field803[0] + arg0.field787 + arg0.field803[1] + method992(arg0.field793, Statics.field470.field793) + " " + class86.field1277 + class237.field3090 + arg0.field793 + class86.field1273 + arg0.field803[2];
        } else {
            var4 = arg0.field803[0] + arg0.field787 + arg0.field803[1] + " " + class86.field1277 + class237.field3091 + arg0.field816 + class86.field1273 + arg0.field803[2];
        }
        if (field960 == 1) {
            method12(class237.field3064, field962 + " " + class86.field1274 + " " + class86.method3(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field963) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field985[var5] != null) {
                    short var6 = 0;
                    if (field985[var5].equalsIgnoreCase(class237.field3086)) {
                        if (field900 == class89.field1296) {
                            continue;
                        }
                        if (field900 == class89.field1297 || field900 == class89.field1299 && arg0.field793 > Statics.field470.field793) {
                            var6 = 2000;
                        }
                        if (Statics.field470.field799 != 0 && arg0.field799 != 0) {
                            if (Statics.field470.field799 == arg0.field799) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field934[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field932[var5] + var6;
                    method12(field985[var5], class86.method3(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field604 & 0x8) == 8) {
            method12(field1002, field967 + " " + class86.field1274 + " " + class86.method3(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field946; var9++) {
            if (field949[var9] == 23) {
                field952[var9] = class86.method3(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bk.ip(IIB)Ljava/lang/String;")
    public static final String method992(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class86.method3(16711680);
        } else if (var2 < -6) {
            return class86.method3(16723968);
        } else if (var2 < -3) {
            return class86.method3(16740352);
        } else if (var2 < 0) {
            return class86.method3(16756736);
        } else if (var2 > 9) {
            return class86.method3(65280);
        } else if (var2 > 6) {
            return class86.method3(4259584);
        } else if (var2 > 3) {
            return class86.method3(8453888);
        } else if (var2 > 0) {
            return class86.method3(12648192);
        } else {
            return class86.method3(16776960);
        }
    }

    @ObfuscatedName("il.iw(IIIIIIIII)V")
    public static final void method4239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class228.method3651(arg0)) {
            Statics.field1418 = null;
            method494(Statics.field3286[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1418 != null) {
                method494(Statics.field1418, -1412584499, arg1, arg2, arg3, arg4, Statics.field228, Statics.field2668, arg7);
                Statics.field1418 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1013[var8] = true;
            }
        } else {
            field1013[arg7] = true;
        }
    }

    @ObfuscatedName("ag.il([Lho;IIIIIIIII)V")
    public static final void method494(class228[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class306.method5029(arg2, arg3, arg4, arg5);
        class134.method2547();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class228 var10 = arg0[var9];
            if (var10 != null && (var10.field2758 == arg1 || arg1 == -1412584499 && field981 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1027[field1011] = var10.field2847 + arg6;
                    field826[field1011] = var10.field2753 + arg7;
                    field836[field1011] = var10.field2754;
                    field922[field1011] = var10.field2764;
                    var11 = ++field1011 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2782 = var11;
                var10.field2863 = field832;
                if (!var10.field2738 || !method212(var10)) {
                    if (var10.field2746 > 0) {
                        int var12 = var10.field2746;
                        if (var12 == 324) {
                            if (field1072 == -1) {
                                field1072 = var10.field2774;
                                field1073 = var10.field2806;
                            }
                            if (field1082.field2704) {
                                var10.field2774 = field1072;
                            } else {
                                var10.field2774 = field1073;
                            }
                        } else if (var12 == 325) {
                            if (field1072 == -1) {
                                field1072 = var10.field2774;
                                field1073 = var10.field2806;
                            }
                            if (field1082.field2704) {
                                var10.field2774 = field1073;
                            } else {
                                var10.field2774 = field1072;
                            }
                        } else if (var12 == 327) {
                            var10.field2727 = 150;
                            var10.field2791 = (int) (Math.sin((double) field832 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2755 = 5;
                            var10.field2834 = 0;
                        } else if (var12 == 328) {
                            var10.field2727 = 150;
                            var10.field2791 = (int) (Math.sin((double) field832 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2755 = 5;
                            var10.field2834 = 1;
                        }
                    }
                    int var13 = var10.field2847 + arg6;
                    int var14 = var10.field2753 + arg7;
                    int var15 = var10.field2770;
                    if (field981 == var10) {
                        if (arg1 != -1412584499 && !var10.field2817) {
                            Statics.field1418 = arg0;
                            Statics.field228 = arg6;
                            Statics.field2668 = arg7;
                            continue;
                        }
                        if (field992 && field986) {
                            int var16 = class60.field662;
                            int var17 = class60.field672;
                            int var18 = var16 - field983;
                            int var19 = var17 - field984;
                            if (var18 < field987) {
                                var18 = field987;
                            }
                            if (var10.field2754 + var18 > field987 + field982.field2754) {
                                var18 = field987 + field982.field2754 - var10.field2754;
                            }
                            if (var19 < field988) {
                                var19 = field988;
                            }
                            if (var10.field2764 + var19 > field988 + field982.field2764) {
                                var19 = field988 + field982.field2764 - var10.field2764;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2817) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2741 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2741 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2754 + var13;
                        int var27 = var10.field2764 + var14;
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        if (var27 < var14) {
                            var25 = var27;
                            var27 = var14;
                        }
                        var26++;
                        var27++;
                        var20 = var24 > arg2 ? var24 : arg2;
                        var21 = var25 > arg3 ? var25 : arg3;
                        var22 = var26 < arg4 ? var26 : arg4;
                        var23 = var27 < arg5 ? var27 : arg5;
                    } else {
                        int var30 = var10.field2754 + var13;
                        int var31 = var10.field2764 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2738 || var20 < var22 && var21 < var23) {
                        if (var10.field2746 != 0) {
                            if (var10.field2746 == 1336) {
                                if (field997) {
                                    var14 += 15;
                                    Statics.field234.method4870("Fps:" + field636, var10.field2754 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field827) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field827) {
                                        var34 = 16711680;
                                    }
                                    Statics.field234.method4870("Mem:" + var33 + "k", var10.field2754 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2746 == 1337) {
                                field956 = var13;
                                field1026 = var14;
                                method7(var13, var14, var10.field2754, var10.field2764);
                                field1013[var10.field2782] = true;
                                class306.method5029(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2746 == 1338) {
                                method4774();
                                class222 var35 = var10.method3969(false);
                                if (var35 != null) {
                                    class306.method5029(var13, var14, var35.field2687 + var13, var35.field2685 + var14);
                                    if (field1051 == 2 || field1051 == 5) {
                                        class306.method5074(var13, var14, 0, var35.field2686, var35.field2684);
                                    } else {
                                        int var36 = field853 & 0x7FF;
                                        int var37 = Statics.field470.field1152 / 32 + 48;
                                        int var38 = 464 - Statics.field470.field1117 / 32;
                                        Statics.field394.method5134(var13, var14, var35.field2687, var35.field2685, var37, var38, var36, 256, var35.field2686, var35.field2684);
                                        for (int var39 = 0; var39 < field1034; var39++) {
                                            int var40 = field1035[var39] * 4 + 2 - Statics.field470.field1152 / 32;
                                            int var41 = field1036[var39] * 4 + 2 - Statics.field470.field1117 / 32;
                                            method2862(var13, var14, var40, var41, field970[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < field864; var47++) {
                                                    class84 var48 = field837[field865[var47]];
                                                    if (var48 != null && var48.method1048()) {
                                                        class270 var49 = var48.field1259;
                                                        if (var49 != null && var49.field3636 != null) {
                                                            var49 = var49.method4554();
                                                        }
                                                        if (var49 != null && var49.field3627 && var49.field3631) {
                                                            int var50 = var48.field1152 / 32 - Statics.field470.field1152 / 32;
                                                            int var51 = var48.field1117 / 32 - Statics.field470.field1117 / 32;
                                                            method2862(var13, var14, var50, var51, Statics.field2874[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class93.field1379;
                                                int[] var53 = class93.field1380;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class72 var55 = field927[var53[var54]];
                                                    if (var55 != null && var55.method1048() && !var55.field808 && Statics.field470 != var55) {
                                                        int var56 = var55.field1152 / 32 - Statics.field470.field1152 / 32;
                                                        int var57 = var55.field1117 / 32 - Statics.field470.field1117 / 32;
                                                        boolean var58 = false;
                                                        if (Statics.field470.field799 != 0 && var55.field799 != 0 && Statics.field470.field799 == var55.field799) {
                                                            var58 = true;
                                                        }
                                                        if (var55.method1038()) {
                                                            method2862(var13, var14, var56, var57, Statics.field2874[3], var35);
                                                        } else if (var58) {
                                                            method2862(var13, var14, var56, var57, Statics.field2874[4], var35);
                                                        } else if (var55.method1054()) {
                                                            method2862(var13, var14, var56, var57, Statics.field2874[5], var35);
                                                        } else {
                                                            method2862(var13, var14, var56, var57, Statics.field2874[2], var35);
                                                        }
                                                    }
                                                }
                                                if (field840 != 0 && field832 % 20 < 10) {
                                                    if (field840 == 1 && field841 >= 0 && field841 < field837.length) {
                                                        class84 var59 = field837[field841];
                                                        if (var59 != null) {
                                                            int var60 = var59.field1152 / 32 - Statics.field470.field1152 / 32;
                                                            int var61 = var59.field1117 / 32 - Statics.field470.field1117 / 32;
                                                            method4228(var13, var14, var60, var61, Statics.field2485[1], var35);
                                                        }
                                                    }
                                                    if (field840 == 2) {
                                                        int var62 = field1049 * 4 - Statics.field407 * 4 + 2 - Statics.field470.field1152 / 32;
                                                        int var63 = field1018 * 4 - Statics.field1272 * 4 + 2 - Statics.field470.field1117 / 32;
                                                        method4228(var13, var14, var62, var63, Statics.field2485[1], var35);
                                                    }
                                                    if (field840 == 10 && field998 >= 0 && field998 < field927.length) {
                                                        class72 var64 = field927[field998];
                                                        if (var64 != null) {
                                                            int var65 = var64.field1152 / 32 - Statics.field470.field1152 / 32;
                                                            int var66 = var64.field1117 / 32 - Statics.field470.field1117 / 32;
                                                            method4228(var13, var14, var65, var66, Statics.field2485[1], var35);
                                                        }
                                                    }
                                                }
                                                if (field1038 != 0) {
                                                    int var67 = field1038 * 4 + 2 - Statics.field470.field1152 / 32;
                                                    int var68 = field1039 * 4 + 2 - Statics.field470.field1117 / 32;
                                                    method2862(var13, var14, var67, var68, Statics.field2485[0], var35);
                                                }
                                                if (!Statics.field470.field808) {
                                                    class306.method5002(var35.field2687 / 2 + var13 - 1, var35.field2685 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class205 var44 = field937[Statics.field780][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - Statics.field470.field1152 / 32;
                                                    int var46 = var43 * 4 + 2 - Statics.field470.field1117 / 32;
                                                    method2862(var13, var14, var45, var46, Statics.field2874[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    field1014[var11] = true;
                                }
                                class306.method5029(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2746 == 1339) {
                                class222 var69 = var10.method3969(false);
                                if (var69 != null) {
                                    if (field1051 < 3) {
                                        Statics.field3845.method5134(var13, var14, var69.field2687, var69.field2685, 25, 25, field853, 256, var69.field2686, var69.field2684);
                                    } else {
                                        class306.method5074(var13, var14, 0, var69.field2686, var69.field2684);
                                    }
                                }
                                class306.method5029(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2746 == 1400) {
                                Statics.field711.method5265(var13, var14, var10.field2754, var10.field2764, field832);
                            }
                            if (var10.field2746 == 1401) {
                                Statics.field711.method5266(var13, var14, var10.field2754, var10.field2764);
                            }
                        }
                        if (var10.field2741 == 0) {
                            if (!var10.field2738 && method212(var10) && Statics.field3288 != var10) {
                                continue;
                            }
                            if (!var10.field2738) {
                                if (var10.field2778 > var10.field2763 - var10.field2764) {
                                    var10.field2778 = var10.field2763 - var10.field2764;
                                }
                                if (var10.field2778 < 0) {
                                    var10.field2778 = 0;
                                }
                            }
                            method494(arg0, var10.field2739, var20, var21, var22, var23, var13 - var10.field2760, var14 - var10.field2778, var11);
                            if (var10.field2794 != null) {
                                method494(var10.field2794, var10.field2739, var20, var21, var22, var23, var13 - var10.field2760, var14 - var10.field2778, var11);
                            }
                            class67 var70 = (class67) field969.method3517((long) var10.field2739);
                            if (var70 != null) {
                                method4239(var70.field744, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class306.method5029(arg2, arg3, arg4, arg5);
                            class134.method2547();
                        }
                        if (field879 || field834[var11] || field1020 > 1) {
                            if (var10.field2741 == 0 && !var10.field2738 && var10.field2763 > var10.field2764) {
                                method3413(var10.field2754 + var13, var14, var10.field2778, var10.field2764, var10.field2763);
                            }
                            if (var10.field2741 != 1) {
                                if (var10.field2741 == 2) {
                                    int var71 = 0;
                                    for (int var72 = 0; var72 < var10.field2751; var72++) {
                                        for (int var73 = 0; var73 < var10.field2750; var73++) {
                                            int var74 = (var10.field2805 + 32) * var73 + var13;
                                            int var75 = (var10.field2733 + 32) * var72 + var14;
                                            if (var71 < 20) {
                                                var74 += var10.field2807[var71];
                                                var75 += var10.field2808[var71];
                                            }
                                            if (var10.field2728[var71] > 0) {
                                                boolean var76 = false;
                                                boolean var77 = false;
                                                int var78 = var10.field2728[var71] - 1;
                                                if (var74 + 32 > arg2 && var74 < arg4 && var75 + 32 > arg3 && var75 < arg5 || Statics.field480 == var10 && field1003 == var71) {
                                                    class310 var79;
                                                    if (field960 == 1 && Statics.field3731 == var71 && Statics.field477 == var10.field2739) {
                                                        var79 = class268.method215(var78, var10.field2858[var71], 2, 0, 2, false);
                                                    } else {
                                                        var79 = class268.method215(var78, var10.field2858[var71], 1, 3153952, 2, false);
                                                    }
                                                    if (var79 == null) {
                                                        method924(var10);
                                                    } else if (Statics.field480 == var10 && field1003 == var71) {
                                                        int var80 = class60.field662 - field915;
                                                        int var81 = class60.field672 - field1045;
                                                        if (var80 < 5 && var80 > -5) {
                                                            var80 = 0;
                                                        }
                                                        if (var81 < 5 && var81 > -5) {
                                                            var81 = 0;
                                                        }
                                                        if (field925 < 5) {
                                                            var80 = 0;
                                                            var81 = 0;
                                                        }
                                                        var79.method5129(var74 + var80, var75 + var81, 128);
                                                        if (arg1 != -1) {
                                                            class228 var82 = arg0[arg1 & 0xFFFF];
                                                            if (var75 + var81 < class306.field3857 && var82.field2778 > 0) {
                                                                int var83 = field883 * (class306.field3857 - var75 - var81) / 3;
                                                                if (var83 > field883 * 10) {
                                                                    var83 = field883 * 10;
                                                                }
                                                                if (var83 > var82.field2778) {
                                                                    var83 = var82.field2778;
                                                                }
                                                                var82.field2778 -= var83;
                                                                field1045 += var83;
                                                                method924(var82);
                                                            }
                                                            if (var75 + var81 + 32 > class306.field3855 && var82.field2778 < var82.field2763 - var82.field2764) {
                                                                int var84 = field883 * (var75 + var81 + 32 - class306.field3855) / 3;
                                                                if (var84 > field883 * 10) {
                                                                    var84 = field883 * 10;
                                                                }
                                                                if (var84 > var82.field2763 - var82.field2764 - var82.field2778) {
                                                                    var84 = var82.field2763 - var82.field2764 - var82.field2778;
                                                                }
                                                                var82.field2778 += var84;
                                                                field1045 -= var84;
                                                                method924(var82);
                                                            }
                                                        }
                                                    } else if (Statics.field350 == var10 && field933 == var71) {
                                                        var79.method5129(var74, var75, 128);
                                                    } else {
                                                        var79.method5123(var74, var75);
                                                    }
                                                }
                                            } else if (var10.field2809 != null && var71 < 20) {
                                                class310 var85 = var10.method3936(var71);
                                                if (var85 != null) {
                                                    var85.method5123(var74, var75);
                                                } else if (class228.field2737) {
                                                    method924(var10);
                                                }
                                            }
                                            var71++;
                                        }
                                    }
                                } else if (var10.field2741 == 3) {
                                    int var86;
                                    if (method153(var10)) {
                                        var86 = var10.field2765;
                                        if (Statics.field3288 == var10 && var10.field2767 != 0) {
                                            var86 = var10.field2767;
                                        }
                                    } else {
                                        var86 = var10.field2830;
                                        if (Statics.field3288 == var10 && var10.field2766 != 0) {
                                            var86 = var10.field2766;
                                        }
                                    }
                                    if (var10.field2859) {
                                        switch(var10.field2759.field3868) {
                                            case 1:
                                                class306.method5003(var13, var14, var10.field2754, var10.field2764, var10.field2830, var10.field2765, 256 - (var10.field2770 & 0xFF), 256 - (var10.field2771 & 0xFF));
                                                break;
                                            case 2:
                                                class306.method5073(var13, var14, var10.field2754, var10.field2764, var10.field2830, var10.field2765, 256 - (var10.field2770 & 0xFF), 256 - (var10.field2771 & 0xFF));
                                                break;
                                            case 3:
                                                class306.method5055(var13, var14, var10.field2754, var10.field2764, var10.field2830, var10.field2765, 256 - (var10.field2770 & 0xFF), 256 - (var10.field2771 & 0xFF));
                                                break;
                                            case 4:
                                                class306.method5006(var13, var14, var10.field2754, var10.field2764, var10.field2830, var10.field2765, 256 - (var10.field2770 & 0xFF), 256 - (var10.field2771 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class306.method5002(var13, var14, var10.field2754, var10.field2764, var86);
                                                } else {
                                                    class306.method5001(var13, var14, var10.field2754, var10.field2764, var86, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class306.method5009(var13, var14, var10.field2754, var10.field2764, var86);
                                    } else {
                                        class306.method5010(var13, var14, var10.field2754, var10.field2764, var86, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2741 == 4) {
                                    class287 var87 = var10.method3935();
                                    if (var87 != null) {
                                        String var88 = var10.field2823;
                                        int var89;
                                        if (method153(var10)) {
                                            var89 = var10.field2765;
                                            if (Statics.field3288 == var10 && var10.field2767 != 0) {
                                                var89 = var10.field2767;
                                            }
                                            if (var10.field2800.length() > 0) {
                                                var88 = var10.field2800;
                                            }
                                        } else {
                                            var89 = var10.field2830;
                                            if (Statics.field3288 == var10 && var10.field2766 != 0) {
                                                var89 = var10.field2766;
                                            }
                                        }
                                        if (var10.field2738 && var10.field2848 != -1) {
                                            class268 var90 = class268.method1489(var10.field2848);
                                            var88 = var90.field3557;
                                            if (var88 == null) {
                                                var88 = "null";
                                            }
                                            if ((var90.field3568 == 1 || var10.field2860 != 1) && var10.field2860 != -1) {
                                                String var91 = class86.method3(16748608) + var88 + class86.field1276 + " " + 'x';
                                                int var92 = var10.field2860;
                                                String var93 = Integer.toString(var92);
                                                for (int var94 = var93.length() - 3; var94 > 0; var94 -= 3) {
                                                    var93 = var93.substring(0, var94) + class86.field1270 + var93.substring(var94);
                                                }
                                                StringBuilder var10000;
                                                class237 var10001;
                                                String var95;
                                                if (var93.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class86.method3(65408)).append(var93.substring(0, var93.length() - 8));
                                                    var10001 = (class237) null;
                                                    var95 = var10000.append(class237.field3106).append(" ").append(class86.field1277).append(var93).append(class86.field1273).append(class86.field1276).toString();
                                                } else if (var93.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class86.method3(16777215)).append(var93.substring(0, var93.length() - 4));
                                                    var10001 = (class237) null;
                                                    var95 = var10000.append(class237.field3145).append(" ").append(class86.field1277).append(var93).append(class86.field1273).append(class86.field1276).toString();
                                                } else {
                                                    var95 = " " + class86.method3(16776960) + var93 + class86.field1276;
                                                }
                                                var88 = var91 + var95;
                                            }
                                        }
                                        if (field972 == var10) {
                                            class237 var171 = (class237) null;
                                            var88 = class237.field3092;
                                            var89 = var10.field2830;
                                        }
                                        if (!var10.field2738) {
                                            var88 = method3104(var88, var10);
                                        }
                                        var87.method4822(var88, var13, var14, var10.field2754, var10.field2764, var89, var10.field2804 ? 0 : -1, var10.field2802, var10.field2789, var10.field2801);
                                    } else if (class228.field2737) {
                                        method924(var10);
                                    }
                                } else if (var10.field2741 == 5) {
                                    if (var10.field2738) {
                                        class310 var97;
                                        if (var10.field2848 == -1) {
                                            var97 = var10.method3934(false);
                                        } else {
                                            var97 = class268.method215(var10.field2848, var10.field2860, var10.field2731, var10.field2779, var10.field2740, false);
                                        }
                                        if (var97 != null) {
                                            int var98 = var97.field3884;
                                            int var99 = var97.field3880;
                                            if (var10.field2777) {
                                                class306.method4995(var13, var14, var10.field2754 + var13, var10.field2764 + var14);
                                                int var100 = (var10.field2754 + (var98 - 1)) / var98;
                                                int var101 = (var10.field2764 + (var99 - 1)) / var99;
                                                for (int var102 = 0; var102 < var100; var102++) {
                                                    for (int var103 = 0; var103 < var101; var103++) {
                                                        if (var10.field2776 != 0) {
                                                            var97.method5164(var98 / 2 + var98 * var102 + var13, var99 / 2 + var99 * var103 + var14, var10.field2776, 4096);
                                                        } else if (var15 == 0) {
                                                            var97.method5123(var98 * var102 + var13, var99 * var103 + var14);
                                                        } else {
                                                            var97.method5129(var98 * var102 + var13, var99 * var103 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class306.method5029(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var104 = var10.field2754 * 4096 / var98;
                                                if (var10.field2776 != 0) {
                                                    var97.method5164(var10.field2754 / 2 + var13, var10.field2764 / 2 + var14, var10.field2776, var104);
                                                } else if (var15 != 0) {
                                                    var97.method5131(var13, var14, var10.field2754, var10.field2764, 256 - (var15 & 0xFF));
                                                } else if (var10.field2754 == var98 && var10.field2764 == var99) {
                                                    var97.method5123(var13, var14);
                                                } else {
                                                    var97.method5125(var13, var14, var10.field2754, var10.field2764);
                                                }
                                            }
                                        } else if (class228.field2737) {
                                            method924(var10);
                                        }
                                    } else {
                                        class310 var96 = var10.method3934(method153(var10));
                                        if (var96 != null) {
                                            var96.method5123(var13, var14);
                                        } else if (class228.field2737) {
                                            method924(var10);
                                        }
                                    }
                                } else if (var10.field2741 == 6) {
                                    boolean var105 = method153(var10);
                                    int var106;
                                    if (var105) {
                                        var106 = var10.field2787;
                                    } else {
                                        var106 = var10.field2786;
                                    }
                                    class131 var107 = null;
                                    int var108 = 0;
                                    if (var10.field2848 != -1) {
                                        class268 var109 = class268.method1489(var10.field2848);
                                        if (var109 != null) {
                                            class268 var110 = var109.method4484(var10.field2860);
                                            var107 = var110.method4483(1);
                                            if (var107 == null) {
                                                method924(var10);
                                            } else {
                                                var107.method2484();
                                                var108 = var107.field1998 / 2;
                                            }
                                        }
                                    } else if (var10.field2755 == 5) {
                                        if (var10.field2834 == 0) {
                                            var107 = field1082.method3895((class272) null, -1, (class272) null, -1);
                                        } else {
                                            var107 = Statics.field470.method1045();
                                        }
                                    } else if (var106 == -1) {
                                        var107 = var10.method3956((class272) null, -1, var105, Statics.field470.field788);
                                        if (var107 == null && class228.field2737) {
                                            method924(var10);
                                        }
                                    } else {
                                        class272 var111 = class272.method2308(var106);
                                        var107 = var10.method3956(var111, var10.field2861, var105, Statics.field470.field788);
                                        if (var107 == null && class228.field2737) {
                                            method924(var10);
                                        }
                                    }
                                    class134.method2550(var10.field2754 / 2 + var13, var10.field2764 / 2 + var14);
                                    int var112 = var10.field2793 * class134.field1889[var10.field2727] >> 16;
                                    int var113 = var10.field2793 * class134.field1911[var10.field2727] >> 16;
                                    if (var107 != null) {
                                        if (var10.field2738) {
                                            var107.method2484();
                                            if (var10.field2796) {
                                                var107.method2478(0, var10.field2791, var10.field2792, var10.field2727, var10.field2788, var10.field2783 + var108 + var112, var10.field2783 + var113, var10.field2793);
                                            } else {
                                                var107.method2477(0, var10.field2791, var10.field2792, var10.field2727, var10.field2788, var10.field2783 + var108 + var112, var10.field2783 + var113);
                                            }
                                        } else {
                                            var107.method2477(0, var10.field2791, 0, var10.field2727, 0, var112, var113);
                                        }
                                    }
                                    class134.method2549();
                                } else {
                                    if (var10.field2741 == 7) {
                                        class287 var114 = var10.method3935();
                                        if (var114 == null) {
                                            if (class228.field2737) {
                                                method924(var10);
                                            }
                                            continue;
                                        }
                                        int var115 = 0;
                                        for (int var116 = 0; var116 < var10.field2751; var116++) {
                                            for (int var117 = 0; var117 < var10.field2750; var117++) {
                                                if (var10.field2728[var115] > 0) {
                                                    class268 var118 = class268.method1489(var10.field2728[var115] - 1);
                                                    String var119;
                                                    if (var118.field3568 != 1 && var10.field2858[var115] == 1) {
                                                        var119 = class86.method3(16748608) + var118.field3557 + class86.field1276;
                                                    } else {
                                                        String var120 = class86.method3(16748608) + var118.field3557 + class86.field1276 + " " + 'x';
                                                        int var121 = var10.field2858[var115];
                                                        String var122 = Integer.toString(var121);
                                                        for (int var123 = var122.length() - 3; var123 > 0; var123 -= 3) {
                                                            var122 = var122.substring(0, var123) + class86.field1270 + var122.substring(var123);
                                                        }
                                                        String var124;
                                                        if (var122.length() > 9) {
                                                            var124 = " " + class86.method3(65408) + var122.substring(0, var122.length() - 8) + class237.field3106 + " " + class86.field1277 + var122 + class86.field1273 + class86.field1276;
                                                        } else if (var122.length() > 6) {
                                                            var124 = " " + class86.method3(16777215) + var122.substring(0, var122.length() - 4) + class237.field3145 + " " + class86.field1277 + var122 + class86.field1273 + class86.field1276;
                                                        } else {
                                                            var124 = " " + class86.method3(16776960) + var122 + class86.field1276;
                                                        }
                                                        var119 = var120 + var124;
                                                    }
                                                    int var125 = (var10.field2805 + 115) * var117 + var13;
                                                    int var126 = (var10.field2733 + 12) * var116 + var14;
                                                    if (var10.field2802 == 0) {
                                                        var114.method4830(var119, var125, var126, var10.field2830, var10.field2804 ? 0 : -1);
                                                    } else if (var10.field2802 == 1) {
                                                        var114.method4821(var119, var10.field2754 / 2 + var125, var126, var10.field2830, var10.field2804 ? 0 : -1);
                                                    } else {
                                                        var114.method4870(var119, var10.field2754 + var125 - 1, var126, var10.field2830, var10.field2804 ? 0 : -1);
                                                    }
                                                }
                                                var115++;
                                            }
                                        }
                                    }
                                    if (var10.field2741 == 8 && Statics.field26 == var10 && field1012 == field1004) {
                                        int var127 = 0;
                                        int var128 = 0;
                                        class287 var129 = Statics.field234;
                                        String var130 = var10.field2823;
                                        String var131 = method3104(var130, var10);
                                        while (var131.length() > 0) {
                                            int var132 = var131.indexOf(class86.field1275);
                                            String var133;
                                            if (var132 == -1) {
                                                var133 = var131;
                                                var131 = "";
                                            } else {
                                                var133 = var131.substring(0, var132);
                                                var131 = var131.substring(var132 + 4);
                                            }
                                            int var134 = var129.method4848(var133);
                                            if (var134 > var127) {
                                                var127 = var134;
                                            }
                                            var128 += var129.field3746 + 1;
                                        }
                                        var127 += 6;
                                        var128 += 7;
                                        int var135 = var10.field2754 + var13 - 5 - var127;
                                        int var136 = var10.field2764 + var14 + 5;
                                        if (var135 < var13 + 5) {
                                            var135 = var13 + 5;
                                        }
                                        if (var127 + var135 > arg4) {
                                            var135 = arg4 - var127;
                                        }
                                        if (var128 + var136 > arg5) {
                                            var136 = arg5 - var128;
                                        }
                                        class306.method5002(var135, var136, var127, var128, 16777120);
                                        class306.method5009(var135, var136, var127, var128, 0);
                                        String var137 = var10.field2823;
                                        int var138 = var129.field3746 + var136 + 2;
                                        String var139 = method3104(var137, var10);
                                        while (var139.length() > 0) {
                                            int var140 = var139.indexOf(class86.field1275);
                                            String var141;
                                            if (var140 == -1) {
                                                var141 = var139;
                                                var139 = "";
                                            } else {
                                                var141 = var139.substring(0, var140);
                                                var139 = var139.substring(var140 + 4);
                                            }
                                            var129.method4830(var141, var135 + 3, var138, 0, -1);
                                            var138 += var129.field3746 + 1;
                                        }
                                    }
                                    if (var10.field2741 == 9) {
                                        int var142;
                                        int var143;
                                        int var144;
                                        int var145;
                                        if (var10.field2773) {
                                            var142 = var13;
                                            var143 = var10.field2764 + var14;
                                            var144 = var10.field2754 + var13;
                                            var145 = var14;
                                        } else {
                                            var142 = var13;
                                            var143 = var14;
                                            var144 = var10.field2754 + var13;
                                            var145 = var10.field2764 + var14;
                                        }
                                        if (var10.field2866 == 1) {
                                            class306.method5014(var142, var143, var144, var145, var10.field2830);
                                        } else {
                                            int var148 = var10.field2830;
                                            int var149 = var10.field2866;
                                            int var150 = var144 - var142;
                                            int var151 = var145 - var143;
                                            int var152 = var150 >= 0 ? var150 : -var150;
                                            int var153 = var151 >= 0 ? var151 : -var151;
                                            int var154 = var152;
                                            if (var152 < var153) {
                                                var154 = var153;
                                            }
                                            if (var154 != 0) {
                                                int var155 = (var150 << 16) / var154;
                                                int var156 = (var151 << 16) / var154;
                                                if (var156 <= var155) {
                                                    var155 = -var155;
                                                } else {
                                                    var156 = -var156;
                                                }
                                                int var157 = var149 * var156 >> 17;
                                                int var158 = var149 * var156 + 1 >> 17;
                                                int var159 = var149 * var155 >> 17;
                                                int var160 = var149 * var155 + 1 >> 17;
                                                int var161 = var142 - class306.field3856;
                                                int var162 = var143 - class306.field3857;
                                                int var163 = var157 + var161;
                                                int var164 = var161 - var158;
                                                int var165 = var150 + var161 - var158;
                                                int var166 = var150 + var161 + var157;
                                                int var167 = var159 + var162;
                                                int var168 = var162 - var160;
                                                int var169 = var151 + var162 - var160;
                                                int var170 = var151 + var162 + var159;
                                                class134.method2555(var163, var164, var165);
                                                class134.method2558(var167, var168, var169, var163, var164, var165, var148);
                                                class134.method2555(var163, var165, var166);
                                                class134.method2558(var167, var169, var170, var163, var165, var166, var148);
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

    @ObfuscatedName("gv.ib(Ljava/lang/String;Lho;I)Ljava/lang/String;")
    public static String method3104(String arg0, class228 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method26(method3768(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("client.ie(ZI)V")
    public final void method1109(boolean arg0) {
        method1541(field968, Statics.field408, Statics.field3453, arg0);
    }

    @ObfuscatedName("client.in(Lho;B)V")
    public void method1110(class228 arg0) {
        class228 var2 = arg0.field2758 == -1 ? null : class228.method471(arg0.field2758);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field408;
            var4 = Statics.field3453;
        } else {
            var3 = var2.field2754;
            var4 = var2.field2764;
        }
        method28(arg0, var3, var4, false);
        method2826(arg0, var3, var4);
    }

    @ObfuscatedName("ah.ix([Lho;Lho;ZI)V")
    public static void method331(class228[] arg0, class228 arg1, boolean arg2) {
        int var3 = arg1.field2862 == 0 ? arg1.field2754 : arg1.field2862;
        int var4 = arg1.field2763 == 0 ? arg1.field2764 : arg1.field2763;
        method977(arg0, arg1.field2739, var3, var4, arg2);
        if (arg1.field2794 != null) {
            method977(arg1.field2794, arg1.field2739, var3, var4, arg2);
        }
        class67 var5 = (class67) field969.method3517((long) arg1.field2739);
        if (var5 != null) {
            method1541(var5.field744, var3, var4, arg2);
        }
        if (arg1.field2746 == 1337) {
        }
    }

    @ObfuscatedName("bh.ij(IIIZI)V")
    public static final void method1541(int arg0, int arg1, int arg2, boolean arg3) {
        if (class228.method3651(arg0)) {
            method977(Statics.field3286[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bs.jw([Lho;IIIZI)V")
    public static void method977(class228[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class228 var6 = arg0[var5];
            if (var6 != null && var6.field2758 == arg1) {
                method28(var6, arg2, arg3, arg4);
                method2826(var6, arg2, arg3);
                if (var6.field2760 > var6.field2862 - var6.field2754) {
                    var6.field2760 = var6.field2862 - var6.field2754;
                }
                if (var6.field2760 < 0) {
                    var6.field2760 = 0;
                }
                if (var6.field2778 > var6.field2763 - var6.field2764) {
                    var6.field2778 = var6.field2763 - var6.field2764;
                }
                if (var6.field2778 < 0) {
                    var6.field2778 = 0;
                }
                if (var6.field2741 == 0) {
                    method331(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("t.jf(Lho;IIZB)V")
    public static void method28(class228 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2754;
        int var5 = arg0.field2764;
        if (arg0.field2816 == 0) {
            arg0.field2754 = arg0.field2750;
        } else if (arg0.field2816 == 1) {
            arg0.field2754 = arg1 - arg0.field2750;
        } else if (arg0.field2816 == 2) {
            arg0.field2754 = arg0.field2750 * arg1 >> 14;
        }
        if (arg0.field2747 == 0) {
            arg0.field2764 = arg0.field2751;
        } else if (arg0.field2747 == 1) {
            arg0.field2764 = arg2 - arg0.field2751;
        } else if (arg0.field2747 == 2) {
            arg0.field2764 = arg0.field2751 * arg2 >> 14;
        }
        if (arg0.field2816 == 4) {
            arg0.field2754 = arg0.field2764 * arg0.field2756 / arg0.field2757;
        }
        if (arg0.field2747 == 4) {
            arg0.field2764 = arg0.field2757 * arg0.field2754 / arg0.field2756;
        }
        if (field978 && arg0.field2741 == 0) {
            if (arg0.field2764 < 5 && arg0.field2754 < 5) {
                arg0.field2764 = 5;
                arg0.field2754 = 5;
            } else {
                if (arg0.field2764 <= 0) {
                    arg0.field2764 = 5;
                }
                if (arg0.field2754 <= 0) {
                    arg0.field2754 = 5;
                }
            }
        }
        if (arg0.field2746 == 1337) {
            field980 = arg0;
        }
        if (arg3 && arg0.field2745 != null && (arg0.field2754 != var4 || arg0.field2764 != var5)) {
            class68 var6 = new class68();
            var6.field750 = arg0;
            var6.field748 = arg0.field2745;
            field1007.method3572(var6);
        }
    }

    @ObfuscatedName("el.jx(Lho;III)V")
    public static void method2826(class228 arg0, int arg1, int arg2) {
        if (arg0.field2857 == 0) {
            arg0.field2847 = arg0.field2748;
        } else if (arg0.field2857 == 1) {
            arg0.field2847 = (arg1 - arg0.field2754) / 2 + arg0.field2748;
        } else if (arg0.field2857 == 2) {
            arg0.field2847 = arg1 - arg0.field2754 - arg0.field2748;
        } else if (arg0.field2857 == 3) {
            arg0.field2847 = arg0.field2748 * arg1 >> 14;
        } else if (arg0.field2857 == 4) {
            arg0.field2847 = (arg0.field2748 * arg1 >> 14) + (arg1 - arg0.field2754) / 2;
        } else {
            arg0.field2847 = arg1 - arg0.field2754 - (arg0.field2748 * arg1 >> 14);
        }
        if (arg0.field2743 == 0) {
            arg0.field2753 = arg0.field2749;
        } else if (arg0.field2743 == 1) {
            arg0.field2753 = (arg2 - arg0.field2764) / 2 + arg0.field2749;
        } else if (arg0.field2743 == 2) {
            arg0.field2753 = arg2 - arg0.field2764 - arg0.field2749;
        } else if (arg0.field2743 == 3) {
            arg0.field2753 = arg0.field2749 * arg2 >> 14;
        } else if (arg0.field2743 == 4) {
            arg0.field2753 = (arg0.field2749 * arg2 >> 14) + (arg2 - arg0.field2764) / 2;
        } else {
            arg0.field2753 = arg2 - arg0.field2764 - (arg0.field2749 * arg2 >> 14);
        }
        if (!field978 || arg0.field2741 != 0) {
            return;
        }
        if (arg0.field2847 < 0) {
            arg0.field2847 = 0;
        } else if (arg0.field2847 + arg0.field2754 > arg1) {
            arg0.field2847 = arg1 - arg0.field2754;
        }
        if (arg0.field2753 < 0) {
            arg0.field2753 = 0;
        } else if (arg0.field2764 + arg0.field2753 > arg2) {
            arg0.field2753 = arg2 - arg0.field2764;
        }
    }

    @ObfuscatedName("t.jd(Lho;IIIIIIB)V")
    public static final void method30(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field959) {
            field889 = 32;
        } else {
            field889 = 0;
        }
        field959 = false;
        if (class60.field667 == 1 || !Statics.field848 && class60.field667 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2778 -= 4;
                method924(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2778 += 4;
                method924(arg0);
            } else if (arg5 >= arg1 - field889 && arg5 < field889 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2778 = (arg4 - arg3) * var8 / var9;
                method924(arg0);
                field959 = true;
            }
        }
        if (field1006 == 0) {
            return;
        }
        int var10 = arg0.field2754;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2778 += field1006 * 45;
            method924(arg0);
        }
    }

    @ObfuscatedName("ga.jz(IIIIII)V")
    public static final void method3413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1217[0].method5091(arg0, arg1);
        Statics.field1217[1].method5091(arg0, arg1 + arg3 - 16);
        class306.method5002(arg0, arg1 + 16, 16, arg3 - 32, field886);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class306.method5002(arg0, arg1 + 16 + var6, 16, var5, field885);
        class306.method5065(arg0, arg1 + 16 + var6, var5, field887);
        class306.method5065(arg0 + 1, arg1 + 16 + var6, var5, field887);
        class306.method5011(arg0, arg1 + 16 + var6, 16, field887);
        class306.method5011(arg0, arg1 + 17 + var6, 16, field887);
        class306.method5065(arg0 + 15, arg1 + 16 + var6, var5, field926);
        class306.method5065(arg0 + 14, arg1 + 17 + var6, var5 - 1, field926);
        class306.method5011(arg0, arg1 + 15 + var6 + var5, 16, field926);
        class306.method5011(arg0 + 1, arg1 + 14 + var6 + var5, 15, field926);
    }

    @ObfuscatedName("a.jg(II)Ljava/lang/String;")
    public static final String method26(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("k.jv(Lho;B)Z")
    public static final boolean method153(class228 arg0) {
        if (arg0.field2852 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2852.length; var1++) {
            int var2 = method3768(arg0, var1);
            int var3 = arg0.field2853[var1];
            if (arg0.field2852[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2852[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2852[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hq.jj(Lho;II)I")
    public static final int method3768(class228 arg0, int arg1) {
        if (arg0.field2851 == null || arg1 >= arg0.field2851.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2851[arg1];
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
                    var7 = field941[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field942[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field943[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class228 var11 = class228.method471(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class268.method1489(var12).field3574 || field902)) {
                        for (int var13 = 0; var13 < var11.field2728.length; var13++) {
                            if (var12 + 1 == var11.field2728[var13]) {
                                var7 += var11.field2858[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class223.field2691[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class234.field2921[field942[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class223.field2691[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field470.field793;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class234.field2920[var14]) {
                            var7 += field942[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class228 var17 = class228.method471(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class268.method1489(var18).field3574 || field902)) {
                        for (int var19 = 0; var19 < var17.field2728.length; var19++) {
                            if (var18 + 1 == var17.field2728[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field973;
                }
                if (var6 == 12) {
                    var7 = field974;
                }
                if (var6 == 13) {
                    int var20 = class223.field2691[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class223.method3012(var22);
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
                    var7 = (Statics.field470.field1152 >> 7) + Statics.field407;
                }
                if (var6 == 19) {
                    var7 = (Statics.field470.field1117 >> 7) + Statics.field1272;
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

    @ObfuscatedName("co.jl(Lho;Ljj;IIZB)V")
    public static final void method1773(class228 arg0, class268 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3572;
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
            var7 = class237.field2936;
        }
        if (var6 != -1 && var7 != null) {
            method4934(var7, class86.method3(16748608) + arg1.field3557, var6, arg1.field3555, arg2, arg0.field2739, arg4);
        }
    }

    @ObfuscatedName("ij.jp(IIIIIIIB)V")
    public static final void method4324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class228.method3651(arg0)) {
            method1483(Statics.field3286[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("bj.jn([Lho;IIIIIIII)V")
    public static final void method1483(class228[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class228 var9 = arg0[var8];
            if (var9 != null && (!var9.field2738 || var9.field2741 == 0 || var9.field2814 || method920(var9) != 0 || field982 == var9 || var9.field2746 == 1338) && var9.field2758 == arg1 && (!var9.field2738 || !method212(var9))) {
                int var10 = var9.field2847 + arg6;
                int var11 = var9.field2753 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2741 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2741 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2754 + var10;
                    int var19 = var9.field2764 + var11;
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
                    int var22 = var9.field2754 + var10;
                    int var23 = var9.field2764 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field981 == var9) {
                    field989 = true;
                    field990 = var10;
                    field991 = var11;
                }
                if (!var9.field2738 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field662;
                    int var25 = class60.field672;
                    if (class60.field677 != 0) {
                        var24 = class60.field678;
                        var25 = class60.field671;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2746 == 1337) {
                        if (!field831 && !field839 && var26) {
                            if (field960 == 0 && !field963) {
                                method12(class237.field3089, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class132.field1878; var29++) {
                                int var30 = class132.field1875[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field569.method2750(Statics.field780, var31, var32, var30) >= 0) {
                                        class267 var35 = class267.method2363(var34);
                                        if (var35.field3529 != null) {
                                            var35 = var35.method4438();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field960 == 1) {
                                            method12(class237.field3064, field962 + " " + class86.field1274 + " " + class86.method3(65535) + var35.field3506, 1, var30, var31, var32);
                                        } else if (!field963) {
                                            String[] var36 = var35.field3501;
                                            if (field979) {
                                                var36 = method121(var36);
                                            }
                                            if (var36 != null) {
                                                for (int var37 = 4; var37 >= 0; var37--) {
                                                    if (var36[var37] != null) {
                                                        short var38 = 0;
                                                        if (var37 == 0) {
                                                            var38 = 3;
                                                        }
                                                        if (var37 == 1) {
                                                            var38 = 4;
                                                        }
                                                        if (var37 == 2) {
                                                            var38 = 5;
                                                        }
                                                        if (var37 == 3) {
                                                            var38 = 6;
                                                        }
                                                        if (var37 == 4) {
                                                            var38 = 1001;
                                                        }
                                                        method12(var36[var37], class86.method3(65535) + var35.field3506, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            method12(class237.field3085, class86.method3(65535) + var35.field3506, 1002, var35.field3503 << 14, var31, var32);
                                        } else if ((Statics.field604 & 0x4) == 4) {
                                            method12(field1002, field967 + " " + class86.field1274 + " " + class86.method3(65535) + var35.field3506, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class84 var39 = field837[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1259.field3612 == 1 && (var39.field1152 & 0x7F) == 64 && (var39.field1117 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field864; var40++) {
                                                class84 var41 = field837[field865[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1259.field3612 == 1 && var39.field1152 == var41.field1152 && var39.field1117 == var41.field1117) {
                                                    method3053(var41.field1259, field865[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class93.field1379;
                                            int[] var43 = class93.field1380;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class72 var45 = field927[var43[var44]];
                                                if (var45 != null && var39.field1152 == var45.field1152 && var39.field1117 == var45.field1117) {
                                                    method246(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method3053(var39.field1259, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class72 var46 = field927[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1152 & 0x7F) == 64 && (var46.field1117 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field864; var47++) {
                                                class84 var48 = field837[field865[var47]];
                                                if (var48 != null && var48.field1259.field3612 == 1 && var46.field1152 == var48.field1152 && var46.field1117 == var48.field1117) {
                                                    method3053(var48.field1259, field865[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class93.field1379;
                                            int[] var50 = class93.field1380;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class72 var52 = field927[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1152 == var52.field1152 && var46.field1117 == var52.field1117) {
                                                    method246(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field936 == var34) {
                                            var27 = var30;
                                        } else {
                                            method246(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class205 var53 = field937[Statics.field780][var31][var32];
                                        if (var53 != null) {
                                            for (class92 var54 = (class92) var53.method3573(); var54 != null; var54 = (class92) var53.method3574()) {
                                                class268 var55 = class268.method1489(var54.field1373);
                                                if (field960 == 1) {
                                                    method12(class237.field3064, field962 + " " + class86.field1274 + " " + class86.method3(16748608) + var55.field3557, 16, var54.field1373, var31, var32);
                                                } else if (!field963) {
                                                    String[] var56 = var55.field3591;
                                                    if (field979) {
                                                        var56 = method121(var56);
                                                    }
                                                    for (int var57 = 4; var57 >= 0; var57--) {
                                                        if (var56 != null && var56[var57] != null) {
                                                            byte var58 = 0;
                                                            if (var57 == 0) {
                                                                var58 = 18;
                                                            }
                                                            if (var57 == 1) {
                                                                var58 = 19;
                                                            }
                                                            if (var57 == 2) {
                                                                var58 = 20;
                                                            }
                                                            if (var57 == 3) {
                                                                var58 = 21;
                                                            }
                                                            if (var57 == 4) {
                                                                var58 = 22;
                                                            }
                                                            method12(var56[var57], class86.method3(16748608) + var55.field3557, var58, var54.field1373, var31, var32);
                                                        } else if (var57 == 2) {
                                                            method12(class237.field3042, class86.method3(16748608) + var55.field3557, 20, var54.field1373, var31, var32);
                                                        }
                                                    }
                                                    method12(class237.field3085, class86.method3(16748608) + var55.field3557, 1004, var54.field1373, var31, var32);
                                                } else if ((Statics.field604 & 0x1) == 1) {
                                                    method12(field1002, field967 + " " + class86.field1274 + " " + class86.method3(16748608) + var55.field3557, 17, var54.field1373, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class72 var61 = field927[field936];
                                method246(var61, field936, var59, var60);
                            }
                        }
                    } else if (var9.field2746 == 1338) {
                        method1862(var9, var10, var11);
                    } else {
                        if (var9.field2746 == 1400) {
                            Statics.field711.method5250(class60.field662, class60.field672, var26, var10, var11, var9.field2754, var9.field2764);
                        }
                        if (!field839 && var26) {
                            if (var9.field2746 == 1400) {
                                Statics.field711.method5278(var10, var11, var9.field2754, var9.field2764, var24, var25);
                            } else {
                                int var62 = var24 - var10;
                                int var63 = var25 - var11;
                                if (var9.field2742 == 1) {
                                    method12(var9.field2856, "", 24, 0, 0, var9.field2739);
                                }
                                if (var9.field2742 == 2 && !field963) {
                                    String var64 = method538(var9);
                                    if (var64 != null) {
                                        method12(var64, class86.method3(65280) + var9.field2855, 25, 0, -1, var9.field2739);
                                    }
                                }
                                if (var9.field2742 == 3) {
                                    method12(class237.field3093, "", 26, 0, 0, var9.field2739);
                                }
                                if (var9.field2742 == 4) {
                                    method12(var9.field2856, "", 28, 0, 0, var9.field2739);
                                }
                                if (var9.field2742 == 5) {
                                    method12(var9.field2856, "", 29, 0, 0, var9.field2739);
                                }
                                if (var9.field2742 == 6 && field972 == null) {
                                    method12(var9.field2856, "", 30, 0, -1, var9.field2739);
                                }
                                if (var9.field2741 == 2) {
                                    int var65 = 0;
                                    for (int var66 = 0; var66 < var9.field2764; var66++) {
                                        for (int var67 = 0; var67 < var9.field2754; var67++) {
                                            int var68 = (var9.field2805 + 32) * var67;
                                            int var69 = (var9.field2733 + 32) * var66;
                                            if (var65 < 20) {
                                                var68 += var9.field2807[var65];
                                                var69 += var9.field2808[var65];
                                            }
                                            if (var62 >= var68 && var63 >= var69 && var62 < var68 + 32 && var63 < var69 + 32) {
                                                field923 = var65;
                                                Statics.field3733 = var9;
                                                if (var9.field2728[var65] > 0) {
                                                    class268 var70 = class268.method1489(var9.field2728[var65] - 1);
                                                    if (field960 == 1 && class229.method1900(method920(var9))) {
                                                        if (Statics.field477 != var9.field2739 || Statics.field3731 != var65) {
                                                            method12(class237.field3064, field962 + " " + class86.field1274 + " " + class86.method3(16748608) + var70.field3557, 31, var70.field3555, var65, var9.field2739);
                                                        }
                                                    } else if (!field963 || !class229.method1900(method920(var9))) {
                                                        String[] var71 = var70.field3572;
                                                        if (field979) {
                                                            String[] var72 = method121(var71);
                                                        }
                                                        int var73 = -1;
                                                        if (field955 && class51.field586[81]) {
                                                            var73 = var70.method4491();
                                                        }
                                                        if (class229.method1900(method920(var9))) {
                                                            for (int var74 = 4; var74 >= 3; var74--) {
                                                                if (var73 != var74) {
                                                                    method1773(var9, var70, var65, var74, false);
                                                                }
                                                            }
                                                        }
                                                        if (class229.method3926(method920(var9))) {
                                                            method12(class237.field3064, class86.method3(16748608) + var70.field3557, 38, var70.field3555, var65, var9.field2739);
                                                        }
                                                        if (class229.method1900(method920(var9))) {
                                                            for (int var75 = 2; var75 >= 0; var75--) {
                                                                if (var73 != var75) {
                                                                    method1773(var9, var70, var65, var75, false);
                                                                }
                                                            }
                                                            if (var73 >= 0) {
                                                                method1773(var9, var70, var65, var73, true);
                                                            }
                                                        }
                                                        String[] var76 = var9.field2871;
                                                        if (field979) {
                                                            var76 = method121(var76);
                                                        }
                                                        if (var76 != null) {
                                                            for (int var77 = 4; var77 >= 0; var77--) {
                                                                if (var76[var77] != null) {
                                                                    byte var78 = 0;
                                                                    if (var77 == 0) {
                                                                        var78 = 39;
                                                                    }
                                                                    if (var77 == 1) {
                                                                        var78 = 40;
                                                                    }
                                                                    if (var77 == 2) {
                                                                        var78 = 41;
                                                                    }
                                                                    if (var77 == 3) {
                                                                        var78 = 42;
                                                                    }
                                                                    if (var77 == 4) {
                                                                        var78 = 43;
                                                                    }
                                                                    method12(var76[var77], class86.method3(16748608) + var70.field3557, var78, var70.field3555, var65, var9.field2739);
                                                                }
                                                            }
                                                        }
                                                        method12(class237.field3085, class86.method3(16748608) + var70.field3557, 1005, var70.field3555, var65, var9.field2739);
                                                    } else if ((Statics.field604 & 0x10) == 16) {
                                                        method12(field1002, field967 + " " + class86.field1274 + " " + class86.method3(16748608) + var70.field3557, 32, var70.field3555, var65, var9.field2739);
                                                    }
                                                }
                                            }
                                            var65++;
                                        }
                                    }
                                }
                                if (var9.field2738) {
                                    if (field963) {
                                        int var79 = method920(var9);
                                        boolean var80 = (var79 >> 21 & 0x1) != 0;
                                        if (var80 && (Statics.field604 & 0x20) == 32) {
                                            method12(field1002, field967 + " " + class86.field1274 + " " + var9.field2812, 58, 0, var9.field2841, var9.field2739);
                                        }
                                    } else {
                                        for (int var81 = 9; var81 >= 5; var81--) {
                                            String var82 = method556(var9, var81);
                                            if (var82 != null) {
                                                method12(var82, var9.field2812, 1007, var81 + 1, var9.field2841, var9.field2739);
                                            }
                                        }
                                        String var83 = method538(var9);
                                        if (var83 != null) {
                                            method12(var83, var9.field2812, 25, 0, var9.field2841, var9.field2739);
                                        }
                                        for (int var84 = 4; var84 >= 0; var84--) {
                                            String var85 = method556(var9, var84);
                                            if (var85 != null) {
                                                method12(var85, var9.field2812, 57, var84 + 1, var9.field2841, var9.field2739);
                                            }
                                        }
                                        if (class229.method483(method920(var9))) {
                                            method12(class237.field2942, "", 30, 0, var9.field2841, var9.field2739);
                                        }
                                    }
                                }
                            }
                        }
                        if (var9.field2741 == 0) {
                            if (!var9.field2738 && method212(var9) && Statics.field3288 != var9) {
                                continue;
                            }
                            method1483(arg0, var9.field2739, var12, var13, var14, var15, var10 - var9.field2760, var11 - var9.field2778);
                            if (var9.field2794 != null) {
                                method1483(var9.field2794, var9.field2739, var12, var13, var14, var15, var10 - var9.field2760, var11 - var9.field2778);
                            }
                            class67 var86 = (class67) field969.method3517((long) var9.field2739);
                            if (var86 != null) {
                                if (var86.field743 == 0 && class60.field662 >= var12 && class60.field672 >= var13 && class60.field662 < var14 && class60.field672 < var15 && !field839 && !field978) {
                                    for (class68 var87 = (class68) field1007.method3581(); var87 != null; var87 = (class68) field1007.method3597()) {
                                        if (var87.field752) {
                                            var87.method3561();
                                            var87.field750.field2864 = false;
                                        }
                                    }
                                    if (Statics.field3351 == 0) {
                                        field981 = null;
                                        field982 = null;
                                    }
                                    if (!field839) {
                                        method3983();
                                    }
                                }
                                method4324(var86.field744, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2738) {
                            if (var9.field2829) {
                                if (class60.field662 >= var12 && class60.field672 >= var13 && class60.field662 < var14 && class60.field672 < var15) {
                                    for (class68 var88 = (class68) field1007.method3581(); var88 != null; var88 = (class68) field1007.method3597()) {
                                        if (var88.field752) {
                                            var88.method3561();
                                            var88.field750.field2864 = false;
                                        }
                                    }
                                    if (Statics.field3351 == 0) {
                                        field981 = null;
                                        field982 = null;
                                    }
                                    if (!field839) {
                                        method3983();
                                    }
                                }
                            } else if (var9.field2867 && class60.field662 >= var12 && class60.field672 >= var13 && class60.field662 < var14 && class60.field672 < var15) {
                                for (class68 var89 = (class68) field1007.method3581(); var89 != null; var89 = (class68) field1007.method3597()) {
                                    if (var89.field752 && var89.field750.field2840 == var89.field748) {
                                        var89.method3561();
                                    }
                                }
                            }
                            boolean var90;
                            if (class60.field662 >= var12 && class60.field672 >= var13 && class60.field662 < var14 && class60.field672 < var15) {
                                var90 = true;
                            } else {
                                var90 = false;
                            }
                            boolean var91 = false;
                            if ((class60.field667 == 1 || !Statics.field848 && class60.field667 == 4) && var90) {
                                var91 = true;
                            }
                            boolean var92 = false;
                            if ((class60.field677 == 1 || !Statics.field848 && class60.field677 == 4) && class60.field678 >= var12 && class60.field671 >= var13 && class60.field678 < var14 && class60.field671 < var15) {
                                var92 = true;
                            }
                            if (var92) {
                                method1744(var9, class60.field678 - var10, class60.field671 - var11);
                            }
                            if (var9.field2746 == 1400) {
                                Statics.field711.method5251(class60.field662, class60.field672, var90 & var91, var90 & var92);
                            }
                            if (field981 != null && field981 != var9 && var90) {
                                int var93 = method920(var9);
                                boolean var94 = (var93 >> 20 & 0x1) != 0;
                                if (var94) {
                                    field859 = var9;
                                }
                            }
                            if (field982 == var9) {
                                field986 = true;
                                field987 = var10;
                                field988 = var11;
                            }
                            if (var9.field2814) {
                                if (var90 && field1006 != 0 && var9.field2840 != null) {
                                    class68 var95 = new class68();
                                    var95.field752 = true;
                                    var95.field750 = var9;
                                    var95.field747 = field1006;
                                    var95.field748 = var9.field2840;
                                    field1007.method3572(var95);
                                }
                                if (field981 != null || Statics.field480 != null || field839) {
                                    var92 = false;
                                    var91 = false;
                                    var90 = false;
                                }
                                if (!var9.field2865 && var92) {
                                    var9.field2865 = true;
                                    if (var9.field2821 != null) {
                                        class68 var96 = new class68();
                                        var96.field752 = true;
                                        var96.field750 = var9;
                                        var96.field749 = class60.field678 - var10;
                                        var96.field747 = class60.field671 - var11;
                                        var96.field748 = var9.field2821;
                                        field1007.method3572(var96);
                                    }
                                }
                                if (var9.field2865 && var91 && var9.field2813 != null) {
                                    class68 var97 = new class68();
                                    var97.field752 = true;
                                    var97.field750 = var9;
                                    var97.field749 = class60.field662 - var10;
                                    var97.field747 = class60.field672 - var11;
                                    var97.field748 = var9.field2813;
                                    field1007.method3572(var97);
                                }
                                if (var9.field2865 && !var91) {
                                    var9.field2865 = false;
                                    if (var9.field2761 != null) {
                                        class68 var98 = new class68();
                                        var98.field752 = true;
                                        var98.field750 = var9;
                                        var98.field749 = class60.field662 - var10;
                                        var98.field747 = class60.field672 - var11;
                                        var98.field748 = var9.field2761;
                                        field918.method3572(var98);
                                    }
                                }
                                if (var91 && var9.field2824 != null) {
                                    class68 var99 = new class68();
                                    var99.field752 = true;
                                    var99.field750 = var9;
                                    var99.field749 = class60.field662 - var10;
                                    var99.field747 = class60.field672 - var11;
                                    var99.field748 = var9.field2824;
                                    field1007.method3572(var99);
                                }
                                if (!var9.field2864 && var90) {
                                    var9.field2864 = true;
                                    if (var9.field2870 != null) {
                                        class68 var100 = new class68();
                                        var100.field752 = true;
                                        var100.field750 = var9;
                                        var100.field749 = class60.field662 - var10;
                                        var100.field747 = class60.field672 - var11;
                                        var100.field748 = var9.field2870;
                                        field1007.method3572(var100);
                                    }
                                }
                                if (var9.field2864 && var90 && var9.field2826 != null) {
                                    class68 var101 = new class68();
                                    var101.field752 = true;
                                    var101.field750 = var9;
                                    var101.field749 = class60.field662 - var10;
                                    var101.field747 = class60.field672 - var11;
                                    var101.field748 = var9.field2826;
                                    field1007.method3572(var101);
                                }
                                if (var9.field2864 && !var90) {
                                    var9.field2864 = false;
                                    if (var9.field2827 != null) {
                                        class68 var102 = new class68();
                                        var102.field752 = true;
                                        var102.field750 = var9;
                                        var102.field749 = class60.field662 - var10;
                                        var102.field747 = class60.field672 - var11;
                                        var102.field748 = var9.field2827;
                                        field918.method3572(var102);
                                    }
                                }
                                if (var9.field2838 != null) {
                                    class68 var103 = new class68();
                                    var103.field750 = var9;
                                    var103.field748 = var9.field2838;
                                    field1008.method3572(var103);
                                }
                                if (var9.field2832 != null && field995 > var9.field2775) {
                                    if (var9.field2825 == null || field995 - var9.field2775 > 32) {
                                        class68 var108 = new class68();
                                        var108.field750 = var9;
                                        var108.field748 = var9.field2832;
                                        field1007.method3572(var108);
                                    } else {
                                        label905: for (int var104 = var9.field2775; var104 < field995; var104++) {
                                            int var105 = field994[var104 & 0x1F];
                                            for (int var106 = 0; var106 < var9.field2825.length; var106++) {
                                                if (var9.field2825[var106] == var105) {
                                                    class68 var107 = new class68();
                                                    var107.field750 = var9;
                                                    var107.field748 = var9.field2832;
                                                    field1007.method3572(var107);
                                                    break label905;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2775 = field995;
                                }
                                if (var9.field2752 != null && field1074 > var9.field2868) {
                                    if (var9.field2790 == null || field1074 - var9.field2868 > 32) {
                                        class68 var113 = new class68();
                                        var113.field750 = var9;
                                        var113.field748 = var9.field2752;
                                        field1007.method3572(var113);
                                    } else {
                                        label881: for (int var109 = var9.field2868; var109 < field1074; var109++) {
                                            int var110 = field877[var109 & 0x1F];
                                            for (int var111 = 0; var111 < var9.field2790.length; var111++) {
                                                if (var9.field2790[var111] == var110) {
                                                    class68 var112 = new class68();
                                                    var112.field750 = var9;
                                                    var112.field748 = var9.field2752;
                                                    field1007.method3572(var112);
                                                    break label881;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2868 = field1074;
                                }
                                if (var9.field2836 != null && field999 > var9.field2769) {
                                    if (var9.field2837 == null || field999 - var9.field2769 > 32) {
                                        class68 var118 = new class68();
                                        var118.field750 = var9;
                                        var118.field748 = var9.field2836;
                                        field1007.method3572(var118);
                                    } else {
                                        label857: for (int var114 = var9.field2769; var114 < field999; var114++) {
                                            int var115 = field1060[var114 & 0x1F];
                                            for (int var116 = 0; var116 < var9.field2837.length; var116++) {
                                                if (var9.field2837[var116] == var115) {
                                                    class68 var117 = new class68();
                                                    var117.field750 = var9;
                                                    var117.field748 = var9.field2836;
                                                    field1007.method3572(var117);
                                                    break label857;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2769 = field999;
                                }
                                if (field1000 > var9.field2785 && var9.field2762 != null) {
                                    class68 var119 = new class68();
                                    var119.field750 = var9;
                                    var119.field748 = var9.field2762;
                                    field1007.method3572(var119);
                                }
                                if (field1001 > var9.field2785 && var9.field2843 != null) {
                                    class68 var120 = new class68();
                                    var120.field750 = var9;
                                    var120.field748 = var9.field2843;
                                    field1007.method3572(var120);
                                }
                                if (field950 > var9.field2785 && var9.field2844 != null) {
                                    class68 var121 = new class68();
                                    var121.field750 = var9;
                                    var121.field748 = var9.field2844;
                                    field1007.method3572(var121);
                                }
                                if (field1022 > var9.field2785 && var9.field2849 != null) {
                                    class68 var122 = new class68();
                                    var122.field750 = var9;
                                    var122.field748 = var9.field2849;
                                    field1007.method3572(var122);
                                }
                                if (field860 > var9.field2785 && var9.field2835 != null) {
                                    class68 var123 = new class68();
                                    var123.field750 = var9;
                                    var123.field748 = var9.field2835;
                                    field1007.method3572(var123);
                                }
                                if (field863 > var9.field2785 && var9.field2845 != null) {
                                    class68 var124 = new class68();
                                    var124.field750 = var9;
                                    var124.field748 = var9.field2845;
                                    field1007.method3572(var124);
                                }
                                var9.field2785 = field993;
                                if (var9.field2842 != null) {
                                    for (int var125 = 0; var125 < field1029; var125++) {
                                        class68 var126 = new class68();
                                        var126.field750 = var9;
                                        var126.field746 = field1031[var125];
                                        var126.field754 = field1030[var125];
                                        var126.field748 = var9.field2842;
                                        field1007.method3572(var126);
                                    }
                                }
                            }
                        }
                        if (!var9.field2738 && field981 == null && Statics.field480 == null && !field839) {
                            if ((var9.field2854 >= 0 || var9.field2766 != 0) && class60.field662 >= var12 && class60.field672 >= var13 && class60.field662 < var14 && class60.field672 < var15) {
                                if (var9.field2854 >= 0) {
                                    Statics.field3288 = arg0[var9.field2854];
                                } else {
                                    Statics.field3288 = var9;
                                }
                            }
                            if (var9.field2741 == 8 && class60.field662 >= var12 && class60.field672 >= var13 && class60.field662 < var14 && class60.field672 < var15) {
                                Statics.field26 = var9;
                            }
                            if (var9.field2763 > var9.field2764) {
                                method30(var9, var9.field2754 + var10, var11, var9.field2764, var9.field2763, class60.field662, class60.field672);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jn.jm([Lho;IB)V")
    public static final void method4592(class228[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class228 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2741 == 0) {
                    if (var3.field2794 != null) {
                        method4592(var3.field2794, arg1);
                    }
                    class67 var4 = (class67) field969.method3517((long) var3.field2739);
                    if (var4 != null) {
                        int var5 = var4.field744;
                        if (class228.method3651(var5)) {
                            method4592(Statics.field3286[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2822 != null) {
                    class68 var6 = new class68();
                    var6.field750 = var3;
                    var6.field748 = var3.field2822;
                    class81.method1724(var6);
                }
                if (arg1 == 1 && var3.field2772 != null) {
                    if (var3.field2841 >= 0) {
                        class228 var7 = class228.method471(var3.field2739);
                        if (var7 == null || var7.field2794 == null || var3.field2841 >= var7.field2794.length || var7.field2794[var3.field2841] != var3) {
                            continue;
                        }
                    }
                    class68 var8 = new class68();
                    var8.field750 = var3;
                    var8.field748 = var3.field2772;
                    class81.method1724(var8);
                }
            }
        }
    }

    @ObfuscatedName("co.jy(Lho;IIB)V")
    public static final void method1744(class228 arg0, int arg1, int arg2) {
        if (field981 != null || field839 || arg0 == null || method161(arg0) == null) {
            return;
        }
        field981 = arg0;
        field982 = method161(arg0);
        field983 = arg1;
        field984 = arg2;
        Statics.field3351 = 0;
        field992 = false;
        int var3 = method334();
        if (var3 != -1) {
            method3984(var3);
        }
    }

    @ObfuscatedName("client.ju(I)V")
    public final void method1111() {
        method924(field981);
        Statics.field3351++;
        if (field989 && field986) {
            int var1 = class60.field662;
            int var2 = class60.field672;
            int var3 = var1 - field983;
            int var4 = var2 - field984;
            if (var3 < field987) {
                var3 = field987;
            }
            if (field981.field2754 + var3 > field987 + field982.field2754) {
                var3 = field987 + field982.field2754 - field981.field2754;
            }
            if (var4 < field988) {
                var4 = field988;
            }
            if (field981.field2764 + var4 > field988 + field982.field2764) {
                var4 = field988 + field982.field2764 - field981.field2764;
            }
            int var5 = var3 - field990;
            int var6 = var4 - field991;
            int var7 = field981.field2815;
            if (Statics.field3351 > field981.field2803 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field992 = true;
            }
            int var8 = field982.field2760 + (var3 - field987);
            int var9 = field982.field2778 + (var4 - field988);
            if (field981.field2833 != null && field992) {
                class68 var10 = new class68();
                var10.field750 = field981;
                var10.field749 = var8;
                var10.field747 = var9;
                var10.field748 = field981.field2833;
                class81.method1724(var10);
            }
            if (class60.field667 == 0) {
                if (field992) {
                    if (field981.field2850 != null) {
                        class68 var11 = new class68();
                        var11.field750 = field981;
                        var11.field749 = var8;
                        var11.field747 = var9;
                        var11.field753 = field859;
                        var11.field748 = field981.field2850;
                        class81.method1724(var11);
                    }
                    if (field859 != null && method65(field981) != null) {
                        class175 var12 = class175.method470(class172.field2305, field868.field1440);
                        var12.field2403.method3121(field859.field2848);
                        var12.field2403.method3156(field859.field2841);
                        var12.field2403.method3105(field981.field2739);
                        var12.field2403.method3119(field859.field2739);
                        var12.field2403.method3156(field981.field2841);
                        var12.field2403.method3121(field981.field2848);
                        field868.method1879(var12);
                    }
                } else if (this.method1107()) {
                    this.method1378(field990 + field983, field991 + field984);
                } else if (field946 > 0) {
                    method991(field990 + field983, field991 + field984);
                }
                field981 = null;
            }
        } else if (Statics.field3351 > 1) {
            field981 = null;
        }
    }

    @ObfuscatedName("ho.jq(II)V")
    public static void method3984(int arg0) {
        Statics.field545 = new class87();
        Statics.field545.field1286 = field947[arg0];
        Statics.field545.field1281 = field948[arg0];
        Statics.field545.field1283 = field949[arg0];
        Statics.field545.field1284 = field919[arg0];
        Statics.field545.field1287 = field951[arg0];
    }

    @ObfuscatedName("bk.ja(IIB)V")
    public static void method991(int arg0, int arg1) {
        method3056(Statics.field545, arg0, arg1);
        Statics.field545 = null;
    }

    @ObfuscatedName("bm.jt(Lho;I)V")
    public static void method924(class228 arg0) {
        if (field1025 == arg0.field2863) {
            field1013[arg0.field2782] = true;
        }
    }

    @ObfuscatedName("aa.jh(B)V")
    public static void method211() {
        for (class67 var0 = (class67) field969.method3520(); var0 != null; var0 = (class67) field969.method3516()) {
            int var1 = var0.field744;
            if (class228.method3651(var1)) {
                boolean var2 = true;
                class228[] var3 = Statics.field3286[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2738;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2563;
                    class228 var6 = class228.method471(var5);
                    if (var6 != null) {
                        method924(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.ji(Lho;B)Lho;")
    public static class228 method161(class228 arg0) {
        class228 var1 = method65(arg0);
        if (var1 == null) {
            var1 = arg0.field2768;
        }
        return var1;
    }

    @ObfuscatedName("d.js([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method121(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ao.jr(II)V")
    public static final void method244(int arg0) {
        if (!class228.method3651(arg0)) {
            return;
        }
        class228[] var1 = Statics.field3286[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class228 var3 = var1[var2];
            if (var3 != null) {
                var3.field2861 = 0;
                var3.field2872 = 0;
            }
        }
    }

    @ObfuscatedName("bx.jc(II)V")
    public static final void method1479(int arg0) {
        if (class228.method3651(arg0)) {
            method4177(Statics.field3286[arg0], -1);
        }
    }

    @ObfuscatedName("ih.jk([Lho;IB)V")
    public static final void method4177(class228[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class228 var3 = arg0[var2];
            if (var3 != null && var3.field2758 == arg1 && (!var3.field2738 || !method212(var3))) {
                if (var3.field2741 == 0) {
                    if (!var3.field2738 && method212(var3) && Statics.field3288 != var3) {
                        continue;
                    }
                    method4177(arg0, var3.field2739);
                    if (var3.field2794 != null) {
                        method4177(var3.field2794, var3.field2739);
                    }
                    class67 var4 = (class67) field969.method3517((long) var3.field2739);
                    if (var4 != null) {
                        int var5 = var4.field744;
                        if (class228.method3651(var5)) {
                            method4177(Statics.field3286[var5], -1);
                        }
                    }
                }
                if (var3.field2741 == 6) {
                    if (var3.field2786 != -1 || var3.field2787 != -1) {
                        boolean var6 = method153(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2787;
                        } else {
                            var7 = var3.field2786;
                        }
                        if (var7 != -1) {
                            class272 var8 = class272.method2308(var7);
                            var3.field2872 += field883;
                            while (var3.field2872 > var8.field3670[var3.field2861]) {
                                var3.field2872 -= var8.field3670[var3.field2861];
                                var3.field2861++;
                                if (var3.field2861 >= var8.field3660.length) {
                                    var3.field2861 -= var8.field3664;
                                    if (var3.field2861 < 0 || var3.field2861 >= var8.field3660.length) {
                                        var3.field2861 = 0;
                                    }
                                }
                                method924(var3);
                            }
                        }
                    }
                    if (var3.field2795 != 0 && !var3.field2738) {
                        int var9 = var3.field2795 >> 16;
                        int var10 = var3.field2795 << 16 >> 16;
                        int var11 = field883 * var9;
                        int var12 = field883 * var10;
                        var3.field2727 = var3.field2727 + var11 & 0x7FF;
                        var3.field2791 = var3.field2791 + var12 & 0x7FF;
                        method924(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.jb(IB)V")
    public static final void method252(int arg0) {
        method211();
        for (class80 var1 = (class80) class80.field1209.method3581(); var1 != null; var1 = (class80) class80.field1209.method3597()) {
            if (var1.field1216 != null) {
                var1.method1625();
            }
        }
        class253 var2 = (class253) class253.field3349.method3504((long) arg0);
        class253 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2414.method4032(16, arg0);
            class253 var5 = new class253();
            if (var4 != null) {
                var5.method4197(new class185(var4));
            }
            class253.field3349.method3506(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var6 = var3.field3350;
        if (var6 == 0) {
            return;
        }
        int var7 = class223.field2691[arg0];
        if (var6 == 1) {
            if (var7 == 1) {
                class134.method2552(0.9D);
                ((class123) Statics.field1895).method2338(0.9D);
            }
            if (var7 == 2) {
                class134.method2552(0.8D);
                ((class123) Statics.field1895).method2338(0.8D);
            }
            if (var7 == 3) {
                class134.method2552(0.7D);
                ((class123) Statics.field1895).method2338(0.7D);
            }
            if (var7 == 4) {
                class134.method2552(0.6D);
                ((class123) Statics.field1895).method2338(0.6D);
            }
            class268.field3564.method3513();
        }
        if (var6 == 3) {
            short var8 = 0;
            if (var7 == 0) {
                var8 = 255;
            }
            if (var7 == 1) {
                var8 = 192;
            }
            if (var7 == 2) {
                var8 = 128;
            }
            if (var7 == 3) {
                var8 = 64;
            }
            if (var7 == 4) {
                var8 = 0;
            }
            if (field1041 != var8) {
                if (field1041 == 0 && field1042 != -1) {
                    class215.method2935(Statics.field2074, field1042, 0, var8, false);
                    field1015 = false;
                } else if (var8 == 0) {
                    Statics.field2596.method3673();
                    class215.field2597 = 1;
                    Statics.field1370 = null;
                    field1015 = false;
                } else if (class215.field2597 == 0) {
                    Statics.field2596.method3667(var8);
                } else {
                    Statics.field2598 = var8;
                }
                field1041 = var8;
            }
        }
        if (var6 == 4) {
            if (var7 == 0) {
                field1009 = 127;
            }
            if (var7 == 1) {
                field1009 = 96;
            }
            if (var7 == 2) {
                field1009 = 64;
            }
            if (var7 == 3) {
                field1009 = 32;
            }
            if (var7 == 4) {
                field1009 = 0;
            }
        }
        if (var6 == 5) {
            field1050 = var7;
        }
        if (var6 == 6) {
            field1043 = var7;
        }
        if (var6 == 9) {
            field971 = var7;
        }
        if (var6 == 10) {
            if (var7 == 0) {
                field880 = 127;
            }
            if (var7 == 1) {
                field880 = 96;
            }
            if (var7 == 2) {
                field880 = 64;
            }
            if (var7 == 3) {
                field880 = 32;
            }
            if (var7 == 4) {
                field880 = 0;
            }
        }
        if (var6 == 17) {
            field891 = var7 & 0xFFFF;
        }
        if (var6 == 18) {
            field900 = (class89) class180.method4646(class89.method4799(), var7);
            if (field900 == null) {
                field900 = class89.field1299;
            }
        }
        if (var6 == 19) {
            if (var7 == -1) {
                field936 = -1;
            } else {
                field936 = var7 & 0x7FF;
            }
        }
        if (var6 == 22) {
            field850 = (class89) class180.method4646(class89.method4799(), var7);
            if (field850 == null) {
                field850 = class89.field1299;
            }
        }
    }

    @ObfuscatedName("cg.je(Lbe;ZS)V")
    public static final void method1681(class67 arg0, boolean arg1) {
        int var2 = arg0.field744;
        int var3 = (int) arg0.field2563;
        arg0.method3561();
        if (arg1) {
            class228.method10(var2);
        }
        for (class210 var4 = (class210) field1010.method3520(); var4 != null; var4 = (class210) field1010.method3516()) {
            if ((var4.field2563 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3561();
            }
        }
        class228 var5 = class228.method471(var3);
        if (var5 != null) {
            method924(var5);
        }
        method53();
        if (field968 != -1) {
            int var6 = field968;
            if (class228.method3651(var6)) {
                method4592(Statics.field3286[var6], 1);
            }
        }
    }

    @ObfuscatedName("dx.kz(Lho;I)Z")
    public static final boolean method2357(class228 arg0) {
        int var1 = arg0.field2746;
        if (var1 == 205) {
            field1044 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1082.method3890(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1082.method3903(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1082.method3892(false);
        }
        if (var1 == 325) {
            field1082.method3892(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method470(class172.field2323, field868.field1440);
            field1082.method3893(var6.field2403);
            field868.method1879(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("il.kb(IIIILko;Lhu;B)V")
    public static final void method4228(int arg0, int arg1, int arg2, int arg3, class310 arg4, class222 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2862(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field853 & 0x7FF;
        int var8 = class134.field1889[var7];
        int var9 = class134.field1911[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2687 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1389.method5135(arg5.field2687 / 2 + arg0 - var17 / 2 + var15, arg5.field2685 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ef.kl(IIIILko;Lhu;I)V")
    public static final void method2862(int arg0, int arg1, int arg2, int arg3, class310 arg4, class222 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field853 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class134.field1889[var6];
        int var9 = class134.field1911[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5133(arg5.field2687 / 2 + var10 - arg4.field3884 / 2, arg5.field2685 / 2 - var11 - arg4.field3880 / 2, arg0, arg1, arg5.field2687, arg5.field2685, arg5.field2686, arg5.field2684);
        } else {
            arg4.method5123(arg5.field2687 / 2 + arg0 + var10 - arg4.field3884 / 2, arg5.field2685 / 2 + arg1 - var11 - arg4.field3880 / 2);
        }
    }

    @ObfuscatedName("ay.kd(I)V")
    public static final void method253() {
        for (int var0 = 0; var0 < class93.field1379; var0++) {
            class72 var1 = field927[class93.field1380[var0]];
            var1.method1039();
        }
        Iterator var2 = class95.field1401.iterator();
        while (var2.hasNext()) {
            class70 var3 = (class70) var2.next();
            var3.method1022();
        }
        if (Statics.field2926 != null) {
            Statics.field2926.method4779();
        }
    }

    @ObfuscatedName("bz.ks(I)V")
    public static final void method960() {
        Iterator var0 = class95.field1401.iterator();
        while (var0.hasNext()) {
            class70 var1 = (class70) var0.next();
            var1.method1002();
        }
        if (Statics.field2926 != null) {
            Statics.field2926.method4780();
        }
    }

    @ObfuscatedName("cm.ke(Ljava/lang/String;I)V")
    public static final void method1783(String arg0) {
        if (Statics.field2926 != null) {
            class175 var1 = class175.method470(class172.field2334, field868.field1440);
            var1.field2403.method3107(class185.method1722(arg0));
            var1.field2403.method3189(arg0);
            field868.method1879(var1);
        }
    }

    @ObfuscatedName("bm.kj(Lho;I)I")
    public static int method920(class228 arg0) {
        class210 var1 = (class210) field1010.method3517(((long) arg0.field2739 << 32) + (long) arg0.field2841);
        return var1 == null ? arg0.field2811 : var1.field2576;
    }

    @ObfuscatedName("x.kc(Lho;B)Lho;")
    public static class228 method65(class228 arg0) {
        int var1 = method920(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class228.method471(arg0.field2758);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("aa.ki(Lho;B)Z")
    public static boolean method212(class228 arg0) {
        if (field978) {
            if (method920(arg0) != 0) {
                return false;
            }
            if (arg0.field2741 == 0) {
                return false;
            }
        }
        return arg0.field2797;
    }

    @ObfuscatedName("aq.km(Lho;II)Ljava/lang/String;")
    public static String method556(class228 arg0, int arg1) {
        if (!class229.method160(method920(arg0), arg1) && arg0.field2839 == null) {
            return null;
        } else if (arg0.field2828 == null || arg0.field2828.length <= arg1 || arg0.field2828[arg1] == null || arg0.field2828[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2828[arg1];
        }
    }

    @ObfuscatedName("aw.ku(Lho;I)Ljava/lang/String;")
    public static String method538(class228 arg0) {
        if (class229.method3003(method920(arg0)) == 0) {
            return null;
        } else if (arg0.field2818 == null || arg0.field2818.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2818;
        }
    }

    @ObfuscatedName("go.kg(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3408(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field958 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field958 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field958 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field958 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field958 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field702 != null) {
            var3 = "/p=" + Statics.field702;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field828 + "/a=" + Statics.field2082 + var3 + "/";
    }

    @ObfuscatedName("k.kq(Ljava/lang/String;I)V")
    public static void method154(String arg0) {
        Statics.field702 = arg0;
        try {
            String var1 = Statics.field481.getParameter(class299.field3808.field3812);
            String var2 = Statics.field481.getParameter(class299.field3797.field3812);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class187.method35() + 94608000000L;
                class194.field2533.setTime(new Date(var6));
                int var8 = class194.field2533.get(7);
                int var9 = class194.field2533.get(5);
                int var10 = class194.field2533.get(2);
                int var11 = class194.field2533.get(1);
                int var12 = class194.field2533.get(11);
                int var13 = class194.field2533.get(12);
                int var14 = class194.field2533.get(13);
                String var15 = class194.field2534[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class194.field2535[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field481;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("client.kv(B)Ljr;")
    public class281 method1149() {
        return Statics.field470 == null ? null : Statics.field470.field787;
    }

    @ObfuscatedName("fw.ka(B)Z")
    public static boolean method2883() {
        return field957 >= 2;
    }

    @ObfuscatedName("ah.kx(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method330(String arg0) {
        class242[] var1 = new class242[] { class242.field3258, class242.field3254, class242.field3249, class242.field3253, class242.field3252, class242.field3251 };
        class242[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class242 var4 = var2[var3];
            if (var4.field3255 != -1) {
                int var6 = var4.field3255;
                String var7 = "<img=" + var6 + ">";
                if (arg0.startsWith(var7)) {
                    arg0 = arg0.substring(6 + Integer.toString(var4.field3255).length());
                    break;
                }
            }
        }
        return arg0;
    }
}

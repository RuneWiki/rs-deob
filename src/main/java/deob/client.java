package deob;

import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class60 implements class303 {

    @ObfuscatedName("client.w")
    public static class177[] field867 = new class177[4];

    @ObfuscatedName("client.ad")
    public static boolean field890 = true;

    @ObfuscatedName("client.bg")
    public static int field850 = 1;

    @ObfuscatedName("client.br")
    public static int field851 = 0;

    @ObfuscatedName("client.bk")
    public static int field907 = 0;

    @ObfuscatedName("client.bm")
    public static boolean field854 = false;

    @ObfuscatedName("client.bh")
    public static boolean field855 = false;

    @ObfuscatedName("client.bs")
    public static int field856 = 0;

    @ObfuscatedName("client.bb")
    public static int field857 = 0;

    @ObfuscatedName("client.bq")
    public static boolean field950 = true;

    @ObfuscatedName("client.bz")
    public static int field1108 = 0;

    @ObfuscatedName("client.bx")
    public static long field860 = 1L;

    @ObfuscatedName("client.bo")
    public static int field861 = -1;

    @ObfuscatedName("client.bv")
    public static int field947 = -1;

    @ObfuscatedName("client.bi")
    public static int field1008 = -1;

    @ObfuscatedName("client.bu")
    public static boolean field864 = true;

    @ObfuscatedName("client.bl")
    public static boolean field1076 = false;

    @ObfuscatedName("client.bw")
    public static int field866 = 0;

    @ObfuscatedName("client.bp")
    public static int field949 = 0;

    @ObfuscatedName("client.bd")
    public static int field868 = 0;

    @ObfuscatedName("client.cb")
    public static int field869 = 0;

    @ObfuscatedName("client.cm")
    public static int field990 = 0;

    @ObfuscatedName("client.cu")
    public static int field871 = 0;

    @ObfuscatedName("client.cs")
    public static int field1030 = 0;

    @ObfuscatedName("client.ct")
    public static int field873 = 0;

    @ObfuscatedName("client.cw")
    public static int field874 = 0;

    @ObfuscatedName("client.cr")
    public static class90 field875 = class90.field1320;

    @ObfuscatedName("client.co")
    public static class90 field876 = class90.field1320;

    @ObfuscatedName("client.cd")
    public static int field877 = 0;

    @ObfuscatedName("client.cc")
    public static int field879 = 0;

    @ObfuscatedName("client.ce")
    public static int field880 = 0;

    @ObfuscatedName("client.dl")
    public static int field883 = 0;

    @ObfuscatedName("client.df")
    public static int field884 = 0;

    @ObfuscatedName("client.dq")
    public static int field885 = 0;

    @ObfuscatedName("client.dt")
    public static int field849 = 0;

    @ObfuscatedName("client.dy")
    public static int field887 = 0;

    @ObfuscatedName("client.dn")
    public static class159 field888 = class159.field2125;

    @ObfuscatedName("client.de")
    public static byte[] field889 = null;

    @ObfuscatedName("client.dv")
    public static class85[] field975 = new class85[32768];

    @ObfuscatedName("client.dz")
    public static int field865 = 0;

    @ObfuscatedName("client.ds")
    public static int[] field892 = new int[32768];

    @ObfuscatedName("client.dm")
    public static int field917 = 0;

    @ObfuscatedName("client.eb")
    public static int[] field894 = new int[250];

    @ObfuscatedName("client.ee")
    public static final class100 field1073 = new class100();

    @ObfuscatedName("client.ei")
    public static int field1037 = 0;

    @ObfuscatedName("client.ed")
    public static boolean field897 = false;

    @ObfuscatedName("client.ew")
    public static boolean field1068 = true;

    @ObfuscatedName("client.ey")
    public static class295 field899 = new class295();

    @ObfuscatedName("client.es")
    public static HashMap field901 = new HashMap();

    @ObfuscatedName("client.ea")
    public static int field902 = 0;

    @ObfuscatedName("client.em")
    public static int field903 = 1;

    @ObfuscatedName("client.er")
    public static int field935 = 0;

    @ObfuscatedName("client.eh")
    public static int field1088 = 1;

    @ObfuscatedName("client.ex")
    public static int field906 = 0;

    @ObfuscatedName("client.fl")
    public static boolean field1015 = false;

    @ObfuscatedName("client.ft")
    public static int[][][] field909 = new int[4][13][13];

    @ObfuscatedName("client.fb")
    public static final int[] field910 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fs")
    public static int field911 = 0;

    @ObfuscatedName("client.fx")
    public static int field912 = 2301979;

    @ObfuscatedName("client.fo")
    public static int field1043 = 5063219;

    @ObfuscatedName("client.gu")
    public static int field908 = 3353893;

    @ObfuscatedName("client.ga")
    public static int field915 = 7759444;

    @ObfuscatedName("client.gd")
    public static boolean field916 = false;

    @ObfuscatedName("client.gg")
    public static int field1019 = 0;

    @ObfuscatedName("client.gq")
    public static int field918 = 128;

    @ObfuscatedName("client.gb")
    public static int field919 = 0;

    @ObfuscatedName("client.gc")
    public static int field920 = 0;

    @ObfuscatedName("client.gf")
    public static int field921 = 0;

    @ObfuscatedName("client.gt")
    public static int field1042 = 0;

    @ObfuscatedName("client.gr")
    public static int field1083 = 0;

    @ObfuscatedName("client.gn")
    public static int field924 = 0;

    @ObfuscatedName("client.gl")
    public static int field925 = 50;

    @ObfuscatedName("client.gx")
    public static int field926 = 0;

    @ObfuscatedName("client.gj")
    public static int field872 = 0;

    @ObfuscatedName("client.gm")
    public static int field928 = 0;

    @ObfuscatedName("client.ht")
    public static int field1116 = 12;

    @ObfuscatedName("client.hq")
    public static int field858 = 6;

    @ObfuscatedName("client.hm")
    public static int field931 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field955 = false;

    @ObfuscatedName("client.hj")
    public static int field933 = 0;

    @ObfuscatedName("client.he")
    public static boolean field996 = false;

    @ObfuscatedName("client.hp")
    public static int field993 = 0;

    @ObfuscatedName("client.hr")
    public static int field940 = 0;

    @ObfuscatedName("client.hx")
    public static int field937 = 50;

    @ObfuscatedName("client.hf")
    public static int[] field984 = new int[field937];

    @ObfuscatedName("client.hh")
    public static int[] field927 = new int[field937];

    @ObfuscatedName("client.hw")
    public static int[] field966 = new int[field937];

    @ObfuscatedName("client.hn")
    public static int[] field941 = new int[field937];

    @ObfuscatedName("client.ha")
    public static int[] field979 = new int[field937];

    @ObfuscatedName("client.hg")
    public static int[] field943 = new int[field937];

    @ObfuscatedName("client.hc")
    public static int[] field944 = new int[field937];

    @ObfuscatedName("client.hs")
    public static String[] field898 = new String[field937];

    @ObfuscatedName("client.hl")
    public static int[][] field1079 = new int[104][104];

    @ObfuscatedName("client.hu")
    public static int field1044 = 0;

    @ObfuscatedName("client.hv")
    public static int field960 = -1;

    @ObfuscatedName("client.hd")
    public static int field932 = -1;

    @ObfuscatedName("client.hi")
    public static int field976 = 0;

    @ObfuscatedName("client.hk")
    public static int field951 = 0;

    @ObfuscatedName("client.hb")
    public static int field1089 = 0;

    @ObfuscatedName("client.hy")
    public static int field953 = 0;

    @ObfuscatedName("client.ho")
    public static boolean field954 = true;

    @ObfuscatedName("client.iq")
    public static int field1028 = 0;

    @ObfuscatedName("client.iv")
    public static int field956 = 0;

    @ObfuscatedName("client.is")
    public static int field999 = 0;

    @ObfuscatedName("client.io")
    public static int field958 = 0;

    @ObfuscatedName("client.ig")
    public static int field959 = 0;

    @ObfuscatedName("client.ic")
    public static int field1091 = 0;

    @ObfuscatedName("client.it")
    public static String field1003 = null;

    @ObfuscatedName("client.iw")
    public static boolean field961 = false;

    @ObfuscatedName("client.ih")
    public static int field962 = 0;

    @ObfuscatedName("client.ij")
    public static int field963 = 0;

    @ObfuscatedName("client.ir")
    public static boolean field964 = true;

    @ObfuscatedName("client.ip")
    public static class73[] field965 = new class73[2048];

    @ObfuscatedName("client.iy")
    public static int field1056 = -1;

    @ObfuscatedName("client.im")
    public static int field967 = 0;

    @ObfuscatedName("client.iu")
    public static boolean field968 = true;

    @ObfuscatedName("client.jt")
    public static int field969 = 0;

    @ObfuscatedName("client.ju")
    public static int field970 = 0;

    @ObfuscatedName("client.jg")
    public static int[] field971 = new int[1000];

    @ObfuscatedName("client.ji")
    public static final int[] field972 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ja")
    public static String[] field973 = new String[8];

    @ObfuscatedName("client.jn")
    public static boolean[] field1082 = new boolean[8];

    @ObfuscatedName("client.jj")
    public static int[] field882 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jq")
    public static int field891 = -1;

    @ObfuscatedName("client.jz")
    public static class218[][][] field886 = new class218[4][104][104];

    @ObfuscatedName("client.jw")
    public static class218 field978 = new class218();

    @ObfuscatedName("client.js")
    public static class218 field1078 = new class218();

    @ObfuscatedName("client.jf")
    public static class218 field980 = new class218();

    @ObfuscatedName("client.jb")
    public static int[] field948 = new int[25];

    @ObfuscatedName("client.jx")
    public static int[] field1031 = new int[25];

    @ObfuscatedName("client.jr")
    public static int[] field983 = new int[25];

    @ObfuscatedName("client.jp")
    public static int field1023 = 0;

    @ObfuscatedName("client.jl")
    public static boolean field985 = false;

    @ObfuscatedName("client.jd")
    public static int field977 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field987 = new int[500];

    @ObfuscatedName("client.kf")
    public static int[] field988 = new int[500];

    @ObfuscatedName("client.kk")
    public static int[] field1041 = new int[500];

    @ObfuscatedName("client.ka")
    public static int[] field922 = new int[500];

    @ObfuscatedName("client.ko")
    public static String[] field991 = new String[500];

    @ObfuscatedName("client.kd")
    public static String[] field992 = new String[500];

    @ObfuscatedName("client.kc")
    public static boolean[] field974 = new boolean[500];

    @ObfuscatedName("client.kg")
    public static boolean field994 = false;

    @ObfuscatedName("client.ki")
    public static boolean field995 = false;

    @ObfuscatedName("client.kv")
    public static boolean field878 = false;

    @ObfuscatedName("client.ky")
    public static boolean field997 = true;

    @ObfuscatedName("client.kj")
    public static int field1005 = -1;

    @ObfuscatedName("client.ku")
    public static int field1090 = -1;

    @ObfuscatedName("client.kx")
    public static int field1000 = 0;

    @ObfuscatedName("client.ke")
    public static int field1001 = 50;

    @ObfuscatedName("client.kb")
    public static int field1002 = 0;

    @ObfuscatedName("client.kl")
    public static boolean field934 = false;

    @ObfuscatedName("client.kq")
    public static int field1051 = -1;

    @ObfuscatedName("client.kn")
    public static int field981 = -1;

    @ObfuscatedName("client.lj")
    public static String field1007 = null;

    @ObfuscatedName("client.lw")
    public static String field1075 = null;

    @ObfuscatedName("client.lv")
    public static int field1009 = -1;

    @ObfuscatedName("client.lt")
    public static class215 field1010 = new class215(8);

    @ObfuscatedName("client.ly")
    public static int field1011 = 0;

    @ObfuscatedName("client.lq")
    public static int field1012 = 0;

    @ObfuscatedName("client.ls")
    public static class243 field1013 = null;

    @ObfuscatedName("client.lx")
    public static int field1014 = 0;

    @ObfuscatedName("client.ll")
    public static int field863 = 0;

    @ObfuscatedName("client.lh")
    public static int field936 = 0;

    @ObfuscatedName("client.lc")
    public static int field1017 = -1;

    @ObfuscatedName("client.lb")
    public static boolean field1018 = false;

    @ObfuscatedName("client.lz")
    public static class243 field1062 = null;

    @ObfuscatedName("client.ln")
    public static class243 field1020 = null;

    @ObfuscatedName("client.lm")
    public static class243 field1021 = null;

    @ObfuscatedName("client.li")
    public static int field1022 = 0;

    @ObfuscatedName("client.lf")
    public static int field1016 = 0;

    @ObfuscatedName("client.ld")
    public static class243 field952 = null;

    @ObfuscatedName("client.lk")
    public static boolean field1025 = false;

    @ObfuscatedName("client.la")
    public static int field1026 = -1;

    @ObfuscatedName("client.le")
    public static int field1099 = -1;

    @ObfuscatedName("client.lg")
    public static boolean field1096 = false;

    @ObfuscatedName("client.lo")
    public static int field1029 = -1;

    @ObfuscatedName("client.lu")
    public static int field945 = -1;

    @ObfuscatedName("client.lr")
    public static boolean field859 = false;

    @ObfuscatedName("client.mn")
    public static int field1032 = 1;

    @ObfuscatedName("client.mk")
    public static int[] field1033 = new int[32];

    @ObfuscatedName("client.ma")
    public static int field1034 = 0;

    @ObfuscatedName("client.mu")
    public static int[] field1035 = new int[32];

    @ObfuscatedName("client.mz")
    public static int field1036 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field895 = new int[32];

    @ObfuscatedName("client.my")
    public static int field1038 = 0;

    @ObfuscatedName("client.mc")
    public static int field1039 = 0;

    @ObfuscatedName("client.ms")
    public static int field1040 = 0;

    @ObfuscatedName("client.mj")
    public static int field893 = 0;

    @ObfuscatedName("client.mo")
    public static int field1058 = 0;

    @ObfuscatedName("client.mi")
    public static int field914 = 0;

    @ObfuscatedName("client.mv")
    public static int field982 = 0;

    @ObfuscatedName("client.mw")
    public static int field1045 = 0;

    @ObfuscatedName("client.me")
    public static class218 field1046 = new class218();

    @ObfuscatedName("client.mh")
    public static class218 field1047 = new class218();

    @ObfuscatedName("client.ml")
    public static class218 field1048 = new class218();

    @ObfuscatedName("client.mf")
    public static class215 field896 = new class215(512);

    @ObfuscatedName("client.nm")
    public static int field1050 = 0;

    @ObfuscatedName("client.nq")
    public static int field1027 = -2;

    @ObfuscatedName("client.nc")
    public static boolean[] field1052 = new boolean[100];

    @ObfuscatedName("client.nt")
    public static boolean[] field905 = new boolean[100];

    @ObfuscatedName("client.nj")
    public static boolean[] field1054 = new boolean[100];

    @ObfuscatedName("client.nw")
    public static int[] field1055 = new int[100];

    @ObfuscatedName("client.ni")
    public static int[] field1006 = new int[100];

    @ObfuscatedName("client.nk")
    public static int[] field1057 = new int[100];

    @ObfuscatedName("client.nl")
    public static int[] field998 = new int[100];

    @ObfuscatedName("client.nu")
    public static int field1059 = 0;

    @ObfuscatedName("client.ng")
    public static long field1060 = 0L;

    @ObfuscatedName("client.ny")
    public static boolean field1061 = true;

    @ObfuscatedName("client.ne")
    public static int[] field929 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.np")
    public static int field1063 = 0;

    @ObfuscatedName("client.nb")
    public static int field1064 = 0;

    @ObfuscatedName("client.nz")
    public static String field1065 = "";

    @ObfuscatedName("client.nx")
    public static long[] field1066 = new long[100];

    @ObfuscatedName("client.nd")
    public static int field1067 = 0;

    @ObfuscatedName("client.og")
    public static int field870 = 0;

    @ObfuscatedName("client.or")
    public static int[] field1069 = new int[128];

    @ObfuscatedName("client.ol")
    public static int[] field1070 = new int[128];

    @ObfuscatedName("client.oz")
    public static long field1071 = -1L;

    @ObfuscatedName("client.oj")
    public static int field1072 = -1;

    @ObfuscatedName("client.oc")
    public static int field1049 = 0;

    @ObfuscatedName("client.ov")
    public static int[] field1074 = new int[1000];

    @ObfuscatedName("client.od")
    public static int[] field862 = new int[1000];

    @ObfuscatedName("client.ou")
    public static class332[] field986 = new class332[1000];

    @ObfuscatedName("client.ob")
    public static int field1077 = 0;

    @ObfuscatedName("client.oa")
    public static int field904 = 0;

    @ObfuscatedName("client.oo")
    public static int field1004 = 0;

    @ObfuscatedName("client.os")
    public static int field1080 = 255;

    @ObfuscatedName("client.ox")
    public static int field1081 = -1;

    @ObfuscatedName("client.oe")
    public static boolean field957 = false;

    @ObfuscatedName("client.ow")
    public static int field900 = 127;

    @ObfuscatedName("client.pa")
    public static int field1084 = 127;

    @ObfuscatedName("client.py")
    public static int field1085 = 0;

    @ObfuscatedName("client.po")
    public static int[] field1086 = new int[50];

    @ObfuscatedName("client.pe")
    public static int[] field1087 = new int[50];

    @ObfuscatedName("client.pt")
    public static int[] field913 = new int[50];

    @ObfuscatedName("client.pl")
    public static int[] field942 = new int[50];

    @ObfuscatedName("client.ph")
    public static class104[] field938 = new class104[50];

    @ObfuscatedName("client.px")
    public static boolean field852 = false;

    @ObfuscatedName("client.pf")
    public static boolean[] field1092 = new boolean[5];

    @ObfuscatedName("client.pb")
    public static int[] field1093 = new int[5];

    @ObfuscatedName("client.qh")
    public static int[] field1094 = new int[5];

    @ObfuscatedName("client.ql")
    public static int[] field1095 = new int[5];

    @ObfuscatedName("client.qs")
    public static int[] field1097 = new int[5];

    @ObfuscatedName("client.qw")
    public static short field1053 = 256;

    @ObfuscatedName("client.qk")
    public static short field1098 = 205;

    @ObfuscatedName("client.qr")
    public static short field923 = 256;

    @ObfuscatedName("client.qu")
    public static short field1100 = 320;

    @ObfuscatedName("client.qm")
    public static short field1101 = 1;

    @ObfuscatedName("client.qd")
    public static short field1102 = 32767;

    @ObfuscatedName("client.qf")
    public static short field1103 = 1;

    @ObfuscatedName("client.qa")
    public static short field1104 = 32767;

    @ObfuscatedName("client.qq")
    public static int field1105 = 0;

    @ObfuscatedName("client.qo")
    public static int field1106 = 0;

    @ObfuscatedName("client.qg")
    public static int field1107 = 0;

    @ObfuscatedName("client.qb")
    public static int field946 = 0;

    @ObfuscatedName("client.qc")
    public static int field1109 = 0;

    @ObfuscatedName("client.qv")
    public static class240 field1110 = new class240();

    @ObfuscatedName("client.qn")
    public static int field1111 = -1;

    @ObfuscatedName("client.qx")
    public static int field1112 = -1;

    @ObfuscatedName("client.qj")
    public static class17[] field1113 = new class17[8];

    @ObfuscatedName("client.qz")
    public static class74 field1114 = new class74();

    @ObfuscatedName("client.rh")
    public static int field1115 = -1;

    @ObfuscatedName("client.rk")
    public static ArrayList field1024 = new ArrayList(10);

    @ObfuscatedName("client.rm")
    public static int field1117 = 0;

    @ObfuscatedName("client.rn")
    public static final class72 field1118 = new class72();

    @ObfuscatedName("client.rp")
    public static int[] field1119 = new int[50];

    @ObfuscatedName("client.re")
    public static int[] field1120 = new int[50];

    @ObfuscatedName("ex.ep(I)Llo;")
    public static class335 method2919() {
        return Statics.field3306;
    }

    @ObfuscatedName("client.ak(B)V")
    public final void method834() {
    }

    public final void init() {
        if (!this.method858()) {
            return;
        }
        class294[] var1 = class294.method3054();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class294 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3811);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3811)) {
                    case 1:
                        Statics.field291 = var4;
                        break;
                    case 2:
                        field851 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field853 = (class259) class190.method241(class259.method4170(), Integer.parseInt(var4));
                        if (Statics.field853 == class259.field3364) {
                            Statics.field613 = class336.field4076;
                        } else {
                            Statics.field613 = class336.field4070;
                        }
                        break;
                    case 4:
                        Statics.field3559 = Integer.parseInt(var4);
                        break;
                    case 5:
                        field856 = Integer.parseInt(var4);
                        break;
                    case 6:
                        Statics.field1387 = var4;
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class87.field1304)) {
                        }
                    case 8:
                    case 10:
                    case 15:
                    default:
                        break;
                    case 9:
                        field1068 = Integer.parseInt(var4) != 0;
                        break;
                    case 11:
                        int var5 = Integer.parseInt(var4);
                        class258[] var6 = new class258[] { class258.field3352, class258.field3353, class258.field3354, class258.field3356 };
                        class258[] var7 = var6;
                        int var8 = 0;
                        class258 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class258 var9 = var7[var8];
                            if (var9.field3358 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field2 = var10;
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class87.field1304)) {
                            field854 = true;
                        } else {
                            field854 = false;
                        }
                        break;
                    case 13:
                        field907 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field850 = Integer.parseInt(var4);
                        break;
                    case 16:
                        Statics.field740 = Integer.parseInt(var4);
                }
            }
        }
        method345();
        Statics.field277 = this.getCodeBase().getHost();
        String var11 = Statics.field2.field3355;
        byte var12 = 0;
        try {
            Statics.field2177 = 17;
            Statics.field508 = var12;
            try {
                Statics.field553 = System.getProperty("os.name");
            } catch (Exception var25) {
                Statics.field553 = "Unknown";
            }
            Statics.field2182 = Statics.field553.toLowerCase();
            try {
                Statics.field2183 = System.getProperty("user.home");
                if (Statics.field2183 != null) {
                    Statics.field2183 = Statics.field2183 + "/";
                }
            } catch (Exception var24) {
            }
            try {
                if (Statics.field2182.startsWith("win")) {
                    if (Statics.field2183 == null) {
                        Statics.field2183 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2183 == null) {
                    Statics.field2183 = System.getenv("HOME");
                }
                if (Statics.field2183 != null) {
                    Statics.field2183 = Statics.field2183 + "/";
                }
            } catch (Exception var23) {
            }
            if (Statics.field2183 == null) {
                Statics.field2183 = "~/";
            }
            Statics.field301 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2183, "/tmp/", "" };
            Statics.field2187 = new String[] { ".jagex_cache_" + Statics.field508, ".file_store_" + Statics.field508 };
            label125: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field2093 = class168.method2644("oldschool", var11, var16);
                if (!Statics.field2093.exists()) {
                    Statics.field2093.mkdirs();
                }
                File[] var17 = Statics.field2093.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label125;
                    }
                    File var20 = var18[var19];
                    if (!class168.method718(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            class171.method1760(Statics.field2093);
            class168.method1754();
            class168.field2180 = new class122(new class123(class171.method4563("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class168.field2174 = new class122(new class123(class171.method4563("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field545 = new class122[Statics.field2177];
            for (int var21 = 0; var21 < Statics.field2177; var21++) {
                Statics.field545[var21] = new class122(new class123(class171.method4563("main_file_cache.idx" + var21), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var26) {
            class165.method2453((String) null, var26);
        }
        Statics.field3013 = this;
        this.method810(765, 503, 166);
    }

    @ObfuscatedName("ah.eq(I)V")
    public static final void method345() {
        class138.field1974 = false;
        field855 = false;
    }

    @ObfuscatedName("client.az(I)V")
    public final void method906() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field1203 = null;
            Statics.field2559 = null;
            Statics.field2560 = (byte[][][]) null;
        } else {
            Statics.field1203 = var1;
            Statics.field2559 = new int[var1.length];
            Statics.field2560 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field1203.length; var3++) {
                Statics.field2560[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field1575 = field907 == 0 ? 43594 : field850 + 40000;
        Statics.field844 = field907 == 0 ? 443 : field850 + 50000;
        Statics.field1289 = Statics.field1575;
        Statics.field2785 = class241.field2796;
        Statics.field2789 = class241.field2798;
        Statics.field261 = class241.field2802;
        Statics.field2790 = class241.field2797;
        Statics.field573 = new class148();
        this.method805();
        this.method916();
        Statics.field558 = this.method802();
        Statics.field2476 = new class175(255, class168.field2180, class168.field2174, 500000);
        class123 var4 = null;
        class79 var5 = new class79();
        try {
            var4 = class168.method4893("", Statics.field853.field3359, false);
            byte[] var6 = new byte[(int) var4.method2332()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method2318(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class79(new class195(var6));
        } catch (Exception var13) {
        }
        try {
            if (var4 != null) {
                var4.method2315();
            }
        } catch (Exception var12) {
        }
        Statics.field521 = var5;
        this.method803();
        class58.method2877(this, Statics.field254);
        if (field907 != 0) {
            field1076 = true;
        }
        method528(Statics.field521.field1221);
        Statics.field2030 = new class80(Statics.field613);
    }

    @ObfuscatedName("client.ap(I)V")
    public final void method865() {
        field1108++;
        this.method1147();
        while (true) {
            class218 var1 = class263.field3397;
            class260 var2;
            synchronized (class263.field3397) {
                var2 = (class260) class263.field3398.method3729();
            }
            if (var2 == null) {
                class230.method2894();
                method525();
                class52.method249();
                class61.method152();
                if (Statics.field558 != null) {
                    int var4 = Statics.field558.method683();
                    field1045 = var4;
                }
                if (field857 == 0) {
                    method1767();
                    class60.method34();
                } else if (field857 == 5) {
                    class91.method3467(this);
                    method1767();
                    class60.method34();
                } else if (field857 == 10 || field857 == 11) {
                    class91.method3467(this);
                } else if (field857 == 20) {
                    class91.method3467(this);
                    this.method1150();
                } else if (field857 == 25) {
                    method1112();
                }
                if (field857 == 30) {
                    this.method1416();
                } else if (field857 == 40 || field857 == 45) {
                    this.method1150();
                }
                return;
            }
            var2.field3370.method4311(var2.field3369, (int) var2.field2636, var2.field3368, false);
        }
    }

    @ObfuscatedName("client.ah(ZI)V")
    public final void method828(boolean arg0) {
        boolean var2 = class230.method5048();
        if (var2 && field957 && Statics.field260 != null) {
            Statics.field260.method2051();
        }
        if ((field857 == 10 || field857 == 20 || field857 == 30) && field1060 != 0L && Statics.method426() > field1060) {
            method528(method727());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field1052[var3] = true;
            }
        }
        if (field857 == 0) {
            this.method830(class91.field1342, class91.field1340, arg0);
        } else if (field857 == 5) {
            class91.method677(Statics.field32, Statics.field2260, Statics.field2261, arg0);
        } else if (field857 == 10 || field857 == 11) {
            class91.method677(Statics.field32, Statics.field2260, Statics.field2261, arg0);
        } else if (field857 == 20) {
            class91.method677(Statics.field32, Statics.field2260, Statics.field2261, arg0);
        } else if (field857 == 25) {
            if (field906 == 1) {
                if (field902 > field903) {
                    field903 = field902;
                }
                int var4 = (field903 * 50 - field902 * 50) / field903;
                Statics.method154(class252.field3032 + class87.field1297 + class87.field1300 + var4 + "%" + class87.field1301, false);
            } else if (field906 == 2) {
                if (field935 > field1088) {
                    field1088 = field935;
                }
                int var5 = (field1088 * 50 - field935 * 50) / field1088 + 50;
                Statics.method154(class252.field3032 + class87.field1297 + class87.field1300 + var5 + "%" + class87.field1301, false);
            } else {
                Statics.method154(class252.field3032, false);
            }
        } else if (field857 == 30) {
            this.method1228();
        } else if (field857 == 40) {
            Statics.method154(class252.field3121 + class87.field1297 + class252.field3034, false);
        } else if (field857 == 45) {
            Statics.method154(class252.field3180, false);
        }
        if (field857 == 30 && field1059 == 0 && !arg0 && !field1061) {
            for (int var6 = 0; var6 < field1050; var6++) {
                if (field905[var6]) {
                    Statics.field605.method793(field1055[var6], field1006[var6], field1057[var6], field998[var6]);
                    field905[var6] = false;
                }
            }
        } else if (field857 > 0) {
            Statics.field605.method780(0, 0);
            for (int var7 = 0; var7 < field1050; var7++) {
                field905[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.at(B)V")
    public final void method829() {
        if (Statics.field239.method1840()) {
            Statics.field239.method1841();
        }
        if (Statics.field776 != null) {
            Statics.field776.field796 = false;
        }
        Statics.field776 = null;
        field1073.method1914();
        class52.method246();
        if (class61.field680 != null) {
            class61 var1 = class61.field680;
            synchronized (class61.field680) {
                class61.field680 = null;
            }
        }
        Statics.field558 = null;
        if (Statics.field260 != null) {
            Statics.field260.method2052();
        }
        if (Statics.field2557 != null) {
            Statics.field2557.method2052();
        }
        if (Statics.field621 != null) {
            Statics.field621.method3022();
        }
        class263.method502();
        if (Statics.field573 != null) {
            Statics.field573.method2843();
            Statics.field573 = null;
        }
        try {
            class168.field2180.method2302();
            for (int var3 = 0; var3 < Statics.field2177; var3++) {
                Statics.field545[var3].method2302();
            }
            class168.field2174.method2302();
            class168.field2175.method2302();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("d.ea(II)V")
    public static void method153(int arg0) {
        if (field857 == arg0) {
            return;
        }
        if (field857 == 0) {
            Statics.field3013.method900();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field884 = 0;
            field885 = 0;
            field849 = 0;
            field899.method4815(arg0);
            if (arg0 != 20) {
                method1107(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field446 != null) {
            Statics.field446.method3022();
            Statics.field446 = null;
        }
        if (field857 == 25) {
            field906 = 0;
            field902 = 0;
            field903 = 1;
            field935 = 0;
            field1088 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class91.method68(Statics.field3377, Statics.field452, true, 0);
        } else if (arg0 == 20) {
            class91.method68(Statics.field3377, Statics.field452, true, field857 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class91.method68(Statics.field3377, Statics.field452, false, 4);
        } else if (Statics.field1341) {
            Statics.field1325 = null;
            Statics.field3015 = null;
            Statics.field2806 = null;
            Statics.field1388 = null;
            Statics.field2774 = null;
            Statics.field3307 = null;
            Statics.field1326 = null;
            Statics.field2036 = null;
            Statics.field1327 = null;
            Statics.field3431 = null;
            Statics.field2201 = null;
            Statics.field381 = null;
            Statics.field506 = null;
            Statics.field2118 = null;
            Statics.field449 = null;
            Statics.field2755 = null;
            Statics.field2141 = null;
            Statics.field751 = null;
            Statics.field366 = null;
            Statics.field1944 = null;
            Statics.field2671 = null;
            Statics.field627 = null;
            class230.field2675 = 1;
            Statics.field2673 = null;
            Statics.field2200 = -1;
            Statics.field2677 = -1;
            Statics.field2678 = 0;
            Statics.field1295 = false;
            Statics.field14 = 2;
            class265.method4183(true);
            Statics.field1341 = false;
        }
        field857 = arg0;
    }

    @ObfuscatedName("client.em(I)V")
    public void method1147() {
        if (field857 == 1000) {
            return;
        }
        long var1 = Statics.method426();
        int var3 = (int) (var1 - Statics.field2102);
        Statics.field2102 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class265.field3418 += var3;
        boolean var4;
        if (class265.field3422 == 0 && class265.field3417 == 0 && class265.field3420 == 0 && class265.field3415 == 0) {
            var4 = true;
        } else if (Statics.field621 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class265.field3418 > 30000) {
                        throw new IOException();
                    }
                    while (class265.field3417 < 200 && class265.field3415 > 0) {
                        class261 var5 = (class261) class265.field3413.method3667();
                        class195 var6 = new class195(4);
                        var6.method3220(1);
                        var6.method3222((int) var5.field2636);
                        Statics.field621.method3021(var6.field2544, 0, 4);
                        class265.field3416.method3669(var5, var5.field2636);
                        class265.field3415--;
                        class265.field3417++;
                    }
                    while (class265.field3422 < 200 && class265.field3420 > 0) {
                        class261 var7 = (class261) class265.field3429.method3583();
                        class195 var8 = new class195(4);
                        var8.method3220(0);
                        var8.method3222((int) var7.field2636);
                        Statics.field621.method3021(var8.field2544, 0, 4);
                        var7.method3761();
                        class265.field3421.method3669(var7, var7.field2636);
                        class265.field3420--;
                        class265.field3422++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field621.method3018();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class265.field3418 = 0;
                        byte var11 = 0;
                        if (Statics.field2173 == null) {
                            var11 = 8;
                        } else if (class265.field3425 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class265.field3424.field2545;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field621.method3020(class265.field3424.field2544, class265.field3424.field2545, var12);
                            if (class265.field3428 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class265.field3424.field2544[class265.field3424.field2545 + var13] ^= class265.field3428;
                                }
                            }
                            class265.field3424.field2545 += var12;
                            if (class265.field3424.field2545 < var11) {
                                break;
                            }
                            if (Statics.field2173 == null) {
                                class265.field3424.field2545 = 0;
                                int var14 = class265.field3424.method3236();
                                int var15 = class265.field3424.method3238();
                                int var16 = class265.field3424.method3236();
                                int var17 = class265.field3424.method3241();
                                long var18 = (long) ((var14 << 16) + var15);
                                class261 var20 = (class261) class265.field3416.method3677(var18);
                                Statics.field3423 = true;
                                if (var20 == null) {
                                    var20 = (class261) class265.field3421.method3677(var18);
                                    Statics.field3423 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2173 = var20;
                                Statics.field1661 = new class195(var17 + var21 + Statics.field2173.field3374);
                                Statics.field1661.method3220(var16);
                                Statics.field1661.method3223(var17);
                                class265.field3425 = 8;
                                class265.field3424.field2545 = 0;
                            } else if (class265.field3425 == 0) {
                                if (class265.field3424.field2544[0] == -1) {
                                    class265.field3425 = 1;
                                    class265.field3424.field2545 = 0;
                                } else {
                                    Statics.field2173 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1661.field2544.length - Statics.field2173.field3374;
                            int var23 = 512 - class265.field3425;
                            if (var23 > var22 - Statics.field1661.field2545) {
                                var23 = var22 - Statics.field1661.field2545;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field621.method3020(Statics.field1661.field2544, Statics.field1661.field2545, var23);
                            if (class265.field3428 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1661.field2544[Statics.field1661.field2545 + var24] ^= class265.field3428;
                                }
                            }
                            Statics.field1661.field2545 += var23;
                            class265.field3425 += var23;
                            if (Statics.field1661.field2545 == var22) {
                                if (Statics.field2173.field2636 == 16711935L) {
                                    Statics.field2104 = Statics.field1661;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class264 var26 = class265.field3427[var25];
                                        if (var26 != null) {
                                            Statics.field2104.field2545 = var25 * 8 + 5;
                                            int var27 = Statics.field2104.method3241();
                                            int var28 = Statics.field2104.method3241();
                                            var26.method4309(var27, var28);
                                        }
                                    }
                                } else {
                                    class265.field3426.reset();
                                    class265.field3426.update(Statics.field1661.field2544, 0, var22);
                                    int var29 = (int) class265.field3426.getValue();
                                    if (Statics.field2173.field3373 != var29) {
                                        try {
                                            Statics.field621.method3022();
                                        } catch (Exception var35) {
                                        }
                                        class265.field3430++;
                                        Statics.field621 = null;
                                        class265.field3428 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class265.field3430 = 0;
                                    class265.field3414 = 0;
                                    Statics.field2173.field3375.method4316((int) (Statics.field2173.field2636 & 0xFFFFL), Statics.field1661.field2544, (Statics.field2173.field2636 & 0xFF0000L) == 16711680L, Statics.field3423);
                                }
                                Statics.field2173.method3721();
                                if (Statics.field3423) {
                                    class265.field3417--;
                                } else {
                                    class265.field3422--;
                                }
                                class265.field3425 = 0;
                                Statics.field2173 = null;
                                Statics.field1661 = null;
                            } else {
                                if (class265.field3425 != 512) {
                                    break;
                                }
                                class265.field3425 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field621.method3022();
                } catch (Exception var34) {
                }
                class265.field3414++;
                Statics.field621 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1148();
        }
    }

    @ObfuscatedName("client.er(I)V")
    public void method1148() {
        if (class265.field3430 >= 4) {
            this.method822("js5crc");
            field857 = 1000;
            return;
        }
        if (class265.field3414 >= 4) {
            if (field857 <= 5) {
                this.method822("js5io");
                field857 = 1000;
                return;
            }
            field880 = 3000;
            class265.field3414 = 3;
        }
        if (--field880 + 1 > 0) {
            return;
        }
        try {
            if (field879 == 0) {
                Statics.field939 = Statics.field675.method2974(Statics.field277, Statics.field1289);
                field879++;
            }
            if (field879 == 1) {
                if (Statics.field939.field2161 == 2) {
                    this.method1149(-1);
                    return;
                }
                if (Statics.field939.field2161 == 1) {
                    field879++;
                }
            }
            if (field879 == 2) {
                if (field1068) {
                    Socket var1 = (Socket) Statics.field939.field2165;
                    class172 var2 = new class172(var1, 40000, 5000);
                    Statics.field2194 = var2;
                } else {
                    Statics.field2194 = new class174((Socket) Statics.field939.field2165, Statics.field675, 5000);
                }
                class195 var3 = new class195(5);
                var3.method3220(15);
                var3.method3223(166);
                Statics.field2194.method3021(var3.field2544, 0, 5);
                field879++;
                Statics.field2975 = Statics.method426();
            }
            if (field879 == 3) {
                if (Statics.field2194.method3018() > 0 || !field1068 && field857 <= 5) {
                    int var4 = Statics.field2194.method3019();
                    if (var4 != 0) {
                        this.method1149(var4);
                        return;
                    }
                    field879++;
                } else if (Statics.method426() - Statics.field2975 > 30000L) {
                    this.method1149(-2);
                    return;
                }
            }
            if (field879 == 4) {
                class265.method2975(Statics.field2194, field857 > 20);
                Statics.field939 = null;
                Statics.field2194 = null;
                field879 = 0;
                field883 = 0;
            }
        } catch (IOException var6) {
            this.method1149(-3);
        }
    }

    @ObfuscatedName("client.eh(II)V")
    public void method1149(int arg0) {
        Statics.field939 = null;
        Statics.field2194 = null;
        field879 = 0;
        if (Statics.field1575 == Statics.field1289) {
            Statics.field1289 = Statics.field844;
        } else {
            Statics.field1289 = Statics.field1575;
        }
        field883++;
        if (field883 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field857 <= 5) {
                this.method822("js5connect_full");
                field857 = 1000;
            } else {
                field880 = 3000;
            }
        } else if (field883 >= 2 && arg0 == 6) {
            this.method822("js5connect_outofdate");
            field857 = 1000;
        } else if (field883 >= 4) {
            if (field857 <= 5) {
                this.method822("js5connect");
                field857 = 1000;
            } else {
                field880 = 3000;
            }
        }
    }

    @ObfuscatedName("bx.ex(Lju;Ljava/lang/String;B)V")
    public static void method1047(class264 arg0, String arg1) {
        class65 var2 = new class65(arg0, arg1);
        field1024.add(var2);
    }

    @ObfuscatedName("cd.fg(I)V")
    public static void method1767() {
        if (field877 == 0) {
            Statics.field495 = new class138(4, 104, 104, class63.field707);
            for (int var0 = 0; var0 < 4; var0++) {
                field867[var0] = new class177(104, 104);
            }
            Statics.field292 = new class332(512, 512);
            class91.field1340 = class252.field3035;
            class91.field1342 = 5;
            field877 = 20;
        } else if (field877 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class135.field1935[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class138.method2787(var1, 500, 800, 512, 334);
            class91.field1340 = class252.field3036;
            class91.field1342 = 10;
            field877 = 30;
        } else if (field877 == 30) {
            Statics.field1220 = method347(0, false, true, true);
            Statics.field1311 = method347(1, false, true, true);
            Statics.field881 = method347(2, true, false, true);
            Statics.field3922 = method347(3, false, true, true);
            Statics.field399 = method347(4, false, true, true);
            Statics.field1908 = method347(5, true, true, true);
            Statics.field3547 = method347(6, true, true, true);
            Statics.field2770 = method347(7, false, true, true);
            Statics.field452 = method347(8, false, true, true);
            Statics.field722 = method347(9, false, true, true);
            Statics.field3377 = method347(10, false, true, true);
            Statics.field629 = method347(11, false, true, true);
            Statics.field236 = method347(12, false, true, true);
            Statics.field930 = method347(13, true, false, true);
            Statics.field3880 = method347(14, false, true, true);
            Statics.field736 = method347(15, false, true, true);
            Statics.field2565 = method347(16, true, true, true);
            class91.field1340 = class252.field3037;
            class91.field1342 = 20;
            field877 = 40;
        } else if (field877 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1220.method4305() * 4 / 100;
            int var8 = var7 + Statics.field1311.method4305() * 4 / 100;
            int var9 = var8 + Statics.field881.method4305() * 2 / 100;
            int var10 = var9 + Statics.field3922.method4305() * 2 / 100;
            int var11 = var10 + Statics.field399.method4305() * 6 / 100;
            int var12 = var11 + Statics.field1908.method4305() * 4 / 100;
            int var13 = var12 + Statics.field3547.method4305() * 2 / 100;
            int var14 = var13 + Statics.field2770.method4305() * 58 / 100;
            int var15 = var14 + Statics.field452.method4305() * 2 / 100;
            int var16 = var15 + Statics.field722.method4305() * 2 / 100;
            int var17 = var16 + Statics.field3377.method4305() * 2 / 100;
            int var18 = var17 + Statics.field629.method4305() * 2 / 100;
            int var19 = var18 + Statics.field236.method4305() * 2 / 100;
            int var20 = var19 + Statics.field930.method4305() * 2 / 100;
            int var21 = var20 + Statics.field3880.method4305() * 2 / 100;
            int var22 = var21 + Statics.field736.method4305() * 2 / 100;
            int var23 = var22 + Statics.field2565.method4305() * 2 / 100;
            if (var23 == 100) {
                method1047(Statics.field1220, "Animations");
                method1047(Statics.field1311, "Skeletons");
                method1047(Statics.field399, "Sound FX");
                method1047(Statics.field1908, "Maps");
                method1047(Statics.field3547, "Music Tracks");
                method1047(Statics.field2770, "Models");
                method1047(Statics.field452, "Sprites");
                method1047(Statics.field629, "Music Jingles");
                method1047(Statics.field3880, "Music Samples");
                method1047(Statics.field736, "Music Patches");
                method1047(Statics.field2565, "World Map");
                class91.field1340 = class252.field3097;
                class91.field1342 = 30;
                field877 = 45;
            } else {
                if (var23 != 0) {
                    class91.field1340 = class252.field3038 + var23 + "%";
                }
                class91.field1342 = 30;
            }
        } else if (field877 == 45) {
            boolean var24 = !field855;
            Statics.field1558 = 22050;
            Statics.field1537 = var24;
            Statics.field2497 = 2;
            class231 var25 = new class231();
            var25.method3849(9, 128);
            Statics.field260 = class108.method527(Statics.field675, 0, 22050);
            Statics.field260.method2048(var25);
            class230.method2370(Statics.field736, Statics.field3880, Statics.field399, var25);
            Statics.field2557 = class108.method527(Statics.field675, 1, 2048);
            Statics.field3885 = new class101();
            Statics.field2557.method2048(Statics.field3885);
            Statics.field524 = new class115(22050, Statics.field1558);
            class91.field1340 = class252.field3091;
            class91.field1342 = 35;
            field877 = 50;
            Statics.field989 = new class311(Statics.field452, Statics.field930);
        } else if (field877 == 50) {
            int var26 = class310.method5050().length;
            field901 = Statics.field989.method5052(class310.method5050());
            if (field901.size() < var26) {
                class91.field1340 = class252.field3028 + field901.size() * 100 / var26 + "%";
                class91.field1342 = 40;
            } else {
                Statics.field2260 = (class312) field901.get(class310.field3876);
                Statics.field2261 = (class312) field901.get(class310.field3877);
                Statics.field32 = (class312) field901.get(class310.field3884);
                Statics.field256 = new class338(true);
                class91.field1340 = class252.field3042;
                class91.field1342 = 40;
                field877 = 60;
            }
        } else if (field877 == 60) {
            int var27 = Statics.method4671(Statics.field3377, Statics.field452);
            byte var28 = 11;
            if (var27 < var28) {
                class91.field1340 = class252.field3043 + var27 * 100 / var28 + "%";
                class91.field1342 = 50;
            } else {
                class91.field1340 = class252.field3249;
                class91.field1342 = 50;
                method153(5);
                field877 = 70;
            }
        } else if (field877 == 70) {
            if (Statics.field881.method4197()) {
                class287.method4177(Statics.field881);
                class264 var30 = Statics.field881;
                Statics.field3506 = var30;
                class264 var31 = Statics.field881;
                class264 var32 = Statics.field2770;
                Statics.field2805 = var31;
                Statics.field3520 = var32;
                Statics.field3514 = Statics.field2805.method4204(3);
                class283.method2056(Statics.field881, Statics.field2770, field855);
                class286.method4567(Statics.field881, Statics.field2770);
                class280.method5147(Statics.field881);
                class264 var33 = Statics.field881;
                class264 var34 = Statics.field2770;
                boolean var35 = field854;
                class312 var36 = Statics.field2260;
                Statics.field3667 = var33;
                Statics.field3650 = var34;
                Statics.field296 = var35;
                Statics.field285 = Statics.field3667.method4204(10);
                Statics.field1591 = var36;
                class264 var37 = Statics.field881;
                class264 var38 = Statics.field1220;
                class264 var39 = Statics.field1311;
                Statics.field12 = var37;
                Statics.field3759 = var38;
                Statics.field3765 = var39;
                class264 var40 = Statics.field881;
                class264 var41 = Statics.field2770;
                Statics.field3504 = var40;
                Statics.field3490 = var41;
                class264 var42 = Statics.field881;
                Statics.field3544 = var42;
                class269.method340(Statics.field881);
                class264 var43 = Statics.field3922;
                class264 var44 = Statics.field2770;
                class264 var45 = Statics.field452;
                class264 var46 = Statics.field930;
                Statics.field2849 = var43;
                Statics.field3825 = var44;
                Statics.field1418 = var45;
                Statics.field619 = var46;
                Statics.field2810 = new class243[Statics.field2849.method4205()][];
                Statics.field264 = new boolean[Statics.field2849.method4205()];
                class268.method3489(Statics.field881);
                class281.method1509(Statics.field881);
                class264 var47 = Statics.field881;
                Statics.field3481 = var47;
                class272.method669(Statics.field881);
                class264 var48 = Statics.field881;
                Statics.field3552 = var48;
                Statics.field239 = new class95();
                class264 var49 = Statics.field881;
                class264 var50 = Statics.field452;
                class264 var51 = Statics.field930;
                Statics.field3586 = var49;
                Statics.field3572 = var50;
                Statics.field3573 = var51;
                class276.method4180(Statics.field881, Statics.field452);
                class264 var52 = Statics.field881;
                class264 var53 = Statics.field452;
                Statics.field3467 = var53;
                if (var52.method4197()) {
                    Statics.field3456 = var52.method4204(35);
                    Statics.field3455 = new class270[Statics.field3456];
                    for (int var54 = 0; var54 < Statics.field3456; var54++) {
                        byte[] var55 = var52.method4265(35, var54);
                        if (var55 != null) {
                            Statics.field3455[var54] = new class270(var54);
                            Statics.field3455[var54].method4381(new class195(var55));
                            Statics.field3455[var54].method4395();
                        }
                    }
                }
                class91.field1340 = class252.field3232;
                class91.field1342 = 60;
                field877 = 80;
            } else {
                class91.field1340 = class252.field3144 + Statics.field881.method4313() + "%";
                class91.field1342 = 60;
            }
        } else if (field877 == 80) {
            int var56 = 0;
            if (Statics.field333 == null) {
                class264 var57 = Statics.field452;
                int var58 = var57.method4210("compass");
                int var59 = var57.method4211(var58, "");
                class332 var60 = class333.method2(var57, var58, var59);
                Statics.field333 = var60;
            } else {
                var56++;
            }
            if (Statics.field559 == null) {
                class264 var61 = Statics.field452;
                int var62 = var61.method4210("mapedge");
                int var63 = var61.method4211(var62, "");
                class332 var64 = class333.method2(var61, var62, var63);
                Statics.field559 = var64;
            } else {
                var56++;
            }
            if (Statics.field3932 == null) {
                Statics.field3932 = class333.method291(Statics.field452, "mapscene", "");
            } else {
                var56++;
            }
            if (Statics.field738 == null) {
                Statics.field738 = class333.method4483(Statics.field452, "headicons_pk", "");
            } else {
                var56++;
            }
            if (Statics.field249 == null) {
                Statics.field249 = class333.method4483(Statics.field452, "headicons_prayer", "");
            } else {
                var56++;
            }
            if (Statics.field2759 == null) {
                Statics.field2759 = class333.method4483(Statics.field452, "headicons_hint", "");
            } else {
                var56++;
            }
            if (Statics.field724 == null) {
                Statics.field724 = class333.method4483(Statics.field452, "mapmarker", "");
            } else {
                var56++;
            }
            if (Statics.field315 == null) {
                Statics.field315 = class333.method4483(Statics.field452, "cross", "");
            } else {
                var56++;
            }
            if (Statics.field1823 == null) {
                Statics.field1823 = class333.method4483(Statics.field452, "mapdots", "");
            } else {
                var56++;
            }
            if (Statics.field496 == null) {
                Statics.field496 = class333.method291(Statics.field452, "scrollbar", "");
            } else {
                var56++;
            }
            if (Statics.field2123 == null) {
                Statics.field2123 = class333.method291(Statics.field452, "mod_icons", "");
            } else {
                var56++;
            }
            if (var56 < 11) {
                class91.field1340 = class252.field3047 + var56 * 100 / 12 + "%";
                class91.field1342 = 70;
            } else {
                Statics.field3909 = Statics.field2123;
                Statics.field559.method5480();
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3932[0].method5380(var65 + var68, var66 + var68, var67 + var68);
                class91.field1340 = class252.field3039;
                class91.field1342 = 70;
                field877 = 90;
            }
        } else if (field877 == 90) {
            if (Statics.field722.method4197()) {
                Statics.field337 = new class124(Statics.field722, Statics.field452, 20, 0.8D, field855 ? 64 : 128);
                class135.method2581(Statics.field337);
                class135.method2562(0.8D);
                field877 = 100;
            } else {
                class91.field1340 = class252.field3086 + "0%";
                class91.field1342 = 90;
            }
        } else if (field877 == 100) {
            int var69 = Statics.field337.method2346();
            if (var69 < 100) {
                class91.field1340 = class252.field3086 + var69 + "%";
                class91.field1342 = 90;
            } else {
                class91.field1340 = class252.field3050;
                class91.field1342 = 90;
                field877 = 110;
            }
        } else if (field877 == 110) {
            Statics.field776 = new class70();
            Statics.field675.method2972(Statics.field776, 10);
            class91.field1340 = class252.field3297;
            class91.field1342 = 92;
            field877 = 120;
        } else if (field877 == 120) {
            if (Statics.field3377.method4214("huffman", "")) {
                class187 var70 = new class187(Statics.field3377.method4213("huffman", ""));
                Statics.field3913 = var70;
                class91.field1340 = class252.field3053;
                class91.field1342 = 94;
                field877 = 130;
            } else {
                class91.field1340 = class252.field3045 + "%";
                class91.field1342 = 94;
            }
        } else if (field877 == 130) {
            if (!Statics.field3922.method4197()) {
                class91.field1340 = class252.field3102 + Statics.field3922.method4313() * 4 / 5 + "%";
                class91.field1342 = 96;
            } else if (!Statics.field236.method4197()) {
                class91.field1340 = class252.field3102 + (80 + Statics.field236.method4313() / 6) + "%";
                class91.field1342 = 96;
            } else if (Statics.field930.method4197()) {
                class91.field1340 = class252.field3298;
                class91.field1342 = 98;
                field877 = 140;
            } else {
                class91.field1340 = class252.field3102 + (96 + Statics.field930.method4313() / 50) + "%";
                class91.field1342 = 96;
            }
        } else if (field877 == 140) {
            class91.field1342 = 100;
            if (Statics.field2565.method4288(class42.field526.field527)) {
                if (Statics.field3306 == null) {
                    Statics.field3306 = new class335();
                    Statics.field3306.method5544(Statics.field2565, Statics.field32, field901, Statics.field3932);
                }
                int var71 = Statics.field3306.method5567();
                if (var71 < 100) {
                    class91.field1340 = class252.field3056 + (var71 * 9 / 10 + 10) + "%";
                } else {
                    class91.field1340 = class252.field3057;
                    field877 = 150;
                }
            } else {
                class91.field1340 = class252.field3056 + Statics.field2565.method4271(class42.field526.field527) / 10 + "%";
            }
        } else if (field877 == 150) {
            method153(10);
        }
    }

    @ObfuscatedName("ah.fp(IZZZI)Lju;")
    public static class264 method347(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class175 var4 = null;
        if (class168.field2180 != null) {
            var4 = new class175(arg0, class168.field2180, Statics.field545[arg0], 1000000);
        }
        return new class264(var4, Statics.field2476, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ff(B)V")
    public final void method1150() {
        class170 var1 = field1073.method1915();
        class202 var2 = field1073.field1460;
        try {
            if (field884 == 0) {
                if (var1 != null) {
                    var1.method3022();
                    var1 = null;
                }
                Statics.field2599 = null;
                field897 = false;
                field885 = 0;
                field884 = 1;
            }
            if (field884 == 1) {
                if (Statics.field2599 == null) {
                    Statics.field2599 = Statics.field675.method2974(Statics.field277, Statics.field1289);
                }
                if (Statics.field2599.field2161 == 2) {
                    throw new IOException();
                }
                if (Statics.field2599.field2161 == 1) {
                    if (field1068) {
                        Socket var3 = (Socket) Statics.field2599.field2165;
                        class172 var4 = new class172(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class174((Socket) Statics.field2599.field2165, Statics.field675, 5000);
                    }
                    field1073.method1913(var1);
                    Statics.field2599 = null;
                    field884 = 2;
                }
            }
            if (field884 == 2) {
                field1073.method1910();
                class185 var5 = class185.method2856();
                var5.field2478.method3220(class183.field2454.field2452);
                field1073.method1916(var5);
                field1073.method1920();
                var2.field2545 = 0;
                field884 = 3;
            }
            if (field884 == 3) {
                if (Statics.field260 != null) {
                    Statics.field260.method2050();
                }
                if (Statics.field2557 != null) {
                    Statics.field2557.method2050();
                }
                boolean var6 = true;
                if (field1068 && !var1.method3017(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3019();
                    if (Statics.field260 != null) {
                        Statics.field260.method2050();
                    }
                    if (Statics.field2557 != null) {
                        Statics.field2557.method2050();
                    }
                    if (var7 != 0) {
                        method17(var7);
                        return;
                    }
                    var2.field2545 = 0;
                    field884 = 4;
                }
            }
            if (field884 == 4) {
                if (var2.field2545 < 8) {
                    int var8 = var1.method3018();
                    if (var8 > 8 - var2.field2545) {
                        var8 = 8 - var2.field2545;
                    }
                    if (var8 > 0) {
                        var1.method3020(var2.field2544, var2.field2545, var8);
                        var2.field2545 += var8;
                    }
                }
                if (var2.field2545 == 8) {
                    var2.field2545 = 0;
                    Statics.field1947 = var2.method3315();
                    field884 = 5;
                }
            }
            if (field884 == 5) {
                field1073.field1460.field2545 = 0;
                field1073.method1910();
                class202 var9 = new class202(500);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field1947 >> 32), (int) (Statics.field1947 & 0xFFFFFFFFFFFFFFFFL) };
                var9.field2545 = 0;
                var9.method3220(1);
                var9.method3220(field888.method12());
                var9.method3223(var10[0]);
                var9.method3223(var10[1]);
                var9.method3223(var10[2]);
                var9.method3223(var10[3]);
                switch(field888.field2129) {
                    case 0:
                    case 2:
                        var9.method3222(Statics.field1252);
                        var9.field2545 += 5;
                        break;
                    case 1:
                        var9.method3223((Integer) Statics.field521.field1228.get(class319.method4807(class91.field1346)));
                        var9.field2545 += 4;
                        break;
                    case 3:
                        var9.field2545 += 8;
                }
                var9.method3232(class91.field1347);
                var9.method3258(class89.field1315, class89.field1316);
                class185 var11;
                if (class185.field2474 == 0) {
                    var11 = new class185();
                } else {
                    var11 = class185.field2480[--class185.field2474];
                }
                var11.field2472 = null;
                var11.field2470 = 0;
                var11.field2478 = new class202(5000);
                var11.field2478.field2545 = 0;
                if (field857 == 40) {
                    var11.field2478.method3220(class183.field2448.field2452);
                } else {
                    var11.field2478.method3220(class183.field2450.field2452);
                }
                var11.field2478.method3323(0);
                int var15 = var11.field2478.field2545;
                var11.field2478.method3223(166);
                var11.field2478.method3230(var9.field2544, 0, var9.field2545);
                int var16 = var11.field2478.field2545;
                var11.field2478.method3232(class91.field1346);
                var11.field2478.method3220((field1061 ? 1 : 0) << 1 | (field855 ? 1 : 0));
                var11.field2478.method3323(Statics.field2021);
                var11.field2478.method3323(Statics.field659);
                method20(var11.field2478);
                var11.field2478.method3232(Statics.field1387);
                var11.field2478.method3223(Statics.field3559);
                class195 var17 = new class195(Statics.field256.method5746());
                Statics.field256.method5739(var17);
                var11.field2478.method3230(var17.field2544, 0, var17.field2544.length);
                var11.field2478.method3220(Statics.field740);
                var11.field2478.method3223(0);
                var11.field2478.method3223(Statics.field1220.field3392);
                var11.field2478.method3223(Statics.field1311.field3392);
                var11.field2478.method3223(Statics.field881.field3392);
                var11.field2478.method3223(Statics.field3922.field3392);
                var11.field2478.method3223(Statics.field399.field3392);
                var11.field2478.method3223(Statics.field1908.field3392);
                var11.field2478.method3223(Statics.field3547.field3392);
                var11.field2478.method3223(Statics.field2770.field3392);
                var11.field2478.method3223(Statics.field452.field3392);
                var11.field2478.method3223(Statics.field722.field3392);
                var11.field2478.method3223(Statics.field3377.field3392);
                var11.field2478.method3223(Statics.field629.field3392);
                var11.field2478.method3223(Statics.field236.field3392);
                var11.field2478.method3223(Statics.field930.field3392);
                var11.field2478.method3223(Statics.field3880.field3392);
                var11.field2478.method3223(Statics.field736.field3392);
                var11.field2478.method3223(Statics.field2565.field3392);
                var11.field2478.method3268(var10, var16, var11.field2478.field2545);
                var11.field2478.method3380(var11.field2478.field2545 - var15);
                field1073.method1916(var11);
                field1073.method1920();
                field1073.field1457 = new class203(var10);
                for (int var18 = 0; var18 < 4; var18++) {
                    var10[var18] += 50;
                }
                var2.method3508(var10);
                field884 = 6;
            }
            if (field884 == 6 && var1.method3018() > 0) {
                int var19 = var1.method3019();
                if (var19 == 21 && field857 == 20) {
                    field884 = 7;
                } else if (var19 == 2) {
                    field884 = 9;
                } else if (var19 == 15 && field857 == 40) {
                    field1073.field1453 = -1;
                    field884 = 13;
                } else if (var19 == 23 && field849 < 1) {
                    field849++;
                    field884 = 0;
                } else if (var19 == 29) {
                    field884 = 11;
                } else {
                    method17(var19);
                    return;
                }
            }
            if (field884 == 7 && var1.method3018() > 0) {
                field887 = (var1.method3019() + 3) * 60;
                field884 = 8;
            }
            if (field884 == 8) {
                field885 = 0;
                class91.method1819(class252.field3212, class252.field3226, field887 / 60 + class252.field3063);
                if (--field887 <= 0) {
                    field884 = 0;
                }
            } else {
                if (field884 == 9 && var1.method3018() >= 13) {
                    boolean var20 = var1.method3019() == 1;
                    var1.method3020(var2.field2544, 0, 4);
                    var2.field2545 = 0;
                    boolean var21 = false;
                    if (var20) {
                        int var22 = var2.method3495() << 24;
                        int var23 = var22 | var2.method3495() << 16;
                        int var24 = var23 | var2.method3495() << 8;
                        int var25 = var24 | var2.method3495();
                        String var26 = class91.field1346;
                        int var27 = var26.length();
                        int var28 = 0;
                        int var29 = 0;
                        while (true) {
                            if (var29 >= var27) {
                                if (Statics.field521.field1228.size() >= 10 && !Statics.field521.field1228.containsKey(var28)) {
                                    Iterator var32 = Statics.field521.field1228.entrySet().iterator();
                                    var32.next();
                                    var32.remove();
                                }
                                Statics.field521.field1228.put(var28, var25);
                                break;
                            }
                            var28 = (var28 << 5) - var28 + var26.charAt(var29);
                            var29++;
                        }
                    }
                    if (class91.field1348) {
                        Statics.field521.field1226 = class91.field1346;
                    } else {
                        Statics.field521.field1226 = null;
                    }
                    class79.method499();
                    field936 = var1.method3019();
                    field1018 = var1.method3019() == 1;
                    field1056 = var1.method3019();
                    field1056 <<= 0x8;
                    field1056 += var1.method3019();
                    field967 = var1.method3019();
                    var1.method3020(var2.field2544, 0, 1);
                    var2.field2545 = 0;
                    class181[] var33 = new class181[] { class181.field2304, class181.field2263, class181.field2264, class181.field2332, class181.field2266, class181.field2267, class181.field2295, class181.field2298, class181.field2281, class181.field2271, class181.field2272, class181.field2278, class181.field2274, class181.field2265, class181.field2276, class181.field2268, class181.field2306, class181.field2279, class181.field2280, class181.field2269, class181.field2282, class181.field2283, class181.field2284, class181.field2285, class181.field2286, class181.field2287, class181.field2288, class181.field2296, class181.field2290, class181.field2291, class181.field2277, class181.field2293, class181.field2294, class181.field2311, class181.field2337, class181.field2297, class181.field2301, class181.field2321, class181.field2339, class181.field2317, class181.field2302, class181.field2299, class181.field2275, class181.field2305, class181.field2331, class181.field2307, class181.field2308, class181.field2309, class181.field2314, class181.field2273, class181.field2312, class181.field2313, class181.field2329, class181.field2315, class181.field2316, class181.field2322, class181.field2318, class181.field2319, class181.field2320, class181.field2343, class181.field2303, class181.field2323, class181.field2324, class181.field2325, class181.field2326, class181.field2327, class181.field2328, class181.field2300, class181.field2330, class181.field2270, class181.field2310, class181.field2333, class181.field2334, class181.field2335, class181.field2336, class181.field2292, class181.field2338, class181.field2289, class181.field2340, class181.field2341, class181.field2342, class181.field2262, class181.field2344, class181.field2345 };
                    int var35 = var2.method3515();
                    if (var35 < 0 || var35 >= var33.length) {
                        throw new IOException(var35 + " " + var2.field2545);
                    }
                    field1073.field1459 = var33[var35];
                    field1073.field1453 = field1073.field1459.field2347;
                    var1.method3020(var2.field2544, 0, 2);
                    var2.field2545 = 0;
                    field1073.field1453 = var2.method3238();
                    try {
                        class54.method729(Statics.field3013, "zap");
                    } catch (Throwable var57) {
                    }
                    field884 = 10;
                }
                if (field884 != 10) {
                    if (field884 == 11 && var1.method3018() >= 2) {
                        var2.field2545 = 0;
                        var1.method3020(var2.field2544, 0, 2);
                        var2.field2545 = 0;
                        Statics.field343 = var2.method3238();
                        field884 = 12;
                    }
                    if (field884 == 12 && var1.method3018() >= Statics.field343) {
                        var2.field2545 = 0;
                        var1.method3020(var2.field2544, 0, Statics.field343);
                        var2.field2545 = 0;
                        String var52 = var2.method3257();
                        String var53 = var2.method3257();
                        String var54 = var2.method3257();
                        class91.method1819(var52, var53, var54);
                        method153(10);
                    }
                    if (field884 == 13) {
                        if (field1073.field1453 == -1) {
                            if (var1.method3018() < 2) {
                                return;
                            }
                            var1.method3020(var2.field2544, 0, 2);
                            var2.field2545 = 0;
                            field1073.field1453 = var2.method3238();
                        }
                        if (var1.method3018() >= field1073.field1453) {
                            var1.method3020(var2.field2544, 0, field1073.field1453);
                            var2.field2545 = 0;
                            int var55 = field1073.field1453;
                            field899.method4817();
                            method161();
                            Statics.method1081(var2);
                            if (var2.field2545 != var55) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field885++;
                        if (field885 > 2000) {
                            if (field849 < 1) {
                                if (Statics.field1575 == Statics.field1289) {
                                    Statics.field1289 = Statics.field844;
                                } else {
                                    Statics.field1289 = Statics.field1575;
                                }
                                field849++;
                                field884 = 0;
                            } else {
                                method17(-3);
                            }
                        }
                    }
                } else if (var1.method3018() >= field1073.field1453) {
                    var2.field2545 = 0;
                    var1.method3020(var2.field2544, 0, field1073.field1453);
                    field899.method4834();
                    field860 = 1L;
                    field1008 = -1;
                    Statics.field776.field799 = 0;
                    Statics.field2551 = true;
                    field864 = true;
                    field1071 = -1L;
                    class327.field3956 = new class216();
                    field1073.method1910();
                    field1073.field1460.field2545 = 0;
                    field1073.field1459 = null;
                    field1073.field1464 = null;
                    field1073.field1458 = null;
                    field1073.field1466 = null;
                    field1073.field1453 = 0;
                    field1073.field1465 = 0;
                    field866 = 0;
                    field1037 = 0;
                    field949 = 0;
                    method118();
                    class61.field696 = 0;
                    class96.method3064();
                    field1002 = 0;
                    field934 = false;
                    field1085 = 0;
                    field919 = 0;
                    field924 = 0;
                    Statics.field1468 = null;
                    field1004 = 0;
                    field1072 = -1;
                    field1077 = 0;
                    field904 = 0;
                    field875 = class90.field1320;
                    field876 = class90.field1320;
                    field865 = 0;
                    class94.method3840();
                    for (int var37 = 0; var37 < 2048; var37++) {
                        field965[var37] = null;
                    }
                    for (int var38 = 0; var38 < 32768; var38++) {
                        field975[var38] = null;
                    }
                    field891 = -1;
                    field1078.method3726();
                    field980.method3726();
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 104; var40++) {
                            for (int var41 = 0; var41 < 104; var41++) {
                                field886[var39][var40][var41] = null;
                            }
                        }
                    }
                    field978 = new class218();
                    Statics.field2030.method1584();
                    for (int var42 = 0; var42 < Statics.field3449; var42++) {
                        class269 var43 = class269.method1161(var42);
                        if (var43 != null) {
                            class238.field2773[var42] = 0;
                            class238.field2771[var42] = 0;
                        }
                    }
                    Statics.field239.method1836();
                    field1017 = -1;
                    if (field1009 != -1) {
                        int var44 = field1009;
                        if (var44 != -1 && Statics.field264[var44]) {
                            Statics.field2849.method4217(var44);
                            if (Statics.field2810[var44] != null) {
                                boolean var45 = true;
                                for (int var46 = 0; var46 < Statics.field2810[var44].length; var46++) {
                                    if (Statics.field2810[var44][var46] != null) {
                                        if (Statics.field2810[var44][var46].field2820 == 2) {
                                            var45 = false;
                                        } else {
                                            Statics.field2810[var44][var46] = null;
                                        }
                                    }
                                }
                                if (var45) {
                                    Statics.field2810[var44] = null;
                                }
                                Statics.field264[var44] = false;
                            }
                        }
                    }
                    for (class68 var47 = (class68) field1010.method3667(); var47 != null; var47 = (class68) field1010.method3672()) {
                        Statics.method1828(var47, true);
                    }
                    field1009 = -1;
                    field1010 = new class215(8);
                    field1013 = null;
                    method118();
                    field1110.method4067((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var48 = 0; var48 < 8; var48++) {
                        field973[var48] = null;
                        field1082[var48] = false;
                    }
                    class66.method2845();
                    field950 = true;
                    for (int var49 = 0; var49 < 100; var49++) {
                        field1052[var49] = true;
                    }
                    class185 var50 = class185.method343(class182.field2428, field1073.field1457);
                    var50.field2478.method3220(method727());
                    var50.field2478.method3323(Statics.field2021);
                    var50.field2478.method3323(Statics.field659);
                    field1073.method1916(var50);
                    Statics.field616 = null;
                    for (int var51 = 0; var51 < 8; var51++) {
                        field1113[var51] = new class17();
                    }
                    Statics.field2062 = null;
                    Statics.method1081(var2);
                    Statics.field582 = -1;
                    method175(false, var2);
                    field1073.field1459 = null;
                }
            }
        } catch (IOException var58) {
            if (field849 < 1) {
                if (Statics.field1575 == Statics.field1289) {
                    Statics.field1289 = Statics.field844;
                } else {
                    Statics.field1289 = Statics.field1575;
                }
                field849++;
                field884 = 0;
            } else {
                method17(-2);
            }
        }
    }

    @ObfuscatedName("f.fe(I)V")
    public static void method161() {
        field1073.method1910();
        field1073.field1460.field2545 = 0;
        field1073.field1459 = null;
        field1073.field1464 = null;
        field1073.field1458 = null;
        field1073.field1466 = null;
        field1073.field1453 = 0;
        field1073.field1465 = 0;
        field866 = 0;
        method118();
        field1004 = 0;
        field1077 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field965[var0] = null;
        }
        Statics.field434 = null;
        for (int var1 = 0; var1 < field975.length; var1++) {
            class85 var2 = field975[var1];
            if (var2 != null) {
                var2.field1164 = -1;
                var2.field1189 = false;
            }
        }
        class66.method2845();
        method153(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1052[var3] = true;
        }
        class185 var4 = class185.method343(class182.field2428, field1073.field1457);
        var4.field2478.method3220(method727());
        var4.field2478.method3323(Statics.field2021);
        var4.field2478.method3323(Statics.field659);
        field1073.method1916(var4);
    }

    @ObfuscatedName("e.fk(II)V")
    public static void method17(int arg0) {
        if (arg0 == -3) {
            class91.method1819(class252.field3064, class252.field3065, class252.field3066);
        } else if (arg0 == -2) {
            class91.method1819(class252.field3167, class252.field3068, class252.field3069);
        } else if (arg0 == -1) {
            class91.method1819(class252.field3070, class252.field3071, class252.field3098);
        } else if (arg0 == 3) {
            class91.field1330 = 3;
        } else if (arg0 == 4) {
            class91.method1819(class252.field3215, class252.field3074, class252.field3238);
        } else if (arg0 == 5) {
            class91.method1819(class252.field3040, class252.field3077, class252.field3078);
        } else if (arg0 == 6) {
            class91.method1819(class252.field3079, class252.field3080, class252.field3089);
        } else if (arg0 == 7) {
            class91.method1819(class252.field3082, class252.field3083, class252.field3084);
        } else if (arg0 == 8) {
            class91.method1819(class252.field3085, class252.field3250, class252.field3087);
        } else if (arg0 == 9) {
            class91.method1819(class252.field3275, class252.field3170, class252.field3168);
        } else if (arg0 == 10) {
            class91.method1819(class252.field3197, class252.field3092, class252.field3093);
        } else if (arg0 == 11) {
            class91.method1819(class252.field3094, class252.field3095, class252.field3096);
        } else if (arg0 == 12) {
            class91.method1819(class252.field3026, class252.field3114, class252.field3099);
        } else if (arg0 == 13) {
            class91.method1819(class252.field3267, class252.field3101, class252.field3186);
        } else if (arg0 == 14) {
            class91.method1819(class252.field3103, class252.field3104, class252.field3105);
        } else if (arg0 == 16) {
            class91.method1819(class252.field3179, class252.field3107, class252.field3221);
        } else if (arg0 == 17) {
            class91.method1819(class252.field3109, class252.field3110, class252.field3111);
        } else if (arg0 == 18) {
            class91.method1819(class252.field3112, class252.field3113, class252.field3206);
        } else if (arg0 == 19) {
            class91.method1819(class252.field3076, class252.field3116, class252.field3100);
        } else if (arg0 == 20) {
            class91.method1819(class252.field3118, class252.field3119, class252.field3282);
        } else if (arg0 == 22) {
            class91.method1819(class252.field3189, class252.field3184, class252.field3123);
        } else if (arg0 == 23) {
            class91.method1819(class252.field3136, class252.field3294, class252.field3067);
        } else if (arg0 == 24) {
            class91.method1819(class252.field3127, class252.field3128, class252.field3023);
        } else if (arg0 == 25) {
            class91.method1819(class252.field3130, class252.field3131, class252.field3132);
        } else if (arg0 == 26) {
            class91.method1819(class252.field3133, class252.field3134, class252.field3135);
        } else if (arg0 == 27) {
            class91.method1819(class252.field3059, class252.field3137, class252.field3138);
        } else if (arg0 == 31) {
            class91.method1819(class252.field3145, class252.field3146, class252.field3244);
        } else if (arg0 == 32) {
            class91.method1819(class252.field3191, class252.field3149, class252.field3129);
        } else if (arg0 == 37) {
            class91.method1819(class252.field3151, class252.field3152, class252.field3153);
        } else if (arg0 == 38) {
            class91.method1819(class252.field3154, class252.field3155, class252.field3156);
        } else if (arg0 == 55) {
            class91.method1819(class252.field3157, class252.field3158, class252.field3159);
        } else if (arg0 == 56) {
            class91.method1819(class252.field3160, class252.field3161, class252.field3162);
            method153(11);
            return;
        } else if (arg0 == 57) {
            class91.method1819(class252.field3276, class252.field3164, class252.field3165);
            method153(11);
            return;
        } else {
            class91.method1819(class252.field3166, class252.field3169, class252.field3054);
        }
        method153(10);
    }

    @ObfuscatedName("ej.fu(I)V")
    public static final void method2545() {
        field1073.method1914();
        class287.method3014();
        class274.field3509.method3632();
        class275.method746();
        class283.field3597.method3632();
        class283.field3598.method3632();
        class283.field3605.method3632();
        class283.field3600.method3632();
        Statics.method4413();
        class284.field3651.method3632();
        class284.field3652.method3632();
        class284.field3653.method3632();
        class288.method3053();
        class273.field3501.method3632();
        class273.field3492.method3632();
        class278.method3543();
        class269.field3451.method3632();
        class282.method4881();
        class276.field3528.method3632();
        class276.field3527.method3632();
        class280.method1084();
        class279.field3549.method3632();
        class270.method326();
        class240.method3474();
        Statics.method3155();
        ((class124) Statics.field1932).method2352();
        class97.field1434.method3632();
        Statics.field1220.method4208();
        Statics.field1311.method4208();
        Statics.field3922.method4208();
        Statics.field399.method4208();
        Statics.field1908.method4208();
        Statics.field3547.method4208();
        Statics.field2770.method4208();
        Statics.field452.method4208();
        Statics.field722.method4208();
        Statics.field3377.method4208();
        Statics.field629.method4208();
        Statics.field236.method4208();
        Statics.field495.method2646();
        for (int var0 = 0; var0 < 4; var0++) {
            field867[var0].method3085();
        }
        System.gc();
        class230.field2675 = 1;
        Statics.field2673 = null;
        Statics.field2200 = -1;
        Statics.field2677 = -1;
        Statics.field2678 = 0;
        Statics.field1295 = false;
        Statics.field14 = 2;
        field1081 = -1;
        field957 = false;
        for (class81 var1 = (class81) class81.field1241.method3731(); var1 != null; var1 = (class81) class81.field1241.method3733()) {
            if (var1.field1245 != null) {
                Statics.field3885.method1930(var1.field1245);
                var1.field1245 = null;
            }
            if (var1.field1239 != null) {
                Statics.field3885.method1930(var1.field1239);
                var1.field1239 = null;
            }
        }
        class81.field1241.method3726();
        method153(10);
    }

    @ObfuscatedName("av.fz(B)V")
    public static final void method238() {
        if (field1037 > 0) {
            method2545();
        } else {
            field899.method4814();
            method153(40);
            Statics.field446 = field1073.method1915();
            field1073.method1925();
        }
    }

    @ObfuscatedName("bi.fl(ZI)V")
    public static final void method1107(boolean arg0) {
        if (arg0) {
            field888 = class91.field1351 ? class159.field2124 : class159.field2126;
        } else {
            field888 = Statics.field521.field1228.containsKey(class319.method4807(class91.field1346)) ? class159.field2127 : class159.field2125;
        }
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1416() {
        if (field866 > 1) {
            field866--;
        }
        if (field1037 > 0) {
            field1037--;
        }
        if (field897) {
            field897 = false;
            method238();
            return;
        }
        if (!field985) {
            method67();
        }
        for (int var1 = 0; var1 < 100 && this.method1154(field1073); var1++) {
        }
        if (field857 != 30) {
            return;
        }
        while (Statics.method630()) {
            class185 var2 = class185.method343(class182.field2407, field1073.field1457);
            var2.field2478.method3220(0);
            int var3 = var2.field2478.field2545;
            class327.method573(var2.field2478);
            var2.field2478.method3233(var2.field2478.field2545 - var3);
            field1073.method1916(var2);
        }
        if (field899.field3812) {
            class185 var4 = class185.method343(class182.field2359, field1073.field1457);
            var4.field2478.method3220(0);
            int var5 = var4.field2478.field2545;
            field899.method4812(var4.field2478);
            var4.field2478.method3233(var4.field2478.field2545 - var5);
            field1073.method1916(var4);
            field899.method4826();
        }
        Object var6 = Statics.field776.field794;
        synchronized (Statics.field776.field794) {
            if (!field890) {
                Statics.field776.field799 = 0;
            } else if (class61.field679 != 0 || Statics.field776.field799 >= 40) {
                class185 var7 = class185.method343(class182.field2410, field1073.field1457);
                var7.field2478.method3220(0);
                int var8 = var7.field2478.field2545;
                int var9 = 0;
                for (int var10 = 0; var10 < Statics.field776.field799 && var7.field2478.field2545 - var8 < 240; var10++) {
                    var9++;
                    int var11 = Statics.field776.field795[var10];
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 502) {
                        var11 = 502;
                    }
                    int var12 = Statics.field776.field797[var10];
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 764) {
                        var12 = 764;
                    }
                    int var13 = var11 * 765 + var12;
                    if (Statics.field776.field795[var10] == -1 && Statics.field776.field797[var10] == -1) {
                        var12 = -1;
                        var11 = -1;
                        var13 = 524287;
                    }
                    if (field861 != var12 || field947 != var11) {
                        int var14 = var12 - field861;
                        field861 = var12;
                        int var15 = var11 - field947;
                        field947 = var11;
                        if (field1008 < 8 && var14 >= -32 && var14 <= 31 && var15 >= -32 && var15 <= 31) {
                            var14 += 32;
                            var15 += 32;
                            var7.field2478.method3323((field1008 << 12) + (var14 << 6) + var15);
                            field1008 = 0;
                        } else if (field1008 < 8) {
                            var7.field2478.method3222((field1008 << 19) + 8388608 + var13);
                            field1008 = 0;
                        } else {
                            var7.field2478.method3223((field1008 << 19) + -1073741824 + var13);
                            field1008 = 0;
                        }
                    } else if (field1008 < 2047) {
                        field1008++;
                    }
                }
                var7.field2478.method3233(var7.field2478.field2545 - var8);
                field1073.method1916(var7);
                if (var9 >= Statics.field776.field799) {
                    Statics.field776.field799 = 0;
                } else {
                    Statics.field776.field799 -= var9;
                    for (int var16 = 0; var16 < Statics.field776.field799; var16++) {
                        Statics.field776.field797[var16] = Statics.field776.field797[var9 + var16];
                        Statics.field776.field795[var16] = Statics.field776.field795[var9 + var16];
                    }
                }
            }
        }
        if (class61.field679 == 1 || !Statics.field2112 && class61.field679 == 4 || class61.field679 == 2) {
            long var18 = (class61.field694 - field860 * -1L) / 50L;
            if (var18 > 4095L) {
                var18 = 4095L;
            }
            field860 = class61.field694 * -1L;
            int var20 = class61.field693;
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > Statics.field659) {
                var20 = Statics.field659;
            }
            int var21 = class61.field692;
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > Statics.field2021) {
                var21 = Statics.field2021;
            }
            int var22 = (int) var18;
            class185 var23 = class185.method343(class182.field2350, field1073.field1457);
            var23.field2478.method3323((var22 << 1) + (class61.field679 == 2 ? 1 : 0));
            var23.field2478.method3323(var21);
            var23.field2478.method3323(var20);
            field1073.method1916(var23);
        }
        if (class52.field601 > 0) {
            class185 var24 = class185.method343(class182.field2349, field1073.field1457);
            var24.field2478.method3323(0);
            int var25 = var24.field2478.field2545;
            long var26 = Statics.method426();
            for (int var28 = 0; var28 < class52.field601; var28++) {
                long var29 = var26 - field1071;
                if (var29 > 16777215L) {
                    var29 = 16777215L;
                }
                field1071 = var26;
                var24.field2478.method3411(class52.field607[var28]);
                var24.field2478.method3394((int) var29);
            }
            var24.field2478.method3380(var24.field2478.field2545 - var25);
            field1073.method1916(var24);
        }
        if (field933 > 0) {
            field933--;
        }
        if (class52.field615[96] || class52.field615[97] || class52.field615[98] || class52.field615[99]) {
            field996 = true;
        }
        if (field996 && field933 <= 0) {
            field933 = 20;
            field996 = false;
            class185 var31 = class185.method343(class182.field2385, field1073.field1457);
            var31.field2478.method3218(field918);
            var31.field2478.method3323(field919);
            field1073.method1916(var31);
        }
        if (Statics.field2551 && !field864) {
            field864 = true;
            class185 var32 = class185.method343(class182.field2353, field1073.field1457);
            var32.field2478.method3220(1);
            field1073.method1916(var32);
        }
        if (!Statics.field2551 && field864) {
            field864 = false;
            class185 var33 = class185.method343(class182.field2353, field1073.field1457);
            var33.field2478.method3220(0);
            field1073.method1916(var33);
        }
        if (Statics.field3306 != null) {
            Statics.field3306.method5546();
        }
        method2076();
        if (Statics.field3841 != field1072) {
            field1072 = Statics.field3841;
            method1(Statics.field3841);
        }
        if (field857 != 30) {
            return;
        }
        method3132();
        int var10002;
        for (int var34 = 0; var34 < field1085; var34++) {
            var10002 = field913[var34]--;
            if (field913[var34] >= -10) {
                class104 var36 = field938[var34];
                if (var36 == null) {
                    class104 var10000 = (class104) null;
                    var36 = class104.method1994(Statics.field399, field1086[var34], 0);
                    if (var36 == null) {
                        continue;
                    }
                    field913[var34] += var36.method1992();
                    field938[var34] = var36;
                }
                if (field913[var34] < 0) {
                    int var43;
                    if (field942[var34] == 0) {
                        var43 = field900;
                    } else {
                        int var37 = (field942[var34] & 0xFF) * 128;
                        int var38 = field942[var34] >> 16 & 0xFF;
                        int var39 = var38 * 128 + 64 - Statics.field434.field1175;
                        if (var39 < 0) {
                            var39 = -var39;
                        }
                        int var40 = field942[var34] >> 8 & 0xFF;
                        int var41 = var40 * 128 + 64 - Statics.field434.field1138;
                        if (var41 < 0) {
                            var41 = -var41;
                        }
                        int var42 = var39 + var41 - 128;
                        if (var42 > var37) {
                            field913[var34] = -100;
                            continue;
                        }
                        if (var42 < 0) {
                            var42 = 0;
                        }
                        var43 = field1084 * (var37 - var42) / var37;
                    }
                    if (var43 > 0) {
                        class106 var44 = var36.method1983().method2023(Statics.field524);
                        class116 var45 = class116.method2132(var44, 100, var43);
                        var45.method2186(field1087[var34] - 1);
                        Statics.field3885.method1929(var45);
                    }
                    field913[var34] = -100;
                }
            } else {
                field1085--;
                for (int var35 = var34; var35 < field1085; var35++) {
                    field1086[var35] = field1086[var35 + 1];
                    field938[var35] = field938[var35 + 1];
                    field1087[var35] = field1087[var35 + 1];
                    field913[var35] = field913[var35 + 1];
                    field942[var35] = field942[var35 + 1];
                }
                var34--;
            }
        }
        if (field957) {
            boolean var46;
            if (class230.field2675 == 0) {
                var46 = Statics.field2674.method3873();
            } else {
                var46 = true;
            }
            if (!var46) {
                if (field1080 != 0 && field1081 != -1) {
                    class230.method1527(Statics.field3547, field1081, 0, field1080, false);
                }
                field957 = false;
            }
        }
        field1073.field1465++;
        if (field1073.field1465 > 750) {
            method238();
            return;
        }
        Statics.method3815();
        method2912();
        method1015();
        field911++;
        if (field953 != 0) {
            field1089 += 20;
            if (field1089 >= 400) {
                field953 = 0;
            }
        }
        if (Statics.field798 != null) {
            field1028++;
            if (field1028 >= 15) {
                method942(Statics.field798);
                Statics.field798 = null;
            }
        }
        class243 var47 = Statics.field378;
        class243 var48 = Statics.field3372;
        Statics.field378 = null;
        Statics.field3372 = null;
        field952 = null;
        field1096 = false;
        field1025 = false;
        field870 = 0;
        while (class52.method4806() && field870 < 128) {
            if (field936 >= 2 && class52.field615[82] && Statics.field1296 == 66) {
                String var49 = class96.method981();
                Statics.field3013.method812(var49);
            } else if (field924 != 1 || Statics.field342 <= 0) {
                field1070[field870] = Statics.field1296;
                field1069[field870] = Statics.field342;
                field870++;
            }
        }
        boolean var50 = field936 >= 2;
        if (var50 && class52.field615[82] && class52.field615[81] && field1045 != 0) {
            int var51 = Statics.field434.field837 - field1045;
            if (var51 < 0) {
                var51 = 0;
            } else if (var51 > 3) {
                var51 = 3;
            }
            if (Statics.field434.field837 != var51) {
                method2322(Statics.field494 + Statics.field434.field1193[0], Statics.field2794 + Statics.field434.field1194[0], var51, false);
            }
            field1045 = 0;
        }
        if (field1009 != -1) {
            int var52 = field1009;
            int var53 = Statics.field2021;
            int var54 = Statics.field659;
            if (class243.method1894(var52)) {
                method3203(Statics.field2810[var52], -1, 0, 0, var53, var54, 0, 0);
            }
        }
        field1032++;
        while (true) {
            class69 var55;
            class243 var56;
            class243 var57;
            do {
                var55 = (class69) field1047.method3729();
                if (var55 == null) {
                    while (true) {
                        class69 var58;
                        class243 var59;
                        class243 var60;
                        do {
                            var58 = (class69) field1048.method3729();
                            if (var58 == null) {
                                while (true) {
                                    class69 var61;
                                    class243 var62;
                                    class243 var63;
                                    do {
                                        var61 = (class69) field1046.method3729();
                                        if (var61 == null) {
                                            this.method1151();
                                            if (Statics.field3306 != null) {
                                                Statics.field3306.method5628(Statics.field3841, (Statics.field434.field1175 >> 7) + Statics.field494, (Statics.field434.field1138 >> 7) + Statics.field2794, false);
                                                Statics.field3306.method5588();
                                            }
                                            if (field1020 != null) {
                                                this.method1300();
                                            }
                                            if (Statics.field575 != null) {
                                                method942(Statics.field575);
                                                field962++;
                                                if (class61.field684 == 0) {
                                                    if (field961) {
                                                        if (Statics.field575 == Statics.field262 && field999 != field1091) {
                                                            class243 var64 = Statics.field575;
                                                            byte var65 = 0;
                                                            if (field1012 == 1 && var64.field2822 == 206) {
                                                                var65 = 1;
                                                            }
                                                            if (var64.field2936[field1091] <= 0) {
                                                                var65 = 0;
                                                            }
                                                            if (class244.method2909(Statics.method78(var64))) {
                                                                int var66 = field999;
                                                                int var67 = field1091;
                                                                var64.field2936[var67] = var64.field2936[var66];
                                                                var64.field2817[var67] = var64.field2817[var66];
                                                                var64.field2936[var66] = -1;
                                                                var64.field2817[var66] = 0;
                                                            } else if (var65 == 1) {
                                                                int var68 = field999;
                                                                int var69 = field1091;
                                                                while (var68 != var69) {
                                                                    if (var68 > var69) {
                                                                        var64.method4108(var68 - 1, var68);
                                                                        var68--;
                                                                    } else if (var68 < var69) {
                                                                        var64.method4108(var68 + 1, var68);
                                                                        var68++;
                                                                    }
                                                                }
                                                            } else {
                                                                var64.method4108(field1091, field999);
                                                            }
                                                            class185 var70 = class185.method343(class182.field2362, field1073.field1457);
                                                            var70.field2478.method3283(Statics.field575.field2929);
                                                            var70.field2478.method3269(field999);
                                                            var70.field2478.method3323(field1091);
                                                            var70.field2478.method3411(var65);
                                                            field1073.method1916(var70);
                                                        }
                                                    } else if (this.method1156()) {
                                                        this.method1214(field958, field959);
                                                    } else if (field977 > 0) {
                                                        Statics.method2900(field958, field959);
                                                    }
                                                    field1028 = 10;
                                                    class61.field679 = 0;
                                                    Statics.field575 = null;
                                                } else if (field962 >= 5 && (class61.field685 > field958 + 5 || class61.field685 < field958 - 5 || class61.field686 > field959 + 5 || class61.field686 < field959 - 5)) {
                                                    field961 = true;
                                                }
                                            }
                                            if (class138.method2685()) {
                                                int var71 = class138.field1991;
                                                int var72 = class138.field1992;
                                                class185 var73 = class185.method343(class182.field2398, field1073.field1457);
                                                var73.field2478.method3220(5);
                                                var73.field2478.method3218(Statics.field2794 + var72);
                                                var73.field2478.method3411(class52.field615[82] ? (class52.field615[81] ? 2 : 1) : 0);
                                                var73.field2478.method3272(Statics.field494 + var71);
                                                field1073.method1916(var73);
                                                class138.method2812();
                                                field976 = class61.field692;
                                                field951 = class61.field693;
                                                field953 = 1;
                                                field1089 = 0;
                                                field1077 = var71;
                                                field904 = var72;
                                            }
                                            if (Statics.field378 != var47) {
                                                if (var47 != null) {
                                                    method942(var47);
                                                }
                                                if (Statics.field378 != null) {
                                                    method942(Statics.field378);
                                                }
                                            }
                                            if (Statics.field3372 != var48 && field1001 == field1000) {
                                                if (var48 != null) {
                                                    method942(var48);
                                                }
                                                if (Statics.field3372 != null) {
                                                    method942(Statics.field3372);
                                                }
                                            }
                                            if (Statics.field3372 == null) {
                                                if (field1000 > 0) {
                                                    field1000--;
                                                }
                                            } else if (field1000 < field1001) {
                                                field1000++;
                                                if (field1001 == field1000) {
                                                    method942(Statics.field3372);
                                                }
                                            }
                                            if (field924 == 0) {
                                                int var74 = Statics.field434.field1175;
                                                int var75 = Statics.field434.field1138;
                                                if (Statics.field416 - var74 < -500 || Statics.field416 - var74 > 500 || Statics.field2570 - var75 < -500 || Statics.field2570 - var75 > 500) {
                                                    Statics.field416 = var74;
                                                    Statics.field2570 = var75;
                                                }
                                                if (Statics.field416 != var74) {
                                                    Statics.field416 += (var74 - Statics.field416) / 16;
                                                }
                                                if (Statics.field2570 != var75) {
                                                    Statics.field2570 += (var75 - Statics.field2570) / 16;
                                                }
                                                int var76 = Statics.field416 >> 7;
                                                int var77 = Statics.field2570 >> 7;
                                                int var78 = method2870(Statics.field416, Statics.field2570, Statics.field3841);
                                                int var79 = 0;
                                                if (var76 > 3 && var77 > 3 && var76 < 100 && var77 < 100) {
                                                    for (int var80 = var76 - 4; var80 <= var76 + 4; var80++) {
                                                        for (int var81 = var77 - 4; var81 <= var77 + 4; var81++) {
                                                            int var82 = Statics.field3841;
                                                            if (var82 < 3 && (class63.field704[1][var80][var81] & 0x2) == 2) {
                                                                var82++;
                                                            }
                                                            int var83 = var78 - class63.field707[var82][var80][var81];
                                                            if (var83 > var79) {
                                                                var79 = var83;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var84 = var79 * 192;
                                                if (var84 > 98048) {
                                                    var84 = 98048;
                                                }
                                                if (var84 < 32768) {
                                                    var84 = 32768;
                                                }
                                                if (var84 > field993) {
                                                    field993 += (var84 - field993) / 24;
                                                } else if (var84 < field993) {
                                                    field993 += (var84 - field993) / 80;
                                                }
                                                Statics.field2034 = method2870(Statics.field434.field1175, Statics.field434.field1138, Statics.field3841) - field925;
                                            } else if (field924 == 1) {
                                                if (field955 && Statics.field434 != null) {
                                                    int var85 = Statics.field434.field1193[0];
                                                    int var86 = Statics.field434.field1194[0];
                                                    if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                                                        Statics.field416 = Statics.field434.field1175;
                                                        Statics.field2034 = method2870(Statics.field434.field1175, Statics.field434.field1138, Statics.field3841) - field925;
                                                        Statics.field2570 = Statics.field434.field1138;
                                                        field955 = false;
                                                    }
                                                }
                                                short var87 = -1;
                                                if (class52.field615[33]) {
                                                    var87 = 0;
                                                } else if (class52.field615[49]) {
                                                    var87 = 1024;
                                                }
                                                if (class52.field615[48]) {
                                                    if (var87 == 0) {
                                                        var87 = 1792;
                                                    } else if (var87 == 1024) {
                                                        var87 = 1280;
                                                    } else {
                                                        var87 = 1536;
                                                    }
                                                } else if (class52.field615[50]) {
                                                    if (var87 == 0) {
                                                        var87 = 256;
                                                    } else if (var87 == 1024) {
                                                        var87 = 768;
                                                    } else {
                                                        var87 = 512;
                                                    }
                                                }
                                                byte var88 = 0;
                                                if (class52.field615[35]) {
                                                    var88 = -1;
                                                } else if (class52.field615[51]) {
                                                    var88 = 1;
                                                }
                                                int var89 = 0;
                                                if (var87 >= 0 || var88 != 0) {
                                                    int var90 = class52.field615[81] ? field858 : field1116;
                                                    var89 = var90 * 16;
                                                    field872 = var87;
                                                    field928 = var88;
                                                }
                                                if (field926 < var89) {
                                                    field926 += var89 / 8;
                                                    if (field926 > var89) {
                                                        field926 = var89;
                                                    }
                                                } else if (field926 > var89) {
                                                    field926 = field926 * 9 / 10;
                                                }
                                                if (field926 > 0) {
                                                    int var91 = field926 / 16;
                                                    if (field872 >= 0) {
                                                        int var92 = field872 - Statics.field711 & 0x7FF;
                                                        int var93 = class135.field1935[var92];
                                                        int var94 = class135.field1936[var92];
                                                        Statics.field416 += var91 * var93 / 65536;
                                                        Statics.field2570 += var91 * var94 / 65536;
                                                    }
                                                    if (field928 != 0) {
                                                        Statics.field2034 += field928 * var91;
                                                        if (Statics.field2034 > 0) {
                                                            Statics.field2034 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field872 = -1;
                                                    field928 = -1;
                                                }
                                                if (class52.field615[13]) {
                                                    method47();
                                                }
                                            }
                                            if (class61.field684 == 4 && Statics.field2112) {
                                                int var95 = class61.field686 - field1083;
                                                field921 = var95 * 2;
                                                field1083 = var95 == -1 || var95 == 1 ? class61.field686 : (field1083 + class61.field686) / 2;
                                                int var96 = field1042 - class61.field685;
                                                field920 = var96 * 2;
                                                field1042 = var96 == -1 || var96 == 1 ? class61.field685 : (field1042 + class61.field685) / 2;
                                            } else {
                                                if (class52.field615[96]) {
                                                    field920 += (-24 - field920) / 2;
                                                } else if (class52.field615[97]) {
                                                    field920 += (24 - field920) / 2;
                                                } else {
                                                    field920 /= 2;
                                                }
                                                if (class52.field615[98]) {
                                                    field921 += (12 - field921) / 2;
                                                } else if (class52.field615[99]) {
                                                    field921 += (-12 - field921) / 2;
                                                } else {
                                                    field921 /= 2;
                                                }
                                                field1083 = class61.field686;
                                                field1042 = class61.field685;
                                            }
                                            field919 = field920 / 2 + field919 & 0x7FF;
                                            field918 += field921 / 2;
                                            if (field918 < 128) {
                                                field918 = 128;
                                            }
                                            if (field918 > 383) {
                                                field918 = 383;
                                            }
                                            if (field852) {
                                                int var97 = Statics.field2467 * 128 + 64;
                                                int var98 = Statics.field323 * 128 + 64;
                                                int var99 = method2870(var97, var98, Statics.field3841) - Statics.field415;
                                                if (Statics.field1410 < var97) {
                                                    Statics.field1410 += Statics.field702 * (var97 - Statics.field1410) / 1000 + Statics.field252;
                                                    if (Statics.field1410 > var97) {
                                                        Statics.field1410 = var97;
                                                    }
                                                }
                                                if (Statics.field1410 > var97) {
                                                    Statics.field1410 -= Statics.field702 * (Statics.field1410 - var97) / 1000 + Statics.field252;
                                                    if (Statics.field1410 < var97) {
                                                        Statics.field1410 = var97;
                                                    }
                                                }
                                                if (Statics.field2131 < var99) {
                                                    Statics.field2131 += Statics.field702 * (var99 - Statics.field2131) / 1000 + Statics.field252;
                                                    if (Statics.field2131 > var99) {
                                                        Statics.field2131 = var99;
                                                    }
                                                }
                                                if (Statics.field2131 > var99) {
                                                    Statics.field2131 -= Statics.field702 * (Statics.field2131 - var99) / 1000 + Statics.field252;
                                                    if (Statics.field2131 < var99) {
                                                        Statics.field2131 = var99;
                                                    }
                                                }
                                                if (Statics.field250 < var98) {
                                                    Statics.field250 += Statics.field702 * (var98 - Statics.field250) / 1000 + Statics.field252;
                                                    if (Statics.field250 > var98) {
                                                        Statics.field250 = var98;
                                                    }
                                                }
                                                if (Statics.field250 > var98) {
                                                    Statics.field250 -= Statics.field702 * (Statics.field250 - var98) / 1000 + Statics.field252;
                                                    if (Statics.field250 < var98) {
                                                        Statics.field250 = var98;
                                                    }
                                                }
                                                int var100 = Statics.field3330 * 128 + 64;
                                                int var101 = Statics.field373 * 128 + 64;
                                                int var102 = method2870(var100, var101, Statics.field3841) - Statics.field16;
                                                int var103 = var100 - Statics.field1410;
                                                int var104 = var102 - Statics.field2131;
                                                int var105 = var101 - Statics.field250;
                                                int var106 = (int) Math.sqrt((double) (var103 * var103 + var105 * var105));
                                                int var107 = (int) (Math.atan2((double) var104, (double) var106) * 325.949D) & 0x7FF;
                                                int var108 = (int) (Math.atan2((double) var103, (double) var105) * -325.949D) & 0x7FF;
                                                if (var107 < 128) {
                                                    var107 = 128;
                                                }
                                                if (var107 > 383) {
                                                    var107 = 383;
                                                }
                                                if (Statics.field436 < var107) {
                                                    Statics.field436 += Statics.field625 * (var107 - Statics.field436) / 1000 + Statics.field317;
                                                    if (Statics.field436 > var107) {
                                                        Statics.field436 = var107;
                                                    }
                                                }
                                                if (Statics.field436 > var107) {
                                                    Statics.field436 -= Statics.field625 * (Statics.field436 - var107) / 1000 + Statics.field317;
                                                    if (Statics.field436 < var107) {
                                                        Statics.field436 = var107;
                                                    }
                                                }
                                                int var109 = var108 - Statics.field711;
                                                if (var109 > 1024) {
                                                    var109 -= 2048;
                                                }
                                                if (var109 < -1024) {
                                                    var109 += 2048;
                                                }
                                                if (var109 > 0) {
                                                    Statics.field711 += Statics.field625 * var109 / 1000 + Statics.field317;
                                                    Statics.field711 &= 0x7FF;
                                                }
                                                if (var109 < 0) {
                                                    Statics.field711 -= Statics.field625 * -var109 / 1000 + Statics.field317;
                                                    Statics.field711 &= 0x7FF;
                                                }
                                                int var110 = var108 - Statics.field711;
                                                if (var110 > 1024) {
                                                    var110 -= 2048;
                                                }
                                                if (var110 < -1024) {
                                                    var110 += 2048;
                                                }
                                                if (var110 < 0 && var109 > 0 || var110 > 0 && var109 < 0) {
                                                    Statics.field711 = var108;
                                                }
                                            }
                                            for (int var111 = 0; var111 < 5; var111++) {
                                                var10002 = field1097[var111]++;
                                            }
                                            Statics.field239.method1839();
                                            int var112 = ++class61.field696 - 1;
                                            int var114 = class52.method2899();
                                            if (var112 > 15000 && var114 > 15000) {
                                                field1037 = 250;
                                                class61.method339(14500);
                                                class185 var115 = class185.method343(class182.field2431, field1073.field1457);
                                                field1073.method1916(var115);
                                            }
                                            Statics.field2030.method1610();
                                            field1073.field1463++;
                                            if (field1073.field1463 > 50) {
                                                class185 var116 = class185.method343(class182.field2432, field1073.field1457);
                                                field1073.method1916(var116);
                                            }
                                            try {
                                                field1073.method1920();
                                            } catch (IOException var118) {
                                                method238();
                                            }
                                            return;
                                        }
                                        var62 = var61.field791;
                                        if (var62.field2859 < 0) {
                                            break;
                                        }
                                        var63 = class243.method3168(var62.field2837);
                                    } while (var63 == null || var63.field2898 == null || var62.field2859 >= var63.field2898.length || var63.field2898[var62.field2859] != var62);
                                    class82.method187(var61, 500000);
                                }
                            }
                            var59 = var58.field791;
                            if (var59.field2859 < 0) {
                                break;
                            }
                            var60 = class243.method3168(var59.field2837);
                        } while (var60 == null || var60.field2898 == null || var59.field2859 >= var60.field2898.length || var60.field2898[var59.field2859] != var59);
                        class82.method187(var58, 500000);
                    }
                }
                var56 = var55.field791;
                if (var56.field2859 < 0) {
                    break;
                }
                var57 = class243.method3168(var56.field2837);
            } while (var57 == null || var57.field2898 == null || var56.field2859 >= var57.field2898.length || var57.field2898[var56.field2859] != var56);
            class82.method187(var55, 500000);
        }
    }

    @ObfuscatedName("al.fb(B)V")
    public static final void method525() {
        if (Statics.field2557 != null) {
            Statics.field2557.method2049();
        }
        if (Statics.field260 != null) {
            Statics.field260.method2049();
        }
    }

    @ObfuscatedName("eq.fd(Lkf;IIIB)V")
    public static void method2878(class288 arg0, int arg1, int arg2, int arg3) {
        if (field1085 >= 50 || field1084 == 0 || arg0.field3763 == null || arg1 >= arg0.field3763.length) {
            return;
        }
        int var4 = arg0.field3763[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1086[field1085] = var5;
        field1087[field1085] = var6;
        field913[field1085] = 0;
        field938[field1085] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field942[field1085] = (var8 << 16) + (var9 << 8) + var7;
        field1085++;
    }

    @ObfuscatedName("cl.fh(IIIB)V")
    public static void method1895(int arg0, int arg1, int arg2) {
        if (field900 == 0 || arg1 == 0 || field1085 >= 50) {
            return;
        }
        field1086[field1085] = arg0;
        field1087[field1085] = arg1;
        field913[field1085] = arg2;
        field938[field1085] = null;
        field942[field1085] = 0;
        field1085++;
    }

    @ObfuscatedName("az.fs(IB)V")
    public static void method324(int arg0) {
        if (arg0 == -1 && !field957) {
            class230.method1013();
        } else if (arg0 != -1 && field1081 != arg0 && field1080 != 0 && !field957) {
            Statics.method1755(2, Statics.field3547, arg0, 0, field1080, false);
        }
        field1081 = arg0;
    }

    @ObfuscatedName("ci.fy(III)V")
    public static void method1778(int arg0, int arg1) {
        if (field1080 != 0 && arg0 != -1) {
            class230.method1527(Statics.field629, arg0, 0, field1080, false);
            field957 = true;
        }
    }

    @ObfuscatedName("dr.fw(I)V")
    public static final void method2076() {
        if (!Statics.field727) {
            return;
        }
        if (Statics.field616 != null) {
            Statics.field616.method4919();
        }
        method4();
        Statics.field727 = false;
    }

    @ObfuscatedName("p.fm(Lig;III)V")
    public static final void method35(class243 arg0, int arg1, int arg2) {
        if (field1004 != 0 && field1004 != 3 || class61.field679 != 1 && Statics.field2112 || class61.field679 != 4) {
            return;
        }
        class237 var3 = arg0.method4113(true);
        if (var3 == null) {
            return;
        }
        int var4 = class61.field692 - arg1;
        int var5 = class61.field693 - arg2;
        if (!var3.method4029(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2767 / 2;
        int var7 = var5 - var3.field2768 / 2;
        int var8 = field919 & 0x7FF;
        int var9 = class135.field1935[var8];
        int var10 = class135.field1936[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field434.field1175 + var11 >> 7;
        int var14 = Statics.field434.field1138 - var12 >> 7;
        class185 var15 = class185.method343(class182.field2433, field1073.field1457);
        var15.field2478.method3220(18);
        var15.field2478.method3218(Statics.field2794 + var14);
        var15.field2478.method3411(class52.field615[82] ? (class52.field615[81] ? 2 : 1) : 0);
        var15.field2478.method3272(Statics.field494 + var13);
        var15.field2478.method3220(var6);
        var15.field2478.method3220(var7);
        var15.field2478.method3323(field919);
        var15.field2478.method3220(57);
        var15.field2478.method3220(0);
        var15.field2478.method3220(0);
        var15.field2478.method3220(89);
        var15.field2478.method3323(Statics.field434.field1175);
        var15.field2478.method3323(Statics.field434.field1138);
        var15.field2478.method3220(63);
        field1073.method1916(var15);
        field1077 = var13;
        field904 = var14;
    }

    @ObfuscatedName("by.fr(I)V")
    public static final void method1015() {
        int[] var0 = class94.field1398;
        for (int var1 = 0; var1 < class94.field1397; var1++) {
            class73 var2 = field965[var0[var1]];
            if (var2 != null && var2.field1154 > 0) {
                var2.field1154--;
                if (var2.field1154 == 0) {
                    var2.field1188 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field865; var3++) {
            int var4 = field892[var3];
            class85 var5 = field975[var4];
            if (var5 != null && var5.field1154 > 0) {
                var5.field1154--;
                if (var5.field1154 == 0) {
                    var5.field1188 = null;
                }
            }
        }
    }

    @ObfuscatedName("eh.fn(I)V")
    public static final void method2912() {
        for (int var0 = 0; var0 < field865; var0++) {
            int var1 = field892[var0];
            class85 var2 = field975[var1];
            if (var2 != null) {
                method529(var2, var2.field1284.field3711);
            }
        }
    }

    @ObfuscatedName("at.fj(Lbw;II)V")
    public static final void method529(class76 arg0, int arg1) {
        if (arg0.field1184 > field1108) {
            method49(arg0);
        } else if (arg0.field1185 >= field1108) {
            if (field1108 == arg0.field1185 || arg0.field1170 == -1 || arg0.field1173 != 0 || arg0.field1141 + 1 > class288.method2932(arg0.field1170).field3762[arg0.field1171]) {
                int var2 = arg0.field1185 - arg0.field1184;
                int var3 = field1108 - arg0.field1184;
                int var4 = arg0.field1160 * 128 + arg0.field1140 * 64;
                int var5 = arg0.field1182 * 128 + arg0.field1140 * 64;
                int var6 = arg0.field1147 * 128 + arg0.field1140 * 64;
                int var7 = arg0.field1183 * 128 + arg0.field1140 * 64;
                arg0.field1175 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field1138 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field1196 = 0;
            arg0.field1155 = arg0.field1186;
            arg0.field1139 = arg0.field1155;
        } else {
            arg0.field1172 = arg0.field1181;
            if (arg0.field1192 == 0) {
                arg0.field1196 = 0;
            } else {
                label334: {
                    if (arg0.field1170 != -1 && arg0.field1173 == 0) {
                        class288 var8 = class288.method2932(arg0.field1170);
                        if (arg0.field1197 > 0 && var8.field3771 == 0) {
                            arg0.field1196++;
                            break label334;
                        }
                        if (arg0.field1197 <= 0 && var8.field3772 == 0) {
                            arg0.field1196++;
                            break label334;
                        }
                    }
                    int var9 = arg0.field1175;
                    int var10 = arg0.field1138;
                    int var11 = arg0.field1193[arg0.field1192 - 1] * 128 + arg0.field1140 * 64;
                    int var12 = arg0.field1194[arg0.field1192 - 1] * 128 + arg0.field1140 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field1155 = 1280;
                        } else if (var10 > var12) {
                            arg0.field1155 = 1792;
                        } else {
                            arg0.field1155 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field1155 = 768;
                        } else if (var10 > var12) {
                            arg0.field1155 = 256;
                        } else {
                            arg0.field1155 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field1155 = 1024;
                    } else if (var10 > var12) {
                        arg0.field1155 = 0;
                    }
                    byte var13 = arg0.field1180[arg0.field1192 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field1155 - arg0.field1139 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field1159;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field1146;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field1149;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field1148;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field1146;
                        }
                        arg0.field1172 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class85) {
                            var17 = ((class85) arg0).field1284.field3714;
                        }
                        if (var17) {
                            if (arg0.field1155 != arg0.field1139 && arg0.field1164 == -1 && arg0.field1191 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field1192 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field1192 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field1196 > 0 && arg0.field1192 > 1) {
                                var16 = 8;
                                arg0.field1196--;
                            }
                        } else {
                            if (arg0.field1192 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field1192 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field1196 > 0 && arg0.field1192 > 1) {
                                var16 = 8;
                                arg0.field1196--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field1172 == arg0.field1146 && arg0.field1195 != -1) {
                            arg0.field1172 = arg0.field1195;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field1175 += var16;
                                if (arg0.field1175 > var11) {
                                    arg0.field1175 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field1175 -= var16;
                                if (arg0.field1175 < var11) {
                                    arg0.field1175 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field1138 += var16;
                                if (arg0.field1138 > var12) {
                                    arg0.field1138 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field1138 -= var16;
                                if (arg0.field1138 < var12) {
                                    arg0.field1138 = var12;
                                }
                            }
                        }
                        if (arg0.field1175 == var11 && arg0.field1138 == var12) {
                            arg0.field1192--;
                            if (arg0.field1197 > 0) {
                                arg0.field1197--;
                            }
                        }
                    } else {
                        arg0.field1175 = var11;
                        arg0.field1138 = var12;
                        arg0.field1192--;
                        if (arg0.field1197 > 0) {
                            arg0.field1197--;
                        }
                    }
                }
            }
        }
        if (arg0.field1175 < 128 || arg0.field1138 < 128 || arg0.field1175 >= 13184 || arg0.field1138 >= 13184) {
            arg0.field1170 = -1;
            arg0.field1190 = -1;
            arg0.field1184 = 0;
            arg0.field1185 = 0;
            arg0.field1175 = arg0.field1193[0] * 128 + arg0.field1140 * 64;
            arg0.field1138 = arg0.field1194[0] * 128 + arg0.field1140 * 64;
            arg0.method1513();
        }
        if (Statics.field434 == arg0 && (arg0.field1175 < 1536 || arg0.field1138 < 1536 || arg0.field1175 >= 11776 || arg0.field1138 >= 11776)) {
            arg0.field1170 = -1;
            arg0.field1190 = -1;
            arg0.field1184 = 0;
            arg0.field1185 = 0;
            arg0.field1175 = arg0.field1193[0] * 128 + arg0.field1140 * 64;
            arg0.field1138 = arg0.field1194[0] * 128 + arg0.field1140 * 64;
            arg0.method1513();
        }
        method530(arg0);
        arg0.field1166 = false;
        if (arg0.field1172 != -1) {
            class288 var18 = class288.method2932(arg0.field1172);
            if (var18 == null || var18.field3760 == null) {
                arg0.field1172 = -1;
            } else {
                arg0.field1169++;
                if (arg0.field1168 < var18.field3760.length && arg0.field1169 > var18.field3762[arg0.field1168]) {
                    arg0.field1169 = 1;
                    arg0.field1168++;
                    method2878(var18, arg0.field1168, arg0.field1175, arg0.field1138);
                }
                if (arg0.field1168 >= var18.field3760.length) {
                    arg0.field1169 = 0;
                    arg0.field1168 = 0;
                    method2878(var18, arg0.field1168, arg0.field1175, arg0.field1138);
                }
            }
        }
        if (arg0.field1190 != -1 && field1108 >= arg0.field1178) {
            if (arg0.field1176 < 0) {
                arg0.field1176 = 0;
            }
            int var19 = class273.method346(arg0.field1190).field3495;
            if (var19 == -1) {
                arg0.field1190 = -1;
            } else {
                class288 var20 = class288.method2932(var19);
                if (var20 == null || var20.field3760 == null) {
                    arg0.field1190 = -1;
                } else {
                    arg0.field1177++;
                    if (arg0.field1176 < var20.field3760.length && arg0.field1177 > var20.field3762[arg0.field1176]) {
                        arg0.field1177 = 1;
                        arg0.field1176++;
                        method2878(var20, arg0.field1176, arg0.field1175, arg0.field1138);
                    }
                    if (arg0.field1176 >= var20.field3760.length && (arg0.field1176 < 0 || arg0.field1176 >= var20.field3760.length)) {
                        arg0.field1190 = -1;
                    }
                }
            }
        }
        if (arg0.field1170 != -1 && arg0.field1173 <= 1) {
            class288 var21 = class288.method2932(arg0.field1170);
            if (var21.field3771 == 1 && arg0.field1197 > 0 && arg0.field1184 <= field1108 && arg0.field1185 < field1108) {
                arg0.field1173 = 1;
                return;
            }
        }
        if (arg0.field1170 != -1 && arg0.field1173 == 0) {
            class288 var22 = class288.method2932(arg0.field1170);
            if (var22 == null || var22.field3760 == null) {
                arg0.field1170 = -1;
            } else {
                arg0.field1141++;
                if (arg0.field1171 < var22.field3760.length && arg0.field1141 > var22.field3762[arg0.field1171]) {
                    arg0.field1141 = 1;
                    arg0.field1171++;
                    method2878(var22, arg0.field1171, arg0.field1175, arg0.field1138);
                }
                if (arg0.field1171 >= var22.field3760.length) {
                    arg0.field1171 -= var22.field3764;
                    arg0.field1187++;
                    if (arg0.field1187 >= var22.field3770) {
                        arg0.field1170 = -1;
                    } else if (arg0.field1171 >= 0 && arg0.field1171 < var22.field3760.length) {
                        method2878(var22, arg0.field1171, arg0.field1175, arg0.field1138);
                    } else {
                        arg0.field1170 = -1;
                    }
                }
                arg0.field1166 = var22.field3758;
            }
        }
        if (arg0.field1173 > 0) {
            arg0.field1173--;
        }
    }

    @ObfuscatedName("o.fa(Lbw;I)V")
    public static final void method49(class76 arg0) {
        int var1 = arg0.field1184 - field1108;
        int var2 = arg0.field1160 * 128 + arg0.field1140 * 64;
        int var3 = arg0.field1182 * 128 + arg0.field1140 * 64;
        arg0.field1175 += (var2 - arg0.field1175) / var1;
        arg0.field1138 += (var3 - arg0.field1138) / var1;
        arg0.field1196 = 0;
        arg0.field1155 = arg0.field1186;
    }

    @ObfuscatedName("at.fc(Lbw;I)V")
    public static final void method530(class76 arg0) {
        if (arg0.field1191 == 0) {
            return;
        }
        if (arg0.field1164 != -1) {
            class76 var1 = null;
            if (arg0.field1164 < 32768) {
                var1 = field975[arg0.field1164];
            } else if (arg0.field1164 >= 32768) {
                var1 = field965[arg0.field1164 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1175 - var1.field1175;
                int var3 = arg0.field1138 - var1.field1138;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1155 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1189) {
                arg0.field1164 = -1;
                arg0.field1189 = false;
            }
        }
        if (arg0.field1143 != -1 && (arg0.field1192 == 0 || arg0.field1196 > 0)) {
            arg0.field1155 = arg0.field1143;
            arg0.field1143 = -1;
        }
        int var4 = arg0.field1155 - arg0.field1139 & 0x7FF;
        if (var4 == 0 && arg0.field1189) {
            arg0.field1164 = -1;
            arg0.field1189 = false;
        }
        if (var4 == 0) {
            arg0.field1151 = 0;
            return;
        }
        arg0.field1151++;
        if (var4 > 1024) {
            arg0.field1139 -= arg0.field1191;
            boolean var5 = true;
            if (var4 < arg0.field1191 || var4 > 2048 - arg0.field1191) {
                arg0.field1139 = arg0.field1155;
                var5 = false;
            }
            if (arg0.field1181 == arg0.field1172 && (arg0.field1151 > 25 || var5)) {
                if (arg0.field1144 == -1) {
                    arg0.field1172 = arg0.field1146;
                } else {
                    arg0.field1172 = arg0.field1144;
                }
            }
        } else {
            arg0.field1139 += arg0.field1191;
            boolean var6 = true;
            if (var4 < arg0.field1191 || var4 > 2048 - arg0.field1191) {
                arg0.field1139 = arg0.field1155;
                var6 = false;
            }
            if (arg0.field1181 == arg0.field1172 && (arg0.field1151 > 25 || var6)) {
                if (arg0.field1165 == -1) {
                    arg0.field1172 = arg0.field1146;
                } else {
                    arg0.field1172 = arg0.field1165;
                }
            }
        }
        arg0.field1139 &= 0x7FF;
    }

    @ObfuscatedName("gs.fv(Lbi;IIS)V")
    public static void method3172(class73 arg0, int arg1, int arg2) {
        if (arg0.field1170 == arg1 && arg1 != -1) {
            int var3 = class288.method2932(arg1).field3773;
            if (var3 == 1) {
                arg0.field1171 = 0;
                arg0.field1141 = 0;
                arg0.field1173 = arg2;
                arg0.field1187 = 0;
            }
            if (var3 == 2) {
                arg0.field1187 = 0;
            }
        } else if (arg1 == -1 || arg0.field1170 == -1 || class288.method2932(arg1).field3767 >= class288.method2932(arg0.field1170).field3767) {
            arg0.field1170 = arg1;
            arg0.field1171 = 0;
            arg0.field1141 = 0;
            arg0.field1173 = arg2;
            arg0.field1187 = 0;
            arg0.field1197 = arg0.field1192;
        }
    }

    @ObfuscatedName("bg.fq(B)I")
    public static int method727() {
        return field1061 ? 2 : 1;
    }

    @ObfuscatedName("al.fx(II)V")
    public static void method528(int arg0) {
        field1060 = 0L;
        if (arg0 >= 2) {
            field1061 = true;
        } else {
            field1061 = false;
        }
        if (method727() == 1) {
            Statics.field3013.method800(765, 503);
        } else {
            Statics.field3013.method800(7680, 2160);
        }
        if (field857 < 25) {
            return;
        }
        class185 var1 = class185.method343(class182.field2428, field1073.field1457);
        var1.field2478.method3220(method727());
        var1.field2478.method3323(Statics.field2021);
        var1.field2478.method3323(Statics.field659);
        field1073.method1916(var1);
    }

    @ObfuscatedName("client.z(I)V")
    public final void method807() {
        field1060 = Statics.method426() + 500L;
        this.method1152();
        if (field1009 != -1) {
            this.method1158(true);
        }
    }

    @ObfuscatedName("client.fo(I)V")
    public void method1152() {
        int var1 = Statics.field2021;
        int var2 = Statics.field659;
        if (this.field655 < var1) {
            int var3 = this.field655;
        }
        if (this.field656 < var2) {
            int var4 = this.field656;
        }
        if (Statics.field521 != null) {
            try {
                class54.method733(Statics.field3013, "resize", new Object[] { method727() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gu(I)V")
    public final void method1228() {
        if (field1009 != -1) {
            int var1 = field1009;
            if (class243.method1894(var1)) {
                method171(Statics.field2810[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1050; var2++) {
            if (field1052[var2]) {
                field905[var2] = true;
            }
            field1054[var2] = field1052[var2];
            field1052[var2] = false;
        }
        field1027 = field1108;
        field1005 = -1;
        field1090 = -1;
        Statics.field262 = null;
        if (field1009 != -1) {
            field1050 = 0;
            method5046(field1009, 0, 0, Statics.field2021, Statics.field659, 0, 0, -1);
        }
        class328.method5303();
        if (field985) {
            method594();
        } else if (field1005 != -1) {
            int var3 = field1005;
            int var4 = field1090;
            if ((field977 >= 2 || field1002 != 0 || field934) && field997) {
                int var5 = field977 - 1;
                String var7;
                if (field1002 == 1 && field977 < 2) {
                    var7 = class252.field3062 + class252.field3236 + field1003 + " " + class87.field1298;
                } else if (field934 && field977 < 2) {
                    var7 = field1007 + class252.field3236 + field1075 + " " + class87.field1298;
                } else {
                    var7 = method590(var5);
                }
                if (field977 > 2) {
                    var7 = var7 + class87.method501(16777215) + " " + '/' + " " + (field977 - 2) + class252.field3090;
                }
                Statics.field32.method5081(var7, var3 + 4, var4 + 15, 16777215, 0, field1108 / 1000);
            }
        }
        if (field1059 == 3) {
            for (int var8 = 0; var8 < field1050; var8++) {
                if (field1054[var8]) {
                    class328.method5318(field1055[var8], field1006[var8], field1057[var8], field998[var8], 16711935, 128);
                } else if (field905[var8]) {
                    class328.method5318(field1055[var8], field1006[var8], field1057[var8], field998[var8], 16711680, 128);
                }
            }
        }
        int var9 = Statics.field3841;
        int var10 = Statics.field434.field1175;
        int var11 = Statics.field434.field1138;
        int var12 = field911;
        for (class81 var13 = (class81) class81.field1241.method3731(); var13 != null; var13 = (class81) class81.field1241.method3733()) {
            if (var13.field1242 != -1 || var13.field1237 != null) {
                int var14 = 0;
                if (var10 > var13.field1250) {
                    var14 += var10 - var13.field1250;
                } else if (var10 < var13.field1244) {
                    var14 += var13.field1244 - var10;
                }
                if (var11 > var13.field1246) {
                    var14 += var11 - var13.field1246;
                } else if (var11 < var13.field1240) {
                    var14 += var13.field1240 - var11;
                }
                if (var14 - 64 > var13.field1243 || field1084 == 0 || var13.field1238 != var9) {
                    if (var13.field1245 != null) {
                        Statics.field3885.method1930(var13.field1245);
                        var13.field1245 = null;
                    }
                    if (var13.field1239 != null) {
                        Statics.field3885.method1930(var13.field1239);
                        var13.field1239 = null;
                    }
                } else {
                    var14 -= 64;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = field1084 * (var13.field1243 - var14) / var13.field1243;
                    class104 var10000;
                    if (var13.field1245 != null) {
                        var13.field1245.method2136(var15);
                    } else if (var13.field1242 >= 0) {
                        var10000 = (class104) null;
                        class104 var16 = class104.method1994(Statics.field399, var13.field1242, 0);
                        if (var16 != null) {
                            class106 var17 = var16.method1983().method2023(Statics.field524);
                            class116 var18 = class116.method2132(var17, 100, var15);
                            var18.method2186(-1);
                            Statics.field3885.method1929(var18);
                            var13.field1245 = var18;
                        }
                    }
                    if (var13.field1239 != null) {
                        var13.field1239.method2136(var15);
                        if (!var13.field1239.method3719()) {
                            var13.field1239 = null;
                        }
                    } else if (var13.field1237 != null && (var13.field1249 -= var12) <= 0) {
                        int var19 = (int) (Math.random() * (double) var13.field1237.length);
                        var10000 = (class104) null;
                        class104 var20 = class104.method1994(Statics.field399, var13.field1237[var19], 0);
                        if (var20 != null) {
                            class106 var21 = var20.method1983().method2023(Statics.field524);
                            class116 var22 = class116.method2132(var21, 100, var15);
                            var22.method2186(0);
                            Statics.field3885.method1929(var22);
                            var13.field1239 = var22;
                            var13.field1249 = var13.field1247 + (int) (Math.random() * (double) (var13.field1248 - var13.field1247));
                        }
                    }
                }
            }
        }
        field911 = 0;
    }

    @ObfuscatedName("e.gd(IIIII)V")
    public static final void method21(int arg0, int arg1, int arg2, int arg3) {
        field1044++;
        method3046();
        method1897();
        method1826();
        method526(true);
        method4562();
        method526(false);
        for (class92 var4 = (class92) field1078.method3731(); var4 != null; var4 = (class92) field1078.method3733()) {
            if (Statics.field3841 != var4.field1363 || field1108 > var4.field1369) {
                var4.method3721();
            } else if (field1108 >= var4.field1368) {
                if (var4.field1372 > 0) {
                    class85 var5 = field975[var4.field1372 - 1];
                    if (var5 != null && var5.field1175 >= 0 && var5.field1175 < 13312 && var5.field1138 >= 0 && var5.field1138 < 13312) {
                        var4.method1808(var5.field1175, var5.field1138, method2870(var5.field1175, var5.field1138, var4.field1363) - var4.field1367, field1108);
                    }
                }
                if (var4.field1372 < 0) {
                    int var6 = -var4.field1372 - 1;
                    class73 var7;
                    if (field1056 == var6) {
                        var7 = Statics.field434;
                    } else {
                        var7 = field965[var6];
                    }
                    if (var7 != null && var7.field1175 >= 0 && var7.field1175 < 13312 && var7.field1138 >= 0 && var7.field1138 < 13312) {
                        var4.method1808(var7.field1175, var7.field1138, method2870(var7.field1175, var7.field1138, var4.field1363) - var4.field1367, field1108);
                    }
                }
                var4.method1809(field911);
                Statics.field495.method2657(Statics.field3841, (int) var4.field1374, (int) var4.field1375, (int) var4.field1376, 60, var4, var4.field1365, -1, false);
            }
        }
        for (class83 var8 = (class83) field980.method3731(); var8 != null; var8 = (class83) field980.method3733()) {
            if (Statics.field3841 != var8.field1266 || var8.field1272) {
                var8.method3721();
            } else if (field1108 >= var8.field1267) {
                var8.method1732(field911);
                if (var8.field1272) {
                    var8.method3721();
                } else {
                    Statics.field495.method2657(var8.field1266, var8.field1269, var8.field1270, var8.field1271, 60, var8, 0, -1, false);
                }
            }
        }
        method342(arg0, arg1, arg2, arg3, true);
        int var9 = field1105;
        int var10 = field1106;
        int var11 = field1107;
        int var12 = field946;
        class328.method5320(var9, var10, var9 + var11, var10 + var12);
        class135.method2617();
        if (!field852) {
            int var13 = field918;
            if (field993 / 256 > var13) {
                var13 = field993 / 256;
            }
            if (field1092[4] && field1094[4] + 128 > var13) {
                var13 = field1094[4] + 128;
            }
            int var14 = field919 & 0x7FF;
            int var15 = Statics.field416;
            int var16 = Statics.field2034;
            int var17 = Statics.field2570;
            int var18 = var13 * 3 + 600;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 2048 - var14 & 0x7FF;
            int var21 = 0;
            int var22 = 0;
            int var23 = var18;
            if (var19 != 0) {
                int var24 = class135.field1935[var19];
                int var25 = class135.field1936[var19];
                int var26 = var22 * var25 - var18 * var24 >> 16;
                var23 = var22 * var24 + var18 * var25 >> 16;
                var22 = var26;
            }
            if (var20 != 0) {
                int var27 = class135.field1935[var20];
                int var28 = class135.field1936[var20];
                int var29 = var21 * var28 + var23 * var27 >> 16;
                var23 = var23 * var28 - var21 * var27 >> 16;
                var21 = var29;
            }
            Statics.field1410 = var15 - var21;
            Statics.field2131 = var16 - var22;
            Statics.field250 = var17 - var23;
            Statics.field436 = var13;
            Statics.field711 = var14;
            if (field924 == 1 && field936 >= 2 && field1108 % 50 == 0 && (Statics.field416 >> 7 != Statics.field434.field1175 >> 7 || Statics.field2570 >> 7 != Statics.field434.field1138 >> 7)) {
                int var30 = Statics.field434.field837;
                int var31 = (Statics.field416 >> 7) + Statics.field494;
                int var32 = (Statics.field2570 >> 7) + Statics.field2794;
                method2322(var31, var32, var30, true);
            }
        }
        int var45;
        if (field852) {
            int var46;
            if (Statics.field521.field1223) {
                var46 = Statics.field3841;
            } else {
                int var47 = method2870(Statics.field1410, Statics.field250, Statics.field3841);
                if (var47 - Statics.field2131 >= 800 || (class63.field704[Statics.field3841][Statics.field1410 >> 7][Statics.field250 >> 7] & 0x4) == 0) {
                    var46 = 3;
                } else {
                    var46 = Statics.field3841;
                }
            }
            var45 = var46;
        } else {
            int var33;
            if (Statics.field521.field1223) {
                var33 = Statics.field3841;
            } else {
                label567: {
                    int var34 = 3;
                    if (Statics.field436 < 310) {
                        int var35;
                        int var36;
                        if (field924 == 1) {
                            var35 = Statics.field416 >> 7;
                            var36 = Statics.field2570 >> 7;
                        } else {
                            var35 = Statics.field434.field1175 >> 7;
                            var36 = Statics.field434.field1138 >> 7;
                        }
                        int var37 = Statics.field1410 >> 7;
                        int var38 = Statics.field250 >> 7;
                        if (var37 < 0 || var38 < 0 || var37 >= 104 || var38 >= 104) {
                            var33 = Statics.field3841;
                            break label567;
                        }
                        if (var35 < 0 || var36 < 0 || var35 >= 104 || var36 >= 104) {
                            var33 = Statics.field3841;
                            break label567;
                        }
                        if ((class63.field704[Statics.field3841][var37][var38] & 0x4) != 0) {
                            var34 = Statics.field3841;
                        }
                        int var39;
                        if (var35 > var37) {
                            var39 = var35 - var37;
                        } else {
                            var39 = var37 - var35;
                        }
                        int var40;
                        if (var36 > var38) {
                            var40 = var36 - var38;
                        } else {
                            var40 = var38 - var36;
                        }
                        if (var39 > var40) {
                            int var41 = var40 * 65536 / var39;
                            int var42 = 32768;
                            while (var35 != var37) {
                                if (var37 < var35) {
                                    var37++;
                                } else if (var37 > var35) {
                                    var37--;
                                }
                                if ((class63.field704[Statics.field3841][var37][var38] & 0x4) != 0) {
                                    var34 = Statics.field3841;
                                }
                                var42 += var41;
                                if (var42 >= 65536) {
                                    var42 -= 65536;
                                    if (var38 < var36) {
                                        var38++;
                                    } else if (var38 > var36) {
                                        var38--;
                                    }
                                    if ((class63.field704[Statics.field3841][var37][var38] & 0x4) != 0) {
                                        var34 = Statics.field3841;
                                    }
                                }
                            }
                        } else if (var40 > 0) {
                            int var43 = var39 * 65536 / var40;
                            int var44 = 32768;
                            while (var36 != var38) {
                                if (var38 < var36) {
                                    var38++;
                                } else if (var38 > var36) {
                                    var38--;
                                }
                                if ((class63.field704[Statics.field3841][var37][var38] & 0x4) != 0) {
                                    var34 = Statics.field3841;
                                }
                                var44 += var43;
                                if (var44 >= 65536) {
                                    var44 -= 65536;
                                    if (var37 < var35) {
                                        var37++;
                                    } else if (var37 > var35) {
                                        var37--;
                                    }
                                    if ((class63.field704[Statics.field3841][var37][var38] & 0x4) != 0) {
                                        var34 = Statics.field3841;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field434.field1175 >= 0 && Statics.field434.field1138 >= 0 && Statics.field434.field1175 < 13312 && Statics.field434.field1138 < 13312) {
                        if ((class63.field704[Statics.field3841][Statics.field434.field1175 >> 7][Statics.field434.field1138 >> 7] & 0x4) != 0) {
                            var34 = Statics.field3841;
                        }
                        var33 = var34;
                    } else {
                        var33 = Statics.field3841;
                    }
                }
            }
            var45 = var33;
        }
        int var48 = Statics.field1410;
        int var49 = Statics.field2131;
        int var50 = Statics.field250;
        int var51 = Statics.field436;
        int var52 = Statics.field711;
        for (int var53 = 0; var53 < 5; var53++) {
            if (field1092[var53]) {
                int var54 = (int) (Math.random() * (double) (field1093[var53] * 2 + 1) - (double) field1093[var53] + Math.sin((double) field1095[var53] / 100.0D * (double) field1097[var53]) * (double) field1094[var53]);
                if (var53 == 0) {
                    Statics.field1410 += var54;
                }
                if (var53 == 1) {
                    Statics.field2131 += var54;
                }
                if (var53 == 2) {
                    Statics.field250 += var54;
                }
                if (var53 == 3) {
                    Statics.field711 = Statics.field711 + var54 & 0x7FF;
                }
                if (var53 == 4) {
                    Statics.field436 += var54;
                    if (Statics.field436 < 128) {
                        Statics.field436 = 128;
                    }
                    if (Statics.field436 > 383) {
                        Statics.field436 = 383;
                    }
                }
            }
        }
        int var55 = class61.field685;
        int var56 = class61.field686;
        if (class61.field679 != 0) {
            var55 = class61.field692;
            var56 = class61.field693;
        }
        if (var55 >= var9 && var55 < var9 + var11 && var56 >= var10 && var56 < var10 + var12) {
            class133.method1578(var55 - var9, var56 - var10);
        } else {
            class133.field1899 = false;
            class133.field1901 = 0;
        }
        method525();
        class328.method5275(var9, var10, var11, var12, 0);
        method525();
        int var57 = class135.field1930;
        class135.field1930 = field1109;
        Statics.field495.method2687(Statics.field1410, Statics.field2131, Statics.field250, Statics.field436, Statics.field711, var45);
        while (true) {
            class10 var58 = (class10) class8.field226.method3682();
            if (var58 == null) {
                class135.field1930 = var57;
                method525();
                Statics.field495.method2660();
                field940 = 0;
                boolean var59 = false;
                int var60 = -1;
                int var61 = -1;
                int var62 = class94.field1397;
                int[] var63 = class94.field1398;
                for (int var64 = 0; var64 < field865 + var62; var64++) {
                    class76 var65;
                    if (var64 < var62) {
                        var65 = field965[var63[var64]];
                        if (field891 == var63[var64]) {
                            var59 = true;
                            var60 = var64;
                            continue;
                        }
                        if (Statics.field434 == var65) {
                            var61 = var64;
                            continue;
                        }
                    } else {
                        var65 = field975[field892[var64 - var62]];
                    }
                    method4371(var65, var64, var9, var10, var11, var12);
                }
                if (field968 && var61 != -1) {
                    method4371(Statics.field434, var61, var9, var10, var11, var12);
                }
                if (var59) {
                    method4371(field965[field891], var60, var9, var10, var11, var12);
                }
                for (int var66 = 0; var66 < field940; var66++) {
                    int var67 = field984[var66];
                    int var68 = field927[var66];
                    int var69 = field941[var66];
                    int var70 = field966[var66];
                    boolean var71 = true;
                    while (var71) {
                        var71 = false;
                        for (int var72 = 0; var72 < var66; var72++) {
                            if (var68 + 2 > field927[var72] - field966[var72] && var68 - var70 < field927[var72] + 2 && var67 - var69 < field984[var72] + field941[var72] && var67 + var69 > field984[var72] - field941[var72] && field927[var72] - field966[var72] < var68) {
                                var68 = field927[var72] - field966[var72];
                                var71 = true;
                            }
                        }
                    }
                    field960 = field984[var66];
                    field932 = field927[var66] = var68;
                    String var73 = field898[var66];
                    if (field1011 == 0) {
                        int var74 = 16776960;
                        if (field979[var66] < 6) {
                            var74 = field929[field979[var66]];
                        }
                        if (field979[var66] == 6) {
                            var74 = field1044 % 20 < 10 ? 16711680 : 16776960;
                        }
                        if (field979[var66] == 7) {
                            var74 = field1044 % 20 < 10 ? 255 : 65535;
                        }
                        if (field979[var66] == 8) {
                            var74 = field1044 % 20 < 10 ? 45056 : 8454016;
                        }
                        if (field979[var66] == 9) {
                            int var75 = 150 - field944[var66];
                            if (var75 < 50) {
                                var74 = var75 * 1280 + 16711680;
                            } else if (var75 < 100) {
                                var74 = 16776960 - (var75 - 50) * 327680;
                            } else if (var75 < 150) {
                                var74 = (var75 - 100) * 5 + 65280;
                            }
                        }
                        if (field979[var66] == 10) {
                            int var76 = 150 - field944[var66];
                            if (var76 < 50) {
                                var74 = var76 * 5 + 16711680;
                            } else if (var76 < 100) {
                                var74 = 16711935 - (var76 - 50) * 327680;
                            } else if (var76 < 150) {
                                var74 = (var76 - 100) * 327680 + 255 - (var76 - 100) * 5;
                            }
                        }
                        if (field979[var66] == 11) {
                            int var77 = 150 - field944[var66];
                            if (var77 < 50) {
                                var74 = 16777215 - var77 * 327685;
                            } else if (var77 < 100) {
                                var74 = (var77 - 50) * 327685 + 65280;
                            } else if (var77 < 150) {
                                var74 = 16777215 - (var77 - 100) * 327680;
                            }
                        }
                        if (field943[var66] == 0) {
                            Statics.field32.method5076(var73, field960 + var9, field932 + var10, var74, 0);
                        }
                        if (field943[var66] == 1) {
                            Statics.field32.method5066(var73, field960 + var9, field932 + var10, var74, 0, field1044);
                        }
                        if (field943[var66] == 2) {
                            Statics.field32.method5094(var73, field960 + var9, field932 + var10, var74, 0, field1044);
                        }
                        if (field943[var66] == 3) {
                            Statics.field32.method5080(var73, field960 + var9, field932 + var10, var74, 0, field1044, 150 - field944[var66]);
                        }
                        if (field943[var66] == 4) {
                            int var78 = (150 - field944[var66]) * (Statics.field32.method5068(var73) + 100) / 150;
                            class328.method5268(field960 + var9 - 50, var10, field960 + var9 + 50, var10 + var12);
                            Statics.field32.method5073(var73, field960 + var9 + 50 - var78, field932 + var10, var74, 0);
                            class328.method5320(var9, var10, var9 + var11, var10 + var12);
                        }
                        if (field943[var66] == 5) {
                            int var79 = 150 - field944[var66];
                            int var80 = 0;
                            if (var79 < 25) {
                                var80 = var79 - 25;
                            } else if (var79 > 125) {
                                var80 = var79 - 125;
                            }
                            class328.method5268(var9, field932 + var10 - Statics.field32.field3893 - 1, var9 + var11, field932 + var10 + 5);
                            Statics.field32.method5076(var73, field960 + var9, field932 + var10 + var80, var74, 0);
                            class328.method5320(var9, var10, var9 + var11, var10 + var12);
                        }
                    } else {
                        Statics.field32.method5076(var73, field960 + var9, field932 + var10, 16776960, 0);
                    }
                }
                method4303(var9, var10);
                ((class124) Statics.field1932).method2354(field911);
                if (field954) {
                    if (field953 == 1) {
                        Statics.field315[field1089 / 100].method5445(field976 - 8, field951 - 8);
                    }
                    if (field953 == 2) {
                        Statics.field315[field1089 / 100 + 4].method5445(field976 - 8, field951 - 8);
                    }
                }
                method722();
                Statics.field1410 = var48;
                Statics.field2131 = var49;
                Statics.field250 = var50;
                Statics.field436 = var51;
                Statics.field711 = var52;
                if (field950) {
                    byte var81 = 0;
                    int var82 = class265.field3417 + class265.field3415 + var81;
                    if (var82 == 0) {
                        field950 = false;
                    }
                }
                if (field950) {
                    class328.method5275(var9, var10, var11, var12, 0);
                    Statics.method154(class252.field3032, false);
                }
                return;
            }
            var58.method32();
        }
    }

    @ObfuscatedName("ap.gg(IIIIZI)V")
    public static final void method342(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1098 - field1053) * var5 / 100 + field1053;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1103) {
            short var8 = field1103;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1102) {
                var6 = field1102;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class328.method5303();
                    class328.method5275(arg0, arg1, var10, arg3, -16777216);
                    class328.method5275(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1104) {
            short var11 = field1104;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1101) {
                var6 = field1101;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class328.method5303();
                    class328.method5275(arg0, arg1, arg2, var13, -16777216);
                    class328.method5275(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1100 - field923) * var5 / 100 + field923;
        field1109 = arg3 * var6 * var14 / 85504 << 1;
        if (field1107 != arg2 || field946 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class135.field1935[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class138.method2787(var15, 500, 800, arg2, arg3);
        }
        field1105 = arg0;
        field1106 = arg1;
        field1107 = arg2;
        field946 = arg3;
    }

    @ObfuscatedName("fm.go(I)V")
    public static void method3046() {
        if (Statics.field434.field1175 >> 7 == field1077 && Statics.field434.field1138 >> 7 == field904) {
            field1077 = 0;
        }
    }

    @ObfuscatedName("cz.gs(B)V")
    public static void method1897() {
        if (field968) {
            method1001(Statics.field434, false);
        }
    }

    @ObfuscatedName("cx.gp(B)V")
    public static void method1826() {
        if (field891 >= 0 && field965[field891] != null) {
            method1001(field965[field891], false);
        }
    }

    @ObfuscatedName("jv.gi(B)V")
    public static void method4562() {
        int var0 = class94.field1397;
        int[] var1 = class94.field1398;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field891 != var1[var2] && field1056 != var1[var2]) {
                method1001(field965[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("bt.gh(Lbi;ZB)V")
    public static void method1001(class73 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1102() || arg0.field843) {
            return;
        }
        int var2 = arg0.field838 << 14;
        arg0.field834 = false;
        if ((field855 && class94.field1397 > 50 || class94.field1397 > 200) && arg1 && arg0.field1181 == arg0.field1172) {
            arg0.field834 = true;
        }
        int var3 = arg0.field1175 >> 7;
        int var4 = arg0.field1138 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field829 != null && field1108 >= arg0.field824 && field1108 < arg0.field825) {
            arg0.field834 = false;
            arg0.field823 = method2870(arg0.field1175, arg0.field1138, Statics.field3841);
            arg0.field1142 = field1108;
            Statics.field495.method2658(Statics.field3841, arg0.field1175, arg0.field1138, arg0.field823, 60, arg0, arg0.field1139, var2, arg0.field816, arg0.field815, arg0.field830, arg0.field842);
            return;
        }
        if ((arg0.field1175 & 0x7F) == 64 && (arg0.field1138 & 0x7F) == 64) {
            if (field1044 == field1079[var3][var4]) {
                return;
            }
            field1079[var3][var4] = field1044;
        }
        arg0.field823 = method2870(arg0.field1175, arg0.field1138, Statics.field3841);
        arg0.field1142 = field1108;
        Statics.field495.method2657(Statics.field3841, arg0.field1175, arg0.field1138, arg0.field823, 60, arg0, arg0.field1139, var2, arg0.field1166);
    }

    @ObfuscatedName("al.gk(ZI)V")
    public static final void method526(boolean arg0) {
        for (int var1 = 0; var1 < field865; var1++) {
            class85 var2 = field975[field892[var1]];
            int var3 = (field892[var1] << 14) + 536870912;
            if (var2 != null && var2.method1102() && var2.field1284.field3731 == arg0 && var2.field1284.method4751()) {
                int var4 = var2.field1175 >> 7;
                int var5 = var2.field1138 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1140 == 1 && (var2.field1175 & 0x7F) == 64 && (var2.field1138 & 0x7F) == 64) {
                        if (field1044 == field1079[var4][var5]) {
                            continue;
                        }
                        field1079[var4][var5] = field1044;
                    }
                    if (!var2.field1284.field3739) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    var2.field1142 = field1108;
                    Statics.field495.method2657(Statics.field3841, var2.field1175, var2.field1138, method2870(var2.field1175 + (var2.field1140 * 64 - 64), var2.field1138 + (var2.field1140 * 64 - 64), Statics.field3841), var2.field1140 * 64 - 64 + 60, var2, var2.field1139, var3, var2.field1166);
                }
            }
        }
    }

    @ObfuscatedName("jt.ge(IIB)V")
    public static final void method4303(int arg0, int arg1) {
        if (field949 == 2) {
            method186((field990 - Statics.field494 << 7) + field873, (field871 - Statics.field2794 << 7) + field874, field1030 * 2);
            if (field960 > -1 && field1108 % 20 < 10) {
                Statics.field2759[0].method5445(field960 + arg0 - 12, field932 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("jl.gq(I)Z")
    public static boolean method4546() {
        return (field969 & 0x2) != 0;
    }

    @ObfuscatedName("cu.gb(Lbi;I)Z")
    public static boolean method1659(class73 arg0) {
        if (field969 == 0) {
            return false;
        } else if (Statics.field434 == arg0) {
            return (field969 & 0x8) != 0;
        } else {
            boolean var1 = (field969 & 0x4) != 0;
            boolean var2 = var1;
            if (!var1) {
                boolean var3 = (field969 & 0x1) != 0;
                var2 = var3 && arg0.method1127();
            }
            return var2 || method4546() && arg0.method1094();
        }
    }

    @ObfuscatedName("ja.gc(Lbw;IIIIIB)V")
    public static final void method4371(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1102()) {
            return;
        }
        if (arg0 instanceof class85) {
            class286 var6 = ((class85) arg0).field1284;
            if (var6.field3736 != null) {
                var6 = var6.method4724();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class94.field1397;
        int[] var8 = class94.field1398;
        byte var9 = 0;
        if (arg1 < var7 && field1108 == arg0.field1142 && method1659((class73) arg0)) {
            class73 var10 = (class73) arg0;
            if (arg1 < var7) {
                method237(arg0, arg0.field1174 + 15);
                class313 var11 = (class313) field901.get(class310.field3877);
                byte var12 = 9;
                var11.method5076(var10.field820.method5022(), field960 + arg2, field932 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field1163.method3686()) {
            method237(arg0, arg0.field1174 + 15);
            for (class84 var14 = (class84) arg0.field1163.method3683(); var14 != null; var14 = (class84) arg0.field1163.method3702()) {
                class77 var15 = var14.method1738(field1108);
                if (var15 != null) {
                    class276 var16 = var14.field1279;
                    class332 var17 = var16.method4480();
                    class332 var18 = var16.method4471();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3536;
                    } else {
                        if (var16.field3532 * 2 < var18.field3984) {
                            var19 = var16.field3532;
                        }
                        var20 = var18.field3984 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field1108 - var15.field1202;
                    int var24 = var15.field1199 * var20 / var16.field3536;
                    int var27;
                    if (var15.field1201 > var23) {
                        int var25 = var16.field3525 == 0 ? 0 : var23 / var16.field3525 * var16.field3525;
                        int var26 = var15.field1198 * var20 / var16.field3536;
                        var27 = (var24 - var26) * var25 / var15.field1201 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1201 + var16.field3533 - var23;
                        if (var16.field3531 >= 0) {
                            var21 = (var28 << 8) / (var16.field3533 - var16.field3531);
                        }
                    }
                    if (var15.field1199 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field960 > -1) {
                            int var34 = field960 + arg2 - (var20 >> 1);
                            int var35 = field932 + arg3 - var13;
                            class328.method5275(var34, var35, var27, 5, 65280);
                            class328.method5275(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3985;
                        var13 += var30;
                        int var31 = field960 + arg2 - (var20 >> 1);
                        int var32 = field932 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5404(var33, var32, var21);
                            class328.method5268(var33, var32, var29 + var33, var30 + var32);
                            var18.method5404(var33, var32, var21);
                        } else {
                            var17.method5445(var33, var32);
                            class328.method5268(var33, var32, var29 + var33, var30 + var32);
                            var18.method5445(var33, var32);
                        }
                        class328.method5320(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1739()) {
                    var14.method3721();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class73 var37 = (class73) arg0;
            if (var37.field843) {
                return;
            }
            if (var37.field817 != -1 || var37.field818 != -1) {
                method237(arg0, arg0.field1174 + 15);
                if (field960 > -1) {
                    if (var37.field817 != -1) {
                        var36 += 25;
                        Statics.field738[var37.field817].method5445(field960 + arg2 - 12, field932 + arg3 - var36);
                    }
                    if (var37.field818 != -1) {
                        var36 += 25;
                        Statics.field249[var37.field818].method5445(field960 + arg2 - 12, field932 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field949 == 10 && field869 == var8[arg1]) {
                method237(arg0, arg0.field1174 + 15);
                if (field960 > -1) {
                    int var38 = Statics.field2759[1].field3985 + var36;
                    Statics.field2759[1].method5445(field960 + arg2 - 12, field932 + arg3 - var38);
                }
            }
        } else {
            class286 var39 = ((class85) arg0).field1284;
            if (var39.field3736 != null) {
                var39 = var39.method4724();
            }
            if (var39.field3734 >= 0 && var39.field3734 < Statics.field249.length) {
                method237(arg0, arg0.field1174 + 15);
                if (field960 > -1) {
                    Statics.field249[var39.field3734].method5445(field960 + arg2 - 12, field932 + arg3 - 30);
                }
            }
            if (field949 == 1 && field868 == field892[arg1 - var7] && field1108 % 20 < 10) {
                method237(arg0, arg0.field1174 + 15);
                if (field960 > -1) {
                    Statics.field2759[0].method5445(field960 + arg2 - 12, field932 + arg3 - 28);
                }
            }
        }
        if (arg0.field1188 != null && (arg1 >= var7 || !arg0.field1153 && (field1063 == 4 || !arg0.field1152 && (field1063 == 0 || field1063 == 3 || field1063 == 1 && ((class73) arg0).method1127())))) {
            method237(arg0, arg0.field1174);
            if (field960 > -1 && field940 < field937) {
                field941[field940] = Statics.field32.method5068(arg0.field1188) / 2;
                field966[field940] = Statics.field32.field3893;
                field984[field940] = field960;
                field927[field940] = field932;
                field979[field940] = arg0.field1150;
                field943[field940] = arg0.field1156;
                field944[field940] = arg0.field1154;
                field898[field940] = arg0.field1188;
                field940++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field1145[var40];
            int var42 = arg0.field1158[var40];
            class282 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field1108) {
                    continue;
                }
                var43 = class282.method1511(arg0.field1158[var40]);
                var44 = var43.field3581;
                if (var43 != null && var43.field3592 != null) {
                    var43 = var43.method4586();
                    if (var43 == null) {
                        arg0.field1145[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field1161[var40];
            class282 var46 = null;
            if (var45 >= 0) {
                var46 = class282.method1511(var45);
                if (var46 != null && var46.field3592 != null) {
                    var46 = var46.method4586();
                }
            }
            if (var41 - var44 <= field1108) {
                if (var43 == null) {
                    arg0.field1145[var40] = -1;
                } else {
                    method237(arg0, arg0.field1174 / 2);
                    if (field960 > -1) {
                        if (var40 == 1) {
                            field932 -= 20;
                        }
                        if (var40 == 2) {
                            field960 -= 15;
                            field932 -= 10;
                        }
                        if (var40 == 3) {
                            field960 += 15;
                            field932 -= 10;
                        }
                        Object var47 = null;
                        Object var48 = null;
                        Object var49 = null;
                        Object var50 = null;
                        int var51 = 0;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        class332 var59 = null;
                        class332 var60 = null;
                        class332 var61 = null;
                        class332 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class332 var72 = var43.method4569();
                        if (var72 != null) {
                            var51 = var72.field3984;
                            int var73 = var72.field3985;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3991;
                        }
                        class332 var74 = var43.method4570();
                        if (var74 != null) {
                            var52 = var74.field3984;
                            int var75 = var74.field3985;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3991;
                        }
                        class332 var76 = var43.method4571();
                        if (var76 != null) {
                            var53 = var76.field3984;
                            int var77 = var76.field3985;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3991;
                        }
                        class332 var78 = var43.method4572();
                        if (var78 != null) {
                            var54 = var78.field3984;
                            int var79 = var78.field3985;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3991;
                        }
                        if (var46 != null) {
                            var59 = var46.method4569();
                            if (var59 != null) {
                                var63 = var59.field3984;
                                int var80 = var59.field3985;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3991;
                            }
                            var60 = var46.method4570();
                            if (var60 != null) {
                                var64 = var60.field3984;
                                int var81 = var60.field3985;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3991;
                            }
                            var61 = var46.method4571();
                            if (var61 != null) {
                                var65 = var61.field3984;
                                int var82 = var61.field3985;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3991;
                            }
                            var62 = var46.method4572();
                            if (var62 != null) {
                                var66 = var62.field3984;
                                int var83 = var62.field3985;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3991;
                            }
                        }
                        class312 var84 = var43.method4573();
                        if (var84 == null) {
                            var84 = Statics.field2260;
                        }
                        class312 var85;
                        if (var46 == null) {
                            var85 = Statics.field2260;
                        } else {
                            var85 = var46.method4573();
                            if (var85 == null) {
                                var85 = Statics.field2260;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4591(arg0.field1137[var40]);
                        int var91 = var84.method5068(var90);
                        if (var46 != null) {
                            var87 = var46.method4591(arg0.field1162[var40]);
                            var89 = var85.method5068(var87);
                        }
                        int var92 = 0;
                        int var93 = 0;
                        if (var52 > 0) {
                            if (var76 == null && var78 == null) {
                                var92 = 1;
                            } else {
                                var92 = var91 / var52 + 1;
                            }
                        }
                        if (var46 != null && var64 > 0) {
                            if (var61 == null && var62 == null) {
                                var93 = 1;
                            } else {
                                var93 = var89 / var64 + 1;
                            }
                        }
                        int var94 = 0;
                        int var95 = var94;
                        if (var51 > 0) {
                            var94 += var51;
                        }
                        var94 += 2;
                        int var96 = var94;
                        if (var53 > 0) {
                            var94 += var53;
                        }
                        int var97 = var94;
                        int var98 = var94;
                        int var100;
                        if (var52 > 0) {
                            int var99 = var52 * var92;
                            var100 = var94 + var99;
                            var98 = (var99 - var91) / 2 + var94;
                        } else {
                            var100 = var91 + var94;
                        }
                        int var101 = var100;
                        if (var54 > 0) {
                            var100 += var54;
                        }
                        int var102 = 0;
                        int var103 = 0;
                        int var104 = 0;
                        int var105 = 0;
                        int var106 = 0;
                        if (var46 != null) {
                            var100 += 2;
                            var102 = var100;
                            if (var63 > 0) {
                                var100 += var63;
                            }
                            var100 += 2;
                            var103 = var100;
                            if (var65 > 0) {
                                var100 += var65;
                            }
                            var104 = var100;
                            var106 = var100;
                            if (var64 > 0) {
                                int var107 = var64 * var93;
                                var100 += var107;
                                var106 += (var107 - var89) / 2;
                            } else {
                                var100 += var89;
                            }
                            var105 = var100;
                            if (var66 > 0) {
                                var100 += var66;
                            }
                        }
                        int var108 = arg0.field1145[var40] - field1108;
                        int var109 = var43.field3579 - var43.field3579 * var108 / var43.field3581;
                        int var110 = var43.field3590 * var108 / var43.field3581 + -var43.field3590;
                        int var111 = field960 + arg2 - (var100 >> 1) + var109;
                        int var112 = field932 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3583 + var112 + 15;
                        int var116 = var115 - var84.field3898;
                        int var117 = var84.field3899 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3583 + var112 + 15;
                            int var119 = var118 - var85.field3898;
                            int var120 = var85.field3899 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3588 >= 0) {
                            var123 = (var108 << 8) / (var43.field3581 - var43.field3588);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5404(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5404(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5404(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5404(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5074(var90, var98 + var111, var115, var43.field3580, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5404(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5404(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5404(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5404(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5074(var87, var106 + var111, var118, var46.field3580, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5445(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5445(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5445(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5445(var101 + var111 - var58, var112);
                            }
                            var84.method5073(var90, var98 + var111, var115, var43.field3580 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5445(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5445(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5445(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5445(var105 + var111 - var70, var112);
                                }
                                var85.method5073(var87, var106 + var111, var118, var46.field3580 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.gf(I)V")
    public static final void method722() {
        field963 = 0;
        int var0 = (Statics.field434.field1175 >> 7) + Statics.field494;
        int var1 = (Statics.field434.field1138 >> 7) + Statics.field2794;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field963 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field963 = 1;
        }
        if (field963 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field963 = 0;
        }
    }

    @ObfuscatedName("av.gt(Lbw;II)V")
    public static final void method237(class76 arg0, int arg1) {
        method186(arg0.field1175, arg0.field1138, arg1);
    }

    @ObfuscatedName("m.gr(IIIB)V")
    public static final void method186(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field960 = -1;
            field932 = -1;
            return;
        }
        int var3 = method2870(arg0, arg1, Statics.field3841) - arg2;
        int var4 = arg0 - Statics.field1410;
        int var5 = var3 - Statics.field2131;
        int var6 = arg1 - Statics.field250;
        int var7 = class135.field1935[Statics.field436];
        int var8 = class135.field1936[Statics.field436];
        int var9 = class135.field1935[Statics.field711];
        int var10 = class135.field1936[Statics.field711];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field960 = field1109 * var11 / var15 + field1107 / 2;
            field932 = field1109 * var14 / var15 + field946 / 2;
        } else {
            field960 = -1;
            field932 = -1;
        }
    }

    @ObfuscatedName("ef.gn(IIII)I")
    public static final int method2870(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class63.field704[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class63.field707[var5][var3][var4] + class63.field707[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class63.field707[var5][var3][var4 + 1] + class63.field707[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("y.gl(ZLgz;I)V")
    public static final void method175(boolean arg0, class202 arg1) {
        field1015 = arg0;
        if (!field1015) {
            int var2 = arg1.method3273();
            int var3 = arg1.method3275();
            int var4 = arg1.method3238();
            Statics.field3357 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field3357[var5][var6] = arg1.method3241();
                }
            }
            Statics.field3388 = new int[var4];
            Statics.field770 = new int[var4];
            Statics.field1268 = new int[var4];
            Statics.field2602 = new byte[var4][];
            Statics.field1254 = new byte[var4][];
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
                        Statics.field3388[var8] = var11;
                        Statics.field770[var8] = Statics.field1908.method4210("m" + var9 + "_" + var10);
                        Statics.field1268[var8] = Statics.field1908.method4210("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            Statics.method1020(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3264() == 1;
        int var13 = arg1.method3275();
        int var14 = arg1.method3238();
        int var15 = arg1.method3238();
        arg1.method3510();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3497(1);
                    if (var19 == 1) {
                        field909[var16][var17][var18] = arg1.method3497(26);
                    } else {
                        field909[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3498();
        Statics.field3357 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field3357[var20][var21] = arg1.method3241();
            }
        }
        Statics.field3388 = new int[var15];
        Statics.field770 = new int[var15];
        Statics.field1268 = new int[var15];
        Statics.field2602 = new byte[var15][];
        Statics.field1254 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field909[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field3388[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field3388[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field770[var22] = Statics.field1908.method4210("m" + var31 + "_" + var32);
                            Statics.field1268[var22] = Statics.field1908.method4210("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        Statics.method1020(var14, var13, !var12);
    }

    @ObfuscatedName("hb.gv(ZB)V")
    public static final void method3947(boolean arg0) {
        method525();
        field1073.field1463++;
        if (field1073.field1463 < 50 && !arg0) {
            return;
        }
        field1073.field1463 = 0;
        if (field897 || field1073.method1915() == null) {
            return;
        }
        class185 var1 = class185.method343(class182.field2432, field1073.field1457);
        field1073.method1916(var1);
        try {
            field1073.method1920();
        } catch (IOException var3) {
            field897 = true;
        }
    }

    @ObfuscatedName("bi.gw(I)V")
    public static final void method1112() {
        method3947(false);
        field902 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2602.length; var1++) {
            if (Statics.field770[var1] != -1 && Statics.field2602[var1] == null) {
                Statics.field2602[var1] = Statics.field1908.method4265(Statics.field770[var1], 0);
                if (Statics.field2602[var1] == null) {
                    var0 = false;
                    field902++;
                }
            }
            if (Statics.field1268[var1] != -1 && Statics.field1254[var1] == null) {
                Statics.field1254[var1] = Statics.field1908.method4193(Statics.field1268[var1], 0, Statics.field3357[var1]);
                if (Statics.field1254[var1] == null) {
                    var0 = false;
                    field902++;
                }
            }
        }
        if (!var0) {
            field906 = 1;
            return;
        }
        field935 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2602.length; var3++) {
            byte[] var4 = Statics.field1254[var3];
            if (var4 != null) {
                int var5 = (Statics.field3388[var3] >> 8) * 64 - Statics.field494;
                int var6 = (Statics.field3388[var3] & 0xFF) * 64 - Statics.field2794;
                if (field1015) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class195 var9 = new class195(var4);
                int var10 = -1;
                label1113: while (true) {
                    int var11 = var9.method3244();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method3244();
                            if (var16 == 0) {
                                continue label1113;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method3236() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class283 var22 = class283.method4427(var10);
                                if (var19 != 22 || !field855 || var22.field3614 != 0 || var22.field3612 == 1 || var22.field3621) {
                                    if (!var22.method4605()) {
                                        field935++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method3244();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method3236();
                    }
                }
            }
        }
        if (!var2) {
            field906 = 2;
            return;
        }
        if (field906 != 0) {
            Statics.method154(class252.field3032 + class87.field1297 + class87.field1300 + 100 + "%" + class87.field1301, true);
        }
        method525();
        Statics.field495.method2646();
        for (int var23 = 0; var23 < 4; var23++) {
            field867[var23].method3085();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class63.field704[var24][var25][var26] = 0;
                }
            }
        }
        method525();
        class63.field706 = 99;
        Statics.field712 = new byte[4][104][104];
        Statics.field708 = new byte[4][104][104];
        Statics.field709 = new byte[4][104][104];
        Statics.field1953 = new byte[4][104][104];
        Statics.field710 = new int[4][105][105];
        Statics.field705 = new byte[4][105][105];
        Statics.field715 = new int[105][105];
        Statics.field240 = new int[104];
        Statics.field476 = new int[104];
        Statics.field320 = new int[104];
        Statics.field2585 = new int[104];
        Statics.field477 = new int[104];
        int var27 = Statics.field2602.length;
        for (class81 var28 = (class81) class81.field1241.method3731(); var28 != null; var28 = (class81) class81.field1241.method3733()) {
            if (var28.field1245 != null) {
                Statics.field3885.method1930(var28.field1245);
                var28.field1245 = null;
            }
            if (var28.field1239 != null) {
                Statics.field3885.method1930(var28.field1239);
                var28.field1239 = null;
            }
        }
        class81.field1241.method3726();
        method3947(true);
        if (!field1015) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field3388[var29] >> 8) * 64 - Statics.field494;
                int var31 = (Statics.field3388[var29] & 0xFF) * 64 - Statics.field2794;
                byte[] var32 = Statics.field2602[var29];
                if (var32 != null) {
                    method525();
                    int var33 = Statics.field582 * 8 - 48;
                    int var34 = Statics.field2477 * 8 - 48;
                    class177[] var35 = field867;
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 64; var37++) {
                            for (int var38 = 0; var38 < 64; var38++) {
                                if (var30 + var37 > 0 && var30 + var37 < 103 && var31 + var38 > 0 && var31 + var38 < 103) {
                                    var35[var36].field2231[var30 + var37][var31 + var38] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class195 var39 = new class195(var32);
                    for (int var40 = 0; var40 < 4; var40++) {
                        for (int var41 = 0; var41 < 64; var41++) {
                            for (int var42 = 0; var42 < 64; var42++) {
                                class63.method1661(var39, var40, var30 + var41, var31 + var42, var33, var34, 0);
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < var27; var43++) {
                int var44 = (Statics.field3388[var43] >> 8) * 64 - Statics.field494;
                int var45 = (Statics.field3388[var43] & 0xFF) * 64 - Statics.field2794;
                byte[] var46 = Statics.field2602[var43];
                if (var46 == null && Statics.field2477 < 800) {
                    method525();
                    class63.method278(var44, var45, 64, 64);
                }
            }
            method3947(true);
            for (int var47 = 0; var47 < var27; var47++) {
                byte[] var48 = Statics.field1254[var47];
                if (var48 != null) {
                    int var49 = (Statics.field3388[var47] >> 8) * 64 - Statics.field494;
                    int var50 = (Statics.field3388[var47] & 0xFF) * 64 - Statics.field2794;
                    method525();
                    class138 var51 = Statics.field495;
                    class177[] var52 = field867;
                    class195 var53 = new class195(var48);
                    int var54 = -1;
                    while (true) {
                        int var55 = var53.method3244();
                        if (var55 == 0) {
                            break;
                        }
                        var54 += var55;
                        int var56 = 0;
                        while (true) {
                            int var57 = var53.method3244();
                            if (var57 == 0) {
                                break;
                            }
                            var56 += var57 - 1;
                            int var58 = var56 & 0x3F;
                            int var59 = var56 >> 6 & 0x3F;
                            int var60 = var56 >> 12;
                            int var61 = var53.method3236();
                            int var62 = var61 >> 2;
                            int var63 = var61 & 0x3;
                            int var64 = var49 + var59;
                            int var65 = var50 + var58;
                            if (var64 > 0 && var65 > 0 && var64 < 103 && var65 < 103) {
                                int var66 = var60;
                                if ((class63.field704[1][var64][var65] & 0x2) == 2) {
                                    var66 = var60 - 1;
                                }
                                class177 var67 = null;
                                if (var66 >= 0) {
                                    var67 = var52[var66];
                                }
                                class63.method1016(var60, var64, var65, var54, var63, var62, var51, var67);
                            }
                        }
                    }
                }
            }
        }
        if (field1015) {
            for (int var68 = 0; var68 < 4; var68++) {
                method525();
                for (int var69 = 0; var69 < 13; var69++) {
                    for (int var70 = 0; var70 < 13; var70++) {
                        boolean var71 = false;
                        int var72 = field909[var68][var69][var70];
                        if (var72 != -1) {
                            int var73 = var72 >> 24 & 0x3;
                            int var74 = var72 >> 1 & 0x3;
                            int var75 = var72 >> 14 & 0x3FF;
                            int var76 = var72 >> 3 & 0x7FF;
                            int var77 = (var75 / 8 << 8) + var76 / 8;
                            for (int var78 = 0; var78 < Statics.field3388.length; var78++) {
                                if (Statics.field3388[var78] == var77 && Statics.field2602[var78] != null) {
                                    class63.method29(Statics.field2602[var78], var68, var69 * 8, var70 * 8, var73, (var75 & 0x7) * 8, (var76 & 0x7) * 8, var74, field867);
                                    var71 = true;
                                    break;
                                }
                            }
                        }
                        if (!var71) {
                            class63.method1815(var68, var69 * 8, var70 * 8);
                        }
                    }
                }
            }
            for (int var79 = 0; var79 < 13; var79++) {
                for (int var80 = 0; var80 < 13; var80++) {
                    int var81 = field909[0][var79][var80];
                    if (var81 == -1) {
                        class63.method278(var79 * 8, var80 * 8, 8, 8);
                    }
                }
            }
            method3947(true);
            for (int var82 = 0; var82 < 4; var82++) {
                method525();
                for (int var83 = 0; var83 < 13; var83++) {
                    label933: for (int var84 = 0; var84 < 13; var84++) {
                        int var85 = field909[var82][var83][var84];
                        if (var85 != -1) {
                            int var86 = var85 >> 24 & 0x3;
                            int var87 = var85 >> 1 & 0x3;
                            int var88 = var85 >> 14 & 0x3FF;
                            int var89 = var85 >> 3 & 0x7FF;
                            int var90 = (var88 / 8 << 8) + var89 / 8;
                            for (int var91 = 0; var91 < Statics.field3388.length; var91++) {
                                if (Statics.field3388[var91] == var90 && Statics.field1254[var91] != null) {
                                    byte[] var92 = Statics.field1254[var91];
                                    int var93 = var83 * 8;
                                    int var94 = var84 * 8;
                                    int var95 = (var88 & 0x7) * 8;
                                    int var96 = (var89 & 0x7) * 8;
                                    class138 var97 = Statics.field495;
                                    class177[] var98 = field867;
                                    class195 var99 = new class195(var92);
                                    int var100 = -1;
                                    while (true) {
                                        int var101 = var99.method3244();
                                        if (var101 == 0) {
                                            continue label933;
                                        }
                                        var100 += var101;
                                        int var102 = 0;
                                        while (true) {
                                            int var103 = var99.method3244();
                                            if (var103 == 0) {
                                                break;
                                            }
                                            var102 += var103 - 1;
                                            int var104 = var102 & 0x3F;
                                            int var105 = var102 >> 6 & 0x3F;
                                            int var106 = var102 >> 12;
                                            int var107 = var99.method3236();
                                            int var108 = var107 >> 2;
                                            int var109 = var107 & 0x3;
                                            if (var86 == var106 && var105 >= var95 && var105 < var95 + 8 && var104 >= var96 && var104 < var96 + 8) {
                                                class283 var110 = class283.method4427(var100);
                                                int var111 = var93 + class242.method747(var105 & 0x7, var104 & 0x7, var87, var110.field3610, var110.field3608, var109);
                                                int var112 = var94 + class242.method719(var105 & 0x7, var104 & 0x7, var87, var110.field3610, var110.field3608, var109);
                                                if (var111 > 0 && var112 > 0 && var111 < 103 && var112 < 103) {
                                                    int var113 = var82;
                                                    if ((class63.field704[1][var111][var112] & 0x2) == 2) {
                                                        var113 = var82 - 1;
                                                    }
                                                    class177 var114 = null;
                                                    if (var113 >= 0) {
                                                        var114 = var98[var113];
                                                    }
                                                    class63.method1016(var82, var111, var112, var100, var87 + var109 & 0x3, var108, var97, var114);
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
        method3947(true);
        method525();
        class138 var115 = Statics.field495;
        class177[] var116 = field867;
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 < 104; var118++) {
                for (int var119 = 0; var119 < 104; var119++) {
                    if ((class63.field704[var117][var118][var119] & 0x1) == 1) {
                        int var120 = var117;
                        if ((class63.field704[1][var118][var119] & 0x2) == 2) {
                            var120 = var117 - 1;
                        }
                        if (var120 >= 0) {
                            var116[var120].method3088(var118, var119);
                        }
                    }
                }
            }
        }
        class63.field720 += (int) (Math.random() * 5.0D) - 2;
        if (class63.field720 < -8) {
            class63.field720 = -8;
        }
        if (class63.field720 > 8) {
            class63.field720 = 8;
        }
        class63.field721 += (int) (Math.random() * 5.0D) - 2;
        if (class63.field721 < -16) {
            class63.field721 = -16;
        }
        if (class63.field721 > 16) {
            class63.field721 = 16;
        }
        for (int var121 = 0; var121 < 4; var121++) {
            byte[][] var122 = Statics.field705[var121];
            int var123 = (int) Math.sqrt(5100.0D);
            int var124 = var123 * 768 >> 8;
            for (int var125 = 1; var125 < 103; var125++) {
                for (int var126 = 1; var126 < 103; var126++) {
                    int var127 = class63.field707[var121][var126 + 1][var125] - class63.field707[var121][var126 - 1][var125];
                    int var128 = class63.field707[var121][var126][var125 + 1] - class63.field707[var121][var126][var125 - 1];
                    int var129 = (int) Math.sqrt((double) (var128 * var128 + var127 * var127 + 65536));
                    int var130 = (var127 << 8) / var129;
                    int var131 = 65536 / var129;
                    int var132 = (var128 << 8) / var129;
                    int var133 = (var132 * -50 + var130 * -50 + var131 * -10) / var124 + 96;
                    int var134 = (var122[var126][var125] >> 1) + (var122[var126][var125 + 1] >> 3) + (var122[var126][var125 - 1] >> 2) + (var122[var126 - 1][var125] >> 2) + (var122[var126 + 1][var125] >> 3);
                    Statics.field715[var126][var125] = var133 - var134;
                }
            }
            for (int var135 = 0; var135 < 104; var135++) {
                Statics.field240[var135] = 0;
                Statics.field476[var135] = 0;
                Statics.field320[var135] = 0;
                Statics.field2585[var135] = 0;
                Statics.field477[var135] = 0;
            }
            for (int var136 = -5; var136 < 109; var136++) {
                for (int var137 = 0; var137 < 104; var137++) {
                    int var138 = var136 + 5;
                    int var10002;
                    if (var138 >= 0 && var138 < 104) {
                        int var139 = Statics.field712[var121][var138][var137] & 0xFF;
                        if (var139 > 0) {
                            class274 var140 = class274.method4181(var139 - 1);
                            Statics.field240[var137] += var140.field3505;
                            Statics.field476[var137] += var140.field3508;
                            Statics.field320[var137] += var140.field3510;
                            Statics.field2585[var137] += var140.field3511;
                            var10002 = Statics.field477[var137]++;
                        }
                    }
                    int var141 = var136 - 5;
                    if (var141 >= 0 && var141 < 104) {
                        int var142 = Statics.field712[var121][var141][var137] & 0xFF;
                        if (var142 > 0) {
                            class274 var143 = class274.method4181(var142 - 1);
                            Statics.field240[var137] -= var143.field3505;
                            Statics.field476[var137] -= var143.field3508;
                            Statics.field320[var137] -= var143.field3510;
                            Statics.field2585[var137] -= var143.field3511;
                            var10002 = Statics.field477[var137]--;
                        }
                    }
                }
                if (var136 >= 1 && var136 < 103) {
                    int var144 = 0;
                    int var145 = 0;
                    int var146 = 0;
                    int var147 = 0;
                    int var148 = 0;
                    for (int var149 = -5; var149 < 109; var149++) {
                        int var150 = var149 + 5;
                        if (var150 >= 0 && var150 < 104) {
                            var144 += Statics.field240[var150];
                            var145 += Statics.field476[var150];
                            var146 += Statics.field320[var150];
                            var147 += Statics.field2585[var150];
                            var148 += Statics.field477[var150];
                        }
                        int var151 = var149 - 5;
                        if (var151 >= 0 && var151 < 104) {
                            var144 -= Statics.field240[var151];
                            var145 -= Statics.field476[var151];
                            var146 -= Statics.field320[var151];
                            var147 -= Statics.field2585[var151];
                            var148 -= Statics.field477[var151];
                        }
                        if (var149 >= 1 && var149 < 103 && (!field855 || (class63.field704[0][var136][var149] & 0x2) != 0 || (class63.field704[var121][var136][var149] & 0x10) == 0)) {
                            if (var121 < class63.field706) {
                                class63.field706 = var121;
                            }
                            int var152 = Statics.field712[var121][var136][var149] & 0xFF;
                            int var153 = Statics.field708[var121][var136][var149] & 0xFF;
                            if (var152 > 0 || var153 > 0) {
                                int var154 = class63.field707[var121][var136][var149];
                                int var155 = class63.field707[var121][var136 + 1][var149];
                                int var156 = class63.field707[var121][var136 + 1][var149 + 1];
                                int var157 = class63.field707[var121][var136][var149 + 1];
                                int var158 = Statics.field715[var136][var149];
                                int var159 = Statics.field715[var136 + 1][var149];
                                int var160 = Statics.field715[var136 + 1][var149 + 1];
                                int var161 = Statics.field715[var136][var149 + 1];
                                int var162 = -1;
                                int var163 = -1;
                                if (var152 > 0) {
                                    int var164 = var144 * 256 / var147;
                                    int var165 = var145 / var148;
                                    int var166 = var146 / var148;
                                    var162 = class63.method2555(var164, var165, var166);
                                    int var167 = class63.field720 + var164 & 0xFF;
                                    int var168 = class63.field721 + var166;
                                    if (var168 < 0) {
                                        var168 = 0;
                                    } else if (var168 > 255) {
                                        var168 = 255;
                                    }
                                    var163 = class63.method2555(var167, var165, var168);
                                }
                                if (var121 > 0) {
                                    boolean var169 = true;
                                    if (var152 == 0 && Statics.field709[var121][var136][var149] != 0) {
                                        var169 = false;
                                    }
                                    if (var153 > 0 && !class287.method3134(var153 - 1).field3743) {
                                        var169 = false;
                                    }
                                    if (var169 && var154 == var155 && var154 == var156 && var154 == var157) {
                                        Statics.field710[var121][var136][var149] |= 0x924;
                                    }
                                }
                                int var170 = 0;
                                if (var163 != -1) {
                                    var170 = class135.field1931[class63.method1651(var163, 96)];
                                }
                                if (var153 == 0) {
                                    var115.method2651(var121, var136, var149, 0, 0, -1, var154, var155, var156, var157, class63.method1651(var162, var158), class63.method1651(var162, var159), class63.method1651(var162, var160), class63.method1651(var162, var161), 0, 0, 0, 0, var170, 0);
                                } else {
                                    int var171 = Statics.field709[var121][var136][var149] + 1;
                                    byte var172 = Statics.field1953[var121][var136][var149];
                                    class287 var173 = class287.method3134(var153 - 1);
                                    int var174 = var173.field3746;
                                    int var175;
                                    int var176;
                                    if (var174 >= 0) {
                                        var175 = Statics.field1932.method2349(var174);
                                        var176 = -1;
                                    } else if (var173.field3745 == 16711935) {
                                        var176 = -2;
                                        var174 = -1;
                                        var175 = -2;
                                    } else {
                                        var176 = class63.method2555(var173.field3749, var173.field3750, var173.field3751);
                                        int var177 = class63.field720 + var173.field3749 & 0xFF;
                                        int var178 = class63.field721 + var173.field3751;
                                        if (var178 < 0) {
                                            var178 = 0;
                                        } else if (var178 > 255) {
                                            var178 = 255;
                                        }
                                        var175 = class63.method2555(var177, var173.field3750, var178);
                                    }
                                    int var179 = 0;
                                    if (var175 != -2) {
                                        var179 = class135.field1931[class63.method111(var175, 96)];
                                    }
                                    if (var173.field3748 != -1) {
                                        int var180 = class63.field720 + var173.field3755 & 0xFF;
                                        int var181 = class63.field721 + var173.field3754;
                                        if (var181 < 0) {
                                            var181 = 0;
                                        } else if (var181 > 255) {
                                            var181 = 255;
                                        }
                                        int var182 = class63.method2555(var180, var173.field3753, var181);
                                        var179 = class135.field1931[class63.method111(var182, 96)];
                                    }
                                    var115.method2651(var121, var136, var149, var171, var172, var174, var154, var155, var156, var157, class63.method1651(var162, var158), class63.method1651(var162, var159), class63.method1651(var162, var160), class63.method1651(var162, var161), class63.method111(var176, var158), class63.method111(var176, var159), class63.method111(var176, var160), class63.method111(var176, var161), var170, var179);
                                }
                            }
                        }
                    }
                }
            }
            for (int var183 = 1; var183 < 103; var183++) {
                for (int var184 = 1; var184 < 103; var184++) {
                    int var189;
                    if ((class63.field704[var121][var184][var183] & 0x8) != 0) {
                        var189 = 0;
                    } else if (var121 <= 0 || (class63.field704[1][var184][var183] & 0x2) == 0) {
                        var189 = var121;
                    } else {
                        var189 = var121 - 1;
                    }
                    var115.method2681(var121, var184, var183, var189);
                }
            }
            Statics.field712[var121] = (byte[][]) null;
            Statics.field708[var121] = (byte[][]) null;
            Statics.field709[var121] = (byte[][]) null;
            Statics.field1953[var121] = (byte[][]) null;
            Statics.field705[var121] = (byte[][]) null;
        }
        var115.method2683(-50, -10, -50);
        for (int var190 = 0; var190 < 104; var190++) {
            for (int var191 = 0; var191 < 104; var191++) {
                if ((class63.field704[1][var190][var191] & 0x2) == 2) {
                    var115.method2732(var190, var191);
                }
            }
        }
        int var192 = 1;
        int var193 = 2;
        int var194 = 4;
        for (int var195 = 0; var195 < 4; var195++) {
            if (var195 > 0) {
                var192 <<= 0x3;
                var193 <<= 0x3;
                var194 <<= 0x3;
            }
            for (int var196 = 0; var196 <= var195; var196++) {
                for (int var197 = 0; var197 <= 104; var197++) {
                    for (int var198 = 0; var198 <= 104; var198++) {
                        if ((Statics.field710[var196][var198][var197] & var192) != 0) {
                            int var199 = var197;
                            int var200 = var197;
                            int var201 = var196;
                            int var202 = var196;
                            while (var199 > 0 && (Statics.field710[var196][var198][var199 - 1] & var192) != 0) {
                                var199--;
                            }
                            while (var200 < 104 && (Statics.field710[var196][var198][var200 + 1] & var192) != 0) {
                                var200++;
                            }
                            label661: while (var201 > 0) {
                                for (int var203 = var199; var203 <= var200; var203++) {
                                    if ((Statics.field710[var201 - 1][var198][var203] & var192) == 0) {
                                        break label661;
                                    }
                                }
                                var201--;
                            }
                            label650: while (var202 < var195) {
                                for (int var204 = var199; var204 <= var200; var204++) {
                                    if ((Statics.field710[var202 + 1][var198][var204] & var192) == 0) {
                                        break label650;
                                    }
                                }
                                var202++;
                            }
                            int var205 = (var202 + 1 - var201) * (var200 - var199 + 1);
                            if (var205 >= 8) {
                                short var206 = 240;
                                int var207 = class63.field707[var202][var198][var199] - var206;
                                int var208 = class63.field707[var201][var198][var199];
                                class138.method2649(var195, 1, var198 * 128, var198 * 128, var199 * 128, var200 * 128 + 128, var207, var208);
                                for (int var209 = var201; var209 <= var202; var209++) {
                                    for (int var210 = var199; var210 <= var200; var210++) {
                                        Statics.field710[var209][var198][var210] &= ~var192;
                                    }
                                }
                            }
                        }
                        if ((Statics.field710[var196][var198][var197] & var193) != 0) {
                            int var211 = var198;
                            int var212 = var198;
                            int var213 = var196;
                            int var214 = var196;
                            while (var211 > 0 && (Statics.field710[var196][var211 - 1][var197] & var193) != 0) {
                                var211--;
                            }
                            while (var212 < 104 && (Statics.field710[var196][var212 + 1][var197] & var193) != 0) {
                                var212++;
                            }
                            label714: while (var213 > 0) {
                                for (int var215 = var211; var215 <= var212; var215++) {
                                    if ((Statics.field710[var213 - 1][var215][var197] & var193) == 0) {
                                        break label714;
                                    }
                                }
                                var213--;
                            }
                            label703: while (var214 < var195) {
                                for (int var216 = var211; var216 <= var212; var216++) {
                                    if ((Statics.field710[var214 + 1][var216][var197] & var193) == 0) {
                                        break label703;
                                    }
                                }
                                var214++;
                            }
                            int var217 = (var214 + 1 - var213) * (var212 - var211 + 1);
                            if (var217 >= 8) {
                                short var218 = 240;
                                int var219 = class63.field707[var214][var211][var197] - var218;
                                int var220 = class63.field707[var213][var211][var197];
                                class138.method2649(var195, 2, var211 * 128, var212 * 128 + 128, var197 * 128, var197 * 128, var219, var220);
                                for (int var221 = var213; var221 <= var214; var221++) {
                                    for (int var222 = var211; var222 <= var212; var222++) {
                                        Statics.field710[var221][var222][var197] &= ~var193;
                                    }
                                }
                            }
                        }
                        if ((Statics.field710[var196][var198][var197] & var194) != 0) {
                            int var223 = var198;
                            int var224 = var198;
                            int var225 = var197;
                            int var226 = var197;
                            while (var225 > 0 && (Statics.field710[var196][var198][var225 - 1] & var194) != 0) {
                                var225--;
                            }
                            while (var226 < 104 && (Statics.field710[var196][var198][var226 + 1] & var194) != 0) {
                                var226++;
                            }
                            label767: while (var223 > 0) {
                                for (int var227 = var225; var227 <= var226; var227++) {
                                    if ((Statics.field710[var196][var223 - 1][var227] & var194) == 0) {
                                        break label767;
                                    }
                                }
                                var223--;
                            }
                            label756: while (var224 < 104) {
                                for (int var228 = var225; var228 <= var226; var228++) {
                                    if ((Statics.field710[var196][var224 + 1][var228] & var194) == 0) {
                                        break label756;
                                    }
                                }
                                var224++;
                            }
                            if ((var224 - var223 + 1) * (var226 - var225 + 1) >= 4) {
                                int var229 = class63.field707[var196][var223][var225];
                                class138.method2649(var195, 4, var223 * 128, var224 * 128 + 128, var225 * 128, var226 * 128 + 128, var229, var229);
                                for (int var230 = var223; var230 <= var224; var230++) {
                                    for (int var231 = var225; var231 <= var226; var231++) {
                                        Statics.field710[var196][var230][var231] &= ~var194;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method3947(true);
        int var232 = class63.field706;
        if (var232 > Statics.field3841) {
            var232 = Statics.field3841;
        }
        if (var232 < Statics.field3841 - 1) {
            int var233 = Statics.field3841 - 1;
        }
        if (field855) {
            Statics.field495.method2659(class63.field706);
        } else {
            Statics.field495.method2659(0);
        }
        for (int var234 = 0; var234 < 104; var234++) {
            for (int var235 = 0; var235 < 104; var235++) {
                method741(var234, var235);
            }
        }
        method525();
        for (class75 var236 = (class75) field978.method3731(); var236 != null; var236 = (class75) field978.method3733()) {
            if (var236.field1133 == -1) {
                var236.field1131 = 0;
                method3173(var236);
            } else {
                var236.method3721();
            }
        }
        class283.field3598.method3632();
        if (Statics.field3013.method912()) {
            class185 var237 = class185.method343(class182.field2374, field1073.field1457);
            var237.field2478.method3223(1057001181);
            field1073.method1916(var237);
        }
        if (!field1015) {
            int var238 = (Statics.field582 - 6) / 8;
            int var239 = (Statics.field582 + 6) / 8;
            int var240 = (Statics.field2477 - 6) / 8;
            int var241 = (Statics.field2477 + 6) / 8;
            for (int var242 = var238 - 1; var242 <= var239 + 1; var242++) {
                for (int var243 = var240 - 1; var243 <= var241 + 1; var243++) {
                    if (var242 < var238 || var242 > var239 || var243 < var240 || var243 > var241) {
                        Statics.field1908.method4216("m" + var242 + "_" + var243);
                        Statics.field1908.method4216("l" + var242 + "_" + var243);
                    }
                }
            }
        }
        method153(30);
        method525();
        class63.method216();
        class185 var244 = class185.method343(class182.field2397, field1073.field1457);
        field1073.method1916(var244);
        class60.method34();
    }

    @ObfuscatedName("q.gx(IB)V")
    public static final void method1(int arg0) {
        int[] var1 = Statics.field292.field3986;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class63.field704[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field495.method2707(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class63.field704[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field495.method2707(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field292.method5389();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class63.field704[arg0][var10][var9] & 0x18) == 0) {
                    method45(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class63.field704[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method45(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1049 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field495.method2785(Statics.field3841, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class283.method4427(var14).field3611;
                    if (var15 >= 0) {
                        field986[field1049] = Statics.field3455[var15].method4384(false);
                        field1074[field1049] = var11;
                        field862[field1049] = var12;
                        field1049++;
                    }
                }
            }
        }
        Statics.field605.method5356();
    }

    @ObfuscatedName("n.gj(IIIIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field495.method2767(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field495.method2676(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field292.field3986;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class283 var13 = class283.method4427(var12);
            if (var13.field3624 == -1) {
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
                class331 var14 = Statics.field3932[var13.field3624];
                if (var14 != null) {
                    int var15 = (var13.field3610 * 4 - var14.field3978) / 2;
                    int var16 = (var13.field3608 * 4 - var14.field3977) / 2;
                    var14.method5362(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3608) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field495.method2665(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field495.method2676(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class283 var22 = class283.method4427(var21);
            if (var22.field3624 != -1) {
                class331 var23 = Statics.field3932[var22.field3624];
                if (var23 != null) {
                    int var24 = (var22.field3610 * 4 - var23.field3978) / 2;
                    int var25 = (var22.field3608 * 4 - var23.field3977) / 2;
                    var23.method5362(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3608) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field292.field3986;
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
        int var29 = Statics.field495.method2785(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class283 var31 = class283.method4427(var30);
        if (var31.field3624 == -1) {
            return;
        }
        class331 var32 = Statics.field3932[var31.field3624];
        if (var32 != null) {
            int var33 = (var31.field3610 * 4 - var32.field3978) / 2;
            int var34 = (var31.field3608 * 4 - var32.field3977) / 2;
            var32.method5362(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3608) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gm(Lcn;I)Z")
    public final boolean method1154(class100 arg0) {
        class170 var2 = arg0.method1915();
        class202 var3 = arg0.field1460;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1459 == null) {
                if (arg0.field1454) {
                    if (!var2.method3017(1)) {
                        return false;
                    }
                    var2.method3020(arg0.field1460.field2544, 0, 1);
                    arg0.field1465 = 0;
                    arg0.field1454 = false;
                }
                var3.field2545 = 0;
                if (var3.method3494()) {
                    if (!var2.method3017(1)) {
                        return false;
                    }
                    var2.method3020(arg0.field1460.field2544, 1, 1);
                    arg0.field1465 = 0;
                }
                arg0.field1454 = true;
                class181[] var4 = new class181[] { class181.field2304, class181.field2263, class181.field2264, class181.field2332, class181.field2266, class181.field2267, class181.field2295, class181.field2298, class181.field2281, class181.field2271, class181.field2272, class181.field2278, class181.field2274, class181.field2265, class181.field2276, class181.field2268, class181.field2306, class181.field2279, class181.field2280, class181.field2269, class181.field2282, class181.field2283, class181.field2284, class181.field2285, class181.field2286, class181.field2287, class181.field2288, class181.field2296, class181.field2290, class181.field2291, class181.field2277, class181.field2293, class181.field2294, class181.field2311, class181.field2337, class181.field2297, class181.field2301, class181.field2321, class181.field2339, class181.field2317, class181.field2302, class181.field2299, class181.field2275, class181.field2305, class181.field2331, class181.field2307, class181.field2308, class181.field2309, class181.field2314, class181.field2273, class181.field2312, class181.field2313, class181.field2329, class181.field2315, class181.field2316, class181.field2322, class181.field2318, class181.field2319, class181.field2320, class181.field2343, class181.field2303, class181.field2323, class181.field2324, class181.field2325, class181.field2326, class181.field2327, class181.field2328, class181.field2300, class181.field2330, class181.field2270, class181.field2310, class181.field2333, class181.field2334, class181.field2335, class181.field2336, class181.field2292, class181.field2338, class181.field2289, class181.field2340, class181.field2341, class181.field2342, class181.field2262, class181.field2344, class181.field2345 };
                int var6 = var3.method3515();
                if (var6 < 0 || var6 >= var4.length) {
                    throw new IOException(var6 + " " + var3.field2545);
                }
                arg0.field1459 = var4[var6];
                arg0.field1453 = arg0.field1459.field2347;
            }
            if (arg0.field1453 == -1) {
                if (!var2.method3017(1)) {
                    return false;
                }
                arg0.method1915().method3020(var3.field2544, 0, 1);
                arg0.field1453 = var3.field2544[0] & 0xFF;
            }
            if (arg0.field1453 == -2) {
                if (!var2.method3017(2)) {
                    return false;
                }
                arg0.method1915().method3020(var3.field2544, 0, 2);
                var3.field2545 = 0;
                arg0.field1453 = var3.method3238();
            }
            if (!var2.method3017(arg0.field1453)) {
                return false;
            }
            var3.field2545 = 0;
            var2.method3020(var3.field2544, 0, arg0.field1453);
            arg0.field1465 = 0;
            field899.method4818();
            arg0.field1466 = arg0.field1458;
            arg0.field1458 = arg0.field1464;
            arg0.field1464 = arg0.field1459;
            if (class181.field2295 == arg0.field1459) {
                int var7 = var3.method3238();
                int var8 = var3.method3284();
                class243 var9 = class243.method3168(var8);
                if (var9.field2861 != 2 || var9.field2862 != var7) {
                    var9.field2861 = 2;
                    var9.field2862 = var7;
                    method942(var9);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2290 == arg0.field1459) {
                for (int var10 = 0; var10 < field965.length; var10++) {
                    if (field965[var10] != null) {
                        field965[var10].field1170 = -1;
                    }
                }
                for (int var11 = 0; var11 < field975.length; var11++) {
                    if (field975[var11] != null) {
                        field975[var11].field1170 = -1;
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2296 == arg0.field1459) {
                method175(false, arg0.field1460);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2334 == arg0.field1459) {
                method510();
                field1014 = var3.method3236();
                field982 = field1032;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2265 == arg0.field1459) {
                Statics.field2030.field1234.method4898(var3, arg0.field1453);
                class96.method182();
                if (Statics.field616 != null) {
                    Statics.field616.method5043();
                }
                field1040 = field1032;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2298 == arg0.field1459) {
                method2642(class184.field2463);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2293 == arg0.field1459) {
                method2642(class184.field2458);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2306 == arg0.field1459) {
                for (int var12 = 0; var12 < class238.field2771.length; var12++) {
                    if (class238.field2773[var12] != class238.field2771[var12]) {
                        class238.field2771[var12] = class238.field2773[var12];
                        method15(var12);
                        field1033[++field1034 - 1 & 0x1F] = var12;
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2275 == arg0.field1459) {
                int var13 = var3.method3392();
                int var14 = var3.method3278();
                int var15 = var3.method3284();
                class243 var16 = class243.method3168(var15);
                if (var16.field2913 != var14 || var16.field2864 != var13 || var16.field2823 != 0 || var16.field2824 != 0) {
                    var16.field2913 = var14;
                    var16.field2864 = var13;
                    var16.field2823 = 0;
                    var16.field2824 = 0;
                    method942(var16);
                    this.method1411(var16);
                    if (var16.field2820 == 0) {
                        method940(Statics.field2810[var15 >> 16], var16, false);
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2277 == arg0.field1459) {
                field852 = false;
                for (int var17 = 0; var17 < 5; var17++) {
                    field1092[var17] = false;
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2322 == arg0.field1459) {
                int var18 = var3.method3285();
                int var19 = var3.method3286();
                class68 var20 = (class68) field1010.method3677((long) var19);
                class68 var21 = (class68) field1010.method3677((long) var18);
                if (var21 != null) {
                    Statics.method1828(var21, var20 == null || var20.field778 != var21.field778);
                }
                if (var20 != null) {
                    var20.method3721();
                    field1010.method3669(var20, (long) var18);
                }
                class243 var22 = class243.method3168(var19);
                if (var22 != null) {
                    method942(var22);
                }
                class243 var23 = class243.method3168(var18);
                if (var23 != null) {
                    method942(var23);
                    method940(Statics.field2810[var23.field2929 >>> 16], var23, true);
                }
                if (field1009 != -1) {
                    method44(field1009, 1);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2281 == arg0.field1459) {
                Statics.field743 = var3.method3236();
                Statics.field2035 = var3.method3265();
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2331 == arg0.field1459) {
                field1064 = var3.method3265();
                field1063 = var3.method3266();
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2267 == arg0.field1459) {
                int var24 = var3.method3238();
                if (var24 == 65535) {
                    var24 = -1;
                }
                method324(var24);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2332 == arg0.field1459) {
                int var25 = var3.method3401();
                int var26 = var3.method3273();
                if (var26 == 65535) {
                    var26 = -1;
                }
                method1778(var26, var25);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2266 == arg0.field1459) {
                int var27 = var3.method3285();
                class243 var28 = class243.method3168(var27);
                var28.field2861 = 3;
                var28.field2862 = Statics.field434.field836.method4064();
                method942(var28);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2270 == arg0.field1459) {
                int var29 = arg0.field1453;
                int var30 = var3.field2545;
                class94.field1396 = 0;
                int var31 = 0;
                var3.method3510();
                for (int var32 = 0; var32 < class94.field1397; var32++) {
                    int var33 = class94.field1398[var32];
                    if ((class94.field1395[var33] & 0x1) == 0) {
                        if (var31 > 0) {
                            var31--;
                            class94.field1395[var33] = (byte) (class94.field1395[var33] | 0x2);
                        } else {
                            int var34 = var3.method3497(1);
                            if (var34 == 0) {
                                var31 = class94.method582(var3);
                                class94.field1395[var33] = (byte) (class94.field1395[var33] | 0x2);
                            } else {
                                class94.method4088(var3, var33);
                            }
                        }
                    }
                }
                var3.method3498();
                if (var31 != 0) {
                    throw new RuntimeException();
                }
                var3.method3510();
                for (int var35 = 0; var35 < class94.field1397; var35++) {
                    int var36 = class94.field1398[var35];
                    if ((class94.field1395[var36] & 0x1) != 0) {
                        if (var31 > 0) {
                            var31--;
                            class94.field1395[var36] = (byte) (class94.field1395[var36] | 0x2);
                        } else {
                            int var37 = var3.method3497(1);
                            if (var37 == 0) {
                                var31 = class94.method582(var3);
                                class94.field1395[var36] = (byte) (class94.field1395[var36] | 0x2);
                            } else {
                                class94.method4088(var3, var36);
                            }
                        }
                    }
                }
                var3.method3498();
                if (var31 != 0) {
                    throw new RuntimeException();
                }
                var3.method3510();
                for (int var38 = 0; var38 < class94.field1399; var38++) {
                    int var39 = class94.field1400[var38];
                    if ((class94.field1395[var39] & 0x1) != 0) {
                        if (var31 > 0) {
                            var31--;
                            class94.field1395[var39] = (byte) (class94.field1395[var39] | 0x2);
                        } else {
                            int var40 = var3.method3497(1);
                            if (var40 == 0) {
                                var31 = class94.method582(var3);
                                class94.field1395[var39] = (byte) (class94.field1395[var39] | 0x2);
                            } else if (class94.method2961(var3, var39)) {
                                class94.field1395[var39] = (byte) (class94.field1395[var39] | 0x2);
                            }
                        }
                    }
                }
                var3.method3498();
                if (var31 != 0) {
                    throw new RuntimeException();
                }
                var3.method3510();
                for (int var41 = 0; var41 < class94.field1399; var41++) {
                    int var42 = class94.field1400[var41];
                    if ((class94.field1395[var42] & 0x1) == 0) {
                        if (var31 > 0) {
                            var31--;
                            class94.field1395[var42] = (byte) (class94.field1395[var42] | 0x2);
                        } else {
                            int var43 = var3.method3497(1);
                            if (var43 == 0) {
                                var31 = class94.method582(var3);
                                class94.field1395[var42] = (byte) (class94.field1395[var42] | 0x2);
                            } else if (class94.method2961(var3, var42)) {
                                class94.field1395[var42] = (byte) (class94.field1395[var42] | 0x2);
                            }
                        }
                    }
                }
                var3.method3498();
                if (var31 != 0) {
                    throw new RuntimeException();
                }
                class94.field1397 = 0;
                class94.field1399 = 0;
                for (int var44 = 1; var44 < 2048; var44++) {
                    class94.field1395[var44] = (byte) (class94.field1395[var44] >> 1);
                    class73 var45 = field965[var44];
                    if (var45 == null) {
                        class94.field1400[++class94.field1399 - 1] = var44;
                    } else {
                        class94.field1398[++class94.field1397 - 1] = var44;
                    }
                }
                for (int var46 = 0; var46 < class94.field1396; var46++) {
                    int var47 = class94.field1405[var46];
                    class73 var48 = field965[var47];
                    int var49 = var3.method3236();
                    if ((var49 & 0x80) != 0) {
                        var49 += var3.method3236() << 8;
                    }
                    byte var50 = -1;
                    if ((var49 & 0x10) != 0) {
                        int var51 = var3.method3273();
                        if (var51 == 65535) {
                            var51 = -1;
                        }
                        int var52 = var3.method3266();
                        method3172(var48, var51, var52);
                    }
                    if ((var49 & 0x400) != 0) {
                        var50 = var3.method3228();
                    }
                    if ((var49 & 0x8) != 0) {
                        var48.field1164 = var3.method3275();
                        if (var48.field1164 == 65535) {
                            var48.field1164 = -1;
                        }
                    }
                    if ((var49 & 0x800) != 0) {
                        var48.field1160 = var3.method3237();
                        var48.field1182 = var3.method3312();
                        var48.field1147 = var3.method3237();
                        var48.field1183 = var3.method3312();
                        var48.field1184 = var3.method3273() + field1108;
                        var48.field1185 = var3.method3238() + field1108;
                        var48.field1186 = var3.method3238();
                        if (var48.field821) {
                            var48.field1160 += var48.field822;
                            var48.field1182 += var48.field832;
                            var48.field1147 += var48.field822;
                            var48.field1183 += var48.field832;
                            var48.field1192 = 0;
                        } else {
                            var48.field1160 += var48.field1193[0];
                            var48.field1182 += var48.field1194[0];
                            var48.field1147 += var48.field1193[0];
                            var48.field1183 += var48.field1194[0];
                            var48.field1192 = 1;
                        }
                        var48.field1197 = 0;
                    }
                    if ((var49 & 0x200) != 0) {
                        class94.field1394[var47] = var3.method3237();
                    }
                    if ((var49 & 0x1) != 0) {
                        var48.field1143 = var3.method3238();
                        if (var48.field1192 == 0) {
                            var48.field1155 = var48.field1143;
                            var48.field1143 = -1;
                        }
                    }
                    if ((var49 & 0x20) != 0) {
                        int var53 = var3.method3238();
                        class257[] var54 = new class257[] { class257.field3342, class257.field3346, class257.field3345, class257.field3343, class257.field3341, class257.field3344 };
                        class257 var55 = (class257) class190.method241(var54, var3.method3266());
                        boolean var56 = var3.method3265() == 1;
                        int var57 = var3.method3266();
                        int var58 = var3.field2545;
                        if (var48.field820 != null && var48.field836 != null) {
                            boolean var59 = false;
                            if (var55.field3349 && Statics.field2030.method1586(var48.field820)) {
                                var59 = true;
                            }
                            if (!var59 && field963 == 0 && !var48.field843) {
                                class94.field1393.field2545 = 0;
                                var3.method3287(class94.field1393.field2544, 0, var57);
                                class94.field1393.field2545 = 0;
                                String var60 = class313.method5072(class319.method4998(class314.method248(class94.field1393)));
                                var48.field1188 = var60.trim();
                                var48.field1150 = var53 >> 8;
                                var48.field1156 = var53 & 0xFF;
                                var48.field1154 = 150;
                                var48.field1152 = var56;
                                var48.field1153 = Statics.field434 != var48 && var55.field3349 && field1065 != "" && var60.toLowerCase().indexOf(field1065) == -1;
                                int var61;
                                if (var55.field3340) {
                                    var61 = var56 ? 91 : 1;
                                } else {
                                    var61 = var56 ? 90 : 2;
                                }
                                if (var55.field3347 == -1) {
                                    class96.method83(var61, var48.field820.method5022(), var60);
                                } else {
                                    class96.method83(var61, class87.method2928(var55.field3347) + var48.field820.method5022(), var60);
                                }
                            }
                        }
                        var3.field2545 = var57 + var58;
                    }
                    if ((var49 & 0x100) != 0) {
                        var48.field1190 = var3.method3275();
                        int var62 = var3.method3285();
                        var48.field1179 = var62 >> 16;
                        var48.field1178 = (var62 & 0xFFFF) + field1108;
                        var48.field1176 = 0;
                        var48.field1177 = 0;
                        if (var48.field1178 > field1108) {
                            var48.field1176 = -1;
                        }
                        if (var48.field1190 == 65535) {
                            var48.field1190 = -1;
                        }
                    }
                    if ((var49 & 0x40) != 0) {
                        var48.field1188 = var3.method3257();
                        if (var48.field1188.charAt(0) == '~') {
                            var48.field1188 = var48.field1188.substring(1);
                            class96.method83(2, var48.field820.method5022(), var48.field1188);
                        } else if (Statics.field434 == var48) {
                            class96.method83(2, var48.field820.method5022(), var48.field1188);
                        }
                        var48.field1152 = false;
                        var48.field1150 = 0;
                        var48.field1156 = 0;
                        var48.field1154 = 150;
                    }
                    if ((var49 & 0x4) != 0) {
                        int var63 = var3.method3236();
                        byte[] var64 = new byte[var63];
                        class195 var65 = new class195(var64);
                        var3.method3287(var64, 0, var63);
                        class94.field1406[var47] = var65;
                        var48.method1115(var65);
                    }
                    if ((var49 & 0x2) != 0) {
                        int var66 = var3.method3236();
                        if (var66 > 0) {
                            for (int var67 = 0; var67 < var66; var67++) {
                                int var68 = -1;
                                int var69 = -1;
                                int var70 = -1;
                                int var71 = var3.method3244();
                                if (var71 == 32767) {
                                    var71 = var3.method3244();
                                    var69 = var3.method3244();
                                    var68 = var3.method3244();
                                    var70 = var3.method3244();
                                } else if (var71 == 32766) {
                                    var71 = -1;
                                } else {
                                    var69 = var3.method3244();
                                }
                                int var72 = var3.method3244();
                                var48.method1515(var71, var69, var68, var70, field1108, var72);
                            }
                        }
                        int var73 = var3.method3236();
                        if (var73 > 0) {
                            for (int var74 = 0; var74 < var73; var74++) {
                                int var75 = var3.method3244();
                                int var76 = var3.method3244();
                                if (var76 == 32767) {
                                    var48.method1517(var75);
                                } else {
                                    int var77 = var3.method3244();
                                    int var78 = var3.method3265();
                                    int var79 = var76 > 0 ? var3.method3264() : var78;
                                    var48.method1516(var75, field1108, var76, var77, var78, var79);
                                }
                            }
                        }
                    }
                    if ((var49 & 0x1000) != 0) {
                        for (int var80 = 0; var80 < 3; var80++) {
                            var48.field831[var80] = var3.method3257();
                        }
                    }
                    if (var48.field821) {
                        if (var50 == 127) {
                            var48.method1103(var48.field822, var48.field832);
                        } else {
                            byte var81;
                            if (var50 == -1) {
                                var81 = class94.field1394[var47];
                            } else {
                                var81 = var50;
                            }
                            var48.method1099(var48.field822, var48.field832, var81);
                        }
                    }
                }
                if (var3.field2545 - var30 != var29) {
                    throw new RuntimeException(var3.field2545 - var30 + " " + var29);
                }
                method678();
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2282 == arg0.field1459) {
                String var82 = var3.method3257();
                long var83 = var3.method3315();
                long var85 = (long) var3.method3238();
                long var87 = (long) var3.method3399();
                class257[] var89 = new class257[] { class257.field3342, class257.field3346, class257.field3345, class257.field3343, class257.field3341, class257.field3344 };
                class257 var90 = (class257) class190.method241(var89, var3.method3236());
                long var91 = (var85 << 32) + var87;
                boolean var93 = false;
                for (int var94 = 0; var94 < 100; var94++) {
                    if (field1066[var94] == var91) {
                        var93 = true;
                        break;
                    }
                }
                if (var90.field3349 && Statics.field2030.method1586(new class306(var82, Statics.field613))) {
                    var93 = true;
                }
                if (!var93 && field963 == 0) {
                    field1066[field1067] = var91;
                    field1067 = (field1067 + 1) % 100;
                    String var95 = class313.method5072(class319.method4998(class314.method248(var3)));
                    if (var90.field3347 == -1) {
                        class96.method1023(9, var82, var95, class317.method188(var83));
                    } else {
                        class96.method1023(9, class87.method2928(var90.field3347) + var82, var95, class317.method188(var83));
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2329 == arg0.field1459) {
                for (int var96 = 0; var96 < Statics.field3449; var96++) {
                    class269 var97 = class269.method1161(var96);
                    if (var97 != null) {
                        class238.field2773[var96] = 0;
                        class238.field2771[var96] = 0;
                    }
                }
                method510();
                field1034 += 32;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2271 == arg0.field1459) {
                method2642(class184.field2460);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2263 == arg0.field1459) {
                int var98 = var3.method3236();
                class321[] var99 = new class321[] { class321.field3934, class321.field3936, class321.field3935 };
                class321[] var100 = var99;
                int var101 = 0;
                class321 var103;
                while (true) {
                    if (var101 >= var100.length) {
                        var103 = null;
                        break;
                    }
                    class321 var102 = var100[var101];
                    if (var102.field3937 == var98) {
                        var103 = var102;
                        break;
                    }
                    var101++;
                }
                Statics.field2569 = var103;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2304 == arg0.field1459) {
                String var104 = var3.method3257();
                Statics.field1387 = var104;
                try {
                    String var105 = Statics.field3013.getParameter(class294.field3806.field3811);
                    String var106 = Statics.field3013.getParameter(class294.field3795.field3811);
                    String var107 = var105 + "settings=" + var104 + "; version=1; path=/; domain=" + var106;
                    String var108;
                    if (var104.length() == 0) {
                        var108 = var107 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var109 = var107 + "; Expires=";
                        long var110 = Statics.method426() + 94608000000L;
                        class205.field2607.setTime(new Date(var110));
                        int var112 = class205.field2607.get(7);
                        int var113 = class205.field2607.get(5);
                        int var114 = class205.field2607.get(2);
                        int var115 = class205.field2607.get(1);
                        int var116 = class205.field2607.get(11);
                        int var117 = class205.field2607.get(12);
                        int var118 = class205.field2607.get(13);
                        String var119 = class205.field2603[var112 - 1] + ", " + var113 / 10 + var113 % 10 + "-" + class205.field2606[0][var114] + "-" + var115 + " " + var116 / 10 + var116 % 10 + ":" + var117 / 10 + var117 % 10 + ":" + var118 / 10 + var118 % 10 + " GMT";
                        var108 = var109 + var119 + "; Max-Age=" + 94608000L;
                    }
                    client var120 = Statics.field3013;
                    String var121 = "document.cookie=\"" + var108 + "\"";
                    JSObject.getWindow(var120).eval(var121);
                } catch (Throwable var308) {
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2311 == arg0.field1459) {
                method510();
                int var123 = var3.method3264();
                int var124 = var3.method3265();
                int var125 = var3.method3284();
                field983[var124] = var125;
                field948[var124] = var123;
                field1031[var124] = 1;
                for (int var126 = 0; var126 < 98; var126++) {
                    if (var125 >= class249.field3007[var126]) {
                        field1031[var124] = var126 + 2;
                    }
                }
                field895[++field1038 - 1 & 0x1F] = var124;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2323 == arg0.field1459) {
                method175(true, arg0.field1460);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2269 == arg0.field1459) {
                int var127 = var3.method3286();
                int var128 = var3.method3275();
                int var129 = var3.method3275();
                class243 var130 = class243.method3168(var127);
                var130.field2816 = (var128 << 16) + var129;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2303 == arg0.field1459) {
                int var131 = var3.method3241();
                int var132 = var3.method3238();
                if (var131 < -70000) {
                    var132 += 32768;
                }
                class243 var133;
                if (var131 >= 0) {
                    var133 = class243.method3168(var131);
                } else {
                    var133 = null;
                }
                while (var3.field2545 < arg0.field1453) {
                    int var134 = var3.method3244();
                    int var135 = var3.method3238();
                    int var136 = 0;
                    if (var135 != 0) {
                        var136 = var3.method3236();
                        if (var136 == 255) {
                            var136 = var3.method3241();
                        }
                    }
                    if (var133 != null && var134 >= 0 && var134 < var133.field2936.length) {
                        var133.field2936[var134] = var135;
                        var133.field2817[var134] = var136;
                    }
                    class66.method158(var132, var134, var135 - 1, var136);
                }
                if (var133 != null) {
                    method942(var133);
                }
                method510();
                field1035[++field1036 - 1 & 0x1F] = var132 & 0x7FFF;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2341 == arg0.field1459) {
                field852 = true;
                Statics.field2467 = var3.method3236();
                Statics.field323 = var3.method3236();
                Statics.field415 = var3.method3238();
                Statics.field252 = var3.method3236();
                Statics.field702 = var3.method3236();
                if (Statics.field702 >= 100) {
                    Statics.field1410 = Statics.field2467 * 128 + 64;
                    Statics.field250 = Statics.field323 * 128 + 64;
                    Statics.field2131 = method2870(Statics.field1410, Statics.field250, Statics.field3841) - Statics.field415;
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2318 == arg0.field1459) {
                method2642(class184.field2456);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2294 == arg0.field1459) {
                int var137 = var3.method3284();
                int var138 = var3.method3392();
                class243 var139 = class243.method3168(var137);
                if (var139.field2839 != var138 || var138 == -1) {
                    var139.field2839 = var138;
                    var139.field2940 = 0;
                    var139.field2941 = 0;
                    method942(var139);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2345 == arg0.field1459) {
                boolean var140 = var3.method3243();
                if (!var140) {
                    Statics.field1468 = null;
                } else if (Statics.field1468 == null) {
                    Statics.field1468 = new class266();
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2276 == arg0.field1459) {
                int var141 = var3.method3241();
                class68 var142 = (class68) field1010.method3677((long) var141);
                if (var142 != null) {
                    Statics.method1828(var142, true);
                }
                if (field1013 != null) {
                    method942(field1013);
                    field1013 = null;
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2343 == arg0.field1459) {
                int var143 = var3.method3286();
                int var144 = var3.method3273();
                class243 var145 = class243.method3168(var143);
                if (var145 != null && var145.field2820 == 0) {
                    if (var144 > var145.field2878 - var145.field2834) {
                        var144 = var145.field2878 - var145.field2834;
                    }
                    if (var144 < 0) {
                        var144 = 0;
                    }
                    if (var145.field2829 != var144) {
                        var145.field2829 = var144;
                        method942(var145);
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2316 == arg0.field1459) {
                method2642(class184.field2457);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2302 == arg0.field1459) {
                int var146 = var3.method3343();
                field1009 = var146;
                this.method1158(false);
                if (class243.method1894(var146)) {
                    class243[] var147 = Statics.field2810[var146];
                    for (int var148 = 0; var148 < var147.length; var148++) {
                        class243 var149 = var147[var148];
                        if (var149 != null) {
                            var149.field2940 = 0;
                            var149.field2941 = 0;
                        }
                    }
                }
                class82.method273(field1009);
                for (int var150 = 0; var150 < 100; var150++) {
                    field1052[var150] = true;
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2330 == arg0.field1459) {
                int var151 = var3.method3238();
                if (var151 == 65535) {
                    var151 = -1;
                }
                int var152 = var3.method3284();
                int var153 = var3.method3286();
                class243 var154 = class243.method3168(var152);
                if (var154.field2846) {
                    var154.field2938 = var151;
                    var154.field2910 = var153;
                    class284 var156 = class284.method1694(var151);
                    var154.field2869 = var156.field3649;
                    var154.field2819 = var156.field3663;
                    var154.field2871 = var156.field3664;
                    var154.field2867 = var156.field3665;
                    var154.field2868 = var156.field3662;
                    var154.field2872 = var156.field3661;
                    if (var156.field3646 == 1) {
                        var154.field2865 = 1;
                    } else {
                        var154.field2865 = 2;
                    }
                    if (var154.field2873 > 0) {
                        var154.field2872 = var154.field2872 * 32 / var154.field2873;
                    } else if (var154.field2939 > 0) {
                        var154.field2872 = var154.field2872 * 32 / var154.field2939;
                    }
                    method942(var154);
                } else if (var151 == -1) {
                    var154.field2861 = 0;
                    arg0.field1459 = null;
                    return true;
                } else {
                    class284 var155 = class284.method1694(var151);
                    var154.field2861 = 4;
                    var154.field2862 = var151;
                    var154.field2869 = var155.field3649;
                    var154.field2819 = var155.field3663;
                    var154.field2872 = var155.field3661 * 100 / var153;
                    method942(var154);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2342 == arg0.field1459) {
                class327.method1773(var3, arg0.field1453);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2292 == arg0.field1459) {
                method2642(class184.field2459);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2288 == arg0.field1459) {
                method2642(class184.field2462);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2284 == arg0.field1459) {
                if (field1009 != -1) {
                    method44(field1009, 0);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2287 == arg0.field1459) {
                field1077 = var3.method3236();
                if (field1077 == 255) {
                    field1077 = 0;
                }
                field904 = var3.method3236();
                if (field904 == 255) {
                    field904 = 0;
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2286 == arg0.field1459) {
                method3013(true, var3);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2310 == arg0.field1459) {
                Statics.field2035 = var3.method3265();
                Statics.field743 = var3.method3265();
                for (int var157 = Statics.field743; var157 < Statics.field743 + 8; var157++) {
                    for (int var158 = Statics.field2035; var158 < Statics.field2035 + 8; var158++) {
                        if (field886[Statics.field3841][var157][var158] != null) {
                            field886[Statics.field3841][var157][var158] = null;
                            method741(var157, var158);
                        }
                    }
                }
                for (class75 var159 = (class75) field978.method3731(); var159 != null; var159 = (class75) field978.method3733()) {
                    if (var159.field1124 >= Statics.field743 && var159.field1124 < Statics.field743 + 8 && var159.field1134 >= Statics.field2035 && var159.field1134 < Statics.field2035 + 8 && Statics.field3841 == var159.field1128) {
                        var159.field1133 = 0;
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2327 == arg0.field1459) {
                int var160 = var3.method3236();
                int var161 = var3.method3236();
                int var162 = var3.method3236();
                int var163 = var3.method3236();
                field1092[var160] = true;
                field1093[var160] = var161;
                field1094[var160] = var162;
                field1095[var160] = var163;
                field1097[var160] = 0;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2314 == arg0.field1459) {
                String var164 = var3.method3257();
                Object[] var165 = new Object[var164.length() + 1];
                for (int var166 = var164.length() - 1; var166 >= 0; var166--) {
                    if (var164.charAt(var166) == 's') {
                        var165[var166 + 1] = var3.method3257();
                    } else {
                        var165[var166 + 1] = Integer.valueOf(var3.method3241());
                    }
                }
                var165[0] = Integer.valueOf(var3.method3241());
                class69 var167 = new class69();
                var167.field788 = var165;
                class82.method187(var167, 500000);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2325 == arg0.field1459) {
                int var168 = var3.method3284();
                int var169 = var3.method3275();
                class238.field2773[var169] = var168;
                if (class238.field2771[var169] != var168) {
                    class238.field2771[var169] = var168;
                }
                method15(var169);
                field1033[++field1034 - 1 & 0x1F] = var169;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2291 == arg0.field1459) {
                int var170 = var3.method3264();
                String var171 = var3.method3257();
                int var172 = var3.method3265();
                if (var170 >= 1 && var170 <= 8) {
                    if (var171.equalsIgnoreCase(class252.field3052)) {
                        var171 = null;
                    }
                    field973[var170 - 1] = var171;
                    field1082[var170 - 1] = var172 == 0;
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2336 == arg0.field1459) {
                int var173 = var3.method3343();
                class66.method185(var173);
                field1035[++field1036 - 1 & 0x1F] = var173 & 0x7FFF;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2339 == arg0.field1459) {
                String var174 = var3.method3257();
                int var175 = var3.method3284();
                class243 var176 = class243.method3168(var175);
                if (!var174.equals(var176.field2827)) {
                    var176.field2827 = var174;
                    method942(var176);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2273 == arg0.field1459) {
                class78 var177 = new class78();
                var177.field1209 = var3.method3257();
                var177.field1213 = var3.method3238();
                int var178 = var3.method3241();
                var177.field1217 = var178;
                method153(45);
                var2.method3022();
                Object var179 = null;
                class91.method603(var177);
                arg0.field1459 = null;
                return false;
            }
            if (class181.field2283 == arg0.field1459) {
                int var180 = var3.method3284();
                boolean var181 = var3.method3264() == 1;
                class243 var182 = class243.method3168(var180);
                if (var182.field2838 != var181) {
                    var182.field2838 = var181;
                    method942(var182);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2326 == arg0.field1459) {
                field1004 = var3.method3236();
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2279 == arg0.field1459) {
                String var183 = var3.method3257();
                String var187;
                try {
                    int var184 = var3.method3244();
                    if (var184 > 32767) {
                        var184 = 32767;
                    }
                    byte[] var185 = new byte[var184];
                    var3.field2545 += Statics.field3913.method3164(var3.field2544, var3.field2545, var185, 0, var184);
                    String var186 = Statics.method1082(var185, 0, var184);
                    var187 = var186;
                } catch (Exception var307) {
                    var187 = "Cabbage";
                }
                String var190 = class313.method5072(class319.method4998(var187));
                class96.method83(6, var183, var190);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2278 == arg0.field1459) {
                method2642(class184.field2461);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2307 == arg0.field1459) {
                int var191 = var3.method3343();
                int var192 = var3.method3285();
                class243 var193 = class243.method3168(var192);
                if (var193.field2861 != 1 || var193.field2862 != var191) {
                    var193.field2861 = 1;
                    var193.field2862 = var191;
                    method942(var193);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2280 == arg0.field1459) {
                int var194 = var3.method3241();
                int var195 = var3.method3238();
                if (var194 < -70000) {
                    var195 += 32768;
                }
                class243 var196;
                if (var194 >= 0) {
                    var196 = class243.method3168(var194);
                } else {
                    var196 = null;
                }
                if (var196 != null) {
                    for (int var197 = 0; var197 < var196.field2936.length; var197++) {
                        var196.field2936[var197] = 0;
                        var196.field2817[var197] = 0;
                    }
                }
                class66.method2964(var195);
                int var198 = var3.method3238();
                for (int var199 = 0; var199 < var198; var199++) {
                    int var200 = var3.method3273();
                    int var201 = var3.method3266();
                    if (var201 == 255) {
                        var201 = var3.method3241();
                    }
                    if (var196 != null && var199 < var196.field2936.length) {
                        var196.field2936[var199] = var200;
                        var196.field2817[var199] = var201;
                    }
                    class66.method158(var195, var199, var200 - 1, var201);
                }
                if (var196 != null) {
                    method942(var196);
                }
                method510();
                field1035[++field1036 - 1 & 0x1F] = var195 & 0x7FFF;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2313 == arg0.field1459) {
                field949 = var3.method3236();
                if (field949 == 1) {
                    field868 = var3.method3238();
                }
                if (field949 >= 2 && field949 <= 6) {
                    if (field949 == 2) {
                        field873 = 64;
                        field874 = 64;
                    }
                    if (field949 == 3) {
                        field873 = 0;
                        field874 = 64;
                    }
                    if (field949 == 4) {
                        field873 = 128;
                        field874 = 64;
                    }
                    if (field949 == 5) {
                        field873 = 64;
                        field874 = 0;
                    }
                    if (field949 == 6) {
                        field873 = 64;
                        field874 = 128;
                    }
                    field949 = 2;
                    field990 = var3.method3238();
                    field871 = var3.method3238();
                    field1030 = var3.method3236();
                }
                if (field949 == 10) {
                    field869 = var3.method3238();
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2262 == arg0.field1459) {
                boolean var202 = var3.method3236() == 1;
                if (var202) {
                    Statics.field2604 = Statics.method426() - var3.method3315();
                    Statics.field2062 = new class14(var3, true);
                } else {
                    Statics.field2062 = null;
                }
                field914 = field1032;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2268 == arg0.field1459) {
                int var203 = var3.method3343();
                if (var203 == 65535) {
                    var203 = -1;
                }
                int var204 = var3.method3273();
                if (var204 == 65535) {
                    var204 = -1;
                }
                int var205 = var3.method3241();
                int var206 = var3.method3284();
                for (int var207 = var204; var207 <= var203; var207++) {
                    long var208 = ((long) var205 << 32) + (long) var207;
                    class217 var210 = field896.method3677(var208);
                    if (var210 != null) {
                        var210.method3721();
                    }
                    field896.method3669(new class224(var206), var208);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2344 == arg0.field1459) {
                method3013(false, var3);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2320 == arg0.field1459) {
                int var211 = var3.method3236();
                if (var3.method3236() == 0) {
                    field1113[var211] = new class17();
                    var3.field2545 += 18;
                } else {
                    var3.field2545--;
                    field1113[var211] = new class17(var3, false);
                }
                field1058 = field1032;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2301 == arg0.field1459) {
                int var212 = var3.method3236();
                method531(var212);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2274 == arg0.field1459) {
                int var213 = var3.method3238();
                int var214 = var3.method3236();
                int var215 = var3.method3238();
                method1895(var213, var214, var215);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2319 == arg0.field1459) {
                method2642(class184.field2465);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2299 == arg0.field1459) {
                int var216 = var3.method3241();
                int var217 = var3.method3241();
                int var218 = 0;
                if (Statics.field33 == null || !Statics.field33.isValid()) {
                    try {
                        Iterator var219 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var219.hasNext()) {
                            GarbageCollectorMXBean var220 = (GarbageCollectorMXBean) var219.next();
                            if (var220.isValid()) {
                                Statics.field33 = var220;
                                field676 = -1L;
                                field661 = -1L;
                            }
                        }
                    } catch (Throwable var309) {
                    }
                }
                if (Statics.field33 != null) {
                    long var222 = Statics.method426();
                    long var224 = Statics.field33.getCollectionTime();
                    if (field661 != -1L) {
                        long var226 = var224 - field661;
                        long var228 = var222 - field676;
                        if (var228 != 0L) {
                            var218 = (int) (var226 * 100L / var228);
                        }
                    }
                    field661 = var224;
                    field676 = var222;
                }
                class185 var232 = class185.method343(class182.field2441, field1073.field1457);
                var232.field2478.method3261(field651);
                var232.field2478.method3261(var218);
                var232.field2478.method3283(var216);
                var232.field2478.method3412(var217);
                field1073.method1916(var232);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2272 == arg0.field1459) {
                Statics.field2030.method1582(var3, arg0.field1453);
                field1040 = field1032;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2333 == arg0.field1459) {
                Statics.field2030.method1611();
                field1040 = field1032;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2335 == arg0.field1459) {
                method2545();
                arg0.field1459 = null;
                return false;
            }
            if (class181.field2297 == arg0.field1459) {
                byte var233 = var3.method3312();
                int var234 = var3.method3273();
                class238.field2773[var234] = var233;
                if (class238.field2771[var234] != var233) {
                    class238.field2771[var234] = var233;
                }
                method15(var234);
                field1033[++field1034 - 1 & 0x1F] = var234;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2321 == arg0.field1459) {
                method510();
                field863 = var3.method3239();
                field982 = field1032;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2315 == arg0.field1459) {
                int var235 = var3.method3286();
                class243 var236 = class243.method3168(var235);
                for (int var237 = 0; var237 < var236.field2936.length; var237++) {
                    var236.field2936[var237] = -1;
                    var236.field2936[var237] = 0;
                }
                method942(var236);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2264 == arg0.field1459) {
                String var238 = var3.method3257();
                long var239 = (long) var3.method3238();
                long var241 = (long) var3.method3399();
                class257[] var243 = new class257[] { class257.field3342, class257.field3346, class257.field3345, class257.field3343, class257.field3341, class257.field3344 };
                class257 var244 = (class257) class190.method241(var243, var3.method3236());
                long var245 = (var239 << 32) + var241;
                boolean var247 = false;
                for (int var248 = 0; var248 < 100; var248++) {
                    if (field1066[var248] == var245) {
                        var247 = true;
                        break;
                    }
                }
                if (Statics.field2030.method1586(new class306(var238, Statics.field613))) {
                    var247 = true;
                }
                if (!var247 && field963 == 0) {
                    field1066[field1067] = var245;
                    field1067 = (field1067 + 1) % 100;
                    String var249 = class313.method5072(class319.method4998(class314.method248(var3)));
                    byte var250;
                    if (var244.field3340) {
                        var250 = 7;
                    } else {
                        var250 = 3;
                    }
                    if (var244.field3347 == -1) {
                        class96.method83(var250, var238, var249);
                    } else {
                        class96.method83(var250, class87.method2928(var244.field3347) + var238, var249);
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2305 == arg0.field1459) {
                int var251 = var3.method3238();
                int var252 = var3.method3241();
                int var253 = var3.method3264();
                class68 var254 = (class68) field1010.method3677((long) var252);
                if (var254 != null) {
                    Statics.method1828(var254, var254.field778 != var251);
                }
                method2553(var252, var251, var253);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2308 == arg0.field1459) {
                int var255 = var3.method3275();
                int var256 = var3.method3241();
                int var257 = var255 >> 10 & 0x1F;
                int var258 = var255 >> 5 & 0x1F;
                int var259 = var255 & 0x1F;
                int var260 = (var259 << 3) + (var257 << 19) + (var258 << 11);
                class243 var261 = class243.method3168(var256);
                if (var261.field2843 != var260) {
                    var261.field2843 = var260;
                    method942(var261);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2312 == arg0.field1459) {
                int var262 = var3.method3275();
                int var263 = var3.method3275();
                int var264 = var3.method3343();
                int var265 = var3.method3284();
                class243 var266 = class243.method3168(var265);
                if (var266.field2869 != var263 || var266.field2819 != var262 || var266.field2872 != var264) {
                    var266.field2869 = var263;
                    var266.field2819 = var262;
                    var266.field2872 = var264;
                    method942(var266);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2300 == arg0.field1459) {
                int var267 = arg0.field1453 + var3.field2545;
                int var268 = var3.method3238();
                int var269 = var3.method3238();
                if (field1009 != var268) {
                    field1009 = var268;
                    this.method1158(false);
                    int var270 = field1009;
                    if (class243.method1894(var270)) {
                        class243[] var271 = Statics.field2810[var270];
                        for (int var272 = 0; var272 < var271.length; var272++) {
                            class243 var273 = var271[var272];
                            if (var273 != null) {
                                var273.field2940 = 0;
                                var273.field2941 = 0;
                            }
                        }
                    }
                    class82.method273(field1009);
                    for (int var274 = 0; var274 < 100; var274++) {
                        field1052[var274] = true;
                    }
                }
                while (var269-- > 0) {
                    int var275 = var3.method3241();
                    int var276 = var3.method3238();
                    int var277 = var3.method3236();
                    class68 var278 = (class68) field1010.method3677((long) var275);
                    if (var278 != null && var278.field778 != var276) {
                        Statics.method1828(var278, true);
                        var278 = null;
                    }
                    if (var278 == null) {
                        var278 = method2553(var275, var276, var277);
                    }
                    var278.field774 = true;
                }
                for (class68 var279 = (class68) field1010.method3667(); var279 != null; var279 = (class68) field1010.method3672()) {
                    if (var279.field774) {
                        var279.field774 = false;
                    } else {
                        Statics.method1828(var279, true);
                    }
                }
                field896 = new class215(512);
                while (var3.field2545 < var267) {
                    int var280 = var3.method3241();
                    int var281 = var3.method3238();
                    int var282 = var3.method3238();
                    int var283 = var3.method3241();
                    for (int var284 = var281; var284 <= var282; var284++) {
                        long var285 = ((long) var280 << 32) + (long) var284;
                        field896.method3669(new class224(var283), var285);
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2289 == arg0.field1459) {
                var3.field2545 += 28;
                if (var3.method3305()) {
                    method176(var3, var3.field2545 - 28);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2324 == arg0.field1459) {
                int var287 = var3.method3241();
                if (field931 != var287) {
                    field931 = var287;
                    if (field924 == 1) {
                        field955 = true;
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2317 == arg0.field1459) {
                Statics.field2035 = var3.method3236();
                Statics.field743 = var3.method3265();
                while (var3.field2545 < arg0.field1453) {
                    int var288 = var3.method3236();
                    class184[] var289 = new class184[] { class184.field2462, class184.field2457, class184.field2460, class184.field2459, class184.field2456, class184.field2461, class184.field2458, class184.field2463, class184.field2464, class184.field2465 };
                    class184 var290 = var289[var288];
                    method2642(var290);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2337 == arg0.field1459) {
                method2642(class184.field2464);
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2285 == arg0.field1459) {
                if (arg0.field1453 == 0) {
                    Statics.field616 = null;
                } else {
                    if (Statics.field616 == null) {
                        Statics.field616 = new class308(Statics.field613, Statics.field3013);
                    }
                    Statics.field616.method5029(var3);
                }
                method3544();
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2340 == arg0.field1459) {
                int var291 = var3.method3244();
                boolean var292 = var3.method3236() == 1;
                String var293 = "";
                boolean var294 = false;
                if (var292) {
                    var293 = var3.method3257();
                    if (Statics.field2030.method1586(new class306(var293, Statics.field613))) {
                        var294 = true;
                    }
                }
                String var295 = var3.method3257();
                if (!var294) {
                    class96.method83(var291, var293, var295);
                }
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2309 == arg0.field1459) {
                if (Statics.field616 != null) {
                    Statics.field616.method5030(var3);
                }
                method3544();
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2338 == arg0.field1459) {
                field866 = var3.method3238() * 30;
                field982 = field1032;
                arg0.field1459 = null;
                return true;
            }
            if (class181.field2328 == arg0.field1459) {
                field852 = true;
                Statics.field3330 = var3.method3236();
                Statics.field373 = var3.method3236();
                Statics.field16 = var3.method3238();
                Statics.field317 = var3.method3236();
                Statics.field625 = var3.method3236();
                if (Statics.field625 >= 100) {
                    int var296 = Statics.field3330 * 128 + 64;
                    int var297 = Statics.field373 * 128 + 64;
                    int var298 = method2870(var296, var297, Statics.field3841) - Statics.field16;
                    int var299 = var296 - Statics.field1410;
                    int var300 = var298 - Statics.field2131;
                    int var301 = var297 - Statics.field250;
                    int var302 = (int) Math.sqrt((double) (var299 * var299 + var301 * var301));
                    Statics.field436 = (int) (Math.atan2((double) var300, (double) var302) * 325.949D) & 0x7FF;
                    Statics.field711 = (int) (Math.atan2((double) var299, (double) var301) * -325.949D) & 0x7FF;
                    if (Statics.field436 < 128) {
                        Statics.field436 = 128;
                    }
                    if (Statics.field436 > 383) {
                        Statics.field436 = 383;
                    }
                }
                arg0.field1459 = null;
                return true;
            }
            class165.method2453("" + (arg0.field1459 == null ? -1 : arg0.field1459.field2346) + class87.field1303 + (arg0.field1458 == null ? -1 : arg0.field1458.field2346) + class87.field1303 + (arg0.field1466 == null ? -1 : arg0.field1466.field2346) + class87.field1303 + arg0.field1453, (Throwable) null);
            method2545();
        } catch (IOException var310) {
            method238();
        } catch (Exception var311) {
            String var305 = "" + (arg0.field1459 == null ? -1 : arg0.field1459.field2346) + class87.field1303 + (arg0.field1458 == null ? -1 : arg0.field1458.field2346) + class87.field1303 + (arg0.field1466 == null ? -1 : arg0.field1466.field2346) + class87.field1303 + arg0.field1453 + class87.field1303 + (Statics.field494 + Statics.field434.field1193[0]) + class87.field1303 + (Statics.field2794 + Statics.field434.field1194[0]) + class87.field1303;
            for (int var306 = 0; var306 < arg0.field1453 && var306 < 50; var306++) {
                var305 = var305 + var3.field2544[var306] + class87.field1303;
            }
            class165.method2453(var305, var311);
            method2545();
        }
        return true;
    }

    @ObfuscatedName("ei.gy(Lga;B)V")
    public static final void method2642(class184 arg0) {
        class202 var1 = field1073.field1460;
        if (class184.field2460 == arg0) {
            int var2 = var1.method3266();
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = field910[var3];
            int var6 = var1.method3265();
            int var7 = (var6 >> 4 & 0x7) + Statics.field743;
            int var8 = (var6 & 0x7) + Statics.field2035;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method500(Statics.field3841, var7, var8, var5, -1, var3, var4, 0, -1);
            }
        } else if (class184.field2464 == arg0) {
            int var9 = var1.method3236();
            int var10 = (var9 >> 4 & 0x7) + Statics.field743;
            int var11 = (var9 & 0x7) + Statics.field2035;
            int var12 = var1.method3273();
            int var13 = var1.method3265();
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = field910[var14];
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                method500(Statics.field3841, var10, var11, var16, var12, var14, var15, 0, -1);
            }
        } else if (class184.field2457 == arg0) {
            int var17 = var1.method3265();
            int var18 = (var17 >> 4 & 0x7) + Statics.field743;
            int var19 = (var17 & 0x7) + Statics.field2035;
            int var20 = var1.method3275();
            int var21 = var1.method3275();
            int var22 = var1.method3265();
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                int var23 = var18 * 128 + 64;
                int var24 = var19 * 128 + 64;
                class83 var25 = new class83(var21, Statics.field3841, var23, var24, method2870(var23, var24, Statics.field3841) - var22, var20, field1108);
                field980.method3759(var25);
            }
        } else {
            if (class184.field2465 == arg0) {
                int var26 = var1.method3266();
                int var27 = (var26 >> 4 & 0x7) + Statics.field743;
                int var28 = (var26 & 0x7) + Statics.field2035;
                int var29 = var1.method3266();
                int var30 = var29 >> 4 & 0xF;
                int var31 = var29 & 0x7;
                int var32 = var1.method3266();
                int var33 = var1.method3273();
                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                    int var34 = var30 + 1;
                    if (Statics.field434.field1193[0] >= var27 - var34 && Statics.field434.field1193[0] <= var27 + var34 && Statics.field434.field1194[0] >= var28 - var34 && Statics.field434.field1194[0] <= var28 + var34 && field1084 != 0 && var31 > 0 && field1085 < 50) {
                        field1086[field1085] = var33;
                        field1087[field1085] = var31;
                        field913[field1085] = var32;
                        field938[field1085] = null;
                        field942[field1085] = (var27 << 16) + (var28 << 8) + var30;
                        field1085++;
                    }
                }
            }
            if (class184.field2459 == arg0) {
                int var35 = var1.method3264();
                int var36 = (var35 >> 4 & 0x7) + Statics.field743;
                int var37 = (var35 & 0x7) + Statics.field2035;
                int var38 = var1.method3275();
                int var39 = var1.method3275();
                if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                    class93 var40 = new class93();
                    var40.field1391 = var39;
                    var40.field1389 = var38;
                    if (field886[Statics.field3841][var36][var37] == null) {
                        field886[Statics.field3841][var36][var37] = new class218();
                    }
                    field886[Statics.field3841][var36][var37].method3759(var40);
                    method741(var36, var37);
                }
            } else {
                if (class184.field2462 == arg0) {
                    int var41 = var1.method3275();
                    byte var42 = var1.method3237();
                    int var43 = var1.method3275();
                    byte var44 = var1.method3237();
                    int var45 = var1.method3264();
                    int var46 = (var45 >> 4 & 0x7) + Statics.field743;
                    int var47 = (var45 & 0x7) + Statics.field2035;
                    byte var48 = var1.method3234();
                    int var49 = var1.method3273();
                    int var50 = var1.method3265();
                    int var51 = var50 >> 2;
                    int var52 = var50 & 0x3;
                    int var53 = field910[var51];
                    int var54 = var1.method3238();
                    byte var55 = var1.method3234();
                    class73 var56;
                    if (field1056 == var54) {
                        var56 = Statics.field434;
                    } else {
                        var56 = field965[var54];
                    }
                    if (var56 != null) {
                        class283 var57 = class283.method4427(var49);
                        int var58;
                        int var59;
                        if (var52 == 1 || var52 == 3) {
                            var58 = var57.field3608;
                            var59 = var57.field3610;
                        } else {
                            var58 = var57.field3610;
                            var59 = var57.field3608;
                        }
                        int var60 = (var58 >> 1) + var46;
                        int var61 = (var58 + 1 >> 1) + var46;
                        int var62 = (var59 >> 1) + var47;
                        int var63 = (var59 + 1 >> 1) + var47;
                        int[][] var64 = class63.field707[Statics.field3841];
                        int var65 = var64[var60][var62] + var64[var61][var62] + var64[var60][var63] + var64[var61][var63] >> 2;
                        int var66 = (var46 << 7) + (var58 << 6);
                        int var67 = (var47 << 7) + (var59 << 6);
                        class132 var68 = var57.method4637(var51, var52, var64, var66, var65, var67);
                        if (var68 != null) {
                            method500(Statics.field3841, var46, var47, var53, -1, 0, 0, var43 + 1, var41 + 1);
                            var56.field824 = field1108 + var43;
                            var56.field825 = field1108 + var41;
                            var56.field829 = var68;
                            var56.field826 = var46 * 128 + var58 * 64;
                            var56.field841 = var47 * 128 + var59 * 64;
                            var56.field827 = var65;
                            if (var42 > var44) {
                                byte var69 = var42;
                                var42 = var44;
                                var44 = var69;
                            }
                            if (var48 > var55) {
                                byte var70 = var48;
                                var48 = var55;
                                var55 = var70;
                            }
                            var56.field816 = var42 + var46;
                            var56.field830 = var44 + var46;
                            var56.field815 = var47 + var48;
                            var56.field842 = var47 + var55;
                        }
                    }
                }
                if (class184.field2461 == arg0) {
                    int var71 = var1.method3238();
                    int var72 = var1.method3264();
                    int var73 = (var72 >> 4 & 0x7) + Statics.field743;
                    int var74 = (var72 & 0x7) + Statics.field2035;
                    int var75 = var1.method3236();
                    int var76 = var75 >> 2;
                    int var77 = var75 & 0x3;
                    int var78 = field910[var76];
                    if (var73 >= 0 && var74 >= 0 && var73 < 103 && var74 < 103) {
                        if (var78 == 0) {
                            class141 var79 = Statics.field495.method2668(Statics.field3841, var73, var74);
                            if (var79 != null) {
                                int var80 = var79.field2028 >> 14 & 0x7FFF;
                                if (var76 == 2) {
                                    var79.field2022 = new class98(var80, 2, var77 + 4, Statics.field3841, var73, var74, var71, false, var79.field2022);
                                    var79.field2027 = new class98(var80, 2, var77 + 1 & 0x3, Statics.field3841, var73, var74, var71, false, var79.field2027);
                                } else {
                                    var79.field2022 = new class98(var80, var76, var77, Statics.field3841, var73, var74, var71, false, var79.field2022);
                                }
                            }
                        }
                        if (var78 == 1) {
                            class146 var81 = Statics.field495.method2669(Statics.field3841, var73, var74);
                            if (var81 != null) {
                                int var82 = var81.field2072 >> 14 & 0x7FFF;
                                if (var76 == 4 || var76 == 5) {
                                    var81.field2063 = new class98(var82, 4, var77, Statics.field3841, var73, var74, var71, false, var81.field2063);
                                } else if (var76 == 6) {
                                    var81.field2063 = new class98(var82, 4, var77 + 4, Statics.field3841, var73, var74, var71, false, var81.field2063);
                                } else if (var76 == 7) {
                                    var81.field2063 = new class98(var82, 4, (var77 + 2 & 0x3) + 4, Statics.field3841, var73, var74, var71, false, var81.field2063);
                                } else if (var76 == 8) {
                                    var81.field2063 = new class98(var82, 4, var77 + 4, Statics.field3841, var73, var74, var71, false, var81.field2063);
                                    var81.field2069 = new class98(var82, 4, (var77 + 2 & 0x3) + 4, Statics.field3841, var73, var74, var71, false, var81.field2069);
                                }
                            }
                        }
                        if (var78 == 2) {
                            class147 var83 = Statics.field495.method2670(Statics.field3841, var73, var74);
                            if (var76 == 11) {
                                var76 = 10;
                            }
                            if (var83 != null) {
                                var83.field2079 = new class98(var83.field2087 >> 14 & 0x7FFF, var76, var77, Statics.field3841, var73, var74, var71, false, var83.field2079);
                            }
                        }
                        if (var78 == 3) {
                            class128 var84 = Statics.field495.method2671(Statics.field3841, var73, var74);
                            if (var84 != null) {
                                var84.field1769 = new class98(var84.field1770 >> 14 & 0x7FFF, 22, var77, Statics.field3841, var73, var74, var71, false, var84.field1769);
                            }
                        }
                    }
                } else if (class184.field2463 == arg0) {
                    int var85 = var1.method3265();
                    int var86 = (var85 >> 4 & 0x7) + Statics.field743;
                    int var87 = (var85 & 0x7) + Statics.field2035;
                    int var88 = var1.method3273();
                    int var89 = var1.method3275();
                    int var90 = var1.method3238();
                    if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                        class218 var91 = field886[Statics.field3841][var86][var87];
                        if (var91 != null) {
                            for (class93 var92 = (class93) var91.method3731(); var92 != null; var92 = (class93) var91.method3733()) {
                                if ((var89 & 0x7FFF) == var92.field1391 && var92.field1389 == var88) {
                                    var92.field1389 = var90;
                                    break;
                                }
                            }
                            method741(var86, var87);
                        }
                    }
                } else if (class184.field2456 == arg0) {
                    int var93 = var1.method3265();
                    int var94 = (var93 >> 4 & 0x7) + Statics.field743;
                    int var95 = (var93 & 0x7) + Statics.field2035;
                    int var96 = var1.method3273();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        class218 var97 = field886[Statics.field3841][var94][var95];
                        if (var97 != null) {
                            for (class93 var98 = (class93) var97.method3731(); var98 != null; var98 = (class93) var97.method3733()) {
                                if ((var96 & 0x7FFF) == var98.field1391) {
                                    var98.method3721();
                                    break;
                                }
                            }
                            if (var97.method3731() == null) {
                                field886[Statics.field3841][var94][var95] = null;
                            }
                            method741(var94, var95);
                        }
                    }
                } else if (class184.field2458 == arg0) {
                    byte var99 = var1.method3234();
                    int var100 = var1.method3265();
                    int var101 = var1.method3273();
                    int var102 = var1.method3270();
                    int var103 = var1.method3265();
                    int var104 = (var103 >> 4 & 0x7) + Statics.field743;
                    int var105 = (var103 & 0x7) + Statics.field2035;
                    int var106 = var1.method3273();
                    int var107 = var1.method3264() * 4;
                    byte var108 = var1.method3312();
                    int var109 = var1.method3275();
                    int var110 = var1.method3265();
                    int var111 = var1.method3265() * 4;
                    int var112 = var104 + var108;
                    int var113 = var99 + var105;
                    if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104 && var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && var109 != 65535) {
                        int var114 = var104 * 128 + 64;
                        int var115 = var105 * 128 + 64;
                        int var116 = var112 * 128 + 64;
                        int var117 = var113 * 128 + 64;
                        class92 var118 = new class92(var109, Statics.field3841, var114, var115, method2870(var114, var115, Statics.field3841) - var107, field1108 + var101, field1108 + var106, var100, var110, var102, var111);
                        var118.method1808(var116, var117, method2870(var116, var117, Statics.field3841) - var111, field1108 + var101);
                        field1078.method3759(var118);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.ht(IIIIIIIIII)V")
    public static final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75 var9 = null;
        for (class75 var10 = (class75) field978.method3731(); var10 != null; var10 = (class75) field978.method3733()) {
            if (var10.field1128 == arg0 && var10.field1124 == arg1 && var10.field1134 == arg2 && var10.field1123 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class75();
            var9.field1128 = arg0;
            var9.field1123 = arg3;
            var9.field1124 = arg1;
            var9.field1134 = arg2;
            method3173(var9);
            field978.method3759(var9);
        }
        var9.field1129 = arg4;
        var9.field1130 = arg5;
        var9.field1132 = arg6;
        var9.field1131 = arg7;
        var9.field1133 = arg8;
    }

    @ObfuscatedName("gs.hq(Lbl;I)V")
    public static final void method3173(class75 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1123 == 0) {
            var1 = Statics.field495.method2767(arg0.field1128, arg0.field1124, arg0.field1134);
        }
        if (arg0.field1123 == 1) {
            var1 = Statics.field495.method2720(arg0.field1128, arg0.field1124, arg0.field1134);
        }
        if (arg0.field1123 == 2) {
            var1 = Statics.field495.method2665(arg0.field1128, arg0.field1124, arg0.field1134);
        }
        if (arg0.field1123 == 3) {
            var1 = Statics.field495.method2785(arg0.field1128, arg0.field1124, arg0.field1134);
        }
        if (var1 != 0) {
            int var5 = Statics.field495.method2676(arg0.field1128, arg0.field1124, arg0.field1134, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1126 = var2;
        arg0.field1122 = var3;
        arg0.field1127 = var4;
    }

    @ObfuscatedName("ga.hm(I)V")
    public static final void method3132() {
        for (class75 var0 = (class75) field978.method3731(); var0 != null; var0 = (class75) field978.method3733()) {
            if (var0.field1133 > 0) {
                var0.field1133--;
            }
            if (var0.field1133 == 0) {
                if (var0.field1126 >= 0) {
                    int var1 = var0.field1126;
                    int var2 = var0.field1122;
                    class283 var3 = class283.method4427(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4638(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method772(var0.field1128, var0.field1123, var0.field1124, var0.field1134, var0.field1126, var0.field1127, var0.field1122);
                var0.method3721();
            } else {
                if (var0.field1131 > 0) {
                    var0.field1131--;
                }
                if (var0.field1131 == 0 && var0.field1124 >= 1 && var0.field1134 >= 1 && var0.field1124 <= 102 && var0.field1134 <= 102) {
                    if (var0.field1129 >= 0) {
                        int var5 = var0.field1129;
                        int var6 = var0.field1130;
                        class283 var7 = class283.method4427(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method4638(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method772(var0.field1128, var0.field1123, var0.field1124, var0.field1134, var0.field1129, var0.field1132, var0.field1130);
                    var0.field1131 = -1;
                    if (var0.field1129 == var0.field1126 && var0.field1126 == -1) {
                        var0.method3721();
                    } else if (var0.field1129 == var0.field1126 && var0.field1132 == var0.field1127 && var0.field1130 == var0.field1122) {
                        var0.method3721();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bc.hz(IIIIIIII)V")
    public static final void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field855 && Statics.field3841 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field495.method2767(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field495.method2720(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field495.method2665(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field495.method2785(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field495.method2676(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field495.method2663(arg0, arg2, arg3);
                class283 var15 = class283.method4427(var12);
                if (var15.field3612 != 0) {
                    field867[arg0].method3091(arg2, arg3, var13, var14, var15.field3595);
                }
            }
            if (arg1 == 1) {
                Statics.field495.method2664(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field495.method2662(arg0, arg2, arg3);
                class283 var16 = class283.method4427(var12);
                if (var16.field3610 + arg2 > 103 || var16.field3610 + arg3 > 103 || var16.field3608 + arg2 > 103 || var16.field3608 + arg3 > 103) {
                    return;
                }
                if (var16.field3612 != 0) {
                    field867[arg0].method3092(arg2, arg3, var16.field3610, var16.field3608, var14, var16.field3595);
                }
            }
            if (arg1 == 3) {
                Statics.field495.method2677(arg0, arg2, arg3);
                class283 var17 = class283.method4427(var12);
                if (var17.field3612 == 1) {
                    field867[arg0].method3106(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class63.field704[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class138 var19 = Statics.field495;
        class177 var20 = field867[arg0];
        class283 var21 = class283.method4427(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3608;
            var23 = var21.field3610;
        } else {
            var22 = var21.field3610;
            var23 = var21.field3608;
        }
        int var24;
        int var25;
        if (arg2 + var22 <= 104) {
            var24 = (var22 >> 1) + arg2;
            var25 = (var22 + 1 >> 1) + arg2;
        } else {
            var24 = arg2;
            var25 = arg2 + 1;
        }
        int var26;
        int var27;
        if (arg3 + var23 <= 104) {
            var26 = (var23 >> 1) + arg3;
            var27 = (var23 + 1 >> 1) + arg3;
        } else {
            var26 = arg3;
            var27 = arg3 + 1;
        }
        int[][] var28 = class63.field707[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3614 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3635 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class140 var34;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var34 = var21.method4637(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class98(arg4, 22, arg5, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2675(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3612 == 1) {
                var20.method3089(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class140 var57;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var57 = var21.method4637(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class98(arg4, 10, arg5, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            if (var57 != null) {
                var19.method2656(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3612 != 0) {
                var20.method3086(arg2, arg3, var22, var23, var21.field3595);
            }
        } else if (arg6 >= 12) {
            class140 var35;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var35 = var21.method4637(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class98(arg4, arg6, arg5, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2656(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3612 != 0) {
                var20.method3086(arg2, arg3, var22, var23, var21.field3595);
            }
        } else if (arg6 == 0) {
            class140 var36;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var36 = var21.method4637(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class98(arg4, 0, arg5, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2654(arg0, arg2, arg3, var29, var36, (class140) null, class63.field714[arg5], 0, var32, var33);
            if (var21.field3612 != 0) {
                var20.method3117(arg2, arg3, arg6, arg5, var21.field3595);
            }
        } else if (arg6 == 1) {
            class140 var37;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var37 = var21.method4637(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class98(arg4, 1, arg5, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2654(arg0, arg2, arg3, var29, var37, (class140) null, class63.field716[arg5], 0, var32, var33);
            if (var21.field3612 != 0) {
                var20.method3117(arg2, arg3, arg6, arg5, var21.field3595);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class140 var39;
            class140 var40;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var39 = var21.method4637(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4637(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class98(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3630, true, (class140) null);
                var40 = new class98(arg4, 2, var38, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2654(arg0, arg2, arg3, var29, var39, var40, class63.field714[arg5], class63.field714[var38], var32, var33);
            if (var21.field3612 != 0) {
                var20.method3117(arg2, arg3, arg6, arg5, var21.field3595);
            }
        } else if (arg6 == 3) {
            class140 var41;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var41 = var21.method4637(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class98(arg4, 3, arg5, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2654(arg0, arg2, arg3, var29, var41, (class140) null, class63.field716[arg5], 0, var32, var33);
            if (var21.field3612 != 0) {
                var20.method3117(arg2, arg3, arg6, arg5, var21.field3595);
            }
        } else if (arg6 == 9) {
            class140 var42;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var42 = var21.method4637(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class98(arg4, arg6, arg5, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2656(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3612 != 0) {
                var20.method3086(arg2, arg3, var22, var23, var21.field3595);
            }
        } else if (arg6 == 4) {
            class140 var43;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var43 = var21.method4637(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class98(arg4, 4, arg5, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2655(arg0, arg2, arg3, var29, var43, (class140) null, class63.field714[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2767(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class283.method4427(var45 >> 14 & 0x7FFF).field3619;
            }
            class140 var46;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var46 = var21.method4637(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class98(arg4, 4, arg5, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2655(arg0, arg2, arg3, var29, var46, (class140) null, class63.field714[arg5], 0, class63.field723[arg5] * var44, class63.field717[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2767(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class283.method4427(var48 >> 14 & 0x7FFF).field3619 / 2;
            }
            class140 var49;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var49 = var21.method4637(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class98(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2655(arg0, arg2, arg3, var29, var49, (class140) null, 256, arg5, class63.field718[arg5] * var47, class63.field719[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class140 var51;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var51 = var21.method4637(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class98(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2655(arg0, arg2, arg3, var29, var51, (class140) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2767(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class283.method4427(var53 >> 14 & 0x7FFF).field3619 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class140 var55;
            class140 var56;
            if (var21.field3630 == -1 && var21.field3606 == null) {
                var55 = var21.method4637(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4637(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class98(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3630, true, (class140) null);
                var56 = new class98(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3630, true, (class140) null);
            }
            var19.method2655(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class63.field718[arg5] * var52, class63.field719[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ba.hj(III)V")
    public static final void method741(int arg0, int arg1) {
        class218 var2 = field886[Statics.field3841][arg0][arg1];
        if (var2 == null) {
            Statics.field495.method2667(Statics.field3841, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class93 var5 = null;
        for (class93 var6 = (class93) var2.method3731(); var6 != null; var6 = (class93) var2.method3733()) {
            class284 var7 = class284.method1694(var6.field1391);
            long var8 = (long) var7.field3668;
            if (var7.field3646 == 1) {
                var8 = (long) (var6.field1389 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field495.method2667(Statics.field3841, arg0, arg1);
            return;
        }
        var2.method3728(var5);
        class93 var10 = null;
        class93 var11 = null;
        for (class93 var12 = (class93) var2.method3731(); var12 != null; var12 = (class93) var2.method3733()) {
            if (var5.field1391 != var12.field1391) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1391 != var12.field1391 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field495.method2653(Statics.field3841, arg0, arg1, method2870(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field3841), var5, var13, var10, var11);
    }

    @ObfuscatedName("fh.he(ZLgz;I)V")
    public static final void method3013(boolean arg0, class202 arg1) {
        field970 = 0;
        field917 = 0;
        method1145();
        while (arg1.method3499(field1073.field1453) >= 27) {
            int var2 = arg1.method3497(15);
            if (var2 == 32767) {
                break;
            }
            boolean var32 = false;
            if (field975[var2] == null) {
                field975[var2] = new class85();
                var32 = true;
            }
            class85 var33 = field975[var2];
            field892[++field865 - 1] = var2;
            var33.field1167 = field1108;
            int var34;
            if (arg0) {
                var34 = arg1.method3497(8);
                if (var34 > 127) {
                    var34 -= 256;
                }
            } else {
                var34 = arg1.method3497(5);
                if (var34 > 15) {
                    var34 -= 32;
                }
            }
            int var35 = arg1.method3497(1);
            int var36 = field882[arg1.method3497(3)];
            if (var32) {
                var33.field1155 = var33.field1139 = var36;
            }
            int var37;
            if (arg0) {
                var37 = arg1.method3497(8);
                if (var37 > 127) {
                    var37 -= 256;
                }
            } else {
                var37 = arg1.method3497(5);
                if (var37 > 15) {
                    var37 -= 32;
                }
            }
            var33.field1284 = class286.method4012(arg1.method3497(14));
            int var38 = arg1.method3497(1);
            if (var38 == 1) {
                field894[++field917 - 1] = var2;
            }
            var33.field1140 = var33.field1284.field3711;
            var33.field1191 = var33.field1284.field3721;
            if (var33.field1191 == 0) {
                var33.field1139 = 0;
            }
            var33.field1146 = var33.field1284.field3718;
            var33.field1159 = var33.field1284.field3719;
            var33.field1148 = var33.field1284.field3720;
            var33.field1149 = var33.field1284.field3741;
            var33.field1181 = var33.field1284.field3715;
            var33.field1144 = var33.field1284.field3716;
            var33.field1165 = var33.field1284.field3717;
            var33.method1747(Statics.field434.field1193[0] + var37, Statics.field434.field1194[0] + var34, var35 == 1);
        }
        arg1.method3498();
        for (int var3 = 0; var3 < field917; var3++) {
            int var4 = field894[var3];
            class85 var5 = field975[var4];
            int var6 = arg1.method3236();
            if ((var6 & 0x20) != 0) {
                int var7 = arg1.method3238();
                int var8 = arg1.method3343();
                int var9 = var5.field1175 - (var7 - Statics.field494 - Statics.field494) * 64;
                int var10 = var5.field1138 - (var8 - Statics.field2794 - Statics.field2794) * 64;
                if (var9 != 0 || var10 != 0) {
                    var5.field1143 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var6 & 0x10) != 0) {
                var5.field1190 = arg1.method3343();
                int var11 = arg1.method3241();
                var5.field1179 = var11 >> 16;
                var5.field1178 = (var11 & 0xFFFF) + field1108;
                var5.field1176 = 0;
                var5.field1177 = 0;
                if (var5.field1178 > field1108) {
                    var5.field1176 = -1;
                }
                if (var5.field1190 == 65535) {
                    var5.field1190 = -1;
                }
            }
            if ((var6 & 0x8) != 0) {
                var5.field1188 = arg1.method3257();
                var5.field1154 = 100;
            }
            if ((var6 & 0x2) != 0) {
                var5.field1164 = arg1.method3275();
                if (var5.field1164 == 65535) {
                    var5.field1164 = -1;
                }
            }
            if ((var6 & 0x40) != 0) {
                var5.field1284 = class286.method4012(arg1.method3275());
                var5.field1140 = var5.field1284.field3711;
                var5.field1191 = var5.field1284.field3721;
                var5.field1146 = var5.field1284.field3718;
                var5.field1159 = var5.field1284.field3719;
                var5.field1148 = var5.field1284.field3720;
                var5.field1149 = var5.field1284.field3741;
                var5.field1181 = var5.field1284.field3715;
                var5.field1144 = var5.field1284.field3716;
                var5.field1165 = var5.field1284.field3717;
            }
            if ((var6 & 0x4) != 0) {
                int var12 = arg1.method3236();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg1.method3244();
                        if (var17 == 32767) {
                            var17 = arg1.method3244();
                            var15 = arg1.method3244();
                            var14 = arg1.method3244();
                            var16 = arg1.method3244();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg1.method3244();
                        }
                        int var18 = arg1.method3244();
                        var5.method1515(var17, var15, var14, var16, field1108, var18);
                    }
                }
                int var19 = arg1.method3265();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg1.method3244();
                        int var22 = arg1.method3244();
                        if (var22 == 32767) {
                            var5.method1517(var21);
                        } else {
                            int var23 = arg1.method3244();
                            int var24 = arg1.method3236();
                            int var25 = var22 > 0 ? arg1.method3265() : var24;
                            var5.method1516(var21, field1108, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var6 & 0x1) != 0) {
                int var26 = arg1.method3275();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = arg1.method3236();
                if (var5.field1170 == var26 && var26 != -1) {
                    int var28 = class288.method2932(var26).field3773;
                    if (var28 == 1) {
                        var5.field1171 = 0;
                        var5.field1141 = 0;
                        var5.field1173 = var27;
                        var5.field1187 = 0;
                    }
                    if (var28 == 2) {
                        var5.field1187 = 0;
                    }
                } else if (var26 == -1 || var5.field1170 == -1 || class288.method2932(var26).field3767 >= class288.method2932(var5.field1170).field3767) {
                    var5.field1170 = var26;
                    var5.field1171 = 0;
                    var5.field1141 = 0;
                    var5.field1173 = var27;
                    var5.field1187 = 0;
                    var5.field1197 = var5.field1192;
                }
            }
        }
        for (int var29 = 0; var29 < field970; var29++) {
            int var30 = field971[var29];
            if (field1108 != field975[var30].field1167) {
                field975[var30].field1284 = null;
                field975[var30] = null;
            }
        }
        if (field1073.field1453 != arg1.field2545) {
            throw new RuntimeException(arg1.field2545 + class87.field1303 + field1073.field1453);
        }
        for (int var31 = 0; var31 < field865; var31++) {
            if (field975[field892[var31]] == null) {
                throw new RuntimeException(var31 + class87.field1303 + field865);
            }
        }
    }

    @ObfuscatedName("client.hp(I)V")
    public static final void method1145() {
        class202 var0 = field1073.field1460;
        var0.method3510();
        int var1 = var0.method3497(8);
        if (var1 < field865) {
            for (int var2 = var1; var2 < field865; var2++) {
                field971[++field970 - 1] = field892[var2];
            }
        }
        if (var1 > field865) {
            throw new RuntimeException("");
        }
        field865 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field892[var3];
            class85 var5 = field975[var4];
            int var6 = var0.method3497(1);
            if (var6 == 0) {
                field892[++field865 - 1] = var4;
                var5.field1167 = field1108;
            } else {
                int var7 = var0.method3497(2);
                if (var7 == 0) {
                    field892[++field865 - 1] = var4;
                    var5.field1167 = field1108;
                    field894[++field917 - 1] = var4;
                } else if (var7 == 1) {
                    field892[++field865 - 1] = var4;
                    var5.field1167 = field1108;
                    int var8 = var0.method3497(3);
                    var5.method1746(var8, (byte) 1);
                    int var9 = var0.method3497(1);
                    if (var9 == 1) {
                        field894[++field917 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field892[++field865 - 1] = var4;
                    var5.field1167 = field1108;
                    int var10 = var0.method3497(3);
                    var5.method1746(var10, (byte) 2);
                    int var11 = var0.method3497(3);
                    var5.method1746(var11, (byte) 2);
                    int var12 = var0.method3497(1);
                    if (var12 == 1) {
                        field894[++field917 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field971[++field970 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("gs.hr(III)Lfv;")
    public static class179 method3175(int arg0, int arg1) {
        field1118.field2255 = arg0;
        field1118.field2256 = arg1;
        field1118.field2258 = 1;
        field1118.field2257 = 1;
        return field1118;
    }

    @ObfuscatedName("z.hx(I)V")
    public static void method118() {
        field977 = 0;
        field985 = false;
    }

    @ObfuscatedName("v.hf(I)V")
    public static void method67() {
        method118();
        field991[0] = class252.field3261;
        field992[0] = "";
        field1041[0] = 1006;
        field974[0] = false;
        field977 = 1;
    }

    @ObfuscatedName("aw.hh(I)V")
    public static final void method594() {
        int var0 = Statics.field1683;
        int var1 = Statics.field1360;
        int var2 = Statics.field332;
        int var3 = Statics.field572;
        int var4 = 6116423;
        class328.method5275(var0, var1, var2, var3, var4);
        class328.method5275(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class328.method5282(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field32.method5073(class252.field3284, var0 + 3, var1 + 14, var4, -1);
        int var5 = class61.field685;
        int var6 = class61.field686;
        for (int var7 = 0; var7 < field977; var7++) {
            int var8 = (field977 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field32.method5073(method590(var7), var0 + 3, var8, var9, 0);
        }
        method1037(Statics.field1683, Statics.field1360, Statics.field332, Statics.field572);
    }

    @ObfuscatedName("ba.hw(IIIII)V")
    public static final void method735(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1050; var4++) {
            if (field1057[var4] + field1055[var4] > arg0 && field1055[var4] < arg0 + arg2 && field998[var4] + field1006[var4] > arg1 && field1006[var4] < arg1 + arg3) {
                field1052[var4] = true;
            }
        }
    }

    @ObfuscatedName("bb.hn(IIIII)V")
    public static final void method1037(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1050; var4++) {
            if (field1057[var4] + field1055[var4] > arg0 && field1055[var4] < arg0 + arg2 && field998[var4] + field1006[var4] > arg1 && field1006[var4] < arg1 + arg3) {
                field905[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ha(I)V")
    public final void method1151() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field977 - 1; var2++) {
                if (field1041[var2] < 1000 && field1041[var2 + 1] > 1000) {
                    String var3 = field992[var2];
                    field992[var2] = field992[var2 + 1];
                    field992[var2 + 1] = var3;
                    String var4 = field991[var2];
                    field991[var2] = field991[var2 + 1];
                    field991[var2 + 1] = var4;
                    int var5 = field1041[var2];
                    field1041[var2] = field1041[var2 + 1];
                    field1041[var2 + 1] = var5;
                    int var6 = field987[var2];
                    field987[var2] = field987[var2 + 1];
                    field987[var2 + 1] = var6;
                    int var7 = field988[var2];
                    field988[var2] = field988[var2 + 1];
                    field988[var2 + 1] = var7;
                    int var8 = field922[var2];
                    field922[var2] = field922[var2 + 1];
                    field922[var2 + 1] = var8;
                    boolean var9 = field974[var2];
                    field974[var2] = field974[var2 + 1];
                    field974[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field575 != null || field1020 != null) {
            return;
        }
        int var10 = class61.field679;
        if (field985) {
            if (var10 != 1 && (Statics.field2112 || var10 != 4)) {
                int var11 = class61.field685;
                int var12 = class61.field686;
                if (var11 < Statics.field1683 - 10 || var11 > Statics.field332 + Statics.field1683 + 10 || var12 < Statics.field1360 - 10 || var12 > Statics.field572 + Statics.field1360 + 10) {
                    field985 = false;
                    method735(Statics.field1683, Statics.field1360, Statics.field332, Statics.field572);
                }
            }
            if (var10 == 1 || !Statics.field2112 && var10 == 4) {
                int var13 = Statics.field1683;
                int var14 = Statics.field1360;
                int var15 = Statics.field332;
                int var16 = class61.field692;
                int var17 = class61.field693;
                int var18 = -1;
                for (int var19 = 0; var19 < field977; var19++) {
                    int var20 = (field977 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1 && var18 >= 0) {
                    int var21 = field987[var18];
                    int var22 = field988[var18];
                    int var23 = field1041[var18];
                    int var24 = field922[var18];
                    String var25 = field991[var18];
                    String var26 = field992[var18];
                    method9(var21, var22, var23, var24, var25, var26, class61.field692, class61.field693);
                }
                field985 = false;
                method735(Statics.field1683, Statics.field1360, Statics.field332, Statics.field572);
            }
            return;
        }
        int var27 = field977 - 1;
        if ((var10 == 1 || !Statics.field2112 && var10 == 4) && var27 >= 0) {
            int var29 = field1041[var27];
            if (var29 == 39 || var29 == 40 || var29 == 41 || var29 == 42 || var29 == 43 || var29 == 33 || var29 == 34 || var29 == 35 || var29 == 36 || var29 == 37 || var29 == 38 || var29 == 1005) {
                int var30 = field987[var27];
                int var31 = field988[var27];
                class243 var32 = class243.method3168(var31);
                if (class244.method2902(Statics.method78(var32)) || class244.method2909(Statics.method78(var32))) {
                    if (Statics.field575 != null && !field961 && field977 > 0 && !this.method1156()) {
                        Statics.method2900(field958, field959);
                    }
                    field961 = false;
                    field962 = 0;
                    if (Statics.field575 != null) {
                        method942(Statics.field575);
                    }
                    Statics.field575 = class243.method3168(var31);
                    field999 = var30;
                    field958 = class61.field692;
                    field959 = class61.field693;
                    if (var27 >= 0) {
                        Statics.field419 = new class88();
                        Statics.field419.field1312 = field987[var27];
                        Statics.field419.field1307 = field988[var27];
                        Statics.field419.field1308 = field1041[var27];
                        Statics.field419.field1309 = field922[var27];
                        Statics.field419.field1306 = field991[var27];
                    }
                    method942(Statics.field575);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field2112 && var10 == 4) && this.method1156()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field2112 && var10 == 4) && field977 > 0 && var27 >= 0) {
            int var33 = field987[var27];
            int var34 = field988[var27];
            int var35 = field1041[var27];
            int var36 = field922[var27];
            String var37 = field991[var27];
            String var38 = field992[var27];
            method9(var33, var34, var35, var36, var37, var38, class61.field692, class61.field693);
        }
        if (var10 == 2 && field977 > 0) {
            this.method1214(class61.field692, class61.field693);
        }
    }

    @ObfuscatedName("client.hg(I)Z")
    public final boolean method1156() {
        int var1 = field977 - 1;
        return (field1023 == 1 && field977 > 2 || Statics.method2904(var1)) && !field974[var1];
    }

    @ObfuscatedName("client.hc(IIS)V")
    public final void method1214(int arg0, int arg1) {
        int var3 = Statics.field32.method5068(class252.field3284);
        for (int var4 = 0; var4 < field977; var4++) {
            int var5 = Statics.field32.method5068(method590(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field977 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field2021) {
            var7 = Statics.field2021 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field659) {
            var8 = Statics.field659 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field495.method2753(Statics.field3841, arg0, arg1, false);
        field985 = true;
        Statics.field1683 = var7;
        Statics.field1360 = var8;
        Statics.field332 = var3;
        Statics.field572 = field977 * 15 + 22;
    }

    @ObfuscatedName("bq.hl(Lcv;III)V")
    public static final void method1038(class88 arg0, int arg1, int arg2) {
        method9(arg0.field1312, arg0.field1307, arg0.field1308, arg0.field1309, arg0.field1306, arg0.field1306, arg1, arg2);
    }

    @ObfuscatedName("a.hu(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 29) {
            class185 var8 = class185.method343(class182.field2415, field1073.field1457);
            var8.field2478.method3223(arg1);
            field1073.method1916(var8);
            class243 var9 = class243.method3168(arg1);
            if (var9.field2930 != null && var9.field2930[0][0] == 5) {
                int var10 = var9.field2930[0][1];
                if (class238.field2771[var10] != var9.field2932[0]) {
                    class238.field2771[var10] = var9.field2932[0];
                    method15(var10);
                }
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field3306.method5600(arg2, arg3, new class239(arg0), new class239(arg1));
        }
        if (arg2 == 36) {
            class185 var11 = class185.method343(class182.field2422, field1073.field1457);
            var11.field2478.method3218(arg3);
            var11.field2478.method3412(arg1);
            var11.field2478.method3272(arg0);
            field1073.method1916(var11);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 35) {
            class185 var12 = class185.method343(class182.field2367, field1073.field1457);
            var12.field2478.method3281(arg1);
            var12.field2478.method3323(arg3);
            var12.field2478.method3272(arg0);
            field1073.method1916(var12);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 22) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var13 = class185.method343(class182.field2412, field1073.field1457);
            var13.field2478.method3261(class52.field615[82] ? 1 : 0);
            var13.field2478.method3269(arg3);
            var13.field2478.method3218(Statics.field2794 + arg1);
            var13.field2478.method3218(Statics.field494 + arg0);
            field1073.method1916(var13);
        }
        if (arg2 == 32) {
            class185 var14 = class185.method343(class182.field2364, field1073.field1457);
            var14.field2478.method3223(arg1);
            var14.field2478.method3269(arg3);
            var14.field2478.method3218(arg0);
            var14.field2478.method3223(Statics.field1598);
            var14.field2478.method3269(field1051);
            field1073.method1916(var14);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 25) {
            class243 var15 = class243.method3087(arg1, arg0);
            if (var15 != null) {
                method5055();
                int var16 = Statics.method78(var15);
                int var17 = var16 >> 11 & 0x3F;
                int var19 = var15.field2938;
                class243 var20 = class243.method3087(arg1, arg0);
                if (var20 != null && var20.field2909 != null) {
                    class69 var21 = new class69();
                    var21.field791 = var20;
                    var21.field788 = var20.field2909;
                    class82.method187(var21, 500000);
                }
                field981 = var19;
                field934 = true;
                Statics.field1598 = arg1;
                field1051 = arg0;
                Statics.field2101 = var17;
                method942(var20);
                field1002 = 0;
                field1007 = method160(var15);
                if (field1007 == null) {
                    field1007 = "Null";
                }
                if (var15.field2846) {
                    field1075 = var15.field2891 + class87.method501(16777215);
                } else {
                    field1075 = class87.method501(65280) + var15.field2919 + class87.method501(16777215);
                }
            }
            return;
        }
        if (arg2 == 18) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var22 = class185.method343(class182.field2386, field1073.field1457);
            var22.field2478.method3261(class52.field615[82] ? 1 : 0);
            var22.field2478.method3323(Statics.field2794 + arg1);
            var22.field2478.method3272(Statics.field494 + arg0);
            var22.field2478.method3323(arg3);
            field1073.method1916(var22);
        }
        if (arg2 == 16) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var23 = class185.method343(class182.field2378, field1073.field1457);
            var23.field2478.method3272(Statics.field3487);
            var23.field2478.method3269(Statics.field2794 + arg1);
            var23.field2478.method3223(Statics.field620);
            var23.field2478.method3411(class52.field615[82] ? 1 : 0);
            var23.field2478.method3269(Statics.field494 + arg0);
            var23.field2478.method3218(Statics.field27);
            var23.field2478.method3323(arg3);
            field1073.method1916(var23);
        }
        if (arg2 == 1004) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            class185 var24 = class185.method343(class182.field2393, field1073.field1457);
            var24.field2478.method3272(arg3);
            field1073.method1916(var24);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class243 var25 = class243.method3087(arg1, arg0);
            if (var25 != null) {
                int var26 = var25.field2938;
                class243 var27 = class243.method3087(arg1, arg0);
                if (var27 != null) {
                    if (var27.field2918 != null) {
                        class69 var28 = new class69();
                        var28.field791 = var27;
                        var28.field785 = arg3;
                        var28.field789 = arg5;
                        var28.field788 = var27.field2918;
                        class82.method187(var28, 500000);
                    }
                    boolean var29 = true;
                    if (var27.field2822 > 0) {
                        var29 = method581(var27);
                    }
                    if (var29 && class244.method1673(Statics.method78(var27), arg3 - 1)) {
                        if (arg3 == 1) {
                            class185 var30 = class185.method343(class182.field2381, field1073.field1457);
                            var30.field2478.method3223(arg1);
                            var30.field2478.method3323(arg0);
                            var30.field2478.method3323(var26);
                            field1073.method1916(var30);
                        }
                        if (arg3 == 2) {
                            class185 var31 = class185.method343(class182.field2421, field1073.field1457);
                            var31.field2478.method3223(arg1);
                            var31.field2478.method3323(arg0);
                            var31.field2478.method3323(var26);
                            field1073.method1916(var31);
                        }
                        if (arg3 == 3) {
                            class185 var32 = class185.method343(class182.field2376, field1073.field1457);
                            var32.field2478.method3223(arg1);
                            var32.field2478.method3323(arg0);
                            var32.field2478.method3323(var26);
                            field1073.method1916(var32);
                        }
                        if (arg3 == 4) {
                            class185 var33 = class185.method343(class182.field2392, field1073.field1457);
                            var33.field2478.method3223(arg1);
                            var33.field2478.method3323(arg0);
                            var33.field2478.method3323(var26);
                            field1073.method1916(var33);
                        }
                        if (arg3 == 5) {
                            class185 var34 = class185.method343(class182.field2420, field1073.field1457);
                            var34.field2478.method3223(arg1);
                            var34.field2478.method3323(arg0);
                            var34.field2478.method3323(var26);
                            field1073.method1916(var34);
                        }
                        if (arg3 == 6) {
                            class185 var35 = class185.method343(class182.field2380, field1073.field1457);
                            var35.field2478.method3223(arg1);
                            var35.field2478.method3323(arg0);
                            var35.field2478.method3323(var26);
                            field1073.method1916(var35);
                        }
                        if (arg3 == 7) {
                            class185 var36 = class185.method343(class182.field2368, field1073.field1457);
                            var36.field2478.method3223(arg1);
                            var36.field2478.method3323(arg0);
                            var36.field2478.method3323(var26);
                            field1073.method1916(var36);
                        }
                        if (arg3 == 8) {
                            class185 var37 = class185.method343(class182.field2427, field1073.field1457);
                            var37.field2478.method3223(arg1);
                            var37.field2478.method3323(arg0);
                            var37.field2478.method3323(var26);
                            field1073.method1916(var37);
                        }
                        if (arg3 == 9) {
                            class185 var38 = class185.method343(class182.field2356, field1073.field1457);
                            var38.field2478.method3223(arg1);
                            var38.field2478.method3323(arg0);
                            var38.field2478.method3323(var26);
                            field1073.method1916(var38);
                        }
                        if (arg3 == 10) {
                            class185 var39 = class185.method343(class182.field2348, field1073.field1457);
                            var39.field2478.method3223(arg1);
                            var39.field2478.method3323(arg0);
                            var39.field2478.method3323(var26);
                            field1073.method1916(var39);
                        }
                    }
                }
            }
        }
        if (arg2 == 30 && field1013 == null) {
            method4406(arg1, arg0);
            field1013 = class243.method3087(arg1, arg0);
            method942(field1013);
        }
        if (arg2 == 5) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var40 = class185.method343(class182.field2369, field1073.field1457);
            var40.field2478.method3218(Statics.field494 + arg0);
            var40.field2478.method3220(class52.field615[82] ? 1 : 0);
            var40.field2478.method3272(Statics.field2794 + arg1);
            var40.field2478.method3272(arg3 >> 14 & 0x7FFF);
            field1073.method1916(var40);
        }
        if (arg2 == 10) {
            class85 var41 = field975[arg3];
            if (var41 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var42 = class185.method343(class182.field2383, field1073.field1457);
                var42.field2478.method3323(arg3);
                var42.field2478.method3220(class52.field615[82] ? 1 : 0);
                field1073.method1916(var42);
            }
        }
        if (arg2 == 3) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var43 = class185.method343(class182.field2371, field1073.field1457);
            var43.field2478.method3218(Statics.field2794 + arg1);
            var43.field2478.method3269(Statics.field494 + arg0);
            var43.field2478.method3269(arg3 >> 14 & 0x7FFF);
            var43.field2478.method3261(class52.field615[82] ? 1 : 0);
            field1073.method1916(var43);
        }
        if (arg2 == 51) {
            class73 var44 = field965[arg3];
            if (var44 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var45 = class185.method343(class182.field2399, field1073.field1457);
                var45.field2478.method3411(class52.field615[82] ? 1 : 0);
                var45.field2478.method3218(arg3);
                field1073.method1916(var45);
            }
        }
        if (arg2 == 14) {
            class73 var46 = field965[arg3];
            if (var46 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var47 = class185.method343(class182.field2358, field1073.field1457);
                var47.field2478.method3411(class52.field615[82] ? 1 : 0);
                var47.field2478.method3323(Statics.field3487);
                var47.field2478.method3218(Statics.field27);
                var47.field2478.method3283(Statics.field620);
                var47.field2478.method3218(arg3);
                field1073.method1916(var47);
            }
        }
        if (arg2 == 1003) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            class85 var48 = field975[arg3];
            if (var48 != null) {
                class286 var49 = var48.field1284;
                if (var49.field3736 != null) {
                    var49 = var49.method4724();
                }
                if (var49 != null) {
                    class185 var50 = class185.method343(class182.field2418, field1073.field1457);
                    var50.field2478.method3269(var49.field3710);
                    field1073.method1916(var50);
                }
            }
        }
        if (arg2 == 1) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var51 = class185.method343(class182.field2354, field1073.field1457);
            var51.field2478.method3269(Statics.field494 + arg0);
            var51.field2478.method3218(arg3 >> 14 & 0x7FFF);
            var51.field2478.method3281(Statics.field620);
            var51.field2478.method3323(Statics.field27);
            var51.field2478.method3318(class52.field615[82] ? 1 : 0);
            var51.field2478.method3272(Statics.field3487);
            var51.field2478.method3272(Statics.field2794 + arg1);
            field1073.method1916(var51);
        }
        if (arg2 == 45) {
            class73 var52 = field965[arg3];
            if (var52 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var53 = class185.method343(class182.field2403, field1073.field1457);
                var53.field2478.method3323(arg3);
                var53.field2478.method3261(class52.field615[82] ? 1 : 0);
                field1073.method1916(var53);
            }
        }
        if (arg2 == 2) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var54 = class185.method343(class182.field2357, field1073.field1457);
            var54.field2478.method3218(arg3 >> 14 & 0x7FFF);
            var54.field2478.method3218(Statics.field494 + arg0);
            var54.field2478.method3411(class52.field615[82] ? 1 : 0);
            var54.field2478.method3323(field1051);
            var54.field2478.method3281(Statics.field1598);
            var54.field2478.method3272(Statics.field2794 + arg1);
            field1073.method1916(var54);
        }
        if (arg2 == 34) {
            class185 var55 = class185.method343(class182.field2417, field1073.field1457);
            var55.field2478.method3272(arg3);
            var55.field2478.method3218(arg0);
            var55.field2478.method3281(arg1);
            field1073.method1916(var55);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 19) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var56 = class185.method343(class182.field2444, field1073.field1457);
            var56.field2478.method3272(Statics.field2794 + arg1);
            var56.field2478.method3269(arg3);
            var56.field2478.method3220(class52.field615[82] ? 1 : 0);
            var56.field2478.method3218(Statics.field494 + arg0);
            field1073.method1916(var56);
        }
        if (arg2 == 20) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var57 = class185.method343(class182.field2355, field1073.field1457);
            var57.field2478.method3261(class52.field615[82] ? 1 : 0);
            var57.field2478.method3218(arg3);
            var57.field2478.method3218(Statics.field2794 + arg1);
            var57.field2478.method3272(Statics.field494 + arg0);
            field1073.method1916(var57);
        }
        if (arg2 == 15) {
            class73 var58 = field965[arg3];
            if (var58 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var59 = class185.method343(class182.field2360, field1073.field1457);
                var59.field2478.method3220(class52.field615[82] ? 1 : 0);
                var59.field2478.method3223(Statics.field1598);
                var59.field2478.method3272(field1051);
                var59.field2478.method3272(arg3);
                field1073.method1916(var59);
            }
        }
        if (arg2 == 6) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var60 = class185.method343(class182.field2402, field1073.field1457);
            var60.field2478.method3323(Statics.field2794 + arg1);
            var60.field2478.method3323(arg3 >> 14 & 0x7FFF);
            var60.field2478.method3411(class52.field615[82] ? 1 : 0);
            var60.field2478.method3272(Statics.field494 + arg0);
            field1073.method1916(var60);
        }
        if (arg2 == 31) {
            class185 var61 = class185.method343(class182.field2408, field1073.field1457);
            var61.field2478.method3283(arg1);
            var61.field2478.method3323(Statics.field27);
            var61.field2478.method3323(Statics.field3487);
            var61.field2478.method3412(Statics.field620);
            var61.field2478.method3323(arg0);
            var61.field2478.method3323(arg3);
            field1073.method1916(var61);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 47) {
            class73 var62 = field965[arg3];
            if (var62 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var63 = class185.method343(class182.field2361, field1073.field1457);
                var63.field2478.method3261(class52.field615[82] ? 1 : 0);
                var63.field2478.method3272(arg3);
                field1073.method1916(var63);
            }
        }
        if (arg2 == 7) {
            class85 var64 = field975[arg3];
            if (var64 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var65 = class185.method343(class182.field2442, field1073.field1457);
                var65.field2478.method3281(Statics.field620);
                var65.field2478.method3272(arg3);
                var65.field2478.method3218(Statics.field27);
                var65.field2478.method3220(class52.field615[82] ? 1 : 0);
                var65.field2478.method3269(Statics.field3487);
                field1073.method1916(var65);
            }
        }
        if (arg2 == 58) {
            class243 var66 = class243.method3087(arg1, arg0);
            if (var66 != null) {
                class185 var67 = class185.method343(class182.field2382, field1073.field1457);
                var67.field2478.method3272(field1051);
                var67.field2478.method3269(var66.field2938);
                var67.field2478.method3323(field981);
                var67.field2478.method3281(arg1);
                var67.field2478.method3281(Statics.field1598);
                var67.field2478.method3218(arg0);
                field1073.method1916(var67);
            }
        }
        if (arg2 == 8) {
            class85 var68 = field975[arg3];
            if (var68 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var69 = class185.method343(class182.field2384, field1073.field1457);
                var69.field2478.method3272(arg3);
                var69.field2478.method3269(field1051);
                var69.field2478.method3411(class52.field615[82] ? 1 : 0);
                var69.field2478.method3281(Statics.field1598);
                field1073.method1916(var69);
            }
        }
        if (arg2 == 33) {
            class185 var70 = class185.method343(class182.field2396, field1073.field1457);
            var70.field2478.method3323(arg3);
            var70.field2478.method3283(arg1);
            var70.field2478.method3269(arg0);
            field1073.method1916(var70);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 9) {
            class85 var71 = field975[arg3];
            if (var71 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var72 = class185.method343(class182.field2435, field1073.field1457);
                var72.field2478.method3218(arg3);
                var72.field2478.method3318(class52.field615[82] ? 1 : 0);
                field1073.method1916(var72);
            }
        }
        if (arg2 == 38) {
            method5055();
            class243 var73 = class243.method3168(arg1);
            field1002 = 1;
            Statics.field3487 = arg0;
            Statics.field620 = arg1;
            Statics.field27 = arg3;
            method942(var73);
            field1003 = class87.method501(16748608) + class284.method1694(arg3).field3656 + class87.method501(16777215);
            if (field1003 == null) {
                field1003 = class252.field3052;
            }
            return;
        }
        if (arg2 == 1001) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var74 = class185.method343(class182.field2430, field1073.field1457);
            var74.field2478.method3272(arg3 >> 14 & 0x7FFF);
            var74.field2478.method3220(class52.field615[82] ? 1 : 0);
            var74.field2478.method3272(Statics.field494 + arg0);
            var74.field2478.method3323(Statics.field2794 + arg1);
            field1073.method1916(var74);
        }
        if (arg2 == 4) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var75 = class185.method343(class182.field2409, field1073.field1457);
            var75.field2478.method3323(Statics.field494 + arg0);
            var75.field2478.method3269(arg3 >> 14 & 0x7FFF);
            var75.field2478.method3261(class52.field615[82] ? 1 : 0);
            var75.field2478.method3269(Statics.field2794 + arg1);
            field1073.method1916(var75);
        }
        if (arg2 == 11) {
            class85 var76 = field975[arg3];
            if (var76 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var77 = class185.method343(class182.field2437, field1073.field1457);
                var77.field2478.method3272(arg3);
                var77.field2478.method3318(class52.field615[82] ? 1 : 0);
                field1073.method1916(var77);
            }
        }
        if (arg2 == 1002) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            class185 var78 = class185.method343(class182.field2394, field1073.field1457);
            var78.field2478.method3269(arg3 >> 14 & 0x7FFF);
            field1073.method1916(var78);
        }
        if (arg2 == 13) {
            class85 var79 = field975[arg3];
            if (var79 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var80 = class185.method343(class182.field2411, field1073.field1457);
                var80.field2478.method3272(arg3);
                var80.field2478.method3220(class52.field615[82] ? 1 : 0);
                field1073.method1916(var80);
            }
        }
        if (arg2 == 41) {
            class185 var81 = class185.method343(class182.field2372, field1073.field1457);
            var81.field2478.method3323(arg3);
            var81.field2478.method3269(arg0);
            var81.field2478.method3223(arg1);
            field1073.method1916(var81);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 17) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var82 = class185.method343(class182.field2414, field1073.field1457);
            var82.field2478.method3218(Statics.field2794 + arg1);
            var82.field2478.method3272(Statics.field494 + arg0);
            var82.field2478.method3223(Statics.field1598);
            var82.field2478.method3218(field1051);
            var82.field2478.method3272(arg3);
            var82.field2478.method3318(class52.field615[82] ? 1 : 0);
            field1073.method1916(var82);
        }
        if (arg2 == 40) {
            class185 var83 = class185.method343(class182.field2363, field1073.field1457);
            var83.field2478.method3272(arg3);
            var83.field2478.method3412(arg1);
            var83.field2478.method3269(arg0);
            field1073.method1916(var83);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 48) {
            class73 var84 = field965[arg3];
            if (var84 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var85 = class185.method343(class182.field2445, field1073.field1457);
                var85.field2478.method3269(arg3);
                var85.field2478.method3220(class52.field615[82] ? 1 : 0);
                field1073.method1916(var85);
            }
        }
        if (arg2 == 12) {
            class85 var86 = field975[arg3];
            if (var86 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var87 = class185.method343(class182.field2379, field1073.field1457);
                var87.field2478.method3318(class52.field615[82] ? 1 : 0);
                var87.field2478.method3269(arg3);
                field1073.method1916(var87);
            }
        }
        if (arg2 == 49) {
            class73 var88 = field965[arg3];
            if (var88 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var89 = class185.method343(class182.field2351, field1073.field1457);
                var89.field2478.method3220(class52.field615[82] ? 1 : 0);
                var89.field2478.method3323(arg3);
                field1073.method1916(var89);
            }
        }
        if (arg2 == 46) {
            class73 var90 = field965[arg3];
            if (var90 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var91 = class185.method343(class182.field2404, field1073.field1457);
                var91.field2478.method3220(class52.field615[82] ? 1 : 0);
                var91.field2478.method3323(arg3);
                field1073.method1916(var91);
            }
        }
        if (arg2 == 26) {
            class185 var92 = class185.method343(class182.field2400, field1073.field1457);
            field1073.method1916(var92);
            for (class68 var93 = (class68) field1010.method3667(); var93 != null; var93 = (class68) field1010.method3672()) {
                if (var93.field775 == 0 || var93.field775 == 3) {
                    Statics.method1828(var93, true);
                }
            }
            if (field1013 != null) {
                method942(field1013);
                field1013 = null;
            }
        }
        if (arg2 == 1005) {
            class243 var94 = class243.method3168(arg1);
            if (var94 == null || var94.field2817[arg0] < 100000) {
                class185 var95 = class185.method343(class182.field2393, field1073.field1457);
                var95.field2478.method3272(arg3);
                field1073.method1916(var95);
            } else {
                class96.method83(27, "", var94.field2817[arg0] + " x " + class284.method1694(arg3).field3656);
            }
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 24) {
            class243 var96 = class243.method3168(arg1);
            boolean var97 = true;
            if (var96.field2822 > 0) {
                var97 = method581(var96);
            }
            if (var97) {
                class185 var98 = class185.method343(class182.field2415, field1073.field1457);
                var98.field2478.method3223(arg1);
                field1073.method1916(var98);
            }
        }
        if (arg2 == 21) {
            field976 = arg6;
            field951 = arg7;
            field953 = 2;
            field1089 = 0;
            field1077 = arg0;
            field904 = arg1;
            class185 var99 = class185.method343(class182.field2375, field1073.field1457);
            var99.field2478.method3411(class52.field615[82] ? 1 : 0);
            var99.field2478.method3323(Statics.field2794 + arg1);
            var99.field2478.method3323(Statics.field494 + arg0);
            var99.field2478.method3272(arg3);
            field1073.method1916(var99);
        }
        if (arg2 == 28) {
            class185 var100 = class185.method343(class182.field2415, field1073.field1457);
            var100.field2478.method3223(arg1);
            field1073.method1916(var100);
            class243 var101 = class243.method3168(arg1);
            if (var101.field2930 != null && var101.field2930[0][0] == 5) {
                int var102 = var101.field2930[0][1];
                class238.field2771[var102] = 1 - class238.field2771[var102];
                method15(var102);
            }
        }
        if (arg2 == 42) {
            class185 var103 = class185.method343(class182.field2366, field1073.field1457);
            var103.field2478.method3269(arg3);
            var103.field2478.method3281(arg1);
            var103.field2478.method3218(arg0);
            field1073.method1916(var103);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 44) {
            class73 var104 = field965[arg3];
            if (var104 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var105 = class185.method343(class182.field2447, field1073.field1457);
                var105.field2478.method3318(class52.field615[82] ? 1 : 0);
                var105.field2478.method3272(arg3);
                field1073.method1916(var105);
            }
        }
        if (arg2 == 23) {
            if (field985) {
                Statics.field495.method2684();
            } else {
                Statics.field495.method2753(Statics.field3841, arg0, arg1, true);
            }
        }
        if (arg2 == 50) {
            class73 var106 = field965[arg3];
            if (var106 != null) {
                field976 = arg6;
                field951 = arg7;
                field953 = 2;
                field1089 = 0;
                field1077 = arg0;
                field904 = arg1;
                class185 var107 = class185.method343(class182.field2434, field1073.field1457);
                var107.field2478.method3261(class52.field615[82] ? 1 : 0);
                var107.field2478.method3269(arg3);
                field1073.method1916(var107);
            }
        }
        if (arg2 == 43) {
            class185 var108 = class185.method343(class182.field2377, field1073.field1457);
            var108.field2478.method3323(arg0);
            var108.field2478.method3272(arg3);
            var108.field2478.method3281(arg1);
            field1073.method1916(var108);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 39) {
            class185 var109 = class185.method343(class182.field2436, field1073.field1457);
            var109.field2478.method3323(arg0);
            var109.field2478.method3269(arg3);
            var109.field2478.method3281(arg1);
            field1073.method1916(var109);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (arg2 == 37) {
            class185 var110 = class185.method343(class182.field2365, field1073.field1457);
            var110.field2478.method3218(arg3);
            var110.field2478.method3412(arg1);
            var110.field2478.method3272(arg0);
            field1073.method1916(var110);
            field1028 = 0;
            Statics.field798 = class243.method3168(arg1);
            field956 = arg0;
        }
        if (field1002 != 0) {
            field1002 = 0;
            method942(class243.method3168(Statics.field620));
        }
        if (field934) {
            method5055();
        }
        if (Statics.field798 != null && field1028 == 0) {
            method942(Statics.field798);
        }
    }

    @ObfuscatedName("kn.hv(I)V")
    public static void method5055() {
        if (!field934) {
            return;
        }
        class243 var0 = class243.method3087(Statics.field1598, field1051);
        if (var0 != null && var0.field2808 != null) {
            class69 var1 = new class69();
            var1.field791 = var0;
            var1.field788 = var0.field2808;
            class82.method187(var1, 500000);
        }
        field934 = false;
        method942(var0);
    }

    @ObfuscatedName("jq.hd(III)V")
    public static void method4406(int arg0, int arg1) {
        class185 var2 = class185.method343(class182.field2443, field1073.field1457);
        var2.field2478.method3272(arg1);
        var2.field2478.method3283(arg0);
        field1073.method1916(var2);
    }

    @ObfuscatedName("fy.hi(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3034(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method181(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("h.hk(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method181(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field985 || field977 >= 500) {
            return;
        }
        field991[field977] = arg0;
        field992[field977] = arg1;
        field1041[field977] = arg2;
        field922[field977] = arg3;
        field987[field977] = arg4;
        field988[field977] = arg5;
        field974[field977] = arg6;
        field977++;
    }

    @ObfuscatedName("aw.hb(II)Ljava/lang/String;")
    public static String method590(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field992[arg0].length() > 0) {
            return field991[arg0] + class252.field3236 + field992[arg0];
        } else {
            return field991[arg0];
        }
    }

    @ObfuscatedName("ep.hy(Ljd;IIII)V")
    public static final void method2857(class286 arg0, int arg1, int arg2, int arg3) {
        if (field977 >= 400) {
            return;
        }
        if (arg0.field3736 != null) {
            arg0 = arg0.method4724();
        }
        if (arg0 == null || !arg0.field3739 || arg0.field3733 && field1017 != arg1) {
            return;
        }
        String var4 = arg0.field3706;
        if (arg0.field3738 != 0) {
            var4 = var4 + method4169(arg0.field3738, Statics.field434.field833) + " " + class87.field1300 + class252.field3178 + arg0.field3738 + class87.field1301;
        }
        if (arg0.field3733 && field994) {
            method3034(class252.field3173, class87.method501(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1002 == 1) {
            method3034(class252.field3062, field1003 + " " + class87.field1298 + " " + class87.method501(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field934) {
            int var5 = arg0.field3733 && field994 ? 2000 : 0;
            String[] var6 = arg0.field3726;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class252.field3174)) {
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
                        method3034(var6[var7], class87.method501(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class252.field3174)) {
                        short var10 = 0;
                        if (field876 != class90.field1320) {
                            if (field876 == class90.field1318 || field876 == class90.field1319 && arg0.field3738 > Statics.field434.field833) {
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
                            method3034(var6[var9], class87.method501(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3733 || !field994) {
                method3034(class252.field3173, class87.method501(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2101 & 0x2) == 2) {
            method3034(field1007, field1075 + " " + class87.field1298 + " " + class87.method501(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("g.ho(Lbi;IIII)V")
    public static final void method41(class73 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field434 == arg0 || field977 >= 400) {
            return;
        }
        String var4;
        if (arg0.field828 == 0) {
            var4 = arg0.field831[0] + arg0.field820 + arg0.field831[1] + method4169(arg0.field833, Statics.field434.field833) + " " + class87.field1300 + class252.field3178 + arg0.field833 + class87.field1301 + arg0.field831[2];
        } else {
            var4 = arg0.field831[0] + arg0.field820 + arg0.field831[1] + " " + class87.field1300 + class252.field3203 + arg0.field828 + class87.field1301 + arg0.field831[2];
        }
        if (field1002 == 1) {
            method3034(class252.field3062, field1003 + " " + class87.field1298 + " " + class87.method501(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field934) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field973[var5] != null) {
                    short var6 = 0;
                    if (field973[var5].equalsIgnoreCase(class252.field3174)) {
                        if (field875 == class90.field1320) {
                            continue;
                        }
                        if (field875 == class90.field1318 || field875 == class90.field1319 && arg0.field833 > Statics.field434.field833) {
                            var6 = 2000;
                        }
                        if (Statics.field434.field835 != 0 && arg0.field835 != 0) {
                            if (Statics.field434.field835 == arg0.field835) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field1082[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field972[var5] + var6;
                    method3034(field973[var5], class87.method501(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2101 & 0x8) == 8) {
            method3034(field1007, field1075 + " " + class87.field1298 + " " + class87.method501(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field977; var9++) {
            if (field1041[var9] == 23) {
                field992[var9] = class87.method501(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("iw.ie(III)Ljava/lang/String;")
    public static final String method4169(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class87.method501(16711680);
        } else if (var2 < -6) {
            return class87.method501(16723968);
        } else if (var2 < -3) {
            return class87.method501(16740352);
        } else if (var2 < 0) {
            return class87.method501(16756736);
        } else if (var2 > 9) {
            return class87.method501(65280);
        } else if (var2 > 6) {
            return class87.method501(4259584);
        } else if (var2 > 3) {
            return class87.method501(8453888);
        } else if (var2 > 0) {
            return class87.method501(12648192);
        } else {
            return class87.method501(16776960);
        }
    }

    @ObfuscatedName("kq.ix(IIIIIIIII)V")
    public static final void method5046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class243.method1894(arg0)) {
            Statics.field15 = null;
            method4188(Statics.field2810[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field15 != null) {
                method4188(Statics.field15, -1412584499, arg1, arg2, arg3, arg4, Statics.field747, Statics.field263, arg7);
                Statics.field15 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1052[var8] = true;
            }
        } else {
            field1052[arg7] = true;
        }
    }

    @ObfuscatedName("jk.iq([Lig;IIIIIIIII)V")
    public static final void method4188(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class328.method5320(arg2, arg3, arg4, arg5);
        class135.method2617();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class243 var10 = arg0[var9];
            if (var10 != null && (var10.field2837 == arg1 || arg1 == -1412584499 && field1020 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1055[field1050] = var10.field2842 + arg6;
                    field1006[field1050] = var10.field2832 + arg7;
                    field1057[field1050] = var10.field2833;
                    field998[field1050] = var10.field2834;
                    var11 = ++field1050 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2949 = var11;
                var10.field2950 = field1108;
                if (var10.field2846) {
                    boolean var12 = var10.field2838;
                    if (var12) {
                        continue;
                    }
                }
                if (var10.field2822 > 0) {
                    int var13 = var10.field2822;
                    if (var13 == 324) {
                        if (field1111 == -1) {
                            field1111 = var10.field2853;
                            field1112 = var10.field2881;
                        }
                        if (field1110.field2784) {
                            var10.field2853 = field1111;
                        } else {
                            var10.field2853 = field1112;
                        }
                    } else if (var13 == 325) {
                        if (field1111 == -1) {
                            field1111 = var10.field2853;
                            field1112 = var10.field2881;
                        }
                        if (field1110.field2784) {
                            var10.field2853 = field1112;
                        } else {
                            var10.field2853 = field1111;
                        }
                    } else if (var13 == 327) {
                        var10.field2869 = 150;
                        var10.field2819 = (int) (Math.sin((double) field1108 / 40.0D) * 256.0D) & 0x7FF;
                        var10.field2861 = 5;
                        var10.field2862 = 0;
                    } else if (var13 == 328) {
                        var10.field2869 = 150;
                        var10.field2819 = (int) (Math.sin((double) field1108 / 40.0D) * 256.0D) & 0x7FF;
                        var10.field2861 = 5;
                        var10.field2862 = 1;
                    }
                }
                int var14 = var10.field2842 + arg6;
                int var15 = var10.field2832 + arg7;
                int var16 = var10.field2897;
                if (field1020 == var10) {
                    if (arg1 != -1412584499 && !var10.field2896) {
                        Statics.field15 = arg0;
                        Statics.field747 = arg6;
                        Statics.field263 = arg7;
                        continue;
                    }
                    if (field859 && field1025) {
                        int var17 = class61.field685;
                        int var18 = class61.field686;
                        int var19 = var17 - field1022;
                        int var20 = var18 - field1016;
                        if (var19 < field1026) {
                            var19 = field1026;
                        }
                        if (var10.field2833 + var19 > field1026 + field1021.field2833) {
                            var19 = field1026 + field1021.field2833 - var10.field2833;
                        }
                        if (var20 < field1099) {
                            var20 = field1099;
                        }
                        if (var10.field2834 + var20 > field1099 + field1021.field2834) {
                            var20 = field1099 + field1021.field2834 - var10.field2834;
                        }
                        var14 = var19;
                        var15 = var20;
                    }
                    if (!var10.field2896) {
                        var16 = 128;
                    }
                }
                int var21;
                int var22;
                int var23;
                int var24;
                if (var10.field2820 == 2) {
                    var21 = arg2;
                    var22 = arg3;
                    var23 = arg4;
                    var24 = arg5;
                } else if (var10.field2820 == 9) {
                    int var25 = var14;
                    int var26 = var15;
                    int var27 = var10.field2833 + var14;
                    int var28 = var10.field2834 + var15;
                    if (var27 < var14) {
                        var25 = var27;
                        var27 = var14;
                    }
                    if (var28 < var15) {
                        var26 = var28;
                        var28 = var15;
                    }
                    var27++;
                    var28++;
                    var21 = var25 > arg2 ? var25 : arg2;
                    var22 = var26 > arg3 ? var26 : arg3;
                    var23 = var27 < arg4 ? var27 : arg4;
                    var24 = var28 < arg5 ? var28 : arg5;
                } else {
                    int var31 = var10.field2833 + var14;
                    int var32 = var10.field2834 + var15;
                    var21 = var14 > arg2 ? var14 : arg2;
                    var22 = var15 > arg3 ? var15 : arg3;
                    var23 = var31 < arg4 ? var31 : arg4;
                    var24 = var32 < arg5 ? var32 : arg5;
                }
                if (!var10.field2846 || var21 < var23 && var22 < var24) {
                    if (var10.field2822 != 0) {
                        if (var10.field2822 == 1336) {
                            if (field1076) {
                                var15 += 15;
                                Statics.field2261.method5075("Fps:" + field651, var10.field2833 + var14, var15, 16776960, -1);
                                var15 += 15;
                                Runtime var33 = Runtime.getRuntime();
                                int var34 = (int) ((var33.totalMemory() - var33.freeMemory()) / 1024L);
                                int var35 = 16776960;
                                if (var34 > 327680 && !field855) {
                                    var35 = 16711680;
                                }
                                Statics.field2261.method5075("Mem:" + var34 + "k", var10.field2833 + var14, var15, var35, -1);
                                var15 += 15;
                            }
                            continue;
                        }
                        if (var10.field2822 == 1337) {
                            field1005 = var14;
                            field1090 = var15;
                            method21(var14, var15, var10.field2833, var10.field2834);
                            field1052[var10.field2949] = true;
                            class328.method5320(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2822 == 1338) {
                            method525();
                            class237 var36 = var10.method4113(false);
                            if (var36 != null) {
                                class328.method5320(var14, var15, var36.field2767 + var14, var36.field2768 + var15);
                                if (field1004 == 2 || field1004 == 5) {
                                    class328.method5312(var14, var15, 0, var36.field2766, var36.field2765);
                                } else {
                                    int var37 = field919 & 0x7FF;
                                    int var38 = Statics.field434.field1175 / 32 + 48;
                                    int var39 = 464 - Statics.field434.field1138 / 32;
                                    Statics.field292.method5418(var14, var15, var36.field2767, var36.field2768, var38, var39, var37, 256, var36.field2766, var36.field2765);
                                    for (int var40 = 0; var40 < field1049; var40++) {
                                        int var41 = field1074[var40] * 4 + 2 - Statics.field434.field1175 / 32;
                                        int var42 = field862[var40] * 4 + 2 - Statics.field434.field1138 / 32;
                                        method37(var14, var15, var41, var42, field986[var40], var36);
                                    }
                                    int var43 = 0;
                                    while (true) {
                                        if (var43 >= 104) {
                                            for (int var48 = 0; var48 < field865; var48++) {
                                                class85 var49 = field975[field892[var48]];
                                                if (var49 != null && var49.method1102()) {
                                                    class286 var50 = var49.field1284;
                                                    if (var50 != null && var50.field3736 != null) {
                                                        var50 = var50.method4724();
                                                    }
                                                    if (var50 != null && var50.field3727 && var50.field3739) {
                                                        int var51 = var49.field1175 / 32 - Statics.field434.field1175 / 32;
                                                        int var52 = var49.field1138 / 32 - Statics.field434.field1138 / 32;
                                                        method37(var14, var15, var51, var52, Statics.field1823[1], var36);
                                                    }
                                                }
                                            }
                                            int var53 = class94.field1397;
                                            int[] var54 = class94.field1398;
                                            for (int var55 = 0; var55 < var53; var55++) {
                                                class73 var56 = field965[var54[var55]];
                                                if (var56 != null && var56.method1102() && !var56.field843 && Statics.field434 != var56) {
                                                    int var57 = var56.field1175 / 32 - Statics.field434.field1175 / 32;
                                                    int var58 = var56.field1138 / 32 - Statics.field434.field1138 / 32;
                                                    boolean var59 = false;
                                                    if (Statics.field434.field835 != 0 && var56.field835 != 0 && Statics.field434.field835 == var56.field835) {
                                                        var59 = true;
                                                    }
                                                    if (var56.method1127()) {
                                                        method37(var14, var15, var57, var58, Statics.field1823[3], var36);
                                                    } else if (var59) {
                                                        method37(var14, var15, var57, var58, Statics.field1823[4], var36);
                                                    } else if (var56.method1094()) {
                                                        method37(var14, var15, var57, var58, Statics.field1823[5], var36);
                                                    } else {
                                                        method37(var14, var15, var57, var58, Statics.field1823[2], var36);
                                                    }
                                                }
                                            }
                                            if (field949 != 0 && field1108 % 20 < 10) {
                                                if (field949 == 1 && field868 >= 0 && field868 < field975.length) {
                                                    class85 var60 = field975[field868];
                                                    if (var60 != null) {
                                                        int var61 = var60.field1175 / 32 - Statics.field434.field1175 / 32;
                                                        int var62 = var60.field1138 / 32 - Statics.field434.field1138 / 32;
                                                        method8(var14, var15, var61, var62, Statics.field724[1], var36);
                                                    }
                                                }
                                                if (field949 == 2) {
                                                    int var63 = field990 * 4 - Statics.field494 * 4 + 2 - Statics.field434.field1175 / 32;
                                                    int var64 = field871 * 4 - Statics.field2794 * 4 + 2 - Statics.field434.field1138 / 32;
                                                    method8(var14, var15, var63, var64, Statics.field724[1], var36);
                                                }
                                                if (field949 == 10 && field869 >= 0 && field869 < field965.length) {
                                                    class73 var65 = field965[field869];
                                                    if (var65 != null) {
                                                        int var66 = var65.field1175 / 32 - Statics.field434.field1175 / 32;
                                                        int var67 = var65.field1138 / 32 - Statics.field434.field1138 / 32;
                                                        method8(var14, var15, var66, var67, Statics.field724[1], var36);
                                                    }
                                                }
                                            }
                                            if (field1077 != 0) {
                                                int var68 = field1077 * 4 + 2 - Statics.field434.field1175 / 32;
                                                int var69 = field904 * 4 + 2 - Statics.field434.field1138 / 32;
                                                method37(var14, var15, var68, var69, Statics.field724[0], var36);
                                            }
                                            if (!Statics.field434.field843) {
                                                class328.method5275(var36.field2767 / 2 + var14 - 1, var36.field2768 / 2 + var15 - 1, 3, 3, 16777215);
                                            }
                                            break;
                                        }
                                        for (int var44 = 0; var44 < 104; var44++) {
                                            class218 var45 = field886[Statics.field3841][var43][var44];
                                            if (var45 != null) {
                                                int var46 = var43 * 4 + 2 - Statics.field434.field1175 / 32;
                                                int var47 = var44 * 4 + 2 - Statics.field434.field1138 / 32;
                                                method37(var14, var15, var46, var47, Statics.field1823[0], var36);
                                            }
                                        }
                                        var43++;
                                    }
                                }
                                field905[var11] = true;
                            }
                            class328.method5320(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2822 == 1339) {
                            class237 var70 = var10.method4113(false);
                            if (var70 != null) {
                                if (field1004 < 3) {
                                    Statics.field333.method5418(var14, var15, var70.field2767, var70.field2768, 25, 25, field919, 256, var70.field2766, var70.field2765);
                                } else {
                                    class328.method5312(var14, var15, 0, var70.field2766, var70.field2765);
                                }
                            }
                            class328.method5320(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2822 == 1400) {
                            Statics.field3306.method5684(var14, var15, var10.field2833, var10.field2834, field1108);
                        }
                        if (var10.field2822 == 1401) {
                            Statics.field3306.method5694(var14, var15, var10.field2833, var10.field2834);
                        }
                    }
                    if (var10.field2820 == 0) {
                        if (!var10.field2846) {
                            boolean var71 = var10.field2838;
                            if (var71 && Statics.field378 != var10) {
                                continue;
                            }
                        }
                        if (!var10.field2846) {
                            if (var10.field2829 > var10.field2878 - var10.field2834) {
                                var10.field2829 = var10.field2878 - var10.field2834;
                            }
                            if (var10.field2829 < 0) {
                                var10.field2829 = 0;
                            }
                        }
                        method4188(arg0, var10.field2929, var21, var22, var23, var24, var14 - var10.field2857, var15 - var10.field2829, var11);
                        if (var10.field2898 != null) {
                            method4188(var10.field2898, var10.field2929, var21, var22, var23, var24, var14 - var10.field2857, var15 - var10.field2829, var11);
                        }
                        class68 var72 = (class68) field1010.method3677((long) var10.field2929);
                        if (var72 != null) {
                            method5046(var72.field778, var21, var22, var23, var24, var14, var15, var11);
                        }
                        class328.method5320(arg2, arg3, arg4, arg5);
                        class135.method2617();
                    }
                    if (field1061 || field1054[var11] || field1059 > 1) {
                        if (var10.field2820 == 0 && !var10.field2846 && var10.field2878 > var10.field2834) {
                            method14(var10.field2833 + var14, var15, var10.field2829, var10.field2834, var10.field2878);
                        }
                        if (var10.field2820 != 1) {
                            if (var10.field2820 == 2) {
                                int var73 = 0;
                                for (int var74 = 0; var74 < var10.field2807; var74++) {
                                    for (int var75 = 0; var75 < var10.field2939; var75++) {
                                        int var76 = (var10.field2884 + 32) * var75 + var14;
                                        int var77 = (var10.field2885 + 32) * var74 + var15;
                                        if (var73 < 20) {
                                            var76 += var10.field2830[var73];
                                            var77 += var10.field2887[var73];
                                        }
                                        if (var10.field2936[var73] > 0) {
                                            boolean var78 = false;
                                            boolean var79 = false;
                                            int var80 = var10.field2936[var73] - 1;
                                            if (var76 + 32 > arg2 && var76 < arg4 && var77 + 32 > arg3 && var77 < arg5 || Statics.field575 == var10 && field999 == var73) {
                                                class332 var81;
                                                if (field1002 == 1 && Statics.field3487 == var73 && Statics.field620 == var10.field2929) {
                                                    var81 = class284.method184(var80, var10.field2817[var73], 2, 0, 2, false);
                                                } else {
                                                    var81 = class284.method184(var80, var10.field2817[var73], 1, 3153952, 2, false);
                                                }
                                                if (var81 == null) {
                                                    method942(var10);
                                                } else if (Statics.field575 == var10 && field999 == var73) {
                                                    int var82 = class61.field685 - field958;
                                                    int var83 = class61.field686 - field959;
                                                    if (var82 < 5 && var82 > -5) {
                                                        var82 = 0;
                                                    }
                                                    if (var83 < 5 && var83 > -5) {
                                                        var83 = 0;
                                                    }
                                                    if (field962 < 5) {
                                                        var82 = 0;
                                                        var83 = 0;
                                                    }
                                                    var81.method5404(var76 + var82, var77 + var83, 128);
                                                    if (arg1 != -1) {
                                                        class243 var84 = arg0[arg1 & 0xFFFF];
                                                        if (var77 + var83 < class328.field3961 && var84.field2829 > 0) {
                                                            int var85 = field911 * (class328.field3961 - var77 - var83) / 3;
                                                            if (var85 > field911 * 10) {
                                                                var85 = field911 * 10;
                                                            }
                                                            if (var85 > var84.field2829) {
                                                                var85 = var84.field2829;
                                                            }
                                                            var84.field2829 -= var85;
                                                            field959 += var85;
                                                            method942(var84);
                                                        }
                                                        if (var77 + var83 + 32 > class328.field3962 && var84.field2829 < var84.field2878 - var84.field2834) {
                                                            int var86 = field911 * (var77 + var83 + 32 - class328.field3962) / 3;
                                                            if (var86 > field911 * 10) {
                                                                var86 = field911 * 10;
                                                            }
                                                            if (var86 > var84.field2878 - var84.field2834 - var84.field2829) {
                                                                var86 = var84.field2878 - var84.field2834 - var84.field2829;
                                                            }
                                                            var84.field2829 += var86;
                                                            field959 -= var86;
                                                            method942(var84);
                                                        }
                                                    }
                                                } else if (Statics.field798 == var10 && field956 == var73) {
                                                    var81.method5404(var76, var77, 128);
                                                } else {
                                                    var81.method5445(var76, var77);
                                                }
                                            }
                                        } else if (var10.field2888 != null && var73 < 20) {
                                            class332 var87 = var10.method4111(var73);
                                            if (var87 != null) {
                                                var87.method5445(var76, var77);
                                            } else if (class243.field2886) {
                                                method942(var10);
                                            }
                                        }
                                        var73++;
                                    }
                                }
                            } else if (var10.field2820 == 3) {
                                int var88;
                                if (Statics.method776(var10)) {
                                    var88 = var10.field2880;
                                    if (Statics.field378 == var10 && var10.field2894 != 0) {
                                        var88 = var10.field2894;
                                    }
                                } else {
                                    var88 = var10.field2843;
                                    if (Statics.field378 == var10 && var10.field2845 != 0) {
                                        var88 = var10.field2845;
                                    }
                                }
                                if (var10.field2944) {
                                    switch(var10.field2809.field3973) {
                                        case 1:
                                            class328.method5280(var14, var15, var10.field2833, var10.field2834, var10.field2843, var10.field2880, 256 - (var10.field2897 & 0xFF), 256 - (var10.field2953 & 0xFF));
                                            break;
                                        case 2:
                                            class328.method5277(var14, var15, var10.field2833, var10.field2834, var10.field2843, var10.field2880, 256 - (var10.field2897 & 0xFF), 256 - (var10.field2953 & 0xFF));
                                            break;
                                        case 3:
                                            class328.method5278(var14, var15, var10.field2833, var10.field2834, var10.field2843, var10.field2880, 256 - (var10.field2897 & 0xFF), 256 - (var10.field2953 & 0xFF));
                                            break;
                                        case 4:
                                            class328.method5279(var14, var15, var10.field2833, var10.field2834, var10.field2843, var10.field2880, 256 - (var10.field2897 & 0xFF), 256 - (var10.field2953 & 0xFF));
                                            break;
                                        default:
                                            if (var16 == 0) {
                                                class328.method5275(var14, var15, var10.field2833, var10.field2834, var88);
                                            } else {
                                                class328.method5318(var14, var15, var10.field2833, var10.field2834, var88, 256 - (var16 & 0xFF));
                                            }
                                    }
                                } else if (var16 == 0) {
                                    class328.method5282(var14, var15, var10.field2833, var10.field2834, var88);
                                } else {
                                    class328.method5283(var14, var15, var10.field2833, var10.field2834, var88, 256 - (var16 & 0xFF));
                                }
                            } else if (var10.field2820 == 4) {
                                class312 var89 = var10.method4126();
                                if (var89 != null) {
                                    String var90 = var10.field2827;
                                    int var91;
                                    if (Statics.method776(var10)) {
                                        var91 = var10.field2880;
                                        if (Statics.field378 == var10 && var10.field2894 != 0) {
                                            var91 = var10.field2894;
                                        }
                                        if (var10.field2942.length() > 0) {
                                            var90 = var10.field2942;
                                        }
                                    } else {
                                        var91 = var10.field2843;
                                        if (Statics.field378 == var10 && var10.field2845 != 0) {
                                            var91 = var10.field2845;
                                        }
                                    }
                                    if (var10.field2846 && var10.field2938 != -1) {
                                        class284 var92 = class284.method1694(var10.field2938);
                                        var90 = var92.field3656;
                                        if (var90 == null) {
                                            var90 = class252.field3052;
                                        }
                                        if ((var92.field3646 == 1 || var10.field2910 != 1) && var10.field2910 != -1) {
                                            var90 = class87.method501(16748608) + var90 + class87.field1302 + " " + 'x' + method498(var10.field2910);
                                        }
                                    }
                                    if (field1013 == var10) {
                                        var90 = class252.field3180;
                                        var91 = var10.field2843;
                                    }
                                    if (!var10.field2846) {
                                        var90 = method1568(var90, var10);
                                    }
                                    var89.method5077(var90, var14, var15, var10.field2833, var10.field2834, var91, var10.field2883 ? 0 : -1, var10.field2828, var10.field2882, var10.field2814);
                                } else if (class243.field2886) {
                                    method942(var10);
                                }
                            } else if (var10.field2820 == 5) {
                                if (var10.field2846) {
                                    class332 var94;
                                    if (var10.field2938 == -1) {
                                        var94 = var10.method4124(false);
                                    } else {
                                        var94 = class284.method184(var10.field2938, var10.field2910, var10.field2844, var10.field2858, var10.field2865, false);
                                    }
                                    if (var94 != null) {
                                        int var95 = var94.field3988;
                                        int var96 = var94.field3983;
                                        if (var10.field2855) {
                                            class328.method5268(var14, var15, var10.field2833 + var14, var10.field2834 + var15);
                                            int var97 = (var10.field2833 + (var95 - 1)) / var95;
                                            int var98 = (var10.field2834 + (var96 - 1)) / var96;
                                            for (int var99 = 0; var99 < var97; var99++) {
                                                for (int var100 = 0; var100 < var98; var100++) {
                                                    if (var10.field2870 != 0) {
                                                        var94.method5417(var95 / 2 + var95 * var99 + var14, var96 / 2 + var96 * var100 + var15, var10.field2870, 4096);
                                                    } else if (var16 == 0) {
                                                        var94.method5445(var95 * var99 + var14, var96 * var100 + var15);
                                                    } else {
                                                        var94.method5404(var95 * var99 + var14, var96 * var100 + var15, 256 - (var16 & 0xFF));
                                                    }
                                                }
                                            }
                                            class328.method5320(arg2, arg3, arg4, arg5);
                                        } else {
                                            int var101 = var10.field2833 * 4096 / var95;
                                            if (var10.field2870 != 0) {
                                                var94.method5417(var10.field2833 / 2 + var14, var10.field2834 / 2 + var15, var10.field2870, var101);
                                            } else if (var16 != 0) {
                                                var94.method5406(var14, var15, var10.field2833, var10.field2834, 256 - (var16 & 0xFF));
                                            } else if (var10.field2833 == var95 && var10.field2834 == var96) {
                                                var94.method5445(var14, var15);
                                            } else {
                                                var94.method5400(var14, var15, var10.field2833, var10.field2834);
                                            }
                                        }
                                    } else if (class243.field2886) {
                                        method942(var10);
                                    }
                                } else {
                                    class332 var93 = var10.method4124(Statics.method776(var10));
                                    if (var93 != null) {
                                        var93.method5445(var14, var15);
                                    } else if (class243.field2886) {
                                        method942(var10);
                                    }
                                }
                            } else if (var10.field2820 == 6) {
                                boolean var102 = Statics.method776(var10);
                                int var103;
                                if (var102) {
                                    var103 = var10.field2866;
                                } else {
                                    var103 = var10.field2839;
                                }
                                class132 var104 = null;
                                int var105 = 0;
                                if (var10.field2938 != -1) {
                                    class284 var106 = class284.method1694(var10.field2938);
                                    if (var106 != null) {
                                        class284 var107 = var106.method4662(var10.field2910);
                                        var104 = var107.method4659(1);
                                        if (var104 == null) {
                                            method942(var10);
                                        } else {
                                            var104.method2485();
                                            var105 = var104.field2020 / 2;
                                        }
                                    }
                                } else if (var10.field2861 == 5) {
                                    if (var10.field2862 == 0) {
                                        var104 = field1110.method4069((class288) null, -1, (class288) null, -1);
                                    } else {
                                        var104 = Statics.field434.method1098();
                                    }
                                } else if (var103 == -1) {
                                    var104 = var10.method4112((class288) null, -1, var102, Statics.field434.field836);
                                    if (var104 == null && class243.field2886) {
                                        method942(var10);
                                    }
                                } else {
                                    class288 var108 = class288.method2932(var103);
                                    var104 = var10.method4112(var108, var10.field2940, var102, Statics.field434.field836);
                                    if (var104 == null && class243.field2886) {
                                        method942(var10);
                                    }
                                }
                                class135.method2560(var10.field2833 / 2 + var14, var10.field2834 / 2 + var15);
                                int var109 = var10.field2872 * class135.field1935[var10.field2869] >> 16;
                                int var110 = var10.field2872 * class135.field1936[var10.field2869] >> 16;
                                if (var104 != null) {
                                    if (var10.field2846) {
                                        var104.method2485();
                                        if (var10.field2875) {
                                            var104.method2483(0, var10.field2819, var10.field2871, var10.field2869, var10.field2867, var10.field2868 + var105 + var109, var10.field2868 + var110, var10.field2872);
                                        } else {
                                            var104.method2482(0, var10.field2819, var10.field2871, var10.field2869, var10.field2867, var10.field2868 + var105 + var109, var10.field2868 + var110);
                                        }
                                    } else {
                                        var104.method2482(0, var10.field2819, 0, var10.field2869, 0, var109, var110);
                                    }
                                }
                                class135.method2559();
                            } else {
                                if (var10.field2820 == 7) {
                                    class312 var111 = var10.method4126();
                                    if (var111 == null) {
                                        if (class243.field2886) {
                                            method942(var10);
                                        }
                                        continue;
                                    }
                                    int var112 = 0;
                                    for (int var113 = 0; var113 < var10.field2807; var113++) {
                                        for (int var114 = 0; var114 < var10.field2939; var114++) {
                                            if (var10.field2936[var112] > 0) {
                                                class284 var115 = class284.method1694(var10.field2936[var112] - 1);
                                                String var116;
                                                if (var115.field3646 != 1 && var10.field2817[var112] == 1) {
                                                    var116 = class87.method501(16748608) + var115.field3656 + class87.field1302;
                                                } else {
                                                    var116 = class87.method501(16748608) + var115.field3656 + class87.field1302 + " " + 'x' + method498(var10.field2817[var112]);
                                                }
                                                int var117 = (var10.field2884 + 115) * var114 + var14;
                                                int var118 = (var10.field2885 + 12) * var113 + var15;
                                                if (var10.field2828 == 0) {
                                                    var111.method5073(var116, var117, var118, var10.field2843, var10.field2883 ? 0 : -1);
                                                } else if (var10.field2828 == 1) {
                                                    var111.method5076(var116, var10.field2833 / 2 + var117, var118, var10.field2843, var10.field2883 ? 0 : -1);
                                                } else {
                                                    var111.method5075(var116, var10.field2833 + var117 - 1, var118, var10.field2843, var10.field2883 ? 0 : -1);
                                                }
                                            }
                                            var112++;
                                        }
                                    }
                                }
                                if (var10.field2820 == 8 && Statics.field3372 == var10 && field1001 == field1000) {
                                    int var119 = 0;
                                    int var120 = 0;
                                    class312 var121 = Statics.field2261;
                                    String var122 = var10.field2827;
                                    String var123 = method1568(var122, var10);
                                    while (var123.length() > 0) {
                                        int var124 = var123.indexOf(class87.field1297);
                                        String var125;
                                        if (var124 == -1) {
                                            var125 = var123;
                                            var123 = "";
                                        } else {
                                            var125 = var123.substring(0, var124);
                                            var123 = var123.substring(var124 + 4);
                                        }
                                        int var126 = var121.method5068(var125);
                                        if (var126 > var119) {
                                            var119 = var126;
                                        }
                                        var120 += var121.field3893 + 1;
                                    }
                                    var119 += 6;
                                    var120 += 7;
                                    int var127 = var10.field2833 + var14 - 5 - var119;
                                    int var128 = var10.field2834 + var15 + 5;
                                    if (var127 < var14 + 5) {
                                        var127 = var14 + 5;
                                    }
                                    if (var119 + var127 > arg4) {
                                        var127 = arg4 - var119;
                                    }
                                    if (var120 + var128 > arg5) {
                                        var128 = arg5 - var120;
                                    }
                                    class328.method5275(var127, var128, var119, var120, 16777120);
                                    class328.method5282(var127, var128, var119, var120, 0);
                                    String var129 = var10.field2827;
                                    int var130 = var121.field3893 + var128 + 2;
                                    String var131 = method1568(var129, var10);
                                    while (var131.length() > 0) {
                                        int var132 = var131.indexOf(class87.field1297);
                                        String var133;
                                        if (var132 == -1) {
                                            var133 = var131;
                                            var131 = "";
                                        } else {
                                            var133 = var131.substring(0, var132);
                                            var131 = var131.substring(var132 + 4);
                                        }
                                        var121.method5073(var133, var127 + 3, var130, 0, -1);
                                        var130 += var121.field3893 + 1;
                                    }
                                }
                                if (var10.field2820 == 9) {
                                    int var134;
                                    int var135;
                                    int var136;
                                    int var137;
                                    if (var10.field2852) {
                                        var134 = var14;
                                        var135 = var10.field2834 + var15;
                                        var136 = var10.field2833 + var14;
                                        var137 = var15;
                                    } else {
                                        var134 = var14;
                                        var135 = var15;
                                        var136 = var10.field2833 + var14;
                                        var137 = var10.field2834 + var15;
                                    }
                                    if (var10.field2851 == 1) {
                                        class328.method5287(var134, var135, var136, var137, var10.field2843);
                                    } else {
                                        method4207(var134, var135, var136, var137, var10.field2843, var10.field2851);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jc.iv(IIIIIII)V")
    public static final void method4207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class328.field3960;
        int var18 = arg1 - class328.field3961;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class135.method2588(var19, var20, var21);
        class135.method2640(var23, var24, var25, var19, var20, var21, arg4);
        class135.method2588(var19, var21, var22);
        class135.method2640(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bd.ik(Ljava/lang/String;Lig;B)Ljava/lang/String;")
    public static String method1568(String arg0, class243 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3462(method2109(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ax.if(IB)Ljava/lang/String;")
    public static final String method498(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class87.field1303 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class87.method501(65408) + var1.substring(0, var1.length() - 8) + class252.field3183 + " " + class87.field1300 + var1 + class87.field1301 + class87.field1302;
        } else if (var1.length() > 6) {
            return " " + class87.method501(16777215) + var1.substring(0, var1.length() - 4) + class252.field3185 + " " + class87.field1300 + var1 + class87.field1301 + class87.field1302;
        } else {
            return " " + class87.method501(16776960) + var1 + class87.field1302;
        }
    }

    @ObfuscatedName("client.is(ZI)V")
    public final void method1158(boolean arg0) {
        int var2 = field1009;
        int var3 = Statics.field2021;
        int var4 = Statics.field659;
        if (class243.method1894(var2)) {
            method745(Statics.field2810[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.io(Lig;I)V")
    public void method1411(class243 arg0) {
        class243 var2 = arg0.field2837 == -1 ? null : class243.method3168(arg0.field2837);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2021;
            var4 = Statics.field659;
        } else {
            var3 = var2.field2833;
            var4 = var2.field2834;
        }
        method587(arg0, var3, var4, false);
        method147(arg0, var3, var4);
    }

    @ObfuscatedName("bh.ig([Lig;Lig;ZI)V")
    public static void method940(class243[] arg0, class243 arg1, boolean arg2) {
        int var3 = arg1.field2841 == 0 ? arg1.field2833 : arg1.field2841;
        int var4 = arg1.field2878 == 0 ? arg1.field2834 : arg1.field2878;
        method745(arg0, arg1.field2929, var3, var4, arg2);
        if (arg1.field2898 != null) {
            method745(arg1.field2898, arg1.field2929, var3, var4, arg2);
        }
        class68 var5 = (class68) field1010.method3677((long) arg1.field2929);
        if (var5 != null) {
            int var6 = var5.field778;
            if (class243.method1894(var6)) {
                method745(Statics.field2810[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2822 == 1337) {
        }
    }

    @ObfuscatedName("bk.ic([Lig;IIIZI)V")
    public static void method745(class243[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class243 var6 = arg0[var5];
            if (var6 != null && var6.field2837 == arg1) {
                method587(var6, arg2, arg3, arg4);
                method147(var6, arg2, arg3);
                if (var6.field2857 > var6.field2841 - var6.field2833) {
                    var6.field2857 = var6.field2841 - var6.field2833;
                }
                if (var6.field2857 < 0) {
                    var6.field2857 = 0;
                }
                if (var6.field2829 > var6.field2878 - var6.field2834) {
                    var6.field2829 = var6.field2878 - var6.field2834;
                }
                if (var6.field2829 < 0) {
                    var6.field2829 = 0;
                }
                if (var6.field2820 == 0) {
                    method940(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("aw.it(Lig;IIZI)V")
    public static void method587(class243 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2833;
        int var5 = arg0.field2834;
        if (arg0.field2825 == 0) {
            arg0.field2833 = arg0.field2939;
        } else if (arg0.field2825 == 1) {
            arg0.field2833 = arg1 - arg0.field2939;
        } else if (arg0.field2825 == 2) {
            arg0.field2833 = arg0.field2939 * arg1 >> 14;
        }
        if (arg0.field2826 == 0) {
            arg0.field2834 = arg0.field2807;
        } else if (arg0.field2826 == 1) {
            arg0.field2834 = arg2 - arg0.field2807;
        } else if (arg0.field2826 == 2) {
            arg0.field2834 = arg0.field2807 * arg2 >> 14;
        }
        if (arg0.field2825 == 4) {
            arg0.field2833 = arg0.field2835 * arg0.field2834 / arg0.field2836;
        }
        if (arg0.field2826 == 4) {
            arg0.field2834 = arg0.field2836 * arg0.field2833 / arg0.field2835;
        }
        if (arg0.field2822 == 1337) {
            field1062 = arg0;
        }
        if (arg3 && arg0.field2927 != null && (arg0.field2833 != var4 || arg0.field2834 != var5)) {
            class69 var6 = new class69();
            var6.field791 = arg0;
            var6.field788 = arg0.field2927;
            field1046.method3759(var6);
        }
    }

    @ObfuscatedName("s.iw(Lig;IIB)V")
    public static void method147(class243 arg0, int arg1, int arg2) {
        if (arg0.field2823 == 0) {
            arg0.field2842 = arg0.field2913;
        } else if (arg0.field2823 == 1) {
            arg0.field2842 = (arg1 - arg0.field2833) / 2 + arg0.field2913;
        } else if (arg0.field2823 == 2) {
            arg0.field2842 = arg1 - arg0.field2833 - arg0.field2913;
        } else if (arg0.field2823 == 3) {
            arg0.field2842 = arg0.field2913 * arg1 >> 14;
        } else if (arg0.field2823 == 4) {
            arg0.field2842 = (arg0.field2913 * arg1 >> 14) + (arg1 - arg0.field2833) / 2;
        } else {
            arg0.field2842 = arg1 - arg0.field2833 - (arg0.field2913 * arg1 >> 14);
        }
        if (arg0.field2824 == 0) {
            arg0.field2832 = arg0.field2864;
        } else if (arg0.field2824 == 1) {
            arg0.field2832 = (arg2 - arg0.field2834) / 2 + arg0.field2864;
        } else if (arg0.field2824 == 2) {
            arg0.field2832 = arg2 - arg0.field2834 - arg0.field2864;
        } else if (arg0.field2824 == 3) {
            arg0.field2832 = arg0.field2864 * arg2 >> 14;
        } else if (arg0.field2824 == 4) {
            arg0.field2832 = (arg0.field2864 * arg2 >> 14) + (arg2 - arg0.field2834) / 2;
        } else {
            arg0.field2832 = arg2 - arg0.field2834 - (arg0.field2864 * arg2 >> 14);
        }
    }

    @ObfuscatedName("l.ih(IIIIIS)V")
    public static final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field496[0].method5362(arg0, arg1);
        Statics.field496[1].method5362(arg0, arg1 + arg3 - 16);
        class328.method5275(arg0, arg1 + 16, 16, arg3 - 32, field912);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class328.method5275(arg0, arg1 + 16 + var6, 16, var5, field1043);
        class328.method5273(arg0, arg1 + 16 + var6, var5, field915);
        class328.method5273(arg0 + 1, arg1 + 16 + var6, var5, field915);
        class328.method5284(arg0, arg1 + 16 + var6, 16, field915);
        class328.method5284(arg0, arg1 + 17 + var6, 16, field915);
        class328.method5273(arg0 + 15, arg1 + 16 + var6, var5, field908);
        class328.method5273(arg0 + 14, arg1 + 17 + var6, var5 - 1, field908);
        class328.method5284(arg0, arg1 + 15 + var6 + var5, 16, field908);
        class328.method5284(arg0 + 1, arg1 + 14 + var6 + var5, 15, field908);
    }

    @ObfuscatedName("gb.ij(II)Ljava/lang/String;")
    public static final String method3462(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("dc.ir(Lig;II)I")
    public static final int method2109(class243 arg0, int arg1) {
        if (arg0.field2930 == null || arg1 >= arg0.field2930.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2930[arg1];
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
                    var7 = field948[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1031[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field983[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class243 var11 = class243.method3168(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class284.method1694(var12).field3669 || field854)) {
                        for (int var13 = 0; var13 < var11.field2936.length; var13++) {
                            if (var12 + 1 == var11.field2936[var13]) {
                                var7 += var11.field2817[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class238.field2771[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class249.field3007[field1031[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class238.field2771[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field434.field833;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class249.field3006[var14]) {
                            var7 += field1031[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class243 var17 = class243.method3168(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class284.method1694(var18).field3669 || field854)) {
                        for (int var19 = 0; var19 < var17.field2936.length; var19++) {
                            if (var18 + 1 == var17.field2936[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1014;
                }
                if (var6 == 12) {
                    var7 = field863;
                }
                if (var6 == 13) {
                    int var20 = class238.field2771[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class238.method1567(var22);
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
                    var7 = (Statics.field434.field1175 >> 7) + Statics.field494;
                }
                if (var6 == 19) {
                    var7 = (Statics.field434.field1138 >> 7) + Statics.field2794;
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

    @ObfuscatedName("bo.ib(Lig;Ljy;IIZI)V")
    public static final void method1069(class243 arg0, class284 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3671;
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
            var7 = class252.field3286;
        }
        if (var6 != -1 && var7 != null) {
            method181(var7, class87.method501(16748608) + arg1.field3656, var6, arg1.field3654, arg2, arg0.field2929, arg4);
        }
    }

    @ObfuscatedName("ap.ii(ZI)V")
    public static void method341(boolean arg0) {
        field878 = arg0;
    }

    @ObfuscatedName("ag.iy(I)Z")
    public static boolean method580() {
        return field878;
    }

    @ObfuscatedName("gh.im([Lig;IIIIIIII)V")
    public static final void method3203(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class243 var9 = arg0[var8];
            if (var9 != null && (!var9.field2846 || var9.field2820 == 0 || var9.field2879 || Statics.method78(var9) != 0 || field1021 == var9 || var9.field2822 == 1338) && var9.field2837 == arg1) {
                if (var9.field2846) {
                    boolean var10 = var9.field2838;
                    if (var10) {
                        continue;
                    }
                }
                int var11 = var9.field2842 + arg6;
                int var12 = var9.field2832 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field2820 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field2820 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field2833 + var11;
                    int var20 = var9.field2834 + var12;
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    if (var20 < var12) {
                        var18 = var20;
                        var20 = var12;
                    }
                    var19++;
                    var20++;
                    var13 = var17 > arg2 ? var17 : arg2;
                    var14 = var18 > arg3 ? var18 : arg3;
                    var15 = var19 < arg4 ? var19 : arg4;
                    var16 = var20 < arg5 ? var20 : arg5;
                } else {
                    int var23 = var9.field2833 + var11;
                    int var24 = var9.field2834 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field1020 == var9) {
                    field1096 = true;
                    field1029 = var11;
                    field945 = var12;
                }
                if (!var9.field2846 || var13 < var15 && var14 < var16) {
                    int var25 = class61.field685;
                    int var26 = class61.field686;
                    if (class61.field679 != 0) {
                        var25 = class61.field692;
                        var26 = class61.field693;
                    }
                    boolean var27 = var25 >= var13 && var26 >= var14 && var25 < var15 && var26 < var16;
                    if (var9.field2822 == 1337) {
                        if (!field950 && !field985 && var27) {
                            if (field1002 == 0 && !field934) {
                                method3034(class252.field3177, "", 23, 0, var25 - var13, var26 - var14);
                            }
                            int var28 = -1;
                            int var29 = -1;
                            for (int var30 = 0; var30 < class133.field1901; var30++) {
                                int var31 = class133.field1902[var30];
                                int var32 = var31 & 0x7F;
                                int var33 = var31 >> 7 & 0x7F;
                                int var34 = var31 >> 29 & 0x3;
                                int var35 = var31 >> 14 & 0x7FFF;
                                if (var29 != var31) {
                                    var29 = var31;
                                    if (var34 == 2 && Statics.field495.method2676(Statics.field3841, var32, var33, var31) >= 0) {
                                        class283 var36 = class283.method4427(var35);
                                        if (var36.field3606 != null) {
                                            var36 = var36.method4615();
                                        }
                                        if (var36 == null) {
                                            continue;
                                        }
                                        if (field1002 == 1) {
                                            method3034(class252.field3062, field1003 + " " + class87.field1298 + " " + class87.method501(65535) + var36.field3638, 1, var31, var32, var33);
                                        } else if (!field934) {
                                            String[] var37 = var36.field3622;
                                            if (var37 != null) {
                                                for (int var38 = 4; var38 >= 0; var38--) {
                                                    if (var37[var38] != null) {
                                                        short var39 = 0;
                                                        if (var38 == 0) {
                                                            var39 = 3;
                                                        }
                                                        if (var38 == 1) {
                                                            var39 = 4;
                                                        }
                                                        if (var38 == 2) {
                                                            var39 = 5;
                                                        }
                                                        if (var38 == 3) {
                                                            var39 = 6;
                                                        }
                                                        if (var38 == 4) {
                                                            var39 = 1001;
                                                        }
                                                        method3034(var37[var38], class87.method501(65535) + var36.field3638, var39, var31, var32, var33);
                                                    }
                                                }
                                            }
                                            method3034(class252.field3173, class87.method501(65535) + var36.field3638, 1002, var36.field3602 << 14, var32, var33);
                                        } else if ((Statics.field2101 & 0x4) == 4) {
                                            method3034(field1007, field1075 + " " + class87.field1298 + " " + class87.method501(65535) + var36.field3638, 2, var31, var32, var33);
                                        }
                                    }
                                    if (var34 == 1) {
                                        class85 var40 = field975[var35];
                                        if (var40 == null) {
                                            continue;
                                        }
                                        if (var40.field1284.field3711 == 1 && (var40.field1175 & 0x7F) == 64 && (var40.field1138 & 0x7F) == 64) {
                                            for (int var41 = 0; var41 < field865; var41++) {
                                                class85 var42 = field975[field892[var41]];
                                                if (var42 != null && var40 != var42 && var42.field1284.field3711 == 1 && var40.field1175 == var42.field1175 && var40.field1138 == var42.field1138) {
                                                    method2857(var42.field1284, field892[var41], var32, var33);
                                                }
                                            }
                                            int var43 = class94.field1397;
                                            int[] var44 = class94.field1398;
                                            for (int var45 = 0; var45 < var43; var45++) {
                                                class73 var46 = field965[var44[var45]];
                                                if (var46 != null && var40.field1175 == var46.field1175 && var40.field1138 == var46.field1138) {
                                                    method41(var46, var44[var45], var32, var33);
                                                }
                                            }
                                        }
                                        method2857(var40.field1284, var35, var32, var33);
                                    }
                                    if (var34 == 0) {
                                        class73 var47 = field965[var35];
                                        if (var47 == null) {
                                            continue;
                                        }
                                        if ((var47.field1175 & 0x7F) == 64 && (var47.field1138 & 0x7F) == 64) {
                                            for (int var48 = 0; var48 < field865; var48++) {
                                                class85 var49 = field975[field892[var48]];
                                                if (var49 != null && var49.field1284.field3711 == 1 && var47.field1175 == var49.field1175 && var47.field1138 == var49.field1138) {
                                                    method2857(var49.field1284, field892[var48], var32, var33);
                                                }
                                            }
                                            int var50 = class94.field1397;
                                            int[] var51 = class94.field1398;
                                            for (int var52 = 0; var52 < var50; var52++) {
                                                class73 var53 = field965[var51[var52]];
                                                if (var53 != null && var47 != var53 && var47.field1175 == var53.field1175 && var47.field1138 == var53.field1138) {
                                                    method41(var53, var51[var52], var32, var33);
                                                }
                                            }
                                        }
                                        if (field891 == var35) {
                                            var28 = var31;
                                        } else {
                                            method41(var47, var35, var32, var33);
                                        }
                                    }
                                    if (var34 == 3) {
                                        class218 var54 = field886[Statics.field3841][var32][var33];
                                        if (var54 != null) {
                                            for (class93 var55 = (class93) var54.method3734(); var55 != null; var55 = (class93) var54.method3744()) {
                                                class284 var56 = class284.method1694(var55.field1391);
                                                if (field1002 == 1) {
                                                    method3034(class252.field3062, field1003 + " " + class87.field1298 + " " + class87.method501(16748608) + var56.field3656, 16, var55.field1391, var32, var33);
                                                } else if (!field934) {
                                                    String[] var57 = var56.field3655;
                                                    for (int var58 = 4; var58 >= 0; var58--) {
                                                        if (var57 != null && var57[var58] != null) {
                                                            byte var59 = 0;
                                                            if (var58 == 0) {
                                                                var59 = 18;
                                                            }
                                                            if (var58 == 1) {
                                                                var59 = 19;
                                                            }
                                                            if (var58 == 2) {
                                                                var59 = 20;
                                                            }
                                                            if (var58 == 3) {
                                                                var59 = 21;
                                                            }
                                                            if (var58 == 4) {
                                                                var59 = 22;
                                                            }
                                                            method3034(var57[var58], class87.method501(16748608) + var56.field3656, var59, var55.field1391, var32, var33);
                                                        } else if (var58 == 2) {
                                                            method3034(class252.field3022, class87.method501(16748608) + var56.field3656, 20, var55.field1391, var32, var33);
                                                        }
                                                    }
                                                    method3034(class252.field3173, class87.method501(16748608) + var56.field3656, 1004, var55.field1391, var32, var33);
                                                } else if ((Statics.field2101 & 0x1) == 1) {
                                                    method3034(field1007, field1075 + " " + class87.field1298 + " " + class87.method501(16748608) + var56.field3656, 17, var55.field1391, var32, var33);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var28 != -1) {
                                int var60 = var28 & 0x7F;
                                int var61 = var28 >> 7 & 0x7F;
                                class73 var62 = field965[field891];
                                method41(var62, field891, var60, var61);
                            }
                        }
                    } else if (var9.field2822 == 1338) {
                        method35(var9, var11, var12);
                    } else {
                        if (var9.field2822 == 1400) {
                            Statics.field3306.method5547(class61.field685, class61.field686, var27, var11, var12, var9.field2833, var9.field2834);
                        }
                        if (!field985 && var27) {
                            if (var9.field2822 == 1400) {
                                Statics.field3306.method5636(var11, var12, var9.field2833, var9.field2834, var25, var26);
                            } else {
                                Statics.method1872(var9, var25 - var11, var26 - var12);
                            }
                        }
                        if (var9.field2820 == 0) {
                            if (!var9.field2846) {
                                boolean var63 = var9.field2838;
                                if (var63 && Statics.field378 != var9) {
                                    continue;
                                }
                            }
                            method3203(arg0, var9.field2929, var13, var14, var15, var16, var11 - var9.field2857, var12 - var9.field2829);
                            if (var9.field2898 != null) {
                                method3203(var9.field2898, var9.field2929, var13, var14, var15, var16, var11 - var9.field2857, var12 - var9.field2829);
                            }
                            class68 var64 = (class68) field1010.method3677((long) var9.field2929);
                            if (var64 != null) {
                                if (var64.field775 == 0 && class61.field685 >= var13 && class61.field686 >= var14 && class61.field685 < var15 && class61.field686 < var16 && !field985) {
                                    for (class69 var65 = (class69) field1046.method3731(); var65 != null; var65 = (class69) field1046.method3733()) {
                                        if (var65.field784) {
                                            var65.method3721();
                                            var65.field791.field2943 = false;
                                        }
                                    }
                                    if (Statics.field447 == 0) {
                                        field1020 = null;
                                        field1021 = null;
                                    }
                                    if (!field985) {
                                        method67();
                                    }
                                }
                                int var66 = var64.field778;
                                if (class243.method1894(var66)) {
                                    method3203(Statics.field2810[var66], -1, var13, var14, var15, var16, var11, var12);
                                }
                            }
                        }
                        if (var9.field2846) {
                            if (var9.field2951) {
                                if (class61.field685 >= var13 && class61.field686 >= var14 && class61.field685 < var15 && class61.field686 < var16) {
                                    for (class69 var67 = (class69) field1046.method3731(); var67 != null; var67 = (class69) field1046.method3733()) {
                                        if (var67.field784) {
                                            var67.method3721();
                                            var67.field791.field2943 = false;
                                        }
                                    }
                                    if (Statics.field447 == 0) {
                                        field1020 = null;
                                        field1021 = null;
                                    }
                                    if (!field985) {
                                        method67();
                                    }
                                }
                            } else if (var9.field2952 && class61.field685 >= var13 && class61.field686 >= var14 && class61.field685 < var15 && class61.field686 < var16) {
                                for (class69 var68 = (class69) field1046.method3731(); var68 != null; var68 = (class69) field1046.method3733()) {
                                    if (var68.field784 && var68.field791.field2928 == var68.field788) {
                                        var68.method3721();
                                    }
                                }
                            }
                            boolean var69;
                            if (class61.field685 >= var13 && class61.field686 >= var14 && class61.field685 < var15 && class61.field686 < var16) {
                                var69 = true;
                            } else {
                                var69 = false;
                            }
                            boolean var70 = false;
                            if ((class61.field684 == 1 || !Statics.field2112 && class61.field684 == 4) && var69) {
                                var70 = true;
                            }
                            boolean var71 = false;
                            if ((class61.field679 == 1 || !Statics.field2112 && class61.field679 == 4) && class61.field692 >= var13 && class61.field693 >= var14 && class61.field692 < var15 && class61.field693 < var16) {
                                var71 = true;
                            }
                            if (var71) {
                                method495(var9, class61.field692 - var11, class61.field693 - var12);
                            }
                            if (var9.field2822 == 1400) {
                                Statics.field3306.method5678(var25, var26, var69 & var70, var69 & var71);
                            }
                            if (field1020 != null && field1020 != var9 && var69) {
                                int var72 = Statics.method78(var9);
                                boolean var73 = (var72 >> 20 & 0x1) != 0;
                                if (var73) {
                                    field952 = var9;
                                }
                            }
                            if (field1021 == var9) {
                                field1025 = true;
                                field1026 = var11;
                                field1099 = var12;
                            }
                            if (var9.field2879) {
                                if (var69 && field1045 != 0 && var9.field2928 != null) {
                                    class69 var74 = new class69();
                                    var74.field784 = true;
                                    var74.field791 = var9;
                                    var74.field790 = field1045;
                                    var74.field788 = var9.field2928;
                                    field1046.method3759(var74);
                                }
                                if (field1020 != null || Statics.field575 != null || field985) {
                                    var71 = false;
                                    var70 = false;
                                    var69 = false;
                                }
                                if (!var9.field2876 && var71) {
                                    var9.field2876 = true;
                                    if (var9.field2900 != null) {
                                        class69 var75 = new class69();
                                        var75.field784 = true;
                                        var75.field791 = var9;
                                        var75.field783 = class61.field692 - var11;
                                        var75.field790 = class61.field693 - var12;
                                        var75.field788 = var9.field2900;
                                        field1046.method3759(var75);
                                    }
                                }
                                if (var9.field2876 && var70 && var9.field2901 != null) {
                                    class69 var76 = new class69();
                                    var76.field784 = true;
                                    var76.field791 = var9;
                                    var76.field783 = class61.field685 - var11;
                                    var76.field790 = class61.field686 - var12;
                                    var76.field788 = var9.field2901;
                                    field1046.method3759(var76);
                                }
                                if (var9.field2876 && !var70) {
                                    var9.field2876 = false;
                                    if (var9.field2902 != null) {
                                        class69 var77 = new class69();
                                        var77.field784 = true;
                                        var77.field791 = var9;
                                        var77.field783 = class61.field685 - var11;
                                        var77.field790 = class61.field686 - var12;
                                        var77.field788 = var9.field2902;
                                        field1048.method3759(var77);
                                    }
                                }
                                if (var70 && var9.field2903 != null) {
                                    class69 var78 = new class69();
                                    var78.field784 = true;
                                    var78.field791 = var9;
                                    var78.field783 = class61.field685 - var11;
                                    var78.field790 = class61.field686 - var12;
                                    var78.field788 = var9.field2903;
                                    field1046.method3759(var78);
                                }
                                if (!var9.field2943 && var69) {
                                    var9.field2943 = true;
                                    if (var9.field2904 != null) {
                                        class69 var79 = new class69();
                                        var79.field784 = true;
                                        var79.field791 = var9;
                                        var79.field783 = class61.field685 - var11;
                                        var79.field790 = class61.field686 - var12;
                                        var79.field788 = var9.field2904;
                                        field1046.method3759(var79);
                                    }
                                }
                                if (var9.field2943 && var69 && var9.field2905 != null) {
                                    class69 var80 = new class69();
                                    var80.field784 = true;
                                    var80.field791 = var9;
                                    var80.field783 = class61.field685 - var11;
                                    var80.field790 = class61.field686 - var12;
                                    var80.field788 = var9.field2905;
                                    field1046.method3759(var80);
                                }
                                if (var9.field2943 && !var69) {
                                    var9.field2943 = false;
                                    if (var9.field2906 != null) {
                                        class69 var81 = new class69();
                                        var81.field784 = true;
                                        var81.field791 = var9;
                                        var81.field783 = class61.field685 - var11;
                                        var81.field790 = class61.field686 - var12;
                                        var81.field788 = var9.field2906;
                                        field1048.method3759(var81);
                                    }
                                }
                                if (var9.field2917 != null) {
                                    class69 var82 = new class69();
                                    var82.field791 = var9;
                                    var82.field788 = var9.field2917;
                                    field1047.method3759(var82);
                                }
                                if (var9.field2911 != null && field1034 > var9.field2946) {
                                    if (var9.field2912 == null || field1034 - var9.field2946 > 32) {
                                        class69 var87 = new class69();
                                        var87.field791 = var9;
                                        var87.field788 = var9.field2911;
                                        field1046.method3759(var87);
                                    } else {
                                        label820: for (int var83 = var9.field2946; var83 < field1034; var83++) {
                                            int var84 = field1033[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2912.length; var85++) {
                                                if (var9.field2912[var85] == var84) {
                                                    class69 var86 = new class69();
                                                    var86.field791 = var9;
                                                    var86.field788 = var9.field2911;
                                                    field1046.method3759(var86);
                                                    break label820;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2946 = field1034;
                                }
                                if (var9.field2889 != null && field1036 > var9.field2947) {
                                    if (var9.field2914 == null || field1036 - var9.field2947 > 32) {
                                        class69 var92 = new class69();
                                        var92.field791 = var9;
                                        var92.field788 = var9.field2889;
                                        field1046.method3759(var92);
                                    } else {
                                        label796: for (int var88 = var9.field2947; var88 < field1036; var88++) {
                                            int var89 = field1035[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2914.length; var90++) {
                                                if (var9.field2914[var90] == var89) {
                                                    class69 var91 = new class69();
                                                    var91.field791 = var9;
                                                    var91.field788 = var9.field2889;
                                                    field1046.method3759(var91);
                                                    break label796;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2947 = field1036;
                                }
                                if (var9.field2915 != null && field1038 > var9.field2948) {
                                    if (var9.field2916 == null || field1038 - var9.field2948 > 32) {
                                        class69 var97 = new class69();
                                        var97.field791 = var9;
                                        var97.field788 = var9.field2915;
                                        field1046.method3759(var97);
                                    } else {
                                        label772: for (int var93 = var9.field2948; var93 < field1038; var93++) {
                                            int var94 = field895[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var9.field2916.length; var95++) {
                                                if (var9.field2916[var95] == var94) {
                                                    class69 var96 = new class69();
                                                    var96.field791 = var9;
                                                    var96.field788 = var9.field2915;
                                                    field1046.method3759(var96);
                                                    break label772;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2948 = field1038;
                                }
                                if (field1039 > var9.field2945 && var9.field2920 != null) {
                                    class69 var98 = new class69();
                                    var98.field791 = var9;
                                    var98.field788 = var9.field2920;
                                    field1046.method3759(var98);
                                }
                                if (field1040 > var9.field2945 && var9.field2922 != null) {
                                    class69 var99 = new class69();
                                    var99.field791 = var9;
                                    var99.field788 = var9.field2922;
                                    field1046.method3759(var99);
                                }
                                if (field893 > var9.field2945 && var9.field2923 != null) {
                                    class69 var100 = new class69();
                                    var100.field791 = var9;
                                    var100.field788 = var9.field2923;
                                    field1046.method3759(var100);
                                }
                                if (field1058 > var9.field2945 && var9.field2874 != null) {
                                    class69 var101 = new class69();
                                    var101.field791 = var9;
                                    var101.field788 = var9.field2874;
                                    field1046.method3759(var101);
                                }
                                if (field914 > var9.field2945 && var9.field2821 != null) {
                                    class69 var102 = new class69();
                                    var102.field791 = var9;
                                    var102.field788 = var9.field2821;
                                    field1046.method3759(var102);
                                }
                                if (field982 > var9.field2945 && var9.field2924 != null) {
                                    class69 var103 = new class69();
                                    var103.field791 = var9;
                                    var103.field788 = var9.field2924;
                                    field1046.method3759(var103);
                                }
                                var9.field2945 = field1032;
                                if (var9.field2921 != null) {
                                    for (int var104 = 0; var104 < field870; var104++) {
                                        class69 var105 = new class69();
                                        var105.field791 = var9;
                                        var105.field781 = field1070[var104];
                                        var105.field782 = field1069[var104];
                                        var105.field788 = var9.field2921;
                                        field1046.method3759(var105);
                                    }
                                }
                            }
                        }
                        if (!var9.field2846 && field1020 == null && Statics.field575 == null && !field985) {
                            if ((var9.field2933 >= 0 || var9.field2845 != 0) && class61.field685 >= var13 && class61.field686 >= var14 && class61.field685 < var15 && class61.field686 < var16) {
                                if (var9.field2933 >= 0) {
                                    Statics.field378 = arg0[var9.field2933];
                                } else {
                                    Statics.field378 = var9;
                                }
                            }
                            if (var9.field2820 == 8 && class61.field685 >= var13 && class61.field686 >= var14 && class61.field685 < var15 && class61.field686 < var16) {
                                Statics.field3372 = var9;
                            }
                            if (var9.field2878 > var9.field2834) {
                                int var106 = var9.field2833 + var11;
                                int var107 = var9.field2834;
                                int var108 = var9.field2878;
                                int var109 = class61.field685;
                                int var110 = class61.field686;
                                if (field916) {
                                    field1019 = 32;
                                } else {
                                    field1019 = 0;
                                }
                                field916 = false;
                                if (class61.field684 == 1 || !Statics.field2112 && class61.field684 == 4) {
                                    if (var109 >= var106 && var109 < var106 + 16 && var110 >= var12 && var110 < var12 + 16) {
                                        var9.field2829 -= 4;
                                        method942(var9);
                                    } else if (var109 >= var106 && var109 < var106 + 16 && var110 >= var12 + var107 - 16 && var110 < var12 + var107) {
                                        var9.field2829 += 4;
                                        method942(var9);
                                    } else if (var109 >= var106 - field1019 && var109 < field1019 + var106 + 16 && var110 >= var12 + 16 && var110 < var12 + var107 - 16) {
                                        int var111 = (var107 - 32) * var107 / var108;
                                        if (var111 < 8) {
                                            var111 = 8;
                                        }
                                        int var112 = var110 - var12 - 16 - var111 / 2;
                                        int var113 = var107 - 32 - var111;
                                        var9.field2829 = (var108 - var107) * var112 / var113;
                                        method942(var9);
                                        field916 = true;
                                    }
                                }
                                if (field1045 != 0) {
                                    int var114 = var9.field2833;
                                    if (var109 >= var106 - var114 && var110 >= var12 && var109 < var106 + 16 && var110 <= var12 + var107) {
                                        var9.field2829 += field1045 * 45;
                                        method942(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.iz(IIB)V")
    public static final void method44(int arg0, int arg1) {
        if (class243.method1894(arg0)) {
            method3015(Statics.field2810[arg0], arg1);
        }
    }

    @ObfuscatedName("fh.il([Lig;II)V")
    public static final void method3015(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2820 == 0) {
                    if (var3.field2898 != null) {
                        method3015(var3.field2898, arg1);
                    }
                    class68 var4 = (class68) field1010.method3677((long) var3.field2929);
                    if (var4 != null) {
                        method44(var4.field778, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2925 != null) {
                    class69 var5 = new class69();
                    var5.field791 = var3;
                    var5.field788 = var3.field2925;
                    class82.method187(var5, 500000);
                }
                if (arg1 == 1 && var3.field2926 != null) {
                    if (var3.field2859 >= 0) {
                        class243 var6 = class243.method3168(var3.field2929);
                        if (var6 == null || var6.field2898 == null || var3.field2859 >= var6.field2898.length || var6.field2898[var3.field2859] != var3) {
                            continue;
                        }
                    }
                    class69 var7 = new class69();
                    var7.field791 = var3;
                    var7.field788 = var3.field2926;
                    class82.method187(var7, 500000);
                }
            }
        }
    }

    @ObfuscatedName("au.iu(Lig;IIB)V")
    public static final void method495(class243 arg0, int arg1, int arg2) {
        if (field1020 != null || field985 || arg0 == null || method2115(arg0) == null) {
            return;
        }
        field1020 = arg0;
        field1021 = method2115(arg0);
        field1022 = arg1;
        field1016 = arg2;
        Statics.field447 = 0;
        field859 = false;
        int var3 = field977 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field419 = new class88();
        Statics.field419.field1312 = field987[var3];
        Statics.field419.field1307 = field988[var3];
        Statics.field419.field1308 = field1041[var3];
        Statics.field419.field1309 = field922[var3];
        Statics.field419.field1306 = field991[var3];
    }

    @ObfuscatedName("client.in(I)V")
    public final void method1300() {
        method942(field1020);
        Statics.field447++;
        if (field1096 && field1025) {
            int var1 = class61.field685;
            int var2 = class61.field686;
            int var3 = var1 - field1022;
            int var4 = var2 - field1016;
            if (var3 < field1026) {
                var3 = field1026;
            }
            if (field1020.field2833 + var3 > field1026 + field1021.field2833) {
                var3 = field1026 + field1021.field2833 - field1020.field2833;
            }
            if (var4 < field1099) {
                var4 = field1099;
            }
            if (field1020.field2834 + var4 > field1099 + field1021.field2834) {
                var4 = field1099 + field1021.field2834 - field1020.field2834;
            }
            int var5 = var3 - field1029;
            int var6 = var4 - field945;
            int var7 = field1020.field2818;
            if (Statics.field447 > field1020.field2895 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field859 = true;
            }
            int var8 = field1021.field2857 + (var3 - field1026);
            int var9 = field1021.field2829 + (var4 - field1099);
            if (field1020.field2907 != null && field859) {
                class69 var10 = new class69();
                var10.field791 = field1020;
                var10.field783 = var8;
                var10.field790 = var9;
                var10.field788 = field1020.field2907;
                class82.method187(var10, 500000);
            }
            if (class61.field684 == 0) {
                if (field859) {
                    if (field1020.field2908 != null) {
                        class69 var11 = new class69();
                        var11.field791 = field1020;
                        var11.field783 = var8;
                        var11.field790 = var9;
                        var11.field786 = field952;
                        var11.field788 = field1020.field2908;
                        class82.method187(var11, 500000);
                    }
                    if (field952 != null && method2969(field1020) != null) {
                        class185 var12 = class185.method343(class182.field2423, field1073.field1457);
                        var12.field2478.method3323(field1020.field2938);
                        var12.field2478.method3272(field952.field2859);
                        var12.field2478.method3223(field1020.field2929);
                        var12.field2478.method3281(field952.field2929);
                        var12.field2478.method3272(field1020.field2859);
                        var12.field2478.method3323(field952.field2938);
                        field1073.method1916(var12);
                    }
                } else if (this.method1156()) {
                    this.method1214(field1029 + field1022, field945 + field1016);
                } else if (field977 > 0) {
                    Statics.method2900(field1029 + field1022, field945 + field1016);
                }
                field1020 = null;
            }
        } else if (Statics.field447 > 1) {
            field1020 = null;
        }
    }

    @ObfuscatedName("bh.jk(Lig;I)V")
    public static void method942(class243 arg0) {
        if (field1027 == arg0.field2950) {
            field1052[arg0.field2949] = true;
        }
    }

    @ObfuscatedName("an.jc(I)V")
    public static void method510() {
        for (class68 var0 = (class68) field1010.method3667(); var0 != null; var0 = (class68) field1010.method3672()) {
            int var1 = var0.field778;
            if (class243.method1894(var1)) {
                boolean var2 = true;
                class243[] var3 = Statics.field2810[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2846;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2636;
                    class243 var6 = class243.method3168(var5);
                    if (var6 != null) {
                        method942(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.jt(Lig;I)Lig;")
    public static class243 method2115(class243 arg0) {
        class243 var1 = method2969(arg0);
        if (var1 == null) {
            var1 = arg0.field2893;
        }
        return var1;
    }

    @ObfuscatedName("r.ju([Lig;II)V")
    public static final void method171(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null && var3.field2837 == arg1) {
                if (var3.field2846) {
                    boolean var4 = var3.field2838;
                    if (var4) {
                        continue;
                    }
                }
                if (var3.field2820 == 0) {
                    if (!var3.field2846) {
                        boolean var5 = var3.field2838;
                        if (var5 && Statics.field378 != var3) {
                            continue;
                        }
                    }
                    method171(arg0, var3.field2929);
                    if (var3.field2898 != null) {
                        method171(var3.field2898, var3.field2929);
                    }
                    class68 var6 = (class68) field1010.method3677((long) var3.field2929);
                    if (var6 != null) {
                        int var7 = var6.field778;
                        if (class243.method1894(var7)) {
                            method171(Statics.field2810[var7], -1);
                        }
                    }
                }
                if (var3.field2820 == 6) {
                    if (var3.field2839 != -1 || var3.field2866 != -1) {
                        boolean var8 = Statics.method776(var3);
                        int var9;
                        if (var8) {
                            var9 = var3.field2866;
                        } else {
                            var9 = var3.field2839;
                        }
                        if (var9 != -1) {
                            class288 var10 = class288.method2932(var9);
                            var3.field2941 += field911;
                            while (var3.field2941 > var10.field3762[var3.field2940]) {
                                var3.field2941 -= var10.field3762[var3.field2940];
                                var3.field2940++;
                                if (var3.field2940 >= var10.field3760.length) {
                                    var3.field2940 -= var10.field3764;
                                    if (var3.field2940 < 0 || var3.field2940 >= var10.field3760.length) {
                                        var3.field2940 = 0;
                                    }
                                }
                                method942(var3);
                            }
                        }
                    }
                    if (var3.field2816 != 0 && !var3.field2846) {
                        int var11 = var3.field2816 >> 16;
                        int var12 = var3.field2816 << 16 >> 16;
                        int var13 = field911 * var11;
                        int var14 = field911 * var12;
                        var3.field2869 = var3.field2869 + var13 & 0x7FF;
                        var3.field2819 = var3.field2819 + var14 & 0x7FF;
                        method942(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.jg(II)V")
    public static final void method15(int arg0) {
        method510();
        for (class81 var1 = (class81) class81.field1241.method3731(); var1 != null; var1 = (class81) class81.field1241.method3733()) {
            if (var1.field1251 != null) {
                var1.method1653();
            }
        }
        int var2 = class269.method1161(arg0).field3450;
        if (var2 == 0) {
            return;
        }
        int var3 = class238.field2771[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class135.method2562(0.9D);
                ((class124) Statics.field1932).method2347(0.9D);
            }
            if (var3 == 2) {
                class135.method2562(0.8D);
                ((class124) Statics.field1932).method2347(0.8D);
            }
            if (var3 == 3) {
                class135.method2562(0.7D);
                ((class124) Statics.field1932).method2347(0.7D);
            }
            if (var3 == 4) {
                class135.method2562(0.6D);
                ((class124) Statics.field1932).method2347(0.6D);
            }
            class284.field3653.method3632();
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
            if (field1080 != var4) {
                if (field1080 == 0 && field1081 != -1) {
                    class230.method1527(Statics.field3547, field1081, 0, var4, false);
                    field957 = false;
                } else if (var4 == 0) {
                    class230.method1013();
                    field957 = false;
                } else {
                    class230.method3536(var4);
                }
                field1080 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field900 = 127;
            }
            if (var3 == 1) {
                field900 = 96;
            }
            if (var3 == 2) {
                field900 = 64;
            }
            if (var3 == 3) {
                field900 = 32;
            }
            if (var3 == 4) {
                field900 = 0;
            }
        }
        if (var2 == 5) {
            field1023 = var3;
        }
        if (var2 == 6) {
            field1011 = var3;
        }
        if (var2 == 9) {
            field1012 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1084 = 127;
            }
            if (var3 == 1) {
                field1084 = 96;
            }
            if (var3 == 2) {
                field1084 = 64;
            }
            if (var3 == 3) {
                field1084 = 32;
            }
            if (var3 == 4) {
                field1084 = 0;
            }
        }
        if (var2 == 17) {
            field1017 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field875 = (class90) class190.method241(class90.method3834(), var3);
            if (field875 == null) {
                field875 = class90.field1319;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field891 = -1;
            } else {
                field891 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field876 = (class90) class190.method241(class90.method3834(), var3);
            if (field876 == null) {
                field876 = class90.field1319;
            }
        }
    }

    @ObfuscatedName("ej.jo(IIIB)Lbz;")
    public static final class68 method2553(int arg0, int arg1, int arg2) {
        class68 var3 = new class68();
        var3.field778 = arg1;
        var3.field775 = arg2;
        field1010.method3669(var3, (long) arg0);
        if (class243.method1894(arg1)) {
            class243[] var4 = Statics.field2810[arg1];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class243 var6 = var4[var5];
                if (var6 != null) {
                    var6.field2940 = 0;
                    var6.field2941 = 0;
                }
            }
        }
        class243 var7 = class243.method3168(arg0);
        method942(var7);
        if (field1013 != null) {
            method942(field1013);
            field1013 = null;
        }
        for (int var8 = 0; var8 < field977; var8++) {
            int var9 = field1041[var8];
            boolean var10 = var9 == 57 || var9 == 58 || var9 == 1007 || var9 == 25 || var9 == 30;
            if (var10) {
                if (var8 < field977 - 1) {
                    for (int var11 = var8; var11 < field977 - 1; var11++) {
                        field991[var11] = field991[var11 + 1];
                        field992[var11] = field992[var11 + 1];
                        field1041[var11] = field1041[var11 + 1];
                        field922[var11] = field922[var11 + 1];
                        field987[var11] = field987[var11 + 1];
                        field988[var11] = field988[var11 + 1];
                        field974[var11] = field974[var11 + 1];
                    }
                }
                field977--;
            }
        }
        method940(Statics.field2810[arg0 >> 16], var7, false);
        class82.method273(arg1);
        if (field1009 != -1) {
            method44(field1009, 1);
        }
        return var3;
    }

    @ObfuscatedName("ag.ja(Lig;I)Z")
    public static final boolean method581(class243 arg0) {
        int var1 = arg0.field2822;
        if (var1 == 205) {
            field1037 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1110.method4066(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1110.method4058(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1110.method4057(false);
        }
        if (var1 == 325) {
            field1110.method4057(true);
        }
        if (var1 == 326) {
            class185 var6 = class185.method343(class182.field2388, field1073.field1457);
            field1110.method4060(var6.field2478);
            field1073.method1916(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.jn(IIIILla;Liq;B)V")
    public static final void method8(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method37(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field919 & 0x7FF;
        int var8 = class135.field1935[var7];
        int var9 = class135.field1936[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2767 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field559.method5416(arg5.field2767 / 2 + arg0 - var17 / 2 + var15, arg5.field2768 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("p.jj(IIIILla;Liq;I)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field919 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class135.field1935[var6];
        int var9 = class135.field1936[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5414(arg5.field2767 / 2 + var10 - arg4.field3988 / 2, arg5.field2768 / 2 - var11 - arg4.field3983 / 2, arg0, arg1, arg5.field2767, arg5.field2768, arg5.field2766, arg5.field2765);
        } else {
            arg4.method5445(arg5.field2767 / 2 + arg0 + var10 - arg4.field3988 / 2, arg5.field2768 / 2 + arg1 - var11 - arg4.field3983 / 2);
        }
    }

    @ObfuscatedName("bf.jq(I)V")
    public static final void method1052() {
        for (int var0 = 0; var0 < class94.field1397; var0++) {
            class73 var1 = field965[class94.field1398[var0]];
            var1.method1092();
        }
        class96.method215();
        if (Statics.field616 != null) {
            Statics.field616.method5031();
        }
    }

    @ObfuscatedName("i.jz(I)V")
    public static final void method4() {
        for (int var0 = 0; var0 < class94.field1397; var0++) {
            class73 var1 = field965[class94.field1398[var0]];
            var1.method1095();
        }
    }

    @ObfuscatedName("ak.jw(B)V")
    public static final void method673() {
        field1040 = field1032;
    }

    @ObfuscatedName("gx.js(I)V")
    public static final void method3544() {
        field893 = field1032;
        Statics.field727 = true;
    }

    @ObfuscatedName("bq.jf(Ljava/lang/String;I)V")
    public static final void method1039(String arg0) {
        if (Statics.field616 != null) {
            class185 var1 = class185.method343(class182.field2425, field1073.field1457);
            var1.field2478.method3220(class195.method126(arg0));
            var1.field2478.method3232(arg0);
            field1073.method1916(var1);
        }
    }

    @ObfuscatedName("cy.jb(B)V")
    public static final void method1849() {
        class185 var0 = class185.method343(class182.field2429, field1073.field1457);
        var0.field2478.method3220(0);
        field1073.method1916(var0);
    }

    @ObfuscatedName("ao.jx(II)V")
    public static void method217(int arg0) {
        for (class224 var1 = (class224) field896.method3667(); var1 != null; var1 = (class224) field896.method3672()) {
            if ((long) arg0 == (var1.field2636 >> 48 & 0xFFFFL)) {
                var1.method3721();
            }
        }
    }

    @ObfuscatedName("ft.jp(Lig;B)Lig;")
    public static class243 method2969(class243 arg0) {
        int var1 = class244.method112(Statics.method78(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class243.method3168(arg0.field2837);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("f.jl(Lig;I)Ljava/lang/String;")
    public static String method160(class243 arg0) {
        int var1 = Statics.method78(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2831 == null || arg0.field2831.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2831;
        }
    }

    @ObfuscatedName("ki.jv(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method4836(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field907 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field907 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field907 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field907 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field907 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1387 != null) {
            var3 = "/p=" + Statics.field1387;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field856 + "/a=" + Statics.field3559 + var3 + "/";
    }

    @ObfuscatedName("gc.jh(Ljava/lang/String;ZI)V")
    public static void method3473(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field285; var5++) {
            class284 var6 = class284.method1694(var5);
            if ((!arg1 || var6.field3696) && var6.field3688 == -1 && var6.field3656.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1570 = -1;
                    Statics.field577 = null;
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
        Statics.field577 = var3;
        Statics.field251 = 0;
        Statics.field1570 = var4;
        String[] var9 = new String[Statics.field1570];
        for (int var10 = 0; var10 < Statics.field1570; var10++) {
            var9[var10] = class284.method1694(var3[var10]).field3656;
        }
        short[] var11 = Statics.field577;
        class192.method1756(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("iu.je([BII)V")
    public static void method4182(byte[] arg0, int arg1) {
        if (field889 == null) {
            field889 = new byte[24];
        }
        class206.method3546(arg0, arg1, field889, 0, 24);
    }

    @ObfuscatedName("h.jy(Lgb;II)V")
    public static void method176(class195 arg0, int arg1) {
        method4182(arg0.field2544, arg1);
        if (class168.field2175 == null) {
            return;
        }
        try {
            class168.field2175.method2290(0L);
            class168.field2175.method2309(arg0.field2544, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("e.jm(Lgb;I)V")
    public static void method20(class195 arg0) {
        if (field889 != null) {
            arg0.method3230(field889, 0, field889.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class168.field2175.method2290(0L);
            class168.field2175.method2292(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var7) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method3230(var1, 0, var1.length);
    }

    @ObfuscatedName("client.jd(B)Lkb;")
    public class306 method1165() {
        return Statics.field434 == null ? null : Statics.field434.field820;
    }

    @ObfuscatedName("de.kw(IIIZB)V")
    public static void method2322(int arg0, int arg1, int arg2, boolean arg3) {
        class185 var4 = class185.method343(class182.field2416, field1073.field1457);
        var4.field2478.method3269(arg1);
        var4.field2478.method3318(arg2);
        var4.field2478.method3323(arg0);
        var4.field2478.method3281(arg3 ? field931 : 0);
        field1073.method1916(var4);
    }

    @ObfuscatedName("at.kf(II)V")
    public static void method531(int arg0) {
        field924 = arg0;
    }

    @ObfuscatedName("o.kk(I)V")
    public static void method47() {
        field1073.method1916(class185.method343(class182.field2390, field1073.field1457));
        field924 = 0;
    }

    @ObfuscatedName("bx.ka(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method1046(String arg0) {
        class257[] var1 = new class257[] { class257.field3342, class257.field3346, class257.field3345, class257.field3343, class257.field3341, class257.field3344 };
        class257[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class257 var4 = var2[var3];
            if (var4.field3347 != -1 && arg0.startsWith(class87.method2928(var4.field3347))) {
                arg0 = arg0.substring(6 + Integer.toString(var4.field3347).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ab.ko(B)V")
    public static void method678() {
        if (Statics.field1468 == null) {
            return;
        }
        field1115 = field1108;
        Statics.field1468.method4342();
        for (int var0 = 0; var0 < field965.length; var0++) {
            if (field965[var0] != null) {
                Statics.field1468.method4355((field965[var0].field1175 >> 7) + Statics.field494, (field965[var0].field1138 >> 7) + Statics.field2794);
            }
        }
    }
}

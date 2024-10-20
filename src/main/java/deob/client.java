package deob;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class167[] field928 = new class167[4];

    @ObfuscatedName("client.ar")
    public static boolean field903 = true;

    @ObfuscatedName("client.bg")
    public static int field874 = 1;

    @ObfuscatedName("client.bq")
    public static int field1126 = 0;

    @ObfuscatedName("client.by")
    public static int field995 = 0;

    @ObfuscatedName("client.bd")
    public static boolean field875 = false;

    @ObfuscatedName("client.bi")
    public static boolean field879 = false;

    @ObfuscatedName("client.bo")
    public static int field972 = 0;

    @ObfuscatedName("client.ba")
    public static int field880 = 0;

    @ObfuscatedName("client.bw")
    public static boolean field882 = true;

    @ObfuscatedName("client.bp")
    public static int field883 = 0;

    @ObfuscatedName("client.bn")
    public static long field884 = 1L;

    @ObfuscatedName("client.bv")
    public static int field885 = -1;

    @ObfuscatedName("client.bs")
    public static int field1022 = -1;

    @ObfuscatedName("client.bh")
    public static int field1031 = -1;

    @ObfuscatedName("client.bf")
    public static boolean field888 = true;

    @ObfuscatedName("client.bb")
    public static boolean field889 = false;

    @ObfuscatedName("client.br")
    public static int field890 = 0;

    @ObfuscatedName("client.bc")
    public static int field943 = 0;

    @ObfuscatedName("client.bm")
    public static int field905 = 0;

    @ObfuscatedName("client.cj")
    public static int field878 = 0;

    @ObfuscatedName("client.ch")
    public static int field894 = 0;

    @ObfuscatedName("client.ck")
    public static int field1074 = 0;

    @ObfuscatedName("client.cl")
    public static int field896 = 0;

    @ObfuscatedName("client.cd")
    public static int field897 = 0;

    @ObfuscatedName("client.cs")
    public static int field1025 = 0;

    @ObfuscatedName("client.cq")
    public static class91 field899 = class91.field1335;

    @ObfuscatedName("client.cx")
    public static class91 field947 = class91.field1335;

    @ObfuscatedName("client.cf")
    public static int field935 = 0;

    @ObfuscatedName("client.cz")
    public static int field902 = 0;

    @ObfuscatedName("client.cy")
    public static int field887 = 0;

    @ObfuscatedName("client.de")
    public static int field1076 = 0;

    @ObfuscatedName("client.df")
    public static int field873 = 0;

    @ObfuscatedName("client.da")
    public static int field906 = 0;

    @ObfuscatedName("client.dv")
    public static int field907 = 0;

    @ObfuscatedName("client.dc")
    public static int field908 = 0;

    @ObfuscatedName("client.dt")
    public static class151 field909 = class151.field2108;

    @ObfuscatedName("client.dm")
    public static byte[] field1122 = null;

    @ObfuscatedName("client.dh")
    public static class86[] field1110 = new class86[32768];

    @ObfuscatedName("client.dl")
    public static int field1049 = 0;

    @ObfuscatedName("client.ds")
    public static int[] field913 = new int[32768];

    @ObfuscatedName("client.dz")
    public static int field914 = 0;

    @ObfuscatedName("client.eu")
    public static int[] field915 = new int[250];

    @ObfuscatedName("client.ex")
    public static final class101 field916 = new class101();

    @ObfuscatedName("client.ef")
    public static int field1085 = 0;

    @ObfuscatedName("client.eg")
    public static boolean field1011 = false;

    @ObfuscatedName("client.ei")
    public static boolean field919 = true;

    @ObfuscatedName("client.eh")
    public static class288 field895 = new class288();

    @ObfuscatedName("client.eq")
    public static HashMap field921 = new HashMap();

    @ObfuscatedName("client.em")
    public static int field922 = 0;

    @ObfuscatedName("client.ez")
    public static int field923 = 1;

    @ObfuscatedName("client.ec")
    public static int field924 = 0;

    @ObfuscatedName("client.ey")
    public static int field925 = 1;

    @ObfuscatedName("client.et")
    public static int field1053 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field929 = false;

    @ObfuscatedName("client.fv")
    public static int[][][] field1119 = new int[4][13][13];

    @ObfuscatedName("client.fp")
    public static final int[] field931 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fo")
    public static int field945 = 0;

    @ObfuscatedName("client.fb")
    public static int field1088 = 2301979;

    @ObfuscatedName("client.fg")
    public static int field934 = 5063219;

    @ObfuscatedName("client.gk")
    public static int field1009 = 3353893;

    @ObfuscatedName("client.gp")
    public static int field936 = 7759444;

    @ObfuscatedName("client.gv")
    public static boolean field937 = false;

    @ObfuscatedName("client.gg")
    public static int field938 = 0;

    @ObfuscatedName("client.gz")
    public static int field1093 = 128;

    @ObfuscatedName("client.gc")
    public static int field940 = 0;

    @ObfuscatedName("client.gq")
    public static int field1080 = 0;

    @ObfuscatedName("client.gy")
    public static int field942 = 0;

    @ObfuscatedName("client.gh")
    public static int field892 = 0;

    @ObfuscatedName("client.gu")
    public static int field997 = 0;

    @ObfuscatedName("client.gb")
    public static int field1024 = 50;

    @ObfuscatedName("client.ga")
    public static int field1120 = 0;

    @ObfuscatedName("client.gl")
    public static boolean field1103 = false;

    @ObfuscatedName("client.gs")
    public static int field948 = 0;

    @ObfuscatedName("client.gw")
    public static int field1038 = 0;

    @ObfuscatedName("client.gi")
    public static int field950 = 50;

    @ObfuscatedName("client.gd")
    public static int[] field951 = new int[field950];

    @ObfuscatedName("client.gt")
    public static int[] field1104 = new int[field950];

    @ObfuscatedName("client.gf")
    public static int[] field911 = new int[field950];

    @ObfuscatedName("client.hy")
    public static int[] field954 = new int[field950];

    @ObfuscatedName("client.hc")
    public static int[] field1115 = new int[field950];

    @ObfuscatedName("client.hk")
    public static int[] field956 = new int[field950];

    @ObfuscatedName("client.hx")
    public static int[] field939 = new int[field950];

    @ObfuscatedName("client.he")
    public static String[] field932 = new String[field950];

    @ObfuscatedName("client.hj")
    public static int[][] field959 = new int[104][104];

    @ObfuscatedName("client.hz")
    public static int field920 = 0;

    @ObfuscatedName("client.hu")
    public static int field961 = -1;

    @ObfuscatedName("client.hb")
    public static int field991 = -1;

    @ObfuscatedName("client.hi")
    public static int field963 = 0;

    @ObfuscatedName("client.hm")
    public static int field964 = 0;

    @ObfuscatedName("client.hr")
    public static int field965 = 0;

    @ObfuscatedName("client.hf")
    public static int field966 = 0;

    @ObfuscatedName("client.hn")
    public static int field967 = 0;

    @ObfuscatedName("client.ht")
    public static int field968 = 0;

    @ObfuscatedName("client.hv")
    public static int field969 = 0;

    @ObfuscatedName("client.hq")
    public static int field970 = 0;

    @ObfuscatedName("client.hs")
    public static int field971 = 0;

    @ObfuscatedName("client.ho")
    public static int field1021 = 0;

    @ObfuscatedName("client.hg")
    public static boolean field973 = false;

    @ObfuscatedName("client.ha")
    public static int field974 = 0;

    @ObfuscatedName("client.hd")
    public static int field891 = 0;

    @ObfuscatedName("client.ib")
    public static class74[] field900 = new class74[2048];

    @ObfuscatedName("client.ih")
    public static int field977 = -1;

    @ObfuscatedName("client.ia")
    public static int field978 = 0;

    @ObfuscatedName("client.ik")
    public static int field979 = 0;

    @ObfuscatedName("client.in")
    public static int[] field980 = new int[1000];

    @ObfuscatedName("client.id")
    public static final int[] field917 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.iq")
    public static String[] field982 = new String[8];

    @ObfuscatedName("client.it")
    public static String field1010 = null;

    @ObfuscatedName("client.il")
    public static boolean[] field983 = new boolean[8];

    @ObfuscatedName("client.ij")
    public static int[] field944 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.if")
    public static int field975 = -1;

    @ObfuscatedName("client.iw")
    public static class205[][][] field986 = new class205[4][104][104];

    @ObfuscatedName("client.iv")
    public static class205 field987 = new class205();

    @ObfuscatedName("client.im")
    public static class205 field988 = new class205();

    @ObfuscatedName("client.ie")
    public static class205 field989 = new class205();

    @ObfuscatedName("client.ic")
    public static int[] field990 = new int[25];

    @ObfuscatedName("client.iy")
    public static int[] field1116 = new int[25];

    @ObfuscatedName("client.ip")
    public static int[] field901 = new int[25];

    @ObfuscatedName("client.ir")
    public static int field993 = 0;

    @ObfuscatedName("client.iu")
    public static boolean field994 = false;

    @ObfuscatedName("client.jd")
    public static int field1081 = 0;

    @ObfuscatedName("client.ji")
    public static int[] field962 = new int[500];

    @ObfuscatedName("client.jl")
    public static int[] field958 = new int[500];

    @ObfuscatedName("client.jt")
    public static int[] field1125 = new int[500];

    @ObfuscatedName("client.jh")
    public static int[] field999 = new int[500];

    @ObfuscatedName("client.jy")
    public static String[] field1000 = new String[500];

    @ObfuscatedName("client.js")
    public static String[] field1001 = new String[500];

    @ObfuscatedName("client.jf")
    public static boolean[] field933 = new boolean[500];

    @ObfuscatedName("client.jk")
    public static boolean field1003 = false;

    @ObfuscatedName("client.jj")
    public static boolean field1004 = false;

    @ObfuscatedName("client.jw")
    public static int field1005 = -1;

    @ObfuscatedName("client.jg")
    public static int field1006 = -1;

    @ObfuscatedName("client.jr")
    public static int field1007 = 0;

    @ObfuscatedName("client.ju")
    public static int field1008 = 50;

    @ObfuscatedName("client.jm")
    public static int field1041 = 0;

    @ObfuscatedName("client.jo")
    public static boolean field1128 = false;

    @ObfuscatedName("client.ke")
    public static int field918 = -1;

    @ObfuscatedName("client.kj")
    public static int field910 = -1;

    @ObfuscatedName("client.ku")
    public static String field1014 = null;

    @ObfuscatedName("client.kk")
    public static String field1015 = null;

    @ObfuscatedName("client.ka")
    public static int field1016 = -1;

    @ObfuscatedName("client.kx")
    public static class202 field1017 = new class202(8);

    @ObfuscatedName("client.kb")
    public static int field1018 = 0;

    @ObfuscatedName("client.kr")
    public static int field1019 = 0;

    @ObfuscatedName("client.kw")
    public static class228 field1020 = null;

    @ObfuscatedName("client.km")
    public static int field1063 = 0;

    @ObfuscatedName("client.kg")
    public static int field957 = 0;

    @ObfuscatedName("client.kd")
    public static int field1023 = 0;

    @ObfuscatedName("client.kp")
    public static int field1048 = -1;

    @ObfuscatedName("client.kl")
    public static boolean field984 = false;

    @ObfuscatedName("client.kh")
    public static boolean field912 = false;

    @ObfuscatedName("client.kq")
    public static boolean field1027 = false;

    @ObfuscatedName("client.ky")
    public static class228 field981 = null;

    @ObfuscatedName("client.kv")
    public static class228 field1029 = null;

    @ObfuscatedName("client.kf")
    public static class228 field1030 = null;

    @ObfuscatedName("client.ks")
    public static int field926 = 0;

    @ObfuscatedName("client.ko")
    public static int field1002 = 0;

    @ObfuscatedName("client.kt")
    public static class228 field1033 = null;

    @ObfuscatedName("client.ki")
    public static boolean field1034 = false;

    @ObfuscatedName("client.kn")
    public static int field1035 = -1;

    @ObfuscatedName("client.ld")
    public static int field1036 = -1;

    @ObfuscatedName("client.lv")
    public static boolean field1037 = false;

    @ObfuscatedName("client.lu")
    public static int field1096 = -1;

    @ObfuscatedName("client.lo")
    public static int field1039 = -1;

    @ObfuscatedName("client.lb")
    public static boolean field1040 = false;

    @ObfuscatedName("client.li")
    public static int field953 = 1;

    @ObfuscatedName("client.lm")
    public static int[] field985 = new int[32];

    @ObfuscatedName("client.la")
    public static int field1043 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field941 = new int[32];

    @ObfuscatedName("client.lj")
    public static int field1045 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field1094 = new int[32];

    @ObfuscatedName("client.ln")
    public static int field1046 = 0;

    @ObfuscatedName("client.lw")
    public static int field998 = 0;

    @ObfuscatedName("client.lq")
    public static int field881 = 0;

    @ObfuscatedName("client.ls")
    public static int field1050 = 0;

    @ObfuscatedName("client.lt")
    public static int field1051 = 0;

    @ObfuscatedName("client.lz")
    public static int field1052 = 0;

    @ObfuscatedName("client.le")
    public static int field952 = 0;

    @ObfuscatedName("client.mx")
    public static int field1054 = 0;

    @ObfuscatedName("client.mf")
    public static class205 field1055 = new class205();

    @ObfuscatedName("client.mj")
    public static class205 field1056 = new class205();

    @ObfuscatedName("client.ma")
    public static class205 field1057 = new class205();

    @ObfuscatedName("client.mr")
    public static class202 field1058 = new class202(512);

    @ObfuscatedName("client.mn")
    public static int field1059 = 0;

    @ObfuscatedName("client.mc")
    public static int field1060 = -2;

    @ObfuscatedName("client.mm")
    public static boolean[] field1042 = new boolean[100];

    @ObfuscatedName("client.me")
    public static boolean[] field1062 = new boolean[100];

    @ObfuscatedName("client.mo")
    public static boolean[] field976 = new boolean[100];

    @ObfuscatedName("client.mp")
    public static int[] field1064 = new int[100];

    @ObfuscatedName("client.mb")
    public static int[] field1065 = new int[100];

    @ObfuscatedName("client.mg")
    public static int[] field1066 = new int[100];

    @ObfuscatedName("client.ms")
    public static int[] field1067 = new int[100];

    @ObfuscatedName("client.mt")
    public static int field1068 = 0;

    @ObfuscatedName("client.mh")
    public static long field1069 = 0L;

    @ObfuscatedName("client.mu")
    public static boolean field893 = true;

    @ObfuscatedName("client.mk")
    public static int[] field1071 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.mw")
    public static int field1072 = 0;

    @ObfuscatedName("client.nd")
    public static int field1073 = 0;

    @ObfuscatedName("client.nl")
    public static String field886 = "";

    @ObfuscatedName("client.nt")
    public static long[] field1075 = new long[100];

    @ObfuscatedName("client.np")
    public static int field960 = 0;

    @ObfuscatedName("client.nr")
    public static int field1077 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field877 = new int[128];

    @ObfuscatedName("client.nm")
    public static int[] field1079 = new int[128];

    @ObfuscatedName("client.nh")
    public static long field898 = -1L;

    @ObfuscatedName("client.ng")
    public static String field955 = null;

    @ObfuscatedName("client.nj")
    public static String field1082 = null;

    @ObfuscatedName("client.nf")
    public static int field1083 = -1;

    @ObfuscatedName("client.nz")
    public static int field1084 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field1089 = new int[1000];

    @ObfuscatedName("client.ns")
    public static int[] field1086 = new int[1000];

    @ObfuscatedName("client.ni")
    public static class299[] field1087 = new class299[1000];

    @ObfuscatedName("client.nn")
    public static int field1013 = 0;

    @ObfuscatedName("client.ne")
    public static int field946 = 0;

    @ObfuscatedName("client.od")
    public static int field1090 = 0;

    @ObfuscatedName("client.oj")
    public static int field1091 = 255;

    @ObfuscatedName("client.ou")
    public static int field1092 = -1;

    @ObfuscatedName("client.ob")
    public static boolean field992 = false;

    @ObfuscatedName("client.oy")
    public static int field904 = 127;

    @ObfuscatedName("client.ov")
    public static int field1095 = 127;

    @ObfuscatedName("client.ok")
    public static int field1026 = 0;

    @ObfuscatedName("client.or")
    public static int[] field1097 = new int[50];

    @ObfuscatedName("client.oh")
    public static int[] field1028 = new int[50];

    @ObfuscatedName("client.ox")
    public static int[] field1099 = new int[50];

    @ObfuscatedName("client.oa")
    public static int[] field1100 = new int[50];

    @ObfuscatedName("client.oc")
    public static class105[] field1101 = new class105[50];

    @ObfuscatedName("client.oz")
    public static boolean field1102 = false;

    @ObfuscatedName("client.pr")
    public static boolean[] field1098 = new boolean[5];

    @ObfuscatedName("client.pj")
    public static int[] field930 = new int[5];

    @ObfuscatedName("client.pg")
    public static int[] field1105 = new int[5];

    @ObfuscatedName("client.pb")
    public static int[] field1106 = new int[5];

    @ObfuscatedName("client.py")
    public static int[] field1044 = new int[5];

    @ObfuscatedName("client.ps")
    public static short field1108 = 256;

    @ObfuscatedName("client.pk")
    public static short field1109 = 205;

    @ObfuscatedName("client.pp")
    public static short field1047 = 256;

    @ObfuscatedName("client.pv")
    public static short field1111 = 320;

    @ObfuscatedName("client.po")
    public static short field1112 = 1;

    @ObfuscatedName("client.pt")
    public static short field1113 = 32767;

    @ObfuscatedName("client.pq")
    public static short field1114 = 1;

    @ObfuscatedName("client.pf")
    public static short field949 = 32767;

    @ObfuscatedName("client.pn")
    public static int field1107 = 0;

    @ObfuscatedName("client.pw")
    public static int field1117 = 0;

    @ObfuscatedName("client.pc")
    public static int field1118 = 0;

    @ObfuscatedName("client.pz")
    public static int field1070 = 0;

    @ObfuscatedName("client.pe")
    public static int field996 = 0;

    @ObfuscatedName("client.qa")
    public static int field1121 = 0;

    @ObfuscatedName("client.qt")
    public static int field1078 = 0;

    @ObfuscatedName("client.qy")
    public static class66[] field1123 = new class66[400];

    @ObfuscatedName("client.ql")
    public static class207 field1124 = new class207();

    @ObfuscatedName("client.qn")
    public static int field1032 = 0;

    @ObfuscatedName("client.qg")
    public static class70[] field1012 = new class70[400];

    @ObfuscatedName("client.qc")
    public static class225 field1127 = new class225();

    @ObfuscatedName("client.qd")
    public static int field1061 = -1;

    @ObfuscatedName("client.qr")
    public static int field1129 = -1;

    @ObfuscatedName("client.qj")
    public static class17[] field1130 = new class17[8];

    @ObfuscatedName("client.qs")
    public static class75 field1131 = new class75();

    @ObfuscatedName("client.qf")
    public static final class73 field1132 = new class73();

    @ObfuscatedName("client.qh")
    public static int[] field1133 = new int[50];

    @ObfuscatedName("client.qm")
    public static int[] field1134 = new int[50];

    @ObfuscatedName("au.fi(B)Lkl;")
    public static class302 method618() {
        return Statics.field1688;
    }

    @ObfuscatedName("client.ak(B)V")
    public final void method884() {
    }

    public final void init() {
        if (!this.method747()) {
            return;
        }
        class287[] var1 = class287.method3213();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class287 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3800);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3800)) {
                    case 2:
                        Statics.field830 = var4;
                        break;
                    case 3:
                        field995 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field874 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field19 = (class244) class180.method455(class244.method2739(), Integer.parseInt(var4));
                        if (Statics.field19 == class244.field3291) {
                            Statics.field295 = class303.field3936;
                        } else {
                            Statics.field295 = class303.field3934;
                        }
                        break;
                    case 6:
                        int var5 = Integer.parseInt(var4);
                        class243[] var6 = class243.method2715();
                        int var7 = 0;
                        class243 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class243 var8 = var6[var7];
                            if (var8.field3289 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field876 = var9;
                        break;
                    case 7:
                        Statics.field313 = Integer.parseInt(var4);
                        break;
                    case 8:
                        Statics.field2567 = Integer.parseInt(var4);
                    case 9:
                    case 10:
                    default:
                        break;
                    case 11:
                        field972 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field1126 = Integer.parseInt(var4);
                        break;
                    case 13:
                        field919 = Integer.parseInt(var4) != 0;
                        break;
                    case 14:
                        Statics.field304 = var4;
                        break;
                    case 15:
                        if (var4.equalsIgnoreCase(class88.field1315)) {
                        }
                        break;
                    case 16:
                        if (var4.equalsIgnoreCase(class88.field1315)) {
                            field875 = true;
                        } else {
                            field875 = false;
                        }
                }
            }
        }
        class139.field2014 = false;
        field879 = false;
        Statics.field2188 = this.getCodeBase().getHost();
        String var10 = Statics.field876.field3287;
        byte var11 = 0;
        try {
            class158.method468("oldschool", var10, var11, 17);
        } catch (Exception var13) {
            class155.method4721((String) null, var13);
        }
        Statics.field2183 = this;
        this.method745(765, 503, 161);
    }

    @ObfuscatedName("client.av(I)V")
    public final void method811() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field2043 = null;
            Statics.field2542 = null;
            Statics.field3405 = (byte[][][]) null;
        } else {
            Statics.field2043 = var1;
            Statics.field2542 = new int[var1.length];
            Statics.field3405 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field2043.length; var3++) {
                Statics.field3405[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field2046 = field995 == 0 ? 43594 : field874 + 40000;
        Statics.field2111 = field995 == 0 ? 443 : field874 + 50000;
        Statics.field2481 = Statics.field2046;
        Statics.field2118 = class226.field2746;
        Statics.field2464 = class226.field2742;
        Statics.field2044 = class226.field2743;
        Statics.field1400 = class226.field2744;
        Statics.field2161 = new class149();
        this.method739();
        this.method892();
        Statics.field807 = this.method823();
        Statics.field557 = new class165(255, class158.field2171, class158.field2172, 500000);
        Statics.field2727 = class81.method2934();
        this.method737();
        class57.method1075(this, Statics.field2049);
        if (field995 != 0) {
            field889 = true;
        }
        int var4 = Statics.field2727.field1237;
        field1069 = 0L;
        if (var4 >= 2) {
            field893 = true;
        } else {
            field893 = false;
        }
        if (method537() == 1) {
            Statics.field2183.method735(765, 503);
        } else {
            Statics.field2183.method735(7680, 2160);
        }
        if (field880 >= 25) {
            method3312();
        }
    }

    @ObfuscatedName("client.am(I)V")
    public final void method759() {
        field883++;
        this.method1079();
        class248.method2698();
        class215.method4422();
        method4524();
        class51 var1 = class51.field618;
        synchronized (class51.field618) {
            class51.field608++;
            class51.field601 = class51.field619;
            class51.field616 = 0;
            if (class51.field612 >= 0) {
                while (class51.field612 != class51.field611) {
                    int var3 = class51.field605[class51.field611];
                    class51.field611 = class51.field611 + 1 & 0x7F;
                    if (var3 < 0) {
                        class51.field609[~var3] = false;
                    } else {
                        if (!class51.field609[var3] && class51.field616 < class51.field615.length - 1) {
                            class51.field615[++class51.field616 - 1] = var3;
                        }
                        class51.field609[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class51.field609[var2] = false;
                }
                class51.field612 = class51.field611;
            }
            if (class51.field616 > 0) {
                class51.field608 = 0;
            }
            class51.field619 = class51.field596;
        }
        class60.method167();
        if (Statics.field807 != null) {
            int var5 = Statics.field807.method629();
            field1054 = var5;
        }
        if (field880 == 0) {
            method614();
            class59.method3934();
        } else if (field880 == 5) {
            class92.method1512(this);
            method614();
            class59.method3934();
        } else if (field880 == 10 || field880 == 11) {
            class92.method1512(this);
        } else if (field880 == 20) {
            class92.method1512(this);
            this.method1082();
        } else if (field880 == 25) {
            method1576();
        }
        if (field880 == 30) {
            this.method1083();
        } else if (field880 == 40 || field880 == 45) {
            this.method1082();
        }
    }

    @ObfuscatedName("client.ax(ZI)V")
    public final void method878(boolean arg0) {
        boolean var2 = class215.method2333();
        if (var2 && field992 && Statics.field2025 != null) {
            Statics.field2025.method1909();
        }
        if ((field880 == 10 || field880 == 20 || field880 == 30) && field1069 != 0L && class187.method938() > field1069) {
            int var3 = method537();
            field1069 = 0L;
            if (var3 >= 2) {
                field893 = true;
            } else {
                field893 = false;
            }
            if (method537() == 1) {
                Statics.field2183.method735(765, 503);
            } else {
                Statics.field2183.method735(7680, 2160);
            }
            if (field880 >= 25) {
                method3312();
            }
        }
        if (arg0) {
            for (int var4 = 0; var4 < 100; var4++) {
                field1042[var4] = true;
            }
        }
        if (field880 == 0) {
            this.method762(class92.field1363, class92.field1370, arg0);
        } else if (field880 == 5) {
            class92.method3278(Statics.field484, Statics.field3307, Statics.field1214, arg0);
        } else if (field880 == 10 || field880 == 11) {
            class92.method3278(Statics.field484, Statics.field3307, Statics.field1214, arg0);
        } else if (field880 == 20) {
            class92.method3278(Statics.field484, Statics.field3307, Statics.field1214, arg0);
        } else if (field880 == 25) {
            if (field1053 == 1) {
                if (field922 > field923) {
                    field923 = field922;
                }
                int var5 = (field923 * 50 - field922 * 50) / field923;
                Statics.method67(class237.field2972 + class88.field1319 + class88.field1314 + var5 + "%" + class88.field1317, false);
            } else if (field1053 == 2) {
                if (field924 > field925) {
                    field925 = field924;
                }
                int var6 = (field925 * 50 - field924 * 50) / field925 + 50;
                Statics.method67(class237.field2972 + class88.field1319 + class88.field1314 + var6 + "%" + class88.field1317, false);
            } else {
                Statics.method67(class237.field2972, false);
            }
        } else if (field880 == 30) {
            this.method1086();
        } else if (field880 == 40) {
            Statics.method67(class237.field3016 + class88.field1319 + class237.field2974, false);
        } else if (field880 == 45) {
            Statics.method67(class237.field3120, false);
        }
        if (field880 == 30 && field1068 == 0 && !arg0 && !field893) {
            for (int var7 = 0; var7 < field1059; var7++) {
                if (field1062[var7]) {
                    Statics.field475.method718(field1064[var7], field1065[var7], field1066[var7], field1067[var7]);
                    field1062[var7] = false;
                }
            }
        } else if (field880 > 0) {
            Statics.field475.method717(0, 0);
            for (int var8 = 0; var8 < field1059; var8++) {
                field1062[var8] = false;
            }
        }
    }

    @ObfuscatedName("client.ah(B)V")
    public final void method754() {
        if (Statics.field2177.method1684()) {
            Statics.field2177.method1681();
        }
        if (Statics.field2099 != null) {
            Statics.field2099.field815 = false;
        }
        Statics.field2099 = null;
        field916.method1751();
        if (class51.field618 != null) {
            class51 var1 = class51.field618;
            synchronized (class51.field618) {
                class51.field618 = null;
            }
        }
        if (class60.field699 != null) {
            class60 var3 = class60.field699;
            synchronized (class60.field699) {
                class60.field699 = null;
            }
        }
        Statics.field807 = null;
        if (Statics.field2025 != null) {
            Statics.field2025.method1910();
        }
        if (Statics.field2101 != null) {
            Statics.field2101.method1910();
        }
        class250.method2935();
        Object var5 = class248.field3331;
        synchronized (class248.field3331) {
            if (class248.field3329 != 0) {
                class248.field3329 = 1;
                try {
                    class248.field3331.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field2161 != null) {
            Statics.field2161.method2719();
            Statics.field2161 = null;
        }
        class158.method4459();
    }

    @ObfuscatedName("br.fo(II)V")
    public static void method1076(int arg0) {
        if (field880 == arg0) {
            return;
        }
        if (field880 == 0) {
            Statics.field2183.method763();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field873 = 0;
            field906 = 0;
            field907 = 0;
            field895.method4687(arg0);
            if (arg0 != 20) {
                method625(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field526 != null) {
            Statics.field526.method2826();
            Statics.field526 = null;
        }
        if (field880 == 25) {
            field1053 = 0;
            field922 = 0;
            field923 = 1;
            field924 = 0;
            field925 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class92.method1003(Statics.field719, Statics.field2027, true, 0);
        } else if (arg0 == 20) {
            class92.method1003(Statics.field719, Statics.field2027, true, field880 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class92.method1003(Statics.field719, Statics.field2027, false, 4);
        } else if (Statics.field1342) {
            Statics.field1338 = null;
            Statics.field3745 = null;
            Statics.field1339 = null;
            Statics.field1340 = null;
            Statics.field270 = null;
            Statics.field1341 = null;
            Statics.field758 = null;
            Statics.field813 = null;
            Statics.field12 = null;
            Statics.field2710 = null;
            Statics.field1691 = null;
            Statics.field430 = null;
            Statics.field543 = null;
            Statics.field551 = null;
            Statics.field778 = null;
            Statics.field297 = null;
            Statics.field452 = null;
            Statics.field516 = null;
            Statics.field1959 = null;
            Statics.field834 = null;
            Statics.field283 = null;
            Statics.field1572 = null;
            class215.field2632 = 1;
            Statics.field2633 = null;
            Statics.field811 = -1;
            Statics.field3475 = -1;
            Statics.field478 = 0;
            Statics.field2628 = false;
            Statics.field3712 = 2;
            Statics.method4472(true);
            Statics.field1342 = false;
        }
        field880 = arg0;
    }

    @ObfuscatedName("client.fq(I)V")
    public void method1079() {
        if (field880 == 1000) {
            return;
        }
        long var1 = class187.method938();
        int var3 = (int) (var1 - Statics.field3347);
        Statics.field3347 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class250.field3360 += var3;
        boolean var4;
        if (class250.field3346 == 0 && class250.field3351 == 0 && class250.field3354 == 0 && class250.field3349 == 0) {
            var4 = true;
        } else if (Statics.field3357 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class250.field3360 > 30000) {
                        throw new IOException();
                    }
                    while (class250.field3351 < 20 && class250.field3349 > 0) {
                        class246 var5 = (class246) class250.field3358.method3419();
                        class185 var6 = new class185(4);
                        var6.method3157(1);
                        var6.method3153((int) var5.field2597);
                        Statics.field3357.method2811(var6.field2528, 0, 4);
                        class250.field3350.method3417(var5, var5.field2597);
                        class250.field3349--;
                        class250.field3351++;
                    }
                    while (class250.field3346 < 20 && class250.field3354 > 0) {
                        class246 var7 = (class246) class250.field3352.method3362();
                        class185 var8 = new class185(4);
                        var8.method3157(0);
                        var8.method3153((int) var7.field2597);
                        Statics.field3357.method2811(var8.field2528, 0, 4);
                        var7.method3515();
                        class250.field3355.method3417(var7, var7.field2597);
                        class250.field3354--;
                        class250.field3346++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3357.method2816();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class250.field3360 = 0;
                        byte var11 = 0;
                        if (Statics.field406 == null) {
                            var11 = 8;
                        } else if (class250.field3361 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class250.field3348.field2529;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3357.method2813(class250.field3348.field2528, class250.field3348.field2529, var12);
                            if (class250.field3365 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class250.field3348.field2528[class250.field3348.field2529 + var13] ^= class250.field3365;
                                }
                            }
                            class250.field3348.field2529 += var12;
                            if (class250.field3348.field2529 < var11) {
                                break;
                            }
                            if (Statics.field406 == null) {
                                class250.field3348.field2529 = 0;
                                int var14 = class250.field3348.method3021();
                                int var15 = class250.field3348.method3015();
                                int var16 = class250.field3348.method3021();
                                int var17 = class250.field3348.method3026();
                                long var18 = (long) ((var14 << 16) + var15);
                                class246 var20 = (class246) class250.field3350.method3416(var18);
                                Statics.field287 = true;
                                if (var20 == null) {
                                    var20 = (class246) class250.field3355.method3416(var18);
                                    Statics.field287 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field406 = var20;
                                Statics.field2919 = new class185(var17 + var21 + Statics.field406.field3306);
                                Statics.field2919.method3157(var16);
                                Statics.field2919.method3005(var17);
                                class250.field3361 = 8;
                                class250.field3348.field2529 = 0;
                            } else if (class250.field3361 == 0) {
                                if (class250.field3348.field2528[0] == -1) {
                                    class250.field3361 = 1;
                                    class250.field3348.field2529 = 0;
                                } else {
                                    Statics.field406 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2919.field2528.length - Statics.field406.field3306;
                            int var23 = 512 - class250.field3361;
                            if (var23 > var22 - Statics.field2919.field2529) {
                                var23 = var22 - Statics.field2919.field2529;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3357.method2813(Statics.field2919.field2528, Statics.field2919.field2529, var23);
                            if (class250.field3365 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2919.field2528[Statics.field2919.field2529 + var24] ^= class250.field3365;
                                }
                            }
                            Statics.field2919.field2529 += var23;
                            class250.field3361 += var23;
                            if (Statics.field2919.field2529 == var22) {
                                if (Statics.field406.field2597 == 16711935L) {
                                    Statics.field1297 = Statics.field2919;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class249 var26 = class250.field3345[var25];
                                        if (var26 != null) {
                                            Statics.field1297.field2529 = var25 * 8 + 5;
                                            int var27 = Statics.field1297.method3026();
                                            int var28 = Statics.field1297.method3026();
                                            var26.method4031(var27, var28);
                                        }
                                    }
                                } else {
                                    class250.field3359.reset();
                                    class250.field3359.update(Statics.field2919.field2528, 0, var22);
                                    int var29 = (int) class250.field3359.getValue();
                                    if (Statics.field406.field3305 != var29) {
                                        try {
                                            Statics.field3357.method2826();
                                        } catch (Exception var35) {
                                        }
                                        class250.field3362++;
                                        Statics.field3357 = null;
                                        class250.field3365 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class250.field3362 = 0;
                                    class250.field3363 = 0;
                                    Statics.field406.field3304.method4027((int) (Statics.field406.field2597 & 0xFFFFL), Statics.field2919.field2528, (Statics.field406.field2597 & 0xFF0000L) == 16711680L, Statics.field287);
                                }
                                Statics.field406.method3474();
                                if (Statics.field287) {
                                    class250.field3351--;
                                } else {
                                    class250.field3346--;
                                }
                                class250.field3361 = 0;
                                Statics.field406 = null;
                                Statics.field2919 = null;
                            } else {
                                if (class250.field3361 != 512) {
                                    break;
                                }
                                class250.field3361 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3357.method2826();
                } catch (Exception var34) {
                }
                class250.field3363++;
                Statics.field3357 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1080();
        }
    }

    @ObfuscatedName("client.fn(I)V")
    public void method1080() {
        if (class250.field3362 >= 4) {
            this.method834("js5crc");
            field880 = 1000;
            return;
        }
        if (class250.field3363 >= 4) {
            if (field880 <= 5) {
                this.method834("js5io");
                field880 = 1000;
                return;
            }
            field887 = 3000;
            class250.field3363 = 3;
        }
        if (--field887 + 1 > 0) {
            return;
        }
        try {
            if (field902 == 0) {
                Statics.field2135 = Statics.field2480.method2781(Statics.field2188, Statics.field2481);
                field902++;
            }
            if (field902 == 1) {
                if (Statics.field2135.field2145 == 2) {
                    this.method1081(-1);
                    return;
                }
                if (Statics.field2135.field2145 == 1) {
                    field902++;
                }
            }
            if (field902 == 2) {
                if (field919) {
                    Statics.field361 = class160.method2222((Socket) Statics.field2135.field2151, 40000, 5000);
                } else {
                    Statics.field361 = new class164((Socket) Statics.field2135.field2151, Statics.field2480, 5000);
                }
                class185 var1 = new class185(5);
                var1.method3157(15);
                var1.method3005(161);
                Statics.field361.method2811(var1.field2528, 0, 5);
                field902++;
                Statics.field453 = class187.method938();
            }
            if (field902 == 3) {
                if (Statics.field361.method2816() > 0 || !field919 && field880 <= 5) {
                    int var2 = Statics.field361.method2809();
                    if (var2 != 0) {
                        this.method1081(var2);
                        return;
                    }
                    field902++;
                } else if (class187.method938() - Statics.field453 > 30000L) {
                    this.method1081(-2);
                    return;
                }
            }
            if (field902 == 4) {
                class250.method309(Statics.field361, field880 > 20);
                Statics.field2135 = null;
                Statics.field361 = null;
                field902 = 0;
                field1076 = 0;
            }
        } catch (IOException var4) {
            this.method1081(-3);
        }
    }

    @ObfuscatedName("client.fj(IB)V")
    public void method1081(int arg0) {
        Statics.field2135 = null;
        Statics.field361 = null;
        field902 = 0;
        if (Statics.field2481 == Statics.field2046) {
            Statics.field2481 = Statics.field2111;
        } else {
            Statics.field2481 = Statics.field2046;
        }
        field1076++;
        if (field1076 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field880 <= 5) {
                this.method834("js5connect_full");
                field880 = 1000;
            } else {
                field887 = 3000;
            }
        } else if (field1076 >= 2 && arg0 == 6) {
            this.method834("js5connect_outofdate");
            field880 = 1000;
        } else if (field1076 >= 4) {
            if (field880 <= 5) {
                this.method834("js5connect");
                field880 = 1000;
            } else {
                field887 = 3000;
            }
        }
    }

    @ObfuscatedName("as.fx(I)V")
    public static void method614() {
        if (field935 == 0) {
            Statics.field566 = new class139(4, 104, 104, class62.field742);
            for (int var0 = 0; var0 < 4; var0++) {
                field928[var0] = new class167(104, 104);
            }
            Statics.field2952 = new class299(512, 512);
            class92.field1370 = class237.field2975;
            class92.field1363 = 5;
            field935 = 20;
        } else if (field935 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class136.field1942[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class139.method2555(var1, 500, 800, 512, 334);
            class92.field1370 = class237.field2976;
            class92.field1363 = 10;
            field935 = 30;
        } else if (field935 == 30) {
            Statics.field1296 = method621(0, false, true, true);
            Statics.field2024 = method621(1, false, true, true);
            Statics.field2664 = method621(2, true, false, true);
            Statics.field573 = method621(3, false, true, true);
            Statics.field320 = method621(4, false, true, true);
            Statics.field746 = method621(5, true, true, true);
            Statics.field355 = method621(6, true, true, false);
            Statics.field697 = method621(7, false, true, true);
            Statics.field2027 = method621(8, false, true, true);
            Statics.field18 = method621(9, false, true, true);
            Statics.field719 = method621(10, false, true, true);
            Statics.field2139 = method621(11, false, true, true);
            Statics.field2191 = method621(12, false, true, true);
            Statics.field771 = method621(13, true, false, true);
            Statics.field553 = method621(14, false, true, false);
            Statics.field420 = method621(15, false, true, true);
            Statics.field628 = method621(16, false, true, false);
            class92.field1370 = class237.field3245;
            class92.field1363 = 20;
            field935 = 40;
        } else if (field935 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1296.method4036() * 4 / 100;
            int var8 = var7 + Statics.field2024.method4036() * 4 / 100;
            int var9 = var8 + Statics.field2664.method4036() * 2 / 100;
            int var10 = var9 + Statics.field573.method4036() * 2 / 100;
            int var11 = var10 + Statics.field320.method4036() * 6 / 100;
            int var12 = var11 + Statics.field746.method4036() * 4 / 100;
            int var13 = var12 + Statics.field355.method4036() * 2 / 100;
            int var14 = var13 + Statics.field697.method4036() * 58 / 100;
            int var15 = var14 + Statics.field2027.method4036() * 2 / 100;
            int var16 = var15 + Statics.field18.method4036() * 2 / 100;
            int var17 = var16 + Statics.field719.method4036() * 2 / 100;
            int var18 = var17 + Statics.field2139.method4036() * 2 / 100;
            int var19 = var18 + Statics.field2191.method4036() * 2 / 100;
            int var20 = var19 + Statics.field771.method4036() * 2 / 100;
            int var21 = var20 + Statics.field553.method4036() * 2 / 100;
            int var22 = var21 + Statics.field420.method4036() * 2 / 100;
            int var23 = var22 + Statics.field628.method4036() * 2 / 100;
            if (var23 == 100) {
                class92.field1370 = class237.field3145;
                class92.field1363 = 30;
                field935 = 45;
            } else {
                if (var23 != 0) {
                    class92.field1370 = class237.field2978 + var23 + "%";
                }
                class92.field1363 = 30;
            }
        } else if (field935 == 45) {
            boolean var24 = !field879;
            Statics.field1542 = 22050;
            Statics.field13 = var24;
            Statics.field1541 = 2;
            class216 var25 = new class216();
            var25.method3578(9, 128);
            Statics.field2025 = class109.method1735(Statics.field2480, 0, 22050);
            Statics.field2025.method1906(var25);
            class249 var26 = Statics.field420;
            class249 var27 = Statics.field553;
            class249 var28 = Statics.field320;
            Statics.field2636 = var26;
            Statics.field2634 = var27;
            Statics.field2630 = var28;
            Statics.field2631 = var25;
            Statics.field2101 = class109.method1735(Statics.field2480, 1, 2048);
            Statics.field1329 = new class102();
            Statics.field2101.method1906(Statics.field1329);
            Statics.field344 = new class116(22050, Statics.field1542);
            class92.field1370 = class237.field2980;
            class92.field1363 = 35;
            field935 = 50;
            Statics.field590 = new class274(Statics.field2027, Statics.field771);
        } else if (field935 == 50) {
            int var29 = class273.method4525().length;
            field921 = Statics.field590.method4527(class273.method4525());
            if (field921.size() < var29) {
                class92.field1370 = class237.field3214 + field921.size() * 100 / var29 + "%";
                class92.field1363 = 40;
            } else {
                Statics.field3307 = (class275) field921.get(class273.field3710);
                Statics.field1214 = (class275) field921.get(class273.field3704);
                Statics.field484 = (class275) field921.get(class273.field3703);
                Statics.field2215 = new class305(true);
                class92.field1370 = class237.field2982;
                class92.field1363 = 40;
                field935 = 60;
            }
        } else if (field935 == 60) {
            class249 var30 = Statics.field719;
            class249 var31 = Statics.field2027;
            int var32 = 0;
            if (var30.method3937("title.jpg", "")) {
                var32++;
            }
            if (var31.method3937("logo", "")) {
                var32++;
            }
            if (var31.method3937("logo_deadman_mode", "")) {
                var32++;
            }
            if (var31.method3937("titlebox", "")) {
                var32++;
            }
            if (var31.method3937("titlebutton", "")) {
                var32++;
            }
            if (var31.method3937("runes", "")) {
                var32++;
            }
            if (var31.method3937("title_mute", "")) {
                var32++;
            }
            if (var31.method3937("options_radio_buttons,0", "")) {
                var32++;
            }
            if (var31.method3937("options_radio_buttons,2", "")) {
                var32++;
            }
            if (var31.method3937("options_radio_buttons,4", "")) {
                var32++;
            }
            if (var31.method3937("options_radio_buttons,6", "")) {
                var32++;
            }
            var31.method3937("sl_back", "");
            var31.method3937("sl_flags", "");
            var31.method3937("sl_arrows", "");
            var31.method3937("sl_stars", "");
            var31.method3937("sl_button", "");
            int var35 = class92.method1019();
            if (var32 < var35) {
                class92.field1370 = class237.field2983 + var32 * 100 / var35 + "%";
                class92.field1363 = 50;
            } else {
                class92.field1370 = class237.field3182;
                class92.field1363 = 50;
                method1076(5);
                field935 = 70;
            }
        } else if (field935 == 70) {
            if (Statics.field2664.method3941()) {
                class271.method472(Statics.field2664);
                class249 var36 = Statics.field2664;
                Statics.field3435 = var36;
                class249 var37 = Statics.field2664;
                class249 var38 = Statics.field697;
                Statics.field3445 = var37;
                Statics.field3441 = var38;
                Statics.field3448 = Statics.field3445.method3921(3);
                class267.method1022(Statics.field2664, Statics.field697, field879);
                class270.method1736(Statics.field2664, Statics.field697);
                class249 var39 = Statics.field2664;
                Statics.field724 = var39;
                class249 var40 = Statics.field2664;
                class249 var41 = Statics.field697;
                boolean var42 = field875;
                class275 var43 = Statics.field3307;
                Statics.field3575 = var40;
                Statics.field3576 = var41;
                Statics.field3577 = var42;
                Statics.field1330 = Statics.field3575.method3921(10);
                Statics.field298 = var43;
                class249 var44 = Statics.field2664;
                class249 var45 = Statics.field1296;
                class249 var46 = Statics.field2024;
                Statics.field3692 = var44;
                Statics.field3684 = var45;
                Statics.field3700 = var46;
                class257.method36(Statics.field2664, Statics.field697);
                class249 var47 = Statics.field2664;
                Statics.field3470 = var47;
                class249 var48 = Statics.field2664;
                Statics.field695 = var48;
                Statics.field3379 = Statics.field695.method3921(16);
                class249 var49 = Statics.field573;
                class249 var50 = Statics.field697;
                class249 var51 = Statics.field2027;
                class249 var52 = Statics.field771;
                Statics.field2755 = var49;
                Statics.field1915 = var50;
                Statics.field2790 = var51;
                Statics.field1777 = var52;
                Statics.field2754 = new class228[Statics.field2755.method3929()][];
                Statics.field3410 = new boolean[Statics.field2755.method3929()];
                class252.method1606(Statics.field2664);
                class265.method2926(Statics.field2664);
                class249 var53 = Statics.field2664;
                Statics.field3409 = var53;
                class249 var54 = Statics.field2664;
                Statics.field318 = var54;
                class263.method482(Statics.field2664);
                Statics.field2177 = new class96();
                class249 var55 = Statics.field2664;
                class249 var56 = Statics.field2027;
                class249 var57 = Statics.field771;
                Statics.field3516 = var55;
                Statics.field726 = var56;
                Statics.field3499 = var57;
                class260.method4060(Statics.field2664, Statics.field2027);
                class249 var58 = Statics.field2664;
                class249 var59 = Statics.field2027;
                Statics.field3392 = var59;
                if (var58.method3941()) {
                    Statics.field3383 = var58.method3921(35);
                    Statics.field3384 = new class254[Statics.field3383];
                    for (int var60 = 0; var60 < Statics.field3383; var60++) {
                        byte[] var61 = var58.method3931(35, var60);
                        if (var61 != null) {
                            Statics.field3384[var60] = new class254(var60);
                            Statics.field3384[var60].method4095(new class185(var61));
                            Statics.field3384[var60].method4091();
                        }
                    }
                }
                class92.field1370 = class237.field2986;
                class92.field1363 = 60;
                field935 = 80;
            } else {
                class92.field1370 = class237.field3052 + Statics.field2664.method4030() + "%";
                class92.field1363 = 60;
            }
        } else if (field935 == 80) {
            int var62 = 0;
            if (Statics.field3380 == null) {
                class249 var63 = Statics.field2027;
                int var64 = var63.method4007("compass");
                int var65 = var63.method4009(var64, "");
                class299 var66 = class300.method675(var63, var64, var65);
                Statics.field3380 = var66;
            } else {
                var62++;
            }
            if (Statics.field15 == null) {
                class249 var67 = Statics.field2027;
                int var68 = var67.method4007("mapedge");
                int var69 = var67.method4009(var68, "");
                class299 var70 = class300.method675(var67, var68, var69);
                Statics.field15 = var70;
            } else {
                var62++;
            }
            if (Statics.field331 == null) {
                Statics.field331 = class300.method4825(Statics.field2027, "mapscene", "");
            } else {
                var62++;
            }
            if (Statics.field558 == null) {
                Statics.field558 = class300.method17(Statics.field2027, "headicons_pk", "");
            } else {
                var62++;
            }
            if (Statics.field309 == null) {
                Statics.field309 = class300.method17(Statics.field2027, "headicons_prayer", "");
            } else {
                var62++;
            }
            if (Statics.field683 == null) {
                Statics.field683 = class300.method17(Statics.field2027, "headicons_hint", "");
            } else {
                var62++;
            }
            if (Statics.field27 == null) {
                Statics.field27 = class300.method17(Statics.field2027, "mapmarker", "");
            } else {
                var62++;
            }
            if (Statics.field820 == null) {
                Statics.field820 = class300.method17(Statics.field2027, "cross", "");
            } else {
                var62++;
            }
            if (Statics.field2094 == null) {
                Statics.field2094 = class300.method17(Statics.field2027, "mapdots", "");
            } else {
                var62++;
            }
            if (Statics.field692 == null) {
                Statics.field692 = class300.method4825(Statics.field2027, "scrollbar", "");
            } else {
                var62++;
            }
            if (Statics.field3408 == null) {
                Statics.field3408 = class300.method4825(Statics.field2027, "mod_icons", "");
            } else {
                var62++;
            }
            if (var62 < 11) {
                class92.field1370 = class237.field2987 + var62 * 100 / 12 + "%";
                class92.field1363 = 70;
            } else {
                Statics.field3728 = Statics.field3408;
                Statics.field15.method4894();
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 41.0D) - 20;
                Statics.field331[0].method4836(var71 + var74, var72 + var74, var73 + var74);
                class92.field1370 = class237.field3050;
                class92.field1363 = 70;
                field935 = 90;
            }
        } else if (field935 == 90) {
            if (Statics.field18.method3941()) {
                Statics.field753 = new class125(Statics.field18, Statics.field2027, 20, 0.8D, field879 ? 64 : 128);
                class136.method2441(Statics.field753);
                class136.method2447(0.8D);
                field935 = 100;
            } else {
                class92.field1370 = class237.field2979 + "0%";
                class92.field1363 = 90;
            }
        } else if (field935 == 100) {
            int var75 = Statics.field753.method2243();
            if (var75 < 100) {
                class92.field1370 = class237.field2979 + var75 + "%";
                class92.field1363 = 90;
            } else {
                class92.field1370 = class237.field2990;
                class92.field1363 = 90;
                field935 = 110;
            }
        } else if (field935 == 110) {
            Statics.field2099 = new class71();
            Statics.field2480.method2782(Statics.field2099, 10);
            class92.field1370 = class237.field3020;
            class92.field1363 = 92;
            field935 = 120;
        } else if (field935 == 120) {
            if (Statics.field719.method3937("huffman", "")) {
                class177 var76 = new class177(Statics.field719.method3977("huffman", ""));
                class277.method3327(var76);
                class92.field1370 = class237.field2993;
                class92.field1363 = 94;
                field935 = 130;
            } else {
                class92.field1370 = class237.field2992 + "%";
                class92.field1363 = 94;
            }
        } else if (field935 == 130) {
            if (!Statics.field573.method3941()) {
                class92.field1370 = class237.field2994 + Statics.field573.method4030() * 4 / 5 + "%";
                class92.field1363 = 96;
            } else if (!Statics.field2191.method3941()) {
                class92.field1370 = class237.field2994 + (80 + Statics.field2191.method4030() / 6) + "%";
                class92.field1363 = 96;
            } else if (Statics.field771.method3941()) {
                class92.field1370 = class237.field2995;
                class92.field1363 = 98;
                field935 = 140;
            } else {
                class92.field1370 = class237.field2994 + (96 + Statics.field771.method4030() / 50) + "%";
                class92.field1363 = 96;
            }
        } else if (field935 == 140) {
            class92.field1363 = 100;
            if (Statics.field628.method3938(class41.field523.field518)) {
                if (Statics.field1688 == null) {
                    Statics.field1688 = new class302();
                    Statics.field1688.method5001(Statics.field628, Statics.field484, field921, Statics.field331);
                }
                int var77 = Statics.field1688.method5002();
                if (var77 < 100) {
                    class92.field1370 = class237.field2981 + (var77 * 9 / 10 + 10) + "%";
                } else {
                    class92.field1370 = class237.field2997;
                    field935 = 150;
                }
            } else {
                class92.field1370 = class237.field2981 + Statics.field628.method3940(class41.field523.field518) / 10 + "%";
            }
        } else if (field935 == 150) {
            method1076(10);
        }
    }

    @ObfuscatedName("an.fe(IZZZI)Lif;")
    public static class249 method621(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class165 var4 = null;
        if (class158.field2171 != null) {
            var4 = new class165(arg0, class158.field2171, Statics.field2164[arg0], 1000000);
        }
        return new class249(var4, Statics.field557, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fy(I)V")
    public final void method1082() {
        class160 var1 = field916.method1753();
        class191 var2 = field916.field1464;
        try {
            if (field873 == 0) {
                if (var1 != null) {
                    var1.method2826();
                    var1 = null;
                }
                Statics.field502 = null;
                field1011 = false;
                field906 = 0;
                field873 = 1;
            }
            if (field873 == 1) {
                if (Statics.field502 == null) {
                    Statics.field502 = Statics.field2480.method2781(Statics.field2188, Statics.field2481);
                }
                if (Statics.field502.field2145 == 2) {
                    throw new IOException();
                }
                if (Statics.field502.field2145 == 1) {
                    if (field919) {
                        var1 = class160.method2222((Socket) Statics.field502.field2151, 40000, 5000);
                    } else {
                        var1 = new class164((Socket) Statics.field502.field2151, Statics.field2480, 5000);
                    }
                    field916.method1750(var1);
                    Statics.field502 = null;
                    field873 = 2;
                }
            }
            if (field873 == 2) {
                field916.method1760();
                class175 var3;
                if (class175.field2454 == 0) {
                    var3 = new class175();
                } else {
                    var3 = class175.field2453[--class175.field2454];
                }
                var3.field2455 = null;
                var3.field2449 = 0;
                var3.field2451 = new class191(5000);
                var3.field2451.method3157(class173.field2433.field2432);
                field916.method1747(var3);
                field916.method1749();
                var2.field2529 = 0;
                field873 = 3;
            }
            if (field873 == 3) {
                if (Statics.field2025 != null) {
                    Statics.field2025.method1908();
                }
                if (Statics.field2101 != null) {
                    Statics.field2101.method1908();
                }
                boolean var7 = true;
                if (field919 && !var1.method2810(1)) {
                    var7 = false;
                }
                if (var7) {
                    int var8 = var1.method2809();
                    if (Statics.field2025 != null) {
                        Statics.field2025.method1908();
                    }
                    if (Statics.field2101 != null) {
                        Statics.field2101.method1908();
                    }
                    if (var8 != 0) {
                        method46(var8);
                        return;
                    }
                    var2.field2529 = 0;
                    field873 = 4;
                }
            }
            if (field873 == 4) {
                if (var2.field2529 < 8) {
                    int var9 = var1.method2816();
                    if (var9 > 8 - var2.field2529) {
                        var9 = 8 - var2.field2529;
                    }
                    if (var9 > 0) {
                        var1.method2813(var2.field2528, var2.field2529, var9);
                        var2.field2529 += var9;
                    }
                }
                if (var2.field2529 == 8) {
                    var2.field2529 = 0;
                    Statics.field1946 = var2.method3027();
                    field873 = 5;
                }
            }
            if (field873 == 5) {
                field916.field1464.field2529 = 0;
                field916.method1760();
                class191 var10 = new class191(500);
                int[] var11 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field1946 >> 32), (int) (Statics.field1946 & 0xFFFFFFFFFFFFFFFFL) };
                var10.field2529 = 0;
                var10.method3157(1);
                var10.method3157(field909.method6());
                var10.method3005(var11[0]);
                var10.method3005(var11[1]);
                var10.method3005(var11[2]);
                var10.method3005(var11[3]);
                switch(field909.field2110) {
                    case 0:
                        LinkedHashMap var13 = Statics.field2727.field1234;
                        String var14 = class92.field1360;
                        int var15 = var14.length();
                        int var16 = 0;
                        for (int var17 = 0; var17 < var15; var17++) {
                            var16 = (var16 << 5) - var16 + var14.charAt(var17);
                        }
                        var10.method3005((Integer) var13.get(var16));
                        var10.field2529 += 4;
                        break;
                    case 1:
                        var10.field2529 += 8;
                        break;
                    case 2:
                    case 3:
                        var10.method3153(Statics.field3364);
                        var10.field2529 += 5;
                }
                var10.method3012(class92.field1361);
                var10.method3192(class90.field1327, class90.field1326);
                class175 var19;
                if (class175.field2454 == 0) {
                    var19 = new class175();
                } else {
                    var19 = class175.field2453[--class175.field2454];
                }
                var19.field2455 = null;
                var19.field2449 = 0;
                var19.field2451 = new class191(5000);
                var19.field2451.field2529 = 0;
                if (field880 == 40) {
                    var19.field2451.method3157(class173.field2429.field2432);
                } else {
                    var19.field2451.method3157(class173.field2431.field2432);
                }
                var19.field2451.method3006(0);
                int var23 = var19.field2451.field2529;
                var19.field2451.method3005(161);
                var19.field2451.method3147(var10.field2528, 0, var10.field2529);
                int var24 = var19.field2451.field2529;
                var19.field2451.method3012(class92.field1360);
                var19.field2451.method3157((field893 ? 1 : 0) << 1 | (field879 ? 1 : 0));
                var19.field2451.method3006(Statics.field1320);
                var19.field2451.method3006(Statics.field358);
                class191 var25 = var19.field2451;
                if (field1122 == null) {
                    byte[] var26 = class158.method42();
                    var25.method3147(var26, 0, var26.length);
                } else {
                    var25.method3147(field1122, 0, field1122.length);
                }
                var19.field2451.method3012(Statics.field830);
                var19.field2451.method3005(Statics.field313);
                class185 var27 = new class185(Statics.field2215.method5187());
                Statics.field2215.method5189(var27);
                var19.field2451.method3147(var27.field2528, 0, var27.field2528.length);
                var19.field2451.method3157(Statics.field2567);
                var19.field2451.method3005(0);
                var19.field2451.method3005(Statics.field1296.field3316);
                var19.field2451.method3005(Statics.field2024.field3316);
                var19.field2451.method3005(Statics.field2664.field3316);
                var19.field2451.method3005(Statics.field573.field3316);
                var19.field2451.method3005(Statics.field320.field3316);
                var19.field2451.method3005(Statics.field746.field3316);
                var19.field2451.method3005(Statics.field355.field3316);
                var19.field2451.method3005(Statics.field697.field3316);
                var19.field2451.method3005(Statics.field2027.field3316);
                var19.field2451.method3005(Statics.field18.field3316);
                var19.field2451.method3005(Statics.field719.field3316);
                var19.field2451.method3005(Statics.field2139.field3316);
                var19.field2451.method3005(Statics.field2191.field3316);
                var19.field2451.method3005(Statics.field771.field3316);
                var19.field2451.method3005(Statics.field553.field3316);
                var19.field2451.method3005(Statics.field420.field3316);
                var19.field2451.method3005(Statics.field628.field3316);
                var19.field2451.method3041(var11, var24, var19.field2451.field2529);
                var19.field2451.method3017(var19.field2451.field2529 - var23);
                field916.method1747(var19);
                field916.method1749();
                field916.field1463 = new class192(var11);
                for (int var28 = 0; var28 < 4; var28++) {
                    var11[var28] += 50;
                }
                var2.method3280(var11);
                field873 = 6;
            }
            if (field873 == 6 && var1.method2816() > 0) {
                int var29 = var1.method2809();
                if (var29 == 21 && field880 == 20) {
                    field873 = 7;
                } else if (var29 == 2) {
                    field873 = 9;
                } else if (var29 == 15 && field880 == 40) {
                    field916.field1467 = -1;
                    field873 = 13;
                } else if (var29 == 23 && field907 < 1) {
                    field907++;
                    field873 = 0;
                } else if (var29 == 29) {
                    field873 = 11;
                } else {
                    method46(var29);
                    return;
                }
            }
            if (field873 == 7 && var1.method2816() > 0) {
                field908 = (var1.method2809() + 3) * 60;
                field873 = 8;
            }
            if (field873 == 8) {
                field906 = 0;
                class92.method1073(class237.field3207, class237.field3228, field908 / 60 + class237.field3003);
                if (--field908 <= 0) {
                    field873 = 0;
                }
            } else {
                if (field873 == 9 && var1.method2816() >= 13) {
                    boolean var30 = var1.method2809() == 1;
                    var1.method2813(var2.field2528, 0, 4);
                    var2.field2529 = 0;
                    boolean var31 = false;
                    if (var30) {
                        int var32 = var2.method3282() << 24;
                        int var33 = var32 | var2.method3282() << 16;
                        int var34 = var33 | var2.method3282() << 8;
                        int var35 = var34 | var2.method3282();
                        String var36 = class92.field1360;
                        int var37 = var36.length();
                        int var38 = 0;
                        int var39 = 0;
                        while (true) {
                            if (var39 >= var37) {
                                if (Statics.field2727.field1234.size() >= 10 && !Statics.field2727.field1234.containsKey(var38)) {
                                    Iterator var42 = Statics.field2727.field1234.entrySet().iterator();
                                    var42.next();
                                    var42.remove();
                                }
                                Statics.field2727.field1234.put(var38, var35);
                                break;
                            }
                            var38 = (var38 << 5) - var38 + var36.charAt(var39);
                            var39++;
                        }
                    }
                    if (class92.field1362) {
                        Statics.field2727.field1238 = class92.field1360;
                    } else {
                        Statics.field2727.field1238 = null;
                    }
                    class81.method1488();
                    field1023 = var1.method2809();
                    field984 = var1.method2809() == 1;
                    field977 = var1.method2809();
                    field977 <<= 0x8;
                    field977 += var1.method2809();
                    field978 = var1.method2809();
                    var1.method2813(var2.field2528, 0, 1);
                    var2.field2529 = 0;
                    class171[] var43 = new class171[] { class171.field2307, class171.field2302, class171.field2259, class171.field2251, class171.field2248, class171.field2253, class171.field2252, class171.field2327, class171.field2256, class171.field2257, class171.field2258, class171.field2255, class171.field2260, class171.field2261, class171.field2312, class171.field2263, class171.field2295, class171.field2265, class171.field2274, class171.field2267, class171.field2268, class171.field2269, class171.field2270, class171.field2271, class171.field2272, class171.field2273, class171.field2287, class171.field2275, class171.field2276, class171.field2297, class171.field2278, class171.field2279, class171.field2280, class171.field2281, class171.field2282, class171.field2283, class171.field2284, class171.field2304, class171.field2286, class171.field2318, class171.field2288, class171.field2289, class171.field2290, class171.field2291, class171.field2305, class171.field2293, class171.field2277, class171.field2254, class171.field2296, class171.field2308, class171.field2298, class171.field2299, class171.field2300, class171.field2264, class171.field2294, class171.field2303, class171.field2249, class171.field2250, class171.field2306, class171.field2321, class171.field2266, class171.field2309, class171.field2310, class171.field2311, class171.field2319, class171.field2313, class171.field2314, class171.field2315, class171.field2316, class171.field2317, class171.field2301, class171.field2292, class171.field2320, class171.field2262, class171.field2322, class171.field2323, class171.field2324, class171.field2325, class171.field2326, class171.field2285, class171.field2328 };
                    int var45 = var2.method3284();
                    if (var45 < 0 || var45 >= var43.length) {
                        throw new IOException(var45 + " " + var2.field2529);
                    }
                    field916.field1465 = var43[var45];
                    field916.field1467 = field916.field1465.field2330;
                    var1.method2813(var2.field2528, 0, 2);
                    var2.field2529 = 0;
                    field916.field1467 = var2.method3015();
                    try {
                        class53.method669(Statics.field2183, "zap");
                    } catch (Throwable var71) {
                    }
                    field873 = 10;
                }
                if (field873 != 10) {
                    if (field873 == 11 && var1.method2816() >= 2) {
                        var2.field2529 = 0;
                        var1.method2813(var2.field2528, 0, 2);
                        var2.field2529 = 0;
                        Statics.field827 = var2.method3015();
                        field873 = 12;
                    }
                    if (field873 == 12 && var1.method2816() >= Statics.field827) {
                        var2.field2529 = 0;
                        var1.method2813(var2.field2528, 0, Statics.field827);
                        var2.field2529 = 0;
                        String var62 = var2.method3030();
                        String var63 = var2.method3030();
                        String var64 = var2.method3030();
                        class92.method1073(var62, var63, var64);
                        method1076(10);
                    }
                    if (field873 == 13) {
                        if (field916.field1467 == -1) {
                            if (var1.method2816() < 2) {
                                return;
                            }
                            var1.method2813(var2.field2528, 0, 2);
                            var2.field2529 = 0;
                            field916.field1467 = var2.method3015();
                        }
                        if (var1.method2816() >= field916.field1467) {
                            var1.method2813(var2.field2528, 0, field916.field1467);
                            var2.field2529 = 0;
                            int var65 = field916.field1467;
                            field895.method4690();
                            field916.method1760();
                            field916.field1464.field2529 = 0;
                            field916.field1465 = null;
                            field916.field1460 = null;
                            field916.field1471 = null;
                            field916.field1468 = null;
                            field916.field1467 = 0;
                            field916.field1466 = 0;
                            field890 = 0;
                            method4460();
                            field1090 = 0;
                            field1013 = 0;
                            for (int var66 = 0; var66 < 2048; var66++) {
                                field900[var66] = null;
                            }
                            Statics.field289 = null;
                            for (int var67 = 0; var67 < field1110.length; var67++) {
                                class86 var68 = field1110[var67];
                                if (var68 != null) {
                                    var68.field1195 = -1;
                                    var68.field1177 = false;
                                }
                            }
                            class64.field755 = new class202(32);
                            method1076(30);
                            for (int var69 = 0; var69 < 100; var69++) {
                                field1042[var69] = true;
                            }
                            method3312();
                            class95.method4522(var2);
                            if (var2.field2529 != var65) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field906++;
                        if (field906 > 2000) {
                            if (field907 < 1) {
                                if (Statics.field2481 == Statics.field2046) {
                                    Statics.field2481 = Statics.field2111;
                                } else {
                                    Statics.field2481 = Statics.field2046;
                                }
                                field907++;
                                field873 = 0;
                            } else {
                                method46(-3);
                            }
                        }
                    }
                } else if (var1.method2816() >= field916.field1467) {
                    var2.field2529 = 0;
                    var1.method2813(var2.field2528, 0, field916.field1467);
                    field895.method4688();
                    field884 = 1L;
                    field1031 = -1;
                    Statics.field2099.field819 = 0;
                    Statics.field2534 = true;
                    field888 = true;
                    field898 = -1L;
                    class294.method4647();
                    field916.method1760();
                    field916.field1464.field2529 = 0;
                    field916.field1465 = null;
                    field916.field1460 = null;
                    field916.field1471 = null;
                    field916.field1468 = null;
                    field916.field1467 = 0;
                    field916.field1466 = 0;
                    field890 = 0;
                    field1085 = 0;
                    field943 = 0;
                    method4460();
                    class60.method3912(0);
                    class97.field1430.clear();
                    class97.field1426.method3378();
                    class97.field1425.method3555();
                    class97.field1428 = 0;
                    field1041 = 0;
                    field1128 = false;
                    field1026 = 0;
                    field940 = 0;
                    field1090 = 0;
                    field1083 = -1;
                    field1013 = 0;
                    field946 = 0;
                    field899 = class91.field1335;
                    field947 = class91.field1335;
                    field1049 = 0;
                    class95.field1406 = 0;
                    for (int var47 = 0; var47 < 2048; var47++) {
                        class95.field1405[var47] = null;
                        class95.field1402[var47] = 1;
                    }
                    for (int var48 = 0; var48 < 2048; var48++) {
                        field900[var48] = null;
                    }
                    for (int var49 = 0; var49 < 32768; var49++) {
                        field1110[var49] = null;
                    }
                    field975 = -1;
                    field988.method3486();
                    field989.method3486();
                    for (int var50 = 0; var50 < 4; var50++) {
                        for (int var51 = 0; var51 < 104; var51++) {
                            for (int var52 = 0; var52 < 104; var52++) {
                                field986[var50][var51][var52] = null;
                            }
                        }
                    }
                    field987 = new class205();
                    field1078 = 0;
                    field1121 = 0;
                    field1032 = 0;
                    for (int var53 = 0; var53 < Statics.field3379; var53++) {
                        class253 var54 = class253.method1603(var53);
                        if (var54 != null) {
                            class223.field2725[var53] = 0;
                            class223.field2726[var53] = 0;
                        }
                    }
                    Statics.field2177.method1679();
                    field1048 = -1;
                    if (field1016 != -1) {
                        int var55 = field1016;
                        if (var55 != -1 && Statics.field3410[var55]) {
                            Statics.field2755.method3930(var55);
                            if (Statics.field2754[var55] != null) {
                                boolean var56 = true;
                                for (int var57 = 0; var57 < Statics.field2754[var55].length; var57++) {
                                    if (Statics.field2754[var55][var57] != null) {
                                        if (Statics.field2754[var55][var57].field2765 == 2) {
                                            var56 = false;
                                        } else {
                                            Statics.field2754[var55][var57] = null;
                                        }
                                    }
                                }
                                if (var56) {
                                    Statics.field2754[var55] = null;
                                }
                                Statics.field3410[var55] = false;
                            }
                        }
                    }
                    for (class68 var58 = (class68) field1017.method3419(); var58 != null; var58 = (class68) field1017.method3415()) {
                        method132(var58, true);
                    }
                    field1016 = -1;
                    field1017 = new class202(8);
                    field1020 = null;
                    method4460();
                    field1127.method3793((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var59 = 0; var59 < 8; var59++) {
                        field982[var59] = null;
                        field983[var59] = false;
                    }
                    class64.field755 = new class202(32);
                    field882 = true;
                    for (int var60 = 0; var60 < 100; var60++) {
                        field1042[var60] = true;
                    }
                    method3312();
                    field955 = null;
                    Statics.field3303 = 0;
                    Statics.field1559 = null;
                    for (int var61 = 0; var61 < 8; var61++) {
                        field1130[var61] = new class17();
                    }
                    Statics.field308 = null;
                    class95.method4522(var2);
                    Statics.field725 = -1;
                    method994(false, var2);
                    field916.field1465 = null;
                }
            }
        } catch (IOException var72) {
            if (field907 < 1) {
                if (Statics.field2481 == Statics.field2046) {
                    Statics.field2481 = Statics.field2111;
                } else {
                    Statics.field2481 = Statics.field2046;
                }
                field907++;
                field873 = 0;
            } else {
                method46(-2);
            }
        }
    }

    @ObfuscatedName("z.fz(II)V")
    public static void method46(int arg0) {
        if (arg0 == -3) {
            class92.method1073(class237.field3004, class237.field2996, class237.field3006);
        } else if (arg0 == -2) {
            class92.method1073(class237.field3237, class237.field3008, class237.field3009);
        } else if (arg0 == -1) {
            class92.method1073(class237.field3010, class237.field2962, class237.field3001);
        } else if (arg0 == 3) {
            class92.field1355 = 3;
        } else if (arg0 == 4) {
            class92.method1073(class237.field3013, class237.field3014, class237.field3015);
        } else if (arg0 == 5) {
            class92.method1073(class237.field3156, class237.field3152, class237.field3018);
        } else if (arg0 == 6) {
            class92.method1073(class237.field3109, class237.field2969, class237.field2988);
        } else if (arg0 == 7) {
            class92.method1073(class237.field3022, class237.field3023, class237.field3150);
        } else if (arg0 == 8) {
            class92.method1073(class237.field3025, class237.field3026, class237.field3027);
        } else if (arg0 == 9) {
            class92.method1073(class237.field3124, class237.field3029, class237.field3030);
        } else if (arg0 == 10) {
            class92.method1073(class237.field3031, class237.field3024, class237.field2984);
        } else if (arg0 == 11) {
            class92.method1073(class237.field3034, class237.field3035, class237.field3036);
        } else if (arg0 == 12) {
            class92.method1073(class237.field3037, class237.field3038, class237.field3201);
        } else if (arg0 == 13) {
            class92.method1073(class237.field3040, class237.field3041, class237.field3042);
        } else if (arg0 == 14) {
            class92.method1073(class237.field3043, class237.field3044, class237.field3045);
        } else if (arg0 == 16) {
            class92.method1073(class237.field3046, class237.field3147, class237.field3048);
        } else if (arg0 == 17) {
            class92.method1073(class237.field3049, class237.field2965, class237.field3153);
        } else if (arg0 == 18) {
            class92.method1073(class237.field3229, class237.field3053, class237.field3185);
        } else if (arg0 == 19) {
            class92.method1073(class237.field3055, class237.field3151, class237.field3146);
        } else if (arg0 == 20) {
            class92.method1073(class237.field3058, class237.field3173, class237.field3060);
        } else if (arg0 == 22) {
            class92.method1073(class237.field3061, class237.field3086, class237.field3057);
        } else if (arg0 == 23) {
            class92.method1073(class237.field3064, class237.field3127, class237.field3066);
        } else if (arg0 == 24) {
            class92.method1073(class237.field3067, class237.field3068, class237.field3069);
        } else if (arg0 == 25) {
            class92.method1073(class237.field3062, class237.field3071, class237.field3072);
        } else if (arg0 == 26) {
            class92.method1073(class237.field3073, class237.field3074, class237.field3075);
        } else if (arg0 == 27) {
            class92.method1073(class237.field3076, class237.field3077, class237.field3108);
        } else if (arg0 == 31) {
            class92.method1073(class237.field3085, class237.field2977, class237.field3087);
        } else if (arg0 == 32) {
            class92.method1073(class237.field3088, class237.field3089, class237.field3198);
        } else if (arg0 == 37) {
            class92.method1073(class237.field3091, class237.field3092, class237.field3093);
        } else if (arg0 == 38) {
            class92.method1073(class237.field2991, class237.field3095, class237.field3096);
        } else if (arg0 == 55) {
            class92.method1073(class237.field3140, class237.field2970, class237.field2985);
        } else if (arg0 == 56) {
            class92.method1073(class237.field2967, class237.field3101, class237.field3102);
            method1076(11);
            return;
        } else if (arg0 == 57) {
            class92.method1073(class237.field3103, class237.field3104, class237.field3105);
            method1076(11);
            return;
        } else {
            class92.method1073(class237.field3106, class237.field3002, class237.field3090);
        }
        method1076(10);
    }

    @ObfuscatedName("v.fa(I)V")
    public static final void method1() {
        field916.method1751();
        method2950();
        Statics.field566.method2520();
        for (int var0 = 0; var0 < 4; var0++) {
            field928[var0].method2904();
        }
        System.gc();
        class215.field2632 = 1;
        Statics.field2633 = null;
        Statics.field811 = -1;
        Statics.field3475 = -1;
        Statics.field478 = 0;
        Statics.field2628 = false;
        Statics.field3712 = 2;
        field1092 = -1;
        field992 = false;
        for (class82 var1 = (class82) class82.field1248.method3492(); var1 != null; var1 = (class82) class82.field1248.method3481()) {
            if (var1.field1250 != null) {
                Statics.field1329.method1773(var1.field1250);
                var1.field1250 = null;
            }
            if (var1.field1251 != null) {
                Statics.field1329.method1773(var1.field1251);
                var1.field1251 = null;
            }
        }
        class82.field1248.method3486();
        method1076(10);
    }

    @ObfuscatedName("fz.fc(I)V")
    public static final void method2950() {
        class271.method2738();
        class258.method2712();
        class259.method677();
        class267.method2989();
        class270.field3636.method3409();
        class270.field3640.method3409();
        class268.method2710();
        class272.field3686.method3409();
        class272.field3687.method3409();
        class257.method10();
        class262.field3471.method3409();
        class253.field3377.method3409();
        class266.field3507.method3409();
        class266.field3501.method3409();
        class266.field3502.method3409();
        class260.field3453.method3409();
        class260.field3460.method3409();
        class264.field3486.method3409();
        class263.field3481.method3409();
        class254.field3393.method3409();
        class225.method159();
        class228.field2870.method3409();
        class228.field2758.method3409();
        class228.field2759.method3409();
        class228.field2760.method3409();
        ((class125) Statics.field1925).method2220();
        class98.field1436.method3409();
        Statics.field1296.method3982();
        Statics.field2024.method3982();
        Statics.field573.method3982();
        Statics.field320.method3982();
        Statics.field746.method3982();
        Statics.field355.method3982();
        Statics.field697.method3982();
        Statics.field2027.method3982();
        Statics.field18.method3982();
        Statics.field719.method3982();
        Statics.field2139.method3982();
        Statics.field2191.method3982();
    }

    @ObfuscatedName("bi.fd(I)V")
    public static final void method928() {
        if (field1085 > 0) {
            method1();
        } else {
            field895.method4686();
            method1076(40);
            Statics.field526 = field916.method1753();
            field916.method1752();
        }
    }

    @ObfuscatedName("an.fw(ZI)V")
    public static final void method625(boolean arg0) {
        if (arg0) {
            field909 = class92.field1368 ? class151.field2107 : class151.field2109;
            return;
        }
        LinkedHashMap var1 = Statics.field2727.field1234;
        String var2 = class92.field1360;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field909 = var1.containsKey(var4) ? class151.field2112 : class151.field2108;
    }

    @ObfuscatedName("client.fb(B)V")
    public final void method1083() {
        if (field890 > 1) {
            field890--;
        }
        if (field1085 > 0) {
            field1085--;
        }
        if (field1011) {
            field1011 = false;
            method928();
            return;
        }
        if (!field994) {
            method4460();
            field1000[0] = class237.field3063;
            field1001[0] = "";
            field1125[0] = 1006;
            field933[0] = false;
            field1081 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1087(field916); var1++) {
        }
        if (field880 != 30) {
            return;
        }
        while (class294.method69()) {
            class175 var2 = class175.method3892(class172.field2331, field916.field1463);
            var2.field2451.method3157(0);
            int var3 = var2.field2451.field2529;
            class294.method2794(var2.field2451);
            var2.field2451.method3018(var2.field2451.field2529 - var3);
            field916.method1747(var2);
        }
        if (field895.field3803) {
            class175 var4 = class175.method3892(class172.field2387, field916.field1463);
            var4.field2451.method3157(0);
            int var5 = var4.field2451.field2529;
            field895.method4684(var4.field2451);
            var4.field2451.method3018(var4.field2451.field2529 - var5);
            field916.method1747(var4);
            field895.method4689();
        }
        Object var6 = Statics.field2099.field814;
        synchronized (Statics.field2099.field814) {
            if (!field903) {
                Statics.field2099.field819 = 0;
            } else if (class60.field711 != 0 || Statics.field2099.field819 >= 40) {
                class175 var7 = class175.method3892(class172.field2408, field916.field1463);
                var7.field2451.method3157(0);
                int var8 = var7.field2451.field2529;
                int var9 = 0;
                for (int var10 = 0; var10 < Statics.field2099.field819 && var7.field2451.field2529 - var8 < 240; var10++) {
                    var9++;
                    int var11 = Statics.field2099.field817[var10];
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 502) {
                        var11 = 502;
                    }
                    int var12 = Statics.field2099.field816[var10];
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 764) {
                        var12 = 764;
                    }
                    int var13 = var11 * 765 + var12;
                    if (Statics.field2099.field817[var10] == -1 && Statics.field2099.field816[var10] == -1) {
                        var12 = -1;
                        var11 = -1;
                        var13 = 524287;
                    }
                    if (field885 != var12 || field1022 != var11) {
                        int var14 = var12 - field885;
                        field885 = var12;
                        int var15 = var11 - field1022;
                        field1022 = var11;
                        if (field1031 < 8 && var14 >= -32 && var14 <= 31 && var15 >= -32 && var15 <= 31) {
                            var14 += 32;
                            var15 += 32;
                            var7.field2451.method3006((field1031 << 12) + (var14 << 6) + var15);
                            field1031 = 0;
                        } else if (field1031 < 8) {
                            var7.field2451.method3153((field1031 << 19) + 8388608 + var13);
                            field1031 = 0;
                        } else {
                            var7.field2451.method3005((field1031 << 19) + -1073741824 + var13);
                            field1031 = 0;
                        }
                    } else if (field1031 < 2047) {
                        field1031++;
                    }
                }
                var7.field2451.method3018(var7.field2451.field2529 - var8);
                field916.method1747(var7);
                if (var9 >= Statics.field2099.field819) {
                    Statics.field2099.field819 = 0;
                } else {
                    Statics.field2099.field819 -= var9;
                    for (int var16 = 0; var16 < Statics.field2099.field819; var16++) {
                        Statics.field2099.field816[var16] = Statics.field2099.field816[var9 + var16];
                        Statics.field2099.field817[var16] = Statics.field2099.field817[var9 + var16];
                    }
                }
            }
        }
        if (class60.field711 == 1 || !Statics.field565 && class60.field711 == 4 || class60.field711 == 2) {
            long var18 = (class60.field717 - field884 * -1L) / 50L;
            if (var18 > 4095L) {
                var18 = 4095L;
            }
            field884 = class60.field717 * -1L;
            int var20 = class60.field714;
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > Statics.field358) {
                var20 = Statics.field358;
            }
            int var21 = class60.field710;
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > Statics.field1320) {
                var21 = Statics.field1320;
            }
            int var22 = (int) var18;
            class175 var23 = class175.method3892(class172.field2334, field916.field1463);
            var23.field2451.method3006((class60.field711 == 2 ? 1 : 0) + (var22 << 1));
            var23.field2451.method3006(var21);
            var23.field2451.method3006(var20);
            field916.method1747(var23);
        }
        if (class51.field616 > 0) {
            class175 var24 = class175.method3892(class172.field2386, field916.field1463);
            var24.field2451.method3006(0);
            int var25 = var24.field2451.field2529;
            long var26 = class187.method938();
            for (int var28 = 0; var28 < class51.field616; var28++) {
                long var29 = var26 - field898;
                if (var29 > 16777215L) {
                    var29 = 16777215L;
                }
                field898 = var26;
                var24.field2451.method3048(class51.field615[var28]);
                var24.field2451.method3063((int) var29);
            }
            var24.field2451.method3017(var24.field2451.field2529 - var25);
            field916.method1747(var24);
        }
        if (field1120 > 0) {
            field1120--;
        }
        if (class51.field609[96] || class51.field609[97] || class51.field609[98] || class51.field609[99]) {
            field1103 = true;
        }
        if (field1103 && field1120 <= 0) {
            field1120 = 20;
            field1103 = false;
            class175 var31 = class175.method3892(class172.field2405, field916.field1463);
            var31.field2451.method3006(field940);
            var31.field2451.method3006(field1093);
            field916.method1747(var31);
        }
        if (Statics.field2534 && !field888) {
            field888 = true;
            class175 var32 = class175.method3892(class172.field2372, field916.field1463);
            var32.field2451.method3157(1);
            field916.method1747(var32);
        }
        if (!Statics.field2534 && field888) {
            field888 = false;
            class175 var33 = class175.method3892(class172.field2372, field916.field1463);
            var33.field2451.method3157(0);
            field916.method1747(var33);
        }
        method2();
        if (field880 != 30) {
            return;
        }
        method3261();
        int var10002;
        for (int var34 = 0; var34 < field1026; var34++) {
            var10002 = field1099[var34]--;
            if (field1099[var34] >= -10) {
                class105 var36 = field1101[var34];
                if (var36 == null) {
                    class105 var10000 = (class105) null;
                    var36 = class105.method1831(Statics.field320, field1097[var34], 0);
                    if (var36 == null) {
                        continue;
                    }
                    field1099[var34] += var36.method1843();
                    field1101[var34] = var36;
                }
                if (field1099[var34] < 0) {
                    int var43;
                    if (field1100[var34] == 0) {
                        var43 = field904;
                    } else {
                        int var37 = (field1100[var34] & 0xFF) * 128;
                        int var38 = field1100[var34] >> 16 & 0xFF;
                        int var39 = var38 * 128 + 64 - Statics.field289.field1155;
                        if (var39 < 0) {
                            var39 = -var39;
                        }
                        int var40 = field1100[var34] >> 8 & 0xFF;
                        int var41 = var40 * 128 + 64 - Statics.field289.field1151;
                        if (var41 < 0) {
                            var41 = -var41;
                        }
                        int var42 = var39 + var41 - 128;
                        if (var42 > var37) {
                            field1099[var34] = -100;
                            continue;
                        }
                        if (var42 < 0) {
                            var42 = 0;
                        }
                        var43 = field1095 * (var37 - var42) / var37;
                    }
                    if (var43 > 0) {
                        class107 var44 = var36.method1830().method1874(Statics.field344);
                        class117 var45 = class117.method2087(var44, 100, var43);
                        var45.method2001(field1028[var34] - 1);
                        Statics.field1329.method1787(var45);
                    }
                    field1099[var34] = -100;
                }
            } else {
                field1026--;
                for (int var35 = var34; var35 < field1026; var35++) {
                    field1097[var35] = field1097[var35 + 1];
                    field1101[var35] = field1101[var35 + 1];
                    field1028[var35] = field1028[var35 + 1];
                    field1099[var35] = field1099[var35 + 1];
                    field1100[var35] = field1100[var35 + 1];
                }
                var34--;
            }
        }
        if (field992) {
            boolean var46;
            if (class215.field2632 == 0) {
                var46 = Statics.field2631.method3577();
            } else {
                var46 = true;
            }
            if (!var46) {
                if (field1091 != 0 && field1092 != -1) {
                    class215.method1490(Statics.field355, field1092, 0, field1091, false);
                }
                field992 = false;
            }
        }
        field916.field1466++;
        if (field916.field1466 > 750) {
            method928();
            return;
        }
        method231();
        Statics.method1448();
        int[] var47 = class95.field1410;
        for (int var48 = 0; var48 < class95.field1406; var48++) {
            class74 var49 = field900[var47[var48]];
            if (var49 != null && var49.field1170 > 0) {
                var49.field1170--;
                if (var49.field1170 == 0) {
                    var49.field1163 = null;
                }
            }
        }
        for (int var50 = 0; var50 < field1049; var50++) {
            int var51 = field913[var50];
            class86 var52 = field1110[var51];
            if (var52 != null && var52.field1170 > 0) {
                var52.field1170--;
                if (var52.field1170 == 0) {
                    var52.field1163 = null;
                }
            }
        }
        field945++;
        if (field966 != 0) {
            field965 += 20;
            if (field965 >= 400) {
                field966 = 0;
            }
        }
        if (Statics.field439 != null) {
            field967++;
            if (field967 >= 15) {
                method211(Statics.field439);
                Statics.field439 = null;
            }
        }
        class228 var53 = Statics.field240;
        class228 var54 = Statics.field1666;
        Statics.field240 = null;
        Statics.field1666 = null;
        field1033 = null;
        field1037 = false;
        field1034 = false;
        field1077 = 0;
        while (class51.method312() && field1077 < 128) {
            if (field1023 >= 2 && class51.field609[82] && Statics.field1684 == 66) {
                String var55 = "";
                Iterator var56 = class97.field1426.iterator();
                while (var56.hasNext()) {
                    class72 var57 = (class72) var56.next();
                    var55 = var55 + var57.field823 + ':' + var57.field831 + '\n';
                }
                Statics.field2183.method738(var55);
            } else {
                field1079[field1077] = Statics.field1684;
                field877[field1077] = Statics.field492;
                field1077++;
            }
        }
        boolean var60 = field1023 >= 2;
        if (var60 && class51.field609[82] && class51.field609[81] && field1054 != 0) {
            int var61 = Statics.field289.field857 - field1054;
            if (var61 < 0) {
                var61 = 0;
            } else if (var61 > 3) {
                var61 = 3;
            }
            if (Statics.field289.field857 != var61) {
                method13(Statics.field2458 + Statics.field289.field1199[0], Statics.field1288 + Statics.field289.field1164[0], var61);
            }
            field1054 = 0;
        }
        if (field1016 != -1) {
            method481(field1016, 0, 0, Statics.field1320, Statics.field358, 0, 0);
        }
        field953++;
        while (true) {
            class69 var62;
            class228 var63;
            class228 var64;
            do {
                var62 = (class69) field1056.method3485();
                if (var62 == null) {
                    while (true) {
                        class69 var65;
                        class228 var66;
                        class228 var67;
                        do {
                            var65 = (class69) field1057.method3485();
                            if (var65 == null) {
                                while (true) {
                                    class69 var68;
                                    class228 var69;
                                    class228 var70;
                                    do {
                                        var68 = (class69) field1055.method3485();
                                        if (var68 == null) {
                                            this.method1333();
                                            method3672();
                                            if (field1029 != null) {
                                                this.method1229();
                                            }
                                            if (Statics.field2041 != null) {
                                                method211(Statics.field2041);
                                                field974++;
                                                if (class60.field704 == 0) {
                                                    if (field973) {
                                                        if (Statics.field2541 == Statics.field2041 && field969 != field1021) {
                                                            class228 var71 = Statics.field2041;
                                                            byte var72 = 0;
                                                            if (field1019 == 1 && var71.field2862 == 206) {
                                                                var72 = 1;
                                                            }
                                                            if (var71.field2881[field1021] <= 0) {
                                                                var72 = 0;
                                                            }
                                                            int var73 = method1563(var71);
                                                            boolean var74 = (var73 >> 29 & 0x1) != 0;
                                                            if (var74) {
                                                                int var75 = field969;
                                                                int var76 = field1021;
                                                                var71.field2881[var76] = var71.field2881[var75];
                                                                var71.field2882[var76] = var71.field2882[var75];
                                                                var71.field2881[var75] = -1;
                                                                var71.field2882[var75] = 0;
                                                            } else if (var72 == 1) {
                                                                int var77 = field969;
                                                                int var78 = field1021;
                                                                while (var77 != var78) {
                                                                    if (var77 > var78) {
                                                                        var71.method3830(var77 - 1, var77);
                                                                        var77--;
                                                                    } else if (var77 < var78) {
                                                                        var71.method3830(var77 + 1, var77);
                                                                        var77++;
                                                                    }
                                                                }
                                                            } else {
                                                                var71.method3830(field1021, field969);
                                                            }
                                                            class175 var79 = class175.method3892(class172.field2349, field916.field1463);
                                                            var79.field2451.method3006(field1021);
                                                            var79.field2451.method3047(var72);
                                                            var79.field2451.method3067(Statics.field2041.field2763);
                                                            var79.field2451.method3006(field969);
                                                            field916.method1747(var79);
                                                        }
                                                    } else if (this.method1386()) {
                                                        this.method1090(field970, field971);
                                                    } else if (field1081 > 0) {
                                                        int var80 = field970;
                                                        int var81 = field971;
                                                        method576(Statics.field1456, var80, var81);
                                                        Statics.field1456 = null;
                                                    }
                                                    field967 = 10;
                                                    class60.field711 = 0;
                                                    Statics.field2041 = null;
                                                } else if (field974 >= 5 && (class60.field705 > field970 + 5 || class60.field705 < field970 - 5 || class60.field706 > field971 + 5 || class60.field706 < field971 - 5)) {
                                                    field973 = true;
                                                }
                                            }
                                            if (class139.method2559()) {
                                                int var82 = class139.field1995;
                                                int var83 = class139.field1996;
                                                class175 var84 = class175.method3892(class172.field2396, field916.field1463);
                                                var84.field2451.method3157(5);
                                                var84.field2451.method3125(Statics.field2458 + var82);
                                                var84.field2451.method3047(class51.field609[82] ? (class51.field609[81] ? 2 : 1) : 0);
                                                var84.field2451.method3055(Statics.field1288 + var83);
                                                field916.method1747(var84);
                                                class139.method2560();
                                                field963 = class60.field710;
                                                field964 = class60.field714;
                                                field966 = 1;
                                                field965 = 0;
                                                field1013 = var82;
                                                field946 = var83;
                                            }
                                            if (Statics.field240 != var53) {
                                                if (var53 != null) {
                                                    method211(var53);
                                                }
                                                if (Statics.field240 != null) {
                                                    method211(Statics.field240);
                                                }
                                            }
                                            if (Statics.field1666 != var54 && field1008 == field1007) {
                                                if (var54 != null) {
                                                    method211(var54);
                                                }
                                                if (Statics.field1666 != null) {
                                                    method211(Statics.field1666);
                                                }
                                            }
                                            if (Statics.field1666 == null) {
                                                if (field1007 > 0) {
                                                    field1007--;
                                                }
                                            } else if (field1007 < field1008) {
                                                field1007++;
                                                if (field1008 == field1007) {
                                                    method211(Statics.field1666);
                                                }
                                            }
                                            method998();
                                            if (field1102) {
                                                method681();
                                            }
                                            for (int var85 = 0; var85 < 5; var85++) {
                                                var10002 = field1044[var85]++;
                                            }
                                            Statics.field2177.method1683();
                                            int var86 = class60.method972();
                                            int var87 = class51.method2423();
                                            if (var86 > 15000 && var87 > 15000) {
                                                field1085 = 250;
                                                class60.method3912(14500);
                                                class175 var88 = class175.method3892(class172.field2364, field916.field1463);
                                                field916.method1747(var88);
                                            }
                                            for (class67 var89 = (class67) field1124.method3519(); var89 != null; var89 = (class67) field1124.method3520()) {
                                                if ((long) var89.field788 < class187.method938() / 1000L - 5L) {
                                                    if (var89.field786 > 0) {
                                                        class97.method1495(5, "", var89.field784 + class237.field3167);
                                                    }
                                                    if (var89.field786 == 0) {
                                                        class97.method1495(5, "", var89.field784 + class237.field3139);
                                                    }
                                                    var89.method3529();
                                                }
                                            }
                                            field916.field1469++;
                                            if (field916.field1469 > 50) {
                                                class175 var90 = class175.method3892(class172.field2348, field916.field1463);
                                                field916.method1747(var90);
                                            }
                                            try {
                                                field916.method1749();
                                            } catch (IOException var92) {
                                                method928();
                                            }
                                            return;
                                        }
                                        var69 = var68.field797;
                                        if (var69.field2764 < 0) {
                                            break;
                                        }
                                        var70 = class228.method2725(var69.field2782);
                                    } while (var70 == null || var70.field2887 == null || var69.field2764 >= var70.field2887.length || var70.field2887[var69.field2764] != var69);
                                    class83.method1505(var68);
                                }
                            }
                            var66 = var65.field797;
                            if (var66.field2764 < 0) {
                                break;
                            }
                            var67 = class228.method2725(var66.field2782);
                        } while (var67 == null || var67.field2887 == null || var66.field2764 >= var67.field2887.length || var67.field2887[var66.field2764] != var66);
                        class83.method1505(var65);
                    }
                }
                var63 = var62.field797;
                if (var63.field2764 < 0) {
                    break;
                }
                var64 = class228.method2725(var63.field2782);
            } while (var64 == null || var64.field2887 == null || var63.field2764 >= var64.field2887.length || var64.field2887[var63.field2764] != var63);
            class83.method1505(var62);
        }
    }

    @ObfuscatedName("jf.fg(B)V")
    public static final void method4524() {
        if (Statics.field2101 != null) {
            Statics.field2101.method1915();
        }
        if (Statics.field2025 != null) {
            Statics.field2025.method1915();
        }
    }

    @ObfuscatedName("fh.gk(Ljs;IIII)V")
    public static void method2920(class272 arg0, int arg1, int arg2, int arg3) {
        if (field1026 >= 50 || field1095 == 0 || arg0.field3691 == null || arg1 >= arg0.field3691.length) {
            return;
        }
        int var4 = arg0.field3691[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1097[field1026] = var5;
        field1028[field1026] = var6;
        field1099[field1026] = 0;
        field1101[field1026] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1100[field1026] = (var8 << 16) + (var9 << 8) + var7;
        field1026++;
    }

    @ObfuscatedName("ak.gp(II)V")
    public static void method580(int arg0) {
        if (arg0 == -1 && !field992) {
            Statics.field2631.method3576();
            class215.field2632 = 1;
            Statics.field2633 = null;
        } else if (arg0 != -1 && field1092 != arg0 && field1091 != 0 && !field992) {
            class249 var1 = Statics.field355;
            int var2 = field1091;
            class215.field2632 = 1;
            Statics.field2633 = var1;
            Statics.field811 = arg0;
            Statics.field3475 = 0;
            Statics.field478 = var2;
            Statics.field2628 = false;
            Statics.field3712 = 2;
        }
        field1092 = arg0;
    }

    @ObfuscatedName("am.gv(III)V")
    public static void method457(int arg0, int arg1) {
        if (field1091 != 0 && arg0 != -1) {
            class215.method1490(Statics.field2139, arg0, 0, field1091, false);
            field992 = true;
        }
    }

    @ObfuscatedName("v.gg(I)V")
    public static final void method2() {
        if (Statics.field226 == field1083) {
            return;
        }
        field1083 = Statics.field226;
        int var0 = Statics.field226;
        int[] var1 = Statics.field2952.field3857;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field729[var0][var6][var4] & 0x18) == 0) {
                    Statics.field566.method2554(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class62.field729[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field566.method2554(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2952.method4850();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field729[var0][var10][var9] & 0x18) == 0) {
                    method1017(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class62.field729[var0 + 1][var10][var9] & 0x8) != 0) {
                    method1017(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1084 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field566.method2549(Statics.field226, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class267.method1587(var14).field3556;
                    if (var15 >= 0) {
                        field1087[field1084] = Statics.field3384[var15].method4092(false);
                        field1089[field1084] = var11;
                        field1086[field1084] = var12;
                        field1084++;
                    }
                }
            }
        }
        Statics.field475.method4824();
    }

    @ObfuscatedName("eo.ge(Lhq;III)V")
    public static final void method2697(class228 arg0, int arg1, int arg2) {
        if (field1090 != 0 && field1090 != 3 || class60.field711 != 1 && Statics.field565 || class60.field711 != 4) {
            return;
        }
        class222 var3 = arg0.method3835(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field710 - arg1;
        int var5 = class60.field714 - arg2;
        if (!var3.method3767(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2722 / 2;
        int var7 = var5 - var3.field2719 / 2;
        int var8 = field940 & 0x7FF;
        int var9 = class136.field1942[var8];
        int var10 = class136.field1922[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field289.field1155 + var11 >> 7;
        int var14 = Statics.field289.field1151 - var12 >> 7;
        class175 var15 = class175.method3892(class172.field2399, field916.field1463);
        var15.field2451.method3157(18);
        var15.field2451.method3125(Statics.field2458 + var13);
        var15.field2451.method3047(class51.field609[82] ? (class51.field609[81] ? 2 : 1) : 0);
        var15.field2451.method3055(Statics.field1288 + var14);
        var15.field2451.method3157(var6);
        var15.field2451.method3157(var7);
        var15.field2451.method3006(field940);
        var15.field2451.method3157(57);
        var15.field2451.method3157(0);
        var15.field2451.method3157(0);
        var15.field2451.method3157(89);
        var15.field2451.method3006(Statics.field289.field1155);
        var15.field2451.method3006(Statics.field289.field1151);
        var15.field2451.method3157(63);
        field916.method1747(var15);
        field1013 = var13;
        field946 = var14;
    }

    @ObfuscatedName("ea.gj(Ljava/lang/String;I)V")
    public static final void method2439(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2727.field1240 = !Statics.field2727.field1240;
            class81.method1488();
            if (Statics.field2727.field1240) {
                class97.method1495(99, "", "Roofs are now all hidden");
            } else {
                class97.method1495(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field889 = !field889;
        }
        if (field1023 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field225) {
                    class8.field225 = true;
                    class8.field223 = class12.field257;
                } else if (class8.field223 == class12.field257) {
                    class8.field225 = true;
                    class8.field223 = class12.field259;
                } else {
                    class8.field225 = false;
                }
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field889 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field889 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method928();
            }
            if (arg0.equalsIgnoreCase("cs")) {
                class97.method1495(99, "", "" + field919);
            }
            if (arg0.equalsIgnoreCase("errortest") && field995 == 2) {
                throw new RuntimeException();
            }
        }
        class175 var1 = class175.method3892(class172.field2419, field916.field1463);
        var1.field2451.method3157(arg0.length() + 1);
        var1.field2451.method3012(arg0);
        field916.method1747(var1);
    }

    @ObfuscatedName("bq.gn(I)V")
    public static final void method681() {
        int var0 = Statics.field625 * 128 + 64;
        int var1 = Statics.field1457 * 128 + 64;
        int var2 = method919(var0, var1, Statics.field226) - Statics.field783;
        if (Statics.field672 < var0) {
            Statics.field672 += Statics.field328 * (var0 - Statics.field672) / 1000 + Statics.field1273;
            if (Statics.field672 > var0) {
                Statics.field672 = var0;
            }
        }
        if (Statics.field672 > var0) {
            Statics.field672 -= Statics.field328 * (Statics.field672 - var0) / 1000 + Statics.field1273;
            if (Statics.field672 < var0) {
                Statics.field672 = var0;
            }
        }
        if (Statics.field806 < var2) {
            Statics.field806 += Statics.field328 * (var2 - Statics.field806) / 1000 + Statics.field1273;
            if (Statics.field806 > var2) {
                Statics.field806 = var2;
            }
        }
        if (Statics.field806 > var2) {
            Statics.field806 -= Statics.field328 * (Statics.field806 - var2) / 1000 + Statics.field1273;
            if (Statics.field806 < var2) {
                Statics.field806 = var2;
            }
        }
        if (Statics.field702 < var1) {
            Statics.field702 += Statics.field328 * (var1 - Statics.field702) / 1000 + Statics.field1273;
            if (Statics.field702 > var1) {
                Statics.field702 = var1;
            }
        }
        if (Statics.field702 > var1) {
            Statics.field702 -= Statics.field328 * (Statics.field702 - var1) / 1000 + Statics.field1273;
            if (Statics.field702 < var1) {
                Statics.field702 = var1;
            }
        }
        int var3 = Statics.field378 * 128 + 64;
        int var4 = Statics.field872 * 128 + 64;
        int var5 = method919(var3, var4, Statics.field226) - Statics.field787;
        int var6 = var3 - Statics.field672;
        int var7 = var5 - Statics.field806;
        int var8 = var4 - Statics.field702;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1571 < var10) {
            Statics.field1571 += Statics.field629 * (var10 - Statics.field1571) / 1000 + Statics.field2192;
            if (Statics.field1571 > var10) {
                Statics.field1571 = var10;
            }
        }
        if (Statics.field1571 > var10) {
            Statics.field1571 -= Statics.field629 * (Statics.field1571 - var10) / 1000 + Statics.field2192;
            if (Statics.field1571 < var10) {
                Statics.field1571 = var10;
            }
        }
        int var12 = var11 - Statics.field16;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field16 += Statics.field629 * var12 / 1000 + Statics.field2192;
            Statics.field16 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field16 -= Statics.field629 * -var12 / 1000 + Statics.field2192;
            Statics.field16 &= 0x7FF;
        }
        int var13 = var11 - Statics.field16;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field16 = var11;
        }
    }

    @ObfuscatedName("bt.gm(I)V")
    public static final void method998() {
        int var0 = Statics.field289.field1155;
        int var1 = Statics.field289.field1151;
        if (Statics.field3341 - var0 < -500 || Statics.field3341 - var0 > 500 || Statics.field1576 - var1 < -500 || Statics.field1576 - var1 > 500) {
            Statics.field3341 = var0;
            Statics.field1576 = var1;
        }
        if (Statics.field3341 != var0) {
            Statics.field3341 += (var0 - Statics.field3341) / 16;
        }
        if (Statics.field1576 != var1) {
            Statics.field1576 += (var1 - Statics.field1576) / 16;
        }
        if (class60.field704 == 4 && Statics.field565) {
            int var2 = class60.field706 - field997;
            field942 = var2 * 2;
            field997 = var2 == -1 || var2 == 1 ? class60.field706 : (field997 + class60.field706) / 2;
            int var3 = field892 - class60.field705;
            field1080 = var3 * 2;
            field892 = var3 == -1 || var3 == 1 ? class60.field705 : (field892 + class60.field705) / 2;
        } else {
            if (class51.field609[96]) {
                field1080 += (-24 - field1080) / 2;
            } else if (class51.field609[97]) {
                field1080 += (24 - field1080) / 2;
            } else {
                field1080 /= 2;
            }
            if (class51.field609[98]) {
                field942 += (12 - field942) / 2;
            } else if (class51.field609[99]) {
                field942 += (-12 - field942) / 2;
            } else {
                field942 /= 2;
            }
            field997 = class60.field706;
            field892 = class60.field705;
        }
        field940 = field1080 / 2 + field940 & 0x7FF;
        field1093 += field942 / 2;
        if (field1093 < 128) {
            field1093 = 128;
        }
        if (field1093 > 383) {
            field1093 = 383;
        }
        int var4 = Statics.field3341 >> 7;
        int var5 = Statics.field1576 >> 7;
        int var6 = method919(Statics.field3341, Statics.field1576, Statics.field226);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field226;
                    if (var10 < 3 && (class62.field729[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field742[var10][var8][var9];
                    if (var11 > var7) {
                        var7 = var11;
                    }
                }
            }
        }
        int var12 = var7 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (var12 > field948) {
            field948 += (var12 - field948) / 24;
        } else if (var12 < field948) {
            field948 += (var12 - field948) / 80;
        }
    }

    @ObfuscatedName("ad.gr(S)V")
    public static final void method231() {
        int var0 = class95.field1406;
        int[] var1 = class95.field1410;
        for (int var2 = 0; var2 < var0; var2++) {
            class74 var3 = field900[var1[var2]];
            if (var3 != null) {
                method3668(var3, 1);
            }
        }
    }

    @ObfuscatedName("hu.gc(Lbm;II)V")
    public static final void method3668(class78 arg0, int arg1) {
        if (arg0.field1201 > field883) {
            method530(arg0);
        } else if (arg0.field1197 >= field883) {
            method4062(arg0);
        } else {
            arg0.field1179 = arg0.field1150;
            if (arg0.field1204 == 0) {
                arg0.field1208 = 0;
            } else {
                label322: {
                    if (arg0.field1182 != -1 && arg0.field1185 == 0) {
                        class272 var2 = class272.method579(arg0.field1182);
                        if (arg0.field1209 > 0 && var2.field3699 == 0) {
                            arg0.field1208++;
                            break label322;
                        }
                        if (arg0.field1209 <= 0 && var2.field3701 == 0) {
                            arg0.field1208++;
                            break label322;
                        }
                    }
                    int var3 = arg0.field1155;
                    int var4 = arg0.field1151;
                    int var5 = arg0.field1199[arg0.field1204 - 1] * 128 + arg0.field1154 * 64;
                    int var6 = arg0.field1164[arg0.field1204 - 1] * 128 + arg0.field1154 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field1166 = 1280;
                        } else if (var4 > var6) {
                            arg0.field1166 = 1792;
                        } else {
                            arg0.field1166 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field1166 = 768;
                        } else if (var4 > var6) {
                            arg0.field1166 = 256;
                        } else {
                            arg0.field1166 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field1166 = 1024;
                    } else if (var4 > var6) {
                        arg0.field1166 = 0;
                    }
                    byte var7 = arg0.field1152[arg0.field1204 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field1166 - arg0.field1173 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field1159;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field1169;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field1161;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field1176;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field1169;
                        }
                        arg0.field1179 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class86) {
                            var11 = ((class86) arg0).field1298.field3652;
                        }
                        if (var11) {
                            if (arg0.field1173 != arg0.field1166 && arg0.field1195 == -1 && arg0.field1203 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field1204 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field1204 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field1208 > 0 && arg0.field1204 > 1) {
                                var10 = 8;
                                arg0.field1208--;
                            }
                        } else {
                            if (arg0.field1204 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field1204 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field1208 > 0 && arg0.field1204 > 1) {
                                var10 = 8;
                                arg0.field1208--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field1179 == arg0.field1169 && arg0.field1162 != -1) {
                            arg0.field1179 = arg0.field1162;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field1155 += var10;
                                if (arg0.field1155 > var5) {
                                    arg0.field1155 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field1155 -= var10;
                                if (arg0.field1155 < var5) {
                                    arg0.field1155 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field1151 += var10;
                                if (arg0.field1151 > var6) {
                                    arg0.field1151 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field1151 -= var10;
                                if (arg0.field1151 < var6) {
                                    arg0.field1151 = var6;
                                }
                            }
                        }
                        if (arg0.field1155 == var5 && arg0.field1151 == var6) {
                            arg0.field1204--;
                            if (arg0.field1209 > 0) {
                                arg0.field1209--;
                            }
                        }
                    } else {
                        arg0.field1155 = var5;
                        arg0.field1151 = var6;
                        arg0.field1204--;
                        if (arg0.field1209 > 0) {
                            arg0.field1209--;
                        }
                    }
                }
            }
        }
        if (arg0.field1155 < 128 || arg0.field1151 < 128 || arg0.field1155 >= 13184 || arg0.field1151 >= 13184) {
            arg0.field1182 = -1;
            arg0.field1187 = -1;
            arg0.field1201 = 0;
            arg0.field1197 = 0;
            arg0.field1155 = arg0.field1199[0] * 128 + arg0.field1154 * 64;
            arg0.field1151 = arg0.field1164[0] * 128 + arg0.field1154 * 64;
            arg0.method1444();
        }
        if (Statics.field289 == arg0 && (arg0.field1155 < 1536 || arg0.field1151 < 1536 || arg0.field1155 >= 11776 || arg0.field1151 >= 11776)) {
            arg0.field1182 = -1;
            arg0.field1187 = -1;
            arg0.field1201 = 0;
            arg0.field1197 = 0;
            arg0.field1155 = arg0.field1199[0] * 128 + arg0.field1154 * 64;
            arg0.field1151 = arg0.field1164[0] * 128 + arg0.field1154 * 64;
            arg0.method1444();
        }
        method657(arg0);
        arg0.field1153 = false;
        if (arg0.field1179 != -1) {
            class272 var12 = class272.method579(arg0.field1179);
            if (var12 == null || var12.field3688 == null) {
                arg0.field1179 = -1;
            } else {
                arg0.field1181++;
                if (arg0.field1180 < var12.field3688.length && arg0.field1181 > var12.field3690[arg0.field1180]) {
                    arg0.field1181 = 1;
                    arg0.field1180++;
                    method2920(var12, arg0.field1180, arg0.field1155, arg0.field1151);
                }
                if (arg0.field1180 >= var12.field3688.length) {
                    arg0.field1181 = 0;
                    arg0.field1180 = 0;
                    method2920(var12, arg0.field1180, arg0.field1155, arg0.field1151);
                }
            }
        }
        if (arg0.field1187 != -1 && field883 >= arg0.field1190) {
            if (arg0.field1188 < 0) {
                arg0.field1188 = 0;
            }
            int var13 = Statics.method4461(arg0.field1187).field3420;
            if (var13 == -1) {
                arg0.field1187 = -1;
            } else {
                class272 var14 = class272.method579(var13);
                if (var14 == null || var14.field3688 == null) {
                    arg0.field1187 = -1;
                } else {
                    arg0.field1189++;
                    if (arg0.field1188 < var14.field3688.length && arg0.field1189 > var14.field3690[arg0.field1188]) {
                        arg0.field1189 = 1;
                        arg0.field1188++;
                        method2920(var14, arg0.field1188, arg0.field1155, arg0.field1151);
                    }
                    if (arg0.field1188 >= var14.field3688.length && (arg0.field1188 < 0 || arg0.field1188 >= var14.field3688.length)) {
                        arg0.field1187 = -1;
                    }
                }
            }
        }
        if (arg0.field1182 != -1 && arg0.field1185 <= 1) {
            class272 var15 = class272.method579(arg0.field1182);
            if (var15.field3699 == 1 && arg0.field1209 > 0 && arg0.field1201 <= field883 && arg0.field1197 < field883) {
                arg0.field1185 = 1;
                return;
            }
        }
        if (arg0.field1182 != -1 && arg0.field1185 == 0) {
            class272 var16 = class272.method579(arg0.field1182);
            if (var16 == null || var16.field3688 == null) {
                arg0.field1182 = -1;
            } else {
                arg0.field1160++;
                if (arg0.field1206 < var16.field3688.length && arg0.field1160 > var16.field3690[arg0.field1206]) {
                    arg0.field1160 = 1;
                    arg0.field1206++;
                    method2920(var16, arg0.field1206, arg0.field1155, arg0.field1151);
                }
                if (arg0.field1206 >= var16.field3688.length) {
                    arg0.field1206 -= var16.field3685;
                    arg0.field1186++;
                    if (arg0.field1186 >= var16.field3698) {
                        arg0.field1182 = -1;
                    } else if (arg0.field1206 >= 0 && arg0.field1206 < var16.field3688.length) {
                        method2920(var16, arg0.field1206, arg0.field1155, arg0.field1151);
                    } else {
                        arg0.field1182 = -1;
                    }
                }
                arg0.field1153 = var16.field3694;
            }
        }
        if (arg0.field1185 > 0) {
            arg0.field1185--;
        }
    }

    @ObfuscatedName("ay.gq(Lbm;I)V")
    public static final void method530(class78 arg0) {
        int var1 = arg0.field1201 - field883;
        int var2 = arg0.field1192 * 128 + arg0.field1154 * 64;
        int var3 = arg0.field1194 * 128 + arg0.field1154 * 64;
        arg0.field1155 += (var2 - arg0.field1155) / var1;
        arg0.field1151 += (var3 - arg0.field1151) / var1;
        arg0.field1208 = 0;
        arg0.field1166 = arg0.field1198;
    }

    @ObfuscatedName("iw.gy(Lbm;B)V")
    public static final void method4062(class78 arg0) {
        if (field883 == arg0.field1197 || arg0.field1182 == -1 || arg0.field1185 != 0 || arg0.field1160 + 1 > class272.method579(arg0.field1182).field3690[arg0.field1206]) {
            int var1 = arg0.field1197 - arg0.field1201;
            int var2 = field883 - arg0.field1201;
            int var3 = arg0.field1192 * 128 + arg0.field1154 * 64;
            int var4 = arg0.field1194 * 128 + arg0.field1154 * 64;
            int var5 = arg0.field1175 * 128 + arg0.field1154 * 64;
            int var6 = arg0.field1207 * 128 + arg0.field1154 * 64;
            arg0.field1155 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1151 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1208 = 0;
        arg0.field1166 = arg0.field1198;
        arg0.field1173 = arg0.field1166;
    }

    @ObfuscatedName("ap.gh(Lbm;B)V")
    public static final void method657(class78 arg0) {
        if (arg0.field1203 == 0) {
            return;
        }
        if (arg0.field1195 != -1) {
            class78 var1 = null;
            if (arg0.field1195 < 32768) {
                var1 = field1110[arg0.field1195];
            } else if (arg0.field1195 >= 32768) {
                var1 = field900[arg0.field1195 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1155 - var1.field1155;
                int var3 = arg0.field1151 - var1.field1151;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1166 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1177) {
                arg0.field1195 = -1;
                arg0.field1177 = false;
            }
        }
        if (arg0.field1178 != -1 && (arg0.field1204 == 0 || arg0.field1208 > 0)) {
            arg0.field1166 = arg0.field1178;
            arg0.field1178 = -1;
        }
        int var4 = arg0.field1166 - arg0.field1173 & 0x7FF;
        if (var4 == 0 && arg0.field1177) {
            arg0.field1195 = -1;
            arg0.field1177 = false;
        }
        if (var4 == 0) {
            arg0.field1202 = 0;
            return;
        }
        arg0.field1202++;
        if (var4 > 1024) {
            arg0.field1173 -= arg0.field1203;
            boolean var5 = true;
            if (var4 < arg0.field1203 || var4 > 2048 - arg0.field1203) {
                arg0.field1173 = arg0.field1166;
                var5 = false;
            }
            if (arg0.field1179 == arg0.field1150 && (arg0.field1202 > 25 || var5)) {
                if (arg0.field1157 == -1) {
                    arg0.field1179 = arg0.field1169;
                } else {
                    arg0.field1179 = arg0.field1157;
                }
            }
        } else {
            arg0.field1173 += arg0.field1203;
            boolean var6 = true;
            if (var4 < arg0.field1203 || var4 > 2048 - arg0.field1203) {
                arg0.field1173 = arg0.field1166;
                var6 = false;
            }
            if (arg0.field1179 == arg0.field1150 && (arg0.field1202 > 25 || var6)) {
                if (arg0.field1174 == -1) {
                    arg0.field1179 = arg0.field1169;
                } else {
                    arg0.field1179 = arg0.field1174;
                }
            }
        }
        arg0.field1173 &= 0x7FF;
    }

    @ObfuscatedName("hu.gu(I)V")
    public static void method3672() {
        if (Statics.field1688 != null) {
            Statics.field1688.method5174(Statics.field226, (Statics.field289.field1155 >> 7) + Statics.field2458, (Statics.field289.field1151 >> 7) + Statics.field1288, false);
            Statics.field1688.method5024();
        }
    }

    @ObfuscatedName("aw.gb(Lbf;IIS)V")
    public static void method199(class74 arg0, int arg1, int arg2) {
        if (arg0.field1182 == arg1 && arg1 != -1) {
            int var3 = class272.method579(arg1).field3693;
            if (var3 == 1) {
                arg0.field1206 = 0;
                arg0.field1160 = 0;
                arg0.field1185 = arg2;
                arg0.field1186 = 0;
            }
            if (var3 == 2) {
                arg0.field1186 = 0;
            }
        } else if (arg1 == -1 || arg0.field1182 == -1 || class272.method579(arg1).field3695 >= class272.method579(arg0.field1182).field3695) {
            arg0.field1182 = arg1;
            arg0.field1206 = 0;
            arg0.field1160 = 0;
            arg0.field1185 = arg2;
            arg0.field1186 = 0;
            arg0.field1209 = arg0.field1204;
        }
    }

    @ObfuscatedName("ay.gx(I)I")
    public static int method537() {
        return field893 ? 2 : 1;
    }

    @ObfuscatedName("gz.go(I)V")
    public static void method3312() {
        class175 var0 = class175.method3892(class172.field2361, field916.field1463);
        var0.field2451.method3157(method537());
        var0.field2451.method3006(Statics.field1320);
        var0.field2451.method3006(Statics.field358);
        field916.method1747(var0);
    }

    @ObfuscatedName("client.o(B)V")
    public final void method736() {
        field1069 = class187.method938() + 500L;
        this.method1085();
        if (field1016 != -1) {
            this.method1256(true);
        }
    }

    @ObfuscatedName("client.ga(B)V")
    public void method1085() {
        int var1 = Statics.field1320;
        int var2 = Statics.field358;
        if (this.field669 < var1) {
            int var3 = this.field669;
        }
        if (this.field670 < var2) {
            int var4 = this.field670;
        }
        if (Statics.field2727 != null) {
            try {
                class53.method673(Statics.field2183, "resize", new Object[] { method537() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gl(B)V")
    public final void method1086() {
        if (field1016 != -1) {
            int var1 = field1016;
            if (class228.method4526(var1)) {
                method3905(Statics.field2754[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1059; var2++) {
            if (field1042[var2]) {
                field1062[var2] = true;
            }
            field976[var2] = field1042[var2];
            field1042[var2] = false;
        }
        field1060 = field883;
        field1005 = -1;
        field1006 = -1;
        Statics.field2541 = null;
        if (field1016 != -1) {
            field1059 = 0;
            method485(field1016, 0, 0, Statics.field1320, Statics.field358, 0, 0, -1);
        }
        class295.method4756();
        if (field994) {
            int var3 = Statics.field781;
            int var4 = Statics.field2205;
            int var5 = Statics.field237;
            int var6 = Statics.field455;
            int var7 = 6116423;
            class295.method4752(var3, var4, var5, var6, var7);
            class295.method4752(var3 + 1, var4 + 1, var5 - 2, 16, 0);
            class295.method4769(var3 + 1, var4 + 18, var5 - 2, var6 - 19, 0);
            Statics.field484.method4546(class237.field3115, var3 + 3, var4 + 14, var7, -1);
            int var8 = class60.field705;
            int var9 = class60.field706;
            for (int var10 = 0; var10 < field1081; var10++) {
                int var11 = (field1081 - 1 - var10) * 15 + var4 + 31;
                int var12 = 16777215;
                if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                    var12 = 16776960;
                }
                Statics.field484.method4546(method156(var10), var3 + 3, var11, var12, 0);
            }
            int var13 = Statics.field781;
            int var14 = Statics.field2205;
            int var15 = Statics.field237;
            int var16 = Statics.field455;
            for (int var17 = 0; var17 < field1059; var17++) {
                if (field1066[var17] + field1064[var17] > var13 && field1064[var17] < var13 + var15 && field1067[var17] + field1065[var17] > var14 && field1065[var17] < var14 + var16) {
                    field1062[var17] = true;
                }
            }
        } else if (field1005 != -1) {
            method236(field1005, field1006);
        }
        if (field1068 == 3) {
            for (int var18 = 0; var18 < field1059; var18++) {
                if (field976[var18]) {
                    class295.method4745(field1064[var18], field1065[var18], field1066[var18], field1067[var18], 16711935, 128);
                } else if (field1062[var18]) {
                    class295.method4745(field1064[var18], field1065[var18], field1066[var18], field1067[var18], 16711680, 128);
                }
            }
        }
        int var19 = Statics.field226;
        int var20 = Statics.field289.field1155;
        int var21 = Statics.field289.field1151;
        int var22 = field945;
        for (class82 var23 = (class82) class82.field1248.method3492(); var23 != null; var23 = (class82) class82.field1248.method3481()) {
            if (var23.field1249 != -1 || var23.field1246 != null) {
                int var24 = 0;
                if (var20 > var23.field1242) {
                    var24 += var20 - var23.field1242;
                } else if (var20 < var23.field1253) {
                    var24 += var23.field1253 - var20;
                }
                if (var21 > var23.field1247) {
                    var24 += var21 - var23.field1247;
                } else if (var21 < var23.field1244) {
                    var24 += var23.field1244 - var21;
                }
                if (var24 - 64 > var23.field1245 || field1095 == 0 || var23.field1243 != var19) {
                    if (var23.field1250 != null) {
                        Statics.field1329.method1773(var23.field1250);
                        var23.field1250 = null;
                    }
                    if (var23.field1251 != null) {
                        Statics.field1329.method1773(var23.field1251);
                        var23.field1251 = null;
                    }
                } else {
                    var24 -= 64;
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    int var25 = field1095 * (var23.field1245 - var24) / var23.field1245;
                    class105 var10000;
                    if (var23.field1250 != null) {
                        var23.field1250.method2002(var25);
                    } else if (var23.field1249 >= 0) {
                        var10000 = (class105) null;
                        class105 var26 = class105.method1831(Statics.field320, var23.field1249, 0);
                        if (var26 != null) {
                            class107 var27 = var26.method1830().method1874(Statics.field344);
                            class117 var28 = class117.method2087(var27, 100, var25);
                            var28.method2001(-1);
                            Statics.field1329.method1787(var28);
                            var23.field1250 = var28;
                        }
                    }
                    if (var23.field1251 != null) {
                        var23.field1251.method2002(var25);
                        if (!var23.field1251.method3475()) {
                            var23.field1251 = null;
                        }
                    } else if (var23.field1246 != null && (var23.field1254 -= var22) <= 0) {
                        int var29 = (int) (Math.random() * (double) var23.field1246.length);
                        var10000 = (class105) null;
                        class105 var30 = class105.method1831(Statics.field320, var23.field1246[var29], 0);
                        if (var30 != null) {
                            class107 var31 = var30.method1830().method1874(Statics.field344);
                            class117 var32 = class117.method2087(var31, 100, var25);
                            var32.method2001(0);
                            Statics.field1329.method1787(var32);
                            var23.field1251 = var32;
                            var23.field1254 = var23.field1255 + (int) (Math.random() * (double) (var23.field1252 - var23.field1255));
                        }
                    }
                }
            }
        }
        field945 = 0;
    }

    @ObfuscatedName("bf.gw(IIIIZI)V")
    public static final void method1062(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1109 - field1108) * var5 / 100 + field1108;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1114) {
            short var8 = field1114;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1113) {
                var6 = field1113;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class295.method4756();
                    class295.method4752(arg0, arg1, var10, arg3, -16777216);
                    class295.method4752(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field949) {
            short var11 = field949;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1112) {
                var6 = field1112;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class295.method4756();
                    class295.method4752(arg0, arg1, arg2, var13, -16777216);
                    class295.method4752(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1111 - field1047) * var5 / 100 + field1047;
        field996 = arg3 * var6 * var14 / 85504 << 1;
        if (field1118 != arg2 || field1070 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class136.field1942[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class139.method2555(var15, 500, 800, arg2, arg3);
        }
        field1107 = arg0;
        field1117 = arg1;
        field1118 = arg2;
        field1070 = arg3;
    }

    @ObfuscatedName("ez.gi(I)V")
    public static void method2750() {
        if (Statics.field289.field1155 >> 7 == field1013 && Statics.field289.field1151 >> 7 == field946) {
            field1013 = 0;
        }
    }

    @ObfuscatedName("t.gd(B)V")
    public static void method71() {
        method1000(Statics.field289, false);
    }

    @ObfuscatedName("ae.gt(I)V")
    public static void method313() {
        if (field975 >= 0 && field900[field975] != null) {
            method1000(field900[field975], false);
        }
    }

    @ObfuscatedName("bt.gf(Lbf;ZI)V")
    public static void method1000(class74 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1044() || arg0.field856) {
            return;
        }
        int var2 = arg0.field843 << 14;
        arg0.field841 = false;
        if ((field879 && class95.field1406 > 50 || class95.field1406 > 200) && arg1 && arg0.field1179 == arg0.field1150) {
            arg0.field841 = true;
        }
        int var3 = arg0.field1155 >> 7;
        int var4 = arg0.field1151 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field849 != null && field883 >= arg0.field835 && field883 < arg0.field845) {
            arg0.field841 = false;
            arg0.field844 = method919(arg0.field1155, arg0.field1151, Statics.field226);
            Statics.field566.method2532(Statics.field226, arg0.field1155, arg0.field1151, arg0.field844, 60, arg0, arg0.field1173, var2, arg0.field850, arg0.field851, arg0.field852, arg0.field853);
            return;
        }
        if ((arg0.field1155 & 0x7F) == 64 && (arg0.field1151 & 0x7F) == 64) {
            if (field920 == field959[var3][var4]) {
                return;
            }
            field959[var3][var4] = field920;
        }
        arg0.field844 = method919(arg0.field1155, arg0.field1151, Statics.field226);
        Statics.field566.method2603(Statics.field226, arg0.field1155, arg0.field1151, arg0.field844, 60, arg0, arg0.field1173, var2, arg0.field1153);
    }

    @ObfuscatedName("ar.hy(ZI)V")
    public static final void method664(boolean arg0) {
        for (int var1 = 0; var1 < field1049; var1++) {
            class86 var2 = field1110[field913[var1]];
            int var3 = (field913[var1] << 14) + 536870912;
            if (var2 != null && var2.method1044() && var2.field1298.field3659 == arg0 && var2.field1298.method4424()) {
                int var4 = var2.field1155 >> 7;
                int var5 = var2.field1151 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1154 == 1 && (var2.field1155 & 0x7F) == 64 && (var2.field1151 & 0x7F) == 64) {
                        if (field920 == field959[var4][var5]) {
                            continue;
                        }
                        field959[var4][var5] = field920;
                    }
                    if (!var2.field1298.field3667) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field566.method2603(Statics.field226, var2.field1155, var2.field1151, method919(var2.field1155 + (var2.field1154 * 64 - 64), var2.field1151 + (var2.field1154 * 64 - 64), Statics.field226), var2.field1154 * 64 - 64 + 60, var2, var2.field1173, var3, var2.field1153);
                }
            }
        }
    }

    @ObfuscatedName("w.hc(Lbm;IIIIII)V")
    public static final void method68(class78 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1044()) {
            return;
        }
        if (arg0 instanceof class86) {
            class270 var6 = ((class86) arg0).field1298;
            if (var6.field3664 != null) {
                var6 = var6.method4447();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class95.field1406;
        int[] var8 = class95.field1410;
        int var9 = 3;
        if (!arg0.field1158.method3469()) {
            method43(arg0, arg0.field1200 + 15);
            for (class85 var10 = (class85) arg0.field1158.method3442(); var10 != null; var10 = (class85) arg0.field1158.method3444()) {
                class79 var11 = var10.method1566(field883);
                if (var11 != null) {
                    class260 var12 = var10.field1289;
                    class299 var13 = var12.method4186();
                    class299 var14 = var12.method4185();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3466;
                    } else {
                        if (var12.field3467 * 2 < var14.field3861) {
                            var15 = var12.field3467;
                        }
                        var16 = var14.field3861 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field883 - var11.field1211;
                    int var20 = var11.field1212 * var16 / var12.field3466;
                    int var23;
                    if (var11.field1213 > var19) {
                        int var21 = var12.field3462 == 0 ? 0 : var19 / var12.field3462 * var12.field3462;
                        int var22 = var11.field1210 * var16 / var12.field3466;
                        var23 = (var20 - var22) * var21 / var11.field1213 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1213 + var12.field3463 - var19;
                        if (var12.field3461 >= 0) {
                            var17 = (var24 << 8) / (var12.field3463 - var12.field3461);
                        }
                    }
                    if (var11.field1212 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field961 + arg2 - (var16 >> 1);
                    int var26 = field991 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field961 > -1) {
                            class295.method4752(var25, var26, var23, 5, 65280);
                            class295.method4752(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3858;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4865(var27, var26, var17);
                            class295.method4739(var27, var26, var27 + var28, var26 + var29);
                            var14.method4865(var27, var26, var17);
                        } else {
                            var13.method4859(var27, var26);
                            class295.method4739(var27, var26, var27 + var28, var26 + var29);
                            var14.method4859(var27, var26);
                        }
                        class295.method4810(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1567()) {
                    var10.method3474();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class74 var30 = (class74) arg0;
            if (var30.field856) {
                return;
            }
            if (var30.field837 != -1 || var30.field854 != -1) {
                method43(arg0, arg0.field1200 + 15);
                if (field961 > -1) {
                    if (var30.field837 != -1) {
                        Statics.field558[var30.field837].method4859(field961 + arg2 - 12, field991 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field854 != -1) {
                        Statics.field309[var30.field854].method4859(field961 + arg2 - 12, field991 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field943 == 10 && field878 == var8[arg1]) {
                method43(arg0, arg0.field1200 + 15);
                if (field961 > -1) {
                    Statics.field683[1].method4859(field961 + arg2 - 12, field991 + arg3 - var9);
                }
            }
        } else {
            class270 var31 = ((class86) arg0).field1298;
            if (var31.field3664 != null) {
                var31 = var31.method4447();
            }
            if (var31.field3662 >= 0 && var31.field3662 < Statics.field309.length) {
                method43(arg0, arg0.field1200 + 15);
                if (field961 > -1) {
                    Statics.field309[var31.field3662].method4859(field961 + arg2 - 12, field991 + arg3 - 30);
                }
            }
            if (field943 == 1 && field905 == field913[arg1 - var7] && field883 % 20 < 10) {
                method43(arg0, arg0.field1200 + 15);
                if (field961 > -1) {
                    Statics.field683[0].method4859(field961 + arg2 - 12, field991 + arg3 - 28);
                }
            }
        }
        if (arg0.field1163 != null && (arg1 >= var7 || !arg0.field1165 && (field1072 == 4 || !arg0.field1196 && (field1072 == 0 || field1072 == 3 || field1072 == 1 && Statics.method1652(((class74) arg0).field860, false))))) {
            method43(arg0, arg0.field1200);
            if (field961 > -1 && field1038 < field950) {
                field954[field1038] = Statics.field484.method4541(arg0.field1163) / 2;
                field911[field1038] = Statics.field484.field3722;
                field951[field1038] = field961;
                field1104[field1038] = field991;
                field1115[field1038] = arg0.field1167;
                field956[field1038] = arg0.field1168;
                field939[field1038] = arg0.field1170;
                field932[field1038] = arg0.field1163;
                field1038++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1172[var32];
            int var34 = arg0.field1183[var32];
            class266 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field883) {
                    continue;
                }
                var35 = class266.method2943(arg0.field1183[var32]);
                var36 = var35.field3504;
                if (var35 != null && var35.field3508 != null) {
                    var35 = var35.method4281();
                    if (var35 == null) {
                        arg0.field1172[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1184[var32];
            class266 var38 = null;
            if (var37 >= 0) {
                var38 = class266.method2943(var37);
                if (var38 != null && var38.field3508 != null) {
                    var38 = var38.method4281();
                }
            }
            if (var33 - var36 <= field883) {
                if (var35 == null) {
                    arg0.field1172[var32] = -1;
                } else {
                    method43(arg0, arg0.field1200 / 2);
                    if (field961 > -1) {
                        if (var32 == 1) {
                            field991 -= 20;
                        }
                        if (var32 == 2) {
                            field961 -= 15;
                            field991 -= 10;
                        }
                        if (var32 == 3) {
                            field961 += 15;
                            field991 -= 10;
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
                        class299 var51 = null;
                        class299 var52 = null;
                        class299 var53 = null;
                        class299 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class299 var64 = var35.method4276();
                        if (var64 != null) {
                            var43 = var64.field3861;
                            int var65 = var64.field3858;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3863;
                        }
                        class299 var66 = var35.method4277();
                        if (var66 != null) {
                            var44 = var66.field3861;
                            int var67 = var66.field3858;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3863;
                        }
                        class299 var68 = var35.method4299();
                        if (var68 != null) {
                            var45 = var68.field3861;
                            int var69 = var68.field3858;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3863;
                        }
                        class299 var70 = var35.method4279();
                        if (var70 != null) {
                            var46 = var70.field3861;
                            int var71 = var70.field3858;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3863;
                        }
                        if (var38 != null) {
                            var51 = var38.method4276();
                            if (var51 != null) {
                                var55 = var51.field3861;
                                int var72 = var51.field3858;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3863;
                            }
                            var52 = var38.method4277();
                            if (var52 != null) {
                                var56 = var52.field3861;
                                int var73 = var52.field3858;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3863;
                            }
                            var53 = var38.method4299();
                            if (var53 != null) {
                                var57 = var53.field3861;
                                int var74 = var53.field3858;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3863;
                            }
                            var54 = var38.method4279();
                            if (var54 != null) {
                                var58 = var54.field3861;
                                int var75 = var54.field3858;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3863;
                            }
                        }
                        class275 var76 = var35.method4298();
                        if (var76 == null) {
                            var76 = Statics.field3307;
                        }
                        class275 var77;
                        if (var38 == null) {
                            var77 = Statics.field3307;
                        } else {
                            var77 = var38.method4298();
                            if (var77 == null) {
                                var77 = Statics.field3307;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4275(arg0.field1171[var32]);
                        int var83 = var76.method4541(var82);
                        if (var38 != null) {
                            var79 = var38.method4275(arg0.field1193[var32]);
                            var81 = var77.method4541(var79);
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
                        int var100 = arg0.field1172[var32] - field883;
                        int var101 = var35.field3512 - var35.field3512 * var100 / var35.field3504;
                        int var102 = var35.field3500 * var100 / var35.field3504 + -var35.field3500;
                        int var103 = field961 + arg2 - (var92 >> 1) + var101;
                        int var104 = field991 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3517 + var104 + 15;
                        int var108 = var107 - var76.field3739;
                        int var109 = var76.field3720 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3517 + var104 + 15;
                            int var111 = var110 - var77.field3739;
                            int var112 = var77.field3720 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3514 >= 0) {
                            var115 = (var100 << 8) / (var35.field3504 - var35.field3514);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4865(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4865(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4865(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4865(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4599(var82, var90 + var103, var107, var35.field3510, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4865(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4865(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4865(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4865(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4599(var79, var98 + var103, var110, var38.field3510, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4859(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4859(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4859(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4859(var93 + var103 - var50, var104);
                            }
                            var76.method4546(var82, var90 + var103, var107, var35.field3510 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4859(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4859(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4859(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4859(var97 + var103 - var62, var104);
                                }
                                var77.method4546(var79, var98 + var103, var110, var38.field3510 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.hk(IIIII)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3) {
        field1038 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class95.field1406;
        int[] var7 = class95.field1410;
        for (int var8 = 0; var8 < field1049 + var6; var8++) {
            class78 var9;
            if (var8 < var6) {
                var9 = field900[var7[var8]];
                if (field975 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field1110[field913[var8 - var6]];
            }
            method68(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method68(field900[field975], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field1038; var10++) {
            int var11 = field951[var10];
            int var12 = field1104[var10];
            int var13 = field954[var10];
            int var14 = field911[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field1104[var16] - field911[var16] && var12 - var14 < field1104[var16] + 2 && var11 - var13 < field954[var16] + field951[var16] && var11 + var13 > field951[var16] - field954[var16] && field1104[var16] - field911[var16] < var12) {
                        var12 = field1104[var16] - field911[var16];
                        var15 = true;
                    }
                }
            }
            field961 = field951[var10];
            field991 = field1104[var10] = var12;
            String var17 = field932[var10];
            if (field1018 == 0) {
                int var18 = 16776960;
                if (field1115[var10] < 6) {
                    var18 = field1071[field1115[var10]];
                }
                if (field1115[var10] == 6) {
                    var18 = field920 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field1115[var10] == 7) {
                    var18 = field920 % 20 < 10 ? 255 : 65535;
                }
                if (field1115[var10] == 8) {
                    var18 = field920 % 20 < 10 ? 45056 : 8454016;
                }
                if (field1115[var10] == 9) {
                    int var19 = 150 - field939[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field1115[var10] == 10) {
                    int var20 = 150 - field939[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field1115[var10] == 11) {
                    int var21 = 150 - field939[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field956[var10] == 0) {
                    Statics.field484.method4549(var17, field961 + arg0, field991 + arg1, var18, 0);
                }
                if (field956[var10] == 1) {
                    Statics.field484.method4551(var17, field961 + arg0, field991 + arg1, var18, 0, field920);
                }
                if (field956[var10] == 2) {
                    Statics.field484.method4552(var17, field961 + arg0, field991 + arg1, var18, 0, field920);
                }
                if (field956[var10] == 3) {
                    Statics.field484.method4537(var17, field961 + arg0, field991 + arg1, var18, 0, field920, 150 - field939[var10]);
                }
                if (field956[var10] == 4) {
                    int var22 = (150 - field939[var10]) * (Statics.field484.method4541(var17) + 100) / 150;
                    class295.method4739(field961 + arg0 - 50, arg1, field961 + arg0 + 50, arg1 + arg3);
                    Statics.field484.method4546(var17, field961 + arg0 + 50 - var22, field991 + arg1, var18, 0);
                    class295.method4810(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field956[var10] == 5) {
                    int var23 = 150 - field939[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class295.method4739(arg0, field991 + arg1 - Statics.field484.field3722 - 1, arg0 + arg2, field991 + arg1 + 5);
                    Statics.field484.method4549(var17, field961 + arg0, field991 + arg1 + var24, var18, 0);
                    class295.method4810(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field484.method4549(var17, field961 + arg0, field991 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("z.hx(Lbm;II)V")
    public static final void method43(class78 arg0, int arg1) {
        method995(arg0.field1155, arg0.field1151, arg1);
    }

    @ObfuscatedName("bx.he(IIIS)V")
    public static final void method995(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field961 = -1;
            field991 = -1;
            return;
        }
        int var3 = method919(arg0, arg1, Statics.field226) - arg2;
        int var4 = arg0 - Statics.field672;
        int var5 = var3 - Statics.field806;
        int var6 = arg1 - Statics.field702;
        int var7 = class136.field1942[Statics.field1571];
        int var8 = class136.field1922[Statics.field1571];
        int var9 = class136.field1942[Statics.field16];
        int var10 = class136.field1922[Statics.field16];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field961 = field996 * var11 / var15 + field1118 / 2;
            field991 = field996 * var14 / var15 + field1070 / 2;
        } else {
            field961 = -1;
            field991 = -1;
        }
    }

    @ObfuscatedName("bi.hj(IIII)I")
    public static final int method919(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field729[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field742[var5][var3][var4] + class62.field742[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field742[var5][var3][var4 + 1] + class62.field742[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bx.hz(ZLgr;B)V")
    public static final void method994(boolean arg0, class191 arg1) {
        field929 = arg0;
        if (!field929) {
            int var2 = arg1.method3015();
            int var3 = arg1.method3204();
            int var4 = arg1.method3015();
            Statics.field377 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field377[var5][var6] = arg1.method3026();
                }
            }
            Statics.field2635 = new int[var4];
            Statics.field2959 = new int[var4];
            Statics.field2463 = new int[var4];
            Statics.field302 = new byte[var4][];
            Statics.field927 = new byte[var4][];
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
                        Statics.field2635[var8] = var11;
                        Statics.field2959[var8] = Statics.field746.method4007("m" + var9 + "_" + var10);
                        Statics.field2463[var8] = Statics.field746.method4007("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method466(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3060() == 1;
        int var13 = arg1.method3023();
        int var14 = arg1.method3023();
        int var15 = arg1.method3015();
        arg1.method3285();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3286(1);
                    if (var19 == 1) {
                        field1119[var16][var17][var18] = arg1.method3286(26);
                    } else {
                        field1119[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3287();
        Statics.field377 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field377[var20][var21] = arg1.method3026();
            }
        }
        Statics.field2635 = new int[var15];
        Statics.field2959 = new int[var15];
        Statics.field2463 = new int[var15];
        Statics.field302 = new byte[var15][];
        Statics.field927 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field1119[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field2635[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field2635[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field2959[var22] = Statics.field746.method4007("m" + var31 + "_" + var32);
                            Statics.field2463[var22] = Statics.field746.method4007("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method466(var14, var13, !var12);
    }

    @ObfuscatedName("ah.hu(IIZI)V")
    public static final void method466(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field725 == arg0 && Statics.field264 == arg1) {
            return;
        }
        Statics.field725 = arg0;
        Statics.field264 = arg1;
        method1076(25);
        Statics.method67(class237.field2972, true);
        int var3 = Statics.field2458;
        int var4 = Statics.field1288;
        Statics.field2458 = (arg0 - 6) * 8;
        Statics.field1288 = (arg1 - 6) * 8;
        int var5 = Statics.field2458 - var3;
        int var6 = Statics.field1288 - var4;
        int var7 = Statics.field2458;
        int var8 = Statics.field1288;
        for (int var9 = 0; var9 < 32768; var9++) {
            class86 var10 = field1110[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1199[var11] -= var5;
                    var10.field1164[var11] -= var6;
                }
                var10.field1155 -= var5 * 128;
                var10.field1151 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class74 var13 = field900[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1199[var14] -= var5;
                    var13.field1164[var14] -= var6;
                }
                var13.field1155 -= var5 * 128;
                var13.field1151 -= var6 * 128;
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
                        field986[var25][var21][var22] = field986[var25][var23][var24];
                    } else {
                        field986[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field987.method3492(); var26 != null; var26 = (class77) field987.method3481()) {
            var26.field1139 -= var5;
            var26.field1140 -= var6;
            if (var26.field1139 < 0 || var26.field1140 < 0 || var26.field1139 >= 104 || var26.field1140 >= 104) {
                var26.method3474();
            }
        }
        if (field1013 != 0) {
            field1013 -= var5;
            field946 -= var6;
        }
        field1026 = 0;
        field1102 = false;
        field1083 = -1;
        field989.method3486();
        field988.method3486();
        for (int var27 = 0; var27 < 4; var27++) {
            field928[var27].method2904();
        }
    }

    @ObfuscatedName("bm.hb(ZB)V")
    public static final void method1446(boolean arg0) {
        method4524();
        field916.field1469++;
        if (field916.field1469 < 50 && !arg0) {
            return;
        }
        field916.field1469 = 0;
        if (field1011 || field916.method1753() == null) {
            return;
        }
        class175 var1 = class175.method3892(class172.field2348, field916.field1463);
        field916.method1747(var1);
        try {
            field916.method1749();
        } catch (IOException var3) {
            field1011 = true;
        }
    }

    @ObfuscatedName("cb.hi(B)V")
    public static final void method1576() {
        method1446(false);
        field922 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field302.length; var1++) {
            if (Statics.field2959[var1] != -1 && Statics.field302[var1] == null) {
                Statics.field302[var1] = Statics.field746.method3931(Statics.field2959[var1], 0);
                if (Statics.field302[var1] == null) {
                    var0 = false;
                    field922++;
                }
            }
            if (Statics.field2463[var1] != -1 && Statics.field927[var1] == null) {
                Statics.field927[var1] = Statics.field746.method3917(Statics.field2463[var1], 0, Statics.field377[var1]);
                if (Statics.field927[var1] == null) {
                    var0 = false;
                    field922++;
                }
            }
        }
        if (!var0) {
            field1053 = 1;
            return;
        }
        field924 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field302.length; var3++) {
            byte[] var4 = Statics.field927[var3];
            if (var4 != null) {
                int var5 = (Statics.field2635[var3] >> 8) * 64 - Statics.field2458;
                int var6 = (Statics.field2635[var3] & 0xFF) * 64 - Statics.field1288;
                if (field929) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class185 var9 = new class185(var4);
                int var10 = -1;
                label544: while (true) {
                    int var11 = var9.method3232();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method3232();
                            if (var16 == 0) {
                                continue label544;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method3021() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class267 var22 = class267.method1587(var10);
                                if (var19 != 22 || !field879 || var22.field3524 != 0 || var22.field3551 == 1 || var22.field3560) {
                                    if (!var22.method4308()) {
                                        field924++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method3232();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method3021();
                    }
                }
            }
        }
        if (!var2) {
            field1053 = 2;
            return;
        }
        if (field1053 != 0) {
            Statics.method67(class237.field2972 + class88.field1319 + class88.field1314 + 100 + "%" + class88.field1317, true);
        }
        method4524();
        method2950();
        method4524();
        Statics.field566.method2520();
        method4524();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field928[var23].method2904();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class62.field729[var24][var25][var26] = 0;
                }
            }
        }
        method4524();
        class62.method2961();
        int var27 = Statics.field302.length;
        for (class82 var28 = (class82) class82.field1248.method3492(); var28 != null; var28 = (class82) class82.field1248.method3481()) {
            if (var28.field1250 != null) {
                Statics.field1329.method1773(var28.field1250);
                var28.field1250 = null;
            }
            if (var28.field1251 != null) {
                Statics.field1329.method1773(var28.field1251);
                var28.field1251 = null;
            }
        }
        class82.field1248.method3486();
        method1446(true);
        if (!field929) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field2635[var29] >> 8) * 64 - Statics.field2458;
                int var31 = (Statics.field2635[var29] & 0xFF) * 64 - Statics.field1288;
                byte[] var32 = Statics.field302[var29];
                if (var32 != null) {
                    method4524();
                    class62.method2916(var32, var30, var31, Statics.field725 * 8 - 48, Statics.field264 * 8 - 48, field928);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field2635[var33] >> 8) * 64 - Statics.field2458;
                int var35 = (Statics.field2635[var33] & 0xFF) * 64 - Statics.field1288;
                byte[] var36 = Statics.field302[var33];
                if (var36 == null && Statics.field264 < 800) {
                    method4524();
                    class62.method1993(var34, var35, 64, 64);
                }
            }
            method1446(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field927[var37];
                if (var38 != null) {
                    int var39 = (Statics.field2635[var37] >> 8) * 64 - Statics.field2458;
                    int var40 = (Statics.field2635[var37] & 0xFF) * 64 - Statics.field1288;
                    method4524();
                    class62.method1429(var38, var39, var40, Statics.field566, field928);
                }
            }
        }
        if (field929) {
            for (int var41 = 0; var41 < 4; var41++) {
                method4524();
                for (int var42 = 0; var42 < 13; var42++) {
                    for (int var43 = 0; var43 < 13; var43++) {
                        boolean var44 = false;
                        int var45 = field1119[var41][var42][var43];
                        if (var45 != -1) {
                            int var46 = var45 >> 24 & 0x3;
                            int var47 = var45 >> 1 & 0x3;
                            int var48 = var45 >> 14 & 0x3FF;
                            int var49 = var45 >> 3 & 0x7FF;
                            int var50 = (var48 / 8 << 8) + var49 / 8;
                            for (int var51 = 0; var51 < Statics.field2635.length; var51++) {
                                if (Statics.field2635[var51] == var50 && Statics.field302[var51] != null) {
                                    byte[] var52 = Statics.field302[var51];
                                    int var53 = var42 * 8;
                                    int var54 = var43 * 8;
                                    int var55 = (var48 & 0x7) * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    class167[] var57 = field928;
                                    for (int var58 = 0; var58 < 8; var58++) {
                                        for (int var59 = 0; var59 < 8; var59++) {
                                            if (var53 + var58 > 0 && var53 + var58 < 103 && var54 + var59 > 0 && var54 + var59 < 103) {
                                                var57[var41].field2230[var53 + var58][var54 + var59] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class185 var60 = new class185(var52);
                                    for (int var61 = 0; var61 < 4; var61++) {
                                        for (int var62 = 0; var62 < 64; var62++) {
                                            for (int var63 = 0; var63 < 64; var63++) {
                                                if (var46 == var61 && var62 >= var55 && var62 < var55 + 8 && var63 >= var56 && var63 < var56 + 8) {
                                                    int var67 = var62 & 0x7;
                                                    int var68 = var63 & 0x7;
                                                    int var70 = var47 & 0x3;
                                                    int var71;
                                                    if (var70 == 0) {
                                                        var71 = var67;
                                                    } else if (var70 == 1) {
                                                        var71 = var68;
                                                    } else if (var70 == 2) {
                                                        var71 = 7 - var67;
                                                    } else {
                                                        var71 = 7 - var68;
                                                    }
                                                    class62.method3311(var60, var41, var53 + var71, var54 + class227.method3276(var62 & 0x7, var63 & 0x7, var47), 0, 0, var47);
                                                } else {
                                                    class62.method3311(var60, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var44 = true;
                                    break;
                                }
                            }
                        }
                        if (!var44) {
                            class62.method656(var41, var42 * 8, var43 * 8);
                        }
                    }
                }
            }
            for (int var72 = 0; var72 < 13; var72++) {
                for (int var73 = 0; var73 < 13; var73++) {
                    int var74 = field1119[0][var72][var73];
                    if (var74 == -1) {
                        class62.method1993(var72 * 8, var73 * 8, 8, 8);
                    }
                }
            }
            method1446(true);
            for (int var75 = 0; var75 < 4; var75++) {
                method4524();
                for (int var76 = 0; var76 < 13; var76++) {
                    label379: for (int var77 = 0; var77 < 13; var77++) {
                        int var78 = field1119[var75][var76][var77];
                        if (var78 != -1) {
                            int var79 = var78 >> 24 & 0x3;
                            int var80 = var78 >> 1 & 0x3;
                            int var81 = var78 >> 14 & 0x3FF;
                            int var82 = var78 >> 3 & 0x7FF;
                            int var83 = (var81 / 8 << 8) + var82 / 8;
                            for (int var84 = 0; var84 < Statics.field2635.length; var84++) {
                                if (Statics.field2635[var84] == var83 && Statics.field927[var84] != null) {
                                    byte[] var85 = Statics.field927[var84];
                                    int var86 = var76 * 8;
                                    int var87 = var77 * 8;
                                    int var88 = (var81 & 0x7) * 8;
                                    int var89 = (var82 & 0x7) * 8;
                                    class139 var90 = Statics.field566;
                                    class167[] var91 = field928;
                                    class185 var92 = new class185(var85);
                                    int var93 = -1;
                                    while (true) {
                                        int var94 = var92.method3232();
                                        if (var94 == 0) {
                                            continue label379;
                                        }
                                        var93 += var94;
                                        int var95 = 0;
                                        while (true) {
                                            int var96 = var92.method3232();
                                            if (var96 == 0) {
                                                break;
                                            }
                                            var95 += var96 - 1;
                                            int var97 = var95 & 0x3F;
                                            int var98 = var95 >> 6 & 0x3F;
                                            int var99 = var95 >> 12;
                                            int var100 = var92.method3021();
                                            int var101 = var100 >> 2;
                                            int var102 = var100 & 0x3;
                                            if (var79 == var99 && var98 >= var88 && var98 < var88 + 8 && var97 >= var89 && var97 < var89 + 8) {
                                                class267 var103 = class267.method1587(var93);
                                                int var105 = var98 & 0x7;
                                                int var106 = var97 & 0x7;
                                                int var108 = var103.field3537;
                                                int var109 = var103.field3538;
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
                                                int var118 = var103.field3537;
                                                int var119 = var103.field3538;
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
                                                    if ((class62.field729[1][var113][var123] & 0x2) == 2) {
                                                        var124 = var75 - 1;
                                                    }
                                                    class167 var125 = null;
                                                    if (var124 >= 0) {
                                                        var125 = var91[var124];
                                                    }
                                                    class62.method1016(var75, var113, var123, var93, var80 + var102 & 0x3, var101, var90, var125);
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
        method1446(true);
        method2950();
        method4524();
        class62.method2928(Statics.field566, field928);
        method1446(true);
        int var126 = class62.field730;
        if (var126 > Statics.field226) {
            var126 = Statics.field226;
        }
        if (var126 < Statics.field226 - 1) {
            int var127 = Statics.field226 - 1;
        }
        if (field879) {
            Statics.field566.method2521(class62.field730);
        } else {
            Statics.field566.method2521(0);
        }
        for (int var128 = 0; var128 < 104; var128++) {
            for (int var129 = 0; var129 < 104; var129++) {
                method1024(var128, var129);
            }
        }
        method4524();
        for (class77 var130 = (class77) field987.method3492(); var130 != null; var130 = (class77) field987.method3481()) {
            if (var130.field1137 == -1) {
                var130.field1147 = 0;
                method307(var130);
            } else {
                var130.method3474();
            }
        }
        class267.field3525.method3409();
        if (Statics.field2183.method767()) {
            class175 var131 = class175.method3892(class172.field2375, field916.field1463);
            var131.field2451.method3005(1057001181);
            field916.method1747(var131);
        }
        if (!field929) {
            int var132 = (Statics.field725 - 6) / 8;
            int var133 = (Statics.field725 + 6) / 8;
            int var134 = (Statics.field264 - 6) / 8;
            int var135 = (Statics.field264 + 6) / 8;
            for (int var136 = var132 - 1; var136 <= var133 + 1; var136++) {
                for (int var137 = var134 - 1; var137 <= var135 + 1; var137++) {
                    if (var136 < var132 || var136 > var133 || var137 < var134 || var137 > var135) {
                        Statics.field746.method3939("m" + var136 + "_" + var137);
                        Statics.field746.method3939("l" + var136 + "_" + var137);
                    }
                }
            }
        }
        method1076(30);
        method4524();
        class62.method3911();
        class175 var138 = class175.method3892(class172.field2413, field916.field1463);
        field916.method1747(var138);
        class59.method3934();
    }

    @ObfuscatedName("bl.hm(IIIIIB)V")
    public static final void method1017(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field566.method2536(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field566.method2550(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2952.field3857;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class267 var13 = class267.method1587(var12);
            if (var13.field3522 == -1) {
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
                class298 var14 = Statics.field331[var13.field3522];
                if (var14 != null) {
                    int var15 = (var13.field3537 * 4 - var14.field3855) / 2;
                    int var16 = (var13.field3538 * 4 - var14.field3851) / 2;
                    var14.method4830(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3538) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field566.method2548(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field566.method2550(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class267 var22 = class267.method1587(var21);
            if (var22.field3522 != -1) {
                class298 var23 = Statics.field331[var22.field3522];
                if (var23 != null) {
                    int var24 = (var22.field3537 * 4 - var23.field3855) / 2;
                    int var25 = (var22.field3538 * 4 - var23.field3851) / 2;
                    var23.method4830(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3538) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2952.field3857;
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
        int var29 = Statics.field566.method2549(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class267 var31 = class267.method1587(var30);
        if (var31.field3522 == -1) {
            return;
        }
        class298 var32 = Statics.field331[var31.field3522];
        if (var32 != null) {
            int var33 = (var31.field3537 * 4 - var32.field3855) / 2;
            int var34 = (var31.field3538 * 4 - var32.field3851) / 2;
            var32.method4830(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3538) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.hr(Lcg;B)Z")
    public final boolean method1087(class101 arg0) {
        class160 var2 = arg0.method1753();
        class191 var3 = arg0.field1464;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1465 == null) {
                if (arg0.field1459) {
                    if (!var2.method2810(1)) {
                        return false;
                    }
                    var2.method2813(arg0.field1464.field2528, 0, 1);
                    arg0.field1466 = 0;
                    arg0.field1459 = false;
                }
                var3.field2529 = 0;
                if (var3.method3288()) {
                    if (!var2.method2810(1)) {
                        return false;
                    }
                    var2.method2813(arg0.field1464.field2528, 1, 1);
                    arg0.field1466 = 0;
                }
                arg0.field1459 = true;
                class171[] var4 = new class171[] { class171.field2307, class171.field2302, class171.field2259, class171.field2251, class171.field2248, class171.field2253, class171.field2252, class171.field2327, class171.field2256, class171.field2257, class171.field2258, class171.field2255, class171.field2260, class171.field2261, class171.field2312, class171.field2263, class171.field2295, class171.field2265, class171.field2274, class171.field2267, class171.field2268, class171.field2269, class171.field2270, class171.field2271, class171.field2272, class171.field2273, class171.field2287, class171.field2275, class171.field2276, class171.field2297, class171.field2278, class171.field2279, class171.field2280, class171.field2281, class171.field2282, class171.field2283, class171.field2284, class171.field2304, class171.field2286, class171.field2318, class171.field2288, class171.field2289, class171.field2290, class171.field2291, class171.field2305, class171.field2293, class171.field2277, class171.field2254, class171.field2296, class171.field2308, class171.field2298, class171.field2299, class171.field2300, class171.field2264, class171.field2294, class171.field2303, class171.field2249, class171.field2250, class171.field2306, class171.field2321, class171.field2266, class171.field2309, class171.field2310, class171.field2311, class171.field2319, class171.field2313, class171.field2314, class171.field2315, class171.field2316, class171.field2317, class171.field2301, class171.field2292, class171.field2320, class171.field2262, class171.field2322, class171.field2323, class171.field2324, class171.field2325, class171.field2326, class171.field2285, class171.field2328 };
                int var6 = var3.method3284();
                if (var6 < 0 || var6 >= var4.length) {
                    throw new IOException(var6 + " " + var3.field2529);
                }
                arg0.field1465 = var4[var6];
                arg0.field1467 = arg0.field1465.field2330;
            }
            if (arg0.field1467 == -1) {
                if (!var2.method2810(1)) {
                    return false;
                }
                arg0.method1753().method2813(var3.field2528, 0, 1);
                arg0.field1467 = var3.field2528[0] & 0xFF;
            }
            if (arg0.field1467 == -2) {
                if (!var2.method2810(2)) {
                    return false;
                }
                arg0.method1753().method2813(var3.field2528, 0, 2);
                var3.field2529 = 0;
                arg0.field1467 = var3.method3015();
            }
            if (!var2.method2810(arg0.field1467)) {
                return false;
            }
            var3.field2529 = 0;
            var2.method2813(var3.field2528, 0, arg0.field1467);
            arg0.field1466 = 0;
            field895.method4708();
            arg0.field1468 = arg0.field1471;
            arg0.field1471 = arg0.field1460;
            arg0.field1460 = arg0.field1465;
            if (class171.field2268 == arg0.field1465) {
                method1006(class174.field2439);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2303 == arg0.field1465) {
                int var7 = var3.method3069();
                int var8 = var3.method3059();
                class228 var9 = class228.method2725(var7);
                if (var9 != null && var9.field2765 == 0) {
                    if (var8 > var9.field2787 - var9.field2779) {
                        var8 = var9.field2787 - var9.field2779;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    if (var9.field2867 != var8) {
                        var9.field2867 = var8;
                        method211(var9);
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2277 == arg0.field1465) {
                int var10 = var3.method3062();
                int var11 = var3.method3069();
                class228 var12 = class228.method2725(var11);
                if (var12.field2750 != var10 || var10 == -1) {
                    var12.field2750 = var10;
                    var12.field2885 = 0;
                    var12.field2886 = 0;
                    method211(var12);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2278 == arg0.field1465) {
                int var13 = var3.method3026();
                class68 var14 = (class68) field1017.method3416((long) var13);
                if (var14 != null) {
                    method132(var14, true);
                }
                if (field1020 != null) {
                    method211(field1020);
                    field1020 = null;
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2293 == arg0.field1465) {
                String var15 = var3.method3030();
                String var16 = class276.method4581(class282.method2834(class277.method2724(var3)));
                class97.method1495(6, var15, var16);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2272 == arg0.field1465) {
                int var17 = var3.method3026();
                int var18 = var3.method3015();
                if (var17 < -70000) {
                    var18 += 32768;
                }
                class228 var19;
                if (var17 >= 0) {
                    var19 = class228.method2725(var17);
                } else {
                    var19 = null;
                }
                while (var3.field2529 < arg0.field1467) {
                    int var20 = var3.method3232();
                    int var21 = var3.method3015();
                    int var22 = 0;
                    if (var21 != 0) {
                        var22 = var3.method3021();
                        if (var22 == 255) {
                            var22 = var3.method3026();
                        }
                    }
                    if (var19 != null && var20 >= 0 && var20 < var19.field2881.length) {
                        var19.field2881[var20] = var21;
                        var19.field2882[var20] = var22;
                    }
                    Statics.method33(var18, var20, var21 - 1, var22);
                }
                if (var19 != null) {
                    method211(var19);
                }
                method2841();
                field941[++field1045 - 1 & 0x1F] = var18 & 0x7FFF;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2258 == arg0.field1465) {
                field890 = var3.method3023() * 30;
                field952 = field953;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2276 == arg0.field1465) {
                int var23 = var3.method3021();
                if (var3.method3021() == 0) {
                    field1130[var23] = new class17();
                    var3.field2529 += 18;
                } else {
                    var3.field2529--;
                    field1130[var23] = new class17(var3, false);
                }
                field1051 = field953;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2290 == arg0.field1465) {
                String var24 = var3.method3030();
                int var25 = var3.method3015();
                byte var26 = var3.method3022();
                boolean var27 = false;
                if (var26 == -128) {
                    var27 = true;
                }
                if (var27) {
                    if (Statics.field3303 == 0) {
                        arg0.field1465 = null;
                        return true;
                    }
                    boolean var28 = false;
                    int var29;
                    for (var29 = 0; var29 < Statics.field3303 && (!Statics.field1559[var29].field869.equals(var24) || Statics.field1559[var29].field868 != var25); var29++) {
                    }
                    if (var29 < Statics.field3303) {
                        while (var29 < Statics.field3303 - 1) {
                            Statics.field1559[var29] = Statics.field1559[var29 + 1];
                            var29++;
                        }
                        Statics.field3303--;
                        Statics.field1559[Statics.field3303] = null;
                    }
                } else {
                    var3.method3030();
                    class76 var30 = new class76();
                    var30.field869 = var24;
                    var30.field871 = class279.method311(var30.field869, Statics.field295);
                    var30.field868 = var25;
                    var30.field870 = var26;
                    int var31;
                    for (var31 = Statics.field3303 - 1; var31 >= 0; var31--) {
                        int var32 = Statics.field1559[var31].field871.compareTo(var30.field871);
                        if (var32 == 0) {
                            Statics.field1559[var31].field868 = var25;
                            Statics.field1559[var31].field870 = var26;
                            if (var24.equals(Statics.field289.field860)) {
                                Statics.field375 = var26;
                            }
                            field1050 = field953;
                            arg0.field1465 = null;
                            return true;
                        }
                        if (var32 < 0) {
                            break;
                        }
                    }
                    if (Statics.field3303 >= Statics.field1559.length) {
                        arg0.field1465 = null;
                        return true;
                    }
                    for (int var33 = Statics.field3303 - 1; var33 > var31; var33--) {
                        Statics.field1559[var33 + 1] = Statics.field1559[var33];
                    }
                    if (Statics.field3303 == 0) {
                        Statics.field1559 = new class76[100];
                    }
                    Statics.field1559[var31 + 1] = var30;
                    Statics.field3303++;
                    if (var24.equals(Statics.field289.field860)) {
                        Statics.field375 = var26;
                    }
                }
                field1050 = field953;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2305 == arg0.field1465) {
                int var34 = var3.method3232();
                boolean var35 = var3.method3021() == 1;
                String var36 = "";
                boolean var37 = false;
                if (var35) {
                    var36 = var3.method3030();
                    if (method314(var36)) {
                        var37 = true;
                    }
                }
                String var38 = var3.method3030();
                if (!var37) {
                    class97.method1495(var34, var36, var38);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2307 == arg0.field1465) {
                method2841();
                int var39 = var3.method3060();
                int var40 = var3.method3070();
                int var41 = var3.method3060();
                field901[var39] = var40;
                field990[var39] = var41;
                field1116[var39] = 1;
                for (int var42 = 0; var42 < 98; var42++) {
                    if (var40 >= class234.field2949[var42]) {
                        field1116[var39] = var42 + 2;
                    }
                }
                field1094[++field1046 - 1 & 0x1F] = var39;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2298 == arg0.field1465) {
                int var43 = var3.method3059();
                int var44 = var3.method3069();
                int var45 = var3.method3204();
                int var46 = var3.method3204();
                class228 var47 = class228.method2725(var44);
                if (var47.field2814 != var45 || var47.field2815 != var46 || var47.field2817 != var43) {
                    var47.field2814 = var45;
                    var47.field2815 = var46;
                    var47.field2817 = var43;
                    method211(var47);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2288 == arg0.field1465) {
                int var48 = var3.method3015();
                int var49 = var3.method3069();
                class228 var50 = class228.method2725(var49);
                if (var50.field2889 != 2 || var50.field2807 != var48) {
                    var50.field2889 = 2;
                    var50.field2807 = var48;
                    method211(var50);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2308 == arg0.field1465) {
                field1102 = false;
                for (int var51 = 0; var51 < 5; var51++) {
                    field1098[var51] = false;
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2260 == arg0.field1465) {
                int var52 = var3.method3026();
                int var53 = var3.method3026();
                int var54 = class59.method235();
                class175 var55 = class175.method3892(class172.field2340, field916.field1463);
                var55.field2451.method3047(var54);
                var55.field2451.method3005(var52);
                var55.field2451.method3005(var53);
                var55.field2451.method3047(field666);
                field916.method1747(var55);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2259 == arg0.field1465) {
                int var56 = var3.method3059();
                field1016 = var56;
                this.method1256(false);
                method123(var56);
                class83.method41(field1016);
                for (int var57 = 0; var57 < 100; var57++) {
                    field1042[var57] = true;
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2310 == arg0.field1465) {
                field1072 = var3.method3021();
                field1073 = var3.method3021();
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2309 == arg0.field1465) {
                method1006(class174.field2446);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2321 == arg0.field1465) {
                int var58 = var3.method3070();
                class228 var59 = class228.method2725(var58);
                var59.field2889 = 3;
                var59.field2807 = Statics.field289.field858.method3812();
                method211(var59);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2294 == arg0.field1465) {
                int var60 = var3.method3068();
                int var61 = var3.method3069();
                int var62 = var3.method3023();
                if (var62 == 65535) {
                    var62 = -1;
                }
                class228 var63 = class228.method2725(var61);
                if (var63.field2812) {
                    var63.field2883 = var62;
                    var63.field2884 = var60;
                    class268 var65 = class268.method1985(var62);
                    var63.field2814 = var65.field3589;
                    var63.field2815 = var65.field3609;
                    var63.field2767 = var65.field3594;
                    var63.field2869 = var65.field3590;
                    var63.field2813 = var65.field3593;
                    var63.field2817 = var65.field3588;
                    if (var65.field3578 == 1) {
                        var63.field2785 = 1;
                    } else {
                        var63.field2785 = 2;
                    }
                    if (var63.field2818 > 0) {
                        var63.field2817 = var63.field2817 * 32 / var63.field2818;
                    } else if (var63.field2774 > 0) {
                        var63.field2817 = var63.field2817 * 32 / var63.field2774;
                    }
                    method211(var63);
                } else if (var62 == -1) {
                    var63.field2889 = 0;
                    arg0.field1465 = null;
                    return true;
                } else {
                    class268 var64 = class268.method1985(var62);
                    var63.field2889 = 4;
                    var63.field2807 = var62;
                    var63.field2814 = var64.field3589;
                    var63.field2815 = var64.field3609;
                    var63.field2817 = var64.field3588 * 100 / var60;
                    method211(var63);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2317 == arg0.field1465) {
                String var66 = var3.method3030();
                Statics.field830 = var66;
                try {
                    String var67 = Statics.field2183.getParameter(class287.field3797.field3800);
                    String var68 = Statics.field2183.getParameter(class287.field3787.field3800);
                    String var69 = var67 + "settings=" + var66 + "; version=1; path=/; domain=" + var68;
                    String var70;
                    if (var66.length() == 0) {
                        var70 = var69 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var70 = var69 + "; Expires=" + class194.method1015(class187.method938() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    class53.method668(Statics.field2183, "document.cookie=\"" + var70 + "\"");
                } catch (Throwable var303) {
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2267 == arg0.field1465) {
                String var72 = var3.method3030();
                int var73 = var3.method3026();
                class228 var74 = class228.method2725(var73);
                if (!var72.equals(var74.field2823)) {
                    var74.field2823 = var72;
                    method211(var74);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2324 == arg0.field1465) {
                String var75 = var3.method3030();
                Object[] var76 = new Object[var75.length() + 1];
                for (int var77 = var75.length() - 1; var77 >= 0; var77--) {
                    if (var75.charAt(var77) == 's') {
                        var76[var77 + 1] = var3.method3030();
                    } else {
                        var76[var77 + 1] = Integer.valueOf(var3.method3026());
                    }
                }
                var76[0] = Integer.valueOf(var3.method3026());
                class69 var78 = new class69();
                var78.field805 = var76;
                class83.method1505(var78);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2264 == arg0.field1465) {
                Statics.field1216 = var3.method3049();
                Statics.field506 = var3.method3049();
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2327 == arg0.field1465) {
                method1006(class174.field2441);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2269 == arg0.field1465) {
                class80 var79 = new class80();
                var79.field1229 = var3.method3030();
                var79.field1226 = var3.method3015();
                int var80 = var3.method3026();
                var79.field1220 = var80;
                method1076(45);
                var2.method2826();
                Object var81 = null;
                class92.method1605(var79);
                arg0.field1465 = null;
                return false;
            }
            if (class171.field2315 == arg0.field1465) {
                int var82 = var3.method3024();
                int var83 = var3.method3003();
                int var84 = var3.method3026();
                class228 var85 = class228.method2725(var84);
                if (var85.field2865 != var82 || var85.field2773 != var83 || var85.field2768 != 0 || var85.field2795 != 0) {
                    var85.field2865 = var82;
                    var85.field2773 = var83;
                    var85.field2768 = 0;
                    var85.field2795 = 0;
                    method211(var85);
                    this.method1092(var85);
                    if (var85.field2765 == 0) {
                        method2835(Statics.field2754[var84 >> 16], var85, false);
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2252 == arg0.field1465) {
                method2841();
                field1063 = var3.method3021();
                field952 = field953;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2304 == arg0.field1465) {
                field1078 = 1;
                field881 = field953;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2311 == arg0.field1465) {
                var3.field2529 += 28;
                if (var3.method3103()) {
                    int var86 = var3.field2529 - 28;
                    byte[] var87 = var3.field2528;
                    if (field1122 == null) {
                        field1122 = new byte[24];
                    }
                    class195.method3344(var87, var86, field1122, 0, 24);
                    if (class158.field2167 != null) {
                        try {
                            class158.field2167.method2175(0L);
                            class158.field2167.method2172(var3.field2528, var86, 24);
                        } catch (Exception var302) {
                        }
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2257 == arg0.field1465) {
                Statics.field1216 = var3.method3049();
                Statics.field506 = var3.method3060();
                for (int var89 = Statics.field506; var89 < Statics.field506 + 8; var89++) {
                    for (int var90 = Statics.field1216; var90 < Statics.field1216 + 8; var90++) {
                        if (field986[Statics.field226][var89][var90] != null) {
                            field986[Statics.field226][var89][var90] = null;
                            method1024(var89, var90);
                        }
                    }
                }
                for (class77 var91 = (class77) field987.method3492(); var91 != null; var91 = (class77) field987.method3481()) {
                    if (var91.field1139 >= Statics.field506 && var91.field1139 < Statics.field506 + 8 && var91.field1140 >= Statics.field1216 && var91.field1140 < Statics.field1216 + 8 && Statics.field226 == var91.field1144) {
                        var91.field1137 = 0;
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2279 == arg0.field1465) {
                field1102 = true;
                Statics.field625 = var3.method3021();
                Statics.field1457 = var3.method3021();
                Statics.field783 = var3.method3015();
                Statics.field1273 = var3.method3021();
                Statics.field328 = var3.method3021();
                if (Statics.field328 >= 100) {
                    Statics.field672 = Statics.field625 * 128 + 64;
                    Statics.field702 = Statics.field1457 * 128 + 64;
                    Statics.field806 = method919(Statics.field672, Statics.field702, Statics.field226) - Statics.field783;
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2280 == arg0.field1465) {
                int var92 = var3.method3068();
                int var93 = var3.method3204();
                int var94 = var93 >> 10 & 0x1F;
                int var95 = var93 >> 5 & 0x1F;
                int var96 = var93 & 0x1F;
                int var97 = (var96 << 3) + (var94 << 19) + (var95 << 11);
                class228 var98 = class228.method2725(var92);
                if (var98.field2788 != var97) {
                    var98.field2788 = var97;
                    method211(var98);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2316 == arg0.field1465) {
                String var99 = var3.method3030();
                long var100 = (long) var3.method3015();
                long var102 = (long) var3.method3025();
                class242[] var104 = new class242[] { class242.field3274, class242.field3276, class242.field3283, class242.field3279, class242.field3273, class242.field3277 };
                class242 var105 = (class242) class180.method455(var104, var3.method3021());
                long var106 = (var100 << 32) + var102;
                boolean var108 = false;
                for (int var109 = 0; var109 < 100; var109++) {
                    if (field1075[var109] == var106) {
                        var108 = true;
                        break;
                    }
                }
                if (method314(var99)) {
                    var108 = true;
                }
                if (!var108 && field891 == 0) {
                    field1075[field960] = var106;
                    field960 = (field960 + 1) % 100;
                    String var110 = class276.method4581(class282.method2834(class277.method2724(var3)));
                    byte var111;
                    if (var105.field3281) {
                        var111 = 7;
                    } else {
                        var111 = 3;
                    }
                    if (var105.field3280 == -1) {
                        class97.method1495(var111, var99, var110);
                    } else {
                        class97.method1495(var111, class88.method1575(var105.field3280) + var99, var110);
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2249 == arg0.field1465) {
                field1102 = true;
                Statics.field378 = var3.method3021();
                Statics.field872 = var3.method3021();
                Statics.field787 = var3.method3015();
                Statics.field2192 = var3.method3021();
                Statics.field629 = var3.method3021();
                if (Statics.field629 >= 100) {
                    int var112 = Statics.field378 * 128 + 64;
                    int var113 = Statics.field872 * 128 + 64;
                    int var114 = method919(var112, var113, Statics.field226) - Statics.field787;
                    int var115 = var112 - Statics.field672;
                    int var116 = var114 - Statics.field806;
                    int var117 = var113 - Statics.field702;
                    int var118 = (int) Math.sqrt((double) (var115 * var115 + var117 * var117));
                    Statics.field1571 = (int) (Math.atan2((double) var116, (double) var118) * 325.949D) & 0x7FF;
                    Statics.field16 = (int) (Math.atan2((double) var115, (double) var117) * -325.949D) & 0x7FF;
                    if (Statics.field1571 < 128) {
                        Statics.field1571 = 128;
                    }
                    if (Statics.field1571 > 383) {
                        Statics.field1571 = 383;
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2265 == arg0.field1465) {
                int var119 = var3.method3204();
                if (var119 == 65535) {
                    var119 = -1;
                }
                method580(var119);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2322 == arg0.field1465) {
                int var120 = var3.method3023();
                if (var120 == 65535) {
                    var120 = -1;
                }
                int var121 = var3.method3035();
                method457(var120, var121);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2318 == arg0.field1465) {
                int var122 = var3.method3015();
                int var123 = var3.method3021();
                int var124 = var3.method3015();
                if (field904 != 0 && var123 != 0 && field1026 < 50) {
                    field1097[field1026] = var122;
                    field1028[field1026] = var123;
                    field1099[field1026] = var124;
                    field1101[field1026] = null;
                    field1100[field1026] = 0;
                    field1026++;
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2312 == arg0.field1465) {
                method224(true, var3);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2284 == arg0.field1465) {
                int var128 = var3.method3021();
                int var129 = var3.method3021();
                int var130 = var3.method3021();
                int var131 = var3.method3021();
                field1098[var128] = true;
                field930[var128] = var129;
                field1105[var128] = var130;
                field1106[var128] = var131;
                field1044[var128] = 0;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2289 == arg0.field1465) {
                field1050 = field953;
                if (arg0.field1467 == 0) {
                    field955 = null;
                    field1082 = null;
                    Statics.field3303 = 0;
                    Statics.field1559 = null;
                    arg0.field1465 = null;
                    return true;
                }
                field1082 = var3.method3030();
                long var132 = var3.method3027();
                field955 = Statics.method2908(var132);
                Statics.field527 = var3.method3022();
                int var134 = var3.method3021();
                if (var134 == 255) {
                    arg0.field1465 = null;
                    return true;
                }
                Statics.field3303 = var134;
                class76[] var135 = new class76[100];
                for (int var136 = 0; var136 < Statics.field3303; var136++) {
                    var135[var136] = new class76();
                    var135[var136].field869 = var3.method3030();
                    var135[var136].field871 = class279.method311(var135[var136].field869, Statics.field295);
                    var135[var136].field868 = var3.method3015();
                    var135[var136].field870 = var3.method3022();
                    var3.method3030();
                    if (var135[var136].field869.equals(Statics.field289.field860)) {
                        Statics.field375 = var135[var136].field870;
                    }
                }
                boolean var137 = false;
                int var138 = Statics.field3303;
                while (var138 > 0) {
                    boolean var139 = true;
                    var138--;
                    for (int var140 = 0; var140 < var138; var140++) {
                        if (var135[var140].field871.compareTo(var135[var140 + 1].field871) > 0) {
                            class76 var141 = var135[var140];
                            var135[var140] = var135[var140 + 1];
                            var135[var140 + 1] = var141;
                            var139 = false;
                        }
                    }
                    if (var139) {
                        break;
                    }
                }
                Statics.field1559 = var135;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2255 == arg0.field1465) {
                field943 = var3.method3021();
                if (field943 == 1) {
                    field905 = var3.method3015();
                }
                if (field943 >= 2 && field943 <= 6) {
                    if (field943 == 2) {
                        field897 = 64;
                        field1025 = 64;
                    }
                    if (field943 == 3) {
                        field897 = 0;
                        field1025 = 64;
                    }
                    if (field943 == 4) {
                        field897 = 128;
                        field1025 = 64;
                    }
                    if (field943 == 5) {
                        field897 = 64;
                        field1025 = 0;
                    }
                    if (field943 == 6) {
                        field897 = 64;
                        field1025 = 128;
                    }
                    field943 = 2;
                    field894 = var3.method3015();
                    field1074 = var3.method3015();
                    field896 = var3.method3021();
                }
                if (field943 == 10) {
                    field878 = var3.method3015();
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2292 == arg0.field1465) {
                int var142 = var3.method3026();
                class228 var143 = class228.method2725(var142);
                for (int var144 = 0; var144 < var143.field2881.length; var144++) {
                    var143.field2881[var144] = -1;
                    var143.field2881[var144] = 0;
                }
                method211(var143);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2254 == arg0.field1465) {
                method1006(class174.field2443);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2291 == arg0.field1465) {
                method1006(class174.field2438);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2283 == arg0.field1465) {
                for (int var145 = 0; var145 < Statics.field3379; var145++) {
                    class253 var146 = class253.method1603(var145);
                    if (var146 != null) {
                        class223.field2725[var145] = 0;
                        class223.field2726[var145] = 0;
                    }
                }
                method2841();
                field1043 += 32;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2274 == arg0.field1465) {
                int var147 = var3.method3069();
                int var148 = var3.method3023();
                class228 var149 = class228.method2725(var147);
                if (var149.field2889 != 1 || var149.field2807 != var148) {
                    var149.field2889 = 1;
                    var149.field2807 = var148;
                    method211(var149);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2286 == arg0.field1465) {
                method224(false, var3);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2302 == arg0.field1465) {
                int var150 = var3.method3023();
                int var151 = var3.method3059();
                int var152 = var3.method3068();
                class228 var153 = class228.method2725(var152);
                var153.field2819 = (var150 << 16) + var151;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2325 == arg0.field1465) {
                int var154 = var3.method3026();
                int var155 = var3.method3059();
                class223.field2725[var155] = var154;
                if (class223.field2726[var155] != var154) {
                    class223.field2726[var155] = var154;
                }
                method32(var155);
                field985[++field1043 - 1 & 0x1F] = var155;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2314 == arg0.field1465) {
                int var156 = arg0.field1467 + var3.field2529;
                int var157 = var3.method3015();
                int var158 = var3.method3015();
                if (field1016 != var157) {
                    field1016 = var157;
                    this.method1256(false);
                    method123(field1016);
                    class83.method41(field1016);
                    for (int var159 = 0; var159 < 100; var159++) {
                        field1042[var159] = true;
                    }
                }
                while (var158-- > 0) {
                    int var160 = var3.method3026();
                    int var161 = var3.method3015();
                    int var162 = var3.method3021();
                    class68 var163 = (class68) field1017.method3416((long) var160);
                    if (var163 != null && var163.field791 != var161) {
                        method132(var163, true);
                        var163 = null;
                    }
                    if (var163 == null) {
                        var163 = method935(var160, var161, var162);
                    }
                    var163.field793 = true;
                }
                for (class68 var164 = (class68) field1017.method3419(); var164 != null; var164 = (class68) field1017.method3415()) {
                    if (var164.field793) {
                        var164.field793 = false;
                    } else {
                        method132(var164, true);
                    }
                }
                field1058 = new class202(512);
                while (var3.field2529 < var156) {
                    int var165 = var3.method3026();
                    int var166 = var3.method3015();
                    int var167 = var3.method3015();
                    int var168 = var3.method3026();
                    for (int var169 = var166; var169 <= var167; var169++) {
                        long var170 = ((long) var165 << 32) + (long) var169;
                        field1058.method3417(new class210(var168), var170);
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2261 == arg0.field1465) {
                method1006(class174.field2444);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2323 == arg0.field1465) {
                for (int var172 = 0; var172 < class223.field2726.length; var172++) {
                    if (class223.field2726[var172] != class223.field2725[var172]) {
                        class223.field2726[var172] = class223.field2725[var172];
                        method32(var172);
                        field985[++field1043 - 1 & 0x1F] = var172;
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2253 == arg0.field1465) {
                boolean var173 = var3.method3121() == 1;
                int var174 = var3.method3069();
                class228 var175 = class228.method2725(var174);
                if (var175.field2783 != var173) {
                    var175.field2783 = var173;
                    method211(var175);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2295 == arg0.field1465) {
                int var176 = arg0.field1467;
                class293 var177 = new class293();
                var177.field3821 = var3.method3021();
                var177.field3822 = var3.method3026();
                var177.field3828 = new int[var177.field3821];
                var177.field3824 = new int[var177.field3821];
                var177.field3825 = new Field[var177.field3821];
                var177.field3826 = new int[var177.field3821];
                var177.field3823 = new Method[var177.field3821];
                var177.field3827 = new byte[var177.field3821][][];
                for (int var178 = 0; var178 < var177.field3821; var178++) {
                    try {
                        int var179 = var3.method3021();
                        if (var179 == 0 || var179 == 1 || var179 == 2) {
                            String var180 = var3.method3030();
                            String var181 = var3.method3030();
                            int var182 = 0;
                            if (var179 == 1) {
                                var182 = var3.method3026();
                            }
                            var177.field3828[var178] = var179;
                            var177.field3826[var178] = var182;
                            if (class294.method3263(var180).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var177.field3825[var178] = class294.method3263(var180).getDeclaredField(var181);
                        } else if (var179 == 3 || var179 == 4) {
                            String var183 = var3.method3030();
                            String var184 = var3.method3030();
                            int var185 = var3.method3021();
                            String[] var186 = new String[var185];
                            for (int var187 = 0; var187 < var185; var187++) {
                                var186[var187] = var3.method3030();
                            }
                            String var188 = var3.method3030();
                            byte[][] var189 = new byte[var185][];
                            if (var179 == 3) {
                                for (int var190 = 0; var190 < var185; var190++) {
                                    int var191 = var3.method3026();
                                    var189[var190] = new byte[var191];
                                    var3.method3033(var189[var190], 0, var191);
                                }
                            }
                            var177.field3828[var178] = var179;
                            Class[] var192 = new Class[var185];
                            for (int var193 = 0; var193 < var185; var193++) {
                                var192[var193] = class294.method3263(var186[var193]);
                            }
                            Class var194 = class294.method3263(var188);
                            if (class294.method3263(var183).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var195 = class294.method3263(var183).getDeclaredMethods();
                            Method[] var196 = var195;
                            for (int var197 = 0; var197 < var196.length; var197++) {
                                Method var198 = var196[var197];
                                if (var198.getName().equals(var184)) {
                                    Class[] var199 = var198.getParameterTypes();
                                    if (var192.length == var199.length) {
                                        boolean var200 = true;
                                        for (int var201 = 0; var201 < var192.length; var201++) {
                                            if (var192[var201] != var199[var201]) {
                                                var200 = false;
                                                break;
                                            }
                                        }
                                        if (var200 && var194 == var198.getReturnType()) {
                                            var177.field3823[var178] = var198;
                                        }
                                    }
                                }
                            }
                            var177.field3827[var178] = var189;
                        }
                    } catch (ClassNotFoundException var304) {
                        var177.field3824[var178] = -1;
                    } catch (SecurityException var305) {
                        var177.field3824[var178] = -2;
                    } catch (NullPointerException var306) {
                        var177.field3824[var178] = -3;
                    } catch (Exception var307) {
                        var177.field3824[var178] = -4;
                    } catch (Throwable var308) {
                        var177.field3824[var178] = -5;
                    }
                }
                class294.field3829.method3438(var177);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2281 == arg0.field1465) {
                int var207 = var3.method3059();
                class64 var208 = (class64) class64.field755.method3416((long) var207);
                if (var208 != null) {
                    var208.method3474();
                }
                field941[++field1045 - 1 & 0x1F] = var207 & 0x7FFF;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2266 == arg0.field1465) {
                method2841();
                field957 = var3.method3024();
                field952 = field953;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2270 == arg0.field1465) {
                int var209 = var3.method3069();
                int var210 = var3.method3069();
                class68 var211 = (class68) field1017.method3416((long) var210);
                class68 var212 = (class68) field1017.method3416((long) var209);
                if (var212 != null) {
                    method132(var212, var211 == null || var211.field791 != var212.field791);
                }
                if (var211 != null) {
                    var211.method3474();
                    field1017.method3417(var211, (long) var209);
                }
                class228 var213 = class228.method2725(var210);
                if (var213 != null) {
                    method211(var213);
                }
                class228 var214 = class228.method2725(var209);
                if (var214 != null) {
                    method211(var214);
                    method2835(Statics.field2754[var214.field2763 >>> 16], var214, true);
                }
                if (field1016 != -1) {
                    int var215 = field1016;
                    if (class228.method4526(var215)) {
                        method665(Statics.field2754[var215], 1);
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2300 == arg0.field1465) {
                int var216 = var3.method3026();
                int var217 = var3.method3015();
                if (var216 < -70000) {
                    var217 += 32768;
                }
                class228 var218;
                if (var216 >= 0) {
                    var218 = class228.method2725(var216);
                } else {
                    var218 = null;
                }
                if (var218 != null) {
                    for (int var219 = 0; var219 < var218.field2881.length; var219++) {
                        var218.field2881[var219] = 0;
                        var218.field2882[var219] = 0;
                    }
                }
                class64 var220 = (class64) class64.field755.method3416((long) var217);
                if (var220 != null) {
                    for (int var221 = 0; var221 < var220.field754.length; var221++) {
                        var220.field754[var221] = -1;
                        var220.field759[var221] = 0;
                    }
                }
                int var222 = var3.method3015();
                for (int var223 = 0; var223 < var222; var223++) {
                    int var224 = var3.method3121();
                    if (var224 == 255) {
                        var224 = var3.method3026();
                    }
                    int var225 = var3.method3204();
                    if (var218 != null && var223 < var218.field2881.length) {
                        var218.field2881[var223] = var225;
                        var218.field2882[var223] = var224;
                    }
                    Statics.method33(var217, var223, var225 - 1, var224);
                }
                if (var218 != null) {
                    method211(var218);
                }
                method2841();
                field941[++field1045 - 1 & 0x1F] = var217 & 0x7FFF;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2263 == arg0.field1465) {
                Statics.field1216 = var3.method3121();
                Statics.field506 = var3.method3060();
                while (var3.field2529 < arg0.field1467) {
                    int var226 = var3.method3021();
                    class174[] var227 = new class174[] { class174.field2446, class174.field2438, class174.field2439, class174.field2437, class174.field2441, class174.field2443, class174.field2448, class174.field2444, class174.field2445, class174.field2440 };
                    class174 var228 = var227[var226];
                    method1006(var228);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2282 == arg0.field1465) {
                int var229 = var3.method3068();
                int var230 = var3.method3121();
                int var231 = var3.method3204();
                class68 var232 = (class68) field1017.method3416((long) var229);
                if (var232 != null) {
                    method132(var232, var232.field791 != var231);
                }
                method935(var229, var231, var230);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2262 == arg0.field1465) {
                int var233 = var3.method3021();
                int var234 = var3.method3049();
                String var235 = var3.method3030();
                if (var234 >= 1 && var234 <= 8) {
                    if (var235.equalsIgnoreCase("null")) {
                        var235 = null;
                    }
                    field982[var234 - 1] = var235;
                    field983[var234 - 1] = var233 == 0;
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2285 == arg0.field1465) {
                while (var3.field2529 < arg0.field1467) {
                    boolean var236 = var3.method3021() == 1;
                    String var237 = var3.method3030();
                    String var238 = var3.method3030();
                    int var239 = var3.method3015();
                    int var240 = var3.method3021();
                    int var241 = var3.method3021();
                    boolean var242 = (var241 & 0x2) != 0;
                    boolean var243 = (var241 & 0x1) != 0;
                    if (var239 > 0) {
                        var3.method3030();
                        var3.method3021();
                        var3.method3026();
                    }
                    var3.method3030();
                    for (int var244 = 0; var244 < field1121; var244++) {
                        class66 var245 = field1123[var244];
                        if (var236) {
                            if (var238.equals(var245.field782)) {
                                var245.field782 = var237;
                                var245.field776 = var238;
                                var237 = null;
                                break;
                            }
                        } else if (var237.equals(var245.field782)) {
                            if (var245.field775 != var239) {
                                boolean var246 = true;
                                for (class67 var247 = (class67) field1124.method3519(); var247 != null; var247 = (class67) field1124.method3520()) {
                                    if (var247.field784.equals(var237)) {
                                        if (var239 != 0 && var247.field786 == 0) {
                                            var247.method3529();
                                            var246 = false;
                                        } else if (var239 == 0 && var247.field786 != 0) {
                                            var247.method3529();
                                            var246 = false;
                                        }
                                    }
                                }
                                if (var246) {
                                    field1124.method3518(new class67(var237, var239));
                                }
                                var245.field775 = var239;
                            }
                            var245.field776 = var238;
                            var245.field779 = var240;
                            var245.field777 = var242;
                            var245.field780 = var243;
                            var237 = null;
                            break;
                        }
                    }
                    if (var237 != null && field1121 < 400) {
                        class66 var248 = new class66();
                        field1123[field1121] = var248;
                        var248.field782 = var237;
                        var248.field776 = var238;
                        var248.field775 = var239;
                        var248.field779 = var240;
                        var248.field777 = var242;
                        var248.field780 = var243;
                        field1121++;
                    }
                }
                field1078 = 2;
                field881 = field953;
                boolean var249 = false;
                int var250 = field1121;
                while (var250 > 0) {
                    boolean var251 = true;
                    var250--;
                    for (int var252 = 0; var252 < var250; var252++) {
                        boolean var253 = false;
                        class66 var254 = field1123[var252];
                        class66 var255 = field1123[var252 + 1];
                        if (field874 != var254.field775 && field874 == var255.field775) {
                            var253 = true;
                        }
                        if (!var253 && var254.field775 == 0 && var255.field775 != 0) {
                            var253 = true;
                        }
                        if (!var253 && !var254.field777 && var255.field777) {
                            var253 = true;
                        }
                        if (!var253 && !var254.field780 && var255.field780) {
                            var253 = true;
                        }
                        if (var253) {
                            class66 var256 = field1123[var252];
                            field1123[var252] = field1123[var252 + 1];
                            field1123[var252 + 1] = var256;
                            var251 = false;
                        }
                    }
                    if (var251) {
                        break;
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2271 == arg0.field1465) {
                int var257 = var3.method3070();
                int var258 = var3.method3070();
                int var259 = var3.method3204();
                if (var259 == 65535) {
                    var259 = -1;
                }
                int var260 = var3.method3204();
                if (var260 == 65535) {
                    var260 = -1;
                }
                for (int var261 = var260; var261 <= var259; var261++) {
                    long var262 = ((long) var258 << 32) + (long) var261;
                    class204 var264 = field1058.method3416(var262);
                    if (var264 != null) {
                        var264.method3474();
                    }
                    field1058.method3417(new class210(var257), var262);
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2306 == arg0.field1465) {
                while (var3.field2529 < arg0.field1467) {
                    int var265 = var3.method3021();
                    boolean var266 = (var265 & 0x1) == 1;
                    String var267 = var3.method3030();
                    String var268 = var3.method3030();
                    var3.method3030();
                    for (int var269 = 0; var269 < field1032; var269++) {
                        class70 var270 = field1012[var269];
                        if (var266) {
                            if (var268.equals(var270.field809)) {
                                var270.field809 = var267;
                                var270.field808 = var268;
                                var267 = null;
                                break;
                            }
                        } else if (var267.equals(var270.field809)) {
                            var270.field809 = var267;
                            var270.field808 = var268;
                            var267 = null;
                            break;
                        }
                    }
                    if (var267 != null && field1032 < 400) {
                        class70 var271 = new class70();
                        field1012[field1032] = var271;
                        var271.field809 = var267;
                        var271.field808 = var268;
                        field1032++;
                    }
                }
                field881 = field953;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2313 == arg0.field1465) {
                method994(true, arg0.field1464);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2301 == arg0.field1465) {
                if (field1016 != -1) {
                    int var272 = field1016;
                    if (class228.method4526(var272)) {
                        method665(Statics.field2754[var272], 0);
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2251 == arg0.field1465) {
                byte var273 = var3.method3053();
                int var274 = var3.method3204();
                class223.field2725[var274] = var273;
                if (class223.field2726[var274] != var273) {
                    class223.field2726[var274] = var273;
                }
                method32(var274);
                field985[++field1043 - 1 & 0x1F] = var274;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2287 == arg0.field1465) {
                method1006(class174.field2437);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2296 == arg0.field1465) {
                class95.method221(var3, arg0.field1467);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2250 == arg0.field1465) {
                method1();
                arg0.field1465 = null;
                return false;
            }
            if (class171.field2273 == arg0.field1465) {
                field1013 = var3.method3021();
                if (field1013 == 255) {
                    field1013 = 0;
                }
                field946 = var3.method3021();
                if (field946 == 255) {
                    field946 = 0;
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2326 == arg0.field1465) {
                method994(false, arg0.field1464);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2320 == arg0.field1465) {
                field1090 = var3.method3021();
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2328 == arg0.field1465) {
                for (int var275 = 0; var275 < field900.length; var275++) {
                    if (field900[var275] != null) {
                        field900[var275].field1182 = -1;
                    }
                }
                for (int var276 = 0; var276 < field1110.length; var276++) {
                    if (field1110[var276] != null) {
                        field1110[var276].field1182 = -1;
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2319 == arg0.field1465) {
                method1006(class174.field2448);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2299 == arg0.field1465) {
                String var277 = var3.method3030();
                long var278 = var3.method3027();
                long var280 = (long) var3.method3015();
                long var282 = (long) var3.method3025();
                class242[] var284 = new class242[] { class242.field3274, class242.field3276, class242.field3283, class242.field3279, class242.field3273, class242.field3277 };
                class242 var285 = (class242) class180.method455(var284, var3.method3021());
                long var286 = (var280 << 32) + var282;
                boolean var288 = false;
                for (int var289 = 0; var289 < 100; var289++) {
                    if (field1075[var289] == var286) {
                        var288 = true;
                        break;
                    }
                }
                if (var285.field3282 && method314(var277)) {
                    var288 = true;
                }
                if (!var288 && field891 == 0) {
                    field1075[field960] = var286;
                    field960 = (field960 + 1) % 100;
                    String var290 = class276.method4581(class282.method2834(class277.method2724(var3)));
                    if (var285.field3280 == -1) {
                        class97.method21(9, var277, var290, class280.method120(var278));
                    } else {
                        class97.method21(9, class88.method1575(var285.field3280) + var277, var290, class280.method120(var278));
                    }
                }
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2297 == arg0.field1465) {
                boolean var291 = var3.method3021() == 1;
                if (var291) {
                    Statics.field3717 = class187.method938() - var3.method3027();
                    Statics.field308 = new class14(var3, true);
                } else {
                    Statics.field308 = null;
                }
                field1052 = field953;
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2256 == arg0.field1465) {
                method1006(class174.field2445);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2275 == arg0.field1465) {
                method1006(class174.field2440);
                arg0.field1465 = null;
                return true;
            }
            if (class171.field2248 == arg0.field1465) {
                int var292 = var3.method3021();
                class290[] var293 = new class290[] { class290.field3814, class290.field3813, class290.field3815 };
                class290[] var294 = var293;
                int var295 = 0;
                class290 var297;
                while (true) {
                    if (var295 >= var294.length) {
                        var297 = null;
                        break;
                    }
                    class290 var296 = var294[var295];
                    if (var296.field3816 == var292) {
                        var297 = var296;
                        break;
                    }
                    var295++;
                }
                Statics.field581 = var297;
                arg0.field1465 = null;
                return true;
            }
            class155.method4721("" + (arg0.field1465 == null ? -1 : arg0.field1465.field2329) + class88.field1312 + (arg0.field1471 == null ? -1 : arg0.field1471.field2329) + class88.field1312 + (arg0.field1468 == null ? -1 : arg0.field1468.field2329) + class88.field1312 + arg0.field1467, (Throwable) null);
            method1();
        } catch (IOException var309) {
            method928();
        } catch (Exception var310) {
            String var300 = "" + (arg0.field1465 == null ? -1 : arg0.field1465.field2329) + class88.field1312 + (arg0.field1471 == null ? -1 : arg0.field1471.field2329) + class88.field1312 + (arg0.field1468 == null ? -1 : arg0.field1468.field2329) + class88.field1312 + arg0.field1467 + class88.field1312 + (Statics.field2458 + Statics.field289.field1199[0]) + class88.field1312 + (Statics.field1288 + Statics.field289.field1164[0]) + class88.field1312;
            for (int var301 = 0; var301 < arg0.field1467 && var301 < 50; var301++) {
                var300 = var300 + var3.field2528[var301] + class88.field1312;
            }
            class155.method4721(var300, var310);
            method1();
        }
        return true;
    }

    @ObfuscatedName("bp.hf(Lfe;I)V")
    public static final void method1006(class174 arg0) {
        class191 var1 = field916.field1464;
        if (class174.field2441 == arg0) {
            int var2 = var1.method3049();
            int var3 = (var2 >> 4 & 0x7) + Statics.field506;
            int var4 = (var2 & 0x7) + Statics.field1216;
            int var5 = var1.method3059();
            int var6 = var1.method3204();
            int var7 = var1.method3023();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class205 var8 = field986[Statics.field226][var3][var4];
                if (var8 != null) {
                    for (class94 var9 = (class94) var8.method3492(); var9 != null; var9 = (class94) var8.method3481()) {
                        if ((var7 & 0x7FFF) == var9.field1398 && var9.field1399 == var5) {
                            var9.field1399 = var6;
                            break;
                        }
                    }
                    method1024(var3, var4);
                }
            }
        } else if (class174.field2443 == arg0) {
            int var10 = var1.method3060();
            int var11 = (var10 >> 4 & 0x7) + Statics.field506;
            int var12 = (var10 & 0x7) + Statics.field1216;
            int var13 = var1.method3204();
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                class205 var14 = field986[Statics.field226][var11][var12];
                if (var14 != null) {
                    for (class94 var15 = (class94) var14.method3492(); var15 != null; var15 = (class94) var14.method3481()) {
                        if ((var13 & 0x7FFF) == var15.field1398) {
                            var15.method3474();
                            break;
                        }
                    }
                    if (var14.method3492() == null) {
                        field986[Statics.field226][var11][var12] = null;
                    }
                    method1024(var11, var12);
                }
            }
        } else {
            if (class174.field2439 == arg0) {
                int var16 = var1.method3021();
                int var17 = (var16 >> 4 & 0x7) + Statics.field506;
                int var18 = (var16 & 0x7) + Statics.field1216;
                int var19 = var1.method3023();
                byte var20 = var1.method3054();
                int var21 = var1.method3015();
                byte var22 = var1.method3081();
                int var23 = var1.method3060();
                int var24 = var23 >> 2;
                int var25 = var23 & 0x3;
                int var26 = field931[var24];
                int var27 = var1.method3204();
                byte var28 = var1.method3022();
                int var29 = var1.method3023();
                byte var30 = var1.method3053();
                class74 var31;
                if (field977 == var21) {
                    var31 = Statics.field289;
                } else {
                    var31 = field900[var21];
                }
                if (var31 != null) {
                    class267 var32 = class267.method1587(var29);
                    int var33;
                    int var34;
                    if (var25 == 1 || var25 == 3) {
                        var33 = var32.field3538;
                        var34 = var32.field3537;
                    } else {
                        var33 = var32.field3537;
                        var34 = var32.field3538;
                    }
                    int var35 = (var33 >> 1) + var17;
                    int var36 = (var33 + 1 >> 1) + var17;
                    int var37 = (var34 >> 1) + var18;
                    int var38 = (var34 + 1 >> 1) + var18;
                    int[][] var39 = class62.field742[Statics.field226];
                    int var40 = var39[var35][var37] + var39[var36][var37] + var39[var35][var38] + var39[var36][var38] >> 2;
                    int var41 = (var17 << 7) + (var33 << 6);
                    int var42 = (var18 << 7) + (var34 << 6);
                    class133 var43 = var32.method4310(var24, var25, var39, var41, var40, var42);
                    if (var43 != null) {
                        method138(Statics.field226, var17, var18, var26, -1, 0, 0, var27 + 1, var19 + 1);
                        var31.field835 = field883 + var27;
                        var31.field845 = field883 + var19;
                        var31.field849 = var43;
                        var31.field846 = var17 * 128 + var33 * 64;
                        var31.field848 = var18 * 128 + var34 * 64;
                        var31.field847 = var40;
                        if (var22 > var30) {
                            byte var44 = var22;
                            var22 = var30;
                            var30 = var44;
                        }
                        if (var28 > var20) {
                            byte var45 = var28;
                            var28 = var20;
                            var20 = var45;
                        }
                        var31.field850 = var17 + var22;
                        var31.field852 = var17 + var30;
                        var31.field851 = var18 + var28;
                        var31.field853 = var18 + var20;
                    }
                }
            }
            if (class174.field2448 == arg0) {
                int var46 = var1.method3060();
                int var47 = var1.method3024();
                int var48 = var1.method3021() * 4;
                int var49 = var1.method3059();
                byte var50 = var1.method3081();
                int var51 = var1.method3059();
                byte var52 = var1.method3081();
                int var53 = var1.method3049();
                int var54 = var1.method3060() * 4;
                int var55 = var1.method3049();
                int var56 = (var55 >> 4 & 0x7) + Statics.field506;
                int var57 = (var55 & 0x7) + Statics.field1216;
                int var58 = var1.method3023();
                int var59 = var50 + var56;
                int var60 = var52 + var57;
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var49 != 65535) {
                    int var61 = var56 * 128 + 64;
                    int var62 = var57 * 128 + 64;
                    int var63 = var59 * 128 + 64;
                    int var64 = var60 * 128 + 64;
                    class93 var65 = new class93(var49, Statics.field226, var61, var62, method919(var61, var62, Statics.field226) - var48, field883 + var58, field883 + var51, var53, var46, var47, var54);
                    var65.method1654(var63, var64, method919(var63, var64, Statics.field226) - var54, field883 + var58);
                    field988.method3482(var65);
                }
            } else if (class174.field2440 == arg0) {
                int var66 = var1.method3015();
                int var67 = var1.method3021();
                int var68 = (var67 >> 4 & 0x7) + Statics.field506;
                int var69 = (var67 & 0x7) + Statics.field1216;
                int var70 = var1.method3021();
                int var71 = var70 >> 2;
                int var72 = var70 & 0x3;
                int var73 = field931[var71];
                if (var68 >= 0 && var69 >= 0 && var68 < 103 && var69 < 103) {
                    if (var73 == 0) {
                        class142 var74 = Statics.field566.method2542(Statics.field226, var68, var69);
                        if (var74 != null) {
                            int var75 = var74.field2037 >> 14 & 0x7FFF;
                            if (var71 == 2) {
                                var74.field2033 = new class99(var75, 2, var72 + 4, Statics.field226, var68, var69, var66, false, var74.field2033);
                                var74.field2034 = new class99(var75, 2, var72 + 1 & 0x3, Statics.field226, var68, var69, var66, false, var74.field2034);
                            } else {
                                var74.field2033 = new class99(var75, var71, var72, Statics.field226, var68, var69, var66, false, var74.field2033);
                            }
                        }
                    }
                    if (var73 == 1) {
                        class147 var76 = Statics.field566.method2543(Statics.field226, var68, var69);
                        if (var76 != null) {
                            int var77 = var76.field2077 >> 14 & 0x7FFF;
                            if (var71 == 4 || var71 == 5) {
                                var76.field2074 = new class99(var77, 4, var72, Statics.field226, var68, var69, var66, false, var76.field2074);
                            } else if (var71 == 6) {
                                var76.field2074 = new class99(var77, 4, var72 + 4, Statics.field226, var68, var69, var66, false, var76.field2074);
                            } else if (var71 == 7) {
                                var76.field2074 = new class99(var77, 4, (var72 + 2 & 0x3) + 4, Statics.field226, var68, var69, var66, false, var76.field2074);
                            } else if (var71 == 8) {
                                var76.field2074 = new class99(var77, 4, var72 + 4, Statics.field226, var68, var69, var66, false, var76.field2074);
                                var76.field2068 = new class99(var77, 4, (var72 + 2 & 0x3) + 4, Statics.field226, var68, var69, var66, false, var76.field2068);
                            }
                        }
                    }
                    if (var73 == 2) {
                        class148 var78 = Statics.field566.method2627(Statics.field226, var68, var69);
                        if (var71 == 11) {
                            var71 = 10;
                        }
                        if (var78 != null) {
                            var78.field2082 = new class99(var78.field2085 >> 14 & 0x7FFF, var71, var72, Statics.field226, var68, var69, var66, false, var78.field2082);
                        }
                    }
                    if (var73 == 3) {
                        class129 var79 = Statics.field566.method2541(Statics.field226, var68, var69);
                        if (var79 != null) {
                            var79.field1770 = new class99(var79.field1776 >> 14 & 0x7FFF, 22, var72, Statics.field226, var68, var69, var66, false, var79.field1770);
                        }
                    }
                }
            } else if (class174.field2445 == arg0) {
                int var80 = var1.method3015();
                int var81 = var1.method3049();
                int var82 = var1.method3121();
                int var83 = (var82 >> 4 & 0x7) + Statics.field506;
                int var84 = (var82 & 0x7) + Statics.field1216;
                int var85 = var1.method3059();
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var86 = var83 * 128 + 64;
                    int var87 = var84 * 128 + 64;
                    class84 var88 = new class84(var80, Statics.field226, var86, var87, method919(var86, var87, Statics.field226) - var81, var85, field883);
                    field989.method3482(var88);
                }
            } else if (class174.field2438 == arg0) {
                int var89 = var1.method3021();
                int var90 = var89 >> 2;
                int var91 = var89 & 0x3;
                int var92 = field931[var90];
                int var93 = var1.method3121();
                int var94 = (var93 >> 4 & 0x7) + Statics.field506;
                int var95 = (var93 & 0x7) + Statics.field1216;
                int var96 = var1.method3023();
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    method138(Statics.field226, var94, var95, var92, var96, var90, var91, 0, -1);
                }
            } else if (class174.field2444 == arg0) {
                int var97 = var1.method3060();
                int var98 = var97 >> 2;
                int var99 = var97 & 0x3;
                int var100 = field931[var98];
                int var101 = var1.method3049();
                int var102 = (var101 >> 4 & 0x7) + Statics.field506;
                int var103 = (var101 & 0x7) + Statics.field1216;
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    method138(Statics.field226, var102, var103, var100, -1, var98, var99, 0, -1);
                }
            } else if (class174.field2437 == arg0) {
                int var104 = var1.method3023();
                int var105 = var1.method3059();
                int var106 = var1.method3021();
                int var107 = (var106 >> 4 & 0x7) + Statics.field506;
                int var108 = (var106 & 0x7) + Statics.field1216;
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    class94 var109 = new class94();
                    var109.field1398 = var105;
                    var109.field1399 = var104;
                    if (field986[Statics.field226][var107][var108] == null) {
                        field986[Statics.field226][var107][var108] = new class205();
                    }
                    field986[Statics.field226][var107][var108].method3482(var109);
                    method1024(var107, var108);
                }
            } else if (class174.field2446 == arg0) {
                int var110 = var1.method3021();
                int var111 = var110 >> 4 & 0xF;
                int var112 = var110 & 0x7;
                int var113 = var1.method3059();
                int var114 = var1.method3049();
                int var115 = (var114 >> 4 & 0x7) + Statics.field506;
                int var116 = (var114 & 0x7) + Statics.field1216;
                int var117 = var1.method3121();
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                    int var118 = var111 + 1;
                    if (Statics.field289.field1199[0] >= var115 - var118 && Statics.field289.field1199[0] <= var115 + var118 && Statics.field289.field1164[0] >= var116 - var118 && Statics.field289.field1164[0] <= var116 + var118 && field1095 != 0 && var112 > 0 && field1026 < 50) {
                        field1097[field1026] = var113;
                        field1028[field1026] = var112;
                        field1099[field1026] = var117;
                        field1101[field1026] = null;
                        field1100[field1026] = (var115 << 16) + (var116 << 8) + var111;
                        field1026++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.hw(IIIIIIIIII)V")
    public static final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field987.method3492(); var10 != null; var10 = (class77) field987.method3481()) {
            if (var10.field1144 == arg0 && var10.field1139 == arg1 && var10.field1140 == arg2 && var10.field1138 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1144 = arg0;
            var9.field1138 = arg3;
            var9.field1139 = arg1;
            var9.field1140 = arg2;
            method307(var9);
            field987.method3482(var9);
        }
        var9.field1149 = arg4;
        var9.field1146 = arg5;
        var9.field1145 = arg6;
        var9.field1147 = arg7;
        var9.field1137 = arg8;
    }

    @ObfuscatedName("az.hn(Lbc;I)V")
    public static final void method307(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1138 == 0) {
            var1 = Statics.field566.method2536(arg0.field1144, arg0.field1139, arg0.field1140);
        }
        if (arg0.field1138 == 1) {
            var1 = Statics.field566.method2547(arg0.field1144, arg0.field1139, arg0.field1140);
        }
        if (arg0.field1138 == 2) {
            var1 = Statics.field566.method2548(arg0.field1144, arg0.field1139, arg0.field1140);
        }
        if (arg0.field1138 == 3) {
            var1 = Statics.field566.method2549(arg0.field1144, arg0.field1139, arg0.field1140);
        }
        if (var1 != 0) {
            int var5 = Statics.field566.method2550(arg0.field1144, arg0.field1139, arg0.field1140, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1141 = var2;
        arg0.field1143 = var3;
        arg0.field1142 = var4;
    }

    @ObfuscatedName("gj.ht(I)V")
    public static final void method3261() {
        for (class77 var0 = (class77) field987.method3492(); var0 != null; var0 = (class77) field987.method3481()) {
            if (var0.field1137 > 0) {
                var0.field1137--;
            }
            if (var0.field1137 != 0) {
                if (var0.field1147 > 0) {
                    var0.field1147--;
                }
                if (var0.field1147 == 0 && var0.field1139 >= 1 && var0.field1140 >= 1 && var0.field1139 <= 102 && var0.field1140 <= 102 && (var0.field1149 < 0 || class62.method4106(var0.field1149, var0.field1146))) {
                    method487(var0.field1144, var0.field1138, var0.field1139, var0.field1140, var0.field1149, var0.field1145, var0.field1146);
                    var0.field1147 = -1;
                    if (var0.field1149 == var0.field1141 && var0.field1141 == -1) {
                        var0.method3474();
                    } else if (var0.field1149 == var0.field1141 && var0.field1145 == var0.field1142 && var0.field1146 == var0.field1143) {
                        var0.method3474();
                    }
                }
            } else if (var0.field1141 < 0 || class62.method4106(var0.field1141, var0.field1143)) {
                method487(var0.field1144, var0.field1138, var0.field1139, var0.field1140, var0.field1141, var0.field1142, var0.field1143);
                var0.method3474();
            }
        }
    }

    @ObfuscatedName("aa.hl(IIIIIIII)V")
    public static final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field879 && Statics.field226 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field566.method2536(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field566.method2547(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field566.method2548(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field566.method2549(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field566.method2550(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field566.method2537(arg0, arg2, arg3);
                class267 var15 = class267.method1587(var12);
                if (var15.field3551 != 0) {
                    field928[arg0].method2892(arg2, arg3, var13, var14, var15.field3541);
                }
            }
            if (arg1 == 1) {
                Statics.field566.method2538(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field566.method2539(arg0, arg2, arg3);
                class267 var16 = class267.method1587(var12);
                if (var16.field3537 + arg2 > 103 || var16.field3537 + arg3 > 103 || var16.field3538 + arg2 > 103 || var16.field3538 + arg3 > 103) {
                    return;
                }
                if (var16.field3551 != 0) {
                    field928[arg0].method2893(arg2, arg3, var16.field3537, var16.field3538, var14, var16.field3541);
                }
            }
            if (arg1 == 3) {
                Statics.field566.method2643(arg0, arg2, arg3);
                class267 var17 = class267.method1587(var12);
                if (var17.field3551 == 1) {
                    field928[arg0].method2917(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field729[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method2713(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field566, field928[arg0]);
    }

    @ObfuscatedName("bs.hp(III)V")
    public static final void method1024(int arg0, int arg1) {
        class205 var2 = field986[Statics.field226][arg0][arg1];
        if (var2 == null) {
            Statics.field566.method2574(Statics.field226, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class94 var5 = null;
        for (class94 var6 = (class94) var2.method3492(); var6 != null; var6 = (class94) var2.method3481()) {
            class268 var7 = class268.method1985(var6.field1398);
            long var8 = (long) var7.field3595;
            if (var7.field3578 == 1) {
                var8 = (long) (var6.field1399 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field566.method2574(Statics.field226, arg0, arg1);
            return;
        }
        var2.method3483(var5);
        class94 var10 = null;
        class94 var11 = null;
        for (class94 var12 = (class94) var2.method3492(); var12 != null; var12 = (class94) var2.method3481()) {
            if (var5.field1398 != var12.field1398) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1398 != var12.field1398 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field566.method2527(Statics.field226, arg0, arg1, method919(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field226), var5, var13, var10, var11);
    }

    @ObfuscatedName("at.hv(ZLgr;I)V")
    public static final void method224(boolean arg0, class191 arg1) {
        field979 = 0;
        field914 = 0;
        class191 var2 = field916.field1464;
        var2.method3285();
        int var3 = var2.method3286(8);
        if (var3 < field1049) {
            for (int var4 = var3; var4 < field1049; var4++) {
                field980[++field979 - 1] = field913[var4];
            }
        }
        if (var3 > field1049) {
            throw new RuntimeException("");
        }
        field1049 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field913[var5];
            class86 var7 = field1110[var6];
            int var8 = var2.method3286(1);
            if (var8 == 0) {
                field913[++field1049 - 1] = var6;
                var7.field1156 = field883;
            } else {
                int var9 = var2.method3286(2);
                if (var9 == 0) {
                    field913[++field1049 - 1] = var6;
                    var7.field1156 = field883;
                    field915[++field914 - 1] = var6;
                } else if (var9 == 1) {
                    field913[++field1049 - 1] = var6;
                    var7.field1156 = field883;
                    int var10 = var2.method3286(3);
                    var7.method1580(var10, (byte) 1);
                    int var11 = var2.method3286(1);
                    if (var11 == 1) {
                        field915[++field914 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field913[++field1049 - 1] = var6;
                    var7.field1156 = field883;
                    int var12 = var2.method3286(3);
                    var7.method1580(var12, (byte) 2);
                    int var13 = var2.method3286(3);
                    var7.method1580(var13, (byte) 2);
                    int var14 = var2.method3286(1);
                    if (var14 == 1) {
                        field915[++field914 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field980[++field979 - 1] = var6;
                }
            }
        }
        method1514(arg0, arg1);
        Statics.method201(arg1);
        for (int var15 = 0; var15 < field979; var15++) {
            int var16 = field980[var15];
            if (field883 != field1110[var16].field1156) {
                field1110[var16].field1298 = null;
                field1110[var16] = null;
            }
        }
        if (field916.field1467 != arg1.field2529) {
            throw new RuntimeException(arg1.field2529 + class88.field1312 + field916.field1467);
        }
        for (int var17 = 0; var17 < field1049; var17++) {
            if (field1110[field913[var17]] == null) {
                throw new RuntimeException(var17 + class88.field1312 + field1049);
            }
        }
    }

    @ObfuscatedName("cl.hq(ZLgr;I)V")
    public static final void method1514(boolean arg0, class191 arg1) {
        while (true) {
            if (arg1.method3292(field916.field1467) >= 27) {
                int var2 = arg1.method3286(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field1110[var2] == null) {
                        field1110[var2] = new class86();
                        var3 = true;
                    }
                    class86 var4 = field1110[var2];
                    field913[++field1049 - 1] = var2;
                    var4.field1156 = field883;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method3286(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method3286(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6;
                    if (arg0) {
                        var6 = arg1.method3286(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = arg1.method3286(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = arg1.method3286(1);
                    var4.field1298 = class270.method564(arg1.method3286(14));
                    int var8 = arg1.method3286(1);
                    if (var8 == 1) {
                        field915[++field914 - 1] = var2;
                    }
                    int var9 = field944[arg1.method3286(3)];
                    if (var3) {
                        var4.field1166 = var4.field1173 = var9;
                    }
                    var4.field1154 = var4.field1298.field3668;
                    var4.field1203 = var4.field1298.field3663;
                    if (var4.field1203 == 0) {
                        var4.field1173 = 0;
                    }
                    var4.field1169 = var4.field1298.field3660;
                    var4.field1159 = var4.field1298.field3647;
                    var4.field1176 = var4.field1298.field3646;
                    var4.field1161 = var4.field1298.field3658;
                    var4.field1150 = var4.field1298.field3643;
                    var4.field1157 = var4.field1298.field3644;
                    var4.field1174 = var4.field1298.field3645;
                    var4.method1578(Statics.field289.field1199[0] + var6, Statics.field289.field1164[0] + var5, var7 == 1);
                    continue;
                }
            }
            arg1.method3287();
            return;
        }
    }

    @ObfuscatedName("cy.ho(Lbf;IIBI)V")
    public static final void method1661(class74 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1199[0];
        int var5 = arg0.field1164[0];
        int var6 = arg0.method1052();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1052();
        field1132.field2244 = arg1;
        field1132.field2243 = arg2;
        field1132.field2245 = 1;
        field1132.field2246 = 1;
        class73 var8 = field1132;
        class73 var9 = var8;
        class167 var10 = field928[arg0.field857];
        int[] var11 = field1133;
        int[] var12 = field1134;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class168.field2237[var13][var14] = 0;
                class168.field2239[var13][var14] = 99999999;
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
            class168.field2237[var17][var18] = 99;
            class168.field2239[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class168.field2242[var21] = var4;
            int var56 = var21 + 1;
            class168.field2241[var21] = var5;
            int[][] var23 = var10.field2230;
            boolean var28;
            while (true) {
                if (var56 == var22) {
                    Statics.field17 = var15;
                    Statics.field20 = var16;
                    var28 = false;
                    break;
                }
                var15 = class168.field2242[var22];
                var16 = class168.field2241[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var10.field2231;
                int var27 = var16 - var10.field2232;
                if (var9.method1027(1, var15, var16, var10)) {
                    Statics.field17 = var15;
                    Statics.field20 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class168.field2239[var24][var25] + 1;
                if (var24 > 0 && class168.field2237[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                    class168.field2242[var56] = var15 - 1;
                    class168.field2241[var56] = var16;
                    var56 = var56 + 1 & 0xFFF;
                    class168.field2237[var24 - 1][var25] = 2;
                    class168.field2239[var24 - 1][var25] = var29;
                }
                if (var24 < 127 && class168.field2237[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                    class168.field2242[var56] = var15 + 1;
                    class168.field2241[var56] = var16;
                    var56 = var56 + 1 & 0xFFF;
                    class168.field2237[var24 + 1][var25] = 8;
                    class168.field2239[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class168.field2237[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class168.field2242[var56] = var15;
                    class168.field2241[var56] = var16 - 1;
                    var56 = var56 + 1 & 0xFFF;
                    class168.field2237[var24][var25 - 1] = 1;
                    class168.field2239[var24][var25 - 1] = var29;
                }
                if (var25 < 127 && class168.field2237[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class168.field2242[var56] = var15;
                    class168.field2241[var56] = var16 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    class168.field2237[var24][var25 + 1] = 4;
                    class168.field2239[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class168.field2237[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class168.field2242[var56] = var15 - 1;
                    class168.field2241[var56] = var16 - 1;
                    var56 = var56 + 1 & 0xFFF;
                    class168.field2237[var24 - 1][var25 - 1] = 3;
                    class168.field2239[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 127 && var25 > 0 && class168.field2237[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class168.field2242[var56] = var15 + 1;
                    class168.field2241[var56] = var16 - 1;
                    var56 = var56 + 1 & 0xFFF;
                    class168.field2237[var24 + 1][var25 - 1] = 9;
                    class168.field2239[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 127 && class168.field2237[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class168.field2242[var56] = var15 - 1;
                    class168.field2241[var56] = var16 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    class168.field2237[var24 - 1][var25 + 1] = 6;
                    class168.field2239[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 127 && var25 < 127 && class168.field2237[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class168.field2242[var56] = var15 + 1;
                    class168.field2241[var56] = var16 + 1;
                    var56 = var56 + 1 & 0xFFF;
                    class168.field2237[var24 + 1][var25 + 1] = 12;
                    class168.field2239[var24 + 1][var25 + 1] = var29;
                }
            }
            var30 = var28;
        } else if (var7 == 2) {
            var30 = class168.method2737(var4, var5, var8, var10);
        } else {
            var30 = class168.method23(var4, var5, var7, var8, var10);
        }
        int var49;
        label285: {
            int var31 = var4 - 64;
            int var32 = var5 - 64;
            int var33 = Statics.field17;
            int var34 = Statics.field20;
            if (!var30) {
                int var35 = Integer.MAX_VALUE;
                int var36 = Integer.MAX_VALUE;
                byte var37 = 10;
                int var38 = var9.field2244;
                int var39 = var9.field2243;
                int var40 = var9.field2245;
                int var41 = var9.field2246;
                for (int var42 = var38 - var37; var42 <= var37 + var38; var42++) {
                    for (int var43 = var39 - var37; var43 <= var37 + var39; var43++) {
                        int var44 = var42 - var31;
                        int var45 = var43 - var32;
                        if (var44 >= 0 && var45 >= 0 && var44 < 128 && var45 < 128 && class168.field2239[var44][var45] < 100) {
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
                            if (var48 < var35 || var35 == var48 && class168.field2239[var44][var45] < var36) {
                                var35 = var48;
                                var36 = class168.field2239[var44][var45];
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
                class168.field2242[var50] = var33;
                int var57 = var50 + 1;
                class168.field2241[var50] = var34;
                int var51;
                int var52 = var51 = class168.field2237[var33 - var31][var34 - var32];
                while (var4 != var33 || var5 != var34) {
                    if (var51 != var52) {
                        var51 = var52;
                        class168.field2242[var57] = var33;
                        class168.field2241[var57++] = var34;
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
                    var52 = class168.field2237[var33 - var31][var34 - var32];
                }
                int var53 = 0;
                while (var57-- > 0) {
                    var11[var53] = class168.field2242[var57];
                    var12[var53++] = class168.field2241[var57];
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
                arg0.method1043(field1133[var55], field1134[var55], arg3);
            }
        }
    }

    @ObfuscatedName("jh.hg(B)V")
    public static void method4460() {
        field1081 = 0;
        field994 = false;
    }

    @ObfuscatedName("ad.ha(III)V")
    public static final void method236(int arg0, int arg1) {
        if (field1081 < 2 && field1041 == 0 && !field1128) {
            return;
        }
        int var2 = method3898();
        String var3;
        if (field1041 == 1 && field1081 < 2) {
            var3 = class237.field3056 + class237.field2989 + field1010 + " " + class88.field1316;
        } else if (field1128 && field1081 < 2) {
            var3 = field1014 + class237.field2989 + field1015 + " " + class88.field1316;
        } else {
            var3 = method156(var2);
        }
        if (field1081 > 2) {
            var3 = var3 + class88.method683(16777215) + " " + '/' + " " + (field1081 - 2) + class237.field3116;
        }
        Statics.field484.method4554(var3, arg0 + 4, arg1 + 15, 16777215, 0, field883 / 1000);
    }

    @ObfuscatedName("c.hd(IIIII)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1059; var4++) {
            if (field1066[var4] + field1064[var4] > arg0 && field1064[var4] < arg0 + arg2 && field1067[var4] + field1065[var4] > arg1 && field1065[var4] < arg1 + arg3) {
                field1042[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hh(B)V")
    public final void method1333() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field1081 - 1; var2++) {
                if (field1125[var2] < 1000 && field1125[var2 + 1] > 1000) {
                    String var3 = field1001[var2];
                    field1001[var2] = field1001[var2 + 1];
                    field1001[var2 + 1] = var3;
                    String var4 = field1000[var2];
                    field1000[var2] = field1000[var2 + 1];
                    field1000[var2 + 1] = var4;
                    int var5 = field1125[var2];
                    field1125[var2] = field1125[var2 + 1];
                    field1125[var2 + 1] = var5;
                    int var6 = field962[var2];
                    field962[var2] = field962[var2 + 1];
                    field962[var2 + 1] = var6;
                    int var7 = field958[var2];
                    field958[var2] = field958[var2 + 1];
                    field958[var2 + 1] = var7;
                    int var8 = field999[var2];
                    field999[var2] = field999[var2 + 1];
                    field999[var2 + 1] = var8;
                    boolean var9 = field933[var2];
                    field933[var2] = field933[var2 + 1];
                    field933[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field2041 != null || field1029 != null) {
            return;
        }
        int var10 = class60.field711;
        if (field994) {
            if (var10 != 1 && (Statics.field565 || var10 != 4)) {
                int var11 = class60.field705;
                int var12 = class60.field706;
                if (var11 < Statics.field781 - 10 || var11 > Statics.field781 + Statics.field237 + 10 || var12 < Statics.field2205 - 10 || var12 > Statics.field455 + Statics.field2205 + 10) {
                    field994 = false;
                    method161(Statics.field781, Statics.field2205, Statics.field237, Statics.field455);
                }
            }
            if (var10 == 1 || !Statics.field565 && var10 == 4) {
                int var13 = Statics.field781;
                int var14 = Statics.field2205;
                int var15 = Statics.field237;
                int var16 = class60.field710;
                int var17 = class60.field714;
                int var18 = -1;
                for (int var19 = 0; var19 < field1081; var19++) {
                    int var20 = (field1081 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1) {
                    method54(var18);
                }
                field994 = false;
                method161(Statics.field781, Statics.field2205, Statics.field237, Statics.field455);
            }
            return;
        }
        int var21 = method3898();
        if ((var10 == 1 || !Statics.field565 && var10 == 4) && var21 >= 0) {
            int var22 = field1125[var21];
            if (var22 == 39 || var22 == 40 || var22 == 41 || var22 == 42 || var22 == 43 || var22 == 33 || var22 == 34 || var22 == 35 || var22 == 36 || var22 == 37 || var22 == 38 || var22 == 1005) {
                label209: {
                    int var23 = field962[var21];
                    int var24 = field958[var21];
                    class228 var25 = class228.method2725(var24);
                    if (!class229.method227(method1563(var25))) {
                        int var26 = method1563(var25);
                        boolean var27 = (var26 >> 29 & 0x1) != 0;
                        if (!var27) {
                            break label209;
                        }
                    }
                    if (Statics.field2041 != null && !field973 && field1081 > 0 && !this.method1386()) {
                        int var28 = field970;
                        int var29 = field971;
                        method576(Statics.field1456, var28, var29);
                        Statics.field1456 = null;
                    }
                    field973 = false;
                    field974 = 0;
                    if (Statics.field2041 != null) {
                        method211(Statics.field2041);
                    }
                    Statics.field2041 = class228.method2725(var24);
                    field969 = var23;
                    field970 = class60.field710;
                    field971 = class60.field714;
                    if (var21 >= 0) {
                        Statics.field1456 = new class89();
                        Statics.field1456.field1321 = field962[var21];
                        Statics.field1456.field1324 = field958[var21];
                        Statics.field1456.field1323 = field1125[var21];
                        Statics.field1456.field1322 = field999[var21];
                        Statics.field1456.field1325 = field1000[var21];
                    }
                    method211(Statics.field2041);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field565 && var10 == 4) && this.method1386()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field565 && var10 == 4) && field1081 > 0) {
            method54(var21);
        }
        if (var10 == 2 && field1081 > 0) {
            this.method1090(class60.field710, class60.field714);
        }
    }

    @ObfuscatedName("client.is(I)Z")
    public final boolean method1386() {
        int var1 = method3898();
        if (field1081 > 2) {
            if (field993 == 1 && !field933[var1]) {
                return true;
            }
            boolean var2;
            if (var1 < 0) {
                var2 = false;
            } else {
                int var3 = field1125[var1];
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

    @ObfuscatedName("client.ib(IIB)V")
    public final void method1090(int arg0, int arg1) {
        int var3 = Statics.field484.method4541(class237.field3115);
        for (int var4 = 0; var4 < field1081; var4++) {
            int var5 = Statics.field484.method4541(method156(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field1081 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field1320) {
            var7 = Statics.field1320 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field358) {
            var8 = Statics.field358 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field566.method2546(Statics.field226, arg0, arg1, false);
        field994 = true;
        Statics.field781 = var7;
        Statics.field2205 = var8;
        Statics.field237 = var3;
        Statics.field455 = field1081 * 15 + 22;
    }

    @ObfuscatedName("p.ig(II)V")
    public static final void method54(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field962[arg0];
        int var2 = field958[arg0];
        int var3 = field1125[arg0];
        int var4 = field999[arg0];
        String var5 = field1000[arg0];
        String var6 = field1001[arg0];
        method2440(var1, var2, var3, var4, var5, var6, class60.field710, class60.field714);
    }

    @ObfuscatedName("ak.ih(Lcf;III)V")
    public static final void method576(class89 arg0, int arg1, int arg2) {
        method2440(arg0.field1321, arg0.field1324, arg0.field1323, arg0.field1322, arg0.field1325, arg0.field1325, arg1, arg2);
    }

    @ObfuscatedName("ea.ia(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2440(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 4) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var8 = class175.method3892(class172.field2395, field916.field1463);
            var8.field2451.method3006(arg3 >> 14 & 0x7FFF);
            var8.field2451.method3056(Statics.field2458 + arg0);
            var8.field2451.method3125(Statics.field1288 + arg1);
            var8.field2451.method3046(class51.field609[82] ? 1 : 0);
            field916.method1747(var8);
        }
        if (arg2 == 31) {
            class175 var9 = class175.method3892(class172.field2414, field916.field1463);
            var9.field2451.method3125(Statics.field337);
            var9.field2451.method3066(Statics.field449);
            var9.field2451.method3006(Statics.field336);
            var9.field2451.method3056(arg3);
            var9.field2451.method3056(arg0);
            var9.field2451.method3066(arg1);
            field916.method1747(var9);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 5) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var10 = class175.method3892(class172.field2371, field916.field1463);
            var10.field2451.method3055(arg3 >> 14 & 0x7FFF);
            var10.field2451.method3046(class51.field609[82] ? 1 : 0);
            var10.field2451.method3055(Statics.field1288 + arg1);
            var10.field2451.method3125(Statics.field2458 + arg0);
            field916.method1747(var10);
        }
        if (arg2 == 1003) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            class86 var11 = field1110[arg3];
            if (var11 != null) {
                class270 var12 = var11.field1298;
                if (var12.field3664 != null) {
                    var12 = var12.method4447();
                }
                if (var12 != null) {
                    class175 var13 = class175.method3892(class172.field2369, field916.field1463);
                    var13.field2451.method3125(var12.field3638);
                    field916.method1747(var13);
                }
            }
        }
        if (arg2 == 42) {
            class175 var14 = class175.method3892(class172.field2373, field916.field1463);
            var14.field2451.method3055(arg0);
            var14.field2451.method3056(arg3);
            var14.field2451.method3067(arg1);
            field916.method1747(var14);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 16) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var15 = class175.method3892(class172.field2339, field916.field1463);
            var15.field2451.method3066(Statics.field449);
            var15.field2451.method3006(Statics.field1288 + arg1);
            var15.field2451.method3055(arg3);
            var15.field2451.method3056(Statics.field336);
            var15.field2451.method3056(Statics.field2458 + arg0);
            var15.field2451.method3157(class51.field609[82] ? 1 : 0);
            var15.field2451.method3055(Statics.field337);
            field916.method1747(var15);
        }
        if (arg2 == 28) {
            class175 var16 = class175.method3892(class172.field2404, field916.field1463);
            var16.field2451.method3005(arg1);
            field916.method1747(var16);
            class228 var17 = class228.method2725(arg1);
            if (var17.field2829 != null && var17.field2829[0][0] == 5) {
                int var18 = var17.field2829[0][1];
                class223.field2726[var18] = 1 - class223.field2726[var18];
                method32(var18);
            }
        }
        if (arg2 == 46) {
            class74 var19 = field900[arg3];
            if (var19 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var20 = class175.method3892(class172.field2378, field916.field1463);
                var20.field2451.method3157(class51.field609[82] ? 1 : 0);
                var20.field2451.method3006(arg3);
                field916.method1747(var20);
            }
        }
        if (arg2 == 10) {
            class86 var21 = field1110[arg3];
            if (var21 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var22 = class175.method3892(class172.field2392, field916.field1463);
                var22.field2451.method3006(arg3);
                var22.field2451.method3046(class51.field609[82] ? 1 : 0);
                field916.method1747(var22);
            }
        }
        if (arg2 == 36) {
            class175 var23 = class175.method3892(class172.field2389, field916.field1463);
            var23.field2451.method3006(arg0);
            var23.field2451.method3055(arg3);
            var23.field2451.method3066(arg1);
            field916.method1747(var23);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 12) {
            class86 var24 = field1110[arg3];
            if (var24 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var25 = class175.method3892(class172.field2390, field916.field1463);
                var25.field2451.method3055(arg3);
                var25.field2451.method3046(class51.field609[82] ? 1 : 0);
                field916.method1747(var25);
            }
        }
        if (arg2 == 3) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var26 = class175.method3892(class172.field2353, field916.field1463);
            var26.field2451.method3046(class51.field609[82] ? 1 : 0);
            var26.field2451.method3125(arg3 >> 14 & 0x7FFF);
            var26.field2451.method3055(Statics.field2458 + arg0);
            var26.field2451.method3055(Statics.field1288 + arg1);
            field916.method1747(var26);
        }
        if (arg2 == 51) {
            class74 var27 = field900[arg3];
            if (var27 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var28 = class175.method3892(class172.field2383, field916.field1463);
                var28.field2451.method3048(class51.field609[82] ? 1 : 0);
                var28.field2451.method3055(arg3);
                field916.method1747(var28);
            }
        }
        if (arg2 == 21) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var29 = class175.method3892(class172.field2368, field916.field1463);
            var29.field2451.method3006(arg3);
            var29.field2451.method3006(Statics.field2458 + arg0);
            var29.field2451.method3157(class51.field609[82] ? 1 : 0);
            var29.field2451.method3056(Statics.field1288 + arg1);
            field916.method1747(var29);
        }
        if (arg2 == 1004) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            class175 var30 = class175.method3892(class172.field2338, field916.field1463);
            var30.field2451.method3056(arg3);
            field916.method1747(var30);
        }
        if (arg2 == 11) {
            class86 var31 = field1110[arg3];
            if (var31 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var32 = class175.method3892(class172.field2343, field916.field1463);
                var32.field2451.method3157(class51.field609[82] ? 1 : 0);
                var32.field2451.method3055(arg3);
                field916.method1747(var32);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class228 var33 = class228.method19(arg1, arg0);
            if (var33 != null) {
                method1595(arg3, arg1, arg0, var33.field2883, arg5);
            }
        }
        if (arg2 == 9) {
            class86 var34 = field1110[arg3];
            if (var34 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var35 = class175.method3892(class172.field2424, field916.field1463);
                var35.field2451.method3046(class51.field609[82] ? 1 : 0);
                var35.field2451.method3006(arg3);
                field916.method1747(var35);
            }
        }
        if (arg2 == 2) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var36 = class175.method3892(class172.field2397, field916.field1463);
            var36.field2451.method3066(Statics.field624);
            var36.field2451.method3006(field918);
            var36.field2451.method3125(Statics.field2458 + arg0);
            var36.field2451.method3006(Statics.field1288 + arg1);
            var36.field2451.method3056(arg3 >> 14 & 0x7FFF);
            var36.field2451.method3157(class51.field609[82] ? 1 : 0);
            field916.method1747(var36);
        }
        if (arg2 == 37) {
            class175 var37 = class175.method3892(class172.field2345, field916.field1463);
            var37.field2451.method3055(arg0);
            var37.field2451.method3006(arg3);
            var37.field2451.method3005(arg1);
            field916.method1747(var37);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 22) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var38 = class175.method3892(class172.field2415, field916.field1463);
            var38.field2451.method3125(Statics.field2458 + arg0);
            var38.field2451.method3047(class51.field609[82] ? 1 : 0);
            var38.field2451.method3056(Statics.field1288 + arg1);
            var38.field2451.method3125(arg3);
            field916.method1747(var38);
        }
        if (arg2 == 48) {
            class74 var39 = field900[arg3];
            if (var39 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var40 = class175.method3892(class172.field2411, field916.field1463);
                var40.field2451.method3056(arg3);
                var40.field2451.method3047(class51.field609[82] ? 1 : 0);
                field916.method1747(var40);
            }
        }
        if (arg2 == 8) {
            class86 var41 = field1110[arg3];
            if (var41 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var42 = class175.method3892(class172.field2381, field916.field1463);
                var42.field2451.method3125(arg3);
                var42.field2451.method3055(field918);
                var42.field2451.method3067(Statics.field624);
                var42.field2451.method3047(class51.field609[82] ? 1 : 0);
                field916.method1747(var42);
            }
        }
        if (arg2 == 47) {
            class74 var43 = field900[arg3];
            if (var43 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var44 = class175.method3892(class172.field2350, field916.field1463);
                var44.field2451.method3125(arg3);
                var44.field2451.method3048(class51.field609[82] ? 1 : 0);
                field916.method1747(var44);
            }
        }
        if (arg2 == 17) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var45 = class175.method3892(class172.field2337, field916.field1463);
            var45.field2451.method3067(Statics.field624);
            var45.field2451.method3006(Statics.field1288 + arg1);
            var45.field2451.method3047(class51.field609[82] ? 1 : 0);
            var45.field2451.method3056(field918);
            var45.field2451.method3125(Statics.field2458 + arg0);
            var45.field2451.method3125(arg3);
            field916.method1747(var45);
        }
        if (arg2 == 14) {
            class74 var46 = field900[arg3];
            if (var46 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var47 = class175.method3892(class172.field2400, field916.field1463);
                var47.field2451.method3056(Statics.field336);
                var47.field2451.method3006(Statics.field337);
                var47.field2451.method3056(arg3);
                var47.field2451.method3157(class51.field609[82] ? 1 : 0);
                var47.field2451.method3005(Statics.field449);
                field916.method1747(var47);
            }
        }
        if (arg2 == 1005) {
            class228 var48 = class228.method2725(arg1);
            if (var48 == null || var48.field2882[arg0] < 100000) {
                class175 var49 = class175.method3892(class172.field2338, field916.field1463);
                var49.field2451.method3056(arg3);
                field916.method1747(var49);
            } else {
                class97.method1495(27, "", var48.field2882[arg0] + " x " + class268.method1985(arg3).field3583);
            }
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 6) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var50 = class175.method3892(class172.field2391, field916.field1463);
            var50.field2451.method3055(Statics.field1288 + arg1);
            var50.field2451.method3125(Statics.field2458 + arg0);
            var50.field2451.method3055(arg3 >> 14 & 0x7FFF);
            var50.field2451.method3047(class51.field609[82] ? 1 : 0);
            field916.method1747(var50);
        }
        if (arg2 == 43) {
            class175 var51 = class175.method3892(class172.field2365, field916.field1463);
            var51.field2451.method3006(arg0);
            var51.field2451.method3055(arg3);
            var51.field2451.method3067(arg1);
            field916.method1747(var51);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 40) {
            class175 var52 = class175.method3892(class172.field2398, field916.field1463);
            var52.field2451.method3056(arg3);
            var52.field2451.method3055(arg0);
            var52.field2451.method3065(arg1);
            field916.method1747(var52);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 13) {
            class86 var53 = field1110[arg3];
            if (var53 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var54 = class175.method3892(class172.field2376, field916.field1463);
                var54.field2451.method3047(class51.field609[82] ? 1 : 0);
                var54.field2451.method3055(arg3);
                field916.method1747(var54);
            }
        }
        if (arg2 == 33) {
            class175 var55 = class175.method3892(class172.field2420, field916.field1463);
            var55.field2451.method3055(arg3);
            var55.field2451.method3065(arg1);
            var55.field2451.method3056(arg0);
            field916.method1747(var55);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 15) {
            class74 var56 = field900[arg3];
            if (var56 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var57 = class175.method3892(class172.field2384, field916.field1463);
                var57.field2451.method3046(class51.field609[82] ? 1 : 0);
                var57.field2451.method3056(field918);
                var57.field2451.method3067(Statics.field624);
                var57.field2451.method3055(arg3);
                field916.method1747(var57);
            }
        }
        if (arg2 == 49) {
            class74 var58 = field900[arg3];
            if (var58 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var59 = class175.method3892(class172.field2394, field916.field1463);
                var59.field2451.method3046(class51.field609[82] ? 1 : 0);
                var59.field2451.method3006(arg3);
                field916.method1747(var59);
            }
        }
        if (arg2 == 19) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var60 = class175.method3892(class172.field2403, field916.field1463);
            var60.field2451.method3056(Statics.field2458 + arg0);
            var60.field2451.method3125(Statics.field1288 + arg1);
            var60.field2451.method3006(arg3);
            var60.field2451.method3048(class51.field609[82] ? 1 : 0);
            field916.method1747(var60);
        }
        if (arg2 == 26) {
            class175 var61 = class175.method3892(class172.field2356, field916.field1463);
            field916.method1747(var61);
            for (class68 var62 = (class68) field1017.method3419(); var62 != null; var62 = (class68) field1017.method3415()) {
                if (var62.field790 == 0 || var62.field790 == 3) {
                    method132(var62, true);
                }
            }
            if (field1020 != null) {
                method211(field1020);
                field1020 = null;
            }
        }
        if (arg2 == 29) {
            class175 var63 = class175.method3892(class172.field2404, field916.field1463);
            var63.field2451.method3005(arg1);
            field916.method1747(var63);
            class228 var64 = class228.method2725(arg1);
            if (var64.field2829 != null && var64.field2829[0][0] == 5) {
                int var65 = var64.field2829[0][1];
                if (class223.field2726[var65] != var64.field2842[0]) {
                    class223.field2726[var65] = var64.field2842[0];
                    method32(var65);
                }
            }
        }
        if (arg2 == 24) {
            class228 var66 = class228.method2725(arg1);
            boolean var67 = true;
            if (var66.field2862 > 0) {
                var67 = method1604(var66);
            }
            if (var67) {
                class175 var68 = class175.method3892(class172.field2404, field916.field1463);
                var68.field2451.method3005(arg1);
                field916.method1747(var68);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1688.method5053(arg2, arg3, new class224(arg0), new class224(arg1));
        }
        if (arg2 == 32) {
            class175 var69 = class175.method3892(class172.field2367, field916.field1463);
            var69.field2451.method3066(arg1);
            var69.field2451.method3125(field918);
            var69.field2451.method3066(Statics.field624);
            var69.field2451.method3006(arg3);
            var69.field2451.method3056(arg0);
            field916.method1747(var69);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 34) {
            class175 var70 = class175.method3892(class172.field2426, field916.field1463);
            var70.field2451.method3056(arg3);
            var70.field2451.method3067(arg1);
            var70.field2451.method3056(arg0);
            field916.method1747(var70);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 1) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var71 = class175.method3892(class172.field2402, field916.field1463);
            var71.field2451.method3157(class51.field609[82] ? 1 : 0);
            var71.field2451.method3055(Statics.field336);
            var71.field2451.method3006(arg3 >> 14 & 0x7FFF);
            var71.field2451.method3055(Statics.field2458 + arg0);
            var71.field2451.method3056(Statics.field337);
            var71.field2451.method3066(Statics.field449);
            var71.field2451.method3006(Statics.field1288 + arg1);
            field916.method1747(var71);
        }
        if (arg2 == 41) {
            class175 var72 = class175.method3892(class172.field2352, field916.field1463);
            var72.field2451.method3055(arg3);
            var72.field2451.method3125(arg0);
            var72.field2451.method3066(arg1);
            field916.method1747(var72);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 38) {
            method1032();
            class228 var73 = class228.method2725(arg1);
            field1041 = 1;
            Statics.field337 = arg0;
            Statics.field449 = arg1;
            Statics.field336 = arg3;
            method211(var73);
            field1010 = class88.method683(16748608) + class268.method1985(arg3).field3583 + class88.method683(16777215);
            if (field1010 == null) {
                field1010 = "null";
            }
            return;
        }
        if (arg2 == 18) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var74 = class175.method3892(class172.field2336, field916.field1463);
            var74.field2451.method3055(Statics.field1288 + arg1);
            var74.field2451.method3006(Statics.field2458 + arg0);
            var74.field2451.method3046(class51.field609[82] ? 1 : 0);
            var74.field2451.method3056(arg3);
            field916.method1747(var74);
        }
        if (arg2 == 25) {
            class228 var75 = class228.method19(arg1, arg0);
            if (var75 != null) {
                method1032();
                int var76 = method1563(var75);
                int var77 = var76 >> 11 & 0x3F;
                int var79 = var75.field2883;
                class228 var80 = class228.method19(arg1, arg0);
                if (var80 != null && var80.field2837 != null) {
                    class69 var81 = new class69();
                    var81.field797 = var80;
                    var81.field805 = var80.field2837;
                    class83.method1505(var81);
                }
                field910 = var79;
                field1128 = true;
                Statics.field624 = arg1;
                field918 = arg0;
                Statics.field818 = var77;
                method211(var80);
                field1041 = 0;
                int var82 = method1563(var75);
                int var83 = var82 >> 11 & 0x3F;
                String var84;
                if (var83 == 0) {
                    var84 = null;
                } else if (var75.field2844 == null || var75.field2844.trim().length() == 0) {
                    var84 = null;
                } else {
                    var84 = var75.field2844;
                }
                field1014 = var84;
                if (field1014 == null) {
                    field1014 = "Null";
                }
                if (var75.field2812) {
                    field1015 = var75.field2854 + class88.method683(16777215);
                } else {
                    field1015 = class88.method683(65280) + var75.field2843 + class88.method683(16777215);
                }
            }
            return;
        }
        if (arg2 == 35) {
            class175 var85 = class175.method3892(class172.field2333, field916.field1463);
            var85.field2451.method3066(arg1);
            var85.field2451.method3056(arg0);
            var85.field2451.method3006(arg3);
            field916.method1747(var85);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (arg2 == 45) {
            class74 var86 = field900[arg3];
            if (var86 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var87 = class175.method3892(class172.field2351, field916.field1463);
                var87.field2451.method3157(class51.field609[82] ? 1 : 0);
                var87.field2451.method3006(arg3);
                field916.method1747(var87);
            }
        }
        if (arg2 == 23) {
            if (field994) {
                Statics.field566.method2558();
            } else {
                Statics.field566.method2546(Statics.field226, arg0, arg1, true);
            }
        }
        if (arg2 == 20) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var88 = class175.method3892(class172.field2422, field916.field1463);
            var88.field2451.method3157(class51.field609[82] ? 1 : 0);
            var88.field2451.method3056(arg3);
            var88.field2451.method3006(Statics.field1288 + arg1);
            var88.field2451.method3056(Statics.field2458 + arg0);
            field916.method1747(var88);
        }
        if (arg2 == 7) {
            class86 var89 = field1110[arg3];
            if (var89 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var90 = class175.method3892(class172.field2360, field916.field1463);
                var90.field2451.method3157(class51.field609[82] ? 1 : 0);
                var90.field2451.method3055(Statics.field336);
                var90.field2451.method3067(Statics.field449);
                var90.field2451.method3125(Statics.field337);
                var90.field2451.method3006(arg3);
                field916.method1747(var90);
            }
        }
        if (arg2 == 1002) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            class175 var91 = class175.method3892(class172.field2359, field916.field1463);
            var91.field2451.method3055(arg3 >> 14 & 0x7FFF);
            field916.method1747(var91);
        }
        if (arg2 == 1001) {
            field963 = arg6;
            field964 = arg7;
            field966 = 2;
            field965 = 0;
            field1013 = arg0;
            field946 = arg1;
            class175 var92 = class175.method3892(class172.field2357, field916.field1463);
            var92.field2451.method3125(Statics.field2458 + arg0);
            var92.field2451.method3125(arg3 >> 14 & 0x7FFF);
            var92.field2451.method3047(class51.field609[82] ? 1 : 0);
            var92.field2451.method3055(Statics.field1288 + arg1);
            field916.method1747(var92);
        }
        if (arg2 == 58) {
            class228 var93 = class228.method19(arg1, arg0);
            if (var93 != null) {
                class175 var94 = class175.method3892(class172.field2344, field916.field1463);
                var94.field2451.method3066(arg1);
                var94.field2451.method3006(var93.field2883);
                var94.field2451.method3066(Statics.field624);
                var94.field2451.method3056(arg0);
                var94.field2451.method3056(field918);
                var94.field2451.method3055(field910);
                field916.method1747(var94);
            }
        }
        if (arg2 == 30 && field1020 == null) {
            class175 var95 = class175.method3892(class172.field2355, field916.field1463);
            var95.field2451.method3125(arg0);
            var95.field2451.method3066(arg1);
            field916.method1747(var95);
            field1020 = class228.method19(arg1, arg0);
            method211(field1020);
        }
        if (arg2 == 44) {
            class74 var96 = field900[arg3];
            if (var96 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var97 = class175.method3892(class172.field2358, field916.field1463);
                var97.field2451.method3047(class51.field609[82] ? 1 : 0);
                var97.field2451.method3006(arg3);
                field916.method1747(var97);
            }
        }
        if (arg2 == 50) {
            class74 var98 = field900[arg3];
            if (var98 != null) {
                field963 = arg6;
                field964 = arg7;
                field966 = 2;
                field965 = 0;
                field1013 = arg0;
                field946 = arg1;
                class175 var99 = class175.method3892(class172.field2377, field916.field1463);
                var99.field2451.method3046(class51.field609[82] ? 1 : 0);
                var99.field2451.method3125(arg3);
                field916.method1747(var99);
            }
        }
        if (arg2 == 39) {
            class175 var100 = class175.method3892(class172.field2382, field916.field1463);
            var100.field2451.method3006(arg3);
            var100.field2451.method3005(arg1);
            var100.field2451.method3006(arg0);
            field916.method1747(var100);
            field967 = 0;
            Statics.field439 = class228.method2725(arg1);
            field968 = arg0;
        }
        if (field1041 != 0) {
            field1041 = 0;
            method211(class228.method2725(Statics.field449));
        }
        if (field1128) {
            method1032();
        }
        if (Statics.field439 != null && field967 == 0) {
            method211(Statics.field439);
        }
    }

    @ObfuscatedName("client.io(ILjava/lang/String;I)V")
    public static void method1426(int arg0, String arg1) {
        int var2 = class95.field1406;
        int[] var3 = class95.field1410;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class74 var6 = field900[var3[var5]];
            if (var6 != null && Statics.field289 != var6 && var6.field860 != null && var6.field860.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    class175 var7 = class175.method3892(class172.field2358, field916.field1463);
                    var7.field2451.method3047(0);
                    var7.field2451.method3006(var3[var5]);
                    field916.method1747(var7);
                } else if (arg0 == 4) {
                    class175 var8 = class175.method3892(class172.field2350, field916.field1463);
                    var8.field2451.method3125(var3[var5]);
                    var8.field2451.method3048(0);
                    field916.method1747(var8);
                } else if (arg0 == 6) {
                    class175 var9 = class175.method3892(class172.field2394, field916.field1463);
                    var9.field2451.method3046(0);
                    var9.field2451.method3006(var3[var5]);
                    field916.method1747(var9);
                } else if (arg0 == 7) {
                    class175 var10 = class175.method3892(class172.field2377, field916.field1463);
                    var10.field2451.method3046(0);
                    var10.field2451.method3125(var3[var5]);
                    field916.method1747(var10);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class97.method1495(4, "", class237.field3111 + arg1);
        }
    }

    @ObfuscatedName("bh.ik(B)V")
    public static void method1032() {
        if (!field1128) {
            return;
        }
        class228 var0 = class228.method19(Statics.field624, field918);
        if (var0 != null && var0.field2857 != null) {
            class69 var1 = new class69();
            var1.field797 = var0;
            var1.field805 = var0.field2857;
            class83.method1505(var1);
        }
        field1128 = false;
        method211(var0);
    }

    @ObfuscatedName("cx.in(IIIILjava/lang/String;I)V")
    public static void method1595(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class228 var5 = class228.method19(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2863 != null) {
            class69 var6 = new class69();
            var6.field797 = var5;
            var6.field799 = arg0;
            var6.field800 = arg4;
            var6.field805 = var5.field2863;
            class83.method1505(var6);
        }
        boolean var7 = true;
        if (var5.field2862 > 0) {
            var7 = method1604(var5);
        }
        if (!var7 || !Statics.method2929(method1563(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class175 var8 = class175.method3892(class172.field2409, field916.field1463);
            var8.field2451.method3005(arg1);
            var8.field2451.method3006(arg2);
            var8.field2451.method3006(arg3);
            field916.method1747(var8);
        }
        if (arg0 == 2) {
            class175 var9 = class175.method3892(class172.field2354, field916.field1463);
            var9.field2451.method3005(arg1);
            var9.field2451.method3006(arg2);
            var9.field2451.method3006(arg3);
            field916.method1747(var9);
        }
        if (arg0 == 3) {
            class175 var10 = class175.method3892(class172.field2370, field916.field1463);
            var10.field2451.method3005(arg1);
            var10.field2451.method3006(arg2);
            var10.field2451.method3006(arg3);
            field916.method1747(var10);
        }
        if (arg0 == 4) {
            class175 var11 = class175.method3892(class172.field2421, field916.field1463);
            var11.field2451.method3005(arg1);
            var11.field2451.method3006(arg2);
            var11.field2451.method3006(arg3);
            field916.method1747(var11);
        }
        if (arg0 == 5) {
            class175 var12 = class175.method3892(class172.field2407, field916.field1463);
            var12.field2451.method3005(arg1);
            var12.field2451.method3006(arg2);
            var12.field2451.method3006(arg3);
            field916.method1747(var12);
        }
        if (arg0 == 6) {
            class175 var13 = class175.method3892(class172.field2363, field916.field1463);
            var13.field2451.method3005(arg1);
            var13.field2451.method3006(arg2);
            var13.field2451.method3006(arg3);
            field916.method1747(var13);
        }
        if (arg0 == 7) {
            class175 var14 = class175.method3892(class172.field2347, field916.field1463);
            var14.field2451.method3005(arg1);
            var14.field2451.method3006(arg2);
            var14.field2451.method3006(arg3);
            field916.method1747(var14);
        }
        if (arg0 == 8) {
            class175 var15 = class175.method3892(class172.field2346, field916.field1463);
            var15.field2451.method3005(arg1);
            var15.field2451.method3006(arg2);
            var15.field2451.method3006(arg3);
            field916.method1747(var15);
        }
        if (arg0 == 9) {
            class175 var16 = class175.method3892(class172.field2388, field916.field1463);
            var16.field2451.method3005(arg1);
            var16.field2451.method3006(arg2);
            var16.field2451.method3006(arg3);
            field916.method1747(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class175 var17 = class175.method3892(class172.field2412, field916.field1463);
        var17.field2451.method3005(arg1);
        var17.field2451.method3006(arg2);
        var17.field2451.method3006(arg3);
        field916.method1747(var17);
    }

    @ObfuscatedName("ew.ii(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2714(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2235(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("dx.id(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method2235(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field994 || field1081 >= 500) {
            return;
        }
        field1000[field1081] = arg0;
        field1001[field1081] = arg1;
        field1125[field1081] = arg2;
        field999[field1081] = arg3;
        field962[field1081] = arg4;
        field958[field1081] = arg5;
        field933[field1081] = arg6;
        field1081++;
    }

    @ObfuscatedName("ik.iq(B)I")
    public static final int method3898() {
        return field1081 - 1;
    }

    @ObfuscatedName("bq.it(I)V")
    public static void method682() {
        for (int var0 = 0; var0 < field1081; var0++) {
            int var1 = field1125[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field1081 - 1) {
                    for (int var3 = var0; var3 < field1081 - 1; var3++) {
                        field1000[var3] = field1000[var3 + 1];
                        field1001[var3] = field1001[var3 + 1];
                        field1125[var3] = field1125[var3 + 1];
                        field999[var3] = field999[var3 + 1];
                        field962[var3] = field962[var3 + 1];
                        field958[var3] = field958[var3 + 1];
                        field933[var3] = field933[var3 + 1];
                    }
                }
                field1081--;
            }
        }
    }

    @ObfuscatedName("g.il(II)Ljava/lang/String;")
    public static String method156(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field1001[arg0].length() > 0) {
            return field1000[arg0] + class237.field2989 + field1001[arg0];
        } else {
            return field1000[arg0];
        }
    }

    @ObfuscatedName("aa.ij(IIIII)V")
    public static final void method486(int arg0, int arg1, int arg2, int arg3) {
        if (field1041 == 0 && !field1128) {
            method2714(class237.field3117, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class134.field1899; var6++) {
            int var7 = class134.field1908[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field566.method2550(Statics.field226, var8, var9, var7) >= 0) {
                    class267 var12 = class267.method1587(var11);
                    if (var12.field3549 != null) {
                        var12 = var12.method4334();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1041 == 1) {
                        method2714(class237.field3056, field1010 + " " + class88.field1316 + " " + class88.method683(65535) + var12.field3540, 1, var7, var8, var9);
                    } else if (!field1128) {
                        String[] var13 = var12.field3548;
                        if (field1027) {
                            var13 = method465(var13);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 3;
                                    }
                                    if (var14 == 1) {
                                        var15 = 4;
                                    }
                                    if (var14 == 2) {
                                        var15 = 5;
                                    }
                                    if (var14 == 3) {
                                        var15 = 6;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1001;
                                    }
                                    method2714(var13[var14], class88.method683(65535) + var12.field3540, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2714(class237.field3113, class88.method683(65535) + var12.field3540, 1002, var12.field3529 << 14, var8, var9);
                    } else if ((Statics.field818 & 0x4) == 4) {
                        method2714(field1014, field1015 + " " + class88.field1316 + " " + class88.method683(65535) + var12.field3540, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class86 var16 = field1110[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1298.field3668 == 1 && (var16.field1155 & 0x7F) == 64 && (var16.field1151 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field1049; var17++) {
                            class86 var18 = field1110[field913[var17]];
                            if (var18 != null && var16 != var18 && var18.field1298.field3668 == 1 && var16.field1155 == var18.field1155 && var16.field1151 == var18.field1151) {
                                method1734(var18.field1298, field913[var17], var8, var9);
                            }
                        }
                        int var19 = class95.field1406;
                        int[] var20 = class95.field1410;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class74 var22 = field900[var20[var21]];
                            if (var22 != null && var16.field1155 == var22.field1155 && var16.field1151 == var22.field1151) {
                                method308(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method1734(var16.field1298, var11, var8, var9);
                }
                if (var10 == 0) {
                    class74 var23 = field900[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1155 & 0x7F) == 64 && (var23.field1151 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field1049; var24++) {
                            class86 var25 = field1110[field913[var24]];
                            if (var25 != null && var25.field1298.field3668 == 1 && var23.field1155 == var25.field1155 && var23.field1151 == var25.field1151) {
                                method1734(var25.field1298, field913[var24], var8, var9);
                            }
                        }
                        int var26 = class95.field1406;
                        int[] var27 = class95.field1410;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class74 var29 = field900[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1155 == var29.field1155 && var23.field1151 == var29.field1151) {
                                method308(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field975 == var11) {
                        var4 = var7;
                    } else {
                        method308(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class205 var30 = field986[Statics.field226][var8][var9];
                    if (var30 != null) {
                        for (class94 var31 = (class94) var30.method3490(); var31 != null; var31 = (class94) var30.method3506()) {
                            class268 var32 = class268.method1985(var31.field1398);
                            if (field1041 == 1) {
                                method2714(class237.field3056, field1010 + " " + class88.field1316 + " " + class88.method683(16748608) + var32.field3583, 16, var31.field1398, var8, var9);
                            } else if (!field1128) {
                                String[] var33 = var32.field3592;
                                if (field1027) {
                                    var33 = method465(var33);
                                }
                                for (int var34 = 4; var34 >= 0; var34--) {
                                    if (var33 != null && var33[var34] != null) {
                                        byte var35 = 0;
                                        if (var34 == 0) {
                                            var35 = 18;
                                        }
                                        if (var34 == 1) {
                                            var35 = 19;
                                        }
                                        if (var34 == 2) {
                                            var35 = 20;
                                        }
                                        if (var34 == 3) {
                                            var35 = 21;
                                        }
                                        if (var34 == 4) {
                                            var35 = 22;
                                        }
                                        method2714(var33[var34], class88.method683(16748608) + var32.field3583, var35, var31.field1398, var8, var9);
                                    } else if (var34 == 2) {
                                        method2714(class237.field2963, class88.method683(16748608) + var32.field3583, 20, var31.field1398, var8, var9);
                                    }
                                }
                                method2714(class237.field3113, class88.method683(16748608) + var32.field3583, 1004, var31.field1398, var8, var9);
                            } else if ((Statics.field818 & 0x1) == 1) {
                                method2714(field1014, field1015 + " " + class88.field1316 + " " + class88.method683(16748608) + var32.field3583, 17, var31.field1398, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class74 var38 = field900[field975];
            method308(var38, field975, var36, var37);
        }
    }

    @ObfuscatedName("ce.if(Ljh;IIII)V")
    public static final void method1734(class270 arg0, int arg1, int arg2, int arg3) {
        if (field1081 >= 400) {
            return;
        }
        if (arg0.field3664 != null) {
            arg0 = arg0.method4447();
        }
        if (arg0 == null || !arg0.field3667 || arg0.field3669 && field1048 != arg1) {
            return;
        }
        String var4 = arg0.field3639;
        if (arg0.field3635 != 0) {
            var4 = var4 + method241(arg0.field3635, Statics.field289.field839) + " " + class88.field1314 + class237.field3118 + arg0.field3635 + class88.field1317;
        }
        if (arg0.field3669 && field1003) {
            method2714(class237.field3113, class88.method683(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1041 == 1) {
            method2714(class237.field3056, field1010 + " " + class88.field1316 + " " + class88.method683(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1128) {
            int var5 = arg0.field3669 && field1003 ? 2000 : 0;
            String[] var6 = arg0.field3654;
            if (field1027) {
                var6 = method465(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class237.field3114)) {
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
                        method2714(var6[var7], class88.method683(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class237.field3114)) {
                        short var10 = 0;
                        if (field947 != class91.field1335) {
                            if (field947 == class91.field1332 || field947 == class91.field1334 && arg0.field3635 > Statics.field289.field839) {
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
                            method2714(var6[var9], class88.method683(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3669 || !field1003) {
                method2714(class237.field3113, class88.method683(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field818 & 0x2) == 2) {
            method2714(field1014, field1015 + " " + class88.field1316 + " " + class88.method683(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("az.iw(Lbf;IIII)V")
    public static final void method308(class74 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field289 == arg0 || field1081 >= 400) {
            return;
        }
        String var4;
        if (arg0.field842 == 0) {
            var4 = arg0.field861[0] + arg0.field860 + arg0.field861[1] + method241(arg0.field839, Statics.field289.field839) + " " + class88.field1314 + class237.field3118 + arg0.field839 + class88.field1317 + arg0.field861[2];
        } else {
            var4 = arg0.field861[0] + arg0.field860 + arg0.field861[1] + " " + class88.field1314 + class237.field3119 + arg0.field842 + class88.field1317 + arg0.field861[2];
        }
        if (field1041 == 1) {
            method2714(class237.field3056, field1010 + " " + class88.field1316 + " " + class88.method683(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1128) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field982[var5] != null) {
                    short var6 = 0;
                    if (field982[var5].equalsIgnoreCase(class237.field3114)) {
                        if (field899 == class91.field1335) {
                            continue;
                        }
                        if (field899 == class91.field1332 || field899 == class91.field1334 && arg0.field839 > Statics.field289.field839) {
                            var6 = 2000;
                        }
                        if (Statics.field289.field855 != 0 && arg0.field855 != 0) {
                            if (Statics.field289.field855 == arg0.field855) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field983[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field917[var5] + var6;
                    method2714(field982[var5], class88.method683(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field818 & 0x8) == 8) {
            method2714(field1014, field1015 + " " + class88.field1316 + " " + class88.method683(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field1081; var9++) {
            if (field1125[var9] == 23) {
                field1001[var9] = class88.method683(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("af.iv(IIS)Ljava/lang/String;")
    public static final String method241(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class88.method683(16711680);
        } else if (var2 < -6) {
            return class88.method683(16723968);
        } else if (var2 < -3) {
            return class88.method683(16740352);
        } else if (var2 < 0) {
            return class88.method683(16756736);
        } else if (var2 > 9) {
            return class88.method683(65280);
        } else if (var2 > 6) {
            return class88.method683(4259584);
        } else if (var2 > 3) {
            return class88.method683(8453888);
        } else if (var2 > 0) {
            return class88.method683(12648192);
        } else {
            return class88.method683(16776960);
        }
    }

    @ObfuscatedName("aa.iz(IIIIIIIII)V")
    public static final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class228.method4526(arg0)) {
            Statics.field3711 = null;
            method50(Statics.field2754[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3711 != null) {
                method50(Statics.field3711, -1412584499, arg1, arg2, arg3, arg4, Statics.field720, Statics.field1135, arg7);
                Statics.field3711 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1042[var8] = true;
            }
        } else {
            field1042[arg7] = true;
        }
    }

    @ObfuscatedName("u.im([Lhq;IIIIIIIII)V")
    public static final void method50(class228[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class295.method4810(arg2, arg3, arg4, arg5);
        class136.method2442();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class228 var10 = arg0[var9];
            if (var10 != null && (var10.field2782 == arg1 || arg1 == -1412584499 && field1029 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1064[field1059] = var10.field2757 + arg6;
                    field1065[field1059] = var10.field2825 + arg7;
                    field1066[field1059] = var10.field2778;
                    field1067[field1059] = var10.field2779;
                    var11 = ++field1059 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2894 = var11;
                var10.field2895 = field883;
                if (!var10.field2812 || !method144(var10)) {
                    if (var10.field2862 > 0) {
                        method158(var10);
                    }
                    int var12 = var10.field2757 + arg6;
                    int var13 = var10.field2825 + arg7;
                    int var14 = var10.field2794;
                    if (field1029 == var10) {
                        if (arg1 != -1412584499 && !var10.field2777) {
                            Statics.field3711 = arg0;
                            Statics.field720 = arg6;
                            Statics.field1135 = arg7;
                            continue;
                        }
                        if (field1040 && field1034) {
                            int var15 = class60.field705;
                            int var16 = class60.field706;
                            int var17 = var15 - field926;
                            int var18 = var16 - field1002;
                            if (var17 < field1035) {
                                var17 = field1035;
                            }
                            if (var10.field2778 + var17 > field1035 + field1030.field2778) {
                                var17 = field1035 + field1030.field2778 - var10.field2778;
                            }
                            if (var18 < field1036) {
                                var18 = field1036;
                            }
                            if (var10.field2779 + var18 > field1036 + field1030.field2779) {
                                var18 = field1036 + field1030.field2779 - var10.field2779;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2777) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2765 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2765 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2778 + var12;
                        int var26 = var10.field2779 + var13;
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
                        int var29 = var10.field2778 + var12;
                        int var30 = var10.field2779 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2812 || var19 < var21 && var20 < var22) {
                        if (var10.field2862 != 0) {
                            if (var10.field2862 == 1336) {
                                if (field889) {
                                    var13 += 15;
                                    Statics.field1214.method4548("Fps:" + field666, var10.field2778 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field879) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field879) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1214.method4548("Mem:" + var32 + "k", var10.field2778 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2862 == 1337) {
                                field1005 = var12;
                                field1006 = var13;
                                int var36 = var10.field2778;
                                int var37 = var10.field2779;
                                field920++;
                                method2750();
                                method71();
                                method313();
                                method664(true);
                                int var38 = class95.field1406;
                                int[] var39 = class95.field1410;
                                for (int var40 = 0; var40 < var38; var40++) {
                                    if (field975 != var39[var40] && field977 != var39[var40]) {
                                        method1000(field900[var39[var40]], true);
                                    }
                                }
                                method664(false);
                                for (class93 var41 = (class93) field988.method3492(); var41 != null; var41 = (class93) field988.method3481()) {
                                    if (Statics.field226 != var41.field1374 || field883 > var41.field1382) {
                                        var41.method3474();
                                    } else if (field883 >= var41.field1379) {
                                        if (var41.field1383 > 0) {
                                            class86 var42 = field1110[var41.field1383 - 1];
                                            if (var42 != null && var42.field1155 >= 0 && var42.field1155 < 13312 && var42.field1151 >= 0 && var42.field1151 < 13312) {
                                                var41.method1654(var42.field1155, var42.field1151, method919(var42.field1155, var42.field1151, var41.field1374) - var41.field1378, field883);
                                            }
                                        }
                                        if (var41.field1383 < 0) {
                                            int var43 = -var41.field1383 - 1;
                                            class74 var44;
                                            if (field977 == var43) {
                                                var44 = Statics.field289;
                                            } else {
                                                var44 = field900[var43];
                                            }
                                            if (var44 != null && var44.field1155 >= 0 && var44.field1155 < 13312 && var44.field1151 >= 0 && var44.field1151 < 13312) {
                                                var41.method1654(var44.field1155, var44.field1151, method919(var44.field1155, var44.field1151, var41.field1374) - var41.field1378, field883);
                                            }
                                        }
                                        var41.method1657(field945);
                                        Statics.field566.method2603(Statics.field226, (int) var41.field1385, (int) var41.field1391, (int) var41.field1387, 60, var41, var41.field1393, -1, false);
                                    }
                                }
                                for (class84 var45 = (class84) field989.method3492(); var45 != null; var45 = (class84) field989.method3481()) {
                                    if (Statics.field226 != var45.field1277 || var45.field1284) {
                                        var45.method3474();
                                    } else if (field883 >= var45.field1276) {
                                        var45.method1559(field945);
                                        if (var45.field1284) {
                                            var45.method3474();
                                        } else {
                                            Statics.field566.method2603(var45.field1277, var45.field1279, var45.field1286, var45.field1280, 60, var45, 0, -1, false);
                                        }
                                    }
                                }
                                method1062(var12, var13, var36, var37, true);
                                int var46 = field1107;
                                int var47 = field1117;
                                int var48 = field1118;
                                int var49 = field1070;
                                class295.method4810(var46, var47, var46 + var48, var47 + var49);
                                class136.method2442();
                                if (!field1102) {
                                    int var50 = field1093;
                                    if (field948 / 256 > var50) {
                                        var50 = field948 / 256;
                                    }
                                    if (field1098[4] && field1105[4] + 128 > var50) {
                                        var50 = field1105[4] + 128;
                                    }
                                    int var51 = field940 & 0x7FF;
                                    int var52 = Statics.field3341;
                                    int var53 = method919(Statics.field289.field1155, Statics.field289.field1151, Statics.field226) - field1024;
                                    int var54 = Statics.field1576;
                                    int var55 = var50 * 3 + 600;
                                    int var56 = 2048 - var50 & 0x7FF;
                                    int var57 = 2048 - var51 & 0x7FF;
                                    int var58 = 0;
                                    int var59 = 0;
                                    int var60 = var55;
                                    if (var56 != 0) {
                                        int var61 = class136.field1942[var56];
                                        int var62 = class136.field1922[var56];
                                        int var63 = var59 * var62 - var55 * var61 >> 16;
                                        var60 = var59 * var61 + var55 * var62 >> 16;
                                        var59 = var63;
                                    }
                                    if (var57 != 0) {
                                        int var64 = class136.field1942[var57];
                                        int var65 = class136.field1922[var57];
                                        int var66 = var58 * var65 + var60 * var64 >> 16;
                                        var60 = var60 * var65 - var58 * var64 >> 16;
                                        var58 = var66;
                                    }
                                    Statics.field672 = var52 - var58;
                                    Statics.field806 = var53 - var59;
                                    Statics.field702 = var54 - var60;
                                    Statics.field1571 = var50;
                                    Statics.field16 = var51;
                                }
                                int var79;
                                if (field1102) {
                                    int var80;
                                    if (Statics.field2727.field1240) {
                                        var80 = Statics.field226;
                                    } else {
                                        int var81 = method919(Statics.field672, Statics.field702, Statics.field226);
                                        if (var81 - Statics.field806 >= 800 || (class62.field729[Statics.field226][Statics.field672 >> 7][Statics.field702 >> 7] & 0x4) == 0) {
                                            var80 = 3;
                                        } else {
                                            var80 = Statics.field226;
                                        }
                                    }
                                    var79 = var80;
                                } else {
                                    int var67;
                                    if (Statics.field2727.field1240) {
                                        var67 = Statics.field226;
                                    } else {
                                        label1164: {
                                            int var68 = 3;
                                            if (Statics.field1571 < 310) {
                                                int var69 = Statics.field672 >> 7;
                                                int var70 = Statics.field702 >> 7;
                                                int var71 = Statics.field289.field1155 >> 7;
                                                int var72 = Statics.field289.field1151 >> 7;
                                                if (var69 < 0 || var70 < 0 || var69 >= 104 || var70 >= 104) {
                                                    var67 = Statics.field226;
                                                    break label1164;
                                                }
                                                if ((class62.field729[Statics.field226][var69][var70] & 0x4) != 0) {
                                                    var68 = Statics.field226;
                                                }
                                                int var73;
                                                if (var71 > var69) {
                                                    var73 = var71 - var69;
                                                } else {
                                                    var73 = var69 - var71;
                                                }
                                                int var74;
                                                if (var72 > var70) {
                                                    var74 = var72 - var70;
                                                } else {
                                                    var74 = var70 - var72;
                                                }
                                                if (var73 > var74) {
                                                    int var75 = var74 * 65536 / var73;
                                                    int var76 = 32768;
                                                    while (var69 != var71) {
                                                        if (var69 < var71) {
                                                            var69++;
                                                        } else if (var69 > var71) {
                                                            var69--;
                                                        }
                                                        if ((class62.field729[Statics.field226][var69][var70] & 0x4) != 0) {
                                                            var68 = Statics.field226;
                                                        }
                                                        var76 += var75;
                                                        if (var76 >= 65536) {
                                                            var76 -= 65536;
                                                            if (var70 < var72) {
                                                                var70++;
                                                            } else if (var70 > var72) {
                                                                var70--;
                                                            }
                                                            if ((class62.field729[Statics.field226][var69][var70] & 0x4) != 0) {
                                                                var68 = Statics.field226;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var77 = var73 * 65536 / var74;
                                                    int var78 = 32768;
                                                    while (var70 != var72) {
                                                        if (var70 < var72) {
                                                            var70++;
                                                        } else if (var70 > var72) {
                                                            var70--;
                                                        }
                                                        if ((class62.field729[Statics.field226][var69][var70] & 0x4) != 0) {
                                                            var68 = Statics.field226;
                                                        }
                                                        var78 += var77;
                                                        if (var78 >= 65536) {
                                                            var78 -= 65536;
                                                            if (var69 < var71) {
                                                                var69++;
                                                            } else if (var69 > var71) {
                                                                var69--;
                                                            }
                                                            if ((class62.field729[Statics.field226][var69][var70] & 0x4) != 0) {
                                                                var68 = Statics.field226;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field289.field1155 >= 0 && Statics.field289.field1151 >= 0 && Statics.field289.field1155 < 13312 && Statics.field289.field1151 < 13312) {
                                                if ((class62.field729[Statics.field226][Statics.field289.field1155 >> 7][Statics.field289.field1151 >> 7] & 0x4) != 0) {
                                                    var68 = Statics.field226;
                                                }
                                                var67 = var68;
                                            } else {
                                                var67 = Statics.field226;
                                            }
                                        }
                                    }
                                    var79 = var67;
                                }
                                int var82 = Statics.field672;
                                int var83 = Statics.field806;
                                int var84 = Statics.field702;
                                int var85 = Statics.field1571;
                                int var86 = Statics.field16;
                                for (int var87 = 0; var87 < 5; var87++) {
                                    if (field1098[var87]) {
                                        int var88 = (int) (Math.random() * (double) (field930[var87] * 2 + 1) - (double) field930[var87] + Math.sin((double) field1106[var87] / 100.0D * (double) field1044[var87]) * (double) field1105[var87]);
                                        if (var87 == 0) {
                                            Statics.field672 += var88;
                                        }
                                        if (var87 == 1) {
                                            Statics.field806 += var88;
                                        }
                                        if (var87 == 2) {
                                            Statics.field702 += var88;
                                        }
                                        if (var87 == 3) {
                                            Statics.field16 = Statics.field16 + var88 & 0x7FF;
                                        }
                                        if (var87 == 4) {
                                            Statics.field1571 += var88;
                                            if (Statics.field1571 < 128) {
                                                Statics.field1571 = 128;
                                            }
                                            if (Statics.field1571 > 383) {
                                                Statics.field1571 = 383;
                                            }
                                        }
                                    }
                                }
                                int var89 = class60.field705;
                                int var90 = class60.field706;
                                if (class60.field711 != 0) {
                                    var89 = class60.field710;
                                    var90 = class60.field714;
                                }
                                if (var89 >= var46 && var89 < var46 + var48 && var90 >= var47 && var90 < var47 + var49) {
                                    int var91 = var89 - var46;
                                    int var92 = var90 - var47;
                                    class134.field1900 = var91;
                                    class134.field1901 = var92;
                                    class134.field1909 = true;
                                    class134.field1899 = 0;
                                    class134.field1902 = false;
                                } else {
                                    class134.field1909 = false;
                                    class134.field1899 = 0;
                                }
                                method4524();
                                class295.method4752(var46, var47, var48, var49, 0);
                                method4524();
                                int var93 = class136.field1927;
                                class136.field1927 = field996;
                                Statics.field566.method2561(Statics.field672, Statics.field806, Statics.field702, Statics.field1571, Statics.field16, var79);
                                class8.method14();
                                class136.field1927 = var93;
                                method4524();
                                Statics.field566.method2534();
                                method5(var46, var47, var48, var49);
                                if (field943 == 2) {
                                    method995((field894 - Statics.field2458 << 7) + field897, (field1074 - Statics.field1288 << 7) + field1025, field896 * 2);
                                    if (field961 > -1 && field883 % 20 < 10) {
                                        Statics.field683[0].method4859(field961 + var46 - 12, field991 + var47 - 28);
                                    }
                                }
                                ((class125) Statics.field1925).method2221(field945);
                                if (field966 == 1) {
                                    Statics.field820[field965 / 100].method4859(field963 - 8, field964 - 8);
                                }
                                if (field966 == 2) {
                                    Statics.field820[field965 / 100 + 4].method4859(field963 - 8, field964 - 8);
                                }
                                field891 = 0;
                                int var94 = (Statics.field289.field1155 >> 7) + Statics.field2458;
                                int var95 = (Statics.field289.field1151 >> 7) + Statics.field1288;
                                if (var94 >= 3053 && var94 <= 3156 && var95 >= 3056 && var95 <= 3136) {
                                    field891 = 1;
                                }
                                if (var94 >= 3072 && var94 <= 3118 && var95 >= 9492 && var95 <= 9535) {
                                    field891 = 1;
                                }
                                if (field891 == 1 && var94 >= 3139 && var94 <= 3199 && var95 >= 3008 && var95 <= 3062) {
                                    field891 = 0;
                                }
                                Statics.field672 = var82;
                                Statics.field806 = var83;
                                Statics.field702 = var84;
                                Statics.field1571 = var85;
                                Statics.field16 = var86;
                                if (field882 && class250.method1018(true, false) == 0) {
                                    field882 = false;
                                }
                                if (field882) {
                                    class295.method4752(var46, var47, var48, var49, 0);
                                    Statics.method67(class237.field2972, false);
                                }
                                field1042[var10.field2894] = true;
                                class295.method4810(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2862 == 1338) {
                                method3239(var10, var12, var13, var11);
                                class295.method4810(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2862 == 1339) {
                                method1955(var10, var12, var13, var11);
                                class295.method4810(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2862 == 1400) {
                                Statics.field1688.method5124(var12, var13, var10.field2778, var10.field2779, field883);
                            }
                            if (var10.field2862 == 1401) {
                                Statics.field1688.method5076(var12, var13, var10.field2778, var10.field2779);
                            }
                        }
                        if (var10.field2765 == 0) {
                            if (!var10.field2812 && method144(var10) && Statics.field240 != var10) {
                                continue;
                            }
                            if (!var10.field2812) {
                                if (var10.field2867 > var10.field2787 - var10.field2779) {
                                    var10.field2867 = var10.field2787 - var10.field2779;
                                }
                                if (var10.field2867 < 0) {
                                    var10.field2867 = 0;
                                }
                            }
                            method50(arg0, var10.field2763, var19, var20, var21, var22, var12 - var10.field2784, var13 - var10.field2867, var11);
                            if (var10.field2887 != null) {
                                method50(var10.field2887, var10.field2763, var19, var20, var21, var22, var12 - var10.field2784, var13 - var10.field2867, var11);
                            }
                            class68 var96 = (class68) field1017.method3416((long) var10.field2763);
                            if (var96 != null) {
                                method485(var96.field791, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class295.method4810(arg2, arg3, arg4, arg5);
                            class136.method2442();
                        }
                        if (field893 || field976[var11] || field1068 > 1) {
                            if (var10.field2765 == 0 && !var10.field2812 && var10.field2787 > var10.field2779) {
                                int var97 = var10.field2778 + var12;
                                int var98 = var10.field2867;
                                int var99 = var10.field2779;
                                int var100 = var10.field2787;
                                Statics.field692[0].method4830(var97, var13);
                                Statics.field692[1].method4830(var97, var13 + var99 - 16);
                                class295.method4752(var97, var13 + 16, 16, var99 - 32, field1088);
                                int var101 = (var99 - 32) * var99 / var100;
                                if (var101 < 8) {
                                    var101 = 8;
                                }
                                int var102 = (var99 - 32 - var101) * var98 / (var100 - var99);
                                class295.method4752(var97, var13 + 16 + var102, 16, var101, field934);
                                class295.method4757(var97, var13 + 16 + var102, var101, field936);
                                class295.method4757(var97 + 1, var13 + 16 + var102, var101, field936);
                                class295.method4775(var97, var13 + 16 + var102, 16, field936);
                                class295.method4775(var97, var13 + 17 + var102, 16, field936);
                                class295.method4757(var97 + 15, var13 + 16 + var102, var101, field1009);
                                class295.method4757(var97 + 14, var13 + 17 + var102, var101 - 1, field1009);
                                class295.method4775(var97, var13 + 15 + var102 + var101, 16, field1009);
                                class295.method4775(var97 + 1, var13 + 14 + var102 + var101, 15, field1009);
                            }
                            if (var10.field2765 != 1) {
                                if (var10.field2765 == 2) {
                                    int var103 = 0;
                                    for (int var104 = 0; var104 < var10.field2775; var104++) {
                                        for (int var105 = 0; var105 < var10.field2774; var105++) {
                                            int var106 = (var10.field2776 + 32) * var105 + var12;
                                            int var107 = (var10.field2830 + 32) * var104 + var13;
                                            if (var103 < 20) {
                                                var106 += var10.field2831[var103];
                                                var107 += var10.field2875[var103];
                                            }
                                            if (var10.field2881[var103] > 0) {
                                                boolean var108 = false;
                                                boolean var109 = false;
                                                int var110 = var10.field2881[var103] - 1;
                                                if (var106 + 32 > arg2 && var106 < arg4 && var107 + 32 > arg3 && var107 < arg5 || Statics.field2041 == var10 && field969 == var103) {
                                                    class299 var111;
                                                    if (field1041 == 1 && Statics.field337 == var103 && Statics.field449 == var10.field2763) {
                                                        var111 = class268.method2191(var110, var10.field2882[var103], 2, 0, 2, false);
                                                    } else {
                                                        var111 = class268.method2191(var110, var10.field2882[var103], 1, 3153952, 2, false);
                                                    }
                                                    if (var111 == null) {
                                                        method211(var10);
                                                    } else if (Statics.field2041 == var10 && field969 == var103) {
                                                        int var112 = class60.field705 - field970;
                                                        int var113 = class60.field706 - field971;
                                                        if (var112 < 5 && var112 > -5) {
                                                            var112 = 0;
                                                        }
                                                        if (var113 < 5 && var113 > -5) {
                                                            var113 = 0;
                                                        }
                                                        if (field974 < 5) {
                                                            var112 = 0;
                                                            var113 = 0;
                                                        }
                                                        var111.method4865(var106 + var112, var107 + var113, 128);
                                                        if (arg1 != -1) {
                                                            class228 var114 = arg0[arg1 & 0xFFFF];
                                                            if (var107 + var113 < class295.field3834 && var114.field2867 > 0) {
                                                                int var115 = field945 * (class295.field3834 - var107 - var113) / 3;
                                                                if (var115 > field945 * 10) {
                                                                    var115 = field945 * 10;
                                                                }
                                                                if (var115 > var114.field2867) {
                                                                    var115 = var114.field2867;
                                                                }
                                                                var114.field2867 -= var115;
                                                                field971 += var115;
                                                                method211(var114);
                                                            }
                                                            if (var107 + var113 + 32 > class295.field3832 && var114.field2867 < var114.field2787 - var114.field2779) {
                                                                int var116 = field945 * (var107 + var113 + 32 - class295.field3832) / 3;
                                                                if (var116 > field945 * 10) {
                                                                    var116 = field945 * 10;
                                                                }
                                                                if (var116 > var114.field2787 - var114.field2779 - var114.field2867) {
                                                                    var116 = var114.field2787 - var114.field2779 - var114.field2867;
                                                                }
                                                                var114.field2867 += var116;
                                                                field971 -= var116;
                                                                method211(var114);
                                                            }
                                                        }
                                                    } else if (Statics.field439 == var10 && field968 == var103) {
                                                        var111.method4865(var106, var107, 128);
                                                    } else {
                                                        var111.method4859(var106, var107);
                                                    }
                                                }
                                            } else if (var10.field2833 != null && var103 < 20) {
                                                class299 var117 = var10.method3833(var103);
                                                if (var117 != null) {
                                                    var117.method4859(var106, var107);
                                                } else if (class228.field2761) {
                                                    method211(var10);
                                                }
                                            }
                                            var103++;
                                        }
                                    }
                                } else if (var10.field2765 == 3) {
                                    int var118;
                                    if (method1110(var10)) {
                                        var118 = var10.field2789;
                                        if (Statics.field240 == var10 && var10.field2791 != 0) {
                                            var118 = var10.field2791;
                                        }
                                    } else {
                                        var118 = var10.field2788;
                                        if (Statics.field240 == var10 && var10.field2810 != 0) {
                                            var118 = var10.field2810;
                                        }
                                    }
                                    if (var10.field2792) {
                                        switch(var10.field2793.field3844) {
                                            case 1:
                                                class295.method4762(var12, var13, var10.field2778, var10.field2779, var10.field2788, var10.field2789, 256 - (var10.field2794 & 0xFF), 256 - (var10.field2897 & 0xFF));
                                                break;
                                            case 2:
                                                class295.method4812(var12, var13, var10.field2778, var10.field2779, var10.field2788, var10.field2789, 256 - (var10.field2794 & 0xFF), 256 - (var10.field2897 & 0xFF));
                                                break;
                                            case 3:
                                                class295.method4803(var12, var13, var10.field2778, var10.field2779, var10.field2788, var10.field2789, 256 - (var10.field2794 & 0xFF), 256 - (var10.field2897 & 0xFF));
                                                break;
                                            case 4:
                                                class295.method4809(var12, var13, var10.field2778, var10.field2779, var10.field2788, var10.field2789, 256 - (var10.field2794 & 0xFF), 256 - (var10.field2897 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class295.method4752(var12, var13, var10.field2778, var10.field2779, var118);
                                                } else {
                                                    class295.method4745(var12, var13, var10.field2778, var10.field2779, var118, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class295.method4769(var12, var13, var10.field2778, var10.field2779, var118);
                                    } else {
                                        class295.method4749(var12, var13, var10.field2778, var10.field2779, var118, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2765 == 4) {
                                    class275 var119 = var10.method3832();
                                    if (var119 != null) {
                                        String var120 = var10.field2823;
                                        int var121;
                                        if (method1110(var10)) {
                                            var121 = var10.field2789;
                                            if (Statics.field240 == var10 && var10.field2791 != 0) {
                                                var121 = var10.field2791;
                                            }
                                            if (var10.field2824.length() > 0) {
                                                var120 = var10.field2824;
                                            }
                                        } else {
                                            var121 = var10.field2788;
                                            if (Statics.field240 == var10 && var10.field2810 != 0) {
                                                var121 = var10.field2810;
                                            }
                                        }
                                        if (var10.field2812 && var10.field2883 != -1) {
                                            class268 var122 = class268.method1985(var10.field2883);
                                            var120 = var122.field3583;
                                            if (var120 == null) {
                                                var120 = "null";
                                            }
                                            if ((var122.field3578 == 1 || var10.field2884 != 1) && var10.field2884 != -1) {
                                                var120 = class88.method683(16748608) + var120 + class88.field1311 + " " + 'x' + method238(var10.field2884);
                                            }
                                        }
                                        if (field1020 == var10) {
                                            class237 var10000 = (class237) null;
                                            var120 = class237.field3120;
                                            var121 = var10.field2788;
                                        }
                                        if (!var10.field2812) {
                                            var120 = method47(var120, var10);
                                        }
                                        var119.method4550(var120, var12, var13, var10.field2778, var10.field2779, var121, var10.field2828 ? 0 : -1, var10.field2826, var10.field2762, var10.field2836);
                                    } else if (class228.field2761) {
                                        method211(var10);
                                    }
                                } else if (var10.field2765 == 5) {
                                    if (var10.field2812) {
                                        class299 var124;
                                        if (var10.field2883 == -1) {
                                            var124 = var10.method3825(false);
                                        } else {
                                            var124 = class268.method2191(var10.field2883, var10.field2884, var10.field2802, var10.field2803, var10.field2785, false);
                                        }
                                        if (var124 != null) {
                                            int var125 = var124.field3856;
                                            int var126 = var124.field3862;
                                            if (var10.field2801) {
                                                class295.method4739(var12, var13, var10.field2778 + var12, var10.field2779 + var13);
                                                int var127 = (var10.field2778 + (var125 - 1)) / var125;
                                                int var128 = (var10.field2779 + (var126 - 1)) / var126;
                                                for (int var129 = 0; var129 < var127; var129++) {
                                                    for (int var130 = 0; var130 < var128; var130++) {
                                                        if (var10.field2800 != 0) {
                                                            var124.method4872(var125 / 2 + var125 * var129 + var12, var126 / 2 + var126 * var130 + var13, var10.field2800, 4096);
                                                        } else if (var14 == 0) {
                                                            var124.method4859(var125 * var129 + var12, var126 * var130 + var13);
                                                        } else {
                                                            var124.method4865(var125 * var129 + var12, var126 * var130 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class295.method4810(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var131 = var10.field2778 * 4096 / var125;
                                                if (var10.field2800 != 0) {
                                                    var124.method4872(var10.field2778 / 2 + var12, var10.field2779 / 2 + var13, var10.field2800, var131);
                                                } else if (var14 != 0) {
                                                    var124.method4867(var12, var13, var10.field2778, var10.field2779, 256 - (var14 & 0xFF));
                                                } else if (var10.field2778 == var125 && var10.field2779 == var126) {
                                                    var124.method4859(var12, var13);
                                                } else {
                                                    var124.method4861(var12, var13, var10.field2778, var10.field2779);
                                                }
                                            }
                                        } else if (class228.field2761) {
                                            method211(var10);
                                        }
                                    } else {
                                        class299 var123 = var10.method3825(method1110(var10));
                                        if (var123 != null) {
                                            var123.method4859(var12, var13);
                                        } else if (class228.field2761) {
                                            method211(var10);
                                        }
                                    }
                                } else if (var10.field2765 == 6) {
                                    boolean var132 = method1110(var10);
                                    int var133;
                                    if (var132) {
                                        var133 = var10.field2811;
                                    } else {
                                        var133 = var10.field2750;
                                    }
                                    class133 var134 = null;
                                    int var135 = 0;
                                    if (var10.field2883 != -1) {
                                        class268 var136 = class268.method1985(var10.field2883);
                                        if (var136 != null) {
                                            class268 var137 = var136.method4366(var10.field2884);
                                            var134 = var137.method4365(1);
                                            if (var134 == null) {
                                                method211(var10);
                                            } else {
                                                var134.method2359();
                                                var135 = var134.field2026 / 2;
                                            }
                                        }
                                    } else if (var10.field2889 == 5) {
                                        if (var10.field2807 == 0) {
                                            var134 = field1127.method3799((class272) null, -1, (class272) null, -1);
                                        } else {
                                            var134 = Statics.field289.method1047();
                                        }
                                    } else if (var133 == -1) {
                                        var134 = var10.method3868((class272) null, -1, var132, Statics.field289.field858);
                                        if (var134 == null && class228.field2761) {
                                            method211(var10);
                                        }
                                    } else {
                                        class272 var138 = class272.method579(var133);
                                        var134 = var10.method3868(var138, var10.field2885, var132, Statics.field289.field858);
                                        if (var134 == null && class228.field2761) {
                                            method211(var10);
                                        }
                                    }
                                    class136.method2445(var10.field2778 / 2 + var12, var10.field2779 / 2 + var13);
                                    int var139 = var10.field2817 * class136.field1942[var10.field2814] >> 16;
                                    int var140 = var10.field2817 * class136.field1922[var10.field2814] >> 16;
                                    if (var134 != null) {
                                        if (var10.field2812) {
                                            var134.method2359();
                                            if (var10.field2858) {
                                                var134.method2365(0, var10.field2815, var10.field2767, var10.field2814, var10.field2869, var10.field2813 + var135 + var139, var10.field2813 + var140, var10.field2817);
                                            } else {
                                                var134.method2364(0, var10.field2815, var10.field2767, var10.field2814, var10.field2869, var10.field2813 + var135 + var139, var10.field2813 + var140);
                                            }
                                        } else {
                                            var134.method2364(0, var10.field2815, 0, var10.field2814, 0, var139, var140);
                                        }
                                    }
                                    class136.method2444();
                                } else {
                                    if (var10.field2765 == 7) {
                                        class275 var141 = var10.method3832();
                                        if (var141 == null) {
                                            if (class228.field2761) {
                                                method211(var10);
                                            }
                                            continue;
                                        }
                                        int var142 = 0;
                                        for (int var143 = 0; var143 < var10.field2775; var143++) {
                                            for (int var144 = 0; var144 < var10.field2774; var144++) {
                                                if (var10.field2881[var142] > 0) {
                                                    class268 var145 = class268.method1985(var10.field2881[var142] - 1);
                                                    String var146;
                                                    if (var145.field3578 != 1 && var10.field2882[var142] == 1) {
                                                        var146 = class88.method683(16748608) + var145.field3583 + class88.field1311;
                                                    } else {
                                                        var146 = class88.method683(16748608) + var145.field3583 + class88.field1311 + " " + 'x' + method238(var10.field2882[var142]);
                                                    }
                                                    int var147 = (var10.field2776 + 115) * var144 + var12;
                                                    int var148 = (var10.field2830 + 12) * var143 + var13;
                                                    if (var10.field2826 == 0) {
                                                        var141.method4546(var146, var147, var148, var10.field2788, var10.field2828 ? 0 : -1);
                                                    } else if (var10.field2826 == 1) {
                                                        var141.method4549(var146, var10.field2778 / 2 + var147, var148, var10.field2788, var10.field2828 ? 0 : -1);
                                                    } else {
                                                        var141.method4548(var146, var10.field2778 + var147 - 1, var148, var10.field2788, var10.field2828 ? 0 : -1);
                                                    }
                                                }
                                                var142++;
                                            }
                                        }
                                    }
                                    if (var10.field2765 == 8 && Statics.field1666 == var10 && field1008 == field1007) {
                                        int var149 = 0;
                                        int var150 = 0;
                                        class275 var151 = Statics.field1214;
                                        String var152 = var10.field2823;
                                        String var153 = method47(var152, var10);
                                        while (var153.length() > 0) {
                                            int var154 = var153.indexOf(class88.field1319);
                                            String var155;
                                            if (var154 == -1) {
                                                var155 = var153;
                                                var153 = "";
                                            } else {
                                                var155 = var153.substring(0, var154);
                                                var153 = var153.substring(var154 + 4);
                                            }
                                            int var156 = var151.method4541(var155);
                                            if (var156 > var149) {
                                                var149 = var156;
                                            }
                                            var150 += var151.field3722 + 1;
                                        }
                                        var149 += 6;
                                        var150 += 7;
                                        int var157 = var10.field2778 + var12 - 5 - var149;
                                        int var158 = var10.field2779 + var13 + 5;
                                        if (var157 < var12 + 5) {
                                            var157 = var12 + 5;
                                        }
                                        if (var149 + var157 > arg4) {
                                            var157 = arg4 - var149;
                                        }
                                        if (var150 + var158 > arg5) {
                                            var158 = arg5 - var150;
                                        }
                                        class295.method4752(var157, var158, var149, var150, 16777120);
                                        class295.method4769(var157, var158, var149, var150, 0);
                                        String var159 = var10.field2823;
                                        int var160 = var151.field3722 + var158 + 2;
                                        String var161 = method47(var159, var10);
                                        while (var161.length() > 0) {
                                            int var162 = var161.indexOf(class88.field1319);
                                            String var163;
                                            if (var162 == -1) {
                                                var163 = var161;
                                                var161 = "";
                                            } else {
                                                var163 = var161.substring(0, var162);
                                                var161 = var161.substring(var162 + 4);
                                            }
                                            var151.method4546(var163, var157 + 3, var160, 0, -1);
                                            var160 += var151.field3722 + 1;
                                        }
                                    }
                                    if (var10.field2765 == 9) {
                                        int var164;
                                        int var165;
                                        int var166;
                                        int var167;
                                        if (var10.field2797) {
                                            var164 = var12;
                                            var165 = var10.field2779 + var13;
                                            var166 = var10.field2778 + var12;
                                            var167 = var13;
                                        } else {
                                            var164 = var12;
                                            var165 = var13;
                                            var166 = var10.field2778 + var12;
                                            var167 = var10.field2779 + var13;
                                        }
                                        if (var10.field2796 == 1) {
                                            class295.method4759(var164, var165, var166, var167, var10.field2788);
                                        } else {
                                            int var170 = var10.field2788;
                                            int var171 = var10.field2796;
                                            int var172 = var166 - var164;
                                            int var173 = var167 - var165;
                                            int var174 = var172 >= 0 ? var172 : -var172;
                                            int var175 = var173 >= 0 ? var173 : -var173;
                                            int var176 = var174;
                                            if (var174 < var175) {
                                                var176 = var175;
                                            }
                                            if (var176 != 0) {
                                                int var177 = (var172 << 16) / var176;
                                                int var178 = (var173 << 16) / var176;
                                                if (var178 <= var177) {
                                                    var177 = -var177;
                                                } else {
                                                    var178 = -var178;
                                                }
                                                int var179 = var171 * var178 >> 17;
                                                int var180 = var171 * var178 + 1 >> 17;
                                                int var181 = var171 * var177 >> 17;
                                                int var182 = var171 * var177 + 1 >> 17;
                                                int var183 = var164 - class295.field3836;
                                                int var184 = var165 - class295.field3834;
                                                int var185 = var179 + var183;
                                                int var186 = var183 - var180;
                                                int var187 = var172 + var183 - var180;
                                                int var188 = var172 + var183 + var179;
                                                int var189 = var181 + var184;
                                                int var190 = var184 - var182;
                                                int var191 = var173 + var184 - var182;
                                                int var192 = var173 + var184 + var181;
                                                class136.method2450(var185, var186, var187);
                                                class136.method2453(var189, var190, var191, var185, var186, var187, var170);
                                                class136.method2450(var185, var187, var188);
                                                class136.method2453(var189, var191, var192, var185, var187, var188, var170);
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

    @ObfuscatedName("z.ie(Ljava/lang/String;Lhq;I)Ljava/lang/String;")
    public static String method47(String arg0, class228 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1072(arg1, var2 - 1);
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

    @ObfuscatedName("af.ix(II)Ljava/lang/String;")
    public static final String method238(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class88.field1312 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class88.method683(65408) + var1.substring(0, var1.length() - 8) + class237.field3123 + " " + class88.field1314 + var1 + class88.field1317 + class88.field1311;
        } else if (var1.length() > 6) {
            return " " + class88.method683(16777215) + var1.substring(0, var1.length() - 4) + class237.field3125 + " " + class88.field1314 + var1 + class88.field1317 + class88.field1311;
        } else {
            return " " + class88.method683(16776960) + var1 + class88.field1311;
        }
    }

    @ObfuscatedName("client.ic(ZB)V")
    public final void method1256(boolean arg0) {
        int var2 = field1016;
        int var3 = Statics.field1320;
        int var4 = Statics.field358;
        if (class228.method4526(var2)) {
            method162(Statics.field2754[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.iy(Lhq;I)V")
    public void method1092(class228 arg0) {
        class228 var2 = arg0.field2782 == -1 ? null : class228.method2725(arg0.field2782);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1320;
            var4 = Statics.field358;
        } else {
            var3 = var2.field2778;
            var4 = var2.field2779;
        }
        method1391(arg0, var3, var4, false);
        method3733(arg0, var3, var4);
    }

    @ObfuscatedName("ft.ip([Lhq;Lhq;ZI)V")
    public static void method2835(class228[] arg0, class228 arg1, boolean arg2) {
        int var3 = arg1.field2786 == 0 ? arg1.field2778 : arg1.field2786;
        int var4 = arg1.field2787 == 0 ? arg1.field2779 : arg1.field2787;
        method162(arg0, arg1.field2763, var3, var4, arg2);
        if (arg1.field2887 != null) {
            method162(arg1.field2887, arg1.field2763, var3, var4, arg2);
        }
        class68 var5 = (class68) field1017.method3416((long) arg1.field2763);
        if (var5 != null) {
            int var6 = var5.field791;
            if (class228.method4526(var6)) {
                method162(Statics.field2754[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2862 == 1337) {
        }
    }

    @ObfuscatedName("c.ir([Lhq;IIIZI)V")
    public static void method162(class228[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class228 var6 = arg0[var5];
            if (var6 != null && var6.field2782 == arg1) {
                method1391(var6, arg2, arg3, arg4);
                method3733(var6, arg2, arg3);
                if (var6.field2784 > var6.field2786 - var6.field2778) {
                    var6.field2784 = var6.field2786 - var6.field2778;
                }
                if (var6.field2784 < 0) {
                    var6.field2784 = 0;
                }
                if (var6.field2867 > var6.field2787 - var6.field2779) {
                    var6.field2867 = var6.field2787 - var6.field2779;
                }
                if (var6.field2867 < 0) {
                    var6.field2867 = 0;
                }
                if (var6.field2765 == 0) {
                    method2835(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("client.iu(Lhq;IIZB)V")
    public static void method1391(class228 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2778;
        int var5 = arg0.field2779;
        if (arg0.field2816 == 0) {
            arg0.field2778 = arg0.field2774;
        } else if (arg0.field2816 == 1) {
            arg0.field2778 = arg1 - arg0.field2774;
        } else if (arg0.field2816 == 2) {
            arg0.field2778 = arg0.field2774 * arg1 >> 14;
        }
        if (arg0.field2771 == 0) {
            arg0.field2779 = arg0.field2775;
        } else if (arg0.field2771 == 1) {
            arg0.field2779 = arg2 - arg0.field2775;
        } else if (arg0.field2771 == 2) {
            arg0.field2779 = arg0.field2775 * arg2 >> 14;
        }
        if (arg0.field2816 == 4) {
            arg0.field2778 = arg0.field2805 * arg0.field2779 / arg0.field2781;
        }
        if (arg0.field2771 == 4) {
            arg0.field2779 = arg0.field2781 * arg0.field2778 / arg0.field2805;
        }
        if (field912 && arg0.field2765 == 0) {
            if (arg0.field2779 < 5 && arg0.field2778 < 5) {
                arg0.field2779 = 5;
                arg0.field2778 = 5;
            } else {
                if (arg0.field2779 <= 0) {
                    arg0.field2779 = 5;
                }
                if (arg0.field2778 <= 0) {
                    arg0.field2778 = 5;
                }
            }
        }
        if (arg0.field2862 == 1337) {
            field981 = arg0;
        }
        if (arg3 && arg0.field2872 != null && (arg0.field2778 != var4 || arg0.field2779 != var5)) {
            class69 var6 = new class69();
            var6.field797 = arg0;
            var6.field805 = arg0.field2872;
            field1055.method3482(var6);
        }
    }

    @ObfuscatedName("hm.jc(Lhq;III)V")
    public static void method3733(class228 arg0, int arg1, int arg2) {
        if (arg0.field2768 == 0) {
            arg0.field2757 = arg0.field2865;
        } else if (arg0.field2768 == 1) {
            arg0.field2757 = (arg1 - arg0.field2778) / 2 + arg0.field2865;
        } else if (arg0.field2768 == 2) {
            arg0.field2757 = arg1 - arg0.field2778 - arg0.field2865;
        } else if (arg0.field2768 == 3) {
            arg0.field2757 = arg0.field2865 * arg1 >> 14;
        } else if (arg0.field2768 == 4) {
            arg0.field2757 = (arg0.field2865 * arg1 >> 14) + (arg1 - arg0.field2778) / 2;
        } else {
            arg0.field2757 = arg1 - arg0.field2778 - (arg0.field2865 * arg1 >> 14);
        }
        if (arg0.field2795 == 0) {
            arg0.field2825 = arg0.field2773;
        } else if (arg0.field2795 == 1) {
            arg0.field2825 = (arg2 - arg0.field2779) / 2 + arg0.field2773;
        } else if (arg0.field2795 == 2) {
            arg0.field2825 = arg2 - arg0.field2779 - arg0.field2773;
        } else if (arg0.field2795 == 3) {
            arg0.field2825 = arg0.field2773 * arg2 >> 14;
        } else if (arg0.field2795 == 4) {
            arg0.field2825 = (arg0.field2773 * arg2 >> 14) + (arg2 - arg0.field2779) / 2;
        } else {
            arg0.field2825 = arg2 - arg0.field2779 - (arg0.field2773 * arg2 >> 14);
        }
        if (!field912 || arg0.field2765 != 0) {
            return;
        }
        if (arg0.field2757 < 0) {
            arg0.field2757 = 0;
        } else if (arg0.field2778 + arg0.field2757 > arg1) {
            arg0.field2757 = arg1 - arg0.field2778;
        }
        if (arg0.field2825 < 0) {
            arg0.field2825 = 0;
        } else if (arg0.field2825 + arg0.field2779 > arg2) {
            arg0.field2825 = arg2 - arg0.field2779;
        }
    }

    @ObfuscatedName("client.je(Lhq;S)Z")
    public static final boolean method1110(class228 arg0) {
        if (arg0.field2876 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2876.length; var1++) {
            int var2 = method1072(arg0, var1);
            int var3 = arg0.field2842[var1];
            if (arg0.field2876[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2876[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2876[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("br.ja(Lhq;II)I")
    public static final int method1072(class228 arg0, int arg1) {
        if (arg0.field2829 == null || arg1 >= arg0.field2829.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2829[arg1];
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
                    var7 = field990[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1116[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field901[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class228 var11 = class228.method2725(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class268.method1985(var12).field3621 || field875)) {
                        for (int var13 = 0; var13 < var11.field2881.length; var13++) {
                            if (var12 + 1 == var11.field2881[var13]) {
                                var7 += var11.field2882[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class223.field2726[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class234.field2949[field1116[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class223.field2726[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field289.field839;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class234.field2948[var14]) {
                            var7 += field1116[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class228 var17 = class228.method2725(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class268.method1985(var18).field3621 || field875)) {
                        for (int var19 = 0; var19 < var17.field2881.length; var19++) {
                            if (var18 + 1 == var17.field2881[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1063;
                }
                if (var6 == 12) {
                    var7 = field957;
                }
                if (var6 == 13) {
                    int var20 = class223.field2726[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class223.method1428(var22);
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
                    var7 = (Statics.field289.field1155 >> 7) + Statics.field2458;
                }
                if (var6 == 19) {
                    var7 = (Statics.field289.field1151 >> 7) + Statics.field1288;
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

    @ObfuscatedName("cq.jq(Lhq;Ljl;IIZB)V")
    public static final void method1586(class228 arg0, class268 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3598;
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
            var7 = class237.field2964;
        }
        if (var6 != -1 && var7 != null) {
            method2235(var7, class88.method683(16748608) + arg1.field3583, var6, arg1.field3591, arg2, arg0.field2763, arg4);
        }
    }

    @ObfuscatedName("hs.jn(Lhq;IIB)V")
    public static final void method3881(class228 arg0, int arg1, int arg2) {
        if (arg0.field2861 == 1) {
            method2714(arg0.field2880, "", 24, 0, 0, arg0.field2763);
        }
        if (arg0.field2861 == 2 && !field1128) {
            int var3 = method1563(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2844 == null || arg0.field2844.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2844;
            }
            if (var5 != null) {
                method2714(var5, class88.method683(65280) + arg0.field2843, 25, 0, -1, arg0.field2763);
            }
        }
        if (arg0.field2861 == 3) {
            method2714(class237.field3121, "", 26, 0, 0, arg0.field2763);
        }
        if (arg0.field2861 == 4) {
            method2714(arg0.field2880, "", 28, 0, 0, arg0.field2763);
        }
        if (arg0.field2861 == 5) {
            method2714(arg0.field2880, "", 29, 0, 0, arg0.field2763);
        }
        if (arg0.field2861 == 6 && field1020 == null) {
            method2714(arg0.field2880, "", 30, 0, -1, arg0.field2763);
        }
        if (arg0.field2765 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2779; var8++) {
                for (int var9 = 0; var9 < arg0.field2778; var9++) {
                    int var10 = (arg0.field2776 + 32) * var9;
                    int var11 = (arg0.field2830 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2831[var7];
                        var11 += arg0.field2875[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field1021 = var7;
                        Statics.field2541 = arg0;
                        if (arg0.field2881[var7] > 0) {
                            class268 var12 = class268.method1985(arg0.field2881[var7] - 1);
                            if (field1041 == 1 && class229.method1025(method1563(arg0))) {
                                if (Statics.field449 != arg0.field2763 || Statics.field337 != var7) {
                                    method2714(class237.field3056, field1010 + " " + class88.field1316 + " " + class88.method683(16748608) + var12.field3583, 31, var12.field3591, var7, arg0.field2763);
                                }
                            } else if (!field1128 || !class229.method1025(method1563(arg0))) {
                                String[] var13 = var12.field3598;
                                if (field1027) {
                                    String[] var14 = method465(var13);
                                }
                                int var15 = -1;
                                if (field1004 && class51.field609[81]) {
                                    var15 = var12.method4373();
                                }
                                if (class229.method1025(method1563(arg0))) {
                                    for (int var16 = 4; var16 >= 3; var16--) {
                                        if (var15 != var16) {
                                            method1586(arg0, var12, var7, var16, false);
                                        }
                                    }
                                }
                                if (class229.method2925(method1563(arg0))) {
                                    method2714(class237.field3056, class88.method683(16748608) + var12.field3583, 38, var12.field3591, var7, arg0.field2763);
                                }
                                if (class229.method1025(method1563(arg0))) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var15 != var17) {
                                            method1586(arg0, var12, var7, var17, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method1586(arg0, var12, var7, var15, true);
                                    }
                                }
                                String[] var18 = arg0.field2834;
                                if (field1027) {
                                    var18 = method465(var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 39;
                                            }
                                            if (var19 == 1) {
                                                var20 = 40;
                                            }
                                            if (var19 == 2) {
                                                var20 = 41;
                                            }
                                            if (var19 == 3) {
                                                var20 = 42;
                                            }
                                            if (var19 == 4) {
                                                var20 = 43;
                                            }
                                            method2714(var18[var19], class88.method683(16748608) + var12.field3583, var20, var12.field3591, var7, arg0.field2763);
                                        }
                                    }
                                }
                                method2714(class237.field3113, class88.method683(16748608) + var12.field3583, 1005, var12.field3591, var7, arg0.field2763);
                            } else if ((Statics.field818 & 0x10) == 16) {
                                method2714(field1014, field1015 + " " + class88.field1316 + " " + class88.method683(16748608) + var12.field3583, 32, var12.field3591, var7, arg0.field2763);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2812) {
            return;
        }
        if (!field1128) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22;
                if (!Statics.method2929(method1563(arg0), var21) && arg0.field2863 == null) {
                    var22 = null;
                } else if (arg0.field2820 == null || arg0.field2820.length <= var21 || arg0.field2820[var21] == null || arg0.field2820[var21].trim().length() == 0) {
                    var22 = null;
                } else {
                    var22 = arg0.field2820[var21];
                }
                if (var22 != null) {
                    method2714(var22, arg0.field2854, 1007, var21 + 1, arg0.field2764, arg0.field2763);
                }
            }
            int var24 = method1563(arg0);
            int var25 = var24 >> 11 & 0x3F;
            String var26;
            if (var25 == 0) {
                var26 = null;
            } else if (arg0.field2844 == null || arg0.field2844.trim().length() == 0) {
                var26 = null;
            } else {
                var26 = arg0.field2844;
            }
            if (var26 != null) {
                method2714(var26, arg0.field2854, 25, 0, arg0.field2764, arg0.field2763);
            }
            for (int var28 = 4; var28 >= 0; var28--) {
                String var29;
                if (!Statics.method2929(method1563(arg0), var28) && arg0.field2863 == null) {
                    var29 = null;
                } else if (arg0.field2820 == null || arg0.field2820.length <= var28 || arg0.field2820[var28] == null || arg0.field2820[var28].trim().length() == 0) {
                    var29 = null;
                } else {
                    var29 = arg0.field2820[var28];
                }
                if (var29 != null) {
                    method2714(var29, arg0.field2854, 57, var28 + 1, arg0.field2764, arg0.field2763);
                }
            }
            int var31 = method1563(arg0);
            boolean var32 = (var31 & 0x1) != 0;
            if (var32) {
                method2714(class237.field3191, "", 30, 0, arg0.field2764, arg0.field2763);
            }
        } else if (class229.method2334(method1563(arg0)) && (Statics.field818 & 0x20) == 32) {
            method2714(field1014, field1015 + " " + class88.field1316 + " " + arg0.field2854, 58, 0, arg0.field2764, arg0.field2763);
        }
    }

    @ObfuscatedName("aj.jd(IIIIIIII)V")
    public static final void method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class228.method4526(arg0)) {
            method229(Statics.field2754[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ad.ji([Lhq;IIIIIIIB)V")
    public static final void method229(class228[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class228 var9 = arg0[var8];
            if (var9 != null && (!var9.field2812 || var9.field2765 == 0 || var9.field2891 || method1563(var9) != 0 || field1030 == var9 || var9.field2862 == 1338) && var9.field2782 == arg1 && (!var9.field2812 || !method144(var9))) {
                int var10 = var9.field2757 + arg6;
                int var11 = var9.field2825 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2765 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2765 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2778 + var10;
                    int var19 = var9.field2779 + var11;
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
                    int var22 = var9.field2778 + var10;
                    int var23 = var9.field2779 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1029 == var9) {
                    field1037 = true;
                    field1096 = var10;
                    field1039 = var11;
                }
                if (!var9.field2812 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field705;
                    int var25 = class60.field706;
                    if (class60.field711 != 0) {
                        var24 = class60.field710;
                        var25 = class60.field714;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2862 == 1337) {
                        if (!field882 && !field994 && var26) {
                            method486(var24, var25, var12, var13);
                        }
                    } else if (var9.field2862 == 1338) {
                        method2697(var9, var10, var11);
                    } else {
                        if (var9.field2862 == 1400) {
                            Statics.field1688.method5003(class60.field705, class60.field706, var26, var10, var11, var9.field2778, var9.field2779);
                        }
                        if (!field994 && var26) {
                            if (var9.field2862 == 1400) {
                                Statics.field1688.method5083(var10, var11, var9.field2778, var9.field2779, var24, var25);
                            } else {
                                method3881(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2765 == 0) {
                            if (!var9.field2812 && method144(var9) && Statics.field240 != var9) {
                                continue;
                            }
                            method229(arg0, var9.field2763, var12, var13, var14, var15, var10 - var9.field2784, var11 - var9.field2867);
                            if (var9.field2887 != null) {
                                method229(var9.field2887, var9.field2763, var12, var13, var14, var15, var10 - var9.field2784, var11 - var9.field2867);
                            }
                            class68 var27 = (class68) field1017.method3416((long) var9.field2763);
                            if (var27 != null) {
                                if (var27.field790 == 0 && class60.field705 >= var12 && class60.field706 >= var13 && class60.field705 < var14 && class60.field706 < var15 && !field994 && !field912) {
                                    for (class69 var28 = (class69) field1055.method3492(); var28 != null; var28 = (class69) field1055.method3481()) {
                                        if (var28.field795) {
                                            var28.method3474();
                                            var28.field797.field2888 = false;
                                        }
                                    }
                                    if (Statics.field556 == 0) {
                                        field1029 = null;
                                        field1030 = null;
                                    }
                                    if (!field994) {
                                        method4460();
                                        field1000[0] = class237.field3063;
                                        field1001[0] = "";
                                        field1125[0] = 1006;
                                        field933[0] = false;
                                        field1081 = 1;
                                    }
                                }
                                method481(var27.field791, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2812) {
                            if (var9.field2896) {
                                if (class60.field705 >= var12 && class60.field706 >= var13 && class60.field705 < var14 && class60.field706 < var15) {
                                    for (class69 var29 = (class69) field1055.method3492(); var29 != null; var29 = (class69) field1055.method3481()) {
                                        if (var29.field795) {
                                            var29.method3474();
                                            var29.field797.field2888 = false;
                                        }
                                    }
                                    if (Statics.field556 == 0) {
                                        field1029 = null;
                                        field1030 = null;
                                    }
                                    if (!field994) {
                                        method4460();
                                        field1000[0] = class237.field3063;
                                        field1001[0] = "";
                                        field1125[0] = 1006;
                                        field933[0] = false;
                                        field1081 = 1;
                                    }
                                }
                            } else if (var9.field2804 && class60.field705 >= var12 && class60.field706 >= var13 && class60.field705 < var14 && class60.field706 < var15) {
                                for (class69 var30 = (class69) field1055.method3492(); var30 != null; var30 = (class69) field1055.method3481()) {
                                    if (var30.field795 && var30.field797.field2864 == var30.field805) {
                                        var30.method3474();
                                    }
                                }
                            }
                            boolean var31;
                            if (class60.field705 >= var12 && class60.field706 >= var13 && class60.field705 < var14 && class60.field706 < var15) {
                                var31 = true;
                            } else {
                                var31 = false;
                            }
                            boolean var32 = false;
                            if ((class60.field704 == 1 || !Statics.field565 && class60.field704 == 4) && var31) {
                                var32 = true;
                            }
                            boolean var33 = false;
                            if ((class60.field711 == 1 || !Statics.field565 && class60.field711 == 4) && class60.field710 >= var12 && class60.field714 >= var13 && class60.field710 < var14 && class60.field714 < var15) {
                                var33 = true;
                            }
                            if (var33) {
                                method2711(var9, class60.field710 - var10, class60.field714 - var11);
                            }
                            if (var9.field2862 == 1400) {
                                Statics.field1688.method5152(class60.field705, class60.field706, var31 & var32, var31 & var33);
                            }
                            if (field1029 != null && field1029 != var9 && var31 && class229.method3888(method1563(var9))) {
                                field1033 = var9;
                            }
                            if (field1030 == var9) {
                                field1034 = true;
                                field1035 = var10;
                                field1036 = var11;
                            }
                            if (var9.field2891) {
                                if (var31 && field1054 != 0 && var9.field2864 != null) {
                                    class69 var34 = new class69();
                                    var34.field795 = true;
                                    var34.field797 = var9;
                                    var34.field794 = field1054;
                                    var34.field805 = var9.field2864;
                                    field1055.method3482(var34);
                                }
                                if (field1029 != null || Statics.field2041 != null || field994) {
                                    var33 = false;
                                    var32 = false;
                                    var31 = false;
                                }
                                if (!var9.field2852 && var33) {
                                    var9.field2852 = true;
                                    if (var9.field2845 != null) {
                                        class69 var35 = new class69();
                                        var35.field795 = true;
                                        var35.field797 = var9;
                                        var35.field796 = class60.field710 - var10;
                                        var35.field794 = class60.field714 - var11;
                                        var35.field805 = var9.field2845;
                                        field1055.method3482(var35);
                                    }
                                }
                                if (var9.field2852 && var32 && var9.field2846 != null) {
                                    class69 var36 = new class69();
                                    var36.field795 = true;
                                    var36.field797 = var9;
                                    var36.field796 = class60.field705 - var10;
                                    var36.field794 = class60.field706 - var11;
                                    var36.field805 = var9.field2846;
                                    field1055.method3482(var36);
                                }
                                if (var9.field2852 && !var32) {
                                    var9.field2852 = false;
                                    if (var9.field2855 != null) {
                                        class69 var37 = new class69();
                                        var37.field795 = true;
                                        var37.field797 = var9;
                                        var37.field796 = class60.field705 - var10;
                                        var37.field794 = class60.field706 - var11;
                                        var37.field805 = var9.field2855;
                                        field1057.method3482(var37);
                                    }
                                }
                                if (var32 && var9.field2848 != null) {
                                    class69 var38 = new class69();
                                    var38.field795 = true;
                                    var38.field797 = var9;
                                    var38.field796 = class60.field705 - var10;
                                    var38.field794 = class60.field706 - var11;
                                    var38.field805 = var9.field2848;
                                    field1055.method3482(var38);
                                }
                                if (!var9.field2888 && var31) {
                                    var9.field2888 = true;
                                    if (var9.field2849 != null) {
                                        class69 var39 = new class69();
                                        var39.field795 = true;
                                        var39.field797 = var9;
                                        var39.field796 = class60.field705 - var10;
                                        var39.field794 = class60.field706 - var11;
                                        var39.field805 = var9.field2849;
                                        field1055.method3482(var39);
                                    }
                                }
                                if (var9.field2888 && var31 && var9.field2827 != null) {
                                    class69 var40 = new class69();
                                    var40.field795 = true;
                                    var40.field797 = var9;
                                    var40.field796 = class60.field705 - var10;
                                    var40.field794 = class60.field706 - var11;
                                    var40.field805 = var9.field2827;
                                    field1055.method3482(var40);
                                }
                                if (var9.field2888 && !var31) {
                                    var9.field2888 = false;
                                    if (var9.field2851 != null) {
                                        class69 var41 = new class69();
                                        var41.field795 = true;
                                        var41.field797 = var9;
                                        var41.field796 = class60.field705 - var10;
                                        var41.field794 = class60.field706 - var11;
                                        var41.field805 = var9.field2851;
                                        field1057.method3482(var41);
                                    }
                                }
                                if (var9.field2780 != null) {
                                    class69 var42 = new class69();
                                    var42.field797 = var9;
                                    var42.field805 = var9.field2780;
                                    field1056.method3482(var42);
                                }
                                if (var9.field2856 != null && field1043 > var9.field2841) {
                                    if (var9.field2770 == null || field1043 - var9.field2841 > 32) {
                                        class69 var47 = new class69();
                                        var47.field797 = var9;
                                        var47.field805 = var9.field2856;
                                        field1055.method3482(var47);
                                    } else {
                                        label556: for (int var43 = var9.field2841; var43 < field1043; var43++) {
                                            int var44 = field985[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var9.field2770.length; var45++) {
                                                if (var9.field2770[var45] == var44) {
                                                    class69 var46 = new class69();
                                                    var46.field797 = var9;
                                                    var46.field805 = var9.field2856;
                                                    field1055.method3482(var46);
                                                    break label556;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2841 = field1043;
                                }
                                if (var9.field2878 != null && field1045 > var9.field2892) {
                                    if (var9.field2859 == null || field1045 - var9.field2892 > 32) {
                                        class69 var52 = new class69();
                                        var52.field797 = var9;
                                        var52.field805 = var9.field2878;
                                        field1055.method3482(var52);
                                    } else {
                                        label532: for (int var48 = var9.field2892; var48 < field1045; var48++) {
                                            int var49 = field941[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2859.length; var50++) {
                                                if (var9.field2859[var50] == var49) {
                                                    class69 var51 = new class69();
                                                    var51.field797 = var9;
                                                    var51.field805 = var9.field2878;
                                                    field1055.method3482(var51);
                                                    break label532;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2892 = field1045;
                                }
                                if (var9.field2769 != null && field1046 > var9.field2832) {
                                    if (var9.field2840 == null || field1046 - var9.field2832 > 32) {
                                        class69 var57 = new class69();
                                        var57.field797 = var9;
                                        var57.field805 = var9.field2769;
                                        field1055.method3482(var57);
                                    } else {
                                        label508: for (int var53 = var9.field2832; var53 < field1046; var53++) {
                                            int var54 = field1094[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2840.length; var55++) {
                                                if (var9.field2840[var55] == var54) {
                                                    class69 var56 = new class69();
                                                    var56.field797 = var9;
                                                    var56.field805 = var9.field2769;
                                                    field1055.method3482(var56);
                                                    break label508;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2832 = field1046;
                                }
                                if (field998 > var9.field2890 && var9.field2877 != null) {
                                    class69 var58 = new class69();
                                    var58.field797 = var9;
                                    var58.field805 = var9.field2877;
                                    field1055.method3482(var58);
                                }
                                if (field881 > var9.field2890 && var9.field2756 != null) {
                                    class69 var59 = new class69();
                                    var59.field797 = var9;
                                    var59.field805 = var9.field2756;
                                    field1055.method3482(var59);
                                }
                                if (field1050 > var9.field2890 && var9.field2835 != null) {
                                    class69 var60 = new class69();
                                    var60.field797 = var9;
                                    var60.field805 = var9.field2835;
                                    field1055.method3482(var60);
                                }
                                if (field1051 > var9.field2890 && var9.field2873 != null) {
                                    class69 var61 = new class69();
                                    var61.field797 = var9;
                                    var61.field805 = var9.field2873;
                                    field1055.method3482(var61);
                                }
                                if (field1052 > var9.field2890 && var9.field2874 != null) {
                                    class69 var62 = new class69();
                                    var62.field797 = var9;
                                    var62.field805 = var9.field2874;
                                    field1055.method3482(var62);
                                }
                                if (field952 > var9.field2890 && var9.field2860 != null) {
                                    class69 var63 = new class69();
                                    var63.field797 = var9;
                                    var63.field805 = var9.field2860;
                                    field1055.method3482(var63);
                                }
                                var9.field2890 = field953;
                                if (var9.field2866 != null) {
                                    for (int var64 = 0; var64 < field1077; var64++) {
                                        class69 var65 = new class69();
                                        var65.field797 = var9;
                                        var65.field801 = field1079[var64];
                                        var65.field802 = field877[var64];
                                        var65.field805 = var9.field2866;
                                        field1055.method3482(var65);
                                    }
                                }
                            }
                        }
                        if (!var9.field2812 && field1029 == null && Statics.field2041 == null && !field994) {
                            if ((var9.field2850 >= 0 || var9.field2810 != 0) && class60.field705 >= var12 && class60.field706 >= var13 && class60.field705 < var14 && class60.field706 < var15) {
                                if (var9.field2850 >= 0) {
                                    Statics.field240 = arg0[var9.field2850];
                                } else {
                                    Statics.field240 = var9;
                                }
                            }
                            if (var9.field2765 == 8 && class60.field705 >= var12 && class60.field706 >= var13 && class60.field705 < var14 && class60.field706 < var15) {
                                Statics.field1666 = var9;
                            }
                            if (var9.field2787 > var9.field2779) {
                                int var66 = var9.field2778 + var10;
                                int var67 = var9.field2779;
                                int var68 = var9.field2787;
                                int var69 = class60.field705;
                                int var70 = class60.field706;
                                if (field937) {
                                    field938 = 32;
                                } else {
                                    field938 = 0;
                                }
                                field937 = false;
                                if (class60.field704 == 1 || !Statics.field565 && class60.field704 == 4) {
                                    if (var69 >= var66 && var69 < var66 + 16 && var70 >= var11 && var70 < var11 + 16) {
                                        var9.field2867 -= 4;
                                        method211(var9);
                                    } else if (var69 >= var66 && var69 < var66 + 16 && var70 >= var11 + var67 - 16 && var70 < var11 + var67) {
                                        var9.field2867 += 4;
                                        method211(var9);
                                    } else if (var69 >= var66 - field938 && var69 < field938 + var66 + 16 && var70 >= var11 + 16 && var70 < var11 + var67 - 16) {
                                        int var71 = (var67 - 32) * var67 / var68;
                                        if (var71 < 8) {
                                            var71 = 8;
                                        }
                                        int var72 = var70 - var11 - 16 - var71 / 2;
                                        int var73 = var67 - 32 - var71;
                                        var9.field2867 = (var68 - var67) * var72 / var73;
                                        method211(var9);
                                        field937 = true;
                                    }
                                }
                                if (field1054 != 0) {
                                    int var74 = var9.field2778;
                                    if (var69 >= var66 - var74 && var70 >= var11 && var69 < var66 + 16 && var70 <= var11 + var67) {
                                        var9.field2867 += field1054 * 45;
                                        method211(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.jl([Lhq;II)V")
    public static final void method665(class228[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class228 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2765 == 0) {
                    if (var3.field2887 != null) {
                        method665(var3.field2887, arg1);
                    }
                    class68 var4 = (class68) field1017.method3416((long) var3.field2763);
                    if (var4 != null) {
                        int var5 = var4.field791;
                        if (class228.method4526(var5)) {
                            method665(Statics.field2754[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2879 != null) {
                    class69 var6 = new class69();
                    var6.field797 = var3;
                    var6.field805 = var3.field2879;
                    class83.method1505(var6);
                }
                if (arg1 == 1 && var3.field2871 != null) {
                    if (var3.field2764 >= 0) {
                        class228 var7 = class228.method2725(var3.field2763);
                        if (var7 == null || var7.field2887 == null || var3.field2764 >= var7.field2887.length || var7.field2887[var3.field2764] != var3) {
                            continue;
                        }
                    }
                    class69 var8 = new class69();
                    var8.field797 = var3;
                    var8.field805 = var3.field2871;
                    class83.method1505(var8);
                }
            }
        }
    }

    @ObfuscatedName("ed.jt(Lhq;IIS)V")
    public static final void method2711(class228 arg0, int arg1, int arg2) {
        if (field1029 != null || field994 || arg0 == null || method3897(arg0) == null) {
            return;
        }
        field1029 = arg0;
        field1030 = method3897(arg0);
        field926 = arg1;
        field1002 = arg2;
        Statics.field556 = 0;
        field1040 = false;
        int var3 = method3898();
        if (var3 == -1) {
            return;
        }
        Statics.field1456 = new class89();
        Statics.field1456.field1321 = field962[var3];
        Statics.field1456.field1324 = field958[var3];
        Statics.field1456.field1323 = field1125[var3];
        Statics.field1456.field1322 = field999[var3];
        Statics.field1456.field1325 = field1000[var3];
    }

    @ObfuscatedName("client.jh(I)V")
    public final void method1229() {
        method211(field1029);
        Statics.field556++;
        if (field1037 && field1034) {
            int var1 = class60.field705;
            int var2 = class60.field706;
            int var3 = var1 - field926;
            int var4 = var2 - field1002;
            if (var3 < field1035) {
                var3 = field1035;
            }
            if (field1029.field2778 + var3 > field1035 + field1030.field2778) {
                var3 = field1035 + field1030.field2778 - field1029.field2778;
            }
            if (var4 < field1036) {
                var4 = field1036;
            }
            if (field1029.field2779 + var4 > field1036 + field1030.field2779) {
                var4 = field1036 + field1030.field2779 - field1029.field2779;
            }
            int var5 = var3 - field1096;
            int var6 = var4 - field1039;
            int var7 = field1029.field2839;
            if (Statics.field556 > field1029.field2822 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1040 = true;
            }
            int var8 = field1030.field2784 + (var3 - field1035);
            int var9 = field1030.field2867 + (var4 - field1036);
            if (field1029.field2821 != null && field1040) {
                class69 var10 = new class69();
                var10.field797 = field1029;
                var10.field796 = var8;
                var10.field794 = var9;
                var10.field805 = field1029.field2821;
                class83.method1505(var10);
            }
            if (class60.field704 == 0) {
                if (field1040) {
                    if (field1029.field2853 != null) {
                        class69 var11 = new class69();
                        var11.field797 = field1029;
                        var11.field796 = var8;
                        var11.field794 = var9;
                        var11.field798 = field1033;
                        var11.field805 = field1029.field2853;
                        class83.method1505(var11);
                    }
                    if (field1033 != null && method2773(field1029) != null) {
                        class175 var12 = class175.method3892(class172.field2341, field916.field1463);
                        var12.field2451.method3066(field1033.field2763);
                        var12.field2451.method3056(field1029.field2764);
                        var12.field2451.method3055(field1033.field2883);
                        var12.field2451.method3055(field1033.field2764);
                        var12.field2451.method3056(field1029.field2883);
                        var12.field2451.method3065(field1029.field2763);
                        field916.method1747(var12);
                    }
                } else if (this.method1386()) {
                    this.method1090(field926 + field1096, field1039 + field1002);
                } else if (field1081 > 0) {
                    int var13 = field926 + field1096;
                    int var14 = field1039 + field1002;
                    method576(Statics.field1456, var13, var14);
                    Statics.field1456 = null;
                }
                field1029 = null;
            }
        } else if (Statics.field556 > 1) {
            field1029 = null;
        }
    }

    @ObfuscatedName("at.jy(Lhq;I)V")
    public static void method211(class228 arg0) {
        if (field1060 == arg0.field2895) {
            field1042[arg0.field2894] = true;
        }
    }

    @ObfuscatedName("ft.js(I)V")
    public static void method2841() {
        for (class68 var0 = (class68) field1017.method3419(); var0 != null; var0 = (class68) field1017.method3415()) {
            int var1 = var0.field791;
            if (class228.method4526(var1)) {
                boolean var2 = true;
                class228[] var3 = Statics.field2754[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2812;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2597;
                    class228 var6 = class228.method2725(var5);
                    if (var6 != null) {
                        method211(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("io.jf(Lhq;B)Lhq;")
    public static class228 method3897(class228 arg0) {
        class228 var1 = method2773(arg0);
        if (var1 == null) {
            var1 = arg0.field2838;
        }
        return var1;
    }

    @ObfuscatedName("ah.jk([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method465(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("m.jz(IB)V")
    public static final void method123(int arg0) {
        if (!class228.method4526(arg0)) {
            return;
        }
        class228[] var1 = Statics.field2754[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class228 var3 = var1[var2];
            if (var3 != null) {
                var3.field2885 = 0;
                var3.field2886 = 0;
            }
        }
    }

    @ObfuscatedName("ii.jj([Lhq;II)V")
    public static final void method3905(class228[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class228 var3 = arg0[var2];
            if (var3 != null && var3.field2782 == arg1 && (!var3.field2812 || !method144(var3))) {
                if (var3.field2765 == 0) {
                    if (!var3.field2812 && method144(var3) && Statics.field240 != var3) {
                        continue;
                    }
                    method3905(arg0, var3.field2763);
                    if (var3.field2887 != null) {
                        method3905(var3.field2887, var3.field2763);
                    }
                    class68 var4 = (class68) field1017.method3416((long) var3.field2763);
                    if (var4 != null) {
                        int var5 = var4.field791;
                        if (class228.method4526(var5)) {
                            method3905(Statics.field2754[var5], -1);
                        }
                    }
                }
                if (var3.field2765 == 6) {
                    if (var3.field2750 != -1 || var3.field2811 != -1) {
                        boolean var6 = method1110(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2811;
                        } else {
                            var7 = var3.field2750;
                        }
                        if (var7 != -1) {
                            class272 var8 = class272.method579(var7);
                            var3.field2886 += field945;
                            while (var3.field2886 > var8.field3690[var3.field2885]) {
                                var3.field2886 -= var8.field3690[var3.field2885];
                                var3.field2885++;
                                if (var3.field2885 >= var8.field3688.length) {
                                    var3.field2885 -= var8.field3685;
                                    if (var3.field2885 < 0 || var3.field2885 >= var8.field3688.length) {
                                        var3.field2885 = 0;
                                    }
                                }
                                method211(var3);
                            }
                        }
                    }
                    if (var3.field2819 != 0 && !var3.field2812) {
                        int var9 = var3.field2819 >> 16;
                        int var10 = var3.field2819 << 16 >> 16;
                        int var11 = field945 * var9;
                        int var12 = field945 * var10;
                        var3.field2814 = var3.field2814 + var11 & 0x7FF;
                        var3.field2815 = var3.field2815 + var12 & 0x7FF;
                        method211(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.jw(II)V")
    public static final void method32(int arg0) {
        method2841();
        for (class82 var1 = (class82) class82.field1248.method3492(); var1 != null; var1 = (class82) class82.field1248.method3481()) {
            if (var1.field1256 != null) {
                var1.method1513();
            }
        }
        int var2 = class253.method1603(arg0).field3376;
        if (var2 == 0) {
            return;
        }
        int var3 = class223.field2726[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class136.method2447(0.9D);
                ((class125) Statics.field1925).method2215(0.9D);
            }
            if (var3 == 2) {
                class136.method2447(0.8D);
                ((class125) Statics.field1925).method2215(0.8D);
            }
            if (var3 == 3) {
                class136.method2447(0.7D);
                ((class125) Statics.field1925).method2215(0.7D);
            }
            if (var3 == 4) {
                class136.method2447(0.6D);
                ((class125) Statics.field1925).method2215(0.6D);
            }
            class268.method616();
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
            if (field1091 != var4) {
                if (field1091 == 0 && field1092 != -1) {
                    class215.method1490(Statics.field355, field1092, 0, var4, false);
                    field992 = false;
                } else if (var4 == 0) {
                    Statics.field2631.method3576();
                    class215.field2632 = 1;
                    Statics.field2633 = null;
                    field992 = false;
                } else if (class215.field2632 == 0) {
                    Statics.field2631.method3571(var4);
                } else {
                    Statics.field478 = var4;
                }
                field1091 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field904 = 127;
            }
            if (var3 == 1) {
                field904 = 96;
            }
            if (var3 == 2) {
                field904 = 64;
            }
            if (var3 == 3) {
                field904 = 32;
            }
            if (var3 == 4) {
                field904 = 0;
            }
        }
        if (var2 == 5) {
            field993 = var3;
        }
        if (var2 == 6) {
            field1018 = var3;
        }
        if (var2 == 9) {
            field1019 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1095 = 127;
            }
            if (var3 == 1) {
                field1095 = 96;
            }
            if (var3 == 2) {
                field1095 = 64;
            }
            if (var3 == 3) {
                field1095 = 32;
            }
            if (var3 == 4) {
                field1095 = 0;
            }
        }
        if (var2 == 17) {
            field1048 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class91[] var5 = new class91[] { class91.field1332, class91.field1335, class91.field1334, class91.field1331 };
            field899 = (class91) class180.method455(var5, var3);
            if (field899 == null) {
                field899 = class91.field1334;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field975 = -1;
            } else {
                field975 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class91[] var6 = new class91[] { class91.field1332, class91.field1335, class91.field1334, class91.field1331 };
        field947 = (class91) class180.method455(var6, var3);
        if (field947 == null) {
            field947 = class91.field1334;
        }
    }

    @ObfuscatedName("g.jg(Lhq;I)V")
    public static final void method158(class228 arg0) {
        int var1 = arg0.field2862;
        if (var1 == 324) {
            if (field1061 == -1) {
                field1061 = arg0.field2798;
                field1129 = arg0.field2799;
            }
            if (field1127.field2738) {
                arg0.field2798 = field1061;
            } else {
                arg0.field2798 = field1129;
            }
        } else if (var1 == 325) {
            if (field1061 == -1) {
                field1061 = arg0.field2798;
                field1129 = arg0.field2799;
            }
            if (field1127.field2738) {
                arg0.field2798 = field1129;
            } else {
                arg0.field2798 = field1061;
            }
        } else if (var1 == 327) {
            arg0.field2814 = 150;
            arg0.field2815 = (int) (Math.sin((double) field883 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2889 = 5;
            arg0.field2807 = 0;
        } else if (var1 == 328) {
            arg0.field2814 = 150;
            arg0.field2815 = (int) (Math.sin((double) field883 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2889 = 5;
            arg0.field2807 = 1;
        }
    }

    @ObfuscatedName("bo.jv(IIII)Lbp;")
    public static final class68 method935(int arg0, int arg1, int arg2) {
        class68 var3 = new class68();
        var3.field791 = arg1;
        var3.field790 = arg2;
        field1017.method3417(var3, (long) arg0);
        method123(arg1);
        class228 var4 = class228.method2725(arg0);
        method211(var4);
        if (field1020 != null) {
            method211(field1020);
            field1020 = null;
        }
        method682();
        method2835(Statics.field2754[arg0 >> 16], var4, false);
        class83.method41(arg1);
        if (field1016 != -1) {
            int var5 = field1016;
            if (class228.method4526(var5)) {
                method665(Statics.field2754[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("x.jx(Lbp;ZI)V")
    public static final void method132(class68 arg0, boolean arg1) {
        int var2 = arg0.field791;
        int var3 = (int) arg0.field2597;
        arg0.method3474();
        if (arg1 && var2 != -1 && Statics.field3410[var2]) {
            Statics.field2755.method3930(var2);
            if (Statics.field2754[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2754[var2].length; var5++) {
                    if (Statics.field2754[var2][var5] != null) {
                        if (Statics.field2754[var2][var5].field2765 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2754[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2754[var2] = null;
                }
                Statics.field3410[var2] = false;
            }
        }
        for (class210 var6 = (class210) field1058.method3419(); var6 != null; var6 = (class210) field1058.method3415()) {
            if ((long) var2 == (var6.field2597 >> 48 & 0xFFFFL)) {
                var6.method3474();
            }
        }
        class228 var7 = class228.method2725(var3);
        if (var7 != null) {
            method211(var7);
        }
        method682();
        if (field1016 != -1) {
            int var8 = field1016;
            if (class228.method4526(var8)) {
                method665(Statics.field2754[var8], 1);
            }
        }
    }

    @ObfuscatedName("cf.jp(Lhq;I)Z")
    public static final boolean method1604(class228 arg0) {
        int var1 = arg0.field2862;
        if (var1 == 205) {
            field1085 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1127.method3794(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1127.method3795(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1127.method3796(false);
        }
        if (var1 == 325) {
            field1127.method3796(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method3892(class172.field2379, field916.field1463);
            field1127.method3797(var6.field2451);
            field916.method1747(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gv.jr(Lhq;IIII)V")
    public static final void method3239(class228 arg0, int arg1, int arg2, int arg3) {
        method4524();
        class222 var4 = arg0.method3835(false);
        if (var4 == null) {
            return;
        }
        class295.method4810(arg1, arg2, var4.field2722 + arg1, var4.field2719 + arg2);
        if (field1090 == 2 || field1090 == 5) {
            class295.method4761(arg1, arg2, 0, var4.field2721, var4.field2720);
        } else {
            int var5 = field940 & 0x7FF;
            int var6 = Statics.field289.field1155 / 32 + 48;
            int var7 = 464 - Statics.field289.field1151 / 32;
            Statics.field2952.method4870(arg1, arg2, var4.field2722, var4.field2719, var6, var7, var5, 256, var4.field2721, var4.field2720);
            for (int var8 = 0; var8 < field1084; var8++) {
                int var9 = field1089[var8] * 4 + 2 - Statics.field289.field1155 / 32;
                int var10 = field1086[var8] * 4 + 2 - Statics.field289.field1151 / 32;
                method2518(arg1, arg2, var9, var10, field1087[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class205 var13 = field986[Statics.field226][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field289.field1155 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field289.field1151 / 32;
                        method2518(arg1, arg2, var14, var15, Statics.field2094[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field1049; var16++) {
                class86 var17 = field1110[field913[var16]];
                if (var17 != null && var17.method1044()) {
                    class270 var18 = var17.field1298;
                    if (var18 != null && var18.field3664 != null) {
                        var18 = var18.method4447();
                    }
                    if (var18 != null && var18.field3655 && var18.field3667) {
                        int var19 = var17.field1155 / 32 - Statics.field289.field1155 / 32;
                        int var20 = var17.field1151 / 32 - Statics.field289.field1151 / 32;
                        method2518(arg1, arg2, var19, var20, Statics.field2094[1], var4);
                    }
                }
            }
            int var21 = class95.field1406;
            int[] var22 = class95.field1410;
            for (int var23 = 0; var23 < var21; var23++) {
                class74 var24 = field900[var22[var23]];
                if (var24 != null && var24.method1044() && !var24.field856 && Statics.field289 != var24) {
                    int var25 = var24.field1155 / 32 - Statics.field289.field1155 / 32;
                    int var26 = var24.field1151 / 32 - Statics.field289.field1151 / 32;
                    boolean var27 = false;
                    if (Statics.method1652(var24.field860, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field3303; var29++) {
                        if (var24.field860.equals(Statics.field1559[var29].field869)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field289.field855 != 0 && var24.field855 != 0 && Statics.field289.field855 == var24.field855) {
                        var30 = true;
                    }
                    if (var27) {
                        method2518(arg1, arg2, var25, var26, Statics.field2094[3], var4);
                    } else if (var30) {
                        method2518(arg1, arg2, var25, var26, Statics.field2094[4], var4);
                    } else if (var28) {
                        method2518(arg1, arg2, var25, var26, Statics.field2094[5], var4);
                    } else {
                        method2518(arg1, arg2, var25, var26, Statics.field2094[2], var4);
                    }
                }
            }
            if (field943 != 0 && field883 % 20 < 10) {
                if (field943 == 1 && field905 >= 0 && field905 < field1110.length) {
                    class86 var31 = field1110[field905];
                    if (var31 != null) {
                        int var32 = var31.field1155 / 32 - Statics.field289.field1155 / 32;
                        int var33 = var31.field1151 / 32 - Statics.field289.field1151 / 32;
                        method49(arg1, arg2, var32, var33, Statics.field27[1], var4);
                    }
                }
                if (field943 == 2) {
                    int var34 = field894 * 4 - Statics.field2458 * 4 + 2 - Statics.field289.field1155 / 32;
                    int var35 = field1074 * 4 - Statics.field1288 * 4 + 2 - Statics.field289.field1151 / 32;
                    method49(arg1, arg2, var34, var35, Statics.field27[1], var4);
                }
                if (field943 == 10 && field878 >= 0 && field878 < field900.length) {
                    class74 var36 = field900[field878];
                    if (var36 != null) {
                        int var37 = var36.field1155 / 32 - Statics.field289.field1155 / 32;
                        int var38 = var36.field1151 / 32 - Statics.field289.field1151 / 32;
                        method49(arg1, arg2, var37, var38, Statics.field27[1], var4);
                    }
                }
            }
            if (field1013 != 0) {
                int var39 = field1013 * 4 + 2 - Statics.field289.field1155 / 32;
                int var40 = field946 * 4 + 2 - Statics.field289.field1151 / 32;
                method2518(arg1, arg2, var39, var40, Statics.field27[0], var4);
            }
            if (!Statics.field289.field856) {
                class295.method4752(var4.field2722 / 2 + arg1 - 1, var4.field2719 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1062[arg3] = true;
    }

    @ObfuscatedName("db.ju(Lhq;IIII)V")
    public static final void method1955(class228 arg0, int arg1, int arg2, int arg3) {
        class222 var4 = arg0.method3835(false);
        if (var4 == null) {
            return;
        }
        if (field1090 < 3) {
            Statics.field3380.method4870(arg1, arg2, var4.field2722, var4.field2719, 25, 25, field940, 256, var4.field2721, var4.field2720);
        } else {
            class295.method4761(arg1, arg2, 0, var4.field2721, var4.field2720);
        }
    }

    @ObfuscatedName("u.jm(IIIILkg;Lhw;I)V")
    public static final void method49(int arg0, int arg1, int arg2, int arg3, class299 arg4, class222 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2518(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field940 & 0x7FF;
        int var8 = class136.field1942[var7];
        int var9 = class136.field1922[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2722 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field15.method4937(arg5.field2722 / 2 + arg0 - var17 / 2 + var15, arg5.field2719 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ei.jb(IIIILkg;Lhw;B)V")
    public static final void method2518(int arg0, int arg1, int arg2, int arg3, class299 arg4, class222 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field940 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class136.field1942[var6];
        int var9 = class136.field1922[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4869(arg5.field2722 / 2 + var10 - arg4.field3856 / 2, arg5.field2719 / 2 - var11 - arg4.field3862 / 2, arg0, arg1, arg5.field2722, arg5.field2719, arg5.field2721, arg5.field2720);
        } else {
            arg4.method4859(arg5.field2722 / 2 + arg0 + var10 - arg4.field3856 / 2, arg5.field2719 / 2 + arg1 - var11 - arg4.field3862 / 2);
        }
    }

    @ObfuscatedName("ae.kz(Ljava/lang/String;B)Z")
    public static boolean method314(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class279.method311(arg0, Statics.field295);
        for (int var2 = 0; var2 < field1032; var2++) {
            class70 var3 = field1012[var2];
            if (var1.equalsIgnoreCase(class279.method311(var3.field809, Statics.field295))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class279.method311(var3.field808, Statics.field295))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bk.ke(Ljava/lang/String;I)V")
    public static final void method684(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field1121 < 200 || field978 == 1) || field1121 >= 400) {
            class97.method1495(30, "", class237.field3128);
            return;
        }
        String var1 = class279.method311(arg0, Statics.field295);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1121; var2++) {
            class66 var3 = field1123[var2];
            String var4 = class279.method311(var3.field782, Statics.field295);
            if (var4 != null && var4.equals(var1)) {
                class97.method1495(30, "", arg0 + class237.field3129);
                return;
            }
            if (var3.field776 != null) {
                String var5 = class279.method311(var3.field776, Statics.field295);
                if (var5 != null && var5.equals(var1)) {
                    class97.method1495(30, "", arg0 + class237.field3129);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field1032; var6++) {
            class70 var7 = field1012[var6];
            String var8 = class279.method311(var7.field809, Statics.field295);
            if (var8 != null && var8.equals(var1)) {
                class97.method1495(30, "", class237.field3134 + arg0 + class237.field3135);
                return;
            }
            if (var7.field808 != null) {
                String var9 = class279.method311(var7.field808, Statics.field295);
                if (var9 != null && var9.equals(var1)) {
                    class97.method1495(30, "", class237.field3134 + arg0 + class237.field3135);
                    return;
                }
            }
        }
        if (class279.method311(Statics.field289.field860, Statics.field295).equals(var1)) {
            class97.method1495(30, "", class237.field3204);
        } else {
            class175 var10 = class175.method3892(class172.field2423, field916.field1463);
            var10.field2451.method3157(class185.method166(arg0));
            var10.field2451.method3012(arg0);
            field916.method1747(var10);
        }
    }

    @ObfuscatedName("cu.kj(Ljava/lang/String;ZI)V")
    public static final void method1601(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1032 < 100 || field978 == 1) || field1032 >= 400) {
            class97.method1495(31, "", class237.field3130);
            return;
        }
        String var2 = class279.method311(arg0, Statics.field295);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1032; var3++) {
            class70 var4 = field1012[var3];
            String var5 = class279.method311(var4.field809, Statics.field295);
            if (var5 != null && var5.equals(var2)) {
                class97.method1495(31, "", arg0 + class237.field3131);
                return;
            }
            if (var4.field808 != null) {
                String var6 = class279.method311(var4.field808, Statics.field295);
                if (var6 != null && var6.equals(var2)) {
                    class97.method1495(31, "", arg0 + class237.field3131);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1121; var7++) {
            class66 var8 = field1123[var7];
            String var9 = class279.method311(var8.field782, Statics.field295);
            if (var9 != null && var9.equals(var2)) {
                class97.method1495(31, "", class237.field3122 + arg0 + class237.field3137);
                return;
            }
            if (var8.field776 != null) {
                String var10 = class279.method311(var8.field776, Statics.field295);
                if (var10 != null && var10.equals(var2)) {
                    class97.method1495(31, "", class237.field3122 + arg0 + class237.field3137);
                    return;
                }
            }
        }
        if (class279.method311(Statics.field289.field860, Statics.field295).equals(var2)) {
            class97.method1495(31, "", class237.field3133);
        } else {
            class175 var11 = class175.method3892(class172.field2332, field916.field1463);
            var11.field2451.method3157(class185.method166(arg0));
            var11.field2451.method3012(arg0);
            field916.method1747(var11);
        }
    }

    @ObfuscatedName("ao.kc(Ljava/lang/String;B)V")
    public static final void method527(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class279.method311(arg0, Statics.field295);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1032; var2++) {
            class70 var3 = field1012[var2];
            String var4 = var3.field809;
            String var5 = class279.method311(var4, Statics.field295);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1032--;
                for (int var7 = var2; var7 < field1032; var7++) {
                    field1012[var7] = field1012[var7 + 1];
                }
                field881 = field953;
                class175 var8 = class175.method3892(class172.field2417, field916.field1463);
                var8.field2451.method3157(class185.method166(arg0));
                var8.field2451.method3012(arg0);
                field916.method1747(var8);
                break;
            }
        }
    }

    @ObfuscatedName("ez.ku(Ljava/lang/String;II)V")
    public static final void method2749(String arg0, int arg1) {
        class175 var2 = class175.method3892(class172.field2385, field916.field1463);
        var2.field2451.method3157(class185.method166(arg0) + 1);
        var2.field2451.method3046(arg1);
        var2.field2451.method3012(arg0);
        field916.method1747(var2);
    }

    @ObfuscatedName("cs.ka(Lhq;I)I")
    public static int method1563(class228 arg0) {
        class210 var1 = (class210) field1058.method3416(((long) arg0.field2763 << 32) + (long) arg0.field2764);
        return var1 == null ? arg0.field2772 : var1.field2611;
    }

    @ObfuscatedName("ec.kx(Lhq;I)Lhq;")
    public static class228 method2773(class228 arg0) {
        int var1 = Statics.method4253(method1563(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class228.method2725(arg0.field2782);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("l.kb(Lhq;I)Z")
    public static boolean method144(class228 arg0) {
        if (field912) {
            if (method1563(arg0) != 0) {
                return false;
            }
            if (arg0.field2765 == 0) {
                return false;
            }
        }
        return arg0.field2783;
    }

    @ObfuscatedName("bm.kr(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1445(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field995 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field995 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field995 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field995 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field995 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field830 != null) {
            var3 = "/p=" + Statics.field830;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field972 + "/a=" + Statics.field313 + var3 + "/";
    }

    @ObfuscatedName("fz.kw(Ljava/lang/String;ZI)V")
    public static void method2951(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1330; var5++) {
            class268 var6 = class268.method1985(var5);
            if ((!arg1 || var6.field3572) && var6.field3607 == -1 && var6.field3583.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field243 = -1;
                    Statics.field2927 = null;
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
        Statics.field2927 = var3;
        Statics.field727 = 0;
        Statics.field243 = var4;
        String[] var9 = new String[Statics.field243];
        for (int var10 = 0; var10 < Statics.field243; var10++) {
            var9[var10] = class268.method1985(var3[var10]).field3583;
        }
        short[] var11 = Statics.field2927;
        class182.method240(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("d.km(IIII)V")
    public static void method13(int arg0, int arg1, int arg2) {
        class175 var3 = class175.method3892(class172.field2380, field916.field1463);
        var3.field2451.method3006(arg0);
        var3.field2451.method3047(arg2);
        var3.field2451.method3125(arg1);
        field916.method1747(var3);
    }
}

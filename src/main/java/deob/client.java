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

public final class client extends class60 implements class303 {

    @ObfuscatedName("client.w")
    public static class177[] field1048 = new class177[4];

    @ObfuscatedName("client.an")
    public static boolean field857 = true;

    @ObfuscatedName("client.bv")
    public static int field858 = 1;

    @ObfuscatedName("client.bw")
    public static int field859 = 0;

    @ObfuscatedName("client.ba")
    public static int field956 = 0;

    @ObfuscatedName("client.bh")
    public static boolean field856 = false;

    @ObfuscatedName("client.bf")
    public static boolean field863 = false;

    @ObfuscatedName("client.bu")
    public static int field864 = 0;

    @ObfuscatedName("client.by")
    public static int field873 = 0;

    @ObfuscatedName("client.be")
    public static boolean field866 = true;

    @ObfuscatedName("client.bs")
    public static int field867 = 0;

    @ObfuscatedName("client.bq")
    public static long field868 = -1L;

    @ObfuscatedName("client.bk")
    public static int field991 = -1;

    @ObfuscatedName("client.bm")
    public static int field949 = -1;

    @ObfuscatedName("client.bx")
    public static int field871 = -1;

    @ObfuscatedName("client.bo")
    public static boolean field1118 = true;

    @ObfuscatedName("client.bi")
    public static boolean field923 = false;

    @ObfuscatedName("client.bg")
    public static int field874 = 0;

    @ObfuscatedName("client.bd")
    public static int field875 = 0;

    @ObfuscatedName("client.bz")
    public static int field876 = 0;

    @ObfuscatedName("client.ca")
    public static int field1037 = 0;

    @ObfuscatedName("client.ct")
    public static int field1079 = 0;

    @ObfuscatedName("client.ck")
    public static int field879 = 0;

    @ObfuscatedName("client.cy")
    public static int field1075 = 0;

    @ObfuscatedName("client.cd")
    public static int field1015 = 0;

    @ObfuscatedName("client.cu")
    public static int field1124 = 0;

    @ObfuscatedName("client.cj")
    public static class90 field883 = class90.field1335;

    @ObfuscatedName("client.cm")
    public static class90 field884 = class90.field1335;

    @ObfuscatedName("client.cg")
    public static int field1021 = 0;

    @ObfuscatedName("client.ci")
    public static int field893 = 0;

    @ObfuscatedName("client.ce")
    public static int field887 = 0;

    @ObfuscatedName("client.dm")
    public static int field890 = 0;

    @ObfuscatedName("client.dv")
    public static int field891 = 0;

    @ObfuscatedName("client.dr")
    public static int field892 = 0;

    @ObfuscatedName("client.ds")
    public static int field1111 = 0;

    @ObfuscatedName("client.dx")
    public static int field895 = 0;

    @ObfuscatedName("client.dg")
    public static class159 field1042 = class159.field2154;

    @ObfuscatedName("client.dp")
    public static byte[] field897 = null;

    @ObfuscatedName("client.df")
    public static class85[] field898 = new class85[32768];

    @ObfuscatedName("client.db")
    public static int field899 = 0;

    @ObfuscatedName("client.dc")
    public static int[] field900 = new int[32768];

    @ObfuscatedName("client.dy")
    public static int field1040 = 0;

    @ObfuscatedName("client.eg")
    public static int[] field1025 = new int[250];

    @ObfuscatedName("client.ei")
    public static final class100 field903 = new class100();

    @ObfuscatedName("client.en")
    public static int field904 = 0;

    @ObfuscatedName("client.ev")
    public static boolean field905 = false;

    @ObfuscatedName("client.ez")
    public static boolean field906 = true;

    @ObfuscatedName("client.ej")
    public static class295 field1051 = new class295();

    @ObfuscatedName("client.ew")
    public static HashMap field908 = new HashMap();

    @ObfuscatedName("client.eb")
    public static int field909 = 0;

    @ObfuscatedName("client.ey")
    public static int field860 = 1;

    @ObfuscatedName("client.eh")
    public static int field911 = 0;

    @ObfuscatedName("client.ea")
    public static int field912 = 1;

    @ObfuscatedName("client.et")
    public static int field979 = 0;

    @ObfuscatedName("client.fs")
    public static boolean field915 = false;

    @ObfuscatedName("client.ff")
    public static int[][][] field916 = new int[4][13][13];

    @ObfuscatedName("client.fy")
    public static final int[] field1059 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fz")
    public static int field894 = 0;

    @ObfuscatedName("client.fe")
    public static int field919 = 2301979;

    @ObfuscatedName("client.fd")
    public static int field896 = 5063219;

    @ObfuscatedName("client.gn")
    public static int field921 = 3353893;

    @ObfuscatedName("client.gk")
    public static int field922 = 7759444;

    @ObfuscatedName("client.gg")
    public static boolean field928 = false;

    @ObfuscatedName("client.ge")
    public static int field1065 = 0;

    @ObfuscatedName("client.gs")
    public static int field881 = 128;

    @ObfuscatedName("client.gp")
    public static int field926 = 0;

    @ObfuscatedName("client.gx")
    public static int field914 = 0;

    @ObfuscatedName("client.gq")
    public static int field1117 = 0;

    @ObfuscatedName("client.gm")
    public static int field929 = 0;

    @ObfuscatedName("client.gh")
    public static int field930 = 0;

    @ObfuscatedName("client.gi")
    public static int field931 = 0;

    @ObfuscatedName("client.gw")
    public static int field932 = 50;

    @ObfuscatedName("client.gl")
    public static int field933 = 0;

    @ObfuscatedName("client.gu")
    public static int field934 = 0;

    @ObfuscatedName("client.gz")
    public static int field935 = 0;

    @ObfuscatedName("client.hc")
    public static int field936 = 12;

    @ObfuscatedName("client.hz")
    public static int field937 = 6;

    @ObfuscatedName("client.hf")
    public static int field1010 = 0;

    @ObfuscatedName("client.hw")
    public static boolean field939 = false;

    @ObfuscatedName("client.hj")
    public static int field940 = 0;

    @ObfuscatedName("client.hm")
    public static boolean field941 = false;

    @ObfuscatedName("client.hy")
    public static int field942 = 0;

    @ObfuscatedName("client.he")
    public static int field943 = 0;

    @ObfuscatedName("client.hg")
    public static int field963 = 50;

    @ObfuscatedName("client.hl")
    public static int[] field945 = new int[field963];

    @ObfuscatedName("client.hv")
    public static int[] field946 = new int[field963];

    @ObfuscatedName("client.ha")
    public static int[] field947 = new int[field963];

    @ObfuscatedName("client.hd")
    public static int[] field948 = new int[field963];

    @ObfuscatedName("client.hn")
    public static int[] field1074 = new int[field963];

    @ObfuscatedName("client.hh")
    public static int[] field985 = new int[field963];

    @ObfuscatedName("client.hq")
    public static int[] field951 = new int[field963];

    @ObfuscatedName("client.hs")
    public static String[] field952 = new String[field963];

    @ObfuscatedName("client.hk")
    public static int[][] field953 = new int[104][104];

    @ObfuscatedName("client.hr")
    public static int field954 = 0;

    @ObfuscatedName("client.hb")
    public static int field955 = -1;

    @ObfuscatedName("client.hx")
    public static int field865 = -1;

    @ObfuscatedName("client.hi")
    public static int field962 = 0;

    @ObfuscatedName("client.ht")
    public static int field958 = 0;

    @ObfuscatedName("client.hu")
    public static int field959 = 0;

    @ObfuscatedName("client.ho")
    public static int field960 = 0;

    @ObfuscatedName("client.hp")
    public static boolean field938 = true;

    @ObfuscatedName("client.iu")
    public static int field988 = 0;

    @ObfuscatedName("client.ir")
    public static int field910 = 0;

    @ObfuscatedName("client.ip")
    public static int field1081 = 0;

    @ObfuscatedName("client.if")
    public static int field965 = 0;

    @ObfuscatedName("client.il")
    public static int field1057 = 0;

    @ObfuscatedName("client.ib")
    public static int field1087 = 0;

    @ObfuscatedName("client.iq")
    public static boolean field1110 = false;

    @ObfuscatedName("client.in")
    public static int field969 = 0;

    @ObfuscatedName("client.ie")
    public static int field970 = 0;

    @ObfuscatedName("client.id")
    public static boolean field961 = true;

    @ObfuscatedName("client.it")
    public static String field1011 = null;

    @ObfuscatedName("client.ia")
    public static class73[] field972 = new class73[2048];

    @ObfuscatedName("client.io")
    public static int field1001 = -1;

    @ObfuscatedName("client.ii")
    public static int field974 = 0;

    @ObfuscatedName("client.iv")
    public static boolean field975 = true;

    @ObfuscatedName("client.jr")
    public static int field976 = 0;

    @ObfuscatedName("client.js")
    public static int field977 = 0;

    @ObfuscatedName("client.je")
    public static int[] field996 = new int[1000];

    @ObfuscatedName("client.jd")
    public static final int[] field869 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jc")
    public static String[] field980 = new String[8];

    @ObfuscatedName("client.jb")
    public static boolean[] field964 = new boolean[8];

    @ObfuscatedName("client.ja")
    public static int[] field982 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jq")
    public static int field983 = -1;

    @ObfuscatedName("client.ju")
    public static class218[][][] field984 = new class218[4][104][104];

    @ObfuscatedName("client.jg")
    public static class218 field1116 = new class218();

    @ObfuscatedName("client.jx")
    public static class218 field986 = new class218();

    @ObfuscatedName("client.jt")
    public static class218 field978 = new class218();

    @ObfuscatedName("client.jo")
    public static int[] field1121 = new int[25];

    @ObfuscatedName("client.jw")
    public static int[] field917 = new int[25];

    @ObfuscatedName("client.jz")
    public static int[] field918 = new int[25];

    @ObfuscatedName("client.jy")
    public static int field885 = 0;

    @ObfuscatedName("client.ji")
    public static boolean field992 = false;

    @ObfuscatedName("client.jk")
    public static int field993 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field994 = new int[500];

    @ObfuscatedName("client.kn")
    public static int[] field995 = new int[500];

    @ObfuscatedName("client.kl")
    public static int[] field872 = new int[500];

    @ObfuscatedName("client.kk")
    public static int[] field997 = new int[500];

    @ObfuscatedName("client.km")
    public static String[] field998 = new String[500];

    @ObfuscatedName("client.kh")
    public static String[] field999 = new String[500];

    @ObfuscatedName("client.kf")
    public static boolean[] field1000 = new boolean[500];

    @ObfuscatedName("client.ky")
    public static boolean field1095 = false;

    @ObfuscatedName("client.kg")
    public static boolean field1002 = false;

    @ObfuscatedName("client.ku")
    public static boolean field1003 = false;

    @ObfuscatedName("client.ks")
    public static boolean field913 = true;

    @ObfuscatedName("client.kq")
    public static int field1005 = -1;

    @ObfuscatedName("client.kb")
    public static int field1089 = -1;

    @ObfuscatedName("client.kj")
    public static int field1007 = 0;

    @ObfuscatedName("client.kz")
    public static int field1008 = 50;

    @ObfuscatedName("client.ko")
    public static int field924 = 0;

    @ObfuscatedName("client.ki")
    public static boolean field1012 = false;

    @ObfuscatedName("client.kd")
    public static int field1013 = -1;

    @ObfuscatedName("client.kp")
    public static int field1014 = -1;

    @ObfuscatedName("client.lh")
    public static String field957 = null;

    @ObfuscatedName("client.ly")
    public static String field1016 = null;

    @ObfuscatedName("client.ld")
    public static int field1017 = -1;

    @ObfuscatedName("client.lb")
    public static class215 field1018 = new class215(8);

    @ObfuscatedName("client.lu")
    public static int field1019 = 0;

    @ObfuscatedName("client.lk")
    public static int field1020 = 0;

    @ObfuscatedName("client.lz")
    public static class243 field1103 = null;

    @ObfuscatedName("client.ll")
    public static int field1022 = 0;

    @ObfuscatedName("client.lf")
    public static int field1023 = 0;

    @ObfuscatedName("client.lr")
    public static int field1024 = 0;

    @ObfuscatedName("client.lx")
    public static int field1056 = -1;

    @ObfuscatedName("client.lg")
    public static boolean field1026 = false;

    @ObfuscatedName("client.lm")
    public static class243 field1027 = null;

    @ObfuscatedName("client.lp")
    public static class243 field1028 = null;

    @ObfuscatedName("client.lc")
    public static class243 field1029 = null;

    @ObfuscatedName("client.ln")
    public static int field1030 = 0;

    @ObfuscatedName("client.lj")
    public static int field1031 = 0;

    @ObfuscatedName("client.lt")
    public static class243 field1032 = null;

    @ObfuscatedName("client.lq")
    public static boolean field1033 = false;

    @ObfuscatedName("client.la")
    public static int field1034 = -1;

    @ObfuscatedName("client.lv")
    public static int field981 = -1;

    @ObfuscatedName("client.lw")
    public static boolean field878 = false;

    @ObfuscatedName("client.li")
    public static int field1125 = -1;

    @ObfuscatedName("client.lo")
    public static int field1038 = -1;

    @ObfuscatedName("client.ls")
    public static boolean field1039 = false;

    @ObfuscatedName("client.mb")
    public static int field1041 = 1;

    @ObfuscatedName("client.ml")
    public static int[] field989 = new int[32];

    @ObfuscatedName("client.mn")
    public static int field1043 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field1044 = new int[32];

    @ObfuscatedName("client.mk")
    public static int field1120 = 0;

    @ObfuscatedName("client.mt")
    public static int[] field1046 = new int[32];

    @ObfuscatedName("client.mr")
    public static int field1047 = 0;

    @ObfuscatedName("client.ma")
    public static int field1052 = 0;

    @ObfuscatedName("client.mg")
    public static int field1049 = 0;

    @ObfuscatedName("client.ms")
    public static int field1050 = 0;

    @ObfuscatedName("client.mx")
    public static int field1009 = 0;

    @ObfuscatedName("client.me")
    public static int field880 = 0;

    @ObfuscatedName("client.mi")
    public static int field1053 = 0;

    @ObfuscatedName("client.mu")
    public static int field1054 = 0;

    @ObfuscatedName("client.mq")
    public static class218 field1055 = new class218();

    @ObfuscatedName("client.mv")
    public static class218 field971 = new class218();

    @ObfuscatedName("client.mf")
    public static class218 field1130 = new class218();

    @ObfuscatedName("client.md")
    public static class215 field987 = new class215(512);

    @ObfuscatedName("client.nr")
    public static int field968 = 0;

    @ObfuscatedName("client.np")
    public static int field1060 = -2;

    @ObfuscatedName("client.nm")
    public static boolean[] field1061 = new boolean[100];

    @ObfuscatedName("client.ng")
    public static boolean[] field1062 = new boolean[100];

    @ObfuscatedName("client.nz")
    public static boolean[] field1063 = new boolean[100];

    @ObfuscatedName("client.nf")
    public static int[] field1064 = new int[100];

    @ObfuscatedName("client.nl")
    public static int[] field861 = new int[100];

    @ObfuscatedName("client.nd")
    public static int[] field1123 = new int[100];

    @ObfuscatedName("client.nq")
    public static int[] field1067 = new int[100];

    @ObfuscatedName("client.nn")
    public static int field1068 = 0;

    @ObfuscatedName("client.nx")
    public static long field1069 = 0L;

    @ObfuscatedName("client.nj")
    public static boolean field1070 = true;

    @ObfuscatedName("client.nk")
    public static int[] field1071 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nh")
    public static int field1072 = 0;

    @ObfuscatedName("client.ny")
    public static int field1036 = 0;

    @ObfuscatedName("client.na")
    public static String field870 = "";

    @ObfuscatedName("client.nc")
    public static long[] field990 = new long[100];

    @ObfuscatedName("client.ne")
    public static int field1076 = 0;

    @ObfuscatedName("client.og")
    public static int field1077 = 0;

    @ObfuscatedName("client.ok")
    public static int[] field1078 = new int[128];

    @ObfuscatedName("client.ob")
    public static int[] field950 = new int[128];

    @ObfuscatedName("client.oy")
    public static long field1080 = -1L;

    @ObfuscatedName("client.oc")
    public static int field1101 = -1;

    @ObfuscatedName("client.of")
    public static int field1082 = 0;

    @ObfuscatedName("client.ot")
    public static int[] field1083 = new int[1000];

    @ObfuscatedName("client.oq")
    public static int[] field1084 = new int[1000];

    @ObfuscatedName("client.ol")
    public static class332[] field1085 = new class332[1000];

    @ObfuscatedName("client.oi")
    public static int field1086 = 0;

    @ObfuscatedName("client.od")
    public static int field1006 = 0;

    @ObfuscatedName("client.oz")
    public static int field1088 = 0;

    @ObfuscatedName("client.on")
    public static int field1045 = 255;

    @ObfuscatedName("client.os")
    public static int field1090 = -1;

    @ObfuscatedName("client.ow")
    public static boolean field1091 = false;

    @ObfuscatedName("client.ou")
    public static int field1092 = 127;

    @ObfuscatedName("client.pw")
    public static int field1035 = 127;

    @ObfuscatedName("client.pp")
    public static int field1094 = 0;

    @ObfuscatedName("client.pc")
    public static int[] field886 = new int[50];

    @ObfuscatedName("client.pd")
    public static int[] field920 = new int[50];

    @ObfuscatedName("client.pf")
    public static int[] field1097 = new int[50];

    @ObfuscatedName("client.pe")
    public static int[] field1098 = new int[50];

    @ObfuscatedName("client.pq")
    public static class104[] field1099 = new class104[50];

    @ObfuscatedName("client.pz")
    public static boolean field1100 = false;

    @ObfuscatedName("client.pj")
    public static boolean[] field902 = new boolean[5];

    @ObfuscatedName("client.pl")
    public static int[] field1102 = new int[5];

    @ObfuscatedName("client.qo")
    public static int[] field862 = new int[5];

    @ObfuscatedName("client.qc")
    public static int[] field1104 = new int[5];

    @ObfuscatedName("client.qq")
    public static int[] field1105 = new int[5];

    @ObfuscatedName("client.qw")
    public static short field1106 = 256;

    @ObfuscatedName("client.qz")
    public static short field1107 = 205;

    @ObfuscatedName("client.qr")
    public static short field877 = 256;

    @ObfuscatedName("client.qg")
    public static short field1109 = 320;

    @ObfuscatedName("client.qy")
    public static short field927 = 1;

    @ObfuscatedName("client.qf")
    public static short field882 = 32767;

    @ObfuscatedName("client.qu")
    public static short field1112 = 1;

    @ObfuscatedName("client.qx")
    public static short field1113 = 32767;

    @ObfuscatedName("client.qi")
    public static int field1114 = 0;

    @ObfuscatedName("client.qb")
    public static int field1115 = 0;

    @ObfuscatedName("client.qj")
    public static int field944 = 0;

    @ObfuscatedName("client.qa")
    public static int field907 = 0;

    @ObfuscatedName("client.ql")
    public static int field1093 = 0;

    @ObfuscatedName("client.qn")
    public static class240 field1119 = new class240();

    @ObfuscatedName("client.qs")
    public static int field1073 = -1;

    @ObfuscatedName("client.qv")
    public static int field925 = -1;

    @ObfuscatedName("client.qe")
    public static class17[] field1122 = new class17[8];

    @ObfuscatedName("client.qm")
    public static class74 field1058 = new class74();

    @ObfuscatedName("client.rh")
    public static int field973 = -1;

    @ObfuscatedName("client.rp")
    public static ArrayList field1126 = new ArrayList(10);

    @ObfuscatedName("client.rx")
    public static int field1127 = 0;

    @ObfuscatedName("client.ro")
    public static final class72 field1128 = new class72();

    @ObfuscatedName("client.rw")
    public static int[] field1129 = new int[50];

    @ObfuscatedName("client.rr")
    public static int[] field967 = new int[50];

    @ObfuscatedName("eo.fc(B)Lli;")
    public static class335 method2904() {
        return Statics.field743;
    }

    @ObfuscatedName("client.av(B)V")
    public final void method879() {
    }

    public final void init() {
        if (!this.method884()) {
            return;
        }
        class294[] var1 = new class294[] { class294.field3805, class294.field3806, class294.field3807, class294.field3798, class294.field3795, class294.field3803, class294.field3797, class294.field3802, class294.field3796, class294.field3808, class294.field3804, class294.field3801, class294.field3793, class294.field3794, class294.field3799, class294.field3800 };
        class294[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class294 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3809);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3809)) {
                    case 1:
                        Statics.field628 = var5;
                        break;
                    case 2:
                        Statics.field2792 = Integer.parseInt(var5);
                        break;
                    case 3:
                        Statics.field1293 = var5;
                        break;
                    case 4:
                        class259[] var6 = new class259[] { class259.field3351, class259.field3355, class259.field3350, class259.field3349, class259.field3352, class259.field3353 };
                        Statics.field817 = (class259) class190.method578(var6, Integer.parseInt(var5));
                        if (Statics.field817 == class259.field3353) {
                            Statics.field1108 = class336.field4072;
                        } else {
                            Statics.field1108 = class336.field4069;
                        }
                    case 5:
                    case 13:
                    default:
                        break;
                    case 6:
                        field859 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field3919 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field906 = Integer.parseInt(var5) != 0;
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class87.field1316)) {
                        }
                        break;
                    case 10:
                        Statics.field3356 = class258.method4742(Integer.parseInt(var5));
                        break;
                    case 11:
                        field956 = Integer.parseInt(var5);
                        break;
                    case 12:
                        if (var5.equalsIgnoreCase(class87.field1316)) {
                            field856 = true;
                        } else {
                            field856 = false;
                        }
                        break;
                    case 14:
                        field858 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field864 = Integer.parseInt(var5);
                }
            }
        }
        method4910();
        Statics.field1066 = this.getCodeBase().getHost();
        String var7 = Statics.field3356.field3344;
        byte var8 = 0;
        try {
            Statics.field3921 = 17;
            Statics.field1147 = var8;
            try {
                Statics.field2522 = System.getProperty("os.name");
            } catch (Exception var33) {
                Statics.field2522 = "Unknown";
            }
            Statics.field2506 = Statics.field2522.toLowerCase();
            try {
                Statics.field328 = System.getProperty("user.home");
                if (Statics.field328 != null) {
                    Statics.field328 = Statics.field328 + "/";
                }
            } catch (Exception var32) {
            }
            try {
                if (Statics.field2506.startsWith("win")) {
                    if (Statics.field328 == null) {
                        Statics.field328 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field328 == null) {
                    Statics.field328 = System.getenv("HOME");
                }
                if (Statics.field328 != null) {
                    Statics.field328 = Statics.field328 + "/";
                }
            } catch (Exception var31) {
            }
            if (Statics.field328 == null) {
                Statics.field328 = "~/";
            }
            Statics.field381 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field328, "/tmp/", "" };
            Statics.field2215 = new String[] { ".jagex_cache_" + Statics.field1147, ".file_store_" + Statics.field1147 };
            label168: for (int var12 = 0; var12 < 4; var12++) {
                Statics.field2207 = Statics.method4364("oldschool", var7, var12);
                if (!Statics.field2207.exists()) {
                    Statics.field2207.mkdirs();
                }
                File[] var13 = Statics.field2207.listFiles();
                if (var13 == null) {
                    break;
                }
                File[] var14 = var13;
                int var15 = 0;
                while (true) {
                    if (var15 >= var14.length) {
                        break label168;
                    }
                    File var16 = var14[var15];
                    boolean var19;
                    try {
                        RandomAccessFile var17 = new RandomAccessFile(var16, "rw");
                        int var18 = var17.read();
                        var17.seek(0L);
                        var17.write(var18);
                        var17.seek(0L);
                        var17.close();
                        var19 = true;
                    } catch (Exception var30) {
                        var19 = false;
                    }
                    if (!var19) {
                        break;
                    }
                    var15++;
                }
            }
            class171.method39(Statics.field2207);
            try {
                File var21 = new File(Statics.field328, "random.dat");
                if (var21.exists()) {
                    class168.field2205 = new class122(new class123(var21, "rw", 25L), 24, 0);
                } else {
                    label147: for (int var22 = 0; var22 < Statics.field2215.length; var22++) {
                        for (int var23 = 0; var23 < Statics.field381.length; var23++) {
                            File var24 = new File(Statics.field381[var23] + Statics.field2215[var22] + File.separatorChar + "random.dat");
                            if (var24.exists()) {
                                class168.field2205 = new class122(new class123(var24, "rw", 25L), 24, 0);
                                break label147;
                            }
                        }
                    }
                }
                if (class168.field2205 == null) {
                    RandomAccessFile var25 = new RandomAccessFile(var21, "rw");
                    int var26 = var25.read();
                    var25.seek(0L);
                    var25.write(var26);
                    var25.seek(0L);
                    var25.close();
                    class168.field2205 = new class122(new class123(var21, "rw", 25L), 24, 0);
                }
            } catch (IOException var34) {
            }
            class168.field2212 = new class122(new class123(class171.method219("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class168.field2213 = new class122(new class123(class171.method219("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2214 = new class122[Statics.field3921];
            for (int var28 = 0; var28 < Statics.field3921; var28++) {
                Statics.field2214[var28] = new class122(new class123(class171.method219("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var35) {
            class165.method2883((String) null, var35);
        }
        Statics.field240 = this;
        this.method782(765, 503, 167);
    }

    @ObfuscatedName("ks.ff(I)V")
    public static final void method4910() {
        class138.field2027 = false;
        field863 = false;
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method909() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field2492 = null;
            Statics.field266 = null;
            Statics.field2579 = (byte[][][]) null;
        } else {
            Statics.field2492 = var1;
            Statics.field266 = new int[var1.length];
            Statics.field2579 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field2492.length; var3++) {
                Statics.field2579[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field462 = field956 == 0 ? 43594 : field858 + 40000;
        Statics.field3879 = field956 == 0 ? 443 : field858 + 50000;
        Statics.field850 = Statics.field462;
        Statics.field2789 = class241.field2794;
        Statics.field630 = class241.field2796;
        Statics.field2788 = class241.field2795;
        Statics.field2781 = class241.field2793;
        Statics.field578 = new class148();
        this.method776();
        this.method793();
        Statics.field580 = this.method773();
        Statics.field629 = new class175(255, class168.field2212, class168.field2213, 500000);
        class123 var4 = null;
        class79 var5 = new class79();
        try {
            var4 = class168.method2855("", Statics.field817.field3354, false);
            byte[] var6 = new byte[(int) var4.method2325()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method2326(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class79(new class195(var6));
        } catch (Exception var13) {
        }
        try {
            if (var4 != null) {
                var4.method2323();
            }
        } catch (Exception var12) {
        }
        Statics.field565 = var5;
        this.method774();
        class58.method3287(this, Statics.field1440);
        if (field956 != 0) {
            field923 = true;
        }
        method1713(Statics.field565.field1240);
        Statics.field2183 = new class80(Statics.field1108);
    }

    @ObfuscatedName("client.am(I)V")
    public final void method799() {
        field867++;
        this.method1178();
        while (true) {
            class218 var1 = class263.field3388;
            class260 var2;
            synchronized (class263.field3388) {
                var2 = (class260) class263.field3386.method3718();
            }
            if (var2 == null) {
                class230.method2878();
                method348();
                class52.method3192();
                class61 var4 = class61.field697;
                synchronized (class61.field697) {
                    class61.field702 = class61.field703;
                    class61.field701 = class61.field700;
                    class61.field694 = class61.field696;
                    class61.field709 = class61.field699;
                    class61.field712 = class61.field706;
                    class61.field711 = class61.field707;
                    class61.field705 = class61.field708;
                    class61.field699 = 0;
                }
                if (Statics.field580 != null) {
                    int var6 = Statics.field580.method677();
                    field1054 = var6;
                }
                if (field873 == 0) {
                    method85();
                    class60.method517();
                } else if (field873 == 5) {
                    class91.method98(this);
                    method85();
                    class60.method517();
                } else if (field873 == 10 || field873 == 11) {
                    class91.method98(this);
                } else if (field873 == 20) {
                    class91.method98(this);
                    this.method1095();
                } else if (field873 == 25) {
                    method3050(false);
                    field909 = 0;
                    boolean var7 = true;
                    for (int var8 = 0; var8 < Statics.field1971.length; var8++) {
                        if (Statics.field3871[var8] != -1 && Statics.field1971[var8] == null) {
                            Statics.field1971[var8] = Statics.field12.method4190(Statics.field3871[var8], 0);
                            if (Statics.field1971[var8] == null) {
                                var7 = false;
                                field909++;
                            }
                        }
                        if (Statics.field2504[var8] != -1 && Statics.field2961[var8] == null) {
                            Statics.field2961[var8] = Statics.field12.method4191(Statics.field2504[var8], 0, Statics.field344[var8]);
                            if (Statics.field2961[var8] == null) {
                                var7 = false;
                                field909++;
                            }
                        }
                    }
                    if (var7) {
                        field911 = 0;
                        boolean var9 = true;
                        for (int var10 = 0; var10 < Statics.field1971.length; var10++) {
                            byte[] var11 = Statics.field2961[var10];
                            if (var11 != null) {
                                int var12 = (Statics.field351[var10] >> 8) * 64 - Statics.field2499;
                                int var13 = (Statics.field351[var10] & 0xFF) * 64 - Statics.field29;
                                if (field915) {
                                    var12 = 10;
                                    var13 = 10;
                                }
                                var9 &= class63.method74(var11, var12, var13);
                            }
                        }
                        if (var9) {
                            if (field979 != 0) {
                                method2575(class252.field3055 + class87.field1314 + class87.field1317 + 100 + "%" + class87.field1312, true);
                            }
                            method348();
                            Statics.field3868.method2666();
                            for (int var14 = 0; var14 < 4; var14++) {
                                field1048[var14].method3079();
                            }
                            for (int var15 = 0; var15 < 4; var15++) {
                                for (int var16 = 0; var16 < 104; var16++) {
                                    for (int var17 = 0; var17 < 104; var17++) {
                                        class63.field721[var15][var16][var17] = 0;
                                    }
                                }
                            }
                            method348();
                            class63.method511();
                            int var18 = Statics.field1971.length;
                            Statics.method3931();
                            method3050(true);
                            if (!field915) {
                                int var19 = 0;
                                label1169: while (true) {
                                    if (var19 >= var18) {
                                        for (int var33 = 0; var33 < var18; var33++) {
                                            int var34 = (Statics.field351[var33] >> 8) * 64 - Statics.field2499;
                                            int var35 = (Statics.field351[var33] & 0xFF) * 64 - Statics.field29;
                                            byte[] var36 = Statics.field1971[var33];
                                            if (var36 == null && Statics.field757 < 800) {
                                                method348();
                                                class63.method1696(var34, var35, 64, 64);
                                            }
                                        }
                                        method3050(true);
                                        int var37 = 0;
                                        while (true) {
                                            if (var37 >= var18) {
                                                break label1169;
                                            }
                                            byte[] var38 = Statics.field2961[var37];
                                            if (var38 != null) {
                                                int var39 = (Statics.field351[var37] >> 8) * 64 - Statics.field2499;
                                                int var40 = (Statics.field351[var37] & 0xFF) * 64 - Statics.field29;
                                                method348();
                                                class63.method1453(var38, var39, var40, Statics.field3868, field1048);
                                            }
                                            var37++;
                                        }
                                    }
                                    int var20 = (Statics.field351[var19] >> 8) * 64 - Statics.field2499;
                                    int var21 = (Statics.field351[var19] & 0xFF) * 64 - Statics.field29;
                                    byte[] var22 = Statics.field1971[var19];
                                    if (var22 != null) {
                                        method348();
                                        int var23 = Statics.field2226 * 8 - 48;
                                        int var24 = Statics.field757 * 8 - 48;
                                        class177[] var25 = field1048;
                                        int var26 = 0;
                                        label1166: while (true) {
                                            if (var26 >= 4) {
                                                class195 var29 = new class195(var22);
                                                int var30 = 0;
                                                while (true) {
                                                    if (var30 >= 4) {
                                                        break label1166;
                                                    }
                                                    for (int var31 = 0; var31 < 64; var31++) {
                                                        for (int var32 = 0; var32 < 64; var32++) {
                                                            class63.method2369(var29, var30, var20 + var31, var21 + var32, var23, var24, 0);
                                                        }
                                                    }
                                                    var30++;
                                                }
                                            }
                                            for (int var27 = 0; var27 < 64; var27++) {
                                                for (int var28 = 0; var28 < 64; var28++) {
                                                    if (var20 + var27 > 0 && var20 + var27 < 103 && var21 + var28 > 0 && var21 + var28 < 103) {
                                                        var25[var26].field2271[var20 + var27][var21 + var28] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var26++;
                                        }
                                    }
                                    var19++;
                                }
                            }
                            if (field915) {
                                int var41 = 0;
                                label1115: while (true) {
                                    if (var41 >= 4) {
                                        for (int var79 = 0; var79 < 13; var79++) {
                                            for (int var80 = 0; var80 < 13; var80++) {
                                                int var81 = field916[0][var79][var80];
                                                if (var81 == -1) {
                                                    class63.method1696(var79 * 8, var80 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method3050(true);
                                        int var82 = 0;
                                        while (true) {
                                            if (var82 >= 4) {
                                                break label1115;
                                            }
                                            method348();
                                            for (int var83 = 0; var83 < 13; var83++) {
                                                label1004: for (int var84 = 0; var84 < 13; var84++) {
                                                    int var85 = field916[var82][var83][var84];
                                                    if (var85 != -1) {
                                                        int var86 = var85 >> 24 & 0x3;
                                                        int var87 = var85 >> 1 & 0x3;
                                                        int var88 = var85 >> 14 & 0x3FF;
                                                        int var89 = var85 >> 3 & 0x7FF;
                                                        int var90 = (var88 / 8 << 8) + var89 / 8;
                                                        for (int var91 = 0; var91 < Statics.field351.length; var91++) {
                                                            if (Statics.field351[var91] == var90 && Statics.field2961[var91] != null) {
                                                                byte[] var92 = Statics.field2961[var91];
                                                                int var93 = var83 * 8;
                                                                int var94 = var84 * 8;
                                                                int var95 = (var88 & 0x7) * 8;
                                                                int var96 = (var89 & 0x7) * 8;
                                                                class138 var97 = Statics.field3868;
                                                                class177[] var98 = field1048;
                                                                class195 var99 = new class195(var92);
                                                                int var100 = -1;
                                                                while (true) {
                                                                    int var101 = var99.method3239();
                                                                    if (var101 == 0) {
                                                                        continue label1004;
                                                                    }
                                                                    var100 += var101;
                                                                    int var102 = 0;
                                                                    while (true) {
                                                                        int var103 = var99.method3239();
                                                                        if (var103 == 0) {
                                                                            break;
                                                                        }
                                                                        var102 += var103 - 1;
                                                                        int var104 = var102 & 0x3F;
                                                                        int var105 = var102 >> 6 & 0x3F;
                                                                        int var106 = var102 >> 12;
                                                                        int var107 = var99.method3429();
                                                                        int var108 = var107 >> 2;
                                                                        int var109 = var107 & 0x3;
                                                                        if (var86 == var106 && var105 >= var95 && var105 < var95 + 8 && var104 >= var96 && var104 < var96 + 8) {
                                                                            class283 var110 = class283.method4185(var100);
                                                                            int var111 = var93 + Statics.method4365(var105 & 0x7, var104 & 0x7, var87, var110.field3602, var110.field3603, var109);
                                                                            int var113 = var105 & 0x7;
                                                                            int var114 = var104 & 0x7;
                                                                            int var116 = var110.field3602;
                                                                            int var117 = var110.field3603;
                                                                            if ((var109 & 0x1) == 1) {
                                                                                int var118 = var116;
                                                                                var116 = var117;
                                                                                var117 = var118;
                                                                            }
                                                                            int var119 = var87 & 0x3;
                                                                            int var120;
                                                                            if (var119 == 0) {
                                                                                var120 = var114;
                                                                            } else if (var119 == 1) {
                                                                                var120 = 7 - var113 - (var116 - 1);
                                                                            } else if (var119 == 2) {
                                                                                var120 = 7 - var114 - (var117 - 1);
                                                                            } else {
                                                                                var120 = var113;
                                                                            }
                                                                            int var121 = var94 + var120;
                                                                            if (var111 > 0 && var121 > 0 && var111 < 103 && var121 < 103) {
                                                                                int var122 = var82;
                                                                                if ((class63.field721[1][var111][var121] & 0x2) == 2) {
                                                                                    var122 = var82 - 1;
                                                                                }
                                                                                class177 var123 = null;
                                                                                if (var122 >= 0) {
                                                                                    var123 = var98[var122];
                                                                                }
                                                                                class63.method4009(var82, var111, var121, var100, var87 + var109 & 0x3, var108, var97, var123);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var82++;
                                        }
                                    }
                                    method348();
                                    for (int var42 = 0; var42 < 13; var42++) {
                                        for (int var43 = 0; var43 < 13; var43++) {
                                            boolean var44 = false;
                                            int var45 = field916[var41][var42][var43];
                                            if (var45 != -1) {
                                                int var46 = var45 >> 24 & 0x3;
                                                int var47 = var45 >> 1 & 0x3;
                                                int var48 = var45 >> 14 & 0x3FF;
                                                int var49 = var45 >> 3 & 0x7FF;
                                                int var50 = (var48 / 8 << 8) + var49 / 8;
                                                for (int var51 = 0; var51 < Statics.field351.length; var51++) {
                                                    if (Statics.field351[var51] == var50 && Statics.field1971[var51] != null) {
                                                        byte[] var52 = Statics.field1971[var51];
                                                        int var53 = var42 * 8;
                                                        int var54 = var43 * 8;
                                                        int var55 = (var48 & 0x7) * 8;
                                                        int var56 = (var49 & 0x7) * 8;
                                                        class177[] var57 = field1048;
                                                        for (int var58 = 0; var58 < 8; var58++) {
                                                            for (int var59 = 0; var59 < 8; var59++) {
                                                                if (var53 + var58 > 0 && var53 + var58 < 103 && var54 + var59 > 0 && var54 + var59 < 103) {
                                                                    var57[var41].field2271[var53 + var58][var54 + var59] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class195 var60 = new class195(var52);
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
                                                                        class63.method2369(var60, var41, var53 + var71, var54 + class242.method4287(var62 & 0x7, var63 & 0x7, var47), 0, 0, var47);
                                                                    } else {
                                                                        class63.method2369(var60, 0, -1, -1, 0, 0, 0);
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
                                                int var72 = var41;
                                                int var73 = var42 * 8;
                                                int var74 = var43 * 8;
                                                for (int var75 = 0; var75 < 8; var75++) {
                                                    for (int var76 = 0; var76 < 8; var76++) {
                                                        class63.field729[var72][var73 + var75][var74 + var76] = 0;
                                                    }
                                                }
                                                if (var73 > 0) {
                                                    for (int var77 = 1; var77 < 8; var77++) {
                                                        class63.field729[var72][var73][var74 + var77] = class63.field729[var72][var73 - 1][var74 + var77];
                                                    }
                                                }
                                                if (var74 > 0) {
                                                    for (int var78 = 1; var78 < 8; var78++) {
                                                        class63.field729[var72][var73 + var78][var74] = class63.field729[var72][var73 + var78][var74 - 1];
                                                    }
                                                }
                                                if (var73 > 0 && class63.field729[var72][var73 - 1][var74] != 0) {
                                                    class63.field729[var72][var73][var74] = class63.field729[var72][var73 - 1][var74];
                                                } else if (var74 > 0 && class63.field729[var72][var73][var74 - 1] != 0) {
                                                    class63.field729[var72][var73][var74] = class63.field729[var72][var73][var74 - 1];
                                                } else if (var73 > 0 && var74 > 0 && class63.field729[var72][var73 - 1][var74 - 1] != 0) {
                                                    class63.field729[var72][var73][var74] = class63.field729[var72][var73 - 1][var74 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var41++;
                                }
                            }
                            method3050(true);
                            method348();
                            class138 var124 = Statics.field3868;
                            class177[] var125 = field1048;
                            for (int var126 = 0; var126 < 4; var126++) {
                                for (int var127 = 0; var127 < 104; var127++) {
                                    for (int var128 = 0; var128 < 104; var128++) {
                                        if ((class63.field721[var126][var127][var128] & 0x1) == 1) {
                                            int var129 = var126;
                                            if ((class63.field721[1][var127][var128] & 0x2) == 2) {
                                                var129 = var126 - 1;
                                            }
                                            if (var129 >= 0) {
                                                var125[var129].method3082(var127, var128);
                                            }
                                        }
                                    }
                                }
                            }
                            class63.field735 += (int) (Math.random() * 5.0D) - 2;
                            if (class63.field735 < -8) {
                                class63.field735 = -8;
                            }
                            if (class63.field735 > 8) {
                                class63.field735 = 8;
                            }
                            class63.field736 += (int) (Math.random() * 5.0D) - 2;
                            if (class63.field736 < -16) {
                                class63.field736 = -16;
                            }
                            if (class63.field736 > 16) {
                                class63.field736 = 16;
                            }
                            for (int var130 = 0; var130 < 4; var130++) {
                                byte[][] var131 = Statics.field726[var130];
                                int var132 = (int) Math.sqrt(5100.0D);
                                int var133 = var132 * 768 >> 8;
                                for (int var134 = 1; var134 < 103; var134++) {
                                    for (int var135 = 1; var135 < 103; var135++) {
                                        int var136 = class63.field729[var130][var135 + 1][var134] - class63.field729[var130][var135 - 1][var134];
                                        int var137 = class63.field729[var130][var135][var134 + 1] - class63.field729[var130][var135][var134 - 1];
                                        int var138 = (int) Math.sqrt((double) (var137 * var137 + var136 * var136 + 65536));
                                        int var139 = (var136 << 8) / var138;
                                        int var140 = 65536 / var138;
                                        int var141 = (var137 << 8) / var138;
                                        int var142 = (var141 * -50 + var139 * -50 + var140 * -10) / var133 + 96;
                                        int var143 = (var131[var135][var134] >> 1) + (var131[var135][var134 + 1] >> 3) + (var131[var135][var134 - 1] >> 2) + (var131[var135 - 1][var134] >> 2) + (var131[var135 + 1][var134] >> 3);
                                        Statics.field720[var135][var134] = var142 - var143;
                                    }
                                }
                                for (int var144 = 0; var144 < 104; var144++) {
                                    Statics.field1334[var144] = 0;
                                    Statics.field10[var144] = 0;
                                    Statics.field2614[var144] = 0;
                                    Statics.field649[var144] = 0;
                                    Statics.field1974[var144] = 0;
                                }
                                for (int var145 = -5; var145 < 109; var145++) {
                                    for (int var146 = 0; var146 < 104; var146++) {
                                        int var147 = var145 + 5;
                                        int var10002;
                                        if (var147 >= 0 && var147 < 104) {
                                            int var148 = Statics.field734[var130][var147][var146] & 0xFF;
                                            if (var148 > 0) {
                                                class274 var149 = class274.method992(var148 - 1);
                                                Statics.field1334[var146] += var149.field3500;
                                                Statics.field10[var146] += var149.field3502;
                                                Statics.field2614[var146] += var149.field3504;
                                                Statics.field649[var146] += var149.field3505;
                                                var10002 = Statics.field1974[var146]++;
                                            }
                                        }
                                        int var150 = var145 - 5;
                                        if (var150 >= 0 && var150 < 104) {
                                            int var151 = Statics.field734[var130][var150][var146] & 0xFF;
                                            if (var151 > 0) {
                                                class274 var152 = class274.method992(var151 - 1);
                                                Statics.field1334[var146] -= var152.field3500;
                                                Statics.field10[var146] -= var152.field3502;
                                                Statics.field2614[var146] -= var152.field3504;
                                                Statics.field649[var146] -= var152.field3505;
                                                var10002 = Statics.field1974[var146]--;
                                            }
                                        }
                                    }
                                    if (var145 >= 1 && var145 < 103) {
                                        int var153 = 0;
                                        int var154 = 0;
                                        int var155 = 0;
                                        int var156 = 0;
                                        int var157 = 0;
                                        for (int var158 = -5; var158 < 109; var158++) {
                                            int var159 = var158 + 5;
                                            if (var159 >= 0 && var159 < 104) {
                                                var153 += Statics.field1334[var159];
                                                var154 += Statics.field10[var159];
                                                var155 += Statics.field2614[var159];
                                                var156 += Statics.field649[var159];
                                                var157 += Statics.field1974[var159];
                                            }
                                            int var160 = var158 - 5;
                                            if (var160 >= 0 && var160 < 104) {
                                                var153 -= Statics.field1334[var160];
                                                var154 -= Statics.field10[var160];
                                                var155 -= Statics.field2614[var160];
                                                var156 -= Statics.field649[var160];
                                                var157 -= Statics.field1974[var160];
                                            }
                                            if (var158 >= 1 && var158 < 103 && (!field863 || (class63.field721[0][var145][var158] & 0x2) != 0 || (class63.field721[var130][var145][var158] & 0x10) == 0)) {
                                                if (var130 < class63.field723) {
                                                    class63.field723 = var130;
                                                }
                                                int var161 = Statics.field734[var130][var145][var158] & 0xFF;
                                                int var162 = Statics.field730[var130][var145][var158] & 0xFF;
                                                if (var161 > 0 || var162 > 0) {
                                                    int var163 = class63.field729[var130][var145][var158];
                                                    int var164 = class63.field729[var130][var145 + 1][var158];
                                                    int var165 = class63.field729[var130][var145 + 1][var158 + 1];
                                                    int var166 = class63.field729[var130][var145][var158 + 1];
                                                    int var167 = Statics.field720[var145][var158];
                                                    int var168 = Statics.field720[var145 + 1][var158];
                                                    int var169 = Statics.field720[var145 + 1][var158 + 1];
                                                    int var170 = Statics.field720[var145][var158 + 1];
                                                    int var171 = -1;
                                                    int var172 = -1;
                                                    if (var161 > 0) {
                                                        int var173 = var153 * 256 / var156;
                                                        int var174 = var154 / var157;
                                                        int var175 = var155 / var157;
                                                        var171 = class63.method3188(var173, var174, var175);
                                                        int var176 = class63.field735 + var173 & 0xFF;
                                                        int var177 = class63.field736 + var175;
                                                        if (var177 < 0) {
                                                            var177 = 0;
                                                        } else if (var177 > 255) {
                                                            var177 = 255;
                                                        }
                                                        var172 = class63.method3188(var176, var174, var177);
                                                    }
                                                    if (var130 > 0) {
                                                        boolean var178 = true;
                                                        if (var161 == 0 && Statics.field725[var130][var145][var158] != 0) {
                                                            var178 = false;
                                                        }
                                                        if (var162 > 0 && !class287.method4369(var162 - 1).field3734) {
                                                            var178 = false;
                                                        }
                                                        if (var178 && var163 == var164 && var163 == var165 && var163 == var166) {
                                                            Statics.field722[var130][var145][var158] |= 0x924;
                                                        }
                                                    }
                                                    int var179 = 0;
                                                    if (var172 != -1) {
                                                        var179 = class135.field1938[class63.method13(var172, 96)];
                                                    }
                                                    if (var162 == 0) {
                                                        var124.method2670(var130, var145, var158, 0, 0, -1, var163, var164, var165, var166, class63.method13(var171, var167), class63.method13(var171, var168), class63.method13(var171, var169), class63.method13(var171, var170), 0, 0, 0, 0, var179, 0);
                                                    } else {
                                                        int var180 = Statics.field725[var130][var145][var158] + 1;
                                                        byte var181 = Statics.field2184[var130][var145][var158];
                                                        class287 var182 = class287.method4369(var162 - 1);
                                                        int var183 = var182.field3737;
                                                        int var184;
                                                        int var185;
                                                        if (var183 >= 0) {
                                                            var184 = Statics.field1945.method2346(var183);
                                                            var185 = -1;
                                                        } else if (var182.field3736 == 16711935) {
                                                            var185 = -2;
                                                            var183 = -1;
                                                            var184 = -2;
                                                        } else {
                                                            var185 = class63.method3188(var182.field3744, var182.field3741, var182.field3746);
                                                            int var186 = class63.field735 + var182.field3744 & 0xFF;
                                                            int var187 = class63.field736 + var182.field3746;
                                                            if (var187 < 0) {
                                                                var187 = 0;
                                                            } else if (var187 > 255) {
                                                                var187 = 255;
                                                            }
                                                            var184 = class63.method3188(var186, var182.field3741, var187);
                                                        }
                                                        int var188 = 0;
                                                        if (var184 != -2) {
                                                            var188 = class135.field1938[class63.method2926(var184, 96)];
                                                        }
                                                        if (var182.field3739 != -1) {
                                                            int var189 = class63.field735 + var182.field3743 & 0xFF;
                                                            int var190 = class63.field736 + var182.field3745;
                                                            if (var190 < 0) {
                                                                var190 = 0;
                                                            } else if (var190 > 255) {
                                                                var190 = 255;
                                                            }
                                                            int var191 = class63.method3188(var189, var182.field3742, var190);
                                                            var188 = class135.field1938[class63.method2926(var191, 96)];
                                                        }
                                                        var124.method2670(var130, var145, var158, var180, var181, var183, var163, var164, var165, var166, class63.method13(var171, var167), class63.method13(var171, var168), class63.method13(var171, var169), class63.method13(var171, var170), class63.method2926(var185, var167), class63.method2926(var185, var168), class63.method2926(var185, var169), class63.method2926(var185, var170), var179, var188);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var192 = 1; var192 < 103; var192++) {
                                    for (int var193 = 1; var193 < 103; var193++) {
                                        int var198;
                                        if ((class63.field721[var130][var193][var192] & 0x8) != 0) {
                                            var198 = 0;
                                        } else if (var130 <= 0 || (class63.field721[1][var193][var192] & 0x2) == 0) {
                                            var198 = var130;
                                        } else {
                                            var198 = var130 - 1;
                                        }
                                        var124.method2669(var130, var193, var192, var198);
                                    }
                                }
                                Statics.field734[var130] = (byte[][]) null;
                                Statics.field730[var130] = (byte[][]) null;
                                Statics.field725[var130] = (byte[][]) null;
                                Statics.field2184[var130] = (byte[][]) null;
                                Statics.field726[var130] = (byte[][]) null;
                            }
                            var124.method2695(-50, -10, -50);
                            for (int var199 = 0; var199 < 104; var199++) {
                                for (int var200 = 0; var200 < 104; var200++) {
                                    if ((class63.field721[1][var199][var200] & 0x2) == 2) {
                                        var124.method2797(var199, var200);
                                    }
                                }
                            }
                            int var201 = 1;
                            int var202 = 2;
                            int var203 = 4;
                            for (int var204 = 0; var204 < 4; var204++) {
                                if (var204 > 0) {
                                    var201 <<= 0x3;
                                    var202 <<= 0x3;
                                    var203 <<= 0x3;
                                }
                                for (int var205 = 0; var205 <= var204; var205++) {
                                    for (int var206 = 0; var206 <= 104; var206++) {
                                        for (int var207 = 0; var207 <= 104; var207++) {
                                            if ((Statics.field722[var205][var207][var206] & var201) != 0) {
                                                int var208 = var206;
                                                int var209 = var206;
                                                int var210 = var205;
                                                int var211 = var205;
                                                while (var208 > 0 && (Statics.field722[var205][var207][var208 - 1] & var201) != 0) {
                                                    var208--;
                                                }
                                                while (var209 < 104 && (Statics.field722[var205][var207][var209 + 1] & var201) != 0) {
                                                    var209++;
                                                }
                                                label723: while (var210 > 0) {
                                                    for (int var212 = var208; var212 <= var209; var212++) {
                                                        if ((Statics.field722[var210 - 1][var207][var212] & var201) == 0) {
                                                            break label723;
                                                        }
                                                    }
                                                    var210--;
                                                }
                                                label712: while (var211 < var204) {
                                                    for (int var213 = var208; var213 <= var209; var213++) {
                                                        if ((Statics.field722[var211 + 1][var207][var213] & var201) == 0) {
                                                            break label712;
                                                        }
                                                    }
                                                    var211++;
                                                }
                                                int var214 = (var211 + 1 - var210) * (var209 - var208 + 1);
                                                if (var214 >= 8) {
                                                    short var215 = 240;
                                                    int var216 = class63.field729[var211][var207][var208] - var215;
                                                    int var217 = class63.field729[var210][var207][var208];
                                                    class138.method2767(var204, 1, var207 * 128, var207 * 128, var208 * 128, var209 * 128 + 128, var216, var217);
                                                    for (int var218 = var210; var218 <= var211; var218++) {
                                                        for (int var219 = var208; var219 <= var209; var219++) {
                                                            Statics.field722[var218][var207][var219] &= ~var201;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field722[var205][var207][var206] & var202) != 0) {
                                                int var220 = var207;
                                                int var221 = var207;
                                                int var222 = var205;
                                                int var223 = var205;
                                                while (var220 > 0 && (Statics.field722[var205][var220 - 1][var206] & var202) != 0) {
                                                    var220--;
                                                }
                                                while (var221 < 104 && (Statics.field722[var205][var221 + 1][var206] & var202) != 0) {
                                                    var221++;
                                                }
                                                label776: while (var222 > 0) {
                                                    for (int var224 = var220; var224 <= var221; var224++) {
                                                        if ((Statics.field722[var222 - 1][var224][var206] & var202) == 0) {
                                                            break label776;
                                                        }
                                                    }
                                                    var222--;
                                                }
                                                label765: while (var223 < var204) {
                                                    for (int var225 = var220; var225 <= var221; var225++) {
                                                        if ((Statics.field722[var223 + 1][var225][var206] & var202) == 0) {
                                                            break label765;
                                                        }
                                                    }
                                                    var223++;
                                                }
                                                int var226 = (var223 + 1 - var222) * (var221 - var220 + 1);
                                                if (var226 >= 8) {
                                                    short var227 = 240;
                                                    int var228 = class63.field729[var223][var220][var206] - var227;
                                                    int var229 = class63.field729[var222][var220][var206];
                                                    class138.method2767(var204, 2, var220 * 128, var221 * 128 + 128, var206 * 128, var206 * 128, var228, var229);
                                                    for (int var230 = var222; var230 <= var223; var230++) {
                                                        for (int var231 = var220; var231 <= var221; var231++) {
                                                            Statics.field722[var230][var231][var206] &= ~var202;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field722[var205][var207][var206] & var203) != 0) {
                                                int var232 = var207;
                                                int var233 = var207;
                                                int var234 = var206;
                                                int var235 = var206;
                                                while (var234 > 0 && (Statics.field722[var205][var207][var234 - 1] & var203) != 0) {
                                                    var234--;
                                                }
                                                while (var235 < 104 && (Statics.field722[var205][var207][var235 + 1] & var203) != 0) {
                                                    var235++;
                                                }
                                                label829: while (var232 > 0) {
                                                    for (int var236 = var234; var236 <= var235; var236++) {
                                                        if ((Statics.field722[var205][var232 - 1][var236] & var203) == 0) {
                                                            break label829;
                                                        }
                                                    }
                                                    var232--;
                                                }
                                                label818: while (var233 < 104) {
                                                    for (int var237 = var234; var237 <= var235; var237++) {
                                                        if ((Statics.field722[var205][var233 + 1][var237] & var203) == 0) {
                                                            break label818;
                                                        }
                                                    }
                                                    var233++;
                                                }
                                                if ((var233 - var232 + 1) * (var235 - var234 + 1) >= 4) {
                                                    int var238 = class63.field729[var205][var232][var234];
                                                    class138.method2767(var204, 4, var232 * 128, var233 * 128 + 128, var234 * 128, var235 * 128 + 128, var238, var238);
                                                    for (int var239 = var232; var239 <= var233; var239++) {
                                                        for (int var240 = var234; var240 <= var235; var240++) {
                                                            Statics.field722[var205][var239][var240] &= ~var203;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method3050(true);
                            int var241 = class63.field723;
                            if (var241 > Statics.field2770) {
                                var241 = Statics.field2770;
                            }
                            if (var241 < Statics.field2770 - 1) {
                                int var242 = Statics.field2770 - 1;
                            }
                            if (field863) {
                                Statics.field3868.method2667(class63.field723);
                            } else {
                                Statics.field3868.method2667(0);
                            }
                            for (int var243 = 0; var243 < 104; var243++) {
                                for (int var244 = 0; var244 < 104; var244++) {
                                    method72(var243, var244);
                                }
                            }
                            method348();
                            method6();
                            class283.field3610.method3629();
                            if (Statics.field240.method883()) {
                                class185 var245 = class185.method2860(class182.field2399, field903.field1476);
                                var245.field2501.method3212(1057001181);
                                field903.method1884(var245);
                            }
                            if (!field915) {
                                int var246 = (Statics.field2226 - 6) / 8;
                                int var247 = (Statics.field2226 + 6) / 8;
                                int var248 = (Statics.field757 - 6) / 8;
                                int var249 = (Statics.field757 + 6) / 8;
                                for (int var250 = var246 - 1; var250 <= var247 + 1; var250++) {
                                    for (int var251 = var248 - 1; var251 <= var249 + 1; var251++) {
                                        if (var250 < var246 || var250 > var247 || var251 < var248 || var251 > var249) {
                                            Statics.field12.method4224("m" + var250 + "_" + var251);
                                            Statics.field12.method4224("l" + var250 + "_" + var251);
                                        }
                                    }
                                }
                            }
                            method666(30);
                            method348();
                            class63.method1599();
                            class185 var252 = class185.method2860(class182.field2409, field903.field1476);
                            field903.method1884(var252);
                            class60.method517();
                        } else {
                            field979 = 2;
                        }
                    } else {
                        field979 = 1;
                    }
                }
                if (field873 == 30) {
                    this.method1213();
                } else if (field873 == 40 || field873 == 45) {
                    this.method1095();
                }
                return;
            }
            var2.field3358.method4303(var2.field3359, (int) var2.field2645, var2.field3357, false);
        }
    }

    @ObfuscatedName("client.aq(ZI)V")
    public final void method818(boolean arg0) {
        boolean var2;
        label145: {
            try {
                if (class230.field2681 == 2) {
                    if (Statics.field293 == null) {
                        Statics.field293 = class236.method4017(Statics.field715, Statics.field2683, Statics.field2130);
                        if (Statics.field293 == null) {
                            var2 = false;
                            break label145;
                        }
                    }
                    if (Statics.field261 == null) {
                        Statics.field261 = new class111(Statics.field2137, Statics.field2679);
                    }
                    if (Statics.field2680.method3832(Statics.field293, Statics.field2685, Statics.field261, 22050)) {
                        Statics.field2680.method3855();
                        Statics.field2680.method3830(Statics.field1432);
                        Statics.field2680.method3856(Statics.field293, Statics.field3911);
                        class230.field2681 = 0;
                        Statics.field293 = null;
                        Statics.field261 = null;
                        Statics.field715 = null;
                        var2 = true;
                        break label145;
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                Statics.field2680.method3836();
                class230.field2681 = 0;
                Statics.field293 = null;
                Statics.field261 = null;
                Statics.field715 = null;
            }
            var2 = false;
        }
        if (var2 && field1091 && Statics.field853 != null) {
            Statics.field853.method2036();
        }
        if ((field873 == 10 || field873 == 20 || field873 == 30) && field1069 != 0L && class197.method26() > field1069) {
            int var5 = field1070 ? 2 : 1;
            method1713(var5);
        }
        if (arg0) {
            for (int var6 = 0; var6 < 100; var6++) {
                field1061[var6] = true;
            }
        }
        if (field873 == 0) {
            this.method779(class91.field1354, class91.field1355, arg0);
        } else if (field873 == 5) {
            class91.method164(Statics.field2677, Statics.field16, Statics.field2507, arg0);
        } else if (field873 == 10 || field873 == 11) {
            class91.method164(Statics.field2677, Statics.field16, Statics.field2507, arg0);
        } else if (field873 == 20) {
            class91.method164(Statics.field2677, Statics.field16, Statics.field2507, arg0);
        } else if (field873 == 25) {
            if (field979 == 1) {
                if (field909 > field860) {
                    field860 = field909;
                }
                int var7 = (field860 * 50 - field909 * 50) / field860;
                method2575(class252.field3055 + class87.field1314 + class87.field1317 + var7 + "%" + class87.field1312, false);
            } else if (field979 == 2) {
                if (field911 > field912) {
                    field912 = field911;
                }
                int var8 = (field912 * 50 - field911 * 50) / field912 + 50;
                method2575(class252.field3055 + class87.field1314 + class87.field1317 + var8 + "%" + class87.field1312, false);
            } else {
                method2575(class252.field3055, false);
            }
        } else if (field873 == 30) {
            this.method1099();
        } else if (field873 == 40) {
            method2575(class252.field3024 + class87.field1314 + class252.field3191, false);
        } else if (field873 == 45) {
            method2575(class252.field3171, false);
        }
        if (field873 == 30 && field1068 == 0 && !arg0 && !field1070) {
            for (int var9 = 0; var9 < field968; var9++) {
                if (field1062[var9]) {
                    Statics.field3942.method758(field1064[var9], field861[var9], field1123[var9], field1067[var9]);
                    field1062[var9] = false;
                }
            }
        } else if (field873 > 0) {
            Statics.field3942.method764(0, 0);
            for (int var10 = 0; var10 < field968; var10++) {
                field1062[var10] = false;
            }
        }
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method801() {
        if (Statics.field2152.method1808()) {
            Statics.field2152.method1810();
        }
        if (Statics.field491 != null) {
            Statics.field491.field798 = false;
        }
        Statics.field491 = null;
        field903.method1885();
        class52.method29();
        if (class61.field697 != null) {
            class61 var1 = class61.field697;
            synchronized (class61.field697) {
                class61.field697 = null;
            }
        }
        Statics.field580 = null;
        if (Statics.field853 != null) {
            Statics.field853.method2048();
        }
        if (Statics.field1825 != null) {
            Statics.field1825.method2048();
        }
        if (Statics.field3413 != null) {
            Statics.field3413.method3022();
        }
        Object var3 = class263.field3387;
        synchronized (class263.field3387) {
            if (class263.field3390 != 0) {
                class263.field3390 = 1;
                try {
                    class263.field3387.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field578 != null) {
            Statics.field578.method2872();
            Statics.field578 = null;
        }
        try {
            class168.field2212.method2292();
            for (int var6 = 0; var6 < Statics.field3921; var6++) {
                Statics.field2214[var6].method2292();
            }
            class168.field2213.method2292();
            class168.field2205.method2292();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("aj.fy(II)V")
    public static void method666(int arg0) {
        if (field873 == arg0) {
            return;
        }
        if (field873 == 0) {
            Statics.field240.method802();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field891 = 0;
            field892 = 0;
            field1111 = 0;
            field1051.method4836(arg0);
            if (arg0 != 20) {
                method953(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1325 != null) {
            Statics.field1325.method3022();
            Statics.field1325 = null;
        }
        if (field873 == 25) {
            field979 = 0;
            field909 = 0;
            field860 = 1;
            field911 = 0;
            field912 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class91.method3121(Statics.field1004, Statics.field550, true, 0);
        } else if (arg0 == 20) {
            class91.method3121(Statics.field1004, Statics.field550, true, field873 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class91.method3121(Statics.field1004, Statics.field550, false, 4);
        } else {
            class91.method5073();
        }
        field873 = arg0;
    }

    @ObfuscatedName("client.fl(I)V")
    public void method1178() {
        if (field873 != 1000) {
            boolean var1 = class265.method667();
            if (!var1) {
                this.method1093();
            }
        }
    }

    @ObfuscatedName("client.fj(I)V")
    public void method1093() {
        if (class265.field3424 >= 4) {
            this.method803("js5crc");
            field873 = 1000;
            return;
        }
        if (class265.field3423 >= 4) {
            if (field873 <= 5) {
                this.method803("js5io");
                field873 = 1000;
                return;
            }
            field887 = 3000;
            class265.field3423 = 3;
        }
        if (--field887 + 1 > 0) {
            return;
        }
        try {
            if (field893 == 0) {
                Statics.field423 = Statics.field684.method3002(Statics.field1066, Statics.field850);
                field893++;
            }
            if (field893 == 1) {
                if (Statics.field423.field2190 == 2) {
                    this.method1304(-1);
                    return;
                }
                if (Statics.field423.field2190 == 1) {
                    field893++;
                }
            }
            if (field893 == 2) {
                if (field906) {
                    Statics.field650 = Statics.method2877((Socket) Statics.field423.field2194, 40000, 5000);
                } else {
                    Statics.field650 = new class174((Socket) Statics.field423.field2194, Statics.field684, 5000);
                }
                class195 var1 = new class195(5);
                var1.method3209(15);
                var1.method3212(167);
                Statics.field650.method3021(var1.field2567, 0, 5);
                field893++;
                Statics.field888 = class197.method26();
            }
            if (field893 == 3) {
                if (Statics.field650.method3018() > 0 || !field906 && field873 <= 5) {
                    int var2 = Statics.field650.method3019();
                    if (var2 != 0) {
                        this.method1304(var2);
                        return;
                    }
                    field893++;
                } else if (class197.method26() - Statics.field888 > 30000L) {
                    this.method1304(-2);
                    return;
                }
            }
            if (field893 == 4) {
                class265.method2983(Statics.field650, field873 > 20);
                Statics.field423 = null;
                Statics.field650 = null;
                field893 = 0;
                field890 = 0;
            }
        } catch (IOException var4) {
            this.method1304(-3);
        }
    }

    @ObfuscatedName("client.fz(II)V")
    public void method1304(int arg0) {
        Statics.field423 = null;
        Statics.field650 = null;
        field893 = 0;
        if (Statics.field850 == Statics.field462) {
            Statics.field850 = Statics.field3879;
        } else {
            Statics.field850 = Statics.field462;
        }
        field890++;
        if (field890 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field873 <= 5) {
                this.method803("js5connect_full");
                field873 = 1000;
            } else {
                field887 = 3000;
            }
        } else if (field890 >= 2 && arg0 == 6) {
            this.method803("js5connect_outofdate");
            field873 = 1000;
        } else if (field890 >= 4) {
            if (field873 <= 5) {
                this.method803("js5connect");
                field873 = 1000;
            } else {
                field887 = 3000;
            }
        }
    }

    @ObfuscatedName("ap.fr(Ljs;Ljava/lang/String;I)V")
    public static void method221(class264 arg0, String arg1) {
        class65 var2 = new class65(arg0, arg1);
        field1126.add(var2);
    }

    @ObfuscatedName("m.fp(I)Z")
    public static boolean method88() {
        if (field1126 == null || field1127 >= field1126.size()) {
            return true;
        }
        while (field1127 < field1126.size()) {
            class65 var0 = (class65) field1126.get(field1127);
            if (!var0.method984()) {
                return false;
            }
            field1127++;
        }
        return true;
    }

    @ObfuscatedName("l.fx(I)V")
    public static void method85() {
        if (field1021 == 0) {
            Statics.field3868 = new class138(4, 104, 104, class63.field729);
            for (int var0 = 0; var0 < 4; var0++) {
                field1048[var0] = new class177(104, 104);
            }
            Statics.field2372 = new class332(512, 512);
            class91.field1355 = class252.field3026;
            class91.field1354 = 5;
            field1021 = 20;
        } else if (field1021 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class135.field1956[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class138.method2805(var1, 500, 800, 512, 334);
            class91.field1355 = class252.field3027;
            class91.field1354 = 10;
            field1021 = 30;
        } else if (field1021 == 30) {
            Statics.field2219 = method693(0, false, true, true);
            Statics.field312 = method693(1, false, true, true);
            Statics.field503 = method693(2, true, false, true);
            Statics.field636 = method693(3, false, true, true);
            Statics.field553 = method693(4, false, true, true);
            Statics.field12 = method693(5, true, true, true);
            Statics.field13 = method693(6, true, true, true);
            Statics.field549 = method693(7, false, true, true);
            Statics.field550 = method693(8, false, true, true);
            Statics.field1148 = method693(9, false, true, true);
            Statics.field1004 = method693(10, false, true, true);
            Statics.field2148 = method693(11, false, true, true);
            Statics.field446 = method693(12, false, true, true);
            Statics.field304 = method693(13, true, false, true);
            Statics.field791 = method693(14, false, true, true);
            Statics.field2044 = method693(15, false, true, true);
            Statics.field2129 = method693(16, true, true, true);
            class91.field1355 = class252.field3028;
            class91.field1354 = 20;
            field1021 = 40;
        } else if (field1021 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2219.method4300() * 4 / 100;
            int var8 = var7 + Statics.field312.method4300() * 4 / 100;
            int var9 = var8 + Statics.field503.method4300() * 2 / 100;
            int var10 = var9 + Statics.field636.method4300() * 2 / 100;
            int var11 = var10 + Statics.field553.method4300() * 6 / 100;
            int var12 = var11 + Statics.field12.method4300() * 4 / 100;
            int var13 = var12 + Statics.field13.method4300() * 2 / 100;
            int var14 = var13 + Statics.field549.method4300() * 58 / 100;
            int var15 = var14 + Statics.field550.method4300() * 2 / 100;
            int var16 = var15 + Statics.field1148.method4300() * 2 / 100;
            int var17 = var16 + Statics.field1004.method4300() * 2 / 100;
            int var18 = var17 + Statics.field2148.method4300() * 2 / 100;
            int var19 = var18 + Statics.field446.method4300() * 2 / 100;
            int var20 = var19 + Statics.field304.method4300() * 2 / 100;
            int var21 = var20 + Statics.field791.method4300() * 2 / 100;
            int var22 = var21 + Statics.field2044.method4300() * 2 / 100;
            int var23 = var22 + Statics.field2129.method4300() * 2 / 100;
            if (var23 == 100) {
                method221(Statics.field2219, "Animations");
                method221(Statics.field312, "Skeletons");
                method221(Statics.field553, "Sound FX");
                method221(Statics.field12, "Maps");
                method221(Statics.field13, "Music Tracks");
                method221(Statics.field549, "Models");
                method221(Statics.field550, "Sprites");
                method221(Statics.field2148, "Music Jingles");
                method221(Statics.field791, "Music Samples");
                method221(Statics.field2044, "Music Patches");
                method221(Statics.field2129, "World Map");
                class91.field1355 = class252.field3030;
                class91.field1354 = 30;
                field1021 = 45;
            } else {
                if (var23 != 0) {
                    class91.field1355 = class252.field3029 + var23 + "%";
                }
                class91.field1354 = 30;
            }
        } else if (field1021 == 45) {
            boolean var24 = !field863;
            Statics.field3928 = 22050;
            Statics.field298 = var24;
            Statics.field2778 = 2;
            class231 var25 = new class231();
            var25.method3837(9, 128);
            Statics.field853 = class108.method1870(Statics.field684, 0, 22050);
            Statics.field853.method2033(var25);
            class264 var26 = Statics.field2044;
            class264 var27 = Statics.field791;
            class264 var28 = Statics.field553;
            Statics.field2685 = var26;
            Statics.field2679 = var27;
            Statics.field2137 = var28;
            Statics.field2680 = var25;
            Statics.field1825 = class108.method1870(Statics.field684, 1, 2048);
            Statics.field633 = new class101();
            Statics.field1825.method2033(Statics.field633);
            Statics.field2572 = new class115(22050, Statics.field3928);
            class91.field1355 = class252.field3031;
            class91.field1354 = 35;
            field1021 = 50;
            Statics.field227 = new class311(Statics.field550, Statics.field304);
        } else if (field1021 == 50) {
            int var29 = class310.method5088().length;
            field908 = Statics.field227.method5091(class310.method5088());
            if (field908.size() < var29) {
                class91.field1355 = class252.field3032 + field908.size() * 100 / var29 + "%";
                class91.field1354 = 40;
            } else {
                Statics.field16 = (class312) field908.get(class310.field3872);
                Statics.field2507 = (class312) field908.get(class310.field3875);
                Statics.field2677 = (class312) field908.get(class310.field3878);
                Statics.field4067 = new class338(true);
                class91.field1355 = class252.field3033;
                class91.field1354 = 40;
                field1021 = 60;
            }
        } else if (field1021 == 60) {
            int var30 = class91.method352(Statics.field1004, Statics.field550);
            byte var31 = 11;
            if (var30 < var31) {
                class91.field1355 = class252.field3034 + var30 * 100 / var31 + "%";
                class91.field1354 = 50;
            } else {
                class91.field1355 = class252.field3035;
                class91.field1354 = 50;
                method666(5);
                field1021 = 70;
            }
        } else if (field1021 == 70) {
            if (Statics.field503.method4279()) {
                class287.method4097(Statics.field503);
                class264 var33 = Statics.field503;
                Statics.field640 = var33;
                class264 var34 = Statics.field503;
                class264 var35 = Statics.field549;
                Statics.field3507 = var34;
                Statics.field3506 = var35;
                Statics.field3513 = Statics.field3507.method4202(3);
                class264 var36 = Statics.field503;
                class264 var37 = Statics.field549;
                boolean var38 = field863;
                Statics.field3299 = var36;
                Statics.field3588 = var37;
                class283.field3617 = var38;
                class264 var39 = Statics.field503;
                class264 var40 = Statics.field549;
                Statics.field3728 = var39;
                Statics.field3715 = var40;
                class280.method3013(Statics.field503);
                class264 var41 = Statics.field503;
                class264 var42 = Statics.field549;
                boolean var43 = field856;
                class312 var44 = Statics.field16;
                Statics.field2143 = var41;
                Statics.field3689 = var42;
                Statics.field2135 = var43;
                Statics.field320 = Statics.field2143.method4202(10);
                Statics.field2768 = var44;
                class264 var45 = Statics.field503;
                class264 var46 = Statics.field2219;
                class264 var47 = Statics.field312;
                Statics.field300 = var45;
                Statics.field3748 = var46;
                Statics.field3754 = var47;
                class273.method993(Statics.field503, Statics.field549);
                class278.method2083(Statics.field503);
                class264 var48 = Statics.field503;
                Statics.field3448 = var48;
                Statics.field3446 = Statics.field3448.method4202(16);
                class243.method54(Statics.field636, Statics.field549, Statics.field550, Statics.field304);
                Statics.method3459(Statics.field503);
                class281.method118(Statics.field503);
                class264 var49 = Statics.field503;
                Statics.field3474 = var49;
                class272.method2928(Statics.field503);
                class264 var50 = Statics.field503;
                Statics.field3543 = var50;
                Statics.field2152 = new class95();
                class264 var51 = Statics.field503;
                class264 var52 = Statics.field550;
                class264 var53 = Statics.field304;
                Statics.field3577 = var51;
                Statics.field3565 = var52;
                Statics.field3566 = var53;
                class276.method4184(Statics.field503, Statics.field550);
                class264 var54 = Statics.field503;
                class264 var55 = Statics.field550;
                Statics.field3457 = var55;
                if (var54.method4279()) {
                    Statics.field3451 = var54.method4202(35);
                    Statics.field3472 = new class270[Statics.field3451];
                    for (int var56 = 0; var56 < Statics.field3451; var56++) {
                        byte[] var57 = var54.method4190(35, var56);
                        if (var57 != null) {
                            Statics.field3472[var56] = new class270(var56);
                            Statics.field3472[var56].method4378(new class195(var57));
                            Statics.field3472[var56].method4383();
                        }
                    }
                }
                class91.field1355 = class252.field3164;
                class91.field1354 = 60;
                field1021 = 80;
            } else {
                class91.field1355 = class252.field3036 + Statics.field503.method4306() + "%";
                class91.field1354 = 60;
            }
        } else if (field1021 == 80) {
            int var58 = 0;
            if (Statics.field797 == null) {
                class264 var59 = Statics.field550;
                int var60 = var59.method4245("compass");
                int var61 = var59.method4207(var60, "");
                class332 var62 = class333.method5407(var59, var60, var61);
                Statics.field797 = var62;
            } else {
                var58++;
            }
            if (Statics.field448 == null) {
                class264 var63 = Statics.field550;
                int var64 = var63.method4245("mapedge");
                int var65 = var63.method4207(var64, "");
                class332 var66 = class333.method5407(var63, var64, var65);
                Statics.field448 = var66;
            } else {
                var58++;
            }
            if (Statics.field719 == null) {
                Statics.field719 = class333.method3473(Statics.field550, "mapscene", "");
            } else {
                var58++;
            }
            if (Statics.field318 == null) {
                Statics.field318 = class333.method5221(Statics.field550, "headicons_pk", "");
            } else {
                var58++;
            }
            if (Statics.field1311 == null) {
                Statics.field1311 = class333.method5221(Statics.field550, "headicons_prayer", "");
            } else {
                var58++;
            }
            if (Statics.field570 == null) {
                Statics.field570 = class333.method5221(Statics.field550, "headicons_hint", "");
            } else {
                var58++;
            }
            if (Statics.field749 == null) {
                Statics.field749 = class333.method5221(Statics.field550, "mapmarker", "");
            } else {
                var58++;
            }
            if (Statics.field258 == null) {
                Statics.field258 = class333.method5221(Statics.field550, "cross", "");
            } else {
                var58++;
            }
            if (Statics.field1967 == null) {
                Statics.field1967 = class333.method5221(Statics.field550, "mapdots", "");
            } else {
                var58++;
            }
            if (Statics.field1145 == null) {
                Statics.field1145 = class333.method3473(Statics.field550, "scrollbar", "");
            } else {
                var58++;
            }
            if (Statics.field546 == null) {
                Statics.field546 = class333.method3473(Statics.field550, "mod_icons", "");
            } else {
                var58++;
            }
            if (var58 < 11) {
                class91.field1355 = class252.field3244 + var58 * 100 / 12 + "%";
                class91.field1354 = 70;
            } else {
                Statics.field3895 = Statics.field546;
                Statics.field448.method5435();
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 21.0D) - 10;
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 41.0D) - 20;
                Statics.field719[0].method5430(var67 + var70, var68 + var70, var69 + var70);
                class91.field1355 = class252.field3089;
                class91.field1354 = 70;
                field1021 = 90;
            }
        } else if (field1021 == 90) {
            if (Statics.field1148.method4279()) {
                Statics.field761 = new class124(Statics.field1148, Statics.field550, 20, 0.8D, field863 ? 64 : 128);
                class135.method2584(Statics.field761);
                class135.method2585(0.8D);
                field1021 = 100;
            } else {
                class91.field1355 = class252.field3040 + "0%";
                class91.field1354 = 90;
            }
        } else if (field1021 == 100) {
            int var71 = Statics.field761.method2343();
            if (var71 < 100) {
                class91.field1355 = class252.field3040 + var71 + "%";
                class91.field1354 = 90;
            } else {
                class91.field1355 = class252.field3041;
                class91.field1354 = 90;
                field1021 = 110;
            }
        } else if (field1021 == 110) {
            Statics.field491 = new class70();
            Statics.field684.method2989(Statics.field491, 10);
            class91.field1355 = class252.field3063;
            class91.field1354 = 92;
            field1021 = 120;
        } else if (field1021 == 120) {
            if (Statics.field1004.method4276("huffman", "")) {
                class187 var72 = new class187(Statics.field1004.method4211("huffman", ""));
                Statics.field3908 = var72;
                class91.field1355 = class252.field3194;
                class91.field1354 = 94;
                field1021 = 130;
            } else {
                class91.field1355 = class252.field3086 + "%";
                class91.field1354 = 94;
            }
        } else if (field1021 == 130) {
            if (!Statics.field636.method4279()) {
                class91.field1355 = class252.field3274 + Statics.field636.method4306() * 4 / 5 + "%";
                class91.field1354 = 96;
            } else if (!Statics.field446.method4279()) {
                class91.field1355 = class252.field3274 + (80 + Statics.field446.method4306() / 6) + "%";
                class91.field1354 = 96;
            } else if (Statics.field304.method4279()) {
                class91.field1355 = class252.field3037;
                class91.field1354 = 98;
                field1021 = 140;
            } else {
                class91.field1355 = class252.field3274 + (96 + Statics.field304.method4306() / 50) + "%";
                class91.field1354 = 96;
            }
        } else if (field1021 == 140) {
            class91.field1354 = 100;
            if (Statics.field2129.method4213(class42.field516.field514)) {
                if (Statics.field743 == null) {
                    Statics.field743 = new class335();
                    Statics.field743.method5622(Statics.field2129, Statics.field2677, field908, Statics.field719);
                }
                int var73 = Statics.field743.method5583();
                if (var73 < 100) {
                    class91.field1355 = class252.field3047 + (var73 * 9 / 10 + 10) + "%";
                } else {
                    class91.field1355 = class252.field3048;
                    field1021 = 150;
                }
            } else {
                class91.field1355 = class252.field3047 + Statics.field2129.method4215(class42.field516.field514) / 10 + "%";
            }
        } else if (field1021 == 150) {
            method666(10);
        }
    }

    @ObfuscatedName("an.fm(IZZZI)Ljs;")
    public static class264 method693(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class175 var4 = null;
        if (class168.field2212 != null) {
            var4 = new class175(arg0, class168.field2212, Statics.field2214[arg0], 1000000);
        }
        return new class264(var4, Statics.field629, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fu(B)V")
    public final void method1095() {
        class170 var1 = field903.method1900();
        class202 var2 = field903.field1477;
        try {
            if (field891 == 0) {
                if (var1 != null) {
                    var1.method3022();
                    var1 = null;
                }
                Statics.field1403 = null;
                field905 = false;
                field892 = 0;
                field891 = 1;
            }
            if (field891 == 1) {
                if (Statics.field1403 == null) {
                    Statics.field1403 = Statics.field684.method3002(Statics.field1066, Statics.field850);
                }
                if (Statics.field1403.field2190 == 2) {
                    throw new IOException();
                }
                if (Statics.field1403.field2190 == 1) {
                    if (field906) {
                        var1 = Statics.method2877((Socket) Statics.field1403.field2194, 40000, 5000);
                    } else {
                        var1 = new class174((Socket) Statics.field1403.field2194, Statics.field684, 5000);
                    }
                    field903.method1891(var1);
                    Statics.field1403 = null;
                    field891 = 2;
                }
            }
            if (field891 == 2) {
                field903.method1881();
                class185 var3 = class185.method42();
                var3.field2501.method3209(class183.field2478.field2477);
                field903.method1884(var3);
                field903.method1883();
                var2.field2566 = 0;
                field891 = 3;
            }
            if (field891 == 3) {
                if (Statics.field853 != null) {
                    Statics.field853.method2035();
                }
                if (Statics.field1825 != null) {
                    Statics.field1825.method2035();
                }
                boolean var4 = true;
                if (field906 && !var1.method3029(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method3019();
                    if (Statics.field853 != null) {
                        Statics.field853.method2035();
                    }
                    if (Statics.field1825 != null) {
                        Statics.field1825.method2035();
                    }
                    if (var5 != 0) {
                        method158(var5);
                        return;
                    }
                    var2.field2566 = 0;
                    field891 = 4;
                }
            }
            if (field891 == 4) {
                if (var2.field2566 < 8) {
                    int var6 = var1.method3018();
                    if (var6 > 8 - var2.field2566) {
                        var6 = 8 - var2.field2566;
                    }
                    if (var6 > 0) {
                        var1.method3026(var2.field2567, var2.field2566, var6);
                        var2.field2566 += var6;
                    }
                }
                if (var2.field2566 == 8) {
                    var2.field2566 = 0;
                    Statics.field36 = var2.method3231();
                    field891 = 5;
                }
            }
            if (field891 == 5) {
                field903.field1477.field2566 = 0;
                field903.method1881();
                class202 var7 = new class202(500);
                int[] var8 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field36 >> 32), (int) (Statics.field36 & 0xFFFFFFFFFFFFFFFFL) };
                var7.field2566 = 0;
                var7.method3209(1);
                var7.method3209(field1042.method8());
                var7.method3212(var8[0]);
                var7.method3212(var8[1]);
                var7.method3212(var8[2]);
                var7.method3212(var8[3]);
                switch(field1042.field2155) {
                    case 0:
                    case 2:
                        var7.method3384(Statics.field1146);
                        var7.field2566 += 5;
                        break;
                    case 1:
                        var7.method3212((Integer) Statics.field565.field1242.get(class319.method2661(class91.field1375)));
                        var7.field2566 += 4;
                        break;
                    case 3:
                        var7.field2566 += 8;
                }
                var7.method3216(class91.field1351);
                var7.method3247(class89.field1331, class89.field1327);
                class185 var9 = class185.method42();
                var9.field2501.field2566 = 0;
                if (field873 == 40) {
                    var9.field2501.method3209(class183.field2474.field2477);
                } else {
                    var9.field2501.method3209(class183.field2476.field2477);
                }
                var9.field2501.method3210(0);
                int var10 = var9.field2501.field2566;
                var9.field2501.method3212(167);
                var9.field2501.method3267(var7.field2567, 0, var7.field2566);
                int var11 = var9.field2501.field2566;
                var9.field2501.method3216(class91.field1375);
                var9.field2501.method3209((field1070 ? 1 : 0) << 1 | (field863 ? 1 : 0));
                var9.field2501.method3210(Statics.field3766);
                var9.field2501.method3210(Statics.field554);
                method3433(var9.field2501);
                var9.field2501.method3216(Statics.field1293);
                var9.field2501.method3212(Statics.field3919);
                class195 var12 = new class195(Statics.field4067.method5811());
                Statics.field4067.method5801(var12);
                var9.field2501.method3267(var12.field2567, 0, var12.field2567.length);
                var9.field2501.method3209(Statics.field2792);
                var9.field2501.method3212(0);
                var9.field2501.method3212(Statics.field2219.field3381);
                var9.field2501.method3212(Statics.field312.field3381);
                var9.field2501.method3212(Statics.field503.field3381);
                var9.field2501.method3212(Statics.field636.field3381);
                var9.field2501.method3212(Statics.field553.field3381);
                var9.field2501.method3212(Statics.field12.field3381);
                var9.field2501.method3212(Statics.field13.field3381);
                var9.field2501.method3212(Statics.field549.field3381);
                var9.field2501.method3212(Statics.field550.field3381);
                var9.field2501.method3212(Statics.field1148.field3381);
                var9.field2501.method3212(Statics.field1004.field3381);
                var9.field2501.method3212(Statics.field2148.field3381);
                var9.field2501.method3212(Statics.field446.field3381);
                var9.field2501.method3212(Statics.field304.field3381);
                var9.field2501.method3212(Statics.field791.field3381);
                var9.field2501.method3212(Statics.field2044.field3381);
                var9.field2501.method3212(Statics.field2129.field3381);
                var9.field2501.method3245(var8, var11, var9.field2501.field2566);
                var9.field2501.method3221(var9.field2501.field2566 - var10);
                field903.method1884(var9);
                field903.method1883();
                field903.field1476 = new class203(var8);
                for (int var13 = 0; var13 < 4; var13++) {
                    var8[var13] += 50;
                }
                var2.method3484(var8);
                field891 = 6;
            }
            if (field891 == 6 && var1.method3018() > 0) {
                int var14 = var1.method3019();
                if (var14 == 21 && field873 == 20) {
                    field891 = 7;
                } else if (var14 == 2) {
                    field891 = 9;
                } else if (var14 == 15 && field873 == 40) {
                    field903.field1479 = -1;
                    field891 = 13;
                } else if (var14 == 23 && field1111 < 1) {
                    field1111++;
                    field891 = 0;
                } else if (var14 == 29) {
                    field891 = 11;
                } else {
                    method158(var14);
                    return;
                }
            }
            if (field891 == 7 && var1.method3018() > 0) {
                field895 = (var1.method3019() + 3) * 60;
                field891 = 8;
            }
            if (field891 == 8) {
                field892 = 0;
                class91.method349(class252.field3148, class252.field3178, field895 / 60 + class252.field3054);
                if (--field895 <= 0) {
                    field891 = 0;
                }
            } else {
                if (field891 == 9 && var1.method3018() >= 13) {
                    boolean var15 = var1.method3019() == 1;
                    var1.method3026(var2.field2567, 0, 4);
                    var2.field2566 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = var2.method3487() << 24;
                        int var18 = var17 | var2.method3487() << 16;
                        int var19 = var18 | var2.method3487() << 8;
                        int var20 = var19 | var2.method3487();
                        int var21 = class319.method2661(class91.field1375);
                        if (Statics.field565.field1242.size() >= 10 && !Statics.field565.field1242.containsKey(var21)) {
                            Iterator var22 = Statics.field565.field1242.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field565.field1242.put(var21, var20);
                    }
                    if (class91.field1362) {
                        Statics.field565.field1235 = class91.field1375;
                    } else {
                        Statics.field565.field1235 = null;
                    }
                    class79.method612();
                    field1024 = var1.method3019();
                    field1026 = var1.method3019() == 1;
                    field1001 = var1.method3019();
                    field1001 <<= 0x8;
                    field1001 += var1.method3019();
                    field974 = var1.method3019();
                    var1.method3026(var2.field2567, 0, 1);
                    var2.field2566 = 0;
                    class181[] var23 = class181.method3077();
                    int var24 = var2.method3488();
                    if (var24 < 0 || var24 >= var23.length) {
                        throw new IOException(var24 + " " + var2.field2566);
                    }
                    field903.field1478 = var23[var24];
                    field903.field1479 = field903.field1478.field2371;
                    var1.method3026(var2.field2567, 0, 2);
                    var2.field2566 = 0;
                    field903.field1479 = var2.method3218();
                    try {
                        client var25 = Statics.field240;
                        JSObject.getWindow(var25).call("zap", (Object[]) null);
                    } catch (Throwable var36) {
                    }
                    field891 = 10;
                }
                if (field891 != 10) {
                    if (field891 == 11 && var1.method3018() >= 2) {
                        var2.field2566 = 0;
                        var1.method3026(var2.field2567, 0, 2);
                        var2.field2566 = 0;
                        Statics.field1787 = var2.method3218();
                        field891 = 12;
                    }
                    if (field891 == 12 && var1.method3018() >= Statics.field1787) {
                        var2.field2566 = 0;
                        var1.method3026(var2.field2567, 0, Statics.field1787);
                        var2.field2566 = 0;
                        String var27 = var2.method3427();
                        String var28 = var2.method3427();
                        String var29 = var2.method3427();
                        class91.method349(var27, var28, var29);
                        method666(10);
                    }
                    if (field891 == 13) {
                        if (field903.field1479 == -1) {
                            if (var1.method3018() < 2) {
                                return;
                            }
                            var1.method3026(var2.field2567, 0, 2);
                            var2.field2566 = 0;
                            field903.field1479 = var2.method3218();
                        }
                        if (var1.method3018() >= field903.field1479) {
                            var1.method3026(var2.field2567, 0, field903.field1479);
                            var2.field2566 = 0;
                            int var30 = field903.field1479;
                            field1051.method4853();
                            field903.method1881();
                            field903.field1477.field2566 = 0;
                            field903.field1478 = null;
                            field903.field1486 = null;
                            field903.field1474 = null;
                            field903.field1472 = null;
                            field903.field1479 = 0;
                            field903.field1481 = 0;
                            field874 = 0;
                            Statics.method588();
                            field1088 = 0;
                            field1086 = 0;
                            for (int var31 = 0; var31 < 2048; var31++) {
                                field972[var31] = null;
                            }
                            Statics.field260 = null;
                            for (int var32 = 0; var32 < field898.length; var32++) {
                                class85 var33 = field898[var32];
                                if (var33 != null) {
                                    var33.field1191 = -1;
                                    var33.field1178 = false;
                                }
                            }
                            class66.method3828();
                            method666(30);
                            for (int var34 = 0; var34 < 100; var34++) {
                                field1061[var34] = true;
                            }
                            method4177();
                            class94.method16(var2);
                            if (var2.field2566 != var30) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field892++;
                        if (field892 > 2000) {
                            if (field1111 < 1) {
                                if (Statics.field850 == Statics.field462) {
                                    Statics.field850 = Statics.field3879;
                                } else {
                                    Statics.field850 = Statics.field462;
                                }
                                field1111++;
                                field891 = 0;
                            } else {
                                method158(-3);
                            }
                        }
                    }
                } else if (var1.method3018() >= field903.field1479) {
                    var2.field2566 = 0;
                    var1.method3026(var2.field2567, 0, field903.field1479);
                    field1051.method4837();
                    Statics.method4158();
                    class94.method16(var2);
                    Statics.field2226 = -1;
                    method1001(false, var2);
                    field903.field1478 = null;
                }
            }
        } catch (IOException var37) {
            if (field1111 < 1) {
                if (Statics.field850 == Statics.field462) {
                    Statics.field850 = Statics.field3879;
                } else {
                    Statics.field850 = Statics.field462;
                }
                field1111++;
                field891 = 0;
            } else {
                method158(-2);
            }
        }
    }

    @ObfuscatedName("v.fw(II)V")
    public static void method158(int arg0) {
        if (arg0 == -3) {
            class91.method349(class252.field3122, class252.field3056, class252.field3269);
        } else if (arg0 == -2) {
            class91.method349(class252.field3053, class252.field3059, class252.field3060);
        } else if (arg0 == -1) {
            class91.method349(class252.field3169, class252.field3062, class252.field3216);
        } else if (arg0 == 3) {
            class91.field1356 = 3;
        } else if (arg0 == 4) {
            class91.method349(class252.field3023, class252.field3065, class252.field3066);
        } else if (arg0 == 5) {
            class91.method349(class252.field3067, class252.field3068, class252.field3069);
        } else if (arg0 == 6) {
            class91.method349(class252.field3070, class252.field3263, class252.field3072);
        } else if (arg0 == 7) {
            class91.method349(class252.field3113, class252.field3074, class252.field3217);
        } else if (arg0 == 8) {
            class91.method349(class252.field3076, class252.field3045, class252.field3078);
        } else if (arg0 == 9) {
            class91.method349(class252.field3080, class252.field3239, class252.field3081);
        } else if (arg0 == 10) {
            class91.method349(class252.field3082, class252.field3043, class252.field3084);
        } else if (arg0 == 11) {
            class91.method349(class252.field3272, class252.field3166, class252.field3025);
        } else if (arg0 == 12) {
            class91.method349(class252.field3088, class252.field3218, class252.field3090);
        } else if (arg0 == 13) {
            class91.method349(class252.field3039, class252.field3092, class252.field3093);
        } else if (arg0 == 14) {
            class91.method349(class252.field3094, class252.field3087, class252.field3050);
        } else if (arg0 == 16) {
            class91.method349(class252.field3097, class252.field3255, class252.field3099);
        } else if (arg0 == 17) {
            class91.method349(class252.field3100, class252.field3183, class252.field3102);
        } else if (arg0 == 18) {
            class91.method349(class252.field3103, class252.field3104, class252.field3105);
        } else if (arg0 == 19) {
            class91.method349(class252.field3051, class252.field3107, class252.field3108);
        } else if (arg0 == 20) {
            class91.method349(class252.field3121, class252.field3110, class252.field3111);
        } else if (arg0 == 22) {
            class91.method349(class252.field3112, class252.field3075, class252.field3096);
        } else if (arg0 == 23) {
            class91.method349(class252.field3115, class252.field3116, class252.field3117);
        } else if (arg0 == 24) {
            class91.method349(class252.field3207, class252.field3119, class252.field3120);
        } else if (arg0 == 25) {
            class91.method349(class252.field3172, class252.field3016, class252.field3224);
        } else if (arg0 == 26) {
            class91.method349(class252.field3124, class252.field3085, class252.field3052);
        } else if (arg0 == 27) {
            class91.method349(class252.field3127, class252.field3128, class252.field3129);
        } else if (arg0 == 31) {
            class91.method349(class252.field3095, class252.field3137, class252.field3138);
        } else if (arg0 == 32) {
            class91.method349(class252.field3139, class252.field3140, class252.field3141);
        } else if (arg0 == 37) {
            class91.method349(class252.field3286, class252.field3143, class252.field3144);
        } else if (arg0 == 38) {
            class91.method349(class252.field3145, class252.field3245, class252.field3101);
        } else if (arg0 == 55) {
            class91.method349(class252.field3226, class252.field3230, class252.field3150);
        } else if (arg0 == 56) {
            class91.method349(class252.field3151, class252.field3044, class252.field3153);
            method666(11);
            return;
        } else if (arg0 == 57) {
            class91.method349(class252.field3154, class252.field3155, class252.field3156);
            method666(11);
            return;
        } else {
            class91.method349(class252.field3157, class252.field3158, class252.field3159);
        }
        method666(10);
    }

    @ObfuscatedName("ct.fk(I)V")
    public static final void method1586() {
        field903.method1885();
        method145();
        Statics.field3868.method2666();
        for (int var0 = 0; var0 < 4; var0++) {
            field1048[var0].method3079();
        }
        System.gc();
        class230.method4299(2);
        field1090 = -1;
        field1091 = false;
        Statics.method3931();
        method666(10);
    }

    @ObfuscatedName("t.fq(I)V")
    public static final void method145() {
        class287.field3740.method3629();
        class274.method1627();
        Statics.method754();
        class283.field3601.method3629();
        class283.field3610.method3629();
        class283.field3591.method3629();
        class283.field3592.method3629();
        class286.method4167();
        class284.method663();
        class288.field3752.method3629();
        class288.field3753.method3629();
        Statics.method4159();
        class278.method2866();
        class269.method4437();
        class282.method2455();
        class276.field3526.method3629();
        class276.field3519.method3629();
        class280.method1470();
        class279.method259();
        class270.field3452.method3629();
        class240.field2786.method3629();
        class243.method130();
        ((class124) Statics.field1945).method2349();
        class97.field1450.method3629();
        Statics.field2219.method4206();
        Statics.field312.method4206();
        Statics.field636.method4206();
        Statics.field553.method4206();
        Statics.field12.method4206();
        Statics.field13.method4206();
        Statics.field549.method4206();
        Statics.field550.method4206();
        Statics.field1148.method4206();
        Statics.field1004.method4206();
        Statics.field2148.method4206();
        Statics.field446.method4206();
    }

    @ObfuscatedName("eo.fn(I)V")
    public static final void method2902() {
        if (field904 > 0) {
            method1586();
        } else {
            field1051.method4835();
            method666(40);
            Statics.field1325 = field903.method1900();
            field903.method1886();
        }
    }

    @ObfuscatedName("bp.ft(ZB)V")
    public static final void method953(boolean arg0) {
        if (arg0) {
            field1042 = class91.field1345 ? class159.field2151 : class159.field2157;
        } else {
            field1042 = Statics.field565.field1242.containsKey(class319.method2661(class91.field1375)) ? class159.field2158 : class159.field2154;
        }
    }

    @ObfuscatedName("client.fe(I)V")
    public final void method1213() {
        if (field874 > 1) {
            field874--;
        }
        if (field904 > 0) {
            field904--;
        }
        if (field905) {
            field905 = false;
            method2902();
            return;
        }
        if (!field992) {
            method114();
        }
        for (int var1 = 0; var1 < 100 && this.method1100(field903); var1++) {
        }
        if (field873 != 30) {
            return;
        }
        while (true) {
            class326 var2 = (class326) class327.field3952.method3684();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field1051.field3817) {
                    class185 var6 = class185.method2860(class182.field2428, field903.field1476);
                    var6.field2501.method3209(0);
                    int var7 = var6.field2501.field2566;
                    field1051.method4840(var6.field2501);
                    var6.field2501.method3222(var6.field2501.field2566 - var7);
                    field903.method1884(var6);
                    field1051.method4838();
                }
                Object var8 = Statics.field491.field796;
                synchronized (Statics.field491.field796) {
                    if (!field857) {
                        Statics.field491.field795 = 0;
                    } else if (class61.field709 != 0 || Statics.field491.field795 >= 40) {
                        class185 var9 = class185.method2860(class182.field2455, field903.field1476);
                        var9.field2501.method3209(0);
                        int var10 = var9.field2501.field2566;
                        int var11 = 0;
                        for (int var12 = 0; var12 < Statics.field491.field795 && var9.field2501.field2566 - var10 < 240; var12++) {
                            var11++;
                            int var13 = Statics.field491.field799[var12];
                            if (var13 < 0) {
                                var13 = 0;
                            } else if (var13 > 502) {
                                var13 = 502;
                            }
                            int var14 = Statics.field491.field794[var12];
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 764) {
                                var14 = 764;
                            }
                            int var15 = var13 * 765 + var14;
                            if (Statics.field491.field799[var12] == -1 && Statics.field491.field794[var12] == -1) {
                                var14 = -1;
                                var13 = -1;
                                var15 = 524287;
                            }
                            if (field991 != var14 || field949 != var13) {
                                int var16 = var14 - field991;
                                field991 = var14;
                                int var17 = var13 - field949;
                                field949 = var13;
                                if (field871 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                    var16 += 32;
                                    var17 += 32;
                                    var9.field2501.method3210((field871 << 12) + (var16 << 6) + var17);
                                    field871 = 0;
                                } else if (field871 < 8) {
                                    var9.field2501.method3384((field871 << 19) + 8388608 + var15);
                                    field871 = 0;
                                } else {
                                    var9.field2501.method3212((field871 << 19) + -1073741824 + var15);
                                    field871 = 0;
                                }
                            } else if (field871 < 2047) {
                                field871++;
                            }
                        }
                        var9.field2501.method3222(var9.field2501.field2566 - var10);
                        field903.method1884(var9);
                        if (var11 >= Statics.field491.field795) {
                            Statics.field491.field795 = 0;
                        } else {
                            Statics.field491.field795 -= var11;
                            for (int var18 = 0; var18 < Statics.field491.field795; var18++) {
                                Statics.field491.field794[var18] = Statics.field491.field794[var11 + var18];
                                Statics.field491.field799[var18] = Statics.field491.field799[var11 + var18];
                            }
                        }
                    }
                }
                if (class61.field709 == 1 || !Statics.field441 && class61.field709 == 4 || class61.field709 == 2) {
                    long var20 = (class61.field705 - field868) / 50L;
                    if (var20 > 4095L) {
                        var20 = 4095L;
                    }
                    field868 = class61.field705;
                    int var22 = class61.field711;
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 > Statics.field554) {
                        var22 = Statics.field554;
                    }
                    int var23 = class61.field712;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > Statics.field3766) {
                        var23 = Statics.field3766;
                    }
                    int var24 = (int) var20;
                    class185 var25 = class185.method2860(class182.field2397, field903.field1476);
                    var25.field2501.method3210((var24 << 1) + (class61.field709 == 2 ? 1 : 0));
                    var25.field2501.method3210(var23);
                    var25.field2501.method3210(var22);
                    field903.method1884(var25);
                }
                if (class52.field594 > 0) {
                    class185 var26 = class185.method2860(class182.field2391, field903.field1476);
                    var26.field2501.method3210(0);
                    int var27 = var26.field2501.field2566;
                    long var28 = class197.method26();
                    for (int var30 = 0; var30 < class52.field594; var30++) {
                        long var31 = var28 - field1080;
                        if (var31 > 16777215L) {
                            var31 = 16777215L;
                        }
                        field1080 = var28;
                        var26.field2501.method3209(class52.field614[var30]);
                        var26.field2501.method3384((int) var31);
                    }
                    var26.field2501.method3221(var26.field2501.field2566 - var27);
                    field903.method1884(var26);
                }
                if (field940 > 0) {
                    field940--;
                }
                if (class52.field608[96] || class52.field608[97] || class52.field608[98] || class52.field608[99]) {
                    field941 = true;
                }
                if (field941 && field940 <= 0) {
                    field940 = 20;
                    field941 = false;
                    class185 var33 = class185.method2860(class182.field2460, field903.field1476);
                    var33.field2501.method3210(field881);
                    var33.field2501.method3260(field926);
                    field903.method1884(var33);
                }
                if (Statics.field509 && !field1118) {
                    field1118 = true;
                    class185 var34 = class185.method2860(class182.field2446, field903.field1476);
                    var34.field2501.method3209(1);
                    field903.method1884(var34);
                }
                if (!Statics.field509 && field1118) {
                    field1118 = false;
                    class185 var35 = class185.method2860(class182.field2446, field903.field1476);
                    var35.field2501.method3209(0);
                    field903.method1884(var35);
                }
                if (Statics.field743 != null) {
                    Statics.field743.method5584();
                }
                if (Statics.field3393) {
                    if (Statics.field444 != null) {
                        Statics.field444.method4956();
                    }
                    method267();
                    Statics.field3393 = false;
                }
                if (Statics.field2770 != field1101) {
                    field1101 = Statics.field2770;
                    int var36 = Statics.field2770;
                    int[] var37 = Statics.field2372.field3987;
                    int var38 = var37.length;
                    for (int var39 = 0; var39 < var38; var39++) {
                        var37[var39] = 0;
                    }
                    for (int var40 = 1; var40 < 103; var40++) {
                        int var41 = (103 - var40) * 2048 + 24628;
                        for (int var42 = 1; var42 < 103; var42++) {
                            if ((class63.field721[var36][var42][var40] & 0x18) == 0) {
                                Statics.field3868.method2698(var37, var41, 512, var36, var42, var40);
                            }
                            if (var36 < 3 && (class63.field721[var36 + 1][var42][var40] & 0x8) != 0) {
                                Statics.field3868.method2698(var37, var41, 512, var36 + 1, var42, var40);
                            }
                            var41 += 4;
                        }
                    }
                    int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field2372.method5476();
                    for (int var45 = 1; var45 < 103; var45++) {
                        for (int var46 = 1; var46 < 103; var46++) {
                            if ((class63.field721[var36][var46][var45] & 0x18) == 0) {
                                method1519(var36, var46, var45, var43, var44);
                            }
                            if (var36 < 3 && (class63.field721[var36 + 1][var46][var45] & 0x8) != 0) {
                                method1519(var36 + 1, var46, var45, var43, var44);
                            }
                        }
                    }
                    field1082 = 0;
                    for (int var47 = 0; var47 < 104; var47++) {
                        for (int var48 = 0; var48 < 104; var48++) {
                            int var49 = Statics.field3868.method2693(Statics.field2770, var47, var48);
                            if (var49 != 0) {
                                int var50 = var49 >> 14 & 0x7FFF;
                                int var51 = class283.method4185(var50).field3615;
                                if (var51 >= 0) {
                                    field1085[field1082] = Statics.field3472[var51].method4380(false);
                                    field1083[field1082] = var47;
                                    field1084[field1082] = var48;
                                    field1082++;
                                }
                            }
                        }
                    }
                    Statics.field3942.method5408();
                }
                if (field873 != 30) {
                    return;
                }
                for (class75 var52 = (class75) field1116.method3723(); var52 != null; var52 = (class75) field1116.method3722()) {
                    if (var52.field1137 > 0) {
                        var52.field1137--;
                    }
                    if (var52.field1137 == 0) {
                        if (var52.field1138 >= 0) {
                            int var53 = var52.field1138;
                            int var54 = var52.field1135;
                            class283 var55 = class283.method4185(var53);
                            if (var54 == 11) {
                                var54 = 10;
                            }
                            if (var54 >= 5 && var54 <= 8) {
                                var54 = 4;
                            }
                            boolean var56 = var55.method4629(var54);
                            if (!var56) {
                                continue;
                            }
                        }
                        method721(var52.field1140, var52.field1136, var52.field1149, var52.field1141, var52.field1138, var52.field1139, var52.field1135);
                        var52.method3710();
                    } else {
                        if (var52.field1144 > 0) {
                            var52.field1144--;
                        }
                        if (var52.field1144 == 0 && var52.field1149 >= 1 && var52.field1141 >= 1 && var52.field1149 <= 102 && var52.field1141 <= 102) {
                            if (var52.field1134 >= 0) {
                                int var57 = var52.field1134;
                                int var58 = var52.field1143;
                                class283 var59 = class283.method4185(var57);
                                if (var58 == 11) {
                                    var58 = 10;
                                }
                                if (var58 >= 5 && var58 <= 8) {
                                    var58 = 4;
                                }
                                boolean var60 = var59.method4629(var58);
                                if (!var60) {
                                    continue;
                                }
                            }
                            method721(var52.field1140, var52.field1136, var52.field1149, var52.field1141, var52.field1134, var52.field1142, var52.field1143);
                            var52.field1144 = -1;
                            if (var52.field1138 == var52.field1134 && var52.field1138 == -1) {
                                var52.method3710();
                            } else if (var52.field1138 == var52.field1134 && var52.field1142 == var52.field1139 && var52.field1143 == var52.field1135) {
                                var52.method3710();
                            }
                        }
                    }
                }
                method3164();
                field903.field1481++;
                if (field903.field1481 > 750) {
                    method2902();
                    return;
                }
                method981();
                method1507();
                int[] var61 = class94.field1416;
                for (int var62 = 0; var62 < class94.field1415; var62++) {
                    class73 var63 = field972[var61[var62]];
                    if (var63 != null && var63.field1167 > 0) {
                        var63.field1167--;
                        if (var63.field1167 == 0) {
                            var63.field1153 = null;
                        }
                    }
                }
                for (int var64 = 0; var64 < field899; var64++) {
                    int var65 = field900[var64];
                    class85 var66 = field898[var65];
                    if (var66 != null && var66.field1167 > 0) {
                        var66.field1167--;
                        if (var66.field1167 == 0) {
                            var66.field1153 = null;
                        }
                    }
                }
                field894++;
                if (field960 != 0) {
                    field959 += 20;
                    if (field959 >= 400) {
                        field960 = 0;
                    }
                }
                if (Statics.field751 != null) {
                    field988++;
                    if (field988 >= 15) {
                        method260(Statics.field751);
                        Statics.field751 = null;
                    }
                }
                class243 var67 = Statics.field2776;
                class243 var68 = Statics.field332;
                Statics.field2776 = null;
                Statics.field332 = null;
                field1032 = null;
                field878 = false;
                field1033 = false;
                field1077 = 0;
                while (Statics.method483() && field1077 < 128) {
                    if (field1024 >= 2 && class52.field608[82] && Statics.field1840 == 66) {
                        String var69 = "";
                        Iterator var70 = class96.field1433.iterator();
                        while (var70.hasNext()) {
                            class71 var71 = (class71) var70.next();
                            var69 = var69 + var71.field807 + ':' + var71.field813 + '\n';
                        }
                        Statics.field240.method797(var69);
                    } else if (field931 != 1 || Statics.field3347 <= 0) {
                        field950[field1077] = Statics.field1840;
                        field1078[field1077] = Statics.field3347;
                        field1077++;
                    }
                }
                if (method4031() && class52.field608[82] && class52.field608[81] && field1054 != 0) {
                    int var74 = Statics.field260.field843 - field1054;
                    if (var74 < 0) {
                        var74 = 0;
                    } else if (var74 > 3) {
                        var74 = 3;
                    }
                    if (Statics.field260.field843 != var74) {
                        method115(Statics.field2499 + Statics.field260.field1189[0], Statics.field29 + Statics.field260.field1207[0], var74, false);
                    }
                    field1054 = 0;
                }
                if (field1017 != -1) {
                    method497(field1017, 0, 0, Statics.field3766, Statics.field554, 0, 0);
                }
                field1041++;
                while (true) {
                    class69 var75;
                    class243 var76;
                    class243 var77;
                    do {
                        var75 = (class69) field971.method3718();
                        if (var75 == null) {
                            while (true) {
                                class69 var78;
                                class243 var79;
                                class243 var80;
                                do {
                                    var78 = (class69) field1130.method3718();
                                    if (var78 == null) {
                                        while (true) {
                                            class69 var81;
                                            class243 var82;
                                            class243 var83;
                                            do {
                                                var81 = (class69) field1055.method3718();
                                                if (var81 == null) {
                                                    this.method1269();
                                                    method37();
                                                    if (field1028 != null) {
                                                        this.method1224();
                                                    }
                                                    if (Statics.field2150 != null) {
                                                        method260(Statics.field2150);
                                                        field969++;
                                                        if (class61.field702 == 0) {
                                                            if (field1110) {
                                                                if (Statics.field2150 == Statics.field1702 && field1087 != field1081) {
                                                                    class243 var84 = Statics.field2150;
                                                                    byte var85 = 0;
                                                                    if (field1020 == 1 && var84.field2819 == 206) {
                                                                        var85 = 1;
                                                                    }
                                                                    if (var84.field2879[field1087] <= 0) {
                                                                        var85 = 0;
                                                                    }
                                                                    int var86 = method580(var84);
                                                                    boolean var87 = (var86 >> 29 & 0x1) != 0;
                                                                    if (var87) {
                                                                        int var88 = field1081;
                                                                        int var89 = field1087;
                                                                        var84.field2879[var89] = var84.field2879[var88];
                                                                        var84.field2934[var89] = var84.field2934[var88];
                                                                        var84.field2879[var88] = -1;
                                                                        var84.field2934[var88] = 0;
                                                                    } else if (var85 == 1) {
                                                                        int var90 = field1081;
                                                                        int var91 = field1087;
                                                                        while (var90 != var91) {
                                                                            if (var90 > var91) {
                                                                                var84.method4105(var90 - 1, var90);
                                                                                var90--;
                                                                            } else if (var90 < var91) {
                                                                                var84.method4105(var90 + 1, var90);
                                                                                var90++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var84.method4105(field1087, field1081);
                                                                    }
                                                                    class185 var92 = class185.method2860(class182.field2426, field903.field1476);
                                                                    var92.field2501.method3354(field1087);
                                                                    var92.field2501.method3325(field1081);
                                                                    var92.field2501.method3383(Statics.field2150.field2815);
                                                                    var92.field2501.method3209(var85);
                                                                    field903.method1884(var92);
                                                                }
                                                            } else if (this.method1102()) {
                                                                this.method1241(field965, field1057);
                                                            } else if (field993 > 0) {
                                                                int var93 = field965;
                                                                int var94 = field1057;
                                                                class88 var95 = Statics.field1466;
                                                                method3120(var95.field1319, var95.field1320, var95.field1321, var95.field1322, var95.field1324, var95.field1324, var93, var94);
                                                                Statics.field1466 = null;
                                                            }
                                                            field988 = 10;
                                                            class61.field709 = 0;
                                                            Statics.field2150 = null;
                                                        } else if (field969 >= 5 && (class61.field701 > field965 + 5 || class61.field701 < field965 - 5 || class61.field694 > field1057 + 5 || class61.field694 < field1057 - 5)) {
                                                            field1110 = true;
                                                        }
                                                    }
                                                    if (class138.method2703()) {
                                                        int var96 = class138.field2012;
                                                        int var97 = class138.field2013;
                                                        class185 var98 = class185.method2860(class182.field2398, field903.field1476);
                                                        var98.field2501.method3209(5);
                                                        var98.field2501.method3396(class52.field608[82] ? (class52.field608[81] ? 2 : 1) : 0);
                                                        var98.field2501.method3210(Statics.field29 + var97);
                                                        var98.field2501.method3354(Statics.field2499 + var96);
                                                        field903.method1884(var98);
                                                        class138.method2836();
                                                        field962 = class61.field712;
                                                        field958 = class61.field711;
                                                        field960 = 1;
                                                        field959 = 0;
                                                        field1086 = var96;
                                                        field1006 = var97;
                                                    }
                                                    if (Statics.field2776 != var67) {
                                                        if (var67 != null) {
                                                            method260(var67);
                                                        }
                                                        if (Statics.field2776 != null) {
                                                            method260(Statics.field2776);
                                                        }
                                                    }
                                                    if (Statics.field332 != var68 && field1008 == field1007) {
                                                        if (var68 != null) {
                                                            method260(var68);
                                                        }
                                                        if (Statics.field332 != null) {
                                                            method260(Statics.field332);
                                                        }
                                                    }
                                                    if (Statics.field332 == null) {
                                                        if (field1007 > 0) {
                                                            field1007--;
                                                        }
                                                    } else if (field1007 < field1008) {
                                                        field1007++;
                                                        if (field1008 == field1007) {
                                                            method260(Statics.field332);
                                                        }
                                                    }
                                                    method3538();
                                                    if (field1100) {
                                                        int var99 = Statics.field452 * 128 + 64;
                                                        int var100 = Statics.field262 * 128 + 64;
                                                        int var101 = method17(var99, var100, Statics.field2770) - Statics.field3524;
                                                        if (Statics.field3767 < var99) {
                                                            Statics.field3767 += Statics.field579 * (var99 - Statics.field3767) / 1000 + Statics.field1591;
                                                            if (Statics.field3767 > var99) {
                                                                Statics.field3767 = var99;
                                                            }
                                                        }
                                                        if (Statics.field3767 > var99) {
                                                            Statics.field3767 -= Statics.field579 * (Statics.field3767 - var99) / 1000 + Statics.field1591;
                                                            if (Statics.field3767 < var99) {
                                                                Statics.field3767 = var99;
                                                            }
                                                        }
                                                        if (Statics.field3473 < var101) {
                                                            Statics.field3473 += Statics.field579 * (var101 - Statics.field3473) / 1000 + Statics.field1591;
                                                            if (Statics.field3473 > var101) {
                                                                Statics.field3473 = var101;
                                                            }
                                                        }
                                                        if (Statics.field3473 > var101) {
                                                            Statics.field3473 -= Statics.field579 * (Statics.field3473 - var101) / 1000 + Statics.field1591;
                                                            if (Statics.field3473 < var101) {
                                                                Statics.field3473 = var101;
                                                            }
                                                        }
                                                        if (Statics.field1469 < var100) {
                                                            Statics.field1469 += Statics.field579 * (var100 - Statics.field1469) / 1000 + Statics.field1591;
                                                            if (Statics.field1469 > var100) {
                                                                Statics.field1469 = var100;
                                                            }
                                                        }
                                                        if (Statics.field1469 > var100) {
                                                            Statics.field1469 -= Statics.field579 * (Statics.field1469 - var100) / 1000 + Statics.field1591;
                                                            if (Statics.field1469 < var100) {
                                                                Statics.field1469 = var100;
                                                            }
                                                        }
                                                        int var102 = Statics.field3442 * 128 + 64;
                                                        int var103 = Statics.field2124 * 128 + 64;
                                                        int var104 = method17(var102, var103, Statics.field2770) - Statics.field1318;
                                                        int var105 = var102 - Statics.field3767;
                                                        int var106 = var104 - Statics.field3473;
                                                        int var107 = var103 - Statics.field1469;
                                                        int var108 = (int) Math.sqrt((double) (var105 * var105 + var107 * var107));
                                                        int var109 = (int) (Math.atan2((double) var106, (double) var108) * 325.949D) & 0x7FF;
                                                        int var110 = (int) (Math.atan2((double) var105, (double) var107) * -325.949D) & 0x7FF;
                                                        if (var109 < 128) {
                                                            var109 = 128;
                                                        }
                                                        if (var109 > 383) {
                                                            var109 = 383;
                                                        }
                                                        if (Statics.field242 < var109) {
                                                            Statics.field242 += Statics.field486 * (var109 - Statics.field242) / 1000 + Statics.field295;
                                                            if (Statics.field242 > var109) {
                                                                Statics.field242 = var109;
                                                            }
                                                        }
                                                        if (Statics.field242 > var109) {
                                                            Statics.field242 -= Statics.field486 * (Statics.field242 - var109) / 1000 + Statics.field295;
                                                            if (Statics.field242 < var109) {
                                                                Statics.field242 = var109;
                                                            }
                                                        }
                                                        int var111 = var110 - Statics.field2454;
                                                        if (var111 > 1024) {
                                                            var111 -= 2048;
                                                        }
                                                        if (var111 < -1024) {
                                                            var111 += 2048;
                                                        }
                                                        if (var111 > 0) {
                                                            Statics.field2454 += Statics.field486 * var111 / 1000 + Statics.field295;
                                                            Statics.field2454 &= 0x7FF;
                                                        }
                                                        if (var111 < 0) {
                                                            Statics.field2454 -= Statics.field486 * -var111 / 1000 + Statics.field295;
                                                            Statics.field2454 &= 0x7FF;
                                                        }
                                                        int var112 = var110 - Statics.field2454;
                                                        if (var112 > 1024) {
                                                            var112 -= 2048;
                                                        }
                                                        if (var112 < -1024) {
                                                            var112 += 2048;
                                                        }
                                                        if (var112 < 0 && var111 > 0 || var112 > 0 && var111 < 0) {
                                                            Statics.field2454 = var110;
                                                        }
                                                    }
                                                    for (int var113 = 0; var113 < 5; var113++) {
                                                        int var10002 = field1105[var113]++;
                                                    }
                                                    Statics.field2152.method1812();
                                                    int var114 = ++class61.field698 - 1;
                                                    int var116 = class52.field612;
                                                    if (var114 > 15000 && var116 > 15000) {
                                                        field904 = 250;
                                                        class61.field698 = 14500;
                                                        class185 var118 = class185.method2860(class182.field2442, field903.field1476);
                                                        field903.method1884(var118);
                                                    }
                                                    Statics.field2183.method1524();
                                                    field903.field1482++;
                                                    if (field903.field1482 > 50) {
                                                        class185 var119 = class185.method2860(class182.field2413, field903.field1476);
                                                        field903.method1884(var119);
                                                    }
                                                    try {
                                                        field903.method1883();
                                                    } catch (IOException var121) {
                                                        method2902();
                                                    }
                                                    return;
                                                }
                                                var82 = var81.field781;
                                                if (var82.field2816 < 0) {
                                                    break;
                                                }
                                                var83 = class243.method3(var82.field2886);
                                            } while (var83 == null || var83.field2939 == null || var82.field2816 >= var83.field2939.length || var83.field2939[var82.field2816] != var82);
                                            class82.method3463(var81);
                                        }
                                    }
                                    var79 = var78.field781;
                                    if (var79.field2816 < 0) {
                                        break;
                                    }
                                    var80 = class243.method3(var79.field2886);
                                } while (var80 == null || var80.field2939 == null || var79.field2816 >= var80.field2939.length || var80.field2939[var79.field2816] != var79);
                                class82.method3463(var78);
                            }
                        }
                        var76 = var75.field781;
                        if (var76.field2816 < 0) {
                            break;
                        }
                        var77 = class243.method3(var76.field2886);
                    } while (var77 == null || var77.field2939 == null || var76.field2816 >= var77.field2939.length || var77.field2939[var76.field2816] != var76);
                    class82.method3463(var75);
                }
            }
            class185 var4 = class185.method2860(class182.field2466, field903.field1476);
            var4.field2501.method3209(0);
            int var5 = var4.field2501.field2566;
            class327.method5094(var4.field2501);
            var4.field2501.method3222(var4.field2501.field2566 - var5);
            field903.method1884(var4);
        }
    }

    @ObfuscatedName("aa.fd(I)V")
    public static final void method348() {
        if (Statics.field1825 != null) {
            Statics.field1825.method2050();
        }
        if (Statics.field853 != null) {
            Statics.field853.method2050();
        }
    }

    @ObfuscatedName("gc.gn(I)V")
    public static final void method3164() {
        for (int var0 = 0; var0 < field1094; var0++) {
            int var10002 = field1097[var0]--;
            if (field1097[var0] >= -10) {
                class104 var2 = field1099[var0];
                if (var2 == null) {
                    class104 var10000 = (class104) null;
                    var2 = class104.method1965(Statics.field553, field886[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1097[var0] += var2.method1960();
                    field1099[var0] = var2;
                }
                if (field1097[var0] < 0) {
                    int var9;
                    if (field1098[var0] == 0) {
                        var9 = field1092;
                    } else {
                        int var3 = (field1098[var0] & 0xFF) * 128;
                        int var4 = field1098[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field260.field1186;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1098[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field260.field1210;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1097[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1035 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class106 var10 = var2.method1959().method2007(Statics.field2572);
                        class116 var11 = class116.method2124(var10, 100, var9);
                        var11.method2127(field920[var0] - 1);
                        Statics.field633.method1933(var11);
                    }
                    field1097[var0] = -100;
                }
            } else {
                field1094--;
                for (int var1 = var0; var1 < field1094; var1++) {
                    field886[var1] = field886[var1 + 1];
                    field1099[var1] = field1099[var1 + 1];
                    field920[var1] = field920[var1 + 1];
                    field1097[var1] = field1097[var1 + 1];
                    field1098[var1] = field1098[var1 + 1];
                }
                var0--;
            }
        }
        if (field1091 && !class230.method1777()) {
            if (field1045 != 0 && field1090 != -1) {
                class230.method1857(Statics.field13, field1090, 0, field1045, false);
            }
            field1091 = false;
        }
    }

    @ObfuscatedName("ae.gk(Lkn;IIII)V")
    public static void method492(class288 arg0, int arg1, int arg2, int arg3) {
        if (field1094 >= 50 || field1035 == 0 || arg0.field3760 == null || arg1 >= arg0.field3760.length) {
            return;
        }
        int var4 = arg0.field3760[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field886[field1094] = var5;
        field920[field1094] = var6;
        field1097[field1094] = 0;
        field1099[field1094] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1098[field1094] = (var8 << 16) + (var9 << 8) + var7;
        field1094++;
    }

    @ObfuscatedName("cb.ge(III)V")
    public static void method1856(int arg0, int arg1) {
        if (field1045 != 0 && arg0 != -1) {
            class230.method1857(Statics.field2148, arg0, 0, field1045, false);
            field1091 = true;
        }
    }

    @ObfuscatedName("jw.gt(Lib;IIB)V")
    public static final void method4511(class243 arg0, int arg1, int arg2) {
        if (field1088 != 0 && field1088 != 3 || class61.field709 != 1 && Statics.field441 || class61.field709 != 4) {
            return;
        }
        class237 var3 = arg0.method4129(true);
        if (var3 == null) {
            return;
        }
        int var4 = class61.field712 - arg1;
        int var5 = class61.field711 - arg2;
        if (!var3.method4028(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2766 / 2;
        int var7 = var5 - var3.field2764 / 2;
        int var8 = field926 & 0x7FF;
        int var9 = class135.field1956[var8];
        int var10 = class135.field1934[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field260.field1186 + var11 >> 7;
        int var14 = Statics.field260.field1210 - var12 >> 7;
        class185 var15 = class185.method2860(class182.field2386, field903.field1476);
        var15.field2501.method3209(18);
        var15.field2501.method3396(class52.field608[82] ? (class52.field608[81] ? 2 : 1) : 0);
        var15.field2501.method3210(Statics.field29 + var14);
        var15.field2501.method3354(Statics.field2499 + var13);
        var15.field2501.method3209(var6);
        var15.field2501.method3209(var7);
        var15.field2501.method3210(field926);
        var15.field2501.method3209(57);
        var15.field2501.method3209(0);
        var15.field2501.method3209(0);
        var15.field2501.method3209(89);
        var15.field2501.method3210(Statics.field260.field1186);
        var15.field2501.method3210(Statics.field260.field1210);
        var15.field2501.method3209(63);
        field903.method1884(var15);
        field1086 = var13;
        field1006 = var14;
    }

    @ObfuscatedName("gj.gc(I)V")
    public static final void method3538() {
        if (field931 == 0) {
            int var0 = Statics.field260.field1186;
            int var1 = Statics.field260.field1210;
            if (Statics.field2523 - var0 < -500 || Statics.field2523 - var0 > 500 || Statics.field1475 - var1 < -500 || Statics.field1475 - var1 > 500) {
                Statics.field2523 = var0;
                Statics.field1475 = var1;
            }
            if (Statics.field2523 != var0) {
                Statics.field2523 += (var0 - Statics.field2523) / 16;
            }
            if (Statics.field1475 != var1) {
                Statics.field1475 += (var1 - Statics.field1475) / 16;
            }
            int var2 = Statics.field2523 >> 7;
            int var3 = Statics.field1475 >> 7;
            int var4 = method17(Statics.field2523, Statics.field1475, Statics.field2770);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field2770;
                        if (var8 < 3 && (class63.field721[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class63.field729[var8][var6][var7];
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
            if (var10 > field942) {
                field942 += (var10 - field942) / 24;
            } else if (var10 < field942) {
                field942 += (var10 - field942) / 80;
            }
            Statics.field3458 = method17(Statics.field260.field1186, Statics.field260.field1210, Statics.field2770) - field932;
        } else if (field931 == 1) {
            if (field939 && Statics.field260 != null) {
                int var11 = Statics.field260.field1189[0];
                int var12 = Statics.field260.field1207[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field2523 = Statics.field260.field1186;
                    int var13 = method17(Statics.field260.field1186, Statics.field260.field1210, Statics.field2770) - field932;
                    if (var13 < Statics.field3458) {
                        Statics.field3458 = var13;
                    }
                    Statics.field1475 = Statics.field260.field1210;
                    field939 = false;
                }
            }
            short var14 = -1;
            if (class52.field608[33]) {
                var14 = 0;
            } else if (class52.field608[49]) {
                var14 = 1024;
            }
            if (class52.field608[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class52.field608[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class52.field608[35]) {
                var15 = -1;
            } else if (class52.field608[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class52.field608[81] ? field937 : field936;
                var16 = var17 * 16;
                field934 = var14;
                field935 = var15;
            }
            if (field933 < var16) {
                field933 += var16 / 8;
                if (field933 > var16) {
                    field933 = var16;
                }
            } else if (field933 > var16) {
                field933 = field933 * 9 / 10;
            }
            if (field933 > 0) {
                int var18 = field933 / 16;
                if (field934 >= 0) {
                    int var19 = field934 - Statics.field2454 & 0x7FF;
                    int var20 = class135.field1956[var19];
                    int var21 = class135.field1934[var19];
                    Statics.field2523 += var18 * var20 / 65536;
                    Statics.field1475 += var18 * var21 / 65536;
                }
                if (field935 != 0) {
                    Statics.field3458 += field935 * var18;
                    if (Statics.field3458 > 0) {
                        Statics.field3458 = 0;
                    }
                }
            } else {
                field934 = -1;
                field935 = -1;
            }
            if (class52.field608[13]) {
                method2858();
            }
        }
        if (class61.field702 == 4 && Statics.field441) {
            int var22 = class61.field694 - field930;
            field1117 = var22 * 2;
            field930 = var22 == -1 || var22 == 1 ? class61.field694 : (field930 + class61.field694) / 2;
            int var23 = field929 - class61.field701;
            field914 = var23 * 2;
            field929 = var23 == -1 || var23 == 1 ? class61.field701 : (field929 + class61.field701) / 2;
        } else {
            if (class52.field608[96]) {
                field914 += (-24 - field914) / 2;
            } else if (class52.field608[97]) {
                field914 += (24 - field914) / 2;
            } else {
                field914 /= 2;
            }
            if (class52.field608[98]) {
                field1117 += (12 - field1117) / 2;
            } else if (class52.field608[99]) {
                field1117 += (-12 - field1117) / 2;
            } else {
                field1117 /= 2;
            }
            field930 = class61.field694;
            field929 = class61.field701;
        }
        field926 = field914 / 2 + field926 & 0x7FF;
        field881 += field1117 / 2;
        if (field881 < 128) {
            field881 = 128;
        }
        if (field881 > 383) {
            field881 = 383;
        }
    }

    @ObfuscatedName("bc.ga(I)V")
    public static final void method981() {
        int var0 = class94.field1415;
        int[] var1 = class94.field1416;
        for (int var2 = 0; var2 < var0; var2++) {
            class73 var3 = field972[var1[var2]];
            if (var3 != null) {
                method265(var3, 1);
            }
        }
    }

    @ObfuscatedName("bz.gb(I)V")
    public static final void method1507() {
        for (int var0 = 0; var0 < field899; var0++) {
            int var1 = field900[var0];
            class85 var2 = field898[var1];
            if (var2 != null) {
                method265(var2, var2.field1301.field3703);
            }
        }
    }

    @ObfuscatedName("ab.gv(Lbg;II)V")
    public static final void method265(class76 arg0, int arg1) {
        if (arg0.field1197 > field867) {
            int var2 = arg0.field1197 - field867;
            int var3 = arg0.field1193 * 128 + arg0.field1154 * 64;
            int var4 = arg0.field1203 * 128 + arg0.field1154 * 64;
            arg0.field1186 += (var3 - arg0.field1186) / var2;
            arg0.field1210 += (var4 - arg0.field1210) / var2;
            arg0.field1209 = 0;
            arg0.field1202 = arg0.field1199;
        } else if (arg0.field1198 >= field867) {
            method579(arg0);
        } else {
            method1685(arg0);
        }
        if (arg0.field1186 < 128 || arg0.field1210 < 128 || arg0.field1186 >= 13184 || arg0.field1210 >= 13184) {
            arg0.field1183 = -1;
            arg0.field1188 = -1;
            arg0.field1197 = 0;
            arg0.field1198 = 0;
            arg0.field1186 = arg0.field1189[0] * 128 + arg0.field1154 * 64;
            arg0.field1210 = arg0.field1207[0] * 128 + arg0.field1154 * 64;
            arg0.method1455();
        }
        if (Statics.field260 == arg0 && (arg0.field1186 < 1536 || arg0.field1210 < 1536 || arg0.field1186 >= 11776 || arg0.field1210 >= 11776)) {
            arg0.field1183 = -1;
            arg0.field1188 = -1;
            arg0.field1197 = 0;
            arg0.field1198 = 0;
            arg0.field1186 = arg0.field1189[0] * 128 + arg0.field1154 * 64;
            arg0.field1210 = arg0.field1207[0] * 128 + arg0.field1154 * 64;
            arg0.method1455();
        }
        if (arg0.field1204 != 0) {
            if (arg0.field1191 != -1) {
                class76 var5 = null;
                if (arg0.field1191 < 32768) {
                    var5 = field898[arg0.field1191];
                } else if (arg0.field1191 >= 32768) {
                    var5 = field972[arg0.field1191 - 32768];
                }
                if (var5 != null) {
                    int var6 = arg0.field1186 - var5.field1186;
                    int var7 = arg0.field1210 - var5.field1210;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field1202 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1178) {
                    arg0.field1191 = -1;
                    arg0.field1178 = false;
                }
            }
            if (arg0.field1166 != -1 && (arg0.field1205 == 0 || arg0.field1209 > 0)) {
                arg0.field1202 = arg0.field1166;
                arg0.field1166 = -1;
            }
            int var8 = arg0.field1202 - arg0.field1152 & 0x7FF;
            if (var8 == 0 && arg0.field1178) {
                arg0.field1191 = -1;
                arg0.field1178 = false;
            }
            if (var8 == 0) {
                arg0.field1150 = 0;
            } else {
                arg0.field1150++;
                if (var8 > 1024) {
                    arg0.field1152 -= arg0.field1204;
                    boolean var9 = true;
                    if (var8 < arg0.field1204 || var8 > 2048 - arg0.field1204) {
                        arg0.field1152 = arg0.field1202;
                        var9 = false;
                    }
                    if (arg0.field1174 == arg0.field1156 && (arg0.field1150 > 25 || var9)) {
                        if (arg0.field1196 == -1) {
                            arg0.field1174 = arg0.field1159;
                        } else {
                            arg0.field1174 = arg0.field1196;
                        }
                    }
                } else {
                    arg0.field1152 += arg0.field1204;
                    boolean var10 = true;
                    if (var8 < arg0.field1204 || var8 > 2048 - arg0.field1204) {
                        arg0.field1152 = arg0.field1202;
                        var10 = false;
                    }
                    if (arg0.field1174 == arg0.field1156 && (arg0.field1150 > 25 || var10)) {
                        if (arg0.field1158 == -1) {
                            arg0.field1174 = arg0.field1159;
                        } else {
                            arg0.field1174 = arg0.field1158;
                        }
                    }
                }
                arg0.field1152 &= 0x7FF;
            }
        }
        method723(arg0);
    }

    @ObfuscatedName("ad.go(Lbg;I)V")
    public static final void method579(class76 arg0) {
        if (field867 == arg0.field1198 || arg0.field1183 == -1 || arg0.field1165 != 0 || arg0.field1185 + 1 > class288.method3535(arg0.field1183).field3764[arg0.field1184]) {
            int var1 = arg0.field1198 - arg0.field1197;
            int var2 = field867 - arg0.field1197;
            int var3 = arg0.field1193 * 128 + arg0.field1154 * 64;
            int var4 = arg0.field1203 * 128 + arg0.field1154 * 64;
            int var5 = arg0.field1194 * 128 + arg0.field1154 * 64;
            int var6 = arg0.field1179 * 128 + arg0.field1154 * 64;
            arg0.field1186 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1210 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1209 = 0;
        arg0.field1202 = arg0.field1199;
        arg0.field1152 = arg0.field1202;
    }

    @ObfuscatedName("cu.gy(Lbg;I)V")
    public static final void method1685(class76 arg0) {
        arg0.field1174 = arg0.field1156;
        if (arg0.field1205 == 0) {
            arg0.field1209 = 0;
            return;
        }
        if (arg0.field1183 != -1 && arg0.field1165 == 0) {
            class288 var1 = class288.method3535(arg0.field1183);
            if (arg0.field1195 > 0 && var1.field3762 == 0) {
                arg0.field1209++;
                return;
            }
            if (arg0.field1195 <= 0 && var1.field3763 == 0) {
                arg0.field1209++;
                return;
            }
        }
        int var2 = arg0.field1186;
        int var3 = arg0.field1210;
        int var4 = arg0.field1189[arg0.field1205 - 1] * 128 + arg0.field1154 * 64;
        int var5 = arg0.field1207[arg0.field1205 - 1] * 128 + arg0.field1154 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1202 = 1280;
            } else if (var3 > var5) {
                arg0.field1202 = 1792;
            } else {
                arg0.field1202 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1202 = 768;
            } else if (var3 > var5) {
                arg0.field1202 = 256;
            } else {
                arg0.field1202 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1202 = 1024;
        } else if (var3 > var5) {
            arg0.field1202 = 0;
        }
        byte var6 = arg0.field1177[arg0.field1205 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1186 = var4;
            arg0.field1210 = var5;
            arg0.field1205--;
            if (arg0.field1195 > 0) {
                arg0.field1195--;
            }
            return;
        }
        int var7 = arg0.field1202 - arg0.field1152 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1173;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1159;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1162;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1161;
        }
        if (var8 == -1) {
            var8 = arg0.field1159;
        }
        arg0.field1174 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class85) {
            var10 = ((class85) arg0).field1301.field3731;
        }
        if (var10) {
            if (arg0.field1202 != arg0.field1152 && arg0.field1191 == -1 && arg0.field1204 != 0) {
                var9 = 2;
            }
            if (arg0.field1205 > 2) {
                var9 = 6;
            }
            if (arg0.field1205 > 3) {
                var9 = 8;
            }
            if (arg0.field1209 > 0 && arg0.field1205 > 1) {
                var9 = 8;
                arg0.field1209--;
            }
        } else {
            if (arg0.field1205 > 1) {
                var9 = 6;
            }
            if (arg0.field1205 > 2) {
                var9 = 8;
            }
            if (arg0.field1209 > 0 && arg0.field1205 > 1) {
                var9 = 8;
                arg0.field1209--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1174 == arg0.field1159 && arg0.field1163 != -1) {
            arg0.field1174 = arg0.field1163;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1186 += var9;
                if (arg0.field1186 > var4) {
                    arg0.field1186 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1186 -= var9;
                if (arg0.field1186 < var4) {
                    arg0.field1186 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1210 += var9;
                if (arg0.field1210 > var5) {
                    arg0.field1210 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1210 -= var9;
                if (arg0.field1210 < var5) {
                    arg0.field1210 = var5;
                }
            }
        }
        if (arg0.field1186 == var4 && arg0.field1210 == var5) {
            arg0.field1205--;
            if (arg0.field1195 > 0) {
                arg0.field1195--;
            }
        }
    }

    @ObfuscatedName("ba.gs(Lbg;I)V")
    public static final void method723(class76 arg0) {
        arg0.field1182 = false;
        if (arg0.field1174 != -1) {
            class288 var1 = class288.method3535(arg0.field1174);
            if (var1 == null || var1.field3751 == null) {
                arg0.field1174 = -1;
            } else {
                arg0.field1164++;
                if (arg0.field1181 < var1.field3751.length && arg0.field1164 > var1.field3764[arg0.field1181]) {
                    arg0.field1164 = 1;
                    arg0.field1181++;
                    method492(var1, arg0.field1181, arg0.field1186, arg0.field1210);
                }
                if (arg0.field1181 >= var1.field3751.length) {
                    arg0.field1164 = 0;
                    arg0.field1181 = 0;
                    method492(var1, arg0.field1181, arg0.field1186, arg0.field1210);
                }
            }
        }
        if (arg0.field1188 != -1 && field867 >= arg0.field1190) {
            if (arg0.field1160 < 0) {
                arg0.field1160 = 0;
            }
            int var2 = class273.method4166(arg0.field1188).field3495;
            if (var2 == -1) {
                arg0.field1188 = -1;
            } else {
                class288 var3 = class288.method3535(var2);
                if (var3 == null || var3.field3751 == null) {
                    arg0.field1188 = -1;
                } else {
                    arg0.field1157++;
                    if (arg0.field1160 < var3.field3751.length && arg0.field1157 > var3.field3764[arg0.field1160]) {
                        arg0.field1157 = 1;
                        arg0.field1160++;
                        method492(var3, arg0.field1160, arg0.field1186, arg0.field1210);
                    }
                    if (arg0.field1160 >= var3.field3751.length && (arg0.field1160 < 0 || arg0.field1160 >= var3.field3751.length)) {
                        arg0.field1188 = -1;
                    }
                }
            }
        }
        if (arg0.field1183 != -1 && arg0.field1165 <= 1) {
            class288 var4 = class288.method3535(arg0.field1183);
            if (var4.field3762 == 1 && arg0.field1195 > 0 && arg0.field1197 <= field867 && arg0.field1198 < field867) {
                arg0.field1165 = 1;
                return;
            }
        }
        if (arg0.field1183 != -1 && arg0.field1165 == 0) {
            class288 var5 = class288.method3535(arg0.field1183);
            if (var5 == null || var5.field3751 == null) {
                arg0.field1183 = -1;
            } else {
                arg0.field1185++;
                if (arg0.field1184 < var5.field3751.length && arg0.field1185 > var5.field3764[arg0.field1184]) {
                    arg0.field1185 = 1;
                    arg0.field1184++;
                    method492(var5, arg0.field1184, arg0.field1186, arg0.field1210);
                }
                if (arg0.field1184 >= var5.field3751.length) {
                    arg0.field1184 -= var5.field3755;
                    arg0.field1187++;
                    if (arg0.field1187 >= var5.field3761) {
                        arg0.field1183 = -1;
                    } else if (arg0.field1184 >= 0 && arg0.field1184 < var5.field3751.length) {
                        method492(var5, arg0.field1184, arg0.field1186, arg0.field1210);
                    } else {
                        arg0.field1183 = -1;
                    }
                }
                arg0.field1182 = var5.field3747;
            }
        }
        if (arg0.field1165 > 0) {
            arg0.field1165--;
        }
    }

    @ObfuscatedName("p.gp(I)V")
    public static void method37() {
        if (Statics.field743 != null) {
            Statics.field743.method5594(Statics.field2770, (Statics.field260.field1186 >> 7) + Statics.field2499, (Statics.field260.field1210 >> 7) + Statics.field29, false);
            Statics.field743.method5681();
        }
    }

    @ObfuscatedName("kd.gx(Lbx;IIB)V")
    public static void method5086(class73 arg0, int arg1, int arg2) {
        if (arg0.field1183 == arg1 && arg1 != -1) {
            int var3 = class288.method3535(arg1).field3750;
            if (var3 == 1) {
                arg0.field1184 = 0;
                arg0.field1185 = 0;
                arg0.field1165 = arg2;
                arg0.field1187 = 0;
            }
            if (var3 == 2) {
                arg0.field1187 = 0;
            }
        } else if (arg1 == -1 || arg0.field1183 == -1 || class288.method3535(arg1).field3758 >= class288.method3535(arg0.field1183).field3758) {
            arg0.field1183 = arg1;
            arg0.field1184 = 0;
            arg0.field1185 = 0;
            arg0.field1165 = arg2;
            arg0.field1187 = 0;
            arg0.field1195 = arg0.field1205;
        }
    }

    @ObfuscatedName("cv.gq(II)V")
    public static void method1713(int arg0) {
        field1069 = 0L;
        if (arg0 >= 2) {
            field1070 = true;
        } else {
            field1070 = false;
        }
        int var1 = field1070 ? 2 : 1;
        if (var1 == 1) {
            Statics.field240.method794(765, 503);
        } else {
            Statics.field240.method794(7680, 2160);
        }
        if (field873 >= 25) {
            method4177();
        }
    }

    @ObfuscatedName("is.gm(B)V")
    public static void method4177() {
        class185 var0 = class185.method2860(class182.field2408, field903.field1476);
        class202 var1 = var0.field2501;
        int var2 = field1070 ? 2 : 1;
        var1.method3209(var2);
        var0.field2501.method3210(Statics.field3766);
        var0.field2501.method3210(Statics.field554);
        field903.method1884(var0);
    }

    @ObfuscatedName("client.n(I)V")
    public final void method823() {
        field1069 = class197.method26() + 500L;
        this.method1185();
        if (field1017 != -1) {
            this.method1217(true);
        }
    }

    @ObfuscatedName("client.gh(I)V")
    public void method1185() {
        int var1 = Statics.field3766;
        int var2 = Statics.field554;
        if (this.field670 < var1) {
            int var3 = this.field670;
        }
        if (this.field671 < var2) {
            int var4 = this.field671;
        }
        if (Statics.field565 == null) {
            return;
        }
        try {
            client var5 = Statics.field240;
            int var6 = field1070 ? 2 : 1;
            class54.method710(var5, "resize", new Object[] { var6 });
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gi(I)V")
    public final void method1099() {
        if (field1017 != -1) {
            method3128(field1017);
        }
        for (int var1 = 0; var1 < field968; var1++) {
            if (field1061[var1]) {
                field1062[var1] = true;
            }
            field1063[var1] = field1061[var1];
            field1061[var1] = false;
        }
        field1060 = field867;
        field1005 = -1;
        field1089 = -1;
        Statics.field1702 = null;
        if (field1017 != -1) {
            field968 = 0;
            method128(field1017, 0, 0, Statics.field3766, Statics.field554, 0, 0, -1);
        }
        class328.method5314();
        if (field992) {
            int var6 = Statics.field1131;
            int var7 = Statics.field2065;
            int var8 = Statics.field267;
            int var9 = Statics.field755;
            int var10 = 6116423;
            class328.method5392(var6, var7, var8, var9, var10);
            class328.method5392(var6 + 1, var7 + 1, var8 - 2, 16, 0);
            class328.method5330(var6 + 1, var7 + 18, var8 - 2, var9 - 19, 0);
            Statics.field2677.method5111(class252.field3281, var6 + 3, var7 + 14, var10, -1);
            int var11 = class61.field701;
            int var12 = class61.field694;
            for (int var13 = 0; var13 < field993; var13++) {
                int var14 = (field993 - 1 - var13) * 15 + var7 + 31;
                int var15 = 16777215;
                if (var11 > var6 && var11 < var6 + var8 && var12 > var14 - 13 && var12 < var14 + 3) {
                    var15 = 16776960;
                }
                Statics.field2677.method5111(method3144(var13), var6 + 3, var14, var15, 0);
            }
            method4180(Statics.field1131, Statics.field2065, Statics.field267, Statics.field755);
        } else if (field1005 != -1) {
            int var2 = field1005;
            int var3 = field1089;
            if ((field993 >= 2 || field924 != 0 || field1012) && field913) {
                int var4 = method484();
                String var5;
                if (field924 == 1 && field993 < 2) {
                    var5 = class252.field3163 + class252.field3042 + field1011 + " " + class87.field1313;
                } else if (field1012 && field993 < 2) {
                    var5 = field957 + class252.field3042 + field1016 + " " + class87.field1313;
                } else {
                    var5 = method3144(var4);
                }
                if (field993 > 2) {
                    var5 = var5 + class87.method3053(16777215) + " " + '/' + " " + (field993 - 2) + class252.field3167;
                }
                Statics.field2677.method5118(var5, var2 + 4, var3 + 15, 16777215, 0, field867 / 1000);
            }
        }
        if (field1068 == 3) {
            for (int var16 = 0; var16 < field968; var16++) {
                if (field1063[var16]) {
                    class328.method5322(field1064[var16], field861[var16], field1123[var16], field1067[var16], 16711935, 128);
                } else if (field1062[var16]) {
                    class328.method5322(field1064[var16], field861[var16], field1123[var16], field1067[var16], 16711680, 128);
                }
            }
        }
        int var17 = Statics.field2770;
        int var18 = Statics.field260.field1186;
        int var19 = Statics.field260.field1210;
        int var20 = field894;
        for (class81 var21 = (class81) class81.field1262.method3723(); var21 != null; var21 = (class81) class81.field1262.method3722()) {
            if (var21.field1260 != -1 || var21.field1264 != null) {
                int var22 = 0;
                if (var18 > var21.field1257) {
                    var22 += var18 - var21.field1257;
                } else if (var18 < var21.field1265) {
                    var22 += var21.field1265 - var18;
                }
                if (var19 > var21.field1258) {
                    var22 += var19 - var21.field1258;
                } else if (var19 < var21.field1256) {
                    var22 += var21.field1256 - var19;
                }
                if (var22 - 64 > var21.field1259 || field1035 == 0 || var21.field1266 != var17) {
                    if (var21.field1261 != null) {
                        Statics.field633.method1910(var21.field1261);
                        var21.field1261 = null;
                    }
                    if (var21.field1255 != null) {
                        Statics.field633.method1910(var21.field1255);
                        var21.field1255 = null;
                    }
                } else {
                    var22 -= 64;
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    int var23 = field1035 * (var21.field1259 - var22) / var21.field1259;
                    class104 var10000;
                    if (var21.field1261 != null) {
                        var21.field1261.method2128(var23);
                    } else if (var21.field1260 >= 0) {
                        var10000 = (class104) null;
                        class104 var24 = class104.method1965(Statics.field553, var21.field1260, 0);
                        if (var24 != null) {
                            class106 var25 = var24.method1959().method2007(Statics.field2572);
                            class116 var26 = class116.method2124(var25, 100, var23);
                            var26.method2127(-1);
                            Statics.field633.method1933(var26);
                            var21.field1261 = var26;
                        }
                    }
                    if (var21.field1255 != null) {
                        var21.field1255.method2128(var23);
                        if (!var21.field1255.method3709()) {
                            var21.field1255 = null;
                        }
                    } else if (var21.field1264 != null && (var21.field1254 -= var20) <= 0) {
                        int var27 = (int) (Math.random() * (double) var21.field1264.length);
                        var10000 = (class104) null;
                        class104 var28 = class104.method1965(Statics.field553, var21.field1264[var27], 0);
                        if (var28 != null) {
                            class106 var29 = var28.method1959().method2007(Statics.field2572);
                            class116 var30 = class116.method2124(var29, 100, var23);
                            var30.method2127(0);
                            Statics.field633.method1933(var30);
                            var21.field1255 = var30;
                            var21.field1254 = var21.field1267 + (int) (Math.random() * (double) (var21.field1263 - var21.field1267));
                        }
                    }
                }
            }
        }
        field894 = 0;
    }

    @ObfuscatedName("ei.gw(Ljava/lang/String;ZI)V")
    public static final void method2575(String arg0, boolean arg1) {
        if (!field961) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2507.method5108(arg0, 250);
        int var6 = Statics.field2507.method5109(arg0, 250) * 13;
        class328.method5392(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class328.method5330(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2507.method5114(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method950(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3942.method764(0, 0);
        } else {
            method4180(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("ci.gf(IIIIZI)V")
    public static final void method1774(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1107 - field1106) * var5 / 100 + field1106;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1112) {
            short var8 = field1112;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field882) {
                var6 = field882;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class328.method5314();
                    class328.method5392(arg0, arg1, var10, arg3, -16777216);
                    class328.method5392(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1113) {
            short var11 = field1113;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field927) {
                var6 = field927;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class328.method5314();
                    class328.method5392(arg0, arg1, arg2, var13, -16777216);
                    class328.method5392(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1109 - field877) * var5 / 100 + field877;
        field1093 = arg3 * var6 * var14 / 85504 << 1;
        if (field944 != arg2 || field907 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class135.field1956[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class138.method2805(var15, 500, 800, arg2, arg3);
        }
        field1114 = arg0;
        field1115 = arg1;
        field944 = arg2;
        field907 = arg3;
    }

    @ObfuscatedName("v.gr(I)V")
    public static void method156() {
        if (field983 >= 0 && field972[field983] != null) {
            method487(field972[field983], false);
        }
    }

    @ObfuscatedName("hp.gj(I)V")
    public static void method4004() {
        int var0 = class94.field1415;
        int[] var1 = class94.field1416;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field983 != var1[var2] && field1001 != var1[var2]) {
                method487(field972[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("aq.gl(Lbx;ZB)V")
    public static void method487(class73 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1052() || arg0.field837) {
            return;
        }
        int var2 = arg0.field844 << 14;
        arg0.field840 = false;
        if ((field863 && class94.field1415 > 50 || class94.field1415 > 200) && arg1 && arg0.field1174 == arg0.field1156) {
            arg0.field840 = true;
        }
        int var3 = arg0.field1186 >> 7;
        int var4 = arg0.field1210 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field835 != null && field867 >= arg0.field845 && field867 < arg0.field830) {
            arg0.field840 = false;
            arg0.field829 = method17(arg0.field1186, arg0.field1210, Statics.field2770);
            arg0.field1155 = field867;
            Statics.field3868.method2676(Statics.field2770, arg0.field1186, arg0.field1210, arg0.field829, 60, arg0, arg0.field1152, var2, arg0.field836, arg0.field827, arg0.field849, arg0.field839);
            return;
        }
        if ((arg0.field1186 & 0x7F) == 64 && (arg0.field1210 & 0x7F) == 64) {
            if (field954 == field953[var3][var4]) {
                return;
            }
            field953[var3][var4] = field954;
        }
        arg0.field829 = method17(arg0.field1186, arg0.field1210, Statics.field2770);
        arg0.field1155 = field867;
        Statics.field3868.method2794(Statics.field2770, arg0.field1186, arg0.field1210, arg0.field829, 60, arg0, arg0.field1152, var2, arg0.field1182);
    }

    @ObfuscatedName("gf.gu(ZB)V")
    public static final void method3516(boolean arg0) {
        for (int var1 = 0; var1 < field899; var1++) {
            class85 var2 = field898[field900[var1]];
            int var3 = (field900[var1] << 14) + 536870912;
            if (var2 != null && var2.method1052() && var2.field1301.field3700 == arg0 && var2.field1301.method4758()) {
                int var4 = var2.field1186 >> 7;
                int var5 = var2.field1210 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1154 == 1 && (var2.field1186 & 0x7F) == 64 && (var2.field1210 & 0x7F) == 64) {
                        if (field954 == field953[var4][var5]) {
                            continue;
                        }
                        field953[var4][var5] = field954;
                    }
                    if (!var2.field1301.field3730) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    var2.field1155 = field867;
                    Statics.field3868.method2794(Statics.field2770, var2.field1186, var2.field1210, method17(var2.field1186 + (var2.field1154 * 64 - 64), var2.field1210 + (var2.field1154 * 64 - 64), Statics.field2770), var2.field1154 * 64 - 64 + 60, var2, var2.field1152, var3, var2.field1182);
                }
            }
        }
    }

    @ObfuscatedName("aj.gz(B)V")
    public static final void method664() {
        for (class92 var0 = (class92) field986.method3723(); var0 != null; var0 = (class92) field986.method3722()) {
            if (Statics.field2770 != var0.field1400 || field867 > var0.field1385) {
                var0.method3710();
            } else if (field867 >= var0.field1384) {
                if (var0.field1388 > 0) {
                    class85 var1 = field898[var0.field1388 - 1];
                    if (var1 != null && var1.field1186 >= 0 && var1.field1186 < 13312 && var1.field1210 >= 0 && var1.field1210 < 13312) {
                        var0.method1767(var1.field1186, var1.field1210, method17(var1.field1186, var1.field1210, var0.field1400) - var0.field1383, field867);
                    }
                }
                if (var0.field1388 < 0) {
                    int var2 = -var0.field1388 - 1;
                    class73 var3;
                    if (field1001 == var2) {
                        var3 = Statics.field260;
                    } else {
                        var3 = field972[var2];
                    }
                    if (var3 != null && var3.field1186 >= 0 && var3.field1186 < 13312 && var3.field1210 >= 0 && var3.field1210 < 13312) {
                        var0.method1767(var3.field1186, var3.field1210, method17(var3.field1186, var3.field1210, var0.field1400) - var0.field1383, field867);
                    }
                }
                var0.method1768(field894);
                Statics.field3868.method2794(Statics.field2770, (int) var0.field1390, (int) var0.field1393, (int) var0.field1399, 60, var0, var0.field1378, -1, false);
            }
        }
    }

    @ObfuscatedName("ko.gd(I)V")
    public static final void method5039() {
        for (class83 var0 = (class83) field978.method3723(); var0 != null; var0 = (class83) field978.method3722()) {
            if (Statics.field2770 != var0.field1285 || var0.field1284) {
                var0.method3710();
            } else if (field867 >= var0.field1288) {
                var0.method1666(field894);
                if (var0.field1284) {
                    var0.method3710();
                } else {
                    Statics.field3868.method2794(var0.field1285, var0.field1286, var0.field1287, var0.field1294, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fe.hc(I)I")
    public static final int method3125() {
        if (Statics.field565.field1237) {
            return Statics.field2770;
        }
        int var0 = 3;
        if (Statics.field242 < 310) {
            int var1;
            int var2;
            if (field931 == 1) {
                var1 = Statics.field2523 >> 7;
                var2 = Statics.field1475 >> 7;
            } else {
                var1 = Statics.field260.field1186 >> 7;
                var2 = Statics.field260.field1210 >> 7;
            }
            int var3 = Statics.field3767 >> 7;
            int var4 = Statics.field1469 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field2770;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2770;
            }
            if ((class63.field721[Statics.field2770][var3][var4] & 0x4) != 0) {
                var0 = Statics.field2770;
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
                    if ((class63.field721[Statics.field2770][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2770;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class63.field721[Statics.field2770][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2770;
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
                    if ((class63.field721[Statics.field2770][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2770;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class63.field721[Statics.field2770][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2770;
                        }
                    }
                }
            }
        }
        if (Statics.field260.field1186 >= 0 && Statics.field260.field1210 >= 0 && Statics.field260.field1186 < 13312 && Statics.field260.field1210 < 13312) {
            if ((class63.field721[Statics.field2770][Statics.field260.field1186 >> 7][Statics.field260.field1210 >> 7] & 0x4) != 0) {
                var0 = Statics.field2770;
            }
            return var0;
        } else {
            return Statics.field2770;
        }
    }

    @ObfuscatedName("gh.hz(I)I")
    public static final int method3462() {
        if (Statics.field565.field1237) {
            return Statics.field2770;
        } else {
            int var0 = method17(Statics.field3767, Statics.field1469, Statics.field2770);
            return var0 - Statics.field3473 >= 800 || (class63.field721[Statics.field2770][Statics.field3767 >> 7][Statics.field1469 >> 7] & 0x4) == 0 ? 3 : Statics.field2770;
        }
    }

    @ObfuscatedName("q.hf(III)V")
    public static final void method177(int arg0, int arg1) {
        if (field875 == 2) {
            Statics.method1077((field1079 - Statics.field2499 << 7) + field1015, (field879 - Statics.field29 << 7) + field1124, field1075 * 2);
            if (field955 > -1 && field867 % 20 < 10) {
                Statics.field570[0].method5438(field955 + arg0 - 12, field865 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ih.hw(B)Z")
    public static boolean method4033() {
        return (field976 & 0x8) != 0;
    }

    @ObfuscatedName("bz.hj(Lbg;IIIIIB)V")
    public static final void method1508(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1052()) {
            return;
        }
        if (arg0 instanceof class85) {
            class286 var6 = ((class85) arg0).field1301;
            if (var6.field3719 != null) {
                var6 = var6.method4760();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class94.field1415;
        int[] var8 = class94.field1416;
        byte var9 = 0;
        if (arg1 < var7 && field867 == arg0.field1155) {
            class73 var10 = (class73) arg0;
            boolean var11;
            if (field976 == 0) {
                var11 = false;
            } else if (Statics.field260 == var10) {
                var11 = method4033();
            } else {
                boolean var12 = (field976 & 0x4) != 0;
                boolean var13 = var12;
                if (!var12) {
                    boolean var14 = (field976 & 0x1) != 0;
                    var13 = var14 && var10.method1036();
                }
                boolean var15 = var13;
                if (!var13) {
                    boolean var16 = (field976 & 0x2) != 0;
                    var15 = var16 && var10.method1039();
                }
                var11 = var15;
            }
            if (var11) {
                class73 var17 = (class73) arg0;
                if (arg1 < var7) {
                    method2065(arg0, arg0.field1201 + 15);
                    class313 var18 = (class313) field908.get(class310.field3875);
                    byte var19 = 9;
                    var18.method5113(var17.field824.method5038(), field955 + arg2, field865 + arg3 - var19, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var20 = -2;
        if (!arg0.field1176.method3698()) {
            method2065(arg0, arg0.field1201 + 15);
            for (class84 var21 = (class84) arg0.field1176.method3684(); var21 != null; var21 = (class84) arg0.field1176.method3699()) {
                class77 var22 = var21.method1673(field867);
                if (var22 != null) {
                    class276 var23 = var21.field1298;
                    class332 var24 = var23.method4500();
                    class332 var25 = var23.method4487();
                    int var26 = 0;
                    int var27;
                    if (var24 == null || var25 == null) {
                        var27 = var23.field3528;
                    } else {
                        if (var23.field3529 * 2 < var25.field3979) {
                            var26 = var23.field3529;
                        }
                        var27 = var25.field3979 - var26 * 2;
                    }
                    int var28 = 255;
                    boolean var29 = true;
                    int var30 = field867 - var22.field1218;
                    int var31 = var22.field1214 * var27 / var23.field3528;
                    int var34;
                    if (var22.field1212 > var30) {
                        int var32 = var23.field3518 == 0 ? 0 : var30 / var23.field3518 * var23.field3518;
                        int var33 = var22.field1213 * var27 / var23.field3528;
                        var34 = (var31 - var33) * var32 / var22.field1212 + var33;
                    } else {
                        var34 = var31;
                        int var35 = var22.field1212 + var23.field3525 - var30;
                        if (var23.field3523 >= 0) {
                            var28 = (var35 << 8) / (var23.field3525 - var23.field3523);
                        }
                    }
                    if (var22.field1214 > 0 && var34 < 1) {
                        var34 = 1;
                    }
                    if (var24 == null || var25 == null) {
                        var20 += 5;
                        if (field955 > -1) {
                            int var41 = field955 + arg2 - (var27 >> 1);
                            int var42 = field865 + arg3 - var20;
                            class328.method5392(var41, var42, var34, 5, 65280);
                            class328.method5392(var34 + var41, var42, var27 - var34, 5, 16711680);
                        }
                        var20 += 2;
                    } else {
                        int var36;
                        if (var27 == var34) {
                            var36 = var26 * 2 + var34;
                        } else {
                            var36 = var26 + var34;
                        }
                        int var37 = var24.field3980;
                        var20 += var37;
                        int var38 = field955 + arg2 - (var27 >> 1);
                        int var39 = field865 + arg3 - var20;
                        int var40 = var38 - var26;
                        if (var28 >= 0 && var28 < 255) {
                            var24.method5448(var40, var39, var28);
                            class328.method5316(var40, var39, var36 + var40, var37 + var39);
                            var25.method5448(var40, var39, var28);
                        } else {
                            var24.method5438(var40, var39);
                            class328.method5316(var40, var39, var36 + var40, var37 + var39);
                            var25.method5438(var40, var39);
                        }
                        class328.method5315(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var20 += 2;
                    }
                } else if (var21.method1672()) {
                    var21.method3710();
                }
            }
        }
        if (var20 == -2) {
            var20 += 7;
        }
        int var43 = var9 + var20;
        if (arg1 < var7) {
            class73 var44 = (class73) arg0;
            if (var44.field837) {
                return;
            }
            if (var44.field823 != -1 || var44.field831 != -1) {
                method2065(arg0, arg0.field1201 + 15);
                if (field955 > -1) {
                    if (var44.field823 != -1) {
                        var43 += 25;
                        Statics.field318[var44.field823].method5438(field955 + arg2 - 12, field865 + arg3 - var43);
                    }
                    if (var44.field831 != -1) {
                        var43 += 25;
                        Statics.field1311[var44.field831].method5438(field955 + arg2 - 12, field865 + arg3 - var43);
                    }
                }
            }
            if (arg1 >= 0 && field875 == 10 && field1037 == var8[arg1]) {
                method2065(arg0, arg0.field1201 + 15);
                if (field955 > -1) {
                    int var45 = Statics.field570[1].field3980 + var43;
                    Statics.field570[1].method5438(field955 + arg2 - 12, field865 + arg3 - var45);
                }
            }
        } else {
            class286 var46 = ((class85) arg0).field1301;
            if (var46.field3719 != null) {
                var46 = var46.method4760();
            }
            if (var46.field3725 >= 0 && var46.field3725 < Statics.field1311.length) {
                method2065(arg0, arg0.field1201 + 15);
                if (field955 > -1) {
                    Statics.field1311[var46.field3725].method5438(field955 + arg2 - 12, field865 + arg3 - 30);
                }
            }
            if (field875 == 1 && field876 == field900[arg1 - var7] && field867 % 20 < 10) {
                method2065(arg0, arg0.field1201 + 15);
                if (field955 > -1) {
                    Statics.field570[0].method5438(field955 + arg2 - 12, field865 + arg3 - 28);
                }
            }
        }
        if (arg0.field1153 != null && (arg1 >= var7 || !arg0.field1180 && (field1072 == 4 || !arg0.field1168 && (field1072 == 0 || field1072 == 3 || field1072 == 1 && ((class73) arg0).method1036())))) {
            method2065(arg0, arg0.field1201);
            if (field955 > -1 && field943 < field963) {
                field948[field943] = Statics.field2677.method5173(arg0.field1153) / 2;
                field947[field943] = Statics.field2677.field3892;
                field945[field943] = field955;
                field946[field943] = field865;
                field1074[field943] = arg0.field1208;
                field985[field943] = arg0.field1169;
                field951[field943] = arg0.field1167;
                field952[field943] = arg0.field1153;
                field943++;
            }
        }
        for (int var47 = 0; var47 < 4; var47++) {
            int var48 = arg0.field1206[var47];
            int var49 = arg0.field1171[var47];
            class282 var50 = null;
            int var51 = 0;
            if (var49 >= 0) {
                if (var48 <= field867) {
                    continue;
                }
                var50 = class282.method47(arg0.field1171[var47]);
                var51 = var50.field3573;
                if (var50 != null && var50.field3570 != null) {
                    var50 = var50.method4620();
                    if (var50 == null) {
                        arg0.field1206[var47] = -1;
                        continue;
                    }
                }
            } else if (var48 < 0) {
                continue;
            }
            int var52 = arg0.field1151[var47];
            class282 var53 = null;
            if (var52 >= 0) {
                var53 = class282.method47(var52);
                if (var53 != null && var53.field3570 != null) {
                    var53 = var53.method4620();
                }
            }
            if (var48 - var51 <= field867) {
                if (var50 == null) {
                    arg0.field1206[var47] = -1;
                } else {
                    method2065(arg0, arg0.field1201 / 2);
                    if (field955 > -1) {
                        if (var47 == 1) {
                            field865 -= 20;
                        }
                        if (var47 == 2) {
                            field955 -= 15;
                            field865 -= 10;
                        }
                        if (var47 == 3) {
                            field955 += 15;
                            field865 -= 10;
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
                        class332 var66 = null;
                        class332 var67 = null;
                        class332 var68 = null;
                        class332 var69 = null;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        class332 var79 = var50.method4615();
                        if (var79 != null) {
                            var58 = var79.field3979;
                            int var80 = var79.field3980;
                            if (var80 > var78) {
                                var78 = var80;
                            }
                            var62 = var79.field3981;
                        }
                        class332 var81 = var50.method4610();
                        if (var81 != null) {
                            var59 = var81.field3979;
                            int var82 = var81.field3980;
                            if (var82 > var78) {
                                var78 = var82;
                            }
                            var63 = var81.field3981;
                        }
                        class332 var83 = var50.method4595();
                        if (var83 != null) {
                            var60 = var83.field3979;
                            int var84 = var83.field3980;
                            if (var84 > var78) {
                                var78 = var84;
                            }
                            var64 = var83.field3981;
                        }
                        class332 var85 = var50.method4596();
                        if (var85 != null) {
                            var61 = var85.field3979;
                            int var86 = var85.field3980;
                            if (var86 > var78) {
                                var78 = var86;
                            }
                            var65 = var85.field3981;
                        }
                        if (var53 != null) {
                            var66 = var53.method4615();
                            if (var66 != null) {
                                var70 = var66.field3979;
                                int var87 = var66.field3980;
                                if (var87 > var78) {
                                    var78 = var87;
                                }
                                var74 = var66.field3981;
                            }
                            var67 = var53.method4610();
                            if (var67 != null) {
                                var71 = var67.field3979;
                                int var88 = var67.field3980;
                                if (var88 > var78) {
                                    var78 = var88;
                                }
                                var75 = var67.field3981;
                            }
                            var68 = var53.method4595();
                            if (var68 != null) {
                                var72 = var68.field3979;
                                int var89 = var68.field3980;
                                if (var89 > var78) {
                                    var78 = var89;
                                }
                                var76 = var68.field3981;
                            }
                            var69 = var53.method4596();
                            if (var69 != null) {
                                var73 = var69.field3979;
                                int var90 = var69.field3980;
                                if (var90 > var78) {
                                    var78 = var90;
                                }
                                var77 = var69.field3981;
                            }
                        }
                        class312 var91 = var50.method4611();
                        if (var91 == null) {
                            var91 = Statics.field16;
                        }
                        class312 var92;
                        if (var53 == null) {
                            var92 = Statics.field16;
                        } else {
                            var92 = var53.method4611();
                            if (var92 == null) {
                                var92 = Statics.field16;
                            }
                        }
                        Object var93 = null;
                        String var94 = null;
                        boolean var95 = false;
                        int var96 = 0;
                        String var97 = var50.method4592(arg0.field1172[var47]);
                        int var98 = var91.method5173(var97);
                        if (var53 != null) {
                            var94 = var53.method4592(arg0.field1175[var47]);
                            var96 = var92.method5173(var94);
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
                        int var115 = arg0.field1206[var47] - field867;
                        int var116 = var50.field3578 - var50.field3578 * var115 / var50.field3573;
                        int var117 = var50.field3579 * var115 / var50.field3573 + -var50.field3579;
                        int var118 = field955 + arg2 - (var107 >> 1) + var116;
                        int var119 = field865 + arg3 - 12 + var117;
                        int var120 = var119;
                        int var121 = var78 + var119;
                        int var122 = var50.field3583 + var119 + 15;
                        int var123 = var122 - var91.field3900;
                        int var124 = var91.field3894 + var122;
                        if (var123 < var119) {
                            var120 = var123;
                        }
                        if (var124 > var121) {
                            var121 = var124;
                        }
                        int var125 = 0;
                        if (var53 != null) {
                            var125 = var53.field3583 + var119 + 15;
                            int var126 = var125 - var92.field3900;
                            int var127 = var92.field3894 + var125;
                            if (var126 < var120) {
                                ;
                            }
                            if (var127 > var121) {
                                ;
                            }
                        }
                        int var130 = 255;
                        if (var50.field3580 >= 0) {
                            var130 = (var115 << 8) / (var50.field3573 - var50.field3580);
                        }
                        if (var130 >= 0 && var130 < 255) {
                            if (var79 != null) {
                                var79.method5448(var102 + var118 - var62, var119, var130);
                            }
                            if (var83 != null) {
                                var83.method5448(var103 + var118 - var64, var119, var130);
                            }
                            if (var81 != null) {
                                for (int var131 = 0; var131 < var99; var131++) {
                                    var81.method5448(var59 * var131 + (var104 + var118 - var63), var119, var130);
                                }
                            }
                            if (var85 != null) {
                                var85.method5448(var108 + var118 - var65, var119, var130);
                            }
                            var91.method5169(var97, var105 + var118, var122, var50.field3572, 0, var130);
                            if (var53 != null) {
                                if (var66 != null) {
                                    var66.method5448(var109 + var118 - var74, var119, var130);
                                }
                                if (var68 != null) {
                                    var68.method5448(var110 + var118 - var76, var119, var130);
                                }
                                if (var67 != null) {
                                    for (int var132 = 0; var132 < var100; var132++) {
                                        var67.method5448(var71 * var132 + (var111 + var118 - var75), var119, var130);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method5448(var112 + var118 - var77, var119, var130);
                                }
                                var92.method5169(var94, var113 + var118, var125, var53.field3572, 0, var130);
                            }
                        } else {
                            if (var79 != null) {
                                var79.method5438(var102 + var118 - var62, var119);
                            }
                            if (var83 != null) {
                                var83.method5438(var103 + var118 - var64, var119);
                            }
                            if (var81 != null) {
                                for (int var133 = 0; var133 < var99; var133++) {
                                    var81.method5438(var59 * var133 + (var104 + var118 - var63), var119);
                                }
                            }
                            if (var85 != null) {
                                var85.method5438(var108 + var118 - var65, var119);
                            }
                            var91.method5111(var97, var105 + var118, var122, var50.field3572 | 0xFF000000, 0);
                            if (var53 != null) {
                                if (var66 != null) {
                                    var66.method5438(var109 + var118 - var74, var119);
                                }
                                if (var68 != null) {
                                    var68.method5438(var110 + var118 - var76, var119);
                                }
                                if (var67 != null) {
                                    for (int var134 = 0; var134 < var100; var134++) {
                                        var67.method5438(var71 * var134 + (var111 + var118 - var75), var119);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method5438(var112 + var118 - var77, var119);
                                }
                                var92.method5111(var94, var113 + var118, var125, var53.field3572 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.hm(I)V")
    public static final void method722() {
        field970 = 0;
        int var0 = (Statics.field260.field1186 >> 7) + Statics.field2499;
        int var1 = (Statics.field260.field1210 >> 7) + Statics.field29;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field970 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field970 = 1;
        }
        if (field970 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field970 = 0;
        }
    }

    @ObfuscatedName("aq.hy(IIIII)V")
    public static final void method488(int arg0, int arg1, int arg2, int arg3) {
        if (field938) {
            if (field960 == 1) {
                Statics.field258[field959 / 100].method5438(field962 - 8, field958 - 8);
            }
            if (field960 == 2) {
                Statics.field258[field959 / 100 + 4].method5438(field962 - 8, field958 - 8);
            }
        }
        method722();
    }

    @ObfuscatedName("dz.he(Lbg;IB)V")
    public static final void method2065(class76 arg0, int arg1) {
        Statics.method1077(arg0.field1186, arg0.field1210, arg1);
    }

    @ObfuscatedName("x.hl(IIII)I")
    public static final int method17(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class63.field721[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class63.field729[var5][var3][var4] + class63.field729[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class63.field729[var5][var3][var4 + 1] + class63.field729[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bn.hv(ZLgf;S)V")
    public static final void method1001(boolean arg0, class202 arg1) {
        field915 = arg0;
        if (!field915) {
            int var2 = arg1.method3219();
            int var3 = arg1.method3218();
            int var4 = arg1.method3218();
            Statics.field344 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field344[var5][var6] = arg1.method3230();
                }
            }
            Statics.field351 = new int[var4];
            Statics.field3871 = new int[var4];
            Statics.field2504 = new int[var4];
            Statics.field1971 = new byte[var4][];
            Statics.field2961 = new byte[var4][];
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
                        Statics.field351[var8] = var11;
                        Statics.field3871[var8] = Statics.field12.method4245("m" + var9 + "_" + var10);
                        Statics.field2504[var8] = Statics.field12.method4245("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method20(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3379() == 1;
        int var13 = arg1.method3422();
        int var14 = arg1.method3263();
        int var15 = arg1.method3218();
        arg1.method3489();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3497(1);
                    if (var19 == 1) {
                        field916[var16][var17][var18] = arg1.method3497(26);
                    } else {
                        field916[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3491();
        Statics.field344 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field344[var20][var21] = arg1.method3230();
            }
        }
        Statics.field351 = new int[var15];
        Statics.field3871 = new int[var15];
        Statics.field2504 = new int[var15];
        Statics.field1971 = new byte[var15][];
        Statics.field2961 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field916[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field351[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field351[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field3871[var22] = Statics.field12.method4245("m" + var31 + "_" + var32);
                            Statics.field2504[var22] = Statics.field12.method4245("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method20(var14, var13, !var12);
    }

    @ObfuscatedName("z.ha(IIZI)V")
    public static final void method20(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2226 == arg0 && Statics.field757 == arg1) {
            return;
        }
        Statics.field2226 = arg0;
        Statics.field757 = arg1;
        method666(25);
        method2575(class252.field3055, true);
        int var3 = Statics.field2499;
        int var4 = Statics.field29;
        Statics.field2499 = (arg0 - 6) * 8;
        Statics.field29 = (arg1 - 6) * 8;
        int var5 = Statics.field2499 - var3;
        int var6 = Statics.field29 - var4;
        int var7 = Statics.field2499;
        int var8 = Statics.field29;
        for (int var9 = 0; var9 < 32768; var9++) {
            class85 var10 = field898[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1189[var11] -= var5;
                    var10.field1207[var11] -= var6;
                }
                var10.field1186 -= var5 * 128;
                var10.field1210 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class73 var13 = field972[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1189[var14] -= var5;
                    var13.field1207[var14] -= var6;
                }
                var13.field1186 -= var5 * 128;
                var13.field1210 -= var6 * 128;
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
                        field984[var25][var21][var22] = field984[var25][var23][var24];
                    } else {
                        field984[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class75 var26 = (class75) field1116.method3723(); var26 != null; var26 = (class75) field1116.method3722()) {
            var26.field1149 -= var5;
            var26.field1141 -= var6;
            if (var26.field1149 < 0 || var26.field1141 < 0 || var26.field1149 >= 104 || var26.field1141 >= 104) {
                var26.method3710();
            }
        }
        if (field1086 != 0) {
            field1086 -= var5;
            field1006 -= var6;
        }
        field1094 = 0;
        field1100 = false;
        Statics.field3767 -= var5 << 7;
        Statics.field1469 -= var6 << 7;
        Statics.field2523 -= var5 << 7;
        Statics.field1475 -= var6 << 7;
        field1101 = -1;
        field978.method3715();
        field986.method3715();
        for (int var27 = 0; var27 < 4; var27++) {
            field1048[var27].method3079();
        }
    }

    @ObfuscatedName("fu.hd(ZI)V")
    public static final void method3050(boolean arg0) {
        method348();
        field903.field1482++;
        if (field903.field1482 < 50 && !arg0) {
            return;
        }
        field903.field1482 = 0;
        if (field905 || field903.method1900() == null) {
            return;
        }
        class185 var1 = class185.method2860(class182.field2413, field903.field1476);
        field903.method1884(var1);
        try {
            field903.method1883();
        } catch (IOException var3) {
            field905 = true;
        }
    }

    @ObfuscatedName("ca.hn(IIIIIB)V")
    public static final void method1519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field3868.method2775(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field3868.method2829(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2372.field3987;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class283 var13 = class283.method4185(var12);
            if (var13.field3616 == -1) {
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
                class331 var14 = Statics.field719[var13.field3616];
                if (var14 != null) {
                    int var15 = (var13.field3602 * 4 - var14.field3972) / 2;
                    int var16 = (var13.field3603 * 4 - var14.field3973) / 2;
                    var14.method5415(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3603) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field3868.method2692(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field3868.method2829(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class283 var22 = class283.method4185(var21);
            if (var22.field3616 != -1) {
                class331 var23 = Statics.field719[var22.field3616];
                if (var23 != null) {
                    int var24 = (var22.field3602 * 4 - var23.field3972) / 2;
                    int var25 = (var22.field3603 * 4 - var23.field3973) / 2;
                    var23.method5415(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3603) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2372.field3987;
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
        int var29 = Statics.field3868.method2693(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class283 var31 = class283.method4185(var30);
        if (var31.field3616 == -1) {
            return;
        }
        class331 var32 = Statics.field719[var31.field3616];
        if (var32 != null) {
            int var33 = (var31.field3602 * 4 - var32.field3972) / 2;
            int var34 = (var31.field3603 * 4 - var32.field3973) / 2;
            var32.method5415(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3603) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.hh(Lco;B)Z")
    public final boolean method1100(class100 arg0) {
        class170 var2 = arg0.method1900();
        class202 var3 = arg0.field1477;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1478 == null) {
                if (arg0.field1480) {
                    if (!var2.method3029(1)) {
                        return false;
                    }
                    var2.method3026(arg0.field1477.field2567, 0, 1);
                    arg0.field1481 = 0;
                    arg0.field1480 = false;
                }
                var3.field2566 = 0;
                if (var3.method3509()) {
                    if (!var2.method3029(1)) {
                        return false;
                    }
                    var2.method3026(arg0.field1477.field2567, 1, 1);
                    arg0.field1481 = 0;
                }
                arg0.field1480 = true;
                class181[] var4 = class181.method3077();
                int var5 = var3.method3488();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2566);
                }
                arg0.field1478 = var4[var5];
                arg0.field1479 = arg0.field1478.field2371;
            }
            if (arg0.field1479 == -1) {
                if (!var2.method3029(1)) {
                    return false;
                }
                arg0.method1900().method3026(var3.field2567, 0, 1);
                arg0.field1479 = var3.field2567[0] & 0xFF;
            }
            if (arg0.field1479 == -2) {
                if (!var2.method3029(2)) {
                    return false;
                }
                arg0.method1900().method3026(var3.field2567, 0, 2);
                var3.field2566 = 0;
                arg0.field1479 = var3.method3218();
            }
            if (!var2.method3029(arg0.field1479)) {
                return false;
            }
            var3.field2566 = 0;
            var2.method3026(var3.field2567, 0, arg0.field1479);
            arg0.field1481 = 0;
            field1051.method4834();
            arg0.field1472 = arg0.field1474;
            arg0.field1474 = arg0.field1486;
            arg0.field1486 = arg0.field1478;
            if (class181.field2289 == arg0.field1478) {
                method52(class184.field2487);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2310 == arg0.field1478) {
                int var6 = var3.method3272();
                int var7 = var3.method3422();
                class243 var8 = class243.method3(var6);
                if (var8.field2858 != 1 || var8.field2924 != var7) {
                    var8.field2858 = 1;
                    var8.field2924 = var7;
                    method260(var8);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2334 == arg0.field1478) {
                int var9 = var3.method3230();
                boolean var10 = var3.method3255() == 1;
                class243 var11 = class243.method3(var9);
                if (var11.field2835 != var10) {
                    var11.field2835 = var10;
                    method260(var11);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2321 == arg0.field1478) {
                Statics.field534 = var3.method3255();
                Statics.field674 = var3.method3255();
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2314 == arg0.field1478) {
                int var12 = var3.method3230();
                class243 var13 = class243.method3(var12);
                for (int var14 = 0; var14 < var13.field2879.length; var14++) {
                    var13.field2879[var14] = -1;
                    var13.field2879[var14] = 0;
                }
                method260(var13);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2351 == arg0.field1478) {
                int var15 = var3.method3230();
                int var16 = var3.method3230();
                int var17 = class60.method2577();
                class185 var18 = class185.method2860(class182.field2412, field903.field1476);
                var18.field2501.method3251(field667);
                var18.field2501.method3251(var17);
                var18.field2501.method3376(var15);
                var18.field2501.method3383(var16);
                field903.method1884(var18);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2365 == arg0.field1478) {
                String var19 = var3.method3427();
                long var20 = var3.method3231();
                long var22 = (long) var3.method3218();
                long var24 = (long) var3.method3293();
                class257 var26 = (class257) class190.method578(class257.method7(), var3.method3429());
                long var27 = (var22 << 32) + var24;
                boolean var29 = false;
                for (int var30 = 0; var30 < 100; var30++) {
                    if (field990[var30] == var27) {
                        var29 = true;
                        break;
                    }
                }
                if (var26.field3328 && Statics.field2183.method1559(new class306(var19, Statics.field1108))) {
                    var29 = true;
                }
                if (!var29 && field970 == 0) {
                    field990[field1076] = var27;
                    field1076 = (field1076 + 1) % 100;
                    String var31 = class314.method14(var3, 32767);
                    String var32 = class313.method5110(class319.method1775(var31));
                    if (var26.field3335 == -1) {
                        class96.method4169(9, var19, var32, class317.method1662(var20));
                    } else {
                        class96.method4169(9, class87.method176(var26.field3335) + var19, var32, class317.method1662(var20));
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2315 == arg0.field1478) {
                int var33 = var3.method3429();
                method57(var33);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2342 == arg0.field1478) {
                method52(class184.field2489);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2362 == arg0.field1478) {
                method264();
                field1022 = var3.method3429();
                field1053 = field1041;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2333 == arg0.field1478) {
                method1586();
                arg0.field1478 = null;
                return false;
            }
            if (class181.field2293 == arg0.field1478) {
                method52(class184.field2482);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2356 == arg0.field1478) {
                if (field1017 != -1) {
                    method3206(field1017, 0);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2345 == arg0.field1478) {
                int var34 = var3.method3230();
                class68 var35 = (class68) field1018.method3677((long) var34);
                if (var35 != null) {
                    method576(var35, true);
                }
                if (field1103 != null) {
                    method260(field1103);
                    field1103 = null;
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2340 == arg0.field1478) {
                field1100 = true;
                Statics.field452 = var3.method3429();
                Statics.field262 = var3.method3429();
                Statics.field3524 = var3.method3218();
                Statics.field1591 = var3.method3429();
                Statics.field579 = var3.method3429();
                if (Statics.field579 >= 100) {
                    Statics.field3767 = Statics.field452 * 128 + 64;
                    Statics.field1469 = Statics.field262 * 128 + 64;
                    Statics.field3473 = method17(Statics.field3767, Statics.field1469, Statics.field2770) - Statics.field3524;
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2291 == arg0.field1478) {
                field1088 = var3.method3429();
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2346 == arg0.field1478) {
                method52(class184.field2486);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2336 == arg0.field1478) {
                int var36 = var3.method3422();
                if (var36 == 65535) {
                    var36 = -1;
                }
                int var37 = var3.method3218();
                if (var37 == 65535) {
                    var37 = -1;
                }
                int var38 = var3.method3272();
                int var39 = var3.method3271();
                for (int var40 = var37; var40 <= var36; var40++) {
                    long var41 = ((long) var39 << 32) + (long) var40;
                    class217 var43 = field987.method3677(var41);
                    if (var43 != null) {
                        var43.method3710();
                    }
                    field987.method3668(new class224(var38), var41);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2295 == arg0.field1478) {
                int var44 = var3.method3218();
                int var45 = var3.method3429();
                int var46 = var3.method3218();
                Statics.method4174(var44, var45, var46);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2332 == arg0.field1478) {
                field1086 = var3.method3429();
                if (field1086 == 255) {
                    field1086 = 0;
                }
                field1006 = var3.method3429();
                if (field1006 == 255) {
                    field1006 = 0;
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2317 == arg0.field1478) {
                method264();
                field1023 = var3.method3303();
                field1053 = field1041;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2304 == arg0.field1478) {
                Statics.field2183.field1250.method4934(var3, arg0.field1479);
                Iterator var47 = class96.field1433.iterator();
                while (var47.hasNext()) {
                    class71 var48 = (class71) var47.next();
                    var48.method1002();
                }
                if (Statics.field444 != null) {
                    Statics.field444.method5064();
                }
                field1049 = field1041;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2301 == arg0.field1478) {
                int var49 = var3.method3422();
                int var50 = var3.method3272();
                int var51 = var3.method3219();
                int var52 = var3.method3263();
                class243 var53 = class243.method3(var50);
                if (var53.field2866 != var51 || var53.field2867 != var49 || var53.field2869 != var52) {
                    var53.field2866 = var51;
                    var53.field2867 = var49;
                    var53.field2869 = var52;
                    method260(var53);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2353 == arg0.field1478) {
                int var54 = var3.method3422();
                if (var54 == 65535) {
                    var54 = -1;
                }
                int var55 = var3.method3230();
                int var56 = var3.method3230();
                class243 var57 = class243.method3(var56);
                if (var57.field2814) {
                    var57.field2935 = var54;
                    var57.field2936 = var55;
                    class284 var59 = class284.method2869(var54);
                    var57.field2866 = var59.field3669;
                    var57.field2867 = var59.field3641;
                    var57.field2825 = var59.field3648;
                    var57.field2855 = var59.field3654;
                    var57.field2865 = var59.field3655;
                    var57.field2869 = var59.field3650;
                    if (var59.field3666 == 1) {
                        var57.field2873 = 1;
                    } else {
                        var57.field2873 = 2;
                    }
                    if (var57.field2870 > 0) {
                        var57.field2869 = var57.field2869 * 32 / var57.field2870;
                    } else if (var57.field2826 > 0) {
                        var57.field2869 = var57.field2869 * 32 / var57.field2826;
                    }
                    method260(var57);
                } else if (var54 == -1) {
                    var57.field2858 = 0;
                    arg0.field1478 = null;
                    return true;
                } else {
                    class284 var58 = class284.method2869(var54);
                    var57.field2858 = 4;
                    var57.field2924 = var54;
                    var57.field2866 = var58.field3669;
                    var57.field2867 = var58.field3641;
                    var57.field2869 = var58.field3650 * 100 / var55;
                    method260(var57);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2328 == arg0.field1478) {
                int var60 = var3.method3263();
                field1017 = var60;
                this.method1217(false);
                method4168(var60);
                class82.method1585(field1017);
                for (int var61 = 0; var61 < 100; var61++) {
                    field1061[var61] = true;
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2286 == arg0.field1478) {
                String var62 = var3.method3427();
                Object[] var63 = new Object[var62.length() + 1];
                for (int var64 = var62.length() - 1; var64 >= 0; var64--) {
                    if (var62.charAt(var64) == 's') {
                        var63[var64 + 1] = var3.method3427();
                    } else {
                        var63[var64 + 1] = Integer.valueOf(var3.method3230());
                    }
                }
                var63[0] = Integer.valueOf(var3.method3230());
                class69 var65 = new class69();
                var65.field783 = var63;
                class82.method3463(var65);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2350 == arg0.field1478) {
                int var66 = var3.method3272();
                int var67 = var3.method3218();
                class243 var68 = class243.method3(var66);
                if (var68 != null && var68.field2851 == 0) {
                    if (var67 > var68.field2839 - var68.field2888) {
                        var67 = var68.field2839 - var68.field2888;
                    }
                    if (var67 < 0) {
                        var67 = 0;
                    }
                    if (var68.field2837 != var67) {
                        var68.field2837 = var67;
                        method260(var68);
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2308 == arg0.field1478) {
                if (Statics.field444 != null) {
                    Statics.field444.method5080(var3);
                }
                field1050 = field1041;
                Statics.field3393 = true;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2343 == arg0.field1478) {
                for (int var69 = 0; var69 < field972.length; var69++) {
                    if (field972[var69] != null) {
                        field972[var69].field1183 = -1;
                    }
                }
                for (int var70 = 0; var70 < field898.length; var70++) {
                    if (field898[var70] != null) {
                        field898[var70].field1183 = -1;
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2367 == arg0.field1478) {
                field1100 = false;
                for (int var71 = 0; var71 < 5; var71++) {
                    field902[var71] = false;
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2368 == arg0.field1478) {
                int var72 = arg0.field1479;
                class326 var73 = new class326();
                var73.field3943 = var3.method3429();
                var73.field3949 = var3.method3230();
                var73.field3945 = new int[var73.field3943];
                var73.field3946 = new int[var73.field3943];
                var73.field3947 = new Field[var73.field3943];
                var73.field3948 = new int[var73.field3943];
                var73.field3944 = new Method[var73.field3943];
                var73.field3950 = new byte[var73.field3943][][];
                for (int var74 = 0; var74 < var73.field3943; var74++) {
                    try {
                        int var75 = var3.method3429();
                        if (var75 == 0 || var75 == 1 || var75 == 2) {
                            String var76 = var3.method3427();
                            String var77 = var3.method3427();
                            int var78 = 0;
                            if (var75 == 1) {
                                var78 = var3.method3230();
                            }
                            var73.field3945[var74] = var75;
                            var73.field3948[var74] = var78;
                            if (class327.method257(var76).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var73.field3947[var74] = class327.method257(var76).getDeclaredField(var77);
                        } else if (var75 == 3 || var75 == 4) {
                            String var79 = var3.method3427();
                            String var80 = var3.method3427();
                            int var81 = var3.method3429();
                            String[] var82 = new String[var81];
                            for (int var83 = 0; var83 < var81; var83++) {
                                var82[var83] = var3.method3427();
                            }
                            String var84 = var3.method3427();
                            byte[][] var85 = new byte[var81][];
                            if (var75 == 3) {
                                for (int var86 = 0; var86 < var81; var86++) {
                                    int var87 = var3.method3230();
                                    var85[var86] = new byte[var87];
                                    var3.method3237(var85[var86], 0, var87);
                                }
                            }
                            var73.field3945[var74] = var75;
                            Class[] var88 = new Class[var81];
                            for (int var89 = 0; var89 < var81; var89++) {
                                var88[var89] = class327.method257(var82[var89]);
                            }
                            Class var90 = class327.method257(var84);
                            if (class327.method257(var79).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var91 = class327.method257(var79).getDeclaredMethods();
                            Method[] var92 = var91;
                            for (int var93 = 0; var93 < var92.length; var93++) {
                                Method var94 = var92[var93];
                                if (var94.getName().equals(var80)) {
                                    Class[] var95 = var94.getParameterTypes();
                                    if (var88.length == var95.length) {
                                        boolean var96 = true;
                                        for (int var97 = 0; var97 < var88.length; var97++) {
                                            if (var88[var97] != var95[var97]) {
                                                var96 = false;
                                                break;
                                            }
                                        }
                                        if (var96 && var90 == var94.getReturnType()) {
                                            var73.field3944[var74] = var94;
                                        }
                                    }
                                }
                            }
                            var73.field3950[var74] = var85;
                        }
                    } catch (ClassNotFoundException var268) {
                        var73.field3946[var74] = -1;
                    } catch (SecurityException var269) {
                        var73.field3946[var74] = -2;
                    } catch (NullPointerException var270) {
                        var73.field3946[var74] = -3;
                    } catch (Exception var271) {
                        var73.field3946[var74] = -4;
                    } catch (Throwable var272) {
                        var73.field3946[var74] = -5;
                    }
                }
                class327.field3952.method3680(var73);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2344 == arg0.field1478) {
                for (int var103 = 0; var103 < Statics.field3446; var103++) {
                    class269 var104 = (class269) class269.field3443.method3625((long) var103);
                    class269 var105;
                    if (var104 == null) {
                        byte[] var106 = Statics.field3448.method4190(16, var103);
                        class269 var107 = new class269();
                        if (var106 != null) {
                            var107.method4367(new class195(var106));
                        }
                        class269.field3443.method3628(var107, (long) var103);
                        var105 = var107;
                    } else {
                        var105 = var104;
                    }
                    if (var105 != null) {
                        class238.field2773[var103] = 0;
                        class238.field2771[var103] = 0;
                    }
                }
                method264();
                field1043 += 32;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2325 == arg0.field1478) {
                int var109 = var3.method3272();
                class243 var110 = class243.method3(var109);
                var110.field2858 = 3;
                var110.field2924 = Statics.field260.field821.method4070();
                method260(var110);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2323 == arg0.field1478) {
                method3122(false, var3);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2300 == arg0.field1478) {
                method52(class184.field2491);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2330 == arg0.field1478) {
                method52(class184.field2488);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2322 == arg0.field1478) {
                int var111 = var3.method3230();
                int var112 = var3.method3303();
                class243 var113 = class243.method3(var111);
                if (var113.field2832 != var112 || var112 == -1) {
                    var113.field2832 = var112;
                    var113.field2838 = 0;
                    var113.field2807 = 0;
                    method260(var113);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2363 == arg0.field1478) {
                boolean var114 = var3.method3232();
                if (!var114) {
                    Statics.field1133 = null;
                } else if (Statics.field1133 == null) {
                    Statics.field1133 = new class266();
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2287 == arg0.field1478) {
                method52(class184.field2483);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2354 == arg0.field1478) {
                Statics.field3297 = class321.method998(var3.method3429());
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2290 == arg0.field1478) {
                int var115 = var3.method3266();
                int var116 = var3.method3230();
                int var117 = var3.method3332();
                class243 var118 = class243.method3(var116);
                if (var118.field2824 != var117 || var118.field2804 != var115 || var118.field2820 != 0 || var118.field2821 != 0) {
                    var118.field2824 = var117;
                    var118.field2804 = var115;
                    var118.field2820 = 0;
                    var118.field2821 = 0;
                    method260(var118);
                    this.method1105(var118);
                    if (var118.field2851 == 0) {
                        method519(Statics.field2520[var116 >> 16], var118, false);
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2357 == arg0.field1478) {
                method3122(true, var3);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2369 == arg0.field1478) {
                int var119 = var3.method3270();
                int var120 = var3.method3219();
                int var121 = var120 >> 10 & 0x1F;
                int var122 = var120 >> 5 & 0x1F;
                int var123 = var120 & 0x1F;
                int var124 = (var123 << 3) + (var121 << 19) + (var122 << 11);
                class243 var125 = class243.method3(var119);
                if (var125.field2840 != var124) {
                    var125.field2840 = var124;
                    method260(var125);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2292 == arg0.field1478) {
                int var126 = arg0.field1479 + var3.field2566;
                int var127 = var3.method3218();
                int var128 = var3.method3218();
                if (field1017 != var127) {
                    field1017 = var127;
                    this.method1217(false);
                    method4168(field1017);
                    class82.method1585(field1017);
                    for (int var129 = 0; var129 < 100; var129++) {
                        field1061[var129] = true;
                    }
                }
                while (var128-- > 0) {
                    int var130 = var3.method3230();
                    int var131 = var3.method3218();
                    int var132 = var3.method3429();
                    class68 var133 = (class68) field1018.method3677((long) var130);
                    if (var133 != null && var133.field774 != var131) {
                        method576(var133, true);
                        var133 = null;
                    }
                    if (var133 == null) {
                        class68 var134 = new class68();
                        var134.field774 = var131;
                        var134.field775 = var132;
                        field1018.method3668(var134, (long) var130);
                        method4168(var131);
                        class243 var135 = class243.method3(var130);
                        method260(var135);
                        if (field1103 != null) {
                            method260(field1103);
                            field1103 = null;
                        }
                        method56();
                        method519(Statics.field2520[var130 >> 16], var135, false);
                        class82.method1585(var131);
                        if (field1017 != -1) {
                            method3206(field1017, 1);
                        }
                        var133 = var134;
                    }
                    var133.field776 = true;
                }
                for (class68 var137 = (class68) field1018.method3658(); var137 != null; var137 = (class68) field1018.method3661()) {
                    if (var137.field776) {
                        var137.field776 = false;
                    } else {
                        method576(var137, true);
                    }
                }
                field987 = new class215(512);
                while (var3.field2566 < var126) {
                    int var138 = var3.method3230();
                    int var139 = var3.method3218();
                    int var140 = var3.method3218();
                    int var141 = var3.method3230();
                    for (int var142 = var139; var142 <= var140; var142++) {
                        long var143 = ((long) var138 << 32) + (long) var142;
                        field987.method3668(new class224(var141), var143);
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2305 == arg0.field1478) {
                if (arg0.field1479 == 0) {
                    Statics.field444 = null;
                } else {
                    if (Statics.field444 == null) {
                        Statics.field444 = new class308(Statics.field1108, Statics.field240);
                    }
                    Statics.field444.method5082(var3);
                }
                field1050 = field1041;
                Statics.field3393 = true;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2306 == arg0.field1478) {
                field1100 = true;
                Statics.field3442 = var3.method3429();
                Statics.field2124 = var3.method3429();
                Statics.field1318 = var3.method3218();
                Statics.field295 = var3.method3429();
                Statics.field486 = var3.method3429();
                if (Statics.field486 >= 100) {
                    int var145 = Statics.field3442 * 128 + 64;
                    int var146 = Statics.field2124 * 128 + 64;
                    int var147 = method17(var145, var146, Statics.field2770) - Statics.field1318;
                    int var148 = var145 - Statics.field3767;
                    int var149 = var147 - Statics.field3473;
                    int var150 = var146 - Statics.field1469;
                    int var151 = (int) Math.sqrt((double) (var148 * var148 + var150 * var150));
                    Statics.field242 = (int) (Math.atan2((double) var149, (double) var151) * 325.949D) & 0x7FF;
                    Statics.field2454 = (int) (Math.atan2((double) var148, (double) var150) * -325.949D) & 0x7FF;
                    if (Statics.field242 < 128) {
                        Statics.field242 = 128;
                    }
                    if (Statics.field242 > 383) {
                        Statics.field242 = 383;
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2335 == arg0.field1478) {
                class78 var152 = new class78();
                var152.field1228 = var3.method3427();
                var152.field1231 = var3.method3218();
                int var153 = var3.method3230();
                var152.field1219 = var153;
                method666(45);
                var2.method3022();
                Object var154 = null;
                class91.method1591(var152);
                arg0.field1478 = null;
                return false;
            }
            if (class181.field2349 == arg0.field1478) {
                var3.field2566 += 28;
                if (var3.method3249()) {
                    int var155 = var3.field2566 - 28;
                    method3012(var3.field2567, var155);
                    if (class168.field2205 != null) {
                        try {
                            class168.field2205.method2293(0L);
                            class168.field2205.method2296(var3.field2567, var155, 24);
                        } catch (Exception var267) {
                        }
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2307 == arg0.field1478) {
                int var157 = var3.method3263();
                int var158 = var3.method3272();
                int var159 = var3.method3422();
                class243 var160 = class243.method3(var158);
                var160.field2907 = (var157 << 16) + var159;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2316 == arg0.field1478) {
                String var161 = var3.method3427();
                String var162 = class314.method14(var3, 32767);
                String var163 = class313.method5110(class319.method1775(var162));
                class96.method3189(6, var161, var163);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2361 == arg0.field1478) {
                int var164 = var3.method3270();
                int var165 = var3.method3219();
                class238.field2773[var165] = var164;
                if (class238.field2771[var165] != var164) {
                    class238.field2771[var165] = var164;
                }
                method1800(var165);
                field989[++field1043 - 1 & 0x1F] = var165;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2331 == arg0.field1478) {
                method1001(true, arg0.field1477);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2324 == arg0.field1478) {
                Statics.field2183.method1523(var3, arg0.field1479);
                field1049 = field1041;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2302 == arg0.field1478) {
                int var166 = var3.method3422();
                int var167 = var3.method3230();
                class243 var168 = class243.method3(var167);
                if (var168.field2858 != 2 || var168.field2924 != var166) {
                    var168.field2858 = 2;
                    var168.field2924 = var166;
                    method260(var168);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2319 == arg0.field1478) {
                field1072 = var3.method3254();
                field1036 = var3.method3254();
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2312 == arg0.field1478) {
                int var169 = var3.method3271();
                int var170 = var3.method3270();
                class68 var171 = (class68) field1018.method3677((long) var170);
                class68 var172 = (class68) field1018.method3677((long) var169);
                if (var172 != null) {
                    method576(var172, var171 == null || var171.field774 != var172.field774);
                }
                if (var171 != null) {
                    var171.method3710();
                    field1018.method3668(var171, (long) var169);
                }
                class243 var173 = class243.method3(var170);
                if (var173 != null) {
                    method260(var173);
                }
                class243 var174 = class243.method3(var169);
                if (var174 != null) {
                    method260(var174);
                    method519(Statics.field2520[var174.field2815 >>> 16], var174, true);
                }
                if (field1017 != -1) {
                    method3206(field1017, 1);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2339 == arg0.field1478) {
                byte var175 = var3.method3226();
                int var176 = var3.method3219();
                class238.field2773[var176] = var175;
                if (class238.field2771[var176] != var175) {
                    class238.field2771[var176] = var175;
                }
                method1800(var176);
                field989[++field1043 - 1 & 0x1F] = var176;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2303 == arg0.field1478) {
                method1001(false, arg0.field1477);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2358 == arg0.field1478) {
                boolean var177 = var3.method3429() == 1;
                if (var177) {
                    Statics.field3432 = class197.method26() - var3.method3231();
                    Statics.field889 = new class14(var3, true);
                } else {
                    Statics.field889 = null;
                }
                field880 = field1041;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2296 == arg0.field1478) {
                method52(class184.field2484);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2348 == arg0.field1478) {
                Statics.field2183.method1522();
                field1049 = field1041;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2341 == arg0.field1478) {
                int var178 = var3.method3429();
                if (var3.method3429() == 0) {
                    field1122[var178] = new class17();
                    var3.field2566 += 18;
                } else {
                    var3.field2566--;
                    field1122[var178] = new class17(var3, false);
                }
                field1009 = field1041;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2309 == arg0.field1478) {
                int var179 = var3.method3263();
                class66 var180 = (class66) class66.field754.method3677((long) var179);
                if (var180 != null) {
                    var180.method3710();
                }
                field1044[++field1120 - 1 & 0x1F] = var179 & 0x7FFF;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2366 == arg0.field1478) {
                field875 = var3.method3429();
                if (field875 == 1) {
                    field876 = var3.method3218();
                }
                if (field875 >= 2 && field875 <= 6) {
                    if (field875 == 2) {
                        field1015 = 64;
                        field1124 = 64;
                    }
                    if (field875 == 3) {
                        field1015 = 0;
                        field1124 = 64;
                    }
                    if (field875 == 4) {
                        field1015 = 128;
                        field1124 = 64;
                    }
                    if (field875 == 5) {
                        field1015 = 64;
                        field1124 = 0;
                    }
                    if (field875 == 6) {
                        field1015 = 64;
                        field1124 = 128;
                    }
                    field875 = 2;
                    field1079 = var3.method3218();
                    field879 = var3.method3218();
                    field1075 = var3.method3429();
                }
                if (field875 == 10) {
                    field1037 = var3.method3218();
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2352 == arg0.field1478) {
                int var181 = var3.method3230();
                if (field1010 != var181) {
                    field1010 = var181;
                    if (field931 == 1) {
                        field939 = true;
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2313 == arg0.field1478) {
                Statics.field534 = var3.method3379();
                Statics.field674 = var3.method3429();
                for (int var182 = Statics.field534; var182 < Statics.field534 + 8; var182++) {
                    for (int var183 = Statics.field674; var183 < Statics.field674 + 8; var183++) {
                        if (field984[Statics.field2770][var182][var183] != null) {
                            field984[Statics.field2770][var182][var183] = null;
                            method72(var182, var183);
                        }
                    }
                }
                for (class75 var184 = (class75) field1116.method3723(); var184 != null; var184 = (class75) field1116.method3722()) {
                    if (var184.field1149 >= Statics.field534 && var184.field1149 < Statics.field534 + 8 && var184.field1141 >= Statics.field674 && var184.field1141 < Statics.field674 + 8 && Statics.field2770 == var184.field1140) {
                        var184.field1137 = 0;
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2355 == arg0.field1478) {
                String var185 = var3.method3427();
                long var186 = (long) var3.method3218();
                long var188 = (long) var3.method3293();
                class257 var190 = (class257) class190.method578(class257.method7(), var3.method3429());
                long var191 = (var186 << 32) + var188;
                boolean var193 = false;
                for (int var194 = 0; var194 < 100; var194++) {
                    if (field990[var194] == var191) {
                        var193 = true;
                        break;
                    }
                }
                if (Statics.field2183.method1559(new class306(var185, Statics.field1108))) {
                    var193 = true;
                }
                if (!var193 && field970 == 0) {
                    field990[field1076] = var191;
                    field1076 = (field1076 + 1) % 100;
                    String var195 = class314.method14(var3, 32767);
                    String var196 = class313.method5110(class319.method1775(var195));
                    byte var197;
                    if (var190.field3336) {
                        var197 = 7;
                    } else {
                        var197 = 3;
                    }
                    if (var190.field3335 == -1) {
                        class96.method3189(var197, var185, var196);
                    } else {
                        class96.method3189(var197, class87.method176(var190.field3335) + var185, var196);
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2299 == arg0.field1478) {
                int var198 = var3.method3429();
                int var199 = var3.method3429();
                int var200 = var3.method3429();
                int var201 = var3.method3429();
                field902[var198] = true;
                field1102[var198] = var199;
                field862[var198] = var200;
                field1104[var198] = var201;
                field1105[var198] = 0;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2326 == arg0.field1478) {
                String var202 = var3.method3427();
                Statics.field1293 = var202;
                try {
                    String var203 = Statics.field240.getParameter(class294.field3805.field3809);
                    String var204 = Statics.field240.getParameter(class294.field3806.field3809);
                    String var205 = var203 + "settings=" + var202 + "; version=1; path=/; domain=" + var204;
                    String var206;
                    if (var202.length() == 0) {
                        var206 = var205 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var207 = var205 + "; Expires=";
                        long var208 = class197.method26() + 94608000000L;
                        class205.field2610.setTime(new Date(var208));
                        int var210 = class205.field2610.get(7);
                        int var211 = class205.field2610.get(5);
                        int var212 = class205.field2610.get(2);
                        int var213 = class205.field2610.get(1);
                        int var214 = class205.field2610.get(11);
                        int var215 = class205.field2610.get(12);
                        int var216 = class205.field2610.get(13);
                        String var217 = class205.field2608[var210 - 1] + ", " + var211 / 10 + var211 % 10 + "-" + class205.field2609[0][var212] + "-" + var213 + " " + var214 / 10 + var214 % 10 + ":" + var215 / 10 + var215 % 10 + ":" + var216 / 10 + var216 % 10 + " GMT";
                        var206 = var207 + var217 + "; Max-Age=" + 94608000L;
                    }
                    class54.method708(Statics.field240, "document.cookie=\"" + var206 + "\"");
                } catch (Throwable var266) {
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2359 == arg0.field1478) {
                int var219 = var3.method3255();
                String var220 = var3.method3427();
                int var221 = var3.method3254();
                if (var219 >= 1 && var219 <= 8) {
                    if (var220.equalsIgnoreCase(class252.field3012)) {
                        var220 = null;
                    }
                    field980[var219 - 1] = var220;
                    field964[var219 - 1] = var221 == 0;
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2329 == arg0.field1478) {
                int var222 = var3.method3219();
                if (var222 == 65535) {
                    var222 = -1;
                }
                if (var222 == -1 && !field1091) {
                    Statics.field2680.method3836();
                    class230.field2681 = 1;
                    Statics.field715 = null;
                } else if (var222 != -1 && field1090 != var222 && field1045 != 0 && !field1091) {
                    class230.method2297(2, Statics.field13, var222, 0, field1045, false);
                }
                field1090 = var222;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2294 == arg0.field1478) {
                int var223 = var3.method3293();
                int var224 = var3.method3219();
                if (var224 == 65535) {
                    var224 = -1;
                }
                method1856(var224, var223);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2298 == arg0.field1478) {
                int var225 = var3.method3239();
                boolean var226 = var3.method3429() == 1;
                String var227 = "";
                boolean var228 = false;
                if (var226) {
                    var227 = var3.method3427();
                    if (Statics.field2183.method1559(new class306(var227, Statics.field1108))) {
                        var228 = true;
                    }
                }
                String var229 = var3.method3427();
                if (!var228) {
                    class96.method3189(var225, var227, var229);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2364 == arg0.field1478) {
                method52(class184.field2485);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2360 == arg0.field1478) {
                for (int var230 = 0; var230 < class238.field2771.length; var230++) {
                    if (class238.field2773[var230] != class238.field2771[var230]) {
                        class238.field2771[var230] = class238.field2773[var230];
                        method1800(var230);
                        field989[++field1043 - 1 & 0x1F] = var230;
                    }
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2297 == arg0.field1478) {
                int var231 = var3.method3230();
                int var232 = var3.method3218();
                if (var231 < -70000) {
                    var232 += 32768;
                }
                class243 var233;
                if (var231 >= 0) {
                    var233 = class243.method3(var231);
                } else {
                    var233 = null;
                }
                while (var3.field2566 < arg0.field1479) {
                    int var234 = var3.method3239();
                    int var235 = var3.method3218();
                    int var236 = 0;
                    if (var235 != 0) {
                        var236 = var3.method3429();
                        if (var236 == 255) {
                            var236 = var3.method3230();
                        }
                    }
                    if (var233 != null && var234 >= 0 && var234 < var233.field2879.length) {
                        var233.field2879[var234] = var235;
                        var233.field2934[var234] = var236;
                    }
                    class66.method87(var232, var234, var235 - 1, var236);
                }
                if (var233 != null) {
                    method260(var233);
                }
                method264();
                field1044[++field1120 - 1 & 0x1F] = var232 & 0x7FFF;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2318 == arg0.field1478) {
                int var237 = var3.method3230();
                int var238 = var3.method3422();
                int var239 = var3.method3254();
                class68 var240 = (class68) field1018.method3677((long) var237);
                if (var240 != null) {
                    method576(var240, var240.field774 != var238);
                }
                class68 var241 = new class68();
                var241.field774 = var238;
                var241.field775 = var239;
                field1018.method3668(var241, (long) var237);
                method4168(var238);
                class243 var242 = class243.method3(var237);
                method260(var242);
                if (field1103 != null) {
                    method260(field1103);
                    field1103 = null;
                }
                method56();
                method519(Statics.field2520[var237 >> 16], var242, false);
                class82.method1585(var238);
                if (field1017 != -1) {
                    method3206(field1017, 1);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2337 == arg0.field1478) {
                method52(class184.field2490);
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2327 == arg0.field1478) {
                String var243 = var3.method3427();
                int var244 = var3.method3270();
                class243 var245 = class243.method3(var244);
                if (!var243.equals(var245.field2877)) {
                    var245.field2877 = var243;
                    method260(var245);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2311 == arg0.field1478) {
                field874 = var3.method3218() * 30;
                field1053 = field1041;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2347 == arg0.field1478) {
                method264();
                int var246 = var3.method3429();
                int var247 = var3.method3270();
                int var248 = var3.method3254();
                field918[var246] = var247;
                field1121[var246] = var248;
                field917[var246] = 1;
                for (int var249 = 0; var249 < 98; var249++) {
                    if (var247 >= class249.field2999[var249]) {
                        field917[var246] = var249 + 2;
                    }
                }
                field1046[++field1047 - 1 & 0x1F] = var246;
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2338 == arg0.field1478) {
                class94.method1445(var3, arg0.field1479);
                method480();
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2288 == arg0.field1478) {
                Statics.field674 = var3.method3429();
                Statics.field534 = var3.method3255();
                while (var3.field2566 < arg0.field1479) {
                    int var250 = var3.method3429();
                    class184 var251 = class184.method1650()[var250];
                    method52(var251);
                }
                arg0.field1478 = null;
                return true;
            }
            if (class181.field2320 == arg0.field1478) {
                int var252 = var3.method3230();
                int var253 = var3.method3218();
                if (var252 < -70000) {
                    var253 += 32768;
                }
                class243 var254;
                if (var252 >= 0) {
                    var254 = class243.method3(var252);
                } else {
                    var254 = null;
                }
                if (var254 != null) {
                    for (int var255 = 0; var255 < var254.field2879.length; var255++) {
                        var254.field2879[var255] = 0;
                        var254.field2934[var255] = 0;
                    }
                }
                class66 var256 = (class66) class66.field754.method3677((long) var253);
                if (var256 != null) {
                    for (int var257 = 0; var257 < var256.field758.length; var257++) {
                        var256.field758[var257] = -1;
                        var256.field753[var257] = 0;
                    }
                }
                int var258 = var3.method3218();
                for (int var259 = 0; var259 < var258; var259++) {
                    int var260 = var3.method3255();
                    if (var260 == 255) {
                        var260 = var3.method3270();
                    }
                    int var261 = var3.method3263();
                    if (var254 != null && var259 < var254.field2879.length) {
                        var254.field2879[var259] = var261;
                        var254.field2934[var259] = var260;
                    }
                    class66.method87(var253, var259, var261 - 1, var260);
                }
                if (var254 != null) {
                    method260(var254);
                }
                method264();
                field1044[++field1120 - 1 & 0x1F] = var253 & 0x7FFF;
                arg0.field1478 = null;
                return true;
            }
            class165.method2883("" + (arg0.field1478 == null ? -1 : arg0.field1478.field2370) + class87.field1309 + (arg0.field1474 == null ? -1 : arg0.field1474.field2370) + class87.field1309 + (arg0.field1472 == null ? -1 : arg0.field1472.field2370) + class87.field1309 + arg0.field1479, (Throwable) null);
            method1586();
        } catch (IOException var273) {
            method2902();
        } catch (Exception var274) {
            String var264 = "" + (arg0.field1478 == null ? -1 : arg0.field1478.field2370) + class87.field1309 + (arg0.field1474 == null ? -1 : arg0.field1474.field2370) + class87.field1309 + (arg0.field1472 == null ? -1 : arg0.field1472.field2370) + class87.field1309 + arg0.field1479 + class87.field1309 + (Statics.field2499 + Statics.field260.field1189[0]) + class87.field1309 + (Statics.field29 + Statics.field260.field1207[0]) + class87.field1309;
            for (int var265 = 0; var265 < arg0.field1479 && var265 < 50; var265++) {
                var264 = var264 + var3.field2567[var265] + class87.field1309;
            }
            class165.method2883(var264, var274);
            method1586();
        }
        return true;
    }

    @ObfuscatedName("r.hq(Lgk;I)V")
    public static final void method52(class184 arg0) {
        class202 var1 = field903.field1477;
        if (class184.field2490 == arg0) {
            int var2 = var1.method3429();
            int var3 = (var2 >> 4 & 0x7) + Statics.field534;
            int var4 = (var2 & 0x7) + Statics.field674;
            int var5 = var1.method3263();
            int var6 = var1.method3429();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field1059[var7];
            if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
                if (var9 == 0) {
                    class141 var10 = Statics.field3868.method2784(Statics.field2770, var3, var4);
                    if (var10 != null) {
                        int var11 = var10.field2051 >> 14 & 0x7FFF;
                        if (var7 == 2) {
                            var10.field2050 = new class98(var11, 2, var8 + 4, Statics.field2770, var3, var4, var5, false, var10.field2050);
                            var10.field2045 = new class98(var11, 2, var8 + 1 & 0x3, Statics.field2770, var3, var4, var5, false, var10.field2045);
                        } else {
                            var10.field2050 = new class98(var11, var7, var8, Statics.field2770, var3, var4, var5, false, var10.field2050);
                        }
                    }
                }
                if (var9 == 1) {
                    class146 var12 = Statics.field3868.method2687(Statics.field2770, var3, var4);
                    if (var12 != null) {
                        int var13 = var12.field2094 >> 14 & 0x7FFF;
                        if (var7 == 4 || var7 == 5) {
                            var12.field2086 = new class98(var13, 4, var8, Statics.field2770, var3, var4, var5, false, var12.field2086);
                        } else if (var7 == 6) {
                            var12.field2086 = new class98(var13, 4, var8 + 4, Statics.field2770, var3, var4, var5, false, var12.field2086);
                        } else if (var7 == 7) {
                            var12.field2086 = new class98(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field2770, var3, var4, var5, false, var12.field2086);
                        } else if (var7 == 8) {
                            var12.field2086 = new class98(var13, 4, var8 + 4, Statics.field2770, var3, var4, var5, false, var12.field2086);
                            var12.field2093 = new class98(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field2770, var3, var4, var5, false, var12.field2093);
                        }
                    }
                }
                if (var9 == 2) {
                    class147 var14 = Statics.field3868.method2688(Statics.field2770, var3, var4);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var14 != null) {
                        var14.field2110 = new class98(var14.field2111 >> 14 & 0x7FFF, var7, var8, Statics.field2770, var3, var4, var5, false, var14.field2110);
                    }
                }
                if (var9 == 3) {
                    class128 var15 = Statics.field3868.method2689(Statics.field2770, var3, var4);
                    if (var15 != null) {
                        var15.field1784 = new class98(var15.field1781 >> 14 & 0x7FFF, 22, var8, Statics.field2770, var3, var4, var5, false, var15.field1784);
                    }
                }
            }
            return;
        }
        if (class184.field2488 == arg0) {
            int var16 = var1.method3218();
            byte var17 = var1.method3226();
            int var18 = var1.method3254();
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = field1059[var19];
            int var22 = var1.method3379();
            int var23 = (var22 >> 4 & 0x7) + Statics.field534;
            int var24 = (var22 & 0x7) + Statics.field674;
            byte var25 = var1.method3257();
            int var26 = var1.method3218();
            int var27 = var1.method3219();
            int var28 = var1.method3219();
            byte var29 = var1.method3258();
            byte var30 = var1.method3257();
            class73 var31;
            if (field1001 == var27) {
                var31 = Statics.field260;
            } else {
                var31 = field972[var27];
            }
            if (var31 != null) {
                class283 var32 = class283.method4185(var28);
                int var33;
                int var34;
                if (var20 == 1 || var20 == 3) {
                    var33 = var32.field3603;
                    var34 = var32.field3602;
                } else {
                    var33 = var32.field3602;
                    var34 = var32.field3603;
                }
                int var35 = (var33 >> 1) + var23;
                int var36 = (var33 + 1 >> 1) + var23;
                int var37 = (var34 >> 1) + var24;
                int var38 = (var34 + 1 >> 1) + var24;
                int[][] var39 = class63.field729[Statics.field2770];
                int var40 = var39[var35][var37] + var39[var36][var37] + var39[var35][var38] + var39[var36][var38] >> 2;
                int var41 = (var23 << 7) + (var33 << 6);
                int var42 = (var24 << 7) + (var34 << 6);
                class132 var43 = var32.method4632(var19, var20, var39, var41, var40, var42);
                if (var43 != null) {
                    method3930(Statics.field2770, var23, var24, var21, -1, 0, 0, var26 + 1, var16 + 1);
                    var31.field845 = field867 + var26;
                    var31.field830 = field867 + var16;
                    var31.field835 = var43;
                    var31.field832 = var23 * 128 + var33 * 64;
                    var31.field834 = var24 * 128 + var34 * 64;
                    var31.field822 = var40;
                    if (var17 > var29) {
                        byte var44 = var17;
                        var17 = var29;
                        var29 = var44;
                    }
                    if (var30 > var25) {
                        byte var45 = var30;
                        var30 = var25;
                        var25 = var45;
                    }
                    var31.field836 = var17 + var23;
                    var31.field849 = var23 + var29;
                    var31.field827 = var24 + var30;
                    var31.field839 = var24 + var25;
                }
            }
        }
        if (class184.field2482 == arg0) {
            int var46 = var1.method3422();
            int var47 = var1.method3254();
            int var48 = (var47 >> 4 & 0x7) + Statics.field534;
            int var49 = (var47 & 0x7) + Statics.field674;
            int var50 = var1.method3379();
            int var51 = var1.method3219();
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                int var52 = var48 * 128 + 64;
                int var53 = var49 * 128 + 64;
                class83 var54 = new class83(var46, Statics.field2770, var52, var53, method17(var52, var53, Statics.field2770) - var50, var51, field867);
                field978.method3716(var54);
            }
        } else if (class184.field2483 == arg0) {
            int var55 = var1.method3254();
            int var56 = (var55 >> 4 & 0x7) + Statics.field534;
            int var57 = (var55 & 0x7) + Statics.field674;
            int var58 = var1.method3422();
            int var59 = var1.method3219();
            int var60 = var1.method3218();
            if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                class218 var61 = field984[Statics.field2770][var56][var57];
                if (var61 != null) {
                    for (class93 var62 = (class93) var61.method3723(); var62 != null; var62 = (class93) var61.method3722()) {
                        if ((var60 & 0x7FFF) == var62.field1405 && var62.field1406 == var58) {
                            var62.field1406 = var59;
                            break;
                        }
                    }
                    method72(var56, var57);
                }
            }
        } else {
            if (class184.field2489 == arg0) {
                int var63 = var1.method3255();
                int var64 = (var63 >> 4 & 0x7) + Statics.field534;
                int var65 = (var63 & 0x7) + Statics.field674;
                int var66 = var1.method3379();
                int var67 = var1.method3218();
                int var68 = var1.method3429();
                int var69 = var68 >> 4 & 0xF;
                int var70 = var68 & 0x7;
                if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                    int var71 = var69 + 1;
                    if (Statics.field260.field1189[0] >= var64 - var71 && Statics.field260.field1189[0] <= var64 + var71 && Statics.field260.field1207[0] >= var65 - var71 && Statics.field260.field1207[0] <= var65 + var71 && field1035 != 0 && var70 > 0 && field1094 < 50) {
                        field886[field1094] = var67;
                        field920[field1094] = var70;
                        field1097[field1094] = var66;
                        field1099[field1094] = null;
                        field1098[field1094] = (var64 << 16) + (var65 << 8) + var69;
                        field1094++;
                    }
                }
            }
            if (class184.field2486 == arg0) {
                byte var72 = var1.method3258();
                int var73 = var1.method3255() * 4;
                int var74 = var1.method3332();
                int var75 = var1.method3255();
                int var76 = (var75 >> 4 & 0x7) + Statics.field534;
                int var77 = (var75 & 0x7) + Statics.field674;
                int var78 = var1.method3429();
                int var79 = var1.method3429() * 4;
                int var80 = var1.method3429();
                int var81 = var1.method3422();
                byte var82 = var1.method3256();
                int var83 = var1.method3218();
                int var84 = var1.method3218();
                int var85 = var72 + var76;
                int var86 = var77 + var82;
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var84 != 65535) {
                    int var87 = var76 * 128 + 64;
                    int var88 = var77 * 128 + 64;
                    int var89 = var85 * 128 + 64;
                    int var90 = var86 * 128 + 64;
                    class92 var91 = new class92(var84, Statics.field2770, var87, var88, method17(var87, var88, Statics.field2770) - var79, field867 + var81, field867 + var83, var78, var80, var74, var73);
                    var91.method1767(var89, var90, method17(var89, var90, Statics.field2770) - var73, field867 + var81);
                    field986.method3716(var91);
                }
            } else if (class184.field2487 == arg0) {
                int var92 = var1.method3263();
                int var93 = var1.method3422();
                int var94 = var1.method3254();
                int var95 = (var94 >> 4 & 0x7) + Statics.field534;
                int var96 = (var94 & 0x7) + Statics.field674;
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    class93 var97 = new class93();
                    var97.field1405 = var92;
                    var97.field1406 = var93;
                    if (field984[Statics.field2770][var95][var96] == null) {
                        field984[Statics.field2770][var95][var96] = new class218();
                    }
                    field984[Statics.field2770][var95][var96].method3716(var97);
                    method72(var95, var96);
                }
            } else if (class184.field2485 == arg0) {
                int var98 = var1.method3379();
                int var99 = (var98 >> 4 & 0x7) + Statics.field534;
                int var100 = (var98 & 0x7) + Statics.field674;
                int var101 = var1.method3254();
                int var102 = var101 >> 2;
                int var103 = var101 & 0x3;
                int var104 = field1059[var102];
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    method3930(Statics.field2770, var99, var100, var104, -1, var102, var103, 0, -1);
                }
            } else if (class184.field2491 == arg0) {
                int var105 = var1.method3379();
                int var106 = (var105 >> 4 & 0x7) + Statics.field534;
                int var107 = (var105 & 0x7) + Statics.field674;
                int var108 = var1.method3422();
                int var109 = var1.method3255();
                int var110 = var109 >> 2;
                int var111 = var109 & 0x3;
                int var112 = field1059[var110];
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    method3930(Statics.field2770, var106, var107, var112, var108, var110, var111, 0, -1);
                }
            } else if (class184.field2484 == arg0) {
                int var113 = var1.method3263();
                int var114 = var1.method3254();
                int var115 = (var114 >> 4 & 0x7) + Statics.field534;
                int var116 = (var114 & 0x7) + Statics.field674;
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                    class218 var117 = field984[Statics.field2770][var115][var116];
                    if (var117 != null) {
                        for (class93 var118 = (class93) var117.method3723(); var118 != null; var118 = (class93) var117.method3722()) {
                            if ((var113 & 0x7FFF) == var118.field1405) {
                                var118.method3710();
                                break;
                            }
                        }
                        if (var117.method3723() == null) {
                            field984[Statics.field2770][var115][var116] = null;
                        }
                        method72(var115, var116);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hu.hs(IIIIIIIIII)V")
    public static final void method3930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75 var9 = null;
        for (class75 var10 = (class75) field1116.method3723(); var10 != null; var10 = (class75) field1116.method3722()) {
            if (var10.field1140 == arg0 && var10.field1149 == arg1 && var10.field1141 == arg2 && var10.field1136 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class75();
            var9.field1140 = arg0;
            var9.field1136 = arg3;
            var9.field1149 = arg1;
            var9.field1141 = arg2;
            method4829(var9);
            field1116.method3716(var9);
        }
        var9.field1134 = arg4;
        var9.field1143 = arg5;
        var9.field1142 = arg6;
        var9.field1144 = arg7;
        var9.field1137 = arg8;
    }

    @ObfuscatedName("j.hk(I)V")
    public static final void method6() {
        for (class75 var0 = (class75) field1116.method3723(); var0 != null; var0 = (class75) field1116.method3722()) {
            if (var0.field1137 == -1) {
                var0.field1144 = 0;
                method4829(var0);
            } else {
                var0.method3710();
            }
        }
    }

    @ObfuscatedName("kk.hr(Lbi;I)V")
    public static final void method4829(class75 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1136 == 0) {
            var1 = Statics.field3868.method2775(arg0.field1140, arg0.field1149, arg0.field1141);
        }
        if (arg0.field1136 == 1) {
            var1 = Statics.field3868.method2691(arg0.field1140, arg0.field1149, arg0.field1141);
        }
        if (arg0.field1136 == 2) {
            var1 = Statics.field3868.method2692(arg0.field1140, arg0.field1149, arg0.field1141);
        }
        if (arg0.field1136 == 3) {
            var1 = Statics.field3868.method2693(arg0.field1140, arg0.field1149, arg0.field1141);
        }
        if (var1 != 0) {
            int var5 = Statics.field3868.method2829(arg0.field1140, arg0.field1149, arg0.field1141, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1138 = var2;
        arg0.field1135 = var3;
        arg0.field1139 = var4;
    }

    @ObfuscatedName("bj.hb(IIIIIIII)V")
    public static final void method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field863 && Statics.field2770 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field3868.method2775(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3868.method2691(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3868.method2692(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3868.method2693(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field3868.method2829(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3868.method2751(arg0, arg2, arg3);
                class283 var15 = class283.method4185(var12);
                if (var15.field3587 != 0) {
                    field1048[arg0].method3085(arg2, arg3, var13, var14, var15.field3605);
                }
            }
            if (arg1 == 1) {
                Statics.field3868.method2682(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3868.method2762(arg0, arg2, arg3);
                class283 var16 = class283.method4185(var12);
                if (var16.field3602 + arg2 > 103 || var16.field3602 + arg3 > 103 || var16.field3603 + arg2 > 103 || var16.field3603 + arg3 > 103) {
                    return;
                }
                if (var16.field3587 != 0) {
                    field1048[arg0].method3086(arg2, arg3, var16.field3602, var16.field3603, var14, var16.field3605);
                }
            }
            if (arg1 == 3) {
                Statics.field3868.method2799(arg0, arg2, arg3);
                class283 var17 = class283.method4185(var12);
                if (var17.field3587 == 1) {
                    field1048[arg0].method3087(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class63.field721[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class138 var19 = Statics.field3868;
        class177 var20 = field1048[arg0];
        class283 var21 = class283.method4185(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3603;
            var23 = var21.field3602;
        } else {
            var22 = var21.field3602;
            var23 = var21.field3603;
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
        int[][] var28 = class63.field729[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3613 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3619 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class140 var34;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var34 = var21.method4632(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class98(arg4, 22, arg5, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2753(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3587 == 1) {
                var20.method3110(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class140 var57;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var57 = var21.method4632(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class98(arg4, 10, arg5, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            if (var57 != null) {
                var19.method2684(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3587 != 0) {
                var20.method3080(arg2, arg3, var22, var23, var21.field3605);
            }
        } else if (arg6 >= 12) {
            class140 var35;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var35 = var21.method4632(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class98(arg4, arg6, arg5, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2684(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3587 != 0) {
                var20.method3080(arg2, arg3, var22, var23, var21.field3605);
            }
        } else if (arg6 == 0) {
            class140 var36;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var36 = var21.method4632(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class98(arg4, 0, arg5, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2672(arg0, arg2, arg3, var29, var36, (class140) null, class63.field728[arg5], 0, var32, var33);
            if (var21.field3587 != 0) {
                var20.method3096(arg2, arg3, arg6, arg5, var21.field3605);
            }
        } else if (arg6 == 1) {
            class140 var37;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var37 = var21.method4632(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class98(arg4, 1, arg5, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2672(arg0, arg2, arg3, var29, var37, (class140) null, class63.field732[arg5], 0, var32, var33);
            if (var21.field3587 != 0) {
                var20.method3096(arg2, arg3, arg6, arg5, var21.field3605);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class140 var39;
            class140 var40;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var39 = var21.method4632(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4632(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class98(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3593, true, (class140) null);
                var40 = new class98(arg4, 2, var38, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2672(arg0, arg2, arg3, var29, var39, var40, class63.field728[arg5], class63.field728[var38], var32, var33);
            if (var21.field3587 != 0) {
                var20.method3096(arg2, arg3, arg6, arg5, var21.field3605);
            }
        } else if (arg6 == 3) {
            class140 var41;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var41 = var21.method4632(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class98(arg4, 3, arg5, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2672(arg0, arg2, arg3, var29, var41, (class140) null, class63.field732[arg5], 0, var32, var33);
            if (var21.field3587 != 0) {
                var20.method3096(arg2, arg3, arg6, arg5, var21.field3605);
            }
        } else if (arg6 == 9) {
            class140 var42;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var42 = var21.method4632(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class98(arg4, arg6, arg5, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2684(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3587 != 0) {
                var20.method3080(arg2, arg3, var22, var23, var21.field3605);
            }
        } else if (arg6 == 4) {
            class140 var43;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var43 = var21.method4632(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class98(arg4, 4, arg5, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2673(arg0, arg2, arg3, var29, var43, (class140) null, class63.field728[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2775(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class283.method4185(var45 >> 14 & 0x7FFF).field3611;
            }
            class140 var46;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var46 = var21.method4632(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class98(arg4, 4, arg5, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2673(arg0, arg2, arg3, var29, var46, (class140) null, class63.field728[arg5], 0, class63.field731[arg5] * var44, class63.field727[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2775(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class283.method4185(var48 >> 14 & 0x7FFF).field3611 / 2;
            }
            class140 var49;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var49 = var21.method4632(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class98(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2673(arg0, arg2, arg3, var29, var49, (class140) null, 256, arg5, class63.field724[arg5] * var47, class63.field733[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class140 var51;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var51 = var21.method4632(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class98(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2673(arg0, arg2, arg3, var29, var51, (class140) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2775(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class283.method4185(var53 >> 14 & 0x7FFF).field3611 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class140 var55;
            class140 var56;
            if (var21.field3593 == -1 && var21.field3628 == null) {
                var55 = var21.method4632(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4632(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class98(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3593, true, (class140) null);
                var56 = new class98(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3593, true, (class140) null);
            }
            var19.method2673(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class63.field724[arg5] * var52, class63.field733[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("e.hx(III)V")
    public static final void method72(int arg0, int arg1) {
        class218 var2 = field984[Statics.field2770][arg0][arg1];
        if (var2 == null) {
            Statics.field3868.method2685(Statics.field2770, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class93 var5 = null;
        for (class93 var6 = (class93) var2.method3723(); var6 != null; var6 = (class93) var2.method3722()) {
            class284 var7 = class284.method2869(var6.field1405);
            long var8 = (long) var7.field3657;
            if (var7.field3666 == 1) {
                var8 = (long) (var6.field1406 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3868.method2685(Statics.field2770, arg0, arg1);
            return;
        }
        var2.method3717(var5);
        class93 var10 = null;
        class93 var11 = null;
        for (class93 var12 = (class93) var2.method3723(); var12 != null; var12 = (class93) var2.method3722()) {
            if (var5.field1405 != var12.field1405) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1405 != var12.field1405 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field3868.method2671(Statics.field2770, arg0, arg1, method17(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2770), var5, var13, var10, var11);
    }

    @ObfuscatedName("fe.hi(ZLgf;I)V")
    public static final void method3122(boolean arg0, class202 arg1) {
        field977 = 0;
        field1040 = 0;
        class202 var2 = field903.field1477;
        var2.method3489();
        int var3 = var2.method3497(8);
        if (var3 < field899) {
            for (int var4 = var3; var4 < field899; var4++) {
                field996[++field977 - 1] = field900[var4];
            }
        }
        if (var3 > field899) {
            throw new RuntimeException("");
        }
        field899 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field900[var5];
            class85 var7 = field898[var6];
            int var8 = var2.method3497(1);
            if (var8 == 0) {
                field900[++field899 - 1] = var6;
                var7.field1200 = field867;
            } else {
                int var9 = var2.method3497(2);
                if (var9 == 0) {
                    field900[++field899 - 1] = var6;
                    var7.field1200 = field867;
                    field1025[++field1040 - 1] = var6;
                } else if (var9 == 1) {
                    field900[++field899 - 1] = var6;
                    var7.field1200 = field867;
                    int var10 = var2.method3497(3);
                    var7.method1686(var10, (byte) 1);
                    int var11 = var2.method3497(1);
                    if (var11 == 1) {
                        field1025[++field1040 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field900[++field899 - 1] = var6;
                    var7.field1200 = field867;
                    int var12 = var2.method3497(3);
                    var7.method1686(var12, (byte) 2);
                    int var13 = var2.method3497(3);
                    var7.method1686(var13, (byte) 2);
                    int var14 = var2.method3497(1);
                    if (var14 == 1) {
                        field1025[++field1040 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field996[++field977 - 1] = var6;
                }
            }
        }
        while (arg1.method3492(field903.field1479) >= 27) {
            int var15 = arg1.method3497(15);
            if (var15 == 32767) {
                break;
            }
            boolean var19 = false;
            if (field898[var15] == null) {
                field898[var15] = new class85();
                var19 = true;
            }
            class85 var20 = field898[var15];
            field900[++field899 - 1] = var15;
            var20.field1200 = field867;
            int var21 = arg1.method3497(1);
            int var22;
            if (arg0) {
                var22 = arg1.method3497(8);
                if (var22 > 127) {
                    var22 -= 256;
                }
            } else {
                var22 = arg1.method3497(5);
                if (var22 > 15) {
                    var22 -= 32;
                }
            }
            var20.field1301 = class286.method995(arg1.method3497(14));
            int var23 = field982[arg1.method3497(3)];
            if (var19) {
                var20.field1202 = var20.field1152 = var23;
            }
            int var24;
            if (arg0) {
                var24 = arg1.method3497(8);
                if (var24 > 127) {
                    var24 -= 256;
                }
            } else {
                var24 = arg1.method3497(5);
                if (var24 > 15) {
                    var24 -= 32;
                }
            }
            int var25 = arg1.method3497(1);
            if (var25 == 1) {
                field1025[++field1040 - 1] = var15;
            }
            var20.field1154 = var20.field1301.field3703;
            var20.field1204 = var20.field1301.field3729;
            if (var20.field1204 == 0) {
                var20.field1152 = 0;
            }
            var20.field1159 = var20.field1301.field3708;
            var20.field1173 = var20.field1301.field3710;
            var20.field1161 = var20.field1301.field3711;
            var20.field1162 = var20.field1301.field3712;
            var20.field1156 = var20.field1301.field3717;
            var20.field1196 = var20.field1301.field3707;
            var20.field1158 = var20.field1301.field3722;
            var20.method1687(Statics.field260.field1189[0] + var24, Statics.field260.field1207[0] + var22, var21 == 1);
        }
        arg1.method3491();
        method179(arg1);
        for (int var16 = 0; var16 < field977; var16++) {
            int var17 = field996[var16];
            if (field867 != field898[var17].field1200) {
                field898[var17].field1301 = null;
                field898[var17] = null;
            }
        }
        if (field903.field1479 != arg1.field2566) {
            throw new RuntimeException(arg1.field2566 + class87.field1309 + field903.field1479);
        }
        for (int var18 = 0; var18 < field899; var18++) {
            if (field898[field900[var18]] == null) {
                throw new RuntimeException(var18 + class87.field1309 + field899);
            }
        }
    }

    @ObfuscatedName("g.ht(Lgf;I)V")
    public static final void method179(class202 arg0) {
        for (int var1 = 0; var1 < field1040; var1++) {
            int var2 = field1025[var1];
            class85 var3 = field898[var2];
            int var4 = arg0.method3429();
            if ((var4 & 0x20) != 0) {
                int var5 = arg0.method3263();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = arg0.method3254();
                if (var3.field1183 == var5 && var5 != -1) {
                    int var7 = class288.method3535(var5).field3750;
                    if (var7 == 1) {
                        var3.field1184 = 0;
                        var3.field1185 = 0;
                        var3.field1165 = var6;
                        var3.field1187 = 0;
                    }
                    if (var7 == 2) {
                        var3.field1187 = 0;
                    }
                } else if (var5 == -1 || var3.field1183 == -1 || class288.method3535(var5).field3758 >= class288.method3535(var3.field1183).field3758) {
                    var3.field1183 = var5;
                    var3.field1184 = 0;
                    var3.field1185 = 0;
                    var3.field1165 = var6;
                    var3.field1187 = 0;
                    var3.field1195 = var3.field1205;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1191 = arg0.method3263();
                if (var3.field1191 == 65535) {
                    var3.field1191 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var8 = arg0.method3263();
                int var9 = arg0.method3218();
                int var10 = var3.field1186 - (var8 - Statics.field2499 - Statics.field2499) * 64;
                int var11 = var3.field1210 - (var9 - Statics.field29 - Statics.field29) * 64;
                if (var10 != 0 || var11 != 0) {
                    var3.field1166 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1301 = class286.method995(arg0.method3219());
                var3.field1154 = var3.field1301.field3703;
                var3.field1204 = var3.field1301.field3729;
                var3.field1159 = var3.field1301.field3708;
                var3.field1173 = var3.field1301.field3710;
                var3.field1161 = var3.field1301.field3711;
                var3.field1162 = var3.field1301.field3712;
                var3.field1156 = var3.field1301.field3717;
                var3.field1196 = var3.field1301.field3707;
                var3.field1158 = var3.field1301.field3722;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1188 = arg0.method3422();
                int var12 = arg0.method3270();
                var3.field1192 = var12 >> 16;
                var3.field1190 = (var12 & 0xFFFF) + field867;
                var3.field1160 = 0;
                var3.field1157 = 0;
                if (var3.field1190 > field867) {
                    var3.field1160 = -1;
                }
                if (var3.field1188 == 65535) {
                    var3.field1188 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1153 = arg0.method3427();
                var3.field1167 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var13 = arg0.method3255();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = arg0.method3239();
                        if (var18 == 32767) {
                            var18 = arg0.method3239();
                            var16 = arg0.method3239();
                            var15 = arg0.method3239();
                            var17 = arg0.method3239();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = arg0.method3239();
                        }
                        int var19 = arg0.method3239();
                        var3.method1452(var18, var16, var15, var17, field867, var19);
                    }
                }
                int var20 = arg0.method3429();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = arg0.method3239();
                        int var23 = arg0.method3239();
                        if (var23 == 32767) {
                            var3.method1454(var22);
                        } else {
                            int var24 = arg0.method3239();
                            int var25 = arg0.method3429();
                            int var26 = var23 > 0 ? arg0.method3254() : var25;
                            var3.method1451(var22, field867, var23, var24, var25, var26);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.hu(III)Lfn;")
    public static class179 method546(int arg0, int arg1) {
        field1128.field2284 = arg0;
        field1128.field2283 = arg1;
        field1128.field2281 = 1;
        field1128.field2282 = 1;
        return field1128;
    }

    @ObfuscatedName("b.hp(B)V")
    public static void method114() {
        Statics.method588();
        field998[0] = class252.field3252;
        field999[0] = "";
        field872[0] = 1006;
        field1000[0] = false;
        field993 = 1;
    }

    @ObfuscatedName("bp.ik(IIIII)V")
    public static final void method950(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field968; var4++) {
            if (field1123[var4] + field1064[var4] > arg0 && field1064[var4] < arg0 + arg2 && field861[var4] + field1067[var4] > arg1 && field861[var4] < arg1 + arg3) {
                field1061[var4] = true;
            }
        }
    }

    @ObfuscatedName("iw.iu(IIIII)V")
    public static final void method4180(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field968; var4++) {
            if (field1123[var4] + field1064[var4] > arg0 && field1064[var4] < arg0 + arg2 && field861[var4] + field1067[var4] > arg1 && field861[var4] < arg1 + arg3) {
                field1062[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ir(I)V")
    public final void method1269() {
        method3159();
        if (Statics.field2150 != null || field1028 != null) {
            return;
        }
        int var12;
        int var14;
        int var15;
        label193: {
            int var1 = class61.field709;
            if (field992) {
                if (var1 != 1 && (Statics.field441 || var1 != 4)) {
                    int var2 = class61.field701;
                    int var3 = class61.field694;
                    if (var2 < Statics.field1131 - 10 || var2 > Statics.field267 + Statics.field1131 + 10 || var3 < Statics.field2065 - 10 || var3 > Statics.field755 + Statics.field2065 + 10) {
                        field992 = false;
                        method950(Statics.field1131, Statics.field2065, Statics.field267, Statics.field755);
                    }
                }
                if (var1 == 1 || !Statics.field441 && var1 == 4) {
                    int var4 = Statics.field1131;
                    int var5 = Statics.field2065;
                    int var6 = Statics.field267;
                    int var7 = class61.field712;
                    int var8 = class61.field711;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field993; var10++) {
                        int var11 = (field993 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1) {
                        method343(var9);
                    }
                    field992 = false;
                    method950(Statics.field1131, Statics.field2065, Statics.field267, Statics.field755);
                }
            } else {
                var12 = method484();
                if ((var1 == 1 || !Statics.field441 && var1 == 4) && var12 >= 0) {
                    int var13 = field872[var12];
                    if (var13 == 39 || var13 == 40 || var13 == 41 || var13 == 42 || var13 == 43 || var13 == 33 || var13 == 34 || var13 == 35 || var13 == 36 || var13 == 37 || var13 == 38 || var13 == 1005) {
                        var14 = field994[var12];
                        var15 = field995[var12];
                        class243 var16 = class243.method3(var15);
                        int var17 = method580(var16);
                        boolean var18 = (var17 >> 28 & 0x1) != 0;
                        if (var18) {
                            break label193;
                        }
                        int var19 = method580(var16);
                        boolean var20 = (var19 >> 29 & 0x1) != 0;
                        if (var20) {
                            break label193;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field441 && var1 == 4) && this.method1102()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field441 && var1 == 4) && field993 > 0) {
                    method343(var12);
                }
                if (var1 == 2 && field993 > 0) {
                    this.method1241(class61.field712, class61.field711);
                }
            }
            return;
        }
        if (Statics.field2150 != null && !field1110 && field993 > 0 && !this.method1102()) {
            int var21 = field965;
            int var22 = field1057;
            class88 var23 = Statics.field1466;
            method3120(var23.field1319, var23.field1320, var23.field1321, var23.field1322, var23.field1324, var23.field1324, var21, var22);
            Statics.field1466 = null;
        }
        field1110 = false;
        field969 = 0;
        if (Statics.field2150 != null) {
            method260(Statics.field2150);
        }
        Statics.field2150 = class243.method3(var15);
        field1081 = var14;
        field965 = class61.field712;
        field1057 = class61.field711;
        if (var12 >= 0) {
            method58(var12);
        }
        method260(Statics.field2150);
    }

    @ObfuscatedName("client.ih(B)Z")
    public final boolean method1102() {
        int var1 = method484();
        boolean var2 = field885 == 1 && field993 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field872[var1];
                if (var4 >= 2000) {
                    var4 -= 2000;
                }
                if (var4 == 1007) {
                    var3 = true;
                } else {
                    var3 = false;
                }
            }
            var2 = var3;
        }
        return var2 && !field1000[var1];
    }

    @ObfuscatedName("client.im(IIB)V")
    public final void method1241(int arg0, int arg1) {
        int var3 = Statics.field2677.method5173(class252.field3281);
        for (int var4 = 0; var4 < field993; var4++) {
            int var5 = Statics.field2677.method5173(method3144(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field993 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field3766) {
            var7 = Statics.field3766 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field554) {
            var8 = Statics.field554 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field3868.method2834(Statics.field2770, arg0, arg1, false);
        field992 = true;
        Statics.field1131 = var7;
        Statics.field2065 = var8;
        Statics.field267 = var3;
        Statics.field755 = field993 * 15 + 22;
    }

    @ObfuscatedName("aa.ip(IB)V")
    public static final void method343(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field994[arg0];
        int var2 = field995[arg0];
        int var3 = field872[arg0];
        int var4 = field997[arg0];
        String var5 = field998[arg0];
        String var6 = field999[arg0];
        method3120(var1, var2, var3, var4, var5, var6, class61.field712, class61.field711);
    }

    @ObfuscatedName("fq.if(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3120(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 9) {
            class85 var8 = field898[arg3];
            if (var8 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var9 = class185.method2860(class182.field2473, field903.field1476);
                var9.field2501.method3210(arg3);
                var9.field2501.method3250(class52.field608[82] ? 1 : 0);
                field903.method1884(var9);
            }
        }
        if (arg2 == 46) {
            class73 var10 = field972[arg3];
            if (var10 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var11 = class185.method2860(class182.field2406, field903.field1476);
                var11.field2501.method3354(arg3);
                var11.field2501.method3250(class52.field608[82] ? 1 : 0);
                field903.method1884(var11);
            }
        }
        if (arg2 == 32) {
            class185 var12 = class185.method2860(class182.field2462, field903.field1476);
            var12.field2501.method3325(arg3);
            var12.field2501.method3212(arg1);
            var12.field2501.method3354(arg0);
            var12.field2501.method3212(Statics.field624);
            var12.field2501.method3260(field1013);
            field903.method1884(var12);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 42) {
            class185 var13 = class185.method2860(class182.field2438, field903.field1476);
            var13.field2501.method3354(arg3);
            var13.field2501.method3269(arg1);
            var13.field2501.method3260(arg0);
            field903.method1884(var13);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 16) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var14 = class185.method2860(class182.field2373, field903.field1476);
            var14.field2501.method3354(Statics.field590);
            var14.field2501.method3260(Statics.field2499 + arg0);
            var14.field2501.method3325(arg3);
            var14.field2501.method3325(Statics.field29 + arg1);
            var14.field2501.method3251(class52.field608[82] ? 1 : 0);
            var14.field2501.method3383(Statics.field901);
            var14.field2501.method3325(Statics.field814);
            field903.method1884(var14);
        }
        if (arg2 == 15) {
            class73 var15 = field972[arg3];
            if (var15 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var16 = class185.method2860(class182.field2447, field903.field1476);
                var16.field2501.method3210(arg3);
                var16.field2501.method3376(Statics.field624);
                var16.field2501.method3210(field1013);
                var16.field2501.method3251(class52.field608[82] ? 1 : 0);
                field903.method1884(var16);
            }
        }
        if (arg2 == 22) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var17 = class185.method2860(class182.field2376, field903.field1476);
            var17.field2501.method3210(Statics.field29 + arg1);
            var17.field2501.method3325(arg3);
            var17.field2501.method3210(Statics.field2499 + arg0);
            var17.field2501.method3250(class52.field608[82] ? 1 : 0);
            field903.method1884(var17);
        }
        if (arg2 == 20) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var18 = class185.method2860(class182.field2459, field903.field1476);
            var18.field2501.method3354(Statics.field2499 + arg0);
            var18.field2501.method3250(class52.field608[82] ? 1 : 0);
            var18.field2501.method3354(arg3);
            var18.field2501.method3210(Statics.field29 + arg1);
            field903.method1884(var18);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field743.method5616(arg2, arg3, new class239(arg0), new class239(arg1));
        }
        if (arg2 == 40) {
            class185 var19 = class185.method2860(class182.field2411, field903.field1476);
            var19.field2501.method3269(arg1);
            var19.field2501.method3260(arg3);
            var19.field2501.method3354(arg0);
            field903.method1884(var19);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 21) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var20 = class185.method2860(class182.field2457, field903.field1476);
            var20.field2501.method3354(Statics.field2499 + arg0);
            var20.field2501.method3396(class52.field608[82] ? 1 : 0);
            var20.field2501.method3260(Statics.field29 + arg1);
            var20.field2501.method3210(arg3);
            field903.method1884(var20);
        }
        if (arg2 == 39) {
            class185 var21 = class185.method2860(class182.field2379, field903.field1476);
            var21.field2501.method3210(arg0);
            var21.field2501.method3212(arg1);
            var21.field2501.method3260(arg3);
            field903.method1884(var21);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 1004) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            class185 var22 = class185.method2860(class182.field2444, field903.field1476);
            var22.field2501.method3260(arg3);
            field903.method1884(var22);
        }
        if (arg2 == 28) {
            class185 var23 = class185.method2860(class182.field2422, field903.field1476);
            var23.field2501.method3212(arg1);
            field903.method1884(var23);
            class243 var24 = class243.method3(arg1);
            if (var24.field2927 != null && var24.field2927[0][0] == 5) {
                int var25 = var24.field2927[0][1];
                class238.field2771[var25] = 1 - class238.field2771[var25];
                method1800(var25);
            }
        }
        if (arg2 == 38) {
            method5();
            class243 var26 = class243.method3(arg1);
            field924 = 1;
            Statics.field590 = arg0;
            Statics.field901 = arg1;
            Statics.field814 = arg3;
            method260(var26);
            field1011 = class87.method3053(16748608) + class284.method2869(arg3).field3645 + class87.method3053(16777215);
            if (field1011 == null) {
                field1011 = class252.field3012;
            }
            return;
        }
        if (arg2 == 24) {
            class243 var27 = class243.method3(arg1);
            boolean var28 = true;
            if (var27.field2819 > 0) {
                var28 = method4091(var27);
            }
            if (var28) {
                class185 var29 = class185.method2860(class182.field2422, field903.field1476);
                var29.field2501.method3212(arg1);
                field903.method1884(var29);
            }
        }
        if (arg2 == 11) {
            class85 var30 = field898[arg3];
            if (var30 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var31 = class185.method2860(class182.field2407, field903.field1476);
                var31.field2501.method3209(class52.field608[82] ? 1 : 0);
                var31.field2501.method3354(arg3);
                field903.method1884(var31);
            }
        }
        if (arg2 == 44) {
            class73 var32 = field972[arg3];
            if (var32 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var33 = class185.method2860(class182.field2432, field903.field1476);
                var33.field2501.method3354(arg3);
                var33.field2501.method3250(class52.field608[82] ? 1 : 0);
                field903.method1884(var33);
            }
        }
        if (arg2 == 1003) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            class85 var34 = field898[arg3];
            if (var34 != null) {
                class286 var35 = var34.field1301;
                if (var35.field3719 != null) {
                    var35 = var35.method4760();
                }
                if (var35 != null) {
                    class185 var36 = class185.method2860(class182.field2472, field903.field1476);
                    var36.field2501.method3354(var35.field3701);
                    field903.method1884(var36);
                }
            }
        }
        if (arg2 == 35) {
            class185 var37 = class185.method2860(class182.field2392, field903.field1476);
            var37.field2501.method3354(arg0);
            var37.field2501.method3325(arg3);
            var37.field2501.method3269(arg1);
            field903.method1884(var37);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 10) {
            class85 var38 = field898[arg3];
            if (var38 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var39 = class185.method2860(class182.field2405, field903.field1476);
                var39.field2501.method3251(class52.field608[82] ? 1 : 0);
                var39.field2501.method3354(arg3);
                field903.method1884(var39);
            }
        }
        if (arg2 == 13) {
            class85 var40 = field898[arg3];
            if (var40 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var41 = class185.method2860(class182.field2419, field903.field1476);
                var41.field2501.method3209(class52.field608[82] ? 1 : 0);
                var41.field2501.method3325(arg3);
                field903.method1884(var41);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class243 var42 = class243.method3126(arg1, arg0);
            if (var42 != null) {
                method4179(arg3, arg1, arg0, var42.field2935, arg5);
            }
        }
        if (arg2 == 51) {
            class73 var43 = field972[arg3];
            if (var43 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var44 = class185.method2860(class182.field2470, field903.field1476);
                var44.field2501.method3251(class52.field608[82] ? 1 : 0);
                var44.field2501.method3260(arg3);
                field903.method1884(var44);
            }
        }
        if (arg2 == 43) {
            class185 var45 = class185.method2860(class182.field2433, field903.field1476);
            var45.field2501.method3325(arg0);
            var45.field2501.method3383(arg1);
            var45.field2501.method3260(arg3);
            field903.method1884(var45);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 34) {
            class185 var46 = class185.method2860(class182.field2431, field903.field1476);
            var46.field2501.method3383(arg1);
            var46.field2501.method3354(arg0);
            var46.field2501.method3210(arg3);
            field903.method1884(var46);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 26) {
            class185 var47 = class185.method2860(class182.field2404, field903.field1476);
            field903.method1884(var47);
            for (class68 var48 = (class68) field1018.method3658(); var48 != null; var48 = (class68) field1018.method3661()) {
                if (var48.field775 == 0 || var48.field775 == 3) {
                    method576(var48, true);
                }
            }
            if (field1103 != null) {
                method260(field1103);
                field1103 = null;
            }
        }
        if (arg2 == 25) {
            class243 var49 = class243.method3126(arg1, arg0);
            if (var49 != null) {
                method5();
                int var52 = method580(var49);
                int var53 = var52 >> 11 & 0x3F;
                method146(arg1, arg0, var53, var49.field2935);
                field924 = 0;
                int var54 = method580(var49);
                int var55 = var54 >> 11 & 0x3F;
                String var56;
                if (var55 == 0) {
                    var56 = null;
                } else if (var49.field2864 == null || var49.field2864.trim().length() == 0) {
                    var56 = null;
                } else {
                    var56 = var49.field2864;
                }
                field957 = var56;
                if (field957 == null) {
                    field957 = "Null";
                }
                if (var49.field2814) {
                    field1016 = var49.field2883 + class87.method3053(16777215);
                } else {
                    field1016 = class87.method3053(65280) + var49.field2931 + class87.method3053(16777215);
                }
            }
            return;
        }
        if (arg2 == 8) {
            class85 var57 = field898[arg3];
            if (var57 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var58 = class185.method2860(class182.field2393, field903.field1476);
                var58.field2501.method3250(class52.field608[82] ? 1 : 0);
                var58.field2501.method3376(Statics.field624);
                var58.field2501.method3325(field1013);
                var58.field2501.method3260(arg3);
                field903.method1884(var58);
            }
        }
        if (arg2 == 47) {
            class73 var59 = field972[arg3];
            if (var59 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var60 = class185.method2860(class182.field2469, field903.field1476);
                var60.field2501.method3260(arg3);
                var60.field2501.method3396(class52.field608[82] ? 1 : 0);
                field903.method1884(var60);
            }
        }
        if (arg2 == 1) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var61 = class185.method2860(class182.field2423, field903.field1476);
            var61.field2501.method3354(Statics.field29 + arg1);
            var61.field2501.method3325(Statics.field590);
            var61.field2501.method3376(Statics.field901);
            var61.field2501.method3354(Statics.field814);
            var61.field2501.method3209(class52.field608[82] ? 1 : 0);
            var61.field2501.method3260(arg3 >> 14 & 0x7FFF);
            var61.field2501.method3210(Statics.field2499 + arg0);
            field903.method1884(var61);
        }
        if (arg2 == 6) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var62 = class185.method2860(class182.field2449, field903.field1476);
            var62.field2501.method3210(Statics.field29 + arg1);
            var62.field2501.method3260(Statics.field2499 + arg0);
            var62.field2501.method3251(class52.field608[82] ? 1 : 0);
            var62.field2501.method3354(arg3 >> 14 & 0x7FFF);
            field903.method1884(var62);
        }
        if (arg2 == 49) {
            class73 var63 = field972[arg3];
            if (var63 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var64 = class185.method2860(class182.field2378, field903.field1476);
                var64.field2501.method3250(class52.field608[82] ? 1 : 0);
                var64.field2501.method3210(arg3);
                field903.method1884(var64);
            }
        }
        if (arg2 == 18) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var65 = class185.method2860(class182.field2389, field903.field1476);
            var65.field2501.method3354(Statics.field2499 + arg0);
            var65.field2501.method3250(class52.field608[82] ? 1 : 0);
            var65.field2501.method3210(Statics.field29 + arg1);
            var65.field2501.method3260(arg3);
            field903.method1884(var65);
        }
        if (arg2 == 23) {
            if (field992) {
                Statics.field3868.method2849();
            } else {
                Statics.field3868.method2834(Statics.field2770, arg0, arg1, true);
            }
        }
        if (arg2 == 3) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var66 = class185.method2860(class182.field2420, field903.field1476);
            var66.field2501.method3354(Statics.field2499 + arg0);
            var66.field2501.method3354(arg3 >> 14 & 0x7FFF);
            var66.field2501.method3325(Statics.field29 + arg1);
            var66.field2501.method3209(class52.field608[82] ? 1 : 0);
            field903.method1884(var66);
        }
        if (arg2 == 7) {
            class85 var67 = field898[arg3];
            if (var67 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var68 = class185.method2860(class182.field2453, field903.field1476);
                var68.field2501.method3354(Statics.field590);
                var68.field2501.method3209(class52.field608[82] ? 1 : 0);
                var68.field2501.method3376(Statics.field901);
                var68.field2501.method3210(Statics.field814);
                var68.field2501.method3210(arg3);
                field903.method1884(var68);
            }
        }
        if (arg2 == 17) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var69 = class185.method2860(class182.field2461, field903.field1476);
            var69.field2501.method3269(Statics.field624);
            var69.field2501.method3210(field1013);
            var69.field2501.method3354(Statics.field2499 + arg0);
            var69.field2501.method3354(Statics.field29 + arg1);
            var69.field2501.method3354(arg3);
            var69.field2501.method3250(class52.field608[82] ? 1 : 0);
            field903.method1884(var69);
        }
        if (arg2 == 36) {
            class185 var70 = class185.method2860(class182.field2377, field903.field1476);
            var70.field2501.method3210(arg3);
            var70.field2501.method3269(arg1);
            var70.field2501.method3260(arg0);
            field903.method1884(var70);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 30 && field1103 == null) {
            method1869(arg1, arg0);
            field1103 = class243.method3126(arg1, arg0);
            method260(field1103);
        }
        if (arg2 == 29) {
            class185 var71 = class185.method2860(class182.field2422, field903.field1476);
            var71.field2501.method3212(arg1);
            field903.method1884(var71);
            class243 var72 = class243.method3(arg1);
            if (var72.field2927 != null && var72.field2927[0][0] == 5) {
                int var73 = var72.field2927[0][1];
                if (class238.field2771[var73] != var72.field2929[0]) {
                    class238.field2771[var73] = var72.field2929[0];
                    method1800(var73);
                }
            }
        }
        if (arg2 == 2) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var74 = class185.method2860(class182.field2421, field903.field1476);
            var74.field2501.method3260(field1013);
            var74.field2501.method3325(arg3 >> 14 & 0x7FFF);
            var74.field2501.method3269(Statics.field624);
            var74.field2501.method3354(Statics.field2499 + arg0);
            var74.field2501.method3396(class52.field608[82] ? 1 : 0);
            var74.field2501.method3210(Statics.field29 + arg1);
            field903.method1884(var74);
        }
        if (arg2 == 33) {
            class185 var75 = class185.method2860(class182.field2467, field903.field1476);
            var75.field2501.method3210(arg0);
            var75.field2501.method3269(arg1);
            var75.field2501.method3210(arg3);
            field903.method1884(var75);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 31) {
            class185 var76 = class185.method2860(class182.field2424, field903.field1476);
            var76.field2501.method3354(arg3);
            var76.field2501.method3354(Statics.field590);
            var76.field2501.method3212(arg1);
            var76.field2501.method3269(Statics.field901);
            var76.field2501.method3325(Statics.field814);
            var76.field2501.method3260(arg0);
            field903.method1884(var76);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 12) {
            class85 var77 = field898[arg3];
            if (var77 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var78 = class185.method2860(class182.field2388, field903.field1476);
                var78.field2501.method3250(class52.field608[82] ? 1 : 0);
                var78.field2501.method3325(arg3);
                field903.method1884(var78);
            }
        }
        if (arg2 == 37) {
            class185 var79 = class185.method2860(class182.field2410, field903.field1476);
            var79.field2501.method3260(arg3);
            var79.field2501.method3210(arg0);
            var79.field2501.method3212(arg1);
            field903.method1884(var79);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 45) {
            class73 var80 = field972[arg3];
            if (var80 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var81 = class185.method2860(class182.field2403, field903.field1476);
                var81.field2501.method3260(arg3);
                var81.field2501.method3251(class52.field608[82] ? 1 : 0);
                field903.method1884(var81);
            }
        }
        if (arg2 == 58) {
            class243 var82 = class243.method3126(arg1, arg0);
            if (var82 != null) {
                class185 var83 = class185.method2860(class182.field2439, field903.field1476);
                var83.field2501.method3260(var82.field2935);
                var83.field2501.method3212(Statics.field624);
                var83.field2501.method3260(field1013);
                var83.field2501.method3269(arg1);
                var83.field2501.method3260(field1014);
                var83.field2501.method3354(arg0);
                field903.method1884(var83);
            }
        }
        if (arg2 == 19) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var84 = class185.method2860(class182.field2448, field903.field1476);
            var84.field2501.method3210(arg3);
            var84.field2501.method3325(Statics.field29 + arg1);
            var84.field2501.method3354(Statics.field2499 + arg0);
            var84.field2501.method3251(class52.field608[82] ? 1 : 0);
            field903.method1884(var84);
        }
        if (arg2 == 1002) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            class185 var85 = class185.method2860(class182.field2430, field903.field1476);
            var85.field2501.method3260(arg3 >> 14 & 0x7FFF);
            field903.method1884(var85);
        }
        if (arg2 == 1005) {
            class243 var86 = class243.method3(arg1);
            if (var86 == null || var86.field2934[arg0] < 100000) {
                class185 var87 = class185.method2860(class182.field2444, field903.field1476);
                var87.field2501.method3260(arg3);
                field903.method1884(var87);
            } else {
                class96.method3189(27, "", var86.field2934[arg0] + " x " + class284.method2869(arg3).field3645);
            }
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 1001) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var88 = class185.method2860(class182.field2443, field903.field1476);
            var88.field2501.method3210(Statics.field29 + arg1);
            var88.field2501.method3354(arg3 >> 14 & 0x7FFF);
            var88.field2501.method3354(Statics.field2499 + arg0);
            var88.field2501.method3250(class52.field608[82] ? 1 : 0);
            field903.method1884(var88);
        }
        if (arg2 == 14) {
            class73 var89 = field972[arg3];
            if (var89 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var90 = class185.method2860(class182.field2427, field903.field1476);
                var90.field2501.method3383(Statics.field901);
                var90.field2501.method3354(Statics.field590);
                var90.field2501.method3260(Statics.field814);
                var90.field2501.method3325(arg3);
                var90.field2501.method3396(class52.field608[82] ? 1 : 0);
                field903.method1884(var90);
            }
        }
        if (arg2 == 41) {
            class185 var91 = class185.method2860(class182.field2437, field903.field1476);
            var91.field2501.method3354(arg3);
            var91.field2501.method3212(arg1);
            var91.field2501.method3325(arg0);
            field903.method1884(var91);
            field988 = 0;
            Statics.field751 = class243.method3(arg1);
            field910 = arg0;
        }
        if (arg2 == 48) {
            class73 var92 = field972[arg3];
            if (var92 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var93 = class185.method2860(class182.field2394, field903.field1476);
                var93.field2501.method3210(arg3);
                var93.field2501.method3396(class52.field608[82] ? 1 : 0);
                field903.method1884(var93);
            }
        }
        if (arg2 == 5) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var94 = class185.method2860(class182.field2416, field903.field1476);
            var94.field2501.method3210(arg3 >> 14 & 0x7FFF);
            var94.field2501.method3354(Statics.field2499 + arg0);
            var94.field2501.method3251(class52.field608[82] ? 1 : 0);
            var94.field2501.method3210(Statics.field29 + arg1);
            field903.method1884(var94);
        }
        if (arg2 == 4) {
            field962 = arg6;
            field958 = arg7;
            field960 = 2;
            field959 = 0;
            field1086 = arg0;
            field1006 = arg1;
            class185 var95 = class185.method2860(class182.field2382, field903.field1476);
            var95.field2501.method3210(Statics.field2499 + arg0);
            var95.field2501.method3210(arg3 >> 14 & 0x7FFF);
            var95.field2501.method3354(Statics.field29 + arg1);
            var95.field2501.method3251(class52.field608[82] ? 1 : 0);
            field903.method1884(var95);
        }
        if (arg2 == 50) {
            class73 var96 = field972[arg3];
            if (var96 != null) {
                field962 = arg6;
                field958 = arg7;
                field960 = 2;
                field959 = 0;
                field1086 = arg0;
                field1006 = arg1;
                class185 var97 = class185.method2860(class182.field2436, field903.field1476);
                var97.field2501.method3250(class52.field608[82] ? 1 : 0);
                var97.field2501.method3325(arg3);
                field903.method1884(var97);
            }
        }
        if (field924 != 0) {
            field924 = 0;
            method260(class243.method3(Statics.field901));
        }
        if (field1012) {
            method5();
        }
        if (Statics.field751 != null && field988 == 0) {
            method260(Statics.field751);
        }
    }

    @ObfuscatedName("t.il(IIIII)V")
    public static void method146(int arg0, int arg1, int arg2, int arg3) {
        class243 var4 = class243.method3126(arg0, arg1);
        if (var4 != null && var4.field2906 != null) {
            class69 var5 = new class69();
            var5.field781 = var4;
            var5.field783 = var4.field2906;
            class82.method3463(var5);
        }
        field1014 = arg3;
        field1012 = true;
        Statics.field624 = arg0;
        field1013 = arg1;
        Statics.field2800 = arg2;
        method260(var4);
    }

    @ObfuscatedName("j.ib(I)V")
    public static void method5() {
        if (!field1012) {
            return;
        }
        class243 var0 = class243.method3126(Statics.field624, field1013);
        if (var0 != null && var0.field2944 != null) {
            class69 var1 = new class69();
            var1.field781 = var0;
            var1.field783 = var0.field2944;
            class82.method3463(var1);
        }
        field1012 = false;
        method260(var0);
    }

    @ObfuscatedName("cw.iq(III)V")
    public static void method1869(int arg0, int arg1) {
        class185 var2 = class185.method2860(class182.field2383, field903.field1476);
        var2.field2501.method3354(arg1);
        var2.field2501.method3212(arg0);
        field903.method1884(var2);
    }

    @ObfuscatedName("iv.in(IIIILjava/lang/String;I)V")
    public static void method4179(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class243 var5 = class243.method3126(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2915 != null) {
            class69 var6 = new class69();
            var6.field781 = var5;
            var6.field792 = arg0;
            var6.field788 = arg4;
            var6.field783 = var5.field2915;
            class82.method3463(var6);
        }
        boolean var7 = true;
        if (var5.field2819 > 0) {
            var7 = method4091(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method580(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class185 var11 = class185.method2860(class182.field2387, field903.field1476);
            var11.field2501.method3212(arg1);
            var11.field2501.method3210(arg2);
            var11.field2501.method3210(arg3);
            field903.method1884(var11);
        }
        if (arg0 == 2) {
            class185 var12 = class185.method2860(class182.field2435, field903.field1476);
            var12.field2501.method3212(arg1);
            var12.field2501.method3210(arg2);
            var12.field2501.method3210(arg3);
            field903.method1884(var12);
        }
        if (arg0 == 3) {
            class185 var13 = class185.method2860(class182.field2456, field903.field1476);
            var13.field2501.method3212(arg1);
            var13.field2501.method3210(arg2);
            var13.field2501.method3210(arg3);
            field903.method1884(var13);
        }
        if (arg0 == 4) {
            class185 var14 = class185.method2860(class182.field2396, field903.field1476);
            var14.field2501.method3212(arg1);
            var14.field2501.method3210(arg2);
            var14.field2501.method3210(arg3);
            field903.method1884(var14);
        }
        if (arg0 == 5) {
            class185 var15 = class185.method2860(class182.field2425, field903.field1476);
            var15.field2501.method3212(arg1);
            var15.field2501.method3210(arg2);
            var15.field2501.method3210(arg3);
            field903.method1884(var15);
        }
        if (arg0 == 6) {
            class185 var16 = class185.method2860(class182.field2468, field903.field1476);
            var16.field2501.method3212(arg1);
            var16.field2501.method3210(arg2);
            var16.field2501.method3210(arg3);
            field903.method1884(var16);
        }
        if (arg0 == 7) {
            class185 var17 = class185.method2860(class182.field2401, field903.field1476);
            var17.field2501.method3212(arg1);
            var17.field2501.method3210(arg2);
            var17.field2501.method3210(arg3);
            field903.method1884(var17);
        }
        if (arg0 == 8) {
            class185 var18 = class185.method2860(class182.field2452, field903.field1476);
            var18.field2501.method3212(arg1);
            var18.field2501.method3210(arg2);
            var18.field2501.method3210(arg3);
            field903.method1884(var18);
        }
        if (arg0 == 9) {
            class185 var19 = class185.method2860(class182.field2375, field903.field1476);
            var19.field2501.method3212(arg1);
            var19.field2501.method3210(arg2);
            var19.field2501.method3210(arg3);
            field903.method1884(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class185 var20 = class185.method2860(class182.field2402, field903.field1476);
        var20.field2501.method3212(arg1);
        var20.field2501.method3210(arg2);
        var20.field2501.method3210(arg3);
        field903.method1884(var20);
    }

    @ObfuscatedName("gc.iz(I)V")
    public static final void method3159() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field993 - 1; var1++) {
                if (field872[var1] < 1000 && field872[var1 + 1] > 1000) {
                    String var2 = field999[var1];
                    field999[var1] = field999[var1 + 1];
                    field999[var1 + 1] = var2;
                    String var3 = field998[var1];
                    field998[var1] = field998[var1 + 1];
                    field998[var1 + 1] = var3;
                    int var4 = field872[var1];
                    field872[var1] = field872[var1 + 1];
                    field872[var1 + 1] = var4;
                    int var5 = field994[var1];
                    field994[var1] = field994[var1 + 1];
                    field994[var1 + 1] = var5;
                    int var6 = field995[var1];
                    field995[var1] = field995[var1 + 1];
                    field995[var1 + 1] = var6;
                    int var7 = field997[var1];
                    field997[var1] = field997[var1 + 1];
                    field997[var1 + 1] = var7;
                    boolean var8 = field1000[var1];
                    field1000[var1] = field1000[var1 + 1];
                    field1000[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ff.ie(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2987(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field992 || field993 >= 500) {
            return;
        }
        field998[field993] = arg0;
        field999[field993] = arg1;
        field872[field993] = arg2;
        field997[field993] = arg3;
        field994[field993] = arg4;
        field995[field993] = arg5;
        field1000[field993] = var12;
        field993++;
    }

    @ObfuscatedName("am.ix(I)I")
    public static final int method484() {
        return field993 - 1;
    }

    @ObfuscatedName("d.ij(B)V")
    public static void method56() {
        for (int var0 = 0; var0 < field993; var0++) {
            if (Statics.method2578(field872[var0])) {
                if (var0 < field993 - 1) {
                    for (int var1 = var0; var1 < field993 - 1; var1++) {
                        field998[var1] = field998[var1 + 1];
                        field999[var1] = field999[var1 + 1];
                        field872[var1] = field872[var1 + 1];
                        field997[var1] = field997[var1 + 1];
                        field994[var1] = field994[var1 + 1];
                        field995[var1] = field995[var1 + 1];
                        field1000[var1] = field1000[var1 + 1];
                    }
                }
                field993--;
            }
        }
    }

    @ObfuscatedName("gg.it(IB)Ljava/lang/String;")
    public static String method3144(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field999[arg0].length() > 0) {
            return field998[arg0] + class252.field3042 + field999[arg0];
        } else {
            return field998[arg0];
        }
    }

    @ObfuscatedName("gf.iy(IIIIS)V")
    public static final void method3517(int arg0, int arg1, int arg2, int arg3) {
        if (field924 == 0 && !field1012) {
            method2987(class252.field3168, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class133.field1914; var6++) {
            int var7 = class133.field1921[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field3868.method2829(Statics.field2770, var8, var9, var7) >= 0) {
                    class283 var12 = class283.method4185(var11);
                    if (var12.field3628 != null) {
                        var12 = var12.method4635();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field924 == 1) {
                        method2987(class252.field3163, field1011 + " " + class87.field1313 + " " + class87.method3053(65535) + var12.field3597, 1, var7, var8, var9);
                    } else if (!field1012) {
                        String[] var13 = var12.field3614;
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
                                    method2987(var13[var14], class87.method3053(65535) + var12.field3597, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2987(class252.field3071, class87.method3053(65535) + var12.field3597, 1002, var12.field3594 << 14, var8, var9);
                    } else if ((Statics.field2800 & 0x4) == 4) {
                        method2987(field957, field1016 + " " + class87.field1313 + " " + class87.method3053(65535) + var12.field3597, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class85 var16 = field898[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1301.field3703 == 1 && (var16.field1186 & 0x7F) == 64 && (var16.field1210 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field899; var17++) {
                            class85 var18 = field898[field900[var17]];
                            if (var18 != null && var16 != var18 && var18.field1301.field3703 == 1 && var16.field1186 == var18.field1186 && var16.field1210 == var18.field1210) {
                                method266(var18.field1301, field900[var17], var8, var9);
                            }
                        }
                        int var19 = class94.field1415;
                        int[] var20 = class94.field1416;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class73 var22 = field972[var20[var21]];
                            if (var22 != null && var16.field1186 == var22.field1186 && var16.field1210 == var22.field1210) {
                                method486(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method266(var16.field1301, var11, var8, var9);
                }
                if (var10 == 0) {
                    class73 var23 = field972[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1186 & 0x7F) == 64 && (var23.field1210 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field899; var24++) {
                            class85 var25 = field898[field900[var24]];
                            if (var25 != null && var25.field1301.field3703 == 1 && var23.field1186 == var25.field1186 && var23.field1210 == var25.field1210) {
                                method266(var25.field1301, field900[var24], var8, var9);
                            }
                        }
                        int var26 = class94.field1415;
                        int[] var27 = class94.field1416;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class73 var29 = field972[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1186 == var29.field1186 && var23.field1210 == var29.field1210) {
                                method486(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field983 == var11) {
                        var4 = var7;
                    } else {
                        method486(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class218 var30 = field984[Statics.field2770][var8][var9];
                    if (var30 != null) {
                        for (class93 var31 = (class93) var30.method3728(); var31 != null; var31 = (class93) var30.method3742()) {
                            class284 var32 = class284.method2869(var31.field1405);
                            if (field924 == 1) {
                                method2987(class252.field3163, field1011 + " " + class87.field1313 + " " + class87.method3053(16748608) + var32.field3645, 16, var31.field1405, var8, var9);
                            } else if (!field1012) {
                                String[] var33 = var32.field3675;
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
                                        method2987(var33[var34], class87.method3053(16748608) + var32.field3645, var35, var31.field1405, var8, var9);
                                    } else if (var34 == 2) {
                                        method2987(class252.field3013, class87.method3053(16748608) + var32.field3645, 20, var31.field1405, var8, var9);
                                    }
                                }
                                method2987(class252.field3071, class87.method3053(16748608) + var32.field3645, 1004, var31.field1405, var8, var9);
                            } else if ((Statics.field2800 & 0x1) == 1) {
                                method2987(field957, field1016 + " " + class87.field1313 + " " + class87.method3053(16748608) + var32.field3645, 17, var31.field1405, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class73 var38 = field972[field983];
            method486(var38, field983, var36, var37);
        }
    }

    @ObfuscatedName("ak.ia(Ljk;IIIB)V")
    public static final void method266(class286 arg0, int arg1, int arg2, int arg3) {
        if (field993 >= 400) {
            return;
        }
        if (arg0.field3719 != null) {
            arg0 = arg0.method4760();
        }
        if (arg0 == null || !arg0.field3730 || arg0.field3732 && field1056 != arg1) {
            return;
        }
        String var4 = arg0.field3702;
        if (arg0.field3716 != 0) {
            int var6 = arg0.field3716;
            int var7 = Statics.field260.field833;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class87.method3053(16711680);
            } else if (var8 < -6) {
                var9 = class87.method3053(16723968);
            } else if (var8 < -3) {
                var9 = class87.method3053(16740352);
            } else if (var8 < 0) {
                var9 = class87.method3053(16756736);
            } else if (var8 > 9) {
                var9 = class87.method3053(65280);
            } else if (var8 > 6) {
                var9 = class87.method3053(4259584);
            } else if (var8 > 3) {
                var9 = class87.method3053(8453888);
            } else if (var8 > 0) {
                var9 = class87.method3053(12648192);
            } else {
                var9 = class87.method3053(16776960);
            }
            var4 = var4 + var9 + " " + class87.field1317 + class252.field3118 + arg0.field3716 + class87.field1312;
        }
        if (arg0.field3732 && field1095) {
            method2987(class252.field3071, class87.method3053(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field924 == 1) {
            method2987(class252.field3163, field1011 + " " + class87.field1313 + " " + class87.method3053(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1012) {
            int var10 = arg0.field3732 && field1095 ? 2000 : 0;
            String[] var11 = arg0.field3721;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class252.field3165)) {
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
                        method2987(var11[var12], class87.method3053(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class252.field3165)) {
                        short var15 = 0;
                        if (field884 != class90.field1335) {
                            if (field884 == class90.field1333 || field884 == class90.field1337 && arg0.field3716 > Statics.field260.field833) {
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
                            method2987(var11[var14], class87.method3053(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3732 || !field1095) {
                method2987(class252.field3071, class87.method3053(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2800 & 0x2) == 2) {
            method2987(field957, field1016 + " " + class87.field1313 + " " + class87.method3053(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("aq.ig(Lbx;IIIB)V")
    public static final void method486(class73 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field260 == arg0 || field993 >= 400) {
            return;
        }
        String var9;
        if (arg0.field828 == 0) {
            String var4 = arg0.field826[0] + arg0.field824 + arg0.field826[1];
            int var5 = arg0.field833;
            int var6 = Statics.field260.field833;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class87.method3053(16711680);
            } else if (var7 < -6) {
                var8 = class87.method3053(16723968);
            } else if (var7 < -3) {
                var8 = class87.method3053(16740352);
            } else if (var7 < 0) {
                var8 = class87.method3053(16756736);
            } else if (var7 > 9) {
                var8 = class87.method3053(65280);
            } else if (var7 > 6) {
                var8 = class87.method3053(4259584);
            } else if (var7 > 3) {
                var8 = class87.method3053(8453888);
            } else if (var7 > 0) {
                var8 = class87.method3053(12648192);
            } else {
                var8 = class87.method3053(16776960);
            }
            var9 = var4 + var8 + " " + class87.field1317 + class252.field3118 + arg0.field833 + class87.field1312 + arg0.field826[2];
        } else {
            var9 = arg0.field826[0] + arg0.field824 + arg0.field826[1] + " " + class87.field1317 + class252.field3170 + arg0.field828 + class87.field1312 + arg0.field826[2];
        }
        if (field924 == 1) {
            method2987(class252.field3163, field1011 + " " + class87.field1313 + " " + class87.method3053(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1012) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field980[var10] != null) {
                    short var11 = 0;
                    if (field980[var10].equalsIgnoreCase(class252.field3165)) {
                        if (field883 == class90.field1335) {
                            continue;
                        }
                        if (field883 == class90.field1333 || field883 == class90.field1337 && arg0.field833 > Statics.field260.field833) {
                            var11 = 2000;
                        }
                        if (Statics.field260.field841 != 0 && arg0.field841 != 0) {
                            if (Statics.field260.field841 == arg0.field841) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field964[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field869[var10] + var11;
                    method2987(field980[var10], class87.method3053(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2800 & 0x8) == 8) {
            method2987(field957, field1016 + " " + class87.field1313 + " " + class87.method3053(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field993; var14++) {
            if (field872[var14] == 23) {
                field999[var14] = class87.method3053(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("h.io(IIIIIIIII)V")
    public static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class243.method5054(arg0)) {
            Statics.field1096 = null;
            method4411(Statics.field2520[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1096 != null) {
                method4411(Statics.field1096, -1412584499, arg1, arg2, arg3, arg4, Statics.field538, Statics.field1583, arg7);
                Statics.field1096 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1061[var8] = true;
            }
        } else {
            field1061[arg7] = true;
        }
    }

    @ObfuscatedName("ju.ii([Lib;IIIIIIIII)V")
    public static final void method4411(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class328.method5315(arg2, arg3, arg4, arg5);
        class135.method2580();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class243 var10 = arg0[var9];
            if (var10 != null && (var10.field2886 == arg1 || arg1 == -1412584499 && field1028 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1064[field968] = var10.field2948 + arg6;
                    field861[field968] = var10.field2829 + arg7;
                    field1123[field968] = var10.field2827;
                    field1067[field968] = var10.field2888;
                    var11 = ++field968 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2946 = var11;
                var10.field2947 = field867;
                if (!var10.field2814 || !method2953(var10)) {
                    if (var10.field2819 > 0) {
                        method3143(var10);
                    }
                    int var12 = var10.field2948 + arg6;
                    int var13 = var10.field2829 + arg7;
                    int var14 = var10.field2846;
                    if (field1028 == var10) {
                        if (arg1 != -1412584499 && !var10.field2872) {
                            Statics.field1096 = arg0;
                            Statics.field538 = arg6;
                            Statics.field1583 = arg7;
                            continue;
                        }
                        if (field1039 && field1033) {
                            int var15 = class61.field701;
                            int var16 = class61.field694;
                            int var17 = var15 - field1030;
                            int var18 = var16 - field1031;
                            if (var17 < field1034) {
                                var17 = field1034;
                            }
                            if (var10.field2827 + var17 > field1034 + field1029.field2827) {
                                var17 = field1034 + field1029.field2827 - var10.field2827;
                            }
                            if (var18 < field981) {
                                var18 = field981;
                            }
                            if (var10.field2888 + var18 > field981 + field1029.field2888) {
                                var18 = field981 + field1029.field2888 - var10.field2888;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2872) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2851 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2851 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2827 + var12;
                        int var26 = var10.field2888 + var13;
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
                        int var29 = var10.field2827 + var12;
                        int var30 = var10.field2888 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2814 || var19 < var21 && var20 < var22) {
                        if (var10.field2819 != 0) {
                            if (var10.field2819 == 1336) {
                                if (field923) {
                                    var13 += 15;
                                    Statics.field2507.method5130("Fps:" + field667, var10.field2827 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field863) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2507.method5130("Mem:" + var32 + "k", var10.field2827 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2819 == 1337) {
                                field1005 = var12;
                                field1089 = var13;
                                int var36 = var10.field2827;
                                int var37 = var10.field2888;
                                field954++;
                                if (Statics.field260.field1186 >> 7 == field1086 && Statics.field260.field1210 >> 7 == field1006) {
                                    field1086 = 0;
                                }
                                if (field975) {
                                    method487(Statics.field260, false);
                                }
                                method156();
                                method3516(true);
                                method4004();
                                method3516(false);
                                method664();
                                method5039();
                                method1774(var12, var13, var36, var37, true);
                                int var38 = field1114;
                                int var39 = field1115;
                                int var40 = field944;
                                int var41 = field907;
                                class328.method5315(var38, var39, var38 + var40, var39 + var41);
                                class135.method2580();
                                if (!field1100) {
                                    int var42 = field881;
                                    if (field942 / 256 > var42) {
                                        var42 = field942 / 256;
                                    }
                                    if (field902[4] && field862[4] + 128 > var42) {
                                        var42 = field862[4] + 128;
                                    }
                                    int var43 = field926 & 0x7FF;
                                    int var44 = Statics.field2523;
                                    int var45 = Statics.field3458;
                                    int var46 = Statics.field1475;
                                    int var47 = var42 * 3 + 600;
                                    int var48 = 2048 - var42 & 0x7FF;
                                    int var49 = 2048 - var43 & 0x7FF;
                                    int var50 = 0;
                                    int var51 = 0;
                                    int var52 = var47;
                                    if (var48 != 0) {
                                        int var53 = class135.field1956[var48];
                                        int var54 = class135.field1934[var48];
                                        int var55 = var51 * var54 - var47 * var53 >> 16;
                                        var52 = var51 * var53 + var47 * var54 >> 16;
                                        var51 = var55;
                                    }
                                    if (var49 != 0) {
                                        int var56 = class135.field1956[var49];
                                        int var57 = class135.field1934[var49];
                                        int var58 = var50 * var57 + var52 * var56 >> 16;
                                        var52 = var52 * var57 - var50 * var56 >> 16;
                                        var50 = var58;
                                    }
                                    Statics.field3767 = var44 - var50;
                                    Statics.field3473 = var45 - var51;
                                    Statics.field1469 = var46 - var52;
                                    Statics.field242 = var42;
                                    Statics.field2454 = var43;
                                    if (field931 == 1 && field1024 >= 2 && field867 % 50 == 0 && (Statics.field2523 >> 7 != Statics.field260.field1186 >> 7 || Statics.field1475 >> 7 != Statics.field260.field1210 >> 7)) {
                                        int var59 = Statics.field260.field843;
                                        int var60 = (Statics.field2523 >> 7) + Statics.field2499;
                                        int var61 = (Statics.field1475 >> 7) + Statics.field29;
                                        method115(var60, var61, var59, true);
                                    }
                                }
                                int var62;
                                if (field1100) {
                                    var62 = method3462();
                                } else {
                                    var62 = method3125();
                                }
                                int var63 = Statics.field3767;
                                int var64 = Statics.field3473;
                                int var65 = Statics.field1469;
                                int var66 = Statics.field242;
                                int var67 = Statics.field2454;
                                for (int var68 = 0; var68 < 5; var68++) {
                                    if (field902[var68]) {
                                        int var69 = (int) (Math.random() * (double) (field1102[var68] * 2 + 1) - (double) field1102[var68] + Math.sin((double) field1104[var68] / 100.0D * (double) field1105[var68]) * (double) field862[var68]);
                                        if (var68 == 0) {
                                            Statics.field3767 += var69;
                                        }
                                        if (var68 == 1) {
                                            Statics.field3473 += var69;
                                        }
                                        if (var68 == 2) {
                                            Statics.field1469 += var69;
                                        }
                                        if (var68 == 3) {
                                            Statics.field2454 = Statics.field2454 + var69 & 0x7FF;
                                        }
                                        if (var68 == 4) {
                                            Statics.field242 += var69;
                                            if (Statics.field242 < 128) {
                                                Statics.field242 = 128;
                                            }
                                            if (Statics.field242 > 383) {
                                                Statics.field242 = 383;
                                            }
                                        }
                                    }
                                }
                                int var70 = class61.field701;
                                int var71 = class61.field694;
                                if (class61.field709 != 0) {
                                    var70 = class61.field712;
                                    var71 = class61.field711;
                                }
                                if (var70 >= var38 && var70 < var38 + var40 && var71 >= var39 && var71 < var39 + var41) {
                                    class133.method614(var70 - var38, var71 - var39);
                                } else {
                                    class133.field1917 = false;
                                    class133.field1914 = 0;
                                }
                                method348();
                                class328.method5392(var38, var39, var40, var41, 0);
                                method348();
                                int var72 = class135.field1942;
                                class135.field1942 = field1093;
                                Statics.field3868.method2705(Statics.field3767, Statics.field3473, Statics.field1469, Statics.field242, Statics.field2454, var62);
                                class8.method1660();
                                class135.field1942 = var72;
                                method348();
                                Statics.field3868.method2678();
                                field943 = 0;
                                boolean var73 = false;
                                int var74 = -1;
                                int var75 = -1;
                                int var76 = class94.field1415;
                                int[] var77 = class94.field1416;
                                for (int var78 = 0; var78 < field899 + var76; var78++) {
                                    class76 var79;
                                    if (var78 < var76) {
                                        var79 = field972[var77[var78]];
                                        if (field983 == var77[var78]) {
                                            var73 = true;
                                            var74 = var78;
                                            continue;
                                        }
                                        if (Statics.field260 == var79) {
                                            var75 = var78;
                                            continue;
                                        }
                                    } else {
                                        var79 = field898[field900[var78 - var76]];
                                    }
                                    method1508(var79, var78, var38, var39, var40, var41);
                                }
                                if (field975 && var75 != -1) {
                                    method1508(Statics.field260, var75, var38, var39, var40, var41);
                                }
                                if (var73) {
                                    method1508(field972[field983], var74, var38, var39, var40, var41);
                                }
                                for (int var80 = 0; var80 < field943; var80++) {
                                    int var81 = field945[var80];
                                    int var82 = field946[var80];
                                    int var83 = field948[var80];
                                    int var84 = field947[var80];
                                    boolean var85 = true;
                                    while (var85) {
                                        var85 = false;
                                        for (int var86 = 0; var86 < var80; var86++) {
                                            if (var82 + 2 > field946[var86] - field947[var86] && var82 - var84 < field946[var86] + 2 && var81 - var83 < field948[var86] + field945[var86] && var81 + var83 > field945[var86] - field948[var86] && field946[var86] - field947[var86] < var82) {
                                                var82 = field946[var86] - field947[var86];
                                                var85 = true;
                                            }
                                        }
                                    }
                                    field955 = field945[var80];
                                    field865 = field946[var80] = var82;
                                    String var87 = field952[var80];
                                    if (field1019 == 0) {
                                        int var88 = 16776960;
                                        if (field1074[var80] < 6) {
                                            var88 = field1071[field1074[var80]];
                                        }
                                        if (field1074[var80] == 6) {
                                            var88 = field954 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field1074[var80] == 7) {
                                            var88 = field954 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field1074[var80] == 8) {
                                            var88 = field954 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field1074[var80] == 9) {
                                            int var89 = 150 - field951[var80];
                                            if (var89 < 50) {
                                                var88 = var89 * 1280 + 16711680;
                                            } else if (var89 < 100) {
                                                var88 = 16776960 - (var89 - 50) * 327680;
                                            } else if (var89 < 150) {
                                                var88 = (var89 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field1074[var80] == 10) {
                                            int var90 = 150 - field951[var80];
                                            if (var90 < 50) {
                                                var88 = var90 * 5 + 16711680;
                                            } else if (var90 < 100) {
                                                var88 = 16711935 - (var90 - 50) * 327680;
                                            } else if (var90 < 150) {
                                                var88 = (var90 - 100) * 327680 + 255 - (var90 - 100) * 5;
                                            }
                                        }
                                        if (field1074[var80] == 11) {
                                            int var91 = 150 - field951[var80];
                                            if (var91 < 50) {
                                                var88 = 16777215 - var91 * 327685;
                                            } else if (var91 < 100) {
                                                var88 = (var91 - 50) * 327685 + 65280;
                                            } else if (var91 < 150) {
                                                var88 = 16777215 - (var91 - 100) * 327680;
                                            }
                                        }
                                        if (field985[var80] == 0) {
                                            Statics.field2677.method5113(var87, field955 + var38, field865 + var39, var88, 0);
                                        }
                                        if (field985[var80] == 1) {
                                            Statics.field2677.method5115(var87, field955 + var38, field865 + var39, var88, 0, field954);
                                        }
                                        if (field985[var80] == 2) {
                                            Statics.field2677.method5116(var87, field955 + var38, field865 + var39, var88, 0, field954);
                                        }
                                        if (field985[var80] == 3) {
                                            Statics.field2677.method5117(var87, field955 + var38, field865 + var39, var88, 0, field954, 150 - field951[var80]);
                                        }
                                        if (field985[var80] == 4) {
                                            int var92 = (150 - field951[var80]) * (Statics.field2677.method5173(var87) + 100) / 150;
                                            class328.method5316(field955 + var38 - 50, var39, field955 + var38 + 50, var39 + var41);
                                            Statics.field2677.method5111(var87, field955 + var38 + 50 - var92, field865 + var39, var88, 0);
                                            class328.method5315(var38, var39, var38 + var40, var39 + var41);
                                        }
                                        if (field985[var80] == 5) {
                                            int var93 = 150 - field951[var80];
                                            int var94 = 0;
                                            if (var93 < 25) {
                                                var94 = var93 - 25;
                                            } else if (var93 > 125) {
                                                var94 = var93 - 125;
                                            }
                                            class328.method5316(var38, field865 + var39 - Statics.field2677.field3892 - 1, var38 + var40, field865 + var39 + 5);
                                            Statics.field2677.method5113(var87, field955 + var38, field865 + var39 + var94, var88, 0);
                                            class328.method5315(var38, var39, var38 + var40, var39 + var41);
                                        }
                                    } else {
                                        Statics.field2677.method5113(var87, field955 + var38, field865 + var39, 16776960, 0);
                                    }
                                }
                                method177(var38, var39);
                                ((class124) Statics.field1945).method2350(field894);
                                method488(var38, var39, var40, var41);
                                Statics.field3767 = var63;
                                Statics.field3473 = var64;
                                Statics.field1469 = var65;
                                Statics.field242 = var66;
                                Statics.field2454 = var67;
                                if (field866) {
                                    byte var95 = 0;
                                    int var96 = class265.field3405 + class265.field3404 + var95;
                                    if (var96 == 0) {
                                        field866 = false;
                                    }
                                }
                                if (field866) {
                                    class328.method5392(var38, var39, var40, var41, 0);
                                    method2575(class252.field3055, false);
                                }
                                field1061[var10.field2946] = true;
                                class328.method5315(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2819 == 1338) {
                                method255(var10, var12, var13, var11);
                                class328.method5315(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2819 == 1339) {
                                method963(var10, var12, var13, var11);
                                class328.method5315(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2819 == 1400) {
                                Statics.field743.method5588(var12, var13, var10.field2827, var10.field2888, field867);
                            }
                            if (var10.field2819 == 1401) {
                                Statics.field743.method5605(var12, var13, var10.field2827, var10.field2888);
                            }
                        }
                        if (var10.field2851 == 0) {
                            if (!var10.field2814 && method2953(var10) && Statics.field2776 != var10) {
                                continue;
                            }
                            if (!var10.field2814) {
                                if (var10.field2837 > var10.field2839 - var10.field2888) {
                                    var10.field2837 = var10.field2839 - var10.field2888;
                                }
                                if (var10.field2837 < 0) {
                                    var10.field2837 = 0;
                                }
                            }
                            method4411(arg0, var10.field2815, var19, var20, var21, var22, var12 - var10.field2836, var13 - var10.field2837, var11);
                            if (var10.field2939 != null) {
                                method4411(var10.field2939, var10.field2815, var19, var20, var21, var22, var12 - var10.field2836, var13 - var10.field2837, var11);
                            }
                            class68 var98 = (class68) field1018.method3677((long) var10.field2815);
                            if (var98 != null) {
                                method128(var98.field774, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class328.method5315(arg2, arg3, arg4, arg5);
                            class135.method2580();
                        }
                        if (field1070 || field1063[var11] || field1068 > 1) {
                            if (var10.field2851 == 0 && !var10.field2814 && var10.field2839 > var10.field2888) {
                                int var99 = var10.field2827 + var12;
                                int var100 = var10.field2837;
                                int var101 = var10.field2888;
                                int var102 = var10.field2839;
                                Statics.field1145[0].method5415(var99, var13);
                                Statics.field1145[1].method5415(var99, var13 + var101 - 16);
                                class328.method5392(var99, var13 + 16, 16, var101 - 32, field919);
                                int var103 = (var101 - 32) * var101 / var102;
                                if (var103 < 8) {
                                    var103 = 8;
                                }
                                int var104 = (var101 - 32 - var103) * var100 / (var102 - var101);
                                class328.method5392(var99, var13 + 16 + var104, 16, var103, field896);
                                class328.method5334(var99, var13 + 16 + var104, var103, field922);
                                class328.method5334(var99 + 1, var13 + 16 + var104, var103, field922);
                                class328.method5338(var99, var13 + 16 + var104, 16, field922);
                                class328.method5338(var99, var13 + 17 + var104, 16, field922);
                                class328.method5334(var99 + 15, var13 + 16 + var104, var103, field921);
                                class328.method5334(var99 + 14, var13 + 17 + var104, var103 - 1, field921);
                                class328.method5338(var99, var13 + 15 + var104 + var103, 16, field921);
                                class328.method5338(var99 + 1, var13 + 14 + var104 + var103, 15, field921);
                            }
                            if (var10.field2851 != 1) {
                                if (var10.field2851 == 2) {
                                    int var105 = 0;
                                    for (int var106 = 0; var106 < var10.field2890; var106++) {
                                        for (int var107 = 0; var107 < var10.field2826; var107++) {
                                            int var108 = (var10.field2881 + 32) * var107 + var12;
                                            int var109 = (var10.field2882 + 32) * var106 + var13;
                                            if (var105 < 20) {
                                                var108 += var10.field2833[var105];
                                                var109 += var10.field2884[var105];
                                            }
                                            if (var10.field2879[var105] > 0) {
                                                boolean var110 = false;
                                                boolean var111 = false;
                                                int var112 = var10.field2879[var105] - 1;
                                                if (var108 + 32 > arg2 && var108 < arg4 && var109 + 32 > arg3 && var109 < arg5 || Statics.field2150 == var10 && field1081 == var105) {
                                                    class332 var113;
                                                    if (field924 == 1 && Statics.field590 == var105 && Statics.field901 == var10.field2815) {
                                                        var113 = class284.method1795(var112, var10.field2934[var105], 2, 0, 2, false);
                                                    } else {
                                                        var113 = class284.method1795(var112, var10.field2934[var105], 1, 3153952, 2, false);
                                                    }
                                                    if (var113 == null) {
                                                        method260(var10);
                                                    } else if (Statics.field2150 == var10 && field1081 == var105) {
                                                        int var114 = class61.field701 - field965;
                                                        int var115 = class61.field694 - field1057;
                                                        if (var114 < 5 && var114 > -5) {
                                                            var114 = 0;
                                                        }
                                                        if (var115 < 5 && var115 > -5) {
                                                            var115 = 0;
                                                        }
                                                        if (field969 < 5) {
                                                            var114 = 0;
                                                            var115 = 0;
                                                        }
                                                        var113.method5448(var108 + var114, var109 + var115, 128);
                                                        if (arg1 != -1) {
                                                            class243 var116 = arg0[arg1 & 0xFFFF];
                                                            if (var109 + var115 < class328.field3956 && var116.field2837 > 0) {
                                                                int var117 = field894 * (class328.field3956 - var109 - var115) / 3;
                                                                if (var117 > field894 * 10) {
                                                                    var117 = field894 * 10;
                                                                }
                                                                if (var117 > var116.field2837) {
                                                                    var117 = var116.field2837;
                                                                }
                                                                var116.field2837 -= var117;
                                                                field1057 += var117;
                                                                method260(var116);
                                                            }
                                                            if (var109 + var115 + 32 > class328.field3957 && var116.field2837 < var116.field2839 - var116.field2888) {
                                                                int var118 = field894 * (var109 + var115 + 32 - class328.field3957) / 3;
                                                                if (var118 > field894 * 10) {
                                                                    var118 = field894 * 10;
                                                                }
                                                                if (var118 > var116.field2839 - var116.field2888 - var116.field2837) {
                                                                    var118 = var116.field2839 - var116.field2888 - var116.field2837;
                                                                }
                                                                var116.field2837 += var118;
                                                                field1057 -= var118;
                                                                method260(var116);
                                                            }
                                                        }
                                                    } else if (Statics.field751 == var10 && field910 == var105) {
                                                        var113.method5448(var108, var109, 128);
                                                    } else {
                                                        var113.method5438(var108, var109);
                                                    }
                                                }
                                            } else if (var10.field2885 != null && var105 < 20) {
                                                class332 var119 = var10.method4108(var105);
                                                if (var119 != null) {
                                                    var119.method5438(var108, var109);
                                                } else if (class243.field2813) {
                                                    method260(var10);
                                                }
                                            }
                                            var105++;
                                        }
                                    }
                                } else if (var10.field2851 == 3) {
                                    int var120;
                                    if (method3007(var10)) {
                                        var120 = var10.field2921;
                                        if (Statics.field2776 == var10 && var10.field2843 != 0) {
                                            var120 = var10.field2843;
                                        }
                                    } else {
                                        var120 = var10.field2840;
                                        if (Statics.field2776 == var10 && var10.field2842 != 0) {
                                            var120 = var10.field2842;
                                        }
                                    }
                                    if (var10.field2844) {
                                        switch(var10.field2897.field3968) {
                                            case 1:
                                                class328.method5324(var12, var13, var10.field2827, var10.field2888, var10.field2840, var10.field2921, 256 - (var10.field2846 & 0xFF), 256 - (var10.field2847 & 0xFF));
                                                break;
                                            case 2:
                                                class328.method5325(var12, var13, var10.field2827, var10.field2888, var10.field2840, var10.field2921, 256 - (var10.field2846 & 0xFF), 256 - (var10.field2847 & 0xFF));
                                                break;
                                            case 3:
                                                class328.method5326(var12, var13, var10.field2827, var10.field2888, var10.field2840, var10.field2921, 256 - (var10.field2846 & 0xFF), 256 - (var10.field2847 & 0xFF));
                                                break;
                                            case 4:
                                                class328.method5355(var12, var13, var10.field2827, var10.field2888, var10.field2840, var10.field2921, 256 - (var10.field2846 & 0xFF), 256 - (var10.field2847 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class328.method5392(var12, var13, var10.field2827, var10.field2888, var120);
                                                } else {
                                                    class328.method5322(var12, var13, var10.field2827, var10.field2888, var120, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class328.method5330(var12, var13, var10.field2827, var10.field2888, var120);
                                    } else {
                                        class328.method5331(var12, var13, var10.field2827, var10.field2888, var120, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2851 == 4) {
                                    class312 var121 = var10.method4107();
                                    if (var121 != null) {
                                        String var122 = var10.field2877;
                                        int var123;
                                        if (method3007(var10)) {
                                            var123 = var10.field2921;
                                            if (Statics.field2776 == var10 && var10.field2843 != 0) {
                                                var123 = var10.field2843;
                                            }
                                            if (var10.field2876.length() > 0) {
                                                var122 = var10.field2876;
                                            }
                                        } else {
                                            var123 = var10.field2840;
                                            if (Statics.field2776 == var10 && var10.field2842 != 0) {
                                                var123 = var10.field2842;
                                            }
                                        }
                                        if (var10.field2814 && var10.field2935 != -1) {
                                            class284 var124 = class284.method2869(var10.field2935);
                                            var122 = var124.field3645;
                                            if (var122 == null) {
                                                var122 = class252.field3012;
                                            }
                                            if ((var124.field3666 == 1 || var10.field2936 != 1) && var10.field2936 != -1) {
                                                var122 = class87.method3053(16748608) + var122 + class87.field1315 + " " + 'x' + method4157(var10.field2936);
                                            }
                                        }
                                        if (field1103 == var10) {
                                            var122 = class252.field3171;
                                            var123 = var10.field2840;
                                        }
                                        if (!var10.field2814) {
                                            var122 = method5090(var122, var10);
                                        }
                                        var121.method5114(var122, var12, var13, var10.field2827, var10.field2888, var123, var10.field2880 ? 0 : -1, var10.field2878, var10.field2930, var10.field2805);
                                    } else if (class243.field2813) {
                                        method260(var10);
                                    }
                                } else if (var10.field2851 == 5) {
                                    if (var10.field2814) {
                                        class332 var126;
                                        if (var10.field2935 == -1) {
                                            var126 = var10.method4106(false);
                                        } else {
                                            var126 = class284.method1795(var10.field2935, var10.field2936, var10.field2854, var10.field2875, var10.field2873, false);
                                        }
                                        if (var126 != null) {
                                            int var127 = var126.field3983;
                                            int var128 = var126.field3985;
                                            if (var10.field2853) {
                                                class328.method5316(var12, var13, var10.field2827 + var12, var10.field2888 + var13);
                                                int var129 = (var10.field2827 + (var127 - 1)) / var127;
                                                int var130 = (var10.field2888 + (var128 - 1)) / var128;
                                                for (int var131 = 0; var131 < var129; var131++) {
                                                    for (int var132 = 0; var132 < var130; var132++) {
                                                        if (var10.field2852 != 0) {
                                                            var126.method5479(var127 / 2 + var127 * var131 + var12, var128 / 2 + var128 * var132 + var13, var10.field2852, 4096);
                                                        } else if (var14 == 0) {
                                                            var126.method5438(var127 * var131 + var12, var128 * var132 + var13);
                                                        } else {
                                                            var126.method5448(var127 * var131 + var12, var128 * var132 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class328.method5315(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var133 = var10.field2827 * 4096 / var127;
                                                if (var10.field2852 != 0) {
                                                    var126.method5479(var10.field2827 / 2 + var12, var10.field2888 / 2 + var13, var10.field2852, var133);
                                                } else if (var14 != 0) {
                                                    var126.method5450(var12, var13, var10.field2827, var10.field2888, 256 - (var14 & 0xFF));
                                                } else if (var10.field2827 == var127 && var10.field2888 == var128) {
                                                    var126.method5438(var12, var13);
                                                } else {
                                                    var126.method5444(var12, var13, var10.field2827, var10.field2888);
                                                }
                                            }
                                        } else if (class243.field2813) {
                                            method260(var10);
                                        }
                                    } else {
                                        class332 var125 = var10.method4106(method3007(var10));
                                        if (var125 != null) {
                                            var125.method5438(var12, var13);
                                        } else if (class243.field2813) {
                                            method260(var10);
                                        }
                                    }
                                } else if (var10.field2851 == 6) {
                                    boolean var134 = method3007(var10);
                                    int var135;
                                    if (var134) {
                                        var135 = var10.field2863;
                                    } else {
                                        var135 = var10.field2832;
                                    }
                                    class132 var136 = null;
                                    int var137 = 0;
                                    if (var10.field2935 != -1) {
                                        class284 var138 = class284.method2869(var10.field2935);
                                        if (var138 != null) {
                                            class284 var139 = var138.method4689(var10.field2936);
                                            var136 = var139.method4688(1);
                                            if (var136 == null) {
                                                method260(var10);
                                            } else {
                                                var136.method2475();
                                                var137 = var136.field2043 / 2;
                                            }
                                        }
                                    } else if (var10.field2858 == 5) {
                                        if (var10.field2924 == 0) {
                                            var136 = field1119.method4067((class288) null, -1, (class288) null, -1);
                                        } else {
                                            var136 = Statics.field260.method1043();
                                        }
                                    } else if (var135 == -1) {
                                        var136 = var10.method4140((class288) null, -1, var134, Statics.field260.field821);
                                        if (var136 == null && class243.field2813) {
                                            method260(var10);
                                        }
                                    } else {
                                        class288 var140 = class288.method3535(var135);
                                        var136 = var10.method4140(var140, var10.field2838, var134, Statics.field260.field821);
                                        if (var136 == null && class243.field2813) {
                                            method260(var10);
                                        }
                                    }
                                    class135.method2583(var10.field2827 / 2 + var12, var10.field2888 / 2 + var13);
                                    int var141 = var10.field2869 * class135.field1956[var10.field2866] >> 16;
                                    int var142 = var10.field2869 * class135.field1934[var10.field2866] >> 16;
                                    if (var136 != null) {
                                        if (var10.field2814) {
                                            var136.method2475();
                                            if (var10.field2830) {
                                                var136.method2489(0, var10.field2867, var10.field2825, var10.field2866, var10.field2855, var10.field2865 + var137 + var141, var10.field2865 + var142, var10.field2869);
                                            } else {
                                                var136.method2488(0, var10.field2867, var10.field2825, var10.field2866, var10.field2855, var10.field2865 + var137 + var141, var10.field2865 + var142);
                                            }
                                        } else {
                                            var136.method2488(0, var10.field2867, 0, var10.field2866, 0, var141, var142);
                                        }
                                    }
                                    class135.method2624();
                                } else {
                                    if (var10.field2851 == 7) {
                                        class312 var143 = var10.method4107();
                                        if (var143 == null) {
                                            if (class243.field2813) {
                                                method260(var10);
                                            }
                                            continue;
                                        }
                                        int var144 = 0;
                                        for (int var145 = 0; var145 < var10.field2890; var145++) {
                                            for (int var146 = 0; var146 < var10.field2826; var146++) {
                                                if (var10.field2879[var144] > 0) {
                                                    class284 var147 = class284.method2869(var10.field2879[var144] - 1);
                                                    String var148;
                                                    if (var147.field3666 != 1 && var10.field2934[var144] == 1) {
                                                        var148 = class87.method3053(16748608) + var147.field3645 + class87.field1315;
                                                    } else {
                                                        var148 = class87.method3053(16748608) + var147.field3645 + class87.field1315 + " " + 'x' + method4157(var10.field2934[var144]);
                                                    }
                                                    int var149 = (var10.field2881 + 115) * var146 + var12;
                                                    int var150 = (var10.field2882 + 12) * var145 + var13;
                                                    if (var10.field2878 == 0) {
                                                        var143.method5111(var148, var149, var150, var10.field2840, var10.field2880 ? 0 : -1);
                                                    } else if (var10.field2878 == 1) {
                                                        var143.method5113(var148, var10.field2827 / 2 + var149, var150, var10.field2840, var10.field2880 ? 0 : -1);
                                                    } else {
                                                        var143.method5130(var148, var10.field2827 + var149 - 1, var150, var10.field2840, var10.field2880 ? 0 : -1);
                                                    }
                                                }
                                                var144++;
                                            }
                                        }
                                    }
                                    if (var10.field2851 == 8 && Statics.field332 == var10 && field1008 == field1007) {
                                        int var151 = 0;
                                        int var152 = 0;
                                        class312 var153 = Statics.field2507;
                                        String var154 = var10.field2877;
                                        String var155 = method5090(var154, var10);
                                        while (var155.length() > 0) {
                                            int var156 = var155.indexOf(class87.field1314);
                                            String var157;
                                            if (var156 == -1) {
                                                var157 = var155;
                                                var155 = "";
                                            } else {
                                                var157 = var155.substring(0, var156);
                                                var155 = var155.substring(var156 + 4);
                                            }
                                            int var158 = var153.method5173(var157);
                                            if (var158 > var151) {
                                                var151 = var158;
                                            }
                                            var152 += var153.field3892 + 1;
                                        }
                                        var151 += 6;
                                        var152 += 7;
                                        int var159 = var10.field2827 + var12 - 5 - var151;
                                        int var160 = var10.field2888 + var13 + 5;
                                        if (var159 < var12 + 5) {
                                            var159 = var12 + 5;
                                        }
                                        if (var151 + var159 > arg4) {
                                            var159 = arg4 - var151;
                                        }
                                        if (var152 + var160 > arg5) {
                                            var160 = arg5 - var152;
                                        }
                                        class328.method5392(var159, var160, var151, var152, 16777120);
                                        class328.method5330(var159, var160, var151, var152, 0);
                                        String var161 = var10.field2877;
                                        int var162 = var153.field3892 + var160 + 2;
                                        String var163 = method5090(var161, var10);
                                        while (var163.length() > 0) {
                                            int var164 = var163.indexOf(class87.field1314);
                                            String var165;
                                            if (var164 == -1) {
                                                var165 = var163;
                                                var163 = "";
                                            } else {
                                                var165 = var163.substring(0, var164);
                                                var163 = var163.substring(var164 + 4);
                                            }
                                            var153.method5111(var165, var159 + 3, var162, 0, -1);
                                            var162 += var153.field3892 + 1;
                                        }
                                    }
                                    if (var10.field2851 == 9) {
                                        int var166;
                                        int var167;
                                        int var168;
                                        int var169;
                                        if (var10.field2898) {
                                            var166 = var12;
                                            var167 = var10.field2888 + var13;
                                            var168 = var10.field2827 + var12;
                                            var169 = var13;
                                        } else {
                                            var166 = var12;
                                            var167 = var13;
                                            var168 = var10.field2827 + var12;
                                            var169 = var10.field2888 + var13;
                                        }
                                        if (var10.field2848 == 1) {
                                            class328.method5336(var166, var167, var168, var169, var10.field2840);
                                        } else {
                                            int var172 = var10.field2840;
                                            int var173 = var10.field2848;
                                            int var174 = var168 - var166;
                                            int var175 = var169 - var167;
                                            int var176 = var174 >= 0 ? var174 : -var174;
                                            int var177 = var175 >= 0 ? var175 : -var175;
                                            int var178 = var176;
                                            if (var176 < var177) {
                                                var178 = var177;
                                            }
                                            if (var178 != 0) {
                                                int var179 = (var174 << 16) / var178;
                                                int var180 = (var175 << 16) / var178;
                                                if (var180 <= var179) {
                                                    var179 = -var179;
                                                } else {
                                                    var180 = -var180;
                                                }
                                                int var181 = var173 * var180 >> 17;
                                                int var182 = var173 * var180 + 1 >> 17;
                                                int var183 = var173 * var179 >> 17;
                                                int var184 = var173 * var179 + 1 >> 17;
                                                int var185 = var166 - class328.field3953;
                                                int var186 = var167 - class328.field3956;
                                                int var187 = var181 + var185;
                                                int var188 = var185 - var182;
                                                int var189 = var174 + var185 - var182;
                                                int var190 = var174 + var185 + var181;
                                                int var191 = var183 + var186;
                                                int var192 = var186 - var184;
                                                int var193 = var175 + var186 - var184;
                                                int var194 = var175 + var186 + var183;
                                                class135.method2588(var187, var188, var189);
                                                class135.method2591(var191, var192, var193, var187, var188, var189, var172);
                                                class135.method2588(var187, var189, var190);
                                                class135.method2591(var191, var193, var194, var187, var189, var190, var172);
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

    @ObfuscatedName("kp.is(Ljava/lang/String;Lib;I)Ljava/lang/String;")
    public static String method5090(String arg0, class243 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2854(method631(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ib.iv(IB)Ljava/lang/String;")
    public static final String method4157(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class87.field1309 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class87.method3053(65408) + var1.substring(0, var1.length() - 8) + class252.field3174 + " " + class87.field1317 + var1 + class87.field1312 + class87.field1315;
        } else if (var1.length() > 6) {
            return " " + class87.method3053(16777215) + var1.substring(0, var1.length() - 4) + class252.field3079 + " " + class87.field1317 + var1 + class87.field1312 + class87.field1315;
        } else {
            return " " + class87.method3053(16776960) + var1 + class87.field1315;
        }
    }

    @ObfuscatedName("client.ic(ZI)V")
    public final void method1217(boolean arg0) {
        method55(field1017, Statics.field3766, Statics.field554, arg0);
    }

    @ObfuscatedName("client.iw(Lib;I)V")
    public void method1105(class243 arg0) {
        class243 var2 = arg0.field2886 == -1 ? null : class243.method3(arg0.field2886);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3766;
            var4 = Statics.field554;
        } else {
            var3 = var2.field2827;
            var4 = var2.field2888;
        }
        method181(arg0, var3, var4, false);
        method4831(arg0, var3, var4);
    }

    @ObfuscatedName("aw.jv([Lib;Lib;ZI)V")
    public static void method519(class243[] arg0, class243 arg1, boolean arg2) {
        int var3 = arg1.field2850 == 0 ? arg1.field2827 : arg1.field2850;
        int var4 = arg1.field2839 == 0 ? arg1.field2888 : arg1.field2839;
        method2467(arg0, arg1.field2815, var3, var4, arg2);
        if (arg1.field2939 != null) {
            method2467(arg1.field2939, arg1.field2815, var3, var4, arg2);
        }
        class68 var5 = (class68) field1018.method3677((long) arg1.field2815);
        if (var5 != null) {
            method55(var5.field774, var3, var4, arg2);
        }
        if (arg1.field2819 == 1337) {
        }
    }

    @ObfuscatedName("r.jm(IIIZI)V")
    public static final void method55(int arg0, int arg1, int arg2, boolean arg3) {
        if (class243.method5054(arg0)) {
            method2467(Statics.field2520[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eg.jr([Lib;IIIZI)V")
    public static void method2467(class243[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class243 var6 = arg0[var5];
            if (var6 != null && var6.field2886 == arg1) {
                method181(var6, arg2, arg3, arg4);
                method4831(var6, arg2, arg3);
                if (var6.field2836 > var6.field2850 - var6.field2827) {
                    var6.field2836 = var6.field2850 - var6.field2827;
                }
                if (var6.field2836 < 0) {
                    var6.field2836 = 0;
                }
                if (var6.field2837 > var6.field2839 - var6.field2888) {
                    var6.field2837 = var6.field2839 - var6.field2888;
                }
                if (var6.field2837 < 0) {
                    var6.field2837 = 0;
                }
                if (var6.field2851 == 0) {
                    method519(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("y.js(Lib;IIZB)V")
    public static void method181(class243 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2827;
        int var5 = arg0.field2888;
        if (arg0.field2822 == 0) {
            arg0.field2827 = arg0.field2826;
        } else if (arg0.field2822 == 1) {
            arg0.field2827 = arg1 - arg0.field2826;
        } else if (arg0.field2822 == 2) {
            arg0.field2827 = arg0.field2826 * arg1 >> 14;
        }
        if (arg0.field2823 == 0) {
            arg0.field2888 = arg0.field2890;
        } else if (arg0.field2823 == 1) {
            arg0.field2888 = arg2 - arg0.field2890;
        } else if (arg0.field2823 == 2) {
            arg0.field2888 = arg0.field2890 * arg2 >> 14;
        }
        if (arg0.field2822 == 4) {
            arg0.field2827 = arg0.field2902 * arg0.field2888 / arg0.field2893;
        }
        if (arg0.field2823 == 4) {
            arg0.field2888 = arg0.field2893 * arg0.field2827 / arg0.field2902;
        }
        if (arg0.field2819 == 1337) {
            field1027 = arg0;
        }
        if (arg3 && arg0.field2895 != null && (arg0.field2827 != var4 || arg0.field2888 != var5)) {
            class69 var6 = new class69();
            var6.field781 = arg0;
            var6.field783 = arg0.field2895;
            field1055.method3716(var6);
        }
    }

    @ObfuscatedName("kf.je(Lib;IIB)V")
    public static void method4831(class243 arg0, int arg1, int arg2) {
        if (arg0.field2820 == 0) {
            arg0.field2948 = arg0.field2824;
        } else if (arg0.field2820 == 1) {
            arg0.field2948 = (arg1 - arg0.field2827) / 2 + arg0.field2824;
        } else if (arg0.field2820 == 2) {
            arg0.field2948 = arg1 - arg0.field2827 - arg0.field2824;
        } else if (arg0.field2820 == 3) {
            arg0.field2948 = arg0.field2824 * arg1 >> 14;
        } else if (arg0.field2820 == 4) {
            arg0.field2948 = (arg0.field2824 * arg1 >> 14) + (arg1 - arg0.field2827) / 2;
        } else {
            arg0.field2948 = arg1 - arg0.field2827 - (arg0.field2824 * arg1 >> 14);
        }
        if (arg0.field2821 == 0) {
            arg0.field2829 = arg0.field2804;
        } else if (arg0.field2821 == 1) {
            arg0.field2829 = (arg2 - arg0.field2888) / 2 + arg0.field2804;
        } else if (arg0.field2821 == 2) {
            arg0.field2829 = arg2 - arg0.field2888 - arg0.field2804;
        } else if (arg0.field2821 == 3) {
            arg0.field2829 = arg0.field2804 * arg2 >> 14;
        } else if (arg0.field2821 == 4) {
            arg0.field2829 = (arg0.field2804 * arg2 >> 14) + (arg2 - arg0.field2888) / 2;
        } else {
            arg0.field2829 = arg2 - arg0.field2888 - (arg0.field2804 * arg2 >> 14);
        }
    }

    @ObfuscatedName("ek.jp(IB)Ljava/lang/String;")
    public static final String method2854(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("fj.jd(Lib;B)Z")
    public static final boolean method3007(class243 arg0) {
        if (arg0.field2928 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2928.length; var1++) {
            int var2 = method631(arg0, var1);
            int var3 = arg0.field2929[var1];
            if (arg0.field2928[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2928[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2928[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("az.jc(Lib;II)I")
    public static final int method631(class243 arg0, int arg1) {
        if (arg0.field2927 == null || arg1 >= arg0.field2927.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2927[arg1];
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
                    var7 = field1121[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field917[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field918[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class243 var11 = class243.method3(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class284.method2869(var12).field3658 || field856)) {
                        for (int var13 = 0; var13 < var11.field2879.length; var13++) {
                            if (var12 + 1 == var11.field2879[var13]) {
                                var7 += var11.field2934[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class238.field2771[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class249.field2999[field917[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class238.field2771[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field260.field833;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class249.field3001[var14]) {
                            var7 += field917[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class243 var17 = class243.method3(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class284.method2869(var18).field3658 || field856)) {
                        for (int var19 = 0; var19 < var17.field2879.length; var19++) {
                            if (var18 + 1 == var17.field2879[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1022;
                }
                if (var6 == 12) {
                    var7 = field1023;
                }
                if (var6 == 13) {
                    int var20 = class238.field2771[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class238.method1710(var22);
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
                    var7 = (Statics.field260.field1186 >> 7) + Statics.field2499;
                }
                if (var6 == 19) {
                    var7 = (Statics.field260.field1210 >> 7) + Statics.field29;
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

    @ObfuscatedName("gc.jb(Lib;Ljh;IIZI)V")
    public static final void method3163(class243 arg0, class284 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3660;
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
            var7 = class252.field3014;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class87.method3053(16748608) + arg1.field3645;
        int var11 = arg1.field3643;
        int var13 = arg0.field2815;
        if (field992 || field993 >= 500) {
            return;
        }
        field998[field993] = var7;
        field999[field993] = var9;
        field872[field993] = var6;
        field997[field993] = var11;
        field994[field993] = arg2;
        field995[field993] = var13;
        field1000[field993] = arg4;
        field993++;
    }

    @ObfuscatedName("af.ja(IIIIIIII)V")
    public static final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class243.method5054(arg0)) {
            method38(Statics.field2520[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("p.jq([Lib;IIIIIIII)V")
    public static final void method38(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class243 var9 = arg0[var8];
            if (var9 != null && (!var9.field2814 || var9.field2851 == 0 || var9.field2938 || method580(var9) != 0 || field1029 == var9 || var9.field2819 == 1338) && var9.field2886 == arg1 && (!var9.field2814 || !method2953(var9))) {
                int var10 = var9.field2948 + arg6;
                int var11 = var9.field2829 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2851 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2851 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2827 + var10;
                    int var19 = var9.field2888 + var11;
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
                    int var22 = var9.field2827 + var10;
                    int var23 = var9.field2888 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1028 == var9) {
                    field878 = true;
                    field1125 = var10;
                    field1038 = var11;
                }
                if (!var9.field2814 || var12 < var14 && var13 < var15) {
                    int var24 = class61.field701;
                    int var25 = class61.field694;
                    if (class61.field709 != 0) {
                        var24 = class61.field712;
                        var25 = class61.field711;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2819 == 1337) {
                        if (!field866 && !field992 && var26) {
                            method3517(var24, var25, var12, var13);
                        }
                    } else if (var9.field2819 == 1338) {
                        method4511(var9, var10, var11);
                    } else {
                        if (var9.field2819 == 1400) {
                            Statics.field743.method5739(class61.field701, class61.field694, var26, var10, var11, var9.field2827, var9.field2888);
                        }
                        if (!field992 && var26) {
                            if (var9.field2819 == 1400) {
                                Statics.field743.method5637(var10, var11, var9.field2827, var9.field2888, var24, var25);
                            } else {
                                int var27 = var24 - var10;
                                int var28 = var25 - var11;
                                if (var9.field2818 == 1) {
                                    method2987(var9.field2932, "", 24, 0, 0, var9.field2815);
                                }
                                if (var9.field2818 == 2 && !field1012) {
                                    int var29 = method580(var9);
                                    int var30 = var29 >> 11 & 0x3F;
                                    String var31;
                                    if (var30 == 0) {
                                        var31 = null;
                                    } else if (var9.field2864 == null || var9.field2864.trim().length() == 0) {
                                        var31 = null;
                                    } else {
                                        var31 = var9.field2864;
                                    }
                                    if (var31 != null) {
                                        method2987(var31, class87.method3053(65280) + var9.field2931, 25, 0, -1, var9.field2815);
                                    }
                                }
                                if (var9.field2818 == 3) {
                                    method2987(class252.field3278, "", 26, 0, 0, var9.field2815);
                                }
                                if (var9.field2818 == 4) {
                                    method2987(var9.field2932, "", 28, 0, 0, var9.field2815);
                                }
                                if (var9.field2818 == 5) {
                                    method2987(var9.field2932, "", 29, 0, 0, var9.field2815);
                                }
                                if (var9.field2818 == 6 && field1103 == null) {
                                    method2987(var9.field2932, "", 30, 0, -1, var9.field2815);
                                }
                                if (var9.field2851 == 2) {
                                    int var33 = 0;
                                    for (int var34 = 0; var34 < var9.field2888; var34++) {
                                        for (int var35 = 0; var35 < var9.field2827; var35++) {
                                            int var36 = (var9.field2881 + 32) * var35;
                                            int var37 = (var9.field2882 + 32) * var34;
                                            if (var33 < 20) {
                                                var36 += var9.field2833[var33];
                                                var37 += var9.field2884[var33];
                                            }
                                            if (var27 >= var36 && var28 >= var37 && var27 < var36 + 32 && var28 < var37 + 32) {
                                                field1087 = var33;
                                                Statics.field1702 = var9;
                                                if (var9.field2879[var33] > 0) {
                                                    label1058: {
                                                        class284 var38 = class284.method2869(var9.field2879[var33] - 1);
                                                        if (field924 == 1) {
                                                            int var39 = method580(var9);
                                                            boolean var40 = (var39 >> 30 & 0x1) != 0;
                                                            if (var40) {
                                                                if (Statics.field901 != var9.field2815 || Statics.field590 != var33) {
                                                                    method2987(class252.field3163, field1011 + " " + class87.field1313 + " " + class87.method3053(16748608) + var38.field3645, 31, var38.field3643, var33, var9.field2815);
                                                                }
                                                                break label1058;
                                                            }
                                                        }
                                                        if (field1012) {
                                                            int var41 = method580(var9);
                                                            boolean var42 = (var41 >> 30 & 0x1) != 0;
                                                            if (var42) {
                                                                if ((Statics.field2800 & 0x10) == 16) {
                                                                    method2987(field957, field1016 + " " + class87.field1313 + " " + class87.method3053(16748608) + var38.field3645, 32, var38.field3643, var33, var9.field2815);
                                                                }
                                                                break label1058;
                                                            }
                                                        }
                                                        String[] var43 = var38.field3660;
                                                        int var44 = -1;
                                                        if (field1002) {
                                                            boolean var45 = field1003 || class52.field608[81];
                                                            if (var45) {
                                                                var44 = var38.method4696();
                                                            }
                                                        }
                                                        int var46 = method580(var9);
                                                        boolean var47 = (var46 >> 30 & 0x1) != 0;
                                                        if (var47) {
                                                            for (int var48 = 4; var48 >= 3; var48--) {
                                                                if (var44 != var48) {
                                                                    method3163(var9, var38, var33, var48, false);
                                                                }
                                                            }
                                                        }
                                                        int var49 = method580(var9);
                                                        boolean var50 = (var49 >> 31 & 0x1) != 0;
                                                        if (var50) {
                                                            method2987(class252.field3163, class87.method3053(16748608) + var38.field3645, 38, var38.field3643, var33, var9.field2815);
                                                        }
                                                        int var51 = method580(var9);
                                                        boolean var52 = (var51 >> 30 & 0x1) != 0;
                                                        if (var52) {
                                                            for (int var53 = 2; var53 >= 0; var53--) {
                                                                if (var44 != var53) {
                                                                    method3163(var9, var38, var33, var53, false);
                                                                }
                                                            }
                                                            if (var44 >= 0) {
                                                                method3163(var9, var38, var33, var44, true);
                                                            }
                                                        }
                                                        String[] var54 = var9.field2910;
                                                        if (var54 != null) {
                                                            for (int var55 = 4; var55 >= 0; var55--) {
                                                                if (var54[var55] != null) {
                                                                    byte var56 = 0;
                                                                    if (var55 == 0) {
                                                                        var56 = 39;
                                                                    }
                                                                    if (var55 == 1) {
                                                                        var56 = 40;
                                                                    }
                                                                    if (var55 == 2) {
                                                                        var56 = 41;
                                                                    }
                                                                    if (var55 == 3) {
                                                                        var56 = 42;
                                                                    }
                                                                    if (var55 == 4) {
                                                                        var56 = 43;
                                                                    }
                                                                    method2987(var54[var55], class87.method3053(16748608) + var38.field3645, var56, var38.field3643, var33, var9.field2815);
                                                                }
                                                            }
                                                        }
                                                        method2987(class252.field3071, class87.method3053(16748608) + var38.field3645, 1005, var38.field3643, var33, var9.field2815);
                                                    }
                                                }
                                            }
                                            var33++;
                                        }
                                    }
                                }
                                if (var9.field2814) {
                                    if (field1012) {
                                        int var57 = method580(var9);
                                        boolean var58 = (var57 >> 21 & 0x1) != 0;
                                        if (var58 && (Statics.field2800 & 0x20) == 32) {
                                            method2987(field957, field1016 + " " + class87.field1313 + " " + var9.field2883, 58, 0, var9.field2816, var9.field2815);
                                        }
                                    } else {
                                        for (int var59 = 9; var59 >= 5; var59--) {
                                            String var60 = method493(var9, var59);
                                            if (var60 != null) {
                                                method2987(var60, var9.field2883, 1007, var59 + 1, var9.field2816, var9.field2815);
                                            }
                                        }
                                        int var61 = method580(var9);
                                        int var62 = var61 >> 11 & 0x3F;
                                        String var63;
                                        if (var62 == 0) {
                                            var63 = null;
                                        } else if (var9.field2864 == null || var9.field2864.trim().length() == 0) {
                                            var63 = null;
                                        } else {
                                            var63 = var9.field2864;
                                        }
                                        if (var63 != null) {
                                            method2987(var63, var9.field2883, 25, 0, var9.field2816, var9.field2815);
                                        }
                                        for (int var65 = 4; var65 >= 0; var65--) {
                                            String var66 = method493(var9, var65);
                                            if (var66 != null) {
                                                method2987(var66, var9.field2883, 57, var65 + 1, var9.field2816, var9.field2815);
                                            }
                                        }
                                        int var67 = method580(var9);
                                        boolean var68 = (var67 & 0x1) != 0;
                                        if (var68) {
                                            method2987(class252.field3018, "", 30, 0, var9.field2816, var9.field2815);
                                        }
                                    }
                                }
                            }
                        }
                        if (var9.field2851 == 0) {
                            if (!var9.field2814 && method2953(var9) && Statics.field2776 != var9) {
                                continue;
                            }
                            method38(arg0, var9.field2815, var12, var13, var14, var15, var10 - var9.field2836, var11 - var9.field2837);
                            if (var9.field2939 != null) {
                                method38(var9.field2939, var9.field2815, var12, var13, var14, var15, var10 - var9.field2836, var11 - var9.field2837);
                            }
                            class68 var69 = (class68) field1018.method3677((long) var9.field2815);
                            if (var69 != null) {
                                if (var69.field775 == 0 && class61.field701 >= var12 && class61.field694 >= var13 && class61.field701 < var14 && class61.field694 < var15 && !field992) {
                                    for (class69 var70 = (class69) field1055.method3723(); var70 != null; var70 = (class69) field1055.method3722()) {
                                        if (var70.field780) {
                                            var70.method3710();
                                            var70.field781.field2940 = false;
                                        }
                                    }
                                    if (Statics.field454 == 0) {
                                        field1028 = null;
                                        field1029 = null;
                                    }
                                    if (!field992) {
                                        method114();
                                    }
                                }
                                int var71 = var69.field774;
                                if (class243.method5054(var71)) {
                                    method38(Statics.field2520[var71], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2814) {
                            if (var9.field2868) {
                                if (class61.field701 >= var12 && class61.field694 >= var13 && class61.field701 < var14 && class61.field694 < var15) {
                                    for (class69 var72 = (class69) field1055.method3723(); var72 != null; var72 = (class69) field1055.method3722()) {
                                        if (var72.field780) {
                                            var72.method3710();
                                            var72.field781.field2940 = false;
                                        }
                                    }
                                    if (Statics.field454 == 0) {
                                        field1028 = null;
                                        field1029 = null;
                                    }
                                    if (!field992) {
                                        method114();
                                    }
                                }
                            } else if (var9.field2949 && class61.field701 >= var12 && class61.field694 >= var13 && class61.field701 < var14 && class61.field694 < var15) {
                                for (class69 var73 = (class69) field1055.method3723(); var73 != null; var73 = (class69) field1055.method3722()) {
                                    if (var73.field780 && var73.field781.field2916 == var73.field783) {
                                        var73.method3710();
                                    }
                                }
                            }
                            boolean var74;
                            if (class61.field701 >= var12 && class61.field694 >= var13 && class61.field701 < var14 && class61.field694 < var15) {
                                var74 = true;
                            } else {
                                var74 = false;
                            }
                            boolean var75 = false;
                            if ((class61.field702 == 1 || !Statics.field441 && class61.field702 == 4) && var74) {
                                var75 = true;
                            }
                            boolean var76 = false;
                            if ((class61.field709 == 1 || !Statics.field441 && class61.field709 == 4) && class61.field712 >= var12 && class61.field711 >= var13 && class61.field712 < var14 && class61.field711 < var15) {
                                var76 = true;
                            }
                            if (var76) {
                                method3928(var9, class61.field712 - var10, class61.field711 - var11);
                            }
                            if (var9.field2819 == 1400) {
                                Statics.field743.method5586(var24, var25, var74 & var75, var74 & var76);
                            }
                            if (field1028 != null && field1028 != var9 && var74) {
                                int var77 = method580(var9);
                                boolean var78 = (var77 >> 20 & 0x1) != 0;
                                if (var78) {
                                    field1032 = var9;
                                }
                            }
                            if (field1029 == var9) {
                                field1033 = true;
                                field1034 = var10;
                                field981 = var11;
                            }
                            if (var9.field2938) {
                                if (var74 && field1054 != 0 && var9.field2916 != null) {
                                    class69 var79 = new class69();
                                    var79.field780 = true;
                                    var79.field781 = var9;
                                    var79.field779 = field1054;
                                    var79.field783 = var9.field2916;
                                    field1055.method3716(var79);
                                }
                                if (field1028 != null || Statics.field2150 != null || field992) {
                                    var76 = false;
                                    var75 = false;
                                    var74 = false;
                                }
                                if (!var9.field2941 && var76) {
                                    var9.field2941 = true;
                                    if (var9.field2828 != null) {
                                        class69 var80 = new class69();
                                        var80.field780 = true;
                                        var80.field781 = var9;
                                        var80.field784 = class61.field712 - var10;
                                        var80.field779 = class61.field711 - var11;
                                        var80.field783 = var9.field2828;
                                        field1055.method3716(var80);
                                    }
                                }
                                if (var9.field2941 && var75 && var9.field2834 != null) {
                                    class69 var81 = new class69();
                                    var81.field780 = true;
                                    var81.field781 = var9;
                                    var81.field784 = class61.field701 - var10;
                                    var81.field779 = class61.field694 - var11;
                                    var81.field783 = var9.field2834;
                                    field1055.method3716(var81);
                                }
                                if (var9.field2941 && !var75) {
                                    var9.field2941 = false;
                                    if (var9.field2899 != null) {
                                        class69 var82 = new class69();
                                        var82.field780 = true;
                                        var82.field781 = var9;
                                        var82.field784 = class61.field701 - var10;
                                        var82.field779 = class61.field694 - var11;
                                        var82.field783 = var9.field2899;
                                        field1130.method3716(var82);
                                    }
                                }
                                if (var75 && var9.field2900 != null) {
                                    class69 var83 = new class69();
                                    var83.field780 = true;
                                    var83.field781 = var9;
                                    var83.field784 = class61.field701 - var10;
                                    var83.field779 = class61.field694 - var11;
                                    var83.field783 = var9.field2900;
                                    field1055.method3716(var83);
                                }
                                if (!var9.field2940 && var74) {
                                    var9.field2940 = true;
                                    if (var9.field2901 != null) {
                                        class69 var84 = new class69();
                                        var84.field780 = true;
                                        var84.field781 = var9;
                                        var84.field784 = class61.field701 - var10;
                                        var84.field779 = class61.field694 - var11;
                                        var84.field783 = var9.field2901;
                                        field1055.method3716(var84);
                                    }
                                }
                                if (var9.field2940 && var74 && var9.field2845 != null) {
                                    class69 var85 = new class69();
                                    var85.field780 = true;
                                    var85.field781 = var9;
                                    var85.field784 = class61.field701 - var10;
                                    var85.field779 = class61.field694 - var11;
                                    var85.field783 = var9.field2845;
                                    field1055.method3716(var85);
                                }
                                if (var9.field2940 && !var74) {
                                    var9.field2940 = false;
                                    if (var9.field2903 != null) {
                                        class69 var86 = new class69();
                                        var86.field780 = true;
                                        var86.field781 = var9;
                                        var86.field784 = class61.field701 - var10;
                                        var86.field779 = class61.field694 - var11;
                                        var86.field783 = var9.field2903;
                                        field1130.method3716(var86);
                                    }
                                }
                                if (var9.field2860 != null) {
                                    class69 var87 = new class69();
                                    var87.field781 = var9;
                                    var87.field783 = var9.field2860;
                                    field971.method3716(var87);
                                }
                                if (var9.field2908 != null && field1043 > var9.field2943) {
                                    if (var9.field2909 == null || field1043 - var9.field2943 > 32) {
                                        class69 var92 = new class69();
                                        var92.field781 = var9;
                                        var92.field783 = var9.field2908;
                                        field1055.method3716(var92);
                                    } else {
                                        label739: for (int var88 = var9.field2943; var88 < field1043; var88++) {
                                            int var89 = field989[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2909.length; var90++) {
                                                if (var9.field2909[var90] == var89) {
                                                    class69 var91 = new class69();
                                                    var91.field781 = var9;
                                                    var91.field783 = var9.field2908;
                                                    field1055.method3716(var91);
                                                    break label739;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2943 = field1043;
                                }
                                if (var9.field2871 != null && field1120 > var9.field2933) {
                                    if (var9.field2862 == null || field1120 - var9.field2933 > 32) {
                                        class69 var97 = new class69();
                                        var97.field781 = var9;
                                        var97.field783 = var9.field2871;
                                        field1055.method3716(var97);
                                    } else {
                                        label715: for (int var93 = var9.field2933; var93 < field1120; var93++) {
                                            int var94 = field1044[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var9.field2862.length; var95++) {
                                                if (var9.field2862[var95] == var94) {
                                                    class69 var96 = new class69();
                                                    var96.field781 = var9;
                                                    var96.field783 = var9.field2871;
                                                    field1055.method3716(var96);
                                                    break label715;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2933 = field1120;
                                }
                                if (var9.field2912 != null && field1047 > var9.field2945) {
                                    if (var9.field2913 == null || field1047 - var9.field2945 > 32) {
                                        class69 var102 = new class69();
                                        var102.field781 = var9;
                                        var102.field783 = var9.field2912;
                                        field1055.method3716(var102);
                                    } else {
                                        label691: for (int var98 = var9.field2945; var98 < field1047; var98++) {
                                            int var99 = field1046[var98 & 0x1F];
                                            for (int var100 = 0; var100 < var9.field2913.length; var100++) {
                                                if (var9.field2913[var100] == var99) {
                                                    class69 var101 = new class69();
                                                    var101.field781 = var9;
                                                    var101.field783 = var9.field2912;
                                                    field1055.method3716(var101);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2945 = field1047;
                                }
                                if (field1052 > var9.field2817 && var9.field2917 != null) {
                                    class69 var103 = new class69();
                                    var103.field781 = var9;
                                    var103.field783 = var9.field2917;
                                    field1055.method3716(var103);
                                }
                                if (field1049 > var9.field2817 && var9.field2831 != null) {
                                    class69 var104 = new class69();
                                    var104.field781 = var9;
                                    var104.field783 = var9.field2831;
                                    field1055.method3716(var104);
                                }
                                if (field1050 > var9.field2817 && var9.field2920 != null) {
                                    class69 var105 = new class69();
                                    var105.field781 = var9;
                                    var105.field783 = var9.field2920;
                                    field1055.method3716(var105);
                                }
                                if (field1009 > var9.field2817 && var9.field2925 != null) {
                                    class69 var106 = new class69();
                                    var106.field781 = var9;
                                    var106.field783 = var9.field2925;
                                    field1055.method3716(var106);
                                }
                                if (field880 > var9.field2817 && var9.field2926 != null) {
                                    class69 var107 = new class69();
                                    var107.field781 = var9;
                                    var107.field783 = var9.field2926;
                                    field1055.method3716(var107);
                                }
                                if (field1053 > var9.field2817 && var9.field2861 != null) {
                                    class69 var108 = new class69();
                                    var108.field781 = var9;
                                    var108.field783 = var9.field2861;
                                    field1055.method3716(var108);
                                }
                                var9.field2817 = field1041;
                                if (var9.field2919 != null) {
                                    for (int var109 = 0; var109 < field1077; var109++) {
                                        class69 var110 = new class69();
                                        var110.field781 = var9;
                                        var110.field786 = field950[var109];
                                        var110.field787 = field1078[var109];
                                        var110.field783 = var9.field2919;
                                        field1055.method3716(var110);
                                    }
                                }
                            }
                        }
                        if (!var9.field2814 && field1028 == null && Statics.field2150 == null && !field992) {
                            if ((var9.field2937 >= 0 || var9.field2842 != 0) && class61.field701 >= var12 && class61.field694 >= var13 && class61.field701 < var14 && class61.field694 < var15) {
                                if (var9.field2937 >= 0) {
                                    Statics.field2776 = arg0[var9.field2937];
                                } else {
                                    Statics.field2776 = var9;
                                }
                            }
                            if (var9.field2851 == 8 && class61.field701 >= var12 && class61.field694 >= var13 && class61.field701 < var14 && class61.field694 < var15) {
                                Statics.field332 = var9;
                            }
                            if (var9.field2839 > var9.field2888) {
                                int var111 = var9.field2827 + var10;
                                int var112 = var9.field2888;
                                int var113 = var9.field2839;
                                int var114 = class61.field701;
                                int var115 = class61.field694;
                                if (field928) {
                                    field1065 = 32;
                                } else {
                                    field1065 = 0;
                                }
                                field928 = false;
                                if (class61.field702 == 1 || !Statics.field441 && class61.field702 == 4) {
                                    if (var114 >= var111 && var114 < var111 + 16 && var115 >= var11 && var115 < var11 + 16) {
                                        var9.field2837 -= 4;
                                        method260(var9);
                                    } else if (var114 >= var111 && var114 < var111 + 16 && var115 >= var11 + var112 - 16 && var115 < var11 + var112) {
                                        var9.field2837 += 4;
                                        method260(var9);
                                    } else if (var114 >= var111 - field1065 && var114 < field1065 + var111 + 16 && var115 >= var11 + 16 && var115 < var11 + var112 - 16) {
                                        int var116 = (var112 - 32) * var112 / var113;
                                        if (var116 < 8) {
                                            var116 = 8;
                                        }
                                        int var117 = var115 - var11 - 16 - var116 / 2;
                                        int var118 = var112 - 32 - var116;
                                        var9.field2837 = (var113 - var112) * var117 / var118;
                                        method260(var9);
                                        field928 = true;
                                    }
                                }
                                if (field1054 != 0) {
                                    int var119 = var9.field2827;
                                    if (var114 >= var111 - var119 && var115 >= var11 && var114 < var111 + 16 && var115 <= var11 + var112) {
                                        var9.field2837 += field1054 * 45;
                                        method260(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gs.ju(IIB)V")
    public static final void method3206(int arg0, int arg1) {
        if (class243.method5054(arg0)) {
            method4170(Statics.field2520[arg0], arg1);
        }
    }

    @ObfuscatedName("iy.jg([Lib;IB)V")
    public static final void method4170(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2851 == 0) {
                    if (var3.field2939 != null) {
                        method4170(var3.field2939, arg1);
                    }
                    class68 var4 = (class68) field1018.method3677((long) var3.field2815);
                    if (var4 != null) {
                        method3206(var4.field774, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2922 != null) {
                    class69 var5 = new class69();
                    var5.field781 = var3;
                    var5.field783 = var3.field2922;
                    class82.method3463(var5);
                }
                if (arg1 == 1 && var3.field2923 != null) {
                    if (var3.field2816 >= 0) {
                        class243 var6 = class243.method3(var3.field2815);
                        if (var6 == null || var6.field2939 == null || var3.field2816 >= var6.field2939.length || var6.field2939[var3.field2816] != var3) {
                            continue;
                        }
                    }
                    class69 var7 = new class69();
                    var7.field781 = var3;
                    var7.field783 = var3.field2923;
                    class82.method3463(var7);
                }
            }
        }
    }

    @ObfuscatedName("hu.jx(Lib;IIB)V")
    public static final void method3928(class243 arg0, int arg1, int arg2) {
        if (field1028 != null || field992 || arg0 == null) {
            return;
        }
        class243 var3 = Statics.method1893(arg0);
        if (var3 == null) {
            var3 = arg0.field2914;
        }
        if (var3 == null) {
            return;
        }
        field1028 = arg0;
        class243 var5 = Statics.method1893(arg0);
        if (var5 == null) {
            var5 = arg0.field2914;
        }
        field1029 = var5;
        field1030 = arg1;
        field1031 = arg2;
        Statics.field454 = 0;
        field1039 = false;
        int var7 = method484();
        if (var7 != -1) {
            method58(var7);
        }
        return;
    }

    @ObfuscatedName("client.jt(I)V")
    public final void method1224() {
        method260(field1028);
        Statics.field454++;
        if (field878 && field1033) {
            int var1 = class61.field701;
            int var2 = class61.field694;
            int var3 = var1 - field1030;
            int var4 = var2 - field1031;
            if (var3 < field1034) {
                var3 = field1034;
            }
            if (field1028.field2827 + var3 > field1034 + field1029.field2827) {
                var3 = field1034 + field1029.field2827 - field1028.field2827;
            }
            if (var4 < field981) {
                var4 = field981;
            }
            if (field1028.field2888 + var4 > field981 + field1029.field2888) {
                var4 = field981 + field1029.field2888 - field1028.field2888;
            }
            int var5 = var3 - field1125;
            int var6 = var4 - field1038;
            int var7 = field1028.field2891;
            if (Statics.field454 > field1028.field2892 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1039 = true;
            }
            int var8 = field1029.field2836 + (var3 - field1034);
            int var9 = field1029.field2837 + (var4 - field981);
            if (field1028.field2904 != null && field1039) {
                class69 var10 = new class69();
                var10.field781 = field1028;
                var10.field784 = var8;
                var10.field779 = var9;
                var10.field783 = field1028.field2904;
                class82.method3463(var10);
            }
            if (class61.field702 == 0) {
                if (field1039) {
                    if (field1028.field2905 != null) {
                        class69 var11 = new class69();
                        var11.field781 = field1028;
                        var11.field784 = var8;
                        var11.field779 = var9;
                        var11.field785 = field1032;
                        var11.field783 = field1028.field2905;
                        class82.method3463(var11);
                    }
                    if (field1032 != null && Statics.method1893(field1028) != null) {
                        class185 var12 = class185.method2860(class182.field2445, field903.field1476);
                        var12.field2501.method3212(field1028.field2815);
                        var12.field2501.method3210(field1028.field2816);
                        var12.field2501.method3210(field1032.field2816);
                        var12.field2501.method3269(field1032.field2815);
                        var12.field2501.method3210(field1032.field2935);
                        var12.field2501.method3354(field1028.field2935);
                        field903.method1884(var12);
                    }
                } else if (this.method1102()) {
                    this.method1241(field1125 + field1030, field1038 + field1031);
                } else if (field993 > 0) {
                    int var13 = field1125 + field1030;
                    int var14 = field1038 + field1031;
                    class88 var15 = Statics.field1466;
                    method3120(var15.field1319, var15.field1320, var15.field1321, var15.field1322, var15.field1324, var15.field1324, var13, var14);
                    Statics.field1466 = null;
                }
                field1028 = null;
            }
        } else if (Statics.field454 > 1) {
            field1028 = null;
        }
    }

    @ObfuscatedName("a.jo(II)V")
    public static void method58(int arg0) {
        Statics.field1466 = new class88();
        Statics.field1466.field1319 = field994[arg0];
        Statics.field1466.field1320 = field995[arg0];
        Statics.field1466.field1321 = field872[arg0];
        Statics.field1466.field1322 = field997[arg0];
        Statics.field1466.field1324 = field998[arg0];
    }

    @ObfuscatedName("ab.jw(Lib;I)V")
    public static void method260(class243 arg0) {
        if (field1060 == arg0.field2947) {
            field1061[arg0.field2946] = true;
        }
    }

    @ObfuscatedName("ab.jz(I)V")
    public static void method264() {
        for (class68 var0 = (class68) field1018.method3658(); var0 != null; var0 = (class68) field1018.method3661()) {
            int var1 = var0.field774;
            if (class243.method5054(var1)) {
                boolean var2 = true;
                class243[] var3 = Statics.field2520[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2814;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2645;
                    class243 var6 = class243.method3(var5);
                    if (var6 != null) {
                        method260(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iy.jy(II)V")
    public static final void method4168(int arg0) {
        if (!class243.method5054(arg0)) {
            return;
        }
        class243[] var1 = Statics.field2520[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3 != null) {
                var3.field2838 = 0;
                var3.field2807 = 0;
            }
        }
    }

    @ObfuscatedName("fd.ji(IB)V")
    public static final void method3128(int arg0) {
        if (class243.method5054(arg0)) {
            method12(Statics.field2520[arg0], -1);
        }
    }

    @ObfuscatedName("k.jn([Lib;II)V")
    public static final void method12(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null && var3.field2886 == arg1 && (!var3.field2814 || !method2953(var3))) {
                if (var3.field2851 == 0) {
                    if (!var3.field2814 && method2953(var3) && Statics.field2776 != var3) {
                        continue;
                    }
                    method12(arg0, var3.field2815);
                    if (var3.field2939 != null) {
                        method12(var3.field2939, var3.field2815);
                    }
                    class68 var4 = (class68) field1018.method3677((long) var3.field2815);
                    if (var4 != null) {
                        method3128(var4.field774);
                    }
                }
                if (var3.field2851 == 6) {
                    if (var3.field2832 != -1 || var3.field2863 != -1) {
                        boolean var5 = method3007(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2863;
                        } else {
                            var6 = var3.field2832;
                        }
                        if (var6 != -1) {
                            class288 var7 = class288.method3535(var6);
                            var3.field2807 += field894;
                            while (var3.field2807 > var7.field3764[var3.field2838]) {
                                var3.field2807 -= var7.field3764[var3.field2838];
                                var3.field2838++;
                                if (var3.field2838 >= var7.field3751.length) {
                                    var3.field2838 -= var7.field3755;
                                    if (var3.field2838 < 0 || var3.field2838 >= var7.field3751.length) {
                                        var3.field2838 = 0;
                                    }
                                }
                                method260(var3);
                            }
                        }
                    }
                    if (var3.field2907 != 0 && !var3.field2814) {
                        int var8 = var3.field2907 >> 16;
                        int var9 = var3.field2907 << 16 >> 16;
                        int var10 = field894 * var8;
                        int var11 = field894 * var9;
                        var3.field2866 = var3.field2866 + var10 & 0x7FF;
                        var3.field2867 = var3.field2867 + var11 & 0x7FF;
                        method260(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cr.jf(II)V")
    public static final void method1800(int arg0) {
        method264();
        class81.method2925();
        int var1 = class269.method4186(arg0).field3445;
        if (var1 == 0) {
            return;
        }
        int var2 = class238.field2771[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class135.method2585(0.9D);
                ((class124) Statics.field1945).method2362(0.9D);
            }
            if (var2 == 2) {
                class135.method2585(0.8D);
                ((class124) Statics.field1945).method2362(0.8D);
            }
            if (var2 == 3) {
                class135.method2585(0.7D);
                ((class124) Statics.field1945).method2362(0.7D);
            }
            if (var2 == 4) {
                class135.method2585(0.6D);
                ((class124) Statics.field1945).method2362(0.6D);
            }
            class284.method2911();
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
            if (field1045 != var3) {
                if (field1045 == 0 && field1090 != -1) {
                    class230.method1857(Statics.field13, field1090, 0, var3, false);
                    field1091 = false;
                } else if (var3 == 0) {
                    Statics.field2680.method3836();
                    class230.field2681 = 1;
                    Statics.field715 = null;
                    field1091 = false;
                } else {
                    class230.method1858(var3);
                }
                field1045 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field1092 = 127;
            }
            if (var2 == 1) {
                field1092 = 96;
            }
            if (var2 == 2) {
                field1092 = 64;
            }
            if (var2 == 3) {
                field1092 = 32;
            }
            if (var2 == 4) {
                field1092 = 0;
            }
        }
        if (var1 == 5) {
            field885 = var2;
        }
        if (var1 == 6) {
            field1019 = var2;
        }
        if (var1 == 9) {
            field1020 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1035 = 127;
            }
            if (var2 == 1) {
                field1035 = 96;
            }
            if (var2 == 2) {
                field1035 = 64;
            }
            if (var2 == 3) {
                field1035 = 32;
            }
            if (var2 == 4) {
                field1035 = 0;
            }
        }
        if (var1 == 17) {
            field1056 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field883 = (class90) class190.method578(class90.method3076(), var2);
            if (field883 == null) {
                field883 = class90.field1337;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field983 = -1;
            } else {
                field983 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field884 = (class90) class190.method578(class90.method3076(), var2);
            if (field884 == null) {
                field884 = class90.field1337;
            }
        }
    }

    @ObfuscatedName("gg.jj(Lib;I)V")
    public static final void method3143(class243 arg0) {
        int var1 = arg0.field2819;
        if (var1 == 324) {
            if (field1073 == -1) {
                field1073 = arg0.field2894;
                field925 = arg0.field2856;
            }
            if (field1119.field2783) {
                arg0.field2894 = field1073;
            } else {
                arg0.field2894 = field925;
            }
        } else if (var1 == 325) {
            if (field1073 == -1) {
                field1073 = arg0.field2894;
                field925 = arg0.field2856;
            }
            if (field1119.field2783) {
                arg0.field2894 = field925;
            } else {
                arg0.field2894 = field1073;
            }
        } else if (var1 == 327) {
            arg0.field2866 = 150;
            arg0.field2867 = (int) (Math.sin((double) field867 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2858 = 5;
            arg0.field2924 = 0;
        } else if (var1 == 328) {
            arg0.field2866 = 150;
            arg0.field2867 = (int) (Math.sin((double) field867 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2858 = 5;
            arg0.field2924 = 1;
        }
    }

    @ObfuscatedName("ad.jh(Lbs;ZI)V")
    public static final void method576(class68 arg0, boolean arg1) {
        int var2 = arg0.field774;
        int var3 = (int) arg0.field2645;
        arg0.method3710();
        if (arg1 && var2 != -1 && Statics.field3914[var2]) {
            Statics.field296.method4205(var2);
            if (Statics.field2520[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2520[var2].length; var5++) {
                    if (Statics.field2520[var2][var5] != null) {
                        if (Statics.field2520[var2][var5].field2851 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2520[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2520[var2] = null;
                }
                Statics.field3914[var2] = false;
            }
        }
        method4003(var2);
        class243 var6 = class243.method3(var3);
        if (var6 != null) {
            method260(var6);
        }
        method56();
        if (field1017 != -1) {
            method3206(field1017, 1);
        }
    }

    @ObfuscatedName("if.jl(Lib;B)Z")
    public static final boolean method4091(class243 arg0) {
        int var1 = arg0.field2819;
        if (var1 == 205) {
            field904 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1119.method4063(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1119.method4064(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1119.method4065(false);
        }
        if (var1 == 325) {
            field1119.method4065(true);
        }
        if (var1 == 326) {
            class185 var6 = class185.method2860(class182.field2464, field903.field1476);
            field1119.method4066(var6.field2501);
            field903.method1884(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.jk(Lib;IIII)V")
    public static final void method255(class243 arg0, int arg1, int arg2, int arg3) {
        method348();
        class237 var4 = arg0.method4129(false);
        if (var4 == null) {
            return;
        }
        class328.method5315(arg1, arg2, var4.field2766 + arg1, var4.field2764 + arg2);
        if (field1088 == 2 || field1088 == 5) {
            class328.method5341(arg1, arg2, 0, var4.field2767, var4.field2769);
        } else {
            int var5 = field926 & 0x7FF;
            int var6 = Statics.field260.field1186 / 32 + 48;
            int var7 = 464 - Statics.field260.field1210 / 32;
            Statics.field2372.method5459(arg1, arg2, var4.field2766, var4.field2764, var6, var7, var5, 256, var4.field2767, var4.field2769);
            for (int var8 = 0; var8 < field1082; var8++) {
                int var9 = field1083[var8] * 4 + 2 - Statics.field260.field1186 / 32;
                int var10 = field1084[var8] * 4 + 2 - Statics.field260.field1210 / 32;
                method9(arg1, arg2, var9, var10, field1085[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class218 var13 = field984[Statics.field2770][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field260.field1186 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field260.field1210 / 32;
                        method9(arg1, arg2, var14, var15, Statics.field1967[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field899; var16++) {
                class85 var17 = field898[field900[var16]];
                if (var17 != null && var17.method1052()) {
                    class286 var18 = var17.field1301;
                    if (var18 != null && var18.field3719 != null) {
                        var18 = var18.method4760();
                    }
                    if (var18 != null && var18.field3718 && var18.field3730) {
                        int var19 = var17.field1186 / 32 - Statics.field260.field1186 / 32;
                        int var20 = var17.field1210 / 32 - Statics.field260.field1210 / 32;
                        method9(arg1, arg2, var19, var20, Statics.field1967[1], var4);
                    }
                }
            }
            int var21 = class94.field1415;
            int[] var22 = class94.field1416;
            for (int var23 = 0; var23 < var21; var23++) {
                class73 var24 = field972[var22[var23]];
                if (var24 != null && var24.method1052() && !var24.field837 && Statics.field260 != var24) {
                    int var25 = var24.field1186 / 32 - Statics.field260.field1186 / 32;
                    int var26 = var24.field1210 / 32 - Statics.field260.field1210 / 32;
                    boolean var27 = false;
                    if (Statics.field260.field841 != 0 && var24.field841 != 0 && Statics.field260.field841 == var24.field841) {
                        var27 = true;
                    }
                    if (var24.method1036()) {
                        method9(arg1, arg2, var25, var26, Statics.field1967[3], var4);
                    } else if (var27) {
                        method9(arg1, arg2, var25, var26, Statics.field1967[4], var4);
                    } else if (var24.method1039()) {
                        method9(arg1, arg2, var25, var26, Statics.field1967[5], var4);
                    } else {
                        method9(arg1, arg2, var25, var26, Statics.field1967[2], var4);
                    }
                }
            }
            if (field875 != 0 && field867 % 20 < 10) {
                if (field875 == 1 && field876 >= 0 && field876 < field898.length) {
                    class85 var28 = field898[field876];
                    if (var28 != null) {
                        int var29 = var28.field1186 / 32 - Statics.field260.field1186 / 32;
                        int var30 = var28.field1210 / 32 - Statics.field260.field1210 / 32;
                        method3004(arg1, arg2, var29, var30, Statics.field749[1], var4);
                    }
                }
                if (field875 == 2) {
                    int var31 = field1079 * 4 - Statics.field2499 * 4 + 2 - Statics.field260.field1186 / 32;
                    int var32 = field879 * 4 - Statics.field29 * 4 + 2 - Statics.field260.field1210 / 32;
                    method3004(arg1, arg2, var31, var32, Statics.field749[1], var4);
                }
                if (field875 == 10 && field1037 >= 0 && field1037 < field972.length) {
                    class73 var33 = field972[field1037];
                    if (var33 != null) {
                        int var34 = var33.field1186 / 32 - Statics.field260.field1186 / 32;
                        int var35 = var33.field1210 / 32 - Statics.field260.field1210 / 32;
                        method3004(arg1, arg2, var34, var35, Statics.field749[1], var4);
                    }
                }
            }
            if (field1086 != 0) {
                int var36 = field1086 * 4 + 2 - Statics.field260.field1186 / 32;
                int var37 = field1006 * 4 + 2 - Statics.field260.field1210 / 32;
                method9(arg1, arg2, var36, var37, Statics.field749[0], var4);
            }
            if (!Statics.field260.field837) {
                class328.method5392(var4.field2766 / 2 + arg1 - 1, var4.field2764 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1062[arg3] = true;
    }

    @ObfuscatedName("bc.kv(Lib;IIII)V")
    public static final void method963(class243 arg0, int arg1, int arg2, int arg3) {
        class237 var4 = arg0.method4129(false);
        if (var4 == null) {
            return;
        }
        if (field1088 < 3) {
            Statics.field797.method5459(arg1, arg2, var4.field2766, var4.field2764, 25, 25, field926, 256, var4.field2767, var4.field2769);
        } else {
            class328.method5341(arg1, arg2, 0, var4.field2767, var4.field2769);
        }
    }

    @ObfuscatedName("fl.kn(IIIILla;Lir;I)V")
    public static final void method3004(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method9(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field926 & 0x7FF;
        int var8 = class135.field1956[var7];
        int var9 = class135.field1934[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2766 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field448.method5460(arg5.field2766 / 2 + arg0 - var17 / 2 + var15, arg5.field2764 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("k.kl(IIIILla;Lir;I)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field926 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class135.field1956[var6];
        int var9 = class135.field1934[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5458(arg5.field2766 / 2 + var10 - arg4.field3983 / 2, arg5.field2764 / 2 - var11 - arg4.field3985 / 2, arg0, arg1, arg5.field2766, arg5.field2764, arg5.field2767, arg5.field2769);
        } else {
            arg4.method5438(arg5.field2766 / 2 + arg0 + var10 - arg4.field3983 / 2, arg5.field2764 / 2 + arg1 - var11 - arg4.field3985 / 2);
        }
    }

    @ObfuscatedName("gv.kk(I)V")
    public static final void method3193() {
        for (int var0 = 0; var0 < class94.field1415; var0++) {
            class73 var1 = field972[class94.field1416[var0]];
            var1.method1061();
        }
        class96.method719();
        if (Statics.field444 != null) {
            Statics.field444.method5063();
        }
    }

    @ObfuscatedName("ak.km(I)V")
    public static final void method267() {
        for (int var0 = 0; var0 < class94.field1415; var0++) {
            class73 var1 = field972[class94.field1416[var0]];
            var1.method1040();
        }
    }

    @ObfuscatedName("gj.kf(I)V")
    public static final void method3539() {
        class185 var0 = class185.method2860(class182.field2418, field903.field1476);
        var0.field2501.method3209(0);
        field903.method1884(var0);
    }

    @ObfuscatedName("hp.ky(II)V")
    public static void method4003(int arg0) {
        for (class224 var1 = (class224) field987.method3658(); var1 != null; var1 = (class224) field987.method3661()) {
            if ((var1.field2645 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3710();
            }
        }
    }

    @ObfuscatedName("at.ka(Lib;I)I")
    public static int method580(class243 arg0) {
        class224 var1 = (class224) field987.method3677(((long) arg0.field2815 << 32) + (long) arg0.field2816);
        return var1 == null ? arg0.field2887 : var1.field2660;
    }

    @ObfuscatedName("fh.ku(Lib;I)Z")
    public static boolean method2953(class243 arg0) {
        return arg0.field2835;
    }

    @ObfuscatedName("ae.ks(Lib;IS)Ljava/lang/String;")
    public static String method493(class243 arg0, int arg1) {
        int var2 = method580(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2915 == null) {
            return null;
        } else if (arg0.field2889 == null || arg0.field2889.length <= arg1 || arg0.field2889[arg1] == null || arg0.field2889[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2889[arg1];
        }
    }

    @ObfuscatedName("e.kb(Ljava/lang/String;ZI)V")
    public static void method65(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field320; var5++) {
            class284 var6 = class284.method2869(var5);
            if ((!arg1 || var6.field3652) && var6.field3677 == -1 && var6.field3645.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1790 = -1;
                    Statics.field341 = null;
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
        Statics.field341 = var3;
        Statics.field1244 = 0;
        Statics.field1790 = var4;
        String[] var9 = new String[Statics.field1790];
        for (int var10 = 0; var10 < Statics.field1790; var10++) {
            var9[var10] = class284.method2869(var3[var10]).field3645;
        }
        class192.method3052(var9, Statics.field341);
    }

    @ObfuscatedName("fj.kx([BII)V")
    public static void method3012(byte[] arg0, int arg1) {
        if (field897 == null) {
            field897 = new byte[24];
        }
        class206.method3541(arg0, arg1, field897, 0, 24);
    }

    @ObfuscatedName("gp.ke(Lgp;I)V")
    public static void method3433(class195 arg0) {
        if (field897 == null) {
            byte[] var1 = class168.method342();
            arg0.method3267(var1, 0, var1.length);
        } else {
            arg0.method3267(field897, 0, field897.length);
        }
    }

    @ObfuscatedName("client.kc(B)Lko;")
    public class306 method1107() {
        return Statics.field260 == null ? null : Statics.field260.field824;
    }

    @ObfuscatedName("b.kj(IIIZI)V")
    public static void method115(int arg0, int arg1, int arg2, boolean arg3) {
        class185 var4 = class185.method2860(class182.field2374, field903.field1476);
        var4.field2501.method3376(arg3 ? field1010 : 0);
        var4.field2501.method3250(arg2);
        var4.field2501.method3260(arg1);
        var4.field2501.method3260(arg0);
        field903.method1884(var4);
    }

    @ObfuscatedName("ih.kz(B)Z")
    public static boolean method4031() {
        return field1024 >= 2;
    }

    @ObfuscatedName("a.ko(II)V")
    public static void method57(int arg0) {
        field931 = arg0;
    }

    @ObfuscatedName("em.kt(B)V")
    public static void method2858() {
        field903.method1884(class185.method2860(class182.field2381, field903.field1476));
        field931 = 0;
    }

    @ObfuscatedName("aj.ki(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method665(String arg0) {
        class257[] var1 = class257.method7();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class257 var3 = var1[var2];
            if (var3.field3335 != -1 && arg0.startsWith(class87.method176(var3.field3335))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3335).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ao.kr(B)V")
    public static void method480() {
        if (Statics.field1133 == null) {
            return;
        }
        field973 = field867;
        Statics.field1133.method4340();
        for (int var0 = 0; var0 < field972.length; var0++) {
            if (field972[var0] != null) {
                Statics.field1133.method4339((field972[var0].field1186 >> 7) + Statics.field2499, (field972[var0].field1210 >> 7) + Statics.field29);
            }
        }
    }
}

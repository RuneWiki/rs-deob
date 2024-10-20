package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class162[] field955 = new class162[4];

    @ObfuscatedName("client.aj")
    public static boolean field959 = true;

    @ObfuscatedName("client.bz")
    public static int field893 = 1;

    @ObfuscatedName("client.bi")
    public static int field961 = 0;

    @ObfuscatedName("client.bq")
    public static int field895 = 0;

    @ObfuscatedName("client.bh")
    public static boolean field892 = false;

    @ObfuscatedName("client.bx")
    public static boolean field898 = false;

    @ObfuscatedName("client.bn")
    public static int field899 = 0;

    @ObfuscatedName("client.br")
    public static int field900 = 0;

    @ObfuscatedName("client.bt")
    public static boolean field901 = true;

    @ObfuscatedName("client.bp")
    public static int field902 = 0;

    @ObfuscatedName("client.ba")
    public static long field1025 = 1L;

    @ObfuscatedName("client.bm")
    public static int field968 = -1;

    @ObfuscatedName("client.bb")
    public static int field988 = -1;

    @ObfuscatedName("client.bj")
    public static int field906 = -1;

    @ObfuscatedName("client.bk")
    public static boolean field917 = true;

    @ObfuscatedName("client.bg")
    public static boolean field945 = false;

    @ObfuscatedName("client.bo")
    public static int field909 = 0;

    @ObfuscatedName("client.be")
    public static int field1116 = 0;

    @ObfuscatedName("client.by")
    public static int field911 = 0;

    @ObfuscatedName("client.cj")
    public static int field912 = 0;

    @ObfuscatedName("client.cl")
    public static int field1149 = 0;

    @ObfuscatedName("client.cc")
    public static int field1002 = 0;

    @ObfuscatedName("client.ci")
    public static int field1127 = 0;

    @ObfuscatedName("client.cu")
    public static int field916 = 0;

    @ObfuscatedName("client.cg")
    public static int field1010 = 0;

    @ObfuscatedName("client.cf")
    public static class92 field1118 = class92.field1394;

    @ObfuscatedName("client.cm")
    public static class92 field919 = class92.field1394;

    @ObfuscatedName("client.cy")
    public static int field1042 = 0;

    @ObfuscatedName("client.cb")
    public static int field922 = 0;

    @ObfuscatedName("client.co")
    public static int field923 = 0;

    @ObfuscatedName("client.dt")
    public static int field926 = 0;

    @ObfuscatedName("client.dl")
    public static int field1024 = 0;

    @ObfuscatedName("client.dp")
    public static int field1059 = 0;

    @ObfuscatedName("client.do")
    public static int field929 = 0;

    @ObfuscatedName("client.df")
    public static int field930 = 0;

    @ObfuscatedName("client.dc")
    public static byte[] field931 = null;

    @ObfuscatedName("client.dx")
    public static class87[] field932 = new class87[32768];

    @ObfuscatedName("client.dk")
    public static int field933 = 0;

    @ObfuscatedName("client.dj")
    public static int[] field934 = new int[32768];

    @ObfuscatedName("client.ds")
    public static int field1123 = 0;

    @ObfuscatedName("client.ed")
    public static int[] field936 = new int[250];

    @ObfuscatedName("client.ek")
    public static class180 field937 = new class180(5000);

    @ObfuscatedName("client.ea")
    public static class180 field938 = new class180(5000);

    @ObfuscatedName("client.ex")
    public static class180 field939 = new class180(15000);

    @ObfuscatedName("client.eq")
    public static int field1067 = 0;

    @ObfuscatedName("client.ef")
    public static int field941 = 0;

    @ObfuscatedName("client.ee")
    public static int field942 = 0;

    @ObfuscatedName("client.ep")
    public static int field1030 = 0;

    @ObfuscatedName("client.ew")
    public static int field1023 = 0;

    @ObfuscatedName("client.es")
    public static int field1013 = 0;

    @ObfuscatedName("client.en")
    public static int field946 = 0;

    @ObfuscatedName("client.ej")
    public static int field947 = 0;

    @ObfuscatedName("client.eo")
    public static boolean field1055 = false;

    @ObfuscatedName("client.el")
    public static HashMap field949 = new HashMap();

    @ObfuscatedName("client.ff")
    public static int field950 = 0;

    @ObfuscatedName("client.fz")
    public static int field951 = 1;

    @ObfuscatedName("client.fv")
    public static int field952 = 0;

    @ObfuscatedName("client.fl")
    public static int field953 = 1;

    @ObfuscatedName("client.fp")
    public static int field954 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field1051 = false;

    @ObfuscatedName("client.ft")
    public static int[][][] field957 = new int[4][13][13];

    @ObfuscatedName("client.fj")
    public static final int[] field958 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fd")
    public static int field1079 = 0;

    @ObfuscatedName("client.gl")
    public static int field960 = 2301979;

    @ObfuscatedName("client.gp")
    public static int field910 = 5063219;

    @ObfuscatedName("client.gg")
    public static int field962 = 3353893;

    @ObfuscatedName("client.gx")
    public static int field963 = 7759444;

    @ObfuscatedName("client.gt")
    public static boolean field964 = false;

    @ObfuscatedName("client.gm")
    public static int field965 = 0;

    @ObfuscatedName("client.gy")
    public static int field978 = 128;

    @ObfuscatedName("client.go")
    public static int field915 = 0;

    @ObfuscatedName("client.gu")
    public static int field969 = 0;

    @ObfuscatedName("client.gf")
    public static int field1081 = 0;

    @ObfuscatedName("client.gk")
    public static int field971 = 0;

    @ObfuscatedName("client.gv")
    public static int field992 = 0;

    @ObfuscatedName("client.gn")
    public static int field908 = 50;

    @ObfuscatedName("client.gh")
    public static int field974 = 0;

    @ObfuscatedName("client.hd")
    public static boolean field1140 = false;

    @ObfuscatedName("client.hb")
    public static int field976 = 0;

    @ObfuscatedName("client.hr")
    public static int field977 = 0;

    @ObfuscatedName("client.ha")
    public static int field935 = 50;

    @ObfuscatedName("client.hy")
    public static int[] field979 = new int[field935];

    @ObfuscatedName("client.hf")
    public static int[] field980 = new int[field935];

    @ObfuscatedName("client.ho")
    public static int[] field904 = new int[field935];

    @ObfuscatedName("client.hx")
    public static int[] field982 = new int[field935];

    @ObfuscatedName("client.hn")
    public static int[] field983 = new int[field935];

    @ObfuscatedName("client.hi")
    public static int[] field984 = new int[field935];

    @ObfuscatedName("client.hq")
    public static int[] field985 = new int[field935];

    @ObfuscatedName("client.hh")
    public static String[] field986 = new String[field935];

    @ObfuscatedName("client.hg")
    public static int[][] field987 = new int[104][104];

    @ObfuscatedName("client.hm")
    public static int field1039 = 0;

    @ObfuscatedName("client.hs")
    public static int field989 = -1;

    @ObfuscatedName("client.hv")
    public static int field990 = -1;

    @ObfuscatedName("client.ht")
    public static int field1057 = 0;

    @ObfuscatedName("client.hj")
    public static int field1085 = 0;

    @ObfuscatedName("client.hl")
    public static int field1135 = 0;

    @ObfuscatedName("client.hu")
    public static int field994 = 0;

    @ObfuscatedName("client.hk")
    public static int field995 = 0;

    @ObfuscatedName("client.hw")
    public static int field996 = 0;

    @ObfuscatedName("client.hp")
    public static int field997 = 0;

    @ObfuscatedName("client.if")
    public static int field998 = 0;

    @ObfuscatedName("client.im")
    public static int field999 = 0;

    @ObfuscatedName("client.ie")
    public static int field1000 = 0;

    @ObfuscatedName("client.ib")
    public static boolean field924 = false;

    @ObfuscatedName("client.ih")
    public static int field1048 = 0;

    @ObfuscatedName("client.is")
    public static int field1003 = 0;

    @ObfuscatedName("client.ik")
    public static class75[] field1004 = new class75[2048];

    @ObfuscatedName("client.iu")
    public static int field1005 = -1;

    @ObfuscatedName("client.ig")
    public static int field1102 = 0;

    @ObfuscatedName("client.iy")
    public static int field1007 = 0;

    @ObfuscatedName("client.il")
    public static int[] field1008 = new int[1000];

    @ObfuscatedName("client.ia")
    public static final int[] field1009 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.iw")
    public static String[] field1019 = new String[8];

    @ObfuscatedName("client.it")
    public static String field1038 = null;

    @ObfuscatedName("client.iq")
    public static boolean[] field1011 = new boolean[8];

    @ObfuscatedName("client.ic")
    public static int[] field1136 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ip")
    public static int field928 = -1;

    @ObfuscatedName("client.iv")
    public static class194[][][] field1084 = new class194[4][104][104];

    @ObfuscatedName("client.id")
    public static class194 field1015 = new class194();

    @ObfuscatedName("client.in")
    public static class194 field1016 = new class194();

    @ObfuscatedName("client.jj")
    public static class194 field1017 = new class194();

    @ObfuscatedName("client.jf")
    public static int[] field903 = new int[25];

    @ObfuscatedName("client.jy")
    public static int[] field1137 = new int[25];

    @ObfuscatedName("client.jt")
    public static int[] field1020 = new int[25];

    @ObfuscatedName("client.jz")
    public static int field1021 = 0;

    @ObfuscatedName("client.jp")
    public static boolean field1022 = false;

    @ObfuscatedName("client.jv")
    public static int field948 = 0;

    @ObfuscatedName("client.jd")
    public static int[] field905 = new int[500];

    @ObfuscatedName("client.jn")
    public static int[] field1151 = new int[500];

    @ObfuscatedName("client.jm")
    public static int[] field1026 = new int[500];

    @ObfuscatedName("client.jo")
    public static int[] field1027 = new int[500];

    @ObfuscatedName("client.jl")
    public static String[] field1028 = new String[500];

    @ObfuscatedName("client.jc")
    public static String[] field1029 = new String[500];

    @ObfuscatedName("client.jg")
    public static boolean[] field1014 = new boolean[500];

    @ObfuscatedName("client.je")
    public static boolean field1031 = false;

    @ObfuscatedName("client.jr")
    public static boolean field1032 = false;

    @ObfuscatedName("client.jq")
    public static int field1033 = -1;

    @ObfuscatedName("client.jk")
    public static int field967 = -1;

    @ObfuscatedName("client.ka")
    public static int field1088 = 0;

    @ObfuscatedName("client.kl")
    public static int field1036 = 50;

    @ObfuscatedName("client.ke")
    public static int field1037 = 0;

    @ObfuscatedName("client.kb")
    public static boolean field1147 = false;

    @ObfuscatedName("client.kd")
    public static int field1040 = -1;

    @ObfuscatedName("client.kr")
    public static int field1041 = -1;

    @ObfuscatedName("client.kf")
    public static String field973 = null;

    @ObfuscatedName("client.ki")
    public static String field1043 = null;

    @ObfuscatedName("client.kp")
    public static int field1044 = -1;

    @ObfuscatedName("client.kq")
    public static class191 field1097 = new class191(8);

    @ObfuscatedName("client.kh")
    public static int field1046 = 0;

    @ObfuscatedName("client.kg")
    public static int field1047 = 0;

    @ObfuscatedName("client.km")
    public static class217 field896 = null;

    @ObfuscatedName("client.kj")
    public static int field1155 = 0;

    @ObfuscatedName("client.kt")
    public static int field1050 = 0;

    @ObfuscatedName("client.kk")
    public static int field914 = 0;

    @ObfuscatedName("client.kx")
    public static int field1052 = -1;

    @ObfuscatedName("client.ks")
    public static boolean field1053 = false;

    @ObfuscatedName("client.kv")
    public static boolean field1121 = false;

    @ObfuscatedName("client.kc")
    public static boolean field970 = false;

    @ObfuscatedName("client.ky")
    public static class217 field1056 = null;

    @ObfuscatedName("client.ko")
    public static class217 field913 = null;

    @ObfuscatedName("client.lx")
    public static class217 field1058 = null;

    @ObfuscatedName("client.ld")
    public static int field1074 = 0;

    @ObfuscatedName("client.lg")
    public static int field1064 = 0;

    @ObfuscatedName("client.lw")
    public static class217 field1061 = null;

    @ObfuscatedName("client.lp")
    public static boolean field1062 = false;

    @ObfuscatedName("client.lm")
    public static int field1063 = -1;

    @ObfuscatedName("client.lq")
    public static int field944 = -1;

    @ObfuscatedName("client.lb")
    public static boolean field1065 = false;

    @ObfuscatedName("client.lr")
    public static int field1066 = -1;

    @ObfuscatedName("client.lz")
    public static int field943 = -1;

    @ObfuscatedName("client.lf")
    public static boolean field1068 = false;

    @ObfuscatedName("client.lv")
    public static int field1069 = 1;

    @ObfuscatedName("client.ls")
    public static int[] field1080 = new int[32];

    @ObfuscatedName("client.li")
    public static int field991 = 0;

    @ObfuscatedName("client.lk")
    public static int[] field1072 = new int[32];

    @ObfuscatedName("client.ll")
    public static int field1161 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field1143 = new int[32];

    @ObfuscatedName("client.lj")
    public static int field1075 = 0;

    @ObfuscatedName("client.le")
    public static int field1076 = 0;

    @ObfuscatedName("client.lh")
    public static int field1077 = 0;

    @ObfuscatedName("client.ml")
    public static int field1078 = 0;

    @ObfuscatedName("client.mb")
    public static int field1134 = 0;

    @ObfuscatedName("client.ms")
    public static int field993 = 0;

    @ObfuscatedName("client.mg")
    public static int field894 = 0;

    @ObfuscatedName("client.mm")
    public static int field1082 = 0;

    @ObfuscatedName("client.mk")
    public static class194 field1083 = new class194();

    @ObfuscatedName("client.me")
    public static class194 field975 = new class194();

    @ObfuscatedName("client.mr")
    public static class194 field927 = new class194();

    @ObfuscatedName("client.mn")
    public static class191 field1086 = new class191(512);

    @ObfuscatedName("client.mu")
    public static int field1087 = 0;

    @ObfuscatedName("client.mx")
    public static int field907 = -2;

    @ObfuscatedName("client.mv")
    public static boolean[] field1089 = new boolean[100];

    @ObfuscatedName("client.mo")
    public static boolean[] field972 = new boolean[100];

    @ObfuscatedName("client.mh")
    public static boolean[] field1091 = new boolean[100];

    @ObfuscatedName("client.mz")
    public static int[] field1092 = new int[100];

    @ObfuscatedName("client.mt")
    public static int[] field1093 = new int[100];

    @ObfuscatedName("client.md")
    public static int[] field1095 = new int[100];

    @ObfuscatedName("client.mj")
    public static int[] field921 = new int[100];

    @ObfuscatedName("client.mf")
    public static int field1096 = 0;

    @ObfuscatedName("client.mq")
    public static long field956 = 0L;

    @ObfuscatedName("client.mw")
    public static boolean field1098 = true;

    @ObfuscatedName("client.nh")
    public static int[] field1100 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nc")
    public static int field1101 = 0;

    @ObfuscatedName("client.nt")
    public static int field1045 = 0;

    @ObfuscatedName("client.nd")
    public static String field1103 = "";

    @ObfuscatedName("client.nm")
    public static long[] field1104 = new long[100];

    @ObfuscatedName("client.nj")
    public static int field1105 = 0;

    @ObfuscatedName("client.no")
    public static int field1034 = 0;

    @ObfuscatedName("client.nu")
    public static int[] field1107 = new int[128];

    @ObfuscatedName("client.ns")
    public static int[] field1108 = new int[128];

    @ObfuscatedName("client.nn")
    public static long field1109 = -1L;

    @ObfuscatedName("client.nw")
    public static String field1110 = null;

    @ObfuscatedName("client.nl")
    public static String field1132 = null;

    @ObfuscatedName("client.na")
    public static int field1112 = -1;

    @ObfuscatedName("client.np")
    public static int field1113 = 0;

    @ObfuscatedName("client.nz")
    public static int[] field1114 = new int[1000];

    @ObfuscatedName("client.ox")
    public static int[] field1115 = new int[1000];

    @ObfuscatedName("client.oe")
    public static class286[] field1128 = new class286[1000];

    @ObfuscatedName("client.oc")
    public static int field1117 = 0;

    @ObfuscatedName("client.of")
    public static int field1012 = 0;

    @ObfuscatedName("client.ob")
    public static int field1119 = 0;

    @ObfuscatedName("client.oj")
    public static int field1120 = 255;

    @ObfuscatedName("client.ol")
    public static int field1070 = -1;

    @ObfuscatedName("client.on")
    public static boolean field1122 = false;

    @ObfuscatedName("client.oo")
    public static int field1126 = 127;

    @ObfuscatedName("client.oz")
    public static int field1124 = 127;

    @ObfuscatedName("client.oi")
    public static int field1125 = 0;

    @ObfuscatedName("client.od")
    public static int[] field1090 = new int[50];

    @ObfuscatedName("client.og")
    public static int[] field918 = new int[50];

    @ObfuscatedName("client.ok")
    public static int[] field1106 = new int[50];

    @ObfuscatedName("client.or")
    public static int[] field1129 = new int[50];

    @ObfuscatedName("client.pw")
    public static class108[] field1130 = new class108[50];

    @ObfuscatedName("client.po")
    public static boolean field1131 = false;

    @ObfuscatedName("client.pn")
    public static boolean[] field1006 = new boolean[5];

    @ObfuscatedName("client.py")
    public static int[] field1133 = new int[5];

    @ObfuscatedName("client.pb")
    public static int[] field1049 = new int[5];

    @ObfuscatedName("client.pd")
    public static int[] field1054 = new int[5];

    @ObfuscatedName("client.pv")
    public static int[] field1094 = new int[5];

    @ObfuscatedName("client.ps")
    public static short field1071 = 256;

    @ObfuscatedName("client.pi")
    public static short field1001 = 205;

    @ObfuscatedName("client.pe")
    public static short field1139 = 256;

    @ObfuscatedName("client.pu")
    public static short field1018 = 320;

    @ObfuscatedName("client.pt")
    public static short field1141 = 1;

    @ObfuscatedName("client.pg")
    public static short field1142 = 32767;

    @ObfuscatedName("client.ph")
    public static short field1138 = 1;

    @ObfuscatedName("client.qh")
    public static short field1144 = 32767;

    @ObfuscatedName("client.qo")
    public static int field1073 = 0;

    @ObfuscatedName("client.ql")
    public static int field1146 = 0;

    @ObfuscatedName("client.qe")
    public static int field940 = 0;

    @ObfuscatedName("client.qb")
    public static int field1148 = 0;

    @ObfuscatedName("client.qu")
    public static int field1060 = 0;

    @ObfuscatedName("client.qw")
    public static int field1150 = 0;

    @ObfuscatedName("client.qt")
    public static int field1145 = 0;

    @ObfuscatedName("client.qr")
    public static class66[] field1152 = new class66[400];

    @ObfuscatedName("client.qx")
    public static class196 field1153 = new class196();

    @ObfuscatedName("client.qd")
    public static int field1154 = 0;

    @ObfuscatedName("client.qq")
    public static class71[] field897 = new class71[400];

    @ObfuscatedName("client.qa")
    public static class214 field1156 = new class214();

    @ObfuscatedName("client.qk")
    public static int field1157 = -1;

    @ObfuscatedName("client.qc")
    public static int field1158 = -1;

    @ObfuscatedName("client.qs")
    public static class17[] field1159 = new class17[8];

    @ObfuscatedName("client.re")
    public static final class74 field1160 = new class74();

    @ObfuscatedName("client.rj")
    public static int[] field920 = new int[50];

    @ObfuscatedName("client.rl")
    public static int[] field1162 = new int[50];

    @ObfuscatedName("u.ff(I)Lkl;")
    public static class289 method73() {
        return Statics.field230;
    }

    @ObfuscatedName("client.as(B)V")
    public final void method774() {
    }

    public final void init() {
        if (!this.method751()) {
            return;
        }
        class275[] var1 = new class275[] { class275.field3701, class275.field3706, class275.field3703, class275.field3709, class275.field3708, class275.field3704, class275.field3710, class275.field3714, class275.field3700, class275.field3705, class275.field3707, class275.field3711, class275.field3713, class275.field3702, class275.field3712 };
        class275[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class275 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3715);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3715)) {
                    case 1:
                        Statics.field3369 = var5;
                        break;
                    case 2:
                        class233[] var11 = new class233[] { class233.field3173, class233.field3177, class233.field3179, class233.field3180, class233.field3176, class233.field3174 };
                        Statics.field1111 = (class233) class169.method2811(var11, Integer.parseInt(var5));
                        if (Statics.field1111 == class233.field3177) {
                            Statics.field716 = class290.field3845;
                        } else {
                            Statics.field716 = class290.field3844;
                        }
                        break;
                    case 3:
                        field895 = Integer.parseInt(var5);
                    case 4:
                    case 9:
                    default:
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class89.field1358)) {
                        }
                        break;
                    case 6:
                        field961 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field795 = Integer.parseInt(var5);
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class89.field1358)) {
                            field892 = true;
                        } else {
                            field892 = false;
                        }
                        break;
                    case 10:
                        Statics.field35 = Integer.parseInt(var5);
                        break;
                    case 11:
                        int var6 = Integer.parseInt(var5);
                        class232[] var7 = class232.method113();
                        int var8 = 0;
                        class232 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class232 var9 = var7[var8];
                            if (var9.field3166 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field416 = var10;
                        break;
                    case 12:
                        field893 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field366 = var5;
                        break;
                    case 14:
                        field899 = Integer.parseInt(var5);
                }
            }
        }
        class140.field2075 = false;
        field898 = false;
        Statics.field10 = this.getCodeBase().getHost();
        String var12 = Statics.field416.field3170;
        byte var13 = 0;
        try {
            class156.method37("oldschool", var12, var13, 17);
        } catch (Exception var15) {
            class153.method158((String) null, var15);
        }
        Statics.field1458 = this;
        this.method749(765, 503, 151);
    }

    @ObfuscatedName("client.ad(I)V")
    public final void method759() {
        Statics.field3150 = field895 == 0 ? 43594 : field893 + 40000;
        Statics.field255 = field895 == 0 ? 443 : field893 + 50000;
        Statics.field660 = Statics.field3150;
        Statics.field1339 = class215.field2610;
        Statics.field2014 = class215.field2611;
        Statics.field2603 = class215.field2612;
        Statics.field34 = class215.field2614;
        this.method744();
        this.method881();
        Statics.field2537 = this.method871();
        Statics.field407 = new class161(255, class156.field2225, class156.field2229, 500000);
        Statics.field2320 = class82.method141();
        this.method784();
        String var2 = Statics.field568;
        class57.field654 = this;
        class57.field652 = var2;
        if (field895 != 0) {
            field945 = true;
        }
        method86(Statics.field2320.field1276);
    }

    @ObfuscatedName("client.ah(I)V")
    public final void method765() {
        field902++;
        this.method1322();
        while (true) {
            class194 var1 = class237.field3221;
            class234 var2;
            synchronized (class237.field3221) {
                var2 = (class234) class237.field3215.method3334();
            }
            if (var2 == null) {
                Statics.method155();
                method2362();
                class51 var4 = class51.field599;
                synchronized (class51.field599) {
                    class51.field616++;
                    class51.field613 = class51.field615;
                    class51.field612 = 0;
                    if (class51.field608 >= 0) {
                        while (class51.field608 != class51.field607) {
                            int var6 = class51.field606[class51.field607];
                            class51.field607 = class51.field607 + 1 & 0x7F;
                            if (var6 < 0) {
                                class51.field605[~var6] = false;
                            } else {
                                if (!class51.field605[var6] && class51.field612 < class51.field618.length - 1) {
                                    class51.field618[++class51.field612 - 1] = var6;
                                }
                                class51.field605[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class51.field605[var5] = false;
                        }
                        class51.field608 = class51.field607;
                    }
                    if (class51.field612 > 0) {
                        class51.field616 = 0;
                    }
                    class51.field615 = class51.field598;
                }
                class60.method4278();
                if (Statics.field2537 != null) {
                    int var8 = Statics.field2537.method633();
                    field1082 = var8;
                }
                if (field900 == 0) {
                    method3179();
                    class59.method3406();
                } else if (field900 == 5) {
                    class93.method479(this);
                    method3179();
                    class59.method3406();
                } else if (field900 == 10 || field900 == 11) {
                    class93.method479(this);
                } else if (field900 == 20) {
                    class93.method479(this);
                    this.method1375();
                } else if (field900 == 25) {
                    Statics.method2655(false);
                    field950 = 0;
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field1652.length; var10++) {
                        if (Statics.field374[var10] != -1 && Statics.field1652[var10] == null) {
                            Statics.field1652[var10] = Statics.field1035.method3750(Statics.field374[var10], 0);
                            if (Statics.field1652[var10] == null) {
                                var9 = false;
                                field950++;
                            }
                        }
                        if (Statics.field261[var10] != -1 && Statics.field1251[var10] == null) {
                            Statics.field1251[var10] = Statics.field1035.method3751(Statics.field261[var10], 0, Statics.field534[var10]);
                            if (Statics.field1251[var10] == null) {
                                var9 = false;
                                field950++;
                            }
                        }
                    }
                    if (var9) {
                        field952 = 0;
                        boolean var11 = true;
                        for (int var12 = 0; var12 < Statics.field1652.length; var12++) {
                            byte[] var13 = Statics.field1251[var12];
                            if (var13 != null) {
                                int var14 = (Statics.field2365[var12] >> 8) * 64 - Statics.field448;
                                int var15 = (Statics.field2365[var12] & 0xFF) * 64 - Statics.field301;
                                if (field1051) {
                                    var14 = 10;
                                    var15 = 10;
                                }
                                var11 &= class63.method3656(var13, var14, var15);
                            }
                        }
                        if (var11) {
                            if (field954 != 0) {
                                method16(class226.field2844 + class89.field1356 + class89.field1364 + 100 + "%" + class89.field1362, true);
                            }
                            method2362();
                            method1603();
                            method2362();
                            Statics.field630.method2461();
                            method2362();
                            System.gc();
                            for (int var16 = 0; var16 < 4; var16++) {
                                field955[var16].method2774();
                            }
                            for (int var17 = 0; var17 < 4; var17++) {
                                for (int var18 = 0; var18 < 104; var18++) {
                                    for (int var19 = 0; var19 < 104; var19++) {
                                        class63.field735[var17][var18][var19] = 0;
                                    }
                                }
                            }
                            method2362();
                            class63.method892();
                            int var20 = Statics.field1652.length;
                            for (class83 var21 = (class83) class83.field1287.method3323(); var21 != null; var21 = (class83) class83.field1287.method3325()) {
                                if (var21.field1292 != null) {
                                    Statics.field19.method1775(var21.field1292);
                                    var21.field1292 = null;
                                }
                                if (var21.field1297 != null) {
                                    Statics.field19.method1775(var21.field1297);
                                    var21.field1297 = null;
                                }
                            }
                            class83.field1287.method3347();
                            Statics.method2655(true);
                            if (!field1051) {
                                int var22 = 0;
                                label1090: while (true) {
                                    if (var22 >= var20) {
                                        for (int var36 = 0; var36 < var20; var36++) {
                                            int var37 = (Statics.field2365[var36] >> 8) * 64 - Statics.field448;
                                            int var38 = (Statics.field2365[var36] & 0xFF) * 64 - Statics.field301;
                                            byte[] var39 = Statics.field1652[var36];
                                            if (var39 == null && Statics.field855 < 800) {
                                                method2362();
                                                class63.method60(var37, var38, 64, 64);
                                            }
                                        }
                                        Statics.method2655(true);
                                        int var40 = 0;
                                        while (true) {
                                            if (var40 >= var20) {
                                                break label1090;
                                            }
                                            byte[] var41 = Statics.field1251[var40];
                                            if (var41 != null) {
                                                int var42 = (Statics.field2365[var40] >> 8) * 64 - Statics.field448;
                                                int var43 = (Statics.field2365[var40] & 0xFF) * 64 - Statics.field301;
                                                method2362();
                                                class140 var44 = Statics.field630;
                                                class162[] var45 = field955;
                                                class174 var46 = new class174(var41);
                                                int var47 = -1;
                                                while (true) {
                                                    int var48 = var46.method2927();
                                                    if (var48 == 0) {
                                                        break;
                                                    }
                                                    var47 += var48;
                                                    int var49 = 0;
                                                    while (true) {
                                                        int var50 = var46.method2927();
                                                        if (var50 == 0) {
                                                            break;
                                                        }
                                                        var49 += var50 - 1;
                                                        int var51 = var49 & 0x3F;
                                                        int var52 = var49 >> 6 & 0x3F;
                                                        int var53 = var49 >> 12;
                                                        int var54 = var46.method2921();
                                                        int var55 = var54 >> 2;
                                                        int var56 = var54 & 0x3;
                                                        int var57 = var42 + var52;
                                                        int var58 = var43 + var51;
                                                        if (var57 > 0 && var58 > 0 && var57 < 103 && var58 < 103) {
                                                            int var59 = var53;
                                                            if ((class63.field735[1][var57][var58] & 0x2) == 2) {
                                                                var59 = var53 - 1;
                                                            }
                                                            class162 var60 = null;
                                                            if (var59 >= 0) {
                                                                var60 = var45[var59];
                                                            }
                                                            class63.method713(var53, var57, var58, var47, var56, var55, var44, var60);
                                                        }
                                                    }
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                    int var23 = (Statics.field2365[var22] >> 8) * 64 - Statics.field448;
                                    int var24 = (Statics.field2365[var22] & 0xFF) * 64 - Statics.field301;
                                    byte[] var25 = Statics.field1652[var22];
                                    if (var25 != null) {
                                        method2362();
                                        int var26 = Statics.field475 * 8 - 48;
                                        int var27 = Statics.field855 * 8 - 48;
                                        class162[] var28 = field955;
                                        int var29 = 0;
                                        label1087: while (true) {
                                            if (var29 >= 4) {
                                                class174 var32 = new class174(var25);
                                                int var33 = 0;
                                                while (true) {
                                                    if (var33 >= 4) {
                                                        break label1087;
                                                    }
                                                    for (int var34 = 0; var34 < 64; var34++) {
                                                        for (int var35 = 0; var35 < 64; var35++) {
                                                            class63.method459(var32, var33, var23 + var34, var24 + var35, var26, var27, 0);
                                                        }
                                                    }
                                                    var33++;
                                                }
                                            }
                                            for (int var30 = 0; var30 < 64; var30++) {
                                                for (int var31 = 0; var31 < 64; var31++) {
                                                    if (var23 + var30 > 0 && var23 + var30 < 103 && var24 + var31 > 0 && var24 + var31 < 103) {
                                                        var28[var29].field2270[var23 + var30][var24 + var31] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                    var22++;
                                }
                            }
                            if (field1051) {
                                int var61 = 0;
                                label1023: while (true) {
                                    if (var61 >= 4) {
                                        for (int var84 = 0; var84 < 13; var84++) {
                                            for (int var85 = 0; var85 < 13; var85++) {
                                                int var86 = field957[0][var84][var85];
                                                if (var86 == -1) {
                                                    class63.method60(var84 * 8, var85 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        Statics.method2655(true);
                                        int var87 = 0;
                                        while (true) {
                                            if (var87 >= 4) {
                                                break label1023;
                                            }
                                            method2362();
                                            for (int var88 = 0; var88 < 13; var88++) {
                                                for (int var89 = 0; var89 < 13; var89++) {
                                                    int var90 = field957[var87][var88][var89];
                                                    if (var90 != -1) {
                                                        int var91 = var90 >> 24 & 0x3;
                                                        int var92 = var90 >> 1 & 0x3;
                                                        int var93 = var90 >> 14 & 0x3FF;
                                                        int var94 = var90 >> 3 & 0x7FF;
                                                        int var95 = (var93 / 8 << 8) + var94 / 8;
                                                        for (int var96 = 0; var96 < Statics.field2365.length; var96++) {
                                                            if (Statics.field2365[var96] == var95 && Statics.field1251[var96] != null) {
                                                                class63.method2877(Statics.field1251[var96], var87, var88 * 8, var89 * 8, var91, (var93 & 0x7) * 8, (var94 & 0x7) * 8, var92, Statics.field630, field955);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var87++;
                                        }
                                    }
                                    method2362();
                                    for (int var62 = 0; var62 < 13; var62++) {
                                        for (int var63 = 0; var63 < 13; var63++) {
                                            boolean var64 = false;
                                            int var65 = field957[var61][var62][var63];
                                            if (var65 != -1) {
                                                int var66 = var65 >> 24 & 0x3;
                                                int var67 = var65 >> 1 & 0x3;
                                                int var68 = var65 >> 14 & 0x3FF;
                                                int var69 = var65 >> 3 & 0x7FF;
                                                int var70 = (var68 / 8 << 8) + var69 / 8;
                                                for (int var71 = 0; var71 < Statics.field2365.length; var71++) {
                                                    if (Statics.field2365[var71] == var70 && Statics.field1652[var71] != null) {
                                                        byte[] var72 = Statics.field1652[var71];
                                                        int var73 = var62 * 8;
                                                        int var74 = var63 * 8;
                                                        int var75 = (var68 & 0x7) * 8;
                                                        int var76 = (var69 & 0x7) * 8;
                                                        class162[] var77 = field955;
                                                        for (int var78 = 0; var78 < 8; var78++) {
                                                            for (int var79 = 0; var79 < 8; var79++) {
                                                                if (var73 + var78 > 0 && var73 + var78 < 103 && var74 + var79 > 0 && var74 + var79 < 103) {
                                                                    var77[var61].field2270[var73 + var78][var74 + var79] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class174 var80 = new class174(var72);
                                                        for (int var81 = 0; var81 < 4; var81++) {
                                                            for (int var82 = 0; var82 < 64; var82++) {
                                                                for (int var83 = 0; var83 < 64; var83++) {
                                                                    if (var66 == var81 && var82 >= var75 && var82 < var75 + 8 && var83 >= var76 && var83 < var76 + 8) {
                                                                        class63.method459(var80, var61, var73 + class216.method3158(var82 & 0x7, var83 & 0x7, var67), var74 + class216.method3174(var82 & 0x7, var83 & 0x7, var67), 0, 0, var67);
                                                                    } else {
                                                                        class63.method459(var80, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var64 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var64) {
                                                class63.method615(var61, var62 * 8, var63 * 8);
                                            }
                                        }
                                    }
                                    var61++;
                                }
                            }
                            Statics.method2655(true);
                            method1603();
                            method2362();
                            class140 var97 = Statics.field630;
                            class162[] var98 = field955;
                            for (int var99 = 0; var99 < 4; var99++) {
                                for (int var100 = 0; var100 < 104; var100++) {
                                    for (int var101 = 0; var101 < 104; var101++) {
                                        if ((class63.field735[var99][var100][var101] & 0x1) == 1) {
                                            int var102 = var99;
                                            if ((class63.field735[1][var100][var101] & 0x2) == 2) {
                                                var102 = var99 - 1;
                                            }
                                            if (var102 >= 0) {
                                                var98[var102].method2777(var100, var101);
                                            }
                                        }
                                    }
                                }
                            }
                            class63.field745 += (int) (Math.random() * 5.0D) - 2;
                            if (class63.field745 < -8) {
                                class63.field745 = -8;
                            }
                            if (class63.field745 > 8) {
                                class63.field745 = 8;
                            }
                            class63.field751 += (int) (Math.random() * 5.0D) - 2;
                            if (class63.field751 < -16) {
                                class63.field751 = -16;
                            }
                            if (class63.field751 > 16) {
                                class63.field751 = 16;
                            }
                            for (int var103 = 0; var103 < 4; var103++) {
                                byte[][] var104 = Statics.field740[var103];
                                int var105 = (int) Math.sqrt(5100.0D);
                                int var106 = var105 * 768 >> 8;
                                for (int var107 = 1; var107 < 103; var107++) {
                                    for (int var108 = 1; var108 < 103; var108++) {
                                        int var109 = class63.field750[var103][var108 + 1][var107] - class63.field750[var103][var108 - 1][var107];
                                        int var110 = class63.field750[var103][var108][var107 + 1] - class63.field750[var103][var108][var107 - 1];
                                        int var111 = (int) Math.sqrt((double) (var110 * var110 + var109 * var109 + 65536));
                                        int var112 = (var109 << 8) / var111;
                                        int var113 = 65536 / var111;
                                        int var114 = (var110 << 8) / var111;
                                        int var115 = (var114 * -50 + var112 * -50 + var113 * -10) / var106 + 96;
                                        int var116 = (var104[var108][var107] >> 1) + (var104[var108][var107 + 1] >> 3) + (var104[var108][var107 - 1] >> 2) + (var104[var108 - 1][var107] >> 2) + (var104[var108 + 1][var107] >> 3);
                                        Statics.field741[var108][var107] = var115 - var116;
                                    }
                                }
                                for (int var117 = 0; var117 < 104; var117++) {
                                    Statics.field738[var117] = 0;
                                    Statics.field584[var117] = 0;
                                    Statics.field780[var117] = 0;
                                    Statics.field1674[var117] = 0;
                                    Statics.field642[var117] = 0;
                                }
                                for (int var118 = -5; var118 < 109; var118++) {
                                    for (int var119 = 0; var119 < 104; var119++) {
                                        int var120 = var118 + 5;
                                        int var10002;
                                        if (var120 >= 0 && var120 < 104) {
                                            int var121 = Statics.field737[var103][var120][var119] & 0xFF;
                                            if (var121 > 0) {
                                                class247 var122 = class247.method2881(var121 - 1);
                                                Statics.field738[var119] += var122.field3325;
                                                Statics.field584[var119] += var122.field3326;
                                                Statics.field780[var119] += var122.field3327;
                                                Statics.field1674[var119] += var122.field3323;
                                                var10002 = Statics.field642[var119]++;
                                            }
                                        }
                                        int var123 = var118 - 5;
                                        if (var123 >= 0 && var123 < 104) {
                                            int var124 = Statics.field737[var103][var123][var119] & 0xFF;
                                            if (var124 > 0) {
                                                class247 var125 = class247.method2881(var124 - 1);
                                                Statics.field738[var119] -= var125.field3325;
                                                Statics.field584[var119] -= var125.field3326;
                                                Statics.field780[var119] -= var125.field3327;
                                                Statics.field1674[var119] -= var125.field3323;
                                                var10002 = Statics.field642[var119]--;
                                            }
                                        }
                                    }
                                    if (var118 >= 1 && var118 < 103) {
                                        int var126 = 0;
                                        int var127 = 0;
                                        int var128 = 0;
                                        int var129 = 0;
                                        int var130 = 0;
                                        for (int var131 = -5; var131 < 109; var131++) {
                                            int var132 = var131 + 5;
                                            if (var132 >= 0 && var132 < 104) {
                                                var126 += Statics.field738[var132];
                                                var127 += Statics.field584[var132];
                                                var128 += Statics.field780[var132];
                                                var129 += Statics.field1674[var132];
                                                var130 += Statics.field642[var132];
                                            }
                                            int var133 = var131 - 5;
                                            if (var133 >= 0 && var133 < 104) {
                                                var126 -= Statics.field738[var133];
                                                var127 -= Statics.field584[var133];
                                                var128 -= Statics.field780[var133];
                                                var129 -= Statics.field1674[var133];
                                                var130 -= Statics.field642[var133];
                                            }
                                            if (var131 >= 1 && var131 < 103 && (!field898 || (class63.field735[0][var118][var131] & 0x2) != 0 || (class63.field735[var103][var118][var131] & 0x10) == 0)) {
                                                if (var103 < class63.field736) {
                                                    class63.field736 = var103;
                                                }
                                                int var134 = Statics.field737[var103][var118][var131] & 0xFF;
                                                int var135 = Statics.field753[var103][var118][var131] & 0xFF;
                                                if (var134 > 0 || var135 > 0) {
                                                    int var136 = class63.field750[var103][var118][var131];
                                                    int var137 = class63.field750[var103][var118 + 1][var131];
                                                    int var138 = class63.field750[var103][var118 + 1][var131 + 1];
                                                    int var139 = class63.field750[var103][var118][var131 + 1];
                                                    int var140 = Statics.field741[var118][var131];
                                                    int var141 = Statics.field741[var118 + 1][var131];
                                                    int var142 = Statics.field741[var118 + 1][var131 + 1];
                                                    int var143 = Statics.field741[var118][var131 + 1];
                                                    int var144 = -1;
                                                    int var145 = -1;
                                                    if (var134 > 0) {
                                                        int var146 = var126 * 256 / var129;
                                                        int var147 = var127 / var130;
                                                        int var148 = var128 / var130;
                                                        var144 = Statics.method3924(var146, var147, var148);
                                                        int var149 = class63.field745 + var146 & 0xFF;
                                                        int var150 = class63.field751 + var148;
                                                        if (var150 < 0) {
                                                            var150 = 0;
                                                        } else if (var150 > 255) {
                                                            var150 = 255;
                                                        }
                                                        var145 = Statics.method3924(var149, var147, var150);
                                                    }
                                                    if (var103 > 0) {
                                                        boolean var151 = true;
                                                        if (var134 == 0 && Statics.field3185[var103][var118][var131] != 0) {
                                                            var151 = false;
                                                        }
                                                        if (var135 > 0 && !class260.method3726(var135 - 1).field3574) {
                                                            var151 = false;
                                                        }
                                                        if (var151 && var136 == var137 && var136 == var138 && var136 == var139) {
                                                            Statics.field743[var103][var118][var131] |= 0x924;
                                                        }
                                                    }
                                                    int var152 = 0;
                                                    if (var145 != -1) {
                                                        var152 = class137.field1991[class63.method2720(var145, 96)];
                                                    }
                                                    if (var135 == 0) {
                                                        var97.method2647(var103, var118, var131, 0, 0, -1, var136, var137, var138, var139, class63.method2720(var144, var140), class63.method2720(var144, var141), class63.method2720(var144, var142), class63.method2720(var144, var143), 0, 0, 0, 0, var152, 0);
                                                    } else {
                                                        int var153 = Statics.field3185[var103][var118][var131] + 1;
                                                        byte var154 = Statics.field739[var103][var118][var131];
                                                        class260 var155 = class260.method3726(var135 - 1);
                                                        int var156 = var155.field3567;
                                                        int var157;
                                                        int var158;
                                                        if (var156 >= 0) {
                                                            var157 = Statics.field2002.method2163(var156);
                                                            var158 = -1;
                                                        } else if (var155.field3569 == 16711935) {
                                                            var158 = -2;
                                                            var156 = -1;
                                                            var157 = -2;
                                                        } else {
                                                            var158 = Statics.method3924(var155.field3571, var155.field3577, var155.field3575);
                                                            int var159 = class63.field745 + var155.field3571 & 0xFF;
                                                            int var160 = class63.field751 + var155.field3575;
                                                            if (var160 < 0) {
                                                                var160 = 0;
                                                            } else if (var160 > 255) {
                                                                var160 = 255;
                                                            }
                                                            var157 = Statics.method3924(var159, var155.field3577, var160);
                                                        }
                                                        int var161 = 0;
                                                        if (var157 != -2) {
                                                            var161 = class137.field1991[Statics.method1012(var157, 96)];
                                                        }
                                                        if (var155.field3572 != -1) {
                                                            int var162 = class63.field745 + var155.field3576 & 0xFF;
                                                            int var163 = class63.field751 + var155.field3578;
                                                            if (var163 < 0) {
                                                                var163 = 0;
                                                            } else if (var163 > 255) {
                                                                var163 = 255;
                                                            }
                                                            int var164 = Statics.method3924(var162, var155.field3573, var163);
                                                            var161 = class137.field1991[Statics.method1012(var164, 96)];
                                                        }
                                                        var97.method2647(var103, var118, var131, var153, var154, var156, var136, var137, var138, var139, class63.method2720(var144, var140), class63.method2720(var144, var141), class63.method2720(var144, var142), class63.method2720(var144, var143), Statics.method1012(var158, var140), Statics.method1012(var158, var141), Statics.method1012(var158, var142), Statics.method1012(var158, var143), var152, var161);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var165 = 1; var165 < 103; var165++) {
                                    for (int var166 = 1; var166 < 103; var166++) {
                                        var97.method2465(var103, var166, var165, class63.method3408(var103, var166, var165));
                                    }
                                }
                                Statics.field737[var103] = (byte[][]) null;
                                Statics.field753[var103] = (byte[][]) null;
                                Statics.field3185[var103] = (byte[][]) null;
                                Statics.field739[var103] = (byte[][]) null;
                                Statics.field740[var103] = (byte[][]) null;
                            }
                            var97.method2492(-50, -10, -50);
                            for (int var167 = 0; var167 < 104; var167++) {
                                for (int var168 = 0; var168 < 104; var168++) {
                                    if ((class63.field735[1][var167][var168] & 0x2) == 2) {
                                        var97.method2463(var167, var168);
                                    }
                                }
                            }
                            int var169 = 1;
                            int var170 = 2;
                            int var171 = 4;
                            for (int var172 = 0; var172 < 4; var172++) {
                                if (var172 > 0) {
                                    var169 <<= 0x3;
                                    var170 <<= 0x3;
                                    var171 <<= 0x3;
                                }
                                for (int var173 = 0; var173 <= var172; var173++) {
                                    for (int var174 = 0; var174 <= 104; var174++) {
                                        for (int var175 = 0; var175 <= 104; var175++) {
                                            if ((Statics.field743[var173][var175][var174] & var169) != 0) {
                                                int var176 = var174;
                                                int var177 = var174;
                                                int var178 = var173;
                                                int var179 = var173;
                                                while (var176 > 0 && (Statics.field743[var173][var175][var176 - 1] & var169) != 0) {
                                                    var176--;
                                                }
                                                while (var177 < 104 && (Statics.field743[var173][var175][var177 + 1] & var169) != 0) {
                                                    var177++;
                                                }
                                                label681: while (var178 > 0) {
                                                    for (int var180 = var176; var180 <= var177; var180++) {
                                                        if ((Statics.field743[var178 - 1][var175][var180] & var169) == 0) {
                                                            break label681;
                                                        }
                                                    }
                                                    var178--;
                                                }
                                                label670: while (var179 < var172) {
                                                    for (int var181 = var176; var181 <= var177; var181++) {
                                                        if ((Statics.field743[var179 + 1][var175][var181] & var169) == 0) {
                                                            break label670;
                                                        }
                                                    }
                                                    var179++;
                                                }
                                                int var182 = (var179 + 1 - var178) * (var177 - var176 + 1);
                                                if (var182 >= 8) {
                                                    short var183 = 240;
                                                    int var184 = class63.field750[var179][var175][var176] - var183;
                                                    int var185 = class63.field750[var178][var175][var176];
                                                    class140.method2464(var172, 1, var175 * 128, var175 * 128, var176 * 128, var177 * 128 + 128, var184, var185);
                                                    for (int var186 = var178; var186 <= var179; var186++) {
                                                        for (int var187 = var176; var187 <= var177; var187++) {
                                                            Statics.field743[var186][var175][var187] &= ~var169;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field743[var173][var175][var174] & var170) != 0) {
                                                int var188 = var175;
                                                int var189 = var175;
                                                int var190 = var173;
                                                int var191 = var173;
                                                while (var188 > 0 && (Statics.field743[var173][var188 - 1][var174] & var170) != 0) {
                                                    var188--;
                                                }
                                                while (var189 < 104 && (Statics.field743[var173][var189 + 1][var174] & var170) != 0) {
                                                    var189++;
                                                }
                                                label734: while (var190 > 0) {
                                                    for (int var192 = var188; var192 <= var189; var192++) {
                                                        if ((Statics.field743[var190 - 1][var192][var174] & var170) == 0) {
                                                            break label734;
                                                        }
                                                    }
                                                    var190--;
                                                }
                                                label723: while (var191 < var172) {
                                                    for (int var193 = var188; var193 <= var189; var193++) {
                                                        if ((Statics.field743[var191 + 1][var193][var174] & var170) == 0) {
                                                            break label723;
                                                        }
                                                    }
                                                    var191++;
                                                }
                                                int var194 = (var191 + 1 - var190) * (var189 - var188 + 1);
                                                if (var194 >= 8) {
                                                    short var195 = 240;
                                                    int var196 = class63.field750[var191][var188][var174] - var195;
                                                    int var197 = class63.field750[var190][var188][var174];
                                                    class140.method2464(var172, 2, var188 * 128, var189 * 128 + 128, var174 * 128, var174 * 128, var196, var197);
                                                    for (int var198 = var190; var198 <= var191; var198++) {
                                                        for (int var199 = var188; var199 <= var189; var199++) {
                                                            Statics.field743[var198][var199][var174] &= ~var170;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field743[var173][var175][var174] & var171) != 0) {
                                                int var200 = var175;
                                                int var201 = var175;
                                                int var202 = var174;
                                                int var203 = var174;
                                                while (var202 > 0 && (Statics.field743[var173][var175][var202 - 1] & var171) != 0) {
                                                    var202--;
                                                }
                                                while (var203 < 104 && (Statics.field743[var173][var175][var203 + 1] & var171) != 0) {
                                                    var203++;
                                                }
                                                label787: while (var200 > 0) {
                                                    for (int var204 = var202; var204 <= var203; var204++) {
                                                        if ((Statics.field743[var173][var200 - 1][var204] & var171) == 0) {
                                                            break label787;
                                                        }
                                                    }
                                                    var200--;
                                                }
                                                label776: while (var201 < 104) {
                                                    for (int var205 = var202; var205 <= var203; var205++) {
                                                        if ((Statics.field743[var173][var201 + 1][var205] & var171) == 0) {
                                                            break label776;
                                                        }
                                                    }
                                                    var201++;
                                                }
                                                if ((var201 - var200 + 1) * (var203 - var202 + 1) >= 4) {
                                                    int var206 = class63.field750[var173][var200][var202];
                                                    class140.method2464(var172, 4, var200 * 128, var201 * 128 + 128, var202 * 128, var203 * 128 + 128, var206, var206);
                                                    for (int var207 = var200; var207 <= var201; var207++) {
                                                        for (int var208 = var202; var208 <= var203; var208++) {
                                                            Statics.field743[var173][var207][var208] &= ~var171;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            Statics.method2655(true);
                            int var209 = class63.field736;
                            if (var209 > Statics.field237) {
                                var209 = Statics.field237;
                            }
                            if (var209 < Statics.field237 - 1) {
                                int var210 = Statics.field237 - 1;
                            }
                            if (field898) {
                                Statics.field630.method2462(class63.field736);
                            } else {
                                Statics.field630.method2462(0);
                            }
                            for (int var211 = 0; var211 < 104; var211++) {
                                for (int var212 = 0; var212 < 104; var212++) {
                                    method445(var211, var212);
                                }
                            }
                            method2362();
                            method2665();
                            class256.field3448.method3250();
                            if (Statics.field1458.method773()) {
                                field937.method3133(52);
                                field937.method2902(1057001181);
                            }
                            if (!field1051) {
                                int var213 = (Statics.field475 - 6) / 8;
                                int var214 = (Statics.field475 + 6) / 8;
                                int var215 = (Statics.field855 - 6) / 8;
                                int var216 = (Statics.field855 + 6) / 8;
                                for (int var217 = var213 - 1; var217 <= var214 + 1; var217++) {
                                    for (int var218 = var215 - 1; var218 <= var216 + 1; var218++) {
                                        if (var217 < var213 || var217 > var214 || var218 < var215 || var218 > var216) {
                                            Statics.field1035.method3825("m" + var217 + "_" + var218);
                                            Statics.field1035.method3825("l" + var217 + "_" + var218);
                                        }
                                    }
                                }
                            }
                            method6(30);
                            method2362();
                            Statics.field737 = (byte[][][]) null;
                            Statics.field753 = (byte[][][]) null;
                            Statics.field3185 = (byte[][][]) null;
                            Statics.field739 = (byte[][][]) null;
                            Statics.field743 = (int[][][]) null;
                            Statics.field740 = (byte[][][]) null;
                            Statics.field741 = (int[][]) null;
                            Statics.field738 = null;
                            Statics.field584 = null;
                            Statics.field780 = null;
                            Statics.field1674 = null;
                            Statics.field642 = null;
                            field937.method3133(73);
                            class59.method3406();
                        } else {
                            field954 = 2;
                        }
                    } else {
                        field954 = 1;
                    }
                }
                if (field900 == 30) {
                    this.method1061();
                } else if (field900 == 40 || field900 == 45) {
                    this.method1375();
                }
                return;
            }
            var2.field3183.method3864(var2.field3186, (int) var2.field2441, var2.field3182, false);
        }
    }

    @ObfuscatedName("client.ao(ZB)V")
    public final void method766(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class204.field2476 == 2) {
                    if (Statics.field2478 == null) {
                        Statics.field2478 = class210.method3582(Statics.field3615, Statics.field254, Statics.field2483);
                        if (Statics.field2478 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2369 == null) {
                        Statics.field2369 = new class115(Statics.field2477, Statics.field2473);
                    }
                    if (Statics.field2474.method3414(Statics.field2478, Statics.field326, Statics.field2369, 22050)) {
                        Statics.field2474.method3412();
                        Statics.field2474.method3410(Statics.field2475);
                        Statics.field2474.method3459(Statics.field2478, Statics.field2414);
                        class204.field2476 = 0;
                        Statics.field2478 = null;
                        Statics.field2369 = null;
                        Statics.field3615 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2474.method3499();
                class204.field2476 = 0;
                Statics.field2478 = null;
                Statics.field2369 = null;
                Statics.field3615 = null;
            }
            var2 = false;
        }
        if (var2 && field1122 && Statics.field265 != null) {
            Statics.field265.method1911();
        }
        if ((field900 == 10 || field900 == 20 || field900 == 30) && field956 != 0L && class176.method3746() > field956) {
            method86(method46());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field1089[var5] = true;
            }
        }
        if (field900 == 0) {
            this.method768(class93.field1410, class93.field1427, arg0);
        } else if (field900 == 5) {
            class93.method148(Statics.field545, Statics.field1341, Statics.field306, arg0);
        } else if (field900 == 10 || field900 == 11) {
            class93.method148(Statics.field545, Statics.field1341, Statics.field306, arg0);
        } else if (field900 == 20) {
            class93.method148(Statics.field545, Statics.field1341, Statics.field306, arg0);
        } else if (field900 == 25) {
            if (field954 == 1) {
                if (field950 > field951) {
                    field951 = field950;
                }
                int var6 = (field951 * 50 - field950 * 50) / field951;
                method16(class226.field2844 + class89.field1356 + class89.field1364 + var6 + "%" + class89.field1362, false);
            } else if (field954 == 2) {
                if (field952 > field953) {
                    field953 = field952;
                }
                int var7 = (field953 * 50 - field952 * 50) / field953 + 50;
                method16(class226.field2844 + class89.field1356 + class89.field1364 + var7 + "%" + class89.field1362, false);
            } else {
                method16(class226.field2844, false);
            }
        } else if (field900 == 30) {
            this.method1150();
        } else if (field900 == 40) {
            method16(class226.field2972 + class89.field1356 + class226.field2846, false);
        } else if (field900 == 45) {
            method16(class226.field3022, false);
        }
        if (field900 == 30 && field1096 == 0 && !arg0 && !field1098) {
            for (int var8 = 0; var8 < field1087; var8++) {
                if (field972[var8]) {
                    Statics.field583.method723(field1092[var8], field1093[var8], field1095[var8], field921[var8]);
                    field972[var8] = false;
                }
            }
        } else if (field900 > 0) {
            Statics.field583.method722(0, 0);
            for (int var9 = 0; var9 < field1087; var9++) {
                field972[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.av(I)V")
    public final void method767() {
        if (Statics.field629.method1644()) {
            Statics.field629.method1640();
        }
        if (Statics.field1365 != null) {
            Statics.field1365.field837 = false;
        }
        Statics.field1365 = null;
        if (Statics.field1541 != null) {
            Statics.field1541.method2745();
            Statics.field1541 = null;
        }
        if (class51.field599 != null) {
            class51 var1 = class51.field599;
            synchronized (class51.field599) {
                class51.field599 = null;
            }
        }
        if (class60.field700 != null) {
            class60 var3 = class60.field700;
            synchronized (class60.field700) {
                class60.field700 = null;
            }
        }
        Statics.field2537 = null;
        if (Statics.field265 != null) {
            Statics.field265.method1912();
        }
        if (Statics.field2089 != null) {
            Statics.field2089.method1912();
        }
        Statics.method3742();
        class237.method3739();
        try {
            class156.field2225.method1730();
            for (int var5 = 0; var5 < Statics.field2219; var5++) {
                Statics.field2227[var5].method1730();
            }
            class156.field2229.method1730();
            class156.field2224.method1730();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("x.fv(II)V")
    public static void method6(int arg0) {
        if (field900 == arg0) {
            return;
        }
        if (field900 == 0) {
            Statics.field1458.method769();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field1024 = 0;
            field1059 = 0;
            field929 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1340 != null) {
            Statics.field1340.method2745();
            Statics.field1340 = null;
        }
        if (field900 == 25) {
            field954 = 0;
            field950 = 0;
            field951 = 1;
            field952 = 0;
            field953 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method490(Statics.field2807, Statics.field1256, true, 0);
        } else if (arg0 == 20) {
            class93.method490(Statics.field2807, Statics.field1256, true, field900 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method490(Statics.field2807, Statics.field1256, false, 4);
        } else {
            class93.method932();
        }
        field900 = arg0;
    }

    @ObfuscatedName("client.fl(I)V")
    public void method1322() {
        if (field900 != 1000) {
            boolean var1 = class239.method1616();
            if (!var1) {
                this.method1295();
            }
        }
    }

    @ObfuscatedName("client.fp(I)V")
    public void method1295() {
        if (class239.field3252 >= 4) {
            this.method794("js5crc");
            field900 = 1000;
            return;
        }
        if (class239.field3253 >= 4) {
            if (field900 <= 5) {
                this.method794("js5io");
                field900 = 1000;
                return;
            }
            field923 = 3000;
            class239.field3253 = 3;
        }
        if (--field923 + 1 > 0) {
            return;
        }
        try {
            if (field922 == 0) {
                Statics.field586 = Statics.field665.method2698(Statics.field10, Statics.field660);
                field922++;
            }
            if (field922 == 1) {
                if (Statics.field586.field2197 == 2) {
                    this.method1062(-1);
                    return;
                }
                if (Statics.field586.field2197 == 1) {
                    field922++;
                }
            }
            if (field922 == 2) {
                Statics.field17 = new class160((Socket) Statics.field586.field2205, Statics.field665);
                class174 var1 = new class174(5);
                var1.method2899(15);
                var1.method2902(151);
                Statics.field17.method2739(var1.field2367, 0, 5);
                field922++;
                Statics.field3666 = class176.method3746();
            }
            if (field922 == 3) {
                if (field900 <= 5 || Statics.field17.method2738() > 0) {
                    int var2 = Statics.field17.method2734();
                    if (var2 != 0) {
                        this.method1062(var2);
                        return;
                    }
                    field922++;
                } else if (class176.method3746() - Statics.field3666 > 30000L) {
                    this.method1062(-2);
                    return;
                }
            }
            if (field922 == 4) {
                class160 var3 = Statics.field17;
                boolean var4 = field900 > 20;
                if (Statics.field3236 != null) {
                    try {
                        Statics.field3236.method2745();
                    } catch (Exception var14) {
                    }
                    Statics.field3236 = null;
                }
                Statics.field3236 = var3;
                class239.method2254(var4);
                class239.field3240.field2364 = 0;
                Statics.field2370 = null;
                Statics.field834 = null;
                class239.field3248 = 0;
                while (true) {
                    class235 var6 = (class235) class239.field3247.method3265();
                    if (var6 == null) {
                        while (true) {
                            class235 var7 = (class235) class239.field3234.method3265();
                            if (var7 == null) {
                                if (class239.field3251 != 0) {
                                    try {
                                        class174 var8 = new class174(4);
                                        var8.method2899(4);
                                        var8.method2899(class239.field3251);
                                        var8.method2900(0);
                                        Statics.field3236.method2739(var8.field2367, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3236.method2745();
                                        } catch (Exception var12) {
                                        }
                                        class239.field3253++;
                                        Statics.field3236 = null;
                                    }
                                }
                                class239.field3238 = 0;
                                Statics.field3243 = class176.method3746();
                                Statics.field586 = null;
                                Statics.field17 = null;
                                field922 = 0;
                                field926 = 0;
                                return;
                            }
                            class239.field3241.method3217(var7);
                            class239.field3242.method3269(var7, var7.field2441);
                            class239.field3244++;
                            class239.field3245--;
                        }
                    }
                    class239.field3237.method3269(var6, var6.field2441);
                    class239.field3235++;
                    class239.field3239--;
                }
            }
        } catch (IOException var15) {
            this.method1062(-3);
        }
    }

    @ObfuscatedName("client.fu(IS)V")
    public void method1062(int arg0) {
        Statics.field586 = null;
        Statics.field17 = null;
        field922 = 0;
        if (Statics.field660 == Statics.field3150) {
            Statics.field660 = Statics.field255;
        } else {
            Statics.field660 = Statics.field3150;
        }
        field926++;
        if (field926 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field900 <= 5) {
                this.method794("js5connect_full");
                field900 = 1000;
            } else {
                field923 = 3000;
            }
        } else if (field926 >= 2 && arg0 == 6) {
            this.method794("js5connect_outofdate");
            field900 = 1000;
        } else if (field926 >= 4) {
            if (field900 <= 5) {
                this.method794("js5connect");
                field900 = 1000;
            } else {
                field923 = 3000;
            }
        }
    }

    @ObfuscatedName("ga.fq(I)V")
    public static void method3179() {
        if (field1042 == 0) {
            Statics.field630 = new class140(4, 104, 104, class63.field750);
            for (int var0 = 0; var0 < 4; var0++) {
                field955[var0] = new class162(104, 104);
            }
            Statics.field620 = new class286(512, 512);
            class93.field1427 = class226.field2937;
            class93.field1410 = 5;
            field1042 = 20;
        } else if (field1042 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field1997[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2496(var1, 500, 800, 512, 334);
            class93.field1427 = class226.field2848;
            class93.field1410 = 10;
            field1042 = 30;
        } else if (field1042 == 30) {
            Statics.field797 = method61(0, false, true, true);
            Statics.field775 = method61(1, false, true, true);
            Statics.field2135 = method61(2, true, false, true);
            Statics.field552 = method61(3, false, true, true);
            Statics.field2556 = method61(4, false, true, true);
            Statics.field1035 = method61(5, true, true, true);
            Statics.field18 = method61(6, true, true, false);
            Statics.field640 = method61(7, false, true, true);
            Statics.field1256 = method61(8, false, true, true);
            Statics.field1654 = method61(9, false, true, true);
            Statics.field2807 = method61(10, false, true, true);
            Statics.field24 = method61(11, false, true, true);
            Statics.field925 = method61(12, false, true, true);
            Statics.field2257 = method61(13, true, false, true);
            Statics.field1391 = method61(14, false, true, false);
            Statics.field324 = method61(15, false, true, true);
            Statics.field1509 = method61(16, false, true, false);
            class93.field1427 = class226.field2849;
            class93.field1410 = 20;
            field1042 = 40;
        } else if (field1042 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field797.method3838() * 4 / 100;
            int var8 = var7 + Statics.field775.method3838() * 4 / 100;
            int var9 = var8 + Statics.field2135.method3838() * 2 / 100;
            int var10 = var9 + Statics.field552.method3838() * 2 / 100;
            int var11 = var10 + Statics.field2556.method3838() * 6 / 100;
            int var12 = var11 + Statics.field1035.method3838() * 4 / 100;
            int var13 = var12 + Statics.field18.method3838() * 2 / 100;
            int var14 = var13 + Statics.field640.method3838() * 58 / 100;
            int var15 = var14 + Statics.field1256.method3838() * 2 / 100;
            int var16 = var15 + Statics.field1654.method3838() * 2 / 100;
            int var17 = var16 + Statics.field2807.method3838() * 2 / 100;
            int var18 = var17 + Statics.field24.method3838() * 2 / 100;
            int var19 = var18 + Statics.field925.method3838() * 2 / 100;
            int var20 = var19 + Statics.field2257.method3838() * 2 / 100;
            int var21 = var20 + Statics.field1391.method3838() * 2 / 100;
            int var22 = var21 + Statics.field324.method3838() * 2 / 100;
            int var23 = var22 + Statics.field1509.method3838() * 2 / 100;
            if (var23 == 100) {
                class93.field1427 = class226.field2851;
                class93.field1410 = 30;
                field1042 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1427 = class226.field2850 + var23 + "%";
                }
                class93.field1410 = 30;
            }
        } else if (field1042 == 45) {
            boolean var24 = !field898;
            Statics.field1634 = 22050;
            Statics.field889 = var24;
            Statics.field2378 = 2;
            class205 var25 = new class205();
            var25.method3492(9, 128);
            Statics.field265 = class112.method995(Statics.field665, 0, 22050);
            Statics.field265.method1927(var25);
            class238 var26 = Statics.field324;
            class238 var27 = Statics.field1391;
            class238 var28 = Statics.field2556;
            Statics.field326 = var26;
            Statics.field2473 = var27;
            Statics.field2477 = var28;
            Statics.field2474 = var25;
            Statics.field2089 = class112.method995(Statics.field665, 1, 2048);
            Statics.field19 = new class105();
            Statics.field2089.method1927(Statics.field19);
            Statics.field1540 = new class119(22050, Statics.field1634);
            class93.field1427 = class226.field2847;
            class93.field1410 = 35;
            field1042 = 50;
            Statics.field3209 = new class263(Statics.field1256, Statics.field2257);
        } else if (field1042 == 50) {
            int var29 = class262.method4337().length;
            field949 = Statics.field3209.method4339(class262.method4337());
            if (field949.size() < var29) {
                class93.field1427 = class226.field2853 + field949.size() * 100 / var29 + "%";
                class93.field1410 = 40;
            } else {
                Statics.field1341 = (class264) field949.get(class262.field3604);
                Statics.field306 = (class264) field949.get(class262.field3606);
                Statics.field545 = (class264) field949.get(class262.field3601);
                Statics.field468 = new class292(true);
                class93.field1427 = class226.field2981;
                class93.field1410 = 40;
                field1042 = 60;
            }
        } else if (field1042 == 60) {
            class238 var30 = Statics.field2807;
            class238 var31 = Statics.field1256;
            int var32 = 0;
            if (var30.method3772("title.jpg", "")) {
                var32++;
            }
            if (var31.method3772("logo", "")) {
                var32++;
            }
            if (var31.method3772("logo_deadman_mode", "")) {
                var32++;
            }
            if (var31.method3772("titlebox", "")) {
                var32++;
            }
            if (var31.method3772("titlebutton", "")) {
                var32++;
            }
            if (var31.method3772("runes", "")) {
                var32++;
            }
            if (var31.method3772("title_mute", "")) {
                var32++;
            }
            if (var31.method3772("options_radio_buttons,0", "")) {
                var32++;
            }
            if (var31.method3772("options_radio_buttons,2", "")) {
                var32++;
            }
            var31.method3772("sl_back", "");
            var31.method3772("sl_flags", "");
            var31.method3772("sl_arrows", "");
            var31.method3772("sl_stars", "");
            var31.method3772("sl_button", "");
            int var35 = class93.method50();
            if (var32 < var35) {
                class93.field1427 = class226.field2855 + var32 * 100 / var35 + "%";
                class93.field1410 = 50;
            } else {
                class93.field1427 = class226.field2856;
                class93.field1410 = 50;
                method6(5);
                field1042 = 70;
            }
        } else if (field1042 == 70) {
            if (Statics.field2135.method3770()) {
                class260.method107(Statics.field2135);
                class238 var36 = Statics.field2135;
                Statics.field3322 = var36;
                class248.method461(Statics.field2135, Statics.field640);
                class256.method2457(Statics.field2135, Statics.field640, field898);
                class259.method48(Statics.field2135, Statics.field640);
                class253.method3932(Statics.field2135);
                class257.method3111(Statics.field2135, Statics.field640, field892, Statics.field1341);
                class238 var37 = Statics.field2135;
                class238 var38 = Statics.field797;
                class238 var39 = Statics.field775;
                Statics.field3583 = var37;
                Statics.field3582 = var38;
                Statics.field3588 = var39;
                class238 var40 = Statics.field2135;
                class238 var41 = Statics.field640;
                Statics.field3311 = var40;
                Statics.field3319 = var41;
                class238 var42 = Statics.field2135;
                Statics.field3362 = var42;
                class238 var43 = Statics.field2135;
                Statics.field3270 = var43;
                Statics.field23 = Statics.field3270.method3761(16);
                class238 var44 = Statics.field552;
                class238 var45 = Statics.field640;
                class238 var46 = Statics.field1256;
                class238 var47 = Statics.field2257;
                Statics.field796 = var44;
                Statics.field1338 = var45;
                Statics.field2623 = var46;
                Statics.field1545 = var47;
                Statics.field2321 = new class217[Statics.field796.method3762()][];
                Statics.field758 = new boolean[Statics.field796.method3762()];
                class238 var48 = Statics.field2135;
                Statics.field2408 = var48;
                class238 var49 = Statics.field2135;
                Statics.field3376 = var49;
                class238 var50 = Statics.field2135;
                Statics.field3299 = var50;
                class238 var51 = Statics.field2135;
                Statics.field3669 = var51;
                class252.method1019(Statics.field2135);
                Statics.field629 = new class98();
                class255.method1687(Statics.field2135, Statics.field1256, Statics.field2257);
                class238 var52 = Statics.field2135;
                class238 var53 = Statics.field1256;
                Statics.field3357 = var52;
                Statics.field3345 = var53;
                class238 var54 = Statics.field2135;
                class238 var55 = Statics.field1256;
                Statics.field3290 = var55;
                if (var54.method3770()) {
                    Statics.field3277 = var54.method3761(35);
                    Statics.field3287 = new class243[Statics.field3277];
                    for (int var56 = 0; var56 < Statics.field3277; var56++) {
                        byte[] var57 = var54.method3750(35, var56);
                        if (var57 != null) {
                            Statics.field3287[var56] = new class243(var56);
                            Statics.field3287[var56].method3894(new class174(var57));
                            Statics.field3287[var56].method3895();
                        }
                    }
                }
                class93.field1427 = class226.field2858;
                class93.field1410 = 60;
                field1042 = 80;
            } else {
                class93.field1427 = class226.field2988 + Statics.field2135.method3844() + "%";
                class93.field1410 = 60;
            }
        } else if (field1042 == 80) {
            int var58 = 0;
            if (Statics.field2020 == null) {
                class238 var59 = Statics.field1256;
                int var60 = var59.method3766("compass");
                int var61 = var59.method3767(var60, "");
                class286 var62 = class287.method65(var59, var60, var61);
                Statics.field2020 = var62;
            } else {
                var58++;
            }
            if (Statics.field1963 == null) {
                class238 var63 = Statics.field1256;
                int var64 = var63.method3766("mapedge");
                int var65 = var63.method3767(var64, "");
                class286 var66 = class287.method65(var63, var64, var65);
                Statics.field1963 = var66;
            } else {
                var58++;
            }
            if (Statics.field307 == null) {
                Statics.field307 = class287.method3595(Statics.field1256, "mapscene", "");
            } else {
                var58++;
            }
            if (Statics.field627 == null) {
                Statics.field627 = class287.method4481(Statics.field1256, "headicons_pk", "");
            } else {
                var58++;
            }
            if (Statics.field3413 == null) {
                Statics.field3413 = class287.method4481(Statics.field1256, "headicons_prayer", "");
            } else {
                var58++;
            }
            if (Statics.field485 == null) {
                Statics.field485 = class287.method4481(Statics.field1256, "headicons_hint", "");
            } else {
                var58++;
            }
            if (Statics.field628 == null) {
                Statics.field628 = class287.method4481(Statics.field1256, "mapmarker", "");
            } else {
                var58++;
            }
            if (Statics.field725 == null) {
                Statics.field725 = class287.method4481(Statics.field1256, "cross", "");
            } else {
                var58++;
            }
            if (Statics.field1749 == null) {
                Statics.field1749 = class287.method4481(Statics.field1256, "mapdots", "");
            } else {
                var58++;
            }
            if (Statics.field3328 == null) {
                Statics.field3328 = class287.method3595(Statics.field1256, "scrollbar", "");
            } else {
                var58++;
            }
            if (Statics.field2479 == null) {
                Statics.field2479 = class287.method3595(Statics.field1256, "mod_icons", "");
            } else {
                var58++;
            }
            if (var58 < 11) {
                class93.field1427 = class226.field3111 + var58 * 100 / 12 + "%";
                class93.field1410 = 70;
            } else {
                Statics.field3626 = Statics.field2479;
                Statics.field1963.method4698();
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 21.0D) - 10;
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 41.0D) - 20;
                Statics.field307[0].method4637(var67 + var70, var68 + var70, var69 + var70);
                class93.field1427 = class226.field2862;
                class93.field1410 = 70;
                field1042 = 90;
            }
        } else if (field1042 == 90) {
            if (Statics.field1654.method3770()) {
                class126 var71 = new class126(Statics.field1654, Statics.field1256, 20, 0.8D, field898 ? 64 : 128);
                class137.method2419(var71);
                class137.method2400(0.8D);
                class93.field1427 = class226.field3053;
                class93.field1410 = 90;
                field1042 = 110;
            } else {
                class93.field1427 = class226.field2956 + Statics.field1654.method3844() + "%";
                class93.field1410 = 90;
            }
        } else if (field1042 == 110) {
            Statics.field1365 = new class72();
            Statics.field665.method2686(Statics.field1365, 10);
            class93.field1427 = class226.field2980;
            class93.field1410 = 94;
            field1042 = 120;
        } else if (field1042 == 120) {
            if (Statics.field2807.method3772("huffman", "")) {
                class166 var72 = new class166(Statics.field2807.method3769("huffman", ""));
                Statics.field3640 = var72;
                class93.field1427 = class226.field2865;
                class93.field1410 = 96;
                field1042 = 130;
            } else {
                class93.field1427 = class226.field3005 + "%";
                class93.field1410 = 96;
            }
        } else if (field1042 == 130) {
            if (!Statics.field552.method3770()) {
                class93.field1427 = class226.field3083 + Statics.field552.method3844() * 4 / 5 + "%";
                class93.field1410 = 100;
            } else if (!Statics.field925.method3770()) {
                class93.field1427 = class226.field3083 + (80 + Statics.field925.method3844() / 6) + "%";
                class93.field1410 = 100;
            } else if (Statics.field2257.method3770()) {
                class93.field1427 = class226.field3027;
                class93.field1410 = 98;
                field1042 = 140;
            } else {
                class93.field1427 = class226.field3083 + (96 + Statics.field2257.method3844() / 50) + "%";
                class93.field1410 = 100;
            }
        } else if (field1042 == 140) {
            if (Statics.field1509.method3784(class41.field516.field511)) {
                if (Statics.field230 == null) {
                    Statics.field230 = new class289();
                    Statics.field230.method4796(Statics.field1509, Statics.field545, field949, Statics.field307);
                }
                int var73 = Statics.field230.method4844();
                if (var73 < 100) {
                    class93.field1427 = class226.field2868 + (var73 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1427 = class226.field2869;
                    class93.field1410 = 100;
                    field1042 = 150;
                }
            } else {
                class93.field1427 = class226.field2868 + Statics.field1509.method3773(class41.field516.field511) / 10 + "%";
            }
        } else if (field1042 == 150) {
            method6(10);
        }
    }

    @ObfuscatedName("o.fx(IZZZI)Lib;")
    public static class238 method61(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2225 != null) {
            var4 = new class161(arg0, class156.field2225, Statics.field2227[arg0], 1000000);
        }
        return new class238(var4, Statics.field407, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fb(I)V")
    public final void method1375() {
        try {
            if (field1024 == 0) {
                if (Statics.field1541 != null) {
                    Statics.field1541.method2745();
                    Statics.field1541 = null;
                }
                Statics.field3321 = null;
                field1055 = false;
                field1059 = 0;
                field1024 = 1;
            }
            if (field1024 == 1) {
                if (Statics.field3321 == null) {
                    Statics.field3321 = Statics.field665.method2698(Statics.field10, Statics.field660);
                }
                if (Statics.field3321.field2197 == 2) {
                    throw new IOException();
                }
                if (Statics.field3321.field2197 == 1) {
                    Statics.field1541 = new class160((Socket) Statics.field3321.field2205, Statics.field665);
                    Statics.field3321 = null;
                    field1024 = 2;
                }
            }
            if (field1024 == 2) {
                field937.field2364 = 0;
                field937.method2899(14);
                Statics.field1541.method2739(field937.field2367, 0, 1);
                field939.field2364 = 0;
                field1024 = 3;
            }
            if (field1024 == 3) {
                if (Statics.field265 != null) {
                    Statics.field265.method1939();
                }
                if (Statics.field2089 != null) {
                    Statics.field2089.method1939();
                }
                int var1 = Statics.field1541.method2734();
                if (Statics.field265 != null) {
                    Statics.field265.method1939();
                }
                if (Statics.field2089 != null) {
                    Statics.field2089.method1939();
                }
                if (var1 != 0) {
                    method232(var1);
                    return;
                }
                field939.field2364 = 0;
                field1024 = 4;
            }
            if (field1024 == 4) {
                if (field939.field2364 < 8) {
                    int var2 = Statics.field1541.method2738();
                    if (var2 > 8 - field939.field2364) {
                        var2 = 8 - field939.field2364;
                    }
                    if (var2 > 0) {
                        Statics.field1541.method2735(field939.field2367, field939.field2364, var2);
                        field939.field2364 += var2;
                    }
                }
                if (field939.field2364 == 8) {
                    field939.field2364 = 0;
                    Statics.field3529 = field939.method2920();
                    field1024 = 5;
                }
            }
            if (field1024 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field3529 >> 32), (int) (Statics.field3529 & 0xFFFFFFFFFFFFFFFFL) };
                field937.field2364 = 0;
                field937.method2899(1);
                field937.method2899(class93.field1419.method8());
                field937.method2902(var3[0]);
                field937.method2902(var3[1]);
                field937.method2902(var3[2]);
                field937.method2902(var3[3]);
                switch(class93.field1419.field2173) {
                    case 0:
                        field937.method2902((Integer) Statics.field2320.field1281.get(class271.method1715(class93.field1396)));
                        field937.field2364 += 4;
                        break;
                    case 1:
                    case 3:
                        field937.method2901(Statics.field535);
                        field937.field2364 += 5;
                        break;
                    case 2:
                        field937.field2364 += 8;
                }
                field937.method2905(class93.field1418);
                field937.method2961(class91.field1380, class91.field1376);
                field938.field2364 = 0;
                if (field900 == 40) {
                    field938.method2899(18);
                } else {
                    field938.method2899(16);
                }
                field938.method2900(0);
                int var4 = field938.field2364;
                field938.method2902(151);
                field938.method3036(field937.field2367, 0, field937.field2364);
                int var5 = field938.field2364;
                field938.method2905(class93.field1396);
                field938.method2899((field1098 ? 1 : 0) << 1 | (field898 ? 1 : 0));
                field938.method2900(Statics.field419);
                field938.method2900(Statics.field800);
                method996(field938);
                field938.method2905(Statics.field366);
                field938.method2902(Statics.field35);
                class174 var6 = new class174(Statics.field468.method4978());
                Statics.field468.method4981(var6);
                field938.method3036(var6.field2367, 0, var6.field2367.length);
                field938.method2899(Statics.field795);
                field938.method2902(0);
                field938.method2902(Statics.field797.field3207);
                field938.method2902(Statics.field775.field3207);
                field938.method2902(Statics.field2135.field3207);
                field938.method2902(Statics.field552.field3207);
                field938.method2902(Statics.field2556.field3207);
                field938.method2902(Statics.field1035.field3207);
                field938.method2902(Statics.field18.field3207);
                field938.method2902(Statics.field640.field3207);
                field938.method2902(Statics.field1256.field3207);
                field938.method2902(Statics.field1654.field3207);
                field938.method2902(Statics.field2807.field3207);
                field938.method2902(Statics.field24.field3207);
                field938.method2902(Statics.field925.field3207);
                field938.method2902(Statics.field2257.field3207);
                field938.method2902(Statics.field1391.field3207);
                field938.method2902(Statics.field324.field3207);
                field938.method2902(Statics.field1509.field3207);
                field938.method2933(var3, var5, field938.field2364);
                field938.method2910(field938.field2364 - var4);
                Statics.field1541.method2739(field938.field2367, 0, field938.field2364);
                field937.method3132(var3);
                for (int var7 = 0; var7 < 4; var7++) {
                    var3[var7] += 50;
                }
                field939.method3132(var3);
                field1024 = 6;
            }
            if (field1024 == 6 && Statics.field1541.method2738() > 0) {
                int var8 = Statics.field1541.method2734();
                if (var8 == 21 && field900 == 20) {
                    field1024 = 7;
                } else if (var8 == 2) {
                    field1024 = 9;
                } else if (var8 == 15 && field900 == 40) {
                    field1067 = -1;
                    field1024 = 13;
                } else if (var8 == 23 && field929 < 1) {
                    field929++;
                    field1024 = 0;
                } else if (var8 == 29) {
                    field1024 = 11;
                } else {
                    method232(var8);
                    return;
                }
            }
            if (field1024 == 7 && Statics.field1541.method2738() > 0) {
                field930 = (Statics.field1541.method2734() + 3) * 60;
                field1024 = 8;
            }
            if (field1024 == 8) {
                field1059 = 0;
                class93.method1385(class226.field2873, class226.field2874, field930 / 60 + class226.field2875);
                if (--field930 <= 0) {
                    field1024 = 0;
                }
            } else {
                if (field1024 == 9 && Statics.field1541.method2738() >= 13) {
                    boolean var9 = Statics.field1541.method2734() == 1;
                    Statics.field1541.method2735(field939.field2367, 0, 4);
                    field939.field2364 = 0;
                    boolean var10 = false;
                    if (var9) {
                        int var11 = field939.method3134() << 24;
                        int var12 = var11 | field939.method3134() << 16;
                        int var13 = var12 | field939.method3134() << 8;
                        int var14 = var13 | field939.method3134();
                        int var15 = class271.method1715(class93.field1396);
                        if (Statics.field2320.field1281.size() >= 10 && !Statics.field2320.field1281.containsKey(var15)) {
                            Iterator var16 = Statics.field2320.field1281.entrySet().iterator();
                            var16.next();
                            var16.remove();
                        }
                        Statics.field2320.field1281.put(var15, var14);
                        class82.method1605();
                    }
                    field914 = Statics.field1541.method2734();
                    field1053 = Statics.field1541.method2734() == 1;
                    field1005 = Statics.field1541.method2734();
                    field1005 <<= 0x8;
                    field1005 += Statics.field1541.method2734();
                    field1102 = Statics.field1541.method2734();
                    Statics.field1541.method2735(field939.field2367, 0, 1);
                    field939.field2364 = 0;
                    field941 = field939.method3134();
                    Statics.field1541.method2735(field939.field2367, 0, 2);
                    field939.field2364 = 0;
                    field1067 = field939.method2916();
                    try {
                        class53.method679(Statics.field1458, "zap");
                    } catch (Throwable var27) {
                    }
                    field1024 = 10;
                }
                if (field1024 != 10) {
                    if (field1024 == 11 && Statics.field1541.method2738() >= 2) {
                        field939.field2364 = 0;
                        Statics.field1541.method2735(field939.field2367, 0, 2);
                        field939.field2364 = 0;
                        Statics.field2293 = field939.method2916();
                        field1024 = 12;
                    }
                    if (field1024 == 12 && Statics.field1541.method2738() >= Statics.field2293) {
                        field939.field2364 = 0;
                        Statics.field1541.method2735(field939.field2367, 0, Statics.field2293);
                        field939.field2364 = 0;
                        String var18 = field939.method2922();
                        String var19 = field939.method2922();
                        String var20 = field939.method2922();
                        class93.method1385(var18, var19, var20);
                        method6(10);
                    }
                    if (field1024 == 13) {
                        if (field1067 == -1) {
                            if (Statics.field1541.method2738() < 2) {
                                return;
                            }
                            Statics.field1541.method2735(field939.field2367, 0, 2);
                            field939.field2364 = 0;
                            field1067 = field939.method2916();
                        }
                        if (Statics.field1541.method2738() >= field1067) {
                            Statics.field1541.method2735(field939.field2367, 0, field1067);
                            field939.field2364 = 0;
                            int var21 = field1067;
                            field937.field2364 = 0;
                            field939.field2364 = 0;
                            field941 = -1;
                            field1023 = -1;
                            field1013 = -1;
                            field946 = -1;
                            field1067 = 0;
                            field942 = 0;
                            field909 = 0;
                            field948 = 0;
                            field1022 = false;
                            field1119 = 0;
                            field1117 = 0;
                            for (int var22 = 0; var22 < 2048; var22++) {
                                field1004[var22] = null;
                            }
                            Statics.field2829 = null;
                            for (int var23 = 0; var23 < field932.length; var23++) {
                                class87 var24 = field932[var23];
                                if (var24 != null) {
                                    var24.field1216 = -1;
                                    var24.field1220 = false;
                                }
                            }
                            class64.field756 = new class191(32);
                            method6(30);
                            for (int var25 = 0; var25 < 100; var25++) {
                                field1089[var25] = true;
                            }
                            field937.method3133(197);
                            field937.method2899(method46());
                            field937.method2900(Statics.field419);
                            field937.method2900(Statics.field800);
                            class97.method1617(field939);
                            if (field939.field2364 != var21) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field1059++;
                        if (field1059 > 2000) {
                            if (field929 < 1) {
                                if (Statics.field660 == Statics.field3150) {
                                    Statics.field660 = Statics.field255;
                                } else {
                                    Statics.field660 = Statics.field3150;
                                }
                                field929++;
                                field1024 = 0;
                            } else {
                                method232(-3);
                            }
                        }
                    }
                } else if (Statics.field1541.method2738() >= field1067) {
                    field939.field2364 = 0;
                    Statics.field1541.method2735(field939.field2367, 0, field1067);
                    method4482();
                    class97.method1617(field939);
                    Statics.field475 = -1;
                    method474(false);
                    field941 = -1;
                }
            }
        } catch (IOException var28) {
            if (field929 < 1) {
                if (Statics.field660 == Statics.field3150) {
                    Statics.field660 = Statics.field255;
                } else {
                    Statics.field660 = Statics.field3150;
                }
                field929++;
                field1024 = 0;
            } else {
                method232(-2);
            }
        }
    }

    @ObfuscatedName("jh.fo(I)V")
    public static void method4482() {
        field1025 = 1L;
        field906 = -1;
        Statics.field1365.field838 = 0;
        Statics.field2381 = true;
        field917 = true;
        field1109 = -1L;
        class281.field3736 = new class192();
        field937.field2364 = 0;
        field939.field2364 = 0;
        field941 = -1;
        field1023 = -1;
        field1013 = -1;
        field946 = -1;
        field942 = 0;
        field909 = 0;
        field947 = 0;
        field1116 = 0;
        field948 = 0;
        field1022 = false;
        class60.method17(0);
        class99.method935();
        field1037 = 0;
        field1147 = false;
        field1125 = 0;
        field915 = 0;
        field1119 = 0;
        field1112 = -1;
        field1117 = 0;
        field1012 = 0;
        field1118 = class92.field1394;
        field919 = class92.field1394;
        field933 = 0;
        class97.method491();
        for (int var0 = 0; var0 < 2048; var0++) {
            field1004[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field932[var1] = null;
        }
        field928 = -1;
        field1016.method3347();
        field1017.method3347();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field1084[var2][var3][var4] = null;
                }
            }
        }
        field1015 = new class194();
        field1145 = 0;
        field1150 = 0;
        field1154 = 0;
        for (int var5 = 0; var5 < Statics.field23; var5++) {
            class242 var6 = class242.method174(var5);
            if (var6 != null) {
                class212.field2588[var5] = 0;
                class212.field2585[var5] = 0;
            }
        }
        Statics.field629.method1645();
        field1052 = -1;
        if (field1044 != -1) {
            Statics.method2796(field1044);
        }
        for (class69 var7 = (class69) field1097.method3265(); var7 != null; var7 = (class69) field1097.method3266()) {
            method2876(var7, true);
        }
        field1044 = -1;
        field1097 = new class191(8);
        field896 = null;
        field948 = 0;
        field1022 = false;
        field1156.method3614((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field1019[var8] = null;
            field1011[var8] = false;
        }
        class64.field756 = new class191(32);
        field901 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field1089[var9] = true;
        }
        field937.method3133(197);
        field937.method2899(method46());
        field937.method2900(Statics.field419);
        field937.method2900(Statics.field800);
        field1110 = null;
        Statics.field328 = 0;
        Statics.field488 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field1159[var10] = new class17();
        }
        Statics.field3351 = null;
    }

    @ObfuscatedName("ag.fn(IS)V")
    public static void method232(int arg0) {
        if (arg0 == -3) {
            class93.method1385(class226.field2876, class226.field2877, class226.field2892);
        } else if (arg0 == -2) {
            class93.method1385(class226.field2966, class226.field2880, class226.field2998);
        } else if (arg0 == -1) {
            class93.method1385(class226.field3101, class226.field2883, class226.field2884);
        } else if (arg0 == 3) {
            class93.field1424 = 3;
        } else if (arg0 == 4) {
            class93.method1385(class226.field2885, class226.field2886, class226.field2887);
        } else if (arg0 == 5) {
            class93.method1385(class226.field2968, class226.field2889, class226.field2890);
        } else if (arg0 == 6) {
            class93.method1385(class226.field2891, class226.field2935, class226.field2893);
        } else if (arg0 == 7) {
            class93.method1385(class226.field3096, class226.field2895, class226.field2896);
        } else if (arg0 == 8) {
            class93.method1385(class226.field2993, class226.field2867, class226.field2899);
        } else if (arg0 == 9) {
            class93.method1385(class226.field2900, class226.field3002, class226.field2902);
        } else if (arg0 == 10) {
            class93.method1385(class226.field2903, class226.field2904, class226.field2905);
        } else if (arg0 == 11) {
            class93.method1385(class226.field2906, class226.field3069, class226.field2940);
        } else if (arg0 == 12) {
            class93.method1385(class226.field2982, class226.field2901, class226.field2871);
        } else if (arg0 == 13) {
            class93.method1385(class226.field2912, class226.field2913, class226.field3106);
        } else if (arg0 == 14) {
            class93.method1385(class226.field3040, class226.field2916, class226.field2917);
        } else if (arg0 == 16) {
            class93.method1385(class226.field2918, class226.field2919, class226.field2947);
        } else if (arg0 == 17) {
            class93.method1385(class226.field2921, class226.field2922, class226.field2923);
        } else if (arg0 == 18) {
            class93.method1385(class226.field2924, class226.field2925, class226.field2926);
        } else if (arg0 == 19) {
            class93.method1385(class226.field2927, class226.field2914, class226.field2929);
        } else if (arg0 == 20) {
            class93.method1385(class226.field2930, class226.field2909, class226.field2932);
        } else if (arg0 == 22) {
            class93.method1385(class226.field2933, class226.field2939, class226.field2888);
        } else if (arg0 == 23) {
            class93.method1385(class226.field2936, class226.field3044, class226.field3023);
        } else if (arg0 == 24) {
            class93.method1385(class226.field2866, class226.field2954, class226.field2941);
        } else if (arg0 == 25) {
            class93.method1385(class226.field2942, class226.field2943, class226.field2991);
        } else if (arg0 == 26) {
            class93.method1385(class226.field2834, class226.field3079, class226.field3086);
        } else if (arg0 == 27) {
            class93.method1385(class226.field2948, class226.field2949, class226.field2950);
        } else if (arg0 == 31) {
            class93.method1385(class226.field2857, class226.field2958, class226.field2959);
        } else if (arg0 == 32) {
            class93.method1385(class226.field2960, class226.field2961, class226.field2962);
        } else if (arg0 == 37) {
            class93.method1385(class226.field2963, class226.field2964, class226.field2965);
        } else if (arg0 == 38) {
            class93.method1385(class226.field2859, class226.field2967, class226.field2957);
        } else if (arg0 == 55) {
            class93.method1385(class226.field2969, class226.field2970, class226.field2971);
        } else if (arg0 == 56) {
            class93.method1385(class226.field2985, class226.field3010, class226.field2974);
            method6(11);
            return;
        } else if (arg0 == 57) {
            class93.method1385(class226.field3021, class226.field3067, class226.field2977);
            method6(11);
            return;
        } else {
            class93.method1385(class226.field2978, class226.field2979, class226.field3059);
        }
        method6(10);
    }

    @ObfuscatedName("aj.fh(I)V")
    public static final void method677() {
        if (Statics.field1541 != null) {
            Statics.field1541.method2745();
            Statics.field1541 = null;
        }
        method1603();
        Statics.field630.method2461();
        for (int var0 = 0; var0 < 4; var0++) {
            field955[var0].method2774();
        }
        System.gc();
        class204.method199(2);
        field1070 = -1;
        field1122 = false;
        for (class83 var1 = (class83) class83.field1287.method3323(); var1 != null; var1 = (class83) class83.field1287.method3325()) {
            if (var1.field1292 != null) {
                Statics.field19.method1775(var1.field1292);
                var1.field1292 = null;
            }
            if (var1.field1297 != null) {
                Statics.field19.method1775(var1.field1297);
                var1.field1297 = null;
            }
        }
        class83.field1287.method3347();
        method6(10);
    }

    @ObfuscatedName("cb.fe(S)V")
    public static final void method1603() {
        class260.field3568.method3250();
        class247.field3329.method3250();
        class248.field3330.method3250();
        class256.field3418.method3250();
        class256.field3448.method3250();
        class256.field3454.method3250();
        class256.field3421.method3250();
        class259.method1014();
        class257.method3737();
        class261.field3584.method3250();
        class261.field3592.method3250();
        class246.method233();
        class251.method1594();
        class242.method3151();
        class255.field3393.method3250();
        class255.field3392.method3250();
        class255.field3394.method3250();
        class249.method462();
        class253.field3374.method3250();
        class252.method3723();
        class243.field3278.method3250();
        Statics.method492();
        class217.method2364();
        ((class126) Statics.field2002).method2159();
        class100.field1502.method3250();
        Statics.field797.method3764();
        Statics.field775.method3764();
        Statics.field552.method3764();
        Statics.field2556.method3764();
        Statics.field1035.method3764();
        Statics.field18.method3764();
        Statics.field640.method3764();
        Statics.field1256.method3764();
        Statics.field1654.method3764();
        Statics.field2807.method3764();
        Statics.field24.method3764();
        Statics.field925.method3764();
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1061() {
        if (field909 > 1) {
            field909--;
        }
        if (field947 > 0) {
            field947--;
        }
        if (field1055) {
            field1055 = false;
            if (field947 > 0) {
                method677();
            } else {
                method6(40);
                Statics.field1340 = Statics.field1541;
                Statics.field1541 = null;
            }
            return;
        }
        if (!field1022) {
            field948 = 0;
            field1022 = false;
            field1028[0] = class226.field3073;
            field1029[0] = "";
            field1026[0] = 1006;
            field1014[0] = false;
            field948 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1336(); var1++) {
        }
        if (field900 != 30) {
            return;
        }
        while (true) {
            class280 var2 = (class280) class281.field3736.method3282();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                Object var5 = Statics.field1365.field840;
                synchronized (Statics.field1365.field840) {
                    if (!field959) {
                        Statics.field1365.field838 = 0;
                    } else if (class60.field698 != 0 || Statics.field1365.field838 >= 40) {
                        field937.method3133(143);
                        field937.method2899(0);
                        int var6 = field937.field2364;
                        int var7 = 0;
                        for (int var8 = 0; var8 < Statics.field1365.field838 && field937.field2364 - var6 < 240; var8++) {
                            var7++;
                            int var9 = Statics.field1365.field842[var8];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 502) {
                                var9 = 502;
                            }
                            int var10 = Statics.field1365.field839[var8];
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > 764) {
                                var10 = 764;
                            }
                            int var11 = var9 * 765 + var10;
                            if (Statics.field1365.field842[var8] == -1 && Statics.field1365.field839[var8] == -1) {
                                var10 = -1;
                                var9 = -1;
                                var11 = 524287;
                            }
                            if (field968 != var10 || field988 != var9) {
                                int var12 = var10 - field968;
                                field968 = var10;
                                int var13 = var9 - field988;
                                field988 = var9;
                                if (field906 < 8 && var12 >= -32 && var12 <= 31 && var13 >= -32 && var13 <= 31) {
                                    var12 += 32;
                                    var13 += 32;
                                    field937.method2900((field906 << 12) + (var12 << 6) + var13);
                                    field906 = 0;
                                } else if (field906 < 8) {
                                    field937.method2901((field906 << 19) + 8388608 + var11);
                                    field906 = 0;
                                } else {
                                    field937.method2902((field906 << 19) + -1073741824 + var11);
                                    field906 = 0;
                                }
                            } else if (field906 < 2047) {
                                field906++;
                            }
                        }
                        field937.method3047(field937.field2364 - var6);
                        if (var7 >= Statics.field1365.field838) {
                            Statics.field1365.field838 = 0;
                        } else {
                            Statics.field1365.field838 -= var7;
                            for (int var14 = 0; var14 < Statics.field1365.field838; var14++) {
                                Statics.field1365.field839[var14] = Statics.field1365.field839[var7 + var14];
                                Statics.field1365.field842[var14] = Statics.field1365.field842[var7 + var14];
                            }
                        }
                    }
                }
                if (class60.field698 == 1 || !Statics.field793 && class60.field698 == 4 || class60.field698 == 2) {
                    long var16 = (class60.field715 - field1025 * -1L) / 50L;
                    if (var16 > 4095L) {
                        var16 = 4095L;
                    }
                    field1025 = class60.field715 * -1L;
                    int var18 = class60.field714;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field800) {
                        var18 = Statics.field800;
                    }
                    int var19 = class60.field710;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > Statics.field419) {
                        var19 = Statics.field419;
                    }
                    int var20 = (int) var16;
                    field937.method3133(208);
                    field937.method2900((class60.field698 == 2 ? 1 : 0) + (var20 << 1));
                    field937.method2900(var19);
                    field937.method2900(var18);
                }
                if (class51.field612 > 0) {
                    field937.method3133(246);
                    field937.method2900(0);
                    int var21 = field937.field2364;
                    long var22 = class176.method3746();
                    for (int var24 = 0; var24 < class51.field612; var24++) {
                        long var25 = var22 - field1109;
                        if (var25 > 16777215L) {
                            var25 = 16777215L;
                        }
                        field1109 = var22;
                        field937.method3009((int) var25);
                        field937.method2939(class51.field618[var24]);
                    }
                    field937.method2910(field937.field2364 - var21);
                }
                if (field974 > 0) {
                    field974--;
                }
                if (class51.field605[96] || class51.field605[97] || class51.field605[98] || class51.field605[99]) {
                    field1140 = true;
                }
                if (field1140 && field974 <= 0) {
                    field974 = 20;
                    field1140 = false;
                    field937.method3133(11);
                    field937.method3097(field915);
                    field937.method3097(field978);
                }
                if (Statics.field2381 && !field917) {
                    field917 = true;
                    field937.method3133(112);
                    field937.method2899(1);
                }
                if (!Statics.field2381 && field917) {
                    field917 = false;
                    field937.method3133(112);
                    field937.method2899(0);
                }
                method1409();
                if (field900 != 30) {
                    return;
                }
                for (class77 var27 = (class77) field1015.method3323(); var27 != null; var27 = (class77) field1015.method3325()) {
                    if (var27.field1175 > 0) {
                        var27.field1175--;
                    }
                    if (var27.field1175 == 0) {
                        if (var27.field1178 >= 0) {
                            int var28 = var27.field1178;
                            int var29 = var27.field1167;
                            class256 var30 = class256.method997(var28);
                            if (var29 == 11) {
                                var29 = 10;
                            }
                            if (var29 >= 5 && var29 <= 8) {
                                var29 = 4;
                            }
                            boolean var31 = var30.method4121(var29);
                            if (!var31) {
                                continue;
                            }
                        }
                        method985(var27.field1180, var27.field1165, var27.field1166, var27.field1172, var27.field1178, var27.field1169, var27.field1167);
                        var27.method3312();
                    } else {
                        if (var27.field1174 > 0) {
                            var27.field1174--;
                        }
                        if (var27.field1174 == 0 && var27.field1166 >= 1 && var27.field1172 >= 1 && var27.field1166 <= 102 && var27.field1172 <= 102) {
                            if (var27.field1171 >= 0) {
                                int var32 = var27.field1171;
                                int var33 = var27.field1164;
                                class256 var34 = class256.method997(var32);
                                if (var33 == 11) {
                                    var33 = 10;
                                }
                                if (var33 >= 5 && var33 <= 8) {
                                    var33 = 4;
                                }
                                boolean var35 = var34.method4121(var33);
                                if (!var35) {
                                    continue;
                                }
                            }
                            method985(var27.field1180, var27.field1165, var27.field1166, var27.field1172, var27.field1171, var27.field1168, var27.field1164);
                            var27.field1174 = -1;
                            if (var27.field1178 == var27.field1171 && var27.field1178 == -1) {
                                var27.method3312();
                            } else if (var27.field1178 == var27.field1171 && var27.field1169 == var27.field1168 && var27.field1167 == var27.field1164) {
                                var27.method3312();
                            }
                        }
                    }
                }
                int var10002;
                for (int var36 = 0; var36 < field1125; var36++) {
                    var10002 = field1106[var36]--;
                    if (field1106[var36] >= -10) {
                        class108 var38 = field1130[var36];
                        if (var38 == null) {
                            class108 var10000 = (class108) null;
                            var38 = class108.method1835(Statics.field2556, field1090[var36], 0);
                            if (var38 == null) {
                                continue;
                            }
                            field1106[var36] += var38.method1834();
                            field1130[var36] = var38;
                        }
                        if (field1106[var36] < 0) {
                            int var45;
                            if (field1129[var36] == 0) {
                                var45 = field1126;
                            } else {
                                int var39 = (field1129[var36] & 0xFF) * 128;
                                int var40 = field1129[var36] >> 16 & 0xFF;
                                int var41 = var40 * 128 + 64 - Statics.field2829.field1232;
                                if (var41 < 0) {
                                    var41 = -var41;
                                }
                                int var42 = field1129[var36] >> 8 & 0xFF;
                                int var43 = var42 * 128 + 64 - Statics.field2829.field1191;
                                if (var43 < 0) {
                                    var43 = -var43;
                                }
                                int var44 = var41 + var43 - 128;
                                if (var44 > var39) {
                                    field1106[var36] = -100;
                                    continue;
                                }
                                if (var44 < 0) {
                                    var44 = 0;
                                }
                                var45 = field1124 * (var39 - var44) / var39;
                            }
                            if (var45 > 0) {
                                class110 var46 = var38.method1833().method1881(Statics.field1540);
                                class120 var47 = class120.method2004(var46, 100, var45);
                                var47.method2007(field918[var36] - 1);
                                Statics.field19.method1774(var47);
                            }
                            field1106[var36] = -100;
                        }
                    } else {
                        field1125--;
                        for (int var37 = var36; var37 < field1125; var37++) {
                            field1090[var37] = field1090[var37 + 1];
                            field1130[var37] = field1130[var37 + 1];
                            field918[var37] = field918[var37 + 1];
                            field1106[var37] = field1106[var37 + 1];
                            field1129[var37] = field1129[var37 + 1];
                        }
                        var36--;
                    }
                }
                if (field1122 && !class204.method610()) {
                    if (field1120 != 0 && field1070 != -1) {
                        class204.method3124(Statics.field18, field1070, 0, field1120, false);
                    }
                    field1122 = false;
                }
                field942++;
                if (field942 > 750) {
                    if (field947 > 0) {
                        method677();
                    } else {
                        method6(40);
                        Statics.field1340 = Statics.field1541;
                        Statics.field1541 = null;
                    }
                    return;
                }
                int var48 = class97.field1471;
                int[] var49 = class97.field1469;
                for (int var50 = 0; var50 < var48; var50++) {
                    class75 var51 = field1004[var49[var50]];
                    if (var51 != null) {
                        method1716(var51, 1);
                    }
                }
                method3988();
                int[] var52 = class97.field1469;
                for (int var53 = 0; var53 < class97.field1471; var53++) {
                    class75 var54 = field1004[var52[var53]];
                    if (var54 != null && var54.field1214 > 0) {
                        var54.field1214--;
                        if (var54.field1214 == 0) {
                            var54.field1226 = null;
                        }
                    }
                }
                for (int var55 = 0; var55 < field933; var55++) {
                    int var56 = field934[var55];
                    class87 var57 = field932[var56];
                    if (var57 != null && var57.field1214 > 0) {
                        var57.field1214--;
                        if (var57.field1214 == 0) {
                            var57.field1226 = null;
                        }
                    }
                }
                field1079++;
                if (field994 != 0) {
                    field1135 += 20;
                    if (field1135 >= 400) {
                        field994 = 0;
                    }
                }
                if (Statics.field375 != null) {
                    field995++;
                    if (field995 >= 15) {
                        method625(Statics.field375);
                        Statics.field375 = null;
                    }
                }
                class217 var58 = Statics.field3303;
                class217 var59 = Statics.field1373;
                Statics.field3303 = null;
                Statics.field1373 = null;
                field1061 = null;
                field1065 = false;
                field1062 = false;
                field1034 = 0;
                while (class51.method64() && field1034 < 128) {
                    if (field914 >= 2 && class51.field605[82] && Statics.field2349 == 66) {
                        String var60 = "";
                        Iterator var61 = class99.field1495.iterator();
                        while (var61.hasNext()) {
                            class73 var62 = (class73) var61.next();
                            var60 = var60 + var62.field848 + ':' + var62.field849 + '\n';
                        }
                        Statics.field1458.method743(var60);
                    } else {
                        field1108[field1034] = Statics.field2349;
                        field1107[field1034] = Statics.field9;
                        field1034++;
                    }
                }
                if (field1044 != -1) {
                    method576(field1044, 0, 0, Statics.field419, Statics.field800, 0, 0);
                }
                field1069++;
                while (true) {
                    class70 var65;
                    class217 var66;
                    class217 var67;
                    do {
                        var65 = (class70) field975.method3334();
                        if (var65 == null) {
                            while (true) {
                                class70 var68;
                                class217 var69;
                                class217 var70;
                                do {
                                    var68 = (class70) field927.method3334();
                                    if (var68 == null) {
                                        while (true) {
                                            class70 var71;
                                            class217 var72;
                                            class217 var73;
                                            do {
                                                var71 = (class70) field1083.method3334();
                                                if (var71 == null) {
                                                    this.method1068();
                                                    if (Statics.field230 != null) {
                                                        Statics.field230.method4804(Statics.field237, (Statics.field2829.field1232 >> 7) + Statics.field448, (Statics.field2829.field1191 >> 7) + Statics.field301, false);
                                                        Statics.field230.method4818();
                                                    }
                                                    if (field913 != null) {
                                                        this.method1071();
                                                    }
                                                    if (Statics.field308 != null) {
                                                        method625(Statics.field308);
                                                        field1048++;
                                                        if (class60.field705 == 0) {
                                                            if (field924) {
                                                                if (Statics.field565 == Statics.field308 && field997 != field1000) {
                                                                    class217 var74 = Statics.field308;
                                                                    byte var75 = 0;
                                                                    if (field1047 == 1 && var74.field2739 == 206) {
                                                                        var75 = 1;
                                                                    }
                                                                    if (var74.field2748[field1000] <= 0) {
                                                                        var75 = 0;
                                                                    }
                                                                    if (class218.method1030(method2879(var74))) {
                                                                        int var76 = field997;
                                                                        int var77 = field1000;
                                                                        var74.field2748[var77] = var74.field2748[var76];
                                                                        var74.field2749[var77] = var74.field2749[var76];
                                                                        var74.field2748[var76] = -1;
                                                                        var74.field2749[var76] = 0;
                                                                    } else if (var75 == 1) {
                                                                        int var78 = field997;
                                                                        int var79 = field1000;
                                                                        while (var78 != var79) {
                                                                            if (var78 > var79) {
                                                                                var74.method3664(var78 - 1, var78);
                                                                                var78--;
                                                                            } else if (var78 < var79) {
                                                                                var74.method3664(var78 + 1, var78);
                                                                                var78++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var74.method3664(field1000, field997);
                                                                    }
                                                                    field937.method3133(76);
                                                                    field937.method3097(field997);
                                                                    field937.method2940(var75);
                                                                    field937.method2902(Statics.field308.field2630);
                                                                    field937.method3044(field1000);
                                                                }
                                                            } else if (this.method1278()) {
                                                                this.method1179(field998, field999);
                                                            } else if (field948 > 0) {
                                                                int var80 = field998;
                                                                int var81 = field999;
                                                                method71(Statics.field318, var80, var81);
                                                                Statics.field318 = null;
                                                            }
                                                            field995 = 10;
                                                            class60.field698 = 0;
                                                            Statics.field308 = null;
                                                        } else if (field1048 >= 5 && (class60.field697 > field998 + 5 || class60.field697 < field998 - 5 || class60.field706 * -119379047 > field999 + 5 || class60.field706 * -119379047 < field999 - 5)) {
                                                            field924 = true;
                                                        }
                                                    }
                                                    if (class140.method2500()) {
                                                        int var82 = class140.field2072;
                                                        int var83 = class140.field2060;
                                                        field937.method3133(229);
                                                        field937.method2899(5);
                                                        field937.method2936(Statics.field301 + var83);
                                                        field937.method3097(Statics.field448 + var82);
                                                        field937.method2940(class51.field605[82] ? (class51.field605[81] ? 2 : 1) : 0);
                                                        class140.method2564();
                                                        field1057 = class60.field710;
                                                        field1085 = class60.field714;
                                                        field994 = 1;
                                                        field1135 = 0;
                                                        field1117 = var82;
                                                        field1012 = var83;
                                                    }
                                                    if (Statics.field3303 != var58) {
                                                        if (var58 != null) {
                                                            method625(var58);
                                                        }
                                                        if (Statics.field3303 != null) {
                                                            method625(Statics.field3303);
                                                        }
                                                    }
                                                    if (Statics.field1373 != var59 && field1088 == field1036) {
                                                        if (var59 != null) {
                                                            method625(var59);
                                                        }
                                                        if (Statics.field1373 != null) {
                                                            method625(Statics.field1373);
                                                        }
                                                    }
                                                    if (Statics.field1373 == null) {
                                                        if (field1088 > 0) {
                                                            field1088--;
                                                        }
                                                    } else if (field1088 < field1036) {
                                                        field1088++;
                                                        if (field1088 == field1036) {
                                                            method625(Statics.field1373);
                                                        }
                                                    }
                                                    int var84 = Statics.field2829.field1232;
                                                    int var85 = Statics.field2829.field1191;
                                                    if (Statics.field2314 - var84 < -500 || Statics.field2314 - var84 > 500 || Statics.field1536 - var85 < -500 || Statics.field1536 - var85 > 500) {
                                                        Statics.field2314 = var84;
                                                        Statics.field1536 = var85;
                                                    }
                                                    if (Statics.field2314 != var84) {
                                                        Statics.field2314 += (var84 - Statics.field2314) / 16;
                                                    }
                                                    if (Statics.field1536 != var85) {
                                                        Statics.field1536 += (var85 - Statics.field1536) / 16;
                                                    }
                                                    if (class60.field705 == 4 && Statics.field793) {
                                                        int var86 = class60.field706 * -119379047 - field992 * -119379047;
                                                        field1081 = var86 * 2;
                                                        field992 = (var86 == -1 || var86 == 1 ? class60.field706 * -119379047 : (field992 * -119379047 + class60.field706 * -119379047) / 2) * 358201513;
                                                        int var87 = field971 - class60.field697;
                                                        field969 = var87 * 2;
                                                        field971 = var87 == -1 || var87 == 1 ? class60.field697 : (field971 + class60.field697) / 2;
                                                    } else {
                                                        if (class51.field605[96]) {
                                                            field969 += (-24 - field969) / 2;
                                                        } else if (class51.field605[97]) {
                                                            field969 += (24 - field969) / 2;
                                                        } else {
                                                            field969 /= 2;
                                                        }
                                                        if (class51.field605[98]) {
                                                            field1081 += (12 - field1081) / 2;
                                                        } else if (class51.field605[99]) {
                                                            field1081 += (-12 - field1081) / 2;
                                                        } else {
                                                            field1081 /= 2;
                                                        }
                                                        field992 = class60.field706;
                                                        field971 = class60.field697;
                                                    }
                                                    field915 = field969 / 2 + field915 & 0x7FF;
                                                    field978 += field1081 / 2;
                                                    if (field978 < 128) {
                                                        field978 = 128;
                                                    }
                                                    if (field978 > 383) {
                                                        field978 = 383;
                                                    }
                                                    int var88 = Statics.field2314 >> 7;
                                                    int var89 = Statics.field1536 >> 7;
                                                    int var90 = method118(Statics.field2314, Statics.field1536, Statics.field237);
                                                    int var91 = 0;
                                                    if (var88 > 3 && var89 > 3 && var88 < 100 && var89 < 100) {
                                                        for (int var92 = var88 - 4; var92 <= var88 + 4; var92++) {
                                                            for (int var93 = var89 - 4; var93 <= var89 + 4; var93++) {
                                                                int var94 = Statics.field237;
                                                                if (var94 < 3 && (class63.field735[1][var92][var93] & 0x2) == 2) {
                                                                    var94++;
                                                                }
                                                                int var95 = var90 - class63.field750[var94][var92][var93];
                                                                if (var95 > var91) {
                                                                    var91 = var95;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var96 = var91 * 192;
                                                    if (var96 > 98048) {
                                                        var96 = 98048;
                                                    }
                                                    if (var96 < 32768) {
                                                        var96 = 32768;
                                                    }
                                                    if (var96 > field976) {
                                                        field976 += (var96 - field976) / 24;
                                                    } else if (var96 < field976) {
                                                        field976 += (var96 - field976) / 80;
                                                    }
                                                    if (field1131) {
                                                        int var97 = Statics.field2606 * 128 + 64;
                                                        int var98 = Statics.field1199 * 128 + 64;
                                                        int var99 = method118(var97, var98, Statics.field237) - Statics.field2231;
                                                        if (Statics.field1366 < var97) {
                                                            Statics.field1366 += Statics.field2403 * (var97 - Statics.field1366) / 1000 + Statics.field3639;
                                                            if (Statics.field1366 > var97) {
                                                                Statics.field1366 = var97;
                                                            }
                                                        }
                                                        if (Statics.field1366 > var97) {
                                                            Statics.field1366 -= Statics.field2403 * (Statics.field1366 - var97) / 1000 + Statics.field3639;
                                                            if (Statics.field1366 < var97) {
                                                                Statics.field1366 = var97;
                                                            }
                                                        }
                                                        if (Statics.field2090 < var99) {
                                                            Statics.field2090 += Statics.field2403 * (var99 - Statics.field2090) / 1000 + Statics.field3639;
                                                            if (Statics.field2090 > var99) {
                                                                Statics.field2090 = var99;
                                                            }
                                                        }
                                                        if (Statics.field2090 > var99) {
                                                            Statics.field2090 -= Statics.field2403 * (Statics.field2090 - var99) / 1000 + Statics.field3639;
                                                            if (Statics.field2090 < var99) {
                                                                Statics.field2090 = var99;
                                                            }
                                                        }
                                                        if (Statics.field588 < var98) {
                                                            Statics.field588 += Statics.field2403 * (var98 - Statics.field588) / 1000 + Statics.field3639;
                                                            if (Statics.field588 > var98) {
                                                                Statics.field588 = var98;
                                                            }
                                                        }
                                                        if (Statics.field588 > var98) {
                                                            Statics.field588 -= Statics.field2403 * (Statics.field588 - var98) / 1000 + Statics.field3639;
                                                            if (Statics.field588 < var98) {
                                                                Statics.field588 = var98;
                                                            }
                                                        }
                                                        int var100 = Statics.field1492 * 128 + 64;
                                                        int var101 = Statics.field578 * 128 + 64;
                                                        int var102 = method118(var100, var101, Statics.field237) - Statics.field327;
                                                        int var103 = var100 - Statics.field1366;
                                                        int var104 = var102 - Statics.field2090;
                                                        int var105 = var101 - Statics.field588;
                                                        int var106 = (int) Math.sqrt((double) (var103 * var103 + var105 * var105));
                                                        int var107 = (int) (Math.atan2((double) var104, (double) var106) * 325.949D) & 0x7FF;
                                                        int var108 = (int) (Math.atan2((double) var103, (double) var105) * -325.949D) & 0x7FF;
                                                        if (var107 < 128) {
                                                            var107 = 128;
                                                        }
                                                        if (var107 > 383) {
                                                            var107 = 383;
                                                        }
                                                        if (Statics.field966 < var107) {
                                                            Statics.field966 += Statics.field560 * (var107 - Statics.field966) / 1000 + Statics.field467;
                                                            if (Statics.field966 > var107) {
                                                                Statics.field966 = var107;
                                                            }
                                                        }
                                                        if (Statics.field966 > var107) {
                                                            Statics.field966 -= Statics.field560 * (Statics.field966 - var107) / 1000 + Statics.field467;
                                                            if (Statics.field966 < var107) {
                                                                Statics.field966 = var107;
                                                            }
                                                        }
                                                        int var109 = var108 - Statics.field730;
                                                        if (var109 > 1024) {
                                                            var109 -= 2048;
                                                        }
                                                        if (var109 < -1024) {
                                                            var109 += 2048;
                                                        }
                                                        if (var109 > 0) {
                                                            Statics.field730 += Statics.field560 * var109 / 1000 + Statics.field467;
                                                            Statics.field730 &= 0x7FF;
                                                        }
                                                        if (var109 < 0) {
                                                            Statics.field730 -= Statics.field560 * -var109 / 1000 + Statics.field467;
                                                            Statics.field730 &= 0x7FF;
                                                        }
                                                        int var110 = var108 - Statics.field730;
                                                        if (var110 > 1024) {
                                                            var110 -= 2048;
                                                        }
                                                        if (var110 < -1024) {
                                                            var110 += 2048;
                                                        }
                                                        if (var110 < 0 && var109 > 0 || var110 > 0 && var109 < 0) {
                                                            Statics.field730 = var108;
                                                        }
                                                    }
                                                    for (int var111 = 0; var111 < 5; var111++) {
                                                        var10002 = field1094[var111]++;
                                                    }
                                                    Statics.field629.method1642();
                                                    int var112 = class60.method47();
                                                    int var113 = class51.field616;
                                                    if (var112 > 15000 && var113 > 15000) {
                                                        field947 = 250;
                                                        class60.method17(14500);
                                                        field937.method3133(98);
                                                    }
                                                    for (class68 var115 = (class68) field1153.method3353(); var115 != null; var115 = (class68) field1153.method3358()) {
                                                        if ((long) var115.field799 < class176.method3746() / 1000L - 5L) {
                                                            if (var115.field794 > 0) {
                                                                class99.method3389(5, "", var115.field801 + class226.field2843);
                                                            }
                                                            if (var115.field794 == 0) {
                                                                class99.method3389(5, "", var115.field801 + class226.field2992);
                                                            }
                                                            var115.method3362();
                                                        }
                                                    }
                                                    field1030++;
                                                    if (field1030 > 50) {
                                                        field937.method3133(181);
                                                    }
                                                    try {
                                                        if (Statics.field1541 != null && field937.field2364 > 0) {
                                                            Statics.field1541.method2739(field937.field2367, 0, field937.field2364);
                                                            field937.field2364 = 0;
                                                            field1030 = 0;
                                                        }
                                                    } catch (IOException var117) {
                                                        if (field947 > 0) {
                                                            method677();
                                                        } else {
                                                            method6(40);
                                                            Statics.field1340 = Statics.field1541;
                                                            Statics.field1541 = null;
                                                        }
                                                    }
                                                    return;
                                                }
                                                var72 = var71.field813;
                                                if (var72.field2631 < 0) {
                                                    break;
                                                }
                                                var73 = class217.method2656(var72.field2649);
                                            } while (var73 == null || var73.field2754 == null || var72.field2631 >= var73.field2754.length || var73.field2754[var72.field2631] != var72);
                                            class84.method1011(var71);
                                        }
                                    }
                                    var69 = var68.field813;
                                    if (var69.field2631 < 0) {
                                        break;
                                    }
                                    var70 = class217.method2656(var69.field2649);
                                } while (var70 == null || var70.field2754 == null || var69.field2631 >= var70.field2754.length || var70.field2754[var69.field2631] != var69);
                                class84.method1011(var68);
                            }
                        }
                        var66 = var65.field813;
                        if (var66.field2631 < 0) {
                            break;
                        }
                        var67 = class217.method2656(var66.field2649);
                    } while (var67 == null || var67.field2754 == null || var66.field2631 >= var67.field2754.length || var67.field2754[var66.field2631] != var66);
                    class84.method1011(var65);
                }
            }
            field937.method3133(172);
            field937.method2899(0);
            int var4 = field937.field2364;
            Statics.method1057(field937);
            field937.method3047(field937.field2364 - var4);
        }
    }

    @ObfuscatedName("er.fj(B)V")
    public static final void method2362() {
        if (Statics.field2089 != null) {
            Statics.field2089.method1909();
        }
        if (Statics.field265 != null) {
            Statics.field265.method1909();
        }
    }

    @ObfuscatedName("c.fw(Ljj;IIII)V")
    public static void method130(class261 arg0, int arg1, int arg2, int arg3) {
        if (field1125 >= 50 || field1124 == 0 || arg0.field3597 == null || arg1 >= arg0.field3597.length) {
            return;
        }
        int var4 = arg0.field3597[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1090[field1125] = var5;
        field918[field1125] = var6;
        field1106[field1125] = 0;
        field1130[field1125] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1129[field1125] = (var8 << 16) + (var9 << 8) + var7;
        field1125++;
    }

    @ObfuscatedName("bb.fs(IIIB)V")
    public static void method1015(int arg0, int arg1, int arg2) {
        if (field1126 == 0 || arg1 == 0 || field1125 >= 50) {
            return;
        }
        field1090[field1125] = arg0;
        field918[field1125] = arg1;
        field1106[field1125] = arg2;
        field1130[field1125] = null;
        field1129[field1125] = 0;
        field1125++;
    }

    @ObfuscatedName("ct.fd(III)V")
    public static void method1540(int arg0, int arg1) {
        if (field1120 != 0 && arg0 != -1) {
            class204.method3124(Statics.field24, arg0, 0, field1120, false);
            field1122 = true;
        }
    }

    @ObfuscatedName("cl.fc(B)V")
    public static final void method1409() {
        if (Statics.field237 != field1112) {
            field1112 = Statics.field237;
            method2722(Statics.field237);
        }
    }

    @ObfuscatedName("eg.fa(Lhn;III)V")
    public static final void method2682(class217 arg0, int arg1, int arg2) {
        if (field1119 != 0 && field1119 != 3 || class60.field698 != 1 && Statics.field793 || class60.field698 != 4) {
            return;
        }
        class211 var3 = arg0.method3669(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field710 - arg1;
        int var5 = class60.field714 - arg2;
        if (!var3.method3590(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2581 / 2;
        int var7 = var5 - var3.field2582 / 2;
        int var8 = field915 & 0x7FF;
        int var9 = class137.field1997[var8];
        int var10 = class137.field1992[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2829.field1232 + var11 >> 7;
        int var14 = Statics.field2829.field1191 - var12 >> 7;
        field937.method3133(147);
        field937.method2899(18);
        field937.method2936(Statics.field301 + var14);
        field937.method3097(Statics.field448 + var13);
        field937.method2940(class51.field605[82] ? (class51.field605[81] ? 2 : 1) : 0);
        field937.method2899(var6);
        field937.method2899(var7);
        field937.method2900(field915);
        field937.method2899(57);
        field937.method2899(0);
        field937.method2899(0);
        field937.method2899(89);
        field937.method2900(Statics.field2829.field1232);
        field937.method2900(Statics.field2829.field1191);
        field937.method2899(63);
        field1117 = var13;
        field1012 = var14;
    }

    @ObfuscatedName("k.fg(Ljava/lang/String;I)V")
    public static final void method116(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2320.field1278 = !Statics.field2320.field1278;
            class82.method1605();
            if (Statics.field2320.field1278) {
                class99.method3389(99, "", "Roofs are now all hidden");
            } else {
                class99.method3389(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field945 = !field945;
        }
        if (arg0.equalsIgnoreCase("clickbox")) {
            class134.field1939 = !class134.field1939;
            class99.method3389(99, "", "Clickbox Mode: " + (class134.field1939 ? "AABB" : "Legacy"));
        }
        if (field914 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field229) {
                    class8.field229 = true;
                    class8.field228 = class12.field253;
                    class99.method3389(99, "", "AABB boxes: All");
                } else if (class8.field228 == class12.field253) {
                    class8.field229 = true;
                    class8.field228 = class12.field257;
                    class99.method3389(99, "", "AABB boxes: Mouse Over");
                } else {
                    class8.field229 = false;
                    class99.method3389(99, "", "AABB boxes: Off");
                }
            }
            if (arg0.equalsIgnoreCase("legacyboxes")) {
                class8.field226 = !class8.field226;
                class99.method3389(99, "", "Show legacy boxes: " + class8.field226);
            }
            if (arg0.equalsIgnoreCase("geotests")) {
                class8.field231 = !class8.field231;
                class99.method3389(99, "", "Show geometry tests: " + class8.field231);
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field945 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field945 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field947 > 0) {
                    method677();
                } else {
                    method6(40);
                    Statics.field1340 = Statics.field1541;
                    Statics.field1541 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field895 == 2) {
                throw new RuntimeException();
            }
        }
        field937.method3133(66);
        field937.method2899(arg0.length() + 1);
        field937.method2905(arg0);
    }

    @ObfuscatedName("il.fy(I)V")
    public static final void method3988() {
        for (int var0 = 0; var0 < field933; var0++) {
            int var1 = field934[var0];
            class87 var2 = field932[var1];
            if (var2 != null) {
                method1716(var2, var2.field1343.field3536);
            }
        }
    }

    @ObfuscatedName("cp.fi(Lcj;II)V")
    public static final void method1716(class79 arg0, int arg1) {
        if (arg0.field1236 > field902) {
            method2657(arg0);
        } else if (arg0.field1208 >= field902) {
            method608(arg0);
        } else {
            method1771(arg0);
        }
        if (arg0.field1232 < 128 || arg0.field1191 < 128 || arg0.field1232 >= 13184 || arg0.field1191 >= 13184) {
            arg0.field1222 = -1;
            arg0.field1227 = -1;
            arg0.field1236 = 0;
            arg0.field1208 = 0;
            arg0.field1232 = arg0.field1245[0] * 128 + arg0.field1217 * 64;
            arg0.field1191 = arg0.field1246[0] * 128 + arg0.field1217 * 64;
            arg0.method1393();
        }
        if (Statics.field2829 == arg0 && (arg0.field1232 < 1536 || arg0.field1191 < 1536 || arg0.field1232 >= 11776 || arg0.field1191 >= 11776)) {
            arg0.field1222 = -1;
            arg0.field1227 = -1;
            arg0.field1236 = 0;
            arg0.field1208 = 0;
            arg0.field1232 = arg0.field1245[0] * 128 + arg0.field1217 * 64;
            arg0.field1191 = arg0.field1246[0] * 128 + arg0.field1217 * 64;
            arg0.method1393();
        }
        if (arg0.field1243 != 0) {
            if (arg0.field1216 != -1) {
                class79 var2 = null;
                if (arg0.field1216 < 32768) {
                    var2 = field932[arg0.field1216];
                } else if (arg0.field1216 >= 32768) {
                    var2 = field1004[arg0.field1216 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field1232 - var2.field1232;
                    int var4 = arg0.field1191 - var2.field1191;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field1241 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1220) {
                    arg0.field1216 = -1;
                    arg0.field1220 = false;
                }
            }
            if (arg0.field1210 != -1 && (arg0.field1235 == 0 || arg0.field1248 > 0)) {
                arg0.field1241 = arg0.field1210;
                arg0.field1210 = -1;
            }
            int var5 = arg0.field1241 - arg0.field1192 & 0x7FF;
            if (var5 == 0 && arg0.field1220) {
                arg0.field1216 = -1;
                arg0.field1220 = false;
            }
            if (var5 == 0) {
                arg0.field1242 = 0;
            } else {
                arg0.field1242++;
                if (var5 > 1024) {
                    arg0.field1192 -= arg0.field1243;
                    boolean var6 = true;
                    if (var5 < arg0.field1243 || var5 > 2048 - arg0.field1243) {
                        arg0.field1192 = arg0.field1241;
                        var6 = false;
                    }
                    if (arg0.field1211 == arg0.field1195 && (arg0.field1242 > 25 || var6)) {
                        if (arg0.field1196 == -1) {
                            arg0.field1211 = arg0.field1198;
                        } else {
                            arg0.field1211 = arg0.field1196;
                        }
                    }
                } else {
                    arg0.field1192 += arg0.field1243;
                    boolean var7 = true;
                    if (var5 < arg0.field1243 || var5 > 2048 - arg0.field1243) {
                        arg0.field1192 = arg0.field1241;
                        var7 = false;
                    }
                    if (arg0.field1211 == arg0.field1195 && (arg0.field1242 > 25 || var7)) {
                        if (arg0.field1197 == -1) {
                            arg0.field1211 = arg0.field1198;
                        } else {
                            arg0.field1211 = arg0.field1197;
                        }
                    }
                }
                arg0.field1192 &= 0x7FF;
            }
        }
        arg0.field1193 = false;
        if (arg0.field1211 != -1) {
            class261 var9 = class261.method494(arg0.field1211);
            if (var9 == null || var9.field3586 == null) {
                arg0.field1211 = -1;
            } else {
                arg0.field1221++;
                if (arg0.field1223 < var9.field3586.length && arg0.field1221 > var9.field3589[arg0.field1223]) {
                    arg0.field1221 = 1;
                    arg0.field1223++;
                    method130(var9, arg0.field1223, arg0.field1232, arg0.field1191);
                }
                if (arg0.field1223 >= var9.field3586.length) {
                    arg0.field1221 = 0;
                    arg0.field1223 = 0;
                    method130(var9, arg0.field1223, arg0.field1232, arg0.field1191);
                }
            }
        }
        if (arg0.field1227 != -1 && field902 >= arg0.field1230) {
            if (arg0.field1228 < 0) {
                arg0.field1228 = 0;
            }
            int var10 = class246.method465(arg0.field1227).field3310;
            if (var10 == -1) {
                arg0.field1227 = -1;
            } else {
                class261 var11 = class261.method494(var10);
                if (var11 == null || var11.field3586 == null) {
                    arg0.field1227 = -1;
                } else {
                    arg0.field1229++;
                    if (arg0.field1228 < var11.field3586.length && arg0.field1229 > var11.field3589[arg0.field1228]) {
                        arg0.field1229 = 1;
                        arg0.field1228++;
                        method130(var11, arg0.field1228, arg0.field1232, arg0.field1191);
                    }
                    if (arg0.field1228 >= var11.field3586.length && (arg0.field1228 < 0 || arg0.field1228 >= var11.field3586.length)) {
                        arg0.field1227 = -1;
                    }
                }
            }
        }
        if (arg0.field1222 != -1 && arg0.field1225 <= 1) {
            class261 var12 = class261.method494(arg0.field1222);
            if (var12.field3585 == 1 && arg0.field1249 > 0 && arg0.field1236 <= field902 && arg0.field1208 < field902) {
                arg0.field1225 = 1;
                return;
            }
        }
        if (arg0.field1222 != -1 && arg0.field1225 == 0) {
            class261 var13 = class261.method494(arg0.field1222);
            if (var13 == null || var13.field3586 == null) {
                arg0.field1222 = -1;
            } else {
                arg0.field1224++;
                if (arg0.field1237 < var13.field3586.length && arg0.field1224 > var13.field3589[arg0.field1237]) {
                    arg0.field1224 = 1;
                    arg0.field1237++;
                    method130(var13, arg0.field1237, arg0.field1232, arg0.field1191);
                }
                if (arg0.field1237 >= var13.field3586.length) {
                    arg0.field1237 -= var13.field3590;
                    arg0.field1219++;
                    if (arg0.field1219 >= var13.field3596) {
                        arg0.field1222 = -1;
                    } else if (arg0.field1237 >= 0 && arg0.field1237 < var13.field3586.length) {
                        method130(var13, arg0.field1237, arg0.field1232, arg0.field1191);
                    } else {
                        arg0.field1222 = -1;
                    }
                }
                arg0.field1193 = var13.field3581;
            }
        }
        if (arg0.field1225 > 0) {
            arg0.field1225--;
        }
    }

    @ObfuscatedName("es.fr(Lcj;B)V")
    public static final void method2657(class79 arg0) {
        int var1 = arg0.field1236 - field902;
        int var2 = arg0.field1217 * 64 + arg0.field1205 * 128;
        int var3 = arg0.field1234 * 128 + arg0.field1217 * 64;
        arg0.field1232 += (var2 - arg0.field1232) / var1;
        arg0.field1191 += (var3 - arg0.field1191) / var1;
        arg0.field1248 = 0;
        arg0.field1241 = arg0.field1209;
    }

    @ObfuscatedName("as.ga(Lcj;I)V")
    public static final void method608(class79 arg0) {
        if (field902 == arg0.field1208 || arg0.field1222 == -1 || arg0.field1225 != 0 || arg0.field1224 + 1 > class261.method494(arg0.field1222).field3589[arg0.field1237]) {
            int var1 = arg0.field1208 - arg0.field1236;
            int var2 = field902 - arg0.field1236;
            int var3 = arg0.field1217 * 64 + arg0.field1205 * 128;
            int var4 = arg0.field1234 * 128 + arg0.field1217 * 64;
            int var5 = arg0.field1233 * 128 + arg0.field1217 * 64;
            int var6 = arg0.field1217 * 64 + arg0.field1202 * 128;
            arg0.field1232 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1191 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1248 = 0;
        arg0.field1241 = arg0.field1209;
        arg0.field1192 = arg0.field1241;
    }

    @ObfuscatedName("cn.gi(Lcj;I)V")
    public static final void method1771(class79 arg0) {
        arg0.field1211 = arg0.field1195;
        if (arg0.field1235 == 0) {
            arg0.field1248 = 0;
            return;
        }
        if (arg0.field1222 != -1 && arg0.field1225 == 0) {
            class261 var1 = class261.method494(arg0.field1222);
            if (arg0.field1249 > 0 && var1.field3585 == 0) {
                arg0.field1248++;
                return;
            }
            if (arg0.field1249 <= 0 && var1.field3598 == 0) {
                arg0.field1248++;
                return;
            }
        }
        int var2 = arg0.field1232;
        int var3 = arg0.field1191;
        int var4 = arg0.field1245[arg0.field1235 - 1] * 128 + arg0.field1217 * 64;
        int var5 = arg0.field1246[arg0.field1235 - 1] * 128 + arg0.field1217 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1241 = 1280;
            } else if (var3 > var5) {
                arg0.field1241 = 1792;
            } else {
                arg0.field1241 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1241 = 768;
            } else if (var3 > var5) {
                arg0.field1241 = 256;
            } else {
                arg0.field1241 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1241 = 1024;
        } else if (var3 > var5) {
            arg0.field1241 = 0;
        }
        byte var6 = arg0.field1247[arg0.field1235 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1232 = var4;
            arg0.field1191 = var5;
            arg0.field1235--;
            if (arg0.field1249 > 0) {
                arg0.field1249--;
            }
            return;
        }
        int var7 = arg0.field1241 - arg0.field1192 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1206;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1198;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1201;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1250;
        }
        if (var8 == -1) {
            var8 = arg0.field1198;
        }
        arg0.field1211 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class87) {
            var10 = ((class87) arg0).field1343.field3541;
        }
        if (var10) {
            if (arg0.field1241 != arg0.field1192 && arg0.field1216 == -1 && arg0.field1243 != 0) {
                var9 = 2;
            }
            if (arg0.field1235 > 2) {
                var9 = 6;
            }
            if (arg0.field1235 > 3) {
                var9 = 8;
            }
            if (arg0.field1248 > 0 && arg0.field1235 > 1) {
                var9 = 8;
                arg0.field1248--;
            }
        } else {
            if (arg0.field1235 > 1) {
                var9 = 6;
            }
            if (arg0.field1235 > 2) {
                var9 = 8;
            }
            if (arg0.field1248 > 0 && arg0.field1235 > 1) {
                var9 = 8;
                arg0.field1248--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1211 == arg0.field1198 && arg0.field1218 != -1) {
            arg0.field1211 = arg0.field1218;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1232 += var9;
                if (arg0.field1232 > var4) {
                    arg0.field1232 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1232 -= var9;
                if (arg0.field1232 < var4) {
                    arg0.field1232 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1191 += var9;
                if (arg0.field1191 > var5) {
                    arg0.field1191 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1191 -= var9;
                if (arg0.field1191 < var5) {
                    arg0.field1191 = var5;
                }
            }
        }
        if (arg0.field1232 == var4 && arg0.field1191 == var5) {
            arg0.field1235--;
            if (arg0.field1249 > 0) {
                arg0.field1249--;
            }
        }
    }

    @ObfuscatedName("aj.gw(Lbg;IIB)V")
    public static void method678(class75 arg0, int arg1, int arg2) {
        if (arg0.field1222 == arg1 && arg1 != -1) {
            int var3 = class261.method494(arg1).field3599;
            if (var3 == 1) {
                arg0.field1237 = 0;
                arg0.field1224 = 0;
                arg0.field1225 = arg2;
                arg0.field1219 = 0;
            }
            if (var3 == 2) {
                arg0.field1219 = 0;
            }
        } else if (arg1 == -1 || arg0.field1222 == -1 || class261.method494(arg1).field3593 >= class261.method494(arg0.field1222).field3593) {
            arg0.field1222 = arg1;
            arg0.field1237 = 0;
            arg0.field1224 = 0;
            arg0.field1225 = arg2;
            arg0.field1219 = 0;
            arg0.field1249 = arg0.field1235;
        }
    }

    @ObfuscatedName("g.gz(B)I")
    public static int method46() {
        return field1098 ? 2 : 1;
    }

    @ObfuscatedName("b.gc(II)V")
    public static void method86(int arg0) {
        field956 = 0L;
        if (arg0 >= 2) {
            field1098 = true;
        } else {
            field1098 = false;
        }
        if (method46() == 1) {
            Statics.field1458.method836(765, 503);
        } else {
            Statics.field1458.method836(7680, 2160);
        }
        if (field900 >= 25) {
            field937.method3133(197);
            field937.method2899(method46());
            field937.method2900(Statics.field419);
            field937.method2900(Statics.field800);
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method886() {
        field956 = class176.method3746() + 500L;
        this.method1345();
        if (field1044 != -1) {
            this.method1070(true);
        }
    }

    @ObfuscatedName("client.gl(I)V")
    public void method1345() {
        int var1 = Statics.field419;
        int var2 = Statics.field800;
        if (this.field675 < var1) {
            int var3 = this.field675;
        }
        if (this.field676 < var2) {
            int var4 = this.field676;
        }
        if (Statics.field2320 == null) {
            return;
        }
        try {
            client var5 = Statics.field1458;
            Object[] var6 = new Object[] { method46() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gp(I)V")
    public final void method1150() {
        if (field1044 != -1) {
            method689(field1044);
        }
        for (int var1 = 0; var1 < field1087; var1++) {
            if (field1089[var1]) {
                field972[var1] = true;
            }
            field1091[var1] = field1089[var1];
            field1089[var1] = false;
        }
        field907 = field902;
        field1033 = -1;
        field967 = -1;
        Statics.field565 = null;
        if (field1044 != -1) {
            field1087 = 0;
            method5(field1044, 0, 0, Statics.field419, Statics.field800, 0, 0, -1);
        }
        class282.method4542();
        if (field1022) {
            int var8 = Statics.field284;
            int var9 = Statics.field1520;
            int var10 = Statics.field262;
            int var11 = Statics.field283;
            int var12 = 6116423;
            class282.method4551(var8, var9, var10, var11, var12);
            class282.method4551(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class282.method4545(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field545.method4371(class226.field2987, var8 + 3, var9 + 14, var12, -1);
            int var13 = class60.field697;
            int var14 = class60.field706 * -119379047;
            for (int var15 = 0; var15 < field948; var15++) {
                int var16 = (field948 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                class264 var18 = Statics.field545;
                String var19;
                if (var15 < 0) {
                    var19 = "";
                } else if (field1029[var15].length() > 0) {
                    var19 = field1028[var15] + class226.field2938 + field1029[var15];
                } else {
                    var19 = field1028[var15];
                }
                var18.method4371(var19, var8 + 3, var16, var17, 0);
            }
            method157(Statics.field284, Statics.field1520, Statics.field262, Statics.field283);
        } else if (field1033 != -1) {
            int var2 = field1033;
            int var3 = field967;
            if (field948 >= 2 || field1037 != 0 || field1147) {
                int var4 = field948 - 1;
                String var6;
                if (field1037 == 1 && field948 < 2) {
                    var6 = class226.field2984 + class226.field2938 + field1038 + " " + class89.field1361;
                } else if (field1147 && field948 < 2) {
                    var6 = field973 + class226.field2938 + field1043 + " " + class89.field1361;
                } else {
                    String var7;
                    if (var4 < 0) {
                        var7 = "";
                    } else if (field1029[var4].length() > 0) {
                        var7 = field1028[var4] + class226.field2938 + field1029[var4];
                    } else {
                        var7 = field1028[var4];
                    }
                    var6 = var7;
                }
                if (field948 > 2) {
                    var6 = var6 + class89.method1751(16777215) + " " + '/' + " " + (field948 - 2) + class226.field3072;
                }
                Statics.field545.method4367(var6, var2 + 4, var3 + 15, 16777215, 0, field902 / 1000);
            }
        }
        if (field1096 == 3) {
            for (int var20 = 0; var20 < field1087; var20++) {
                if (field1091[var20]) {
                    class282.method4550(field1092[var20], field1093[var20], field1095[var20], field921[var20], 16711935, 128);
                } else if (field972[var20]) {
                    class282.method4550(field1092[var20], field1093[var20], field1095[var20], field921[var20], 16711680, 128);
                }
            }
        }
        class83.method481(Statics.field237, Statics.field2829.field1232, Statics.field2829.field1191, field1079);
        field1079 = 0;
    }

    @ObfuscatedName("v.gg(Ljava/lang/String;ZI)V")
    public static final void method16(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field306.method4380(arg0, 250);
        int var6 = Statics.field306.method4405(arg0, 250) * 13;
        class282.method4551(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class282.method4545(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field306.method4447(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method82(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field583.method722(0, 0);
        } else {
            method157(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("ck.gx(IIIIZI)V")
    public static final void method1672(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1001 - field1071) * var5 / 100 + field1071;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1138) {
            short var8 = field1138;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1142) {
                var6 = field1142;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class282.method4542();
                    class282.method4551(arg0, arg1, var10, arg3, -16777216);
                    class282.method4551(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1144) {
            short var11 = field1144;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1141) {
                var6 = field1141;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class282.method4542();
                    class282.method4551(arg0, arg1, arg2, var13, -16777216);
                    class282.method4551(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1018 - field1139) * var5 / 100 + field1139;
        field1060 = arg3 * var6 * var14 / 85504 << 1;
        if (field940 != arg2 || field1148 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field1997[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2496(var15, 500, 800, arg2, arg3);
        }
        field1073 = arg0;
        field1146 = arg1;
        field940 = arg2;
        field1148 = arg3;
    }

    @ObfuscatedName("ay.gt(Lbt;B)V")
    public static final void method514(class67 arg0) {
        if (Statics.field2829.field1232 >> 7 == field1117 && Statics.field2829.field1191 >> 7 == field1012) {
            field1117 = 0;
        }
        int var1 = class97.field1471;
        int[] var2 = class97.field1469;
        int var3 = var1;
        if (class67.field785 == arg0 || class67.field786 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field785 == arg0) {
                var5 = Statics.field2829;
                var6 = Statics.field2829.field866 << 14;
            } else if (class67.field786 == arg0) {
                var5 = field1004[field928];
                var6 = field928 << 14;
            } else {
                var5 = field1004[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field788 == arg0 && field928 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1037() && !var5.field878) {
                var5.field876 = false;
                if ((field898 && var1 > 50 || var1 > 200) && class67.field785 != arg0 && var5.field1211 == var5.field1195) {
                    var5.field876 = true;
                }
                int var7 = var5.field1232 >> 7;
                int var8 = var5.field1191 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field871 == null || field902 < var5.field879 || field902 >= var5.field861) {
                        if ((var5.field1232 & 0x7F) == 64 && (var5.field1191 & 0x7F) == 64) {
                            if (field1039 == field987[var7][var8]) {
                                continue;
                            }
                            field987[var7][var8] = field1039;
                        }
                        var5.field865 = method118(var5.field1232, var5.field1191, Statics.field237);
                        Statics.field630.method2472(Statics.field237, var5.field1232, var5.field1191, var5.field865, 60, var5, var5.field1192, var6, var5.field1193);
                    } else {
                        var5.field876 = false;
                        var5.field865 = method118(var5.field1232, var5.field1191, Statics.field237);
                        Statics.field630.method2489(Statics.field237, var5.field1232, var5.field1191, var5.field865, 60, var5, var5.field1192, var6, var5.field872, var5.field873, var5.field874, var5.field881);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.gm(ZI)V")
    public static final void method62(boolean arg0) {
        for (int var1 = 0; var1 < field933; var1++) {
            class87 var2 = field932[field934[var1]];
            int var3 = (field934[var1] << 14) + 536870912;
            if (var2 != null && var2.method1037() && var2.field1343.field3555 == arg0 && var2.field1343.method4246()) {
                int var4 = var2.field1232 >> 7;
                int var5 = var2.field1191 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1217 == 1 && (var2.field1232 & 0x7F) == 64 && (var2.field1191 & 0x7F) == 64) {
                        if (field1039 == field987[var4][var5]) {
                            continue;
                        }
                        field987[var4][var5] = field1039;
                    }
                    if (!var2.field1343.field3543) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field630.method2472(Statics.field237, var2.field1232, var2.field1191, method118(var2.field1232 + (var2.field1217 * 64 - 64), var2.field1191 + (var2.field1217 * 64 - 64), Statics.field237), var2.field1217 * 64 - 64 + 60, var2, var2.field1192, var3, var2.field1193);
                }
            }
        }
    }

    @ObfuscatedName("ai.gs(B)V")
    public static final void method318() {
        for (class94 var0 = (class94) field1016.method3323(); var0 != null; var0 = (class94) field1016.method3325()) {
            if (Statics.field237 != var0.field1452 || field902 > var0.field1440) {
                var0.method3312();
            } else if (field902 >= var0.field1441) {
                if (var0.field1447 > 0) {
                    class87 var1 = field932[var0.field1447 - 1];
                    if (var1 != null && var1.field1232 >= 0 && var1.field1232 < 13312 && var1.field1191 >= 0 && var1.field1191 < 13312) {
                        var0.method1608(var1.field1232, var1.field1191, method118(var1.field1232, var1.field1191, var0.field1452) - var0.field1438, field902);
                    }
                }
                if (var0.field1447 < 0) {
                    int var2 = -var0.field1447 - 1;
                    class75 var3;
                    if (field1005 == var2) {
                        var3 = Statics.field2829;
                    } else {
                        var3 = field1004[var2];
                    }
                    if (var3 != null && var3.field1232 >= 0 && var3.field1232 < 13312 && var3.field1191 >= 0 && var3.field1191 < 13312) {
                        var0.method1608(var3.field1232, var3.field1191, method118(var3.field1232, var3.field1191, var0.field1452) - var0.field1438, field902);
                    }
                }
                var0.method1615(field1079);
                Statics.field630.method2472(Statics.field237, (int) var0.field1445, (int) var0.field1446, (int) var0.field1454, 60, var0, var0.field1457, -1, false);
            }
        }
    }

    @ObfuscatedName("hn.gq(III)V")
    public static final void method3707(int arg0, int arg1) {
        if (field1116 == 2) {
            method13((field1149 - Statics.field448 << 7) + field916, (field1002 - Statics.field301 << 7) + field1010, field1127 * 2);
            if (field989 > -1 && field902 % 20 < 10) {
                Statics.field485[0].method4671(field989 + arg0 - 12, field990 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("cr.gj(Lcj;IIIIII)V")
    public static final void method1676(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1037()) {
            return;
        }
        if (arg0 instanceof class87) {
            class259 var6 = ((class87) arg0).field1343;
            if (var6.field3560 != null) {
                var6 = var6.method4244();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1471;
        int[] var8 = class97.field1469;
        int var9 = 3;
        if (!arg0.field1215.method3285()) {
            method234(arg0, arg0.field1240 + 15);
            for (class86 var10 = (class86) arg0.field1215.method3282(); var10 != null; var10 = (class86) arg0.field1215.method3277()) {
                class80 var11 = var10.method1548(field902);
                if (var11 != null) {
                    class249 var12 = var10.field1331;
                    class286 var13 = var12.method3993();
                    class286 var14 = var12.method3992();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3355;
                    } else {
                        if (var12.field3356 * 2 < var14.field3766) {
                            var15 = var12.field3356;
                        }
                        var16 = var14.field3766 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field902 - var11.field1258;
                    int var20 = var11.field1253 * var16 / var12.field3355;
                    int var23;
                    if (var11.field1254 > var19) {
                        int var21 = var12.field3343 == 0 ? 0 : var19 / var12.field3343 * var12.field3343;
                        int var22 = var11.field1252 * var16 / var12.field3355;
                        var23 = (var20 - var22) * var21 / var11.field1254 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1254 + var12.field3344 - var19;
                        if (var12.field3350 >= 0) {
                            var17 = (var24 << 8) / (var12.field3344 - var12.field3350);
                        }
                    }
                    if (var11.field1253 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field989 + arg2 - (var16 >> 1);
                    int var26 = field990 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field989 > -1) {
                            class282.method4551(var25, var26, var23, 5, 65280);
                            class282.method4551(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3768;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4739(var27, var26, var17);
                            class282.method4570(var27, var26, var27 + var28, var26 + var29);
                            var14.method4739(var27, var26, var17);
                        } else {
                            var13.method4671(var27, var26);
                            class282.method4570(var27, var26, var27 + var28, var26 + var29);
                            var14.method4671(var27, var26);
                        }
                        class282.method4560(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1543()) {
                    var10.method3312();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field878) {
                return;
            }
            if (var30.field867 != -1 || var30.field860 != -1) {
                method234(arg0, arg0.field1240 + 15);
                if (field989 > -1) {
                    if (var30.field867 != -1) {
                        Statics.field627[var30.field867].method4671(field989 + arg2 - 12, field990 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field860 != -1) {
                        Statics.field3413[var30.field860].method4671(field989 + arg2 - 12, field990 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field1116 == 10 && field912 == var8[arg1]) {
                method234(arg0, arg0.field1240 + 15);
                if (field989 > -1) {
                    Statics.field485[1].method4671(field989 + arg2 - 12, field990 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class87) arg0).field1343;
            if (var31.field3560 != null) {
                var31 = var31.method4244();
            }
            if (var31.field3535 >= 0 && var31.field3535 < Statics.field3413.length) {
                method234(arg0, arg0.field1240 + 15);
                if (field989 > -1) {
                    Statics.field3413[var31.field3535].method4671(field989 + arg2 - 12, field990 + arg3 - 30);
                }
            }
            if (field1116 == 1 && field911 == field934[arg1 - var7] && field902 % 20 < 10) {
                method234(arg0, arg0.field1240 + 15);
                if (field989 > -1) {
                    Statics.field485[0].method4671(field989 + arg2 - 12, field990 + arg3 - 28);
                }
            }
        }
        if (arg0.field1226 != null && (arg1 >= var7 || !arg0.field1194 && (field1101 == 4 || !arg0.field1204 && (field1101 == 0 || field1101 == 3 || field1101 == 1 && method237(((class75) arg0).field875, false))))) {
            method234(arg0, arg0.field1240);
            if (field989 > -1 && field977 < field935) {
                field982[field977] = Statics.field545.method4434(arg0.field1226) / 2;
                field904[field977] = Statics.field545.field3623;
                field979[field977] = field989;
                field980[field977] = field990;
                field983[field977] = arg0.field1207;
                field984[field977] = arg0.field1212;
                field985[field977] = arg0.field1214;
                field986[field977] = arg0.field1226;
                field977++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1244[var32];
            int var34 = arg0.field1203[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field902) {
                    continue;
                }
                var35 = class255.method3747(arg0.field1203[var32]);
                var36 = var35.field3414;
                if (var35 != null && var35.field3409 != null) {
                    var35 = var35.method4085();
                    if (var35 == null) {
                        arg0.field1244[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1213[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method3747(var37);
                if (var38 != null && var38.field3409 != null) {
                    var38 = var38.method4085();
                }
            }
            if (var33 - var36 <= field902) {
                if (var35 == null) {
                    arg0.field1244[var32] = -1;
                } else {
                    method234(arg0, arg0.field1240 / 2);
                    if (field989 > -1) {
                        if (var32 == 1) {
                            field990 -= 20;
                        }
                        if (var32 == 2) {
                            field989 -= 15;
                            field990 -= 10;
                        }
                        if (var32 == 3) {
                            field989 += 15;
                            field990 -= 10;
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
                        class286 var51 = null;
                        class286 var52 = null;
                        class286 var53 = null;
                        class286 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class286 var64 = var35.method4087();
                        if (var64 != null) {
                            var43 = var64.field3766;
                            int var65 = var64.field3768;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3769;
                        }
                        class286 var66 = var35.method4113();
                        if (var66 != null) {
                            var44 = var66.field3766;
                            int var67 = var66.field3768;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3769;
                        }
                        class286 var68 = var35.method4095();
                        if (var68 != null) {
                            var45 = var68.field3766;
                            int var69 = var68.field3768;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3769;
                        }
                        class286 var70 = var35.method4090();
                        if (var70 != null) {
                            var46 = var70.field3766;
                            int var71 = var70.field3768;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3769;
                        }
                        if (var38 != null) {
                            var51 = var38.method4087();
                            if (var51 != null) {
                                var55 = var51.field3766;
                                int var72 = var51.field3768;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3769;
                            }
                            var52 = var38.method4113();
                            if (var52 != null) {
                                var56 = var52.field3766;
                                int var73 = var52.field3768;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3769;
                            }
                            var53 = var38.method4095();
                            if (var53 != null) {
                                var57 = var53.field3766;
                                int var74 = var53.field3768;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3769;
                            }
                            var54 = var38.method4090();
                            if (var54 != null) {
                                var58 = var54.field3766;
                                int var75 = var54.field3768;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3769;
                            }
                        }
                        class264 var76 = var35.method4084();
                        if (var76 == null) {
                            var76 = Statics.field1341;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field1341;
                        } else {
                            var77 = var38.method4084();
                            if (var77 == null) {
                                var77 = Statics.field1341;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4100(arg0.field1200[var32]);
                        int var83 = var76.method4434(var82);
                        if (var38 != null) {
                            var79 = var38.method4100(arg0.field1238[var32]);
                            var81 = var77.method4434(var79);
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
                        int var100 = arg0.field1244[var32] - field902;
                        int var101 = var35.field3403 - var35.field3403 * var100 / var35.field3414;
                        int var102 = var35.field3402 * var100 / var35.field3414 + -var35.field3402;
                        int var103 = field989 + arg2 - (var92 >> 1) + var101;
                        int var104 = field990 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3408 + var104 + 15;
                        int var108 = var107 - var76.field3619;
                        int var109 = var76.field3620 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3408 + var104 + 15;
                            int var111 = var110 - var77.field3619;
                            int var112 = var77.field3620 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3405 >= 0) {
                            var115 = (var100 << 8) / (var35.field3414 - var35.field3405);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4739(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4739(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4739(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4739(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4361(var82, var90 + var103, var107, var35.field3397, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4739(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4739(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4739(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4739(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4361(var79, var98 + var103, var110, var38.field3397, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4671(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4671(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4671(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4671(var93 + var103 - var50, var104);
                            }
                            var76.method4371(var82, var90 + var103, var107, var35.field3397 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4671(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4671(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4671(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4671(var97 + var103 - var62, var104);
                                }
                                var77.method4371(var79, var98 + var103, var110, var38.field3397 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fj.ge(I)V")
    public static final void method2896() {
        field1003 = 0;
        int var0 = (Statics.field2829.field1232 >> 7) + Statics.field448;
        int var1 = (Statics.field2829.field1191 >> 7) + Statics.field301;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1003 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1003 = 1;
        }
        if (field1003 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1003 = 0;
        }
    }

    @ObfuscatedName("ar.gb(Lcj;II)V")
    public static final void method234(class79 arg0, int arg1) {
        method13(arg0.field1232, arg0.field1191, arg1);
    }

    @ObfuscatedName("e.gy(IIIB)V")
    public static final void method13(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field989 = -1;
            field990 = -1;
            return;
        }
        int var3 = method118(arg0, arg1, Statics.field237) - arg2;
        int var4 = arg0 - Statics.field1366;
        int var5 = var3 - Statics.field2090;
        int var6 = arg1 - Statics.field588;
        int var7 = class137.field1997[Statics.field966];
        int var8 = class137.field1992[Statics.field966];
        int var9 = class137.field1997[Statics.field730];
        int var10 = class137.field1992[Statics.field730];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field989 = field1060 * var11 / var15 + field940 / 2;
            field990 = field1060 * var14 / var15 + field1148 / 2;
        } else {
            field989 = -1;
            field990 = -1;
        }
    }

    @ObfuscatedName("n.go(IIII)I")
    public static final int method118(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class63.field735[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class63.field750[var5][var3][var4] + class63.field750[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class63.field750[var5][var3][var4 + 1] + class63.field750[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("g.gu(IIIIIII)V")
    public static final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class137.field1997[var6];
            int var12 = class137.field1992[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class137.field1997[var7];
            int var15 = class137.field1992[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1366 = arg0 - var8;
        Statics.field2090 = arg1 - var9;
        Statics.field588 = arg2 - var10;
        Statics.field966 = arg3;
        Statics.field730 = arg4;
    }

    @ObfuscatedName("ao.gf(ZI)V")
    public static final void method474(boolean arg0) {
        field1051 = arg0;
        if (!field1051) {
            int var1 = field939.method2948();
            int var2 = field939.method2948();
            int var3 = field939.method2916();
            Statics.field534 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field534[var4][var5] = field939.method2935();
                }
            }
            Statics.field2365 = new int[var3];
            Statics.field374 = new int[var3];
            Statics.field261 = new int[var3];
            Statics.field1652 = new byte[var3][];
            Statics.field1251 = new byte[var3][];
            boolean var6 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var1 / 8 == 48) {
                var6 = true;
            }
            if (var2 / 8 == 48 && var1 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        Statics.field2365[var7] = var10;
                        Statics.field374[var7] = Statics.field1035.method3766("m" + var8 + "_" + var9);
                        Statics.field261[var7] = Statics.field1035.method3766("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2650(var2, var1, true);
            return;
        }
        int var11 = field939.method2949();
        int var12 = field939.method2950();
        boolean var13 = field939.method2921() == 1;
        int var14 = field939.method2916();
        field939.method3135();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field939.method3136(1);
                    if (var18 == 1) {
                        field957[var15][var16][var17] = field939.method3136(26);
                    } else {
                        field957[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field939.method3137();
        Statics.field534 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field534[var19][var20] = field939.method2935();
            }
        }
        Statics.field2365 = new int[var14];
        Statics.field374 = new int[var14];
        Statics.field261 = new int[var14];
        Statics.field1652 = new byte[var14][];
        Statics.field1251 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field957[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field2365[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field2365[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field374[var21] = Statics.field1035.method3766("m" + var30 + "_" + var31);
                            Statics.field261[var21] = Statics.field1035.method3766("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method2650(var11, var12, !var13);
    }

    @ObfuscatedName("ee.gk(IIZB)V")
    public static final void method2650(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field475 == arg0 && Statics.field855 == arg1) {
            return;
        }
        Statics.field475 = arg0;
        Statics.field855 = arg1;
        method6(25);
        method16(class226.field2844, true);
        int var3 = Statics.field448;
        int var4 = Statics.field301;
        Statics.field448 = (arg0 - 6) * 8;
        Statics.field301 = (arg1 - 6) * 8;
        int var5 = Statics.field448 - var3;
        int var6 = Statics.field301 - var4;
        int var7 = Statics.field448;
        int var8 = Statics.field301;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field932[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1245[var11] -= var5;
                    var10.field1246[var11] -= var6;
                }
                var10.field1232 -= var5 * 128;
                var10.field1191 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1004[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1245[var14] -= var5;
                    var13.field1246[var14] -= var6;
                }
                var13.field1232 -= var5 * 128;
                var13.field1191 -= var6 * 128;
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
                        field1084[var25][var21][var22] = field1084[var25][var23][var24];
                    } else {
                        field1084[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1015.method3323(); var26 != null; var26 = (class77) field1015.method3325()) {
            var26.field1166 -= var5;
            var26.field1172 -= var6;
            if (var26.field1166 < 0 || var26.field1172 < 0 || var26.field1166 >= 104 || var26.field1172 >= 104) {
                var26.method3312();
            }
        }
        if (field1117 != 0) {
            field1117 -= var5;
            field1012 -= var6;
        }
        field1125 = 0;
        field1131 = false;
        field1112 = -1;
        field1017.method3347();
        field1016.method3347();
        for (int var27 = 0; var27 < 4; var27++) {
            field955[var27].method2774();
        }
    }

    @ObfuscatedName("fk.gn(II)V")
    public static final void method2722(int arg0) {
        int[] var1 = Statics.field620.field3767;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class63.field735[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field630.method2494(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class63.field735[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field630.method2494(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field620.method4662();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class63.field735[arg0][var10][var9] & 0x18) == 0) {
                    method3106(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class63.field735[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method3106(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1113 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field630.method2460(Statics.field237, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class256.method997(var14).field3444;
                    if (var15 >= 0) {
                        field1128[field1113] = Statics.field3287[var15].method3896(false);
                        field1114[field1113] = var11;
                        field1115[field1113] = var12;
                        field1113++;
                    }
                }
            }
        }
        Statics.field583.method4632();
    }

    @ObfuscatedName("fs.gd(IIIIII)V")
    public static final void method3106(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field630.method2487(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field630.method2473(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field620.field3767;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class256 var13 = class256.method997(var12);
            if (var13.field3445 == -1) {
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
                class285 var14 = Statics.field307[var13.field3445];
                if (var14 != null) {
                    int var15 = (var13.field3431 * 4 - var14.field3760) / 2;
                    int var16 = (var13.field3453 * 4 - var14.field3758) / 2;
                    var14.method4636(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3453) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field630.method2521(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field630.method2473(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class256 var22 = class256.method997(var21);
            if (var22.field3445 != -1) {
                class285 var23 = Statics.field307[var22.field3445];
                if (var23 != null) {
                    int var24 = (var22.field3431 * 4 - var23.field3760) / 2;
                    int var25 = (var22.field3453 * 4 - var23.field3758) / 2;
                    var23.method4636(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3453) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field620.field3767;
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
        int var29 = Statics.field630.method2460(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class256 var31 = class256.method997(var30);
        if (var31.field3445 == -1) {
            return;
        }
        class285 var32 = Statics.field307[var31.field3445];
        if (var32 != null) {
            int var33 = (var31.field3431 * 4 - var32.field3760) / 2;
            int var34 = (var31.field3453 * 4 - var32.field3758) / 2;
            var32.method4636(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3453) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gr(I)Z")
    public final boolean method1336() {
        if (Statics.field1541 == null) {
            return false;
        }
        try {
            int var1 = Statics.field1541.method2738();
            if (var1 == 0) {
                return false;
            }
            if (field941 == -1) {
                Statics.field1541.method2735(field939.field2367, 0, 1);
                field939.field2364 = 0;
                field941 = field939.method3134();
                field1067 = class273.field3689[field941];
                var1--;
            }
            if (field1067 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field1541.method2735(field939.field2367, 0, 1);
                field1067 = field939.field2367[0] & 0xFF;
                var1--;
            }
            if (field1067 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field1541.method2735(field939.field2367, 0, 2);
                field939.field2364 = 0;
                field1067 = field939.method2916();
                var1 -= 2;
            }
            if (var1 < field1067) {
                return false;
            }
            field939.field2364 = 0;
            Statics.field1541.method2735(field939.field2367, 0, field1067);
            field942 = 0;
            field946 = field1013;
            field1013 = field1023;
            field1023 = field941;
            if (field941 == 75) {
                field1131 = true;
                Statics.field1492 = field939.method2921();
                Statics.field578 = field939.method2921();
                Statics.field327 = field939.method2916();
                Statics.field467 = field939.method2921();
                Statics.field560 = field939.method2921();
                if (Statics.field560 >= 100) {
                    int var2 = Statics.field1492 * 128 + 64;
                    int var3 = Statics.field578 * 128 + 64;
                    int var4 = method118(var2, var3, Statics.field237) - Statics.field327;
                    int var5 = var2 - Statics.field1366;
                    int var6 = var4 - Statics.field2090;
                    int var7 = var3 - Statics.field588;
                    int var8 = (int) Math.sqrt((double) (var5 * var5 + var7 * var7));
                    Statics.field966 = (int) (Math.atan2((double) var6, (double) var8) * 325.949D) & 0x7FF;
                    Statics.field730 = (int) (Math.atan2((double) var5, (double) var7) * -325.949D) & 0x7FF;
                    if (Statics.field966 < 128) {
                        Statics.field966 = 128;
                    }
                    if (Statics.field966 > 383) {
                        Statics.field966 = 383;
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 249) {
                int var9 = field939.method2957();
                class217 var10 = class217.method2656(var9);
                var10.field2671 = 3;
                var10.field2674 = Statics.field2829.field858.method3625();
                method625(var10);
                field941 = -1;
                return true;
            }
            if (field941 == 125) {
                class81 var11 = new class81();
                var11.field1275 = field939.method2922();
                var11.field1269 = field939.method2916();
                int var12 = field939.method2935();
                var11.field1270 = var12;
                method6(45);
                Statics.field1541.method2745();
                Statics.field1541 = null;
                class93.method196(var11);
                field941 = -1;
                return false;
            }
            if (field941 == 52) {
                int var13 = field939.method2935();
                int var14 = field939.method2916();
                int var15 = var14 >> 10 & 0x1F;
                int var16 = var14 >> 5 & 0x1F;
                int var17 = var14 & 0x1F;
                int var18 = (var17 << 3) + (var15 << 19) + (var16 << 11);
                class217 var19 = class217.method2656(var13);
                if (var19.field2711 != var18) {
                    var19.field2711 = var18;
                    method625(var19);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 77) {
                int var20 = field939.method2916();
                byte var21 = field939.method2944();
                class212.field2588[var20] = var21;
                if (class212.field2585[var20] != var21) {
                    class212.field2585[var20] = var21;
                }
                method999(var20);
                field1080[++field991 - 1 & 0x1F] = var20;
                field941 = -1;
                return true;
            }
            if (field941 == 121) {
                int var22 = field939.method2935();
                int var23 = field939.method2916();
                if (var22 < -70000) {
                    var23 += 32768;
                }
                class217 var24;
                if (var22 >= 0) {
                    var24 = class217.method2656(var22);
                } else {
                    var24 = null;
                }
                if (var24 != null) {
                    for (int var25 = 0; var25 < var24.field2748.length; var25++) {
                        var24.field2748[var25] = 0;
                        var24.field2749[var25] = 0;
                    }
                }
                class64.method1721(var23);
                int var26 = field939.method2916();
                for (int var27 = 0; var27 < var26; var27++) {
                    int var28 = field939.method2948();
                    int var29 = field939.method2943();
                    if (var29 == 255) {
                        var29 = field939.method2942();
                    }
                    if (var24 != null && var27 < var24.field2748.length) {
                        var24.field2748[var27] = var28;
                        var24.field2749[var27] = var29;
                    }
                    Statics.method229(var23, var27, var28 - 1, var29);
                }
                if (var24 != null) {
                    method625(var24);
                }
                method1535();
                field1072[++field1161 - 1 & 0x1F] = var23 & 0x7FFF;
                field941 = -1;
                return true;
            }
            if (field941 == 185) {
                boolean var30 = field939.method2921() == 1;
                int var31 = field939.method2956();
                class217 var32 = class217.method2656(var31);
                if (var32.field2655 != var30) {
                    var32.field2655 = var30;
                    method625(var32);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 42) {
                int var33 = field939.method2921();
                class277[] var34 = class277.method2651();
                int var35 = 0;
                class277 var37;
                while (true) {
                    if (var35 >= var34.length) {
                        var37 = null;
                        break;
                    }
                    class277 var36 = var34[var35];
                    if (var36.field3723 == var33) {
                        var37 = var36;
                        break;
                    }
                    var35++;
                }
                Statics.field3722 = var37;
                field941 = -1;
                return true;
            }
            if (field941 == 105) {
                field1101 = field939.method2921();
                field1045 = field939.method2921();
                field941 = -1;
                return true;
            }
            if (field941 == 211) {
                class97.method669(field939, field1067);
                field941 = -1;
                return true;
            }
            if (field941 == 179) {
                method677();
                field941 = -1;
                return false;
            }
            if (field941 == 153) {
                int var38 = field939.method2921();
                int var39 = field939.method2921();
                int var40 = field939.method2921();
                int var41 = field939.method2921();
                field1006[var38] = true;
                field1133[var38] = var39;
                field1049[var38] = var40;
                field1054[var38] = var41;
                field1094[var38] = 0;
                field941 = -1;
                return true;
            }
            if (field941 == 86) {
                int var42 = field939.method2950();
                int var43 = field939.method2957();
                int var44 = field939.method2949();
                int var45 = field939.method2949();
                class217 var46 = class217.method2656(var43);
                if (var46.field2681 != var42 || var46.field2737 != var45 || var46.field2684 != var44) {
                    var46.field2681 = var42;
                    var46.field2737 = var45;
                    var46.field2684 = var44;
                    method625(var46);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 175) {
                String var47 = field939.method2922();
                int var48 = field939.method2916();
                byte var49 = field939.method3082();
                boolean var50 = false;
                if (var49 == -128) {
                    var50 = true;
                }
                if (var50) {
                    if (Statics.field328 == 0) {
                        field941 = -1;
                        return true;
                    }
                    boolean var51 = false;
                    int var52;
                    for (var52 = 0; var52 < Statics.field328 && (!Statics.field488[var52].field888.equals(var47) || Statics.field488[var52].field886 != var48); var52++) {
                    }
                    if (var52 < Statics.field328) {
                        while (var52 < Statics.field328 - 1) {
                            Statics.field488[var52] = Statics.field488[var52 + 1];
                            var52++;
                        }
                        Statics.field328--;
                        Statics.field488[Statics.field328] = null;
                    }
                } else {
                    field939.method2922();
                    class76 var53 = new class76();
                    var53.field888 = var47;
                    var53.field885 = class268.method43(var53.field888, Statics.field716);
                    var53.field886 = var48;
                    var53.field887 = var49;
                    int var54;
                    for (var54 = Statics.field328 - 1; var54 >= 0; var54--) {
                        int var55 = Statics.field488[var54].field885.compareTo(var53.field885);
                        if (var55 == 0) {
                            Statics.field488[var54].field886 = var48;
                            Statics.field488[var54].field887 = var49;
                            if (var47.equals(Statics.field2829.field875)) {
                                Statics.field792 = var49;
                            }
                            field1078 = field1069;
                            field941 = -1;
                            return true;
                        }
                        if (var55 < 0) {
                            break;
                        }
                    }
                    if (Statics.field328 >= Statics.field488.length) {
                        field941 = -1;
                        return true;
                    }
                    for (int var56 = Statics.field328 - 1; var56 > var54; var56--) {
                        Statics.field488[var56 + 1] = Statics.field488[var56];
                    }
                    if (Statics.field328 == 0) {
                        Statics.field488 = new class76[100];
                    }
                    Statics.field488[var54 + 1] = var53;
                    Statics.field328++;
                    if (var47.equals(Statics.field2829.field875)) {
                        Statics.field792 = var49;
                    }
                }
                field1078 = field1069;
                field941 = -1;
                return true;
            }
            if (field941 == 84) {
                field1117 = field939.method2921();
                if (field1117 == 255) {
                    field1117 = 0;
                }
                field1012 = field939.method2921();
                if (field1012 == 255) {
                    field1012 = 0;
                }
                field941 = -1;
                return true;
            }
            if (field941 == 154) {
                int var57 = field939.method2935();
                int var58 = field939.method2916();
                if (var57 < -70000) {
                    var58 += 32768;
                }
                class217 var59;
                if (var57 >= 0) {
                    var59 = class217.method2656(var57);
                } else {
                    var59 = null;
                }
                while (field939.field2364 < field1067) {
                    int var60 = field939.method2927();
                    int var61 = field939.method2916();
                    int var62 = 0;
                    if (var61 != 0) {
                        var62 = field939.method2921();
                        if (var62 == 255) {
                            var62 = field939.method2935();
                        }
                    }
                    if (var59 != null && var60 >= 0 && var60 < var59.field2748.length) {
                        var59.field2748[var60] = var61;
                        var59.field2749[var60] = var62;
                    }
                    Statics.method229(var58, var60, var61 - 1, var62);
                }
                if (var59 != null) {
                    method625(var59);
                }
                method1535();
                field1072[++field1161 - 1 & 0x1F] = var58 & 0x7FFF;
                field941 = -1;
                return true;
            }
            if (field941 == 147) {
                Statics.field2153 = field939.method2941();
                Statics.field344 = field939.method2941();
                for (int var63 = Statics.field2153; var63 < Statics.field2153 + 8; var63++) {
                    for (int var64 = Statics.field344; var64 < Statics.field344 + 8; var64++) {
                        if (field1084[Statics.field237][var63][var64] != null) {
                            field1084[Statics.field237][var63][var64] = null;
                            method445(var63, var64);
                        }
                    }
                }
                for (class77 var65 = (class77) field1015.method3323(); var65 != null; var65 = (class77) field1015.method3325()) {
                    if (var65.field1166 >= Statics.field2153 && var65.field1166 < Statics.field2153 + 8 && var65.field1172 >= Statics.field344 && var65.field1172 < Statics.field344 + 8 && Statics.field237 == var65.field1180) {
                        var65.field1175 = 0;
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 141) {
                for (int var66 = 0; var66 < field1004.length; var66++) {
                    if (field1004[var66] != null) {
                        field1004[var66].field1222 = -1;
                    }
                }
                for (int var67 = 0; var67 < field932.length; var67++) {
                    if (field932[var67] != null) {
                        field932[var67].field1222 = -1;
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 205) {
                String var68 = field939.method2922();
                class180 var69 = field939;
                String var70 = class266.method2456(var69, 32767);
                String var71 = class265.method4360(class271.method4333(var70));
                class99.method3389(6, var68, var71);
                field941 = -1;
                return true;
            }
            if (field941 == 178) {
                int var72 = field939.method2921();
                if (field939.method2921() == 0) {
                    field1159[var72] = new class17();
                    field939.field2364 += 18;
                } else {
                    field939.field2364--;
                    field1159[var72] = new class17(field939, false);
                }
                field1134 = field1069;
                field941 = -1;
                return true;
            }
            if (field941 == 67) {
                int var73 = field939.method2949();
                int var74 = field939.method2957();
                class217 var75 = class217.method2656(var74);
                if (var75.field2671 != 1 || var75.field2674 != var73) {
                    var75.field2671 = 1;
                    var75.field2674 = var73;
                    method625(var75);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 130) {
                int var76 = field939.method2949();
                if (var76 == 65535) {
                    var76 = -1;
                }
                if (var76 == -1 && !field1122) {
                    class204.method624();
                } else if (var76 != -1 && field1070 != var76 && field1120 != 0 && !field1122) {
                    class204.method493(2, Statics.field18, var76, 0, field1120, false);
                }
                field1070 = var76;
                field941 = -1;
                return true;
            }
            if (field941 == 29) {
                int var77 = field939.method2918();
                int var78 = field939.method2916();
                if (var78 == 65535) {
                    var78 = -1;
                }
                method1540(var78, var77);
                field941 = -1;
                return true;
            }
            if (field941 == 229) {
                method474(false);
                field939.method3134();
                int var79 = field939.method2916();
                class97.method669(field939, var79);
                field941 = -1;
                return true;
            }
            if (field941 == 123) {
                String var80 = field939.method2922();
                Object[] var81 = new Object[var80.length() + 1];
                for (int var82 = var80.length() - 1; var82 >= 0; var82--) {
                    if (var80.charAt(var82) == 's') {
                        var81[var82 + 1] = field939.method2922();
                    } else {
                        var81[var82 + 1] = Integer.valueOf(field939.method2935());
                    }
                }
                var81[0] = Integer.valueOf(field939.method2935());
                class70 var83 = new class70();
                var83.field819 = var81;
                class84.method1011(var83);
                field941 = -1;
                return true;
            }
            if (field941 == 99) {
                int var84 = field939.method2957();
                int var85 = field939.method2956();
                int var86 = field939.method2949();
                if (var86 == 65535) {
                    var86 = -1;
                }
                int var87 = field939.method2950();
                if (var87 == 65535) {
                    var87 = -1;
                }
                for (int var88 = var86; var88 <= var87; var88++) {
                    long var89 = ((long) var84 << 32) + (long) var88;
                    class193 var91 = field1086.method3263(var89);
                    if (var91 != null) {
                        var91.method3312();
                    }
                    field1086.method3269(new class199(var85), var89);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 64) {
                String var92 = field939.method2922();
                long var93 = field939.method2920();
                long var95 = (long) field939.method2916();
                long var97 = (long) field939.method2918();
                class231[] var99 = new class231[] { class231.field3157, class231.field3155, class231.field3158, class231.field3154, class231.field3156, class231.field3153 };
                class231 var100 = (class231) class169.method2811(var99, field939.method2921());
                long var101 = (var95 << 32) + var97;
                boolean var103 = false;
                for (int var104 = 0; var104 < 100; var104++) {
                    if (field1104[var104] == var101) {
                        var103 = true;
                        break;
                    }
                }
                if (var100.field3162 && method986(var92)) {
                    var103 = true;
                }
                if (!var103 && field1003 == 0) {
                    field1104[field1105] = var101;
                    field1105 = (field1105 + 1) % 100;
                    class180 var105 = field939;
                    String var106 = class266.method2456(var105, 32767);
                    String var107 = class265.method4360(class271.method4333(var106));
                    if (var100.field3160 == -1) {
                        class99.method1611(9, var92, var107, class269.method1539(var93));
                    } else {
                        int var108 = var100.field3160;
                        String var109 = "<img=" + var108 + ">";
                        class99.method1611(9, var109 + var92, var107, class269.method1539(var93));
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 181) {
                field1078 = field1069;
                if (field1067 == 0) {
                    field1110 = null;
                    field1132 = null;
                    Statics.field328 = 0;
                    Statics.field488 = null;
                    field941 = -1;
                    return true;
                }
                field1132 = field939.method2922();
                long var110 = field939.method2920();
                long var112 = var110;
                String var114;
                if (var110 <= 0L || var110 >= 6582952005840035281L) {
                    var114 = null;
                } else if (var110 % 37L == 0L) {
                    var114 = null;
                } else {
                    int var115 = 0;
                    for (long var116 = var110; var116 != 0L; var116 /= 37L) {
                        var115++;
                    }
                    StringBuilder var118 = new StringBuilder(var115);
                    while (var112 != 0L) {
                        long var119 = var112;
                        var112 /= 37L;
                        var118.append(class269.field3657[(int) (var119 - var112 * 37L)]);
                    }
                    var114 = var118.reverse().toString();
                }
                field1110 = var114;
                Statics.field3232 = field939.method3082();
                int var121 = field939.method2921();
                if (var121 == 255) {
                    field941 = -1;
                    return true;
                }
                Statics.field328 = var121;
                class76[] var122 = new class76[100];
                for (int var123 = 0; var123 < Statics.field328; var123++) {
                    var122[var123] = new class76();
                    var122[var123].field888 = field939.method2922();
                    var122[var123].field885 = class268.method43(var122[var123].field888, Statics.field716);
                    var122[var123].field886 = field939.method2916();
                    var122[var123].field887 = field939.method3082();
                    field939.method2922();
                    if (var122[var123].field888.equals(Statics.field2829.field875)) {
                        Statics.field792 = var122[var123].field887;
                    }
                }
                boolean var124 = false;
                int var125 = Statics.field328;
                while (var125 > 0) {
                    boolean var126 = true;
                    var125--;
                    for (int var127 = 0; var127 < var125; var127++) {
                        if (var122[var127].field885.compareTo(var122[var127 + 1].field885) > 0) {
                            class76 var128 = var122[var127];
                            var122[var127] = var122[var127 + 1];
                            var122[var127 + 1] = var128;
                            var126 = false;
                        }
                    }
                    if (var126) {
                        break;
                    }
                }
                Statics.field488 = var122;
                field941 = -1;
                return true;
            }
            if (field941 == 134 || field941 == 182 || field941 == 3 || field941 == 164 || field941 == 138 || field941 == 170 || field941 == 31 || field941 == 172 || field941 == 132 || field941 == 214) {
                method412();
                field941 = -1;
                return true;
            }
            if (field941 == 118) {
                field1145 = 1;
                field1077 = field1069;
                field941 = -1;
                return true;
            }
            if (field941 == 217) {
                for (int var129 = 0; var129 < class212.field2585.length; var129++) {
                    if (class212.field2588[var129] != class212.field2585[var129]) {
                        class212.field2585[var129] = class212.field2588[var129];
                        method999(var129);
                        field1080[++field991 - 1 & 0x1F] = var129;
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 157) {
                method1535();
                int var130 = field939.method2921();
                int var131 = field939.method2943();
                int var132 = field939.method2935();
                field1020[var131] = var132;
                field903[var131] = var130;
                field1137[var131] = 1;
                for (int var133 = 0; var133 < 98; var133++) {
                    if (var132 >= class223.field2818[var133]) {
                        field1137[var131] = var133 + 2;
                    }
                }
                field1143[++field1075 - 1 & 0x1F] = var131;
                field941 = -1;
                return true;
            }
            if (field941 == 91) {
                field939.field2364 += 28;
                if (field939.method2937()) {
                    method495(field939, field939.field2364 - 28);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 135) {
                method474(true);
                field939.method3134();
                int var134 = field939.method2916();
                class97.method669(field939, var134);
                field941 = -1;
                return true;
            }
            if (field941 == 66) {
                int var135 = field939.method2916();
                int var136 = field939.method2921();
                int var137 = field939.method2916();
                method1015(var135, var136, var137);
                field941 = -1;
                return true;
            }
            if (field941 == 194) {
                method464(false);
                field941 = -1;
                return true;
            }
            if (field941 == 167) {
                boolean var138 = field939.method2921() == 1;
                if (var138) {
                    Statics.field623 = class176.method3746() - field939.method2920();
                    Statics.field3351 = new class14(field939, true);
                } else {
                    Statics.field3351 = null;
                }
                field993 = field1069;
                field941 = -1;
                return true;
            }
            if (field941 == 55) {
                field909 = field939.method2916() * 30;
                field894 = field1069;
                field941 = -1;
                return true;
            }
            if (field941 == 165) {
                int var139 = field939.method2956();
                int var140 = field939.method2942();
                class69 var141 = (class69) field1097.method3263((long) var140);
                class69 var142 = (class69) field1097.method3263((long) var139);
                if (var142 != null) {
                    method2876(var142, var141 == null || var141.field810 != var142.field810);
                }
                if (var141 != null) {
                    var141.method3312();
                    field1097.method3269(var141, (long) var139);
                }
                class217 var143 = class217.method2656(var140);
                if (var143 != null) {
                    method625(var143);
                }
                class217 var144 = class217.method2656(var139);
                if (var144 != null) {
                    method625(var144);
                    method1389(Statics.field2321[var144.field2630 >>> 16], var144, true);
                }
                if (field1044 != -1) {
                    method79(field1044, 1);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 57) {
                field1131 = true;
                Statics.field2606 = field939.method2921();
                Statics.field1199 = field939.method2921();
                Statics.field2231 = field939.method2916();
                Statics.field3639 = field939.method2921();
                Statics.field2403 = field939.method2921();
                if (Statics.field2403 >= 100) {
                    Statics.field1366 = Statics.field2606 * 128 + 64;
                    Statics.field588 = Statics.field1199 * 128 + 64;
                    Statics.field2090 = method118(Statics.field1366, Statics.field588, Statics.field237) - Statics.field2231;
                }
                field941 = -1;
                return true;
            }
            if (field941 == 16) {
                Statics.field344 = field939.method2941();
                Statics.field2153 = field939.method2941();
                field941 = -1;
                return true;
            }
            if (field941 == 33) {
                int var145 = field939.method2956();
                int var146 = field939.method2950();
                class217 var147 = class217.method2656(var145);
                if (var147 != null && var147.field2695 == 0) {
                    if (var146 > var147.field2654 - var147.field2634) {
                        var146 = var147.field2654 - var147.field2634;
                    }
                    if (var146 < 0) {
                        var146 = 0;
                    }
                    if (var147.field2713 != var146) {
                        var147.field2713 = var146;
                        method625(var147);
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 27) {
                method1535();
                field1050 = field939.method2911();
                field894 = field1069;
                field941 = -1;
                return true;
            }
            if (field941 == 97) {
                class97.method491();
                for (int var148 = 0; var148 < 2048; var148++) {
                    field1004[var148] = null;
                }
                class97.method1617(field939);
                field941 = -1;
                return true;
            }
            if (field941 == 82) {
                int var149 = field939.method2943();
                int var150 = field939.method3008();
                String var151 = field939.method2922();
                if (var150 >= 1 && var150 <= 8) {
                    if (var151.equalsIgnoreCase("null")) {
                        var151 = null;
                    }
                    field1019[var150 - 1] = var151;
                    field1011[var150 - 1] = var149 == 0;
                }
                field941 = -1;
                return true;
            }
            if (field941 == 166) {
                field1131 = false;
                for (int var152 = 0; var152 < 5; var152++) {
                    field1006[var152] = false;
                }
                field941 = -1;
                return true;
            }
            if (field941 == 21) {
                int var153 = field939.method2949();
                class64 var154 = (class64) class64.field756.method3263((long) var153);
                if (var154 != null) {
                    var154.method3312();
                }
                field1072[++field1161 - 1 & 0x1F] = var153 & 0x7FFF;
                field941 = -1;
                return true;
            }
            if (field941 == 87) {
                int var155 = field939.method2949();
                int var156 = field939.method2957();
                int var157 = field939.method2916();
                class217 var158 = class217.method2656(var156);
                var158.field2619 = (var157 << 16) + var155;
                field941 = -1;
                return true;
            }
            if (field941 == 79) {
                int var159 = field939.method2956();
                int var160 = field939.method2911();
                int var161 = field939.method2951();
                class217 var162 = class217.method2656(var159);
                if (var162.field2639 != var160 || var162.field2640 != var161 || var162.field2635 != 0 || var162.field2697 != 0) {
                    var162.field2639 = var160;
                    var162.field2640 = var161;
                    var162.field2635 = 0;
                    var162.field2697 = 0;
                    method625(var162);
                    this.method1257(var162);
                    if (var162.field2695 == 0) {
                        method1389(Statics.field2321[var159 >> 16], var162, false);
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 7) {
                field1119 = field939.method2921();
                field941 = -1;
                return true;
            }
            if (field941 == 216) {
                field1116 = field939.method2921();
                if (field1116 == 1) {
                    field911 = field939.method2916();
                }
                if (field1116 >= 2 && field1116 <= 6) {
                    if (field1116 == 2) {
                        field916 = 64;
                        field1010 = 64;
                    }
                    if (field1116 == 3) {
                        field916 = 0;
                        field1010 = 64;
                    }
                    if (field1116 == 4) {
                        field916 = 128;
                        field1010 = 64;
                    }
                    if (field1116 == 5) {
                        field916 = 64;
                        field1010 = 0;
                    }
                    if (field1116 == 6) {
                        field916 = 64;
                        field1010 = 128;
                    }
                    field1116 = 2;
                    field1149 = field939.method2916();
                    field1002 = field939.method2916();
                    field1127 = field939.method2921();
                }
                if (field1116 == 10) {
                    field912 = field939.method2916();
                }
                field941 = -1;
                return true;
            }
            if (field941 == 126) {
                int var163 = field939.method2951();
                int var164 = field939.method2957();
                class217 var165 = class217.method2656(var164);
                if (var165.field2677 != var163 || var163 == -1) {
                    var165.field2677 = var163;
                    var165.field2752 = 0;
                    var165.field2700 = 0;
                    method625(var165);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 53) {
                if (field1044 != -1) {
                    method79(field1044, 0);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 119) {
                Statics.field344 = field939.method3008();
                Statics.field2153 = field939.method2941();
                while (field939.field2364 < field1067) {
                    field941 = field939.method2921();
                    method412();
                }
                field941 = -1;
                return true;
            }
            if (field941 == 74) {
                int var166 = field939.method2935();
                String var167 = field939.method2922();
                class217 var168 = class217.method2656(var166);
                if (!var167.equals(var168.field2690)) {
                    var168.field2690 = var167;
                    method625(var168);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 11) {
                int var169 = field939.method2941();
                int var170 = field939.method2948();
                int var171 = field939.method2942();
                class69 var172 = (class69) field1097.method3263((long) var171);
                if (var172 != null) {
                    method2876(var172, var172.field810 != var170);
                }
                class69 var173 = new class69();
                var173.field810 = var170;
                var173.field805 = var169;
                field1097.method3269(var173, (long) var171);
                method3570(var170);
                class217 var174 = class217.method2656(var171);
                method625(var174);
                if (field896 != null) {
                    method625(field896);
                    field896 = null;
                }
                method3149();
                method1389(Statics.field2321[var171 >> 16], var174, false);
                class84.method88(var170);
                if (field1044 != -1) {
                    method79(field1044, 1);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 68) {
                method464(true);
                field941 = -1;
                return true;
            }
            if (field941 == 13) {
                class281.method4338(field939, field1067);
                field941 = -1;
                return true;
            }
            if (field941 == 0) {
                int var175 = field939.method2916();
                if (var175 == 65535) {
                    var175 = -1;
                }
                int var176 = field939.method2935();
                int var177 = field939.method2935();
                class217 var178 = class217.method2656(var176);
                if (var178.field2629) {
                    var178.field2750 = var175;
                    var178.field2751 = var177;
                    class257 var180 = Statics.method992(var175);
                    var178.field2681 = var180.field3483;
                    var178.field2737 = var180.field3484;
                    var178.field2683 = var180.field3485;
                    var178.field2679 = var180.field3486;
                    var178.field2694 = var180.field3487;
                    var178.field2684 = var180.field3466;
                    if (var180.field3511 == 1) {
                        var178.field2745 = 1;
                    } else {
                        var178.field2745 = 2;
                    }
                    if (var178.field2685 > 0) {
                        var178.field2684 = var178.field2684 * 32 / var178.field2685;
                    } else if (var178.field2641 > 0) {
                        var178.field2684 = var178.field2684 * 32 / var178.field2641;
                    }
                    method625(var178);
                } else if (var175 == -1) {
                    var178.field2671 = 0;
                    field941 = -1;
                    return true;
                } else {
                    class257 var179 = Statics.method992(var175);
                    var178.field2671 = 4;
                    var178.field2674 = var175;
                    var178.field2681 = var179.field3483;
                    var178.field2737 = var179.field3484;
                    var178.field2684 = var179.field3466 * 100 / var177;
                    method625(var178);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 208) {
                int var181 = field939.method2942();
                int var182 = field939.method2948();
                class212.field2588[var182] = var181;
                if (class212.field2585[var182] != var181) {
                    class212.field2585[var182] = var181;
                }
                method999(var182);
                field1080[++field991 - 1 & 0x1F] = var182;
                field941 = -1;
                return true;
            }
            if (field941 == 212) {
                int var183 = field939.method2957();
                class217 var184 = class217.method2656(var183);
                for (int var185 = 0; var185 < var184.field2748.length; var185++) {
                    var184.field2748[var185] = -1;
                    var184.field2748[var185] = 0;
                }
                method625(var184);
                field941 = -1;
                return true;
            }
            if (field941 == 159) {
                while (field939.field2364 < field1067) {
                    boolean var186 = field939.method2921() == 1;
                    String var187 = field939.method2922();
                    String var188 = field939.method2922();
                    int var189 = field939.method2916();
                    int var190 = field939.method2921();
                    int var191 = field939.method2921();
                    boolean var192 = (var191 & 0x2) != 0;
                    boolean var193 = (var191 & 0x1) != 0;
                    if (var189 > 0) {
                        field939.method2922();
                        field939.method2921();
                        field939.method2935();
                    }
                    field939.method2922();
                    for (int var194 = 0; var194 < field1150; var194++) {
                        class66 var195 = field1152[var194];
                        if (var186) {
                            if (var188.equals(var195.field779)) {
                                var195.field779 = var187;
                                var195.field777 = var188;
                                var187 = null;
                                break;
                            }
                        } else if (var187.equals(var195.field779)) {
                            if (var195.field778 != var189) {
                                boolean var196 = true;
                                for (class68 var197 = (class68) field1153.method3353(); var197 != null; var197 = (class68) field1153.method3358()) {
                                    if (var197.field801.equals(var187)) {
                                        if (var189 != 0 && var197.field794 == 0) {
                                            var197.method3362();
                                            var196 = false;
                                        } else if (var189 == 0 && var197.field794 != 0) {
                                            var197.method3362();
                                            var196 = false;
                                        }
                                    }
                                }
                                if (var196) {
                                    field1153.method3352(new class68(var187, var189));
                                }
                                var195.field778 = var189;
                            }
                            var195.field777 = var188;
                            var195.field776 = var190;
                            var195.field783 = var192;
                            var195.field781 = var193;
                            var187 = null;
                            break;
                        }
                    }
                    if (var187 != null && field1150 < 400) {
                        class66 var198 = new class66();
                        field1152[field1150] = var198;
                        var198.field779 = var187;
                        var198.field777 = var188;
                        var198.field778 = var189;
                        var198.field776 = var190;
                        var198.field783 = var192;
                        var198.field781 = var193;
                        field1150++;
                    }
                }
                field1145 = 2;
                field1077 = field1069;
                boolean var199 = false;
                int var200 = field1150;
                while (var200 > 0) {
                    boolean var201 = true;
                    var200--;
                    for (int var202 = 0; var202 < var200; var202++) {
                        boolean var203 = false;
                        class66 var204 = field1152[var202];
                        class66 var205 = field1152[var202 + 1];
                        if (field893 != var204.field778 && field893 == var205.field778) {
                            var203 = true;
                        }
                        if (!var203 && var204.field778 == 0 && var205.field778 != 0) {
                            var203 = true;
                        }
                        if (!var203 && !var204.field783 && var205.field783) {
                            var203 = true;
                        }
                        if (!var203 && !var204.field781 && var205.field781) {
                            var203 = true;
                        }
                        if (var203) {
                            class66 var206 = field1152[var202];
                            field1152[var202] = field1152[var202 + 1];
                            field1152[var202 + 1] = var206;
                            var201 = false;
                        }
                    }
                    if (var201) {
                        break;
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 200) {
                int var207 = field939.method2949();
                field1044 = var207;
                this.method1070(false);
                method3570(var207);
                class84.method88(field1044);
                for (int var208 = 0; var208 < 100; var208++) {
                    field1089[var208] = true;
                }
                field941 = -1;
                return true;
            }
            if (field941 == 107) {
                int var209 = field939.method2948();
                int var210 = field939.method2957();
                class217 var211 = class217.method2656(var210);
                if (var211.field2671 != 2 || var211.field2674 != var209) {
                    var211.field2671 = 2;
                    var211.field2674 = var209;
                    method625(var211);
                }
                field941 = -1;
                return true;
            }
            if (field941 == 92) {
                String var212 = field939.method2922();
                Statics.field366 = var212;
                try {
                    String var213 = Statics.field1458.getParameter(class275.field3712.field3715);
                    String var214 = Statics.field1458.getParameter(class275.field3713.field3715);
                    String var215 = var213 + "settings=" + var212 + "; version=1; path=/; domain=" + var214;
                    String var216;
                    if (var212.length() == 0) {
                        var216 = var215 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var217 = var215 + "; Expires=";
                        long var218 = class176.method3746() + 94608000000L;
                        class183.field2411.setTime(new Date(var218));
                        int var220 = class183.field2411.get(7);
                        int var221 = class183.field2411.get(5);
                        int var222 = class183.field2411.get(2);
                        int var223 = class183.field2411.get(1);
                        int var224 = class183.field2411.get(11);
                        int var225 = class183.field2411.get(12);
                        int var226 = class183.field2411.get(13);
                        String var227 = class183.field2410[var220 - 1] + ", " + var221 / 10 + var221 % 10 + "-" + class183.field2415[0][var222] + "-" + var223 + " " + var224 / 10 + var224 % 10 + ":" + var225 / 10 + var225 % 10 + ":" + var226 / 10 + var226 % 10 + " GMT";
                        var216 = var217 + var227 + "; Max-Age=" + 94608000L;
                    }
                    client var228 = Statics.field1458;
                    String var229 = "document.cookie=\"" + var216 + "\"";
                    JSObject.getWindow(var228).eval(var229);
                } catch (Throwable var292) {
                }
                field941 = -1;
                return true;
            }
            if (field941 == 198) {
                int var231 = field939.method2935();
                class69 var232 = (class69) field1097.method3263((long) var231);
                if (var232 != null) {
                    method2876(var232, true);
                }
                if (field896 != null) {
                    method625(field896);
                    field896 = null;
                }
                field941 = -1;
                return true;
            }
            if (field941 == 245) {
                while (field939.field2364 < field1067) {
                    int var233 = field939.method2921();
                    boolean var234 = (var233 & 0x1) == 1;
                    String var235 = field939.method2922();
                    String var236 = field939.method2922();
                    field939.method2922();
                    for (int var237 = 0; var237 < field1154; var237++) {
                        class71 var238 = field897[var237];
                        if (var234) {
                            if (var236.equals(var238.field831)) {
                                var238.field831 = var235;
                                var238.field832 = var236;
                                var235 = null;
                                break;
                            }
                        } else if (var235.equals(var238.field831)) {
                            var238.field831 = var235;
                            var238.field832 = var236;
                            var235 = null;
                            break;
                        }
                    }
                    if (var235 != null && field1154 < 400) {
                        class71 var239 = new class71();
                        field897[field1154] = var239;
                        var239.field831 = var235;
                        var239.field832 = var236;
                        field1154++;
                    }
                }
                field1077 = field1069;
                field941 = -1;
                return true;
            }
            if (field941 == 20) {
                int var240 = field1067 + field939.field2364;
                int var241 = field939.method2916();
                int var242 = field939.method2916();
                if (field1044 != var241) {
                    field1044 = var241;
                    this.method1070(false);
                    method3570(field1044);
                    class84.method88(field1044);
                    for (int var243 = 0; var243 < 100; var243++) {
                        field1089[var243] = true;
                    }
                }
                while (var242-- > 0) {
                    int var244 = field939.method2935();
                    int var245 = field939.method2916();
                    int var246 = field939.method2921();
                    class69 var247 = (class69) field1097.method3263((long) var244);
                    if (var247 != null && var247.field810 != var245) {
                        method2876(var247, true);
                        var247 = null;
                    }
                    if (var247 == null) {
                        class69 var248 = new class69();
                        var248.field810 = var245;
                        var248.field805 = var246;
                        field1097.method3269(var248, (long) var244);
                        method3570(var245);
                        class217 var249 = class217.method2656(var244);
                        method625(var249);
                        if (field896 != null) {
                            method625(field896);
                            field896 = null;
                        }
                        method3149();
                        method1389(Statics.field2321[var244 >> 16], var249, false);
                        class84.method88(var245);
                        if (field1044 != -1) {
                            method79(field1044, 1);
                        }
                        var247 = var248;
                    }
                    var247.field806 = true;
                }
                for (class69 var251 = (class69) field1097.method3265(); var251 != null; var251 = (class69) field1097.method3266()) {
                    if (var251.field806) {
                        var251.field806 = false;
                    } else {
                        method2876(var251, true);
                    }
                }
                field1086 = new class191(512);
                while (field939.field2364 < var240) {
                    int var252 = field939.method2935();
                    int var253 = field939.method2916();
                    int var254 = field939.method2916();
                    int var255 = field939.method2935();
                    for (int var256 = var253; var256 <= var254; var256++) {
                        long var257 = ((long) var252 << 32) + (long) var256;
                        field1086.method3269(new class199(var255), var257);
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 235) {
                String var259 = field939.method2922();
                long var260 = (long) field939.method2916();
                long var262 = (long) field939.method2918();
                class231[] var264 = new class231[] { class231.field3157, class231.field3155, class231.field3158, class231.field3154, class231.field3156, class231.field3153 };
                class231 var265 = (class231) class169.method2811(var264, field939.method2921());
                long var266 = (var260 << 32) + var262;
                boolean var268 = false;
                for (int var269 = 0; var269 < 100; var269++) {
                    if (field1104[var269] == var266) {
                        var268 = true;
                        break;
                    }
                }
                if (method986(var259)) {
                    var268 = true;
                }
                if (!var268 && field1003 == 0) {
                    field1104[field1105] = var266;
                    field1105 = (field1105 + 1) % 100;
                    class180 var270 = field939;
                    String var271 = class266.method2456(var270, 32767);
                    String var272 = class265.method4360(class271.method4333(var271));
                    byte var273;
                    if (var265.field3161) {
                        var273 = 7;
                    } else {
                        var273 = 3;
                    }
                    if (var265.field3160 == -1) {
                        class99.method3389(var273, var259, var272);
                    } else {
                        int var275 = var265.field3160;
                        String var276 = "<img=" + var275 + ">";
                        class99.method3389(var273, var276 + var259, var272);
                    }
                }
                field941 = -1;
                return true;
            }
            if (field941 == 156) {
                int var277 = field939.method2935();
                int var278 = field939.method2935();
                int var279 = class59.method12();
                field937.method3133(236);
                field937.method2938(var279);
                field937.method2940(field672);
                field937.method2902(var277);
                field937.method2902(var278);
                field941 = -1;
                return true;
            }
            if (field941 == 71) {
                method1535();
                field1155 = field939.method2921();
                field894 = field1069;
                field941 = -1;
                return true;
            }
            if (field941 == 207) {
                int var280 = field939.method2957();
                Statics.field296 = Statics.field665.method2705(var280);
                field941 = -1;
                return true;
            }
            if (field941 == 2) {
                for (int var281 = 0; var281 < Statics.field23; var281++) {
                    class242 var282 = class242.method174(var281);
                    if (var282 != null) {
                        class212.field2588[var281] = 0;
                        class212.field2585[var281] = 0;
                    }
                }
                method1535();
                field991 += 32;
                field941 = -1;
                return true;
            }
            if (field941 == 244) {
                int var283 = field939.method2927();
                boolean var284 = field939.method2921() == 1;
                String var285 = "";
                boolean var286 = false;
                if (var284) {
                    var285 = field939.method2922();
                    if (method986(var285)) {
                        var286 = true;
                    }
                }
                String var287 = field939.method2922();
                if (!var286) {
                    class99.method3389(var283, var285, var287);
                }
                field941 = -1;
                return true;
            }
            class153.method158("" + field941 + class89.field1359 + field1013 + class89.field1359 + field946 + class89.field1359 + field1067, (Throwable) null);
            method677();
        } catch (IOException var293) {
            if (field947 > 0) {
                method677();
            } else {
                method6(40);
                Statics.field1340 = Statics.field1541;
                Statics.field1541 = null;
            }
        } catch (Exception var294) {
            String var290 = "" + field941 + class89.field1359 + field1013 + class89.field1359 + field946 + class89.field1359 + field1067 + class89.field1359 + (Statics.field448 + Statics.field2829.field1245[0]) + class89.field1359 + (Statics.field301 + Statics.field2829.field1246[0]) + class89.field1359;
            for (int var291 = 0; var291 < field1067 && var291 < 50; var291++) {
                var290 = var290 + field939.field2367[var291] + class89.field1359;
            }
            class153.method158(var290, var294);
            method677();
        }
        return true;
    }

    @ObfuscatedName("au.gh(I)V")
    public static final void method412() {
        if (field941 == 172) {
            int var0 = field939.method2921();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field958[var1];
            int var4 = field939.method2941();
            int var5 = (var4 >> 4 & 0x7) + Statics.field2153;
            int var6 = (var4 & 0x7) + Statics.field344;
            int var7 = field939.method2916();
            if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                if (var3 == 0) {
                    class143 var8 = Statics.field630.method2483(Statics.field237, var5, var6);
                    if (var8 != null) {
                        int var9 = var8.field2097 >> 14 & 0x7FFF;
                        if (var1 == 2) {
                            var8.field2104 = new class101(var9, 2, var2 + 4, Statics.field237, var5, var6, var7, false, var8.field2104);
                            var8.field2096 = new class101(var9, 2, var2 + 1 & 0x3, Statics.field237, var5, var6, var7, false, var8.field2096);
                        } else {
                            var8.field2104 = new class101(var9, var1, var2, Statics.field237, var5, var6, var7, false, var8.field2104);
                        }
                    }
                }
                if (var3 == 1) {
                    class148 var10 = Statics.field630.method2582(Statics.field237, var5, var6);
                    if (var10 != null) {
                        int var11 = var10.field2150 >> 14 & 0x7FFF;
                        if (var1 == 4 || var1 == 5) {
                            var10.field2146 = new class101(var11, 4, var2, Statics.field237, var5, var6, var7, false, var10.field2146);
                        } else if (var1 == 6) {
                            var10.field2146 = new class101(var11, 4, var2 + 4, Statics.field237, var5, var6, var7, false, var10.field2146);
                        } else if (var1 == 7) {
                            var10.field2146 = new class101(var11, 4, (var2 + 2 & 0x3) + 4, Statics.field237, var5, var6, var7, false, var10.field2146);
                        } else if (var1 == 8) {
                            var10.field2146 = new class101(var11, 4, var2 + 4, Statics.field237, var5, var6, var7, false, var10.field2146);
                            var10.field2149 = new class101(var11, 4, (var2 + 2 & 0x3) + 4, Statics.field237, var5, var6, var7, false, var10.field2149);
                        }
                    }
                }
                if (var3 == 2) {
                    class149 var12 = Statics.field630.method2485(Statics.field237, var5, var6);
                    if (var1 == 11) {
                        var1 = 10;
                    }
                    if (var12 != null) {
                        var12.field2158 = new class101(var12.field2166 >> 14 & 0x7FFF, var1, var2, Statics.field237, var5, var6, var7, false, var12.field2158);
                    }
                }
                if (var3 == 3) {
                    class130 var13 = Statics.field630.method2486(Statics.field237, var5, var6);
                    if (var13 != null) {
                        var13.field1836 = new class101(var13.field1837 >> 14 & 0x7FFF, 22, var2, Statics.field237, var5, var6, var7, false, var13.field1836);
                    }
                }
            }
        } else if (field941 == 170) {
            int var14 = field939.method3008();
            int var15 = (var14 >> 4 & 0x7) + Statics.field2153;
            int var16 = (var14 & 0x7) + Statics.field344;
            int var17 = field939.method2950();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                class194 var18 = field1084[Statics.field237][var15][var16];
                if (var18 != null) {
                    for (class95 var19 = (class95) var18.method3323(); var19 != null; var19 = (class95) var18.method3325()) {
                        if ((var17 & 0x7FFF) == var19.field1460) {
                            var19.method3312();
                            break;
                        }
                    }
                    if (var18.method3323() == null) {
                        field1084[Statics.field237][var15][var16] = null;
                    }
                    method445(var15, var16);
                }
            }
        } else if (field941 == 31) {
            int var20 = field939.method2921();
            int var21 = (var20 >> 4 & 0x7) + Statics.field2153;
            int var22 = (var20 & 0x7) + Statics.field344;
            int var23 = field939.method2949();
            int var24 = field939.method2916();
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                class95 var25 = new class95();
                var25.field1460 = var24;
                var25.field1461 = var23;
                if (field1084[Statics.field237][var21][var22] == null) {
                    field1084[Statics.field237][var21][var22] = new class194();
                }
                field1084[Statics.field237][var21][var22].method3318(var25);
                method445(var21, var22);
            }
        } else {
            if (field941 == 134) {
                int var26 = field939.method2921();
                int var27 = (var26 >> 4 & 0x7) + Statics.field2153;
                int var28 = (var26 & 0x7) + Statics.field344;
                int var29 = field939.method2916();
                int var30 = field939.method2921();
                int var31 = var30 >> 4 & 0xF;
                int var32 = var30 & 0x7;
                int var33 = field939.method2921();
                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                    int var34 = var31 + 1;
                    if (Statics.field2829.field1245[0] >= var27 - var34 && Statics.field2829.field1245[0] <= var27 + var34 && Statics.field2829.field1246[0] >= var28 - var34 && Statics.field2829.field1246[0] <= var28 + var34 && field1124 != 0 && var32 > 0 && field1125 < 50) {
                        field1090[field1125] = var29;
                        field918[field1125] = var32;
                        field1106[field1125] = var33;
                        field1130[field1125] = null;
                        field1129[field1125] = (var27 << 16) + (var28 << 8) + var31;
                        field1125++;
                    }
                }
            }
            if (field941 == 132) {
                int var35 = field939.method2921();
                int var36 = var35 >> 2;
                int var37 = var35 & 0x3;
                int var38 = field958[var36];
                int var39 = field939.method2921();
                int var40 = (var39 >> 4 & 0x7) + Statics.field2153;
                int var41 = (var39 & 0x7) + Statics.field344;
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                    method1391(Statics.field237, var40, var41, var38, -1, var36, var37, 0, -1);
                }
            } else if (field941 == 138) {
                int var42 = field939.method2921();
                int var43 = (var42 >> 4 & 0x7) + Statics.field2153;
                int var44 = (var42 & 0x7) + Statics.field344;
                int var45 = var43 + field939.method3082();
                int var46 = var44 + field939.method3082();
                int var47 = field939.method2911();
                int var48 = field939.method2916();
                int var49 = field939.method2921() * 4;
                int var50 = field939.method2921() * 4;
                int var51 = field939.method2916();
                int var52 = field939.method2916();
                int var53 = field939.method2921();
                int var54 = field939.method2921();
                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104 && var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var48 != 65535) {
                    int var55 = var43 * 128 + 64;
                    int var56 = var44 * 128 + 64;
                    int var57 = var45 * 128 + 64;
                    int var58 = var46 * 128 + 64;
                    class94 var59 = new class94(var48, Statics.field237, var55, var56, method118(var55, var56, Statics.field237) - var49, field902 + var51, field902 + var52, var53, var54, var47, var50);
                    var59.method1608(var57, var58, method118(var57, var58, Statics.field237) - var50, field902 + var51);
                    field1016.method3318(var59);
                }
            } else {
                if (field941 == 3) {
                    int var60 = field939.method2943();
                    int var61 = (var60 >> 4 & 0x7) + Statics.field2153;
                    int var62 = (var60 & 0x7) + Statics.field344;
                    int var63 = field939.method2949();
                    byte var64 = field939.method3082();
                    int var65 = field939.method2916();
                    byte var66 = field939.method3082();
                    byte var67 = field939.method3082();
                    byte var68 = field939.method3082();
                    int var69 = field939.method2941();
                    int var70 = var69 >> 2;
                    int var71 = var69 & 0x3;
                    int var72 = field958[var70];
                    int var73 = field939.method2948();
                    int var74 = field939.method2950();
                    class75 var75;
                    if (field1005 == var65) {
                        var75 = Statics.field2829;
                    } else {
                        var75 = field1004[var65];
                    }
                    if (var75 != null) {
                        class256 var76 = class256.method997(var63);
                        int var77;
                        int var78;
                        if (var71 == 1 || var71 == 3) {
                            var77 = var76.field3453;
                            var78 = var76.field3431;
                        } else {
                            var77 = var76.field3431;
                            var78 = var76.field3453;
                        }
                        int var79 = (var77 >> 1) + var61;
                        int var80 = (var77 + 1 >> 1) + var61;
                        int var81 = (var78 >> 1) + var62;
                        int var82 = (var78 + 1 >> 1) + var62;
                        int[][] var83 = class63.field750[Statics.field237];
                        int var84 = var83[var79][var81] + var83[var80][var81] + var83[var79][var82] + var83[var80][var82] >> 2;
                        int var85 = (var61 << 7) + (var77 << 6);
                        int var86 = (var62 << 7) + (var78 << 6);
                        class134 var87 = var76.method4124(var70, var71, var83, var85, var84, var86);
                        if (var87 != null) {
                            method1391(Statics.field237, var61, var62, var72, -1, 0, 0, var73 + 1, var74 + 1);
                            var75.field879 = field902 + var73;
                            var75.field861 = field902 + var74;
                            var75.field871 = var87;
                            var75.field868 = var61 * 128 + var77 * 64;
                            var75.field870 = var62 * 128 + var78 * 64;
                            var75.field857 = var84;
                            if (var67 > var64) {
                                byte var88 = var67;
                                var67 = var64;
                                var64 = var88;
                            }
                            if (var68 > var66) {
                                byte var89 = var68;
                                var68 = var66;
                                var66 = var89;
                            }
                            var75.field872 = var61 + var67;
                            var75.field874 = var61 + var64;
                            var75.field873 = var62 + var68;
                            var75.field881 = var62 + var66;
                        }
                    }
                }
                if (field941 == 164) {
                    int var90 = field939.method2921();
                    int var91 = (var90 >> 4 & 0x7) + Statics.field2153;
                    int var92 = (var90 & 0x7) + Statics.field344;
                    int var93 = field939.method2916();
                    int var94 = field939.method2921();
                    int var95 = field939.method2916();
                    if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                        int var96 = var91 * 128 + 64;
                        int var97 = var92 * 128 + 64;
                        class85 var98 = new class85(var93, Statics.field237, var96, var97, method118(var96, var97, Statics.field237) - var94, var95, field902);
                        field1017.method3318(var98);
                    }
                } else if (field941 == 214) {
                    int var99 = field939.method2941();
                    int var100 = var99 >> 2;
                    int var101 = var99 & 0x3;
                    int var102 = field958[var100];
                    int var103 = field939.method2950();
                    int var104 = field939.method2943();
                    int var105 = (var104 >> 4 & 0x7) + Statics.field2153;
                    int var106 = (var104 & 0x7) + Statics.field344;
                    if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                        method1391(Statics.field237, var105, var106, var102, var103, var100, var101, 0, -1);
                    }
                } else if (field941 == 182) {
                    int var107 = field939.method2921();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field2153;
                    int var109 = (var107 & 0x7) + Statics.field344;
                    int var110 = field939.method2916();
                    int var111 = field939.method2916();
                    int var112 = field939.method2916();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        class194 var113 = field1084[Statics.field237][var108][var109];
                        if (var113 != null) {
                            for (class95 var114 = (class95) var113.method3323(); var114 != null; var114 = (class95) var113.method3325()) {
                                if ((var110 & 0x7FFF) == var114.field1460 && var114.field1461 == var111) {
                                    var114.field1461 = var112;
                                    break;
                                }
                            }
                            method445(var108, var109);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.hd(IIIIIIIIII)V")
    public static final void method1391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1015.method3323(); var10 != null; var10 = (class77) field1015.method3325()) {
            if (var10.field1180 == arg0 && var10.field1166 == arg1 && var10.field1172 == arg2 && var10.field1165 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1180 = arg0;
            var9.field1165 = arg3;
            var9.field1166 = arg1;
            var9.field1172 = arg2;
            method2679(var9);
            field1015.method3318(var9);
        }
        var9.field1171 = arg4;
        var9.field1164 = arg5;
        var9.field1168 = arg6;
        var9.field1174 = arg7;
        var9.field1175 = arg8;
    }

    @ObfuscatedName("eu.hb(I)V")
    public static final void method2665() {
        for (class77 var0 = (class77) field1015.method3323(); var0 != null; var0 = (class77) field1015.method3325()) {
            if (var0.field1175 == -1) {
                var0.field1174 = 0;
                method2679(var0);
            } else {
                var0.method3312();
            }
        }
    }

    @ObfuscatedName("et.hr(Lbe;B)V")
    public static final void method2679(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1165 == 0) {
            var1 = Statics.field630.method2487(arg0.field1180, arg0.field1166, arg0.field1172);
        }
        if (arg0.field1165 == 1) {
            var1 = Statics.field630.method2488(arg0.field1180, arg0.field1166, arg0.field1172);
        }
        if (arg0.field1165 == 2) {
            var1 = Statics.field630.method2521(arg0.field1180, arg0.field1166, arg0.field1172);
        }
        if (arg0.field1165 == 3) {
            var1 = Statics.field630.method2460(arg0.field1180, arg0.field1166, arg0.field1172);
        }
        if (var1 != 0) {
            int var5 = Statics.field630.method2473(arg0.field1180, arg0.field1166, arg0.field1172, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1178 = var2;
        arg0.field1167 = var3;
        arg0.field1169 = var4;
    }

    @ObfuscatedName("bd.ha(IIIIIIIB)V")
    public static final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field898 && Statics.field237 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field630.method2487(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field630.method2488(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field630.method2521(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field630.method2460(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field630.method2473(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field630.method2590(arg0, arg2, arg3);
                class256 var15 = class256.method997(var12);
                if (var15.field3424 != 0) {
                    field955[arg0].method2780(arg2, arg3, var13, var14, var15.field3460);
                }
            }
            if (arg1 == 1) {
                Statics.field630.method2597(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field630.method2480(arg0, arg2, arg3);
                class256 var16 = class256.method997(var12);
                if (var16.field3431 + arg2 > 103 || var16.field3431 + arg3 > 103 || var16.field3453 + arg2 > 103 || var16.field3453 + arg3 > 103) {
                    return;
                }
                if (var16.field3424 != 0) {
                    field955[arg0].method2786(arg2, arg3, var16.field3431, var16.field3453, var14, var16.field3460);
                }
            }
            if (arg1 == 3) {
                Statics.field630.method2481(arg0, arg2, arg3);
                class256 var17 = class256.method997(var12);
                if (var17.field3424 == 1) {
                    field955[arg0].method2783(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class63.field735[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class140 var19 = Statics.field630;
        class162 var20 = field955[arg0];
        class256 var21 = class256.method997(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3453;
            var23 = var21.field3431;
        } else {
            var22 = var21.field3431;
            var23 = var21.field3453;
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
        int[][] var28 = class63.field750[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3464 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3433 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class142 var34;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var34 = var21.method4124(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class101(arg4, 22, arg5, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2467(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3424 == 1) {
                var20.method2778(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class142 var57;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var57 = var21.method4124(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class101(arg4, 10, arg5, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            if (var57 != null) {
                var19.method2471(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3424 != 0) {
                var20.method2776(arg2, arg3, var22, var23, var21.field3460);
            }
        } else if (arg6 >= 12) {
            class142 var35;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var35 = var21.method4124(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2471(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3424 != 0) {
                var20.method2776(arg2, arg3, var22, var23, var21.field3460);
            }
        } else if (arg6 == 0) {
            class142 var36;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var36 = var21.method4124(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class101(arg4, 0, arg5, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2469(arg0, arg2, arg3, var29, var36, (class142) null, class63.field744[arg5], 0, var32, var33);
            if (var21.field3424 != 0) {
                var20.method2781(arg2, arg3, arg6, arg5, var21.field3460);
            }
        } else if (arg6 == 1) {
            class142 var37;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var37 = var21.method4124(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class101(arg4, 1, arg5, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2469(arg0, arg2, arg3, var29, var37, (class142) null, class63.field747[arg5], 0, var32, var33);
            if (var21.field3424 != 0) {
                var20.method2781(arg2, arg3, arg6, arg5, var21.field3460);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class142 var39;
            class142 var40;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var39 = var21.method4124(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4124(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class101(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3439, true, (class142) null);
                var40 = new class101(arg4, 2, var38, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2469(arg0, arg2, arg3, var29, var39, var40, class63.field744[arg5], class63.field744[var38], var32, var33);
            if (var21.field3424 != 0) {
                var20.method2781(arg2, arg3, arg6, arg5, var21.field3460);
            }
        } else if (arg6 == 3) {
            class142 var41;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var41 = var21.method4124(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class101(arg4, 3, arg5, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2469(arg0, arg2, arg3, var29, var41, (class142) null, class63.field747[arg5], 0, var32, var33);
            if (var21.field3424 != 0) {
                var20.method2781(arg2, arg3, arg6, arg5, var21.field3460);
            }
        } else if (arg6 == 9) {
            class142 var42;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var42 = var21.method4124(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2471(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3424 != 0) {
                var20.method2776(arg2, arg3, var22, var23, var21.field3460);
            }
        } else if (arg6 == 4) {
            class142 var43;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var43 = var21.method4124(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2470(arg0, arg2, arg3, var29, var43, (class142) null, class63.field744[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2487(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class256.method997(var45 >> 14 & 0x7FFF).field3436;
            }
            class142 var46;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var46 = var21.method4124(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2470(arg0, arg2, arg3, var29, var46, (class142) null, class63.field744[arg5], 0, class63.field734[arg5] * var44, class63.field748[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2487(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class256.method997(var48 >> 14 & 0x7FFF).field3436 / 2;
            }
            class142 var49;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var49 = var21.method4124(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2470(arg0, arg2, arg3, var29, var49, (class142) null, 256, arg5, class63.field746[arg5] * var47, class63.field749[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class142 var51;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var51 = var21.method4124(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class101(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2470(arg0, arg2, arg3, var29, var51, (class142) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2487(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class256.method997(var53 >> 14 & 0x7FFF).field3436 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class142 var55;
            class142 var56;
            if (var21.field3439 == -1 && var21.field3457 == null) {
                var55 = var21.method4124(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4124(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3439, true, (class142) null);
                var56 = new class101(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3439, true, (class142) null);
            }
            var19.method2470(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class63.field746[arg5] * var52, class63.field749[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("au.hy(IIB)V")
    public static final void method445(int arg0, int arg1) {
        class194 var2 = field1084[Statics.field237][arg0][arg1];
        if (var2 == null) {
            Statics.field630.method2575(Statics.field237, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3323(); var6 != null; var6 = (class95) var2.method3325()) {
            class257 var7 = Statics.method992(var6.field1460);
            long var8 = (long) var7.field3489;
            if (var7.field3511 == 1) {
                var8 = (long) (var6.field1461 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field630.method2575(Statics.field237, arg0, arg1);
            return;
        }
        var2.method3317(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3323(); var12 != null; var12 = (class95) var2.method3325()) {
            if (var5.field1460 != var12.field1460) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1460 != var12.field1460 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field630.method2468(Statics.field237, arg0, arg1, method118(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field237), var5, var13, var10, var11);
    }

    @ObfuscatedName("ah.hf(ZI)V")
    public static final void method464(boolean arg0) {
        field1007 = 0;
        field1123 = 0;
        method140();
        method31(arg0);
        for (int var1 = 0; var1 < field1123; var1++) {
            int var2 = field936[var1];
            class87 var3 = field932[var2];
            int var4 = field939.method2921();
            if ((var4 & 0x40) != 0) {
                var3.field1343 = class259.method941(field939.method2948());
                var3.field1217 = var3.field1343.field3536;
                var3.field1243 = var3.field1343.field3559;
                var3.field1198 = var3.field1343.field3542;
                var3.field1206 = var3.field1343.field3539;
                var3.field1250 = var3.field1343.field3544;
                var3.field1201 = var3.field1343.field3545;
                var3.field1195 = var3.field1343.field3564;
                var3.field1196 = var3.field1343.field3540;
                var3.field1197 = var3.field1343.field3532;
            }
            if ((var4 & 0x4) != 0) {
                var3.field1227 = field939.method2948();
                int var5 = field939.method2957();
                var3.field1231 = var5 >> 16;
                var3.field1230 = (var5 & 0xFFFF) + field902;
                var3.field1228 = 0;
                var3.field1229 = 0;
                if (var3.field1230 > field902) {
                    var3.field1228 = -1;
                }
                if (var3.field1227 == 65535) {
                    var3.field1227 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1226 = field939.method2922();
                var3.field1214 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var6 = field939.method2949();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field939.method3008();
                if (var3.field1222 == var6 && var6 != -1) {
                    int var8 = class261.method494(var6).field3599;
                    if (var8 == 1) {
                        var3.field1237 = 0;
                        var3.field1224 = 0;
                        var3.field1225 = var7;
                        var3.field1219 = 0;
                    }
                    if (var8 == 2) {
                        var3.field1219 = 0;
                    }
                } else if (var6 == -1 || var3.field1222 == -1 || class261.method494(var6).field3593 >= class261.method494(var3.field1222).field3593) {
                    var3.field1222 = var6;
                    var3.field1237 = 0;
                    var3.field1224 = 0;
                    var3.field1225 = var7;
                    var3.field1219 = 0;
                    var3.field1249 = var3.field1235;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var9 = field939.method2943();
                if (var9 > 0) {
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = field939.method2927();
                        if (var14 == 32767) {
                            var14 = field939.method2927();
                            var12 = field939.method2927();
                            var11 = field939.method2927();
                            var13 = field939.method2927();
                        } else if (var14 == 32766) {
                            var14 = -1;
                        } else {
                            var12 = field939.method2927();
                        }
                        int var15 = field939.method2927();
                        var3.method1404(var14, var12, var11, var13, field902, var15);
                    }
                }
                int var16 = field939.method2921();
                if (var16 > 0) {
                    for (int var17 = 0; var17 < var16; var17++) {
                        int var18 = field939.method2927();
                        int var19 = field939.method2927();
                        if (var19 == 32767) {
                            var3.method1396(var18);
                        } else {
                            int var20 = field939.method2927();
                            int var21 = field939.method2921();
                            int var22 = var19 > 0 ? field939.method2921() : var21;
                            var3.method1395(var18, field902, var19, var20, var21, var22);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                int var23 = field939.method2949();
                int var24 = field939.method2949();
                int var25 = var3.field1232 - (var23 - Statics.field448 - Statics.field448) * 64;
                int var26 = var3.field1191 - (var24 - Statics.field301 - Statics.field301) * 64;
                if (var25 != 0 || var26 != 0) {
                    var3.field1210 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1216 = field939.method2948();
                if (var3.field1216 == 65535) {
                    var3.field1216 = -1;
                }
            }
        }
        for (int var27 = 0; var27 < field1007; var27++) {
            int var28 = field1008[var27];
            if (field902 != field932[var28].field1239) {
                field932[var28].field1343 = null;
                field932[var28] = null;
            }
        }
        if (field1067 != field939.field2364) {
            throw new RuntimeException(field939.field2364 + class89.field1359 + field1067);
        }
        for (int var29 = 0; var29 < field933; var29++) {
            if (field932[field934[var29]] == null) {
                throw new RuntimeException(var29 + class89.field1359 + field933);
            }
        }
    }

    @ObfuscatedName("m.ho(I)V")
    public static final void method140() {
        field939.method3135();
        int var0 = field939.method3136(8);
        if (var0 < field933) {
            for (int var1 = var0; var1 < field933; var1++) {
                field1008[++field1007 - 1] = field934[var1];
            }
        }
        if (var0 > field933) {
            throw new RuntimeException("");
        }
        field933 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field934[var2];
            class87 var4 = field932[var3];
            int var5 = field939.method3136(1);
            if (var5 == 0) {
                field934[++field933 - 1] = var3;
                var4.field1239 = field902;
            } else {
                int var6 = field939.method3136(2);
                if (var6 == 0) {
                    field934[++field933 - 1] = var3;
                    var4.field1239 = field902;
                    field936[++field1123 - 1] = var3;
                } else if (var6 == 1) {
                    field934[++field933 - 1] = var3;
                    var4.field1239 = field902;
                    int var7 = field939.method3136(3);
                    var4.method1549(var7, (byte) 1);
                    int var8 = field939.method3136(1);
                    if (var8 == 1) {
                        field936[++field1123 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field934[++field933 - 1] = var3;
                    var4.field1239 = field902;
                    int var9 = field939.method3136(3);
                    var4.method1549(var9, (byte) 2);
                    int var10 = field939.method3136(3);
                    var4.method1549(var10, (byte) 2);
                    int var11 = field939.method3136(1);
                    if (var11 == 1) {
                        field936[++field1123 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1008[++field1007 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("t.hx(ZI)V")
    public static final void method31(boolean arg0) {
        while (true) {
            if (field939.method3156(field1067) >= 27) {
                int var1 = field939.method3136(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field932[var1] == null) {
                        field932[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field932[var1];
                    field934[++field933 - 1] = var1;
                    var3.field1239 = field902;
                    int var4;
                    if (arg0) {
                        var4 = field939.method3136(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field939.method3136(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    var3.field1343 = class259.method941(field939.method3136(14));
                    int var5 = field939.method3136(1);
                    if (var5 == 1) {
                        field936[++field1123 - 1] = var1;
                    }
                    int var6 = field939.method3136(1);
                    int var7;
                    if (arg0) {
                        var7 = field939.method3136(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field939.method3136(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field1136[field939.method3136(3)];
                    if (var2) {
                        var3.field1241 = var3.field1192 = var8;
                    }
                    var3.field1217 = var3.field1343.field3536;
                    var3.field1243 = var3.field1343.field3559;
                    if (var3.field1243 == 0) {
                        var3.field1192 = 0;
                    }
                    var3.field1198 = var3.field1343.field3542;
                    var3.field1206 = var3.field1343.field3539;
                    var3.field1250 = var3.field1343.field3544;
                    var3.field1201 = var3.field1343.field3545;
                    var3.field1195 = var3.field1343.field3564;
                    var3.field1196 = var3.field1343.field3540;
                    var3.field1197 = var3.field1343.field3532;
                    var3.method1550(Statics.field2829.field1245[0] + var4, Statics.field2829.field1246[0] + var7, var6 == 1);
                    continue;
                }
            }
            field939.method3137();
            return;
        }
    }

    @ObfuscatedName("ax.hn(Lbg;IIBI)V")
    public static final void method213(class75 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1245[0];
        int var5 = arg0.field1246[0];
        int var6 = arg0.method1033();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1033();
        class164 var8 = method4336(arg1, arg2);
        class162 var9 = field955[arg0.field882];
        int[] var10 = field920;
        int[] var11 = field1162;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class163.field2273[var12][var13] = 0;
                class163.field2274[var12][var13] = 99999999;
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
            class163.field2273[var16][var17] = 99;
            class163.field2274[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class163.field2272[var20] = var4;
            int var55 = var20 + 1;
            class163.field2283[var20] = var5;
            int[][] var22 = var9.field2270;
            boolean var27;
            while (true) {
                if (var55 == var21) {
                    Statics.field2278 = var14;
                    Statics.field1498 = var15;
                    var27 = false;
                    break;
                }
                var14 = class163.field2272[var21];
                var15 = class163.field2283[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field2266;
                int var26 = var15 - var9.field2269;
                if (var8.method1024(1, var14, var15, var9)) {
                    Statics.field2278 = var14;
                    Statics.field1498 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class163.field2274[var23][var24] + 1;
                if (var23 > 0 && class163.field2273[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class163.field2272[var55] = var14 - 1;
                    class163.field2283[var55] = var15;
                    var55 = var55 + 1 & 0xFFF;
                    class163.field2273[var23 - 1][var24] = 2;
                    class163.field2274[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class163.field2273[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class163.field2272[var55] = var14 + 1;
                    class163.field2283[var55] = var15;
                    var55 = var55 + 1 & 0xFFF;
                    class163.field2273[var23 + 1][var24] = 8;
                    class163.field2274[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class163.field2273[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class163.field2272[var55] = var14;
                    class163.field2283[var55] = var15 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class163.field2273[var23][var24 - 1] = 1;
                    class163.field2274[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class163.field2273[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class163.field2272[var55] = var14;
                    class163.field2283[var55] = var15 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class163.field2273[var23][var24 + 1] = 4;
                    class163.field2274[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class163.field2273[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class163.field2272[var55] = var14 - 1;
                    class163.field2283[var55] = var15 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class163.field2273[var23 - 1][var24 - 1] = 3;
                    class163.field2274[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class163.field2273[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class163.field2272[var55] = var14 + 1;
                    class163.field2283[var55] = var15 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class163.field2273[var23 + 1][var24 - 1] = 9;
                    class163.field2274[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class163.field2273[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class163.field2272[var55] = var14 - 1;
                    class163.field2283[var55] = var15 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class163.field2273[var23 - 1][var24 + 1] = 6;
                    class163.field2274[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class163.field2273[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class163.field2272[var55] = var14 + 1;
                    class163.field2283[var55] = var15 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class163.field2273[var23 + 1][var24 + 1] = 12;
                    class163.field2274[var23 + 1][var24 + 1] = var28;
                }
            }
            var29 = var27;
        } else if (var7 == 2) {
            var29 = class163.method2831(var4, var5, var8, var9);
        } else {
            var29 = class163.method2663(var4, var5, var7, var8, var9);
        }
        int var48;
        label285: {
            int var30 = var4 - 64;
            int var31 = var5 - 64;
            int var32 = Statics.field2278;
            int var33 = Statics.field1498;
            if (!var29) {
                int var34 = Integer.MAX_VALUE;
                int var35 = Integer.MAX_VALUE;
                byte var36 = 10;
                int var37 = var8.field2289;
                int var38 = var8.field2285;
                int var39 = var8.field2288;
                int var40 = var8.field2287;
                for (int var41 = var37 - var36; var41 <= var36 + var37; var41++) {
                    for (int var42 = var38 - var36; var42 <= var36 + var38; var42++) {
                        int var43 = var41 - var30;
                        int var44 = var42 - var31;
                        if (var43 >= 0 && var44 >= 0 && var43 < 128 && var44 < 128 && class163.field2274[var43][var44] < 100) {
                            int var45 = 0;
                            if (var41 < var37) {
                                var45 = var37 - var41;
                            } else if (var41 > var37 + var39 - 1) {
                                var45 = var41 - (var37 + var39 - 1);
                            }
                            int var46 = 0;
                            if (var42 < var38) {
                                var46 = var38 - var42;
                            } else if (var42 > var38 + var40 - 1) {
                                var46 = var42 - (var38 + var40 - 1);
                            }
                            int var47 = var45 * var45 + var46 * var46;
                            if (var47 < var34 || var34 == var47 && class163.field2274[var43][var44] < var35) {
                                var34 = var47;
                                var35 = class163.field2274[var43][var44];
                                var32 = var41;
                                var33 = var42;
                            }
                        }
                    }
                }
                if (var34 == Integer.MAX_VALUE) {
                    var48 = -1;
                    break label285;
                }
            }
            if (var4 == var32 && var5 == var33) {
                var48 = 0;
            } else {
                byte var49 = 0;
                class163.field2272[var49] = var32;
                int var56 = var49 + 1;
                class163.field2283[var49] = var33;
                int var50;
                int var51 = var50 = class163.field2273[var32 - var30][var33 - var31];
                while (var4 != var32 || var5 != var33) {
                    if (var50 != var51) {
                        var50 = var51;
                        class163.field2272[var56] = var32;
                        class163.field2283[var56++] = var33;
                    }
                    if ((var51 & 0x2) != 0) {
                        var32++;
                    } else if ((var51 & 0x8) != 0) {
                        var32--;
                    }
                    if ((var51 & 0x1) != 0) {
                        var33++;
                    } else if ((var51 & 0x4) != 0) {
                        var33--;
                    }
                    var51 = class163.field2273[var32 - var30][var33 - var31];
                }
                int var52 = 0;
                while (var56-- > 0) {
                    var10[var52] = class163.field2272[var56];
                    var11[var52++] = class163.field2283[var56];
                    if (var52 >= var10.length) {
                        break;
                    }
                }
                var48 = var52;
            }
        }
        int var53 = var48;
        if (var48 >= 1) {
            for (int var54 = 0; var54 < var53 - 1; var54++) {
                arg0.method1036(field920[var54], field1162[var54], arg3);
            }
        }
    }

    @ObfuscatedName("jf.hi(III)Lfu;")
    public static class164 method4336(int arg0, int arg1) {
        field1160.field2289 = arg0;
        field1160.field2285 = arg1;
        field1160.field2288 = 1;
        field1160.field2287 = 1;
        return field1160;
    }

    @ObfuscatedName("b.hq(IIIIB)V")
    public static final void method82(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1087; var4++) {
            if (field1095[var4] + field1092[var4] > arg0 && field1092[var4] < arg0 + arg2 && field921[var4] + field1093[var4] > arg1 && field1093[var4] < arg1 + arg3) {
                field1089[var4] = true;
            }
        }
    }

    @ObfuscatedName("h.hh(IIIII)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1087; var4++) {
            if (field1095[var4] + field1092[var4] > arg0 && field1092[var4] < arg0 + arg2 && field921[var4] + field1093[var4] > arg1 && field1093[var4] < arg1 + arg3) {
                field972[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hg(B)V")
    public final void method1068() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field948 - 1; var2++) {
                if (field1026[var2] < 1000 && field1026[var2 + 1] > 1000) {
                    String var3 = field1029[var2];
                    field1029[var2] = field1029[var2 + 1];
                    field1029[var2 + 1] = var3;
                    String var4 = field1028[var2];
                    field1028[var2] = field1028[var2 + 1];
                    field1028[var2 + 1] = var4;
                    int var5 = field1026[var2];
                    field1026[var2] = field1026[var2 + 1];
                    field1026[var2 + 1] = var5;
                    int var6 = field905[var2];
                    field905[var2] = field905[var2 + 1];
                    field905[var2 + 1] = var6;
                    int var7 = field1151[var2];
                    field1151[var2] = field1151[var2 + 1];
                    field1151[var2 + 1] = var7;
                    int var8 = field1027[var2];
                    field1027[var2] = field1027[var2 + 1];
                    field1027[var2 + 1] = var8;
                    boolean var9 = field1014[var2];
                    field1014[var2] = field1014[var2 + 1];
                    field1014[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field308 != null || field913 != null) {
            return;
        }
        int var10 = class60.field698;
        if (field1022) {
            if (var10 != 1 && (Statics.field793 || var10 != 4)) {
                int var11 = class60.field697;
                int var12 = class60.field706 * -119379047;
                if (var11 < Statics.field284 - 10 || var11 > Statics.field284 + Statics.field262 + 10 || var12 < Statics.field1520 - 10 || var12 > Statics.field283 + Statics.field1520 + 10) {
                    field1022 = false;
                    method82(Statics.field284, Statics.field1520, Statics.field262, Statics.field283);
                }
            }
            if (var10 == 1 || !Statics.field793 && var10 == 4) {
                int var13 = Statics.field284;
                int var14 = Statics.field1520;
                int var15 = Statics.field262;
                int var16 = class60.field710;
                int var17 = class60.field714;
                int var18 = -1;
                for (int var19 = 0; var19 < field948; var19++) {
                    int var20 = (field948 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1) {
                    method14(var18);
                }
                field1022 = false;
                method82(Statics.field284, Statics.field1520, Statics.field262, Statics.field283);
            }
            return;
        }
        int var21 = field948 - 1;
        if ((var10 == 1 || !Statics.field793 && var10 == 4) && var21 >= 0) {
            int var23 = field1026[var21];
            if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                int var24 = field905[var21];
                int var25 = field1151[var21];
                class217 var26 = class217.method2656(var25);
                if (class218.method2713(method2879(var26)) || class218.method1030(method2879(var26))) {
                    if (Statics.field308 != null && !field924 && field948 > 0 && !this.method1278()) {
                        int var27 = field998;
                        int var28 = field999;
                        method71(Statics.field318, var27, var28);
                        Statics.field318 = null;
                    }
                    field924 = false;
                    field1048 = 0;
                    if (Statics.field308 != null) {
                        method625(Statics.field308);
                    }
                    Statics.field308 = class217.method2656(var25);
                    field997 = var24;
                    field998 = class60.field710;
                    field999 = class60.field714;
                    if (var21 >= 0) {
                        Statics.field318 = new class90();
                        Statics.field318.field1374 = field905[var21];
                        Statics.field318.field1367 = field1151[var21];
                        Statics.field318.field1368 = field1026[var21];
                        Statics.field318.field1372 = field1027[var21];
                        Statics.field318.field1370 = field1028[var21];
                    }
                    method625(Statics.field308);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field793 && var10 == 4) && this.method1278()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field793 && var10 == 4) && field948 > 0) {
            method14(var21);
        }
        if (var10 == 2 && field948 > 0) {
            this.method1179(class60.field710, class60.field714);
        }
    }

    @ObfuscatedName("client.hm(I)Z")
    public final boolean method1278() {
        int var1 = field948 - 1;
        return field948 > 2 && (field1021 == 1 && !field1014[var1] || method104(var1));
    }

    @ObfuscatedName("client.hs(III)V")
    public final void method1179(int arg0, int arg1) {
        int var3 = Statics.field545.method4434(class226.field2987);
        for (int var4 = 0; var4 < field948; var4++) {
            class264 var5 = Statics.field545;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1029[var4].length() > 0) {
                var6 = field1028[var4] + class226.field2938 + field1029[var4];
            } else {
                var6 = field1028[var4];
            }
            int var7 = var5.method4434(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field948 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field419) {
            var9 = Statics.field419 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field800) {
            var10 = Statics.field800 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field630.method2484(Statics.field237, arg0, arg1, false);
        field1022 = true;
        Statics.field284 = var9;
        Statics.field1520 = var10;
        Statics.field262 = var3;
        Statics.field283 = field948 * 15 + 22;
    }

    @ObfuscatedName("w.hv(IB)Z")
    public static final boolean method104(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field1026[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("f.ht(II)V")
    public static final void method14(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field905[arg0];
        int var2 = field1151[arg0];
        int var3 = field1026[arg0];
        int var4 = field1027[arg0];
        String var5 = field1028[arg0];
        String var6 = field1029[arg0];
        method3647(var1, var2, var3, var4, var5, var6, class60.field710, class60.field714);
    }

    @ObfuscatedName("u.hj(Lcy;III)V")
    public static final void method71(class90 arg0, int arg1, int arg2) {
        method3647(arg0.field1374, arg0.field1367, arg0.field1368, arg0.field1372, arg0.field1370, arg0.field1370, arg1, arg2);
    }

    @ObfuscatedName("ho.hl(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3647(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 4) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(249);
            field937.method3097(Statics.field301 + arg1);
            field937.method2900(arg3 >> 14 & 0x7FFF);
            field937.method2936(Statics.field448 + arg0);
            field937.method2938(class51.field605[82] ? 1 : 0);
        }
        if (arg2 == 31) {
            field937.method3133(241);
            field937.method2900(arg3);
            field937.method3044(Statics.field474);
            field937.method3067(arg1);
            field937.method2902(Statics.field549);
            field937.method3044(Statics.field451);
            field937.method3097(arg0);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 13) {
            class87 var8 = field932[arg3];
            if (var8 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(151);
                field937.method2939(class51.field605[82] ? 1 : 0);
                field937.method3097(arg3);
            }
        }
        if (arg2 == 50) {
            class75 var9 = field1004[arg3];
            if (var9 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(142);
                field937.method3044(arg3);
                field937.method2940(class51.field605[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field896 == null) {
            field937.method3133(161);
            field937.method2936(arg0);
            field937.method3067(arg1);
            field896 = class217.method2846(arg1, arg0);
            method625(field896);
        }
        if (arg2 == 18) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(0);
            field937.method2900(Statics.field301 + arg1);
            field937.method2938(class51.field605[82] ? 1 : 0);
            field937.method3097(Statics.field448 + arg0);
            field937.method2900(arg3);
        }
        if (arg2 == 23) {
            if (field1022) {
                Statics.field630.method2555();
            } else {
                Statics.field630.method2484(Statics.field237, arg0, arg1, true);
            }
        }
        if (arg2 == 1004) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field937.method3133(7);
            field937.method3044(arg3);
        }
        if (arg2 == 1002) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field937.method3133(89);
            field937.method3044(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 37) {
            field937.method3133(212);
            field937.method2900(arg0);
            field937.method2900(arg3);
            field937.method3067(arg1);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 10) {
            class87 var10 = field932[arg3];
            if (var10 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(224);
                field937.method2940(class51.field605[82] ? 1 : 0);
                field937.method2936(arg3);
            }
        }
        if (arg2 == 44) {
            class75 var11 = field1004[arg3];
            if (var11 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(222);
                field937.method2939(class51.field605[82] ? 1 : 0);
                field937.method3097(arg3);
            }
        }
        if (arg2 == 3) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(166);
            field937.method2900(arg3 >> 14 & 0x7FFF);
            field937.method2900(Statics.field301 + arg1);
            field937.method2899(class51.field605[82] ? 1 : 0);
            field937.method2900(Statics.field448 + arg0);
        }
        if (arg2 == 7) {
            class87 var12 = field932[arg3];
            if (var12 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(149);
                field937.method2902(Statics.field549);
                field937.method3044(arg3);
                field937.method2936(Statics.field451);
                field937.method3044(Statics.field474);
                field937.method2899(class51.field605[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class75 var13 = field1004[arg3];
            if (var13 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(150);
                field937.method2936(arg3);
                field937.method2900(Statics.field474);
                field937.method2936(Statics.field451);
                field937.method2940(class51.field605[82] ? 1 : 0);
                field937.method2902(Statics.field549);
            }
        }
        if (arg2 == 16) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(164);
            field937.method2936(Statics.field301 + arg1);
            field937.method2954(Statics.field549);
            field937.method2936(arg3);
            field937.method2900(Statics.field448 + arg0);
            field937.method2940(class51.field605[82] ? 1 : 0);
            field937.method2936(Statics.field474);
            field937.method3097(Statics.field451);
        }
        if (arg2 == 45) {
            class75 var14 = field1004[arg3];
            if (var14 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(185);
                field937.method2938(class51.field605[82] ? 1 : 0);
                field937.method3097(arg3);
            }
        }
        if (arg2 == 1005) {
            class217 var15 = class217.method2656(arg1);
            if (var15 == null || var15.field2749[arg0] < 100000) {
                field937.method3133(7);
                field937.method3044(arg3);
            } else {
                class99.method3389(27, "", var15.field2749[arg0] + " x " + Statics.method992(arg3).field3477);
            }
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 19) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(81);
            field937.method2899(class51.field605[82] ? 1 : 0);
            field937.method3097(Statics.field301 + arg1);
            field937.method3097(Statics.field448 + arg0);
            field937.method3044(arg3);
        }
        if (arg2 == 41) {
            field937.method3133(72);
            field937.method3097(arg3);
            field937.method3097(arg0);
            field937.method2953(arg1);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 6) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(253);
            field937.method2938(class51.field605[82] ? 1 : 0);
            field937.method2900(Statics.field301 + arg1);
            field937.method3044(Statics.field448 + arg0);
            field937.method2936(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var16 = class217.method2846(arg1, arg0);
            if (var16 != null) {
                int var17 = var16.field2750;
                class217 var18 = class217.method2846(arg1, arg0);
                if (var18 != null) {
                    if (var18.field2730 != null) {
                        class70 var19 = new class70();
                        var19.field813 = var18;
                        var19.field823 = arg3;
                        var19.field827 = arg5;
                        var19.field819 = var18.field2730;
                        class84.method1011(var19);
                    }
                    boolean var20 = true;
                    if (var18.field2739 > 0) {
                        var20 = method1041(var18);
                    }
                    if (var20 && class218.method2664(method2879(var18), arg3 - 1)) {
                        if (arg3 == 1) {
                            field937.method3133(206);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                        if (arg3 == 2) {
                            field937.method3133(183);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                        if (arg3 == 3) {
                            field937.method3133(79);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                        if (arg3 == 4) {
                            field937.method3133(158);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                        if (arg3 == 5) {
                            field937.method3133(5);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                        if (arg3 == 6) {
                            field937.method3133(196);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                        if (arg3 == 7) {
                            field937.method3133(125);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                        if (arg3 == 8) {
                            field937.method3133(195);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                        if (arg3 == 9) {
                            field937.method3133(204);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                        if (arg3 == 10) {
                            field937.method3133(67);
                            field937.method2902(arg1);
                            field937.method2900(arg0);
                            field937.method2900(var17);
                        }
                    }
                }
            }
        }
        if (arg2 == 38) {
            method2844();
            class217 var21 = class217.method2656(arg1);
            field1037 = 1;
            Statics.field474 = arg0;
            Statics.field549 = arg1;
            Statics.field451 = arg3;
            method625(var21);
            field1038 = class89.method1751(16748608) + Statics.method992(arg3).field3477 + class89.method1751(16777215);
            if (field1038 == null) {
                field1038 = "null";
            }
            return;
        }
        if (arg2 == 39) {
            field937.method3133(180);
            field937.method2936(arg0);
            field937.method3044(arg3);
            field937.method2954(arg1);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 1001) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(30);
            field937.method2936(Statics.field301 + arg1);
            field937.method3044(arg3 >> 14 & 0x7FFF);
            field937.method2936(Statics.field448 + arg0);
            field937.method2939(class51.field605[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class75 var22 = field1004[arg3];
            if (var22 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(234);
                field937.method2938(class51.field605[82] ? 1 : 0);
                field937.method3044(arg3);
            }
        }
        if (arg2 == 28) {
            field937.method3133(250);
            field937.method2902(arg1);
            class217 var23 = class217.method2656(arg1);
            if (var23.field2736 != null && var23.field2736[0][0] == 5) {
                int var24 = var23.field2736[0][1];
                class212.field2585[var24] = 1 - class212.field2585[var24];
                method999(var24);
            }
        }
        if (arg2 == 22) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(182);
            field937.method2936(Statics.field301 + arg1);
            field937.method2938(class51.field605[82] ? 1 : 0);
            field937.method3097(Statics.field448 + arg0);
            field937.method3044(arg3);
        }
        if (arg2 == 42) {
            field937.method3133(100);
            field937.method3044(arg3);
            field937.method3097(arg0);
            field937.method2953(arg1);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 1) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(12);
            field937.method2936(arg3 >> 14 & 0x7FFF);
            field937.method3044(Statics.field448 + arg0);
            field937.method2900(Statics.field474);
            field937.method2938(class51.field605[82] ? 1 : 0);
            field937.method3097(Statics.field451);
            field937.method3097(Statics.field301 + arg1);
            field937.method2953(Statics.field549);
        }
        if (arg2 == 35) {
            field937.method3133(141);
            field937.method3044(arg0);
            field937.method3067(arg1);
            field937.method3044(arg3);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 20) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(101);
            field937.method3044(Statics.field301 + arg1);
            field937.method3097(Statics.field448 + arg0);
            field937.method2900(arg3);
            field937.method2940(class51.field605[82] ? 1 : 0);
        }
        if (arg2 == 33) {
            field937.method3133(128);
            field937.method2936(arg0);
            field937.method2954(arg1);
            field937.method3044(arg3);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field230.method4803(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 24) {
            class217 var25 = class217.method2656(arg1);
            boolean var26 = true;
            if (var25.field2739 > 0) {
                var26 = method1041(var25);
            }
            if (var26) {
                field937.method3133(250);
                field937.method2902(arg1);
            }
        }
        if (arg2 == 11) {
            class87 var27 = field932[arg3];
            if (var27 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(40);
                field937.method2940(class51.field605[82] ? 1 : 0);
                field937.method3044(arg3);
            }
        }
        if (arg2 == 32) {
            field937.method3133(37);
            field937.method3097(arg3);
            field937.method2954(arg1);
            field937.method3097(field1040);
            field937.method2953(Statics.field2826);
            field937.method2900(arg0);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 43) {
            field937.method3133(228);
            field937.method3097(arg3);
            field937.method2953(arg1);
            field937.method2900(arg0);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 8) {
            class87 var28 = field932[arg3];
            if (var28 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(233);
                field937.method2940(class51.field605[82] ? 1 : 0);
                field937.method2954(Statics.field2826);
                field937.method3097(field1040);
                field937.method3097(arg3);
            }
        }
        if (arg2 == 47) {
            class75 var29 = field1004[arg3];
            if (var29 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(44);
                field937.method3097(arg3);
                field937.method2940(class51.field605[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class75 var30 = field1004[arg3];
            if (var30 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(83);
                field937.method3097(arg3);
                field937.method2939(class51.field605[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class75 var31 = field1004[arg3];
            if (var31 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(223);
                field937.method2939(class51.field605[82] ? 1 : 0);
                field937.method2900(arg3);
            }
        }
        if (arg2 == 1003) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            class87 var32 = field932[arg3];
            if (var32 != null) {
                class259 var33 = var32.field1343;
                if (var33.field3560 != null) {
                    var33 = var33.method4244();
                }
                if (var33 != null) {
                    field937.method3133(26);
                    field937.method3044(var33.field3534);
                }
            }
        }
        if (arg2 == 26) {
            method3129();
        }
        if (arg2 == 34) {
            field937.method3133(179);
            field937.method2902(arg1);
            field937.method3044(arg3);
            field937.method2936(arg0);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 15) {
            class75 var34 = field1004[arg3];
            if (var34 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(93);
                field937.method2936(arg3);
                field937.method2938(class51.field605[82] ? 1 : 0);
                field937.method2954(Statics.field2826);
                field937.method3097(field1040);
            }
        }
        if (arg2 == 21) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(201);
            field937.method3097(Statics.field301 + arg1);
            field937.method2899(class51.field605[82] ? 1 : 0);
            field937.method2900(arg3);
            field937.method2900(Statics.field448 + arg0);
        }
        if (arg2 == 40) {
            field937.method3133(32);
            field937.method3097(arg3);
            field937.method2902(arg1);
            field937.method2900(arg0);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 9) {
            class87 var35 = field932[arg3];
            if (var35 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(114);
                field937.method3044(arg3);
                field937.method2939(class51.field605[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(240);
            field937.method2900(Statics.field448 + arg0);
            field937.method3044(arg3 >> 14 & 0x7FFF);
            field937.method3044(Statics.field301 + arg1);
            field937.method2938(class51.field605[82] ? 1 : 0);
        }
        if (arg2 == 2) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(138);
            field937.method3097(field1040);
            field937.method2936(arg3 >> 14 & 0x7FFF);
            field937.method2902(Statics.field2826);
            field937.method3097(Statics.field301 + arg1);
            field937.method2938(class51.field605[82] ? 1 : 0);
            field937.method3097(Statics.field448 + arg0);
        }
        if (arg2 == 12) {
            class87 var36 = field932[arg3];
            if (var36 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(145);
                field937.method2900(arg3);
                field937.method2940(class51.field605[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field937.method3133(252);
            field937.method3044(arg3);
            field937.method3044(arg0);
            field937.method2902(arg1);
            field995 = 0;
            Statics.field375 = class217.method2656(arg1);
            field996 = arg0;
        }
        if (arg2 == 17) {
            field1057 = arg6;
            field1085 = arg7;
            field994 = 2;
            field1135 = 0;
            field1117 = arg0;
            field1012 = arg1;
            field937.method3133(255);
            field937.method2940(class51.field605[82] ? 1 : 0);
            field937.method3044(field1040);
            field937.method2900(Statics.field448 + arg0);
            field937.method3067(Statics.field2826);
            field937.method3097(arg3);
            field937.method2936(Statics.field301 + arg1);
        }
        if (arg2 == 58) {
            class217 var37 = class217.method2846(arg1, arg0);
            if (var37 != null) {
                field937.method3133(116);
                field937.method3097(var37.field2750);
                field937.method2900(field1040);
                field937.method3097(field1041);
                field937.method2902(Statics.field2826);
                field937.method2902(arg1);
                field937.method3044(arg0);
            }
        }
        if (arg2 == 25) {
            class217 var38 = class217.method2846(arg1, arg0);
            if (var38 != null) {
                method2844();
                int var39 = class218.method2674(method2879(var38));
                int var40 = var38.field2750;
                class217 var41 = class217.method2846(arg1, arg0);
                if (var41 != null && var41.field2721 != null) {
                    class70 var42 = new class70();
                    var42.field813 = var41;
                    var42.field819 = var41.field2721;
                    class84.method1011(var42);
                }
                field1041 = var40;
                field1147 = true;
                Statics.field2826 = arg1;
                field1040 = arg0;
                Statics.field1482 = var39;
                method625(var41);
                field1037 = 0;
                field973 = method645(var38);
                if (field973 == null) {
                    field973 = "Null";
                }
                if (var38.field2629) {
                    field1043 = var38.field2740 + class89.method1751(16777215);
                } else {
                    field1043 = class89.method1751(65280) + var38.field2622 + class89.method1751(16777215);
                }
            }
            return;
        }
        if (arg2 == 29) {
            field937.method3133(250);
            field937.method2902(arg1);
            class217 var43 = class217.method2656(arg1);
            if (var43.field2736 != null && var43.field2736[0][0] == 5) {
                int var44 = var43.field2736[0][1];
                if (class212.field2585[var44] != var43.field2744[0]) {
                    class212.field2585[var44] = var43.field2744[0];
                    method999(var44);
                }
            }
        }
        if (arg2 == 51) {
            class75 var45 = field1004[arg3];
            if (var45 != null) {
                field1057 = arg6;
                field1085 = arg7;
                field994 = 2;
                field1135 = 0;
                field1117 = arg0;
                field1012 = arg1;
                field937.method3133(192);
                field937.method2938(class51.field605[82] ? 1 : 0);
                field937.method2900(arg3);
            }
        }
        if (field1037 != 0) {
            field1037 = 0;
            method625(class217.method2656(Statics.field549));
        }
        if (field1147) {
            method2844();
        }
        if (Statics.field375 != null && field995 == 0) {
            method625(Statics.field375);
        }
    }

    @ObfuscatedName("ck.hu(ILjava/lang/String;B)V")
    public static void method1673(int arg0, String arg1) {
        int var2 = class97.field1471;
        int[] var3 = class97.field1469;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class75 var6 = field1004[var3[var5]];
            if (var6 != null && Statics.field2829 != var6 && var6.field875 != null && var6.field875.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field937.method3133(222);
                    field937.method2939(0);
                    field937.method3097(var3[var5]);
                } else if (arg0 == 4) {
                    field937.method3133(44);
                    field937.method3097(var3[var5]);
                    field937.method2940(0);
                } else if (arg0 == 6) {
                    field937.method3133(83);
                    field937.method3097(var3[var5]);
                    field937.method2939(0);
                } else if (arg0 == 7) {
                    field937.method3133(142);
                    field937.method3044(var3[var5]);
                    field937.method2940(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method3389(4, "", class226.field3033 + arg1);
        }
    }

    @ObfuscatedName("fb.hz(I)V")
    public static void method2844() {
        if (!field1147) {
            return;
        }
        class217 var0 = class217.method2846(Statics.field2826, field1040);
        if (var0 != null && var0.field2722 != null) {
            class70 var1 = new class70();
            var1.field813 = var0;
            var1.field819 = var0.field2722;
            class84.method1011(var1);
        }
        field1147 = false;
        method625(var0);
    }

    @ObfuscatedName("fq.hk(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2830(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method622(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("ap.hw(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method622(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1022 || field948 >= 500) {
            return;
        }
        field1028[field948] = arg0;
        field1029[field948] = arg1;
        field1026[field948] = arg2;
        field1027[field948] = arg3;
        field905[field948] = arg4;
        field1151[field948] = arg5;
        field1014[field948] = arg6;
        field948++;
    }

    @ObfuscatedName("fy.he(I)V")
    public static void method3149() {
        for (int var0 = 0; var0 < field948; var0++) {
            if (method126(field1026[var0])) {
                if (var0 < field948 - 1) {
                    for (int var1 = var0; var1 < field948 - 1; var1++) {
                        field1028[var1] = field1028[var1 + 1];
                        field1029[var1] = field1029[var1 + 1];
                        field1026[var1] = field1026[var1 + 1];
                        field1027[var1] = field1027[var1 + 1];
                        field905[var1] = field905[var1 + 1];
                        field1151[var1] = field1151[var1 + 1];
                        field1014[var1] = field1014[var1 + 1];
                    }
                }
                field948--;
            }
        }
    }

    @ObfuscatedName("n.hc(II)Z")
    public static boolean method126(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cq.hp(IIIIB)V")
    public static final void method1705(int arg0, int arg1, int arg2, int arg3) {
        if (field1037 == 0 && !field1147) {
            method2830(class226.field2989, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class135.field1971; var6++) {
            int var7 = class135.field1972[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field630.method2473(Statics.field237, var8, var9, var7) >= 0) {
                    class256 var12 = class256.method997(var11);
                    if (var12.field3457 != null) {
                        var12 = var12.method4127();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1037 == 1) {
                        method2830(class226.field2984, field1038 + " " + class89.field1361 + " " + class89.method1751(65535) + var12.field3426, 1, var7, var8, var9);
                    } else if (!field1147) {
                        String[] var13 = var12.field3449;
                        if (field970) {
                            var13 = method1757(var13);
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
                                    method2830(var13[var14], class89.method1751(65535) + var12.field3426, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2830(class226.field2915, class89.method1751(65535) + var12.field3426, 1002, var12.field3456 << 14, var8, var9);
                    } else if ((Statics.field1482 & 0x4) == 4) {
                        method2830(field973, field1043 + " " + class89.field1361 + " " + class89.method1751(65535) + var12.field3426, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class87 var16 = field932[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1343.field3536 == 1 && (var16.field1232 & 0x7F) == 64 && (var16.field1191 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field933; var17++) {
                            class87 var18 = field932[field934[var17]];
                            if (var18 != null && var16 != var18 && var18.field1343.field3536 == 1 && var16.field1232 == var18.field1232 && var16.field1191 == var18.field1191) {
                                method135(var18.field1343, field934[var17], var8, var9);
                            }
                        }
                        int var19 = class97.field1471;
                        int[] var20 = class97.field1469;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class75 var22 = field1004[var20[var21]];
                            if (var22 != null && var16.field1232 == var22.field1232 && var16.field1191 == var22.field1191) {
                                method2897(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method135(var16.field1343, var11, var8, var9);
                }
                if (var10 == 0) {
                    class75 var23 = field1004[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1232 & 0x7F) == 64 && (var23.field1191 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field933; var24++) {
                            class87 var25 = field932[field934[var24]];
                            if (var25 != null && var25.field1343.field3536 == 1 && var23.field1232 == var25.field1232 && var23.field1191 == var25.field1191) {
                                method135(var25.field1343, field934[var24], var8, var9);
                            }
                        }
                        int var26 = class97.field1471;
                        int[] var27 = class97.field1469;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class75 var29 = field1004[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1232 == var29.field1232 && var23.field1191 == var29.field1191) {
                                method2897(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field928 == var11) {
                        var4 = var7;
                    } else {
                        method2897(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class194 var30 = field1084[Statics.field237][var8][var9];
                    if (var30 != null) {
                        for (class95 var31 = (class95) var30.method3337(); var31 != null; var31 = (class95) var30.method3326()) {
                            class257 var32 = Statics.method992(var31.field1460);
                            if (field1037 == 1) {
                                method2830(class226.field2984, field1038 + " " + class89.field1361 + " " + class89.method1751(16748608) + var32.field3477, 16, var31.field1460, var8, var9);
                            } else if (!field1147) {
                                String[] var33 = var32.field3491;
                                if (field970) {
                                    var33 = method1757(var33);
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
                                        method2830(var33[var34], class89.method1751(16748608) + var32.field3477, var35, var31.field1460, var8, var9);
                                    } else if (var34 == 2) {
                                        method2830(class226.field2835, class89.method1751(16748608) + var32.field3477, 20, var31.field1460, var8, var9);
                                    }
                                }
                                method2830(class226.field2915, class89.method1751(16748608) + var32.field3477, 1004, var31.field1460, var8, var9);
                            } else if ((Statics.field1482 & 0x1) == 1) {
                                method2830(field973, field1043 + " " + class89.field1361 + " " + class89.method1751(16748608) + var32.field3477, 17, var31.field1460, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class75 var38 = field1004[field928];
            method2897(var38, field928, var36, var37);
        }
    }

    @ObfuscatedName("l.if(Lin;IIII)V")
    public static final void method135(class259 arg0, int arg1, int arg2, int arg3) {
        if (field948 >= 400) {
            return;
        }
        if (arg0.field3560 != null) {
            arg0 = arg0.method4244();
        }
        if (arg0 == null || !arg0.field3543 || arg0.field3565 && field1052 != arg1) {
            return;
        }
        String var4 = arg0.field3554;
        if (arg0.field3531 != 0) {
            var4 = var4 + method2662(arg0.field3531, Statics.field2829.field863) + " " + class89.field1364 + class226.field2990 + arg0.field3531 + class89.field1362;
        }
        if (arg0.field3565 && field1031) {
            method2830(class226.field2915, class89.method1751(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1037 == 1) {
            method2830(class226.field2984, field1038 + " " + class89.field1361 + " " + class89.method1751(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1147) {
            int var5 = arg0.field3565 && field1031 ? 2000 : 0;
            String[] var6 = arg0.field3550;
            if (field970) {
                var6 = method1757(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class226.field2986)) {
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
                        method2830(var6[var7], class89.method1751(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class226.field2986)) {
                        short var10 = 0;
                        if (field919 != class92.field1394) {
                            if (field919 == class92.field1385 || field919 == class92.field1387 && arg0.field3531 > Statics.field2829.field863) {
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
                            method2830(var6[var9], class89.method1751(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3565 || !field1031) {
                method2830(class226.field2915, class89.method1751(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1482 & 0x2) == 2) {
            method2830(field973, field1043 + " " + class89.field1361 + " " + class89.method1751(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fj.im(Lbg;IIII)V")
    public static final void method2897(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2829 == arg0 || field948 >= 400) {
            return;
        }
        String var4;
        if (arg0.field864 == 0) {
            var4 = arg0.field862[0] + arg0.field875 + arg0.field862[1] + method2662(arg0.field863, Statics.field2829.field863) + " " + class89.field1364 + class226.field2990 + arg0.field863 + class89.field1362 + arg0.field862[2];
        } else {
            var4 = arg0.field862[0] + arg0.field875 + arg0.field862[1] + " " + class89.field1364 + class226.field2910 + arg0.field864 + class89.field1362 + arg0.field862[2];
        }
        if (field1037 == 1) {
            method2830(class226.field2984, field1038 + " " + class89.field1361 + " " + class89.method1751(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1147) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field1019[var5] != null) {
                    short var6 = 0;
                    if (field1019[var5].equalsIgnoreCase(class226.field2986)) {
                        if (field1118 == class92.field1394) {
                            continue;
                        }
                        if (field1118 == class92.field1385 || field1118 == class92.field1387 && arg0.field863 > Statics.field2829.field863) {
                            var6 = 2000;
                        }
                        if (Statics.field2829.field877 != 0 && arg0.field877 != 0) {
                            if (Statics.field2829.field877 == arg0.field877) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field1011[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field1009[var5] + var6;
                    method2830(field1019[var5], class89.method1751(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1482 & 0x8) == 8) {
            method2830(field973, field1043 + " " + class89.field1361 + " " + class89.method1751(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field948; var9++) {
            if (field1026[var9] == 23) {
                field1029[var9] = class89.method1751(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ec.ie(IIB)Ljava/lang/String;")
    public static final String method2662(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class89.method1751(16711680);
        } else if (var2 < -6) {
            return class89.method1751(16723968);
        } else if (var2 < -3) {
            return class89.method1751(16740352);
        } else if (var2 < 0) {
            return class89.method1751(16756736);
        } else if (var2 > 9) {
            return class89.method1751(65280);
        } else if (var2 > 6) {
            return class89.method1751(4259584);
        } else if (var2 > 3) {
            return class89.method1751(8453888);
        } else if (var2 > 0) {
            return class89.method1751(12648192);
        } else {
            return class89.method1751(16776960);
        }
    }

    @ObfuscatedName("x.ib(IIIIIIIII)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method33(arg0)) {
            Statics.field798 = null;
            Statics.method3658(Statics.field2321[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field798 != null) {
                Statics.method3658(Statics.field798, -1412584499, arg1, arg2, arg3, arg4, Statics.field624, Statics.field227, arg7);
                Statics.field798 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1089[var8] = true;
            }
        } else {
            field1089[arg7] = true;
        }
    }

    @ObfuscatedName("eq.is(Ljava/lang/String;Lhn;I)Ljava/lang/String;")
    public static String method2458(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3109(method1601(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field296 != null) {
                    int var6 = Statics.field296.field2203;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field296.field2205 != null) {
                        var5 = (String) Statics.field296.field2205;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("client.ik(ZI)V")
    public final void method1070(boolean arg0) {
        int var2 = field1044;
        int var3 = Statics.field419;
        int var4 = Statics.field800;
        if (class217.method33(var2)) {
            method597(Statics.field2321[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ij(Lhn;I)V")
    public void method1257(class217 arg0) {
        class217 var2 = arg0.field2649 == -1 ? null : class217.method2656(arg0.field2649);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field419;
            var4 = Statics.field800;
        } else {
            var3 = var2.field2645;
            var4 = var2.field2634;
        }
        method2677(arg0, var3, var4, false);
        method2361(arg0, var3, var4);
    }

    @ObfuscatedName("by.iu([Lhn;Lhn;ZI)V")
    public static void method1389(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2667 == 0 ? arg1.field2645 : arg1.field2667;
        int var4 = arg1.field2654 == 0 ? arg1.field2634 : arg1.field2654;
        method597(arg0, arg1.field2630, var3, var4, arg2);
        if (arg1.field2754 != null) {
            method597(arg1.field2754, arg1.field2630, var3, var4, arg2);
        }
        class69 var5 = (class69) field1097.method3263((long) arg1.field2630);
        if (var5 != null) {
            int var6 = var5.field810;
            if (class217.method33(var6)) {
                method597(Statics.field2321[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2739 == 1337) {
        }
    }

    @ObfuscatedName("as.ig([Lhn;IIIZB)V")
    public static void method597(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2649 == arg1) {
                method2677(var6, arg2, arg3, arg4);
                method2361(var6, arg2, arg3);
                if (var6.field2651 > var6.field2667 - var6.field2645) {
                    var6.field2651 = var6.field2667 - var6.field2645;
                }
                if (var6.field2651 < 0) {
                    var6.field2651 = 0;
                }
                if (var6.field2713 > var6.field2654 - var6.field2634) {
                    var6.field2713 = var6.field2654 - var6.field2634;
                }
                if (var6.field2713 < 0) {
                    var6.field2713 = 0;
                }
                if (var6.field2695 == 0) {
                    method1389(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("et.io(Lhn;IIZI)V")
    public static void method2677(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2645;
        int var5 = arg0.field2634;
        if (arg0.field2738 == 0) {
            arg0.field2645 = arg0.field2641;
        } else if (arg0.field2738 == 1) {
            arg0.field2645 = arg1 - arg0.field2641;
        } else if (arg0.field2738 == 2) {
            arg0.field2645 = arg0.field2641 * arg1 >> 14;
        }
        if (arg0.field2638 == 0) {
            arg0.field2634 = arg0.field2642;
        } else if (arg0.field2638 == 1) {
            arg0.field2634 = arg2 - arg0.field2642;
        } else if (arg0.field2638 == 2) {
            arg0.field2634 = arg0.field2642 * arg2 >> 14;
        }
        if (arg0.field2738 == 4) {
            arg0.field2645 = arg0.field2647 * arg0.field2634 / arg0.field2648;
        }
        if (arg0.field2638 == 4) {
            arg0.field2634 = arg0.field2648 * arg0.field2645 / arg0.field2647;
        }
        if (field1121 && arg0.field2695 == 0) {
            if (arg0.field2634 < 5 && arg0.field2645 < 5) {
                arg0.field2634 = 5;
                arg0.field2645 = 5;
            } else {
                if (arg0.field2634 <= 0) {
                    arg0.field2634 = 5;
                }
                if (arg0.field2645 <= 0) {
                    arg0.field2645 = 5;
                }
            }
        }
        if (arg0.field2739 == 1337) {
            field1056 = arg0;
        }
        if (arg3 && arg0.field2742 != null && (arg0.field2645 != var4 || arg0.field2634 != var5)) {
            class70 var6 = new class70();
            var6.field813 = arg0;
            var6.field819 = arg0.field2742;
            field1083.method3318(var6);
        }
    }

    @ObfuscatedName("er.iy(Lhn;III)V")
    public static void method2361(class217 arg0, int arg1, int arg2) {
        if (arg0.field2635 == 0) {
            arg0.field2643 = arg0.field2639;
        } else if (arg0.field2635 == 1) {
            arg0.field2643 = (arg1 - arg0.field2645) / 2 + arg0.field2639;
        } else if (arg0.field2635 == 2) {
            arg0.field2643 = arg1 - arg0.field2645 - arg0.field2639;
        } else if (arg0.field2635 == 3) {
            arg0.field2643 = arg0.field2639 * arg1 >> 14;
        } else if (arg0.field2635 == 4) {
            arg0.field2643 = (arg0.field2639 * arg1 >> 14) + (arg1 - arg0.field2645) / 2;
        } else {
            arg0.field2643 = arg1 - arg0.field2645 - (arg0.field2639 * arg1 >> 14);
        }
        if (arg0.field2697 == 0) {
            arg0.field2644 = arg0.field2640;
        } else if (arg0.field2697 == 1) {
            arg0.field2644 = (arg2 - arg0.field2634) / 2 + arg0.field2640;
        } else if (arg0.field2697 == 2) {
            arg0.field2644 = arg2 - arg0.field2634 - arg0.field2640;
        } else if (arg0.field2697 == 3) {
            arg0.field2644 = arg0.field2640 * arg2 >> 14;
        } else if (arg0.field2697 == 4) {
            arg0.field2644 = (arg0.field2640 * arg2 >> 14) + (arg2 - arg0.field2634) / 2;
        } else {
            arg0.field2644 = arg2 - arg0.field2634 - (arg0.field2640 * arg2 >> 14);
        }
        if (!field1121 || arg0.field2695 != 0) {
            return;
        }
        if (arg0.field2643 < 0) {
            arg0.field2643 = 0;
        } else if (arg0.field2645 + arg0.field2643 > arg1) {
            arg0.field2643 = arg1 - arg0.field2645;
        }
        if (arg0.field2644 < 0) {
            arg0.field2644 = 0;
        } else if (arg0.field2644 + arg0.field2634 > arg2) {
            arg0.field2644 = arg2 - arg0.field2634;
        }
    }

    @ObfuscatedName("fs.il(IB)Ljava/lang/String;")
    public static final String method3109(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("cc.ir(Lhn;I)Z")
    public static final boolean method1452(class217 arg0) {
        if (arg0.field2743 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2743.length; var1++) {
            int var2 = method1601(arg0, var1);
            int var3 = arg0.field2744[var1];
            if (arg0.field2743[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2743[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2743[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cb.ia(Lhn;II)I")
    public static final int method1601(class217 arg0, int arg1) {
        if (arg0.field2736 == null || arg1 >= arg0.field2736.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2736[arg1];
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
                    var7 = field903[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1137[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1020[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method2656(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method992(var12).field3490 || field892)) {
                        for (int var13 = 0; var13 < var11.field2748.length; var13++) {
                            if (var12 + 1 == var11.field2748[var13]) {
                                var7 += var11.field2749[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2585[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2818[field1137[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2585[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2829.field863;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2817[var14]) {
                            var7 += field1137[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method2656(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method992(var18).field3490 || field892)) {
                        for (int var19 = 0; var19 < var17.field2748.length; var19++) {
                            if (var18 + 1 == var17.field2748[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1155;
                }
                if (var6 == 12) {
                    var7 = field1050;
                }
                if (var6 == 13) {
                    int var20 = class212.field2585[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method1567(var22);
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
                    var7 = (Statics.field2829.field1232 >> 7) + Statics.field448;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2829.field1191 >> 7) + Statics.field301;
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

    @ObfuscatedName("hv.iw(Lhn;Lix;IIZB)V")
    public static final void method3735(class217 arg0, class257 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3492;
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
            var7 = class226.field3084;
        }
        if (var6 != -1 && var7 != null) {
            method622(var7, class89.method1751(16748608) + arg1.field3477, var6, arg1.field3475, arg2, arg0.field2630, arg4);
        }
    }

    @ObfuscatedName("ad.it(Lhn;III)V")
    public static final void method460(class217 arg0, int arg1, int arg2) {
        if (arg0.field2633 == 1) {
            method2830(arg0.field2718, "", 24, 0, 0, arg0.field2630);
        }
        if (arg0.field2633 == 2 && !field1147) {
            String var3 = method645(arg0);
            if (var3 != null) {
                method2830(var3, class89.method1751(65280) + arg0.field2622, 25, 0, -1, arg0.field2630);
            }
        }
        if (arg0.field2633 == 3) {
            method2830(class226.field2898, "", 26, 0, 0, arg0.field2630);
        }
        if (arg0.field2633 == 4) {
            method2830(arg0.field2718, "", 28, 0, 0, arg0.field2630);
        }
        if (arg0.field2633 == 5) {
            method2830(arg0.field2718, "", 29, 0, 0, arg0.field2630);
        }
        if (arg0.field2633 == 6 && field896 == null) {
            method2830(arg0.field2718, "", 30, 0, -1, arg0.field2630);
        }
        if (arg0.field2695 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2634; var5++) {
                for (int var6 = 0; var6 < arg0.field2645; var6++) {
                    int var7 = (arg0.field2668 + 32) * var6;
                    int var8 = (arg0.field2660 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2698[var4];
                        var8 += arg0.field2699[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field1000 = var4;
                        Statics.field565 = arg0;
                        if (arg0.field2748[var4] > 0) {
                            label268: {
                                class257 var9 = Statics.method992(arg0.field2748[var4] - 1);
                                if (field1037 == 1) {
                                    int var10 = method2879(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field549 != arg0.field2630 || Statics.field474 != var4) {
                                            method2830(class226.field2984, field1038 + " " + class89.field1361 + " " + class89.method1751(16748608) + var9.field3477, 31, var9.field3475, var4, arg0.field2630);
                                        }
                                        break label268;
                                    }
                                }
                                if (field1147) {
                                    int var12 = method2879(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1482 & 0x10) == 16) {
                                            method2830(field973, field1043 + " " + class89.field1361 + " " + class89.method1751(16748608) + var9.field3477, 32, var9.field3475, var4, arg0.field2630);
                                        }
                                        break label268;
                                    }
                                }
                                String[] var14 = var9.field3492;
                                if (field970) {
                                    String[] var15 = method1757(var14);
                                }
                                int var16 = -1;
                                if (field1032 && class51.field605[81]) {
                                    var16 = var9.method4220();
                                }
                                int var17 = method2879(arg0);
                                boolean var18 = (var17 >> 30 & 0x1) != 0;
                                if (var18) {
                                    for (int var19 = 4; var19 >= 3; var19--) {
                                        if (var16 != var19) {
                                            method3735(arg0, var9, var4, var19, false);
                                        }
                                    }
                                }
                                class218 var10000 = (class218) null;
                                if (class218.method2666(method2879(arg0))) {
                                    method2830(class226.field2984, class89.method1751(16748608) + var9.field3477, 38, var9.field3475, var4, arg0.field2630);
                                }
                                int var20 = method2879(arg0);
                                boolean var21 = (var20 >> 30 & 0x1) != 0;
                                if (var21) {
                                    for (int var22 = 2; var22 >= 0; var22--) {
                                        if (var16 != var22) {
                                            method3735(arg0, var9, var4, var22, false);
                                        }
                                    }
                                    if (var16 >= 0) {
                                        method3735(arg0, var9, var4, var16, true);
                                    }
                                }
                                String[] var23 = arg0.field2701;
                                if (field970) {
                                    var23 = method1757(var23);
                                }
                                if (var23 != null) {
                                    for (int var24 = 4; var24 >= 0; var24--) {
                                        if (var23[var24] != null) {
                                            byte var25 = 0;
                                            if (var24 == 0) {
                                                var25 = 39;
                                            }
                                            if (var24 == 1) {
                                                var25 = 40;
                                            }
                                            if (var24 == 2) {
                                                var25 = 41;
                                            }
                                            if (var24 == 3) {
                                                var25 = 42;
                                            }
                                            if (var24 == 4) {
                                                var25 = 43;
                                            }
                                            method2830(var23[var24], class89.method1751(16748608) + var9.field3477, var25, var9.field3475, var4, arg0.field2630);
                                        }
                                    }
                                }
                                method2830(class226.field2915, class89.method1751(16748608) + var9.field3477, 1005, var9.field3475, var4, arg0.field2630);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2629) {
            return;
        }
        if (!field1147) {
            for (int var26 = 9; var26 >= 5; var26--) {
                String var27 = method3728(arg0, var26);
                if (var27 != null) {
                    method2830(var27, arg0.field2740, 1007, var26 + 1, arg0.field2631, arg0.field2630);
                }
            }
            String var28 = method645(arg0);
            if (var28 != null) {
                method2830(var28, arg0.field2740, 25, 0, arg0.field2631, arg0.field2630);
            }
            for (int var29 = 4; var29 >= 0; var29--) {
                String var30 = method3728(arg0, var29);
                if (var30 != null) {
                    method2830(var30, arg0.field2740, 57, var29 + 1, arg0.field2631, arg0.field2630);
                }
            }
            int var31 = method2879(arg0);
            boolean var32 = (var31 & 0x1) != 0;
            if (var32) {
                method2830(class226.field2928, "", 30, 0, arg0.field2631, arg0.field2630);
            }
        } else if (class218.method463(method2879(arg0)) && (Statics.field1482 & 0x20) == 32) {
            method2830(field973, field1043 + " " + class89.field1361 + " " + arg0.field2740, 58, 0, arg0.field2631, arg0.field2630);
        }
    }

    @ObfuscatedName("as.iq(IIIIIIII)V")
    public static final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class217.method33(arg0)) {
            method473(Statics.field2321[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ao.ic([Lhn;IIIIIIIB)V")
    public static final void method473(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2629 || var9.field2695 == 0 || var9.field2746 || method2879(var9) != 0 || field1058 == var9 || var9.field2739 == 1338) && var9.field2649 == arg1 && (!var9.field2629 || !method3128(var9))) {
                int var10 = var9.field2643 + arg6;
                int var11 = var9.field2644 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2695 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2695 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2645 + var10;
                    int var19 = var9.field2634 + var11;
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
                    int var22 = var9.field2645 + var10;
                    int var23 = var9.field2634 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field913 == var9) {
                    field1065 = true;
                    field1066 = var10;
                    field943 = var11;
                }
                if (!var9.field2629 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field697;
                    int var25 = class60.field706 * -119379047;
                    if (class60.field698 != 0) {
                        var24 = class60.field710;
                        var25 = class60.field714;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2739 == 1337) {
                        if (!field901 && !field1022 && var26) {
                            method1705(var24, var25, var12, var13);
                        }
                    } else if (var9.field2739 == 1338) {
                        method2682(var9, var10, var11);
                    } else {
                        if (var9.field2739 == 1400) {
                            Statics.field230.method4798(class60.field697, class60.field706 * -119379047, var26, var10, var11, var9.field2645, var9.field2634);
                        }
                        if (!field1022 && var26) {
                            if (var9.field2739 == 1400) {
                                Statics.field230.method4861(var10, var11, var9.field2645, var9.field2634, var24, var25);
                            } else {
                                method460(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2695 == 0) {
                            if (!var9.field2629 && method3128(var9) && Statics.field3303 != var9) {
                                continue;
                            }
                            method473(arg0, var9.field2630, var12, var13, var14, var15, var10 - var9.field2651, var11 - var9.field2713);
                            if (var9.field2754 != null) {
                                method473(var9.field2754, var9.field2630, var12, var13, var14, var15, var10 - var9.field2651, var11 - var9.field2713);
                            }
                            class69 var27 = (class69) field1097.method3263((long) var9.field2630);
                            if (var27 != null) {
                                if (var27.field805 == 0 && class60.field697 >= var12 && class60.field706 * -119379047 >= var13 && class60.field697 < var14 && class60.field706 * -119379047 < var15 && !field1022 && !field1121) {
                                    for (class70 var28 = (class70) field1083.method3323(); var28 != null; var28 = (class70) field1083.method3325()) {
                                        if (var28.field812) {
                                            var28.method3312();
                                            var28.field813.field2755 = false;
                                        }
                                    }
                                    if (Statics.field3385 == 0) {
                                        field913 = null;
                                        field1058 = null;
                                    }
                                    if (!field1022) {
                                        field948 = 0;
                                        field1022 = false;
                                        field1028[0] = class226.field3073;
                                        field1029[0] = "";
                                        field1026[0] = 1006;
                                        field1014[0] = false;
                                        field948 = 1;
                                    }
                                }
                                method576(var27.field810, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2629) {
                            if (var9.field2682) {
                                if (class60.field697 >= var12 && class60.field706 * -119379047 >= var13 && class60.field697 < var14 && class60.field706 * -119379047 < var15) {
                                    for (class70 var29 = (class70) field1083.method3323(); var29 != null; var29 = (class70) field1083.method3325()) {
                                        if (var29.field812) {
                                            var29.method3312();
                                            var29.field813.field2755 = false;
                                        }
                                    }
                                    if (Statics.field3385 == 0) {
                                        field913 = null;
                                        field1058 = null;
                                    }
                                    if (!field1022) {
                                        field948 = 0;
                                        field1022 = false;
                                        field1028[0] = class226.field3073;
                                        field1029[0] = "";
                                        field1026[0] = 1006;
                                        field1014[0] = false;
                                        field948 = 1;
                                    }
                                }
                            } else if (var9.field2764 && class60.field697 >= var12 && class60.field706 * -119379047 >= var13 && class60.field697 < var14 && class60.field706 * -119379047 < var15) {
                                for (class70 var30 = (class70) field1083.method3323(); var30 != null; var30 = (class70) field1083.method3325()) {
                                    if (var30.field812 && var30.field813.field2731 == var30.field819) {
                                        var30.method3312();
                                    }
                                }
                            }
                            boolean var31;
                            if (class60.field697 >= var12 && class60.field706 * -119379047 >= var13 && class60.field697 < var14 && class60.field706 * -119379047 < var15) {
                                var31 = true;
                            } else {
                                var31 = false;
                            }
                            boolean var32 = false;
                            if ((class60.field705 == 1 || !Statics.field793 && class60.field705 == 4) && var31) {
                                var32 = true;
                            }
                            boolean var33 = false;
                            if ((class60.field698 == 1 || !Statics.field793 && class60.field698 == 4) && class60.field710 >= var12 && class60.field714 >= var13 && class60.field710 < var14 && class60.field714 < var15) {
                                var33 = true;
                            }
                            if (var33) {
                                method164(var9, class60.field710 - var10, class60.field714 - var11);
                            }
                            if (var9.field2739 == 1400) {
                                Statics.field230.method4799(class60.field697, class60.field706 * -119379047, var31 & var32);
                            }
                            if (field913 != null && field913 != var9 && var31) {
                                int var34 = method2879(var9);
                                boolean var35 = (var34 >> 20 & 0x1) != 0;
                                if (var35) {
                                    field1061 = var9;
                                }
                            }
                            if (field1058 == var9) {
                                field1062 = true;
                                field1063 = var10;
                                field944 = var11;
                            }
                            if (var9.field2746) {
                                if (var31 && field1082 != 0 && var9.field2731 != null) {
                                    class70 var36 = new class70();
                                    var36.field812 = true;
                                    var36.field813 = var9;
                                    var36.field815 = field1082;
                                    var36.field819 = var9.field2731;
                                    field1083.method3318(var36);
                                }
                                if (field913 != null || Statics.field308 != null || field1022) {
                                    var33 = false;
                                    var32 = false;
                                    var31 = false;
                                }
                                if (!var9.field2756 && var33) {
                                    var9.field2756 = true;
                                    if (var9.field2712 != null) {
                                        class70 var37 = new class70();
                                        var37.field812 = true;
                                        var37.field813 = var9;
                                        var37.field814 = class60.field710 - var10;
                                        var37.field815 = class60.field714 - var11;
                                        var37.field819 = var9.field2712;
                                        field1083.method3318(var37);
                                    }
                                }
                                if (var9.field2756 && var32 && var9.field2708 != null) {
                                    class70 var38 = new class70();
                                    var38.field812 = true;
                                    var38.field813 = var9;
                                    var38.field814 = class60.field697 - var10;
                                    var38.field815 = class60.field706 * -119379047 - var11;
                                    var38.field819 = var9.field2708;
                                    field1083.method3318(var38);
                                }
                                if (var9.field2756 && !var32) {
                                    var9.field2756 = false;
                                    if (var9.field2691 != null) {
                                        class70 var39 = new class70();
                                        var39.field812 = true;
                                        var39.field813 = var9;
                                        var39.field814 = class60.field697 - var10;
                                        var39.field815 = class60.field706 * -119379047 - var11;
                                        var39.field819 = var9.field2691;
                                        field927.method3318(var39);
                                    }
                                }
                                if (var32 && var9.field2715 != null) {
                                    class70 var40 = new class70();
                                    var40.field812 = true;
                                    var40.field813 = var9;
                                    var40.field814 = class60.field697 - var10;
                                    var40.field815 = class60.field706 * -119379047 - var11;
                                    var40.field819 = var9.field2715;
                                    field1083.method3318(var40);
                                }
                                if (!var9.field2755 && var31) {
                                    var9.field2755 = true;
                                    if (var9.field2716 != null) {
                                        class70 var41 = new class70();
                                        var41.field812 = true;
                                        var41.field813 = var9;
                                        var41.field814 = class60.field697 - var10;
                                        var41.field815 = class60.field706 * -119379047 - var11;
                                        var41.field819 = var9.field2716;
                                        field1083.method3318(var41);
                                    }
                                }
                                if (var9.field2755 && var31 && var9.field2717 != null) {
                                    class70 var42 = new class70();
                                    var42.field812 = true;
                                    var42.field813 = var9;
                                    var42.field814 = class60.field697 - var10;
                                    var42.field815 = class60.field706 * -119379047 - var11;
                                    var42.field819 = var9.field2717;
                                    field1083.method3318(var42);
                                }
                                if (var9.field2755 && !var31) {
                                    var9.field2755 = false;
                                    if (var9.field2636 != null) {
                                        class70 var43 = new class70();
                                        var43.field812 = true;
                                        var43.field813 = var9;
                                        var43.field814 = class60.field697 - var10;
                                        var43.field815 = class60.field706 * -119379047 - var11;
                                        var43.field819 = var9.field2636;
                                        field927.method3318(var43);
                                    }
                                }
                                if (var9.field2703 != null) {
                                    class70 var44 = new class70();
                                    var44.field813 = var9;
                                    var44.field819 = var9.field2703;
                                    field975.method3318(var44);
                                }
                                if (var9.field2723 != null && field991 > var9.field2758) {
                                    if (var9.field2724 == null || field991 - var9.field2758 > 32) {
                                        class70 var49 = new class70();
                                        var49.field813 = var9;
                                        var49.field819 = var9.field2723;
                                        field1083.method3318(var49);
                                    } else {
                                        label561: for (int var45 = var9.field2758; var45 < field991; var45++) {
                                            int var46 = field1080[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var9.field2724.length; var47++) {
                                                if (var9.field2724[var47] == var46) {
                                                    class70 var48 = new class70();
                                                    var48.field813 = var9;
                                                    var48.field819 = var9.field2723;
                                                    field1083.method3318(var48);
                                                    break label561;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2758 = field991;
                                }
                                if (var9.field2714 != null && field1161 > var9.field2672) {
                                    if (var9.field2753 == null || field1161 - var9.field2672 > 32) {
                                        class70 var54 = new class70();
                                        var54.field813 = var9;
                                        var54.field819 = var9.field2714;
                                        field1083.method3318(var54);
                                    } else {
                                        label537: for (int var50 = var9.field2672; var50 < field1161; var50++) {
                                            int var51 = field1072[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2753.length; var52++) {
                                                if (var9.field2753[var52] == var51) {
                                                    class70 var53 = new class70();
                                                    var53.field813 = var9;
                                                    var53.field819 = var9.field2714;
                                                    field1083.method3318(var53);
                                                    break label537;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2672 = field1161;
                                }
                                if (var9.field2727 != null && field1075 > var9.field2680) {
                                    if (var9.field2747 == null || field1075 - var9.field2680 > 32) {
                                        class70 var59 = new class70();
                                        var59.field813 = var9;
                                        var59.field819 = var9.field2727;
                                        field1083.method3318(var59);
                                    } else {
                                        label513: for (int var55 = var9.field2680; var55 < field1075; var55++) {
                                            int var56 = field1143[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field2747.length; var57++) {
                                                if (var9.field2747[var57] == var56) {
                                                    class70 var58 = new class70();
                                                    var58.field813 = var9;
                                                    var58.field819 = var9.field2727;
                                                    field1083.method3318(var58);
                                                    break label513;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2680 = field1075;
                                }
                                if (field1076 > var9.field2757 && var9.field2732 != null) {
                                    class70 var60 = new class70();
                                    var60.field813 = var9;
                                    var60.field819 = var9.field2732;
                                    field1083.method3318(var60);
                                }
                                if (field1077 > var9.field2757 && var9.field2678 != null) {
                                    class70 var61 = new class70();
                                    var61.field813 = var9;
                                    var61.field819 = var9.field2678;
                                    field1083.method3318(var61);
                                }
                                if (field1078 > var9.field2757 && var9.field2632 != null) {
                                    class70 var62 = new class70();
                                    var62.field813 = var9;
                                    var62.field819 = var9.field2632;
                                    field1083.method3318(var62);
                                }
                                if (field1134 > var9.field2757 && var9.field2763 != null) {
                                    class70 var63 = new class70();
                                    var63.field813 = var9;
                                    var63.field819 = var9.field2763;
                                    field1083.method3318(var63);
                                }
                                if (field993 > var9.field2757 && var9.field2741 != null) {
                                    class70 var64 = new class70();
                                    var64.field813 = var9;
                                    var64.field819 = var9.field2741;
                                    field1083.method3318(var64);
                                }
                                if (field894 > var9.field2757 && var9.field2706 != null) {
                                    class70 var65 = new class70();
                                    var65.field813 = var9;
                                    var65.field819 = var9.field2706;
                                    field1083.method3318(var65);
                                }
                                var9.field2757 = field1069;
                                if (var9.field2733 != null) {
                                    for (int var66 = 0; var66 < field1034; var66++) {
                                        class70 var67 = new class70();
                                        var67.field813 = var9;
                                        var67.field818 = field1108[var66];
                                        var67.field811 = field1107[var66];
                                        var67.field819 = var9.field2733;
                                        field1083.method3318(var67);
                                    }
                                }
                            }
                        }
                        if (!var9.field2629 && field913 == null && Statics.field308 == null && !field1022) {
                            if ((var9.field2761 >= 0 || var9.field2657 != 0) && class60.field697 >= var12 && class60.field706 * -119379047 >= var13 && class60.field697 < var14 && class60.field706 * -119379047 < var15) {
                                if (var9.field2761 >= 0) {
                                    Statics.field3303 = arg0[var9.field2761];
                                } else {
                                    Statics.field3303 = var9;
                                }
                            }
                            if (var9.field2695 == 8 && class60.field697 >= var12 && class60.field706 * -119379047 >= var13 && class60.field697 < var14 && class60.field706 * -119379047 < var15) {
                                Statics.field1373 = var9;
                            }
                            if (var9.field2654 > var9.field2634) {
                                int var68 = var9.field2645 + var10;
                                int var69 = var9.field2634;
                                int var70 = var9.field2654;
                                int var71 = class60.field697;
                                int var72 = class60.field706 * -119379047;
                                if (field964) {
                                    field965 = 32;
                                } else {
                                    field965 = 0;
                                }
                                field964 = false;
                                if (class60.field705 == 1 || !Statics.field793 && class60.field705 == 4) {
                                    if (var71 >= var68 && var71 < var68 + 16 && var72 >= var11 && var72 < var11 + 16) {
                                        var9.field2713 -= 4;
                                        method625(var9);
                                    } else if (var71 >= var68 && var71 < var68 + 16 && var72 >= var11 + var69 - 16 && var72 < var11 + var69) {
                                        var9.field2713 += 4;
                                        method625(var9);
                                    } else if (var71 >= var68 - field965 && var71 < field965 + var68 + 16 && var72 >= var11 + 16 && var72 < var11 + var69 - 16) {
                                        int var73 = (var69 - 32) * var69 / var70;
                                        if (var73 < 8) {
                                            var73 = 8;
                                        }
                                        int var74 = var72 - var11 - 16 - var73 / 2;
                                        int var75 = var69 - 32 - var73;
                                        var9.field2713 = (var70 - var69) * var74 / var75;
                                        method625(var9);
                                        field964 = true;
                                    }
                                }
                                if (field1082 != 0) {
                                    int var76 = var9.field2645;
                                    if (var71 >= var68 - var76 && var72 >= var11 && var71 < var68 + 16 && var72 <= var11 + var69) {
                                        var9.field2713 += field1082 * 45;
                                        method625(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.ip(III)V")
    public static final void method79(int arg0, int arg1) {
        if (class217.method33(arg0)) {
            method1028(Statics.field2321[arg0], arg1);
        }
    }

    @ObfuscatedName("bk.iv([Lhn;II)V")
    public static final void method1028(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2695 == 0) {
                    if (var3.field2754 != null) {
                        method1028(var3.field2754, arg1);
                    }
                    class69 var4 = (class69) field1097.method3263((long) var3.field2630);
                    if (var4 != null) {
                        method79(var4.field810, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2686 != null) {
                    class70 var5 = new class70();
                    var5.field813 = var3;
                    var5.field819 = var3.field2686;
                    class84.method1011(var5);
                }
                if (arg1 == 1 && var3.field2646 != null) {
                    if (var3.field2631 >= 0) {
                        class217 var6 = class217.method2656(var3.field2630);
                        if (var6 == null || var6.field2754 == null || var3.field2631 >= var6.field2754.length || var6.field2754[var3.field2631] != var3) {
                            continue;
                        }
                    }
                    class70 var7 = new class70();
                    var7.field813 = var3;
                    var7.field819 = var3.field2646;
                    class84.method1011(var7);
                }
            }
        }
    }

    @ObfuscatedName("j.ix(Lhn;III)V")
    public static final void method164(class217 arg0, int arg1, int arg2) {
        if (field913 != null || field1022 || arg0 == null) {
            return;
        }
        class217 var3 = method7(arg0);
        if (var3 == null) {
            var3 = arg0.field2705;
        }
        if (var3 == null) {
            return;
        }
        field913 = arg0;
        class217 var5 = method7(arg0);
        if (var5 == null) {
            var5 = arg0.field2705;
        }
        field1058 = var5;
        field1074 = arg1;
        field1064 = arg2;
        Statics.field3385 = 0;
        field1068 = false;
        int var7 = field948 - 1;
        if (var7 != -1) {
            Statics.field318 = new class90();
            Statics.field318.field1374 = field905[var7];
            Statics.field318.field1367 = field1151[var7];
            Statics.field318.field1368 = field1026[var7];
            Statics.field318.field1372 = field1027[var7];
            Statics.field318.field1370 = field1028[var7];
        }
        return;
    }

    @ObfuscatedName("client.id(I)V")
    public final void method1071() {
        method625(field913);
        Statics.field3385++;
        if (field1065 && field1062) {
            int var1 = class60.field697;
            int var2 = class60.field706 * -119379047;
            int var3 = var1 - field1074;
            int var4 = var2 - field1064;
            if (var3 < field1063) {
                var3 = field1063;
            }
            if (field913.field2645 + var3 > field1063 + field1058.field2645) {
                var3 = field1063 + field1058.field2645 - field913.field2645;
            }
            if (var4 < field944) {
                var4 = field944;
            }
            if (field913.field2634 + var4 > field944 + field1058.field2634) {
                var4 = field944 + field1058.field2634 - field913.field2634;
            }
            int var5 = var3 - field1066;
            int var6 = var4 - field943;
            int var7 = field913.field2710;
            if (Statics.field3385 > field913.field2707 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1068 = true;
            }
            int var8 = field1058.field2651 + (var3 - field1063);
            int var9 = field1058.field2713 + (var4 - field944);
            if (field913.field2719 != null && field1068) {
                class70 var10 = new class70();
                var10.field813 = field913;
                var10.field814 = var8;
                var10.field815 = var9;
                var10.field819 = field913.field2719;
                class84.method1011(var10);
            }
            if (class60.field705 == 0) {
                if (field1068) {
                    if (field913.field2720 != null) {
                        class70 var11 = new class70();
                        var11.field813 = field913;
                        var11.field814 = var8;
                        var11.field815 = var9;
                        var11.field822 = field1061;
                        var11.field819 = field913.field2720;
                        class84.method1011(var11);
                    }
                    if (field1061 != null && method7(field913) != null) {
                        field937.method3133(148);
                        field937.method3097(field913.field2750);
                        field937.method2900(field1061.field2750);
                        field937.method2936(field1061.field2631);
                        field937.method2954(field1061.field2630);
                        field937.method2954(field913.field2630);
                        field937.method3044(field913.field2631);
                    }
                } else if (this.method1278()) {
                    this.method1179(field1074 + field1066, field943 + field1064);
                } else if (field948 > 0) {
                    int var12 = field1074 + field1066;
                    int var13 = field943 + field1064;
                    method71(Statics.field318, var12, var13);
                    Statics.field318 = null;
                }
                field913 = null;
            }
        } else if (Statics.field3385 > 1) {
            field913 = null;
        }
    }

    @ObfuscatedName("aw.in(Lhn;I)V")
    public static void method625(class217 arg0) {
        if (field907 == arg0.field2673) {
            field1089[arg0.field2762] = true;
        }
    }

    @ObfuscatedName("cg.iz(I)V")
    public static void method1535() {
        for (class69 var0 = (class69) field1097.method3265(); var0 != null; var0 = (class69) field1097.method3266()) {
            int var1 = var0.field810;
            if (class217.method33(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field2321[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2629;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2441;
                    class217 var6 = class217.method2656(var5);
                    if (var6 != null) {
                        method625(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.jj([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1757(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("gh.jf(II)V")
    public static final void method3570(int arg0) {
        if (!class217.method33(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2321[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2752 = 0;
                var3.field2700 = 0;
            }
        }
    }

    @ObfuscatedName("bu.jy(II)V")
    public static final void method689(int arg0) {
        if (class217.method33(arg0)) {
            method235(Statics.field2321[arg0], -1);
        }
    }

    @ObfuscatedName("ar.jt([Lhn;IB)V")
    public static final void method235(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2649 == arg1 && (!var3.field2629 || !method3128(var3))) {
                if (var3.field2695 == 0) {
                    if (!var3.field2629 && method3128(var3) && Statics.field3303 != var3) {
                        continue;
                    }
                    method235(arg0, var3.field2630);
                    if (var3.field2754 != null) {
                        method235(var3.field2754, var3.field2630);
                    }
                    class69 var4 = (class69) field1097.method3263((long) var3.field2630);
                    if (var4 != null) {
                        method689(var4.field810);
                    }
                }
                if (var3.field2695 == 6) {
                    if (var3.field2677 != -1 || var3.field2735 != -1) {
                        boolean var5 = method1452(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2735;
                        } else {
                            var6 = var3.field2677;
                        }
                        if (var6 != -1) {
                            class261 var7 = class261.method494(var6);
                            var3.field2700 += field1079;
                            while (var3.field2700 > var7.field3589[var3.field2752]) {
                                var3.field2700 -= var7.field3589[var3.field2752];
                                var3.field2752++;
                                if (var3.field2752 >= var7.field3586.length) {
                                    var3.field2752 -= var7.field3590;
                                    if (var3.field2752 < 0 || var3.field2752 >= var7.field3586.length) {
                                        var3.field2752 = 0;
                                    }
                                }
                                method625(var3);
                            }
                        }
                    }
                    if (var3.field2619 != 0 && !var3.field2629) {
                        int var8 = var3.field2619 >> 16;
                        int var9 = var3.field2619 << 16 >> 16;
                        int var10 = field1079 * var8;
                        int var11 = field1079 * var9;
                        var3.field2681 = var3.field2681 + var10 & 0x7FF;
                        var3.field2737 = var3.field2737 + var11 & 0x7FF;
                        method625(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.jz(IB)V")
    public static final void method999(int arg0) {
        method1535();
        class83.method3562();
        int var1 = class242.method174(arg0).field3271;
        if (var1 == 0) {
            return;
        }
        int var2 = class212.field2585[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class137.method2400(0.9D);
                ((class126) Statics.field2002).method2158(0.9D);
            }
            if (var2 == 2) {
                class137.method2400(0.8D);
                ((class126) Statics.field2002).method2158(0.8D);
            }
            if (var2 == 3) {
                class137.method2400(0.7D);
                ((class126) Statics.field2002).method2158(0.7D);
            }
            if (var2 == 4) {
                class137.method2400(0.6D);
                ((class126) Statics.field2002).method2158(0.6D);
            }
            class257.field3474.method3250();
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
            if (field1120 != var3) {
                if (field1120 == 0 && field1070 != -1) {
                    class204.method3124(Statics.field18, field1070, 0, var3, false);
                    field1122 = false;
                } else if (var3 == 0) {
                    class204.method624();
                    field1122 = false;
                } else if (class204.field2476 == 0) {
                    Statics.field2474.method3410(var3);
                } else {
                    Statics.field2475 = var3;
                }
                field1120 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field1126 = 127;
            }
            if (var2 == 1) {
                field1126 = 96;
            }
            if (var2 == 2) {
                field1126 = 64;
            }
            if (var2 == 3) {
                field1126 = 32;
            }
            if (var2 == 4) {
                field1126 = 0;
            }
        }
        if (var1 == 5) {
            field1021 = var2;
        }
        if (var1 == 6) {
            field1046 = var2;
        }
        if (var1 == 9) {
            field1047 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1124 = 127;
            }
            if (var2 == 1) {
                field1124 = 96;
            }
            if (var2 == 2) {
                field1124 = 64;
            }
            if (var2 == 3) {
                field1124 = 32;
            }
            if (var2 == 4) {
                field1124 = 0;
            }
        }
        if (var1 == 17) {
            field1052 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class92[] var4 = new class92[] { class92.field1385, class92.field1386, class92.field1387, class92.field1394 };
            field1118 = (class92) class169.method2811(var4, var2);
            if (field1118 == null) {
                field1118 = class92.field1387;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field928 = -1;
            } else {
                field928 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class92[] var5 = new class92[] { class92.field1385, class92.field1386, class92.field1387, class92.field1394 };
        field919 = (class92) class169.method2811(var5, var2);
        if (field919 == null) {
            field919 = class92.field1387;
        }
    }

    @ObfuscatedName("l.jp(Lhn;I)V")
    public static final void method138(class217 arg0) {
        int var1 = arg0.field2739;
        if (var1 == 324) {
            if (field1157 == -1) {
                field1157 = arg0.field2665;
                field1158 = arg0.field2666;
            }
            if (field1156.field2600) {
                arg0.field2665 = field1157;
            } else {
                arg0.field2665 = field1158;
            }
        } else if (var1 == 325) {
            if (field1157 == -1) {
                field1157 = arg0.field2665;
                field1158 = arg0.field2666;
            }
            if (field1156.field2600) {
                arg0.field2665 = field1158;
            } else {
                arg0.field2665 = field1157;
            }
        } else if (var1 == 327) {
            arg0.field2681 = 150;
            arg0.field2737 = (int) (Math.sin((double) field902 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2671 = 5;
            arg0.field2674 = 0;
        } else if (var1 == 328) {
            arg0.field2681 = 150;
            arg0.field2737 = (int) (Math.sin((double) field902 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2671 = 5;
            arg0.field2674 = 1;
        }
    }

    @ObfuscatedName("fa.jx(I)V")
    public static final void method3129() {
        field937.method3133(36);
        for (class69 var0 = (class69) field1097.method3265(); var0 != null; var0 = (class69) field1097.method3266()) {
            if (var0.field805 == 0 || var0.field805 == 3) {
                method2876(var0, true);
            }
        }
        if (field896 != null) {
            method625(field896);
            field896 = null;
        }
    }

    @ObfuscatedName("fh.ju(Lba;ZI)V")
    public static final void method2876(class69 arg0, boolean arg1) {
        int var2 = arg0.field810;
        int var3 = (int) arg0.field2441;
        arg0.method3312();
        if (arg1 && var2 != -1 && Statics.field758[var2]) {
            Statics.field796.method3763(var2);
            if (Statics.field2321[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2321[var2].length; var5++) {
                    if (Statics.field2321[var2][var5] != null) {
                        if (Statics.field2321[var2][var5].field2695 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2321[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2321[var2] = null;
                }
                Statics.field758[var2] = false;
            }
        }
        for (class199 var6 = (class199) field1086.method3265(); var6 != null; var6 = (class199) field1086.method3266()) {
            if ((long) var2 == (var6.field2441 >> 48 & 0xFFFFL)) {
                var6.method3312();
            }
        }
        class217 var7 = class217.method2656(var3);
        if (var7 != null) {
            method625(var7);
        }
        method3149();
        if (field1044 != -1) {
            method79(field1044, 1);
        }
    }

    @ObfuscatedName("bg.jh(Lhn;I)Z")
    public static final boolean method1041(class217 arg0) {
        int var1 = arg0.field2739;
        if (var1 == 205) {
            field947 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1156.method3615(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1156.method3616(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1156.method3617(false);
        }
        if (var1 == 325) {
            field1156.method3617(true);
        }
        if (var1 == 326) {
            field937.method3133(57);
            field1156.method3618(field937);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cy.js(IIIILji;Lhr;I)V")
    public static final void method1564(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method458(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field915 & 0x7FF;
        int var8 = class137.field1997[var7];
        int var9 = class137.field1992[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        Statics.field1963.method4683(arg0 + 94 + var14 + 4 - 10, arg1 + 83 - var15 - 20, 20, 20, 15, 15, var12, 256);
    }

    @ObfuscatedName("ad.ja(IIIILji;Lhr;I)V")
    public static final void method458(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field915 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field1997[var6];
        int var9 = class137.field1992[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4681(arg5.field2581 / 2 + var10 - arg4.field3771 / 2, arg5.field2582 / 2 - var11 - arg4.field3775 / 2, arg0, arg1, arg5.field2581, arg5.field2582, arg5.field2579, arg5.field2580);
        } else {
            arg4.method4671(arg5.field2581 / 2 + arg0 + var10 - arg4.field3771 / 2, arg5.field2582 / 2 + arg1 - var11 - arg4.field3775 / 2);
        }
    }

    @ObfuscatedName("ar.jv(Ljava/lang/String;ZB)Z")
    public static boolean method237(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method43(arg0, Statics.field716);
        for (int var3 = 0; var3 < field1150; var3++) {
            if (var2.equalsIgnoreCase(class268.method43(field1152[var3].field779, Statics.field716)) && (!arg1 || field1152[var3].field778 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method43(Statics.field2829.field875, Statics.field716))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bw.jd(Ljava/lang/String;I)Z")
    public static boolean method986(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method43(arg0, Statics.field716);
        for (int var2 = 0; var2 < field1154; var2++) {
            class71 var3 = field897[var2];
            if (var1.equalsIgnoreCase(class268.method43(var3.field831, Statics.field716))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method43(var3.field832, Statics.field716))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ir.jn(Ljava/lang/String;I)V")
    public static final void method4009(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field1150 < 200 || field1102 == 1) || field1150 >= 400) {
            class99.method3389(30, "", class226.field3000);
            return;
        }
        String var1 = class268.method43(arg0, Statics.field716);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1150; var2++) {
            class66 var3 = field1152[var2];
            String var4 = class268.method43(var3.field779, Statics.field716);
            if (var4 != null && var4.equals(var1)) {
                class99.method3389(30, "", arg0 + class226.field3001);
                return;
            }
            if (var3.field777 != null) {
                String var5 = class268.method43(var3.field777, Statics.field716);
                if (var5 != null && var5.equals(var1)) {
                    class99.method3389(30, "", arg0 + class226.field3001);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field1154; var6++) {
            class71 var7 = field897[var6];
            String var8 = class268.method43(var7.field831, Statics.field716);
            if (var8 != null && var8.equals(var1)) {
                class99.method3389(30, "", class226.field3006 + arg0 + class226.field3007);
                return;
            }
            if (var7.field832 != null) {
                String var9 = class268.method43(var7.field832, Statics.field716);
                if (var9 != null && var9.equals(var1)) {
                    class99.method3389(30, "", class226.field3006 + arg0 + class226.field3007);
                    return;
                }
            }
        }
        if (class268.method43(Statics.field2829.field875, Statics.field716).equals(var1)) {
            class99.method3389(30, "", class226.field3004);
        } else {
            field937.method3133(243);
            field937.method2899(Statics.method2363(arg0));
            field937.method2905(arg0);
        }
    }

    @ObfuscatedName("bw.jm(Ljava/lang/String;II)V")
    public static final void method987(String arg0, int arg1) {
        field937.method3133(251);
        field937.method2899(Statics.method2363(arg0) + 1);
        field937.method2905(arg0);
        field937.method2940(arg1);
    }

    @ObfuscatedName("w.jo(Ljava/lang/String;I)V")
    public static final void method105(String arg0) {
        if (!arg0.equals("")) {
            field937.method3133(209);
            field937.method2899(Statics.method2363(arg0));
            field937.method2905(arg0);
        }
    }

    @ObfuscatedName("fh.jl(Lhn;I)I")
    public static int method2879(class217 arg0) {
        class199 var1 = (class199) field1086.method3263(((long) arg0.field2630 << 32) + (long) arg0.field2631);
        return var1 == null ? arg0.field2702 : var1.field2454;
    }

    @ObfuscatedName("y.jc(Lhn;I)Lhn;")
    public static class217 method7(class217 arg0) {
        int var1 = method2879(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class217.method2656(arg0.field2649);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("fa.jg(Lhn;I)Z")
    public static boolean method3128(class217 arg0) {
        if (field1121) {
            if (method2879(arg0) != 0) {
                return false;
            }
            if (arg0.field2695 == 0) {
                return false;
            }
        }
        return arg0.field2655;
    }

    @ObfuscatedName("hg.je(Lhn;II)Ljava/lang/String;")
    public static String method3728(class217 arg0, int arg1) {
        if (!class218.method2664(method2879(arg0), arg1) && arg0.field2730 == null) {
            return null;
        } else if (arg0.field2696 == null || arg0.field2696.length <= arg1 || arg0.field2696[arg1] == null || arg0.field2696[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2696[arg1];
        }
    }

    @ObfuscatedName("ab.jb(Lhn;I)Ljava/lang/String;")
    public static String method645(class217 arg0) {
        if (class218.method2674(method2879(arg0)) == 0) {
            return null;
        } else if (arg0.field2709 == null || arg0.field2709.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2709;
        }
    }

    @ObfuscatedName("bb.jr(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method1016(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field895 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field895 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field895 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field895 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field895 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field366 != null) {
            var3 = "/p=" + Statics.field366;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field899 + "/a=" + Statics.field35 + var3 + "/";
    }

    @ObfuscatedName("ae.jq(Ljava/lang/String;ZI)V")
    public static void method300(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1677; var5++) {
            class257 var6 = Statics.method992(var5);
            if ((!arg1 || var6.field3517) && var6.field3500 == -1 && var6.field3477.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field696 = -1;
                    Statics.field393 = null;
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
        Statics.field393 = var3;
        Statics.field3342 = 0;
        Statics.field696 = var4;
        String[] var9 = new String[Statics.field696];
        for (int var10 = 0; var10 < Statics.field696; var10++) {
            var9[var10] = Statics.method992(var3[var10]).field3477;
        }
        class171.method1718(var9, Statics.field393);
    }

    @ObfuscatedName("af.jk([BII)V")
    public static void method544(byte[] arg0, int arg1) {
        if (field931 == null) {
            field931 = new byte[24];
        }
        class184.method3207(arg0, arg1, field931, 0, 24);
    }

    @ObfuscatedName("aq.jw(Lfw;II)V")
    public static void method495(class174 arg0, int arg1) {
        method544(arg0.field2367, arg1);
        if (class156.field2224 == null) {
            return;
        }
        try {
            class156.field2224.method1723(0L);
            class156.field2224.method1736(arg0.field2367, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ba.ji(Lfw;B)V")
    public static void method996(class174 arg0) {
        if (field931 == null) {
            byte[] var1 = class156.method688();
            arg0.method3036(var1, 0, var1.length);
        } else {
            arg0.method3036(field931, 0, field931.length);
        }
    }
}

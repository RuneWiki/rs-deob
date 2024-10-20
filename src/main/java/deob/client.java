package deob;

import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class162[] field991 = new class162[4];

    @ObfuscatedName("client.ay")
    public static boolean field1212 = true;

    @ObfuscatedName("client.ak")
    public static int field930 = 1;

    @ObfuscatedName("client.ao")
    public static int field931 = 0;

    @ObfuscatedName("client.be")
    public static int field932 = 0;

    @ObfuscatedName("client.bo")
    public static boolean field1002 = false;

    @ObfuscatedName("client.bj")
    public static boolean field1047 = false;

    @ObfuscatedName("client.bh")
    public static int field1078 = 0;

    @ObfuscatedName("client.bq")
    public static int field936 = 0;

    @ObfuscatedName("client.bt")
    public static boolean field979 = true;

    @ObfuscatedName("client.bi")
    public static int field938 = 0;

    @ObfuscatedName("client.by")
    public static long field1123 = 1L;

    @ObfuscatedName("client.ba")
    public static int field940 = -1;

    @ObfuscatedName("client.bw")
    public static int field1007 = -1;

    @ObfuscatedName("client.bk")
    public static int field942 = -1;

    @ObfuscatedName("client.br")
    public static boolean field1043 = true;

    @ObfuscatedName("client.bd")
    public static boolean field944 = false;

    @ObfuscatedName("client.bv")
    public static int field982 = 0;

    @ObfuscatedName("client.bx")
    public static int field946 = 0;

    @ObfuscatedName("client.bm")
    public static int field947 = 0;

    @ObfuscatedName("client.bn")
    public static int field948 = 0;

    @ObfuscatedName("client.bc")
    public static int field949 = 0;

    @ObfuscatedName("client.bp")
    public static int field950 = 0;

    @ObfuscatedName("client.cs")
    public static int field1177 = 0;

    @ObfuscatedName("client.ce")
    public static int field1128 = 0;

    @ObfuscatedName("client.ck")
    public static int field953 = 0;

    @ObfuscatedName("client.ca")
    public static class92 field954 = class92.field1440;

    @ObfuscatedName("client.cj")
    public static class92 field985 = class92.field1440;

    @ObfuscatedName("client.co")
    public static int field1185 = 0;

    @ObfuscatedName("client.cl")
    public static int field1174 = 0;

    @ObfuscatedName("client.cg")
    public static int field960 = 0;

    @ObfuscatedName("client.da")
    public static int field961 = 0;

    @ObfuscatedName("client.dd")
    public static int field1050 = 0;

    @ObfuscatedName("client.de")
    public static int field1198 = 0;

    @ObfuscatedName("client.dl")
    public static int field1030 = 0;

    @ObfuscatedName("client.do")
    public static int field965 = 0;

    @ObfuscatedName("client.dy")
    public static byte[] field967 = null;

    @ObfuscatedName("client.dv")
    public static class87[] field968 = new class87[32768];

    @ObfuscatedName("client.dz")
    public static int field969 = 0;

    @ObfuscatedName("client.df")
    public static int[] field951 = new int[32768];

    @ObfuscatedName("client.dp")
    public static int field971 = 0;

    @ObfuscatedName("client.dw")
    public static int[] field972 = new int[250];

    @ObfuscatedName("client.er")
    public static class180 field973 = new class180(5000);

    @ObfuscatedName("client.ed")
    public static class180 field974 = new class180(5000);

    @ObfuscatedName("client.ez")
    public static class180 field975 = new class180(15000);

    @ObfuscatedName("client.eh")
    public static int field943 = 0;

    @ObfuscatedName("client.ey")
    public static int field977 = 0;

    @ObfuscatedName("client.em")
    public static int field978 = 0;

    @ObfuscatedName("client.ea")
    public static int field1110 = 0;

    @ObfuscatedName("client.es")
    public static int field996 = 0;

    @ObfuscatedName("client.ex")
    public static int field981 = 0;

    @ObfuscatedName("client.et")
    public static int field1168 = 0;

    @ObfuscatedName("client.ei")
    public static int field983 = 0;

    @ObfuscatedName("client.ef")
    public static boolean field984 = false;

    @ObfuscatedName("client.eu")
    public static HashMap field935 = new HashMap();

    @ObfuscatedName("client.ec")
    public static int field1027 = 0;

    @ObfuscatedName("client.fn")
    public static int field987 = 1;

    @ObfuscatedName("client.fc")
    public static int field988 = 0;

    @ObfuscatedName("client.fl")
    public static int field989 = 1;

    @ObfuscatedName("client.fp")
    public static int field1143 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field1107 = false;

    @ObfuscatedName("client.fv")
    public static int[][][] field993 = new int[4][13][13];

    @ObfuscatedName("client.fs")
    public static final int[] field1023 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fj")
    public static int field995 = 0;

    @ObfuscatedName("client.fx")
    public static int field1049 = 2;

    @ObfuscatedName("client.fw")
    public static int field997 = 0;

    @ObfuscatedName("client.fi")
    public static int field1130 = 2;

    @ObfuscatedName("client.fr")
    public static int field1042 = 0;

    @ObfuscatedName("client.fy")
    public static int field1000 = 1;

    @ObfuscatedName("client.fg")
    public static int field937 = 0;

    @ObfuscatedName("client.fb")
    public static int field1088 = 0;

    @ObfuscatedName("client.fz")
    public static int field1003 = 2;

    @ObfuscatedName("client.fo")
    public static int field1004 = 0;

    @ObfuscatedName("client.gl")
    public static int field1005 = 1;

    @ObfuscatedName("client.gg")
    public static int field1040 = 0;

    @ObfuscatedName("client.gf")
    public static int field1120 = 0;

    @ObfuscatedName("client.gj")
    public static int field1008 = 2301979;

    @ObfuscatedName("client.gy")
    public static int field1104 = 5063219;

    @ObfuscatedName("client.gw")
    public static int field1010 = 3353893;

    @ObfuscatedName("client.go")
    public static int field994 = 7759444;

    @ObfuscatedName("client.gh")
    public static boolean field1012 = false;

    @ObfuscatedName("client.gm")
    public static int field1013 = 0;

    @ObfuscatedName("client.ga")
    public static int field1014 = 128;

    @ObfuscatedName("client.hz")
    public static int field1015 = 0;

    @ObfuscatedName("client.hj")
    public static int field1016 = 0;

    @ObfuscatedName("client.hw")
    public static int field1017 = 0;

    @ObfuscatedName("client.he")
    public static int field1070 = 0;

    @ObfuscatedName("client.hh")
    public static int field962 = 0;

    @ObfuscatedName("client.hi")
    public static int field1020 = 50;

    @ObfuscatedName("client.hf")
    public static int field1021 = 0;

    @ObfuscatedName("client.ht")
    public static boolean field1022 = false;

    @ObfuscatedName("client.hc")
    public static int field1048 = 0;

    @ObfuscatedName("client.hk")
    public static int field1024 = 0;

    @ObfuscatedName("client.hq")
    public static int field1183 = 50;

    @ObfuscatedName("client.ho")
    public static int[] field1026 = new int[field1183];

    @ObfuscatedName("client.hp")
    public static int[] field1096 = new int[field1183];

    @ObfuscatedName("client.hy")
    public static int[] field1028 = new int[field1183];

    @ObfuscatedName("client.hv")
    public static int[] field999 = new int[field1183];

    @ObfuscatedName("client.hb")
    public static int[] field1018 = new int[field1183];

    @ObfuscatedName("client.hr")
    public static int[] field1031 = new int[field1183];

    @ObfuscatedName("client.hl")
    public static int[] field1025 = new int[field1183];

    @ObfuscatedName("client.hu")
    public static String[] field1033 = new String[field1183];

    @ObfuscatedName("client.hs")
    public static int[][] field1034 = new int[104][104];

    @ObfuscatedName("client.hx")
    public static int field1035 = 0;

    @ObfuscatedName("client.hg")
    public static int field1125 = -1;

    @ObfuscatedName("client.hd")
    public static int field1094 = -1;

    @ObfuscatedName("client.hn")
    public static int field1176 = 0;

    @ObfuscatedName("client.ip")
    public static int field1039 = 0;

    @ObfuscatedName("client.iw")
    public static int field1001 = 0;

    @ObfuscatedName("client.ia")
    public static int field1187 = 0;

    @ObfuscatedName("client.ih")
    public static int field933 = 0;

    @ObfuscatedName("client.ik")
    public static int field1036 = 0;

    @ObfuscatedName("client.ie")
    public static int field1044 = 0;

    @ObfuscatedName("client.iq")
    public static int field1045 = 0;

    @ObfuscatedName("client.is")
    public static int field1082 = 0;

    @ObfuscatedName("client.iv")
    public static int field941 = 0;

    @ObfuscatedName("client.iy")
    public static boolean field959 = false;

    @ObfuscatedName("client.im")
    public static int field1206 = 0;

    @ObfuscatedName("client.it")
    public static String field1085 = null;

    @ObfuscatedName("client.ic")
    public static int field986 = 0;

    @ObfuscatedName("client.ig")
    public static class75[] field1051 = new class75[2048];

    @ObfuscatedName("client.iu")
    public static int field1214 = -1;

    @ObfuscatedName("client.if")
    public static int field998 = 0;

    @ObfuscatedName("client.id")
    public static int field1054 = 0;

    @ObfuscatedName("client.ir")
    public static int[] field1077 = new int[1000];

    @ObfuscatedName("client.jk")
    public static final int[] field1056 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ju")
    public static String[] field1057 = new String[8];

    @ObfuscatedName("client.ji")
    public static boolean[] field1058 = new boolean[8];

    @ObfuscatedName("client.jn")
    public static int[] field1059 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jp")
    public static int field1060 = -1;

    @ObfuscatedName("client.jc")
    public static class194[][][] field939 = new class194[4][104][104];

    @ObfuscatedName("client.jx")
    public static class194 field980 = new class194();

    @ObfuscatedName("client.jb")
    public static class194 field1063 = new class194();

    @ObfuscatedName("client.jf")
    public static class194 field1173 = new class194();

    @ObfuscatedName("client.jo")
    public static int[] field1065 = new int[25];

    @ObfuscatedName("client.jj")
    public static int[] field1066 = new int[25];

    @ObfuscatedName("client.jv")
    public static int[] field1205 = new int[25];

    @ObfuscatedName("client.jq")
    public static int field1068 = 0;

    @ObfuscatedName("client.jl")
    public static boolean field1069 = false;

    @ObfuscatedName("client.jy")
    public static int field1204 = 0;

    @ObfuscatedName("client.jw")
    public static int[] field1071 = new int[500];

    @ObfuscatedName("client.jr")
    public static int[] field1072 = new int[500];

    @ObfuscatedName("client.ja")
    public static int[] field1178 = new int[500];

    @ObfuscatedName("client.jd")
    public static int[] field1074 = new int[500];

    @ObfuscatedName("client.js")
    public static String[] field1075 = new String[500];

    @ObfuscatedName("client.kl")
    public static String[] field1199 = new String[500];

    @ObfuscatedName("client.kd")
    public static boolean field1157 = false;

    @ObfuscatedName("client.ko")
    public static int field1091 = -1;

    @ObfuscatedName("client.kp")
    public static boolean field1079 = false;

    @ObfuscatedName("client.ky")
    public static int field1080 = -1;

    @ObfuscatedName("client.kf")
    public static int field1081 = -1;

    @ObfuscatedName("client.kk")
    public static int field992 = 0;

    @ObfuscatedName("client.kq")
    public static int field1083 = 50;

    @ObfuscatedName("client.ki")
    public static int field1084 = 0;

    @ObfuscatedName("client.kz")
    public static boolean field1086 = false;

    @ObfuscatedName("client.ku")
    public static int field1087 = -1;

    @ObfuscatedName("client.kj")
    public static int field1175 = -1;

    @ObfuscatedName("client.kx")
    public static String field1089 = null;

    @ObfuscatedName("client.kv")
    public static String field1090 = null;

    @ObfuscatedName("client.ke")
    public static int field1164 = -1;

    @ObfuscatedName("client.ka")
    public static class191 field1092 = new class191(8);

    @ObfuscatedName("client.kt")
    public static int field1093 = 0;

    @ObfuscatedName("client.kr")
    public static int field1006 = 0;

    @ObfuscatedName("client.kc")
    public static class217 field964 = null;

    @ObfuscatedName("client.ln")
    public static int field970 = 0;

    @ObfuscatedName("client.lp")
    public static int field1097 = 0;

    @ObfuscatedName("client.ll")
    public static int field1098 = 0;

    @ObfuscatedName("client.le")
    public static int field1194 = -1;

    @ObfuscatedName("client.lw")
    public static boolean field1100 = false;

    @ObfuscatedName("client.lk")
    public static boolean field1101 = false;

    @ObfuscatedName("client.lb")
    public static boolean field1102 = false;

    @ObfuscatedName("client.lz")
    public static class217 field1103 = null;

    @ObfuscatedName("client.lf")
    public static class217 field1165 = null;

    @ObfuscatedName("client.ld")
    public static class217 field1105 = null;

    @ObfuscatedName("client.lr")
    public static int field1106 = 0;

    @ObfuscatedName("client.ls")
    public static int field1142 = 0;

    @ObfuscatedName("client.li")
    public static class217 field1108 = null;

    @ObfuscatedName("client.la")
    public static boolean field1109 = false;

    @ObfuscatedName("client.lo")
    public static int field1064 = -1;

    @ObfuscatedName("client.lh")
    public static int field1147 = -1;

    @ObfuscatedName("client.lq")
    public static boolean field1112 = false;

    @ObfuscatedName("client.lx")
    public static int field1113 = -1;

    @ObfuscatedName("client.ly")
    public static int field1114 = -1;

    @ObfuscatedName("client.lg")
    public static boolean field1115 = false;

    @ObfuscatedName("client.lc")
    public static int field1122 = 1;

    @ObfuscatedName("client.mh")
    public static int[] field1117 = new int[32];

    @ObfuscatedName("client.mx")
    public static int field1118 = 0;

    @ObfuscatedName("client.mf")
    public static int[] field1119 = new int[32];

    @ObfuscatedName("client.my")
    public static int field1138 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field1121 = new int[32];

    @ObfuscatedName("client.ms")
    public static int field1052 = 0;

    @ObfuscatedName("client.mo")
    public static int field1038 = 0;

    @ObfuscatedName("client.ma")
    public static int field1067 = 0;

    @ObfuscatedName("client.mj")
    public static int field1037 = 0;

    @ObfuscatedName("client.me")
    public static int field1126 = 0;

    @ObfuscatedName("client.mn")
    public static int field1127 = 0;

    @ObfuscatedName("client.mk")
    public static int field1129 = 0;

    @ObfuscatedName("client.mg")
    public static int field955 = 0;

    @ObfuscatedName("client.mm")
    public static class194 field956 = new class194();

    @ObfuscatedName("client.mv")
    public static class194 field1131 = new class194();

    @ObfuscatedName("client.mq")
    public static class194 field1132 = new class194();

    @ObfuscatedName("client.mp")
    public static class191 field1133 = new class191(512);

    @ObfuscatedName("client.mr")
    public static int field1134 = 0;

    @ObfuscatedName("client.mu")
    public static int field1135 = -2;

    @ObfuscatedName("client.mb")
    public static boolean[] field1136 = new boolean[100];

    @ObfuscatedName("client.mc")
    public static boolean[] field1137 = new boolean[100];

    @ObfuscatedName("client.mt")
    public static boolean[] field1041 = new boolean[100];

    @ObfuscatedName("client.nh")
    public static int[] field1139 = new int[100];

    @ObfuscatedName("client.na")
    public static int[] field1140 = new int[100];

    @ObfuscatedName("client.nt")
    public static int[] field1141 = new int[100];

    @ObfuscatedName("client.np")
    public static int[] field1053 = new int[100];

    @ObfuscatedName("client.nq")
    public static int field1162 = 0;

    @ObfuscatedName("client.nz")
    public static long field1144 = 0L;

    @ObfuscatedName("client.nm")
    public static boolean field1145 = true;

    @ObfuscatedName("client.nu")
    public static int[] field1146 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ns")
    public static int field1032 = 0;

    @ObfuscatedName("client.nv")
    public static int field1148 = 0;

    @ObfuscatedName("client.ny")
    public static String field1149 = "";

    @ObfuscatedName("client.nn")
    public static long[] field1150 = new long[100];

    @ObfuscatedName("client.nb")
    public static int field1151 = 0;

    @ObfuscatedName("client.nx")
    public static int field1152 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field1153 = new int[128];

    @ObfuscatedName("client.nk")
    public static int[] field1154 = new int[128];

    @ObfuscatedName("client.ni")
    public static long field1155 = -1L;

    @ObfuscatedName("client.or")
    public static String field1156 = null;

    @ObfuscatedName("client.od")
    public static String field1055 = null;

    @ObfuscatedName("client.ou")
    public static int field1158 = -1;

    @ObfuscatedName("client.oq")
    public static int field1159 = 0;

    @ObfuscatedName("client.oa")
    public static int[] field1076 = new int[1000];

    @ObfuscatedName("client.og")
    public static int[] field1161 = new int[1000];

    @ObfuscatedName("client.ol")
    public static class286[] field1111 = new class286[1000];

    @ObfuscatedName("client.op")
    public static int field1163 = 0;

    @ObfuscatedName("client.ot")
    public static int field945 = 0;

    @ObfuscatedName("client.oy")
    public static int field1171 = 0;

    @ObfuscatedName("client.ov")
    public static int field1166 = 255;

    @ObfuscatedName("client.oc")
    public static int field1167 = -1;

    @ObfuscatedName("client.oi")
    public static boolean field1124 = false;

    @ObfuscatedName("client.oz")
    public static int field1169 = 127;

    @ObfuscatedName("client.oh")
    public static int field1170 = 127;

    @ObfuscatedName("client.pg")
    public static int field1062 = 0;

    @ObfuscatedName("client.pl")
    public static int[] field1172 = new int[50];

    @ObfuscatedName("client.pk")
    public static int[] field1019 = new int[50];

    @ObfuscatedName("client.pm")
    public static int[] field1029 = new int[50];

    @ObfuscatedName("client.pv")
    public static int[] field957 = new int[50];

    @ObfuscatedName("client.ph")
    public static class106[] field1009 = new class106[50];

    @ObfuscatedName("client.pq")
    public static boolean field990 = false;

    @ObfuscatedName("client.ps")
    public static boolean[] field1184 = new boolean[5];

    @ObfuscatedName("client.pt")
    public static int[] field1179 = new int[5];

    @ObfuscatedName("client.pj")
    public static int[] field1180 = new int[5];

    @ObfuscatedName("client.qx")
    public static int[] field1181 = new int[5];

    @ObfuscatedName("client.qt")
    public static int[] field1182 = new int[5];

    @ObfuscatedName("client.qd")
    public static short field1046 = 256;

    @ObfuscatedName("client.qm")
    public static short field976 = 205;

    @ObfuscatedName("client.qr")
    public static short field1095 = 256;

    @ObfuscatedName("client.ql")
    public static short field1186 = 320;

    @ObfuscatedName("client.qy")
    public static short field1160 = 1;

    @ObfuscatedName("client.qk")
    public static short field1188 = 32767;

    @ObfuscatedName("client.qn")
    public static short field1189 = 1;

    @ObfuscatedName("client.qz")
    public static short field1190 = 32767;

    @ObfuscatedName("client.qp")
    public static int field1191 = 0;

    @ObfuscatedName("client.qa")
    public static int field1192 = 0;

    @ObfuscatedName("client.qh")
    public static int field1193 = 0;

    @ObfuscatedName("client.qj")
    public static int field1011 = 0;

    @ObfuscatedName("client.qv")
    public static int field1195 = 0;

    @ObfuscatedName("client.qc")
    public static int field1196 = 0;

    @ObfuscatedName("client.qq")
    public static int field1197 = 0;

    @ObfuscatedName("client.qb")
    public static class66[] field952 = new class66[400];

    @ObfuscatedName("client.qi")
    public static class196 field1061 = new class196();

    @ObfuscatedName("client.qe")
    public static int field1200 = 0;

    @ObfuscatedName("client.qu")
    public static class71[] field1201 = new class71[400];

    @ObfuscatedName("client.qg")
    public static class214 field1202 = new class214();

    @ObfuscatedName("client.qo")
    public static int field1203 = -1;

    @ObfuscatedName("client.qs")
    public static int field963 = -1;

    @ObfuscatedName("client.rg")
    public static class17[] field1073 = new class17[8];

    @ObfuscatedName("client.ru")
    public static long field1099 = -1L;

    @ObfuscatedName("client.ri")
    public static long field1207 = -1L;

    @ObfuscatedName("client.rb")
    public static final class74 field934 = new class74();

    @ObfuscatedName("client.rc")
    public static int[] field1209 = new int[50];

    @ObfuscatedName("client.rh")
    public static int[] field1210 = new int[50];

    @ObfuscatedName("er.et(B)Lkg;")
    public static class289 method2270() {
        return Statics.field15;
    }

    @ObfuscatedName("client.ak(B)V")
    public final void method753() {
    }

    public final void init() {
        if (!this.method732()) {
            return;
        }
        class275[] var1 = new class275[] { class275.field3722, class275.field3725, class275.field3728, class275.field3719, class275.field3726, class275.field3724, class275.field3730, class275.field3721, class275.field3718, class275.field3729, class275.field3720, class275.field3727, class275.field3717, class275.field3731, class275.field3723 };
        class275[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class275 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3732);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3732)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class89.field1418)) {
                            field1002 = true;
                        } else {
                            field1002 = false;
                        }
                        break;
                    case 2:
                        field931 = Integer.parseInt(var5);
                        break;
                    case 3:
                        Statics.field825 = var5;
                    case 4:
                    case 7:
                    default:
                        break;
                    case 5:
                        field1078 = Integer.parseInt(var5);
                        break;
                    case 6:
                        Statics.field308 = Integer.parseInt(var5);
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class89.field1418)) {
                        }
                        break;
                    case 9:
                        Statics.field834 = var5;
                        break;
                    case 10:
                        field932 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field930 = Integer.parseInt(var5);
                        break;
                    case 12:
                        class233[] var11 = new class233[] { class233.field3197, class233.field3192, class233.field3189, class233.field3191, class233.field3190, class233.field3187 };
                        Statics.field401 = (class233) class169.method1610(var11, Integer.parseInt(var5));
                        if (Statics.field401 == class233.field3192) {
                            Statics.field1332 = class290.field3851;
                        } else {
                            Statics.field1332 = class290.field3846;
                        }
                        break;
                    case 13:
                        int var6 = Integer.parseInt(var5);
                        class232[] var7 = class232.method3723();
                        int var8 = 0;
                        class232 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class232 var9 = var7[var8];
                            if (var9.field3182 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field340 = var10;
                        break;
                    case 14:
                        Statics.field313 = Integer.parseInt(var5);
                }
            }
        }
        class140.field2101 = false;
        field1047 = false;
        Statics.field966 = this.getCodeBase().getHost();
        String var12 = Statics.field340.field3181;
        byte var13 = 0;
        try {
            Statics.field2266 = 17;
            Statics.field2272 = var13;
            try {
                Statics.field3763 = System.getProperty("os.name");
            } catch (Exception var58) {
                Statics.field3763 = "Unknown";
            }
            Statics.field2274 = Statics.field3763.toLowerCase();
            try {
                Statics.field1219 = System.getProperty("user.home");
                if (Statics.field1219 != null) {
                    Statics.field1219 = Statics.field1219 + "/";
                }
            } catch (Exception var57) {
            }
            try {
                if (Statics.field2274.startsWith("win")) {
                    if (Statics.field1219 == null) {
                        Statics.field1219 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1219 == null) {
                    Statics.field1219 = System.getenv("HOME");
                }
                if (Statics.field1219 != null) {
                    Statics.field1219 = Statics.field1219 + "/";
                }
            } catch (Exception var56) {
            }
            if (Statics.field1219 == null) {
                Statics.field1219 = "~/";
            }
            Statics.field1409 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1219, "/tmp/", "" };
            Statics.field1539 = new String[] { ".jagex_cache_" + Statics.field2272, ".file_store_" + Statics.field2272 };
            int var17 = 0;
            label259: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field3688 = new File(Statics.field1219, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field3688.exists()) {
                    try {
                        class125 var22 = new class125(Statics.field3688, "rw", 10000L);
                        class174 var23 = new class174((int) var22.method2125());
                        while (var23.field2407 < var23.field2415.length) {
                            int var24 = var22.method2124(var23.field2415, var23.field2407, var23.field2415.length - var23.field2407);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field2407 += var24;
                        }
                        var23.field2407 = 0;
                        int var25 = var23.method2870();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method2870();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method2896();
                            if (var26 == 1) {
                                var20 = var23.method2896();
                            }
                        } else {
                            var19 = var23.method2923();
                            if (var26 == 1) {
                                var20 = var23.method2923();
                            }
                        }
                        var22.method2129();
                    } catch (IOException var60) {
                        var60.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        if (!class156.method305(var29, true)) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label235: for (int var30 = 0; var30 < Statics.field1539.length; var30++) {
                        for (int var31 = 0; var31 < Statics.field1409.length; var31++) {
                            File var32 = new File(Statics.field1409[var31] + Statics.field1539[var30] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var32.exists() && class156.method305(new File(var32, "test.dat"), true)) {
                                var19 = var32.toString();
                                var21 = true;
                                break label235;
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field1219 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
                    var21 = true;
                }
                if (var20 != null) {
                    File var33 = new File(var20);
                    File var34 = new File(var19);
                    try {
                        File[] var35 = var33.listFiles();
                        File[] var36 = var35;
                        for (int var37 = 0; var37 < var36.length; var37++) {
                            File var38 = var36[var37];
                            File var39 = new File(var34, var38.getName());
                            boolean var40 = var38.renameTo(var39);
                            if (!var40) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var59) {
                        var59.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    File var42 = new File(var19);
                    Object var43 = null;
                    try {
                        class125 var44 = new class125(Statics.field3688, "rw", 10000L);
                        class174 var45 = new class174(500);
                        var45.method2865(3);
                        var45.method2865(var43 == null ? 0 : 1);
                        var45.method2863(var42.getPath());
                        if (var43 != null) {
                            var45.method2863(((File) var43).getPath());
                        }
                        var44.method2145(var45.field2415, 0, var45.field2407);
                        var44.method2129();
                    } catch (IOException var55) {
                        var55.printStackTrace();
                    }
                }
                File var47 = new File(var19);
                Statics.field2265 = var47;
                if (!Statics.field2265.exists()) {
                    Statics.field2265.mkdirs();
                }
                File[] var48 = Statics.field2265.listFiles();
                if (var48 == null) {
                    break;
                }
                File[] var49 = var48;
                int var50 = 0;
                while (true) {
                    if (var50 >= var49.length) {
                        break label259;
                    }
                    File var51 = var49[var50];
                    if (!class156.method305(var51, false)) {
                        var17++;
                        break;
                    }
                    var50++;
                }
            }
            File var52 = Statics.field2265;
            Statics.field2279 = var52;
            if (!Statics.field2279.exists()) {
                throw new RuntimeException("");
            }
            class158.field2282 = true;
            class156.method1566();
            class156.field2270 = new class124(new class125(class158.method231("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class156.field2271 = new class124(new class125(class158.method231("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2611 = new class124[Statics.field2266];
            for (int var53 = 0; var53 < Statics.field2266; var53++) {
                Statics.field2611[var53] = new class124(new class125(class158.method231("main_file_cache.idx" + var53), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var61) {
            class153.method131((String) null, var61);
        }
        Statics.field1215 = this;
        this.method763(765, 503, 143);
    }

    @ObfuscatedName("client.as(I)V")
    public final void method743() {
        Statics.field280 = field932 == 0 ? 43594 : field930 + 40000;
        Statics.field791 = field932 == 0 ? 443 : field930 + 50000;
        Statics.field2291 = Statics.field280;
        Statics.field3677 = class215.field2631;
        Statics.field2628 = class215.field2632;
        Statics.field2624 = class215.field2633;
        Statics.field1704 = class215.field2636;
        this.method724();
        this.method742();
        Statics.field620 = this.method835();
        Statics.field1399 = new class161(255, class156.field2270, class156.field2271, 500000);
        class125 var1 = null;
        class82 var2 = new class82();
        try {
            var1 = class156.method2666("", Statics.field401.field3193, false);
            byte[] var3 = new byte[(int) var1.method2125()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2124(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class82(new class174(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method2129();
            }
        } catch (Exception var9) {
        }
        Statics.field304 = var2;
        this.method722();
        class57.method472(this, Statics.field1660);
        if (field932 != 0) {
            field944 = true;
        }
        method3763(Statics.field304.field1337);
    }

    @ObfuscatedName("client.av(B)V")
    public final void method772() {
        field938++;
        this.method1037();
        class237.method3761();
        class204.method2173();
        method975();
        class51.method2811();
        class60 var1 = class60.field740;
        synchronized (class60.field740) {
            class60.field737 = class60.field734;
            class60.field738 = class60.field735;
            class60.field739 = class60.field745;
            class60.field733 = class60.field736;
            class60.field746 = class60.field741;
            class60.field751 = class60.field742;
            class60.field747 = class60.field743;
            class60.field736 = 0;
        }
        if (Statics.field620 != null) {
            int var3 = Statics.field620.method617();
            field955 = var3;
        }
        if (field936 == 0) {
            method1723();
            class59.method962();
        } else if (field936 == 5) {
            class93.method445(this);
            method1723();
            class59.method962();
        } else if (field936 == 10 || field936 == 11) {
            class93.method445(this);
        } else if (field936 == 20) {
            class93.method445(this);
            this.method1250();
        } else if (field936 == 25) {
            method961();
        }
        if (field936 == 30) {
            this.method1041();
        } else if (field936 == 40 || field936 == 45) {
            this.method1250();
        }
    }

    @ObfuscatedName("client.ag(ZI)V")
    public final void method837(boolean arg0) {
        boolean var2;
        label143: {
            try {
                if (class204.field2515 == 2) {
                    if (Statics.field1566 == null) {
                        Statics.field1566 = class210.method3564(Statics.field2514, Statics.field2516, Statics.field2281);
                        if (Statics.field1566 == null) {
                            var2 = false;
                            break label143;
                        }
                    }
                    if (Statics.field2510 == null) {
                        Statics.field2510 = new class113(Statics.field316, Statics.field2511);
                    }
                    if (Statics.field2512.method3388(Statics.field1566, Statics.field2513, Statics.field2510, 22050)) {
                        Statics.field2512.method3417();
                        Statics.field2512.method3386(Statics.field2230);
                        Statics.field2512.method3391(Statics.field1566, Statics.field1405);
                        class204.field2515 = 0;
                        Statics.field1566 = null;
                        Statics.field2510 = null;
                        Statics.field2514 = null;
                        var2 = true;
                        break label143;
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                Statics.field2512.method3392();
                class204.field2515 = 0;
                Statics.field1566 = null;
                Statics.field2510 = null;
                Statics.field2514 = null;
            }
            var2 = false;
        }
        if (var2 && field1124 && Statics.field268 != null) {
            Statics.field268.method1865();
        }
        if ((field936 == 10 || field936 == 20 || field936 == 30) && field1144 != 0L && class176.method89() > field1144) {
            int var5 = field1145 ? 2 : 1;
            method3763(var5);
        }
        if (arg0) {
            for (int var6 = 0; var6 < 100; var6++) {
                field1136[var6] = true;
            }
        }
        if (field936 == 0) {
            this.method747(class93.field1449, class93.field1456, arg0);
        } else if (field936 == 5) {
            class93.method1567(Statics.field923, Statics.field2345, Statics.field474, arg0);
        } else if (field936 == 10 || field936 == 11) {
            class93.method1567(Statics.field923, Statics.field2345, Statics.field474, arg0);
        } else if (field936 == 20) {
            class93.method1567(Statics.field923, Statics.field2345, Statics.field474, arg0);
        } else if (field936 == 25) {
            if (field1143 == 1) {
                if (field1027 > field987) {
                    field987 = field1027;
                }
                int var7 = (field987 * 50 - field1027 * 50) / field987;
                method4027(class226.field2863 + class89.field1415 + class89.field1412 + var7 + "%" + class89.field1413, false);
            } else if (field1143 == 2) {
                if (field988 > field989) {
                    field989 = field988;
                }
                int var8 = (field989 * 50 - field988 * 50) / field989 + 50;
                method4027(class226.field2863 + class89.field1415 + class89.field1412 + var8 + "%" + class89.field1413, false);
            } else {
                method4027(class226.field2863, false);
            }
        } else if (field936 == 30) {
            this.method1043();
        } else if (field936 == 40) {
            method4027(class226.field3116 + class89.field1415 + class226.field2865, false);
        } else if (field936 == 45) {
            method4027(class226.field3011, false);
        }
        if (field936 == 30 && field1162 == 0 && !arg0) {
            for (int var9 = 0; var9 < field1134; var9++) {
                if (field1137[var9]) {
                    Statics.field2344.method700(field1139[var9], field1140[var9], field1141[var9], field1053[var9]);
                    field1137[var9] = false;
                }
            }
        } else if (field936 > 0) {
            Statics.field2344.method703(0, 0);
            for (int var10 = 0; var10 < field1134; var10++) {
                field1137[var10] = false;
            }
        }
    }

    @ObfuscatedName("client.az(I)V")
    public final void method851() {
        if (Statics.field917.method1666()) {
            Statics.field917.method1648();
        }
        if (Statics.field808 != null) {
            Statics.field808.field871 = false;
        }
        Statics.field808 = null;
        if (Statics.field781 != null) {
            Statics.field781.method2716();
            Statics.field781 = null;
        }
        if (class51.field647 != null) {
            class51 var1 = class51.field647;
            synchronized (class51.field647) {
                class51.field647 = null;
            }
        }
        class60.method1569();
        Statics.field620 = null;
        if (Statics.field268 != null) {
            Statics.field268.method1873();
        }
        if (Statics.field2156 != null) {
            Statics.field2156.method1873();
        }
        class239.method3073();
        Object var3 = class237.field3235;
        synchronized (class237.field3235) {
            if (class237.field3237 != 0) {
                class237.field3237 = 1;
                try {
                    class237.field3235.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class156.field2270.method2096();
            for (int var6 = 0; var6 < Statics.field2266; var6++) {
                Statics.field2611[var6].method2096();
            }
            class156.field2271.method2096();
            class156.field2269.method2096();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ic.ef(IB)V")
    public static void method4071(int arg0) {
        if (field936 == arg0) {
            return;
        }
        if (field936 == 0) {
            Statics.field1215.method725();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field1050 = 0;
            field1198 = 0;
            field1030 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field918 != null) {
            Statics.field918.method2716();
            Statics.field918 = null;
        }
        if (field936 == 25) {
            field1143 = 0;
            field1027 = 0;
            field987 = 1;
            field988 = 0;
            field989 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method80(Statics.field842, Statics.field3626, true, 0);
        } else if (arg0 == 20) {
            class93.method80(Statics.field842, Statics.field3626, true, field936 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method80(Statics.field842, Statics.field3626, false, 4);
        } else if (Statics.field335) {
            Statics.field1443 = null;
            Statics.field1783 = null;
            Statics.field1471 = null;
            Statics.field475 = null;
            Statics.field2610 = null;
            Statics.field1458 = null;
            Statics.field693 = null;
            Statics.field29 = null;
            Statics.field1238 = null;
            Statics.field333 = null;
            Statics.field888 = null;
            Statics.field250 = null;
            Statics.field286 = null;
            Statics.field1408 = null;
            Statics.field3684 = null;
            Statics.field1784 = null;
            Statics.field1425 = null;
            Statics.field1559 = null;
            Statics.field259 = null;
            Statics.field363 = null;
            Statics.field345 = null;
            Statics.field328 = null;
            class204.method1536(2);
            class239.method1465(true);
            Statics.field335 = false;
        }
        field936 = arg0;
    }

    @ObfuscatedName("client.ew(I)V")
    public void method1037() {
        if (field936 != 1000) {
            boolean var1 = class239.method3765();
            if (!var1) {
                this.method1038();
            }
        }
    }

    @ObfuscatedName("client.eg(S)V")
    public void method1038() {
        if (class239.field3268 >= 4) {
            this.method749("js5crc");
            field936 = 1000;
            return;
        }
        if (class239.field3264 >= 4) {
            if (field936 <= 5) {
                this.method749("js5io");
                field936 = 1000;
                return;
            }
            field960 = 3000;
            class239.field3264 = 3;
        }
        if (--field960 + 1 > 0) {
            return;
        }
        try {
            if (field1174 == 0) {
                Statics.field266 = Statics.field722.method2682(Statics.field966, Statics.field2291);
                field1174++;
            }
            if (field1174 == 1) {
                if (Statics.field266.field2245 == 2) {
                    this.method1039(-1);
                    return;
                }
                if (Statics.field266.field2245 == 1) {
                    field1174++;
                }
            }
            if (field1174 == 2) {
                Statics.field958 = new class160((Socket) Statics.field266.field2249, Statics.field722);
                class174 var1 = new class174(5);
                var1.method2865(15);
                var1.method2871(143);
                Statics.field958.method2733(var1.field2415, 0, 5);
                field1174++;
                Statics.field307 = class176.method89();
            }
            if (field1174 == 3) {
                if (field936 <= 5 || Statics.field958.method2735() > 0) {
                    int var2 = Statics.field958.method2718();
                    if (var2 != 0) {
                        this.method1039(var2);
                        return;
                    }
                    field1174++;
                } else if (class176.method89() - Statics.field307 > 30000L) {
                    this.method1039(-2);
                    return;
                }
            }
            if (field1174 == 4) {
                class239.method461(Statics.field958, field936 > 20);
                Statics.field266 = null;
                Statics.field958 = null;
                field1174 = 0;
                field961 = 0;
            }
        } catch (IOException var4) {
            this.method1039(-3);
        }
    }

    @ObfuscatedName("client.ep(II)V")
    public void method1039(int arg0) {
        Statics.field266 = null;
        Statics.field958 = null;
        field1174 = 0;
        if (Statics.field280 == Statics.field2291) {
            Statics.field2291 = Statics.field791;
        } else {
            Statics.field2291 = Statics.field280;
        }
        field961++;
        if (field961 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field936 <= 5) {
                this.method749("js5connect_full");
                field936 = 1000;
            } else {
                field960 = 3000;
            }
        } else if (field961 >= 2 && arg0 == 6) {
            this.method749("js5connect_outofdate");
            field936 = 1000;
        } else if (field961 >= 4) {
            if (field936 <= 5) {
                this.method749("js5connect");
                field936 = 1000;
            } else {
                field960 = 3000;
            }
        }
    }

    @ObfuscatedName("ch.ee(B)V")
    public static void method1723() {
        if (field1185 == 0) {
            Statics.field7 = new class140(4, 104, 104, class62.field766);
            for (int var0 = 0; var0 < 4; var0++) {
                field991[var0] = new class162(104, 104);
            }
            Statics.field565 = new class286(512, 512);
            class93.field1456 = class226.field2933;
            class93.field1449 = 5;
            field1185 = 20;
        } else if (field1185 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field2053[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2587(var1, 500, 800, 512, 334);
            class93.field1456 = class226.field2867;
            class93.field1449 = 10;
            field1185 = 30;
        } else if (field1185 == 30) {
            Statics.field603 = method988(0, false, true, true);
            Statics.field451 = method988(1, false, true, true);
            Statics.field3595 = method988(2, true, false, true);
            Statics.field366 = method988(3, false, true, true);
            Statics.field1568 = method988(4, false, true, true);
            Statics.field927 = method988(5, true, true, true);
            Statics.field341 = method988(6, true, true, false);
            Statics.field507 = method988(7, false, true, true);
            Statics.field3626 = method988(8, false, true, true);
            Statics.field386 = method988(9, false, true, true);
            Statics.field842 = method988(10, false, true, true);
            Statics.field41 = method988(11, false, true, true);
            Statics.field349 = method988(12, false, true, true);
            Statics.field325 = method988(13, true, false, true);
            Statics.field1208 = method988(14, false, true, false);
            Statics.field2614 = method988(15, false, true, true);
            Statics.field661 = method988(16, false, true, false);
            class93.field1456 = class226.field2868;
            class93.field1449 = 20;
            field1185 = 40;
        } else if (field1185 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field603.method3878() * 4 / 100;
            int var8 = var7 + Statics.field451.method3878() * 4 / 100;
            int var9 = var8 + Statics.field3595.method3878() * 2 / 100;
            int var10 = var9 + Statics.field366.method3878() * 2 / 100;
            int var11 = var10 + Statics.field1568.method3878() * 6 / 100;
            int var12 = var11 + Statics.field927.method3878() * 4 / 100;
            int var13 = var12 + Statics.field341.method3878() * 2 / 100;
            int var14 = var13 + Statics.field507.method3878() * 58 / 100;
            int var15 = var14 + Statics.field3626.method3878() * 2 / 100;
            int var16 = var15 + Statics.field386.method3878() * 2 / 100;
            int var17 = var16 + Statics.field842.method3878() * 2 / 100;
            int var18 = var17 + Statics.field41.method3878() * 2 / 100;
            int var19 = var18 + Statics.field349.method3878() * 2 / 100;
            int var20 = var19 + Statics.field325.method3878() * 2 / 100;
            int var21 = var20 + Statics.field1208.method3878() * 2 / 100;
            int var22 = var21 + Statics.field2614.method3878() * 2 / 100;
            int var23 = var22 + Statics.field661.method3878() * 2 / 100;
            if (var23 == 100) {
                class93.field1456 = class226.field2870;
                class93.field1449 = 30;
                field1185 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1456 = class226.field2869 + var23 + "%";
                }
                class93.field1449 = 30;
            }
        } else if (field1185 == 45) {
            class110.method11(22050, !field1047, 2);
            class205 var24 = new class205();
            var24.method3393(9, 128);
            Statics.field268 = Statics.method3942(Statics.field722, 0, 22050);
            Statics.field268.method1872(var24);
            class238 var25 = Statics.field2614;
            class238 var26 = Statics.field1208;
            class238 var27 = Statics.field1568;
            Statics.field2513 = var25;
            Statics.field2511 = var26;
            Statics.field316 = var27;
            Statics.field2512 = var24;
            Statics.field2156 = Statics.method3942(Statics.field722, 1, 2048);
            Statics.field2289 = new class103();
            Statics.field2156.method1872(Statics.field2289);
            Statics.field2056 = new class117(22050, Statics.field1641);
            class93.field1456 = class226.field2871;
            class93.field1449 = 35;
            field1185 = 50;
            Statics.field379 = new class263(Statics.field3626, Statics.field325);
        } else if (field1185 == 50) {
            int var28 = class262.method4358().length;
            field935 = Statics.field379.method4361(class262.method4358());
            if (field935.size() < var28) {
                class93.field1456 = class226.field3013 + field935.size() * 100 / var28 + "%";
                class93.field1449 = 40;
            } else {
                Statics.field2345 = (class264) field935.get(class262.field3624);
                Statics.field474 = (class264) field935.get(class262.field3618);
                Statics.field923 = (class264) field935.get(class262.field3620);
                Statics.field2276 = new class292(true);
                class93.field1456 = class226.field2873;
                class93.field1449 = 40;
                field1185 = 60;
            }
        } else if (field1185 == 60) {
            class238 var29 = Statics.field842;
            class238 var30 = Statics.field3626;
            int var31 = 0;
            if (var29.method3788("title.jpg", "")) {
                var31++;
            }
            if (var30.method3788("logo", "")) {
                var31++;
            }
            if (var30.method3788("logo_deadman_mode", "")) {
                var31++;
            }
            if (var30.method3788("titlebox", "")) {
                var31++;
            }
            if (var30.method3788("titlebutton", "")) {
                var31++;
            }
            if (var30.method3788("runes", "")) {
                var31++;
            }
            if (var30.method3788("title_mute", "")) {
                var31++;
            }
            if (var30.method3788("options_radio_buttons,0", "")) {
                var31++;
            }
            if (var30.method3788("options_radio_buttons,2", "")) {
                var31++;
            }
            var30.method3788("sl_back", "");
            var30.method3788("sl_flags", "");
            var30.method3788("sl_arrows", "");
            var30.method3788("sl_stars", "");
            var30.method3788("sl_button", "");
            byte var34 = 9;
            if (var31 < var34) {
                class93.field1456 = class226.field3043 + var31 * 100 / var34 + "%";
                class93.field1449 = 50;
            } else {
                class93.field1456 = class226.field3133;
                class93.field1449 = 50;
                method4071(5);
                field1185 = 70;
            }
        } else if (field1185 == 70) {
            if (Statics.field3595.method3773()) {
                class238 var36 = Statics.field3595;
                Statics.field3588 = var36;
                class238 var37 = Statics.field3595;
                Statics.field3346 = var37;
                class248.method3929(Statics.field3595, Statics.field507);
                class238 var38 = Statics.field3595;
                class238 var39 = Statics.field507;
                boolean var40 = field1047;
                Statics.field3468 = var38;
                Statics.field3378 = var39;
                class256.field3453 = var40;
                class238 var41 = Statics.field3595;
                class238 var42 = Statics.field507;
                Statics.field3576 = var41;
                Statics.field3547 = var42;
                class253.method3482(Statics.field3595);
                class238 var43 = Statics.field3595;
                class238 var44 = Statics.field507;
                boolean var45 = field1002;
                class264 var46 = Statics.field2345;
                Statics.field2162 = var43;
                Statics.field877 = var44;
                Statics.field2013 = var45;
                Statics.field3487 = Statics.field2162.method3847(10);
                Statics.field845 = var46;
                class261.method3575(Statics.field3595, Statics.field603, Statics.field451);
                class238 var47 = Statics.field3595;
                class238 var48 = Statics.field507;
                Statics.field3330 = var47;
                Statics.field271 = var48;
                class251.method3604(Statics.field3595);
                class242.method1619(Statics.field3595);
                class217.method2649(Statics.field366, Statics.field507, Statics.field3626, Statics.field325);
                class241.method36(Statics.field3595);
                class238 var49 = Statics.field3595;
                Statics.field3403 = var49;
                class244.method2638(Statics.field3595);
                class238 var50 = Statics.field3595;
                Statics.field3320 = var50;
                class238 var51 = Statics.field3595;
                Statics.field3384 = var51;
                Statics.field917 = new class98();
                class255.method1614(Statics.field3595, Statics.field3626, Statics.field325);
                class238 var52 = Statics.field3595;
                class238 var53 = Statics.field3626;
                Statics.field3375 = var52;
                Statics.field3366 = var53;
                class238 var54 = Statics.field3595;
                class238 var55 = Statics.field3626;
                Statics.field3302 = var55;
                if (var54.method3773()) {
                    Statics.field3291 = var54.method3847(35);
                    Statics.field2840 = new class243[Statics.field3291];
                    for (int var56 = 0; var56 < Statics.field3291; var56++) {
                        byte[] var57 = var54.method3769(35, var56);
                        if (var57 != null) {
                            Statics.field2840[var56] = new class243(var56);
                            Statics.field2840[var56].method3945(new class174(var57));
                            Statics.field2840[var56].method3963();
                        }
                    }
                }
                class93.field1456 = class226.field2877;
                class93.field1449 = 60;
                field1185 = 80;
            } else {
                class93.field1456 = class226.field2969 + Statics.field3595.method3884() + "%";
                class93.field1449 = 60;
            }
        } else if (field1185 == 80) {
            int var58 = 0;
            if (Statics.field1661 == null) {
                Statics.field1661 = class287.method3977(Statics.field3626, "compass", "");
            } else {
                var58++;
            }
            if (Statics.field2789 == null) {
                Statics.field2789 = class287.method3977(Statics.field3626, "mapedge", "");
            } else {
                var58++;
            }
            if (Statics.field1686 == null) {
                Statics.field1686 = class287.method2800(Statics.field3626, "mapscene", "");
            } else {
                var58++;
            }
            if (Statics.field874 == null) {
                Statics.field874 = class287.method2788(Statics.field3626, "headicons_pk", "");
            } else {
                var58++;
            }
            if (Statics.field782 == null) {
                Statics.field782 = class287.method2788(Statics.field3626, "headicons_prayer", "");
            } else {
                var58++;
            }
            if (Statics.field671 == null) {
                Statics.field671 = class287.method2788(Statics.field3626, "headicons_hint", "");
            } else {
                var58++;
            }
            if (Statics.field783 == null) {
                Statics.field783 = class287.method2788(Statics.field3626, "mapmarker", "");
            } else {
                var58++;
            }
            if (Statics.field279 == null) {
                Statics.field279 = class287.method2788(Statics.field3626, "cross", "");
            } else {
                var58++;
            }
            if (Statics.field1213 == null) {
                Statics.field1213 = class287.method2788(Statics.field3626, "mapdots", "");
            } else {
                var58++;
            }
            if (Statics.field1884 == null) {
                Statics.field1884 = class287.method2800(Statics.field3626, "scrollbar", "");
            } else {
                var58++;
            }
            if (Statics.field107 == null) {
                Statics.field107 = class287.method2800(Statics.field3626, "mod_icons", "");
            } else {
                var58++;
            }
            if (var58 < 11) {
                class93.field1456 = class226.field3040 + var58 * 100 / 12 + "%";
                class93.field1449 = 70;
            } else {
                Statics.field3650 = Statics.field107;
                Statics.field2789.method4668();
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1686[0].method4661(var59 + var62, var60 + var62, var61 + var62);
                class93.field1456 = class226.field2983;
                class93.field1449 = 70;
                field1185 = 90;
            }
        } else if (field1185 == 90) {
            if (Statics.field386.method3773()) {
                class126 var63 = new class126(Statics.field386, Statics.field3626, 20, 0.8D, field1047 ? 64 : 128);
                class137.method2375(var63);
                class137.method2426(0.8D);
                class93.field1456 = class226.field2941;
                class93.field1449 = 90;
                field1185 = 110;
            } else {
                class93.field1456 = class226.field2876 + Statics.field386.method3884() + "%";
                class93.field1449 = 90;
            }
        } else if (field1185 == 110) {
            Statics.field808 = new class72();
            Statics.field722.method2683(Statics.field808, 10);
            class93.field1456 = class226.field2882;
            class93.field1449 = 94;
            field1185 = 120;
        } else if (field1185 == 120) {
            if (Statics.field842.method3788("huffman", "")) {
                class166 var64 = new class166(Statics.field842.method3830("huffman", ""));
                Statics.field3655 = var64;
                class93.field1456 = class226.field2884;
                class93.field1449 = 96;
                field1185 = 130;
            } else {
                class93.field1456 = class226.field2883 + "%";
                class93.field1449 = 96;
            }
        } else if (field1185 == 130) {
            if (!Statics.field366.method3773()) {
                class93.field1456 = class226.field2885 + Statics.field366.method3884() * 4 / 5 + "%";
                class93.field1449 = 100;
            } else if (!Statics.field349.method3773()) {
                class93.field1456 = class226.field2885 + (80 + Statics.field349.method3884() / 6) + "%";
                class93.field1449 = 100;
            } else if (Statics.field325.method3773()) {
                class93.field1456 = class226.field2886;
                class93.field1449 = 98;
                field1185 = 140;
            } else {
                class93.field1456 = class226.field2885 + (96 + Statics.field325.method3884() / 50) + "%";
                class93.field1449 = 100;
            }
        } else if (field1185 == 140) {
            if (Statics.field661.method3789(class41.field541.field543)) {
                if (Statics.field15 == null) {
                    Statics.field15 = new class289();
                    Statics.field15.method4818(Statics.field661, Statics.field923, field935, Statics.field1686);
                }
                int var65 = Statics.field15.method4802();
                if (var65 < 100) {
                    class93.field1456 = class226.field2887 + (var65 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1456 = class226.field2982;
                    class93.field1449 = 100;
                    field1185 = 150;
                }
            } else {
                class93.field1456 = class226.field2887 + Statics.field661.method3793(class41.field541.field543) / 10 + "%";
            }
        } else if (field1185 == 150) {
            method4071(10);
        }
    }

    @ObfuscatedName("bd.eu(IZZZB)Lin;")
    public static class238 method988(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2270 != null) {
            var4 = new class161(arg0, class156.field2270, Statics.field2611[arg0], 1000000);
        }
        return new class238(var4, Statics.field1399, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.eo(I)V")
    public final void method1250() {
        try {
            if (field1050 == 0) {
                if (Statics.field781 != null) {
                    Statics.field781.method2716();
                    Statics.field781 = null;
                }
                Statics.field1211 = null;
                field984 = false;
                field1198 = 0;
                field1050 = 1;
            }
            if (field1050 == 1) {
                if (Statics.field1211 == null) {
                    Statics.field1211 = Statics.field722.method2682(Statics.field966, Statics.field2291);
                }
                if (Statics.field1211.field2245 == 2) {
                    throw new IOException();
                }
                if (Statics.field1211.field2245 == 1) {
                    Statics.field781 = new class160((Socket) Statics.field1211.field2249, Statics.field722);
                    Statics.field1211 = null;
                    field1050 = 2;
                }
            }
            if (field1050 == 2) {
                field973.field2407 = 0;
                field973.method2865(14);
                Statics.field781.method2733(field973.field2415, 0, 1);
                field975.field2407 = 0;
                field1050 = 3;
            }
            if (field1050 == 3) {
                if (Statics.field268 != null) {
                    Statics.field268.method1889();
                }
                if (Statics.field2156 != null) {
                    Statics.field2156.method1889();
                }
                int var1 = Statics.field781.method2718();
                if (Statics.field268 != null) {
                    Statics.field268.method1889();
                }
                if (Statics.field2156 != null) {
                    Statics.field2156.method1889();
                }
                if (var1 != 0) {
                    method39(var1);
                    return;
                }
                field975.field2407 = 0;
                field1050 = 4;
            }
            if (field1050 == 4) {
                if (field975.field2407 < 8) {
                    int var2 = Statics.field781.method2735();
                    if (var2 > 8 - field975.field2407) {
                        var2 = 8 - field975.field2407;
                    }
                    if (var2 > 0) {
                        Statics.field781.method2720(field975.field2415, field975.field2407, var2);
                        field975.field2407 += var2;
                    }
                }
                if (field975.field2407 == 8) {
                    field975.field2407 = 0;
                    Statics.field402 = field975.method2876();
                    field1050 = 5;
                }
            }
            if (field1050 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field402 >> 32), (int) (Statics.field402 & 0xFFFFFFFFFFFFFFFFL) };
                field973.field2407 = 0;
                field973.method2865(1);
                field973.method2865(class93.field1455.method6());
                field973.method2871(var3[0]);
                field973.method2871(var3[1]);
                field973.method2871(var3[2]);
                field973.method2871(var3[3]);
                switch(class93.field1455.field2216) {
                    case 0:
                        field973.method2871((Integer) Statics.field304.field1338.get(class271.method5(class93.field1444)));
                        field973.field2407 += 4;
                        break;
                    case 1:
                    case 3:
                        field973.method3002(Statics.field2018);
                        field973.field2407 += 5;
                        break;
                    case 2:
                        field973.field2407 += 8;
                }
                field973.method2879(class93.field1463);
                field973.method2973(class91.field1434, class91.field1435);
                field974.field2407 = 0;
                if (field936 == 40) {
                    field974.method2865(18);
                } else {
                    field974.method2865(16);
                }
                field974.method2856(0);
                int var4 = field974.field2407;
                field974.method2871(143);
                field974.method2864(field973.field2415, 0, field973.field2407);
                int var5 = field974.field2407;
                field974.method2879(class93.field1444);
                field974.method2865((field1145 ? 1 : 0) << 1 | (field1047 ? 1 : 0));
                field974.method2856(Statics.field2021);
                field974.method2856(Statics.field312);
                method214(field974);
                field974.method2879(Statics.field834);
                field974.method2871(Statics.field313);
                class174 var6 = new class174(Statics.field2276.method4989());
                Statics.field2276.method4988(var6);
                field974.method2864(var6.field2415, 0, var6.field2415.length);
                field974.method2865(Statics.field308);
                field974.method2871(0);
                field974.method2871(Statics.field603.field3229);
                field974.method2871(Statics.field451.field3229);
                field974.method2871(Statics.field3595.field3229);
                field974.method2871(Statics.field366.field3229);
                field974.method2871(Statics.field1568.field3229);
                field974.method2871(Statics.field927.field3229);
                field974.method2871(Statics.field341.field3229);
                field974.method2871(Statics.field507.field3229);
                field974.method2871(Statics.field3626.field3229);
                field974.method2871(Statics.field386.field3229);
                field974.method2871(Statics.field842.field3229);
                field974.method2871(Statics.field41.field3229);
                field974.method2871(Statics.field349.field3229);
                field974.method2871(Statics.field325.field3229);
                field974.method2871(Statics.field1208.field3229);
                field974.method2871(Statics.field2614.field3229);
                field974.method2871(Statics.field661.field3229);
                field974.method2889(var3, var5, field974.field2407);
                field974.method2921(field974.field2407 - var4);
                Statics.field781.method2733(field974.field2415, 0, field974.field2407);
                field973.method3104(var3);
                for (int var7 = 0; var7 < 4; var7++) {
                    var3[var7] += 50;
                }
                field975.method3104(var3);
                field1050 = 6;
            }
            if (field1050 == 6 && Statics.field781.method2735() > 0) {
                int var8 = Statics.field781.method2718();
                if (var8 == 21 && field936 == 20) {
                    field1050 = 7;
                } else if (var8 == 2) {
                    field1050 = 9;
                } else if (var8 == 15 && field936 == 40) {
                    field943 = -1;
                    field1050 = 13;
                } else if (var8 == 23 && field1030 < 1) {
                    field1030++;
                    field1050 = 0;
                } else if (var8 == 29) {
                    field1050 = 11;
                } else {
                    method39(var8);
                    return;
                }
            }
            if (field1050 == 7 && Statics.field781.method2735() > 0) {
                field965 = (Statics.field781.method2718() + 3) * 60;
                field1050 = 8;
            }
            if (field1050 == 8) {
                field1198 = 0;
                class93.method456(class226.field3117, class226.field2934, field965 / 60 + class226.field2894);
                if (--field965 <= 0) {
                    field1050 = 0;
                }
            } else {
                if (field1050 == 9 && Statics.field781.method2735() >= 13) {
                    boolean var9 = Statics.field781.method2718() == 1;
                    Statics.field781.method2720(field975.field2415, 0, 4);
                    field975.field2407 = 0;
                    boolean var10 = false;
                    if (var9) {
                        int var11 = field975.method3106() << 24;
                        int var12 = var11 | field975.method3106() << 16;
                        int var13 = var12 | field975.method3106() << 8;
                        int var14 = var13 | field975.method3106();
                        int var15 = class271.method5(class93.field1444);
                        if (Statics.field304.field1338.size() >= 10 && !Statics.field304.field1338.containsKey(var15)) {
                            Iterator var16 = Statics.field304.field1338.entrySet().iterator();
                            var16.next();
                            var16.remove();
                        }
                        Statics.field304.field1338.put(var15, var14);
                        class82.method943();
                    }
                    field1098 = Statics.field781.method2718();
                    field1100 = Statics.field781.method2718() == 1;
                    field1214 = Statics.field781.method2718();
                    field1214 <<= 0x8;
                    field1214 += Statics.field781.method2718();
                    field998 = Statics.field781.method2718();
                    Statics.field781.method2720(field975.field2415, 0, 1);
                    field975.field2407 = 0;
                    field977 = field975.method3106();
                    Statics.field781.method2720(field975.field2415, 0, 2);
                    field975.field2407 = 0;
                    field943 = field975.method2872();
                    try {
                        class53.method654(Statics.field1215, "zap");
                    } catch (Throwable var27) {
                    }
                    field1050 = 10;
                }
                if (field1050 != 10) {
                    if (field1050 == 11 && Statics.field781.method2735() >= 2) {
                        field975.field2407 = 0;
                        Statics.field781.method2720(field975.field2415, 0, 2);
                        field975.field2407 = 0;
                        Statics.field2639 = field975.method2872();
                        field1050 = 12;
                    }
                    if (field1050 == 12 && Statics.field781.method2735() >= Statics.field2639) {
                        field975.field2407 = 0;
                        Statics.field781.method2720(field975.field2415, 0, Statics.field2639);
                        field975.field2407 = 0;
                        String var18 = field975.method2878();
                        String var19 = field975.method2878();
                        String var20 = field975.method2878();
                        class93.method456(var18, var19, var20);
                        method4071(10);
                    }
                    if (field1050 == 13) {
                        if (field943 == -1) {
                            if (Statics.field781.method2735() < 2) {
                                return;
                            }
                            Statics.field781.method2720(field975.field2415, 0, 2);
                            field975.field2407 = 0;
                            field943 = field975.method2872();
                        }
                        if (Statics.field781.method2735() >= field943) {
                            Statics.field781.method2720(field975.field2415, 0, field943);
                            field975.field2407 = 0;
                            int var21 = field943;
                            field973.field2407 = 0;
                            field975.field2407 = 0;
                            field977 = -1;
                            field996 = -1;
                            field981 = -1;
                            field1168 = -1;
                            field943 = 0;
                            field978 = 0;
                            field982 = 0;
                            field1204 = 0;
                            field1091 = -1;
                            field1069 = false;
                            field1171 = 0;
                            field1163 = 0;
                            for (int var22 = 0; var22 < 2048; var22++) {
                                field1051[var22] = null;
                            }
                            Statics.field1321 = null;
                            for (int var23 = 0; var23 < field968.length; var23++) {
                                class87 var24 = field968[var23];
                                if (var24 != null) {
                                    var24.field1294 = -1;
                                    var24.field1270 = false;
                                }
                            }
                            class64.method437();
                            method4071(30);
                            for (int var25 = 0; var25 < 100; var25++) {
                                field1136[var25] = true;
                            }
                            method648();
                            class97.method150(field975);
                            if (field975.field2407 != var21) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field1198++;
                        if (field1198 > 2000) {
                            if (field1030 < 1) {
                                if (Statics.field280 == Statics.field2291) {
                                    Statics.field2291 = Statics.field791;
                                } else {
                                    Statics.field2291 = Statics.field280;
                                }
                                field1030++;
                                field1050 = 0;
                            } else {
                                method39(-3);
                            }
                        }
                    }
                } else if (Statics.field781.method2735() >= field943) {
                    field975.field2407 = 0;
                    Statics.field781.method2720(field975.field2415, 0, field943);
                    method2650();
                    class97.method150(field975);
                    Statics.field749 = -1;
                    method558(false);
                    field977 = -1;
                }
            }
        } catch (IOException var28) {
            if (field1030 < 1) {
                if (Statics.field280 == Statics.field2291) {
                    Statics.field2291 = Statics.field791;
                } else {
                    Statics.field2291 = Statics.field280;
                }
                field1030++;
                field1050 = 0;
            } else {
                method39(-2);
            }
        }
    }

    @ObfuscatedName("ew.ek(B)V")
    public static void method2650() {
        field1123 = 1L;
        field942 = -1;
        Statics.field808.field873 = 0;
        Statics.field583 = true;
        field1043 = true;
        field1155 = -1L;
        class281.method3744();
        field973.field2407 = 0;
        field975.field2407 = 0;
        field977 = -1;
        field996 = -1;
        field981 = -1;
        field1168 = -1;
        field978 = 0;
        field982 = 0;
        field983 = 0;
        field946 = 0;
        field1204 = 0;
        field1091 = -1;
        field1069 = false;
        class60.method613(0);
        class99.field1532.clear();
        class99.field1533.method3202();
        class99.field1535.method3352();
        class99.field1534 = 0;
        field1084 = 0;
        field1086 = false;
        field1062 = 0;
        field995 = (int) (Math.random() * 100.0D) - 50;
        field997 = (int) (Math.random() * 110.0D) - 55;
        field1042 = (int) (Math.random() * 80.0D) - 40;
        field1088 = (int) (Math.random() * 120.0D) - 60;
        field1004 = (int) (Math.random() * 30.0D) - 20;
        field1015 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field1171 = 0;
        field1158 = -1;
        field1163 = 0;
        field945 = 0;
        field954 = class92.field1440;
        field985 = class92.field1440;
        field969 = 0;
        class97.field1508 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class97.field1507[var0] = null;
            class97.field1504[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field1051[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field968[var2] = null;
        }
        field1060 = -1;
        field1063.method3287();
        field1173.method3287();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field939[var3][var4][var5] = null;
                }
            }
        }
        field980 = new class194();
        field1197 = 0;
        field1196 = 0;
        field1200 = 0;
        for (int var6 = 0; var6 < Statics.field3289; var6++) {
            class242 var7 = class242.method152(var6);
            if (var7 != null) {
                class212.field2607[var6] = 0;
                class212.field2609[var6] = 0;
            }
        }
        Statics.field917.method1646();
        field1194 = -1;
        if (field1164 != -1) {
            Statics.method453(field1164);
        }
        for (class69 var8 = (class69) field1092.method3236(); var8 != null; var8 = (class69) field1092.method3242()) {
            method945(var8, true);
        }
        field1164 = -1;
        field1092 = new class191(8);
        field964 = null;
        field1204 = 0;
        field1091 = -1;
        field1069 = false;
        field1202.method3606((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field1057[var9] = null;
            field1058[var9] = false;
        }
        class64.method437();
        field979 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field1136[var10] = true;
        }
        method648();
        field1156 = null;
        Statics.field39 = 0;
        Statics.field1241 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field1073[var11] = new class17();
        }
        Statics.field2634 = null;
    }

    @ObfuscatedName("a.ev(II)V")
    public static void method39(int arg0) {
        if (arg0 == -3) {
            class93.method456(class226.field2874, class226.field2896, class226.field2897);
        } else if (arg0 == -2) {
            class93.method456(class226.field2898, class226.field2899, class226.field3009);
        } else if (arg0 == -1) {
            class93.method456(class226.field2937, class226.field2902, class226.field2903);
        } else if (arg0 == 3) {
            class93.field1457 = 3;
        } else if (arg0 == 4) {
            class93.method456(class226.field2904, class226.field3016, class226.field2855);
        } else if (arg0 == 5) {
            class93.method456(class226.field2907, class226.field2908, class226.field2909);
        } else if (arg0 == 6) {
            class93.method456(class226.field2910, class226.field2911, class226.field2912);
        } else if (arg0 == 7) {
            class93.method456(class226.field2913, class226.field2914, class226.field2915);
        } else if (arg0 == 8) {
            class93.method456(class226.field2916, class226.field2917, class226.field3072);
        } else if (arg0 == 9) {
            class93.method456(class226.field2919, class226.field2920, class226.field2921);
        } else if (arg0 == 10) {
            class93.method456(class226.field3081, class226.field3069, class226.field2924);
        } else if (arg0 == 11) {
            class93.method456(class226.field2925, class226.field2926, class226.field2927);
        } else if (arg0 == 12) {
            class93.method456(class226.field2977, class226.field2929, class226.field2930);
        } else if (arg0 == 13) {
            class93.method456(class226.field3097, class226.field2932, class226.field3126);
        } else if (arg0 == 14) {
            class93.method456(class226.field2950, class226.field2935, class226.field2936);
        } else if (arg0 == 16) {
            class93.method456(class226.field3100, class226.field2946, class226.field2939);
        } else if (arg0 == 17) {
            class93.method456(class226.field2940, class226.field3010, class226.field2942);
        } else if (arg0 == 18) {
            class93.method456(class226.field2943, class226.field2923, class226.field3088);
        } else if (arg0 == 19) {
            class93.method456(class226.field3052, class226.field2881, class226.field2860);
        } else if (arg0 == 20) {
            class93.method456(class226.field3035, class226.field3065, class226.field3048);
        } else if (arg0 == 22) {
            class93.method456(class226.field3119, class226.field2953, class226.field2954);
        } else if (arg0 == 23) {
            class93.method456(class226.field2955, class226.field3124, class226.field2866);
        } else if (arg0 == 24) {
            class93.method456(class226.field2958, class226.field2959, class226.field2960);
        } else if (arg0 == 25) {
            class93.method456(class226.field2961, class226.field2962, class226.field2963);
        } else if (arg0 == 26) {
            class93.method456(class226.field2964, class226.field3034, class226.field2992);
        } else if (arg0 == 27) {
            class93.method456(class226.field2944, class226.field2968, class226.field2965);
        } else if (arg0 == 31) {
            class93.method456(class226.field2976, class226.field2931, class226.field2978);
        } else if (arg0 == 32) {
            class93.method456(class226.field2979, class226.field2980, class226.field2981);
        } else if (arg0 == 37) {
            class93.method456(class226.field2975, class226.field2951, class226.field2984);
        } else if (arg0 == 38) {
            class93.method456(class226.field2985, class226.field3087, class226.field2987);
        } else if (arg0 == 55) {
            class93.method456(class226.field2893, class226.field2989, class226.field2990);
        } else if (arg0 == 56) {
            class93.method456(class226.field2991, class226.field3012, class226.field2993);
            method4071(11);
            return;
        } else if (arg0 == 57) {
            class93.method456(class226.field2994, class226.field2995, class226.field2853);
            method4071(11);
            return;
        } else {
            class93.method456(class226.field3055, class226.field2922, class226.field2999);
        }
        method4071(10);
    }

    @ObfuscatedName("bb.eq(I)V")
    public static final void method968() {
        if (Statics.field781 != null) {
            Statics.field781.method2716();
            Statics.field781 = null;
        }
        method41();
        Statics.field7.method2455();
        for (int var0 = 0; var0 < 4; var0++) {
            field991[var0].method2757();
        }
        System.gc();
        class204.method1536(2);
        field1167 = -1;
        field1124 = false;
        for (class83 var1 = (class83) class83.field1349.method3294(); var1 != null; var1 = (class83) class83.field1349.method3296()) {
            if (var1.field1342 != null) {
                Statics.field2289.method1727(var1.field1342);
                var1.field1342 = null;
            }
            if (var1.field1354 != null) {
                Statics.field2289.method1727(var1.field1354);
                var1.field1354 = null;
            }
        }
        class83.field1349.method3287();
        method4071(10);
    }

    @ObfuscatedName("a.el(I)V")
    public static final void method41() {
        class260.method1561();
        class247.field3339.method3221();
        class248.method3576();
        class256.field3441.method3221();
        class256.field3456.method3221();
        class256.field3437.method3221();
        class256.field3448.method3221();
        class259.method112();
        class257.field3488.method3221();
        class257.field3527.method3221();
        class257.field3490.method3221();
        class261.method216();
        class246.field3323.method3221();
        class246.field3322.method3221();
        class251.field3380.method3221();
        class242.field3285.method3221();
        class255.method1622();
        class249.field3363.method3221();
        class249.field3364.method3221();
        class253.field3393.method3221();
        class252.method1697();
        class243.field3292.method3221();
        class214.method137();
        class217.method2369();
        ((class126) Statics.field2050).method2153();
        class100.field1553.method3221();
        Statics.field603.method3833();
        Statics.field451.method3833();
        Statics.field366.method3833();
        Statics.field1568.method3833();
        Statics.field927.method3833();
        Statics.field341.method3833();
        Statics.field507.method3833();
        Statics.field3626.method3833();
        Statics.field386.method3833();
        Statics.field842.method3833();
        Statics.field41.method3833();
        Statics.field349.method3833();
    }

    @ObfuscatedName("cj.eb(I)V")
    public static final void method1537() {
        if (field983 > 0) {
            method968();
        } else {
            method4071(40);
            Statics.field918 = Statics.field781;
            Statics.field781 = null;
        }
    }

    @ObfuscatedName("client.ec(B)V")
    public final void method1041() {
        if (field982 > 1) {
            field982--;
        }
        if (field983 > 0) {
            field983--;
        }
        if (field984) {
            field984 = false;
            method1537();
            return;
        }
        if (!field1069) {
            field1204 = 0;
            field1091 = -1;
            field1069 = false;
            field1075[0] = class226.field3092;
            field1199[0] = "";
            field1178[0] = 1006;
            field1204 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1044(); var1++) {
        }
        if (field936 != 30) {
            return;
        }
        while (true) {
            class280 var2 = (class280) class281.field3752.method3248();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                Object var5 = Statics.field808.field870;
                synchronized (Statics.field808.field870) {
                    if (!field1212) {
                        Statics.field808.field873 = 0;
                    } else if (class60.field733 != 0 || Statics.field808.field873 >= 40) {
                        field973.method3105(68);
                        field973.method2865(0);
                        int var6 = field973.field2407;
                        int var7 = 0;
                        for (int var8 = 0; var8 < Statics.field808.field873 && field973.field2407 - var6 < 240; var8++) {
                            var7++;
                            int var9 = Statics.field808.field869[var8];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 502) {
                                var9 = 502;
                            }
                            int var10 = Statics.field808.field872[var8];
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > 764) {
                                var10 = 764;
                            }
                            int var11 = var9 * 765 + var10;
                            if (Statics.field808.field869[var8] == -1 && Statics.field808.field872[var8] == -1) {
                                var10 = -1;
                                var9 = -1;
                                var11 = 524287;
                            }
                            if (field940 != var10 || field1007 != var9) {
                                int var12 = var10 - field940;
                                field940 = var10;
                                int var13 = var9 - field1007;
                                field1007 = var9;
                                if (field942 < 8 && var12 >= -32 && var12 <= 31 && var13 >= -32 && var13 <= 31) {
                                    var12 += 32;
                                    var13 += 32;
                                    field973.method2856((field942 << 12) + (var12 << 6) + var13);
                                    field942 = 0;
                                } else if (field942 < 8) {
                                    field973.method3002((field942 << 19) + 8388608 + var11);
                                    field942 = 0;
                                } else {
                                    field973.method2871((field942 << 19) + -1073741824 + var11);
                                    field942 = 0;
                                }
                            } else if (field942 < 2047) {
                                field942++;
                            }
                        }
                        field973.method2867(field973.field2407 - var6);
                        if (var7 >= Statics.field808.field873) {
                            Statics.field808.field873 = 0;
                        } else {
                            Statics.field808.field873 -= var7;
                            for (int var14 = 0; var14 < Statics.field808.field873; var14++) {
                                Statics.field808.field872[var14] = Statics.field808.field872[var7 + var14];
                                Statics.field808.field869[var14] = Statics.field808.field869[var7 + var14];
                            }
                        }
                    }
                }
                if (class60.field733 == 1 || !Statics.field3203 && class60.field733 == 4 || class60.field733 == 2) {
                    long var16 = (class60.field747 - field1123 * -1L) / 50L;
                    if (var16 > 4095L) {
                        var16 = 4095L;
                    }
                    field1123 = class60.field747 * -1L;
                    int var18 = class60.field751;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field312) {
                        var18 = Statics.field312;
                    }
                    int var19 = class60.field746;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > Statics.field2021) {
                        var19 = Statics.field2021;
                    }
                    int var20 = (int) var16;
                    field973.method3105(201);
                    field973.method2856((class60.field733 == 2 ? 1 : 0) + (var20 << 1));
                    field973.method2856(var19);
                    field973.method2856(var18);
                }
                if (class51.field654 > 0) {
                    field973.method3105(23);
                    field973.method2856(0);
                    int var21 = field973.field2407;
                    long var22 = class176.method89();
                    for (int var24 = 0; var24 < class51.field654; var24++) {
                        long var25 = var22 - field1155;
                        if (var25 > 16777215L) {
                            var25 = 16777215L;
                        }
                        field1155 = var22;
                        field973.method3037((int) var25);
                        field973.method2865(class51.field653[var24]);
                    }
                    field973.method2921(field973.field2407 - var21);
                }
                if (field1021 > 0) {
                    field1021--;
                }
                if (class51.field646[96] || class51.field646[97] || class51.field646[98] || class51.field646[99]) {
                    field1022 = true;
                }
                if (field1022 && field1021 <= 0) {
                    field1021 = 20;
                    field1022 = false;
                    field973.method3105(127);
                    field973.method2956(field1014);
                    field973.method2904(field1015);
                }
                if (Statics.field583 && !field1043) {
                    field1043 = true;
                    field973.method3105(93);
                    field973.method2865(1);
                }
                if (!Statics.field583 && field1043) {
                    field1043 = false;
                    field973.method3105(93);
                    field973.method2865(0);
                }
                method122();
                if (field936 != 30) {
                    return;
                }
                method3742();
                method32();
                field978++;
                if (field978 > 750) {
                    method1537();
                    return;
                }
                int var27 = class97.field1508;
                int[] var28 = class97.field1509;
                for (int var29 = 0; var29 < var27; var29++) {
                    class75 var30 = field1051[var28[var29]];
                    if (var30 != null) {
                        method941(var30, 1);
                    }
                }
                method37();
                int[] var31 = class97.field1509;
                for (int var32 = 0; var32 < class97.field1508; var32++) {
                    class75 var33 = field1051[var31[var32]];
                    if (var33 != null && var33.field1259 > 0) {
                        var33.field1259--;
                        if (var33.field1259 == 0) {
                            var33.field1256 = null;
                        }
                    }
                }
                for (int var34 = 0; var34 < field969; var34++) {
                    int var35 = field951[var34];
                    class87 var36 = field968[var35];
                    if (var36 != null && var36.field1259 > 0) {
                        var36.field1259--;
                        if (var36.field1259 == 0) {
                            var36.field1256 = null;
                        }
                    }
                }
                field1120++;
                if (field1187 != 0) {
                    field1001 += 20;
                    if (field1001 >= 400) {
                        field1187 = 0;
                    }
                }
                if (Statics.field615 != null) {
                    field933++;
                    if (field933 >= 15) {
                        method162(Statics.field615);
                        Statics.field615 = null;
                    }
                }
                class217 var37 = Statics.field435;
                class217 var38 = Statics.field792;
                Statics.field435 = null;
                Statics.field792 = null;
                field1108 = null;
                field1112 = false;
                field1109 = false;
                field1152 = 0;
                while (class51.method1416() && field1152 < 128) {
                    if (field1098 >= 2 && class51.field646[82] && Statics.field28 == 66) {
                        String var39 = "";
                        Iterator var40 = class99.field1533.iterator();
                        while (var40.hasNext()) {
                            class73 var41 = (class73) var40.next();
                            var39 = var39 + var41.field879 + ':' + var41.field881 + '\n';
                        }
                        Statics.field1215.method723(var39);
                    } else {
                        field1154[field1152] = Statics.field28;
                        field1153[field1152] = Statics.field643;
                        field1152++;
                    }
                }
                if (field1164 != -1) {
                    method1030(field1164, 0, 0, Statics.field2021, Statics.field312, 0, 0);
                }
                field1122++;
                while (true) {
                    class70 var44;
                    class217 var45;
                    class217 var46;
                    do {
                        var44 = (class70) field1131.method3313();
                        if (var44 == null) {
                            while (true) {
                                class70 var47;
                                class217 var48;
                                class217 var49;
                                do {
                                    var47 = (class70) field1132.method3313();
                                    if (var47 == null) {
                                        while (true) {
                                            class70 var50;
                                            class217 var51;
                                            class217 var52;
                                            do {
                                                var50 = (class70) field956.method3313();
                                                if (var50 == null) {
                                                    this.method1164();
                                                    method1526();
                                                    if (field1165 != null) {
                                                        this.method1040();
                                                    }
                                                    if (Statics.field1886 != null) {
                                                        method162(Statics.field1886);
                                                        field1206++;
                                                        if (class60.field737 == 0) {
                                                            if (!field959) {
                                                                label922: {
                                                                    label937: {
                                                                        int var59 = method971();
                                                                        if (field1204 > 2) {
                                                                            if (field1068 == 1) {
                                                                                boolean var60;
                                                                                if (field1204 <= 0) {
                                                                                    var60 = false;
                                                                                } else if (field1079 && class51.field646[81] && field1091 != -1) {
                                                                                    var60 = true;
                                                                                } else {
                                                                                    var60 = false;
                                                                                }
                                                                                if (!var60) {
                                                                                    break label937;
                                                                                }
                                                                            }
                                                                            if (method646(var59)) {
                                                                                break label937;
                                                                            }
                                                                        }
                                                                        if (field1204 > 0) {
                                                                            int var61 = field1045;
                                                                            int var62 = field1082;
                                                                            class90 var63 = Statics.field320;
                                                                            method606(var63.field1429, var63.field1422, var63.field1421, var63.field1424, var63.field1423, var63.field1423, var61, var62);
                                                                            Statics.field320 = null;
                                                                        }
                                                                        break label922;
                                                                    }
                                                                    this.method1208(field1045, field1082);
                                                                }
                                                            } else if (Statics.field867 == Statics.field1886 && field941 != field1044) {
                                                                class217 var53 = Statics.field1886;
                                                                byte var54 = 0;
                                                                if (field1006 == 1 && var53.field2656 == 206) {
                                                                    var54 = 1;
                                                                }
                                                                if (var53.field2743[field941] <= 0) {
                                                                    var54 = 0;
                                                                }
                                                                if (class218.method609(Statics.method3573(var53))) {
                                                                    int var55 = field1044;
                                                                    int var56 = field941;
                                                                    var53.field2743[var56] = var53.field2743[var55];
                                                                    var53.field2671[var56] = var53.field2671[var55];
                                                                    var53.field2743[var55] = -1;
                                                                    var53.field2671[var55] = 0;
                                                                } else if (var54 == 1) {
                                                                    int var57 = field1044;
                                                                    int var58 = field941;
                                                                    while (var57 != var58) {
                                                                        if (var57 > var58) {
                                                                            var53.method3652(var57 - 1, var57);
                                                                            var57--;
                                                                        } else if (var57 < var58) {
                                                                            var53.method3652(var57 + 1, var57);
                                                                            var57++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var53.method3652(field941, field1044);
                                                                }
                                                                field973.method3105(183);
                                                                field973.method2856(field941);
                                                                field973.method2912(Statics.field1886.field2652);
                                                                field973.method2956(field1044);
                                                                field973.method2895(var54);
                                                            }
                                                            field933 = 10;
                                                            class60.field733 = 0;
                                                            Statics.field1886 = null;
                                                        } else if (field1206 >= 5 && (class60.field738 > field1045 + 5 || class60.field738 < field1045 - 5 || class60.field739 > field1082 + 5 || class60.field739 < field1082 - 5)) {
                                                            field959 = true;
                                                        }
                                                    }
                                                    if (class140.method2602()) {
                                                        int var64 = class140.field2110;
                                                        int var65 = class140.field2102;
                                                        field973.method3105(38);
                                                        field973.method2865(5);
                                                        field973.method2904(Statics.field387 + var65);
                                                        field973.method2904(Statics.field562 + var64);
                                                        field973.method2899(class51.field646[82] ? (class51.field646[81] ? 2 : 1) : 0);
                                                        class140.method2495();
                                                        field1176 = class60.field746;
                                                        field1039 = class60.field751;
                                                        field1187 = 1;
                                                        field1001 = 0;
                                                        field1163 = var64;
                                                        field945 = var65;
                                                    }
                                                    if (Statics.field435 != var37) {
                                                        if (var37 != null) {
                                                            method162(var37);
                                                        }
                                                        if (Statics.field435 != null) {
                                                            method162(Statics.field435);
                                                        }
                                                    }
                                                    if (Statics.field792 != var38 && field992 == field1083) {
                                                        if (var38 != null) {
                                                            method162(var38);
                                                        }
                                                        if (Statics.field792 != null) {
                                                            method162(Statics.field792);
                                                        }
                                                    }
                                                    if (Statics.field792 == null) {
                                                        if (field992 > 0) {
                                                            field992--;
                                                        }
                                                    } else if (field992 < field1083) {
                                                        field992++;
                                                        if (field992 == field1083) {
                                                            method162(Statics.field792);
                                                        }
                                                    }
                                                    int var66 = field995 + Statics.field1321.field1275;
                                                    int var67 = field997 + Statics.field1321.field1244;
                                                    if (Statics.field17 - var66 < -500 || Statics.field17 - var66 > 500 || Statics.field516 - var67 < -500 || Statics.field516 - var67 > 500) {
                                                        Statics.field17 = var66;
                                                        Statics.field516 = var67;
                                                    }
                                                    if (Statics.field17 != var66) {
                                                        Statics.field17 += (var66 - Statics.field17) / 16;
                                                    }
                                                    if (Statics.field516 != var67) {
                                                        Statics.field516 += (var67 - Statics.field516) / 16;
                                                    }
                                                    if (class60.field737 == 4 && Statics.field3203) {
                                                        int var68 = class60.field739 - field962;
                                                        field1017 = var68 * 2;
                                                        field962 = var68 == -1 || var68 == 1 ? class60.field739 : (field962 + class60.field739) / 2;
                                                        int var69 = field1070 - class60.field738;
                                                        field1016 = var69 * 2;
                                                        field1070 = var69 == -1 || var69 == 1 ? class60.field738 : (field1070 + class60.field738) / 2;
                                                    } else {
                                                        if (class51.field646[96]) {
                                                            field1016 += (-24 - field1016) / 2;
                                                        } else if (class51.field646[97]) {
                                                            field1016 += (24 - field1016) / 2;
                                                        } else {
                                                            field1016 /= 2;
                                                        }
                                                        if (class51.field646[98]) {
                                                            field1017 += (12 - field1017) / 2;
                                                        } else if (class51.field646[99]) {
                                                            field1017 += (-12 - field1017) / 2;
                                                        } else {
                                                            field1017 /= 2;
                                                        }
                                                        field962 = class60.field739;
                                                        field1070 = class60.field738;
                                                    }
                                                    field1015 = field1016 / 2 + field1015 & 0x7FF;
                                                    field1014 += field1017 / 2;
                                                    if (field1014 < 128) {
                                                        field1014 = 128;
                                                    }
                                                    if (field1014 > 383) {
                                                        field1014 = 383;
                                                    }
                                                    int var70 = Statics.field17 >> 7;
                                                    int var71 = Statics.field516 >> 7;
                                                    int var72 = method132(Statics.field17, Statics.field516, Statics.field2158);
                                                    int var73 = 0;
                                                    if (var70 > 3 && var71 > 3 && var70 < 100 && var71 < 100) {
                                                        for (int var74 = var70 - 4; var74 <= var70 + 4; var74++) {
                                                            for (int var75 = var71 - 4; var75 <= var71 + 4; var75++) {
                                                                int var76 = Statics.field2158;
                                                                if (var76 < 3 && (class62.field769[1][var74][var75] & 0x2) == 2) {
                                                                    var76++;
                                                                }
                                                                int var77 = var72 - class62.field766[var76][var74][var75];
                                                                if (var77 > var73) {
                                                                    var73 = var77;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var78 = var73 * 192;
                                                    if (var78 > 98048) {
                                                        var78 = 98048;
                                                    }
                                                    if (var78 < 32768) {
                                                        var78 = 32768;
                                                    }
                                                    if (var78 > field1048) {
                                                        field1048 += (var78 - field1048) / 24;
                                                    } else if (var78 < field1048) {
                                                        field1048 += (var78 - field1048) / 80;
                                                    }
                                                    if (field990) {
                                                        int var79 = Statics.field1464 * 128 + 64;
                                                        int var80 = Statics.field522 * 128 + 64;
                                                        int var81 = method132(var79, var80, Statics.field2158) - Statics.field861;
                                                        if (Statics.field1794 < var79) {
                                                            Statics.field1794 += Statics.field2608 * (var79 - Statics.field1794) / 1000 + Statics.field1796;
                                                            if (Statics.field1794 > var79) {
                                                                Statics.field1794 = var79;
                                                            }
                                                        }
                                                        if (Statics.field1794 > var79) {
                                                            Statics.field1794 -= Statics.field2608 * (Statics.field1794 - var79) / 1000 + Statics.field1796;
                                                            if (Statics.field1794 < var79) {
                                                                Statics.field1794 = var79;
                                                            }
                                                        }
                                                        if (Statics.field315 < var81) {
                                                            Statics.field315 += Statics.field2608 * (var81 - Statics.field315) / 1000 + Statics.field1796;
                                                            if (Statics.field315 > var81) {
                                                                Statics.field315 = var81;
                                                            }
                                                        }
                                                        if (Statics.field315 > var81) {
                                                            Statics.field315 -= Statics.field2608 * (Statics.field315 - var81) / 1000 + Statics.field1796;
                                                            if (Statics.field315 < var81) {
                                                                Statics.field315 = var81;
                                                            }
                                                        }
                                                        if (Statics.field835 < var80) {
                                                            Statics.field835 += Statics.field2608 * (var80 - Statics.field835) / 1000 + Statics.field1796;
                                                            if (Statics.field835 > var80) {
                                                                Statics.field835 = var80;
                                                            }
                                                        }
                                                        if (Statics.field835 > var80) {
                                                            Statics.field835 -= Statics.field2608 * (Statics.field835 - var80) / 1000 + Statics.field1796;
                                                            if (Statics.field835 < var80) {
                                                                Statics.field835 = var80;
                                                            }
                                                        }
                                                        int var82 = Statics.field884 * 128 + 64;
                                                        int var83 = Statics.field247 * 128 + 64;
                                                        int var84 = method132(var82, var83, Statics.field2158) - Statics.field2439;
                                                        int var85 = var82 - Statics.field1794;
                                                        int var86 = var84 - Statics.field315;
                                                        int var87 = var83 - Statics.field835;
                                                        int var88 = (int) Math.sqrt((double) (var85 * var85 + var87 * var87));
                                                        int var89 = (int) (Math.atan2((double) var86, (double) var88) * 325.949D) & 0x7FF;
                                                        int var90 = (int) (Math.atan2((double) var85, (double) var87) * -325.949D) & 0x7FF;
                                                        if (var89 < 128) {
                                                            var89 = 128;
                                                        }
                                                        if (var89 > 383) {
                                                            var89 = 383;
                                                        }
                                                        if (Statics.field1336 < var89) {
                                                            Statics.field1336 += Statics.field811 * (var89 - Statics.field1336) / 1000 + Statics.field3627;
                                                            if (Statics.field1336 > var89) {
                                                                Statics.field1336 = var89;
                                                            }
                                                        }
                                                        if (Statics.field1336 > var89) {
                                                            Statics.field1336 -= Statics.field811 * (Statics.field1336 - var89) / 1000 + Statics.field3627;
                                                            if (Statics.field1336 < var89) {
                                                                Statics.field1336 = var89;
                                                            }
                                                        }
                                                        int var91 = var90 - Statics.field284;
                                                        if (var91 > 1024) {
                                                            var91 -= 2048;
                                                        }
                                                        if (var91 < -1024) {
                                                            var91 += 2048;
                                                        }
                                                        if (var91 > 0) {
                                                            Statics.field284 += Statics.field811 * var91 / 1000 + Statics.field3627;
                                                            Statics.field284 &= 0x7FF;
                                                        }
                                                        if (var91 < 0) {
                                                            Statics.field284 -= Statics.field811 * -var91 / 1000 + Statics.field3627;
                                                            Statics.field284 &= 0x7FF;
                                                        }
                                                        int var92 = var90 - Statics.field284;
                                                        if (var92 > 1024) {
                                                            var92 -= 2048;
                                                        }
                                                        if (var92 < -1024) {
                                                            var92 += 2048;
                                                        }
                                                        if (var92 < 0 && var91 > 0 || var92 > 0 && var91 < 0) {
                                                            Statics.field284 = var90;
                                                        }
                                                    }
                                                    for (int var93 = 0; var93 < 5; var93++) {
                                                        int var10002 = field1182[var93]++;
                                                    }
                                                    Statics.field917.method1650();
                                                    int var94 = ++class60.field732 - 1;
                                                    int var96 = class51.method234();
                                                    if (var94 > 15000 && var96 > 15000) {
                                                        field983 = 250;
                                                        class60.method613(14500);
                                                        field973.method3105(88);
                                                    }
                                                    field937++;
                                                    if (field937 > 500) {
                                                        field937 = 0;
                                                        int var97 = (int) (Math.random() * 8.0D);
                                                        if ((var97 & 0x1) == 1) {
                                                            field995 += field1049;
                                                        }
                                                        if ((var97 & 0x2) == 2) {
                                                            field997 += field1130;
                                                        }
                                                        if ((var97 & 0x4) == 4) {
                                                            field1042 += field1000;
                                                        }
                                                    }
                                                    if (field995 < -50) {
                                                        field1049 = 2;
                                                    }
                                                    if (field995 > 50) {
                                                        field1049 = -2;
                                                    }
                                                    if (field997 < -55) {
                                                        field1130 = 2;
                                                    }
                                                    if (field997 > 55) {
                                                        field1130 = -2;
                                                    }
                                                    if (field1042 < -40) {
                                                        field1000 = 1;
                                                    }
                                                    if (field1042 > 40) {
                                                        field1000 = -1;
                                                    }
                                                    field1040++;
                                                    if (field1040 > 500) {
                                                        field1040 = 0;
                                                        int var98 = (int) (Math.random() * 8.0D);
                                                        if ((var98 & 0x1) == 1) {
                                                            field1088 += field1003;
                                                        }
                                                        if ((var98 & 0x2) == 2) {
                                                            field1004 += field1005;
                                                        }
                                                    }
                                                    if (field1088 < -60) {
                                                        field1003 = 2;
                                                    }
                                                    if (field1088 > 60) {
                                                        field1003 = -2;
                                                    }
                                                    if (field1004 < -20) {
                                                        field1005 = 1;
                                                    }
                                                    if (field1004 > 10) {
                                                        field1005 = -1;
                                                    }
                                                    for (class68 var99 = (class68) field1061.method3321(); var99 != null; var99 = (class68) field1061.method3323()) {
                                                        if ((long) var99.field831 < class176.method89() / 1000L - 5L) {
                                                            if (var99.field836 > 0) {
                                                                class99.method107(5, "", var99.field832 + class226.field3068);
                                                            }
                                                            if (var99.field836 == 0) {
                                                                class99.method107(5, "", var99.field832 + class226.field3001);
                                                            }
                                                            var99.method3333();
                                                        }
                                                    }
                                                    field1110++;
                                                    if (field1110 > 50) {
                                                        field973.method3105(235);
                                                    }
                                                    try {
                                                        if (Statics.field781 != null && field973.field2407 > 0) {
                                                            Statics.field781.method2733(field973.field2415, 0, field973.field2407);
                                                            field973.field2407 = 0;
                                                            field1110 = 0;
                                                        }
                                                    } catch (IOException var101) {
                                                        method1537();
                                                    }
                                                    return;
                                                }
                                                var51 = var50.field853;
                                                if (var51.field2653 < 0) {
                                                    break;
                                                }
                                                var52 = class217.method192(var51.field2786);
                                            } while (var52 == null || var52.field2776 == null || var51.field2653 >= var52.field2776.length || var52.field2776[var51.field2653] != var51);
                                            class84.method966(var50);
                                        }
                                    }
                                    var48 = var47.field853;
                                    if (var48.field2653 < 0) {
                                        break;
                                    }
                                    var49 = class217.method192(var48.field2786);
                                } while (var49 == null || var49.field2776 == null || var48.field2653 >= var49.field2776.length || var49.field2776[var48.field2653] != var48);
                                class84.method966(var47);
                            }
                        }
                        var45 = var44.field853;
                        if (var45.field2653 < 0) {
                            break;
                        }
                        var46 = class217.method192(var45.field2786);
                    } while (var46 == null || var46.field2776 == null || var45.field2653 >= var46.field2776.length || var46.field2776[var45.field2653] != var45);
                    class84.method966(var44);
                }
            }
            field973.method3105(83);
            field973.method2865(0);
            int var4 = field973.field2407;
            class281.method4288(field973);
            field973.method2867(field973.field2407 - var4);
        }
    }

    @ObfuscatedName("bw.fn(B)V")
    public static final void method975() {
        if (Statics.field2156 != null) {
            Statics.field2156.method1863();
        }
        if (Statics.field268 != null) {
            Statics.field268.method1863();
        }
    }

    @ObfuscatedName("n.fc(I)V")
    public static final void method32() {
        for (int var0 = 0; var0 < field1062; var0++) {
            int var10002 = field1029[var0]--;
            if (field1029[var0] >= -10) {
                class106 var2 = field1009[var0];
                if (var2 == null) {
                    class106 var10000 = (class106) null;
                    var2 = class106.method1796(Statics.field1568, field1172[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1029[var0] += var2.method1797();
                    field1009[var0] = var2;
                }
                if (field1029[var0] < 0) {
                    int var9;
                    if (field957[var0] == 0) {
                        var9 = field1169;
                    } else {
                        int var3 = (field957[var0] & 0xFF) * 128;
                        int var4 = field957[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1321.field1275;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field957[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1321.field1244;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1029[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1170 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class108 var10 = var2.method1785().method1834(Statics.field2056);
                        class118 var11 = class118.method1938(var10, 100, var9);
                        var11.method2034(field1019[var0] - 1);
                        Statics.field2289.method1740(var11);
                    }
                    field1029[var0] = -100;
                }
            } else {
                field1062--;
                for (int var1 = var0; var1 < field1062; var1++) {
                    field1172[var1] = field1172[var1 + 1];
                    field1009[var1] = field1009[var1 + 1];
                    field1019[var1] = field1019[var1 + 1];
                    field1029[var1] = field1029[var1 + 1];
                    field957[var1] = field957[var1 + 1];
                }
                var0--;
            }
        }
        if (field1124 && !class204.method221()) {
            if (field1166 != 0 && field1167 != -1) {
                class204.method876(Statics.field341, field1167, 0, field1166, false);
            }
            field1124 = false;
        }
    }

    @ObfuscatedName("ik.fl(Lje;IIII)V")
    public static void method3920(class261 arg0, int arg1, int arg2, int arg3) {
        if (field1062 >= 50 || field1170 == 0 || arg0.field3606 == null || arg1 >= arg0.field3606.length) {
            return;
        }
        int var4 = arg0.field3606[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1172[field1062] = var5;
        field1019[field1062] = var6;
        field1029[field1062] = 0;
        field1009[field1062] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field957[field1062] = (var8 << 16) + (var9 << 8) + var7;
        field1062++;
    }

    @ObfuscatedName("ac.fp(IIIB)V")
    public static void method518(int arg0, int arg1, int arg2) {
        if (field1169 == 0 || arg1 == 0 || field1062 >= 50) {
            return;
        }
        field1172[field1062] = arg0;
        field1019[field1062] = arg1;
        field1029[field1062] = arg2;
        field1009[field1062] = null;
        field957[field1062] = 0;
        field1062++;
    }

    @ObfuscatedName("gp.ff(IB)V")
    public static void method3485(int arg0) {
        if (arg0 == -1 && !field1124) {
            class204.method2789();
        } else if (arg0 != -1 && field1167 != arg0 && field1166 != 0 && !field1124) {
            class204.method653(2, Statics.field341, arg0, 0, field1166, false);
        }
        field1167 = arg0;
    }

    @ObfuscatedName("bv.fk(III)V")
    public static void method998(int arg0, int arg1) {
        if (field1166 != 0 && arg0 != -1) {
            class204.method876(Statics.field41, arg0, 0, field1166, false);
            field1124 = true;
        }
    }

    @ObfuscatedName("s.fh(I)V")
    public static final void method122() {
        if (Statics.field2158 == field1158) {
            return;
        }
        field1158 = Statics.field2158;
        int var0 = Statics.field2158;
        int[] var1 = Statics.field565.field3783;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field769[var0][var6][var4] & 0x18) == 0) {
                    Statics.field7.method2489(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class62.field769[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field7.method2489(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field565.method4725();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field769[var0][var10][var9] & 0x18) == 0) {
                    Statics.method1571(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class62.field769[var0 + 1][var10][var9] & 0x8) != 0) {
                    Statics.method1571(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1159 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field7.method2484(Statics.field2158, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = Statics.method3743(var14).field3455;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field991[Statics.field2158].field2320;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x1240108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var16 < var11 + 3 && (var18[var16 + 1][var17] & 0x1240180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x1240102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var17 < var12 + 3 && (var18[var16][var17 + 1] & 0x1240120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        field1111[field1159] = Statics.field2840[var15].method3962(false);
                        field1076[field1159] = var16;
                        field1161[field1159] = var17;
                        field1159++;
                    }
                }
            }
        }
        Statics.field2344.method4635();
    }

    @ObfuscatedName("n.fq(B)V")
    public static final void method37() {
        for (int var0 = 0; var0 < field969; var0++) {
            int var1 = field951[var0];
            class87 var2 = field968[var1];
            if (var2 != null) {
                method941(var2, var2.field1396.field3578);
            }
        }
    }

    @ObfuscatedName("bz.fd(Lcs;II)V")
    public static final void method941(class79 arg0, int arg1) {
        if (arg0.field1251 > field938) {
            method1890(arg0);
        } else if (arg0.field1290 >= field938) {
            method1025(arg0);
        } else {
            method1621(arg0);
        }
        if (arg0.field1275 < 128 || arg0.field1244 < 128 || arg0.field1275 >= 13184 || arg0.field1244 >= 13184) {
            arg0.field1247 = -1;
            arg0.field1280 = -1;
            arg0.field1251 = 0;
            arg0.field1290 = 0;
            arg0.field1275 = arg0.field1298[0] * 128 + arg0.field1269 * 64;
            arg0.field1244 = arg0.field1299[0] * 128 + arg0.field1269 * 64;
            arg0.method1385();
        }
        if (Statics.field1321 == arg0 && (arg0.field1275 < 1536 || arg0.field1244 < 1536 || arg0.field1275 >= 11776 || arg0.field1244 >= 11776)) {
            arg0.field1247 = -1;
            arg0.field1280 = -1;
            arg0.field1251 = 0;
            arg0.field1290 = 0;
            arg0.field1275 = arg0.field1298[0] * 128 + arg0.field1269 * 64;
            arg0.field1244 = arg0.field1299[0] * 128 + arg0.field1269 * 64;
            arg0.method1385();
        }
        if (arg0.field1296 != 0) {
            if (arg0.field1294 != -1) {
                class79 var2 = null;
                if (arg0.field1294 < 32768) {
                    var2 = field968[arg0.field1294];
                } else if (arg0.field1294 >= 32768) {
                    var2 = field1051[arg0.field1294 - 32768];
                }
                if (var2 != null) {
                    int var3 = arg0.field1275 - var2.field1275;
                    int var4 = arg0.field1244 - var2.field1244;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field1260 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1270) {
                    arg0.field1294 = -1;
                    arg0.field1270 = false;
                }
            }
            if (arg0.field1271 != -1 && (arg0.field1264 == 0 || arg0.field1301 > 0)) {
                arg0.field1260 = arg0.field1271;
                arg0.field1271 = -1;
            }
            int var5 = arg0.field1260 - arg0.field1245 & 0x7FF;
            if (var5 == 0 && arg0.field1270) {
                arg0.field1294 = -1;
                arg0.field1270 = false;
            }
            if (var5 == 0) {
                arg0.field1268 = 0;
            } else {
                arg0.field1268++;
                if (var5 > 1024) {
                    arg0.field1245 -= arg0.field1296;
                    boolean var6 = true;
                    if (var5 < arg0.field1296 || var5 > 2048 - arg0.field1296) {
                        arg0.field1245 = arg0.field1260;
                        var6 = false;
                    }
                    if (arg0.field1284 == arg0.field1272 && (arg0.field1268 > 25 || var6)) {
                        if (arg0.field1249 == -1) {
                            arg0.field1272 = arg0.field1243;
                        } else {
                            arg0.field1272 = arg0.field1249;
                        }
                    }
                } else {
                    arg0.field1245 += arg0.field1296;
                    boolean var7 = true;
                    if (var5 < arg0.field1296 || var5 > 2048 - arg0.field1296) {
                        arg0.field1245 = arg0.field1260;
                        var7 = false;
                    }
                    if (arg0.field1284 == arg0.field1272 && (arg0.field1268 > 25 || var7)) {
                        if (arg0.field1250 == -1) {
                            arg0.field1272 = arg0.field1243;
                        } else {
                            arg0.field1272 = arg0.field1250;
                        }
                    }
                }
                arg0.field1245 &= 0x7FF;
            }
        }
        method13(arg0);
    }

    @ObfuscatedName("da.ft(Lcs;I)V")
    public static final void method1890(class79 arg0) {
        int var1 = arg0.field1251 - field938;
        int var2 = arg0.field1285 * 128 + arg0.field1269 * 64;
        int var3 = arg0.field1287 * 128 + arg0.field1269 * 64;
        arg0.field1275 += (var2 - arg0.field1275) / var1;
        arg0.field1244 += (var3 - arg0.field1244) / var1;
        arg0.field1301 = 0;
        arg0.field1260 = arg0.field1291;
    }

    @ObfuscatedName("bm.fm(Lcs;B)V")
    public static final void method1025(class79 arg0) {
        if (field938 == arg0.field1290 || arg0.field1247 == -1 || arg0.field1278 != 0 || arg0.field1261 + 1 > class261.method3748(arg0.field1247).field3605[arg0.field1276]) {
            int var1 = arg0.field1290 - arg0.field1251;
            int var2 = field938 - arg0.field1251;
            int var3 = arg0.field1285 * 128 + arg0.field1269 * 64;
            int var4 = arg0.field1287 * 128 + arg0.field1269 * 64;
            int var5 = arg0.field1286 * 128 + arg0.field1269 * 64;
            int var6 = arg0.field1288 * 128 + arg0.field1269 * 64;
            arg0.field1275 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1244 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1301 = 0;
        arg0.field1260 = arg0.field1291;
        arg0.field1245 = arg0.field1260;
    }

    @ObfuscatedName("cv.fa(Lcs;I)V")
    public static final void method1621(class79 arg0) {
        arg0.field1272 = arg0.field1284;
        if (arg0.field1264 == 0) {
            arg0.field1301 = 0;
            return;
        }
        if (arg0.field1247 != -1 && arg0.field1278 == 0) {
            class261 var1 = class261.method3748(arg0.field1247);
            if (arg0.field1302 > 0 && var1.field3614 == 0) {
                arg0.field1301++;
                return;
            }
            if (arg0.field1302 <= 0 && var1.field3599 == 0) {
                arg0.field1301++;
                return;
            }
        }
        int var2 = arg0.field1275;
        int var3 = arg0.field1244;
        int var4 = arg0.field1298[arg0.field1264 - 1] * 128 + arg0.field1269 * 64;
        int var5 = arg0.field1299[arg0.field1264 - 1] * 128 + arg0.field1269 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1260 = 1280;
            } else if (var3 > var5) {
                arg0.field1260 = 1792;
            } else {
                arg0.field1260 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1260 = 768;
            } else if (var3 > var5) {
                arg0.field1260 = 256;
            } else {
                arg0.field1260 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1260 = 1024;
        } else if (var3 > var5) {
            arg0.field1260 = 0;
        }
        byte var6 = arg0.field1258[arg0.field1264 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1275 = var4;
            arg0.field1244 = var5;
            arg0.field1264--;
            if (arg0.field1302 > 0) {
                arg0.field1302--;
            }
            return;
        }
        int var7 = arg0.field1260 - arg0.field1245 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1300;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1243;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1254;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1289;
        }
        if (var8 == -1) {
            var8 = arg0.field1243;
        }
        arg0.field1272 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class87) {
            var10 = ((class87) arg0).field1396.field3580;
        }
        if (var10) {
            if (arg0.field1260 != arg0.field1245 && arg0.field1294 == -1 && arg0.field1296 != 0) {
                var9 = 2;
            }
            if (arg0.field1264 > 2) {
                var9 = 6;
            }
            if (arg0.field1264 > 3) {
                var9 = 8;
            }
            if (arg0.field1301 > 0 && arg0.field1264 > 1) {
                var9 = 8;
                arg0.field1301--;
            }
        } else {
            if (arg0.field1264 > 1) {
                var9 = 6;
            }
            if (arg0.field1264 > 2) {
                var9 = 8;
            }
            if (arg0.field1301 > 0 && arg0.field1264 > 1) {
                var9 = 8;
                arg0.field1301--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1272 == arg0.field1243 && arg0.field1255 != -1) {
            arg0.field1272 = arg0.field1255;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1275 += var9;
                if (arg0.field1275 > var4) {
                    arg0.field1275 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1275 -= var9;
                if (arg0.field1275 < var4) {
                    arg0.field1275 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1244 += var9;
                if (arg0.field1244 > var5) {
                    arg0.field1244 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1244 -= var9;
                if (arg0.field1244 < var5) {
                    arg0.field1244 = var5;
                }
            }
        }
        if (arg0.field1275 == var4 && arg0.field1244 == var5) {
            arg0.field1264--;
            if (arg0.field1302 > 0) {
                arg0.field1302--;
            }
        }
    }

    @ObfuscatedName("h.fv(Lcs;I)V")
    public static final void method13(class79 arg0) {
        arg0.field1263 = false;
        if (arg0.field1272 != -1) {
            class261 var1 = class261.method3748(arg0.field1272);
            if (var1 == null || var1.field3600 == null) {
                arg0.field1272 = -1;
            } else {
                arg0.field1274++;
                if (arg0.field1273 < var1.field3600.length && arg0.field1274 > var1.field3605[arg0.field1273]) {
                    arg0.field1274 = 1;
                    arg0.field1273++;
                    method3920(var1, arg0.field1273, arg0.field1275, arg0.field1244);
                }
                if (arg0.field1273 >= var1.field3600.length) {
                    arg0.field1274 = 0;
                    arg0.field1273 = 0;
                    method3920(var1, arg0.field1273, arg0.field1275, arg0.field1244);
                }
            }
        }
        if (arg0.field1280 != -1 && field938 >= arg0.field1297) {
            if (arg0.field1281 < 0) {
                arg0.field1281 = 0;
            }
            int var2 = class246.method1412(arg0.field1280).field3327;
            if (var2 == -1) {
                arg0.field1280 = -1;
            } else {
                class261 var3 = class261.method3748(var2);
                if (var3 == null || var3.field3600 == null) {
                    arg0.field1280 = -1;
                } else {
                    arg0.field1282++;
                    if (arg0.field1281 < var3.field3600.length && arg0.field1282 > var3.field3605[arg0.field1281]) {
                        arg0.field1282 = 1;
                        arg0.field1281++;
                        method3920(var3, arg0.field1281, arg0.field1275, arg0.field1244);
                    }
                    if (arg0.field1281 >= var3.field3600.length && (arg0.field1281 < 0 || arg0.field1281 >= var3.field3600.length)) {
                        arg0.field1280 = -1;
                    }
                }
            }
        }
        if (arg0.field1247 != -1 && arg0.field1278 <= 1) {
            class261 var4 = class261.method3748(arg0.field1247);
            if (var4.field3614 == 1 && arg0.field1302 > 0 && arg0.field1251 <= field938 && arg0.field1290 < field938) {
                arg0.field1278 = 1;
                return;
            }
        }
        if (arg0.field1247 != -1 && arg0.field1278 == 0) {
            class261 var5 = class261.method3748(arg0.field1247);
            if (var5 == null || var5.field3600 == null) {
                arg0.field1247 = -1;
            } else {
                arg0.field1261++;
                if (arg0.field1276 < var5.field3600.length && arg0.field1261 > var5.field3605[arg0.field1276]) {
                    arg0.field1261 = 1;
                    arg0.field1276++;
                    method3920(var5, arg0.field1276, arg0.field1275, arg0.field1244);
                }
                if (arg0.field1276 >= var5.field3600.length) {
                    arg0.field1276 -= var5.field3607;
                    arg0.field1279++;
                    if (arg0.field1279 >= var5.field3613) {
                        arg0.field1247 = -1;
                    } else if (arg0.field1276 >= 0 && arg0.field1276 < var5.field3600.length) {
                        method3920(var5, arg0.field1276, arg0.field1275, arg0.field1244);
                    } else {
                        arg0.field1247 = -1;
                    }
                }
                arg0.field1263 = var5.field3609;
            }
        }
        if (arg0.field1278 > 0) {
            arg0.field1278--;
        }
    }

    @ObfuscatedName("ca.fs(S)V")
    public static void method1526() {
        if (Statics.field15 != null) {
            Statics.field15.method4863(Statics.field2158, (Statics.field1321.field1275 >> 7) + Statics.field562, (Statics.field1321.field1244 >> 7) + Statics.field387, false);
            Statics.field15.method4823();
        }
    }

    @ObfuscatedName("hd.fe(II)V")
    public static void method3763(int arg0) {
        field1144 = 0L;
        if (arg0 >= 2) {
            field1145 = true;
        } else {
            field1145 = false;
        }
        int var1 = field1145 ? 2 : 1;
        if (var1 == 1) {
            Statics.field1215.method854(765, 503);
        } else {
            Statics.field1215.method854(7680, 2160);
        }
        if (field936 >= 25) {
            method648();
        }
    }

    @ObfuscatedName("am.fj(I)V")
    public static void method648() {
        field973.method3105(225);
        class180 var0 = field973;
        int var1 = field1145 ? 2 : 1;
        var0.method2865(var1);
        field973.method2856(Statics.field2021);
        field973.method2856(Statics.field312);
    }

    @ObfuscatedName("client.j(B)V")
    public final void method853() {
        field1144 = class176.method89() + 500L;
        this.method1042();
        if (field1164 != -1) {
            this.method1055(true);
        }
    }

    @ObfuscatedName("client.fx(B)V")
    public void method1042() {
        int var1 = Statics.field2021;
        int var2 = Statics.field312;
        if (this.field707 < var1) {
            int var3 = this.field707;
        }
        if (this.field713 < var2) {
            int var4 = this.field713;
        }
        if (Statics.field304 == null) {
            return;
        }
        try {
            client var5 = Statics.field1215;
            int var6 = field1145 ? 2 : 1;
            Object[] var7 = new Object[] { var6 };
            JSObject.getWindow(var5).call("resize", var7);
        } catch (Throwable var9) {
        }
    }

    @ObfuscatedName("client.fw(I)V")
    public final void method1043() {
        if (field1164 != -1) {
            method2641(field1164);
        }
        for (int var1 = 0; var1 < field1134; var1++) {
            if (field1136[var1]) {
                field1137[var1] = true;
            }
            field1041[var1] = field1136[var1];
            field1136[var1] = false;
        }
        field1135 = field938;
        field1080 = -1;
        field1081 = -1;
        Statics.field867 = null;
        if (field1164 != -1) {
            field1134 = 0;
            method447(field1164, 0, 0, Statics.field2021, Statics.field312, 0, 0, -1);
        }
        class282.method4552();
        if (field1069) {
            method2798();
        } else if (field1080 != -1) {
            int var2 = field1080;
            int var3 = field1081;
            if (field1204 >= 2 || field1084 != 0 || field1086) {
                int var4 = method971();
                String var5;
                if (field1084 == 1 && field1204 < 2) {
                    var5 = class226.field3003 + class226.field2861 + field1085 + " " + class89.field1414;
                } else if (field1086 && field1204 < 2) {
                    var5 = field1089 + class226.field2861 + field1090 + " " + class89.field1414;
                } else {
                    var5 = method913(var4);
                }
                if (field1204 > 2) {
                    var5 = var5 + class89.method303(16777215) + " " + '/' + " " + (field1204 - 2) + class226.field2888;
                }
                Statics.field923.method4396(var5, var2 + 4, var3 + 15, 16777215, 0, field938 / 1000);
            }
        }
        if (field1162 == 3) {
            for (int var6 = 0; var6 < field1134; var6++) {
                if (field1041[var6]) {
                    class282.method4560(field1139[var6], field1140[var6], field1141[var6], field1053[var6], 16711935, 128);
                } else if (field1137[var6]) {
                    class282.method4560(field1139[var6], field1140[var6], field1141[var6], field1053[var6], 16711680, 128);
                }
            }
        }
        int var7 = Statics.field2158;
        int var8 = Statics.field1321.field1275;
        int var9 = Statics.field1321.field1244;
        int var10 = field1120;
        for (class83 var11 = (class83) class83.field1349.method3294(); var11 != null; var11 = (class83) class83.field1349.method3296()) {
            if (var11.field1348 != -1 || var11.field1344 != null) {
                int var12 = 0;
                if (var8 > var11.field1345) {
                    var12 += var8 - var11.field1345;
                } else if (var8 < var11.field1350) {
                    var12 += var11.field1350 - var8;
                }
                if (var9 > var11.field1352) {
                    var12 += var9 - var11.field1352;
                } else if (var9 < var11.field1343) {
                    var12 += var11.field1343 - var9;
                }
                if (var12 - 64 > var11.field1347 || field1170 == 0 || var11.field1346 != var7) {
                    if (var11.field1342 != null) {
                        Statics.field2289.method1727(var11.field1342);
                        var11.field1342 = null;
                    }
                    if (var11.field1354 != null) {
                        Statics.field2289.method1727(var11.field1354);
                        var11.field1354 = null;
                    }
                } else {
                    var12 -= 64;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = field1170 * (var11.field1347 - var12) / var11.field1347;
                    class106 var10000;
                    if (var11.field1342 != null) {
                        var11.field1342.method1942(var13);
                    } else if (var11.field1348 >= 0) {
                        var10000 = (class106) null;
                        class106 var14 = class106.method1796(Statics.field1568, var11.field1348, 0);
                        if (var14 != null) {
                            class108 var15 = var14.method1785().method1834(Statics.field2056);
                            class118 var16 = class118.method1938(var15, 100, var13);
                            var16.method2034(-1);
                            Statics.field2289.method1740(var16);
                            var11.field1342 = var16;
                        }
                    }
                    if (var11.field1354 != null) {
                        var11.field1354.method1942(var13);
                        if (!var11.field1354.method3286()) {
                            var11.field1354 = null;
                        }
                    } else if (var11.field1344 != null && (var11.field1353 -= var10) <= 0) {
                        int var17 = (int) (Math.random() * (double) var11.field1344.length);
                        var10000 = (class106) null;
                        class106 var18 = class106.method1796(Statics.field1568, var11.field1344[var17], 0);
                        if (var18 != null) {
                            class108 var19 = var18.method1785().method1834(Statics.field2056);
                            class118 var20 = class118.method1938(var19, 100, var13);
                            var20.method2034(0);
                            Statics.field2289.method1740(var20);
                            var11.field1354 = var20;
                            var11.field1353 = var11.field1341 + (int) (Math.random() * (double) (var11.field1351 - var11.field1341));
                        }
                    }
                }
            }
        }
        field1120 = 0;
    }

    @ObfuscatedName("im.fi(Ljava/lang/String;ZI)V")
    public static final void method4027(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field474.method4376(arg0, 250);
        int var6 = Statics.field474.method4404(arg0, 250) * 13;
        class282.method4561(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class282.method4583(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field474.method4390(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method605(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2344.method703(0, 0);
        } else {
            method1598(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("bz.fr(IIIIS)V")
    public static final void method938(int arg0, int arg1, int arg2, int arg3) {
        field1035++;
        method895(class67.field828);
        boolean var4 = false;
        if (field1060 >= 0) {
            int var5 = class97.field1508;
            int[] var6 = class97.field1509;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field1060 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method895(class67.field824);
        }
        method304(true);
        method895(var4 ? class67.field827 : class67.field826);
        method304(false);
        for (class94 var8 = (class94) field1063.method3294(); var8 != null; var8 = (class94) field1063.method3296()) {
            if (Statics.field2158 != var8.field1480 || field938 > var8.field1472) {
                var8.method3278();
            } else if (field938 >= var8.field1478) {
                if (var8.field1482 > 0) {
                    class87 var9 = field968[var8.field1482 - 1];
                    if (var9 != null && var9.field1275 >= 0 && var9.field1275 < 13312 && var9.field1244 >= 0 && var9.field1244 < 13312) {
                        var8.method1599(var9.field1275, var9.field1244, method132(var9.field1275, var9.field1244, var8.field1480) - var8.field1477, field938);
                    }
                }
                if (var8.field1482 < 0) {
                    int var10 = -var8.field1482 - 1;
                    class75 var11;
                    if (field1214 == var10) {
                        var11 = Statics.field1321;
                    } else {
                        var11 = field1051[var10];
                    }
                    if (var11 != null && var11.field1275 >= 0 && var11.field1275 < 13312 && var11.field1244 >= 0 && var11.field1244 < 13312) {
                        var8.method1599(var11.field1275, var11.field1244, method132(var11.field1275, var11.field1244, var8.field1480) - var8.field1477, field938);
                    }
                }
                var8.method1604(field1120);
                Statics.field7.method2466(Statics.field2158, (int) var8.field1484, (int) var8.field1483, (int) var8.field1486, 60, var8, var8.field1492, -1, false);
            }
        }
        method2175();
        method1572(arg0, arg1, arg2, arg3, true);
        int var12 = field1191;
        int var13 = field1192;
        int var14 = field1193;
        int var15 = field1011;
        class282.method4578(var12, var13, var12 + var14, var13 + var15);
        class137.method2376();
        if (!field990) {
            int var16 = field1014;
            if (field1048 / 256 > var16) {
                var16 = field1048 / 256;
            }
            if (field1184[4] && field1180[4] + 128 > var16) {
                var16 = field1180[4] + 128;
            }
            int var17 = field1042 + field1015 & 0x7FF;
            int var18 = Statics.field17;
            int var19 = method132(Statics.field1321.field1275, Statics.field1321.field1244, Statics.field2158) - field1020;
            int var20 = Statics.field516;
            int var21 = var16 * 3 + 600;
            int var22 = 2048 - var16 & 0x7FF;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 0;
            int var25 = 0;
            int var26 = var21;
            if (var22 != 0) {
                int var27 = class137.field2053[var22];
                int var28 = class137.field2041[var22];
                int var29 = var25 * var28 - var21 * var27 >> 16;
                var26 = var25 * var27 + var21 * var28 >> 16;
                var25 = var29;
            }
            if (var23 != 0) {
                int var30 = class137.field2053[var23];
                int var31 = class137.field2041[var23];
                int var32 = var24 * var31 + var26 * var30 >> 16;
                var26 = var26 * var31 - var24 * var30 >> 16;
                var24 = var32;
            }
            Statics.field1794 = var18 - var24;
            Statics.field315 = var19 - var25;
            Statics.field835 = var20 - var26;
            Statics.field1336 = var16;
            Statics.field284 = var17;
        }
        int var45;
        if (field990) {
            int var46;
            if (Statics.field304.field1334) {
                var46 = Statics.field2158;
            } else {
                int var47 = method132(Statics.field1794, Statics.field835, Statics.field2158);
                if (var47 - Statics.field315 >= 800 || (class62.field769[Statics.field2158][Statics.field1794 >> 7][Statics.field835 >> 7] & 0x4) == 0) {
                    var46 = 3;
                } else {
                    var46 = Statics.field2158;
                }
            }
            var45 = var46;
        } else {
            int var33;
            if (Statics.field304.field1334) {
                var33 = Statics.field2158;
            } else {
                label348: {
                    int var34 = 3;
                    if (Statics.field1336 < 310) {
                        int var35 = Statics.field1794 >> 7;
                        int var36 = Statics.field835 >> 7;
                        int var37 = Statics.field1321.field1275 >> 7;
                        int var38 = Statics.field1321.field1244 >> 7;
                        if (var35 < 0 || var36 < 0 || var35 >= 104 || var36 >= 104) {
                            var33 = Statics.field2158;
                            break label348;
                        }
                        if ((class62.field769[Statics.field2158][var35][var36] & 0x4) != 0) {
                            var34 = Statics.field2158;
                        }
                        int var39;
                        if (var37 > var35) {
                            var39 = var37 - var35;
                        } else {
                            var39 = var35 - var37;
                        }
                        int var40;
                        if (var38 > var36) {
                            var40 = var38 - var36;
                        } else {
                            var40 = var36 - var38;
                        }
                        if (var39 > var40) {
                            int var41 = var40 * 65536 / var39;
                            int var42 = 32768;
                            while (var35 != var37) {
                                if (var35 < var37) {
                                    var35++;
                                } else if (var35 > var37) {
                                    var35--;
                                }
                                if ((class62.field769[Statics.field2158][var35][var36] & 0x4) != 0) {
                                    var34 = Statics.field2158;
                                }
                                var42 += var41;
                                if (var42 >= 65536) {
                                    var42 -= 65536;
                                    if (var36 < var38) {
                                        var36++;
                                    } else if (var36 > var38) {
                                        var36--;
                                    }
                                    if ((class62.field769[Statics.field2158][var35][var36] & 0x4) != 0) {
                                        var34 = Statics.field2158;
                                    }
                                }
                            }
                        } else {
                            int var43 = var39 * 65536 / var40;
                            int var44 = 32768;
                            while (var36 != var38) {
                                if (var36 < var38) {
                                    var36++;
                                } else if (var36 > var38) {
                                    var36--;
                                }
                                if ((class62.field769[Statics.field2158][var35][var36] & 0x4) != 0) {
                                    var34 = Statics.field2158;
                                }
                                var44 += var43;
                                if (var44 >= 65536) {
                                    var44 -= 65536;
                                    if (var35 < var37) {
                                        var35++;
                                    } else if (var35 > var37) {
                                        var35--;
                                    }
                                    if ((class62.field769[Statics.field2158][var35][var36] & 0x4) != 0) {
                                        var34 = Statics.field2158;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field1321.field1275 >= 0 && Statics.field1321.field1244 >= 0 && Statics.field1321.field1275 < 13312 && Statics.field1321.field1244 < 13312) {
                        if ((class62.field769[Statics.field2158][Statics.field1321.field1275 >> 7][Statics.field1321.field1244 >> 7] & 0x4) != 0) {
                            var34 = Statics.field2158;
                        }
                        var33 = var34;
                    } else {
                        var33 = Statics.field2158;
                    }
                }
            }
            var45 = var33;
        }
        int var48 = Statics.field1794;
        int var49 = Statics.field315;
        int var50 = Statics.field835;
        int var51 = Statics.field1336;
        int var52 = Statics.field284;
        for (int var53 = 0; var53 < 5; var53++) {
            if (field1184[var53]) {
                int var54 = (int) (Math.random() * (double) (field1179[var53] * 2 + 1) - (double) field1179[var53] + Math.sin((double) field1181[var53] / 100.0D * (double) field1182[var53]) * (double) field1180[var53]);
                if (var53 == 0) {
                    Statics.field1794 += var54;
                }
                if (var53 == 1) {
                    Statics.field315 += var54;
                }
                if (var53 == 2) {
                    Statics.field835 += var54;
                }
                if (var53 == 3) {
                    Statics.field284 = Statics.field284 + var54 & 0x7FF;
                }
                if (var53 == 4) {
                    Statics.field1336 += var54;
                    if (Statics.field1336 < 128) {
                        Statics.field1336 = 128;
                    }
                    if (Statics.field1336 > 383) {
                        Statics.field1336 = 383;
                    }
                }
            }
        }
        int var55 = class60.field738;
        int var56 = class60.field739;
        if (class60.field733 != 0) {
            var55 = class60.field746;
            var56 = class60.field751;
        }
        if (var55 >= var12 && var55 < var12 + var14 && var56 >= var13 && var56 < var13 + var15) {
            int var57 = var55 - var12;
            int var58 = var56 - var13;
            class135.field2009 = var57;
            class135.field2008 = var58;
            class135.field2019 = true;
            class135.field2014 = 0;
            class135.field2016 = false;
        } else {
            class135.method97();
        }
        method975();
        class282.method4561(var12, var13, var14, var15, 0);
        method975();
        int var59 = class137.field2039;
        class137.field2039 = field1195;
        Statics.field7.method2598(Statics.field1794, Statics.field315, Statics.field835, Statics.field1336, Statics.field284, var45);
        while (true) {
            class10 var60 = (class10) class8.field240.method3252();
            if (var60 == null) {
                class137.field2039 = var59;
                method975();
                Statics.field7.method2564();
                method970(var12, var13, var14, var15);
                if (field946 == 2) {
                    method438((field949 - Statics.field562 << 7) + field1128, (field950 - Statics.field387 << 7) + field953, field1177 * 2);
                    if (field1125 > -1 && field938 % 20 < 10) {
                        Statics.field671[0].method4676(field1125 + var12 - 12, field1094 + var13 - 28);
                    }
                }
                ((class126) Statics.field2050).method2154(field1120);
                method3362(var12, var13, var14, var15);
                Statics.field1794 = var48;
                Statics.field315 = var49;
                Statics.field835 = var50;
                Statics.field1336 = var51;
                Statics.field284 = var52;
                if (field979 && class239.method151(true, false) == 0) {
                    field979 = false;
                }
                if (field979) {
                    class282.method4561(var12, var13, var14, var15, 0);
                    method4027(class226.field2863, false);
                }
                return;
            }
            var60.method29();
        }
    }

    @ObfuscatedName("cb.fy(IIIIZB)V")
    public static final void method1572(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field976 - field1046) * var5 / 100 + field1046;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1189) {
            short var8 = field1189;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1188) {
                var6 = field1188;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class282.method4552();
                    class282.method4561(arg0, arg1, var10, arg3, -16777216);
                    class282.method4561(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1190) {
            short var11 = field1190;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1160) {
                var6 = field1160;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class282.method4552();
                    class282.method4561(arg0, arg1, arg2, var13, -16777216);
                    class282.method4561(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1186 - field1095) * var5 / 100 + field1095;
        field1195 = arg3 * var6 * var14 / 85504 << 1;
        if (field1193 != arg2 || field1011 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field2053[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2587(var15, 500, 800, arg2, arg3);
        }
        field1191 = arg0;
        field1192 = arg1;
        field1193 = arg2;
        field1011 = arg3;
    }

    @ObfuscatedName("bl.fg(Lbb;I)V")
    public static final void method895(class67 arg0) {
        if (Statics.field1321.field1275 >> 7 == field1163 && Statics.field1321.field1244 >> 7 == field945) {
            field1163 = 0;
        }
        int var1 = class97.field1508;
        int[] var2 = class97.field1509;
        int var3 = var1;
        if (class67.field828 == arg0 || class67.field824 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field828 == arg0) {
                var5 = Statics.field1321;
                var6 = Statics.field1321.field913 << 14;
            } else if (class67.field824 == arg0) {
                var5 = field1051[field1060];
                var6 = field1060 << 14;
            } else {
                var5 = field1051[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field827 == arg0 && field1060 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1006() && !var5.field914) {
                var5.field909 = false;
                if ((field1047 && var1 > 50 || var1 > 200) && class67.field828 != arg0 && var5.field1284 == var5.field1272) {
                    var5.field909 = true;
                }
                int var7 = var5.field1275 >> 7;
                int var8 = var5.field1244 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field904 == null || field938 < var5.field899 || field938 >= var5.field903) {
                        if ((var5.field1275 & 0x7F) == 64 && (var5.field1244 & 0x7F) == 64) {
                            if (field1035 == field1034[var7][var8]) {
                                continue;
                            }
                            field1034[var7][var8] = field1035;
                        }
                        var5.field898 = method132(var5.field1275, var5.field1244, Statics.field2158);
                        Statics.field7.method2466(Statics.field2158, var5.field1275, var5.field1244, var5.field898, 60, var5, var5.field1245, var6, var5.field1263);
                    } else {
                        var5.field909 = false;
                        var5.field898 = method132(var5.field1275, var5.field1244, Statics.field2158);
                        Statics.field7.method2467(Statics.field2158, var5.field1275, var5.field1244, var5.field898, 60, var5, var5.field1245, var6, var5.field905, var5.field907, var5.field890, var5.field908);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.fb(ZB)V")
    public static final void method304(boolean arg0) {
        for (int var1 = 0; var1 < field969; var1++) {
            class87 var2 = field968[field951[var1]];
            int var3 = (field951[var1] << 14) + 536870912;
            if (var2 != null && var2.method1006() && var2.field1396.field3571 == arg0 && var2.field1396.method4296()) {
                int var4 = var2.field1275 >> 7;
                int var5 = var2.field1244 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1269 == 1 && (var2.field1275 & 0x7F) == 64 && (var2.field1244 & 0x7F) == 64) {
                        if (field1035 == field1034[var4][var5]) {
                            continue;
                        }
                        field1034[var4][var5] = field1035;
                    }
                    if (!var2.field1396.field3560) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field7.method2466(Statics.field2158, var2.field1275, var2.field1244, method132(var2.field1275 + (var2.field1269 * 64 - 64), var2.field1244 + (var2.field1269 * 64 - 64), Statics.field2158), var2.field1269 * 64 - 64 + 60, var2, var2.field1245, var3, var2.field1263);
                }
            }
        }
    }

    @ObfuscatedName("dp.fz(B)V")
    public static final void method2175() {
        for (class85 var0 = (class85) field1173.method3294(); var0 != null; var0 = (class85) field1173.method3296()) {
            if (Statics.field2158 != var0.field1375 || var0.field1387) {
                var0.method3278();
            } else if (field938 >= var0.field1383) {
                var0.method1531(field1120);
                if (var0.field1387) {
                    var0.method3278();
                } else {
                    Statics.field7.method2466(var0.field1375, var0.field1377, var0.field1379, var0.field1380, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ge.fo(Lcs;IIIIII)V")
    public static final void method3476(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1006()) {
            return;
        }
        if (arg0 instanceof class87) {
            class259 var6 = ((class87) arg0).field1396;
            if (var6.field3552 != null) {
                var6 = var6.method4299();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1508;
        int[] var8 = class97.field1509;
        int var9 = 3;
        if (!arg0.field1283.method3256()) {
            method695(arg0, arg0.field1293 + 15);
            for (class86 var10 = (class86) arg0.field1283.method3248(); var10 != null; var10 = (class86) arg0.field1283.method3258()) {
                class80 var11 = var10.method1541(field938);
                if (var11 != null) {
                    class249 var12 = var10.field1389;
                    class286 var13 = var12.method4052();
                    class286 var14 = var12.method4048();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3374;
                    } else {
                        if (var12.field3373 * 2 < var14.field3786) {
                            var15 = var12.field3373;
                        }
                        var16 = var14.field3786 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field938 - var11.field1307;
                    int var20 = var11.field1306 * var16 / var12.field3374;
                    int var23;
                    if (var11.field1310 > var19) {
                        int var21 = var12.field3370 == 0 ? 0 : var19 / var12.field3370 * var12.field3370;
                        int var22 = var11.field1305 * var16 / var12.field3374;
                        var23 = (var20 - var22) * var21 / var11.field1310 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1310 + var12.field3371 - var19;
                        if (var12.field3369 >= 0) {
                            var17 = (var24 << 8) / (var12.field3371 - var12.field3369);
                        }
                    }
                    if (var11.field1306 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field1125 + arg2 - (var16 >> 1);
                    int var26 = field1094 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field1125 > -1) {
                            class282.method4561(var25, var26, var23, 5, 65280);
                            class282.method4561(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3789;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4681(var27, var26, var17);
                            class282.method4594(var27, var26, var27 + var28, var26 + var29);
                            var14.method4681(var27, var26, var17);
                        } else {
                            var13.method4676(var27, var26);
                            class282.method4594(var27, var26, var27 + var28, var26 + var29);
                            var14.method4676(var27, var26);
                        }
                        class282.method4578(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1542()) {
                    var10.method3278();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field914) {
                return;
            }
            if (var30.field892 != -1 || var30.field900 != -1) {
                method695(arg0, arg0.field1293 + 15);
                if (field1125 > -1) {
                    if (var30.field892 != -1) {
                        Statics.field874[var30.field892].method4676(field1125 + arg2 - 12, field1094 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field900 != -1) {
                        Statics.field782[var30.field900].method4676(field1125 + arg2 - 12, field1094 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field946 == 10 && field948 == var8[arg1]) {
                method695(arg0, arg0.field1293 + 15);
                if (field1125 > -1) {
                    Statics.field671[1].method4676(field1125 + arg2 - 12, field1094 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class87) arg0).field1396;
            if (var31.field3552 != null) {
                var31 = var31.method4299();
            }
            if (var31.field3574 >= 0 && var31.field3574 < Statics.field782.length) {
                method695(arg0, arg0.field1293 + 15);
                if (field1125 > -1) {
                    Statics.field782[var31.field3574].method4676(field1125 + arg2 - 12, field1094 + arg3 - 30);
                }
            }
            if (field946 == 1 && field947 == field951[arg1 - var7] && field938 % 20 < 10) {
                method695(arg0, arg0.field1293 + 15);
                if (field1125 > -1) {
                    Statics.field671[0].method4676(field1125 + arg2 - 12, field1094 + arg3 - 28);
                }
            }
        }
        if (arg0.field1256 != null && (arg1 >= var7 || !arg0.field1248 && (field1032 == 4 || !arg0.field1257 && (field1032 == 0 || field1032 == 3 || field1032 == 1 && method1609(((class75) arg0).field906, false))))) {
            method695(arg0, arg0.field1293);
            if (field1125 > -1 && field1024 < field1183) {
                field999[field1024] = Statics.field923.method4374(arg0.field1256) / 2;
                field1028[field1024] = Statics.field923.field3653;
                field1026[field1024] = field1125;
                field1096[field1024] = field1094;
                field1018[field1024] = arg0.field1246;
                field1031[field1024] = arg0.field1295;
                field1025[field1024] = arg0.field1259;
                field1033[field1024] = arg0.field1256;
                field1024++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1265[var32];
            int var34 = arg0.field1253[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field938) {
                    continue;
                }
                var35 = class255.method194(arg0.field1253[var32]);
                var36 = var35.field3417;
                if (var35 != null && var35.field3428 != null) {
                    var35 = var35.method4136();
                    if (var35 == null) {
                        arg0.field1265[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1266[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method194(var37);
                if (var38 != null && var38.field3428 != null) {
                    var38 = var38.method4136();
                }
            }
            if (var33 - var36 <= field938) {
                if (var35 == null) {
                    arg0.field1265[var32] = -1;
                } else {
                    method695(arg0, arg0.field1293 / 2);
                    if (field1125 > -1) {
                        if (var32 == 1) {
                            field1094 -= 20;
                        }
                        if (var32 == 2) {
                            field1125 -= 15;
                            field1094 -= 10;
                        }
                        if (var32 == 3) {
                            field1125 += 15;
                            field1094 -= 10;
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
                        class286 var64 = var35.method4158();
                        if (var64 != null) {
                            var43 = var64.field3786;
                            int var65 = var64.field3789;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3782;
                        }
                        class286 var66 = var35.method4140();
                        if (var66 != null) {
                            var44 = var66.field3786;
                            int var67 = var66.field3789;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3782;
                        }
                        class286 var68 = var35.method4159();
                        if (var68 != null) {
                            var45 = var68.field3786;
                            int var69 = var68.field3789;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3782;
                        }
                        class286 var70 = var35.method4141();
                        if (var70 != null) {
                            var46 = var70.field3786;
                            int var71 = var70.field3789;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3782;
                        }
                        if (var38 != null) {
                            var51 = var38.method4158();
                            if (var51 != null) {
                                var55 = var51.field3786;
                                int var72 = var51.field3789;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3782;
                            }
                            var52 = var38.method4140();
                            if (var52 != null) {
                                var56 = var52.field3786;
                                int var73 = var52.field3789;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3782;
                            }
                            var53 = var38.method4159();
                            if (var53 != null) {
                                var57 = var53.field3786;
                                int var74 = var53.field3789;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3782;
                            }
                            var54 = var38.method4141();
                            if (var54 != null) {
                                var58 = var54.field3786;
                                int var75 = var54.field3789;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3782;
                            }
                        }
                        class264 var76 = var35.method4142();
                        if (var76 == null) {
                            var76 = Statics.field2345;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field2345;
                        } else {
                            var77 = var38.method4142();
                            if (var77 == null) {
                                var77 = Statics.field2345;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4137(arg0.field1252[var32]);
                        int var83 = var76.method4374(var82);
                        if (var38 != null) {
                            var79 = var38.method4137(arg0.field1267[var32]);
                            var81 = var77.method4374(var79);
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
                        int var100 = arg0.field1265[var32] - field938;
                        int var101 = var35.field3422 - var35.field3422 * var100 / var35.field3417;
                        int var102 = var35.field3424 * var100 / var35.field3417 + -var35.field3424;
                        int var103 = field1125 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1094 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3427 + var104 + 15;
                        int var108 = var107 - var76.field3640;
                        int var109 = var76.field3641 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3427 + var104 + 15;
                            int var111 = var110 - var77.field3640;
                            int var112 = var77.field3641 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3429 >= 0) {
                            var115 = (var100 << 8) / (var35.field3417 - var35.field3429);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4681(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4681(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4681(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4681(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4427(var82, var90 + var103, var107, var35.field3412, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4681(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4681(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4681(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4681(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4427(var79, var98 + var103, var110, var38.field3412, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4676(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4676(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4676(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4676(var93 + var103 - var50, var104);
                            }
                            var76.method4383(var82, var90 + var103, var107, var35.field3412 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4676(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4676(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4676(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4676(var97 + var103 - var62, var104);
                                }
                                var77.method4383(var79, var98 + var103, var110, var38.field3412 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bb.gl(IIIIB)V")
    public static final void method970(int arg0, int arg1, int arg2, int arg3) {
        field1024 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class97.field1508;
        int[] var7 = class97.field1509;
        for (int var8 = 0; var8 < field969 + var6; var8++) {
            class79 var9;
            if (var8 < var6) {
                var9 = field1051[var7[var8]];
                if (field1060 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field968[field951[var8 - var6]];
            }
            method3476(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method3476(field1051[field1060], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field1024; var10++) {
            int var11 = field1026[var10];
            int var12 = field1096[var10];
            int var13 = field999[var10];
            int var14 = field1028[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field1096[var16] - field1028[var16] && var12 - var14 < field1096[var16] + 2 && var11 - var13 < field999[var16] + field1026[var16] && var11 + var13 > field1026[var16] - field999[var16] && field1096[var16] - field1028[var16] < var12) {
                        var12 = field1096[var16] - field1028[var16];
                        var15 = true;
                    }
                }
            }
            field1125 = field1026[var10];
            field1094 = field1096[var10] = var12;
            String var17 = field1033[var10];
            if (field1093 == 0) {
                int var18 = 16776960;
                if (field1018[var10] < 6) {
                    var18 = field1146[field1018[var10]];
                }
                if (field1018[var10] == 6) {
                    var18 = field1035 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field1018[var10] == 7) {
                    var18 = field1035 % 20 < 10 ? 255 : 65535;
                }
                if (field1018[var10] == 8) {
                    var18 = field1035 % 20 < 10 ? 45056 : 8454016;
                }
                if (field1018[var10] == 9) {
                    int var19 = 150 - field1025[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field1018[var10] == 10) {
                    int var20 = 150 - field1025[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field1018[var10] == 11) {
                    int var21 = 150 - field1025[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field1031[var10] == 0) {
                    Statics.field923.method4382(var17, field1125 + arg0, field1094 + arg1, var18, 0);
                }
                if (field1031[var10] == 1) {
                    Statics.field923.method4384(var17, field1125 + arg0, field1094 + arg1, var18, 0, field1035);
                }
                if (field1031[var10] == 2) {
                    Statics.field923.method4385(var17, field1125 + arg0, field1094 + arg1, var18, 0, field1035);
                }
                if (field1031[var10] == 3) {
                    Statics.field923.method4386(var17, field1125 + arg0, field1094 + arg1, var18, 0, field1035, 150 - field1025[var10]);
                }
                if (field1031[var10] == 4) {
                    int var22 = (150 - field1025[var10]) * (Statics.field923.method4374(var17) + 100) / 150;
                    class282.method4594(field1125 + arg0 - 50, arg1, field1125 + arg0 + 50, arg1 + arg3);
                    Statics.field923.method4383(var17, field1125 + arg0 + 50 - var22, field1094 + arg1, var18, 0);
                    class282.method4578(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field1031[var10] == 5) {
                    int var23 = 150 - field1025[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class282.method4594(arg0, field1094 + arg1 - Statics.field923.field3653 - 1, arg0 + arg2, field1094 + arg1 + 5);
                    Statics.field923.method4382(var17, field1125 + arg0, field1094 + arg1 + var24, var18, 0);
                    class282.method4578(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field923.method4382(var17, field1125 + arg0, field1094 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("gk.gg(IIIII)V")
    public static final void method3362(int arg0, int arg1, int arg2, int arg3) {
        if (field1187 == 1) {
            Statics.field279[field1001 / 100].method4676(field1176 - 8, field1039 - 8);
        }
        if (field1187 == 2) {
            Statics.field279[field1001 / 100 + 4].method4676(field1176 - 8, field1039 - 8);
        }
        field986 = 0;
        int var4 = (Statics.field1321.field1275 >> 7) + Statics.field562;
        int var5 = (Statics.field1321.field1244 >> 7) + Statics.field387;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field986 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field986 = 1;
        }
        if (field986 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field986 = 0;
        }
    }

    @ObfuscatedName("bj.gf(Lcs;II)V")
    public static final void method695(class79 arg0, int arg1) {
        method438(arg0.field1275, arg0.field1244, arg1);
    }

    @ObfuscatedName("al.gb(IIIB)V")
    public static final void method438(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1125 = -1;
            field1094 = -1;
            return;
        }
        int var3 = method132(arg0, arg1, Statics.field2158) - arg2;
        int var4 = arg0 - Statics.field1794;
        int var5 = var3 - Statics.field315;
        int var6 = arg1 - Statics.field835;
        int var7 = class137.field2053[Statics.field1336];
        int var8 = class137.field2041[Statics.field1336];
        int var9 = class137.field2053[Statics.field284];
        int var10 = class137.field2041[Statics.field284];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1125 = field1195 * var11 / var15 + field1193 / 2;
            field1094 = field1195 * var14 / var15 + field1011 / 2;
        } else {
            field1125 = -1;
            field1094 = -1;
        }
    }

    @ObfuscatedName("w.gq(IIII)I")
    public static final int method132(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field769[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field766[var5][var3][var4] + class62.field766[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field766[var5][var3][var4 + 1] + class62.field766[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("au.gu(ZI)V")
    public static final void method558(boolean arg0) {
        field1107 = arg0;
        if (!field1107) {
            int var1 = field975.method2905();
            int var2 = field975.method2905();
            int var3 = field975.method2872();
            Statics.field1570 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1570[var4][var5] = field975.method2875();
                }
            }
            Statics.field1565 = new int[var3];
            Statics.field795 = new int[var3];
            Statics.field421 = new int[var3];
            Statics.field924 = new byte[var3][];
            Statics.field2159 = new byte[var3][];
            boolean var6 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var2 / 8 == 48) {
                var6 = true;
            }
            if (var1 / 8 == 48 && var2 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        Statics.field1565[var7] = var10;
                        Statics.field795[var7] = Statics.field927.method3785("m" + var8 + "_" + var9);
                        Statics.field421[var7] = Statics.field927.method3785("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2648(var1, var2, true);
            return;
        }
        boolean var11 = field975.method2898() == 1;
        int var12 = field975.method2872();
        int var13 = field975.method2907();
        int var14 = field975.method2872();
        field975.method3107();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field975.method3115(1);
                    if (var18 == 1) {
                        field993[var15][var16][var17] = field975.method3115(26);
                    } else {
                        field993[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field975.method3109();
        Statics.field1570 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1570[var19][var20] = field975.method2875();
            }
        }
        Statics.field1565 = new int[var14];
        Statics.field795 = new int[var14];
        Statics.field421 = new int[var14];
        Statics.field924 = new byte[var14][];
        Statics.field2159 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field993[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field1565[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field1565[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field795[var21] = Statics.field927.method3785("m" + var30 + "_" + var31);
                            Statics.field421[var21] = Statics.field927.method3785("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method2648(var12, var13, !var11);
    }

    @ObfuscatedName("ew.gv(IIZI)V")
    public static final void method2648(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field749 == arg0 && Statics.field748 == arg1) {
            return;
        }
        Statics.field749 = arg0;
        Statics.field748 = arg1;
        method4071(25);
        method4027(class226.field2863, true);
        int var3 = Statics.field562;
        int var4 = Statics.field387;
        Statics.field562 = (arg0 - 6) * 8;
        Statics.field387 = (arg1 - 6) * 8;
        int var5 = Statics.field562 - var3;
        int var6 = Statics.field387 - var4;
        int var7 = Statics.field562;
        int var8 = Statics.field387;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field968[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1298[var11] -= var5;
                    var10.field1299[var11] -= var6;
                }
                var10.field1275 -= var5 * 128;
                var10.field1244 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1051[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1298[var14] -= var5;
                    var13.field1299[var14] -= var6;
                }
                var13.field1275 -= var5 * 128;
                var13.field1244 -= var6 * 128;
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
                        field939[var25][var21][var22] = field939[var25][var23][var24];
                    } else {
                        field939[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field980.method3294(); var26 != null; var26 = (class77) field980.method3296()) {
            var26.field1218 -= var5;
            var26.field1225 -= var6;
            if (var26.field1218 < 0 || var26.field1225 < 0 || var26.field1218 >= 104 || var26.field1225 >= 104) {
                var26.method3278();
            }
        }
        if (field1163 != 0) {
            field1163 -= var5;
            field945 -= var6;
        }
        field1062 = 0;
        field990 = false;
        field1158 = -1;
        field1173.method3287();
        field1063.method3287();
        for (int var27 = 0; var27 < 4; var27++) {
            field991[var27].method2757();
        }
    }

    @ObfuscatedName("bi.gd(I)V")
    public static final void method961() {
        Statics.method55(false);
        field1027 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field924.length; var1++) {
            if (Statics.field795[var1] != -1 && Statics.field924[var1] == null) {
                Statics.field924[var1] = Statics.field927.method3769(Statics.field795[var1], 0);
                if (Statics.field924[var1] == null) {
                    var0 = false;
                    field1027++;
                }
            }
            if (Statics.field421[var1] != -1 && Statics.field2159[var1] == null) {
                Statics.field2159[var1] = Statics.field927.method3770(Statics.field421[var1], 0, Statics.field1570[var1]);
                if (Statics.field2159[var1] == null) {
                    var0 = false;
                    field1027++;
                }
            }
        }
        if (!var0) {
            field1143 = 1;
            return;
        }
        field988 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field924.length; var3++) {
            byte[] var4 = Statics.field2159[var3];
            if (var4 != null) {
                int var5 = (Statics.field1565[var3] >> 8) * 64 - Statics.field562;
                int var6 = (Statics.field1565[var3] & 0xFF) * 64 - Statics.field387;
                if (field1107) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class174 var9 = new class174(var4);
                int var10 = -1;
                label557: while (true) {
                    int var11 = var9.method2883();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2883();
                            if (var16 == 0) {
                                continue label557;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2870() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class256 var22 = Statics.method3743(var10);
                                if (var19 != 22 || !field1047 || var22.field3452 != 0 || var22.field3472 == 1 || var22.field3471) {
                                    if (!var22.method4178()) {
                                        field988++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2883();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2870();
                    }
                }
            }
        }
        if (!var2) {
            field1143 = 2;
            return;
        }
        if (field1143 != 0) {
            method4027(class226.field2863 + class89.field1415 + class89.field1412 + 100 + "%" + class89.field1413, true);
        }
        method975();
        method41();
        method975();
        Statics.field7.method2455();
        method975();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field991[var23].method2757();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class62.field769[var24][var25][var26] = 0;
                }
            }
        }
        method975();
        class62.method3735();
        int var27 = Statics.field924.length;
        for (class83 var28 = (class83) class83.field1349.method3294(); var28 != null; var28 = (class83) class83.field1349.method3296()) {
            if (var28.field1342 != null) {
                Statics.field2289.method1727(var28.field1342);
                var28.field1342 = null;
            }
            if (var28.field1354 != null) {
                Statics.field2289.method1727(var28.field1354);
                var28.field1354 = null;
            }
        }
        class83.field1349.method3287();
        Statics.method55(true);
        if (!field1107) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field1565[var29] >> 8) * 64 - Statics.field562;
                int var31 = (Statics.field1565[var29] & 0xFF) * 64 - Statics.field387;
                byte[] var32 = Statics.field924[var29];
                if (var32 != null) {
                    method975();
                    int var33 = Statics.field749 * 8 - 48;
                    int var34 = Statics.field748 * 8 - 48;
                    class162[] var35 = field991;
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 64; var37++) {
                            for (int var38 = 0; var38 < 64; var38++) {
                                if (var30 + var37 > 0 && var30 + var37 < 103 && var31 + var38 > 0 && var31 + var38 < 103) {
                                    var35[var36].field2320[var30 + var37][var31 + var38] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class174 var39 = new class174(var32);
                    for (int var40 = 0; var40 < 4; var40++) {
                        for (int var41 = 0; var41 < 64; var41++) {
                            for (int var42 = 0; var42 < 64; var42++) {
                                class62.method1570(var39, var40, var30 + var41, var31 + var42, var33, var34, 0);
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < var27; var43++) {
                int var44 = (Statics.field1565[var43] >> 8) * 64 - Statics.field562;
                int var45 = (Statics.field1565[var43] & 0xFF) * 64 - Statics.field387;
                byte[] var46 = Statics.field924[var43];
                if (var46 == null && Statics.field748 < 800) {
                    method975();
                    class62.method2(var44, var45, 64, 64);
                }
            }
            Statics.method55(true);
            for (int var47 = 0; var47 < var27; var47++) {
                byte[] var48 = Statics.field2159[var47];
                if (var48 != null) {
                    int var49 = (Statics.field1565[var47] >> 8) * 64 - Statics.field562;
                    int var50 = (Statics.field1565[var47] & 0xFF) * 64 - Statics.field387;
                    method975();
                    class62.method3764(var48, var49, var50, Statics.field7, field991);
                }
            }
        }
        if (field1107) {
            for (int var51 = 0; var51 < 4; var51++) {
                method975();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        boolean var54 = false;
                        int var55 = field993[var51][var52][var53];
                        if (var55 != -1) {
                            int var56 = var55 >> 24 & 0x3;
                            int var57 = var55 >> 1 & 0x3;
                            int var58 = var55 >> 14 & 0x3FF;
                            int var59 = var55 >> 3 & 0x7FF;
                            int var60 = (var58 / 8 << 8) + var59 / 8;
                            for (int var61 = 0; var61 < Statics.field1565.length; var61++) {
                                if (Statics.field1565[var61] == var60 && Statics.field924[var61] != null) {
                                    class62.method933(Statics.field924[var61], var51, var52 * 8, var53 * 8, var56, (var58 & 0x7) * 8, (var59 & 0x7) * 8, var57, field991);
                                    var54 = true;
                                    break;
                                }
                            }
                        }
                        if (!var54) {
                            int var62 = var51;
                            int var63 = var52 * 8;
                            int var64 = var53 * 8;
                            for (int var65 = 0; var65 < 8; var65++) {
                                for (int var66 = 0; var66 < 8; var66++) {
                                    class62.field766[var62][var63 + var65][var64 + var66] = 0;
                                }
                            }
                            if (var63 > 0) {
                                for (int var67 = 1; var67 < 8; var67++) {
                                    class62.field766[var62][var63][var64 + var67] = class62.field766[var62][var63 - 1][var64 + var67];
                                }
                            }
                            if (var64 > 0) {
                                for (int var68 = 1; var68 < 8; var68++) {
                                    class62.field766[var62][var63 + var68][var64] = class62.field766[var62][var63 + var68][var64 - 1];
                                }
                            }
                            if (var63 > 0 && class62.field766[var62][var63 - 1][var64] != 0) {
                                class62.field766[var62][var63][var64] = class62.field766[var62][var63 - 1][var64];
                            } else if (var64 > 0 && class62.field766[var62][var63][var64 - 1] != 0) {
                                class62.field766[var62][var63][var64] = class62.field766[var62][var63][var64 - 1];
                            } else if (var63 > 0 && var64 > 0 && class62.field766[var62][var63 - 1][var64 - 1] != 0) {
                                class62.field766[var62][var63][var64] = class62.field766[var62][var63 - 1][var64 - 1];
                            }
                        }
                    }
                }
            }
            for (int var69 = 0; var69 < 13; var69++) {
                for (int var70 = 0; var70 < 13; var70++) {
                    int var71 = field993[0][var69][var70];
                    if (var71 == -1) {
                        class62.method2(var69 * 8, var70 * 8, 8, 8);
                    }
                }
            }
            Statics.method55(true);
            for (int var72 = 0; var72 < 4; var72++) {
                method975();
                for (int var73 = 0; var73 < 13; var73++) {
                    label356: for (int var74 = 0; var74 < 13; var74++) {
                        int var75 = field993[var72][var73][var74];
                        if (var75 != -1) {
                            int var76 = var75 >> 24 & 0x3;
                            int var77 = var75 >> 1 & 0x3;
                            int var78 = var75 >> 14 & 0x3FF;
                            int var79 = var75 >> 3 & 0x7FF;
                            int var80 = (var78 / 8 << 8) + var79 / 8;
                            for (int var81 = 0; var81 < Statics.field1565.length; var81++) {
                                if (Statics.field1565[var81] == var80 && Statics.field2159[var81] != null) {
                                    byte[] var82 = Statics.field2159[var81];
                                    int var83 = var73 * 8;
                                    int var84 = var74 * 8;
                                    int var85 = (var78 & 0x7) * 8;
                                    int var86 = (var79 & 0x7) * 8;
                                    class140 var87 = Statics.field7;
                                    class162[] var88 = field991;
                                    class174 var89 = new class174(var82);
                                    int var90 = -1;
                                    while (true) {
                                        int var91 = var89.method2883();
                                        if (var91 == 0) {
                                            continue label356;
                                        }
                                        var90 += var91;
                                        int var92 = 0;
                                        while (true) {
                                            int var93 = var89.method2883();
                                            if (var93 == 0) {
                                                break;
                                            }
                                            var92 += var93 - 1;
                                            int var94 = var92 & 0x3F;
                                            int var95 = var92 >> 6 & 0x3F;
                                            int var96 = var92 >> 12;
                                            int var97 = var89.method2870();
                                            int var98 = var97 >> 2;
                                            int var99 = var97 & 0x3;
                                            if (var76 == var96 && var95 >= var85 && var95 < var85 + 8 && var94 >= var86 && var94 < var86 + 8) {
                                                class256 var100 = Statics.method3743(var90);
                                                int var101 = var83 + class216.method977(var95 & 0x7, var94 & 0x7, var77, var100.field3469, var100.field3449, var99);
                                                int var103 = var95 & 0x7;
                                                int var104 = var94 & 0x7;
                                                int var106 = var100.field3469;
                                                int var107 = var100.field3449;
                                                if ((var99 & 0x1) == 1) {
                                                    int var108 = var106;
                                                    var106 = var107;
                                                    var107 = var108;
                                                }
                                                int var109 = var77 & 0x3;
                                                int var110;
                                                if (var109 == 0) {
                                                    var110 = var104;
                                                } else if (var109 == 1) {
                                                    var110 = 7 - var103 - (var106 - 1);
                                                } else if (var109 == 2) {
                                                    var110 = 7 - var104 - (var107 - 1);
                                                } else {
                                                    var110 = var103;
                                                }
                                                int var111 = var84 + var110;
                                                if (var101 > 0 && var111 > 0 && var101 < 103 && var111 < 103) {
                                                    int var112 = var72;
                                                    if ((class62.field769[1][var101][var111] & 0x2) == 2) {
                                                        var112 = var72 - 1;
                                                    }
                                                    class162 var113 = null;
                                                    if (var112 >= 0) {
                                                        var113 = var88[var112];
                                                    }
                                                    class62.method1535(var72, var101, var111, var90, var77 + var99 & 0x3, var98, var87, var113);
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
        Statics.method55(true);
        method41();
        method975();
        class62.method1013(Statics.field7, field991);
        Statics.method55(true);
        int var114 = class62.field758;
        if (var114 > Statics.field2158) {
            var114 = Statics.field2158;
        }
        if (var114 < Statics.field2158 - 1) {
            int var115 = Statics.field2158 - 1;
        }
        if (field1047) {
            Statics.field7.method2494(class62.field758);
        } else {
            Statics.field7.method2494(0);
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                method1436(var116, var117);
            }
        }
        method975();
        method608();
        class256.field3456.method3221();
        if (Statics.field1215.method781()) {
            field973.method3105(234);
            field973.method2871(1057001181);
        }
        if (!field1107) {
            int var118 = (Statics.field749 - 6) / 8;
            int var119 = (Statics.field749 + 6) / 8;
            int var120 = (Statics.field748 - 6) / 8;
            int var121 = (Statics.field748 + 6) / 8;
            for (int var122 = var118 - 1; var122 <= var119 + 1; var122++) {
                for (int var123 = var120 - 1; var123 <= var121 + 1; var123++) {
                    if (var122 < var118 || var122 > var119 || var123 < var120 || var123 > var121) {
                        Statics.field927.method3790("m" + var122 + "_" + var123);
                        Statics.field927.method3790("l" + var122 + "_" + var123);
                    }
                }
            }
        }
        method4071(30);
        method975();
        Statics.field760 = (byte[][][]) null;
        Statics.field770 = (byte[][][]) null;
        Statics.field762 = (byte[][][]) null;
        Statics.field283 = (byte[][][]) null;
        Statics.field608 = (int[][][]) null;
        Statics.field606 = (byte[][][]) null;
        Statics.field820 = (int[][]) null;
        Statics.field763 = null;
        Statics.field764 = null;
        Statics.field2638 = null;
        Statics.field765 = null;
        Statics.field757 = null;
        field973.method3105(3);
        class59.method962();
    }

    @ObfuscatedName("client.gz(B)Z")
    public final boolean method1044() {
        if (Statics.field781 == null) {
            return false;
        }
        try {
            int var1 = Statics.field781.method2735();
            if (var1 == 0) {
                return false;
            }
            if (field977 == -1) {
                Statics.field781.method2720(field975.field2415, 0, 1);
                field975.field2407 = 0;
                field977 = field975.method3106();
                field943 = class273.field3709[field977];
                var1--;
            }
            if (field943 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field781.method2720(field975.field2415, 0, 1);
                field943 = field975.field2415[0] & 0xFF;
                var1--;
            }
            if (field943 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field781.method2720(field975.field2415, 0, 2);
                field975.field2407 = 0;
                field943 = field975.method2872();
                var1 -= 2;
            }
            if (var1 < field943) {
                return false;
            }
            field975.field2407 = 0;
            Statics.field781.method2720(field975.field2415, 0, field943);
            field978 = 0;
            field1168 = field981;
            field981 = field996;
            field996 = field977;
            if (field977 == 208) {
                method558(false);
                field975.method3106();
                int var2 = field975.method2872();
                class97.method473(field975, var2);
                field977 = -1;
                return true;
            }
            if (field977 == 252) {
                String var3 = field975.method2878();
                int var4 = field975.method2872();
                byte var5 = field975.method2938();
                boolean var6 = false;
                if (var5 == -128) {
                    var6 = true;
                }
                if (var6) {
                    if (Statics.field39 == 0) {
                        field977 = -1;
                        return true;
                    }
                    boolean var7 = false;
                    int var8;
                    for (var8 = 0; var8 < Statics.field39 && (!Statics.field1241[var8].field928.equals(var3) || Statics.field1241[var8].field921 != var4); var8++) {
                    }
                    if (var8 < Statics.field39) {
                        while (var8 < Statics.field39 - 1) {
                            Statics.field1241[var8] = Statics.field1241[var8 + 1];
                            var8++;
                        }
                        Statics.field39--;
                        Statics.field1241[Statics.field39] = null;
                    }
                } else {
                    field975.method2878();
                    class76 var9 = new class76();
                    var9.field928 = var3;
                    var9.field920 = class268.method2702(var9.field928, Statics.field1332);
                    var9.field921 = var4;
                    var9.field922 = var5;
                    int var10;
                    for (var10 = Statics.field39 - 1; var10 >= 0; var10--) {
                        int var11 = Statics.field1241[var10].field920.compareTo(var9.field920);
                        if (var11 == 0) {
                            Statics.field1241[var10].field921 = var4;
                            Statics.field1241[var10].field922 = var5;
                            if (var3.equals(Statics.field1321.field906)) {
                                Statics.field430 = var5;
                            }
                            field1037 = field1122;
                            field977 = -1;
                            return true;
                        }
                        if (var11 < 0) {
                            break;
                        }
                    }
                    if (Statics.field39 >= Statics.field1241.length) {
                        field977 = -1;
                        return true;
                    }
                    for (int var12 = Statics.field39 - 1; var12 > var10; var12--) {
                        Statics.field1241[var12 + 1] = Statics.field1241[var12];
                    }
                    if (Statics.field39 == 0) {
                        Statics.field1241 = new class76[100];
                    }
                    Statics.field1241[var10 + 1] = var9;
                    Statics.field39++;
                    if (var3.equals(Statics.field1321.field906)) {
                        Statics.field430 = var5;
                    }
                }
                field1037 = field1122;
                field977 = -1;
                return true;
            }
            if (field977 == 227) {
                method206(true);
                field977 = -1;
                return true;
            }
            if (field977 == 209) {
                int var13 = field975.method2916();
                class217 var14 = class217.method192(var13);
                var14.field2695 = 3;
                var14.field2696 = Statics.field1321.field902.method3614();
                method162(var14);
                field977 = -1;
                return true;
            }
            if (field977 == 190) {
                int var15 = field975.method2870();
                class277[] var16 = class277.method3555();
                int var17 = 0;
                class277 var19;
                while (true) {
                    if (var17 >= var16.length) {
                        var19 = null;
                        break;
                    }
                    class277 var18 = var16[var17];
                    if (var18.field3738 == var15) {
                        var19 = var18;
                        break;
                    }
                    var17++;
                }
                Statics.field696 = var19;
                field977 = -1;
                return true;
            }
            if (field977 == 249) {
                field975.field2407 += 28;
                if (field975.method2893()) {
                    method163(field975, field975.field2407 - 28);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 91) {
                int var20 = field975.method2948();
                int var21 = field975.method2875();
                class217 var22 = class217.method192(var21);
                if (var22.field2699 != var20 || var20 == -1) {
                    var22.field2699 = var20;
                    var22.field2676 = 0;
                    var22.field2775 = 0;
                    method162(var22);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 28) {
                int var23 = field975.method2875();
                int var24 = field975.method2875();
                if (Statics.field2360 == null || !Statics.field2360.isValid()) {
                    try {
                        Iterator var25 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var25.hasNext()) {
                            GarbageCollectorMXBean var26 = (GarbageCollectorMXBean) var25.next();
                            if (var26.isValid()) {
                                Statics.field2360 = var26;
                                field1207 = -1L;
                                field1099 = -1L;
                            }
                        }
                    } catch (Throwable var298) {
                    }
                }
                long var28 = class176.method89();
                int var30 = -1;
                if (Statics.field2360 != null) {
                    long var31 = Statics.field2360.getCollectionTime();
                    if (field1099 != -1L) {
                        long var33 = var31 - field1099;
                        long var35 = var28 - field1207;
                        if (var35 != 0L) {
                            var30 = (int) (var33 * 100L / var35);
                        }
                    }
                    field1099 = var31;
                    field1207 = var28;
                }
                field973.method3105(97);
                field973.method2894(field708);
                field973.method2895(var30);
                field973.method3012(var23);
                field973.method2912(var24);
                field977 = -1;
                return true;
            }
            if (field977 == 106) {
                int var37 = field975.method2875();
                int var38 = field975.method2905();
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var39 = field975.method2916();
                class217 var40 = class217.method192(var37);
                if (var40.field2651) {
                    var40.field2674 = var38;
                    var40.field2773 = var39;
                    class257 var42 = class257.method2996(var38);
                    var40.field2703 = var42.field3483;
                    var40.field2704 = var42.field3520;
                    var40.field2723 = var42.field3501;
                    var40.field2701 = var42.field3502;
                    var40.field2702 = var42.field3535;
                    var40.field2706 = var42.field3498;
                    if (var42.field3504 == 1) {
                        var40.field2710 = 1;
                    } else {
                        var40.field2710 = 2;
                    }
                    if (var40.field2744 > 0) {
                        var40.field2706 = var40.field2706 * 32 / var40.field2744;
                    } else if (var40.field2705 > 0) {
                        var40.field2706 = var40.field2706 * 32 / var40.field2705;
                    }
                    method162(var40);
                } else if (var38 == -1) {
                    var40.field2695 = 0;
                    field977 = -1;
                    return true;
                } else {
                    class257 var41 = class257.method2996(var38);
                    var40.field2695 = 4;
                    var40.field2696 = var38;
                    var40.field2703 = var41.field3483;
                    var40.field2704 = var41.field3520;
                    var40.field2706 = var41.field3498 * 100 / var39;
                    method162(var40);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 107) {
                boolean var43 = field975.method2870() == 1;
                if (var43) {
                    Statics.field415 = class176.method89() - field975.method2876();
                    Statics.field2634 = new class14(field975, true);
                } else {
                    Statics.field2634 = null;
                }
                field1127 = field1122;
                field977 = -1;
                return true;
            }
            if (field977 == 147) {
                int var44 = field975.method2875();
                int var45 = field975.method2872();
                if (var44 < -70000) {
                    var45 += 32768;
                }
                class217 var46;
                if (var44 >= 0) {
                    var46 = class217.method192(var44);
                } else {
                    var46 = null;
                }
                if (var46 != null) {
                    for (int var47 = 0; var47 < var46.field2743.length; var47++) {
                        var46.field2743[var47] = 0;
                        var46.field2671[var47] = 0;
                    }
                }
                class64 var48 = (class64) class64.field797.method3238((long) var45);
                if (var48 != null) {
                    for (int var49 = 0; var49 < var48.field788.length; var49++) {
                        var48.field788[var49] = -1;
                        var48.field789[var49] = 0;
                    }
                }
                int var50 = field975.method2872();
                for (int var51 = 0; var51 < var50; var51++) {
                    int var52 = field975.method2870();
                    if (var52 == 255) {
                        var52 = field975.method2916();
                    }
                    int var53 = field975.method2907();
                    if (var46 != null && var51 < var46.field2743.length) {
                        var46.field2743[var51] = var53;
                        var46.field2671[var51] = var52;
                    }
                    class64.method647(var45, var51, var53 - 1, var52);
                }
                if (var46 != null) {
                    method162(var46);
                }
                method1();
                field1119[++field1138 - 1 & 0x1F] = var45 & 0x7FFF;
                field977 = -1;
                return true;
            }
            if (field977 == 144) {
                int var54 = field975.method2898();
                String var55 = field975.method2878();
                int var56 = field975.method2870();
                if (var56 >= 1 && var56 <= 8) {
                    if (var55.equalsIgnoreCase("null")) {
                        var55 = null;
                    }
                    field1057[var56 - 1] = var55;
                    field1058[var56 - 1] = var54 == 0;
                }
                field977 = -1;
                return true;
            }
            if (field977 == 224) {
                int var57 = field975.method2915();
                class217 var58 = class217.method192(var57);
                for (int var59 = 0; var59 < var58.field2743.length; var59++) {
                    var58.field2743[var59] = -1;
                    var58.field2743[var59] = 0;
                }
                method162(var58);
                field977 = -1;
                return true;
            }
            if (field977 == 27) {
                int var60 = field975.method2907();
                int var61 = field975.method2905();
                int var62 = field975.method2875();
                class217 var63 = class217.method192(var62);
                var63.field2708 = (var60 << 16) + var61;
                field977 = -1;
                return true;
            }
            if (field977 == 206) {
                for (int var64 = 0; var64 < class212.field2609.length; var64++) {
                    if (class212.field2609[var64] != class212.field2607[var64]) {
                        class212.field2609[var64] = class212.field2607[var64];
                        method40(var64);
                        field1117[++field1118 - 1 & 0x1F] = var64;
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 89) {
                int var65 = field975.method2905();
                if (var65 == 65535) {
                    var65 = -1;
                }
                method3485(var65);
                field977 = -1;
                return true;
            }
            if (field977 == 152) {
                int var66 = field975.method2872();
                if (var66 == 65535) {
                    var66 = -1;
                }
                int var67 = field975.method2860();
                method998(var66, var67);
                field977 = -1;
                return true;
            }
            if (field977 == 26) {
                method968();
                field977 = -1;
                return false;
            }
            if (field977 == 155) {
                field1163 = field975.method2870();
                if (field1163 == 255) {
                    field1163 = 0;
                }
                field945 = field975.method2870();
                if (field945 == 255) {
                    field945 = 0;
                }
                field977 = -1;
                return true;
            }
            if (field977 == 207) {
                class81 var68 = new class81();
                var68.field1324 = field975.method2878();
                var68.field1328 = field975.method2872();
                int var69 = field975.method2875();
                var68.field1322 = var69;
                method4071(45);
                Statics.field781.method2716();
                Statics.field781 = null;
                class93.method146(var68);
                field977 = -1;
                return false;
            }
            if (field977 == 228) {
                int var70 = field975.method2875();
                class69 var71 = (class69) field1092.method3238((long) var70);
                if (var71 != null) {
                    method945(var71, true);
                }
                if (field964 != null) {
                    method162(field964);
                    field964 = null;
                }
                field977 = -1;
                return true;
            }
            if (field977 == 43) {
                for (int var72 = 0; var72 < field1051.length; var72++) {
                    if (field1051[var72] != null) {
                        field1051[var72].field1247 = -1;
                    }
                }
                for (int var73 = 0; var73 < field968.length; var73++) {
                    if (field968[var73] != null) {
                        field968[var73].field1247 = -1;
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 181) {
                field946 = field975.method2870();
                if (field946 == 1) {
                    field947 = field975.method2872();
                }
                if (field946 >= 2 && field946 <= 6) {
                    if (field946 == 2) {
                        field1128 = 64;
                        field953 = 64;
                    }
                    if (field946 == 3) {
                        field1128 = 0;
                        field953 = 64;
                    }
                    if (field946 == 4) {
                        field1128 = 128;
                        field953 = 64;
                    }
                    if (field946 == 5) {
                        field1128 = 64;
                        field953 = 0;
                    }
                    if (field946 == 6) {
                        field1128 = 64;
                        field953 = 128;
                    }
                    field946 = 2;
                    field949 = field975.method2872();
                    field950 = field975.method2872();
                    field1177 = field975.method2870();
                }
                if (field946 == 10) {
                    field948 = field975.method2872();
                }
                field977 = -1;
                return true;
            }
            if (field977 == 201) {
                while (field975.field2407 < field943) {
                    boolean var74 = field975.method2870() == 1;
                    String var75 = field975.method2878();
                    String var76 = field975.method2878();
                    int var77 = field975.method2872();
                    int var78 = field975.method2870();
                    int var79 = field975.method2870();
                    boolean var80 = (var79 & 0x2) != 0;
                    boolean var81 = (var79 & 0x1) != 0;
                    if (var77 > 0) {
                        field975.method2878();
                        field975.method2870();
                        field975.method2875();
                    }
                    field975.method2878();
                    for (int var82 = 0; var82 < field1196; var82++) {
                        class66 var83 = field952[var82];
                        if (var74) {
                            if (var76.equals(var83.field814)) {
                                var83.field814 = var75;
                                var83.field815 = var76;
                                var75 = null;
                                break;
                            }
                        } else if (var75.equals(var83.field814)) {
                            if (var83.field816 != var77) {
                                boolean var84 = true;
                                for (class68 var85 = (class68) field1061.method3321(); var85 != null; var85 = (class68) field1061.method3323()) {
                                    if (var85.field832.equals(var75)) {
                                        if (var77 != 0 && var85.field836 == 0) {
                                            var85.method3333();
                                            var84 = false;
                                        } else if (var77 == 0 && var85.field836 != 0) {
                                            var85.method3333();
                                            var84 = false;
                                        }
                                    }
                                }
                                if (var84) {
                                    field1061.method3326(new class68(var75, var77));
                                }
                                var83.field816 = var77;
                            }
                            var83.field815 = var76;
                            var83.field817 = var78;
                            var83.field823 = var80;
                            var83.field819 = var81;
                            var75 = null;
                            break;
                        }
                    }
                    if (var75 != null && field1196 < 400) {
                        class66 var86 = new class66();
                        field952[field1196] = var86;
                        var86.field814 = var75;
                        var86.field815 = var76;
                        var86.field816 = var77;
                        var86.field817 = var78;
                        var86.field823 = var80;
                        var86.field819 = var81;
                        field1196++;
                    }
                }
                field1197 = 2;
                field1067 = field1122;
                boolean var87 = false;
                int var88 = field1196;
                while (var88 > 0) {
                    boolean var89 = true;
                    var88--;
                    for (int var90 = 0; var90 < var88; var90++) {
                        boolean var91 = false;
                        class66 var92 = field952[var90];
                        class66 var93 = field952[var90 + 1];
                        if (field930 != var92.field816 && field930 == var93.field816) {
                            var91 = true;
                        }
                        if (!var91 && var92.field816 == 0 && var93.field816 != 0) {
                            var91 = true;
                        }
                        if (!var91 && !var92.field823 && var93.field823) {
                            var91 = true;
                        }
                        if (!var91 && !var92.field819 && var93.field819) {
                            var91 = true;
                        }
                        if (var91) {
                            class66 var94 = field952[var90];
                            field952[var90] = field952[var90 + 1];
                            field952[var90 + 1] = var94;
                            var89 = false;
                        }
                    }
                    if (var89) {
                        break;
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 18) {
                int var95 = field975.method2907();
                class64 var96 = (class64) class64.field797.method3238((long) var95);
                if (var96 != null) {
                    var96.method3278();
                }
                field1119[++field1138 - 1 & 0x1F] = var95 & 0x7FFF;
                field977 = -1;
                return true;
            }
            if (field977 == 15) {
                int var97 = field975.method2870();
                int var98 = field975.method2870();
                int var99 = field975.method2870();
                int var100 = field975.method2870();
                field1184[var97] = true;
                field1179[var97] = var98;
                field1180[var97] = var99;
                field1181[var97] = var100;
                field1182[var97] = 0;
                field977 = -1;
                return true;
            }
            if (field977 == 82) {
                Statics.field1419 = field975.method2870();
                Statics.field2594 = field975.method2870();
                for (int var101 = Statics.field1419; var101 < Statics.field1419 + 8; var101++) {
                    for (int var102 = Statics.field2594; var102 < Statics.field2594 + 8; var102++) {
                        if (field939[Statics.field2158][var101][var102] != null) {
                            field939[Statics.field2158][var101][var102] = null;
                            method1436(var101, var102);
                        }
                    }
                }
                for (class77 var103 = (class77) field980.method3294(); var103 != null; var103 = (class77) field980.method3296()) {
                    if (var103.field1218 >= Statics.field1419 && var103.field1218 < Statics.field1419 + 8 && var103.field1225 >= Statics.field2594 && var103.field1225 < Statics.field2594 + 8 && Statics.field2158 == var103.field1226) {
                        var103.field1227 = 0;
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 143) {
                int var104 = field975.method2915();
                int var105 = field975.method2920();
                class69 var106 = (class69) field1092.method3238((long) var105);
                class69 var107 = (class69) field1092.method3238((long) var104);
                if (var107 != null) {
                    method945(var107, var106 == null || var106.field848 != var107.field848);
                }
                if (var106 != null) {
                    var106.method3278();
                    field1092.method3234(var106, (long) var104);
                }
                class217 var108 = class217.method192(var105);
                if (var108 != null) {
                    method162(var108);
                }
                class217 var109 = class217.method192(var104);
                if (var109 != null) {
                    method162(var109);
                    method3876(Statics.field1309[var109.field2652 >>> 16], var109, true);
                }
                if (field1164 != -1) {
                    method2714(field1164, 1);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 115) {
                int var110 = field975.method2916();
                int var111 = field975.method2905();
                int var112 = var111 >> 10 & 0x1F;
                int var113 = var111 >> 5 & 0x1F;
                int var114 = var111 & 0x1F;
                int var115 = (var114 << 3) + (var112 << 19) + (var113 << 11);
                class217 var116 = class217.method192(var110);
                if (var116.field2677 != var115) {
                    var116.field2677 = var115;
                    method162(var116);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 250) {
                method558(true);
                field975.method3106();
                int var117 = field975.method2872();
                class97.method473(field975, var117);
                field977 = -1;
                return true;
            }
            if (field977 == 120) {
                int var118 = field975.method2920();
                Statics.field1473 = Statics.field722.method2684(var118);
                field977 = -1;
                return true;
            }
            if (field977 == 145) {
                field1171 = field975.method2870();
                field977 = -1;
                return true;
            }
            if (field977 == 129) {
                class281.method3582(field975, field943);
                field977 = -1;
                return true;
            }
            if (field977 == 191 || field977 == 73 || field977 == 95 || field977 == 132 || field977 == 219 || field977 == 52 || field977 == 24 || field977 == 77 || field977 == 97 || field977 == 99) {
                method1607();
                field977 = -1;
                return true;
            }
            if (field977 == 199) {
                method2840(field975.method2878());
                field977 = -1;
                return true;
            }
            if (field977 == 94) {
                String var119 = field975.method2878();
                int var120 = field975.method2875();
                class217 var121 = class217.method192(var120);
                if (!var119.equals(var121.field2712)) {
                    var121.field2712 = var119;
                    method162(var121);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 22) {
                int var122 = field975.method2906();
                int var123 = field975.method2915();
                class217 var124 = class217.method192(var123);
                if (var124.field2695 != 1 || var124.field2696 != var122) {
                    var124.field2695 = 1;
                    var124.field2696 = var122;
                    method162(var124);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 160) {
                if (field1164 != -1) {
                    method2714(field1164, 0);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 248) {
                method1();
                int var125 = field975.method2898();
                int var126 = field975.method3043();
                int var127 = field975.method2875();
                field1205[var125] = var127;
                field1065[var125] = var126;
                field1066[var125] = 1;
                for (int var128 = 0; var128 < 98; var128++) {
                    if (var127 >= class223.field2836[var128]) {
                        field1066[var125] = var128 + 2;
                    }
                }
                field1121[++field1052 - 1 & 0x1F] = var125;
                field977 = -1;
                return true;
            }
            if (field977 == 100) {
                String var129 = field975.method2878();
                class180 var130 = field975;
                String var134;
                try {
                    int var131 = var130.method2883();
                    if (var131 > 32767) {
                        var131 = 32767;
                    }
                    byte[] var132 = new byte[var131];
                    var130.field2407 += Statics.field3655.method2806(var130.field2415, var130.field2407, var132, 0, var131);
                    String var133 = class267.method3975(var132, 0, var131);
                    var134 = var133;
                } catch (Exception var297) {
                    var134 = "Cabbage";
                }
                String var137 = class265.method4415(class271.method1930(var134));
                class99.method107(6, var129, var137);
                field977 = -1;
                return true;
            }
            if (field977 == 146) {
                for (int var138 = 0; var138 < Statics.field3289; var138++) {
                    class242 var139 = class242.method152(var138);
                    if (var139 != null) {
                        class212.field2607[var138] = 0;
                        class212.field2609[var138] = 0;
                    }
                }
                method1();
                field1118 += 32;
                field977 = -1;
                return true;
            }
            if (field977 == 127) {
                byte var140 = field975.method2901();
                int var141 = field975.method2905();
                class212.field2607[var141] = var140;
                if (class212.field2609[var141] != var140) {
                    class212.field2609[var141] = var140;
                }
                method40(var141);
                field1117[++field1118 - 1 & 0x1F] = var141;
                field977 = -1;
                return true;
            }
            if (field977 == 41) {
                int var142 = field975.method2916();
                int var143 = field975.method2907();
                class212.field2607[var143] = var142;
                if (class212.field2609[var143] != var142) {
                    class212.field2609[var143] = var142;
                }
                method40(var143);
                field1117[++field1118 - 1 & 0x1F] = var143;
                field977 = -1;
                return true;
            }
            if (field977 == 163) {
                int var144 = field975.method2908();
                int var145 = field975.method2908();
                int var146 = field975.method2915();
                class217 var147 = class217.method192(var146);
                if (var147.field2661 != var144 || var147.field2662 != var145 || var147.field2657 != 0 || var147.field2644 != 0) {
                    var147.field2661 = var144;
                    var147.field2662 = var145;
                    var147.field2657 = 0;
                    var147.field2644 = 0;
                    method162(var147);
                    this.method1243(var147);
                    if (var147.field2675 == 0) {
                        method3876(Statics.field1309[var146 >> 16], var147, false);
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 125) {
                String var148 = field975.method2878();
                long var149 = field975.method2876();
                long var151 = (long) field975.method2872();
                long var153 = (long) field975.method2874();
                class231 var155 = (class231) class169.method1610(class231.method1713(), field975.method2870());
                long var156 = (var151 << 32) + var153;
                boolean var158 = false;
                for (int var159 = 0; var159 < 100; var159++) {
                    if (field1150[var159] == var156) {
                        var158 = true;
                        break;
                    }
                }
                if (var155.field3172 && method3580(var148)) {
                    var158 = true;
                }
                if (!var158 && field986 == 0) {
                    field1150[field1151] = var156;
                    field1151 = (field1151 + 1) % 100;
                    class180 var160 = field975;
                    String var164;
                    try {
                        int var161 = var160.method2883();
                        if (var161 > 32767) {
                            var161 = 32767;
                        }
                        byte[] var162 = new byte[var161];
                        var160.field2407 += Statics.field3655.method2806(var160.field2415, var160.field2407, var162, 0, var161);
                        String var163 = class267.method3975(var162, 0, var161);
                        var164 = var163;
                    } catch (Exception var296) {
                        var164 = "Cabbage";
                    }
                    String var167 = class265.method4415(class271.method1930(var164));
                    if (var155.field3175 == -1) {
                        class99.method2668(9, var148, var167, class269.method4331(var149));
                    } else {
                        int var168 = var155.field3175;
                        String var169 = "<img=" + var168 + ">";
                        class99.method2668(9, var169 + var148, var167, class269.method4331(var149));
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 153) {
                field990 = true;
                Statics.field1464 = field975.method2870();
                Statics.field522 = field975.method2870();
                Statics.field861 = field975.method2872();
                Statics.field1796 = field975.method2870();
                Statics.field2608 = field975.method2870();
                if (Statics.field2608 >= 100) {
                    Statics.field1794 = Statics.field1464 * 128 + 64;
                    Statics.field835 = Statics.field522 * 128 + 64;
                    Statics.field315 = method132(Statics.field1794, Statics.field835, Statics.field2158) - Statics.field861;
                }
                field977 = -1;
                return true;
            }
            if (field977 == 236) {
                class97.method473(field975, field943);
                field977 = -1;
                return true;
            }
            if (field977 == 175) {
                while (field975.field2407 < field943) {
                    int var170 = field975.method2870();
                    boolean var171 = (var170 & 0x1) == 1;
                    String var172 = field975.method2878();
                    String var173 = field975.method2878();
                    field975.method2878();
                    for (int var174 = 0; var174 < field1200; var174++) {
                        class71 var175 = field1201[var174];
                        if (var171) {
                            if (var173.equals(var175.field864)) {
                                var175.field864 = var172;
                                var175.field865 = var173;
                                var172 = null;
                                break;
                            }
                        } else if (var172.equals(var175.field864)) {
                            var175.field864 = var172;
                            var175.field865 = var173;
                            var172 = null;
                            break;
                        }
                    }
                    if (var172 != null && field1200 < 400) {
                        class71 var176 = new class71();
                        field1201[field1200] = var176;
                        var176.field864 = var172;
                        var176.field865 = var173;
                        field1200++;
                    }
                }
                field1067 = field1122;
                field977 = -1;
                return true;
            }
            if (field977 == 168) {
                int var177 = field975.method2905();
                int var178 = field975.method2905();
                int var179 = field975.method2916();
                int var180 = field975.method2907();
                class217 var181 = class217.method192(var179);
                if (var181.field2703 != var180 || var181.field2704 != var178 || var181.field2706 != var177) {
                    var181.field2703 = var180;
                    var181.field2704 = var178;
                    var181.field2706 = var177;
                    method162(var181);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 189) {
                method1();
                field1097 = field975.method2873();
                field1129 = field1122;
                field977 = -1;
                return true;
            }
            if (field977 == 2) {
                field990 = false;
                for (int var182 = 0; var182 < 5; var182++) {
                    field1184[var182] = false;
                }
                field977 = -1;
                return true;
            }
            if (field977 == 42) {
                int var183 = field975.method2898();
                int var184 = field975.method2920();
                int var185 = field975.method2905();
                class69 var186 = (class69) field1092.method3238((long) var184);
                if (var186 != null) {
                    method945(var186, var186.field848 != var185);
                }
                method513(var184, var185, var183);
                field977 = -1;
                return true;
            }
            if (field977 == 108) {
                field1032 = field975.method2870();
                field1148 = field975.method2870();
                field977 = -1;
                return true;
            }
            if (field977 == 241) {
                field990 = true;
                Statics.field884 = field975.method2870();
                Statics.field247 = field975.method2870();
                Statics.field2439 = field975.method2872();
                Statics.field3627 = field975.method2870();
                Statics.field811 = field975.method2870();
                if (Statics.field811 >= 100) {
                    int var187 = Statics.field884 * 128 + 64;
                    int var188 = Statics.field247 * 128 + 64;
                    int var189 = method132(var187, var188, Statics.field2158) - Statics.field2439;
                    int var190 = var187 - Statics.field1794;
                    int var191 = var189 - Statics.field315;
                    int var192 = var188 - Statics.field835;
                    int var193 = (int) Math.sqrt((double) (var190 * var190 + var192 * var192));
                    Statics.field1336 = (int) (Math.atan2((double) var191, (double) var193) * 325.949D) & 0x7FF;
                    Statics.field284 = (int) (Math.atan2((double) var190, (double) var192) * -325.949D) & 0x7FF;
                    if (Statics.field1336 < 128) {
                        Statics.field1336 = 128;
                    }
                    if (Statics.field1336 > 383) {
                        Statics.field1336 = 383;
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 178) {
                int var194 = field975.method2905();
                int var195 = field975.method2920();
                class217 var196 = class217.method192(var195);
                if (var196.field2695 != 2 || var196.field2696 != var194) {
                    var196.field2695 = 2;
                    var196.field2696 = var194;
                    method162(var196);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 0) {
                int var197 = field975.method2870();
                if (field975.method2870() == 0) {
                    field1073[var197] = new class17();
                    field975.field2407 += 18;
                } else {
                    field975.field2407--;
                    field1073[var197] = new class17(field975, false);
                }
                field1126 = field1122;
                field977 = -1;
                return true;
            }
            if (field977 == 138) {
                int var198 = field975.method2875();
                int var199 = field975.method2872();
                if (var198 < -70000) {
                    var199 += 32768;
                }
                class217 var200;
                if (var198 >= 0) {
                    var200 = class217.method192(var198);
                } else {
                    var200 = null;
                }
                while (field975.field2407 < field943) {
                    int var201 = field975.method2883();
                    int var202 = field975.method2872();
                    int var203 = 0;
                    if (var202 != 0) {
                        var203 = field975.method2870();
                        if (var203 == 255) {
                            var203 = field975.method2875();
                        }
                    }
                    if (var200 != null && var201 >= 0 && var201 < var200.field2743.length) {
                        var200.field2743[var201] = var202;
                        var200.field2671[var201] = var203;
                    }
                    class64.method647(var199, var201, var202 - 1, var203);
                }
                if (var200 != null) {
                    method162(var200);
                }
                method1();
                field1119[++field1138 - 1 & 0x1F] = var199 & 0x7FFF;
                field977 = -1;
                return true;
            }
            if (field977 == 9) {
                String var204 = field975.method2878();
                Object[] var205 = new Object[var204.length() + 1];
                for (int var206 = var204.length() - 1; var206 >= 0; var206--) {
                    if (var204.charAt(var206) == 's') {
                        var205[var206 + 1] = field975.method2878();
                    } else {
                        var205[var206 + 1] = Integer.valueOf(field975.method2875());
                    }
                }
                var205[0] = Integer.valueOf(field975.method2875());
                class70 var207 = new class70();
                var207.field850 = var205;
                class84.method966(var207);
                field977 = -1;
                return true;
            }
            if (field977 == 213) {
                int var208 = field975.method2872();
                int var209 = field975.method2870();
                int var210 = field975.method2872();
                method518(var208, var209, var210);
                field977 = -1;
                return true;
            }
            if (field977 == 90) {
                Statics.field2594 = field975.method2898();
                Statics.field1419 = field975.method3043();
                while (field975.field2407 < field943) {
                    field977 = field975.method2870();
                    method1607();
                }
                field977 = -1;
                return true;
            }
            if (field977 == 14) {
                String var211 = field975.method2878();
                long var212 = (long) field975.method2872();
                long var214 = (long) field975.method2874();
                class231 var216 = (class231) class169.method1610(class231.method1713(), field975.method2870());
                long var217 = (var212 << 32) + var214;
                boolean var219 = false;
                for (int var220 = 0; var220 < 100; var220++) {
                    if (field1150[var220] == var217) {
                        var219 = true;
                        break;
                    }
                }
                if (method3580(var211)) {
                    var219 = true;
                }
                if (!var219 && field986 == 0) {
                    field1150[field1151] = var217;
                    field1151 = (field1151 + 1) % 100;
                    class180 var221 = field975;
                    String var225;
                    try {
                        int var222 = var221.method2883();
                        if (var222 > 32767) {
                            var222 = 32767;
                        }
                        byte[] var223 = new byte[var222];
                        var221.field2407 += Statics.field3655.method2806(var221.field2415, var221.field2407, var223, 0, var222);
                        String var224 = class267.method3975(var223, 0, var222);
                        var225 = var224;
                    } catch (Exception var295) {
                        var225 = "Cabbage";
                    }
                    String var228 = class265.method4415(class271.method1930(var225));
                    byte var229;
                    if (var216.field3174) {
                        var229 = 7;
                    } else {
                        var229 = 3;
                    }
                    if (var216.field3175 == -1) {
                        class99.method107(var229, var211, var228);
                    } else {
                        int var231 = var216.field3175;
                        String var232 = "<img=" + var231 + ">";
                        class99.method107(var229, var232 + var211, var228);
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 105) {
                field1037 = field1122;
                if (field943 == 0) {
                    field1156 = null;
                    field1055 = null;
                    Statics.field39 = 0;
                    Statics.field1241 = null;
                    field977 = -1;
                    return true;
                }
                field1055 = field975.method2878();
                long var233 = field975.method2876();
                long var235 = var233;
                String var237;
                if (var233 <= 0L || var233 >= 6582952005840035281L) {
                    var237 = null;
                } else if (var233 % 37L == 0L) {
                    var237 = null;
                } else {
                    int var238 = 0;
                    for (long var239 = var233; var239 != 0L; var239 /= 37L) {
                        var238++;
                    }
                    StringBuilder var241 = new StringBuilder(var238);
                    while (var235 != 0L) {
                        long var242 = var235;
                        var235 /= 37L;
                        var241.append(class269.field3671[(int) (var242 - var235 * 37L)]);
                    }
                    var237 = var241.reverse().toString();
                }
                field1156 = var237;
                Statics.field3391 = field975.method2938();
                int var244 = field975.method2870();
                if (var244 == 255) {
                    field977 = -1;
                    return true;
                }
                Statics.field39 = var244;
                class76[] var245 = new class76[100];
                for (int var246 = 0; var246 < Statics.field39; var246++) {
                    var245[var246] = new class76();
                    var245[var246].field928 = field975.method2878();
                    var245[var246].field920 = class268.method2702(var245[var246].field928, Statics.field1332);
                    var245[var246].field921 = field975.method2872();
                    var245[var246].field922 = field975.method2938();
                    field975.method2878();
                    if (var245[var246].field928.equals(Statics.field1321.field906)) {
                        Statics.field430 = var245[var246].field922;
                    }
                }
                boolean var247 = false;
                int var248 = Statics.field39;
                while (var248 > 0) {
                    boolean var249 = true;
                    var248--;
                    for (int var250 = 0; var250 < var248; var250++) {
                        if (var245[var250].field920.compareTo(var245[var250 + 1].field920) > 0) {
                            class76 var251 = var245[var250];
                            var245[var250] = var245[var250 + 1];
                            var245[var250 + 1] = var251;
                            var249 = false;
                        }
                    }
                    if (var249) {
                        break;
                    }
                }
                Statics.field1241 = var245;
                field977 = -1;
                return true;
            }
            if (field977 == 242) {
                method1();
                field970 = field975.method2870();
                field1129 = field1122;
                field977 = -1;
                return true;
            }
            if (field977 == 98) {
                int var252 = field943 + field975.field2407;
                int var253 = field975.method2872();
                int var254 = field975.method2872();
                if (field1164 != var253) {
                    field1164 = var253;
                    this.method1055(false);
                    method3863(field1164);
                    class84.method1573(field1164);
                    for (int var255 = 0; var255 < 100; var255++) {
                        field1136[var255] = true;
                    }
                }
                while (var254-- > 0) {
                    int var256 = field975.method2875();
                    int var257 = field975.method2872();
                    int var258 = field975.method2870();
                    class69 var259 = (class69) field1092.method3238((long) var256);
                    if (var259 != null && var259.field848 != var257) {
                        method945(var259, true);
                        var259 = null;
                    }
                    if (var259 == null) {
                        var259 = method513(var256, var257, var258);
                    }
                    var259.field846 = true;
                }
                for (class69 var260 = (class69) field1092.method3236(); var260 != null; var260 = (class69) field1092.method3242()) {
                    if (var260.field846) {
                        var260.field846 = false;
                    } else {
                        method945(var260, true);
                    }
                }
                field1133 = new class191(512);
                while (field975.field2407 < var252) {
                    int var261 = field975.method2875();
                    int var262 = field975.method2872();
                    int var263 = field975.method2872();
                    int var264 = field975.method2875();
                    for (int var265 = var262; var265 <= var263; var265++) {
                        long var266 = ((long) var261 << 32) + (long) var265;
                        field1133.method3234(new class199(var264), var266);
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 159) {
                int var268 = field975.method2906();
                field1164 = var268;
                this.method1055(false);
                method3863(var268);
                class84.method1573(field1164);
                for (int var269 = 0; var269 < 100; var269++) {
                    field1136[var269] = true;
                }
                field977 = -1;
                return true;
            }
            if (field977 == 44) {
                field1197 = 1;
                field1067 = field1122;
                field977 = -1;
                return true;
            }
            if (field977 == 154) {
                int var270 = field975.method2915();
                boolean var271 = field975.method3043() == 1;
                class217 var272 = class217.method192(var270);
                if (var272.field2672 != var271) {
                    var272.field2672 = var271;
                    method162(var272);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 220) {
                int var273 = field975.method2883();
                boolean var274 = field975.method2870() == 1;
                String var275 = "";
                boolean var276 = false;
                if (var274) {
                    var275 = field975.method2878();
                    if (method3580(var275)) {
                        var276 = true;
                    }
                }
                String var277 = field975.method2878();
                if (!var276) {
                    class99.method107(var273, var275, var277);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 32) {
                int var278 = field975.method2907();
                if (var278 == 65535) {
                    var278 = -1;
                }
                int var279 = field975.method2916();
                int var280 = field975.method2872();
                if (var280 == 65535) {
                    var280 = -1;
                }
                int var281 = field975.method2920();
                for (int var282 = var280; var282 <= var278; var282++) {
                    long var283 = ((long) var281 << 32) + (long) var282;
                    class193 var285 = field1133.method3238(var283);
                    if (var285 != null) {
                        var285.method3278();
                    }
                    field1133.method3234(new class199(var279), var283);
                }
                field977 = -1;
                return true;
            }
            if (field977 == 50) {
                int var286 = field975.method2872();
                int var287 = field975.method2915();
                class217 var288 = class217.method192(var287);
                if (var288 != null && var288.field2675 == 0) {
                    if (var286 > var288.field2646 - var288.field2689) {
                        var286 = var288.field2646 - var288.field2689;
                    }
                    if (var286 < 0) {
                        var286 = 0;
                    }
                    if (var288.field2754 != var286) {
                        var288.field2754 = var286;
                        method162(var288);
                    }
                }
                field977 = -1;
                return true;
            }
            if (field977 == 216) {
                class97.field1508 = 0;
                for (int var289 = 0; var289 < 2048; var289++) {
                    class97.field1507[var289] = null;
                    class97.field1504[var289] = 1;
                }
                for (int var290 = 0; var290 < 2048; var290++) {
                    field1051[var290] = null;
                }
                class97.method150(field975);
                field977 = -1;
                return true;
            }
            if (field977 == 113) {
                Statics.field1419 = field975.method3043();
                Statics.field2594 = field975.method2898();
                field977 = -1;
                return true;
            }
            if (field977 == 54) {
                method206(false);
                field977 = -1;
                return true;
            }
            if (field977 == 232) {
                field982 = field975.method2905() * 30;
                field1129 = field1122;
                field977 = -1;
                return true;
            }
            class153.method131("" + field977 + class89.field1410 + field981 + class89.field1410 + field1168 + class89.field1410 + field943, (Throwable) null);
            method968();
        } catch (IOException var299) {
            method1537();
        } catch (Exception var300) {
            String var293 = "" + field977 + class89.field1410 + field981 + class89.field1410 + field1168 + class89.field1410 + field943 + class89.field1410 + (Statics.field562 + Statics.field1321.field1298[0]) + class89.field1410 + (Statics.field387 + Statics.field1321.field1299[0]) + class89.field1410;
            for (int var294 = 0; var294 < field943 && var294 < 50; var294++) {
                var293 = var293 + field975.field2415[var294] + class89.field1410;
            }
            class153.method131(var293, var300);
            method968();
        }
        return true;
    }

    @ObfuscatedName("cu.gs(I)V")
    public static final void method1607() {
        if (field977 == 219) {
            int var0 = field975.method2870();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1419;
            int var2 = (var0 & 0x7) + Statics.field2594;
            int var3 = var1 + field975.method2938();
            int var4 = var2 + field975.method2938();
            int var5 = field975.method2873();
            int var6 = field975.method2872();
            int var7 = field975.method2870() * 4;
            int var8 = field975.method2870() * 4;
            int var9 = field975.method2872();
            int var10 = field975.method2872();
            int var11 = field975.method2870();
            int var12 = field975.method2870();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class94 var17 = new class94(var6, Statics.field2158, var13, var14, method132(var13, var14, Statics.field2158) - var7, field938 + var9, field938 + var10, var11, var12, var5, var8);
                var17.method1599(var15, var16, method132(var15, var16, Statics.field2158) - var8, field938 + var9);
                field1063.method3289(var17);
            }
        } else if (field977 == 52) {
            int var18 = field975.method2907();
            int var19 = field975.method3043();
            int var20 = (var19 >> 4 & 0x7) + Statics.field1419;
            int var21 = (var19 & 0x7) + Statics.field2594;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class194 var22 = field939[Statics.field2158][var20][var21];
                if (var22 != null) {
                    for (class95 var23 = (class95) var22.method3294(); var23 != null; var23 = (class95) var22.method3296()) {
                        if ((var18 & 0x7FFF) == var23.field1499) {
                            var23.method3278();
                            break;
                        }
                    }
                    if (var22.method3294() == null) {
                        field939[Statics.field2158][var20][var21] = null;
                    }
                    method1436(var20, var21);
                }
            }
        } else {
            if (field977 == 191) {
                int var24 = field975.method2870();
                int var25 = (var24 >> 4 & 0x7) + Statics.field1419;
                int var26 = (var24 & 0x7) + Statics.field2594;
                int var27 = field975.method2872();
                int var28 = field975.method2870();
                int var29 = var28 >> 4 & 0xF;
                int var30 = var28 & 0x7;
                int var31 = field975.method2870();
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                    int var32 = var29 + 1;
                    if (Statics.field1321.field1298[0] >= var25 - var32 && Statics.field1321.field1298[0] <= var25 + var32 && Statics.field1321.field1299[0] >= var26 - var32 && Statics.field1321.field1299[0] <= var26 + var32 && field1170 != 0 && var30 > 0 && field1062 < 50) {
                        field1172[field1062] = var27;
                        field1019[field1062] = var30;
                        field1029[field1062] = var31;
                        field1009[field1062] = null;
                        field957[field1062] = (var25 << 16) + (var26 << 8) + var29;
                        field1062++;
                    }
                }
            }
            if (field977 == 99) {
                int var33 = field975.method2870();
                int var34 = var33 >> 2;
                int var35 = var33 & 0x3;
                int var36 = field1023[var34];
                int var37 = field975.method3043();
                int var38 = (var37 >> 4 & 0x7) + Statics.field1419;
                int var39 = (var37 & 0x7) + Statics.field2594;
                int var40 = field975.method2906();
                if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                    method2807(Statics.field2158, var38, var39, var36, var40, var34, var35, 0, -1);
                }
            } else {
                if (field977 == 95) {
                    byte var41 = field975.method2900();
                    int var42 = field975.method2872();
                    byte var43 = field975.method2900();
                    int var44 = field975.method2897();
                    int var45 = (var44 >> 4 & 0x7) + Statics.field1419;
                    int var46 = (var44 & 0x7) + Statics.field2594;
                    int var47 = field975.method2898();
                    int var48 = var47 >> 2;
                    int var49 = var47 & 0x3;
                    int var50 = field1023[var48];
                    int var51 = field975.method2906();
                    byte var52 = field975.method2900();
                    int var53 = field975.method2872();
                    int var54 = field975.method2906();
                    byte var55 = field975.method2901();
                    class75 var56;
                    if (field1214 == var51) {
                        var56 = Statics.field1321;
                    } else {
                        var56 = field1051[var51];
                    }
                    if (var56 != null) {
                        class256 var57 = Statics.method3743(var42);
                        int var58;
                        int var59;
                        if (var49 == 1 || var49 == 3) {
                            var58 = var57.field3449;
                            var59 = var57.field3469;
                        } else {
                            var58 = var57.field3469;
                            var59 = var57.field3449;
                        }
                        int var60 = (var58 >> 1) + var45;
                        int var61 = (var58 + 1 >> 1) + var45;
                        int var62 = (var59 >> 1) + var46;
                        int var63 = (var59 + 1 >> 1) + var46;
                        int[][] var64 = class62.field766[Statics.field2158];
                        int var65 = var64[var60][var62] + var64[var61][var62] + var64[var60][var63] + var64[var61][var63] >> 2;
                        int var66 = (var45 << 7) + (var58 << 6);
                        int var67 = (var46 << 7) + (var59 << 6);
                        class134 var68 = var57.method4180(var48, var49, var64, var66, var65, var67);
                        if (var68 != null) {
                            method2807(Statics.field2158, var45, var46, var50, -1, 0, 0, var54 + 1, var53 + 1);
                            var56.field899 = field938 + var54;
                            var56.field903 = field938 + var53;
                            var56.field904 = var68;
                            var56.field901 = var45 * 128 + var58 * 64;
                            var56.field911 = var46 * 128 + var59 * 64;
                            var56.field895 = var65;
                            if (var43 > var52) {
                                byte var69 = var43;
                                var43 = var52;
                                var52 = var69;
                            }
                            if (var55 > var41) {
                                byte var70 = var55;
                                var55 = var41;
                                var41 = var70;
                            }
                            var56.field905 = var43 + var45;
                            var56.field890 = var45 + var52;
                            var56.field907 = var46 + var55;
                            var56.field908 = var41 + var46;
                        }
                    }
                }
                if (field977 == 77) {
                    int var71 = field975.method3043();
                    int var72 = (var71 >> 4 & 0x7) + Statics.field1419;
                    int var73 = (var71 & 0x7) + Statics.field2594;
                    int var74 = field975.method3043();
                    int var75 = var74 >> 2;
                    int var76 = var74 & 0x3;
                    int var77 = field1023[var75];
                    int var78 = field975.method2905();
                    if (var72 >= 0 && var73 >= 0 && var72 < 103 && var73 < 103) {
                        if (var77 == 0) {
                            class143 var79 = Statics.field7.method2477(Statics.field2158, var72, var73);
                            if (var79 != null) {
                                int var80 = var79.field2149 >> 14 & 0x7FFF;
                                if (var75 == 2) {
                                    var79.field2142 = new class101(var80, 2, var76 + 4, Statics.field2158, var72, var73, var78, false, var79.field2142);
                                    var79.field2148 = new class101(var80, 2, var76 + 1 & 0x3, Statics.field2158, var72, var73, var78, false, var79.field2148);
                                } else {
                                    var79.field2142 = new class101(var80, var75, var76, Statics.field2158, var72, var73, var78, false, var79.field2142);
                                }
                            }
                        }
                        if (var77 == 1) {
                            class148 var81 = Statics.field7.method2555(Statics.field2158, var72, var73);
                            if (var81 != null) {
                                int var82 = var81.field2193 >> 14 & 0x7FFF;
                                if (var75 == 4 || var75 == 5) {
                                    var81.field2191 = new class101(var82, 4, var76, Statics.field2158, var72, var73, var78, false, var81.field2191);
                                } else if (var75 == 6) {
                                    var81.field2191 = new class101(var82, 4, var76 + 4, Statics.field2158, var72, var73, var78, false, var81.field2191);
                                } else if (var75 == 7) {
                                    var81.field2191 = new class101(var82, 4, (var76 + 2 & 0x3) + 4, Statics.field2158, var72, var73, var78, false, var81.field2191);
                                } else if (var75 == 8) {
                                    var81.field2191 = new class101(var82, 4, var76 + 4, Statics.field2158, var72, var73, var78, false, var81.field2191);
                                    var81.field2192 = new class101(var82, 4, (var76 + 2 & 0x3) + 4, Statics.field2158, var72, var73, var78, false, var81.field2192);
                                }
                            }
                        }
                        if (var77 == 2) {
                            class149 var83 = Statics.field7.method2479(Statics.field2158, var72, var73);
                            if (var75 == 11) {
                                var75 = 10;
                            }
                            if (var83 != null) {
                                var83.field2201 = new class101(var83.field2209 >> 14 & 0x7FFF, var75, var76, Statics.field2158, var72, var73, var78, false, var83.field2201);
                            }
                        }
                        if (var77 == 3) {
                            class130 var84 = Statics.field7.method2480(Statics.field2158, var72, var73);
                            if (var84 != null) {
                                var84.field1882 = new class101(var84.field1888 >> 14 & 0x7FFF, 22, var76, Statics.field2158, var72, var73, var78, false, var84.field1882);
                            }
                        }
                    }
                } else if (field977 == 24) {
                    int var85 = field975.method2872();
                    int var86 = field975.method2906();
                    int var87 = field975.method2898();
                    int var88 = (var87 >> 4 & 0x7) + Statics.field1419;
                    int var89 = (var87 & 0x7) + Statics.field2594;
                    if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                        class95 var90 = new class95();
                        var90.field1499 = var86;
                        var90.field1500 = var85;
                        if (field939[Statics.field2158][var88][var89] == null) {
                            field939[Statics.field2158][var88][var89] = new class194();
                        }
                        field939[Statics.field2158][var88][var89].method3289(var90);
                        method1436(var88, var89);
                    }
                } else if (field977 == 132) {
                    int var91 = field975.method2870();
                    int var92 = (var91 >> 4 & 0x7) + Statics.field1419;
                    int var93 = (var91 & 0x7) + Statics.field2594;
                    int var94 = field975.method2872();
                    int var95 = field975.method2870();
                    int var96 = field975.method2872();
                    if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                        int var97 = var92 * 128 + 64;
                        int var98 = var93 * 128 + 64;
                        class85 var99 = new class85(var94, Statics.field2158, var97, var98, method132(var97, var98, Statics.field2158) - var95, var96, field938);
                        field1173.method3289(var99);
                    }
                } else if (field977 == 97) {
                    int var100 = field975.method2897();
                    int var101 = var100 >> 2;
                    int var102 = var100 & 0x3;
                    int var103 = field1023[var101];
                    int var104 = field975.method2897();
                    int var105 = (var104 >> 4 & 0x7) + Statics.field1419;
                    int var106 = (var104 & 0x7) + Statics.field2594;
                    if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                        method2807(Statics.field2158, var105, var106, var103, -1, var101, var102, 0, -1);
                    }
                } else if (field977 == 73) {
                    int var107 = field975.method2870();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field1419;
                    int var109 = (var107 & 0x7) + Statics.field2594;
                    int var110 = field975.method2872();
                    int var111 = field975.method2872();
                    int var112 = field975.method2872();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        class194 var113 = field939[Statics.field2158][var108][var109];
                        if (var113 != null) {
                            for (class95 var114 = (class95) var113.method3294(); var114 != null; var114 = (class95) var113.method3296()) {
                                if ((var110 & 0x7FFF) == var114.field1499 && var114.field1500 == var111) {
                                    var114.field1500 = var112;
                                    break;
                                }
                            }
                            method1436(var108, var109);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ft.gc(IIIIIIIIIB)V")
    public static final void method2807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field980.method3294(); var10 != null; var10 = (class77) field980.method3296()) {
            if (var10.field1226 == arg0 && var10.field1218 == arg1 && var10.field1225 == arg2 && var10.field1217 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1226 = arg0;
            var9.field1217 = arg3;
            var9.field1218 = arg1;
            var9.field1225 = arg2;
            method974(var9);
            field980.method3289(var9);
        }
        var9.field1228 = arg4;
        var9.field1216 = arg5;
        var9.field1224 = arg6;
        var9.field1220 = arg7;
        var9.field1227 = arg8;
    }

    @ObfuscatedName("aq.gn(S)V")
    public static final void method608() {
        for (class77 var0 = (class77) field980.method3294(); var0 != null; var0 = (class77) field980.method3296()) {
            if (var0.field1227 == -1) {
                var0.field1220 = 0;
                method974(var0);
            } else {
                var0.method3278();
            }
        }
    }

    @ObfuscatedName("ba.gj(Lbc;I)V")
    public static final void method974(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1217 == 0) {
            var1 = Statics.field7.method2485(arg0.field1226, arg0.field1218, arg0.field1225);
        }
        if (arg0.field1217 == 1) {
            var1 = Statics.field7.method2482(arg0.field1226, arg0.field1218, arg0.field1225);
        }
        if (arg0.field1217 == 2) {
            var1 = Statics.field7.method2483(arg0.field1226, arg0.field1218, arg0.field1225);
        }
        if (arg0.field1217 == 3) {
            var1 = Statics.field7.method2484(arg0.field1226, arg0.field1218, arg0.field1225);
        }
        if (var1 != 0) {
            int var5 = Statics.field7.method2616(arg0.field1226, arg0.field1218, arg0.field1225, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1223 = var2;
        arg0.field1222 = var3;
        arg0.field1221 = var4;
    }

    @ObfuscatedName("hr.gy(I)V")
    public static final void method3742() {
        for (class77 var0 = (class77) field980.method3294(); var0 != null; var0 = (class77) field980.method3296()) {
            if (var0.field1227 > 0) {
                var0.field1227--;
            }
            if (var0.field1227 == 0) {
                if (var0.field1223 >= 0) {
                    int var1 = var0.field1223;
                    int var2 = var0.field1222;
                    class256 var3 = Statics.method3743(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4177(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1711(var0.field1226, var0.field1217, var0.field1218, var0.field1225, var0.field1223, var0.field1221, var0.field1222);
                var0.method3278();
            } else {
                if (var0.field1220 > 0) {
                    var0.field1220--;
                }
                if (var0.field1220 == 0 && var0.field1218 >= 1 && var0.field1225 >= 1 && var0.field1218 <= 102 && var0.field1225 <= 102) {
                    if (var0.field1228 >= 0) {
                        int var5 = var0.field1228;
                        int var6 = var0.field1216;
                        class256 var7 = Statics.method3743(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method4177(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1711(var0.field1226, var0.field1217, var0.field1218, var0.field1225, var0.field1228, var0.field1224, var0.field1216);
                    var0.field1220 = -1;
                    if (var0.field1228 == var0.field1223 && var0.field1223 == -1) {
                        var0.method3278();
                    } else if (var0.field1228 == var0.field1223 && var0.field1224 == var0.field1221 && var0.field1222 == var0.field1216) {
                        var0.method3278();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ct.gw(IIIIIIII)V")
    public static final void method1711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1047 && Statics.field2158 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field7.method2485(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field7.method2482(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field7.method2483(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field7.method2484(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field7.method2616(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field7.method2553(arg0, arg2, arg3);
                class256 var15 = Statics.method3743(var12);
                if (var15.field3472 != 0) {
                    field991[arg0].method2761(arg2, arg3, var13, var14, var15.field3451);
                }
            }
            if (arg1 == 1) {
                Statics.field7.method2473(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field7.method2603(arg0, arg2, arg3);
                class256 var16 = Statics.method3743(var12);
                if (var16.field3469 + arg2 > 103 || var16.field3469 + arg3 > 103 || var16.field3449 + arg2 > 103 || var16.field3449 + arg3 > 103) {
                    return;
                }
                if (var16.field3472 != 0) {
                    field991[arg0].method2762(arg2, arg3, var16.field3469, var16.field3449, var14, var16.field3451);
                }
            }
            if (arg1 == 3) {
                Statics.field7.method2475(arg0, arg2, arg3);
                class256 var17 = Statics.method3743(var12);
                if (var17.field3472 == 1) {
                    field991[arg0].method2764(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field769[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method1405(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field7, field991[arg0]);
    }

    @ObfuscatedName("ck.go(III)V")
    public static final void method1436(int arg0, int arg1) {
        class194 var2 = field939[Statics.field2158][arg0][arg1];
        if (var2 == null) {
            Statics.field7.method2476(Statics.field2158, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3294(); var6 != null; var6 = (class95) var2.method3296()) {
            class257 var7 = class257.method2996(var6.field1499);
            long var8 = (long) var7.field3505;
            if (var7.field3504 == 1) {
                var8 = (long) (var6.field1500 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field7.method2476(Statics.field2158, arg0, arg1);
            return;
        }
        var2.method3290(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3294(); var12 != null; var12 = (class95) var2.method3296()) {
            if (var5.field1499 != var12.field1499) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1499 != var12.field1499 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field7.method2462(Statics.field2158, arg0, arg1, method132(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2158), var5, var13, var10, var11);
    }

    @ObfuscatedName("an.gh(ZI)V")
    public static final void method206(boolean arg0) {
        field1054 = 0;
        field971 = 0;
        Statics.method3762();
        method976(arg0);
        for (int var1 = 0; var1 < field971; var1++) {
            int var2 = field972[var1];
            class87 var3 = field968[var2];
            int var4 = field975.method2870();
            if ((var4 & 0x10) != 0) {
                int var5 = field975.method2897();
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = field975.method2883();
                        if (var10 == 32767) {
                            var10 = field975.method2883();
                            var8 = field975.method2883();
                            var7 = field975.method2883();
                            var9 = field975.method2883();
                        } else if (var10 == 32766) {
                            var10 = -1;
                        } else {
                            var8 = field975.method2883();
                        }
                        int var11 = field975.method2883();
                        var3.method1387(var10, var8, var7, var9, field938, var11);
                    }
                }
                int var12 = field975.method2898();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = field975.method2883();
                        int var15 = field975.method2883();
                        if (var15 == 32767) {
                            var3.method1394(var14);
                        } else {
                            int var16 = field975.method2883();
                            int var17 = field975.method3043();
                            int var18 = var15 > 0 ? field975.method3043() : var17;
                            var3.method1399(var14, field938, var15, var16, var17, var18);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                int var19 = field975.method2906();
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = field975.method2897();
                if (var3.field1247 == var19 && var19 != -1) {
                    int var21 = class261.method3748(var19).field3616;
                    if (var21 == 1) {
                        var3.field1276 = 0;
                        var3.field1261 = 0;
                        var3.field1278 = var20;
                        var3.field1279 = 0;
                    }
                    if (var21 == 2) {
                        var3.field1279 = 0;
                    }
                } else if (var19 == -1 || var3.field1247 == -1 || class261.method3748(var19).field3610 >= class261.method3748(var3.field1247).field3610) {
                    var3.field1247 = var19;
                    var3.field1276 = 0;
                    var3.field1261 = 0;
                    var3.field1278 = var20;
                    var3.field1279 = 0;
                    var3.field1302 = var3.field1264;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var22 = field975.method2872();
                int var23 = field975.method2872();
                int var24 = var3.field1275 - (var22 - Statics.field562 - Statics.field562) * 64;
                int var25 = var3.field1244 - (var23 - Statics.field387 - Statics.field387) * 64;
                if (var24 != 0 || var25 != 0) {
                    var3.field1271 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1280 = field975.method2872();
                int var26 = field975.method2875();
                var3.field1303 = var26 >> 16;
                var3.field1297 = (var26 & 0xFFFF) + field938;
                var3.field1281 = 0;
                var3.field1282 = 0;
                if (var3.field1297 > field938) {
                    var3.field1281 = -1;
                }
                if (var3.field1280 == 65535) {
                    var3.field1280 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1396 = class259.method3724(field975.method2907());
                var3.field1269 = var3.field1396.field3578;
                var3.field1296 = var3.field1396.field3575;
                var3.field1243 = var3.field1396.field3558;
                var3.field1300 = var3.field1396.field3579;
                var3.field1289 = var3.field1396.field3561;
                var3.field1254 = var3.field1396.field3546;
                var3.field1284 = var3.field1396.field3551;
                var3.field1249 = var3.field1396.field3556;
                var3.field1250 = var3.field1396.field3557;
            }
            if ((var4 & 0x2) != 0) {
                var3.field1294 = field975.method2905();
                if (var3.field1294 == 65535) {
                    var3.field1294 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1256 = field975.method2878();
                var3.field1259 = 100;
            }
        }
        for (int var27 = 0; var27 < field1054; var27++) {
            int var28 = field1077[var27];
            if (field938 != field968[var28].field1277) {
                field968[var28].field1396 = null;
                field968[var28] = null;
            }
        }
        if (field943 != field975.field2407) {
            throw new RuntimeException(field975.field2407 + class89.field1410 + field943);
        }
        for (int var29 = 0; var29 < field969; var29++) {
            if (field968[field951[var29]] == null) {
                throw new RuntimeException(var29 + class89.field1410 + field969);
            }
        }
    }

    @ObfuscatedName("bw.gk(ZI)V")
    public static final void method976(boolean arg0) {
        while (true) {
            if (field975.method3110(field943) >= 27) {
                int var1 = field975.method3115(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field968[var1] == null) {
                        field968[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field968[var1];
                    field951[++field969 - 1] = var1;
                    var3.field1277 = field938;
                    int var4 = field975.method3115(1);
                    if (var4 == 1) {
                        field972[++field971 - 1] = var1;
                    }
                    int var5;
                    if (arg0) {
                        var5 = field975.method3115(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field975.method3115(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field975.method3115(1);
                    int var7 = field1059[field975.method3115(3)];
                    if (var2) {
                        var3.field1260 = var3.field1245 = var7;
                    }
                    var3.field1396 = class259.method3724(field975.method3115(14));
                    int var8;
                    if (arg0) {
                        var8 = field975.method3115(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field975.method3115(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field1269 = var3.field1396.field3578;
                    var3.field1296 = var3.field1396.field3575;
                    if (var3.field1296 == 0) {
                        var3.field1245 = 0;
                    }
                    var3.field1243 = var3.field1396.field3558;
                    var3.field1300 = var3.field1396.field3579;
                    var3.field1289 = var3.field1396.field3561;
                    var3.field1254 = var3.field1396.field3546;
                    var3.field1284 = var3.field1396.field3551;
                    var3.field1249 = var3.field1396.field3556;
                    var3.field1250 = var3.field1396.field3557;
                    var3.method1551(Statics.field1321.field1298[0] + var8, Statics.field1321.field1299[0] + var5, var6 == 1);
                    continue;
                }
            }
            field975.method3109();
            return;
        }
    }

    @ObfuscatedName("ab.gr(Lbm;IIBI)V")
    public static final void method443(class75 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1298[0];
        int var5 = arg0.field1299[0];
        int var6 = arg0.method1022();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1022();
        class164 var8 = method3581(arg1, arg2);
        class162 var9 = field991[arg0.field912];
        int[] var10 = field1209;
        int[] var11 = field1210;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class163.field2330[var12][var13] = 0;
                class163.field2323[var12][var13] = 99999999;
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
            class163.field2330[var16][var17] = 99;
            class163.field2323[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class163.field2326[var20] = var4;
            int var93 = var20 + 1;
            class163.field2327[var20] = var5;
            int[][] var22 = var9.field2320;
            boolean var27;
            while (true) {
                if (var93 == var21) {
                    Statics.field3668 = var14;
                    Statics.field513 = var15;
                    var27 = false;
                    break;
                }
                var14 = class163.field2326[var21];
                var15 = class163.field2327[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field2315;
                int var26 = var15 - var9.field2316;
                if (var8.method1001(1, var14, var15, var9)) {
                    Statics.field3668 = var14;
                    Statics.field513 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class163.field2323[var23][var24] + 1;
                if (var23 > 0 && class163.field2330[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class163.field2326[var93] = var14 - 1;
                    class163.field2327[var93] = var15;
                    var93 = var93 + 1 & 0xFFF;
                    class163.field2330[var23 - 1][var24] = 2;
                    class163.field2323[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class163.field2330[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class163.field2326[var93] = var14 + 1;
                    class163.field2327[var93] = var15;
                    var93 = var93 + 1 & 0xFFF;
                    class163.field2330[var23 + 1][var24] = 8;
                    class163.field2323[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class163.field2330[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class163.field2326[var93] = var14;
                    class163.field2327[var93] = var15 - 1;
                    var93 = var93 + 1 & 0xFFF;
                    class163.field2330[var23][var24 - 1] = 1;
                    class163.field2323[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class163.field2330[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class163.field2326[var93] = var14;
                    class163.field2327[var93] = var15 + 1;
                    var93 = var93 + 1 & 0xFFF;
                    class163.field2330[var23][var24 + 1] = 4;
                    class163.field2323[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class163.field2330[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class163.field2326[var93] = var14 - 1;
                    class163.field2327[var93] = var15 - 1;
                    var93 = var93 + 1 & 0xFFF;
                    class163.field2330[var23 - 1][var24 - 1] = 3;
                    class163.field2323[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class163.field2330[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class163.field2326[var93] = var14 + 1;
                    class163.field2327[var93] = var15 - 1;
                    var93 = var93 + 1 & 0xFFF;
                    class163.field2330[var23 + 1][var24 - 1] = 9;
                    class163.field2323[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class163.field2330[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class163.field2326[var93] = var14 - 1;
                    class163.field2327[var93] = var15 + 1;
                    var93 = var93 + 1 & 0xFFF;
                    class163.field2330[var23 - 1][var24 + 1] = 6;
                    class163.field2323[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class163.field2330[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class163.field2326[var93] = var14 + 1;
                    class163.field2327[var93] = var15 + 1;
                    var93 = var93 + 1 & 0xFFF;
                    class163.field2330[var23 + 1][var24 + 1] = 12;
                    class163.field2323[var23 + 1][var24 + 1] = var28;
                }
            }
            var29 = var27;
        } else if (var7 == 2) {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class163.field2330[var32][var33] = 99;
            class163.field2323[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class163.field2326[var36] = var4;
            int var94 = var36 + 1;
            class163.field2327[var36] = var5;
            int[][] var38 = var9.field2320;
            boolean var43;
            while (true) {
                if (var94 == var37) {
                    Statics.field3668 = var30;
                    Statics.field513 = var31;
                    var43 = false;
                    break;
                }
                var30 = class163.field2326[var37];
                var31 = class163.field2327[var37];
                var37 = var37 + 1 & 0xFFF;
                int var39 = var30 - var34;
                int var40 = var31 - var35;
                int var41 = var30 - var9.field2315;
                int var42 = var31 - var9.field2316;
                if (var8.method1001(2, var30, var31, var9)) {
                    Statics.field3668 = var30;
                    Statics.field513 = var31;
                    var43 = true;
                    break;
                }
                int var44 = class163.field2323[var39][var40] + 1;
                if (var39 > 0 && class163.field2330[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var42 + 1] & 0x1240138) == 0) {
                    class163.field2326[var94] = var30 - 1;
                    class163.field2327[var94] = var31;
                    var94 = var94 + 1 & 0xFFF;
                    class163.field2330[var39 - 1][var40] = 2;
                    class163.field2323[var39 - 1][var40] = var44;
                }
                if (var39 < 126 && class163.field2330[var39 + 1][var40] == 0 && (var38[var41 + 2][var42] & 0x1240183) == 0 && (var38[var41 + 2][var42 + 1] & 0x12401E0) == 0) {
                    class163.field2326[var94] = var30 + 1;
                    class163.field2327[var94] = var31;
                    var94 = var94 + 1 & 0xFFF;
                    class163.field2330[var39 + 1][var40] = 8;
                    class163.field2323[var39 + 1][var40] = var44;
                }
                if (var40 > 0 && class163.field2330[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var41 + 1][var42 - 1] & 0x1240183) == 0) {
                    class163.field2326[var94] = var30;
                    class163.field2327[var94] = var31 - 1;
                    var94 = var94 + 1 & 0xFFF;
                    class163.field2330[var39][var40 - 1] = 1;
                    class163.field2323[var39][var40 - 1] = var44;
                }
                if (var40 < 126 && class163.field2330[var39][var40 + 1] == 0 && (var38[var41][var42 + 2] & 0x1240138) == 0 && (var38[var41 + 1][var42 + 2] & 0x12401E0) == 0) {
                    class163.field2326[var94] = var30;
                    class163.field2327[var94] = var31 + 1;
                    var94 = var94 + 1 & 0xFFF;
                    class163.field2330[var39][var40 + 1] = 4;
                    class163.field2323[var39][var40 + 1] = var44;
                }
                if (var39 > 0 && var40 > 0 && class163.field2330[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42] & 0x124013E) == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0 && (var38[var41][var42 - 1] & 0x124018F) == 0) {
                    class163.field2326[var94] = var30 - 1;
                    class163.field2327[var94] = var31 - 1;
                    var94 = var94 + 1 & 0xFFF;
                    class163.field2330[var39 - 1][var40 - 1] = 3;
                    class163.field2323[var39 - 1][var40 - 1] = var44;
                }
                if (var39 < 126 && var40 > 0 && class163.field2330[var39 + 1][var40 - 1] == 0 && (var38[var41 + 1][var42 - 1] & 0x124018F) == 0 && (var38[var41 + 2][var42 - 1] & 0x1240183) == 0 && (var38[var41 + 2][var42] & 0x12401E3) == 0) {
                    class163.field2326[var94] = var30 + 1;
                    class163.field2327[var94] = var31 - 1;
                    var94 = var94 + 1 & 0xFFF;
                    class163.field2330[var39 + 1][var40 - 1] = 9;
                    class163.field2323[var39 + 1][var40 - 1] = var44;
                }
                if (var39 > 0 && var40 < 126 && class163.field2330[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var42 + 1] & 0x124013E) == 0 && (var38[var41 - 1][var42 + 2] & 0x1240138) == 0 && (var38[var41][var42 + 2] & 0x12401F8) == 0) {
                    class163.field2326[var94] = var30 - 1;
                    class163.field2327[var94] = var31 + 1;
                    var94 = var94 + 1 & 0xFFF;
                    class163.field2330[var39 - 1][var40 + 1] = 6;
                    class163.field2323[var39 - 1][var40 + 1] = var44;
                }
                if (var39 < 126 && var40 < 126 && class163.field2330[var39 + 1][var40 + 1] == 0 && (var38[var41 + 1][var42 + 2] & 0x12401F8) == 0 && (var38[var41 + 2][var42 + 2] & 0x12401E0) == 0 && (var38[var41 + 2][var42 + 1] & 0x12401E3) == 0) {
                    class163.field2326[var94] = var30 + 1;
                    class163.field2327[var94] = var31 + 1;
                    var94 = var94 + 1 & 0xFFF;
                    class163.field2330[var39 + 1][var40 + 1] = 12;
                    class163.field2323[var39 + 1][var40 + 1] = var44;
                }
            }
            var29 = var43;
        } else {
            int var45 = var4;
            int var46 = var5;
            byte var47 = 64;
            byte var48 = 64;
            int var49 = var4 - var47;
            int var50 = var5 - var48;
            class163.field2330[var47][var48] = 99;
            class163.field2323[var47][var48] = 0;
            byte var51 = 0;
            int var52 = 0;
            class163.field2326[var51] = var4;
            int var95 = var51 + 1;
            class163.field2327[var51] = var5;
            int[][] var53 = var9.field2320;
            boolean var58;
            label643: while (true) {
                label641: while (true) {
                    int var54;
                    int var55;
                    int var56;
                    int var57;
                    int var59;
                    do {
                        do {
                            do {
                                label618: do {
                                    if (var95 == var52) {
                                        Statics.field3668 = var45;
                                        Statics.field513 = var46;
                                        var58 = false;
                                        break label643;
                                    }
                                    var45 = class163.field2326[var52];
                                    var46 = class163.field2327[var52];
                                    var52 = var52 + 1 & 0xFFF;
                                    var54 = var45 - var49;
                                    var55 = var46 - var50;
                                    var56 = var45 - var9.field2315;
                                    var57 = var46 - var9.field2316;
                                    if (var8.method1001(var7, var45, var46, var9)) {
                                        Statics.field3668 = var45;
                                        Statics.field513 = var46;
                                        var58 = true;
                                        break label643;
                                    }
                                    var59 = class163.field2323[var54][var55] + 1;
                                    if (var54 > 0 && class163.field2330[var54 - 1][var55] == 0 && (var53[var56 - 1][var57] & 0x124010E) == 0 && (var53[var56 - 1][var7 + var57 - 1] & 0x1240138) == 0) {
                                        int var60 = 1;
                                        while (true) {
                                            if (var60 >= var7 - 1) {
                                                class163.field2326[var95] = var45 - 1;
                                                class163.field2327[var95] = var46;
                                                var95 = var95 + 1 & 0xFFF;
                                                class163.field2330[var54 - 1][var55] = 2;
                                                class163.field2323[var54 - 1][var55] = var59;
                                                break;
                                            }
                                            if ((var53[var56 - 1][var57 + var60] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var60++;
                                        }
                                    }
                                    if (var54 < 128 - var7 && class163.field2330[var54 + 1][var55] == 0 && (var53[var7 + var56][var57] & 0x1240183) == 0 && (var53[var7 + var56][var7 + var57 - 1] & 0x12401E0) == 0) {
                                        int var61 = 1;
                                        while (true) {
                                            if (var61 >= var7 - 1) {
                                                class163.field2326[var95] = var45 + 1;
                                                class163.field2327[var95] = var46;
                                                var95 = var95 + 1 & 0xFFF;
                                                class163.field2330[var54 + 1][var55] = 8;
                                                class163.field2323[var54 + 1][var55] = var59;
                                                break;
                                            }
                                            if ((var53[var7 + var56][var57 + var61] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var61++;
                                        }
                                    }
                                    if (var55 > 0 && class163.field2330[var54][var55 - 1] == 0 && (var53[var56][var57 - 1] & 0x124010E) == 0 && (var53[var7 + var56 - 1][var57 - 1] & 0x1240183) == 0) {
                                        int var62 = 1;
                                        while (true) {
                                            if (var62 >= var7 - 1) {
                                                class163.field2326[var95] = var45;
                                                class163.field2327[var95] = var46 - 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class163.field2330[var54][var55 - 1] = 1;
                                                class163.field2323[var54][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 + var62][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var62++;
                                        }
                                    }
                                    if (var55 < 128 - var7 && class163.field2330[var54][var55 + 1] == 0 && (var53[var56][var7 + var57] & 0x1240138) == 0 && (var53[var7 + var56 - 1][var7 + var57] & 0x12401E0) == 0) {
                                        int var63 = 1;
                                        while (true) {
                                            if (var63 >= var7 - 1) {
                                                class163.field2326[var95] = var45;
                                                class163.field2327[var95] = var46 + 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class163.field2330[var54][var55 + 1] = 4;
                                                class163.field2323[var54][var55 + 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 + var63][var7 + var57] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var63++;
                                        }
                                    }
                                    if (var54 > 0 && var55 > 0 && class163.field2330[var54 - 1][var55 - 1] == 0 && (var53[var56 - 1][var57 - 1] & 0x124010E) == 0) {
                                        int var64 = 1;
                                        while (true) {
                                            if (var64 >= var7) {
                                                class163.field2326[var95] = var45 - 1;
                                                class163.field2327[var95] = var46 - 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class163.field2330[var54 - 1][var55 - 1] = 3;
                                                class163.field2323[var54 - 1][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 - 1][var57 - 1 + var64] & 0x124013E) != 0 || (var53[var56 - 1 + var64][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var64++;
                                        }
                                    }
                                    if (var54 < 128 - var7 && var55 > 0 && class163.field2330[var54 + 1][var55 - 1] == 0 && (var53[var7 + var56][var57 - 1] & 0x1240183) == 0) {
                                        int var65 = 1;
                                        while (true) {
                                            if (var65 >= var7) {
                                                class163.field2326[var95] = var45 + 1;
                                                class163.field2327[var95] = var46 - 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class163.field2330[var54 + 1][var55 - 1] = 9;
                                                class163.field2323[var54 + 1][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var7 + var56][var57 - 1 + var65] & 0x12401E3) != 0 || (var53[var56 + var65][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var65++;
                                        }
                                    }
                                    if (var54 > 0 && var55 < 128 - var7 && class163.field2330[var54 - 1][var55 + 1] == 0 && (var53[var56 - 1][var7 + var57] & 0x1240138) == 0) {
                                        for (int var66 = 1; var66 < var7; var66++) {
                                            if ((var53[var56 - 1][var57 + var66] & 0x124013E) != 0 || (var53[var56 - 1 + var66][var7 + var57] & 0x12401F8) != 0) {
                                                continue label618;
                                            }
                                        }
                                        class163.field2326[var95] = var45 - 1;
                                        class163.field2327[var95] = var46 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class163.field2330[var54 - 1][var55 + 1] = 6;
                                        class163.field2323[var54 - 1][var55 + 1] = var59;
                                    }
                                } while (var54 >= 128 - var7);
                            } while (var55 >= 128 - var7);
                        } while (class163.field2330[var54 + 1][var55 + 1] != 0);
                    } while ((var53[var7 + var56][var7 + var57] & 0x12401E0) != 0);
                    for (int var67 = 1; var67 < var7; var67++) {
                        if ((var53[var56 + var67][var7 + var57] & 0x12401F8) != 0 || (var53[var7 + var56][var57 + var67] & 0x12401E3) != 0) {
                            continue label641;
                        }
                    }
                    class163.field2326[var95] = var45 + 1;
                    class163.field2327[var95] = var46 + 1;
                    var95 = var95 + 1 & 0xFFF;
                    class163.field2330[var54 + 1][var55 + 1] = 12;
                    class163.field2323[var54 + 1][var55 + 1] = var59;
                }
            }
            var29 = var58;
        }
        int var86;
        label709: {
            int var68 = var4 - 64;
            int var69 = var5 - 64;
            int var70 = Statics.field3668;
            int var71 = Statics.field513;
            if (!var29) {
                int var72 = Integer.MAX_VALUE;
                int var73 = Integer.MAX_VALUE;
                byte var74 = 10;
                int var75 = var8.field2336;
                int var76 = var8.field2334;
                int var77 = var8.field2335;
                int var78 = var8.field2333;
                for (int var79 = var75 - var74; var79 <= var74 + var75; var79++) {
                    for (int var80 = var76 - var74; var80 <= var74 + var76; var80++) {
                        int var81 = var79 - var68;
                        int var82 = var80 - var69;
                        if (var81 >= 0 && var82 >= 0 && var81 < 128 && var82 < 128 && class163.field2323[var81][var82] < 100) {
                            int var83 = 0;
                            if (var79 < var75) {
                                var83 = var75 - var79;
                            } else if (var79 > var75 + var77 - 1) {
                                var83 = var79 - (var75 + var77 - 1);
                            }
                            int var84 = 0;
                            if (var80 < var76) {
                                var84 = var76 - var80;
                            } else if (var80 > var76 + var78 - 1) {
                                var84 = var80 - (var76 + var78 - 1);
                            }
                            int var85 = var83 * var83 + var84 * var84;
                            if (var85 < var72 || var72 == var85 && class163.field2323[var81][var82] < var73) {
                                var72 = var85;
                                var73 = class163.field2323[var81][var82];
                                var70 = var79;
                                var71 = var80;
                            }
                        }
                    }
                }
                if (var72 == Integer.MAX_VALUE) {
                    var86 = -1;
                    break label709;
                }
            }
            if (var4 == var70 && var5 == var71) {
                var86 = 0;
            } else {
                byte var87 = 0;
                class163.field2326[var87] = var70;
                int var96 = var87 + 1;
                class163.field2327[var87] = var71;
                int var88;
                int var89 = var88 = class163.field2330[var70 - var68][var71 - var69];
                while (var4 != var70 || var5 != var71) {
                    if (var88 != var89) {
                        var88 = var89;
                        class163.field2326[var96] = var70;
                        class163.field2327[var96++] = var71;
                    }
                    if ((var89 & 0x2) != 0) {
                        var70++;
                    } else if ((var89 & 0x8) != 0) {
                        var70--;
                    }
                    if ((var89 & 0x1) != 0) {
                        var71++;
                    } else if ((var89 & 0x4) != 0) {
                        var71--;
                    }
                    var89 = class163.field2330[var70 - var68][var71 - var69];
                }
                int var90 = 0;
                while (var96-- > 0) {
                    var10[var90] = class163.field2326[var96];
                    var11[var90++] = class163.field2327[var96];
                    if (var90 >= var10.length) {
                        break;
                    }
                }
                var86 = var90;
            }
        }
        int var91 = var86;
        if (var86 >= 1) {
            for (int var92 = 0; var92 < var91 - 1; var92++) {
                arg0.method1017(field1209[var92], field1210[var92], arg3);
            }
        }
    }

    @ObfuscatedName("he.ge(IIB)Lfq;")
    public static class164 method3581(int arg0, int arg1) {
        field934.field2336 = arg0;
        field934.field2334 = arg1;
        field934.field2335 = 1;
        field934.field2333 = 1;
        return field934;
    }

    @ObfuscatedName("fd.gp(B)V")
    public static final void method2798() {
        int var0 = Statics.field833;
        int var1 = Statics.field388;
        int var2 = Statics.field1536;
        int var3 = Statics.field40;
        int var4 = 6116423;
        class282.method4561(var0, var1, var2, var3, var4);
        class282.method4561(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class282.method4583(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field923.method4383(class226.field3006, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field738;
        int var6 = class60.field739;
        for (int var7 = 0; var7 < field1204; var7++) {
            int var8 = (field1204 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field923.method4383(method913(var7), var0 + 3, var8, var9, 0);
        }
        method1598(Statics.field833, Statics.field388, Statics.field1536, Statics.field40);
    }

    @ObfuscatedName("aj.gx(IIIII)V")
    public static final void method605(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1134; var4++) {
            if (field1141[var4] + field1139[var4] > arg0 && field1139[var4] < arg0 + arg2 && field1140[var4] + field1053[var4] > arg1 && field1140[var4] < arg1 + arg3) {
                field1136[var4] = true;
            }
        }
    }

    @ObfuscatedName("ci.ga(IIIII)V")
    public static final void method1598(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1134; var4++) {
            if (field1141[var4] + field1139[var4] > arg0 && field1139[var4] < arg0 + arg2 && field1140[var4] + field1053[var4] > arg1 && field1140[var4] < arg1 + arg3) {
                field1137[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hz(S)V")
    public final void method1164() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field1204 - 1; var2++) {
                if (field1178[var2] < 1000 && field1178[var2 + 1] > 1000) {
                    String var3 = field1199[var2];
                    field1199[var2] = field1199[var2 + 1];
                    field1199[var2 + 1] = var3;
                    String var4 = field1075[var2];
                    field1075[var2] = field1075[var2 + 1];
                    field1075[var2 + 1] = var4;
                    int var5 = field1178[var2];
                    field1178[var2] = field1178[var2 + 1];
                    field1178[var2 + 1] = var5;
                    int var6 = field1071[var2];
                    field1071[var2] = field1071[var2 + 1];
                    field1071[var2 + 1] = var6;
                    int var7 = field1072[var2];
                    field1072[var2] = field1072[var2 + 1];
                    field1072[var2 + 1] = var7;
                    int var8 = field1074[var2];
                    field1074[var2] = field1074[var2 + 1];
                    field1074[var2 + 1] = var8;
                    if (field1091 != -1) {
                        if (field1091 == var2) {
                            field1091 = var2 + 1;
                        } else if (field1091 == var2 + 1) {
                            field1091 = var2;
                        }
                    }
                    var1 = false;
                }
            }
        }
        if (Statics.field1886 != null || field1165 != null) {
            return;
        }
        int var9 = class60.field733;
        if (field1069) {
            if (var9 != 1 && (Statics.field3203 || var9 != 4)) {
                int var10 = class60.field738;
                int var11 = class60.field739;
                if (var10 < Statics.field833 - 10 || var10 > Statics.field833 + Statics.field1536 + 10 || var11 < Statics.field388 - 10 || var11 > Statics.field40 + Statics.field388 + 10) {
                    field1069 = false;
                    method605(Statics.field833, Statics.field388, Statics.field1536, Statics.field40);
                }
            }
            if (var9 == 1 || !Statics.field3203 && var9 == 4) {
                int var12 = Statics.field833;
                int var13 = Statics.field388;
                int var14 = Statics.field1536;
                int var15 = class60.field746;
                int var16 = class60.field751;
                int var17 = -1;
                for (int var18 = 0; var18 < field1204; var18++) {
                    int var19 = (field1204 - 1 - var18) * 15 + var13 + 31;
                    if (var15 > var12 && var15 < var12 + var14 && var16 > var19 - 13 && var16 < var19 + 3) {
                        var17 = var18;
                    }
                }
                if (var17 != -1 && var17 >= 0) {
                    int var20 = field1071[var17];
                    int var21 = field1072[var17];
                    int var22 = field1178[var17];
                    int var23 = field1074[var17];
                    String var24 = field1075[var17];
                    String var25 = field1199[var17];
                    method606(var20, var21, var22, var23, var24, var25, class60.field746, class60.field751);
                }
                field1069 = false;
                method605(Statics.field833, Statics.field388, Statics.field1536, Statics.field40);
            }
            return;
        }
        int var26 = method971();
        if ((var9 == 1 || !Statics.field3203 && var9 == 4) && var26 >= 0) {
            int var27 = field1178[var26];
            if (var27 == 39 || var27 == 40 || var27 == 41 || var27 == 42 || var27 == 43 || var27 == 33 || var27 == 34 || var27 == 35 || var27 == 36 || var27 == 37 || var27 == 38 || var27 == 1005) {
                int var28 = field1071[var26];
                int var29 = field1072[var26];
                class217 var30 = class217.method192(var29);
                if (class218.method2657(Statics.method3573(var30)) || class218.method609(Statics.method3573(var30))) {
                    if (Statics.field1886 != null && !field959) {
                        int var31 = method971();
                        if (field1068 != 1 && !method646(var31) && field1204 > 0) {
                            int var32 = field1045;
                            int var33 = field1082;
                            class90 var34 = Statics.field320;
                            method606(var34.field1429, var34.field1422, var34.field1421, var34.field1424, var34.field1423, var34.field1423, var32, var33);
                            Statics.field320 = null;
                        }
                    }
                    field959 = false;
                    field1206 = 0;
                    if (Statics.field1886 != null) {
                        method162(Statics.field1886);
                    }
                    Statics.field1886 = class217.method192(var29);
                    field1044 = var28;
                    field1045 = class60.field746;
                    field1082 = class60.field751;
                    if (var26 >= 0) {
                        Statics.field320 = new class90();
                        Statics.field320.field1429 = field1071[var26];
                        Statics.field320.field1422 = field1072[var26];
                        Statics.field320.field1421 = field1178[var26];
                        Statics.field320.field1424 = field1074[var26];
                        Statics.field320.field1423 = field1075[var26];
                    }
                    method162(Statics.field1886);
                    return;
                }
            }
        }
        if (var9 == 1 || !Statics.field3203 && var9 == 4) {
            label251: {
                label165: {
                    if (field1068 == 1 && field1204 > 2) {
                        boolean var35;
                        if (field1204 <= 0) {
                            var35 = false;
                        } else if (field1079 && class51.field646[81] && field1091 != -1) {
                            var35 = true;
                        } else {
                            var35 = false;
                        }
                        if (!var35) {
                            break label165;
                        }
                    }
                    if (!method646(var26)) {
                        break label251;
                    }
                }
                var9 = 2;
            }
        }
        if ((var9 == 1 || !Statics.field3203 && var9 == 4) && field1204 > 0 && var26 >= 0) {
            int var36 = field1071[var26];
            int var37 = field1072[var26];
            int var38 = field1178[var26];
            int var39 = field1074[var26];
            String var40 = field1075[var26];
            String var41 = field1199[var26];
            method606(var36, var37, var38, var39, var40, var41, class60.field746, class60.field751);
        }
        if (var9 == 2 && field1204 > 0) {
            this.method1208(class60.field746, class60.field751);
        }
    }

    @ObfuscatedName("client.hj(III)V")
    public final void method1208(int arg0, int arg1) {
        int var3 = Statics.field923.method4374(class226.field3006);
        for (int var4 = 0; var4 < field1204; var4++) {
            class264 var5 = Statics.field923;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1199[var4].length() > 0) {
                var6 = field1075[var4] + class226.field2861 + field1199[var4];
            } else {
                var6 = field1075[var4];
            }
            int var7 = var5.method4374(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field1204 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field2021) {
            var9 = Statics.field2021 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field312) {
            var10 = Statics.field312 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field7.method2527(Statics.field2158, arg0, arg1, false);
        field1069 = true;
        Statics.field833 = var9;
        Statics.field388 = var10;
        Statics.field1536 = var3;
        Statics.field40 = field1204 * 15 + 22;
    }

    @ObfuscatedName("am.hw(IB)Z")
    public static final boolean method646(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field1178[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("aj.he(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method606(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 17) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(149);
            field973.method2899(class51.field646[82] ? 1 : 0);
            field973.method2856(field1087);
            field973.method2904(Statics.field562 + arg0);
            field973.method3012(Statics.field1529);
            field973.method2861(arg3);
            field973.method2956(Statics.field387 + arg1);
        }
        if (arg2 == 26) {
            method226();
        }
        if (arg2 == 39) {
            field973.method3105(180);
            field973.method2856(arg3);
            field973.method2912(arg1);
            field973.method2856(arg0);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 1003) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            class87 var8 = field968[arg3];
            if (var8 != null) {
                class259 var9 = var8.field1396;
                if (var9.field3552 != null) {
                    var9 = var9.method4299();
                }
                if (var9 != null) {
                    field973.method3105(136);
                    field973.method2861(var9.field3550);
                }
            }
        }
        if (arg2 == 30 && field964 == null) {
            method3755(arg1, arg0);
            field964 = class217.method2132(arg1, arg0);
            method162(field964);
        }
        if (arg2 == 48) {
            class75 var10 = field1051[arg3];
            if (var10 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(192);
                field973.method2895(class51.field646[82] ? 1 : 0);
                field973.method2956(arg3);
            }
        }
        if (arg2 == 58) {
            class217 var11 = class217.method2132(arg1, arg0);
            if (var11 != null) {
                field973.method3105(206);
                field973.method3012(Statics.field1529);
                field973.method2956(field1087);
                field973.method2856(arg0);
                field973.method2871(arg1);
                field973.method2861(var11.field2674);
                field973.method2904(field1175);
            }
        }
        if (arg2 == 40) {
            field973.method3105(124);
            field973.method2956(arg3);
            field973.method2882(arg1);
            field973.method2956(arg0);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 2) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(55);
            field973.method2882(Statics.field1529);
            field973.method2904(arg3 >> 14 & 0x7FFF);
            field973.method2865(class51.field646[82] ? 1 : 0);
            field973.method2856(field1087);
            field973.method2856(Statics.field387 + arg1);
            field973.method2904(Statics.field562 + arg0);
        }
        if (arg2 == 19) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(251);
            field973.method2861(arg3);
            field973.method2861(Statics.field562 + arg0);
            field973.method2856(Statics.field387 + arg1);
            field973.method2899(class51.field646[82] ? 1 : 0);
        }
        if (arg2 == 25) {
            class217 var12 = class217.method2132(arg1, arg0);
            if (var12 != null) {
                method35();
                int var13 = Statics.method3573(var12);
                int var14 = var13 >> 11 & 0x3F;
                int var16 = var12.field2674;
                class217 var17 = class217.method2132(arg1, arg0);
                if (var17 != null && var17.field2774 != null) {
                    class70 var18 = new class70();
                    var18.field853 = var17;
                    var18.field850 = var17.field2774;
                    class84.method966(var18);
                }
                field1175 = var16;
                field1086 = true;
                Statics.field1529 = arg1;
                field1087 = arg0;
                Statics.field809 = var14;
                method162(var17);
                field1084 = 0;
                int var19 = Statics.method3573(var12);
                int var20 = var19 >> 11 & 0x3F;
                String var21;
                if (var20 == 0) {
                    var21 = null;
                } else if (var12.field2731 == null || var12.field2731.trim().length() == 0) {
                    var21 = null;
                } else {
                    var21 = var12.field2731;
                }
                field1089 = var21;
                if (field1089 == null) {
                    field1089 = "Null";
                }
                if (var12.field2651) {
                    field1090 = var12.field2725 + class89.method303(16777215);
                } else {
                    field1090 = class89.method303(65280) + var12.field2768 + class89.method303(16777215);
                }
            }
            return;
        }
        if (arg2 == 31) {
            field973.method3105(103);
            field973.method2856(Statics.field2304);
            field973.method2912(arg1);
            field973.method2904(arg3);
            field973.method2882(Statics.field2213);
            field973.method2904(arg0);
            field973.method2856(Statics.field1646);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 44) {
            class75 var22 = field1051[arg3];
            if (var22 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(181);
                field973.method2895(class51.field646[82] ? 1 : 0);
                field973.method2956(arg3);
            }
        }
        if (arg2 == 22) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(100);
            field973.method2956(arg3);
            field973.method2861(Statics.field387 + arg1);
            field973.method2861(Statics.field562 + arg0);
            field973.method2899(class51.field646[82] ? 1 : 0);
        }
        if (arg2 == 1002) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field973.method3105(155);
            field973.method2956(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 46) {
            class75 var23 = field1051[arg3];
            if (var23 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(62);
                field973.method2865(class51.field646[82] ? 1 : 0);
                field973.method2904(arg3);
            }
        }
        if (arg2 == 5) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(184);
            field973.method2904(arg3 >> 14 & 0x7FFF);
            field973.method2899(class51.field646[82] ? 1 : 0);
            field973.method2904(Statics.field562 + arg0);
            field973.method2856(Statics.field387 + arg1);
        }
        if (arg2 == 50) {
            class75 var24 = field1051[arg3];
            if (var24 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(85);
                field973.method2895(class51.field646[82] ? 1 : 0);
                field973.method2861(arg3);
            }
        }
        if (arg2 == 35) {
            field973.method3105(173);
            field973.method2856(arg3);
            field973.method2856(arg0);
            field973.method2912(arg1);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 36) {
            field973.method3105(21);
            field973.method2856(arg0);
            field973.method2912(arg1);
            field973.method2856(arg3);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 32) {
            field973.method3105(28);
            field973.method2871(arg1);
            field973.method3012(Statics.field1529);
            field973.method2856(field1087);
            field973.method2861(arg0);
            field973.method2956(arg3);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 20) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(19);
            field973.method2956(Statics.field387 + arg1);
            field973.method2865(class51.field646[82] ? 1 : 0);
            field973.method2856(arg3);
            field973.method2861(Statics.field562 + arg0);
        }
        if (arg2 == 21) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(36);
            field973.method2899(class51.field646[82] ? 1 : 0);
            field973.method2904(Statics.field562 + arg0);
            field973.method2956(Statics.field387 + arg1);
            field973.method2856(arg3);
        }
        if (arg2 == 1004) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field973.method3105(20);
            field973.method2904(arg3);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field15.method4852(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 45) {
            class75 var25 = field1051[arg3];
            if (var25 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(224);
                field973.method2894(class51.field646[82] ? 1 : 0);
                field973.method2861(arg3);
            }
        }
        if (arg2 == 41) {
            field973.method3105(243);
            field973.method2871(arg1);
            field973.method2904(arg3);
            field973.method2956(arg0);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 28) {
            field973.method3105(130);
            field973.method2871(arg1);
            class217 var26 = class217.method192(arg1);
            if (var26.field2772 != null && var26.field2772[0][0] == 5) {
                int var27 = var26.field2772[0][1];
                class212.field2609[var27] = 1 - class212.field2609[var27];
                method40(var27);
            }
        }
        if (arg2 == 49) {
            class75 var28 = field1051[arg3];
            if (var28 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(24);
                field973.method2956(arg3);
                field973.method2865(class51.field646[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field973.method3105(73);
            field973.method2956(arg3);
            field973.method2956(arg0);
            field973.method3012(arg1);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 15) {
            class75 var29 = field1051[arg3];
            if (var29 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(44);
                field973.method2895(class51.field646[82] ? 1 : 0);
                field973.method3012(Statics.field1529);
                field973.method2956(arg3);
                field973.method2856(field1087);
            }
        }
        if (arg2 == 51) {
            class75 var30 = field1051[arg3];
            if (var30 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(13);
                field973.method2899(class51.field646[82] ? 1 : 0);
                field973.method2861(arg3);
            }
        }
        if (arg2 == 6) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(172);
            field973.method2904(Statics.field387 + arg1);
            field973.method2856(Statics.field562 + arg0);
            field973.method2856(arg3 >> 14 & 0x7FFF);
            field973.method2894(class51.field646[82] ? 1 : 0);
        }
        if (arg2 == 4) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(113);
            field973.method2861(arg3 >> 14 & 0x7FFF);
            field973.method2856(Statics.field387 + arg1);
            field973.method2894(class51.field646[82] ? 1 : 0);
            field973.method2856(Statics.field562 + arg0);
        }
        if (arg2 == 38) {
            method35();
            class217 var31 = class217.method192(arg1);
            field1084 = 1;
            Statics.field2304 = arg0;
            Statics.field2213 = arg1;
            Statics.field1646 = arg3;
            method162(var31);
            field1085 = class89.method303(16748608) + class257.method2996(arg3).field3496 + class89.method303(16777215);
            if (field1085 == null) {
                field1085 = "null";
            }
            return;
        }
        if (arg2 == 24) {
            class217 var32 = class217.method192(arg1);
            boolean var33 = true;
            if (var32.field2656 > 0) {
                var33 = method306(var32);
            }
            if (var33) {
                field973.method3105(130);
                field973.method2871(arg1);
            }
        }
        if (arg2 == 12) {
            class87 var34 = field968[arg3];
            if (var34 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(242);
                field973.method2899(class51.field646[82] ? 1 : 0);
                field973.method2956(arg3);
            }
        }
        if (arg2 == 3) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(211);
            field973.method2904(Statics.field387 + arg1);
            field973.method2956(Statics.field562 + arg0);
            field973.method2899(class51.field646[82] ? 1 : 0);
            field973.method2856(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1001) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(191);
            field973.method2904(Statics.field387 + arg1);
            field973.method2904(Statics.field562 + arg0);
            field973.method2895(class51.field646[82] ? 1 : 0);
            field973.method2856(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 37) {
            field973.method3105(248);
            field973.method2882(arg1);
            field973.method2904(arg3);
            field973.method2861(arg0);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 11) {
            class87 var35 = field968[arg3];
            if (var35 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(2);
                field973.method2894(class51.field646[82] ? 1 : 0);
                field973.method2956(arg3);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var36 = class217.method2132(arg1, arg0);
            if (var36 != null) {
                int var37 = var36.field2674;
                class217 var38 = class217.method2132(arg1, arg0);
                if (var38 != null) {
                    if (var38.field2752 != null) {
                        class70 var39 = new class70();
                        var39.field853 = var38;
                        var39.field854 = arg3;
                        var39.field852 = arg5;
                        var39.field850 = var38.field2752;
                        class84.method966(var39);
                    }
                    boolean var40 = true;
                    if (var38.field2656 > 0) {
                        var40 = method306(var38);
                    }
                    if (var40 && class218.method126(Statics.method3573(var38), arg3 - 1)) {
                        if (arg3 == 1) {
                            field973.method3105(75);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                        if (arg3 == 2) {
                            field973.method3105(51);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                        if (arg3 == 3) {
                            field973.method3105(164);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                        if (arg3 == 4) {
                            field973.method3105(245);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                        if (arg3 == 5) {
                            field973.method3105(213);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                        if (arg3 == 6) {
                            field973.method3105(182);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                        if (arg3 == 7) {
                            field973.method3105(74);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                        if (arg3 == 8) {
                            field973.method3105(161);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                        if (arg3 == 9) {
                            field973.method3105(29);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                        if (arg3 == 10) {
                            field973.method3105(162);
                            field973.method2871(arg1);
                            field973.method2856(arg0);
                            field973.method2856(var37);
                        }
                    }
                }
            }
        }
        if (arg2 == 7) {
            class87 var41 = field968[arg3];
            if (var41 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(40);
                field973.method2912(Statics.field2213);
                field973.method2899(class51.field646[82] ? 1 : 0);
                field973.method2956(arg3);
                field973.method2956(Statics.field2304);
                field973.method2861(Statics.field1646);
            }
        }
        if (arg2 == 13) {
            class87 var42 = field968[arg3];
            if (var42 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(105);
                field973.method2865(class51.field646[82] ? 1 : 0);
                field973.method2956(arg3);
            }
        }
        if (arg2 == 16) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(5);
            field973.method2904(arg3);
            field973.method2956(Statics.field562 + arg0);
            field973.method2856(Statics.field387 + arg1);
            field973.method2882(Statics.field2213);
            field973.method2856(Statics.field2304);
            field973.method2895(class51.field646[82] ? 1 : 0);
            field973.method2904(Statics.field1646);
        }
        if (arg2 == 10) {
            class87 var43 = field968[arg3];
            if (var43 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(175);
                field973.method2899(class51.field646[82] ? 1 : 0);
                field973.method2861(arg3);
            }
        }
        if (arg2 == 34) {
            field973.method3105(11);
            field973.method2856(arg3);
            field973.method2882(arg1);
            field973.method2861(arg0);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 18) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(110);
            field973.method2904(arg3);
            field973.method2861(Statics.field387 + arg1);
            field973.method2865(class51.field646[82] ? 1 : 0);
            field973.method2861(Statics.field562 + arg0);
        }
        if (arg2 == 1) {
            field1176 = arg6;
            field1039 = arg7;
            field1187 = 2;
            field1001 = 0;
            field1163 = arg0;
            field945 = arg1;
            field973.method3105(115);
            field973.method2861(Statics.field387 + arg1);
            field973.method2956(Statics.field1646);
            field973.method2861(arg3 >> 14 & 0x7FFF);
            field973.method2899(class51.field646[82] ? 1 : 0);
            field973.method2904(Statics.field2304);
            field973.method2912(Statics.field2213);
            field973.method2861(Statics.field562 + arg0);
        }
        if (arg2 == 9) {
            class87 var44 = field968[arg3];
            if (var44 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(77);
                field973.method2899(class51.field646[82] ? 1 : 0);
                field973.method2861(arg3);
            }
        }
        if (arg2 == 29) {
            field973.method3105(130);
            field973.method2871(arg1);
            class217 var45 = class217.method192(arg1);
            if (var45.field2772 != null && var45.field2772[0][0] == 5) {
                int var46 = var45.field2772[0][1];
                if (class212.field2609[var46] != var45.field2679[0]) {
                    class212.field2609[var46] = var45.field2679[0];
                    method40(var46);
                }
            }
        }
        if (arg2 == 43) {
            field973.method3105(185);
            field973.method2956(arg3);
            field973.method2882(arg1);
            field973.method2856(arg0);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 8) {
            class87 var47 = field968[arg3];
            if (var47 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(208);
                field973.method2861(field1087);
                field973.method2871(Statics.field1529);
                field973.method2904(arg3);
                field973.method2865(class51.field646[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            if (field1069) {
                Statics.field7.method2493();
            } else {
                Statics.field7.method2527(Statics.field2158, arg0, arg1, true);
            }
        }
        if (arg2 == 14) {
            class75 var48 = field1051[arg3];
            if (var48 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(133);
                field973.method2861(arg3);
                field973.method2861(Statics.field1646);
                field973.method2856(Statics.field2304);
                field973.method2912(Statics.field2213);
                field973.method2899(class51.field646[82] ? 1 : 0);
            }
        }
        if (arg2 == 47) {
            class75 var49 = field1051[arg3];
            if (var49 != null) {
                field1176 = arg6;
                field1039 = arg7;
                field1187 = 2;
                field1001 = 0;
                field1163 = arg0;
                field945 = arg1;
                field973.method3105(66);
                field973.method2861(arg3);
                field973.method2865(class51.field646[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class217 var50 = class217.method192(arg1);
            if (var50 == null || var50.field2671[arg0] < 100000) {
                field973.method3105(20);
                field973.method2904(arg3);
            } else {
                class99.method107(27, "", var50.field2671[arg0] + " x " + class257.method2996(arg3).field3496);
            }
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (arg2 == 33) {
            field973.method3105(126);
            field973.method2956(arg0);
            field973.method2882(arg1);
            field973.method2856(arg3);
            field933 = 0;
            Statics.field615 = class217.method192(arg1);
            field1036 = arg0;
        }
        if (field1084 != 0) {
            field1084 = 0;
            method162(class217.method192(Statics.field2213));
        }
        if (field1086) {
            method35();
        }
        if (Statics.field615 != null && field933 == 0) {
            method162(Statics.field615);
        }
    }

    @ObfuscatedName("ah.hh(ILjava/lang/String;I)V")
    public static void method229(int arg0, String arg1) {
        int var2 = class97.field1508;
        int[] var3 = class97.field1509;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class75 var6 = field1051[var3[var5]];
            if (var6 != null && Statics.field1321 != var6 && var6.field906 != null && var6.field906.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field973.method3105(181);
                    field973.method2895(0);
                    field973.method2956(var3[var5]);
                } else if (arg0 == 4) {
                    field973.method3105(66);
                    field973.method2861(var3[var5]);
                    field973.method2865(0);
                } else if (arg0 == 6) {
                    field973.method3105(24);
                    field973.method2956(var3[var5]);
                    field973.method2865(0);
                } else if (arg0 == 7) {
                    field973.method3105(85);
                    field973.method2895(0);
                    field973.method2861(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method107(4, "", class226.field3002 + arg1);
        }
    }

    @ObfuscatedName("n.hi(S)V")
    public static void method35() {
        if (!field1086) {
            return;
        }
        class217 var0 = class217.method2132(Statics.field1529, field1087);
        if (var0 != null && var0.field2649 != null) {
            class70 var1 = new class70();
            var1.field853 = var0;
            var1.field850 = var0.field2649;
            class84.method966(var1);
        }
        field1086 = false;
        method162(var0);
    }

    @ObfuscatedName("hx.ha(III)V")
    public static void method3755(int arg0, int arg1) {
        field973.method3105(0);
        field973.method2956(arg1);
        field973.method3012(arg0);
    }

    @ObfuscatedName("v.hm(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method4(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3384(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("gr.hf(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3384(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1069 || field1204 >= 500) {
            return;
        }
        field1075[field1204] = arg0;
        field1199[field1204] = arg1;
        field1178[field1204] = arg2;
        field1074[field1204] = arg3;
        field1071[field1204] = arg4;
        field1072[field1204] = arg5;
        if (arg6) {
            field1091 = field1204;
        }
        field1204++;
    }

    @ObfuscatedName("ba.ht(I)I")
    public static final int method971() {
        if (field1204 <= 0) {
            return -1;
        } else if (field1079 && class51.field646[81] && field1091 != -1) {
            return field1091;
        } else {
            return field1204 - 1;
        }
    }

    @ObfuscatedName("bv.hc(B)V")
    public static void method999() {
        for (int var0 = 0; var0 < field1204; var0++) {
            if (method666(field1178[var0])) {
                if (var0 < field1204 - 1) {
                    for (int var1 = var0; var1 < field1204 - 1; var1++) {
                        field1075[var1] = field1075[var1 + 1];
                        field1199[var1] = field1199[var1 + 1];
                        field1178[var1] = field1178[var1 + 1];
                        field1074[var1] = field1074[var1 + 1];
                        field1071[var1] = field1071[var1 + 1];
                        field1072[var1] = field1072[var1 + 1];
                    }
                }
                field1204--;
            }
        }
    }

    @ObfuscatedName("bu.hk(II)Z")
    public static boolean method666(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("bz.hq(II)Ljava/lang/String;")
    public static String method913(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field1199[arg0].length() > 0) {
            return field1075[arg0] + class226.field2861 + field1199[arg0];
        } else {
            return field1075[arg0];
        }
    }

    @ObfuscatedName("im.ho(IIIII)V")
    public static final void method4044(int arg0, int arg1, int arg2, int arg3) {
        if (field1084 == 0 && !field1086) {
            method4(class226.field3008, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class135.field2014; var6++) {
            int var7 = class135.field2015[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field7.method2616(Statics.field2158, var8, var9, var7) >= 0) {
                    class256 var12 = Statics.method3743(var11);
                    if (var12.field3474 != null) {
                        var12 = var12.method4204();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1084 == 1) {
                        method4(class226.field3003, field1085 + " " + class89.field1414 + " " + class89.method303(65535) + var12.field3470, 1, var7, var8, var9);
                    } else if (!field1086) {
                        String[] var13 = var12.field3461;
                        if (field1102) {
                            var13 = method1389(var13);
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
                                    method4(var13[var14], class89.method303(65535) + var12.field3470, var15, var7, var8, var9);
                                }
                            }
                        }
                        method4(class226.field3004, class89.method303(65535) + var12.field3470, 1002, var12.field3440 << 14, var8, var9);
                    } else if ((Statics.field809 & 0x4) == 4) {
                        method4(field1089, field1090 + " " + class89.field1414 + " " + class89.method303(65535) + var12.field3470, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class87 var16 = field968[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1396.field3578 == 1 && (var16.field1275 & 0x7F) == 64 && (var16.field1244 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field969; var17++) {
                            class87 var18 = field968[field951[var17]];
                            if (var18 != null && var16 != var18 && var18.field1396.field3578 == 1 && var16.field1275 == var18.field1275 && var16.field1244 == var18.field1244) {
                                method2797(var18.field1396, field951[var17], var8, var9);
                            }
                        }
                        int var19 = class97.field1508;
                        int[] var20 = class97.field1509;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class75 var22 = field1051[var20[var21]];
                            if (var22 != null && var16.field1275 == var22.field1275 && var16.field1244 == var22.field1244) {
                                method60(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method2797(var16.field1396, var11, var8, var9);
                }
                if (var10 == 0) {
                    class75 var23 = field1051[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1275 & 0x7F) == 64 && (var23.field1244 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field969; var24++) {
                            class87 var25 = field968[field951[var24]];
                            if (var25 != null && var25.field1396.field3578 == 1 && var23.field1275 == var25.field1275 && var23.field1244 == var25.field1244) {
                                method2797(var25.field1396, field951[var24], var8, var9);
                            }
                        }
                        int var26 = class97.field1508;
                        int[] var27 = class97.field1509;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class75 var29 = field1051[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1275 == var29.field1275 && var23.field1244 == var29.field1244) {
                                method60(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field1060 == var11) {
                        var4 = var7;
                    } else {
                        method60(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class194 var30 = field939[Statics.field2158][var8][var9];
                    if (var30 != null) {
                        for (class95 var31 = (class95) var30.method3292(); var31 != null; var31 = (class95) var30.method3300()) {
                            class257 var32 = class257.method2996(var31.field1499);
                            if (field1084 == 1) {
                                method4(class226.field3003, field1085 + " " + class89.field1414 + " " + class89.method303(16748608) + var32.field3496, 16, var31.field1499, var8, var9);
                            } else if (!field1086) {
                                String[] var33 = var32.field3489;
                                if (field1102) {
                                    var33 = method1389(var33);
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
                                        method4(var33[var34], class89.method303(16748608) + var32.field3496, var35, var31.field1499, var8, var9);
                                    } else if (var34 == 2) {
                                        method4(class226.field2854, class89.method303(16748608) + var32.field3496, 20, var31.field1499, var8, var9);
                                    }
                                }
                                method4(class226.field3004, class89.method303(16748608) + var32.field3496, 1004, var31.field1499, var8, var9);
                            } else if ((Statics.field809 & 0x1) == 1) {
                                method4(field1089, field1090 + " " + class89.field1414 + " " + class89.method303(16748608) + var32.field3496, 17, var31.field1499, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class75 var38 = field1051[field1060];
            method60(var38, field1060, var36, var37);
        }
    }

    @ObfuscatedName("fd.hp(Lid;IIII)V")
    public static final void method2797(class259 arg0, int arg1, int arg2, int arg3) {
        if (field1204 >= 400) {
            return;
        }
        if (arg0.field3552 != null) {
            arg0 = arg0.method4299();
        }
        if (arg0 == null || !arg0.field3560 || arg0.field3581 && field1194 != arg1) {
            return;
        }
        String var4 = arg0.field3559;
        if (arg0.field3568 != 0) {
            int var6 = arg0.field3568;
            int var7 = Statics.field1321.field896;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class89.method303(16711680);
            } else if (var8 < -6) {
                var9 = class89.method303(16723968);
            } else if (var8 < -3) {
                var9 = class89.method303(16740352);
            } else if (var8 < 0) {
                var9 = class89.method303(16756736);
            } else if (var8 > 9) {
                var9 = class89.method303(65280);
            } else if (var8 > 6) {
                var9 = class89.method303(4259584);
            } else if (var8 > 3) {
                var9 = class89.method303(8453888);
            } else if (var8 > 0) {
                var9 = class89.method303(12648192);
            } else {
                var9 = class89.method303(16776960);
            }
            var4 = var4 + var9 + " " + class89.field1412 + class226.field2967 + arg0.field3568 + class89.field1413;
        }
        if (arg0.field3581 && field1157) {
            method4(class226.field3004, class89.method303(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1084 == 1) {
            method4(class226.field3003, field1085 + " " + class89.field1414 + " " + class89.method303(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1086) {
            int var10 = arg0.field3581 && field1157 ? 2000 : 0;
            String[] var11 = arg0.field3566;
            if (field1102) {
                var11 = method1389(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class226.field2901)) {
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
                        method4(var11[var12], class89.method303(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class226.field2901)) {
                        short var15 = 0;
                        if (field985 != class92.field1440) {
                            if (field985 == class92.field1437 || field985 == class92.field1441 && arg0.field3568 > Statics.field1321.field896) {
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
                            method4(var11[var14], class89.method303(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3581 || !field1157) {
                method4(class226.field3004, class89.method303(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field809 & 0x2) == 2) {
            method4(field1089, field1090 + " " + class89.field1414 + " " + class89.method303(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("q.hy(Lbm;IIII)V")
    public static final void method60(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1321 == arg0 || field1204 >= 400) {
            return;
        }
        String var9;
        if (arg0.field897 == 0) {
            String var4 = arg0.field893[0] + arg0.field906 + arg0.field893[1];
            int var5 = arg0.field896;
            int var6 = Statics.field1321.field896;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class89.method303(16711680);
            } else if (var7 < -6) {
                var8 = class89.method303(16723968);
            } else if (var7 < -3) {
                var8 = class89.method303(16740352);
            } else if (var7 < 0) {
                var8 = class89.method303(16756736);
            } else if (var7 > 9) {
                var8 = class89.method303(65280);
            } else if (var7 > 6) {
                var8 = class89.method303(4259584);
            } else if (var7 > 3) {
                var8 = class89.method303(8453888);
            } else if (var7 > 0) {
                var8 = class89.method303(12648192);
            } else {
                var8 = class89.method303(16776960);
            }
            var9 = var4 + var8 + " " + class89.field1412 + class226.field2967 + arg0.field896 + class89.field1413 + arg0.field893[2];
        } else {
            var9 = arg0.field893[0] + arg0.field906 + arg0.field893[1] + " " + class89.field1412 + class226.field3132 + arg0.field897 + class89.field1413 + arg0.field893[2];
        }
        if (field1084 == 1) {
            method4(class226.field3003, field1085 + " " + class89.field1414 + " " + class89.method303(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1086) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field1057[var10] != null) {
                    short var11 = 0;
                    if (field1057[var10].equalsIgnoreCase(class226.field2901)) {
                        if (field954 == class92.field1440) {
                            continue;
                        }
                        if (field954 == class92.field1437 || field954 == class92.field1441 && arg0.field896 > Statics.field1321.field896) {
                            var11 = 2000;
                        }
                        if (Statics.field1321.field910 != 0 && arg0.field910 != 0) {
                            if (Statics.field1321.field910 == arg0.field910) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1058[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1056[var10] + var11;
                    method4(field1057[var10], class89.method303(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field809 & 0x8) == 8) {
            method4(field1089, field1090 + " " + class89.field1414 + " " + class89.method303(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1204; var14++) {
            if (field1178[var14] == 23) {
                field1199[var14] = class89.method303(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("aa.hv(IIIIIIIII)V")
    public static final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method2721(arg0)) {
            Statics.field2288 = null;
            method964(Statics.field1309[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2288 != null) {
                method964(Statics.field2288, -1412584499, arg1, arg2, arg3, arg4, Statics.field3135, Statics.field464, arg7);
                Statics.field2288 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1136[var8] = true;
            }
        } else {
            field1136[arg7] = true;
        }
    }

    @ObfuscatedName("by.hb([Lhf;IIIIIIIII)V")
    public static final void method964(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class282.method4578(arg2, arg3, arg4, arg5);
        class137.method2376();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2786 == arg1 || arg1 == -1412584499 && field1165 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1139[field1134] = var10.field2665 + arg6;
                    field1140[field1134] = var10.field2666 + arg7;
                    field1141[field1134] = var10.field2750;
                    field1053[field1134] = var10.field2689;
                    var11 = ++field1134 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2654 = var11;
                var10.field2755 = field938;
                if (!var10.field2651 || !method1564(var10)) {
                    if (var10.field2656 > 0) {
                        int var12 = var10.field2656;
                        if (var12 == 324) {
                            if (field1203 == -1) {
                                field1203 = var10.field2713;
                                field963 = var10.field2663;
                            }
                            if (field1202.field2620) {
                                var10.field2713 = field1203;
                            } else {
                                var10.field2713 = field963;
                            }
                        } else if (var12 == 325) {
                            if (field1203 == -1) {
                                field1203 = var10.field2713;
                                field963 = var10.field2663;
                            }
                            if (field1202.field2620) {
                                var10.field2713 = field963;
                            } else {
                                var10.field2713 = field1203;
                            }
                        } else if (var12 == 327) {
                            var10.field2703 = 150;
                            var10.field2704 = (int) (Math.sin((double) field938 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2695 = 5;
                            var10.field2696 = 0;
                        } else if (var12 == 328) {
                            var10.field2703 = 150;
                            var10.field2704 = (int) (Math.sin((double) field938 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2695 = 5;
                            var10.field2696 = 1;
                        }
                    }
                    int var13 = var10.field2665 + arg6;
                    int var14 = var10.field2666 + arg7;
                    int var15 = var10.field2683;
                    if (field1165 == var10) {
                        if (arg1 != -1412584499 && !var10.field2781) {
                            Statics.field2288 = arg0;
                            Statics.field3135 = arg6;
                            Statics.field464 = arg7;
                            continue;
                        }
                        if (field1115 && field1109) {
                            int var16 = class60.field738;
                            int var17 = class60.field739;
                            int var18 = var16 - field1106;
                            int var19 = var17 - field1142;
                            if (var18 < field1064) {
                                var18 = field1064;
                            }
                            if (var10.field2750 + var18 > field1064 + field1105.field2750) {
                                var18 = field1064 + field1105.field2750 - var10.field2750;
                            }
                            if (var19 < field1147) {
                                var19 = field1147;
                            }
                            if (var10.field2689 + var19 > field1147 + field1105.field2689) {
                                var19 = field1147 + field1105.field2689 - var10.field2689;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2781) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2675 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2675 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2750 + var13;
                        int var27 = var10.field2689 + var14;
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
                        int var30 = var10.field2750 + var13;
                        int var31 = var10.field2689 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2651 || var20 < var22 && var21 < var23) {
                        if (var10.field2656 != 0) {
                            if (var10.field2656 == 1336) {
                                if (field944) {
                                    var14 += 15;
                                    Statics.field474.method4398("Fps:" + field708, var10.field2750 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field1047) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field1047) {
                                        var34 = 16711680;
                                    }
                                    Statics.field474.method4398("Mem:" + var33 + "k", var10.field2750 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2656 == 1337) {
                                field1080 = var13;
                                field1081 = var14;
                                method938(var13, var14, var10.field2750, var10.field2689);
                                field1136[var10.field2654] = true;
                                class282.method4578(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2656 == 1338) {
                                method1377(var10, var13, var14, var11);
                                class282.method4578(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2656 == 1339) {
                                method649(var10, var13, var14, var11);
                                class282.method4578(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2656 == 1400) {
                                Statics.field15.method4939(var13, var14, var10.field2750, var10.field2689, field938);
                            }
                            if (var10.field2656 == 1401) {
                                Statics.field15.method4900(var13, var14, var10.field2750, var10.field2689);
                            }
                        }
                        if (var10.field2675 == 0) {
                            if (!var10.field2651 && method1564(var10) && Statics.field435 != var10) {
                                continue;
                            }
                            if (!var10.field2651) {
                                if (var10.field2754 > var10.field2646 - var10.field2689) {
                                    var10.field2754 = var10.field2646 - var10.field2689;
                                }
                                if (var10.field2754 < 0) {
                                    var10.field2754 = 0;
                                }
                            }
                            method964(arg0, var10.field2652, var20, var21, var22, var23, var13 - var10.field2673, var14 - var10.field2754, var11);
                            if (var10.field2776 != null) {
                                method964(var10.field2776, var10.field2652, var20, var21, var22, var23, var13 - var10.field2673, var14 - var10.field2754, var11);
                            }
                            class69 var35 = (class69) field1092.method3238((long) var10.field2652);
                            if (var35 != null) {
                                method447(var35.field848, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class282.method4578(arg2, arg3, arg4, arg5);
                            class137.method2376();
                        }
                        if (field1145 || field1041[var11] || field1162 > 1) {
                            if (var10.field2675 == 0 && !var10.field2651 && var10.field2646 > var10.field2689) {
                                method2119(var10.field2750 + var13, var14, var10.field2754, var10.field2689, var10.field2646);
                            }
                            if (var10.field2675 != 1) {
                                if (var10.field2675 == 2) {
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < var10.field2641; var37++) {
                                        for (int var38 = 0; var38 < var10.field2705; var38++) {
                                            int var39 = (var10.field2765 + 32) * var38 + var13;
                                            int var40 = (var10.field2719 + 32) * var37 + var14;
                                            if (var36 < 20) {
                                                var39 += var10.field2720[var36];
                                                var40 += var10.field2721[var36];
                                            }
                                            if (var10.field2743[var36] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var10.field2743[var36] - 1;
                                                if (var39 + 32 > arg2 && var39 < arg4 && var40 + 32 > arg3 && var40 < arg5 || Statics.field1886 == var10 && field1044 == var36) {
                                                    class286 var44;
                                                    if (field1084 == 1 && Statics.field2304 == var36 && Statics.field2213 == var10.field2652) {
                                                        var44 = class257.method1568(var43, var10.field2671[var36], 2, 0, 2, false);
                                                    } else {
                                                        var44 = class257.method1568(var43, var10.field2671[var36], 1, 3153952, 2, false);
                                                    }
                                                    if (var44 == null) {
                                                        method162(var10);
                                                    } else if (Statics.field1886 == var10 && field1044 == var36) {
                                                        int var45 = class60.field738 - field1045;
                                                        int var46 = class60.field739 - field1082;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (field1206 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method4681(var39 + var45, var40 + var46, 128);
                                                        if (arg1 != -1) {
                                                            class217 var47 = arg0[arg1 & 0xFFFF];
                                                            if (var40 + var46 < class282.field3753 && var47.field2754 > 0) {
                                                                int var48 = field1120 * (class282.field3753 - var40 - var46) / 3;
                                                                if (var48 > field1120 * 10) {
                                                                    var48 = field1120 * 10;
                                                                }
                                                                if (var48 > var47.field2754) {
                                                                    var48 = var47.field2754;
                                                                }
                                                                var47.field2754 -= var48;
                                                                field1082 += var48;
                                                                method162(var47);
                                                            }
                                                            if (var40 + var46 + 32 > class282.field3757 && var47.field2754 < var47.field2646 - var47.field2689) {
                                                                int var49 = field1120 * (var40 + var46 + 32 - class282.field3757) / 3;
                                                                if (var49 > field1120 * 10) {
                                                                    var49 = field1120 * 10;
                                                                }
                                                                if (var49 > var47.field2646 - var47.field2689 - var47.field2754) {
                                                                    var49 = var47.field2646 - var47.field2689 - var47.field2754;
                                                                }
                                                                var47.field2754 += var49;
                                                                field1082 -= var49;
                                                                method162(var47);
                                                            }
                                                        }
                                                    } else if (Statics.field615 == var10 && field1036 == var36) {
                                                        var44.method4681(var39, var40, 128);
                                                    } else {
                                                        var44.method4676(var39, var40);
                                                    }
                                                }
                                            } else if (var10.field2722 != null && var36 < 20) {
                                                class286 var50 = var10.method3653(var36);
                                                if (var50 != null) {
                                                    var50.method4676(var39, var40);
                                                } else if (class217.field2650) {
                                                    method162(var10);
                                                }
                                            }
                                            var36++;
                                        }
                                    }
                                } else if (var10.field2675 == 3) {
                                    int var51;
                                    if (method2453(var10)) {
                                        var51 = var10.field2709;
                                        if (Statics.field435 == var10 && var10.field2678 != 0) {
                                            var51 = var10.field2678;
                                        }
                                    } else {
                                        var51 = var10.field2677;
                                        if (Statics.field435 == var10 && var10.field2770 != 0) {
                                            var51 = var10.field2770;
                                        }
                                    }
                                    if (var10.field2681) {
                                        switch(var10.field2682.field3768) {
                                            case 1:
                                                class282.method4613(var13, var14, var10.field2750, var10.field2689, var10.field2677, var10.field2709, 256 - (var10.field2683 & 0xFF), 256 - (var10.field2684 & 0xFF));
                                                break;
                                            case 2:
                                                class282.method4564(var13, var14, var10.field2750, var10.field2689, var10.field2677, var10.field2709, 256 - (var10.field2683 & 0xFF), 256 - (var10.field2684 & 0xFF));
                                                break;
                                            case 3:
                                                class282.method4556(var13, var14, var10.field2750, var10.field2689, var10.field2677, var10.field2709, 256 - (var10.field2683 & 0xFF), 256 - (var10.field2684 & 0xFF));
                                                break;
                                            case 4:
                                                class282.method4554(var13, var14, var10.field2750, var10.field2689, var10.field2677, var10.field2709, 256 - (var10.field2683 & 0xFF), 256 - (var10.field2684 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class282.method4561(var13, var14, var10.field2750, var10.field2689, var51);
                                                } else {
                                                    class282.method4560(var13, var14, var10.field2750, var10.field2689, var51, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class282.method4583(var13, var14, var10.field2750, var10.field2689, var51);
                                    } else {
                                        class282.method4602(var13, var14, var10.field2750, var10.field2689, var51, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2675 == 4) {
                                    class264 var52 = var10.method3654();
                                    if (var52 != null) {
                                        String var53 = var10.field2712;
                                        int var54;
                                        if (method2453(var10)) {
                                            var54 = var10.field2709;
                                            if (Statics.field435 == var10 && var10.field2678 != 0) {
                                                var54 = var10.field2678;
                                            }
                                            if (var10.field2668.length() > 0) {
                                                var53 = var10.field2668;
                                            }
                                        } else {
                                            var54 = var10.field2677;
                                            if (Statics.field435 == var10 && var10.field2770 != 0) {
                                                var54 = var10.field2770;
                                            }
                                        }
                                        if (var10.field2651 && var10.field2674 != -1) {
                                            class257 var55 = class257.method2996(var10.field2674);
                                            var53 = var55.field3496;
                                            if (var53 == null) {
                                                var53 = "null";
                                            }
                                            if ((var55.field3504 == 1 || var10.field2773 != 1) && var10.field2773 != -1) {
                                                var53 = class89.method303(16748608) + var53 + class89.field1416 + " " + 'x' + method2651(var10.field2773);
                                            }
                                        }
                                        if (field964 == var10) {
                                            class226 var10000 = (class226) null;
                                            var53 = class226.field3011;
                                            var54 = var10.field2677;
                                        }
                                        if (!var10.field2651) {
                                            var53 = method3741(var53, var10);
                                        }
                                        var52.method4390(var53, var13, var14, var10.field2750, var10.field2689, var54, var10.field2717 ? 0 : -1, var10.field2715, var10.field2716, var10.field2714);
                                    } else if (class217.field2650) {
                                        method162(var10);
                                    }
                                } else if (var10.field2675 == 5) {
                                    if (var10.field2651) {
                                        class286 var57;
                                        if (var10.field2674 == -1) {
                                            var57 = var10.method3687(false);
                                        } else {
                                            var57 = class257.method1568(var10.field2674, var10.field2773, var10.field2691, var10.field2692, var10.field2710, false);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field3779;
                                            int var59 = var57.field3785;
                                            if (var10.field2690) {
                                                class282.method4594(var13, var14, var10.field2750 + var13, var10.field2689 + var14);
                                                int var60 = (var10.field2750 + (var58 - 1)) / var58;
                                                int var61 = (var10.field2689 + (var59 - 1)) / var59;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var10.field2688 != 0) {
                                                            var57.method4701(var58 / 2 + var58 * var62 + var13, var59 / 2 + var59 * var63 + var14, var10.field2688, 4096);
                                                        } else if (var15 == 0) {
                                                            var57.method4676(var58 * var62 + var13, var59 * var63 + var14);
                                                        } else {
                                                            var57.method4681(var58 * var62 + var13, var59 * var63 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class282.method4578(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var64 = var10.field2750 * 4096 / var58;
                                                if (var10.field2688 != 0) {
                                                    var57.method4701(var10.field2750 / 2 + var13, var10.field2689 / 2 + var14, var10.field2688, var64);
                                                } else if (var15 != 0) {
                                                    var57.method4730(var13, var14, var10.field2750, var10.field2689, 256 - (var15 & 0xFF));
                                                } else if (var10.field2750 == var58 && var10.field2689 == var59) {
                                                    var57.method4676(var13, var14);
                                                } else {
                                                    var57.method4677(var13, var14, var10.field2750, var10.field2689);
                                                }
                                            }
                                        } else if (class217.field2650) {
                                            method162(var10);
                                        }
                                    } else {
                                        class286 var56 = var10.method3687(method2453(var10));
                                        if (var56 != null) {
                                            var56.method4676(var13, var14);
                                        } else if (class217.field2650) {
                                            method162(var10);
                                        }
                                    }
                                } else if (var10.field2675 == 6) {
                                    boolean var65 = method2453(var10);
                                    int var66;
                                    if (var65) {
                                        var66 = var10.field2700;
                                    } else {
                                        var66 = var10.field2699;
                                    }
                                    class134 var67 = null;
                                    int var68 = 0;
                                    if (var10.field2674 != -1) {
                                        class257 var69 = class257.method2996(var10.field2674);
                                        if (var69 != null) {
                                            class257 var70 = var69.method4244(var10.field2773);
                                            var67 = var70.method4273(1);
                                            if (var67 == null) {
                                                method162(var10);
                                            } else {
                                                var67.method2277();
                                                var68 = var67.field2141 / 2;
                                            }
                                        }
                                    } else if (var10.field2695 == 5) {
                                        if (var10.field2696 == 0) {
                                            var67 = field1202.method3612((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var67 = Statics.field1321.method1026();
                                        }
                                    } else if (var66 == -1) {
                                        var67 = var10.method3656((class261) null, -1, var65, Statics.field1321.field902);
                                        if (var67 == null && class217.field2650) {
                                            method162(var10);
                                        }
                                    } else {
                                        class261 var71 = class261.method3748(var66);
                                        var67 = var10.method3656(var71, var10.field2676, var65, Statics.field1321.field902);
                                        if (var67 == null && class217.field2650) {
                                            method162(var10);
                                        }
                                    }
                                    class137.method2374(var10.field2750 / 2 + var13, var10.field2689 / 2 + var14);
                                    int var72 = var10.field2706 * class137.field2053[var10.field2703] >> 16;
                                    int var73 = var10.field2706 * class137.field2041[var10.field2703] >> 16;
                                    if (var67 != null) {
                                        if (var10.field2651) {
                                            var67.method2277();
                                            if (var10.field2784) {
                                                var67.method2290(0, var10.field2704, var10.field2723, var10.field2703, var10.field2701, var10.field2702 + var68 + var72, var10.field2702 + var73, var10.field2706);
                                            } else {
                                                var67.method2289(0, var10.field2704, var10.field2723, var10.field2703, var10.field2701, var10.field2702 + var68 + var72, var10.field2702 + var73);
                                            }
                                        } else {
                                            var67.method2289(0, var10.field2704, 0, var10.field2703, 0, var72, var73);
                                        }
                                    }
                                    class137.method2373();
                                } else {
                                    if (var10.field2675 == 7) {
                                        class264 var74 = var10.method3654();
                                        if (var74 == null) {
                                            if (class217.field2650) {
                                                method162(var10);
                                            }
                                            continue;
                                        }
                                        int var75 = 0;
                                        for (int var76 = 0; var76 < var10.field2641; var76++) {
                                            for (int var77 = 0; var77 < var10.field2705; var77++) {
                                                if (var10.field2743[var75] > 0) {
                                                    class257 var78 = class257.method2996(var10.field2743[var75] - 1);
                                                    String var79;
                                                    if (var78.field3504 != 1 && var10.field2671[var75] == 1) {
                                                        var79 = class89.method303(16748608) + var78.field3496 + class89.field1416;
                                                    } else {
                                                        var79 = class89.method303(16748608) + var78.field3496 + class89.field1416 + " " + 'x' + method2651(var10.field2671[var75]);
                                                    }
                                                    int var80 = (var10.field2765 + 115) * var77 + var13;
                                                    int var81 = (var10.field2719 + 12) * var76 + var14;
                                                    if (var10.field2715 == 0) {
                                                        var74.method4383(var79, var80, var81, var10.field2677, var10.field2717 ? 0 : -1);
                                                    } else if (var10.field2715 == 1) {
                                                        var74.method4382(var79, var10.field2750 / 2 + var80, var81, var10.field2677, var10.field2717 ? 0 : -1);
                                                    } else {
                                                        var74.method4398(var79, var10.field2750 + var80 - 1, var81, var10.field2677, var10.field2717 ? 0 : -1);
                                                    }
                                                }
                                                var75++;
                                            }
                                        }
                                    }
                                    if (var10.field2675 == 8 && Statics.field792 == var10 && field992 == field1083) {
                                        int var82 = 0;
                                        int var83 = 0;
                                        class264 var84 = Statics.field474;
                                        String var85 = var10.field2712;
                                        String var86 = method3741(var85, var10);
                                        while (var86.length() > 0) {
                                            int var87 = var86.indexOf(class89.field1415);
                                            String var88;
                                            if (var87 == -1) {
                                                var88 = var86;
                                                var86 = "";
                                            } else {
                                                var88 = var86.substring(0, var87);
                                                var86 = var86.substring(var87 + 4);
                                            }
                                            int var89 = var84.method4374(var88);
                                            if (var89 > var82) {
                                                var82 = var89;
                                            }
                                            var83 += var84.field3653 + 1;
                                        }
                                        var82 += 6;
                                        var83 += 7;
                                        int var90 = var10.field2750 + var13 - 5 - var82;
                                        int var91 = var10.field2689 + var14 + 5;
                                        if (var90 < var13 + 5) {
                                            var90 = var13 + 5;
                                        }
                                        if (var82 + var90 > arg4) {
                                            var90 = arg4 - var82;
                                        }
                                        if (var83 + var91 > arg5) {
                                            var91 = arg5 - var83;
                                        }
                                        class282.method4561(var90, var91, var82, var83, 16777120);
                                        class282.method4583(var90, var91, var82, var83, 0);
                                        String var92 = var10.field2712;
                                        int var93 = var84.field3653 + var91 + 2;
                                        String var94 = method3741(var92, var10);
                                        while (var94.length() > 0) {
                                            int var95 = var94.indexOf(class89.field1415);
                                            String var96;
                                            if (var95 == -1) {
                                                var96 = var94;
                                                var94 = "";
                                            } else {
                                                var96 = var94.substring(0, var95);
                                                var94 = var94.substring(var95 + 4);
                                            }
                                            var84.method4383(var96, var90 + 3, var93, 0, -1);
                                            var93 += var84.field3653 + 1;
                                        }
                                    }
                                    if (var10.field2675 == 9) {
                                        int var97;
                                        int var98;
                                        int var99;
                                        int var100;
                                        if (var10.field2783) {
                                            var97 = var13;
                                            var98 = var10.field2689 + var14;
                                            var99 = var10.field2750 + var13;
                                            var100 = var14;
                                        } else {
                                            var97 = var13;
                                            var98 = var14;
                                            var99 = var10.field2750 + var13;
                                            var100 = var10.field2689 + var14;
                                        }
                                        if (var10.field2685 == 1) {
                                            class282.method4574(var97, var98, var99, var100, var10.field2677);
                                        } else {
                                            method111(var97, var98, var99, var100, var10.field2677, var10.field2685);
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

    @ObfuscatedName("d.hr(IIIIIII)V")
    public static final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class282.field3758;
        int var18 = arg1 - class282.field3753;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class137.method2383(var19, var20, var21);
        class137.method2382(var23, var24, var25, var19, var20, var21, arg4);
        class137.method2383(var19, var21, var22);
        class137.method2382(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("hb.hl(Ljava/lang/String;Lhf;I)Ljava/lang/String;")
    public static String method3741(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2747(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var7 = arg0.indexOf("%dns");
                if (var7 == -1) {
                    break;
                }
                String var8 = "";
                if (Statics.field1473 != null) {
                    int var9 = Statics.field1473.field2247;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1473.field2249 != null) {
                        var8 = (String) Statics.field1473.field2249;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ew.hu(IS)Ljava/lang/String;")
    public static final String method2651(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1410 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method303(65408) + var1.substring(0, var1.length() - 8) + class226.field3045 + " " + class89.field1412 + var1 + class89.field1413 + class89.field1416;
        } else if (var1.length() > 6) {
            return " " + class89.method303(16777215) + var1.substring(0, var1.length() - 4) + class226.field2880 + " " + class89.field1412 + var1 + class89.field1413 + class89.field1416;
        } else {
            return " " + class89.method303(16776960) + var1 + class89.field1416;
        }
    }

    @ObfuscatedName("client.hs(ZB)V")
    public final void method1055(boolean arg0) {
        int var2 = field1164;
        int var3 = Statics.field2021;
        int var4 = Statics.field312;
        if (class217.method2721(var2)) {
            method3080(Statics.field1309[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.hx(Lhf;I)V")
    public void method1243(class217 arg0) {
        class217 var2 = arg0.field2786 == -1 ? null : class217.method192(arg0.field2786);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2021;
            var4 = Statics.field312;
        } else {
            var3 = var2.field2750;
            var4 = var2.field2689;
        }
        method4084(arg0, var3, var4, false);
        method2741(arg0, var3, var4);
    }

    @ObfuscatedName("ia.hg([Lhf;Lhf;ZI)V")
    public static void method3876(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2707 == 0 ? arg1.field2750 : arg1.field2707;
        int var4 = arg1.field2646 == 0 ? arg1.field2689 : arg1.field2646;
        method3080(arg0, arg1.field2652, var3, var4, arg2);
        if (arg1.field2776 != null) {
            method3080(arg1.field2776, arg1.field2652, var3, var4, arg2);
        }
        class69 var5 = (class69) field1092.method3238((long) arg1.field2652);
        if (var5 != null) {
            int var6 = var5.field848;
            if (class217.method2721(var6)) {
                method3080(Statics.field1309[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2656 == 1337) {
        }
    }

    @ObfuscatedName("fw.hd([Lhf;IIIZB)V")
    public static void method3080(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2786 == arg1) {
                method4084(var6, arg2, arg3, arg4);
                method2741(var6, arg2, arg3);
                if (var6.field2673 > var6.field2707 - var6.field2750) {
                    var6.field2673 = var6.field2707 - var6.field2750;
                }
                if (var6.field2673 < 0) {
                    var6.field2673 = 0;
                }
                if (var6.field2754 > var6.field2646 - var6.field2689) {
                    var6.field2754 = var6.field2646 - var6.field2689;
                }
                if (var6.field2754 < 0) {
                    var6.field2754 = 0;
                }
                if (var6.field2675 == 0) {
                    method3876(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ij.hn(Lhf;IIZI)V")
    public static void method4084(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2750;
        int var5 = arg0.field2689;
        if (arg0.field2659 == 0) {
            arg0.field2750 = arg0.field2705;
        } else if (arg0.field2659 == 1) {
            arg0.field2750 = arg1 - arg0.field2705;
        } else if (arg0.field2659 == 2) {
            arg0.field2750 = arg0.field2705 * arg1 >> 14;
        }
        if (arg0.field2660 == 0) {
            arg0.field2689 = arg0.field2641;
        } else if (arg0.field2660 == 1) {
            arg0.field2689 = arg2 - arg0.field2641;
        } else if (arg0.field2660 == 2) {
            arg0.field2689 = arg0.field2641 * arg2 >> 14;
        }
        if (arg0.field2659 == 4) {
            arg0.field2750 = arg0.field2689 * arg0.field2669 / arg0.field2718;
        }
        if (arg0.field2660 == 4) {
            arg0.field2689 = arg0.field2750 * arg0.field2718 / arg0.field2669;
        }
        if (field1101 && arg0.field2675 == 0) {
            if (arg0.field2689 < 5 && arg0.field2750 < 5) {
                arg0.field2689 = 5;
                arg0.field2750 = 5;
            } else {
                if (arg0.field2689 <= 0) {
                    arg0.field2689 = 5;
                }
                if (arg0.field2750 <= 0) {
                    arg0.field2750 = 5;
                }
            }
        }
        if (arg0.field2656 == 1337) {
            field1103 = arg0;
        }
        if (arg3 && arg0.field2761 != null && (arg0.field2750 != var4 || arg0.field2689 != var5)) {
            class70 var6 = new class70();
            var6.field853 = arg0;
            var6.field850 = arg0.field2761;
            field956.method3289(var6);
        }
    }

    @ObfuscatedName("fp.ip(Lhf;III)V")
    public static void method2741(class217 arg0, int arg1, int arg2) {
        if (arg0.field2657 == 0) {
            arg0.field2665 = arg0.field2661;
        } else if (arg0.field2657 == 1) {
            arg0.field2665 = (arg1 - arg0.field2750) / 2 + arg0.field2661;
        } else if (arg0.field2657 == 2) {
            arg0.field2665 = arg1 - arg0.field2750 - arg0.field2661;
        } else if (arg0.field2657 == 3) {
            arg0.field2665 = arg0.field2661 * arg1 >> 14;
        } else if (arg0.field2657 == 4) {
            arg0.field2665 = (arg0.field2661 * arg1 >> 14) + (arg1 - arg0.field2750) / 2;
        } else {
            arg0.field2665 = arg1 - arg0.field2750 - (arg0.field2661 * arg1 >> 14);
        }
        if (arg0.field2644 == 0) {
            arg0.field2666 = arg0.field2662;
        } else if (arg0.field2644 == 1) {
            arg0.field2666 = (arg2 - arg0.field2689) / 2 + arg0.field2662;
        } else if (arg0.field2644 == 2) {
            arg0.field2666 = arg2 - arg0.field2689 - arg0.field2662;
        } else if (arg0.field2644 == 3) {
            arg0.field2666 = arg0.field2662 * arg2 >> 14;
        } else if (arg0.field2644 == 4) {
            arg0.field2666 = (arg0.field2662 * arg2 >> 14) + (arg2 - arg0.field2689) / 2;
        } else {
            arg0.field2666 = arg2 - arg0.field2689 - (arg0.field2662 * arg2 >> 14);
        }
        if (!field1101 || arg0.field2675 != 0) {
            return;
        }
        if (arg0.field2665 < 0) {
            arg0.field2665 = 0;
        } else if (arg0.field2750 + arg0.field2665 > arg1) {
            arg0.field2665 = arg1 - arg0.field2750;
        }
        if (arg0.field2666 < 0) {
            arg0.field2666 = 0;
        } else if (arg0.field2689 + arg0.field2666 > arg2) {
            arg0.field2666 = arg2 - arg0.field2689;
        }
    }

    @ObfuscatedName("by.iw(Lhf;IIIIIII)V")
    public static final void method965(class217 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field1012) {
            field1013 = 32;
        } else {
            field1013 = 0;
        }
        field1012 = false;
        if (class60.field737 == 1 || !Statics.field3203 && class60.field737 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2754 -= 4;
                method162(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2754 += 4;
                method162(arg0);
            } else if (arg5 >= arg1 - field1013 && arg5 < field1013 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2754 = (arg4 - arg3) * var8 / var9;
                method162(arg0);
                field1012 = true;
            }
        }
        if (field955 == 0) {
            return;
        }
        int var10 = arg0.field2750;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2754 += field955 * 45;
            method162(arg0);
        }
    }

    @ObfuscatedName("dv.ia(IIIIII)V")
    public static final void method2119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1884[0].method4646(arg0, arg1);
        Statics.field1884[1].method4646(arg0, arg1 + arg3 - 16);
        class282.method4561(arg0, arg1 + 16, 16, arg3 - 32, field1008);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class282.method4561(arg0, arg1 + 16 + var6, 16, var5, field1104);
        class282.method4582(arg0, arg1 + 16 + var6, var5, field994);
        class282.method4582(arg0 + 1, arg1 + 16 + var6, var5, field994);
        class282.method4620(arg0, arg1 + 16 + var6, 16, field994);
        class282.method4620(arg0, arg1 + 17 + var6, 16, field994);
        class282.method4582(arg0 + 15, arg1 + 16 + var6, var5, field1010);
        class282.method4582(arg0 + 14, arg1 + 17 + var6, var5 - 1, field1010);
        class282.method4620(arg0, arg1 + 15 + var6 + var5, 16, field1010);
        class282.method4620(arg0 + 1, arg1 + 14 + var6 + var5, 15, field1010);
    }

    @ObfuscatedName("em.in(Lhf;I)Z")
    public static final boolean method2453(class217 arg0) {
        if (arg0.field2757 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2757.length; var1++) {
            int var2 = method2747(arg0, var1);
            int var3 = arg0.field2679[var1];
            if (arg0.field2757[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2757[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2757[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ff.ih(Lhf;IB)I")
    public static final int method2747(class217 arg0, int arg1) {
        if (arg0.field2772 == null || arg1 >= arg0.field2772.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2772[arg1];
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
                    var7 = field1065[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1066[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1205[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method192(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class257.method2996(var12).field3506 || field1002)) {
                        for (int var13 = 0; var13 < var11.field2743.length; var13++) {
                            if (var12 + 1 == var11.field2743[var13]) {
                                var7 += var11.field2671[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2609[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2836[field1066[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2609[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1321.field896;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2835[var14]) {
                            var7 += field1066[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method192(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class257.method2996(var18).field3506 || field1002)) {
                        for (int var19 = 0; var19 < var17.field2743.length; var19++) {
                            if (var18 + 1 == var17.field2743[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field970;
                }
                if (var6 == 12) {
                    var7 = field1097;
                }
                if (var6 == 13) {
                    int var20 = class212.field2609[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method2144(var22);
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
                    var7 = (Statics.field1321.field1275 >> 7) + Statics.field562;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1321.field1244 >> 7) + Statics.field387;
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

    @ObfuscatedName("eh.ik(Lhf;III)V")
    public static final void method2368(class217 arg0, int arg1, int arg2) {
        if (arg0.field2655 == 1) {
            method4(arg0.field2769, "", 24, 0, 0, arg0.field2652);
        }
        if (arg0.field2655 == 2 && !field1086) {
            int var3 = Statics.method3573(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2731 == null || arg0.field2731.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2731;
            }
            if (var5 != null) {
                method4(var5, class89.method303(65280) + arg0.field2768, 25, 0, -1, arg0.field2652);
            }
        }
        if (arg0.field2655 == 3) {
            method4(class226.field2998, "", 26, 0, 0, arg0.field2652);
        }
        if (arg0.field2655 == 4) {
            method4(arg0.field2769, "", 28, 0, 0, arg0.field2652);
        }
        if (arg0.field2655 == 5) {
            method4(arg0.field2769, "", 29, 0, 0, arg0.field2652);
        }
        if (arg0.field2655 == 6 && field964 == null) {
            method4(arg0.field2769, "", 30, 0, -1, arg0.field2652);
        }
        if (arg0.field2675 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2689; var8++) {
                for (int var9 = 0; var9 < arg0.field2750; var9++) {
                    int var10 = (arg0.field2765 + 32) * var9;
                    int var11 = (arg0.field2719 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2720[var7];
                        var11 += arg0.field2721[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field941 = var7;
                        Statics.field867 = arg0;
                        if (arg0.field2743[var7] > 0) {
                            class257 var12 = class257.method2996(arg0.field2743[var7] - 1);
                            if (field1084 != 1 || !class218.method2655(Statics.method3573(arg0))) {
                                label328: {
                                    if (field1086) {
                                        int var13 = Statics.method3573(arg0);
                                        boolean var14 = (var13 >> 30 & 0x1) != 0;
                                        if (var14) {
                                            if ((Statics.field809 & 0x10) == 16) {
                                                method4(field1089, field1090 + " " + class89.field1414 + " " + class89.method303(16748608) + var12.field3496, 32, var12.field3491, var7, arg0.field2652);
                                            }
                                            break label328;
                                        }
                                    }
                                    String[] var15 = var12.field3508;
                                    if (field1102) {
                                        var15 = method1389(var15);
                                    }
                                    int var16 = var12.method4265();
                                    int var17 = Statics.method3573(arg0);
                                    boolean var18 = (var17 >> 30 & 0x1) != 0;
                                    if (var18) {
                                        for (int var19 = 4; var19 >= 3; var19--) {
                                            boolean var20 = var16 == var19;
                                            if (var15 != null && var15[var19] != null) {
                                                byte var21;
                                                if (var19 == 3) {
                                                    var21 = 36;
                                                } else {
                                                    var21 = 37;
                                                }
                                                method3384(var15[var19], class89.method303(16748608) + var12.field3496, var21, var12.field3491, var7, arg0.field2652, var20);
                                            } else if (var19 == 4) {
                                                method3384(class226.field2996, class89.method303(16748608) + var12.field3496, 37, var12.field3491, var7, arg0.field2652, var20);
                                            }
                                        }
                                    }
                                    class218 var10000 = (class218) null;
                                    if (class218.method1538(Statics.method3573(arg0))) {
                                        method4(class226.field3003, class89.method303(16748608) + var12.field3496, 38, var12.field3491, var7, arg0.field2652);
                                    }
                                    int var22 = Statics.method3573(arg0);
                                    boolean var23 = (var22 >> 30 & 0x1) != 0;
                                    if (var23 && var15 != null) {
                                        for (int var24 = 2; var24 >= 0; var24--) {
                                            boolean var25 = var16 == var24;
                                            if (var15[var24] != null) {
                                                byte var26 = 0;
                                                if (var24 == 0) {
                                                    var26 = 33;
                                                }
                                                if (var24 == 1) {
                                                    var26 = 34;
                                                }
                                                if (var24 == 2) {
                                                    var26 = 35;
                                                }
                                                method3384(var15[var24], class89.method303(16748608) + var12.field3496, var26, var12.field3491, var7, arg0.field2652, var25);
                                            }
                                        }
                                    }
                                    String[] var27 = arg0.field2779;
                                    if (field1102) {
                                        var27 = method1389(var27);
                                    }
                                    if (var27 != null) {
                                        for (int var28 = 4; var28 >= 0; var28--) {
                                            if (var27[var28] != null) {
                                                byte var29 = 0;
                                                if (var28 == 0) {
                                                    var29 = 39;
                                                }
                                                if (var28 == 1) {
                                                    var29 = 40;
                                                }
                                                if (var28 == 2) {
                                                    var29 = 41;
                                                }
                                                if (var28 == 3) {
                                                    var29 = 42;
                                                }
                                                if (var28 == 4) {
                                                    var29 = 43;
                                                }
                                                method4(var27[var28], class89.method303(16748608) + var12.field3496, var29, var12.field3491, var7, arg0.field2652);
                                            }
                                        }
                                    }
                                    method4(class226.field3004, class89.method303(16748608) + var12.field3496, 1005, var12.field3491, var7, arg0.field2652);
                                }
                            } else if (Statics.field2213 != arg0.field2652 || Statics.field2304 != var7) {
                                method4(class226.field3003, field1085 + " " + class89.field1414 + " " + class89.method303(16748608) + var12.field3496, 31, var12.field3491, var7, arg0.field2652);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2651) {
            return;
        }
        if (!field1086) {
            for (int var30 = 9; var30 >= 5; var30--) {
                String var31 = method2166(arg0, var30);
                if (var31 != null) {
                    method4(var31, arg0.field2725, 1007, var30 + 1, arg0.field2653, arg0.field2652);
                }
            }
            int var32 = Statics.method3573(arg0);
            int var33 = var32 >> 11 & 0x3F;
            String var34;
            if (var33 == 0) {
                var34 = null;
            } else if (arg0.field2731 == null || arg0.field2731.trim().length() == 0) {
                var34 = null;
            } else {
                var34 = arg0.field2731;
            }
            if (var34 != null) {
                method4(var34, arg0.field2725, 25, 0, arg0.field2653, arg0.field2652);
            }
            for (int var36 = 4; var36 >= 0; var36--) {
                String var37 = method2166(arg0, var36);
                if (var37 != null) {
                    method4(var37, arg0.field2725, 57, var36 + 1, arg0.field2653, arg0.field2652);
                }
            }
            if (class218.method4066(Statics.method3573(arg0))) {
                method4(class226.field2859, "", 30, 0, arg0.field2653, arg0.field2652);
            }
        } else if (class218.method328(Statics.method3573(arg0)) && (Statics.field809 & 0x20) == 32) {
            method4(field1089, field1090 + " " + class89.field1414 + " " + arg0.field2725, 58, 0, arg0.field2653, arg0.field2652);
        }
    }

    @ObfuscatedName("bn.ii(IIIIIIII)V")
    public static final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class217.method2721(arg0)) {
            method1612(Statics.field1309[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("cm.il([Lhf;IIIIIIII)V")
    public static final void method1612(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2651 || var9.field2675 == 0 || var9.field2727 || Statics.method3573(var9) != 0 || field1105 == var9 || var9.field2656 == 1338) && var9.field2786 == arg1 && (!var9.field2651 || !method1564(var9))) {
                int var10 = var9.field2665 + arg6;
                int var11 = var9.field2666 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2675 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2675 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2750 + var10;
                    int var19 = var9.field2689 + var11;
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
                    int var22 = var9.field2750 + var10;
                    int var23 = var9.field2689 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1165 == var9) {
                    field1112 = true;
                    field1113 = var10;
                    field1114 = var11;
                }
                if (!var9.field2651 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field738;
                    int var25 = class60.field739;
                    if (class60.field733 != 0) {
                        var24 = class60.field746;
                        var25 = class60.field751;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2656 == 1337) {
                        if (!field979 && !field1069 && var26) {
                            method4044(var24, var25, var12, var13);
                        }
                    } else if (var9.field2656 != 1338) {
                        if (var9.field2656 == 1400) {
                            Statics.field15.method4803(class60.field738, class60.field739, var26, var10, var11, var9.field2750, var9.field2689);
                        }
                        if (!field1069 && var26) {
                            if (var9.field2656 == 1400) {
                                Statics.field15.method4850(var10, var11, var9.field2750, var9.field2689, var24, var25);
                            } else {
                                method2368(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2675 == 0) {
                            if (!var9.field2651 && method1564(var9) && Statics.field435 != var9) {
                                continue;
                            }
                            method1612(arg0, var9.field2652, var12, var13, var14, var15, var10 - var9.field2673, var11 - var9.field2754);
                            if (var9.field2776 != null) {
                                method1612(var9.field2776, var9.field2652, var12, var13, var14, var15, var10 - var9.field2673, var11 - var9.field2754);
                            }
                            class69 var41 = (class69) field1092.method3238((long) var9.field2652);
                            if (var41 != null) {
                                if (var41.field841 == 0 && class60.field738 >= var12 && class60.field739 >= var13 && class60.field738 < var14 && class60.field739 < var15 && !field1069 && !field1101) {
                                    for (class70 var42 = (class70) field956.method3294(); var42 != null; var42 = (class70) field956.method3296()) {
                                        if (var42.field859) {
                                            var42.method3278();
                                            var42.field853.field2777 = false;
                                        }
                                    }
                                    if (Statics.field800 == 0) {
                                        field1165 = null;
                                        field1105 = null;
                                    }
                                    if (!field1069) {
                                        field1204 = 0;
                                        field1091 = -1;
                                        field1069 = false;
                                        field1075[0] = class226.field3092;
                                        field1199[0] = "";
                                        field1178[0] = 1006;
                                        field1204 = 1;
                                    }
                                }
                                method1030(var41.field848, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2651) {
                            if (var9.field2785) {
                                if (class60.field738 >= var12 && class60.field739 >= var13 && class60.field738 < var14 && class60.field739 < var15) {
                                    for (class70 var43 = (class70) field956.method3294(); var43 != null; var43 = (class70) field956.method3296()) {
                                        if (var43.field859) {
                                            var43.method3278();
                                            var43.field853.field2777 = false;
                                        }
                                    }
                                    if (Statics.field800 == 0) {
                                        field1165 = null;
                                        field1105 = null;
                                    }
                                    if (!field1069) {
                                        field1075[0] = class226.field3092;
                                        field1199[0] = "";
                                        field1178[0] = 1006;
                                        field1204 = 1;
                                    }
                                }
                            } else if (var9.field2764 && class60.field738 >= var12 && class60.field739 >= var13 && class60.field738 < var14 && class60.field739 < var15) {
                                for (class70 var44 = (class70) field956.method3294(); var44 != null; var44 = (class70) field956.method3296()) {
                                    if (var44.field859 && var44.field853.field2753 == var44.field850) {
                                        var44.method3278();
                                    }
                                }
                            }
                            boolean var45;
                            if (class60.field738 >= var12 && class60.field739 >= var13 && class60.field738 < var14 && class60.field739 < var15) {
                                var45 = true;
                            } else {
                                var45 = false;
                            }
                            boolean var46 = false;
                            if ((class60.field737 == 1 || !Statics.field3203 && class60.field737 == 4) && var45) {
                                var46 = true;
                            }
                            boolean var47 = false;
                            if ((class60.field733 == 1 || !Statics.field3203 && class60.field733 == 4) && class60.field746 >= var12 && class60.field751 >= var13 && class60.field746 < var14 && class60.field751 < var15) {
                                var47 = true;
                            }
                            if (var47) {
                                method67(var9, class60.field746 - var10, class60.field751 - var11);
                            }
                            if (var9.field2656 == 1400) {
                                Statics.field15.method4956(class60.field738, class60.field739, var45 & var46);
                            }
                            if (field1165 != null && field1165 != var9 && var45 && class218.method852(Statics.method3573(var9))) {
                                field1108 = var9;
                            }
                            if (field1105 == var9) {
                                field1109 = true;
                                field1064 = var10;
                                field1147 = var11;
                            }
                            if (var9.field2727) {
                                if (var45 && field955 != 0 && var9.field2753 != null) {
                                    class70 var48 = new class70();
                                    var48.field859 = true;
                                    var48.field853 = var9;
                                    var48.field849 = field955;
                                    var48.field850 = var9.field2753;
                                    field956.method3289(var48);
                                }
                                if (field1165 != null || Statics.field1886 != null || field1069) {
                                    var47 = false;
                                    var46 = false;
                                    var45 = false;
                                }
                                if (!var9.field2778 && var47) {
                                    var9.field2778 = true;
                                    if (var9.field2734 != null) {
                                        class70 var49 = new class70();
                                        var49.field859 = true;
                                        var49.field853 = var9;
                                        var49.field851 = class60.field746 - var10;
                                        var49.field849 = class60.field751 - var11;
                                        var49.field850 = var9.field2734;
                                        field956.method3289(var49);
                                    }
                                }
                                if (var9.field2778 && var46 && var9.field2735 != null) {
                                    class70 var50 = new class70();
                                    var50.field859 = true;
                                    var50.field853 = var9;
                                    var50.field851 = class60.field738 - var10;
                                    var50.field849 = class60.field739 - var11;
                                    var50.field850 = var9.field2735;
                                    field956.method3289(var50);
                                }
                                if (var9.field2778 && !var46) {
                                    var9.field2778 = false;
                                    if (var9.field2736 != null) {
                                        class70 var51 = new class70();
                                        var51.field859 = true;
                                        var51.field853 = var9;
                                        var51.field851 = class60.field738 - var10;
                                        var51.field849 = class60.field739 - var11;
                                        var51.field850 = var9.field2736;
                                        field1132.method3289(var51);
                                    }
                                }
                                if (var46 && var9.field2745 != null) {
                                    class70 var52 = new class70();
                                    var52.field859 = true;
                                    var52.field853 = var9;
                                    var52.field851 = class60.field738 - var10;
                                    var52.field849 = class60.field739 - var11;
                                    var52.field850 = var9.field2745;
                                    field956.method3289(var52);
                                }
                                if (!var9.field2777 && var45) {
                                    var9.field2777 = true;
                                    if (var9.field2738 != null) {
                                        class70 var53 = new class70();
                                        var53.field859 = true;
                                        var53.field853 = var9;
                                        var53.field851 = class60.field738 - var10;
                                        var53.field849 = class60.field739 - var11;
                                        var53.field850 = var9.field2738;
                                        field956.method3289(var53);
                                    }
                                }
                                if (var9.field2777 && var45 && var9.field2739 != null) {
                                    class70 var54 = new class70();
                                    var54.field859 = true;
                                    var54.field853 = var9;
                                    var54.field851 = class60.field738 - var10;
                                    var54.field849 = class60.field739 - var11;
                                    var54.field850 = var9.field2739;
                                    field956.method3289(var54);
                                }
                                if (var9.field2777 && !var45) {
                                    var9.field2777 = false;
                                    if (var9.field2740 != null) {
                                        class70 var55 = new class70();
                                        var55.field859 = true;
                                        var55.field853 = var9;
                                        var55.field851 = class60.field738 - var10;
                                        var55.field849 = class60.field739 - var11;
                                        var55.field850 = var9.field2740;
                                        field1132.method3289(var55);
                                    }
                                }
                                if (var9.field2751 != null) {
                                    class70 var56 = new class70();
                                    var56.field853 = var9;
                                    var56.field850 = var9.field2751;
                                    field1131.method3289(var56);
                                }
                                if (var9.field2730 != null && field1118 > var9.field2780) {
                                    if (var9.field2746 == null || field1118 - var9.field2780 > 32) {
                                        class70 var61 = new class70();
                                        var61.field853 = var9;
                                        var61.field850 = var9.field2730;
                                        field956.method3289(var61);
                                    } else {
                                        label523: for (int var57 = var9.field2780; var57 < field1118; var57++) {
                                            int var58 = field1117[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field2746.length; var59++) {
                                                if (var9.field2746[var59] == var58) {
                                                    class70 var60 = new class70();
                                                    var60.field853 = var9;
                                                    var60.field850 = var9.field2730;
                                                    field956.method3289(var60);
                                                    break label523;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2780 = field1118;
                                }
                                if (var9.field2747 != null && field1138 > var9.field2737) {
                                    if (var9.field2748 == null || field1138 - var9.field2737 > 32) {
                                        class70 var66 = new class70();
                                        var66.field853 = var9;
                                        var66.field850 = var9.field2747;
                                        field956.method3289(var66);
                                    } else {
                                        label499: for (int var62 = var9.field2737; var62 < field1138; var62++) {
                                            int var63 = field1119[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field2748.length; var64++) {
                                                if (var9.field2748[var64] == var63) {
                                                    class70 var65 = new class70();
                                                    var65.field853 = var9;
                                                    var65.field850 = var9.field2747;
                                                    field956.method3289(var65);
                                                    break label499;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2737 = field1138;
                                }
                                if (var9.field2749 != null && field1052 > var9.field2782) {
                                    if (var9.field2771 == null || field1052 - var9.field2782 > 32) {
                                        class70 var71 = new class70();
                                        var71.field853 = var9;
                                        var71.field850 = var9.field2749;
                                        field956.method3289(var71);
                                    } else {
                                        label475: for (int var67 = var9.field2782; var67 < field1052; var67++) {
                                            int var68 = field1121[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var9.field2771.length; var69++) {
                                                if (var9.field2771[var69] == var68) {
                                                    class70 var70 = new class70();
                                                    var70.field853 = var9;
                                                    var70.field850 = var9.field2749;
                                                    field956.method3289(var70);
                                                    break label475;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2782 = field1052;
                                }
                                if (field1038 > var9.field2686 && var9.field2658 != null) {
                                    class70 var72 = new class70();
                                    var72.field853 = var9;
                                    var72.field850 = var9.field2658;
                                    field956.method3289(var72);
                                }
                                if (field1067 > var9.field2686 && var9.field2758 != null) {
                                    class70 var73 = new class70();
                                    var73.field853 = var9;
                                    var73.field850 = var9.field2758;
                                    field956.method3289(var73);
                                }
                                if (field1037 > var9.field2686 && var9.field2670 != null) {
                                    class70 var74 = new class70();
                                    var74.field853 = var9;
                                    var74.field850 = var9.field2670;
                                    field956.method3289(var74);
                                }
                                if (field1126 > var9.field2686 && var9.field2762 != null) {
                                    class70 var75 = new class70();
                                    var75.field853 = var9;
                                    var75.field850 = var9.field2762;
                                    field956.method3289(var75);
                                }
                                if (field1127 > var9.field2686 && var9.field2763 != null) {
                                    class70 var76 = new class70();
                                    var76.field853 = var9;
                                    var76.field850 = var9.field2763;
                                    field956.method3289(var76);
                                }
                                if (field1129 > var9.field2686 && var9.field2726 != null) {
                                    class70 var77 = new class70();
                                    var77.field853 = var9;
                                    var77.field850 = var9.field2726;
                                    field956.method3289(var77);
                                }
                                var9.field2686 = field1122;
                                if (var9.field2732 != null) {
                                    for (int var78 = 0; var78 < field1152; var78++) {
                                        class70 var79 = new class70();
                                        var79.field853 = var9;
                                        var79.field856 = field1154[var78];
                                        var79.field857 = field1153[var78];
                                        var79.field850 = var9.field2732;
                                        field956.method3289(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field2651 && field1165 == null && Statics.field1886 == null && !field1069) {
                            if ((var9.field2767 >= 0 || var9.field2770 != 0) && class60.field738 >= var12 && class60.field739 >= var13 && class60.field738 < var14 && class60.field739 < var15) {
                                if (var9.field2767 >= 0) {
                                    Statics.field435 = arg0[var9.field2767];
                                } else {
                                    Statics.field435 = var9;
                                }
                            }
                            if (var9.field2675 == 8 && class60.field738 >= var12 && class60.field739 >= var13 && class60.field738 < var14 && class60.field739 < var15) {
                                Statics.field792 = var9;
                            }
                            if (var9.field2646 > var9.field2689) {
                                method965(var9, var9.field2750 + var10, var11, var9.field2689, var9.field2646, class60.field738, class60.field739);
                            }
                        }
                    } else if ((field1171 == 0 || field1171 == 3) && (class60.field733 == 1 || !Statics.field3203 && class60.field733 == 4)) {
                        class211 var27 = var9.method3657(true);
                        if (var27 != null) {
                            int var28 = class60.field746 - var10;
                            int var29 = class60.field751 - var11;
                            if (var27.method3572(var28, var29)) {
                                int var30 = var28 - var27.field2603 / 2;
                                int var31 = var29 - var27.field2602 / 2;
                                int var32 = field1088 + field1015 & 0x7FF;
                                int var33 = class137.field2053[var32];
                                int var34 = class137.field2041[var32];
                                int var35 = (field1004 + 256) * var33 >> 8;
                                int var36 = (field1004 + 256) * var34 >> 8;
                                int var37 = var30 * var36 + var31 * var35 >> 11;
                                int var38 = var31 * var36 - var30 * var35 >> 11;
                                int var39 = Statics.field1321.field1275 + var37 >> 7;
                                int var40 = Statics.field1321.field1244 - var38 >> 7;
                                field973.method3105(190);
                                field973.method2865(18);
                                field973.method2904(Statics.field387 + var40);
                                field973.method2904(Statics.field562 + var39);
                                field973.method2899(class51.field646[82] ? (class51.field646[81] ? 2 : 1) : 0);
                                field973.method2865(var30);
                                field973.method2865(var31);
                                field973.method2856(field1015);
                                field973.method2865(57);
                                field973.method2865(field1088);
                                field973.method2865(field1004);
                                field973.method2865(89);
                                field973.method2856(Statics.field1321.field1275);
                                field973.method2856(Statics.field1321.field1244);
                                field973.method2865(63);
                                field1163 = var39;
                                field945 = var40;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fl.ie(IIB)V")
    public static final void method2714(int arg0, int arg1) {
        if (class217.method2721(arg0)) {
            method990(Statics.field1309[arg0], arg1);
        }
    }

    @ObfuscatedName("bv.iq([Lhf;IB)V")
    public static final void method990(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2675 == 0) {
                    if (var3.field2776 != null) {
                        method990(var3.field2776, arg1);
                    }
                    class69 var4 = (class69) field1092.method3238((long) var3.field2652);
                    if (var4 != null) {
                        method2714(var4.field848, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2759 != null) {
                    class70 var5 = new class70();
                    var5.field853 = var3;
                    var5.field850 = var3.field2759;
                    class84.method966(var5);
                }
                if (arg1 == 1 && var3.field2760 != null) {
                    if (var3.field2653 >= 0) {
                        class217 var6 = class217.method192(var3.field2652);
                        if (var6 == null || var6.field2776 == null || var3.field2653 >= var6.field2776.length || var6.field2776[var3.field2653] != var3) {
                            continue;
                        }
                    }
                    class70 var7 = new class70();
                    var7.field853 = var3;
                    var7.field850 = var3.field2760;
                    class84.method966(var7);
                }
            }
        }
    }

    @ObfuscatedName("j.is(Lhf;III)V")
    public static final void method67(class217 arg0, int arg1, int arg2) {
        if (field1165 != null || field1069 || arg0 == null || method896(arg0) == null) {
            return;
        }
        field1165 = arg0;
        field1105 = method896(arg0);
        field1106 = arg1;
        field1142 = arg2;
        Statics.field800 = 0;
        field1115 = false;
        int var3 = method971();
        if (var3 == -1) {
            return;
        }
        Statics.field320 = new class90();
        Statics.field320.field1429 = field1071[var3];
        Statics.field320.field1422 = field1072[var3];
        Statics.field320.field1421 = field1178[var3];
        Statics.field320.field1424 = field1074[var3];
        Statics.field320.field1423 = field1075[var3];
    }

    @ObfuscatedName("client.iv(I)V")
    public final void method1040() {
        method162(field1165);
        Statics.field800++;
        if (field1112 && field1109) {
            int var1 = class60.field738;
            int var2 = class60.field739;
            int var3 = var1 - field1106;
            int var4 = var2 - field1142;
            if (var3 < field1064) {
                var3 = field1064;
            }
            if (field1165.field2750 + var3 > field1064 + field1105.field2750) {
                var3 = field1064 + field1105.field2750 - field1165.field2750;
            }
            if (var4 < field1147) {
                var4 = field1147;
            }
            if (field1165.field2689 + var4 > field1147 + field1105.field2689) {
                var4 = field1147 + field1105.field2689 - field1165.field2689;
            }
            int var5 = var3 - field1113;
            int var6 = var4 - field1114;
            int var7 = field1165.field2728;
            if (Statics.field800 > field1165.field2729 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1115 = true;
            }
            int var8 = field1105.field2673 + (var3 - field1064);
            int var9 = field1105.field2754 + (var4 - field1147);
            if (field1165.field2741 != null && field1115) {
                class70 var10 = new class70();
                var10.field853 = field1165;
                var10.field851 = var8;
                var10.field849 = var9;
                var10.field850 = field1165.field2741;
                class84.method966(var10);
            }
            if (class60.field737 == 0) {
                if (field1115) {
                    if (field1165.field2742 != null) {
                        class70 var11 = new class70();
                        var11.field853 = field1165;
                        var11.field851 = var8;
                        var11.field849 = var9;
                        var11.field855 = field1108;
                        var11.field850 = field1165.field2742;
                        class84.method966(var11);
                    }
                    if (field1108 != null) {
                        class217 var12 = field1165;
                        int var13 = Statics.method3573(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class217 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class217.method192(var12.field2786);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            field973.method3105(26);
                            field973.method2856(field1165.field2653);
                            field973.method2904(field1165.field2674);
                            field973.method2956(field1108.field2674);
                            field973.method2956(field1108.field2653);
                            field973.method2882(field1108.field2652);
                            field973.method2882(field1165.field2652);
                        }
                    }
                } else {
                    label133: {
                        label138: {
                            int var18 = method971();
                            if (field1204 > 2) {
                                if (field1068 == 1) {
                                    boolean var19;
                                    if (field1204 <= 0) {
                                        var19 = false;
                                    } else if (field1079 && class51.field646[81] && field1091 != -1) {
                                        var19 = true;
                                    } else {
                                        var19 = false;
                                    }
                                    if (!var19) {
                                        break label138;
                                    }
                                }
                                if (method646(var18)) {
                                    break label138;
                                }
                            }
                            if (field1204 > 0) {
                                int var20 = field1113 + field1106;
                                int var21 = field1142 + field1114;
                                class90 var22 = Statics.field320;
                                method606(var22.field1429, var22.field1422, var22.field1421, var22.field1424, var22.field1423, var22.field1423, var20, var21);
                                Statics.field320 = null;
                            }
                            break label133;
                        }
                        this.method1208(field1113 + field1106, field1142 + field1114);
                    }
                }
                field1165 = null;
            }
        } else if (Statics.field800 > 1) {
            field1165 = null;
        }
    }

    @ObfuscatedName("t.iy(Lhf;I)V")
    public static void method162(class217 arg0) {
        if (field1135 == arg0.field2755) {
            field1136[arg0.field2654] = true;
        }
    }

    @ObfuscatedName("e.im(I)V")
    public static void method1() {
        for (class69 var0 = (class69) field1092.method3236(); var0 != null; var0 = (class69) field1092.method3242()) {
            int var1 = var0.field848;
            if (class217.method2721(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field1309[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2651;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2480;
                    class217 var6 = class217.method192(var5);
                    if (var6 != null) {
                        method162(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bl.it(Lhf;I)Lhf;")
    public static class217 method896(class217 arg0) {
        class217 var1 = arg0;
        int var2 = Statics.method3573(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class217 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class217.method192(var1.field2786);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class217 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2698;
        }
        return var7;
    }

    @ObfuscatedName("cs.ic([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1389(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("iw.ix(IB)V")
    public static final void method3863(int arg0) {
        if (!class217.method2721(arg0)) {
            return;
        }
        class217[] var1 = Statics.field1309[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2676 = 0;
                var3.field2775 = 0;
            }
        }
    }

    @ObfuscatedName("ef.ij(II)V")
    public static final void method2641(int arg0) {
        if (class217.method2721(arg0)) {
            method4122(Statics.field1309[arg0], -1);
        }
    }

    @ObfuscatedName("ib.ig([Lhf;II)V")
    public static final void method4122(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2786 == arg1 && (!var3.field2651 || !method1564(var3))) {
                if (var3.field2675 == 0) {
                    if (!var3.field2651 && method1564(var3) && Statics.field435 != var3) {
                        continue;
                    }
                    method4122(arg0, var3.field2652);
                    if (var3.field2776 != null) {
                        method4122(var3.field2776, var3.field2652);
                    }
                    class69 var4 = (class69) field1092.method3238((long) var3.field2652);
                    if (var4 != null) {
                        method2641(var4.field848);
                    }
                }
                if (var3.field2675 == 6) {
                    if (var3.field2699 != -1 || var3.field2700 != -1) {
                        boolean var5 = method2453(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2700;
                        } else {
                            var6 = var3.field2699;
                        }
                        if (var6 != -1) {
                            class261 var7 = class261.method3748(var6);
                            var3.field2775 += field1120;
                            while (var3.field2775 > var7.field3605[var3.field2676]) {
                                var3.field2775 -= var7.field3605[var3.field2676];
                                var3.field2676++;
                                if (var3.field2676 >= var7.field3600.length) {
                                    var3.field2676 -= var7.field3607;
                                    if (var3.field2676 < 0 || var3.field2676 >= var7.field3600.length) {
                                        var3.field2676 = 0;
                                    }
                                }
                                method162(var3);
                            }
                        }
                    }
                    if (var3.field2708 != 0 && !var3.field2651) {
                        int var8 = var3.field2708 >> 16;
                        int var9 = var3.field2708 << 16 >> 16;
                        int var10 = field1120 * var8;
                        int var11 = field1120 * var9;
                        var3.field2703 = var3.field2703 + var10 & 0x7FF;
                        var3.field2704 = var3.field2704 + var11 & 0x7FF;
                        method162(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.ib(II)V")
    public static final void method40(int arg0) {
        method1();
        for (class83 var1 = (class83) class83.field1349.method3294(); var1 != null; var1 = (class83) class83.field1349.method3296()) {
            if (var1.field1355 != null) {
                var1.method1467();
            }
        }
        int var2 = class242.method152(arg0).field3286;
        if (var2 == 0) {
            return;
        }
        int var3 = class212.field2609[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class137.method2426(0.9D);
                ((class126) Statics.field2050).method2148(0.9D);
            }
            if (var3 == 2) {
                class137.method2426(0.8D);
                ((class126) Statics.field2050).method2148(0.8D);
            }
            if (var3 == 3) {
                class137.method2426(0.7D);
                ((class126) Statics.field2050).method2148(0.7D);
            }
            if (var3 == 4) {
                class137.method2426(0.6D);
                ((class126) Statics.field2050).method2148(0.6D);
            }
            class257.field3490.method3221();
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
            if (field1166 != var4) {
                if (field1166 == 0 && field1167 != -1) {
                    class204.method876(Statics.field341, field1167, 0, var4, false);
                    field1124 = false;
                } else if (var4 == 0) {
                    class204.method2789();
                    field1124 = false;
                } else {
                    class204.method969(var4);
                }
                field1166 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1169 = 127;
            }
            if (var3 == 1) {
                field1169 = 96;
            }
            if (var3 == 2) {
                field1169 = 64;
            }
            if (var3 == 3) {
                field1169 = 32;
            }
            if (var3 == 4) {
                field1169 = 0;
            }
        }
        if (var2 == 5) {
            field1068 = var3;
        }
        if (var2 == 6) {
            field1093 = var3;
        }
        if (var2 == 9) {
            field1006 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1170 = 127;
            }
            if (var3 == 1) {
                field1170 = 96;
            }
            if (var3 == 2) {
                field1170 = 64;
            }
            if (var3 == 3) {
                field1170 = 32;
            }
            if (var3 == 4) {
                field1170 = 0;
            }
        }
        if (var2 == 17) {
            field1194 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class92[] var5 = new class92[] { class92.field1436, class92.field1440, class92.field1441, class92.field1437 };
            field954 = (class92) class169.method1610(var5, var3);
            if (field954 == null) {
                field954 = class92.field1441;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field1060 = -1;
            } else {
                field1060 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class92[] var6 = new class92[] { class92.field1436, class92.field1440, class92.field1441, class92.field1437 };
        field985 = (class92) class169.method1610(var6, var3);
        if (field985 == null) {
            field985 = class92.field1441;
        }
    }

    @ObfuscatedName("at.iz(I)V")
    public static final void method226() {
        field973.method3105(156);
        for (class69 var0 = (class69) field1092.method3236(); var0 != null; var0 = (class69) field1092.method3242()) {
            if (var0.field841 == 0 || var0.field841 == 3) {
                method945(var0, true);
            }
        }
        if (field964 != null) {
            method162(field964);
            field964 = null;
        }
    }

    @ObfuscatedName("ag.iu(IIII)Lbw;")
    public static final class69 method513(int arg0, int arg1, int arg2) {
        class69 var3 = new class69();
        var3.field848 = arg1;
        var3.field841 = arg2;
        field1092.method3234(var3, (long) arg0);
        method3863(arg1);
        class217 var4 = class217.method192(arg0);
        method162(var4);
        if (field964 != null) {
            method162(field964);
            field964 = null;
        }
        method999();
        method3876(Statics.field1309[arg0 >> 16], var4, false);
        class84.method1573(arg1);
        if (field1164 != -1) {
            method2714(field1164, 1);
        }
        return var3;
    }

    @ObfuscatedName("bq.if(Lbw;ZB)V")
    public static final void method945(class69 arg0, boolean arg1) {
        int var2 = arg0.field848;
        int var3 = (int) arg0.field2480;
        arg0.method3278();
        if (arg1) {
            Statics.method453(var2);
        }
        for (class199 var4 = (class199) field1133.method3236(); var4 != null; var4 = (class199) field1133.method3242()) {
            if ((var4.field2480 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3278();
            }
        }
        class217 var5 = class217.method192(var3);
        if (var5 != null) {
            method162(var5);
        }
        method999();
        if (field1164 != -1) {
            method2714(field1164, 1);
        }
    }

    @ObfuscatedName("aw.io(Lhf;I)Z")
    public static final boolean method306(class217 arg0) {
        int var1 = arg0.field2656;
        if (var1 == 205) {
            field983 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1202.method3607(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1202.method3608(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1202.method3609(false);
        }
        if (var1 == 325) {
            field1202.method3609(true);
        }
        if (var1 == 326) {
            field973.method3105(46);
            field1202.method3631(field973);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bc.id(Lhf;IIII)V")
    public static final void method1377(class217 arg0, int arg1, int arg2, int arg3) {
        method975();
        class211 var4 = arg0.method3657(false);
        if (var4 == null) {
            return;
        }
        class282.method4578(arg1, arg2, var4.field2603 + arg1, var4.field2602 + arg2);
        if (field1171 == 2 || field1171 == 5) {
            class282.method4576(arg1, arg2, 0, var4.field2604, var4.field2606);
        } else {
            int var5 = field1088 + field1015 & 0x7FF;
            int var6 = Statics.field1321.field1275 / 32 + 48;
            int var7 = 464 - Statics.field1321.field1244 / 32;
            Statics.field565.method4686(arg1, arg2, var4.field2603, var4.field2602, var6, var7, var5, field1004 + 256, var4.field2604, var4.field2606);
            for (int var8 = 0; var8 < field1159; var8++) {
                int var9 = field1076[var8] * 4 + 2 - Statics.field1321.field1275 / 32;
                int var10 = field1161[var8] * 4 + 2 - Statics.field1321.field1244 / 32;
                method142(arg1, arg2, var9, var10, field1111[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class194 var13 = field939[Statics.field2158][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1321.field1275 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1321.field1244 / 32;
                        method142(arg1, arg2, var14, var15, Statics.field1213[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field969; var16++) {
                class87 var17 = field968[field951[var16]];
                if (var17 != null && var17.method1006()) {
                    class259 var18 = var17.field1396;
                    if (var18 != null && var18.field3552 != null) {
                        var18 = var18.method4299();
                    }
                    if (var18 != null && var18.field3567 && var18.field3560) {
                        int var19 = var17.field1275 / 32 - Statics.field1321.field1275 / 32;
                        int var20 = var17.field1244 / 32 - Statics.field1321.field1244 / 32;
                        method142(arg1, arg2, var19, var20, Statics.field1213[1], var4);
                    }
                }
            }
            int var21 = class97.field1508;
            int[] var22 = class97.field1509;
            for (int var23 = 0; var23 < var21; var23++) {
                class75 var24 = field1051[var22[var23]];
                if (var24 != null && var24.method1006() && !var24.field914 && Statics.field1321 != var24) {
                    int var25 = var24.field1275 / 32 - Statics.field1321.field1275 / 32;
                    int var26 = var24.field1244 / 32 - Statics.field1321.field1244 / 32;
                    boolean var27 = false;
                    if (method1609(var24.field906, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field39; var29++) {
                        if (var24.field906.equals(Statics.field1241[var29].field928)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field1321.field910 != 0 && var24.field910 != 0 && Statics.field1321.field910 == var24.field910) {
                        var30 = true;
                    }
                    if (var27) {
                        method142(arg1, arg2, var25, var26, Statics.field1213[3], var4);
                    } else if (var30) {
                        method142(arg1, arg2, var25, var26, Statics.field1213[4], var4);
                    } else if (var28) {
                        method142(arg1, arg2, var25, var26, Statics.field1213[5], var4);
                    } else {
                        method142(arg1, arg2, var25, var26, Statics.field1213[2], var4);
                    }
                }
            }
            if (field946 != 0 && field938 % 20 < 10) {
                if (field946 == 1 && field947 >= 0 && field947 < field968.length) {
                    class87 var31 = field968[field947];
                    if (var31 != null) {
                        int var32 = var31.field1275 / 32 - Statics.field1321.field1275 / 32;
                        int var33 = var31.field1244 / 32 - Statics.field1321.field1244 / 32;
                        method3560(arg1, arg2, var32, var33, Statics.field783[1], var4);
                    }
                }
                if (field946 == 2) {
                    int var34 = field949 * 4 - Statics.field562 * 4 + 2 - Statics.field1321.field1275 / 32;
                    int var35 = field950 * 4 - Statics.field387 * 4 + 2 - Statics.field1321.field1244 / 32;
                    method3560(arg1, arg2, var34, var35, Statics.field783[1], var4);
                }
                if (field946 == 10 && field948 >= 0 && field948 < field1051.length) {
                    class75 var36 = field1051[field948];
                    if (var36 != null) {
                        int var37 = var36.field1275 / 32 - Statics.field1321.field1275 / 32;
                        int var38 = var36.field1244 / 32 - Statics.field1321.field1244 / 32;
                        method3560(arg1, arg2, var37, var38, Statics.field783[1], var4);
                    }
                }
            }
            if (field1163 != 0) {
                int var39 = field1163 * 4 + 2 - Statics.field1321.field1275 / 32;
                int var40 = field945 * 4 + 2 - Statics.field1321.field1244 / 32;
                method142(arg1, arg2, var39, var40, Statics.field783[0], var4);
            }
            if (!Statics.field1321.field914) {
                class282.method4561(var4.field2603 / 2 + arg1 - 1, var4.field2602 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1137[arg3] = true;
    }

    @ObfuscatedName("am.ir(Lhf;IIII)V")
    public static final void method649(class217 arg0, int arg1, int arg2, int arg3) {
        class211 var4 = arg0.method3657(false);
        if (var4 == null) {
            return;
        }
        if (field1171 < 3) {
            Statics.field1661.method4686(arg1, arg2, var4.field2603, var4.field2602, 25, 25, field1015, 256, var4.field2604, var4.field2606);
        } else {
            class282.method4576(arg1, arg2, 0, var4.field2604, var4.field2606);
        }
    }

    @ObfuscatedName("hz.je(IIIILjs;Lhw;I)V")
    public static final void method3560(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method142(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field1088 + field1015 & 0x7FF;
        int var8 = class137.field2053[var7];
        int var9 = class137.field2041[var7];
        int var10 = var8 * 256 / (field1004 + 256);
        int var11 = var9 * 256 / (field1004 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2789.method4687(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("p.jk(IIIILjs;Lhw;I)V")
    public static final void method142(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field1088 + field1015 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field2053[var6];
        int var9 = class137.field2041[var6];
        int var10 = var8 * 256 / (field1004 + 256);
        int var11 = var9 * 256 / (field1004 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4747(arg5.field2603 / 2 + var12 - arg4.field3779 / 2, arg5.field2602 / 2 - var13 - arg4.field3785 / 2, arg0, arg1, arg5.field2603, arg5.field2602, arg5.field2604, arg5.field2606);
        } else {
            arg4.method4676(arg5.field2603 / 2 + arg0 + var12 - arg4.field3779 / 2, arg5.field2602 / 2 + arg1 - var13 - arg4.field3785 / 2);
        }
    }

    @ObfuscatedName("cu.ju(Ljava/lang/String;ZI)Z")
    public static boolean method1609(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method2702(arg0, Statics.field1332);
        for (int var3 = 0; var3 < field1196; var3++) {
            if (var2.equalsIgnoreCase(class268.method2702(field952[var3].field814, Statics.field1332)) && (!arg1 || field952[var3].field816 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method2702(Statics.field1321.field906, Statics.field1332))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("he.ji(Ljava/lang/String;I)Z")
    public static boolean method3580(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method2702(arg0, Statics.field1332);
        for (int var2 = 0; var2 < field1200; var2++) {
            class71 var3 = field1201[var2];
            if (var1.equalsIgnoreCase(class268.method2702(var3.field864, Statics.field1332))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method2702(var3.field865, Statics.field1332))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("by.jn(Ljava/lang/String;I)V")
    public static final void method967(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method2702(arg0, Statics.field1332);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1196; var2++) {
            class66 var3 = field952[var2];
            String var4 = var3.field814;
            String var5 = class268.method2702(var4, Statics.field1332);
            if (class278.method2704(arg0, var1, var4, var5)) {
                field1196--;
                for (int var6 = var2; var6 < field1196; var6++) {
                    field952[var6] = field952[var6 + 1];
                }
                field1067 = field1122;
                field973.method3105(255);
                field973.method2865(class174.method12(arg0));
                field973.method2879(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cl.jx(Lhf;I)Z")
    public static boolean method1564(class217 arg0) {
        if (field1101) {
            if (Statics.method3573(arg0) != 0) {
                return false;
            }
            if (arg0.field2675 == 0) {
                return false;
            }
        }
        return arg0.field2672;
    }

    @ObfuscatedName("df.jb(Lhf;IB)Ljava/lang/String;")
    public static String method2166(class217 arg0, int arg1) {
        if (!class218.method126(Statics.method3573(arg0), arg1) && arg0.field2752 == null) {
            return null;
        } else if (arg0.field2766 == null || arg0.field2766.length <= arg1 || arg0.field2766[arg1] == null || arg0.field2766[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2766[arg1];
        }
    }

    @ObfuscatedName("bl.jf(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method898(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field932 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field932 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field932 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field932 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field932 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field834 != null) {
            var3 = "/p=" + Statics.field834;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field1078 + "/a=" + Statics.field313 + var3 + "/";
    }

    @ObfuscatedName("fv.jo(Ljava/lang/String;I)V")
    public static void method2840(String arg0) {
        Statics.field834 = arg0;
        try {
            String var1 = Statics.field1215.getParameter(class275.field3729.field3732);
            String var2 = Statics.field1215.getParameter(class275.field3730.field3732);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class176.method89() + 94608000000L;
                class183.field2456.setTime(new Date(var6));
                int var8 = class183.field2456.get(7);
                int var9 = class183.field2456.get(5);
                int var10 = class183.field2456.get(2);
                int var11 = class183.field2456.get(1);
                int var12 = class183.field2456.get(11);
                int var13 = class183.field2456.get(12);
                int var14 = class183.field2456.get(13);
                String var15 = class183.field2452[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class183.field2453[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field1215;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("v.jj([BII)V")
    public static void method3(byte[] arg0, int arg1) {
        if (field967 == null) {
            field967 = new byte[24];
        }
        class184.method3172(arg0, arg1, field967, 0, 24);
    }

    @ObfuscatedName("t.jv(Lfx;IB)V")
    public static void method163(class174 arg0, int arg1) {
        method3(arg0.field2415, arg1);
        if (class156.field2269 == null) {
            return;
        }
        try {
            class156.field2269.method2097(0L);
            class156.field2269.method2102(arg0.field2415, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("an.jq(Lfx;I)V")
    public static void method214(class174 arg0) {
        if (field967 != null) {
            arg0.method2864(field967, 0, field967.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class156.field2269.method2097(0L);
            class156.field2269.method2099(var1);
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
        arg0.method2864(var1, 0, var1.length);
    }
}

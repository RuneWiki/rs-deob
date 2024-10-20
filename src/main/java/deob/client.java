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
    public static class162[] field967 = new class162[4];

    @ObfuscatedName("client.ay")
    public static boolean field909 = true;

    @ObfuscatedName("client.ao")
    public static int field1012 = 1;

    @ObfuscatedName("client.ac")
    public static int field1087 = 0;

    @ObfuscatedName("client.bp")
    public static int field1021 = 0;

    @ObfuscatedName("client.bd")
    public static boolean field1039 = false;

    @ObfuscatedName("client.bl")
    public static boolean field912 = false;

    @ObfuscatedName("client.bc")
    public static int field913 = 0;

    @ObfuscatedName("client.bo")
    public static int field914 = 0;

    @ObfuscatedName("client.bk")
    public static boolean field988 = true;

    @ObfuscatedName("client.bw")
    public static int field934 = 0;

    @ObfuscatedName("client.bg")
    public static long field917 = -1L;

    @ObfuscatedName("client.bz")
    public static int field918 = -1;

    @ObfuscatedName("client.br")
    public static int field919 = -1;

    @ObfuscatedName("client.bf")
    public static int field920 = -1;

    @ObfuscatedName("client.bj")
    public static boolean field1070 = true;

    @ObfuscatedName("client.bq")
    public static boolean field922 = false;

    @ObfuscatedName("client.bv")
    public static int field987 = 0;

    @ObfuscatedName("client.bu")
    public static int field1121 = 0;

    @ObfuscatedName("client.be")
    public static int field925 = 0;

    @ObfuscatedName("client.bx")
    public static int field928 = 0;

    @ObfuscatedName("client.bm")
    public static int field927 = 0;

    @ObfuscatedName("client.by")
    public static int field908 = 0;

    @ObfuscatedName("client.ca")
    public static int field929 = 0;

    @ObfuscatedName("client.cs")
    public static int field930 = 0;

    @ObfuscatedName("client.cx")
    public static int field931 = 0;

    @ObfuscatedName("client.cu")
    public static class92 field932 = class92.field1410;

    @ObfuscatedName("client.cy")
    public static class92 field933 = class92.field1410;

    @ObfuscatedName("client.ch")
    public static int field976 = 0;

    @ObfuscatedName("client.cf")
    public static int field1139 = 0;

    @ObfuscatedName("client.cl")
    public static int field936 = 0;

    @ObfuscatedName("client.ds")
    public static int field938 = 0;

    @ObfuscatedName("client.dc")
    public static int field910 = 0;

    @ObfuscatedName("client.dx")
    public static int field940 = 0;

    @ObfuscatedName("client.du")
    public static int field942 = 0;

    @ObfuscatedName("client.dn")
    public static int field955 = 0;

    @ObfuscatedName("client.df")
    public static byte[] field943 = null;

    @ObfuscatedName("client.dg")
    public static class87[] field1110 = new class87[32768];

    @ObfuscatedName("client.dk")
    public static int field945 = 0;

    @ObfuscatedName("client.da")
    public static int[] field946 = new int[32768];

    @ObfuscatedName("client.dj")
    public static int field1146 = 0;

    @ObfuscatedName("client.dv")
    public static int[] field948 = new int[250];

    @ObfuscatedName("client.ei")
    public static class180 field949 = new class180(5000);

    @ObfuscatedName("client.ej")
    public static class180 field950 = new class180(5000);

    @ObfuscatedName("client.ew")
    public static class180 field951 = new class180(15000);

    @ObfuscatedName("client.eq")
    public static int field1048 = 0;

    @ObfuscatedName("client.ep")
    public static int field953 = 0;

    @ObfuscatedName("client.ez")
    public static int field1091 = 0;

    @ObfuscatedName("client.eb")
    public static int field1149 = 0;

    @ObfuscatedName("client.em")
    public static int field956 = 0;

    @ObfuscatedName("client.el")
    public static int field957 = 0;

    @ObfuscatedName("client.ef")
    public static int field958 = 0;

    @ObfuscatedName("client.ea")
    public static int field959 = 0;

    @ObfuscatedName("client.eu")
    public static boolean field969 = false;

    @ObfuscatedName("client.ee")
    public static HashMap field961 = new HashMap();

    @ObfuscatedName("client.ey")
    public static int field962 = 0;

    @ObfuscatedName("client.fh")
    public static int field963 = 1;

    @ObfuscatedName("client.fd")
    public static int field964 = 0;

    @ObfuscatedName("client.fu")
    public static int field965 = 1;

    @ObfuscatedName("client.fq")
    public static int field972 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field968 = false;

    @ObfuscatedName("client.fm")
    public static int[][][] field1120 = new int[4][13][13];

    @ObfuscatedName("client.fw")
    public static final int[] field935 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fi")
    public static int field971 = 0;

    @ObfuscatedName("client.fe")
    public static int field1114 = 2;

    @ObfuscatedName("client.fn")
    public static int field1051 = 0;

    @ObfuscatedName("client.fo")
    public static int field974 = 2;

    @ObfuscatedName("client.fb")
    public static int field970 = 0;

    @ObfuscatedName("client.fx")
    public static int field923 = 1;

    @ObfuscatedName("client.fc")
    public static int field977 = 0;

    @ObfuscatedName("client.ff")
    public static int field978 = 0;

    @ObfuscatedName("client.fg")
    public static int field979 = 2;

    @ObfuscatedName("client.fy")
    public static int field980 = 0;

    @ObfuscatedName("client.gh")
    public static int field981 = 1;

    @ObfuscatedName("client.gy")
    public static int field982 = 0;

    @ObfuscatedName("client.gb")
    public static int field983 = 0;

    @ObfuscatedName("client.gp")
    public static int field984 = 2301979;

    @ObfuscatedName("client.gr")
    public static int field975 = 5063219;

    @ObfuscatedName("client.gj")
    public static int field986 = 3353893;

    @ObfuscatedName("client.gs")
    public static int field1145 = 7759444;

    @ObfuscatedName("client.gx")
    public static boolean field1122 = false;

    @ObfuscatedName("client.gz")
    public static int field989 = 0;

    @ObfuscatedName("client.gu")
    public static int field990 = 128;

    @ObfuscatedName("client.hm")
    public static int field991 = 0;

    @ObfuscatedName("client.hc")
    public static int field992 = 0;

    @ObfuscatedName("client.he")
    public static int field993 = 0;

    @ObfuscatedName("client.hl")
    public static int field1066 = 0;

    @ObfuscatedName("client.hd")
    public static int field995 = 0;

    @ObfuscatedName("client.hu")
    public static int field996 = 50;

    @ObfuscatedName("client.hy")
    public static int field997 = 0;

    @ObfuscatedName("client.ha")
    public static boolean field998 = false;

    @ObfuscatedName("client.hr")
    public static int field999 = 0;

    @ObfuscatedName("client.hx")
    public static int field1000 = 0;

    @ObfuscatedName("client.hj")
    public static int field1189 = 50;

    @ObfuscatedName("client.hh")
    public static int[] field1187 = new int[field1189];

    @ObfuscatedName("client.ht")
    public static int[] field1003 = new int[field1189];

    @ObfuscatedName("client.hg")
    public static int[] field1004 = new int[field1189];

    @ObfuscatedName("client.hf")
    public static int[] field1005 = new int[field1189];

    @ObfuscatedName("client.hi")
    public static int[] field1006 = new int[field1189];

    @ObfuscatedName("client.hk")
    public static int[] field1164 = new int[field1189];

    @ObfuscatedName("client.hq")
    public static int[] field1168 = new int[field1189];

    @ObfuscatedName("client.hn")
    public static String[] field1009 = new String[field1189];

    @ObfuscatedName("client.hw")
    public static int[][] field1010 = new int[104][104];

    @ObfuscatedName("client.hb")
    public static int field1011 = 0;

    @ObfuscatedName("client.hz")
    public static int field994 = -1;

    @ObfuscatedName("client.ho")
    public static int field1013 = -1;

    @ObfuscatedName("client.hs")
    public static int field1014 = 0;

    @ObfuscatedName("client.in")
    public static int field1072 = 0;

    @ObfuscatedName("client.if")
    public static int field1016 = 0;

    @ObfuscatedName("client.il")
    public static int field1017 = 0;

    @ObfuscatedName("client.iw")
    public static int field1018 = 0;

    @ObfuscatedName("client.iu")
    public static int field1049 = 0;

    @ObfuscatedName("client.ie")
    public static int field944 = 0;

    @ObfuscatedName("client.iy")
    public static int field1033 = 0;

    @ObfuscatedName("client.ii")
    public static int field1022 = 0;

    @ObfuscatedName("client.ij")
    public static int field1023 = 0;

    @ObfuscatedName("client.it")
    public static String field1159 = null;

    @ObfuscatedName("client.iq")
    public static boolean field1024 = false;

    @ObfuscatedName("client.ia")
    public static int field1052 = 0;

    @ObfuscatedName("client.ih")
    public static int field1026 = 0;

    @ObfuscatedName("client.id")
    public static class75[] field1130 = new class75[2048];

    @ObfuscatedName("client.ir")
    public static int field1028 = -1;

    @ObfuscatedName("client.im")
    public static int field1029 = 0;

    @ObfuscatedName("client.ip")
    public static int field1030 = 0;

    @ObfuscatedName("client.ic")
    public static int[] field1031 = new int[1000];

    @ObfuscatedName("client.jk")
    public static final int[] field1032 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jy")
    public static String[] field1129 = new String[8];

    @ObfuscatedName("client.jc")
    public static boolean[] field1034 = new boolean[8];

    @ObfuscatedName("client.js")
    public static int[] field1035 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ji")
    public static int field926 = -1;

    @ObfuscatedName("client.jh")
    public static class194[][][] field1037 = new class194[4][104][104];

    @ObfuscatedName("client.jo")
    public static class194 field1108 = new class194();

    @ObfuscatedName("client.ja")
    public static class194 field1174 = new class194();

    @ObfuscatedName("client.jl")
    public static class194 field1040 = new class194();

    @ObfuscatedName("client.jd")
    public static int[] field1041 = new int[25];

    @ObfuscatedName("client.jw")
    public static int[] field1042 = new int[25];

    @ObfuscatedName("client.je")
    public static int[] field1043 = new int[25];

    @ObfuscatedName("client.jr")
    public static int field1044 = 0;

    @ObfuscatedName("client.jn")
    public static boolean field1045 = false;

    @ObfuscatedName("client.jb")
    public static int field1038 = 0;

    @ObfuscatedName("client.jx")
    public static int[] field1001 = new int[500];

    @ObfuscatedName("client.ju")
    public static int[] field954 = new int[500];

    @ObfuscatedName("client.jp")
    public static int[] field985 = new int[500];

    @ObfuscatedName("client.jf")
    public static int[] field1050 = new int[500];

    @ObfuscatedName("client.jt")
    public static String[] field1147 = new String[500];

    @ObfuscatedName("client.kf")
    public static String[] field1123 = new String[500];

    @ObfuscatedName("client.kl")
    public static boolean field1053 = false;

    @ObfuscatedName("client.ko")
    public static int field941 = -1;

    @ObfuscatedName("client.ky")
    public static boolean field1055 = false;

    @ObfuscatedName("client.kk")
    public static int field1056 = -1;

    @ObfuscatedName("client.kx")
    public static int field916 = -1;

    @ObfuscatedName("client.kd")
    public static int field1133 = 0;

    @ObfuscatedName("client.kc")
    public static int field1184 = 50;

    @ObfuscatedName("client.kr")
    public static int field1078 = 0;

    @ObfuscatedName("client.kw")
    public static boolean field1062 = false;

    @ObfuscatedName("client.kt")
    public static int field1063 = -1;

    @ObfuscatedName("client.kq")
    public static int field1064 = -1;

    @ObfuscatedName("client.ku")
    public static String field1065 = null;

    @ObfuscatedName("client.kz")
    public static String field1020 = null;

    @ObfuscatedName("client.kb")
    public static int field1019 = -1;

    @ObfuscatedName("client.kn")
    public static class191 field1068 = new class191(8);

    @ObfuscatedName("client.kh")
    public static int field1069 = 0;

    @ObfuscatedName("client.kg")
    public static int field973 = 0;

    @ObfuscatedName("client.ki")
    public static class217 field1071 = null;

    @ObfuscatedName("client.le")
    public static int field915 = 0;

    @ObfuscatedName("client.ly")
    public static int field1073 = 0;

    @ObfuscatedName("client.lk")
    public static int field1074 = 0;

    @ObfuscatedName("client.lr")
    public static int field1075 = -1;

    @ObfuscatedName("client.lv")
    public static boolean field1076 = false;

    @ObfuscatedName("client.lh")
    public static boolean field1077 = false;

    @ObfuscatedName("client.lm")
    public static boolean field1027 = false;

    @ObfuscatedName("client.ld")
    public static class217 field1079 = null;

    @ObfuscatedName("client.la")
    public static class217 field1080 = null;

    @ObfuscatedName("client.lz")
    public static class217 field921 = null;

    @ObfuscatedName("client.lx")
    public static int field1082 = 0;

    @ObfuscatedName("client.lb")
    public static int field1083 = 0;

    @ObfuscatedName("client.lg")
    public static class217 field1084 = null;

    @ObfuscatedName("client.lc")
    public static boolean field1085 = false;

    @ObfuscatedName("client.lw")
    public static int field1086 = -1;

    @ObfuscatedName("client.lp")
    public static int field1138 = -1;

    @ObfuscatedName("client.lu")
    public static boolean field1088 = false;

    @ObfuscatedName("client.lf")
    public static int field1047 = -1;

    @ObfuscatedName("client.lo")
    public static int field1090 = -1;

    @ObfuscatedName("client.ln")
    public static boolean field1175 = false;

    @ObfuscatedName("client.lt")
    public static int field1046 = 1;

    @ObfuscatedName("client.mr")
    public static int[] field1093 = new int[32];

    @ObfuscatedName("client.mf")
    public static int field1094 = 0;

    @ObfuscatedName("client.mk")
    public static int[] field1095 = new int[32];

    @ObfuscatedName("client.mq")
    public static int field1096 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field1097 = new int[32];

    @ObfuscatedName("client.mh")
    public static int field1098 = 0;

    @ObfuscatedName("client.mt")
    public static int field911 = 0;

    @ObfuscatedName("client.mx")
    public static int field1100 = 0;

    @ObfuscatedName("client.mw")
    public static int field1101 = 0;

    @ObfuscatedName("client.ms")
    public static int field1102 = 0;

    @ObfuscatedName("client.ml")
    public static int field1103 = 0;

    @ObfuscatedName("client.mi")
    public static int field1104 = 0;

    @ObfuscatedName("client.mn")
    public static int field1105 = 0;

    @ObfuscatedName("client.mp")
    public static class194 field1106 = new class194();

    @ObfuscatedName("client.mb")
    public static class194 field1107 = new class194();

    @ObfuscatedName("client.mm")
    public static class194 field1116 = new class194();

    @ObfuscatedName("client.ma")
    public static class191 field1109 = new class191(512);

    @ObfuscatedName("client.mz")
    public static int field1007 = 0;

    @ObfuscatedName("client.me")
    public static int field1111 = -2;

    @ObfuscatedName("client.mc")
    public static boolean[] field1112 = new boolean[100];

    @ObfuscatedName("client.my")
    public static boolean[] field1113 = new boolean[100];

    @ObfuscatedName("client.mv")
    public static boolean[] field939 = new boolean[100];

    @ObfuscatedName("client.nv")
    public static int[] field1099 = new int[100];

    @ObfuscatedName("client.ng")
    public static int[] field960 = new int[100];

    @ObfuscatedName("client.nk")
    public static int[] field1117 = new int[100];

    @ObfuscatedName("client.nu")
    public static int[] field1118 = new int[100];

    @ObfuscatedName("client.na")
    public static int field1119 = 0;

    @ObfuscatedName("client.nd")
    public static long field952 = 0L;

    @ObfuscatedName("client.nj")
    public static boolean field1151 = true;

    @ObfuscatedName("client.nm")
    public static int[] field1025 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nh")
    public static int field1061 = 0;

    @ObfuscatedName("client.ni")
    public static int field1124 = 0;

    @ObfuscatedName("client.nw")
    public static String field1125 = "";

    @ObfuscatedName("client.no")
    public static long[] field1126 = new long[100];

    @ObfuscatedName("client.ne")
    public static int field1127 = 0;

    @ObfuscatedName("client.nt")
    public static int field907 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field1002 = new int[128];

    @ObfuscatedName("client.np")
    public static int[] field1170 = new int[128];

    @ObfuscatedName("client.nx")
    public static long field1131 = -1L;

    @ObfuscatedName("client.ok")
    public static String field1132 = null;

    @ObfuscatedName("client.ow")
    public static String field1058 = null;

    @ObfuscatedName("client.oo")
    public static int field1134 = -1;

    @ObfuscatedName("client.or")
    public static int field1135 = 0;

    @ObfuscatedName("client.ov")
    public static int[] field1136 = new int[1000];

    @ObfuscatedName("client.om")
    public static int[] field1137 = new int[1000];

    @ObfuscatedName("client.ob")
    public static class286[] field1036 = new class286[1000];

    @ObfuscatedName("client.od")
    public static int field1115 = 0;

    @ObfuscatedName("client.of")
    public static int field1140 = 0;

    @ObfuscatedName("client.oi")
    public static int field1141 = 0;

    @ObfuscatedName("client.oj")
    public static int field924 = 255;

    @ObfuscatedName("client.op")
    public static int field1143 = -1;

    @ObfuscatedName("client.oq")
    public static boolean field947 = false;

    @ObfuscatedName("client.oz")
    public static int field1060 = 127;

    @ObfuscatedName("client.on")
    public static int field1173 = 127;

    @ObfuscatedName("client.pt")
    public static int field1081 = 0;

    @ObfuscatedName("client.pf")
    public static int[] field1148 = new int[50];

    @ObfuscatedName("client.pz")
    public static int[] field966 = new int[50];

    @ObfuscatedName("client.pg")
    public static int[] field1150 = new int[50];

    @ObfuscatedName("client.pl")
    public static int[] field1015 = new int[50];

    @ObfuscatedName("client.pe")
    public static class106[] field1152 = new class106[50];

    @ObfuscatedName("client.pv")
    public static boolean field1153 = false;

    @ObfuscatedName("client.pn")
    public static boolean[] field1154 = new boolean[5];

    @ObfuscatedName("client.pw")
    public static int[] field1155 = new int[5];

    @ObfuscatedName("client.pd")
    public static int[] field1156 = new int[5];

    @ObfuscatedName("client.qr")
    public static int[] field1157 = new int[5];

    @ObfuscatedName("client.qm")
    public static int[] field1158 = new int[5];

    @ObfuscatedName("client.qk")
    public static short field1008 = 256;

    @ObfuscatedName("client.qf")
    public static short field1160 = 205;

    @ObfuscatedName("client.qj")
    public static short field1161 = 256;

    @ObfuscatedName("client.qq")
    public static short field1162 = 320;

    @ObfuscatedName("client.qh")
    public static short field1163 = 1;

    @ObfuscatedName("client.ql")
    public static short field1128 = 32767;

    @ObfuscatedName("client.qd")
    public static short field1165 = 1;

    @ObfuscatedName("client.qt")
    public static short field1166 = 32767;

    @ObfuscatedName("client.qc")
    public static int field1167 = 0;

    @ObfuscatedName("client.qv")
    public static int field1144 = 0;

    @ObfuscatedName("client.qu")
    public static int field1169 = 0;

    @ObfuscatedName("client.qp")
    public static int field1142 = 0;

    @ObfuscatedName("client.qz")
    public static int field1171 = 0;

    @ObfuscatedName("client.qa")
    public static int field1172 = 0;

    @ObfuscatedName("client.qb")
    public static int field1057 = 0;

    @ObfuscatedName("client.qg")
    public static class66[] field1089 = new class66[400];

    @ObfuscatedName("client.qi")
    public static class196 field1180 = new class196();

    @ObfuscatedName("client.qs")
    public static int field1176 = 0;

    @ObfuscatedName("client.qe")
    public static class71[] field1177 = new class71[400];

    @ObfuscatedName("client.qo")
    public static class214 field1178 = new class214();

    @ObfuscatedName("client.qn")
    public static int field1179 = -1;

    @ObfuscatedName("client.qw")
    public static int field1067 = -1;

    @ObfuscatedName("client.rl")
    public static class17[] field1181 = new class17[8];

    @ObfuscatedName("client.rf")
    public static long field1183 = -1L;

    @ObfuscatedName("client.ra")
    public static long field1054 = -1L;

    @ObfuscatedName("client.rt")
    public static final class74 field1185 = new class74();

    @ObfuscatedName("client.rk")
    public static int[] field1186 = new int[50];

    @ObfuscatedName("client.rh")
    public static int[] field1092 = new int[50];

    @ObfuscatedName("ad.fh(B)Lke;")
    public static class289 method485() {
        return Statics.field276;
    }

    @ObfuscatedName("client.al(I)V")
    public final void method768() {
    }

    public final void init() {
        if (!this.method810()) {
            return;
        }
        class275[] var1 = new class275[] { class275.field3714, class275.field3715, class275.field3728, class275.field3713, class275.field3723, class275.field3718, class275.field3719, class275.field3721, class275.field3717, class275.field3725, class275.field3722, class275.field3726, class275.field3727, class275.field3716, class275.field3720 };
        class275[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class275 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3724);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3724)) {
                    case 2:
                        Statics.field438 = Integer.parseInt(var5);
                        break;
                    case 3:
                        Statics.field734 = var5;
                    case 4:
                    case 14:
                    default:
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class89.field1395)) {
                            field1039 = true;
                        } else {
                            field1039 = false;
                        }
                        break;
                    case 6:
                        Statics.field238 = var5;
                        break;
                    case 7:
                        class233[] var12 = new class233[] { class233.field3194, class233.field3196, class233.field3193, class233.field3195, class233.field3198, class233.field3197 };
                        Statics.field1516 = (class233) class169.method1334(var12, Integer.parseInt(var5));
                        if (Statics.field1516 == class233.field3194) {
                            Statics.field2318 = class290.field3858;
                        } else {
                            Statics.field2318 = class290.field3861;
                        }
                        break;
                    case 8:
                        int var6 = Integer.parseInt(var5);
                        class232[] var7 = new class232[] { class232.field3188, class232.field3186, class232.field3185, class232.field3189 };
                        class232[] var8 = var7;
                        int var9 = 0;
                        class232 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class232 var10 = var8[var9];
                            if (var10.field3187 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field270 = var11;
                        break;
                    case 9:
                        field1087 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field1021 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field913 = Integer.parseInt(var5);
                        break;
                    case 12:
                        if (var5.equalsIgnoreCase(class89.field1395)) {
                        }
                        break;
                    case 13:
                        Statics.field372 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field1012 = Integer.parseInt(var5);
                }
            }
        }
        method448();
        Statics.field322 = this.getCodeBase().getHost();
        String var13 = Statics.field270.field3190;
        byte var14 = 0;
        try {
            Statics.field2242 = 17;
            Statics.field513 = var14;
            try {
                Statics.field2249 = System.getProperty("os.name");
            } catch (Exception var59) {
                Statics.field2249 = "Unknown";
            }
            Statics.field290 = Statics.field2249.toLowerCase();
            try {
                Statics.field813 = System.getProperty("user.home");
                if (Statics.field813 != null) {
                    Statics.field813 = Statics.field813 + "/";
                }
            } catch (Exception var58) {
            }
            try {
                if (Statics.field290.startsWith("win")) {
                    if (Statics.field813 == null) {
                        Statics.field813 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field813 == null) {
                    Statics.field813 = System.getenv("HOME");
                }
                if (Statics.field813 != null) {
                    Statics.field813 = Statics.field813 + "/";
                }
            } catch (Exception var57) {
            }
            if (Statics.field813 == null) {
                Statics.field813 = "~/";
            }
            Statics.field15 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field813, "/tmp/", "" };
            Statics.field1213 = new String[] { ".jagex_cache_" + Statics.field513, ".file_store_" + Statics.field513 };
            int var18 = 0;
            label259: while (var18 < 4) {
                String var19 = var18 == 0 ? "" : "" + var18;
                Statics.field2245 = new File(Statics.field813, "jagex_cl_oldschool_" + var13 + var19 + ".dat");
                String var20 = null;
                String var21 = null;
                boolean var22 = false;
                if (Statics.field2245.exists()) {
                    try {
                        class125 var23 = new class125(Statics.field2245, "rw", 10000L);
                        class174 var24 = new class174((int) var23.method2133());
                        while (var24.field2394 < var24.field2391.length) {
                            int var25 = var23.method2134(var24.field2391, var24.field2394, var24.field2391.length - var24.field2394);
                            if (var25 == -1) {
                                throw new IOException();
                            }
                            var24.field2394 += var25;
                        }
                        var24.field2394 = 0;
                        int var26 = var24.method2871();
                        if (var26 < 1 || var26 > 3) {
                            throw new IOException("" + var26);
                        }
                        int var27 = 0;
                        if (var26 > 1) {
                            var27 = var24.method2871();
                        }
                        if (var26 <= 2) {
                            var20 = var24.method2937();
                            if (var27 == 1) {
                                var21 = var24.method2937();
                            }
                        } else {
                            var20 = var24.method2962();
                            if (var27 == 1) {
                                var21 = var24.method2962();
                            }
                        }
                        var23.method2129();
                    } catch (IOException var61) {
                        var61.printStackTrace();
                    }
                    if (var20 != null) {
                        File var29 = new File(var20);
                        if (!var29.exists()) {
                            var20 = null;
                        }
                    }
                    if (var20 != null) {
                        File var30 = new File(var20, "test.dat");
                        if (!class156.method27(var30, true)) {
                            var20 = null;
                        }
                    }
                }
                if (var20 == null && var18 == 0) {
                    label235: for (int var31 = 0; var31 < Statics.field1213.length; var31++) {
                        for (int var32 = 0; var32 < Statics.field15.length; var32++) {
                            File var33 = new File(Statics.field15[var32] + Statics.field1213[var31] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var33.exists() && class156.method27(new File(var33, "test.dat"), true)) {
                                var20 = var33.toString();
                                var22 = true;
                                break label235;
                            }
                        }
                    }
                }
                if (var20 == null) {
                    var20 = Statics.field813 + File.separatorChar + "jagexcache" + var19 + File.separatorChar + "oldschool" + File.separatorChar + var13 + File.separatorChar;
                    var22 = true;
                }
                if (var21 != null) {
                    File var34 = new File(var21);
                    File var35 = new File(var20);
                    try {
                        File[] var36 = var34.listFiles();
                        File[] var37 = var36;
                        for (int var38 = 0; var38 < var37.length; var38++) {
                            File var39 = var37[var38];
                            File var40 = new File(var35, var39.getName());
                            boolean var41 = var39.renameTo(var40);
                            if (!var41) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var60) {
                        var60.printStackTrace();
                    }
                    var22 = true;
                }
                if (var22) {
                    File var43 = new File(var20);
                    Object var44 = null;
                    try {
                        class125 var45 = new class125(Statics.field2245, "rw", 10000L);
                        class174 var46 = new class174(500);
                        var46.method2908(3);
                        var46.method2908(var44 == null ? 0 : 1);
                        var46.method2968(var43.getPath());
                        if (var44 != null) {
                            var46.method2968(((File) var44).getPath());
                        }
                        var45.method2131(var46.field2391, 0, var46.field2394);
                        var45.method2129();
                    } catch (IOException var56) {
                        var56.printStackTrace();
                    }
                }
                File var48 = new File(var20);
                Statics.field2244 = var48;
                if (!Statics.field2244.exists()) {
                    Statics.field2244.mkdirs();
                }
                File[] var49 = Statics.field2244.listFiles();
                if (var49 == null) {
                    break;
                }
                File[] var50 = var49;
                int var51 = 0;
                while (true) {
                    if (var51 >= var50.length) {
                        break label259;
                    }
                    File var52 = var50[var51];
                    if (!class156.method27(var52, false)) {
                        var18++;
                        break;
                    }
                    var51++;
                }
            }
            File var53 = Statics.field2244;
            Statics.field2255 = var53;
            if (!Statics.field2255.exists()) {
                throw new RuntimeException("");
            }
            class158.field2251 = true;
            class156.method538();
            class156.field2238 = new class124(new class125(class158.method149("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class156.field2247 = new class124(new class125(class158.method149("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2248 = new class124[Statics.field2242];
            for (int var54 = 0; var54 < Statics.field2242; var54++) {
                Statics.field2248[var54] = new class124(new class125(class158.method149("main_file_cache.idx" + var54), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var62) {
            class153.method683((String) null, var62);
        }
        Statics.field403 = this;
        this.method745(765, 503, 149);
    }

    @ObfuscatedName("aa.fu(I)V")
    public static final void method448() {
        class140.field2063 = false;
        field912 = false;
    }

    @ObfuscatedName("client.aa(I)V")
    public final void method758() {
        Statics.field1389 = field1021 == 0 ? 43594 : field1012 + 40000;
        Statics.field2189 = field1021 == 0 ? 443 : field1012 + 50000;
        Statics.field251 = Statics.field1389;
        Statics.field2626 = class215.field2636;
        Statics.field2508 = class215.field2635;
        Statics.field2622 = class215.field2639;
        Statics.field1415 = class215.field2637;
        this.method739();
        this.method740();
        Statics.field1275 = this.method736();
        Statics.field1296 = new class161(255, class156.field2238, class156.field2247, 500000);
        Statics.field344 = class82.method4323();
        this.method737();
        class57.method1589(this, Statics.field3341);
        if (field1021 != 0) {
            field922 = true;
        }
        method2(Statics.field344.field1309);
    }

    @ObfuscatedName("client.ag(B)V")
    public final void method861() {
        field934++;
        this.method1167();
        class237.method680();
        class204.method2632();
        method622();
        Statics.method1539();
        class60 var1 = class60.field717;
        synchronized (class60.field717) {
            class60.field722 = class60.field719;
            class60.field723 = class60.field720;
            class60.field724 = class60.field721 * 781969795;
            class60.field729 = class60.field716;
            class60.field736 = class60.field726;
            class60.field731 = class60.field727;
            class60.field730 = class60.field715;
            class60.field716 = 0;
        }
        if (Statics.field1275 != null) {
            int var3 = Statics.field1275.method637();
            field1105 = var3;
        }
        if (field914 == 0) {
            method14();
            class59.method71();
        } else if (field914 == 5) {
            class93.method230(this);
            method14();
            class59.method71();
        } else if (field914 == 10 || field914 == 11) {
            class93.method230(this);
        } else if (field914 == 20) {
            class93.method230(this);
            this.method1030();
        } else if (field914 == 25) {
            method2367(false);
            field962 = 0;
            boolean var4 = true;
            for (int var5 = 0; var5 < Statics.field526.length; var5++) {
                if (Statics.field260[var5] != -1 && Statics.field526[var5] == null) {
                    Statics.field526[var5] = Statics.field287.method3787(Statics.field260[var5], 0);
                    if (Statics.field526[var5] == null) {
                        var4 = false;
                        field962++;
                    }
                }
                if (Statics.field1367[var5] != -1 && Statics.field366[var5] == null) {
                    Statics.field366[var5] = Statics.field287.method3763(Statics.field1367[var5], 0, Statics.field866[var5]);
                    if (Statics.field366[var5] == null) {
                        var4 = false;
                        field962++;
                    }
                }
            }
            if (var4) {
                field964 = 0;
                boolean var6 = true;
                for (int var7 = 0; var7 < Statics.field526.length; var7++) {
                    byte[] var8 = Statics.field366[var7];
                    if (var8 != null) {
                        int var9 = (Statics.field650[var7] >> 8) * 64 - Statics.field2316;
                        int var10 = (Statics.field650[var7] & 0xFF) * 64 - Statics.field265;
                        if (field968) {
                            var9 = 10;
                            var10 = 10;
                        }
                        boolean var12 = true;
                        class174 var13 = new class174(var8);
                        int var14 = -1;
                        label496: while (true) {
                            int var15 = var13.method2884();
                            if (var15 == 0) {
                                var6 &= var12;
                                break;
                            }
                            var14 += var15;
                            int var16 = 0;
                            boolean var17 = false;
                            while (true) {
                                while (!var17) {
                                    int var19 = var13.method2884();
                                    if (var19 == 0) {
                                        continue label496;
                                    }
                                    var16 += var19 - 1;
                                    int var20 = var16 & 0x3F;
                                    int var21 = var16 >> 6 & 0x3F;
                                    int var22 = var13.method2871() >> 2;
                                    int var23 = var9 + var21;
                                    int var24 = var10 + var20;
                                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                                        class256 var25 = class256.method3652(var14);
                                        if (var22 != 22 || !field912 || var25.field3454 != 0 || var25.field3452 == 1 || var25.field3473) {
                                            if (!var25.method4139()) {
                                                field964++;
                                                var12 = false;
                                            }
                                            var17 = true;
                                        }
                                    }
                                }
                                int var18 = var13.method2884();
                                if (var18 == 0) {
                                    break;
                                }
                                var13.method2871();
                            }
                        }
                    }
                }
                if (var6) {
                    if (field972 != 0) {
                        method1535(class226.field2989 + class89.field1396 + class89.field1398 + 100 + "%" + class89.field1394, true);
                    }
                    method622();
                    method2659();
                    method622();
                    Statics.field416.method2443();
                    method622();
                    System.gc();
                    for (int var27 = 0; var27 < 4; var27++) {
                        field967[var27].method2757();
                    }
                    for (int var28 = 0; var28 < 4; var28++) {
                        for (int var29 = 0; var29 < 104; var29++) {
                            for (int var30 = 0; var30 < 104; var30++) {
                                class62.field747[var28][var29][var30] = 0;
                            }
                        }
                    }
                    method622();
                    class62.method21();
                    int var31 = Statics.field526.length;
                    class83.method60();
                    method2367(true);
                    if (!field968) {
                        int var32 = 0;
                        label434: while (true) {
                            if (var32 >= var31) {
                                for (int var46 = 0; var46 < var31; var46++) {
                                    int var47 = (Statics.field650[var46] >> 8) * 64 - Statics.field2316;
                                    int var48 = (Statics.field650[var46] & 0xFF) * 64 - Statics.field265;
                                    byte[] var49 = Statics.field526[var46];
                                    if (var49 == null && Statics.field436 < 800) {
                                        method622();
                                        class62.method2128(var47, var48, 64, 64);
                                    }
                                }
                                method2367(true);
                                int var50 = 0;
                                while (true) {
                                    if (var50 >= var31) {
                                        break label434;
                                    }
                                    byte[] var51 = Statics.field366[var50];
                                    if (var51 != null) {
                                        int var52 = (Statics.field650[var50] >> 8) * 64 - Statics.field2316;
                                        int var53 = (Statics.field650[var50] & 0xFF) * 64 - Statics.field265;
                                        method622();
                                        class140 var54 = Statics.field416;
                                        class162[] var55 = field967;
                                        class174 var56 = new class174(var51);
                                        int var57 = -1;
                                        while (true) {
                                            int var58 = var56.method2884();
                                            if (var58 == 0) {
                                                break;
                                            }
                                            var57 += var58;
                                            int var59 = 0;
                                            while (true) {
                                                int var60 = var56.method2884();
                                                if (var60 == 0) {
                                                    break;
                                                }
                                                var59 += var60 - 1;
                                                int var61 = var59 & 0x3F;
                                                int var62 = var59 >> 6 & 0x3F;
                                                int var63 = var59 >> 12;
                                                int var64 = var56.method2871();
                                                int var65 = var64 >> 2;
                                                int var66 = var64 & 0x3;
                                                int var67 = var52 + var62;
                                                int var68 = var53 + var61;
                                                if (var67 > 0 && var68 > 0 && var67 < 103 && var68 < 103) {
                                                    int var69 = var63;
                                                    if ((class62.field747[1][var67][var68] & 0x2) == 2) {
                                                        var69 = var63 - 1;
                                                    }
                                                    class162 var70 = null;
                                                    if (var69 >= 0) {
                                                        var70 = var55[var69];
                                                    }
                                                    class62.method914(var63, var67, var68, var57, var66, var65, var54, var70);
                                                }
                                            }
                                        }
                                    }
                                    var50++;
                                }
                            }
                            int var33 = (Statics.field650[var32] >> 8) * 64 - Statics.field2316;
                            int var34 = (Statics.field650[var32] & 0xFF) * 64 - Statics.field265;
                            byte[] var35 = Statics.field526[var32];
                            if (var35 != null) {
                                method622();
                                int var36 = Statics.field495 * 8 - 48;
                                int var37 = Statics.field436 * 8 - 48;
                                class162[] var38 = field967;
                                int var39 = 0;
                                label431: while (true) {
                                    if (var39 >= 4) {
                                        class174 var42 = new class174(var35);
                                        int var43 = 0;
                                        while (true) {
                                            if (var43 >= 4) {
                                                break label431;
                                            }
                                            for (int var44 = 0; var44 < 64; var44++) {
                                                for (int var45 = 0; var45 < 64; var45++) {
                                                    class62.method1610(var42, var43, var33 + var44, var34 + var45, var36, var37, 0);
                                                }
                                            }
                                            var43++;
                                        }
                                    }
                                    for (int var40 = 0; var40 < 64; var40++) {
                                        for (int var41 = 0; var41 < 64; var41++) {
                                            if (var33 + var40 > 0 && var33 + var40 < 103 && var34 + var41 > 0 && var34 + var41 < 103) {
                                                var38[var39].field2295[var33 + var40][var34 + var41] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var39++;
                                }
                            }
                            var32++;
                        }
                    }
                    if (field968) {
                        int var71 = 0;
                        label367: while (true) {
                            if (var71 >= 4) {
                                for (int var82 = 0; var82 < 13; var82++) {
                                    for (int var83 = 0; var83 < 13; var83++) {
                                        int var84 = field1120[0][var82][var83];
                                        if (var84 == -1) {
                                            class62.method2128(var82 * 8, var83 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2367(true);
                                int var85 = 0;
                                while (true) {
                                    if (var85 >= 4) {
                                        break label367;
                                    }
                                    method622();
                                    for (int var86 = 0; var86 < 13; var86++) {
                                        for (int var87 = 0; var87 < 13; var87++) {
                                            int var88 = field1120[var85][var86][var87];
                                            if (var88 != -1) {
                                                int var89 = var88 >> 24 & 0x3;
                                                int var90 = var88 >> 1 & 0x3;
                                                int var91 = var88 >> 14 & 0x3FF;
                                                int var92 = var88 >> 3 & 0x7FF;
                                                int var93 = (var91 / 8 << 8) + var92 / 8;
                                                for (int var94 = 0; var94 < Statics.field650.length; var94++) {
                                                    if (Statics.field650[var94] == var93 && Statics.field366[var94] != null) {
                                                        class62.method207(Statics.field366[var94], var85, var86 * 8, var87 * 8, var89, (var91 & 0x7) * 8, (var92 & 0x7) * 8, var90, Statics.field416, field967);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var85++;
                                }
                            }
                            method622();
                            for (int var72 = 0; var72 < 13; var72++) {
                                for (int var73 = 0; var73 < 13; var73++) {
                                    boolean var74 = false;
                                    int var75 = field1120[var71][var72][var73];
                                    if (var75 != -1) {
                                        int var76 = var75 >> 24 & 0x3;
                                        int var77 = var75 >> 1 & 0x3;
                                        int var78 = var75 >> 14 & 0x3FF;
                                        int var79 = var75 >> 3 & 0x7FF;
                                        int var80 = (var78 / 8 << 8) + var79 / 8;
                                        for (int var81 = 0; var81 < Statics.field650.length; var81++) {
                                            if (Statics.field650[var81] == var80 && Statics.field526[var81] != null) {
                                                class62.method40(Statics.field526[var81], var71, var72 * 8, var73 * 8, var76, (var78 & 0x7) * 8, (var79 & 0x7) * 8, var77, field967);
                                                var74 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var74) {
                                        class62.method110(var71, var72 * 8, var73 * 8);
                                    }
                                }
                            }
                            var71++;
                        }
                    }
                    method2367(true);
                    method2659();
                    method622();
                    class62.method1336(Statics.field416, field967);
                    method2367(true);
                    int var95 = class62.field748;
                    if (var95 > Statics.field579) {
                        var95 = Statics.field579;
                    }
                    if (var95 < Statics.field579 - 1) {
                        int var96 = Statics.field579 - 1;
                    }
                    if (field912) {
                        Statics.field416.method2444(class62.field748);
                    } else {
                        Statics.field416.method2444(0);
                    }
                    for (int var97 = 0; var97 < 104; var97++) {
                        for (int var98 = 0; var98 < 104; var98++) {
                            method626(var97, var98);
                        }
                    }
                    method622();
                    method2700();
                    class256.field3447.method3244();
                    if (Statics.field403.method767()) {
                        field949.method3136(65);
                        field949.method2859(1057001181);
                    }
                    if (!field968) {
                        int var99 = (Statics.field495 - 6) / 8;
                        int var100 = (Statics.field495 + 6) / 8;
                        int var101 = (Statics.field436 - 6) / 8;
                        int var102 = (Statics.field436 + 6) / 8;
                        for (int var103 = var99 - 1; var103 <= var100 + 1; var103++) {
                            for (int var104 = var101 - 1; var104 <= var102 + 1; var104++) {
                                if (var103 < var99 || var103 > var100 || var104 < var101 || var104 > var102) {
                                    Statics.field287.method3783("m" + var103 + "_" + var104);
                                    Statics.field287.method3783("l" + var103 + "_" + var104);
                                }
                            }
                        }
                    }
                    method471(30);
                    method622();
                    class62.method1();
                    field949.method3136(90);
                    class59.method71();
                } else {
                    field972 = 2;
                }
            } else {
                field972 = 1;
            }
        }
        if (field914 == 30) {
            this.method1031();
        } else if (field914 == 40 || field914 == 45) {
            this.method1030();
        }
    }

    @ObfuscatedName("client.aj(ZI)V")
    public final void method769(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class204.field2502 == 2) {
                    if (Statics.field2197 == null) {
                        Statics.field2197 = class210.method3597(Statics.field2503, Statics.field2504, Statics.field2205);
                        if (Statics.field2197 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2507 == null) {
                        Statics.field2507 = new class113(Statics.field2500, Statics.field3684);
                    }
                    if (Statics.field2501.method3423(Statics.field2197, Statics.field2499, Statics.field2507, 22050)) {
                        Statics.field2501.method3494();
                        Statics.field2501.method3421(Statics.field2505);
                        Statics.field2501.method3426(Statics.field2197, Statics.field2506);
                        class204.field2502 = 0;
                        Statics.field2197 = null;
                        Statics.field2507 = null;
                        Statics.field2503 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2501.method3427();
                class204.field2502 = 0;
                Statics.field2197 = null;
                Statics.field2507 = null;
                Statics.field2503 = null;
            }
            var2 = false;
        }
        if (var2 && field947 && Statics.field3864 != null) {
            Statics.field3864.method1825();
        }
        if ((field914 == 10 || field914 == 20 || field914 == 30) && field952 != 0L && class176.method584() > field952) {
            method2(method1002());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field1112[var5] = true;
            }
        }
        if (field914 == 0) {
            this.method762(class93.field1432, class93.field1433, arg0);
        } else if (field914 == 5) {
            class93.method1022(Statics.field339, Statics.field2848, Statics.field33, arg0);
        } else if (field914 == 10 || field914 == 11) {
            class93.method1022(Statics.field339, Statics.field2848, Statics.field33, arg0);
        } else if (field914 == 20) {
            class93.method1022(Statics.field339, Statics.field2848, Statics.field33, arg0);
        } else if (field914 == 25) {
            if (field972 == 1) {
                if (field962 > field963) {
                    field963 = field962;
                }
                int var6 = (field963 * 50 - field962 * 50) / field963;
                method1535(class226.field2989 + class89.field1396 + class89.field1398 + var6 + "%" + class89.field1394, false);
            } else if (field972 == 2) {
                if (field964 > field965) {
                    field965 = field964;
                }
                int var7 = (field965 * 50 - field964 * 50) / field965 + 50;
                method1535(class226.field2989 + class89.field1396 + class89.field1398 + var7 + "%" + class89.field1394, false);
            } else {
                method1535(class226.field2989, false);
            }
        } else if (field914 == 30) {
            this.method1034();
        } else if (field914 == 40) {
            method1535(class226.field2871 + class89.field1396 + class226.field3107, false);
        } else if (field914 == 45) {
            method1535(class226.field3018, false);
        }
        if (field914 == 30 && field1119 == 0 && !arg0 && !field1151) {
            for (int var8 = 0; var8 < field1007; var8++) {
                if (field1113[var8]) {
                    Statics.field2328.method721(field1099[var8], field960[var8], field1117[var8], field1118[var8]);
                    field1113[var8] = false;
                }
            }
        } else if (field914 > 0) {
            Statics.field2328.method718(0, 0);
            for (int var9 = 0; var9 < field1007; var9++) {
                field1113[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ax(I)V")
    public final void method761() {
        if (Statics.field585.method1641()) {
            Statics.field585.method1619();
        }
        if (Statics.field642 != null) {
            Statics.field642.field849 = false;
        }
        Statics.field642 = null;
        if (Statics.field2151 != null) {
            Statics.field2151.method2719();
            Statics.field2151 = null;
        }
        if (class51.field637 != null) {
            class51 var1 = class51.field637;
            synchronized (class51.field637) {
                class51.field637 = null;
            }
        }
        class60.method969();
        Statics.field1275 = null;
        if (Statics.field3864 != null) {
            Statics.field3864.method1826();
        }
        if (Statics.field613 != null) {
            Statics.field613.method1826();
        }
        if (Statics.field3265 != null) {
            Statics.field3265.method2719();
        }
        class237.method2663();
        class156.method2441();
    }

    @ObfuscatedName("ax.fq(II)V")
    public static void method471(int arg0) {
        if (field914 == arg0) {
            return;
        }
        if (field914 == 0) {
            Statics.field403.method763();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field910 = 0;
            field940 = 0;
            field942 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3624 != null) {
            Statics.field3624.method2719();
            Statics.field3624 = null;
        }
        if (field914 == 25) {
            field972 = 0;
            field962 = 0;
            field963 = 1;
            field964 = 0;
            field965 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method2743(Statics.field661, Statics.field312, true, 0);
        } else if (arg0 == 20) {
            class93.method2743(Statics.field661, Statics.field312, true, field914 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method2743(Statics.field661, Statics.field312, false, 4);
        } else if (Statics.field1427) {
            Statics.field1420 = null;
            Statics.field2596 = null;
            Statics.field2138 = null;
            Statics.field782 = null;
            Statics.field246 = null;
            Statics.field2254 = null;
            Statics.field898 = null;
            Statics.field2432 = null;
            Statics.field3152 = null;
            Statics.field1438 = null;
            Statics.field1419 = null;
            Statics.field2410 = null;
            Statics.field264 = null;
            Statics.field2323 = null;
            Statics.field1425 = null;
            Statics.field865 = null;
            Statics.field1288 = null;
            Statics.field1446 = null;
            Statics.field3340 = null;
            Statics.field324 = null;
            Statics.field2341 = null;
            Statics.field313 = null;
            class204.field2502 = 1;
            Statics.field2503 = null;
            Statics.field2504 = -1;
            Statics.field2205 = -1;
            Statics.field2505 = 0;
            Statics.field2506 = false;
            Statics.field862 = 2;
            class239.method1351(true);
            Statics.field1427 = false;
        }
        field914 = arg0;
    }

    @ObfuscatedName("client.fz(I)V")
    public void method1167() {
        if (field914 != 1000) {
            boolean var1 = class239.method3651();
            if (!var1) {
                this.method1028();
            }
        }
    }

    @ObfuscatedName("client.fv(B)V")
    public void method1028() {
        if (class239.field3259 >= 4) {
            this.method764("js5crc");
            field914 = 1000;
            return;
        }
        if (class239.field3253 >= 4) {
            if (field914 <= 5) {
                this.method764("js5io");
                field914 = 1000;
                return;
            }
            field936 = 3000;
            class239.field3253 = 3;
        }
        if (--field936 + 1 > 0) {
            return;
        }
        try {
            if (field1139 == 0) {
                Statics.field29 = Statics.field697.method2694(Statics.field322, Statics.field251);
                field1139++;
            }
            if (field1139 == 1) {
                if (Statics.field29.field2221 == 2) {
                    this.method1162(-1);
                    return;
                }
                if (Statics.field29.field2221 == 1) {
                    field1139++;
                }
            }
            if (field1139 == 2) {
                Statics.field1503 = new class160((Socket) Statics.field29.field2225, Statics.field697);
                class174 var1 = new class174(5);
                var1.method2908(15);
                var1.method2859(149);
                Statics.field1503.method2733(var1.field2391, 0, 5);
                field1139++;
                Statics.field609 = class176.method584();
            }
            if (field1139 == 3) {
                if (field914 <= 5 || Statics.field1503.method2721() > 0) {
                    int var2 = Statics.field1503.method2720();
                    if (var2 != 0) {
                        this.method1162(var2);
                        return;
                    }
                    field1139++;
                } else if (class176.method584() - Statics.field609 > 30000L) {
                    this.method1162(-2);
                    return;
                }
            }
            if (field1139 == 4) {
                class160 var3 = Statics.field1503;
                boolean var4 = field914 > 20;
                if (Statics.field3265 != null) {
                    try {
                        Statics.field3265.method2719();
                    } catch (Exception var14) {
                    }
                    Statics.field3265 = null;
                }
                Statics.field3265 = var3;
                class239.method1351(var4);
                class239.field3267.field2394 = 0;
                Statics.field3671 = null;
                Statics.field1 = null;
                class239.field3266 = 0;
                while (true) {
                    class235 var6 = (class235) class239.field3270.method3262();
                    if (var6 == null) {
                        while (true) {
                            class235 var7 = (class235) class239.field3263.method3262();
                            if (var7 == null) {
                                if (class239.field3269 != 0) {
                                    try {
                                        class174 var8 = new class174(4);
                                        var8.method2908(4);
                                        var8.method2908(class239.field3269);
                                        var8.method2857(0);
                                        Statics.field3265.method2733(var8.field2391, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3265.method2719();
                                        } catch (Exception var12) {
                                        }
                                        class239.field3253++;
                                        Statics.field3265 = null;
                                    }
                                }
                                class239.field3254 = 0;
                                Statics.field3255 = class176.method584();
                                Statics.field29 = null;
                                Statics.field1503 = null;
                                field1139 = 0;
                                field938 = 0;
                                return;
                            }
                            class239.field3260.method3189(var7);
                            class239.field3261.method3260(var7, var7.field2467);
                            class239.field3257++;
                            class239.field3264--;
                        }
                    }
                    class239.field3256.method3260(var6, var6.field2467);
                    class239.field3273++;
                    class239.field3258--;
                }
            }
        } catch (IOException var15) {
            this.method1162(-3);
        }
    }

    @ObfuscatedName("client.fk(IB)V")
    public void method1162(int arg0) {
        Statics.field29 = null;
        Statics.field1503 = null;
        field1139 = 0;
        if (Statics.field251 == Statics.field1389) {
            Statics.field251 = Statics.field2189;
        } else {
            Statics.field251 = Statics.field1389;
        }
        field938++;
        if (field938 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field914 <= 5) {
                this.method764("js5connect_full");
                field914 = 1000;
            } else {
                field936 = 3000;
            }
        } else if (field938 >= 2 && arg0 == 6) {
            this.method764("js5connect_outofdate");
            field914 = 1000;
        } else if (field938 >= 4) {
            if (field914 <= 5) {
                this.method764("js5connect");
                field914 = 1000;
            } else {
                field936 = 3000;
            }
        }
    }

    @ObfuscatedName("v.fs(I)V")
    public static void method14() {
        if (field976 == 0) {
            Statics.field416 = new class140(4, 104, 104, class62.field756);
            for (int var0 = 0; var0 < 4; var0++) {
                field967[var0] = new class162(104, 104);
            }
            Statics.field2834 = new class286(512, 512);
            class93.field1433 = class226.field3066;
            class93.field1432 = 5;
            field976 = 20;
        } else if (field976 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field2009[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2516(var1, 500, 800, 512, 334);
            class93.field1433 = class226.field3096;
            class93.field1432 = 10;
            field976 = 30;
        } else if (field976 == 30) {
            Statics.field441 = method2793(0, false, true, true);
            Statics.field937 = method2793(1, false, true, true);
            Statics.field1893 = method2793(2, true, false, true);
            Statics.field3191 = method2793(3, false, true, true);
            Statics.field503 = method2793(4, false, true, true);
            Statics.field287 = method2793(5, true, true, true);
            Statics.field2438 = method2793(6, true, true, false);
            Statics.field2118 = method2793(7, false, true, true);
            Statics.field312 = method2793(8, false, true, true);
            Statics.field1188 = method2793(9, false, true, true);
            Statics.field661 = method2793(10, false, true, true);
            Statics.field268 = method2793(11, false, true, true);
            Statics.field3661 = method2793(12, false, true, true);
            Statics.field882 = method2793(13, true, false, true);
            Statics.field848 = method2793(14, false, true, false);
            Statics.field676 = method2793(15, false, true, true);
            Statics.field20 = method2793(16, false, true, false);
            class93.field1433 = class226.field2875;
            class93.field1432 = 20;
            field976 = 40;
        } else if (field976 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field441.method3855() * 4 / 100;
            int var8 = var7 + Statics.field937.method3855() * 4 / 100;
            int var9 = var8 + Statics.field1893.method3855() * 2 / 100;
            int var10 = var9 + Statics.field3191.method3855() * 2 / 100;
            int var11 = var10 + Statics.field503.method3855() * 6 / 100;
            int var12 = var11 + Statics.field287.method3855() * 4 / 100;
            int var13 = var12 + Statics.field2438.method3855() * 2 / 100;
            int var14 = var13 + Statics.field2118.method3855() * 58 / 100;
            int var15 = var14 + Statics.field312.method3855() * 2 / 100;
            int var16 = var15 + Statics.field1188.method3855() * 2 / 100;
            int var17 = var16 + Statics.field661.method3855() * 2 / 100;
            int var18 = var17 + Statics.field268.method3855() * 2 / 100;
            int var19 = var18 + Statics.field3661.method3855() * 2 / 100;
            int var20 = var19 + Statics.field882.method3855() * 2 / 100;
            int var21 = var20 + Statics.field848.method3855() * 2 / 100;
            int var22 = var21 + Statics.field676.method3855() * 2 / 100;
            int var23 = var22 + Statics.field20.method3855() * 2 / 100;
            if (var23 == 100) {
                class93.field1433 = class226.field3128;
                class93.field1432 = 30;
                field976 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1433 = class226.field2876 + var23 + "%";
                }
                class93.field1432 = 30;
            }
        } else if (field976 == 45) {
            boolean var24 = !field912;
            Statics.field1552 = 22050;
            Statics.field1628 = var24;
            Statics.field272 = 2;
            class205 var25 = new class205();
            var25.method3452(9, 128);
            Statics.field3864 = class110.method2158(Statics.field697, 0, 22050);
            Statics.field3864.method1822(var25);
            class238 var26 = Statics.field676;
            class238 var27 = Statics.field848;
            class238 var28 = Statics.field503;
            Statics.field2499 = var26;
            Statics.field3684 = var27;
            Statics.field2500 = var28;
            Statics.field2501 = var25;
            Statics.field613 = class110.method2158(Statics.field697, 1, 2048);
            Statics.field2512 = new class103();
            Statics.field613.method1822(Statics.field2512);
            Statics.field3594 = new class117(22050, Statics.field1552);
            class93.field1433 = class226.field3140;
            class93.field1432 = 35;
            field976 = 50;
            Statics.field1363 = new class263(Statics.field312, Statics.field882);
        } else if (field976 == 50) {
            int var29 = class262.method4318().length;
            field961 = Statics.field1363.method4325(class262.method4318());
            if (field961.size() < var29) {
                class93.field1433 = class226.field2879 + field961.size() * 100 / var29 + "%";
                class93.field1432 = 40;
            } else {
                Statics.field2848 = (class264) field961.get(class262.field3629);
                Statics.field33 = (class264) field961.get(class262.field3623);
                Statics.field339 = (class264) field961.get(class262.field3622);
                Statics.field2497 = new class292(true);
                class93.field1433 = class226.field2880;
                class93.field1432 = 40;
                field976 = 60;
            }
        } else if (field976 == 60) {
            int var30 = class93.method79(Statics.field661, Statics.field312);
            int var31 = class93.method974();
            if (var30 < var31) {
                class93.field1433 = class226.field2881 + var30 * 100 / var31 + "%";
                class93.field1432 = 50;
            } else {
                class93.field1433 = class226.field2882;
                class93.field1432 = 50;
                method471(5);
                field976 = 70;
            }
        } else if (field976 == 70) {
            if (Statics.field1893.method3766()) {
                class260.method3985(Statics.field1893);
                class238 var32 = Statics.field1893;
                Statics.field3346 = var32;
                class248.method1365(Statics.field1893, Statics.field2118);
                class238 var33 = Statics.field1893;
                class238 var34 = Statics.field2118;
                boolean var35 = field912;
                Statics.field3435 = var33;
                Statics.field3436 = var34;
                class256.field3442 = var35;
                class238 var36 = Statics.field1893;
                class238 var37 = Statics.field2118;
                Statics.field3561 = var36;
                Statics.field2513 = var37;
                class238 var38 = Statics.field1893;
                Statics.field2791 = var38;
                Statics.method313(Statics.field1893, Statics.field2118, field1039, Statics.field2848);
                class261.method1042(Statics.field1893, Statics.field441, Statics.field937);
                class246.method3754(Statics.field1893, Statics.field2118);
                class238 var39 = Statics.field1893;
                Statics.field3379 = var39;
                class242.method3098(Statics.field1893);
                class238 var40 = Statics.field3191;
                class238 var41 = Statics.field2118;
                class238 var42 = Statics.field312;
                class238 var43 = Statics.field882;
                Statics.field275 = var40;
                Statics.field593 = var41;
                Statics.field2638 = var42;
                Statics.field3686 = var43;
                Statics.field2642 = new class217[Statics.field275.method3833()][];
                Statics.field2650 = new boolean[Statics.field275.method3833()];
                class241.method1337(Statics.field1893);
                class238 var44 = Statics.field1893;
                Statics.field3287 = var44;
                class238 var45 = Statics.field1893;
                Statics.field3311 = var45;
                class238 var46 = Statics.field1893;
                Statics.field3321 = var46;
                class238 var47 = Statics.field1893;
                Statics.field3387 = var47;
                Statics.field585 = new class98();
                class238 var48 = Statics.field1893;
                class238 var49 = Statics.field312;
                class238 var50 = Statics.field882;
                Statics.field3410 = var48;
                Statics.field3409 = var49;
                Statics.field3411 = var50;
                class249.method2642(Statics.field1893, Statics.field312);
                class238 var51 = Statics.field1893;
                class238 var52 = Statics.field312;
                Statics.field3295 = var52;
                if (var51.method3766()) {
                    Statics.field3292 = var51.method3793(35);
                    Statics.field663 = new class243[Statics.field3292];
                    for (int var53 = 0; var53 < Statics.field3292; var53++) {
                        byte[] var54 = var51.method3787(35, var53);
                        if (var54 != null) {
                            Statics.field663[var53] = new class243(var53);
                            Statics.field663[var53].method3918(new class174(var54));
                            Statics.field663[var53].method3923();
                        }
                    }
                }
                class93.field1433 = class226.field2884;
                class93.field1432 = 60;
                field976 = 80;
            } else {
                class93.field1433 = class226.field2883 + Statics.field1893.method3860() + "%";
                class93.field1432 = 60;
            }
        } else if (field976 == 80) {
            int var55 = 0;
            if (Statics.field1386 == null) {
                class238 var56 = Statics.field312;
                int var57 = var56.method3777("compass");
                int var58 = var56.method3827(var57, "");
                class286 var59 = class287.method208(var56, var57, var58);
                Statics.field1386 = var59;
            } else {
                var55++;
            }
            if (Statics.field2514 == null) {
                class238 var60 = Statics.field312;
                int var61 = var60.method3777("mapedge");
                int var62 = var60.method3827(var61, "");
                class286 var63 = class287.method208(var60, var61, var62);
                Statics.field2514 = var63;
            } else {
                var55++;
            }
            if (Statics.field2331 == null) {
                Statics.field2331 = class287.method4435(Statics.field312, "mapscene", "");
            } else {
                var55++;
            }
            if (Statics.field556 == null) {
                Statics.field556 = class287.method238(Statics.field312, "headicons_pk", "");
            } else {
                var55++;
            }
            if (Statics.field780 == null) {
                Statics.field780 = class287.method238(Statics.field312, "headicons_prayer", "");
            } else {
                var55++;
            }
            if (Statics.field349 == null) {
                Statics.field349 = class287.method238(Statics.field312, "headicons_hint", "");
            } else {
                var55++;
            }
            if (Statics.field800 == null) {
                Statics.field800 = class287.method238(Statics.field312, "mapmarker", "");
            } else {
                var55++;
            }
            if (Statics.field1360 == null) {
                Statics.field1360 = class287.method238(Statics.field312, "cross", "");
            } else {
                var55++;
            }
            if (Statics.field2310 == null) {
                Statics.field2310 = class287.method238(Statics.field312, "mapdots", "");
            } else {
                var55++;
            }
            if (Statics.field3143 == null) {
                Statics.field3143 = class287.method4435(Statics.field312, "scrollbar", "");
            } else {
                var55++;
            }
            if (Statics.field2593 == null) {
                Statics.field2593 = class287.method4435(Statics.field312, "mod_icons", "");
            } else {
                var55++;
            }
            if (var55 < 11) {
                class93.field1433 = class226.field2885 + var55 * 100 / 12 + "%";
                class93.field1432 = 70;
            } else {
                Statics.field3645 = Statics.field2593;
                Statics.field2514.method4626();
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2331[0].method4600(var64 + var67, var65 + var67, var66 + var67);
                class93.field1433 = class226.field2918;
                class93.field1432 = 70;
                field976 = 90;
            }
        } else if (field976 == 90) {
            if (Statics.field1188.method3766()) {
                class126 var68 = new class126(Statics.field1188, Statics.field312, 20, 0.8D, field912 ? 64 : 128);
                class137.method2375(var68);
                class137.method2397(0.8D);
                class93.field1433 = class226.field2974;
                class93.field1432 = 90;
                field976 = 110;
            } else {
                class93.field1433 = class226.field2887 + Statics.field1188.method3860() + "%";
                class93.field1432 = 90;
            }
        } else if (field976 == 110) {
            Statics.field642 = new class72();
            Statics.field697.method2677(Statics.field642, 10);
            class93.field1433 = class226.field2889;
            class93.field1432 = 94;
            field976 = 120;
        } else if (field976 == 120) {
            if (Statics.field661.method3781("huffman", "")) {
                class166 var69 = new class166(Statics.field661.method3796("huffman", ""));
                class266.method1020(var69);
                class93.field1433 = class226.field3008;
                class93.field1432 = 96;
                field976 = 130;
            } else {
                class93.field1433 = class226.field2890 + "%";
                class93.field1432 = 96;
            }
        } else if (field976 == 130) {
            if (!Statics.field3191.method3766()) {
                class93.field1433 = class226.field2892 + Statics.field3191.method3860() * 4 / 5 + "%";
                class93.field1432 = 100;
            } else if (!Statics.field3661.method3766()) {
                class93.field1433 = class226.field2892 + (80 + Statics.field3661.method3860() / 6) + "%";
                class93.field1432 = 100;
            } else if (Statics.field882.method3766()) {
                class93.field1433 = class226.field3103;
                class93.field1432 = 98;
                field976 = 140;
            } else {
                class93.field1433 = class226.field2892 + (96 + Statics.field882.method3860() / 50) + "%";
                class93.field1432 = 100;
            }
        } else if (field976 == 140) {
            if (Statics.field20.method3782(class41.field536.field533)) {
                if (Statics.field276 == null) {
                    Statics.field276 = new class289();
                    Statics.field276.method4811(Statics.field20, Statics.field339, field961, Statics.field2331);
                }
                int var70 = Statics.field276.method4759();
                if (var70 < 100) {
                    class93.field1433 = class226.field2917 + (var70 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1433 = class226.field3030;
                    class93.field1432 = 100;
                    field976 = 150;
                }
            } else {
                class93.field1433 = class226.field2917 + Statics.field20.method3792(class41.field536.field533) / 10 + "%";
            }
        } else if (field976 == 150) {
            method471(10);
        }
    }

    @ObfuscatedName("fa.fj(IZZZI)Lig;")
    public static class238 method2793(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2238 != null) {
            var4 = new class161(arg0, class156.field2238, Statics.field2248[arg0], 1000000);
        }
        return new class238(var4, Statics.field1296, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fa(I)V")
    public final void method1030() {
        try {
            if (field910 == 0) {
                if (Statics.field2151 != null) {
                    Statics.field2151.method2719();
                    Statics.field2151 = null;
                }
                Statics.field263 = null;
                field969 = false;
                field940 = 0;
                field910 = 1;
            }
            if (field910 == 1) {
                if (Statics.field263 == null) {
                    Statics.field263 = Statics.field697.method2694(Statics.field322, Statics.field251);
                }
                if (Statics.field263.field2221 == 2) {
                    throw new IOException();
                }
                if (Statics.field263.field2221 == 1) {
                    Statics.field2151 = new class160((Socket) Statics.field263.field2225, Statics.field697);
                    Statics.field263 = null;
                    field910 = 2;
                }
            }
            if (field910 == 2) {
                field949.field2394 = 0;
                field949.method2908(14);
                Statics.field2151.method2733(field949.field2391, 0, 1);
                field951.field2394 = 0;
                field910 = 3;
            }
            if (field910 == 3) {
                if (Statics.field3864 != null) {
                    Statics.field3864.method1849();
                }
                if (Statics.field613 != null) {
                    Statics.field613.method1849();
                }
                int var1 = Statics.field2151.method2720();
                if (Statics.field3864 != null) {
                    Statics.field3864.method1849();
                }
                if (Statics.field613 != null) {
                    Statics.field613.method1849();
                }
                if (var1 != 0) {
                    method162(var1);
                    return;
                }
                field951.field2394 = 0;
                field910 = 4;
            }
            if (field910 == 4) {
                if (field951.field2394 < 8) {
                    int var2 = Statics.field2151.method2721();
                    if (var2 > 8 - field951.field2394) {
                        var2 = 8 - field951.field2394;
                    }
                    if (var2 > 0) {
                        Statics.field2151.method2731(field951.field2391, field951.field2394, var2);
                        field951.field2394 += var2;
                    }
                }
                if (field951.field2394 == 8) {
                    field951.field2394 = 0;
                    Statics.field321 = field951.method2877();
                    field910 = 5;
                }
            }
            if (field910 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field321 >> 32), (int) (Statics.field321 & 0xFFFFFFFFFFFFFFFFL) };
                field949.field2394 = 0;
                field949.method2908(1);
                field949.method2908(class93.field1431.method12());
                field949.method2859(var3[0]);
                field949.method2859(var3[1]);
                field949.method2859(var3[2]);
                field949.method2859(var3[3]);
                switch(class93.field1431.field2194) {
                    case 0:
                        field949.method2859((Integer) Statics.field344.field1310.get(class271.method3757(class93.field1439)));
                        field949.field2394 += 4;
                        break;
                    case 1:
                    case 2:
                        field949.method2858(Statics.field21);
                        field949.field2394 += 5;
                        break;
                    case 3:
                        field949.field2394 += 8;
                }
                field949.method2862(class93.field1440);
                field949.method2892(class91.field1407, class91.field1408);
                field950.field2394 = 0;
                if (field914 == 40) {
                    field950.method2908(18);
                } else {
                    field950.method2908(16);
                }
                field950.method2857(0);
                int var4 = field950.field2394;
                field950.method2859(149);
                field950.method2882(field949.field2391, 0, field949.field2394);
                int var5 = field950.field2394;
                field950.method2862(class93.field1439);
                field950.method2908((field1151 ? 1 : 0) << 1 | (field912 ? 1 : 0));
                field950.method2857(Statics.field1214);
                field950.method2857(Statics.field3350);
                method2633(field950);
                field950.method2862(Statics.field238);
                field950.method2859(Statics.field372);
                class174 var6 = new class174(Statics.field2497.method4934());
                Statics.field2497.method4933(var6);
                field950.method2882(var6.field2391, 0, var6.field2391.length);
                field950.method2908(Statics.field438);
                field950.method2859(0);
                field950.method2859(Statics.field441.field3218);
                field950.method2859(Statics.field937.field3218);
                field950.method2859(Statics.field1893.field3218);
                field950.method2859(Statics.field3191.field3218);
                field950.method2859(Statics.field503.field3218);
                field950.method2859(Statics.field287.field3218);
                field950.method2859(Statics.field2438.field3218);
                field950.method2859(Statics.field2118.field3218);
                field950.method2859(Statics.field312.field3218);
                field950.method2859(Statics.field1188.field3218);
                field950.method2859(Statics.field661.field3218);
                field950.method2859(Statics.field268.field3218);
                field950.method2859(Statics.field3661.field3218);
                field950.method2859(Statics.field882.field3218);
                field950.method2859(Statics.field848.field3218);
                field950.method2859(Statics.field676.field3218);
                field950.method2859(Statics.field20.field3218);
                field950.method2890(var3, var5, field950.field2394);
                field950.method2901(field950.field2394 - var4);
                Statics.field2151.method2733(field950.field2391, 0, field950.field2394);
                field949.method3110(var3);
                for (int var7 = 0; var7 < 4; var7++) {
                    var3[var7] += 50;
                }
                field951.method3110(var3);
                field910 = 6;
            }
            if (field910 == 6 && Statics.field2151.method2721() > 0) {
                int var8 = Statics.field2151.method2720();
                if (var8 == 21 && field914 == 20) {
                    field910 = 7;
                } else if (var8 == 2) {
                    field910 = 9;
                } else if (var8 == 15 && field914 == 40) {
                    field1048 = -1;
                    field910 = 13;
                } else if (var8 == 23 && field942 < 1) {
                    field942++;
                    field910 = 0;
                } else if (var8 == 29) {
                    field910 = 11;
                } else {
                    method162(var8);
                    return;
                }
            }
            if (field910 == 7 && Statics.field2151.method2721() > 0) {
                field955 = (Statics.field2151.method2720() + 3) * 60;
                field910 = 8;
            }
            if (field910 == 8) {
                field940 = 0;
                class93.method7(class226.field2899, class226.field2900, field955 / 60 + class226.field2901);
                if (--field955 <= 0) {
                    field910 = 0;
                }
            } else {
                if (field910 == 9 && Statics.field2151.method2721() >= 13) {
                    boolean var9 = Statics.field2151.method2720() == 1;
                    Statics.field2151.method2731(field951.field2391, 0, 4);
                    field951.field2394 = 0;
                    boolean var10 = false;
                    if (var9) {
                        int var11 = field951.method3112() << 24;
                        int var12 = var11 | field951.method3112() << 16;
                        int var13 = var12 | field951.method3112() << 8;
                        int var14 = var13 | field951.method3112();
                        int var15 = class271.method3757(class93.field1439);
                        if (Statics.field344.field1310.size() >= 10 && !Statics.field344.field1310.containsKey(var15)) {
                            Iterator var16 = Statics.field344.field1310.entrySet().iterator();
                            var16.next();
                            var16.remove();
                        }
                        Statics.field344.field1310.put(var15, var14);
                        Statics.method1335();
                    }
                    field1074 = Statics.field2151.method2720();
                    field1076 = Statics.field2151.method2720() == 1;
                    field1028 = Statics.field2151.method2720();
                    field1028 <<= 0x8;
                    field1028 += Statics.field2151.method2720();
                    field1029 = Statics.field2151.method2720();
                    Statics.field2151.method2731(field951.field2391, 0, 1);
                    field951.field2394 = 0;
                    field953 = field951.method3112();
                    Statics.field2151.method2731(field951.field2391, 0, 2);
                    field951.field2394 = 0;
                    field1048 = field951.method2873();
                    try {
                        class53.method670(Statics.field403, "zap");
                    } catch (Throwable var27) {
                    }
                    field910 = 10;
                }
                if (field910 != 10) {
                    if (field910 == 11 && Statics.field2151.method2721() >= 2) {
                        field951.field2394 = 0;
                        Statics.field2151.method2731(field951.field2391, 0, 2);
                        field951.field2394 = 0;
                        Statics.field3394 = field951.method2873();
                        field910 = 12;
                    }
                    if (field910 == 12 && Statics.field2151.method2721() >= Statics.field3394) {
                        field951.field2394 = 0;
                        Statics.field2151.method2731(field951.field2391, 0, Statics.field3394);
                        field951.field2394 = 0;
                        String var18 = field951.method2879();
                        String var19 = field951.method2879();
                        String var20 = field951.method2879();
                        class93.method7(var18, var19, var20);
                        method471(10);
                    }
                    if (field910 == 13) {
                        if (field1048 == -1) {
                            if (Statics.field2151.method2721() < 2) {
                                return;
                            }
                            Statics.field2151.method2731(field951.field2391, 0, 2);
                            field951.field2394 = 0;
                            field1048 = field951.method2873();
                        }
                        if (Statics.field2151.method2721() >= field1048) {
                            Statics.field2151.method2731(field951.field2391, 0, field1048);
                            field951.field2394 = 0;
                            int var21 = field1048;
                            field949.field2394 = 0;
                            field951.field2394 = 0;
                            field953 = -1;
                            field956 = -1;
                            field957 = -1;
                            field958 = -1;
                            field1048 = 0;
                            field1091 = 0;
                            field987 = 0;
                            field1038 = 0;
                            field941 = -1;
                            field1045 = false;
                            field1141 = 0;
                            field1115 = 0;
                            for (int var22 = 0; var22 < 2048; var22++) {
                                field1130[var22] = null;
                            }
                            Statics.field1537 = null;
                            for (int var23 = 0; var23 < field1110.length; var23++) {
                                class87 var24 = field1110[var23];
                                if (var24 != null) {
                                    var24.field1250 = -1;
                                    var24.field1272 = false;
                                }
                            }
                            class64.field786 = new class191(32);
                            method471(30);
                            for (int var25 = 0; var25 < 100; var25++) {
                                field1112[var25] = true;
                            }
                            method444();
                            class97.method1542(field951);
                            if (field951.field2394 != var21) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field940++;
                        if (field940 > 2000) {
                            if (field942 < 1) {
                                if (Statics.field251 == Statics.field1389) {
                                    Statics.field251 = Statics.field2189;
                                } else {
                                    Statics.field251 = Statics.field1389;
                                }
                                field942++;
                                field910 = 0;
                            } else {
                                method162(-3);
                            }
                        }
                    }
                } else if (Statics.field2151.method2721() >= field1048) {
                    field951.field2394 = 0;
                    Statics.field2151.method2731(field951.field2391, 0, field1048);
                    method8();
                    class97.method1542(field951);
                    Statics.field495 = -1;
                    method16(false);
                    field953 = -1;
                }
            }
        } catch (IOException var28) {
            if (field942 < 1) {
                if (Statics.field251 == Statics.field1389) {
                    Statics.field251 = Statics.field2189;
                } else {
                    Statics.field251 = Statics.field1389;
                }
                field942++;
                field910 = 0;
            } else {
                method162(-2);
            }
        }
    }

    @ObfuscatedName("r.fl(I)V")
    public static void method8() {
        field917 = -1L;
        field920 = -1;
        Statics.field642.field850 = 0;
        Statics.field340 = true;
        field1070 = true;
        field1131 = -1L;
        class281.method3972();
        field949.field2394 = 0;
        field951.field2394 = 0;
        field953 = -1;
        field956 = -1;
        field957 = -1;
        field958 = -1;
        field1091 = 0;
        field987 = 0;
        field959 = 0;
        field1121 = 0;
        field1038 = 0;
        field941 = -1;
        field1045 = false;
        class60.field718 = 0;
        class99.method1911();
        field1078 = 0;
        field1062 = false;
        field1081 = 0;
        field971 = (int) (Math.random() * 100.0D) - 50;
        field1051 = (int) (Math.random() * 110.0D) - 55;
        field970 = (int) (Math.random() * 80.0D) - 40;
        field978 = (int) (Math.random() * 120.0D) - 60;
        field980 = (int) (Math.random() * 30.0D) - 20;
        field991 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field1141 = 0;
        field1134 = -1;
        field1115 = 0;
        field1140 = 0;
        field932 = class92.field1410;
        field933 = class92.field1410;
        field945 = 0;
        class97.field1500 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class97.field1491[var0] = null;
            class97.field1488[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field1130[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field1110[var2] = null;
        }
        field926 = -1;
        field1174.method3319();
        field1040.method3319();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field1037[var3][var4][var5] = null;
                }
            }
        }
        field1108 = new class194();
        field1057 = 0;
        field1172 = 0;
        field1176 = 0;
        for (int var6 = 0; var6 < Statics.field3284; var6++) {
            class242 var7 = class242.method2842(var6);
            if (var7 != null) {
                class212.field2608[var6] = 0;
                class212.field2613[var6] = 0;
            }
        }
        Statics.field585.method1648();
        field1075 = -1;
        if (field1019 != -1) {
            int var8 = field1019;
            if (var8 != -1 && Statics.field2650[var8]) {
                Statics.field275.method3774(var8);
                if (Statics.field2642[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2642[var8].length; var10++) {
                        if (Statics.field2642[var8][var10] != null) {
                            if (Statics.field2642[var8][var10].field2656 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2642[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2642[var8] = null;
                    }
                    Statics.field2650[var8] = false;
                }
            }
        }
        for (class69 var11 = (class69) field1068.method3262(); var11 != null; var11 = (class69) field1068.method3263()) {
            method2657(var11, true);
        }
        field1019 = -1;
        field1068 = new class191(8);
        field1071 = null;
        field1038 = 0;
        field941 = -1;
        field1045 = false;
        field1178.method3624((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field1129[var12] = null;
            field1034[var12] = false;
        }
        class64.field786 = new class191(32);
        field988 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field1112[var13] = true;
        }
        method444();
        field1132 = null;
        Statics.field2233 = 0;
        Statics.field571 = null;
        for (int var14 = 0; var14 < 8; var14++) {
            field1181[var14] = new class17();
        }
        Statics.field905 = null;
    }

    @ObfuscatedName("b.ft(II)V")
    public static void method162(int arg0) {
        if (arg0 == -3) {
            class93.method7(class226.field2902, class226.field2903, class226.field2904);
        } else if (arg0 == -2) {
            class93.method7(class226.field2905, class226.field2906, class226.field2907);
        } else if (arg0 == -1) {
            class93.method7(class226.field3129, class226.field2909, class226.field2910);
        } else if (arg0 == 3) {
            class93.field1434 = 3;
        } else if (arg0 == 4) {
            class93.method7(class226.field2911, class226.field2912, class226.field2913);
        } else if (arg0 == 5) {
            class93.method7(class226.field3045, class226.field2915, class226.field2916);
        } else if (arg0 == 6) {
            class93.method7(class226.field2978, class226.field2921, class226.field2919);
        } else if (arg0 == 7) {
            class93.method7(class226.field2959, class226.field2869, class226.field2922);
        } else if (arg0 == 8) {
            class93.method7(class226.field2923, class226.field2942, class226.field2925);
        } else if (arg0 == 9) {
            class93.method7(class226.field2926, class226.field2927, class226.field2928);
        } else if (arg0 == 10) {
            class93.method7(class226.field2929, class226.field2930, class226.field2931);
        } else if (arg0 == 11) {
            class93.method7(class226.field3141, class226.field2933, class226.field2934);
        } else if (arg0 == 12) {
            class93.method7(class226.field2935, class226.field2936, class226.field2937);
        } else if (arg0 == 13) {
            class93.method7(class226.field2938, class226.field2939, class226.field3078);
        } else if (arg0 == 14) {
            class93.method7(class226.field2941, class226.field3106, class226.field2943);
        } else if (arg0 == 16) {
            class93.method7(class226.field2944, class226.field2945, class226.field3122);
        } else if (arg0 == 17) {
            class93.method7(class226.field2947, class226.field2873, class226.field2949);
        } else if (arg0 == 18) {
            class93.method7(class226.field2950, class226.field2951, class226.field3068);
        } else if (arg0 == 19) {
            class93.method7(class226.field2953, class226.field3089, class226.field2955);
        } else if (arg0 == 20) {
            class93.method7(class226.field2956, class226.field2957, class226.field2958);
        } else if (arg0 == 22) {
            class93.method7(class226.field2888, class226.field2895, class226.field2961);
        } else if (arg0 == 23) {
            class93.method7(class226.field2962, class226.field2963, class226.field2964);
        } else if (arg0 == 24) {
            class93.method7(class226.field2965, class226.field2966, class226.field2967);
        } else if (arg0 == 25) {
            class93.method7(class226.field2968, class226.field2969, class226.field2970);
        } else if (arg0 == 26) {
            class93.method7(class226.field2971, class226.field2972, class226.field2870);
        } else if (arg0 == 27) {
            class93.method7(class226.field2891, class226.field2975, class226.field2976);
        } else if (arg0 == 31) {
            class93.method7(class226.field3046, class226.field2872, class226.field2985);
        } else if (arg0 == 32) {
            class93.method7(class226.field2986, class226.field2987, class226.field2988);
        } else if (arg0 == 37) {
            class93.method7(class226.field2980, class226.field2990, class226.field2991);
        } else if (arg0 == 38) {
            class93.method7(class226.field2992, class226.field2993, class226.field2994);
        } else if (arg0 == 55) {
            class93.method7(class226.field3108, class226.field2996, class226.field2997);
        } else if (arg0 == 56) {
            class93.method7(class226.field3031, class226.field3012, class226.field3000);
            method471(11);
            return;
        } else if (arg0 == 57) {
            class93.method7(class226.field3062, class226.field3002, class226.field3003);
            method471(11);
            return;
        } else {
            class93.method7(class226.field3004, class226.field3005, class226.field3006);
        }
        method471(10);
    }

    @ObfuscatedName("gu.fm(B)V")
    public static final void method3574() {
        if (Statics.field2151 != null) {
            Statics.field2151.method2719();
            Statics.field2151 = null;
        }
        method2659();
        Statics.field416.method2443();
        for (int var0 = 0; var0 < 4; var0++) {
            field967[var0].method2757();
        }
        System.gc();
        class204.field2502 = 1;
        Statics.field2503 = null;
        Statics.field2504 = -1;
        Statics.field2205 = -1;
        Statics.field2505 = 0;
        Statics.field2506 = false;
        Statics.field862 = 2;
        field1143 = -1;
        field947 = false;
        class83.method60();
        method471(10);
    }

    @ObfuscatedName("ed.fw(I)V")
    public static final void method2659() {
        class260.field3590.method3244();
        class247.field3343.method3244();
        class248.field3354.method3244();
        class256.field3437.method3244();
        class256.field3447.method3244();
        class256.field3439.method3244();
        class256.field3440.method3244();
        class259.field3554.method3244();
        class259.field3575.method3244();
        class257.field3533.method3244();
        class257.field3494.method3244();
        class257.field3538.method3244();
        class261.field3605.method3244();
        class261.field3606.method3244();
        class246.field3326.method3244();
        class246.field3328.method3244();
        class251.method1618();
        class242.method121();
        class255.field3428.method3244();
        class255.field3431.method3244();
        class255.field3413.method3244();
        class249.method2658();
        class253.method3405();
        class252.method1430();
        class243.field3290.method3244();
        class214.field2628.method3244();
        class217.method2807();
        ((class126) Statics.field2031).method2152();
        class100.field1531.method3244();
        Statics.field441.method3775();
        Statics.field937.method3775();
        Statics.field3191.method3775();
        Statics.field503.method3775();
        Statics.field287.method3775();
        Statics.field2438.method3775();
        Statics.field2118.method3775();
        Statics.field312.method3775();
        Statics.field1188.method3775();
        Statics.field661.method3775();
        Statics.field268.method3775();
        Statics.field3661.method3775();
    }

    @ObfuscatedName("client.fr(I)V")
    public final void method1031() {
        if (field987 > 1) {
            field987--;
        }
        if (field959 > 0) {
            field959--;
        }
        if (field969) {
            field969 = false;
            if (field959 > 0) {
                method3574();
            } else {
                method471(40);
                Statics.field3624 = Statics.field2151;
                Statics.field2151 = null;
            }
            return;
        }
        if (!field1045) {
            field1038 = 0;
            field941 = -1;
            field1045 = false;
            field1147[0] = class226.field3099;
            field1123[0] = "";
            field985[0] = 1006;
            field1038 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1035(); var1++) {
        }
        if (field914 != 30) {
            return;
        }
        while (class281.method41()) {
            field949.method3136(161);
            field949.method2908(0);
            int var2 = field949.field2394;
            class281.method3892(field949);
            field949.method2868(field949.field2394 - var2);
        }
        Object var3 = Statics.field642.field853;
        synchronized (Statics.field642.field853) {
            if (!field909) {
                Statics.field642.field850 = 0;
            } else if (class60.field729 != 0 || Statics.field642.field850 >= 40) {
                field949.method3136(206);
                field949.method2908(0);
                int var4 = field949.field2394;
                int var5 = 0;
                for (int var6 = 0; var6 < Statics.field642.field850 && field949.field2394 - var4 < 240; var6++) {
                    var5++;
                    int var7 = Statics.field642.field852[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = Statics.field642.field851[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (Statics.field642.field852[var6] == -1 && Statics.field642.field851[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (field918 != var8 || field919 != var7) {
                        int var10 = var8 - field918;
                        field918 = var8;
                        int var11 = var7 - field919;
                        field919 = var7;
                        if (field920 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            field949.method2857((field920 << 12) + (var10 << 6) + var11);
                            field920 = 0;
                        } else if (field920 < 8) {
                            field949.method2858((field920 << 19) + 8388608 + var9);
                            field920 = 0;
                        } else {
                            field949.method2859((field920 << 19) + -1073741824 + var9);
                            field920 = 0;
                        }
                    } else if (field920 < 2047) {
                        field920++;
                    }
                }
                field949.method2868(field949.field2394 - var4);
                if (var5 >= Statics.field642.field850) {
                    Statics.field642.field850 = 0;
                } else {
                    Statics.field642.field850 -= var5;
                    for (int var12 = 0; var12 < Statics.field642.field850; var12++) {
                        Statics.field642.field851[var12] = Statics.field642.field851[var5 + var12];
                        Statics.field642.field852[var12] = Statics.field642.field852[var5 + var12];
                    }
                }
            }
        }
        if (class60.field729 == 1 || !Statics.field462 && class60.field729 == 4 || class60.field729 == 2) {
            long var14 = (class60.field730 - field917) / 50L;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            field917 = class60.field730;
            int var16 = class60.field731;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field3350) {
                var16 = Statics.field3350;
            }
            int var17 = class60.field736;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > Statics.field1214) {
                var17 = Statics.field1214;
            }
            int var18 = (int) var14;
            field949.method3136(11);
            field949.method2857((var18 << 1) + (class60.field729 == 2 ? 1 : 0));
            field949.method2857(var17);
            field949.method2857(var16);
        }
        if (class51.field635 > 0) {
            field949.method3136(184);
            field949.method2857(0);
            int var19 = field949.field2394;
            long var20 = class176.method584();
            for (int var22 = 0; var22 < class51.field635; var22++) {
                long var23 = var20 - field1131;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field1131 = var20;
                field949.method2908(class51.field634[var22]);
                field949.method2858((int) var23);
            }
            field949.method2901(field949.field2394 - var19);
        }
        if (field997 > 0) {
            field997--;
        }
        if (class51.field627[96] || class51.field627[97] || class51.field627[98] || class51.field627[99]) {
            field998 = true;
        }
        if (field998 && field997 <= 0) {
            field997 = 20;
            field998 = false;
            field949.method3136(193);
            field949.method2932(field991);
            field949.method2932(field990);
        }
        if (Statics.field340 && !field1070) {
            field1070 = true;
            field949.method3136(138);
            field949.method2908(1);
        }
        if (!Statics.field340 && field1070) {
            field1070 = false;
            field949.method3136(138);
            field949.method2908(0);
        }
        method24();
        if (field914 != 30) {
            return;
        }
        method6();
        int var10002;
        for (int var25 = 0; var25 < field1081; var25++) {
            var10002 = field1150[var25]--;
            if (field1150[var25] >= -10) {
                class106 var27 = field1152[var25];
                if (var27 == null) {
                    class106 var10000 = (class106) null;
                    var27 = class106.method1751(Statics.field503, field1148[var25], 0);
                    if (var27 == null) {
                        continue;
                    }
                    field1150[var25] += var27.method1745();
                    field1152[var25] = var27;
                }
                if (field1150[var25] < 0) {
                    int var34;
                    if (field1015[var25] == 0) {
                        var34 = field1060;
                    } else {
                        int var28 = (field1015[var25] & 0xFF) * 128;
                        int var29 = field1015[var25] >> 16 & 0xFF;
                        int var30 = var29 * 128 + 64 - Statics.field1537.field1233;
                        if (var30 < 0) {
                            var30 = -var30;
                        }
                        int var31 = field1015[var25] >> 8 & 0xFF;
                        int var32 = var31 * 128 + 64 - Statics.field1537.field1265;
                        if (var32 < 0) {
                            var32 = -var32;
                        }
                        int var33 = var30 + var32 - 128;
                        if (var33 > var28) {
                            field1150[var25] = -100;
                            continue;
                        }
                        if (var33 < 0) {
                            var33 = 0;
                        }
                        var34 = field1173 * (var28 - var33) / var28;
                    }
                    if (var34 > 0) {
                        class108 var35 = var27.method1744().method1793(Statics.field3594);
                        class118 var36 = class118.method1996(var35, 100, var34);
                        var36.method2011(field966[var25] - 1);
                        Statics.field2512.method1720(var36);
                    }
                    field1150[var25] = -100;
                }
            } else {
                field1081--;
                for (int var26 = var25; var26 < field1081; var26++) {
                    field1148[var26] = field1148[var26 + 1];
                    field1152[var26] = field1152[var26 + 1];
                    field966[var26] = field966[var26 + 1];
                    field1150[var26] = field1150[var26 + 1];
                    field1015[var26] = field1015[var26 + 1];
                }
                var25--;
            }
        }
        if (field947) {
            boolean var37;
            if (class204.field2502 == 0) {
                var37 = Statics.field2501.method3428();
            } else {
                var37 = true;
            }
            if (!var37) {
                if (field924 != 0 && field1143 != -1) {
                    class204.method966(Statics.field2438, field1143, 0, field924, false);
                }
                field947 = false;
            }
        }
        field1091++;
        if (field1091 <= 750) {
            int var38 = class97.field1500;
            int[] var39 = class97.field1493;
            for (int var40 = 0; var40 < var38; var40++) {
                class75 var41 = field1130[var39[var40]];
                if (var41 != null) {
                    method236(var41, 1);
                }
            }
            for (int var42 = 0; var42 < field945; var42++) {
                int var43 = field946[var42];
                class87 var44 = field1110[var43];
                if (var44 != null) {
                    method236(var44, var44.field1368.field3558);
                }
            }
            method52();
            field983++;
            if (field1017 != 0) {
                field1016 += 20;
                if (field1016 >= 400) {
                    field1017 = 0;
                }
            }
            if (Statics.field483 != null) {
                field1018++;
                if (field1018 >= 15) {
                    method632(Statics.field483);
                    Statics.field483 = null;
                }
            }
            class217 var45 = Statics.field309;
            class217 var46 = Statics.field484;
            Statics.field309 = null;
            Statics.field484 = null;
            field1084 = null;
            field1088 = false;
            field1085 = false;
            field907 = 0;
            while (class51.method1893() && field907 < 128) {
                if (field1074 >= 2 && class51.field627[82] && Statics.field628 == 66) {
                    String var47 = "";
                    Iterator var48 = class99.field1521.iterator();
                    while (var48.hasNext()) {
                        class73 var49 = (class73) var48.next();
                        var47 = var47 + var49.field856 + ':' + var49.field860 + '\n';
                    }
                    Statics.field403.method738(var47);
                } else {
                    field1170[field907] = Statics.field628;
                    field1002[field907] = Statics.field2511;
                    field907++;
                }
            }
            if (field1019 != -1) {
                method577(field1019, 0, 0, Statics.field1214, Statics.field3350, 0, 0);
            }
            field1046++;
            while (true) {
                class70 var52;
                class217 var53;
                class217 var54;
                do {
                    var52 = (class70) field1107.method3323();
                    if (var52 == null) {
                        while (true) {
                            class70 var55;
                            class217 var56;
                            class217 var57;
                            do {
                                var55 = (class70) field1116.method3323();
                                if (var55 == null) {
                                    while (true) {
                                        class70 var58;
                                        class217 var59;
                                        class217 var60;
                                        do {
                                            var58 = (class70) field1106.method3323();
                                            if (var58 == null) {
                                                this.method1036();
                                                method1541();
                                                if (field1080 != null) {
                                                    this.method1040();
                                                }
                                                if (Statics.field842 != null) {
                                                    method632(Statics.field842);
                                                    field1052++;
                                                    if (class60.field722 == 0) {
                                                        if (!field1024) {
                                                            label902: {
                                                                int var69 = method2364();
                                                                if (field1038 > 2) {
                                                                    label887: {
                                                                        label865: {
                                                                            if (field1044 == 1) {
                                                                                boolean var70;
                                                                                if (field1038 <= 0) {
                                                                                    var70 = false;
                                                                                } else if (field1055 && class51.field627[81] && field941 != -1) {
                                                                                    var70 = true;
                                                                                } else {
                                                                                    var70 = false;
                                                                                }
                                                                                if (!var70) {
                                                                                    break label865;
                                                                                }
                                                                            }
                                                                            boolean var71;
                                                                            if (var69 < 0) {
                                                                                var71 = false;
                                                                            } else {
                                                                                int var72 = field985[var69];
                                                                                if (var72 >= 2000) {
                                                                                    var72 -= 2000;
                                                                                }
                                                                                if (var72 == 1007) {
                                                                                    var71 = true;
                                                                                } else {
                                                                                    var71 = false;
                                                                                }
                                                                            }
                                                                            if (!var71) {
                                                                                break label887;
                                                                            }
                                                                        }
                                                                        this.method1037(field1033, field1022);
                                                                        break label902;
                                                                    }
                                                                }
                                                                if (field1038 > 0) {
                                                                    int var73 = field1033;
                                                                    int var74 = field1022;
                                                                    method317(Statics.field1526, var73, var74);
                                                                    Statics.field1526 = null;
                                                                }
                                                            }
                                                        } else if (Statics.field842 == Statics.field814 && field944 != field1023) {
                                                            class217 var61 = Statics.field842;
                                                            byte var62 = 0;
                                                            if (field973 == 1 && var61.field2658 == 206) {
                                                                var62 = 1;
                                                            }
                                                            if (var61.field2772[field1023] <= 0) {
                                                                var62 = 0;
                                                            }
                                                            int var63 = method619(var61);
                                                            boolean var64 = (var63 >> 29 & 0x1) != 0;
                                                            if (var64) {
                                                                int var65 = field944;
                                                                int var66 = field1023;
                                                                var61.field2772[var66] = var61.field2772[var65];
                                                                var61.field2763[var66] = var61.field2763[var65];
                                                                var61.field2772[var65] = -1;
                                                                var61.field2763[var65] = 0;
                                                            } else if (var62 == 1) {
                                                                int var67 = field944;
                                                                int var68 = field1023;
                                                                while (var67 != var68) {
                                                                    if (var67 > var68) {
                                                                        var61.method3665(var67 - 1, var67);
                                                                        var67--;
                                                                    } else if (var67 < var68) {
                                                                        var61.method3665(var67 + 1, var67);
                                                                        var67++;
                                                                    }
                                                                }
                                                            } else {
                                                                var61.method3665(field1023, field944);
                                                            }
                                                            field949.method3136(116);
                                                            field949.method2897(var62);
                                                            field949.method3030(Statics.field842.field2654);
                                                            field949.method2857(field1023);
                                                            field949.method2905(field944);
                                                        }
                                                        field1018 = 10;
                                                        class60.field729 = 0;
                                                        Statics.field842 = null;
                                                    } else if (field1052 >= 5 && (class60.field723 > field1033 + 5 || class60.field723 < field1033 - 5 || class60.field724 * -90084053 > field1022 + 5 || class60.field724 * -90084053 < field1022 - 5)) {
                                                        field1024 = true;
                                                    }
                                                }
                                                if (class140.method2482()) {
                                                    int var75 = class140.field2088;
                                                    int var76 = class140.field2076;
                                                    field949.method3136(4);
                                                    field949.method2908(5);
                                                    field949.method2895(class51.field627[82] ? (class51.field627[81] ? 2 : 1) : 0);
                                                    field949.method2905(Statics.field2316 + var75);
                                                    field949.method2932(Statics.field265 + var76);
                                                    class140.method2519();
                                                    field1014 = class60.field736;
                                                    field1072 = class60.field731;
                                                    field1017 = 1;
                                                    field1016 = 0;
                                                    field1115 = var75;
                                                    field1140 = var76;
                                                }
                                                if (Statics.field309 != var45) {
                                                    if (var45 != null) {
                                                        method632(var45);
                                                    }
                                                    if (Statics.field309 != null) {
                                                        method632(Statics.field309);
                                                    }
                                                }
                                                if (Statics.field484 != var46 && field1184 == field1133) {
                                                    if (var46 != null) {
                                                        method632(var46);
                                                    }
                                                    if (Statics.field484 != null) {
                                                        method632(Statics.field484);
                                                    }
                                                }
                                                if (Statics.field484 == null) {
                                                    if (field1133 > 0) {
                                                        field1133--;
                                                    }
                                                } else if (field1133 < field1184) {
                                                    field1133++;
                                                    if (field1184 == field1133) {
                                                        method632(Statics.field484);
                                                    }
                                                }
                                                method712();
                                                if (field1153) {
                                                    int var77 = Statics.field772 * 128 + 64;
                                                    int var78 = Statics.field783 * 128 + 64;
                                                    int var79 = method1363(var77, var78, Statics.field579) - Statics.field1204;
                                                    if (Statics.field542 < var77) {
                                                        Statics.field542 += Statics.field560 * (var77 - Statics.field542) / 1000 + Statics.field2172;
                                                        if (Statics.field542 > var77) {
                                                            Statics.field542 = var77;
                                                        }
                                                    }
                                                    if (Statics.field542 > var77) {
                                                        Statics.field542 -= Statics.field560 * (Statics.field542 - var77) / 1000 + Statics.field2172;
                                                        if (Statics.field542 < var77) {
                                                            Statics.field542 = var77;
                                                        }
                                                    }
                                                    if (Statics.field781 < var79) {
                                                        Statics.field781 += Statics.field560 * (var79 - Statics.field781) / 1000 + Statics.field2172;
                                                        if (Statics.field781 > var79) {
                                                            Statics.field781 = var79;
                                                        }
                                                    }
                                                    if (Statics.field781 > var79) {
                                                        Statics.field781 -= Statics.field560 * (Statics.field781 - var79) / 1000 + Statics.field2172;
                                                        if (Statics.field781 < var79) {
                                                            Statics.field781 = var79;
                                                        }
                                                    }
                                                    if (Statics.field234 < var78) {
                                                        Statics.field234 += Statics.field560 * (var78 - Statics.field234) / 1000 + Statics.field2172;
                                                        if (Statics.field234 > var78) {
                                                            Statics.field234 = var78;
                                                        }
                                                    }
                                                    if (Statics.field234 > var78) {
                                                        Statics.field234 -= Statics.field560 * (Statics.field234 - var78) / 1000 + Statics.field2172;
                                                        if (Statics.field234 < var78) {
                                                            Statics.field234 = var78;
                                                        }
                                                    }
                                                    int var80 = Statics.field2435 * 128 + 64;
                                                    int var81 = Statics.field1355 * 128 + 64;
                                                    int var82 = method1363(var80, var81, Statics.field579) - Statics.field30;
                                                    int var83 = var80 - Statics.field542;
                                                    int var84 = var82 - Statics.field781;
                                                    int var85 = var81 - Statics.field234;
                                                    int var86 = (int) Math.sqrt((double) (var83 * var83 + var85 * var85));
                                                    int var87 = (int) (Math.atan2((double) var84, (double) var86) * 325.949D) & 0x7FF;
                                                    int var88 = (int) (Math.atan2((double) var83, (double) var85) * -325.949D) & 0x7FF;
                                                    if (var87 < 128) {
                                                        var87 = 128;
                                                    }
                                                    if (var87 > 383) {
                                                        var87 = 383;
                                                    }
                                                    if (Statics.field241 < var87) {
                                                        Statics.field241 += Statics.field499 * (var87 - Statics.field241) / 1000 + Statics.field2256;
                                                        if (Statics.field241 > var87) {
                                                            Statics.field241 = var87;
                                                        }
                                                    }
                                                    if (Statics.field241 > var87) {
                                                        Statics.field241 -= Statics.field499 * (Statics.field241 - var87) / 1000 + Statics.field2256;
                                                        if (Statics.field241 < var87) {
                                                            Statics.field241 = var87;
                                                        }
                                                    }
                                                    int var89 = var88 - Statics.field808;
                                                    if (var89 > 1024) {
                                                        var89 -= 2048;
                                                    }
                                                    if (var89 < -1024) {
                                                        var89 += 2048;
                                                    }
                                                    if (var89 > 0) {
                                                        Statics.field808 += Statics.field499 * var89 / 1000 + Statics.field2256;
                                                        Statics.field808 &= 0x7FF;
                                                    }
                                                    if (var89 < 0) {
                                                        Statics.field808 -= Statics.field499 * -var89 / 1000 + Statics.field2256;
                                                        Statics.field808 &= 0x7FF;
                                                    }
                                                    int var90 = var88 - Statics.field808;
                                                    if (var90 > 1024) {
                                                        var90 -= 2048;
                                                    }
                                                    if (var90 < -1024) {
                                                        var90 += 2048;
                                                    }
                                                    if (var90 < 0 && var89 > 0 || var90 > 0 && var89 < 0) {
                                                        Statics.field808 = var88;
                                                    }
                                                }
                                                for (int var91 = 0; var91 < 5; var91++) {
                                                    var10002 = field1158[var91]++;
                                                }
                                                Statics.field585.method1621();
                                                int var92 = class60.method42();
                                                int var93 = class51.field639;
                                                if (var92 > 15000 && var93 > 15000) {
                                                    field959 = 250;
                                                    class60.field718 = 14500;
                                                    field949.method3136(194);
                                                }
                                                field977++;
                                                if (field977 > 500) {
                                                    field977 = 0;
                                                    int var95 = (int) (Math.random() * 8.0D);
                                                    if ((var95 & 0x1) == 1) {
                                                        field971 += field1114;
                                                    }
                                                    if ((var95 & 0x2) == 2) {
                                                        field1051 += field974;
                                                    }
                                                    if ((var95 & 0x4) == 4) {
                                                        field970 += field923;
                                                    }
                                                }
                                                if (field971 < -50) {
                                                    field1114 = 2;
                                                }
                                                if (field971 > 50) {
                                                    field1114 = -2;
                                                }
                                                if (field1051 < -55) {
                                                    field974 = 2;
                                                }
                                                if (field1051 > 55) {
                                                    field974 = -2;
                                                }
                                                if (field970 < -40) {
                                                    field923 = 1;
                                                }
                                                if (field970 > 40) {
                                                    field923 = -1;
                                                }
                                                field982++;
                                                if (field982 > 500) {
                                                    field982 = 0;
                                                    int var96 = (int) (Math.random() * 8.0D);
                                                    if ((var96 & 0x1) == 1) {
                                                        field978 += field979;
                                                    }
                                                    if ((var96 & 0x2) == 2) {
                                                        field980 += field981;
                                                    }
                                                }
                                                if (field978 < -60) {
                                                    field979 = 2;
                                                }
                                                if (field978 > 60) {
                                                    field979 = -2;
                                                }
                                                if (field980 < -20) {
                                                    field981 = 1;
                                                }
                                                if (field980 > 10) {
                                                    field981 = -1;
                                                }
                                                for (class68 var97 = (class68) field1180.method3360(); var97 != null; var97 = (class68) field1180.method3353()) {
                                                    if ((long) var97.field821 < class176.method584() / 1000L - 5L) {
                                                        if (var97.field819 > 0) {
                                                            class99.method973(5, "", var97.field818 + class226.field3051);
                                                        }
                                                        if (var97.field819 == 0) {
                                                            class99.method973(5, "", var97.field818 + class226.field2940);
                                                        }
                                                        var97.method3363();
                                                    }
                                                }
                                                field1149++;
                                                if (field1149 > 50) {
                                                    field949.method3136(102);
                                                }
                                                try {
                                                    if (Statics.field2151 != null && field949.field2394 > 0) {
                                                        Statics.field2151.method2733(field949.field2391, 0, field949.field2394);
                                                        field949.field2394 = 0;
                                                        field1149 = 0;
                                                    }
                                                } catch (IOException var99) {
                                                    if (field959 > 0) {
                                                        method3574();
                                                    } else {
                                                        method471(40);
                                                        Statics.field3624 = Statics.field2151;
                                                        Statics.field2151 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var59 = var58.field831;
                                            if (var59.field2711 < 0) {
                                                break;
                                            }
                                            var60 = class217.method921(var59.field2673);
                                        } while (var60 == null || var60.field2744 == null || var59.field2711 >= var60.field2744.length || var60.field2744[var59.field2711] != var59);
                                        class84.method1537(var58);
                                    }
                                }
                                var56 = var55.field831;
                                if (var56.field2711 < 0) {
                                    break;
                                }
                                var57 = class217.method921(var56.field2673);
                            } while (var57 == null || var57.field2744 == null || var56.field2711 >= var57.field2744.length || var57.field2744[var56.field2711] != var56);
                            class84.method1537(var55);
                        }
                    }
                    var53 = var52.field831;
                    if (var53.field2711 < 0) {
                        break;
                    }
                    var54 = class217.method921(var53.field2673);
                } while (var54 == null || var54.field2744 == null || var53.field2711 >= var54.field2744.length || var54.field2744[var53.field2711] != var53);
                class84.method1537(var52);
            }
        } else if (field959 > 0) {
            method3574();
        } else {
            method471(40);
            Statics.field3624 = Statics.field2151;
            Statics.field2151 = null;
        }
    }

    @ObfuscatedName("ah.fp(I)V")
    public static final void method622() {
        if (Statics.field613 != null) {
            Statics.field613.method1823();
        }
        if (Statics.field3864 != null) {
            Statics.field3864.method1823();
        }
    }

    @ObfuscatedName("u.fi(Ljg;IIIB)V")
    public static void method51(class261 arg0, int arg1, int arg2, int arg3) {
        if (field1081 >= 50 || field1173 == 0 || arg0.field3610 == null || arg1 >= arg0.field3610.length) {
            return;
        }
        int var4 = arg0.field3610[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1148[field1081] = var5;
        field966[field1081] = var6;
        field1150[field1081] = 0;
        field1152[field1081] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1015[field1081] = (var8 << 16) + (var9 << 8) + var7;
        field1081++;
    }

    @ObfuscatedName("s.fe(I)V")
    public static final void method24() {
        if (Statics.field579 != field1134) {
            field1134 = Statics.field579;
            method961(Statics.field579);
        }
    }

    @ObfuscatedName("u.fn(I)V")
    public static final void method52() {
        int[] var0 = class97.field1493;
        for (int var1 = 0; var1 < class97.field1500; var1++) {
            class75 var2 = field1130[var0[var1]];
            if (var2 != null && var2.field1231 > 0) {
                var2.field1231--;
                if (var2.field1231 == 0) {
                    var2.field1228 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field945; var3++) {
            int var4 = field946[var3];
            class87 var5 = field1110[var4];
            if (var5 != null && var5.field1231 > 0) {
                var5.field1231--;
                if (var5.field1231 == 0) {
                    var5.field1228 = null;
                }
            }
        }
    }

    @ObfuscatedName("bl.fo(I)V")
    public static final void method712() {
        int var0 = field971 + Statics.field1537.field1233;
        int var1 = field1051 + Statics.field1537.field1265;
        if (Statics.field660 - var0 < -500 || Statics.field660 - var0 > 500 || Statics.field606 - var1 < -500 || Statics.field606 - var1 > 500) {
            Statics.field660 = var0;
            Statics.field606 = var1;
        }
        if (Statics.field660 != var0) {
            Statics.field660 += (var0 - Statics.field660) / 16;
        }
        if (Statics.field606 != var1) {
            Statics.field606 += (var1 - Statics.field606) / 16;
        }
        if (class60.field722 == 4 && Statics.field462) {
            int var2 = class60.field724 * -90084053 - field995;
            field993 = var2 * 2;
            field995 = var2 == -1 || var2 == 1 ? class60.field724 * -90084053 : (field995 + class60.field724 * -90084053) / 2;
            int var3 = field1066 - class60.field723;
            field992 = var3 * 2;
            field1066 = var3 == -1 || var3 == 1 ? class60.field723 : (field1066 + class60.field723) / 2;
        } else {
            if (class51.field627[96]) {
                field992 += (-24 - field992) / 2;
            } else if (class51.field627[97]) {
                field992 += (24 - field992) / 2;
            } else {
                field992 /= 2;
            }
            if (class51.field627[98]) {
                field993 += (12 - field993) / 2;
            } else if (class51.field627[99]) {
                field993 += (-12 - field993) / 2;
            } else {
                field993 /= 2;
            }
            field995 = class60.field724 * -90084053;
            field1066 = class60.field723;
        }
        field991 = field992 / 2 + field991 & 0x7FF;
        field990 += field993 / 2;
        if (field990 < 128) {
            field990 = 128;
        }
        if (field990 > 383) {
            field990 = 383;
        }
        int var4 = Statics.field660 >> 7;
        int var5 = Statics.field606 >> 7;
        int var6 = method1363(Statics.field660, Statics.field606, Statics.field579);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field579;
                    if (var10 < 3 && (class62.field747[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field756[var10][var8][var9];
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
        if (var12 > field999) {
            field999 += (var12 - field999) / 24;
        } else if (var12 < field999) {
            field999 += (var12 - field999) / 80;
        }
    }

    @ObfuscatedName("ap.fb(Lca;II)V")
    public static final void method236(class79 arg0, int arg1) {
        if (arg0.field1261 > field934) {
            int var2 = arg0.field1261 - field934;
            int var3 = arg0.field1257 * 128 + arg0.field1219 * 64;
            int var4 = arg0.field1259 * 128 + arg0.field1219 * 64;
            arg0.field1233 += (var3 - arg0.field1233) / var2;
            arg0.field1265 += (var4 - arg0.field1265) / var2;
            arg0.field1273 = 0;
            arg0.field1266 = arg0.field1263;
        } else if (arg0.field1262 >= field934) {
            method4316(arg0);
        } else {
            method2634(arg0);
        }
        if (arg0.field1233 < 128 || arg0.field1265 < 128 || arg0.field1233 >= 13184 || arg0.field1265 >= 13184) {
            arg0.field1247 = -1;
            arg0.field1215 = -1;
            arg0.field1261 = 0;
            arg0.field1262 = 0;
            arg0.field1233 = arg0.field1270[0] * 128 + arg0.field1219 * 64;
            arg0.field1265 = arg0.field1255[0] * 128 + arg0.field1219 * 64;
            arg0.method1347();
        }
        if (Statics.field1537 == arg0 && (arg0.field1233 < 1536 || arg0.field1265 < 1536 || arg0.field1233 >= 11776 || arg0.field1265 >= 11776)) {
            arg0.field1247 = -1;
            arg0.field1215 = -1;
            arg0.field1261 = 0;
            arg0.field1262 = 0;
            arg0.field1233 = arg0.field1270[0] * 128 + arg0.field1219 * 64;
            arg0.field1265 = arg0.field1255[0] * 128 + arg0.field1219 * 64;
            arg0.method1347();
        }
        if (arg0.field1268 != 0) {
            if (arg0.field1250 != -1) {
                class79 var5 = null;
                if (arg0.field1250 < 32768) {
                    var5 = field1110[arg0.field1250];
                } else if (arg0.field1250 >= 32768) {
                    var5 = field1130[arg0.field1250 - 32768];
                }
                if (var5 != null) {
                    int var6 = arg0.field1233 - var5.field1233;
                    int var7 = arg0.field1265 - var5.field1265;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field1266 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1272) {
                    arg0.field1250 = -1;
                    arg0.field1272 = false;
                }
            }
            if (arg0.field1243 != -1 && (arg0.field1269 == 0 || arg0.field1273 > 0)) {
                arg0.field1266 = arg0.field1243;
                arg0.field1243 = -1;
            }
            int var8 = arg0.field1266 - arg0.field1241 & 0x7FF;
            if (var8 == 0 && arg0.field1272) {
                arg0.field1250 = -1;
                arg0.field1272 = false;
            }
            if (var8 == 0) {
                arg0.field1267 = 0;
            } else {
                arg0.field1267++;
                if (var8 > 1024) {
                    arg0.field1241 -= arg0.field1268;
                    boolean var9 = true;
                    if (var8 < arg0.field1268 || var8 > 2048 - arg0.field1268) {
                        arg0.field1241 = arg0.field1266;
                        var9 = false;
                    }
                    if (arg0.field1271 == arg0.field1244 && (arg0.field1267 > 25 || var9)) {
                        if (arg0.field1221 == -1) {
                            arg0.field1244 = arg0.field1252;
                        } else {
                            arg0.field1244 = arg0.field1221;
                        }
                    }
                } else {
                    arg0.field1241 += arg0.field1268;
                    boolean var10 = true;
                    if (var8 < arg0.field1268 || var8 > 2048 - arg0.field1268) {
                        arg0.field1241 = arg0.field1266;
                        var10 = false;
                    }
                    if (arg0.field1271 == arg0.field1244 && (arg0.field1267 > 25 || var10)) {
                        if (arg0.field1245 == -1) {
                            arg0.field1244 = arg0.field1252;
                        } else {
                            arg0.field1244 = arg0.field1245;
                        }
                    }
                }
                arg0.field1241 &= 0x7FF;
            }
        }
        arg0.field1218 = false;
        if (arg0.field1244 != -1) {
            class261 var12 = class261.method1884(arg0.field1244);
            if (var12 == null || var12.field3608 == null) {
                arg0.field1244 = -1;
            } else {
                arg0.field1246++;
                if (arg0.field1253 < var12.field3608.length && arg0.field1246 > var12.field3619[arg0.field1253]) {
                    arg0.field1246 = 1;
                    arg0.field1253++;
                    method51(var12, arg0.field1253, arg0.field1233, arg0.field1265);
                }
                if (arg0.field1253 >= var12.field3608.length) {
                    arg0.field1246 = 0;
                    arg0.field1253 = 0;
                    method51(var12, arg0.field1253, arg0.field1233, arg0.field1265);
                }
            }
        }
        if (arg0.field1215 != -1 && field934 >= arg0.field1217) {
            if (arg0.field1251 < 0) {
                arg0.field1251 = 0;
            }
            int var13 = class246.method3901(arg0.field1215).field3330;
            if (var13 == -1) {
                arg0.field1215 = -1;
            } else {
                class261 var14 = class261.method1884(var13);
                if (var14 == null || var14.field3608 == null) {
                    arg0.field1215 = -1;
                } else {
                    arg0.field1254++;
                    if (arg0.field1251 < var14.field3608.length && arg0.field1254 > var14.field3619[arg0.field1251]) {
                        arg0.field1254 = 1;
                        arg0.field1251++;
                        method51(var14, arg0.field1251, arg0.field1233, arg0.field1265);
                    }
                    if (arg0.field1251 >= var14.field3608.length && (arg0.field1251 < 0 || arg0.field1251 >= var14.field3608.length)) {
                        arg0.field1215 = -1;
                    }
                }
            }
        }
        if (arg0.field1247 != -1 && arg0.field1227 <= 1) {
            class261 var15 = class261.method1884(arg0.field1247);
            if (var15.field3618 == 1 && arg0.field1274 > 0 && arg0.field1261 <= field934 && arg0.field1262 < field934) {
                arg0.field1227 = 1;
                return;
            }
        }
        if (arg0.field1247 != -1 && arg0.field1227 == 0) {
            class261 var16 = class261.method1884(arg0.field1247);
            if (var16 == null || var16.field3608 == null) {
                arg0.field1247 = -1;
            } else {
                arg0.field1249++;
                if (arg0.field1248 < var16.field3608.length && arg0.field1249 > var16.field3619[arg0.field1248]) {
                    arg0.field1249 = 1;
                    arg0.field1248++;
                    method51(var16, arg0.field1248, arg0.field1233, arg0.field1265);
                }
                if (arg0.field1248 >= var16.field3608.length) {
                    arg0.field1248 -= var16.field3611;
                    arg0.field1260++;
                    if (arg0.field1260 >= var16.field3616) {
                        arg0.field1247 = -1;
                    } else if (arg0.field1248 >= 0 && arg0.field1248 < var16.field3608.length) {
                        method51(var16, arg0.field1248, arg0.field1233, arg0.field1265);
                    } else {
                        arg0.field1247 = -1;
                    }
                }
                arg0.field1218 = var16.field3613;
            }
        }
        if (arg0.field1227 > 0) {
            arg0.field1227--;
        }
    }

    @ObfuscatedName("jk.fx(Lca;I)V")
    public static final void method4316(class79 arg0) {
        if (field934 == arg0.field1262 || arg0.field1247 == -1 || arg0.field1227 != 0 || arg0.field1249 + 1 > class261.method1884(arg0.field1247).field3619[arg0.field1248]) {
            int var1 = arg0.field1262 - arg0.field1261;
            int var2 = field934 - arg0.field1261;
            int var3 = arg0.field1257 * 128 + arg0.field1219 * 64;
            int var4 = arg0.field1259 * 128 + arg0.field1219 * 64;
            int var5 = arg0.field1258 * 128 + arg0.field1219 * 64;
            int var6 = arg0.field1223 * 128 + arg0.field1219 * 64;
            arg0.field1233 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1265 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1273 = 0;
        arg0.field1266 = arg0.field1263;
        arg0.field1241 = arg0.field1266;
    }

    @ObfuscatedName("ea.fc(Lca;B)V")
    public static final void method2634(class79 arg0) {
        arg0.field1244 = arg0.field1271;
        if (arg0.field1269 == 0) {
            arg0.field1273 = 0;
            return;
        }
        if (arg0.field1247 != -1 && arg0.field1227 == 0) {
            class261 var1 = class261.method1884(arg0.field1247);
            if (arg0.field1274 > 0 && var1.field3618 == 0) {
                arg0.field1273++;
                return;
            }
            if (arg0.field1274 <= 0 && var1.field3621 == 0) {
                arg0.field1273++;
                return;
            }
        }
        int var2 = arg0.field1233;
        int var3 = arg0.field1265;
        int var4 = arg0.field1270[arg0.field1269 - 1] * 128 + arg0.field1219 * 64;
        int var5 = arg0.field1255[arg0.field1269 - 1] * 128 + arg0.field1219 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1266 = 1280;
            } else if (var3 > var5) {
                arg0.field1266 = 1792;
            } else {
                arg0.field1266 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1266 = 768;
            } else if (var3 > var5) {
                arg0.field1266 = 256;
            } else {
                arg0.field1266 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1266 = 1024;
        } else if (var3 > var5) {
            arg0.field1266 = 0;
        }
        byte var6 = arg0.field1240[arg0.field1269 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1233 = var4;
            arg0.field1265 = var5;
            arg0.field1269--;
            if (arg0.field1274 > 0) {
                arg0.field1274--;
            }
            return;
        }
        int var7 = arg0.field1266 - arg0.field1241 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1224;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1252;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1226;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1225;
        }
        if (var8 == -1) {
            var8 = arg0.field1252;
        }
        arg0.field1244 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class87) {
            var10 = ((class87) arg0).field1368.field3586;
        }
        if (var10) {
            if (arg0.field1266 != arg0.field1241 && arg0.field1250 == -1 && arg0.field1268 != 0) {
                var9 = 2;
            }
            if (arg0.field1269 > 2) {
                var9 = 6;
            }
            if (arg0.field1269 > 3) {
                var9 = 8;
            }
            if (arg0.field1273 > 0 && arg0.field1269 > 1) {
                var9 = 8;
                arg0.field1273--;
            }
        } else {
            if (arg0.field1269 > 1) {
                var9 = 6;
            }
            if (arg0.field1269 > 2) {
                var9 = 8;
            }
            if (arg0.field1273 > 0 && arg0.field1269 > 1) {
                var9 = 8;
                arg0.field1273--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1252 == arg0.field1244 && arg0.field1222 != -1) {
            arg0.field1244 = arg0.field1222;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1233 += var9;
                if (arg0.field1233 > var4) {
                    arg0.field1233 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1233 -= var9;
                if (arg0.field1233 < var4) {
                    arg0.field1233 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1265 += var9;
                if (arg0.field1265 > var5) {
                    arg0.field1265 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1265 -= var9;
                if (arg0.field1265 < var5) {
                    arg0.field1265 = var5;
                }
            }
        }
        if (arg0.field1233 == var4 && arg0.field1265 == var5) {
            arg0.field1269--;
            if (arg0.field1274 > 0) {
                arg0.field1274--;
            }
        }
    }

    @ObfuscatedName("cl.ff(I)V")
    public static void method1541() {
        if (Statics.field276 != null) {
            Statics.field276.method4766(Statics.field579, (Statics.field1537.field1233 >> 7) + Statics.field2316, (Statics.field1537.field1265 >> 7) + Statics.field265, false);
            Statics.field276.method4817();
        }
    }

    @ObfuscatedName("fu.fg(Lbe;III)V")
    public static void method2717(class75 arg0, int arg1, int arg2) {
        if (arg0.field1247 == arg1 && arg1 != -1) {
            int var3 = class261.method1884(arg1).field3620;
            if (var3 == 1) {
                arg0.field1248 = 0;
                arg0.field1249 = 0;
                arg0.field1227 = arg2;
                arg0.field1260 = 0;
            }
            if (var3 == 2) {
                arg0.field1260 = 0;
            }
        } else if (arg1 == -1 || arg0.field1247 == -1 || class261.method1884(arg1).field3614 >= class261.method1884(arg0.field1247).field3614) {
            arg0.field1247 = arg1;
            arg0.field1248 = 0;
            arg0.field1249 = 0;
            arg0.field1227 = arg2;
            arg0.field1260 = 0;
            arg0.field1274 = arg0.field1269;
        }
    }

    @ObfuscatedName("be.fy(B)I")
    public static int method1002() {
        return field1151 ? 2 : 1;
    }

    @ObfuscatedName("j.gh(IB)V")
    public static void method2(int arg0) {
        field952 = 0L;
        if (arg0 >= 2) {
            field1151 = true;
        } else {
            field1151 = false;
        }
        int var1 = field1151 ? 2 : 1;
        if (var1 == 1) {
            Statics.field403.method822(765, 503);
        } else {
            Statics.field403.method822(7680, 2160);
        }
        if (field914 >= 25) {
            method444();
        }
    }

    @ObfuscatedName("aq.gy(I)V")
    public static void method444() {
        field949.method3136(220);
        class180 var0 = field949;
        int var1 = field1151 ? 2 : 1;
        var0.method2908(var1);
        field949.method2857(Statics.field1214);
        field949.method2857(Statics.field3350);
    }

    @ObfuscatedName("client.k(I)V")
    public final void method742() {
        field952 = class176.method584() + 500L;
        this.method1033();
        if (field1019 != -1) {
            this.method1038(true);
        }
    }

    @ObfuscatedName("client.gb(S)V")
    public void method1033() {
        int var1 = Statics.field1214;
        int var2 = Statics.field3350;
        if (this.field700 < var1) {
            int var3 = this.field700;
        }
        if (this.field694 < var2) {
            int var4 = this.field694;
        }
        if (Statics.field344 == null) {
            return;
        }
        try {
            client var5 = Statics.field403;
            Object[] var6 = new Object[] { method1002() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gg(I)V")
    public final void method1034() {
        if (field1019 != -1) {
            int var1 = field1019;
            if (class217.method315(var1)) {
                method4490(Statics.field2642[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1007; var2++) {
            if (field1112[var2]) {
                field1113[var2] = true;
            }
            field939[var2] = field1112[var2];
            field1112[var2] = false;
        }
        field1111 = field934;
        field1056 = -1;
        field916 = -1;
        Statics.field814 = null;
        if (field1019 != -1) {
            field1007 = 0;
            method2369(field1019, 0, 0, Statics.field1214, Statics.field3350, 0, 0, -1);
        }
        class282.method4537();
        if (field1045) {
            method1019();
        } else if (field1056 != -1) {
            int var3 = field1056;
            int var4 = field916;
            if (field1038 >= 2 || field1078 != 0 || field1062) {
                int var5 = method2364();
                String var6;
                if (field1078 == 1 && field1038 < 2) {
                    var6 = class226.field3010 + class226.field3020 + field1159 + " " + class89.field1390;
                } else if (field1062 && field1038 < 2) {
                    var6 = field1065 + class226.field3020 + field1020 + " " + class89.field1390;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field1123[var5].length() > 0) {
                        var7 = field1147[var5] + class226.field3020 + field1123[var5];
                    } else {
                        var7 = field1147[var5];
                    }
                    var6 = var7;
                }
                if (field1038 > 2) {
                    var6 = var6 + class89.method596(16777215) + " " + '/' + " " + (field1038 - 2) + class226.field2952;
                }
                Statics.field339.method4352(var6, var3 + 4, var4 + 15, 16777215, 0, field934 / 1000);
            }
        }
        if (field1119 == 3) {
            for (int var8 = 0; var8 < field1007; var8++) {
                if (field939[var8]) {
                    class282.method4514(field1099[var8], field960[var8], field1117[var8], field1118[var8], 16711935, 128);
                } else if (field1113[var8]) {
                    class282.method4514(field1099[var8], field960[var8], field1117[var8], field1118[var8], 16711680, 128);
                }
            }
        }
        int var9 = Statics.field579;
        int var10 = Statics.field1537.field1233;
        int var11 = Statics.field1537.field1265;
        int var12 = field983;
        for (class83 var13 = (class83) class83.field1323.method3318(); var13 != null; var13 = (class83) class83.field1323.method3338()) {
            if (var13.field1319 != -1 || var13.field1326 != null) {
                int var14 = 0;
                if (var10 > var13.field1316) {
                    var14 += var10 - var13.field1316;
                } else if (var10 < var13.field1314) {
                    var14 += var13.field1314 - var10;
                }
                if (var11 > var13.field1320) {
                    var14 += var11 - var13.field1320;
                } else if (var11 < var13.field1315) {
                    var14 += var13.field1315 - var11;
                }
                if (var14 - 64 > var13.field1317 || field1173 == 0 || var13.field1313 != var9) {
                    if (var13.field1325 != null) {
                        Statics.field2512.method1707(var13.field1325);
                        var13.field1325 = null;
                    }
                    if (var13.field1322 != null) {
                        Statics.field2512.method1707(var13.field1322);
                        var13.field1322 = null;
                    }
                } else {
                    var14 -= 64;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = field1173 * (var13.field1317 - var14) / var13.field1317;
                    class106 var10000;
                    if (var13.field1325 != null) {
                        var13.field1325.method1931(var15);
                    } else if (var13.field1319 >= 0) {
                        var10000 = (class106) null;
                        class106 var16 = class106.method1751(Statics.field503, var13.field1319, 0);
                        if (var16 != null) {
                            class108 var17 = var16.method1744().method1793(Statics.field3594);
                            class118 var18 = class118.method1996(var17, 100, var15);
                            var18.method2011(-1);
                            Statics.field2512.method1720(var18);
                            var13.field1325 = var18;
                        }
                    }
                    if (var13.field1322 != null) {
                        var13.field1322.method1931(var15);
                        if (!var13.field1322.method3313()) {
                            var13.field1322 = null;
                        }
                    } else if (var13.field1326 != null && (var13.field1324 -= var12) <= 0) {
                        int var19 = (int) (Math.random() * (double) var13.field1326.length);
                        var10000 = (class106) null;
                        class106 var20 = class106.method1751(Statics.field503, var13.field1326[var19], 0);
                        if (var20 != null) {
                            class108 var21 = var20.method1744().method1793(Statics.field3594);
                            class118 var22 = class118.method1996(var21, 100, var15);
                            var22.method2011(0);
                            Statics.field2512.method1720(var22);
                            var13.field1322 = var22;
                            var13.field1324 = var13.field1321 + (int) (Math.random() * (double) (var13.field1318 - var13.field1321));
                        }
                    }
                }
            }
        }
        field983 = 0;
    }

    @ObfuscatedName("cf.gl(Ljava/lang/String;ZI)V")
    public static final void method1535(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field33.method4342(arg0, 250);
        int var6 = Statics.field33.method4343(arg0, 250) * 13;
        class282.method4582(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class282.method4563(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field33.method4349(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method486(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2328.method718(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field1007; var11++) {
            if (field1117[var11] + field1099[var11] > var7 && field1099[var11] < var7 + var9 && field960[var11] + field1118[var11] > var8 && field960[var11] < var8 + var10) {
                field1113[var11] = true;
            }
        }
    }

    @ObfuscatedName("bw.gf(IIIIB)V")
    public static final void method965(int arg0, int arg1, int arg2, int arg3) {
        field1011++;
        method229(class67.field810);
        boolean var4 = false;
        if (field926 >= 0) {
            int var5 = class97.field1500;
            int[] var6 = class97.field1493;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field926 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method229(class67.field809);
        }
        method1888(true);
        method229(var4 ? class67.field812 : class67.field811);
        method1888(false);
        method2716();
        for (class85 var8 = (class85) field1040.method3318(); var8 != null; var8 = (class85) field1040.method3338()) {
            if (Statics.field579 != var8.field1352 || var8.field1353) {
                var8.method3308();
            } else if (field934 >= var8.field1354) {
                var8.method1501(field983);
                if (var8.field1353) {
                    var8.method3308();
                } else {
                    Statics.field416.method2454(var8.field1352, var8.field1347, var8.field1348, var8.field1349, 60, var8, 0, -1, false);
                }
            }
        }
        method168(arg0, arg1, arg2, arg3, true);
        int var9 = field1167;
        int var10 = field1144;
        int var11 = field1169;
        int var12 = field1142;
        class282.method4507(var9, var10, var9 + var11, var10 + var12);
        class137.method2371();
        if (!field1153) {
            int var13 = field990;
            if (field999 / 256 > var13) {
                var13 = field999 / 256;
            }
            if (field1154[4] && field1156[4] + 128 > var13) {
                var13 = field1156[4] + 128;
            }
            int var14 = field991 + field970 & 0x7FF;
            Statics.method3152(Statics.field660, method1363(Statics.field1537.field1233, Statics.field1537.field1265, Statics.field579) - field996, Statics.field606, var13, var14, var13 * 3 + 600);
        }
        int var27;
        if (field1153) {
            var27 = method472();
        } else {
            int var15;
            if (Statics.field344.field1305) {
                var15 = Statics.field579;
            } else {
                label479: {
                    int var16 = 3;
                    if (Statics.field241 < 310) {
                        int var17 = Statics.field542 >> 7;
                        int var18 = Statics.field234 >> 7;
                        int var19 = Statics.field1537.field1233 >> 7;
                        int var20 = Statics.field1537.field1265 >> 7;
                        if (var17 < 0 || var18 < 0 || var17 >= 104 || var18 >= 104) {
                            var15 = Statics.field579;
                            break label479;
                        }
                        if ((class62.field747[Statics.field579][var17][var18] & 0x4) != 0) {
                            var16 = Statics.field579;
                        }
                        int var21;
                        if (var19 > var17) {
                            var21 = var19 - var17;
                        } else {
                            var21 = var17 - var19;
                        }
                        int var22;
                        if (var20 > var18) {
                            var22 = var20 - var18;
                        } else {
                            var22 = var18 - var20;
                        }
                        if (var21 > var22) {
                            int var23 = var22 * 65536 / var21;
                            int var24 = 32768;
                            while (var17 != var19) {
                                if (var17 < var19) {
                                    var17++;
                                } else if (var17 > var19) {
                                    var17--;
                                }
                                if ((class62.field747[Statics.field579][var17][var18] & 0x4) != 0) {
                                    var16 = Statics.field579;
                                }
                                var24 += var23;
                                if (var24 >= 65536) {
                                    var24 -= 65536;
                                    if (var18 < var20) {
                                        var18++;
                                    } else if (var18 > var20) {
                                        var18--;
                                    }
                                    if ((class62.field747[Statics.field579][var17][var18] & 0x4) != 0) {
                                        var16 = Statics.field579;
                                    }
                                }
                            }
                        } else {
                            int var25 = var21 * 65536 / var22;
                            int var26 = 32768;
                            while (var18 != var20) {
                                if (var18 < var20) {
                                    var18++;
                                } else if (var18 > var20) {
                                    var18--;
                                }
                                if ((class62.field747[Statics.field579][var17][var18] & 0x4) != 0) {
                                    var16 = Statics.field579;
                                }
                                var26 += var25;
                                if (var26 >= 65536) {
                                    var26 -= 65536;
                                    if (var17 < var19) {
                                        var17++;
                                    } else if (var17 > var19) {
                                        var17--;
                                    }
                                    if ((class62.field747[Statics.field579][var17][var18] & 0x4) != 0) {
                                        var16 = Statics.field579;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field1537.field1233 >= 0 && Statics.field1537.field1265 >= 0 && Statics.field1537.field1233 < 13312 && Statics.field1537.field1265 < 13312) {
                        if ((class62.field747[Statics.field579][Statics.field1537.field1233 >> 7][Statics.field1537.field1265 >> 7] & 0x4) != 0) {
                            var16 = Statics.field579;
                        }
                        var15 = var16;
                    } else {
                        var15 = Statics.field579;
                    }
                }
            }
            var27 = var15;
        }
        int var28 = Statics.field542;
        int var29 = Statics.field781;
        int var30 = Statics.field234;
        int var31 = Statics.field241;
        int var32 = Statics.field808;
        for (int var33 = 0; var33 < 5; var33++) {
            if (field1154[var33]) {
                int var34 = (int) (Math.random() * (double) (field1155[var33] * 2 + 1) - (double) field1155[var33] + Math.sin((double) field1157[var33] / 100.0D * (double) field1158[var33]) * (double) field1156[var33]);
                if (var33 == 0) {
                    Statics.field542 += var34;
                }
                if (var33 == 1) {
                    Statics.field781 += var34;
                }
                if (var33 == 2) {
                    Statics.field234 += var34;
                }
                if (var33 == 3) {
                    Statics.field808 = Statics.field808 + var34 & 0x7FF;
                }
                if (var33 == 4) {
                    Statics.field241 += var34;
                    if (Statics.field241 < 128) {
                        Statics.field241 = 128;
                    }
                    if (Statics.field241 > 383) {
                        Statics.field241 = 383;
                    }
                }
            }
        }
        int var35 = class60.field723;
        int var36 = class60.field724 * -90084053;
        if (class60.field729 != 0) {
            var35 = class60.field736;
            var36 = class60.field731;
        }
        if (var35 >= var9 && var35 < var9 + var11 && var36 >= var10 && var36 < var10 + var12) {
            class135.method2707(var35 - var9, var36 - var10);
        } else {
            class135.method855();
        }
        method622();
        class282.method4582(var9, var10, var11, var12, 0);
        method622();
        int var37 = class137.field2027;
        class137.field2027 = field1171;
        Statics.field416.method2484(Statics.field542, Statics.field781, Statics.field234, Statics.field241, Statics.field808, var27);
        class8.method3();
        class137.field2027 = var37;
        method622();
        Statics.field416.method2503();
        field1000 = 0;
        boolean var38 = false;
        int var39 = -1;
        int var40 = class97.field1500;
        int[] var41 = class97.field1493;
        for (int var42 = 0; var42 < field945 + var40; var42++) {
            class79 var43;
            if (var42 < var40) {
                var43 = field1130[var41[var42]];
                if (field926 == var41[var42]) {
                    var38 = true;
                    var39 = var42;
                    continue;
                }
            } else {
                var43 = field1110[field946[var42 - var40]];
            }
            method674(var43, var42, var9, var10, var11, var12);
        }
        if (var38) {
            method674(field1130[field926], var39, var9, var10, var11, var12);
        }
        for (int var44 = 0; var44 < field1000; var44++) {
            int var45 = field1187[var44];
            int var46 = field1003[var44];
            int var47 = field1005[var44];
            int var48 = field1004[var44];
            boolean var49 = true;
            while (var49) {
                var49 = false;
                for (int var50 = 0; var50 < var44; var50++) {
                    if (var46 + 2 > field1003[var50] - field1004[var50] && var46 - var48 < field1003[var50] + 2 && var45 - var47 < field1187[var50] + field1005[var50] && var45 + var47 > field1187[var50] - field1005[var50] && field1003[var50] - field1004[var50] < var46) {
                        var46 = field1003[var50] - field1004[var50];
                        var49 = true;
                    }
                }
            }
            field994 = field1187[var44];
            field1013 = field1003[var44] = var46;
            String var51 = field1009[var44];
            if (field1069 == 0) {
                int var52 = 16776960;
                if (field1006[var44] < 6) {
                    var52 = field1025[field1006[var44]];
                }
                if (field1006[var44] == 6) {
                    var52 = field1011 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field1006[var44] == 7) {
                    var52 = field1011 % 20 < 10 ? 255 : 65535;
                }
                if (field1006[var44] == 8) {
                    var52 = field1011 % 20 < 10 ? 45056 : 8454016;
                }
                if (field1006[var44] == 9) {
                    int var53 = 150 - field1168[var44];
                    if (var53 < 50) {
                        var52 = var53 * 1280 + 16711680;
                    } else if (var53 < 100) {
                        var52 = 16776960 - (var53 - 50) * 327680;
                    } else if (var53 < 150) {
                        var52 = (var53 - 100) * 5 + 65280;
                    }
                }
                if (field1006[var44] == 10) {
                    int var54 = 150 - field1168[var44];
                    if (var54 < 50) {
                        var52 = var54 * 5 + 16711680;
                    } else if (var54 < 100) {
                        var52 = 16711935 - (var54 - 50) * 327680;
                    } else if (var54 < 150) {
                        var52 = (var54 - 100) * 327680 + 255 - (var54 - 100) * 5;
                    }
                }
                if (field1006[var44] == 11) {
                    int var55 = 150 - field1168[var44];
                    if (var55 < 50) {
                        var52 = 16777215 - var55 * 327685;
                    } else if (var55 < 100) {
                        var52 = (var55 - 50) * 327685 + 65280;
                    } else if (var55 < 150) {
                        var52 = 16777215 - (var55 - 100) * 327680;
                    }
                }
                if (field1164[var44] == 0) {
                    Statics.field339.method4396(var51, field994 + var9, field1013 + var10, var52, 0);
                }
                if (field1164[var44] == 1) {
                    Statics.field339.method4386(var51, field994 + var9, field1013 + var10, var52, 0, field1011);
                }
                if (field1164[var44] == 2) {
                    Statics.field339.method4391(var51, field994 + var9, field1013 + var10, var52, 0, field1011);
                }
                if (field1164[var44] == 3) {
                    Statics.field339.method4399(var51, field994 + var9, field1013 + var10, var52, 0, field1011, 150 - field1168[var44]);
                }
                if (field1164[var44] == 4) {
                    int var56 = (150 - field1168[var44]) * (Statics.field339.method4383(var51) + 100) / 150;
                    class282.method4508(field994 + var9 - 50, var10, field994 + var9 + 50, var10 + var12);
                    Statics.field339.method4387(var51, field994 + var9 + 50 - var56, field1013 + var10, var52, 0);
                    class282.method4507(var9, var10, var9 + var11, var10 + var12);
                }
                if (field1164[var44] == 5) {
                    int var57 = 150 - field1168[var44];
                    int var58 = 0;
                    if (var57 < 25) {
                        var58 = var57 - 25;
                    } else if (var57 > 125) {
                        var58 = var57 - 125;
                    }
                    class282.method4508(var9, field1013 + var10 - Statics.field339.field3638 - 1, var9 + var11, field1013 + var10 + 5);
                    Statics.field339.method4396(var51, field994 + var9, field1013 + var10 + var58, var52, 0);
                    class282.method4507(var9, var10, var9 + var11, var10 + var12);
                }
            } else {
                Statics.field339.method4396(var51, field994 + var9, field1013 + var10, 16776960, 0);
            }
        }
        method70(var9, var10);
        ((class126) Statics.field2031).method2146(field983);
        if (field1017 == 1) {
            Statics.field1360[field1016 / 100].method4683(field1014 - 8, field1072 - 8);
        }
        if (field1017 == 2) {
            Statics.field1360[field1016 / 100 + 4].method4683(field1014 - 8, field1072 - 8);
        }
        field1026 = 0;
        int var59 = (Statics.field1537.field1233 >> 7) + Statics.field2316;
        int var60 = (Statics.field1537.field1265 >> 7) + Statics.field265;
        if (var59 >= 3053 && var59 <= 3156 && var60 >= 3056 && var60 <= 3136) {
            field1026 = 1;
        }
        if (var59 >= 3072 && var59 <= 3118 && var60 >= 9492 && var60 <= 9535) {
            field1026 = 1;
        }
        if (field1026 == 1 && var59 >= 3139 && var59 <= 3199 && var60 >= 3008 && var60 <= 3062) {
            field1026 = 0;
        }
        Statics.field542 = var28;
        Statics.field781 = var29;
        Statics.field234 = var30;
        Statics.field241 = var31;
        Statics.field808 = var32;
        if (field988 && class239.method627(true, false) == 0) {
            field988 = false;
        }
        if (field988) {
            class282.method4582(var9, var10, var11, var12, 0);
            method1535(class226.field2989, false);
        }
    }

    @ObfuscatedName("y.go(IIIIZI)V")
    public static final void method168(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1160 - field1008) * var5 / 100 + field1008;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1165) {
            short var8 = field1165;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1128) {
                var6 = field1128;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class282.method4537();
                    class282.method4582(arg0, arg1, var10, arg3, -16777216);
                    class282.method4582(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1166) {
            short var11 = field1166;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1163) {
                var6 = field1163;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class282.method4537();
                    class282.method4582(arg0, arg1, arg2, var13, -16777216);
                    class282.method4582(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1162 - field1161) * var5 / 100 + field1161;
        field1171 = arg3 * var6 * var14 / 85504 << 1;
        if (field1169 != arg2 || field1142 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field2009[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2516(var15, 500, 800, arg2, arg3);
        }
        field1167 = arg0;
        field1144 = arg1;
        field1169 = arg2;
        field1142 = arg3;
    }

    @ObfuscatedName("ak.gc(Lbt;I)V")
    public static final void method229(class67 arg0) {
        if (Statics.field1537.field1233 >> 7 == field1115 && Statics.field1537.field1265 >> 7 == field1140) {
            field1115 = 0;
        }
        int var1 = class97.field1500;
        int[] var2 = class97.field1493;
        int var3 = var1;
        if (class67.field810 == arg0 || class67.field809 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field810 == arg0) {
                var5 = Statics.field1537;
                var6 = Statics.field1537.field871 << 14;
            } else if (class67.field809 == arg0) {
                var5 = field1130[field926];
                var6 = field926 << 14;
            } else {
                var5 = field1130[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field812 == arg0 && field926 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1001() && !var5.field889) {
                var5.field870 = false;
                if ((field912 && var1 > 50 || var1 > 200) && class67.field810 != arg0 && var5.field1271 == var5.field1244) {
                    var5.field870 = true;
                }
                int var7 = var5.field1233 >> 7;
                int var8 = var5.field1265 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field891 == null || field934 < var5.field879 || field934 >= var5.field885) {
                        if ((var5.field1233 & 0x7F) == 64 && (var5.field1265 & 0x7F) == 64) {
                            if (field1011 == field1010[var7][var8]) {
                                continue;
                            }
                            field1010[var7][var8] = field1011;
                        }
                        var5.field887 = method1363(var5.field1233, var5.field1265, Statics.field579);
                        Statics.field416.method2454(Statics.field579, var5.field1233, var5.field1265, var5.field887, 60, var5, var5.field1241, var6, var5.field1218);
                    } else {
                        var5.field870 = false;
                        var5.field887 = method1363(var5.field1233, var5.field1265, Statics.field579);
                        Statics.field416.method2455(Statics.field579, var5.field1233, var5.field1265, var5.field887, 60, var5, var5.field1241, var6, var5.field883, var5.field884, var5.field868, var5.field886);
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.gd(ZI)V")
    public static final void method1888(boolean arg0) {
        for (int var1 = 0; var1 < field945; var1++) {
            class87 var2 = field1110[field946[var1]];
            int var3 = (field946[var1] << 14) + 536870912;
            if (var2 != null && var2.method1001() && var2.field1368.field3582 == arg0 && var2.field1368.method4247()) {
                int var4 = var2.field1233 >> 7;
                int var5 = var2.field1265 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1219 == 1 && (var2.field1233 & 0x7F) == 64 && (var2.field1265 & 0x7F) == 64) {
                        if (field1011 == field1010[var4][var5]) {
                            continue;
                        }
                        field1010[var4][var5] = field1011;
                    }
                    if (!var2.field1368.field3585) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field416.method2454(Statics.field579, var2.field1233, var2.field1265, method1363(var2.field1233 + (var2.field1219 * 64 - 64), var2.field1265 + (var2.field1219 * 64 - 64), Statics.field579), var2.field1219 * 64 - 64 + 60, var2, var2.field1241, var3, var2.field1218);
                }
            }
        }
    }

    @ObfuscatedName("fu.gi(I)V")
    public static final void method2716() {
        for (class94 var0 = (class94) field1174.method3318(); var0 != null; var0 = (class94) field1174.method3338()) {
            if (Statics.field579 != var0.field1451 || field934 > var0.field1457) {
                var0.method3308();
            } else if (field934 >= var0.field1456) {
                if (var0.field1460 > 0) {
                    class87 var1 = field1110[var0.field1460 - 1];
                    if (var1 != null && var1.field1233 >= 0 && var1.field1233 < 13312 && var1.field1265 >= 0 && var1.field1265 < 13312) {
                        var0.method1581(var1.field1233, var1.field1265, method1363(var1.field1233, var1.field1265, var0.field1451) - var0.field1455, field934);
                    }
                }
                if (var0.field1460 < 0) {
                    int var2 = -var0.field1460 - 1;
                    class75 var3;
                    if (field1028 == var2) {
                        var3 = Statics.field1537;
                    } else {
                        var3 = field1130[var2];
                    }
                    if (var3 != null && var3.field1233 >= 0 && var3.field1233 < 13312 && var3.field1265 >= 0 && var3.field1265 < 13312) {
                        var0.method1581(var3.field1233, var3.field1265, method1363(var3.field1233, var3.field1265, var0.field1451) - var0.field1455, field934);
                    }
                }
                var0.method1582(field983);
                Statics.field416.method2454(Statics.field579, (int) var0.field1462, (int) var0.field1463, (int) var0.field1464, 60, var0, var0.field1467, -1, false);
            }
        }
    }

    @ObfuscatedName("ax.ge(I)I")
    public static final int method472() {
        if (Statics.field344.field1305) {
            return Statics.field579;
        } else {
            int var0 = method1363(Statics.field542, Statics.field234, Statics.field579);
            return var0 - Statics.field781 >= 800 || (class62.field747[Statics.field579][Statics.field542 >> 7][Statics.field234 >> 7] & 0x4) == 0 ? 3 : Statics.field579;
        }
    }

    @ObfuscatedName("k.gt(III)V")
    public static final void method70(int arg0, int arg1) {
        if (field1121 == 2) {
            method633((field927 - Statics.field2316 << 7) + field930, (field908 - Statics.field265 << 7) + field931, field929 * 2);
            if (field994 > -1 && field934 % 20 < 10) {
                Statics.field349[0].method4683(field994 + arg0 - 12, field1013 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bi.gn(Lca;IIIIII)V")
    public static final void method674(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1001()) {
            return;
        }
        if (arg0 instanceof class87) {
            class259 var6 = ((class87) arg0).field1368;
            if (var6.field3567 != null) {
                var6 = var6.method4241();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1500;
        int[] var8 = class97.field1493;
        int var9 = 3;
        if (!arg0.field1220.method3299()) {
            method624(arg0, arg0.field1236 + 15);
            for (class86 var10 = (class86) arg0.field1220.method3282(); var10 != null; var10 = (class86) arg0.field1220.method3284()) {
                class80 var11 = var10.method1505(field934);
                if (var11 != null) {
                    class249 var12 = var10.field1359;
                    class286 var13 = var12.method4022();
                    class286 var14 = var12.method4013();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3376;
                    } else {
                        if (var12.field3377 * 2 < var14.field3782) {
                            var15 = var12.field3377;
                        }
                        var16 = var14.field3782 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field934 - var11.field1283;
                    int var20 = var11.field1278 * var16 / var12.field3376;
                    int var23;
                    if (var11.field1276 > var19) {
                        int var21 = var12.field3364 == 0 ? 0 : var19 / var12.field3364 * var12.field3364;
                        int var22 = var11.field1277 * var16 / var12.field3376;
                        var23 = (var20 - var22) * var21 / var11.field1276 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1276 + var12.field3373 - var19;
                        if (var12.field3366 >= 0) {
                            var17 = (var24 << 8) / (var12.field3373 - var12.field3366);
                        }
                    }
                    if (var11.field1278 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field994 + arg2 - (var16 >> 1);
                    int var26 = field1013 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field994 > -1) {
                            class282.method4582(var25, var26, var23, 5, 65280);
                            class282.method4582(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3783;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4640(var27, var26, var17);
                            class282.method4508(var27, var26, var27 + var28, var26 + var29);
                            var14.method4640(var27, var26, var17);
                        } else {
                            var13.method4683(var27, var26);
                            class282.method4508(var27, var26, var27 + var28, var26 + var29);
                            var14.method4683(var27, var26);
                        }
                        class282.method4507(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1514()) {
                    var10.method3308();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field889) {
                return;
            }
            if (var30.field877 != -1 || var30.field897 != -1) {
                method624(arg0, arg0.field1236 + 15);
                if (field994 > -1) {
                    if (var30.field877 != -1) {
                        Statics.field556[var30.field877].method4683(field994 + arg2 - 12, field1013 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field897 != -1) {
                        Statics.field780[var30.field897].method4683(field994 + arg2 - 12, field1013 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field1121 == 10 && field928 == var8[arg1]) {
                method624(arg0, arg0.field1236 + 15);
                if (field994 > -1) {
                    Statics.field349[1].method4683(field994 + arg2 - 12, field1013 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class87) arg0).field1368;
            if (var31.field3567 != null) {
                var31 = var31.method4241();
            }
            if (var31.field3580 >= 0 && var31.field3580 < Statics.field780.length) {
                method624(arg0, arg0.field1236 + 15);
                if (field994 > -1) {
                    Statics.field780[var31.field3580].method4683(field994 + arg2 - 12, field1013 + arg3 - 30);
                }
            }
            if (field1121 == 1 && field925 == field946[arg1 - var7] && field934 % 20 < 10) {
                method624(arg0, arg0.field1236 + 15);
                if (field994 > -1) {
                    Statics.field349[0].method4683(field994 + arg2 - 12, field1013 + arg3 - 28);
                }
            }
        }
        if (arg0.field1228 != null && (arg1 >= var7 || !arg0.field1230 && (field1061 == 4 || !arg0.field1229 && (field1061 == 0 || field1061 == 3 || field1061 == 1 && method189(((class75) arg0).field878, false))))) {
            method624(arg0, arg0.field1236);
            if (field994 > -1 && field1000 < field1189) {
                field1005[field1000] = Statics.field339.method4383(arg0.field1228) / 2;
                field1004[field1000] = Statics.field339.field3638;
                field1187[field1000] = field994;
                field1003[field1000] = field1013;
                field1006[field1000] = arg0.field1232;
                field1164[field1000] = arg0.field1242;
                field1168[field1000] = arg0.field1231;
                field1009[field1000] = arg0.field1228;
                field1000++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1237[var32];
            int var34 = arg0.field1235[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field934) {
                    continue;
                }
                var35 = class255.method147(arg0.field1235[var32]);
                var36 = var35.field3419;
                if (var35 != null && var35.field3430 != null) {
                    var35 = var35.method4102();
                    if (var35 == null) {
                        arg0.field1237[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1238[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method147(var37);
                if (var38 != null && var38.field3430 != null) {
                    var38 = var38.method4102();
                }
            }
            if (var33 - var36 <= field934) {
                if (var35 == null) {
                    arg0.field1237[var32] = -1;
                } else {
                    method624(arg0, arg0.field1236 / 2);
                    if (field994 > -1) {
                        if (var32 == 1) {
                            field1013 -= 20;
                        }
                        if (var32 == 2) {
                            field994 -= 15;
                            field1013 -= 10;
                        }
                        if (var32 == 3) {
                            field994 += 15;
                            field1013 -= 10;
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
                        class286 var64 = var35.method4128();
                        if (var64 != null) {
                            var43 = var64.field3782;
                            int var65 = var64.field3783;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3787;
                        }
                        class286 var66 = var35.method4103();
                        if (var66 != null) {
                            var44 = var66.field3782;
                            int var67 = var66.field3783;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3787;
                        }
                        class286 var68 = var35.method4132();
                        if (var68 != null) {
                            var45 = var68.field3782;
                            int var69 = var68.field3783;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3787;
                        }
                        class286 var70 = var35.method4107();
                        if (var70 != null) {
                            var46 = var70.field3782;
                            int var71 = var70.field3783;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3787;
                        }
                        if (var38 != null) {
                            var51 = var38.method4128();
                            if (var51 != null) {
                                var55 = var51.field3782;
                                int var72 = var51.field3783;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3787;
                            }
                            var52 = var38.method4103();
                            if (var52 != null) {
                                var56 = var52.field3782;
                                int var73 = var52.field3783;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3787;
                            }
                            var53 = var38.method4132();
                            if (var53 != null) {
                                var57 = var53.field3782;
                                int var74 = var53.field3783;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3787;
                            }
                            var54 = var38.method4107();
                            if (var54 != null) {
                                var58 = var54.field3782;
                                int var75 = var54.field3783;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3787;
                            }
                        }
                        class264 var76 = var35.method4105();
                        if (var76 == null) {
                            var76 = Statics.field2848;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field2848;
                        } else {
                            var77 = var38.method4105();
                            if (var77 == null) {
                                var77 = Statics.field2848;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4131(arg0.field1216[var32]);
                        int var83 = var76.method4383(var82);
                        if (var38 != null) {
                            var79 = var38.method4131(arg0.field1239[var32]);
                            var81 = var77.method4383(var79);
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
                        int var100 = arg0.field1237[var32] - field934;
                        int var101 = var35.field3418 - var35.field3418 * var100 / var35.field3419;
                        int var102 = var35.field3425 * var100 / var35.field3419 + -var35.field3425;
                        int var103 = field994 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1013 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3433 + var104 + 15;
                        int var108 = var107 - var76.field3652;
                        int var109 = var76.field3644 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3433 + var104 + 15;
                            int var111 = var110 - var77.field3652;
                            int var112 = var77.field3644 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3426 >= 0) {
                            var115 = (var100 << 8) / (var35.field3419 - var35.field3426);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4640(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4640(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4640(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4640(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4346(var82, var90 + var103, var107, var35.field3420, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4640(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4640(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4640(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4640(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4346(var79, var98 + var103, var110, var38.field3420, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4683(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4683(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4683(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4683(var93 + var103 - var50, var104);
                            }
                            var76.method4387(var82, var90 + var103, var107, var35.field3420 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4683(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4683(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4683(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4683(var97 + var103 - var62, var104);
                                }
                                var77.method4387(var79, var98 + var103, var110, var38.field3420 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.gm(Lca;II)V")
    public static final void method624(class79 arg0, int arg1) {
        method633(arg0.field1233, arg0.field1265, arg1);
    }

    @ObfuscatedName("ay.gp(IIII)V")
    public static final void method633(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field994 = -1;
            field1013 = -1;
            return;
        }
        int var3 = method1363(arg0, arg1, Statics.field579) - arg2;
        int var4 = arg0 - Statics.field542;
        int var5 = var3 - Statics.field781;
        int var6 = arg1 - Statics.field234;
        int var7 = class137.field2009[Statics.field241];
        int var8 = class137.field2035[Statics.field241];
        int var9 = class137.field2009[Statics.field808];
        int var10 = class137.field2035[Statics.field808];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field994 = field1171 * var11 / var15 + field1169 / 2;
            field1013 = field1171 * var14 / var15 + field1142 / 2;
        } else {
            field994 = -1;
            field1013 = -1;
        }
    }

    @ObfuscatedName("ca.gr(IIII)I")
    public static final int method1363(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field747[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field756[var5][var3][var4] + class62.field756[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field756[var5][var3][var4 + 1] + class62.field756[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("e.gs(ZB)V")
    public static final void method16(boolean arg0) {
        field968 = arg0;
        if (!field968) {
            int var1 = field951.method2873();
            int var2 = field951.method2907();
            int var3 = field951.method2873();
            Statics.field866 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field866[var4][var5] = field951.method2876();
                }
            }
            Statics.field650 = new int[var3];
            Statics.field260 = new int[var3];
            Statics.field1367 = new int[var3];
            Statics.field526 = new byte[var3][];
            Statics.field366 = new byte[var3][];
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
                        Statics.field650[var7] = var10;
                        Statics.field260[var7] = Statics.field287.method3777("m" + var8 + "_" + var9);
                        Statics.field1367[var7] = Statics.field287.method3777("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method1631(var1, var2, true);
            return;
        }
        int var11 = field951.method3017();
        boolean var12 = field951.method2982() == 1;
        int var13 = field951.method3017();
        int var14 = field951.method2873();
        field951.method3115();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field951.method3122(1);
                    if (var18 == 1) {
                        field1120[var15][var16][var17] = field951.method3122(26);
                    } else {
                        field1120[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field951.method3114();
        Statics.field866 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field866[var19][var20] = field951.method2876();
            }
        }
        Statics.field650 = new int[var14];
        Statics.field260 = new int[var14];
        Statics.field1367 = new int[var14];
        Statics.field526 = new byte[var14][];
        Statics.field366 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field1120[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field650[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field650[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field260[var21] = Statics.field287.method3777("m" + var30 + "_" + var31);
                            Statics.field1367[var21] = Statics.field287.method3777("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method1631(var11, var13, !var12);
    }

    @ObfuscatedName("cw.gx(IIZB)V")
    public static final void method1631(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field495 == arg0 && Statics.field436 == arg1) {
            return;
        }
        Statics.field495 = arg0;
        Statics.field436 = arg1;
        method471(25);
        method1535(class226.field2989, true);
        int var3 = Statics.field2316;
        int var4 = Statics.field265;
        Statics.field2316 = (arg0 - 6) * 8;
        Statics.field265 = (arg1 - 6) * 8;
        int var5 = Statics.field2316 - var3;
        int var6 = Statics.field265 - var4;
        int var7 = Statics.field2316;
        int var8 = Statics.field265;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field1110[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1270[var11] -= var5;
                    var10.field1255[var11] -= var6;
                }
                var10.field1233 -= var5 * 128;
                var10.field1265 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1130[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1270[var14] -= var5;
                    var13.field1255[var14] -= var6;
                }
                var13.field1233 -= var5 * 128;
                var13.field1265 -= var6 * 128;
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
                        field1037[var25][var21][var22] = field1037[var25][var23][var24];
                    } else {
                        field1037[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1108.method3318(); var26 != null; var26 = (class77) field1108.method3338()) {
            var26.field1197 -= var5;
            var26.field1193 -= var6;
            if (var26.field1197 < 0 || var26.field1193 < 0 || var26.field1197 >= 104 || var26.field1193 >= 104) {
                var26.method3308();
            }
        }
        if (field1115 != 0) {
            field1115 -= var5;
            field1140 -= var6;
        }
        field1081 = 0;
        field1153 = false;
        field1134 = -1;
        field1040.method3319();
        field1174.method3319();
        for (int var27 = 0; var27 < 4; var27++) {
            field967[var27].method2757();
        }
    }

    @ObfuscatedName("ew.gz(ZI)V")
    public static final void method2367(boolean arg0) {
        method622();
        field1149++;
        if (field1149 < 50 && !arg0) {
            return;
        }
        field1149 = 0;
        if (field969 || Statics.field2151 == null) {
            return;
        }
        field949.method3136(102);
        try {
            Statics.field2151.method2733(field949.field2391, 0, field949.field2394);
            field949.field2394 = 0;
        } catch (IOException var2) {
            field969 = true;
        }
    }

    @ObfuscatedName("bk.gv(II)V")
    public static final void method961(int arg0) {
        int[] var1 = Statics.field2834.field3792;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field747[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field416.method2590(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field747[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field416.method2590(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2834.method4625();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field747[arg0][var10][var9] & 0x18) == 0) {
                    Statics.method50(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field747[arg0 + 1][var10][var9] & 0x8) != 0) {
                    Statics.method50(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1135 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field416.method2524(Statics.field579, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class256.method3652(var14).field3463;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field967[Statics.field579].field2295;
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
                        field1036[field1135] = Statics.field663[var15].method3920(false);
                        field1136[field1135] = var16;
                        field1137[field1135] = var17;
                        field1135++;
                    }
                }
            }
        }
        Statics.field2328.method4594();
    }

    @ObfuscatedName("client.ga(B)Z")
    public final boolean method1035() {
        if (Statics.field2151 == null) {
            return false;
        }
        try {
            int var1 = Statics.field2151.method2721();
            if (var1 == 0) {
                return false;
            }
            if (field953 == -1) {
                Statics.field2151.method2731(field951.field2391, 0, 1);
                field951.field2394 = 0;
                field953 = field951.method3112();
                field1048 = class273.field3704[field953];
                var1--;
            }
            if (field1048 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field2151.method2731(field951.field2391, 0, 1);
                field1048 = field951.field2391[0] & 0xFF;
                var1--;
            }
            if (field1048 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field2151.method2731(field951.field2391, 0, 2);
                field951.field2394 = 0;
                field1048 = field951.method2873();
                var1 -= 2;
            }
            if (var1 < field1048) {
                return false;
            }
            field951.field2394 = 0;
            Statics.field2151.method2731(field951.field2391, 0, field1048);
            field1091 = 0;
            field958 = field957;
            field957 = field956;
            field956 = field953;
            if (field953 == 216) {
                int var2 = field951.method2871();
                if (field951.method2871() == 0) {
                    field1181[var2] = new class17();
                    field951.field2394 += 18;
                } else {
                    field951.field2394--;
                    field1181[var2] = new class17(field951, false);
                }
                field1102 = field1046;
                field953 = -1;
                return true;
            }
            if (field953 == 100) {
                int var3 = field951.method2871();
                int var4 = field951.method2871();
                int var5 = field951.method2871();
                int var6 = field951.method2871();
                field1154[var3] = true;
                field1155[var3] = var4;
                field1156[var3] = var5;
                field1157[var3] = var6;
                field1158[var3] = 0;
                field953 = -1;
                return true;
            }
            if (field953 == 6) {
                int var7 = field951.method2876();
                class69 var8 = (class69) field1068.method3264((long) var7);
                if (var8 != null) {
                    method2657(var8, true);
                }
                if (field1071 != null) {
                    method632(field1071);
                    field1071 = null;
                }
                field953 = -1;
                return true;
            }
            if (field953 == 81) {
                int var9 = field951.method2884();
                boolean var10 = field951.method2871() == 1;
                String var11 = "";
                boolean var12 = false;
                if (var10) {
                    var11 = field951.method2879();
                    if (method2655(var11)) {
                        var12 = true;
                    }
                }
                String var13 = field951.method2879();
                if (!var12) {
                    class99.method973(var9, var11, var13);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 200) {
                int var14 = field951.method2917();
                int var15 = field951.method2912();
                class217 var16 = class217.method921(var14);
                if (var16.field2778 != var15 || var15 == -1) {
                    var16.field2778 = var15;
                    var16.field2773 = 0;
                    var16.field2777 = 0;
                    method632(var16);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 136) {
                method34();
                field1073 = field951.method2906();
                field1104 = field1046;
                field953 = -1;
                return true;
            }
            if (field953 == 71) {
                int var17 = field951.method2907();
                int var18 = field951.method3017();
                int var19 = field951.method3017();
                int var20 = field951.method2993();
                class217 var21 = class217.method921(var20);
                if (var21.field2705 != var18 || var21.field2706 != var19 || var21.field2708 != var17) {
                    var21.field2705 = var18;
                    var21.field2706 = var19;
                    var21.field2708 = var17;
                    method632(var21);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 161) {
                int var22 = field951.method2996();
                int var23 = field951.method2907();
                class217 var24 = class217.method921(var22);
                if (var24.field2697 != 2 || var24.field2698 != var23) {
                    var24.field2697 = 2;
                    var24.field2698 = var23;
                    method632(var24);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 226) {
                method34();
                int var25 = field951.method2917();
                int var26 = field951.method2899();
                int var27 = field951.method2899();
                field1043[var27] = var25;
                field1041[var27] = var26;
                field1042[var27] = 1;
                for (int var28 = 0; var28 < 98; var28++) {
                    if (var25 >= class223.field2840[var28]) {
                        field1042[var27] = var28 + 2;
                    }
                }
                field1097[++field1098 - 1 & 0x1F] = var27;
                field953 = -1;
                return true;
            }
            if (field953 == 153) {
                while (field951.field2394 < field1048) {
                    boolean var29 = field951.method2871() == 1;
                    String var30 = field951.method2879();
                    String var31 = field951.method2879();
                    int var32 = field951.method2873();
                    int var33 = field951.method2871();
                    int var34 = field951.method2871();
                    boolean var35 = (var34 & 0x2) != 0;
                    boolean var36 = (var34 & 0x1) != 0;
                    if (var32 > 0) {
                        field951.method2879();
                        field951.method2871();
                        field951.method2876();
                    }
                    field951.method2879();
                    for (int var37 = 0; var37 < field1172; var37++) {
                        class66 var38 = field1089[var37];
                        if (var29) {
                            if (var31.equals(var38.field805)) {
                                var38.field805 = var30;
                                var38.field801 = var31;
                                var30 = null;
                                break;
                            }
                        } else if (var30.equals(var38.field805)) {
                            if (var38.field803 != var32) {
                                boolean var39 = true;
                                for (class68 var40 = (class68) field1180.method3360(); var40 != null; var40 = (class68) field1180.method3353()) {
                                    if (var40.field818.equals(var30)) {
                                        if (var32 != 0 && var40.field819 == 0) {
                                            var40.method3363();
                                            var39 = false;
                                        } else if (var32 == 0 && var40.field819 != 0) {
                                            var40.method3363();
                                            var39 = false;
                                        }
                                    }
                                }
                                if (var39) {
                                    field1180.method3351(new class68(var30, var32));
                                }
                                var38.field803 = var32;
                            }
                            var38.field801 = var31;
                            var38.field804 = var33;
                            var38.field806 = var35;
                            var38.field802 = var36;
                            var30 = null;
                            break;
                        }
                    }
                    if (var30 != null && field1172 < 400) {
                        class66 var41 = new class66();
                        field1089[field1172] = var41;
                        var41.field805 = var30;
                        var41.field801 = var31;
                        var41.field803 = var32;
                        var41.field804 = var33;
                        var41.field806 = var35;
                        var41.field802 = var36;
                        field1172++;
                    }
                }
                field1057 = 2;
                field1100 = field1046;
                boolean var42 = false;
                int var43 = field1172;
                while (var43 > 0) {
                    boolean var44 = true;
                    var43--;
                    for (int var45 = 0; var45 < var43; var45++) {
                        boolean var46 = false;
                        class66 var47 = field1089[var45];
                        class66 var48 = field1089[var45 + 1];
                        if (field1012 != var47.field803 && field1012 == var48.field803) {
                            var46 = true;
                        }
                        if (!var46 && var47.field803 == 0 && var48.field803 != 0) {
                            var46 = true;
                        }
                        if (!var46 && !var47.field806 && var48.field806) {
                            var46 = true;
                        }
                        if (!var46 && !var47.field802 && var48.field802) {
                            var46 = true;
                        }
                        if (var46) {
                            class66 var49 = field1089[var45];
                            field1089[var45] = field1089[var45 + 1];
                            field1089[var45 + 1] = var49;
                            var44 = false;
                        }
                    }
                    if (var44) {
                        break;
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 19) {
                int var50 = field951.method2873();
                int var51 = field951.method2871();
                int var52 = field951.method2873();
                if (field1060 != 0 && var51 != 0 && field1081 < 50) {
                    field1148[field1081] = var50;
                    field966[field1081] = var51;
                    field1150[field1081] = var52;
                    field1152[field1081] = null;
                    field1015[field1081] = 0;
                    field1081++;
                }
                field953 = -1;
                return true;
            }
            if (field953 == 217) {
                int var56 = field951.method2876();
                int var57 = field951.method2873();
                class212.field2608[var57] = var56;
                if (class212.field2613[var57] != var56) {
                    class212.field2613[var57] = var56;
                }
                method9(var57);
                field1093[++field1094 - 1 & 0x1F] = var57;
                field953 = -1;
                return true;
            }
            if (field953 == 137) {
                class281.method2787(field951, field1048);
                field953 = -1;
                return true;
            }
            if (field953 == 232) {
                field951.field2394 += 28;
                if (field951.method2894()) {
                    class180 var58 = field951;
                    int var59 = field951.field2394 - 28;
                    byte[] var60 = var58.field2391;
                    if (field943 == null) {
                        field943 = new byte[24];
                    }
                    class184.method3153(var60, var59, field943, 0, 24);
                    if (class156.field2240 != null) {
                        try {
                            class156.field2240.method2107(0L);
                            class156.field2240.method2111(var58.field2391, var59, 24);
                        } catch (Exception var323) {
                        }
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 70) {
                class97.field1500 = 0;
                for (int var62 = 0; var62 < 2048; var62++) {
                    class97.field1491[var62] = null;
                    class97.field1488[var62] = 1;
                }
                for (int var63 = 0; var63 < 2048; var63++) {
                    field1130[var63] = null;
                }
                class97.method1542(field951);
                field953 = -1;
                return true;
            }
            if (field953 == 41) {
                String var64 = field951.method2879();
                long var65 = (long) field951.method2873();
                long var67 = (long) field951.method2875();
                class231[] var69 = new class231[] { class231.field3177, class231.field3176, class231.field3175, class231.field3181, class231.field3178, class231.field3180 };
                class231 var70 = (class231) class169.method1334(var69, field951.method2871());
                long var71 = (var65 << 32) + var67;
                boolean var73 = false;
                for (int var74 = 0; var74 < 100; var74++) {
                    if (field1126[var74] == var71) {
                        var73 = true;
                        break;
                    }
                }
                if (method2655(var64)) {
                    var73 = true;
                }
                if (!var73 && field1026 == 0) {
                    field1126[field1127] = var71;
                    field1127 = (field1127 + 1) % 100;
                    class180 var75 = field951;
                    String var79;
                    try {
                        int var76 = var75.method2884();
                        if (var76 > 32767) {
                            var76 = 32767;
                        }
                        byte[] var77 = new byte[var76];
                        var75.field2394 += Statics.field3658.method2799(var75.field2391, var75.field2394, var77, 0, var76);
                        String var78 = class267.method36(var77, 0, var76);
                        var79 = var78;
                    } catch (Exception var322) {
                        var79 = "Cabbage";
                    }
                    String var82 = class265.method4344(class271.method109(var79));
                    byte var83;
                    if (var70.field3182) {
                        var83 = 7;
                    } else {
                        var83 = 3;
                    }
                    if (var70.field3179 == -1) {
                        class99.method973(var83, var64, var82);
                    } else {
                        class99.method973(var83, class89.method1373(var70.field3179) + var64, var82);
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 190) {
                field1153 = true;
                Statics.field2435 = field951.method2871();
                Statics.field1355 = field951.method2871();
                Statics.field30 = field951.method2873();
                Statics.field2256 = field951.method2871();
                Statics.field499 = field951.method2871();
                if (Statics.field499 >= 100) {
                    int var84 = Statics.field2435 * 128 + 64;
                    int var85 = Statics.field1355 * 128 + 64;
                    int var86 = method1363(var84, var85, Statics.field579) - Statics.field30;
                    int var87 = var84 - Statics.field542;
                    int var88 = var86 - Statics.field781;
                    int var89 = var85 - Statics.field234;
                    int var90 = (int) Math.sqrt((double) (var87 * var87 + var89 * var89));
                    Statics.field241 = (int) (Math.atan2((double) var88, (double) var90) * 325.949D) & 0x7FF;
                    Statics.field808 = (int) (Math.atan2((double) var87, (double) var89) * -325.949D) & 0x7FF;
                    if (Statics.field241 < 128) {
                        Statics.field241 = 128;
                    }
                    if (Statics.field241 > 383) {
                        Statics.field241 = 383;
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 120) {
                Statics.field3391 = field951.method2982();
                Statics.field515 = field951.method2982();
                for (int var91 = Statics.field515; var91 < Statics.field515 + 8; var91++) {
                    for (int var92 = Statics.field3391; var92 < Statics.field3391 + 8; var92++) {
                        if (field1037[Statics.field579][var91][var92] != null) {
                            field1037[Statics.field579][var91][var92] = null;
                            method626(var91, var92);
                        }
                    }
                }
                for (class77 var93 = (class77) field1108.method3318(); var93 != null; var93 = (class77) field1108.method3338()) {
                    if (var93.field1197 >= Statics.field515 && var93.field1197 < Statics.field515 + 8 && var93.field1193 >= Statics.field3391 && var93.field1193 < Statics.field3391 + 8 && Statics.field579 == var93.field1195) {
                        var93.field1201 = 0;
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 212) {
                int var94 = field951.method2909();
                class64 var95 = (class64) class64.field786.method3264((long) var94);
                if (var95 != null) {
                    var95.method3308();
                }
                field1095[++field1096 - 1 & 0x1F] = var94 & 0x7FFF;
                field953 = -1;
                return true;
            }
            if (field953 == 60) {
                method16(false);
                field951.method3112();
                int var96 = field951.method2873();
                class97.method2254(field951, var96);
                field953 = -1;
                return true;
            }
            if (field953 == 126) {
                int var97 = field951.method2876();
                int var98 = field951.method2876();
                if (Statics.field895 == null || !Statics.field895.isValid()) {
                    try {
                        Iterator var99 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var99.hasNext()) {
                            GarbageCollectorMXBean var100 = (GarbageCollectorMXBean) var99.next();
                            if (var100.isValid()) {
                                Statics.field895 = var100;
                                field1054 = -1L;
                                field1183 = -1L;
                            }
                        }
                    } catch (Throwable var324) {
                    }
                }
                long var102 = class176.method584();
                int var104 = -1;
                if (Statics.field895 != null) {
                    long var105 = Statics.field895.getCollectionTime();
                    if (field1183 != -1L) {
                        long var107 = var105 - field1183;
                        long var109 = var102 - field1054;
                        if (var109 != 0L) {
                            var104 = (int) (var107 * 100L / var109);
                        }
                    }
                    field1183 = var105;
                    field1054 = var102;
                }
                field949.method3136(234);
                field949.method2897(field689);
                field949.method2860(var104);
                field949.method3024(var97);
                field949.method2914(var98);
                field953 = -1;
                return true;
            }
            if (field953 == 189) {
                int var111 = field951.method2909();
                byte var112 = field951.method2902();
                class212.field2608[var111] = var112;
                if (class212.field2613[var111] != var112) {
                    class212.field2613[var111] = var112;
                }
                method9(var111);
                field1093[++field1094 - 1 & 0x1F] = var111;
                field953 = -1;
                return true;
            }
            if (field953 == 228) {
                for (int var113 = 0; var113 < class212.field2613.length; var113++) {
                    if (class212.field2613[var113] != class212.field2608[var113]) {
                        class212.field2613[var113] = class212.field2608[var113];
                        method9(var113);
                        field1093[++field1094 - 1 & 0x1F] = var113;
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 185) {
                int var114 = field951.method2996();
                Statics.field245 = Statics.field697.method2695(var114);
                field953 = -1;
                return true;
            }
            if (field953 == 186) {
                field987 = field951.method3017() * 30;
                field1104 = field1046;
                field953 = -1;
                return true;
            }
            if (field953 == 154) {
                int var115 = field951.method2876();
                boolean var116 = field951.method2871() == 1;
                class217 var117 = class217.method921(var115);
                if (var117.field2674 != var116) {
                    var117.field2674 = var116;
                    method632(var117);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 180) {
                field1057 = 1;
                field1100 = field1046;
                field953 = -1;
                return true;
            }
            if (field953 == 107) {
                field1141 = field951.method2871();
                field953 = -1;
                return true;
            }
            if (field953 == 72) {
                method34();
                field915 = field951.method2871();
                field1104 = field1046;
                field953 = -1;
                return true;
            }
            if (field953 == 106) {
                for (int var118 = 0; var118 < Statics.field3284; var118++) {
                    class242 var119 = class242.method2842(var118);
                    if (var119 != null) {
                        class212.field2608[var118] = 0;
                        class212.field2613[var118] = 0;
                    }
                }
                method34();
                field1094 += 32;
                field953 = -1;
                return true;
            }
            if (field953 == 209) {
                field1101 = field1046;
                if (field1048 == 0) {
                    field1132 = null;
                    field1058 = null;
                    Statics.field2233 = 0;
                    Statics.field571 = null;
                    field953 = -1;
                    return true;
                }
                field1058 = field951.method2879();
                long var120 = field951.method2877();
                long var122 = var120;
                String var124;
                if (var120 <= 0L || var120 >= 6582952005840035281L) {
                    var124 = null;
                } else if (var120 % 37L == 0L) {
                    var124 = null;
                } else {
                    int var125 = 0;
                    for (long var126 = var120; var126 != 0L; var126 /= 37L) {
                        var125++;
                    }
                    StringBuilder var128 = new StringBuilder(var125);
                    while (var122 != 0L) {
                        long var129 = var122;
                        var122 /= 37L;
                        var128.append(class269.field3673[(int) (var129 - var122 * 37L)]);
                    }
                    var124 = var128.reverse().toString();
                }
                field1132 = var124;
                Statics.field2134 = field951.method2872();
                int var131 = field951.method2871();
                if (var131 == 255) {
                    field953 = -1;
                    return true;
                }
                Statics.field2233 = var131;
                class76[] var132 = new class76[100];
                for (int var133 = 0; var133 < Statics.field2233; var133++) {
                    var132[var133] = new class76();
                    var132[var133].field904 = field951.method2879();
                    var132[var133].field899 = class268.method3406(var132[var133].field904, Statics.field2318);
                    var132[var133].field906 = field951.method2873();
                    var132[var133].field901 = field951.method2872();
                    field951.method2879();
                    if (var132[var133].field904.equals(Statics.field1537.field878)) {
                        Statics.field391 = var132[var133].field901;
                    }
                }
                boolean var134 = false;
                int var135 = Statics.field2233;
                while (var135 > 0) {
                    boolean var136 = true;
                    var135--;
                    for (int var137 = 0; var137 < var135; var137++) {
                        if (var132[var137].field899.compareTo(var132[var137 + 1].field899) > 0) {
                            class76 var138 = var132[var137];
                            var132[var137] = var132[var137 + 1];
                            var132[var137 + 1] = var138;
                            var136 = false;
                        }
                    }
                    if (var136) {
                        break;
                    }
                }
                Statics.field571 = var132;
                field953 = -1;
                return true;
            }
            if (field953 == 167) {
                Statics.field3391 = field951.method2898();
                Statics.field515 = field951.method2899();
                while (field951.field2394 < field1048) {
                    field953 = field951.method2871();
                    method3852();
                }
                field953 = -1;
                return true;
            }
            if (field953 == 248 || field953 == 214 || field953 == 122 || field953 == 102 || field953 == 221 || field953 == 56 || field953 == 105 || field953 == 34 || field953 == 109 || field953 == 121) {
                method3852();
                field953 = -1;
                return true;
            }
            if (field953 == 127) {
                int var139 = field951.method2996();
                class217 var140 = class217.method921(var139);
                for (int var141 = 0; var141 < var140.field2772.length; var141++) {
                    var140.field2772[var141] = -1;
                    var140.field2772[var141] = 0;
                }
                method632(var140);
                field953 = -1;
                return true;
            }
            if (field953 == 14) {
                field1115 = field951.method2871();
                if (field1115 == 255) {
                    field1115 = 0;
                }
                field1140 = field951.method2871();
                if (field1140 == 255) {
                    field1140 = 0;
                }
                field953 = -1;
                return true;
            }
            if (field953 == 244) {
                String var142 = field951.method2879();
                int var143 = field951.method2996();
                class217 var144 = class217.method921(var143);
                if (!var142.equals(var144.field2678)) {
                    var144.field2678 = var142;
                    method632(var144);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 198) {
                field1153 = true;
                Statics.field772 = field951.method2871();
                Statics.field783 = field951.method2871();
                Statics.field1204 = field951.method2873();
                Statics.field2172 = field951.method2871();
                Statics.field560 = field951.method2871();
                if (Statics.field560 >= 100) {
                    Statics.field542 = Statics.field772 * 128 + 64;
                    Statics.field234 = Statics.field783 * 128 + 64;
                    Statics.field781 = method1363(Statics.field542, Statics.field234, Statics.field579) - Statics.field1204;
                }
                field953 = -1;
                return true;
            }
            if (field953 == 131) {
                field1153 = false;
                for (int var145 = 0; var145 < 5; var145++) {
                    field1154[var145] = false;
                }
                field953 = -1;
                return true;
            }
            if (field953 == 80) {
                field1061 = field951.method2871();
                field1124 = field951.method2871();
                field953 = -1;
                return true;
            }
            if (field953 == 17) {
                class81 var146 = new class81();
                var146.field1297 = field951.method2879();
                var146.field1293 = field951.method2873();
                int var147 = field951.method2876();
                var146.field1294 = var147;
                method471(45);
                Statics.field2151.method2719();
                Statics.field2151 = null;
                class93.method240(var146);
                field953 = -1;
                return false;
            }
            if (field953 == 78) {
                int var148 = field951.method2917();
                int var149 = field951.method2917();
                class69 var150 = (class69) field1068.method3264((long) var148);
                class69 var151 = (class69) field1068.method3264((long) var149);
                if (var151 != null) {
                    method2657(var151, var150 == null || var150.field826 != var151.field826);
                }
                if (var150 != null) {
                    var150.method3308();
                    field1068.method3260(var150, (long) var149);
                }
                class217 var152 = class217.method921(var148);
                if (var152 != null) {
                    method632(var152);
                }
                class217 var153 = class217.method921(var149);
                if (var153 != null) {
                    method632(var153);
                    method451(Statics.field2642[var153.field2654 >>> 16], var153, true);
                }
                if (field1019 != -1) {
                    method239(field1019, 1);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 11) {
                String var154 = field951.method2879();
                int var155 = field951.method2873();
                byte var156 = field951.method2872();
                boolean var157 = false;
                if (var156 == -128) {
                    var157 = true;
                }
                if (var157) {
                    if (Statics.field2233 == 0) {
                        field953 = -1;
                        return true;
                    }
                    boolean var158 = false;
                    int var159;
                    for (var159 = 0; var159 < Statics.field2233 && (!Statics.field571[var159].field904.equals(var154) || Statics.field571[var159].field906 != var155); var159++) {
                    }
                    if (var159 < Statics.field2233) {
                        while (var159 < Statics.field2233 - 1) {
                            Statics.field571[var159] = Statics.field571[var159 + 1];
                            var159++;
                        }
                        Statics.field2233--;
                        Statics.field571[Statics.field2233] = null;
                    }
                } else {
                    field951.method2879();
                    class76 var160 = new class76();
                    var160.field904 = var154;
                    var160.field899 = class268.method3406(var160.field904, Statics.field2318);
                    var160.field906 = var155;
                    var160.field901 = var156;
                    int var161;
                    for (var161 = Statics.field2233 - 1; var161 >= 0; var161--) {
                        int var162 = Statics.field571[var161].field899.compareTo(var160.field899);
                        if (var162 == 0) {
                            Statics.field571[var161].field906 = var155;
                            Statics.field571[var161].field901 = var156;
                            if (var154.equals(Statics.field1537.field878)) {
                                Statics.field391 = var156;
                            }
                            field1101 = field1046;
                            field953 = -1;
                            return true;
                        }
                        if (var162 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2233 >= Statics.field571.length) {
                        field953 = -1;
                        return true;
                    }
                    for (int var163 = Statics.field2233 - 1; var163 > var161; var163--) {
                        Statics.field571[var163 + 1] = Statics.field571[var163];
                    }
                    if (Statics.field2233 == 0) {
                        Statics.field571 = new class76[100];
                    }
                    Statics.field571[var161 + 1] = var160;
                    Statics.field2233++;
                    if (var154.equals(Statics.field1537.field878)) {
                        Statics.field391 = var156;
                    }
                }
                field1101 = field1046;
                field953 = -1;
                return true;
            }
            if (field953 == 177) {
                int var164 = field951.method2917();
                int var165 = field951.method2907();
                int var166 = var165 >> 10 & 0x1F;
                int var167 = var165 >> 5 & 0x1F;
                int var168 = var165 & 0x1F;
                int var169 = (var168 << 3) + (var166 << 19) + (var167 << 11);
                class217 var170 = class217.method921(var164);
                if (var170.field2679 != var169) {
                    var170.field2679 = var169;
                    method632(var170);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 55) {
                if (field1019 != -1) {
                    method239(field1019, 0);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 62) {
                int var171 = field951.method2871();
                int var172 = field951.method2899();
                String var173 = field951.method2879();
                if (var172 >= 1 && var172 <= 8) {
                    if (var173.equalsIgnoreCase("null")) {
                        var173 = null;
                    }
                    field1129[var172 - 1] = var173;
                    field1034[var172 - 1] = var171 == 0;
                }
                field953 = -1;
                return true;
            }
            if (field953 == 16) {
                class97.method2254(field951, field1048);
                field953 = -1;
                return true;
            }
            if (field953 == 227) {
                int var174 = field951.method2996();
                int var175 = field951.method2909();
                class217 var176 = class217.method921(var174);
                if (var176.field2697 != 1 || var176.field2698 != var175) {
                    var176.field2697 = 1;
                    var176.field2698 = var175;
                    method632(var176);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 123) {
                int var177 = field951.method2871();
                class277[] var178 = new class277[] { class277.field3733, class277.field3731, class277.field3735 };
                class277[] var179 = var178;
                int var180 = 0;
                class277 var182;
                while (true) {
                    if (var180 >= var179.length) {
                        var182 = null;
                        break;
                    }
                    class277 var181 = var179[var180];
                    if (var181.field3732 == var177) {
                        var182 = var181;
                        break;
                    }
                    var180++;
                }
                Statics.field733 = var182;
                field953 = -1;
                return true;
            }
            if (field953 == 44) {
                method16(true);
                field951.method3112();
                int var183 = field951.method2873();
                class97.method2254(field951, var183);
                field953 = -1;
                return true;
            }
            if (field953 == 52) {
                String var184 = field951.method2879();
                class180 var185 = field951;
                String var189;
                try {
                    int var186 = var185.method2884();
                    if (var186 > 32767) {
                        var186 = 32767;
                    }
                    byte[] var187 = new byte[var186];
                    var185.field2394 += Statics.field3658.method2799(var185.field2391, var185.field2394, var187, 0, var186);
                    String var188 = class267.method36(var187, 0, var186);
                    var189 = var188;
                } catch (Exception var321) {
                    var189 = "Cabbage";
                }
                String var192 = class265.method4344(class271.method109(var189));
                class99.method973(6, var184, var192);
                field953 = -1;
                return true;
            }
            if (field953 == 128) {
                int var193 = field1048 + field951.field2394;
                int var194 = field951.method2873();
                int var195 = field951.method2873();
                if (field1019 != var194) {
                    field1019 = var194;
                    this.method1038(false);
                    method161(field1019);
                    class84.method3753(field1019);
                    for (int var196 = 0; var196 < 100; var196++) {
                        field1112[var196] = true;
                    }
                }
                while (var195-- > 0) {
                    int var197 = field951.method2876();
                    int var198 = field951.method2873();
                    int var199 = field951.method2871();
                    class69 var200 = (class69) field1068.method3264((long) var197);
                    if (var200 != null && var200.field826 != var198) {
                        method2657(var200, true);
                        var200 = null;
                    }
                    if (var200 == null) {
                        var200 = Statics.method2646(var197, var198, var199);
                    }
                    var200.field825 = true;
                }
                for (class69 var201 = (class69) field1068.method3262(); var201 != null; var201 = (class69) field1068.method3263()) {
                    if (var201.field825) {
                        var201.field825 = false;
                    } else {
                        method2657(var201, true);
                    }
                }
                field1109 = new class191(512);
                while (field951.field2394 < var193) {
                    int var202 = field951.method2876();
                    int var203 = field951.method2873();
                    int var204 = field951.method2873();
                    int var205 = field951.method2876();
                    for (int var206 = var203; var206 <= var204; var206++) {
                        long var207 = ((long) var202 << 32) + (long) var206;
                        field1109.method3260(new class199(var205), var207);
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 165) {
                method3574();
                field953 = -1;
                return false;
            }
            if (field953 == 23) {
                String var209 = field951.method2879();
                Statics.field238 = var209;
                try {
                    String var210 = Statics.field403.getParameter(class275.field3721.field3724);
                    String var211 = Statics.field403.getParameter(class275.field3726.field3724);
                    String var212 = var210 + "settings=" + var209 + "; version=1; path=/; domain=" + var211;
                    String var213;
                    if (var209.length() == 0) {
                        var213 = var212 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var214 = var212 + "; Expires=";
                        long var215 = class176.method584() + 94608000000L;
                        class183.field2439.setTime(new Date(var215));
                        int var217 = class183.field2439.get(7);
                        int var218 = class183.field2439.get(5);
                        int var219 = class183.field2439.get(2);
                        int var220 = class183.field2439.get(1);
                        int var221 = class183.field2439.get(11);
                        int var222 = class183.field2439.get(12);
                        int var223 = class183.field2439.get(13);
                        String var224 = class183.field2437[var217 - 1] + ", " + var218 / 10 + var218 % 10 + "-" + class183.field2441[0][var219] + "-" + var220 + " " + var221 / 10 + var221 % 10 + ":" + var222 / 10 + var222 % 10 + ":" + var223 / 10 + var223 % 10 + " GMT";
                        var213 = var214 + var224 + "; Max-Age=" + 94608000L;
                    }
                    client var225 = Statics.field403;
                    String var226 = "document.cookie=\"" + var213 + "\"";
                    JSObject.getWindow(var225).eval(var226);
                } catch (Throwable var320) {
                }
                field953 = -1;
                return true;
            }
            if (field953 == 215) {
                int var228 = field951.method2907();
                int var229 = field951.method2909();
                int var230 = field951.method2993();
                class217 var231 = class217.method921(var230);
                var231.field2710 = (var229 << 16) + var228;
                field953 = -1;
                return true;
            }
            if (field953 == 57) {
                int var232 = field951.method2993();
                int var233 = field951.method2876();
                int var234 = field951.method2907();
                if (var234 == 65535) {
                    var234 = -1;
                }
                class217 var235 = class217.method921(var232);
                if (var235.field2726) {
                    var235.field2774 = var234;
                    var235.field2699 = var233;
                    class257 var237 = class257.method1498(var234);
                    var235.field2705 = var237.field3521;
                    var235.field2706 = var237.field3506;
                    var235.field2707 = var237.field3490;
                    var235.field2703 = var237.field3508;
                    var235.field2671 = var237.field3509;
                    var235.field2708 = var237.field3504;
                    if (var237.field3510 == 1) {
                        var235.field2712 = 1;
                    } else {
                        var235.field2712 = 2;
                    }
                    if (var235.field2649 > 0) {
                        var235.field2708 = var235.field2708 * 32 / var235.field2649;
                    } else if (var235.field2665 > 0) {
                        var235.field2708 = var235.field2708 * 32 / var235.field2665;
                    }
                    method632(var235);
                } else if (var234 == -1) {
                    var235.field2697 = 0;
                    field953 = -1;
                    return true;
                } else {
                    class257 var236 = class257.method1498(var234);
                    var235.field2697 = 4;
                    var235.field2698 = var234;
                    var235.field2705 = var236.field3521;
                    var235.field2706 = var236.field3506;
                    var235.field2708 = var236.field3504 * 100 / var233;
                    method632(var235);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 79) {
                for (int var238 = 0; var238 < field1130.length; var238++) {
                    if (field1130[var238] != null) {
                        field1130[var238].field1247 = -1;
                    }
                }
                for (int var239 = 0; var239 < field1110.length; var239++) {
                    if (field1110[var239] != null) {
                        field1110[var239].field1247 = -1;
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 42) {
                String var240 = field951.method2879();
                Object[] var241 = new Object[var240.length() + 1];
                for (int var242 = var240.length() - 1; var242 >= 0; var242--) {
                    if (var240.charAt(var242) == 's') {
                        var241[var242 + 1] = field951.method2879();
                    } else {
                        var241[var242 + 1] = Integer.valueOf(field951.method2876());
                    }
                }
                var241[0] = Integer.valueOf(field951.method2876());
                class70 var243 = new class70();
                var243.field840 = var241;
                class84.method1537(var243);
                field953 = -1;
                return true;
            }
            if (field953 == 162) {
                int var244 = field951.method2993();
                int var245 = field951.method3057();
                int var246 = field951.method2911();
                class217 var247 = class217.method921(var244);
                if (var247.field2663 != var246 || var247.field2664 != var245 || var247.field2659 != 0 || var247.field2660 != 0) {
                    var247.field2663 = var246;
                    var247.field2664 = var245;
                    var247.field2659 = 0;
                    var247.field2660 = 0;
                    method632(var247);
                    this.method1210(var247);
                    if (var247.field2656 == 0) {
                        method451(Statics.field2642[var244 >> 16], var247, false);
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 111) {
                int var248 = field951.method2899();
                int var249 = field951.method2993();
                int var250 = field951.method3017();
                class69 var251 = (class69) field1068.method3264((long) var249);
                if (var251 != null) {
                    method2657(var251, var251.field826 != var250);
                }
                Statics.method2646(var249, var250, var248);
                field953 = -1;
                return true;
            }
            if (field953 == 168) {
                int var252 = field951.method2907();
                if (var252 == 65535) {
                    var252 = -1;
                }
                if (var252 == -1 && !field947) {
                    Statics.field2501.method3427();
                    class204.field2502 = 1;
                    Statics.field2503 = null;
                } else if (var252 != -1 && field1143 != var252 && field924 != 0 && !field947) {
                    class238 var253 = Statics.field2438;
                    int var254 = field924;
                    class204.field2502 = 1;
                    Statics.field2503 = var253;
                    Statics.field2504 = var252;
                    Statics.field2205 = 0;
                    Statics.field2505 = var254;
                    Statics.field2506 = false;
                    Statics.field862 = 2;
                }
                field1143 = var252;
                field953 = -1;
                return true;
            }
            if (field953 == 234) {
                int var255 = field951.method2913();
                int var256 = field951.method2873();
                if (var256 == 65535) {
                    var256 = -1;
                }
                if (field924 != 0 && var256 != -1) {
                    class204.method966(Statics.field268, var256, 0, field924, false);
                    field947 = true;
                }
                field953 = -1;
                return true;
            }
            if (field953 == 94) {
                int var257 = field951.method2876();
                int var258 = field951.method2873();
                if (var257 < -70000) {
                    var258 += 32768;
                }
                class217 var259;
                if (var257 >= 0) {
                    var259 = class217.method921(var257);
                } else {
                    var259 = null;
                }
                if (var259 != null) {
                    for (int var260 = 0; var260 < var259.field2772.length; var260++) {
                        var259.field2772[var260] = 0;
                        var259.field2763[var260] = 0;
                    }
                }
                class64.method49(var258);
                int var261 = field951.method2873();
                for (int var262 = 0; var262 < var261; var262++) {
                    int var263 = field951.method2907();
                    int var264 = field951.method2871();
                    if (var264 == 255) {
                        var264 = field951.method2917();
                    }
                    if (var259 != null && var262 < var259.field2772.length) {
                        var259.field2772[var262] = var263;
                        var259.field2763[var262] = var264;
                    }
                    Statics.method205(var258, var262, var263 - 1, var264);
                }
                if (var259 != null) {
                    method632(var259);
                }
                method34();
                field1095[++field1096 - 1 & 0x1F] = var258 & 0x7FFF;
                field953 = -1;
                return true;
            }
            if (field953 == 141) {
                Statics.field515 = field951.method2871();
                Statics.field3391 = field951.method2898();
                field953 = -1;
                return true;
            }
            if (field953 == 169) {
                int var265 = field951.method2996();
                int var266 = field951.method2907();
                if (var266 == 65535) {
                    var266 = -1;
                }
                int var267 = field951.method3017();
                if (var267 == 65535) {
                    var267 = -1;
                }
                int var268 = field951.method2996();
                for (int var269 = var266; var269 <= var267; var269++) {
                    long var270 = ((long) var265 << 32) + (long) var269;
                    class193 var272 = field1109.method3264(var270);
                    if (var272 != null) {
                        var272.method3308();
                    }
                    field1109.method3260(new class199(var268), var270);
                }
                field953 = -1;
                return true;
            }
            if (field953 == 223) {
                boolean var273 = field951.method2871() == 1;
                if (var273) {
                    Statics.field844 = class176.method584() - field951.method2877();
                    Statics.field905 = new class14(field951, true);
                } else {
                    Statics.field905 = null;
                }
                field1103 = field1046;
                field953 = -1;
                return true;
            }
            if (field953 == 239) {
                field1121 = field951.method2871();
                if (field1121 == 1) {
                    field925 = field951.method2873();
                }
                if (field1121 >= 2 && field1121 <= 6) {
                    if (field1121 == 2) {
                        field930 = 64;
                        field931 = 64;
                    }
                    if (field1121 == 3) {
                        field930 = 0;
                        field931 = 64;
                    }
                    if (field1121 == 4) {
                        field930 = 128;
                        field931 = 64;
                    }
                    if (field1121 == 5) {
                        field930 = 64;
                        field931 = 0;
                    }
                    if (field1121 == 6) {
                        field930 = 64;
                        field931 = 128;
                    }
                    field1121 = 2;
                    field927 = field951.method2873();
                    field908 = field951.method2873();
                    field929 = field951.method2871();
                }
                if (field1121 == 10) {
                    field928 = field951.method2873();
                }
                field953 = -1;
                return true;
            }
            if (field953 == 0) {
                int var274 = field951.method2876();
                int var275 = field951.method2873();
                if (var274 < -70000) {
                    var275 += 32768;
                }
                class217 var276;
                if (var274 >= 0) {
                    var276 = class217.method921(var274);
                } else {
                    var276 = null;
                }
                while (field951.field2394 < field1048) {
                    int var277 = field951.method2884();
                    int var278 = field951.method2873();
                    int var279 = 0;
                    if (var278 != 0) {
                        var279 = field951.method2871();
                        if (var279 == 255) {
                            var279 = field951.method2876();
                        }
                    }
                    if (var276 != null && var277 >= 0 && var277 < var276.field2772.length) {
                        var276.field2772[var277] = var278;
                        var276.field2763[var277] = var279;
                    }
                    Statics.method205(var275, var277, var278 - 1, var279);
                }
                if (var276 != null) {
                    method632(var276);
                }
                method34();
                field1095[++field1096 - 1 & 0x1F] = var275 & 0x7FFF;
                field953 = -1;
                return true;
            }
            if (field953 == 252) {
                int var280 = field951.method2876();
                int var281 = field951.method3017();
                class217 var282 = class217.method921(var280);
                if (var282 != null && var282.field2656 == 0) {
                    if (var281 > var282.field2715 - var282.field2694) {
                        var281 = var282.field2715 - var282.field2694;
                    }
                    if (var281 < 0) {
                        var281 = 0;
                    }
                    if (var282.field2680 != var281) {
                        var282.field2680 = var281;
                        method632(var282);
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 59) {
                String var283 = field951.method2879();
                long var284 = field951.method2877();
                long var286 = (long) field951.method2873();
                long var288 = (long) field951.method2875();
                class231[] var290 = new class231[] { class231.field3177, class231.field3176, class231.field3175, class231.field3181, class231.field3178, class231.field3180 };
                class231 var291 = (class231) class169.method1334(var290, field951.method2871());
                long var292 = (var286 << 32) + var288;
                boolean var294 = false;
                for (int var295 = 0; var295 < 100; var295++) {
                    if (field1126[var295] == var292) {
                        var294 = true;
                        break;
                    }
                }
                if (var291.field3183 && method2655(var283)) {
                    var294 = true;
                }
                if (!var294 && field1026 == 0) {
                    field1126[field1127] = var292;
                    field1127 = (field1127 + 1) % 100;
                    class180 var296 = field951;
                    String var300;
                    try {
                        int var297 = var296.method2884();
                        if (var297 > 32767) {
                            var297 = 32767;
                        }
                        byte[] var298 = new byte[var297];
                        var296.field2394 += Statics.field3658.method2799(var296.field2391, var296.field2394, var298, 0, var297);
                        String var299 = class267.method36(var298, 0, var297);
                        var300 = var299;
                    } catch (Exception var319) {
                        var300 = "Cabbage";
                    }
                    String var303 = class265.method4344(class271.method109(var300));
                    if (var291.field3179 == -1) {
                        class99.method130(9, var283, var303, class269.method1338(var284));
                    } else {
                        class99.method130(9, class89.method1373(var291.field3179) + var283, var303, class269.method1338(var284));
                    }
                }
                field953 = -1;
                return true;
            }
            if (field953 == 129) {
                int var304 = field951.method3017();
                field1019 = var304;
                this.method1038(false);
                method161(var304);
                class84.method3753(field1019);
                for (int var305 = 0; var305 < 100; var305++) {
                    field1112[var305] = true;
                }
                field953 = -1;
                return true;
            }
            if (field953 == 84) {
                method667(false);
                field953 = -1;
                return true;
            }
            if (field953 == 203) {
                while (field951.field2394 < field1048) {
                    int var306 = field951.method2871();
                    boolean var307 = (var306 & 0x1) == 1;
                    String var308 = field951.method2879();
                    String var309 = field951.method2879();
                    field951.method2879();
                    for (int var310 = 0; var310 < field1176; var310++) {
                        class71 var311 = field1177[var310];
                        if (var307) {
                            if (var309.equals(var311.field846)) {
                                var311.field846 = var308;
                                var311.field843 = var309;
                                var308 = null;
                                break;
                            }
                        } else if (var308.equals(var311.field846)) {
                            var311.field846 = var308;
                            var311.field843 = var309;
                            var308 = null;
                            break;
                        }
                    }
                    if (var308 != null && field1176 < 400) {
                        class71 var312 = new class71();
                        field1177[field1176] = var312;
                        var312.field846 = var308;
                        var312.field843 = var309;
                        field1176++;
                    }
                }
                field1100 = field1046;
                field953 = -1;
                return true;
            }
            if (field953 == 151) {
                method667(true);
                field953 = -1;
                return true;
            }
            if (field953 == 28) {
                int var313 = field951.method2917();
                class217 var314 = class217.method921(var313);
                var314.field2697 = 3;
                var314.field2698 = Statics.field1537.field869.method3631();
                method632(var314);
                field953 = -1;
                return true;
            }
            class153.method683("" + field953 + class89.field1391 + field957 + class89.field1391 + field958 + class89.field1391 + field1048, (Throwable) null);
            method3574();
        } catch (IOException var325) {
            if (field959 > 0) {
                method3574();
            } else {
                method471(40);
                Statics.field3624 = Statics.field2151;
                Statics.field2151 = null;
            }
        } catch (Exception var326) {
            String var317 = "" + field953 + class89.field1391 + field957 + class89.field1391 + field958 + class89.field1391 + field1048 + class89.field1391 + (Statics.field2316 + Statics.field1537.field1270[0]) + class89.field1391 + (Statics.field265 + Statics.field1537.field1255[0]) + class89.field1391;
            for (int var318 = 0; var318 < field1048 && var318 < 50; var318++) {
                var317 = var317 + field951.field2391[var318] + class89.field1391;
            }
            class153.method683(var317, var326);
            method3574();
        }
        return true;
    }

    @ObfuscatedName("il.gq(I)V")
    public static final void method3852() {
        if (field953 == 109) {
            int var0 = field951.method2899();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field935[var1];
            int var4 = field951.method2899();
            int var5 = (var4 >> 4 & 0x7) + Statics.field515;
            int var6 = (var4 & 0x7) + Statics.field3391;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method917(Statics.field579, var5, var6, var3, -1, var1, var2, 0, -1);
            }
        } else if (field953 == 102) {
            int var7 = field951.method2871();
            int var8 = (var7 >> 4 & 0x7) + Statics.field515;
            int var9 = (var7 & 0x7) + Statics.field3391;
            int var10 = field951.method2873();
            int var11 = field951.method2871();
            int var12 = field951.method2873();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                int var13 = var8 * 128 + 64;
                int var14 = var9 * 128 + 64;
                class85 var15 = new class85(var10, Statics.field579, var13, var14, method1363(var13, var14, Statics.field579) - var11, var12, field934);
                field1040.method3320(var15);
            }
        } else if (field953 == 34) {
            int var16 = field951.method2873();
            int var17 = field951.method2982();
            int var18 = (var17 >> 4 & 0x7) + Statics.field515;
            int var19 = (var17 & 0x7) + Statics.field3391;
            int var20 = field951.method2898();
            int var21 = var20 >> 2;
            int var22 = var20 & 0x3;
            int var23 = field935[var21];
            if (var18 >= 0 && var19 >= 0 && var18 < 103 && var19 < 103) {
                if (var23 == 0) {
                    class143 var24 = Statics.field416.method2592(Statics.field579, var18, var19);
                    if (var24 != null) {
                        int var25 = var24.field2128 >> 14 & 0x7FFF;
                        if (var21 == 2) {
                            var24.field2125 = new class101(var25, 2, var22 + 4, Statics.field579, var18, var19, var16, false, var24.field2125);
                            var24.field2127 = new class101(var25, 2, var22 + 1 & 0x3, Statics.field579, var18, var19, var16, false, var24.field2127);
                        } else {
                            var24.field2125 = new class101(var25, var21, var22, Statics.field579, var18, var19, var16, false, var24.field2125);
                        }
                    }
                }
                if (var23 == 1) {
                    class148 var26 = Statics.field416.method2466(Statics.field579, var18, var19);
                    if (var26 != null) {
                        int var27 = var26.field2169 >> 14 & 0x7FFF;
                        if (var21 == 4 || var21 == 5) {
                            var26.field2167 = new class101(var27, 4, var22, Statics.field579, var18, var19, var16, false, var26.field2167);
                        } else if (var21 == 6) {
                            var26.field2167 = new class101(var27, 4, var22 + 4, Statics.field579, var18, var19, var16, false, var26.field2167);
                        } else if (var21 == 7) {
                            var26.field2167 = new class101(var27, 4, (var22 + 2 & 0x3) + 4, Statics.field579, var18, var19, var16, false, var26.field2167);
                        } else if (var21 == 8) {
                            var26.field2167 = new class101(var27, 4, var22 + 4, Statics.field579, var18, var19, var16, false, var26.field2167);
                            var26.field2164 = new class101(var27, 4, (var22 + 2 & 0x3) + 4, Statics.field579, var18, var19, var16, false, var26.field2164);
                        }
                    }
                }
                if (var23 == 2) {
                    class149 var28 = Statics.field416.method2467(Statics.field579, var18, var19);
                    if (var21 == 11) {
                        var21 = 10;
                    }
                    if (var28 != null) {
                        var28.field2184 = new class101(var28.field2186 >> 14 & 0x7FFF, var21, var22, Statics.field579, var18, var19, var16, false, var28.field2184);
                    }
                }
                if (var23 == 3) {
                    class130 var29 = Statics.field416.method2512(Statics.field579, var18, var19);
                    if (var29 != null) {
                        var29.field1857 = new class101(var29.field1862 >> 14 & 0x7FFF, 22, var22, Statics.field579, var18, var19, var16, false, var29.field1857);
                    }
                }
            }
        } else if (field953 == 105) {
            int var30 = field951.method2898();
            int var31 = (var30 >> 4 & 0x7) + Statics.field515;
            int var32 = (var30 & 0x7) + Statics.field3391;
            int var33 = field951.method2873();
            int var34 = field951.method2907();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                class95 var35 = new class95();
                var35.field1482 = var33;
                var35.field1479 = var34;
                if (field1037[Statics.field579][var31][var32] == null) {
                    field1037[Statics.field579][var31][var32] = new class194();
                }
                field1037[Statics.field579][var31][var32].method3320(var35);
                method626(var31, var32);
            }
        } else if (field953 == 56) {
            int var36 = field951.method2873();
            int var37 = field951.method2982();
            int var38 = (var37 >> 4 & 0x7) + Statics.field515;
            int var39 = (var37 & 0x7) + Statics.field3391;
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                class194 var40 = field1037[Statics.field579][var38][var39];
                if (var40 != null) {
                    for (class95 var41 = (class95) var40.method3318(); var41 != null; var41 = (class95) var40.method3338()) {
                        if ((var36 & 0x7FFF) == var41.field1482) {
                            var41.method3308();
                            break;
                        }
                    }
                    if (var40.method3318() == null) {
                        field1037[Statics.field579][var38][var39] = null;
                    }
                    method626(var38, var39);
                }
            }
        } else {
            if (field953 == 248) {
                int var42 = field951.method2871();
                int var43 = (var42 >> 4 & 0x7) + Statics.field515;
                int var44 = (var42 & 0x7) + Statics.field3391;
                int var45 = field951.method2873();
                int var46 = field951.method2871();
                int var47 = var46 >> 4 & 0xF;
                int var48 = var46 & 0x7;
                int var49 = field951.method2871();
                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                    int var50 = var47 + 1;
                    if (Statics.field1537.field1270[0] >= var43 - var50 && Statics.field1537.field1270[0] <= var43 + var50 && Statics.field1537.field1255[0] >= var44 - var50 && Statics.field1537.field1255[0] <= var44 + var50 && field1173 != 0 && var48 > 0 && field1081 < 50) {
                        field1148[field1081] = var45;
                        field966[field1081] = var48;
                        field1150[field1081] = var49;
                        field1152[field1081] = null;
                        field1015[field1081] = (var43 << 16) + (var44 << 8) + var47;
                        field1081++;
                    }
                }
            }
            if (field953 == 121) {
                int var51 = field951.method2982();
                int var52 = (var51 >> 4 & 0x7) + Statics.field515;
                int var53 = (var51 & 0x7) + Statics.field3391;
                int var54 = field951.method2898();
                int var55 = var54 >> 2;
                int var56 = var54 & 0x3;
                int var57 = field935[var55];
                int var58 = field951.method2909();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    method917(Statics.field579, var52, var53, var57, var58, var55, var56, 0, -1);
                }
            } else {
                if (field953 == 122) {
                    byte var59 = field951.method2903();
                    byte var60 = field951.method3032();
                    byte var61 = field951.method2872();
                    int var62 = field951.method2871();
                    int var63 = var62 >> 2;
                    int var64 = var62 & 0x3;
                    int var65 = field935[var63];
                    byte var66 = field951.method2903();
                    int var67 = field951.method2907();
                    int var68 = field951.method3017();
                    int var69 = field951.method2909();
                    int var70 = field951.method2907();
                    int var71 = field951.method2982();
                    int var72 = (var71 >> 4 & 0x7) + Statics.field515;
                    int var73 = (var71 & 0x7) + Statics.field3391;
                    class75 var74;
                    if (field1028 == var70) {
                        var74 = Statics.field1537;
                    } else {
                        var74 = field1130[var70];
                    }
                    if (var74 != null) {
                        class256 var75 = class256.method3652(var67);
                        int var76;
                        int var77;
                        if (var64 == 1 || var64 == 3) {
                            var76 = var75.field3443;
                            var77 = var75.field3450;
                        } else {
                            var76 = var75.field3450;
                            var77 = var75.field3443;
                        }
                        int var78 = (var76 >> 1) + var72;
                        int var79 = (var76 + 1 >> 1) + var72;
                        int var80 = (var77 >> 1) + var73;
                        int var81 = (var77 + 1 >> 1) + var73;
                        int[][] var82 = class62.field756[Statics.field579];
                        int var83 = var82[var78][var80] + var82[var79][var80] + var82[var78][var81] + var82[var79][var81] >> 2;
                        int var84 = (var72 << 7) + (var76 << 6);
                        int var85 = (var73 << 7) + (var77 << 6);
                        class134 var86 = var75.method4160(var63, var64, var82, var84, var83, var85);
                        if (var86 != null) {
                            method917(Statics.field579, var72, var73, var65, -1, 0, 0, var69 + 1, var68 + 1);
                            var74.field879 = field934 + var69;
                            var74.field885 = field934 + var68;
                            var74.field891 = var86;
                            var74.field896 = var72 * 128 + var76 * 64;
                            var74.field881 = var73 * 128 + var77 * 64;
                            var74.field880 = var83;
                            if (var60 > var59) {
                                byte var87 = var60;
                                var60 = var59;
                                var59 = var87;
                            }
                            if (var61 > var66) {
                                byte var88 = var61;
                                var61 = var66;
                                var66 = var88;
                            }
                            var74.field883 = var60 + var72;
                            var74.field868 = var59 + var72;
                            var74.field884 = var61 + var73;
                            var74.field886 = var66 + var73;
                        }
                    }
                }
                if (field953 == 214) {
                    int var89 = field951.method2871();
                    int var90 = (var89 >> 4 & 0x7) + Statics.field515;
                    int var91 = (var89 & 0x7) + Statics.field3391;
                    int var92 = field951.method2873();
                    int var93 = field951.method2873();
                    int var94 = field951.method2873();
                    if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                        class194 var95 = field1037[Statics.field579][var90][var91];
                        if (var95 != null) {
                            for (class95 var96 = (class95) var95.method3318(); var96 != null; var96 = (class95) var95.method3338()) {
                                if ((var92 & 0x7FFF) == var96.field1482 && var96.field1479 == var93) {
                                    var96.field1479 = var94;
                                    break;
                                }
                            }
                            method626(var90, var91);
                        }
                    }
                } else if (field953 == 221) {
                    int var97 = field951.method2871();
                    int var98 = (var97 >> 4 & 0x7) + Statics.field515;
                    int var99 = (var97 & 0x7) + Statics.field3391;
                    int var100 = var98 + field951.method2872();
                    int var101 = var99 + field951.method2872();
                    int var102 = field951.method2906();
                    int var103 = field951.method2873();
                    int var104 = field951.method2871() * 4;
                    int var105 = field951.method2871() * 4;
                    int var106 = field951.method2873();
                    int var107 = field951.method2873();
                    int var108 = field951.method2871();
                    int var109 = field951.method2871();
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                        int var110 = var98 * 128 + 64;
                        int var111 = var99 * 128 + 64;
                        int var112 = var100 * 128 + 64;
                        int var113 = var101 * 128 + 64;
                        class94 var114 = new class94(var103, Statics.field579, var110, var111, method1363(var110, var111, Statics.field579) - var104, field934 + var106, field934 + var107, var108, var109, var102, var105);
                        var114.method1581(var112, var113, method1363(var112, var113, Statics.field579) - var105, field934 + var106);
                        field1174.method3320(var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.gk(IIIIIIIIIB)V")
    public static final void method917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1108.method3318(); var10 != null; var10 = (class77) field1108.method3338()) {
            if (var10.field1195 == arg0 && var10.field1197 == arg1 && var10.field1193 == arg2 && var10.field1191 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1195 = arg0;
            var9.field1191 = arg3;
            var9.field1197 = arg1;
            var9.field1193 = arg2;
            method2699(var9);
            field1108.method3320(var9);
        }
        var9.field1203 = arg4;
        var9.field1199 = arg5;
        var9.field1198 = arg6;
        var9.field1200 = arg7;
        var9.field1201 = arg8;
    }

    @ObfuscatedName("en.gu(I)V")
    public static final void method2700() {
        for (class77 var0 = (class77) field1108.method3318(); var0 != null; var0 = (class77) field1108.method3338()) {
            if (var0.field1201 == -1) {
                var0.field1200 = 0;
                method2699(var0);
            } else {
                var0.method3308();
            }
        }
    }

    @ObfuscatedName("en.hm(Lbm;B)V")
    public static final void method2699(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1191 == 0) {
            var1 = Statics.field416.method2465(arg0.field1195, arg0.field1197, arg0.field1193);
        }
        if (arg0.field1191 == 1) {
            var1 = Statics.field416.method2470(arg0.field1195, arg0.field1197, arg0.field1193);
        }
        if (arg0.field1191 == 2) {
            var1 = Statics.field416.method2452(arg0.field1195, arg0.field1197, arg0.field1193);
        }
        if (arg0.field1191 == 3) {
            var1 = Statics.field416.method2524(arg0.field1195, arg0.field1197, arg0.field1193);
        }
        if (var1 != 0) {
            int var5 = Statics.field416.method2520(arg0.field1195, arg0.field1197, arg0.field1193, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1194 = var2;
        arg0.field1196 = var3;
        arg0.field1202 = var4;
    }

    @ObfuscatedName("n.hc(B)V")
    public static final void method6() {
        for (class77 var0 = (class77) field1108.method3318(); var0 != null; var0 = (class77) field1108.method3338()) {
            if (var0.field1201 > 0) {
                var0.field1201--;
            }
            if (var0.field1201 != 0) {
                if (var0.field1200 > 0) {
                    var0.field1200--;
                }
                if (var0.field1200 == 0 && var0.field1197 >= 1 && var0.field1193 >= 1 && var0.field1197 <= 102 && var0.field1193 <= 102 && (var0.field1203 < 0 || class62.method1544(var0.field1203, var0.field1199))) {
                    method2645(var0.field1195, var0.field1191, var0.field1197, var0.field1193, var0.field1203, var0.field1198, var0.field1199);
                    var0.field1200 = -1;
                    if (var0.field1203 == var0.field1194 && var0.field1194 == -1) {
                        var0.method3308();
                    } else if (var0.field1203 == var0.field1194 && var0.field1202 == var0.field1198 && var0.field1199 == var0.field1196) {
                        var0.method3308();
                    }
                }
            } else if (var0.field1194 < 0 || class62.method1544(var0.field1194, var0.field1196)) {
                method2645(var0.field1195, var0.field1191, var0.field1197, var0.field1193, var0.field1194, var0.field1202, var0.field1196);
                var0.method3308();
            }
        }
    }

    @ObfuscatedName("ex.he(IIIIIIII)V")
    public static final void method2645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field912 && Statics.field579 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field416.method2465(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field416.method2470(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field416.method2452(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field416.method2524(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field416.method2520(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field416.method2551(arg0, arg2, arg3);
                class256 var15 = class256.method3652(var12);
                if (var15.field3452 != 0) {
                    field967[arg0].method2763(arg2, arg3, var13, var14, var15.field3453);
                }
            }
            if (arg1 == 1) {
                Statics.field416.method2560(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field416.method2462(arg0, arg2, arg3);
                class256 var16 = class256.method3652(var12);
                if (var16.field3450 + arg2 > 103 || var16.field3450 + arg3 > 103 || var16.field3443 + arg2 > 103 || var16.field3443 + arg3 > 103) {
                    return;
                }
                if (var16.field3452 != 0) {
                    field967[arg0].method2764(arg2, arg3, var16.field3450, var16.field3443, var14, var16.field3453);
                }
            }
            if (arg1 == 3) {
                Statics.field416.method2463(arg0, arg2, arg3);
                class256 var17 = class256.method3652(var12);
                if (var17.field3452 == 1) {
                    field967[arg0].method2766(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field747[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class140 var19 = Statics.field416;
        class162 var20 = field967[arg0];
        class256 var21 = class256.method3652(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3443;
            var23 = var21.field3450;
        } else {
            var22 = var21.field3450;
            var23 = var21.field3443;
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
        int[][] var28 = class62.field756[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3454 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3475 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class142 var34;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var34 = var21.method4160(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class101(arg4, 22, arg5, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2453(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3452 == 1) {
                var20.method2761(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class142 var57;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var57 = var21.method4160(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class101(arg4, 10, arg5, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            if (var57 != null) {
                var19.method2585(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3452 != 0) {
                var20.method2762(arg2, arg3, var22, var23, var21.field3453);
            }
        } else if (arg6 >= 12) {
            class142 var35;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var35 = var21.method4160(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2585(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3452 != 0) {
                var20.method2762(arg2, arg3, var22, var23, var21.field3453);
            }
        } else if (arg6 == 0) {
            class142 var36;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var36 = var21.method4160(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class101(arg4, 0, arg5, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2600(arg0, arg2, arg3, var29, var36, (class142) null, class62.field750[arg5], 0, var32, var33);
            if (var21.field3452 != 0) {
                var20.method2758(arg2, arg3, arg6, arg5, var21.field3453);
            }
        } else if (arg6 == 1) {
            class142 var37;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var37 = var21.method4160(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class101(arg4, 1, arg5, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2600(arg0, arg2, arg3, var29, var37, (class142) null, class62.field757[arg5], 0, var32, var33);
            if (var21.field3452 != 0) {
                var20.method2758(arg2, arg3, arg6, arg5, var21.field3453);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class142 var39;
            class142 var40;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var39 = var21.method4160(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4160(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class101(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3457, true, (class142) null);
                var40 = new class101(arg4, 2, var38, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2600(arg0, arg2, arg3, var29, var39, var40, class62.field750[arg5], class62.field750[var38], var32, var33);
            if (var21.field3452 != 0) {
                var20.method2758(arg2, arg3, arg6, arg5, var21.field3453);
            }
        } else if (arg6 == 3) {
            class142 var41;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var41 = var21.method4160(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class101(arg4, 3, arg5, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2600(arg0, arg2, arg3, var29, var41, (class142) null, class62.field757[arg5], 0, var32, var33);
            if (var21.field3452 != 0) {
                var20.method2758(arg2, arg3, arg6, arg5, var21.field3453);
            }
        } else if (arg6 == 9) {
            class142 var42;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var42 = var21.method4160(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2585(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3452 != 0) {
                var20.method2762(arg2, arg3, var22, var23, var21.field3453);
            }
        } else if (arg6 == 4) {
            class142 var43;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var43 = var21.method4160(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2468(arg0, arg2, arg3, var29, var43, (class142) null, class62.field750[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2465(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class256.method3652(var45 >> 14 & 0x7FFF).field3459;
            }
            class142 var46;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var46 = var21.method4160(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2468(arg0, arg2, arg3, var29, var46, (class142) null, class62.field750[arg5], 0, class62.field749[arg5] * var44, class62.field753[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2465(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class256.method3652(var48 >> 14 & 0x7FFF).field3459 / 2;
            }
            class142 var49;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var49 = var21.method4160(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2468(arg0, arg2, arg3, var29, var49, (class142) null, 256, arg5, class62.field758[arg5] * var47, class62.field759[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class142 var51;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var51 = var21.method4160(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class101(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2468(arg0, arg2, arg3, var29, var51, (class142) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2465(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class256.method3652(var53 >> 14 & 0x7FFF).field3459 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class142 var55;
            class142 var56;
            if (var21.field3457 == -1 && var21.field3476 == null) {
                var55 = var21.method4160(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4160(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3457, true, (class142) null);
                var56 = new class101(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3457, true, (class142) null);
            }
            var19.method2468(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field758[arg5] * var52, class62.field759[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("an.hl(III)V")
    public static final void method626(int arg0, int arg1) {
        class194 var2 = field1037[Statics.field579][arg0][arg1];
        if (var2 == null) {
            Statics.field416.method2464(Statics.field579, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3318(); var6 != null; var6 = (class95) var2.method3338()) {
            class257 var7 = class257.method1498(var6.field1482);
            long var8 = (long) var7.field3511;
            if (var7.field3510 == 1) {
                var8 = (long) (var6.field1479 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field416.method2464(Statics.field579, arg0, arg1);
            return;
        }
        var2.method3341(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3318(); var12 != null; var12 = (class95) var2.method3338()) {
            if (var5.field1482 != var12.field1482) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1482 != var12.field1482 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field416.method2605(Statics.field579, arg0, arg1, method1363(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field579), var5, var13, var10, var11);
    }

    @ObfuscatedName("af.hd(ZB)V")
    public static final void method667(boolean arg0) {
        field1030 = 0;
        field1146 = 0;
        method618();
        method827(arg0);
        for (int var1 = 0; var1 < field1146; var1++) {
            int var2 = field948[var1];
            class87 var3 = field1110[var2];
            int var4 = field951.method2871();
            if ((var4 & 0x10) != 0) {
                int var5 = field951.method2871();
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = field951.method2884();
                        if (var10 == 32767) {
                            var10 = field951.method2884();
                            var8 = field951.method2884();
                            var7 = field951.method2884();
                            var9 = field951.method2884();
                        } else if (var10 == 32766) {
                            var10 = -1;
                        } else {
                            var8 = field951.method2884();
                        }
                        int var11 = field951.method2884();
                        var3.method1348(var10, var8, var7, var9, field934, var11);
                    }
                }
                int var12 = field951.method2982();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = field951.method2884();
                        int var15 = field951.method2884();
                        if (var15 == 32767) {
                            var3.method1350(var14);
                        } else {
                            int var16 = field951.method2884();
                            int var17 = field951.method2871();
                            int var18 = var15 > 0 ? field951.method2899() : var17;
                            var3.method1349(var14, field934, var15, var16, var17, var18);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1250 = field951.method2873();
                if (var3.field1250 == 65535) {
                    var3.field1250 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1228 = field951.method2879();
                var3.field1231 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var19 = field951.method3017();
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = field951.method2982();
                if (var3.field1247 == var19 && var19 != -1) {
                    int var21 = class261.method1884(var19).field3620;
                    if (var21 == 1) {
                        var3.field1248 = 0;
                        var3.field1249 = 0;
                        var3.field1227 = var20;
                        var3.field1260 = 0;
                    }
                    if (var21 == 2) {
                        var3.field1260 = 0;
                    }
                } else if (var19 == -1 || var3.field1247 == -1 || class261.method1884(var19).field3614 >= class261.method1884(var3.field1247).field3614) {
                    var3.field1247 = var19;
                    var3.field1248 = 0;
                    var3.field1249 = 0;
                    var3.field1227 = var20;
                    var3.field1260 = 0;
                    var3.field1274 = var3.field1269;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var22 = field951.method2907();
                int var23 = field951.method2907();
                int var24 = var3.field1233 - (var22 - Statics.field2316 - Statics.field2316) * 64;
                int var25 = var3.field1265 - (var23 - Statics.field265 - Statics.field265) * 64;
                if (var24 != 0 || var25 != 0) {
                    var3.field1243 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1215 = field951.method2907();
                int var26 = field951.method2917();
                var3.field1256 = var26 >> 16;
                var3.field1217 = (var26 & 0xFFFF) + field934;
                var3.field1251 = 0;
                var3.field1254 = 0;
                if (var3.field1217 > field934) {
                    var3.field1251 = -1;
                }
                if (var3.field1215 == 65535) {
                    var3.field1215 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1368 = class259.method3748(field951.method2907());
                var3.field1219 = var3.field1368.field3558;
                var3.field1268 = var3.field1368.field3581;
                var3.field1252 = var3.field1368.field3564;
                var3.field1224 = var3.field1368.field3577;
                var3.field1225 = var3.field1368.field3566;
                var3.field1226 = var3.field1368.field3584;
                var3.field1271 = var3.field1368.field3563;
                var3.field1221 = var3.field1368.field3562;
                var3.field1245 = var3.field1368.field3573;
            }
        }
        for (int var27 = 0; var27 < field1030; var27++) {
            int var28 = field1031[var27];
            if (field934 != field1110[var28].field1264) {
                field1110[var28].field1368 = null;
                field1110[var28] = null;
            }
        }
        if (field1048 != field951.field2394) {
            throw new RuntimeException(field951.field2394 + class89.field1391 + field1048);
        }
        for (int var29 = 0; var29 < field945; var29++) {
            if (field1110[field946[var29]] == null) {
                throw new RuntimeException(var29 + class89.field1391 + field945);
            }
        }
    }

    @ObfuscatedName("ah.hu(I)V")
    public static final void method618() {
        field951.method3115();
        int var0 = field951.method3122(8);
        if (var0 < field945) {
            for (int var1 = var0; var1 < field945; var1++) {
                field1031[++field1030 - 1] = field946[var1];
            }
        }
        if (var0 > field945) {
            throw new RuntimeException("");
        }
        field945 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field946[var2];
            class87 var4 = field1110[var3];
            int var5 = field951.method3122(1);
            if (var5 == 0) {
                field946[++field945 - 1] = var3;
                var4.field1264 = field934;
            } else {
                int var6 = field951.method3122(2);
                if (var6 == 0) {
                    field946[++field945 - 1] = var3;
                    var4.field1264 = field934;
                    field948[++field1146 - 1] = var3;
                } else if (var6 == 1) {
                    field946[++field945 - 1] = var3;
                    var4.field1264 = field934;
                    int var7 = field951.method3122(3);
                    var4.method1517(var7, (byte) 1);
                    int var8 = field951.method3122(1);
                    if (var8 == 1) {
                        field948[++field1146 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field946[++field945 - 1] = var3;
                    var4.field1264 = field934;
                    int var9 = field951.method3122(3);
                    var4.method1517(var9, (byte) 2);
                    int var10 = field951.method3122(3);
                    var4.method1517(var10, (byte) 2);
                    int var11 = field951.method3122(1);
                    if (var11 == 1) {
                        field948[++field1146 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1031[++field1030 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("bb.hv(ZI)V")
    public static final void method827(boolean arg0) {
        while (true) {
            if (field951.method3120(field1048) >= 27) {
                int var1 = field951.method3122(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field1110[var1] == null) {
                        field1110[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field1110[var1];
                    field946[++field945 - 1] = var1;
                    var3.field1264 = field934;
                    int var4;
                    if (arg0) {
                        var4 = field951.method3122(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field951.method3122(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    var3.field1368 = class259.method3748(field951.method3122(14));
                    int var5 = field1035[field951.method3122(3)];
                    if (var2) {
                        var3.field1266 = var3.field1241 = var5;
                    }
                    int var6;
                    if (arg0) {
                        var6 = field951.method3122(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field951.method3122(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field951.method3122(1);
                    int var8 = field951.method3122(1);
                    if (var8 == 1) {
                        field948[++field1146 - 1] = var1;
                    }
                    var3.field1219 = var3.field1368.field3558;
                    var3.field1268 = var3.field1368.field3581;
                    if (var3.field1268 == 0) {
                        var3.field1241 = 0;
                    }
                    var3.field1252 = var3.field1368.field3564;
                    var3.field1224 = var3.field1368.field3577;
                    var3.field1225 = var3.field1368.field3566;
                    var3.field1226 = var3.field1368.field3584;
                    var3.field1271 = var3.field1368.field3563;
                    var3.field1221 = var3.field1368.field3562;
                    var3.field1245 = var3.field1368.field3573;
                    var3.method1520(Statics.field1537.field1270[0] + var4, Statics.field1537.field1255[0] + var6, var7 == 1);
                    continue;
                }
            }
            field951.method3114();
            return;
        }
    }

    @ObfuscatedName("bi.hp(III)Lfs;")
    public static class164 method679(int arg0, int arg1) {
        field1185.field2309 = arg0;
        field1185.field2312 = arg1;
        field1185.field2308 = 1;
        field1185.field2307 = 1;
        return field1185;
    }

    @ObfuscatedName("be.hy(B)V")
    public static final void method1019() {
        int var0 = Statics.field765;
        int var1 = Statics.field261;
        int var2 = Statics.field262;
        int var3 = Statics.field352;
        int var4 = 6116423;
        class282.method4582(var0, var1, var2, var3, var4);
        class282.method4582(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class282.method4563(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field339.method4387(class226.field3013, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field723;
        int var6 = class60.field724 * -90084053;
        for (int var7 = 0; var7 < field1038; var7++) {
            int var8 = (field1038 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class264 var10 = Statics.field339;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field1123[var7].length() > 0) {
                var11 = field1147[var7] + class226.field3020 + field1123[var7];
            } else {
                var11 = field1147[var7];
            }
            var10.method4387(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field765;
        int var13 = Statics.field261;
        int var14 = Statics.field262;
        int var15 = Statics.field352;
        for (int var16 = 0; var16 < field1007; var16++) {
            if (field1117[var16] + field1099[var16] > var12 && field1099[var16] < var12 + var14 && field960[var16] + field1118[var16] > var13 && field960[var16] < var13 + var15) {
                field1113[var16] = true;
            }
        }
    }

    @ObfuscatedName("ad.ha(IIIII)V")
    public static final void method486(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1007; var4++) {
            if (field1117[var4] + field1099[var4] > arg0 && field1099[var4] < arg0 + arg2 && field960[var4] + field1118[var4] > arg1 && field960[var4] < arg1 + arg3) {
                field1112[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hr(I)V")
    public final void method1036() {
        Statics.method1418();
        if (Statics.field842 != null || field1080 != null) {
            return;
        }
        int var1 = class60.field729;
        if (!field1045) {
            int var18;
            int var20;
            int var21;
            label260: {
                var18 = method2364();
                if ((var1 == 1 || !Statics.field462 && var1 == 4) && var18 >= 0) {
                    int var19 = field985[var18];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field1001[var18];
                        var21 = field954[var18];
                        class217 var22 = class217.method921(var21);
                        int var23 = method619(var22);
                        boolean var24 = (var23 >> 28 & 0x1) != 0;
                        if (var24) {
                            break label260;
                        }
                        class218 var10000 = (class218) null;
                        if (class218.method2654(method619(var22))) {
                            break label260;
                        }
                    }
                }
                if (var1 == 1 || !Statics.field462 && var1 == 4) {
                    label255: {
                        label239: {
                            if (field1044 == 1 && field1038 > 2) {
                                boolean var30;
                                if (field1038 <= 0) {
                                    var30 = false;
                                } else if (field1055 && class51.field627[81] && field941 != -1) {
                                    var30 = true;
                                } else {
                                    var30 = false;
                                }
                                if (!var30) {
                                    break label239;
                                }
                            }
                            boolean var31;
                            if (var18 < 0) {
                                var31 = false;
                            } else {
                                int var32 = field985[var18];
                                if (var32 >= 2000) {
                                    var32 -= 2000;
                                }
                                if (var32 == 1007) {
                                    var31 = true;
                                } else {
                                    var31 = false;
                                }
                            }
                            if (!var31) {
                                break label255;
                            }
                        }
                        var1 = 2;
                    }
                }
                if ((var1 == 1 || !Statics.field462 && var1 == 4) && field1038 > 0 && var18 >= 0) {
                    int var33 = field1001[var18];
                    int var34 = field954[var18];
                    int var35 = field985[var18];
                    int var36 = field1050[var18];
                    String var37 = field1147[var18];
                    String var38 = field1123[var18];
                    method447(var33, var34, var35, var36, var37, var38, class60.field736, class60.field731);
                }
                if (var1 == 2 && field1038 > 0) {
                    this.method1037(class60.field736, class60.field731);
                }
                return;
            }
            if (Statics.field842 != null && !field1024) {
                int var25 = method2364();
                if (field1044 != 1) {
                    boolean var26;
                    if (var25 < 0) {
                        var26 = false;
                    } else {
                        int var27 = field985[var25];
                        if (var27 >= 2000) {
                            var27 -= 2000;
                        }
                        if (var27 == 1007) {
                            var26 = true;
                        } else {
                            var26 = false;
                        }
                    }
                    if (!var26 && field1038 > 0) {
                        int var28 = field1033;
                        int var29 = field1022;
                        method317(Statics.field1526, var28, var29);
                        Statics.field1526 = null;
                    }
                }
            }
            field1024 = false;
            field1052 = 0;
            if (Statics.field842 != null) {
                method632(Statics.field842);
            }
            Statics.field842 = class217.method921(var21);
            field944 = var20;
            field1033 = class60.field736;
            field1022 = class60.field731;
            if (var18 >= 0) {
                Statics.field1526 = new class90();
                Statics.field1526.field1403 = field1001[var18];
                Statics.field1526.field1400 = field954[var18];
                Statics.field1526.field1401 = field985[var18];
                Statics.field1526.field1404 = field1050[var18];
                Statics.field1526.field1402 = field1147[var18];
            }
            method632(Statics.field842);
            return;
        }
        if (var1 != 1 && (Statics.field462 || var1 != 4)) {
            int var2 = class60.field723;
            int var3 = class60.field724 * -90084053;
            if (var2 < Statics.field765 - 10 || var2 > Statics.field765 + Statics.field262 + 10 || var3 < Statics.field261 - 10 || var3 > Statics.field352 + Statics.field261 + 10) {
                field1045 = false;
                method486(Statics.field765, Statics.field261, Statics.field262, Statics.field352);
            }
        }
        if (var1 != 1 && Statics.field462 || var1 != 4) {
            return;
        }
        int var4 = Statics.field765;
        int var5 = Statics.field261;
        int var6 = Statics.field262;
        int var7 = class60.field736;
        int var8 = class60.field731;
        int var9 = -1;
        for (int var10 = 0; var10 < field1038; var10++) {
            int var11 = (field1038 - 1 - var10) * 15 + var5 + 31;
            if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                var9 = var10;
            }
        }
        if (var9 != -1 && var9 >= 0) {
            int var12 = field1001[var9];
            int var13 = field954[var9];
            int var14 = field985[var9];
            int var15 = field1050[var9];
            String var16 = field1147[var9];
            String var17 = field1123[var9];
            method447(var12, var13, var14, var15, var16, var17, class60.field736, class60.field731);
        }
        field1045 = false;
        method486(Statics.field765, Statics.field261, Statics.field262, Statics.field352);
    }

    @ObfuscatedName("client.hx(III)V")
    public final void method1037(int arg0, int arg1) {
        int var3 = Statics.field339.method4383(class226.field3013);
        for (int var4 = 0; var4 < field1038; var4++) {
            class264 var5 = Statics.field339;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1123[var4].length() > 0) {
                var6 = field1147[var4] + class226.field3020 + field1123[var4];
            } else {
                var6 = field1147[var4];
            }
            int var7 = var5.method4383(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field1038 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field1214) {
            var9 = Statics.field1214 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field3350) {
            var10 = Statics.field3350 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field416.method2480(Statics.field579, arg0, arg1, false);
        field1045 = true;
        Statics.field765 = var9;
        Statics.field261 = var10;
        Statics.field262 = var3;
        Statics.field352 = field1038 * 15 + 22;
    }

    @ObfuscatedName("aw.hj(Lcf;III)V")
    public static final void method317(class90 arg0, int arg1, int arg2) {
        method447(arg0.field1403, arg0.field1400, arg0.field1401, arg0.field1404, arg0.field1402, arg0.field1402, arg1, arg2);
    }

    @ObfuscatedName("aq.hh(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method447(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1005) {
            class217 var8 = class217.method921(arg1);
            if (var8 == null || var8.field2763[arg0] < 100000) {
                field949.method3136(101);
                field949.method2857(arg3);
            } else {
                class99.method973(27, "", var8.field2763[arg0] + " x " + class257.method1498(arg3).field3499);
            }
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 45) {
            class75 var9 = field1130[arg3];
            if (var9 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(231);
                field949.method2908(class51.field627[82] ? 1 : 0);
                field949.method2932(arg3);
            }
        }
        if (arg2 == 1) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(63);
            field949.method2914(Statics.field18);
            field949.method2895(class51.field627[82] ? 1 : 0);
            field949.method2932(Statics.field273);
            field949.method2905(Statics.field1485);
            field949.method2904(Statics.field2316 + arg0);
            field949.method2857(Statics.field265 + arg1);
            field949.method2857(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 39) {
            field949.method3136(33);
            field949.method3024(arg1);
            field949.method2905(arg3);
            field949.method2932(arg0);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 13) {
            class87 var10 = field1110[arg3];
            if (var10 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(129);
                field949.method2908(class51.field627[82] ? 1 : 0);
                field949.method2904(arg3);
            }
        }
        if (arg2 == 26) {
            field949.method3136(89);
            for (class69 var11 = (class69) field1068.method3262(); var11 != null; var11 = (class69) field1068.method3263()) {
                if (var11.field823 == 0 || var11.field823 == 3) {
                    method2657(var11, true);
                }
            }
            if (field1071 != null) {
                method632(field1071);
                field1071 = null;
            }
        }
        if (arg2 == 1003) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            class87 var12 = field1110[arg3];
            if (var12 != null) {
                class259 var13 = var12.field1368;
                if (var13.field3567 != null) {
                    var13 = var13.method4241();
                }
                if (var13 != null) {
                    field949.method3136(54);
                    field949.method2905(var13.field3556);
                }
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field276.method4908(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 7) {
            class87 var14 = field1110[arg3];
            if (var14 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(209);
                field949.method2860(class51.field627[82] ? 1 : 0);
                field949.method2905(Statics.field273);
                field949.method2904(arg3);
                field949.method2914(Statics.field18);
                field949.method2857(Statics.field1485);
            }
        }
        if (arg2 == 40) {
            field949.method3136(97);
            field949.method2932(arg3);
            field949.method2904(arg0);
            field949.method3030(arg1);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 38) {
            method968();
            class217 var15 = class217.method921(arg1);
            field1078 = 1;
            Statics.field273 = arg0;
            Statics.field18 = arg1;
            Statics.field1485 = arg3;
            method632(var15);
            field1159 = class89.method596(16748608) + class257.method1498(arg3).field3499 + class89.method596(16777215);
            if (field1159 == null) {
                field1159 = "null";
            }
            return;
        }
        if (arg2 == 15) {
            class75 var16 = field1130[arg3];
            if (var16 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(221);
                field949.method2908(class51.field627[82] ? 1 : 0);
                field949.method2932(field1063);
                field949.method2905(arg3);
                field949.method3030(Statics.field551);
            }
        }
        if (arg2 == 6) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(197);
            field949.method2904(Statics.field2316 + arg0);
            field949.method2932(Statics.field265 + arg1);
            field949.method2857(arg3 >> 14 & 0x7FFF);
            field949.method2860(class51.field627[82] ? 1 : 0);
        }
        if (arg2 == 43) {
            field949.method3136(103);
            field949.method2857(arg0);
            field949.method3030(arg1);
            field949.method2905(arg3);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 16) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(180);
            field949.method2905(Statics.field273);
            field949.method2857(Statics.field2316 + arg0);
            field949.method2904(Statics.field1485);
            field949.method2904(arg3);
            field949.method3030(Statics.field18);
            field949.method2897(class51.field627[82] ? 1 : 0);
            field949.method2905(Statics.field265 + arg1);
        }
        if (arg2 == 2) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(119);
            field949.method2905(Statics.field2316 + arg0);
            field949.method2932(arg3 >> 14 & 0x7FFF);
            field949.method2895(class51.field627[82] ? 1 : 0);
            field949.method2932(field1063);
            field949.method2914(Statics.field551);
            field949.method2932(Statics.field265 + arg1);
        }
        if (arg2 == 1004) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field949.method3136(101);
            field949.method2857(arg3);
        }
        if (arg2 == 42) {
            field949.method3136(178);
            field949.method2857(arg0);
            field949.method2914(arg1);
            field949.method2904(arg3);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 30 && field1071 == null) {
            field949.method3136(213);
            field949.method3030(arg1);
            field949.method2905(arg0);
            field1071 = class217.method63(arg1, arg0);
            method632(field1071);
        }
        if (arg2 == 35) {
            field949.method3136(251);
            field949.method3030(arg1);
            field949.method2905(arg0);
            field949.method2905(arg3);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 33) {
            field949.method3136(39);
            field949.method2904(arg3);
            field949.method2905(arg0);
            field949.method3030(arg1);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 51) {
            class75 var17 = field1130[arg3];
            if (var17 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(205);
                field949.method2932(arg3);
                field949.method2897(class51.field627[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field949.method3136(9);
            field949.method2859(arg1);
            class217 var18 = class217.method921(arg1);
            if (var18.field2766 != null && var18.field2766[0][0] == 5) {
                int var19 = var18.field2766[0][1];
                class212.field2613[var19] = 1 - class212.field2613[var19];
                method9(var19);
            }
        }
        if (arg2 == 31) {
            field949.method3136(219);
            field949.method2904(Statics.field1485);
            field949.method3024(Statics.field18);
            field949.method2905(arg0);
            field949.method2905(Statics.field273);
            field949.method2859(arg1);
            field949.method2932(arg3);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 25) {
            class217 var20 = class217.method63(arg1, arg0);
            if (var20 != null) {
                method968();
                int var21 = method619(var20);
                int var22 = var21 >> 11 & 0x3F;
                int var24 = var20.field2774;
                class217 var25 = class217.method63(arg1, arg0);
                if (var25 != null && var25.field2745 != null) {
                    class70 var26 = new class70();
                    var26.field831 = var25;
                    var26.field840 = var25.field2745;
                    class84.method1537(var26);
                }
                field1064 = var24;
                field1062 = true;
                Statics.field551 = arg1;
                field1063 = arg0;
                Statics.field1677 = var22;
                method632(var25);
                field1078 = 0;
                field1065 = method912(var20);
                if (field1065 == null) {
                    field1065 = "Null";
                }
                if (var20.field2726) {
                    field1020 = var20.field2645 + class89.method596(16777215);
                } else {
                    field1020 = class89.method596(65280) + var20.field2770 + class89.method596(16777215);
                }
            }
            return;
        }
        if (arg2 == 36) {
            field949.method3136(56);
            field949.method2932(arg3);
            field949.method2857(arg0);
            field949.method3030(arg1);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 5) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(156);
            field949.method2857(Statics.field265 + arg1);
            field949.method2905(arg3 >> 14 & 0x7FFF);
            field949.method2908(class51.field627[82] ? 1 : 0);
            field949.method2905(Statics.field2316 + arg0);
        }
        if (arg2 == 1002) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field949.method3136(152);
            field949.method2905(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 12) {
            class87 var27 = field1110[arg3];
            if (var27 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(242);
                field949.method2932(arg3);
                field949.method2897(class51.field627[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class87 var28 = field1110[arg3];
            if (var28 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(250);
                field949.method2857(arg3);
                field949.method2897(class51.field627[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field949.method3136(172);
            field949.method2932(arg0);
            field949.method3024(arg1);
            field949.method2905(arg3);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 58) {
            class217 var29 = class217.method63(arg1, arg0);
            if (var29 != null) {
                field949.method3136(248);
                field949.method2904(arg0);
                field949.method3030(Statics.field551);
                field949.method3024(arg1);
                field949.method2904(field1064);
                field949.method2857(var29.field2774);
                field949.method2932(field1063);
            }
        }
        if (arg2 == 48) {
            class75 var30 = field1130[arg3];
            if (var30 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(69);
                field949.method2895(class51.field627[82] ? 1 : 0);
                field949.method2932(arg3);
            }
        }
        if (arg2 == 11) {
            class87 var31 = field1110[arg3];
            if (var31 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(217);
                field949.method2905(arg3);
                field949.method2860(class51.field627[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(1);
            field949.method2860(class51.field627[82] ? 1 : 0);
            field949.method2904(arg3);
            field949.method2904(Statics.field265 + arg1);
            field949.method2904(Statics.field2316 + arg0);
        }
        if (arg2 == 24) {
            class217 var32 = class217.method921(arg1);
            boolean var33 = true;
            if (var32.field2658 > 0) {
                var33 = method1874(var32);
            }
            if (var33) {
                field949.method3136(9);
                field949.method2859(arg1);
            }
        }
        if (arg2 == 8) {
            class87 var34 = field1110[arg3];
            if (var34 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(175);
                field949.method2932(arg3);
                field949.method2904(field1063);
                field949.method3030(Statics.field551);
                field949.method2860(class51.field627[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field949.method3136(66);
            field949.method2905(arg3);
            field949.method2914(arg1);
            field949.method2932(arg0);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 20) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(59);
            field949.method2904(arg3);
            field949.method2904(Statics.field2316 + arg0);
            field949.method2932(Statics.field265 + arg1);
            field949.method2908(class51.field627[82] ? 1 : 0);
        }
        if (arg2 == 37) {
            field949.method3136(58);
            field949.method2904(arg0);
            field949.method3024(arg1);
            field949.method2857(arg3);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 29) {
            field949.method3136(9);
            field949.method2859(arg1);
            class217 var35 = class217.method921(arg1);
            if (var35.field2766 != null && var35.field2766[0][0] == 5) {
                int var36 = var35.field2766[0][1];
                if (class212.field2613[var36] != var35.field2655[0]) {
                    class212.field2613[var36] = var35.field2655[0];
                    method9(var36);
                }
            }
        }
        if (arg2 == 22) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(105);
            field949.method2905(Statics.field2316 + arg0);
            field949.method2895(class51.field627[82] ? 1 : 0);
            field949.method2857(Statics.field265 + arg1);
            field949.method2904(arg3);
        }
        if (arg2 == 4) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(25);
            field949.method2905(Statics.field265 + arg1);
            field949.method2857(arg3 >> 14 & 0x7FFF);
            field949.method2897(class51.field627[82] ? 1 : 0);
            field949.method2904(Statics.field2316 + arg0);
        }
        if (arg2 == 18) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(144);
            field949.method2904(Statics.field2316 + arg0);
            field949.method2857(arg3);
            field949.method2857(Statics.field265 + arg1);
            field949.method2908(class51.field627[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field949.method3136(88);
            field949.method3030(Statics.field551);
            field949.method2932(arg3);
            field949.method2905(field1063);
            field949.method3030(arg1);
            field949.method2904(arg0);
            field1018 = 0;
            Statics.field483 = class217.method921(arg1);
            field1049 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var37 = class217.method63(arg1, arg0);
            if (var37 != null) {
                int var38 = var37.field2774;
                class217 var39 = class217.method63(arg1, arg0);
                if (var39 != null) {
                    if (var39.field2754 != null) {
                        class70 var40 = new class70();
                        var40.field831 = var39;
                        var40.field833 = arg3;
                        var40.field838 = arg5;
                        var40.field840 = var39.field2754;
                        class84.method1537(var40);
                    }
                    boolean var41 = true;
                    if (var39.field2658 > 0) {
                        var41 = method1874(var39);
                    }
                    if (var41 && class218.method1540(method619(var39), arg3 - 1)) {
                        if (arg3 == 1) {
                            field949.method3136(215);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                        if (arg3 == 2) {
                            field949.method3136(85);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                        if (arg3 == 3) {
                            field949.method3136(61);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                        if (arg3 == 4) {
                            field949.method3136(149);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                        if (arg3 == 5) {
                            field949.method3136(200);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                        if (arg3 == 6) {
                            field949.method3136(191);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                        if (arg3 == 7) {
                            field949.method3136(98);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                        if (arg3 == 8) {
                            field949.method3136(31);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                        if (arg3 == 9) {
                            field949.method3136(76);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                        if (arg3 == 10) {
                            field949.method3136(108);
                            field949.method2859(arg1);
                            field949.method2857(arg0);
                            field949.method2857(var38);
                        }
                    }
                }
            }
        }
        if (arg2 == 23) {
            if (field1045) {
                Statics.field416.method2515();
            } else {
                Statics.field416.method2480(Statics.field579, arg0, arg1, true);
            }
        }
        if (arg2 == 14) {
            class75 var42 = field1130[arg3];
            if (var42 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(170);
                field949.method2904(Statics.field1485);
                field949.method2857(arg3);
                field949.method2859(Statics.field18);
                field949.method2908(class51.field627[82] ? 1 : 0);
                field949.method2904(Statics.field273);
            }
        }
        if (arg2 == 44) {
            class75 var43 = field1130[arg3];
            if (var43 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(143);
                field949.method2908(class51.field627[82] ? 1 : 0);
                field949.method2932(arg3);
            }
        }
        if (arg2 == 50) {
            class75 var44 = field1130[arg3];
            if (var44 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(93);
                field949.method2897(class51.field627[82] ? 1 : 0);
                field949.method2905(arg3);
            }
        }
        if (arg2 == 46) {
            class75 var45 = field1130[arg3];
            if (var45 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(157);
                field949.method2908(class51.field627[82] ? 1 : 0);
                field949.method2905(arg3);
            }
        }
        if (arg2 == 49) {
            class75 var46 = field1130[arg3];
            if (var46 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(20);
                field949.method2895(class51.field627[82] ? 1 : 0);
                field949.method2857(arg3);
            }
        }
        if (arg2 == 3) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(113);
            field949.method2860(class51.field627[82] ? 1 : 0);
            field949.method2857(Statics.field2316 + arg0);
            field949.method2857(arg3 >> 14 & 0x7FFF);
            field949.method2905(Statics.field265 + arg1);
        }
        if (arg2 == 47) {
            class75 var47 = field1130[arg3];
            if (var47 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(49);
                field949.method2857(arg3);
                field949.method2895(class51.field627[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(5);
            field949.method2857(Statics.field2316 + arg0);
            field949.method2908(class51.field627[82] ? 1 : 0);
            field949.method2904(Statics.field265 + arg1);
            field949.method2905(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(107);
            field949.method2895(class51.field627[82] ? 1 : 0);
            field949.method2857(arg3);
            field949.method2904(Statics.field2316 + arg0);
            field949.method2932(Statics.field265 + arg1);
        }
        if (arg2 == 17) {
            field1014 = arg6;
            field1072 = arg7;
            field1017 = 2;
            field1016 = 0;
            field1115 = arg0;
            field1140 = arg1;
            field949.method3136(177);
            field949.method2932(field1063);
            field949.method2895(class51.field627[82] ? 1 : 0);
            field949.method2932(arg3);
            field949.method2857(Statics.field265 + arg1);
            field949.method2905(Statics.field2316 + arg0);
            field949.method3024(Statics.field551);
        }
        if (arg2 == 10) {
            class87 var48 = field1110[arg3];
            if (var48 != null) {
                field1014 = arg6;
                field1072 = arg7;
                field1017 = 2;
                field1016 = 0;
                field1115 = arg0;
                field1140 = arg1;
                field949.method3136(74);
                field949.method2860(class51.field627[82] ? 1 : 0);
                field949.method2904(arg3);
            }
        }
        if (field1078 != 0) {
            field1078 = 0;
            method632(class217.method921(Statics.field18));
        }
        if (field1062) {
            method968();
        }
        if (Statics.field483 != null && field1018 == 0) {
            method632(Statics.field483);
        }
    }

    @ObfuscatedName("s.ht(ILjava/lang/String;I)V")
    public static void method33(int arg0, String arg1) {
        int var2 = class97.field1500;
        int[] var3 = class97.field1493;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class75 var6 = field1130[var3[var5]];
            if (var6 != null && Statics.field1537 != var6 && var6.field878 != null && var6.field878.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field949.method3136(143);
                    field949.method2908(0);
                    field949.method2932(var3[var5]);
                } else if (arg0 == 4) {
                    field949.method3136(49);
                    field949.method2857(var3[var5]);
                    field949.method2895(0);
                } else if (arg0 == 6) {
                    field949.method3136(20);
                    field949.method2895(0);
                    field949.method2857(var3[var5]);
                } else if (arg0 == 7) {
                    field949.method3136(93);
                    field949.method2897(0);
                    field949.method2905(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method973(4, "", class226.field3009 + arg1);
        }
    }

    @ObfuscatedName("bt.hg(I)V")
    public static void method968() {
        if (!field1062) {
            return;
        }
        class217 var0 = class217.method63(Statics.field551, field1063);
        if (var0 != null && var0.field2746 != null) {
            class70 var1 = new class70();
            var1.field831 = var0;
            var1.field840 = var0.field2746;
            class84.method1537(var1);
        }
        field1062 = false;
        method632(var0);
    }

    @ObfuscatedName("aj.hi(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method463(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2755(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("fz.hk(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method2755(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1045 || field1038 >= 500) {
            return;
        }
        field1147[field1038] = arg0;
        field1123[field1038] = arg1;
        field985[field1038] = arg2;
        field1050[field1038] = arg3;
        field1001[field1038] = arg4;
        field954[field1038] = arg5;
        if (arg6) {
            field941 = field1038;
        }
        field1038++;
    }

    @ObfuscatedName("ew.hq(S)I")
    public static final int method2364() {
        if (field1038 <= 0) {
            return -1;
        } else if (field1055 && class51.field627[81] && field941 != -1) {
            return field941;
        } else {
            return field1038 - 1;
        }
    }

    @ObfuscatedName("ag.hw(I)V")
    public static void method450() {
        for (int var0 = 0; var0 < field1038; var0++) {
            if (method2635(field985[var0])) {
                if (var0 < field1038 - 1) {
                    for (int var1 = var0; var1 < field1038 - 1; var1++) {
                        field1147[var1] = field1147[var1 + 1];
                        field1123[var1] = field1123[var1 + 1];
                        field985[var1] = field985[var1 + 1];
                        field1050[var1] = field1050[var1 + 1];
                        field1001[var1] = field1001[var1 + 1];
                        field954[var1] = field954[var1 + 1];
                    }
                }
                field1038--;
            }
        }
    }

    @ObfuscatedName("eu.hb(II)Z")
    public static boolean method2635(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ac.hz(IIIII)V")
    public static final void method663(int arg0, int arg1, int arg2, int arg3) {
        if (field1078 == 0 && !field1062) {
            method463(class226.field3015, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class135.field1996; var6++) {
            int var7 = class135.field1989[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field416.method2520(Statics.field579, var8, var9, var7) >= 0) {
                    class256 var12 = class256.method3652(var11);
                    if (var12.field3476 != null) {
                        var12 = var12.method4144();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1078 == 1) {
                        method463(class226.field3010, field1159 + " " + class89.field1390 + " " + class89.method596(65535) + var12.field3448, 1, var7, var8, var9);
                    } else if (!field1062) {
                        String[] var13 = var12.field3462;
                        if (field1027) {
                            var13 = method445(var13);
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
                                    method463(var13[var14], class89.method596(65535) + var12.field3448, var15, var7, var8, var9);
                                }
                            }
                        }
                        method463(class226.field3011, class89.method596(65535) + var12.field3448, 1002, var12.field3483 << 14, var8, var9);
                    } else if ((Statics.field1677 & 0x4) == 4) {
                        method463(field1065, field1020 + " " + class89.field1390 + " " + class89.method596(65535) + var12.field3448, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class87 var16 = field1110[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1368.field3558 == 1 && (var16.field1233 & 0x7F) == 64 && (var16.field1265 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field945; var17++) {
                            class87 var18 = field1110[field946[var17]];
                            if (var18 != null && var16 != var18 && var18.field1368.field3558 == 1 && var16.field1233 == var18.field1233 && var16.field1265 == var18.field1265) {
                                method58(var18.field1368, field946[var17], var8, var9);
                            }
                        }
                        int var19 = class97.field1500;
                        int[] var20 = class97.field1493;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class75 var22 = field1130[var20[var21]];
                            if (var22 != null && var16.field1233 == var22.field1233 && var16.field1265 == var22.field1265) {
                                method1500(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method58(var16.field1368, var11, var8, var9);
                }
                if (var10 == 0) {
                    class75 var23 = field1130[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1233 & 0x7F) == 64 && (var23.field1265 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field945; var24++) {
                            class87 var25 = field1110[field946[var24]];
                            if (var25 != null && var25.field1368.field3558 == 1 && var23.field1233 == var25.field1233 && var23.field1265 == var25.field1265) {
                                method58(var25.field1368, field946[var24], var8, var9);
                            }
                        }
                        int var26 = class97.field1500;
                        int[] var27 = class97.field1493;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class75 var29 = field1130[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1233 == var29.field1233 && var23.field1265 == var29.field1265) {
                                method1500(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field926 == var11) {
                        var4 = var7;
                    } else {
                        method1500(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class194 var30 = field1037[Statics.field579][var8][var9];
                    if (var30 != null) {
                        for (class95 var31 = (class95) var30.method3336(); var31 != null; var31 = (class95) var30.method3328()) {
                            class257 var32 = class257.method1498(var31.field1482);
                            if (field1078 == 1) {
                                method463(class226.field3010, field1159 + " " + class89.field1390 + " " + class89.method596(16748608) + var32.field3499, 16, var31.field1482, var8, var9);
                            } else if (!field1062) {
                                String[] var33 = var32.field3513;
                                if (field1027) {
                                    var33 = method445(var33);
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
                                        method463(var33[var34], class89.method596(16748608) + var32.field3499, var35, var31.field1482, var8, var9);
                                    } else if (var34 == 2) {
                                        method463(class226.field2861, class89.method596(16748608) + var32.field3499, 20, var31.field1482, var8, var9);
                                    }
                                }
                                method463(class226.field3011, class89.method596(16748608) + var32.field3499, 1004, var31.field1482, var8, var9);
                            } else if ((Statics.field1677 & 0x1) == 1) {
                                method463(field1065, field1020 + " " + class89.field1390 + " " + class89.method596(16748608) + var32.field3499, 17, var31.field1482, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class75 var38 = field1130[field926];
            method1500(var38, field926, var36, var37);
        }
    }

    @ObfuscatedName("g.ho(Lip;IIII)V")
    public static final void method58(class259 arg0, int arg1, int arg2, int arg3) {
        if (field1038 >= 400) {
            return;
        }
        if (arg0.field3567 != null) {
            arg0 = arg0.method4241();
        }
        if (arg0 == null || !arg0.field3585 || arg0.field3587 && field1075 != arg1) {
            return;
        }
        String var4 = arg0.field3557;
        if (arg0.field3574 != 0) {
            int var6 = arg0.field3574;
            int var7 = Statics.field1537.field874;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class89.method596(16711680);
            } else if (var8 < -6) {
                var9 = class89.method596(16723968);
            } else if (var8 < -3) {
                var9 = class89.method596(16740352);
            } else if (var8 < 0) {
                var9 = class89.method596(16756736);
            } else if (var8 > 9) {
                var9 = class89.method596(65280);
            } else if (var8 > 6) {
                var9 = class89.method596(4259584);
            } else if (var8 > 3) {
                var9 = class89.method596(8453888);
            } else if (var8 > 0) {
                var9 = class89.method596(12648192);
            } else {
                var9 = class89.method596(16776960);
            }
            var4 = var4 + var9 + " " + class89.field1398 + class226.field3016 + arg0.field3574 + class89.field1394;
        }
        if (arg0.field3587 && field1053) {
            method463(class226.field3011, class89.method596(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1078 == 1) {
            method463(class226.field3010, field1159 + " " + class89.field1390 + " " + class89.method596(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1062) {
            int var10 = arg0.field3587 && field1053 ? 2000 : 0;
            String[] var11 = arg0.field3572;
            if (field1027) {
                var11 = method445(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class226.field2948)) {
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
                        method463(var11[var12], class89.method596(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class226.field2948)) {
                        short var15 = 0;
                        if (field933 != class92.field1410) {
                            if (field933 == class92.field1417 || field933 == class92.field1411 && arg0.field3574 > Statics.field1537.field874) {
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
                            method463(var11[var14], class89.method596(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3587 || !field1053) {
                method463(class226.field3011, class89.method596(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1677 & 0x2) == 2) {
            method463(field1065, field1020 + " " + class89.field1390 + " " + class89.method596(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cy.hs(Lbe;IIII)V")
    public static final void method1500(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1537 == arg0 || field1038 >= 400) {
            return;
        }
        String var9;
        if (arg0.field875 == 0) {
            String var4 = arg0.field873[0] + arg0.field878 + arg0.field873[1];
            int var5 = arg0.field874;
            int var6 = Statics.field1537.field874;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class89.method596(16711680);
            } else if (var7 < -6) {
                var8 = class89.method596(16723968);
            } else if (var7 < -3) {
                var8 = class89.method596(16740352);
            } else if (var7 < 0) {
                var8 = class89.method596(16756736);
            } else if (var7 > 9) {
                var8 = class89.method596(65280);
            } else if (var7 > 6) {
                var8 = class89.method596(4259584);
            } else if (var7 > 3) {
                var8 = class89.method596(8453888);
            } else if (var7 > 0) {
                var8 = class89.method596(12648192);
            } else {
                var8 = class89.method596(16776960);
            }
            var9 = var4 + var8 + " " + class89.field1398 + class226.field3016 + arg0.field874 + class89.field1394 + arg0.field873[2];
        } else {
            var9 = arg0.field873[0] + arg0.field878 + arg0.field873[1] + " " + class89.field1398 + class226.field3017 + arg0.field875 + class89.field1394 + arg0.field873[2];
        }
        if (field1078 == 1) {
            method463(class226.field3010, field1159 + " " + class89.field1390 + " " + class89.method596(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1062) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field1129[var10] != null) {
                    short var11 = 0;
                    if (field1129[var10].equalsIgnoreCase(class226.field2948)) {
                        if (field932 == class92.field1410) {
                            continue;
                        }
                        if (field932 == class92.field1417 || field932 == class92.field1411 && arg0.field874 > Statics.field1537.field874) {
                            var11 = 2000;
                        }
                        if (Statics.field1537.field888 != 0 && arg0.field888 != 0) {
                            if (Statics.field1537.field888 == arg0.field888) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1034[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1032[var10] + var11;
                    method463(field1129[var10], class89.method596(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1677 & 0x8) == 8) {
            method463(field1065, field1020 + " " + class89.field1390 + " " + class89.method596(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1038; var14++) {
            if (field985[var14] == 23) {
                field1123[var14] = class89.method596(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("eq.in(IIIIIIIII)V")
    public static final void method2369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method315(arg0)) {
            Statics.field2509 = null;
            method2641(Statics.field2642[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2509 != null) {
                method2641(Statics.field2509, -1412584499, arg1, arg2, arg3, arg4, Statics.field847, Statics.field580, arg7);
                Statics.field2509 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1112[var8] = true;
            }
        } else {
            field1112[arg7] = true;
        }
    }

    @ObfuscatedName("et.if([Lhy;IIIIIIIIS)V")
    public static final void method2641(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class282.method4507(arg2, arg3, arg4, arg5);
        class137.method2371();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2673 == arg1 || arg1 == -1412584499 && field1080 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1099[field1007] = var10.field2667 + arg6;
                    field960[field1007] = var10.field2647 + arg7;
                    field1117[field1007] = var10.field2669;
                    field1118[field1007] = var10.field2694;
                    var11 = ++field1007 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2785 = var11;
                var10.field2689 = field934;
                if (!var10.field2726 || !method1538(var10)) {
                    if (var10.field2658 > 0) {
                        method143(var10);
                    }
                    int var12 = var10.field2667 + arg6;
                    int var13 = var10.field2647 + arg7;
                    int var14 = var10.field2682;
                    if (field1080 == var10) {
                        if (arg1 != -1412584499 && !var10.field2732) {
                            Statics.field2509 = arg0;
                            Statics.field847 = arg6;
                            Statics.field580 = arg7;
                            continue;
                        }
                        if (field1175 && field1085) {
                            int var15 = class60.field723;
                            int var16 = class60.field724 * -90084053;
                            int var17 = var15 - field1082;
                            int var18 = var16 - field1083;
                            if (var17 < field1086) {
                                var17 = field1086;
                            }
                            if (var10.field2669 + var17 > field1086 + field921.field2669) {
                                var17 = field1086 + field921.field2669 - var10.field2669;
                            }
                            if (var18 < field1138) {
                                var18 = field1138;
                            }
                            if (var10.field2694 + var18 > field1138 + field921.field2694) {
                                var18 = field1138 + field921.field2694 - var10.field2694;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2732) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2656 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2656 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2669 + var12;
                        int var26 = var10.field2694 + var13;
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
                        int var29 = var10.field2669 + var12;
                        int var30 = var10.field2694 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2726 || var19 < var21 && var20 < var22) {
                        if (var10.field2658 != 0) {
                            if (var10.field2658 == 1336) {
                                if (field922) {
                                    var13 += 15;
                                    Statics.field33.method4347("Fps:" + field689, var10.field2669 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field912) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field912) {
                                        var33 = 16711680;
                                    }
                                    Statics.field33.method4347("Mem:" + var32 + "k", var10.field2669 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2658 == 1337) {
                                field1056 = var12;
                                field916 = var13;
                                method965(var12, var13, var10.field2669, var10.field2694);
                                field1112[var10.field2785] = true;
                                class282.method4507(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2658 == 1338) {
                                method622();
                                class211 var34 = var10.method3670(false);
                                if (var34 != null) {
                                    class282.method4507(var12, var13, var34.field2601 + var12, var34.field2600 + var13);
                                    if (field1141 == 2 || field1141 == 5) {
                                        class282.method4529(var12, var13, 0, var34.field2603, var34.field2602);
                                    } else {
                                        int var35 = field991 + field978 & 0x7FF;
                                        int var36 = Statics.field1537.field1233 / 32 + 48;
                                        int var37 = 464 - Statics.field1537.field1265 / 32;
                                        Statics.field2834.method4652(var12, var13, var34.field2601, var34.field2600, var36, var37, var35, field980 + 256, var34.field2603, var34.field2602);
                                        for (int var38 = 0; var38 < field1135; var38++) {
                                            int var39 = field1136[var38] * 4 + 2 - Statics.field1537.field1233 / 32;
                                            int var40 = field1137[var38] * 4 + 2 - Statics.field1537.field1265 / 32;
                                            method19(var12, var13, var39, var40, field1036[var38], var34);
                                        }
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= 104) {
                                                for (int var46 = 0; var46 < field945; var46++) {
                                                    class87 var47 = field1110[field946[var46]];
                                                    if (var47 != null && var47.method1001()) {
                                                        class259 var48 = var47.field1368;
                                                        if (var48 != null && var48.field3567 != null) {
                                                            var48 = var48.method4241();
                                                        }
                                                        if (var48 != null && var48.field3555 && var48.field3585) {
                                                            int var49 = var47.field1233 / 32 - Statics.field1537.field1233 / 32;
                                                            int var50 = var47.field1265 / 32 - Statics.field1537.field1265 / 32;
                                                            method19(var12, var13, var49, var50, Statics.field2310[1], var34);
                                                        }
                                                    }
                                                }
                                                int var51 = class97.field1500;
                                                int[] var52 = class97.field1493;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    class75 var54 = field1130[var52[var53]];
                                                    if (var54 != null && var54.method1001() && !var54.field889 && Statics.field1537 != var54) {
                                                        int var55 = var54.field1233 / 32 - Statics.field1537.field1233 / 32;
                                                        int var56 = var54.field1265 / 32 - Statics.field1537.field1265 / 32;
                                                        boolean var57 = false;
                                                        if (method189(var54.field878, true)) {
                                                            var57 = true;
                                                        }
                                                        boolean var58 = false;
                                                        for (int var59 = 0; var59 < Statics.field2233; var59++) {
                                                            if (var54.field878.equals(Statics.field571[var59].field904)) {
                                                                var58 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var60 = false;
                                                        if (Statics.field1537.field888 != 0 && var54.field888 != 0 && Statics.field1537.field888 == var54.field888) {
                                                            var60 = true;
                                                        }
                                                        if (var57) {
                                                            method19(var12, var13, var55, var56, Statics.field2310[3], var34);
                                                        } else if (var60) {
                                                            method19(var12, var13, var55, var56, Statics.field2310[4], var34);
                                                        } else if (var58) {
                                                            method19(var12, var13, var55, var56, Statics.field2310[5], var34);
                                                        } else {
                                                            method19(var12, var13, var55, var56, Statics.field2310[2], var34);
                                                        }
                                                    }
                                                }
                                                if (field1121 != 0 && field934 % 20 < 10) {
                                                    if (field1121 == 1 && field925 >= 0 && field925 < field1110.length) {
                                                        class87 var61 = field1110[field925];
                                                        if (var61 != null) {
                                                            int var62 = var61.field1233 / 32 - Statics.field1537.field1233 / 32;
                                                            int var63 = var61.field1265 / 32 - Statics.field1537.field1265 / 32;
                                                            method1579(var12, var13, var62, var63, Statics.field800[1], var34);
                                                        }
                                                    }
                                                    if (field1121 == 2) {
                                                        int var64 = field927 * 4 - Statics.field2316 * 4 + 2 - Statics.field1537.field1233 / 32;
                                                        int var65 = field908 * 4 - Statics.field265 * 4 + 2 - Statics.field1537.field1265 / 32;
                                                        method1579(var12, var13, var64, var65, Statics.field800[1], var34);
                                                    }
                                                    if (field1121 == 10 && field928 >= 0 && field928 < field1130.length) {
                                                        class75 var66 = field1130[field928];
                                                        if (var66 != null) {
                                                            int var67 = var66.field1233 / 32 - Statics.field1537.field1233 / 32;
                                                            int var68 = var66.field1265 / 32 - Statics.field1537.field1265 / 32;
                                                            method1579(var12, var13, var67, var68, Statics.field800[1], var34);
                                                        }
                                                    }
                                                }
                                                if (field1115 != 0) {
                                                    int var69 = field1115 * 4 + 2 - Statics.field1537.field1233 / 32;
                                                    int var70 = field1140 * 4 + 2 - Statics.field1537.field1265 / 32;
                                                    method19(var12, var13, var69, var70, Statics.field800[0], var34);
                                                }
                                                if (!Statics.field1537.field889) {
                                                    class282.method4582(var34.field2601 / 2 + var12 - 1, var34.field2600 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                class194 var43 = field1037[Statics.field579][var41][var42];
                                                if (var43 != null) {
                                                    int var44 = var41 * 4 + 2 - Statics.field1537.field1233 / 32;
                                                    int var45 = var42 * 4 + 2 - Statics.field1537.field1265 / 32;
                                                    method19(var12, var13, var44, var45, Statics.field2310[0], var34);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    field1113[var11] = true;
                                }
                                class282.method4507(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2658 == 1339) {
                                method668(var10, var12, var13, var11);
                                class282.method4507(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2658 == 1400) {
                                Statics.field276.method4774(var12, var13, var10.field2669, var10.field2694, field934);
                            }
                            if (var10.field2658 == 1401) {
                                Statics.field276.method4775(var12, var13, var10.field2669, var10.field2694);
                            }
                        }
                        if (var10.field2656 == 0) {
                            if (!var10.field2726 && method1538(var10) && Statics.field309 != var10) {
                                continue;
                            }
                            if (!var10.field2726) {
                                if (var10.field2680 > var10.field2715 - var10.field2694) {
                                    var10.field2680 = var10.field2715 - var10.field2694;
                                }
                                if (var10.field2680 < 0) {
                                    var10.field2680 = 0;
                                }
                            }
                            method2641(arg0, var10.field2654, var19, var20, var21, var22, var12 - var10.field2675, var13 - var10.field2680, var11);
                            if (var10.field2744 != null) {
                                method2641(var10.field2744, var10.field2654, var19, var20, var21, var22, var12 - var10.field2675, var13 - var10.field2680, var11);
                            }
                            class69 var71 = (class69) field1068.method3264((long) var10.field2654);
                            if (var71 != null) {
                                method2369(var71.field826, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class282.method4507(arg2, arg3, arg4, arg5);
                            class137.method2371();
                        }
                        if (field1151 || field939[var11] || field1119 > 1) {
                            if (var10.field2656 == 0 && !var10.field2726 && var10.field2715 > var10.field2694) {
                                method3699(var10.field2669 + var12, var13, var10.field2680, var10.field2694, var10.field2715);
                            }
                            if (var10.field2656 != 1) {
                                if (var10.field2656 == 2) {
                                    int var72 = 0;
                                    for (int var73 = 0; var73 < var10.field2737; var73++) {
                                        for (int var74 = 0; var74 < var10.field2665; var74++) {
                                            int var75 = (var10.field2720 + 32) * var74 + var12;
                                            int var76 = (var10.field2721 + 32) * var73 + var13;
                                            if (var72 < 20) {
                                                var75 += var10.field2771[var72];
                                                var76 += var10.field2723[var72];
                                            }
                                            if (var10.field2772[var72] > 0) {
                                                boolean var77 = false;
                                                boolean var78 = false;
                                                int var79 = var10.field2772[var72] - 1;
                                                if (var75 + 32 > arg2 && var75 < arg4 && var76 + 32 > arg3 && var76 < arg5 || Statics.field842 == var10 && field944 == var72) {
                                                    class286 var80;
                                                    if (field1078 == 1 && Statics.field273 == var72 && Statics.field18 == var10.field2654) {
                                                        var80 = class257.method2656(var79, var10.field2763[var72], 2, 0, 2, false);
                                                    } else {
                                                        var80 = class257.method2656(var79, var10.field2763[var72], 1, 3153952, 2, false);
                                                    }
                                                    if (var80 == null) {
                                                        method632(var10);
                                                    } else if (Statics.field842 == var10 && field944 == var72) {
                                                        int var81 = class60.field723 - field1033;
                                                        int var82 = class60.field724 * -90084053 - field1022;
                                                        if (var81 < 5 && var81 > -5) {
                                                            var81 = 0;
                                                        }
                                                        if (var82 < 5 && var82 > -5) {
                                                            var82 = 0;
                                                        }
                                                        if (field1052 < 5) {
                                                            var81 = 0;
                                                            var82 = 0;
                                                        }
                                                        var80.method4640(var75 + var81, var76 + var82, 128);
                                                        if (arg1 != -1) {
                                                            class217 var83 = arg0[arg1 & 0xFFFF];
                                                            if (var76 + var82 < class282.field3758 && var83.field2680 > 0) {
                                                                int var84 = field983 * (class282.field3758 - var76 - var82) / 3;
                                                                if (var84 > field983 * 10) {
                                                                    var84 = field983 * 10;
                                                                }
                                                                if (var84 > var83.field2680) {
                                                                    var84 = var83.field2680;
                                                                }
                                                                var83.field2680 -= var84;
                                                                field1022 += var84;
                                                                method632(var83);
                                                            }
                                                            if (var76 + var82 + 32 > class282.field3760 && var83.field2680 < var83.field2715 - var83.field2694) {
                                                                int var85 = field983 * (var76 + var82 + 32 - class282.field3760) / 3;
                                                                if (var85 > field983 * 10) {
                                                                    var85 = field983 * 10;
                                                                }
                                                                if (var85 > var83.field2715 - var83.field2694 - var83.field2680) {
                                                                    var85 = var83.field2715 - var83.field2694 - var83.field2680;
                                                                }
                                                                var83.field2680 += var85;
                                                                field1022 -= var85;
                                                                method632(var83);
                                                            }
                                                        }
                                                    } else if (Statics.field483 == var10 && field1049 == var72) {
                                                        var80.method4640(var75, var76, 128);
                                                    } else {
                                                        var80.method4683(var75, var76);
                                                    }
                                                }
                                            } else if (var10.field2724 != null && var72 < 20) {
                                                class286 var86 = var10.method3666(var72);
                                                if (var86 != null) {
                                                    var86.method4683(var75, var76);
                                                } else if (class217.field2760) {
                                                    method632(var10);
                                                }
                                            }
                                            var72++;
                                        }
                                    }
                                } else if (var10.field2656 == 3) {
                                    int var87;
                                    if (method1855(var10)) {
                                        var87 = var10.field2704;
                                        if (Statics.field309 == var10 && var10.field2646 != 0) {
                                            var87 = var10.field2646;
                                        }
                                    } else {
                                        var87 = var10.field2679;
                                        if (Statics.field309 == var10 && var10.field2681 != 0) {
                                            var87 = var10.field2681;
                                        }
                                    }
                                    if (var10.field2683) {
                                        switch(var10.field2684.field3771) {
                                            case 1:
                                                class282.method4516(var12, var13, var10.field2669, var10.field2694, var10.field2679, var10.field2704, 256 - (var10.field2682 & 0xFF), 256 - (var10.field2709 & 0xFF));
                                                break;
                                            case 2:
                                                class282.method4517(var12, var13, var10.field2669, var10.field2694, var10.field2679, var10.field2704, 256 - (var10.field2682 & 0xFF), 256 - (var10.field2709 & 0xFF));
                                                break;
                                            case 3:
                                                class282.method4584(var12, var13, var10.field2669, var10.field2694, var10.field2679, var10.field2704, 256 - (var10.field2682 & 0xFF), 256 - (var10.field2709 & 0xFF));
                                                break;
                                            case 4:
                                                class282.method4518(var12, var13, var10.field2669, var10.field2694, var10.field2679, var10.field2704, 256 - (var10.field2682 & 0xFF), 256 - (var10.field2709 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class282.method4582(var12, var13, var10.field2669, var10.field2694, var87);
                                                } else {
                                                    class282.method4514(var12, var13, var10.field2669, var10.field2694, var87, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class282.method4563(var12, var13, var10.field2669, var10.field2694, var87);
                                    } else {
                                        class282.method4553(var12, var13, var10.field2669, var10.field2694, var87, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2656 == 4) {
                                    class264 var88 = var10.method3667();
                                    if (var88 != null) {
                                        String var89 = var10.field2678;
                                        int var90;
                                        if (method1855(var10)) {
                                            var90 = var10.field2704;
                                            if (Statics.field309 == var10 && var10.field2646 != 0) {
                                                var90 = var10.field2646;
                                            }
                                            if (var10.field2687.length() > 0) {
                                                var89 = var10.field2687;
                                            }
                                        } else {
                                            var90 = var10.field2679;
                                            if (Statics.field309 == var10 && var10.field2681 != 0) {
                                                var90 = var10.field2681;
                                            }
                                        }
                                        if (var10.field2726 && var10.field2774 != -1) {
                                            class257 var91 = class257.method1498(var10.field2774);
                                            var89 = var91.field3499;
                                            if (var89 == null) {
                                                var89 = "null";
                                            }
                                            if ((var91.field3510 == 1 || var10.field2699 != 1) && var10.field2699 != -1) {
                                                var89 = class89.method596(16748608) + var89 + class89.field1393 + " " + 'x' + method713(var10.field2699);
                                            }
                                        }
                                        if (field1071 == var10) {
                                            class226 var10000 = (class226) null;
                                            var89 = class226.field3018;
                                            var90 = var10.field2679;
                                        }
                                        if (!var10.field2726) {
                                            var89 = method986(var89, var10);
                                        }
                                        var88.method4349(var89, var12, var13, var10.field2669, var10.field2694, var90, var10.field2768 ? 0 : -1, var10.field2717, var10.field2750, var10.field2652);
                                    } else if (class217.field2760) {
                                        method632(var10);
                                    }
                                } else if (var10.field2656 == 5) {
                                    if (var10.field2726) {
                                        class286 var93;
                                        if (var10.field2774 == -1) {
                                            var93 = var10.method3701(false);
                                        } else {
                                            var93 = class257.method2656(var10.field2774, var10.field2699, var10.field2693, var10.field2666, var10.field2712, false);
                                        }
                                        if (var93 != null) {
                                            int var94 = var93.field3786;
                                            int var95 = var93.field3784;
                                            if (var10.field2692) {
                                                class282.method4508(var12, var13, var10.field2669 + var12, var10.field2694 + var13);
                                                int var96 = (var10.field2669 + (var94 - 1)) / var94;
                                                int var97 = (var10.field2694 + (var95 - 1)) / var95;
                                                for (int var98 = 0; var98 < var96; var98++) {
                                                    for (int var99 = 0; var99 < var97; var99++) {
                                                        if (var10.field2691 != 0) {
                                                            var93.method4674(var94 / 2 + var94 * var98 + var12, var95 / 2 + var95 * var99 + var13, var10.field2691, 4096);
                                                        } else if (var14 == 0) {
                                                            var93.method4683(var94 * var98 + var12, var95 * var99 + var13);
                                                        } else {
                                                            var93.method4640(var94 * var98 + var12, var95 * var99 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class282.method4507(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var100 = var10.field2669 * 4096 / var94;
                                                if (var10.field2691 != 0) {
                                                    var93.method4674(var10.field2669 / 2 + var12, var10.field2694 / 2 + var13, var10.field2691, var100);
                                                } else if (var14 != 0) {
                                                    var93.method4621(var12, var13, var10.field2669, var10.field2694, 256 - (var14 & 0xFF));
                                                } else if (var10.field2669 == var94 && var10.field2694 == var95) {
                                                    var93.method4683(var12, var13);
                                                } else {
                                                    var93.method4681(var12, var13, var10.field2669, var10.field2694);
                                                }
                                            }
                                        } else if (class217.field2760) {
                                            method632(var10);
                                        }
                                    } else {
                                        class286 var92 = var10.method3701(method1855(var10));
                                        if (var92 != null) {
                                            var92.method4683(var12, var13);
                                        } else if (class217.field2760) {
                                            method632(var10);
                                        }
                                    }
                                } else if (var10.field2656 == 6) {
                                    boolean var101 = method1855(var10);
                                    int var102;
                                    if (var101) {
                                        var102 = var10.field2702;
                                    } else {
                                        var102 = var10.field2778;
                                    }
                                    class134 var103 = null;
                                    int var104 = 0;
                                    if (var10.field2774 != -1) {
                                        class257 var105 = class257.method1498(var10.field2774);
                                        if (var105 != null) {
                                            class257 var106 = var105.method4185(var10.field2699);
                                            var103 = var106.method4184(1);
                                            if (var103 == null) {
                                                method632(var10);
                                            } else {
                                                var103.method2319();
                                                var104 = var103.field2119 / 2;
                                            }
                                        }
                                    } else if (var10.field2697 == 5) {
                                        if (var10.field2698 == 0) {
                                            var103 = field1178.method3630((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var103 = Statics.field1537.method1018();
                                        }
                                    } else if (var102 == -1) {
                                        var103 = var10.method3669((class261) null, -1, var101, Statics.field1537.field869);
                                        if (var103 == null && class217.field2760) {
                                            method632(var10);
                                        }
                                    } else {
                                        class261 var107 = class261.method1884(var102);
                                        var103 = var10.method3669(var107, var10.field2773, var101, Statics.field1537.field869);
                                        if (var103 == null && class217.field2760) {
                                            method632(var10);
                                        }
                                    }
                                    class137.method2376(var10.field2669 / 2 + var12, var10.field2694 / 2 + var13);
                                    int var108 = var10.field2708 * class137.field2009[var10.field2705] >> 16;
                                    int var109 = var10.field2708 * class137.field2035[var10.field2705] >> 16;
                                    if (var103 != null) {
                                        if (var10.field2726) {
                                            var103.method2319();
                                            if (var10.field2688) {
                                                var103.method2290(0, var10.field2706, var10.field2707, var10.field2705, var10.field2703, var10.field2671 + var104 + var108, var10.field2671 + var109, var10.field2708);
                                            } else {
                                                var103.method2289(0, var10.field2706, var10.field2707, var10.field2705, var10.field2703, var10.field2671 + var104 + var108, var10.field2671 + var109);
                                            }
                                        } else {
                                            var103.method2289(0, var10.field2706, 0, var10.field2705, 0, var108, var109);
                                        }
                                    }
                                    class137.method2373();
                                } else {
                                    if (var10.field2656 == 7) {
                                        class264 var110 = var10.method3667();
                                        if (var110 == null) {
                                            if (class217.field2760) {
                                                method632(var10);
                                            }
                                            continue;
                                        }
                                        int var111 = 0;
                                        for (int var112 = 0; var112 < var10.field2737; var112++) {
                                            for (int var113 = 0; var113 < var10.field2665; var113++) {
                                                if (var10.field2772[var111] > 0) {
                                                    class257 var114 = class257.method1498(var10.field2772[var111] - 1);
                                                    String var115;
                                                    if (var114.field3510 != 1 && var10.field2763[var111] == 1) {
                                                        var115 = class89.method596(16748608) + var114.field3499 + class89.field1393;
                                                    } else {
                                                        var115 = class89.method596(16748608) + var114.field3499 + class89.field1393 + " " + 'x' + method713(var10.field2763[var111]);
                                                    }
                                                    int var116 = (var10.field2720 + 115) * var113 + var12;
                                                    int var117 = (var10.field2721 + 12) * var112 + var13;
                                                    if (var10.field2717 == 0) {
                                                        var110.method4387(var115, var116, var117, var10.field2679, var10.field2768 ? 0 : -1);
                                                    } else if (var10.field2717 == 1) {
                                                        var110.method4396(var115, var10.field2669 / 2 + var116, var117, var10.field2679, var10.field2768 ? 0 : -1);
                                                    } else {
                                                        var110.method4347(var115, var10.field2669 + var116 - 1, var117, var10.field2679, var10.field2768 ? 0 : -1);
                                                    }
                                                }
                                                var111++;
                                            }
                                        }
                                    }
                                    if (var10.field2656 == 8 && Statics.field484 == var10 && field1184 == field1133) {
                                        int var118 = 0;
                                        int var119 = 0;
                                        class264 var120 = Statics.field33;
                                        String var121 = var10.field2678;
                                        String var122 = method986(var121, var10);
                                        while (var122.length() > 0) {
                                            int var123 = var122.indexOf(class89.field1396);
                                            String var124;
                                            if (var123 == -1) {
                                                var124 = var122;
                                                var122 = "";
                                            } else {
                                                var124 = var122.substring(0, var123);
                                                var122 = var122.substring(var123 + 4);
                                            }
                                            int var125 = var120.method4383(var124);
                                            if (var125 > var118) {
                                                var118 = var125;
                                            }
                                            var119 += var120.field3638 + 1;
                                        }
                                        var118 += 6;
                                        var119 += 7;
                                        int var126 = var10.field2669 + var12 - 5 - var118;
                                        int var127 = var10.field2694 + var13 + 5;
                                        if (var126 < var12 + 5) {
                                            var126 = var12 + 5;
                                        }
                                        if (var118 + var126 > arg4) {
                                            var126 = arg4 - var118;
                                        }
                                        if (var119 + var127 > arg5) {
                                            var127 = arg5 - var119;
                                        }
                                        class282.method4582(var126, var127, var118, var119, 16777120);
                                        class282.method4563(var126, var127, var118, var119, 0);
                                        String var128 = var10.field2678;
                                        int var129 = var120.field3638 + var127 + 2;
                                        String var130 = method986(var128, var10);
                                        while (var130.length() > 0) {
                                            int var131 = var130.indexOf(class89.field1396);
                                            String var132;
                                            if (var131 == -1) {
                                                var132 = var130;
                                                var130 = "";
                                            } else {
                                                var132 = var130.substring(0, var131);
                                                var130 = var130.substring(var131 + 4);
                                            }
                                            var120.method4387(var132, var126 + 3, var129, 0, -1);
                                            var129 += var120.field3638 + 1;
                                        }
                                    }
                                    if (var10.field2656 == 9) {
                                        int var133;
                                        int var134;
                                        int var135;
                                        int var136;
                                        if (var10.field2722) {
                                            var133 = var12;
                                            var134 = var10.field2694 + var13;
                                            var135 = var10.field2669 + var12;
                                            var136 = var13;
                                        } else {
                                            var133 = var12;
                                            var134 = var13;
                                            var135 = var10.field2669 + var12;
                                            var136 = var10.field2694 + var13;
                                        }
                                        if (var10.field2644 == 1) {
                                            class282.method4528(var133, var134, var135, var136, var10.field2679);
                                        } else {
                                            int var139 = var10.field2679;
                                            int var140 = var10.field2644;
                                            int var141 = var135 - var133;
                                            int var142 = var136 - var134;
                                            int var143 = var141 >= 0 ? var141 : -var141;
                                            int var144 = var142 >= 0 ? var142 : -var142;
                                            int var145 = var143;
                                            if (var143 < var144) {
                                                var145 = var144;
                                            }
                                            if (var145 != 0) {
                                                int var146 = (var141 << 16) / var145;
                                                int var147 = (var142 << 16) / var145;
                                                if (var147 <= var146) {
                                                    var146 = -var146;
                                                } else {
                                                    var147 = -var147;
                                                }
                                                int var148 = var140 * var147 >> 17;
                                                int var149 = var140 * var147 + 1 >> 17;
                                                int var150 = var140 * var146 >> 17;
                                                int var151 = var140 * var146 + 1 >> 17;
                                                int var152 = var133 - class282.field3761;
                                                int var153 = var134 - class282.field3758;
                                                int var154 = var148 + var152;
                                                int var155 = var152 - var149;
                                                int var156 = var141 + var152 - var149;
                                                int var157 = var141 + var152 + var148;
                                                int var158 = var150 + var153;
                                                int var159 = var153 - var151;
                                                int var160 = var142 + var153 - var151;
                                                int var161 = var142 + var153 + var150;
                                                class137.method2391(var154, var155, var156);
                                                class137.method2388(var158, var159, var160, var154, var155, var156, var139);
                                                class137.method2391(var154, var156, var157);
                                                class137.method2388(var158, var160, var161, var154, var156, var157, var139);
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

    @ObfuscatedName("bq.il(Ljava/lang/String;Lhy;I)Ljava/lang/String;")
    public static String method986(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method5(arg1, var2 - 1);
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
                if (Statics.field245 != null) {
                    var8 = class271.method3758(Statics.field245.field2223);
                    if (Statics.field245.field2225 != null) {
                        var8 = (String) Statics.field245.field2225;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bl.ig(IB)Ljava/lang/String;")
    public static final String method713(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1391 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method596(65408) + var1.substring(0, var1.length() - 8) + class226.field3021 + " " + class89.field1398 + var1 + class89.field1394 + class89.field1393;
        } else if (var1.length() > 6) {
            return " " + class89.method596(16777215) + var1.substring(0, var1.length() - 4) + class226.field3023 + " " + class89.field1398 + var1 + class89.field1394 + class89.field1393;
        } else {
            return " " + class89.method596(16776960) + var1 + class89.field1393;
        }
    }

    @ObfuscatedName("client.iw(ZI)V")
    public final void method1038(boolean arg0) {
        int var2 = field1019;
        int var3 = Statics.field1214;
        int var4 = Statics.field3350;
        if (class217.method315(var2)) {
            method113(Statics.field2642[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.iu(Lhy;I)V")
    public void method1210(class217 arg0) {
        class217 var2 = arg0.field2673 == -1 ? null : class217.method921(arg0.field2673);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1214;
            var4 = Statics.field3350;
        } else {
            var3 = var2.field2669;
            var4 = var2.field2694;
        }
        method3148(arg0, var3, var4, false);
        method2788(arg0, var3, var4);
    }

    @ObfuscatedName("ag.io([Lhy;Lhy;ZI)V")
    public static void method451(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2677 == 0 ? arg1.field2669 : arg1.field2677;
        int var4 = arg1.field2715 == 0 ? arg1.field2694 : arg1.field2715;
        method113(arg0, arg1.field2654, var3, var4, arg2);
        if (arg1.field2744 != null) {
            method113(arg1.field2744, arg1.field2654, var3, var4, arg2);
        }
        class69 var5 = (class69) field1068.method3264((long) arg1.field2654);
        if (var5 != null) {
            int var6 = var5.field826;
            if (class217.method315(var6)) {
                method113(Statics.field2642[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2658 == 1337) {
        }
    }

    @ObfuscatedName("x.ik([Lhy;IIIZI)V")
    public static void method113(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2673 == arg1) {
                method3148(var6, arg2, arg3, arg4);
                method2788(var6, arg2, arg3);
                if (var6.field2675 > var6.field2677 - var6.field2669) {
                    var6.field2675 = var6.field2677 - var6.field2669;
                }
                if (var6.field2675 < 0) {
                    var6.field2675 = 0;
                }
                if (var6.field2680 > var6.field2715 - var6.field2694) {
                    var6.field2680 = var6.field2715 - var6.field2694;
                }
                if (var6.field2680 < 0) {
                    var6.field2680 = 0;
                }
                if (var6.field2656 == 0) {
                    method451(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("fy.ie(Lhy;IIZB)V")
    public static void method3148(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2669;
        int var5 = arg0.field2694;
        if (arg0.field2641 == 0) {
            arg0.field2669 = arg0.field2665;
        } else if (arg0.field2641 == 1) {
            arg0.field2669 = arg1 - arg0.field2665;
        } else if (arg0.field2641 == 2) {
            arg0.field2669 = arg0.field2665 * arg1 >> 14;
        }
        if (arg0.field2662 == 0) {
            arg0.field2694 = arg0.field2737;
        } else if (arg0.field2662 == 1) {
            arg0.field2694 = arg2 - arg0.field2737;
        } else if (arg0.field2662 == 2) {
            arg0.field2694 = arg0.field2737 * arg2 >> 14;
        }
        if (arg0.field2641 == 4) {
            arg0.field2669 = arg0.field2716 * arg0.field2694 / arg0.field2672;
        }
        if (arg0.field2662 == 4) {
            arg0.field2694 = arg0.field2672 * arg0.field2669 / arg0.field2716;
        }
        if (field1077 && arg0.field2656 == 0) {
            if (arg0.field2694 < 5 && arg0.field2669 < 5) {
                arg0.field2694 = 5;
                arg0.field2669 = 5;
            } else {
                if (arg0.field2694 <= 0) {
                    arg0.field2694 = 5;
                }
                if (arg0.field2669 <= 0) {
                    arg0.field2669 = 5;
                }
            }
        }
        if (arg0.field2658 == 1337) {
            field1079 = arg0;
        }
        if (arg3 && arg0.field2733 != null && (arg0.field2669 != var4 || arg0.field2694 != var5)) {
            class70 var6 = new class70();
            var6.field831 = arg0;
            var6.field840 = arg0.field2733;
            field1106.method3320(var6);
        }
    }

    @ObfuscatedName("fj.ix(Lhy;III)V")
    public static void method2788(class217 arg0, int arg1, int arg2) {
        if (arg0.field2659 == 0) {
            arg0.field2667 = arg0.field2663;
        } else if (arg0.field2659 == 1) {
            arg0.field2667 = (arg1 - arg0.field2669) / 2 + arg0.field2663;
        } else if (arg0.field2659 == 2) {
            arg0.field2667 = arg1 - arg0.field2669 - arg0.field2663;
        } else if (arg0.field2659 == 3) {
            arg0.field2667 = arg0.field2663 * arg1 >> 14;
        } else if (arg0.field2659 == 4) {
            arg0.field2667 = (arg0.field2663 * arg1 >> 14) + (arg1 - arg0.field2669) / 2;
        } else {
            arg0.field2667 = arg1 - arg0.field2669 - (arg0.field2663 * arg1 >> 14);
        }
        if (arg0.field2660 == 0) {
            arg0.field2647 = arg0.field2664;
        } else if (arg0.field2660 == 1) {
            arg0.field2647 = (arg2 - arg0.field2694) / 2 + arg0.field2664;
        } else if (arg0.field2660 == 2) {
            arg0.field2647 = arg2 - arg0.field2694 - arg0.field2664;
        } else if (arg0.field2660 == 3) {
            arg0.field2647 = arg0.field2664 * arg2 >> 14;
        } else if (arg0.field2660 == 4) {
            arg0.field2647 = (arg0.field2664 * arg2 >> 14) + (arg2 - arg0.field2694) / 2;
        } else {
            arg0.field2647 = arg2 - arg0.field2694 - (arg0.field2664 * arg2 >> 14);
        }
        if (!field1077 || arg0.field2656 != 0) {
            return;
        }
        if (arg0.field2667 < 0) {
            arg0.field2667 = 0;
        } else if (arg0.field2669 + arg0.field2667 > arg1) {
            arg0.field2667 = arg1 - arg0.field2669;
        }
        if (arg0.field2647 < 0) {
            arg0.field2647 = 0;
        } else if (arg0.field2694 + arg0.field2647 > arg2) {
            arg0.field2647 = arg2 - arg0.field2694;
        }
    }

    @ObfuscatedName("hy.iy(IIIIIB)V")
    public static final void method3699(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field3143[0].method4603(arg0, arg1);
        Statics.field3143[1].method4603(arg0, arg1 + arg3 - 16);
        class282.method4582(arg0, arg1 + 16, 16, arg3 - 32, field984);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class282.method4582(arg0, arg1 + 16 + var6, 16, var5, field975);
        class282.method4526(arg0, arg1 + 16 + var6, var5, field1145);
        class282.method4526(arg0 + 1, arg1 + 16 + var6, var5, field1145);
        class282.method4588(arg0, arg1 + 16 + var6, 16, field1145);
        class282.method4588(arg0, arg1 + 17 + var6, 16, field1145);
        class282.method4526(arg0 + 15, arg1 + 16 + var6, var5, field986);
        class282.method4526(arg0 + 14, arg1 + 17 + var6, var5 - 1, field986);
        class282.method4588(arg0, arg1 + 15 + var6 + var5, 16, field986);
        class282.method4588(arg0 + 1, arg1 + 14 + var6 + var5, 15, field986);
    }

    @ObfuscatedName("ds.ii(Lhy;I)Z")
    public static final boolean method1855(class217 arg0) {
        if (arg0.field2767 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2767.length; var1++) {
            int var2 = method5(arg0, var1);
            int var3 = arg0.field2655[var1];
            if (arg0.field2767[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2767[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2767[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("n.ij(Lhy;II)I")
    public static final int method5(class217 arg0, int arg1) {
        if (arg0.field2766 == null || arg1 >= arg0.field2766.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2766[arg1];
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
                    var7 = field1041[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1042[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1043[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method921(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class257.method1498(var12).field3512 || field1039)) {
                        for (int var13 = 0; var13 < var11.field2772.length; var13++) {
                            if (var12 + 1 == var11.field2772[var13]) {
                                var7 += var11.field2763[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2613[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2840[field1042[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2613[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1537.field874;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2842[var14]) {
                            var7 += field1042[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method921(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class257.method1498(var18).field3512 || field1039)) {
                        for (int var19 = 0; var19 < var17.field2772.length; var19++) {
                            if (var18 + 1 == var17.field2772[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field915;
                }
                if (var6 == 12) {
                    var7 = field1073;
                }
                if (var6 == 13) {
                    int var20 = class212.field2613[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method4(var22);
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
                    var7 = (Statics.field1537.field1233 >> 7) + Statics.field2316;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1537.field1265 >> 7) + Statics.field265;
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

    @ObfuscatedName("aj.it(Lhy;IIB)V")
    public static final void method464(class217 arg0, int arg1, int arg2) {
        if (arg0.field2657 == 1) {
            method463(arg0.field2661, "", 24, 0, 0, arg0.field2654);
        }
        if (arg0.field2657 == 2 && !field1062) {
            String var3 = method912(arg0);
            if (var3 != null) {
                method463(var3, class89.method596(65280) + arg0.field2770, 25, 0, -1, arg0.field2654);
            }
        }
        if (arg0.field2657 == 3) {
            method463(class226.field3040, "", 26, 0, 0, arg0.field2654);
        }
        if (arg0.field2657 == 4) {
            method463(arg0.field2661, "", 28, 0, 0, arg0.field2654);
        }
        if (arg0.field2657 == 5) {
            method463(arg0.field2661, "", 29, 0, 0, arg0.field2654);
        }
        if (arg0.field2657 == 6 && field1071 == null) {
            method463(arg0.field2661, "", 30, 0, -1, arg0.field2654);
        }
        if (arg0.field2656 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2694; var5++) {
                for (int var6 = 0; var6 < arg0.field2669; var6++) {
                    int var7 = (arg0.field2720 + 32) * var6;
                    int var8 = (arg0.field2721 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2771[var4];
                        var8 += arg0.field2723[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field1023 = var4;
                        Statics.field814 = arg0;
                        if (arg0.field2772[var4] > 0) {
                            label287: {
                                class257 var9 = class257.method1498(arg0.field2772[var4] - 1);
                                if (field1078 == 1) {
                                    int var10 = method619(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field18 != arg0.field2654 || Statics.field273 != var4) {
                                            method463(class226.field3010, field1159 + " " + class89.field1390 + " " + class89.method596(16748608) + var9.field3499, 31, var9.field3497, var4, arg0.field2654);
                                        }
                                        break label287;
                                    }
                                }
                                if (field1062) {
                                    int var12 = method619(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1677 & 0x10) == 16) {
                                            method463(field1065, field1020 + " " + class89.field1390 + " " + class89.method596(16748608) + var9.field3499, 32, var9.field3497, var4, arg0.field2654);
                                        }
                                        break label287;
                                    }
                                }
                                String[] var14 = var9.field3514;
                                if (field1027) {
                                    var14 = method445(var14);
                                }
                                int var15 = var9.method4192();
                                int var16 = method619(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        boolean var19 = var15 == var18;
                                        if (var14 != null && var14[var18] != null) {
                                            byte var20;
                                            if (var18 == 3) {
                                                var20 = 36;
                                            } else {
                                                var20 = 37;
                                            }
                                            method2755(var14[var18], class89.method596(16748608) + var9.field3499, var20, var9.field3497, var4, arg0.field2654, var19);
                                        } else if (var18 == 4) {
                                            method2755(class226.field2862, class89.method596(16748608) + var9.field3499, 37, var9.field3497, var4, arg0.field2654, var19);
                                        }
                                    }
                                }
                                class218 var10000 = (class218) null;
                                if (class218.method1856(method619(arg0))) {
                                    method463(class226.field3010, class89.method596(16748608) + var9.field3499, 38, var9.field3497, var4, arg0.field2654);
                                }
                                int var21 = method619(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22 && var14 != null) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        boolean var24 = var15 == var23;
                                        if (var14[var23] != null) {
                                            byte var25 = 0;
                                            if (var23 == 0) {
                                                var25 = 33;
                                            }
                                            if (var23 == 1) {
                                                var25 = 34;
                                            }
                                            if (var23 == 2) {
                                                var25 = 35;
                                            }
                                            method2755(var14[var23], class89.method596(16748608) + var9.field3499, var25, var9.field3497, var4, arg0.field2654, var24);
                                        }
                                    }
                                }
                                String[] var26 = arg0.field2725;
                                if (field1027) {
                                    var26 = method445(var26);
                                }
                                if (var26 != null) {
                                    for (int var27 = 4; var27 >= 0; var27--) {
                                        if (var26[var27] != null) {
                                            byte var28 = 0;
                                            if (var27 == 0) {
                                                var28 = 39;
                                            }
                                            if (var27 == 1) {
                                                var28 = 40;
                                            }
                                            if (var27 == 2) {
                                                var28 = 41;
                                            }
                                            if (var27 == 3) {
                                                var28 = 42;
                                            }
                                            if (var27 == 4) {
                                                var28 = 43;
                                            }
                                            method463(var26[var27], class89.method596(16748608) + var9.field3499, var28, var9.field3497, var4, arg0.field2654);
                                        }
                                    }
                                }
                                method463(class226.field3011, class89.method596(16748608) + var9.field3499, 1005, var9.field3497, var4, arg0.field2654);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2726) {
            return;
        }
        if (!field1062) {
            for (int var29 = 9; var29 >= 5; var29--) {
                String var30 = method916(arg0, var29);
                if (var30 != null) {
                    method463(var30, arg0.field2645, 1007, var29 + 1, arg0.field2711, arg0.field2654);
                }
            }
            String var31 = method912(arg0);
            if (var31 != null) {
                method463(var31, arg0.field2645, 25, 0, arg0.field2711, arg0.field2654);
            }
            for (int var32 = 4; var32 >= 0; var32--) {
                String var33 = method916(arg0, var32);
                if (var33 != null) {
                    method463(var33, arg0.field2645, 57, var32 + 1, arg0.field2711, arg0.field2654);
                }
            }
            if (class218.method64(method619(arg0))) {
                method463(class226.field2984, "", 30, 0, arg0.field2711, arg0.field2654);
            }
        } else if (class218.method3654(method619(arg0)) && (Statics.field1677 & 0x20) == 32) {
            method463(field1065, field1020 + " " + class89.field1390 + " " + arg0.field2645, 58, 0, arg0.field2711, arg0.field2654);
        }
    }

    @ObfuscatedName("al.iq(IIIIIIIS)V")
    public static final void method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class217.method315(arg0)) {
            method572(Statics.field2642[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("al.ia([Lhy;IIIIIIII)V")
    public static final void method572(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2726 || var9.field2656 == 0 || var9.field2734 || method619(var9) != 0 || field921 == var9 || var9.field2658 == 1338) && var9.field2673 == arg1 && (!var9.field2726 || !method1538(var9))) {
                int var10 = var9.field2667 + arg6;
                int var11 = var9.field2647 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2656 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2656 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2669 + var10;
                    int var19 = var9.field2694 + var11;
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
                    int var22 = var9.field2669 + var10;
                    int var23 = var9.field2694 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1080 == var9) {
                    field1088 = true;
                    field1047 = var10;
                    field1090 = var11;
                }
                if (!var9.field2726 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field723;
                    int var25 = class60.field724 * -90084053;
                    if (class60.field729 != 0) {
                        var24 = class60.field736;
                        var25 = class60.field731;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2658 == 1337) {
                        if (!field988 && !field1045 && var26) {
                            method663(var24, var25, var12, var13);
                        }
                    } else if (var9.field2658 != 1338) {
                        if (var9.field2658 == 1400) {
                            Statics.field276.method4835(class60.field723, class60.field724 * -90084053, var26, var10, var11, var9.field2669, var9.field2694);
                        }
                        if (!field1045 && var26) {
                            if (var9.field2658 == 1400) {
                                Statics.field276.method4899(var10, var11, var9.field2669, var9.field2694, var24, var25);
                            } else {
                                method464(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2656 == 0) {
                            if (!var9.field2726 && method1538(var9) && Statics.field309 != var9) {
                                continue;
                            }
                            method572(arg0, var9.field2654, var12, var13, var14, var15, var10 - var9.field2675, var11 - var9.field2680);
                            if (var9.field2744 != null) {
                                method572(var9.field2744, var9.field2654, var12, var13, var14, var15, var10 - var9.field2675, var11 - var9.field2680);
                            }
                            class69 var41 = (class69) field1068.method3264((long) var9.field2654);
                            if (var41 != null) {
                                if (var41.field823 == 0 && class60.field723 >= var12 && class60.field724 * -90084053 >= var13 && class60.field723 < var14 && class60.field724 * -90084053 < var15 && !field1045 && !field1077) {
                                    for (class70 var42 = (class70) field1106.method3318(); var42 != null; var42 = (class70) field1106.method3338()) {
                                        if (var42.field830) {
                                            var42.method3308();
                                            var42.field831.field2779 = false;
                                        }
                                    }
                                    if (Statics.field455 == 0) {
                                        field1080 = null;
                                        field921 = null;
                                    }
                                    if (!field1045) {
                                        field1038 = 0;
                                        field941 = -1;
                                        field1045 = false;
                                        field1147[0] = class226.field3099;
                                        field1123[0] = "";
                                        field985[0] = 1006;
                                        field1038 = 1;
                                    }
                                }
                                method577(var41.field826, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2726) {
                            if (var9.field2787) {
                                if (class60.field723 >= var12 && class60.field724 * -90084053 >= var13 && class60.field723 < var14 && class60.field724 * -90084053 < var15) {
                                    for (class70 var43 = (class70) field1106.method3318(); var43 != null; var43 = (class70) field1106.method3338()) {
                                        if (var43.field830) {
                                            var43.method3308();
                                            var43.field831.field2779 = false;
                                        }
                                    }
                                    if (Statics.field455 == 0) {
                                        field1080 = null;
                                        field921 = null;
                                    }
                                    if (!field1045) {
                                        field1147[0] = class226.field3099;
                                        field1123[0] = "";
                                        field985[0] = 1006;
                                        field1038 = 1;
                                    }
                                }
                            } else if (var9.field2788 && class60.field723 >= var12 && class60.field724 * -90084053 >= var13 && class60.field723 < var14 && class60.field724 * -90084053 < var15) {
                                for (class70 var44 = (class70) field1106.method3318(); var44 != null; var44 = (class70) field1106.method3338()) {
                                    if (var44.field830 && var44.field831.field2755 == var44.field840) {
                                        var44.method3308();
                                    }
                                }
                            }
                            boolean var45;
                            if (class60.field723 >= var12 && class60.field724 * -90084053 >= var13 && class60.field723 < var14 && class60.field724 * -90084053 < var15) {
                                var45 = true;
                            } else {
                                var45 = false;
                            }
                            boolean var46 = false;
                            if ((class60.field722 == 1 || !Statics.field462 && class60.field722 == 4) && var45) {
                                var46 = true;
                            }
                            boolean var47 = false;
                            if ((class60.field729 == 1 || !Statics.field462 && class60.field729 == 4) && class60.field736 >= var12 && class60.field731 >= var13 && class60.field736 < var14 && class60.field731 < var15) {
                                var47 = true;
                            }
                            if (var47) {
                                method1545(var9, class60.field736 - var10, class60.field731 - var11);
                            }
                            if (var9.field2658 == 1400) {
                                Statics.field276.method4922(class60.field723, class60.field724 * -90084053, var45 & var46);
                            }
                            if (field1080 != null && field1080 != var9 && var45 && class218.method964(method619(var9))) {
                                field1084 = var9;
                            }
                            if (field921 == var9) {
                                field1085 = true;
                                field1086 = var10;
                                field1138 = var11;
                            }
                            if (var9.field2734) {
                                if (var45 && field1105 != 0 && var9.field2755 != null) {
                                    class70 var48 = new class70();
                                    var48.field830 = true;
                                    var48.field831 = var9;
                                    var48.field829 = field1105;
                                    var48.field840 = var9.field2755;
                                    field1106.method3320(var48);
                                }
                                if (field1080 != null || Statics.field842 != null || field1045) {
                                    var47 = false;
                                    var46 = false;
                                    var45 = false;
                                }
                                if (!var9.field2780 && var47) {
                                    var9.field2780 = true;
                                    if (var9.field2668 != null) {
                                        class70 var49 = new class70();
                                        var49.field830 = true;
                                        var49.field831 = var9;
                                        var49.field832 = class60.field736 - var10;
                                        var49.field829 = class60.field731 - var11;
                                        var49.field840 = var9.field2668;
                                        field1106.method3320(var49);
                                    }
                                }
                                if (var9.field2780 && var46 && var9.field2676 != null) {
                                    class70 var50 = new class70();
                                    var50.field830 = true;
                                    var50.field831 = var9;
                                    var50.field832 = class60.field723 - var10;
                                    var50.field829 = class60.field724 * -90084053 - var11;
                                    var50.field840 = var9.field2676;
                                    field1106.method3320(var50);
                                }
                                if (var9.field2780 && !var46) {
                                    var9.field2780 = false;
                                    if (var9.field2738 != null) {
                                        class70 var51 = new class70();
                                        var51.field830 = true;
                                        var51.field831 = var9;
                                        var51.field832 = class60.field723 - var10;
                                        var51.field829 = class60.field724 * -90084053 - var11;
                                        var51.field840 = var9.field2738;
                                        field1116.method3320(var51);
                                    }
                                }
                                if (var46 && var9.field2739 != null) {
                                    class70 var52 = new class70();
                                    var52.field830 = true;
                                    var52.field831 = var9;
                                    var52.field832 = class60.field723 - var10;
                                    var52.field829 = class60.field724 * -90084053 - var11;
                                    var52.field840 = var9.field2739;
                                    field1106.method3320(var52);
                                }
                                if (!var9.field2779 && var45) {
                                    var9.field2779 = true;
                                    if (var9.field2740 != null) {
                                        class70 var53 = new class70();
                                        var53.field830 = true;
                                        var53.field831 = var9;
                                        var53.field832 = class60.field723 - var10;
                                        var53.field829 = class60.field724 * -90084053 - var11;
                                        var53.field840 = var9.field2740;
                                        field1106.method3320(var53);
                                    }
                                }
                                if (var9.field2779 && var45 && var9.field2741 != null) {
                                    class70 var54 = new class70();
                                    var54.field830 = true;
                                    var54.field831 = var9;
                                    var54.field832 = class60.field723 - var10;
                                    var54.field829 = class60.field724 * -90084053 - var11;
                                    var54.field840 = var9.field2741;
                                    field1106.method3320(var54);
                                }
                                if (var9.field2779 && !var45) {
                                    var9.field2779 = false;
                                    if (var9.field2701 != null) {
                                        class70 var55 = new class70();
                                        var55.field830 = true;
                                        var55.field831 = var9;
                                        var55.field832 = class60.field723 - var10;
                                        var55.field829 = class60.field724 * -90084053 - var11;
                                        var55.field840 = var9.field2701;
                                        field1116.method3320(var55);
                                    }
                                }
                                if (var9.field2753 != null) {
                                    class70 var56 = new class70();
                                    var56.field831 = var9;
                                    var56.field840 = var9.field2753;
                                    field1107.method3320(var56);
                                }
                                if (var9.field2747 != null && field1094 > var9.field2782) {
                                    if (var9.field2748 == null || field1094 - var9.field2782 > 32) {
                                        class70 var61 = new class70();
                                        var61.field831 = var9;
                                        var61.field840 = var9.field2747;
                                        field1106.method3320(var61);
                                    } else {
                                        label584: for (int var57 = var9.field2782; var57 < field1094; var57++) {
                                            int var58 = field1093[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field2748.length; var59++) {
                                                if (var9.field2748[var59] == var58) {
                                                    class70 var60 = new class70();
                                                    var60.field831 = var9;
                                                    var60.field840 = var9.field2747;
                                                    field1106.method3320(var60);
                                                    break label584;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2782 = field1094;
                                }
                                if (var9.field2749 != null && field1096 > var9.field2783) {
                                    if (var9.field2714 == null || field1096 - var9.field2783 > 32) {
                                        class70 var66 = new class70();
                                        var66.field831 = var9;
                                        var66.field840 = var9.field2749;
                                        field1106.method3320(var66);
                                    } else {
                                        label560: for (int var62 = var9.field2783; var62 < field1096; var62++) {
                                            int var63 = field1095[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field2714.length; var64++) {
                                                if (var9.field2714[var64] == var63) {
                                                    class70 var65 = new class70();
                                                    var65.field831 = var9;
                                                    var65.field840 = var9.field2749;
                                                    field1106.method3320(var65);
                                                    break label560;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2783 = field1096;
                                }
                                if (var9.field2729 != null && field1098 > var9.field2736) {
                                    if (var9.field2752 == null || field1098 - var9.field2736 > 32) {
                                        class70 var71 = new class70();
                                        var71.field831 = var9;
                                        var71.field840 = var9.field2729;
                                        field1106.method3320(var71);
                                    } else {
                                        label536: for (int var67 = var9.field2736; var67 < field1098; var67++) {
                                            int var68 = field1097[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var9.field2752.length; var69++) {
                                                if (var9.field2752[var69] == var68) {
                                                    class70 var70 = new class70();
                                                    var70.field831 = var9;
                                                    var70.field840 = var9.field2729;
                                                    field1106.method3320(var70);
                                                    break label536;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2736 = field1098;
                                }
                                if (field911 > var9.field2781 && var9.field2756 != null) {
                                    class70 var72 = new class70();
                                    var72.field831 = var9;
                                    var72.field840 = var9.field2756;
                                    field1106.method3320(var72);
                                }
                                if (field1100 > var9.field2781 && var9.field2758 != null) {
                                    class70 var73 = new class70();
                                    var73.field831 = var9;
                                    var73.field840 = var9.field2758;
                                    field1106.method3320(var73);
                                }
                                if (field1101 > var9.field2781 && var9.field2759 != null) {
                                    class70 var74 = new class70();
                                    var74.field831 = var9;
                                    var74.field840 = var9.field2759;
                                    field1106.method3320(var74);
                                }
                                if (field1102 > var9.field2781 && var9.field2764 != null) {
                                    class70 var75 = new class70();
                                    var75.field831 = var9;
                                    var75.field840 = var9.field2764;
                                    field1106.method3320(var75);
                                }
                                if (field1103 > var9.field2781 && var9.field2765 != null) {
                                    class70 var76 = new class70();
                                    var76.field831 = var9;
                                    var76.field840 = var9.field2765;
                                    field1106.method3320(var76);
                                }
                                if (field1104 > var9.field2781 && var9.field2670 != null) {
                                    class70 var77 = new class70();
                                    var77.field831 = var9;
                                    var77.field840 = var9.field2670;
                                    field1106.method3320(var77);
                                }
                                var9.field2781 = field1046;
                                if (var9.field2757 != null) {
                                    for (int var78 = 0; var78 < field907; var78++) {
                                        class70 var79 = new class70();
                                        var79.field831 = var9;
                                        var79.field839 = field1170[var78];
                                        var79.field837 = field1002[var78];
                                        var79.field840 = var9.field2757;
                                        field1106.method3320(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field2726 && field1080 == null && Statics.field842 == null && !field1045) {
                            if ((var9.field2769 >= 0 || var9.field2681 != 0) && class60.field723 >= var12 && class60.field724 * -90084053 >= var13 && class60.field723 < var14 && class60.field724 * -90084053 < var15) {
                                if (var9.field2769 >= 0) {
                                    Statics.field309 = arg0[var9.field2769];
                                } else {
                                    Statics.field309 = var9;
                                }
                            }
                            if (var9.field2656 == 8 && class60.field723 >= var12 && class60.field724 * -90084053 >= var13 && class60.field723 < var14 && class60.field724 * -90084053 < var15) {
                                Statics.field484 = var9;
                            }
                            if (var9.field2715 > var9.field2694) {
                                int var80 = var9.field2669 + var10;
                                int var81 = var9.field2694;
                                int var82 = var9.field2715;
                                int var83 = class60.field723;
                                int var84 = class60.field724 * -90084053;
                                if (field1122) {
                                    field989 = 32;
                                } else {
                                    field989 = 0;
                                }
                                field1122 = false;
                                if (class60.field722 == 1 || !Statics.field462 && class60.field722 == 4) {
                                    if (var83 >= var80 && var83 < var80 + 16 && var84 >= var11 && var84 < var11 + 16) {
                                        var9.field2680 -= 4;
                                        method632(var9);
                                    } else if (var83 >= var80 && var83 < var80 + 16 && var84 >= var11 + var81 - 16 && var84 < var11 + var81) {
                                        var9.field2680 += 4;
                                        method632(var9);
                                    } else if (var83 >= var80 - field989 && var83 < field989 + var80 + 16 && var84 >= var11 + 16 && var84 < var11 + var81 - 16) {
                                        int var85 = (var81 - 32) * var81 / var82;
                                        if (var85 < 8) {
                                            var85 = 8;
                                        }
                                        int var86 = var84 - var11 - 16 - var85 / 2;
                                        int var87 = var81 - 32 - var85;
                                        var9.field2680 = (var82 - var81) * var86 / var87;
                                        method632(var9);
                                        field1122 = true;
                                    }
                                }
                                if (field1105 != 0) {
                                    int var88 = var9.field2669;
                                    if (var83 >= var80 - var88 && var84 >= var11 && var83 < var80 + 16 && var84 <= var11 + var81) {
                                        var9.field2680 += field1105 * 45;
                                        method632(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field1141 == 0 || field1141 == 3) && (class60.field729 == 1 || !Statics.field462 && class60.field729 == 4)) {
                        class211 var27 = var9.method3670(true);
                        if (var27 != null) {
                            int var28 = class60.field736 - var10;
                            int var29 = class60.field731 - var11;
                            if (var27.method3598(var28, var29)) {
                                int var30 = var28 - var27.field2601 / 2;
                                int var31 = var29 - var27.field2600 / 2;
                                int var32 = field991 + field978 & 0x7FF;
                                int var33 = class137.field2009[var32];
                                int var34 = class137.field2035[var32];
                                int var35 = (field980 + 256) * var33 >> 8;
                                int var36 = (field980 + 256) * var34 >> 8;
                                int var37 = var30 * var36 + var31 * var35 >> 11;
                                int var38 = var31 * var36 - var30 * var35 >> 11;
                                int var39 = Statics.field1537.field1233 + var37 >> 7;
                                int var40 = Statics.field1537.field1265 - var38 >> 7;
                                field949.method3136(79);
                                field949.method2908(18);
                                field949.method2895(class51.field627[82] ? (class51.field627[81] ? 2 : 1) : 0);
                                field949.method2905(Statics.field2316 + var39);
                                field949.method2932(Statics.field265 + var40);
                                field949.method2908(var30);
                                field949.method2908(var31);
                                field949.method2857(field991);
                                field949.method2908(57);
                                field949.method2908(field978);
                                field949.method2908(field980);
                                field949.method2908(89);
                                field949.method2857(Statics.field1537.field1233);
                                field949.method2857(Statics.field1537.field1265);
                                field949.method2908(63);
                                field1115 = var39;
                                field1140 = var40;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.ih(III)V")
    public static final void method239(int arg0, int arg1) {
        if (class217.method315(arg0)) {
            method716(Statics.field2642[arg0], arg1);
        }
    }

    @ObfuscatedName("bl.iv([Lhy;II)V")
    public static final void method716(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2656 == 0) {
                    if (var3.field2744 != null) {
                        method716(var3.field2744, arg1);
                    }
                    class69 var4 = (class69) field1068.method3264((long) var3.field2654);
                    if (var4 != null) {
                        method239(var4.field826, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2761 != null) {
                    class70 var5 = new class70();
                    var5.field831 = var3;
                    var5.field840 = var3.field2761;
                    class84.method1537(var5);
                }
                if (arg1 == 1 && var3.field2762 != null) {
                    if (var3.field2711 >= 0) {
                        class217 var6 = class217.method921(var3.field2654);
                        if (var6 == null || var6.field2744 == null || var3.field2711 >= var6.field2744.length || var6.field2744[var3.field2711] != var3) {
                            continue;
                        }
                    }
                    class70 var7 = new class70();
                    var7.field831 = var3;
                    var7.field840 = var3.field2762;
                    class84.method1537(var7);
                }
            }
        }
    }

    @ObfuscatedName("cd.id(Lhy;III)V")
    public static final void method1545(class217 arg0, int arg1, int arg2) {
        if (field1080 != null || field1045 || arg0 == null || method1536(arg0) == null) {
            return;
        }
        field1080 = arg0;
        field921 = method1536(arg0);
        field1082 = arg1;
        field1083 = arg2;
        Statics.field455 = 0;
        field1175 = false;
        int var3 = method2364();
        if (var3 == -1) {
            return;
        }
        Statics.field1526 = new class90();
        Statics.field1526.field1403 = field1001[var3];
        Statics.field1526.field1400 = field954[var3];
        Statics.field1526.field1401 = field985[var3];
        Statics.field1526.field1404 = field1050[var3];
        Statics.field1526.field1402 = field1147[var3];
    }

    @ObfuscatedName("client.is(I)V")
    public final void method1040() {
        method632(field1080);
        Statics.field455++;
        if (field1088 && field1085) {
            int var1 = class60.field723;
            int var2 = class60.field724 * -90084053;
            int var3 = var1 - field1082;
            int var4 = var2 - field1083;
            if (var3 < field1086) {
                var3 = field1086;
            }
            if (field1080.field2669 + var3 > field1086 + field921.field2669) {
                var3 = field1086 + field921.field2669 - field1080.field2669;
            }
            if (var4 < field1138) {
                var4 = field1138;
            }
            if (field1080.field2694 + var4 > field1138 + field921.field2694) {
                var4 = field1138 + field921.field2694 - field1080.field2694;
            }
            int var5 = var3 - field1047;
            int var6 = var4 - field1090;
            int var7 = field1080.field2730;
            if (Statics.field455 > field1080.field2731 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1175 = true;
            }
            int var8 = field921.field2675 + (var3 - field1086);
            int var9 = field921.field2680 + (var4 - field1138);
            if (field1080.field2743 != null && field1175) {
                class70 var10 = new class70();
                var10.field831 = field1080;
                var10.field832 = var8;
                var10.field829 = var9;
                var10.field840 = field1080.field2743;
                class84.method1537(var10);
            }
            if (class60.field722 == 0) {
                if (field1175) {
                    if (field1080.field2727 != null) {
                        class70 var11 = new class70();
                        var11.field831 = field1080;
                        var11.field832 = var8;
                        var11.field829 = var9;
                        var11.field834 = field1084;
                        var11.field840 = field1080.field2727;
                        class84.method1537(var11);
                    }
                    if (field1084 != null && method1340(field1080) != null) {
                        field949.method3136(239);
                        field949.method3024(field1084.field2654);
                        field949.method2904(field1080.field2711);
                        field949.method2904(field1080.field2774);
                        field949.method3030(field1080.field2654);
                        field949.method2857(field1084.field2711);
                        field949.method2932(field1084.field2774);
                    }
                } else {
                    label110: {
                        int var12 = method2364();
                        if (field1038 > 2) {
                            label113: {
                                if (field1044 != 1 || Statics.method3622()) {
                                    boolean var13;
                                    if (var12 < 0) {
                                        var13 = false;
                                    } else {
                                        int var14 = field985[var12];
                                        if (var14 >= 2000) {
                                            var14 -= 2000;
                                        }
                                        if (var14 == 1007) {
                                            var13 = true;
                                        } else {
                                            var13 = false;
                                        }
                                    }
                                    if (!var13) {
                                        break label113;
                                    }
                                }
                                this.method1037(field1082 + field1047, field1090 + field1083);
                                break label110;
                            }
                        }
                        if (field1038 > 0) {
                            int var15 = field1082 + field1047;
                            int var16 = field1090 + field1083;
                            method317(Statics.field1526, var15, var16);
                            Statics.field1526 = null;
                        }
                    }
                }
                field1080 = null;
            }
        } else if (Statics.field455 > 1) {
            field1080 = null;
        }
    }

    @ObfuscatedName("ay.ir(Lhy;B)V")
    public static void method632(class217 arg0) {
        if (field1111 == arg0.field2689) {
            field1112[arg0.field2785] = true;
        }
    }

    @ObfuscatedName("s.im(I)V")
    public static void method34() {
        for (class69 var0 = (class69) field1068.method3262(); var0 != null; var0 = (class69) field1068.method3263()) {
            int var1 = var0.field826;
            if (class217.method315(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field2642[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2726;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2467;
                    class217 var6 = class217.method921(var5);
                    if (var6 != null) {
                        method632(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.iz(Lhy;I)Lhy;")
    public static class217 method1536(class217 arg0) {
        class217 var1 = method1340(arg0);
        if (var1 == null) {
            var1 = arg0.field2735;
        }
        return var1;
    }

    @ObfuscatedName("aq.ib([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method445(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("d.ip(II)V")
    public static final void method161(int arg0) {
        if (!class217.method315(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2642[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2773 = 0;
                var3.field2777 = 0;
            }
        }
    }

    @ObfuscatedName("je.ic([Lhy;II)V")
    public static final void method4490(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2673 == arg1 && (!var3.field2726 || !method1538(var3))) {
                if (var3.field2656 == 0) {
                    if (!var3.field2726 && method1538(var3) && Statics.field309 != var3) {
                        continue;
                    }
                    method4490(arg0, var3.field2654);
                    if (var3.field2744 != null) {
                        method4490(var3.field2744, var3.field2654);
                    }
                    class69 var4 = (class69) field1068.method3264((long) var3.field2654);
                    if (var4 != null) {
                        int var5 = var4.field826;
                        if (class217.method315(var5)) {
                            method4490(Statics.field2642[var5], -1);
                        }
                    }
                }
                if (var3.field2656 == 6) {
                    if (var3.field2778 != -1 || var3.field2702 != -1) {
                        boolean var6 = method1855(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2702;
                        } else {
                            var7 = var3.field2778;
                        }
                        if (var7 != -1) {
                            class261 var8 = class261.method1884(var7);
                            var3.field2777 += field983;
                            while (var3.field2777 > var8.field3619[var3.field2773]) {
                                var3.field2777 -= var8.field3619[var3.field2773];
                                var3.field2773++;
                                if (var3.field2773 >= var8.field3608.length) {
                                    var3.field2773 -= var8.field3611;
                                    if (var3.field2773 < 0 || var3.field2773 >= var8.field3608.length) {
                                        var3.field2773 = 0;
                                    }
                                }
                                method632(var3);
                            }
                        }
                    }
                    if (var3.field2710 != 0 && !var3.field2726) {
                        int var9 = var3.field2710 >> 16;
                        int var10 = var3.field2710 << 16 >> 16;
                        int var11 = field983 * var9;
                        int var12 = field983 * var10;
                        var3.field2705 = var3.field2705 + var11 & 0x7FF;
                        var3.field2706 = var3.field2706 + var12 & 0x7FF;
                        method632(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.jg(II)V")
    public static final void method9(int arg0) {
        method34();
        for (class83 var1 = (class83) class83.field1323.method3318(); var1 != null; var1 = (class83) class83.field1323.method3338()) {
            if (var1.field1312 != null) {
                var1.method1432();
            }
        }
        int var2 = class242.method2842(arg0).field3286;
        if (var2 == 0) {
            return;
        }
        int var3 = class212.field2613[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class137.method2397(0.9D);
                ((class126) Statics.field2031).method2147(0.9D);
            }
            if (var3 == 2) {
                class137.method2397(0.8D);
                ((class126) Statics.field2031).method2147(0.8D);
            }
            if (var3 == 3) {
                class137.method2397(0.7D);
                ((class126) Statics.field2031).method2147(0.7D);
            }
            if (var3 == 4) {
                class137.method2397(0.6D);
                ((class126) Statics.field2031).method2147(0.6D);
            }
            class257.field3538.method3244();
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
            if (field924 != var4) {
                if (field924 == 0 && field1143 != -1) {
                    class204.method966(Statics.field2438, field1143, 0, var4, false);
                    field947 = false;
                } else if (var4 == 0) {
                    Statics.field2501.method3427();
                    class204.field2502 = 1;
                    Statics.field2503 = null;
                    field947 = false;
                } else if (class204.field2502 == 0) {
                    Statics.field2501.method3421(var4);
                } else {
                    Statics.field2505 = var4;
                }
                field924 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1060 = 127;
            }
            if (var3 == 1) {
                field1060 = 96;
            }
            if (var3 == 2) {
                field1060 = 64;
            }
            if (var3 == 3) {
                field1060 = 32;
            }
            if (var3 == 4) {
                field1060 = 0;
            }
        }
        if (var2 == 5) {
            field1044 = var3;
        }
        if (var2 == 6) {
            field1069 = var3;
        }
        if (var2 == 9) {
            field973 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1173 = 127;
            }
            if (var3 == 1) {
                field1173 = 96;
            }
            if (var3 == 2) {
                field1173 = 64;
            }
            if (var3 == 3) {
                field1173 = 32;
            }
            if (var3 == 4) {
                field1173 = 0;
            }
        }
        if (var2 == 17) {
            field1075 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class92[] var5 = new class92[] { class92.field1411, class92.field1414, class92.field1417, class92.field1410 };
            field932 = (class92) class169.method1334(var5, var3);
            if (field932 == null) {
                field932 = class92.field1411;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field926 = -1;
            } else {
                field926 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class92[] var6 = new class92[] { class92.field1411, class92.field1414, class92.field1417, class92.field1410 };
        field933 = (class92) class169.method1334(var6, var3);
        if (field933 == null) {
            field933 = class92.field1411;
        }
    }

    @ObfuscatedName("z.jk(Lhy;B)V")
    public static final void method143(class217 arg0) {
        int var1 = arg0.field2658;
        if (var1 == 324) {
            if (field1179 == -1) {
                field1179 = arg0.field2751;
                field1067 = arg0.field2690;
            }
            if (field1178.field2621) {
                arg0.field2751 = field1179;
            } else {
                arg0.field2751 = field1067;
            }
        } else if (var1 == 325) {
            if (field1179 == -1) {
                field1179 = arg0.field2751;
                field1067 = arg0.field2690;
            }
            if (field1178.field2621) {
                arg0.field2751 = field1067;
            } else {
                arg0.field2751 = field1179;
            }
        } else if (var1 == 327) {
            arg0.field2705 = 150;
            arg0.field2706 = (int) (Math.sin((double) field934 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2697 = 5;
            arg0.field2698 = 0;
        } else if (var1 == 328) {
            arg0.field2705 = 150;
            arg0.field2706 = (int) (Math.sin((double) field934 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2697 = 5;
            arg0.field2698 = 1;
        }
    }

    @ObfuscatedName("ed.jc(Lbr;ZB)V")
    public static final void method2657(class69 arg0, boolean arg1) {
        int var2 = arg0.field826;
        int var3 = (int) arg0.field2467;
        arg0.method3308();
        if (arg1 && var2 != -1 && Statics.field2650[var2]) {
            Statics.field275.method3774(var2);
            if (Statics.field2642[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2642[var2].length; var5++) {
                    if (Statics.field2642[var2][var5] != null) {
                        if (Statics.field2642[var2][var5].field2656 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2642[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2642[var2] = null;
                }
                Statics.field2650[var2] = false;
            }
        }
        method310(var2);
        class217 var6 = class217.method921(var3);
        if (var6 != null) {
            method632(var6);
        }
        method450();
        if (field1019 != -1) {
            method239(field1019, 1);
        }
    }

    @ObfuscatedName("dx.js(Lhy;I)Z")
    public static final boolean method1874(class217 arg0) {
        int var1 = arg0.field2658;
        if (var1 == 205) {
            field959 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1178.method3625(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1178.method3629(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1178.method3641(false);
        }
        if (var1 == 325) {
            field1178.method3641(true);
        }
        if (var1 == 326) {
            field949.method3136(60);
            field1178.method3628(field949);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("af.ji(Lhy;IIII)V")
    public static final void method668(class217 arg0, int arg1, int arg2, int arg3) {
        class211 var4 = arg0.method3670(false);
        if (var4 == null) {
            return;
        }
        if (field1141 < 3) {
            Statics.field1386.method4652(arg1, arg2, var4.field2601, var4.field2600, 25, 25, field991, 256, var4.field2603, var4.field2602);
        } else {
            class282.method4529(arg1, arg2, 0, var4.field2603, var4.field2602);
        }
    }

    @ObfuscatedName("cb.jh(IIIILjt;Lhe;S)V")
    public static final void method1579(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method19(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field991 + field978 & 0x7FF;
        int var8 = class137.field2009[var7];
        int var9 = class137.field2035[var7];
        int var10 = var8 * 256 / (field980 + 256);
        int var11 = var9 * 256 / (field980 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2514.method4645(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("l.jo(IIIILjt;Lhe;I)V")
    public static final void method19(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field991 + field978 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field2009[var6];
        int var9 = class137.field2035[var6];
        int var10 = var8 * 256 / (field980 + 256);
        int var11 = var9 * 256 / (field980 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4707(arg5.field2601 / 2 + var12 - arg4.field3786 / 2, arg5.field2600 / 2 - var13 - arg4.field3784 / 2, arg0, arg1, arg5.field2601, arg5.field2600, arg5.field2603, arg5.field2602);
        } else {
            arg4.method4683(arg5.field2601 / 2 + arg0 + var12 - arg4.field3786 / 2, arg5.field2600 / 2 + arg1 - var13 - arg4.field3784 / 2);
        }
    }

    @ObfuscatedName("ai.ja(Ljava/lang/String;ZI)Z")
    public static boolean method189(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method3406(arg0, Statics.field2318);
        for (int var3 = 0; var3 < field1172; var3++) {
            if (var2.equalsIgnoreCase(class268.method3406(field1089[var3].field805, Statics.field2318)) && (!arg1 || field1089[var3].field803 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method3406(Statics.field1537.field878, Statics.field2318))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ed.jl(Ljava/lang/String;I)Z")
    public static boolean method2655(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method3406(arg0, Statics.field2318);
        for (int var2 = 0; var2 < field1176; var2++) {
            class71 var3 = field1177[var2];
            if (var1.equalsIgnoreCase(class268.method3406(var3.field846, Statics.field2318))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method3406(var3.field843, Statics.field2318))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("al.jd(Ljava/lang/String;I)V")
    public static final void method566(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method3406(arg0, Statics.field2318);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1172; var2++) {
            class66 var3 = field1089[var2];
            String var4 = var3.field805;
            String var5 = class268.method3406(var4, Statics.field2318);
            if (class278.method623(arg0, var1, var4, var5)) {
                field1172--;
                for (int var6 = var2; var6 < field1172; var6++) {
                    field1089[var6] = field1089[var6 + 1];
                }
                field1100 = field1046;
                field949.method3136(154);
                field949.method2908(class174.method2644(arg0));
                field949.method2862(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cg.jw(Ljava/lang/String;I)V")
    public static final void method1673(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method3406(arg0, Statics.field2318);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1176; var2++) {
            class71 var3 = field1177[var2];
            String var4 = var3.field846;
            String var5 = class268.method3406(var4, Statics.field2318);
            if (class278.method623(arg0, var1, var4, var5)) {
                field1176--;
                for (int var6 = var2; var6 < field1176; var6++) {
                    field1177[var6] = field1177[var6 + 1];
                }
                field1100 = field1046;
                field949.method3136(192);
                field949.method2908(class174.method2644(arg0));
                field949.method2862(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dq.je(Ljava/lang/String;II)V")
    public static final void method2255(String arg0, int arg1) {
        field949.method3136(179);
        field949.method2908(class174.method2644(arg0) + 1);
        field949.method2860(arg1);
        field949.method2862(arg0);
    }

    @ObfuscatedName("v.jr(Ljava/lang/String;B)V")
    public static final void method11(String arg0) {
        if (!arg0.equals("")) {
            field949.method3136(44);
            field949.method2908(class174.method2644(arg0));
            field949.method2862(arg0);
        }
    }

    @ObfuscatedName("cs.jn(I)V")
    public static final void method1371() {
        field949.method3136(44);
        field949.method2908(0);
    }

    @ObfuscatedName("am.jq(IB)V")
    public static void method310(int arg0) {
        for (class199 var1 = (class199) field1109.method3262(); var1 != null; var1 = (class199) field1109.method3263()) {
            if ((long) arg0 == (var1.field2467 >> 48 & 0xFFFFL)) {
                var1.method3308();
            }
        }
    }

    @ObfuscatedName("ah.jm(Lhy;B)I")
    public static int method619(class217 arg0) {
        class199 var1 = (class199) field1109.method3264(((long) arg0.field2654 << 32) + (long) arg0.field2711);
        return var1 == null ? arg0.field2686 : var1.field2480;
    }

    @ObfuscatedName("by.jv(Lhy;I)Lhy;")
    public static class217 method1340(class217 arg0) {
        int var1 = method619(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class217.method921(arg0.field2673);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cl.jj(Lhy;I)Z")
    public static boolean method1538(class217 arg0) {
        if (field1077) {
            if (method619(arg0) != 0) {
                return false;
            }
            if (arg0.field2656 == 0) {
                return false;
            }
        }
        return arg0.field2674;
    }

    @ObfuscatedName("bs.jz(Lhy;II)Ljava/lang/String;")
    public static String method916(class217 arg0, int arg1) {
        if (!class218.method1540(method619(arg0), arg1) && arg0.field2754 == null) {
            return null;
        } else if (arg0.field2728 == null || arg0.field2728.length <= arg1 || arg0.field2728[arg1] == null || arg0.field2728[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2728[arg1];
        }
    }

    @ObfuscatedName("bn.jb(Lhy;B)Ljava/lang/String;")
    public static String method912(class217 arg0) {
        int var1 = method619(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2718 == null || arg0.field2718.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2718;
        }
    }

    @ObfuscatedName("br.jx(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method972(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field1021 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field1021 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field1021 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field1021 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field1021 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field238 != null) {
            var3 = "/p=" + Statics.field238;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field913 + "/a=" + Statics.field372 + var3 + "/";
    }

    @ObfuscatedName("ef.ju(Lfe;I)V")
    public static void method2633(class174 arg0) {
        if (field943 != null) {
            arg0.method2882(field943, 0, field943.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class156.field2240.method2107(0L);
            class156.field2240.method2109(var1);
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
        arg0.method2882(var1, 0, var1.length);
    }
}

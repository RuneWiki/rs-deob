package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class165[] field988 = new class165[4];

    @ObfuscatedName("client.ah")
    public static boolean field1128 = true;

    @ObfuscatedName("client.au")
    public static int field1106 = 1;

    @ObfuscatedName("client.aa")
    public static int field929 = 0;

    @ObfuscatedName("client.bm")
    public static int field930 = 0;

    @ObfuscatedName("client.by")
    public static boolean field1175 = false;

    @ObfuscatedName("client.bo")
    public static boolean field998 = false;

    @ObfuscatedName("client.ba")
    public static int field1111 = 0;

    @ObfuscatedName("client.bl")
    public static int field1189 = 0;

    @ObfuscatedName("client.bb")
    public static boolean field935 = true;

    @ObfuscatedName("client.bp")
    public static int field936 = 0;

    @ObfuscatedName("client.bu")
    public static long field937 = 1L;

    @ObfuscatedName("client.br")
    public static int field986 = -1;

    @ObfuscatedName("client.bk")
    public static int field939 = -1;

    @ObfuscatedName("client.bs")
    public static int field1109 = -1;

    @ObfuscatedName("client.bj")
    public static boolean field941 = true;

    @ObfuscatedName("client.be")
    public static boolean field942 = false;

    @ObfuscatedName("client.bw")
    public static int field980 = 0;

    @ObfuscatedName("client.bc")
    public static int field944 = 0;

    @ObfuscatedName("client.bx")
    public static int field945 = 0;

    @ObfuscatedName("client.bz")
    public static int field946 = 0;

    @ObfuscatedName("client.bh")
    public static int field947 = 0;

    @ObfuscatedName("client.bi")
    public static int field948 = 0;

    @ObfuscatedName("client.cb")
    public static int field1075 = 0;

    @ObfuscatedName("client.ck")
    public static int field950 = 0;

    @ObfuscatedName("client.cg")
    public static int field1056 = 0;

    @ObfuscatedName("client.cd")
    public static class92 field952 = class92.field1424;

    @ObfuscatedName("client.ca")
    public static class92 field1053 = class92.field1424;

    @ObfuscatedName("client.ce")
    public static int field954 = 0;

    @ObfuscatedName("client.ct")
    public static int field955 = 0;

    @ObfuscatedName("client.cs")
    public static int field956 = 0;

    @ObfuscatedName("client.dy")
    public static int field959 = 0;

    @ObfuscatedName("client.dr")
    public static int field960 = 0;

    @ObfuscatedName("client.ds")
    public static int field961 = 0;

    @ObfuscatedName("client.da")
    public static int field962 = 0;

    @ObfuscatedName("client.du")
    public static int field963 = 0;

    @ObfuscatedName("client.dj")
    public static byte[] field964 = null;

    @ObfuscatedName("client.dn")
    public static class87[] field1166 = new class87[32768];

    @ObfuscatedName("client.dw")
    public static int field1171 = 0;

    @ObfuscatedName("client.dh")
    public static int[] field967 = new int[32768];

    @ObfuscatedName("client.dk")
    public static int field968 = 0;

    @ObfuscatedName("client.db")
    public static int[] field1168 = new int[250];

    @ObfuscatedName("client.eq")
    public static class183 field970 = new class183(5000);

    @ObfuscatedName("client.eu")
    public static class183 field1015 = new class183(5000);

    @ObfuscatedName("client.ed")
    public static class183 field1160 = new class183(15000);

    @ObfuscatedName("client.ea")
    public static int field1070 = 0;

    @ObfuscatedName("client.ex")
    public static int field974 = 0;

    @ObfuscatedName("client.es")
    public static int field1054 = 0;

    @ObfuscatedName("client.em")
    public static int field976 = 0;

    @ObfuscatedName("client.ey")
    public static int field934 = 0;

    @ObfuscatedName("client.eg")
    public static int field978 = 0;

    @ObfuscatedName("client.eh")
    public static int field979 = 0;

    @ObfuscatedName("client.ek")
    public static int field1122 = 0;

    @ObfuscatedName("client.et")
    public static boolean field1121 = false;

    @ObfuscatedName("client.ez")
    public static HashMap field1161 = new HashMap();

    @ObfuscatedName("client.fg")
    public static int field1187 = 0;

    @ObfuscatedName("client.fa")
    public static int field984 = 1;

    @ObfuscatedName("client.fx")
    public static int field1117 = 0;

    @ObfuscatedName("client.fb")
    public static int field1190 = 1;

    @ObfuscatedName("client.fh")
    public static int field1004 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field1206 = false;

    @ObfuscatedName("client.ft")
    public static int[][][] field990 = new int[4][13][13];

    @ObfuscatedName("client.fn")
    public static final int[] field1002 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fw")
    public static int field992 = 0;

    @ObfuscatedName("client.fl")
    public static int field1200 = 2;

    @ObfuscatedName("client.fi")
    public static int field994 = 0;

    @ObfuscatedName("client.fs")
    public static int field943 = 2;

    @ObfuscatedName("client.fz")
    public static int field996 = 0;

    @ObfuscatedName("client.fe")
    public static int field997 = 1;

    @ObfuscatedName("client.fc")
    public static int field1145 = 0;

    @ObfuscatedName("client.ff")
    public static int field999 = 0;

    @ObfuscatedName("client.gb")
    public static int field1000 = 2;

    @ObfuscatedName("client.ga")
    public static int field1001 = 0;

    @ObfuscatedName("client.gz")
    public static int field1203 = 1;

    @ObfuscatedName("client.gm")
    public static int field1207 = 0;

    @ObfuscatedName("client.gn")
    public static int field933 = 0;

    @ObfuscatedName("client.gx")
    public static int field1005 = 2301979;

    @ObfuscatedName("client.gi")
    public static int field1092 = 5063219;

    @ObfuscatedName("client.gf")
    public static int field1007 = 3353893;

    @ObfuscatedName("client.gc")
    public static int field995 = 7759444;

    @ObfuscatedName("client.go")
    public static boolean field1009 = false;

    @ObfuscatedName("client.gt")
    public static int field1010 = 0;

    @ObfuscatedName("client.hw")
    public static int field1119 = 128;

    @ObfuscatedName("client.hq")
    public static int field1012 = 0;

    @ObfuscatedName("client.hx")
    public static int field987 = 0;

    @ObfuscatedName("client.hm")
    public static int field1014 = 0;

    @ObfuscatedName("client.hh")
    public static int field1064 = 0;

    @ObfuscatedName("client.hr")
    public static int field1016 = 0;

    @ObfuscatedName("client.hp")
    public static int field927 = 50;

    @ObfuscatedName("client.hz")
    public static int field1018 = 0;

    @ObfuscatedName("client.hu")
    public static boolean field1006 = false;

    @ObfuscatedName("client.he")
    public static int field1020 = 0;

    @ObfuscatedName("client.hi")
    public static int field1021 = 0;

    @ObfuscatedName("client.hk")
    public static int field1044 = 50;

    @ObfuscatedName("client.hc")
    public static int[] field1023 = new int[field1044];

    @ObfuscatedName("client.hy")
    public static int[] field1024 = new int[field1044];

    @ObfuscatedName("client.ho")
    public static int[] field1025 = new int[field1044];

    @ObfuscatedName("client.hl")
    public static int[] field1026 = new int[field1044];

    @ObfuscatedName("client.hv")
    public static int[] field1104 = new int[field1044];

    @ObfuscatedName("client.hd")
    public static int[] field1008 = new int[field1044];

    @ObfuscatedName("client.hb")
    public static int[] field1148 = new int[field1044];

    @ObfuscatedName("client.hs")
    public static String[] field1185 = new String[field1044];

    @ObfuscatedName("client.hn")
    public static int[][] field1031 = new int[104][104];

    @ObfuscatedName("client.hg")
    public static int field1154 = 0;

    @ObfuscatedName("client.ht")
    public static int field1072 = -1;

    @ObfuscatedName("client.in")
    public static int field1034 = -1;

    @ObfuscatedName("client.is")
    public static int field1098 = 0;

    @ObfuscatedName("client.ii")
    public static int field1164 = 0;

    @ObfuscatedName("client.ih")
    public static int field1037 = 0;

    @ObfuscatedName("client.iq")
    public static int field1038 = 0;

    @ObfuscatedName("client.io")
    public static int field1039 = 0;

    @ObfuscatedName("client.iw")
    public static int field1040 = 0;

    @ObfuscatedName("client.ic")
    public static int field1041 = 0;

    @ObfuscatedName("client.it")
    public static String field1082 = null;

    @ObfuscatedName("client.ip")
    public static int field1136 = 0;

    @ObfuscatedName("client.ie")
    public static int field1043 = 0;

    @ObfuscatedName("client.id")
    public static int field1135 = 0;

    @ObfuscatedName("client.ik")
    public static boolean field1045 = false;

    @ObfuscatedName("client.ib")
    public static int field1046 = 0;

    @ObfuscatedName("client.iu")
    public static int field1047 = 0;

    @ObfuscatedName("client.im")
    public static class75[] field1048 = new class75[2048];

    @ObfuscatedName("client.iy")
    public static int field1049 = -1;

    @ObfuscatedName("client.ia")
    public static int field1050 = 0;

    @ObfuscatedName("client.jx")
    public static int field1051 = 0;

    @ObfuscatedName("client.jk")
    public static int[] field1052 = new int[1000];

    @ObfuscatedName("client.jz")
    public static final int[] field1062 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jg")
    public static String[] field969 = new String[8];

    @ObfuscatedName("client.jl")
    public static boolean[] field1055 = new boolean[8];

    @ObfuscatedName("client.jt")
    public static int[] field971 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jo")
    public static int field1101 = -1;

    @ObfuscatedName("client.jh")
    public static class197[][][] field1058 = new class197[4][104][104];

    @ObfuscatedName("client.jy")
    public static class197 field1059 = new class197();

    @ObfuscatedName("client.jn")
    public static class197 field1060 = new class197();

    @ObfuscatedName("client.ja")
    public static class197 field1061 = new class197();

    @ObfuscatedName("client.je")
    public static int[] field928 = new int[25];

    @ObfuscatedName("client.jj")
    public static int[] field1063 = new int[25];

    @ObfuscatedName("client.jv")
    public static int[] field981 = new int[25];

    @ObfuscatedName("client.jp")
    public static int field1065 = 0;

    @ObfuscatedName("client.jm")
    public static boolean field1066 = false;

    @ObfuscatedName("client.jf")
    public static int field1067 = 0;

    @ObfuscatedName("client.jc")
    public static int[] field1068 = new int[500];

    @ObfuscatedName("client.jw")
    public static int[] field1069 = new int[500];

    @ObfuscatedName("client.jd")
    public static int[] field1137 = new int[500];

    @ObfuscatedName("client.kl")
    public static int[] field1071 = new int[500];

    @ObfuscatedName("client.ki")
    public static String[] field951 = new String[500];

    @ObfuscatedName("client.kh")
    public static String[] field1073 = new String[500];

    @ObfuscatedName("client.kp")
    public static boolean field1028 = false;

    @ObfuscatedName("client.kn")
    public static int field1033 = -1;

    @ObfuscatedName("client.km")
    public static boolean field1076 = false;

    @ObfuscatedName("client.kc")
    public static int field1077 = -1;

    @ObfuscatedName("client.kz")
    public static int field1078 = -1;

    @ObfuscatedName("client.ko")
    public static int field1126 = 0;

    @ObfuscatedName("client.kd")
    public static int field1080 = 50;

    @ObfuscatedName("client.ky")
    public static int field1081 = 0;

    @ObfuscatedName("client.kt")
    public static boolean field1083 = false;

    @ObfuscatedName("client.kj")
    public static int field1084 = -1;

    @ObfuscatedName("client.kx")
    public static int field1085 = -1;

    @ObfuscatedName("client.kg")
    public static String field1086 = null;

    @ObfuscatedName("client.kw")
    public static String field1087 = null;

    @ObfuscatedName("client.kr")
    public static int field1088 = -1;

    @ObfuscatedName("client.ke")
    public static class194 field1089 = new class194(8);

    @ObfuscatedName("client.kk")
    public static int field1090 = 0;

    @ObfuscatedName("client.lq")
    public static int field1091 = 0;

    @ObfuscatedName("client.lj")
    public static class220 field1011 = null;

    @ObfuscatedName("client.lc")
    public static int field973 = 0;

    @ObfuscatedName("client.lb")
    public static int field1094 = 0;

    @ObfuscatedName("client.li")
    public static int field1095 = 0;

    @ObfuscatedName("client.lg")
    public static int field1096 = -1;

    @ObfuscatedName("client.lo")
    public static boolean field1097 = false;

    @ObfuscatedName("client.lx")
    public static boolean field1141 = false;

    @ObfuscatedName("client.lk")
    public static boolean field1099 = false;

    @ObfuscatedName("client.lw")
    public static class220 field1173 = null;

    @ObfuscatedName("client.lf")
    public static class220 field1042 = null;

    @ObfuscatedName("client.lp")
    public static class220 field1102 = null;

    @ObfuscatedName("client.ln")
    public static int field1103 = 0;

    @ObfuscatedName("client.lu")
    public static int field972 = 0;

    @ObfuscatedName("client.lr")
    public static class220 field1105 = null;

    @ObfuscatedName("client.la")
    public static boolean field1030 = false;

    @ObfuscatedName("client.lh")
    public static int field1107 = -1;

    @ObfuscatedName("client.ll")
    public static int field1108 = -1;

    @ObfuscatedName("client.lz")
    public static boolean field1032 = false;

    @ObfuscatedName("client.ld")
    public static int field1110 = -1;

    @ObfuscatedName("client.lv")
    public static int field1079 = -1;

    @ObfuscatedName("client.ls")
    public static boolean field1112 = false;

    @ObfuscatedName("client.mc")
    public static int field1113 = 1;

    @ObfuscatedName("client.mh")
    public static int[] field1114 = new int[32];

    @ObfuscatedName("client.mw")
    public static int field1115 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field1116 = new int[32];

    @ObfuscatedName("client.mj")
    public static int field1027 = 0;

    @ObfuscatedName("client.ms")
    public static int[] field1118 = new int[32];

    @ObfuscatedName("client.mq")
    public static int field1202 = 0;

    @ObfuscatedName("client.mb")
    public static int field989 = 0;

    @ObfuscatedName("client.mm")
    public static int field1035 = 0;

    @ObfuscatedName("client.mg")
    public static int field1057 = 0;

    @ObfuscatedName("client.mr")
    public static int field1123 = 0;

    @ObfuscatedName("client.mv")
    public static int field1195 = 0;

    @ObfuscatedName("client.mk")
    public static int field1125 = 0;

    @ObfuscatedName("client.mt")
    public static int field985 = 0;

    @ObfuscatedName("client.ma")
    public static class197 field1127 = new class197();

    @ObfuscatedName("client.mu")
    public static class197 field983 = new class197();

    @ObfuscatedName("client.mn")
    public static class197 field1129 = new class197();

    @ObfuscatedName("client.mz")
    public static class194 field1130 = new class194(512);

    @ObfuscatedName("client.ml")
    public static int field1131 = 0;

    @ObfuscatedName("client.me")
    public static int field1133 = -2;

    @ObfuscatedName("client.md")
    public static boolean[] field965 = new boolean[100];

    @ObfuscatedName("client.nm")
    public static boolean[] field1134 = new boolean[100];

    @ObfuscatedName("client.nx")
    public static boolean[] field1120 = new boolean[100];

    @ObfuscatedName("client.ny")
    public static int[] field977 = new int[100];

    @ObfuscatedName("client.nh")
    public static int[] field1003 = new int[100];

    @ObfuscatedName("client.ns")
    public static int[] field1138 = new int[100];

    @ObfuscatedName("client.nu")
    public static int[] field1139 = new int[100];

    @ObfuscatedName("client.nk")
    public static int field1140 = 0;

    @ObfuscatedName("client.nt")
    public static long field949 = 0L;

    @ObfuscatedName("client.nb")
    public static boolean field1142 = true;

    @ObfuscatedName("client.nf")
    public static int[] field1143 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.na")
    public static int field1144 = 0;

    @ObfuscatedName("client.nz")
    public static int field975 = 0;

    @ObfuscatedName("client.ni")
    public static String field1146 = "";

    @ObfuscatedName("client.nq")
    public static long[] field1147 = new long[100];

    @ObfuscatedName("client.ne")
    public static int field1151 = 0;

    @ObfuscatedName("client.nc")
    public static int field1149 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field1150 = new int[128];

    @ObfuscatedName("client.op")
    public static int[] field1177 = new int[128];

    @ObfuscatedName("client.ol")
    public static long field1193 = -1L;

    @ObfuscatedName("client.om")
    public static String field1153 = null;

    @ObfuscatedName("client.oq")
    public static String field1197 = null;

    @ObfuscatedName("client.oc")
    public static int field1155 = -1;

    @ObfuscatedName("client.oz")
    public static int field1156 = 0;

    @ObfuscatedName("client.ob")
    public static int[] field1157 = new int[1000];

    @ObfuscatedName("client.or")
    public static int[] field1036 = new int[1000];

    @ObfuscatedName("client.oa")
    public static class289[] field1159 = new class289[1000];

    @ObfuscatedName("client.ox")
    public static int field1019 = 0;

    @ObfuscatedName("client.od")
    public static int field1188 = 0;

    @ObfuscatedName("client.os")
    public static int field1162 = 0;

    @ObfuscatedName("client.on")
    public static int field1163 = 255;

    @ObfuscatedName("client.oi")
    public static int field1124 = -1;

    @ObfuscatedName("client.oe")
    public static boolean field1165 = false;

    @ObfuscatedName("client.pw")
    public static int field982 = 127;

    @ObfuscatedName("client.ps")
    public static int field1167 = 127;

    @ObfuscatedName("client.pe")
    public static int field1029 = 0;

    @ObfuscatedName("client.pt")
    public static int[] field1169 = new int[50];

    @ObfuscatedName("client.pc")
    public static int[] field1170 = new int[50];

    @ObfuscatedName("client.px")
    public static int[] field991 = new int[50];

    @ObfuscatedName("client.pj")
    public static int[] field1172 = new int[50];

    @ObfuscatedName("client.pr")
    public static class106[] field1191 = new class106[50];

    @ObfuscatedName("client.pv")
    public static boolean field1174 = false;

    @ObfuscatedName("client.pp")
    public static boolean[] field1158 = new boolean[5];

    @ObfuscatedName("client.qg")
    public static int[] field1176 = new int[5];

    @ObfuscatedName("client.qh")
    public static int[] field1192 = new int[5];

    @ObfuscatedName("client.qo")
    public static int[] field1178 = new int[5];

    @ObfuscatedName("client.qv")
    public static int[] field1179 = new int[5];

    @ObfuscatedName("client.qd")
    public static short field1180 = 256;

    @ObfuscatedName("client.qi")
    public static short field1181 = 205;

    @ObfuscatedName("client.qk")
    public static short field940 = 256;

    @ObfuscatedName("client.qc")
    public static short field1183 = 320;

    @ObfuscatedName("client.qt")
    public static short field1184 = 1;

    @ObfuscatedName("client.qj")
    public static short field1022 = 32767;

    @ObfuscatedName("client.qw")
    public static short field1186 = 1;

    @ObfuscatedName("client.qs")
    public static short field1152 = 32767;

    @ObfuscatedName("client.qz")
    public static int field1093 = 0;

    @ObfuscatedName("client.qq")
    public static int field932 = 0;

    @ObfuscatedName("client.qu")
    public static int field1182 = 0;

    @ObfuscatedName("client.qr")
    public static int field1074 = 0;

    @ObfuscatedName("client.qf")
    public static int field1017 = 0;

    @ObfuscatedName("client.qm")
    public static int field1013 = 0;

    @ObfuscatedName("client.ql")
    public static int field1194 = 0;

    @ObfuscatedName("client.qb")
    public static class66[] field1132 = new class66[400];

    @ObfuscatedName("client.qp")
    public static class199 field1196 = new class199();

    @ObfuscatedName("client.qn")
    public static int field953 = 0;

    @ObfuscatedName("client.qe")
    public static class71[] field1198 = new class71[400];

    @ObfuscatedName("client.qx")
    public static class217 field1199 = new class217();

    @ObfuscatedName("client.re")
    public static int field966 = -1;

    @ObfuscatedName("client.rz")
    public static int field1201 = -1;

    @ObfuscatedName("client.rs")
    public static class17[] field931 = new class17[8];

    @ObfuscatedName("client.rh")
    public static long field938 = -1L;

    @ObfuscatedName("client.rb")
    public static long field1204 = -1L;

    @ObfuscatedName("client.rq")
    public static final class74 field1205 = new class74();

    @ObfuscatedName("client.ri")
    public static int[] field1100 = new int[50];

    @ObfuscatedName("client.rr")
    public static int[] field993 = new int[50];

    @ObfuscatedName("ek.ee(I)Lkn;")
    public static class292 method2617() {
        return Statics.field2364;
    }

    @ObfuscatedName("client.ax(S)V")
    public final void method761() {
    }

    public final void init() {
        if (!this.method852()) {
            return;
        }
        class278[] var1 = class278.method1026();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class278 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3733);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3733)) {
                    case 1:
                        Statics.field256 = var4;
                    case 2:
                    case 8:
                    case 9:
                    default:
                        break;
                    case 3:
                        field930 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field929 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field3424 = (class236) class172.method1461(class236.method673(), Integer.parseInt(var4));
                        if (Statics.field3424 == class236.field3191) {
                            Statics.field790 = class293.field3860;
                        } else {
                            Statics.field790 = class293.field3866;
                        }
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class89.field1400)) {
                            field1175 = true;
                        } else {
                            field1175 = false;
                        }
                        break;
                    case 7:
                        field1111 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field835 = var4;
                        break;
                    case 11:
                        if (var4.equalsIgnoreCase(class89.field1400)) {
                        }
                        break;
                    case 12:
                        field1106 = Integer.parseInt(var4);
                        break;
                    case 13:
                        Statics.field37 = class235.method2674(Integer.parseInt(var4));
                        break;
                    case 14:
                        Statics.field586 = Integer.parseInt(var4);
                        break;
                    case 15:
                        Statics.field1324 = Integer.parseInt(var4);
                }
            }
        }
        class140.field2091 = false;
        field998 = false;
        Statics.field411 = this.getCodeBase().getHost();
        String var5 = Statics.field37.field3182;
        byte var6 = 0;
        try {
            Statics.field2259 = 17;
            Statics.field3366 = var6;
            try {
                Statics.field1381 = System.getProperty("os.name");
            } catch (Exception var26) {
                Statics.field1381 = "Unknown";
            }
            Statics.field2258 = Statics.field1381.toLowerCase();
            try {
                Statics.field829 = System.getProperty("user.home");
                if (Statics.field829 != null) {
                    Statics.field829 = Statics.field829 + "/";
                }
            } catch (Exception var25) {
            }
            try {
                if (Statics.field2258.startsWith("win")) {
                    if (Statics.field829 == null) {
                        Statics.field829 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field829 == null) {
                    Statics.field829 = System.getenv("HOME");
                }
                if (Statics.field829 != null) {
                    Statics.field829 = Statics.field829 + "/";
                }
            } catch (Exception var24) {
            }
            if (Statics.field829 == null) {
                Statics.field829 = "~/";
            }
            Statics.field675 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field829, "/tmp/", "" };
            Statics.field3806 = new String[] { ".jagex_cache_" + Statics.field3366, ".file_store_" + Statics.field3366 };
            label154: for (int var10 = 0; var10 < 4; var10++) {
                Statics.field2266 = class157.method1600("oldschool", var5, var10);
                if (!Statics.field2266.exists()) {
                    Statics.field2266.mkdirs();
                }
                File[] var11 = Statics.field2266.listFiles();
                if (var11 == null) {
                    break;
                }
                File[] var12 = var11;
                int var13 = 0;
                while (true) {
                    if (var13 >= var12.length) {
                        break label154;
                    }
                    File var14 = var12[var13];
                    if (!class157.method1012(var14, false)) {
                        break;
                    }
                    var13++;
                }
            }
            class160.method2616(Statics.field2266);
            try {
                File var15 = new File(Statics.field829, "random.dat");
                if (var15.exists()) {
                    class157.field2263 = new class124(new class125(var15, "rw", 25L), 24, 0);
                } else {
                    label134: for (int var16 = 0; var16 < Statics.field3806.length; var16++) {
                        for (int var17 = 0; var17 < Statics.field675.length; var17++) {
                            File var18 = new File(Statics.field675[var17] + Statics.field3806[var16] + File.separatorChar + "random.dat");
                            if (var18.exists()) {
                                class157.field2263 = new class124(new class125(var18, "rw", 25L), 24, 0);
                                break label134;
                            }
                        }
                    }
                }
                if (class157.field2263 == null) {
                    RandomAccessFile var19 = new RandomAccessFile(var15, "rw");
                    int var20 = var19.read();
                    var19.seek(0L);
                    var19.write(var20);
                    var19.seek(0L);
                    var19.close();
                    class157.field2263 = new class124(new class125(var15, "rw", 25L), 24, 0);
                }
            } catch (IOException var27) {
            }
            class157.field2264 = new class124(new class125(class160.method979("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class157.field2265 = new class124(new class125(class160.method979("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field385 = new class124[Statics.field2259];
            for (int var22 = 0; var22 < Statics.field2259; var22++) {
                Statics.field385[var22] = new class124(new class125(class160.method979("main_file_cache.idx" + var22), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var28) {
            class154.method2730((String) null, var28);
        }
        Statics.field2286 = this;
        this.method850(765, 503, 147);
    }

    @ObfuscatedName("client.ag(I)V")
    public final void method770() {
        Statics.field484 = field930 == 0 ? 43594 : field1106 + 40000;
        Statics.field2854 = field930 == 0 ? 443 : field1106 + 50000;
        Statics.field761 = Statics.field484;
        Statics.field2429 = class218.field2636;
        Statics.field3738 = class218.field2639;
        Statics.field1437 = class218.field2637;
        Statics.field2630 = class218.field2638;
        this.method815();
        this.method788();
        Statics.field863 = this.method728();
        Statics.field270 = new class163(255, class157.field2264, class157.field2265, 500000);
        class125 var1 = null;
        class82 var2 = new class82();
        try {
            var1 = class157.method909("", Statics.field3424.field3197, false);
            byte[] var3 = new byte[(int) var1.method2114()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2115(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class82(new class177(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method2113();
            }
        } catch (Exception var9) {
        }
        Statics.field3187 = var2;
        this.method800();
        class57.method3716(this, Statics.field2800);
        if (field930 != 0) {
            field942 = true;
        }
        method482(Statics.field3187.field1322);
    }

    @ObfuscatedName("client.ak(B)V")
    public final void method847() {
        field936++;
        this.method1042();
        class240.method151();
        class207.method238();
        method26();
        class51 var1 = class51.field666;
        synchronized (class51.field666) {
            class51.field669++;
            class51.field652 = class51.field671;
            class51.field654 = 0;
            if (class51.field664 >= 0) {
                while (class51.field664 != class51.field663) {
                    int var3 = class51.field672[class51.field663];
                    class51.field663 = class51.field663 + 1 & 0x7F;
                    if (var3 < 0) {
                        class51.field661[~var3] = false;
                    } else {
                        if (!class51.field661[var3] && class51.field654 < class51.field667.length - 1) {
                            class51.field667[++class51.field654 - 1] = var3;
                        }
                        class51.field661[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class51.field661[var2] = false;
                }
                class51.field664 = class51.field663;
            }
            if (class51.field654 > 0) {
                class51.field669 = 0;
            }
            class51.field671 = class51.field668;
        }
        class60.method1380();
        if (Statics.field863 != null) {
            int var5 = Statics.field863.method630();
            field985 = var5;
        }
        if (field1189 == 0) {
            method635();
            class59.method17();
        } else if (field1189 == 5) {
            class93.method2736(this);
            method635();
            class59.method17();
        } else if (field1189 == 10 || field1189 == 11) {
            class93.method2736(this);
        } else if (field1189 == 20) {
            class93.method2736(this);
            this.method1045();
        } else if (field1189 == 25) {
            method3820(false);
            field1187 = 0;
            boolean var6 = true;
            for (int var7 = 0; var7 < Statics.field2344.length; var7++) {
                if (Statics.field316[var7] != -1 && Statics.field2344[var7] == null) {
                    Statics.field2344[var7] = Statics.field33.method3754(Statics.field316[var7], 0);
                    if (Statics.field2344[var7] == null) {
                        var6 = false;
                        field1187++;
                    }
                }
                if (Statics.field2221[var7] != -1 && Statics.field1295[var7] == null) {
                    Statics.field1295[var7] = Statics.field33.method3727(Statics.field2221[var7], 0, Statics.field19[var7]);
                    if (Statics.field1295[var7] == null) {
                        var6 = false;
                        field1187++;
                    }
                }
            }
            if (var6) {
                field1117 = 0;
                boolean var8 = true;
                for (int var9 = 0; var9 < Statics.field2344.length; var9++) {
                    byte[] var10 = Statics.field1295[var9];
                    if (var10 != null) {
                        int var11 = (Statics.field3199[var9] >> 8) * 64 - Statics.field353;
                        int var12 = (Statics.field3199[var9] & 0xFF) * 64 - Statics.field2461;
                        if (field1206) {
                            var11 = 10;
                            var12 = 10;
                        }
                        var8 &= class62.method3707(var10, var11, var12);
                    }
                }
                if (var8) {
                    if (field1004 != 0) {
                        method19(class229.field2865 + class89.field1405 + class89.field1402 + 100 + "%" + class89.field1403, true);
                    }
                    method26();
                    method1520();
                    method26();
                    Statics.field3635.method2424();
                    method26();
                    System.gc();
                    for (int var13 = 0; var13 < 4; var13++) {
                        field988[var13].method2766();
                    }
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                class62.field777[var14][var15][var16] = 0;
                            }
                        }
                    }
                    method26();
                    class62.method493();
                    int var17 = Statics.field2344.length;
                    for (class83 var18 = (class83) class83.field1329.method3304(); var18 != null; var18 = (class83) class83.field1329.method3306()) {
                        if (var18.field1330 != null) {
                            Statics.field619.method1687(var18.field1330);
                            var18.field1330 = null;
                        }
                        if (var18.field1339 != null) {
                            Statics.field619.method1687(var18.field1339);
                            var18.field1339 = null;
                        }
                    }
                    class83.field1329.method3323();
                    method3820(true);
                    if (!field1206) {
                        for (int var19 = 0; var19 < var17; var19++) {
                            int var20 = (Statics.field3199[var19] >> 8) * 64 - Statics.field353;
                            int var21 = (Statics.field3199[var19] & 0xFF) * 64 - Statics.field2461;
                            byte[] var22 = Statics.field2344[var19];
                            if (var22 != null) {
                                method26();
                                class62.method4373(var22, var20, var21, Statics.field521 * 8 - 48, Statics.field602 * 8 - 48, field988);
                            }
                        }
                        for (int var23 = 0; var23 < var17; var23++) {
                            int var24 = (Statics.field3199[var23] >> 8) * 64 - Statics.field353;
                            int var25 = (Statics.field3199[var23] & 0xFF) * 64 - Statics.field2461;
                            byte[] var26 = Statics.field2344[var23];
                            if (var26 == null && Statics.field602 < 800) {
                                method26();
                                class62.method596(var24, var25, 64, 64);
                            }
                        }
                        method3820(true);
                        for (int var27 = 0; var27 < var17; var27++) {
                            byte[] var28 = Statics.field1295[var27];
                            if (var28 != null) {
                                int var29 = (Statics.field3199[var27] >> 8) * 64 - Statics.field353;
                                int var30 = (Statics.field3199[var27] & 0xFF) * 64 - Statics.field2461;
                                method26();
                                class62.method1387(var28, var29, var30, Statics.field3635, field988);
                            }
                        }
                    }
                    if (field1206) {
                        int var31 = 0;
                        label468: while (true) {
                            if (var31 >= 4) {
                                for (int var78 = 0; var78 < 13; var78++) {
                                    for (int var79 = 0; var79 < 13; var79++) {
                                        int var80 = field990[0][var78][var79];
                                        if (var80 == -1) {
                                            class62.method596(var78 * 8, var79 * 8, 8, 8);
                                        }
                                    }
                                }
                                method3820(true);
                                int var81 = 0;
                                while (true) {
                                    if (var81 >= 4) {
                                        break label468;
                                    }
                                    method26();
                                    for (int var82 = 0; var82 < 13; var82++) {
                                        for (int var83 = 0; var83 < 13; var83++) {
                                            int var84 = field990[var81][var82][var83];
                                            if (var84 != -1) {
                                                int var85 = var84 >> 24 & 0x3;
                                                int var86 = var84 >> 1 & 0x3;
                                                int var87 = var84 >> 14 & 0x3FF;
                                                int var88 = var84 >> 3 & 0x7FF;
                                                int var89 = (var87 / 8 << 8) + var88 / 8;
                                                for (int var90 = 0; var90 < Statics.field3199.length; var90++) {
                                                    if (Statics.field3199[var90] == var89 && Statics.field1295[var90] != null) {
                                                        class62.method5(Statics.field1295[var90], var81, var82 * 8, var83 * 8, var85, (var87 & 0x7) * 8, (var88 & 0x7) * 8, var86, Statics.field3635, field988);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var81++;
                                }
                            }
                            method26();
                            for (int var32 = 0; var32 < 13; var32++) {
                                for (int var33 = 0; var33 < 13; var33++) {
                                    boolean var34 = false;
                                    int var35 = field990[var31][var32][var33];
                                    if (var35 != -1) {
                                        int var36 = var35 >> 24 & 0x3;
                                        int var37 = var35 >> 1 & 0x3;
                                        int var38 = var35 >> 14 & 0x3FF;
                                        int var39 = var35 >> 3 & 0x7FF;
                                        int var40 = (var38 / 8 << 8) + var39 / 8;
                                        for (int var41 = 0; var41 < Statics.field3199.length; var41++) {
                                            if (Statics.field3199[var41] == var40 && Statics.field2344[var41] != null) {
                                                byte[] var42 = Statics.field2344[var41];
                                                int var43 = var32 * 8;
                                                int var44 = var33 * 8;
                                                int var45 = (var38 & 0x7) * 8;
                                                int var46 = (var39 & 0x7) * 8;
                                                class165[] var47 = field988;
                                                for (int var48 = 0; var48 < 8; var48++) {
                                                    for (int var49 = 0; var49 < 8; var49++) {
                                                        if (var43 + var48 > 0 && var43 + var48 < 103 && var44 + var49 > 0 && var44 + var49 < 103) {
                                                            var47[var31].field2321[var43 + var48][var44 + var49] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class177 var50 = new class177(var42);
                                                for (int var51 = 0; var51 < 4; var51++) {
                                                    for (int var52 = 0; var52 < 64; var52++) {
                                                        for (int var53 = 0; var53 < 64; var53++) {
                                                            if (var36 == var51 && var52 >= var45 && var52 < var45 + 8 && var53 >= var46 && var53 < var46 + 8) {
                                                                int var57 = var52 & 0x7;
                                                                int var58 = var53 & 0x7;
                                                                int var60 = var37 & 0x3;
                                                                int var61;
                                                                if (var60 == 0) {
                                                                    var61 = var57;
                                                                } else if (var60 == 1) {
                                                                    var61 = var58;
                                                                } else if (var60 == 2) {
                                                                    var61 = 7 - var57;
                                                                } else {
                                                                    var61 = 7 - var58;
                                                                }
                                                                int var64 = var43 + var61;
                                                                int var66 = var52 & 0x7;
                                                                int var67 = var53 & 0x7;
                                                                int var69 = var37 & 0x3;
                                                                int var70;
                                                                if (var69 == 0) {
                                                                    var70 = var67;
                                                                } else if (var69 == 1) {
                                                                    var70 = 7 - var66;
                                                                } else if (var69 == 2) {
                                                                    var70 = 7 - var67;
                                                                } else {
                                                                    var70 = var66;
                                                                }
                                                                class62.method669(var50, var31, var64, var44 + var70, 0, 0, var37);
                                                            } else {
                                                                class62.method669(var50, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var34 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var34) {
                                        int var71 = var31;
                                        int var72 = var32 * 8;
                                        int var73 = var33 * 8;
                                        for (int var74 = 0; var74 < 8; var74++) {
                                            for (int var75 = 0; var75 < 8; var75++) {
                                                class62.field770[var71][var72 + var74][var73 + var75] = 0;
                                            }
                                        }
                                        if (var72 > 0) {
                                            for (int var76 = 1; var76 < 8; var76++) {
                                                class62.field770[var71][var72][var73 + var76] = class62.field770[var71][var72 - 1][var73 + var76];
                                            }
                                        }
                                        if (var73 > 0) {
                                            for (int var77 = 1; var77 < 8; var77++) {
                                                class62.field770[var71][var72 + var77][var73] = class62.field770[var71][var72 + var77][var73 - 1];
                                            }
                                        }
                                        if (var72 > 0 && class62.field770[var71][var72 - 1][var73] != 0) {
                                            class62.field770[var71][var72][var73] = class62.field770[var71][var72 - 1][var73];
                                        } else if (var73 > 0 && class62.field770[var71][var72][var73 - 1] != 0) {
                                            class62.field770[var71][var72][var73] = class62.field770[var71][var72][var73 - 1];
                                        } else if (var72 > 0 && var73 > 0 && class62.field770[var71][var72 - 1][var73 - 1] != 0) {
                                            class62.field770[var71][var72][var73] = class62.field770[var71][var72 - 1][var73 - 1];
                                        }
                                    }
                                }
                            }
                            var31++;
                        }
                    }
                    method3820(true);
                    method1520();
                    method26();
                    class62.method653(Statics.field3635, field988);
                    method3820(true);
                    int var91 = class62.field767;
                    if (var91 > Statics.field861) {
                        var91 = Statics.field861;
                    }
                    if (var91 < Statics.field861 - 1) {
                        int var92 = Statics.field861 - 1;
                    }
                    if (field998) {
                        Statics.field3635.method2535(class62.field767);
                    } else {
                        Statics.field3635.method2535(0);
                    }
                    for (int var93 = 0; var93 < 104; var93++) {
                        for (int var94 = 0; var94 < 104; var94++) {
                            method672(var93, var94);
                        }
                    }
                    method26();
                    method472();
                    class259.field3451.method3242();
                    if (Statics.field2286.method760()) {
                        field970.method3115(46);
                        field970.method2872(1057001181);
                    }
                    if (!field1206) {
                        int var95 = (Statics.field521 - 6) / 8;
                        int var96 = (Statics.field521 + 6) / 8;
                        int var97 = (Statics.field602 - 6) / 8;
                        int var98 = (Statics.field602 + 6) / 8;
                        for (int var99 = var95 - 1; var99 <= var96 + 1; var99++) {
                            for (int var100 = var97 - 1; var100 <= var98 + 1; var100++) {
                                if (var99 < var95 || var99 > var96 || var100 < var97 || var100 > var98) {
                                    Statics.field33.method3748("m" + var99 + "_" + var100);
                                    Statics.field33.method3748("l" + var99 + "_" + var100);
                                }
                            }
                        }
                    }
                    method2347(30);
                    method26();
                    class62.method11();
                    field970.method3115(107);
                    class59.method17();
                } else {
                    field1004 = 2;
                }
            } else {
                field1004 = 1;
            }
        }
        if (field1189 == 30) {
            this.method1046();
        } else if (field1189 == 40 || field1189 == 45) {
            this.method1045();
        }
    }

    @ObfuscatedName("client.ae(ZI)V")
    public final void method753(boolean arg0) {
        boolean var2;
        label145: {
            try {
                if (class207.field2521 == 2) {
                    if (Statics.field817 == null) {
                        Statics.field817 = class213.method3575(Statics.field15, Statics.field630, Statics.field2522);
                        if (Statics.field817 == null) {
                            var2 = false;
                            break label145;
                        }
                    }
                    if (Statics.field1504 == null) {
                        Statics.field1504 = new class113(Statics.field2525, Statics.field2526);
                    }
                    if (Statics.field458.method3399(Statics.field817, Statics.field3692, Statics.field1504, 22050)) {
                        Statics.field458.method3400();
                        Statics.field458.method3397(Statics.field2523);
                        Statics.field458.method3402(Statics.field817, Statics.field2307);
                        class207.field2521 = 0;
                        Statics.field817 = null;
                        Statics.field1504 = null;
                        Statics.field15 = null;
                        var2 = true;
                        break label145;
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                Statics.field458.method3403();
                class207.field2521 = 0;
                Statics.field817 = null;
                Statics.field1504 = null;
                Statics.field15 = null;
            }
            var2 = false;
        }
        if (var2 && field1165 && Statics.field1795 != null) {
            Statics.field1795.method1825();
        }
        if ((field1189 == 10 || field1189 == 20 || field1189 == 30) && field949 != 0L && class179.method1665() > field949) {
            int var5 = field1142 ? 2 : 1;
            method482(var5);
        }
        if (arg0) {
            for (int var6 = 0; var6 < 100; var6++) {
                field965[var6] = true;
            }
        }
        if (field1189 == 0) {
            this.method759(class93.field1449, class93.field1453, arg0);
        } else if (field1189 == 5) {
            class93.method4522(Statics.field2558, Statics.field593, Statics.field3213, arg0);
        } else if (field1189 == 10 || field1189 == 11) {
            class93.method4522(Statics.field2558, Statics.field593, Statics.field3213, arg0);
        } else if (field1189 == 20) {
            class93.method4522(Statics.field2558, Statics.field593, Statics.field3213, arg0);
        } else if (field1189 == 25) {
            if (field1004 == 1) {
                if (field1187 > field984) {
                    field984 = field1187;
                }
                int var7 = (field984 * 50 - field1187 * 50) / field984;
                method19(class229.field2865 + class89.field1405 + class89.field1402 + var7 + "%" + class89.field1403, false);
            } else if (field1004 == 2) {
                if (field1117 > field1190) {
                    field1190 = field1117;
                }
                int var8 = (field1190 * 50 - field1117 * 50) / field1190 + 50;
                method19(class229.field2865 + class89.field1405 + class89.field1402 + var8 + "%" + class89.field1403, false);
            } else {
                method19(class229.field2865, false);
            }
        } else if (field1189 == 30) {
            this.method1049();
        } else if (field1189 == 40) {
            method19(class229.field2866 + class89.field1405 + class229.field2909, false);
        } else if (field1189 == 45) {
            method19(class229.field3132, false);
        }
        if (field1189 == 30 && field1140 == 0 && !arg0 && !field1142) {
            for (int var9 = 0; var9 < field1131; var9++) {
                if (field1134[var9]) {
                    Statics.field3327.method709(field977[var9], field1003[var9], field1138[var9], field1139[var9]);
                    field1134[var9] = false;
                }
            }
        } else if (field1189 > 0) {
            Statics.field3327.method720(0, 0);
            for (int var10 = 0; var10 < field1131; var10++) {
                field1134[var10] = false;
            }
        }
    }

    @ObfuscatedName("client.am(I)V")
    public final void method754() {
        if (Statics.field3189.method1632()) {
            Statics.field3189.method1629();
        }
        if (Statics.field538 != null) {
            Statics.field538.field874 = false;
        }
        Statics.field538 = null;
        if (Statics.field332 != null) {
            Statics.field332.method2705();
            Statics.field332 = null;
        }
        if (class51.field666 != null) {
            class51 var1 = class51.field666;
            synchronized (class51.field666) {
                class51.field666 = null;
            }
        }
        class60.method534();
        Statics.field863 = null;
        if (Statics.field1795 != null) {
            Statics.field1795.method1821();
        }
        if (Statics.field298 != null) {
            Statics.field298.method1821();
        }
        class242.method352();
        Object var3 = class240.field3235;
        synchronized (class240.field3235) {
            if (class240.field3234 != 0) {
                class240.field3234 = 1;
                try {
                    class240.field3235.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class157.method129();
    }

    @ObfuscatedName("eu.ec(II)V")
    public static void method2347(int arg0) {
        if (field1189 == arg0) {
            return;
        }
        if (field1189 == 0) {
            Statics.field2286.method747();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field960 = 0;
            field961 = 0;
            field962 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field311 != null) {
            Statics.field311.method2705();
            Statics.field311 = null;
        }
        if (field1189 == 25) {
            field1004 = 0;
            field1187 = 0;
            field984 = 1;
            field1117 = 0;
            field1190 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method4272(Statics.field812, Statics.field958, true, 0);
        } else if (arg0 == 20) {
            class93.method4272(Statics.field812, Statics.field958, true, field1189 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method4272(Statics.field812, Statics.field958, false, 4);
        } else if (Statics.field1441) {
            Statics.field621 = null;
            Statics.field1444 = null;
            Statics.field3211 = null;
            Statics.field843 = null;
            Statics.field1465 = null;
            Statics.field1456 = null;
            Statics.field873 = null;
            Statics.field263 = null;
            Statics.field299 = null;
            Statics.field1370 = null;
            Statics.field286 = null;
            Statics.field820 = null;
            Statics.field1464 = null;
            Statics.field836 = null;
            Statics.field588 = null;
            Statics.field1566 = null;
            Statics.field3386 = null;
            Statics.field1796 = null;
            Statics.field610 = null;
            Statics.field34 = null;
            Statics.field2337 = null;
            Statics.field2443 = null;
            class207.field2521 = 1;
            Statics.field15 = null;
            Statics.field630 = -1;
            Statics.field2522 = -1;
            Statics.field2523 = 0;
            Statics.field2307 = false;
            Statics.field2524 = 2;
            class242.method2132(true);
            Statics.field1441 = false;
        }
        field1189 = arg0;
    }

    @ObfuscatedName("client.ew(I)V")
    public void method1042() {
        if (field1189 == 1000) {
            return;
        }
        long var1 = class179.method1665();
        int var3 = (int) (var1 - Statics.field3252);
        Statics.field3252 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class242.field3256 += var3;
        boolean var4;
        if (class242.field3258 == 0 && class242.field3253 == 0 && class242.field3249 == 0 && class242.field3251 == 0) {
            var4 = true;
        } else if (Statics.field2365 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class242.field3256 > 30000) {
                        throw new IOException();
                    }
                    while (class242.field3253 < 20 && class242.field3251 > 0) {
                        class238 var5 = (class238) class242.field3250.method3251();
                        class177 var6 = new class177(4);
                        var6.method3075(1);
                        var6.method2871((int) var5.field2490);
                        Statics.field2365.method2699(var6.field2419, 0, 4);
                        class242.field3267.method3253(var5, var5.field2490);
                        class242.field3251--;
                        class242.field3253++;
                    }
                    while (class242.field3258 < 20 && class242.field3249 > 0) {
                        class238 var7 = (class238) class242.field3259.method3193();
                        class177 var8 = new class177(4);
                        var8.method3075(0);
                        var8.method2871((int) var7.field2490);
                        Statics.field2365.method2699(var8.field2419, 0, 4);
                        var7.method3331();
                        class242.field3257.method3253(var7, var7.field2490);
                        class242.field3249--;
                        class242.field3258++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2365.method2701();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class242.field3256 = 0;
                        byte var11 = 0;
                        if (Statics.field3254 == null) {
                            var11 = 8;
                        } else if (class242.field3261 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class242.field3248.field2412;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2365.method2703(class242.field3248.field2419, class242.field3248.field2412, var12);
                            if (class242.field3264 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class242.field3248.field2419[class242.field3248.field2412 + var13] ^= class242.field3264;
                                }
                            }
                            class242.field3248.field2412 += var12;
                            if (class242.field3248.field2412 < var11) {
                                break;
                            }
                            if (Statics.field3254 == null) {
                                class242.field3248.field2412 = 0;
                                int var14 = class242.field3248.method2931();
                                int var15 = class242.field3248.method2886();
                                int var16 = class242.field3248.method2931();
                                int var17 = class242.field3248.method2904();
                                long var18 = (long) ((var14 << 16) + var15);
                                class238 var20 = (class238) class242.field3267.method3252(var18);
                                Statics.field880 = true;
                                if (var20 == null) {
                                    var20 = (class238) class242.field3257.method3252(var18);
                                    Statics.field880 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3254 = var20;
                                Statics.field2614 = new class177(var17 + var21 + Statics.field3254.field3208);
                                Statics.field2614.method3075(var16);
                                Statics.field2614.method2872(var17);
                                class242.field3261 = 8;
                                class242.field3248.field2412 = 0;
                            } else if (class242.field3261 == 0) {
                                if (class242.field3248.field2419[0] == -1) {
                                    class242.field3261 = 1;
                                    class242.field3248.field2412 = 0;
                                } else {
                                    Statics.field3254 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2614.field2419.length - Statics.field3254.field3208;
                            int var23 = 512 - class242.field3261;
                            if (var23 > var22 - Statics.field2614.field2412) {
                                var23 = var22 - Statics.field2614.field2412;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2365.method2703(Statics.field2614.field2419, Statics.field2614.field2412, var23);
                            if (class242.field3264 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2614.field2419[Statics.field2614.field2412 + var24] ^= class242.field3264;
                                }
                            }
                            Statics.field2614.field2412 += var23;
                            class242.field3261 += var23;
                            if (Statics.field2614.field2412 == var22) {
                                if (Statics.field3254.field2490 == 16711935L) {
                                    Statics.field12 = Statics.field2614;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class241 var26 = class242.field3263[var25];
                                        if (var26 != null) {
                                            Statics.field12.field2412 = var25 * 8 + 5;
                                            int var27 = Statics.field12.method2904();
                                            int var28 = Statics.field12.method2904();
                                            var26.method3838(var27, var28);
                                        }
                                    }
                                } else {
                                    class242.field3262.reset();
                                    class242.field3262.update(Statics.field2614.field2419, 0, var22);
                                    int var29 = (int) class242.field3262.getValue();
                                    if (Statics.field3254.field3210 != var29) {
                                        try {
                                            Statics.field2365.method2705();
                                        } catch (Exception var35) {
                                        }
                                        class242.field3265++;
                                        Statics.field2365 = null;
                                        class242.field3264 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class242.field3265 = 0;
                                    class242.field3266 = 0;
                                    Statics.field3254.field3207.method3832((int) (Statics.field3254.field2490 & 0xFFFFL), Statics.field2614.field2419, (Statics.field3254.field2490 & 0xFF0000L) == 16711680L, Statics.field880);
                                }
                                Statics.field3254.method3294();
                                if (Statics.field880) {
                                    class242.field3253--;
                                } else {
                                    class242.field3258--;
                                }
                                class242.field3261 = 0;
                                Statics.field3254 = null;
                                Statics.field2614 = null;
                            } else {
                                if (class242.field3261 != 512) {
                                    break;
                                }
                                class242.field3261 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2365.method2705();
                } catch (Exception var34) {
                }
                class242.field3266++;
                Statics.field2365 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1303();
        }
    }

    @ObfuscatedName("client.fm(I)V")
    public void method1303() {
        if (class242.field3265 >= 4) {
            this.method857("js5crc");
            field1189 = 1000;
            return;
        }
        if (class242.field3266 >= 4) {
            if (field1189 <= 5) {
                this.method857("js5io");
                field1189 = 1000;
                return;
            }
            field956 = 3000;
            class242.field3266 = 3;
        }
        if (--field956 + 1 > 0) {
            return;
        }
        try {
            if (field955 == 0) {
                Statics.field3603 = Statics.field723.method2669(Statics.field411, Statics.field761);
                field955++;
            }
            if (field955 == 1) {
                if (Statics.field3603.field2240 == 2) {
                    this.method1044(-1);
                    return;
                }
                if (Statics.field3603.field2240 == 1) {
                    field955++;
                }
            }
            if (field955 == 2) {
                Socket var1 = (Socket) Statics.field3603.field2246;
                class161 var2 = new class161(var1, 131072);
                Statics.field822 = var2;
                class177 var3 = new class177(5);
                var3.method3075(15);
                var3.method2872(147);
                Statics.field822.method2699(var3.field2419, 0, 5);
                field955++;
                Statics.field2350 = class179.method1665();
            }
            if (field955 == 3) {
                if (Statics.field822.method2701() > 0) {
                    int var4 = Statics.field822.method2702();
                    if (var4 != 0) {
                        this.method1044(var4);
                        return;
                    }
                    field955++;
                } else if (Statics.field822.method2701() == -1 || class179.method1665() - Statics.field2350 > 30000L) {
                    this.method1044(-2);
                    return;
                }
            }
            if (field955 == 4) {
                class242.method1651(Statics.field822, field1189 > 20);
                Statics.field3603 = null;
                Statics.field822 = null;
                field955 = 0;
                field959 = 0;
            }
        } catch (IOException var6) {
            this.method1044(-3);
        }
    }

    @ObfuscatedName("client.fg(II)V")
    public void method1044(int arg0) {
        Statics.field3603 = null;
        Statics.field822 = null;
        field955 = 0;
        if (Statics.field761 == Statics.field484) {
            Statics.field761 = Statics.field2854;
        } else {
            Statics.field761 = Statics.field484;
        }
        field959++;
        if (field959 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field1189 <= 5) {
                this.method857("js5connect_full");
                field1189 = 1000;
            } else {
                field956 = 3000;
            }
        } else if (field959 >= 2 && arg0 == 6) {
            this.method857("js5connect_outofdate");
            field1189 = 1000;
        } else if (field959 >= 4) {
            if (field1189 <= 5) {
                this.method857("js5connect");
                field1189 = 1000;
            } else {
                field956 = 3000;
            }
        }
    }

    @ObfuscatedName("aa.fa(I)V")
    public static void method635() {
        if (field954 == 0) {
            Statics.field3635 = new class140(4, 104, 104, class62.field770);
            for (int var0 = 0; var0 < 4; var0++) {
                field988[var0] = new class165(104, 104);
            }
            Statics.field870 = new class289(512, 512);
            class93.field1453 = class229.field2868;
            class93.field1449 = 5;
            field954 = 20;
        } else if (field954 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field2043[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2459(var1, 500, 800, 512, 334);
            class93.field1453 = class229.field2869;
            class93.field1449 = 10;
            field954 = 30;
        } else if (field954 == 30) {
            Statics.field699 = method992(0, false, true, true);
            Statics.field957 = method992(1, false, true, true);
            Statics.field326 = method992(2, true, false, true);
            Statics.field2444 = method992(3, false, true, true);
            Statics.field2274 = method992(4, false, true, true);
            Statics.field33 = method992(5, true, true, true);
            Statics.field1 = method992(6, true, true, false);
            Statics.field1307 = method992(7, false, true, true);
            Statics.field958 = method992(8, false, true, true);
            Statics.field2557 = method992(9, false, true, true);
            Statics.field812 = method992(10, false, true, true);
            Statics.field2278 = method992(11, false, true, true);
            Statics.field607 = method992(12, false, true, true);
            Statics.field3395 = method992(13, true, false, true);
            Statics.field550 = method992(14, false, true, false);
            Statics.field882 = method992(15, false, true, true);
            Statics.field2011 = method992(16, false, true, false);
            class93.field1453 = class229.field2870;
            class93.field1449 = 20;
            field954 = 40;
        } else if (field954 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field699.method3835() * 4 / 100;
            int var8 = var7 + Statics.field957.method3835() * 4 / 100;
            int var9 = var8 + Statics.field326.method3835() * 2 / 100;
            int var10 = var9 + Statics.field2444.method3835() * 2 / 100;
            int var11 = var10 + Statics.field2274.method3835() * 6 / 100;
            int var12 = var11 + Statics.field33.method3835() * 4 / 100;
            int var13 = var12 + Statics.field1.method3835() * 2 / 100;
            int var14 = var13 + Statics.field1307.method3835() * 58 / 100;
            int var15 = var14 + Statics.field958.method3835() * 2 / 100;
            int var16 = var15 + Statics.field2557.method3835() * 2 / 100;
            int var17 = var16 + Statics.field812.method3835() * 2 / 100;
            int var18 = var17 + Statics.field2278.method3835() * 2 / 100;
            int var19 = var18 + Statics.field607.method3835() * 2 / 100;
            int var20 = var19 + Statics.field3395.method3835() * 2 / 100;
            int var21 = var20 + Statics.field550.method3835() * 2 / 100;
            int var22 = var21 + Statics.field882.method3835() * 2 / 100;
            int var23 = var22 + Statics.field2011.method3835() * 2 / 100;
            if (var23 == 100) {
                class93.field1453 = class229.field2872;
                class93.field1449 = 30;
                field954 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1453 = class229.field2955 + var23 + "%";
                }
                class93.field1449 = 30;
            }
        } else if (field954 == 45) {
            boolean var24 = !field998;
            Statics.field3411 = 22050;
            Statics.field1638 = var24;
            Statics.field381 = 2;
            class208 var25 = new class208();
            var25.method3405(9, 128);
            Statics.field1795 = class110.method582(Statics.field723, 0, 22050);
            Statics.field1795.method1832(var25);
            class207.method2854(Statics.field882, Statics.field550, Statics.field2274, var25);
            Statics.field298 = class110.method582(Statics.field723, 1, 2048);
            Statics.field619 = new class103();
            Statics.field298.method1832(Statics.field619);
            Statics.field706 = new class117(22050, Statics.field3411);
            class93.field1453 = class229.field2873;
            class93.field1449 = 35;
            field954 = 50;
            Statics.field276 = new class266(Statics.field958, Statics.field3395);
        } else if (field954 == 50) {
            int var26 = class265.method4387().length;
            field1161 = Statics.field276.method4388(class265.method4387());
            if (field1161.size() < var26) {
                class93.field1453 = class229.field3042 + field1161.size() * 100 / var26 + "%";
                class93.field1449 = 40;
            } else {
                Statics.field593 = (class267) field1161.get(class265.field3643);
                Statics.field3213 = (class267) field1161.get(class265.field3641);
                Statics.field2558 = (class267) field1161.get(class265.field3637);
                Statics.field2434 = new class295(true);
                class93.field1453 = class229.field2857;
                class93.field1449 = 40;
                field954 = 60;
            }
        } else if (field954 == 60) {
            int var27 = class93.method149(Statics.field812, Statics.field958);
            int var28 = class93.method3689();
            if (var27 < var28) {
                class93.field1453 = class229.field3069 + var27 * 100 / var28 + "%";
                class93.field1449 = 50;
            } else {
                class93.field1453 = class229.field2877;
                class93.field1449 = 50;
                method2347(5);
                field954 = 70;
            }
        } else if (field954 == 70) {
            if (Statics.field326.method3728()) {
                class263.method1534(Statics.field326);
                class250.method2762(Statics.field326);
                class251.method3561(Statics.field326, Statics.field1307);
                class241 var29 = Statics.field326;
                class241 var30 = Statics.field1307;
                boolean var31 = field998;
                Statics.field287 = var29;
                Statics.field679 = var30;
                class259.field3461 = var31;
                class241 var32 = Statics.field326;
                class241 var33 = Statics.field1307;
                Statics.field3566 = var32;
                Statics.field3593 = var33;
                class256.method3923(Statics.field326);
                class260.method2162(Statics.field326, Statics.field1307, field1175, Statics.field593);
                class241 var34 = Statics.field326;
                class241 var35 = Statics.field699;
                class241 var36 = Statics.field957;
                Statics.field3618 = var34;
                Statics.field3617 = var35;
                Statics.field522 = var36;
                class249.method996(Statics.field326, Statics.field1307);
                class254.method2(Statics.field326);
                class245.method2698(Statics.field326);
                class241 var37 = Statics.field2444;
                class241 var38 = Statics.field1307;
                class241 var39 = Statics.field958;
                class241 var40 = Statics.field3395;
                Statics.field2660 = var37;
                Statics.field2649 = var38;
                Statics.field2650 = var39;
                Statics.field2238 = var40;
                Statics.field780 = new class220[Statics.field2660.method3783()][];
                Statics.field3137 = new boolean[Statics.field2660.method3783()];
                class241 var41 = Statics.field326;
                Statics.field3282 = var41;
                class257.method1596(Statics.field326);
                class247.method3819(Statics.field326);
                class248.method3117(Statics.field326);
                class255.method190(Statics.field326);
                Statics.field3189 = new class98();
                class258.method105(Statics.field326, Statics.field958, Statics.field3395);
                class241 var42 = Statics.field326;
                class241 var43 = Statics.field958;
                Statics.field3368 = var42;
                Statics.field3369 = var43;
                class241 var44 = Statics.field326;
                class241 var45 = Statics.field958;
                Statics.field3312 = var45;
                if (var44.method3728()) {
                    Statics.field3294 = var44.method3798(35);
                    Statics.field3301 = new class246[Statics.field3294];
                    for (int var46 = 0; var46 < Statics.field3294; var46++) {
                        byte[] var47 = var44.method3754(35, var46);
                        if (var47 != null) {
                            Statics.field3301[var46] = new class246(var46);
                            Statics.field3301[var46].method3892(new class177(var47));
                            Statics.field3301[var46].method3906();
                        }
                    }
                }
                class93.field1453 = class229.field2879;
                class93.field1449 = 60;
                field954 = 80;
            } else {
                class93.field1453 = class229.field3011 + Statics.field326.method3839() + "%";
                class93.field1449 = 60;
            }
        } else if (field954 == 80) {
            int var48 = 0;
            if (Statics.field2126 == null) {
                Statics.field2126 = class290.method3863(Statics.field958, "compass", "");
            } else {
                var48++;
            }
            if (Statics.field2127 == null) {
                Statics.field2127 = class290.method3863(Statics.field958, "mapedge", "");
            } else {
                var48++;
            }
            if (Statics.field262 == null) {
                Statics.field262 = class290.method3638(Statics.field958, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field2851 == null) {
                Statics.field2851 = class290.method1389(Statics.field958, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field2151 == null) {
                Statics.field2151 = class290.method1389(Statics.field958, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field2334 == null) {
                Statics.field2334 = class290.method1389(Statics.field958, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field291 == null) {
                Statics.field291 = class290.method1389(Statics.field958, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field528 == null) {
                Statics.field528 = class290.method1389(Statics.field958, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field454 == null) {
                Statics.field454 = class290.method1389(Statics.field958, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field386 == null) {
                Statics.field386 = class290.method3638(Statics.field958, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field614 == null) {
                Statics.field614 = class290.method3638(Statics.field958, "mod_icons", "");
            } else {
                var48++;
            }
            if (var48 < 11) {
                class93.field1453 = class229.field2880 + var48 * 100 / 12 + "%";
                class93.field1449 = 70;
            } else {
                Statics.field3660 = Statics.field614;
                Statics.field2127.method4692();
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 41.0D) - 20;
                Statics.field262[0].method4671(var49 + var52, var50 + var52, var51 + var52);
                class93.field1453 = class229.field3044;
                class93.field1449 = 70;
                field954 = 90;
            }
        } else if (field954 == 90) {
            if (Statics.field2557.method3728()) {
                class126 var53 = new class126(Statics.field2557, Statics.field958, 20, 0.8D, field998 ? 64 : 128);
                class137.method2353(var53);
                class137.method2354(0.8D);
                class93.field1453 = class229.field2883;
                class93.field1449 = 90;
                field954 = 110;
            } else {
                class93.field1453 = class229.field2882 + Statics.field2557.method3839() + "%";
                class93.field1449 = 90;
            }
        } else if (field954 == 110) {
            Statics.field538 = new class72();
            Statics.field723.method2670(Statics.field538, 10);
            class93.field1453 = class229.field2884;
            class93.field1449 = 94;
            field954 = 120;
        } else if (field954 == 120) {
            if (Statics.field812.method3723("huffman", "")) {
                class169 var54 = new class169(Statics.field812.method3745("huffman", ""));
                class269.method163(var54);
                class93.field1453 = class229.field2886;
                class93.field1449 = 96;
                field954 = 130;
            } else {
                class93.field1453 = class229.field2904 + "%";
                class93.field1449 = 96;
            }
        } else if (field954 == 130) {
            if (!Statics.field2444.method3728()) {
                class93.field1453 = class229.field2887 + Statics.field2444.method3839() * 4 / 5 + "%";
                class93.field1449 = 100;
            } else if (!Statics.field607.method3728()) {
                class93.field1453 = class229.field2887 + (80 + Statics.field607.method3839() / 6) + "%";
                class93.field1449 = 100;
            } else if (Statics.field3395.method3728()) {
                class93.field1453 = class229.field3129;
                class93.field1449 = 98;
                field954 = 140;
            } else {
                class93.field1453 = class229.field2887 + (96 + Statics.field3395.method3839() / 50) + "%";
                class93.field1449 = 100;
            }
        } else if (field954 == 140) {
            if (Statics.field2011.method3747(class41.field556.field555)) {
                if (Statics.field2364 == null) {
                    Statics.field2364 = new class292();
                    Statics.field2364.method4840(Statics.field2011, Statics.field2558, field1161, Statics.field262);
                }
                int var55 = Statics.field2364.method4841();
                if (var55 < 100) {
                    class93.field1453 = class229.field2889 + (var55 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1453 = class229.field2890;
                    class93.field1449 = 100;
                    field954 = 150;
                }
            } else {
                class93.field1453 = class229.field2889 + Statics.field2011.method3734(class41.field556.field555) / 10 + "%";
            }
        } else if (field954 == 150) {
            method2347(10);
        }
    }

    @ObfuscatedName("be.fx(IZZZB)Lio;")
    public static class241 method992(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class163 var4 = null;
        if (class157.field2264 != null) {
            var4 = new class163(arg0, class157.field2264, Statics.field385[arg0], 1000000);
        }
        return new class241(var4, Statics.field270, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fb(I)V")
    public final void method1045() {
        try {
            if (field960 == 0) {
                if (Statics.field332 != null) {
                    Statics.field332.method2705();
                    Statics.field332 = null;
                }
                Statics.field3729 = null;
                field1121 = false;
                field961 = 0;
                field960 = 1;
            }
            if (field960 == 1) {
                if (Statics.field3729 == null) {
                    Statics.field3729 = Statics.field723.method2669(Statics.field411, Statics.field761);
                }
                if (Statics.field3729.field2240 == 2) {
                    throw new IOException();
                }
                if (Statics.field3729.field2240 == 1) {
                    Statics.field332 = class159.method172((Socket) Statics.field3729.field2246, 40000);
                    Statics.field3729 = null;
                    field960 = 2;
                }
            }
            if (field960 == 2) {
                field970.field2412 = 0;
                field970.method3075(14);
                Statics.field332.method2699(field970.field2419, 0, 1);
                field1160.field2412 = 0;
                field960 = 3;
            }
            if (field960 == 3) {
                if (Statics.field1795 != null) {
                    Statics.field1795.method1848();
                }
                if (Statics.field298 != null) {
                    Statics.field298.method1848();
                }
                if (!Statics.field332.method2713(1)) {
                    return;
                }
                int var1 = Statics.field332.method2702();
                if (Statics.field1795 != null) {
                    Statics.field1795.method1848();
                }
                if (Statics.field298 != null) {
                    Statics.field298.method1848();
                }
                if (var1 != 0) {
                    method245(var1);
                    return;
                }
                field1160.field2412 = 0;
                field960 = 4;
            }
            if (field960 == 4) {
                if (field1160.field2412 < 8) {
                    int var2 = Statics.field332.method2701();
                    if (var2 > 8 - field1160.field2412) {
                        var2 = 8 - field1160.field2412;
                    }
                    if (var2 > 0) {
                        Statics.field332.method2703(field1160.field2419, field1160.field2412, var2);
                        field1160.field2412 += var2;
                    }
                }
                if (field1160.field2412 == 8) {
                    field1160.field2412 = 0;
                    Statics.field877 = field1160.method2890();
                    field960 = 5;
                }
            }
            if (field960 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field877 >> 32), (int) (Statics.field877 & 0xFFFFFFFFFFFFFFFFL) };
                field970.field2412 = 0;
                field970.method3075(1);
                field970.method3075(class93.field1458.method12());
                field970.method2872(var3[0]);
                field970.method2872(var3[1]);
                field970.method2872(var3[2]);
                field970.method2872(var3[3]);
                switch(class93.field1458.field2210) {
                    case 0:
                        field970.field2412 += 8;
                        break;
                    case 1:
                    case 3:
                        field970.method2871(Statics.field760);
                        field970.field2412 += 5;
                        break;
                    case 2:
                        field970.method2872((Integer) Statics.field3187.field1323.get(class274.method583(class93.field1459)));
                        field970.field2412 += 4;
                }
                field970.method2875(class93.field1457);
                field970.method2905(class91.field1423, class91.field1421);
                field1015.field2412 = 0;
                if (field1189 == 40) {
                    field1015.method3075(18);
                } else {
                    field1015.method3075(16);
                }
                field1015.method2903(0);
                int var4 = field1015.field2412;
                field1015.method2872(147);
                field1015.method3002(field970.field2419, 0, field970.field2412);
                int var5 = field1015.field2412;
                field1015.method2875(class93.field1459);
                field1015.method3075((field1142 ? 1 : 0) << 1 | (field998 ? 1 : 0));
                field1015.method2903(Statics.field2287);
                field1015.method2903(Statics.field726);
                method3866(field1015);
                field1015.method2875(Statics.field256);
                field1015.method2872(Statics.field1324);
                class177 var6 = new class177(Statics.field2434.method5018());
                Statics.field2434.method5023(var6);
                field1015.method3002(var6.field2419, 0, var6.field2419.length);
                field1015.method3075(Statics.field586);
                field1015.method2872(0);
                field1015.method2872(Statics.field699.field3216);
                field1015.method2872(Statics.field957.field3216);
                field1015.method2872(Statics.field326.field3216);
                field1015.method2872(Statics.field2444.field3216);
                field1015.method2872(Statics.field2274.field3216);
                field1015.method2872(Statics.field33.field3216);
                field1015.method2872(Statics.field1.field3216);
                field1015.method2872(Statics.field1307.field3216);
                field1015.method2872(Statics.field958.field3216);
                field1015.method2872(Statics.field2557.field3216);
                field1015.method2872(Statics.field812.field3216);
                field1015.method2872(Statics.field2278.field3216);
                field1015.method2872(Statics.field607.field3216);
                field1015.method2872(Statics.field3395.field3216);
                field1015.method2872(Statics.field550.field3216);
                field1015.method2872(Statics.field882.field3216);
                field1015.method2872(Statics.field2011.field3216);
                field1015.method2868(var3, var5, field1015.field2412);
                field1015.method3009(field1015.field2412 - var4);
                Statics.field332.method2699(field1015.field2419, 0, field1015.field2412);
                field970.method3121(var3);
                for (int var7 = 0; var7 < 4; var7++) {
                    var3[var7] += 50;
                }
                field1160.method3121(var3);
                field960 = 6;
            }
            if (field960 == 6 && Statics.field332.method2701() > 0) {
                int var8 = Statics.field332.method2702();
                if (var8 == 21 && field1189 == 20) {
                    field960 = 7;
                } else if (var8 == 2) {
                    field960 = 9;
                } else if (var8 == 15 && field1189 == 40) {
                    field1070 = -1;
                    field960 = 13;
                } else if (var8 == 23 && field962 < 1) {
                    field962++;
                    field960 = 0;
                } else if (var8 == 29) {
                    field960 = 11;
                } else {
                    method245(var8);
                    return;
                }
            }
            if (field960 == 7 && Statics.field332.method2701() > 0) {
                field963 = (Statics.field332.method2702() + 3) * 60;
                field960 = 8;
            }
            if (field960 == 8) {
                field961 = 0;
                class93.method1268(class229.field3104, class229.field2895, field963 / 60 + class229.field2896);
                if (--field963 <= 0) {
                    field960 = 0;
                }
            } else {
                if (field960 == 9 && Statics.field332.method2701() >= 13) {
                    boolean var9 = Statics.field332.method2702() == 1;
                    Statics.field332.method2703(field1160.field2419, 0, 4);
                    field1160.field2412 = 0;
                    boolean var10 = false;
                    if (var9) {
                        int var11 = field1160.method3116() << 24;
                        int var12 = var11 | field1160.method3116() << 16;
                        int var13 = var12 | field1160.method3116() << 8;
                        int var14 = var13 | field1160.method3116();
                        int var15 = class274.method583(class93.field1459);
                        if (Statics.field3187.field1323.size() >= 10 && !Statics.field3187.field1323.containsKey(var15)) {
                            Iterator var16 = Statics.field3187.field1323.entrySet().iterator();
                            var16.next();
                            var16.remove();
                        }
                        Statics.field3187.field1323.put(var15, var14);
                        class82.method1005();
                    }
                    field1095 = Statics.field332.method2702();
                    field1097 = Statics.field332.method2702() == 1;
                    field1049 = Statics.field332.method2702();
                    field1049 <<= 0x8;
                    field1049 += Statics.field332.method2702();
                    field1050 = Statics.field332.method2702();
                    Statics.field332.method2703(field1160.field2419, 0, 1);
                    field1160.field2412 = 0;
                    field974 = field1160.method3116();
                    Statics.field332.method2703(field1160.field2419, 0, 2);
                    field1160.field2412 = 0;
                    field1070 = field1160.method2886();
                    try {
                        client var17 = Statics.field2286;
                        JSObject.getWindow(var17).call("zap", (Object[]) null);
                    } catch (Throwable var45) {
                    }
                    field960 = 10;
                }
                if (field960 != 10) {
                    if (field960 == 11 && Statics.field332.method2701() >= 2) {
                        field1160.field2412 = 0;
                        Statics.field332.method2703(field1160.field2419, 0, 2);
                        field1160.field2412 = 0;
                        Statics.field866 = field1160.method2886();
                        field960 = 12;
                    }
                    if (field960 == 12 && Statics.field332.method2701() >= Statics.field866) {
                        field1160.field2412 = 0;
                        Statics.field332.method2703(field1160.field2419, 0, Statics.field866);
                        field1160.field2412 = 0;
                        String var40 = field1160.method2892();
                        String var41 = field1160.method2892();
                        String var42 = field1160.method2892();
                        class93.method1268(var40, var41, var42);
                        method2347(10);
                    }
                    if (field960 == 13) {
                        if (field1070 == -1) {
                            if (Statics.field332.method2701() < 2) {
                                return;
                            }
                            Statics.field332.method2703(field1160.field2419, 0, 2);
                            field1160.field2412 = 0;
                            field1070 = field1160.method2886();
                        }
                        if (Statics.field332.method2701() >= field1070) {
                            Statics.field332.method2703(field1160.field2419, 0, field1070);
                            field1160.field2412 = 0;
                            int var43 = field1070;
                            method966();
                            Statics.method49(field1160);
                            if (field1160.field2412 != var43) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field961++;
                        if (field961 > 2000) {
                            if (field962 < 1) {
                                if (Statics.field761 == Statics.field484) {
                                    Statics.field761 = Statics.field2854;
                                } else {
                                    Statics.field761 = Statics.field484;
                                }
                                field962++;
                                field960 = 0;
                            } else {
                                method245(-3);
                            }
                        }
                    }
                } else if (Statics.field332.method2701() >= field1070) {
                    field1160.field2412 = 0;
                    Statics.field332.method2703(field1160.field2419, 0, field1070);
                    field937 = 1L;
                    field1109 = -1;
                    Statics.field538.field879 = 0;
                    Statics.field448 = true;
                    field941 = true;
                    field1193 = -1L;
                    class284.field3759 = new class195();
                    field970.field2412 = 0;
                    field1160.field2412 = 0;
                    field974 = -1;
                    field934 = -1;
                    field978 = -1;
                    field979 = -1;
                    field1054 = 0;
                    field980 = 0;
                    field1122 = 0;
                    field944 = 0;
                    method1035();
                    class60.field752 = 0;
                    class99.method243();
                    field1081 = 0;
                    field1083 = false;
                    field1029 = 0;
                    field992 = (int) (Math.random() * 100.0D) - 50;
                    field994 = (int) (Math.random() * 110.0D) - 55;
                    field996 = (int) (Math.random() * 80.0D) - 40;
                    field999 = (int) (Math.random() * 120.0D) - 60;
                    field1001 = (int) (Math.random() * 30.0D) - 20;
                    field1012 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field1162 = 0;
                    field1155 = -1;
                    field1019 = 0;
                    field1188 = 0;
                    field952 = class92.field1424;
                    field1053 = class92.field1424;
                    field1171 = 0;
                    class97.field1510 = 0;
                    for (int var19 = 0; var19 < 2048; var19++) {
                        class97.field1509[var19] = null;
                        class97.field1515[var19] = 1;
                    }
                    for (int var20 = 0; var20 < 2048; var20++) {
                        field1048[var20] = null;
                    }
                    for (int var21 = 0; var21 < 32768; var21++) {
                        field1166[var21] = null;
                    }
                    field1101 = -1;
                    field1060.method3323();
                    field1061.method3323();
                    for (int var22 = 0; var22 < 4; var22++) {
                        for (int var23 = 0; var23 < 104; var23++) {
                            for (int var24 = 0; var24 < 104; var24++) {
                                field1058[var22][var23][var24] = null;
                            }
                        }
                    }
                    field1059 = new class197();
                    field1194 = 0;
                    field1013 = 0;
                    field953 = 0;
                    for (int var25 = 0; var25 < Statics.field3286; var25++) {
                        class245 var26 = (class245) class245.field3290.method3239((long) var25);
                        class245 var27;
                        if (var26 == null) {
                            byte[] var28 = Statics.field3285.method3754(16, var25);
                            class245 var29 = new class245();
                            if (var28 != null) {
                                var29.method3877(new class177(var28));
                            }
                            class245.field3290.method3241(var29, (long) var25);
                            var27 = var29;
                        } else {
                            var27 = var26;
                        }
                        if (var27 != null) {
                            class215.field2619[var25] = 0;
                            class215.field2616[var25] = 0;
                        }
                    }
                    Statics.field3189.method1627();
                    field1096 = -1;
                    if (field1088 != -1) {
                        int var31 = field1088;
                        if (var31 != -1 && Statics.field3137[var31]) {
                            Statics.field2660.method3739(var31);
                            if (Statics.field780[var31] != null) {
                                boolean var32 = true;
                                for (int var33 = 0; var33 < Statics.field780[var31].length; var33++) {
                                    if (Statics.field780[var31][var33] != null) {
                                        if (Statics.field780[var31][var33].field2651 == 2) {
                                            var32 = false;
                                        } else {
                                            Statics.field780[var31][var33] = null;
                                        }
                                    }
                                }
                                if (var32) {
                                    Statics.field780[var31] = null;
                                }
                                Statics.field3137[var31] = false;
                            }
                        }
                    }
                    for (class69 var34 = (class69) field1089.method3251(); var34 != null; var34 = (class69) field1089.method3256()) {
                        method3(var34, true);
                    }
                    field1088 = -1;
                    field1089 = new class194(8);
                    field1011 = null;
                    method1035();
                    field1199.method3631((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var35 = 0; var35 < 8; var35++) {
                        field969[var35] = null;
                        field1055[var35] = false;
                    }
                    class64.field795 = new class194(32);
                    field935 = true;
                    for (int var36 = 0; var36 < 100; var36++) {
                        field965[var36] = true;
                    }
                    field970.method3115(67);
                    class183 var37 = field970;
                    int var38 = field1142 ? 2 : 1;
                    var37.method3075(var38);
                    field970.method2903(Statics.field2287);
                    field970.method2903(Statics.field726);
                    field1153 = null;
                    Statics.field379 = 0;
                    Statics.field354 = null;
                    for (int var39 = 0; var39 < 8; var39++) {
                        field931[var39] = new class17();
                    }
                    Statics.field1532 = null;
                    Statics.method49(field1160);
                    Statics.field521 = -1;
                    method1036(false);
                    field974 = -1;
                }
            }
        } catch (IOException var46) {
            if (field962 < 1) {
                if (Statics.field761 == Statics.field484) {
                    Statics.field761 = Statics.field2854;
                } else {
                    Statics.field761 = Statics.field484;
                }
                field962++;
                field960 = 0;
            } else {
                method245(-2);
            }
        }
    }

    @ObfuscatedName("bp.fh(I)V")
    public static void method966() {
        field970.field2412 = 0;
        field1160.field2412 = 0;
        field974 = -1;
        field934 = -1;
        field978 = -1;
        field979 = -1;
        field1070 = 0;
        field1054 = 0;
        field980 = 0;
        method1035();
        field1162 = 0;
        field1019 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1048[var0] = null;
        }
        Statics.field844 = null;
        for (int var1 = 0; var1 < field1166.length; var1++) {
            class87 var2 = field1166[var1];
            if (var2 != null) {
                var2.field1261 = -1;
                var2.field1262 = false;
            }
        }
        class64.field795 = new class194(32);
        method2347(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field965[var3] = true;
        }
        field970.method3115(67);
        class183 var4 = field970;
        int var5 = field1142 ? 2 : 1;
        var4.method3075(var5);
        field970.method2903(Statics.field2287);
        field970.method2903(Statics.field726);
    }

    @ObfuscatedName("ar.fj(II)V")
    public static void method245(int arg0) {
        if (arg0 == -3) {
            class93.method1268(class229.field2897, class229.field2969, class229.field2899);
        } else if (arg0 == -2) {
            class93.method1268(class229.field2900, class229.field2901, class229.field2982);
        } else if (arg0 == -1) {
            class93.method1268(class229.field2903, class229.field2921, class229.field2952);
        } else if (arg0 == 3) {
            class93.field1451 = 3;
        } else if (arg0 == 4) {
            class93.method1268(class229.field3014, class229.field2907, class229.field2908);
        } else if (arg0 == 5) {
            class93.method1268(class229.field3116, class229.field3113, class229.field2911);
        } else if (arg0 == 6) {
            class93.method1268(class229.field3105, class229.field3059, class229.field2932);
        } else if (arg0 == 7) {
            class93.method1268(class229.field2915, class229.field2916, class229.field3017);
        } else if (arg0 == 8) {
            class93.method1268(class229.field2918, class229.field2919, class229.field3021);
        } else if (arg0 == 9) {
            class93.method1268(class229.field2935, class229.field2922, class229.field2861);
        } else if (arg0 == 10) {
            class93.method1268(class229.field2891, class229.field3084, class229.field2926);
        } else if (arg0 == 11) {
            class93.method1268(class229.field2927, class229.field3115, class229.field2867);
        } else if (arg0 == 12) {
            class93.method1268(class229.field3083, class229.field2931, class229.field3005);
        } else if (arg0 == 13) {
            class93.method1268(class229.field2933, class229.field2934, class229.field2923);
        } else if (arg0 == 14) {
            class93.method1268(class229.field2936, class229.field2937, class229.field2938);
        } else if (arg0 == 16) {
            class93.method1268(class229.field2939, class229.field2940, class229.field2912);
        } else if (arg0 == 17) {
            class93.method1268(class229.field2942, class229.field3032, class229.field2944);
        } else if (arg0 == 18) {
            class93.method1268(class229.field2881, class229.field2878, class229.field2875);
        } else if (arg0 == 19) {
            class93.method1268(class229.field2948, class229.field2949, class229.field3062);
        } else if (arg0 == 20) {
            class93.method1268(class229.field2951, class229.field3034, class229.field2953);
        } else if (arg0 == 22) {
            class93.method1268(class229.field2954, class229.field2971, class229.field2956);
        } else if (arg0 == 23) {
            class93.method1268(class229.field2957, class229.field2958, class229.field3080);
        } else if (arg0 == 24) {
            class93.method1268(class229.field2943, class229.field2961, class229.field2945);
        } else if (arg0 == 25) {
            class93.method1268(class229.field2963, class229.field2990, class229.field2965);
        } else if (arg0 == 26) {
            class93.method1268(class229.field3035, class229.field2967, class229.field2968);
        } else if (arg0 == 27) {
            class93.method1268(class229.field3109, class229.field2970, class229.field3094);
        } else if (arg0 == 31) {
            class93.method1268(class229.field2978, class229.field2979, class229.field2980);
        } else if (arg0 == 32) {
            class93.method1268(class229.field2892, class229.field2885, class229.field2983);
        } else if (arg0 == 37) {
            class93.method1268(class229.field2984, class229.field2985, class229.field3087);
        } else if (arg0 == 38) {
            class93.method1268(class229.field2987, class229.field2988, class229.field2989);
        } else if (arg0 == 55) {
            class93.method1268(class229.field2929, class229.field2894, class229.field3093);
        } else if (arg0 == 56) {
            class93.method1268(class229.field2993, class229.field2994, class229.field2995);
            method2347(11);
            return;
        } else if (arg0 == 57) {
            class93.method1268(class229.field2996, class229.field2997, class229.field2998);
            method2347(11);
            return;
        } else {
            class93.method1268(class229.field2999, class229.field3000, class229.field3001);
        }
        method2347(10);
    }

    @ObfuscatedName("ax.fv(I)V")
    public static final void method543() {
        if (Statics.field332 != null) {
            Statics.field332.method2705();
            Statics.field332 = null;
        }
        method1520();
        Statics.field3635.method2424();
        for (int var0 = 0; var0 < 4; var0++) {
            field988[var0].method2766();
        }
        System.gc();
        class207.field2521 = 1;
        Statics.field15 = null;
        Statics.field630 = -1;
        Statics.field2522 = -1;
        Statics.field2523 = 0;
        Statics.field2307 = false;
        Statics.field2524 = 2;
        field1124 = -1;
        field1165 = false;
        for (class83 var1 = (class83) class83.field1329.method3304(); var1 != null; var1 = (class83) class83.field1329.method3306()) {
            if (var1.field1330 != null) {
                Statics.field619.method1687(var1.field1330);
                var1.field1330 = null;
            }
            if (var1.field1339 != null) {
                Statics.field619.method1687(var1.field1339);
                var1.field1339 = null;
            }
        }
        class83.field1329.method3323();
        method2347(10);
    }

    @ObfuscatedName("cq.fp(I)V")
    public static final void method1520() {
        class263.method2824();
        class250.field3352.method3242();
        class251.method591();
        class259.field3450.method3242();
        class259.field3451.method3242();
        class259.field3492.method3242();
        class259.field3483.method3242();
        class262.field3575.method3242();
        class262.field3567.method3242();
        class260.field3508.method3242();
        class260.field3509.method3242();
        class260.field3510.method3242();
        class264.field3627.method3242();
        class264.field3619.method3242();
        class249.field3343.method3242();
        class249.field3334.method3242();
        class254.method1675();
        class245.method142();
        class258.method968();
        class252.method127();
        class256.field3406.method3242();
        class255.method539();
        class246.field3295.method3242();
        class217.field2632.method3242();
        class220.field2762.method3242();
        class220.field2788.method3242();
        class220.field2653.method3242();
        class220.field2654.method3242();
        ((class126) Statics.field2040).method2149();
        class100.field1545.method3242();
        Statics.field699.method3740();
        Statics.field957.method3740();
        Statics.field2444.method3740();
        Statics.field2274.method3740();
        Statics.field33.method3740();
        Statics.field1.method3740();
        Statics.field1307.method3740();
        Statics.field958.method3740();
        Statics.field2557.method3740();
        Statics.field812.method3740();
        Statics.field2278.method3740();
        Statics.field607.method3740();
    }

    @ObfuscatedName("b.fr(I)V")
    public static final void method164() {
        if (field1122 > 0) {
            method543();
        } else {
            method2347(40);
            Statics.field311 = Statics.field332;
            Statics.field332 = null;
        }
    }

    @ObfuscatedName("client.fq(I)V")
    public final void method1046() {
        if (field980 > 1) {
            field980--;
        }
        if (field1122 > 0) {
            field1122--;
        }
        if (field1121) {
            field1121 = false;
            method164();
            return;
        }
        if (!field1066) {
            method4085();
        }
        for (int var1 = 0; var1 < 100 && this.method1120(); var1++) {
        }
        if (field1189 != 30) {
            return;
        }
        while (true) {
            class283 var2 = (class283) class284.field3759.method3273();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                Object var5 = Statics.field538.field875;
                synchronized (Statics.field538.field875) {
                    if (!field1128) {
                        Statics.field538.field879 = 0;
                    } else if (class60.field744 != 0 || Statics.field538.field879 >= 40) {
                        field970.method3115(223);
                        field970.method3075(0);
                        int var6 = field970.field2412;
                        int var7 = 0;
                        for (int var8 = 0; var8 < Statics.field538.field879 && field970.field2412 - var6 < 240; var8++) {
                            var7++;
                            int var9 = Statics.field538.field878[var8];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 502) {
                                var9 = 502;
                            }
                            int var10 = Statics.field538.field876[var8];
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > 764) {
                                var10 = 764;
                            }
                            int var11 = var9 * 765 + var10;
                            if (Statics.field538.field878[var8] == -1 && Statics.field538.field876[var8] == -1) {
                                var10 = -1;
                                var9 = -1;
                                var11 = 524287;
                            }
                            if (field986 != var10 || field939 != var9) {
                                int var12 = var10 - field986;
                                field986 = var10;
                                int var13 = var9 - field939;
                                field939 = var9;
                                if (field1109 < 8 && var12 >= -32 && var12 <= 31 && var13 >= -32 && var13 <= 31) {
                                    var12 += 32;
                                    var13 += 32;
                                    field970.method2903((field1109 << 12) + (var12 << 6) + var13);
                                    field1109 = 0;
                                } else if (field1109 < 8) {
                                    field970.method2871((field1109 << 19) + 8388608 + var11);
                                    field1109 = 0;
                                } else {
                                    field970.method2872((field1109 << 19) + -1073741824 + var11);
                                    field1109 = 0;
                                }
                            } else if (field1109 < 2047) {
                                field1109++;
                            }
                        }
                        field970.method2881(field970.field2412 - var6);
                        if (var7 >= Statics.field538.field879) {
                            Statics.field538.field879 = 0;
                        } else {
                            Statics.field538.field879 -= var7;
                            for (int var14 = 0; var14 < Statics.field538.field879; var14++) {
                                Statics.field538.field876[var14] = Statics.field538.field876[var7 + var14];
                                Statics.field538.field878[var14] = Statics.field538.field878[var7 + var14];
                            }
                        }
                    }
                }
                if (class60.field744 == 1 || !Statics.field684 && class60.field744 == 4 || class60.field744 == 2) {
                    long var16 = (class60.field759 - field937 * -1L) / 50L;
                    if (var16 > 4095L) {
                        var16 = 4095L;
                    }
                    field937 = class60.field759 * -1L;
                    int var18 = class60.field755;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field726) {
                        var18 = Statics.field726;
                    }
                    int var19 = class60.field756;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > Statics.field2287) {
                        var19 = Statics.field2287;
                    }
                    int var20 = (int) var16;
                    field970.method3115(168);
                    field970.method2903((class60.field744 == 2 ? 1 : 0) + (var20 << 1));
                    field970.method2903(var19);
                    field970.method2903(var18);
                }
                if (class51.field654 > 0) {
                    field970.method3115(207);
                    field970.method2903(0);
                    int var21 = field970.field2412;
                    long var22 = class179.method1665();
                    for (int var24 = 0; var24 < class51.field654; var24++) {
                        long var25 = var22 - field1193;
                        if (var25 > 16777215L) {
                            var25 = 16777215L;
                        }
                        field1193 = var22;
                        field970.method2908(class51.field667[var24]);
                        field970.method2924((int) var25);
                    }
                    field970.method3009(field970.field2412 - var21);
                }
                if (field1018 > 0) {
                    field1018--;
                }
                if (class51.field661[96] || class51.field661[97] || class51.field661[98] || class51.field661[99]) {
                    field1006 = true;
                }
                if (field1006 && field1018 <= 0) {
                    field1018 = 20;
                    field1006 = false;
                    field970.method3115(147);
                    field970.method2916(field1012);
                    field970.method2903(field1119);
                }
                if (Statics.field448 && !field941) {
                    field941 = true;
                    field970.method3115(211);
                    field970.method3075(1);
                }
                if (!Statics.field448 && field941) {
                    field941 = false;
                    field970.method3115(211);
                    field970.method3075(0);
                }
                if (Statics.field861 != field1155) {
                    field1155 = Statics.field861;
                    int var27 = Statics.field861;
                    int[] var28 = Statics.field870.field3795;
                    int var29 = var28.length;
                    for (int var30 = 0; var30 < var29; var30++) {
                        var28[var30] = 0;
                    }
                    for (int var31 = 1; var31 < 103; var31++) {
                        int var32 = (103 - var31) * 2048 + 24628;
                        for (int var33 = 1; var33 < 103; var33++) {
                            if ((class62.field777[var27][var33][var31] & 0x18) == 0) {
                                Statics.field3635.method2458(var28, var32, 512, var27, var33, var31);
                            }
                            if (var27 < 3 && (class62.field777[var27 + 1][var33][var31] & 0x8) != 0) {
                                Statics.field3635.method2458(var28, var32, 512, var27 + 1, var33, var31);
                            }
                            var32 += 4;
                        }
                    }
                    int var34 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var35 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field870.method4745();
                    for (int var36 = 1; var36 < 103; var36++) {
                        for (int var37 = 1; var37 < 103; var37++) {
                            if ((class62.field777[var27][var37][var36] & 0x18) == 0) {
                                method973(var27, var37, var36, var34, var35);
                            }
                            if (var27 < 3 && (class62.field777[var27 + 1][var37][var36] & 0x8) != 0) {
                                method973(var27 + 1, var37, var36, var34, var35);
                            }
                        }
                    }
                    field1156 = 0;
                    for (int var38 = 0; var38 < 104; var38++) {
                        for (int var39 = 0; var39 < 104; var39++) {
                            int var40 = Statics.field3635.method2453(Statics.field861, var38, var39);
                            if (var40 != 0) {
                                int var41 = var40 >> 14 & 0x7FFF;
                                int var42 = class259.method997(var41).field3464;
                                if (var42 >= 0) {
                                    int var43 = var38;
                                    int var44 = var39;
                                    if (var42 != 22 && var42 != 29 && var42 != 34 && var42 != 36 && var42 != 46 && var42 != 47 && var42 != 48) {
                                        int[][] var45 = field988[Statics.field861].field2321;
                                        for (int var46 = 0; var46 < 10; var46++) {
                                            int var47 = (int) (Math.random() * 4.0D);
                                            if (var47 == 0 && var43 > 0 && var43 > var38 - 3 && (var45[var43 - 1][var44] & 0x1240108) == 0) {
                                                var43--;
                                            }
                                            if (var47 == 1 && var43 < 103 && var43 < var38 + 3 && (var45[var43 + 1][var44] & 0x1240180) == 0) {
                                                var43++;
                                            }
                                            if (var47 == 2 && var44 > 0 && var44 > var39 - 3 && (var45[var43][var44 - 1] & 0x1240102) == 0) {
                                                var44--;
                                            }
                                            if (var47 == 3 && var44 < 103 && var44 < var39 + 3 && (var45[var43][var44 + 1] & 0x1240120) == 0) {
                                                var44++;
                                            }
                                        }
                                    }
                                    field1159[field1156] = Statics.field3301[var42].method3896(false);
                                    field1157[field1156] = var43;
                                    field1036[field1156] = var44;
                                    field1156++;
                                }
                            }
                        }
                    }
                    Statics.field3327.method4664();
                }
                if (field1189 != 30) {
                    return;
                }
                for (class77 var48 = (class77) field1059.method3304(); var48 != null; var48 = (class77) field1059.method3306()) {
                    if (var48.field1209 > 0) {
                        var48.field1209--;
                    }
                    if (var48.field1209 == 0) {
                        if (var48.field1212 >= 0) {
                            int var49 = var48.field1212;
                            int var50 = var48.field1214;
                            class259 var51 = class259.method997(var49);
                            if (var50 == 11) {
                                var50 = 10;
                            }
                            if (var50 >= 5 && var50 <= 8) {
                                var50 = 4;
                            }
                            boolean var52 = var51.method4143(var50);
                            if (!var52) {
                                continue;
                            }
                        }
                        method655(var48.field1218, var48.field1219, var48.field1210, var48.field1211, var48.field1212, var48.field1213, var48.field1214);
                        var48.method3294();
                    } else {
                        if (var48.field1217 > 0) {
                            var48.field1217--;
                        }
                        if (var48.field1217 == 0 && var48.field1210 >= 1 && var48.field1211 >= 1 && var48.field1210 <= 102 && var48.field1211 <= 102) {
                            if (var48.field1215 >= 0) {
                                int var53 = var48.field1215;
                                int var54 = var48.field1221;
                                class259 var55 = class259.method997(var53);
                                if (var54 == 11) {
                                    var54 = 10;
                                }
                                if (var54 >= 5 && var54 <= 8) {
                                    var54 = 4;
                                }
                                boolean var56 = var55.method4143(var54);
                                if (!var56) {
                                    continue;
                                }
                            }
                            method655(var48.field1218, var48.field1219, var48.field1210, var48.field1211, var48.field1215, var48.field1208, var48.field1221);
                            var48.field1217 = -1;
                            if (var48.field1215 == var48.field1212 && var48.field1212 == -1) {
                                var48.method3294();
                            } else if (var48.field1215 == var48.field1212 && var48.field1213 == var48.field1208 && var48.field1221 == var48.field1214) {
                                var48.method3294();
                            }
                        }
                    }
                }
                method103();
                field1054++;
                if (field1054 > 750) {
                    method164();
                    return;
                }
                method147();
                method2637();
                int[] var57 = class97.field1511;
                for (int var58 = 0; var58 < class97.field1510; var58++) {
                    class75 var59 = field1048[var57[var58]];
                    if (var59 != null && var59.field1240 > 0) {
                        var59.field1240--;
                        if (var59.field1240 == 0) {
                            var59.field1274 = null;
                        }
                    }
                }
                for (int var60 = 0; var60 < field1171; var60++) {
                    int var61 = field967[var60];
                    class87 var62 = field1166[var61];
                    if (var62 != null && var62.field1240 > 0) {
                        var62.field1240--;
                        if (var62.field1240 == 0) {
                            var62.field1274 = null;
                        }
                    }
                }
                field933++;
                if (field1038 != 0) {
                    field1037 += 20;
                    if (field1037 >= 400) {
                        field1038 = 0;
                    }
                }
                if (Statics.field3200 != null) {
                    field1039++;
                    if (field1039 >= 15) {
                        method667(Statics.field3200);
                        Statics.field3200 = null;
                    }
                }
                class220 var63 = Statics.field674;
                class220 var64 = Statics.field838;
                Statics.field674 = null;
                Statics.field838 = null;
                field1105 = null;
                field1032 = false;
                field1030 = false;
                field1149 = 0;
                while (class51.method24() && field1149 < 128) {
                    if (field1095 >= 2 && class51.field661[82] && Statics.field2153 == 66) {
                        String var65 = class99.method321();
                        Statics.field2286.method749(var65);
                    } else {
                        field1177[field1149] = Statics.field2153;
                        field1150[field1149] = Statics.field3693;
                        field1149++;
                    }
                }
                if (field1088 != -1) {
                    method244(field1088, 0, 0, Statics.field2287, Statics.field726, 0, 0);
                }
                field1113++;
                while (true) {
                    class70 var66;
                    class220 var67;
                    class220 var68;
                    do {
                        var66 = (class70) field983.method3302();
                        if (var66 == null) {
                            while (true) {
                                class70 var69;
                                class220 var70;
                                class220 var71;
                                do {
                                    var69 = (class70) field1129.method3302();
                                    if (var69 == null) {
                                        while (true) {
                                            class70 var72;
                                            class220 var73;
                                            class220 var74;
                                            do {
                                                var72 = (class70) field1127.method3302();
                                                if (var72 == null) {
                                                    this.method1333();
                                                    if (Statics.field2364 != null) {
                                                        Statics.field2364.method4978(Statics.field861, (Statics.field844.field1264 >> 7) + Statics.field353, (Statics.field844.field1236 >> 7) + Statics.field2461, false);
                                                        Statics.field2364.method4862();
                                                    }
                                                    if (field1042 != null) {
                                                        this.method1055();
                                                    }
                                                    if (Statics.field387 != null) {
                                                        method667(Statics.field387);
                                                        field1046++;
                                                        if (class60.field749 == 0) {
                                                            if (!field1045) {
                                                                label952: {
                                                                    label968: {
                                                                        int var83 = method3097();
                                                                        if (field1067 > 2) {
                                                                            if (field1065 == 1) {
                                                                                boolean var84;
                                                                                if (field1067 <= 0) {
                                                                                    var84 = false;
                                                                                } else if (field1076 && class51.field661[81] && field1033 != -1) {
                                                                                    var84 = true;
                                                                                } else {
                                                                                    var84 = false;
                                                                                }
                                                                                if (!var84) {
                                                                                    break label968;
                                                                                }
                                                                            }
                                                                            boolean var85;
                                                                            if (var83 < 0) {
                                                                                var85 = false;
                                                                            } else {
                                                                                int var86 = field1137[var83];
                                                                                if (var86 >= 2000) {
                                                                                    var86 -= 2000;
                                                                                }
                                                                                if (var86 == 1007) {
                                                                                    var85 = true;
                                                                                } else {
                                                                                    var85 = false;
                                                                                }
                                                                            }
                                                                            if (var85) {
                                                                                break label968;
                                                                            }
                                                                        }
                                                                        if (field1067 > 0) {
                                                                            int var87 = field1136;
                                                                            int var88 = field1043;
                                                                            class90 var89 = Statics.field700;
                                                                            method2622(var89.field1414, var89.field1411, var89.field1410, var89.field1413, var89.field1412, var89.field1412, var87, var88);
                                                                            Statics.field700 = null;
                                                                        }
                                                                        break label952;
                                                                    }
                                                                    this.method1062(field1136, field1043);
                                                                }
                                                            } else if (Statics.field592 == Statics.field387 && field1135 != field1041) {
                                                                class220 var75 = Statics.field387;
                                                                byte var76 = 0;
                                                                if (field1091 == 1 && var75.field2661 == 206) {
                                                                    var76 = 1;
                                                                }
                                                                if (var75.field2775[field1135] <= 0) {
                                                                    var76 = 0;
                                                                }
                                                                int var77 = method967(var75);
                                                                boolean var78 = (var77 >> 29 & 0x1) != 0;
                                                                if (var78) {
                                                                    int var79 = field1041;
                                                                    int var80 = field1135;
                                                                    var75.field2775[var80] = var75.field2775[var79];
                                                                    var75.field2776[var80] = var75.field2776[var79];
                                                                    var75.field2775[var79] = -1;
                                                                    var75.field2776[var79] = 0;
                                                                } else if (var76 == 1) {
                                                                    int var81 = field1041;
                                                                    int var82 = field1135;
                                                                    while (var81 != var82) {
                                                                        if (var81 > var82) {
                                                                            var75.method3684(var81 - 1, var81);
                                                                            var81--;
                                                                        } else if (var81 < var82) {
                                                                            var75.method3684(var81 + 1, var81);
                                                                            var81++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var75.method3684(field1135, field1041);
                                                                }
                                                                field970.method3115(123);
                                                                field970.method2959(field1041);
                                                                field970.method2908(var76);
                                                                field970.method2872(Statics.field387.field2657);
                                                                field970.method2917(field1135);
                                                            }
                                                            field1039 = 10;
                                                            class60.field744 = 0;
                                                            Statics.field387 = null;
                                                        } else if (field1046 >= 5 && (class60.field750 > field1136 + 5 || class60.field750 < field1136 - 5 || class60.field758 * 939681921 > field1043 + 5 || class60.field758 * 939681921 < field1043 - 5)) {
                                                            field1045 = true;
                                                        }
                                                    }
                                                    if (class140.method2463()) {
                                                        int var90 = class140.field2098;
                                                        int var91 = class140.field2070;
                                                        field970.method3115(1);
                                                        field970.method3075(5);
                                                        field970.method2910(class51.field661[82] ? (class51.field661[81] ? 2 : 1) : 0);
                                                        field970.method2917(Statics.field2461 + var91);
                                                        field970.method2916(Statics.field353 + var90);
                                                        class140.method2464();
                                                        field1098 = class60.field756;
                                                        field1164 = class60.field755;
                                                        field1038 = 1;
                                                        field1037 = 0;
                                                        field1019 = var90;
                                                        field1188 = var91;
                                                    }
                                                    if (Statics.field674 != var63) {
                                                        if (var63 != null) {
                                                            method667(var63);
                                                        }
                                                        if (Statics.field674 != null) {
                                                            method667(Statics.field674);
                                                        }
                                                    }
                                                    if (Statics.field838 != var64 && field1126 == field1080) {
                                                        if (var64 != null) {
                                                            method667(var64);
                                                        }
                                                        if (Statics.field838 != null) {
                                                            method667(Statics.field838);
                                                        }
                                                    }
                                                    if (Statics.field838 == null) {
                                                        if (field1126 > 0) {
                                                            field1126--;
                                                        }
                                                    } else if (field1126 < field1080) {
                                                        field1126++;
                                                        if (field1126 == field1080) {
                                                            method667(Statics.field838);
                                                        }
                                                    }
                                                    method1009();
                                                    if (field1174) {
                                                        method206();
                                                    }
                                                    for (int var92 = 0; var92 < 5; var92++) {
                                                        int var10002 = field1179[var92]++;
                                                    }
                                                    Statics.field3189.method1650();
                                                    int var93 = ++class60.field752 - 1;
                                                    int var95 = class51.method1032();
                                                    if (var93 > 15000 && var95 > 15000) {
                                                        field1122 = 250;
                                                        class60.field752 = 14500;
                                                        field970.method3115(122);
                                                    }
                                                    field1145++;
                                                    if (field1145 > 500) {
                                                        field1145 = 0;
                                                        int var96 = (int) (Math.random() * 8.0D);
                                                        if ((var96 & 0x1) == 1) {
                                                            field992 += field1200;
                                                        }
                                                        if ((var96 & 0x2) == 2) {
                                                            field994 += field943;
                                                        }
                                                        if ((var96 & 0x4) == 4) {
                                                            field996 += field997;
                                                        }
                                                    }
                                                    if (field992 < -50) {
                                                        field1200 = 2;
                                                    }
                                                    if (field992 > 50) {
                                                        field1200 = -2;
                                                    }
                                                    if (field994 < -55) {
                                                        field943 = 2;
                                                    }
                                                    if (field994 > 55) {
                                                        field943 = -2;
                                                    }
                                                    if (field996 < -40) {
                                                        field997 = 1;
                                                    }
                                                    if (field996 > 40) {
                                                        field997 = -1;
                                                    }
                                                    field1207++;
                                                    if (field1207 > 500) {
                                                        field1207 = 0;
                                                        int var97 = (int) (Math.random() * 8.0D);
                                                        if ((var97 & 0x1) == 1) {
                                                            field999 += field1000;
                                                        }
                                                        if ((var97 & 0x2) == 2) {
                                                            field1001 += field1203;
                                                        }
                                                    }
                                                    if (field999 < -60) {
                                                        field1000 = 2;
                                                    }
                                                    if (field999 > 60) {
                                                        field1000 = -2;
                                                    }
                                                    if (field1001 < -20) {
                                                        field1203 = 1;
                                                    }
                                                    if (field1001 > 10) {
                                                        field1203 = -1;
                                                    }
                                                    for (class68 var98 = (class68) field1196.method3337(); var98 != null; var98 = (class68) field1196.method3338()) {
                                                        if ((long) var98.field833 < class179.method1665() / 1000L - 5L) {
                                                            if (var98.field834 > 0) {
                                                                class99.method1676(5, "", var98.field832 + class229.field3002);
                                                            }
                                                            if (var98.field834 == 0) {
                                                                class99.method1676(5, "", var98.field832 + class229.field3003);
                                                            }
                                                            var98.method3344();
                                                        }
                                                    }
                                                    field976++;
                                                    if (field976 > 50) {
                                                        field970.method3115(183);
                                                    }
                                                    try {
                                                        if (Statics.field332 != null && field970.field2412 > 0) {
                                                            Statics.field332.method2699(field970.field2419, 0, field970.field2412);
                                                            field970.field2412 = 0;
                                                            field976 = 0;
                                                        }
                                                    } catch (IOException var100) {
                                                        method164();
                                                    }
                                                    return;
                                                }
                                                var73 = var72.field851;
                                                if (var73.field2684 < 0) {
                                                    break;
                                                }
                                                var74 = class220.method1162(var73.field2676);
                                            } while (var74 == null || var74.field2655 == null || var73.field2684 >= var74.field2655.length || var74.field2655[var73.field2684] != var73);
                                            class84.method2625(var72);
                                        }
                                    }
                                    var70 = var69.field851;
                                    if (var70.field2684 < 0) {
                                        break;
                                    }
                                    var71 = class220.method1162(var70.field2676);
                                } while (var71 == null || var71.field2655 == null || var70.field2684 >= var71.field2655.length || var71.field2655[var70.field2684] != var70);
                                class84.method2625(var69);
                            }
                        }
                        var67 = var66.field851;
                        if (var67.field2684 < 0) {
                            break;
                        }
                        var68 = class220.method1162(var67.field2676);
                    } while (var68 == null || var68.field2655 == null || var67.field2684 >= var68.field2655.length || var68.field2655[var67.field2684] != var67);
                    class84.method2625(var66);
                }
            }
            field970.method3115(38);
            field970.method3075(0);
            int var4 = field970.field2412;
            class284.method2731(field970);
            field970.method2881(field970.field2412 - var4);
        }
    }

    @ObfuscatedName("m.fk(I)V")
    public static final void method26() {
        if (Statics.field298 != null) {
            Statics.field298.method1818();
        }
        if (Statics.field1795 != null) {
            Statics.field1795.method1818();
        }
    }

    @ObfuscatedName("c.fo(I)V")
    public static final void method103() {
        for (int var0 = 0; var0 < field1029; var0++) {
            int var10002 = field991[var0]--;
            if (field991[var0] >= -10) {
                class106 var2 = field1191[var0];
                if (var2 == null) {
                    class106 var10000 = (class106) null;
                    var2 = class106.method1749(Statics.field2274, field1169[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field991[var0] += var2.method1748();
                    field1191[var0] = var2;
                }
                if (field991[var0] < 0) {
                    int var9;
                    if (field1172[var0] == 0) {
                        var9 = field982;
                    } else {
                        int var3 = (field1172[var0] & 0xFF) * 128;
                        int var4 = field1172[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field844.field1264;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1172[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field844.field1236;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field991[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1167 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class108 var10 = var2.method1756().method1798(Statics.field706);
                        class118 var11 = class118.method1915(var10, 100, var9);
                        var11.method1918(field1170[var0] - 1);
                        Statics.field619.method1686(var11);
                    }
                    field991[var0] = -100;
                }
            } else {
                field1029--;
                for (int var1 = var0; var1 < field1029; var1++) {
                    field1169[var1] = field1169[var1 + 1];
                    field1191[var1] = field1191[var1 + 1];
                    field1170[var1] = field1170[var1 + 1];
                    field991[var1] = field991[var1 + 1];
                    field1172[var1] = field1172[var1 + 1];
                }
                var0--;
            }
        }
        if (!field1165) {
            return;
        }
        boolean var12;
        if (class207.field2521 == 0) {
            var12 = Statics.field458.method3404();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field1163 != 0 && field1124 != -1) {
                class207.method913(Statics.field1, field1124, 0, field1163, false);
            }
            field1165 = false;
        }
    }

    @ObfuscatedName("gy.fu(Ljz;IIII)V")
    public static void method3395(class264 arg0, int arg1, int arg2, int arg3) {
        if (field1029 >= 50 || field1167 == 0 || arg0.field3623 == null || arg1 >= arg0.field3623.length) {
            return;
        }
        int var4 = arg0.field3623[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1169[field1029] = var5;
        field1170[field1029] = var6;
        field991[field1029] = 0;
        field1191[field1029] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1172[field1029] = (var8 << 16) + (var9 << 8) + var7;
        field1029++;
    }

    @ObfuscatedName("be.ft(IIIB)V")
    public static void method995(int arg0, int arg1, int arg2) {
        if (field982 == 0 || arg1 == 0 || field1029 >= 50) {
            return;
        }
        field1169[field1029] = arg0;
        field1170[field1029] = arg1;
        field991[field1029] = arg2;
        field1191[field1029] = null;
        field1172[field1029] = 0;
        field1029++;
    }

    @ObfuscatedName("hq.fy(III)V")
    public static void method3556(int arg0, int arg1) {
        if (field1163 != 0 && arg0 != -1) {
            class207.method913(Statics.field2278, arg0, 0, field1163, false);
            field1165 = true;
        }
    }

    @ObfuscatedName("at.fd(Ljava/lang/String;I)V")
    public static final void method535(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field3187.field1318 = !Statics.field3187.field1318;
            class82.method1005();
            if (Statics.field3187.field1318) {
                class99.method1676(99, "", "Roofs are now all hidden");
            } else {
                class99.method1676(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field942 = !field942;
        }
        if (arg0.equalsIgnoreCase("clickbox")) {
            class134.field1993 = !class134.field1993;
            class99.method1676(99, "", "Clickbox Mode: " + (class134.field1993 ? "AABB" : "Legacy"));
        }
        if (field1095 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field241) {
                    class8.field241 = true;
                    class8.field239 = class12.field272;
                    class99.method1676(99, "", "AABB boxes: All");
                } else if (class8.field239 == class12.field272) {
                    class8.field241 = true;
                    class8.field239 = class12.field283;
                    class99.method1676(99, "", "AABB boxes: Mouse Over");
                } else {
                    class8.field241 = false;
                    class99.method1676(99, "", "AABB boxes: Off");
                }
            }
            if (arg0.equalsIgnoreCase("legacyboxes")) {
                class8.field237 = !class8.field237;
                class99.method1676(99, "", "Show legacy boxes: " + class8.field237);
            }
            if (arg0.equalsIgnoreCase("geotests")) {
                class8.field238 = !class8.field238;
                class99.method1676(99, "", "Show geometry tests: " + class8.field238);
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field942 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field942 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method164();
            }
            if (arg0.equalsIgnoreCase("errortest") && field930 == 2) {
                throw new RuntimeException();
            }
        }
        field970.method3115(234);
        field970.method3075(arg0.length() + 1);
        field970.method2875(arg0);
    }

    @ObfuscatedName("ac.fw(I)V")
    public static final void method206() {
        int var0 = Statics.field394 * 128 + 64;
        int var1 = Statics.field312 * 128 + 64;
        int var2 = method2656(var0, var1, Statics.field861) - Statics.field539;
        if (Statics.field146 < var0) {
            Statics.field146 += Statics.field1879 * (var0 - Statics.field146) / 1000 + Statics.field234;
            if (Statics.field146 > var0) {
                Statics.field146 = var0;
            }
        }
        if (Statics.field146 > var0) {
            Statics.field146 -= Statics.field1879 * (Statics.field146 - var0) / 1000 + Statics.field234;
            if (Statics.field146 < var0) {
                Statics.field146 = var0;
            }
        }
        if (Statics.field766 < var2) {
            Statics.field766 += Statics.field1879 * (var2 - Statics.field766) / 1000 + Statics.field234;
            if (Statics.field766 > var2) {
                Statics.field766 = var2;
            }
        }
        if (Statics.field766 > var2) {
            Statics.field766 -= Statics.field1879 * (Statics.field766 - var2) / 1000 + Statics.field234;
            if (Statics.field766 < var2) {
                Statics.field766 = var2;
            }
        }
        if (Statics.field2285 < var1) {
            Statics.field2285 += Statics.field1879 * (var1 - Statics.field2285) / 1000 + Statics.field234;
            if (Statics.field2285 > var1) {
                Statics.field2285 = var1;
            }
        }
        if (Statics.field2285 > var1) {
            Statics.field2285 -= Statics.field1879 * (Statics.field2285 - var1) / 1000 + Statics.field234;
            if (Statics.field2285 < var1) {
                Statics.field2285 = var1;
            }
        }
        int var3 = Statics.field404 * 128 + 64;
        int var4 = Statics.field2576 * 128 + 64;
        int var5 = method2656(var3, var4, Statics.field861) - Statics.field1359;
        int var6 = var3 - Statics.field146;
        int var7 = var5 - Statics.field766;
        int var8 = var4 - Statics.field2285;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field3425 < var10) {
            Statics.field3425 += Statics.field2055 * (var10 - Statics.field3425) / 1000 + Statics.field1667;
            if (Statics.field3425 > var10) {
                Statics.field3425 = var10;
            }
        }
        if (Statics.field3425 > var10) {
            Statics.field3425 -= Statics.field2055 * (Statics.field3425 - var10) / 1000 + Statics.field1667;
            if (Statics.field3425 < var10) {
                Statics.field3425 = var10;
            }
        }
        int var12 = var11 - Statics.field18;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field18 += Statics.field2055 * var12 / 1000 + Statics.field1667;
            Statics.field18 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field18 -= Statics.field2055 * -var12 / 1000 + Statics.field1667;
            Statics.field18 &= 0x7FF;
        }
        int var13 = var11 - Statics.field18;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field18 = var11;
        }
    }

    @ObfuscatedName("bc.fl(I)V")
    public static final void method1009() {
        int var0 = field992 + Statics.field844.field1264;
        int var1 = field994 + Statics.field844.field1236;
        if (Statics.field763 - var0 < -500 || Statics.field763 - var0 > 500 || Statics.field601 - var1 < -500 || Statics.field601 - var1 > 500) {
            Statics.field763 = var0;
            Statics.field601 = var1;
        }
        if (Statics.field763 != var0) {
            Statics.field763 += (var0 - Statics.field763) / 16;
        }
        if (Statics.field601 != var1) {
            Statics.field601 += (var1 - Statics.field601) / 16;
        }
        if (class60.field749 == 4 && Statics.field684) {
            int var2 = class60.field758 * 939681921 - field1016;
            field1014 = var2 * 2;
            field1016 = var2 == -1 || var2 == 1 ? class60.field758 * 939681921 : (field1016 + class60.field758 * 939681921) / 2;
            int var3 = field1064 - class60.field750;
            field987 = var3 * 2;
            field1064 = var3 == -1 || var3 == 1 ? class60.field750 : (field1064 + class60.field750) / 2;
        } else {
            if (class51.field661[96]) {
                field987 += (-24 - field987) / 2;
            } else if (class51.field661[97]) {
                field987 += (24 - field987) / 2;
            } else {
                field987 /= 2;
            }
            if (class51.field661[98]) {
                field1014 += (12 - field1014) / 2;
            } else if (class51.field661[99]) {
                field1014 += (-12 - field1014) / 2;
            } else {
                field1014 /= 2;
            }
            field1016 = class60.field758 * 939681921;
            field1064 = class60.field750;
        }
        field1012 = field987 / 2 + field1012 & 0x7FF;
        field1119 += field1014 / 2;
        if (field1119 < 128) {
            field1119 = 128;
        }
        if (field1119 > 383) {
            field1119 = 383;
        }
        int var4 = Statics.field763 >> 7;
        int var5 = Statics.field601 >> 7;
        int var6 = method2656(Statics.field763, Statics.field601, Statics.field861);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field861;
                    if (var10 < 3 && (class62.field777[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field770[var10][var8][var9];
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
        if (var12 > field1020) {
            field1020 += (var12 - field1020) / 24;
        } else if (var12 < field1020) {
            field1020 += (var12 - field1020) / 80;
        }
    }

    @ObfuscatedName("d.fi(I)V")
    public static final void method147() {
        int var0 = class97.field1510;
        int[] var1 = class97.field1511;
        for (int var2 = 0; var2 < var0; var2++) {
            class75 var3 = field1048[var1[var2]];
            if (var3 != null) {
                method44(var3, 1);
            }
        }
    }

    @ObfuscatedName("ej.fs(S)V")
    public static final void method2637() {
        for (int var0 = 0; var0 < field1171; var0++) {
            int var1 = field967[var0];
            class87 var2 = field1166[var1];
            if (var2 != null) {
                method44(var2, var2.field1387.field3570);
            }
        }
    }

    @ObfuscatedName("r.fz(Lcb;IS)V")
    public static final void method44(class79 arg0, int arg1) {
        if (arg0.field1281 > field936) {
            method2808(arg0);
        } else if (arg0.field1282 >= field936) {
            method1037(arg0);
        } else {
            arg0.field1242 = arg0.field1246;
            if (arg0.field1289 == 0) {
                arg0.field1293 = 0;
            } else {
                label309: {
                    if (arg0.field1267 != -1 && arg0.field1270 == 0) {
                        class264 var2 = class264.method3098(arg0.field1267);
                        if (arg0.field1294 > 0 && var2.field3616 == 0) {
                            arg0.field1293++;
                            break label309;
                        }
                        if (arg0.field1294 <= 0 && var2.field3632 == 0) {
                            arg0.field1293++;
                            break label309;
                        }
                    }
                    int var3 = arg0.field1264;
                    int var4 = arg0.field1236;
                    int var5 = arg0.field1255[arg0.field1289 - 1] * 128 + arg0.field1243 * 64;
                    int var6 = arg0.field1291[arg0.field1289 - 1] * 128 + arg0.field1243 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field1286 = 1280;
                        } else if (var4 > var6) {
                            arg0.field1286 = 1792;
                        } else {
                            arg0.field1286 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field1286 = 768;
                        } else if (var4 > var6) {
                            arg0.field1286 = 256;
                        } else {
                            arg0.field1286 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field1286 = 1024;
                    } else if (var4 > var6) {
                        arg0.field1286 = 0;
                    }
                    byte var7 = arg0.field1259[arg0.field1289 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field1286 - arg0.field1237 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field1244;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field1268;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field1288;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field1245;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field1268;
                        }
                        arg0.field1242 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class87) {
                            var11 = ((class87) arg0).field1387.field3598;
                        }
                        if (var11) {
                            if (arg0.field1286 != arg0.field1237 && arg0.field1261 == -1 && arg0.field1248 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field1289 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field1289 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field1293 > 0 && arg0.field1289 > 1) {
                                var10 = 8;
                                arg0.field1293--;
                            }
                        } else {
                            if (arg0.field1289 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field1289 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field1293 > 0 && arg0.field1289 > 1) {
                                var10 = 8;
                                arg0.field1293--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field1268 == arg0.field1242 && arg0.field1247 != -1) {
                            arg0.field1242 = arg0.field1247;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field1264 += var10;
                                if (arg0.field1264 > var5) {
                                    arg0.field1264 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field1264 -= var10;
                                if (arg0.field1264 < var5) {
                                    arg0.field1264 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field1236 += var10;
                                if (arg0.field1236 > var6) {
                                    arg0.field1236 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field1236 -= var10;
                                if (arg0.field1236 < var6) {
                                    arg0.field1236 = var6;
                                }
                            }
                        }
                        if (arg0.field1264 == var5 && arg0.field1236 == var6) {
                            arg0.field1289--;
                            if (arg0.field1294 > 0) {
                                arg0.field1294--;
                            }
                        }
                    } else {
                        arg0.field1264 = var5;
                        arg0.field1236 = var6;
                        arg0.field1289--;
                        if (arg0.field1294 > 0) {
                            arg0.field1294--;
                        }
                    }
                }
            }
        }
        if (arg0.field1264 < 128 || arg0.field1236 < 128 || arg0.field1264 >= 13184 || arg0.field1236 >= 13184) {
            arg0.field1267 = -1;
            arg0.field1292 = -1;
            arg0.field1281 = 0;
            arg0.field1282 = 0;
            arg0.field1264 = arg0.field1255[0] * 128 + arg0.field1243 * 64;
            arg0.field1236 = arg0.field1291[0] * 128 + arg0.field1243 * 64;
            arg0.method1391();
        }
        if (Statics.field844 == arg0 && (arg0.field1264 < 1536 || arg0.field1236 < 1536 || arg0.field1264 >= 11776 || arg0.field1236 >= 11776)) {
            arg0.field1267 = -1;
            arg0.field1292 = -1;
            arg0.field1281 = 0;
            arg0.field1282 = 0;
            arg0.field1264 = arg0.field1255[0] * 128 + arg0.field1243 * 64;
            arg0.field1236 = arg0.field1291[0] * 128 + arg0.field1243 * 64;
            arg0.method1391();
        }
        if (arg0.field1248 != 0) {
            if (arg0.field1261 != -1) {
                class79 var12 = null;
                if (arg0.field1261 < 32768) {
                    var12 = field1166[arg0.field1261];
                } else if (arg0.field1261 >= 32768) {
                    var12 = field1048[arg0.field1261 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field1264 - var12.field1264;
                    int var14 = arg0.field1236 - var12.field1236;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field1286 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1262) {
                    arg0.field1261 = -1;
                    arg0.field1262 = false;
                }
            }
            if (arg0.field1263 != -1 && (arg0.field1289 == 0 || arg0.field1293 > 0)) {
                arg0.field1286 = arg0.field1263;
                arg0.field1263 = -1;
            }
            int var15 = arg0.field1286 - arg0.field1237 & 0x7FF;
            if (var15 == 0 && arg0.field1262) {
                arg0.field1261 = -1;
                arg0.field1262 = false;
            }
            if (var15 == 0) {
                arg0.field1287 = 0;
            } else {
                arg0.field1287++;
                if (var15 > 1024) {
                    arg0.field1237 -= arg0.field1248;
                    boolean var16 = true;
                    if (var15 < arg0.field1248 || var15 > 2048 - arg0.field1248) {
                        arg0.field1237 = arg0.field1286;
                        var16 = false;
                    }
                    if (arg0.field1246 == arg0.field1242 && (arg0.field1287 > 25 || var16)) {
                        if (arg0.field1241 == -1) {
                            arg0.field1242 = arg0.field1268;
                        } else {
                            arg0.field1242 = arg0.field1241;
                        }
                    }
                } else {
                    arg0.field1237 += arg0.field1248;
                    boolean var17 = true;
                    if (var15 < arg0.field1248 || var15 > 2048 - arg0.field1248) {
                        arg0.field1237 = arg0.field1286;
                        var17 = false;
                    }
                    if (arg0.field1246 == arg0.field1242 && (arg0.field1287 > 25 || var17)) {
                        if (arg0.field1235 == -1) {
                            arg0.field1242 = arg0.field1268;
                        } else {
                            arg0.field1242 = arg0.field1235;
                        }
                    }
                }
                arg0.field1237 &= 0x7FF;
            }
        }
        method544(arg0);
    }

    @ObfuscatedName("fr.fe(Lcb;B)V")
    public static final void method2808(class79 arg0) {
        int var1 = arg0.field1281 - field936;
        int var2 = arg0.field1277 * 128 + arg0.field1243 * 64;
        int var3 = arg0.field1251 * 128 + arg0.field1243 * 64;
        arg0.field1264 += (var2 - arg0.field1264) / var1;
        arg0.field1236 += (var3 - arg0.field1236) / var1;
        arg0.field1293 = 0;
        arg0.field1286 = arg0.field1283;
    }

    @ObfuscatedName("bz.fc(Lcb;I)V")
    public static final void method1037(class79 arg0) {
        if (field936 == arg0.field1282 || arg0.field1267 == -1 || arg0.field1270 != 0 || arg0.field1275 + 1 > class264.method3098(arg0.field1267).field3622[arg0.field1279]) {
            int var1 = arg0.field1282 - arg0.field1281;
            int var2 = field936 - arg0.field1281;
            int var3 = arg0.field1277 * 128 + arg0.field1243 * 64;
            int var4 = arg0.field1251 * 128 + arg0.field1243 * 64;
            int var5 = arg0.field1278 * 128 + arg0.field1243 * 64;
            int var6 = arg0.field1280 * 128 + arg0.field1243 * 64;
            arg0.field1264 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1236 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1293 = 0;
        arg0.field1286 = arg0.field1283;
        arg0.field1237 = arg0.field1286;
    }

    @ObfuscatedName("ax.ff(Lcb;I)V")
    public static final void method544(class79 arg0) {
        arg0.field1239 = false;
        if (arg0.field1242 != -1) {
            class264 var1 = class264.method3098(arg0.field1242);
            if (var1 == null || var1.field3620 == null) {
                arg0.field1242 = -1;
            } else {
                arg0.field1266++;
                if (arg0.field1265 < var1.field3620.length && arg0.field1266 > var1.field3622[arg0.field1265]) {
                    arg0.field1266 = 1;
                    arg0.field1265++;
                    method3395(var1, arg0.field1265, arg0.field1264, arg0.field1236);
                }
                if (arg0.field1265 >= var1.field3620.length) {
                    arg0.field1266 = 0;
                    arg0.field1265 = 0;
                    method3395(var1, arg0.field1265, arg0.field1264, arg0.field1236);
                }
            }
        }
        if (arg0.field1292 != -1 && field936 >= arg0.field1257) {
            if (arg0.field1273 < 0) {
                arg0.field1273 = 0;
            }
            int var2 = Statics.method3709(arg0.field1292).field3345;
            if (var2 == -1) {
                arg0.field1292 = -1;
            } else {
                class264 var3 = class264.method3098(var2);
                if (var3 == null || var3.field3620 == null) {
                    arg0.field1292 = -1;
                } else {
                    arg0.field1271++;
                    if (arg0.field1273 < var3.field3620.length && arg0.field1271 > var3.field3622[arg0.field1273]) {
                        arg0.field1271 = 1;
                        arg0.field1273++;
                        method3395(var3, arg0.field1273, arg0.field1264, arg0.field1236);
                    }
                    if (arg0.field1273 >= var3.field3620.length && (arg0.field1273 < 0 || arg0.field1273 >= var3.field3620.length)) {
                        arg0.field1292 = -1;
                    }
                }
            }
        }
        if (arg0.field1267 != -1 && arg0.field1270 <= 1) {
            class264 var4 = class264.method3098(arg0.field1267);
            if (var4.field3616 == 1 && arg0.field1294 > 0 && arg0.field1281 <= field936 && arg0.field1282 < field936) {
                arg0.field1270 = 1;
                return;
            }
        }
        if (arg0.field1267 != -1 && arg0.field1270 == 0) {
            class264 var5 = class264.method3098(arg0.field1267);
            if (var5 == null || var5.field3620 == null) {
                arg0.field1267 = -1;
            } else {
                arg0.field1275++;
                if (arg0.field1279 < var5.field3620.length && arg0.field1275 > var5.field3622[arg0.field1279]) {
                    arg0.field1275 = 1;
                    arg0.field1279++;
                    method3395(var5, arg0.field1279, arg0.field1264, arg0.field1236);
                }
                if (arg0.field1279 >= var5.field3620.length) {
                    arg0.field1279 -= var5.field3624;
                    arg0.field1238++;
                    if (arg0.field1238 >= var5.field3630) {
                        arg0.field1267 = -1;
                    } else if (arg0.field1279 >= 0 && arg0.field1279 < var5.field3620.length) {
                        method3395(var5, arg0.field1279, arg0.field1264, arg0.field1236);
                    } else {
                        arg0.field1267 = -1;
                    }
                }
                arg0.field1239 = var5.field3628;
            }
        }
        if (arg0.field1270 > 0) {
            arg0.field1270--;
        }
    }

    @ObfuscatedName("e.gb(Lbx;IIB)V")
    public static void method140(class75 arg0, int arg1, int arg2) {
        if (arg0.field1267 == arg1 && arg1 != -1) {
            int var3 = class264.method3098(arg1).field3633;
            if (var3 == 1) {
                arg0.field1279 = 0;
                arg0.field1275 = 0;
                arg0.field1270 = arg2;
                arg0.field1238 = 0;
            }
            if (var3 == 2) {
                arg0.field1238 = 0;
            }
        } else if (arg1 == -1 || arg0.field1267 == -1 || class264.method3098(arg1).field3626 >= class264.method3098(arg0.field1267).field3626) {
            arg0.field1267 = arg1;
            arg0.field1279 = 0;
            arg0.field1275 = 0;
            arg0.field1270 = arg2;
            arg0.field1238 = 0;
            arg0.field1294 = arg0.field1289;
        }
    }

    @ObfuscatedName("ay.ga(II)V")
    public static void method482(int arg0) {
        field949 = 0L;
        if (arg0 >= 2) {
            field1142 = true;
        } else {
            field1142 = false;
        }
        int var1 = field1142 ? 2 : 1;
        if (var1 == 1) {
            Statics.field2286.method829(765, 503);
        } else {
            Statics.field2286.method829(7680, 2160);
        }
        if (field1189 < 25) {
            return;
        }
        field970.method3115(67);
        class183 var2 = field970;
        int var3 = field1142 ? 2 : 1;
        var2.method3075(var3);
        field970.method2903(Statics.field2287);
        field970.method2903(Statics.field726);
    }

    @ObfuscatedName("client.l(I)V")
    public final void method751() {
        field949 = class179.method1665() + 500L;
        this.method1048();
        if (field1088 != -1) {
            this.method1053(true);
        }
    }

    @ObfuscatedName("client.gz(B)V")
    public void method1048() {
        int var1 = Statics.field2287;
        int var2 = Statics.field726;
        if (this.field722 < var1) {
            int var3 = this.field722;
        }
        if (this.field735 < var2) {
            int var4 = this.field735;
        }
        if (Statics.field3187 == null) {
            return;
        }
        try {
            client var5 = Statics.field2286;
            int var6 = field1142 ? 2 : 1;
            Object[] var7 = new Object[] { var6 };
            JSObject.getWindow(var5).call("resize", var7);
        } catch (Throwable var9) {
        }
    }

    @ObfuscatedName("client.gm(B)V")
    public final void method1049() {
        if (field1088 != -1) {
            method202(field1088);
        }
        for (int var1 = 0; var1 < field1131; var1++) {
            if (field965[var1]) {
                field1134[var1] = true;
            }
            field1120[var1] = field965[var1];
            field965[var1] = false;
        }
        field1133 = field936;
        field1077 = -1;
        field1078 = -1;
        Statics.field592 = null;
        if (field1088 != -1) {
            field1131 = 0;
            method2810(field1088, 0, 0, Statics.field2287, Statics.field726, 0, 0, -1);
        }
        class285.method4573();
        if (field1066) {
            method2725();
        } else if (field1077 != -1) {
            int var2 = field1077;
            int var3 = field1078;
            if (field1067 >= 2 || field1081 != 0 || field1083) {
                int var4 = method3097();
                String var5;
                if (field1081 == 1 && field1067 < 2) {
                    var5 = class229.field3079 + class229.field3015 + field1082 + " " + class89.field1407;
                } else if (field1083 && field1067 < 2) {
                    var5 = field1086 + class229.field3015 + field1087 + " " + class89.field1407;
                } else {
                    var5 = method3696(var4);
                }
                if (field1067 > 2) {
                    var5 = var5 + class89.method2636(16777215) + " " + '/' + " " + (field1067 - 2) + class229.field2855;
                }
                Statics.field2558.method4415(var5, var2 + 4, var3 + 15, 16777215, 0, field936 / 1000);
            }
        }
        if (field1140 == 3) {
            for (int var6 = 0; var6 < field1131; var6++) {
                if (field1120[var6]) {
                    class285.method4581(field977[var6], field1003[var6], field1138[var6], field1139[var6], 16711935, 128);
                } else if (field1134[var6]) {
                    class285.method4581(field977[var6], field1003[var6], field1138[var6], field1139[var6], 16711680, 128);
                }
            }
        }
        class83.method1388(Statics.field861, Statics.field844.field1264, Statics.field844.field1236, field933);
        field933 = 0;
    }

    @ObfuscatedName("j.gn(Ljava/lang/String;ZB)V")
    public static final void method19(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3213.method4404(arg0, 250);
        int var6 = Statics.field3213.method4405(arg0, 250) * 13;
        class285.method4623(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class285.method4615(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3213.method4413(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method70(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3327.method720(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field1131; var11++) {
            if (field977[var11] + field1138[var11] > var7 && field977[var11] < var7 + var9 && field1139[var11] + field1003[var11] > var8 && field1003[var11] < var8 + var10) {
                field1134[var11] = true;
            }
        }
    }

    @ObfuscatedName("bv.ge(IIIII)V")
    public static final void method807(int arg0, int arg1, int arg2, int arg3) {
        field1154++;
        method619(class67.field830);
        boolean var4 = false;
        if (field1101 >= 0) {
            int var5 = class97.field1510;
            int[] var6 = class97.field1511;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field1101 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method619(class67.field826);
        }
        method656(true);
        method619(var4 ? class67.field828 : class67.field825);
        method656(false);
        for (class94 var8 = (class94) field1060.method3304(); var8 != null; var8 = (class94) field1060.method3306()) {
            if (Statics.field861 != var8.field1472 || field936 > var8.field1476) {
                var8.method3294();
            } else if (field936 >= var8.field1475) {
                if (var8.field1479 > 0) {
                    class87 var9 = field1166[var8.field1479 - 1];
                    if (var9 != null && var9.field1264 >= 0 && var9.field1264 < 13312 && var9.field1236 >= 0 && var9.field1236 < 13312) {
                        var8.method1599(var9.field1264, var9.field1236, method2656(var9.field1264, var9.field1236, var8.field1472) - var8.field1474, field936);
                    }
                }
                if (var8.field1479 < 0) {
                    int var10 = -var8.field1479 - 1;
                    class75 var11;
                    if (field1049 == var10) {
                        var11 = Statics.field844;
                    } else {
                        var11 = field1048[var10];
                    }
                    if (var11 != null && var11.field1264 >= 0 && var11.field1264 < 13312 && var11.field1236 >= 0 && var11.field1236 < 13312) {
                        var8.method1599(var11.field1264, var11.field1236, method2656(var11.field1264, var11.field1236, var8.field1472) - var8.field1474, field936);
                    }
                }
                var8.method1597(field933);
                Statics.field3635.method2428(Statics.field861, (int) var8.field1490, (int) var8.field1482, (int) var8.field1485, 60, var8, var8.field1489, -1, false);
            }
        }
        method1();
        method4377(arg0, arg1, arg2, arg3, true);
        int var12 = field1093;
        int var13 = field932;
        int var14 = field1182;
        int var15 = field1074;
        class285.method4574(var12, var13, var12 + var14, var13 + var15);
        class137.method2349();
        if (!field1174) {
            int var16 = field1119;
            if (field1020 / 256 > var16) {
                var16 = field1020 / 256;
            }
            if (field1158[4] && field1192[4] + 128 > var16) {
                var16 = field1192[4] + 128;
            }
            int var17 = field996 + field1012 & 0x7FF;
            int var18 = Statics.field763;
            int var19 = method2656(Statics.field844.field1264, Statics.field844.field1236, Statics.field861) - field927;
            int var20 = Statics.field601;
            int var21 = var16 * 3 + 600;
            int var22 = 2048 - var16 & 0x7FF;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 0;
            int var25 = 0;
            int var26 = var21;
            if (var22 != 0) {
                int var27 = class137.field2043[var22];
                int var28 = class137.field2037[var22];
                int var29 = var25 * var28 - var21 * var27 >> 16;
                var26 = var25 * var27 + var21 * var28 >> 16;
                var25 = var29;
            }
            if (var23 != 0) {
                int var30 = class137.field2043[var23];
                int var31 = class137.field2037[var23];
                int var32 = var24 * var31 + var26 * var30 >> 16;
                var26 = var26 * var31 - var24 * var30 >> 16;
                var24 = var32;
            }
            Statics.field146 = var18 - var24;
            Statics.field766 = var19 - var25;
            Statics.field2285 = var20 - var26;
            Statics.field3425 = var16;
            Statics.field18 = var17;
        }
        int var45;
        if (field1174) {
            int var46;
            if (Statics.field3187.field1318) {
                var46 = Statics.field861;
            } else {
                int var47 = method2656(Statics.field146, Statics.field2285, Statics.field861);
                if (var47 - Statics.field766 >= 800 || (class62.field777[Statics.field861][Statics.field146 >> 7][Statics.field2285 >> 7] & 0x4) == 0) {
                    var46 = 3;
                } else {
                    var46 = Statics.field861;
                }
            }
            var45 = var46;
        } else {
            int var33;
            if (Statics.field3187.field1318) {
                var33 = Statics.field861;
            } else {
                label553: {
                    int var34 = 3;
                    if (Statics.field3425 < 310) {
                        int var35 = Statics.field146 >> 7;
                        int var36 = Statics.field2285 >> 7;
                        int var37 = Statics.field844.field1264 >> 7;
                        int var38 = Statics.field844.field1236 >> 7;
                        if (var35 < 0 || var36 < 0 || var35 >= 104 || var36 >= 104) {
                            var33 = Statics.field861;
                            break label553;
                        }
                        if ((class62.field777[Statics.field861][var35][var36] & 0x4) != 0) {
                            var34 = Statics.field861;
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
                                if ((class62.field777[Statics.field861][var35][var36] & 0x4) != 0) {
                                    var34 = Statics.field861;
                                }
                                var42 += var41;
                                if (var42 >= 65536) {
                                    var42 -= 65536;
                                    if (var36 < var38) {
                                        var36++;
                                    } else if (var36 > var38) {
                                        var36--;
                                    }
                                    if ((class62.field777[Statics.field861][var35][var36] & 0x4) != 0) {
                                        var34 = Statics.field861;
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
                                if ((class62.field777[Statics.field861][var35][var36] & 0x4) != 0) {
                                    var34 = Statics.field861;
                                }
                                var44 += var43;
                                if (var44 >= 65536) {
                                    var44 -= 65536;
                                    if (var35 < var37) {
                                        var35++;
                                    } else if (var35 > var37) {
                                        var35--;
                                    }
                                    if ((class62.field777[Statics.field861][var35][var36] & 0x4) != 0) {
                                        var34 = Statics.field861;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field844.field1264 >= 0 && Statics.field844.field1236 >= 0 && Statics.field844.field1264 < 13312 && Statics.field844.field1236 < 13312) {
                        if ((class62.field777[Statics.field861][Statics.field844.field1264 >> 7][Statics.field844.field1236 >> 7] & 0x4) != 0) {
                            var34 = Statics.field861;
                        }
                        var33 = var34;
                    } else {
                        var33 = Statics.field861;
                    }
                }
            }
            var45 = var33;
        }
        int var48 = Statics.field146;
        int var49 = Statics.field766;
        int var50 = Statics.field2285;
        int var51 = Statics.field3425;
        int var52 = Statics.field18;
        for (int var53 = 0; var53 < 5; var53++) {
            if (field1158[var53]) {
                int var54 = (int) (Math.random() * (double) (field1176[var53] * 2 + 1) - (double) field1176[var53] + Math.sin((double) field1178[var53] / 100.0D * (double) field1179[var53]) * (double) field1192[var53]);
                if (var53 == 0) {
                    Statics.field146 += var54;
                }
                if (var53 == 1) {
                    Statics.field766 += var54;
                }
                if (var53 == 2) {
                    Statics.field2285 += var54;
                }
                if (var53 == 3) {
                    Statics.field18 = Statics.field18 + var54 & 0x7FF;
                }
                if (var53 == 4) {
                    Statics.field3425 += var54;
                    if (Statics.field3425 < 128) {
                        Statics.field3425 = 128;
                    }
                    if (Statics.field3425 > 383) {
                        Statics.field3425 = 383;
                    }
                }
            }
        }
        int var55 = class60.field750;
        int var56 = class60.field758 * 939681921;
        if (class60.field744 != 0) {
            var55 = class60.field756;
            var56 = class60.field755;
        }
        if (var55 >= var12 && var55 < var12 + var14 && var56 >= var13 && var56 < var13 + var15) {
            class135.method1870(var55 - var12, var56 - var13);
        } else {
            class135.method1531();
        }
        method26();
        class285.method4623(var12, var13, var14, var15, 0);
        method26();
        int var57 = class137.field2029;
        class137.field2029 = field1017;
        Statics.field3635.method2444(Statics.field146, Statics.field766, Statics.field2285, Statics.field3425, Statics.field18, var45);
        class8.method161();
        class137.field2029 = var57;
        method26();
        Statics.field3635.method2438();
        field1021 = 0;
        boolean var58 = false;
        int var59 = -1;
        int var60 = class97.field1510;
        int[] var61 = class97.field1511;
        for (int var62 = 0; var62 < field1171 + var60; var62++) {
            class79 var63;
            if (var62 < var60) {
                var63 = field1048[var61[var62]];
                if (field1101 == var61[var62]) {
                    var58 = true;
                    var59 = var62;
                    continue;
                }
            } else {
                var63 = field1166[field967[var62 - var60]];
            }
            Statics.method1561(var63, var62, var12, var13, var14, var15);
        }
        if (var58) {
            Statics.method1561(field1048[field1101], var59, var12, var13, var14, var15);
        }
        for (int var64 = 0; var64 < field1021; var64++) {
            int var65 = field1023[var64];
            int var66 = field1024[var64];
            int var67 = field1026[var64];
            int var68 = field1025[var64];
            boolean var69 = true;
            while (var69) {
                var69 = false;
                for (int var70 = 0; var70 < var64; var70++) {
                    if (var66 + 2 > field1024[var70] - field1025[var70] && var66 - var68 < field1024[var70] + 2 && var65 - var67 < field1026[var70] + field1023[var70] && var65 + var67 > field1023[var70] - field1026[var70] && field1024[var70] - field1025[var70] < var66) {
                        var66 = field1024[var70] - field1025[var70];
                        var69 = true;
                    }
                }
            }
            field1072 = field1023[var64];
            field1034 = field1024[var64] = var66;
            String var71 = field1185[var64];
            if (field1090 == 0) {
                int var72 = 16776960;
                if (field1104[var64] < 6) {
                    var72 = field1143[field1104[var64]];
                }
                if (field1104[var64] == 6) {
                    var72 = field1154 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field1104[var64] == 7) {
                    var72 = field1154 % 20 < 10 ? 255 : 65535;
                }
                if (field1104[var64] == 8) {
                    var72 = field1154 % 20 < 10 ? 45056 : 8454016;
                }
                if (field1104[var64] == 9) {
                    int var73 = 150 - field1148[var64];
                    if (var73 < 50) {
                        var72 = var73 * 1280 + 16711680;
                    } else if (var73 < 100) {
                        var72 = 16776960 - (var73 - 50) * 327680;
                    } else if (var73 < 150) {
                        var72 = (var73 - 100) * 5 + 65280;
                    }
                }
                if (field1104[var64] == 10) {
                    int var74 = 150 - field1148[var64];
                    if (var74 < 50) {
                        var72 = var74 * 5 + 16711680;
                    } else if (var74 < 100) {
                        var72 = 16711935 - (var74 - 50) * 327680;
                    } else if (var74 < 150) {
                        var72 = (var74 - 100) * 327680 + 255 - (var74 - 100) * 5;
                    }
                }
                if (field1104[var64] == 11) {
                    int var75 = 150 - field1148[var64];
                    if (var75 < 50) {
                        var72 = 16777215 - var75 * 327685;
                    } else if (var75 < 100) {
                        var72 = (var75 - 50) * 327685 + 65280;
                    } else if (var75 < 150) {
                        var72 = 16777215 - (var75 - 100) * 327680;
                    }
                }
                if (field1008[var64] == 0) {
                    Statics.field2558.method4410(var71, field1072 + var12, field1034 + var13, var72, 0);
                }
                if (field1008[var64] == 1) {
                    Statics.field2558.method4409(var71, field1072 + var12, field1034 + var13, var72, 0, field1154);
                }
                if (field1008[var64] == 2) {
                    Statics.field2558.method4427(var71, field1072 + var12, field1034 + var13, var72, 0, field1154);
                }
                if (field1008[var64] == 3) {
                    Statics.field2558.method4414(var71, field1072 + var12, field1034 + var13, var72, 0, field1154, 150 - field1148[var64]);
                }
                if (field1008[var64] == 4) {
                    int var76 = (150 - field1148[var64]) * (Statics.field2558.method4402(var71) + 100) / 150;
                    class285.method4575(field1072 + var12 - 50, var13, field1072 + var12 + 50, var13 + var15);
                    Statics.field2558.method4407(var71, field1072 + var12 + 50 - var76, field1034 + var13, var72, 0);
                    class285.method4574(var12, var13, var12 + var14, var13 + var15);
                }
                if (field1008[var64] == 5) {
                    int var77 = 150 - field1148[var64];
                    int var78 = 0;
                    if (var77 < 25) {
                        var78 = var77 - 25;
                    } else if (var77 > 125) {
                        var78 = var77 - 125;
                    }
                    class285.method4575(var12, field1034 + var13 - Statics.field2558.field3657 - 1, var12 + var14, field1034 + var13 + 5);
                    Statics.field2558.method4410(var71, field1072 + var12, field1034 + var13 + var78, var72, 0);
                    class285.method4574(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field2558.method4410(var71, field1072 + var12, field1034 + var13, 16776960, 0);
            }
        }
        if (field944 == 2) {
            method989((field947 - Statics.field353 << 7) + field950, (field948 - Statics.field2461 << 7) + field1056, field1075 * 2);
            if (field1072 > -1 && field936 % 20 < 10) {
                Statics.field2334[0].method4699(field1072 + var12 - 12, field1034 + var13 - 28);
            }
        }
        ((class126) Statics.field2040).method2140(field933);
        if (field1038 == 1) {
            Statics.field528[field1037 / 100].method4699(field1098 - 8, field1164 - 8);
        }
        if (field1038 == 2) {
            Statics.field528[field1037 / 100 + 4].method4699(field1098 - 8, field1164 - 8);
        }
        field1047 = 0;
        int var79 = (Statics.field844.field1264 >> 7) + Statics.field353;
        int var80 = (Statics.field844.field1236 >> 7) + Statics.field2461;
        if (var79 >= 3053 && var79 <= 3156 && var80 >= 3056 && var80 <= 3136) {
            field1047 = 1;
        }
        if (var79 >= 3072 && var79 <= 3118 && var80 >= 9492 && var80 <= 9535) {
            field1047 = 1;
        }
        if (field1047 == 1 && var79 >= 3139 && var79 <= 3199 && var80 >= 3008 && var80 <= 3062) {
            field1047 = 0;
        }
        Statics.field146 = var48;
        Statics.field766 = var49;
        Statics.field2285 = var50;
        Statics.field3425 = var51;
        Statics.field18 = var52;
        if (field935 && class242.method61(true, false) == 0) {
            field935 = false;
        }
        if (field935) {
            class285.method4623(var12, var13, var14, var15, 0);
            method19(class229.field2865, false);
        }
    }

    @ObfuscatedName("jz.gk(IIIIZI)V")
    public static final void method4377(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1181 - field1180) * var5 / 100 + field1180;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1186) {
            short var8 = field1186;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1022) {
                var6 = field1022;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class285.method4573();
                    class285.method4623(arg0, arg1, var10, arg3, -16777216);
                    class285.method4623(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1152) {
            short var11 = field1152;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1184) {
                var6 = field1184;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class285.method4573();
                    class285.method4623(arg0, arg1, arg2, var13, -16777216);
                    class285.method4623(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1183 - field940) * var5 / 100 + field940;
        field1017 = arg3 * var6 * var14 / 85504 << 1;
        if (field1182 != arg2 || field1074 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field2043[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2459(var15, 500, 800, arg2, arg3);
        }
        field1093 = arg0;
        field932 = arg1;
        field1182 = arg2;
        field1074 = arg3;
    }

    @ObfuscatedName("al.gq(Lbf;B)V")
    public static final void method619(class67 arg0) {
        if (Statics.field844.field1264 >> 7 == field1019 && Statics.field844.field1236 >> 7 == field1188) {
            field1019 = 0;
        }
        int var1 = class97.field1510;
        int[] var2 = class97.field1511;
        int var3 = var1;
        if (class67.field830 == arg0 || class67.field826 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field830 == arg0) {
                var5 = Statics.field844;
                var6 = Statics.field844.field916 << 14;
            } else if (class67.field826 == arg0) {
                var5 = field1048[field1101];
                var6 = field1101 << 14;
            } else {
                var5 = field1048[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field828 == arg0 && field1101 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1020() && !var5.field914) {
                var5.field906 = false;
                if ((field998 && var1 > 50 || var1 > 200) && class67.field830 != arg0 && var5.field1246 == var5.field1242) {
                    var5.field906 = true;
                }
                int var7 = var5.field1264 >> 7;
                int var8 = var5.field1236 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field901 == null || field936 < var5.field902 || field936 >= var5.field903) {
                        if ((var5.field1264 & 0x7F) == 64 && (var5.field1236 & 0x7F) == 64) {
                            if (field1154 == field1031[var7][var8]) {
                                continue;
                            }
                            field1031[var7][var8] = field1154;
                        }
                        var5.field900 = method2656(var5.field1264, var5.field1236, Statics.field861);
                        Statics.field3635.method2428(Statics.field861, var5.field1264, var5.field1236, var5.field900, 60, var5, var5.field1237, var6, var5.field1239);
                    } else {
                        var5.field906 = false;
                        var5.field900 = method2656(var5.field1264, var5.field1236, Statics.field861);
                        Statics.field3635.method2481(Statics.field861, var5.field1264, var5.field1236, var5.field900, 60, var5, var5.field1237, var6, var5.field908, var5.field909, var5.field915, var5.field911);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.gv(ZB)V")
    public static final void method656(boolean arg0) {
        for (int var1 = 0; var1 < field1171; var1++) {
            class87 var2 = field1166[field967[var1]];
            int var3 = (field967[var1] << 14) + 536870912;
            if (var2 != null && var2.method1020() && var2.field1387.field3565 == arg0 && var2.field1387.method4282()) {
                int var4 = var2.field1264 >> 7;
                int var5 = var2.field1236 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1243 == 1 && (var2.field1264 & 0x7F) == 64 && (var2.field1236 & 0x7F) == 64) {
                        if (field1154 == field1031[var4][var5]) {
                            continue;
                        }
                        field1031[var4][var5] = field1154;
                    }
                    if (!var2.field1387.field3597) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field3635.method2428(Statics.field861, var2.field1264, var2.field1236, method2656(var2.field1264 + (var2.field1243 * 64 - 64), var2.field1236 + (var2.field1243 * 64 - 64), Statics.field861), var2.field1243 * 64 - 64 + 60, var2, var2.field1237, var3, var2.field1239);
                }
            }
        }
    }

    @ObfuscatedName("o.gp(I)V")
    public static final void method1() {
        for (class85 var0 = (class85) field1061.method3304(); var0 != null; var0 = (class85) field1061.method3306()) {
            if (Statics.field861 != var0.field1365 || var0.field1360) {
                var0.method3294();
            } else if (field936 >= var0.field1361) {
                var0.method1516(field933);
                if (var0.field1360) {
                    var0.method3294();
                } else {
                    Statics.field3635.method2428(var0.field1365, var0.field1363, var0.field1364, var0.field1375, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("bk.gj(Lcb;IB)V")
    public static final void method976(class79 arg0, int arg1) {
        method989(arg0.field1264, arg0.field1236, arg1);
    }

    @ObfuscatedName("bs.gl(IIII)V")
    public static final void method989(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1072 = -1;
            field1034 = -1;
            return;
        }
        int var3 = method2656(arg0, arg1, Statics.field861) - arg2;
        int var4 = arg0 - Statics.field146;
        int var5 = var3 - Statics.field766;
        int var6 = arg1 - Statics.field2285;
        int var7 = class137.field2043[Statics.field3425];
        int var8 = class137.field2037[Statics.field3425];
        int var9 = class137.field2043[Statics.field18];
        int var10 = class137.field2037[Statics.field18];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1072 = field1017 * var11 / var15 + field1182 / 2;
            field1034 = field1017 * var14 / var15 + field1074 / 2;
        } else {
            field1072 = -1;
            field1034 = -1;
        }
    }

    @ObfuscatedName("ee.gd(IIIB)I")
    public static final int method2656(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field777[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field770[var5][var3][var4] + class62.field770[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field770[var5][var3][var4 + 1] + class62.field770[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bz.gu(ZB)V")
    public static final void method1036(boolean arg0) {
        field1206 = arg0;
        if (!field1206) {
            int var1 = field1160.method2957();
            int var2 = field1160.method2907();
            int var3 = field1160.method2886();
            Statics.field19 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field19[var4][var5] = field1160.method2904();
                }
            }
            Statics.field3199 = new int[var3];
            Statics.field316 = new int[var3];
            Statics.field2221 = new int[var3];
            Statics.field2344 = new byte[var3][];
            Statics.field1295 = new byte[var3][];
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
                        Statics.field3199[var7] = var10;
                        Statics.field316[var7] = Statics.field33.method3742("m" + var8 + "_" + var9);
                        Statics.field2221[var7] = Statics.field33.method3742("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method621(var2, var1, true);
            return;
        }
        int var11 = field1160.method2886();
        boolean var12 = field1160.method3071() == 1;
        int var13 = field1160.method2886();
        int var14 = field1160.method2886();
        field1160.method3128();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field1160.method3118(1);
                    if (var18 == 1) {
                        field990[var15][var16][var17] = field1160.method3118(26);
                    } else {
                        field990[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field1160.method3124();
        Statics.field19 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field19[var19][var20] = field1160.method2904();
            }
        }
        Statics.field3199 = new int[var14];
        Statics.field316 = new int[var14];
        Statics.field2221 = new int[var14];
        Statics.field2344 = new byte[var14][];
        Statics.field1295 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field990[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field3199[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field3199[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field316[var21] = Statics.field33.method3742("m" + var30 + "_" + var31);
                            Statics.field2221[var21] = Statics.field33.method3742("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method621(var13, var11, !var12);
    }

    @ObfuscatedName("al.gw(IIZI)V")
    public static final void method621(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field521 == arg0 && Statics.field602 == arg1) {
            return;
        }
        Statics.field521 = arg0;
        Statics.field602 = arg1;
        method2347(25);
        method19(class229.field2865, true);
        int var3 = Statics.field353;
        int var4 = Statics.field2461;
        Statics.field353 = (arg0 - 6) * 8;
        Statics.field2461 = (arg1 - 6) * 8;
        int var5 = Statics.field353 - var3;
        int var6 = Statics.field2461 - var4;
        int var7 = Statics.field353;
        int var8 = Statics.field2461;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field1166[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1255[var11] -= var5;
                    var10.field1291[var11] -= var6;
                }
                var10.field1264 -= var5 * 128;
                var10.field1236 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1048[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1255[var14] -= var5;
                    var13.field1291[var14] -= var6;
                }
                var13.field1264 -= var5 * 128;
                var13.field1236 -= var6 * 128;
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
                        field1058[var25][var21][var22] = field1058[var25][var23][var24];
                    } else {
                        field1058[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1059.method3304(); var26 != null; var26 = (class77) field1059.method3306()) {
            var26.field1210 -= var5;
            var26.field1211 -= var6;
            if (var26.field1210 < 0 || var26.field1211 < 0 || var26.field1210 >= 104 || var26.field1211 >= 104) {
                var26.method3294();
            }
        }
        if (field1019 != 0) {
            field1019 -= var5;
            field1188 -= var6;
        }
        field1029 = 0;
        field1174 = false;
        field1155 = -1;
        field1061.method3323();
        field1060.method3323();
        for (int var27 = 0; var27 < 4; var27++) {
            field988[var27].method2766();
        }
    }

    @ObfuscatedName("iq.gx(ZI)V")
    public static final void method3820(boolean arg0) {
        method26();
        field976++;
        if (field976 < 50 && !arg0) {
            return;
        }
        field976 = 0;
        if (field1121 || Statics.field332 == null) {
            return;
        }
        field970.method3115(183);
        try {
            Statics.field332.method2699(field970.field2419, 0, field970.field2412);
            field970.field2412 = 0;
        } catch (IOException var2) {
            field1121 = true;
        }
    }

    @ObfuscatedName("bf.gi(IIIIII)V")
    public static final void method973(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field3635.method2450(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field3635.method2483(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field870.field3795;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class259 var13 = class259.method997(var12);
            if (var13.field3477 == -1) {
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
                class288 var14 = Statics.field262[var13.field3477];
                if (var14 != null) {
                    int var15 = (var13.field3471 * 4 - var14.field3782) / 2;
                    int var16 = (var13.field3488 * 4 - var14.field3780) / 2;
                    var14.method4672(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3488) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field3635.method2452(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field3635.method2483(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class259 var22 = class259.method997(var21);
            if (var22.field3477 != -1) {
                class288 var23 = Statics.field262[var22.field3477];
                if (var23 != null) {
                    int var24 = (var22.field3471 * 4 - var23.field3782) / 2;
                    int var25 = (var22.field3488 * 4 - var23.field3780) / 2;
                    var23.method4672(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3488) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field870.field3795;
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
        int var29 = Statics.field3635.method2453(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class259 var31 = class259.method997(var30);
        if (var31.field3477 == -1) {
            return;
        }
        class288 var32 = Statics.field262[var31.field3477];
        if (var32 != null) {
            int var33 = (var31.field3471 * 4 - var32.field3782) / 2;
            int var34 = (var31.field3488 * 4 - var32.field3780) / 2;
            var32.method4672(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3488) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gf(B)Z")
    public final boolean method1120() {
        if (Statics.field332 == null) {
            return false;
        }
        try {
            int var1 = Statics.field332.method2701();
            if (var1 <= 0) {
                return false;
            }
            if (field974 == -1) {
                Statics.field332.method2703(field1160.field2419, 0, 1);
                field1160.field2412 = 0;
                field974 = field1160.method3116();
                field1070 = class276.field3712[field974];
                var1--;
            }
            if (field1070 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field332.method2703(field1160.field2419, 0, 1);
                field1070 = field1160.field2419[0] & 0xFF;
                var1--;
            }
            if (field1070 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field332.method2703(field1160.field2419, 0, 2);
                field1160.field2412 = 0;
                field1070 = field1160.method2886();
                var1 -= 2;
            }
            if (var1 < field1070) {
                return false;
            }
            field1160.field2412 = 0;
            Statics.field332.method2703(field1160.field2419, 0, field1070);
            field1054 = 0;
            field979 = field978;
            field978 = field934;
            field934 = field974;
            if (field974 == 234) {
                int var2 = field1160.method2904();
                class69 var3 = (class69) field1089.method3252((long) var2);
                if (var3 != null) {
                    method3(var3, true);
                }
                if (field1011 != null) {
                    method667(field1011);
                    field1011 = null;
                }
                field974 = -1;
                return true;
            }
            if (field974 == 155) {
                class183 var4 = field1160;
                int var5 = field1070;
                class283 var6 = new class283();
                var6.field3751 = var4.method2931();
                var6.field3756 = var4.method2904();
                var6.field3750 = new int[var6.field3751];
                var6.field3753 = new int[var6.field3751];
                var6.field3754 = new Field[var6.field3751];
                var6.field3755 = new int[var6.field3751];
                var6.field3752 = new Method[var6.field3751];
                var6.field3757 = new byte[var6.field3751][][];
                for (int var7 = 0; var7 < var6.field3751; var7++) {
                    try {
                        int var8 = var4.method2931();
                        if (var8 == 0 || var8 == 1 || var8 == 2) {
                            String var9 = var4.method2892();
                            String var10 = var4.method2892();
                            int var11 = 0;
                            if (var8 == 1) {
                                var11 = var4.method2904();
                            }
                            var6.field3750[var7] = var8;
                            var6.field3755[var7] = var11;
                            if (class284.method48(var9).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var6.field3754[var7] = class284.method48(var9).getDeclaredField(var10);
                        } else if (var8 == 3 || var8 == 4) {
                            String var12 = var4.method2892();
                            String var13 = var4.method2892();
                            int var14 = var4.method2931();
                            String[] var15 = new String[var14];
                            for (int var16 = 0; var16 < var14; var16++) {
                                var15[var16] = var4.method2892();
                            }
                            String var17 = var4.method2892();
                            byte[][] var18 = new byte[var14][];
                            if (var8 == 3) {
                                for (int var19 = 0; var19 < var14; var19++) {
                                    int var20 = var4.method2904();
                                    var18[var19] = new byte[var20];
                                    var4.method2895(var18[var19], 0, var20);
                                }
                            }
                            var6.field3750[var7] = var8;
                            Class[] var21 = new Class[var14];
                            for (int var22 = 0; var22 < var14; var22++) {
                                var21[var22] = class284.method48(var15[var22]);
                            }
                            Class var23 = class284.method48(var17);
                            if (class284.method48(var12).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var24 = class284.method48(var12).getDeclaredMethods();
                            Method[] var25 = var24;
                            for (int var26 = 0; var26 < var25.length; var26++) {
                                Method var27 = var25[var26];
                                if (var27.getName().equals(var13)) {
                                    Class[] var28 = var27.getParameterTypes();
                                    if (var21.length == var28.length) {
                                        boolean var29 = true;
                                        for (int var30 = 0; var30 < var21.length; var30++) {
                                            if (var21[var30] != var28[var30]) {
                                                var29 = false;
                                                break;
                                            }
                                        }
                                        if (var29 && var23 == var27.getReturnType()) {
                                            var6.field3752[var7] = var27;
                                        }
                                    }
                                }
                            }
                            var6.field3757[var7] = var18;
                        }
                    } catch (ClassNotFoundException var506) {
                        var6.field3753[var7] = -1;
                    } catch (SecurityException var507) {
                        var6.field3753[var7] = -2;
                    } catch (NullPointerException var508) {
                        var6.field3753[var7] = -3;
                    } catch (Exception var509) {
                        var6.field3753[var7] = -4;
                    } catch (Throwable var510) {
                        var6.field3753[var7] = -5;
                    }
                }
                class284.field3759.method3283(var6);
                field974 = -1;
                return true;
            }
            if (field974 == 108) {
                method491();
                field973 = field1160.method2931();
                field1125 = field1113;
                field974 = -1;
                return true;
            }
            if (field974 == 26) {
                int var36 = field1160.method2907();
                if (var36 == 65535) {
                    var36 = -1;
                }
                Statics.method3159(var36);
                field974 = -1;
                return true;
            }
            if (field974 == 162) {
                int var37 = field1160.method2925();
                int var38 = field1160.method2882();
                if (var38 == 65535) {
                    var38 = -1;
                }
                method3556(var38, var37);
                field974 = -1;
                return true;
            }
            if (field974 == 145) {
                field1144 = field1160.method2931();
                field975 = field1160.method2931();
                field974 = -1;
                return true;
            }
            if (field974 == 172) {
                Statics.field926 = field1160.method3071();
                Statics.field680 = field1160.method2931();
                field974 = -1;
                return true;
            }
            if (field974 == 157) {
                int var39 = field1160.method2929();
                int var40 = field1160.method2931();
                int var41 = field1160.method2886();
                class69 var42 = (class69) field1089.method3252((long) var39);
                if (var42 != null) {
                    method3(var42, var42.field845 != var41);
                }
                class69 var43 = new class69();
                var43.field845 = var41;
                var43.field847 = var40;
                field1089.method3253(var43, (long) var39);
                method977(var41);
                class220 var44 = class220.method1162(var39);
                method667(var44);
                if (field1011 != null) {
                    method667(field1011);
                    field1011 = null;
                }
                method131();
                method557(Statics.field780[var39 >> 16], var44, false);
                class84.method76(var41);
                if (field1088 != -1) {
                    Statics.method615(field1088, 1);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 7) {
                int var45 = field1160.method2886();
                int var46 = field1160.method2928();
                int var47 = var45 >> 10 & 0x1F;
                int var48 = var45 >> 5 & 0x1F;
                int var49 = var45 & 0x1F;
                int var50 = (var49 << 3) + (var47 << 19) + (var48 << 11);
                class220 var51 = class220.method1162(var46);
                if (var51.field2682 != var50) {
                    var51.field2682 = var50;
                    method667(var51);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 146) {
                int var52 = field1160.method2904();
                int var53 = field1160.method2886();
                if (var52 < -70000) {
                    var53 += 32768;
                }
                class220 var54;
                if (var52 >= 0) {
                    var54 = class220.method1162(var52);
                } else {
                    var54 = null;
                }
                while (field1160.field2412 < field1070) {
                    int var55 = field1160.method3003();
                    int var56 = field1160.method2886();
                    int var57 = 0;
                    if (var56 != 0) {
                        var57 = field1160.method2931();
                        if (var57 == 255) {
                            var57 = field1160.method2904();
                        }
                    }
                    if (var54 != null && var55 >= 0 && var55 < var54.field2775.length) {
                        var54.field2775[var55] = var56;
                        var54.field2776[var55] = var57;
                    }
                    class64.method972(var53, var55, var56 - 1, var57);
                }
                if (var54 != null) {
                    method667(var54);
                }
                method491();
                field1116[++field1027 - 1 & 0x1F] = var53 & 0x7FFF;
                field974 = -1;
                return true;
            }
            if (field974 == 43) {
                boolean var58 = field1160.method2931() == 1;
                if (var58) {
                    Statics.field1406 = class179.method1665() - field1160.method2890();
                    Statics.field1532 = new class14(field1160, true);
                } else {
                    Statics.field1532 = null;
                }
                field1195 = field1113;
                field974 = -1;
                return true;
            }
            if (field974 == 39) {
                field1174 = false;
                for (int var59 = 0; var59 < 5; var59++) {
                    field1158[var59] = false;
                }
                field974 = -1;
                return true;
            }
            if (field974 == 254) {
                while (field1160.field2412 < field1070) {
                    boolean var60 = field1160.method2931() == 1;
                    String var61 = field1160.method2892();
                    String var62 = field1160.method2892();
                    int var63 = field1160.method2886();
                    int var64 = field1160.method2931();
                    int var65 = field1160.method2931();
                    boolean var66 = (var65 & 0x2) != 0;
                    boolean var67 = (var65 & 0x1) != 0;
                    if (var63 > 0) {
                        field1160.method2892();
                        field1160.method2931();
                        field1160.method2904();
                    }
                    field1160.method2892();
                    for (int var68 = 0; var68 < field1013; var68++) {
                        class66 var69 = field1132[var68];
                        if (var60) {
                            if (var62.equals(var69.field818)) {
                                var69.field818 = var61;
                                var69.field814 = var62;
                                var61 = null;
                                break;
                            }
                        } else if (var61.equals(var69.field818)) {
                            if (var69.field815 != var63) {
                                boolean var70 = true;
                                for (class68 var71 = (class68) field1196.method3337(); var71 != null; var71 = (class68) field1196.method3338()) {
                                    if (var71.field832.equals(var61)) {
                                        if (var63 != 0 && var71.field834 == 0) {
                                            var71.method3344();
                                            var70 = false;
                                        } else if (var63 == 0 && var71.field834 != 0) {
                                            var71.method3344();
                                            var70 = false;
                                        }
                                    }
                                }
                                if (var70) {
                                    field1196.method3336(new class68(var61, var63));
                                }
                                var69.field815 = var63;
                            }
                            var69.field814 = var62;
                            var69.field816 = var64;
                            var69.field813 = var66;
                            var69.field819 = var67;
                            var61 = null;
                            break;
                        }
                    }
                    if (var61 != null && field1013 < 400) {
                        class66 var72 = new class66();
                        field1132[field1013] = var72;
                        var72.field818 = var61;
                        var72.field814 = var62;
                        var72.field815 = var63;
                        var72.field816 = var64;
                        var72.field813 = var66;
                        var72.field819 = var67;
                        field1013++;
                    }
                }
                field1194 = 2;
                field1035 = field1113;
                boolean var73 = false;
                int var74 = field1013;
                while (var74 > 0) {
                    boolean var75 = true;
                    var74--;
                    for (int var76 = 0; var76 < var74; var76++) {
                        boolean var77 = false;
                        class66 var78 = field1132[var76];
                        class66 var79 = field1132[var76 + 1];
                        if (field1106 != var78.field815 && field1106 == var79.field815) {
                            var77 = true;
                        }
                        if (!var77 && var78.field815 == 0 && var79.field815 != 0) {
                            var77 = true;
                        }
                        if (!var77 && !var78.field813 && var79.field813) {
                            var77 = true;
                        }
                        if (!var77 && !var78.field819 && var79.field819) {
                            var77 = true;
                        }
                        if (var77) {
                            class66 var80 = field1132[var76];
                            field1132[var76] = field1132[var76 + 1];
                            field1132[var76 + 1] = var80;
                            var75 = false;
                        }
                    }
                    if (var75) {
                        break;
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 1) {
                int var81 = field1070 + field1160.field2412;
                int var82 = field1160.method2886();
                int var83 = field1160.method2886();
                if (field1088 != var82) {
                    field1088 = var82;
                    this.method1053(false);
                    method977(field1088);
                    class84.method76(field1088);
                    for (int var84 = 0; var84 < 100; var84++) {
                        field965[var84] = true;
                    }
                }
                while (var83-- > 0) {
                    int var85 = field1160.method2904();
                    int var86 = field1160.method2886();
                    int var87 = field1160.method2931();
                    class69 var88 = (class69) field1089.method3252((long) var85);
                    if (var88 != null && var88.field845 != var86) {
                        method3(var88, true);
                        var88 = null;
                    }
                    if (var88 == null) {
                        class69 var89 = new class69();
                        var89.field845 = var86;
                        var89.field847 = var87;
                        field1089.method3253(var89, (long) var85);
                        method977(var86);
                        class220 var90 = class220.method1162(var85);
                        method667(var90);
                        if (field1011 != null) {
                            method667(field1011);
                            field1011 = null;
                        }
                        method131();
                        method557(Statics.field780[var85 >> 16], var90, false);
                        class84.method76(var86);
                        if (field1088 != -1) {
                            Statics.method615(field1088, 1);
                        }
                        var88 = var89;
                    }
                    var88.field840 = true;
                }
                for (class69 var92 = (class69) field1089.method3251(); var92 != null; var92 = (class69) field1089.method3256()) {
                    if (var92.field840) {
                        var92.field840 = false;
                    } else {
                        method3(var92, true);
                    }
                }
                field1130 = new class194(512);
                while (field1160.field2412 < var81) {
                    int var93 = field1160.method2904();
                    int var94 = field1160.method2886();
                    int var95 = field1160.method2886();
                    int var96 = field1160.method2904();
                    for (int var97 = var94; var97 <= var95; var97++) {
                        long var98 = ((long) var93 << 32) + (long) var97;
                        field1130.method3253(new class202(var96), var98);
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 136) {
                method491();
                int var100 = field1160.method2929();
                int var101 = field1160.method3071();
                int var102 = field1160.method2931();
                field981[var102] = var100;
                field928[var102] = var101;
                field1063[var102] = 1;
                for (int var103 = 0; var103 < 98; var103++) {
                    if (var100 >= class226.field2841[var103]) {
                        field1063[var102] = var103 + 2;
                    }
                }
                field1118[++field1202 - 1 & 0x1F] = var102;
                field974 = -1;
                return true;
            }
            if (field974 == 23) {
                int var104 = field1160.method2919();
                int var105 = field1160.method2957();
                int var106 = field1160.method2907();
                class220 var107 = class220.method1162(var104);
                var107.field2713 = (var106 << 16) + var105;
                field974 = -1;
                return true;
            }
            if (field974 == 30) {
                field1174 = true;
                Statics.field394 = field1160.method2931();
                Statics.field312 = field1160.method2931();
                Statics.field539 = field1160.method2886();
                Statics.field234 = field1160.method2931();
                Statics.field1879 = field1160.method2931();
                if (Statics.field1879 >= 100) {
                    Statics.field146 = Statics.field394 * 128 + 64;
                    Statics.field2285 = Statics.field312 * 128 + 64;
                    Statics.field766 = method2656(Statics.field146, Statics.field2285, Statics.field861) - Statics.field539;
                }
                field974 = -1;
                return true;
            }
            if (field974 == 104) {
                int var108 = field1160.method2929();
                class220 var109 = class220.method1162(var108);
                for (int var110 = 0; var110 < var109.field2775.length; var110++) {
                    var109.field2775[var110] = -1;
                    var109.field2775[var110] = 0;
                }
                method667(var109);
                field974 = -1;
                return true;
            }
            if (field974 == 102) {
                Statics.field1371 = class280.method2624(field1160.method2931());
                field974 = -1;
                return true;
            }
            if (field974 == 173) {
                int var111 = field1160.method2904();
                int var112 = field1160.method2904();
                if (Statics.field608 == null || !Statics.field608.isValid()) {
                    try {
                        Iterator var113 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var113.hasNext()) {
                            GarbageCollectorMXBean var114 = (GarbageCollectorMXBean) var113.next();
                            if (var114.isValid()) {
                                Statics.field608 = var114;
                                field1204 = -1L;
                                field938 = -1L;
                            }
                        }
                    } catch (Throwable var505) {
                    }
                }
                long var116 = class179.method1665();
                int var118 = -1;
                if (Statics.field608 != null) {
                    long var119 = Statics.field608.getCollectionTime();
                    if (field938 != -1L) {
                        long var121 = var119 - field938;
                        long var123 = var116 - field1204;
                        if (var123 != 0L) {
                            var118 = (int) (var121 * 100L / var123);
                        }
                    }
                    field938 = var119;
                    field1204 = var116;
                }
                field970.method3115(133);
                field970.method2908(var118);
                field970.method2926(var111);
                field970.method2927(var112);
                field970.method2933(field718);
                field974 = -1;
                return true;
            }
            if (field974 == 232) {
                method1036(false);
                field1160.method3116();
                int var125 = field1160.method2886();
                class183 var126 = field1160;
                int var127 = var126.field2412;
                class97.field1517 = 0;
                int var128 = 0;
                var126.method3128();
                for (int var129 = 0; var129 < class97.field1510; var129++) {
                    int var130 = class97.field1511[var129];
                    if ((class97.field1507[var130] & 0x1) == 0) {
                        if (var128 > 0) {
                            var128--;
                            class97.field1507[var130] = (byte) (class97.field1507[var130] | 0x2);
                        } else {
                            int var131 = var126.method3118(1);
                            if (var131 == 0) {
                                var128 = class97.method994(var126);
                                class97.field1507[var130] = (byte) (class97.field1507[var130] | 0x2);
                            } else {
                                class97.method1562(var126, var130);
                            }
                        }
                    }
                }
                var126.method3124();
                if (var128 != 0) {
                    throw new RuntimeException();
                }
                var126.method3128();
                for (int var132 = 0; var132 < class97.field1510; var132++) {
                    int var133 = class97.field1511[var132];
                    if ((class97.field1507[var133] & 0x1) != 0) {
                        if (var128 > 0) {
                            var128--;
                            class97.field1507[var133] = (byte) (class97.field1507[var133] | 0x2);
                        } else {
                            int var134 = var126.method3118(1);
                            if (var134 == 0) {
                                var128 = class97.method994(var126);
                                class97.field1507[var133] = (byte) (class97.field1507[var133] | 0x2);
                            } else {
                                class97.method1562(var126, var133);
                            }
                        }
                    }
                }
                var126.method3124();
                if (var128 != 0) {
                    throw new RuntimeException();
                }
                var126.method3128();
                for (int var135 = 0; var135 < class97.field1512; var135++) {
                    int var136 = class97.field1518[var135];
                    if ((class97.field1507[var136] & 0x1) != 0) {
                        if (var128 > 0) {
                            var128--;
                            class97.field1507[var136] = (byte) (class97.field1507[var136] | 0x2);
                        } else {
                            int var137 = var126.method3118(1);
                            if (var137 == 0) {
                                var128 = class97.method994(var126);
                                class97.field1507[var136] = (byte) (class97.field1507[var136] | 0x2);
                            } else if (class97.method986(var126, var136)) {
                                class97.field1507[var136] = (byte) (class97.field1507[var136] | 0x2);
                            }
                        }
                    }
                }
                var126.method3124();
                if (var128 != 0) {
                    throw new RuntimeException();
                }
                var126.method3128();
                for (int var138 = 0; var138 < class97.field1512; var138++) {
                    int var139 = class97.field1518[var138];
                    if ((class97.field1507[var139] & 0x1) == 0) {
                        if (var128 > 0) {
                            var128--;
                            class97.field1507[var139] = (byte) (class97.field1507[var139] | 0x2);
                        } else {
                            int var140 = var126.method3118(1);
                            if (var140 == 0) {
                                var128 = class97.method994(var126);
                                class97.field1507[var139] = (byte) (class97.field1507[var139] | 0x2);
                            } else if (class97.method986(var126, var139)) {
                                class97.field1507[var139] = (byte) (class97.field1507[var139] | 0x2);
                            }
                        }
                    }
                }
                var126.method3124();
                if (var128 != 0) {
                    throw new RuntimeException();
                }
                class97.field1510 = 0;
                class97.field1512 = 0;
                for (int var141 = 1; var141 < 2048; var141++) {
                    class97.field1507[var141] = (byte) (class97.field1507[var141] >> 1);
                    class75 var142 = field1048[var141];
                    if (var142 == null) {
                        class97.field1518[++class97.field1512 - 1] = var141;
                    } else {
                        class97.field1511[++class97.field1510 - 1] = var141;
                    }
                }
                for (int var143 = 0; var143 < class97.field1517; var143++) {
                    int var144 = class97.field1508[var143];
                    class75 var145 = field1048[var144];
                    int var146 = var126.method2931();
                    if ((var146 & 0x2) != 0) {
                        var146 += var126.method2931() << 8;
                    }
                    byte var147 = -1;
                    if ((var146 & 0x10) != 0) {
                        int var148 = var126.method2931();
                        byte[] var149 = new byte[var148];
                        class177 var150 = new class177(var149);
                        var126.method2895(var149, 0, var148);
                        class97.field1509[var144] = var150;
                        var145.method1015(var150);
                    }
                    if ((var146 & 0x80) != 0) {
                        int var151 = var126.method2886();
                        if (var151 == 65535) {
                            var151 = -1;
                        }
                        int var152 = var126.method2931();
                        method140(var145, var151, var152);
                    }
                    if ((var146 & 0x40) != 0) {
                        var145.field1261 = var126.method2886();
                        if (var145.field1261 == 65535) {
                            var145.field1261 = -1;
                        }
                    }
                    if ((var146 & 0x1) != 0) {
                        var145.field1274 = var126.method2892();
                        if (var145.field1274.charAt(0) == '~') {
                            var145.field1274 = var145.field1274.substring(1);
                            class99.method1676(2, var145.field907, var145.field1274);
                        } else if (Statics.field844 == var145) {
                            class99.method1676(2, var145.field907, var145.field1274);
                        }
                        var145.field1249 = false;
                        var145.field1252 = 0;
                        var145.field1253 = 0;
                        var145.field1240 = 150;
                    }
                    if ((var146 & 0x20) != 0) {
                        int var153 = var126.method2931();
                        if (var153 > 0) {
                            for (int var154 = 0; var154 < var153; var154++) {
                                int var155 = -1;
                                int var156 = -1;
                                int var157 = -1;
                                int var158 = var126.method3003();
                                if (var158 == 32767) {
                                    var158 = var126.method3003();
                                    var156 = var126.method3003();
                                    var155 = var126.method3003();
                                    var157 = var126.method3003();
                                } else if (var158 == 32766) {
                                    var158 = -1;
                                } else {
                                    var156 = var126.method3003();
                                }
                                int var159 = var126.method3003();
                                var145.method1394(var158, var156, var155, var157, field936, var159);
                            }
                        }
                        int var160 = var126.method2931();
                        if (var160 > 0) {
                            for (int var161 = 0; var161 < var160; var161++) {
                                int var162 = var126.method3003();
                                int var163 = var126.method3003();
                                if (var163 == 32767) {
                                    var145.method1393(var162);
                                } else {
                                    int var164 = var126.method3003();
                                    int var165 = var126.method2931();
                                    int var166 = var163 > 0 ? var126.method2931() : var165;
                                    var145.method1395(var162, field936, var163, var164, var165, var166);
                                }
                            }
                        }
                    }
                    if ((var146 & 0x8) != 0) {
                        var145.field1263 = var126.method2886();
                        if (var145.field1289 == 0) {
                            var145.field1286 = var145.field1263;
                            var145.field1263 = -1;
                        }
                    }
                    if ((var146 & 0x4) != 0) {
                        int var167 = var126.method2886();
                        class234[] var168 = new class234[] { class234.field3171, class234.field3173, class234.field3174, class234.field3175, class234.field3177, class234.field3181 };
                        class234 var169 = (class234) class172.method1461(var168, var126.method2931());
                        boolean var170 = var126.method2931() == 1;
                        int var171 = var126.method2931();
                        int var172 = var126.field2412;
                        if (var145.field907 != null && var145.field895 != null) {
                            boolean var173 = false;
                            if (var169.field3178 && method1542(var145.field907)) {
                                var173 = true;
                            }
                            if (!var173 && field1047 == 0 && !var145.field914) {
                                class97.field1514.field2412 = 0;
                                var126.method2895(class97.field1514.field2419, 0, var171);
                                class97.field1514.field2412 = 0;
                                class177 var174 = class97.field1514;
                                String var178;
                                try {
                                    int var175 = var174.method3003();
                                    if (var175 > 32767) {
                                        var175 = 32767;
                                    }
                                    byte[] var176 = new byte[var175];
                                    var174.field2412 += Statics.field3675.method2819(var174.field2419, var174.field2412, var176, 0, var175);
                                    String var177 = class270.method3847(var176, 0, var175);
                                    var178 = var177;
                                } catch (Exception var504) {
                                    var178 = "Cabbage";
                                }
                                String var181 = class268.method4480(class274.method999(var178));
                                var145.field1274 = var181.trim();
                                var145.field1252 = var167 >> 8;
                                var145.field1253 = var167 & 0xFF;
                                var145.field1240 = 150;
                                var145.field1249 = var170;
                                var145.field1250 = Statics.field844 != var145 && var169.field3178 && field1146 != "" && var181.toLowerCase().indexOf(field1146) == -1;
                                int var182;
                                if (var169.field3170) {
                                    var182 = var170 ? 91 : 1;
                                } else {
                                    var182 = var170 ? 90 : 2;
                                }
                                if (var169.field3176 == -1) {
                                    class99.method1676(var182, var145.field907, var181);
                                } else {
                                    class99.method1676(var182, class89.method2878(var169.field3176) + var145.field907, var181);
                                }
                            }
                        }
                        var126.field2412 = var171 + var172;
                    }
                    if ((var146 & 0x100) != 0) {
                        var145.field1292 = var126.method2886();
                        int var183 = var126.method2904();
                        var145.field1276 = var183 >> 16;
                        var145.field1257 = (var183 & 0xFFFF) + field936;
                        var145.field1273 = 0;
                        var145.field1271 = 0;
                        if (var145.field1257 > field936) {
                            var145.field1273 = -1;
                        }
                        if (var145.field1292 == 65535) {
                            var145.field1292 = -1;
                        }
                    }
                    if ((var146 & 0x200) != 0) {
                        var145.field1277 = var126.method2885();
                        var145.field1251 = var126.method2885();
                        var145.field1278 = var126.method2885();
                        var145.field1280 = var126.method2885();
                        var145.field1281 = var126.method2886() + field936;
                        var145.field1282 = var126.method2886() + field936;
                        var145.field1283 = var126.method2886();
                        if (var145.field917) {
                            var145.field1277 += var145.field918;
                            var145.field1251 += var145.field919;
                            var145.field1278 += var145.field918;
                            var145.field1280 += var145.field919;
                            var145.field1289 = 0;
                        } else {
                            var145.field1277 += var145.field1255[0];
                            var145.field1251 += var145.field1291[0];
                            var145.field1278 += var145.field1255[0];
                            var145.field1280 += var145.field1291[0];
                            var145.field1289 = 1;
                        }
                        var145.field1294 = 0;
                    }
                    if ((var146 & 0x1000) != 0) {
                        class97.field1515[var144] = var126.method2885();
                    }
                    if ((var146 & 0x800) != 0) {
                        var147 = var126.method2885();
                    }
                    if ((var146 & 0x400) != 0) {
                        for (int var184 = 0; var184 < 3; var184++) {
                            var145.field899[var184] = var126.method2892();
                        }
                    }
                    if (var145.field917) {
                        if (var147 == 127) {
                            var145.method1034(var145.field918, var145.field919);
                        } else {
                            byte var185;
                            if (var147 == -1) {
                                var185 = class97.field1515[var144];
                            } else {
                                var185 = var147;
                            }
                            var145.method1018(var145.field918, var145.field919, var185);
                        }
                    }
                }
                if (var126.field2412 - var127 != var125) {
                    throw new RuntimeException(var126.field2412 - var127 + " " + var125);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 34) {
                int var186 = field1160.method2929();
                boolean var187 = field1160.method2921() == 1;
                class220 var188 = class220.method1162(var186);
                if (var188.field2664 != var187) {
                    var188.field2664 = var187;
                    method667(var188);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 185) {
                field1162 = field1160.method2931();
                field974 = -1;
                return true;
            }
            if (field974 == 44) {
                field1019 = field1160.method2931();
                if (field1019 == 255) {
                    field1019 = 0;
                }
                field1188 = field1160.method2931();
                if (field1188 == 255) {
                    field1188 = 0;
                }
                field974 = -1;
                return true;
            }
            if (field974 == 66) {
                field1174 = true;
                Statics.field404 = field1160.method2931();
                Statics.field2576 = field1160.method2931();
                Statics.field1359 = field1160.method2886();
                Statics.field1667 = field1160.method2931();
                Statics.field2055 = field1160.method2931();
                if (Statics.field2055 >= 100) {
                    int var189 = Statics.field404 * 128 + 64;
                    int var190 = Statics.field2576 * 128 + 64;
                    int var191 = method2656(var189, var190, Statics.field861) - Statics.field1359;
                    int var192 = var189 - Statics.field146;
                    int var193 = var191 - Statics.field766;
                    int var194 = var190 - Statics.field2285;
                    int var195 = (int) Math.sqrt((double) (var192 * var192 + var194 * var194));
                    Statics.field3425 = (int) (Math.atan2((double) var193, (double) var195) * 325.949D) & 0x7FF;
                    Statics.field18 = (int) (Math.atan2((double) var192, (double) var194) * -325.949D) & 0x7FF;
                    if (Statics.field3425 < 128) {
                        Statics.field3425 = 128;
                    }
                    if (Statics.field3425 > 383) {
                        Statics.field3425 = 383;
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 230) {
                String var196 = field1160.method2892();
                long var197 = field1160.method2890();
                long var199 = (long) field1160.method2886();
                long var201 = (long) field1160.method2888();
                class234[] var203 = new class234[] { class234.field3171, class234.field3173, class234.field3174, class234.field3175, class234.field3177, class234.field3181 };
                class234 var204 = (class234) class172.method1461(var203, field1160.method2931());
                long var205 = (var199 << 32) + var201;
                boolean var207 = false;
                for (int var208 = 0; var208 < 100; var208++) {
                    if (field1147[var208] == var205) {
                        var207 = true;
                        break;
                    }
                }
                if (var204.field3178 && method1542(var196)) {
                    var207 = true;
                }
                if (!var207 && field1047 == 0) {
                    field1147[field1151] = var205;
                    field1151 = (field1151 + 1) % 100;
                    class183 var209 = field1160;
                    String var213;
                    try {
                        int var210 = var209.method3003();
                        if (var210 > 32767) {
                            var210 = 32767;
                        }
                        byte[] var211 = new byte[var210];
                        var209.field2412 += Statics.field3675.method2819(var209.field2419, var209.field2412, var211, 0, var210);
                        String var212 = class270.method3847(var211, 0, var210);
                        var213 = var212;
                    } catch (Exception var503) {
                        var213 = "Cabbage";
                    }
                    String var216 = class268.method4480(class274.method999(var213));
                    if (var204.field3176 == -1) {
                        Statics.method470(9, var196, var216, class272.method3698(var197));
                    } else {
                        Statics.method470(9, class89.method2878(var204.field3176) + var196, var216, class272.method3698(var197));
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 217) {
                int var217 = field1160.method2882();
                int var218 = field1160.method2904();
                class220 var219 = class220.method1162(var218);
                if (var219.field2700 != 1 || var219.field2777 != var217) {
                    var219.field2700 = 1;
                    var219.field2777 = var217;
                    method667(var219);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 75) {
                String var220 = field1160.method2892();
                class183 var221 = field1160;
                String var225;
                try {
                    int var222 = var221.method3003();
                    if (var222 > 32767) {
                        var222 = 32767;
                    }
                    byte[] var223 = new byte[var222];
                    var221.field2412 += Statics.field3675.method2819(var221.field2419, var221.field2412, var223, 0, var222);
                    String var224 = class270.method3847(var223, 0, var222);
                    var225 = var224;
                } catch (Exception var502) {
                    var225 = "Cabbage";
                }
                String var228 = class268.method4480(class274.method999(var225));
                class99.method1676(6, var220, var228);
                field974 = -1;
                return true;
            }
            if (field974 == 120) {
                for (int var229 = 0; var229 < Statics.field3286; var229++) {
                    class245 var230 = (class245) class245.field3290.method3239((long) var229);
                    class245 var231;
                    if (var230 == null) {
                        byte[] var232 = Statics.field3285.method3754(16, var229);
                        class245 var233 = new class245();
                        if (var232 != null) {
                            var233.method3877(new class177(var232));
                        }
                        class245.field3290.method3241(var233, (long) var229);
                        var231 = var233;
                    } else {
                        var231 = var230;
                    }
                    if (var231 != null) {
                        class215.field2619[var229] = 0;
                        class215.field2616[var229] = 0;
                    }
                }
                method491();
                field1115 += 32;
                field974 = -1;
                return true;
            }
            if (field974 == 153) {
                int var235 = field1160.method2931();
                String var236 = field1160.method2892();
                int var237 = field1160.method2931();
                if (var235 >= 1 && var235 <= 8) {
                    if (var236.equalsIgnoreCase("null")) {
                        var236 = null;
                    }
                    field969[var235 - 1] = var236;
                    field1055[var235 - 1] = var237 == 0;
                }
                field974 = -1;
                return true;
            }
            if (field974 == 37) {
                while (field1160.field2412 < field1070) {
                    int var238 = field1160.method2931();
                    boolean var239 = (var238 & 0x1) == 1;
                    String var240 = field1160.method2892();
                    String var241 = field1160.method2892();
                    field1160.method2892();
                    for (int var242 = 0; var242 < field953; var242++) {
                        class71 var243 = field1198[var242];
                        if (var239) {
                            if (var241.equals(var243.field867)) {
                                var243.field867 = var240;
                                var243.field868 = var241;
                                var240 = null;
                                break;
                            }
                        } else if (var240.equals(var243.field867)) {
                            var243.field867 = var240;
                            var243.field868 = var241;
                            var240 = null;
                            break;
                        }
                    }
                    if (var240 != null && field953 < 400) {
                        class71 var244 = new class71();
                        field1198[field953] = var244;
                        var244.field867 = var240;
                        var244.field868 = var241;
                        field953++;
                    }
                }
                field1035 = field1113;
                field974 = -1;
                return true;
            }
            if (field974 == 240) {
                for (int var245 = 0; var245 < field1048.length; var245++) {
                    if (field1048[var245] != null) {
                        field1048[var245].field1267 = -1;
                    }
                }
                for (int var246 = 0; var246 < field1166.length; var246++) {
                    if (field1166[var246] != null) {
                        field1166[var246].field1267 = -1;
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 216) {
                int var247 = field1160.method2928();
                Statics.field490 = Statics.field723.method2671(var247);
                field974 = -1;
                return true;
            }
            if (field974 == 118) {
                Statics.field680 = field1160.method2931();
                Statics.field926 = field1160.method2931();
                for (int var248 = Statics.field680; var248 < Statics.field680 + 8; var248++) {
                    for (int var249 = Statics.field926; var249 < Statics.field926 + 8; var249++) {
                        if (field1058[Statics.field861][var248][var249] != null) {
                            field1058[Statics.field861][var248][var249] = null;
                            method672(var248, var249);
                        }
                    }
                }
                for (class77 var250 = (class77) field1059.method3304(); var250 != null; var250 = (class77) field1059.method3306()) {
                    if (var250.field1210 >= Statics.field680 && var250.field1210 < Statics.field680 + 8 && var250.field1211 >= Statics.field926 && var250.field1211 < Statics.field926 + 8 && Statics.field861 == var250.field1218) {
                        var250.field1209 = 0;
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 70) {
                int var251 = field1160.method2886();
                int var252 = field1160.method2931();
                int var253 = field1160.method2886();
                method995(var251, var252, var253);
                field974 = -1;
                return true;
            }
            if (field974 == 134) {
                method1000(false);
                field974 = -1;
                return true;
            }
            if (field974 == 36) {
                method990(field1160.method2892());
                field974 = -1;
                return true;
            }
            if (field974 == 126) {
                int var254 = field1160.method2929();
                int var255 = field1160.method2957();
                if (var255 == 65535) {
                    var255 = -1;
                }
                int var256 = field1160.method2882();
                if (var256 == 65535) {
                    var256 = -1;
                }
                int var257 = field1160.method2904();
                for (int var258 = var256; var258 <= var255; var258++) {
                    long var259 = ((long) var254 << 32) + (long) var258;
                    class196 var261 = field1130.method3252(var259);
                    if (var261 != null) {
                        var261.method3294();
                    }
                    field1130.method3253(new class202(var257), var259);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 16) {
                String var262 = field1160.method2892();
                int var263 = field1160.method2886();
                byte var264 = field1160.method2885();
                boolean var265 = false;
                if (var264 == -128) {
                    var265 = true;
                }
                if (var265) {
                    if (Statics.field379 == 0) {
                        field974 = -1;
                        return true;
                    }
                    boolean var266 = false;
                    int var267;
                    for (var267 = 0; var267 < Statics.field379 && (!Statics.field354[var267].field924.equals(var262) || Statics.field354[var267].field923 != var263); var267++) {
                    }
                    if (var267 < Statics.field379) {
                        while (var267 < Statics.field379 - 1) {
                            Statics.field354[var267] = Statics.field354[var267 + 1];
                            var267++;
                        }
                        Statics.field379--;
                        Statics.field354[Statics.field379] = null;
                    }
                } else {
                    field1160.method2892();
                    class76 var268 = new class76();
                    var268.field924 = var262;
                    var268.field922 = class271.method3563(var268.field924, Statics.field790);
                    var268.field923 = var263;
                    var268.field925 = var264;
                    int var269;
                    for (var269 = Statics.field379 - 1; var269 >= 0; var269--) {
                        int var270 = Statics.field354[var269].field922.compareTo(var268.field922);
                        if (var270 == 0) {
                            Statics.field354[var269].field923 = var263;
                            Statics.field354[var269].field925 = var264;
                            if (var262.equals(Statics.field844.field907)) {
                                Statics.field612 = var264;
                            }
                            field1057 = field1113;
                            field974 = -1;
                            return true;
                        }
                        if (var270 < 0) {
                            break;
                        }
                    }
                    if (Statics.field379 >= Statics.field354.length) {
                        field974 = -1;
                        return true;
                    }
                    for (int var271 = Statics.field379 - 1; var271 > var269; var271--) {
                        Statics.field354[var271 + 1] = Statics.field354[var271];
                    }
                    if (Statics.field379 == 0) {
                        Statics.field354 = new class76[100];
                    }
                    Statics.field354[var269 + 1] = var268;
                    Statics.field379++;
                    if (var262.equals(Statics.field844.field907)) {
                        Statics.field612 = var264;
                    }
                }
                field1057 = field1113;
                field974 = -1;
                return true;
            }
            if (field974 == 125) {
                byte var272 = field1160.method2885();
                int var273 = field1160.method2907();
                class215.field2619[var273] = var272;
                if (class215.field2616[var273] != var272) {
                    class215.field2616[var273] = var272;
                }
                method171(var273);
                field1114[++field1115 - 1 & 0x1F] = var273;
                field974 = -1;
                return true;
            }
            if (field974 == 10) {
                int var274 = field1160.method2931();
                int var275 = field1160.method2931();
                int var276 = field1160.method2931();
                int var277 = field1160.method2931();
                field1158[var274] = true;
                field1176[var274] = var275;
                field1192[var274] = var276;
                field1178[var274] = var277;
                field1179[var274] = 0;
                field974 = -1;
                return true;
            }
            if (field974 == 180) {
                for (int var278 = 0; var278 < class215.field2616.length; var278++) {
                    if (class215.field2619[var278] != class215.field2616[var278]) {
                        class215.field2616[var278] = class215.field2619[var278];
                        method171(var278);
                        field1114[++field1115 - 1 & 0x1F] = var278;
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 72) {
                method491();
                field1094 = field1160.method2887();
                field1125 = field1113;
                field974 = -1;
                return true;
            }
            if (field974 == 249) {
                int var279 = field1160.method2904();
                int var280 = field1160.method2904();
                class69 var281 = (class69) field1089.method3252((long) var279);
                class69 var282 = (class69) field1089.method3252((long) var280);
                if (var282 != null) {
                    method3(var282, var281 == null || var281.field845 != var282.field845);
                }
                if (var281 != null) {
                    var281.method3294();
                    field1089.method3253(var281, (long) var280);
                }
                class220 var283 = class220.method1162(var279);
                if (var283 != null) {
                    method667(var283);
                }
                class220 var284 = class220.method1162(var280);
                if (var284 != null) {
                    method667(var284);
                    method557(Statics.field780[var284.field2657 >>> 16], var284, true);
                }
                if (field1088 != -1) {
                    Statics.method615(field1088, 1);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 25) {
                Statics.field926 = field1160.method2912();
                Statics.field680 = field1160.method2921();
                while (field1160.field2412 < field1070) {
                    field974 = field1160.method2931();
                    method1392();
                }
                field974 = -1;
                return true;
            }
            if (field974 == 192) {
                int var285 = field1160.method2882();
                field1088 = var285;
                this.method1053(false);
                method977(var285);
                class84.method76(field1088);
                for (int var286 = 0; var286 < 100; var286++) {
                    field965[var286] = true;
                }
                field974 = -1;
                return true;
            }
            if (field974 == 59) {
                String var287 = field1160.method2892();
                long var288 = (long) field1160.method2886();
                long var290 = (long) field1160.method2888();
                class234[] var292 = new class234[] { class234.field3171, class234.field3173, class234.field3174, class234.field3175, class234.field3177, class234.field3181 };
                class234 var293 = (class234) class172.method1461(var292, field1160.method2931());
                long var294 = (var288 << 32) + var290;
                boolean var296 = false;
                for (int var297 = 0; var297 < 100; var297++) {
                    if (field1147[var297] == var294) {
                        var296 = true;
                        break;
                    }
                }
                if (method1542(var287)) {
                    var296 = true;
                }
                if (!var296 && field1047 == 0) {
                    field1147[field1151] = var294;
                    field1151 = (field1151 + 1) % 100;
                    class183 var298 = field1160;
                    String var302;
                    try {
                        int var299 = var298.method3003();
                        if (var299 > 32767) {
                            var299 = 32767;
                        }
                        byte[] var300 = new byte[var299];
                        var298.field2412 += Statics.field3675.method2819(var298.field2419, var298.field2412, var300, 0, var299);
                        String var301 = class270.method3847(var300, 0, var299);
                        var302 = var301;
                    } catch (Exception var501) {
                        var302 = "Cabbage";
                    }
                    String var305 = class268.method4480(class274.method999(var302));
                    byte var306;
                    if (var293.field3170) {
                        var306 = 7;
                    } else {
                        var306 = 3;
                    }
                    if (var293.field3176 == -1) {
                        class99.method1676(var306, var287, var305);
                    } else {
                        class99.method1676(var306, class89.method2878(var293.field3176) + var287, var305);
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 195) {
                int var307 = field1160.method2904();
                int var308 = field1160.method2886();
                if (var307 < -70000) {
                    var308 += 32768;
                }
                class220 var309;
                if (var307 >= 0) {
                    var309 = class220.method1162(var307);
                } else {
                    var309 = null;
                }
                if (var309 != null) {
                    for (int var310 = 0; var310 < var309.field2775.length; var310++) {
                        var309.field2775[var310] = 0;
                        var309.field2776[var310] = 0;
                    }
                }
                class64 var311 = (class64) class64.field795.method3252((long) var308);
                if (var311 != null) {
                    for (int var312 = 0; var312 < var311.field794.length; var312++) {
                        var311.field794[var312] = -1;
                        var311.field797[var312] = 0;
                    }
                }
                int var313 = field1160.method2886();
                for (int var314 = 0; var314 < var313; var314++) {
                    int var315 = field1160.method3071();
                    if (var315 == 255) {
                        var315 = field1160.method2904();
                    }
                    int var316 = field1160.method2882();
                    if (var309 != null && var314 < var309.field2775.length) {
                        var309.field2775[var314] = var316;
                        var309.field2776[var314] = var315;
                    }
                    class64.method972(var308, var314, var316 - 1, var315);
                }
                if (var309 != null) {
                    method667(var309);
                }
                method491();
                field1116[++field1027 - 1 & 0x1F] = var308 & 0x7FFF;
                field974 = -1;
                return true;
            }
            if (field974 == 96) {
                if (field1088 != -1) {
                    Statics.method615(field1088, 0);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 107) {
                field1160.field2412 += 28;
                if (field1160.method3052()) {
                    method4(field1160, field1160.field2412 - 28);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 143) {
                int var317 = field1160.method2931();
                if (field1160.method2931() == 0) {
                    field931[var317] = new class17();
                    field1160.field2412 += 18;
                } else {
                    field1160.field2412--;
                    field931[var317] = new class17(field1160, false);
                }
                field1123 = field1113;
                field974 = -1;
                return true;
            }
            if (field974 == 243) {
                class81 var318 = new class81();
                var318.field1313 = field1160.method2892();
                var318.field1314 = field1160.method2886();
                int var319 = field1160.method2904();
                var318.field1303 = var319;
                method2347(45);
                Statics.field332.method2705();
                Statics.field332 = null;
                class93.method247(var318);
                field974 = -1;
                return false;
            }
            if (field974 == 73) {
                method543();
                field974 = -1;
                return false;
            }
            if (field974 == 133) {
                class97.field1510 = 0;
                for (int var320 = 0; var320 < 2048; var320++) {
                    class97.field1509[var320] = null;
                    class97.field1515[var320] = 1;
                }
                for (int var321 = 0; var321 < 2048; var321++) {
                    field1048[var321] = null;
                }
                Statics.method49(field1160);
                field974 = -1;
                return true;
            }
            if (field974 == 197) {
                int var322 = field1160.method2929();
                int var323 = field1160.method2957();
                class215.field2619[var323] = var322;
                if (class215.field2616[var323] != var322) {
                    class215.field2616[var323] = var322;
                }
                method171(var323);
                field1114[++field1115 - 1 & 0x1F] = var323;
                field974 = -1;
                return true;
            }
            if (field974 == 53) {
                field944 = field1160.method2931();
                if (field944 == 1) {
                    field945 = field1160.method2886();
                }
                if (field944 >= 2 && field944 <= 6) {
                    if (field944 == 2) {
                        field950 = 64;
                        field1056 = 64;
                    }
                    if (field944 == 3) {
                        field950 = 0;
                        field1056 = 64;
                    }
                    if (field944 == 4) {
                        field950 = 128;
                        field1056 = 64;
                    }
                    if (field944 == 5) {
                        field950 = 64;
                        field1056 = 0;
                    }
                    if (field944 == 6) {
                        field950 = 64;
                        field1056 = 128;
                    }
                    field944 = 2;
                    field947 = field1160.method2886();
                    field948 = field1160.method2886();
                    field1075 = field1160.method2931();
                }
                if (field944 == 10) {
                    field946 = field1160.method2886();
                }
                field974 = -1;
                return true;
            }
            if (field974 == 56) {
                String var324 = field1160.method2892();
                int var325 = field1160.method2928();
                class220 var326 = class220.method1162(var325);
                if (!var324.equals(var326.field2783)) {
                    var326.field2783 = var324;
                    method667(var326);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 150) {
                int var327 = field1160.method2886();
                int var328 = field1160.method2928();
                class220 var329 = class220.method1162(var328);
                if (var329 != null && var329.field2651 == 0) {
                    if (var327 > var329.field2758 - var329.field2673) {
                        var327 = var329.field2758 - var329.field2673;
                    }
                    if (var327 < 0) {
                        var327 = 0;
                    }
                    if (var329.field2717 != var327) {
                        var329.field2717 = var327;
                        method667(var329);
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 219) {
                int var330 = field1160.method2907();
                if (var330 == 65535) {
                    var330 = -1;
                }
                int var331 = field1160.method2919();
                int var332 = field1160.method2919();
                class220 var333 = class220.method1162(var332);
                if (var333.field2656) {
                    var333.field2710 = var330;
                    var333.field2695 = var331;
                    class260 var335 = class260.method3915(var330);
                    var333.field2779 = var335.field3520;
                    var333.field2709 = var335.field3557;
                    var333.field2742 = var335.field3522;
                    var333.field2645 = var335.field3514;
                    var333.field2707 = var335.field3524;
                    var333.field2659 = var335.field3507;
                    if (var335.field3531 == 1) {
                        var333.field2663 = 1;
                    } else {
                        var333.field2663 = 2;
                    }
                    if (var333.field2694 > 0) {
                        var333.field2659 = var333.field2659 * 32 / var333.field2694;
                    } else if (var333.field2668 > 0) {
                        var333.field2659 = var333.field2659 * 32 / var333.field2668;
                    }
                    method667(var333);
                } else if (var330 == -1) {
                    var333.field2700 = 0;
                    field974 = -1;
                    return true;
                } else {
                    class260 var334 = class260.method3915(var330);
                    var333.field2700 = 4;
                    var333.field2777 = var330;
                    var333.field2779 = var334.field3520;
                    var333.field2709 = var334.field3557;
                    var333.field2659 = var334.field3507 * 100 / var331;
                    method667(var333);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 151 || field974 == 88 || field974 == 242 || field974 == 139 || field974 == 69 || field974 == 176 || field974 == 206 || field974 == 97 || field974 == 253 || field974 == 175) {
                method1392();
                field974 = -1;
                return true;
            }
            if (field974 == 62) {
                int var336 = field1160.method2922();
                int var337 = field1160.method2904();
                class220 var338 = class220.method1162(var337);
                if (var338.field2724 != var336 || var336 == -1) {
                    var338.field2724 = var336;
                    var338.field2671 = 0;
                    var338.field2780 = 0;
                    method667(var338);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 33) {
                field980 = field1160.method2882() * 30;
                field1125 = field1113;
                field974 = -1;
                return true;
            }
            if (field974 == 109) {
                method1000(true);
                field974 = -1;
                return true;
            }
            if (field974 == 74) {
                int var339 = field1160.method3045();
                int var340 = field1160.method2919();
                int var341 = field1160.method3045();
                class220 var342 = class220.method1162(var340);
                if (var342.field2666 != var341 || var342.field2667 != var339 || var342.field2781 != 0 || var342.field2746 != 0) {
                    var342.field2666 = var341;
                    var342.field2667 = var339;
                    var342.field2781 = 0;
                    var342.field2746 = 0;
                    method667(var342);
                    this.method1054(var342);
                    if (var342.field2651 == 0) {
                        method557(Statics.field780[var340 >> 16], var342, false);
                    }
                }
                field974 = -1;
                return true;
            }
            if (field974 == 103) {
                int var343 = field1160.method3003();
                boolean var344 = field1160.method2931() == 1;
                String var345 = "";
                boolean var346 = false;
                if (var344) {
                    var345 = field1160.method2892();
                    if (method1542(var345)) {
                        var346 = true;
                    }
                }
                String var347 = field1160.method2892();
                if (!var346) {
                    class99.method1676(var343, var345, var347);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 121) {
                int var348 = field1160.method2928();
                int var349 = field1160.method2886();
                int var350 = field1160.method2886();
                int var351 = field1160.method2882();
                class220 var352 = class220.method1162(var348);
                if (var352.field2779 != var349 || var352.field2709 != var351 || var352.field2659 != var350) {
                    var352.field2779 = var349;
                    var352.field2709 = var351;
                    var352.field2659 = var350;
                    method667(var352);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 46) {
                method1036(true);
                field1160.method3116();
                int var353 = field1160.method2886();
                class183 var354 = field1160;
                int var355 = var354.field2412;
                class97.field1517 = 0;
                int var356 = 0;
                var354.method3128();
                for (int var357 = 0; var357 < class97.field1510; var357++) {
                    int var358 = class97.field1511[var357];
                    if ((class97.field1507[var358] & 0x1) == 0) {
                        if (var356 > 0) {
                            var356--;
                            class97.field1507[var358] = (byte) (class97.field1507[var358] | 0x2);
                        } else {
                            int var359 = var354.method3118(1);
                            if (var359 == 0) {
                                var356 = class97.method994(var354);
                                class97.field1507[var358] = (byte) (class97.field1507[var358] | 0x2);
                            } else {
                                class97.method1562(var354, var358);
                            }
                        }
                    }
                }
                var354.method3124();
                if (var356 != 0) {
                    throw new RuntimeException();
                }
                var354.method3128();
                for (int var360 = 0; var360 < class97.field1510; var360++) {
                    int var361 = class97.field1511[var360];
                    if ((class97.field1507[var361] & 0x1) != 0) {
                        if (var356 > 0) {
                            var356--;
                            class97.field1507[var361] = (byte) (class97.field1507[var361] | 0x2);
                        } else {
                            int var362 = var354.method3118(1);
                            if (var362 == 0) {
                                var356 = class97.method994(var354);
                                class97.field1507[var361] = (byte) (class97.field1507[var361] | 0x2);
                            } else {
                                class97.method1562(var354, var361);
                            }
                        }
                    }
                }
                var354.method3124();
                if (var356 != 0) {
                    throw new RuntimeException();
                }
                var354.method3128();
                for (int var363 = 0; var363 < class97.field1512; var363++) {
                    int var364 = class97.field1518[var363];
                    if ((class97.field1507[var364] & 0x1) != 0) {
                        if (var356 > 0) {
                            var356--;
                            class97.field1507[var364] = (byte) (class97.field1507[var364] | 0x2);
                        } else {
                            int var365 = var354.method3118(1);
                            if (var365 == 0) {
                                var356 = class97.method994(var354);
                                class97.field1507[var364] = (byte) (class97.field1507[var364] | 0x2);
                            } else if (class97.method986(var354, var364)) {
                                class97.field1507[var364] = (byte) (class97.field1507[var364] | 0x2);
                            }
                        }
                    }
                }
                var354.method3124();
                if (var356 != 0) {
                    throw new RuntimeException();
                }
                var354.method3128();
                for (int var366 = 0; var366 < class97.field1512; var366++) {
                    int var367 = class97.field1518[var366];
                    if ((class97.field1507[var367] & 0x1) == 0) {
                        if (var356 > 0) {
                            var356--;
                            class97.field1507[var367] = (byte) (class97.field1507[var367] | 0x2);
                        } else {
                            int var368 = var354.method3118(1);
                            if (var368 == 0) {
                                var356 = class97.method994(var354);
                                class97.field1507[var367] = (byte) (class97.field1507[var367] | 0x2);
                            } else if (class97.method986(var354, var367)) {
                                class97.field1507[var367] = (byte) (class97.field1507[var367] | 0x2);
                            }
                        }
                    }
                }
                var354.method3124();
                if (var356 != 0) {
                    throw new RuntimeException();
                }
                class97.field1510 = 0;
                class97.field1512 = 0;
                for (int var369 = 1; var369 < 2048; var369++) {
                    class97.field1507[var369] = (byte) (class97.field1507[var369] >> 1);
                    class75 var370 = field1048[var369];
                    if (var370 == null) {
                        class97.field1518[++class97.field1512 - 1] = var369;
                    } else {
                        class97.field1511[++class97.field1510 - 1] = var369;
                    }
                }
                for (int var371 = 0; var371 < class97.field1517; var371++) {
                    int var372 = class97.field1508[var371];
                    class75 var373 = field1048[var372];
                    int var374 = var354.method2931();
                    if ((var374 & 0x2) != 0) {
                        var374 += var354.method2931() << 8;
                    }
                    byte var375 = -1;
                    if ((var374 & 0x10) != 0) {
                        int var376 = var354.method2931();
                        byte[] var377 = new byte[var376];
                        class177 var378 = new class177(var377);
                        var354.method2895(var377, 0, var376);
                        class97.field1509[var372] = var378;
                        var373.method1015(var378);
                    }
                    if ((var374 & 0x80) != 0) {
                        int var379 = var354.method2886();
                        if (var379 == 65535) {
                            var379 = -1;
                        }
                        int var380 = var354.method2931();
                        method140(var373, var379, var380);
                    }
                    if ((var374 & 0x40) != 0) {
                        var373.field1261 = var354.method2886();
                        if (var373.field1261 == 65535) {
                            var373.field1261 = -1;
                        }
                    }
                    if ((var374 & 0x1) != 0) {
                        var373.field1274 = var354.method2892();
                        if (var373.field1274.charAt(0) == '~') {
                            var373.field1274 = var373.field1274.substring(1);
                            class99.method1676(2, var373.field907, var373.field1274);
                        } else if (Statics.field844 == var373) {
                            class99.method1676(2, var373.field907, var373.field1274);
                        }
                        var373.field1249 = false;
                        var373.field1252 = 0;
                        var373.field1253 = 0;
                        var373.field1240 = 150;
                    }
                    if ((var374 & 0x20) != 0) {
                        int var381 = var354.method2931();
                        if (var381 > 0) {
                            for (int var382 = 0; var382 < var381; var382++) {
                                int var383 = -1;
                                int var384 = -1;
                                int var385 = -1;
                                int var386 = var354.method3003();
                                if (var386 == 32767) {
                                    var386 = var354.method3003();
                                    var384 = var354.method3003();
                                    var383 = var354.method3003();
                                    var385 = var354.method3003();
                                } else if (var386 == 32766) {
                                    var386 = -1;
                                } else {
                                    var384 = var354.method3003();
                                }
                                int var387 = var354.method3003();
                                var373.method1394(var386, var384, var383, var385, field936, var387);
                            }
                        }
                        int var388 = var354.method2931();
                        if (var388 > 0) {
                            for (int var389 = 0; var389 < var388; var389++) {
                                int var390 = var354.method3003();
                                int var391 = var354.method3003();
                                if (var391 == 32767) {
                                    var373.method1393(var390);
                                } else {
                                    int var392 = var354.method3003();
                                    int var393 = var354.method2931();
                                    int var394 = var391 > 0 ? var354.method2931() : var393;
                                    var373.method1395(var390, field936, var391, var392, var393, var394);
                                }
                            }
                        }
                    }
                    if ((var374 & 0x8) != 0) {
                        var373.field1263 = var354.method2886();
                        if (var373.field1289 == 0) {
                            var373.field1286 = var373.field1263;
                            var373.field1263 = -1;
                        }
                    }
                    if ((var374 & 0x4) != 0) {
                        int var395 = var354.method2886();
                        class234[] var396 = new class234[] { class234.field3171, class234.field3173, class234.field3174, class234.field3175, class234.field3177, class234.field3181 };
                        class234 var397 = (class234) class172.method1461(var396, var354.method2931());
                        boolean var398 = var354.method2931() == 1;
                        int var399 = var354.method2931();
                        int var400 = var354.field2412;
                        if (var373.field907 != null && var373.field895 != null) {
                            boolean var401 = false;
                            if (var397.field3178 && method1542(var373.field907)) {
                                var401 = true;
                            }
                            if (!var401 && field1047 == 0 && !var373.field914) {
                                class97.field1514.field2412 = 0;
                                var354.method2895(class97.field1514.field2419, 0, var399);
                                class97.field1514.field2412 = 0;
                                class177 var402 = class97.field1514;
                                String var406;
                                try {
                                    int var403 = var402.method3003();
                                    if (var403 > 32767) {
                                        var403 = 32767;
                                    }
                                    byte[] var404 = new byte[var403];
                                    var402.field2412 += Statics.field3675.method2819(var402.field2419, var402.field2412, var404, 0, var403);
                                    String var405 = class270.method3847(var404, 0, var403);
                                    var406 = var405;
                                } catch (Exception var500) {
                                    var406 = "Cabbage";
                                }
                                String var409 = class268.method4480(class274.method999(var406));
                                var373.field1274 = var409.trim();
                                var373.field1252 = var395 >> 8;
                                var373.field1253 = var395 & 0xFF;
                                var373.field1240 = 150;
                                var373.field1249 = var398;
                                var373.field1250 = Statics.field844 != var373 && var397.field3178 && field1146 != "" && var409.toLowerCase().indexOf(field1146) == -1;
                                int var410;
                                if (var397.field3170) {
                                    var410 = var398 ? 91 : 1;
                                } else {
                                    var410 = var398 ? 90 : 2;
                                }
                                if (var397.field3176 == -1) {
                                    class99.method1676(var410, var373.field907, var409);
                                } else {
                                    class99.method1676(var410, class89.method2878(var397.field3176) + var373.field907, var409);
                                }
                            }
                        }
                        var354.field2412 = var399 + var400;
                    }
                    if ((var374 & 0x100) != 0) {
                        var373.field1292 = var354.method2886();
                        int var411 = var354.method2904();
                        var373.field1276 = var411 >> 16;
                        var373.field1257 = (var411 & 0xFFFF) + field936;
                        var373.field1273 = 0;
                        var373.field1271 = 0;
                        if (var373.field1257 > field936) {
                            var373.field1273 = -1;
                        }
                        if (var373.field1292 == 65535) {
                            var373.field1292 = -1;
                        }
                    }
                    if ((var374 & 0x200) != 0) {
                        var373.field1277 = var354.method2885();
                        var373.field1251 = var354.method2885();
                        var373.field1278 = var354.method2885();
                        var373.field1280 = var354.method2885();
                        var373.field1281 = var354.method2886() + field936;
                        var373.field1282 = var354.method2886() + field936;
                        var373.field1283 = var354.method2886();
                        if (var373.field917) {
                            var373.field1277 += var373.field918;
                            var373.field1251 += var373.field919;
                            var373.field1278 += var373.field918;
                            var373.field1280 += var373.field919;
                            var373.field1289 = 0;
                        } else {
                            var373.field1277 += var373.field1255[0];
                            var373.field1251 += var373.field1291[0];
                            var373.field1278 += var373.field1255[0];
                            var373.field1280 += var373.field1291[0];
                            var373.field1289 = 1;
                        }
                        var373.field1294 = 0;
                    }
                    if ((var374 & 0x1000) != 0) {
                        class97.field1515[var372] = var354.method2885();
                    }
                    if ((var374 & 0x800) != 0) {
                        var375 = var354.method2885();
                    }
                    if ((var374 & 0x400) != 0) {
                        for (int var412 = 0; var412 < 3; var412++) {
                            var373.field899[var412] = var354.method2892();
                        }
                    }
                    if (var373.field917) {
                        if (var375 == 127) {
                            var373.method1034(var373.field918, var373.field919);
                        } else {
                            byte var413;
                            if (var375 == -1) {
                                var413 = class97.field1515[var372];
                            } else {
                                var413 = var375;
                            }
                            var373.method1018(var373.field918, var373.field919, var413);
                        }
                    }
                }
                if (var354.field2412 - var355 != var353) {
                    throw new RuntimeException(var354.field2412 - var355 + " " + var353);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 100) {
                int var414 = field1160.method2907();
                class64.method668(var414);
                field1116[++field1027 - 1 & 0x1F] = var414 & 0x7FFF;
                field974 = -1;
                return true;
            }
            if (field974 == 156) {
                int var415 = field1160.method2919();
                class220 var416 = class220.method1162(var415);
                var416.field2700 = 3;
                var416.field2777 = Statics.field844.field895.method3618();
                method667(var416);
                field974 = -1;
                return true;
            }
            if (field974 == 235) {
                field1057 = field1113;
                if (field1070 == 0) {
                    field1153 = null;
                    field1197 = null;
                    Statics.field379 = 0;
                    Statics.field354 = null;
                    field974 = -1;
                    return true;
                }
                field1197 = field1160.method2892();
                long var417 = field1160.method2890();
                field1153 = class272.method3158(var417);
                Statics.field2204 = field1160.method2885();
                int var419 = field1160.method2931();
                if (var419 == 255) {
                    field974 = -1;
                    return true;
                }
                Statics.field379 = var419;
                class76[] var420 = new class76[100];
                for (int var421 = 0; var421 < Statics.field379; var421++) {
                    var420[var421] = new class76();
                    var420[var421].field924 = field1160.method2892();
                    var420[var421].field922 = class271.method3563(var420[var421].field924, Statics.field790);
                    var420[var421].field923 = field1160.method2886();
                    var420[var421].field925 = field1160.method2885();
                    field1160.method2892();
                    if (var420[var421].field924.equals(Statics.field844.field907)) {
                        Statics.field612 = var420[var421].field925;
                    }
                }
                boolean var422 = false;
                int var423 = Statics.field379;
                while (var423 > 0) {
                    boolean var424 = true;
                    var423--;
                    for (int var425 = 0; var425 < var423; var425++) {
                        if (var420[var425].field922.compareTo(var420[var425 + 1].field922) > 0) {
                            class76 var426 = var420[var425];
                            var420[var425] = var420[var425 + 1];
                            var420[var425 + 1] = var426;
                            var424 = false;
                        }
                    }
                    if (var424) {
                        break;
                    }
                }
                Statics.field354 = var420;
                field974 = -1;
                return true;
            }
            if (field974 == 4) {
                class183 var427 = field1160;
                int var428 = field1070;
                int var429 = var427.field2412;
                class97.field1517 = 0;
                int var430 = 0;
                var427.method3128();
                for (int var431 = 0; var431 < class97.field1510; var431++) {
                    int var432 = class97.field1511[var431];
                    if ((class97.field1507[var432] & 0x1) == 0) {
                        if (var430 > 0) {
                            var430--;
                            class97.field1507[var432] = (byte) (class97.field1507[var432] | 0x2);
                        } else {
                            int var433 = var427.method3118(1);
                            if (var433 == 0) {
                                var430 = class97.method994(var427);
                                class97.field1507[var432] = (byte) (class97.field1507[var432] | 0x2);
                            } else {
                                class97.method1562(var427, var432);
                            }
                        }
                    }
                }
                var427.method3124();
                if (var430 != 0) {
                    throw new RuntimeException();
                }
                var427.method3128();
                for (int var434 = 0; var434 < class97.field1510; var434++) {
                    int var435 = class97.field1511[var434];
                    if ((class97.field1507[var435] & 0x1) != 0) {
                        if (var430 > 0) {
                            var430--;
                            class97.field1507[var435] = (byte) (class97.field1507[var435] | 0x2);
                        } else {
                            int var436 = var427.method3118(1);
                            if (var436 == 0) {
                                var430 = class97.method994(var427);
                                class97.field1507[var435] = (byte) (class97.field1507[var435] | 0x2);
                            } else {
                                class97.method1562(var427, var435);
                            }
                        }
                    }
                }
                var427.method3124();
                if (var430 != 0) {
                    throw new RuntimeException();
                }
                var427.method3128();
                for (int var437 = 0; var437 < class97.field1512; var437++) {
                    int var438 = class97.field1518[var437];
                    if ((class97.field1507[var438] & 0x1) != 0) {
                        if (var430 > 0) {
                            var430--;
                            class97.field1507[var438] = (byte) (class97.field1507[var438] | 0x2);
                        } else {
                            int var439 = var427.method3118(1);
                            if (var439 == 0) {
                                var430 = class97.method994(var427);
                                class97.field1507[var438] = (byte) (class97.field1507[var438] | 0x2);
                            } else if (class97.method986(var427, var438)) {
                                class97.field1507[var438] = (byte) (class97.field1507[var438] | 0x2);
                            }
                        }
                    }
                }
                var427.method3124();
                if (var430 != 0) {
                    throw new RuntimeException();
                }
                var427.method3128();
                for (int var440 = 0; var440 < class97.field1512; var440++) {
                    int var441 = class97.field1518[var440];
                    if ((class97.field1507[var441] & 0x1) == 0) {
                        if (var430 > 0) {
                            var430--;
                            class97.field1507[var441] = (byte) (class97.field1507[var441] | 0x2);
                        } else {
                            int var442 = var427.method3118(1);
                            if (var442 == 0) {
                                var430 = class97.method994(var427);
                                class97.field1507[var441] = (byte) (class97.field1507[var441] | 0x2);
                            } else if (class97.method986(var427, var441)) {
                                class97.field1507[var441] = (byte) (class97.field1507[var441] | 0x2);
                            }
                        }
                    }
                }
                var427.method3124();
                if (var430 != 0) {
                    throw new RuntimeException();
                }
                class97.field1510 = 0;
                class97.field1512 = 0;
                for (int var443 = 1; var443 < 2048; var443++) {
                    class97.field1507[var443] = (byte) (class97.field1507[var443] >> 1);
                    class75 var444 = field1048[var443];
                    if (var444 == null) {
                        class97.field1518[++class97.field1512 - 1] = var443;
                    } else {
                        class97.field1511[++class97.field1510 - 1] = var443;
                    }
                }
                for (int var445 = 0; var445 < class97.field1517; var445++) {
                    int var446 = class97.field1508[var445];
                    class75 var447 = field1048[var446];
                    int var448 = var427.method2931();
                    if ((var448 & 0x2) != 0) {
                        var448 += var427.method2931() << 8;
                    }
                    byte var449 = -1;
                    if ((var448 & 0x10) != 0) {
                        int var450 = var427.method2931();
                        byte[] var451 = new byte[var450];
                        class177 var452 = new class177(var451);
                        var427.method2895(var451, 0, var450);
                        class97.field1509[var446] = var452;
                        var447.method1015(var452);
                    }
                    if ((var448 & 0x80) != 0) {
                        int var453 = var427.method2886();
                        if (var453 == 65535) {
                            var453 = -1;
                        }
                        int var454 = var427.method2931();
                        method140(var447, var453, var454);
                    }
                    if ((var448 & 0x40) != 0) {
                        var447.field1261 = var427.method2886();
                        if (var447.field1261 == 65535) {
                            var447.field1261 = -1;
                        }
                    }
                    if ((var448 & 0x1) != 0) {
                        var447.field1274 = var427.method2892();
                        if (var447.field1274.charAt(0) == '~') {
                            var447.field1274 = var447.field1274.substring(1);
                            class99.method1676(2, var447.field907, var447.field1274);
                        } else if (Statics.field844 == var447) {
                            class99.method1676(2, var447.field907, var447.field1274);
                        }
                        var447.field1249 = false;
                        var447.field1252 = 0;
                        var447.field1253 = 0;
                        var447.field1240 = 150;
                    }
                    if ((var448 & 0x20) != 0) {
                        int var455 = var427.method2931();
                        if (var455 > 0) {
                            for (int var456 = 0; var456 < var455; var456++) {
                                int var457 = -1;
                                int var458 = -1;
                                int var459 = -1;
                                int var460 = var427.method3003();
                                if (var460 == 32767) {
                                    var460 = var427.method3003();
                                    var458 = var427.method3003();
                                    var457 = var427.method3003();
                                    var459 = var427.method3003();
                                } else if (var460 == 32766) {
                                    var460 = -1;
                                } else {
                                    var458 = var427.method3003();
                                }
                                int var461 = var427.method3003();
                                var447.method1394(var460, var458, var457, var459, field936, var461);
                            }
                        }
                        int var462 = var427.method2931();
                        if (var462 > 0) {
                            for (int var463 = 0; var463 < var462; var463++) {
                                int var464 = var427.method3003();
                                int var465 = var427.method3003();
                                if (var465 == 32767) {
                                    var447.method1393(var464);
                                } else {
                                    int var466 = var427.method3003();
                                    int var467 = var427.method2931();
                                    int var468 = var465 > 0 ? var427.method2931() : var467;
                                    var447.method1395(var464, field936, var465, var466, var467, var468);
                                }
                            }
                        }
                    }
                    if ((var448 & 0x8) != 0) {
                        var447.field1263 = var427.method2886();
                        if (var447.field1289 == 0) {
                            var447.field1286 = var447.field1263;
                            var447.field1263 = -1;
                        }
                    }
                    if ((var448 & 0x4) != 0) {
                        int var469 = var427.method2886();
                        class234[] var470 = new class234[] { class234.field3171, class234.field3173, class234.field3174, class234.field3175, class234.field3177, class234.field3181 };
                        class234 var471 = (class234) class172.method1461(var470, var427.method2931());
                        boolean var472 = var427.method2931() == 1;
                        int var473 = var427.method2931();
                        int var474 = var427.field2412;
                        if (var447.field907 != null && var447.field895 != null) {
                            boolean var475 = false;
                            if (var471.field3178 && method1542(var447.field907)) {
                                var475 = true;
                            }
                            if (!var475 && field1047 == 0 && !var447.field914) {
                                class97.field1514.field2412 = 0;
                                var427.method2895(class97.field1514.field2419, 0, var473);
                                class97.field1514.field2412 = 0;
                                class177 var476 = class97.field1514;
                                String var480;
                                try {
                                    int var477 = var476.method3003();
                                    if (var477 > 32767) {
                                        var477 = 32767;
                                    }
                                    byte[] var478 = new byte[var477];
                                    var476.field2412 += Statics.field3675.method2819(var476.field2419, var476.field2412, var478, 0, var477);
                                    String var479 = class270.method3847(var478, 0, var477);
                                    var480 = var479;
                                } catch (Exception var499) {
                                    var480 = "Cabbage";
                                }
                                String var483 = class268.method4480(class274.method999(var480));
                                var447.field1274 = var483.trim();
                                var447.field1252 = var469 >> 8;
                                var447.field1253 = var469 & 0xFF;
                                var447.field1240 = 150;
                                var447.field1249 = var472;
                                var447.field1250 = Statics.field844 != var447 && var471.field3178 && field1146 != "" && var483.toLowerCase().indexOf(field1146) == -1;
                                int var484;
                                if (var471.field3170) {
                                    var484 = var472 ? 91 : 1;
                                } else {
                                    var484 = var472 ? 90 : 2;
                                }
                                if (var471.field3176 == -1) {
                                    class99.method1676(var484, var447.field907, var483);
                                } else {
                                    class99.method1676(var484, class89.method2878(var471.field3176) + var447.field907, var483);
                                }
                            }
                        }
                        var427.field2412 = var473 + var474;
                    }
                    if ((var448 & 0x100) != 0) {
                        var447.field1292 = var427.method2886();
                        int var485 = var427.method2904();
                        var447.field1276 = var485 >> 16;
                        var447.field1257 = (var485 & 0xFFFF) + field936;
                        var447.field1273 = 0;
                        var447.field1271 = 0;
                        if (var447.field1257 > field936) {
                            var447.field1273 = -1;
                        }
                        if (var447.field1292 == 65535) {
                            var447.field1292 = -1;
                        }
                    }
                    if ((var448 & 0x200) != 0) {
                        var447.field1277 = var427.method2885();
                        var447.field1251 = var427.method2885();
                        var447.field1278 = var427.method2885();
                        var447.field1280 = var427.method2885();
                        var447.field1281 = var427.method2886() + field936;
                        var447.field1282 = var427.method2886() + field936;
                        var447.field1283 = var427.method2886();
                        if (var447.field917) {
                            var447.field1277 += var447.field918;
                            var447.field1251 += var447.field919;
                            var447.field1278 += var447.field918;
                            var447.field1280 += var447.field919;
                            var447.field1289 = 0;
                        } else {
                            var447.field1277 += var447.field1255[0];
                            var447.field1251 += var447.field1291[0];
                            var447.field1278 += var447.field1255[0];
                            var447.field1280 += var447.field1291[0];
                            var447.field1289 = 1;
                        }
                        var447.field1294 = 0;
                    }
                    if ((var448 & 0x1000) != 0) {
                        class97.field1515[var446] = var427.method2885();
                    }
                    if ((var448 & 0x800) != 0) {
                        var449 = var427.method2885();
                    }
                    if ((var448 & 0x400) != 0) {
                        for (int var486 = 0; var486 < 3; var486++) {
                            var447.field899[var486] = var427.method2892();
                        }
                    }
                    if (var447.field917) {
                        if (var449 == 127) {
                            var447.method1034(var447.field918, var447.field919);
                        } else {
                            byte var487;
                            if (var449 == -1) {
                                var487 = class97.field1515[var446];
                            } else {
                                var487 = var449;
                            }
                            var447.method1018(var447.field918, var447.field919, var487);
                        }
                    }
                }
                if (var427.field2412 - var429 != var428) {
                    throw new RuntimeException(var427.field2412 - var429 + " " + var428);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 218) {
                field1194 = 1;
                field1035 = field1113;
                field974 = -1;
                return true;
            }
            if (field974 == 205) {
                int var488 = field1160.method2882();
                int var489 = field1160.method2919();
                class220 var490 = class220.method1162(var489);
                if (var490.field2700 != 2 || var490.field2777 != var488) {
                    var490.field2700 = 2;
                    var490.field2777 = var488;
                    method667(var490);
                }
                field974 = -1;
                return true;
            }
            if (field974 == 147) {
                String var491 = field1160.method2892();
                Object[] var492 = new Object[var491.length() + 1];
                for (int var493 = var491.length() - 1; var493 >= 0; var493--) {
                    if (var491.charAt(var493) == 's') {
                        var492[var493 + 1] = field1160.method2892();
                    } else {
                        var492[var493 + 1] = Integer.valueOf(field1160.method2904());
                    }
                }
                var492[0] = Integer.valueOf(field1160.method2904());
                class70 var494 = new class70();
                var494.field854 = var492;
                class84.method2625(var494);
                field974 = -1;
                return true;
            }
            class154.method2730("" + field974 + class89.field1404 + field978 + class89.field1404 + field979 + class89.field1404 + field1070, (Throwable) null);
            method543();
        } catch (IOException var511) {
            method164();
        } catch (Exception var512) {
            String var497 = "" + field974 + class89.field1404 + field978 + class89.field1404 + field979 + class89.field1404 + field1070 + class89.field1404 + (Statics.field353 + Statics.field844.field1255[0]) + class89.field1404 + (Statics.field2461 + Statics.field844.field1291[0]) + class89.field1404;
            for (int var498 = 0; var498 < field1070 && var498 < 50; var498++) {
                var497 = var497 + field1160.field2419[var498] + class89.field1404;
            }
            class154.method2730(var497, var512);
            method543();
        }
        return true;
    }

    @ObfuscatedName("cb.gc(B)V")
    public static final void method1392() {
        if (field974 == 175) {
            int var0 = field1160.method3071();
            int var1 = (var0 >> 4 & 0x7) + Statics.field680;
            int var2 = (var0 & 0x7) + Statics.field926;
            int var3 = field1160.method2921();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field1002[var4];
            int var7 = field1160.method2957();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method2247(Statics.field861, var1, var2, var6, var7, var4, var5, 0, -1);
            }
        } else if (field974 == 69) {
            int var8 = field1160.method2931();
            int var9 = (var8 >> 4 & 0x7) + Statics.field680;
            int var10 = (var8 & 0x7) + Statics.field926;
            int var11 = var9 + field1160.method2885();
            int var12 = var10 + field1160.method2885();
            int var13 = field1160.method2887();
            int var14 = field1160.method2886();
            int var15 = field1160.method2931() * 4;
            int var16 = field1160.method2931() * 4;
            int var17 = field1160.method2886();
            int var18 = field1160.method2886();
            int var19 = field1160.method2931();
            int var20 = field1160.method2931();
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var14 != 65535) {
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                int var23 = var11 * 128 + 64;
                int var24 = var12 * 128 + 64;
                class94 var25 = new class94(var14, Statics.field861, var21, var22, method2656(var21, var22, Statics.field861) - var15, field936 + var17, field936 + var18, var19, var20, var13, var16);
                var25.method1599(var23, var24, method2656(var23, var24, Statics.field861) - var16, field936 + var17);
                field1060.method3299(var25);
            }
        } else if (field974 == 97) {
            int var26 = field1160.method2921();
            int var27 = var26 >> 2;
            int var28 = var26 & 0x3;
            int var29 = field1002[var27];
            int var30 = field1160.method3071();
            int var31 = (var30 >> 4 & 0x7) + Statics.field680;
            int var32 = (var30 & 0x7) + Statics.field926;
            int var33 = field1160.method2907();
            if (var31 >= 0 && var32 >= 0 && var31 < 103 && var32 < 103) {
                if (var29 == 0) {
                    class143 var34 = Statics.field3635.method2446(Statics.field861, var31, var32);
                    if (var34 != null) {
                        int var35 = var34.field2132 >> 14 & 0x7FFF;
                        if (var27 == 2) {
                            var34.field2138 = new class101(var35, 2, var28 + 4, Statics.field861, var31, var32, var33, false, var34.field2138);
                            var34.field2139 = new class101(var35, 2, var28 + 1 & 0x3, Statics.field861, var31, var32, var33, false, var34.field2139);
                        } else {
                            var34.field2138 = new class101(var35, var27, var28, Statics.field861, var31, var32, var33, false, var34.field2138);
                        }
                    }
                }
                if (var29 == 1) {
                    class148 var36 = Statics.field3635.method2549(Statics.field861, var31, var32);
                    if (var36 != null) {
                        int var37 = var36.field2185 >> 14 & 0x7FFF;
                        if (var27 == 4 || var27 == 5) {
                            var36.field2183 = new class101(var37, 4, var28, Statics.field861, var31, var32, var33, false, var36.field2183);
                        } else if (var27 == 6) {
                            var36.field2183 = new class101(var37, 4, var28 + 4, Statics.field861, var31, var32, var33, false, var36.field2183);
                        } else if (var27 == 7) {
                            var36.field2183 = new class101(var37, 4, (var28 + 2 & 0x3) + 4, Statics.field861, var31, var32, var33, false, var36.field2183);
                        } else if (var27 == 8) {
                            var36.field2183 = new class101(var37, 4, var28 + 4, Statics.field861, var31, var32, var33, false, var36.field2183);
                            var36.field2177 = new class101(var37, 4, (var28 + 2 & 0x3) + 4, Statics.field861, var31, var32, var33, false, var36.field2177);
                        }
                    }
                }
                if (var29 == 2) {
                    class149 var38 = Statics.field3635.method2448(Statics.field861, var31, var32);
                    if (var27 == 11) {
                        var27 = 10;
                    }
                    if (var38 != null) {
                        var38.field2193 = new class101(var38.field2191 >> 14 & 0x7FFF, var27, var28, Statics.field861, var31, var32, var33, false, var38.field2193);
                    }
                }
                if (var29 == 3) {
                    class130 var39 = Statics.field3635.method2566(Statics.field861, var31, var32);
                    if (var39 != null) {
                        var39.field1874 = new class101(var39.field1872 >> 14 & 0x7FFF, 22, var28, Statics.field861, var31, var32, var33, false, var39.field1874);
                    }
                }
            }
        } else if (field974 == 253) {
            int var40 = field1160.method2912();
            int var41 = var40 >> 2;
            int var42 = var40 & 0x3;
            int var43 = field1002[var41];
            int var44 = field1160.method2912();
            int var45 = (var44 >> 4 & 0x7) + Statics.field680;
            int var46 = (var44 & 0x7) + Statics.field926;
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                method2247(Statics.field861, var45, var46, var43, -1, var41, var42, 0, -1);
            }
        } else if (field974 == 206) {
            int var47 = field1160.method2957();
            int var48 = field1160.method2957();
            int var49 = field1160.method3071();
            int var50 = (var49 >> 4 & 0x7) + Statics.field680;
            int var51 = (var49 & 0x7) + Statics.field926;
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                class95 var52 = new class95();
                var52.field1499 = var47;
                var52.field1500 = var48;
                if (field1058[Statics.field861][var50][var51] == null) {
                    field1058[Statics.field861][var50][var51] = new class197();
                }
                field1058[Statics.field861][var50][var51].method3299(var52);
                method672(var50, var51);
            }
        } else if (field974 == 88) {
            int var53 = field1160.method2931();
            int var54 = (var53 >> 4 & 0x7) + Statics.field680;
            int var55 = (var53 & 0x7) + Statics.field926;
            int var56 = field1160.method2886();
            int var57 = field1160.method2886();
            int var58 = field1160.method2886();
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                class197 var59 = field1058[Statics.field861][var54][var55];
                if (var59 != null) {
                    for (class95 var60 = (class95) var59.method3304(); var60 != null; var60 = (class95) var59.method3306()) {
                        if ((var56 & 0x7FFF) == var60.field1499 && var60.field1500 == var57) {
                            var60.field1500 = var58;
                            break;
                        }
                    }
                    method672(var54, var55);
                }
            }
        } else if (field974 == 139) {
            int var61 = field1160.method2931();
            int var62 = (var61 >> 4 & 0x7) + Statics.field680;
            int var63 = (var61 & 0x7) + Statics.field926;
            int var64 = field1160.method2886();
            int var65 = field1160.method2931();
            int var66 = field1160.method2886();
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                int var67 = var62 * 128 + 64;
                int var68 = var63 * 128 + 64;
                class85 var69 = new class85(var64, Statics.field861, var67, var68, method2656(var67, var68, Statics.field861) - var65, var66, field936);
                field1061.method3299(var69);
            }
        } else {
            if (field974 == 242) {
                int var70 = field1160.method2886();
                int var71 = field1160.method2907();
                int var72 = field1160.method2912();
                int var73 = var72 >> 2;
                int var74 = var72 & 0x3;
                int var75 = field1002[var73];
                int var76 = field1160.method2931();
                int var77 = (var76 >> 4 & 0x7) + Statics.field680;
                int var78 = (var76 & 0x7) + Statics.field926;
                byte var79 = field1160.method2915();
                byte var80 = field1160.method2885();
                byte var81 = field1160.method2914();
                byte var82 = field1160.method2915();
                int var83 = field1160.method2886();
                int var84 = field1160.method2907();
                class75 var85;
                if (field1049 == var83) {
                    var85 = Statics.field844;
                } else {
                    var85 = field1048[var83];
                }
                if (var85 != null) {
                    class259 var86 = class259.method997(var70);
                    int var87;
                    int var88;
                    if (var74 == 1 || var74 == 3) {
                        var87 = var86.field3488;
                        var88 = var86.field3471;
                    } else {
                        var87 = var86.field3471;
                        var88 = var86.field3488;
                    }
                    int var89 = (var87 >> 1) + var77;
                    int var90 = (var87 + 1 >> 1) + var77;
                    int var91 = (var88 >> 1) + var78;
                    int var92 = (var88 + 1 >> 1) + var78;
                    int[][] var93 = class62.field770[Statics.field861];
                    int var94 = var93[var89][var91] + var93[var90][var91] + var93[var89][var92] + var93[var90][var92] >> 2;
                    int var95 = (var77 << 7) + (var87 << 6);
                    int var96 = (var78 << 7) + (var88 << 6);
                    class134 var97 = var86.method4165(var73, var74, var93, var95, var94, var96);
                    if (var97 != null) {
                        method2247(Statics.field861, var77, var78, var75, -1, 0, 0, var84 + 1, var71 + 1);
                        var85.field902 = field936 + var84;
                        var85.field903 = field936 + var71;
                        var85.field901 = var97;
                        var85.field904 = var77 * 128 + var87 * 64;
                        var85.field910 = var78 * 128 + var88 * 64;
                        var85.field905 = var94;
                        if (var79 > var81) {
                            byte var98 = var79;
                            var79 = var81;
                            var81 = var98;
                        }
                        if (var82 > var80) {
                            byte var99 = var82;
                            var82 = var80;
                            var80 = var99;
                        }
                        var85.field908 = var77 + var79;
                        var85.field915 = var77 + var81;
                        var85.field909 = var78 + var82;
                        var85.field911 = var78 + var80;
                    }
                }
            }
            if (field974 == 176) {
                int var100 = field1160.method2907();
                int var101 = field1160.method3071();
                int var102 = (var101 >> 4 & 0x7) + Statics.field680;
                int var103 = (var101 & 0x7) + Statics.field926;
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    class197 var104 = field1058[Statics.field861][var102][var103];
                    if (var104 != null) {
                        for (class95 var105 = (class95) var104.method3304(); var105 != null; var105 = (class95) var104.method3306()) {
                            if ((var100 & 0x7FFF) == var105.field1499) {
                                var105.method3294();
                                break;
                            }
                        }
                        if (var104.method3304() == null) {
                            field1058[Statics.field861][var102][var103] = null;
                        }
                        method672(var102, var103);
                    }
                }
            } else if (field974 == 151) {
                int var106 = field1160.method2931();
                int var107 = (var106 >> 4 & 0x7) + Statics.field680;
                int var108 = (var106 & 0x7) + Statics.field926;
                int var109 = field1160.method2886();
                int var110 = field1160.method2931();
                int var111 = var110 >> 4 & 0xF;
                int var112 = var110 & 0x7;
                int var113 = field1160.method2931();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var114 = var111 + 1;
                    if (Statics.field844.field1255[0] >= var107 - var114 && Statics.field844.field1255[0] <= var107 + var114 && Statics.field844.field1291[0] >= var108 - var114 && Statics.field844.field1291[0] <= var108 + var114 && field1167 != 0 && var112 > 0 && field1029 < 50) {
                        field1169[field1029] = var109;
                        field1170[field1029] = var112;
                        field991[field1029] = var113;
                        field1191[field1029] = null;
                        field1172[field1029] = (var107 << 16) + (var108 << 8) + var111;
                        field1029++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eo.go(IIIIIIIIIB)V")
    public static final void method2247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1059.method3304(); var10 != null; var10 = (class77) field1059.method3306()) {
            if (var10.field1218 == arg0 && var10.field1210 == arg1 && var10.field1211 == arg2 && var10.field1219 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1218 = arg0;
            var9.field1219 = arg3;
            var9.field1210 = arg1;
            var9.field1211 = arg2;
            method671(var9);
            field1059.method3299(var9);
        }
        var9.field1215 = arg4;
        var9.field1221 = arg5;
        var9.field1208 = arg6;
        var9.field1217 = arg7;
        var9.field1209 = arg8;
    }

    @ObfuscatedName("am.gt(I)V")
    public static final void method472() {
        for (class77 var0 = (class77) field1059.method3304(); var0 != null; var0 = (class77) field1059.method3306()) {
            if (var0.field1209 == -1) {
                var0.field1217 = 0;
                method671(var0);
            } else {
                var0.method3294();
            }
        }
    }

    @ObfuscatedName("bn.gh(Lbh;B)V")
    public static final void method671(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1219 == 0) {
            var1 = Statics.field3635.method2450(arg0.field1218, arg0.field1210, arg0.field1211);
        }
        if (arg0.field1219 == 1) {
            var1 = Statics.field3635.method2536(arg0.field1218, arg0.field1210, arg0.field1211);
        }
        if (arg0.field1219 == 2) {
            var1 = Statics.field3635.method2452(arg0.field1218, arg0.field1210, arg0.field1211);
        }
        if (arg0.field1219 == 3) {
            var1 = Statics.field3635.method2453(arg0.field1218, arg0.field1210, arg0.field1211);
        }
        if (var1 != 0) {
            int var5 = Statics.field3635.method2483(arg0.field1218, arg0.field1210, arg0.field1211, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1212 = var2;
        arg0.field1214 = var3;
        arg0.field1213 = var4;
    }

    @ObfuscatedName("aa.gs(IIIIIIIB)V")
    public static final void method655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field998 && Statics.field861 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field3635.method2450(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3635.method2536(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3635.method2452(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3635.method2453(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field3635.method2483(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3635.method2441(arg0, arg2, arg3);
                class259 var15 = class259.method997(var12);
                if (var15.field3465 != 0) {
                    field988[arg0].method2789(arg2, arg3, var13, var14, var15.field3452);
                }
            }
            if (arg1 == 1) {
                Statics.field3635.method2442(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3635.method2443(arg0, arg2, arg3);
                class259 var16 = class259.method997(var12);
                if (var16.field3471 + arg2 > 103 || var16.field3471 + arg3 > 103 || var16.field3488 + arg2 > 103 || var16.field3488 + arg3 > 103) {
                    return;
                }
                if (var16.field3465 != 0) {
                    field988[arg0].method2773(arg2, arg3, var16.field3471, var16.field3488, var14, var16.field3452);
                }
            }
            if (arg1 == 3) {
                Statics.field3635.method2580(arg0, arg2, arg3);
                class259 var17 = class259.method997(var12);
                if (var17.field3465 == 1) {
                    field988[arg0].method2775(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field777[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method235(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field3635, field988[arg0]);
    }

    @ObfuscatedName("bn.gy(III)V")
    public static final void method672(int arg0, int arg1) {
        class197 var2 = field1058[Statics.field861][arg0][arg1];
        if (var2 == null) {
            Statics.field3635.method2445(Statics.field861, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3304(); var6 != null; var6 = (class95) var2.method3306()) {
            class260 var7 = class260.method3915(var6.field1499);
            long var8 = (long) var7.field3526;
            if (var7.field3531 == 1) {
                var8 = (long) (var6.field1500 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3635.method2445(Statics.field861, arg0, arg1);
            return;
        }
        var2.method3300(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3304(); var12 != null; var12 = (class95) var2.method3306()) {
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
        Statics.field3635.method2486(Statics.field861, arg0, arg1, method2656(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field861), var5, var13, var10, var11);
    }

    @ObfuscatedName("bw.gg(ZI)V")
    public static final void method1000(boolean arg0) {
        field1051 = 0;
        field968 = 0;
        method4271();
        method1568(arg0);
        method1867();
        for (int var1 = 0; var1 < field1051; var1++) {
            int var2 = field1052[var1];
            if (field936 != field1166[var2].field1284) {
                field1166[var2].field1387 = null;
                field1166[var2] = null;
            }
        }
        if (field1070 != field1160.field2412) {
            throw new RuntimeException(field1160.field2412 + class89.field1404 + field1070);
        }
        for (int var3 = 0; var3 < field1171; var3++) {
            if (field1166[field967[var3]] == null) {
                throw new RuntimeException(var3 + class89.field1404 + field1171);
            }
        }
    }

    @ObfuscatedName("jx.hj(I)V")
    public static final void method4271() {
        field1160.method3128();
        int var0 = field1160.method3118(8);
        if (var0 < field1171) {
            for (int var1 = var0; var1 < field1171; var1++) {
                field1052[++field1051 - 1] = field967[var1];
            }
        }
        if (var0 > field1171) {
            throw new RuntimeException("");
        }
        field1171 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field967[var2];
            class87 var4 = field1166[var3];
            int var5 = field1160.method3118(1);
            if (var5 == 0) {
                field967[++field1171 - 1] = var3;
                var4.field1284 = field936;
            } else {
                int var6 = field1160.method3118(2);
                if (var6 == 0) {
                    field967[++field1171 - 1] = var3;
                    var4.field1284 = field936;
                    field1168[++field968 - 1] = var3;
                } else if (var6 == 1) {
                    field967[++field1171 - 1] = var3;
                    var4.field1284 = field936;
                    int var7 = field1160.method3118(3);
                    var4.method1533(var7, (byte) 1);
                    int var8 = field1160.method3118(1);
                    if (var8 == 1) {
                        field1168[++field968 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field967[++field1171 - 1] = var3;
                    var4.field1284 = field936;
                    int var9 = field1160.method3118(3);
                    var4.method1533(var9, (byte) 2);
                    int var10 = field1160.method3118(3);
                    var4.method1533(var10, (byte) 2);
                    int var11 = field1160.method3118(1);
                    if (var11 == 1) {
                        field1168[++field968 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1052[++field1051 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("cc.hw(ZB)V")
    public static final void method1568(boolean arg0) {
        while (true) {
            if (field1160.method3120(field1070) >= 27) {
                int var1 = field1160.method3118(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field1166[var1] == null) {
                        field1166[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field1166[var1];
                    field967[++field1171 - 1] = var1;
                    var3.field1284 = field936;
                    var3.field1387 = class262.method1007(field1160.method3118(14));
                    int var4 = field1160.method3118(1);
                    int var5 = field1160.method3118(1);
                    if (var5 == 1) {
                        field1168[++field968 - 1] = var1;
                    }
                    int var6;
                    if (arg0) {
                        var6 = field1160.method3118(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field1160.method3118(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7;
                    if (arg0) {
                        var7 = field1160.method3118(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field1160.method3118(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field971[field1160.method3118(3)];
                    if (var2) {
                        var3.field1286 = var3.field1237 = var8;
                    }
                    var3.field1243 = var3.field1387.field3570;
                    var3.field1248 = var3.field1387.field3571;
                    if (var3.field1248 == 0) {
                        var3.field1237 = 0;
                    }
                    var3.field1268 = var3.field1387.field3576;
                    var3.field1244 = var3.field1387.field3577;
                    var3.field1245 = var3.field1387.field3578;
                    var3.field1288 = var3.field1387.field3579;
                    var3.field1246 = var3.field1387.field3573;
                    var3.field1241 = var3.field1387.field3574;
                    var3.field1235 = var3.field1387.field3600;
                    var3.method1541(Statics.field844.field1255[0] + var7, Statics.field844.field1291[0] + var6, var4 == 1);
                    continue;
                }
            }
            field1160.method3124();
            return;
        }
    }

    @ObfuscatedName("ds.hq(B)V")
    public static final void method1867() {
        for (int var0 = 0; var0 < field968; var0++) {
            int var1 = field1168[var0];
            class87 var2 = field1166[var1];
            int var3 = field1160.method2931();
            if ((var3 & 0x4) != 0) {
                int var4 = field1160.method2957();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field1160.method2931();
                if (var2.field1267 == var4 && var4 != -1) {
                    int var6 = class264.method3098(var4).field3633;
                    if (var6 == 1) {
                        var2.field1279 = 0;
                        var2.field1275 = 0;
                        var2.field1270 = var5;
                        var2.field1238 = 0;
                    }
                    if (var6 == 2) {
                        var2.field1238 = 0;
                    }
                } else if (var4 == -1 || var2.field1267 == -1 || class264.method3098(var4).field3626 >= class264.method3098(var2.field1267).field3626) {
                    var2.field1267 = var4;
                    var2.field1279 = 0;
                    var2.field1275 = 0;
                    var2.field1270 = var5;
                    var2.field1238 = 0;
                    var2.field1294 = var2.field1289;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field1274 = field1160.method2892();
                var2.field1240 = 100;
            }
            if ((var3 & 0x20) != 0) {
                var2.field1387 = class262.method1007(field1160.method2907());
                var2.field1243 = var2.field1387.field3570;
                var2.field1248 = var2.field1387.field3571;
                var2.field1268 = var2.field1387.field3576;
                var2.field1244 = var2.field1387.field3577;
                var2.field1245 = var2.field1387.field3578;
                var2.field1288 = var2.field1387.field3579;
                var2.field1246 = var2.field1387.field3573;
                var2.field1241 = var2.field1387.field3574;
                var2.field1235 = var2.field1387.field3600;
            }
            if ((var3 & 0x8) != 0) {
                int var7 = field1160.method2886();
                int var8 = field1160.method2907();
                int var9 = var2.field1264 - (var7 - Statics.field353 - Statics.field353) * 64;
                int var10 = var2.field1236 - (var8 - Statics.field2461 - Statics.field2461) * 64;
                if (var9 != 0 || var10 != 0) {
                    var2.field1263 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field1292 = field1160.method2882();
                int var11 = field1160.method2928();
                var2.field1276 = var11 >> 16;
                var2.field1257 = (var11 & 0xFFFF) + field936;
                var2.field1273 = 0;
                var2.field1271 = 0;
                if (var2.field1257 > field936) {
                    var2.field1273 = -1;
                }
                if (var2.field1292 == 65535) {
                    var2.field1292 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field1261 = field1160.method2957();
                if (var2.field1261 == 65535) {
                    var2.field1261 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var12 = field1160.method2912();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = field1160.method3003();
                        if (var17 == 32767) {
                            var17 = field1160.method3003();
                            var15 = field1160.method3003();
                            var14 = field1160.method3003();
                            var16 = field1160.method3003();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = field1160.method3003();
                        }
                        int var18 = field1160.method3003();
                        var2.method1394(var17, var15, var14, var16, field936, var18);
                    }
                }
                int var19 = field1160.method2921();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = field1160.method3003();
                        int var22 = field1160.method3003();
                        if (var22 == 32767) {
                            var2.method1393(var21);
                        } else {
                            int var23 = field1160.method3003();
                            int var24 = field1160.method3071();
                            int var25 = var22 > 0 ? field1160.method2931() : var24;
                            var2.method1395(var21, field936, var22, var23, var24, var25);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fb.hx(Lbx;IIBI)V")
    public static final void method2729(class75 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1255[0];
        int var5 = arg0.field1291[0];
        int var6 = arg0.method1016();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class166.method1910(var4, var5, arg0.method1016(), method2345(arg1, arg2), field988[arg0.field896], true, field1100, field993);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method1019(field1100[var8], field993[var8], arg3);
            }
        }
    }

    @ObfuscatedName("eq.hm(III)Lfq;")
    public static class167 method2345(int arg0, int arg1) {
        field1205.field2339 = arg0;
        field1205.field2336 = arg1;
        field1205.field2335 = 1;
        field1205.field2338 = 1;
        return field1205;
    }

    @ObfuscatedName("bz.hh(I)V")
    public static void method1035() {
        field1067 = 0;
        field1033 = -1;
        field1066 = false;
    }

    @ObfuscatedName("im.hr(B)V")
    public static void method4085() {
        method1035();
        field951[0] = class229.field3026;
        field1073[0] = "";
        field1137[0] = 1006;
        field1067 = 1;
    }

    @ObfuscatedName("fx.hp(B)V")
    public static final void method2725() {
        int var0 = Statics.field255;
        int var1 = Statics.field412;
        int var2 = Statics.field1799;
        int var3 = Statics.field10;
        int var4 = 6116423;
        class285.method4623(var0, var1, var2, var3, var4);
        class285.method4623(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class285.method4615(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2558.method4407(class229.field3008, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field750;
        int var6 = class60.field758 * 939681921;
        for (int var7 = 0; var7 < field1067; var7++) {
            int var8 = (field1067 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field2558.method4407(method3696(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field255;
        int var11 = Statics.field412;
        int var12 = Statics.field1799;
        int var13 = Statics.field10;
        for (int var14 = 0; var14 < field1131; var14++) {
            if (field977[var14] + field1138[var14] > var10 && field977[var14] < var10 + var12 && field1139[var14] + field1003[var14] > var11 && field1003[var14] < var11 + var13) {
                field1134[var14] = true;
            }
        }
    }

    @ObfuscatedName("q.ha(IIIIB)V")
    public static final void method70(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1131; var4++) {
            if (field977[var4] + field1138[var4] > arg0 && field977[var4] < arg0 + arg2 && field1139[var4] + field1003[var4] > arg1 && field1003[var4] < arg1 + arg3) {
                field965[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hf(I)V")
    public final void method1333() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field1067 - 1; var2++) {
                if (field1137[var2] < 1000 && field1137[var2 + 1] > 1000) {
                    String var3 = field1073[var2];
                    field1073[var2] = field1073[var2 + 1];
                    field1073[var2 + 1] = var3;
                    String var4 = field951[var2];
                    field951[var2] = field951[var2 + 1];
                    field951[var2 + 1] = var4;
                    int var5 = field1137[var2];
                    field1137[var2] = field1137[var2 + 1];
                    field1137[var2 + 1] = var5;
                    int var6 = field1068[var2];
                    field1068[var2] = field1068[var2 + 1];
                    field1068[var2 + 1] = var6;
                    int var7 = field1069[var2];
                    field1069[var2] = field1069[var2 + 1];
                    field1069[var2 + 1] = var7;
                    int var8 = field1071[var2];
                    field1071[var2] = field1071[var2 + 1];
                    field1071[var2 + 1] = var8;
                    if (field1033 != -1) {
                        if (field1033 == var2) {
                            field1033 = var2 + 1;
                        } else if (field1033 == var2 + 1) {
                            field1033 = var2;
                        }
                    }
                    var1 = false;
                }
            }
        }
        if (Statics.field387 != null || field1042 != null) {
            return;
        }
        int var9 = class60.field744;
        if (field1066) {
            if (var9 != 1 && (Statics.field684 || var9 != 4)) {
                int var10 = class60.field750;
                int var11 = class60.field758 * 939681921;
                if (var10 < Statics.field255 - 10 || var10 > Statics.field255 + Statics.field1799 + 10 || var11 < Statics.field412 - 10 || var11 > Statics.field412 + Statics.field10 + 10) {
                    field1066 = false;
                    method70(Statics.field255, Statics.field412, Statics.field1799, Statics.field10);
                }
            }
            if (var9 == 1 || !Statics.field684 && var9 == 4) {
                int var12 = Statics.field255;
                int var13 = Statics.field412;
                int var14 = Statics.field1799;
                int var15 = class60.field756;
                int var16 = class60.field755;
                int var17 = -1;
                for (int var18 = 0; var18 < field1067; var18++) {
                    int var19 = (field1067 - 1 - var18) * 15 + var13 + 31;
                    if (var15 > var12 && var15 < var12 + var14 && var16 > var19 - 13 && var16 < var19 + 3) {
                        var17 = var18;
                    }
                }
                if (var17 != -1 && var17 >= 0) {
                    int var20 = field1068[var17];
                    int var21 = field1069[var17];
                    int var22 = field1137[var17];
                    int var23 = field1071[var17];
                    String var24 = field951[var17];
                    String var25 = field1073[var17];
                    method2622(var20, var21, var22, var23, var24, var25, class60.field756, class60.field755);
                }
                field1066 = false;
                method70(Statics.field255, Statics.field412, Statics.field1799, Statics.field10);
            }
            return;
        }
        int var26 = method3097();
        if ((var9 == 1 || !Statics.field684 && var9 == 4) && var26 >= 0) {
            int var27 = field1137[var26];
            if (var27 == 39 || var27 == 40 || var27 == 41 || var27 == 42 || var27 == 43 || var27 == 33 || var27 == 34 || var27 == 35 || var27 == 36 || var27 == 37 || var27 == 38 || var27 == 1005) {
                label288: {
                    int var28 = field1068[var26];
                    int var29 = field1069[var26];
                    class220 var30 = class220.method1162(var29);
                    int var31 = method967(var30);
                    boolean var32 = (var31 >> 28 & 0x1) != 0;
                    if (!var32) {
                        int var33 = method967(var30);
                        boolean var34 = (var33 >> 29 & 0x1) != 0;
                        if (!var34) {
                            break label288;
                        }
                    }
                    if (Statics.field387 != null && !field1045) {
                        int var35 = method3097();
                        if (field1065 != 1) {
                            boolean var36;
                            if (var35 < 0) {
                                var36 = false;
                            } else {
                                int var37 = field1137[var35];
                                if (var37 >= 2000) {
                                    var37 -= 2000;
                                }
                                if (var37 == 1007) {
                                    var36 = true;
                                } else {
                                    var36 = false;
                                }
                            }
                            if (!var36 && field1067 > 0) {
                                int var38 = field1136;
                                int var39 = field1043;
                                class90 var40 = Statics.field700;
                                method2622(var40.field1414, var40.field1411, var40.field1410, var40.field1413, var40.field1412, var40.field1412, var38, var39);
                                Statics.field700 = null;
                            }
                        }
                    }
                    field1045 = false;
                    field1046 = 0;
                    if (Statics.field387 != null) {
                        method667(Statics.field387);
                    }
                    Statics.field387 = class220.method1162(var29);
                    field1041 = var28;
                    field1136 = class60.field756;
                    field1043 = class60.field755;
                    if (var26 >= 0) {
                        method160(var26);
                    }
                    method667(Statics.field387);
                    return;
                }
            }
        }
        if (var9 == 1 || !Statics.field684 && var9 == 4) {
            label290: {
                label273: {
                    if (field1065 == 1 && field1067 > 2) {
                        boolean var41;
                        if (field1067 <= 0) {
                            var41 = false;
                        } else if (field1076 && class51.field661[81] && field1033 != -1) {
                            var41 = true;
                        } else {
                            var41 = false;
                        }
                        if (!var41) {
                            break label273;
                        }
                    }
                    boolean var42;
                    if (var26 < 0) {
                        var42 = false;
                    } else {
                        int var43 = field1137[var26];
                        if (var43 >= 2000) {
                            var43 -= 2000;
                        }
                        if (var43 == 1007) {
                            var42 = true;
                        } else {
                            var42 = false;
                        }
                    }
                    if (!var42) {
                        break label290;
                    }
                }
                var9 = 2;
            }
        }
        if ((var9 == 1 || !Statics.field684 && var9 == 4) && field1067 > 0 && var26 >= 0) {
            int var44 = field1068[var26];
            int var45 = field1069[var26];
            int var46 = field1137[var26];
            int var47 = field1071[var26];
            String var48 = field951[var26];
            String var49 = field1073[var26];
            method2622(var44, var45, var46, var47, var48, var49, class60.field756, class60.field755);
        }
        if (var9 == 2 && field1067 > 0) {
            this.method1062(class60.field756, class60.field755);
        }
    }

    @ObfuscatedName("client.hz(III)V")
    public final void method1062(int arg0, int arg1) {
        int var3 = Statics.field2558.method4402(class229.field3008);
        for (int var4 = 0; var4 < field1067; var4++) {
            int var5 = Statics.field2558.method4402(method3696(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field1067 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field2287) {
            var7 = Statics.field2287 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field726) {
            var8 = Statics.field726 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field3635.method2461(Statics.field861, arg0, arg1, false);
        field1066 = true;
        Statics.field255 = var7;
        Statics.field412 = var8;
        Statics.field1799 = var3;
        Statics.field10 = field1067 * 15 + 22;
    }

    @ObfuscatedName("ek.hu(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2622(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 38) {
            method548();
            class220 var8 = class220.method1162(arg1);
            field1081 = 1;
            Statics.field32 = arg0;
            Statics.field2633 = arg1;
            Statics.field420 = arg3;
            method667(var8);
            field1082 = class89.method2636(16748608) + class260.method3915(arg3).field3501 + class89.method2636(16777215);
            if (field1082 == null) {
                field1082 = "null";
            }
            return;
        }
        if (arg2 == 41) {
            field970.method3115(187);
            field970.method2917(arg3);
            field970.method2926(arg1);
            field970.method2903(arg0);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 58) {
            class220 var9 = class220.method2344(arg1, arg0);
            if (var9 != null) {
                field970.method3115(2);
                field970.method2917(arg0);
                field970.method2916(var9.field2710);
                field970.method2959(field1085);
                field970.method2872(Statics.field1782);
                field970.method2982(arg1);
                field970.method2959(field1084);
            }
        }
        if (arg2 == 1002) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field970.method3115(160);
            field970.method2917(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 42) {
            field970.method3115(30);
            field970.method2916(arg0);
            field970.method2917(arg3);
            field970.method2872(arg1);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 11) {
            class87 var10 = field1166[arg3];
            if (var10 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(179);
                field970.method2959(arg3);
                field970.method2910(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class87 var11 = field1166[arg3];
            if (var11 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(167);
                field970.method2910(class51.field661[82] ? 1 : 0);
                field970.method2916(arg3);
            }
        }
        if (arg2 == 7) {
            class87 var12 = field1166[arg3];
            if (var12 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(53);
                field970.method3075(class51.field661[82] ? 1 : 0);
                field970.method2959(Statics.field32);
                field970.method2926(Statics.field2633);
                field970.method2959(Statics.field420);
                field970.method2917(arg3);
            }
        }
        if (arg2 == 1003) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            class87 var13 = field1166[arg3];
            if (var13 != null) {
                class262 var14 = var13.field1387;
                if (var14.field3588 != null) {
                    var14 = var14.method4281();
                }
                if (var14 != null) {
                    field970.method3115(85);
                    field970.method2903(var14.field3568);
                }
            }
        }
        if (arg2 == 30 && field1011 == null) {
            method2626(arg1, arg0);
            field1011 = class220.method2344(arg1, arg0);
            method667(field1011);
        }
        if (arg2 == 10) {
            class87 var15 = field1166[arg3];
            if (var15 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(60);
                field970.method2933(class51.field661[82] ? 1 : 0);
                field970.method2917(arg3);
            }
        }
        if (arg2 == 19) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(188);
            field970.method2908(class51.field661[82] ? 1 : 0);
            field970.method2917(arg3);
            field970.method2959(Statics.field2461 + arg1);
            field970.method2959(Statics.field353 + arg0);
        }
        if (arg2 == 23) {
            if (field1066) {
                Statics.field3635.method2513();
            } else {
                Statics.field3635.method2461(Statics.field861, arg0, arg1, true);
            }
        }
        if (arg2 == 1004) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field970.method3115(116);
            field970.method2917(arg3);
        }
        if (arg2 == 48) {
            class75 var16 = field1048[arg3];
            if (var16 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(19);
                field970.method2959(arg3);
                field970.method2910(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class75 var17 = field1048[arg3];
            if (var17 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(43);
                field970.method3075(class51.field661[82] ? 1 : 0);
                field970.method2916(arg3);
                field970.method2903(field1084);
                field970.method2926(Statics.field1782);
            }
        }
        if (arg2 == 3) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(213);
            field970.method2959(Statics.field353 + arg0);
            field970.method2910(class51.field661[82] ? 1 : 0);
            field970.method2917(Statics.field2461 + arg1);
            field970.method2917(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 39) {
            field970.method3115(156);
            field970.method2959(arg3);
            field970.method2982(arg1);
            field970.method2916(arg0);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 24) {
            class220 var18 = class220.method1162(arg1);
            boolean var19 = true;
            if (var18.field2661 > 0) {
                var19 = method18(var18);
            }
            if (var19) {
                field970.method3115(22);
                field970.method2872(arg1);
            }
        }
        if (arg2 == 45) {
            class75 var20 = field1048[arg3];
            if (var20 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(118);
                field970.method2916(arg3);
                field970.method2908(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class75 var21 = field1048[arg3];
            if (var21 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(47);
                field970.method2933(class51.field661[82] ? 1 : 0);
                field970.method2917(arg3);
            }
        }
        if (arg2 == 18) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(250);
            field970.method2916(arg3);
            field970.method2908(class51.field661[82] ? 1 : 0);
            field970.method2917(Statics.field2461 + arg1);
            field970.method2903(Statics.field353 + arg0);
        }
        if (arg2 == 14) {
            class75 var22 = field1048[arg3];
            if (var22 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(150);
                field970.method2959(Statics.field420);
                field970.method2933(class51.field661[82] ? 1 : 0);
                field970.method2959(arg3);
                field970.method2872(Statics.field2633);
                field970.method2917(Statics.field32);
            }
        }
        if (arg2 == 25) {
            class220 var23 = class220.method2344(arg1, arg0);
            if (var23 != null) {
                method548();
                int var24 = method967(var23);
                int var25 = var24 >> 11 & 0x3F;
                int var27 = var23.field2710;
                class220 var28 = class220.method2344(arg1, arg0);
                if (var28 != null && var28.field2748 != null) {
                    class70 var29 = new class70();
                    var29.field851 = var28;
                    var29.field854 = var28.field2748;
                    class84.method2625(var29);
                }
                field1085 = var27;
                field1083 = true;
                Statics.field1782 = arg1;
                field1084 = arg0;
                Statics.field40 = var25;
                method667(var28);
                field1081 = 0;
                field1086 = method148(var23);
                if (field1086 == null) {
                    field1086 = "Null";
                }
                if (var23.field2656) {
                    field1087 = var23.field2730 + class89.method2636(16777215);
                } else {
                    field1087 = class89.method2636(65280) + var23.field2752 + class89.method2636(16777215);
                }
            }
            return;
        }
        if (arg2 == 34) {
            field970.method3115(220);
            field970.method2982(arg1);
            field970.method2916(arg0);
            field970.method2959(arg3);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 40) {
            field970.method3115(237);
            field970.method2959(arg3);
            field970.method2926(arg1);
            field970.method2917(arg0);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 2) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(144);
            field970.method2917(arg3 >> 14 & 0x7FFF);
            field970.method2903(Statics.field353 + arg0);
            field970.method2872(Statics.field1782);
            field970.method2917(field1084);
            field970.method2910(class51.field661[82] ? 1 : 0);
            field970.method2959(Statics.field2461 + arg1);
        }
        if (arg2 == 17) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(93);
            field970.method2917(Statics.field353 + arg0);
            field970.method3075(class51.field661[82] ? 1 : 0);
            field970.method2917(Statics.field2461 + arg1);
            field970.method2916(field1084);
            field970.method2916(arg3);
            field970.method2926(Statics.field1782);
        }
        if (arg2 == 21) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(253);
            field970.method2916(Statics.field2461 + arg1);
            field970.method2959(Statics.field353 + arg0);
            field970.method2908(class51.field661[82] ? 1 : 0);
            field970.method2959(arg3);
        }
        if (arg2 == 4) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(31);
            field970.method2917(Statics.field353 + arg0);
            field970.method2910(class51.field661[82] ? 1 : 0);
            field970.method2903(Statics.field2461 + arg1);
            field970.method2903(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 46) {
            class75 var30 = field1048[arg3];
            if (var30 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(228);
                field970.method2916(arg3);
                field970.method2908(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class87 var31 = field1166[arg3];
            if (var31 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(55);
                field970.method2908(class51.field661[82] ? 1 : 0);
                field970.method2927(Statics.field1782);
                field970.method2916(field1084);
                field970.method2903(arg3);
            }
        }
        if (arg2 == 9) {
            class87 var32 = field1166[arg3];
            if (var32 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(8);
                field970.method2959(arg3);
                field970.method2908(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field970.method3115(158);
            field970.method2959(arg0);
            field970.method2916(arg3);
            field970.method2982(arg1);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 28) {
            field970.method3115(22);
            field970.method2872(arg1);
            class220 var33 = class220.method1162(arg1);
            if (var33.field2769 != null && var33.field2769[0][0] == 5) {
                int var34 = var33.field2769[0][1];
                class215.field2616[var34] = 1 - class215.field2616[var34];
                method171(var34);
            }
        }
        if (arg2 == 22) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(82);
            field970.method2933(class51.field661[82] ? 1 : 0);
            field970.method2959(Statics.field2461 + arg1);
            field970.method2959(Statics.field353 + arg0);
            field970.method2916(arg3);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2364.method4891(arg2, arg3, new class216(arg0), new class216(arg1));
        }
        if (arg2 == 29) {
            field970.method3115(22);
            field970.method2872(arg1);
            class220 var35 = class220.method1162(arg1);
            if (var35.field2769 != null && var35.field2769[0][0] == 5) {
                int var36 = var35.field2769[0][1];
                if (class215.field2616[var36] != var35.field2652[0]) {
                    class215.field2616[var36] = var35.field2652[0];
                    method171(var36);
                }
            }
        }
        if (arg2 == 5) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(86);
            field970.method2916(Statics.field353 + arg0);
            field970.method2903(arg3 >> 14 & 0x7FFF);
            field970.method3075(class51.field661[82] ? 1 : 0);
            field970.method2917(Statics.field2461 + arg1);
        }
        if (arg2 == 49) {
            class75 var37 = field1048[arg3];
            if (var37 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(88);
                field970.method2917(arg3);
                field970.method2908(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(140);
            field970.method2917(Statics.field353 + arg0);
            field970.method3075(class51.field661[82] ? 1 : 0);
            field970.method2903(arg3 >> 14 & 0x7FFF);
            field970.method2917(Statics.field2461 + arg1);
        }
        if (arg2 == 36) {
            field970.method3115(163);
            field970.method2926(arg1);
            field970.method2917(arg3);
            field970.method2917(arg0);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 1005) {
            class220 var38 = class220.method1162(arg1);
            if (var38 == null || var38.field2776[arg0] < 100000) {
                field970.method3115(116);
                field970.method2917(arg3);
            } else {
                class99.method1676(27, "", var38.field2776[arg0] + " x " + class260.method3915(arg3).field3501);
            }
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class220 var39 = class220.method2344(arg1, arg0);
            if (var39 != null) {
                int var40 = var39.field2710;
                class220 var41 = class220.method2344(arg1, arg0);
                if (var41 != null) {
                    if (var41.field2757 != null) {
                        class70 var42 = new class70();
                        var42.field851 = var41;
                        var42.field865 = arg3;
                        var42.field855 = arg5;
                        var42.field854 = var41.field2757;
                        class84.method2625(var42);
                    }
                    boolean var43 = true;
                    if (var41.field2661 > 0) {
                        var43 = method18(var41);
                    }
                    if (var43) {
                        int var44 = method967(var41);
                        int var45 = arg3 - 1;
                        boolean var46 = (var44 >> var45 + 1 & 0x1) != 0;
                        if (var46) {
                            if (arg3 == 1) {
                                field970.method3115(244);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                            if (arg3 == 2) {
                                field970.method3115(94);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                            if (arg3 == 3) {
                                field970.method3115(117);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                            if (arg3 == 4) {
                                field970.method3115(202);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                            if (arg3 == 5) {
                                field970.method3115(162);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                            if (arg3 == 6) {
                                field970.method3115(48);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                            if (arg3 == 7) {
                                field970.method3115(102);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                            if (arg3 == 8) {
                                field970.method3115(149);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                            if (arg3 == 9) {
                                field970.method3115(194);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                            if (arg3 == 10) {
                                field970.method3115(79);
                                field970.method2872(arg1);
                                field970.method2903(arg0);
                                field970.method2903(var40);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 35) {
            field970.method3115(247);
            field970.method2982(arg1);
            field970.method2959(arg3);
            field970.method2916(arg0);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 20) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(169);
            field970.method2916(Statics.field2461 + arg1);
            field970.method2916(Statics.field353 + arg0);
            field970.method2916(arg3);
            field970.method2908(class51.field661[82] ? 1 : 0);
        }
        if (arg2 == 44) {
            class75 var47 = field1048[arg3];
            if (var47 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(49);
                field970.method2916(arg3);
                field970.method3075(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 12) {
            class87 var48 = field1166[arg3];
            if (var48 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(57);
                field970.method2959(arg3);
                field970.method2933(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(84);
            field970.method2903(arg3 >> 14 & 0x7FFF);
            field970.method2959(Statics.field353 + arg0);
            field970.method2959(Statics.field2461 + arg1);
            field970.method2910(class51.field661[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field970.method3115(114);
            field970.method2872(arg1);
            field970.method2903(arg3);
            field970.method2917(arg0);
            field970.method2926(Statics.field1782);
            field970.method2916(field1084);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 16) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(222);
            field970.method2959(Statics.field353 + arg0);
            field970.method2910(class51.field661[82] ? 1 : 0);
            field970.method2959(Statics.field32);
            field970.method2916(arg3);
            field970.method2903(Statics.field420);
            field970.method2959(Statics.field2461 + arg1);
            field970.method2982(Statics.field2633);
        }
        if (arg2 == 26) {
            method476();
        }
        if (arg2 == 1) {
            field1098 = arg6;
            field1164 = arg7;
            field1038 = 2;
            field1037 = 0;
            field1019 = arg0;
            field1188 = arg1;
            field970.method3115(111);
            field970.method2933(class51.field661[82] ? 1 : 0);
            field970.method2903(Statics.field2461 + arg1);
            field970.method2959(arg3 >> 14 & 0x7FFF);
            field970.method2872(Statics.field2633);
            field970.method2916(Statics.field353 + arg0);
            field970.method2916(Statics.field420);
            field970.method2917(Statics.field32);
        }
        if (arg2 == 31) {
            field970.method3115(172);
            field970.method2959(Statics.field32);
            field970.method2916(arg3);
            field970.method2982(Statics.field2633);
            field970.method2916(Statics.field420);
            field970.method2959(arg0);
            field970.method2982(arg1);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 37) {
            field970.method3115(229);
            field970.method2916(arg3);
            field970.method2926(arg1);
            field970.method2959(arg0);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (arg2 == 47) {
            class75 var49 = field1048[arg3];
            if (var49 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(186);
                field970.method2933(class51.field661[82] ? 1 : 0);
                field970.method2917(arg3);
            }
        }
        if (arg2 == 50) {
            class75 var50 = field1048[arg3];
            if (var50 != null) {
                field1098 = arg6;
                field1164 = arg7;
                field1038 = 2;
                field1037 = 0;
                field1019 = arg0;
                field1188 = arg1;
                field970.method3115(255);
                field970.method2959(arg3);
                field970.method2933(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field970.method3115(61);
            field970.method2959(arg3);
            field970.method2926(arg1);
            field970.method2959(arg0);
            field1039 = 0;
            Statics.field3200 = class220.method1162(arg1);
            field1040 = arg0;
        }
        if (field1081 != 0) {
            field1081 = 0;
            method667(class220.method1162(Statics.field2633));
        }
        if (field1083) {
            method548();
        }
        if (Statics.field3200 != null && field1039 == 0) {
            method667(Statics.field3200);
        }
    }

    @ObfuscatedName("ii.he(ILjava/lang/String;B)V")
    public static void method3722(int arg0, String arg1) {
        int var2 = class97.field1510;
        int[] var3 = class97.field1511;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class75 var6 = field1048[var3[var5]];
            if (var6 != null && Statics.field844 != var6 && var6.field907 != null && var6.field907.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field970.method3115(49);
                    field970.method2916(var3[var5]);
                    field970.method3075(0);
                } else if (arg0 == 4) {
                    field970.method3115(186);
                    field970.method2933(0);
                    field970.method2917(var3[var5]);
                } else if (arg0 == 6) {
                    field970.method3115(88);
                    field970.method2917(var3[var5]);
                    field970.method2908(0);
                } else if (arg0 == 7) {
                    field970.method3115(255);
                    field970.method2959(var3[var5]);
                    field970.method2933(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method1676(4, "", class229.field2871 + arg1);
        }
    }

    @ObfuscatedName("ax.hi(I)V")
    public static void method548() {
        if (!field1083) {
            return;
        }
        class220 var0 = class220.method2344(Statics.field1782, field1084);
        if (var0 != null && var0.field2749 != null) {
            class70 var1 = new class70();
            var1.field851 = var0;
            var1.field854 = var0.field2749;
            class84.method2625(var1);
        }
        field1083 = false;
        method667(var0);
    }

    @ObfuscatedName("ei.hk(III)V")
    public static void method2626(int arg0, int arg1) {
        field970.method3115(4);
        field970.method2959(arg1);
        field970.method2926(arg0);
    }

    @ObfuscatedName("bx.hc(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1029(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method124(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("z.hy(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method124(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1066 || field1067 >= 500) {
            return;
        }
        field951[field1067] = arg0;
        field1073[field1067] = arg1;
        field1137[field1067] = arg2;
        field1071[field1067] = arg3;
        field1068[field1067] = arg4;
        field1069[field1067] = arg5;
        if (arg6) {
            field1033 = field1067;
        }
        field1067++;
    }

    @ObfuscatedName("fe.ho(I)I")
    public static final int method3097() {
        if (field1067 <= 0) {
            return -1;
        } else if (field1076 && class51.field661[81] && field1033 != -1) {
            return field1033;
        } else {
            return field1067 - 1;
        }
    }

    @ObfuscatedName("e.hl(I)V")
    public static void method131() {
        for (int var0 = 0; var0 < field1067; var0++) {
            if (method88(field1137[var0])) {
                if (var0 < field1067 - 1) {
                    for (int var1 = var0; var1 < field1067 - 1; var1++) {
                        field951[var1] = field951[var1 + 1];
                        field1073[var1] = field1073[var1 + 1];
                        field1137[var1] = field1137[var1 + 1];
                        field1071[var1] = field1071[var1 + 1];
                        field1068[var1] = field1068[var1 + 1];
                        field1069[var1] = field1069[var1 + 1];
                    }
                }
                field1067--;
            }
        }
    }

    @ObfuscatedName("c.hv(IB)Z")
    public static boolean method88(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("hc.hd(IB)Ljava/lang/String;")
    public static String method3696(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field1073[arg0].length() > 0) {
            return field951[arg0] + class229.field3015 + field1073[arg0];
        } else {
            return field951[arg0];
        }
    }

    @ObfuscatedName("cl.hb(Ljk;IIIB)V")
    public static final void method1454(class262 arg0, int arg1, int arg2, int arg3) {
        if (field1067 >= 400) {
            return;
        }
        if (arg0.field3588 != null) {
            arg0 = arg0.method4281();
        }
        if (arg0 == null || !arg0.field3597 || arg0.field3589 && field1096 != arg1) {
            return;
        }
        String var4 = arg0.field3594;
        if (arg0.field3569 != 0) {
            int var6 = arg0.field3569;
            int var7 = Statics.field844.field898;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class89.method2636(16711680);
            } else if (var8 < -6) {
                var9 = class89.method2636(16723968);
            } else if (var8 < -3) {
                var9 = class89.method2636(16740352);
            } else if (var8 < 0) {
                var9 = class89.method2636(16756736);
            } else if (var8 > 9) {
                var9 = class89.method2636(65280);
            } else if (var8 > 6) {
                var9 = class89.method2636(4259584);
            } else if (var8 > 3) {
                var9 = class89.method2636(8453888);
            } else if (var8 > 0) {
                var9 = class89.method2636(12648192);
            } else {
                var9 = class89.method2636(16776960);
            }
            var4 = var4 + var9 + " " + class89.field1402 + class229.field3063 + arg0.field3569 + class89.field1403;
        }
        if (arg0.field3589 && field1028) {
            method1029(class229.field3006, class89.method2636(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1081 == 1) {
            method1029(class229.field3079, field1082 + " " + class89.field1407 + " " + class89.method2636(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1083) {
            int var10 = arg0.field3589 && field1028 ? 2000 : 0;
            String[] var11 = arg0.field3584;
            if (field1099) {
                var11 = method970(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class229.field3007)) {
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
                        method1029(var11[var12], class89.method2636(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class229.field3007)) {
                        short var15 = 0;
                        if (field1053 != class92.field1424) {
                            if (field1053 == class92.field1425 || field1053 == class92.field1433 && arg0.field3569 > Statics.field844.field898) {
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
                            method1029(var11[var14], class89.method2636(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3589 || !field1028) {
                method1029(class229.field3006, class89.method2636(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field40 & 0x2) == 2) {
            method1029(field1086, field1087 + " " + class89.field1407 + " " + class89.method2636(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ct.hs(Lbx;IIII)V")
    public static final void method1563(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field844 == arg0 || field1067 >= 400) {
            return;
        }
        String var9;
        if (arg0.field912 == 0) {
            String var4 = arg0.field899[0] + arg0.field907 + arg0.field899[1];
            int var5 = arg0.field898;
            int var6 = Statics.field844.field898;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class89.method2636(16711680);
            } else if (var7 < -6) {
                var8 = class89.method2636(16723968);
            } else if (var7 < -3) {
                var8 = class89.method2636(16740352);
            } else if (var7 < 0) {
                var8 = class89.method2636(16756736);
            } else if (var7 > 9) {
                var8 = class89.method2636(65280);
            } else if (var7 > 6) {
                var8 = class89.method2636(4259584);
            } else if (var7 > 3) {
                var8 = class89.method2636(8453888);
            } else if (var7 > 0) {
                var8 = class89.method2636(12648192);
            } else {
                var8 = class89.method2636(16776960);
            }
            var9 = var4 + var8 + " " + class89.field1402 + class229.field3063 + arg0.field898 + class89.field1403 + arg0.field899[2];
        } else {
            var9 = arg0.field899[0] + arg0.field907 + arg0.field899[1] + " " + class89.field1402 + class229.field2950 + arg0.field912 + class89.field1403 + arg0.field899[2];
        }
        if (field1081 == 1) {
            method1029(class229.field3079, field1082 + " " + class89.field1407 + " " + class89.method2636(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1083) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field969[var10] != null) {
                    short var11 = 0;
                    if (field969[var10].equalsIgnoreCase(class229.field3007)) {
                        if (field952 == class92.field1424) {
                            continue;
                        }
                        if (field952 == class92.field1425 || field952 == class92.field1433 && arg0.field898 > Statics.field844.field898) {
                            var11 = 2000;
                        }
                        if (Statics.field844.field913 != 0 && arg0.field913 != 0) {
                            if (Statics.field844.field913 == arg0.field913) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1055[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1062[var10] + var11;
                    method1029(field969[var10], class89.method2636(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field40 & 0x8) == 8) {
            method1029(field1086, field1087 + " " + class89.field1407 + " " + class89.method2636(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1067; var14++) {
            if (field1137[var14] == 23) {
                field1073[var14] = class89.method2636(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("fq.hn(IIIIIIIIB)V")
    public static final void method2810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class220.method2857(arg0)) {
            Statics.field2333 = null;
            method207(Statics.field780[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2333 != null) {
                method207(Statics.field2333, -1412584499, arg1, arg2, arg3, arg4, Statics.field3355, Statics.field408, arg7);
                Statics.field2333 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field965[var8] = true;
            }
        } else {
            field965[arg7] = true;
        }
    }

    @ObfuscatedName("ac.hg([Lhu;IIIIIIIII)V")
    public static final void method207(class220[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class285.method4574(arg2, arg3, arg4, arg5);
        class137.method2349();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class220 var10 = arg0[var9];
            if (var10 != null && (var10.field2676 == arg1 || arg1 == -1412584499 && field1042 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field977[field1131] = var10.field2670 + arg6;
                    field1003[field1131] = var10.field2728 + arg7;
                    field1138[field1131] = var10.field2672;
                    field1139[field1131] = var10.field2673;
                    var11 = ++field1131 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2677 = var11;
                var10.field2708 = field936;
                if (!var10.field2656 || !method3092(var10)) {
                    if (var10.field2661 > 0) {
                        method490(var10);
                    }
                    int var12 = var10.field2670 + arg6;
                    int var13 = var10.field2728 + arg7;
                    int var14 = var10.field2688;
                    if (field1042 == var10) {
                        if (arg1 != -1412584499 && !var10.field2735) {
                            Statics.field2333 = arg0;
                            Statics.field3355 = arg6;
                            Statics.field408 = arg7;
                            continue;
                        }
                        if (field1112 && field1030) {
                            int var15 = class60.field750;
                            int var16 = class60.field758 * 939681921;
                            int var17 = var15 - field1103;
                            int var18 = var16 - field972;
                            if (var17 < field1107) {
                                var17 = field1107;
                            }
                            if (var10.field2672 + var17 > field1107 + field1102.field2672) {
                                var17 = field1107 + field1102.field2672 - var10.field2672;
                            }
                            if (var18 < field1108) {
                                var18 = field1108;
                            }
                            if (var10.field2673 + var18 > field1108 + field1102.field2673) {
                                var18 = field1108 + field1102.field2673 - var10.field2673;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2735) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2651 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2651 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2672 + var12;
                        int var26 = var10.field2673 + var13;
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
                        int var29 = var10.field2672 + var12;
                        int var30 = var10.field2673 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2656 || var19 < var21 && var20 < var22) {
                        if (var10.field2661 != 0) {
                            if (var10.field2661 == 1336) {
                                if (field942) {
                                    var13 += 15;
                                    Statics.field3213.method4441("Fps:" + field718, var10.field2672 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field998) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field998) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3213.method4441("Mem:" + var32 + "k", var10.field2672 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2661 == 1337) {
                                field1077 = var12;
                                field1078 = var13;
                                method807(var12, var13, var10.field2672, var10.field2673);
                                field965[var10.field2677] = true;
                                class285.method4574(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2661 == 1338) {
                                method26();
                                class214 var34 = var10.method3659(false);
                                if (var34 != null) {
                                    class285.method4574(var12, var13, var34.field2610 + var12, var34.field2611 + var13);
                                    if (field1162 == 2 || field1162 == 5) {
                                        class285.method4596(var12, var13, 0, var34.field2613, var34.field2612);
                                    } else {
                                        int var35 = field999 + field1012 & 0x7FF;
                                        int var36 = Statics.field844.field1264 / 32 + 48;
                                        int var37 = 464 - Statics.field844.field1236 / 32;
                                        Statics.field870.method4710(var12, var13, var34.field2610, var34.field2611, var36, var37, var35, field1001 + 256, var34.field2613, var34.field2612);
                                        for (int var38 = 0; var38 < field1156; var38++) {
                                            int var39 = field1157[var38] * 4 + 2 - Statics.field844.field1264 / 32;
                                            int var40 = field1036[var38] * 4 + 2 - Statics.field844.field1236 / 32;
                                            method1383(var12, var13, var39, var40, field1159[var38], var34);
                                        }
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= 104) {
                                                for (int var46 = 0; var46 < field1171; var46++) {
                                                    class87 var47 = field1166[field967[var46]];
                                                    if (var47 != null && var47.method1020()) {
                                                        class262 var48 = var47.field1387;
                                                        if (var48 != null && var48.field3588 != null) {
                                                            var48 = var48.method4281();
                                                        }
                                                        if (var48 != null && var48.field3585 && var48.field3597) {
                                                            int var49 = var47.field1264 / 32 - Statics.field844.field1264 / 32;
                                                            int var50 = var47.field1236 / 32 - Statics.field844.field1236 / 32;
                                                            method1383(var12, var13, var49, var50, Statics.field454[1], var34);
                                                        }
                                                    }
                                                }
                                                int var51 = class97.field1510;
                                                int[] var52 = class97.field1511;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    class75 var54 = field1048[var52[var53]];
                                                    if (var54 != null && var54.method1020() && !var54.field914 && Statics.field844 != var54) {
                                                        int var55 = var54.field1264 / 32 - Statics.field844.field1264 / 32;
                                                        int var56 = var54.field1236 / 32 - Statics.field844.field1236 / 32;
                                                        boolean var57 = false;
                                                        if (method208(var54.field907, true)) {
                                                            var57 = true;
                                                        }
                                                        boolean var58 = false;
                                                        for (int var59 = 0; var59 < Statics.field379; var59++) {
                                                            if (var54.field907.equals(Statics.field354[var59].field924)) {
                                                                var58 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var60 = false;
                                                        if (Statics.field844.field913 != 0 && var54.field913 != 0 && Statics.field844.field913 == var54.field913) {
                                                            var60 = true;
                                                        }
                                                        if (var57) {
                                                            method1383(var12, var13, var55, var56, Statics.field454[3], var34);
                                                        } else if (var60) {
                                                            method1383(var12, var13, var55, var56, Statics.field454[4], var34);
                                                        } else if (var58) {
                                                            method1383(var12, var13, var55, var56, Statics.field454[5], var34);
                                                        } else {
                                                            method1383(var12, var13, var55, var56, Statics.field454[2], var34);
                                                        }
                                                    }
                                                }
                                                if (field944 != 0 && field936 % 20 < 10) {
                                                    if (field944 == 1 && field945 >= 0 && field945 < field1166.length) {
                                                        class87 var61 = field1166[field945];
                                                        if (var61 != null) {
                                                            int var62 = var61.field1264 / 32 - Statics.field844.field1264 / 32;
                                                            int var63 = var61.field1236 / 32 - Statics.field844.field1236 / 32;
                                                            method4509(var12, var13, var62, var63, Statics.field291[1], var34);
                                                        }
                                                    }
                                                    if (field944 == 2) {
                                                        int var64 = field947 * 4 - Statics.field353 * 4 + 2 - Statics.field844.field1264 / 32;
                                                        int var65 = field948 * 4 - Statics.field2461 * 4 + 2 - Statics.field844.field1236 / 32;
                                                        method4509(var12, var13, var64, var65, Statics.field291[1], var34);
                                                    }
                                                    if (field944 == 10 && field946 >= 0 && field946 < field1048.length) {
                                                        class75 var66 = field1048[field946];
                                                        if (var66 != null) {
                                                            int var67 = var66.field1264 / 32 - Statics.field844.field1264 / 32;
                                                            int var68 = var66.field1236 / 32 - Statics.field844.field1236 / 32;
                                                            method4509(var12, var13, var67, var68, Statics.field291[1], var34);
                                                        }
                                                    }
                                                }
                                                if (field1019 != 0) {
                                                    int var69 = field1019 * 4 + 2 - Statics.field844.field1264 / 32;
                                                    int var70 = field1188 * 4 + 2 - Statics.field844.field1236 / 32;
                                                    method1383(var12, var13, var69, var70, Statics.field291[0], var34);
                                                }
                                                if (!Statics.field844.field914) {
                                                    class285.method4623(var34.field2610 / 2 + var12 - 1, var34.field2611 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                class197 var43 = field1058[Statics.field861][var41][var42];
                                                if (var43 != null) {
                                                    int var44 = var41 * 4 + 2 - Statics.field844.field1264 / 32;
                                                    int var45 = var42 * 4 + 2 - Statics.field844.field1236 / 32;
                                                    method1383(var12, var13, var44, var45, Statics.field454[0], var34);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    field1134[var11] = true;
                                }
                                class285.method4574(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2661 == 1339) {
                                method71(var10, var12, var13, var11);
                                class285.method4574(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2661 == 1400) {
                                Statics.field2364.method4856(var12, var13, var10.field2672, var10.field2673, field936);
                            }
                            if (var10.field2661 == 1401) {
                                Statics.field2364.method4945(var12, var13, var10.field2672, var10.field2673);
                            }
                        }
                        if (var10.field2651 == 0) {
                            if (!var10.field2656 && method3092(var10) && Statics.field674 != var10) {
                                continue;
                            }
                            if (!var10.field2656) {
                                if (var10.field2717 > var10.field2758 - var10.field2673) {
                                    var10.field2717 = var10.field2758 - var10.field2673;
                                }
                                if (var10.field2717 < 0) {
                                    var10.field2717 = 0;
                                }
                            }
                            method207(arg0, var10.field2657, var19, var20, var21, var22, var12 - var10.field2678, var13 - var10.field2717, var11);
                            if (var10.field2655 != null) {
                                method207(var10.field2655, var10.field2657, var19, var20, var21, var22, var12 - var10.field2678, var13 - var10.field2717, var11);
                            }
                            class69 var71 = (class69) field1089.method3252((long) var10.field2657);
                            if (var71 != null) {
                                method2810(var71.field845, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class285.method4574(arg2, arg3, arg4, arg5);
                            class137.method2349();
                        }
                        if (field1142 || field1120[var11] || field1140 > 1) {
                            if (var10.field2651 == 0 && !var10.field2656 && var10.field2758 > var10.field2673) {
                                int var72 = var10.field2672 + var12;
                                int var73 = var10.field2717;
                                int var74 = var10.field2673;
                                int var75 = var10.field2758;
                                Statics.field386[0].method4672(var72, var13);
                                Statics.field386[1].method4672(var72, var13 + var74 - 16);
                                class285.method4623(var72, var13 + 16, 16, var74 - 32, field1005);
                                int var76 = (var74 - 32) * var74 / var75;
                                if (var76 < 8) {
                                    var76 = 8;
                                }
                                int var77 = (var74 - 32 - var76) * var73 / (var75 - var74);
                                class285.method4623(var72, var13 + 16 + var77, 16, var76, field1092);
                                class285.method4644(var72, var13 + 16 + var77, var76, field995);
                                class285.method4644(var72 + 1, var13 + 16 + var77, var76, field995);
                                class285.method4591(var72, var13 + 16 + var77, 16, field995);
                                class285.method4591(var72, var13 + 17 + var77, 16, field995);
                                class285.method4644(var72 + 15, var13 + 16 + var77, var76, field1007);
                                class285.method4644(var72 + 14, var13 + 17 + var77, var76 - 1, field1007);
                                class285.method4591(var72, var13 + 15 + var77 + var76, 16, field1007);
                                class285.method4591(var72 + 1, var13 + 14 + var77 + var76, 15, field1007);
                            }
                            if (var10.field2651 != 1) {
                                if (var10.field2651 == 2) {
                                    int var78 = 0;
                                    for (int var79 = 0; var79 < var10.field2669; var79++) {
                                        for (int var80 = 0; var80 < var10.field2668; var80++) {
                                            int var81 = (var10.field2723 + 32) * var80 + var12;
                                            int var82 = (var10.field2756 + 32) * var79 + var13;
                                            if (var78 < 20) {
                                                var81 += var10.field2725[var78];
                                                var82 += var10.field2726[var78];
                                            }
                                            if (var10.field2775[var78] > 0) {
                                                boolean var83 = false;
                                                boolean var84 = false;
                                                int var85 = var10.field2775[var78] - 1;
                                                if (var81 + 32 > arg2 && var81 < arg4 && var82 + 32 > arg3 && var82 < arg5 || Statics.field387 == var10 && field1041 == var78) {
                                                    class289 var86;
                                                    if (field1081 == 1 && Statics.field32 == var78 && Statics.field2633 == var10.field2657) {
                                                        var86 = class260.method3150(var85, var10.field2776[var78], 2, 0, 2, false);
                                                    } else {
                                                        var86 = class260.method3150(var85, var10.field2776[var78], 1, 3153952, 2, false);
                                                    }
                                                    if (var86 == null) {
                                                        method667(var10);
                                                    } else if (Statics.field387 == var10 && field1041 == var78) {
                                                        int var87 = class60.field750 - field1136;
                                                        int var88 = class60.field758 * 939681921 - field1043;
                                                        if (var87 < 5 && var87 > -5) {
                                                            var87 = 0;
                                                        }
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (field1046 < 5) {
                                                            var87 = 0;
                                                            var88 = 0;
                                                        }
                                                        var86.method4736(var81 + var87, var82 + var88, 128);
                                                        if (arg1 != -1) {
                                                            class220 var89 = arg0[arg1 & 0xFFFF];
                                                            if (var82 + var88 < class285.field3763 && var89.field2717 > 0) {
                                                                int var90 = field933 * (class285.field3763 - var82 - var88) / 3;
                                                                if (var90 > field933 * 10) {
                                                                    var90 = field933 * 10;
                                                                }
                                                                if (var90 > var89.field2717) {
                                                                    var90 = var89.field2717;
                                                                }
                                                                var89.field2717 -= var90;
                                                                field1043 += var90;
                                                                method667(var89);
                                                            }
                                                            if (var82 + var88 + 32 > class285.field3762 && var89.field2717 < var89.field2758 - var89.field2673) {
                                                                int var91 = field933 * (var82 + var88 + 32 - class285.field3762) / 3;
                                                                if (var91 > field933 * 10) {
                                                                    var91 = field933 * 10;
                                                                }
                                                                if (var91 > var89.field2758 - var89.field2673 - var89.field2717) {
                                                                    var91 = var89.field2758 - var89.field2673 - var89.field2717;
                                                                }
                                                                var89.field2717 += var91;
                                                                field1043 -= var91;
                                                                method667(var89);
                                                            }
                                                        }
                                                    } else if (Statics.field3200 == var10 && field1040 == var78) {
                                                        var86.method4736(var81, var82, 128);
                                                    } else {
                                                        var86.method4699(var81, var82);
                                                    }
                                                }
                                            } else if (var10.field2727 != null && var78 < 20) {
                                                class289 var92 = var10.method3657(var78);
                                                if (var92 != null) {
                                                    var92.method4699(var81, var82);
                                                } else if (class220.field2658) {
                                                    method667(var10);
                                                }
                                            }
                                            var78++;
                                        }
                                    }
                                } else if (var10.field2651 == 3) {
                                    int var93;
                                    if (method34(var10)) {
                                        var93 = var10.field2683;
                                        if (Statics.field674 == var10 && var10.field2789 != 0) {
                                            var93 = var10.field2789;
                                        }
                                    } else {
                                        var93 = var10.field2682;
                                        if (Statics.field674 == var10 && var10.field2685 != 0) {
                                            var93 = var10.field2685;
                                        }
                                    }
                                    if (var10.field2686) {
                                        switch(var10.field2687.field3777) {
                                            case 1:
                                                class285.method4583(var12, var13, var10.field2672, var10.field2673, var10.field2682, var10.field2683, 256 - (var10.field2688 & 0xFF), 256 - (var10.field2729 & 0xFF));
                                                break;
                                            case 2:
                                                class285.method4647(var12, var13, var10.field2672, var10.field2673, var10.field2682, var10.field2683, 256 - (var10.field2688 & 0xFF), 256 - (var10.field2729 & 0xFF));
                                                break;
                                            case 3:
                                                class285.method4585(var12, var13, var10.field2672, var10.field2673, var10.field2682, var10.field2683, 256 - (var10.field2688 & 0xFF), 256 - (var10.field2729 & 0xFF));
                                                break;
                                            case 4:
                                                class285.method4586(var12, var13, var10.field2672, var10.field2673, var10.field2682, var10.field2683, 256 - (var10.field2688 & 0xFF), 256 - (var10.field2729 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class285.method4623(var12, var13, var10.field2672, var10.field2673, var93);
                                                } else {
                                                    class285.method4581(var12, var13, var10.field2672, var10.field2673, var93, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class285.method4615(var12, var13, var10.field2672, var10.field2673, var93);
                                    } else {
                                        class285.method4590(var12, var13, var10.field2672, var10.field2673, var93, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2651 == 4) {
                                    class267 var94 = var10.method3671();
                                    if (var94 != null) {
                                        String var95 = var10.field2783;
                                        int var96;
                                        if (method34(var10)) {
                                            var96 = var10.field2683;
                                            if (Statics.field674 == var10 && var10.field2789 != 0) {
                                                var96 = var10.field2789;
                                            }
                                            if (var10.field2718.length() > 0) {
                                                var95 = var10.field2718;
                                            }
                                        } else {
                                            var96 = var10.field2682;
                                            if (Statics.field674 == var10 && var10.field2685 != 0) {
                                                var96 = var10.field2685;
                                            }
                                        }
                                        if (var10.field2656 && var10.field2710 != -1) {
                                            class260 var97 = class260.method3915(var10.field2710);
                                            var95 = var97.field3501;
                                            if (var95 == null) {
                                                var95 = "null";
                                            }
                                            if ((var97.field3531 == 1 || var10.field2695 != 1) && var10.field2695 != -1) {
                                                var95 = class89.method2636(16748608) + var95 + class89.field1401 + " " + 'x' + method969(var10.field2695);
                                            }
                                        }
                                        if (field1011 == var10) {
                                            class229 var10000 = (class229) null;
                                            var95 = class229.field3132;
                                            var96 = var10.field2682;
                                        }
                                        if (!var10.field2656) {
                                            var95 = method508(var95, var10);
                                        }
                                        var94.method4413(var95, var12, var13, var10.field2672, var10.field2673, var96, var10.field2647 ? 0 : -1, var10.field2720, var10.field2679, var10.field2689);
                                    } else if (class220.field2658) {
                                        method667(var10);
                                    }
                                } else if (var10.field2651 == 5) {
                                    if (var10.field2656) {
                                        class289 var99;
                                        if (var10.field2710 == -1) {
                                            var99 = var10.method3655(false);
                                        } else {
                                            var99 = class260.method3150(var10.field2710, var10.field2695, var10.field2696, var10.field2721, var10.field2663, false);
                                        }
                                        if (var99 != null) {
                                            int var100 = var99.field3793;
                                            int var101 = var99.field3794;
                                            if (var10.field2719) {
                                                class285.method4575(var12, var13, var10.field2672 + var12, var10.field2673 + var13);
                                                int var102 = (var10.field2672 + (var100 - 1)) / var100;
                                                int var103 = (var10.field2673 + (var101 - 1)) / var101;
                                                for (int var104 = 0; var104 < var102; var104++) {
                                                    for (int var105 = 0; var105 < var103; var105++) {
                                                        if (var10.field2763 != 0) {
                                                            var99.method4712(var100 / 2 + var100 * var104 + var12, var101 / 2 + var101 * var105 + var13, var10.field2763, 4096);
                                                        } else if (var14 == 0) {
                                                            var99.method4699(var100 * var104 + var12, var101 * var105 + var13);
                                                        } else {
                                                            var99.method4736(var100 * var104 + var12, var101 * var105 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class285.method4574(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var106 = var10.field2672 * 4096 / var100;
                                                if (var10.field2763 != 0) {
                                                    var99.method4712(var10.field2672 / 2 + var12, var10.field2673 / 2 + var13, var10.field2763, var106);
                                                } else if (var14 != 0) {
                                                    var99.method4713(var12, var13, var10.field2672, var10.field2673, 256 - (var14 & 0xFF));
                                                } else if (var10.field2672 == var100 && var10.field2673 == var101) {
                                                    var99.method4699(var12, var13);
                                                } else {
                                                    var99.method4701(var12, var13, var10.field2672, var10.field2673);
                                                }
                                            }
                                        } else if (class220.field2658) {
                                            method667(var10);
                                        }
                                    } else {
                                        class289 var98 = var10.method3655(method34(var10));
                                        if (var98 != null) {
                                            var98.method4699(var12, var13);
                                        } else if (class220.field2658) {
                                            method667(var10);
                                        }
                                    }
                                } else if (var10.field2651 == 6) {
                                    boolean var107 = method34(var10);
                                    int var108;
                                    if (var107) {
                                        var108 = var10.field2705;
                                    } else {
                                        var108 = var10.field2724;
                                    }
                                    class134 var109 = null;
                                    int var110 = 0;
                                    if (var10.field2710 != -1) {
                                        class260 var111 = class260.method3915(var10.field2710);
                                        if (var111 != null) {
                                            class260 var112 = var111.method4216(var10.field2695);
                                            var109 = var112.method4207(1);
                                            if (var109 == null) {
                                                method667(var10);
                                            } else {
                                                var109.method2303();
                                                var110 = var109.field2130 / 2;
                                            }
                                        }
                                    } else if (var10.field2700 == 5) {
                                        if (var10.field2777 == 0) {
                                            var109 = field1199.method3615((class264) null, -1, (class264) null, -1);
                                        } else {
                                            var109 = Statics.field844.method1017();
                                        }
                                    } else if (var108 == -1) {
                                        var109 = var10.method3658((class264) null, -1, var107, Statics.field844.field895);
                                        if (var109 == null && class220.field2658) {
                                            method667(var10);
                                        }
                                    } else {
                                        class264 var113 = class264.method3098(var108);
                                        var109 = var10.method3658(var113, var10.field2671, var107, Statics.field844.field895);
                                        if (var109 == null && class220.field2658) {
                                            method667(var10);
                                        }
                                    }
                                    class137.method2352(var10.field2672 / 2 + var12, var10.field2673 / 2 + var13);
                                    int var114 = var10.field2659 * class137.field2043[var10.field2779] >> 16;
                                    int var115 = var10.field2659 * class137.field2037[var10.field2779] >> 16;
                                    if (var109 != null) {
                                        if (var10.field2656) {
                                            var109.method2303();
                                            if (var10.field2714) {
                                                var109.method2268(0, var10.field2709, var10.field2742, var10.field2779, var10.field2645, var10.field2707 + var110 + var114, var10.field2707 + var115, var10.field2659);
                                            } else {
                                                var109.method2267(0, var10.field2709, var10.field2742, var10.field2779, var10.field2645, var10.field2707 + var110 + var114, var10.field2707 + var115);
                                            }
                                        } else {
                                            var109.method2267(0, var10.field2709, 0, var10.field2779, 0, var114, var115);
                                        }
                                    }
                                    class137.method2351();
                                } else {
                                    if (var10.field2651 == 7) {
                                        class267 var116 = var10.method3671();
                                        if (var116 == null) {
                                            if (class220.field2658) {
                                                method667(var10);
                                            }
                                            continue;
                                        }
                                        int var117 = 0;
                                        for (int var118 = 0; var118 < var10.field2669; var118++) {
                                            for (int var119 = 0; var119 < var10.field2668; var119++) {
                                                if (var10.field2775[var117] > 0) {
                                                    class260 var120 = class260.method3915(var10.field2775[var117] - 1);
                                                    String var121;
                                                    if (var120.field3531 != 1 && var10.field2776[var117] == 1) {
                                                        var121 = class89.method2636(16748608) + var120.field3501 + class89.field1401;
                                                    } else {
                                                        var121 = class89.method2636(16748608) + var120.field3501 + class89.field1401 + " " + 'x' + method969(var10.field2776[var117]);
                                                    }
                                                    int var122 = (var10.field2723 + 115) * var119 + var12;
                                                    int var123 = (var10.field2756 + 12) * var118 + var13;
                                                    if (var10.field2720 == 0) {
                                                        var116.method4407(var121, var122, var123, var10.field2682, var10.field2647 ? 0 : -1);
                                                    } else if (var10.field2720 == 1) {
                                                        var116.method4410(var121, var10.field2672 / 2 + var122, var123, var10.field2682, var10.field2647 ? 0 : -1);
                                                    } else {
                                                        var116.method4441(var121, var10.field2672 + var122 - 1, var123, var10.field2682, var10.field2647 ? 0 : -1);
                                                    }
                                                }
                                                var117++;
                                            }
                                        }
                                    }
                                    if (var10.field2651 == 8 && Statics.field838 == var10 && field1126 == field1080) {
                                        int var124 = 0;
                                        int var125 = 0;
                                        class267 var126 = Statics.field3213;
                                        String var127 = var10.field2783;
                                        String var128 = method508(var127, var10);
                                        while (var128.length() > 0) {
                                            int var129 = var128.indexOf(class89.field1405);
                                            String var130;
                                            if (var129 == -1) {
                                                var130 = var128;
                                                var128 = "";
                                            } else {
                                                var130 = var128.substring(0, var129);
                                                var128 = var128.substring(var129 + 4);
                                            }
                                            int var131 = var126.method4402(var130);
                                            if (var131 > var124) {
                                                var124 = var131;
                                            }
                                            var125 += var126.field3657 + 1;
                                        }
                                        var124 += 6;
                                        var125 += 7;
                                        int var132 = var10.field2672 + var12 - 5 - var124;
                                        int var133 = var10.field2673 + var13 + 5;
                                        if (var132 < var12 + 5) {
                                            var132 = var12 + 5;
                                        }
                                        if (var124 + var132 > arg4) {
                                            var132 = arg4 - var124;
                                        }
                                        if (var125 + var133 > arg5) {
                                            var133 = arg5 - var125;
                                        }
                                        class285.method4623(var132, var133, var124, var125, 16777120);
                                        class285.method4615(var132, var133, var124, var125, 0);
                                        String var134 = var10.field2783;
                                        int var135 = var126.field3657 + var133 + 2;
                                        String var136 = method508(var134, var10);
                                        while (var136.length() > 0) {
                                            int var137 = var136.indexOf(class89.field1405);
                                            String var138;
                                            if (var137 == -1) {
                                                var138 = var136;
                                                var136 = "";
                                            } else {
                                                var138 = var136.substring(0, var137);
                                                var136 = var136.substring(var137 + 4);
                                            }
                                            var126.method4407(var138, var132 + 3, var135, 0, -1);
                                            var135 += var126.field3657 + 1;
                                        }
                                    }
                                    if (var10.field2651 == 9) {
                                        int var139;
                                        int var140;
                                        int var141;
                                        int var142;
                                        if (var10.field2744) {
                                            var139 = var12;
                                            var140 = var10.field2673 + var13;
                                            var141 = var10.field2672 + var12;
                                            var142 = var13;
                                        } else {
                                            var139 = var12;
                                            var140 = var13;
                                            var141 = var10.field2672 + var12;
                                            var142 = var10.field2673 + var13;
                                        }
                                        if (var10.field2690 == 1) {
                                            class285.method4600(var139, var140, var141, var142, var10.field2682);
                                        } else {
                                            method1569(var139, var140, var141, var142, var10.field2682, var10.field2690);
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

    @ObfuscatedName("cc.ht(IIIIIII)V")
    public static final void method1569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class285.field3765;
        int var18 = arg1 - class285.field3763;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class137.method2356(var19, var20, var21);
        class137.method2371(var23, var24, var25, var19, var20, var21, arg4);
        class137.method2356(var19, var21, var22);
        class137.method2371(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("at.in(Ljava/lang/String;Lhu;B)Ljava/lang/String;")
    public static String method508(String arg0, class220 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method33(method658(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field490 != null) {
                    int var6 = Statics.field490.field2244;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field490.field2246 != null) {
                        var5 = (String) Statics.field490.field2246;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bu.is(IB)Ljava/lang/String;")
    public static final String method969(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1404 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method2636(65408) + var1.substring(0, var1.length() - 8) + class229.field3016 + " " + class89.field1402 + var1 + class89.field1403 + class89.field1401;
        } else if (var1.length() > 6) {
            return " " + class89.method2636(16777215) + var1.substring(0, var1.length() - 4) + class229.field3018 + " " + class89.field1402 + var1 + class89.field1403 + class89.field1401;
        } else {
            return " " + class89.method2636(16776960) + var1 + class89.field1401;
        }
    }

    @ObfuscatedName("client.ii(ZI)V")
    public final void method1053(boolean arg0) {
        method464(field1088, Statics.field2287, Statics.field726, arg0);
    }

    @ObfuscatedName("client.ih(Lhu;B)V")
    public void method1054(class220 arg0) {
        class220 var2 = arg0.field2676 == -1 ? null : class220.method1162(arg0.field2676);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2287;
            var4 = Statics.field726;
        } else {
            var3 = var2.field2672;
            var4 = var2.field2673;
        }
        method239(arg0, var3, var4, false);
        method3099(arg0, var3, var4);
    }

    @ObfuscatedName("an.iq([Lhu;Lhu;ZI)V")
    public static void method557(class220[] arg0, class220 arg1, boolean arg2) {
        int var3 = arg1.field2680 == 0 ? arg1.field2672 : arg1.field2680;
        int var4 = arg1.field2758 == 0 ? arg1.field2673 : arg1.field2758;
        method32(arg0, arg1.field2657, var3, var4, arg2);
        if (arg1.field2655 != null) {
            method32(arg1.field2655, arg1.field2657, var3, var4, arg2);
        }
        class69 var5 = (class69) field1089.method3252((long) arg1.field2657);
        if (var5 != null) {
            int var6 = var5.field845;
            if (class220.method2857(var6)) {
                method32(Statics.field780[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2661 == 1337) {
        }
    }

    @ObfuscatedName("ak.iv(IIIZI)V")
    public static final void method464(int arg0, int arg1, int arg2, boolean arg3) {
        if (class220.method2857(arg0)) {
            method32(Statics.field780[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("m.io([Lhu;IIIZI)V")
    public static void method32(class220[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class220 var6 = arg0[var5];
            if (var6 != null && var6.field2676 == arg1) {
                method239(var6, arg2, arg3, arg4);
                method3099(var6, arg2, arg3);
                if (var6.field2678 > var6.field2680 - var6.field2672) {
                    var6.field2678 = var6.field2680 - var6.field2672;
                }
                if (var6.field2678 < 0) {
                    var6.field2678 = 0;
                }
                if (var6.field2717 > var6.field2758 - var6.field2673) {
                    var6.field2717 = var6.field2758 - var6.field2673;
                }
                if (var6.field2717 < 0) {
                    var6.field2717 = 0;
                }
                if (var6.field2651 == 0) {
                    method557(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ai.iw(Lhu;IIZI)V")
    public static void method239(class220 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2672;
        int var5 = arg0.field2673;
        if (arg0.field2715 == 0) {
            arg0.field2672 = arg0.field2668;
        } else if (arg0.field2715 == 1) {
            arg0.field2672 = arg1 - arg0.field2668;
        } else if (arg0.field2715 == 2) {
            arg0.field2672 = arg0.field2668 * arg1 >> 14;
        }
        if (arg0.field2665 == 0) {
            arg0.field2673 = arg0.field2669;
        } else if (arg0.field2665 == 1) {
            arg0.field2673 = arg2 - arg0.field2669;
        } else if (arg0.field2665 == 2) {
            arg0.field2673 = arg0.field2669 * arg2 >> 14;
        }
        if (arg0.field2715 == 4) {
            arg0.field2672 = arg0.field2702 * arg0.field2673 / arg0.field2675;
        }
        if (arg0.field2665 == 4) {
            arg0.field2673 = arg0.field2675 * arg0.field2672 / arg0.field2702;
        }
        if (field1141 && arg0.field2651 == 0) {
            if (arg0.field2673 < 5 && arg0.field2672 < 5) {
                arg0.field2673 = 5;
                arg0.field2672 = 5;
            } else {
                if (arg0.field2673 <= 0) {
                    arg0.field2673 = 5;
                }
                if (arg0.field2672 <= 0) {
                    arg0.field2672 = 5;
                }
            }
        }
        if (arg0.field2661 == 1337) {
            field1173 = arg0;
        }
        if (arg3 && arg0.field2711 != null && (arg0.field2672 != var4 || arg0.field2673 != var5)) {
            class70 var6 = new class70();
            var6.field851 = arg0;
            var6.field854 = arg0.field2711;
            field1127.method3299(var6);
        }
    }

    @ObfuscatedName("fe.il(Lhu;III)V")
    public static void method3099(class220 arg0, int arg1, int arg2) {
        if (arg0.field2781 == 0) {
            arg0.field2670 = arg0.field2666;
        } else if (arg0.field2781 == 1) {
            arg0.field2670 = (arg1 - arg0.field2672) / 2 + arg0.field2666;
        } else if (arg0.field2781 == 2) {
            arg0.field2670 = arg1 - arg0.field2672 - arg0.field2666;
        } else if (arg0.field2781 == 3) {
            arg0.field2670 = arg0.field2666 * arg1 >> 14;
        } else if (arg0.field2781 == 4) {
            arg0.field2670 = (arg0.field2666 * arg1 >> 14) + (arg1 - arg0.field2672) / 2;
        } else {
            arg0.field2670 = arg1 - arg0.field2672 - (arg0.field2666 * arg1 >> 14);
        }
        if (arg0.field2746 == 0) {
            arg0.field2728 = arg0.field2667;
        } else if (arg0.field2746 == 1) {
            arg0.field2728 = (arg2 - arg0.field2673) / 2 + arg0.field2667;
        } else if (arg0.field2746 == 2) {
            arg0.field2728 = arg2 - arg0.field2673 - arg0.field2667;
        } else if (arg0.field2746 == 3) {
            arg0.field2728 = arg0.field2667 * arg2 >> 14;
        } else if (arg0.field2746 == 4) {
            arg0.field2728 = (arg0.field2667 * arg2 >> 14) + (arg2 - arg0.field2673) / 2;
        } else {
            arg0.field2728 = arg2 - arg0.field2673 - (arg0.field2667 * arg2 >> 14);
        }
        if (!field1141 || arg0.field2651 != 0) {
            return;
        }
        if (arg0.field2670 < 0) {
            arg0.field2670 = 0;
        } else if (arg0.field2672 + arg0.field2670 > arg1) {
            arg0.field2670 = arg1 - arg0.field2672;
        }
        if (arg0.field2728 < 0) {
            arg0.field2728 = 0;
        } else if (arg0.field2728 + arg0.field2673 > arg2) {
            arg0.field2728 = arg2 - arg0.field2673;
        }
    }

    @ObfuscatedName("m.ij(II)Ljava/lang/String;")
    public static final String method33(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("m.ic(Lhu;I)Z")
    public static final boolean method34(class220 arg0) {
        if (arg0.field2770 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2770.length; var1++) {
            int var2 = method658(arg0, var1);
            int var3 = arg0.field2652[var1];
            if (arg0.field2770[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2770[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2770[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ao.it(Lhu;II)I")
    public static final int method658(class220 arg0, int arg1) {
        if (arg0.field2769 == null || arg1 >= arg0.field2769.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2769[arg1];
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
                    var7 = field928[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1063[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field981[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class220 var11 = class220.method1162(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class260.method3915(var12).field3527 || field1175)) {
                        for (int var13 = 0; var13 < var11.field2775.length; var13++) {
                            if (var12 + 1 == var11.field2775[var13]) {
                                var7 += var11.field2776[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class215.field2616[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class226.field2841[field1063[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class215.field2616[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field844.field898;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class226.field2843[var14]) {
                            var7 += field1063[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class220 var17 = class220.method1162(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class260.method3915(var18).field3527 || field1175)) {
                        for (int var19 = 0; var19 < var17.field2775.length; var19++) {
                            if (var18 + 1 == var17.field2775[var19]) {
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
                    var7 = field1094;
                }
                if (var6 == 13) {
                    int var20 = class215.field2616[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class215.method2867(var22);
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
                    var7 = (Statics.field844.field1264 >> 7) + Statics.field353;
                }
                if (var6 == 19) {
                    var7 = (Statics.field844.field1236 >> 7) + Statics.field2461;
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

    @ObfuscatedName("ad.ip(IIIIIIII)V")
    public static final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class220.method2857(arg0)) {
            method468(Statics.field780[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ae.iz([Lhu;IIIIIIIB)V")
    public static final void method468(class220[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class220 var9 = arg0[var8];
            if (var9 != null && (!var9.field2656 || var9.field2651 == 0 || var9.field2737 || method967(var9) != 0 || field1102 == var9 || var9.field2661 == 1338) && var9.field2676 == arg1 && (!var9.field2656 || !method3092(var9))) {
                int var10 = var9.field2670 + arg6;
                int var11 = var9.field2728 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2651 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2651 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2672 + var10;
                    int var19 = var9.field2673 + var11;
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
                    int var22 = var9.field2672 + var10;
                    int var23 = var9.field2673 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1042 == var9) {
                    field1032 = true;
                    field1110 = var10;
                    field1079 = var11;
                }
                if (!var9.field2656 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field750;
                    int var25 = class60.field758 * 939681921;
                    if (class60.field744 != 0) {
                        var24 = class60.field756;
                        var25 = class60.field755;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2661 == 1337) {
                        if (!field935 && !field1066 && var26) {
                            if (field1081 == 0 && !field1083) {
                                method1029(class229.field3010, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class135.field2006; var29++) {
                                int var30 = class135.field2007[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field3635.method2483(Statics.field861, var31, var32, var30) >= 0) {
                                        class259 var35 = class259.method997(var34);
                                        if (var35.field3489 != null) {
                                            var35 = var35.method4176();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field1081 == 1) {
                                            method1029(class229.field3079, field1082 + " " + class89.field1407 + " " + class89.method2636(65535) + var35.field3497, 1, var30, var31, var32);
                                        } else if (!field1083) {
                                            String[] var36 = var35.field3475;
                                            if (field1099) {
                                                var36 = method970(var36);
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
                                                        method1029(var36[var37], class89.method2636(65535) + var35.field3497, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            method1029(class229.field3006, class89.method2636(65535) + var35.field3497, 1002, var35.field3455 << 14, var31, var32);
                                        } else if ((Statics.field40 & 0x4) == 4) {
                                            method1029(field1086, field1087 + " " + class89.field1407 + " " + class89.method2636(65535) + var35.field3497, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class87 var39 = field1166[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1387.field3570 == 1 && (var39.field1264 & 0x7F) == 64 && (var39.field1236 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field1171; var40++) {
                                                class87 var41 = field1166[field967[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1387.field3570 == 1 && var39.field1264 == var41.field1264 && var39.field1236 == var41.field1236) {
                                                    method1454(var41.field1387, field967[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class97.field1510;
                                            int[] var43 = class97.field1511;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class75 var45 = field1048[var43[var44]];
                                                if (var45 != null && var39.field1264 == var45.field1264 && var39.field1236 == var45.field1236) {
                                                    method1563(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method1454(var39.field1387, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class75 var46 = field1048[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1264 & 0x7F) == 64 && (var46.field1236 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field1171; var47++) {
                                                class87 var48 = field1166[field967[var47]];
                                                if (var48 != null && var48.field1387.field3570 == 1 && var46.field1264 == var48.field1264 && var46.field1236 == var48.field1236) {
                                                    method1454(var48.field1387, field967[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class97.field1510;
                                            int[] var50 = class97.field1511;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class75 var52 = field1048[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1264 == var52.field1264 && var46.field1236 == var52.field1236) {
                                                    method1563(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field1101 == var34) {
                                            var27 = var30;
                                        } else {
                                            method1563(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class197 var53 = field1058[Statics.field861][var31][var32];
                                        if (var53 != null) {
                                            for (class95 var54 = (class95) var53.method3305(); var54 != null; var54 = (class95) var53.method3317()) {
                                                class260 var55 = class260.method3915(var54.field1499);
                                                if (field1081 == 1) {
                                                    method1029(class229.field3079, field1082 + " " + class89.field1407 + " " + class89.method2636(16748608) + var55.field3501, 16, var54.field1499, var31, var32);
                                                } else if (!field1083) {
                                                    String[] var56 = var55.field3528;
                                                    if (field1099) {
                                                        var56 = method970(var56);
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
                                                            method1029(var56[var57], class89.method2636(16748608) + var55.field3501, var58, var54.field1499, var31, var32);
                                                        } else if (var57 == 2) {
                                                            method1029(class229.field2856, class89.method2636(16748608) + var55.field3501, 20, var54.field1499, var31, var32);
                                                        }
                                                    }
                                                    method1029(class229.field3006, class89.method2636(16748608) + var55.field3501, 1004, var54.field1499, var31, var32);
                                                } else if ((Statics.field40 & 0x1) == 1) {
                                                    method1029(field1086, field1087 + " " + class89.field1407 + " " + class89.method2636(16748608) + var55.field3501, 17, var54.field1499, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class75 var61 = field1048[field1101];
                                method1563(var61, field1101, var59, var60);
                            }
                        }
                    } else if (var9.field2661 != 1338) {
                        if (var9.field2661 == 1400) {
                            Statics.field2364.method4948(class60.field750, class60.field758 * 939681921, var26, var10, var11, var9.field2672, var9.field2673);
                        }
                        if (!field1066 && var26) {
                            if (var9.field2661 == 1400) {
                                Statics.field2364.method4889(var10, var11, var9.field2672, var9.field2673, var24, var25);
                            } else {
                                int var76 = var24 - var10;
                                int var77 = var25 - var11;
                                if (var9.field2773 == 1) {
                                    method1029(var9.field2774, "", 24, 0, 0, var9.field2657);
                                }
                                if (var9.field2773 == 2 && !field1083) {
                                    String var78 = method148(var9);
                                    if (var78 != null) {
                                        method1029(var78, class89.method2636(65280) + var9.field2752, 25, 0, -1, var9.field2657);
                                    }
                                }
                                if (var9.field2773 == 3) {
                                    method1029(class229.field3090, "", 26, 0, 0, var9.field2657);
                                }
                                if (var9.field2773 == 4) {
                                    method1029(var9.field2774, "", 28, 0, 0, var9.field2657);
                                }
                                if (var9.field2773 == 5) {
                                    method1029(var9.field2774, "", 29, 0, 0, var9.field2657);
                                }
                                if (var9.field2773 == 6 && field1011 == null) {
                                    method1029(var9.field2774, "", 30, 0, -1, var9.field2657);
                                }
                                if (var9.field2651 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var9.field2673; var80++) {
                                        for (int var81 = 0; var81 < var9.field2672; var81++) {
                                            int var82 = (var9.field2723 + 32) * var81;
                                            int var83 = (var9.field2756 + 32) * var80;
                                            if (var79 < 20) {
                                                var82 += var9.field2725[var79];
                                                var83 += var9.field2726[var79];
                                            }
                                            if (var76 >= var82 && var77 >= var83 && var76 < var82 + 32 && var77 < var83 + 32) {
                                                field1135 = var79;
                                                Statics.field592 = var9;
                                                if (var9.field2775[var79] > 0) {
                                                    class260 var84 = class260.method3915(var9.field2775[var79] - 1);
                                                    if (field1081 == 1 && class221.method2623(method967(var9))) {
                                                        if (Statics.field2633 != var9.field2657 || Statics.field32 != var79) {
                                                            method1029(class229.field3079, field1082 + " " + class89.field1407 + " " + class89.method2636(16748608) + var84.field3501, 31, var84.field3512, var79, var9.field2657);
                                                        }
                                                    } else if (!field1083 || !class221.method2623(method967(var9))) {
                                                        String[] var85 = var84.field3535;
                                                        if (field1099) {
                                                            var85 = method970(var85);
                                                        }
                                                        int var86 = var84.method4208();
                                                        if (class221.method2623(method967(var9))) {
                                                            for (int var87 = 4; var87 >= 3; var87--) {
                                                                boolean var88 = var86 == var87;
                                                                if (var85 != null && var85[var87] != null) {
                                                                    byte var89;
                                                                    if (var87 == 3) {
                                                                        var89 = 36;
                                                                    } else {
                                                                        var89 = 37;
                                                                    }
                                                                    method124(var85[var87], class89.method2636(16748608) + var84.field3501, var89, var84.field3512, var79, var9.field2657, var88);
                                                                } else if (var87 == 4) {
                                                                    method124(class229.field3077, class89.method2636(16748608) + var84.field3501, 37, var84.field3512, var79, var9.field2657, var88);
                                                                }
                                                            }
                                                        }
                                                        int var90 = method967(var9);
                                                        boolean var91 = (var90 >> 31 & 0x1) != 0;
                                                        if (var91) {
                                                            method1029(class229.field3079, class89.method2636(16748608) + var84.field3501, 38, var84.field3512, var79, var9.field2657);
                                                        }
                                                        class221 var10000 = (class221) null;
                                                        if (class221.method2623(method967(var9)) && var85 != null) {
                                                            for (int var92 = 2; var92 >= 0; var92--) {
                                                                boolean var93 = var86 == var92;
                                                                if (var85[var92] != null) {
                                                                    byte var94 = 0;
                                                                    if (var92 == 0) {
                                                                        var94 = 33;
                                                                    }
                                                                    if (var92 == 1) {
                                                                        var94 = 34;
                                                                    }
                                                                    if (var92 == 2) {
                                                                        var94 = 35;
                                                                    }
                                                                    method124(var85[var92], class89.method2636(16748608) + var84.field3501, var94, var84.field3512, var79, var9.field2657, var93);
                                                                }
                                                            }
                                                        }
                                                        String[] var95 = var9.field2701;
                                                        if (field1099) {
                                                            var95 = method970(var95);
                                                        }
                                                        if (var95 != null) {
                                                            for (int var96 = 4; var96 >= 0; var96--) {
                                                                if (var95[var96] != null) {
                                                                    byte var97 = 0;
                                                                    if (var96 == 0) {
                                                                        var97 = 39;
                                                                    }
                                                                    if (var96 == 1) {
                                                                        var97 = 40;
                                                                    }
                                                                    if (var96 == 2) {
                                                                        var97 = 41;
                                                                    }
                                                                    if (var96 == 3) {
                                                                        var97 = 42;
                                                                    }
                                                                    if (var96 == 4) {
                                                                        var97 = 43;
                                                                    }
                                                                    method1029(var95[var96], class89.method2636(16748608) + var84.field3501, var97, var84.field3512, var79, var9.field2657);
                                                                }
                                                            }
                                                        }
                                                        method1029(class229.field3006, class89.method2636(16748608) + var84.field3501, 1005, var84.field3512, var79, var9.field2657);
                                                    } else if ((Statics.field40 & 0x10) == 16) {
                                                        method1029(field1086, field1087 + " " + class89.field1407 + " " + class89.method2636(16748608) + var84.field3501, 32, var84.field3512, var79, var9.field2657);
                                                    }
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                }
                                if (var9.field2656) {
                                    if (field1083) {
                                        int var98 = method967(var9);
                                        boolean var99 = (var98 >> 21 & 0x1) != 0;
                                        if (var99 && (Statics.field40 & 0x20) == 32) {
                                            method1029(field1086, field1087 + " " + class89.field1407 + " " + var9.field2730, 58, 0, var9.field2684, var9.field2657);
                                        }
                                    } else {
                                        for (int var100 = 9; var100 >= 5; var100--) {
                                            int var101 = method967(var9);
                                            boolean var102 = (var101 >> var100 + 1 & 0x1) != 0;
                                            String var103;
                                            if (!var102 && var9.field2757 == null) {
                                                var103 = null;
                                            } else if (var9.field2731 == null || var9.field2731.length <= var100 || var9.field2731[var100] == null || var9.field2731[var100].trim().length() == 0) {
                                                var103 = null;
                                            } else {
                                                var103 = var9.field2731[var100];
                                            }
                                            if (var103 != null) {
                                                method1029(var103, var9.field2730, 1007, var100 + 1, var9.field2684, var9.field2657);
                                            }
                                        }
                                        String var105 = method148(var9);
                                        if (var105 != null) {
                                            method1029(var105, var9.field2730, 25, 0, var9.field2684, var9.field2657);
                                        }
                                        for (int var106 = 4; var106 >= 0; var106--) {
                                            int var107 = method967(var9);
                                            boolean var108 = (var107 >> var106 + 1 & 0x1) != 0;
                                            String var109;
                                            if (!var108 && var9.field2757 == null) {
                                                var109 = null;
                                            } else if (var9.field2731 == null || var9.field2731.length <= var106 || var9.field2731[var106] == null || var9.field2731[var106].trim().length() == 0) {
                                                var109 = null;
                                            } else {
                                                var109 = var9.field2731[var106];
                                            }
                                            if (var109 != null) {
                                                method1029(var109, var9.field2730, 57, var106 + 1, var9.field2684, var9.field2657);
                                            }
                                        }
                                        int var111 = method967(var9);
                                        boolean var112 = (var111 & 0x1) != 0;
                                        if (var112) {
                                            method1029(class229.field2973, "", 30, 0, var9.field2684, var9.field2657);
                                        }
                                    }
                                }
                            }
                        }
                        if (var9.field2651 == 0) {
                            if (!var9.field2656 && method3092(var9) && Statics.field674 != var9) {
                                continue;
                            }
                            method468(arg0, var9.field2657, var12, var13, var14, var15, var10 - var9.field2678, var11 - var9.field2717);
                            if (var9.field2655 != null) {
                                method468(var9.field2655, var9.field2657, var12, var13, var14, var15, var10 - var9.field2678, var11 - var9.field2717);
                            }
                            class69 var113 = (class69) field1089.method3252((long) var9.field2657);
                            if (var113 != null) {
                                if (var113.field847 == 0 && class60.field750 >= var12 && class60.field758 * 939681921 >= var13 && class60.field750 < var14 && class60.field758 * 939681921 < var15 && !field1066 && !field1141) {
                                    for (class70 var114 = (class70) field1127.method3304(); var114 != null; var114 = (class70) field1127.method3306()) {
                                        if (var114.field850) {
                                            var114.method3294();
                                            var114.field851.field2782 = false;
                                        }
                                    }
                                    if (Statics.field2129 == 0) {
                                        field1042 = null;
                                        field1102 = null;
                                    }
                                    if (!field1066) {
                                        method4085();
                                    }
                                }
                                method244(var113.field845, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2656) {
                            if (var9.field2790) {
                                if (class60.field750 >= var12 && class60.field758 * 939681921 >= var13 && class60.field750 < var14 && class60.field758 * 939681921 < var15) {
                                    for (class70 var115 = (class70) field1127.method3304(); var115 != null; var115 = (class70) field1127.method3306()) {
                                        if (var115.field850) {
                                            var115.method3294();
                                            var115.field851.field2782 = false;
                                        }
                                    }
                                    if (Statics.field2129 == 0) {
                                        field1042 = null;
                                        field1102 = null;
                                    }
                                    if (!field1066) {
                                        field951[0] = class229.field3026;
                                        field1073[0] = "";
                                        field1137[0] = 1006;
                                        field1067 = 1;
                                    }
                                }
                            } else if (var9.field2791 && class60.field750 >= var12 && class60.field758 * 939681921 >= var13 && class60.field750 < var14 && class60.field758 * 939681921 < var15) {
                                for (class70 var116 = (class70) field1127.method3304(); var116 != null; var116 = (class70) field1127.method3306()) {
                                    if (var116.field850 && var116.field851.field2698 == var116.field854) {
                                        var116.method3294();
                                    }
                                }
                            }
                            boolean var117;
                            if (class60.field750 >= var12 && class60.field758 * 939681921 >= var13 && class60.field750 < var14 && class60.field758 * 939681921 < var15) {
                                var117 = true;
                            } else {
                                var117 = false;
                            }
                            boolean var118 = false;
                            if ((class60.field749 == 1 || !Statics.field684 && class60.field749 == 4) && var117) {
                                var118 = true;
                            }
                            boolean var119 = false;
                            if ((class60.field744 == 1 || !Statics.field684 && class60.field744 == 4) && class60.field756 >= var12 && class60.field755 >= var13 && class60.field756 < var14 && class60.field755 < var15) {
                                var119 = true;
                            }
                            if (var119) {
                                method2812(var9, class60.field756 - var10, class60.field755 - var11);
                            }
                            if (var9.field2661 == 1400) {
                                Statics.field2364.method4843(class60.field750, class60.field758 * 939681921, var117 & var118);
                            }
                            if (field1042 != null && field1042 != var9 && var117) {
                                int var120 = method967(var9);
                                boolean var121 = (var120 >> 20 & 0x1) != 0;
                                if (var121) {
                                    field1105 = var9;
                                }
                            }
                            if (field1102 == var9) {
                                field1030 = true;
                                field1107 = var10;
                                field1108 = var11;
                            }
                            if (var9.field2737) {
                                if (var117 && field985 != 0 && var9.field2698 != null) {
                                    class70 var122 = new class70();
                                    var122.field850 = true;
                                    var122.field851 = var9;
                                    var122.field853 = field985;
                                    var122.field854 = var9.field2698;
                                    field1127.method3299(var122);
                                }
                                if (field1042 != null || Statics.field387 != null || field1066) {
                                    var119 = false;
                                    var118 = false;
                                    var117 = false;
                                }
                                if (!var9.field2704 && var119) {
                                    var9.field2704 = true;
                                    if (var9.field2739 != null) {
                                        class70 var123 = new class70();
                                        var123.field850 = true;
                                        var123.field851 = var9;
                                        var123.field852 = class60.field756 - var10;
                                        var123.field853 = class60.field755 - var11;
                                        var123.field854 = var9.field2739;
                                        field1127.method3299(var123);
                                    }
                                }
                                if (var9.field2704 && var118 && var9.field2740 != null) {
                                    class70 var124 = new class70();
                                    var124.field850 = true;
                                    var124.field851 = var9;
                                    var124.field852 = class60.field750 - var10;
                                    var124.field853 = class60.field758 * 939681921 - var11;
                                    var124.field854 = var9.field2740;
                                    field1127.method3299(var124);
                                }
                                if (var9.field2704 && !var118) {
                                    var9.field2704 = false;
                                    if (var9.field2697 != null) {
                                        class70 var125 = new class70();
                                        var125.field850 = true;
                                        var125.field851 = var9;
                                        var125.field852 = class60.field750 - var10;
                                        var125.field853 = class60.field758 * 939681921 - var11;
                                        var125.field854 = var9.field2697;
                                        field1129.method3299(var125);
                                    }
                                }
                                if (var118 && var9.field2712 != null) {
                                    class70 var126 = new class70();
                                    var126.field850 = true;
                                    var126.field851 = var9;
                                    var126.field852 = class60.field750 - var10;
                                    var126.field853 = class60.field758 * 939681921 - var11;
                                    var126.field854 = var9.field2712;
                                    field1127.method3299(var126);
                                }
                                if (!var9.field2782 && var117) {
                                    var9.field2782 = true;
                                    if (var9.field2743 != null) {
                                        class70 var127 = new class70();
                                        var127.field850 = true;
                                        var127.field851 = var9;
                                        var127.field852 = class60.field750 - var10;
                                        var127.field853 = class60.field758 * 939681921 - var11;
                                        var127.field854 = var9.field2743;
                                        field1127.method3299(var127);
                                    }
                                }
                                if (var9.field2782 && var117 && var9.field2771 != null) {
                                    class70 var128 = new class70();
                                    var128.field850 = true;
                                    var128.field851 = var9;
                                    var128.field852 = class60.field750 - var10;
                                    var128.field853 = class60.field758 * 939681921 - var11;
                                    var128.field854 = var9.field2771;
                                    field1127.method3299(var128);
                                }
                                if (var9.field2782 && !var117) {
                                    var9.field2782 = false;
                                    if (var9.field2745 != null) {
                                        class70 var129 = new class70();
                                        var129.field850 = true;
                                        var129.field851 = var9;
                                        var129.field852 = class60.field750 - var10;
                                        var129.field853 = class60.field758 * 939681921 - var11;
                                        var129.field854 = var9.field2745;
                                        field1129.method3299(var129);
                                    }
                                }
                                if (var9.field2766 != null) {
                                    class70 var130 = new class70();
                                    var130.field851 = var9;
                                    var130.field854 = var9.field2766;
                                    field983.method3299(var130);
                                }
                                if (var9.field2750 != null && field1115 > var9.field2785) {
                                    if (var9.field2751 == null || field1115 - var9.field2785 > 32) {
                                        class70 var135 = new class70();
                                        var135.field851 = var9;
                                        var135.field854 = var9.field2750;
                                        field1127.method3299(var135);
                                    } else {
                                        label1052: for (int var131 = var9.field2785; var131 < field1115; var131++) {
                                            int var132 = field1114[var131 & 0x1F];
                                            for (int var133 = 0; var133 < var9.field2751.length; var133++) {
                                                if (var9.field2751[var133] == var132) {
                                                    class70 var134 = new class70();
                                                    var134.field851 = var9;
                                                    var134.field854 = var9.field2750;
                                                    field1127.method3299(var134);
                                                    break label1052;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2785 = field1115;
                                }
                                if (var9.field2681 != null && field1027 > var9.field2786) {
                                    if (var9.field2753 == null || field1027 - var9.field2786 > 32) {
                                        class70 var140 = new class70();
                                        var140.field851 = var9;
                                        var140.field854 = var9.field2681;
                                        field1127.method3299(var140);
                                    } else {
                                        label1028: for (int var136 = var9.field2786; var136 < field1027; var136++) {
                                            int var137 = field1116[var136 & 0x1F];
                                            for (int var138 = 0; var138 < var9.field2753.length; var138++) {
                                                if (var9.field2753[var138] == var137) {
                                                    class70 var139 = new class70();
                                                    var139.field851 = var9;
                                                    var139.field854 = var9.field2681;
                                                    field1127.method3299(var139);
                                                    break label1028;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2786 = field1027;
                                }
                                if (var9.field2754 != null && field1202 > var9.field2787) {
                                    if (var9.field2755 == null || field1202 - var9.field2787 > 32) {
                                        class70 var145 = new class70();
                                        var145.field851 = var9;
                                        var145.field854 = var9.field2754;
                                        field1127.method3299(var145);
                                    } else {
                                        label1004: for (int var141 = var9.field2787; var141 < field1202; var141++) {
                                            int var142 = field1118[var141 & 0x1F];
                                            for (int var143 = 0; var143 < var9.field2755.length; var143++) {
                                                if (var9.field2755[var143] == var142) {
                                                    class70 var144 = new class70();
                                                    var144.field851 = var9;
                                                    var144.field854 = var9.field2754;
                                                    field1127.method3299(var144);
                                                    break label1004;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2787 = field1202;
                                }
                                if (field989 > var9.field2784 && var9.field2662 != null) {
                                    class70 var146 = new class70();
                                    var146.field851 = var9;
                                    var146.field854 = var9.field2662;
                                    field1127.method3299(var146);
                                }
                                if (field1035 > var9.field2784 && var9.field2759 != null) {
                                    class70 var147 = new class70();
                                    var147.field851 = var9;
                                    var147.field854 = var9.field2759;
                                    field1127.method3299(var147);
                                }
                                if (field1057 > var9.field2784 && var9.field2722 != null) {
                                    class70 var148 = new class70();
                                    var148.field851 = var9;
                                    var148.field854 = var9.field2722;
                                    field1127.method3299(var148);
                                }
                                if (field1123 > var9.field2784 && var9.field2767 != null) {
                                    class70 var149 = new class70();
                                    var149.field851 = var9;
                                    var149.field854 = var9.field2767;
                                    field1127.method3299(var149);
                                }
                                if (field1195 > var9.field2784 && var9.field2768 != null) {
                                    class70 var150 = new class70();
                                    var150.field851 = var9;
                                    var150.field854 = var9.field2768;
                                    field1127.method3299(var150);
                                }
                                if (field1125 > var9.field2784 && var9.field2648 != null) {
                                    class70 var151 = new class70();
                                    var151.field851 = var9;
                                    var151.field854 = var9.field2648;
                                    field1127.method3299(var151);
                                }
                                var9.field2784 = field1113;
                                if (var9.field2760 != null) {
                                    for (int var152 = 0; var152 < field1149; var152++) {
                                        class70 var153 = new class70();
                                        var153.field851 = var9;
                                        var153.field859 = field1177[var152];
                                        var153.field857 = field1150[var152];
                                        var153.field854 = var9.field2760;
                                        field1127.method3299(var153);
                                    }
                                }
                            }
                        }
                        if (!var9.field2656 && field1042 == null && Statics.field387 == null && !field1066) {
                            if ((var9.field2772 >= 0 || var9.field2685 != 0) && class60.field750 >= var12 && class60.field758 * 939681921 >= var13 && class60.field750 < var14 && class60.field758 * 939681921 < var15) {
                                if (var9.field2772 >= 0) {
                                    Statics.field674 = arg0[var9.field2772];
                                } else {
                                    Statics.field674 = var9;
                                }
                            }
                            if (var9.field2651 == 8 && class60.field750 >= var12 && class60.field758 * 939681921 >= var13 && class60.field750 < var14 && class60.field758 * 939681921 < var15) {
                                Statics.field838 = var9;
                            }
                            if (var9.field2758 > var9.field2673) {
                                int var154 = var9.field2672 + var10;
                                int var155 = var9.field2673;
                                int var156 = var9.field2758;
                                int var157 = class60.field750;
                                int var158 = class60.field758 * 939681921;
                                if (field1009) {
                                    field1010 = 32;
                                } else {
                                    field1010 = 0;
                                }
                                field1009 = false;
                                if (class60.field749 == 1 || !Statics.field684 && class60.field749 == 4) {
                                    if (var157 >= var154 && var157 < var154 + 16 && var158 >= var11 && var158 < var11 + 16) {
                                        var9.field2717 -= 4;
                                        method667(var9);
                                    } else if (var157 >= var154 && var157 < var154 + 16 && var158 >= var11 + var155 - 16 && var158 < var11 + var155) {
                                        var9.field2717 += 4;
                                        method667(var9);
                                    } else if (var157 >= var154 - field1010 && var157 < field1010 + var154 + 16 && var158 >= var11 + 16 && var158 < var11 + var155 - 16) {
                                        int var159 = (var155 - 32) * var155 / var156;
                                        if (var159 < 8) {
                                            var159 = 8;
                                        }
                                        int var160 = var158 - var11 - 16 - var159 / 2;
                                        int var161 = var155 - 32 - var159;
                                        var9.field2717 = (var156 - var155) * var160 / var161;
                                        method667(var9);
                                        field1009 = true;
                                    }
                                }
                                if (field985 != 0) {
                                    int var162 = var9.field2672;
                                    if (var157 >= var154 - var162 && var158 >= var11 && var157 < var154 + 16 && var158 <= var11 + var155) {
                                        var9.field2717 += field985 * 45;
                                        method667(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field1162 == 0 || field1162 == 3) && (class60.field744 == 1 || !Statics.field684 && class60.field744 == 4)) {
                        class214 var62 = var9.method3659(true);
                        if (var62 != null) {
                            int var63 = class60.field756 - var10;
                            int var64 = class60.field755 - var11;
                            if (var62.method3584(var63, var64)) {
                                int var65 = var63 - var62.field2610 / 2;
                                int var66 = var64 - var62.field2611 / 2;
                                int var67 = field999 + field1012 & 0x7FF;
                                int var68 = class137.field2043[var67];
                                int var69 = class137.field2037[var67];
                                int var70 = (field1001 + 256) * var68 >> 8;
                                int var71 = (field1001 + 256) * var69 >> 8;
                                int var72 = var65 * var71 + var66 * var70 >> 11;
                                int var73 = var66 * var71 - var65 * var70 >> 11;
                                int var74 = Statics.field844.field1264 + var72 >> 7;
                                int var75 = Statics.field844.field1236 - var73 >> 7;
                                field970.method3115(206);
                                field970.method3075(18);
                                field970.method2910(class51.field661[82] ? (class51.field661[81] ? 2 : 1) : 0);
                                field970.method2917(Statics.field2461 + var75);
                                field970.method2916(Statics.field353 + var74);
                                field970.method3075(var65);
                                field970.method3075(var66);
                                field970.method2903(field1012);
                                field970.method3075(57);
                                field970.method3075(field999);
                                field970.method3075(field1001);
                                field970.method3075(89);
                                field970.method2903(Statics.field844.field1264);
                                field970.method2903(Statics.field844.field1236);
                                field970.method3075(63);
                                field1019 = var74;
                                field1188 = var75;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.ix([Lhu;II)V")
    public static final void method617(class220[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class220 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2651 == 0) {
                    if (var3.field2655 != null) {
                        method617(var3.field2655, arg1);
                    }
                    class69 var4 = (class69) field1089.method3252((long) var3.field2657);
                    if (var4 != null) {
                        Statics.method615(var4.field845, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2764 != null) {
                    class70 var5 = new class70();
                    var5.field851 = var3;
                    var5.field854 = var3.field2764;
                    class84.method2625(var5);
                }
                if (arg1 == 1 && var3.field2765 != null) {
                    if (var3.field2684 >= 0) {
                        class220 var6 = class220.method1162(var3.field2657);
                        if (var6 == null || var6.field2655 == null || var3.field2684 >= var6.field2655.length || var6.field2655[var3.field2684] != var3) {
                            continue;
                        }
                    }
                    class70 var7 = new class70();
                    var7.field851 = var3;
                    var7.field854 = var3.field2765;
                    class84.method2625(var7);
                }
            }
        }
    }

    @ObfuscatedName("fk.id(Lhu;III)V")
    public static final void method2812(class220 arg0, int arg1, int arg2) {
        if (field1042 != null || field1066 || arg0 == null || method2638(arg0) == null) {
            return;
        }
        field1042 = arg0;
        field1102 = method2638(arg0);
        field1103 = arg1;
        field972 = arg2;
        Statics.field2129 = 0;
        field1112 = false;
        int var3 = method3097();
        if (var3 == -1) {
            return;
        }
        Statics.field700 = new class90();
        Statics.field700.field1414 = field1068[var3];
        Statics.field700.field1411 = field1069[var3];
        Statics.field700.field1410 = field1137[var3];
        Statics.field700.field1413 = field1071[var3];
        Statics.field700.field1412 = field951[var3];
    }

    @ObfuscatedName("client.ik(I)V")
    public final void method1055() {
        method667(field1042);
        Statics.field2129++;
        if (field1032 && field1030) {
            int var1 = class60.field750;
            int var2 = class60.field758 * 939681921;
            int var3 = var1 - field1103;
            int var4 = var2 - field972;
            if (var3 < field1107) {
                var3 = field1107;
            }
            if (field1042.field2672 + var3 > field1107 + field1102.field2672) {
                var3 = field1107 + field1102.field2672 - field1042.field2672;
            }
            if (var4 < field1108) {
                var4 = field1108;
            }
            if (field1042.field2673 + var4 > field1108 + field1102.field2673) {
                var4 = field1108 + field1102.field2673 - field1042.field2673;
            }
            int var5 = var3 - field1110;
            int var6 = var4 - field1079;
            int var7 = field1042.field2733;
            if (Statics.field2129 > field1042.field2734 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1112 = true;
            }
            int var8 = field1102.field2678 + (var3 - field1107);
            int var9 = field1102.field2717 + (var4 - field1108);
            if (field1042.field2741 != null && field1112) {
                class70 var10 = new class70();
                var10.field851 = field1042;
                var10.field852 = var8;
                var10.field853 = var9;
                var10.field854 = field1042.field2741;
                class84.method2625(var10);
            }
            if (class60.field749 == 0) {
                if (field1112) {
                    if (field1042.field2747 != null) {
                        class70 var11 = new class70();
                        var11.field851 = field1042;
                        var11.field852 = var8;
                        var11.field853 = var9;
                        var11.field856 = field1105;
                        var11.field854 = field1042.field2747;
                        class84.method2625(var11);
                    }
                    if (field1105 != null && method3383(field1042) != null) {
                        field970.method3115(151);
                        field970.method2916(field1042.field2684);
                        field970.method2903(field1105.field2684);
                        field970.method2903(field1105.field2710);
                        field970.method2926(field1042.field2657);
                        field970.method2926(field1105.field2657);
                        field970.method2917(field1042.field2710);
                    }
                } else {
                    label124: {
                        label128: {
                            int var12 = method3097();
                            if (field1067 > 2) {
                                if (field1065 == 1) {
                                    boolean var13;
                                    if (field1067 <= 0) {
                                        var13 = false;
                                    } else if (field1076 && class51.field661[81] && field1033 != -1) {
                                        var13 = true;
                                    } else {
                                        var13 = false;
                                    }
                                    if (!var13) {
                                        break label128;
                                    }
                                }
                                boolean var14;
                                if (var12 < 0) {
                                    var14 = false;
                                } else {
                                    int var15 = field1137[var12];
                                    if (var15 >= 2000) {
                                        var15 -= 2000;
                                    }
                                    if (var15 == 1007) {
                                        var14 = true;
                                    } else {
                                        var14 = false;
                                    }
                                }
                                if (var14) {
                                    break label128;
                                }
                            }
                            if (field1067 > 0) {
                                int var16 = field1110 + field1103;
                                int var17 = field972 + field1079;
                                class90 var18 = Statics.field700;
                                method2622(var18.field1414, var18.field1411, var18.field1410, var18.field1413, var18.field1412, var18.field1412, var16, var17);
                                Statics.field700 = null;
                            }
                            break label124;
                        }
                        this.method1062(field1110 + field1103, field972 + field1079);
                    }
                }
                field1042 = null;
            }
        } else if (Statics.field2129 > 1) {
            field1042 = null;
        }
    }

    @ObfuscatedName("y.ib(II)V")
    public static void method160(int arg0) {
        Statics.field700 = new class90();
        Statics.field700.field1414 = field1068[arg0];
        Statics.field700.field1411 = field1069[arg0];
        Statics.field700.field1410 = field1137[arg0];
        Statics.field700.field1413 = field1071[arg0];
        Statics.field700.field1412 = field951[arg0];
    }

    @ObfuscatedName("bd.iu(Lhu;I)V")
    public static void method667(class220 arg0) {
        if (field1133 == arg0.field2708) {
            field965[arg0.field2677] = true;
        }
    }

    @ObfuscatedName("as.if(I)V")
    public static void method491() {
        for (class69 var0 = (class69) field1089.method3251(); var0 != null; var0 = (class69) field1089.method3256()) {
            int var1 = var0.field845;
            if (class220.method2857(var1)) {
                boolean var2 = true;
                class220[] var3 = Statics.field780[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2656;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2490;
                    class220 var6 = class220.method1162(var5);
                    if (var6 != null) {
                        method667(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ej.im(Lhu;I)Lhu;")
    public static class220 method2638(class220 arg0) {
        class220 var1 = method3383(arg0);
        if (var1 == null) {
            var1 = arg0.field2732;
        }
        return var1;
    }

    @ObfuscatedName("bu.ig([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method970(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("bs.iy(IB)V")
    public static final void method977(int arg0) {
        if (!class220.method2857(arg0)) {
            return;
        }
        class220[] var1 = Statics.field780[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class220 var3 = var1[var2];
            if (var3 != null) {
                var3.field2671 = 0;
                var3.field2780 = 0;
            }
        }
    }

    @ObfuscatedName("ap.ia(II)V")
    public static final void method202(int arg0) {
        if (class220.method2857(arg0)) {
            method2668(Statics.field780[arg0], -1);
        }
    }

    @ObfuscatedName("ew.ir([Lhu;II)V")
    public static final void method2668(class220[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class220 var3 = arg0[var2];
            if (var3 != null && var3.field2676 == arg1 && (!var3.field2656 || !method3092(var3))) {
                if (var3.field2651 == 0) {
                    if (!var3.field2656 && method3092(var3) && Statics.field674 != var3) {
                        continue;
                    }
                    method2668(arg0, var3.field2657);
                    if (var3.field2655 != null) {
                        method2668(var3.field2655, var3.field2657);
                    }
                    class69 var4 = (class69) field1089.method3252((long) var3.field2657);
                    if (var4 != null) {
                        method202(var4.field845);
                    }
                }
                if (var3.field2651 == 6) {
                    if (var3.field2724 != -1 || var3.field2705 != -1) {
                        boolean var5 = method34(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2705;
                        } else {
                            var6 = var3.field2724;
                        }
                        if (var6 != -1) {
                            class264 var7 = class264.method3098(var6);
                            var3.field2780 += field933;
                            while (var3.field2780 > var7.field3622[var3.field2671]) {
                                var3.field2780 -= var7.field3622[var3.field2671];
                                var3.field2671++;
                                if (var3.field2671 >= var7.field3620.length) {
                                    var3.field2671 -= var7.field3624;
                                    if (var3.field2671 < 0 || var3.field2671 >= var7.field3620.length) {
                                        var3.field2671 = 0;
                                    }
                                }
                                method667(var3);
                            }
                        }
                    }
                    if (var3.field2713 != 0 && !var3.field2656) {
                        int var8 = var3.field2713 >> 16;
                        int var9 = var3.field2713 << 16 >> 16;
                        int var10 = field933 * var8;
                        int var11 = field933 * var9;
                        var3.field2779 = var3.field2779 + var10 & 0x7FF;
                        var3.field2709 = var3.field2709 + var11 & 0x7FF;
                        method667(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.jx(II)V")
    public static final void method171(int arg0) {
        method491();
        Statics.method15();
        class245 var1 = (class245) class245.field3290.method3239((long) arg0);
        class245 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3285.method3754(16, arg0);
            class245 var4 = new class245();
            if (var3 != null) {
                var4.method3877(new class177(var3));
            }
            class245.field3290.method3241(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field3288;
        if (var5 == 0) {
            return;
        }
        int var6 = class215.field2616[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class137.method2354(0.9D);
                ((class126) Statics.field2040).method2134(0.9D);
            }
            if (var6 == 2) {
                class137.method2354(0.8D);
                ((class126) Statics.field2040).method2134(0.8D);
            }
            if (var6 == 3) {
                class137.method2354(0.7D);
                ((class126) Statics.field2040).method2134(0.7D);
            }
            if (var6 == 4) {
                class137.method2354(0.6D);
                ((class126) Statics.field2040).method2134(0.6D);
            }
            class260.method236();
        }
        if (var5 == 3) {
            short var7 = 0;
            if (var6 == 0) {
                var7 = 255;
            }
            if (var6 == 1) {
                var7 = 192;
            }
            if (var6 == 2) {
                var7 = 128;
            }
            if (var6 == 3) {
                var7 = 64;
            }
            if (var6 == 4) {
                var7 = 0;
            }
            if (field1163 != var7) {
                if (field1163 == 0 && field1124 != -1) {
                    class207.method913(Statics.field1, field1124, 0, var7, false);
                    field1165 = false;
                } else if (var7 == 0) {
                    Statics.method1462();
                    field1165 = false;
                } else if (class207.field2521 == 0) {
                    Statics.field458.method3397(var7);
                } else {
                    Statics.field2523 = var7;
                }
                field1163 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field982 = 127;
            }
            if (var6 == 1) {
                field982 = 96;
            }
            if (var6 == 2) {
                field982 = 64;
            }
            if (var6 == 3) {
                field982 = 32;
            }
            if (var6 == 4) {
                field982 = 0;
            }
        }
        if (var5 == 5) {
            field1065 = var6;
        }
        if (var5 == 6) {
            field1090 = var6;
        }
        if (var5 == 9) {
            field1091 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field1167 = 127;
            }
            if (var6 == 1) {
                field1167 = 96;
            }
            if (var6 == 2) {
                field1167 = 64;
            }
            if (var6 == 3) {
                field1167 = 32;
            }
            if (var6 == 4) {
                field1167 = 0;
            }
        }
        if (var5 == 17) {
            field1096 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            class92[] var8 = new class92[] { class92.field1425, class92.field1433, class92.field1424, class92.field1426 };
            field952 = (class92) class172.method1461(var8, var6);
            if (field952 == null) {
                field952 = class92.field1433;
            }
        }
        if (var5 == 19) {
            if (var6 == -1) {
                field1101 = -1;
            } else {
                field1101 = var6 & 0x7FF;
            }
        }
        if (var5 != 22) {
            return;
        }
        class92[] var9 = new class92[] { class92.field1425, class92.field1433, class92.field1424, class92.field1426 };
        field1053 = (class92) class172.method1461(var9, var6);
        if (field1053 == null) {
            field1053 = class92.field1433;
        }
    }

    @ObfuscatedName("as.jk(Lhu;I)V")
    public static final void method490(class220 arg0) {
        int var1 = arg0.field2661;
        if (var1 == 324) {
            if (field966 == -1) {
                field966 = arg0.field2691;
                field1201 = arg0.field2693;
            }
            if (field1199.field2626) {
                arg0.field2691 = field966;
            } else {
                arg0.field2691 = field1201;
            }
        } else if (var1 == 325) {
            if (field966 == -1) {
                field966 = arg0.field2691;
                field1201 = arg0.field2693;
            }
            if (field1199.field2626) {
                arg0.field2691 = field1201;
            } else {
                arg0.field2691 = field966;
            }
        } else if (var1 == 327) {
            arg0.field2779 = 150;
            arg0.field2709 = (int) (Math.sin((double) field936 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2700 = 5;
            arg0.field2777 = 0;
        } else if (var1 == 328) {
            arg0.field2779 = 150;
            arg0.field2709 = (int) (Math.sin((double) field936 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2700 = 5;
            arg0.field2777 = 1;
        }
    }

    @ObfuscatedName("az.jr(I)V")
    public static final void method476() {
        field970.method3115(103);
        for (class69 var0 = (class69) field1089.method3251(); var0 != null; var0 = (class69) field1089.method3256()) {
            if (var0.field847 == 0 || var0.field847 == 3) {
                method3(var0, true);
            }
        }
        if (field1011 != null) {
            method667(field1011);
            field1011 = null;
        }
    }

    @ObfuscatedName("o.jz(Lbk;ZI)V")
    public static final void method3(class69 arg0, boolean arg1) {
        int var2 = arg0.field845;
        int var3 = (int) arg0.field2490;
        arg0.method3294();
        if (arg1 && var2 != -1 && Statics.field3137[var2]) {
            Statics.field2660.method3739(var2);
            if (Statics.field780[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field780[var2].length; var5++) {
                    if (Statics.field780[var2][var5] != null) {
                        if (Statics.field780[var2][var5].field2651 == 2) {
                            var4 = false;
                        } else {
                            Statics.field780[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field780[var2] = null;
                }
                Statics.field3137[var2] = false;
            }
        }
        for (class202 var6 = (class202) field1130.method3251(); var6 != null; var6 = (class202) field1130.method3256()) {
            if ((long) var2 == (var6.field2490 >> 48 & 0xFFFFL)) {
                var6.method3294();
            }
        }
        class220 var7 = class220.method1162(var3);
        if (var7 != null) {
            method667(var7);
        }
        method131();
        if (field1088 != -1) {
            Statics.method615(field1088, 1);
        }
    }

    @ObfuscatedName("j.jg(Lhu;I)Z")
    public static final boolean method18(class220 arg0) {
        int var1 = arg0.field2661;
        if (var1 == 205) {
            field1122 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1199.method3635(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1199.method3619(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1199.method3613(false);
        }
        if (var1 == 325) {
            field1199.method3613(true);
        }
        if (var1 == 326) {
            field970.method3115(29);
            field1199.method3624(field970);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("q.jl(Lhu;IIII)V")
    public static final void method71(class220 arg0, int arg1, int arg2, int arg3) {
        class214 var4 = arg0.method3659(false);
        if (var4 == null) {
            return;
        }
        if (field1162 < 3) {
            Statics.field2126.method4710(arg1, arg2, var4.field2610, var4.field2611, 25, 25, field1012, 256, var4.field2613, var4.field2612);
        } else {
            class285.method4596(arg1, arg2, 0, var4.field2613, var4.field2612);
        }
    }

    @ObfuscatedName("jn.jt(IIIILkh;Lhh;B)V")
    public static final void method4509(int arg0, int arg1, int arg2, int arg3, class289 arg4, class214 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1383(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field999 + field1012 & 0x7FF;
        int var8 = class137.field2043[var7];
        int var9 = class137.field2037[var7];
        int var10 = var8 * 256 / (field1001 + 256);
        int var11 = var9 * 256 / (field1001 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2127.method4711(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("bi.jo(IIIILkh;Lhh;I)V")
    public static final void method1383(int arg0, int arg1, int arg2, int arg3, class289 arg4, class214 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field999 + field1012 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field2043[var6];
        int var9 = class137.field2037[var6];
        int var10 = var8 * 256 / (field1001 + 256);
        int var11 = var9 * 256 / (field1001 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4748(arg5.field2610 / 2 + var12 - arg4.field3793 / 2, arg5.field2611 / 2 - var13 - arg4.field3794 / 2, arg0, arg1, arg5.field2610, arg5.field2611, arg5.field2613, arg5.field2612);
        } else {
            arg4.method4699(arg5.field2610 / 2 + arg0 + var12 - arg4.field3793 / 2, arg5.field2611 / 2 + arg1 - var13 - arg4.field3794 / 2);
        }
    }

    @ObfuscatedName("ac.jh(Ljava/lang/String;ZI)Z")
    public static boolean method208(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class271.method3563(arg0, Statics.field790);
        for (int var3 = 0; var3 < field1013; var3++) {
            if (var2.equalsIgnoreCase(class271.method3563(field1132[var3].field818, Statics.field790)) && (!arg1 || field1132[var3].field815 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class271.method3563(Statics.field844.field907, Statics.field790))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ce.jy(Ljava/lang/String;I)Z")
    public static boolean method1542(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class271.method3563(arg0, Statics.field790);
        for (int var2 = 0; var2 < field953; var2++) {
            class71 var3 = field1198[var2];
            if (var1.equalsIgnoreCase(class271.method3563(var3.field867, Statics.field790))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class271.method3563(var3.field868, Statics.field790))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ae.ja(Ljava/lang/String;I)V")
    public static final void method467(String arg0) {
        if (!arg0.equals("")) {
            field970.method3115(73);
            field970.method3075(class177.method117(arg0));
            field970.method2875(arg0);
        }
    }

    @ObfuscatedName("bp.je(Lhu;B)I")
    public static int method967(class220 arg0) {
        class202 var1 = (class202) field1130.method3252(((long) arg0.field2657 << 32) + (long) arg0.field2684);
        return var1 == null ? arg0.field2706 : var1.field2503;
    }

    @ObfuscatedName("gy.jj(Lhu;I)Lhu;")
    public static class220 method3383(class220 arg0) {
        int var1 = class221.method886(method967(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class220.method1162(arg0.field2676);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("fe.jv(Lhu;I)Z")
    public static boolean method3092(class220 arg0) {
        if (field1141) {
            if (method967(arg0) != 0) {
                return false;
            }
            if (arg0.field2651 == 0) {
                return false;
            }
        }
        return arg0.field2664;
    }

    @ObfuscatedName("d.jp(Lhu;I)Ljava/lang/String;")
    public static String method148(class220 arg0) {
        int var1 = method967(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2736 == null || arg0.field2736.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2736;
        }
    }

    @ObfuscatedName("da.jm(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1881(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field930 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field930 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field930 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field930 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field930 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field256 != null) {
            var3 = "/p=" + Statics.field256;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field1111 + "/a=" + Statics.field1324 + var3 + "/";
    }

    @ObfuscatedName("be.js(Ljava/lang/String;I)V")
    public static void method990(String arg0) {
        Statics.field256 = arg0;
        try {
            String var1 = Statics.field2286.getParameter(class278.field3730.field3733);
            String var2 = Statics.field2286.getParameter(class278.field3734.field3733);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class186.method974(class179.method1665() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field2286;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("ak.ju(Ljava/lang/String;ZB)V")
    public static void method465(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3550; var5++) {
            class260 var6 = class260.method3915(var5);
            if ((!arg1 || var6.field3558) && var6.field3546 == -1 && var6.field3501.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field686 = -1;
                    Statics.field1408 = null;
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
        Statics.field1408 = var3;
        Statics.field2203 = 0;
        Statics.field686 = var4;
        String[] var9 = new String[Statics.field686];
        for (int var10 = 0; var10 < Statics.field686; var10++) {
            var9[var10] = class260.method3915(var3[var10]).field3501;
        }
        short[] var11 = Statics.field1408;
        class174.method4190(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("fv.ji([BII)V")
    public static void method2749(byte[] arg0, int arg1) {
        if (field964 == null) {
            field964 = new byte[24];
        }
        class187.method3161(arg0, arg1, field964, 0, 24);
    }

    @ObfuscatedName("x.jq(Lfi;IB)V")
    public static void method4(class177 arg0, int arg1) {
        method2749(arg0.field2419, arg1);
        if (class157.field2263 == null) {
            return;
        }
        try {
            class157.field2263.method2087(0L);
            class157.field2263.method2096(arg0.field2419, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("il.jb(Lfi;B)V")
    public static void method3866(class177 arg0) {
        if (field964 == null) {
            byte[] var1 = class157.method1620();
            arg0.method3002(var1, 0, var1.length);
        } else {
            arg0.method3002(field964, 0, field964.length);
        }
    }
}

package deob;

import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class163[] field1004 = new class163[4];

    @ObfuscatedName("client.au")
    public static boolean field979 = true;

    @ObfuscatedName("client.bp")
    public static int field942 = 1;

    @ObfuscatedName("client.bd")
    public static int field943 = 0;

    @ObfuscatedName("client.bc")
    public static int field944 = 0;

    @ObfuscatedName("client.bx")
    public static boolean field945 = false;

    @ObfuscatedName("client.br")
    public static boolean field941 = false;

    @ObfuscatedName("client.by")
    public static int field950 = 0;

    @ObfuscatedName("client.bf")
    public static int field948 = 0;

    @ObfuscatedName("client.bn")
    public static boolean field1101 = true;

    @ObfuscatedName("client.be")
    public static int field973 = 0;

    @ObfuscatedName("client.bq")
    public static long field1083 = 1L;

    @ObfuscatedName("client.bl")
    public static int field1208 = -1;

    @ObfuscatedName("client.bb")
    public static int field954 = -1;

    @ObfuscatedName("client.bt")
    public static int field955 = -1;

    @ObfuscatedName("client.bu")
    public static boolean field956 = true;

    @ObfuscatedName("client.bo")
    public static boolean field1029 = false;

    @ObfuscatedName("client.bj")
    public static int field1060 = 0;

    @ObfuscatedName("client.bk")
    public static int field959 = 0;

    @ObfuscatedName("client.bg")
    public static int field960 = 0;

    @ObfuscatedName("client.cj")
    public static int field961 = 0;

    @ObfuscatedName("client.cp")
    public static int field981 = 0;

    @ObfuscatedName("client.cq")
    public static int field963 = 0;

    @ObfuscatedName("client.cz")
    public static int field1095 = 0;

    @ObfuscatedName("client.cc")
    public static int field988 = 0;

    @ObfuscatedName("client.cf")
    public static int field966 = 0;

    @ObfuscatedName("client.ct")
    public static class91 field968 = class91.field1427;

    @ObfuscatedName("client.ch")
    public static class91 field969 = class91.field1427;

    @ObfuscatedName("client.cx")
    public static int field1089 = 0;

    @ObfuscatedName("client.cg")
    public static int field1085 = 0;

    @ObfuscatedName("client.cr")
    public static int field1156 = 0;

    @ObfuscatedName("client.dn")
    public static int field946 = 0;

    @ObfuscatedName("client.dl")
    public static int field1118 = 0;

    @ObfuscatedName("client.dg")
    public static int field976 = 0;

    @ObfuscatedName("client.di")
    public static int field1176 = 0;

    @ObfuscatedName("client.dm")
    public static int field978 = 0;

    @ObfuscatedName("client.db")
    public static class151 field1136 = class151.field2207;

    @ObfuscatedName("client.dc")
    public static byte[] field980 = null;

    @ObfuscatedName("client.du")
    public static class86[] field1097 = new class86[32768];

    @ObfuscatedName("client.do")
    public static int field947 = 0;

    @ObfuscatedName("client.dk")
    public static int[] field983 = new int[32768];

    @ObfuscatedName("client.ex")
    public static int field984 = 0;

    @ObfuscatedName("client.ee")
    public static int[] field985 = new int[250];

    @ObfuscatedName("client.ed")
    public static class181 field986 = new class181(5000);

    @ObfuscatedName("client.ei")
    public static class181 field1077 = new class181(5000);

    @ObfuscatedName("client.el")
    public static class181 field1110 = new class181(15000);

    @ObfuscatedName("client.ep")
    public static int field989 = 0;

    @ObfuscatedName("client.ew")
    public static int field965 = 0;

    @ObfuscatedName("client.ec")
    public static int field991 = 0;

    @ObfuscatedName("client.ej")
    public static int field992 = 0;

    @ObfuscatedName("client.eg")
    public static int field993 = 0;

    @ObfuscatedName("client.eu")
    public static int field958 = 0;

    @ObfuscatedName("client.es")
    public static int field995 = 0;

    @ObfuscatedName("client.eq")
    public static int field1059 = 0;

    @ObfuscatedName("client.ef")
    public static boolean field997 = false;

    @ObfuscatedName("client.ek")
    public static HashMap field998 = new HashMap();

    @ObfuscatedName("client.ff")
    public static int field999 = 0;

    @ObfuscatedName("client.fx")
    public static int field1000 = 1;

    @ObfuscatedName("client.fh")
    public static int field1034 = 0;

    @ObfuscatedName("client.fr")
    public static int field1129 = 1;

    @ObfuscatedName("client.fk")
    public static int field1003 = 0;

    @ObfuscatedName("client.fw")
    public static boolean field1005 = false;

    @ObfuscatedName("client.fi")
    public static int[][][] field1006 = new int[4][13][13];

    @ObfuscatedName("client.fp")
    public static final int[] field1135 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fm")
    public static int field1008 = 0;

    @ObfuscatedName("client.gk")
    public static int field1009 = 2301979;

    @ObfuscatedName("client.gp")
    public static int field1074 = 5063219;

    @ObfuscatedName("client.gg")
    public static int field1011 = 3353893;

    @ObfuscatedName("client.gn")
    public static int field1007 = 7759444;

    @ObfuscatedName("client.gs")
    public static boolean field1013 = false;

    @ObfuscatedName("client.gt")
    public static int field1014 = 0;

    @ObfuscatedName("client.gx")
    public static int field957 = 128;

    @ObfuscatedName("client.ge")
    public static int field1016 = 0;

    @ObfuscatedName("client.gj")
    public static int field990 = 0;

    @ObfuscatedName("client.gh")
    public static int field1018 = 0;

    @ObfuscatedName("client.ga")
    public static int field1019 = 0;

    @ObfuscatedName("client.gy")
    public static int field1020 = 0;

    @ObfuscatedName("client.gr")
    public static int field1021 = 50;

    @ObfuscatedName("client.he")
    public static int field1022 = 0;

    @ObfuscatedName("client.hl")
    public static boolean field1207 = false;

    @ObfuscatedName("client.hc")
    public static int field1024 = 0;

    @ObfuscatedName("client.hf")
    public static int field1025 = 0;

    @ObfuscatedName("client.hs")
    public static int field1026 = 50;

    @ObfuscatedName("client.hg")
    public static int[] field1027 = new int[field1026];

    @ObfuscatedName("client.ho")
    public static int[] field1202 = new int[field1026];

    @ObfuscatedName("client.hv")
    public static int[] field1119 = new int[field1026];

    @ObfuscatedName("client.hx")
    public static int[] field1030 = new int[field1026];

    @ObfuscatedName("client.hi")
    public static int[] field1031 = new int[field1026];

    @ObfuscatedName("client.hb")
    public static int[] field1032 = new int[field1026];

    @ObfuscatedName("client.hp")
    public static int[] field1033 = new int[field1026];

    @ObfuscatedName("client.hw")
    public static String[] field994 = new String[field1026];

    @ObfuscatedName("client.hm")
    public static int[][] field1035 = new int[104][104];

    @ObfuscatedName("client.hn")
    public static int field1036 = 0;

    @ObfuscatedName("client.hz")
    public static int field977 = -1;

    @ObfuscatedName("client.hu")
    public static int field1038 = -1;

    @ObfuscatedName("client.hr")
    public static int field1039 = 0;

    @ObfuscatedName("client.hy")
    public static int field996 = 0;

    @ObfuscatedName("client.hq")
    public static int field1041 = 0;

    @ObfuscatedName("client.hk")
    public static int field1042 = 0;

    @ObfuscatedName("client.ha")
    public static int field1043 = 0;

    @ObfuscatedName("client.hj")
    public static int field1044 = 0;

    @ObfuscatedName("client.if")
    public static int field1045 = 0;

    @ObfuscatedName("client.ii")
    public static int field1070 = 0;

    @ObfuscatedName("client.ik")
    public static int field1047 = 0;

    @ObfuscatedName("client.ib")
    public static int field1134 = 0;

    @ObfuscatedName("client.it")
    public static String field1086 = null;

    @ObfuscatedName("client.io")
    public static boolean field1049 = false;

    @ObfuscatedName("client.is")
    public static int field1082 = 0;

    @ObfuscatedName("client.im")
    public static int field1051 = 0;

    @ObfuscatedName("client.ih")
    public static class75[] field1106 = new class75[2048];

    @ObfuscatedName("client.ij")
    public static int field1028 = -1;

    @ObfuscatedName("client.iy")
    public static int field1054 = 0;

    @ObfuscatedName("client.in")
    public static int field1055 = 0;

    @ObfuscatedName("client.ie")
    public static int[] field1056 = new int[1000];

    @ObfuscatedName("client.iw")
    public static final int[] field1057 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.iv")
    public static String[] field1058 = new String[8];

    @ObfuscatedName("client.ip")
    public static boolean[] field1138 = new boolean[8];

    @ObfuscatedName("client.iq")
    public static int[] field1052 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ia")
    public static int field1061 = -1;

    @ObfuscatedName("client.ir")
    public static class195[][][] field1062 = new class195[4][104][104];

    @ObfuscatedName("client.jf")
    public static class195 field1063 = new class195();

    @ObfuscatedName("client.jw")
    public static class195 field1040 = new class195();

    @ObfuscatedName("client.jz")
    public static class195 field1065 = new class195();

    @ObfuscatedName("client.jt")
    public static int[] field1096 = new int[25];

    @ObfuscatedName("client.jm")
    public static int[] field1067 = new int[25];

    @ObfuscatedName("client.jh")
    public static int[] field1068 = new int[25];

    @ObfuscatedName("client.jo")
    public static int field1069 = 0;

    @ObfuscatedName("client.jg")
    public static boolean field987 = false;

    @ObfuscatedName("client.jl")
    public static int field1071 = 0;

    @ObfuscatedName("client.jj")
    public static int[] field1188 = new int[500];

    @ObfuscatedName("client.jr")
    public static int[] field949 = new int[500];

    @ObfuscatedName("client.jv")
    public static int[] field1114 = new int[500];

    @ObfuscatedName("client.jn")
    public static int[] field1075 = new int[500];

    @ObfuscatedName("client.jk")
    public static String[] field1076 = new String[500];

    @ObfuscatedName("client.jd")
    public static String[] field1171 = new String[500];

    @ObfuscatedName("client.ji")
    public static boolean[] field1078 = new boolean[500];

    @ObfuscatedName("client.jb")
    public static boolean field1048 = false;

    @ObfuscatedName("client.jc")
    public static boolean field970 = false;

    @ObfuscatedName("client.js")
    public static int field1081 = -1;

    @ObfuscatedName("client.jx")
    public static int field1127 = -1;

    @ObfuscatedName("client.kr")
    public static int field974 = 0;

    @ObfuscatedName("client.ky")
    public static int field1084 = 50;

    @ObfuscatedName("client.kb")
    public static int field1137 = 0;

    @ObfuscatedName("client.kn")
    public static boolean field1064 = false;

    @ObfuscatedName("client.kg")
    public static int field1088 = -1;

    @ObfuscatedName("client.kq")
    public static int field1017 = -1;

    @ObfuscatedName("client.ku")
    public static String field1090 = null;

    @ObfuscatedName("client.kk")
    public static String field1091 = null;

    @ObfuscatedName("client.kt")
    public static int field1092 = -1;

    @ObfuscatedName("client.kc")
    public static class192 field1093 = new class192(8);

    @ObfuscatedName("client.ko")
    public static int field1094 = 0;

    @ObfuscatedName("client.ks")
    public static int field1145 = 0;

    @ObfuscatedName("client.ka")
    public static class218 field1087 = null;

    @ObfuscatedName("client.kz")
    public static int field1050 = 0;

    @ObfuscatedName("client.kl")
    public static int field972 = 0;

    @ObfuscatedName("client.kp")
    public static int field1099 = 0;

    @ObfuscatedName("client.kx")
    public static int field1100 = -1;

    @ObfuscatedName("client.kh")
    public static boolean field953 = false;

    @ObfuscatedName("client.ke")
    public static boolean field1102 = false;

    @ObfuscatedName("client.km")
    public static boolean field1103 = false;

    @ObfuscatedName("client.lb")
    public static class218 field1104 = null;

    @ObfuscatedName("client.lg")
    public static class218 field1112 = null;

    @ObfuscatedName("client.lo")
    public static class218 field1046 = null;

    @ObfuscatedName("client.lc")
    public static int field1107 = 0;

    @ObfuscatedName("client.li")
    public static int field1108 = 0;

    @ObfuscatedName("client.lm")
    public static class218 field1109 = null;

    @ObfuscatedName("client.lq")
    public static boolean field1210 = false;

    @ObfuscatedName("client.ly")
    public static int field1012 = -1;

    @ObfuscatedName("client.ll")
    public static int field1183 = -1;

    @ObfuscatedName("client.ls")
    public static boolean field1113 = false;

    @ObfuscatedName("client.ln")
    public static int field1128 = -1;

    @ObfuscatedName("client.lu")
    public static int field1115 = -1;

    @ObfuscatedName("client.lt")
    public static boolean field1116 = false;

    @ObfuscatedName("client.lr")
    public static int field1167 = 1;

    @ObfuscatedName("client.lz")
    public static int[] field1023 = new int[32];

    @ObfuscatedName("client.lv")
    public static int field982 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field1120 = new int[32];

    @ObfuscatedName("client.lx")
    public static int field1121 = 0;

    @ObfuscatedName("client.la")
    public static int[] field1122 = new int[32];

    @ObfuscatedName("client.lf")
    public static int field1123 = 0;

    @ObfuscatedName("client.mm")
    public static int field1124 = 0;

    @ObfuscatedName("client.mc")
    public static int field1125 = 0;

    @ObfuscatedName("client.mt")
    public static int field1126 = 0;

    @ObfuscatedName("client.me")
    public static int field975 = 0;

    @ObfuscatedName("client.mx")
    public static int field1117 = 0;

    @ObfuscatedName("client.mp")
    public static int field1147 = 0;

    @ObfuscatedName("client.mk")
    public static int field1130 = 0;

    @ObfuscatedName("client.mn")
    public static class195 field1131 = new class195();

    @ObfuscatedName("client.ml")
    public static class195 field1001 = new class195();

    @ObfuscatedName("client.my")
    public static class195 field1133 = new class195();

    @ObfuscatedName("client.mj")
    public static class192 field951 = new class192(512);

    @ObfuscatedName("client.mb")
    public static int field1066 = 0;

    @ObfuscatedName("client.ms")
    public static int field1072 = -2;

    @ObfuscatedName("client.ma")
    public static boolean[] field1111 = new boolean[100];

    @ObfuscatedName("client.mz")
    public static boolean[] field967 = new boolean[100];

    @ObfuscatedName("client.mr")
    public static boolean[] field1139 = new boolean[100];

    @ObfuscatedName("client.mu")
    public static int[] field1140 = new int[100];

    @ObfuscatedName("client.mq")
    public static int[] field1010 = new int[100];

    @ObfuscatedName("client.mh")
    public static int[] field1142 = new int[100];

    @ObfuscatedName("client.mg")
    public static int[] field1143 = new int[100];

    @ObfuscatedName("client.mv")
    public static int field1144 = 0;

    @ObfuscatedName("client.mw")
    public static long field1105 = 0L;

    @ObfuscatedName("client.mf")
    public static boolean field1197 = true;

    @ObfuscatedName("client.ng")
    public static int[] field1148 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ny")
    public static int field1149 = 0;

    @ObfuscatedName("client.nz")
    public static int field1150 = 0;

    @ObfuscatedName("client.nb")
    public static String field1151 = "";

    @ObfuscatedName("client.nr")
    public static long[] field1152 = new long[100];

    @ObfuscatedName("client.ns")
    public static int field1153 = 0;

    @ObfuscatedName("client.nh")
    public static int field1154 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field1155 = new int[128];

    @ObfuscatedName("client.nk")
    public static int[] field1132 = new int[128];

    @ObfuscatedName("client.nx")
    public static long field1157 = -1L;

    @ObfuscatedName("client.np")
    public static String field1158 = null;

    @ObfuscatedName("client.nf")
    public static String field1159 = null;

    @ObfuscatedName("client.nn")
    public static int field1160 = -1;

    @ObfuscatedName("client.ox")
    public static int field1161 = 0;

    @ObfuscatedName("client.oe")
    public static int[] field1162 = new int[1000];

    @ObfuscatedName("client.oc")
    public static int[] field1163 = new int[1000];

    @ObfuscatedName("client.og")
    public static class287[] field1164 = new class287[1000];

    @ObfuscatedName("client.oq")
    public static int field1165 = 0;

    @ObfuscatedName("client.oi")
    public static int field1166 = 0;

    @ObfuscatedName("client.oh")
    public static int field1080 = 0;

    @ObfuscatedName("client.ot")
    public static int field1168 = 255;

    @ObfuscatedName("client.od")
    public static int field1169 = -1;

    @ObfuscatedName("client.op")
    public static boolean field1170 = false;

    @ObfuscatedName("client.ok")
    public static int field1186 = 127;

    @ObfuscatedName("client.oy")
    public static int field1172 = 127;

    @ObfuscatedName("client.or")
    public static int field1173 = 0;

    @ObfuscatedName("client.oa")
    public static int[] field1174 = new int[50];

    @ObfuscatedName("client.ov")
    public static int[] field1175 = new int[50];

    @ObfuscatedName("client.pa")
    public static int[] field1002 = new int[50];

    @ObfuscatedName("client.pi")
    public static int[] field1177 = new int[50];

    @ObfuscatedName("client.pb")
    public static class105[] field1178 = new class105[50];

    @ObfuscatedName("client.pz")
    public static boolean field1179 = false;

    @ObfuscatedName("client.pk")
    public static boolean[] field1180 = new boolean[5];

    @ObfuscatedName("client.pe")
    public static int[] field1181 = new int[5];

    @ObfuscatedName("client.pr")
    public static int[] field1182 = new int[5];

    @ObfuscatedName("client.pn")
    public static int[] field1146 = new int[5];

    @ObfuscatedName("client.pj")
    public static int[] field1184 = new int[5];

    @ObfuscatedName("client.po")
    public static short field1185 = 256;

    @ObfuscatedName("client.pv")
    public static short field1098 = 205;

    @ObfuscatedName("client.pu")
    public static short field1187 = 256;

    @ObfuscatedName("client.pw")
    public static short field1053 = 320;

    @ObfuscatedName("client.ps")
    public static short field1189 = 1;

    @ObfuscatedName("client.qk")
    public static short field1190 = 32767;

    @ObfuscatedName("client.qj")
    public static short field1191 = 1;

    @ObfuscatedName("client.ql")
    public static short field1192 = 32767;

    @ObfuscatedName("client.qs")
    public static int field1193 = 0;

    @ObfuscatedName("client.qa")
    public static int field1194 = 0;

    @ObfuscatedName("client.qv")
    public static int field1195 = 0;

    @ObfuscatedName("client.qt")
    public static int field1196 = 0;

    @ObfuscatedName("client.qx")
    public static int field1141 = 0;

    @ObfuscatedName("client.qy")
    public static int field1198 = 0;

    @ObfuscatedName("client.qq")
    public static int field1199 = 0;

    @ObfuscatedName("client.qb")
    public static class66[] field1073 = new class66[400];

    @ObfuscatedName("client.qw")
    public static class197 field1201 = new class197();

    @ObfuscatedName("client.qp")
    public static int field962 = 0;

    @ObfuscatedName("client.qm")
    public static class71[] field1203 = new class71[400];

    @ObfuscatedName("client.qo")
    public static class215 field1079 = new class215();

    @ObfuscatedName("client.qn")
    public static int field1205 = -1;

    @ObfuscatedName("client.qz")
    public static int field1206 = -1;

    @ObfuscatedName("client.qe")
    public static class17[] field1015 = new class17[8];

    @ObfuscatedName("client.rj")
    public static final class74 field964 = new class74();

    @ObfuscatedName("client.rp")
    public static int[] field1209 = new int[50];

    @ObfuscatedName("client.rd")
    public static int[] field1204 = new int[50];

    @ObfuscatedName("ap.eq(B)Lkr;")
    public static class290 method658() {
        return Statics.field666;
    }

    @ObfuscatedName("client.af(I)V")
    public final void method881() {
    }

    public final void init() {
        if (!this.method780()) {
            return;
        }
        class276[] var1 = class276.method1017();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class276 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3732);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3732)) {
                    case 1:
                        field944 = Integer.parseInt(var4);
                    case 2:
                    case 7:
                    default:
                        break;
                    case 3:
                        class234[] var5 = new class234[] { class234.field3193, class234.field3198, class234.field3195, class234.field3196, class234.field3202, class234.field3192 };
                        Statics.field696 = (class234) class170.method1570(var5, Integer.parseInt(var4));
                        if (Statics.field696 == class234.field3198) {
                            Statics.field244 = class291.field3860;
                        } else {
                            Statics.field244 = class291.field3861;
                        }
                        break;
                    case 4:
                        field942 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field322 = var4;
                        break;
                    case 6:
                        Statics.field378 = var4;
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class88.field1400)) {
                        }
                        break;
                    case 9:
                        field943 = Integer.parseInt(var4);
                        break;
                    case 10:
                        if (var4.equalsIgnoreCase(class88.field1400)) {
                            field945 = true;
                        } else {
                            field945 = false;
                        }
                        break;
                    case 11:
                        Statics.field1672 = class233.method3808(Integer.parseInt(var4));
                        break;
                    case 12:
                        Statics.field757 = Integer.parseInt(var4);
                        break;
                    case 13:
                        Statics.field252 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field950 = Integer.parseInt(var4);
                }
            }
        }
        class139.field2121 = false;
        field941 = false;
        Statics.field358 = this.getCodeBase().getHost();
        String var6 = Statics.field1672.field3189;
        byte var7 = 0;
        try {
            Statics.field3757 = 17;
            Statics.field552 = var7;
            try {
                Statics.field1773 = System.getProperty("os.name");
            } catch (Exception var52) {
                Statics.field1773 = "Unknown";
            }
            Statics.field3720 = Statics.field1773.toLowerCase();
            try {
                Statics.field2258 = System.getProperty("user.home");
                if (Statics.field2258 != null) {
                    Statics.field2258 = Statics.field2258 + "/";
                }
            } catch (Exception var51) {
            }
            try {
                if (Statics.field3720.startsWith("win")) {
                    if (Statics.field2258 == null) {
                        Statics.field2258 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2258 == null) {
                    Statics.field2258 = System.getenv("HOME");
                }
                if (Statics.field2258 != null) {
                    Statics.field2258 = Statics.field2258 + "/";
                }
            } catch (Exception var50) {
            }
            if (Statics.field2258 == null) {
                Statics.field2258 = "~/";
            }
            Statics.field2125 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2258, "/tmp/", "" };
            Statics.field2324 = new String[] { ".jagex_cache_" + Statics.field552, ".file_store_" + Statics.field552 };
            int var11 = 0;
            label259: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field2610 = new File(Statics.field2258, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field2610.exists()) {
                    try {
                        class124 var16 = new class124(Statics.field2610, "rw", 10000L);
                        class175 var17 = new class175((int) var16.method2165());
                        while (var17.field2395 < var17.field2392.length) {
                            int var18 = var16.method2166(var17.field2392, var17.field2395, var17.field2392.length - var17.field2395);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field2395 += var18;
                        }
                        var17.field2395 = 0;
                        int var19 = var17.method2999();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method2999();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method3003();
                            if (var20 == 1) {
                                var14 = var17.method3003();
                            }
                        } else {
                            var13 = var17.method3004();
                            if (var20 == 1) {
                                var14 = var17.method3004();
                            }
                        }
                        var16.method2163();
                    } catch (IOException var54) {
                        var54.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class157.method1009(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label234: for (int var24 = 0; var24 < Statics.field2324.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field2125.length; var25++) {
                            File var26 = new File(Statics.field2125[var25] + Statics.field2324[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class157.method1009(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label234;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field2258 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var27 = new File(var14);
                    File var28 = new File(var13);
                    try {
                        File[] var29 = var27.listFiles();
                        File[] var30 = var29;
                        for (int var31 = 0; var31 < var30.length; var31++) {
                            File var32 = var30[var31];
                            File var33 = new File(var28, var32.getName());
                            boolean var34 = var32.renameTo(var33);
                            if (!var34) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var53) {
                        var53.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    File var36 = new File(var13);
                    Object var37 = null;
                    try {
                        class124 var38 = new class124(Statics.field2610, "rw", 10000L);
                        class175 var39 = new class175(500);
                        var39.method3102(3);
                        var39.method3102(var37 == null ? 0 : 1);
                        var39.method2986(var36.getPath());
                        if (var37 != null) {
                            var39.method2986(((File) var37).getPath());
                        }
                        var38.method2162(var39.field2392, 0, var39.field2395);
                        var38.method2163();
                    } catch (IOException var49) {
                        var49.printStackTrace();
                    }
                }
                File var41 = new File(var13);
                Statics.field613 = var41;
                if (!Statics.field613.exists()) {
                    Statics.field613.mkdirs();
                }
                File[] var42 = Statics.field613.listFiles();
                if (var42 == null) {
                    break;
                }
                File[] var43 = var42;
                int var44 = 0;
                while (true) {
                    if (var44 >= var43.length) {
                        break label259;
                    }
                    File var45 = var43[var44];
                    if (!class157.method1009(var45, false)) {
                        var11++;
                        break;
                    }
                    var44++;
                }
            }
            File var46 = Statics.field613;
            Statics.field2266 = var46;
            if (!Statics.field2266.exists()) {
                throw new RuntimeException("");
            }
            class159.field2261 = true;
            class157.method1000();
            class157.field2251 = new class123(new class124(class159.method256("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class157.field2256 = new class123(new class124(class159.method256("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field686 = new class123[Statics.field3757];
            for (int var47 = 0; var47 < Statics.field3757; var47++) {
                Statics.field686[var47] = new class123(new class124(class159.method256("main_file_cache.idx" + var47), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var55) {
            class154.method2746((String) null, var55);
        }
        Statics.field1402 = this;
        this.method785(765, 503, 154);
    }

    @ObfuscatedName("client.az(I)V")
    public final void method883() {
        Statics.field3629 = field944 == 0 ? 43594 : field942 + 40000;
        Statics.field473 = field944 == 0 ? 443 : field942 + 50000;
        Statics.field1679 = Statics.field3629;
        Statics.field248 = class216.field2641;
        Statics.field2629 = class216.field2639;
        Statics.field799 = class216.field2640;
        Statics.field2630 = class216.field2643;
        Statics.field265 = new class149();
        this.method908();
        this.method849();
        Statics.field778 = this.method777();
        Statics.field3152 = new class162(255, class157.field2251, class157.field2256, 500000);
        Statics.field2396 = class81.method1();
        this.method842();
        class57.method3815(this, Statics.field889);
        if (field944 != 0) {
            field1029 = true;
        }
        int var1 = Statics.field2396.field1322;
        field1105 = 0L;
        if (var1 >= 2) {
            field1197 = true;
        } else {
            field1197 = false;
        }
        if (method530() == 1) {
            Statics.field1402.method775(765, 503);
        } else {
            Statics.field1402.method775(7680, 2160);
        }
        if (field948 >= 25) {
            method131();
        }
    }

    @ObfuscatedName("client.ac(I)V")
    public final void method817() {
        field973++;
        this.method1062();
        while (true) {
            class195 var1 = class238.field3244;
            class235 var2;
            synchronized (class238.field3244) {
                var2 = (class235) class238.field3236.method3408();
            }
            if (var2 == null) {
                try {
                    if (class205.field2508 == 1) {
                        int var4 = Statics.field2857.method3504();
                        if (var4 > 0 && Statics.field2857.method3552()) {
                            int var5 = var4 - Statics.field1695;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2857.method3529(var5);
                        } else {
                            Statics.field2857.method3508();
                            Statics.field2857.method3507();
                            if (Statics.field2509 == null) {
                                class205.field2508 = 0;
                            } else {
                                class205.field2508 = 2;
                            }
                            Statics.field2621 = null;
                            Statics.field2512 = null;
                        }
                    }
                } catch (Exception var149) {
                    var149.printStackTrace();
                    Statics.field2857.method3508();
                    class205.field2508 = 0;
                    Statics.field2621 = null;
                    Statics.field2512 = null;
                    Statics.field2509 = null;
                }
                method226();
                class51.method1180();
                class60.method650();
                if (Statics.field778 != null) {
                    int var7 = Statics.field778.method670();
                    field1130 = var7;
                }
                if (field948 == 0) {
                    method3267();
                    Statics.field711.method2749();
                    for (int var8 = 0; var8 < 32; var8++) {
                        field712[var8] = 0L;
                    }
                    for (int var9 = 0; var9 < 32; var9++) {
                        field707[var9] = 0L;
                    }
                    Statics.field306 = 0;
                } else if (field948 == 5) {
                    class92.method3803(this);
                    method3267();
                    Statics.field711.method2749();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field712[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field707[var11] = 0L;
                    }
                    Statics.field306 = 0;
                } else if (field948 == 10 || field948 == 11) {
                    class92.method3803(this);
                } else if (field948 == 20) {
                    class92.method3803(this);
                    this.method1065();
                } else if (field948 == 25) {
                    method703(false);
                    field999 = 0;
                    boolean var12 = true;
                    for (int var13 = 0; var13 < Statics.field1794.length; var13++) {
                        if (Statics.field870[var13] != -1 && Statics.field1794[var13] == null) {
                            Statics.field1794[var13] = Statics.field679.method3824(Statics.field870[var13], 0);
                            if (Statics.field1794[var13] == null) {
                                var12 = false;
                                field999++;
                            }
                        }
                        if (Statics.field2408[var13] != -1 && Statics.field851[var13] == null) {
                            Statics.field851[var13] = Statics.field679.method3825(Statics.field2408[var13], 0, Statics.field738[var13]);
                            if (Statics.field851[var13] == null) {
                                var12 = false;
                                field999++;
                            }
                        }
                    }
                    if (var12) {
                        field1034 = 0;
                        boolean var14 = true;
                        for (int var15 = 0; var15 < Statics.field1794.length; var15++) {
                            byte[] var16 = Statics.field851[var15];
                            if (var16 != null) {
                                int var17 = (Statics.field521[var15] >> 8) * 64 - Statics.field2202;
                                int var18 = (Statics.field521[var15] & 0xFF) * 64 - Statics.field840;
                                if (field1005) {
                                    var17 = 10;
                                    var18 = 10;
                                }
                                var14 &= class62.method1722(var16, var17, var18);
                            }
                        }
                        if (var14) {
                            if (field1003 != 0) {
                                method988(class227.field2869 + class88.field1403 + class88.field1397 + 100 + "%" + class88.field1398, true);
                            }
                            method226();
                            method158();
                            method226();
                            Statics.field785.method2507();
                            method226();
                            System.gc();
                            for (int var19 = 0; var19 < 4; var19++) {
                                field1004[var19].method2851();
                            }
                            for (int var20 = 0; var20 < 4; var20++) {
                                for (int var21 = 0; var21 < 104; var21++) {
                                    for (int var22 = 0; var22 < 104; var22++) {
                                        class62.field764[var20][var21][var22] = 0;
                                    }
                                }
                            }
                            method226();
                            class62.field771 = 99;
                            Statics.field684 = new byte[4][104][104];
                            Statics.field2421 = new byte[4][104][104];
                            Statics.field766 = new byte[4][104][104];
                            Statics.field2642 = new byte[4][104][104];
                            Statics.field301 = new int[4][105][105];
                            Statics.field2019 = new byte[4][105][105];
                            Statics.field774 = new int[105][105];
                            Statics.field1528 = new int[104];
                            Statics.field2206 = new int[104];
                            Statics.field402 = new int[104];
                            Statics.field3319 = new int[104];
                            Statics.field770 = new int[104];
                            int var23 = Statics.field1794.length;
                            class82.method3486();
                            method703(true);
                            if (!field1005) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    int var25 = (Statics.field521[var24] >> 8) * 64 - Statics.field2202;
                                    int var26 = (Statics.field521[var24] & 0xFF) * 64 - Statics.field840;
                                    byte[] var27 = Statics.field1794[var24];
                                    if (var27 != null) {
                                        method226();
                                        class62.method551(var27, var25, var26, Statics.field408 * 8 - 48, Statics.field304 * 8 - 48, field1004);
                                    }
                                }
                                for (int var28 = 0; var28 < var23; var28++) {
                                    int var29 = (Statics.field521[var28] >> 8) * 64 - Statics.field2202;
                                    int var30 = (Statics.field521[var28] & 0xFF) * 64 - Statics.field840;
                                    byte[] var31 = Statics.field1794[var28];
                                    if (var31 == null && Statics.field304 < 800) {
                                        method226();
                                        class62.method1572(var29, var30, 64, 64);
                                    }
                                }
                                method703(true);
                                for (int var32 = 0; var32 < var23; var32++) {
                                    byte[] var33 = Statics.field851[var32];
                                    if (var33 != null) {
                                        int var34 = (Statics.field521[var32] >> 8) * 64 - Statics.field2202;
                                        int var35 = (Statics.field521[var32] & 0xFF) * 64 - Statics.field840;
                                        method226();
                                        class139 var36 = Statics.field785;
                                        class163[] var37 = field1004;
                                        class175 var38 = new class175(var33);
                                        int var39 = -1;
                                        while (true) {
                                            int var40 = var38.method3007();
                                            if (var40 == 0) {
                                                break;
                                            }
                                            var39 += var40;
                                            int var41 = 0;
                                            while (true) {
                                                int var42 = var38.method3007();
                                                if (var42 == 0) {
                                                    break;
                                                }
                                                var41 += var42 - 1;
                                                int var43 = var41 & 0x3F;
                                                int var44 = var41 >> 6 & 0x3F;
                                                int var45 = var41 >> 12;
                                                int var46 = var38.method2999();
                                                int var47 = var46 >> 2;
                                                int var48 = var46 & 0x3;
                                                int var49 = var34 + var44;
                                                int var50 = var35 + var43;
                                                if (var49 > 0 && var50 > 0 && var49 < 103 && var50 < 103) {
                                                    int var51 = var45;
                                                    if ((class62.field764[1][var49][var50] & 0x2) == 2) {
                                                        var51 = var45 - 1;
                                                    }
                                                    class163 var52 = null;
                                                    if (var51 >= 0) {
                                                        var52 = var37[var51];
                                                    }
                                                    class62.method4045(var45, var49, var50, var39, var48, var47, var36, var52);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field1005) {
                                int var53 = 0;
                                label563: while (true) {
                                    if (var53 >= 4) {
                                        for (int var91 = 0; var91 < 13; var91++) {
                                            for (int var92 = 0; var92 < 13; var92++) {
                                                int var93 = field1006[0][var91][var92];
                                                if (var93 == -1) {
                                                    class62.method1572(var91 * 8, var92 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method703(true);
                                        int var94 = 0;
                                        while (true) {
                                            if (var94 >= 4) {
                                                break label563;
                                            }
                                            method226();
                                            for (int var95 = 0; var95 < 13; var95++) {
                                                label452: for (int var96 = 0; var96 < 13; var96++) {
                                                    int var97 = field1006[var94][var95][var96];
                                                    if (var97 != -1) {
                                                        int var98 = var97 >> 24 & 0x3;
                                                        int var99 = var97 >> 1 & 0x3;
                                                        int var100 = var97 >> 14 & 0x3FF;
                                                        int var101 = var97 >> 3 & 0x7FF;
                                                        int var102 = (var100 / 8 << 8) + var101 / 8;
                                                        for (int var103 = 0; var103 < Statics.field521.length; var103++) {
                                                            if (Statics.field521[var103] == var102 && Statics.field851[var103] != null) {
                                                                byte[] var104 = Statics.field851[var103];
                                                                int var105 = var95 * 8;
                                                                int var106 = var96 * 8;
                                                                int var107 = (var100 & 0x7) * 8;
                                                                int var108 = (var101 & 0x7) * 8;
                                                                class139 var109 = Statics.field785;
                                                                class163[] var110 = field1004;
                                                                class175 var111 = new class175(var104);
                                                                int var112 = -1;
                                                                while (true) {
                                                                    int var113 = var111.method3007();
                                                                    if (var113 == 0) {
                                                                        continue label452;
                                                                    }
                                                                    var112 += var113;
                                                                    int var114 = 0;
                                                                    while (true) {
                                                                        int var115 = var111.method3007();
                                                                        if (var115 == 0) {
                                                                            break;
                                                                        }
                                                                        var114 += var115 - 1;
                                                                        int var116 = var114 & 0x3F;
                                                                        int var117 = var114 >> 6 & 0x3F;
                                                                        int var118 = var114 >> 12;
                                                                        int var119 = var111.method2999();
                                                                        int var120 = var119 >> 2;
                                                                        int var121 = var119 & 0x3;
                                                                        if (var98 == var118 && var117 >= var107 && var117 < var107 + 8 && var116 >= var108 && var116 < var108 + 8) {
                                                                            class257 var122 = class257.method2716(var112);
                                                                            int var124 = var117 & 0x7;
                                                                            int var125 = var116 & 0x7;
                                                                            int var127 = var122.field3450;
                                                                            int var128 = var122.field3451;
                                                                            if ((var121 & 0x1) == 1) {
                                                                                int var129 = var127;
                                                                                var127 = var128;
                                                                                var128 = var129;
                                                                            }
                                                                            int var130 = var99 & 0x3;
                                                                            int var131;
                                                                            if (var130 == 0) {
                                                                                var131 = var124;
                                                                            } else if (var130 == 1) {
                                                                                var131 = var125;
                                                                            } else if (var130 == 2) {
                                                                                var131 = 7 - var124 - (var127 - 1);
                                                                            } else {
                                                                                var131 = 7 - var125 - (var128 - 1);
                                                                            }
                                                                            int var132 = var105 + var131;
                                                                            int var133 = var106 + class217.method3992(var117 & 0x7, var116 & 0x7, var99, var122.field3450, var122.field3451, var121);
                                                                            if (var132 > 0 && var133 > 0 && var132 < 103 && var133 < 103) {
                                                                                int var134 = var94;
                                                                                if ((class62.field764[1][var132][var133] & 0x2) == 2) {
                                                                                    var134 = var94 - 1;
                                                                                }
                                                                                class163 var135 = null;
                                                                                if (var134 >= 0) {
                                                                                    var135 = var110[var134];
                                                                                }
                                                                                class62.method4045(var94, var132, var133, var112, var99 + var121 & 0x3, var120, var109, var135);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var94++;
                                        }
                                    }
                                    method226();
                                    for (int var54 = 0; var54 < 13; var54++) {
                                        for (int var55 = 0; var55 < 13; var55++) {
                                            boolean var56 = false;
                                            int var57 = field1006[var53][var54][var55];
                                            if (var57 != -1) {
                                                int var58 = var57 >> 24 & 0x3;
                                                int var59 = var57 >> 1 & 0x3;
                                                int var60 = var57 >> 14 & 0x3FF;
                                                int var61 = var57 >> 3 & 0x7FF;
                                                int var62 = (var60 / 8 << 8) + var61 / 8;
                                                for (int var63 = 0; var63 < Statics.field521.length; var63++) {
                                                    if (Statics.field521[var63] == var62 && Statics.field1794[var63] != null) {
                                                        byte[] var64 = Statics.field1794[var63];
                                                        int var65 = var54 * 8;
                                                        int var66 = var55 * 8;
                                                        int var67 = (var60 & 0x7) * 8;
                                                        int var68 = (var61 & 0x7) * 8;
                                                        class163[] var69 = field1004;
                                                        for (int var70 = 0; var70 < 8; var70++) {
                                                            for (int var71 = 0; var71 < 8; var71++) {
                                                                if (var65 + var70 > 0 && var65 + var70 < 103 && var66 + var71 > 0 && var66 + var71 < 103) {
                                                                    var69[var53].field2303[var65 + var70][var66 + var71] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class175 var72 = new class175(var64);
                                                        for (int var73 = 0; var73 < 4; var73++) {
                                                            for (int var74 = 0; var74 < 64; var74++) {
                                                                for (int var75 = 0; var75 < 64; var75++) {
                                                                    if (var58 == var73 && var74 >= var67 && var74 < var67 + 8 && var75 >= var68 && var75 < var68 + 8) {
                                                                        int var79 = var74 & 0x7;
                                                                        int var80 = var75 & 0x7;
                                                                        int var82 = var59 & 0x3;
                                                                        int var83;
                                                                        if (var82 == 0) {
                                                                            var83 = var79;
                                                                        } else if (var82 == 1) {
                                                                            var83 = var80;
                                                                        } else if (var82 == 2) {
                                                                            var83 = 7 - var79;
                                                                        } else {
                                                                            var83 = 7 - var80;
                                                                        }
                                                                        class62.method48(var72, var53, var65 + var83, var66 + class217.method1860(var74 & 0x7, var75 & 0x7, var59), 0, 0, var59);
                                                                    } else {
                                                                        class62.method48(var72, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var56 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var56) {
                                                int var84 = var53;
                                                int var85 = var54 * 8;
                                                int var86 = var55 * 8;
                                                for (int var87 = 0; var87 < 8; var87++) {
                                                    for (int var88 = 0; var88 < 8; var88++) {
                                                        class62.field768[var84][var85 + var87][var86 + var88] = 0;
                                                    }
                                                }
                                                if (var85 > 0) {
                                                    for (int var89 = 1; var89 < 8; var89++) {
                                                        class62.field768[var84][var85][var86 + var89] = class62.field768[var84][var85 - 1][var86 + var89];
                                                    }
                                                }
                                                if (var86 > 0) {
                                                    for (int var90 = 1; var90 < 8; var90++) {
                                                        class62.field768[var84][var85 + var90][var86] = class62.field768[var84][var85 + var90][var86 - 1];
                                                    }
                                                }
                                                if (var85 > 0 && class62.field768[var84][var85 - 1][var86] != 0) {
                                                    class62.field768[var84][var85][var86] = class62.field768[var84][var85 - 1][var86];
                                                } else if (var86 > 0 && class62.field768[var84][var85][var86 - 1] != 0) {
                                                    class62.field768[var84][var85][var86] = class62.field768[var84][var85][var86 - 1];
                                                } else if (var85 > 0 && var86 > 0 && class62.field768[var84][var85 - 1][var86 - 1] != 0) {
                                                    class62.field768[var84][var85][var86] = class62.field768[var84][var85 - 1][var86 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var53++;
                                }
                            }
                            method703(true);
                            method158();
                            method226();
                            class62.method30(Statics.field785, field1004);
                            method703(true);
                            int var136 = class62.field771;
                            if (var136 > Statics.field409) {
                                var136 = Statics.field409;
                            }
                            if (var136 < Statics.field409 - 1) {
                                int var137 = Statics.field409 - 1;
                            }
                            if (field941) {
                                Statics.field785.method2508(class62.field771);
                            } else {
                                Statics.field785.method2508(0);
                            }
                            for (int var138 = 0; var138 < 104; var138++) {
                                for (int var139 = 0; var139 < 104; var139++) {
                                    method3500(var138, var139);
                                }
                            }
                            method226();
                            method1047();
                            class257.field3438.method3355();
                            if (Statics.field1402.method809()) {
                                field986.method3243(69);
                                field986.method3136(1057001181);
                            }
                            if (!field1005) {
                                int var140 = (Statics.field408 - 6) / 8;
                                int var141 = (Statics.field408 + 6) / 8;
                                int var142 = (Statics.field304 - 6) / 8;
                                int var143 = (Statics.field304 + 6) / 8;
                                for (int var144 = var140 - 1; var144 <= var141 + 1; var144++) {
                                    for (int var145 = var142 - 1; var145 <= var143 + 1; var145++) {
                                        if (var144 < var140 || var144 > var141 || var145 < var142 || var145 > var143) {
                                            Statics.field679.method3846("m" + var144 + "_" + var145);
                                            Statics.field679.method3846("l" + var144 + "_" + var145);
                                        }
                                    }
                                }
                            }
                            method492(30);
                            method226();
                            Statics.field684 = (byte[][][]) null;
                            Statics.field2421 = (byte[][][]) null;
                            Statics.field766 = (byte[][][]) null;
                            Statics.field2642 = (byte[][][]) null;
                            Statics.field301 = (int[][][]) null;
                            Statics.field2019 = (byte[][][]) null;
                            Statics.field774 = (int[][]) null;
                            Statics.field1528 = null;
                            Statics.field2206 = null;
                            Statics.field402 = null;
                            Statics.field3319 = null;
                            Statics.field770 = null;
                            field986.method3243(241);
                            Statics.field711.method2749();
                            for (int var146 = 0; var146 < 32; var146++) {
                                field712[var146] = 0L;
                            }
                            for (int var147 = 0; var147 < 32; var147++) {
                                field707[var147] = 0L;
                            }
                            Statics.field306 = 0;
                        } else {
                            field1003 = 2;
                        }
                    } else {
                        field1003 = 1;
                    }
                }
                if (field948 == 30) {
                    this.method1214();
                } else if (field948 == 40 || field948 == 45) {
                    this.method1065();
                }
                return;
            }
            var2.field3204.method3921(var2.field3205, (int) var2.field2475, var2.field3207, false);
        }
    }

    @ObfuscatedName("client.aa(ZI)V")
    public final void method844(boolean arg0) {
        boolean var2 = class205.method67();
        if (var2 && field1170 && Statics.field1774 != null) {
            Statics.field1774.method1854();
        }
        if ((field948 == 10 || field948 == 20 || field948 == 30) && field1105 != 0L && class177.method608() > field1105) {
            int var3 = method530();
            field1105 = 0L;
            if (var3 >= 2) {
                field1197 = true;
            } else {
                field1197 = false;
            }
            if (method530() == 1) {
                Statics.field1402.method775(765, 503);
            } else {
                Statics.field1402.method775(7680, 2160);
            }
            if (field948 >= 25) {
                method131();
            }
        }
        if (arg0) {
            for (int var4 = 0; var4 < 100; var4++) {
                field1111[var4] = true;
            }
        }
        if (field948 == 0) {
            this.method795(class92.field1461, class92.field1450, arg0);
        } else if (field948 == 5) {
            class92.method1900(Statics.field898, Statics.field448, Statics.field538, arg0);
        } else if (field948 == 10 || field948 == 11) {
            class92.method1900(Statics.field898, Statics.field448, Statics.field538, arg0);
        } else if (field948 == 20) {
            class92.method1900(Statics.field898, Statics.field448, Statics.field538, arg0);
        } else if (field948 == 25) {
            if (field1003 == 1) {
                if (field999 > field1000) {
                    field1000 = field999;
                }
                int var5 = (field1000 * 50 - field999 * 50) / field1000;
                method988(class227.field2869 + class88.field1403 + class88.field1397 + var5 + "%" + class88.field1398, false);
            } else if (field1003 == 2) {
                if (field1034 > field1129) {
                    field1129 = field1034;
                }
                int var6 = (field1129 * 50 - field1034 * 50) / field1129 + 50;
                method988(class227.field2869 + class88.field1403 + class88.field1397 + var6 + "%" + class88.field1398, false);
            } else {
                method988(class227.field2869, false);
            }
        } else if (field948 == 30) {
            this.method1057();
        } else if (field948 == 40) {
            method988(class227.field2870 + class88.field1403 + class227.field2871, false);
        } else if (field948 == 45) {
            method988(class227.field3111, false);
        }
        if (field948 == 30 && field1144 == 0 && !arg0 && !field1197) {
            for (int var7 = 0; var7 < field1066; var7++) {
                if (field967[var7]) {
                    Statics.field343.method758(field1140[var7], field1010[var7], field1142[var7], field1143[var7]);
                    field967[var7] = false;
                }
            }
        } else if (field948 > 0) {
            Statics.field343.method760(0, 0);
            for (int var8 = 0; var8 < field1066; var8++) {
                field967[var8] = false;
            }
        }
    }

    @ObfuscatedName("client.aj(I)V")
    public final void method804() {
        if (Statics.field17.method1673()) {
            Statics.field17.method1664();
        }
        if (Statics.field971 != null) {
            Statics.field971.field882 = false;
        }
        Statics.field971 = null;
        if (Statics.field869 != null) {
            Statics.field869.method2810();
            Statics.field869 = null;
        }
        Statics.method2293();
        if (class60.field744 != null) {
            class60 var1 = class60.field744;
            synchronized (class60.field744) {
                class60.field744 = null;
            }
        }
        Statics.field778 = null;
        if (Statics.field1774 != null) {
            Statics.field1774.method1862();
        }
        if (Statics.field249 != null) {
            Statics.field249.method1862();
        }
        class240.method3802();
        Object var3 = class238.field3240;
        synchronized (class238.field3240) {
            if (class238.field3238 != 0) {
                class238.field3238 = 1;
                try {
                    class238.field3240.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field265 != null) {
            Statics.field265.method2721();
            Statics.field265 = null;
        }
        try {
            class157.field2251.method2129();
            for (int var6 = 0; var6 < Statics.field3757; var6++) {
                Statics.field686[var6].method2129();
            }
            class157.field2256.method2129();
            class157.field2254.method2129();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("aj.ev(II)V")
    public static void method492(int arg0) {
        if (field948 == arg0) {
            return;
        }
        if (field948 == 0) {
            Statics.field1402.method805();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field1118 = 0;
            field976 = 0;
            field1176 = 0;
            if (arg0 != 20) {
                method1477(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2566 != null) {
            Statics.field2566.method2810();
            Statics.field2566 = null;
        }
        if (field948 == 25) {
            field1003 = 0;
            field999 = 0;
            field1000 = 1;
            field1034 = 0;
            field1129 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class92.method1609(Statics.field3284, Statics.field307, true, 0);
        } else if (arg0 == 20) {
            class92.method1609(Statics.field3284, Statics.field307, true, field948 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class92.method1609(Statics.field3284, Statics.field307, false, 4);
        } else if (Statics.field1444) {
            Statics.field1465 = null;
            Statics.field318 = null;
            Statics.field1438 = null;
            Statics.field337 = null;
            Statics.field1406 = null;
            Statics.field586 = null;
            Statics.field1437 = null;
            Statics.field3625 = null;
            Statics.field1791 = null;
            Statics.field573 = null;
            Statics.field1550 = null;
            Statics.field384 = null;
            Statics.field896 = null;
            Statics.field447 = null;
            Statics.field1380 = null;
            Statics.field2847 = null;
            Statics.field533 = null;
            Statics.field1341 = null;
            Statics.field1342 = null;
            Statics.field336 = null;
            Statics.field2616 = null;
            Statics.field38 = null;
            class205.method2963(2);
            class240.method146(true);
            Statics.field1444 = false;
        }
        field948 = arg0;
    }

    @ObfuscatedName("client.en(I)V")
    public void method1062() {
        if (field948 == 1000) {
            return;
        }
        long var1 = class177.method608();
        int var3 = (int) (var1 - Statics.field3256);
        Statics.field3256 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class240.field3266 += var3;
        boolean var4;
        if (class240.field3267 == 0 && class240.field3260 == 0 && class240.field3255 == 0 && class240.field3258 == 0) {
            var4 = true;
        } else if (Statics.field3905 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class240.field3266 > 30000) {
                        throw new IOException();
                    }
                    while (class240.field3260 < 20 && class240.field3258 > 0) {
                        class236 var5 = (class236) class240.field3257.method3365();
                        class175 var6 = new class175(4);
                        var6.method3102(1);
                        var6.method3196((int) var5.field2475);
                        Statics.field3905.method2813(var6.field2392, 0, 4);
                        class240.field3274.method3359(var5, var5.field2475);
                        class240.field3258--;
                        class240.field3260++;
                    }
                    while (class240.field3267 < 20 && class240.field3255 > 0) {
                        class236 var7 = (class236) class240.field3259.method3312();
                        class175 var8 = new class175(4);
                        var8.method3102(0);
                        var8.method3196((int) var7.field2475);
                        Statics.field3905.method2813(var8.field2392, 0, 4);
                        var7.method3445();
                        class240.field3264.method3359(var7, var7.field2475);
                        class240.field3255--;
                        class240.field3267++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3905.method2816();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class240.field3266 = 0;
                        byte var11 = 0;
                        if (Statics.field429 == null) {
                            var11 = 8;
                        } else if (class240.field3261 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class240.field3262.field2395;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3905.method2821(class240.field3262.field2392, class240.field3262.field2395, var12);
                            if (class240.field3270 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class240.field3262.field2392[class240.field3262.field2395 + var13] ^= class240.field3270;
                                }
                            }
                            class240.field3262.field2395 += var12;
                            if (class240.field3262.field2395 < var11) {
                                break;
                            }
                            if (Statics.field429 == null) {
                                class240.field3262.field2395 = 0;
                                int var14 = class240.field3262.method2999();
                                int var15 = class240.field3262.method2995();
                                int var16 = class240.field3262.method2999();
                                int var17 = class240.field3262.method2998();
                                long var18 = (long) ((var14 << 16) + var15);
                                class236 var20 = (class236) class240.field3274.method3358(var18);
                                Statics.field1775 = true;
                                if (var20 == null) {
                                    var20 = (class236) class240.field3264.method3358(var18);
                                    Statics.field1775 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field429 = var20;
                                Statics.field3191 = new class175(var17 + var21 + Statics.field429.field3210);
                                Statics.field3191.method3102(var16);
                                Statics.field3191.method3136(var17);
                                class240.field3261 = 8;
                                class240.field3262.field2395 = 0;
                            } else if (class240.field3261 == 0) {
                                if (class240.field3262.field2392[0] == -1) {
                                    class240.field3261 = 1;
                                    class240.field3262.field2395 = 0;
                                } else {
                                    Statics.field429 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3191.field2392.length - Statics.field429.field3210;
                            int var23 = 512 - class240.field3261;
                            if (var23 > var22 - Statics.field3191.field2395) {
                                var23 = var22 - Statics.field3191.field2395;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3905.method2821(Statics.field3191.field2392, Statics.field3191.field2395, var23);
                            if (class240.field3270 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3191.field2392[Statics.field3191.field2395 + var24] ^= class240.field3270;
                                }
                            }
                            Statics.field3191.field2395 += var23;
                            class240.field3261 += var23;
                            if (Statics.field3191.field2395 == var22) {
                                if (Statics.field429.field2475 == 16711935L) {
                                    Statics.field2304 = Statics.field3191;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class239 var26 = class240.field3269[var25];
                                        if (var26 != null) {
                                            Statics.field2304.field2395 = var25 * 8 + 5;
                                            int var27 = Statics.field2304.method2998();
                                            int var28 = Statics.field2304.method2998();
                                            var26.method3916(var27, var28);
                                        }
                                    }
                                } else {
                                    class240.field3268.reset();
                                    class240.field3268.update(Statics.field3191.field2392, 0, var22);
                                    int var29 = (int) class240.field3268.getValue();
                                    if (Statics.field429.field3214 != var29) {
                                        try {
                                            Statics.field3905.method2810();
                                        } catch (Exception var35) {
                                        }
                                        class240.field3271++;
                                        Statics.field3905 = null;
                                        class240.field3270 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class240.field3271 = 0;
                                    class240.field3275 = 0;
                                    Statics.field429.field3209.method3917((int) (Statics.field429.field2475 & 0xFFFFL), Statics.field3191.field2392, (Statics.field429.field2475 & 0xFF0000L) == 16711680L, Statics.field1775);
                                }
                                Statics.field429.method3397();
                                if (Statics.field1775) {
                                    class240.field3260--;
                                } else {
                                    class240.field3267--;
                                }
                                class240.field3261 = 0;
                                Statics.field429 = null;
                                Statics.field3191 = null;
                            } else {
                                if (class240.field3261 != 512) {
                                    break;
                                }
                                class240.field3261 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3905.method2810();
                } catch (Exception var34) {
                }
                class240.field3275++;
                Statics.field3905 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1063();
        }
    }

    @ObfuscatedName("client.eb(I)V")
    public void method1063() {
        if (class240.field3271 >= 4) {
            this.method819("js5crc");
            field948 = 1000;
            return;
        }
        if (class240.field3275 >= 4) {
            if (field948 <= 5) {
                this.method819("js5io");
                field948 = 1000;
                return;
            }
            field1156 = 3000;
            class240.field3275 = 3;
        }
        if (--field1156 + 1 > 0) {
            return;
        }
        try {
            if (field1085 == 0) {
                Statics.field1037 = Statics.field706.method2788(Statics.field358, Statics.field1679);
                field1085++;
            }
            if (field1085 == 1) {
                if (Statics.field1037.field2236 == 2) {
                    this.method1064(-1);
                    return;
                }
                if (Statics.field1037.field2236 == 1) {
                    field1085++;
                }
            }
            if (field1085 == 2) {
                Statics.field3232 = new class161((Socket) Statics.field1037.field2240, Statics.field706);
                class175 var1 = new class175(5);
                var1.method3102(15);
                var1.method3136(154);
                Statics.field3232.method2813(var1.field2392, 0, 5);
                field1085++;
                Statics.field1420 = class177.method608();
            }
            if (field1085 == 3) {
                if (field948 <= 5 || Statics.field3232.method2816() > 0) {
                    int var2 = Statics.field3232.method2811();
                    if (var2 != 0) {
                        this.method1064(var2);
                        return;
                    }
                    field1085++;
                } else if (class177.method608() - Statics.field1420 > 30000L) {
                    this.method1064(-2);
                    return;
                }
            }
            if (field1085 == 4) {
                class240.method755(Statics.field3232, field948 > 20);
                Statics.field1037 = null;
                Statics.field3232 = null;
                field1085 = 0;
                field946 = 0;
            }
        } catch (IOException var4) {
            this.method1064(-3);
        }
    }

    @ObfuscatedName("client.er(IB)V")
    public void method1064(int arg0) {
        Statics.field1037 = null;
        Statics.field3232 = null;
        field1085 = 0;
        if (Statics.field3629 == Statics.field1679) {
            Statics.field1679 = Statics.field473;
        } else {
            Statics.field1679 = Statics.field3629;
        }
        field946++;
        if (field946 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field948 <= 5) {
                this.method819("js5connect_full");
                field948 = 1000;
            } else {
                field1156 = 3000;
            }
        } else if (field946 >= 2 && arg0 == 6) {
            this.method819("js5connect_outofdate");
            field948 = 1000;
        } else if (field946 >= 4) {
            if (field948 <= 5) {
                this.method819("js5connect");
                field948 = 1000;
            } else {
                field1156 = 3000;
            }
        }
    }

    @ObfuscatedName("gz.et(I)V")
    public static void method3267() {
        if (field1089 == 0) {
            Statics.field785 = new class139(4, 104, 104, class62.field768);
            for (int var0 = 0; var0 < 4; var0++) {
                field1004[var0] = new class163(104, 104);
            }
            Statics.field316 = new class287(512, 512);
            class92.field1450 = class227.field3091;
            class92.field1461 = 5;
            field1089 = 20;
        } else if (field1089 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class136.field2045[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class139.method2647(var1, 500, 800, 512, 334);
            class92.field1450 = class227.field3025;
            class92.field1461 = 10;
            field1089 = 30;
        } else if (field1089 == 30) {
            Statics.field931 = method2291(0, false, true, true);
            Statics.field1416 = method2291(1, false, true, true);
            Statics.field736 = method2291(2, true, false, true);
            Statics.field2390 = method2291(3, false, true, true);
            Statics.field2420 = method2291(4, false, true, true);
            Statics.field679 = method2291(5, true, true, true);
            Statics.field601 = method2291(6, true, true, false);
            Statics.field3683 = method2291(7, false, true, true);
            Statics.field307 = method2291(8, false, true, true);
            Statics.field325 = method2291(9, false, true, true);
            Statics.field3284 = method2291(10, false, true, true);
            Statics.field610 = method2291(11, false, true, true);
            Statics.field837 = method2291(12, false, true, true);
            Statics.field2645 = method2291(13, true, false, true);
            Statics.field483 = method2291(14, false, true, false);
            Statics.field236 = method2291(15, false, true, true);
            Statics.field1674 = method2291(16, false, true, false);
            class92.field1450 = class227.field2874;
            class92.field1461 = 20;
            field1089 = 40;
        } else if (field1089 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field931.method3915() * 4 / 100;
            int var8 = var7 + Statics.field1416.method3915() * 4 / 100;
            int var9 = var8 + Statics.field736.method3915() * 2 / 100;
            int var10 = var9 + Statics.field2390.method3915() * 2 / 100;
            int var11 = var10 + Statics.field2420.method3915() * 6 / 100;
            int var12 = var11 + Statics.field679.method3915() * 4 / 100;
            int var13 = var12 + Statics.field601.method3915() * 2 / 100;
            int var14 = var13 + Statics.field3683.method3915() * 58 / 100;
            int var15 = var14 + Statics.field307.method3915() * 2 / 100;
            int var16 = var15 + Statics.field325.method3915() * 2 / 100;
            int var17 = var16 + Statics.field3284.method3915() * 2 / 100;
            int var18 = var17 + Statics.field610.method3915() * 2 / 100;
            int var19 = var18 + Statics.field837.method3915() * 2 / 100;
            int var20 = var19 + Statics.field2645.method3915() * 2 / 100;
            int var21 = var20 + Statics.field483.method3915() * 2 / 100;
            int var22 = var21 + Statics.field236.method3915() * 2 / 100;
            int var23 = var22 + Statics.field1674.method3915() * 2 / 100;
            if (var23 == 100) {
                class92.field1450 = class227.field2876;
                class92.field1461 = 30;
                field1089 = 45;
            } else {
                if (var23 != 0) {
                    class92.field1450 = class227.field2875 + var23 + "%";
                }
                class92.field1461 = 30;
            }
        } else if (field1089 == 45) {
            class109.method2832(22050, !field941, 2);
            class206 var24 = new class206();
            var24.method3513(9, 128);
            Statics.field1774 = class109.method3810(Statics.field706, 0, 22050);
            Statics.field1774.method1852(var24);
            class239 var25 = Statics.field236;
            class239 var26 = Statics.field483;
            class239 var27 = Statics.field2420;
            Statics.field2505 = var25;
            Statics.field2513 = var26;
            Statics.field2507 = var27;
            Statics.field2857 = var24;
            Statics.field249 = class109.method3810(Statics.field706, 1, 2048);
            Statics.field480 = new class102();
            Statics.field249.method1852(Statics.field480);
            Statics.field2593 = new class116(22050, Statics.field899);
            class92.field1450 = class227.field2859;
            class92.field1461 = 35;
            field1089 = 50;
            Statics.field540 = new class264(Statics.field307, Statics.field2645);
        } else if (field1089 == 50) {
            int var28 = class263.method4371().length;
            field998 = Statics.field540.method4375(class263.method4371());
            if (field998.size() < var28) {
                class92.field1450 = class227.field2878 + field998.size() * 100 / var28 + "%";
                class92.field1461 = 40;
            } else {
                Statics.field448 = (class265) field998.get(class263.field3630);
                Statics.field538 = (class265) field998.get(class263.field3618);
                Statics.field898 = (class265) field998.get(class263.field3617);
                Statics.field22 = new class293(true);
                class92.field1450 = class227.field2879;
                class92.field1461 = 40;
                field1089 = 60;
            }
        } else if (field1089 == 60) {
            int var29 = class92.method132(Statics.field3284, Statics.field307);
            byte var30 = 11;
            if (var29 < var30) {
                class92.field1450 = class227.field2880 + var29 * 100 / var30 + "%";
                class92.field1461 = 50;
            } else {
                class92.field1450 = class227.field2881;
                class92.field1461 = 50;
                method492(5);
                field1089 = 70;
            }
        } else if (field1089 == 70) {
            if (Statics.field736.method3828()) {
                class239 var32 = Statics.field736;
                Statics.field3596 = var32;
                class239 var33 = Statics.field736;
                Statics.field3344 = var33;
                class239 var34 = Statics.field736;
                class239 var35 = Statics.field3683;
                Statics.field685 = var34;
                Statics.field3658 = var35;
                Statics.field3362 = Statics.field685.method3835(3);
                class239 var36 = Statics.field736;
                class239 var37 = Statics.field3683;
                boolean var38 = field941;
                Statics.field3436 = var36;
                Statics.field3151 = var37;
                class257.field3478 = var38;
                class239 var39 = Statics.field736;
                class239 var40 = Statics.field3683;
                Statics.field3571 = var39;
                Statics.field3548 = var40;
                class239 var41 = Statics.field736;
                Statics.field3273 = var41;
                class239 var42 = Statics.field736;
                class239 var43 = Statics.field3683;
                boolean var44 = field945;
                class265 var45 = Statics.field448;
                Statics.field1784 = var42;
                Statics.field1379 = var43;
                Statics.field14 = var44;
                Statics.field3487 = Statics.field1784.method3835(10);
                Statics.field3490 = var45;
                class239 var46 = Statics.field736;
                class239 var47 = Statics.field931;
                class239 var48 = Statics.field1416;
                Statics.field3603 = var46;
                Statics.field3598 = var47;
                Statics.field3599 = var48;
                class239 var49 = Statics.field736;
                class239 var50 = Statics.field3683;
                Statics.field3332 = var49;
                Statics.field3337 = var50;
                class252.method2294(Statics.field736);
                class239 var51 = Statics.field736;
                Statics.field3288 = var51;
                Statics.field3292 = Statics.field3288.method3835(16);
                class218.method1021(Statics.field2390, Statics.field3683, Statics.field307, Statics.field2645);
                class242.method3(Statics.field736);
                class239 var52 = Statics.field736;
                Statics.field3411 = var52;
                class239 var53 = Statics.field736;
                Statics.field3318 = var53;
                class246.method2962(Statics.field736);
                class239 var54 = Statics.field736;
                Statics.field3389 = var54;
                Statics.field17 = new class97();
                class256.method1885(Statics.field736, Statics.field307, Statics.field2645);
                class250.method254(Statics.field736, Statics.field307);
                class239 var55 = Statics.field736;
                class239 var56 = Statics.field307;
                Statics.field3311 = var56;
                if (var55.method3828()) {
                    Statics.field2230 = var55.method3835(35);
                    Statics.field3295 = new class244[Statics.field2230];
                    for (int var57 = 0; var57 < Statics.field2230; var57++) {
                        byte[] var58 = var55.method3824(35, var57);
                        if (var58 != null) {
                            Statics.field3295[var57] = new class244(var57);
                            Statics.field3295[var57].method3969(new class175(var58));
                            Statics.field3295[var57].method3985();
                        }
                    }
                }
                class92.field1450 = class227.field2883;
                class92.field1461 = 60;
                field1089 = 80;
            } else {
                class92.field1450 = class227.field3070 + Statics.field736.method3920() + "%";
                class92.field1461 = 60;
            }
        } else if (field1089 == 80) {
            int var59 = 0;
            if (Statics.field592 == null) {
                Statics.field592 = class288.method2904(Statics.field307, "compass", "");
            } else {
                var59++;
            }
            if (Statics.field822 == null) {
                Statics.field822 = class288.method2904(Statics.field307, "mapedge", "");
            } else {
                var59++;
            }
            if (Statics.field243 == null) {
                Statics.field243 = class288.method2704(Statics.field307, "mapscene", "");
            } else {
                var59++;
            }
            if (Statics.field1502 == null) {
                Statics.field1502 = class288.method49(Statics.field307, "headicons_pk", "");
            } else {
                var59++;
            }
            if (Statics.field280 == null) {
                Statics.field280 = class288.method49(Statics.field307, "headicons_prayer", "");
            } else {
                var59++;
            }
            if (Statics.field259 == null) {
                Statics.field259 = class288.method49(Statics.field307, "headicons_hint", "");
            } else {
                var59++;
            }
            if (Statics.field833 == null) {
                Statics.field833 = class288.method49(Statics.field307, "mapmarker", "");
            } else {
                var59++;
            }
            if (Statics.field2542 == null) {
                Statics.field2542 = class288.method49(Statics.field307, "cross", "");
            } else {
                var59++;
            }
            if (Statics.field2259 == null) {
                Statics.field2259 = class288.method49(Statics.field307, "mapdots", "");
            } else {
                var59++;
            }
            if (Statics.field2263 == null) {
                Statics.field2263 = class288.method2704(Statics.field307, "scrollbar", "");
            } else {
                var59++;
            }
            if (Statics.field2268 == null) {
                Statics.field2268 = class288.method2704(Statics.field307, "mod_icons", "");
            } else {
                var59++;
            }
            if (var59 < 11) {
                class92.field1450 = class227.field2945 + var59 * 100 / 12 + "%";
                class92.field1461 = 70;
            } else {
                Statics.field3649 = Statics.field2268;
                Statics.field822.method4665();
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 41.0D) - 20;
                Statics.field243[0].method4658(var60 + var63, var61 + var63, var62 + var63);
                class92.field1450 = class227.field2885;
                class92.field1461 = 70;
                field1089 = 90;
            }
        } else if (field1089 == 90) {
            if (Statics.field325.method3828()) {
                class125 var64 = new class125(Statics.field325, Statics.field307, 20, 0.8D, field941 ? 64 : 128);
                class136.method2499(var64);
                class136.method2459(0.8D);
                class92.field1450 = class227.field2887;
                class92.field1461 = 90;
                field1089 = 110;
            } else {
                class92.field1450 = class227.field2886 + Statics.field325.method3920() + "%";
                class92.field1461 = 90;
            }
        } else if (field1089 == 110) {
            Statics.field971 = new class72();
            Statics.field706.method2770(Statics.field971, 10);
            class92.field1450 = class227.field2888;
            class92.field1461 = 94;
            field1089 = 120;
        } else if (field1089 == 120) {
            if (Statics.field3284.method3844("huffman", "")) {
                class167 var65 = new class167(Statics.field3284.method3843("huffman", ""));
                Statics.field3657 = var65;
                class92.field1450 = class227.field2890;
                class92.field1461 = 96;
                field1089 = 130;
            } else {
                class92.field1450 = class227.field2889 + "%";
                class92.field1461 = 96;
            }
        } else if (field1089 == 130) {
            if (!Statics.field2390.method3828()) {
                class92.field1450 = class227.field2949 + Statics.field2390.method3920() * 4 / 5 + "%";
                class92.field1461 = 100;
            } else if (!Statics.field837.method3828()) {
                class92.field1450 = class227.field2949 + (80 + Statics.field837.method3920() / 6) + "%";
                class92.field1461 = 100;
            } else if (Statics.field2645.method3828()) {
                class92.field1450 = class227.field2892;
                class92.field1461 = 98;
                field1089 = 140;
            } else {
                class92.field1450 = class227.field2949 + (96 + Statics.field2645.method3920() / 50) + "%";
                class92.field1461 = 100;
            }
        } else if (field1089 == 140) {
            if (Statics.field1674.method3861(class41.field561.field557)) {
                if (Statics.field666 == null) {
                    Statics.field666 = new class290();
                    Statics.field666.method4811(Statics.field1674, Statics.field898, field998, Statics.field243);
                }
                int var66 = Statics.field666.method4812();
                if (var66 < 100) {
                    class92.field1450 = class227.field2981 + (var66 * 9 / 10 + 10) + "%";
                } else {
                    class92.field1450 = class227.field2894;
                    class92.field1461 = 100;
                    field1089 = 150;
                }
            } else {
                class92.field1450 = class227.field2981 + Statics.field1674.method3847(class41.field561.field557) / 10 + "%";
            }
        } else if (field1089 == 150) {
            method492(10);
        }
    }

    @ObfuscatedName("do.ek(IZZZS)Lib;")
    public static class239 method2291(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class162 var4 = null;
        if (class157.field2251 != null) {
            var4 = new class162(arg0, class157.field2251, Statics.field686[arg0], 1000000);
        }
        return new class239(var4, Statics.field3152, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ez(I)V")
    public final void method1065() {
        try {
            if (field1118 == 0) {
                if (Statics.field869 != null) {
                    Statics.field869.method2810();
                    Statics.field869 = null;
                }
                Statics.field2128 = null;
                field997 = false;
                field976 = 0;
                field1118 = 1;
            }
            if (field1118 == 1) {
                if (Statics.field2128 == null) {
                    Statics.field2128 = Statics.field706.method2788(Statics.field358, Statics.field1679);
                }
                if (Statics.field2128.field2236 == 2) {
                    throw new IOException();
                }
                if (Statics.field2128.field2236 == 1) {
                    Statics.field869 = new class161((Socket) Statics.field2128.field2240, Statics.field706);
                    Statics.field2128 = null;
                    field1118 = 2;
                }
            }
            if (field1118 == 2) {
                field986.field2395 = 0;
                field986.method3102(14);
                Statics.field869.method2813(field986.field2392, 0, 1);
                field1110.field2395 = 0;
                field1118 = 3;
            }
            if (field1118 == 3) {
                if (Statics.field1774 != null) {
                    Statics.field1774.method1853();
                }
                if (Statics.field249 != null) {
                    Statics.field249.method1853();
                }
                int var1 = Statics.field869.method2811();
                if (Statics.field1774 != null) {
                    Statics.field1774.method1853();
                }
                if (Statics.field249 != null) {
                    Statics.field249.method1853();
                }
                if (var1 != 0) {
                    method32(var1);
                    return;
                }
                field1110.field2395 = 0;
                field1118 = 4;
            }
            if (field1118 == 4) {
                if (field1110.field2395 < 8) {
                    int var2 = Statics.field869.method2816();
                    if (var2 > 8 - field1110.field2395) {
                        var2 = 8 - field1110.field2395;
                    }
                    if (var2 > 0) {
                        Statics.field869.method2821(field1110.field2392, field1110.field2395, var2);
                        field1110.field2395 += var2;
                    }
                }
                if (field1110.field2395 == 8) {
                    field1110.field2395 = 0;
                    Statics.field836 = field1110.method2981();
                    field1118 = 5;
                }
            }
            if (field1118 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field836 >> 32), (int) (Statics.field836 & 0xFFFFFFFFFFFFFFFFL) };
                field986.field2395 = 0;
                field986.method3102(1);
                field986.method3102(field1136.method6());
                field986.method3136(var3[0]);
                field986.method3136(var3[1]);
                field986.method3136(var3[2]);
                field986.method3136(var3[3]);
                switch(field1136.field2212) {
                    case 0:
                        class181 var4 = field986;
                        LinkedHashMap var5 = Statics.field2396.field1319;
                        String var6 = class92.field1456;
                        int var7 = var6.length();
                        int var8 = 0;
                        for (int var9 = 0; var9 < var7; var9++) {
                            var8 = (var8 << 5) - var8 + var6.charAt(var9);
                        }
                        var4.method3136((Integer) var5.get(var8));
                        field986.field2395 += 4;
                        break;
                    case 1:
                    case 3:
                        field986.method3196(Statics.field1876);
                        field986.field2395 += 5;
                        break;
                    case 2:
                        field986.field2395 += 8;
                }
                field986.method2984(class92.field1457);
                field986.method3171(class90.field1414, class90.field1415);
                field1077.field2395 = 0;
                if (field948 == 40) {
                    field1077.method3102(18);
                } else {
                    field1077.method3102(16);
                }
                field1077.method2978(0);
                int var11 = field1077.field2395;
                field1077.method3136(154);
                field1077.method2987(field986.field2392, 0, field986.field2395);
                int var12 = field1077.field2395;
                field1077.method2984(class92.field1456);
                field1077.method3102((field1197 ? 1 : 0) << 1 | (field941 ? 1 : 0));
                field1077.method2978(Statics.field1467);
                field1077.method2978(Statics.field801);
                class181 var13 = field1077;
                if (field980 == null) {
                    byte[] var14 = class157.method3784();
                    var13.method2987(var14, 0, var14.length);
                } else {
                    var13.method2987(field980, 0, field980.length);
                }
                field1077.method2984(Statics.field378);
                field1077.method3136(Statics.field757);
                class175 var15 = new class175(Statics.field22.method4999());
                Statics.field22.method4996(var15);
                field1077.method2987(var15.field2392, 0, var15.field2392.length);
                field1077.method3102(Statics.field252);
                field1077.method3136(0);
                field1077.method3136(Statics.field931.field3228);
                field1077.method3136(Statics.field1416.field3228);
                field1077.method3136(Statics.field736.field3228);
                field1077.method3136(Statics.field2390.field3228);
                field1077.method3136(Statics.field2420.field3228);
                field1077.method3136(Statics.field679.field3228);
                field1077.method3136(Statics.field601.field3228);
                field1077.method3136(Statics.field3683.field3228);
                field1077.method3136(Statics.field307.field3228);
                field1077.method3136(Statics.field325.field3228);
                field1077.method3136(Statics.field3284.field3228);
                field1077.method3136(Statics.field610.field3228);
                field1077.method3136(Statics.field837.field3228);
                field1077.method3136(Statics.field2645.field3228);
                field1077.method3136(Statics.field483.field3228);
                field1077.method3136(Statics.field236.field3228);
                field1077.method3136(Statics.field1674.field3228);
                field1077.method3036(var3, var12, field1077.field2395);
                field1077.method2989(field1077.field2395 - var11);
                Statics.field869.method2813(field1077.field2392, 0, field1077.field2395);
                field986.method3227(var3);
                for (int var16 = 0; var16 < 4; var16++) {
                    var3[var16] += 50;
                }
                field1110.method3227(var3);
                field1118 = 6;
            }
            if (field1118 == 6 && Statics.field869.method2816() > 0) {
                int var17 = Statics.field869.method2811();
                if (var17 == 21 && field948 == 20) {
                    field1118 = 7;
                } else if (var17 == 2) {
                    field1118 = 9;
                } else if (var17 == 15 && field948 == 40) {
                    field989 = -1;
                    field1118 = 13;
                } else if (var17 == 23 && field1176 < 1) {
                    field1176++;
                    field1118 = 0;
                } else if (var17 == 29) {
                    field1118 = 11;
                } else {
                    method32(var17);
                    return;
                }
            }
            if (field1118 == 7 && Statics.field869.method2816() > 0) {
                field978 = (Statics.field869.method2811() + 3) * 60;
                field1118 = 8;
            }
            if (field1118 == 8) {
                field976 = 0;
                class92.method3813(class227.field2898, class227.field2899, field978 / 60 + class227.field2900);
                if (--field978 <= 0) {
                    field1118 = 0;
                }
            } else {
                if (field1118 == 9 && Statics.field869.method2816() >= 13) {
                    boolean var18 = Statics.field869.method2811() == 1;
                    Statics.field869.method2821(field1110.field2392, 0, 4);
                    field1110.field2395 = 0;
                    boolean var19 = false;
                    if (var18) {
                        int var20 = field1110.method3228() << 24;
                        int var21 = var20 | field1110.method3228() << 16;
                        int var22 = var21 | field1110.method3228() << 8;
                        int var23 = var22 | field1110.method3228();
                        String var24 = class92.field1456;
                        int var25 = var24.length();
                        int var26 = 0;
                        for (int var27 = 0; var27 < var25; var27++) {
                            var26 = (var26 << 5) - var26 + var24.charAt(var27);
                        }
                        if (Statics.field2396.field1319.size() >= 10 && !Statics.field2396.field1319.containsKey(var26)) {
                            Iterator var30 = Statics.field2396.field1319.entrySet().iterator();
                            var30.next();
                            var30.remove();
                        }
                        Statics.field2396.field1319.put(var26, var23);
                    }
                    if (class92.field1458) {
                        Statics.field2396.field1320 = class92.field1456;
                    } else {
                        Statics.field2396.field1320 = null;
                    }
                    class81.method163();
                    field1099 = Statics.field869.method2811();
                    field953 = Statics.field869.method2811() == 1;
                    field1028 = Statics.field869.method2811();
                    field1028 <<= 0x8;
                    field1028 += Statics.field869.method2811();
                    field1054 = Statics.field869.method2811();
                    Statics.field869.method2821(field1110.field2392, 0, 1);
                    field1110.field2395 = 0;
                    field965 = field1110.method3228();
                    Statics.field869.method2821(field1110.field2392, 0, 2);
                    field1110.field2395 = 0;
                    field989 = field1110.method2995();
                    try {
                        class53.method706(Statics.field1402, "zap");
                    } catch (Throwable var52) {
                    }
                    field1118 = 10;
                }
                if (field1118 != 10) {
                    if (field1118 == 11 && Statics.field869.method2816() >= 2) {
                        field1110.field2395 = 0;
                        Statics.field869.method2821(field1110.field2392, 0, 2);
                        field1110.field2395 = 0;
                        Statics.field677 = field1110.method2995();
                        field1118 = 12;
                    }
                    if (field1118 == 12 && Statics.field869.method2816() >= Statics.field677) {
                        field1110.field2395 = 0;
                        Statics.field869.method2821(field1110.field2392, 0, Statics.field677);
                        field1110.field2395 = 0;
                        String var47 = field1110.method3002();
                        String var48 = field1110.method3002();
                        String var49 = field1110.method3002();
                        class92.method3813(var47, var48, var49);
                        method492(10);
                    }
                    if (field1118 == 13) {
                        if (field989 == -1) {
                            if (Statics.field869.method2816() < 2) {
                                return;
                            }
                            Statics.field869.method2821(field1110.field2392, 0, 2);
                            field1110.field2395 = 0;
                            field989 = field1110.method2995();
                        }
                        if (Statics.field869.method2816() >= field989) {
                            Statics.field869.method2821(field1110.field2392, 0, field989);
                            field1110.field2395 = 0;
                            int var50 = field989;
                            method2708();
                            class96.method3268(field1110);
                            if (field1110.field2395 != var50) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field976++;
                        if (field976 > 2000) {
                            if (field1176 < 1) {
                                if (Statics.field3629 == Statics.field1679) {
                                    Statics.field1679 = Statics.field473;
                                } else {
                                    Statics.field1679 = Statics.field3629;
                                }
                                field1176++;
                                field1118 = 0;
                            } else {
                                method32(-3);
                            }
                        }
                    }
                } else if (Statics.field869.method2816() >= field989) {
                    field1110.field2395 = 0;
                    Statics.field869.method2821(field1110.field2392, 0, field989);
                    field1083 = 1L;
                    field955 = -1;
                    Statics.field971.field881 = 0;
                    Statics.field733 = true;
                    field956 = true;
                    field1157 = -1L;
                    class282.method2718();
                    field986.field2395 = 0;
                    field1110.field2395 = 0;
                    field965 = -1;
                    field993 = -1;
                    field958 = -1;
                    field995 = -1;
                    field991 = 0;
                    field1060 = 0;
                    field1059 = 0;
                    field959 = 0;
                    field1071 = 0;
                    field987 = false;
                    class60.method1613(0);
                    class98.method550();
                    field1137 = 0;
                    field1064 = false;
                    field1173 = 0;
                    field1016 = 0;
                    field1080 = 0;
                    field1160 = -1;
                    field1165 = 0;
                    field1166 = 0;
                    field968 = class91.field1427;
                    field969 = class91.field1427;
                    field947 = 0;
                    class96.field1508 = 0;
                    for (int var32 = 0; var32 < 2048; var32++) {
                        class96.field1507[var32] = null;
                        class96.field1514[var32] = 1;
                    }
                    for (int var33 = 0; var33 < 2048; var33++) {
                        field1106[var33] = null;
                    }
                    for (int var34 = 0; var34 < 32768; var34++) {
                        field1097[var34] = null;
                    }
                    field1061 = -1;
                    field1040.method3404();
                    field1065.method3404();
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 104; var36++) {
                            for (int var37 = 0; var37 < 104; var37++) {
                                field1062[var35][var36][var37] = null;
                            }
                        }
                    }
                    field1063 = new class195();
                    field1199 = 0;
                    field1198 = 0;
                    field962 = 0;
                    for (int var38 = 0; var38 < Statics.field3292; var38++) {
                        class243 var39 = class243.method479(var38);
                        if (var39 != null) {
                            class213.field2615[var38] = 0;
                            class213.field2609[var38] = 0;
                        }
                    }
                    Statics.field17.method1668();
                    field1100 = -1;
                    if (field1092 != -1) {
                        int var40 = field1092;
                        if (var40 != -1 && Statics.field18[var40]) {
                            Statics.field2620.method3837(var40);
                            if (Statics.field3666[var40] != null) {
                                boolean var41 = true;
                                for (int var42 = 0; var42 < Statics.field3666[var40].length; var42++) {
                                    if (Statics.field3666[var40][var42] != null) {
                                        if (Statics.field3666[var40][var42].field2661 == 2) {
                                            var41 = false;
                                        } else {
                                            Statics.field3666[var40][var42] = null;
                                        }
                                    }
                                }
                                if (var41) {
                                    Statics.field3666[var40] = null;
                                }
                                Statics.field18[var40] = false;
                            }
                        }
                    }
                    for (class69 var43 = (class69) field1093.method3365(); var43 != null; var43 = (class69) field1093.method3362()) {
                        method1030(var43, true);
                    }
                    field1092 = -1;
                    field1093 = new class192(8);
                    field1087 = null;
                    field1071 = 0;
                    field987 = false;
                    field1079.method3703((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var44 = 0; var44 < 8; var44++) {
                        field1058[var44] = null;
                        field1138[var44] = false;
                    }
                    class64.field790 = new class192(32);
                    field1101 = true;
                    for (int var45 = 0; var45 < 100; var45++) {
                        field1111[var45] = true;
                    }
                    method131();
                    field1158 = null;
                    Statics.field289 = 0;
                    Statics.field2849 = null;
                    for (int var46 = 0; var46 < 8; var46++) {
                        field1015[var46] = new class17();
                    }
                    Statics.field2442 = null;
                    class96.method3268(field1110);
                    Statics.field408 = -1;
                    method1567(false);
                    field965 = -1;
                }
            }
        } catch (IOException var53) {
            if (field1176 < 1) {
                if (Statics.field3629 == Statics.field1679) {
                    Statics.field1679 = Statics.field473;
                } else {
                    Statics.field1679 = Statics.field3629;
                }
                field1176++;
                field1118 = 0;
            } else {
                method32(-2);
            }
        }
    }

    @ObfuscatedName("eg.eo(B)V")
    public static void method2708() {
        field986.field2395 = 0;
        field1110.field2395 = 0;
        field965 = -1;
        field993 = -1;
        field958 = -1;
        field995 = -1;
        field989 = 0;
        field991 = 0;
        field1060 = 0;
        field1071 = 0;
        field987 = false;
        field1080 = 0;
        field1165 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1106[var0] = null;
        }
        Statics.field908 = null;
        for (int var1 = 0; var1 < field1097.length; var1++) {
            class86 var2 = field1097[var1];
            if (var2 != null) {
                var2.field1256 = -1;
                var2.field1265 = false;
            }
        }
        class64.field790 = new class192(32);
        method492(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1111[var3] = true;
        }
        method131();
    }

    @ObfuscatedName("b.fc(II)V")
    public static void method32(int arg0) {
        if (arg0 == -3) {
            class92.method3813(class227.field2901, class227.field2912, class227.field2903);
        } else if (arg0 == -2) {
            class92.method3813(class227.field3127, class227.field2905, class227.field3046);
        } else if (arg0 == -1) {
            class92.method3813(class227.field2939, class227.field2908, class227.field2909);
        } else if (arg0 == 3) {
            class92.field1445 = 3;
        } else if (arg0 == 4) {
            class92.method3813(class227.field2910, class227.field2911, class227.field2877);
        } else if (arg0 == 5) {
            class92.method3813(class227.field3137, class227.field2951, class227.field2915);
        } else if (arg0 == 6) {
            class92.method3813(class227.field2916, class227.field2917, class227.field2918);
        } else if (arg0 == 7) {
            class92.method3813(class227.field2919, class227.field2920, class227.field3063);
        } else if (arg0 == 8) {
            class92.method3813(class227.field2964, class227.field2923, class227.field2924);
        } else if (arg0 == 9) {
            class92.method3813(class227.field2925, class227.field2926, class227.field2927);
        } else if (arg0 == 10) {
            class92.method3813(class227.field2913, class227.field3067, class227.field3012);
        } else if (arg0 == 11) {
            class92.method3813(class227.field2985, class227.field2932, class227.field3108);
        } else if (arg0 == 12) {
            class92.method3813(class227.field2906, class227.field3140, class227.field2936);
        } else if (arg0 == 13) {
            class92.method3813(class227.field2937, class227.field2938, class227.field3028);
        } else if (arg0 == 14) {
            class92.method3813(class227.field2940, class227.field2941, class227.field2942);
        } else if (arg0 == 16) {
            class92.method3813(class227.field2943, class227.field3121, class227.field3020);
        } else if (arg0 == 17) {
            class92.method3813(class227.field2968, class227.field2947, class227.field3097);
        } else if (arg0 == 18) {
            class92.method3813(class227.field3135, class227.field2950, class227.field2934);
        } else if (arg0 == 19) {
            class92.method3813(class227.field2988, class227.field2953, class227.field2954);
        } else if (arg0 == 20) {
            class92.method3813(class227.field2955, class227.field2956, class227.field2957);
        } else if (arg0 == 22) {
            class92.method3813(class227.field2958, class227.field2959, class227.field2960);
        } else if (arg0 == 23) {
            class92.method3813(class227.field2961, class227.field2962, class227.field2967);
        } else if (arg0 == 24) {
            class92.method3813(class227.field2872, class227.field2907, class227.field2966);
        } else if (arg0 == 25) {
            class92.method3813(class227.field2929, class227.field3008, class227.field2969);
        } else if (arg0 == 26) {
            class92.method3813(class227.field2970, class227.field2971, class227.field2972);
        } else if (arg0 == 27) {
            class92.method3813(class227.field2973, class227.field2974, class227.field2975);
        } else if (arg0 == 31) {
            class92.method3813(class227.field2982, class227.field2983, class227.field2984);
        } else if (arg0 == 32) {
            class92.method3813(class227.field3058, class227.field3141, class227.field2987);
        } else if (arg0 == 37) {
            class92.method3813(class227.field2948, class227.field2989, class227.field2990);
        } else if (arg0 == 38) {
            class92.method3813(class227.field2991, class227.field2992, class227.field3024);
        } else if (arg0 == 55) {
            class92.method3813(class227.field2994, class227.field3064, class227.field2996);
        } else if (arg0 == 56) {
            class92.method3813(class227.field2997, class227.field2867, class227.field3001);
            method492(11);
            return;
        } else if (arg0 == 57) {
            class92.method3813(class227.field2914, class227.field2933, class227.field3002);
            method492(11);
            return;
        } else {
            class92.method3813(class227.field3003, class227.field3099, class227.field3005);
        }
        method492(10);
    }

    @ObfuscatedName("az.fo(I)V")
    public static final void method477() {
        if (Statics.field869 != null) {
            Statics.field869.method2810();
            Statics.field869 = null;
        }
        method158();
        Statics.field785.method2507();
        for (int var0 = 0; var0 < 4; var0++) {
            field1004[var0].method2851();
        }
        System.gc();
        class205.method2963(2);
        field1169 = -1;
        field1170 = false;
        class82.method3486();
        method492(10);
    }

    @ObfuscatedName("p.fd(B)V")
    public static final void method158() {
        class261.method1018();
        class248.method3653();
        class249.method2848();
        class257.field3440.method3355();
        class257.field3438.method3355();
        class257.field3439.method3355();
        class257.field3443.method3355();
        class260.field3568.method3355();
        class260.field3553.method3355();
        class258.method14();
        class262.method2207();
        class247.field3329.method3355();
        class247.field3330.method3355();
        class252.method3201();
        class243.field3289.method3355();
        class256.method1056();
        class250.field3367.method3355();
        class250.field3366.method3355();
        class254.field3400.method3355();
        class253.field3390.method3355();
        class244.field3296.method3355();
        class215.method245();
        class218.field2653.method3355();
        class218.field2742.method3355();
        class218.field2762.method3355();
        class218.field2656.method3355();
        ((class125) Statics.field2042).method2192();
        class99.field1547.method3355();
        Statics.field931.method3838();
        Statics.field1416.method3838();
        Statics.field2390.method3838();
        Statics.field2420.method3838();
        Statics.field679.method3838();
        Statics.field601.method3838();
        Statics.field3683.method3838();
        Statics.field307.method3838();
        Statics.field325.method3838();
        Statics.field3284.method3838();
        Statics.field610.method3838();
        Statics.field837.method3838();
    }

    @ObfuscatedName("cz.fb(ZB)V")
    public static final void method1477(boolean arg0) {
        if (arg0) {
            field1136 = class92.field1448 ? class151.field2214 : class151.field2208;
            return;
        }
        LinkedHashMap var1 = Statics.field2396.field1319;
        String var2 = class92.field1456;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field1136 = var1.containsKey(var4) ? class151.field2211 : class151.field2207;
    }

    @ObfuscatedName("client.ff(B)V")
    public final void method1214() {
        if (field1060 > 1) {
            field1060--;
        }
        if (field1059 > 0) {
            field1059--;
        }
        if (field997) {
            field997 = false;
            if (field1059 > 0) {
                method477();
            } else {
                method492(40);
                Statics.field2566 = Statics.field869;
                Statics.field869 = null;
            }
            return;
        }
        if (!field987) {
            method1537();
        }
        for (int var1 = 0; var1 < 100 && this.method1069(); var1++) {
        }
        if (field948 != 30) {
            return;
        }
        while (class282.method1543()) {
            field986.method3243(79);
            field986.method3102(0);
            int var2 = field986.field2395;
            class282.method3652(field986);
            field986.method3010(field986.field2395 - var2);
        }
        Object var3 = Statics.field971.field879;
        synchronized (Statics.field971.field879) {
            if (!field979) {
                Statics.field971.field881 = 0;
            } else if (class60.field755 != 0 || Statics.field971.field881 >= 40) {
                field986.method3243(208);
                field986.method3102(0);
                int var4 = field986.field2395;
                int var5 = 0;
                for (int var6 = 0; var6 < Statics.field971.field881 && field986.field2395 - var4 < 240; var6++) {
                    var5++;
                    int var7 = Statics.field971.field883[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = Statics.field971.field880[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (Statics.field971.field883[var6] == -1 && Statics.field971.field880[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (field1208 != var8 || field954 != var7) {
                        int var10 = var8 - field1208;
                        field1208 = var8;
                        int var11 = var7 - field954;
                        field954 = var7;
                        if (field955 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            field986.method2978((field955 << 12) + (var10 << 6) + var11);
                            field955 = 0;
                        } else if (field955 < 8) {
                            field986.method3196((field955 << 19) + 8388608 + var9);
                            field955 = 0;
                        } else {
                            field986.method3136((field955 << 19) + -1073741824 + var9);
                            field955 = 0;
                        }
                    } else if (field955 < 2047) {
                        field955++;
                    }
                }
                field986.method3010(field986.field2395 - var4);
                if (var5 >= Statics.field971.field881) {
                    Statics.field971.field881 = 0;
                } else {
                    Statics.field971.field881 -= var5;
                    for (int var12 = 0; var12 < Statics.field971.field881; var12++) {
                        Statics.field971.field880[var12] = Statics.field971.field880[var5 + var12];
                        Statics.field971.field883[var12] = Statics.field971.field883[var5 + var12];
                    }
                }
            }
        }
        if (class60.field755 == 1 || !Statics.field952 && class60.field755 == 4 || class60.field755 == 2) {
            long var14 = (class60.field756 - field1083 * -1L) / 50L;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            field1083 = class60.field756 * -1L;
            int var16 = class60.field740;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field801) {
                var16 = Statics.field801;
            }
            int var17 = class60.field754;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > Statics.field1467) {
                var17 = Statics.field1467;
            }
            int var18 = (int) var14;
            field986.method3243(26);
            field986.method2978((class60.field755 == 2 ? 1 : 0) + (var18 << 1));
            field986.method2978(var17);
            field986.method2978(var16);
        }
        if (class51.field653 > 0) {
            field986.method3243(22);
            field986.method2978(0);
            int var19 = field986.field2395;
            long var20 = class177.method608();
            for (int var22 = 0; var22 < class51.field653; var22++) {
                long var23 = var20 - field1157;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field1157 = var20;
                field986.method3157(class51.field647[var22]);
                field986.method3033((int) var23);
            }
            field986.method2989(field986.field2395 - var19);
        }
        if (field1022 > 0) {
            field1022--;
        }
        if (class51.field652[96] || class51.field652[97] || class51.field652[98] || class51.field652[99]) {
            field1207 = true;
        }
        if (field1207 && field1022 <= 0) {
            field1022 = 20;
            field1207 = false;
            field986.method3243(134);
            field986.method3020(field1016);
            field986.method3027(field957);
        }
        if (Statics.field733 && !field956) {
            field956 = true;
            field986.method3243(62);
            field986.method3102(1);
        }
        if (!Statics.field733 && field956) {
            field956 = false;
            field986.method3243(62);
            field986.method3102(0);
        }
        if (Statics.field409 != field1160) {
            field1160 = Statics.field409;
            int var25 = Statics.field409;
            int[] var26 = Statics.field316.field3787;
            int var27 = var26.length;
            for (int var28 = 0; var28 < var27; var28++) {
                var26[var28] = 0;
            }
            for (int var29 = 1; var29 < 103; var29++) {
                int var30 = (103 - var29) * 2048 + 24628;
                for (int var31 = 1; var31 < 103; var31++) {
                    if ((class62.field764[var25][var31][var29] & 0x18) == 0) {
                        Statics.field785.method2540(var26, var30, 512, var25, var31, var29);
                    }
                    if (var25 < 3 && (class62.field764[var25 + 1][var31][var29] & 0x8) != 0) {
                        Statics.field785.method2540(var26, var30, 512, var25 + 1, var31, var29);
                    }
                    var30 += 4;
                }
            }
            int var32 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var33 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field316.method4664();
            for (int var34 = 1; var34 < 103; var34++) {
                for (int var35 = 1; var35 < 103; var35++) {
                    if ((class62.field764[var25][var35][var34] & 0x18) == 0) {
                        method2289(var25, var35, var34, var32, var33);
                    }
                    if (var25 < 3 && (class62.field764[var25 + 1][var35][var34] & 0x8) != 0) {
                        method2289(var25 + 1, var35, var34, var32, var33);
                    }
                }
            }
            field1161 = 0;
            for (int var36 = 0; var36 < 104; var36++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    int var38 = Statics.field785.method2557(Statics.field409, var36, var37);
                    if (var38 != 0) {
                        int var39 = var38 >> 14 & 0x7FFF;
                        int var40 = class257.method2716(var39).field3464;
                        if (var40 >= 0) {
                            field1164[field1161] = Statics.field3295[var40].method3980(false);
                            field1162[field1161] = var36;
                            field1163[field1161] = var37;
                            field1161++;
                        }
                    }
                }
            }
            Statics.field343.method4626();
        }
        if (field948 != 30) {
            return;
        }
        for (class77 var41 = (class77) field1063.method3410(); var41 != null; var41 = (class77) field1063.method3412()) {
            if (var41.field1224 > 0) {
                var41.field1224--;
            }
            if (var41.field1224 == 0) {
                if (var41.field1228 >= 0) {
                    int var42 = var41.field1228;
                    int var43 = var41.field1213;
                    class257 var44 = class257.method2716(var42);
                    if (var43 == 11) {
                        var43 = 10;
                    }
                    if (var43 >= 5 && var43 <= 8) {
                        var43 = 4;
                    }
                    boolean var45 = var44.method4198(var43);
                    if (!var45) {
                        continue;
                    }
                }
                method741(var41.field1217, var41.field1214, var41.field1215, var41.field1216, var41.field1228, var41.field1222, var41.field1213);
                var41.method3397();
            } else {
                if (var41.field1223 > 0) {
                    var41.field1223--;
                }
                if (var41.field1223 == 0 && var41.field1215 >= 1 && var41.field1216 >= 1 && var41.field1215 <= 102 && var41.field1216 <= 102) {
                    if (var41.field1220 >= 0) {
                        int var46 = var41.field1220;
                        int var47 = var41.field1225;
                        class257 var48 = class257.method2716(var46);
                        if (var47 == 11) {
                            var47 = 10;
                        }
                        if (var47 >= 5 && var47 <= 8) {
                            var47 = 4;
                        }
                        boolean var49 = var48.method4198(var47);
                        if (!var49) {
                            continue;
                        }
                    }
                    method741(var41.field1217, var41.field1214, var41.field1215, var41.field1216, var41.field1220, var41.field1221, var41.field1225);
                    var41.field1223 = -1;
                    if (var41.field1228 == var41.field1220 && var41.field1228 == -1) {
                        var41.method3397();
                    } else if (var41.field1228 == var41.field1220 && var41.field1222 == var41.field1221 && var41.field1225 == var41.field1213) {
                        var41.method3397();
                    }
                }
            }
        }
        method168();
        field991++;
        if (field991 <= 750) {
            int var50 = class96.field1508;
            int[] var51 = class96.field1512;
            for (int var52 = 0; var52 < var50; var52++) {
                class75 var53 = field1106[var51[var52]];
                if (var53 != null) {
                    method1407(var53, 1);
                }
            }
            for (int var54 = 0; var54 < field947; var54++) {
                int var55 = field983[var54];
                class86 var56 = field1097[var55];
                if (var56 != null) {
                    method1407(var56, var56.field1382.field3575);
                }
            }
            int[] var57 = class96.field1512;
            for (int var58 = 0; var58 < class96.field1508; var58++) {
                class75 var59 = field1106[var57[var58]];
                if (var59 != null && var59.field1246 > 0) {
                    var59.field1246--;
                    if (var59.field1246 == 0) {
                        var59.field1243 = null;
                    }
                }
            }
            for (int var60 = 0; var60 < field947; var60++) {
                int var61 = field983[var60];
                class86 var62 = field1097[var61];
                if (var62 != null && var62.field1246 > 0) {
                    var62.field1246--;
                    if (var62.field1246 == 0) {
                        var62.field1243 = null;
                    }
                }
            }
            field1008++;
            if (field1042 != 0) {
                field1041 += 20;
                if (field1041 >= 400) {
                    field1042 = 0;
                }
            }
            if (Statics.field3619 != null) {
                field1043++;
                if (field1043 >= 15) {
                    method31(Statics.field3619);
                    Statics.field3619 = null;
                }
            }
            class218 var63 = Statics.field697;
            class218 var64 = Statics.field630;
            Statics.field697 = null;
            Statics.field630 = null;
            field1109 = null;
            field1113 = false;
            field1210 = false;
            field1154 = 0;
            while (class51.method162() && field1154 < 128) {
                if (field1099 >= 2 && class51.field652[82] && Statics.field2494 == 66) {
                    String var65 = "";
                    Iterator var66 = class98.field1533.iterator();
                    while (var66.hasNext()) {
                        class73 var67 = (class73) var66.next();
                        var65 = var65 + var67.field888 + ':' + var67.field891 + '\n';
                    }
                    Statics.field1402.method803(var65);
                } else {
                    field1132[field1154] = Statics.field2494;
                    field1155[field1154] = Statics.field445;
                    field1154++;
                }
            }
            if (field1092 != -1) {
                int var70 = field1092;
                int var71 = Statics.field1467;
                int var72 = Statics.field801;
                if (class218.method66(var70)) {
                    method3671(Statics.field3666[var70], -1, 0, 0, var71, var72, 0, 0);
                }
            }
            field1167++;
            while (true) {
                class70 var73;
                class218 var74;
                class218 var75;
                do {
                    var73 = (class70) field1001.method3408();
                    if (var73 == null) {
                        while (true) {
                            class70 var76;
                            class218 var77;
                            class218 var78;
                            do {
                                var76 = (class70) field1133.method3408();
                                if (var76 == null) {
                                    while (true) {
                                        class70 var79;
                                        class218 var80;
                                        class218 var81;
                                        do {
                                            var79 = (class70) field1131.method3408();
                                            if (var79 == null) {
                                                this.method1070();
                                                if (Statics.field666 != null) {
                                                    Statics.field666.method4829(Statics.field409, (Statics.field908.field1233 >> 7) + Statics.field2202, (Statics.field908.field1232 >> 7) + Statics.field840, false);
                                                    Statics.field666.method4828();
                                                }
                                                if (field1112 != null) {
                                                    this.method1272();
                                                }
                                                if (Statics.field326 != null) {
                                                    method31(Statics.field326);
                                                    field1082++;
                                                    if (class60.field746 == 0) {
                                                        if (field1049) {
                                                            if (Statics.field326 == Statics.field279 && field1134 != field1045) {
                                                                class218 var82 = Statics.field326;
                                                                byte var83 = 0;
                                                                if (field1145 == 1 && var82.field2663 == 206) {
                                                                    var83 = 1;
                                                                }
                                                                if (var82.field2777[field1134] <= 0) {
                                                                    var83 = 0;
                                                                }
                                                                if (class219.method2959(method3688(var82))) {
                                                                    int var84 = field1045;
                                                                    int var85 = field1134;
                                                                    var82.field2777[var85] = var82.field2777[var84];
                                                                    var82.field2778[var85] = var82.field2778[var84];
                                                                    var82.field2777[var84] = -1;
                                                                    var82.field2778[var84] = 0;
                                                                } else if (var83 == 1) {
                                                                    int var86 = field1045;
                                                                    int var87 = field1134;
                                                                    while (var86 != var87) {
                                                                        if (var86 > var87) {
                                                                            var82.method3783(var86 - 1, var86);
                                                                            var86--;
                                                                        } else if (var86 < var87) {
                                                                            var82.method3783(var86 + 1, var86);
                                                                            var86++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var82.method3783(field1134, field1045);
                                                                }
                                                                field986.method3243(99);
                                                                field986.method3114(var83);
                                                                field986.method3026(field1134);
                                                                field986.method3136(Statics.field326.field2659);
                                                                field986.method3026(field1045);
                                                            }
                                                        } else if (this.method1071()) {
                                                            this.method1072(field1070, field1047);
                                                        } else if (field1071 > 0) {
                                                            int var88 = field1070;
                                                            int var89 = field1047;
                                                            class89 var90 = Statics.field179;
                                                            method1005(var90.field1405, var90.field1410, var90.field1407, var90.field1408, var90.field1409, var90.field1409, var88, var89);
                                                            Statics.field179 = null;
                                                        }
                                                        field1043 = 10;
                                                        class60.field755 = 0;
                                                        Statics.field326 = null;
                                                    } else if (field1082 >= 5 && (class60.field753 > field1070 + 5 || class60.field753 < field1070 - 5 || class60.field748 > field1047 + 5 || class60.field748 < field1047 - 5)) {
                                                        field1049 = true;
                                                    }
                                                }
                                                if (class139.method2545()) {
                                                    int var91 = class139.field2097;
                                                    int var92 = class139.field2098;
                                                    field986.method3243(246);
                                                    field986.method3102(5);
                                                    field986.method3026(Statics.field2202 + var91);
                                                    field986.method2978(Statics.field840 + var92);
                                                    field986.method3114(class51.field652[82] ? (class51.field652[81] ? 2 : 1) : 0);
                                                    class139.method2546();
                                                    field1039 = class60.field754;
                                                    field996 = class60.field740;
                                                    field1042 = 1;
                                                    field1041 = 0;
                                                    field1165 = var91;
                                                    field1166 = var92;
                                                }
                                                if (Statics.field697 != var63) {
                                                    if (var63 != null) {
                                                        method31(var63);
                                                    }
                                                    if (Statics.field697 != null) {
                                                        method31(Statics.field697);
                                                    }
                                                }
                                                if (Statics.field630 != var64 && field974 == field1084) {
                                                    if (var64 != null) {
                                                        method31(var64);
                                                    }
                                                    if (Statics.field630 != null) {
                                                        method31(Statics.field630);
                                                    }
                                                }
                                                if (Statics.field630 == null) {
                                                    if (field974 > 0) {
                                                        field974--;
                                                    }
                                                } else if (field974 < field1084) {
                                                    field974++;
                                                    if (field974 == field1084) {
                                                        method31(Statics.field630);
                                                    }
                                                }
                                                int var93 = Statics.field908.field1233;
                                                int var94 = Statics.field908.field1232;
                                                if (Statics.field852 - var93 < -500 || Statics.field852 - var93 > 500 || Statics.field35 - var94 < -500 || Statics.field35 - var94 > 500) {
                                                    Statics.field852 = var93;
                                                    Statics.field35 = var94;
                                                }
                                                if (Statics.field852 != var93) {
                                                    Statics.field852 += (var93 - Statics.field852) / 16;
                                                }
                                                if (Statics.field35 != var94) {
                                                    Statics.field35 += (var94 - Statics.field35) / 16;
                                                }
                                                if (class60.field746 == 4 && Statics.field952) {
                                                    int var95 = class60.field748 - field1020;
                                                    field1018 = var95 * 2;
                                                    field1020 = var95 == -1 || var95 == 1 ? class60.field748 : (field1020 + class60.field748) / 2;
                                                    int var96 = field1019 - class60.field753;
                                                    field990 = var96 * 2;
                                                    field1019 = var96 == -1 || var96 == 1 ? class60.field753 : (field1019 + class60.field753) / 2;
                                                } else {
                                                    if (class51.field652[96]) {
                                                        field990 += (-24 - field990) / 2;
                                                    } else if (class51.field652[97]) {
                                                        field990 += (24 - field990) / 2;
                                                    } else {
                                                        field990 /= 2;
                                                    }
                                                    if (class51.field652[98]) {
                                                        field1018 += (12 - field1018) / 2;
                                                    } else if (class51.field652[99]) {
                                                        field1018 += (-12 - field1018) / 2;
                                                    } else {
                                                        field1018 /= 2;
                                                    }
                                                    field1020 = class60.field748;
                                                    field1019 = class60.field753;
                                                }
                                                field1016 = field990 / 2 + field1016 & 0x7FF;
                                                field957 += field1018 / 2;
                                                if (field957 < 128) {
                                                    field957 = 128;
                                                }
                                                if (field957 > 383) {
                                                    field957 = 383;
                                                }
                                                int var97 = Statics.field852 >> 7;
                                                int var98 = Statics.field35 >> 7;
                                                int var99 = method3812(Statics.field852, Statics.field35, Statics.field409);
                                                int var100 = 0;
                                                if (var97 > 3 && var98 > 3 && var97 < 100 && var98 < 100) {
                                                    for (int var101 = var97 - 4; var101 <= var97 + 4; var101++) {
                                                        for (int var102 = var98 - 4; var102 <= var98 + 4; var102++) {
                                                            int var103 = Statics.field409;
                                                            if (var103 < 3 && (class62.field764[1][var101][var102] & 0x2) == 2) {
                                                                var103++;
                                                            }
                                                            int var104 = var99 - class62.field768[var103][var101][var102];
                                                            if (var104 > var100) {
                                                                var100 = var104;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var105 = var100 * 192;
                                                if (var105 > 98048) {
                                                    var105 = 98048;
                                                }
                                                if (var105 < 32768) {
                                                    var105 = 32768;
                                                }
                                                if (var105 > field1024) {
                                                    field1024 += (var105 - field1024) / 24;
                                                } else if (var105 < field1024) {
                                                    field1024 += (var105 - field1024) / 80;
                                                }
                                                if (field1179) {
                                                    method2157();
                                                }
                                                for (int var106 = 0; var106 < 5; var106++) {
                                                    int var10002 = field1184[var106]++;
                                                }
                                                Statics.field17.method1672();
                                                int var107 = ++class60.field742 - 1;
                                                int var109 = class51.field663;
                                                if (var107 > 15000 && var109 > 15000) {
                                                    field1059 = 250;
                                                    class60.method1613(14500);
                                                    field986.method3243(217);
                                                }
                                                for (class68 var111 = (class68) field1201.method3448(); var111 != null; var111 = (class68) field1201.method3449()) {
                                                    if ((long) var111.field844 < class177.method608() / 1000L - 5L) {
                                                        if (var111.field839 > 0) {
                                                            class98.method1380(5, "", var111.field843 + class227.field3032);
                                                        }
                                                        if (var111.field839 == 0) {
                                                            class98.method1380(5, "", var111.field843 + class227.field3007);
                                                        }
                                                        var111.method3463();
                                                    }
                                                }
                                                field992++;
                                                if (field992 > 50) {
                                                    field986.method3243(80);
                                                }
                                                try {
                                                    if (Statics.field869 != null && field986.field2395 > 0) {
                                                        Statics.field869.method2813(field986.field2392, 0, field986.field2395);
                                                        field986.field2395 = 0;
                                                        field992 = 0;
                                                    }
                                                } catch (IOException var113) {
                                                    if (field1059 > 0) {
                                                        method477();
                                                    } else {
                                                        method492(40);
                                                        Statics.field2566 = Statics.field869;
                                                        Statics.field869 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var80 = var79.field859;
                                            if (var80.field2744 < 0) {
                                                break;
                                            }
                                            var81 = class218.method2924(var80.field2678);
                                        } while (var81 == null || var81.field2680 == null || var80.field2744 >= var81.field2680.length || var81.field2680[var80.field2744] != var80);
                                        class83.method2765(var79);
                                    }
                                }
                                var77 = var76.field859;
                                if (var77.field2744 < 0) {
                                    break;
                                }
                                var78 = class218.method2924(var77.field2678);
                            } while (var78 == null || var78.field2680 == null || var77.field2744 >= var78.field2680.length || var78.field2680[var77.field2744] != var77);
                            class83.method2765(var76);
                        }
                    }
                    var74 = var73.field859;
                    if (var74.field2744 < 0) {
                        break;
                    }
                    var75 = class218.method2924(var74.field2678);
                } while (var75 == null || var75.field2680 == null || var74.field2744 >= var75.field2680.length || var75.field2680[var74.field2744] != var74);
                class83.method2765(var73);
            }
        } else if (field1059 > 0) {
            method477();
        } else {
            method492(40);
            Statics.field2566 = Statics.field869;
            Statics.field869 = null;
        }
    }

    @ObfuscatedName("ar.fx(I)V")
    public static final void method226() {
        if (Statics.field249 != null) {
            Statics.field249.method1881();
        }
        if (Statics.field1774 != null) {
            Statics.field1774.method1881();
        }
    }

    @ObfuscatedName("x.fh(I)V")
    public static final void method168() {
        for (int var0 = 0; var0 < field1173; var0++) {
            int var10002 = field1002[var0]--;
            if (field1002[var0] >= -10) {
                class105 var2 = field1178[var0];
                if (var2 == null) {
                    class105 var10000 = (class105) null;
                    var2 = class105.method1794(Statics.field2420, field1174[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1002[var0] += var2.method1788();
                    field1178[var0] = var2;
                }
                if (field1002[var0] < 0) {
                    int var9;
                    if (field1177[var0] == 0) {
                        var9 = field1186;
                    } else {
                        int var3 = (field1177[var0] & 0xFF) * 128;
                        int var4 = field1177[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field908.field1233;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1177[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field908.field1232;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1002[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1172 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class107 var10 = var2.method1787().method1828(Statics.field2593);
                        class117 var11 = class117.method1955(var10, 100, var9);
                        var11.method1958(field1175[var0] - 1);
                        Statics.field480.method1761(var11);
                    }
                    field1002[var0] = -100;
                }
            } else {
                field1173--;
                for (int var1 = var0; var1 < field1173; var1++) {
                    field1174[var1] = field1174[var1 + 1];
                    field1178[var1] = field1178[var1 + 1];
                    field1175[var1] = field1175[var1 + 1];
                    field1002[var1] = field1002[var1 + 1];
                    field1177[var1] = field1177[var1 + 1];
                }
                var0--;
            }
        }
        if (!field1170) {
            return;
        }
        boolean var12;
        if (class205.field2508 == 0) {
            var12 = Statics.field2857.method3552();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field1168 != 0 && field1169 != -1) {
                class205.method2134(Statics.field601, field1169, 0, field1168, false);
            }
            field1170 = false;
        }
    }

    @ObfuscatedName("ed.fr(Ljw;IIIB)V")
    public static void method2500(class262 arg0, int arg1, int arg2, int arg3) {
        if (field1173 >= 50 || field1172 == 0 || arg0.field3600 == null || arg1 >= arg0.field3600.length) {
            return;
        }
        int var4 = arg0.field3600[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1174[field1173] = var5;
        field1175[field1173] = var6;
        field1002[field1173] = 0;
        field1178[field1173] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1177[field1173] = (var8 << 16) + (var9 << 8) + var7;
        field1173++;
    }

    @ObfuscatedName("ev.fk(II)V")
    public static void method2731(int arg0) {
        if (arg0 == -1 && !field1170) {
            class205.method2905();
        } else if (arg0 != -1 && field1169 != arg0 && field1168 != 0 && !field1170) {
            class205.method647(2, Statics.field601, arg0, 0, field1168, false);
        }
        field1169 = arg0;
    }

    @ObfuscatedName("s.fs(IIB)V")
    public static void method47(int arg0, int arg1) {
        if (field1168 != 0 && arg0 != -1) {
            class205.method2134(Statics.field610, arg0, 0, field1168, false);
            field1170 = true;
        }
    }

    @ObfuscatedName("an.fv(Lhx;III)V")
    public static final void method577(class218 arg0, int arg1, int arg2) {
        if (field1080 != 0 && field1080 != 3 || class60.field755 != 1 && Statics.field952 || class60.field755 != 4) {
            return;
        }
        class212 var3 = arg0.method3740(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field754 - arg1;
        int var5 = class60.field740 - arg2;
        if (!var3.method3672(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2601 / 2;
        int var7 = var5 - var3.field2600 / 2;
        int var8 = field1016 & 0x7FF;
        int var9 = class136.field2045[var8];
        int var10 = class136.field2029[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field908.field1233 + var11 >> 7;
        int var14 = Statics.field908.field1232 - var12 >> 7;
        field986.method3243(128);
        field986.method3102(18);
        field986.method3026(Statics.field2202 + var13);
        field986.method2978(Statics.field840 + var14);
        field986.method3114(class51.field652[82] ? (class51.field652[81] ? 2 : 1) : 0);
        field986.method3102(var6);
        field986.method3102(var7);
        field986.method2978(field1016);
        field986.method3102(57);
        field986.method3102(0);
        field986.method3102(0);
        field986.method3102(89);
        field986.method2978(Statics.field908.field1233);
        field986.method2978(Statics.field908.field1232);
        field986.method3102(63);
        field1165 = var13;
        field1166 = var14;
    }

    @ObfuscatedName("da.fg(B)V")
    public static final void method2157() {
        int var0 = Statics.field3679 * 128 + 64;
        int var1 = Statics.field1394 * 128 + 64;
        int var2 = method3812(var0, var1, Statics.field409) - Statics.field1882;
        if (Statics.field1357 < var0) {
            Statics.field1357 += Statics.field251 * (var0 - Statics.field1357) / 1000 + Statics.field1393;
            if (Statics.field1357 > var0) {
                Statics.field1357 = var0;
            }
        }
        if (Statics.field1357 > var0) {
            Statics.field1357 -= Statics.field251 * (Statics.field1357 - var0) / 1000 + Statics.field1393;
            if (Statics.field1357 < var0) {
                Statics.field1357 = var0;
            }
        }
        if (Statics.field877 < var2) {
            Statics.field877 += Statics.field251 * (var2 - Statics.field877) / 1000 + Statics.field1393;
            if (Statics.field877 > var2) {
                Statics.field877 = var2;
            }
        }
        if (Statics.field877 > var2) {
            Statics.field877 -= Statics.field251 * (Statics.field877 - var2) / 1000 + Statics.field1393;
            if (Statics.field877 < var2) {
                Statics.field877 = var2;
            }
        }
        if (Statics.field2265 < var1) {
            Statics.field2265 += Statics.field251 * (var1 - Statics.field2265) / 1000 + Statics.field1393;
            if (Statics.field2265 > var1) {
                Statics.field2265 = var1;
            }
        }
        if (Statics.field2265 > var1) {
            Statics.field2265 -= Statics.field251 * (Statics.field2265 - var1) / 1000 + Statics.field1393;
            if (Statics.field2265 < var1) {
                Statics.field2265 = var1;
            }
        }
        int var3 = Statics.field1422 * 128 + 64;
        int var4 = Statics.field791 * 128 + 64;
        int var5 = method3812(var3, var4, Statics.field409) - Statics.field2341;
        int var6 = var3 - Statics.field1357;
        int var7 = var5 - Statics.field877;
        int var8 = var4 - Statics.field2265;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field824 < var10) {
            Statics.field824 += Statics.field2219 * (var10 - Statics.field824) / 1000 + Statics.field813;
            if (Statics.field824 > var10) {
                Statics.field824 = var10;
            }
        }
        if (Statics.field824 > var10) {
            Statics.field824 -= Statics.field2219 * (Statics.field824 - var10) / 1000 + Statics.field813;
            if (Statics.field824 < var10) {
                Statics.field824 = var10;
            }
        }
        int var12 = var11 - Statics.field873;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field873 += Statics.field2219 * var12 / 1000 + Statics.field813;
            Statics.field873 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field873 -= Statics.field2219 * -var12 / 1000 + Statics.field813;
            Statics.field873 &= 0x7FF;
        }
        int var13 = var11 - Statics.field873;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field873 = var11;
        }
    }

    @ObfuscatedName("cj.fq(Lbg;II)V")
    public static final void method1407(class78 arg0, int arg1) {
        if (arg0.field1276 > field973) {
            int var2 = arg0.field1276 - field973;
            int var3 = arg0.field1272 * 128 + arg0.field1234 * 64;
            int var4 = arg0.field1234 * 64 + arg0.field1230 * 128;
            arg0.field1233 += (var3 - arg0.field1233) / var2;
            arg0.field1232 += (var4 - arg0.field1232) / var2;
            arg0.field1288 = 0;
            arg0.field1281 = arg0.field1278;
        } else if (arg0.field1277 >= field973) {
            method1708(arg0);
        } else {
            method2831(arg0);
        }
        if (arg0.field1233 < 128 || arg0.field1232 < 128 || arg0.field1233 >= 13184 || arg0.field1232 >= 13184) {
            arg0.field1257 = -1;
            arg0.field1267 = -1;
            arg0.field1276 = 0;
            arg0.field1277 = 0;
            arg0.field1233 = arg0.field1248[0] * 128 + arg0.field1234 * 64;
            arg0.field1232 = arg0.field1242[0] * 128 + arg0.field1234 * 64;
            arg0.method1390();
        }
        if (Statics.field908 == arg0 && (arg0.field1233 < 1536 || arg0.field1232 < 1536 || arg0.field1233 >= 11776 || arg0.field1232 >= 11776)) {
            arg0.field1257 = -1;
            arg0.field1267 = -1;
            arg0.field1276 = 0;
            arg0.field1277 = 0;
            arg0.field1233 = arg0.field1248[0] * 128 + arg0.field1234 * 64;
            arg0.field1232 = arg0.field1242[0] * 128 + arg0.field1234 * 64;
            arg0.method1390();
        }
        method2407(arg0);
        method194(arg0);
    }

    @ObfuscatedName("ck.fl(Lbg;B)V")
    public static final void method1708(class78 arg0) {
        if (field973 == arg0.field1277 || arg0.field1257 == -1 || arg0.field1262 != 0 || arg0.field1264 + 1 > class262.method3737(arg0.field1257).field3604[arg0.field1263]) {
            int var1 = arg0.field1277 - arg0.field1276;
            int var2 = field973 - arg0.field1276;
            int var3 = arg0.field1272 * 128 + arg0.field1234 * 64;
            int var4 = arg0.field1234 * 64 + arg0.field1230 * 128;
            int var5 = arg0.field1240 * 128 + arg0.field1234 * 64;
            int var6 = arg0.field1275 * 128 + arg0.field1234 * 64;
            arg0.field1233 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1232 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1288 = 0;
        arg0.field1281 = arg0.field1278;
        arg0.field1236 = arg0.field1281;
    }

    @ObfuscatedName("ff.fa(Lbg;I)V")
    public static final void method2831(class78 arg0) {
        arg0.field1259 = arg0.field1235;
        if (arg0.field1284 == 0) {
            arg0.field1288 = 0;
            return;
        }
        if (arg0.field1257 != -1 && arg0.field1262 == 0) {
            class262 var1 = class262.method3737(arg0.field1257);
            if (arg0.field1250 > 0 && var1.field3613 == 0) {
                arg0.field1288++;
                return;
            }
            if (arg0.field1250 <= 0 && var1.field3609 == 0) {
                arg0.field1288++;
                return;
            }
        }
        int var2 = arg0.field1233;
        int var3 = arg0.field1232;
        int var4 = arg0.field1248[arg0.field1284 - 1] * 128 + arg0.field1234 * 64;
        int var5 = arg0.field1242[arg0.field1284 - 1] * 128 + arg0.field1234 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1281 = 1280;
            } else if (var3 > var5) {
                arg0.field1281 = 1792;
            } else {
                arg0.field1281 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1281 = 768;
            } else if (var3 > var5) {
                arg0.field1281 = 256;
            } else {
                arg0.field1281 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1281 = 1024;
        } else if (var3 > var5) {
            arg0.field1281 = 0;
        }
        byte var6 = arg0.field1287[arg0.field1284 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1233 = var4;
            arg0.field1232 = var5;
            arg0.field1284--;
            if (arg0.field1250 > 0) {
                arg0.field1250--;
            }
            return;
        }
        int var7 = arg0.field1281 - arg0.field1236 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1239;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1269;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1231;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1289;
        }
        if (var8 == -1) {
            var8 = arg0.field1269;
        }
        arg0.field1259 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class86) {
            var10 = ((class86) arg0).field1382.field3555;
        }
        if (var10) {
            if (arg0.field1281 != arg0.field1236 && arg0.field1256 == -1 && arg0.field1283 != 0) {
                var9 = 2;
            }
            if (arg0.field1284 > 2) {
                var9 = 6;
            }
            if (arg0.field1284 > 3) {
                var9 = 8;
            }
            if (arg0.field1288 > 0 && arg0.field1284 > 1) {
                var9 = 8;
                arg0.field1288--;
            }
        } else {
            if (arg0.field1284 > 1) {
                var9 = 6;
            }
            if (arg0.field1284 > 2) {
                var9 = 8;
            }
            if (arg0.field1288 > 0 && arg0.field1284 > 1) {
                var9 = 8;
                arg0.field1288--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1269 == arg0.field1259 && arg0.field1273 != -1) {
            arg0.field1259 = arg0.field1273;
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
                arg0.field1232 += var9;
                if (arg0.field1232 > var5) {
                    arg0.field1232 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1232 -= var9;
                if (arg0.field1232 < var5) {
                    arg0.field1232 = var5;
                }
            }
        }
        if (arg0.field1233 == var4 && arg0.field1232 == var5) {
            arg0.field1284--;
            if (arg0.field1250 > 0) {
                arg0.field1250--;
            }
        }
    }

    @ObfuscatedName("ey.fz(Lbg;B)V")
    public static final void method2407(class78 arg0) {
        if (arg0.field1283 == 0) {
            return;
        }
        if (arg0.field1256 != -1) {
            class78 var1 = null;
            if (arg0.field1256 < 32768) {
                var1 = field1097[arg0.field1256];
            } else if (arg0.field1256 >= 32768) {
                var1 = field1106[arg0.field1256 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1233 - var1.field1233;
                int var3 = arg0.field1232 - var1.field1232;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1281 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1265) {
                arg0.field1256 = -1;
                arg0.field1265 = false;
            }
        }
        if (arg0.field1258 != -1 && (arg0.field1284 == 0 || arg0.field1288 > 0)) {
            arg0.field1281 = arg0.field1258;
            arg0.field1258 = -1;
        }
        int var4 = arg0.field1281 - arg0.field1236 & 0x7FF;
        if (var4 == 0 && arg0.field1265) {
            arg0.field1256 = -1;
            arg0.field1265 = false;
        }
        if (var4 == 0) {
            arg0.field1282 = 0;
            return;
        }
        arg0.field1282++;
        if (var4 > 1024) {
            arg0.field1236 -= arg0.field1283;
            boolean var5 = true;
            if (var4 < arg0.field1283 || var4 > 2048 - arg0.field1283) {
                arg0.field1236 = arg0.field1281;
                var5 = false;
            }
            if (arg0.field1259 == arg0.field1235 && (arg0.field1282 > 25 || var5)) {
                if (arg0.field1254 == -1) {
                    arg0.field1259 = arg0.field1269;
                } else {
                    arg0.field1259 = arg0.field1254;
                }
            }
        } else {
            arg0.field1236 += arg0.field1283;
            boolean var6 = true;
            if (var4 < arg0.field1283 || var4 > 2048 - arg0.field1283) {
                arg0.field1236 = arg0.field1281;
                var6 = false;
            }
            if (arg0.field1259 == arg0.field1235 && (arg0.field1282 > 25 || var6)) {
                if (arg0.field1252 == -1) {
                    arg0.field1259 = arg0.field1269;
                } else {
                    arg0.field1259 = arg0.field1252;
                }
            }
        }
        arg0.field1236 &= 0x7FF;
    }

    @ObfuscatedName("w.fw(Lbg;S)V")
    public static final void method194(class78 arg0) {
        arg0.field1285 = false;
        if (arg0.field1259 != -1) {
            class262 var1 = class262.method3737(arg0.field1259);
            if (var1 == null || var1.field3614 == null) {
                arg0.field1259 = -1;
            } else {
                arg0.field1274++;
                if (arg0.field1260 < var1.field3614.length && arg0.field1274 > var1.field3604[arg0.field1260]) {
                    arg0.field1274 = 1;
                    arg0.field1260++;
                    method2500(var1, arg0.field1260, arg0.field1233, arg0.field1232);
                }
                if (arg0.field1260 >= var1.field3614.length) {
                    arg0.field1274 = 0;
                    arg0.field1260 = 0;
                    method2500(var1, arg0.field1260, arg0.field1233, arg0.field1232);
                }
            }
        }
        if (arg0.field1267 != -1 && field973 >= arg0.field1270) {
            if (arg0.field1268 < 0) {
                arg0.field1268 = 0;
            }
            int var2 = class247.method80(arg0.field1267).field3333;
            if (var2 == -1) {
                arg0.field1267 = -1;
            } else {
                class262 var3 = class262.method3737(var2);
                if (var3 == null || var3.field3614 == null) {
                    arg0.field1267 = -1;
                } else {
                    arg0.field1241++;
                    if (arg0.field1268 < var3.field3614.length && arg0.field1241 > var3.field3604[arg0.field1268]) {
                        arg0.field1241 = 1;
                        arg0.field1268++;
                        method2500(var3, arg0.field1268, arg0.field1233, arg0.field1232);
                    }
                    if (arg0.field1268 >= var3.field3614.length && (arg0.field1268 < 0 || arg0.field1268 >= var3.field3614.length)) {
                        arg0.field1267 = -1;
                    }
                }
            }
        }
        if (arg0.field1257 != -1 && arg0.field1262 <= 1) {
            class262 var4 = class262.method3737(arg0.field1257);
            if (var4.field3613 == 1 && arg0.field1250 > 0 && arg0.field1276 <= field973 && arg0.field1277 < field973) {
                arg0.field1262 = 1;
                return;
            }
        }
        if (arg0.field1257 != -1 && arg0.field1262 == 0) {
            class262 var5 = class262.method3737(arg0.field1257);
            if (var5 == null || var5.field3614 == null) {
                arg0.field1257 = -1;
            } else {
                arg0.field1264++;
                if (arg0.field1263 < var5.field3614.length && arg0.field1264 > var5.field3604[arg0.field1263]) {
                    arg0.field1264 = 1;
                    arg0.field1263++;
                    method2500(var5, arg0.field1263, arg0.field1233, arg0.field1232);
                }
                if (arg0.field1263 >= var5.field3614.length) {
                    arg0.field1263 -= var5.field3605;
                    arg0.field1266++;
                    if (arg0.field1266 >= var5.field3606) {
                        arg0.field1257 = -1;
                    } else if (arg0.field1263 >= 0 && arg0.field1263 < var5.field3614.length) {
                        method2500(var5, arg0.field1263, arg0.field1233, arg0.field1232);
                    } else {
                        arg0.field1257 = -1;
                    }
                }
                arg0.field1285 = var5.field3608;
            }
        }
        if (arg0.field1262 > 0) {
            arg0.field1262--;
        }
    }

    @ObfuscatedName("c.fi(Lbo;IIS)V")
    public static void method82(class75 arg0, int arg1, int arg2) {
        if (arg0.field1257 == arg1 && arg1 != -1) {
            int var3 = class262.method3737(arg1).field3615;
            if (var3 == 1) {
                arg0.field1263 = 0;
                arg0.field1264 = 0;
                arg0.field1262 = arg2;
                arg0.field1266 = 0;
            }
            if (var3 == 2) {
                arg0.field1266 = 0;
            }
        } else if (arg1 == -1 || arg0.field1257 == -1 || class262.method3737(arg1).field3597 >= class262.method3737(arg0.field1257).field3597) {
            arg0.field1257 = arg1;
            arg0.field1263 = 0;
            arg0.field1264 = 0;
            arg0.field1262 = arg2;
            arg0.field1266 = 0;
            arg0.field1250 = arg0.field1284;
        }
    }

    @ObfuscatedName("ao.fp(I)I")
    public static int method530() {
        return field1197 ? 2 : 1;
    }

    @ObfuscatedName("u.fu(I)V")
    public static void method131() {
        field986.method3243(229);
        class181 var0 = field986;
        int var1 = field1197 ? 2 : 1;
        var0.method3102(var1);
        field986.method2978(Statics.field1467);
        field986.method2978(Statics.field801);
    }

    @ObfuscatedName("client.c(B)V")
    public final void method783() {
        field1105 = class177.method608() + 500L;
        this.method1067();
        if (field1092 != -1) {
            this.method1073(true);
        }
    }

    @ObfuscatedName("client.ft(B)V")
    public void method1067() {
        int var1 = Statics.field1467;
        int var2 = Statics.field801;
        if (this.field702 < var1) {
            int var3 = this.field702;
        }
        if (this.field715 < var2) {
            int var4 = this.field715;
        }
        if (Statics.field2396 == null) {
            return;
        }
        try {
            client var5 = Statics.field1402;
            int var6 = field1197 ? 2 : 1;
            Object[] var7 = new Object[] { var6 };
            JSObject.getWindow(var5).call("resize", var7);
        } catch (Throwable var9) {
        }
    }

    @ObfuscatedName("client.fm(I)V")
    public final void method1057() {
        if (field1092 != -1) {
            int var1 = field1092;
            if (class218.method66(var1)) {
                method358(Statics.field3666[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1066; var2++) {
            if (field1111[var2]) {
                field967[var2] = true;
            }
            field1139[var2] = field1111[var2];
            field1111[var2] = false;
        }
        field1072 = field973;
        field1081 = -1;
        field1127 = -1;
        Statics.field279 = null;
        if (field1092 != -1) {
            field1066 = 0;
            method9(field1092, 0, 0, Statics.field1467, Statics.field801, 0, 0, -1);
        }
        class283.method4548();
        if (field987) {
            method10();
        } else if (field1081 != -1) {
            int var3 = field1081;
            int var4 = field1127;
            if (field1071 >= 2 || field1137 != 0 || field1064) {
                int var5 = Statics.method704();
                String var6;
                if (field1137 == 1 && field1071 < 2) {
                    var6 = class227.field3009 + class227.field3019 + field1086 + " " + class88.field1399;
                } else if (field1064 && field1071 < 2) {
                    var6 = field1090 + class227.field3019 + field1091 + " " + class88.field1399;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field1171[var5].length() > 0) {
                        var7 = field1076[var5] + class227.field3019 + field1171[var5];
                    } else {
                        var7 = field1076[var5];
                    }
                    var6 = var7;
                }
                if (field1071 > 2) {
                    var6 = var6 + class88.method1003(16777215) + " " + '/' + " " + (field1071 - 2) + class227.field2977;
                }
                Statics.field898.method4402(var6, var3 + 4, var4 + 15, 16777215, 0, field973 / 1000);
            }
        }
        if (field1144 == 3) {
            for (int var8 = 0; var8 < field1066; var8++) {
                if (field1139[var8]) {
                    class283.method4556(field1140[var8], field1010[var8], field1142[var8], field1143[var8], 16711935, 128);
                } else if (field967[var8]) {
                    class283.method4556(field1140[var8], field1010[var8], field1142[var8], field1143[var8], 16711680, 128);
                }
            }
        }
        class82.method1002(Statics.field409, Statics.field908.field1233, Statics.field908.field1232, field1008);
        field1008 = 0;
    }

    @ObfuscatedName("ba.fy(Ljava/lang/String;ZB)V")
    public static final void method988(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field538.method4391(arg0, 250);
        int var6 = Statics.field538.method4461(arg0, 250) * 13;
        class283.method4557(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class283.method4588(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field538.method4456(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1713(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field343.method760(0, 0);
        } else {
            method74(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("client.fe(IIIIS)V")
    public static final void method1379(int arg0, int arg1, int arg2, int arg3) {
        field1036++;
        method160(class67.field829);
        boolean var4 = false;
        if (field1061 >= 0) {
            int var5 = class96.field1508;
            int[] var6 = class96.field1512;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field1061 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method160(class67.field830);
        }
        method232(true);
        method160(var4 ? class67.field831 : class67.field832);
        method232(false);
        method656();
        for (class84 var8 = (class84) field1065.method3410(); var8 != null; var8 = (class84) field1065.method3412()) {
            if (Statics.field409 != var8.field1361 || var8.field1368) {
                var8.method3397();
            } else if (field973 >= var8.field1360) {
                var8.method1545(field1008);
                if (var8.field1368) {
                    var8.method3397();
                } else {
                    Statics.field785.method2672(var8.field1361, var8.field1359, var8.field1363, var8.field1364, 60, var8, 0, -1, false);
                }
            }
        }
        method342(arg0, arg1, arg2, arg3, true);
        int var9 = field1193;
        int var10 = field1194;
        int var11 = field1195;
        int var12 = field1196;
        class283.method4549(var9, var10, var9 + var11, var10 + var12);
        class136.method2411();
        if (!field1179) {
            int var13 = field957;
            if (field1024 / 256 > var13) {
                var13 = field1024 / 256;
            }
            if (field1180[4] && field1182[4] + 128 > var13) {
                var13 = field1182[4] + 128;
            }
            int var14 = field1016 & 0x7FF;
            int var15 = Statics.field852;
            int var16 = method3812(Statics.field908.field1233, Statics.field908.field1232, Statics.field409) - field1021;
            int var17 = Statics.field35;
            int var18 = var13 * 3 + 600;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 2048 - var14 & 0x7FF;
            int var21 = 0;
            int var22 = 0;
            int var23 = var18;
            if (var19 != 0) {
                int var24 = class136.field2045[var19];
                int var25 = class136.field2029[var19];
                int var26 = var22 * var25 - var18 * var24 >> 16;
                var23 = var22 * var24 + var18 * var25 >> 16;
                var22 = var26;
            }
            if (var20 != 0) {
                int var27 = class136.field2045[var20];
                int var28 = class136.field2029[var20];
                int var29 = var21 * var28 + var23 * var27 >> 16;
                var23 = var23 * var28 - var21 * var27 >> 16;
                var21 = var29;
            }
            Statics.field1357 = var15 - var21;
            Statics.field877 = var16 - var22;
            Statics.field2265 = var17 - var23;
            Statics.field824 = var13;
            Statics.field873 = var14;
        }
        int var30;
        if (field1179) {
            var30 = Statics.method43();
        } else {
            var30 = method607();
        }
        int var31 = Statics.field1357;
        int var32 = Statics.field877;
        int var33 = Statics.field2265;
        int var34 = Statics.field824;
        int var35 = Statics.field873;
        for (int var36 = 0; var36 < 5; var36++) {
            if (field1180[var36]) {
                int var37 = (int) (Math.random() * (double) (field1181[var36] * 2 + 1) - (double) field1181[var36] + Math.sin((double) field1146[var36] / 100.0D * (double) field1184[var36]) * (double) field1182[var36]);
                if (var36 == 0) {
                    Statics.field1357 += var37;
                }
                if (var36 == 1) {
                    Statics.field877 += var37;
                }
                if (var36 == 2) {
                    Statics.field2265 += var37;
                }
                if (var36 == 3) {
                    Statics.field873 = Statics.field873 + var37 & 0x7FF;
                }
                if (var36 == 4) {
                    Statics.field824 += var37;
                    if (Statics.field824 < 128) {
                        Statics.field824 = 128;
                    }
                    if (Statics.field824 > 383) {
                        Statics.field824 = 383;
                    }
                }
            }
        }
        int var38 = class60.field753;
        int var39 = class60.field748;
        if (class60.field755 != 0) {
            var38 = class60.field754;
            var39 = class60.field740;
        }
        if (var38 >= var9 && var38 < var9 + var11 && var39 >= var10 && var39 < var10 + var12) {
            int var40 = var38 - var9;
            int var41 = var39 - var10;
            class134.field2003 = var40;
            class134.field2002 = var41;
            class134.field2012 = true;
            class134.field2010 = 0;
            class134.field2005 = false;
        } else {
            class134.field2012 = false;
            class134.field2010 = 0;
        }
        method226();
        class283.method4557(var9, var10, var11, var12, 0);
        method226();
        int var42 = class136.field2031;
        class136.field2031 = field1141;
        Statics.field785.method2547(Statics.field1357, Statics.field877, Statics.field2265, Statics.field824, Statics.field873, var30);
        while (true) {
            class10 var43 = (class10) class8.field232.method3391();
            if (var43 == null) {
                class136.field2031 = var42;
                method226();
                Statics.field785.method2521();
                Statics.method3266(var9, var10, var11, var12);
                method1290(var9, var10);
                ((class125) Statics.field2042).method2193(field1008);
                method183(var9, var10, var11, var12);
                Statics.field1357 = var31;
                Statics.field877 = var32;
                Statics.field2265 = var33;
                Statics.field824 = var34;
                Statics.field873 = var35;
                if (field1101 && class240.method756(true, false) == 0) {
                    field1101 = false;
                }
                if (field1101) {
                    class283.method4557(var9, var10, var11, var12, 0);
                    method988(class227.field2869, false);
                }
                return;
            }
            var43.method35();
        }
    }

    @ObfuscatedName("aq.fn(IIIIZS)V")
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
        int var6 = (field1098 - field1185) * var5 / 100 + field1185;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1191) {
            short var8 = field1191;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1190) {
                var6 = field1190;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class283.method4548();
                    class283.method4557(arg0, arg1, var10, arg3, -16777216);
                    class283.method4557(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1192) {
            short var11 = field1192;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1189) {
                var6 = field1189;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class283.method4548();
                    class283.method4557(arg0, arg1, arg2, var13, -16777216);
                    class283.method4557(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1053 - field1187) * var5 / 100 + field1187;
        field1141 = arg3 * var6 * var14 / 85504 << 1;
        if (field1195 != arg2 || field1196 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class136.field2045[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class139.method2647(var15, 500, 800, arg2, arg3);
        }
        field1193 = arg0;
        field1194 = arg1;
        field1195 = arg2;
        field1196 = arg3;
    }

    @ObfuscatedName("p.fj(Lbn;I)V")
    public static final void method160(class67 arg0) {
        if (Statics.field908.field1233 >> 7 == field1165 && Statics.field908.field1232 >> 7 == field1166) {
            field1165 = 0;
        }
        int var1 = class96.field1508;
        int[] var2 = class96.field1512;
        int var3 = var1;
        if (class67.field829 == arg0 || class67.field830 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field829 == arg0) {
                var5 = Statics.field908;
                var6 = Statics.field908.field924 << 14;
            } else if (class67.field830 == arg0) {
                var5 = field1106[field1061];
                var6 = field1061 << 14;
            } else {
                var5 = field1106[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field831 == arg0 && field1061 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1050() && !var5.field926) {
                var5.field920 = false;
                if ((field941 && var1 > 50 || var1 > 200) && class67.field829 != arg0 && var5.field1259 == var5.field1235) {
                    var5.field920 = true;
                }
                int var7 = var5.field1233 >> 7;
                int var8 = var5.field1232 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field915 == null || field973 < var5.field930 || field973 >= var5.field922) {
                        if ((var5.field1233 & 0x7F) == 64 && (var5.field1232 & 0x7F) == 64) {
                            if (field1036 == field1035[var7][var8]) {
                                continue;
                            }
                            field1035[var7][var8] = field1036;
                        }
                        var5.field909 = method3812(var5.field1233, var5.field1232, Statics.field409);
                        Statics.field785.method2672(Statics.field409, var5.field1233, var5.field1232, var5.field909, 60, var5, var5.field1236, var6, var5.field1285);
                    } else {
                        var5.field920 = false;
                        var5.field909 = method3812(var5.field1233, var5.field1232, Statics.field409);
                        Statics.field785.method2519(Statics.field409, var5.field1233, var5.field1232, var5.field909, 60, var5, var5.field1236, var6, var5.field916, var5.field917, var5.field923, var5.field901);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.gz(ZI)V")
    public static final void method232(boolean arg0) {
        for (int var1 = 0; var1 < field947; var1++) {
            class86 var2 = field1097[field983[var1]];
            int var3 = (field983[var1] << 14) + 536870912;
            if (var2 != null && var2.method1050() && var2.field1382.field3572 == arg0 && var2.field1382.method4297()) {
                int var4 = var2.field1233 >> 7;
                int var5 = var2.field1232 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1234 == 1 && (var2.field1233 & 0x7F) == 64 && (var2.field1232 & 0x7F) == 64) {
                        if (field1036 == field1035[var4][var5]) {
                            continue;
                        }
                        field1035[var4][var5] = field1036;
                    }
                    if (!var2.field1382.field3580) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field785.method2672(Statics.field409, var2.field1233, var2.field1232, method3812(var2.field1233 + (var2.field1234 * 64 - 64), var2.field1232 + (var2.field1234 * 64 - 64), Statics.field409), var2.field1234 * 64 - 64 + 60, var2, var2.field1236, var3, var2.field1285);
                }
            }
        }
    }

    @ObfuscatedName("ap.gc(I)V")
    public static final void method656() {
        for (class93 var0 = (class93) field1040.method3410(); var0 != null; var0 = (class93) field1040.method3412()) {
            if (Statics.field409 != var0.field1470 || field973 > var0.field1482) {
                var0.method3397();
            } else if (field973 >= var0.field1475) {
                if (var0.field1479 > 0) {
                    class86 var1 = field1097[var0.field1479 - 1];
                    if (var1 != null && var1.field1233 >= 0 && var1.field1233 < 13312 && var1.field1232 >= 0 && var1.field1232 < 13312) {
                        var0.method1620(var1.field1233, var1.field1232, method3812(var1.field1233, var1.field1232, var0.field1470) - var0.field1474, field973);
                    }
                }
                if (var0.field1479 < 0) {
                    int var2 = -var0.field1479 - 1;
                    class75 var3;
                    if (field1028 == var2) {
                        var3 = Statics.field908;
                    } else {
                        var3 = field1106[var2];
                    }
                    if (var3 != null && var3.field1233 >= 0 && var3.field1233 < 13312 && var3.field1232 >= 0 && var3.field1232 < 13312) {
                        var0.method1620(var3.field1233, var3.field1232, method3812(var3.field1233, var3.field1232, var0.field1470) - var0.field1474, field973);
                    }
                }
                var0.method1621(field1008);
                Statics.field785.method2672(Statics.field409, (int) var0.field1473, (int) var0.field1489, (int) var0.field1493, 60, var0, var0.field1481, -1, false);
            }
        }
    }

    @ObfuscatedName("af.gl(I)I")
    public static final int method607() {
        if (Statics.field2396.field1317) {
            return Statics.field409;
        }
        int var0 = 3;
        if (Statics.field824 < 310) {
            int var1 = Statics.field1357 >> 7;
            int var2 = Statics.field2265 >> 7;
            int var3 = Statics.field908.field1233 >> 7;
            int var4 = Statics.field908.field1232 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field409;
            }
            if ((class62.field764[Statics.field409][var1][var2] & 0x4) != 0) {
                var0 = Statics.field409;
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
                    if ((class62.field764[Statics.field409][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field409;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class62.field764[Statics.field409][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field409;
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
                    if ((class62.field764[Statics.field409][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field409;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class62.field764[Statics.field409][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field409;
                        }
                    }
                }
            }
        }
        if (Statics.field908.field1233 >= 0 && Statics.field908.field1232 >= 0 && Statics.field908.field1233 < 13312 && Statics.field908.field1232 < 13312) {
            if ((class62.field764[Statics.field409][Statics.field908.field1233 >> 7][Statics.field908.field1232 >> 7] & 0x4) != 0) {
                var0 = Statics.field409;
            }
            return var0;
        } else {
            return Statics.field409;
        }
    }

    @ObfuscatedName("client.gw(III)V")
    public static final void method1290(int arg0, int arg1) {
        if (field959 == 2) {
            method752((field981 - Statics.field2202 << 7) + field988, (field963 - Statics.field840 << 7) + field966, field1095 * 2);
            if (field977 > -1 && field973 % 20 < 10) {
                Statics.field259[0].method4673(field977 + arg0 - 12, field1038 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ax.gi(Lbg;IIIIII)V")
    public static final void method227(class78 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1050()) {
            return;
        }
        if (arg0 instanceof class86) {
            class260 var6 = ((class86) arg0).field1382;
            if (var6.field3577 != null) {
                var6 = var6.method4295();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class96.field1508;
        int[] var8 = class96.field1512;
        int var9 = 3;
        if (!arg0.field1255.method3382()) {
            method2975(arg0, arg0.field1280 + 15);
            for (class85 var10 = (class85) arg0.field1255.method3379(); var10 != null; var10 = (class85) arg0.field1255.method3381()) {
                class79 var11 = var10.method1550(field973);
                if (var11 != null) {
                    class250 var12 = var10.field1376;
                    class287 var13 = var12.method4076();
                    class287 var14 = var12.method4078();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3377;
                    } else {
                        if (var12.field3378 * 2 < var14.field3785) {
                            var15 = var12.field3378;
                        }
                        var16 = var14.field3785 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field973 - var11.field1296;
                    int var20 = var11.field1294 * var16 / var12.field3377;
                    int var23;
                    if (var11.field1295 > var19) {
                        int var21 = var12.field3373 == 0 ? 0 : var19 / var12.field3373 * var12.field3373;
                        int var22 = var11.field1292 * var16 / var12.field3377;
                        var23 = (var20 - var22) * var21 / var11.field1295 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1295 + var12.field3374 - var19;
                        if (var12.field3372 >= 0) {
                            var17 = (var24 << 8) / (var12.field3374 - var12.field3372);
                        }
                    }
                    if (var11.field1294 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field977 + arg2 - (var16 >> 1);
                    int var26 = field1038 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field977 > -1) {
                            class283.method4557(var25, var26, var23, 5, 65280);
                            class283.method4557(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3790;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4669(var27, var26, var17);
                            class283.method4550(var27, var26, var27 + var28, var26 + var29);
                            var14.method4669(var27, var26, var17);
                        } else {
                            var13.method4673(var27, var26);
                            class283.method4550(var27, var26, var27 + var28, var26 + var29);
                            var14.method4673(var27, var26);
                        }
                        class283.method4549(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1551()) {
                    var10.method3397();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field926) {
                return;
            }
            if (var30.field903 != -1 || var30.field904 != -1) {
                method2975(arg0, arg0.field1280 + 15);
                if (field977 > -1) {
                    if (var30.field903 != -1) {
                        Statics.field1502[var30.field903].method4673(field977 + arg2 - 12, field1038 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field904 != -1) {
                        Statics.field280[var30.field904].method4673(field977 + arg2 - 12, field1038 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field959 == 10 && field961 == var8[arg1]) {
                method2975(arg0, arg0.field1280 + 15);
                if (field977 > -1) {
                    Statics.field259[1].method4673(field977 + arg2 - 12, field1038 + arg3 - var9);
                }
            }
        } else {
            class260 var31 = ((class86) arg0).field1382;
            if (var31.field3577 != null) {
                var31 = var31.method4295();
            }
            if (var31.field3549 >= 0 && var31.field3549 < Statics.field280.length) {
                method2975(arg0, arg0.field1280 + 15);
                if (field977 > -1) {
                    Statics.field280[var31.field3549].method4673(field977 + arg2 - 12, field1038 + arg3 - 30);
                }
            }
            if (field959 == 1 && field960 == field983[arg1 - var7] && field973 % 20 < 10) {
                method2975(arg0, arg0.field1280 + 15);
                if (field977 > -1) {
                    Statics.field259[0].method4673(field977 + arg2 - 12, field1038 + arg3 - 28);
                }
            }
        }
        if (arg0.field1243 != null && (arg1 >= var7 || !arg0.field1245 && (field1149 == 4 || !arg0.field1244 && (field1149 == 0 || field1149 == 3 || field1149 == 1 && method1402(((class75) arg0).field925, false))))) {
            method2975(arg0, arg0.field1280);
            if (field977 > -1 && field1025 < field1026) {
                field1030[field1025] = Statics.field898.method4442(arg0.field1243) / 2;
                field1119[field1025] = Statics.field898.field3637;
                field1027[field1025] = field977;
                field1202[field1025] = field1038;
                field1031[field1025] = arg0.field1247;
                field1032[field1025] = arg0.field1238;
                field1033[field1025] = arg0.field1246;
                field994[field1025] = arg0.field1243;
                field1025++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1286[var32];
            int var34 = arg0.field1237[var32];
            class256 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field973) {
                    continue;
                }
                var35 = class256.method977(arg0.field1237[var32]);
                var36 = var35.field3421;
                if (var35 != null && var35.field3432 != null) {
                    var35 = var35.method4164();
                    if (var35 == null) {
                        arg0.field1286[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1253[var32];
            class256 var38 = null;
            if (var37 >= 0) {
                var38 = class256.method977(var37);
                if (var38 != null && var38.field3432 != null) {
                    var38 = var38.method4164();
                }
            }
            if (var33 - var36 <= field973) {
                if (var35 == null) {
                    arg0.field1286[var32] = -1;
                } else {
                    method2975(arg0, arg0.field1280 / 2);
                    if (field977 > -1) {
                        if (var32 == 1) {
                            field1038 -= 20;
                        }
                        if (var32 == 2) {
                            field977 -= 15;
                            field1038 -= 10;
                        }
                        if (var32 == 3) {
                            field977 += 15;
                            field1038 -= 10;
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
                        class287 var51 = null;
                        class287 var52 = null;
                        class287 var53 = null;
                        class287 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class287 var64 = var35.method4166();
                        if (var64 != null) {
                            var43 = var64.field3785;
                            int var65 = var64.field3790;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3788;
                        }
                        class287 var66 = var35.method4174();
                        if (var66 != null) {
                            var44 = var66.field3785;
                            int var67 = var66.field3790;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3788;
                        }
                        class287 var68 = var35.method4168();
                        if (var68 != null) {
                            var45 = var68.field3785;
                            int var69 = var68.field3790;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3788;
                        }
                        class287 var70 = var35.method4169();
                        if (var70 != null) {
                            var46 = var70.field3785;
                            int var71 = var70.field3790;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3788;
                        }
                        if (var38 != null) {
                            var51 = var38.method4166();
                            if (var51 != null) {
                                var55 = var51.field3785;
                                int var72 = var51.field3790;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3788;
                            }
                            var52 = var38.method4174();
                            if (var52 != null) {
                                var56 = var52.field3785;
                                int var73 = var52.field3790;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3788;
                            }
                            var53 = var38.method4168();
                            if (var53 != null) {
                                var57 = var53.field3785;
                                int var74 = var53.field3790;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3788;
                            }
                            var54 = var38.method4169();
                            if (var54 != null) {
                                var58 = var54.field3785;
                                int var75 = var54.field3790;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3788;
                            }
                        }
                        class265 var76 = var35.method4170();
                        if (var76 == null) {
                            var76 = Statics.field448;
                        }
                        class265 var77;
                        if (var38 == null) {
                            var77 = Statics.field448;
                        } else {
                            var77 = var38.method4170();
                            if (var77 == null) {
                                var77 = Statics.field448;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4165(arg0.field1251[var32]);
                        int var83 = var76.method4442(var82);
                        if (var38 != null) {
                            var79 = var38.method4165(arg0.field1279[var32]);
                            var81 = var77.method4442(var79);
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
                        int var100 = arg0.field1286[var32] - field973;
                        int var101 = var35.field3415 - var35.field3415 * var100 / var35.field3421;
                        int var102 = var35.field3427 * var100 / var35.field3421 + -var35.field3427;
                        int var103 = field977 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1038 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3413 + var104 + 15;
                        int var108 = var107 - var76.field3641;
                        int var109 = var76.field3638 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3413 + var104 + 15;
                            int var111 = var110 - var77.field3641;
                            int var112 = var77.field3638 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3412 >= 0) {
                            var115 = (var100 << 8) / (var35.field3421 - var35.field3412);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4669(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4669(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4669(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4669(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4438(var82, var90 + var103, var107, var35.field3416, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4669(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4669(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4669(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4669(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4438(var79, var98 + var103, var110, var38.field3416, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4673(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4673(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4673(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4673(var93 + var103 - var50, var104);
                            }
                            var76.method4440(var82, var90 + var103, var107, var35.field3416 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4673(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4673(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4673(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4673(var97 + var103 - var62, var104);
                                }
                                var77.method4440(var79, var98 + var103, var110, var38.field3416 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.gk(B)V")
    public static final void method1007() {
        field1051 = 0;
        int var0 = (Statics.field908.field1233 >> 7) + Statics.field2202;
        int var1 = (Statics.field908.field1232 >> 7) + Statics.field840;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1051 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1051 = 1;
        }
        if (field1051 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1051 = 0;
        }
    }

    @ObfuscatedName("f.gp(IIIIB)V")
    public static final void method183(int arg0, int arg1, int arg2, int arg3) {
        if (field1042 == 1) {
            Statics.field2542[field1041 / 100].method4673(field1039 - 8, field996 - 8);
        }
        if (field1042 == 2) {
            Statics.field2542[field1041 / 100 + 4].method4673(field1039 - 8, field996 - 8);
        }
        method1007();
    }

    @ObfuscatedName("fi.gg(Lbg;II)V")
    public static final void method2975(class78 arg0, int arg1) {
        method752(arg0.field1233, arg0.field1232, arg1);
    }

    @ObfuscatedName("bv.gn(IIIB)V")
    public static final void method752(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field977 = -1;
            field1038 = -1;
            return;
        }
        int var3 = method3812(arg0, arg1, Statics.field409) - arg2;
        int var4 = arg0 - Statics.field1357;
        int var5 = var3 - Statics.field877;
        int var6 = arg1 - Statics.field2265;
        int var7 = class136.field2045[Statics.field824];
        int var8 = class136.field2029[Statics.field824];
        int var9 = class136.field2045[Statics.field873];
        int var10 = class136.field2029[Statics.field873];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field977 = field1141 * var11 / var15 + field1195 / 2;
            field1038 = field1141 * var14 / var15 + field1196 / 2;
        } else {
            field977 = -1;
            field1038 = -1;
        }
    }

    @ObfuscatedName("hy.gs(IIII)I")
    public static final int method3812(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field764[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field768[var5][var3][var4] + class62.field768[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field768[var5][var3][var4 + 1] + class62.field768[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ch.gt(ZI)V")
    public static final void method1567(boolean arg0) {
        field1005 = arg0;
        if (!field1005) {
            int var1 = field1110.method3029();
            int var2 = field1110.method3198();
            int var3 = field1110.method2995();
            Statics.field738 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field738[var4][var5] = field1110.method2998();
                }
            }
            Statics.field521 = new int[var3];
            Statics.field870 = new int[var3];
            Statics.field2408 = new int[var3];
            Statics.field1794 = new byte[var3][];
            Statics.field851 = new byte[var3][];
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
                        Statics.field521[var7] = var10;
                        Statics.field870[var7] = Statics.field679.method3840("m" + var8 + "_" + var9);
                        Statics.field2408[var7] = Statics.field679.method3840("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method1006(var2, var1, true);
            return;
        }
        boolean var11 = field1110.method2999() == 1;
        int var12 = field1110.method3056();
        int var13 = field1110.method3029();
        int var14 = field1110.method2995();
        field1110.method3226();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field1110.method3230(1);
                    if (var18 == 1) {
                        field1006[var15][var16][var17] = field1110.method3230(26);
                    } else {
                        field1006[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field1110.method3231();
        Statics.field738 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field738[var19][var20] = field1110.method2998();
            }
        }
        Statics.field521 = new int[var14];
        Statics.field870 = new int[var14];
        Statics.field2408 = new int[var14];
        Statics.field1794 = new byte[var14][];
        Statics.field851 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field1006[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field521[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field521[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field870[var21] = Statics.field679.method3840("m" + var30 + "_" + var31);
                            Statics.field2408[var21] = Statics.field679.method3840("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method1006(var13, var12, !var11);
    }

    @ObfuscatedName("be.go(IIZB)V")
    public static final void method1006(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field408 == arg0 && Statics.field304 == arg1) {
            return;
        }
        Statics.field408 = arg0;
        Statics.field304 = arg1;
        method492(25);
        method988(class227.field2869, true);
        int var3 = Statics.field2202;
        int var4 = Statics.field840;
        Statics.field2202 = (arg0 - 6) * 8;
        Statics.field840 = (arg1 - 6) * 8;
        int var5 = Statics.field2202 - var3;
        int var6 = Statics.field840 - var4;
        int var7 = Statics.field2202;
        int var8 = Statics.field840;
        for (int var9 = 0; var9 < 32768; var9++) {
            class86 var10 = field1097[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1248[var11] -= var5;
                    var10.field1242[var11] -= var6;
                }
                var10.field1233 -= var5 * 128;
                var10.field1232 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1106[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1248[var14] -= var5;
                    var13.field1242[var14] -= var6;
                }
                var13.field1233 -= var5 * 128;
                var13.field1232 -= var6 * 128;
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
                        field1062[var25][var21][var22] = field1062[var25][var23][var24];
                    } else {
                        field1062[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1063.method3410(); var26 != null; var26 = (class77) field1063.method3412()) {
            var26.field1215 -= var5;
            var26.field1216 -= var6;
            if (var26.field1215 < 0 || var26.field1216 < 0 || var26.field1215 >= 104 || var26.field1216 >= 104) {
                var26.method3397();
            }
        }
        if (field1165 != 0) {
            field1165 -= var5;
            field1166 -= var6;
        }
        field1173 = 0;
        field1179 = false;
        field1160 = -1;
        field1065.method3404();
        field1040.method3404();
        for (int var27 = 0; var27 < 4; var27++) {
            field1004[var27].method2851();
        }
    }

    @ObfuscatedName("au.gv(ZB)V")
    public static final void method703(boolean arg0) {
        method226();
        field992++;
        if (field992 < 50 && !arg0) {
            return;
        }
        field992 = 0;
        if (field997 || Statics.field869 == null) {
            return;
        }
        field986.method3243(80);
        try {
            Statics.field869.method2813(field986.field2392, 0, field986.field2395);
            field986.field2395 = 0;
        } catch (IOException var2) {
            field997 = true;
        }
    }

    @ObfuscatedName("do.gb(IIIIIB)V")
    public static final void method2289(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field785.method2691(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field785.method2536(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field316.field3787;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class257 var13 = class257.method2716(var12);
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
                class286 var14 = Statics.field243[var13.field3477];
                if (var14 != null) {
                    int var15 = (var13.field3450 * 4 - var14.field3777) / 2;
                    int var16 = (var13.field3451 * 4 - var14.field3782) / 2;
                    var14.method4637(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3451) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field785.method2670(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field785.method2536(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class257 var22 = class257.method2716(var21);
            if (var22.field3477 != -1) {
                class286 var23 = Statics.field243[var22.field3477];
                if (var23 != null) {
                    int var24 = (var22.field3450 * 4 - var23.field3777) / 2;
                    int var25 = (var22.field3451 * 4 - var23.field3782) / 2;
                    var23.method4637(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3451) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field316.field3787;
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
        int var29 = Statics.field785.method2557(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class257 var31 = class257.method2716(var30);
        if (var31.field3477 == -1) {
            return;
        }
        class286 var32 = Statics.field243[var31.field3477];
        if (var32 != null) {
            int var33 = (var31.field3450 * 4 - var32.field3777) / 2;
            int var34 = (var31.field3451 * 4 - var32.field3782) / 2;
            var32.method4637(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3451) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gf(S)Z")
    public final boolean method1069() {
        if (Statics.field869 == null) {
            return false;
        }
        try {
            int var1 = Statics.field869.method2816();
            if (var1 == 0) {
                return false;
            }
            if (field965 == -1) {
                Statics.field869.method2821(field1110.field2392, 0, 1);
                field1110.field2395 = 0;
                field965 = field1110.method3228();
                field989 = class274.field3687[field965];
                var1--;
            }
            if (field989 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field869.method2821(field1110.field2392, 0, 1);
                field989 = field1110.field2392[0] & 0xFF;
                var1--;
            }
            if (field989 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field869.method2821(field1110.field2392, 0, 2);
                field1110.field2395 = 0;
                field989 = field1110.method2995();
                var1 -= 2;
            }
            if (var1 < field989) {
                return false;
            }
            field1110.field2395 = 0;
            Statics.field869.method2821(field1110.field2392, 0, field989);
            field991 = 0;
            field995 = field958;
            field958 = field993;
            field993 = field965;
            if (field965 == 20) {
                for (int var2 = 0; var2 < field1106.length; var2++) {
                    if (field1106[var2] != null) {
                        field1106[var2].field1257 = -1;
                    }
                }
                for (int var3 = 0; var3 < field1097.length; var3++) {
                    if (field1097[var3] != null) {
                        field1097[var3].field1257 = -1;
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 179) {
                field1179 = true;
                Statics.field1422 = field1110.method2999();
                Statics.field791 = field1110.method2999();
                Statics.field2341 = field1110.method2995();
                Statics.field813 = field1110.method2999();
                Statics.field2219 = field1110.method2999();
                if (Statics.field2219 >= 100) {
                    int var4 = Statics.field1422 * 128 + 64;
                    int var5 = Statics.field791 * 128 + 64;
                    int var6 = method3812(var4, var5, Statics.field409) - Statics.field2341;
                    int var7 = var4 - Statics.field1357;
                    int var8 = var6 - Statics.field877;
                    int var9 = var5 - Statics.field2265;
                    int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
                    Statics.field824 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
                    Statics.field873 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
                    if (Statics.field824 < 128) {
                        Statics.field824 = 128;
                    }
                    if (Statics.field824 > 383) {
                        Statics.field824 = 383;
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 39) {
                class96.method555(field1110, field989);
                field965 = -1;
                return true;
            }
            if (field965 == 52) {
                int var11 = field1110.method2999();
                class278[] var12 = new class278[] { class278.field3737, class278.field3738, class278.field3736 };
                class278[] var13 = var12;
                int var14 = 0;
                class278 var16;
                while (true) {
                    if (var14 >= var13.length) {
                        var16 = null;
                        break;
                    }
                    class278 var15 = var13[var14];
                    if (var15.field3739 == var11) {
                        var16 = var15;
                        break;
                    }
                    var14++;
                }
                Statics.field294 = var16;
                field965 = -1;
                return true;
            }
            if (field965 == 70) {
                int var17 = field1110.method2996();
                int var18 = field1110.method3032();
                int var19 = field1110.method2998();
                class218 var20 = class218.method2924(var19);
                if (var20.field2668 != var17 || var20.field2721 != var18 || var20.field2664 != 0 || var20.field2665 != 0) {
                    var20.field2668 = var17;
                    var20.field2721 = var18;
                    var20.field2664 = 0;
                    var20.field2665 = 0;
                    method31(var20);
                    this.method1291(var20);
                    if (var20.field2661 == 0) {
                        method1001(Statics.field3666[var19 >> 16], var20, false);
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 64) {
                int var21 = field1110.method3023();
                int var22 = field1110.method2999();
                String var23 = field1110.method3002();
                if (var21 >= 1 && var21 <= 8) {
                    if (var23.equalsIgnoreCase("null")) {
                        var23 = null;
                    }
                    field1058[var21 - 1] = var23;
                    field1138[var21 - 1] = var22 == 0;
                }
                field965 = -1;
                return true;
            }
            if (field965 == 251) {
                int var24 = field1110.method3038();
                class218 var25 = class218.method2924(var24);
                for (int var26 = 0; var26 < var25.field2777.length; var26++) {
                    var25.field2777[var26] = -1;
                    var25.field2777[var26] = 0;
                }
                method31(var25);
                field965 = -1;
                return true;
            }
            if (field965 == 57) {
                int var27 = field1110.method3040();
                int var28 = field1110.method3198();
                class218 var29 = class218.method2924(var27);
                if (var29.field2782 != 1 || var29.field2703 != var28) {
                    var29.field2782 = 1;
                    var29.field2703 = var28;
                    method31(var29);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 53) {
                int var30 = field1110.method3040();
                String var31 = field1110.method3002();
                class218 var32 = class218.method2924(var30);
                if (!var31.equals(var32.field2719)) {
                    var32.field2719 = var31;
                    method31(var32);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 90) {
                int var33 = field1110.method3029();
                field1092 = var33;
                this.method1073(false);
                method3858(var33);
                class83.method794(field1092);
                for (int var34 = 0; var34 < 100; var34++) {
                    field1111[var34] = true;
                }
                field965 = -1;
                return true;
            }
            if (field965 == 98) {
                int var35 = field1110.method2998();
                int var36 = field1110.method2995();
                if (var35 < -70000) {
                    var36 += 32768;
                }
                class218 var37;
                if (var35 >= 0) {
                    var37 = class218.method2924(var35);
                } else {
                    var37 = null;
                }
                if (var37 != null) {
                    for (int var38 = 0; var38 < var37.field2777.length; var38++) {
                        var37.field2777[var38] = 0;
                        var37.field2778[var38] = 0;
                    }
                }
                class64.method2408(var36);
                int var39 = field1110.method2995();
                for (int var40 = 0; var40 < var39; var40++) {
                    int var41 = field1110.method2995();
                    int var42 = field1110.method3023();
                    if (var42 == 255) {
                        var42 = field1110.method3040();
                    }
                    if (var37 != null && var40 < var37.field2777.length) {
                        var37.field2777[var40] = var41;
                        var37.field2778[var40] = var42;
                    }
                    class64.method4138(var36, var40, var41 - 1, var42);
                }
                if (var37 != null) {
                    method31(var37);
                }
                method46();
                field1120[++field1121 - 1 & 0x1F] = var36 & 0x7FFF;
                field965 = -1;
                return true;
            }
            if (field965 == 89) {
                int var43 = field1110.method2999();
                if (field1110.method2999() == 0) {
                    field1015[var43] = new class17();
                    field1110.field2395 += 18;
                } else {
                    field1110.field2395--;
                    field1015[var43] = new class17(field1110, false);
                }
                field975 = field1167;
                field965 = -1;
                return true;
            }
            if (field965 == 145) {
                int var44 = field1110.method3007();
                boolean var45 = field1110.method2999() == 1;
                String var46 = "";
                boolean var47 = false;
                if (var45) {
                    var46 = field1110.method3002();
                    if (method187(var46)) {
                        var47 = true;
                    }
                }
                String var48 = field1110.method3002();
                if (!var47) {
                    class98.method1380(var44, var46, var48);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 226) {
                int var49 = field1110.method3038();
                int var50 = field1110.method2995();
                class218 var51 = class218.method2924(var49);
                if (var51.field2782 != 2 || var51.field2703 != var50) {
                    var51.field2782 = 2;
                    var51.field2703 = var50;
                    method31(var51);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 24) {
                int var52 = field1110.method2999();
                int var53 = field1110.method2999();
                int var54 = field1110.method2999();
                int var55 = field1110.method2999();
                field1180[var52] = true;
                field1181[var52] = var53;
                field1182[var52] = var54;
                field1146[var52] = var55;
                field1184[var52] = 0;
                field965 = -1;
                return true;
            }
            if (field965 == 76) {
                int var56 = field1110.method2998();
                int var57 = field1110.method2995();
                if (var56 < -70000) {
                    var57 += 32768;
                }
                class218 var58;
                if (var56 >= 0) {
                    var58 = class218.method2924(var56);
                } else {
                    var58 = null;
                }
                while (field1110.field2395 < field989) {
                    int var59 = field1110.method3007();
                    int var60 = field1110.method2995();
                    int var61 = 0;
                    if (var60 != 0) {
                        var61 = field1110.method2999();
                        if (var61 == 255) {
                            var61 = field1110.method2998();
                        }
                    }
                    if (var58 != null && var59 >= 0 && var59 < var58.field2777.length) {
                        var58.field2777[var59] = var60;
                        var58.field2778[var59] = var61;
                    }
                    class64.method4138(var57, var59, var60 - 1, var61);
                }
                if (var58 != null) {
                    method31(var58);
                }
                method46();
                field1120[++field1121 - 1 & 0x1F] = var57 & 0x7FFF;
                field965 = -1;
                return true;
            }
            if (field965 == 239) {
                class181 var62 = field1110;
                int var63 = field989;
                class281 var64 = new class281();
                var64.field3745 = var62.method2999();
                var64.field3750 = var62.method2998();
                var64.field3746 = new int[var64.field3745];
                var64.field3753 = new int[var64.field3745];
                var64.field3748 = new Field[var64.field3745];
                var64.field3749 = new int[var64.field3745];
                var64.field3747 = new Method[var64.field3745];
                var64.field3744 = new byte[var64.field3745][][];
                for (int var65 = 0; var65 < var64.field3745; var65++) {
                    try {
                        int var66 = var62.method2999();
                        if (var66 == 0 || var66 == 1 || var66 == 2) {
                            String var67 = var62.method3002();
                            String var68 = var62.method3002();
                            int var69 = 0;
                            if (var66 == 1) {
                                var69 = var62.method2998();
                            }
                            var64.field3746[var65] = var66;
                            var64.field3749[var65] = var69;
                            if (class282.method506(var67).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var64.field3748[var65] = class282.method506(var67).getDeclaredField(var68);
                        } else if (var66 == 3 || var66 == 4) {
                            String var70 = var62.method3002();
                            String var71 = var62.method3002();
                            int var72 = var62.method2999();
                            String[] var73 = new String[var72];
                            for (int var74 = 0; var74 < var72; var74++) {
                                var73[var74] = var62.method3002();
                            }
                            String var75 = var62.method3002();
                            byte[][] var76 = new byte[var72][];
                            if (var66 == 3) {
                                for (int var77 = 0; var77 < var72; var77++) {
                                    int var78 = var62.method2998();
                                    var76[var77] = new byte[var78];
                                    var62.method3005(var76[var77], 0, var78);
                                }
                            }
                            var64.field3746[var65] = var66;
                            Class[] var79 = new Class[var72];
                            for (int var80 = 0; var80 < var72; var80++) {
                                var79[var80] = class282.method506(var73[var80]);
                            }
                            Class var81 = class282.method506(var75);
                            if (class282.method506(var70).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var82 = class282.method506(var70).getDeclaredMethods();
                            Method[] var83 = var82;
                            for (int var84 = 0; var84 < var83.length; var84++) {
                                Method var85 = var83[var84];
                                if (var85.getName().equals(var71)) {
                                    Class[] var86 = var85.getParameterTypes();
                                    if (var79.length == var86.length) {
                                        boolean var87 = true;
                                        for (int var88 = 0; var88 < var79.length; var88++) {
                                            if (var79[var88] != var86[var88]) {
                                                var87 = false;
                                                break;
                                            }
                                        }
                                        if (var87 && var81 == var85.getReturnType()) {
                                            var64.field3747[var65] = var85;
                                        }
                                    }
                                }
                            }
                            var64.field3744[var65] = var76;
                        }
                    } catch (ClassNotFoundException var332) {
                        var64.field3753[var65] = -1;
                    } catch (SecurityException var333) {
                        var64.field3753[var65] = -2;
                    } catch (NullPointerException var334) {
                        var64.field3753[var65] = -3;
                    } catch (Exception var335) {
                        var64.field3753[var65] = -4;
                    } catch (Throwable var336) {
                        var64.field3753[var65] = -5;
                    }
                }
                class282.field3758.method3375(var64);
                field965 = -1;
                return true;
            }
            if (field965 == 144) {
                Statics.field354 = field1110.method3059();
                Statics.field530 = field1110.method3059();
                for (int var94 = Statics.field354; var94 < Statics.field354 + 8; var94++) {
                    for (int var95 = Statics.field530; var95 < Statics.field530 + 8; var95++) {
                        if (field1062[Statics.field409][var94][var95] != null) {
                            field1062[Statics.field409][var94][var95] = null;
                            method3500(var94, var95);
                        }
                    }
                }
                for (class77 var96 = (class77) field1063.method3410(); var96 != null; var96 = (class77) field1063.method3412()) {
                    if (var96.field1215 >= Statics.field354 && var96.field1215 < Statics.field354 + 8 && var96.field1216 >= Statics.field530 && var96.field1216 < Statics.field530 + 8 && Statics.field409 == var96.field1217) {
                        var96.field1224 = 0;
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 63) {
                field1179 = true;
                Statics.field3679 = field1110.method2999();
                Statics.field1394 = field1110.method2999();
                Statics.field1882 = field1110.method2995();
                Statics.field1393 = field1110.method2999();
                Statics.field251 = field1110.method2999();
                if (Statics.field251 >= 100) {
                    Statics.field1357 = Statics.field3679 * 128 + 64;
                    Statics.field2265 = Statics.field1394 * 128 + 64;
                    Statics.field877 = method3812(Statics.field1357, Statics.field2265, Statics.field409) - Statics.field1882;
                }
                field965 = -1;
                return true;
            }
            if (field965 == 2) {
                class96.field1508 = 0;
                for (int var97 = 0; var97 < 2048; var97++) {
                    class96.field1507[var97] = null;
                    class96.field1514[var97] = 1;
                }
                for (int var98 = 0; var98 < 2048; var98++) {
                    field1106[var98] = null;
                }
                class96.method3268(field1110);
                field965 = -1;
                return true;
            }
            if (field965 == 84) {
                int var99 = field1110.method3039();
                boolean var100 = field1110.method3138() == 1;
                class218 var101 = class218.method2924(var99);
                if (var101.field2679 != var100) {
                    var101.field2679 = var100;
                    method31(var101);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 104) {
                method477();
                field965 = -1;
                return false;
            }
            if (field965 == 97) {
                Statics.field530 = field1110.method2999();
                Statics.field354 = field1110.method2999();
                field965 = -1;
                return true;
            }
            if (field965 == 191) {
                int var102 = field1110.method3023();
                int var103 = field1110.method3039();
                int var104 = field1110.method2995();
                class69 var105 = (class69) field1093.method3358((long) var103);
                if (var105 != null) {
                    method1030(var105, var105.field847 != var104);
                }
                method1506(var103, var104, var102);
                field965 = -1;
                return true;
            }
            if (field965 == 209) {
                int var106 = field1110.method2995();
                class64.method2(var106);
                field1120[++field1121 - 1 & 0x1F] = var106 & 0x7FFF;
                field965 = -1;
                return true;
            }
            if (field965 == 131) {
                field1149 = field1110.method2999();
                field1150 = field1110.method2999();
                field965 = -1;
                return true;
            }
            if (field965 == 235) {
                int var107 = field1110.method3040();
                int var108 = field1110.method3198();
                int var109 = var108 >> 10 & 0x1F;
                int var110 = var108 >> 5 & 0x1F;
                int var111 = var108 & 0x1F;
                int var112 = (var111 << 3) + (var109 << 19) + (var110 << 11);
                class218 var113 = class218.method2924(var107);
                if (var113.field2792 != var112) {
                    var113.field2792 = var112;
                    method31(var113);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 78) {
                while (field1110.field2395 < field989) {
                    int var114 = field1110.method2999();
                    boolean var115 = (var114 & 0x1) == 1;
                    String var116 = field1110.method3002();
                    String var117 = field1110.method3002();
                    field1110.method3002();
                    for (int var118 = 0; var118 < field962; var118++) {
                        class71 var119 = field1203[var118];
                        if (var115) {
                            if (var117.equals(var119.field876)) {
                                var119.field876 = var116;
                                var119.field872 = var117;
                                var116 = null;
                                break;
                            }
                        } else if (var116.equals(var119.field876)) {
                            var119.field876 = var116;
                            var119.field872 = var117;
                            var116 = null;
                            break;
                        }
                    }
                    if (var116 != null && field962 < 400) {
                        class71 var120 = new class71();
                        field1203[field962] = var120;
                        var120.field876 = var116;
                        var120.field872 = var117;
                        field962++;
                    }
                }
                field1125 = field1167;
                field965 = -1;
                return true;
            }
            if (field965 == 243 || field965 == 170 || field965 == 37 || field965 == 157 || field965 == 28 || field965 == 56 || field965 == 0 || field965 == 136 || field965 == 184 || field965 == 201) {
                method130();
                field965 = -1;
                return true;
            }
            if (field965 == 129) {
                String var121 = field1110.method3002();
                Object[] var122 = new Object[var121.length() + 1];
                for (int var123 = var121.length() - 1; var123 >= 0; var123--) {
                    if (var121.charAt(var123) == 's') {
                        var122[var123 + 1] = field1110.method3002();
                    } else {
                        var122[var123 + 1] = Integer.valueOf(field1110.method2998());
                    }
                }
                var122[0] = Integer.valueOf(field1110.method2998());
                class70 var124 = new class70();
                var124.field865 = var122;
                class83.method2765(var124);
                field965 = -1;
                return true;
            }
            if (field965 == 46) {
                int var125 = field1110.method2998();
                int var126 = field1110.method2998();
                int var127 = 0;
                if (Statics.field255 == null || !Statics.field255.isValid()) {
                    try {
                        Iterator var128 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var128.hasNext()) {
                            GarbageCollectorMXBean var129 = (GarbageCollectorMXBean) var128.next();
                            if (var129.isValid()) {
                                Statics.field255 = var129;
                                field735 = -1L;
                                field734 = -1L;
                            }
                        }
                    } catch (Throwable var331) {
                    }
                }
                if (Statics.field255 != null) {
                    long var131 = class177.method608();
                    long var133 = Statics.field255.getCollectionTime();
                    if (field734 != -1L) {
                        long var135 = var133 - field734;
                        long var137 = var131 - field735;
                        if (var137 != 0L) {
                            var127 = (int) (var135 * 100L / var137);
                        }
                    }
                    field734 = var133;
                    field735 = var131;
                }
                field986.method3243(204);
                field986.method3114(field710);
                field986.method3118(var125);
                field986.method3118(var126);
                field986.method3157(var127);
                field965 = -1;
                return true;
            }
            if (field965 == 34) {
                int var141 = field1110.method3056();
                if (var141 == 65535) {
                    var141 = -1;
                }
                int var142 = field1110.method3040();
                int var143 = field1110.method3040();
                class218 var144 = class218.method2924(var143);
                if (var144.field2658) {
                    var144.field2779 = var141;
                    var144.field2780 = var142;
                    class258 var146 = class258.method2955(var141);
                    var144.field2710 = var146.field3500;
                    var144.field2711 = var146.field3485;
                    var144.field2737 = var146.field3502;
                    var144.field2708 = var146.field3503;
                    var144.field2648 = var146.field3504;
                    var144.field2713 = var146.field3508;
                    if (var146.field3491 == 1) {
                        var144.field2717 = 1;
                    } else {
                        var144.field2717 = 2;
                    }
                    if (var144.field2714 > 0) {
                        var144.field2713 = var144.field2713 * 32 / var144.field2714;
                    } else if (var144.field2686 > 0) {
                        var144.field2713 = var144.field2713 * 32 / var144.field2686;
                    }
                    method31(var144);
                } else if (var141 == -1) {
                    var144.field2782 = 0;
                    field965 = -1;
                    return true;
                } else {
                    class258 var145 = class258.method2955(var141);
                    var144.field2782 = 4;
                    var144.field2703 = var141;
                    var144.field2710 = var145.field3500;
                    var144.field2711 = var145.field3485;
                    var144.field2713 = var145.field3508 * 100 / var142;
                    method31(var144);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 200) {
                for (int var147 = 0; var147 < Statics.field3292; var147++) {
                    class243 var148 = class243.method479(var147);
                    if (var148 != null) {
                        class213.field2615[var147] = 0;
                        class213.field2609[var147] = 0;
                    }
                }
                method46();
                field982 += 32;
                field965 = -1;
                return true;
            }
            if (field965 == 236) {
                int var149 = field1110.method3038();
                int var150 = field1110.method3039();
                class69 var151 = (class69) field1093.method3358((long) var150);
                class69 var152 = (class69) field1093.method3358((long) var149);
                if (var152 != null) {
                    method1030(var152, var151 == null || var151.field847 != var152.field847);
                }
                if (var151 != null) {
                    var151.method3397();
                    field1093.method3359(var151, (long) var149);
                }
                class218 var153 = class218.method2924(var150);
                if (var153 != null) {
                    method31(var153);
                }
                class218 var154 = class218.method2924(var149);
                if (var154 != null) {
                    method31(var154);
                    method1001(Statics.field3666[var154.field2659 >>> 16], var154, true);
                }
                if (field1092 != -1) {
                    int var155 = field1092;
                    if (class218.method66(var155)) {
                        method1020(Statics.field3666[var155], 1);
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 42) {
                Statics.field354 = field1110.method3023();
                Statics.field530 = field1110.method3023();
                while (field1110.field2395 < field989) {
                    field965 = field1110.method2999();
                    method130();
                }
                field965 = -1;
                return true;
            }
            if (field965 == 17) {
                if (field1092 != -1) {
                    int var156 = field1092;
                    if (class218.method66(var156)) {
                        method1020(Statics.field3666[var156], 0);
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 252) {
                field1110.field2395 += 28;
                if (field1110.method3017()) {
                    method224(field1110, field1110.field2395 - 28);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 101) {
                field1080 = field1110.method2999();
                field965 = -1;
                return true;
            }
            if (field965 == 36) {
                method1567(true);
                field1110.method3228();
                int var157 = field1110.method2995();
                class96.method555(field1110, var157);
                field965 = -1;
                return true;
            }
            if (field965 == 68) {
                boolean var158 = field1110.method2999() == 1;
                if (var158) {
                    Statics.field335 = class177.method608() - field1110.method2981();
                    Statics.field2442 = new class14(field1110, true);
                } else {
                    Statics.field2442 = null;
                }
                field1117 = field1167;
                field965 = -1;
                return true;
            }
            if (field965 == 135) {
                int var159 = field1110.method3032();
                int var160 = field1110.method2998();
                class218 var161 = class218.method2924(var160);
                if (var161.field2784 != var159 || var159 == -1) {
                    var161.field2784 = var159;
                    var161.field2781 = 0;
                    var161.field2735 = 0;
                    method31(var161);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 225) {
                method246(false);
                field965 = -1;
                return true;
            }
            if (field965 == 231) {
                method46();
                field972 = field1110.method2996();
                field1147 = field1167;
                field965 = -1;
                return true;
            }
            if (field965 == 29) {
                int var162 = field1110.method3198();
                if (var162 == 65535) {
                    var162 = -1;
                }
                int var163 = field1110.method3056();
                if (var163 == 65535) {
                    var163 = -1;
                }
                int var164 = field1110.method3039();
                int var165 = field1110.method3038();
                for (int var166 = var163; var166 <= var162; var166++) {
                    long var167 = ((long) var164 << 32) + (long) var166;
                    class194 var169 = field951.method3358(var167);
                    if (var169 != null) {
                        var169.method3397();
                    }
                    field951.method3359(new class200(var165), var167);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 121) {
                String var170 = field1110.method3002();
                Statics.field378 = var170;
                try {
                    String var171 = Statics.field1402.getParameter(class276.field3727.field3732);
                    String var172 = Statics.field1402.getParameter(class276.field3715.field3732);
                    String var173 = var171 + "settings=" + var170 + "; version=1; path=/; domain=" + var172;
                    String var174;
                    if (var170.length() == 0) {
                        var174 = var173 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var175 = var173 + "; Expires=";
                        long var176 = class177.method608() + 94608000000L;
                        class184.field2449.setTime(new Date(var176));
                        int var178 = class184.field2449.get(7);
                        int var179 = class184.field2449.get(5);
                        int var180 = class184.field2449.get(2);
                        int var181 = class184.field2449.get(1);
                        int var182 = class184.field2449.get(11);
                        int var183 = class184.field2449.get(12);
                        int var184 = class184.field2449.get(13);
                        String var185 = class184.field2447[var178 - 1] + ", " + var179 / 10 + var179 % 10 + "-" + class184.field2446[0][var180] + "-" + var181 + " " + var182 / 10 + var182 % 10 + ":" + var183 / 10 + var183 % 10 + ":" + var184 / 10 + var184 % 10 + " GMT";
                        var174 = var175 + var185 + "; Max-Age=" + 94608000L;
                    }
                    class53.method705(Statics.field1402, "document.cookie=\"" + var174 + "\"");
                } catch (Throwable var330) {
                }
                field965 = -1;
                return true;
            }
            if (field965 == 128) {
                String var187 = field1110.method3002();
                long var188 = field1110.method2981();
                long var190 = (long) field1110.method2995();
                long var192 = (long) field1110.method2997();
                class232[] var194 = new class232[] { class232.field3176, class232.field3175, class232.field3178, class232.field3180, class232.field3179, class232.field3182 };
                class232 var195 = (class232) class170.method1570(var194, field1110.method2999());
                long var196 = (var190 << 32) + var192;
                boolean var198 = false;
                for (int var199 = 0; var199 < 100; var199++) {
                    if (field1152[var199] == var196) {
                        var198 = true;
                        break;
                    }
                }
                if (var195.field3184 && method187(var187)) {
                    var198 = true;
                }
                if (!var198 && field1051 == 0) {
                    field1152[field1153] = var196;
                    field1153 = (field1153 + 1) % 100;
                    String var200 = class266.method4463(class272.method987(class267.method2898(field1110)));
                    if (var195.field3177 == -1) {
                        Statics.method257(9, var187, var200, class270.method4118(var188));
                    } else {
                        int var201 = var195.field3177;
                        String var202 = "<img=" + var201 + ">";
                        Statics.method257(9, var202 + var187, var200, class270.method4118(var188));
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 174) {
                method1567(false);
                field1110.method3228();
                int var203 = field1110.method2995();
                class96.method555(field1110, var203);
                field965 = -1;
                return true;
            }
            if (field965 == 74) {
                String var204 = field1110.method3002();
                String var205 = class266.method4463(class272.method987(class267.method2898(field1110)));
                class98.method1380(6, var204, var205);
                field965 = -1;
                return true;
            }
            if (field965 == 218) {
                byte var206 = field1110.method3024();
                int var207 = field1110.method3056();
                class213.field2615[var207] = var206;
                if (class213.field2609[var207] != var206) {
                    class213.field2609[var207] = var206;
                }
                method261(var207);
                field1023[++field982 - 1 & 0x1F] = var207;
                field965 = -1;
                return true;
            }
            if (field965 == 207) {
                String var208 = field1110.method3002();
                int var209 = field1110.method2995();
                byte var210 = field1110.method3172();
                boolean var211 = false;
                if (var210 == -128) {
                    var211 = true;
                }
                if (var211) {
                    if (Statics.field289 == 0) {
                        field965 = -1;
                        return true;
                    }
                    boolean var212 = false;
                    int var213;
                    for (var213 = 0; var213 < Statics.field289 && (!Statics.field2849[var213].field940.equals(var208) || Statics.field2849[var213].field934 != var209); var213++) {
                    }
                    if (var213 < Statics.field289) {
                        while (var213 < Statics.field289 - 1) {
                            Statics.field2849[var213] = Statics.field2849[var213 + 1];
                            var213++;
                        }
                        Statics.field289--;
                        Statics.field2849[Statics.field289] = null;
                    }
                } else {
                    field1110.method3002();
                    class76 var214 = new class76();
                    var214.field940 = var208;
                    var214.field933 = class269.method2713(var214.field940, Statics.field244);
                    var214.field934 = var209;
                    var214.field932 = var210;
                    int var215;
                    for (var215 = Statics.field289 - 1; var215 >= 0; var215--) {
                        int var216 = Statics.field2849[var215].field933.compareTo(var214.field933);
                        if (var216 == 0) {
                            Statics.field2849[var215].field934 = var209;
                            Statics.field2849[var215].field932 = var210;
                            if (var208.equals(Statics.field908.field925)) {
                                Statics.field509 = var210;
                            }
                            field1126 = field1167;
                            field965 = -1;
                            return true;
                        }
                        if (var216 < 0) {
                            break;
                        }
                    }
                    if (Statics.field289 >= Statics.field2849.length) {
                        field965 = -1;
                        return true;
                    }
                    for (int var217 = Statics.field289 - 1; var217 > var215; var217--) {
                        Statics.field2849[var217 + 1] = Statics.field2849[var217];
                    }
                    if (Statics.field289 == 0) {
                        Statics.field2849 = new class76[100];
                    }
                    Statics.field2849[var215 + 1] = var214;
                    Statics.field289++;
                    if (var208.equals(Statics.field908.field925)) {
                        Statics.field509 = var210;
                    }
                }
                field1126 = field1167;
                field965 = -1;
                return true;
            }
            if (field965 == 169) {
                int var218 = field989 + field1110.field2395;
                int var219 = field1110.method2995();
                int var220 = field1110.method2995();
                if (field1092 != var219) {
                    field1092 = var219;
                    this.method1073(false);
                    method3858(field1092);
                    class83.method794(field1092);
                    for (int var221 = 0; var221 < 100; var221++) {
                        field1111[var221] = true;
                    }
                }
                while (var220-- > 0) {
                    int var222 = field1110.method2998();
                    int var223 = field1110.method2995();
                    int var224 = field1110.method2999();
                    class69 var225 = (class69) field1093.method3358((long) var222);
                    if (var225 != null && var225.field847 != var223) {
                        method1030(var225, true);
                        var225 = null;
                    }
                    if (var225 == null) {
                        var225 = method1506(var222, var223, var224);
                    }
                    var225.field855 = true;
                }
                for (class69 var226 = (class69) field1093.method3365(); var226 != null; var226 = (class69) field1093.method3362()) {
                    if (var226.field855) {
                        var226.field855 = false;
                    } else {
                        method1030(var226, true);
                    }
                }
                field951 = new class192(512);
                while (field1110.field2395 < var218) {
                    int var227 = field1110.method2998();
                    int var228 = field1110.method2995();
                    int var229 = field1110.method2995();
                    int var230 = field1110.method2998();
                    for (int var231 = var228; var231 <= var229; var231++) {
                        long var232 = ((long) var227 << 32) + (long) var231;
                        field951.method3359(new class200(var230), var232);
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 32) {
                method246(true);
                field965 = -1;
                return true;
            }
            if (field965 == 65) {
                field1060 = field1110.method2995() * 30;
                field1147 = field1167;
                field965 = -1;
                return true;
            }
            if (field965 == 177) {
                int var234 = field1110.method2995();
                int var235 = field1110.method3040();
                class213.field2615[var234] = var235;
                if (class213.field2609[var234] != var235) {
                    class213.field2609[var234] = var235;
                }
                method261(var234);
                field1023[++field982 - 1 & 0x1F] = var234;
                field965 = -1;
                return true;
            }
            if (field965 == 107) {
                field959 = field1110.method2999();
                if (field959 == 1) {
                    field960 = field1110.method2995();
                }
                if (field959 >= 2 && field959 <= 6) {
                    if (field959 == 2) {
                        field988 = 64;
                        field966 = 64;
                    }
                    if (field959 == 3) {
                        field988 = 0;
                        field966 = 64;
                    }
                    if (field959 == 4) {
                        field988 = 128;
                        field966 = 64;
                    }
                    if (field959 == 5) {
                        field988 = 64;
                        field966 = 0;
                    }
                    if (field959 == 6) {
                        field988 = 64;
                        field966 = 128;
                    }
                    field959 = 2;
                    field981 = field1110.method2995();
                    field963 = field1110.method2995();
                    field1095 = field1110.method2999();
                }
                if (field959 == 10) {
                    field961 = field1110.method2995();
                }
                field965 = -1;
                return true;
            }
            if (field965 == 75) {
                field1126 = field1167;
                if (field989 == 0) {
                    field1158 = null;
                    field1159 = null;
                    Statics.field289 = 0;
                    Statics.field2849 = null;
                    field965 = -1;
                    return true;
                }
                field1159 = field1110.method3002();
                long var236 = field1110.method2981();
                long var238 = var236;
                String var240;
                if (var236 <= 0L || var236 >= 6582952005840035281L) {
                    var240 = null;
                } else if (var236 % 37L == 0L) {
                    var240 = null;
                } else {
                    int var241 = 0;
                    for (long var242 = var236; var242 != 0L; var242 /= 37L) {
                        var241++;
                    }
                    StringBuilder var244 = new StringBuilder(var241);
                    while (var238 != 0L) {
                        long var245 = var238;
                        var238 /= 37L;
                        var244.append(class270.field3673[(int) (var245 - var238 * 37L)]);
                    }
                    var240 = var244.reverse().toString();
                }
                field1158 = var240;
                Statics.field245 = field1110.method3172();
                int var247 = field1110.method2999();
                if (var247 == 255) {
                    field965 = -1;
                    return true;
                }
                Statics.field289 = var247;
                class76[] var248 = new class76[100];
                for (int var249 = 0; var249 < Statics.field289; var249++) {
                    var248[var249] = new class76();
                    var248[var249].field940 = field1110.method3002();
                    var248[var249].field933 = class269.method2713(var248[var249].field940, Statics.field244);
                    var248[var249].field934 = field1110.method2995();
                    var248[var249].field932 = field1110.method3172();
                    field1110.method3002();
                    if (var248[var249].field940.equals(Statics.field908.field925)) {
                        Statics.field509 = var248[var249].field932;
                    }
                }
                boolean var250 = false;
                int var251 = Statics.field289;
                while (var251 > 0) {
                    boolean var252 = true;
                    var251--;
                    for (int var253 = 0; var253 < var251; var253++) {
                        if (var248[var253].field933.compareTo(var248[var253 + 1].field933) > 0) {
                            class76 var254 = var248[var253];
                            var248[var253] = var248[var253 + 1];
                            var248[var253 + 1] = var254;
                            var252 = false;
                        }
                    }
                    if (var252) {
                        break;
                    }
                }
                Statics.field2849 = var248;
                field965 = -1;
                return true;
            }
            if (field965 == 210) {
                int var255 = field1110.method3040();
                Statics.field1298 = Statics.field706.method2771(var255);
                field965 = -1;
                return true;
            }
            if (field965 == 253) {
                while (field1110.field2395 < field989) {
                    boolean var256 = field1110.method2999() == 1;
                    String var257 = field1110.method3002();
                    String var258 = field1110.method3002();
                    int var259 = field1110.method2995();
                    int var260 = field1110.method2999();
                    int var261 = field1110.method2999();
                    boolean var262 = (var261 & 0x2) != 0;
                    boolean var263 = (var261 & 0x1) != 0;
                    if (var259 > 0) {
                        field1110.method3002();
                        field1110.method2999();
                        field1110.method2998();
                    }
                    field1110.method3002();
                    for (int var264 = 0; var264 < field1198; var264++) {
                        class66 var265 = field1073[var264];
                        if (var256) {
                            if (var258.equals(var265.field823)) {
                                var265.field823 = var257;
                                var265.field818 = var258;
                                var257 = null;
                                break;
                            }
                        } else if (var257.equals(var265.field823)) {
                            if (var265.field820 != var259) {
                                boolean var266 = true;
                                for (class68 var267 = (class68) field1201.method3448(); var267 != null; var267 = (class68) field1201.method3449()) {
                                    if (var267.field843.equals(var257)) {
                                        if (var259 != 0 && var267.field839 == 0) {
                                            var267.method3463();
                                            var266 = false;
                                        } else if (var259 == 0 && var267.field839 != 0) {
                                            var267.method3463();
                                            var266 = false;
                                        }
                                    }
                                }
                                if (var266) {
                                    field1201.method3447(new class68(var257, var259));
                                }
                                var265.field820 = var259;
                            }
                            var265.field818 = var258;
                            var265.field819 = var260;
                            var265.field816 = var262;
                            var265.field821 = var263;
                            var257 = null;
                            break;
                        }
                    }
                    if (var257 != null && field1198 < 400) {
                        class66 var268 = new class66();
                        field1073[field1198] = var268;
                        var268.field823 = var257;
                        var268.field818 = var258;
                        var268.field820 = var259;
                        var268.field819 = var260;
                        var268.field816 = var262;
                        var268.field821 = var263;
                        field1198++;
                    }
                }
                field1199 = 2;
                field1125 = field1167;
                boolean var269 = false;
                int var270 = field1198;
                while (var270 > 0) {
                    boolean var271 = true;
                    var270--;
                    for (int var272 = 0; var272 < var270; var272++) {
                        boolean var273 = false;
                        class66 var274 = field1073[var272];
                        class66 var275 = field1073[var272 + 1];
                        if (field942 != var274.field820 && field942 == var275.field820) {
                            var273 = true;
                        }
                        if (!var273 && var274.field820 == 0 && var275.field820 != 0) {
                            var273 = true;
                        }
                        if (!var273 && !var274.field816 && var275.field816) {
                            var273 = true;
                        }
                        if (!var273 && !var274.field821 && var275.field821) {
                            var273 = true;
                        }
                        if (var273) {
                            class66 var276 = field1073[var272];
                            field1073[var272] = field1073[var272 + 1];
                            field1073[var272 + 1] = var276;
                            var271 = false;
                        }
                    }
                    if (var271) {
                        break;
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 164) {
                method46();
                int var277 = field1110.method3138();
                int var278 = field1110.method3039();
                int var279 = field1110.method3138();
                field1068[var279] = var278;
                field1096[var279] = var277;
                field1067[var279] = 1;
                for (int var280 = 0; var280 < 98; var280++) {
                    if (var278 >= class224.field2848[var280]) {
                        field1067[var279] = var280 + 2;
                    }
                }
                field1122[++field1123 - 1 & 0x1F] = var279;
                field965 = -1;
                return true;
            }
            if (field965 == 168) {
                for (int var281 = 0; var281 < class213.field2609.length; var281++) {
                    if (class213.field2615[var281] != class213.field2609[var281]) {
                        class213.field2609[var281] = class213.field2615[var281];
                        method261(var281);
                        field1023[++field982 - 1 & 0x1F] = var281;
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 254) {
                int var282 = field1110.method2995();
                int var283 = field1110.method2999();
                int var284 = field1110.method2995();
                if (field1186 != 0 && var283 != 0 && field1173 < 50) {
                    field1174[field1173] = var282;
                    field1175[field1173] = var283;
                    field1002[field1173] = var284;
                    field1178[field1173] = null;
                    field1177[field1173] = 0;
                    field1173++;
                }
                field965 = -1;
                return true;
            }
            if (field965 == 112) {
                int var288 = field1110.method2998();
                class69 var289 = (class69) field1093.method3358((long) var288);
                if (var289 != null) {
                    method1030(var289, true);
                }
                if (field1087 != null) {
                    method31(field1087);
                    field1087 = null;
                }
                field965 = -1;
                return true;
            }
            if (field965 == 249) {
                int var290 = field1110.method2998();
                class218 var291 = class218.method2924(var290);
                var291.field2782 = 3;
                var291.field2703 = Statics.field908.field902.method3711();
                method31(var291);
                field965 = -1;
                return true;
            }
            if (field965 == 105) {
                class80 var292 = new class80();
                var292.field1305 = field1110.method3002();
                var292.field1300 = field1110.method2995();
                int var293 = field1110.method2998();
                var292.field1312 = var293;
                method492(45);
                Statics.field869.method2810();
                Statics.field869 = null;
                class92.method1711(var292);
                field965 = -1;
                return false;
            }
            if (field965 == 186) {
                method46();
                field1050 = field1110.method2999();
                field1147 = field1167;
                field965 = -1;
                return true;
            }
            if (field965 == 197) {
                int var294 = field1110.method3198();
                int var295 = field1110.method3198();
                int var296 = field1110.method3039();
                int var297 = field1110.method3029();
                class218 var298 = class218.method2924(var296);
                if (var298.field2710 != var295 || var298.field2711 != var297 || var298.field2713 != var294) {
                    var298.field2710 = var295;
                    var298.field2711 = var297;
                    var298.field2713 = var294;
                    method31(var298);
                }
                field965 = -1;
                return true;
            }
            if (field965 == 187) {
                int var299 = field1110.method3056();
                int var300 = field1110.method2998();
                class218 var301 = class218.method2924(var300);
                if (var301 != null && var301.field2661 == 0) {
                    if (var299 > var301.field2683 - var301.field2675) {
                        var299 = var301.field2683 - var301.field2675;
                    }
                    if (var299 < 0) {
                        var299 = 0;
                    }
                    if (var301.field2681 != var299) {
                        var301.field2681 = var299;
                        method31(var301);
                    }
                }
                field965 = -1;
                return true;
            }
            if (field965 == 233) {
                field1199 = 1;
                field1125 = field1167;
                field965 = -1;
                return true;
            }
            if (field965 == 141) {
                int var302 = field1110.method3198();
                int var303 = field1110.method3029();
                int var304 = field1110.method3038();
                class218 var305 = class218.method2924(var304);
                var305.field2715 = (var302 << 16) + var303;
                field965 = -1;
                return true;
            }
            if (field965 == 171) {
                field1179 = false;
                for (int var306 = 0; var306 < 5; var306++) {
                    field1180[var306] = false;
                }
                field965 = -1;
                return true;
            }
            if (field965 == 166) {
                field1165 = field1110.method2999();
                if (field1165 == 255) {
                    field1165 = 0;
                }
                field1166 = field1110.method2999();
                if (field1166 == 255) {
                    field1166 = 0;
                }
                field965 = -1;
                return true;
            }
            if (field965 == 230) {
                int var307 = field1110.method3029();
                if (var307 == 65535) {
                    var307 = -1;
                }
                method2731(var307);
                field965 = -1;
                return true;
            }
            if (field965 == 161) {
                int var308 = field1110.method3030();
                int var309 = field1110.method3056();
                if (var309 == 65535) {
                    var309 = -1;
                }
                method47(var309, var308);
                field965 = -1;
                return true;
            }
            if (field965 == 222) {
                String var310 = field1110.method3002();
                long var311 = (long) field1110.method2995();
                long var313 = (long) field1110.method2997();
                class232[] var315 = new class232[] { class232.field3176, class232.field3175, class232.field3178, class232.field3180, class232.field3179, class232.field3182 };
                class232 var316 = (class232) class170.method1570(var315, field1110.method2999());
                long var317 = (var311 << 32) + var313;
                boolean var319 = false;
                for (int var320 = 0; var320 < 100; var320++) {
                    if (field1152[var320] == var317) {
                        var319 = true;
                        break;
                    }
                }
                if (method187(var310)) {
                    var319 = true;
                }
                if (!var319 && field1051 == 0) {
                    field1152[field1153] = var317;
                    field1153 = (field1153 + 1) % 100;
                    String var321 = class266.method4463(class272.method987(class267.method2898(field1110)));
                    byte var322;
                    if (var316.field3183) {
                        var322 = 7;
                    } else {
                        var322 = 3;
                    }
                    if (var316.field3177 == -1) {
                        class98.method1380(var322, var310, var321);
                    } else {
                        int var324 = var316.field3177;
                        String var325 = "<img=" + var324 + ">";
                        class98.method1380(var322, var325 + var310, var321);
                    }
                }
                field965 = -1;
                return true;
            }
            class154.method2746("" + field965 + class88.field1395 + field958 + class88.field1395 + field995 + class88.field1395 + field989, (Throwable) null);
            method477();
        } catch (IOException var337) {
            if (field1059 > 0) {
                method477();
            } else {
                method492(40);
                Statics.field2566 = Statics.field869;
                Statics.field869 = null;
            }
        } catch (Exception var338) {
            String var328 = "" + field965 + class88.field1395 + field958 + class88.field1395 + field995 + class88.field1395 + field989 + class88.field1395 + (Statics.field2202 + Statics.field908.field1248[0]) + class88.field1395 + (Statics.field840 + Statics.field908.field1242[0]) + class88.field1395;
            for (int var329 = 0; var329 < field989 && var329 < 50; var329++) {
                var328 = var328 + field1110.field2392[var329] + class88.field1395;
            }
            class154.method2746(var328, var338);
            method477();
        }
        return true;
    }

    @ObfuscatedName("u.gu(I)V")
    public static final void method130() {
        if (field965 == 184) {
            int var0 = field1110.method3059();
            int var1 = (var0 >> 4 & 0x7) + Statics.field354;
            int var2 = (var0 & 0x7) + Statics.field530;
            int var3 = field1110.method3023();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field1135[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method984(Statics.field409, var1, var2, var6, -1, var4, var5, 0, -1);
            }
        } else if (field965 == 28) {
            int var7 = field1110.method2999();
            int var8 = (var7 >> 4 & 0x7) + Statics.field354;
            int var9 = (var7 & 0x7) + Statics.field530;
            int var10 = var8 + field1110.method3172();
            int var11 = var9 + field1110.method3172();
            int var12 = field1110.method2996();
            int var13 = field1110.method2995();
            int var14 = field1110.method2999() * 4;
            int var15 = field1110.method2999() * 4;
            int var16 = field1110.method2995();
            int var17 = field1110.method2995();
            int var18 = field1110.method2999();
            int var19 = field1110.method2999();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var13 != 65535) {
                int var20 = var8 * 128 + 64;
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                int var23 = var11 * 128 + 64;
                class93 var24 = new class93(var13, Statics.field409, var20, var21, method3812(var20, var21, Statics.field409) - var14, field973 + var16, field973 + var17, var18, var19, var12, var15);
                var24.method1620(var22, var23, method3812(var22, var23, Statics.field409) - var15, field973 + var16);
                field1040.method3405(var24);
            }
        } else if (field965 == 56) {
            int var25 = field1110.method3029();
            int var26 = field1110.method2999();
            int var27 = (var26 >> 4 & 0x7) + Statics.field354;
            int var28 = (var26 & 0x7) + Statics.field530;
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                class195 var29 = field1062[Statics.field409][var27][var28];
                if (var29 != null) {
                    for (class94 var30 = (class94) var29.method3410(); var30 != null; var30 = (class94) var29.method3412()) {
                        if ((var25 & 0x7FFF) == var30.field1498) {
                            var30.method3397();
                            break;
                        }
                    }
                    if (var29.method3410() == null) {
                        field1062[Statics.field409][var27][var28] = null;
                    }
                    method3500(var27, var28);
                }
            }
        } else {
            if (field965 == 243) {
                int var31 = field1110.method2999();
                int var32 = (var31 >> 4 & 0x7) + Statics.field354;
                int var33 = (var31 & 0x7) + Statics.field530;
                int var34 = field1110.method2995();
                int var35 = field1110.method2999();
                int var36 = var35 >> 4 & 0xF;
                int var37 = var35 & 0x7;
                int var38 = field1110.method2999();
                if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                    int var39 = var36 + 1;
                    if (Statics.field908.field1248[0] >= var32 - var39 && Statics.field908.field1248[0] <= var32 + var39 && Statics.field908.field1242[0] >= var33 - var39 && Statics.field908.field1242[0] <= var33 + var39 && field1172 != 0 && var37 > 0 && field1173 < 50) {
                        field1174[field1173] = var34;
                        field1175[field1173] = var37;
                        field1002[field1173] = var38;
                        field1178[field1173] = null;
                        field1177[field1173] = (var32 << 16) + (var33 << 8) + var36;
                        field1173++;
                    }
                }
            }
            if (field965 == 170) {
                int var40 = field1110.method2999();
                int var41 = (var40 >> 4 & 0x7) + Statics.field354;
                int var42 = (var40 & 0x7) + Statics.field530;
                int var43 = field1110.method2995();
                int var44 = field1110.method2995();
                int var45 = field1110.method2995();
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    class195 var46 = field1062[Statics.field409][var41][var42];
                    if (var46 != null) {
                        for (class94 var47 = (class94) var46.method3410(); var47 != null; var47 = (class94) var46.method3412()) {
                            if ((var43 & 0x7FFF) == var47.field1498 && var47.field1497 == var44) {
                                var47.field1497 = var45;
                                break;
                            }
                        }
                        method3500(var41, var42);
                    }
                }
            } else if (field965 == 0) {
                int var48 = field1110.method3023();
                int var49 = (var48 >> 4 & 0x7) + Statics.field354;
                int var50 = (var48 & 0x7) + Statics.field530;
                int var51 = field1110.method2995();
                int var52 = field1110.method3056();
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    class94 var53 = new class94();
                    var53.field1498 = var52;
                    var53.field1497 = var51;
                    if (field1062[Statics.field409][var49][var50] == null) {
                        field1062[Statics.field409][var49][var50] = new class195();
                    }
                    field1062[Statics.field409][var49][var50].method3405(var53);
                    method3500(var49, var50);
                }
            } else if (field965 == 201) {
                int var54 = field1110.method3059();
                int var55 = (var54 >> 4 & 0x7) + Statics.field354;
                int var56 = (var54 & 0x7) + Statics.field530;
                int var57 = field1110.method3023();
                int var58 = var57 >> 2;
                int var59 = var57 & 0x3;
                int var60 = field1135[var58];
                int var61 = field1110.method2995();
                if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                    method984(Statics.field409, var55, var56, var60, var61, var58, var59, 0, -1);
                }
            } else if (field965 == 157) {
                int var62 = field1110.method2999();
                int var63 = (var62 >> 4 & 0x7) + Statics.field354;
                int var64 = (var62 & 0x7) + Statics.field530;
                int var65 = field1110.method2995();
                int var66 = field1110.method2999();
                int var67 = field1110.method2995();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var68 = var63 * 128 + 64;
                    int var69 = var64 * 128 + 64;
                    class84 var70 = new class84(var65, Statics.field409, var68, var69, method3812(var68, var69, Statics.field409) - var66, var67, field973);
                    field1065.method3405(var70);
                }
            } else {
                if (field965 == 37) {
                    byte var71 = field1110.method3172();
                    int var72 = field1110.method3056();
                    int var73 = field1110.method3059();
                    int var74 = (var73 >> 4 & 0x7) + Statics.field354;
                    int var75 = (var73 & 0x7) + Statics.field530;
                    byte var76 = field1110.method3024();
                    byte var77 = field1110.method3025();
                    byte var78 = field1110.method3024();
                    int var79 = field1110.method3029();
                    int var80 = field1110.method2995();
                    int var81 = field1110.method3198();
                    int var82 = field1110.method2999();
                    int var83 = var82 >> 2;
                    int var84 = var82 & 0x3;
                    int var85 = field1135[var83];
                    class75 var86;
                    if (field1028 == var79) {
                        var86 = Statics.field908;
                    } else {
                        var86 = field1106[var79];
                    }
                    if (var86 != null) {
                        class257 var87 = class257.method2716(var81);
                        int var88;
                        int var89;
                        if (var84 == 1 || var84 == 3) {
                            var88 = var87.field3451;
                            var89 = var87.field3450;
                        } else {
                            var88 = var87.field3450;
                            var89 = var87.field3451;
                        }
                        int var90 = (var88 >> 1) + var74;
                        int var91 = (var88 + 1 >> 1) + var74;
                        int var92 = (var89 >> 1) + var75;
                        int var93 = (var89 + 1 >> 1) + var75;
                        int[][] var94 = class62.field768[Statics.field409];
                        int var95 = var94[var90][var92] + var94[var91][var92] + var94[var90][var93] + var94[var91][var93] >> 2;
                        int var96 = (var74 << 7) + (var88 << 6);
                        int var97 = (var75 << 7) + (var89 << 6);
                        class133 var98 = var87.method4208(var83, var84, var94, var96, var95, var97);
                        if (var98 != null) {
                            method984(Statics.field409, var74, var75, var85, -1, 0, 0, var72 + 1, var80 + 1);
                            var86.field930 = field973 + var72;
                            var86.field922 = field973 + var80;
                            var86.field915 = var98;
                            var86.field912 = var74 * 128 + var88 * 64;
                            var86.field914 = var75 * 128 + var89 * 64;
                            var86.field928 = var95;
                            if (var71 > var76) {
                                byte var99 = var71;
                                var71 = var76;
                                var76 = var99;
                            }
                            if (var77 > var78) {
                                byte var100 = var77;
                                var77 = var78;
                                var78 = var100;
                            }
                            var86.field916 = var71 + var74;
                            var86.field923 = var74 + var76;
                            var86.field917 = var75 + var77;
                            var86.field901 = var75 + var78;
                        }
                    }
                }
                if (field965 == 136) {
                    int var101 = field1110.method3023();
                    int var102 = (var101 >> 4 & 0x7) + Statics.field354;
                    int var103 = (var101 & 0x7) + Statics.field530;
                    int var104 = field1110.method3056();
                    int var105 = field1110.method3023();
                    int var106 = var105 >> 2;
                    int var107 = var105 & 0x3;
                    int var108 = field1135[var106];
                    if (var102 >= 0 && var103 >= 0 && var102 < 103 && var103 < 103) {
                        if (var108 == 0) {
                            class142 var109 = Statics.field785.method2529(Statics.field409, var102, var103);
                            if (var109 != null) {
                                int var110 = var109.field2137 >> 14 & 0x7FFF;
                                if (var106 == 2) {
                                    var109.field2135 = new class100(var110, 2, var107 + 4, Statics.field409, var102, var103, var104, false, var109.field2135);
                                    var109.field2136 = new class100(var110, 2, var107 + 1 & 0x3, Statics.field409, var102, var103, var104, false, var109.field2136);
                                } else {
                                    var109.field2135 = new class100(var110, var106, var107, Statics.field409, var102, var103, var104, false, var109.field2135);
                                }
                            }
                        }
                        if (var108 == 1) {
                            class147 var111 = Statics.field785.method2581(Statics.field409, var102, var103);
                            if (var111 != null) {
                                int var112 = var111.field2174 >> 14 & 0x7FFF;
                                if (var106 == 4 || var106 == 5) {
                                    var111.field2172 = new class100(var112, 4, var107, Statics.field409, var102, var103, var104, false, var111.field2172);
                                } else if (var106 == 6) {
                                    var111.field2172 = new class100(var112, 4, var107 + 4, Statics.field409, var102, var103, var104, false, var111.field2172);
                                } else if (var106 == 7) {
                                    var111.field2172 = new class100(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field409, var102, var103, var104, false, var111.field2172);
                                } else if (var106 == 8) {
                                    var111.field2172 = new class100(var112, 4, var107 + 4, Statics.field409, var102, var103, var104, false, var111.field2172);
                                    var111.field2173 = new class100(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field409, var102, var103, var104, false, var111.field2173);
                                }
                            }
                        }
                        if (var108 == 2) {
                            class148 var113 = Statics.field785.method2620(Statics.field409, var102, var103);
                            if (var106 == 11) {
                                var106 = 10;
                            }
                            if (var113 != null) {
                                var113.field2179 = new class100(var113.field2186 >> 14 & 0x7FFF, var106, var107, Statics.field409, var102, var103, var104, false, var113.field2179);
                            }
                        }
                        if (var108 == 3) {
                            class129 var114 = Statics.field785.method2601(Statics.field409, var102, var103);
                            if (var114 != null) {
                                var114.field1878 = new class100(var114.field1879 >> 14 & 0x7FFF, 22, var107, Statics.field409, var102, var103, var104, false, var114.field1878);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.gx(IIIIIIIIII)V")
    public static final void method984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1063.method3410(); var10 != null; var10 = (class77) field1063.method3412()) {
            if (var10.field1217 == arg0 && var10.field1215 == arg1 && var10.field1216 == arg2 && var10.field1214 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1217 = arg0;
            var9.field1214 = arg3;
            var9.field1215 = arg1;
            var9.field1216 = arg2;
            method197(var9);
            field1063.method3405(var9);
        }
        var9.field1220 = arg4;
        var9.field1225 = arg5;
        var9.field1221 = arg6;
        var9.field1223 = arg7;
        var9.field1224 = arg8;
    }

    @ObfuscatedName("bo.ge(B)V")
    public static final void method1047() {
        for (class77 var0 = (class77) field1063.method3410(); var0 != null; var0 = (class77) field1063.method3412()) {
            if (var0.field1224 == -1) {
                var0.field1223 = 0;
                method197(var0);
            } else {
                var0.method3397();
            }
        }
    }

    @ObfuscatedName("w.gj(Lbk;B)V")
    public static final void method197(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1214 == 0) {
            var1 = Statics.field785.method2691(arg0.field1217, arg0.field1215, arg0.field1216);
        }
        if (arg0.field1214 == 1) {
            var1 = Statics.field785.method2534(arg0.field1217, arg0.field1215, arg0.field1216);
        }
        if (arg0.field1214 == 2) {
            var1 = Statics.field785.method2670(arg0.field1217, arg0.field1215, arg0.field1216);
        }
        if (arg0.field1214 == 3) {
            var1 = Statics.field785.method2557(arg0.field1217, arg0.field1215, arg0.field1216);
        }
        if (var1 != 0) {
            int var5 = Statics.field785.method2536(arg0.field1217, arg0.field1215, arg0.field1216, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1228 = var2;
        arg0.field1213 = var3;
        arg0.field1222 = var4;
    }

    @ObfuscatedName("bv.gh(IIIIIIII)V")
    public static final void method741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field941 && Statics.field409 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field785.method2691(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field785.method2534(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field785.method2670(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field785.method2557(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field785.method2536(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field785.method2524(arg0, arg2, arg3);
                class257 var15 = class257.method2716(var12);
                if (var15.field3457 != 0) {
                    field1004[arg0].method2878(arg2, arg3, var13, var14, var15.field3453);
                }
            }
            if (arg1 == 1) {
                Statics.field785.method2678(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field785.method2685(arg0, arg2, arg3);
                class257 var16 = class257.method2716(var12);
                if (var16.field3450 + arg2 > 103 || var16.field3450 + arg3 > 103 || var16.field3451 + arg2 > 103 || var16.field3451 + arg3 > 103) {
                    return;
                }
                if (var16.field3457 != 0) {
                    field1004[arg0].method2858(arg2, arg3, var16.field3450, var16.field3451, var14, var16.field3453);
                }
            }
            if (arg1 == 3) {
                Statics.field785.method2527(arg0, arg2, arg3);
                class257 var17 = class257.method2716(var12);
                if (var17.field3457 == 1) {
                    field1004[arg0].method2860(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field764[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        Statics.method1054(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field785, field1004[arg0]);
    }

    @ObfuscatedName("ga.ga(IIS)V")
    public static final void method3500(int arg0, int arg1) {
        class195 var2 = field1062[Statics.field409][arg0][arg1];
        if (var2 == null) {
            Statics.field785.method2528(Statics.field409, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class94 var5 = null;
        for (class94 var6 = (class94) var2.method3410(); var6 != null; var6 = (class94) var2.method3412()) {
            class258 var7 = class258.method2955(var6.field1498);
            long var8 = (long) var7.field3506;
            if (var7.field3491 == 1) {
                var8 = (long) (var6.field1497 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field785.method2528(Statics.field409, arg0, arg1);
            return;
        }
        var2.method3406(var5);
        class94 var10 = null;
        class94 var11 = null;
        for (class94 var12 = (class94) var2.method3410(); var12 != null; var12 = (class94) var2.method3412()) {
            if (var5.field1498 != var12.field1498) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1498 != var12.field1498 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field785.method2514(Statics.field409, arg0, arg1, method3812(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field409), var5, var13, var10, var11);
    }

    @ObfuscatedName("al.gy(ZI)V")
    public static final void method246(boolean arg0) {
        field1055 = 0;
        field984 = 0;
        field1110.method3226();
        int var1 = field1110.method3230(8);
        if (var1 < field947) {
            for (int var2 = var1; var2 < field947; var2++) {
                field1056[++field1055 - 1] = field983[var2];
            }
        }
        if (var1 > field947) {
            throw new RuntimeException("");
        }
        field947 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field983[var3];
            class86 var5 = field1097[var4];
            int var6 = field1110.method3230(1);
            if (var6 == 0) {
                field983[++field947 - 1] = var4;
                var5.field1261 = field973;
            } else {
                int var7 = field1110.method3230(2);
                if (var7 == 0) {
                    field983[++field947 - 1] = var4;
                    var5.field1261 = field973;
                    field985[++field984 - 1] = var4;
                } else if (var7 == 1) {
                    field983[++field947 - 1] = var4;
                    var5.field1261 = field973;
                    int var8 = field1110.method3230(3);
                    var5.method1555(var8, (byte) 1);
                    int var9 = field1110.method3230(1);
                    if (var9 == 1) {
                        field985[++field984 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field983[++field947 - 1] = var4;
                    var5.field1261 = field973;
                    int var10 = field1110.method3230(3);
                    var5.method1555(var10, (byte) 2);
                    int var11 = field1110.method3230(3);
                    var5.method1555(var11, (byte) 2);
                    int var12 = field1110.method3230(1);
                    if (var12 == 1) {
                        field985[++field984 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field1056[++field1055 - 1] = var4;
                }
            }
        }
        while (field1110.method3244(field989) >= 27) {
            int var13 = field1110.method3230(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field1097[var13] == null) {
                field1097[var13] = new class86();
                var17 = true;
            }
            class86 var18 = field1097[var13];
            field983[++field947 - 1] = var13;
            var18.field1261 = field973;
            int var19;
            if (arg0) {
                var19 = field1110.method3230(8);
                if (var19 > 127) {
                    var19 -= 256;
                }
            } else {
                var19 = field1110.method3230(5);
                if (var19 > 15) {
                    var19 -= 32;
                }
            }
            int var20;
            if (arg0) {
                var20 = field1110.method3230(8);
                if (var20 > 127) {
                    var20 -= 256;
                }
            } else {
                var20 = field1110.method3230(5);
                if (var20 > 15) {
                    var20 -= 32;
                }
            }
            int var21 = field1110.method3230(1);
            int var22 = field1110.method3230(1);
            if (var22 == 1) {
                field985[++field984 - 1] = var13;
            }
            var18.field1382 = class260.method2968(field1110.method3230(14));
            int var23 = field1052[field1110.method3230(3)];
            if (var17) {
                var18.field1281 = var18.field1236 = var23;
            }
            var18.field1234 = var18.field1382.field3575;
            var18.field1283 = var18.field1382.field3576;
            if (var18.field1283 == 0) {
                var18.field1236 = 0;
            }
            var18.field1269 = var18.field1382.field3559;
            var18.field1239 = var18.field1382.field3560;
            var18.field1289 = var18.field1382.field3561;
            var18.field1231 = var18.field1382.field3562;
            var18.field1235 = var18.field1382.field3556;
            var18.field1254 = var18.field1382.field3558;
            var18.field1252 = var18.field1382.field3547;
            var18.method1560(Statics.field908.field1248[0] + var19, Statics.field908.field1242[0] + var20, var21 == 1);
        }
        field1110.method3231();
        method2917();
        for (int var14 = 0; var14 < field1055; var14++) {
            int var15 = field1056[var14];
            if (field973 != field1097[var15].field1261) {
                field1097[var15].field1382 = null;
                field1097[var15] = null;
            }
        }
        if (field989 != field1110.field2395) {
            throw new RuntimeException(field1110.field2395 + class88.field1395 + field989);
        }
        for (int var16 = 0; var16 < field947; var16++) {
            if (field1097[field983[var16]] == null) {
                throw new RuntimeException(var16 + class88.field1395 + field947);
            }
        }
    }

    @ObfuscatedName("fv.gr(B)V")
    public static final void method2917() {
        for (int var0 = 0; var0 < field984; var0++) {
            int var1 = field985[var0];
            class86 var2 = field1097[var1];
            int var3 = field1110.method2999();
            if ((var3 & 0x2) != 0) {
                var2.field1256 = field1110.method3056();
                if (var2.field1256 == 65535) {
                    var2.field1256 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field1382 = class260.method2968(field1110.method3029());
                var2.field1234 = var2.field1382.field3575;
                var2.field1283 = var2.field1382.field3576;
                var2.field1269 = var2.field1382.field3559;
                var2.field1239 = var2.field1382.field3560;
                var2.field1289 = var2.field1382.field3561;
                var2.field1231 = var2.field1382.field3562;
                var2.field1235 = var2.field1382.field3556;
                var2.field1254 = var2.field1382.field3558;
                var2.field1252 = var2.field1382.field3547;
            }
            if ((var3 & 0x10) != 0) {
                int var4 = field1110.method3198();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field1110.method3059();
                if (var2.field1257 == var4 && var4 != -1) {
                    int var6 = class262.method3737(var4).field3615;
                    if (var6 == 1) {
                        var2.field1263 = 0;
                        var2.field1264 = 0;
                        var2.field1262 = var5;
                        var2.field1266 = 0;
                    }
                    if (var6 == 2) {
                        var2.field1266 = 0;
                    }
                } else if (var4 == -1 || var2.field1257 == -1 || class262.method3737(var4).field3597 >= class262.method3737(var2.field1257).field3597) {
                    var2.field1257 = var4;
                    var2.field1263 = 0;
                    var2.field1264 = 0;
                    var2.field1262 = var5;
                    var2.field1266 = 0;
                    var2.field1250 = var2.field1284;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field1267 = field1110.method3056();
                int var7 = field1110.method3039();
                var2.field1271 = var7 >> 16;
                var2.field1270 = (var7 & 0xFFFF) + field973;
                var2.field1268 = 0;
                var2.field1241 = 0;
                if (var2.field1270 > field973) {
                    var2.field1268 = -1;
                }
                if (var2.field1267 == 65535) {
                    var2.field1267 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var8 = field1110.method2995();
                int var9 = field1110.method3056();
                int var10 = var2.field1233 - (var8 - Statics.field2202 - Statics.field2202) * 64;
                int var11 = var2.field1232 - (var9 - Statics.field840 - Statics.field840) * 64;
                if (var10 != 0 || var11 != 0) {
                    var2.field1258 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field1243 = field1110.method3002();
                var2.field1246 = 100;
            }
            if ((var3 & 0x40) != 0) {
                int var12 = field1110.method3023();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = field1110.method3007();
                        if (var17 == 32767) {
                            var17 = field1110.method3007();
                            var15 = field1110.method3007();
                            var14 = field1110.method3007();
                            var16 = field1110.method3007();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = field1110.method3007();
                        }
                        int var18 = field1110.method3007();
                        var2.method1387(var17, var15, var14, var16, field973, var18);
                    }
                }
                int var19 = field1110.method3059();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = field1110.method3007();
                        int var22 = field1110.method3007();
                        if (var22 == 32767) {
                            var2.method1389(var21);
                        } else {
                            int var23 = field1110.method3007();
                            int var24 = field1110.method3138();
                            int var25 = var22 > 0 ? field1110.method3059() : var24;
                            var2.method1386(var21, field973, var22, var23, var24, var25);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.gm(I)V")
    public static void method1537() {
        field1071 = 0;
        field987 = false;
        field1076[0] = class227.field2946;
        field1171[0] = "";
        field1114[0] = 1006;
        field1078[0] = false;
        field1071 = 1;
    }

    @ObfuscatedName("n.hh(B)V")
    public static final void method10() {
        int var0 = Statics.field3263;
        int var1 = Statics.field588;
        int var2 = Statics.field1411;
        int var3 = Statics.field282;
        int var4 = 6116423;
        class283.method4557(var0, var1, var2, var3, var4);
        class283.method4557(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class283.method4588(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field898.method4440(class227.field3112, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field753;
        int var6 = class60.field748;
        for (int var7 = 0; var7 < field1071; var7++) {
            int var8 = (field1071 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class265 var10 = Statics.field898;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field1171[var7].length() > 0) {
                var11 = field1076[var7] + class227.field3019 + field1171[var7];
            } else {
                var11 = field1076[var7];
            }
            var10.method4440(var11, var0 + 3, var8, var9, 0);
        }
        method74(Statics.field3263, Statics.field588, Statics.field1411, Statics.field282);
    }

    @ObfuscatedName("cv.he(IIIII)V")
    public static final void method1713(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1066; var4++) {
            if (field1142[var4] + field1140[var4] > arg0 && field1140[var4] < arg0 + arg2 && field1143[var4] + field1010[var4] > arg1 && field1010[var4] < arg1 + arg3) {
                field1111[var4] = true;
            }
        }
    }

    @ObfuscatedName("v.hl(IIIIB)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1066; var4++) {
            if (field1142[var4] + field1140[var4] > arg0 && field1140[var4] < arg0 + arg2 && field1143[var4] + field1010[var4] > arg1 && field1010[var4] < arg1 + arg3) {
                field967[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hc(B)V")
    public final void method1070() {
        method3678();
        if (Statics.field326 != null || field1112 != null) {
            return;
        }
        int var18;
        int var20;
        int var21;
        label191: {
            int var1 = class60.field755;
            if (field987) {
                if (var1 != 1 && (Statics.field952 || var1 != 4)) {
                    int var2 = class60.field753;
                    int var3 = class60.field748;
                    if (var2 < Statics.field3263 - 10 || var2 > Statics.field3263 + Statics.field1411 + 10 || var3 < Statics.field588 - 10 || var3 > Statics.field588 + Statics.field282 + 10) {
                        field987 = false;
                        method1713(Statics.field3263, Statics.field588, Statics.field1411, Statics.field282);
                    }
                }
                if (var1 == 1 || !Statics.field952 && var1 == 4) {
                    int var4 = Statics.field3263;
                    int var5 = Statics.field588;
                    int var6 = Statics.field1411;
                    int var7 = class60.field754;
                    int var8 = class60.field740;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field1071; var10++) {
                        int var11 = (field1071 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1 && var9 >= 0) {
                        int var12 = field1188[var9];
                        int var13 = field949[var9];
                        int var14 = field1114[var9];
                        int var15 = field1075[var9];
                        String var16 = field1076[var9];
                        String var17 = field1171[var9];
                        method1005(var12, var13, var14, var15, var16, var17, class60.field754, class60.field740);
                    }
                    field987 = false;
                    method1713(Statics.field3263, Statics.field588, Statics.field1411, Statics.field282);
                }
            } else {
                var18 = Statics.method704();
                if ((var1 == 1 || !Statics.field952 && var1 == 4) && var18 >= 0) {
                    int var19 = field1114[var18];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field1188[var18];
                        var21 = field949[var18];
                        class218 var22 = class218.method2924(var21);
                        int var23 = method3688(var22);
                        boolean var24 = (var23 >> 28 & 0x1) != 0;
                        if (var24) {
                            break label191;
                        }
                        class219 var10000 = (class219) null;
                        if (class219.method2959(method3688(var22))) {
                            break label191;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field952 && var1 == 4) && this.method1071()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field952 && var1 == 4) && field1071 > 0 && var18 >= 0) {
                    int var28 = field1188[var18];
                    int var29 = field949[var18];
                    int var30 = field1114[var18];
                    int var31 = field1075[var18];
                    String var32 = field1076[var18];
                    String var33 = field1171[var18];
                    method1005(var28, var29, var30, var31, var32, var33, class60.field754, class60.field740);
                }
                if (var1 == 2 && field1071 > 0) {
                    this.method1072(class60.field754, class60.field740);
                }
            }
            return;
        }
        if (Statics.field326 != null && !field1049 && field1071 > 0 && !this.method1071()) {
            int var25 = field1070;
            int var26 = field1047;
            class89 var27 = Statics.field179;
            method1005(var27.field1405, var27.field1410, var27.field1407, var27.field1408, var27.field1409, var27.field1409, var25, var26);
            Statics.field179 = null;
        }
        field1049 = false;
        field1082 = 0;
        if (Statics.field326 != null) {
            method31(Statics.field326);
        }
        Statics.field326 = class218.method2924(var21);
        field1045 = var20;
        field1070 = class60.field754;
        field1047 = class60.field740;
        if (var18 >= 0) {
            method473(var18);
        }
        method31(Statics.field326);
    }

    @ObfuscatedName("client.hf(I)Z")
    public final boolean method1071() {
        int var1 = Statics.method704();
        if (field1071 > 2) {
            if (field1069 == 1 && !field1078[var1]) {
                return true;
            }
            boolean var2;
            if (var1 < 0) {
                var2 = false;
            } else {
                int var3 = field1114[var1];
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

    @ObfuscatedName("client.hs(III)V")
    public final void method1072(int arg0, int arg1) {
        int var3 = Statics.field898.method4442(class227.field3112);
        for (int var4 = 0; var4 < field1071; var4++) {
            class265 var5 = Statics.field898;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1171[var4].length() > 0) {
                var6 = field1076[var4] + class227.field3019 + field1171[var4];
            } else {
                var6 = field1076[var4];
            }
            int var7 = var5.method4442(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field1071 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field1467) {
            var9 = Statics.field1467 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field801) {
            var10 = Statics.field801 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field785.method2588(Statics.field409, arg0, arg1, false);
        field987 = true;
        Statics.field3263 = var9;
        Statics.field588 = var10;
        Statics.field1411 = var3;
        Statics.field282 = field1071 * 15 + 22;
    }

    @ObfuscatedName("bn.hg(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1005(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 6) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(227);
            field986.method3026(arg3 >> 14 & 0x7FFF);
            field986.method3027(Statics.field2202 + arg0);
            field986.method3026(Statics.field840 + arg1);
            field986.method3058(class51.field652[82] ? 1 : 0);
        }
        if (arg2 == 26) {
            field986.method3243(174);
            for (class69 var8 = (class69) field1093.method3365(); var8 != null; var8 = (class69) field1093.method3362()) {
                if (var8.field848 == 0 || var8.field848 == 3) {
                    method1030(var8, true);
                }
            }
            if (field1087 != null) {
                method31(field1087);
                field1087 = null;
            }
        }
        if (arg2 == 4) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(129);
            field986.method3020(arg3 >> 14 & 0x7FFF);
            field986.method3026(Statics.field2202 + arg0);
            field986.method3157(class51.field652[82] ? 1 : 0);
            field986.method3027(Statics.field840 + arg1);
        }
        if (arg2 == 17) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(47);
            field986.method2978(Statics.field840 + arg1);
            field986.method3114(class51.field652[82] ? 1 : 0);
            field986.method3035(Statics.field27);
            field986.method3027(field1088);
            field986.method2978(Statics.field2202 + arg0);
            field986.method2978(arg3);
        }
        if (arg2 == 38) {
            Statics.method1662();
            class218 var9 = class218.method2924(arg1);
            field1137 = 1;
            Statics.field699 = arg0;
            Statics.field627 = arg1;
            Statics.field303 = arg3;
            method31(var9);
            field1086 = class88.method1003(16748608) + class258.method2955(arg3).field3494 + class88.method1003(16777215);
            if (field1086 == null) {
                field1086 = "null";
            }
            return;
        }
        if (arg2 == 37) {
            field986.method3243(244);
            field986.method3118(arg1);
            field986.method2978(arg0);
            field986.method3026(arg3);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 50) {
            class75 var10 = field1106[arg3];
            if (var10 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(65);
                field986.method3114(class51.field652[82] ? 1 : 0);
                field986.method3020(arg3);
            }
        }
        if (arg2 == 1004) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field986.method3243(220);
            field986.method3020(arg3);
        }
        if (arg2 == 47) {
            class75 var11 = field1106[arg3];
            if (var11 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(170);
                field986.method3114(class51.field652[82] ? 1 : 0);
                field986.method3026(arg3);
            }
        }
        if (arg2 == 48) {
            class75 var12 = field1106[arg3];
            if (var12 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(56);
                field986.method3027(arg3);
                field986.method3058(class51.field652[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field986.method3243(242);
            field986.method3020(arg3);
            field986.method3027(arg0);
            field986.method3118(arg1);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 10) {
            class86 var13 = field1097[arg3];
            if (var13 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(155);
                field986.method3058(class51.field652[82] ? 1 : 0);
                field986.method3027(arg3);
            }
        }
        if (arg2 == 45) {
            class75 var14 = field1106[arg3];
            if (var14 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(116);
                field986.method3114(class51.field652[82] ? 1 : 0);
                field986.method3020(arg3);
            }
        }
        if (arg2 == 14) {
            class75 var15 = field1106[arg3];
            if (var15 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(72);
                field986.method3027(Statics.field699);
                field986.method3136(Statics.field627);
                field986.method3157(class51.field652[82] ? 1 : 0);
                field986.method3026(Statics.field303);
                field986.method2978(arg3);
            }
        }
        if (arg2 == 43) {
            field986.method3243(247);
            field986.method2978(arg3);
            field986.method3136(arg1);
            field986.method3020(arg0);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 28) {
            field986.method3243(177);
            field986.method3136(arg1);
            class218 var16 = class218.method2924(arg1);
            if (var16.field2771 != null && var16.field2771[0][0] == 5) {
                int var17 = var16.field2771[0][1];
                class213.field2609[var17] = 1 - class213.field2609[var17];
                method261(var17);
            }
        }
        if (arg2 == 23) {
            if (field987) {
                Statics.field785.method2550();
            } else {
                Statics.field785.method2588(Statics.field409, arg0, arg1, true);
            }
        }
        if (arg2 == 58) {
            class218 var18 = class218.method1697(arg1, arg0);
            if (var18 != null) {
                field986.method3243(255);
                field986.method3026(field1088);
                field986.method3136(arg1);
                field986.method2978(var18.field2779);
                field986.method2978(field1017);
                field986.method3026(arg0);
                field986.method3035(Statics.field27);
            }
        }
        if (arg2 == 35) {
            field986.method3243(19);
            field986.method3026(arg0);
            field986.method3136(arg1);
            field986.method3026(arg3);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 16) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(235);
            field986.method3026(Statics.field303);
            field986.method3157(class51.field652[82] ? 1 : 0);
            field986.method2978(arg3);
            field986.method3020(Statics.field2202 + arg0);
            field986.method3027(Statics.field699);
            field986.method3020(Statics.field840 + arg1);
            field986.method3136(Statics.field627);
        }
        if (arg2 == 20) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(125);
            field986.method3020(Statics.field2202 + arg0);
            field986.method3027(Statics.field840 + arg1);
            field986.method2978(arg3);
            field986.method3114(class51.field652[82] ? 1 : 0);
        }
        if (arg2 == 7) {
            class86 var19 = field1097[arg3];
            if (var19 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(93);
                field986.method3026(Statics.field699);
                field986.method2978(Statics.field303);
                field986.method3114(class51.field652[82] ? 1 : 0);
                field986.method3026(arg3);
                field986.method3035(Statics.field627);
            }
        }
        if (arg2 == 24) {
            class218 var20 = class218.method2924(arg1);
            boolean var21 = true;
            if (var20.field2663 > 0) {
                var21 = method2900(var20);
            }
            if (var21) {
                field986.method3243(177);
                field986.method3136(arg1);
            }
        }
        if (arg2 == 29) {
            field986.method3243(177);
            field986.method3136(arg1);
            class218 var22 = class218.method2924(arg1);
            if (var22.field2771 != null && var22.field2771[0][0] == 5) {
                int var23 = var22.field2771[0][1];
                if (class213.field2609[var23] != var22.field2773[0]) {
                    class213.field2609[var23] = var22.field2773[0];
                    method261(var23);
                }
            }
        }
        if (arg2 == 13) {
            class86 var24 = field1097[arg3];
            if (var24 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(41);
                field986.method3026(arg3);
                field986.method3114(class51.field652[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field986.method3243(233);
            field986.method2978(Statics.field699);
            field986.method3035(arg1);
            field986.method3027(arg3);
            field986.method3118(Statics.field627);
            field986.method2978(Statics.field303);
            field986.method3027(arg0);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 51) {
            class75 var25 = field1106[arg3];
            if (var25 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(122);
                field986.method3102(class51.field652[82] ? 1 : 0);
                field986.method3020(arg3);
            }
        }
        if (arg2 == 18) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(67);
            field986.method3026(arg3);
            field986.method3102(class51.field652[82] ? 1 : 0);
            field986.method3020(Statics.field2202 + arg0);
            field986.method3027(Statics.field840 + arg1);
        }
        if (arg2 == 46) {
            class75 var26 = field1106[arg3];
            if (var26 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(86);
                field986.method3114(class51.field652[82] ? 1 : 0);
                field986.method3026(arg3);
            }
        }
        if (arg2 == 12) {
            class86 var27 = field1097[arg3];
            if (var27 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(70);
                field986.method3027(arg3);
                field986.method3114(class51.field652[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(43);
            field986.method3157(class51.field652[82] ? 1 : 0);
            field986.method3026(arg3);
            field986.method3026(Statics.field2202 + arg0);
            field986.method2978(Statics.field840 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var28 = class218.method1697(arg1, arg0);
            if (var28 != null) {
                method2503(arg3, arg1, arg0, var28.field2779, arg5);
            }
        }
        if (arg2 == 44) {
            class75 var29 = field1106[arg3];
            if (var29 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(73);
                field986.method3102(class51.field652[82] ? 1 : 0);
                field986.method3020(arg3);
            }
        }
        if (arg2 == 39) {
            field986.method3243(161);
            field986.method3118(arg1);
            field986.method3027(arg3);
            field986.method3027(arg0);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 1) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(240);
            field986.method3020(arg3 >> 14 & 0x7FFF);
            field986.method2978(Statics.field840 + arg1);
            field986.method3035(Statics.field627);
            field986.method3020(Statics.field699);
            field986.method3027(Statics.field2202 + arg0);
            field986.method3157(class51.field652[82] ? 1 : 0);
            field986.method3027(Statics.field303);
        }
        if (arg2 == 9) {
            class86 var30 = field1097[arg3];
            if (var30 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(151);
                field986.method3114(class51.field652[82] ? 1 : 0);
                field986.method3026(arg3);
            }
        }
        if (arg2 == 1002) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field986.method3243(44);
            field986.method3027(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 11) {
            class86 var31 = field1097[arg3];
            if (var31 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(76);
                field986.method3020(arg3);
                field986.method3058(class51.field652[82] ? 1 : 0);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field666.method4834(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 15) {
            class75 var32 = field1106[arg3];
            if (var32 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(74);
                field986.method3114(class51.field652[82] ? 1 : 0);
                field986.method3027(field1088);
                field986.method3035(Statics.field27);
                field986.method2978(arg3);
            }
        }
        if (arg2 == 3) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(27);
            field986.method3026(arg3 >> 14 & 0x7FFF);
            field986.method3027(Statics.field840 + arg1);
            field986.method3026(Statics.field2202 + arg0);
            field986.method3058(class51.field652[82] ? 1 : 0);
        }
        if (arg2 == 1001) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(188);
            field986.method3020(arg3 >> 14 & 0x7FFF);
            field986.method3027(Statics.field840 + arg1);
            field986.method3026(Statics.field2202 + arg0);
            field986.method3114(class51.field652[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field986.method3243(212);
            field986.method3020(arg3);
            field986.method3027(field1088);
            field986.method3035(Statics.field27);
            field986.method3020(arg0);
            field986.method3035(arg1);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 42) {
            field986.method3243(119);
            field986.method3136(arg1);
            field986.method3027(arg3);
            field986.method3027(arg0);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 33) {
            field986.method3243(228);
            field986.method2978(arg0);
            field986.method3020(arg3);
            field986.method3136(arg1);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 40) {
            field986.method3243(25);
            field986.method3136(arg1);
            field986.method3020(arg0);
            field986.method2978(arg3);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 41) {
            field986.method3243(169);
            field986.method2978(arg3);
            field986.method2978(arg0);
            field986.method3116(arg1);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 34) {
            field986.method3243(117);
            field986.method3027(arg3);
            field986.method3026(arg0);
            field986.method3136(arg1);
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 2) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(232);
            field986.method3027(Statics.field840 + arg1);
            field986.method3027(field1088);
            field986.method3157(class51.field652[82] ? 1 : 0);
            field986.method2978(arg3 >> 14 & 0x7FFF);
            field986.method3020(Statics.field2202 + arg0);
            field986.method3035(Statics.field27);
        }
        if (arg2 == 5) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(243);
            field986.method3026(Statics.field2202 + arg0);
            field986.method3026(Statics.field840 + arg1);
            field986.method3027(arg3 >> 14 & 0x7FFF);
            field986.method3058(class51.field652[82] ? 1 : 0);
        }
        if (arg2 == 49) {
            class75 var33 = field1106[arg3];
            if (var33 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(115);
                field986.method3114(class51.field652[82] ? 1 : 0);
                field986.method3026(arg3);
            }
        }
        if (arg2 == 25) {
            class218 var34 = class218.method1697(arg1, arg0);
            if (var34 != null) {
                Statics.method1662();
                int var35 = method3688(var34);
                int var36 = var35 >> 11 & 0x3F;
                int var38 = var34.field2779;
                class218 var39 = class218.method1697(arg1, arg0);
                if (var39 != null && var39.field2750 != null) {
                    class70 var40 = new class70();
                    var40.field859 = var39;
                    var40.field865 = var39.field2750;
                    class83.method2765(var40);
                }
                field1017 = var38;
                field1064 = true;
                Statics.field27 = arg1;
                field1088 = arg0;
                Statics.field846 = var36;
                method31(var39);
                field1137 = 0;
                field1090 = method3210(var34);
                if (field1090 == null) {
                    field1090 = "Null";
                }
                if (var34.field2658) {
                    field1091 = var34.field2682 + class88.method1003(16777215);
                } else {
                    field1091 = class88.method1003(65280) + var34.field2775 + class88.method1003(16777215);
                }
            }
            return;
        }
        if (arg2 == 1005) {
            class218 var41 = class218.method2924(arg1);
            if (var41 == null || var41.field2778[arg0] < 100000) {
                field986.method3243(220);
                field986.method3020(arg3);
            } else {
                class98.method1380(27, "", var41.field2778[arg0] + " x " + class258.method2955(arg3).field3494);
            }
            field1043 = 0;
            Statics.field3619 = class218.method2924(arg1);
            field1044 = arg0;
        }
        if (arg2 == 22) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(192);
            field986.method3102(class51.field652[82] ? 1 : 0);
            field986.method2978(Statics.field840 + arg1);
            field986.method3026(arg3);
            field986.method3020(Statics.field2202 + arg0);
        }
        if (arg2 == 21) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            field1165 = arg0;
            field1166 = arg1;
            field986.method3243(189);
            field986.method3102(class51.field652[82] ? 1 : 0);
            field986.method3026(arg3);
            field986.method3020(Statics.field840 + arg1);
            field986.method3026(Statics.field2202 + arg0);
        }
        if (arg2 == 30 && field1087 == null) {
            field986.method3243(46);
            field986.method3026(arg0);
            field986.method3118(arg1);
            field1087 = class218.method1697(arg1, arg0);
            method31(field1087);
        }
        if (arg2 == 8) {
            class86 var42 = field1097[arg3];
            if (var42 != null) {
                field1039 = arg6;
                field996 = arg7;
                field1042 = 2;
                field1041 = 0;
                field1165 = arg0;
                field1166 = arg1;
                field986.method3243(197);
                field986.method3027(arg3);
                field986.method3020(field1088);
                field986.method3102(class51.field652[82] ? 1 : 0);
                field986.method3118(Statics.field27);
            }
        }
        if (arg2 == 1003) {
            field1039 = arg6;
            field996 = arg7;
            field1042 = 2;
            field1041 = 0;
            class86 var43 = field1097[arg3];
            if (var43 != null) {
                class260 var44 = var43.field1382;
                if (var44.field3577 != null) {
                    var44 = var44.method4295();
                }
                if (var44 != null) {
                    field986.method3243(66);
                    field986.method3026(var44.field3551);
                }
            }
        }
        if (field1137 != 0) {
            field1137 = 0;
            method31(class218.method2924(Statics.field627));
        }
        if (field1064) {
            Statics.method1662();
        }
        if (Statics.field3619 != null && field1043 == 0) {
            method31(Statics.field3619);
        }
    }

    @ObfuscatedName("da.ho(ILjava/lang/String;I)V")
    public static void method2158(int arg0, String arg1) {
        int var2 = class96.field1508;
        int[] var3 = class96.field1512;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class75 var6 = field1106[var3[var5]];
            if (var6 != null && Statics.field908 != var6 && var6.field925 != null && var6.field925.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field986.method3243(73);
                    field986.method3102(0);
                    field986.method3020(var3[var5]);
                } else if (arg0 == 4) {
                    field986.method3243(170);
                    field986.method3114(0);
                    field986.method3026(var3[var5]);
                } else if (arg0 == 6) {
                    field986.method3243(115);
                    field986.method3114(0);
                    field986.method3026(var3[var5]);
                } else if (arg0 == 7) {
                    field986.method3243(65);
                    field986.method3114(0);
                    field986.method3020(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class98.method1380(4, "", class227.field2993 + arg1);
        }
    }

    @ObfuscatedName("ei.hx(IIIILjava/lang/String;B)V")
    public static void method2503(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = class218.method1697(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2702 != null) {
            class70 var6 = new class70();
            var6.field859 = var5;
            var6.field862 = arg0;
            var6.field866 = arg4;
            var6.field865 = var5.field2702;
            class83.method2765(var6);
        }
        boolean var7 = true;
        if (var5.field2663 > 0) {
            var7 = method2900(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method3688(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field986.method3243(250);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
        if (arg0 == 2) {
            field986.method3243(7);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
        if (arg0 == 3) {
            field986.method3243(171);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
        if (arg0 == 4) {
            field986.method3243(146);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
        if (arg0 == 5) {
            field986.method3243(1);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
        if (arg0 == 6) {
            field986.method3243(105);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
        if (arg0 == 7) {
            field986.method3243(173);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
        if (arg0 == 8) {
            field986.method3243(196);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
        if (arg0 == 9) {
            field986.method3243(142);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
        if (arg0 == 10) {
            field986.method3243(221);
            field986.method3136(arg1);
            field986.method2978(arg2);
            field986.method2978(arg3);
        }
    }

    @ObfuscatedName("hf.hi(I)V")
    public static final void method3678() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field1071 - 1; var1++) {
                if (field1114[var1] < 1000 && field1114[var1 + 1] > 1000) {
                    String var2 = field1171[var1];
                    field1171[var1] = field1171[var1 + 1];
                    field1171[var1 + 1] = var2;
                    String var3 = field1076[var1];
                    field1076[var1] = field1076[var1 + 1];
                    field1076[var1 + 1] = var3;
                    int var4 = field1114[var1];
                    field1114[var1] = field1114[var1 + 1];
                    field1114[var1 + 1] = var4;
                    int var5 = field1188[var1];
                    field1188[var1] = field1188[var1 + 1];
                    field1188[var1 + 1] = var5;
                    int var6 = field949[var1];
                    field949[var1] = field949[var1 + 1];
                    field949[var1 + 1] = var6;
                    int var7 = field1075[var1];
                    field1075[var1] = field1075[var1 + 1];
                    field1075[var1 + 1] = var7;
                    boolean var8 = field1078[var1];
                    field1078[var1] = field1078[var1 + 1];
                    field1078[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ac.hb(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method478(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method189(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("g.hp(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method189(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field987 || field1071 >= 500) {
            return;
        }
        field1076[field1071] = arg0;
        field1171[field1071] = arg1;
        field1114[field1071] = arg2;
        field1075[field1071] = arg3;
        field1188[field1071] = arg4;
        field949[field1071] = arg5;
        field1078[field1071] = arg6;
        field1071++;
    }

    @ObfuscatedName("y.hm(I)V")
    public static void method70() {
        for (int var0 = 0; var0 < field1071; var0++) {
            int var1 = field1114[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field1071 - 1) {
                    for (int var3 = var0; var3 < field1071 - 1; var3++) {
                        field1076[var3] = field1076[var3 + 1];
                        field1171[var3] = field1171[var3 + 1];
                        field1114[var3] = field1114[var3 + 1];
                        field1075[var3] = field1075[var3 + 1];
                        field1188[var3] = field1188[var3 + 1];
                        field949[var3] = field949[var3 + 1];
                        field1078[var3] = field1078[var3 + 1];
                    }
                }
                field1071--;
            }
        }
    }

    @ObfuscatedName("ap.hn(IIIII)V")
    public static final void method662(int arg0, int arg1, int arg2, int arg3) {
        if (field1137 == 0 && !field1064) {
            method478(class227.field2863, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class134.field2010; var6++) {
            int var7 = class134.field2004[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field785.method2536(Statics.field409, var8, var9, var7) >= 0) {
                    class257 var12 = class257.method2716(var11);
                    if (var12.field3476 != null) {
                        var12 = var12.method4204();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1137 == 1) {
                        method478(class227.field3009, field1086 + " " + class88.field1399 + " " + class88.method1003(65535) + var12.field3445, 1, var7, var8, var9);
                    } else if (!field1064) {
                        String[] var13 = var12.field3449;
                        if (field1103) {
                            var13 = method2967(var13);
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
                                    method478(var13[var14], class88.method1003(65535) + var12.field3445, var15, var7, var8, var9);
                                }
                            }
                        }
                        method478(class227.field3010, class88.method1003(65535) + var12.field3445, 1002, var12.field3435 << 14, var8, var9);
                    } else if ((Statics.field846 & 0x4) == 4) {
                        method478(field1090, field1091 + " " + class88.field1399 + " " + class88.method1003(65535) + var12.field3445, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class86 var16 = field1097[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1382.field3575 == 1 && (var16.field1233 & 0x7F) == 64 && (var16.field1232 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field947; var17++) {
                            class86 var18 = field1097[field983[var17]];
                            if (var18 != null && var16 != var18 && var18.field1382.field3575 == 1 && var16.field1233 == var18.field1233 && var16.field1232 == var18.field1232) {
                                method13(var18.field1382, field983[var17], var8, var9);
                            }
                        }
                        int var19 = class96.field1508;
                        int[] var20 = class96.field1512;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class75 var22 = field1106[var20[var21]];
                            if (var22 != null && var16.field1233 == var22.field1233 && var16.field1232 == var22.field1232) {
                                method1031(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method13(var16.field1382, var11, var8, var9);
                }
                if (var10 == 0) {
                    class75 var23 = field1106[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1233 & 0x7F) == 64 && (var23.field1232 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field947; var24++) {
                            class86 var25 = field1097[field983[var24]];
                            if (var25 != null && var25.field1382.field3575 == 1 && var23.field1233 == var25.field1233 && var23.field1232 == var25.field1232) {
                                method13(var25.field1382, field983[var24], var8, var9);
                            }
                        }
                        int var26 = class96.field1508;
                        int[] var27 = class96.field1512;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class75 var29 = field1106[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1233 == var29.field1233 && var23.field1232 == var29.field1232) {
                                method1031(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field1061 == var11) {
                        var4 = var7;
                    } else {
                        method1031(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class195 var30 = field1062[Statics.field409][var8][var9];
                    if (var30 != null) {
                        for (class94 var31 = (class94) var30.method3430(); var31 != null; var31 = (class94) var30.method3433()) {
                            class258 var32 = class258.method2955(var31.field1498);
                            if (field1137 == 1) {
                                method478(class227.field3009, field1086 + " " + class88.field1399 + " " + class88.method1003(16748608) + var32.field3494, 16, var31.field1498, var8, var9);
                            } else if (!field1064) {
                                String[] var33 = var32.field3534;
                                if (field1103) {
                                    var33 = method2967(var33);
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
                                        method478(var33[var34], class88.method1003(16748608) + var32.field3494, var35, var31.field1498, var8, var9);
                                    } else if (var34 == 2) {
                                        method478(class227.field2860, class88.method1003(16748608) + var32.field3494, 20, var31.field1498, var8, var9);
                                    }
                                }
                                method478(class227.field3010, class88.method1003(16748608) + var32.field3494, 1004, var31.field1498, var8, var9);
                            } else if ((Statics.field846 & 0x1) == 1) {
                                method478(field1090, field1091 + " " + class88.field1399 + " " + class88.method1003(16748608) + var32.field3494, 17, var31.field1498, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class75 var38 = field1106[field1061];
            method1031(var38, field1061, var36, var37);
        }
    }

    @ObfuscatedName("n.hz(Lir;IIII)V")
    public static final void method13(class260 arg0, int arg1, int arg2, int arg3) {
        if (field1071 >= 400) {
            return;
        }
        if (arg0.field3577 != null) {
            arg0 = arg0.method4295();
        }
        if (arg0 == null || !arg0.field3580 || arg0.field3582 && field1100 != arg1) {
            return;
        }
        String var4 = arg0.field3552;
        if (arg0.field3569 != 0) {
            var4 = var4 + method1378(arg0.field3569, Statics.field908.field907) + " " + class88.field1397 + class227.field3015 + arg0.field3569 + class88.field1398;
        }
        if (arg0.field3582 && field1048) {
            method478(class227.field3010, class88.method1003(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1137 == 1) {
            method478(class227.field3009, field1086 + " " + class88.field1399 + " " + class88.method1003(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1064) {
            int var5 = arg0.field3582 && field1048 ? 2000 : 0;
            String[] var6 = arg0.field3567;
            if (field1103) {
                var6 = method2967(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class227.field3011)) {
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
                        method478(var6[var7], class88.method1003(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class227.field3011)) {
                        short var10 = 0;
                        if (field969 != class91.field1427) {
                            if (field969 == class91.field1425 || field969 == class91.field1432 && arg0.field3569 > Statics.field908.field907) {
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
                            method478(var6[var9], class88.method1003(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3582 || !field1048) {
                method478(class227.field3010, class88.method1003(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field846 & 0x2) == 2) {
            method478(field1090, field1091 + " " + class88.field1399 + " " + class88.method1003(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bu.hu(Lbo;IIII)V")
    public static final void method1031(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field908 == arg0 || field1071 >= 400) {
            return;
        }
        String var4;
        if (arg0.field919 == 0) {
            var4 = arg0.field905[0] + arg0.field925 + arg0.field905[1] + method1378(arg0.field907, Statics.field908.field907) + " " + class88.field1397 + class227.field3015 + arg0.field907 + class88.field1398 + arg0.field905[2];
        } else {
            var4 = arg0.field905[0] + arg0.field925 + arg0.field905[1] + " " + class88.field1397 + class227.field3016 + arg0.field919 + class88.field1398 + arg0.field905[2];
        }
        if (field1137 == 1) {
            method478(class227.field3009, field1086 + " " + class88.field1399 + " " + class88.method1003(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1064) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field1058[var5] != null) {
                    short var6 = 0;
                    if (field1058[var5].equalsIgnoreCase(class227.field3011)) {
                        if (field968 == class91.field1427) {
                            continue;
                        }
                        if (field968 == class91.field1425 || field968 == class91.field1432 && arg0.field907 > Statics.field908.field907) {
                            var6 = 2000;
                        }
                        if (Statics.field908.field921 != 0 && arg0.field921 != 0) {
                            if (Statics.field908.field921 == arg0.field921) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field1138[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field1057[var5] + var6;
                    method478(field1058[var5], class88.method1003(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field846 & 0x8) == 8) {
            method478(field1090, field1091 + " " + class88.field1399 + " " + class88.method1003(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field1071; var9++) {
            if (field1114[var9] == 23) {
                field1171[var9] = class88.method1003(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("client.hr(III)Ljava/lang/String;")
    public static final String method1378(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class88.method1003(16711680);
        } else if (var2 < -6) {
            return class88.method1003(16723968);
        } else if (var2 < -3) {
            return class88.method1003(16740352);
        } else if (var2 < 0) {
            return class88.method1003(16756736);
        } else if (var2 > 9) {
            return class88.method1003(65280);
        } else if (var2 > 6) {
            return class88.method1003(4259584);
        } else if (var2 > 3) {
            return class88.method1003(8453888);
        } else if (var2 > 0) {
            return class88.method1003(12648192);
        } else {
            return class88.method1003(16776960);
        }
    }

    @ObfuscatedName("n.hy(IIIIIIIIS)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class218.method66(arg0)) {
            Statics.field550 = null;
            method1544(Statics.field3666[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field550 != null) {
                method1544(Statics.field550, -1412584499, arg1, arg2, arg3, arg4, Statics.field281, Statics.field1323, arg7);
                Statics.field550 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1111[var8] = true;
            }
        } else {
            field1111[arg7] = true;
        }
    }

    @ObfuscatedName("cf.hq([Lhx;IIIIIIIII)V")
    public static final void method1544(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class283.method4549(arg2, arg3, arg4, arg5);
        class136.method2411();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2678 == arg1 || arg1 == -1412584499 && field1112 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1140[field1066] = var10.field2783 + arg6;
                    field1010[field1066] = var10.field2759 + arg7;
                    field1142[field1066] = var10.field2739;
                    field1143[field1066] = var10.field2675;
                    var11 = ++field1066 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2790 = var11;
                var10.field2700 = field973;
                if (!var10.field2658 || !method489(var10)) {
                    if (var10.field2663 > 0) {
                        method4995(var10);
                    }
                    int var12 = var10.field2783 + arg6;
                    int var13 = var10.field2759 + arg7;
                    int var14 = var10.field2690;
                    if (field1112 == var10) {
                        if (arg1 != -1412584499 && !var10.field2716) {
                            Statics.field550 = arg0;
                            Statics.field281 = arg6;
                            Statics.field1323 = arg7;
                            continue;
                        }
                        if (field1116 && field1210) {
                            int var15 = class60.field753;
                            int var16 = class60.field748;
                            int var17 = var15 - field1107;
                            int var18 = var16 - field1108;
                            if (var17 < field1012) {
                                var17 = field1012;
                            }
                            if (var10.field2739 + var17 > field1012 + field1046.field2739) {
                                var17 = field1012 + field1046.field2739 - var10.field2739;
                            }
                            if (var18 < field1183) {
                                var18 = field1183;
                            }
                            if (var10.field2675 + var18 > field1183 + field1046.field2675) {
                                var18 = field1183 + field1046.field2675 - var10.field2675;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2716) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2661 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2661 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2739 + var12;
                        int var26 = var10.field2675 + var13;
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
                        int var29 = var10.field2739 + var12;
                        int var30 = var10.field2675 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2658 || var19 < var21 && var20 < var22) {
                        if (var10.field2663 != 0) {
                            if (var10.field2663 == 1336) {
                                if (field1029) {
                                    var13 += 15;
                                    Statics.field538.method4396("Fps:" + field710, var10.field2739 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field941) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field941) {
                                        var33 = 16711680;
                                    }
                                    Statics.field538.method4396("Mem:" + var32 + "k", var10.field2739 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2663 == 1337) {
                                field1081 = var12;
                                field1127 = var13;
                                method1379(var12, var13, var10.field2739, var10.field2675);
                                field1111[var10.field2790] = true;
                                class283.method4549(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2663 == 1338) {
                                method226();
                                class212 var34 = var10.method3740(false);
                                if (var34 != null) {
                                    class283.method4549(var12, var13, var34.field2601 + var12, var34.field2600 + var13);
                                    if (field1080 == 2 || field1080 == 5) {
                                        class283.method4624(var12, var13, 0, var34.field2603, var34.field2602);
                                    } else {
                                        int var35 = field1016 & 0x7FF;
                                        int var36 = Statics.field908.field1233 / 32 + 48;
                                        int var37 = 464 - Statics.field908.field1232 / 32;
                                        Statics.field316.method4685(var12, var13, var34.field2601, var34.field2600, var36, var37, var35, 256, var34.field2603, var34.field2602);
                                        for (int var38 = 0; var38 < field1161; var38++) {
                                            int var39 = field1162[var38] * 4 + 2 - Statics.field908.field1233 / 32;
                                            int var40 = field1163[var38] * 4 + 2 - Statics.field908.field1232 / 32;
                                            method3938(var12, var13, var39, var40, field1164[var38], var34);
                                        }
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= 104) {
                                                for (int var46 = 0; var46 < field947; var46++) {
                                                    class86 var47 = field1097[field983[var46]];
                                                    if (var47 != null && var47.method1050()) {
                                                        class260 var48 = var47.field1382;
                                                        if (var48 != null && var48.field3577 != null) {
                                                            var48 = var48.method4295();
                                                        }
                                                        if (var48 != null && var48.field3581 && var48.field3580) {
                                                            int var49 = var47.field1233 / 32 - Statics.field908.field1233 / 32;
                                                            int var50 = var47.field1232 / 32 - Statics.field908.field1232 / 32;
                                                            method3938(var12, var13, var49, var50, Statics.field2259[1], var34);
                                                        }
                                                    }
                                                }
                                                int var51 = class96.field1508;
                                                int[] var52 = class96.field1512;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    class75 var54 = field1106[var52[var53]];
                                                    if (var54 != null && var54.method1050() && !var54.field926 && Statics.field908 != var54) {
                                                        int var55 = var54.field1233 / 32 - Statics.field908.field1233 / 32;
                                                        int var56 = var54.field1232 / 32 - Statics.field908.field1232 / 32;
                                                        boolean var57 = false;
                                                        if (method1402(var54.field925, true)) {
                                                            var57 = true;
                                                        }
                                                        boolean var58 = false;
                                                        for (int var59 = 0; var59 < Statics.field289; var59++) {
                                                            if (var54.field925.equals(Statics.field2849[var59].field940)) {
                                                                var58 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var60 = false;
                                                        if (Statics.field908.field921 != 0 && var54.field921 != 0 && Statics.field908.field921 == var54.field921) {
                                                            var60 = true;
                                                        }
                                                        if (var57) {
                                                            method3938(var12, var13, var55, var56, Statics.field2259[3], var34);
                                                        } else if (var60) {
                                                            method3938(var12, var13, var55, var56, Statics.field2259[4], var34);
                                                        } else if (var58) {
                                                            method3938(var12, var13, var55, var56, Statics.field2259[5], var34);
                                                        } else {
                                                            method3938(var12, var13, var55, var56, Statics.field2259[2], var34);
                                                        }
                                                    }
                                                }
                                                if (field959 != 0 && field973 % 20 < 10) {
                                                    if (field959 == 1 && field960 >= 0 && field960 < field1097.length) {
                                                        class86 var61 = field1097[field960];
                                                        if (var61 != null) {
                                                            int var62 = var61.field1233 / 32 - Statics.field908.field1233 / 32;
                                                            int var63 = var61.field1232 / 32 - Statics.field908.field1232 / 32;
                                                            method55(var12, var13, var62, var63, Statics.field833[1], var34);
                                                        }
                                                    }
                                                    if (field959 == 2) {
                                                        int var64 = field981 * 4 - Statics.field2202 * 4 + 2 - Statics.field908.field1233 / 32;
                                                        int var65 = field963 * 4 - Statics.field840 * 4 + 2 - Statics.field908.field1232 / 32;
                                                        method55(var12, var13, var64, var65, Statics.field833[1], var34);
                                                    }
                                                    if (field959 == 10 && field961 >= 0 && field961 < field1106.length) {
                                                        class75 var66 = field1106[field961];
                                                        if (var66 != null) {
                                                            int var67 = var66.field1233 / 32 - Statics.field908.field1233 / 32;
                                                            int var68 = var66.field1232 / 32 - Statics.field908.field1232 / 32;
                                                            method55(var12, var13, var67, var68, Statics.field833[1], var34);
                                                        }
                                                    }
                                                }
                                                if (field1165 != 0) {
                                                    int var69 = field1165 * 4 + 2 - Statics.field908.field1233 / 32;
                                                    int var70 = field1166 * 4 + 2 - Statics.field908.field1232 / 32;
                                                    method3938(var12, var13, var69, var70, Statics.field833[0], var34);
                                                }
                                                if (!Statics.field908.field926) {
                                                    class283.method4557(var34.field2601 / 2 + var12 - 1, var34.field2600 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                class195 var43 = field1062[Statics.field409][var41][var42];
                                                if (var43 != null) {
                                                    int var44 = var41 * 4 + 2 - Statics.field908.field1233 / 32;
                                                    int var45 = var42 * 4 + 2 - Statics.field908.field1232 / 32;
                                                    method3938(var12, var13, var44, var45, Statics.field2259[0], var34);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    field967[var11] = true;
                                }
                                class283.method4549(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2663 == 1339) {
                                Statics.method3958(var10, var12, var13, var11);
                                class283.method4549(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2663 == 1400) {
                                Statics.field666.method4827(var12, var13, var10.field2739, var10.field2675, field973);
                            }
                            if (var10.field2663 == 1401) {
                                Statics.field666.method4982(var12, var13, var10.field2739, var10.field2675);
                            }
                        }
                        if (var10.field2661 == 0) {
                            if (!var10.field2658 && method489(var10) && Statics.field697 != var10) {
                                continue;
                            }
                            if (!var10.field2658) {
                                if (var10.field2681 > var10.field2683 - var10.field2675) {
                                    var10.field2681 = var10.field2683 - var10.field2675;
                                }
                                if (var10.field2681 < 0) {
                                    var10.field2681 = 0;
                                }
                            }
                            method1544(arg0, var10.field2659, var19, var20, var21, var22, var12 - var10.field2709, var13 - var10.field2681, var11);
                            if (var10.field2680 != null) {
                                method1544(var10.field2680, var10.field2659, var19, var20, var21, var22, var12 - var10.field2709, var13 - var10.field2681, var11);
                            }
                            class69 var71 = (class69) field1093.method3358((long) var10.field2659);
                            if (var71 != null) {
                                method9(var71.field847, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class283.method4549(arg2, arg3, arg4, arg5);
                            class136.method2411();
                        }
                        if (field1197 || field1139[var11] || field1144 > 1) {
                            if (var10.field2661 == 0 && !var10.field2658 && var10.field2683 > var10.field2675) {
                                int var72 = var10.field2739 + var12;
                                int var73 = var10.field2681;
                                int var74 = var10.field2675;
                                int var75 = var10.field2683;
                                Statics.field2263[0].method4637(var72, var13);
                                Statics.field2263[1].method4637(var72, var13 + var74 - 16);
                                class283.method4557(var72, var13 + 16, 16, var74 - 32, field1009);
                                int var76 = (var74 - 32) * var74 / var75;
                                if (var76 < 8) {
                                    var76 = 8;
                                }
                                int var77 = (var74 - 32 - var76) * var73 / (var75 - var74);
                                class283.method4557(var72, var13 + 16 + var77, 16, var76, field1074);
                                class283.method4571(var72, var13 + 16 + var77, var76, field1007);
                                class283.method4571(var72 + 1, var13 + 16 + var77, var76, field1007);
                                class283.method4551(var72, var13 + 16 + var77, 16, field1007);
                                class283.method4551(var72, var13 + 17 + var77, 16, field1007);
                                class283.method4571(var72 + 15, var13 + 16 + var77, var76, field1011);
                                class283.method4571(var72 + 14, var13 + 17 + var77, var76 - 1, field1011);
                                class283.method4551(var72, var13 + 15 + var77 + var76, 16, field1011);
                                class283.method4551(var72 + 1, var13 + 14 + var77 + var76, 15, field1011);
                            }
                            if (var10.field2661 != 1) {
                                if (var10.field2661 == 2) {
                                    int var78 = 0;
                                    for (int var79 = 0; var79 < var10.field2671; var79++) {
                                        for (int var80 = 0; var80 < var10.field2686; var80++) {
                                            int var81 = (var10.field2725 + 32) * var80 + var12;
                                            int var82 = (var10.field2726 + 32) * var79 + var13;
                                            if (var78 < 20) {
                                                var81 += var10.field2727[var78];
                                                var82 += var10.field2729[var78];
                                            }
                                            if (var10.field2777[var78] > 0) {
                                                boolean var83 = false;
                                                boolean var84 = false;
                                                int var85 = var10.field2777[var78] - 1;
                                                if (var81 + 32 > arg2 && var81 < arg4 && var82 + 32 > arg3 && var82 < arg5 || Statics.field326 == var10 && field1045 == var78) {
                                                    class287 var86;
                                                    if (field1137 == 1 && Statics.field699 == var78 && Statics.field627 == var10.field2659) {
                                                        var86 = class258.method263(var85, var10.field2778[var78], 2, 0, 2, false);
                                                    } else {
                                                        var86 = class258.method263(var85, var10.field2778[var78], 1, 3153952, 2, false);
                                                    }
                                                    if (var86 == null) {
                                                        method31(var10);
                                                    } else if (Statics.field326 == var10 && field1045 == var78) {
                                                        int var87 = class60.field753 - field1070;
                                                        int var88 = class60.field748 - field1047;
                                                        if (var87 < 5 && var87 > -5) {
                                                            var87 = 0;
                                                        }
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (field1082 < 5) {
                                                            var87 = 0;
                                                            var88 = 0;
                                                        }
                                                        var86.method4669(var81 + var87, var82 + var88, 128);
                                                        if (arg1 != -1) {
                                                            class218 var89 = arg0[arg1 & 0xFFFF];
                                                            if (var82 + var88 < class283.field3763 && var89.field2681 > 0) {
                                                                int var90 = field1008 * (class283.field3763 - var82 - var88) / 3;
                                                                if (var90 > field1008 * 10) {
                                                                    var90 = field1008 * 10;
                                                                }
                                                                if (var90 > var89.field2681) {
                                                                    var90 = var89.field2681;
                                                                }
                                                                var89.field2681 -= var90;
                                                                field1047 += var90;
                                                                method31(var89);
                                                            }
                                                            if (var82 + var88 + 32 > class283.field3760 && var89.field2681 < var89.field2683 - var89.field2675) {
                                                                int var91 = field1008 * (var82 + var88 + 32 - class283.field3760) / 3;
                                                                if (var91 > field1008 * 10) {
                                                                    var91 = field1008 * 10;
                                                                }
                                                                if (var91 > var89.field2683 - var89.field2675 - var89.field2681) {
                                                                    var91 = var89.field2683 - var89.field2675 - var89.field2681;
                                                                }
                                                                var89.field2681 += var91;
                                                                field1047 -= var91;
                                                                method31(var89);
                                                            }
                                                        }
                                                    } else if (Statics.field3619 == var10 && field1044 == var78) {
                                                        var86.method4669(var81, var82, 128);
                                                    } else {
                                                        var86.method4673(var81, var82);
                                                    }
                                                }
                                            } else if (var10.field2687 != null && var78 < 20) {
                                                class287 var92 = var10.method3746(var78);
                                                if (var92 != null) {
                                                    var92.method4673(var81, var82);
                                                } else if (class218.field2684) {
                                                    method31(var10);
                                                }
                                            }
                                            var78++;
                                        }
                                    }
                                } else if (var10.field2661 == 3) {
                                    int var93;
                                    if (method487(var10)) {
                                        var93 = var10.field2685;
                                        if (Statics.field697 == var10 && var10.field2657 != 0) {
                                            var93 = var10.field2657;
                                        }
                                    } else {
                                        var93 = var10.field2792;
                                        if (Statics.field697 == var10 && var10.field2647 != 0) {
                                            var93 = var10.field2647;
                                        }
                                    }
                                    if (var10.field2688) {
                                        switch(var10.field2689.field3775) {
                                            case 1:
                                                class283.method4558(var12, var13, var10.field2739, var10.field2675, var10.field2792, var10.field2685, 256 - (var10.field2690 & 0xFF), 256 - (var10.field2691 & 0xFF));
                                                break;
                                            case 2:
                                                class283.method4577(var12, var13, var10.field2739, var10.field2675, var10.field2792, var10.field2685, 256 - (var10.field2690 & 0xFF), 256 - (var10.field2691 & 0xFF));
                                                break;
                                            case 3:
                                                class283.method4560(var12, var13, var10.field2739, var10.field2675, var10.field2792, var10.field2685, 256 - (var10.field2690 & 0xFF), 256 - (var10.field2691 & 0xFF));
                                                break;
                                            case 4:
                                                class283.method4561(var12, var13, var10.field2739, var10.field2675, var10.field2792, var10.field2685, 256 - (var10.field2690 & 0xFF), 256 - (var10.field2691 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class283.method4557(var12, var13, var10.field2739, var10.field2675, var93);
                                                } else {
                                                    class283.method4556(var12, var13, var10.field2739, var10.field2675, var93, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class283.method4588(var12, var13, var10.field2739, var10.field2675, var93);
                                    } else {
                                        class283.method4565(var12, var13, var10.field2739, var10.field2675, var93, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2661 == 4) {
                                    class265 var94 = var10.method3751();
                                    if (var94 != null) {
                                        String var95 = var10.field2719;
                                        int var96;
                                        if (method487(var10)) {
                                            var96 = var10.field2685;
                                            if (Statics.field697 == var10 && var10.field2657 != 0) {
                                                var96 = var10.field2657;
                                            }
                                            if (var10.field2720.length() > 0) {
                                                var95 = var10.field2720;
                                            }
                                        } else {
                                            var96 = var10.field2792;
                                            if (Statics.field697 == var10 && var10.field2647 != 0) {
                                                var96 = var10.field2647;
                                            }
                                        }
                                        if (var10.field2658 && var10.field2779 != -1) {
                                            class258 var97 = class258.method2955(var10.field2779);
                                            var95 = var97.field3494;
                                            if (var95 == null) {
                                                var95 = "null";
                                            }
                                            if ((var97.field3491 == 1 || var10.field2780 != 1) && var10.field2780 != -1) {
                                                var95 = class88.method1003(16748608) + var95 + class88.field1401 + " " + 'x' + method1004(var10.field2780);
                                            }
                                        }
                                        if (field1087 == var10) {
                                            class227 var10000 = (class227) null;
                                            var95 = class227.field3111;
                                            var96 = var10.field2792;
                                        }
                                        if (!var10.field2658) {
                                            var95 = method2799(var95, var10);
                                        }
                                        var94.method4456(var95, var12, var13, var10.field2739, var10.field2675, var96, var10.field2724 ? 0 : -1, var10.field2722, var10.field2723, var10.field2732);
                                    } else if (class218.field2684) {
                                        method31(var10);
                                    }
                                } else if (var10.field2661 == 5) {
                                    if (var10.field2658) {
                                        class287 var99;
                                        if (var10.field2779 == -1) {
                                            var99 = var10.method3744(false);
                                        } else {
                                            var99 = class258.method263(var10.field2779, var10.field2780, var10.field2698, var10.field2699, var10.field2717, false);
                                        }
                                        if (var99 != null) {
                                            int var100 = var99.field3794;
                                            int var101 = var99.field3791;
                                            if (var10.field2697) {
                                                class283.method4550(var12, var13, var10.field2739 + var12, var10.field2675 + var13);
                                                int var102 = (var10.field2739 + (var100 - 1)) / var100;
                                                int var103 = (var10.field2675 + (var101 - 1)) / var101;
                                                for (int var104 = 0; var104 < var102; var104++) {
                                                    for (int var105 = 0; var105 < var103; var105++) {
                                                        if (var10.field2696 != 0) {
                                                            var99.method4686(var100 / 2 + var100 * var104 + var12, var101 / 2 + var101 * var105 + var13, var10.field2696, 4096);
                                                        } else if (var14 == 0) {
                                                            var99.method4673(var100 * var104 + var12, var101 * var105 + var13);
                                                        } else {
                                                            var99.method4669(var100 * var104 + var12, var101 * var105 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class283.method4549(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var106 = var10.field2739 * 4096 / var100;
                                                if (var10.field2696 != 0) {
                                                    var99.method4686(var10.field2739 / 2 + var12, var10.field2675 / 2 + var13, var10.field2696, var106);
                                                } else if (var14 != 0) {
                                                    var99.method4670(var12, var13, var10.field2739, var10.field2675, 256 - (var14 & 0xFF));
                                                } else if (var10.field2739 == var100 && var10.field2675 == var101) {
                                                    var99.method4673(var12, var13);
                                                } else {
                                                    var99.method4675(var12, var13, var10.field2739, var10.field2675);
                                                }
                                            }
                                        } else if (class218.field2684) {
                                            method31(var10);
                                        }
                                    } else {
                                        class287 var98 = var10.method3744(method487(var10));
                                        if (var98 != null) {
                                            var98.method4673(var12, var13);
                                        } else if (class218.field2684) {
                                            method31(var10);
                                        }
                                    }
                                } else if (var10.field2661 == 6) {
                                    boolean var107 = method487(var10);
                                    int var108;
                                    if (var107) {
                                        var108 = var10.field2707;
                                    } else {
                                        var108 = var10.field2784;
                                    }
                                    class133 var109 = null;
                                    int var110 = 0;
                                    if (var10.field2779 != -1) {
                                        class258 var111 = class258.method2955(var10.field2779);
                                        if (var111 != null) {
                                            class258 var112 = var111.method4234(var10.field2780);
                                            var109 = var112.method4229(1);
                                            if (var109 == null) {
                                                method31(var10);
                                            } else {
                                                var109.method2310();
                                                var110 = var109.field2129 / 2;
                                            }
                                        }
                                    } else if (var10.field2782 == 5) {
                                        if (var10.field2703 == 0) {
                                            var109 = field1079.method3720((class262) null, -1, (class262) null, -1);
                                        } else {
                                            var109 = Statics.field908.method1038();
                                        }
                                    } else if (var108 == -1) {
                                        var109 = var10.method3747((class262) null, -1, var107, Statics.field908.field902);
                                        if (var109 == null && class218.field2684) {
                                            method31(var10);
                                        }
                                    } else {
                                        class262 var113 = class262.method3737(var108);
                                        var109 = var10.method3747(var113, var10.field2781, var107, Statics.field908.field902);
                                        if (var109 == null && class218.field2684) {
                                            method31(var10);
                                        }
                                    }
                                    class136.method2414(var10.field2739 / 2 + var12, var10.field2675 / 2 + var13);
                                    int var114 = var10.field2713 * class136.field2045[var10.field2710] >> 16;
                                    int var115 = var10.field2713 * class136.field2029[var10.field2710] >> 16;
                                    if (var109 != null) {
                                        if (var10.field2658) {
                                            var109.method2310();
                                            if (var10.field2695) {
                                                var109.method2384(0, var10.field2711, var10.field2737, var10.field2710, var10.field2708, var10.field2648 + var110 + var114, var10.field2648 + var115, var10.field2713);
                                            } else {
                                                var109.method2323(0, var10.field2711, var10.field2737, var10.field2710, var10.field2708, var10.field2648 + var110 + var114, var10.field2648 + var115);
                                            }
                                        } else {
                                            var109.method2323(0, var10.field2711, 0, var10.field2710, 0, var114, var115);
                                        }
                                    }
                                    class136.method2433();
                                } else {
                                    if (var10.field2661 == 7) {
                                        class265 var116 = var10.method3751();
                                        if (var116 == null) {
                                            if (class218.field2684) {
                                                method31(var10);
                                            }
                                            continue;
                                        }
                                        int var117 = 0;
                                        for (int var118 = 0; var118 < var10.field2671; var118++) {
                                            for (int var119 = 0; var119 < var10.field2686; var119++) {
                                                if (var10.field2777[var117] > 0) {
                                                    class258 var120 = class258.method2955(var10.field2777[var117] - 1);
                                                    String var121;
                                                    if (var120.field3491 != 1 && var10.field2778[var117] == 1) {
                                                        var121 = class88.method1003(16748608) + var120.field3494 + class88.field1401;
                                                    } else {
                                                        var121 = class88.method1003(16748608) + var120.field3494 + class88.field1401 + " " + 'x' + method1004(var10.field2778[var117]);
                                                    }
                                                    int var122 = (var10.field2725 + 115) * var119 + var12;
                                                    int var123 = (var10.field2726 + 12) * var118 + var13;
                                                    if (var10.field2722 == 0) {
                                                        var116.method4440(var121, var122, var123, var10.field2792, var10.field2724 ? 0 : -1);
                                                    } else if (var10.field2722 == 1) {
                                                        var116.method4423(var121, var10.field2739 / 2 + var122, var123, var10.field2792, var10.field2724 ? 0 : -1);
                                                    } else {
                                                        var116.method4396(var121, var10.field2739 + var122 - 1, var123, var10.field2792, var10.field2724 ? 0 : -1);
                                                    }
                                                }
                                                var117++;
                                            }
                                        }
                                    }
                                    if (var10.field2661 == 8 && Statics.field630 == var10 && field974 == field1084) {
                                        int var124 = 0;
                                        int var125 = 0;
                                        class265 var126 = Statics.field538;
                                        String var127 = var10.field2719;
                                        String var128 = method2799(var127, var10);
                                        while (var128.length() > 0) {
                                            int var129 = var128.indexOf(class88.field1403);
                                            String var130;
                                            if (var129 == -1) {
                                                var130 = var128;
                                                var128 = "";
                                            } else {
                                                var130 = var128.substring(0, var129);
                                                var128 = var128.substring(var129 + 4);
                                            }
                                            int var131 = var126.method4442(var130);
                                            if (var131 > var124) {
                                                var124 = var131;
                                            }
                                            var125 += var126.field3637 + 1;
                                        }
                                        var124 += 6;
                                        var125 += 7;
                                        int var132 = var10.field2739 + var12 - 5 - var124;
                                        int var133 = var10.field2675 + var13 + 5;
                                        if (var132 < var12 + 5) {
                                            var132 = var12 + 5;
                                        }
                                        if (var124 + var132 > arg4) {
                                            var132 = arg4 - var124;
                                        }
                                        if (var125 + var133 > arg5) {
                                            var133 = arg5 - var125;
                                        }
                                        class283.method4557(var132, var133, var124, var125, 16777120);
                                        class283.method4588(var132, var133, var124, var125, 0);
                                        String var134 = var10.field2719;
                                        int var135 = var126.field3637 + var133 + 2;
                                        String var136 = method2799(var134, var10);
                                        while (var136.length() > 0) {
                                            int var137 = var136.indexOf(class88.field1403);
                                            String var138;
                                            if (var137 == -1) {
                                                var138 = var136;
                                                var136 = "";
                                            } else {
                                                var138 = var136.substring(0, var137);
                                                var136 = var136.substring(var137 + 4);
                                            }
                                            var126.method4440(var138, var132 + 3, var135, 0, -1);
                                            var135 += var126.field3637 + 1;
                                        }
                                    }
                                    if (var10.field2661 == 9) {
                                        int var139;
                                        int var140;
                                        int var141;
                                        int var142;
                                        if (var10.field2693) {
                                            var139 = var12;
                                            var140 = var10.field2675 + var13;
                                            var141 = var10.field2739 + var12;
                                            var142 = var13;
                                        } else {
                                            var139 = var12;
                                            var140 = var13;
                                            var141 = var10.field2739 + var12;
                                            var142 = var10.field2675 + var13;
                                        }
                                        if (var10.field2692 == 1) {
                                            class283.method4569(var139, var140, var141, var142, var10.field2792);
                                        } else {
                                            int var145 = var10.field2792;
                                            int var146 = var10.field2692;
                                            int var147 = var141 - var139;
                                            int var148 = var142 - var140;
                                            int var149 = var147 >= 0 ? var147 : -var147;
                                            int var150 = var148 >= 0 ? var148 : -var148;
                                            int var151 = var149;
                                            if (var149 < var150) {
                                                var151 = var150;
                                            }
                                            if (var151 != 0) {
                                                int var152 = (var147 << 16) / var151;
                                                int var153 = (var148 << 16) / var151;
                                                if (var153 <= var152) {
                                                    var152 = -var152;
                                                } else {
                                                    var153 = -var153;
                                                }
                                                int var154 = var146 * var153 >> 17;
                                                int var155 = var146 * var153 + 1 >> 17;
                                                int var156 = var146 * var152 >> 17;
                                                int var157 = var146 * var152 + 1 >> 17;
                                                int var158 = var139 - class283.field3765;
                                                int var159 = var140 - class283.field3763;
                                                int var160 = var154 + var158;
                                                int var161 = var158 - var155;
                                                int var162 = var147 + var158 - var155;
                                                int var163 = var147 + var158 + var154;
                                                int var164 = var156 + var159;
                                                int var165 = var159 - var157;
                                                int var166 = var148 + var159 - var157;
                                                int var167 = var148 + var159 + var156;
                                                class136.method2419(var160, var161, var162);
                                                class136.method2425(var164, var165, var166, var160, var161, var162, var145);
                                                class136.method2419(var160, var162, var163);
                                                class136.method2425(var164, var166, var167, var160, var162, var163, var145);
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

    @ObfuscatedName("fc.hk(Ljava/lang/String;Lhx;B)Ljava/lang/String;")
    public static String method2799(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + Statics.method915(method2717(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1298 != null) {
                    int var6 = Statics.field1298.field2239;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field1298.field2240 != null) {
                        var5 = (String) Statics.field1298.field2240;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bf.ht(IB)Ljava/lang/String;")
    public static final String method1004(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class88.field1395 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class88.method1003(65408) + var1.substring(0, var1.length() - 8) + class227.field3122 + " " + class88.field1397 + var1 + class88.field1398 + class88.field1401;
        } else if (var1.length() > 6) {
            return " " + class88.method1003(16777215) + var1.substring(0, var1.length() - 4) + class227.field3022 + " " + class88.field1397 + var1 + class88.field1398 + class88.field1401;
        } else {
            return " " + class88.method1003(16776960) + var1 + class88.field1401;
        }
    }

    @ObfuscatedName("client.ha(ZI)V")
    public final void method1073(boolean arg0) {
        int var2 = field1092;
        int var3 = Statics.field1467;
        int var4 = Statics.field801;
        if (class218.method66(var2)) {
            method12(Statics.field3666[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.hj(Lhx;I)V")
    public void method1291(class218 arg0) {
        class218 var2 = arg0.field2678 == -1 ? null : class218.method2924(arg0.field2678);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1467;
            var4 = Statics.field801;
        } else {
            var3 = var2.field2739;
            var4 = var2.field2675;
        }
        method69(arg0, var3, var4, false);
        method3914(arg0, var3, var4);
    }

    @ObfuscatedName("bi.hd([Lhx;Lhx;ZI)V")
    public static void method1001(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2674 == 0 ? arg1.field2739 : arg1.field2674;
        int var4 = arg1.field2683 == 0 ? arg1.field2675 : arg1.field2683;
        method12(arg0, arg1.field2659, var3, var4, arg2);
        if (arg1.field2680 != null) {
            method12(arg1.field2680, arg1.field2659, var3, var4, arg2);
        }
        class69 var5 = (class69) field1093.method3358((long) arg1.field2659);
        if (var5 != null) {
            int var6 = var5.field847;
            if (class218.method66(var6)) {
                method12(Statics.field3666[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2663 == 1337) {
        }
    }

    @ObfuscatedName("n.id([Lhx;IIIZB)V")
    public static void method12(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2678 == arg1) {
                method69(var6, arg2, arg3, arg4);
                method3914(var6, arg2, arg3);
                if (var6.field2709 > var6.field2674 - var6.field2739) {
                    var6.field2709 = var6.field2674 - var6.field2739;
                }
                if (var6.field2709 < 0) {
                    var6.field2709 = 0;
                }
                if (var6.field2681 > var6.field2683 - var6.field2675) {
                    var6.field2681 = var6.field2683 - var6.field2675;
                }
                if (var6.field2681 < 0) {
                    var6.field2681 = 0;
                }
                if (var6.field2661 == 0) {
                    method1001(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("y.if(Lhx;IIZI)V")
    public static void method69(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2739;
        int var5 = arg0.field2675;
        if (arg0.field2666 == 0) {
            arg0.field2739 = arg0.field2686;
        } else if (arg0.field2666 == 1) {
            arg0.field2739 = arg1 - arg0.field2686;
        } else if (arg0.field2666 == 2) {
            arg0.field2739 = arg0.field2686 * arg1 >> 14;
        }
        if (arg0.field2667 == 0) {
            arg0.field2675 = arg0.field2671;
        } else if (arg0.field2667 == 1) {
            arg0.field2675 = arg2 - arg0.field2671;
        } else if (arg0.field2667 == 2) {
            arg0.field2675 = arg0.field2671 * arg2 >> 14;
        }
        if (arg0.field2666 == 4) {
            arg0.field2739 = arg0.field2718 * arg0.field2675 / arg0.field2677;
        }
        if (arg0.field2667 == 4) {
            arg0.field2675 = arg0.field2739 * arg0.field2677 / arg0.field2718;
        }
        if (field1102 && arg0.field2661 == 0) {
            if (arg0.field2675 < 5 && arg0.field2739 < 5) {
                arg0.field2675 = 5;
                arg0.field2739 = 5;
            } else {
                if (arg0.field2675 <= 0) {
                    arg0.field2675 = 5;
                }
                if (arg0.field2739 <= 0) {
                    arg0.field2739 = 5;
                }
            }
        }
        if (arg0.field2663 == 1337) {
            field1104 = arg0;
        }
        if (arg3 && arg0.field2768 != null && (arg0.field2739 != var4 || arg0.field2675 != var5)) {
            class70 var6 = new class70();
            var6.field859 = arg0;
            var6.field865 = arg0.field2768;
            field1131.method3405(var6);
        }
    }

    @ObfuscatedName("ik.ii(Lhx;III)V")
    public static void method3914(class218 arg0, int arg1, int arg2) {
        if (arg0.field2664 == 0) {
            arg0.field2783 = arg0.field2668;
        } else if (arg0.field2664 == 1) {
            arg0.field2783 = (arg1 - arg0.field2739) / 2 + arg0.field2668;
        } else if (arg0.field2664 == 2) {
            arg0.field2783 = arg1 - arg0.field2739 - arg0.field2668;
        } else if (arg0.field2664 == 3) {
            arg0.field2783 = arg0.field2668 * arg1 >> 14;
        } else if (arg0.field2664 == 4) {
            arg0.field2783 = (arg0.field2668 * arg1 >> 14) + (arg1 - arg0.field2739) / 2;
        } else {
            arg0.field2783 = arg1 - arg0.field2739 - (arg0.field2668 * arg1 >> 14);
        }
        if (arg0.field2665 == 0) {
            arg0.field2759 = arg0.field2721;
        } else if (arg0.field2665 == 1) {
            arg0.field2759 = (arg2 - arg0.field2675) / 2 + arg0.field2721;
        } else if (arg0.field2665 == 2) {
            arg0.field2759 = arg2 - arg0.field2675 - arg0.field2721;
        } else if (arg0.field2665 == 3) {
            arg0.field2759 = arg0.field2721 * arg2 >> 14;
        } else if (arg0.field2665 == 4) {
            arg0.field2759 = (arg0.field2721 * arg2 >> 14) + (arg2 - arg0.field2675) / 2;
        } else {
            arg0.field2759 = arg2 - arg0.field2675 - (arg0.field2721 * arg2 >> 14);
        }
        if (!field1102 || arg0.field2661 != 0) {
            return;
        }
        if (arg0.field2783 < 0) {
            arg0.field2783 = 0;
        } else if (arg0.field2783 + arg0.field2739 > arg1) {
            arg0.field2783 = arg1 - arg0.field2739;
        }
        if (arg0.field2759 < 0) {
            arg0.field2759 = 0;
        } else if (arg0.field2759 + arg0.field2675 > arg2) {
            arg0.field2759 = arg2 - arg0.field2675;
        }
    }

    @ObfuscatedName("ai.ik(Lhx;IIIIIII)V")
    public static final void method700(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field1013) {
            field1014 = 32;
        } else {
            field1014 = 0;
        }
        field1013 = false;
        if (class60.field746 == 1 || !Statics.field952 && class60.field746 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2681 -= 4;
                method31(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2681 += 4;
                method31(arg0);
            } else if (arg5 >= arg1 - field1014 && arg5 < field1014 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2681 = (arg4 - arg3) * var8 / var9;
                method31(arg0);
                field1013 = true;
            }
        }
        if (field1130 == 0) {
            return;
        }
        int var10 = arg0.field2739;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2681 += field1130 * 45;
            method31(arg0);
        }
    }

    @ObfuscatedName("aa.it(Lhx;I)Z")
    public static final boolean method487(class218 arg0) {
        if (arg0.field2676 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2676.length; var1++) {
            int var2 = method2717(arg0, var1);
            int var3 = arg0.field2773[var1];
            if (arg0.field2676[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2676[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2676[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ef.io(Lhx;II)I")
    public static final int method2717(class218 arg0, int arg1) {
        if (arg0.field2771 == null || arg1 >= arg0.field2771.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2771[arg1];
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
                    var7 = field1096[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1067[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1068[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method2924(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class258.method2955(var12).field3507 || field945)) {
                        for (int var13 = 0; var13 < var11.field2777.length; var13++) {
                            if (var12 + 1 == var11.field2777[var13]) {
                                var7 += var11.field2778[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2609[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class224.field2848[field1067[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2609[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field908.field907;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class224.field2846[var14]) {
                            var7 += field1067[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method2924(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class258.method2955(var18).field3507 || field945)) {
                        for (int var19 = 0; var19 < var17.field2777.length; var19++) {
                            if (var18 + 1 == var17.field2777[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1050;
                }
                if (var6 == 12) {
                    var7 = field972;
                }
                if (var6 == 13) {
                    int var20 = class213.field2609[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class213.method1008(var22);
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
                    var7 = (Statics.field908.field1233 >> 7) + Statics.field2202;
                }
                if (var6 == 19) {
                    var7 = (Statics.field908.field1232 >> 7) + Statics.field840;
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

    @ObfuscatedName("ei.is(Lhx;Lix;IIZI)V")
    public static final void method2504(class218 arg0, class258 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3509;
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
            var7 = class227.field3095;
        }
        if (var6 != -1 && var7 != null) {
            method189(var7, class88.method1003(16748608) + arg1.field3494, var6, arg1.field3492, arg2, arg0.field2659, arg4);
        }
    }

    @ObfuscatedName("hc.im([Lhx;IIIIIIIB)V")
    public static final void method3671(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && (!var9.field2658 || var9.field2661 == 0 || var9.field2786 || method3688(var9) != 0 || field1046 == var9 || var9.field2663 == 1338) && var9.field2678 == arg1 && (!var9.field2658 || !method489(var9))) {
                int var10 = var9.field2783 + arg6;
                int var11 = var9.field2759 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2661 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2661 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2739 + var10;
                    int var19 = var9.field2675 + var11;
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
                    int var22 = var9.field2739 + var10;
                    int var23 = var9.field2675 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1112 == var9) {
                    field1113 = true;
                    field1128 = var10;
                    field1115 = var11;
                }
                if (!var9.field2658 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field753;
                    int var25 = class60.field748;
                    if (class60.field755 != 0) {
                        var24 = class60.field754;
                        var25 = class60.field740;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2663 == 1337) {
                        if (!field1101 && !field987 && var26) {
                            method662(var24, var25, var12, var13);
                        }
                    } else if (var9.field2663 == 1338) {
                        method577(var9, var10, var11);
                    } else {
                        if (var9.field2663 == 1400) {
                            Statics.field666.method4813(class60.field753, class60.field748, var26, var10, var11, var9.field2739, var9.field2675);
                        }
                        if (!field987 && var26) {
                            if (var9.field2663 == 1400) {
                                Statics.field666.method4870(var10, var11, var9.field2739, var9.field2675, var24, var25);
                            } else {
                                int var27 = var24 - var10;
                                int var28 = var25 - var11;
                                if (var9.field2662 == 1) {
                                    method478(var9.field2776, "", 24, 0, 0, var9.field2659);
                                }
                                if (var9.field2662 == 2 && !field1064) {
                                    String var29 = method3210(var9);
                                    if (var29 != null) {
                                        method478(var29, class88.method1003(65280) + var9.field2775, 25, 0, -1, var9.field2659);
                                    }
                                }
                                if (var9.field2662 == 3) {
                                    method478(class227.field2952, "", 26, 0, 0, var9.field2659);
                                }
                                if (var9.field2662 == 4) {
                                    method478(var9.field2776, "", 28, 0, 0, var9.field2659);
                                }
                                if (var9.field2662 == 5) {
                                    method478(var9.field2776, "", 29, 0, 0, var9.field2659);
                                }
                                if (var9.field2662 == 6 && field1087 == null) {
                                    method478(var9.field2776, "", 30, 0, -1, var9.field2659);
                                }
                                if (var9.field2661 == 2) {
                                    int var30 = 0;
                                    for (int var31 = 0; var31 < var9.field2675; var31++) {
                                        for (int var32 = 0; var32 < var9.field2739; var32++) {
                                            int var33 = (var9.field2725 + 32) * var32;
                                            int var34 = (var9.field2726 + 32) * var31;
                                            if (var30 < 20) {
                                                var33 += var9.field2727[var30];
                                                var34 += var9.field2729[var30];
                                            }
                                            if (var27 >= var33 && var28 >= var34 && var27 < var33 + 32 && var28 < var34 + 32) {
                                                field1134 = var30;
                                                Statics.field279 = var9;
                                                if (var9.field2777[var30] > 0) {
                                                    label957: {
                                                        class258 var35 = class258.method2955(var9.field2777[var30] - 1);
                                                        if (field1137 == 1) {
                                                            int var36 = method3688(var9);
                                                            boolean var37 = (var36 >> 30 & 0x1) != 0;
                                                            if (var37) {
                                                                if (Statics.field627 != var9.field2659 || Statics.field699 != var30) {
                                                                    method478(class227.field3009, field1086 + " " + class88.field1399 + " " + class88.method1003(16748608) + var35.field3494, 31, var35.field3492, var30, var9.field2659);
                                                                }
                                                                break label957;
                                                            }
                                                        }
                                                        if (field1064) {
                                                            int var38 = method3688(var9);
                                                            boolean var39 = (var38 >> 30 & 0x1) != 0;
                                                            if (var39) {
                                                                if ((Statics.field846 & 0x10) == 16) {
                                                                    method478(field1090, field1091 + " " + class88.field1399 + " " + class88.method1003(16748608) + var35.field3494, 32, var35.field3492, var30, var9.field2659);
                                                                }
                                                                break label957;
                                                            }
                                                        }
                                                        String[] var40 = var35.field3509;
                                                        if (field1103) {
                                                            String[] var41 = method2967(var40);
                                                        }
                                                        int var42 = -1;
                                                        if (field970 && class51.field652[81]) {
                                                            var42 = var35.method4241();
                                                        }
                                                        int var43 = method3688(var9);
                                                        boolean var44 = (var43 >> 30 & 0x1) != 0;
                                                        if (var44) {
                                                            for (int var45 = 4; var45 >= 3; var45--) {
                                                                if (var42 != var45) {
                                                                    method2504(var9, var35, var30, var45, false);
                                                                }
                                                            }
                                                        }
                                                        int var46 = method3688(var9);
                                                        boolean var47 = (var46 >> 31 & 0x1) != 0;
                                                        if (var47) {
                                                            method478(class227.field3009, class88.method1003(16748608) + var35.field3494, 38, var35.field3492, var30, var9.field2659);
                                                        }
                                                        int var48 = method3688(var9);
                                                        boolean var49 = (var48 >> 30 & 0x1) != 0;
                                                        if (var49) {
                                                            for (int var50 = 2; var50 >= 0; var50--) {
                                                                if (var42 != var50) {
                                                                    method2504(var9, var35, var30, var50, false);
                                                                }
                                                            }
                                                            if (var42 >= 0) {
                                                                method2504(var9, var35, var30, var42, true);
                                                            }
                                                        }
                                                        String[] var51 = var9.field2730;
                                                        if (field1103) {
                                                            var51 = method2967(var51);
                                                        }
                                                        if (var51 != null) {
                                                            for (int var52 = 4; var52 >= 0; var52--) {
                                                                if (var51[var52] != null) {
                                                                    byte var53 = 0;
                                                                    if (var52 == 0) {
                                                                        var53 = 39;
                                                                    }
                                                                    if (var52 == 1) {
                                                                        var53 = 40;
                                                                    }
                                                                    if (var52 == 2) {
                                                                        var53 = 41;
                                                                    }
                                                                    if (var52 == 3) {
                                                                        var53 = 42;
                                                                    }
                                                                    if (var52 == 4) {
                                                                        var53 = 43;
                                                                    }
                                                                    method478(var51[var52], class88.method1003(16748608) + var35.field3494, var53, var35.field3492, var30, var9.field2659);
                                                                }
                                                            }
                                                        }
                                                        method478(class227.field3010, class88.method1003(16748608) + var35.field3494, 1005, var35.field3492, var30, var9.field2659);
                                                    }
                                                }
                                            }
                                            var30++;
                                        }
                                    }
                                }
                                if (var9.field2658) {
                                    if (!field1064) {
                                        for (int var54 = 9; var54 >= 5; var54--) {
                                            String var55 = method2728(var9, var54);
                                            if (var55 != null) {
                                                method478(var55, var9.field2682, 1007, var54 + 1, var9.field2744, var9.field2659);
                                            }
                                        }
                                        String var56 = method3210(var9);
                                        if (var56 != null) {
                                            method478(var56, var9.field2682, 25, 0, var9.field2744, var9.field2659);
                                        }
                                        for (int var57 = 4; var57 >= 0; var57--) {
                                            String var58 = method2728(var9, var57);
                                            if (var58 != null) {
                                                method478(var58, var9.field2682, 57, var57 + 1, var9.field2744, var9.field2659);
                                            }
                                        }
                                        int var59 = method3688(var9);
                                        boolean var60 = (var59 & 0x1) != 0;
                                        if (var60) {
                                            method478(class227.field3039, "", 30, 0, var9.field2744, var9.field2659);
                                        }
                                    } else if (class219.method258(method3688(var9)) && (Statics.field846 & 0x20) == 32) {
                                        method478(field1090, field1091 + " " + class88.field1399 + " " + var9.field2682, 58, 0, var9.field2744, var9.field2659);
                                    }
                                }
                            }
                        }
                        if (var9.field2661 == 0) {
                            if (!var9.field2658 && method489(var9) && Statics.field697 != var9) {
                                continue;
                            }
                            method3671(arg0, var9.field2659, var12, var13, var14, var15, var10 - var9.field2709, var11 - var9.field2681);
                            if (var9.field2680 != null) {
                                method3671(var9.field2680, var9.field2659, var12, var13, var14, var15, var10 - var9.field2709, var11 - var9.field2681);
                            }
                            class69 var61 = (class69) field1093.method3358((long) var9.field2659);
                            if (var61 != null) {
                                if (var61.field848 == 0 && class60.field753 >= var12 && class60.field748 >= var13 && class60.field753 < var14 && class60.field748 < var15 && !field987 && !field1102) {
                                    for (class70 var62 = (class70) field1131.method3410(); var62 != null; var62 = (class70) field1131.method3412()) {
                                        if (var62.field867) {
                                            var62.method3397();
                                            var62.field859.field2770 = false;
                                        }
                                    }
                                    if (Statics.field683 == 0) {
                                        field1112 = null;
                                        field1046 = null;
                                    }
                                    if (!field987) {
                                        method1537();
                                    }
                                }
                                int var63 = var61.field847;
                                if (class218.method66(var63)) {
                                    method3671(Statics.field3666[var63], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2658) {
                            if (var9.field2655) {
                                if (class60.field753 >= var12 && class60.field748 >= var13 && class60.field753 < var14 && class60.field748 < var15) {
                                    for (class70 var64 = (class70) field1131.method3410(); var64 != null; var64 = (class70) field1131.method3412()) {
                                        if (var64.field867) {
                                            var64.method3397();
                                            var64.field859.field2770 = false;
                                        }
                                    }
                                    if (Statics.field683 == 0) {
                                        field1112 = null;
                                        field1046 = null;
                                    }
                                    if (!field987) {
                                        method1537();
                                    }
                                }
                            } else if (var9.field2793 && class60.field753 >= var12 && class60.field748 >= var13 && class60.field753 < var14 && class60.field748 < var15) {
                                for (class70 var65 = (class70) field1131.method3410(); var65 != null; var65 = (class70) field1131.method3412()) {
                                    if (var65.field867 && var65.field859.field2760 == var65.field865) {
                                        var65.method3397();
                                    }
                                }
                            }
                            boolean var66;
                            if (class60.field753 >= var12 && class60.field748 >= var13 && class60.field753 < var14 && class60.field748 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class60.field746 == 1 || !Statics.field952 && class60.field746 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class60.field755 == 1 || !Statics.field952 && class60.field755 == 4) && class60.field754 >= var12 && class60.field740 >= var13 && class60.field754 < var14 && class60.field740 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method2409(var9, class60.field754 - var10, class60.field740 - var11);
                            }
                            if (var9.field2663 == 1400) {
                                Statics.field666.method4814(class60.field753, class60.field748, var66 & var67);
                            }
                            if (field1112 != null && field1112 != var9 && var66) {
                                int var69 = method3688(var9);
                                boolean var70 = (var69 >> 20 & 0x1) != 0;
                                if (var70) {
                                    field1109 = var9;
                                }
                            }
                            if (field1046 == var9) {
                                field1210 = true;
                                field1012 = var10;
                                field1183 = var11;
                            }
                            if (var9.field2786) {
                                if (var66 && field1130 != 0 && var9.field2760 != null) {
                                    class70 var71 = new class70();
                                    var71.field867 = true;
                                    var71.field859 = var9;
                                    var71.field861 = field1130;
                                    var71.field865 = var9.field2760;
                                    field1131.method3405(var71);
                                }
                                if (field1112 != null || Statics.field326 != null || field987) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2785 && var68) {
                                    var9.field2785 = true;
                                    if (var9.field2670 != null) {
                                        class70 var72 = new class70();
                                        var72.field867 = true;
                                        var72.field859 = var9;
                                        var72.field860 = class60.field754 - var10;
                                        var72.field861 = class60.field740 - var11;
                                        var72.field865 = var9.field2670;
                                        field1131.method3405(var72);
                                    }
                                }
                                if (var9.field2785 && var67 && var9.field2745 != null) {
                                    class70 var73 = new class70();
                                    var73.field867 = true;
                                    var73.field859 = var9;
                                    var73.field860 = class60.field753 - var10;
                                    var73.field861 = class60.field748 - var11;
                                    var73.field865 = var9.field2745;
                                    field1131.method3405(var73);
                                }
                                if (var9.field2785 && !var67) {
                                    var9.field2785 = false;
                                    if (var9.field2712 != null) {
                                        class70 var74 = new class70();
                                        var74.field867 = true;
                                        var74.field859 = var9;
                                        var74.field860 = class60.field753 - var10;
                                        var74.field861 = class60.field748 - var11;
                                        var74.field865 = var9.field2712;
                                        field1133.method3405(var74);
                                    }
                                }
                                if (var67 && var9.field2743 != null) {
                                    class70 var75 = new class70();
                                    var75.field867 = true;
                                    var75.field859 = var9;
                                    var75.field860 = class60.field753 - var10;
                                    var75.field861 = class60.field748 - var11;
                                    var75.field865 = var9.field2743;
                                    field1131.method3405(var75);
                                }
                                if (!var9.field2770 && var66) {
                                    var9.field2770 = true;
                                    if (var9.field2767 != null) {
                                        class70 var76 = new class70();
                                        var76.field867 = true;
                                        var76.field859 = var9;
                                        var76.field860 = class60.field753 - var10;
                                        var76.field861 = class60.field748 - var11;
                                        var76.field865 = var9.field2767;
                                        field1131.method3405(var76);
                                    }
                                }
                                if (var9.field2770 && var66 && var9.field2746 != null) {
                                    class70 var77 = new class70();
                                    var77.field867 = true;
                                    var77.field859 = var9;
                                    var77.field860 = class60.field753 - var10;
                                    var77.field861 = class60.field748 - var11;
                                    var77.field865 = var9.field2746;
                                    field1131.method3405(var77);
                                }
                                if (var9.field2770 && !var66) {
                                    var9.field2770 = false;
                                    if (var9.field2747 != null) {
                                        class70 var78 = new class70();
                                        var78.field867 = true;
                                        var78.field859 = var9;
                                        var78.field860 = class60.field753 - var10;
                                        var78.field861 = class60.field748 - var11;
                                        var78.field865 = var9.field2747;
                                        field1133.method3405(var78);
                                    }
                                }
                                if (var9.field2758 != null) {
                                    class70 var79 = new class70();
                                    var79.field859 = var9;
                                    var79.field865 = var9.field2758;
                                    field1001.method3405(var79);
                                }
                                if (var9.field2752 != null && field982 > var9.field2749) {
                                    if (var9.field2753 == null || field982 - var9.field2749 > 32) {
                                        class70 var84 = new class70();
                                        var84.field859 = var9;
                                        var84.field865 = var9.field2752;
                                        field1131.method3405(var84);
                                    } else {
                                        label661: for (int var80 = var9.field2749; var80 < field982; var80++) {
                                            int var81 = field1023[var80 & 0x1F];
                                            for (int var82 = 0; var82 < var9.field2753.length; var82++) {
                                                if (var9.field2753[var82] == var81) {
                                                    class70 var83 = new class70();
                                                    var83.field859 = var9;
                                                    var83.field865 = var9.field2752;
                                                    field1131.method3405(var83);
                                                    break label661;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2749 = field982;
                                }
                                if (var9.field2754 != null && field1121 > var9.field2788) {
                                    if (var9.field2755 == null || field1121 - var9.field2788 > 32) {
                                        class70 var89 = new class70();
                                        var89.field859 = var9;
                                        var89.field865 = var9.field2754;
                                        field1131.method3405(var89);
                                    } else {
                                        label637: for (int var85 = var9.field2788; var85 < field1121; var85++) {
                                            int var86 = field1120[var85 & 0x1F];
                                            for (int var87 = 0; var87 < var9.field2755.length; var87++) {
                                                if (var9.field2755[var87] == var86) {
                                                    class70 var88 = new class70();
                                                    var88.field859 = var9;
                                                    var88.field865 = var9.field2754;
                                                    field1131.method3405(var88);
                                                    break label637;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2788 = field1121;
                                }
                                if (var9.field2756 != null && field1123 > var9.field2673) {
                                    if (var9.field2757 == null || field1123 - var9.field2673 > 32) {
                                        class70 var94 = new class70();
                                        var94.field859 = var9;
                                        var94.field865 = var9.field2756;
                                        field1131.method3405(var94);
                                    } else {
                                        label613: for (int var90 = var9.field2673; var90 < field1123; var90++) {
                                            int var91 = field1122[var90 & 0x1F];
                                            for (int var92 = 0; var92 < var9.field2757.length; var92++) {
                                                if (var9.field2757[var92] == var91) {
                                                    class70 var93 = new class70();
                                                    var93.field859 = var9;
                                                    var93.field865 = var9.field2756;
                                                    field1131.method3405(var93);
                                                    break label613;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2673 = field1123;
                                }
                                if (field1124 > var9.field2706 && var9.field2761 != null) {
                                    class70 var95 = new class70();
                                    var95.field859 = var9;
                                    var95.field865 = var9.field2761;
                                    field1131.method3405(var95);
                                }
                                if (field1125 > var9.field2706 && var9.field2763 != null) {
                                    class70 var96 = new class70();
                                    var96.field859 = var9;
                                    var96.field865 = var9.field2763;
                                    field1131.method3405(var96);
                                }
                                if (field1126 > var9.field2706 && var9.field2764 != null) {
                                    class70 var97 = new class70();
                                    var97.field859 = var9;
                                    var97.field865 = var9.field2764;
                                    field1131.method3405(var97);
                                }
                                if (field975 > var9.field2706 && var9.field2769 != null) {
                                    class70 var98 = new class70();
                                    var98.field859 = var9;
                                    var98.field865 = var9.field2769;
                                    field1131.method3405(var98);
                                }
                                if (field1117 > var9.field2706 && var9.field2738 != null) {
                                    class70 var99 = new class70();
                                    var99.field859 = var9;
                                    var99.field865 = var9.field2738;
                                    field1131.method3405(var99);
                                }
                                if (field1147 > var9.field2706 && var9.field2791 != null) {
                                    class70 var100 = new class70();
                                    var100.field859 = var9;
                                    var100.field865 = var9.field2791;
                                    field1131.method3405(var100);
                                }
                                var9.field2706 = field1167;
                                if (var9.field2649 != null) {
                                    for (int var101 = 0; var101 < field1154; var101++) {
                                        class70 var102 = new class70();
                                        var102.field859 = var9;
                                        var102.field857 = field1132[var101];
                                        var102.field858 = field1155[var101];
                                        var102.field865 = var9.field2649;
                                        field1131.method3405(var102);
                                    }
                                }
                            }
                        }
                        if (!var9.field2658 && field1112 == null && Statics.field326 == null && !field987) {
                            if ((var9.field2728 >= 0 || var9.field2647 != 0) && class60.field753 >= var12 && class60.field748 >= var13 && class60.field753 < var14 && class60.field748 < var15) {
                                if (var9.field2728 >= 0) {
                                    Statics.field697 = arg0[var9.field2728];
                                } else {
                                    Statics.field697 = var9;
                                }
                            }
                            if (var9.field2661 == 8 && class60.field753 >= var12 && class60.field748 >= var13 && class60.field753 < var14 && class60.field748 < var15) {
                                Statics.field630 = var9;
                            }
                            if (var9.field2683 > var9.field2675) {
                                method700(var9, var9.field2739 + var10, var11, var9.field2675, var9.field2683, class60.field753, class60.field748);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bm.ig([Lhx;II)V")
    public static final void method1020(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2661 == 0) {
                    if (var3.field2680 != null) {
                        method1020(var3.field2680, arg1);
                    }
                    class69 var4 = (class69) field1093.method3358((long) var3.field2659);
                    if (var4 != null) {
                        int var5 = var4.field847;
                        if (class218.method66(var5)) {
                            method1020(Statics.field3666[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2766 != null) {
                    class70 var6 = new class70();
                    var6.field859 = var3;
                    var6.field865 = var3.field2766;
                    class83.method2765(var6);
                }
                if (arg1 == 1 && var3.field2789 != null) {
                    if (var3.field2744 >= 0) {
                        class218 var7 = class218.method2924(var3.field2659);
                        if (var7 == null || var7.field2680 == null || var3.field2744 >= var7.field2680.length || var7.field2680[var3.field2744] != var3) {
                            continue;
                        }
                    }
                    class70 var8 = new class70();
                    var8.field859 = var3;
                    var8.field865 = var3.field2789;
                    class83.method2765(var8);
                }
            }
        }
    }

    @ObfuscatedName("ea.ih(Lhx;III)V")
    public static final void method2409(class218 arg0, int arg1, int arg2) {
        if (field1112 != null || field987 || arg0 == null) {
            return;
        }
        class218 var3 = arg0;
        int var4 = class219.method1399(method3688(arg0));
        class218 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class218.method2924(var3.field2678);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class218 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2734;
        }
        if (var7 == null) {
            return;
        }
        field1112 = arg0;
        class218 var9 = arg0;
        int var10 = class219.method1399(method3688(arg0));
        class218 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class218.method2924(var9.field2678);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class218 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2734;
        }
        field1046 = var13;
        field1107 = arg1;
        field1108 = arg2;
        Statics.field683 = 0;
        field1116 = false;
        int var15 = Statics.method704();
        if (var15 != -1) {
            method473(var15);
        }
        return;
    }

    @ObfuscatedName("client.ic(I)V")
    public final void method1272() {
        method31(field1112);
        Statics.field683++;
        if (field1113 && field1210) {
            int var1 = class60.field753;
            int var2 = class60.field748;
            int var3 = var1 - field1107;
            int var4 = var2 - field1108;
            if (var3 < field1012) {
                var3 = field1012;
            }
            if (field1112.field2739 + var3 > field1012 + field1046.field2739) {
                var3 = field1012 + field1046.field2739 - field1112.field2739;
            }
            if (var4 < field1183) {
                var4 = field1183;
            }
            if (field1112.field2675 + var4 > field1183 + field1046.field2675) {
                var4 = field1183 + field1046.field2675 - field1112.field2675;
            }
            int var5 = var3 - field1128;
            int var6 = var4 - field1115;
            int var7 = field1112.field2660;
            if (Statics.field683 > field1112.field2650 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1116 = true;
            }
            int var8 = field1046.field2709 + (var3 - field1012);
            int var9 = field1046.field2681 + (var4 - field1183);
            if (field1112.field2748 != null && field1116) {
                class70 var10 = new class70();
                var10.field859 = field1112;
                var10.field860 = var8;
                var10.field861 = var9;
                var10.field865 = field1112.field2748;
                class83.method2765(var10);
            }
            if (class60.field746 == 0) {
                if (field1116) {
                    if (field1112.field2731 != null) {
                        class70 var11 = new class70();
                        var11.field859 = field1112;
                        var11.field860 = var8;
                        var11.field861 = var9;
                        var11.field863 = field1109;
                        var11.field865 = field1112.field2731;
                        class83.method2765(var11);
                    }
                    if (field1109 != null) {
                        class218 var12 = field1112;
                        int var13 = class219.method1399(method3688(var12));
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
                                var12 = class218.method2924(var12.field2678);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            field986.method3243(158);
                            field986.method3020(field1112.field2744);
                            field986.method3020(field1109.field2744);
                            field986.method3035(field1109.field2659);
                            field986.method2978(field1112.field2779);
                            field986.method2978(field1109.field2779);
                            field986.method3035(field1112.field2659);
                        }
                    }
                } else if (this.method1071()) {
                    this.method1072(field1128 + field1107, field1115 + field1108);
                } else if (field1071 > 0) {
                    int var16 = field1128 + field1107;
                    int var17 = field1115 + field1108;
                    class89 var18 = Statics.field179;
                    method1005(var18.field1405, var18.field1410, var18.field1407, var18.field1408, var18.field1409, var18.field1409, var16, var17);
                    Statics.field179 = null;
                }
                field1112 = null;
            }
        } else if (Statics.field683 > 1) {
            field1112 = null;
        }
    }

    @ObfuscatedName("at.ij(II)V")
    public static void method473(int arg0) {
        Statics.field179 = new class89();
        Statics.field179.field1405 = field1188[arg0];
        Statics.field179.field1410 = field949[arg0];
        Statics.field179.field1407 = field1114[arg0];
        Statics.field179.field1408 = field1075[arg0];
        Statics.field179.field1409 = field1076[arg0];
    }

    @ObfuscatedName("b.iz(Lhx;I)V")
    public static void method31(class218 arg0) {
        if (field1072 == arg0.field2700) {
            field1111[arg0.field2790] = true;
        }
    }

    @ObfuscatedName("s.iy(B)V")
    public static void method46() {
        for (class69 var0 = (class69) field1093.method3365(); var0 != null; var0 = (class69) field1093.method3362()) {
            int var1 = var0.field847;
            if (class218.method66(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field3666[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2658;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2475;
                    class218 var6 = class218.method2924(var5);
                    if (var6 != null) {
                        method31(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fz.iu([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2967(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ii.in(IB)V")
    public static final void method3858(int arg0) {
        if (!class218.method66(arg0)) {
            return;
        }
        class218[] var1 = Statics.field3666[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2781 = 0;
                var3.field2735 = 0;
            }
        }
    }

    @ObfuscatedName("at.ie([Lhx;II)V")
    public static final void method358(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2678 == arg1 && (!var3.field2658 || !method489(var3))) {
                if (var3.field2661 == 0) {
                    if (!var3.field2658 && method489(var3) && Statics.field697 != var3) {
                        continue;
                    }
                    method358(arg0, var3.field2659);
                    if (var3.field2680 != null) {
                        method358(var3.field2680, var3.field2659);
                    }
                    class69 var4 = (class69) field1093.method3358((long) var3.field2659);
                    if (var4 != null) {
                        int var5 = var4.field847;
                        if (class218.method66(var5)) {
                            method358(Statics.field3666[var5], -1);
                        }
                    }
                }
                if (var3.field2661 == 6) {
                    if (var3.field2784 != -1 || var3.field2707 != -1) {
                        boolean var6 = method487(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2707;
                        } else {
                            var7 = var3.field2784;
                        }
                        if (var7 != -1) {
                            class262 var8 = class262.method3737(var7);
                            var3.field2735 += field1008;
                            while (var3.field2735 > var8.field3604[var3.field2781]) {
                                var3.field2735 -= var8.field3604[var3.field2781];
                                var3.field2781++;
                                if (var3.field2781 >= var8.field3614.length) {
                                    var3.field2781 -= var8.field3605;
                                    if (var3.field2781 < 0 || var3.field2781 >= var8.field3614.length) {
                                        var3.field2781 = 0;
                                    }
                                }
                                method31(var3);
                            }
                        }
                    }
                    if (var3.field2715 != 0 && !var3.field2658) {
                        int var9 = var3.field2715 >> 16;
                        int var10 = var3.field2715 << 16 >> 16;
                        int var11 = field1008 * var9;
                        int var12 = field1008 * var10;
                        var3.field2710 = var3.field2710 + var11 & 0x7FF;
                        var3.field2711 = var3.field2711 + var12 & 0x7FF;
                        method31(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.il(IB)V")
    public static final void method261(int arg0) {
        method46();
        for (class82 var1 = (class82) class82.field1335.method3410(); var1 != null; var1 = (class82) class82.field1335.method3412()) {
            if (var1.field1340 != null) {
                var1.method1471();
            }
        }
        int var2 = class243.method479(arg0).field3290;
        if (var2 == 0) {
            return;
        }
        int var3 = class213.field2609[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class136.method2459(0.9D);
                ((class125) Statics.field2042).method2198(0.9D);
            }
            if (var3 == 2) {
                class136.method2459(0.8D);
                ((class125) Statics.field2042).method2198(0.8D);
            }
            if (var3 == 3) {
                class136.method2459(0.7D);
                ((class125) Statics.field2042).method2198(0.7D);
            }
            if (var3 == 4) {
                class136.method2459(0.6D);
                ((class125) Statics.field2042).method2198(0.6D);
            }
            class258.method486();
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
            if (field1168 != var4) {
                if (field1168 == 0 && field1169 != -1) {
                    class205.method2134(Statics.field601, field1169, 0, var4, false);
                    field1170 = false;
                } else if (var4 == 0) {
                    class205.method2905();
                    field1170 = false;
                } else {
                    class205.method2895(var4);
                }
                field1168 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1186 = 127;
            }
            if (var3 == 1) {
                field1186 = 96;
            }
            if (var3 == 2) {
                field1186 = 64;
            }
            if (var3 == 3) {
                field1186 = 32;
            }
            if (var3 == 4) {
                field1186 = 0;
            }
        }
        if (var2 == 5) {
            field1069 = var3;
        }
        if (var2 == 6) {
            field1094 = var3;
        }
        if (var2 == 9) {
            field1145 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1172 = 127;
            }
            if (var3 == 1) {
                field1172 = 96;
            }
            if (var3 == 2) {
                field1172 = 64;
            }
            if (var3 == 3) {
                field1172 = 32;
            }
            if (var3 == 4) {
                field1172 = 0;
            }
        }
        if (var2 == 17) {
            field1100 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field968 = (class91) class170.method1570(class91.method51(), var3);
            if (field968 == null) {
                field968 = class91.field1432;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field1061 = -1;
            } else {
                field1061 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field969 = (class91) class170.method1570(class91.method51(), var3);
            if (field969 == null) {
                field969 = class91.field1432;
            }
        }
    }

    @ObfuscatedName("kb.iw(Lhx;B)V")
    public static final void method4995(class218 arg0) {
        int var1 = arg0.field2663;
        if (var1 == 324) {
            if (field1205 == -1) {
                field1205 = arg0.field2694;
                field1206 = arg0.field2669;
            }
            if (field1079.field2634) {
                arg0.field2694 = field1205;
            } else {
                arg0.field2694 = field1206;
            }
        } else if (var1 == 325) {
            if (field1205 == -1) {
                field1205 = arg0.field2694;
                field1206 = arg0.field2669;
            }
            if (field1079.field2634) {
                arg0.field2694 = field1206;
            } else {
                arg0.field2694 = field1205;
            }
        } else if (var1 == 327) {
            arg0.field2710 = 150;
            arg0.field2711 = (int) (Math.sin((double) field973 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2782 = 5;
            arg0.field2703 = 0;
        } else if (var1 == 328) {
            arg0.field2710 = 150;
            arg0.field2711 = (int) (Math.sin((double) field973 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2782 = 5;
            arg0.field2703 = 1;
        }
    }

    @ObfuscatedName("cc.iv(IIII)Lbq;")
    public static final class69 method1506(int arg0, int arg1, int arg2) {
        class69 var3 = new class69();
        var3.field847 = arg1;
        var3.field848 = arg2;
        field1093.method3359(var3, (long) arg0);
        method3858(arg1);
        class218 var4 = class218.method2924(arg0);
        method31(var4);
        if (field1087 != null) {
            method31(field1087);
            field1087 = null;
        }
        method70();
        method1001(Statics.field3666[arg0 >> 16], var4, false);
        class83.method794(arg1);
        if (field1092 != -1) {
            int var5 = field1092;
            if (class218.method66(var5)) {
                method1020(Statics.field3666[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("bt.ip(Lbq;ZI)V")
    public static final void method1030(class69 arg0, boolean arg1) {
        int var2 = arg0.field847;
        int var3 = (int) arg0.field2475;
        arg0.method3397();
        if (arg1 && var2 != -1 && Statics.field18[var2]) {
            Statics.field2620.method3837(var2);
            if (Statics.field3666[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field3666[var2].length; var5++) {
                    if (Statics.field3666[var2][var5] != null) {
                        if (Statics.field3666[var2][var5].field2661 == 2) {
                            var4 = false;
                        } else {
                            Statics.field3666[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field3666[var2] = null;
                }
                Statics.field18[var2] = false;
            }
        }
        for (class200 var6 = (class200) field951.method3365(); var6 != null; var6 = (class200) field951.method3362()) {
            if ((long) var2 == (var6.field2475 >> 48 & 0xFFFFL)) {
                var6.method3397();
            }
        }
        class218 var7 = class218.method2924(var3);
        if (var7 != null) {
            method31(var7);
        }
        method70();
        if (field1092 != -1) {
            int var8 = field1092;
            if (class218.method66(var8)) {
                method1020(Statics.field3666[var8], 1);
            }
        }
    }

    @ObfuscatedName("fs.iq(Lhx;I)Z")
    public static final boolean method2900(class218 arg0) {
        int var1 = arg0.field2663;
        if (var1 == 205) {
            field1059 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1079.method3714(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1079.method3706(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1079.method3713(false);
        }
        if (var1 == 325) {
            field1079.method3713(true);
        }
        if (var1 == 326) {
            field986.method3243(71);
            field1079.method3705(field986);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("t.ia(IIIILkd;Lhc;I)V")
    public static final void method55(int arg0, int arg1, int arg2, int arg3, class287 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3938(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field1016 & 0x7FF;
        int var8 = class136.field2045[var7];
        int var9 = class136.field2029[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2601 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field822.method4660(arg5.field2601 / 2 + arg0 - var17 / 2 + var15, arg5.field2600 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ib.ir(IIIILkd;Lhc;I)V")
    public static final void method3938(int arg0, int arg1, int arg2, int arg3, class287 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field1016 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class136.field2045[var6];
        int var9 = class136.field2029[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4750(arg5.field2601 / 2 + var10 - arg4.field3794 / 2, arg5.field2600 / 2 - var11 - arg4.field3791 / 2, arg0, arg1, arg5.field2601, arg5.field2600, arg5.field2603, arg5.field2602);
        } else {
            arg4.method4673(arg5.field2601 / 2 + arg0 + var10 - arg4.field3794 / 2, arg5.field2600 / 2 + arg1 - var11 - arg4.field3791 / 2);
        }
    }

    @ObfuscatedName("bg.jf(Ljava/lang/String;ZI)Z")
    public static boolean method1402(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class269.method2713(arg0, Statics.field244);
        for (int var3 = 0; var3 < field1198; var3++) {
            if (var2.equalsIgnoreCase(class269.method2713(field1073[var3].field823, Statics.field244)) && (!arg1 || field1073[var3].field820 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class269.method2713(Statics.field908.field925, Statics.field244))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("g.jw(Ljava/lang/String;B)Z")
    public static boolean method187(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class269.method2713(arg0, Statics.field244);
        for (int var2 = 0; var2 < field962; var2++) {
            class71 var3 = field1203[var2];
            if (var1.equalsIgnoreCase(class269.method2713(var3.field876, Statics.field244))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class269.method2713(var3.field872, Statics.field244))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("w.jz(Ljava/lang/String;B)V")
    public static final void method195(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field1198 < 200 || field1054 == 1) || field1198 >= 400) {
            class98.method1380(30, "", class227.field2986);
            return;
        }
        String var1 = class269.method2713(arg0, Statics.field244);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1198; var2++) {
            class66 var3 = field1073[var2];
            String var4 = class269.method2713(var3.field823, Statics.field244);
            if (var4 != null && var4.equals(var1)) {
                class98.method1380(30, "", arg0 + class227.field3026);
                return;
            }
            if (var3.field818 != null) {
                String var5 = class269.method2713(var3.field818, Statics.field244);
                if (var5 != null && var5.equals(var1)) {
                    class98.method1380(30, "", arg0 + class227.field3026);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field962; var6++) {
            class71 var7 = field1203[var6];
            String var8 = class269.method2713(var7.field876, Statics.field244);
            if (var8 != null && var8.equals(var1)) {
                class98.method1380(30, "", class227.field3031 + arg0 + class227.field3077);
                return;
            }
            if (var7.field872 != null) {
                String var9 = class269.method2713(var7.field872, Statics.field244);
                if (var9 != null && var9.equals(var1)) {
                    class98.method1380(30, "", class227.field3031 + arg0 + class227.field3077);
                    return;
                }
            }
        }
        if (class269.method2713(Statics.field908.field925, Statics.field244).equals(var1)) {
            class98.method1380(30, "", class227.field3029);
        } else {
            field986.method3243(254);
            field986.method3102(class175.method1055(arg0));
            field986.method2984(arg0);
        }
    }

    @ObfuscatedName("iw.jt(Ljava/lang/String;ZI)V")
    public static final void method4140(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field962 < 100 || field1054 == 1) || field962 >= 400) {
            class98.method1380(31, "", class227.field3027);
            return;
        }
        String var2 = class269.method2713(arg0, Statics.field244);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field962; var3++) {
            class71 var4 = field1203[var3];
            String var5 = class269.method2713(var4.field876, Statics.field244);
            if (var5 != null && var5.equals(var2)) {
                class98.method1380(31, "", arg0 + class227.field2965);
                return;
            }
            if (var4.field872 != null) {
                String var6 = class269.method2713(var4.field872, Statics.field244);
                if (var6 != null && var6.equals(var2)) {
                    class98.method1380(31, "", arg0 + class227.field2965);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1198; var7++) {
            class66 var8 = field1073[var7];
            String var9 = class269.method2713(var8.field823, Statics.field244);
            if (var9 != null && var9.equals(var2)) {
                class98.method1380(31, "", class227.field3033 + arg0 + class227.field3034);
                return;
            }
            if (var8.field818 != null) {
                String var10 = class269.method2713(var8.field818, Statics.field244);
                if (var10 != null && var10.equals(var2)) {
                    class98.method1380(31, "", class227.field3033 + arg0 + class227.field3034);
                    return;
                }
            }
        }
        if (class269.method2713(Statics.field908.field925, Statics.field244).equals(var2)) {
            class98.method1380(31, "", class227.field3030);
        } else {
            field986.method3243(33);
            field986.method3102(class175.method1055(arg0));
            field986.method2984(arg0);
        }
    }

    @ObfuscatedName("ax.jm(Ljava/lang/String;II)V")
    public static final void method231(String arg0, int arg1) {
        field986.method3243(6);
        field986.method3102(class175.method1055(arg0) + 1);
        field986.method2984(arg0);
        field986.method3102(arg1);
    }

    @ObfuscatedName("bv.jh(Ljava/lang/String;I)V")
    public static final void method745(String arg0) {
        if (!arg0.equals("")) {
            field986.method3243(144);
            field986.method3102(class175.method1055(arg0));
            field986.method2984(arg0);
        }
    }

    @ObfuscatedName("hs.jo(Lhx;B)I")
    public static int method3688(class218 arg0) {
        class200 var1 = (class200) field951.method3358(((long) arg0.field2659 << 32) + (long) arg0.field2744);
        return var1 == null ? arg0.field2736 : var1.field2488;
    }

    @ObfuscatedName("aj.jg(Lhx;I)Z")
    public static boolean method489(class218 arg0) {
        if (field1102) {
            if (method3688(arg0) != 0) {
                return false;
            }
            if (arg0.field2661 == 0) {
                return false;
            }
        }
        return arg0.field2679;
    }

    @ObfuscatedName("ev.jp(Lhx;IB)Ljava/lang/String;")
    public static String method2728(class218 arg0, int arg1) {
        int var2 = method3688(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2702 == null) {
            return null;
        } else if (arg0.field2733 == null || arg0.field2733.length <= arg1 || arg0.field2733[arg1] == null || arg0.field2733[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2733[arg1];
        }
    }

    @ObfuscatedName("fm.jq(Lhx;S)Ljava/lang/String;")
    public static String method3210(class218 arg0) {
        int var1 = method3688(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2654 == null || arg0.field2654.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2654;
        }
    }

    @ObfuscatedName("ct.ju(Ljava/lang/String;ZI)V")
    public static void method1564(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3487; var5++) {
            class258 var6 = class258.method2955(var5);
            if ((!arg1 || var6.field3488) && var6.field3486 == -1 && var6.field3494.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2444 = -1;
                    Statics.field3677 = null;
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
        Statics.field3677 = var3;
        Statics.field3320 = 0;
        Statics.field2444 = var4;
        String[] var9 = new String[Statics.field2444];
        for (int var10 = 0; var10 < Statics.field2444; var10++) {
            var9[var10] = class258.method2955(var3[var10]).field3494;
        }
        short[] var11 = Statics.field3677;
        class172.method2756(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("ar.ja(Lfp;IB)V")
    public static void method224(class175 arg0, int arg1) {
        byte[] var2 = arg0.field2392;
        if (field980 == null) {
            field980 = new byte[24];
        }
        class185.method3298(var2, arg1, field980, 0, 24);
        if (class157.field2254 == null) {
            return;
        }
        try {
            class157.field2254.method2155(0L);
            class157.field2254.method2150(arg0.field2392, arg1, 24);
        } catch (Exception var4) {
        }
    }
}

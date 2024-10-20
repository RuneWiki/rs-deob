package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class163[] field997 = new class163[4];

    @ObfuscatedName("client.ay")
    public static boolean field1061 = true;

    @ObfuscatedName("client.bk")
    public static int field935 = 1;

    @ObfuscatedName("client.bi")
    public static int field1006 = 0;

    @ObfuscatedName("client.bn")
    public static int field1183 = 0;

    @ObfuscatedName("client.bh")
    public static boolean field1104 = false;

    @ObfuscatedName("client.bw")
    public static boolean field939 = false;

    @ObfuscatedName("client.bj")
    public static int field940 = 0;

    @ObfuscatedName("client.bd")
    public static int field942 = 0;

    @ObfuscatedName("client.bq")
    public static boolean field943 = true;

    @ObfuscatedName("client.be")
    public static int field944 = 0;

    @ObfuscatedName("client.bl")
    public static long field945 = 1L;

    @ObfuscatedName("client.bm")
    public static int field946 = -1;

    @ObfuscatedName("client.bo")
    public static int field1030 = -1;

    @ObfuscatedName("client.bf")
    public static int field948 = -1;

    @ObfuscatedName("client.bv")
    public static boolean field1051 = true;

    @ObfuscatedName("client.bx")
    public static boolean field1141 = false;

    @ObfuscatedName("client.bz")
    public static int field951 = 0;

    @ObfuscatedName("client.br")
    public static int field952 = 0;

    @ObfuscatedName("client.bs")
    public static int field953 = 0;

    @ObfuscatedName("client.cr")
    public static int field954 = 0;

    @ObfuscatedName("client.cf")
    public static int field955 = 0;

    @ObfuscatedName("client.ch")
    public static int field1198 = 0;

    @ObfuscatedName("client.cn")
    public static int field957 = 0;

    @ObfuscatedName("client.ct")
    public static int field1033 = 0;

    @ObfuscatedName("client.cm")
    public static int field1162 = 0;

    @ObfuscatedName("client.ci")
    public static class93 field960 = class93.field1425;

    @ObfuscatedName("client.cs")
    public static class93 field1118 = class93.field1425;

    @ObfuscatedName("client.cv")
    public static int field1007 = 0;

    @ObfuscatedName("client.cq")
    public static int field964 = 0;

    @ObfuscatedName("client.cx")
    public static int field1048 = 0;

    @ObfuscatedName("client.dx")
    public static int field967 = 0;

    @ObfuscatedName("client.dy")
    public static int field968 = 0;

    @ObfuscatedName("client.dv")
    public static int field969 = 0;

    @ObfuscatedName("client.dn")
    public static int field970 = 0;

    @ObfuscatedName("client.dh")
    public static int field1032 = 0;

    @ObfuscatedName("client.dd")
    public static byte[] field972 = null;

    @ObfuscatedName("client.dw")
    public static class88[] field973 = new class88[32768];

    @ObfuscatedName("client.do")
    public static int field959 = 0;

    @ObfuscatedName("client.di")
    public static int[] field1158 = new int[32768];

    @ObfuscatedName("client.df")
    public static int field1144 = 0;

    @ObfuscatedName("client.ed")
    public static int[] field1203 = new int[250];

    @ObfuscatedName("client.ej")
    public static class181 field978 = new class181(5000);

    @ObfuscatedName("client.en")
    public static class181 field979 = new class181(5000);

    @ObfuscatedName("client.ek")
    public static class181 field956 = new class181(15000);

    @ObfuscatedName("client.ec")
    public static int field981 = 0;

    @ObfuscatedName("client.el")
    public static int field1040 = 0;

    @ObfuscatedName("client.ez")
    public static int field983 = 0;

    @ObfuscatedName("client.et")
    public static int field984 = 0;

    @ObfuscatedName("client.eq")
    public static int field985 = 0;

    @ObfuscatedName("client.ey")
    public static int field986 = 0;

    @ObfuscatedName("client.eh")
    public static int field987 = 0;

    @ObfuscatedName("client.ef")
    public static int field988 = 0;

    @ObfuscatedName("client.ee")
    public static boolean field989 = false;

    @ObfuscatedName("client.er")
    public static HashMap field990 = new HashMap();

    @ObfuscatedName("client.fj")
    public static int field992 = 0;

    @ObfuscatedName("client.fv")
    public static int field993 = 1;

    @ObfuscatedName("client.fx")
    public static int field982 = 0;

    @ObfuscatedName("client.fc")
    public static int field1092 = 1;

    @ObfuscatedName("client.ft")
    public static int field996 = 0;

    @ObfuscatedName("client.fh")
    public static boolean field998 = false;

    @ObfuscatedName("client.fy")
    public static int[][][] field999 = new int[4][13][13];

    @ObfuscatedName("client.fn")
    public static final int[] field1000 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fa")
    public static int field958 = 0;

    @ObfuscatedName("client.gg")
    public static int field1003 = 2301979;

    @ObfuscatedName("client.gj")
    public static int field1004 = 5063219;

    @ObfuscatedName("client.gs")
    public static int field1005 = 3353893;

    @ObfuscatedName("client.gr")
    public static int field1180 = 7759444;

    @ObfuscatedName("client.go")
    public static boolean field1066 = false;

    @ObfuscatedName("client.ga")
    public static int field1008 = 0;

    @ObfuscatedName("client.gh")
    public static int field1069 = 128;

    @ObfuscatedName("client.gy")
    public static int field1010 = 0;

    @ObfuscatedName("client.gz")
    public static int field1031 = 0;

    @ObfuscatedName("client.gt")
    public static int field1015 = 0;

    @ObfuscatedName("client.gw")
    public static int field1013 = 0;

    @ObfuscatedName("client.gk")
    public static int field1014 = 0;

    @ObfuscatedName("client.gx")
    public static int field1200 = 50;

    @ObfuscatedName("client.hm")
    public static int field1016 = 0;

    @ObfuscatedName("client.ht")
    public static boolean field1017 = false;

    @ObfuscatedName("client.he")
    public static int field1018 = 0;

    @ObfuscatedName("client.hf")
    public static int field937 = 0;

    @ObfuscatedName("client.hq")
    public static int field1054 = 50;

    @ObfuscatedName("client.hh")
    public static int[] field1020 = new int[field1054];

    @ObfuscatedName("client.hg")
    public static int[] field1022 = new int[field1054];

    @ObfuscatedName("client.hj")
    public static int[] field1023 = new int[field1054];

    @ObfuscatedName("client.hd")
    public static int[] field1166 = new int[field1054];

    @ObfuscatedName("client.hi")
    public static int[] field1131 = new int[field1054];

    @ObfuscatedName("client.hl")
    public static int[] field1026 = new int[field1054];

    @ObfuscatedName("client.hs")
    public static int[] field1027 = new int[field1054];

    @ObfuscatedName("client.hn")
    public static String[] field1191 = new String[field1054];

    @ObfuscatedName("client.hz")
    public static int[][] field1029 = new int[104][104];

    @ObfuscatedName("client.hk")
    public static int field1072 = 0;

    @ObfuscatedName("client.hx")
    public static int field1157 = -1;

    @ObfuscatedName("client.hu")
    public static int field1163 = -1;

    @ObfuscatedName("client.hy")
    public static int field1142 = 0;

    @ObfuscatedName("client.hb")
    public static int field1034 = 0;

    @ObfuscatedName("client.hr")
    public static int field941 = 0;

    @ObfuscatedName("client.hp")
    public static int field1036 = 0;

    @ObfuscatedName("client.hw")
    public static int field1037 = 0;

    @ObfuscatedName("client.ho")
    public static int field1038 = 0;

    @ObfuscatedName("client.ir")
    public static int field1093 = 0;

    @ObfuscatedName("client.iw")
    public static int field976 = 0;

    @ObfuscatedName("client.ia")
    public static int field1074 = 0;

    @ObfuscatedName("client.io")
    public static int field1147 = 0;

    @ObfuscatedName("client.il")
    public static boolean field1043 = false;

    @ObfuscatedName("client.ip")
    public static int field1044 = 0;

    @ObfuscatedName("client.is")
    public static int field1137 = 0;

    @ObfuscatedName("client.ie")
    public static class76[] field1046 = new class76[2048];

    @ObfuscatedName("client.in")
    public static int field1019 = -1;

    @ObfuscatedName("client.iv")
    public static int field1121 = 0;

    @ObfuscatedName("client.ig")
    public static int field1049 = 0;

    @ObfuscatedName("client.id")
    public static int[] field1050 = new int[1000];

    @ObfuscatedName("client.it")
    public static String field1085 = null;

    @ObfuscatedName("client.ic")
    public static final int[] field1024 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ik")
    public static String[] field1052 = new String[8];

    @ObfuscatedName("client.ib")
    public static boolean[] field1053 = new boolean[8];

    @ObfuscatedName("client.ih")
    public static int[] field977 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.if")
    public static int field1055 = -1;

    @ObfuscatedName("client.iq")
    public static class195[][][] field1056 = new class195[4][104][104];

    @ObfuscatedName("client.im")
    public static class195 field1057 = new class195();

    @ObfuscatedName("client.ja")
    public static class195 field1058 = new class195();

    @ObfuscatedName("client.jf")
    public static class195 field1059 = new class195();

    @ObfuscatedName("client.jy")
    public static int[] field1060 = new int[25];

    @ObfuscatedName("client.jc")
    public static int[] field1138 = new int[25];

    @ObfuscatedName("client.jh")
    public static int[] field934 = new int[25];

    @ObfuscatedName("client.jk")
    public static int field1063 = 0;

    @ObfuscatedName("client.je")
    public static boolean field1064 = false;

    @ObfuscatedName("client.jt")
    public static int field1156 = 0;

    @ObfuscatedName("client.jm")
    public static int[] field1067 = new int[500];

    @ObfuscatedName("client.jl")
    public static int[] field1068 = new int[500];

    @ObfuscatedName("client.jj")
    public static int[] field1021 = new int[500];

    @ObfuscatedName("client.js")
    public static int[] field1070 = new int[500];

    @ObfuscatedName("client.jx")
    public static String[] field1071 = new String[500];

    @ObfuscatedName("client.jb")
    public static String[] field1035 = new String[500];

    @ObfuscatedName("client.ju")
    public static boolean[] field1132 = new boolean[500];

    @ObfuscatedName("client.ji")
    public static boolean field1047 = false;

    @ObfuscatedName("client.jz")
    public static boolean field1075 = false;

    @ObfuscatedName("client.jd")
    public static int field1076 = -1;

    @ObfuscatedName("client.jp")
    public static int field1077 = -1;

    @ObfuscatedName("client.kq")
    public static int field1078 = 0;

    @ObfuscatedName("client.kg")
    public static int field1062 = 50;

    @ObfuscatedName("client.kd")
    public static int field1080 = 0;

    @ObfuscatedName("client.ke")
    public static boolean field1082 = false;

    @ObfuscatedName("client.ka")
    public static int field1083 = -1;

    @ObfuscatedName("client.ks")
    public static int field1084 = -1;

    @ObfuscatedName("client.km")
    public static String field994 = null;

    @ObfuscatedName("client.kb")
    public static String field1086 = null;

    @ObfuscatedName("client.kl")
    public static int field995 = -1;

    @ObfuscatedName("client.kn")
    public static class192 field1088 = new class192(8);

    @ObfuscatedName("client.kf")
    public static int field1089 = 0;

    @ObfuscatedName("client.kh")
    public static int field1090 = 0;

    @ObfuscatedName("client.kt")
    public static class218 field1091 = null;

    @ObfuscatedName("client.kj")
    public static int field971 = 0;

    @ObfuscatedName("client.kv")
    public static int field1039 = 0;

    @ObfuscatedName("client.ko")
    public static int field1094 = 0;

    @ObfuscatedName("client.kz")
    public static int field1095 = -1;

    @ObfuscatedName("client.ky")
    public static boolean field1159 = false;

    @ObfuscatedName("client.ki")
    public static boolean field1097 = false;

    @ObfuscatedName("client.ku")
    public static boolean field1028 = false;

    @ObfuscatedName("client.kr")
    public static class218 field1099 = null;

    @ObfuscatedName("client.lb")
    public static class218 field1108 = null;

    @ObfuscatedName("client.lf")
    public static class218 field1174 = null;

    @ObfuscatedName("client.ld")
    public static int field1102 = 0;

    @ObfuscatedName("client.lr")
    public static int field1103 = 0;

    @ObfuscatedName("client.ly")
    public static class218 field1186 = null;

    @ObfuscatedName("client.lk")
    public static boolean field1105 = false;

    @ObfuscatedName("client.lt")
    public static int field1106 = -1;

    @ObfuscatedName("client.lh")
    public static int field1107 = -1;

    @ObfuscatedName("client.lo")
    public static boolean field1100 = false;

    @ObfuscatedName("client.ls")
    public static int field949 = -1;

    @ObfuscatedName("client.lu")
    public static int field1110 = -1;

    @ObfuscatedName("client.lm")
    public static boolean field1111 = false;

    @ObfuscatedName("client.le")
    public static int field1112 = 1;

    @ObfuscatedName("client.lv")
    public static int[] field1079 = new int[32];

    @ObfuscatedName("client.lq")
    public static int field962 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field1073 = new int[32];

    @ObfuscatedName("client.li")
    public static int field1116 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field1117 = new int[32];

    @ObfuscatedName("client.lx")
    public static int field1065 = 0;

    @ObfuscatedName("client.lz")
    public static int field1119 = 0;

    @ObfuscatedName("client.mo")
    public static int field1120 = 0;

    @ObfuscatedName("client.mx")
    public static int field974 = 0;

    @ObfuscatedName("client.mh")
    public static int field1122 = 0;

    @ObfuscatedName("client.mi")
    public static int field950 = 0;

    @ObfuscatedName("client.mq")
    public static int field1124 = 0;

    @ObfuscatedName("client.mz")
    public static int field1125 = 0;

    @ObfuscatedName("client.mt")
    public static class195 field965 = new class195();

    @ObfuscatedName("client.mk")
    public static class195 field1045 = new class195();

    @ObfuscatedName("client.my")
    public static class195 field1128 = new class195();

    @ObfuscatedName("client.mu")
    public static class192 field1129 = new class192(512);

    @ObfuscatedName("client.me")
    public static int field1130 = 0;

    @ObfuscatedName("client.mn")
    public static int field1081 = -2;

    @ObfuscatedName("client.mb")
    public static boolean[] field1113 = new boolean[100];

    @ObfuscatedName("client.ma")
    public static boolean[] field1133 = new boolean[100];

    @ObfuscatedName("client.ml")
    public static boolean[] field1134 = new boolean[100];

    @ObfuscatedName("client.mw")
    public static int[] field1135 = new int[100];

    @ObfuscatedName("client.mp")
    public static int[] field1136 = new int[100];

    @ObfuscatedName("client.mc")
    public static int[] field1204 = new int[100];

    @ObfuscatedName("client.ms")
    public static int[] field1165 = new int[100];

    @ObfuscatedName("client.mv")
    public static int field1139 = 0;

    @ObfuscatedName("client.mf")
    public static long field1140 = 0L;

    @ObfuscatedName("client.mj")
    public static boolean field1041 = true;

    @ObfuscatedName("client.np")
    public static int[] field1182 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nl")
    public static int field1098 = 0;

    @ObfuscatedName("client.nw")
    public static int field1192 = 0;

    @ObfuscatedName("client.nm")
    public static String field1145 = "";

    @ObfuscatedName("client.nb")
    public static long[] field1146 = new long[100];

    @ObfuscatedName("client.nk")
    public static int field1109 = 0;

    @ObfuscatedName("client.nj")
    public static int field1148 = 0;

    @ObfuscatedName("client.ny")
    public static int[] field1012 = new int[128];

    @ObfuscatedName("client.nr")
    public static int[] field961 = new int[128];

    @ObfuscatedName("client.ng")
    public static long field1151 = -1L;

    @ObfuscatedName("client.na")
    public static String field1152 = null;

    @ObfuscatedName("client.nf")
    public static String field980 = null;

    @ObfuscatedName("client.nv")
    public static int field1154 = -1;

    @ObfuscatedName("client.ni")
    public static int field1155 = 0;

    @ObfuscatedName("client.oy")
    public static int[] field936 = new int[1000];

    @ObfuscatedName("client.ou")
    public static int[] field947 = new int[1000];

    @ObfuscatedName("client.ol")
    public static class287[] field1114 = new class287[1000];

    @ObfuscatedName("client.of")
    public static int field1143 = 0;

    @ObfuscatedName("client.oc")
    public static int field1160 = 0;

    @ObfuscatedName("client.ox")
    public static int field1161 = 0;

    @ObfuscatedName("client.oa")
    public static int field1025 = 255;

    @ObfuscatedName("client.op")
    public static int field1096 = -1;

    @ObfuscatedName("client.ok")
    public static boolean field1164 = false;

    @ObfuscatedName("client.oe")
    public static int field975 = 127;

    @ObfuscatedName("client.oo")
    public static int field1149 = 127;

    @ObfuscatedName("client.od")
    public static int field1167 = 0;

    @ObfuscatedName("client.om")
    public static int[] field1168 = new int[50];

    @ObfuscatedName("client.oh")
    public static int[] field1169 = new int[50];

    @ObfuscatedName("client.ob")
    public static int[] field1170 = new int[50];

    @ObfuscatedName("client.pn")
    public static int[] field1171 = new int[50];

    @ObfuscatedName("client.pv")
    public static class107[] field938 = new class107[50];

    @ObfuscatedName("client.pi")
    public static boolean field1173 = false;

    @ObfuscatedName("client.pf")
    public static boolean[] field1001 = new boolean[5];

    @ObfuscatedName("client.pr")
    public static int[] field1175 = new int[5];

    @ObfuscatedName("client.px")
    public static int[] field1176 = new int[5];

    @ObfuscatedName("client.pz")
    public static int[] field1177 = new int[5];

    @ObfuscatedName("client.pg")
    public static int[] field1178 = new int[5];

    @ObfuscatedName("client.pk")
    public static short field1179 = 256;

    @ObfuscatedName("client.pl")
    public static short field1153 = 205;

    @ObfuscatedName("client.pw")
    public static short field1181 = 256;

    @ObfuscatedName("client.pe")
    public static short field1201 = 320;

    @ObfuscatedName("client.pb")
    public static short field1127 = 1;

    @ObfuscatedName("client.po")
    public static short field1184 = 32767;

    @ObfuscatedName("client.qr")
    public static short field1185 = 1;

    @ObfuscatedName("client.qe")
    public static short field1087 = 32767;

    @ObfuscatedName("client.ql")
    public static int field1187 = 0;

    @ObfuscatedName("client.qs")
    public static int field1188 = 0;

    @ObfuscatedName("client.qu")
    public static int field1189 = 0;

    @ObfuscatedName("client.qn")
    public static int field1190 = 0;

    @ObfuscatedName("client.qi")
    public static int field1011 = 0;

    @ObfuscatedName("client.qg")
    public static int field1172 = 0;

    @ObfuscatedName("client.qk")
    public static int field1193 = 0;

    @ObfuscatedName("client.qd")
    public static class66[] field1194 = new class66[400];

    @ObfuscatedName("client.qh")
    public static class197 field1195 = new class197();

    @ObfuscatedName("client.qq")
    public static int field1196 = 0;

    @ObfuscatedName("client.qx")
    public static class72[] field1197 = new class72[400];

    @ObfuscatedName("client.qo")
    public static class215 field1009 = new class215();

    @ObfuscatedName("client.qt")
    public static int field1199 = -1;

    @ObfuscatedName("client.qa")
    public static int field1101 = -1;

    @ObfuscatedName("client.qc")
    public static class17[] field1126 = new class17[8];

    @ObfuscatedName("client.ry")
    public static final class75 field1202 = new class75();

    @ObfuscatedName("client.rh")
    public static int[] field1150 = new int[50];

    @ObfuscatedName("client.rb")
    public static int[] field1123 = new int[50];

    @ObfuscatedName("ax.em(I)Lkg;")
    public static class290 method214() {
        return Statics.field600;
    }

    @ObfuscatedName("client.aq(B)V")
    public final void method790() {
    }

    public final void init() {
        if (!this.method789()) {
            return;
        }
        class276[] var1 = class276.method2680();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class276 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3703);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3703)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class90.field1398)) {
                        }
                        break;
                    case 2:
                        int var5 = Integer.parseInt(var4);
                        class233[] var6 = new class233[] { class233.field3181, class233.field3182, class233.field3180, class233.field3179 };
                        class233[] var7 = var6;
                        int var8 = 0;
                        class233 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class233 var9 = var7[var8];
                            if (var9.field3178 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field327 = var10;
                    case 3:
                    case 10:
                    case 11:
                    default:
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class90.field1398)) {
                            field1104 = true;
                        } else {
                            field1104 = false;
                        }
                        break;
                    case 5:
                        field1006 = Integer.parseInt(var4);
                        break;
                    case 6:
                        Statics.field822 = Integer.parseInt(var4);
                        break;
                    case 7:
                        field940 = Integer.parseInt(var4);
                        break;
                    case 8:
                        Statics.field778 = var4;
                        break;
                    case 9:
                        Statics.field1502 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field935 = Integer.parseInt(var4);
                        break;
                    case 13:
                        field1183 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field1042 = var4;
                        break;
                    case 15:
                        Statics.field506 = (class234) class170.method3644(class234.method45(), Integer.parseInt(var4));
                        if (Statics.field506 == class234.field3189) {
                            Statics.field355 = class291.field3842;
                        } else {
                            Statics.field355 = class291.field3845;
                        }
                }
            }
        }
        method1616();
        Statics.field2322 = this.getCodeBase().getHost();
        String var11 = Statics.field327.field3177;
        byte var12 = 0;
        try {
            Statics.field2248 = 17;
            Statics.field1418 = var12;
            try {
                Statics.field2416 = System.getProperty("os.name");
            } catch (Exception var57) {
                Statics.field2416 = "Unknown";
            }
            Statics.field278 = Statics.field2416.toLowerCase();
            try {
                Statics.field448 = System.getProperty("user.home");
                if (Statics.field448 != null) {
                    Statics.field448 = Statics.field448 + "/";
                }
            } catch (Exception var56) {
            }
            try {
                if (Statics.field278.startsWith("win")) {
                    if (Statics.field448 == null) {
                        Statics.field448 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field448 == null) {
                    Statics.field448 = System.getenv("HOME");
                }
                if (Statics.field448 != null) {
                    Statics.field448 = Statics.field448 + "/";
                }
            } catch (Exception var55) {
            }
            if (Statics.field448 == null) {
                Statics.field448 = "~/";
            }
            Statics.field2255 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field448, "/tmp/", "" };
            Statics.field2256 = new String[] { ".jagex_cache_" + Statics.field1418, ".file_store_" + Statics.field1418 };
            int var16 = 0;
            label277: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field2257 = new File(Statics.field448, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field2257.exists()) {
                    try {
                        class126 var21 = new class126(Statics.field2257, "rw", 10000L);
                        class175 var22 = new class175((int) var21.method2177());
                        while (var22.field2394 < var22.field2390.length) {
                            int var23 = var21.method2162(var22.field2390, var22.field2394, var22.field2390.length - var22.field2394);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field2394 += var23;
                        }
                        var22.field2394 = 0;
                        int var24 = var22.method2903();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method2903();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method2976();
                            if (var25 == 1) {
                                var19 = var22.method2976();
                            }
                        } else {
                            var18 = var22.method2913();
                            if (var25 == 1) {
                                var19 = var22.method2913();
                            }
                        }
                        var21.method2161();
                    } catch (IOException var60) {
                        var60.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class157.method702(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label252: for (int var29 = 0; var29 < Statics.field2256.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field2255.length; var30++) {
                            File var31 = new File(Statics.field2255[var30] + Statics.field2256[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class157.method702(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label252;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field448 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
                    var20 = true;
                }
                if (var19 != null) {
                    File var32 = new File(var19);
                    File var33 = new File(var18);
                    try {
                        File[] var34 = var32.listFiles();
                        File[] var35 = var34;
                        for (int var36 = 0; var36 < var35.length; var36++) {
                            File var37 = var35[var36];
                            File var38 = new File(var33, var37.getName());
                            boolean var39 = var37.renameTo(var38);
                            if (!var39) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var59) {
                        var59.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    class157.method67(new File(var18), (File) null);
                }
                File var41 = new File(var18);
                Statics.field2246 = var41;
                if (!Statics.field2246.exists()) {
                    Statics.field2246.mkdirs();
                }
                File[] var42 = Statics.field2246.listFiles();
                if (var42 == null) {
                    break;
                }
                File[] var43 = var42;
                int var44 = 0;
                while (true) {
                    if (var44 >= var43.length) {
                        break label277;
                    }
                    File var45 = var43[var44];
                    if (!class157.method702(var45, false)) {
                        var16++;
                        break;
                    }
                    var44++;
                }
            }
            class159.method2667(Statics.field2246);
            try {
                File var46 = new File(Statics.field448, "random.dat");
                if (var46.exists()) {
                    class157.field2250 = new class125(new class126(var46, "rw", 25L), 24, 0);
                } else {
                    label207: for (int var47 = 0; var47 < Statics.field2256.length; var47++) {
                        for (int var48 = 0; var48 < Statics.field2255.length; var48++) {
                            File var49 = new File(Statics.field2255[var48] + Statics.field2256[var47] + File.separatorChar + "random.dat");
                            if (var49.exists()) {
                                class157.field2250 = new class125(new class126(var49, "rw", 25L), 24, 0);
                                break label207;
                            }
                        }
                    }
                }
                if (class157.field2250 == null) {
                    RandomAccessFile var50 = new RandomAccessFile(var46, "rw");
                    int var51 = var50.read();
                    var50.seek(0L);
                    var50.write(var51);
                    var50.seek(0L);
                    var50.close();
                    class157.field2250 = new class125(new class126(var46, "rw", 25L), 24, 0);
                }
            } catch (IOException var58) {
            }
            class157.field2258 = new class125(new class126(class159.method256("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class157.field2254 = new class125(new class126(class159.method256("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2430 = new class125[Statics.field2248];
            for (int var53 = 0; var53 < Statics.field2248; var53++) {
                Statics.field2430[var53] = new class125(new class126(class159.method256("main_file_cache.idx" + var53), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var61) {
            Statics.method1698((String) null, var61);
        }
        Statics.field408 = this;
        this.method787(765, 503, 153);
    }

    @ObfuscatedName("cx.eu(I)V")
    public static final void method1616() {
        class141.field2121 = false;
        field939 = false;
    }

    @ObfuscatedName("client.as(I)V")
    public final void method799() {
        Statics.field3742 = field1183 == 0 ? 43594 : field935 + 40000;
        Statics.field378 = field1183 == 0 ? 443 : field935 + 50000;
        Statics.field844 = Statics.field3742;
        Statics.field2620 = class216.field2629;
        Statics.field2617 = class216.field2634;
        Statics.field2622 = class216.field2631;
        Statics.field2614 = class216.field2632;
        Statics.field265 = new class70();
        this.method817();
        this.method892();
        Statics.field3198 = this.method794();
        Statics.field930 = new class162(255, class157.field2258, class157.field2254, 500000);
        class126 var1 = null;
        class82 var2 = new class82();
        try {
            var1 = class157.method53("", Statics.field506.field3184, false);
            byte[] var3 = new byte[(int) var1.method2177()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2162(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class82(new class175(var3));
        } catch (Exception var13) {
        }
        try {
            if (var1 != null) {
                var1.method2161();
            }
        } catch (Exception var12) {
        }
        Statics.field22 = var2;
        this.method803();
        String var10 = Statics.field779;
        class57.field679 = this;
        class57.field687 = var10;
        if (field1183 != 0) {
            field1141 = true;
        }
        int var11 = Statics.field22.field1311;
        field1140 = 0L;
        if (var11 >= 2) {
            field1041 = true;
        } else {
            field1041 = false;
        }
        if (method66() == 1) {
            Statics.field408.method777(765, 503);
        } else {
            Statics.field408.method777(7680, 2160);
        }
        if (field942 >= 25) {
            method1558();
        }
    }

    @ObfuscatedName("client.af(I)V")
    public final void method800() {
        field944++;
        this.method1320();
        class238.method3757();
        class205.method2816();
        method3176();
        class51.method3762();
        class60.method132();
        if (Statics.field3198 != null) {
            int var1 = Statics.field3198.method663();
            field1125 = var1;
        }
        if (field942 == 0) {
            method183();
            Statics.field700.method2686();
            for (int var2 = 0; var2 < 32; var2++) {
                field701[var2] = 0L;
            }
            for (int var3 = 0; var3 < 32; var3++) {
                field702[var3] = 0L;
            }
            Statics.field696 = 0;
        } else if (field942 == 5) {
            class94.method1443(this);
            method183();
            Statics.field700.method2686();
            for (int var4 = 0; var4 < 32; var4++) {
                field701[var4] = 0L;
            }
            for (int var5 = 0; var5 < 32; var5++) {
                field702[var5] = 0L;
            }
            Statics.field696 = 0;
        } else if (field942 == 10 || field942 == 11) {
            class94.method1443(this);
        } else if (field942 == 20) {
            class94.method1443(this);
            this.method1104();
        } else if (field942 == 25) {
            method4114();
        }
        if (field942 == 30) {
            this.method1174();
        } else if (field942 == 40 || field942 == 45) {
            this.method1104();
        }
    }

    @ObfuscatedName("client.au(ZI)V")
    public final void method801(boolean arg0) {
        boolean var2;
        label152: {
            try {
                if (class205.field2508 == 2) {
                    if (Statics.field2507 == null) {
                        Statics.field2507 = class211.method3595(Statics.field2503, Statics.field2206, Statics.field2223);
                        if (Statics.field2507 == null) {
                            var2 = false;
                            break label152;
                        }
                    }
                    if (Statics.field2510 == null) {
                        Statics.field2510 = new class114(Statics.field2501, Statics.field2500);
                    }
                    if (Statics.field2502.method3407(Statics.field2507, Statics.field2504, Statics.field2510, 22050)) {
                        Statics.field2502.method3408();
                        Statics.field2502.method3406(Statics.field2505);
                        Statics.field2502.method3433(Statics.field2507, Statics.field1533);
                        class205.field2508 = 0;
                        Statics.field2507 = null;
                        Statics.field2510 = null;
                        Statics.field2503 = null;
                        var2 = true;
                        break label152;
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                Statics.field2502.method3460();
                class205.field2508 = 0;
                Statics.field2507 = null;
                Statics.field2510 = null;
                Statics.field2503 = null;
            }
            var2 = false;
        }
        if (var2 && field1164 && Statics.field1357 != null) {
            Statics.field1357.method1872();
        }
        if ((field942 == 10 || field942 == 20 || field942 == 30) && field1140 != 0L && class177.method1067() > field1140) {
            int var5 = method66();
            field1140 = 0L;
            if (var5 >= 2) {
                field1041 = true;
            } else {
                field1041 = false;
            }
            if (method66() == 1) {
                Statics.field408.method777(765, 503);
            } else {
                Statics.field408.method777(7680, 2160);
            }
            if (field942 >= 25) {
                method1558();
            }
        }
        if (arg0) {
            for (int var6 = 0; var6 < 100; var6++) {
                field1113[var6] = true;
            }
        }
        if (field942 == 0) {
            this.method795(class94.field1450, class94.field1451, arg0);
        } else if (field942 == 5) {
            class94.method3593(Statics.field766, Statics.field2007, Statics.field502, arg0);
        } else if (field942 == 10 || field942 == 11) {
            class94.method3593(Statics.field766, Statics.field2007, Statics.field502, arg0);
        } else if (field942 == 20) {
            class94.method3593(Statics.field766, Statics.field2007, Statics.field502, arg0);
        } else if (field942 == 25) {
            if (field996 == 1) {
                if (field992 > field993) {
                    field993 = field992;
                }
                int var7 = (field993 * 50 - field992 * 50) / field993;
                method1566(class227.field2861 + class90.field1403 + class90.field1399 + var7 + "%" + class90.field1400, false);
            } else if (field996 == 2) {
                if (field982 > field1092) {
                    field1092 = field982;
                }
                int var8 = (field1092 * 50 - field982 * 50) / field1092 + 50;
                method1566(class227.field2861 + class90.field1403 + class90.field1399 + var8 + "%" + class90.field1400, false);
            } else {
                method1566(class227.field2861, false);
            }
        } else if (field942 == 30) {
            this.method1107();
        } else if (field942 == 40) {
            method1566(class227.field2862 + class90.field1403 + class227.field2863, false);
        } else if (field942 == 45) {
            method1566(class227.field3009, false);
        }
        if (field942 == 30 && field1139 == 0 && !arg0 && !field1041) {
            for (int var9 = 0; var9 < field1130; var9++) {
                if (field1133[var9]) {
                    Statics.field2287.method759(field1135[var9], field1136[var9], field1204[var9], field1165[var9]);
                    field1133[var9] = false;
                }
            }
        } else if (field942 > 0) {
            Statics.field2287.method761(0, 0);
            for (int var10 = 0; var10 < field1130; var10++) {
                field1133[var10] = false;
            }
        }
    }

    @ObfuscatedName("client.az(I)V")
    public final void method782() {
        if (Statics.field2260.method1671()) {
            Statics.field2260.method1668();
        }
        if (Statics.field1358 != null) {
            Statics.field1358.field878 = false;
        }
        Statics.field1358 = null;
        if (Statics.field2012 != null) {
            Statics.field2012.method2745();
            Statics.field2012 = null;
        }
        class51.method202();
        class60.method718();
        Statics.field3198 = null;
        if (Statics.field1357 != null) {
            Statics.field1357.method1873();
        }
        if (Statics.field447 != null) {
            Statics.field447.method1873();
        }
        class240.method2476();
        class238.method3748();
        if (Statics.field265 != null) {
            Statics.field265.method1039();
            Statics.field265 = null;
        }
        class157.method1449();
    }

    @ObfuscatedName("client.eg(I)V")
    public void method1320() {
        if (field942 == 1000) {
            return;
        }
        long var1 = class177.method1067();
        int var3 = (int) (var1 - Statics.field3253);
        Statics.field3253 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class240.field3238 += var3;
        boolean var4;
        if (class240.field3248 == 0 && class240.field3243 == 0 && class240.field3246 == 0 && class240.field3241 == 0) {
            var4 = true;
        } else if (Statics.field3247 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class240.field3238 > 30000) {
                        throw new IOException();
                    }
                    while (class240.field3243 < 20 && class240.field3241 > 0) {
                        class236 var5 = (class236) class240.field3251.method3276();
                        class175 var6 = new class175(4);
                        var6.method2888(1);
                        var6.method3053((int) var5.field2469);
                        Statics.field3247.method2749(var6.field2390, 0, 4);
                        class240.field3242.method3274(var5, var5.field2469);
                        class240.field3241--;
                        class240.field3243++;
                    }
                    while (class240.field3248 < 20 && class240.field3246 > 0) {
                        class236 var7 = (class236) class240.field3244.method3223();
                        class175 var8 = new class175(4);
                        var8.method2888(0);
                        var8.method3053((int) var7.field2469);
                        Statics.field3247.method2749(var8.field2390, 0, 4);
                        var7.method3350();
                        class240.field3254.method3274(var7, var7.field2469);
                        class240.field3246--;
                        class240.field3248++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3247.method2747();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class240.field3238 = 0;
                        byte var11 = 0;
                        if (Statics.field3245 == null) {
                            var11 = 8;
                        } else if (class240.field3252 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class240.field3239.field2394;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3247.method2748(class240.field3239.field2390, class240.field3239.field2394, var12);
                            if (class240.field3255 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class240.field3239.field2390[class240.field3239.field2394 + var13] ^= class240.field3255;
                                }
                            }
                            class240.field3239.field2394 += var12;
                            if (class240.field3239.field2394 < var11) {
                                break;
                            }
                            if (Statics.field3245 == null) {
                                class240.field3239.field2394 = 0;
                                int var14 = class240.field3239.method2903();
                                int var15 = class240.field3239.method3023();
                                int var16 = class240.field3239.method2903();
                                int var17 = class240.field3239.method2908();
                                long var18 = (long) ((var14 << 16) + var15);
                                class236 var20 = (class236) class240.field3242.method3281(var18);
                                Statics.field3249 = true;
                                if (var20 == null) {
                                    var20 = (class236) class240.field3254.method3281(var18);
                                    Statics.field3249 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3245 = var20;
                                Statics.field556 = new class175(var17 + var21 + Statics.field3245.field3201);
                                Statics.field556.method2888(var16);
                                Statics.field556.method2891(var17);
                                class240.field3252 = 8;
                                class240.field3239.field2394 = 0;
                            } else if (class240.field3252 == 0) {
                                if (class240.field3239.field2390[0] == -1) {
                                    class240.field3252 = 1;
                                    class240.field3239.field2394 = 0;
                                } else {
                                    Statics.field3245 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field556.field2390.length - Statics.field3245.field3201;
                            int var23 = 512 - class240.field3252;
                            if (var23 > var22 - Statics.field556.field2394) {
                                var23 = var22 - Statics.field556.field2394;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3247.method2748(Statics.field556.field2390, Statics.field556.field2394, var23);
                            if (class240.field3255 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field556.field2390[Statics.field556.field2394 + var24] ^= class240.field3255;
                                }
                            }
                            Statics.field556.field2394 += var23;
                            class240.field3252 += var23;
                            if (Statics.field556.field2394 == var22) {
                                if (Statics.field3245.field2469 == 16711935L) {
                                    Statics.field1680 = Statics.field556;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class239 var26 = class240.field3237[var25];
                                        if (var26 != null) {
                                            Statics.field1680.field2394 = var25 * 8 + 5;
                                            int var27 = Statics.field1680.method2908();
                                            int var28 = Statics.field1680.method2908();
                                            var26.method3885(var27, var28);
                                        }
                                    }
                                } else {
                                    class240.field3250.reset();
                                    class240.field3250.update(Statics.field556.field2390, 0, var22);
                                    int var29 = (int) class240.field3250.getValue();
                                    if (Statics.field3245.field3199 != var29) {
                                        try {
                                            Statics.field3247.method2745();
                                        } catch (Exception var35) {
                                        }
                                        class240.field3256++;
                                        Statics.field3247 = null;
                                        class240.field3255 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class240.field3256 = 0;
                                    class240.field3257 = 0;
                                    Statics.field3245.field3200.method3887((int) (Statics.field3245.field2469 & 0xFFFFL), Statics.field556.field2390, (Statics.field3245.field2469 & 0xFF0000L) == 16711680L, Statics.field3249);
                                }
                                Statics.field3245.method3314();
                                if (Statics.field3249) {
                                    class240.field3243--;
                                } else {
                                    class240.field3248--;
                                }
                                class240.field3252 = 0;
                                Statics.field3245 = null;
                                Statics.field556 = null;
                            } else {
                                if (class240.field3252 != 512) {
                                    break;
                                }
                                class240.field3252 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3247.method2745();
                } catch (Exception var34) {
                }
                class240.field3257++;
                Statics.field3247 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1102();
        }
    }

    @ObfuscatedName("client.ea(B)V")
    public void method1102() {
        if (class240.field3256 >= 4) {
            this.method866("js5crc");
            field942 = 1000;
            return;
        }
        if (class240.field3257 >= 4) {
            if (field942 <= 5) {
                this.method866("js5io");
                field942 = 1000;
                return;
            }
            field1048 = 3000;
            class240.field3257 = 3;
        }
        if (--field1048 + 1 > 0) {
            return;
        }
        try {
            if (field964 == 0) {
                Statics.field963 = Statics.field722.method2706(Statics.field2322, Statics.field844);
                field964++;
            }
            if (field964 == 1) {
                if (Statics.field963.field2231 == 2) {
                    this.method1285(-1);
                    return;
                }
                if (Statics.field963.field2231 == 1) {
                    field964++;
                }
            }
            if (field964 == 2) {
                Statics.field3617 = new class161((Socket) Statics.field963.field2235, Statics.field722);
                class175 var1 = new class175(5);
                var1.method2888(15);
                var1.method2891(153);
                Statics.field3617.method2749(var1.field2390, 0, 5);
                field964++;
                Statics.field353 = class177.method1067();
            }
            if (field964 == 3) {
                if (field942 <= 5 || Statics.field3617.method2747() > 0) {
                    int var2 = Statics.field3617.method2760();
                    if (var2 != 0) {
                        this.method1285(var2);
                        return;
                    }
                    field964++;
                } else if (class177.method1067() - Statics.field353 > 30000L) {
                    this.method1285(-2);
                    return;
                }
            }
            if (field964 == 4) {
                class161 var3 = Statics.field3617;
                boolean var4 = field942 > 20;
                if (Statics.field3247 != null) {
                    try {
                        Statics.field3247.method2745();
                    } catch (Exception var14) {
                    }
                    Statics.field3247 = null;
                }
                Statics.field3247 = var3;
                class240.method564(var4);
                class240.field3239.field2394 = 0;
                Statics.field3245 = null;
                Statics.field556 = null;
                class240.field3252 = 0;
                while (true) {
                    class236 var6 = (class236) class240.field3242.method3276();
                    if (var6 == null) {
                        while (true) {
                            class236 var7 = (class236) class240.field3254.method3276();
                            if (var7 == null) {
                                if (class240.field3255 != 0) {
                                    try {
                                        class175 var8 = new class175(4);
                                        var8.method2888(4);
                                        var8.method2888(class240.field3255);
                                        var8.method3030(0);
                                        Statics.field3247.method2749(var8.field2390, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3247.method2745();
                                        } catch (Exception var12) {
                                        }
                                        class240.field3257++;
                                        Statics.field3247 = null;
                                    }
                                }
                                class240.field3238 = 0;
                                Statics.field3253 = class177.method1067();
                                Statics.field963 = null;
                                Statics.field3617 = null;
                                field964 = 0;
                                field967 = 0;
                                return;
                            }
                            class240.field3244.method3225(var7);
                            class240.field3240.method3274(var7, var7.field2469);
                            class240.field3246++;
                            class240.field3248--;
                        }
                    }
                    class240.field3251.method3274(var6, var6.field2469);
                    class240.field3241++;
                    class240.field3243--;
                }
            }
        } catch (IOException var15) {
            this.method1285(-3);
        }
    }

    @ObfuscatedName("client.ep(IS)V")
    public void method1285(int arg0) {
        Statics.field963 = null;
        Statics.field3617 = null;
        field964 = 0;
        if (Statics.field844 == Statics.field3742) {
            Statics.field844 = Statics.field378;
        } else {
            Statics.field844 = Statics.field3742;
        }
        field967++;
        if (field967 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field942 <= 5) {
                this.method866("js5connect_full");
                field942 = 1000;
            } else {
                field1048 = 3000;
            }
        } else if (field967 >= 2 && arg0 == 6) {
            this.method866("js5connect_outofdate");
            field942 = 1000;
        } else if (field967 >= 4) {
            if (field942 <= 5) {
                this.method866("js5connect");
                field942 = 1000;
            } else {
                field1048 = 3000;
            }
        }
    }

    @ObfuscatedName("n.ff(I)V")
    public static void method183() {
        if (field1007 == 0) {
            Statics.field512 = new class141(4, 104, 104, class62.field763);
            for (int var0 = 0; var0 < 4; var0++) {
                field997[var0] = new class163(104, 104);
            }
            Statics.field3532 = new class287(512, 512);
            class94.field1451 = class227.field2864;
            class94.field1450 = 5;
            field1007 = 20;
        } else if (field1007 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class138.field2041[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class141.method2514(var1, 500, 800, 512, 334);
            class94.field1451 = class227.field2865;
            class94.field1450 = 10;
            field1007 = 30;
        } else if (field1007 == 30) {
            Statics.field483 = method3592(0, false, true, true);
            Statics.field788 = method3592(1, false, true, true);
            Statics.field422 = method3592(2, true, false, true);
            Statics.field1338 = method3592(3, false, true, true);
            Statics.field966 = method3592(4, false, true, true);
            Statics.field288 = method3592(5, true, true, true);
            Statics.field3387 = method3592(6, true, true, false);
            Statics.field604 = method3592(7, false, true, true);
            Statics.field2410 = method3592(8, false, true, true);
            Statics.field1925 = method3592(9, false, true, true);
            Statics.field745 = method3592(10, false, true, true);
            Statics.field2366 = method3592(11, false, true, true);
            Statics.field2056 = method3592(12, false, true, true);
            Statics.field3618 = method3592(13, true, false, true);
            Statics.field3399 = method3592(14, false, true, false);
            Statics.field2607 = method3592(15, false, true, true);
            Statics.field2006 = method3592(16, false, true, false);
            class94.field1451 = class227.field2866;
            class94.field1450 = 20;
            field1007 = 40;
        } else if (field1007 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field483.method3898() * 4 / 100;
            int var8 = var7 + Statics.field788.method3898() * 4 / 100;
            int var9 = var8 + Statics.field422.method3898() * 2 / 100;
            int var10 = var9 + Statics.field1338.method3898() * 2 / 100;
            int var11 = var10 + Statics.field966.method3898() * 6 / 100;
            int var12 = var11 + Statics.field288.method3898() * 4 / 100;
            int var13 = var12 + Statics.field3387.method3898() * 2 / 100;
            int var14 = var13 + Statics.field604.method3898() * 58 / 100;
            int var15 = var14 + Statics.field2410.method3898() * 2 / 100;
            int var16 = var15 + Statics.field1925.method3898() * 2 / 100;
            int var17 = var16 + Statics.field745.method3898() * 2 / 100;
            int var18 = var17 + Statics.field2366.method3898() * 2 / 100;
            int var19 = var18 + Statics.field2056.method3898() * 2 / 100;
            int var20 = var19 + Statics.field3618.method3898() * 2 / 100;
            int var21 = var20 + Statics.field3399.method3898() * 2 / 100;
            int var22 = var21 + Statics.field2607.method3898() * 2 / 100;
            int var23 = var22 + Statics.field2006.method3898() * 2 / 100;
            if (var23 == 100) {
                class94.field1451 = class227.field2868;
                class94.field1450 = 30;
                field1007 = 45;
            } else {
                if (var23 != 0) {
                    class94.field1451 = class227.field2867 + var23 + "%";
                }
                class94.field1450 = 30;
            }
        } else if (field1007 == 45) {
            class111.method553(22050, !field939, 2);
            class206 var24 = new class206();
            var24.method3413(9, 128);
            Statics.field1357 = class111.method697(Statics.field722, 0, 22050);
            Statics.field1357.method1869(var24);
            class205.method1487(Statics.field2607, Statics.field3399, Statics.field966, var24);
            Statics.field447 = class111.method697(Statics.field722, 1, 2048);
            Statics.field680 = new class104();
            Statics.field447.method1869(Statics.field680);
            Statics.field263 = new class118(22050, Statics.field1652);
            class94.field1451 = class227.field2869;
            class94.field1450 = 35;
            field1007 = 50;
            Statics.field2053 = new class264(Statics.field2410, Statics.field3618);
        } else if (field1007 == 50) {
            class263[] var25 = new class263[] { class263.field3613, class263.field3612, class263.field3614, class263.field3611, class263.field3615, class263.field3610 };
            int var26 = var25.length;
            class264 var27 = Statics.field2053;
            class263[] var28 = new class263[] { class263.field3613, class263.field3612, class263.field3614, class263.field3611, class263.field3615, class263.field3610 };
            field990 = var27.method4401(var28);
            if (field990.size() < var26) {
                class94.field1451 = class227.field3011 + field990.size() * 100 / var26 + "%";
                class94.field1450 = 40;
            } else {
                Statics.field2007 = (class265) field990.get(class263.field3613);
                Statics.field502 = (class265) field990.get(class263.field3610);
                Statics.field766 = (class265) field990.get(class263.field3611);
                Statics.field1565 = new class293(true);
                class94.field1451 = class227.field2871;
                class94.field1450 = 40;
                field1007 = 60;
            }
        } else if (field1007 == 60) {
            int var29 = class94.method15(Statics.field745, Statics.field2410);
            int var30 = class94.method602();
            if (var29 < var30) {
                class94.field1451 = class227.field2970 + var29 * 100 / var30 + "%";
                class94.field1450 = 50;
            } else {
                class94.field1451 = class227.field2873;
                class94.field1450 = 50;
                Statics.method953(5);
                field1007 = 70;
            }
        } else if (field1007 == 70) {
            if (Statics.field422.method3777()) {
                class239 var31 = Statics.field422;
                Statics.field3365 = var31;
                class248.method466(Statics.field422);
                class239 var32 = Statics.field422;
                class239 var33 = Statics.field604;
                Statics.field3335 = var32;
                Statics.field3342 = var33;
                Statics.field3338 = Statics.field3335.method3784(3);
                class239 var34 = Statics.field422;
                class239 var35 = Statics.field604;
                boolean var36 = field939;
                Statics.field3427 = var34;
                Statics.field3428 = var35;
                class257.field3452 = var36;
                class239 var37 = Statics.field422;
                class239 var38 = Statics.field604;
                Statics.field2259 = var37;
                Statics.field3566 = var38;
                class254.method245(Statics.field422);
                class258.method4005(Statics.field422, Statics.field604, field1104, Statics.field2007);
                class239 var39 = Statics.field422;
                class239 var40 = Statics.field483;
                class239 var41 = Statics.field788;
                Statics.field3590 = var39;
                Statics.field331 = var40;
                Statics.field3597 = var41;
                class239 var42 = Statics.field422;
                class239 var43 = Statics.field604;
                Statics.field3313 = var42;
                Statics.field3312 = var43;
                class239 var44 = Statics.field422;
                Statics.field3371 = var44;
                class243.method69(Statics.field422);
                class218.method2206(Statics.field1338, Statics.field604, Statics.field2410, Statics.field3618);
                class242.method240(Statics.field422);
                class255.method2684(Statics.field422);
                class245.method1571(Statics.field422);
                class246.method220(Statics.field422);
                class239 var45 = Statics.field422;
                Statics.field3376 = var45;
                Statics.field2260 = new class99();
                class256.method3123(Statics.field422, Statics.field2410, Statics.field3618);
                class239 var46 = Statics.field422;
                class239 var47 = Statics.field2410;
                Statics.field3350 = var46;
                Statics.field3360 = var47;
                class239 var48 = Statics.field422;
                class239 var49 = Statics.field2410;
                Statics.field3289 = var49;
                if (var48.method3777()) {
                    Statics.field3278 = var48.method3784(35);
                    Statics.field3285 = new class244[Statics.field3278];
                    for (int var50 = 0; var50 < Statics.field3278; var50++) {
                        byte[] var51 = var48.method3773(35, var50);
                        if (var51 != null) {
                            Statics.field3285[var50] = new class244(var50);
                            Statics.field3285[var50].method3950(new class175(var51));
                            Statics.field3285[var50].method3956();
                        }
                    }
                }
                class94.field1451 = class227.field2875;
                class94.field1450 = 60;
                field1007 = 80;
            } else {
                class94.field1451 = class227.field2900 + Statics.field422.method3884() + "%";
                class94.field1450 = 60;
            }
        } else if (field1007 == 80) {
            int var52 = 0;
            if (Statics.field667 == null) {
                Statics.field667 = class288.method3890(Statics.field2410, "compass", "");
            } else {
                var52++;
            }
            if (Statics.field2128 == null) {
                Statics.field2128 = class288.method3890(Statics.field2410, "mapedge", "");
            } else {
                var52++;
            }
            if (Statics.field1002 == null) {
                Statics.field1002 = class288.method186(Statics.field2410, "mapscene", "");
            } else {
                var52++;
            }
            if (Statics.field668 == null) {
                Statics.field668 = class288.method722(Statics.field2410, "headicons_pk", "");
            } else {
                var52++;
            }
            if (Statics.field402 == null) {
                Statics.field402 = class288.method722(Statics.field2410, "headicons_prayer", "");
            } else {
                var52++;
            }
            if (Statics.field281 == null) {
                Statics.field281 = class288.method722(Statics.field2410, "headicons_hint", "");
            } else {
                var52++;
            }
            if (Statics.field250 == null) {
                Statics.field250 = class288.method722(Statics.field2410, "mapmarker", "");
            } else {
                var52++;
            }
            if (Statics.field2321 == null) {
                Statics.field2321 = class288.method722(Statics.field2410, "cross", "");
            } else {
                var52++;
            }
            if (Statics.field756 == null) {
                Statics.field756 = class288.method722(Statics.field2410, "mapdots", "");
            } else {
                var52++;
            }
            if (Statics.field754 == null) {
                Statics.field754 = class288.method186(Statics.field2410, "scrollbar", "");
            } else {
                var52++;
            }
            if (Statics.field30 == null) {
                Statics.field30 = class288.method186(Statics.field2410, "mod_icons", "");
            } else {
                var52++;
            }
            if (var52 < 11) {
                class94.field1451 = class227.field2876 + var52 * 100 / 12 + "%";
                class94.field1450 = 70;
            } else {
                Statics.field3635 = Statics.field30;
                Statics.field2128.method4706();
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1002[0].method4701(var53 + var56, var54 + var56, var55 + var56);
                class94.field1451 = class227.field2878;
                class94.field1450 = 70;
                field1007 = 90;
            }
        } else if (field1007 == 90) {
            if (Statics.field1925.method3777()) {
                class127 var57 = new class127(Statics.field1925, Statics.field2410, 20, 0.8D, field939 ? 64 : 128);
                class138.method2473(var57);
                class138.method2442(0.8D);
                class94.field1451 = class227.field2879;
                class94.field1450 = 90;
                field1007 = 110;
            } else {
                class94.field1451 = class227.field2870 + Statics.field1925.method3884() + "%";
                class94.field1450 = 90;
            }
        } else if (field1007 == 110) {
            Statics.field1358 = new class73();
            Statics.field722.method2704(Statics.field1358, 10);
            class94.field1451 = class227.field2880;
            class94.field1450 = 94;
            field1007 = 120;
        } else if (field1007 == 120) {
            if (Statics.field745.method3793("huffman", "")) {
                class167 var58 = new class167(Statics.field745.method3866("huffman", ""));
                class267.method2475(var58);
                class94.field1451 = class227.field2882;
                class94.field1450 = 96;
                field1007 = 130;
            } else {
                class94.field1451 = class227.field2881 + "%";
                class94.field1450 = 96;
            }
        } else if (field1007 == 130) {
            if (!Statics.field1338.method3777()) {
                class94.field1451 = class227.field2924 + Statics.field1338.method3884() * 4 / 5 + "%";
                class94.field1450 = 100;
            } else if (!Statics.field2056.method3777()) {
                class94.field1451 = class227.field2924 + (80 + Statics.field2056.method3884() / 6) + "%";
                class94.field1450 = 100;
            } else if (Statics.field3618.method3777()) {
                class94.field1451 = class227.field2884;
                class94.field1450 = 98;
                field1007 = 140;
            } else {
                class94.field1451 = class227.field2924 + (96 + Statics.field3618.method3884() / 50) + "%";
                class94.field1450 = 100;
            }
        } else if (field1007 == 140) {
            if (Statics.field2006.method3794(class41.field560.field552)) {
                if (Statics.field600 == null) {
                    Statics.field600 = new class290();
                    Statics.field600.method4903(Statics.field2006, Statics.field766, field990, Statics.field1002);
                }
                int var59 = Statics.field600.method4851();
                if (var59 < 100) {
                    class94.field1451 = class227.field2885 + (var59 * 9 / 10 + 10) + "%";
                } else {
                    class94.field1451 = class227.field2886;
                    class94.field1450 = 100;
                    field1007 = 150;
                }
            } else {
                class94.field1451 = class227.field2885 + Statics.field2006.method3796(class41.field560.field552) / 10 + "%";
            }
        } else if (field1007 == 150) {
            Statics.method953(10);
        }
    }

    @ObfuscatedName("ht.fz(IZZZI)Lil;")
    public static class239 method3592(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class162 var4 = null;
        if (class157.field2258 != null) {
            var4 = new class162(arg0, class157.field2258, Statics.field2430[arg0], 1000000);
        }
        return new class239(var4, Statics.field930, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fr(S)V")
    public final void method1104() {
        try {
            if (field968 == 0) {
                if (Statics.field2012 != null) {
                    Statics.field2012.method2745();
                    Statics.field2012 = null;
                }
                Statics.field2131 = null;
                field989 = false;
                field969 = 0;
                field968 = 1;
            }
            if (field968 == 1) {
                if (Statics.field2131 == null) {
                    Statics.field2131 = Statics.field722.method2706(Statics.field2322, Statics.field844);
                }
                if (Statics.field2131.field2231 == 2) {
                    throw new IOException();
                }
                if (Statics.field2131.field2231 == 1) {
                    Statics.field2012 = new class161((Socket) Statics.field2131.field2235, Statics.field722);
                    Statics.field2131 = null;
                    field968 = 2;
                }
            }
            if (field968 == 2) {
                field978.field2394 = 0;
                field978.method2888(14);
                Statics.field2012.method2749(field978.field2390, 0, 1);
                field956.field2394 = 0;
                field968 = 3;
            }
            if (field968 == 3) {
                if (Statics.field1357 != null) {
                    Statics.field1357.method1871();
                }
                if (Statics.field447 != null) {
                    Statics.field447.method1871();
                }
                int var1 = Statics.field2012.method2760();
                if (Statics.field1357 != null) {
                    Statics.field1357.method1871();
                }
                if (Statics.field447 != null) {
                    Statics.field447.method1871();
                }
                if (var1 != 0) {
                    method145(var1);
                    return;
                }
                field956.field2394 = 0;
                field968 = 4;
            }
            if (field968 == 4) {
                if (field956.field2394 < 8) {
                    int var2 = Statics.field2012.method2747();
                    if (var2 > 8 - field956.field2394) {
                        var2 = 8 - field956.field2394;
                    }
                    if (var2 > 0) {
                        Statics.field2012.method2748(field956.field2390, field956.field2394, var2);
                        field956.field2394 += var2;
                    }
                }
                if (field956.field2394 == 8) {
                    field956.field2394 = 0;
                    Statics.field346 = field956.method2973();
                    field968 = 5;
                }
            }
            if (field968 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field346 >> 32), (int) (Statics.field346 & 0xFFFFFFFFFFFFFFFFL) };
                field978.field2394 = 0;
                field978.method2888(1);
                field978.method2888(class94.field1444.method9());
                field978.method2891(var3[0]);
                field978.method2891(var3[1]);
                field978.method2891(var3[2]);
                field978.method2891(var3[3]);
                switch(class94.field1444.field2201) {
                    case 0:
                    case 3:
                        field978.method3053(Statics.field3730);
                        field978.field2394 += 5;
                        break;
                    case 1:
                        field978.method2891((Integer) Statics.field22.field1312.get(class272.method2670(class94.field1460)));
                        field978.field2394 += 4;
                        break;
                    case 2:
                        field978.field2394 += 8;
                }
                field978.method2894(class94.field1458);
                field978.method2924(class92.field1415, class92.field1417);
                field979.field2394 = 0;
                if (field942 == 40) {
                    field979.method2888(18);
                } else {
                    field979.method2888(16);
                }
                field979.method3030(0);
                int var4 = field979.field2394;
                field979.method2891(153);
                field979.method2897(field978.field2390, 0, field978.field2394);
                int var5 = field979.field2394;
                field979.method2894(class94.field1460);
                field979.method2888((field1041 ? 1 : 0) << 1 | (field939 ? 1 : 0));
                field979.method3030(Statics.field710);
                field979.method3030(Statics.field1);
                class181 var6 = field979;
                if (field972 == null) {
                    byte[] var7 = class157.method2817();
                    var6.method2897(var7, 0, var7.length);
                } else {
                    var6.method2897(field972, 0, field972.length);
                }
                field979.method2894(Statics.field1042);
                field979.method2891(Statics.field1502);
                class175 var8 = new class175(Statics.field1565.method5044());
                Statics.field1565.method5042(var8);
                field979.method2897(var8.field2390, 0, var8.field2390.length);
                field979.method2888(Statics.field822);
                field979.method2891(0);
                field979.method2891(Statics.field483.field3215);
                field979.method2891(Statics.field788.field3215);
                field979.method2891(Statics.field422.field3215);
                field979.method2891(Statics.field1338.field3215);
                field979.method2891(Statics.field966.field3215);
                field979.method2891(Statics.field288.field3215);
                field979.method2891(Statics.field3387.field3215);
                field979.method2891(Statics.field604.field3215);
                field979.method2891(Statics.field2410.field3215);
                field979.method2891(Statics.field1925.field3215);
                field979.method2891(Statics.field745.field3215);
                field979.method2891(Statics.field2366.field3215);
                field979.method2891(Statics.field2056.field3215);
                field979.method2891(Statics.field3618.field3215);
                field979.method2891(Statics.field3399.field3215);
                field979.method2891(Statics.field2607.field3215);
                field979.method2891(Statics.field2006.field3215);
                field979.method2922(var3, var5, field979.field2394);
                field979.method2899(field979.field2394 - var4);
                Statics.field2012.method2749(field979.field2390, 0, field979.field2394);
                field978.method3146(var3);
                for (int var9 = 0; var9 < 4; var9++) {
                    var3[var9] += 50;
                }
                field956.method3146(var3);
                field968 = 6;
            }
            if (field968 == 6 && Statics.field2012.method2747() > 0) {
                int var10 = Statics.field2012.method2760();
                if (var10 == 21 && field942 == 20) {
                    field968 = 7;
                } else if (var10 == 2) {
                    field968 = 9;
                } else if (var10 == 15 && field942 == 40) {
                    field981 = -1;
                    field968 = 13;
                } else if (var10 == 23 && field970 < 1) {
                    field970++;
                    field968 = 0;
                } else if (var10 == 29) {
                    field968 = 11;
                } else {
                    method145(var10);
                    return;
                }
            }
            if (field968 == 7 && Statics.field2012.method2747() > 0) {
                field1032 = (Statics.field2012.method2760() + 3) * 60;
                field968 = 8;
            }
            if (field968 == 8) {
                field969 = 0;
                class94.method1048(class227.field2859, class227.field3016, field1032 / 60 + class227.field3045);
                if (--field1032 <= 0) {
                    field968 = 0;
                }
            } else {
                if (field968 == 9 && Statics.field2012.method2747() >= 13) {
                    boolean var11 = Statics.field2012.method2760() == 1;
                    Statics.field2012.method2748(field956.field2390, 0, 4);
                    field956.field2394 = 0;
                    boolean var12 = false;
                    if (var11) {
                        int var13 = field956.method3140() << 24;
                        int var14 = var13 | field956.method3140() << 16;
                        int var15 = var14 | field956.method3140() << 8;
                        int var16 = var15 | field956.method3140();
                        int var17 = class272.method2670(class94.field1460);
                        if (Statics.field22.field1312.size() >= 10 && !Statics.field22.field1312.containsKey(var17)) {
                            Iterator var18 = Statics.field22.field1312.entrySet().iterator();
                            var18.next();
                            var18.remove();
                        }
                        Statics.field22.field1312.put(var17, var16);
                        class82.method333();
                    }
                    field1094 = Statics.field2012.method2760();
                    field1159 = Statics.field2012.method2760() == 1;
                    field1019 = Statics.field2012.method2760();
                    field1019 <<= 0x8;
                    field1019 += Statics.field2012.method2760();
                    field1121 = Statics.field2012.method2760();
                    Statics.field2012.method2748(field956.field2390, 0, 1);
                    field956.field2394 = 0;
                    field1040 = field956.method3140();
                    Statics.field2012.method2748(field956.field2390, 0, 2);
                    field956.field2394 = 0;
                    field981 = field956.method3023();
                    try {
                        class53.method703(Statics.field408, "zap");
                    } catch (Throwable var43) {
                    }
                    field968 = 10;
                }
                if (field968 != 10) {
                    if (field968 == 11 && Statics.field2012.method2747() >= 2) {
                        field956.field2394 = 0;
                        Statics.field2012.method2748(field956.field2390, 0, 2);
                        field956.field2394 = 0;
                        Statics.field523 = field956.method3023();
                        field968 = 12;
                    }
                    if (field968 == 12 && Statics.field2012.method2747() >= Statics.field523) {
                        field956.field2394 = 0;
                        Statics.field2012.method2748(field956.field2390, 0, Statics.field523);
                        field956.field2394 = 0;
                        String var34 = field956.method2911();
                        String var35 = field956.method2911();
                        String var36 = field956.method2911();
                        class94.method1048(var34, var35, var36);
                        Statics.method953(10);
                    }
                    if (field968 == 13) {
                        if (field981 == -1) {
                            if (Statics.field2012.method2747() < 2) {
                                return;
                            }
                            Statics.field2012.method2748(field956.field2390, 0, 2);
                            field956.field2394 = 0;
                            field981 = field956.method3023();
                        }
                        if (Statics.field2012.method2747() >= field981) {
                            Statics.field2012.method2748(field956.field2390, 0, field981);
                            field956.field2394 = 0;
                            int var37 = field981;
                            field978.field2394 = 0;
                            field956.field2394 = 0;
                            field1040 = -1;
                            field985 = -1;
                            field986 = -1;
                            field987 = -1;
                            field981 = 0;
                            field983 = 0;
                            field951 = 0;
                            field1156 = 0;
                            field1064 = false;
                            field1161 = 0;
                            field1143 = 0;
                            for (int var38 = 0; var38 < 2048; var38++) {
                                field1046[var38] = null;
                            }
                            Statics.field312 = null;
                            for (int var39 = 0; var39 < field973.length; var39++) {
                                class88 var40 = field973[var39];
                                if (var40 != null) {
                                    var40.field1245 = -1;
                                    var40.field1246 = false;
                                }
                            }
                            class64.method3765();
                            Statics.method953(30);
                            for (int var41 = 0; var41 < 100; var41++) {
                                field1113[var41] = true;
                            }
                            method1558();
                            class98.method2204(field956);
                            if (field956.field2394 != var37) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field969++;
                        if (field969 > 2000) {
                            if (field970 < 1) {
                                if (Statics.field844 == Statics.field3742) {
                                    Statics.field844 = Statics.field378;
                                } else {
                                    Statics.field844 = Statics.field3742;
                                }
                                field970++;
                                field968 = 0;
                            } else {
                                method145(-3);
                            }
                        }
                    }
                } else if (Statics.field2012.method2747() >= field981) {
                    field956.field2394 = 0;
                    Statics.field2012.method2748(field956.field2390, 0, field981);
                    field945 = 1L;
                    field948 = -1;
                    Statics.field1358.field877 = 0;
                    Statics.field3298 = true;
                    field1051 = true;
                    field1151 = -1L;
                    class282.field3741 = new class193();
                    field978.field2394 = 0;
                    field956.field2394 = 0;
                    field1040 = -1;
                    field985 = -1;
                    field986 = -1;
                    field987 = -1;
                    field983 = 0;
                    field951 = 0;
                    field988 = 0;
                    field952 = 0;
                    field1156 = 0;
                    field1064 = false;
                    class60.field730 = 0;
                    class100.field1530.clear();
                    class100.field1531.method3243();
                    class100.field1532.method3380();
                    class100.field1535 = 0;
                    field1080 = 0;
                    field1082 = false;
                    field1167 = 0;
                    field1010 = 0;
                    field1161 = 0;
                    field1154 = -1;
                    field1143 = 0;
                    field1160 = 0;
                    field960 = class93.field1425;
                    field1118 = class93.field1425;
                    field959 = 0;
                    class98.method469();
                    for (int var20 = 0; var20 < 2048; var20++) {
                        field1046[var20] = null;
                    }
                    for (int var21 = 0; var21 < 32768; var21++) {
                        field973[var21] = null;
                    }
                    field1055 = -1;
                    field1058.method3334();
                    field1059.method3334();
                    for (int var22 = 0; var22 < 4; var22++) {
                        for (int var23 = 0; var23 < 104; var23++) {
                            for (int var24 = 0; var24 < 104; var24++) {
                                field1056[var22][var23][var24] = null;
                            }
                        }
                    }
                    field1057 = new class195();
                    field1193 = 0;
                    field1172 = 0;
                    field1196 = 0;
                    for (int var25 = 0; var25 < Statics.field2345; var25++) {
                        class243 var26 = class243.method2866(var25);
                        if (var26 != null) {
                            class213.field2606[var25] = 0;
                            class213.field2604[var25] = 0;
                        }
                    }
                    Statics.field2260.method1666();
                    field1095 = -1;
                    if (field995 != -1) {
                        int var27 = field995;
                        if (var27 != -1 && Statics.field33[var27]) {
                            Statics.field1669.method3786(var27);
                            if (Statics.field2406[var27] != null) {
                                boolean var28 = true;
                                for (int var29 = 0; var29 < Statics.field2406[var27].length; var29++) {
                                    if (Statics.field2406[var27][var29] != null) {
                                        if (Statics.field2406[var27][var29].field2652 == 2) {
                                            var28 = false;
                                        } else {
                                            Statics.field2406[var27][var29] = null;
                                        }
                                    }
                                }
                                if (var28) {
                                    Statics.field2406[var27] = null;
                                }
                                Statics.field33[var27] = false;
                            }
                        }
                    }
                    for (class69 var30 = (class69) field1088.method3276(); var30 != null; var30 = (class69) field1088.method3277()) {
                        method116(var30, true);
                    }
                    field995 = -1;
                    field1088 = new class192(8);
                    field1091 = null;
                    field1156 = 0;
                    field1064 = false;
                    field1009.method3670((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var31 = 0; var31 < 8; var31++) {
                        field1052[var31] = null;
                        field1053[var31] = false;
                    }
                    class64.method3765();
                    field943 = true;
                    for (int var32 = 0; var32 < 100; var32++) {
                        field1113[var32] = true;
                    }
                    method1558();
                    field1152 = null;
                    Statics.field1321 = 0;
                    Statics.field426 = null;
                    for (int var33 = 0; var33 < 8; var33++) {
                        field1126[var33] = new class17();
                    }
                    Statics.field780 = null;
                    class98.method2204(field956);
                    Statics.field279 = -1;
                    method185(false);
                    field1040 = -1;
                }
            }
        } catch (IOException var44) {
            if (field970 < 1) {
                if (Statics.field844 == Statics.field3742) {
                    Statics.field844 = Statics.field378;
                } else {
                    Statics.field844 = Statics.field3742;
                }
                field970++;
                field968 = 0;
            } else {
                method145(-2);
            }
        }
    }

    @ObfuscatedName("y.fj(IB)V")
    public static void method145(int arg0) {
        if (arg0 == -3) {
            class94.method1048(class227.field2893, class227.field2894, class227.field2895);
        } else if (arg0 == -2) {
            class94.method1048(class227.field2896, class227.field2998, class227.field3068);
        } else if (arg0 == -1) {
            class94.method1048(class227.field2899, class227.field2928, class227.field2901);
        } else if (arg0 == 3) {
            class94.field1452 = 3;
        } else if (arg0 == 4) {
            class94.method1048(class227.field2973, class227.field2978, class227.field2904);
        } else if (arg0 == 5) {
            class94.method1048(class227.field2905, class227.field2906, class227.field3022);
        } else if (arg0 == 6) {
            class94.method1048(class227.field3118, class227.field3064, class227.field3049);
        } else if (arg0 == 7) {
            class94.method1048(class227.field2911, class227.field3060, class227.field2913);
        } else if (arg0 == 8) {
            class94.method1048(class227.field2914, class227.field2891, class227.field2916);
        } else if (arg0 == 9) {
            class94.method1048(class227.field2917, class227.field2918, class227.field2920);
        } else if (arg0 == 10) {
            class94.method1048(class227.field2971, class227.field2921, class227.field2986);
        } else if (arg0 == 11) {
            class94.method1048(class227.field2923, class227.field2937, class227.field2925);
        } else if (arg0 == 12) {
            class94.method1048(class227.field2926, class227.field2927, class227.field3081);
        } else if (arg0 == 13) {
            class94.method1048(class227.field2929, class227.field2930, class227.field2945);
        } else if (arg0 == 14) {
            class94.method1048(class227.field2960, class227.field2933, class227.field2934);
        } else if (arg0 == 16) {
            class94.method1048(class227.field2935, class227.field2936, class227.field2974);
        } else if (arg0 == 17) {
            class94.method1048(class227.field2938, class227.field2898, class227.field2940);
        } else if (arg0 == 18) {
            class94.method1048(class227.field2959, class227.field2954, class227.field2943);
        } else if (arg0 == 19) {
            class94.method1048(class227.field2944, class227.field3014, class227.field2946);
        } else if (arg0 == 20) {
            class94.method1048(class227.field2947, class227.field2948, class227.field2949);
        } else if (arg0 == 22) {
            class94.method1048(class227.field2874, class227.field2951, class227.field2952);
        } else if (arg0 == 23) {
            class94.method1048(class227.field2953, class227.field3017, class227.field2983);
        } else if (arg0 == 24) {
            class94.method1048(class227.field3085, class227.field2957, class227.field3008);
        } else if (arg0 == 25) {
            class94.method1048(class227.field3108, class227.field3040, class227.field2961);
        } else if (arg0 == 26) {
            class94.method1048(class227.field2962, class227.field2963, class227.field3067);
        } else if (arg0 == 27) {
            class94.method1048(class227.field2965, class227.field3058, class227.field2967);
        } else if (arg0 == 31) {
            class94.method1048(class227.field2942, class227.field2975, class227.field3038);
        } else if (arg0 == 32) {
            class94.method1048(class227.field2977, class227.field2932, class227.field3099);
        } else if (arg0 == 37) {
            class94.method1048(class227.field2980, class227.field2981, class227.field2982);
        } else if (arg0 == 38) {
            class94.method1048(class227.field2968, class227.field2984, class227.field3093);
        } else if (arg0 == 55) {
            class94.method1048(class227.field3025, class227.field2987, class227.field2988);
        } else if (arg0 == 56) {
            class94.method1048(class227.field3116, class227.field2990, class227.field2991);
            Statics.method953(11);
            return;
        } else if (arg0 == 57) {
            class94.method1048(class227.field2992, class227.field2919, class227.field3080);
            Statics.method953(11);
            return;
        } else {
            class94.method1048(class227.field2995, class227.field2996, class227.field2997);
        }
        Statics.method953(10);
    }

    @ObfuscatedName("aj.fv(B)V")
    public static final void method335() {
        if (Statics.field2012 != null) {
            Statics.field2012.method2745();
            Statics.field2012 = null;
        }
        method4568();
        Statics.field512.method2479();
        for (int var0 = 0; var0 < 4; var0++) {
            field997[var0].method2788();
        }
        System.gc();
        class205.field2508 = 1;
        Statics.field2503 = null;
        Statics.field2206 = -1;
        Statics.field2223 = -1;
        Statics.field2505 = 0;
        Statics.field1533 = false;
        Statics.field2506 = 2;
        field1096 = -1;
        field1164 = false;
        class83.method758();
        Statics.method953(10);
    }

    @ObfuscatedName("js.fx(I)V")
    public static final void method4568() {
        class261.method1027();
        class248.method151();
        class249.field3337.method3259();
        class257.method1958();
        class260.field3560.method3259();
        class260.field3540.method3259();
        class258.field3493.method3259();
        class258.field3481.method3259();
        class258.field3484.method3259();
        class262.method2675();
        class247.field3311.method3259();
        class247.field3324.method3259();
        class252.method1578();
        class243.method1060();
        class256.method1097();
        class250.field3351.method3259();
        class250.field3352.method3259();
        class254.field3383.method3259();
        class253.field3380.method3259();
        class244.method565();
        class215.field2621.method3259();
        class218.method35();
        ((class127) Statics.field2038).method2181();
        class101.field1549.method3259();
        Statics.field483.method3770();
        Statics.field788.method3770();
        Statics.field1338.method3770();
        Statics.field966.method3770();
        Statics.field288.method3770();
        Statics.field3387.method3770();
        Statics.field604.method3770();
        Statics.field2410.method3770();
        Statics.field1925.method3770();
        Statics.field745.method3770();
        Statics.field2366.method3770();
        Statics.field2056.method3770();
    }

    @ObfuscatedName("client.fc(I)V")
    public final void method1174() {
        if (field951 > 1) {
            field951--;
        }
        if (field988 > 0) {
            field988--;
        }
        if (field989) {
            field989 = false;
            if (field988 > 0) {
                method335();
            } else {
                Statics.method953(40);
                Statics.field338 = Statics.field2012;
                Statics.field2012 = null;
            }
            return;
        }
        if (!field1064) {
            method480();
        }
        for (int var1 = 0; var1 < 100 && this.method1246(); var1++) {
        }
        if (field942 != 30) {
            return;
        }
        while (class282.method3517()) {
            field978.method3139(35);
            field978.method2888(0);
            int var2 = field978.field2394;
            class282.method576(field978);
            field978.method2900(field978.field2394 - var2);
        }
        Object var3 = Statics.field1358.field876;
        synchronized (Statics.field1358.field876) {
            if (!field1061) {
                Statics.field1358.field877 = 0;
            } else if (class60.field741 != 0 || Statics.field1358.field877 >= 40) {
                field978.method3139(252);
                field978.method2888(0);
                int var4 = field978.field2394;
                int var5 = 0;
                for (int var6 = 0; var6 < Statics.field1358.field877 && field978.field2394 - var4 < 240; var6++) {
                    var5++;
                    int var7 = Statics.field1358.field875[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = Statics.field1358.field879[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (Statics.field1358.field875[var6] == -1 && Statics.field1358.field879[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (field946 != var8 || field1030 != var7) {
                        int var10 = var8 - field946;
                        field946 = var8;
                        int var11 = var7 - field1030;
                        field1030 = var7;
                        if (field948 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            field978.method3030((field948 << 12) + (var10 << 6) + var11);
                            field948 = 0;
                        } else if (field948 < 8) {
                            field978.method3053((field948 << 19) + 8388608 + var9);
                            field948 = 0;
                        } else {
                            field978.method2891((field948 << 19) + -1073741824 + var9);
                            field948 = 0;
                        }
                    } else if (field948 < 2047) {
                        field948++;
                    }
                }
                field978.method2900(field978.field2394 - var4);
                if (var5 >= Statics.field1358.field877) {
                    Statics.field1358.field877 = 0;
                } else {
                    Statics.field1358.field877 -= var5;
                    for (int var12 = 0; var12 < Statics.field1358.field877; var12++) {
                        Statics.field1358.field879[var12] = Statics.field1358.field879[var5 + var12];
                        Statics.field1358.field875[var12] = Statics.field1358.field875[var5 + var12];
                    }
                }
            }
        }
        if (class60.field741 == 1 || !Statics.field303 && class60.field741 == 4 || class60.field741 == 2) {
            long var14 = (class60.field737 - field945 * -1L) / 50L;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            field945 = class60.field737 * -1L;
            int var16 = class60.field743;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field1) {
                var16 = Statics.field1;
            }
            int var17 = class60.field742;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > Statics.field710) {
                var17 = Statics.field710;
            }
            int var18 = (int) var14;
            field978.method3139(65);
            field978.method3030((var18 << 1) + (class60.field741 == 2 ? 1 : 0));
            field978.method3030(var17);
            field978.method3030(var16);
        }
        if (class51.field650 > 0) {
            field978.method3139(118);
            field978.method3030(0);
            int var19 = field978.field2394;
            long var20 = class177.method1067();
            for (int var22 = 0; var22 < class51.field650; var22++) {
                long var23 = var20 - field1151;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field1151 = var20;
                field978.method3053((int) var23);
                field978.method2888(class51.field638[var22]);
            }
            field978.method2899(field978.field2394 - var19);
        }
        if (field1016 > 0) {
            field1016--;
        }
        if (class51.field643[96] || class51.field643[97] || class51.field643[98] || class51.field643[99]) {
            field1017 = true;
        }
        if (field1017 && field1016 <= 0) {
            field1016 = 20;
            field1017 = false;
            field978.method3139(21);
            field978.method3041(field1069);
            field978.method3064(field1010);
        }
        if (Statics.field3298 && !field1051) {
            field1051 = true;
            field978.method3139(85);
            field978.method2888(1);
        }
        if (!Statics.field3298 && field1051) {
            field1051 = false;
            field978.method3139(85);
            field978.method2888(0);
        }
        method1004();
        if (field942 != 30) {
            return;
        }
        for (class78 var25 = (class78) field1057.method3326(); var25 != null; var25 = (class78) field1057.method3323()) {
            if (var25.field1217 > 0) {
                var25.field1217--;
            }
            if (var25.field1217 != 0) {
                if (var25.field1206 > 0) {
                    var25.field1206--;
                }
                if (var25.field1206 == 0 && var25.field1208 >= 1 && var25.field1209 >= 1 && var25.field1208 <= 102 && var25.field1209 <= 102 && (var25.field1218 < 0 || class62.method1066(var25.field1218, var25.field1215))) {
                    method1026(var25.field1213, var25.field1216, var25.field1208, var25.field1209, var25.field1218, var25.field1214, var25.field1215);
                    var25.field1206 = -1;
                    if (var25.field1218 == var25.field1210 && var25.field1210 == -1) {
                        var25.method3314();
                    } else if (var25.field1218 == var25.field1210 && var25.field1214 == var25.field1211 && var25.field1215 == var25.field1207) {
                        var25.method3314();
                    }
                }
            } else if (var25.field1210 < 0 || class62.method1066(var25.field1210, var25.field1207)) {
                method1026(var25.field1213, var25.field1216, var25.field1208, var25.field1209, var25.field1210, var25.field1211, var25.field1207);
                var25.method3314();
            }
        }
        method2695();
        field983++;
        if (field983 <= 750) {
            int var26 = class98.field1511;
            int[] var27 = class98.field1512;
            for (int var28 = 0; var28 < var26; var28++) {
                class76 var29 = field1046[var27[var28]];
                if (var29 != null) {
                    method4523(var29, 1);
                }
            }
            method156();
            int[] var30 = class98.field1512;
            for (int var31 = 0; var31 < class98.field1511; var31++) {
                class76 var32 = field1046[var30[var31]];
                if (var32 != null && var32.field1275 > 0) {
                    var32.field1275--;
                    if (var32.field1275 == 0) {
                        var32.field1238 = null;
                    }
                }
            }
            for (int var33 = 0; var33 < field959; var33++) {
                int var34 = field1158[var33];
                class88 var35 = field973[var34];
                if (var35 != null && var35.field1275 > 0) {
                    var35.field1275--;
                    if (var35.field1275 == 0) {
                        var35.field1238 = null;
                    }
                }
            }
            field958++;
            if (field1036 != 0) {
                field941 += 20;
                if (field941 >= 400) {
                    field1036 = 0;
                }
            }
            if (Statics.field880 != null) {
                field1037++;
                if (field1037 >= 15) {
                    method1576(Statics.field880);
                    Statics.field880 = null;
                }
            }
            class218 var36 = Statics.field13;
            class218 var37 = Statics.field360;
            Statics.field13 = null;
            Statics.field360 = null;
            field1186 = null;
            field1100 = false;
            field1105 = false;
            field1148 = 0;
            while (class51.method1096() && field1148 < 128) {
                if (field1094 >= 2 && class51.field643[82] && Statics.field626 == 66) {
                    String var38 = "";
                    Iterator var39 = class100.field1531.iterator();
                    while (var39.hasNext()) {
                        class74 var40 = (class74) var39.next();
                        var38 = var38 + var40.field887 + ':' + var40.field889 + '\n';
                    }
                    Statics.field408.method781(var38);
                } else {
                    field961[field1148] = Statics.field626;
                    field1012[field1148] = Statics.field2808;
                    field1148++;
                }
            }
            if (field995 != -1) {
                method3129(field995, 0, 0, Statics.field710, Statics.field1, 0, 0);
            }
            field1112++;
            while (true) {
                class71 var43;
                class218 var44;
                class218 var45;
                do {
                    var43 = (class71) field1045.method3325();
                    if (var43 == null) {
                        while (true) {
                            class71 var46;
                            class218 var47;
                            class218 var48;
                            do {
                                var46 = (class71) field1128.method3325();
                                if (var46 == null) {
                                    while (true) {
                                        class71 var49;
                                        class218 var50;
                                        class218 var51;
                                        do {
                                            var49 = (class71) field965.method3325();
                                            if (var49 == null) {
                                                this.method1109();
                                                method2477();
                                                if (field1108 != null) {
                                                    this.method1113();
                                                }
                                                if (Statics.field374 != null) {
                                                    method1576(Statics.field374);
                                                    field1044++;
                                                    if (class60.field734 == 0) {
                                                        if (field1043) {
                                                            if (Statics.field374 == Statics.field3719 && field1147 != field1093) {
                                                                class218 var52 = Statics.field374;
                                                                byte var53 = 0;
                                                                if (field1090 == 1 && var52.field2654 == 206) {
                                                                    var53 = 1;
                                                                }
                                                                if (var52.field2650[field1147] <= 0) {
                                                                    var53 = 0;
                                                                }
                                                                if (class219.method756(method4398(var52))) {
                                                                    int var54 = field1093;
                                                                    int var55 = field1147;
                                                                    var52.field2650[var55] = var52.field2650[var54];
                                                                    var52.field2727[var55] = var52.field2727[var54];
                                                                    var52.field2650[var54] = -1;
                                                                    var52.field2727[var54] = 0;
                                                                } else if (var53 == 1) {
                                                                    int var56 = field1093;
                                                                    int var57 = field1147;
                                                                    while (var56 != var57) {
                                                                        if (var56 > var57) {
                                                                            var52.method3688(var56 - 1, var56);
                                                                            var56--;
                                                                        } else if (var56 < var57) {
                                                                            var52.method3688(var56 + 1, var56);
                                                                            var56++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var52.method3688(field1147, field1093);
                                                                }
                                                                field978.method3139(241);
                                                                field978.method2944(Statics.field374.field2723);
                                                                field978.method2929(var53);
                                                                field978.method3064(field1093);
                                                                field978.method3030(field1147);
                                                            }
                                                        } else if (this.method1235()) {
                                                            this.method1111(field976, field1074);
                                                        } else if (field1156 > 0) {
                                                            int var58 = field976;
                                                            int var59 = field1074;
                                                            class91 var60 = Statics.field319;
                                                            method4397(var60.field1409, var60.field1407, var60.field1408, var60.field1410, var60.field1412, var60.field1412, var58, var59);
                                                            Statics.field319 = null;
                                                        }
                                                        field1037 = 10;
                                                        class60.field741 = 0;
                                                        Statics.field374 = null;
                                                    } else if (field1044 >= 5 && (class60.field735 > field976 + 5 || class60.field735 < field976 - 5 || class60.field736 * -261504029 > field1074 + 5 || class60.field736 * -261504029 < field1074 - 5)) {
                                                        field1043 = true;
                                                    }
                                                }
                                                if (class141.method2518()) {
                                                    int var61 = class141.field2095;
                                                    int var62 = class141.field2089;
                                                    field978.method3139(195);
                                                    field978.method2888(5);
                                                    field978.method2927(class51.field643[82] ? (class51.field643[81] ? 2 : 1) : 0);
                                                    field978.method2937(Statics.field608 + var61);
                                                    field978.method3030(Statics.field587 + var62);
                                                    class141.method2519();
                                                    field1142 = class60.field742;
                                                    field1034 = class60.field743;
                                                    field1036 = 1;
                                                    field941 = 0;
                                                    field1143 = var61;
                                                    field1160 = var62;
                                                }
                                                if (Statics.field13 != var36) {
                                                    if (var36 != null) {
                                                        method1576(var36);
                                                    }
                                                    if (Statics.field13 != null) {
                                                        method1576(Statics.field13);
                                                    }
                                                }
                                                if (Statics.field360 != var37 && field1078 == field1062) {
                                                    if (var37 != null) {
                                                        method1576(var37);
                                                    }
                                                    if (Statics.field360 != null) {
                                                        method1576(Statics.field360);
                                                    }
                                                }
                                                if (Statics.field360 == null) {
                                                    if (field1078 > 0) {
                                                        field1078--;
                                                    }
                                                } else if (field1078 < field1062) {
                                                    field1078++;
                                                    if (field1078 == field1062) {
                                                        method1576(Statics.field360);
                                                    }
                                                }
                                                int var63 = Statics.field312.field1262;
                                                int var64 = Statics.field312.field1259;
                                                if (Statics.field514 - var63 < -500 || Statics.field514 - var63 > 500 || Statics.field473 - var64 < -500 || Statics.field473 - var64 > 500) {
                                                    Statics.field514 = var63;
                                                    Statics.field473 = var64;
                                                }
                                                if (Statics.field514 != var63) {
                                                    Statics.field514 += (var63 - Statics.field514) / 16;
                                                }
                                                if (Statics.field473 != var64) {
                                                    Statics.field473 += (var64 - Statics.field473) / 16;
                                                }
                                                if (class60.field734 == 4 && Statics.field303) {
                                                    int var65 = class60.field736 * -261504029 - field1014 * -261504029;
                                                    field1015 = var65 * 2;
                                                    field1014 = (var65 == -1 || var65 == 1 ? class60.field736 * -261504029 : (field1014 * -261504029 + class60.field736 * -261504029) / 2) * 619026891;
                                                    int var66 = field1013 - class60.field735;
                                                    field1031 = var66 * 2;
                                                    field1013 = var66 == -1 || var66 == 1 ? class60.field735 : (field1013 + class60.field735) / 2;
                                                } else {
                                                    if (class51.field643[96]) {
                                                        field1031 += (-24 - field1031) / 2;
                                                    } else if (class51.field643[97]) {
                                                        field1031 += (24 - field1031) / 2;
                                                    } else {
                                                        field1031 /= 2;
                                                    }
                                                    if (class51.field643[98]) {
                                                        field1015 += (12 - field1015) / 2;
                                                    } else if (class51.field643[99]) {
                                                        field1015 += (-12 - field1015) / 2;
                                                    } else {
                                                        field1015 /= 2;
                                                    }
                                                    field1014 = class60.field736;
                                                    field1013 = class60.field735;
                                                }
                                                field1010 = field1031 / 2 + field1010 & 0x7FF;
                                                field1069 += field1015 / 2;
                                                if (field1069 < 128) {
                                                    field1069 = 128;
                                                }
                                                if (field1069 > 383) {
                                                    field1069 = 383;
                                                }
                                                int var67 = Statics.field514 >> 7;
                                                int var68 = Statics.field473 >> 7;
                                                int var69 = method184(Statics.field514, Statics.field473, Statics.field509);
                                                int var70 = 0;
                                                if (var67 > 3 && var68 > 3 && var67 < 100 && var68 < 100) {
                                                    for (int var71 = var67 - 4; var71 <= var67 + 4; var71++) {
                                                        for (int var72 = var68 - 4; var72 <= var68 + 4; var72++) {
                                                            int var73 = Statics.field509;
                                                            if (var73 < 3 && (class62.field761[1][var71][var72] & 0x2) == 2) {
                                                                var73++;
                                                            }
                                                            int var74 = var69 - class62.field763[var73][var71][var72];
                                                            if (var74 > var70) {
                                                                var70 = var74;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var75 = var70 * 192;
                                                if (var75 > 98048) {
                                                    var75 = 98048;
                                                }
                                                if (var75 < 32768) {
                                                    var75 = 32768;
                                                }
                                                if (var75 > field1018) {
                                                    field1018 += (var75 - field1018) / 24;
                                                } else if (var75 < field1018) {
                                                    field1018 += (var75 - field1018) / 80;
                                                }
                                                if (field1173) {
                                                    int var76 = Statics.field14 * 128 + 64;
                                                    int var77 = Statics.field749 * 128 + 64;
                                                    int var78 = method184(var76, var77, Statics.field509) - Statics.field916;
                                                    if (Statics.field2433 < var76) {
                                                        Statics.field2433 += Statics.field238 * (var76 - Statics.field2433) / 1000 + Statics.field803;
                                                        if (Statics.field2433 > var76) {
                                                            Statics.field2433 = var76;
                                                        }
                                                    }
                                                    if (Statics.field2433 > var76) {
                                                        Statics.field2433 -= Statics.field238 * (Statics.field2433 - var76) / 1000 + Statics.field803;
                                                        if (Statics.field2433 < var76) {
                                                            Statics.field2433 = var76;
                                                        }
                                                    }
                                                    if (Statics.field472 < var78) {
                                                        Statics.field472 += Statics.field238 * (var78 - Statics.field472) / 1000 + Statics.field803;
                                                        if (Statics.field472 > var78) {
                                                            Statics.field472 = var78;
                                                        }
                                                    }
                                                    if (Statics.field472 > var78) {
                                                        Statics.field472 -= Statics.field238 * (Statics.field472 - var78) / 1000 + Statics.field803;
                                                        if (Statics.field472 < var78) {
                                                            Statics.field472 = var78;
                                                        }
                                                    }
                                                    if (Statics.field379 < var77) {
                                                        Statics.field379 += Statics.field238 * (var77 - Statics.field379) / 1000 + Statics.field803;
                                                        if (Statics.field379 > var77) {
                                                            Statics.field379 = var77;
                                                        }
                                                    }
                                                    if (Statics.field379 > var77) {
                                                        Statics.field379 -= Statics.field238 * (Statics.field379 - var77) / 1000 + Statics.field803;
                                                        if (Statics.field379 < var77) {
                                                            Statics.field379 = var77;
                                                        }
                                                    }
                                                    int var79 = Statics.field351 * 128 + 64;
                                                    int var80 = Statics.field2271 * 128 + 64;
                                                    int var81 = method184(var79, var80, Statics.field509) - Statics.field1699;
                                                    int var82 = var79 - Statics.field2433;
                                                    int var83 = var81 - Statics.field472;
                                                    int var84 = var80 - Statics.field379;
                                                    int var85 = (int) Math.sqrt((double) (var82 * var82 + var84 * var84));
                                                    int var86 = (int) (Math.atan2((double) var83, (double) var85) * 325.949D) & 0x7FF;
                                                    int var87 = (int) (Math.atan2((double) var82, (double) var84) * -325.949D) & 0x7FF;
                                                    if (var86 < 128) {
                                                        var86 = 128;
                                                    }
                                                    if (var86 > 383) {
                                                        var86 = 383;
                                                    }
                                                    if (Statics.field633 < var86) {
                                                        Statics.field633 += Statics.field658 * (var86 - Statics.field633) / 1000 + Statics.field345;
                                                        if (Statics.field633 > var86) {
                                                            Statics.field633 = var86;
                                                        }
                                                    }
                                                    if (Statics.field633 > var86) {
                                                        Statics.field633 -= Statics.field658 * (Statics.field633 - var86) / 1000 + Statics.field345;
                                                        if (Statics.field633 < var86) {
                                                            Statics.field633 = var86;
                                                        }
                                                    }
                                                    int var88 = var87 - Statics.field607;
                                                    if (var88 > 1024) {
                                                        var88 -= 2048;
                                                    }
                                                    if (var88 < -1024) {
                                                        var88 += 2048;
                                                    }
                                                    if (var88 > 0) {
                                                        Statics.field607 += Statics.field658 * var88 / 1000 + Statics.field345;
                                                        Statics.field607 &= 0x7FF;
                                                    }
                                                    if (var88 < 0) {
                                                        Statics.field607 -= Statics.field658 * -var88 / 1000 + Statics.field345;
                                                        Statics.field607 &= 0x7FF;
                                                    }
                                                    int var89 = var87 - Statics.field607;
                                                    if (var89 > 1024) {
                                                        var89 -= 2048;
                                                    }
                                                    if (var89 < -1024) {
                                                        var89 += 2048;
                                                    }
                                                    if (var89 < 0 && var88 > 0 || var89 > 0 && var88 < 0) {
                                                        Statics.field607 = var87;
                                                    }
                                                }
                                                for (int var90 = 0; var90 < 5; var90++) {
                                                    int var10002 = field1178[var90]++;
                                                }
                                                Statics.field2260.method1683();
                                                int var91 = Statics.method3731();
                                                int var92 = class51.field647;
                                                if (var91 > 15000 && var92 > 15000) {
                                                    field988 = 250;
                                                    class60.field730 = 14500;
                                                    field978.method3139(250);
                                                }
                                                for (class68 var94 = (class68) field1195.method3352(); var94 != null; var94 = (class68) field1195.method3360()) {
                                                    if ((long) var94.field836 < class177.method1067() / 1000L - 5L) {
                                                        if (var94.field837 > 0) {
                                                            class100.method1553(5, "", var94.field834 + class227.field2964);
                                                        }
                                                        if (var94.field837 == 0) {
                                                            class100.method1553(5, "", var94.field834 + class227.field2999);
                                                        }
                                                        var94.method3362();
                                                    }
                                                }
                                                field984++;
                                                if (field984 > 50) {
                                                    field978.method3139(143);
                                                }
                                                try {
                                                    if (Statics.field2012 != null && field978.field2394 > 0) {
                                                        Statics.field2012.method2749(field978.field2390, 0, field978.field2394);
                                                        field978.field2394 = 0;
                                                        field984 = 0;
                                                    }
                                                } catch (IOException var96) {
                                                    if (field988 > 0) {
                                                        method335();
                                                    } else {
                                                        Statics.method953(40);
                                                        Statics.field338 = Statics.field2012;
                                                        Statics.field2012 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var50 = var49.field856;
                                            if (var50.field2698 < 0) {
                                                break;
                                            }
                                            var51 = class218.method1532(var50.field2681);
                                        } while (var51 == null || var51.field2774 == null || var50.field2698 >= var51.field2774.length || var51.field2774[var50.field2698] != var50);
                                        class85.method3622(var49);
                                    }
                                }
                                var47 = var46.field856;
                                if (var47.field2698 < 0) {
                                    break;
                                }
                                var48 = class218.method1532(var47.field2681);
                            } while (var48 == null || var48.field2774 == null || var47.field2698 >= var48.field2774.length || var48.field2774[var47.field2698] != var47);
                            class85.method3622(var46);
                        }
                    }
                    var44 = var43.field856;
                    if (var44.field2698 < 0) {
                        break;
                    }
                    var45 = class218.method1532(var44.field2681);
                } while (var45 == null || var45.field2774 == null || var44.field2698 >= var45.field2774.length || var45.field2774[var44.field2698] != var44);
                class85.method3622(var43);
            }
        } else if (field988 > 0) {
            method335();
        } else {
            Statics.method953(40);
            Statics.field338 = Statics.field2012;
            Statics.field2012 = null;
        }
    }

    @ObfuscatedName("gv.ft(I)V")
    public static final void method3176() {
        if (Statics.field447 != null) {
            Statics.field447.method1870();
        }
        if (Statics.field1357 != null) {
            Statics.field1357.method1870();
        }
    }

    @ObfuscatedName("er.fe(S)V")
    public static final void method2695() {
        for (int var0 = 0; var0 < field1167; var0++) {
            int var10002 = field1170[var0]--;
            if (field1170[var0] >= -10) {
                class107 var2 = field938[var0];
                if (var2 == null) {
                    class107 var10000 = (class107) null;
                    var2 = class107.method1798(Statics.field966, field1168[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1170[var0] += var2.method1796();
                    field938[var0] = var2;
                }
                if (field1170[var0] < 0) {
                    int var9;
                    if (field1171[var0] == 0) {
                        var9 = field975;
                    } else {
                        int var3 = (field1171[var0] & 0xFF) * 128;
                        int var4 = field1171[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field312.field1262;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1171[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field312.field1259;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1170[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1149 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class109 var10 = var2.method1801().method1845(Statics.field263);
                        class119 var11 = class119.method2034(var10, 100, var9);
                        var11.method1998(field1169[var0] - 1);
                        Statics.field680.method1737(var11);
                    }
                    field1170[var0] = -100;
                }
            } else {
                field1167--;
                for (int var1 = var0; var1 < field1167; var1++) {
                    field1168[var1] = field1168[var1 + 1];
                    field938[var1] = field938[var1 + 1];
                    field1169[var1] = field1169[var1 + 1];
                    field1170[var1] = field1170[var1 + 1];
                    field1171[var1] = field1171[var1 + 1];
                }
                var0--;
            }
        }
        if (field1164 && !class205.method2762()) {
            if (field1025 != 0 && field1096 != -1) {
                class205.method1033(Statics.field3387, field1096, 0, field1025, false);
            }
            field1164 = false;
        }
    }

    @ObfuscatedName("b.fi(Ljf;IIII)V")
    public static void method37(class262 arg0, int arg1, int arg2, int arg3) {
        if (field1167 >= 50 || field1149 == 0 || arg0.field3603 == null || arg1 >= arg0.field3603.length) {
            return;
        }
        int var4 = arg0.field3603[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1168[field1167] = var5;
        field1169[field1167] = var6;
        field1170[field1167] = 0;
        field938[field1167] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1171[field1167] = (var8 << 16) + (var9 << 8) + var7;
        field1167++;
    }

    @ObfuscatedName("f.fg(IIII)V")
    public static void method5(int arg0, int arg1, int arg2) {
        if (field975 == 0 || arg1 == 0 || field1167 >= 50) {
            return;
        }
        field1168[field1167] = arg0;
        field1169[field1167] = arg1;
        field1170[field1167] = arg2;
        field938[field1167] = null;
        field1171[field1167] = 0;
        field1167++;
    }

    @ObfuscatedName("bp.fp(I)V")
    public static final void method1004() {
        if (Statics.field509 != field1154) {
            field1154 = Statics.field509;
            method1485(Statics.field509);
        }
    }

    @ObfuscatedName("bx.fu(Lhi;III)V")
    public static final void method1073(class218 arg0, int arg1, int arg2) {
        if (field1161 != 0 && field1161 != 3 || class60.field741 != 1 && Statics.field303 || class60.field741 != 4) {
            return;
        }
        class212 var3 = arg0.method3723(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field742 - arg1;
        int var5 = class60.field743 - arg2;
        if (!var3.method3607(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2600 / 2;
        int var7 = var5 - var3.field2598 / 2;
        int var8 = field1010 & 0x7FF;
        int var9 = class138.field2041[var8];
        int var10 = class138.field2030[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field312.field1262 + var11 >> 7;
        int var14 = Statics.field312.field1259 - var12 >> 7;
        field978.method3139(110);
        field978.method2888(18);
        field978.method2927(class51.field643[82] ? (class51.field643[81] ? 2 : 1) : 0);
        field978.method2937(Statics.field608 + var13);
        field978.method3030(Statics.field587 + var14);
        field978.method2888(var6);
        field978.method2888(var7);
        field978.method3030(field1010);
        field978.method2888(57);
        field978.method2888(0);
        field978.method2888(0);
        field978.method2888(89);
        field978.method3030(Statics.field312.field1262);
        field978.method3030(Statics.field312.field1259);
        field978.method2888(63);
        field1143 = var13;
        field1160 = var14;
    }

    @ObfuscatedName("u.fm(B)V")
    public static final void method156() {
        for (int var0 = 0; var0 < field959; var0++) {
            int var1 = field1158[var0];
            class88 var2 = field973[var1];
            if (var2 != null) {
                method4523(var2, var2.field1382.field3544);
            }
        }
    }

    @ObfuscatedName("jn.fd(Lcr;IB)V")
    public static final void method4523(class79 arg0, int arg1) {
        if (arg0.field1265 > field944) {
            int var2 = arg0.field1265 - field944;
            int var3 = arg0.field1261 * 128 + arg0.field1220 * 64;
            int var4 = arg0.field1263 * 128 + arg0.field1220 * 64;
            arg0.field1262 += (var3 - arg0.field1262) / var2;
            arg0.field1259 += (var4 - arg0.field1259) / var2;
            arg0.field1277 = 0;
            arg0.field1270 = arg0.field1267;
        } else if (arg0.field1266 >= field944) {
            method39(arg0);
        } else {
            arg0.field1235 = arg0.field1224;
            if (arg0.field1269 == 0) {
                arg0.field1277 = 0;
            } else {
                label322: {
                    if (arg0.field1251 != -1 && arg0.field1254 == 0) {
                        class262 var5 = class262.method1389(arg0.field1251);
                        if (arg0.field1278 > 0 && var5.field3602 == 0) {
                            arg0.field1277++;
                            break label322;
                        }
                        if (arg0.field1278 <= 0 && var5.field3606 == 0) {
                            arg0.field1277++;
                            break label322;
                        }
                    }
                    int var6 = arg0.field1262;
                    int var7 = arg0.field1259;
                    int var8 = arg0.field1228[arg0.field1269 - 1] * 128 + arg0.field1220 * 64;
                    int var9 = arg0.field1234[arg0.field1269 - 1] * 128 + arg0.field1220 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field1270 = 1280;
                        } else if (var7 > var9) {
                            arg0.field1270 = 1792;
                        } else {
                            arg0.field1270 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field1270 = 768;
                        } else if (var7 > var9) {
                            arg0.field1270 = 256;
                        } else {
                            arg0.field1270 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field1270 = 1024;
                    } else if (var7 > var9) {
                        arg0.field1270 = 0;
                    }
                    byte var10 = arg0.field1252[arg0.field1269 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field1270 - arg0.field1221 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field1219;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field1227;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field1230;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field1229;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field1227;
                        }
                        arg0.field1235 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class88) {
                            var14 = ((class88) arg0).field1382.field3572;
                        }
                        if (var14) {
                            if (arg0.field1270 != arg0.field1221 && arg0.field1245 == -1 && arg0.field1231 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field1269 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field1269 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field1277 > 0 && arg0.field1269 > 1) {
                                var13 = 8;
                                arg0.field1277--;
                            }
                        } else {
                            if (arg0.field1269 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field1269 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field1277 > 0 && arg0.field1269 > 1) {
                                var13 = 8;
                                arg0.field1277--;
                            }
                        }
                        if (var10 == 2) {
                            var13 <<= 0x1;
                        }
                        if (var13 >= 8 && arg0.field1235 == arg0.field1227 && arg0.field1223 != -1) {
                            arg0.field1235 = arg0.field1223;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field1262 += var13;
                                if (arg0.field1262 > var8) {
                                    arg0.field1262 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field1262 -= var13;
                                if (arg0.field1262 < var8) {
                                    arg0.field1262 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field1259 += var13;
                                if (arg0.field1259 > var9) {
                                    arg0.field1259 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field1259 -= var13;
                                if (arg0.field1259 < var9) {
                                    arg0.field1259 = var9;
                                }
                            }
                        }
                        if (arg0.field1262 == var8 && arg0.field1259 == var9) {
                            arg0.field1269--;
                            if (arg0.field1278 > 0) {
                                arg0.field1278--;
                            }
                        }
                    } else {
                        arg0.field1262 = var8;
                        arg0.field1259 = var9;
                        arg0.field1269--;
                        if (arg0.field1278 > 0) {
                            arg0.field1278--;
                        }
                    }
                }
            }
        }
        if (arg0.field1262 < 128 || arg0.field1259 < 128 || arg0.field1262 >= 13184 || arg0.field1259 >= 13184) {
            arg0.field1251 = -1;
            arg0.field1256 = -1;
            arg0.field1265 = 0;
            arg0.field1266 = 0;
            arg0.field1262 = arg0.field1228[0] * 128 + arg0.field1220 * 64;
            arg0.field1259 = arg0.field1234[0] * 128 + arg0.field1220 * 64;
            arg0.method1392();
        }
        if (Statics.field312 == arg0 && (arg0.field1262 < 1536 || arg0.field1259 < 1536 || arg0.field1262 >= 11776 || arg0.field1259 >= 11776)) {
            arg0.field1251 = -1;
            arg0.field1256 = -1;
            arg0.field1265 = 0;
            arg0.field1266 = 0;
            arg0.field1262 = arg0.field1228[0] * 128 + arg0.field1220 * 64;
            arg0.field1259 = arg0.field1234[0] * 128 + arg0.field1220 * 64;
            arg0.method1392();
        }
        method650(arg0);
        arg0.field1222 = false;
        if (arg0.field1235 != -1) {
            class262 var15 = class262.method1389(arg0.field1235);
            if (var15 == null || var15.field3595 == null) {
                arg0.field1235 = -1;
            } else {
                arg0.field1250++;
                if (arg0.field1249 < var15.field3595.length && arg0.field1250 > var15.field3596[arg0.field1249]) {
                    arg0.field1250 = 1;
                    arg0.field1249++;
                    method37(var15, arg0.field1249, arg0.field1262, arg0.field1259);
                }
                if (arg0.field1249 >= var15.field3595.length) {
                    arg0.field1250 = 0;
                    arg0.field1249 = 0;
                    method37(var15, arg0.field1249, arg0.field1262, arg0.field1259);
                }
            }
        }
        if (arg0.field1256 != -1 && field944 >= arg0.field1225) {
            if (arg0.field1257 < 0) {
                arg0.field1257 = 0;
            }
            int var16 = class247.method473(arg0.field1256).field3317;
            if (var16 == -1) {
                arg0.field1256 = -1;
            } else {
                class262 var17 = class262.method1389(var16);
                if (var17 == null || var17.field3595 == null) {
                    arg0.field1256 = -1;
                } else {
                    arg0.field1258++;
                    if (arg0.field1257 < var17.field3595.length && arg0.field1258 > var17.field3596[arg0.field1257]) {
                        arg0.field1258 = 1;
                        arg0.field1257++;
                        method37(var17, arg0.field1257, arg0.field1262, arg0.field1259);
                    }
                    if (arg0.field1257 >= var17.field3595.length && (arg0.field1257 < 0 || arg0.field1257 >= var17.field3595.length)) {
                        arg0.field1256 = -1;
                    }
                }
            }
        }
        if (arg0.field1251 != -1 && arg0.field1254 <= 1) {
            class262 var18 = class262.method1389(arg0.field1251);
            if (var18.field3602 == 1 && arg0.field1278 > 0 && arg0.field1265 <= field944 && arg0.field1266 < field944) {
                arg0.field1254 = 1;
                return;
            }
        }
        if (arg0.field1251 != -1 && arg0.field1254 == 0) {
            class262 var19 = class262.method1389(arg0.field1251);
            if (var19 == null || var19.field3595 == null) {
                arg0.field1251 = -1;
            } else {
                arg0.field1268++;
                if (arg0.field1243 < var19.field3595.length && arg0.field1268 > var19.field3596[arg0.field1243]) {
                    arg0.field1268 = 1;
                    arg0.field1243++;
                    method37(var19, arg0.field1243, arg0.field1262, arg0.field1259);
                }
                if (arg0.field1243 >= var19.field3595.length) {
                    arg0.field1243 -= var19.field3592;
                    arg0.field1255++;
                    if (arg0.field1255 >= var19.field3604) {
                        arg0.field1251 = -1;
                    } else if (arg0.field1243 >= 0 && arg0.field1243 < var19.field3595.length) {
                        method37(var19, arg0.field1243, arg0.field1262, arg0.field1259);
                    } else {
                        arg0.field1251 = -1;
                    }
                }
                arg0.field1222 = var19.field3600;
            }
        }
        if (arg0.field1254 > 0) {
            arg0.field1254--;
        }
    }

    @ObfuscatedName("o.fh(Lcr;I)V")
    public static final void method39(class79 arg0) {
        if (field944 == arg0.field1266 || arg0.field1251 == -1 || arg0.field1254 != 0 || arg0.field1268 + 1 > class262.method1389(arg0.field1251).field3596[arg0.field1243]) {
            int var1 = arg0.field1266 - arg0.field1265;
            int var2 = field944 - arg0.field1265;
            int var3 = arg0.field1261 * 128 + arg0.field1220 * 64;
            int var4 = arg0.field1263 * 128 + arg0.field1220 * 64;
            int var5 = arg0.field1272 * 128 + arg0.field1220 * 64;
            int var6 = arg0.field1264 * 128 + arg0.field1220 * 64;
            arg0.field1262 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1259 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1277 = 0;
        arg0.field1270 = arg0.field1267;
        arg0.field1221 = arg0.field1270;
    }

    @ObfuscatedName("aq.fy(Lcr;B)V")
    public static final void method650(class79 arg0) {
        if (arg0.field1231 == 0) {
            return;
        }
        if (arg0.field1245 != -1) {
            class79 var1 = null;
            if (arg0.field1245 < 32768) {
                var1 = field973[arg0.field1245];
            } else if (arg0.field1245 >= 32768) {
                var1 = field1046[arg0.field1245 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1262 - var1.field1262;
                int var3 = arg0.field1259 - var1.field1259;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1270 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1246) {
                arg0.field1245 = -1;
                arg0.field1246 = false;
            }
        }
        if (arg0.field1247 != -1 && (arg0.field1269 == 0 || arg0.field1277 > 0)) {
            arg0.field1270 = arg0.field1247;
            arg0.field1247 = -1;
        }
        int var4 = arg0.field1270 - arg0.field1221 & 0x7FF;
        if (var4 == 0 && arg0.field1246) {
            arg0.field1245 = -1;
            arg0.field1246 = false;
        }
        if (var4 == 0) {
            arg0.field1248 = 0;
            return;
        }
        arg0.field1248++;
        if (var4 > 1024) {
            arg0.field1221 -= arg0.field1231;
            boolean var5 = true;
            if (var4 < arg0.field1231 || var4 > 2048 - arg0.field1231) {
                arg0.field1221 = arg0.field1270;
                var5 = false;
            }
            if (arg0.field1235 == arg0.field1224 && (arg0.field1248 > 25 || var5)) {
                if (arg0.field1242 == -1) {
                    arg0.field1235 = arg0.field1227;
                } else {
                    arg0.field1235 = arg0.field1242;
                }
            }
        } else {
            arg0.field1221 += arg0.field1231;
            boolean var6 = true;
            if (var4 < arg0.field1231 || var4 > 2048 - arg0.field1231) {
                arg0.field1221 = arg0.field1270;
                var6 = false;
            }
            if (arg0.field1235 == arg0.field1224 && (arg0.field1248 > 25 || var6)) {
                if (arg0.field1226 == -1) {
                    arg0.field1235 = arg0.field1227;
                } else {
                    arg0.field1235 = arg0.field1226;
                }
            }
        }
        arg0.field1221 &= 0x7FF;
    }

    @ObfuscatedName("el.fn(I)V")
    public static void method2477() {
        if (Statics.field600 != null) {
            Statics.field600.method4852(Statics.field509, (Statics.field312.field1262 >> 7) + Statics.field608, (Statics.field312.field1259 >> 7) + Statics.field587, false);
            Statics.field600.method4872();
        }
    }

    @ObfuscatedName("p.fb(Lbz;IIB)V")
    public static void method7(class76 arg0, int arg1, int arg2) {
        if (arg0.field1251 == arg1 && arg1 != -1) {
            int var3 = class262.method1389(arg1).field3607;
            if (var3 == 1) {
                arg0.field1243 = 0;
                arg0.field1268 = 0;
                arg0.field1254 = arg2;
                arg0.field1255 = 0;
            }
            if (var3 == 2) {
                arg0.field1255 = 0;
            }
        } else if (arg1 == -1 || arg0.field1251 == -1 || class262.method1389(arg1).field3601 >= class262.method1389(arg0.field1251).field3601) {
            arg0.field1251 = arg1;
            arg0.field1243 = 0;
            arg0.field1268 = 0;
            arg0.field1254 = arg2;
            arg0.field1255 = 0;
            arg0.field1278 = arg0.field1269;
        }
    }

    @ObfuscatedName("s.fk(I)I")
    public static int method66() {
        return field1041 ? 2 : 1;
    }

    @ObfuscatedName("cz.fa(I)V")
    public static void method1558() {
        field978.method3139(28);
        field978.method2888(method66());
        field978.method3030(Statics.field710);
        field978.method3030(Statics.field1);
    }

    @ObfuscatedName("client.v(B)V")
    public final void method784() {
        field1140 = class177.method1067() + 500L;
        this.method1106();
        if (field995 != -1) {
            this.method1305(true);
        }
    }

    @ObfuscatedName("client.fq(I)V")
    public void method1106() {
        int var1 = Statics.field710;
        int var2 = Statics.field1;
        if (this.field714 < var1) {
            int var3 = this.field714;
        }
        if (this.field703 < var2) {
            int var4 = this.field703;
        }
        if (Statics.field22 != null) {
            try {
                class53.method704(Statics.field408, "resize", new Object[] { method66() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.fw(I)V")
    public final void method1107() {
        if (field995 != -1) {
            int var1 = field995;
            if (class218.method1059(var1)) {
                method1005(Statics.field2406[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1130; var2++) {
            if (field1113[var2]) {
                field1133[var2] = true;
            }
            field1134[var2] = field1113[var2];
            field1113[var2] = false;
        }
        field1081 = field944;
        field1076 = -1;
        field1077 = -1;
        Statics.field3719 = null;
        if (field995 != -1) {
            field1130 = 0;
            int var3 = field995;
            int var4 = Statics.field710;
            int var5 = Statics.field1;
            if (class218.method1059(var3)) {
                Statics.field339 = null;
                method1038(Statics.field2406[var3], -1, 0, 0, var4, var5, 0, 0, -1);
                if (Statics.field339 != null) {
                    method1038(Statics.field339, -1412584499, 0, 0, var4, var5, Statics.field831, Statics.field609, -1);
                    Statics.field339 = null;
                }
            } else {
                for (int var6 = 0; var6 < 100; var6++) {
                    field1113[var6] = true;
                }
            }
        }
        class283.method4592();
        if (field1064) {
            method87();
        } else if (field1076 != -1) {
            int var7 = field1076;
            int var8 = field1077;
            if (field1156 >= 2 || field1080 != 0 || field1082) {
                int var9 = field1156 - 1;
                String var11;
                if (field1080 == 1 && field1156 < 2) {
                    var11 = class227.field3004 + class227.field2958 + field1085 + " " + class90.field1401;
                } else if (field1082 && field1156 < 2) {
                    var11 = field994 + class227.field2958 + field1086 + " " + class90.field1401;
                } else {
                    String var12;
                    if (var9 < 0) {
                        var12 = "";
                    } else if (field1035[var9].length() > 0) {
                        var12 = field1071[var9] + class227.field2958 + field1035[var9];
                    } else {
                        var12 = field1071[var9];
                    }
                    var11 = var12;
                }
                if (field1156 > 2) {
                    var11 = var11 + class90.method2296(16777215) + " " + '/' + " " + (field1156 - 2) + class227.field3005;
                }
                Statics.field766.method4428(var11, var7 + 4, var8 + 15, 16777215, 0, field944 / 1000);
            }
        }
        if (field1139 == 3) {
            for (int var13 = 0; var13 < field1130; var13++) {
                if (field1134[var13]) {
                    class283.method4600(field1135[var13], field1136[var13], field1204[var13], field1165[var13], 16711935, 128);
                } else if (field1133[var13]) {
                    class283.method4600(field1135[var13], field1136[var13], field1204[var13], field1165[var13], 16711680, 128);
                }
            }
        }
        int var14 = Statics.field509;
        int var15 = Statics.field312.field1262;
        int var16 = Statics.field312.field1259;
        int var17 = field958;
        for (class83 var18 = (class83) class83.field1331.method3326(); var18 != null; var18 = (class83) class83.field1331.method3323()) {
            if (var18.field1327 != -1 || var18.field1317 != null) {
                int var19 = 0;
                if (var15 > var18.field1320) {
                    var19 += var15 - var18.field1320;
                } else if (var15 < var18.field1318) {
                    var19 += var18.field1318 - var15;
                }
                if (var16 > var18.field1323) {
                    var19 += var16 - var18.field1323;
                } else if (var16 < var18.field1328) {
                    var19 += var18.field1328 - var16;
                }
                if (var19 - 64 > var18.field1326 || field1149 == 0 || var18.field1322 != var14) {
                    if (var18.field1324 != null) {
                        Statics.field680.method1766(var18.field1324);
                        var18.field1324 = null;
                    }
                    if (var18.field1329 != null) {
                        Statics.field680.method1766(var18.field1329);
                        var18.field1329 = null;
                    }
                } else {
                    var19 -= 64;
                    if (var19 < 0) {
                        var19 = 0;
                    }
                    int var20 = field1149 * (var18.field1326 - var19) / var18.field1326;
                    class107 var10000;
                    if (var18.field1324 != null) {
                        var18.field1324.method1965(var20);
                    } else if (var18.field1327 >= 0) {
                        var10000 = (class107) null;
                        class107 var21 = class107.method1798(Statics.field966, var18.field1327, 0);
                        if (var21 != null) {
                            class109 var22 = var21.method1801().method1845(Statics.field263);
                            class119 var23 = class119.method2034(var22, 100, var20);
                            var23.method1998(-1);
                            Statics.field680.method1737(var23);
                            var18.field1324 = var23;
                        }
                    }
                    if (var18.field1329 != null) {
                        var18.field1329.method1965(var20);
                        if (!var18.field1329.method3310()) {
                            var18.field1329 = null;
                        }
                    } else if (var18.field1317 != null && (var18.field1316 -= var17) <= 0) {
                        int var24 = (int) (Math.random() * (double) var18.field1317.length);
                        var10000 = (class107) null;
                        class107 var25 = class107.method1798(Statics.field966, var18.field1317[var24], 0);
                        if (var25 != null) {
                            class109 var26 = var25.method1801().method1845(Statics.field263);
                            class119 var27 = class119.method2034(var26, 100, var20);
                            var27.method1998(0);
                            Statics.field680.method1737(var27);
                            var18.field1329 = var27;
                            var18.field1316 = var18.field1325 + (int) (Math.random() * (double) (var18.field1332 - var18.field1325));
                        }
                    }
                }
            }
        }
        field958 = 0;
    }

    @ObfuscatedName("cz.fl(Ljava/lang/String;ZI)V")
    public static final void method1566(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field502.method4417(arg0, 250);
        int var6 = Statics.field502.method4418(arg0, 250) * 13;
        class283.method4601(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class283.method4608(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field502.method4424(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1577(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2287.method761(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field1130; var11++) {
            if (field1204[var11] + field1135[var11] > var7 && field1135[var11] < var7 + var9 && field1165[var11] + field1136[var11] > var8 && field1136[var11] < var8 + var10) {
                field1133[var11] = true;
            }
        }
    }

    @ObfuscatedName("be.fo(IIIIZI)V")
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1153 - field1179) * var5 / 100 + field1179;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1185) {
            short var8 = field1185;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1184) {
                var6 = field1184;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class283.method4592();
                    class283.method4601(arg0, arg1, var10, arg3, -16777216);
                    class283.method4601(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1087) {
            short var11 = field1087;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1127) {
                var6 = field1127;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class283.method4592();
                    class283.method4601(arg0, arg1, arg2, var13, -16777216);
                    class283.method4601(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1201 - field1181) * var5 / 100 + field1181;
        field1011 = arg3 * var6 * var14 / 85504 << 1;
        if (field1189 != arg2 || field1190 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class138.field2041[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class141.method2514(var15, 500, 800, arg2, arg3);
        }
        field1187 = arg0;
        field1188 = arg1;
        field1189 = arg2;
        field1190 = arg3;
    }

    @ObfuscatedName("je.fs(Lbq;I)V")
    public static final void method4508(class67 arg0) {
        if (Statics.field312.field1262 >> 7 == field1143 && Statics.field312.field1259 >> 7 == field1160) {
            field1143 = 0;
        }
        int var1 = class98.field1511;
        int[] var2 = class98.field1512;
        int var3 = var1;
        if (class67.field824 == arg0 || class67.field825 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class76 var5;
            int var6;
            if (class67.field824 == arg0) {
                var5 = Statics.field312;
                var6 = Statics.field312.field897 << 14;
            } else if (class67.field825 == arg0) {
                var5 = field1046[field1055];
                var6 = field1055 << 14;
            } else {
                var5 = field1046[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field827 == arg0 && field1055 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1094() && !var5.field918) {
                var5.field914 = false;
                if ((field939 && var1 > 50 || var1 > 200) && class67.field824 != arg0 && var5.field1235 == var5.field1224) {
                    var5.field914 = true;
                }
                int var7 = var5.field1262 >> 7;
                int var8 = var5.field1259 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field911 == null || field944 < var5.field906 || field944 >= var5.field907) {
                        if ((var5.field1262 & 0x7F) == 64 && (var5.field1259 & 0x7F) == 64) {
                            if (field1072 == field1029[var7][var8]) {
                                continue;
                            }
                            field1029[var7][var8] = field1072;
                        }
                        var5.field905 = method184(var5.field1262, var5.field1259, Statics.field509);
                        Statics.field512.method2490(Statics.field509, var5.field1262, var5.field1259, var5.field905, 60, var5, var5.field1221, var6, var5.field1222);
                    } else {
                        var5.field914 = false;
                        var5.field905 = method184(var5.field1262, var5.field1259, Statics.field509);
                        Statics.field512.method2651(Statics.field509, var5.field1262, var5.field1259, var5.field905, 60, var5, var5.field1221, var6, var5.field902, var5.field921, var5.field920, var5.field924);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.gv(ZI)V")
    public static final void method601(boolean arg0) {
        for (int var1 = 0; var1 < field959; var1++) {
            class88 var2 = field973[field1158[var1]];
            int var3 = (field1158[var1] << 14) + 536870912;
            if (var2 != null && var2.method1094() && var2.field1382.field3563 == arg0 && var2.field1382.method4312()) {
                int var4 = var2.field1262 >> 7;
                int var5 = var2.field1259 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1220 == 1 && (var2.field1262 & 0x7F) == 64 && (var2.field1259 & 0x7F) == 64) {
                        if (field1072 == field1029[var4][var5]) {
                            continue;
                        }
                        field1029[var4][var5] = field1072;
                    }
                    if (!var2.field1382.field3571) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field512.method2490(Statics.field509, var2.field1262, var2.field1259, method184(var2.field1262 + (var2.field1220 * 64 - 64), var2.field1259 + (var2.field1220 * 64 - 64), Statics.field509), var2.field1220 * 64 - 64 + 60, var2, var2.field1221, var3, var2.field1222);
                }
            }
        }
    }

    @ObfuscatedName("ji.gf(I)V")
    public static final void method4576() {
        for (class95 var0 = (class95) field1058.method3326(); var0 != null; var0 = (class95) field1058.method3323()) {
            if (Statics.field509 != var0.field1469 || field944 > var0.field1475) {
                var0.method3314();
            } else if (field944 >= var0.field1474) {
                if (var0.field1478 > 0) {
                    class88 var1 = field973[var0.field1478 - 1];
                    if (var1 != null && var1.field1262 >= 0 && var1.field1262 < 13312 && var1.field1259 >= 0 && var1.field1259 < 13312) {
                        var0.method1617(var1.field1262, var1.field1259, method184(var1.field1262, var1.field1259, var0.field1469) - var0.field1473, field944);
                    }
                }
                if (var0.field1478 < 0) {
                    int var2 = -var0.field1478 - 1;
                    class76 var3;
                    if (field1019 == var2) {
                        var3 = Statics.field312;
                    } else {
                        var3 = field1046[var2];
                    }
                    if (var3 != null && var3.field1262 >= 0 && var3.field1262 < 13312 && var3.field1259 >= 0 && var3.field1259 < 13312) {
                        var0.method1617(var3.field1262, var3.field1259, method184(var3.field1262, var3.field1259, var0.field1469) - var0.field1473, field944);
                    }
                }
                var0.method1618(field958);
                Statics.field512.method2490(Statics.field509, (int) var0.field1480, (int) var0.field1481, (int) var0.field1482, 60, var0, var0.field1491, -1, false);
            }
        }
    }

    @ObfuscatedName("u.gl(Lcr;IIIIII)V")
    public static final void method157(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1094()) {
            return;
        }
        if (arg0 instanceof class88) {
            class260 var6 = ((class88) arg0).field1382;
            if (var6.field3568 != null) {
                var6 = var6.method4331();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class98.field1511;
        int[] var8 = class98.field1512;
        int var9 = 3;
        if (!arg0.field1244.method3285()) {
            method252(arg0, arg0.field1232 + 15);
            for (class87 var10 = (class87) arg0.field1244.method3290(); var10 != null; var10 = (class87) arg0.field1244.method3307()) {
                class80 var11 = var10.method1540(field944);
                if (var11 != null) {
                    class250 var12 = var10.field1377;
                    class287 var13 = var12.method4068();
                    class287 var14 = var12.method4072();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3357;
                    } else {
                        if (var12.field3362 * 2 < var14.field3769) {
                            var15 = var12.field3362;
                        }
                        var16 = var14.field3769 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field944 - var11.field1284;
                    int var20 = var11.field1282 * var16 / var12.field3357;
                    int var23;
                    if (var11.field1280 > var19) {
                        int var21 = var12.field3361 == 0 ? 0 : var19 / var12.field3361 * var12.field3361;
                        int var22 = var11.field1285 * var16 / var12.field3357;
                        var23 = (var20 - var22) * var21 / var11.field1280 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1280 + var12.field3358 - var19;
                        if (var12.field3356 >= 0) {
                            var17 = (var24 << 8) / (var12.field3358 - var12.field3356);
                        }
                    }
                    if (var11.field1282 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field1157 + arg2 - (var16 >> 1);
                    int var26 = field1163 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field1157 > -1) {
                            class283.method4601(var25, var26, var23, 5, 65280);
                            class283.method4601(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3773;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4720(var27, var26, var17);
                            class283.method4594(var27, var26, var27 + var28, var26 + var29);
                            var14.method4720(var27, var26, var17);
                        } else {
                            var13.method4795(var27, var26);
                            class283.method4594(var27, var26, var27 + var28, var26 + var29);
                            var14.method4795(var27, var26);
                        }
                        class283.method4628(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1537()) {
                    var10.method3314();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class76 var30 = (class76) arg0;
            if (var30.field918) {
                return;
            }
            if (var30.field899 != -1 || var30.field900 != -1) {
                method252(arg0, arg0.field1232 + 15);
                if (field1157 > -1) {
                    if (var30.field899 != -1) {
                        Statics.field668[var30.field899].method4795(field1157 + arg2 - 12, field1163 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field900 != -1) {
                        Statics.field402[var30.field900].method4795(field1157 + arg2 - 12, field1163 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field952 == 10 && field954 == var8[arg1]) {
                method252(arg0, arg0.field1232 + 15);
                if (field1157 > -1) {
                    Statics.field281[1].method4795(field1157 + arg2 - 12, field1163 + arg3 - var9);
                }
            }
        } else {
            class260 var31 = ((class88) arg0).field1382;
            if (var31.field3568 != null) {
                var31 = var31.method4331();
            }
            if (var31.field3541 >= 0 && var31.field3541 < Statics.field402.length) {
                method252(arg0, arg0.field1232 + 15);
                if (field1157 > -1) {
                    Statics.field402[var31.field3541].method4795(field1157 + arg2 - 12, field1163 + arg3 - 30);
                }
            }
            if (field952 == 1 && field953 == field1158[arg1 - var7] && field944 % 20 < 10) {
                method252(arg0, arg0.field1232 + 15);
                if (field1157 > -1) {
                    Statics.field281[0].method4795(field1157 + arg2 - 12, field1163 + arg3 - 28);
                }
            }
        }
        if (arg0.field1238 != null && (arg1 >= var7 || !arg0.field1271 && (field1098 == 4 || !arg0.field1274 && (field1098 == 0 || field1098 == 3 || field1098 == 1 && method491(((class76) arg0).field915, false))))) {
            method252(arg0, arg0.field1232);
            if (field1157 > -1 && field937 < field1054) {
                field1166[field937] = Statics.field766.method4415(arg0.field1238) / 2;
                field1023[field937] = Statics.field766.field3632;
                field1020[field937] = field1157;
                field1022[field937] = field1163;
                field1131[field937] = arg0.field1236;
                field1026[field937] = arg0.field1237;
                field1027[field937] = arg0.field1275;
                field1191[field937] = arg0.field1238;
                field937++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1241[var32];
            int var34 = arg0.field1239[var32];
            class256 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field944) {
                    continue;
                }
                var35 = Statics.method3763(arg0.field1239[var32]);
                var36 = var35.field3411;
                if (var35 != null && var35.field3422 != null) {
                    var35 = var35.method4158();
                    if (var35 == null) {
                        arg0.field1241[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1273[var32];
            class256 var38 = null;
            if (var37 >= 0) {
                var38 = Statics.method3763(var37);
                if (var38 != null && var38.field3422 != null) {
                    var38 = var38.method4158();
                }
            }
            if (var33 - var36 <= field944) {
                if (var35 == null) {
                    arg0.field1241[var32] = -1;
                } else {
                    method252(arg0, arg0.field1232 / 2);
                    if (field1157 > -1) {
                        if (var32 == 1) {
                            field1163 -= 20;
                        }
                        if (var32 == 2) {
                            field1157 -= 15;
                            field1163 -= 10;
                        }
                        if (var32 == 3) {
                            field1157 += 15;
                            field1163 -= 10;
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
                        class287 var64 = var35.method4160();
                        if (var64 != null) {
                            var43 = var64.field3769;
                            int var65 = var64.field3773;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3770;
                        }
                        class287 var66 = var35.method4155();
                        if (var66 != null) {
                            var44 = var66.field3769;
                            int var67 = var66.field3773;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3770;
                        }
                        class287 var68 = var35.method4162();
                        if (var68 != null) {
                            var45 = var68.field3769;
                            int var69 = var68.field3773;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3770;
                        }
                        class287 var70 = var35.method4163();
                        if (var70 != null) {
                            var46 = var70.field3769;
                            int var71 = var70.field3773;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3770;
                        }
                        if (var38 != null) {
                            var51 = var38.method4160();
                            if (var51 != null) {
                                var55 = var51.field3769;
                                int var72 = var51.field3773;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3770;
                            }
                            var52 = var38.method4155();
                            if (var52 != null) {
                                var56 = var52.field3769;
                                int var73 = var52.field3773;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3770;
                            }
                            var53 = var38.method4162();
                            if (var53 != null) {
                                var57 = var53.field3769;
                                int var74 = var53.field3773;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3770;
                            }
                            var54 = var38.method4163();
                            if (var54 != null) {
                                var58 = var54.field3769;
                                int var75 = var54.field3773;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3770;
                            }
                        }
                        class265 var76 = var35.method4166();
                        if (var76 == null) {
                            var76 = Statics.field2007;
                        }
                        class265 var77;
                        if (var38 == null) {
                            var77 = Statics.field2007;
                        } else {
                            var77 = var38.method4166();
                            if (var77 == null) {
                                var77 = Statics.field2007;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4159(arg0.field1240[var32]);
                        int var83 = var76.method4415(var82);
                        if (var38 != null) {
                            var79 = var38.method4159(arg0.field1253[var32]);
                            var81 = var77.method4415(var79);
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
                        int var100 = arg0.field1241[var32] - field944;
                        int var101 = var35.field3421 - var35.field3421 * var100 / var35.field3411;
                        int var102 = var35.field3417 * var100 / var35.field3411 + -var35.field3417;
                        int var103 = field1157 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1163 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3424 + var104 + 15;
                        int var108 = var107 - var76.field3633;
                        int var109 = var76.field3634 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3424 + var104 + 15;
                            int var111 = var110 - var77.field3633;
                            int var112 = var77.field3634 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3418 >= 0) {
                            var115 = (var100 << 8) / (var35.field3411 - var35.field3418);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4720(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4720(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4720(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4720(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4421(var82, var90 + var103, var107, var35.field3410, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4720(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4720(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4720(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4720(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4421(var79, var98 + var103, var110, var38.field3410, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4795(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4795(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4795(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4795(var93 + var103 - var50, var104);
                            }
                            var76.method4420(var82, var90 + var103, var107, var35.field3410 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4795(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4795(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4795(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4795(var97 + var103 - var62, var104);
                                }
                                var77.method4420(var79, var98 + var103, var110, var38.field3410 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.gq(I)V")
    public static final void method474() {
        field1137 = 0;
        int var0 = (Statics.field312.field1262 >> 7) + Statics.field608;
        int var1 = (Statics.field312.field1259 >> 7) + Statics.field587;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1137 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1137 = 1;
        }
        if (field1137 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1137 = 0;
        }
    }

    @ObfuscatedName("av.gu(Lcr;IB)V")
    public static final void method252(class79 arg0, int arg1) {
        method21(arg0.field1262, arg0.field1259, arg1);
    }

    @ObfuscatedName("l.gd(IIIB)V")
    public static final void method21(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1157 = -1;
            field1163 = -1;
            return;
        }
        int var3 = method184(arg0, arg1, Statics.field509) - arg2;
        int var4 = arg0 - Statics.field2433;
        int var5 = var3 - Statics.field472;
        int var6 = arg1 - Statics.field379;
        int var7 = class138.field2041[Statics.field633];
        int var8 = class138.field2030[Statics.field633];
        int var9 = class138.field2041[Statics.field607];
        int var10 = class138.field2030[Statics.field607];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1157 = field1011 * var11 / var15 + field1189 / 2;
            field1163 = field1011 * var14 / var15 + field1190 / 2;
        } else {
            field1157 = -1;
            field1163 = -1;
        }
    }

    @ObfuscatedName("d.gg(IIIB)I")
    public static final int method184(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field761[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field763[var5][var3][var4] + class62.field763[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field763[var5][var3][var4 + 1] + class62.field763[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("d.gj(ZI)V")
    public static final void method185(boolean arg0) {
        field998 = arg0;
        if (!field998) {
            int var1 = field956.method2938();
            int var2 = field956.method3058();
            int var3 = field956.method3023();
            Statics.field925 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field925[var4][var5] = field956.method2908();
                }
            }
            Statics.field2123 = new int[var3];
            Statics.field873 = new int[var3];
            Statics.field300 = new int[var3];
            Statics.field299 = new byte[var3][];
            Statics.field432 = new byte[var3][];
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
                        Statics.field2123[var7] = var10;
                        Statics.field873[var7] = Statics.field288.method3789("m" + var8 + "_" + var9);
                        Statics.field300[var7] = Statics.field288.method3789("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method139(var2, var1, true);
            return;
        }
        int var11 = field956.method2939();
        int var12 = field956.method2939();
        boolean var13 = field956.method2903() == 1;
        int var14 = field956.method3023();
        field956.method3160();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field956.method3142(1);
                    if (var18 == 1) {
                        field999[var15][var16][var17] = field956.method3142(26);
                    } else {
                        field999[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field956.method3143();
        Statics.field925 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field925[var19][var20] = field956.method2908();
            }
        }
        Statics.field2123 = new int[var14];
        Statics.field873 = new int[var14];
        Statics.field300 = new int[var14];
        Statics.field299 = new byte[var14][];
        Statics.field432 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field999[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field2123[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field2123[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field873[var21] = Statics.field288.method3789("m" + var30 + "_" + var31);
                            Statics.field300[var21] = Statics.field288.method3789("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method139(var12, var11, !var13);
    }

    @ObfuscatedName("y.gs(IIZI)V")
    public static final void method139(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field279 == arg0 && Statics.field1874 == arg1) {
            return;
        }
        Statics.field279 = arg0;
        Statics.field1874 = arg1;
        Statics.method953(25);
        method1566(class227.field2861, true);
        int var3 = Statics.field608;
        int var4 = Statics.field587;
        Statics.field608 = (arg0 - 6) * 8;
        Statics.field587 = (arg1 - 6) * 8;
        int var5 = Statics.field608 - var3;
        int var6 = Statics.field587 - var4;
        int var7 = Statics.field608;
        int var8 = Statics.field587;
        for (int var9 = 0; var9 < 32768; var9++) {
            class88 var10 = field973[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1228[var11] -= var5;
                    var10.field1234[var11] -= var6;
                }
                var10.field1262 -= var5 * 128;
                var10.field1259 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class76 var13 = field1046[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1228[var14] -= var5;
                    var13.field1234[var14] -= var6;
                }
                var13.field1262 -= var5 * 128;
                var13.field1259 -= var6 * 128;
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
                        field1056[var25][var21][var22] = field1056[var25][var23][var24];
                    } else {
                        field1056[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class78 var26 = (class78) field1057.method3326(); var26 != null; var26 = (class78) field1057.method3323()) {
            var26.field1208 -= var5;
            var26.field1209 -= var6;
            if (var26.field1208 < 0 || var26.field1209 < 0 || var26.field1208 >= 104 || var26.field1209 >= 104) {
                var26.method3314();
            }
        }
        if (field1143 != 0) {
            field1143 -= var5;
            field1160 -= var6;
        }
        field1167 = 0;
        field1173 = false;
        field1154 = -1;
        field1059.method3334();
        field1058.method3334();
        for (int var27 = 0; var27 < 4; var27++) {
            field997[var27].method2788();
        }
    }

    @ObfuscatedName("au.gr(ZI)V")
    public static final void method489(boolean arg0) {
        method3176();
        field984++;
        if (field984 < 50 && !arg0) {
            return;
        }
        field984 = 0;
        if (field989 || Statics.field2012 == null) {
            return;
        }
        field978.method3139(143);
        try {
            Statics.field2012.method2749(field978.field2390, 0, field978.field2394);
            field978.field2394 = 0;
        } catch (IOException var2) {
            field989 = true;
        }
    }

    @ObfuscatedName("ic.go(B)V")
    public static final void method4114() {
        method489(false);
        field992 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field299.length; var1++) {
            if (Statics.field873[var1] != -1 && Statics.field299[var1] == null) {
                Statics.field299[var1] = Statics.field288.method3773(Statics.field873[var1], 0);
                if (Statics.field299[var1] == null) {
                    var0 = false;
                    field992++;
                }
            }
            if (Statics.field300[var1] != -1 && Statics.field432[var1] == null) {
                Statics.field432[var1] = Statics.field288.method3774(Statics.field300[var1], 0, Statics.field925[var1]);
                if (Statics.field432[var1] == null) {
                    var0 = false;
                    field992++;
                }
            }
        }
        if (!var0) {
            field996 = 1;
            return;
        }
        field982 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field299.length; var3++) {
            byte[] var4 = Statics.field432[var3];
            if (var4 != null) {
                int var5 = (Statics.field2123[var3] >> 8) * 64 - Statics.field608;
                int var6 = (Statics.field2123[var3] & 0xFF) * 64 - Statics.field587;
                if (field998) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class62.method216(var4, var5, var6);
            }
        }
        if (!var2) {
            field996 = 2;
            return;
        }
        if (field996 != 0) {
            method1566(class227.field2861 + class90.field1403 + class90.field1399 + 100 + "%" + class90.field1400, true);
        }
        method3176();
        method4568();
        method3176();
        Statics.field512.method2479();
        method3176();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field997[var7].method2788();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class62.field761[var8][var9][var10] = 0;
                }
            }
        }
        method3176();
        class62.field762 = 99;
        Statics.field767 = new byte[4][104][104];
        Statics.field764 = new byte[4][104][104];
        Statics.field765 = new byte[4][104][104];
        Statics.field781 = new byte[4][104][104];
        Statics.field3260 = new int[4][105][105];
        Statics.field785 = new byte[4][105][105];
        Statics.field531 = new int[105][105];
        Statics.field769 = new int[104];
        Statics.field441 = new int[104];
        Statics.field457 = new int[104];
        Statics.field2326 = new int[104];
        Statics.field662 = new int[104];
        int var11 = Statics.field299.length;
        class83.method758();
        method489(true);
        if (!field998) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2123[var12] >> 8) * 64 - Statics.field608;
                int var14 = (Statics.field2123[var12] & 0xFF) * 64 - Statics.field587;
                byte[] var15 = Statics.field299[var12];
                if (var15 != null) {
                    method3176();
                    class62.method29(var15, var13, var14, Statics.field279 * 8 - 48, Statics.field1874 * 8 - 48, field997);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field2123[var16] >> 8) * 64 - Statics.field608;
                int var18 = (Statics.field2123[var16] & 0xFF) * 64 - Statics.field587;
                byte[] var19 = Statics.field299[var16];
                if (var19 == null && Statics.field1874 < 800) {
                    method3176();
                    class62.method43(var17, var18, 64, 64);
                }
            }
            method489(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field432[var20];
                if (var21 != null) {
                    int var22 = (Statics.field2123[var20] >> 8) * 64 - Statics.field608;
                    int var23 = (Statics.field2123[var20] & 0xFF) * 64 - Statics.field587;
                    method3176();
                    Statics.method2298(var21, var22, var23, Statics.field512, field997);
                }
            }
        }
        if (field998) {
            for (int var24 = 0; var24 < 4; var24++) {
                method3176();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field999[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field2123.length; var34++) {
                                if (Statics.field2123[var34] == var33 && Statics.field299[var34] != null) {
                                    class62.method158(Statics.field299[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, field997);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class62.method1486(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = field999[0][var35][var36];
                    if (var37 == -1) {
                        class62.method43(var35 * 8, var36 * 8, 8, 8);
                    }
                }
            }
            method489(true);
            for (int var38 = 0; var38 < 4; var38++) {
                method3176();
                for (int var39 = 0; var39 < 13; var39++) {
                    for (int var40 = 0; var40 < 13; var40++) {
                        int var41 = field999[var38][var39][var40];
                        if (var41 != -1) {
                            int var42 = var41 >> 24 & 0x3;
                            int var43 = var41 >> 1 & 0x3;
                            int var44 = var41 >> 14 & 0x3FF;
                            int var45 = var41 >> 3 & 0x7FF;
                            int var46 = (var44 / 8 << 8) + var45 / 8;
                            for (int var47 = 0; var47 < Statics.field2123.length; var47++) {
                                if (Statics.field2123[var47] == var46 && Statics.field432[var47] != null) {
                                    Statics.method4(Statics.field432[var47], var38, var39 * 8, var40 * 8, var42, (var44 & 0x7) * 8, (var45 & 0x7) * 8, var43, Statics.field512, field997);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method489(true);
        method4568();
        method3176();
        class62.method1390(Statics.field512, field997);
        method489(true);
        int var48 = class62.field762;
        if (var48 > Statics.field509) {
            var48 = Statics.field509;
        }
        if (var48 < Statics.field509 - 1) {
            int var49 = Statics.field509 - 1;
        }
        if (field939) {
            Statics.field512.method2480(class62.field762);
        } else {
            Statics.field512.method2480(0);
        }
        for (int var50 = 0; var50 < 104; var50++) {
            for (int var51 = 0; var51 < 104; var51++) {
                method3587(var50, var51);
            }
        }
        method3176();
        method499();
        class257.field3477.method3259();
        if (Statics.field408.method882()) {
            field978.method3139(86);
            field978.method2891(1057001181);
        }
        if (!field998) {
            int var52 = (Statics.field279 - 6) / 8;
            int var53 = (Statics.field279 + 6) / 8;
            int var54 = (Statics.field1874 - 6) / 8;
            int var55 = (Statics.field1874 + 6) / 8;
            for (int var56 = var52 - 1; var56 <= var53 + 1; var56++) {
                for (int var57 = var54 - 1; var57 <= var55 + 1; var57++) {
                    if (var56 < var52 || var56 > var53 || var57 < var54 || var57 > var55) {
                        Statics.field288.method3795("m" + var56 + "_" + var57);
                        Statics.field288.method3795("l" + var56 + "_" + var57);
                    }
                }
            }
        }
        Statics.method953(30);
        method3176();
        class62.method1575();
        field978.method3139(11);
        Statics.field700.method2686();
        for (int var58 = 0; var58 < 32; var58++) {
            field701[var58] = 0L;
        }
        for (int var59 = 0; var59 < 32; var59++) {
            field702[var59] = 0L;
        }
        Statics.field696 = 0;
    }

    @ObfuscatedName("cm.ga(II)V")
    public static final void method1485(int arg0) {
        int[] var1 = Statics.field3532.field3768;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field761[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field512.method2513(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field761[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field512.method2513(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field3532.method4715();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field761[arg0][var10][var9] & 0x18) == 0) {
                    method1010(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field761[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1010(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1155 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field512.method2508(Statics.field509, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class257.method483(var14).field3455;
                    if (var15 >= 0) {
                        field1114[field1155] = Statics.field3285[var15].method3953(false);
                        field936[field1155] = var11;
                        field947[field1155] = var12;
                        field1155++;
                    }
                }
            }
        }
        Statics.field2287.method4673();
    }

    @ObfuscatedName("bu.gi(IIIIIB)V")
    public static final void method1010(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field512.method2505(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field512.method2602(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field3532.field3768;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class257 var13 = class257.method483(var12);
            if (var13.field3456 == -1) {
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
                class286 var14 = Statics.field1002[var13.field3456];
                if (var14 != null) {
                    int var15 = (var13.field3442 * 4 - var14.field3762) / 2;
                    int var16 = (var13.field3443 * 4 - var14.field3765) / 2;
                    var14.method4681(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3443) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field512.method2507(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field512.method2602(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class257 var22 = class257.method483(var21);
            if (var22.field3456 != -1) {
                class286 var23 = Statics.field1002[var22.field3456];
                if (var23 != null) {
                    int var24 = (var22.field3442 * 4 - var23.field3762) / 2;
                    int var25 = (var22.field3443 * 4 - var23.field3765) / 2;
                    var23.method4681(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3443) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field3532.field3768;
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
        int var29 = Statics.field512.method2508(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class257 var31 = class257.method483(var30);
        if (var31.field3456 == -1) {
            return;
        }
        class286 var32 = Statics.field1002[var31.field3456];
        if (var32 != null) {
            int var33 = (var31.field3442 * 4 - var32.field3762) / 2;
            int var34 = (var31.field3443 * 4 - var32.field3765) / 2;
            var32.method4681(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3443) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.ge(B)Z")
    public final boolean method1246() {
        if (Statics.field2012 == null) {
            return false;
        }
        try {
            int var1 = Statics.field2012.method2747();
            if (var1 == 0) {
                return false;
            }
            if (field1040 == -1) {
                Statics.field2012.method2748(field956.field2390, 0, 1);
                field956.field2394 = 0;
                field1040 = field956.method3140();
                field981 = class274.field3684[field1040];
                var1--;
            }
            if (field981 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field2012.method2748(field956.field2390, 0, 1);
                field981 = field956.field2390[0] & 0xFF;
                var1--;
            }
            if (field981 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field2012.method2748(field956.field2390, 0, 2);
                field956.field2394 = 0;
                field981 = field956.method3023();
                var1 -= 2;
            }
            if (var1 < field981) {
                return false;
            }
            field956.field2394 = 0;
            Statics.field2012.method2748(field956.field2390, 0, field981);
            field983 = 0;
            field987 = field986;
            field986 = field985;
            field985 = field1040;
            if (field1040 == 135) {
                for (int var2 = 0; var2 < Statics.field2345; var2++) {
                    class243 var3 = class243.method2866(var2);
                    if (var3 != null) {
                        class213.field2606[var2] = 0;
                        class213.field2604[var2] = 0;
                    }
                }
                method2807();
                field962 += 32;
                field1040 = -1;
                return true;
            }
            if (field1040 == 101) {
                method2807();
                field971 = field956.method2903();
                field1124 = field1112;
                field1040 = -1;
                return true;
            }
            if (field1040 == 42) {
                int var4 = field956.method3023();
                byte var5 = field956.method3074();
                class213.field2606[var4] = var5;
                if (class213.field2604[var4] != var5) {
                    class213.field2604[var4] = var5;
                }
                method49(var4);
                field1079[++field962 - 1 & 0x1F] = var4;
                field1040 = -1;
                return true;
            }
            if (field1040 == 41) {
                String var6 = field956.method2911();
                long var7 = (long) field956.method3023();
                long var9 = (long) field956.method3070();
                class232[] var11 = new class232[] { class232.field3169, class232.field3170, class232.field3165, class232.field3168, class232.field3167, class232.field3166 };
                class232 var12 = (class232) class170.method3644(var11, field956.method2903());
                long var13 = (var7 << 32) + var9;
                boolean var15 = false;
                for (int var16 = 0; var16 < 100; var16++) {
                    if (field1146[var16] == var13) {
                        var15 = true;
                        break;
                    }
                }
                if (method217(var6)) {
                    var15 = true;
                }
                if (!var15 && field1137 == 0) {
                    field1146[field1109] = var13;
                    field1109 = (field1109 + 1) % 100;
                    String var17 = class266.method4419(class272.method3946(class267.method3760(field956)));
                    byte var18;
                    if (var12.field3172) {
                        var18 = 7;
                    } else {
                        var18 = 3;
                    }
                    if (var12.field3171 == -1) {
                        class100.method1553(var18, var6, var17);
                    } else {
                        class100.method1553(var18, Statics.method1570(var12.field3171) + var6, var17);
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 169) {
                int var19 = field956.method2938();
                class64.method695(var19);
                field1073[++field1116 - 1 & 0x1F] = var19 & 0x7FFF;
                field1040 = -1;
                return true;
            }
            if (field1040 == 82) {
                method2807();
                int var20 = field956.method2930();
                int var21 = field956.method2914();
                int var22 = field956.method2947();
                field934[var20] = var22;
                field1060[var20] = var21;
                field1138[var20] = 1;
                for (int var23 = 0; var23 < 98; var23++) {
                    if (var22 >= class224.field2836[var23]) {
                        field1138[var20] = var23 + 2;
                    }
                }
                field1117[++field1065 - 1 & 0x1F] = var20;
                field1040 = -1;
                return true;
            }
            if (field1040 == 208) {
                int var24 = field956.method3080();
                int var25 = field956.method3023();
                class218 var26 = class218.method1532(var24);
                if (var26 != null && var26.field2652 == 0) {
                    if (var25 > var26.field2674 - var26.field2666) {
                        var25 = var26.field2674 - var26.field2666;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (var26.field2672 != var25) {
                        var26.field2672 = var25;
                        method1576(var26);
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 223) {
                class98.method469();
                for (int var27 = 0; var27 < 2048; var27++) {
                    field1046[var27] = null;
                }
                class98.method2204(field956);
                field1040 = -1;
                return true;
            }
            if (field1040 == 17) {
                int var28 = field956.method2908();
                int var29 = field956.method3023();
                if (var28 < -70000) {
                    var29 += 32768;
                }
                class218 var30;
                if (var28 >= 0) {
                    var30 = class218.method1532(var28);
                } else {
                    var30 = null;
                }
                if (var30 != null) {
                    for (int var31 = 0; var31 < var30.field2650.length; var31++) {
                        var30.field2650[var31] = 0;
                        var30.field2727[var31] = 0;
                    }
                }
                class64.method3947(var29);
                int var32 = field956.method3023();
                for (int var33 = 0; var33 < var32; var33++) {
                    int var34 = field956.method2914();
                    if (var34 == 255) {
                        var34 = field956.method2948();
                    }
                    int var35 = field956.method3058();
                    if (var30 != null && var33 < var30.field2650.length) {
                        var30.field2650[var33] = var35;
                        var30.field2727[var33] = var34;
                    }
                    class64.method649(var29, var33, var35 - 1, var34);
                }
                if (var30 != null) {
                    method1576(var30);
                }
                method2807();
                field1073[++field1116 - 1 & 0x1F] = var29 & 0x7FFF;
                field1040 = -1;
                return true;
            }
            if (field1040 == 244) {
                int var36 = field956.method2938();
                int var37 = field956.method2908();
                class218 var38 = class218.method1532(var37);
                if (var38.field2693 != 2 || var38.field2713 != var36) {
                    var38.field2693 = 2;
                    var38.field2713 = var36;
                    method1576(var38);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 178) {
                int var39 = field956.method3013();
                boolean var40 = field956.method2903() == 1;
                String var41 = "";
                boolean var42 = false;
                if (var40) {
                    var41 = field956.method2911();
                    if (method217(var41)) {
                        var42 = true;
                    }
                }
                String var43 = field956.method2911();
                if (!var42) {
                    class100.method1553(var39, var41, var43);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 165) {
                int var44 = field981 + field956.field2394;
                int var45 = field956.method3023();
                int var46 = field956.method3023();
                if (field995 != var45) {
                    field995 = var45;
                    this.method1305(false);
                    method2818(field995);
                    class85.method3512(field995);
                    for (int var47 = 0; var47 < 100; var47++) {
                        field1113[var47] = true;
                    }
                }
                while (var46-- > 0) {
                    int var48 = field956.method2908();
                    int var49 = field956.method3023();
                    int var50 = field956.method2903();
                    class69 var51 = (class69) field1088.method3281((long) var48);
                    if (var51 != null && var51.field841 != var49) {
                        method116(var51, true);
                        var51 = null;
                    }
                    if (var51 == null) {
                        class69 var52 = new class69();
                        var52.field841 = var49;
                        var52.field839 = var50;
                        field1088.method3274(var52, (long) var48);
                        method2818(var49);
                        class218 var53 = class218.method1532(var48);
                        method1576(var53);
                        if (field1091 != null) {
                            method1576(field1091);
                            field1091 = null;
                        }
                        method1072();
                        method701(Statics.field2406[var48 >> 16], var53, false);
                        class85.method3512(var49);
                        if (field995 != -1) {
                            method1029(field995, 1);
                        }
                        var51 = var52;
                    }
                    var51.field842 = true;
                }
                for (class69 var55 = (class69) field1088.method3276(); var55 != null; var55 = (class69) field1088.method3277()) {
                    if (var55.field842) {
                        var55.field842 = false;
                    } else {
                        method116(var55, true);
                    }
                }
                field1129 = new class192(512);
                while (field956.field2394 < var44) {
                    int var56 = field956.method2908();
                    int var57 = field956.method3023();
                    int var58 = field956.method3023();
                    int var59 = field956.method2908();
                    for (int var60 = var57; var60 <= var58; var60++) {
                        long var61 = ((long) var56 << 32) + (long) var60;
                        field1129.method3274(new class200(var59), var61);
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 216) {
                field1143 = field956.method2903();
                if (field1143 == 255) {
                    field1143 = 0;
                }
                field1160 = field956.method2903();
                if (field1160 == 255) {
                    field1160 = 0;
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 187) {
                int var63 = field956.method3023();
                int var64 = field956.method2903();
                int var65 = field956.method3023();
                method5(var63, var64, var65);
                field1040 = -1;
                return true;
            }
            if (field1040 == 96) {
                Statics.field499 = field956.method2914();
                Statics.field1789 = field956.method2903();
                field1040 = -1;
                return true;
            }
            if (field1040 == 207) {
                while (field956.field2394 < field981) {
                    int var66 = field956.method2903();
                    boolean var67 = (var66 & 0x1) == 1;
                    String var68 = field956.method2911();
                    String var69 = field956.method2911();
                    field956.method2911();
                    for (int var70 = 0; var70 < field1196; var70++) {
                        class72 var71 = field1197[var70];
                        if (var67) {
                            if (var69.equals(var71.field874)) {
                                var71.field874 = var68;
                                var71.field869 = var69;
                                var68 = null;
                                break;
                            }
                        } else if (var68.equals(var71.field874)) {
                            var71.field874 = var68;
                            var71.field869 = var69;
                            var68 = null;
                            break;
                        }
                    }
                    if (var68 != null && field1196 < 400) {
                        class72 var72 = new class72();
                        field1197[field1196] = var72;
                        var72.field874 = var68;
                        var72.field869 = var69;
                        field1196++;
                    }
                }
                field1120 = field1112;
                field1040 = -1;
                return true;
            }
            if (field1040 == 74) {
                String var73 = field956.method2911();
                String var74 = class266.method4419(class272.method3946(class267.method3760(field956)));
                class100.method1553(6, var73, var74);
                field1040 = -1;
                return true;
            }
            if (field1040 == 249) {
                int var75 = field956.method2908();
                class218 var76 = class218.method1532(var75);
                for (int var77 = 0; var77 < var76.field2650.length; var77++) {
                    var76.field2650[var77] = -1;
                    var76.field2650[var77] = 0;
                }
                method1576(var76);
                field1040 = -1;
                return true;
            }
            if (field1040 == 14) {
                int var78 = field956.method2938();
                int var79 = field956.method3023();
                int var80 = field956.method2939();
                int var81 = field956.method2908();
                class218 var82 = class218.method1532(var81);
                if (var82.field2701 != var78 || var82.field2702 != var79 || var82.field2704 != var80) {
                    var82.field2701 = var78;
                    var82.field2702 = var79;
                    var82.field2704 = var80;
                    method1576(var82);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 112) {
                int var83 = field956.method3058();
                field995 = var83;
                this.method1305(false);
                method2818(var83);
                class85.method3512(field995);
                for (int var84 = 0; var84 < 100; var84++) {
                    field1113[var84] = true;
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 65) {
                field1161 = field956.method2903();
                field1040 = -1;
                return true;
            }
            if (field1040 == 109) {
                int var85 = field956.method2908();
                int var86 = field956.method2908();
                class69 var87 = (class69) field1088.method3281((long) var85);
                class69 var88 = (class69) field1088.method3281((long) var86);
                if (var88 != null) {
                    method116(var88, var87 == null || var87.field841 != var88.field841);
                }
                if (var87 != null) {
                    var87.method3314();
                    field1088.method3274(var87, (long) var86);
                }
                class218 var89 = class218.method1532(var85);
                if (var89 != null) {
                    method1576(var89);
                }
                class218 var90 = class218.method1532(var86);
                if (var90 != null) {
                    method1576(var90);
                    method701(Statics.field2406[var90.field2723 >>> 16], var90, true);
                }
                if (field995 != -1) {
                    method1029(field995, 1);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 107) {
                int var91 = field956.method2908();
                int var92 = field956.method3023();
                if (var91 < -70000) {
                    var92 += 32768;
                }
                class218 var93;
                if (var91 >= 0) {
                    var93 = class218.method1532(var91);
                } else {
                    var93 = null;
                }
                while (field956.field2394 < field981) {
                    int var94 = field956.method3013();
                    int var95 = field956.method3023();
                    int var96 = 0;
                    if (var95 != 0) {
                        var96 = field956.method2903();
                        if (var96 == 255) {
                            var96 = field956.method2908();
                        }
                    }
                    if (var93 != null && var94 >= 0 && var94 < var93.field2650.length) {
                        var93.field2650[var94] = var95;
                        var93.field2727[var94] = var96;
                    }
                    class64.method649(var92, var94, var95 - 1, var96);
                }
                if (var93 != null) {
                    method1576(var93);
                }
                method2807();
                field1073[++field1116 - 1 & 0x1F] = var92 & 0x7FFF;
                field1040 = -1;
                return true;
            }
            if (field1040 == 200) {
                String var97 = field956.method2911();
                int var98 = field956.method2908();
                class218 var99 = class218.method1532(var98);
                if (!var97.equals(var99.field2710)) {
                    var99.field2710 = var97;
                    method1576(var99);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 25) {
                method2807();
                field1039 = field956.method3077();
                field1124 = field1112;
                field1040 = -1;
                return true;
            }
            if (field1040 == 242) {
                int var100 = field956.method3080();
                int var101 = field956.method3058();
                class213.field2606[var101] = var100;
                if (class213.field2604[var101] != var100) {
                    class213.field2604[var101] = var100;
                }
                method49(var101);
                field1079[++field962 - 1 & 0x1F] = var101;
                field1040 = -1;
                return true;
            }
            if (field1040 == 217) {
                String var102 = field956.method2911();
                Statics.field1042 = var102;
                try {
                    String var103 = Statics.field408.getParameter(class276.field3713.field3703);
                    String var104 = Statics.field408.getParameter(class276.field3716.field3703);
                    String var105 = var103 + "settings=" + var102 + "; version=1; path=/; domain=" + var104;
                    String var106;
                    if (var102.length() == 0) {
                        var106 = var105 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var106 = var105 + "; Expires=" + class184.method2743(class177.method1067() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    client var107 = Statics.field408;
                    String var108 = "document.cookie=\"" + var106 + "\"";
                    JSObject.getWindow(var107).eval(var108);
                } catch (Throwable var267) {
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 4) {
                for (int var110 = 0; var110 < class213.field2604.length; var110++) {
                    if (class213.field2606[var110] != class213.field2604[var110]) {
                        class213.field2604[var110] = class213.field2606[var110];
                        method49(var110);
                        field1079[++field962 - 1 & 0x1F] = var110;
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 239) {
                int var111 = field956.method3023();
                if (var111 == 65535) {
                    var111 = -1;
                }
                if (var111 == -1 && !field1164) {
                    Statics.field2502.method3460();
                    class205.field2508 = 1;
                    Statics.field2503 = null;
                } else if (var111 != -1 && field1096 != var111 && field1025 != 0 && !field1164) {
                    class239 var112 = Statics.field3387;
                    int var113 = field1025;
                    class205.field2508 = 1;
                    Statics.field2503 = var112;
                    Statics.field2206 = var111;
                    Statics.field2223 = 0;
                    Statics.field2505 = var113;
                    Statics.field1533 = false;
                    Statics.field2506 = 2;
                }
                field1096 = var111;
                field1040 = -1;
                return true;
            }
            if (field1040 == 83) {
                int var114 = field956.method3066();
                int var115 = field956.method3023();
                if (var115 == 65535) {
                    var115 = -1;
                }
                if (field1025 != 0 && var115 != -1) {
                    class205.method1033(Statics.field2366, var115, 0, field1025, false);
                    field1164 = true;
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 56) {
                for (int var116 = 0; var116 < field1046.length; var116++) {
                    if (field1046[var116] != null) {
                        field1046[var116].field1251 = -1;
                    }
                }
                for (int var117 = 0; var117 < field973.length; var117++) {
                    if (field973[var117] != null) {
                        field973[var117].field1251 = -1;
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 78) {
                field1173 = false;
                for (int var118 = 0; var118 < 5; var118++) {
                    field1001[var118] = false;
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 127) {
                method185(true);
                field956.method3140();
                int var119 = field956.method3023();
                class98.method1041(field956, var119);
                field1040 = -1;
                return true;
            }
            if (field1040 == 254) {
                int var120 = field956.method2903();
                if (field956.method2903() == 0) {
                    field1126[var120] = new class17();
                    field956.field2394 += 18;
                } else {
                    field956.field2394--;
                    field1126[var120] = new class17(field956, false);
                }
                field1122 = field1112;
                field1040 = -1;
                return true;
            }
            if (field1040 == 80) {
                field974 = field1112;
                if (field981 == 0) {
                    field1152 = null;
                    field980 = null;
                    Statics.field1321 = 0;
                    Statics.field426 = null;
                    field1040 = -1;
                    return true;
                }
                field980 = field956.method2911();
                long var121 = field956.method2973();
                field1152 = class270.method3673(var121);
                Statics.field729 = field956.method2980();
                int var123 = field956.method2903();
                if (var123 == 255) {
                    field1040 = -1;
                    return true;
                }
                Statics.field1321 = var123;
                class77[] var124 = new class77[100];
                for (int var125 = 0; var125 < Statics.field1321; var125++) {
                    var124[var125] = new class77();
                    var124[var125].field927 = field956.method2911();
                    var124[var125].field928 = class269.method4043(var124[var125].field927, Statics.field355);
                    var124[var125].field929 = field956.method3023();
                    var124[var125].field933 = field956.method2980();
                    field956.method2911();
                    if (var124[var125].field927.equals(Statics.field312.field915)) {
                        Statics.field1355 = var124[var125].field933;
                    }
                }
                boolean var126 = false;
                int var127 = Statics.field1321;
                while (var127 > 0) {
                    boolean var128 = true;
                    var127--;
                    for (int var129 = 0; var129 < var127; var129++) {
                        if (var124[var129].field928.compareTo(var124[var129 + 1].field928) > 0) {
                            class77 var130 = var124[var129];
                            var124[var129] = var124[var129 + 1];
                            var124[var129 + 1] = var130;
                            var128 = false;
                        }
                    }
                    if (var128) {
                        break;
                    }
                }
                Statics.field426 = var124;
                field1040 = -1;
                return true;
            }
            if (field1040 == 129) {
                int var131 = field956.method2903();
                class278[] var132 = new class278[] { class278.field3721, class278.field3720, class278.field3723 };
                class278[] var133 = var132;
                int var134 = 0;
                class278 var136;
                while (true) {
                    if (var134 >= var133.length) {
                        var136 = null;
                        break;
                    }
                    class278 var135 = var133[var134];
                    if (var135.field3722 == var131) {
                        var136 = var135;
                        break;
                    }
                    var134++;
                }
                Statics.field1489 = var136;
                field1040 = -1;
                return true;
            }
            if (field1040 == 179) {
                int var137 = field956.method2908();
                class69 var138 = (class69) field1088.method3281((long) var137);
                if (var138 != null) {
                    method116(var138, true);
                }
                if (field1091 != null) {
                    method1576(field1091);
                    field1091 = null;
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 60) {
                int var139 = field956.method2947();
                int var140 = field956.method3058();
                if (var140 == 65535) {
                    var140 = -1;
                }
                int var141 = field956.method2908();
                class218 var142 = class218.method1532(var141);
                if (var142.field2756) {
                    var142.field2694 = var140;
                    var142.field2758 = var139;
                    class258 var144 = class258.method1923(var140);
                    var142.field2701 = var144.field3492;
                    var142.field2702 = var144.field3483;
                    var142.field2703 = var144.field3495;
                    var142.field2699 = var144.field3496;
                    var142.field2700 = var144.field3488;
                    var142.field2704 = var144.field3511;
                    if (var144.field3498 == 1) {
                        var142.field2708 = 1;
                    } else {
                        var142.field2708 = 2;
                    }
                    if (var142.field2705 > 0) {
                        var142.field2704 = var142.field2704 * 32 / var142.field2705;
                    } else if (var142.field2661 > 0) {
                        var142.field2704 = var142.field2704 * 32 / var142.field2661;
                    }
                    method1576(var142);
                } else if (var140 == -1) {
                    var142.field2693 = 0;
                    field1040 = -1;
                    return true;
                } else {
                    class258 var143 = class258.method1923(var140);
                    var142.field2693 = 4;
                    var142.field2713 = var140;
                    var142.field2701 = var143.field3492;
                    var142.field2702 = var143.field3483;
                    var142.field2704 = var143.field3511 * 100 / var139;
                    method1576(var142);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 191) {
                int var145 = field956.method2938();
                int var146 = field956.method3080();
                int var147 = var145 >> 10 & 0x1F;
                int var148 = var145 >> 5 & 0x1F;
                int var149 = var145 & 0x1F;
                int var150 = (var149 << 3) + (var147 << 19) + (var148 << 11);
                class218 var151 = class218.method1532(var146);
                if (var151.field2675 != var150) {
                    var151.field2675 = var150;
                    method1576(var151);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 176) {
                int var152 = field956.method2898();
                int var153 = field956.method2908();
                int var154 = field956.method2939();
                class69 var155 = (class69) field1088.method3281((long) var153);
                if (var155 != null) {
                    method116(var155, var155.field841 != var154);
                }
                class69 var156 = new class69();
                var156.field841 = var154;
                var156.field839 = var152;
                field1088.method3274(var156, (long) var153);
                method2818(var154);
                class218 var157 = class218.method1532(var153);
                method1576(var157);
                if (field1091 != null) {
                    method1576(field1091);
                    field1091 = null;
                }
                method1072();
                method701(Statics.field2406[var153 >> 16], var157, false);
                class85.method3512(var154);
                if (field995 != -1) {
                    method1029(field995, 1);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 18) {
                class282.method6(field956, field981);
                field1040 = -1;
                return true;
            }
            if (field1040 == 219) {
                int var158 = field956.method2938();
                int var159 = field956.method2948();
                class218 var160 = class218.method1532(var159);
                if (var160.field2693 != 1 || var160.field2713 != var158) {
                    var160.field2693 = 1;
                    var160.field2713 = var158;
                    method1576(var160);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 12) {
                int var161 = field956.method3096();
                int var162 = field956.method2948();
                int var163 = field956.method2941();
                class218 var164 = class218.method1532(var162);
                if (var164.field2659 != var161 || var164.field2660 != var163 || var164.field2655 != 0 || var164.field2735 != 0) {
                    var164.field2659 = var161;
                    var164.field2660 = var163;
                    var164.field2655 = 0;
                    var164.field2735 = 0;
                    method1576(var164);
                    this.method1112(var164);
                    if (var164.field2652 == 0) {
                        method701(Statics.field2406[var162 >> 16], var164, false);
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 253) {
                int var165 = field956.method2948();
                Statics.field851 = Statics.field722.method2708(var165);
                field1040 = -1;
                return true;
            }
            if (field1040 == 52) {
                int var166 = field956.method2947();
                int var167 = field956.method2939();
                int var168 = field956.method3058();
                class218 var169 = class218.method1532(var166);
                var169.field2706 = (var167 << 16) + var168;
                field1040 = -1;
                return true;
            }
            if (field1040 == 68) {
                int var170 = field956.method2947();
                class218 var171 = class218.method1532(var170);
                var171.field2693 = 3;
                var171.field2713 = Statics.field312.field898.method3646();
                method1576(var171);
                field1040 = -1;
                return true;
            }
            if (field1040 == 241) {
                field952 = field956.method2903();
                if (field952 == 1) {
                    field953 = field956.method3023();
                }
                if (field952 >= 2 && field952 <= 6) {
                    if (field952 == 2) {
                        field1033 = 64;
                        field1162 = 64;
                    }
                    if (field952 == 3) {
                        field1033 = 0;
                        field1162 = 64;
                    }
                    if (field952 == 4) {
                        field1033 = 128;
                        field1162 = 64;
                    }
                    if (field952 == 5) {
                        field1033 = 64;
                        field1162 = 0;
                    }
                    if (field952 == 6) {
                        field1033 = 64;
                        field1162 = 128;
                    }
                    field952 = 2;
                    field955 = field956.method3023();
                    field1198 = field956.method3023();
                    field957 = field956.method2903();
                }
                if (field952 == 10) {
                    field954 = field956.method3023();
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 87) {
                field1173 = true;
                Statics.field351 = field956.method2903();
                Statics.field2271 = field956.method2903();
                Statics.field1699 = field956.method3023();
                Statics.field345 = field956.method2903();
                Statics.field658 = field956.method2903();
                if (Statics.field658 >= 100) {
                    int var172 = Statics.field351 * 128 + 64;
                    int var173 = Statics.field2271 * 128 + 64;
                    int var174 = method184(var172, var173, Statics.field509) - Statics.field1699;
                    int var175 = var172 - Statics.field2433;
                    int var176 = var174 - Statics.field472;
                    int var177 = var173 - Statics.field379;
                    int var178 = (int) Math.sqrt((double) (var175 * var175 + var177 * var177));
                    Statics.field633 = (int) (Math.atan2((double) var176, (double) var178) * 325.949D) & 0x7FF;
                    Statics.field607 = (int) (Math.atan2((double) var175, (double) var177) * -325.949D) & 0x7FF;
                    if (Statics.field633 < 128) {
                        Statics.field633 = 128;
                    }
                    if (Statics.field633 > 383) {
                        Statics.field633 = 383;
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 164) {
                field951 = field956.method2939() * 30;
                field1124 = field1112;
                field1040 = -1;
                return true;
            }
            if (field1040 == 31) {
                field1098 = field956.method2903();
                field1192 = field956.method2903();
                field1040 = -1;
                return true;
            }
            if (field1040 == 24) {
                String var179 = field956.method2911();
                long var180 = field956.method2973();
                long var182 = (long) field956.method3023();
                long var184 = (long) field956.method3070();
                class232[] var186 = new class232[] { class232.field3169, class232.field3170, class232.field3165, class232.field3168, class232.field3167, class232.field3166 };
                class232 var187 = (class232) class170.method3644(var186, field956.method2903());
                long var188 = (var182 << 32) + var184;
                boolean var190 = false;
                for (int var191 = 0; var191 < 100; var191++) {
                    if (field1146[var191] == var188) {
                        var190 = true;
                        break;
                    }
                }
                if (var187.field3173 && method217(var179)) {
                    var190 = true;
                }
                if (!var190 && field1137 == 0) {
                    field1146[field1109] = var188;
                    field1109 = (field1109 + 1) % 100;
                    String var192 = class266.method4419(class272.method3946(class267.method3760(field956)));
                    if (var187.field3171 == -1) {
                        class100.method465(9, var179, var192, class270.method170(var180));
                    } else {
                        class100.method465(9, Statics.method1570(var187.field3171) + var179, var192, class270.method170(var180));
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 51) {
                class98.method1041(field956, field981);
                field1040 = -1;
                return true;
            }
            if (field1040 == 237) {
                String var193 = field956.method2911();
                Object[] var194 = new Object[var193.length() + 1];
                for (int var195 = var193.length() - 1; var195 >= 0; var195--) {
                    if (var193.charAt(var195) == 's') {
                        var194[var195 + 1] = field956.method2911();
                    } else {
                        var194[var195 + 1] = Integer.valueOf(field956.method2908());
                    }
                }
                var194[0] = Integer.valueOf(field956.method2908());
                class71 var196 = new class71();
                var196.field857 = var194;
                class85.method3622(var196);
                field1040 = -1;
                return true;
            }
            if (field1040 == 167) {
                String var197 = field956.method2911();
                int var198 = field956.method3023();
                byte var199 = field956.method2980();
                boolean var200 = false;
                if (var199 == -128) {
                    var200 = true;
                }
                if (var200) {
                    if (Statics.field1321 == 0) {
                        field1040 = -1;
                        return true;
                    }
                    boolean var201 = false;
                    int var202;
                    for (var202 = 0; var202 < Statics.field1321 && (!Statics.field426[var202].field927.equals(var197) || Statics.field426[var202].field929 != var198); var202++) {
                    }
                    if (var202 < Statics.field1321) {
                        while (var202 < Statics.field1321 - 1) {
                            Statics.field426[var202] = Statics.field426[var202 + 1];
                            var202++;
                        }
                        Statics.field1321--;
                        Statics.field426[Statics.field1321] = null;
                    }
                } else {
                    field956.method2911();
                    class77 var203 = new class77();
                    var203.field927 = var197;
                    var203.field928 = class269.method4043(var203.field927, Statics.field355);
                    var203.field929 = var198;
                    var203.field933 = var199;
                    int var204;
                    for (var204 = Statics.field1321 - 1; var204 >= 0; var204--) {
                        int var205 = Statics.field426[var204].field928.compareTo(var203.field928);
                        if (var205 == 0) {
                            Statics.field426[var204].field929 = var198;
                            Statics.field426[var204].field933 = var199;
                            if (var197.equals(Statics.field312.field915)) {
                                Statics.field1355 = var199;
                            }
                            field974 = field1112;
                            field1040 = -1;
                            return true;
                        }
                        if (var205 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1321 >= Statics.field426.length) {
                        field1040 = -1;
                        return true;
                    }
                    for (int var206 = Statics.field1321 - 1; var206 > var204; var206--) {
                        Statics.field426[var206 + 1] = Statics.field426[var206];
                    }
                    if (Statics.field1321 == 0) {
                        Statics.field426 = new class77[100];
                    }
                    Statics.field426[var204 + 1] = var203;
                    Statics.field1321++;
                    if (var197.equals(Statics.field312.field915)) {
                        Statics.field1355 = var199;
                    }
                }
                field974 = field1112;
                field1040 = -1;
                return true;
            }
            if (field1040 == 139) {
                field1173 = true;
                Statics.field14 = field956.method2903();
                Statics.field749 = field956.method2903();
                Statics.field916 = field956.method3023();
                Statics.field803 = field956.method2903();
                Statics.field238 = field956.method2903();
                if (Statics.field238 >= 100) {
                    Statics.field2433 = Statics.field14 * 128 + 64;
                    Statics.field379 = Statics.field749 * 128 + 64;
                    Statics.field472 = method184(Statics.field2433, Statics.field379, Statics.field509) - Statics.field916;
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 198) {
                Statics.field1789 = field956.method2898();
                Statics.field499 = field956.method2898();
                while (field956.field2394 < field981) {
                    field1040 = field956.method2903();
                    method3882();
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 75) {
                class81 var207 = new class81();
                var207.field1297 = field956.method2911();
                var207.field1304 = field956.method3023();
                int var208 = field956.method2908();
                var207.field1302 = var208;
                Statics.method953(45);
                Statics.field2012.method2745();
                Statics.field2012 = null;
                class94.method1921(var207);
                field1040 = -1;
                return false;
            }
            if (field1040 == 102) {
                Statics.field1789 = field956.method2898();
                Statics.field499 = field956.method2914();
                for (int var209 = Statics.field1789; var209 < Statics.field1789 + 8; var209++) {
                    for (int var210 = Statics.field499; var210 < Statics.field499 + 8; var210++) {
                        if (field1056[Statics.field509][var209][var210] != null) {
                            field1056[Statics.field509][var209][var210] = null;
                            method3587(var209, var210);
                        }
                    }
                }
                for (class78 var211 = (class78) field1057.method3326(); var211 != null; var211 = (class78) field1057.method3323()) {
                    if (var211.field1208 >= Statics.field1789 && var211.field1208 < Statics.field1789 + 8 && var211.field1209 >= Statics.field499 && var211.field1209 < Statics.field499 + 8 && Statics.field509 == var211.field1213) {
                        var211.field1217 = 0;
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 8) {
                method1561(false);
                field1040 = -1;
                return true;
            }
            if (field1040 == 140) {
                int var212 = field956.method2908();
                boolean var213 = field956.method2914() == 1;
                class218 var214 = class218.method1532(var212);
                if (var214.field2670 != var213) {
                    var214.field2670 = var213;
                    method1576(var214);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 58) {
                if (field995 != -1) {
                    method1029(field995, 0);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 98) {
                field956.field2394 += 28;
                if (field956.method2915()) {
                    class181 var215 = field956;
                    int var216 = field956.field2394 - 28;
                    method2297(var215.field2390, var216);
                    if (class157.field2250 != null) {
                        try {
                            class157.field2250.method2133(0L);
                            class157.field2250.method2137(var215.field2390, var216, 24);
                        } catch (Exception var266) {
                        }
                    }
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 177) {
                int var218 = field956.method2903();
                int var219 = field956.method2898();
                String var220 = field956.method2911();
                if (var219 >= 1 && var219 <= 8) {
                    if (var220.equalsIgnoreCase("null")) {
                        var220 = null;
                    }
                    field1052[var219 - 1] = var220;
                    field1053[var219 - 1] = var218 == 0;
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 104) {
                method185(false);
                field956.method3140();
                int var221 = field956.method3023();
                class98.method1041(field956, var221);
                field1040 = -1;
                return true;
            }
            if (field1040 == 77) {
                int var222 = field956.method3080();
                int var223 = field956.method3096();
                class218 var224 = class218.method1532(var222);
                if (var224.field2776 != var223 || var223 == -1) {
                    var224.field2776 = var223;
                    var224.field2772 = 0;
                    var224.field2748 = 0;
                    method1576(var224);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 5) {
                method335();
                field1040 = -1;
                return false;
            }
            if (field1040 == 130) {
                method1561(true);
                field1040 = -1;
                return true;
            }
            if (field1040 == 172) {
                boolean var225 = field956.method2903() == 1;
                if (var225) {
                    Statics.field430 = class177.method1067() - field956.method2973();
                    Statics.field780 = new class14(field956, true);
                } else {
                    Statics.field780 = null;
                }
                field950 = field1112;
                field1040 = -1;
                return true;
            }
            if (field1040 == 114) {
                int var226 = field956.method2903();
                int var227 = field956.method2903();
                int var228 = field956.method2903();
                int var229 = field956.method2903();
                field1001[var226] = true;
                field1175[var226] = var227;
                field1176[var226] = var228;
                field1177[var226] = var229;
                field1178[var226] = 0;
                field1040 = -1;
                return true;
            }
            if (field1040 == 247) {
                field1193 = 1;
                field1120 = field1112;
                field1040 = -1;
                return true;
            }
            if (field1040 == 22) {
                int var230 = field956.method2908();
                int var231 = field956.method3058();
                if (var231 == 65535) {
                    var231 = -1;
                }
                int var232 = field956.method2939();
                if (var232 == 65535) {
                    var232 = -1;
                }
                int var233 = field956.method2948();
                for (int var234 = var231; var234 <= var232; var234++) {
                    long var235 = ((long) var233 << 32) + (long) var234;
                    class194 var237 = field1129.method3281(var235);
                    if (var237 != null) {
                        var237.method3314();
                    }
                    field1129.method3274(new class200(var230), var235);
                }
                field1040 = -1;
                return true;
            }
            if (field1040 == 71) {
                int var238 = field956.method2908();
                int var239 = field956.method2908();
                int var240 = class59.method73();
                field978.method3139(40);
                field978.method2944(var238);
                field978.method2944(var239);
                field978.method2991(field699);
                field978.method2927(var240);
                field1040 = -1;
                return true;
            }
            if (field1040 == 92 || field1040 == 115 || field1040 == 73 || field1040 == 156 || field1040 == 13 || field1040 == 79 || field1040 == 212 || field1040 == 131 || field1040 == 113 || field1040 == 231) {
                method3882();
                field1040 = -1;
                return true;
            }
            if (field1040 == 62) {
                while (field956.field2394 < field981) {
                    boolean var241 = field956.method2903() == 1;
                    String var242 = field956.method2911();
                    String var243 = field956.method2911();
                    int var244 = field956.method3023();
                    int var245 = field956.method2903();
                    int var246 = field956.method2903();
                    boolean var247 = (var246 & 0x2) != 0;
                    boolean var248 = (var246 & 0x1) != 0;
                    if (var244 > 0) {
                        field956.method2911();
                        field956.method2903();
                        field956.method2908();
                    }
                    field956.method2911();
                    for (int var249 = 0; var249 < field1172; var249++) {
                        class66 var250 = field1194[var249];
                        if (var241) {
                            if (var243.equals(var250.field817)) {
                                var250.field817 = var242;
                                var250.field816 = var243;
                                var242 = null;
                                break;
                            }
                        } else if (var242.equals(var250.field817)) {
                            if (var250.field815 != var244) {
                                boolean var251 = true;
                                for (class68 var252 = (class68) field1195.method3352(); var252 != null; var252 = (class68) field1195.method3360()) {
                                    if (var252.field834.equals(var242)) {
                                        if (var244 != 0 && var252.field837 == 0) {
                                            var252.method3362();
                                            var251 = false;
                                        } else if (var244 == 0 && var252.field837 != 0) {
                                            var252.method3362();
                                            var251 = false;
                                        }
                                    }
                                }
                                if (var251) {
                                    field1195.method3354(new class68(var242, var244));
                                }
                                var250.field815 = var244;
                            }
                            var250.field816 = var243;
                            var250.field818 = var245;
                            var250.field819 = var247;
                            var250.field820 = var248;
                            var242 = null;
                            break;
                        }
                    }
                    if (var242 != null && field1172 < 400) {
                        class66 var253 = new class66();
                        field1194[field1172] = var253;
                        var253.field817 = var242;
                        var253.field816 = var243;
                        var253.field815 = var244;
                        var253.field818 = var245;
                        var253.field819 = var247;
                        var253.field820 = var248;
                        field1172++;
                    }
                }
                field1193 = 2;
                field1120 = field1112;
                boolean var254 = false;
                int var255 = field1172;
                while (var255 > 0) {
                    boolean var256 = true;
                    var255--;
                    for (int var257 = 0; var257 < var255; var257++) {
                        boolean var258 = false;
                        class66 var259 = field1194[var257];
                        class66 var260 = field1194[var257 + 1];
                        if (field935 != var259.field815 && field935 == var260.field815) {
                            var258 = true;
                        }
                        if (!var258 && var259.field815 == 0 && var260.field815 != 0) {
                            var258 = true;
                        }
                        if (!var258 && !var259.field819 && var260.field819) {
                            var258 = true;
                        }
                        if (!var258 && !var259.field820 && var260.field820) {
                            var258 = true;
                        }
                        if (var258) {
                            class66 var261 = field1194[var257];
                            field1194[var257] = field1194[var257 + 1];
                            field1194[var257 + 1] = var261;
                            var256 = false;
                        }
                    }
                    if (var256) {
                        break;
                    }
                }
                field1040 = -1;
                return true;
            }
            Statics.method1698("" + field1040 + class90.field1397 + field986 + class90.field1397 + field987 + class90.field1397 + field981, (Throwable) null);
            method335();
        } catch (IOException var268) {
            if (field988 > 0) {
                method335();
            } else {
                Statics.method953(40);
                Statics.field338 = Statics.field2012;
                Statics.field2012 = null;
            }
        } catch (Exception var269) {
            String var264 = "" + field1040 + class90.field1397 + field986 + class90.field1397 + field987 + class90.field1397 + field981 + class90.field1397 + (Statics.field608 + Statics.field312.field1228[0]) + class90.field1397 + (Statics.field587 + Statics.field312.field1234[0]) + class90.field1397;
            for (int var265 = 0; var265 < field981 && var265 < 50; var265++) {
                var264 = var264 + field956.field2390[var265] + class90.field1397;
            }
            Statics.method1698(var264, var269);
            method335();
        }
        return true;
    }

    @ObfuscatedName("io.gp(I)V")
    public static final void method3882() {
        if (field1040 == 113) {
            int var0 = field956.method2898();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1789;
            int var2 = (var0 & 0x7) + Statics.field499;
            int var3 = field956.method2903();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field1000[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method4140(Statics.field509, var1, var2, var6, -1, var4, var5, 0, -1);
            }
        } else if (field1040 == 13) {
            int var7 = field956.method2903();
            int var8 = (var7 >> 4 & 0x7) + Statics.field1789;
            int var9 = (var7 & 0x7) + Statics.field499;
            int var10 = var8 + field956.method2980();
            int var11 = var9 + field956.method2980();
            int var12 = field956.method3077();
            int var13 = field956.method3023();
            int var14 = field956.method2903() * 4;
            int var15 = field956.method2903() * 4;
            int var16 = field956.method3023();
            int var17 = field956.method3023();
            int var18 = field956.method2903();
            int var19 = field956.method2903();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var13 != 65535) {
                int var20 = var8 * 128 + 64;
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                int var23 = var11 * 128 + 64;
                class95 var24 = new class95(var13, Statics.field509, var20, var21, method184(var20, var21, Statics.field509) - var14, field944 + var16, field944 + var17, var18, var19, var12, var15);
                var24.method1617(var22, var23, method184(var22, var23, Statics.field509) - var15, field944 + var16);
                field1058.method3317(var24);
            }
        } else {
            if (field1040 == 92) {
                int var25 = field956.method2903();
                int var26 = (var25 >> 4 & 0x7) + Statics.field1789;
                int var27 = (var25 & 0x7) + Statics.field499;
                int var28 = field956.method3023();
                int var29 = field956.method2903();
                int var30 = var29 >> 4 & 0xF;
                int var31 = var29 & 0x7;
                int var32 = field956.method2903();
                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                    int var33 = var30 + 1;
                    if (Statics.field312.field1228[0] >= var26 - var33 && Statics.field312.field1228[0] <= var26 + var33 && Statics.field312.field1234[0] >= var27 - var33 && Statics.field312.field1234[0] <= var27 + var33 && field1149 != 0 && var31 > 0 && field1167 < 50) {
                        field1168[field1167] = var28;
                        field1169[field1167] = var31;
                        field1170[field1167] = var32;
                        field938[field1167] = null;
                        field1171[field1167] = (var26 << 16) + (var27 << 8) + var30;
                        field1167++;
                    }
                }
            }
            if (field1040 == 79) {
                int var34 = field956.method2914();
                int var35 = (var34 >> 4 & 0x7) + Statics.field1789;
                int var36 = (var34 & 0x7) + Statics.field499;
                int var37 = field956.method2938();
                if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                    class195 var38 = field1056[Statics.field509][var35][var36];
                    if (var38 != null) {
                        for (class96 var39 = (class96) var38.method3326(); var39 != null; var39 = (class96) var38.method3323()) {
                            if ((var37 & 0x7FFF) == var39.field1497) {
                                var39.method3314();
                                break;
                            }
                        }
                        if (var38.method3326() == null) {
                            field1056[Statics.field509][var35][var36] = null;
                        }
                        method3587(var35, var36);
                    }
                }
            } else if (field1040 == 131) {
                int var40 = field956.method3058();
                int var41 = field956.method2903();
                int var42 = var41 >> 2;
                int var43 = var41 & 0x3;
                int var44 = field1000[var42];
                int var45 = field956.method2914();
                int var46 = (var45 >> 4 & 0x7) + Statics.field1789;
                int var47 = (var45 & 0x7) + Statics.field499;
                if (var46 >= 0 && var47 >= 0 && var46 < 103 && var47 < 103) {
                    if (var44 == 0) {
                        class144 var48 = Statics.field512.method2571(Statics.field509, var46, var47);
                        if (var48 != null) {
                            int var49 = var48.field2138 >> 14 & 0x7FFF;
                            if (var42 == 2) {
                                var48.field2136 = new class102(var49, 2, var43 + 4, Statics.field509, var46, var47, var40, false, var48.field2136);
                                var48.field2137 = new class102(var49, 2, var43 + 1 & 0x3, Statics.field509, var46, var47, var40, false, var48.field2137);
                            } else {
                                var48.field2136 = new class102(var49, var42, var43, Statics.field509, var46, var47, var40, false, var48.field2136);
                            }
                        }
                    }
                    if (var44 == 1) {
                        class149 var50 = Statics.field512.method2572(Statics.field509, var46, var47);
                        if (var50 != null) {
                            int var51 = var50.field2183 >> 14 & 0x7FFF;
                            if (var42 == 4 || var42 == 5) {
                                var50.field2181 = new class102(var51, 4, var43, Statics.field509, var46, var47, var40, false, var50.field2181);
                            } else if (var42 == 6) {
                                var50.field2181 = new class102(var51, 4, var43 + 4, Statics.field509, var46, var47, var40, false, var50.field2181);
                            } else if (var42 == 7) {
                                var50.field2181 = new class102(var51, 4, (var43 + 2 & 0x3) + 4, Statics.field509, var46, var47, var40, false, var50.field2181);
                            } else if (var42 == 8) {
                                var50.field2181 = new class102(var51, 4, var43 + 4, Statics.field509, var46, var47, var40, false, var50.field2181);
                                var50.field2179 = new class102(var51, 4, (var43 + 2 & 0x3) + 4, Statics.field509, var46, var47, var40, false, var50.field2179);
                            }
                        }
                    }
                    if (var44 == 2) {
                        class150 var52 = Statics.field512.method2592(Statics.field509, var46, var47);
                        if (var42 == 11) {
                            var42 = 10;
                        }
                        if (var52 != null) {
                            var52.field2191 = new class102(var52.field2197 >> 14 & 0x7FFF, var42, var43, Statics.field509, var46, var47, var40, false, var52.field2191);
                        }
                    }
                    if (var44 == 3) {
                        class131 var53 = Statics.field512.method2652(Statics.field509, var46, var47);
                        if (var53 != null) {
                            var53.field1875 = new class102(var53.field1872 >> 14 & 0x7FFF, 22, var43, Statics.field509, var46, var47, var40, false, var53.field1875);
                        }
                    }
                }
            } else {
                if (field1040 == 73) {
                    byte var54 = field956.method2933();
                    byte var55 = field956.method2980();
                    int var56 = field956.method2898();
                    int var57 = var56 >> 2;
                    int var58 = var56 & 0x3;
                    int var59 = field1000[var57];
                    int var60 = field956.method3058();
                    int var61 = field956.method3023();
                    int var62 = field956.method3058();
                    byte var63 = field956.method3074();
                    int var64 = field956.method2903();
                    int var65 = (var64 >> 4 & 0x7) + Statics.field1789;
                    int var66 = (var64 & 0x7) + Statics.field499;
                    int var67 = field956.method3058();
                    byte var68 = field956.method2933();
                    class76 var69;
                    if (field1019 == var67) {
                        var69 = Statics.field312;
                    } else {
                        var69 = field1046[var67];
                    }
                    if (var69 != null) {
                        class257 var70 = class257.method483(var61);
                        int var71;
                        int var72;
                        if (var58 == 1 || var58 == 3) {
                            var71 = var70.field3443;
                            var72 = var70.field3442;
                        } else {
                            var71 = var70.field3442;
                            var72 = var70.field3443;
                        }
                        int var73 = (var71 >> 1) + var65;
                        int var74 = (var71 + 1 >> 1) + var65;
                        int var75 = (var72 >> 1) + var66;
                        int var76 = (var72 + 1 >> 1) + var66;
                        int[][] var77 = class62.field763[Statics.field509];
                        int var78 = var77[var73][var75] + var77[var74][var75] + var77[var73][var76] + var77[var74][var76] >> 2;
                        int var79 = (var65 << 7) + (var71 << 6);
                        int var80 = (var66 << 7) + (var72 << 6);
                        class135 var81 = var70.method4205(var57, var58, var77, var79, var78, var80);
                        if (var81 != null) {
                            method4140(Statics.field509, var65, var66, var59, -1, 0, 0, var60 + 1, var62 + 1);
                            var69.field906 = field944 + var60;
                            var69.field907 = field944 + var62;
                            var69.field911 = var81;
                            var69.field908 = var65 * 128 + var71 * 64;
                            var69.field912 = var66 * 128 + var72 * 64;
                            var69.field909 = var78;
                            if (var68 > var63) {
                                byte var82 = var68;
                                var68 = var63;
                                var63 = var82;
                            }
                            if (var55 > var54) {
                                byte var83 = var55;
                                var55 = var54;
                                var54 = var83;
                            }
                            var69.field902 = var65 + var68;
                            var69.field920 = var63 + var65;
                            var69.field921 = var55 + var66;
                            var69.field924 = var54 + var66;
                        }
                    }
                }
                if (field1040 == 156) {
                    int var84 = field956.method2903();
                    int var85 = (var84 >> 4 & 0x7) + Statics.field1789;
                    int var86 = (var84 & 0x7) + Statics.field499;
                    int var87 = field956.method3023();
                    int var88 = field956.method2903();
                    int var89 = field956.method3023();
                    if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                        int var90 = var85 * 128 + 64;
                        int var91 = var86 * 128 + 64;
                        class86 var92 = new class86(var87, Statics.field509, var90, var91, method184(var90, var91, Statics.field509) - var88, var89, field944);
                        field1059.method3317(var92);
                    }
                } else if (field1040 == 212) {
                    int var93 = field956.method2903();
                    int var94 = (var93 >> 4 & 0x7) + Statics.field1789;
                    int var95 = (var93 & 0x7) + Statics.field499;
                    int var96 = field956.method3023();
                    int var97 = field956.method3023();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        class96 var98 = new class96();
                        var98.field1497 = var97;
                        var98.field1495 = var96;
                        if (field1056[Statics.field509][var94][var95] == null) {
                            field1056[Statics.field509][var94][var95] = new class195();
                        }
                        field1056[Statics.field509][var94][var95].method3317(var98);
                        method3587(var94, var95);
                    }
                } else if (field1040 == 115) {
                    int var99 = field956.method2903();
                    int var100 = (var99 >> 4 & 0x7) + Statics.field1789;
                    int var101 = (var99 & 0x7) + Statics.field499;
                    int var102 = field956.method3023();
                    int var103 = field956.method3023();
                    int var104 = field956.method3023();
                    if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                        class195 var105 = field1056[Statics.field509][var100][var101];
                        if (var105 != null) {
                            for (class96 var106 = (class96) var105.method3326(); var106 != null; var106 = (class96) var105.method3323()) {
                                if ((var102 & 0x7FFF) == var106.field1497 && var106.field1495 == var103) {
                                    var106.field1495 = var104;
                                    break;
                                }
                            }
                            method3587(var100, var101);
                        }
                    }
                } else if (field1040 == 231) {
                    int var107 = field956.method2903();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field1789;
                    int var109 = (var107 & 0x7) + Statics.field499;
                    int var110 = field956.method2930();
                    int var111 = var110 >> 2;
                    int var112 = var110 & 0x3;
                    int var113 = field1000[var111];
                    int var114 = field956.method2938();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        method4140(Statics.field509, var108, var109, var113, var114, var111, var112, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ik.gb(IIIIIIIIIB)V")
    public static final void method4140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class78 var9 = null;
        for (class78 var10 = (class78) field1057.method3326(); var10 != null; var10 = (class78) field1057.method3323()) {
            if (var10.field1213 == arg0 && var10.field1208 == arg1 && var10.field1209 == arg2 && var10.field1216 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class78();
            var9.field1213 = arg0;
            var9.field1216 = arg3;
            var9.field1208 = arg1;
            var9.field1209 = arg2;
            method563(var9);
            field1057.method3317(var9);
        }
        var9.field1218 = arg4;
        var9.field1215 = arg5;
        var9.field1214 = arg6;
        var9.field1206 = arg7;
        var9.field1217 = arg8;
    }

    @ObfuscatedName("az.gc(I)V")
    public static final void method499() {
        for (class78 var0 = (class78) field1057.method3326(); var0 != null; var0 = (class78) field1057.method3323()) {
            if (var0.field1217 == -1) {
                var0.field1206 = 0;
                method563(var0);
            } else {
                var0.method3314();
            }
        }
    }

    @ObfuscatedName("ap.gh(Lbs;B)V")
    public static final void method563(class78 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1216 == 0) {
            var1 = Statics.field512.method2505(arg0.field1213, arg0.field1208, arg0.field1209);
        }
        if (arg0.field1216 == 1) {
            var1 = Statics.field512.method2559(arg0.field1213, arg0.field1208, arg0.field1209);
        }
        if (arg0.field1216 == 2) {
            var1 = Statics.field512.method2507(arg0.field1213, arg0.field1208, arg0.field1209);
        }
        if (arg0.field1216 == 3) {
            var1 = Statics.field512.method2508(arg0.field1213, arg0.field1208, arg0.field1209);
        }
        if (var1 != 0) {
            int var5 = Statics.field512.method2602(arg0.field1213, arg0.field1208, arg0.field1209, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1210 = var2;
        arg0.field1207 = var3;
        arg0.field1211 = var4;
    }

    @ObfuscatedName("bb.gy(IIIIIIIB)V")
    public static final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field939 && Statics.field509 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field512.method2505(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field512.method2559(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field512.method2507(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field512.method2508(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field512.method2602(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field512.method2565(arg0, arg2, arg3);
                class257 var15 = class257.method483(var12);
                if (var15.field3449 != 0) {
                    field997[arg0].method2781(arg2, arg3, var13, var14, var15.field3445);
                }
            }
            if (arg1 == 1) {
                Statics.field512.method2574(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field512.method2498(arg0, arg2, arg3);
                class257 var16 = class257.method483(var12);
                if (var16.field3442 + arg2 > 103 || var16.field3442 + arg3 > 103 || var16.field3443 + arg2 > 103 || var16.field3443 + arg3 > 103) {
                    return;
                }
                if (var16.field3449 != 0) {
                    field997[arg0].method2782(arg2, arg3, var16.field3442, var16.field3443, var14, var16.field3445);
                }
            }
            if (arg1 == 3) {
                Statics.field512.method2499(arg0, arg2, arg3);
                class257 var17 = class257.method483(var12);
                if (var17.field3449 == 1) {
                    field997[arg0].method2784(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field761[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method121(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field512, field997[arg0]);
    }

    @ObfuscatedName("ht.gz(IIB)V")
    public static final void method3587(int arg0, int arg1) {
        class195 var2 = field1056[Statics.field509][arg0][arg1];
        if (var2 == null) {
            Statics.field512.method2500(Statics.field509, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class96 var5 = null;
        for (class96 var6 = (class96) var2.method3326(); var6 != null; var6 = (class96) var2.method3323()) {
            class258 var7 = class258.method1923(var6.field1497);
            long var8 = (long) var7.field3497;
            if (var7.field3498 == 1) {
                var8 = (long) (var6.field1495 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field512.method2500(Statics.field509, arg0, arg1);
            return;
        }
        var2.method3318(var5);
        class96 var10 = null;
        class96 var11 = null;
        for (class96 var12 = (class96) var2.method3326(); var12 != null; var12 = (class96) var2.method3323()) {
            if (var5.field1497 != var12.field1497) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1497 != var12.field1497 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field512.method2486(Statics.field509, arg0, arg1, method184(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field509), var5, var13, var10, var11);
    }

    @ObfuscatedName("cz.gt(ZB)V")
    public static final void method1561(boolean arg0) {
        field1049 = 0;
        field1144 = 0;
        field956.method3160();
        int var1 = field956.method3142(8);
        if (var1 < field959) {
            for (int var2 = var1; var2 < field959; var2++) {
                field1050[++field1049 - 1] = field1158[var2];
            }
        }
        if (var1 > field959) {
            throw new RuntimeException("");
        }
        field959 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field1158[var3];
            class88 var5 = field973[var4];
            int var6 = field956.method3142(1);
            if (var6 == 0) {
                field1158[++field959 - 1] = var4;
                var5.field1276 = field944;
            } else {
                int var7 = field956.method3142(2);
                if (var7 == 0) {
                    field1158[++field959 - 1] = var4;
                    var5.field1276 = field944;
                    field1203[++field1144 - 1] = var4;
                } else if (var7 == 1) {
                    field1158[++field959 - 1] = var4;
                    var5.field1276 = field944;
                    int var8 = field956.method3142(3);
                    var5.method1545(var8, (byte) 1);
                    int var9 = field956.method3142(1);
                    if (var9 == 1) {
                        field1203[++field1144 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field1158[++field959 - 1] = var4;
                    var5.field1276 = field944;
                    int var10 = field956.method3142(3);
                    var5.method1545(var10, (byte) 2);
                    int var11 = field956.method3142(3);
                    var5.method1545(var11, (byte) 2);
                    int var12 = field956.method3142(1);
                    if (var12 == 1) {
                        field1203[++field1144 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field1050[++field1049 - 1] = var4;
                }
            }
        }
        while (field956.method3144(field981) >= 27) {
            int var13 = field956.method3142(15);
            if (var13 == 32767) {
                break;
            }
            boolean var43 = false;
            if (field973[var13] == null) {
                field973[var13] = new class88();
                var43 = true;
            }
            class88 var44 = field973[var13];
            field1158[++field959 - 1] = var13;
            var44.field1276 = field944;
            int var45 = field977[field956.method3142(3)];
            if (var43) {
                var44.field1270 = var44.field1221 = var45;
            }
            int var46 = field956.method3142(1);
            int var47;
            if (arg0) {
                var47 = field956.method3142(8);
                if (var47 > 127) {
                    var47 -= 256;
                }
            } else {
                var47 = field956.method3142(5);
                if (var47 > 15) {
                    var47 -= 32;
                }
            }
            int var48;
            if (arg0) {
                var48 = field956.method3142(8);
                if (var48 > 127) {
                    var48 -= 256;
                }
            } else {
                var48 = field956.method3142(5);
                if (var48 > 15) {
                    var48 -= 32;
                }
            }
            var44.field1382 = class260.method3178(field956.method3142(14));
            int var49 = field956.method3142(1);
            if (var49 == 1) {
                field1203[++field1144 - 1] = var13;
            }
            var44.field1220 = var44.field1382.field3544;
            var44.field1231 = var44.field1382.field3567;
            if (var44.field1231 == 0) {
                var44.field1221 = 0;
            }
            var44.field1227 = var44.field1382.field3550;
            var44.field1219 = var44.field1382.field3551;
            var44.field1229 = var44.field1382.field3552;
            var44.field1230 = var44.field1382.field3547;
            var44.field1224 = var44.field1382.field3554;
            var44.field1242 = var44.field1382.field3564;
            var44.field1226 = var44.field1382.field3549;
            var44.method1544(Statics.field312.field1228[0] + var48, Statics.field312.field1234[0] + var47, var46 == 1);
        }
        field956.method3143();
        for (int var14 = 0; var14 < field1144; var14++) {
            int var15 = field1203[var14];
            class88 var16 = field973[var15];
            int var17 = field956.method2903();
            if ((var17 & 0x8) != 0) {
                var16.field1245 = field956.method3058();
                if (var16.field1245 == 65535) {
                    var16.field1245 = -1;
                }
            }
            if ((var17 & 0x10) != 0) {
                int var18 = field956.method2914();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = -1;
                        int var21 = -1;
                        int var22 = -1;
                        int var23 = field956.method3013();
                        if (var23 == 32767) {
                            var23 = field956.method3013();
                            var21 = field956.method3013();
                            var20 = field956.method3013();
                            var22 = field956.method3013();
                        } else if (var23 == 32766) {
                            var23 = -1;
                        } else {
                            var21 = field956.method3013();
                        }
                        int var24 = field956.method3013();
                        var16.method1395(var23, var21, var20, var22, field944, var24);
                    }
                }
                int var25 = field956.method2930();
                if (var25 > 0) {
                    for (int var26 = 0; var26 < var25; var26++) {
                        int var27 = field956.method3013();
                        int var28 = field956.method3013();
                        if (var28 == 32767) {
                            var16.method1397(var27);
                        } else {
                            int var29 = field956.method3013();
                            int var30 = field956.method2898();
                            int var31 = var28 > 0 ? field956.method2903() : var30;
                            var16.method1396(var27, field944, var28, var29, var30, var31);
                        }
                    }
                }
            }
            if ((var17 & 0x2) != 0) {
                var16.field1382 = class260.method3178(field956.method3023());
                var16.field1220 = var16.field1382.field3544;
                var16.field1231 = var16.field1382.field3567;
                var16.field1227 = var16.field1382.field3550;
                var16.field1219 = var16.field1382.field3551;
                var16.field1229 = var16.field1382.field3552;
                var16.field1230 = var16.field1382.field3547;
                var16.field1224 = var16.field1382.field3554;
                var16.field1242 = var16.field1382.field3564;
                var16.field1226 = var16.field1382.field3549;
            }
            if ((var17 & 0x1) != 0) {
                var16.field1256 = field956.method2939();
                int var32 = field956.method2947();
                var16.field1260 = var32 >> 16;
                var16.field1225 = (var32 & 0xFFFF) + field944;
                var16.field1257 = 0;
                var16.field1258 = 0;
                if (var16.field1225 > field944) {
                    var16.field1257 = -1;
                }
                if (var16.field1256 == 65535) {
                    var16.field1256 = -1;
                }
            }
            if ((var17 & 0x4) != 0) {
                int var33 = field956.method3058();
                int var34 = field956.method3058();
                int var35 = var16.field1262 - (var33 - Statics.field608 - Statics.field608) * 64;
                int var36 = var16.field1259 - (var34 - Statics.field587 - Statics.field587) * 64;
                if (var35 != 0 || var36 != 0) {
                    var16.field1247 = (int) (Math.atan2((double) var35, (double) var36) * 325.949D) & 0x7FF;
                }
            }
            if ((var17 & 0x20) != 0) {
                int var37 = field956.method2938();
                if (var37 == 65535) {
                    var37 = -1;
                }
                int var38 = field956.method2914();
                if (var16.field1251 == var37 && var37 != -1) {
                    int var39 = class262.method1389(var37).field3607;
                    if (var39 == 1) {
                        var16.field1243 = 0;
                        var16.field1268 = 0;
                        var16.field1254 = var38;
                        var16.field1255 = 0;
                    }
                    if (var39 == 2) {
                        var16.field1255 = 0;
                    }
                } else if (var37 == -1 || var16.field1251 == -1 || class262.method1389(var37).field3601 >= class262.method1389(var16.field1251).field3601) {
                    var16.field1251 = var37;
                    var16.field1243 = 0;
                    var16.field1268 = 0;
                    var16.field1254 = var38;
                    var16.field1255 = 0;
                    var16.field1278 = var16.field1269;
                }
            }
            if ((var17 & 0x40) != 0) {
                var16.field1238 = field956.method2911();
                var16.field1275 = 100;
            }
        }
        for (int var40 = 0; var40 < field1049; var40++) {
            int var41 = field1050[var40];
            if (field944 != field973[var41].field1276) {
                field973[var41].field1382 = null;
                field973[var41] = null;
            }
        }
        if (field981 != field956.field2394) {
            throw new RuntimeException(field956.field2394 + class90.field1397 + field981);
        }
        for (int var42 = 0; var42 < field959; var42++) {
            if (field973[field1158[var42]] == null) {
                throw new RuntimeException(var42 + class90.field1397 + field959);
            }
        }
    }

    @ObfuscatedName("bx.gw(Lbz;IIBI)V")
    public static final void method1071(class76 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1228[0];
        int var5 = arg0.field1234[0];
        int var6 = arg0.method1076();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1076();
        class165 var8 = method117(arg1, arg2);
        class163 var9 = field997[arg0.field919];
        int[] var10 = field1150;
        int[] var11 = field1123;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class164.field2308[var12][var13] = 0;
                class164.field2309[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class164.method1579(var4, var5, var8, var9);
        } else if (var7 == 2) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class164.field2308[var17][var18] = 99;
            class164.field2309[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class164.field2311[var21] = var4;
            int var55 = var21 + 1;
            class164.field2312[var21] = var5;
            int[][] var23 = var9.field2305;
            boolean var28;
            while (true) {
                if (var55 == var22) {
                    Statics.field2317 = var15;
                    Statics.field2310 = var16;
                    var28 = false;
                    break;
                }
                var15 = class164.field2311[var22];
                var16 = class164.field2312[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var9.field2294;
                int var27 = var16 - var9.field2302;
                if (var8.method1068(2, var15, var16, var9)) {
                    Statics.field2317 = var15;
                    Statics.field2310 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class164.field2309[var24][var25] + 1;
                if (var24 > 0 && class164.field2308[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0) {
                    class164.field2311[var55] = var15 - 1;
                    class164.field2312[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class164.field2308[var24 - 1][var25] = 2;
                    class164.field2309[var24 - 1][var25] = var29;
                }
                if (var24 < 126 && class164.field2308[var24 + 1][var25] == 0 && (var23[var26 + 2][var27] & 0x1240183) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E0) == 0) {
                    class164.field2311[var55] = var15 + 1;
                    class164.field2312[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class164.field2308[var24 + 1][var25] = 8;
                    class164.field2309[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class164.field2308[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0) {
                    class164.field2311[var55] = var15;
                    class164.field2312[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class164.field2308[var24][var25 - 1] = 1;
                    class164.field2309[var24][var25 - 1] = var29;
                }
                if (var25 < 126 && class164.field2308[var24][var25 + 1] == 0 && (var23[var26][var27 + 2] & 0x1240138) == 0 && (var23[var26 + 1][var27 + 2] & 0x12401E0) == 0) {
                    class164.field2311[var55] = var15;
                    class164.field2312[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class164.field2308[var24][var25 + 1] = 4;
                    class164.field2309[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class164.field2308[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27] & 0x124013E) == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26][var27 - 1] & 0x124018F) == 0) {
                    class164.field2311[var55] = var15 - 1;
                    class164.field2312[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class164.field2308[var24 - 1][var25 - 1] = 3;
                    class164.field2309[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 126 && var25 > 0 && class164.field2308[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x124018F) == 0 && (var23[var26 + 2][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 2][var27] & 0x12401E3) == 0) {
                    class164.field2311[var55] = var15 + 1;
                    class164.field2312[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class164.field2308[var24 + 1][var25 - 1] = 9;
                    class164.field2309[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 126 && class164.field2308[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x124013E) == 0 && (var23[var26 - 1][var27 + 2] & 0x1240138) == 0 && (var23[var26][var27 + 2] & 0x12401F8) == 0) {
                    class164.field2311[var55] = var15 - 1;
                    class164.field2312[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class164.field2308[var24 - 1][var25 + 1] = 6;
                    class164.field2309[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 126 && var25 < 126 && class164.field2308[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 2] & 0x12401F8) == 0 && (var23[var26 + 2][var27 + 2] & 0x12401E0) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E3) == 0) {
                    class164.field2311[var55] = var15 + 1;
                    class164.field2312[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class164.field2308[var24 + 1][var25 + 1] = 12;
                    class164.field2309[var24 + 1][var25 + 1] = var29;
                }
            }
            var14 = var28;
        } else {
            var14 = class164.method2773(var4, var5, var7, var8, var9);
        }
        int var48;
        label321: {
            int var30 = var4 - 64;
            int var31 = var5 - 64;
            int var32 = Statics.field2317;
            int var33 = Statics.field2310;
            if (!var14) {
                int var34 = Integer.MAX_VALUE;
                int var35 = Integer.MAX_VALUE;
                byte var36 = 10;
                int var37 = var8.field2319;
                int var38 = var8.field2316;
                int var39 = var8.field2315;
                int var40 = var8.field2318;
                for (int var41 = var37 - var36; var41 <= var36 + var37; var41++) {
                    for (int var42 = var38 - var36; var42 <= var36 + var38; var42++) {
                        int var43 = var41 - var30;
                        int var44 = var42 - var31;
                        if (var43 >= 0 && var44 >= 0 && var43 < 128 && var44 < 128 && class164.field2309[var43][var44] < 100) {
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
                            if (var47 < var34 || var34 == var47 && class164.field2309[var43][var44] < var35) {
                                var34 = var47;
                                var35 = class164.field2309[var43][var44];
                                var32 = var41;
                                var33 = var42;
                            }
                        }
                    }
                }
                if (var34 == Integer.MAX_VALUE) {
                    var48 = -1;
                    break label321;
                }
            }
            if (var4 == var32 && var5 == var33) {
                var48 = 0;
            } else {
                byte var49 = 0;
                class164.field2311[var49] = var32;
                int var56 = var49 + 1;
                class164.field2312[var49] = var33;
                int var50;
                int var51 = var50 = class164.field2308[var32 - var30][var33 - var31];
                while (var4 != var32 || var5 != var33) {
                    if (var50 != var51) {
                        var50 = var51;
                        class164.field2311[var56] = var32;
                        class164.field2312[var56++] = var33;
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
                    var51 = class164.field2308[var32 - var30][var33 - var31];
                }
                int var52 = 0;
                while (var56-- > 0) {
                    var10[var52] = class164.field2311[var56];
                    var11[var52++] = class164.field2312[var56];
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
                arg0.method1080(field1150[var54], field1123[var54], arg3);
            }
        }
    }

    @ObfuscatedName("v.gk(III)Lfe;")
    public static class165 method117(int arg0, int arg1) {
        field1202.field2319 = arg0;
        field1202.field2316 = arg1;
        field1202.field2315 = 1;
        field1202.field2318 = 1;
        return field1202;
    }

    @ObfuscatedName("af.gx(B)V")
    public static void method480() {
        field1156 = 0;
        field1064 = false;
        field1071[0] = class227.field2993;
        field1035[0] = "";
        field1021[0] = 1006;
        field1132[0] = false;
        field1156 = 1;
    }

    @ObfuscatedName("a.gm(I)V")
    public static final void method87() {
        int var0 = Statics.field1115;
        int var1 = Statics.field3608;
        int var2 = Statics.field311;
        int var3 = Statics.field298;
        int var4 = 6116423;
        class283.method4601(var0, var1, var2, var3, var4);
        class283.method4601(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class283.method4608(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field766.method4420(class227.field3030, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field735;
        int var6 = class60.field736 * -261504029;
        for (int var7 = 0; var7 < field1156; var7++) {
            int var8 = (field1156 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class265 var10 = Statics.field766;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field1035[var7].length() > 0) {
                var11 = field1071[var7] + class227.field2958 + field1035[var7];
            } else {
                var11 = field1071[var7];
            }
            var10.method4420(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field1115;
        int var13 = Statics.field3608;
        int var14 = Statics.field311;
        int var15 = Statics.field298;
        for (int var16 = 0; var16 < field1130; var16++) {
            if (field1204[var16] + field1135[var16] > var12 && field1135[var16] < var12 + var14 && field1165[var16] + field1136[var16] > var13 && field1136[var16] < var13 + var15) {
                field1133[var16] = true;
            }
        }
    }

    @ObfuscatedName("ca.gn(IIIII)V")
    public static final void method1577(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1130; var4++) {
            if (field1204[var4] + field1135[var4] > arg0 && field1135[var4] < arg0 + arg2 && field1165[var4] + field1136[var4] > arg1 && field1136[var4] < arg1 + arg3) {
                field1113[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hm(I)V")
    public final void method1109() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field1156 - 1; var2++) {
                if (field1021[var2] < 1000 && field1021[var2 + 1] > 1000) {
                    String var3 = field1035[var2];
                    field1035[var2] = field1035[var2 + 1];
                    field1035[var2 + 1] = var3;
                    String var4 = field1071[var2];
                    field1071[var2] = field1071[var2 + 1];
                    field1071[var2 + 1] = var4;
                    int var5 = field1021[var2];
                    field1021[var2] = field1021[var2 + 1];
                    field1021[var2 + 1] = var5;
                    int var6 = field1067[var2];
                    field1067[var2] = field1067[var2 + 1];
                    field1067[var2 + 1] = var6;
                    int var7 = field1068[var2];
                    field1068[var2] = field1068[var2 + 1];
                    field1068[var2 + 1] = var7;
                    int var8 = field1070[var2];
                    field1070[var2] = field1070[var2 + 1];
                    field1070[var2 + 1] = var8;
                    boolean var9 = field1132[var2];
                    field1132[var2] = field1132[var2 + 1];
                    field1132[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field374 != null || field1108 != null) {
            return;
        }
        int var10 = class60.field741;
        if (field1064) {
            if (var10 != 1 && (Statics.field303 || var10 != 4)) {
                int var11 = class60.field735;
                int var12 = class60.field736 * -261504029;
                if (var11 < Statics.field1115 - 10 || var11 > Statics.field311 + Statics.field1115 + 10 || var12 < Statics.field3608 - 10 || var12 > Statics.field3608 + Statics.field298 + 10) {
                    field1064 = false;
                    method1577(Statics.field1115, Statics.field3608, Statics.field311, Statics.field298);
                }
            }
            if (var10 == 1 || !Statics.field303 && var10 == 4) {
                int var13 = Statics.field1115;
                int var14 = Statics.field3608;
                int var15 = Statics.field311;
                int var16 = class60.field742;
                int var17 = class60.field743;
                int var18 = -1;
                for (int var19 = 0; var19 < field1156; var19++) {
                    int var20 = (field1156 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1) {
                    method3636(var18);
                }
                field1064 = false;
                method1577(Statics.field1115, Statics.field3608, Statics.field311, Statics.field298);
            }
            return;
        }
        int var21 = field1156 - 1;
        if ((var10 == 1 || !Statics.field303 && var10 == 4) && var21 >= 0) {
            int var23 = field1021[var21];
            if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                int var24 = field1067[var21];
                int var25 = field1068[var21];
                class218 var26 = class218.method1532(var25);
                if (class219.method1629(method4398(var26)) || class219.method756(method4398(var26))) {
                    if (Statics.field374 != null && !field1043 && field1156 > 0 && !this.method1235()) {
                        int var27 = field976;
                        int var28 = field1074;
                        class91 var29 = Statics.field319;
                        method4397(var29.field1409, var29.field1407, var29.field1408, var29.field1410, var29.field1412, var29.field1412, var27, var28);
                        Statics.field319 = null;
                    }
                    field1043 = false;
                    field1044 = 0;
                    if (Statics.field374 != null) {
                        method1576(Statics.field374);
                    }
                    Statics.field374 = class218.method1532(var25);
                    field1093 = var24;
                    field976 = class60.field742;
                    field1074 = class60.field743;
                    if (var21 >= 0) {
                        Statics.field319 = new class91();
                        Statics.field319.field1409 = field1067[var21];
                        Statics.field319.field1407 = field1068[var21];
                        Statics.field319.field1408 = field1021[var21];
                        Statics.field319.field1410 = field1070[var21];
                        Statics.field319.field1412 = field1071[var21];
                    }
                    method1576(Statics.field374);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field303 && var10 == 4) && this.method1235()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field303 && var10 == 4) && field1156 > 0) {
            method3636(var21);
        }
        if (var10 == 2 && field1156 > 0) {
            this.method1111(class60.field742, class60.field743);
        }
    }

    @ObfuscatedName("client.ht(B)Z")
    public final boolean method1235() {
        int var1 = field1156 - 1;
        if (field1156 > 2) {
            if (field1063 == 1 && !field1132[var1]) {
                return true;
            }
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field1021[var1];
                if (var4 >= 2000) {
                    var4 -= 2000;
                }
                if (var4 == 1007) {
                    var3 = true;
                } else {
                    var3 = false;
                }
            }
            if (var3) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("client.he(III)V")
    public final void method1111(int arg0, int arg1) {
        int var3 = Statics.field766.method4415(class227.field3030);
        for (int var4 = 0; var4 < field1156; var4++) {
            class265 var5 = Statics.field766;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1035[var4].length() > 0) {
                var6 = field1071[var4] + class227.field2958 + field1035[var4];
            } else {
                var6 = field1071[var4];
            }
            int var7 = var5.method4415(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field1156 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field710) {
            var9 = Statics.field710 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field1) {
            var10 = Statics.field1 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field512.method2516(Statics.field509, arg0, arg1, false);
        field1064 = true;
        Statics.field1115 = var9;
        Statics.field3608 = var10;
        Statics.field311 = var3;
        Statics.field298 = field1156 * 15 + 22;
    }

    @ObfuscatedName("hh.hf(II)V")
    public static final void method3636(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1067[arg0];
        int var2 = field1068[arg0];
        int var3 = field1021[arg0];
        int var4 = field1070[arg0];
        String var5 = field1071[arg0];
        String var6 = field1035[arg0];
        method4397(var1, var2, var3, var4, var5, var6, class60.field742, class60.field743);
    }

    @ObfuscatedName("jy.hq(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method4397(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1002) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field978.method3139(115);
            field978.method2937(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 19) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(52);
            field978.method3041(Statics.field587 + arg1);
            field978.method2888(class51.field643[82] ? 1 : 0);
            field978.method3030(arg3);
            field978.method3030(Statics.field608 + arg0);
        }
        if (arg2 == 1001) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(4);
            field978.method3041(Statics.field608 + arg0);
            field978.method2888(class51.field643[82] ? 1 : 0);
            field978.method3064(Statics.field587 + arg1);
            field978.method3030(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 37) {
            field978.method3139(202);
            field978.method2891(arg1);
            field978.method3030(arg3);
            field978.method3064(arg0);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 25) {
            class218 var8 = class218.method3511(arg1, arg0);
            if (var8 != null) {
                method105();
                int var11 = method4398(var8);
                int var12 = var11 >> 11 & 0x3F;
                method169(arg1, arg0, var12, var8.field2694);
                field1080 = 0;
                field994 = method2668(var8);
                if (field994 == null) {
                    field994 = "Null";
                }
                if (var8.field2756) {
                    field1086 = var8.field2689 + class90.method2296(16777215);
                } else {
                    field1086 = class90.method2296(65280) + var8.field2766 + class90.method2296(16777215);
                }
            }
            return;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field600.method4900(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 43) {
            field978.method3139(66);
            field978.method3064(arg3);
            field978.method2946(arg1);
            field978.method3030(arg0);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 35) {
            field978.method3139(134);
            field978.method2937(arg3);
            field978.method2944(arg1);
            field978.method3041(arg0);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 58) {
            class218 var13 = class218.method3511(arg1, arg0);
            if (var13 != null) {
                field978.method3139(57);
                field978.method3030(field1084);
                field978.method3030(field1083);
                field978.method2891(arg1);
                field978.method3041(arg0);
                field978.method2891(Statics.field435);
                field978.method2937(var13.field2694);
            }
        }
        if (arg2 == 5) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(144);
            field978.method2927(class51.field643[82] ? 1 : 0);
            field978.method2937(Statics.field587 + arg1);
            field978.method3030(Statics.field608 + arg0);
            field978.method2937(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 9) {
            class88 var14 = field973[arg3];
            if (var14 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(42);
                field978.method2929(class51.field643[82] ? 1 : 0);
                field978.method3064(arg3);
            }
        }
        if (arg2 == 51) {
            class76 var15 = field1046[arg3];
            if (var15 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(185);
                field978.method3041(arg3);
                field978.method2929(class51.field643[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field978.method3139(87);
            field978.method3030(arg0);
            field978.method2902(arg1);
            field978.method2937(arg3);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 12) {
            class88 var16 = field973[arg3];
            if (var16 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(22);
                field978.method2929(class51.field643[82] ? 1 : 0);
                field978.method3041(arg3);
            }
        }
        if (arg2 == 33) {
            field978.method3139(171);
            field978.method2944(arg1);
            field978.method3030(arg0);
            field978.method3064(arg3);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 21) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(133);
            field978.method3030(Statics.field587 + arg1);
            field978.method2937(Statics.field608 + arg0);
            field978.method3030(arg3);
            field978.method2991(class51.field643[82] ? 1 : 0);
        }
        if (arg2 == 24) {
            class218 var17 = class218.method1532(arg1);
            boolean var18 = true;
            if (var17.field2654 > 0) {
                var18 = Statics.method502(var17);
            }
            if (var18) {
                field978.method3139(98);
                field978.method2891(arg1);
            }
        }
        if (arg2 == 2) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(126);
            field978.method3030(Statics.field608 + arg0);
            field978.method2937(field1083);
            field978.method2927(class51.field643[82] ? 1 : 0);
            field978.method3041(arg3 >> 14 & 0x7FFF);
            field978.method3064(Statics.field587 + arg1);
            field978.method2891(Statics.field435);
        }
        if (arg2 == 22) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(55);
            field978.method2937(Statics.field608 + arg0);
            field978.method3064(Statics.field587 + arg1);
            field978.method3064(arg3);
            field978.method2888(class51.field643[82] ? 1 : 0);
        }
        if (arg2 == 10) {
            class88 var19 = field973[arg3];
            if (var19 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(220);
                field978.method2888(class51.field643[82] ? 1 : 0);
                field978.method3041(arg3);
            }
        }
        if (arg2 == 50) {
            class76 var20 = field1046[arg3];
            if (var20 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(26);
                field978.method2991(class51.field643[82] ? 1 : 0);
                field978.method2937(arg3);
            }
        }
        if (arg2 == 28) {
            field978.method3139(98);
            field978.method2891(arg1);
            class218 var21 = class218.method1532(arg1);
            if (var21.field2749 != null && var21.field2749[0][0] == 5) {
                int var22 = var21.field2749[0][1];
                class213.field2604[var22] = 1 - class213.field2604[var22];
                method49(var22);
            }
        }
        if (arg2 == 29) {
            field978.method3139(98);
            field978.method2891(arg1);
            class218 var23 = class218.method1532(arg1);
            if (var23.field2749 != null && var23.field2749[0][0] == 5) {
                int var24 = var23.field2749[0][1];
                if (class213.field2604[var24] != var23.field2764[0]) {
                    class213.field2604[var24] = var23.field2764[0];
                    method49(var24);
                }
            }
        }
        if (arg2 == 20) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(105);
            field978.method3041(Statics.field608 + arg0);
            field978.method2937(arg3);
            field978.method2991(class51.field643[82] ? 1 : 0);
            field978.method3030(Statics.field587 + arg1);
        }
        if (arg2 == 4) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(244);
            field978.method3041(arg3 >> 14 & 0x7FFF);
            field978.method2927(class51.field643[82] ? 1 : 0);
            field978.method3030(Statics.field608 + arg0);
            field978.method3030(Statics.field587 + arg1);
        }
        if (arg2 == 34) {
            field978.method3139(41);
            field978.method2937(arg0);
            field978.method2891(arg1);
            field978.method3041(arg3);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 11) {
            class88 var25 = field973[arg3];
            if (var25 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(34);
                field978.method2991(class51.field643[82] ? 1 : 0);
                field978.method2937(arg3);
            }
        }
        if (arg2 == 8) {
            class88 var26 = field973[arg3];
            if (var26 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(208);
                field978.method2929(class51.field643[82] ? 1 : 0);
                field978.method2946(Statics.field435);
                field978.method3030(field1083);
                field978.method2937(arg3);
            }
        }
        if (arg2 == 16) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(43);
            field978.method3064(Statics.field893);
            field978.method2937(Statics.field608 + arg0);
            field978.method2991(class51.field643[82] ? 1 : 0);
            field978.method2937(arg3);
            field978.method3064(Statics.field2627);
            field978.method3030(Statics.field587 + arg1);
            field978.method2891(Statics.field500);
        }
        if (arg2 == 1005) {
            class218 var27 = class218.method1532(arg1);
            if (var27 == null || var27.field2727[arg0] < 100000) {
                field978.method3139(119);
                field978.method3030(arg3);
            } else {
                class100.method1553(27, "", var27.field2727[arg0] + " x " + class258.method1923(arg3).field3487);
            }
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 44) {
            class76 var28 = field1046[arg3];
            if (var28 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(190);
                field978.method2937(arg3);
                field978.method2927(class51.field643[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            method1405();
        }
        if (arg2 == 17) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(201);
            field978.method3041(Statics.field587 + arg1);
            field978.method3030(field1083);
            field978.method2937(Statics.field608 + arg0);
            field978.method3041(arg3);
            field978.method2927(class51.field643[82] ? 1 : 0);
            field978.method2902(Statics.field435);
        }
        if (arg2 == 48) {
            class76 var29 = field1046[arg3];
            if (var29 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(223);
                field978.method2927(class51.field643[82] ? 1 : 0);
                field978.method3030(arg3);
            }
        }
        if (arg2 == 13) {
            class88 var30 = field973[arg3];
            if (var30 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(112);
                field978.method2937(arg3);
                field978.method2927(class51.field643[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class76 var31 = field1046[arg3];
            if (var31 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(36);
                field978.method3030(arg3);
                field978.method3041(Statics.field893);
                field978.method2927(class51.field643[82] ? 1 : 0);
                field978.method2902(Statics.field500);
                field978.method3030(Statics.field2627);
            }
        }
        if (arg2 == 45) {
            class76 var32 = field1046[arg3];
            if (var32 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(120);
                field978.method2937(arg3);
                field978.method2929(class51.field643[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            if (field1064) {
                Statics.field512.method2517();
            } else {
                Statics.field512.method2516(Statics.field509, arg0, arg1, true);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var33 = class218.method3511(arg1, arg0);
            if (var33 != null) {
                int var34 = var33.field2694;
                class218 var35 = class218.method3511(arg1, arg0);
                if (var35 != null) {
                    if (var35.field2750 != null) {
                        class71 var36 = new class71();
                        var36.field856 = var35;
                        var36.field860 = arg3;
                        var36.field855 = arg5;
                        var36.field857 = var35.field2750;
                        class85.method3622(var36);
                    }
                    boolean var37 = true;
                    if (var35.field2654 > 0) {
                        var37 = Statics.method502(var35);
                    }
                    if (var37) {
                        int var38 = method4398(var35);
                        int var39 = arg3 - 1;
                        boolean var40 = (var38 >> var39 + 1 & 0x1) != 0;
                        if (var40) {
                            if (arg3 == 1) {
                                field978.method3139(145);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                            if (arg3 == 2) {
                                field978.method3139(242);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                            if (arg3 == 3) {
                                field978.method3139(37);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                            if (arg3 == 4) {
                                field978.method3139(197);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                            if (arg3 == 5) {
                                field978.method3139(1);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                            if (arg3 == 6) {
                                field978.method3139(62);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                            if (arg3 == 7) {
                                field978.method3139(178);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                            if (arg3 == 8) {
                                field978.method3139(166);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                            if (arg3 == 9) {
                                field978.method3139(234);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                            if (arg3 == 10) {
                                field978.method3139(56);
                                field978.method2891(arg1);
                                field978.method3030(arg0);
                                field978.method3030(var34);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 7) {
            class88 var41 = field973[arg3];
            if (var41 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(219);
                field978.method2929(class51.field643[82] ? 1 : 0);
                field978.method2937(Statics.field2627);
                field978.method2891(Statics.field500);
                field978.method3064(arg3);
                field978.method2937(Statics.field893);
            }
        }
        if (arg2 == 31) {
            field978.method3139(227);
            field978.method3041(arg0);
            field978.method3064(arg3);
            field978.method3064(Statics.field2627);
            field978.method2946(Statics.field500);
            field978.method2902(arg1);
            field978.method3041(Statics.field893);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 1) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(107);
            field978.method2927(class51.field643[82] ? 1 : 0);
            field978.method3030(Statics.field587 + arg1);
            field978.method2944(Statics.field500);
            field978.method3041(Statics.field893);
            field978.method2937(Statics.field608 + arg0);
            field978.method3041(Statics.field2627);
            field978.method3064(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1003) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            class88 var42 = field973[arg3];
            if (var42 != null) {
                class260 var43 = var42.field1382;
                if (var43.field3568 != null) {
                    var43 = var43.method4331();
                }
                if (var43 != null) {
                    field978.method3139(167);
                    field978.method3041(var43.field3542);
                }
            }
        }
        if (arg2 == 1004) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field978.method3139(119);
            field978.method3030(arg3);
        }
        if (arg2 == 6) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(124);
            field978.method2991(class51.field643[82] ? 1 : 0);
            field978.method3064(arg3 >> 14 & 0x7FFF);
            field978.method3030(Statics.field587 + arg1);
            field978.method3041(Statics.field608 + arg0);
        }
        if (arg2 == 3) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(45);
            field978.method3064(Statics.field587 + arg1);
            field978.method3030(arg3 >> 14 & 0x7FFF);
            field978.method2927(class51.field643[82] ? 1 : 0);
            field978.method3064(Statics.field608 + arg0);
        }
        if (arg2 == 40) {
            field978.method3139(106);
            field978.method2937(arg3);
            field978.method3030(arg0);
            field978.method2891(arg1);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 47) {
            class76 var44 = field1046[arg3];
            if (var44 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(154);
                field978.method3041(arg3);
                field978.method2927(class51.field643[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class76 var45 = field1046[arg3];
            if (var45 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(162);
                field978.method3064(arg3);
                field978.method3030(field1083);
                field978.method2944(Statics.field435);
                field978.method2991(class51.field643[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method105();
            class218 var46 = class218.method1532(arg1);
            field1080 = 1;
            Statics.field893 = arg0;
            Statics.field500 = arg1;
            Statics.field2627 = arg3;
            method1576(var46);
            field1085 = class90.method2296(16748608) + class258.method1923(arg3).field3487 + class90.method2296(16777215);
            if (field1085 == null) {
                field1085 = "null";
            }
            return;
        }
        if (arg2 == 41) {
            field978.method3139(82);
            field978.method2946(arg1);
            field978.method3041(arg3);
            field978.method3041(arg0);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 32) {
            field978.method3139(19);
            field978.method3041(field1083);
            field978.method3030(arg0);
            field978.method2902(Statics.field435);
            field978.method2902(arg1);
            field978.method2937(arg3);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 30 && field1091 == null) {
            method1008(arg1, arg0);
            field1091 = class218.method3511(arg1, arg0);
            method1576(field1091);
        }
        if (arg2 == 46) {
            class76 var47 = field1046[arg3];
            if (var47 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(176);
                field978.method2927(class51.field643[82] ? 1 : 0);
                field978.method3064(arg3);
            }
        }
        if (arg2 == 49) {
            class76 var48 = field1046[arg3];
            if (var48 != null) {
                field1142 = arg6;
                field1034 = arg7;
                field1036 = 2;
                field941 = 0;
                field1143 = arg0;
                field1160 = arg1;
                field978.method3139(114);
                field978.method2927(class51.field643[82] ? 1 : 0);
                field978.method3064(arg3);
            }
        }
        if (arg2 == 42) {
            field978.method3139(198);
            field978.method2937(arg0);
            field978.method2891(arg1);
            field978.method3064(arg3);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (arg2 == 18) {
            field1142 = arg6;
            field1034 = arg7;
            field1036 = 2;
            field941 = 0;
            field1143 = arg0;
            field1160 = arg1;
            field978.method3139(60);
            field978.method2888(class51.field643[82] ? 1 : 0);
            field978.method3064(arg3);
            field978.method3041(Statics.field587 + arg1);
            field978.method3030(Statics.field608 + arg0);
        }
        if (arg2 == 36) {
            field978.method3139(29);
            field978.method3064(arg3);
            field978.method3041(arg0);
            field978.method2944(arg1);
            field1037 = 0;
            Statics.field880 = class218.method1532(arg1);
            field1038 = arg0;
        }
        if (field1080 != 0) {
            field1080 = 0;
            method1576(class218.method1532(Statics.field500));
        }
        if (field1082) {
            method105();
        }
        if (Statics.field880 != null && field1037 == 0) {
            method1576(Statics.field880);
        }
    }

    @ObfuscatedName("k.hh(IIIII)V")
    public static void method169(int arg0, int arg1, int arg2, int arg3) {
        class218 var4 = class218.method3511(arg0, arg1);
        if (var4 != null && var4.field2643 != null) {
            class71 var5 = new class71();
            var5.field856 = var4;
            var5.field857 = var4.field2643;
            class85.method3622(var5);
        }
        field1084 = arg3;
        field1082 = true;
        Statics.field435 = arg0;
        field1083 = arg1;
        Statics.field665 = arg2;
        method1576(var4);
    }

    @ObfuscatedName("a.hg(I)V")
    public static void method105() {
        if (!field1082) {
            return;
        }
        class218 var0 = class218.method3511(Statics.field435, field1083);
        if (var0 != null && var0.field2742 != null) {
            class71 var1 = new class71();
            var1.field856 = var0;
            var1.field857 = var0.field2742;
            class85.method3622(var1);
        }
        field1082 = false;
        method1576(var0);
    }

    @ObfuscatedName("bu.hj(III)V")
    public static void method1008(int arg0, int arg1) {
        field978.method3139(72);
        field978.method3030(arg1);
        field978.method2946(arg0);
    }

    @ObfuscatedName("cu.hd(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1723(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field1064 || field1156 >= 500) {
            return;
        }
        field1071[field1156] = arg0;
        field1035[field1156] = arg1;
        field1021[field1156] = arg2;
        field1070[field1156] = arg3;
        field1067[field1156] = arg4;
        field1068[field1156] = arg5;
        field1132[field1156] = var12;
        field1156++;
    }

    @ObfuscatedName("bx.hi(B)V")
    public static void method1072() {
        for (int var0 = 0; var0 < field1156; var0++) {
            int var1 = field1021[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field1156 - 1) {
                    for (int var3 = var0; var3 < field1156 - 1; var3++) {
                        field1071[var3] = field1071[var3 + 1];
                        field1035[var3] = field1035[var3 + 1];
                        field1021[var3] = field1021[var3 + 1];
                        field1070[var3] = field1070[var3 + 1];
                        field1067[var3] = field1067[var3 + 1];
                        field1068[var3] = field1068[var3 + 1];
                        field1132[var3] = field1132[var3 + 1];
                    }
                }
                field1156--;
            }
        }
    }

    @ObfuscatedName("ap.hl(Lim;IIII)V")
    public static final void method562(class260 arg0, int arg1, int arg2, int arg3) {
        if (field1156 >= 400) {
            return;
        }
        if (arg0.field3568 != null) {
            arg0 = arg0.method4331();
        }
        if (arg0 == null || !arg0.field3571 || arg0.field3573 && field1095 != arg1) {
            return;
        }
        String var4 = arg0.field3543;
        if (arg0.field3558 != 0) {
            var4 = var4 + method426(arg0.field3558, Statics.field312.field903) + " " + class90.field1399 + class227.field2931 + arg0.field3558 + class90.field1400;
        }
        if (arg0.field3573 && field1047) {
            method1723(class227.field3002, class90.method2296(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1080 == 1) {
            method1723(class227.field3004, field1085 + " " + class90.field1401 + " " + class90.method2296(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1082) {
            int var5 = arg0.field3573 && field1047 ? 2000 : 0;
            String[] var6 = arg0.field3555;
            if (field1028) {
                var6 = method2742(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class227.field3003)) {
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
                        method1723(var6[var7], class90.method2296(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class227.field3003)) {
                        short var10 = 0;
                        if (field1118 != class93.field1425) {
                            if (field1118 == class93.field1423 || field1118 == class93.field1427 && arg0.field3558 > Statics.field312.field903) {
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
                            method1723(var6[var9], class90.method2296(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3573 || !field1047) {
                method1723(class227.field3002, class90.method2296(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field665 & 0x2) == 2) {
            method1723(field994, field1086 + " " + class90.field1401 + " " + class90.method2296(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fr.hs(Lbz;IIIB)V")
    public static final void method2738(class76 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field312 == arg0 || field1156 >= 400) {
            return;
        }
        String var4;
        if (arg0.field913 == 0) {
            var4 = arg0.field910[0] + arg0.field915 + arg0.field910[1] + method426(arg0.field903, Statics.field312.field903) + " " + class90.field1399 + class227.field2931 + arg0.field903 + class90.field1400 + arg0.field910[2];
        } else {
            var4 = arg0.field910[0] + arg0.field915 + arg0.field910[1] + " " + class90.field1399 + class227.field3055 + arg0.field913 + class90.field1400 + arg0.field910[2];
        }
        if (field1080 == 1) {
            method1723(class227.field3004, field1085 + " " + class90.field1401 + " " + class90.method2296(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1082) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field1052[var5] != null) {
                    short var6 = 0;
                    if (field1052[var5].equalsIgnoreCase(class227.field3003)) {
                        if (field960 == class93.field1425) {
                            continue;
                        }
                        if (field960 == class93.field1423 || field960 == class93.field1427 && arg0.field903 > Statics.field312.field903) {
                            var6 = 2000;
                        }
                        if (Statics.field312.field917 != 0 && arg0.field917 != 0) {
                            if (Statics.field312.field917 == arg0.field917) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field1053[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field1024[var5] + var6;
                    method1723(field1052[var5], class90.method2296(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field665 & 0x8) == 8) {
            method1723(field994, field1086 + " " + class90.field1401 + " " + class90.method2296(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field1156; var9++) {
            if (field1021[var9] == 23) {
                field1035[var9] = class90.method2296(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ae.hn(III)Ljava/lang/String;")
    public static final String method426(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class90.method2296(16711680);
        } else if (var2 < -6) {
            return class90.method2296(16723968);
        } else if (var2 < -3) {
            return class90.method2296(16740352);
        } else if (var2 < 0) {
            return class90.method2296(16756736);
        } else if (var2 > 9) {
            return class90.method2296(65280);
        } else if (var2 > 6) {
            return class90.method2296(4259584);
        } else if (var2 > 3) {
            return class90.method2296(8453888);
        } else if (var2 > 0) {
            return class90.method2296(12648192);
        } else {
            return class90.method2296(16776960);
        }
    }

    @ObfuscatedName("bl.hz([Lhi;IIIIIIIII)V")
    public static final void method1038(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class283.method4628(arg2, arg3, arg4, arg5);
        class138.method2391();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2681 == arg1 || arg1 == -1412584499 && field1108 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1135[field1130] = var10.field2663 + arg6;
                    field1136[field1130] = var10.field2664 + arg7;
                    field1204[field1130] = var10.field2665;
                    field1165[field1130] = var10.field2666;
                    var11 = ++field1130 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2781 = var11;
                var10.field2782 = field944;
                if (!var10.field2756 || !method2669(var10)) {
                    if (var10.field2654 > 0) {
                        method12(var10);
                    }
                    int var12 = var10.field2663 + arg6;
                    int var13 = var10.field2664 + arg7;
                    int var14 = var10.field2732;
                    if (field1108 == var10) {
                        if (arg1 != -1412584499 && !var10.field2728) {
                            Statics.field339 = arg0;
                            Statics.field831 = arg6;
                            Statics.field609 = arg7;
                            continue;
                        }
                        if (field1111 && field1105) {
                            int var15 = class60.field735;
                            int var16 = class60.field736 * -261504029;
                            int var17 = var15 - field1102;
                            int var18 = var16 - field1103;
                            if (var17 < field1106) {
                                var17 = field1106;
                            }
                            if (var10.field2665 + var17 > field1106 + field1174.field2665) {
                                var17 = field1106 + field1174.field2665 - var10.field2665;
                            }
                            if (var18 < field1107) {
                                var18 = field1107;
                            }
                            if (var10.field2666 + var18 > field1107 + field1174.field2666) {
                                var18 = field1107 + field1174.field2666 - var10.field2666;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2728) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2652 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2652 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2665 + var12;
                        int var26 = var10.field2666 + var13;
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
                        int var29 = var10.field2665 + var12;
                        int var30 = var10.field2666 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2756 || var19 < var21 && var20 < var22) {
                        if (var10.field2654 != 0) {
                            if (var10.field2654 == 1336) {
                                if (field1141) {
                                    var13 += 15;
                                    Statics.field502.method4422("Fps:" + field699, var10.field2665 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field939) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field939) {
                                        var33 = 16711680;
                                    }
                                    Statics.field502.method4422("Mem:" + var32 + "k", var10.field2665 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2654 == 1337) {
                                field1076 = var12;
                                field1077 = var13;
                                int var36 = var10.field2665;
                                int var37 = var10.field2666;
                                field1072++;
                                method4508(class67.field824);
                                boolean var38 = false;
                                if (field1055 >= 0) {
                                    int var39 = class98.field1511;
                                    int[] var40 = class98.field1512;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field1055 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method4508(class67.field825);
                                }
                                method601(true);
                                method4508(var38 ? class67.field827 : class67.field826);
                                method601(false);
                                method4576();
                                for (class86 var42 = (class86) field1059.method3326(); var42 != null; var42 = (class86) field1059.method3323()) {
                                    if (Statics.field509 != var42.field1362 || var42.field1370) {
                                        var42.method3314();
                                    } else if (field944 >= var42.field1361) {
                                        var42.method1533(field958);
                                        if (var42.field1370) {
                                            var42.method3314();
                                        } else {
                                            Statics.field512.method2490(var42.field1362, var42.field1363, var42.field1364, var42.field1365, 60, var42, 0, -1, false);
                                        }
                                    }
                                }
                                method1035(var12, var13, var36, var37, true);
                                int var43 = field1187;
                                int var44 = field1188;
                                int var45 = field1189;
                                int var46 = field1190;
                                class283.method4628(var43, var44, var43 + var45, var44 + var46);
                                class138.method2391();
                                if (!field1173) {
                                    int var47 = field1069;
                                    if (field1018 / 256 > var47) {
                                        var47 = field1018 / 256;
                                    }
                                    if (field1001[4] && field1176[4] + 128 > var47) {
                                        var47 = field1176[4] + 128;
                                    }
                                    int var48 = field1010 & 0x7FF;
                                    int var49 = Statics.field514;
                                    int var50 = method184(Statics.field312.field1262, Statics.field312.field1259, Statics.field509) - field1200;
                                    int var51 = Statics.field473;
                                    int var52 = var47 * 3 + 600;
                                    int var53 = 2048 - var47 & 0x7FF;
                                    int var54 = 2048 - var48 & 0x7FF;
                                    int var55 = 0;
                                    int var56 = 0;
                                    int var57 = var52;
                                    if (var53 != 0) {
                                        int var58 = class138.field2041[var53];
                                        int var59 = class138.field2030[var53];
                                        int var60 = var56 * var59 - var52 * var58 >> 16;
                                        var57 = var56 * var58 + var52 * var59 >> 16;
                                        var56 = var60;
                                    }
                                    if (var54 != 0) {
                                        int var61 = class138.field2041[var54];
                                        int var62 = class138.field2030[var54];
                                        int var63 = var55 * var62 + var57 * var61 >> 16;
                                        var57 = var57 * var62 - var55 * var61 >> 16;
                                        var55 = var63;
                                    }
                                    Statics.field2433 = var49 - var55;
                                    Statics.field472 = var50 - var56;
                                    Statics.field379 = var51 - var57;
                                    Statics.field633 = var47;
                                    Statics.field607 = var48;
                                }
                                int var76;
                                if (field1173) {
                                    int var77;
                                    if (Statics.field22.field1315) {
                                        var77 = Statics.field509;
                                    } else {
                                        int var78 = method184(Statics.field2433, Statics.field379, Statics.field509);
                                        if (var78 - Statics.field472 >= 800 || (class62.field761[Statics.field509][Statics.field2433 >> 7][Statics.field379 >> 7] & 0x4) == 0) {
                                            var77 = 3;
                                        } else {
                                            var77 = Statics.field509;
                                        }
                                    }
                                    var76 = var77;
                                } else {
                                    int var64;
                                    if (Statics.field22.field1315) {
                                        var64 = Statics.field509;
                                    } else {
                                        label1310: {
                                            int var65 = 3;
                                            if (Statics.field633 < 310) {
                                                int var66 = Statics.field2433 >> 7;
                                                int var67 = Statics.field379 >> 7;
                                                int var68 = Statics.field312.field1262 >> 7;
                                                int var69 = Statics.field312.field1259 >> 7;
                                                if (var66 < 0 || var67 < 0 || var66 >= 104 || var67 >= 104) {
                                                    var64 = Statics.field509;
                                                    break label1310;
                                                }
                                                if ((class62.field761[Statics.field509][var66][var67] & 0x4) != 0) {
                                                    var65 = Statics.field509;
                                                }
                                                int var70;
                                                if (var68 > var66) {
                                                    var70 = var68 - var66;
                                                } else {
                                                    var70 = var66 - var68;
                                                }
                                                int var71;
                                                if (var69 > var67) {
                                                    var71 = var69 - var67;
                                                } else {
                                                    var71 = var67 - var69;
                                                }
                                                if (var70 > var71) {
                                                    int var72 = var71 * 65536 / var70;
                                                    int var73 = 32768;
                                                    while (var66 != var68) {
                                                        if (var66 < var68) {
                                                            var66++;
                                                        } else if (var66 > var68) {
                                                            var66--;
                                                        }
                                                        if ((class62.field761[Statics.field509][var66][var67] & 0x4) != 0) {
                                                            var65 = Statics.field509;
                                                        }
                                                        var73 += var72;
                                                        if (var73 >= 65536) {
                                                            var73 -= 65536;
                                                            if (var67 < var69) {
                                                                var67++;
                                                            } else if (var67 > var69) {
                                                                var67--;
                                                            }
                                                            if ((class62.field761[Statics.field509][var66][var67] & 0x4) != 0) {
                                                                var65 = Statics.field509;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var74 = var70 * 65536 / var71;
                                                    int var75 = 32768;
                                                    while (var67 != var69) {
                                                        if (var67 < var69) {
                                                            var67++;
                                                        } else if (var67 > var69) {
                                                            var67--;
                                                        }
                                                        if ((class62.field761[Statics.field509][var66][var67] & 0x4) != 0) {
                                                            var65 = Statics.field509;
                                                        }
                                                        var75 += var74;
                                                        if (var75 >= 65536) {
                                                            var75 -= 65536;
                                                            if (var66 < var68) {
                                                                var66++;
                                                            } else if (var66 > var68) {
                                                                var66--;
                                                            }
                                                            if ((class62.field761[Statics.field509][var66][var67] & 0x4) != 0) {
                                                                var65 = Statics.field509;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field312.field1262 >= 0 && Statics.field312.field1259 >= 0 && Statics.field312.field1262 < 13312 && Statics.field312.field1259 < 13312) {
                                                if ((class62.field761[Statics.field509][Statics.field312.field1262 >> 7][Statics.field312.field1259 >> 7] & 0x4) != 0) {
                                                    var65 = Statics.field509;
                                                }
                                                var64 = var65;
                                            } else {
                                                var64 = Statics.field509;
                                            }
                                        }
                                    }
                                    var76 = var64;
                                }
                                int var79 = Statics.field2433;
                                int var80 = Statics.field472;
                                int var81 = Statics.field379;
                                int var82 = Statics.field633;
                                int var83 = Statics.field607;
                                for (int var84 = 0; var84 < 5; var84++) {
                                    if (field1001[var84]) {
                                        int var85 = (int) (Math.random() * (double) (field1175[var84] * 2 + 1) - (double) field1175[var84] + Math.sin((double) field1177[var84] / 100.0D * (double) field1178[var84]) * (double) field1176[var84]);
                                        if (var84 == 0) {
                                            Statics.field2433 += var85;
                                        }
                                        if (var84 == 1) {
                                            Statics.field472 += var85;
                                        }
                                        if (var84 == 2) {
                                            Statics.field379 += var85;
                                        }
                                        if (var84 == 3) {
                                            Statics.field607 = Statics.field607 + var85 & 0x7FF;
                                        }
                                        if (var84 == 4) {
                                            Statics.field633 += var85;
                                            if (Statics.field633 < 128) {
                                                Statics.field633 = 128;
                                            }
                                            if (Statics.field633 > 383) {
                                                Statics.field633 = 383;
                                            }
                                        }
                                    }
                                }
                                int var86 = class60.field735;
                                int var87 = class60.field736 * -261504029;
                                if (class60.field741 != 0) {
                                    var86 = class60.field742;
                                    var87 = class60.field743;
                                }
                                if (var86 >= var43 && var86 < var43 + var45 && var87 >= var44 && var87 < var44 + var46) {
                                    int var88 = var86 - var43;
                                    int var89 = var87 - var44;
                                    class136.field1997 = var88;
                                    class136.field1999 = var89;
                                    class136.field2002 = true;
                                    class136.field1998 = 0;
                                    class136.field2000 = false;
                                } else {
                                    class136.field2002 = false;
                                    class136.field1998 = 0;
                                }
                                method3176();
                                class283.method4601(var43, var44, var45, var46, 0);
                                method3176();
                                int var90 = class138.field2027;
                                class138.field2027 = field1011;
                                Statics.field512.method2520(Statics.field2433, Statics.field472, Statics.field379, Statics.field633, Statics.field607, var76);
                                class8.method68();
                                class138.field2027 = var90;
                                method3176();
                                Statics.field512.method2493();
                                field937 = 0;
                                boolean var91 = false;
                                int var92 = -1;
                                int var93 = class98.field1511;
                                int[] var94 = class98.field1512;
                                for (int var95 = 0; var95 < field959 + var93; var95++) {
                                    class79 var96;
                                    if (var95 < var93) {
                                        var96 = field1046[var94[var95]];
                                        if (field1055 == var94[var95]) {
                                            var91 = true;
                                            var92 = var95;
                                            continue;
                                        }
                                    } else {
                                        var96 = field973[field1158[var95 - var93]];
                                    }
                                    method157(var96, var95, var43, var44, var45, var46);
                                }
                                if (var91) {
                                    method157(field1046[field1055], var92, var43, var44, var45, var46);
                                }
                                for (int var97 = 0; var97 < field937; var97++) {
                                    int var98 = field1020[var97];
                                    int var99 = field1022[var97];
                                    int var100 = field1166[var97];
                                    int var101 = field1023[var97];
                                    boolean var102 = true;
                                    while (var102) {
                                        var102 = false;
                                        for (int var103 = 0; var103 < var97; var103++) {
                                            if (var99 + 2 > field1022[var103] - field1023[var103] && var99 - var101 < field1022[var103] + 2 && var98 - var100 < field1166[var103] + field1020[var103] && var98 + var100 > field1020[var103] - field1166[var103] && field1022[var103] - field1023[var103] < var99) {
                                                var99 = field1022[var103] - field1023[var103];
                                                var102 = true;
                                            }
                                        }
                                    }
                                    field1157 = field1020[var97];
                                    field1163 = field1022[var97] = var99;
                                    String var104 = field1191[var97];
                                    if (field1089 == 0) {
                                        int var105 = 16776960;
                                        if (field1131[var97] < 6) {
                                            var105 = field1182[field1131[var97]];
                                        }
                                        if (field1131[var97] == 6) {
                                            var105 = field1072 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field1131[var97] == 7) {
                                            var105 = field1072 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field1131[var97] == 8) {
                                            var105 = field1072 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field1131[var97] == 9) {
                                            int var106 = 150 - field1027[var97];
                                            if (var106 < 50) {
                                                var105 = var106 * 1280 + 16711680;
                                            } else if (var106 < 100) {
                                                var105 = 16776960 - (var106 - 50) * 327680;
                                            } else if (var106 < 150) {
                                                var105 = (var106 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field1131[var97] == 10) {
                                            int var107 = 150 - field1027[var97];
                                            if (var107 < 50) {
                                                var105 = var107 * 5 + 16711680;
                                            } else if (var107 < 100) {
                                                var105 = 16711935 - (var107 - 50) * 327680;
                                            } else if (var107 < 150) {
                                                var105 = (var107 - 100) * 327680 + 255 - (var107 - 100) * 5;
                                            }
                                        }
                                        if (field1131[var97] == 11) {
                                            int var108 = 150 - field1027[var97];
                                            if (var108 < 50) {
                                                var105 = 16777215 - var108 * 327685;
                                            } else if (var108 < 100) {
                                                var105 = (var108 - 50) * 327685 + 65280;
                                            } else if (var108 < 150) {
                                                var105 = 16777215 - (var108 - 100) * 327680;
                                            }
                                        }
                                        if (field1026[var97] == 0) {
                                            Statics.field766.method4476(var104, field1157 + var43, field1163 + var44, var105, 0);
                                        }
                                        if (field1026[var97] == 1) {
                                            Statics.field766.method4425(var104, field1157 + var43, field1163 + var44, var105, 0, field1072);
                                        }
                                        if (field1026[var97] == 2) {
                                            Statics.field766.method4426(var104, field1157 + var43, field1163 + var44, var105, 0, field1072);
                                        }
                                        if (field1026[var97] == 3) {
                                            Statics.field766.method4427(var104, field1157 + var43, field1163 + var44, var105, 0, field1072, 150 - field1027[var97]);
                                        }
                                        if (field1026[var97] == 4) {
                                            int var109 = (150 - field1027[var97]) * (Statics.field766.method4415(var104) + 100) / 150;
                                            class283.method4594(field1157 + var43 - 50, var44, field1157 + var43 + 50, var44 + var46);
                                            Statics.field766.method4420(var104, field1157 + var43 + 50 - var109, field1163 + var44, var105, 0);
                                            class283.method4628(var43, var44, var43 + var45, var44 + var46);
                                        }
                                        if (field1026[var97] == 5) {
                                            int var110 = 150 - field1027[var97];
                                            int var111 = 0;
                                            if (var110 < 25) {
                                                var111 = var110 - 25;
                                            } else if (var110 > 125) {
                                                var111 = var110 - 125;
                                            }
                                            class283.method4594(var43, field1163 + var44 - Statics.field766.field3632 - 1, var43 + var45, field1163 + var44 + 5);
                                            Statics.field766.method4476(var104, field1157 + var43, field1163 + var44 + var111, var105, 0);
                                            class283.method4628(var43, var44, var43 + var45, var44 + var46);
                                        }
                                    } else {
                                        Statics.field766.method4476(var104, field1157 + var43, field1163 + var44, 16776960, 0);
                                    }
                                }
                                if (field952 == 2) {
                                    method21((field955 - Statics.field608 << 7) + field1033, (field1198 - Statics.field587 << 7) + field1162, field957 * 2);
                                    if (field1157 > -1 && field944 % 20 < 10) {
                                        Statics.field281[0].method4795(field1157 + var43 - 12, field1163 + var44 - 28);
                                    }
                                }
                                ((class127) Statics.field2038).method2187(field958);
                                if (field1036 == 1) {
                                    Statics.field2321[field941 / 100].method4795(field1142 - 8, field1034 - 8);
                                }
                                if (field1036 == 2) {
                                    Statics.field2321[field941 / 100 + 4].method4795(field1142 - 8, field1034 - 8);
                                }
                                method474();
                                Statics.field2433 = var79;
                                Statics.field472 = var80;
                                Statics.field379 = var81;
                                Statics.field633 = var82;
                                Statics.field607 = var83;
                                if (field943) {
                                    byte var112 = 0;
                                    int var113 = class240.field3243 + class240.field3241 + var112;
                                    if (var113 == 0) {
                                        field943 = false;
                                    }
                                }
                                if (field943) {
                                    class283.method4601(var43, var44, var45, var46, 0);
                                    method1566(class227.field2861, false);
                                }
                                field1113[var10.field2781] = true;
                                class283.method4628(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2654 == 1338) {
                                method673(var10, var12, var13, var11);
                                class283.method4628(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2654 == 1339) {
                                method500(var10, var12, var13, var11);
                                class283.method4628(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2654 == 1400) {
                                Statics.field600.method4866(var12, var13, var10.field2665, var10.field2666, field944);
                            }
                            if (var10.field2654 == 1401) {
                                Statics.field600.method4867(var12, var13, var10.field2665, var10.field2666);
                            }
                        }
                        if (var10.field2652 == 0) {
                            if (!var10.field2756 && method2669(var10) && Statics.field13 != var10) {
                                continue;
                            }
                            if (!var10.field2756) {
                                if (var10.field2672 > var10.field2674 - var10.field2666) {
                                    var10.field2672 = var10.field2674 - var10.field2666;
                                }
                                if (var10.field2672 < 0) {
                                    var10.field2672 = 0;
                                }
                            }
                            method1038(arg0, var10.field2723, var19, var20, var21, var22, var12 - var10.field2771, var13 - var10.field2672, var11);
                            if (var10.field2774 != null) {
                                method1038(var10.field2774, var10.field2723, var19, var20, var21, var22, var12 - var10.field2771, var13 - var10.field2672, var11);
                            }
                            class69 var115 = (class69) field1088.method3281((long) var10.field2723);
                            if (var115 != null) {
                                int var116 = var115.field841;
                                if (class218.method1059(var116)) {
                                    Statics.field339 = null;
                                    method1038(Statics.field2406[var116], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field339 != null) {
                                        method1038(Statics.field339, -1412584499, var19, var20, var21, var22, Statics.field831, Statics.field609, var11);
                                        Statics.field339 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var117 = 0; var117 < 100; var117++) {
                                        field1113[var117] = true;
                                    }
                                } else {
                                    field1113[var11] = true;
                                }
                            }
                            class283.method4628(arg2, arg3, arg4, arg5);
                            class138.method2391();
                        }
                        if (field1041 || field1134[var11] || field1139 > 1) {
                            if (var10.field2652 == 0 && !var10.field2756 && var10.field2674 > var10.field2666) {
                                method148(var10.field2665 + var12, var13, var10.field2672, var10.field2666, var10.field2674);
                            }
                            if (var10.field2652 != 1) {
                                if (var10.field2652 == 2) {
                                    int var118 = 0;
                                    for (int var119 = 0; var119 < var10.field2657; var119++) {
                                        for (int var120 = 0; var120 < var10.field2661; var120++) {
                                            int var121 = (var10.field2716 + 32) * var120 + var12;
                                            int var122 = (var10.field2717 + 32) * var119 + var13;
                                            if (var118 < 20) {
                                                var121 += var10.field2718[var118];
                                                var122 += var10.field2719[var118];
                                            }
                                            if (var10.field2650[var118] > 0) {
                                                boolean var123 = false;
                                                boolean var124 = false;
                                                int var125 = var10.field2650[var118] - 1;
                                                if (var121 + 32 > arg2 && var121 < arg4 && var122 + 32 > arg3 && var122 < arg5 || Statics.field374 == var10 && field1093 == var118) {
                                                    class287 var126;
                                                    if (field1080 == 1 && Statics.field893 == var118 && Statics.field500 == var10.field2723) {
                                                        var126 = class258.method1700(var125, var10.field2727[var118], 2, 0, 2, false);
                                                    } else {
                                                        var126 = class258.method1700(var125, var10.field2727[var118], 1, 3153952, 2, false);
                                                    }
                                                    if (var126 == null) {
                                                        method1576(var10);
                                                    } else if (Statics.field374 == var10 && field1093 == var118) {
                                                        int var127 = class60.field735 - field976;
                                                        int var128 = class60.field736 * -261504029 - field1074;
                                                        if (var127 < 5 && var127 > -5) {
                                                            var127 = 0;
                                                        }
                                                        if (var128 < 5 && var128 > -5) {
                                                            var128 = 0;
                                                        }
                                                        if (field1044 < 5) {
                                                            var127 = 0;
                                                            var128 = 0;
                                                        }
                                                        var126.method4720(var121 + var127, var122 + var128, 128);
                                                        if (arg1 != -1) {
                                                            class218 var129 = arg0[arg1 & 0xFFFF];
                                                            if (var122 + var128 < class283.field3743 && var129.field2672 > 0) {
                                                                int var130 = field958 * (class283.field3743 - var122 - var128) / 3;
                                                                if (var130 > field958 * 10) {
                                                                    var130 = field958 * 10;
                                                                }
                                                                if (var130 > var129.field2672) {
                                                                    var130 = var129.field2672;
                                                                }
                                                                var129.field2672 -= var130;
                                                                field1074 += var130;
                                                                method1576(var129);
                                                            }
                                                            if (var122 + var128 + 32 > class283.field3746 && var129.field2672 < var129.field2674 - var129.field2666) {
                                                                int var131 = field958 * (var122 + var128 + 32 - class283.field3746) / 3;
                                                                if (var131 > field958 * 10) {
                                                                    var131 = field958 * 10;
                                                                }
                                                                if (var131 > var129.field2674 - var129.field2666 - var129.field2672) {
                                                                    var131 = var129.field2674 - var129.field2666 - var129.field2672;
                                                                }
                                                                var129.field2672 += var131;
                                                                field1074 -= var131;
                                                                method1576(var129);
                                                            }
                                                        }
                                                    } else if (Statics.field880 == var10 && field1038 == var118) {
                                                        var126.method4720(var121, var122, 128);
                                                    } else {
                                                        var126.method4795(var121, var122);
                                                    }
                                                }
                                            } else if (var10.field2720 != null && var118 < 20) {
                                                class287 var132 = var10.method3691(var118);
                                                if (var132 != null) {
                                                    var132.method4795(var121, var122);
                                                } else if (class218.field2648) {
                                                    method1576(var10);
                                                }
                                            }
                                            var118++;
                                        }
                                    }
                                } else if (var10.field2652 == 3) {
                                    int var133;
                                    if (method2871(var10)) {
                                        var133 = var10.field2676;
                                        if (Statics.field13 == var10 && var10.field2678 != 0) {
                                            var133 = var10.field2678;
                                        }
                                    } else {
                                        var133 = var10.field2675;
                                        if (Statics.field13 == var10 && var10.field2778 != 0) {
                                            var133 = var10.field2778;
                                        }
                                    }
                                    if (var10.field2679) {
                                        switch(var10.field2680.field3757) {
                                            case 1:
                                                class283.method4602(var12, var13, var10.field2665, var10.field2666, var10.field2675, var10.field2676, 256 - (var10.field2732 & 0xFF), 256 - (var10.field2682 & 0xFF));
                                                break;
                                            case 2:
                                                class283.method4603(var12, var13, var10.field2665, var10.field2666, var10.field2675, var10.field2676, 256 - (var10.field2732 & 0xFF), 256 - (var10.field2682 & 0xFF));
                                                break;
                                            case 3:
                                                class283.method4604(var12, var13, var10.field2665, var10.field2666, var10.field2675, var10.field2676, 256 - (var10.field2732 & 0xFF), 256 - (var10.field2682 & 0xFF));
                                                break;
                                            case 4:
                                                class283.method4613(var12, var13, var10.field2665, var10.field2666, var10.field2675, var10.field2676, 256 - (var10.field2732 & 0xFF), 256 - (var10.field2682 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class283.method4601(var12, var13, var10.field2665, var10.field2666, var133);
                                                } else {
                                                    class283.method4600(var12, var13, var10.field2665, var10.field2666, var133, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class283.method4608(var12, var13, var10.field2665, var10.field2666, var133);
                                    } else {
                                        class283.method4634(var12, var13, var10.field2665, var10.field2666, var133, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2652 == 4) {
                                    class265 var134 = var10.method3694();
                                    if (var134 != null) {
                                        String var135 = var10.field2710;
                                        int var136;
                                        if (method2871(var10)) {
                                            var136 = var10.field2676;
                                            if (Statics.field13 == var10 && var10.field2678 != 0) {
                                                var136 = var10.field2678;
                                            }
                                            if (var10.field2711.length() > 0) {
                                                var135 = var10.field2711;
                                            }
                                        } else {
                                            var136 = var10.field2675;
                                            if (Statics.field13 == var10 && var10.field2778 != 0) {
                                                var136 = var10.field2778;
                                            }
                                        }
                                        if (var10.field2756 && var10.field2694 != -1) {
                                            class258 var137 = class258.method1923(var10.field2694);
                                            var135 = var137.field3487;
                                            if (var135 == null) {
                                                var135 = "null";
                                            }
                                            if ((var137.field3498 == 1 || var10.field2758 != 1) && var10.field2758 != -1) {
                                                var135 = class90.method2296(16748608) + var135 + class90.field1405 + " " + 'x' + method3179(var10.field2758);
                                            }
                                        }
                                        if (field1091 == var10) {
                                            class227 var10000 = (class227) null;
                                            var135 = class227.field3009;
                                            var136 = var10.field2675;
                                        }
                                        if (!var10.field2756) {
                                            var135 = method332(var135, var10);
                                        }
                                        var134.method4424(var135, var12, var13, var10.field2665, var10.field2666, var136, var10.field2715 ? 0 : -1, var10.field2773, var10.field2683, var10.field2712);
                                    } else if (class218.field2648) {
                                        method1576(var10);
                                    }
                                } else if (var10.field2652 == 5) {
                                    if (var10.field2756) {
                                        class287 var139;
                                        if (var10.field2694 == -1) {
                                            var139 = var10.method3690(false);
                                        } else {
                                            var139 = class258.method1700(var10.field2694, var10.field2758, var10.field2642, var10.field2690, var10.field2708, false);
                                        }
                                        if (var139 != null) {
                                            int var140 = var139.field3774;
                                            int var141 = var139.field3771;
                                            if (var10.field2688) {
                                                class283.method4594(var12, var13, var10.field2665 + var12, var10.field2666 + var13);
                                                int var142 = (var10.field2665 + (var140 - 1)) / var140;
                                                int var143 = (var10.field2666 + (var141 - 1)) / var141;
                                                for (int var144 = 0; var144 < var142; var144++) {
                                                    for (int var145 = 0; var145 < var143; var145++) {
                                                        if (var10.field2687 != 0) {
                                                            var139.method4727(var140 / 2 + var140 * var144 + var12, var141 / 2 + var141 * var145 + var13, var10.field2687, 4096);
                                                        } else if (var14 == 0) {
                                                            var139.method4795(var140 * var144 + var12, var141 * var145 + var13);
                                                        } else {
                                                            var139.method4720(var140 * var144 + var12, var141 * var145 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class283.method4628(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var146 = var10.field2665 * 4096 / var140;
                                                if (var10.field2687 != 0) {
                                                    var139.method4727(var10.field2665 / 2 + var12, var10.field2666 / 2 + var13, var10.field2687, var146);
                                                } else if (var14 != 0) {
                                                    var139.method4722(var12, var13, var10.field2665, var10.field2666, 256 - (var14 & 0xFF));
                                                } else if (var10.field2665 == var140 && var10.field2666 == var141) {
                                                    var139.method4795(var12, var13);
                                                } else {
                                                    var139.method4742(var12, var13, var10.field2665, var10.field2666);
                                                }
                                            }
                                        } else if (class218.field2648) {
                                            method1576(var10);
                                        }
                                    } else {
                                        class287 var138 = var10.method3690(method2871(var10));
                                        if (var138 != null) {
                                            var138.method4795(var12, var13);
                                        } else if (class218.field2648) {
                                            method1576(var10);
                                        }
                                    }
                                } else if (var10.field2652 == 6) {
                                    boolean var147 = method2871(var10);
                                    int var148;
                                    if (var147) {
                                        var148 = var10.field2714;
                                    } else {
                                        var148 = var10.field2776;
                                    }
                                    class135 var149 = null;
                                    int var150 = 0;
                                    if (var10.field2694 != -1) {
                                        class258 var151 = class258.method1923(var10.field2694);
                                        if (var151 != null) {
                                            class258 var152 = var151.method4240(var10.field2758);
                                            var149 = var152.method4246(1);
                                            if (var149 == null) {
                                                method1576(var10);
                                            } else {
                                                var149.method2305();
                                                var150 = var149.field2130 / 2;
                                            }
                                        }
                                    } else if (var10.field2693 == 5) {
                                        if (var10.field2713 == 0) {
                                            var149 = field1009.method3650((class262) null, -1, (class262) null, -1);
                                        } else {
                                            var149 = Statics.field312.method1077();
                                        }
                                    } else if (var148 == -1) {
                                        var149 = var10.method3692((class262) null, -1, var147, Statics.field312.field898);
                                        if (var149 == null && class218.field2648) {
                                            method1576(var10);
                                        }
                                    } else {
                                        class262 var153 = class262.method1389(var148);
                                        var149 = var10.method3692(var153, var10.field2772, var147, Statics.field312.field898);
                                        if (var149 == null && class218.field2648) {
                                            method1576(var10);
                                        }
                                    }
                                    class138.method2454(var10.field2665 / 2 + var12, var10.field2666 / 2 + var13);
                                    int var154 = var10.field2704 * class138.field2041[var10.field2701] >> 16;
                                    int var155 = var10.field2704 * class138.field2030[var10.field2701] >> 16;
                                    if (var149 != null) {
                                        if (var10.field2756) {
                                            var149.method2305();
                                            if (var10.field2707) {
                                                var149.method2318(0, var10.field2702, var10.field2703, var10.field2701, var10.field2699, var10.field2700 + var150 + var154, var10.field2700 + var155, var10.field2704);
                                            } else {
                                                var149.method2340(0, var10.field2702, var10.field2703, var10.field2701, var10.field2699, var10.field2700 + var150 + var154, var10.field2700 + var155);
                                            }
                                        } else {
                                            var149.method2340(0, var10.field2702, 0, var10.field2701, 0, var154, var155);
                                        }
                                    }
                                    class138.method2393();
                                } else {
                                    if (var10.field2652 == 7) {
                                        class265 var156 = var10.method3694();
                                        if (var156 == null) {
                                            if (class218.field2648) {
                                                method1576(var10);
                                            }
                                            continue;
                                        }
                                        int var157 = 0;
                                        for (int var158 = 0; var158 < var10.field2657; var158++) {
                                            for (int var159 = 0; var159 < var10.field2661; var159++) {
                                                if (var10.field2650[var157] > 0) {
                                                    class258 var160 = class258.method1923(var10.field2650[var157] - 1);
                                                    String var161;
                                                    if (var160.field3498 != 1 && var10.field2727[var157] == 1) {
                                                        var161 = class90.method2296(16748608) + var160.field3487 + class90.field1405;
                                                    } else {
                                                        var161 = class90.method2296(16748608) + var160.field3487 + class90.field1405 + " " + 'x' + method3179(var10.field2727[var157]);
                                                    }
                                                    int var162 = (var10.field2716 + 115) * var159 + var12;
                                                    int var163 = (var10.field2717 + 12) * var158 + var13;
                                                    if (var10.field2773 == 0) {
                                                        var156.method4420(var161, var162, var163, var10.field2675, var10.field2715 ? 0 : -1);
                                                    } else if (var10.field2773 == 1) {
                                                        var156.method4476(var161, var10.field2665 / 2 + var162, var163, var10.field2675, var10.field2715 ? 0 : -1);
                                                    } else {
                                                        var156.method4422(var161, var10.field2665 + var162 - 1, var163, var10.field2675, var10.field2715 ? 0 : -1);
                                                    }
                                                }
                                                var157++;
                                            }
                                        }
                                    }
                                    if (var10.field2652 == 8 && Statics.field360 == var10 && field1078 == field1062) {
                                        int var164 = 0;
                                        int var165 = 0;
                                        class265 var166 = Statics.field502;
                                        String var167 = var10.field2710;
                                        String var168 = method332(var167, var10);
                                        while (var168.length() > 0) {
                                            int var169 = var168.indexOf(class90.field1403);
                                            String var170;
                                            if (var169 == -1) {
                                                var170 = var168;
                                                var168 = "";
                                            } else {
                                                var170 = var168.substring(0, var169);
                                                var168 = var168.substring(var169 + 4);
                                            }
                                            int var171 = var166.method4415(var170);
                                            if (var171 > var164) {
                                                var164 = var171;
                                            }
                                            var165 += var166.field3632 + 1;
                                        }
                                        var164 += 6;
                                        var165 += 7;
                                        int var172 = var10.field2665 + var12 - 5 - var164;
                                        int var173 = var10.field2666 + var13 + 5;
                                        if (var172 < var12 + 5) {
                                            var172 = var12 + 5;
                                        }
                                        if (var164 + var172 > arg4) {
                                            var172 = arg4 - var164;
                                        }
                                        if (var165 + var173 > arg5) {
                                            var173 = arg5 - var165;
                                        }
                                        class283.method4601(var172, var173, var164, var165, 16777120);
                                        class283.method4608(var172, var173, var164, var165, 0);
                                        String var174 = var10.field2710;
                                        int var175 = var166.field3632 + var173 + 2;
                                        String var176 = method332(var174, var10);
                                        while (var176.length() > 0) {
                                            int var177 = var176.indexOf(class90.field1403);
                                            String var178;
                                            if (var177 == -1) {
                                                var178 = var176;
                                                var176 = "";
                                            } else {
                                                var178 = var176.substring(0, var177);
                                                var176 = var176.substring(var177 + 4);
                                            }
                                            var166.method4420(var178, var172 + 3, var175, 0, -1);
                                            var175 += var166.field3632 + 1;
                                        }
                                    }
                                    if (var10.field2652 == 9) {
                                        int var179;
                                        int var180;
                                        int var181;
                                        int var182;
                                        if (var10.field2684) {
                                            var179 = var12;
                                            var180 = var10.field2666 + var13;
                                            var181 = var10.field2665 + var12;
                                            var182 = var13;
                                        } else {
                                            var179 = var12;
                                            var180 = var13;
                                            var181 = var10.field2665 + var12;
                                            var182 = var10.field2666 + var13;
                                        }
                                        if (var10.field2685 == 1) {
                                            class283.method4656(var179, var180, var181, var182, var10.field2675);
                                        } else {
                                            int var185 = var10.field2675;
                                            int var186 = var10.field2685;
                                            int var187 = var181 - var179;
                                            int var188 = var182 - var180;
                                            int var189 = var187 >= 0 ? var187 : -var187;
                                            int var190 = var188 >= 0 ? var188 : -var188;
                                            int var191 = var189;
                                            if (var189 < var190) {
                                                var191 = var190;
                                            }
                                            if (var191 != 0) {
                                                int var192 = (var187 << 16) / var191;
                                                int var193 = (var188 << 16) / var191;
                                                if (var193 <= var192) {
                                                    var192 = -var192;
                                                } else {
                                                    var193 = -var193;
                                                }
                                                int var194 = var186 * var193 >> 17;
                                                int var195 = var186 * var193 + 1 >> 17;
                                                int var196 = var186 * var192 >> 17;
                                                int var197 = var186 * var192 + 1 >> 17;
                                                int var198 = var179 - class283.field3748;
                                                int var199 = var180 - class283.field3743;
                                                int var200 = var194 + var198;
                                                int var201 = var198 - var195;
                                                int var202 = var187 + var198 - var195;
                                                int var203 = var187 + var198 + var194;
                                                int var204 = var196 + var199;
                                                int var205 = var199 - var197;
                                                int var206 = var188 + var199 - var197;
                                                int var207 = var188 + var199 + var196;
                                                class138.method2399(var200, var201, var202);
                                                class138.method2402(var204, var205, var206, var200, var201, var202, var185);
                                                class138.method2399(var200, var202, var203);
                                                class138.method2402(var204, var206, var207, var200, var202, var203, var185);
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

    @ObfuscatedName("aj.hk(Ljava/lang/String;Lhi;I)Ljava/lang/String;")
    public static String method332(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3174(arg1, var2 - 1);
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
                if (Statics.field851 != null) {
                    var8 = class272.method2676(Statics.field851.field2233);
                    if (Statics.field851.field2235 != null) {
                        var8 = (String) Statics.field851.field2235;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("gf.hx(II)Ljava/lang/String;")
    public static final String method3179(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class90.field1397 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class90.method2296(65408) + var1.substring(0, var1.length() - 8) + class227.field3012 + " " + class90.field1399 + var1 + class90.field1400 + class90.field1405;
        } else if (var1.length() > 6) {
            return " " + class90.method2296(16777215) + var1.substring(0, var1.length() - 4) + class227.field2955 + " " + class90.field1399 + var1 + class90.field1400 + class90.field1405;
        } else {
            return " " + class90.method2296(16776960) + var1 + class90.field1405;
        }
    }

    @ObfuscatedName("client.hu(ZI)V")
    public final void method1305(boolean arg0) {
        method3729(field995, Statics.field710, Statics.field1, arg0);
    }

    @ObfuscatedName("client.hy(Lhi;I)V")
    public void method1112(class218 arg0) {
        class218 var2 = arg0.field2681 == -1 ? null : class218.method1532(arg0.field2681);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field710;
            var4 = Statics.field1;
        } else {
            var3 = var2.field2665;
            var4 = var2.field2666;
        }
        method492(arg0, var3, var4, false);
        method120(arg0, var3, var4);
    }

    @ObfuscatedName("ay.hb([Lhi;Lhi;ZI)V")
    public static void method701(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2673 == 0 ? arg1.field2665 : arg1.field2673;
        int var4 = arg1.field2674 == 0 ? arg1.field2666 : arg1.field2674;
        method172(arg0, arg1.field2723, var3, var4, arg2);
        if (arg1.field2774 != null) {
            method172(arg1.field2774, arg1.field2723, var3, var4, arg2);
        }
        class69 var5 = (class69) field1088.method3281((long) arg1.field2723);
        if (var5 != null) {
            int var6 = var5.field841;
            if (class218.method1059(var6)) {
                method172(Statics.field2406[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2654 == 1337) {
        }
    }

    @ObfuscatedName("hi.hr(IIIZB)V")
    public static final void method3729(int arg0, int arg1, int arg2, boolean arg3) {
        if (class218.method1059(arg0)) {
            method172(Statics.field2406[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("q.hp([Lhi;IIIZB)V")
    public static void method172(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2681 == arg1) {
                method492(var6, arg2, arg3, arg4);
                method120(var6, arg2, arg3);
                if (var6.field2771 > var6.field2673 - var6.field2665) {
                    var6.field2771 = var6.field2673 - var6.field2665;
                }
                if (var6.field2771 < 0) {
                    var6.field2771 = 0;
                }
                if (var6.field2672 > var6.field2674 - var6.field2666) {
                    var6.field2672 = var6.field2674 - var6.field2666;
                }
                if (var6.field2672 < 0) {
                    var6.field2672 = 0;
                }
                if (var6.field2652 == 0) {
                    method701(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("au.hc(Lhi;IIZI)V")
    public static void method492(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2665;
        int var5 = arg0.field2666;
        if (arg0.field2638 == 0) {
            arg0.field2665 = arg0.field2661;
        } else if (arg0.field2638 == 1) {
            arg0.field2665 = arg1 - arg0.field2661;
        } else if (arg0.field2638 == 2) {
            arg0.field2665 = arg0.field2661 * arg1 >> 14;
        }
        if (arg0.field2671 == 0) {
            arg0.field2666 = arg0.field2657;
        } else if (arg0.field2671 == 1) {
            arg0.field2666 = arg2 - arg0.field2657;
        } else if (arg0.field2671 == 2) {
            arg0.field2666 = arg0.field2657 * arg2 >> 14;
        }
        if (arg0.field2638 == 4) {
            arg0.field2665 = arg0.field2784 * arg0.field2666 / arg0.field2668;
        }
        if (arg0.field2671 == 4) {
            arg0.field2666 = arg0.field2668 * arg0.field2665 / arg0.field2784;
        }
        if (field1097 && arg0.field2652 == 0) {
            if (arg0.field2666 < 5 && arg0.field2665 < 5) {
                arg0.field2666 = 5;
                arg0.field2665 = 5;
            } else {
                if (arg0.field2666 <= 0) {
                    arg0.field2666 = 5;
                }
                if (arg0.field2665 <= 0) {
                    arg0.field2665 = 5;
                }
            }
        }
        if (arg0.field2654 == 1337) {
            field1099 = arg0;
        }
        if (arg3 && arg0.field2697 != null && (arg0.field2665 != var4 || arg0.field2666 != var5)) {
            class71 var6 = new class71();
            var6.field856 = arg0;
            var6.field857 = arg0.field2697;
            field965.method3317(var6);
        }
    }

    @ObfuscatedName("v.hw(Lhi;III)V")
    public static void method120(class218 arg0, int arg1, int arg2) {
        if (arg0.field2655 == 0) {
            arg0.field2663 = arg0.field2659;
        } else if (arg0.field2655 == 1) {
            arg0.field2663 = (arg1 - arg0.field2665) / 2 + arg0.field2659;
        } else if (arg0.field2655 == 2) {
            arg0.field2663 = arg1 - arg0.field2665 - arg0.field2659;
        } else if (arg0.field2655 == 3) {
            arg0.field2663 = arg0.field2659 * arg1 >> 14;
        } else if (arg0.field2655 == 4) {
            arg0.field2663 = (arg0.field2659 * arg1 >> 14) + (arg1 - arg0.field2665) / 2;
        } else {
            arg0.field2663 = arg1 - arg0.field2665 - (arg0.field2659 * arg1 >> 14);
        }
        if (arg0.field2735 == 0) {
            arg0.field2664 = arg0.field2660;
        } else if (arg0.field2735 == 1) {
            arg0.field2664 = (arg2 - arg0.field2666) / 2 + arg0.field2660;
        } else if (arg0.field2735 == 2) {
            arg0.field2664 = arg2 - arg0.field2666 - arg0.field2660;
        } else if (arg0.field2735 == 3) {
            arg0.field2664 = arg0.field2660 * arg2 >> 14;
        } else if (arg0.field2735 == 4) {
            arg0.field2664 = (arg0.field2660 * arg2 >> 14) + (arg2 - arg0.field2666) / 2;
        } else {
            arg0.field2664 = arg2 - arg0.field2666 - (arg0.field2660 * arg2 >> 14);
        }
        if (!field1097 || arg0.field2652 != 0) {
            return;
        }
        if (arg0.field2663 < 0) {
            arg0.field2663 = 0;
        } else if (arg0.field2665 + arg0.field2663 > arg1) {
            arg0.field2663 = arg1 - arg0.field2665;
        }
        if (arg0.field2664 < 0) {
            arg0.field2664 = 0;
        } else if (arg0.field2666 + arg0.field2664 > arg2) {
            arg0.field2664 = arg2 - arg0.field2666;
        }
    }

    @ObfuscatedName("y.ho(IIIIII)V")
    public static final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field754[0].method4681(arg0, arg1);
        Statics.field754[1].method4681(arg0, arg1 + arg3 - 16);
        class283.method4601(arg0, arg1 + 16, 16, arg3 - 32, field1003);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class283.method4601(arg0, arg1 + 16 + var6, 16, var5, field1004);
        class283.method4612(arg0, arg1 + 16 + var6, var5, field1180);
        class283.method4612(arg0 + 1, arg1 + 16 + var6, var5, field1180);
        class283.method4618(arg0, arg1 + 16 + var6, 16, field1180);
        class283.method4618(arg0, arg1 + 17 + var6, 16, field1180);
        class283.method4612(arg0 + 15, arg1 + 16 + var6, var5, field1005);
        class283.method4612(arg0 + 14, arg1 + 17 + var6, var5 - 1, field1005);
        class283.method4618(arg0, arg1 + 15 + var6 + var5, 16, field1005);
        class283.method4618(arg0 + 1, arg1 + 14 + var6 + var5, 15, field1005);
    }

    @ObfuscatedName("fd.hv(Lhi;B)Z")
    public static final boolean method2871(class218 arg0) {
        if (arg0.field2763 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2763.length; var1++) {
            int var2 = method3174(arg0, var1);
            int var3 = arg0.field2764[var1];
            if (arg0.field2763[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2763[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2763[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gv.ha(Lhi;IS)I")
    public static final int method3174(class218 arg0, int arg1) {
        if (arg0.field2749 == null || arg1 >= arg0.field2749.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2749[arg1];
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
                    var7 = field1060[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1138[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field934[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method1532(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class258.method1923(var12).field3500 || field1104)) {
                        for (int var13 = 0; var13 < var11.field2650.length; var13++) {
                            if (var12 + 1 == var11.field2650[var13]) {
                                var7 += var11.field2727[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2604[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class224.field2836[field1138[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2604[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field312.field903;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class224.field2837[var14]) {
                            var7 += field1138[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method1532(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class258.method1923(var18).field3500 || field1104)) {
                        for (int var19 = 0; var19 < var17.field2650.length; var19++) {
                            if (var18 + 1 == var17.field2650[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field971;
                }
                if (var6 == 12) {
                    var7 = field1039;
                }
                if (var6 == 13) {
                    int var20 = class213.field2604[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class213.method13(var22);
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
                    var7 = (Statics.field312.field1262 >> 7) + Statics.field608;
                }
                if (var6 == 19) {
                    var7 = (Statics.field312.field1259 >> 7) + Statics.field587;
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

    @ObfuscatedName("af.ir(Lhi;Lif;IIZB)V")
    public static final void method476(class218 arg0, class258 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3478;
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
            var7 = class227.field2853;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class90.method2296(16748608) + arg1.field3487;
        int var11 = arg1.field3527;
        int var13 = arg0.field2723;
        if (field1064 || field1156 >= 500) {
            return;
        }
        field1071[field1156] = var7;
        field1035[field1156] = var9;
        field1021[field1156] = var6;
        field1070[field1156] = var11;
        field1067[field1156] = arg2;
        field1068[field1156] = var13;
        field1132[field1156] = arg4;
        field1156++;
    }

    @ObfuscatedName("fq.iw(IIIIIIII)V")
    public static final void method3129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class218.method1059(arg0)) {
            Statics.method2679(Statics.field2406[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("bd.io(III)V")
    public static final void method1029(int arg0, int arg1) {
        if (class218.method1059(arg0)) {
            method1031(Statics.field2406[arg0], arg1);
        }
    }

    @ObfuscatedName("bq.il([Lhi;II)V")
    public static final void method1031(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2652 == 0) {
                    if (var3.field2774 != null) {
                        method1031(var3.field2774, arg1);
                    }
                    class69 var4 = (class69) field1088.method3281((long) var3.field2723);
                    if (var4 != null) {
                        method1029(var4.field841, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2757 != null) {
                    class71 var5 = new class71();
                    var5.field856 = var3;
                    var5.field857 = var3.field2757;
                    class85.method3622(var5);
                }
                if (arg1 == 1 && var3.field2745 != null) {
                    if (var3.field2698 >= 0) {
                        class218 var6 = class218.method1532(var3.field2723);
                        if (var6 == null || var6.field2774 == null || var3.field2698 >= var6.field2774.length || var6.field2774[var3.field2698] != var3) {
                            continue;
                        }
                    }
                    class71 var7 = new class71();
                    var7.field856 = var3;
                    var7.field857 = var3.field2745;
                    class85.method3622(var7);
                }
            }
        }
    }

    @ObfuscatedName("bp.ip(Lhi;III)V")
    public static final void method1006(class218 arg0, int arg1, int arg2) {
        if (field1108 != null || field1064 || arg0 == null || method1030(arg0) == null) {
            return;
        }
        field1108 = arg0;
        field1174 = method1030(arg0);
        field1102 = arg1;
        field1103 = arg2;
        Statics.field622 = 0;
        field1111 = false;
        int var3 = field1156 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field319 = new class91();
        Statics.field319.field1409 = field1067[var3];
        Statics.field319.field1407 = field1068[var3];
        Statics.field319.field1408 = field1021[var3];
        Statics.field319.field1410 = field1070[var3];
        Statics.field319.field1412 = field1071[var3];
    }

    @ObfuscatedName("client.is(I)V")
    public final void method1113() {
        method1576(field1108);
        Statics.field622++;
        if (field1100 && field1105) {
            int var1 = class60.field735;
            int var2 = class60.field736 * -261504029;
            int var3 = var1 - field1102;
            int var4 = var2 - field1103;
            if (var3 < field1106) {
                var3 = field1106;
            }
            if (field1108.field2665 + var3 > field1106 + field1174.field2665) {
                var3 = field1106 + field1174.field2665 - field1108.field2665;
            }
            if (var4 < field1107) {
                var4 = field1107;
            }
            if (field1108.field2666 + var4 > field1107 + field1174.field2666) {
                var4 = field1107 + field1174.field2666 - field1108.field2666;
            }
            int var5 = var3 - field949;
            int var6 = var4 - field1110;
            int var7 = field1108.field2726;
            if (Statics.field622 > field1108.field2649 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1111 = true;
            }
            int var8 = field1174.field2771 + (var3 - field1106);
            int var9 = field1174.field2672 + (var4 - field1107);
            if (field1108.field2739 != null && field1111) {
                class71 var10 = new class71();
                var10.field856 = field1108;
                var10.field858 = var8;
                var10.field859 = var9;
                var10.field857 = field1108.field2739;
                class85.method3622(var10);
            }
            if (class60.field734 == 0) {
                if (field1111) {
                    if (field1108.field2740 != null) {
                        class71 var11 = new class71();
                        var11.field856 = field1108;
                        var11.field858 = var8;
                        var11.field859 = var9;
                        var11.field861 = field1186;
                        var11.field857 = field1108.field2740;
                        class85.method3622(var11);
                    }
                    if (field1186 != null && Statics.method1460(field1108) != null) {
                        field978.method3139(47);
                        field978.method2937(field1108.field2694);
                        field978.method2946(field1186.field2723);
                        field978.method3041(field1108.field2698);
                        field978.method2944(field1108.field2723);
                        field978.method3041(field1186.field2698);
                        field978.method3030(field1186.field2694);
                    }
                } else if (this.method1235()) {
                    this.method1111(field949 + field1102, field1110 + field1103);
                } else if (field1156 > 0) {
                    int var12 = field949 + field1102;
                    int var13 = field1110 + field1103;
                    class91 var14 = Statics.field319;
                    method4397(var14.field1409, var14.field1407, var14.field1408, var14.field1410, var14.field1412, var14.field1412, var12, var13);
                    Statics.field319 = null;
                }
                field1108 = null;
            }
        } else if (Statics.field622 > 1) {
            field1108 = null;
        }
    }

    @ObfuscatedName("ce.ii(Lhi;I)V")
    public static void method1576(class218 arg0) {
        if (field1081 == arg0.field2782) {
            field1113[arg0.field2781] = true;
        }
    }

    @ObfuscatedName("fc.ix(B)V")
    public static void method2807() {
        for (class69 var0 = (class69) field1088.method3276(); var0 != null; var0 = (class69) field1088.method3277()) {
            int var1 = var0.field841;
            if (class218.method1059(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field2406[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2756;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2469;
                    class218 var6 = class218.method1532(var5);
                    if (var6 != null) {
                        method1576(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.ie(Lhi;I)Lhi;")
    public static class218 method1030(class218 arg0) {
        class218 var1 = Statics.method1460(arg0);
        if (var1 == null) {
            var1 = arg0.field2725;
        }
        return var1;
    }

    @ObfuscatedName("fr.iy([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2742(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ft.in(II)V")
    public static final void method2818(int arg0) {
        if (!class218.method1059(arg0)) {
            return;
        }
        class218[] var1 = Statics.field2406[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2772 = 0;
                var3.field2748 = 0;
            }
        }
    }

    @ObfuscatedName("bp.iv([Lhi;IB)V")
    public static final void method1005(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2681 == arg1 && (!var3.field2756 || !method2669(var3))) {
                if (var3.field2652 == 0) {
                    if (!var3.field2756 && method2669(var3) && Statics.field13 != var3) {
                        continue;
                    }
                    method1005(arg0, var3.field2723);
                    if (var3.field2774 != null) {
                        method1005(var3.field2774, var3.field2723);
                    }
                    class69 var4 = (class69) field1088.method3281((long) var3.field2723);
                    if (var4 != null) {
                        int var5 = var4.field841;
                        if (class218.method1059(var5)) {
                            method1005(Statics.field2406[var5], -1);
                        }
                    }
                }
                if (var3.field2652 == 6) {
                    if (var3.field2776 != -1 || var3.field2714 != -1) {
                        boolean var6 = method2871(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2714;
                        } else {
                            var7 = var3.field2776;
                        }
                        if (var7 != -1) {
                            class262 var8 = class262.method1389(var7);
                            var3.field2748 += field958;
                            while (var3.field2748 > var8.field3596[var3.field2772]) {
                                var3.field2748 -= var8.field3596[var3.field2772];
                                var3.field2772++;
                                if (var3.field2772 >= var8.field3595.length) {
                                    var3.field2772 -= var8.field3592;
                                    if (var3.field2772 < 0 || var3.field2772 >= var8.field3595.length) {
                                        var3.field2772 = 0;
                                    }
                                }
                                method1576(var3);
                            }
                        }
                    }
                    if (var3.field2706 != 0 && !var3.field2756) {
                        int var9 = var3.field2706 >> 16;
                        int var10 = var3.field2706 << 16 >> 16;
                        int var11 = field958 * var9;
                        int var12 = field958 * var10;
                        var3.field2701 = var3.field2701 + var11 & 0x7FF;
                        var3.field2702 = var3.field2702 + var12 & 0x7FF;
                        method1576(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.iu(IB)V")
    public static final void method49(int arg0) {
        method2807();
        class83.method918();
        int var1 = class243.method2866(arg0).field3273;
        if (var1 == 0) {
            return;
        }
        int var2 = class213.field2604[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class138.method2442(0.9D);
                ((class127) Statics.field2038).method2182(0.9D);
            }
            if (var2 == 2) {
                class138.method2442(0.8D);
                ((class127) Statics.field2038).method2182(0.8D);
            }
            if (var2 == 3) {
                class138.method2442(0.7D);
                ((class127) Statics.field2038).method2182(0.7D);
            }
            if (var2 == 4) {
                class138.method2442(0.6D);
                ((class127) Statics.field2038).method2182(0.6D);
            }
            class258.field3484.method3259();
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
            if (field1025 != var3) {
                if (field1025 == 0 && field1096 != -1) {
                    class205.method1033(Statics.field3387, field1096, 0, var3, false);
                    field1164 = false;
                } else if (var3 == 0) {
                    Statics.field2502.method3460();
                    class205.field2508 = 1;
                    Statics.field2503 = null;
                    field1164 = false;
                } else {
                    class205.method3755(var3);
                }
                field1025 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field975 = 127;
            }
            if (var2 == 1) {
                field975 = 96;
            }
            if (var2 == 2) {
                field975 = 64;
            }
            if (var2 == 3) {
                field975 = 32;
            }
            if (var2 == 4) {
                field975 = 0;
            }
        }
        if (var1 == 5) {
            field1063 = var2;
        }
        if (var1 == 6) {
            field1089 = var2;
        }
        if (var1 == 9) {
            field1090 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1149 = 127;
            }
            if (var2 == 1) {
                field1149 = 96;
            }
            if (var2 == 2) {
                field1149 = 64;
            }
            if (var2 == 3) {
                field1149 = 32;
            }
            if (var2 == 4) {
                field1149 = 0;
            }
        }
        if (var1 == 17) {
            field1095 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class93[] var4 = new class93[] { class93.field1423, class93.field1425, class93.field1424, class93.field1427 };
            field960 = (class93) class170.method3644(var4, var2);
            if (field960 == null) {
                field960 = class93.field1427;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field1055 = -1;
            } else {
                field1055 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class93[] var5 = new class93[] { class93.field1423, class93.field1425, class93.field1424, class93.field1427 };
        field1118 = (class93) class170.method3644(var5, var2);
        if (field1118 == null) {
            field1118 = class93.field1427;
        }
    }

    @ObfuscatedName("x.ig(Lhi;I)V")
    public static final void method12(class218 arg0) {
        int var1 = arg0.field2654;
        if (var1 == 324) {
            if (field1199 == -1) {
                field1199 = arg0.field2747;
                field1101 = arg0.field2686;
            }
            if (field1009.field2616) {
                arg0.field2747 = field1199;
            } else {
                arg0.field2747 = field1101;
            }
        } else if (var1 == 325) {
            if (field1199 == -1) {
                field1199 = arg0.field2747;
                field1101 = arg0.field2686;
            }
            if (field1009.field2616) {
                arg0.field2747 = field1101;
            } else {
                arg0.field2747 = field1199;
            }
        } else if (var1 == 327) {
            arg0.field2701 = 150;
            arg0.field2702 = (int) (Math.sin((double) field944 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2693 = 5;
            arg0.field2713 = 0;
        } else if (var1 == 328) {
            arg0.field2701 = 150;
            arg0.field2702 = (int) (Math.sin((double) field944 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2693 = 5;
            arg0.field2713 = 1;
        }
    }

    @ObfuscatedName("cr.id(I)V")
    public static final void method1405() {
        field978.method3139(187);
        for (class69 var0 = (class69) field1088.method3276(); var0 != null; var0 = (class69) field1088.method3277()) {
            if (var0.field839 == 0 || var0.field839 == 3) {
                method116(var0, true);
            }
        }
        if (field1091 != null) {
            method1576(field1091);
            field1091 = null;
        }
    }

    @ObfuscatedName("v.ij(Lbl;ZB)V")
    public static final void method116(class69 arg0, boolean arg1) {
        int var2 = arg0.field841;
        int var3 = (int) arg0.field2469;
        arg0.method3314();
        if (arg1 && var2 != -1 && Statics.field33[var2]) {
            Statics.field1669.method3786(var2);
            if (Statics.field2406[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2406[var2].length; var5++) {
                    if (Statics.field2406[var2][var5] != null) {
                        if (Statics.field2406[var2][var5].field2652 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2406[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2406[var2] = null;
                }
                Statics.field33[var2] = false;
            }
        }
        for (class200 var6 = (class200) field1129.method3276(); var6 != null; var6 = (class200) field1129.method3277()) {
            if ((var6.field2469 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3314();
            }
        }
        class218 var7 = class218.method1532(var3);
        if (var7 != null) {
            method1576(var7);
        }
        method1072();
        if (field995 != -1) {
            method1029(field995, 1);
        }
    }

    @ObfuscatedName("ac.ic(Lhi;IIII)V")
    public static final void method673(class218 arg0, int arg1, int arg2, int arg3) {
        method3176();
        class212 var4 = arg0.method3723(false);
        if (var4 == null) {
            return;
        }
        class283.method4628(arg1, arg2, var4.field2600 + arg1, var4.field2598 + arg2);
        if (field1161 == 2 || field1161 == 5) {
            class283.method4616(arg1, arg2, 0, var4.field2596, var4.field2597);
        } else {
            int var5 = field1010 & 0x7FF;
            int var6 = Statics.field312.field1262 / 32 + 48;
            int var7 = 464 - Statics.field312.field1259 / 32;
            Statics.field3532.method4734(arg1, arg2, var4.field2600, var4.field2598, var6, var7, var5, 256, var4.field2596, var4.field2597);
            for (int var8 = 0; var8 < field1155; var8++) {
                int var9 = field936[var8] * 4 + 2 - Statics.field312.field1262 / 32;
                int var10 = field947[var8] * 4 + 2 - Statics.field312.field1259 / 32;
                method566(arg1, arg2, var9, var10, field1114[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class195 var13 = field1056[Statics.field509][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field312.field1262 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field312.field1259 / 32;
                        method566(arg1, arg2, var14, var15, Statics.field756[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field959; var16++) {
                class88 var17 = field973[field1158[var16]];
                if (var17 != null && var17.method1094()) {
                    class260 var18 = var17.field1382;
                    if (var18 != null && var18.field3568 != null) {
                        var18 = var18.method4331();
                    }
                    if (var18 != null && var18.field3539 && var18.field3571) {
                        int var19 = var17.field1262 / 32 - Statics.field312.field1262 / 32;
                        int var20 = var17.field1259 / 32 - Statics.field312.field1259 / 32;
                        method566(arg1, arg2, var19, var20, Statics.field756[1], var4);
                    }
                }
            }
            int var21 = class98.field1511;
            int[] var22 = class98.field1512;
            for (int var23 = 0; var23 < var21; var23++) {
                class76 var24 = field1046[var22[var23]];
                if (var24 != null && var24.method1094() && !var24.field918 && Statics.field312 != var24) {
                    int var25 = var24.field1262 / 32 - Statics.field312.field1262 / 32;
                    int var26 = var24.field1259 / 32 - Statics.field312.field1259 / 32;
                    boolean var27 = false;
                    if (method491(var24.field915, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field1321; var29++) {
                        if (var24.field915.equals(Statics.field426[var29].field927)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field312.field917 != 0 && var24.field917 != 0 && Statics.field312.field917 == var24.field917) {
                        var30 = true;
                    }
                    if (var27) {
                        method566(arg1, arg2, var25, var26, Statics.field756[3], var4);
                    } else if (var30) {
                        method566(arg1, arg2, var25, var26, Statics.field756[4], var4);
                    } else if (var28) {
                        method566(arg1, arg2, var25, var26, Statics.field756[5], var4);
                    } else {
                        method566(arg1, arg2, var25, var26, Statics.field756[2], var4);
                    }
                }
            }
            if (field952 != 0 && field944 % 20 < 10) {
                if (field952 == 1 && field953 >= 0 && field953 < field973.length) {
                    class88 var31 = field973[field953];
                    if (var31 != null) {
                        int var32 = var31.field1262 / 32 - Statics.field312.field1262 / 32;
                        int var33 = var31.field1259 / 32 - Statics.field312.field1259 / 32;
                        method471(arg1, arg2, var32, var33, Statics.field250[1], var4);
                    }
                }
                if (field952 == 2) {
                    int var34 = field955 * 4 - Statics.field608 * 4 + 2 - Statics.field312.field1262 / 32;
                    int var35 = field1198 * 4 - Statics.field587 * 4 + 2 - Statics.field312.field1259 / 32;
                    method471(arg1, arg2, var34, var35, Statics.field250[1], var4);
                }
                if (field952 == 10 && field954 >= 0 && field954 < field1046.length) {
                    class76 var36 = field1046[field954];
                    if (var36 != null) {
                        int var37 = var36.field1262 / 32 - Statics.field312.field1262 / 32;
                        int var38 = var36.field1259 / 32 - Statics.field312.field1259 / 32;
                        method471(arg1, arg2, var37, var38, Statics.field250[1], var4);
                    }
                }
            }
            if (field1143 != 0) {
                int var39 = field1143 * 4 + 2 - Statics.field312.field1262 / 32;
                int var40 = field1160 * 4 + 2 - Statics.field312.field1259 / 32;
                method566(arg1, arg2, var39, var40, Statics.field250[0], var4);
            }
            if (!Statics.field312.field918) {
                class283.method4601(var4.field2600 / 2 + arg1 - 1, var4.field2598 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1133[arg3] = true;
    }

    @ObfuscatedName("az.ik(Lhi;IIII)V")
    public static final void method500(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3723(false);
        if (var4 == null) {
            return;
        }
        if (field1161 < 3) {
            Statics.field667.method4734(arg1, arg2, var4.field2600, var4.field2598, 25, 25, field1010, 256, var4.field2596, var4.field2597);
        } else {
            class283.method4616(arg1, arg2, 0, var4.field2596, var4.field2597);
        }
    }

    @ObfuscatedName("as.iz(IIIILkp;Lhf;S)V")
    public static final void method471(int arg0, int arg1, int arg2, int arg3, class287 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method566(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field1010 & 0x7FF;
        int var8 = class138.field2041[var7];
        int var9 = class138.field2030[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        Statics.field2128.method4726(arg0 + 94 + var14 + 4 - 10, arg1 + 83 - var15 - 20, 20, 20, 15, 15, var12, 256);
    }

    @ObfuscatedName("ad.ib(IIIILkp;Lhf;I)V")
    public static final void method566(int arg0, int arg1, int arg2, int arg3, class287 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field1010 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class138.field2041[var6];
        int var9 = class138.field2030[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4724(arg5.field2600 / 2 + var10 - arg4.field3774 / 2, arg5.field2598 / 2 - var11 - arg4.field3771 / 2, arg0, arg1, arg5.field2600, arg5.field2598, arg5.field2596, arg5.field2597);
        } else {
            arg4.method4795(arg5.field2600 / 2 + arg0 + var10 - arg4.field3774 / 2, arg5.field2598 / 2 + arg1 - var11 - arg4.field3771 / 2);
        }
    }

    @ObfuscatedName("au.ih(Ljava/lang/String;ZI)Z")
    public static boolean method491(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class269.method4043(arg0, Statics.field355);
        for (int var3 = 0; var3 < field1172; var3++) {
            if (var2.equalsIgnoreCase(class269.method4043(field1194[var3].field817, Statics.field355)) && (!arg1 || field1194[var3].field815 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class269.method4043(Statics.field312.field915, Statics.field355))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ao.if(Ljava/lang/String;I)Z")
    public static boolean method217(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class269.method4043(arg0, Statics.field355);
        for (int var2 = 0; var2 < field1196; var2++) {
            class72 var3 = field1197[var2];
            if (var1.equalsIgnoreCase(class269.method4043(var3.field874, Statics.field355))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class269.method4043(var3.field869, Statics.field355))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bt.iq(Ljava/lang/String;II)V")
    public static final void method1046(String arg0, int arg1) {
        field978.method3139(161);
        field978.method2888(class175.method2869(arg0) + 1);
        field978.method2894(arg0);
        field978.method2929(arg1);
    }

    @ObfuscatedName("jy.im(Lhi;I)I")
    public static int method4398(class218 arg0) {
        class200 var1 = (class200) field1129.method3281(((long) arg0.field2723 << 32) + (long) arg0.field2698);
        return var1 == null ? arg0.field2768 : var1.field2483;
    }

    @ObfuscatedName("eq.jf(Lhi;I)Z")
    public static boolean method2669(class218 arg0) {
        if (field1097) {
            if (method4398(arg0) != 0) {
                return false;
            }
            if (arg0.field2652 == 0) {
                return false;
            }
        }
        return arg0.field2670;
    }

    @ObfuscatedName("l.jy(Lhi;IB)Ljava/lang/String;")
    public static String method28(class218 arg0, int arg1) {
        int var2 = method4398(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2750 == null) {
            return null;
        } else if (arg0.field2724 == null || arg0.field2724.length <= arg1 || arg0.field2724[arg1] == null || arg0.field2724[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2724[arg1];
        }
    }

    @ObfuscatedName("eq.jc(Lhi;I)Ljava/lang/String;")
    public static String method2668(class218 arg0) {
        int var1 = method4398(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2729 == null || arg0.field2729.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2729;
        }
    }

    @ObfuscatedName("cf.jh(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method1415(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field1183 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field1183 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field1183 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field1183 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field1183 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1042 != null) {
            var3 = "/p=" + Statics.field1042;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field940 + "/a=" + Statics.field1502 + var3 + "/";
    }

    @ObfuscatedName("az.jk(Ljava/lang/String;ZI)V")
    public static void method501(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3521; var5++) {
            class258 var6 = class258.method1923(var5);
            if ((!arg1 || var6.field3509) && var6.field3519 == -1 && var6.field3487.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field350 = -1;
                    Statics.field2608 = null;
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
        Statics.field2608 = var3;
        Statics.field2341 = 0;
        Statics.field350 = var4;
        String[] var9 = new String[Statics.field350];
        for (int var10 = 0; var10 < Statics.field350; var10++) {
            var9[var10] = class258.method1923(var3[var10]).field3487;
        }
        class172.method1615(var9, Statics.field2608);
    }

    @ObfuscatedName("eb.je([BII)V")
    public static void method2297(byte[] arg0, int arg1) {
        if (field972 == null) {
            field972 = new byte[24];
        }
        class185.method3181(arg0, arg1, field972, 0, 24);
    }
}

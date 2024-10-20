package deob;

import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class162[] field987 = new class162[4];

    @ObfuscatedName("client.as")
    public static boolean field931 = true;

    @ObfuscatedName("client.br")
    public static int field1074 = 1;

    @ObfuscatedName("client.bj")
    public static int field925 = 0;

    @ObfuscatedName("client.bw")
    public static int field1145 = 0;

    @ObfuscatedName("client.bv")
    public static boolean field1105 = false;

    @ObfuscatedName("client.bi")
    public static boolean field928 = false;

    @ObfuscatedName("client.bz")
    public static int field929 = 0;

    @ObfuscatedName("client.bd")
    public static int field1128 = 0;

    @ObfuscatedName("client.bo")
    public static boolean field932 = true;

    @ObfuscatedName("client.bq")
    public static int field933 = 0;

    @ObfuscatedName("client.bl")
    public static long field1143 = 1L;

    @ObfuscatedName("client.bm")
    public static int field935 = -1;

    @ObfuscatedName("client.bb")
    public static int field973 = -1;

    @ObfuscatedName("client.ba")
    public static int field979 = -1;

    @ObfuscatedName("client.bk")
    public static boolean field938 = true;

    @ObfuscatedName("client.bh")
    public static boolean field939 = false;

    @ObfuscatedName("client.be")
    public static int field1031 = 0;

    @ObfuscatedName("client.by")
    public static int field941 = 0;

    @ObfuscatedName("client.bu")
    public static int field942 = 0;

    @ObfuscatedName("client.co")
    public static int field1054 = 0;

    @ObfuscatedName("client.cl")
    public static int field1028 = 0;

    @ObfuscatedName("client.cp")
    public static int field1063 = 0;

    @ObfuscatedName("client.ce")
    public static int field946 = 0;

    @ObfuscatedName("client.cj")
    public static int field947 = 0;

    @ObfuscatedName("client.cg")
    public static int field1140 = 0;

    @ObfuscatedName("client.cn")
    public static class90 field949 = class90.field1407;

    @ObfuscatedName("client.ck")
    public static class90 field950 = class90.field1407;

    @ObfuscatedName("client.cw")
    public static int field951 = 0;

    @ObfuscatedName("client.cd")
    public static int field952 = 0;

    @ObfuscatedName("client.cc")
    public static int field953 = 0;

    @ObfuscatedName("client.dr")
    public static int field956 = 0;

    @ObfuscatedName("client.dn")
    public static int field1108 = 0;

    @ObfuscatedName("client.dx")
    public static int field958 = 0;

    @ObfuscatedName("client.dl")
    public static int field1185 = 0;

    @ObfuscatedName("client.dy")
    public static int field960 = 0;

    @ObfuscatedName("client.dm")
    public static class150 field1003 = class150.field2197;

    @ObfuscatedName("client.dc")
    public static byte[] field943 = null;

    @ObfuscatedName("client.dg")
    public static class85[] field1131 = new class85[32768];

    @ObfuscatedName("client.du")
    public static int field954 = 0;

    @ObfuscatedName("client.db")
    public static int[] field965 = new int[32768];

    @ObfuscatedName("client.ev")
    public static int field966 = 0;

    @ObfuscatedName("client.eh")
    public static int[] field967 = new int[250];

    @ObfuscatedName("client.ej")
    public static class180 field968 = new class180(5000);

    @ObfuscatedName("client.eu")
    public static class180 field969 = new class180(5000);

    @ObfuscatedName("client.ew")
    public static class180 field970 = new class180(15000);

    @ObfuscatedName("client.en")
    public static int field971 = 0;

    @ObfuscatedName("client.ef")
    public static int field972 = 0;

    @ObfuscatedName("client.er")
    public static int field1119 = 0;

    @ObfuscatedName("client.eo")
    public static int field1130 = 0;

    @ObfuscatedName("client.eb")
    public static int field975 = 0;

    @ObfuscatedName("client.ek")
    public static int field976 = 0;

    @ObfuscatedName("client.ec")
    public static int field977 = 0;

    @ObfuscatedName("client.el")
    public static int field978 = 0;

    @ObfuscatedName("client.ed")
    public static boolean field1050 = false;

    @ObfuscatedName("client.ex")
    public static class276 field980 = new class276();

    @ObfuscatedName("client.em")
    public static HashMap field981 = new HashMap();

    @ObfuscatedName("client.fw")
    public static int field982 = 0;

    @ObfuscatedName("client.fq")
    public static int field983 = 1;

    @ObfuscatedName("client.fc")
    public static int field984 = 0;

    @ObfuscatedName("client.fk")
    public static int field985 = 1;

    @ObfuscatedName("client.fo")
    public static int field986 = 0;

    @ObfuscatedName("client.fz")
    public static boolean field988 = false;

    @ObfuscatedName("client.fb")
    public static int[][][] field989 = new int[4][13][13];

    @ObfuscatedName("client.fd")
    public static final int[] field990 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fl")
    public static int field1005 = 0;

    @ObfuscatedName("client.gs")
    public static int field992 = 2301979;

    @ObfuscatedName("client.gq")
    public static int field993 = 5063219;

    @ObfuscatedName("client.gd")
    public static int field1062 = 3353893;

    @ObfuscatedName("client.gz")
    public static int field934 = 7759444;

    @ObfuscatedName("client.gp")
    public static boolean field1133 = false;

    @ObfuscatedName("client.gg")
    public static int field997 = 0;

    @ObfuscatedName("client.ge")
    public static int field998 = 128;

    @ObfuscatedName("client.gf")
    public static int field1156 = 0;

    @ObfuscatedName("client.gl")
    public static int field995 = 0;

    @ObfuscatedName("client.gy")
    public static int field1001 = 0;

    @ObfuscatedName("client.gu")
    public static int field1002 = 0;

    @ObfuscatedName("client.gn")
    public static int field996 = 0;

    @ObfuscatedName("client.gt")
    public static int field1070 = 50;

    @ObfuscatedName("client.hh")
    public static int field1021 = 0;

    @ObfuscatedName("client.hx")
    public static boolean field1006 = false;

    @ObfuscatedName("client.hg")
    public static int field959 = 0;

    @ObfuscatedName("client.hs")
    public static int field1008 = 0;

    @ObfuscatedName("client.hi")
    public static int field1009 = 50;

    @ObfuscatedName("client.hz")
    public static int[] field1010 = new int[field1009];

    @ObfuscatedName("client.hj")
    public static int[] field1011 = new int[field1009];

    @ObfuscatedName("client.hf")
    public static int[] field1012 = new int[field1009];

    @ObfuscatedName("client.ht")
    public static int[] field1013 = new int[field1009];

    @ObfuscatedName("client.hy")
    public static int[] field1014 = new int[field1009];

    @ObfuscatedName("client.hv")
    public static int[] field1015 = new int[field1009];

    @ObfuscatedName("client.hw")
    public static int[] field1122 = new int[field1009];

    @ObfuscatedName("client.hp")
    public static String[] field1017 = new String[field1009];

    @ObfuscatedName("client.hd")
    public static int[][] field1018 = new int[104][104];

    @ObfuscatedName("client.hc")
    public static int field1019 = 0;

    @ObfuscatedName("client.ha")
    public static int field1020 = -1;

    @ObfuscatedName("client.hn")
    public static int field927 = -1;

    @ObfuscatedName("client.hk")
    public static int field1048 = 0;

    @ObfuscatedName("client.hl")
    public static int field1023 = 0;

    @ObfuscatedName("client.he")
    public static int field1024 = 0;

    @ObfuscatedName("client.hb")
    public static int field1025 = 0;

    @ObfuscatedName("client.hq")
    public static int field1026 = 0;

    @ObfuscatedName("client.hu")
    public static int field1027 = 0;

    @ObfuscatedName("client.it")
    public static String field1069 = null;

    @ObfuscatedName("client.ih")
    public static int field945 = 0;

    @ObfuscatedName("client.ig")
    public static int field1029 = 0;

    @ObfuscatedName("client.ij")
    public static int field1132 = 0;

    @ObfuscatedName("client.iu")
    public static int field1178 = 0;

    @ObfuscatedName("client.il")
    public static boolean field1032 = false;

    @ObfuscatedName("client.id")
    public static int field1033 = 0;

    @ObfuscatedName("client.iq")
    public static int field1034 = 0;

    @ObfuscatedName("client.ib")
    public static class74[] field1035 = new class74[2048];

    @ObfuscatedName("client.ir")
    public static int field1036 = -1;

    @ObfuscatedName("client.iy")
    public static int field1037 = 0;

    @ObfuscatedName("client.ie")
    public static int field1038 = 0;

    @ObfuscatedName("client.in")
    public static int[] field1039 = new int[1000];

    @ObfuscatedName("client.iv")
    public static final int[] field1040 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ii")
    public static String[] field1158 = new String[8];

    @ObfuscatedName("client.im")
    public static boolean[] field1042 = new boolean[8];

    @ObfuscatedName("client.ia")
    public static int[] field1043 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.if")
    public static int field1044 = -1;

    @ObfuscatedName("client.jt")
    public static class194[][][] field1045 = new class194[4][104][104];

    @ObfuscatedName("client.jz")
    public static class194 field1046 = new class194();

    @ObfuscatedName("client.jd")
    public static class194 field1047 = new class194();

    @ObfuscatedName("client.jh")
    public static class194 field1103 = new class194();

    @ObfuscatedName("client.jw")
    public static int[] field1049 = new int[25];

    @ObfuscatedName("client.jl")
    public static int[] field944 = new int[25];

    @ObfuscatedName("client.jy")
    public static int[] field1051 = new int[25];

    @ObfuscatedName("client.ji")
    public static int field1052 = 0;

    @ObfuscatedName("client.jm")
    public static boolean field1053 = false;

    @ObfuscatedName("client.ja")
    public static int field926 = 0;

    @ObfuscatedName("client.jj")
    public static int[] field1055 = new int[500];

    @ObfuscatedName("client.jb")
    public static int[] field1056 = new int[500];

    @ObfuscatedName("client.jv")
    public static int[] field963 = new int[500];

    @ObfuscatedName("client.ju")
    public static int[] field940 = new int[500];

    @ObfuscatedName("client.jx")
    public static String[] field1059 = new String[500];

    @ObfuscatedName("client.jc")
    public static String[] field1060 = new String[500];

    @ObfuscatedName("client.je")
    public static boolean[] field1162 = new boolean[500];

    @ObfuscatedName("client.jq")
    public static boolean field1175 = false;

    @ObfuscatedName("client.js")
    public static boolean field962 = false;

    @ObfuscatedName("client.jo")
    public static int field1064 = -1;

    @ObfuscatedName("client.ky")
    public static int field1065 = -1;

    @ObfuscatedName("client.kp")
    public static int field1066 = 0;

    @ObfuscatedName("client.ka")
    public static int field1067 = 50;

    @ObfuscatedName("client.kb")
    public static int field1068 = 0;

    @ObfuscatedName("client.kd")
    public static boolean field1100 = false;

    @ObfuscatedName("client.kw")
    public static int field1071 = -1;

    @ObfuscatedName("client.ku")
    public static int field1170 = -1;

    @ObfuscatedName("client.kj")
    public static String field1073 = null;

    @ObfuscatedName("client.ks")
    public static String field1088 = null;

    @ObfuscatedName("client.kc")
    public static int field1075 = -1;

    @ObfuscatedName("client.kr")
    public static class191 field974 = new class191(8);

    @ObfuscatedName("client.kx")
    public static int field1077 = 0;

    @ObfuscatedName("client.kf")
    public static int field1078 = 0;

    @ObfuscatedName("client.kn")
    public static class217 field1079 = null;

    @ObfuscatedName("client.km")
    public static int field1076 = 0;

    @ObfuscatedName("client.kl")
    public static int field948 = 0;

    @ObfuscatedName("client.ki")
    public static int field1082 = 0;

    @ObfuscatedName("client.kh")
    public static int field1083 = -1;

    @ObfuscatedName("client.kq")
    public static boolean field1084 = false;

    @ObfuscatedName("client.kg")
    public static boolean field1085 = false;

    @ObfuscatedName("client.lx")
    public static boolean field1086 = false;

    @ObfuscatedName("client.ln")
    public static class217 field1087 = null;

    @ObfuscatedName("client.lw")
    public static class217 field1159 = null;

    @ObfuscatedName("client.lt")
    public static class217 field961 = null;

    @ObfuscatedName("client.li")
    public static int field1090 = 0;

    @ObfuscatedName("client.ls")
    public static int field1169 = 0;

    @ObfuscatedName("client.le")
    public static class217 field1092 = null;

    @ObfuscatedName("client.lm")
    public static boolean field1184 = false;

    @ObfuscatedName("client.ld")
    public static int field1094 = -1;

    @ObfuscatedName("client.lc")
    public static int field1095 = -1;

    @ObfuscatedName("client.ly")
    public static boolean field1154 = false;

    @ObfuscatedName("client.lv")
    public static int field1097 = -1;

    @ObfuscatedName("client.lo")
    public static int field1098 = -1;

    @ObfuscatedName("client.lb")
    public static boolean field1091 = false;

    @ObfuscatedName("client.ll")
    public static int field1138 = 1;

    @ObfuscatedName("client.lg")
    public static int[] field1101 = new int[32];

    @ObfuscatedName("client.lq")
    public static int field1000 = 0;

    @ObfuscatedName("client.lp")
    public static int[] field964 = new int[32];

    @ObfuscatedName("client.lu")
    public static int field1104 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field937 = new int[32];

    @ObfuscatedName("client.mi")
    public static int field1106 = 0;

    @ObfuscatedName("client.mt")
    public static int field1107 = 0;

    @ObfuscatedName("client.md")
    public static int field1192 = 0;

    @ObfuscatedName("client.mp")
    public static int field1109 = 0;

    @ObfuscatedName("client.ml")
    public static int field1110 = 0;

    @ObfuscatedName("client.mb")
    public static int field1093 = 0;

    @ObfuscatedName("client.mh")
    public static int field1112 = 0;

    @ObfuscatedName("client.ma")
    public static int field1113 = 0;

    @ObfuscatedName("client.mg")
    public static class194 field1114 = new class194();

    @ObfuscatedName("client.mj")
    public static class194 field1172 = new class194();

    @ObfuscatedName("client.mu")
    public static class194 field1116 = new class194();

    @ObfuscatedName("client.mc")
    public static class191 field1187 = new class191(512);

    @ObfuscatedName("client.my")
    public static int field1118 = 0;

    @ObfuscatedName("client.mr")
    public static int field1058 = -2;

    @ObfuscatedName("client.me")
    public static boolean[] field1120 = new boolean[100];

    @ObfuscatedName("client.mk")
    public static boolean[] field1121 = new boolean[100];

    @ObfuscatedName("client.mm")
    public static boolean[] field1057 = new boolean[100];

    @ObfuscatedName("client.mx")
    public static int[] field1123 = new int[100];

    @ObfuscatedName("client.ms")
    public static int[] field1124 = new int[100];

    @ObfuscatedName("client.mv")
    public static int[] field1125 = new int[100];

    @ObfuscatedName("client.mw")
    public static int[] field1126 = new int[100];

    @ObfuscatedName("client.mo")
    public static int field1127 = 0;

    @ObfuscatedName("client.mz")
    public static long field1142 = 0L;

    @ObfuscatedName("client.nt")
    public static boolean field1129 = true;

    @ObfuscatedName("client.nc")
    public static int[] field1111 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nk")
    public static int field1089 = 0;

    @ObfuscatedName("client.nu")
    public static int field1072 = 0;

    @ObfuscatedName("client.ns")
    public static String field991 = "";

    @ObfuscatedName("client.np")
    public static long[] field1134 = new long[100];

    @ObfuscatedName("client.nv")
    public static int field1135 = 0;

    @ObfuscatedName("client.nh")
    public static int field1136 = 0;

    @ObfuscatedName("client.no")
    public static int[] field1096 = new int[128];

    @ObfuscatedName("client.nd")
    public static int[] field1016 = new int[128];

    @ObfuscatedName("client.nz")
    public static long field1139 = -1L;

    @ObfuscatedName("client.nl")
    public static String field1022 = null;

    @ObfuscatedName("client.nb")
    public static String field1171 = null;

    @ObfuscatedName("client.om")
    public static int field1117 = -1;

    @ObfuscatedName("client.ot")
    public static int field1165 = 0;

    @ObfuscatedName("client.ow")
    public static int[] field1144 = new int[1000];

    @ObfuscatedName("client.or")
    public static int[] field1180 = new int[1000];

    @ObfuscatedName("client.oj")
    public static class287[] field1146 = new class287[1000];

    @ObfuscatedName("client.op")
    public static int field1147 = 0;

    @ObfuscatedName("client.oz")
    public static int field1102 = 0;

    @ObfuscatedName("client.oy")
    public static int field1149 = 0;

    @ObfuscatedName("client.og")
    public static int field1150 = 255;

    @ObfuscatedName("client.oo")
    public static int field1151 = -1;

    @ObfuscatedName("client.oa")
    public static boolean field1152 = false;

    @ObfuscatedName("client.of")
    public static int field1153 = 127;

    @ObfuscatedName("client.ok")
    public static int field923 = 127;

    @ObfuscatedName("client.ou")
    public static int field1155 = 0;

    @ObfuscatedName("client.on")
    public static int[] field1099 = new int[50];

    @ObfuscatedName("client.px")
    public static int[] field1157 = new int[50];

    @ObfuscatedName("client.pg")
    public static int[] field1137 = new int[50];

    @ObfuscatedName("client.pe")
    public static int[] field1041 = new int[50];

    @ObfuscatedName("client.pt")
    public static class104[] field1160 = new class104[50];

    @ObfuscatedName("client.pw")
    public static boolean field1161 = false;

    @ObfuscatedName("client.pl")
    public static boolean[] field1030 = new boolean[5];

    @ObfuscatedName("client.pk")
    public static int[] field1163 = new int[5];

    @ObfuscatedName("client.pr")
    public static int[] field1164 = new int[5];

    @ObfuscatedName("client.py")
    public static int[] field936 = new int[5];

    @ObfuscatedName("client.pu")
    public static int[] field1166 = new int[5];

    @ObfuscatedName("client.po")
    public static short field1167 = 256;

    @ObfuscatedName("client.ps")
    public static short field1168 = 205;

    @ObfuscatedName("client.pz")
    public static short field994 = 256;

    @ObfuscatedName("client.pm")
    public static short field1148 = 320;

    @ObfuscatedName("client.qi")
    public static short field1004 = 1;

    @ObfuscatedName("client.qs")
    public static short field1141 = 32767;

    @ObfuscatedName("client.qf")
    public static short field999 = 1;

    @ObfuscatedName("client.qm")
    public static short field1174 = 32767;

    @ObfuscatedName("client.qq")
    public static int field924 = 0;

    @ObfuscatedName("client.qt")
    public static int field1176 = 0;

    @ObfuscatedName("client.qe")
    public static int field1177 = 0;

    @ObfuscatedName("client.qj")
    public static int field1173 = 0;

    @ObfuscatedName("client.qw")
    public static int field1179 = 0;

    @ObfuscatedName("client.ql")
    public static int field1115 = 0;

    @ObfuscatedName("client.qa")
    public static int field1181 = 0;

    @ObfuscatedName("client.qc")
    public static class66[] field1182 = new class66[400];

    @ObfuscatedName("client.qx")
    public static class196 field1183 = new class196();

    @ObfuscatedName("client.qz")
    public static int field1080 = 0;

    @ObfuscatedName("client.qd")
    public static class70[] field1081 = new class70[400];

    @ObfuscatedName("client.qp")
    public static class214 field1186 = new class214();

    @ObfuscatedName("client.qk")
    public static int field957 = -1;

    @ObfuscatedName("client.qg")
    public static int field1188 = -1;

    @ObfuscatedName("client.qo")
    public static class17[] field1189 = new class17[8];

    @ObfuscatedName("client.rk")
    public static final class73 field1190 = new class73();

    @ObfuscatedName("client.rs")
    public static int[] field1191 = new int[50];

    @ObfuscatedName("client.rh")
    public static int[] field1061 = new int[50];

    @ObfuscatedName("bg.et(I)Lkk;")
    public static class290 method1015() {
        return Statics.field1193;
    }

    @ObfuscatedName("client.ag(I)V")
    public final void method782() {
    }

    public final void init() {
        if (!this.method763()) {
            return;
        }
        class275[] var1 = class275.method3519();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class275 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3730);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3730)) {
                    case 1:
                        Statics.field2252 = var4;
                        break;
                    case 2:
                        Statics.field474 = Integer.parseInt(var4);
                    case 3:
                    case 9:
                    default:
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class87.field1387)) {
                        }
                        break;
                    case 5:
                        Statics.field453 = (class233) class169.method233(class233.method3843(), Integer.parseInt(var4));
                        if (Statics.field453 == class233.field3192) {
                            Statics.field3170 = class291.field3873;
                        } else {
                            Statics.field3170 = class291.field3874;
                        }
                        break;
                    case 6:
                        Statics.field930 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field2526 = var4;
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class87.field1387)) {
                            field1105 = true;
                        } else {
                            field1105 = false;
                        }
                        break;
                    case 10:
                        int var5 = Integer.parseInt(var4);
                        class232[] var6 = class232.method1479();
                        int var7 = 0;
                        class232 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class232 var8 = var6[var7];
                            if (var8.field3182 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field1309 = var9;
                        break;
                    case 11:
                        field1074 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field929 = Integer.parseInt(var4);
                        break;
                    case 13:
                        field1145 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field925 = Integer.parseInt(var4);
                }
            }
        }
        class138.field2076 = false;
        field928 = false;
        Statics.field506 = this.getCodeBase().getHost();
        String var10 = Statics.field1309.field3185;
        byte var11 = 0;
        try {
            Statics.field2837 = 17;
            Statics.field1534 = var11;
            try {
                Statics.field24 = System.getProperty("os.name");
            } catch (Exception var25) {
                Statics.field24 = "Unknown";
            }
            Statics.field1353 = Statics.field24.toLowerCase();
            try {
                Statics.field481 = System.getProperty("user.home");
                if (Statics.field481 != null) {
                    Statics.field481 = Statics.field481 + "/";
                }
            } catch (Exception var24) {
            }
            try {
                if (Statics.field1353.startsWith("win")) {
                    if (Statics.field481 == null) {
                        Statics.field481 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field481 == null) {
                    Statics.field481 = System.getenv("HOME");
                }
                if (Statics.field481 != null) {
                    Statics.field481 = Statics.field481 + "/";
                }
            } catch (Exception var23) {
            }
            if (Statics.field481 == null) {
                Statics.field481 = "~/";
            }
            Statics.field3747 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field481, "/tmp/", "" };
            Statics.field3672 = new String[] { ".jagex_cache_" + Statics.field1534, ".file_store_" + Statics.field1534 };
            label123: for (int var15 = 0; var15 < 4; var15++) {
                Statics.field2238 = class156.method61("oldschool", var10, var15);
                if (!Statics.field2238.exists()) {
                    Statics.field2238.mkdirs();
                }
                File[] var16 = Statics.field2238.listFiles();
                if (var16 == null) {
                    break;
                }
                File[] var17 = var16;
                int var18 = 0;
                while (true) {
                    if (var18 >= var17.length) {
                        break label123;
                    }
                    File var19 = var17[var18];
                    if (!class156.method538(var19, false)) {
                        break;
                    }
                    var18++;
                }
            }
            File var20 = Statics.field2238;
            Statics.field2246 = var20;
            if (!Statics.field2246.exists()) {
                throw new RuntimeException("");
            }
            class158.field2249 = true;
            class156.method1480();
            class156.field2240 = new class122(new class123(class158.method2689("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class156.field2242 = new class122(new class123(class158.method2689("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2418 = new class122[Statics.field2837];
            for (int var21 = 0; var21 < Statics.field2837; var21++) {
                Statics.field2418[var21] = new class122(new class123(class158.method2689("main_file_cache.idx" + var21), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var26) {
            class153.method611((String) null, var26);
        }
        Statics.field243 = this;
        this.method775(765, 503, 156);
    }

    @ObfuscatedName("client.al(I)V")
    public final void method772() {
        Statics.field2121 = field1145 == 0 ? 43594 : field1074 + 40000;
        Statics.field2231 = field1145 == 0 ? 443 : field1074 + 50000;
        Statics.field678 = Statics.field2121;
        Statics.field2120 = class215.field2627;
        Statics.field2613 = class215.field2621;
        Statics.field2614 = class215.field2622;
        Statics.field2615 = class215.field2623;
        Statics.field764 = new class148();
        this.method755();
        this.method760();
        Statics.field1245 = this.method752();
        Statics.field535 = new class161(255, class156.field2240, class156.field2242, 500000);
        class123 var1 = null;
        class80 var2 = new class80();
        try {
            var1 = class156.method2350("", Statics.field453.field3193, false);
            byte[] var3 = new byte[(int) var1.method2207()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2208(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class80(new class174(var3));
        } catch (Exception var11) {
        }
        try {
            if (var1 != null) {
                var1.method2222();
            }
        } catch (Exception var10) {
        }
        Statics.field869 = var2;
        this.method753();
        class57.method1597(this, Statics.field3742);
        if (field1145 != 0) {
            field939 = true;
        }
        int var9 = Statics.field869.field1311;
        field1142 = 0L;
        if (var9 >= 2) {
            field1129 = true;
        } else {
            field1129 = false;
        }
        if (method2513() == 1) {
            Statics.field243.method750(765, 503);
        } else {
            Statics.field243.method750(7680, 2160);
        }
        if (field1128 >= 25) {
            field968.method3236(170);
            field968.method2955(method2513());
            field968.method2956(Statics.field2255);
            field968.method2956(Statics.field722);
        }
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method773() {
        field933++;
        this.method1075();
        class237.method3628();
        class204.method26();
        method669();
        class51 var1 = class51.field671;
        synchronized (class51.field671) {
            class51.field643++;
            class51.field668 = class51.field640;
            class51.field667 = 0;
            if (class51.field663 >= 0) {
                while (class51.field663 != class51.field654) {
                    int var3 = class51.field661[class51.field654];
                    class51.field654 = class51.field654 + 1 & 0x7F;
                    if (var3 < 0) {
                        class51.field660[~var3] = false;
                    } else {
                        if (!class51.field660[var3] && class51.field667 < class51.field672.length - 1) {
                            class51.field672[++class51.field667 - 1] = var3;
                        }
                        class51.field660[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class51.field660[var2] = false;
                }
                class51.field663 = class51.field654;
            }
            if (class51.field667 > 0) {
                class51.field643 = 0;
            }
            class51.field640 = class51.field662;
        }
        class60 var5 = class60.field752;
        synchronized (class60.field752) {
            class60.field751 = class60.field761;
            class60.field757 = class60.field748;
            class60.field742 = class60.field747;
            class60.field744 = class60.field753;
            class60.field758 = class60.field754;
            class60.field759 = class60.field745;
            class60.field760 = class60.field756;
            class60.field753 = 0;
        }
        if (Statics.field1245 != null) {
            int var7 = Statics.field1245.method638();
            field1113 = var7;
        }
        if (field1128 == 0) {
            method2205();
            class59.method1953();
        } else if (field1128 == 5) {
            class91.method2351(this);
            method2205();
            class59.method1953();
        } else if (field1128 == 10 || field1128 == 11) {
            class91.method2351(this);
        } else if (field1128 == 20) {
            class91.method2351(this);
            this.method1167();
        } else if (field1128 == 25) {
            method465();
        }
        if (field1128 == 30) {
            this.method1061();
        } else if (field1128 == 40 || field1128 == 45) {
            this.method1167();
        }
    }

    @ObfuscatedName("client.ab(ZS)V")
    public final void method774(boolean arg0) {
        boolean var2;
        label152: {
            try {
                if (class204.field2501 == 2) {
                    if (Statics.field864 == null) {
                        Statics.field864 = class210.method3705(Statics.field1393, Statics.field2503, Statics.field2506);
                        if (Statics.field864 == null) {
                            var2 = false;
                            break label152;
                        }
                    }
                    if (Statics.field2505 == null) {
                        Statics.field2505 = new class111(Statics.field2504, Statics.field2499);
                    }
                    if (Statics.field2500.method3523(Statics.field864, Statics.field2502, Statics.field2505, 22050)) {
                        Statics.field2500.method3524();
                        Statics.field2500.method3560(Statics.field269);
                        Statics.field2500.method3522(Statics.field864, Statics.field1540);
                        class204.field2501 = 0;
                        Statics.field864 = null;
                        Statics.field2505 = null;
                        Statics.field1393 = null;
                        var2 = true;
                        break label152;
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                Statics.field2500.method3527();
                class204.field2501 = 0;
                Statics.field864 = null;
                Statics.field2505 = null;
                Statics.field1393 = null;
            }
            var2 = false;
        }
        if (var2 && field1152 && Statics.field1778 != null) {
            Statics.field1778.method1916();
        }
        if ((field1128 == 10 || field1128 == 20 || field1128 == 30) && field1142 != 0L && class176.method3200() > field1142) {
            int var5 = method2513();
            field1142 = 0L;
            if (var5 >= 2) {
                field1129 = true;
            } else {
                field1129 = false;
            }
            if (method2513() == 1) {
                Statics.field243.method750(765, 503);
            } else {
                Statics.field243.method750(7680, 2160);
            }
            if (field1128 >= 25) {
                field968.method3236(170);
                field968.method2955(method2513());
                field968.method2956(Statics.field2255);
                field968.method2956(Statics.field722);
            }
        }
        if (arg0) {
            for (int var6 = 0; var6 < 100; var6++) {
                field1120[var6] = true;
            }
        }
        if (field1128 == 0) {
            this.method776(class91.field1447, class91.field1432, arg0);
        } else if (field1128 == 5) {
            class91.method17(Statics.field2239, Statics.field1478, Statics.field260, arg0);
        } else if (field1128 == 10 || field1128 == 11) {
            class91.method17(Statics.field2239, Statics.field1478, Statics.field260, arg0);
        } else if (field1128 == 20) {
            class91.method17(Statics.field2239, Statics.field1478, Statics.field260, arg0);
        } else if (field1128 == 25) {
            if (field986 == 1) {
                if (field982 > field983) {
                    field983 = field982;
                }
                int var7 = (field983 * 50 - field982 * 50) / field983;
                method175(class226.field2861 + class87.field1384 + class87.field1381 + var7 + "%" + class87.field1379, false);
            } else if (field986 == 2) {
                if (field984 > field985) {
                    field985 = field984;
                }
                int var8 = (field985 * 50 - field984 * 50) / field985 + 50;
                method175(class226.field2861 + class87.field1384 + class87.field1381 + var8 + "%" + class87.field1379, false);
            } else {
                method175(class226.field2861, false);
            }
        } else if (field1128 == 30) {
            this.method1356();
        } else if (field1128 == 40) {
            method175(class226.field3054 + class87.field1384 + class226.field2863, false);
        } else if (field1128 == 45) {
            method175(class226.field3009, false);
        }
        if (field1128 == 30 && field1127 == 0 && !arg0 && !field1129) {
            for (int var9 = 0; var9 < field1118; var9++) {
                if (field1121[var9]) {
                    Statics.field734.method742(field1123[var9], field1124[var9], field1125[var9], field1126[var9]);
                    field1121[var9] = false;
                }
            }
        } else if (field1128 > 0) {
            Statics.field734.method738(0, 0);
            for (int var10 = 0; var10 < field1118; var10++) {
                field1121[var10] = false;
            }
        }
    }

    @ObfuscatedName("client.aj(I)V")
    public final void method789() {
        if (Statics.field377.method1698()) {
            Statics.field377.method1710();
        }
        if (Statics.field696 != null) {
            Statics.field696.field870 = false;
        }
        Statics.field696 = null;
        if (Statics.field310 != null) {
            Statics.field310.method2789();
            Statics.field310 = null;
        }
        class51.method2692();
        if (class60.field752 != null) {
            class60 var1 = class60.field752;
            synchronized (class60.field752) {
                class60.field752 = null;
            }
        }
        Statics.field1245 = null;
        if (Statics.field1778 != null) {
            Statics.field1778.method1917();
        }
        if (Statics.field1 != null) {
            Statics.field1.method1917();
        }
        if (Statics.field3256 != null) {
            Statics.field3256.method2789();
        }
        Object var3 = class237.field3232;
        synchronized (class237.field3232) {
            if (class237.field3229 != 0) {
                class237.field3229 = 1;
                try {
                    class237.field3232.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field764 != null) {
            Statics.field764.method2705();
            Statics.field764 = null;
        }
        class156.method1050();
    }

    @ObfuscatedName("ba.ee(IB)V")
    public static void method1026(int arg0) {
        if (field1128 == arg0) {
            return;
        }
        if (field1128 == 0) {
            Statics.field243.method791();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field1108 = 0;
            field958 = 0;
            field1185 = 0;
            field980.method4652(arg0);
            if (arg0 != 20) {
                Statics.method1463(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field325 != null) {
            Statics.field325.method2789();
            Statics.field325 = null;
        }
        if (field1128 == 25) {
            field986 = 0;
            field982 = 0;
            field983 = 1;
            field984 = 0;
            field985 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class91.method24(Statics.field1410, Statics.field29, true, 0);
        } else if (arg0 == 20) {
            class91.method24(Statics.field1410, Statics.field29, true, field1128 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class91.method24(Statics.field1410, Statics.field29, false, 4);
        } else {
            class91.method139();
        }
        field1128 = arg0;
    }

    @ObfuscatedName("client.fh(I)V")
    public void method1075() {
        if (field1128 != 1000) {
            boolean var1 = class239.method3964();
            if (!var1) {
                this.method1058();
            }
        }
    }

    @ObfuscatedName("client.fy(B)V")
    public void method1058() {
        if (class239.field3264 >= 4) {
            this.method754("js5crc");
            field1128 = 1000;
            return;
        }
        if (class239.field3265 >= 4) {
            if (field1128 <= 5) {
                this.method754("js5io");
                field1128 = 1000;
                return;
            }
            field953 = 3000;
            class239.field3265 = 3;
        }
        if (--field953 + 1 > 0) {
            return;
        }
        try {
            if (field952 == 0) {
                Statics.field2845 = Statics.field739.method2745(Statics.field506, Statics.field678);
                field952++;
            }
            if (field952 == 1) {
                if (Statics.field2845.field2218 == 2) {
                    this.method1295(-1);
                    return;
                }
                if (Statics.field2845.field2218 == 1) {
                    field952++;
                }
            }
            if (field952 == 2) {
                Statics.field2401 = new class160((Socket) Statics.field2845.field2225, Statics.field739);
                class174 var1 = new class174(5);
                var1.method2955(15);
                var1.method3072(156);
                Statics.field2401.method2809(var1.field2389, 0, 5);
                field952++;
                Statics.field1007 = class176.method3200();
            }
            if (field952 == 3) {
                if (field1128 <= 5 || Statics.field2401.method2791() > 0) {
                    int var2 = Statics.field2401.method2788();
                    if (var2 != 0) {
                        this.method1295(var2);
                        return;
                    }
                    field952++;
                } else if (class176.method3200() - Statics.field1007 > 30000L) {
                    this.method1295(-2);
                    return;
                }
            }
            if (field952 == 4) {
                class160 var3 = Statics.field2401;
                boolean var4 = field1128 > 20;
                if (Statics.field3256 != null) {
                    try {
                        Statics.field3256.method2789();
                    } catch (Exception var14) {
                    }
                    Statics.field3256 = null;
                }
                Statics.field3256 = var3;
                class239.method443(var4);
                class239.field3247.field2390 = 0;
                Statics.field3258 = null;
                Statics.field859 = null;
                class239.field3252 = 0;
                while (true) {
                    class235 var6 = (class235) class239.field3245.method3377();
                    if (var6 == null) {
                        while (true) {
                            class235 var7 = (class235) class239.field3255.method3377();
                            if (var7 == null) {
                                if (class239.field3263 != 0) {
                                    try {
                                        class174 var8 = new class174(4);
                                        var8.method2955(4);
                                        var8.method2955(class239.field3263);
                                        var8.method2956(0);
                                        Statics.field3256.method2809(var8.field2389, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3256.method2789();
                                        } catch (Exception var12) {
                                        }
                                        class239.field3265++;
                                        Statics.field3256 = null;
                                    }
                                }
                                class239.field3246 = 0;
                                Statics.field3259 = class176.method3200();
                                Statics.field2845 = null;
                                Statics.field2401 = null;
                                field952 = 0;
                                field956 = 0;
                                return;
                            }
                            class239.field3262.method3308(var7);
                            class239.field3253.method3374(var7, var7.field2464);
                            class239.field3254++;
                            class239.field3260--;
                        }
                    }
                    class239.field3248.method3374(var6, var6.field2464);
                    class239.field3249++;
                    class239.field3251--;
                }
            }
        } catch (IOException var15) {
            this.method1295(-3);
        }
    }

    @ObfuscatedName("client.fx(II)V")
    public void method1295(int arg0) {
        Statics.field2845 = null;
        Statics.field2401 = null;
        field952 = 0;
        if (Statics.field678 == Statics.field2121) {
            Statics.field678 = Statics.field2231;
        } else {
            Statics.field678 = Statics.field2121;
        }
        field956++;
        if (field956 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field1128 <= 5) {
                this.method754("js5connect_full");
                field1128 = 1000;
            } else {
                field953 = 3000;
            }
        } else if (field956 >= 2 && arg0 == 6) {
            this.method754("js5connect_outofdate");
            field1128 = 1000;
        } else if (field956 >= 4) {
            if (field1128 <= 5) {
                this.method754("js5connect");
                field1128 = 1000;
            } else {
                field953 = 3000;
            }
        }
    }

    @ObfuscatedName("dw.fe(B)V")
    public static void method2205() {
        if (field951 == 0) {
            Statics.field28 = new class138(4, 104, 104, class62.field774);
            for (int var0 = 0; var0 < 4; var0++) {
                field987[var0] = new class162(104, 104);
            }
            Statics.field86 = new class287(512, 512);
            class91.field1432 = class226.field2922;
            class91.field1447 = 5;
            field951 = 20;
        } else if (field951 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class135.field2024[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class138.method2552(var1, 500, 800, 512, 334);
            class91.field1432 = class226.field3056;
            class91.field1447 = 10;
            field951 = 30;
        } else if (field951 == 30) {
            Statics.field2403 = method68(0, false, true, true);
            Statics.field475 = method68(1, false, true, true);
            Statics.field258 = method68(2, true, false, true);
            Statics.field2163 = method68(3, false, true, true);
            Statics.field311 = method68(4, false, true, true);
            Statics.field327 = method68(5, true, true, true);
            Statics.field528 = method68(6, true, true, false);
            Statics.field304 = method68(7, false, true, true);
            Statics.field29 = method68(8, false, true, true);
            Statics.field955 = method68(9, false, true, true);
            Statics.field1410 = method68(10, false, true, true);
            Statics.field858 = method68(11, false, true, true);
            Statics.field449 = method68(12, false, true, true);
            Statics.field42 = method68(13, true, false, true);
            Statics.field794 = method68(14, false, true, false);
            Statics.field1296 = method68(15, false, true, true);
            Statics.field3196 = method68(16, false, true, false);
            class91.field1432 = class226.field2866;
            class91.field1447 = 20;
            field951 = 40;
        } else if (field951 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2403.method3978() * 4 / 100;
            int var8 = var7 + Statics.field475.method3978() * 4 / 100;
            int var9 = var8 + Statics.field258.method3978() * 2 / 100;
            int var10 = var9 + Statics.field2163.method3978() * 2 / 100;
            int var11 = var10 + Statics.field311.method3978() * 6 / 100;
            int var12 = var11 + Statics.field327.method3978() * 4 / 100;
            int var13 = var12 + Statics.field528.method3978() * 2 / 100;
            int var14 = var13 + Statics.field304.method3978() * 58 / 100;
            int var15 = var14 + Statics.field29.method3978() * 2 / 100;
            int var16 = var15 + Statics.field955.method3978() * 2 / 100;
            int var17 = var16 + Statics.field1410.method3978() * 2 / 100;
            int var18 = var17 + Statics.field858.method3978() * 2 / 100;
            int var19 = var18 + Statics.field449.method3978() * 2 / 100;
            int var20 = var19 + Statics.field42.method3978() * 2 / 100;
            int var21 = var20 + Statics.field794.method3978() * 2 / 100;
            int var22 = var21 + Statics.field1296.method3978() * 2 / 100;
            int var23 = var22 + Statics.field3196.method3978() * 2 / 100;
            if (var23 == 100) {
                class91.field1432 = class226.field3070;
                class91.field1447 = 30;
                field951 = 45;
            } else {
                if (var23 != 0) {
                    class91.field1432 = class226.field2867 + var23 + "%";
                }
                class91.field1447 = 30;
            }
        } else if (field951 == 45) {
            boolean var24 = !field928;
            Statics.field1621 = 22050;
            Statics.field1618 = var24;
            Statics.field2118 = 2;
            class205 var25 = new class205();
            var25.method3585(9, 128);
            Statics.field1778 = class108.method1489(Statics.field739, 0, 22050);
            Statics.field1778.method1922(var25);
            class238 var26 = Statics.field1296;
            class238 var27 = Statics.field794;
            class238 var28 = Statics.field311;
            Statics.field2502 = var26;
            Statics.field2499 = var27;
            Statics.field2504 = var28;
            Statics.field2500 = var25;
            Statics.field1 = class108.method1489(Statics.field739, 1, 2048);
            Statics.field279 = new class101();
            Statics.field1.method1922(Statics.field279);
            Statics.field3391 = new class115(22050, Statics.field1621);
            class91.field1432 = class226.field2869;
            class91.field1447 = 35;
            field951 = 50;
            Statics.field247 = new class263(Statics.field29, Statics.field42);
        } else if (field951 == 50) {
            class262[] var29 = new class262[] { class262.field3629, class262.field3623, class262.field3625, class262.field3624, class262.field3628, class262.field3635 };
            int var30 = var29.length;
            field981 = Statics.field247.method4489(class262.method4482());
            if (field981.size() < var30) {
                class91.field1432 = class226.field2870 + field981.size() * 100 / var30 + "%";
                class91.field1447 = 40;
            } else {
                Statics.field1478 = (class264) field981.get(class262.field3635);
                Statics.field260 = (class264) field981.get(class262.field3624);
                Statics.field2239 = (class264) field981.get(class262.field3625);
                Statics.field3138 = new class293(true);
                class91.field1432 = class226.field3114;
                class91.field1447 = 40;
                field951 = 60;
            }
        } else if (field951 == 60) {
            class238 var31 = Statics.field1410;
            class238 var32 = Statics.field29;
            int var33 = 0;
            if (var31.method3896("title.jpg", "")) {
                var33++;
            }
            if (var32.method3896("logo", "")) {
                var33++;
            }
            if (var32.method3896("logo_deadman_mode", "")) {
                var33++;
            }
            if (var32.method3896("titlebox", "")) {
                var33++;
            }
            if (var32.method3896("titlebutton", "")) {
                var33++;
            }
            if (var32.method3896("runes", "")) {
                var33++;
            }
            if (var32.method3896("title_mute", "")) {
                var33++;
            }
            if (var32.method3896("options_radio_buttons,0", "")) {
                var33++;
            }
            if (var32.method3896("options_radio_buttons,2", "")) {
                var33++;
            }
            if (var32.method3896("options_radio_buttons,4", "")) {
                var33++;
            }
            if (var32.method3896("options_radio_buttons,6", "")) {
                var33++;
            }
            var32.method3896("sl_back", "");
            var32.method3896("sl_flags", "");
            var32.method3896("sl_arrows", "");
            var32.method3896("sl_stars", "");
            var32.method3896("sl_button", "");
            int var36 = class91.method201();
            if (var33 < var36) {
                class91.field1432 = class226.field3022 + var33 * 100 / var36 + "%";
                class91.field1447 = 50;
            } else {
                class91.field1432 = class226.field2873;
                class91.field1447 = 50;
                method1026(5);
                field951 = 70;
            }
        } else if (field951 == 70) {
            if (Statics.field258.method3911()) {
                class238 var37 = Statics.field258;
                Statics.field3600 = var37;
                class247.method1492(Statics.field258);
                class248.method459(Statics.field258, Statics.field304);
                class256.method1556(Statics.field258, Statics.field304, field928);
                class259.method305(Statics.field258, Statics.field304);
                Statics.method315(Statics.field258);
                class257.method1952(Statics.field258, Statics.field304, field1105, Statics.field1478);
                class261.method3233(Statics.field258, Statics.field2403, Statics.field475);
                class238 var38 = Statics.field258;
                class238 var39 = Statics.field304;
                Statics.field22 = var38;
                Statics.field3334 = var39;
                class251.method18(Statics.field258);
                class238 var40 = Statics.field258;
                Statics.field3284 = var40;
                Statics.field3281 = Statics.field3284.method3908(16);
                class217.method3687(Statics.field2163, Statics.field304, Statics.field29, Statics.field42);
                class241.method979(Statics.field258);
                class238 var41 = Statics.field258;
                Statics.field3399 = var41;
                class238 var42 = Statics.field258;
                Statics.field3311 = var42;
                class238 var43 = Statics.field258;
                Statics.field3317 = var43;
                class252.method5(Statics.field258);
                Statics.field377 = new class96();
                class238 var44 = Statics.field258;
                class238 var45 = Statics.field29;
                class238 var46 = Statics.field42;
                Statics.field3431 = var44;
                Statics.field3433 = var45;
                Statics.field3434 = var46;
                class249.method3856(Statics.field258, Statics.field29);
                class238 var47 = Statics.field258;
                class238 var48 = Statics.field29;
                Statics.field3301 = var48;
                if (var47.method3911()) {
                    Statics.field646 = var47.method3908(35);
                    Statics.field3286 = new class243[Statics.field646];
                    for (int var49 = 0; var49 < Statics.field646; var49++) {
                        byte[] var50 = var47.method3876(35, var49);
                        if (var50 != null) {
                            Statics.field3286[var49] = new class243(var49);
                            Statics.field3286[var49].method4035(new class174(var50));
                            Statics.field3286[var49].method4037();
                        }
                    }
                }
                class91.field1432 = class226.field2875;
                class91.field1447 = 60;
                field951 = 80;
            } else {
                class91.field1432 = class226.field3059 + Statics.field258.method3982() + "%";
                class91.field1447 = 60;
            }
        } else if (field951 == 80) {
            int var51 = 0;
            if (Statics.field2495 == null) {
                Statics.field2495 = class288.method3851(Statics.field29, "compass", "");
            } else {
                var51++;
            }
            if (Statics.field613 == null) {
                Statics.field613 = class288.method3851(Statics.field29, "mapedge", "");
            } else {
                var51++;
            }
            if (Statics.field2802 == null) {
                Statics.field2802 = class288.method3837(Statics.field29, "mapscene", "");
            } else {
                var51++;
            }
            if (Statics.field2323 == null) {
                Statics.field2323 = class288.method2514(Statics.field29, "headicons_pk", "");
            } else {
                var51++;
            }
            if (Statics.field452 == null) {
                Statics.field452 = class288.method2514(Statics.field29, "headicons_prayer", "");
            } else {
                var51++;
            }
            if (Statics.field302 == null) {
                Statics.field302 = class288.method2514(Statics.field29, "headicons_hint", "");
            } else {
                var51++;
            }
            if (Statics.field2485 == null) {
                Statics.field2485 = class288.method2514(Statics.field29, "mapmarker", "");
            } else {
                var51++;
            }
            if (Statics.field1855 == null) {
                Statics.field1855 = class288.method2514(Statics.field29, "cross", "");
            } else {
                var51++;
            }
            if (Statics.field499 == null) {
                Statics.field499 = class288.method2514(Statics.field29, "mapdots", "");
            } else {
                var51++;
            }
            if (Statics.field1402 == null) {
                Statics.field1402 = class288.method3837(Statics.field29, "scrollbar", "");
            } else {
                var51++;
            }
            if (Statics.field1361 == null) {
                Statics.field1361 = class288.method3837(Statics.field29, "mod_icons", "");
            } else {
                var51++;
            }
            if (var51 < 11) {
                class91.field1432 = class226.field2876 + var51 * 100 / 12 + "%";
                class91.field1447 = 70;
            } else {
                Statics.field3649 = Statics.field1361;
                Statics.field613.method4814();
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2802[0].method4784(var52 + var55, var53 + var55, var54 + var55);
                class91.field1432 = class226.field2877;
                class91.field1447 = 70;
                field951 = 90;
            }
        } else if (field951 == 90) {
            if (Statics.field955.method3911()) {
                class124 var56 = new class124(Statics.field955, Statics.field29, 20, 0.8D, field928 ? 64 : 128);
                class135.method2445(var56);
                class135.method2446(0.8D);
                class91.field1432 = class226.field2879;
                class91.field1447 = 90;
                field951 = 110;
            } else {
                class91.field1432 = class226.field3072 + Statics.field955.method3982() + "%";
                class91.field1447 = 90;
            }
        } else if (field951 == 110) {
            Statics.field696 = new class71();
            Statics.field739.method2746(Statics.field696, 10);
            class91.field1432 = class226.field2880;
            class91.field1447 = 92;
            field951 = 120;
        } else if (field951 == 120) {
            if (Statics.field1410.method3896("huffman", "")) {
                class166 var57 = new class166(Statics.field1410.method3951("huffman", ""));
                Statics.field3662 = var57;
                class91.field1432 = class226.field3123;
                class91.field1447 = 94;
                field951 = 130;
            } else {
                class91.field1432 = class226.field3132 + "%";
                class91.field1447 = 94;
            }
        } else if (field951 == 130) {
            if (!Statics.field2163.method3911()) {
                class91.field1432 = class226.field2883 + Statics.field2163.method3982() * 4 / 5 + "%";
                class91.field1447 = 96;
            } else if (!Statics.field449.method3911()) {
                class91.field1432 = class226.field2883 + (80 + Statics.field449.method3982() / 6) + "%";
                class91.field1447 = 96;
            } else if (Statics.field42.method3911()) {
                class91.field1432 = class226.field2884;
                class91.field1447 = 98;
                field951 = 140;
            } else {
                class91.field1432 = class226.field2883 + (96 + Statics.field42.method3982() / 50) + "%";
                class91.field1447 = 96;
            }
        } else if (field951 == 140) {
            class91.field1447 = 100;
            if (Statics.field3196.method3897(class41.field568.field564)) {
                if (Statics.field1193 == null) {
                    Statics.field1193 = new class290();
                    Statics.field1193.method4942(Statics.field3196, Statics.field2239, field981, Statics.field2802);
                }
                int var58 = Statics.field1193.method4943();
                if (var58 < 100) {
                    class91.field1432 = class226.field3079 + (var58 * 9 / 10 + 10) + "%";
                } else {
                    class91.field1432 = class226.field2984;
                    field951 = 150;
                }
            } else {
                class91.field1432 = class226.field3079 + Statics.field3196.method3899(class41.field568.field564) / 10 + "%";
            }
        } else if (field951 == 150) {
            method1026(10);
        }
    }

    @ObfuscatedName("t.fr(IZZZI)Lih;")
    public static class238 method68(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2240 != null) {
            var4 = new class161(arg0, class156.field2240, Statics.field2418[arg0], 1000000);
        }
        return new class238(var4, Statics.field535, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fw(B)V")
    public final void method1167() {
        try {
            if (field1108 == 0) {
                if (Statics.field310 != null) {
                    Statics.field310.method2789();
                    Statics.field310 = null;
                }
                Statics.field1991 = null;
                field1050 = false;
                field958 = 0;
                field1108 = 1;
            }
            if (field1108 == 1) {
                if (Statics.field1991 == null) {
                    Statics.field1991 = Statics.field739.method2745(Statics.field506, Statics.field678);
                }
                if (Statics.field1991.field2218 == 2) {
                    throw new IOException();
                }
                if (Statics.field1991.field2218 == 1) {
                    Statics.field310 = new class160((Socket) Statics.field1991.field2225, Statics.field739);
                    Statics.field1991 = null;
                    field1108 = 2;
                }
            }
            if (field1108 == 2) {
                field968.field2390 = 0;
                field968.method2955(14);
                Statics.field310.method2809(field968.field2389, 0, 1);
                field970.field2390 = 0;
                field1108 = 3;
            }
            if (field1108 == 3) {
                if (Statics.field1778 != null) {
                    Statics.field1778.method1932();
                }
                if (Statics.field1 != null) {
                    Statics.field1.method1932();
                }
                int var1 = Statics.field310.method2788();
                if (Statics.field1778 != null) {
                    Statics.field1778.method1932();
                }
                if (Statics.field1 != null) {
                    Statics.field1.method1932();
                }
                if (var1 != 0) {
                    method4389(var1);
                    return;
                }
                field970.field2390 = 0;
                field1108 = 4;
            }
            if (field1108 == 4) {
                if (field970.field2390 < 8) {
                    int var2 = Statics.field310.method2791();
                    if (var2 > 8 - field970.field2390) {
                        var2 = 8 - field970.field2390;
                    }
                    if (var2 > 0) {
                        Statics.field310.method2805(field970.field2389, field970.field2390, var2);
                        field970.field2390 += var2;
                    }
                }
                if (field970.field2390 == 8) {
                    field970.field2390 = 0;
                    Statics.field244 = field970.method2977();
                    field1108 = 5;
                }
            }
            if (field1108 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field244 >> 32), (int) (Statics.field244 & 0xFFFFFFFFFFFFFFFFL) };
                field968.field2390 = 0;
                field968.method2955(1);
                field968.method2955(field1003.method13());
                field968.method3072(var3[0]);
                field968.method3072(var3[1]);
                field968.method3072(var3[2]);
                field968.method3072(var3[3]);
                switch(field1003.field2199) {
                    case 0:
                        field968.field2390 += 8;
                        break;
                    case 1:
                        class180 var4 = field968;
                        LinkedHashMap var5 = Statics.field869.field1307;
                        String var6 = class91.field1438;
                        int var7 = var6.length();
                        int var8 = 0;
                        for (int var9 = 0; var9 < var7; var9++) {
                            var8 = (var8 << 5) - var8 + var6.charAt(var9);
                        }
                        var4.method3072((Integer) var5.get(var8));
                        field968.field2390 += 4;
                        break;
                    case 2:
                    case 3:
                        field968.method3161(Statics.field586);
                        field968.field2390 += 5;
                }
                field968.method3117(class91.field1452);
                field968.method3191(class89.field1401, class89.field1399);
                field969.field2390 = 0;
                if (field1128 == 40) {
                    field969.method2955(18);
                } else {
                    field969.method2955(16);
                }
                field969.method2956(0);
                int var11 = field969.field2390;
                field969.method3072(156);
                field969.method2965(field968.field2389, 0, field968.field2390);
                int var12 = field969.field2390;
                field969.method3117(class91.field1438);
                field969.method2955((field1129 ? 1 : 0) << 1 | (field928 ? 1 : 0));
                field969.method2956(Statics.field2255);
                field969.method2956(Statics.field722);
                class180 var13 = field969;
                if (field943 == null) {
                    byte[] var14 = class156.method4200();
                    var13.method2965(var14, 0, var14.length);
                } else {
                    var13.method2965(field943, 0, field943.length);
                }
                field969.method3117(Statics.field2252);
                field969.method3072(Statics.field930);
                class174 var15 = new class174(Statics.field3138.method5150());
                Statics.field3138.method5148(var15);
                field969.method2965(var15.field2389, 0, var15.field2389.length);
                field969.method2955(Statics.field474);
                field969.method3072(0);
                field969.method3072(Statics.field2403.field3221);
                field969.method3072(Statics.field475.field3221);
                field969.method3072(Statics.field258.field3221);
                field969.method3072(Statics.field2163.field3221);
                field969.method3072(Statics.field311.field3221);
                field969.method3072(Statics.field327.field3221);
                field969.method3072(Statics.field528.field3221);
                field969.method3072(Statics.field304.field3221);
                field969.method3072(Statics.field29.field3221);
                field969.method3072(Statics.field955.field3221);
                field969.method3072(Statics.field1410.field3221);
                field969.method3072(Statics.field858.field3221);
                field969.method3072(Statics.field449.field3221);
                field969.method3072(Statics.field42.field3221);
                field969.method3072(Statics.field794.field3221);
                field969.method3072(Statics.field1296.field3221);
                field969.method3072(Statics.field3196.field3221);
                field969.method3058(var3, var12, field969.field2390);
                field969.method2967(field969.field2390 - var11);
                Statics.field310.method2809(field969.field2389, 0, field969.field2390);
                field968.method3235(var3);
                for (int var16 = 0; var16 < 4; var16++) {
                    var3[var16] += 50;
                }
                field970.method3235(var3);
                field1108 = 6;
            }
            if (field1108 == 6 && Statics.field310.method2791() > 0) {
                int var17 = Statics.field310.method2788();
                if (var17 == 21 && field1128 == 20) {
                    field1108 = 7;
                } else if (var17 == 2) {
                    field1108 = 9;
                } else if (var17 == 15 && field1128 == 40) {
                    field971 = -1;
                    field1108 = 13;
                } else if (var17 == 23 && field1185 < 1) {
                    field1185++;
                    field1108 = 0;
                } else if (var17 == 29) {
                    field1108 = 11;
                } else {
                    method4389(var17);
                    return;
                }
            }
            if (field1108 == 7 && Statics.field310.method2791() > 0) {
                field960 = (Statics.field310.method2788() + 3) * 60;
                field1108 = 8;
            }
            if (field1108 == 8) {
                field958 = 0;
                class91.method448(class226.field2874, class226.field2899, field960 / 60 + class226.field2892);
                if (--field960 <= 0) {
                    field1108 = 0;
                }
            } else {
                if (field1108 == 9 && Statics.field310.method2791() >= 13) {
                    boolean var18 = Statics.field310.method2788() == 1;
                    Statics.field310.method2805(field970.field2389, 0, 4);
                    field970.field2390 = 0;
                    boolean var19 = false;
                    if (var18) {
                        int var20 = field970.method3237() << 24;
                        int var21 = var20 | field970.method3237() << 16;
                        int var22 = var21 | field970.method3237() << 8;
                        int var23 = var22 | field970.method3237();
                        String var24 = class91.field1438;
                        int var25 = var24.length();
                        int var26 = 0;
                        for (int var27 = 0; var27 < var25; var27++) {
                            var26 = (var26 << 5) - var26 + var24.charAt(var27);
                        }
                        if (Statics.field869.field1307.size() >= 10 && !Statics.field869.field1307.containsKey(var26)) {
                            Iterator var30 = Statics.field869.field1307.entrySet().iterator();
                            var30.next();
                            var30.remove();
                        }
                        Statics.field869.field1307.put(var26, var23);
                    }
                    if (class91.field1440) {
                        Statics.field869.field1300 = class91.field1438;
                    } else {
                        Statics.field869.field1300 = null;
                    }
                    class80.method204();
                    field1082 = Statics.field310.method2788();
                    field1084 = Statics.field310.method2788() == 1;
                    field1036 = Statics.field310.method2788();
                    field1036 <<= 0x8;
                    field1036 += Statics.field310.method2788();
                    field1037 = Statics.field310.method2788();
                    Statics.field310.method2805(field970.field2389, 0, 1);
                    field970.field2390 = 0;
                    field972 = field970.method3237();
                    Statics.field310.method2805(field970.field2389, 0, 2);
                    field970.field2390 = 0;
                    field971 = field970.method3178();
                    try {
                        client var31 = Statics.field243;
                        JSObject.getWindow(var31).call("zap", (Object[]) null);
                    } catch (Throwable var53) {
                    }
                    field1108 = 10;
                }
                if (field1108 != 10) {
                    if (field1108 == 11 && Statics.field310.method2791() >= 2) {
                        field970.field2390 = 0;
                        Statics.field310.method2805(field970.field2389, 0, 2);
                        field970.field2390 = 0;
                        Statics.field1483 = field970.method3178();
                        field1108 = 12;
                    }
                    if (field1108 == 12 && Statics.field310.method2791() >= Statics.field1483) {
                        field970.field2390 = 0;
                        Statics.field310.method2805(field970.field2389, 0, Statics.field1483);
                        field970.field2390 = 0;
                        String var44 = field970.method3111();
                        String var45 = field970.method3111();
                        String var46 = field970.method3111();
                        class91.method448(var44, var45, var46);
                        method1026(10);
                    }
                    if (field1108 == 13) {
                        if (field971 == -1) {
                            if (Statics.field310.method2791() < 2) {
                                return;
                            }
                            Statics.field310.method2805(field970.field2389, 0, 2);
                            field970.field2390 = 0;
                            field971 = field970.method3178();
                        }
                        if (Statics.field310.method2791() >= field971) {
                            Statics.field310.method2805(field970.field2389, 0, field971);
                            field970.field2390 = 0;
                            int var47 = field971;
                            field980.method4655();
                            field968.field2390 = 0;
                            field970.field2390 = 0;
                            field972 = -1;
                            field975 = -1;
                            field976 = -1;
                            field977 = -1;
                            field971 = 0;
                            field1119 = 0;
                            field1031 = 0;
                            method2718();
                            field1149 = 0;
                            field1147 = 0;
                            for (int var48 = 0; var48 < 2048; var48++) {
                                field1035[var48] = null;
                            }
                            Statics.field832 = null;
                            for (int var49 = 0; var49 < field1131.length; var49++) {
                                class85 var50 = field1131[var49];
                                if (var50 != null) {
                                    var50.field1236 = -1;
                                    var50.field1237 = false;
                                }
                            }
                            class64.method189();
                            method1026(30);
                            for (int var51 = 0; var51 < 100; var51++) {
                                field1120[var51] = true;
                            }
                            field968.method3236(170);
                            field968.method2955(method2513());
                            field968.method2956(Statics.field2255);
                            field968.method2956(Statics.field722);
                            class95.method50(field970);
                            if (field970.field2390 != var47) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field958++;
                        if (field958 > 2000) {
                            if (field1185 < 1) {
                                if (Statics.field678 == Statics.field2121) {
                                    Statics.field678 = Statics.field2231;
                                } else {
                                    Statics.field678 = Statics.field2121;
                                }
                                field1185++;
                                field1108 = 0;
                            } else {
                                method4389(-3);
                            }
                        }
                    }
                } else if (Statics.field310.method2791() >= field971) {
                    field970.field2390 = 0;
                    Statics.field310.method2805(field970.field2389, 0, field971);
                    field980.method4653();
                    field1143 = 1L;
                    field979 = -1;
                    Statics.field696.field872 = 0;
                    Statics.field2268 = true;
                    field938 = true;
                    field1139 = -1L;
                    class282.method105();
                    field968.field2390 = 0;
                    field970.field2390 = 0;
                    field972 = -1;
                    field975 = -1;
                    field976 = -1;
                    field977 = -1;
                    field1119 = 0;
                    field1031 = 0;
                    field978 = 0;
                    field941 = 0;
                    method2718();
                    class60.method3206(0);
                    class97.method682();
                    field1068 = 0;
                    field1100 = false;
                    field1155 = 0;
                    field1156 = 0;
                    field1149 = 0;
                    field1117 = -1;
                    field1147 = 0;
                    field1102 = 0;
                    field949 = class90.field1407;
                    field950 = class90.field1407;
                    field954 = 0;
                    class95.method1053();
                    for (int var33 = 0; var33 < 2048; var33++) {
                        field1035[var33] = null;
                    }
                    for (int var34 = 0; var34 < 32768; var34++) {
                        field1131[var34] = null;
                    }
                    field1044 = -1;
                    field1047.method3428();
                    field1103.method3428();
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 104; var36++) {
                            for (int var37 = 0; var37 < 104; var37++) {
                                field1045[var35][var36][var37] = null;
                            }
                        }
                    }
                    field1046 = new class194();
                    field1181 = 0;
                    field1115 = 0;
                    field1080 = 0;
                    for (int var38 = 0; var38 < Statics.field3281; var38++) {
                        class242 var39 = class242.method997(var38);
                        if (var39 != null) {
                            class212.field2598[var38] = 0;
                            class212.field2599[var38] = 0;
                        }
                    }
                    Statics.field377.method1693();
                    field1083 = -1;
                    if (field1075 != -1) {
                        class217.method6(field1075);
                    }
                    for (class68 var40 = (class68) field974.method3377(); var40 != null; var40 = (class68) field974.method3378()) {
                        method1982(var40, true);
                    }
                    field1075 = -1;
                    field974 = new class191(8);
                    field1079 = null;
                    method2718();
                    field1186.method3736((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var41 = 0; var41 < 8; var41++) {
                        field1158[var41] = null;
                        field1042[var41] = false;
                    }
                    class64.method189();
                    field932 = true;
                    for (int var42 = 0; var42 < 100; var42++) {
                        field1120[var42] = true;
                    }
                    field968.method3236(170);
                    field968.method2955(method2513());
                    field968.method2956(Statics.field2255);
                    field968.method2956(Statics.field722);
                    field1022 = null;
                    Statics.field23 = 0;
                    Statics.field1352 = null;
                    for (int var43 = 0; var43 < 8; var43++) {
                        field1189[var43] = new class17();
                    }
                    Statics.field2581 = null;
                    class95.method50(field970);
                    Statics.field679 = -1;
                    method1002(false);
                    field972 = -1;
                }
            }
        } catch (IOException var54) {
            if (field1185 < 1) {
                if (Statics.field678 == Statics.field2121) {
                    Statics.field678 = Statics.field2231;
                } else {
                    Statics.field678 = Statics.field2121;
                }
                field1185++;
                field1108 = 0;
            } else {
                method4389(-2);
            }
        }
    }

    @ObfuscatedName("im.fq(II)V")
    public static void method4389(int arg0) {
        if (arg0 == -3) {
            class91.method448(class226.field2893, class226.field2894, class226.field3047);
        } else if (arg0 == -2) {
            class91.method448(class226.field2896, class226.field2976, class226.field2898);
        } else if (arg0 == -1) {
            class91.method448(class226.field2961, class226.field3104, class226.field3100);
        } else if (arg0 == 3) {
            class91.field1433 = 3;
        } else if (arg0 == 4) {
            class91.method448(class226.field2912, class226.field2903, class226.field2904);
        } else if (arg0 == 5) {
            class91.method448(class226.field2905, class226.field2906, class226.field3096);
        } else if (arg0 == 6) {
            class91.method448(class226.field2908, class226.field2882, class226.field3103);
        } else if (arg0 == 7) {
            class91.method448(class226.field2911, class226.field3129, class226.field2948);
        } else if (arg0 == 8) {
            class91.method448(class226.field2914, class226.field2915, class226.field2916);
        } else if (arg0 == 9) {
            class91.method448(class226.field2890, class226.field2918, class226.field2919);
        } else if (arg0 == 10) {
            class91.method448(class226.field2920, class226.field2886, class226.field3091);
        } else if (arg0 == 11) {
            class91.method448(class226.field2923, class226.field2924, class226.field2925);
        } else if (arg0 == 12) {
            class91.method448(class226.field2926, class226.field3089, class226.field2928);
        } else if (arg0 == 13) {
            class91.method448(class226.field2929, class226.field2930, class226.field2931);
        } else if (arg0 == 14) {
            class91.method448(class226.field3040, class226.field2933, class226.field2934);
        } else if (arg0 == 16) {
            class91.method448(class226.field3117, class226.field3037, class226.field2937);
        } else if (arg0 == 17) {
            class91.method448(class226.field2938, class226.field2939, class226.field2940);
        } else if (arg0 == 18) {
            class91.method448(class226.field2941, class226.field2871, class226.field3008);
        } else if (arg0 == 19) {
            class91.method448(class226.field2944, class226.field2954, class226.field3015);
        } else if (arg0 == 20) {
            class91.method448(class226.field2991, class226.field2962, class226.field2949);
        } else if (arg0 == 22) {
            class91.method448(class226.field2950, class226.field2951, class226.field2952);
        } else if (arg0 == 23) {
            class91.method448(class226.field3051, class226.field3119, class226.field2955);
        } else if (arg0 == 24) {
            class91.method448(class226.field2956, class226.field2957, class226.field2958);
        } else if (arg0 == 25) {
            class91.method448(class226.field2959, class226.field3067, class226.field3069);
        } else if (arg0 == 26) {
            class91.method448(class226.field2856, class226.field3036, class226.field2964);
        } else if (arg0 == 27) {
            class91.method448(class226.field2965, class226.field2943, class226.field2967);
        } else if (arg0 == 31) {
            class91.method448(class226.field2946, class226.field2993, class226.field2895);
        } else if (arg0 == 32) {
            class91.method448(class226.field2910, class226.field2978, class226.field2979);
        } else if (arg0 == 37) {
            class91.method448(class226.field2980, class226.field2981, class226.field2982);
        } else if (arg0 == 38) {
            class91.method448(class226.field2983, class226.field2947, class226.field2985);
        } else if (arg0 == 55) {
            class91.method448(class226.field2942, class226.field3021, class226.field2988);
        } else if (arg0 == 56) {
            class91.method448(class226.field2936, class226.field2945, class226.field2995);
            method1026(11);
            return;
        } else if (arg0 == 57) {
            class91.method448(class226.field2992, class226.field3053, class226.field2994);
            method1026(11);
            return;
        } else {
            class91.method448(class226.field3112, class226.field2996, class226.field2997);
        }
        method1026(10);
    }

    @ObfuscatedName("cv.fc(I)V")
    public static final void method1776() {
        if (Statics.field310 != null) {
            Statics.field310.method2789();
            Statics.field310 = null;
        }
        method470();
        Statics.field28.method2517();
        for (int var0 = 0; var0 < 4; var0++) {
            field987[var0].method2826();
        }
        System.gc();
        class204.method2891(2);
        field1151 = -1;
        field1152 = false;
        class81.method205();
        method1026(10);
    }

    @ObfuscatedName("ae.fk(I)V")
    public static final void method470() {
        class260.field3590.method3361();
        class247.field3337.method3361();
        class248.method3217();
        class256.field3438.method3361();
        class256.field3439.method3361();
        class256.field3446.method3361();
        class256.field3441.method3361();
        class259.field3552.method3361();
        class259.field3553.method3361();
        class257.method3695();
        class261.method3848();
        class246.method1658();
        class251.method14();
        class242.method2702();
        class255.field3414.method3361();
        class255.field3415.method3361();
        class255.field3413.method3361();
        class249.method3273();
        class253.field3395.method3361();
        class252.method3844();
        class243.field3298.method3361();
        class214.field2609.method3361();
        class217.field2698.method3361();
        class217.field2727.method3361();
        class217.field2639.method3361();
        class217.field2640.method3361();
        ((class124) Statics.field2021).method2234();
        class98.field1523.method3361();
        Statics.field2403.method3910();
        Statics.field475.method3910();
        Statics.field2163.method3910();
        Statics.field311.method3910();
        Statics.field327.method3910();
        Statics.field528.method3910();
        Statics.field304.method3910();
        Statics.field29.method3910();
        Statics.field955.method3910();
        Statics.field1410.method3910();
        Statics.field858.method3910();
        Statics.field449.method3910();
    }

    @ObfuscatedName("bz.fo(S)V")
    public static final void method941() {
        if (field978 > 0) {
            method1776();
        } else {
            field980.method4654();
            method1026(40);
            Statics.field325 = Statics.field310;
            Statics.field310 = null;
        }
    }

    @ObfuscatedName("client.fu(I)V")
    public final void method1061() {
        if (field1031 > 1) {
            field1031--;
        }
        if (field978 > 0) {
            field978--;
        }
        if (field1050) {
            field1050 = false;
            method941();
            return;
        }
        if (!field1053) {
            method546();
        }
        for (int var1 = 0; var1 < 100 && this.method1064(); var1++) {
        }
        if (field1128 != 30) {
            return;
        }
        while (true) {
            class281 var2 = (class281) class282.field3767.method3395();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field980.field3733) {
                    field968.method3236(197);
                    field968.method2955(0);
                    int var5 = field968.field2390;
                    field980.method4656(field968);
                    field968.method3175(field968.field2390 - var5);
                    field980.method4668();
                }
                Object var6 = Statics.field696.field868;
                synchronized (Statics.field696.field868) {
                    if (!field931) {
                        Statics.field696.field872 = 0;
                    } else if (class60.field744 != 0 || Statics.field696.field872 >= 40) {
                        field968.method3236(248);
                        field968.method2955(0);
                        int var7 = field968.field2390;
                        int var8 = 0;
                        for (int var9 = 0; var9 < Statics.field696.field872 && field968.field2390 - var7 < 240; var9++) {
                            var8++;
                            int var10 = Statics.field696.field871[var9];
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > 502) {
                                var10 = 502;
                            }
                            int var11 = Statics.field696.field874[var9];
                            if (var11 < 0) {
                                var11 = 0;
                            } else if (var11 > 764) {
                                var11 = 764;
                            }
                            int var12 = var10 * 765 + var11;
                            if (Statics.field696.field871[var9] == -1 && Statics.field696.field874[var9] == -1) {
                                var11 = -1;
                                var10 = -1;
                                var12 = 524287;
                            }
                            if (field935 != var11 || field973 != var10) {
                                int var13 = var11 - field935;
                                field935 = var11;
                                int var14 = var10 - field973;
                                field973 = var10;
                                if (field979 < 8 && var13 >= -32 && var13 <= 31 && var14 >= -32 && var14 <= 31) {
                                    var13 += 32;
                                    var14 += 32;
                                    field968.method2956((field979 << 12) + (var13 << 6) + var14);
                                    field979 = 0;
                                } else if (field979 < 8) {
                                    field968.method3161((field979 << 19) + 8388608 + var12);
                                    field979 = 0;
                                } else {
                                    field968.method3072((field979 << 19) + -1073741824 + var12);
                                    field979 = 0;
                                }
                            } else if (field979 < 2047) {
                                field979++;
                            }
                        }
                        field968.method3175(field968.field2390 - var7);
                        if (var8 >= Statics.field696.field872) {
                            Statics.field696.field872 = 0;
                        } else {
                            Statics.field696.field872 -= var8;
                            for (int var15 = 0; var15 < Statics.field696.field872; var15++) {
                                Statics.field696.field874[var15] = Statics.field696.field874[var8 + var15];
                                Statics.field696.field871[var15] = Statics.field696.field871[var8 + var15];
                            }
                        }
                    }
                }
                if (class60.field744 == 1 || !Statics.field245 && class60.field744 == 4 || class60.field744 == 2) {
                    long var17 = (class60.field760 - field1143 * -1L) / 50L;
                    if (var17 > 4095L) {
                        var17 = 4095L;
                    }
                    field1143 = class60.field760 * -1L;
                    int var19 = class60.field759;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > Statics.field722) {
                        var19 = Statics.field722;
                    }
                    int var20 = class60.field758;
                    if (var20 < 0) {
                        var20 = 0;
                    } else if (var20 > Statics.field2255) {
                        var20 = Statics.field2255;
                    }
                    int var21 = (int) var17;
                    field968.method3236(84);
                    field968.method2956((var21 << 1) + (class60.field744 == 2 ? 1 : 0));
                    field968.method2956(var20);
                    field968.method2956(var19);
                }
                if (class51.field667 > 0) {
                    field968.method3236(106);
                    field968.method2956(0);
                    int var22 = field968.field2390;
                    long var23 = class176.method3200();
                    for (int var25 = 0; var25 < class51.field667; var25++) {
                        long var26 = var23 - field1139;
                        if (var26 > 16777215L) {
                            var26 = 16777215L;
                        }
                        field1139 = var23;
                        field968.method3013((int) var26);
                        field968.method2996(class51.field672[var25]);
                    }
                    field968.method2967(field968.field2390 - var22);
                }
                if (field1021 > 0) {
                    field1021--;
                }
                if (class51.field660[96] || class51.field660[97] || class51.field660[98] || class51.field660[99]) {
                    field1006 = true;
                }
                if (field1006 && field1021 <= 0) {
                    field1021 = 20;
                    field1006 = false;
                    field968.method3236(64);
                    field968.method3005(field998);
                    field968.method3005(field1156);
                }
                if (Statics.field2268 && !field938) {
                    field938 = true;
                    field968.method3236(209);
                    field968.method2955(1);
                }
                if (!Statics.field2268 && field938) {
                    field938 = false;
                    field968.method3236(209);
                    field968.method2955(0);
                }
                if (Statics.field609 != field1117) {
                    field1117 = Statics.field609;
                    method3836(Statics.field609);
                }
                if (field1128 != 30) {
                    return;
                }
                method3845();
                int var10002;
                for (int var28 = 0; var28 < field1155; var28++) {
                    var10002 = field1137[var28]--;
                    if (field1137[var28] >= -10) {
                        class104 var30 = field1160[var28];
                        if (var30 == null) {
                            class104 var10000 = (class104) null;
                            var30 = class104.method1846(Statics.field311, field1099[var28], 0);
                            if (var30 == null) {
                                continue;
                            }
                            field1137[var28] += var30.method1835();
                            field1160[var28] = var30;
                        }
                        if (field1137[var28] < 0) {
                            int var37;
                            if (field1041[var28] == 0) {
                                var37 = field1153;
                            } else {
                                int var31 = (field1041[var28] & 0xFF) * 128;
                                int var32 = field1041[var28] >> 16 & 0xFF;
                                int var33 = var32 * 128 + 64 - Statics.field832.field1225;
                                if (var33 < 0) {
                                    var33 = -var33;
                                }
                                int var34 = field1041[var28] >> 8 & 0xFF;
                                int var35 = var34 * 128 + 64 - Statics.field832.field1211;
                                if (var35 < 0) {
                                    var35 = -var35;
                                }
                                int var36 = var33 + var35 - 128;
                                if (var36 > var31) {
                                    field1137[var28] = -100;
                                    continue;
                                }
                                if (var36 < 0) {
                                    var36 = 0;
                                }
                                var37 = field923 * (var31 - var36) / var31;
                            }
                            if (var37 > 0) {
                                class106 var38 = var30.method1834().method1882(Statics.field3391);
                                class116 var39 = class116.method2134(var38, 100, var37);
                                var39.method2012(field1157[var28] - 1);
                                Statics.field279.method1779(var39);
                            }
                            field1137[var28] = -100;
                        }
                    } else {
                        field1155--;
                        for (int var29 = var28; var29 < field1155; var29++) {
                            field1099[var29] = field1099[var29 + 1];
                            field1160[var29] = field1160[var29 + 1];
                            field1157[var29] = field1157[var29 + 1];
                            field1137[var29] = field1137[var29 + 1];
                            field1041[var29] = field1041[var29 + 1];
                        }
                        var28--;
                    }
                }
                if (field1152) {
                    boolean var40;
                    if (class204.field2501 == 0) {
                        var40 = Statics.field2500.method3600();
                    } else {
                        var40 = true;
                    }
                    if (!var40) {
                        if (field1150 != 0 && field1151 != -1) {
                            class204.method1573(Statics.field528, field1151, 0, field1150, false);
                        }
                        field1152 = false;
                    }
                }
                field1119++;
                if (field1119 > 750) {
                    method941();
                    return;
                }
                method990();
                for (int var41 = 0; var41 < field954; var41++) {
                    int var42 = field965[var41];
                    class85 var43 = field1131[var42];
                    if (var43 != null) {
                        method446(var43, var43.field1367.field3556);
                    }
                }
                method30();
                field1005++;
                if (field1025 != 0) {
                    field1024 += 20;
                    if (field1024 >= 400) {
                        field1025 = 0;
                    }
                }
                if (Statics.field883 != null) {
                    field1026++;
                    if (field1026 >= 15) {
                        method578(Statics.field883);
                        Statics.field883 = null;
                    }
                }
                class217 var44 = Statics.field3622;
                class217 var45 = Statics.field2304;
                Statics.field3622 = null;
                Statics.field2304 = null;
                field1092 = null;
                field1154 = false;
                field1184 = false;
                field1136 = 0;
                while (class51.method2946() && field1136 < 128) {
                    if (field1082 >= 2 && class51.field660[82] && Statics.field3631 == 66) {
                        String var46 = class97.method115();
                        Statics.field243.method823(var46);
                    } else {
                        field1016[field1136] = Statics.field3631;
                        field1096[field1136] = Statics.field619;
                        field1136++;
                    }
                }
                boolean var47 = field1082 >= 2;
                if (var47 && class51.field660[82] && class51.field660[81] && field1113 != 0) {
                    int var48 = Statics.field832.field909 - field1113;
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 3) {
                        var48 = 3;
                    }
                    if (Statics.field832.field909 != var48) {
                        int var49 = Statics.field352 + Statics.field832.field1265[0];
                        int var50 = Statics.field3706 + Statics.field832.field1266[0];
                        field968.method3236(30);
                        field968.method3093(var50);
                        field968.method3093(var49);
                        field968.method2996(var48);
                    }
                    field1113 = 0;
                }
                if (field1075 != -1) {
                    method1764(field1075, 0, 0, Statics.field2255, Statics.field722, 0, 0);
                }
                field1138++;
                while (true) {
                    class69 var51;
                    class217 var52;
                    class217 var53;
                    do {
                        var51 = (class69) field1172.method3432();
                        if (var51 == null) {
                            while (true) {
                                class69 var54;
                                class217 var55;
                                class217 var56;
                                do {
                                    var54 = (class69) field1116.method3432();
                                    if (var54 == null) {
                                        while (true) {
                                            class69 var57;
                                            class217 var58;
                                            class217 var59;
                                            do {
                                                var57 = (class69) field1114.method3432();
                                                if (var57 == null) {
                                                    this.method1327();
                                                    if (Statics.field1193 != null) {
                                                        Statics.field1193.method5014(Statics.field609, (Statics.field832.field1225 >> 7) + Statics.field352, (Statics.field832.field1211 >> 7) + Statics.field3706, false);
                                                        Statics.field1193.method5015();
                                                    }
                                                    if (field1159 != null) {
                                                        this.method1206();
                                                    }
                                                    if (Statics.field788 != null) {
                                                        method578(Statics.field788);
                                                        field1033++;
                                                        if (class60.field751 == 0) {
                                                            if (field1032) {
                                                                if (Statics.field788 == Statics.field1499 && field945 != field1178) {
                                                                    class217 var60 = Statics.field788;
                                                                    byte var61 = 0;
                                                                    if (field1078 == 1 && var60.field2647 == 206) {
                                                                        var61 = 1;
                                                                    }
                                                                    if (var60.field2761[field1178] <= 0) {
                                                                        var61 = 0;
                                                                    }
                                                                    if (class218.method2515(method177(var60))) {
                                                                        int var62 = field945;
                                                                        int var63 = field1178;
                                                                        var60.field2761[var63] = var60.field2761[var62];
                                                                        var60.field2637[var63] = var60.field2637[var62];
                                                                        var60.field2761[var62] = -1;
                                                                        var60.field2637[var62] = 0;
                                                                    } else if (var61 == 1) {
                                                                        int var64 = field945;
                                                                        int var65 = field1178;
                                                                        while (var64 != var65) {
                                                                            if (var64 > var65) {
                                                                                var60.method3778(var64 - 1, var64);
                                                                                var64--;
                                                                            } else if (var64 < var65) {
                                                                                var60.method3778(var64 + 1, var64);
                                                                                var64++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var60.method3778(field1178, field945);
                                                                    }
                                                                    field968.method3236(187);
                                                                    field968.method2976(var61);
                                                                    field968.method3005(field1178);
                                                                    field968.method2957(field945);
                                                                    field968.method3026(Statics.field788.field2643);
                                                                }
                                                            } else if (this.method1095()) {
                                                                this.method1067(field1029, field1132);
                                                            } else if (field926 > 0) {
                                                                int var66 = field1029;
                                                                int var67 = field1132;
                                                                class88 var68 = Statics.field2345;
                                                                method634(var68.field1390, var68.field1397, var68.field1392, var68.field1391, var68.field1394, var68.field1394, var66, var67);
                                                                Statics.field2345 = null;
                                                            }
                                                            field1026 = 10;
                                                            class60.field744 = 0;
                                                            Statics.field788 = null;
                                                        } else if (field1033 >= 5 && (class60.field757 > field1029 + 5 || class60.field757 < field1029 - 5 || class60.field742 > field1132 + 5 || class60.field742 < field1132 - 5)) {
                                                            field1032 = true;
                                                        }
                                                    }
                                                    if (class138.method2556()) {
                                                        int var69 = class138.field2073;
                                                        int var70 = class138.field2074;
                                                        field968.method3236(202);
                                                        field968.method2955(5);
                                                        field968.method2955(class51.field660[82] ? (class51.field660[81] ? 2 : 1) : 0);
                                                        field968.method2957(Statics.field3706 + var70);
                                                        field968.method3093(Statics.field352 + var69);
                                                        class138.method2531();
                                                        field1048 = class60.field758;
                                                        field1023 = class60.field759;
                                                        field1025 = 1;
                                                        field1024 = 0;
                                                        field1147 = var69;
                                                        field1102 = var70;
                                                    }
                                                    if (Statics.field3622 != var44) {
                                                        if (var44 != null) {
                                                            method578(var44);
                                                        }
                                                        if (Statics.field3622 != null) {
                                                            method578(Statics.field3622);
                                                        }
                                                    }
                                                    if (Statics.field2304 != var45 && field1067 == field1066) {
                                                        if (var45 != null) {
                                                            method578(var45);
                                                        }
                                                        if (Statics.field2304 != null) {
                                                            method578(Statics.field2304);
                                                        }
                                                    }
                                                    if (Statics.field2304 == null) {
                                                        if (field1066 > 0) {
                                                            field1066--;
                                                        }
                                                    } else if (field1066 < field1067) {
                                                        field1066++;
                                                        if (field1067 == field1066) {
                                                            method578(Statics.field2304);
                                                        }
                                                    }
                                                    method468();
                                                    if (field1161) {
                                                        int var71 = Statics.field2591 * 128 + 64;
                                                        int var72 = Statics.field2125 * 128 + 64;
                                                        int var73 = method537(var71, var72, Statics.field609) - Statics.field1272;
                                                        if (Statics.field2408 < var71) {
                                                            Statics.field2408 += Statics.field1449 * (var71 - Statics.field2408) / 1000 + Statics.field621;
                                                            if (Statics.field2408 > var71) {
                                                                Statics.field2408 = var71;
                                                            }
                                                        }
                                                        if (Statics.field2408 > var71) {
                                                            Statics.field2408 -= Statics.field1449 * (Statics.field2408 - var71) / 1000 + Statics.field621;
                                                            if (Statics.field2408 < var71) {
                                                                Statics.field2408 = var71;
                                                            }
                                                        }
                                                        if (Statics.field3168 < var73) {
                                                            Statics.field3168 += Statics.field1449 * (var73 - Statics.field3168) / 1000 + Statics.field621;
                                                            if (Statics.field3168 > var73) {
                                                                Statics.field3168 = var73;
                                                            }
                                                        }
                                                        if (Statics.field3168 > var73) {
                                                            Statics.field3168 -= Statics.field1449 * (Statics.field3168 - var73) / 1000 + Statics.field621;
                                                            if (Statics.field3168 < var73) {
                                                                Statics.field3168 = var73;
                                                            }
                                                        }
                                                        if (Statics.field1299 < var72) {
                                                            Statics.field1299 += Statics.field1449 * (var72 - Statics.field1299) / 1000 + Statics.field621;
                                                            if (Statics.field1299 > var72) {
                                                                Statics.field1299 = var72;
                                                            }
                                                        }
                                                        if (Statics.field1299 > var72) {
                                                            Statics.field1299 -= Statics.field1449 * (Statics.field1299 - var72) / 1000 + Statics.field621;
                                                            if (Statics.field1299 < var72) {
                                                                Statics.field1299 = var72;
                                                            }
                                                        }
                                                        int var74 = Statics.field2498 * 128 + 64;
                                                        int var75 = Statics.field293 * 128 + 64;
                                                        int var76 = method537(var74, var75, Statics.field609) - Statics.field367;
                                                        int var77 = var74 - Statics.field2408;
                                                        int var78 = var76 - Statics.field3168;
                                                        int var79 = var75 - Statics.field1299;
                                                        int var80 = (int) Math.sqrt((double) (var77 * var77 + var79 * var79));
                                                        int var81 = (int) (Math.atan2((double) var78, (double) var80) * 325.949D) & 0x7FF;
                                                        int var82 = (int) (Math.atan2((double) var77, (double) var79) * -325.949D) & 0x7FF;
                                                        if (var81 < 128) {
                                                            var81 = 128;
                                                        }
                                                        if (var81 > 383) {
                                                            var81 = 383;
                                                        }
                                                        if (Statics.field326 < var81) {
                                                            Statics.field326 += Statics.field831 * (var81 - Statics.field326) / 1000 + Statics.field825;
                                                            if (Statics.field326 > var81) {
                                                                Statics.field326 = var81;
                                                            }
                                                        }
                                                        if (Statics.field326 > var81) {
                                                            Statics.field326 -= Statics.field831 * (Statics.field326 - var81) / 1000 + Statics.field825;
                                                            if (Statics.field326 < var81) {
                                                                Statics.field326 = var81;
                                                            }
                                                        }
                                                        int var83 = var82 - Statics.field1279;
                                                        if (var83 > 1024) {
                                                            var83 -= 2048;
                                                        }
                                                        if (var83 < -1024) {
                                                            var83 += 2048;
                                                        }
                                                        if (var83 > 0) {
                                                            Statics.field1279 += Statics.field831 * var83 / 1000 + Statics.field825;
                                                            Statics.field1279 &= 0x7FF;
                                                        }
                                                        if (var83 < 0) {
                                                            Statics.field1279 -= Statics.field831 * -var83 / 1000 + Statics.field825;
                                                            Statics.field1279 &= 0x7FF;
                                                        }
                                                        int var84 = var82 - Statics.field1279;
                                                        if (var84 > 1024) {
                                                            var84 -= 2048;
                                                        }
                                                        if (var84 < -1024) {
                                                            var84 += 2048;
                                                        }
                                                        if (var84 < 0 && var83 > 0 || var84 > 0 && var83 < 0) {
                                                            Statics.field1279 = var82;
                                                        }
                                                    }
                                                    for (int var85 = 0; var85 < 5; var85++) {
                                                        var10002 = field1166[var85]++;
                                                    }
                                                    Statics.field377.method1697();
                                                    int var86 = ++class60.field746 - 1;
                                                    int var88 = class51.field643;
                                                    if (var86 > 15000 && var88 > 15000) {
                                                        field978 = 250;
                                                        class60.method3206(14500);
                                                        field968.method3236(94);
                                                    }
                                                    for (class67 var90 = (class67) field1183.method3462(); var90 != null; var90 = (class67) field1183.method3465()) {
                                                        if ((long) var90.field833 < class176.method3200() / 1000L - 5L) {
                                                            if (var90.field830 > 0) {
                                                                class97.method3203(5, "", var90.field829 + class226.field2998);
                                                            }
                                                            if (var90.field830 == 0) {
                                                                class97.method3203(5, "", var90.field829 + class226.field2999);
                                                            }
                                                            var90.method3466();
                                                        }
                                                    }
                                                    field1130++;
                                                    if (field1130 > 50) {
                                                        field968.method3236(154);
                                                    }
                                                    try {
                                                        if (Statics.field310 != null && field968.field2390 > 0) {
                                                            Statics.field310.method2809(field968.field2389, 0, field968.field2390);
                                                            field968.field2390 = 0;
                                                            field1130 = 0;
                                                        }
                                                    } catch (IOException var92) {
                                                        method941();
                                                    }
                                                    return;
                                                }
                                                var58 = var57.field851;
                                                if (var58.field2644 < 0) {
                                                    break;
                                                }
                                                var59 = class217.method2254(var58.field2701);
                                            } while (var59 == null || var59.field2767 == null || var58.field2644 >= var59.field2767.length || var59.field2767[var58.field2644] != var58);
                                            class82.method730(var57);
                                        }
                                    }
                                    var55 = var54.field851;
                                    if (var55.field2644 < 0) {
                                        break;
                                    }
                                    var56 = class217.method2254(var55.field2701);
                                } while (var56 == null || var56.field2767 == null || var55.field2644 >= var56.field2767.length || var56.field2767[var55.field2644] != var55);
                                class82.method730(var54);
                            }
                        }
                        var52 = var51.field851;
                        if (var52.field2644 < 0) {
                            break;
                        }
                        var53 = class217.method2254(var52.field2701);
                    } while (var53 == null || var53.field2767 == null || var52.field2644 >= var53.field2767.length || var53.field2767[var52.field2644] != var52);
                    class82.method730(var51);
                }
            }
            field968.method3236(220);
            field968.method2955(0);
            int var4 = field968.field2390;
            class282.method3870(field968);
            field968.method3175(field968.field2390 - var4);
        }
    }

    @ObfuscatedName("an.fj(I)V")
    public static final void method669() {
        if (Statics.field1 != null) {
            Statics.field1.method1914();
        }
        if (Statics.field1778 != null) {
            Statics.field1778.method1914();
        }
    }

    @ObfuscatedName("aj.fv(Ljt;IIII)V")
    public static void method488(class261 arg0, int arg1, int arg2, int arg3) {
        if (field1155 >= 50 || field923 == 0 || arg0.field3610 == null || arg1 >= arg0.field3610.length) {
            return;
        }
        int var4 = arg0.field3610[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1099[field1155] = var5;
        field1157[field1155] = var6;
        field1137[field1155] = 0;
        field1160[field1155] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1041[field1155] = (var8 << 16) + (var9 << 8) + var7;
        field1155++;
    }

    @ObfuscatedName("ex.fp(II)V")
    public static void method2720(int arg0) {
        if (arg0 == -1 && !field1152) {
            class204.method2740();
        } else if (arg0 != -1 && field1151 != arg0 && field1150 != 0 && !field1152) {
            class204.method2824(2, Statics.field528, arg0, 0, field1150, false);
        }
        field1151 = arg0;
    }

    @ObfuscatedName("e.fm(I)V")
    public static final void method30() {
        int[] var0 = class95.field1491;
        for (int var1 = 0; var1 < class95.field1500; var1++) {
            class74 var2 = field1035[var0[var1]];
            if (var2 != null && var2.field1226 > 0) {
                var2.field1226--;
                if (var2.field1226 == 0) {
                    var2.field1223 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field954; var3++) {
            int var4 = field965[var3];
            class85 var5 = field1131[var4];
            if (var5 != null && var5.field1226 > 0) {
                var5.field1226--;
                if (var5.field1226 == 0) {
                    var5.field1223 = null;
                }
            }
        }
    }

    @ObfuscatedName("dv.fi(Ljava/lang/String;I)V")
    public static final void method2199(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field869.field1304 = !Statics.field869.field1304;
            class80.method204();
            if (Statics.field869.field1304) {
                class97.method3203(99, "", "Roofs are now all hidden");
            } else {
                class97.method3203(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field939 = !field939;
        }
        if (field1082 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field246) {
                    class8.field246 = true;
                    class8.field241 = class12.field276;
                } else if (class8.field241 == class12.field276) {
                    class8.field246 = true;
                    class8.field241 = class12.field277;
                } else {
                    class8.field246 = false;
                }
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field939 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field939 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method941();
            }
            if (arg0.equalsIgnoreCase("errortest") && field1145 == 2) {
                throw new RuntimeException();
            }
        }
        field968.method3236(138);
        field968.method2955(arg0.length() + 1);
        field968.method3117(arg0);
    }

    @ObfuscatedName("ae.fz(I)V")
    public static final void method468() {
        int var0 = Statics.field832.field1225;
        int var1 = Statics.field832.field1211;
        if (Statics.field2149 - var0 < -500 || Statics.field2149 - var0 > 500 || Statics.field2433 - var1 < -500 || Statics.field2433 - var1 > 500) {
            Statics.field2149 = var0;
            Statics.field2433 = var1;
        }
        if (Statics.field2149 != var0) {
            Statics.field2149 += (var0 - Statics.field2149) / 16;
        }
        if (Statics.field2433 != var1) {
            Statics.field2433 += (var1 - Statics.field2433) / 16;
        }
        if (class60.field751 == 4 && Statics.field245) {
            int var2 = class60.field742 - field996;
            field1001 = var2 * 2;
            field996 = var2 == -1 || var2 == 1 ? class60.field742 : (field996 + class60.field742) / 2;
            int var3 = field1002 - class60.field757;
            field995 = var3 * 2;
            field1002 = var3 == -1 || var3 == 1 ? class60.field757 : (field1002 + class60.field757) / 2;
        } else {
            if (class51.field660[96]) {
                field995 += (-24 - field995) / 2;
            } else if (class51.field660[97]) {
                field995 += (24 - field995) / 2;
            } else {
                field995 /= 2;
            }
            if (class51.field660[98]) {
                field1001 += (12 - field1001) / 2;
            } else if (class51.field660[99]) {
                field1001 += (-12 - field1001) / 2;
            } else {
                field1001 /= 2;
            }
            field996 = class60.field742;
            field1002 = class60.field757;
        }
        field1156 = field995 / 2 + field1156 & 0x7FF;
        field998 += field1001 / 2;
        if (field998 < 128) {
            field998 = 128;
        }
        if (field998 > 383) {
            field998 = 383;
        }
        int var4 = Statics.field2149 >> 7;
        int var5 = Statics.field2433 >> 7;
        int var6 = method537(Statics.field2149, Statics.field2433, Statics.field609);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field609;
                    if (var10 < 3 && (class62.field770[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field774[var10][var8][var9];
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
        if (var12 > field959) {
            field959 += (var12 - field959) / 24;
        } else if (var12 < field959) {
            field959 += (var12 - field959) / 80;
        }
    }

    @ObfuscatedName("bt.fb(I)V")
    public static final void method990() {
        int var0 = class95.field1500;
        int[] var1 = class95.field1491;
        for (int var2 = 0; var2 < var0; var2++) {
            class74 var3 = field1035[var1[var2]];
            if (var3 != null) {
                method446(var3, 1);
            }
        }
    }

    @ObfuscatedName("av.fd(Lby;IB)V")
    public static final void method446(class77 arg0, int arg1) {
        if (arg0.field1241 > field933) {
            int var2 = arg0.field1241 - field933;
            int var3 = arg0.field1252 * 128 + arg0.field1222 * 64;
            int var4 = arg0.field1222 * 64 + arg0.field1212 * 128;
            arg0.field1225 += (var3 - arg0.field1225) / var2;
            arg0.field1211 += (var4 - arg0.field1211) / var2;
            arg0.field1268 = 0;
            arg0.field1261 = arg0.field1258;
        } else if (arg0.field1257 >= field933) {
            if (field933 == arg0.field1257 || arg0.field1242 == -1 || arg0.field1269 != 0 || arg0.field1244 + 1 > class261.method4424(arg0.field1242).field3609[arg0.field1243]) {
                int var5 = arg0.field1257 - arg0.field1241;
                int var6 = field933 - arg0.field1241;
                int var7 = arg0.field1252 * 128 + arg0.field1222 * 64;
                int var8 = arg0.field1222 * 64 + arg0.field1212 * 128;
                int var9 = arg0.field1253 * 128 + arg0.field1222 * 64;
                int var10 = arg0.field1255 * 128 + arg0.field1222 * 64;
                arg0.field1225 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field1211 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1268 = 0;
            arg0.field1261 = arg0.field1258;
            arg0.field1210 = arg0.field1261;
        } else {
            arg0.field1239 = arg0.field1267;
            if (arg0.field1264 == 0) {
                arg0.field1268 = 0;
            } else {
                label430: {
                    if (arg0.field1242 != -1 && arg0.field1269 == 0) {
                        class261 var11 = class261.method4424(arg0.field1242);
                        if (arg0.field1214 > 0 && var11.field3615 == 0) {
                            arg0.field1268++;
                            break label430;
                        }
                        if (arg0.field1214 <= 0 && var11.field3608 == 0) {
                            arg0.field1268++;
                            break label430;
                        }
                    }
                    int var12 = arg0.field1225;
                    int var13 = arg0.field1211;
                    int var14 = arg0.field1265[arg0.field1264 - 1] * 128 + arg0.field1222 * 64;
                    int var15 = arg0.field1266[arg0.field1264 - 1] * 128 + arg0.field1222 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field1261 = 1280;
                        } else if (var13 > var15) {
                            arg0.field1261 = 1792;
                        } else {
                            arg0.field1261 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field1261 = 768;
                        } else if (var13 > var15) {
                            arg0.field1261 = 256;
                        } else {
                            arg0.field1261 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field1261 = 1024;
                    } else if (var13 > var15) {
                        arg0.field1261 = 0;
                    }
                    byte var16 = arg0.field1259[arg0.field1264 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field1261 - arg0.field1210 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field1219;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field1218;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field1221;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field1220;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field1218;
                        }
                        arg0.field1239 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class85) {
                            var20 = ((class85) arg0).field1367.field3584;
                        }
                        if (var20) {
                            if (arg0.field1261 != arg0.field1210 && arg0.field1236 == -1 && arg0.field1263 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field1264 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field1264 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field1268 > 0 && arg0.field1264 > 1) {
                                var19 = 8;
                                arg0.field1268--;
                            }
                        } else {
                            if (arg0.field1264 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field1264 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field1268 > 0 && arg0.field1264 > 1) {
                                var19 = 8;
                                arg0.field1268--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field1239 == arg0.field1218 && arg0.field1217 != -1) {
                            arg0.field1239 = arg0.field1217;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field1225 += var19;
                                if (arg0.field1225 > var14) {
                                    arg0.field1225 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field1225 -= var19;
                                if (arg0.field1225 < var14) {
                                    arg0.field1225 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field1211 += var19;
                                if (arg0.field1211 > var15) {
                                    arg0.field1211 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field1211 -= var19;
                                if (arg0.field1211 < var15) {
                                    arg0.field1211 = var15;
                                }
                            }
                        }
                        if (arg0.field1225 == var14 && arg0.field1211 == var15) {
                            arg0.field1264--;
                            if (arg0.field1214 > 0) {
                                arg0.field1214--;
                            }
                        }
                    } else {
                        arg0.field1225 = var14;
                        arg0.field1211 = var15;
                        arg0.field1264--;
                        if (arg0.field1214 > 0) {
                            arg0.field1214--;
                        }
                    }
                }
            }
        }
        if (arg0.field1225 < 128 || arg0.field1211 < 128 || arg0.field1225 >= 13184 || arg0.field1211 >= 13184) {
            arg0.field1242 = -1;
            arg0.field1215 = -1;
            arg0.field1241 = 0;
            arg0.field1257 = 0;
            arg0.field1225 = arg0.field1265[0] * 128 + arg0.field1222 * 64;
            arg0.field1211 = arg0.field1266[0] * 128 + arg0.field1222 * 64;
            arg0.method1413();
        }
        if (Statics.field832 == arg0 && (arg0.field1225 < 1536 || arg0.field1211 < 1536 || arg0.field1225 >= 11776 || arg0.field1211 >= 11776)) {
            arg0.field1242 = -1;
            arg0.field1215 = -1;
            arg0.field1241 = 0;
            arg0.field1257 = 0;
            arg0.field1225 = arg0.field1265[0] * 128 + arg0.field1222 * 64;
            arg0.field1211 = arg0.field1266[0] * 128 + arg0.field1222 * 64;
            arg0.method1413();
        }
        if (arg0.field1263 != 0) {
            if (arg0.field1236 != -1) {
                class77 var21 = null;
                if (arg0.field1236 < 32768) {
                    var21 = field1131[arg0.field1236];
                } else if (arg0.field1236 >= 32768) {
                    var21 = field1035[arg0.field1236 - 32768];
                }
                if (var21 != null) {
                    int var22 = arg0.field1225 - var21.field1225;
                    int var23 = arg0.field1211 - var21.field1211;
                    if (var22 != 0 || var23 != 0) {
                        arg0.field1261 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1237) {
                    arg0.field1236 = -1;
                    arg0.field1237 = false;
                }
            }
            if (arg0.field1250 != -1 && (arg0.field1264 == 0 || arg0.field1268 > 0)) {
                arg0.field1261 = arg0.field1250;
                arg0.field1250 = -1;
            }
            int var24 = arg0.field1261 - arg0.field1210 & 0x7FF;
            if (var24 == 0 && arg0.field1237) {
                arg0.field1236 = -1;
                arg0.field1237 = false;
            }
            if (var24 == 0) {
                arg0.field1262 = 0;
            } else {
                arg0.field1262++;
                if (var24 > 1024) {
                    arg0.field1210 -= arg0.field1263;
                    boolean var25 = true;
                    if (var24 < arg0.field1263 || var24 > 2048 - arg0.field1263) {
                        arg0.field1210 = arg0.field1261;
                        var25 = false;
                    }
                    if (arg0.field1267 == arg0.field1239 && (arg0.field1262 > 25 || var25)) {
                        if (arg0.field1254 == -1) {
                            arg0.field1239 = arg0.field1218;
                        } else {
                            arg0.field1239 = arg0.field1254;
                        }
                    }
                } else {
                    arg0.field1210 += arg0.field1263;
                    boolean var26 = true;
                    if (var24 < arg0.field1263 || var24 > 2048 - arg0.field1263) {
                        arg0.field1210 = arg0.field1261;
                        var26 = false;
                    }
                    if (arg0.field1267 == arg0.field1239 && (arg0.field1262 > 25 || var26)) {
                        if (arg0.field1228 == -1) {
                            arg0.field1239 = arg0.field1218;
                        } else {
                            arg0.field1239 = arg0.field1228;
                        }
                    }
                }
                arg0.field1210 &= 0x7FF;
            }
        }
        arg0.field1213 = false;
        if (arg0.field1239 != -1) {
            class261 var28 = class261.method4424(arg0.field1239);
            if (var28 == null || var28.field3607 == null) {
                arg0.field1239 = -1;
            } else {
                arg0.field1235++;
                if (arg0.field1240 < var28.field3607.length && arg0.field1235 > var28.field3609[arg0.field1240]) {
                    arg0.field1235 = 1;
                    arg0.field1240++;
                    method488(var28, arg0.field1240, arg0.field1225, arg0.field1211);
                }
                if (arg0.field1240 >= var28.field3607.length) {
                    arg0.field1235 = 0;
                    arg0.field1240 = 0;
                    method488(var28, arg0.field1240, arg0.field1225, arg0.field1211);
                }
            }
        }
        if (arg0.field1215 != -1 && field933 >= arg0.field1247) {
            if (arg0.field1216 < 0) {
                arg0.field1216 = 0;
            }
            int var29 = class246.method4062(arg0.field1215).field3326;
            if (var29 == -1) {
                arg0.field1215 = -1;
            } else {
                class261 var30 = class261.method4424(var29);
                if (var30 == null || var30.field3607 == null) {
                    arg0.field1215 = -1;
                } else {
                    arg0.field1249++;
                    if (arg0.field1216 < var30.field3607.length && arg0.field1249 > var30.field3609[arg0.field1216]) {
                        arg0.field1249 = 1;
                        arg0.field1216++;
                        method488(var30, arg0.field1216, arg0.field1225, arg0.field1211);
                    }
                    if (arg0.field1216 >= var30.field3607.length && (arg0.field1216 < 0 || arg0.field1216 >= var30.field3607.length)) {
                        arg0.field1215 = -1;
                    }
                }
            }
        }
        if (arg0.field1242 != -1 && arg0.field1269 <= 1) {
            class261 var31 = class261.method4424(arg0.field1242);
            if (var31.field3615 == 1 && arg0.field1214 > 0 && arg0.field1241 <= field933 && arg0.field1257 < field933) {
                arg0.field1269 = 1;
                return;
            }
        }
        if (arg0.field1242 != -1 && arg0.field1269 == 0) {
            class261 var32 = class261.method4424(arg0.field1242);
            if (var32 == null || var32.field3607 == null) {
                arg0.field1242 = -1;
            } else {
                arg0.field1244++;
                if (arg0.field1243 < var32.field3607.length && arg0.field1244 > var32.field3609[arg0.field1243]) {
                    arg0.field1244 = 1;
                    arg0.field1243++;
                    method488(var32, arg0.field1243, arg0.field1225, arg0.field1211);
                }
                if (arg0.field1243 >= var32.field3607.length) {
                    arg0.field1243 -= var32.field3611;
                    arg0.field1246++;
                    if (arg0.field1246 >= var32.field3617) {
                        arg0.field1242 = -1;
                    } else if (arg0.field1243 >= 0 && arg0.field1243 < var32.field3607.length) {
                        method488(var32, arg0.field1243, arg0.field1225, arg0.field1211);
                    } else {
                        arg0.field1242 = -1;
                    }
                }
                arg0.field1213 = var32.field3613;
            }
        }
        if (arg0.field1269 > 0) {
            arg0.field1269--;
        }
    }

    @ObfuscatedName("p.fa(Lbk;IIB)V")
    public static void method25(class74 arg0, int arg1, int arg2) {
        if (arg0.field1242 == arg1 && arg1 != -1) {
            int var3 = class261.method4424(arg1).field3620;
            if (var3 == 1) {
                arg0.field1243 = 0;
                arg0.field1244 = 0;
                arg0.field1269 = arg2;
                arg0.field1246 = 0;
            }
            if (var3 == 2) {
                arg0.field1246 = 0;
            }
        } else if (arg1 == -1 || arg0.field1242 == -1 || class261.method4424(arg1).field3618 >= class261.method4424(arg0.field1242).field3618) {
            arg0.field1242 = arg1;
            arg0.field1243 = 0;
            arg0.field1244 = 0;
            arg0.field1269 = arg2;
            arg0.field1246 = 0;
            arg0.field1214 = arg0.field1264;
        }
    }

    @ObfuscatedName("eg.fs(I)I")
    public static int method2513() {
        return field1129 ? 2 : 1;
    }

    @ObfuscatedName("client.j(B)V")
    public final void method758() {
        field1142 = class176.method3200() + 500L;
        this.method1062();
        if (field1075 != -1) {
            this.method1068(true);
        }
    }

    @ObfuscatedName("client.fl(I)V")
    public void method1062() {
        int var1 = Statics.field2255;
        int var2 = Statics.field722;
        if (this.field718 < var1) {
            int var3 = this.field718;
        }
        if (this.field719 < var2) {
            int var4 = this.field719;
        }
        if (Statics.field869 == null) {
            return;
        }
        try {
            client var5 = Statics.field243;
            Object[] var6 = new Object[] { method2513() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.fg(I)V")
    public final void method1356() {
        if (field1075 != -1) {
            int var1 = field1075;
            if (class217.method263(var1)) {
                method203(Statics.field2629[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1118; var2++) {
            if (field1120[var2]) {
                field1121[var2] = true;
            }
            field1057[var2] = field1120[var2];
            field1120[var2] = false;
        }
        field1058 = field933;
        field1064 = -1;
        field1065 = -1;
        Statics.field1499 = null;
        if (field1075 != -1) {
            field1118 = 0;
            method691(field1075, 0, 0, Statics.field2255, Statics.field722, 0, 0, -1);
        }
        class283.method4759();
        if (field1053) {
            int var3 = Statics.field273;
            int var4 = Statics.field428;
            int var5 = Statics.field236;
            int var6 = Statics.field322;
            int var7 = 6116423;
            class283.method4704(var3, var4, var5, var6, var7);
            class283.method4704(var3 + 1, var4 + 1, var5 - 2, 16, 0);
            class283.method4741(var3 + 1, var4 + 18, var5 - 2, var6 - 19, 0);
            Statics.field2239.method4508(class226.field3004, var3 + 3, var4 + 14, var7, -1);
            int var8 = class60.field757;
            int var9 = class60.field742;
            for (int var10 = 0; var10 < field926; var10++) {
                int var11 = (field926 - 1 - var10) * 15 + var4 + 31;
                int var12 = 16777215;
                if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                    var12 = 16776960;
                }
                class264 var13 = Statics.field2239;
                String var14;
                if (var10 < 0) {
                    var14 = "";
                } else if (field1060[var10].length() > 0) {
                    var14 = field1059[var10] + class226.field3011 + field1060[var10];
                } else {
                    var14 = field1059[var10];
                }
                var13.method4508(var14, var3 + 3, var11, var12, 0);
            }
            int var15 = Statics.field273;
            int var16 = Statics.field428;
            int var17 = Statics.field236;
            int var18 = Statics.field322;
            for (int var19 = 0; var19 < field1118; var19++) {
                if (field1125[var19] + field1123[var19] > var15 && field1123[var19] < var15 + var17 && field1126[var19] + field1124[var19] > var16 && field1124[var19] < var16 + var18) {
                    field1121[var19] = true;
                }
            }
        } else if (field1064 != -1) {
            method2698(field1064, field1065);
        }
        if (field1127 == 3) {
            for (int var20 = 0; var20 < field1118; var20++) {
                if (field1057[var20]) {
                    class283.method4703(field1123[var20], field1124[var20], field1125[var20], field1126[var20], 16711935, 128);
                } else if (field1121[var20]) {
                    class283.method4703(field1123[var20], field1124[var20], field1125[var20], field1126[var20], 16711680, 128);
                }
            }
        }
        int var21 = Statics.field609;
        int var22 = Statics.field832.field1225;
        int var23 = Statics.field832.field1211;
        int var24 = field1005;
        for (class81 var25 = (class81) class81.field1324.method3427(); var25 != null; var25 = (class81) class81.field1324.method3435()) {
            if (var25.field1319 != -1 || var25.field1320 != null) {
                int var26 = 0;
                if (var22 > var25.field1316) {
                    var26 += var22 - var25.field1316;
                } else if (var22 < var25.field1314) {
                    var26 += var25.field1314 - var22;
                }
                if (var23 > var25.field1317) {
                    var26 += var23 - var25.field1317;
                } else if (var23 < var25.field1315) {
                    var26 += var25.field1315 - var23;
                }
                if (var26 - 64 > var25.field1312 || field923 == 0 || var25.field1313 != var21) {
                    if (var25.field1318 != null) {
                        Statics.field279.method1780(var25.field1318);
                        var25.field1318 = null;
                    }
                    if (var25.field1325 != null) {
                        Statics.field279.method1780(var25.field1325);
                        var25.field1325 = null;
                    }
                } else {
                    var26 -= 64;
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    int var27 = field923 * (var25.field1312 - var26) / var25.field1312;
                    class104 var10000;
                    if (var25.field1318 != null) {
                        var25.field1318.method2013(var27);
                    } else if (var25.field1319 >= 0) {
                        var10000 = (class104) null;
                        class104 var28 = class104.method1846(Statics.field311, var25.field1319, 0);
                        if (var28 != null) {
                            class106 var29 = var28.method1834().method1882(Statics.field3391);
                            class116 var30 = class116.method2134(var29, 100, var27);
                            var30.method2012(-1);
                            Statics.field279.method1779(var30);
                            var25.field1318 = var30;
                        }
                    }
                    if (var25.field1325 != null) {
                        var25.field1325.method2013(var27);
                        if (!var25.field1325.method3426()) {
                            var25.field1325 = null;
                        }
                    } else if (var25.field1320 != null && (var25.field1323 -= var24) <= 0) {
                        int var31 = (int) (Math.random() * (double) var25.field1320.length);
                        var10000 = (class104) null;
                        class104 var32 = class104.method1846(Statics.field311, var25.field1320[var31], 0);
                        if (var32 != null) {
                            class106 var33 = var32.method1834().method1882(Statics.field3391);
                            class116 var34 = class116.method2134(var33, 100, var27);
                            var34.method2012(0);
                            Statics.field279.method1779(var34);
                            var25.field1325 = var34;
                            var25.field1323 = var25.field1321 + (int) (Math.random() * (double) (var25.field1322 - var25.field1321));
                        }
                    }
                }
            }
        }
        field1005 = 0;
    }

    @ObfuscatedName("l.ft(Ljava/lang/String;ZI)V")
    public static final void method175(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field260.method4505(arg0, 250);
        int var6 = Statics.field260.method4506(arg0, 250) * 13;
        class283.method4704(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class283.method4741(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field260.method4574(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method447(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field734.method738(0, 0);
        } else {
            method3265(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("o.ff(IIIIZI)V")
    public static final void method7(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1168 - field1167) * var5 / 100 + field1167;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field999) {
            short var8 = field999;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1141) {
                var6 = field1141;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class283.method4759();
                    class283.method4704(arg0, arg1, var10, arg3, -16777216);
                    class283.method4704(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1174) {
            short var11 = field1174;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1004) {
                var6 = field1004;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class283.method4759();
                    class283.method4704(arg0, arg1, arg2, var13, -16777216);
                    class283.method4704(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1148 - field994) * var5 / 100 + field994;
        field1179 = arg3 * var6 * var14 / 85504 << 1;
        if (field1177 != arg2 || field1173 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class135.field2024[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class138.method2552(var15, 500, 800, arg2, arg3);
        }
        field924 = arg0;
        field1176 = arg1;
        field1177 = arg2;
        field1173 = arg3;
    }

    @ObfuscatedName("bg.gr(I)V")
    public static void method1013() {
        if (Statics.field832.field1225 >> 7 == field1147 && Statics.field832.field1211 >> 7 == field1102) {
            field1147 = 0;
        }
    }

    @ObfuscatedName("ah.ga(B)V")
    public static void method552() {
        method234(Statics.field832, false);
    }

    @ObfuscatedName("bq.gj(I)V")
    public static void method1001() {
        if (field1044 >= 0 && field1035[field1044] != null) {
            method234(field1035[field1044], false);
        }
    }

    @ObfuscatedName("ay.gb(Lbk;ZB)V")
    public static void method234(class74 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1034() || arg0.field908) {
            return;
        }
        int var2 = arg0.field914 << 14;
        arg0.field906 = false;
        if ((field928 && class95.field1500 > 50 || class95.field1500 > 200) && arg1 && arg0.field1267 == arg0.field1239) {
            arg0.field906 = true;
        }
        int var3 = arg0.field1225 >> 7;
        int var4 = arg0.field1211 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field901 != null && field933 >= arg0.field896 && field933 < arg0.field904) {
            arg0.field906 = false;
            arg0.field895 = method537(arg0.field1225, arg0.field1211, Statics.field609);
            Statics.field28.method2529(Statics.field609, arg0.field1225, arg0.field1211, arg0.field895, 60, arg0, arg0.field1210, var2, arg0.field902, arg0.field903, arg0.field893, arg0.field905);
            return;
        }
        if ((arg0.field1225 & 0x7F) == 64 && (arg0.field1211 & 0x7F) == 64) {
            if (field1019 == field1018[var3][var4]) {
                return;
            }
            field1018[var3][var4] = field1019;
        }
        arg0.field895 = method537(arg0.field1225, arg0.field1211, Statics.field609);
        Statics.field28.method2518(Statics.field609, arg0.field1225, arg0.field1211, arg0.field895, 60, arg0, arg0.field1210, var2, arg0.field1213);
    }

    @ObfuscatedName("jz.gh(I)V")
    public static final void method4481() {
        for (class92 var0 = (class92) field1047.method3427(); var0 != null; var0 = (class92) field1047.method3435()) {
            if (Statics.field609 != var0.field1454 || field933 > var0.field1477) {
                var0.method3425();
            } else if (field933 >= var0.field1459) {
                if (var0.field1463 > 0) {
                    class85 var1 = field1131[var0.field1463 - 1];
                    if (var1 != null && var1.field1225 >= 0 && var1.field1225 < 13312 && var1.field1211 >= 0 && var1.field1211 < 13312) {
                        var0.method1648(var1.field1225, var1.field1211, method537(var1.field1225, var1.field1211, var0.field1454) - var0.field1458, field933);
                    }
                }
                if (var0.field1463 < 0) {
                    int var2 = -var0.field1463 - 1;
                    class74 var3;
                    if (field1036 == var2) {
                        var3 = Statics.field832;
                    } else {
                        var3 = field1035[var2];
                    }
                    if (var3 != null && var3.field1225 >= 0 && var3.field1225 < 13312 && var3.field1211 >= 0 && var3.field1211 < 13312) {
                        var0.method1648(var3.field1225, var3.field1211, method537(var3.field1225, var3.field1211, var0.field1454) - var0.field1458, field933);
                    }
                }
                var0.method1649(field1005);
                Statics.field28.method2518(Statics.field609, (int) var0.field1465, (int) var0.field1466, (int) var0.field1467, 60, var0, var0.field1457, -1, false);
            }
        }
    }

    @ObfuscatedName("i.gc(I)V")
    public static final void method85() {
        for (class83 var0 = (class83) field1103.method3427(); var0 != null; var0 = (class83) field1103.method3435()) {
            if (Statics.field609 != var0.field1349 || var0.field1351) {
                var0.method3425();
            } else if (field933 >= var0.field1344) {
                var0.method1558(field1005);
                if (var0.field1351) {
                    var0.method3425();
                } else {
                    Statics.field28.method2518(var0.field1349, var0.field1345, var0.field1346, var0.field1348, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("bs.go(B)I")
    public static final int method725() {
        if (Statics.field869.field1304) {
            return Statics.field609;
        }
        int var0 = 3;
        if (Statics.field326 < 310) {
            int var1 = Statics.field2408 >> 7;
            int var2 = Statics.field1299 >> 7;
            int var3 = Statics.field832.field1225 >> 7;
            int var4 = Statics.field832.field1211 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field609;
            }
            if ((class62.field770[Statics.field609][var1][var2] & 0x4) != 0) {
                var0 = Statics.field609;
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
                    if ((class62.field770[Statics.field609][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field609;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class62.field770[Statics.field609][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field609;
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
                    if ((class62.field770[Statics.field609][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field609;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class62.field770[Statics.field609][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field609;
                        }
                    }
                }
            }
        }
        if (Statics.field832.field1225 >= 0 && Statics.field832.field1211 >= 0 && Statics.field832.field1225 < 13312 && Statics.field832.field1211 < 13312) {
            if ((class62.field770[Statics.field609][Statics.field832.field1225 >> 7][Statics.field832.field1211 >> 7] & 0x4) != 0) {
                var0 = Statics.field609;
            }
            return var0;
        } else {
            return Statics.field609;
        }
    }

    @ObfuscatedName("aw.gs(III)V")
    public static final void method243(int arg0, int arg1) {
        if (field941 == 2) {
            method2719((field1028 - Statics.field352 << 7) + field947, (field1063 - Statics.field3706 << 7) + field1140, field946 * 2);
            if (field1020 > -1 && field933 % 20 < 10) {
                Statics.field302[0].method4822(field1020 + arg0 - 12, field927 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("s.gq(Lby;IIIIII)V")
    public static final void method1(class77 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1034()) {
            return;
        }
        if (arg0 instanceof class85) {
            class259 var6 = ((class85) arg0).field1367;
            if (var6.field3580 != null) {
                var6 = var6.method4396();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class95.field1500;
        int[] var8 = class95.field1491;
        int var9 = 3;
        if (!arg0.field1270.method3398()) {
            method2690(arg0, arg0.field1229 + 15);
            for (class84 var10 = (class84) arg0.field1270.method3395(); var10 != null; var10 = (class84) arg0.field1270.method3417()) {
                class78 var11 = var10.method1567(field933);
                if (var11 != null) {
                    class249 var12 = var10.field1358;
                    class287 var13 = var12.method4138();
                    class287 var14 = var12.method4154();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3372;
                    } else {
                        if (var12.field3365 * 2 < var14.field3795) {
                            var15 = var12.field3365;
                        }
                        var16 = var14.field3795 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field933 - var11.field1276;
                    int var20 = var11.field1275 * var16 / var12.field3372;
                    int var23;
                    if (var11.field1273 > var19) {
                        int var21 = var12.field3371 == 0 ? 0 : var19 / var12.field3371 * var12.field3371;
                        int var22 = var11.field1274 * var16 / var12.field3372;
                        var23 = (var20 - var22) * var21 / var11.field1273 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1273 + var12.field3369 - var19;
                        if (var12.field3367 >= 0) {
                            var17 = (var24 << 8) / (var12.field3369 - var12.field3367);
                        }
                    }
                    if (var11.field1275 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field1020 + arg2 - (var16 >> 1);
                    int var26 = field927 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field1020 > -1) {
                            class283.method4704(var25, var26, var23, 5, 65280);
                            class283.method4704(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3796;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4827(var27, var26, var17);
                            class283.method4708(var27, var26, var27 + var28, var26 + var29);
                            var14.method4827(var27, var26, var17);
                        } else {
                            var13.method4822(var27, var26);
                            class283.method4708(var27, var26, var27 + var28, var26 + var29);
                            var14.method4822(var27, var26);
                        }
                        class283.method4723(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1561()) {
                    var10.method3425();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class74 var30 = (class74) arg0;
            if (var30.field908) {
                return;
            }
            if (var30.field889 != -1 || var30.field890 != -1) {
                method2690(arg0, arg0.field1229 + 15);
                if (field1020 > -1) {
                    if (var30.field889 != -1) {
                        Statics.field2323[var30.field889].method4822(field1020 + arg2 - 12, field927 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field890 != -1) {
                        Statics.field452[var30.field890].method4822(field1020 + arg2 - 12, field927 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field941 == 10 && field1054 == var8[arg1]) {
                method2690(arg0, arg0.field1229 + 15);
                if (field1020 > -1) {
                    Statics.field302[1].method4822(field1020 + arg2 - 12, field927 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class85) arg0).field1367;
            if (var31.field3580 != null) {
                var31 = var31.method4396();
            }
            if (var31.field3578 >= 0 && var31.field3578 < Statics.field452.length) {
                method2690(arg0, arg0.field1229 + 15);
                if (field1020 > -1) {
                    Statics.field452[var31.field3578].method4822(field1020 + arg2 - 12, field927 + arg3 - 30);
                }
            }
            if (field941 == 1 && field942 == field965[arg1 - var7] && field933 % 20 < 10) {
                method2690(arg0, arg0.field1229 + 15);
                if (field1020 > -1) {
                    Statics.field302[0].method4822(field1020 + arg2 - 12, field927 + arg3 - 28);
                }
            }
        }
        if (arg0.field1223 != null && (arg1 >= var7 || !arg0.field1233 && (field1089 == 4 || !arg0.field1224 && (field1089 == 0 || field1089 == 3 || field1089 == 1 && method1647(((class74) arg0).field913, false))))) {
            method2690(arg0, arg0.field1229);
            if (field1020 > -1 && field1008 < field1009) {
                field1013[field1008] = Statics.field2239.method4514(arg0.field1223) / 2;
                field1012[field1008] = Statics.field2239.field3646;
                field1010[field1008] = field1020;
                field1011[field1008] = field927;
                field1014[field1008] = arg0.field1227;
                field1015[field1008] = arg0.field1248;
                field1122[field1008] = arg0.field1226;
                field1017[field1008] = arg0.field1223;
                field1008++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1232[var32];
            int var34 = arg0.field1230[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field933) {
                    continue;
                }
                var35 = class255.method3627(arg0.field1230[var32]);
                var36 = var35.field3420;
                if (var35 != null && var35.field3419 != null) {
                    var35 = var35.method4268();
                    if (var35 == null) {
                        arg0.field1232[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1260[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method3627(var37);
                if (var38 != null && var38.field3419 != null) {
                    var38 = var38.method4268();
                }
            }
            if (var33 - var36 <= field933) {
                if (var35 == null) {
                    arg0.field1232[var32] = -1;
                } else {
                    method2690(arg0, arg0.field1229 / 2);
                    if (field1020 > -1) {
                        if (var32 == 1) {
                            field927 -= 20;
                        }
                        if (var32 == 2) {
                            field1020 -= 15;
                            field927 -= 10;
                        }
                        if (var32 == 3) {
                            field1020 += 15;
                            field927 -= 10;
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
                        class287 var64 = var35.method4233();
                        if (var64 != null) {
                            var43 = var64.field3795;
                            int var65 = var64.field3796;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3797;
                        }
                        class287 var66 = var35.method4250();
                        if (var66 != null) {
                            var44 = var66.field3795;
                            int var67 = var66.field3796;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3797;
                        }
                        class287 var68 = var35.method4235();
                        if (var68 != null) {
                            var45 = var68.field3795;
                            int var69 = var68.field3796;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3797;
                        }
                        class287 var70 = var35.method4236();
                        if (var70 != null) {
                            var46 = var70.field3795;
                            int var71 = var70.field3796;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3797;
                        }
                        if (var38 != null) {
                            var51 = var38.method4233();
                            if (var51 != null) {
                                var55 = var51.field3795;
                                int var72 = var51.field3796;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3797;
                            }
                            var52 = var38.method4250();
                            if (var52 != null) {
                                var56 = var52.field3795;
                                int var73 = var52.field3796;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3797;
                            }
                            var53 = var38.method4235();
                            if (var53 != null) {
                                var57 = var53.field3795;
                                int var74 = var53.field3796;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3797;
                            }
                            var54 = var38.method4236();
                            if (var54 != null) {
                                var58 = var54.field3795;
                                int var75 = var54.field3796;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3797;
                            }
                        }
                        class264 var76 = var35.method4254();
                        if (var76 == null) {
                            var76 = Statics.field1478;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field1478;
                        } else {
                            var77 = var38.method4254();
                            if (var77 == null) {
                                var77 = Statics.field1478;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4232(arg0.field1231[var32]);
                        int var83 = var76.method4514(var82);
                        if (var38 != null) {
                            var79 = var38.method4232(arg0.field1234[var32]);
                            var81 = var77.method4514(var79);
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
                        int var100 = arg0.field1232[var32] - field933;
                        int var101 = var35.field3425 - var35.field3425 * var100 / var35.field3420;
                        int var102 = var35.field3426 * var100 / var35.field3420 + -var35.field3426;
                        int var103 = field1020 + arg2 - (var92 >> 1) + var101;
                        int var104 = field927 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3430 + var104 + 15;
                        int var108 = var107 - var76.field3655;
                        int var109 = var76.field3645 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3430 + var104 + 15;
                            int var111 = var110 - var77.field3655;
                            int var112 = var77.field3645 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3411 >= 0) {
                            var115 = (var100 << 8) / (var35.field3420 - var35.field3411);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4827(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4827(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4827(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4827(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4509(var82, var90 + var103, var107, var35.field3427, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4827(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4827(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4827(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4827(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4509(var79, var98 + var103, var110, var38.field3427, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4822(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4822(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4822(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4822(var93 + var103 - var50, var104);
                            }
                            var76.method4508(var82, var90 + var103, var107, var35.field3427 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4822(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4822(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4822(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4822(var97 + var103 - var62, var104);
                                }
                                var77.method4508(var79, var98 + var103, var110, var38.field3427 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.gd(B)V")
    public static final void method632() {
        field1034 = 0;
        int var0 = (Statics.field832.field1225 >> 7) + Statics.field352;
        int var1 = (Statics.field832.field1211 >> 7) + Statics.field3706;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1034 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1034 = 1;
        }
        if (field1034 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1034 = 0;
        }
    }

    @ObfuscatedName("ef.gz(Lby;IS)V")
    public static final void method2690(class77 arg0, int arg1) {
        method2719(arg0.field1225, arg0.field1211, arg1);
    }

    @ObfuscatedName("ex.gp(IIII)V")
    public static final void method2719(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1020 = -1;
            field927 = -1;
            return;
        }
        int var3 = method537(arg0, arg1, Statics.field609) - arg2;
        int var4 = arg0 - Statics.field2408;
        int var5 = var3 - Statics.field3168;
        int var6 = arg1 - Statics.field1299;
        int var7 = class135.field2024[Statics.field326];
        int var8 = class135.field2025[Statics.field326];
        int var9 = class135.field2024[Statics.field1279];
        int var10 = class135.field2025[Statics.field1279];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1020 = field1179 * var11 / var15 + field1177 / 2;
            field927 = field1179 * var14 / var15 + field1173 / 2;
        } else {
            field1020 = -1;
            field927 = -1;
        }
    }

    @ObfuscatedName("ac.gg(IIIB)I")
    public static final int method537(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field770[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field774[var5][var3][var4] + class62.field774[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field774[var5][var3][var4 + 1] + class62.field774[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ig.gw(IIIIIII)V")
    public static final void method4008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class135.field2024[var6];
            int var12 = class135.field2025[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class135.field2024[var7];
            int var15 = class135.field2025[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2408 = arg0 - var8;
        Statics.field3168 = arg1 - var9;
        Statics.field1299 = arg2 - var10;
        Statics.field326 = arg3;
        Statics.field1279 = arg4;
    }

    @ObfuscatedName("bq.gi(ZB)V")
    public static final void method1002(boolean arg0) {
        field988 = arg0;
        if (!field988) {
            int var1 = field970.method3009();
            int var2 = field970.method3009();
            int var3 = field970.method3178();
            Statics.field514 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field514[var4][var5] = field970.method3131();
                }
            }
            Statics.field307 = new int[var3];
            Statics.field401 = new int[var3];
            Statics.field20 = new int[var3];
            Statics.field520 = new byte[var3][];
            Statics.field857 = new byte[var3][];
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
                        Statics.field307[var7] = var10;
                        Statics.field401[var7] = Statics.field327.method3955("m" + var8 + "_" + var9);
                        Statics.field20[var7] = Statics.field327.method3955("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2339(var1, var2, true);
            return;
        }
        int var11 = field970.method3010();
        boolean var12 = field970.method3001() == 1;
        int var13 = field970.method3009();
        int var14 = field970.method3178();
        field970.method3238();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field970.method3239(1);
                    if (var18 == 1) {
                        field989[var15][var16][var17] = field970.method3239(26);
                    } else {
                        field989[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field970.method3255();
        Statics.field514 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field514[var19][var20] = field970.method3131();
            }
        }
        Statics.field307 = new int[var14];
        Statics.field401 = new int[var14];
        Statics.field20 = new int[var14];
        Statics.field520 = new byte[var14][];
        Statics.field857 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field989[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field307[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field307[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field401[var21] = Statics.field327.method3955("m" + var30 + "_" + var31);
                            Statics.field20[var21] = Statics.field327.method3955("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method2339(var13, var11, !var12);
    }

    @ObfuscatedName("dg.gm(IIZI)V")
    public static final void method2339(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field679 == arg0 && Statics.field1501 == arg1) {
            return;
        }
        Statics.field679 = arg0;
        Statics.field1501 = arg1;
        method1026(25);
        method175(class226.field2861, true);
        int var3 = Statics.field352;
        int var4 = Statics.field3706;
        Statics.field352 = (arg0 - 6) * 8;
        Statics.field3706 = (arg1 - 6) * 8;
        int var5 = Statics.field352 - var3;
        int var6 = Statics.field3706 - var4;
        int var7 = Statics.field352;
        int var8 = Statics.field3706;
        for (int var9 = 0; var9 < 32768; var9++) {
            class85 var10 = field1131[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1265[var11] -= var5;
                    var10.field1266[var11] -= var6;
                }
                var10.field1225 -= var5 * 128;
                var10.field1211 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class74 var13 = field1035[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1265[var14] -= var5;
                    var13.field1266[var14] -= var6;
                }
                var13.field1225 -= var5 * 128;
                var13.field1211 -= var6 * 128;
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
                        field1045[var25][var21][var22] = field1045[var25][var23][var24];
                    } else {
                        field1045[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class76 var26 = (class76) field1046.method3427(); var26 != null; var26 = (class76) field1046.method3435()) {
            var26.field1196 -= var5;
            var26.field1197 -= var6;
            if (var26.field1196 < 0 || var26.field1197 < 0 || var26.field1196 >= 104 || var26.field1197 >= 104) {
                var26.method3425();
            }
        }
        if (field1147 != 0) {
            field1147 -= var5;
            field1102 -= var6;
        }
        field1155 = 0;
        field1161 = false;
        field1117 = -1;
        field1103.method3428();
        field1047.method3428();
        for (int var27 = 0; var27 < 4; var27++) {
            field987[var27].method2826();
        }
    }

    @ObfuscatedName("bs.gx(ZB)V")
    public static final void method722(boolean arg0) {
        method669();
        field1130++;
        if (field1130 < 50 && !arg0) {
            return;
        }
        field1130 = 0;
        if (field1050 || Statics.field310 == null) {
            return;
        }
        field968.method3236(154);
        try {
            Statics.field310.method2809(field968.field2389, 0, field968.field2390);
            field968.field2390 = 0;
        } catch (IOException var2) {
            field1050 = true;
        }
    }

    @ObfuscatedName("ae.gv(B)V")
    public static final void method465() {
        method722(false);
        field982 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field520.length; var1++) {
            if (Statics.field401[var1] != -1 && Statics.field520[var1] == null) {
                Statics.field520[var1] = Statics.field327.method3876(Statics.field401[var1], 0);
                if (Statics.field520[var1] == null) {
                    var0 = false;
                    field982++;
                }
            }
            if (Statics.field20[var1] != -1 && Statics.field857[var1] == null) {
                Statics.field857[var1] = Statics.field327.method3877(Statics.field20[var1], 0, Statics.field514[var1]);
                if (Statics.field857[var1] == null) {
                    var0 = false;
                    field982++;
                }
            }
        }
        if (!var0) {
            field986 = 1;
            return;
        }
        field984 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field520.length; var3++) {
            byte[] var4 = Statics.field857[var3];
            if (var4 != null) {
                int var5 = (Statics.field307[var3] >> 8) * 64 - Statics.field352;
                int var6 = (Statics.field307[var3] & 0xFF) * 64 - Statics.field3706;
                if (field988) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class62.method162(var4, var5, var6);
            }
        }
        if (!var2) {
            field986 = 2;
            return;
        }
        if (field986 != 0) {
            method175(class226.field2861 + class87.field1384 + class87.field1381 + 100 + "%" + class87.field1379, true);
        }
        method669();
        method470();
        method669();
        Statics.field28.method2517();
        method669();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field987[var7].method2826();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class62.field770[var8][var9][var10] = 0;
                }
            }
        }
        method669();
        class62.field771 = 99;
        Statics.field18 = new byte[4][104][104];
        Statics.field772 = new byte[4][104][104];
        Statics.field2319 = new byte[4][104][104];
        Statics.field773 = new byte[4][104][104];
        Statics.field3674 = new int[4][105][105];
        Statics.field249 = new byte[4][105][105];
        Statics.field316 = new int[105][105];
        Statics.field1360 = new int[104];
        Statics.field620 = new int[104];
        Statics.field334 = new int[104];
        Statics.field778 = new int[104];
        Statics.field26 = new int[104];
        int var11 = Statics.field520.length;
        class81.method205();
        method722(true);
        if (!field988) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field307[var12] >> 8) * 64 - Statics.field352;
                int var14 = (Statics.field307[var12] & 0xFF) * 64 - Statics.field3706;
                byte[] var15 = Statics.field520[var12];
                if (var15 != null) {
                    method669();
                    Statics.method4(var15, var13, var14, Statics.field679 * 8 - 48, Statics.field1501 * 8 - 48, field987);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field307[var16] >> 8) * 64 - Statics.field352;
                int var18 = (Statics.field307[var16] & 0xFF) * 64 - Statics.field3706;
                byte[] var19 = Statics.field520[var16];
                if (var19 == null && Statics.field1501 < 800) {
                    method669();
                    class62.method1426(var17, var18, 64, 64);
                }
            }
            method722(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field857[var20];
                if (var21 != null) {
                    int var22 = (Statics.field307[var20] >> 8) * 64 - Statics.field352;
                    int var23 = (Statics.field307[var20] & 0xFF) * 64 - Statics.field3706;
                    method669();
                    class138 var24 = Statics.field28;
                    class162[] var25 = field987;
                    class174 var26 = new class174(var21);
                    int var27 = -1;
                    while (true) {
                        int var28 = var26.method2985();
                        if (var28 == 0) {
                            break;
                        }
                        var27 += var28;
                        int var29 = 0;
                        while (true) {
                            int var30 = var26.method2985();
                            if (var30 == 0) {
                                break;
                            }
                            var29 += var30 - 1;
                            int var31 = var29 & 0x3F;
                            int var32 = var29 >> 6 & 0x3F;
                            int var33 = var29 >> 12;
                            int var34 = var26.method2971();
                            int var35 = var34 >> 2;
                            int var36 = var34 & 0x3;
                            int var37 = var22 + var32;
                            int var38 = var23 + var31;
                            if (var37 > 0 && var38 > 0 && var37 < 103 && var38 < 103) {
                                int var39 = var33;
                                if ((class62.field770[1][var37][var38] & 0x2) == 2) {
                                    var39 = var33 - 1;
                                }
                                class162 var40 = null;
                                if (var39 >= 0) {
                                    var40 = var25[var39];
                                }
                                class62.method143(var33, var37, var38, var27, var36, var35, var24, var40);
                            }
                        }
                    }
                }
            }
        }
        if (field988) {
            for (int var41 = 0; var41 < 4; var41++) {
                method669();
                for (int var42 = 0; var42 < 13; var42++) {
                    for (int var43 = 0; var43 < 13; var43++) {
                        boolean var44 = false;
                        int var45 = field989[var41][var42][var43];
                        if (var45 != -1) {
                            int var46 = var45 >> 24 & 0x3;
                            int var47 = var45 >> 1 & 0x3;
                            int var48 = var45 >> 14 & 0x3FF;
                            int var49 = var45 >> 3 & 0x7FF;
                            int var50 = (var48 / 8 << 8) + var49 / 8;
                            for (int var51 = 0; var51 < Statics.field307.length; var51++) {
                                if (Statics.field307[var51] == var50 && Statics.field520[var51] != null) {
                                    byte[] var52 = Statics.field520[var51];
                                    int var53 = var42 * 8;
                                    int var54 = var43 * 8;
                                    int var55 = (var48 & 0x7) * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    class162[] var57 = field987;
                                    for (int var58 = 0; var58 < 8; var58++) {
                                        for (int var59 = 0; var59 < 8; var59++) {
                                            if (var53 + var58 > 0 && var53 + var58 < 103 && var54 + var59 > 0 && var54 + var59 < 103) {
                                                var57[var41].field2290[var53 + var58][var54 + var59] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class174 var60 = new class174(var52);
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
                                                    int var74 = var53 + var71;
                                                    int var76 = var62 & 0x7;
                                                    int var77 = var63 & 0x7;
                                                    int var79 = var47 & 0x3;
                                                    int var80;
                                                    if (var79 == 0) {
                                                        var80 = var77;
                                                    } else if (var79 == 1) {
                                                        var80 = 7 - var76;
                                                    } else if (var79 == 2) {
                                                        var80 = 7 - var77;
                                                    } else {
                                                        var80 = var76;
                                                    }
                                                    class62.method994(var60, var41, var74, var54 + var80, 0, 0, var47);
                                                } else {
                                                    class62.method994(var60, 0, -1, -1, 0, 0, 0);
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
                            int var81 = var41;
                            int var82 = var42 * 8;
                            int var83 = var43 * 8;
                            for (int var84 = 0; var84 < 8; var84++) {
                                for (int var85 = 0; var85 < 8; var85++) {
                                    class62.field774[var81][var82 + var84][var83 + var85] = 0;
                                }
                            }
                            if (var82 > 0) {
                                for (int var86 = 1; var86 < 8; var86++) {
                                    class62.field774[var81][var82][var83 + var86] = class62.field774[var81][var82 - 1][var83 + var86];
                                }
                            }
                            if (var83 > 0) {
                                for (int var87 = 1; var87 < 8; var87++) {
                                    class62.field774[var81][var82 + var87][var83] = class62.field774[var81][var82 + var87][var83 - 1];
                                }
                            }
                            if (var82 > 0 && class62.field774[var81][var82 - 1][var83] != 0) {
                                class62.field774[var81][var82][var83] = class62.field774[var81][var82 - 1][var83];
                            } else if (var83 > 0 && class62.field774[var81][var82][var83 - 1] != 0) {
                                class62.field774[var81][var82][var83] = class62.field774[var81][var82][var83 - 1];
                            } else if (var82 > 0 && var83 > 0 && class62.field774[var81][var82 - 1][var83 - 1] != 0) {
                                class62.field774[var81][var82][var83] = class62.field774[var81][var82 - 1][var83 - 1];
                            }
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < 13; var88++) {
                for (int var89 = 0; var89 < 13; var89++) {
                    int var90 = field989[0][var88][var89];
                    if (var90 == -1) {
                        class62.method1426(var88 * 8, var89 * 8, 8, 8);
                    }
                }
            }
            method722(true);
            for (int var91 = 0; var91 < 4; var91++) {
                method669();
                for (int var92 = 0; var92 < 13; var92++) {
                    for (int var93 = 0; var93 < 13; var93++) {
                        int var94 = field989[var91][var92][var93];
                        if (var94 != -1) {
                            int var95 = var94 >> 24 & 0x3;
                            int var96 = var94 >> 1 & 0x3;
                            int var97 = var94 >> 14 & 0x3FF;
                            int var98 = var94 >> 3 & 0x7FF;
                            int var99 = (var97 / 8 << 8) + var98 / 8;
                            for (int var100 = 0; var100 < Statics.field307.length; var100++) {
                                if (Statics.field307[var100] == var99 && Statics.field857[var100] != null) {
                                    class62.method176(Statics.field857[var100], var91, var92 * 8, var93 * 8, var95, (var97 & 0x7) * 8, (var98 & 0x7) * 8, var96, Statics.field28, field987);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method722(true);
        method470();
        method669();
        class138 var101 = Statics.field28;
        class162[] var102 = field987;
        for (int var103 = 0; var103 < 4; var103++) {
            for (int var104 = 0; var104 < 104; var104++) {
                for (int var105 = 0; var105 < 104; var105++) {
                    if ((class62.field770[var103][var104][var105] & 0x1) == 1) {
                        int var106 = var103;
                        if ((class62.field770[1][var104][var105] & 0x2) == 2) {
                            var106 = var103 - 1;
                        }
                        if (var106 >= 0) {
                            var102[var106].method2829(var104, var105);
                        }
                    }
                }
            }
        }
        class62.field780 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field780 < -8) {
            class62.field780 = -8;
        }
        if (class62.field780 > 8) {
            class62.field780 = 8;
        }
        class62.field782 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field782 < -16) {
            class62.field782 = -16;
        }
        if (class62.field782 > 16) {
            class62.field782 = 16;
        }
        for (int var107 = 0; var107 < 4; var107++) {
            byte[][] var108 = Statics.field249[var107];
            int var109 = (int) Math.sqrt(5100.0D);
            int var110 = var109 * 768 >> 8;
            for (int var111 = 1; var111 < 103; var111++) {
                for (int var112 = 1; var112 < 103; var112++) {
                    int var113 = class62.field774[var107][var112 + 1][var111] - class62.field774[var107][var112 - 1][var111];
                    int var114 = class62.field774[var107][var112][var111 + 1] - class62.field774[var107][var112][var111 - 1];
                    int var115 = (int) Math.sqrt((double) (var114 * var114 + var113 * var113 + 65536));
                    int var116 = (var113 << 8) / var115;
                    int var117 = 65536 / var115;
                    int var118 = (var114 << 8) / var115;
                    int var119 = (var118 * -50 + var116 * -50 + var117 * -10) / var110 + 96;
                    int var120 = (var108[var112][var111] >> 1) + (var108[var112][var111 + 1] >> 3) + (var108[var112][var111 - 1] >> 2) + (var108[var112 - 1][var111] >> 2) + (var108[var112 + 1][var111] >> 3);
                    Statics.field316[var112][var111] = var119 - var120;
                }
            }
            for (int var121 = 0; var121 < 104; var121++) {
                Statics.field1360[var121] = 0;
                Statics.field620[var121] = 0;
                Statics.field334[var121] = 0;
                Statics.field778[var121] = 0;
                Statics.field26[var121] = 0;
            }
            for (int var122 = -5; var122 < 109; var122++) {
                for (int var123 = 0; var123 < 104; var123++) {
                    int var124 = var122 + 5;
                    int var10002;
                    if (var124 >= 0 && var124 < 104) {
                        int var125 = Statics.field18[var107][var124][var123] & 0xFF;
                        if (var125 > 0) {
                            class247 var126 = class247.method3859(var125 - 1);
                            Statics.field1360[var123] += var126.field3336;
                            Statics.field620[var123] += var126.field3340;
                            Statics.field334[var123] += var126.field3339;
                            Statics.field778[var123] += var126.field3342;
                            var10002 = Statics.field26[var123]++;
                        }
                    }
                    int var127 = var122 - 5;
                    if (var127 >= 0 && var127 < 104) {
                        int var128 = Statics.field18[var107][var127][var123] & 0xFF;
                        if (var128 > 0) {
                            class247 var129 = class247.method3859(var128 - 1);
                            Statics.field1360[var123] -= var129.field3336;
                            Statics.field620[var123] -= var129.field3340;
                            Statics.field334[var123] -= var129.field3339;
                            Statics.field778[var123] -= var129.field3342;
                            var10002 = Statics.field26[var123]--;
                        }
                    }
                }
                if (var122 >= 1 && var122 < 103) {
                    int var130 = 0;
                    int var131 = 0;
                    int var132 = 0;
                    int var133 = 0;
                    int var134 = 0;
                    for (int var135 = -5; var135 < 109; var135++) {
                        int var136 = var135 + 5;
                        if (var136 >= 0 && var136 < 104) {
                            var130 += Statics.field1360[var136];
                            var131 += Statics.field620[var136];
                            var132 += Statics.field334[var136];
                            var133 += Statics.field778[var136];
                            var134 += Statics.field26[var136];
                        }
                        int var137 = var135 - 5;
                        if (var137 >= 0 && var137 < 104) {
                            var130 -= Statics.field1360[var137];
                            var131 -= Statics.field620[var137];
                            var132 -= Statics.field334[var137];
                            var133 -= Statics.field778[var137];
                            var134 -= Statics.field26[var137];
                        }
                        if (var135 >= 1 && var135 < 103 && (!field928 || (class62.field770[0][var122][var135] & 0x2) != 0 || (class62.field770[var107][var122][var135] & 0x10) == 0)) {
                            if (var107 < class62.field771) {
                                class62.field771 = var107;
                            }
                            int var138 = Statics.field18[var107][var122][var135] & 0xFF;
                            int var139 = Statics.field772[var107][var122][var135] & 0xFF;
                            if (var138 > 0 || var139 > 0) {
                                int var140 = class62.field774[var107][var122][var135];
                                int var141 = class62.field774[var107][var122 + 1][var135];
                                int var142 = class62.field774[var107][var122 + 1][var135 + 1];
                                int var143 = class62.field774[var107][var122][var135 + 1];
                                int var144 = Statics.field316[var122][var135];
                                int var145 = Statics.field316[var122 + 1][var135];
                                int var146 = Statics.field316[var122 + 1][var135 + 1];
                                int var147 = Statics.field316[var122][var135 + 1];
                                int var148 = -1;
                                int var149 = -1;
                                if (var138 > 0) {
                                    int var150 = var130 * 256 / var133;
                                    int var151 = var131 / var134;
                                    int var152 = var132 / var134;
                                    var148 = class62.method2879(var150, var151, var152);
                                    int var153 = class62.field780 + var150 & 0xFF;
                                    int var154 = class62.field782 + var152;
                                    if (var154 < 0) {
                                        var154 = 0;
                                    } else if (var154 > 255) {
                                        var154 = 255;
                                    }
                                    var149 = class62.method2879(var153, var151, var154);
                                }
                                if (var107 > 0) {
                                    boolean var155 = true;
                                    if (var138 == 0 && Statics.field2319[var107][var122][var135] != 0) {
                                        var155 = false;
                                    }
                                    if (var139 > 0 && !class260.method124(var139 - 1).field3593) {
                                        var155 = false;
                                    }
                                    if (var155 && var140 == var141 && var140 == var142 && var140 == var143) {
                                        Statics.field3674[var107][var122][var135] |= 0x924;
                                    }
                                }
                                int var156 = 0;
                                if (var149 != -1) {
                                    var156 = class135.field2020[class62.method2688(var149, 96)];
                                }
                                if (var139 == 0) {
                                    var101.method2598(var107, var122, var135, 0, 0, -1, var140, var141, var142, var143, class62.method2688(var148, var144), class62.method2688(var148, var145), class62.method2688(var148, var146), class62.method2688(var148, var147), 0, 0, 0, 0, var156, 0);
                                } else {
                                    int var157 = Statics.field2319[var107][var122][var135] + 1;
                                    byte var158 = Statics.field773[var107][var122][var135];
                                    class260 var159 = class260.method124(var139 - 1);
                                    int var160 = var159.field3592;
                                    int var161;
                                    int var162;
                                    if (var160 >= 0) {
                                        var161 = Statics.field2021.method2249(var160);
                                        var162 = -1;
                                    } else if (var159.field3594 == 16711935) {
                                        var162 = -2;
                                        var160 = -1;
                                        var161 = -2;
                                    } else {
                                        var162 = class62.method2879(var159.field3595, var159.field3591, var159.field3597);
                                        int var163 = class62.field780 + var159.field3595 & 0xFF;
                                        int var164 = class62.field782 + var159.field3597;
                                        if (var164 < 0) {
                                            var164 = 0;
                                        } else if (var164 > 255) {
                                            var164 = 255;
                                        }
                                        var161 = class62.method2879(var163, var159.field3591, var164);
                                    }
                                    int var165 = 0;
                                    if (var161 != -2) {
                                        var165 = class135.field2020[class62.method3763(var161, 96)];
                                    }
                                    if (var159.field3589 != -1) {
                                        int var166 = class62.field780 + var159.field3598 & 0xFF;
                                        int var167 = class62.field782 + var159.field3601;
                                        if (var167 < 0) {
                                            var167 = 0;
                                        } else if (var167 > 255) {
                                            var167 = 255;
                                        }
                                        int var168 = class62.method2879(var166, var159.field3599, var167);
                                        var165 = class135.field2020[class62.method3763(var168, 96)];
                                    }
                                    var101.method2598(var107, var122, var135, var157, var158, var160, var140, var141, var142, var143, class62.method2688(var148, var144), class62.method2688(var148, var145), class62.method2688(var148, var146), class62.method2688(var148, var147), class62.method3763(var162, var144), class62.method3763(var162, var145), class62.method3763(var162, var146), class62.method3763(var162, var147), var156, var165);
                                }
                            }
                        }
                    }
                }
            }
            for (int var169 = 1; var169 < 103; var169++) {
                for (int var170 = 1; var170 < 103; var170++) {
                    int var175;
                    if ((class62.field770[var107][var170][var169] & 0x8) != 0) {
                        var175 = 0;
                    } else if (var107 <= 0 || (class62.field770[1][var170][var169] & 0x2) == 0) {
                        var175 = var107;
                    } else {
                        var175 = var107 - 1;
                    }
                    var101.method2521(var107, var170, var169, var175);
                }
            }
            Statics.field18[var107] = (byte[][]) null;
            Statics.field772[var107] = (byte[][]) null;
            Statics.field2319[var107] = (byte[][]) null;
            Statics.field773[var107] = (byte[][]) null;
            Statics.field249[var107] = (byte[][]) null;
        }
        var101.method2548(-50, -10, -50);
        for (int var176 = 0; var176 < 104; var176++) {
            for (int var177 = 0; var177 < 104; var177++) {
                if ((class62.field770[1][var176][var177] & 0x2) == 2) {
                    var101.method2543(var176, var177);
                }
            }
        }
        int var178 = 1;
        int var179 = 2;
        int var180 = 4;
        for (int var181 = 0; var181 < 4; var181++) {
            if (var181 > 0) {
                var178 <<= 0x3;
                var179 <<= 0x3;
                var180 <<= 0x3;
            }
            for (int var182 = 0; var182 <= var181; var182++) {
                for (int var183 = 0; var183 <= 104; var183++) {
                    for (int var184 = 0; var184 <= 104; var184++) {
                        if ((Statics.field3674[var182][var184][var183] & var178) != 0) {
                            int var185 = var183;
                            int var186 = var183;
                            int var187 = var182;
                            int var188 = var182;
                            while (var185 > 0 && (Statics.field3674[var182][var184][var185 - 1] & var178) != 0) {
                                var185--;
                            }
                            while (var186 < 104 && (Statics.field3674[var182][var184][var186 + 1] & var178) != 0) {
                                var186++;
                            }
                            label633: while (var187 > 0) {
                                for (int var189 = var185; var189 <= var186; var189++) {
                                    if ((Statics.field3674[var187 - 1][var184][var189] & var178) == 0) {
                                        break label633;
                                    }
                                }
                                var187--;
                            }
                            label622: while (var188 < var181) {
                                for (int var190 = var185; var190 <= var186; var190++) {
                                    if ((Statics.field3674[var188 + 1][var184][var190] & var178) == 0) {
                                        break label622;
                                    }
                                }
                                var188++;
                            }
                            int var191 = (var188 + 1 - var187) * (var186 - var185 + 1);
                            if (var191 >= 8) {
                                short var192 = 240;
                                int var193 = class62.field774[var188][var184][var185] - var192;
                                int var194 = class62.field774[var187][var184][var185];
                                class138.method2520(var181, 1, var184 * 128, var184 * 128, var185 * 128, var186 * 128 + 128, var193, var194);
                                for (int var195 = var187; var195 <= var188; var195++) {
                                    for (int var196 = var185; var196 <= var186; var196++) {
                                        Statics.field3674[var195][var184][var196] &= ~var178;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3674[var182][var184][var183] & var179) != 0) {
                            int var197 = var184;
                            int var198 = var184;
                            int var199 = var182;
                            int var200 = var182;
                            while (var197 > 0 && (Statics.field3674[var182][var197 - 1][var183] & var179) != 0) {
                                var197--;
                            }
                            while (var198 < 104 && (Statics.field3674[var182][var198 + 1][var183] & var179) != 0) {
                                var198++;
                            }
                            label686: while (var199 > 0) {
                                for (int var201 = var197; var201 <= var198; var201++) {
                                    if ((Statics.field3674[var199 - 1][var201][var183] & var179) == 0) {
                                        break label686;
                                    }
                                }
                                var199--;
                            }
                            label675: while (var200 < var181) {
                                for (int var202 = var197; var202 <= var198; var202++) {
                                    if ((Statics.field3674[var200 + 1][var202][var183] & var179) == 0) {
                                        break label675;
                                    }
                                }
                                var200++;
                            }
                            int var203 = (var200 + 1 - var199) * (var198 - var197 + 1);
                            if (var203 >= 8) {
                                short var204 = 240;
                                int var205 = class62.field774[var200][var197][var183] - var204;
                                int var206 = class62.field774[var199][var197][var183];
                                class138.method2520(var181, 2, var197 * 128, var198 * 128 + 128, var183 * 128, var183 * 128, var205, var206);
                                for (int var207 = var199; var207 <= var200; var207++) {
                                    for (int var208 = var197; var208 <= var198; var208++) {
                                        Statics.field3674[var207][var208][var183] &= ~var179;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3674[var182][var184][var183] & var180) != 0) {
                            int var209 = var184;
                            int var210 = var184;
                            int var211 = var183;
                            int var212 = var183;
                            while (var211 > 0 && (Statics.field3674[var182][var184][var211 - 1] & var180) != 0) {
                                var211--;
                            }
                            while (var212 < 104 && (Statics.field3674[var182][var184][var212 + 1] & var180) != 0) {
                                var212++;
                            }
                            label739: while (var209 > 0) {
                                for (int var213 = var211; var213 <= var212; var213++) {
                                    if ((Statics.field3674[var182][var209 - 1][var213] & var180) == 0) {
                                        break label739;
                                    }
                                }
                                var209--;
                            }
                            label728: while (var210 < 104) {
                                for (int var214 = var211; var214 <= var212; var214++) {
                                    if ((Statics.field3674[var182][var210 + 1][var214] & var180) == 0) {
                                        break label728;
                                    }
                                }
                                var210++;
                            }
                            if ((var210 - var209 + 1) * (var212 - var211 + 1) >= 4) {
                                int var215 = class62.field774[var182][var209][var211];
                                class138.method2520(var181, 4, var209 * 128, var210 * 128 + 128, var211 * 128, var212 * 128 + 128, var215, var215);
                                for (int var216 = var209; var216 <= var210; var216++) {
                                    for (int var217 = var211; var217 <= var212; var217++) {
                                        Statics.field3674[var182][var216][var217] &= ~var180;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method722(true);
        int var218 = class62.field771;
        if (var218 > Statics.field609) {
            var218 = Statics.field609;
        }
        if (var218 < Statics.field609 - 1) {
            int var219 = Statics.field609 - 1;
        }
        if (field928) {
            Statics.field28.method2571(class62.field771);
        } else {
            Statics.field28.method2571(0);
        }
        for (int var220 = 0; var220 < 104; var220++) {
            for (int var221 = 0; var221 < 104; var221++) {
                method1598(var220, var221);
            }
        }
        method669();
        method693();
        class256.field3439.method3361();
        if (Statics.field243.method840()) {
            field968.method3236(62);
            field968.method3072(1057001181);
        }
        if (!field988) {
            int var222 = (Statics.field679 - 6) / 8;
            int var223 = (Statics.field679 + 6) / 8;
            int var224 = (Statics.field1501 - 6) / 8;
            int var225 = (Statics.field1501 + 6) / 8;
            for (int var226 = var222 - 1; var226 <= var223 + 1; var226++) {
                for (int var227 = var224 - 1; var227 <= var225 + 1; var227++) {
                    if (var226 < var222 || var226 > var223 || var227 < var224 || var227 > var225) {
                        Statics.field327.method3898("m" + var226 + "_" + var227);
                        Statics.field327.method3898("l" + var226 + "_" + var227);
                    }
                }
            }
        }
        method1026(30);
        method669();
        Statics.field18 = (byte[][][]) null;
        Statics.field772 = (byte[][][]) null;
        Statics.field2319 = (byte[][][]) null;
        Statics.field773 = (byte[][][]) null;
        Statics.field3674 = (int[][][]) null;
        Statics.field249 = (byte[][][]) null;
        Statics.field316 = (int[][]) null;
        Statics.field1360 = null;
        Statics.field620 = null;
        Statics.field334 = null;
        Statics.field778 = null;
        Statics.field26 = null;
        field968.method3236(230);
        class59.method1953();
    }

    @ObfuscatedName("hy.ge(II)V")
    public static final void method3836(int arg0) {
        int[] var1 = Statics.field86.field3804;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field770[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field28.method2551(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field770[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field28.method2551(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field86.method4813();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field770[arg0][var10][var9] & 0x18) == 0) {
                    Statics.method316(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field770[arg0 + 1][var10][var9] & 0x8) != 0) {
                    Statics.method316(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1165 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field28.method2546(Statics.field609, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class256.method2861(var14).field3464;
                    if (var15 >= 0) {
                        field1146[field1165] = Statics.field3286[var15].method4038(false);
                        field1144[field1165] = var11;
                        field1180[field1165] = var12;
                        field1165++;
                    }
                }
            }
        }
        Statics.field734.method4780();
    }

    @ObfuscatedName("client.gl(I)Z")
    public final boolean method1064() {
        if (Statics.field310 == null) {
            return false;
        }
        try {
            int var1 = Statics.field310.method2791();
            if (var1 == 0) {
                return false;
            }
            if (field972 == -1) {
                Statics.field310.method2805(field970.field2389, 0, 1);
                field970.field2390 = 0;
                field972 = field970.method3237();
                field971 = class273.field3704[field972];
                var1--;
            }
            if (field971 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field310.method2805(field970.field2389, 0, 1);
                field971 = field970.field2389[0] & 0xFF;
                var1--;
            }
            if (field971 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field310.method2805(field970.field2389, 0, 2);
                field970.field2390 = 0;
                field971 = field970.method3178();
                var1 -= 2;
            }
            if (var1 < field971) {
                return false;
            }
            field970.field2390 = 0;
            Statics.field310.method2805(field970.field2389, 0, field971);
            field980.method4650();
            field1119 = 0;
            field977 = field976;
            field976 = field975;
            field975 = field972;
            if (field972 == 249) {
                int var2 = field970.method3010();
                if (var2 == 65535) {
                    var2 = -1;
                }
                method2720(var2);
                field972 = -1;
                return true;
            }
            if (field972 == 70) {
                int var3 = field970.method3009();
                if (var3 == 65535) {
                    var3 = -1;
                }
                int var4 = field970.method2987();
                if (field1150 != 0 && var3 != -1) {
                    class204.method1573(Statics.field858, var3, 0, field1150, false);
                    field1152 = true;
                }
                field972 = -1;
                return true;
            }
            if (field972 == 215) {
                int var5 = field970.method3131();
                class68 var6 = (class68) field974.method3387((long) var5);
                if (var6 != null) {
                    method1982(var6, true);
                }
                if (field1079 != null) {
                    method578(field1079);
                    field1079 = null;
                }
                field972 = -1;
                return true;
            }
            if (field972 == 31) {
                method164(true);
                field972 = -1;
                return true;
            }
            if (field972 == 23) {
                for (int var7 = 0; var7 < class212.field2599.length; var7++) {
                    if (class212.field2599[var7] != class212.field2598[var7]) {
                        class212.field2599[var7] = class212.field2598[var7];
                        method561(var7);
                        field1101[++field1000 - 1 & 0x1F] = var7;
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 209) {
                boolean var8 = field970.method2999() == 1;
                int var9 = field970.method3020();
                class217 var10 = class217.method2254(var9);
                if (var10.field2663 != var8) {
                    var10.field2663 = var8;
                    method578(var10);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 253) {
                int var11 = field971 + field970.field2390;
                int var12 = field970.method3178();
                int var13 = field970.method3178();
                if (field1075 != var12) {
                    field1075 = var12;
                    this.method1068(false);
                    method673(field1075);
                    class82.method3691(field1075);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field1120[var14] = true;
                    }
                }
                while (var13-- > 0) {
                    int var15 = field970.method3131();
                    int var16 = field970.method3178();
                    int var17 = field970.method2971();
                    class68 var18 = (class68) field974.method3387((long) var15);
                    if (var18 != null && var18.field837 != var16) {
                        method1982(var18, true);
                        var18 = null;
                    }
                    if (var18 == null) {
                        class68 var19 = new class68();
                        var19.field837 = var16;
                        var19.field836 = var17;
                        field974.method3374(var19, (long) var15);
                        method673(var16);
                        class217 var20 = class217.method2254(var15);
                        method578(var20);
                        if (field1079 != null) {
                            method578(field1079);
                            field1079 = null;
                        }
                        method3852();
                        method2910(Statics.field2629[var15 >> 16], var20, false);
                        class82.method3691(var16);
                        if (field1075 != -1) {
                            method1411(field1075, 1);
                        }
                        var18 = var19;
                    }
                    var18.field840 = true;
                }
                for (class68 var22 = (class68) field974.method3377(); var22 != null; var22 = (class68) field974.method3378()) {
                    if (var22.field840) {
                        var22.field840 = false;
                    } else {
                        method1982(var22, true);
                    }
                }
                field1187 = new class191(512);
                while (field970.field2390 < var11) {
                    int var23 = field970.method3131();
                    int var24 = field970.method3178();
                    int var25 = field970.method3178();
                    int var26 = field970.method3131();
                    for (int var27 = var24; var27 <= var25; var27++) {
                        long var28 = ((long) var23 << 32) + (long) var27;
                        field1187.method3374(new class199(var26), var28);
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 125) {
                int var30 = field970.method3009();
                if (var30 == 65535) {
                    var30 = -1;
                }
                int var31 = field970.method3131();
                int var32 = field970.method3019();
                class217 var33 = class217.method2254(var31);
                if (var33.field2642) {
                    var33.field2763 = var30;
                    var33.field2764 = var32;
                    class257 var35 = class257.method2694(var30);
                    var33.field2694 = var35.field3494;
                    var33.field2695 = var35.field3506;
                    var33.field2696 = var35.field3507;
                    var33.field2738 = var35.field3508;
                    var33.field2693 = var35.field3509;
                    var33.field2731 = var35.field3504;
                    if (var35.field3510 == 1) {
                        var33.field2760 = 1;
                    } else {
                        var33.field2760 = 2;
                    }
                    if (var33.field2759 > 0) {
                        var33.field2731 = var33.field2731 * 32 / var33.field2759;
                    } else if (var33.field2654 > 0) {
                        var33.field2731 = var33.field2731 * 32 / var33.field2654;
                    }
                    method578(var33);
                } else if (var30 == -1) {
                    var33.field2774 = 0;
                    field972 = -1;
                    return true;
                } else {
                    class257 var34 = class257.method2694(var30);
                    var33.field2774 = 4;
                    var33.field2687 = var30;
                    var33.field2694 = var34.field3494;
                    var33.field2695 = var34.field3506;
                    var33.field2731 = var34.field3504 * 100 / var32;
                    method578(var33);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 105) {
                int var36 = field970.method3131();
                int var37 = field970.method3020();
                class68 var38 = (class68) field974.method3387((long) var37);
                class68 var39 = (class68) field974.method3387((long) var36);
                if (var39 != null) {
                    method1982(var39, var38 == null || var38.field837 != var39.field837);
                }
                if (var38 != null) {
                    var38.method3425();
                    field974.method3374(var38, (long) var36);
                }
                class217 var40 = class217.method2254(var37);
                if (var40 != null) {
                    method578(var40);
                }
                class217 var41 = class217.method2254(var36);
                if (var41 != null) {
                    method578(var41);
                    method2910(Statics.field2629[var41.field2643 >>> 16], var41, true);
                }
                if (field1075 != -1) {
                    method1411(field1075, 1);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 233) {
                for (int var42 = 0; var42 < field1035.length; var42++) {
                    if (field1035[var42] != null) {
                        field1035[var42].field1242 = -1;
                    }
                }
                for (int var43 = 0; var43 < field1131.length; var43++) {
                    if (field1131[var43] != null) {
                        field1131[var43].field1242 = -1;
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 40) {
                int var44 = field970.method3010();
                int var45 = field970.method3020();
                class217 var46 = class217.method2254(var45);
                if (var46 != null && var46.field2645 == 0) {
                    if (var44 > var46.field2667 - var46.field2659) {
                        var44 = var46.field2667 - var46.field2659;
                    }
                    if (var44 < 0) {
                        var44 = 0;
                    }
                    if (var46.field2765 != var44) {
                        var46.field2765 = var44;
                        method578(var46);
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 83) {
                class95.field1500 = 0;
                for (int var47 = 0; var47 < 2048; var47++) {
                    class95.field1489[var47] = null;
                    class95.field1488[var47] = 1;
                }
                for (int var48 = 0; var48 < 2048; var48++) {
                    field1035[var48] = null;
                }
                class95.method50(field970);
                field972 = -1;
                return true;
            }
            if (field972 == 101) {
                class282.method3847(field970, field971);
                field972 = -1;
                return true;
            }
            if (field972 == 164) {
                String var49 = field970.method3111();
                String var50 = class265.method4522(class271.method1574(class266.method8(field970)));
                class97.method3203(6, var49, var50);
                field972 = -1;
                return true;
            }
            if (field972 == 71) {
                for (int var51 = 0; var51 < Statics.field3281; var51++) {
                    class242 var52 = class242.method997(var51);
                    if (var52 != null) {
                        class212.field2598[var51] = 0;
                        class212.field2599[var51] = 0;
                    }
                }
                method1570();
                field1000 += 32;
                field972 = -1;
                return true;
            }
            if (field972 == 98) {
                String var53 = field970.method3111();
                long var54 = (long) field970.method3178();
                long var56 = (long) field970.method2975();
                class231[] var58 = new class231[] { class231.field3172, class231.field3171, class231.field3175, class231.field3179, class231.field3174, class231.field3178 };
                class231 var59 = (class231) class169.method233(var58, field970.method2971());
                long var60 = (var54 << 32) + var56;
                boolean var62 = false;
                for (int var63 = 0; var63 < 100; var63++) {
                    if (field1134[var63] == var60) {
                        var62 = true;
                        break;
                    }
                }
                if (method999(var53)) {
                    var62 = true;
                }
                if (!var62 && field1034 == 0) {
                    field1134[field1135] = var60;
                    field1135 = (field1135 + 1) % 100;
                    String var64 = class265.method4522(class271.method1574(class266.method8(field970)));
                    byte var65;
                    if (var59.field3180) {
                        var65 = 7;
                    } else {
                        var65 = 3;
                    }
                    if (var59.field3177 == -1) {
                        class97.method3203(var65, var53, var64);
                    } else {
                        class97.method3203(var65, Statics.method3220(var59.field3177) + var53, var64);
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 140) {
                field941 = field970.method2971();
                if (field941 == 1) {
                    field942 = field970.method3178();
                }
                if (field941 >= 2 && field941 <= 6) {
                    if (field941 == 2) {
                        field947 = 64;
                        field1140 = 64;
                    }
                    if (field941 == 3) {
                        field947 = 0;
                        field1140 = 64;
                    }
                    if (field941 == 4) {
                        field947 = 128;
                        field1140 = 64;
                    }
                    if (field941 == 5) {
                        field947 = 64;
                        field1140 = 0;
                    }
                    if (field941 == 6) {
                        field947 = 64;
                        field1140 = 128;
                    }
                    field941 = 2;
                    field1028 = field970.method3178();
                    field1063 = field970.method3178();
                    field946 = field970.method2971();
                }
                if (field941 == 10) {
                    field1054 = field970.method3178();
                }
                field972 = -1;
                return true;
            }
            if (field972 == 110) {
                method4487(field970.method3111());
                field972 = -1;
                return true;
            }
            if (field972 == 142) {
                while (field970.field2390 < field971) {
                    boolean var66 = field970.method2971() == 1;
                    String var67 = field970.method3111();
                    String var68 = field970.method3111();
                    int var69 = field970.method3178();
                    int var70 = field970.method2971();
                    int var71 = field970.method2971();
                    boolean var72 = (var71 & 0x2) != 0;
                    boolean var73 = (var71 & 0x1) != 0;
                    if (var69 > 0) {
                        field970.method3111();
                        field970.method2971();
                        field970.method3131();
                    }
                    field970.method3111();
                    for (int var74 = 0; var74 < field1115; var74++) {
                        class66 var75 = field1182[var74];
                        if (var66) {
                            if (var68.equals(var75.field823)) {
                                var75.field823 = var67;
                                var75.field817 = var68;
                                var67 = null;
                                break;
                            }
                        } else if (var67.equals(var75.field823)) {
                            if (var75.field818 != var69) {
                                boolean var76 = true;
                                for (class67 var77 = (class67) field1183.method3462(); var77 != null; var77 = (class67) field1183.method3465()) {
                                    if (var77.field829.equals(var67)) {
                                        if (var69 != 0 && var77.field830 == 0) {
                                            var77.method3466();
                                            var76 = false;
                                        } else if (var69 == 0 && var77.field830 != 0) {
                                            var77.method3466();
                                            var76 = false;
                                        }
                                    }
                                }
                                if (var76) {
                                    field1183.method3461(new class67(var67, var69));
                                }
                                var75.field818 = var69;
                            }
                            var75.field817 = var68;
                            var75.field819 = var70;
                            var75.field820 = var72;
                            var75.field821 = var73;
                            var67 = null;
                            break;
                        }
                    }
                    if (var67 != null && field1115 < 400) {
                        class66 var78 = new class66();
                        field1182[field1115] = var78;
                        var78.field823 = var67;
                        var78.field817 = var68;
                        var78.field818 = var69;
                        var78.field819 = var70;
                        var78.field820 = var72;
                        var78.field821 = var73;
                        field1115++;
                    }
                }
                field1181 = 2;
                field1192 = field1138;
                boolean var79 = false;
                int var80 = field1115;
                while (var80 > 0) {
                    boolean var81 = true;
                    var80--;
                    for (int var82 = 0; var82 < var80; var82++) {
                        boolean var83 = false;
                        class66 var84 = field1182[var82];
                        class66 var85 = field1182[var82 + 1];
                        if (field1074 != var84.field818 && field1074 == var85.field818) {
                            var83 = true;
                        }
                        if (!var83 && var84.field818 == 0 && var85.field818 != 0) {
                            var83 = true;
                        }
                        if (!var83 && !var84.field820 && var85.field820) {
                            var83 = true;
                        }
                        if (!var83 && !var84.field821 && var85.field821) {
                            var83 = true;
                        }
                        if (var83) {
                            class66 var86 = field1182[var82];
                            field1182[var82] = field1182[var82 + 1];
                            field1182[var82 + 1] = var86;
                            var81 = false;
                        }
                    }
                    if (var81) {
                        break;
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 45 || field972 == 44 || field972 == 146 || field972 == 87 || field972 == 194 || field972 == 35 || field972 == 210 || field972 == 75 || field972 == 18 || field972 == 173) {
                method1022();
                field972 = -1;
                return true;
            }
            if (field972 == 141) {
                int var87 = field970.method3019();
                int var88 = field970.method3010();
                int var89 = var88 >> 10 & 0x1F;
                int var90 = var88 >> 5 & 0x1F;
                int var91 = var88 & 0x1F;
                int var92 = (var91 << 3) + (var89 << 19) + (var90 << 11);
                class217 var93 = class217.method2254(var87);
                if (var93.field2668 != var92) {
                    var93.field2668 = var92;
                    method578(var93);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 189) {
                field1149 = field970.method2971();
                field972 = -1;
                return true;
            }
            if (field972 == 48) {
                field1089 = field970.method2971();
                field1072 = field970.method2971();
                field972 = -1;
                return true;
            }
            if (field972 == 143) {
                method1002(false);
                field970.method3237();
                int var94 = field970.method3178();
                class95.method1551(field970, var94);
                field972 = -1;
                return true;
            }
            if (field972 == 99) {
                field1161 = true;
                Statics.field2591 = field970.method2971();
                Statics.field2125 = field970.method2971();
                Statics.field1272 = field970.method3178();
                Statics.field621 = field970.method2971();
                Statics.field1449 = field970.method2971();
                if (Statics.field1449 >= 100) {
                    Statics.field2408 = Statics.field2591 * 128 + 64;
                    Statics.field1299 = Statics.field2125 * 128 + 64;
                    Statics.field3168 = method537(Statics.field2408, Statics.field1299, Statics.field609) - Statics.field1272;
                }
                field972 = -1;
                return true;
            }
            if (field972 == 69) {
                int var95 = field970.method3012();
                int var96 = field970.method3018();
                int var97 = field970.method3012();
                class217 var98 = class217.method2254(var96);
                if (var98.field2652 != var95 || var98.field2653 != var97 || var98.field2648 != 0 || var98.field2733 != 0) {
                    var98.field2652 = var95;
                    var98.field2653 = var97;
                    var98.field2648 = 0;
                    var98.field2733 = 0;
                    method578(var98);
                    this.method1069(var98);
                    if (var98.field2645 == 0) {
                        method2910(Statics.field2629[var96 >> 16], var98, false);
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 94) {
                int var99 = field970.method3018();
                int var100 = field970.method3009();
                class212.field2598[var100] = var99;
                if (class212.field2599[var100] != var99) {
                    class212.field2599[var100] = var99;
                }
                method561(var100);
                field1101[++field1000 - 1 & 0x1F] = var100;
                field972 = -1;
                return true;
            }
            if (field972 == 174) {
                Statics.field1297 = field970.method3001();
                Statics.field597 = field970.method2999();
                field972 = -1;
                return true;
            }
            if (field972 == 216) {
                int var101 = field970.method3131();
                int var102 = field970.method3178();
                class217 var103 = class217.method2254(var101);
                if (var103.field2774 != 1 || var103.field2687 != var102) {
                    var103.field2774 = 1;
                    var103.field2687 = var102;
                    method578(var103);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 8) {
                field1181 = 1;
                field1192 = field1138;
                field972 = -1;
                return true;
            }
            if (field972 == 131) {
                if (field1075 != -1) {
                    method1411(field1075, 0);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 132) {
                int var104 = field970.method3131();
                int var105 = field970.method3095();
                class217 var106 = class217.method2254(var104);
                if (var106.field2774 != 2 || var106.field2687 != var105) {
                    var106.field2774 = 2;
                    var106.field2687 = var105;
                    method578(var106);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 60) {
                int var107 = field970.method3131();
                int var108 = field970.method3178();
                if (var107 < -70000) {
                    var108 += 32768;
                }
                class217 var109;
                if (var107 >= 0) {
                    var109 = class217.method2254(var107);
                } else {
                    var109 = null;
                }
                while (field970.field2390 < field971) {
                    int var110 = field970.method2985();
                    int var111 = field970.method3178();
                    int var112 = 0;
                    if (var111 != 0) {
                        var112 = field970.method2971();
                        if (var112 == 255) {
                            var112 = field970.method3131();
                        }
                    }
                    if (var109 != null && var110 >= 0 && var110 < var109.field2761.length) {
                        var109.field2761[var110] = var111;
                        var109.field2637[var110] = var112;
                    }
                    class64.method2342(var108, var110, var111 - 1, var112);
                }
                if (var109 != null) {
                    method578(var109);
                }
                method1570();
                field964[++field1104 - 1 & 0x1F] = var108 & 0x7FFF;
                field972 = -1;
                return true;
            }
            if (field972 == 161) {
                int var113 = field970.method2971();
                int var114 = field970.method2971();
                int var115 = field970.method2971();
                int var116 = field970.method2971();
                field1030[var113] = true;
                field1163[var113] = var114;
                field1164[var113] = var115;
                field936[var113] = var116;
                field1166[var113] = 0;
                field972 = -1;
                return true;
            }
            if (field972 == 28) {
                int var117 = field970.method3001();
                int var118 = field970.method2971();
                String var119 = field970.method3111();
                if (var118 >= 1 && var118 <= 8) {
                    if (var119.equalsIgnoreCase("null")) {
                        var119 = null;
                    }
                    field1158[var118 - 1] = var119;
                    field1042[var118 - 1] = var117 == 0;
                }
                field972 = -1;
                return true;
            }
            if (field972 == 172) {
                boolean var120 = field970.method2971() == 1;
                if (var120) {
                    Statics.field458 = class176.method3200() - field970.method2977();
                    Statics.field2581 = new class14(field970, true);
                } else {
                    Statics.field2581 = null;
                }
                field1093 = field1138;
                field972 = -1;
                return true;
            }
            if (field972 == 126) {
                int var121 = field970.method3011();
                int var122 = field970.method3018();
                class217 var123 = class217.method2254(var122);
                if (var123.field2712 != var121 || var121 == -1) {
                    var123.field2712 = var121;
                    var123.field2681 = 0;
                    var123.field2766 = 0;
                    method578(var123);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 205) {
                String var124 = field970.method3111();
                long var125 = field970.method2977();
                long var127 = (long) field970.method3178();
                long var129 = (long) field970.method2975();
                class231[] var131 = new class231[] { class231.field3172, class231.field3171, class231.field3175, class231.field3179, class231.field3174, class231.field3178 };
                class231 var132 = (class231) class169.method233(var131, field970.method2971());
                long var133 = (var127 << 32) + var129;
                boolean var135 = false;
                for (int var136 = 0; var136 < 100; var136++) {
                    if (field1134[var136] == var133) {
                        var135 = true;
                        break;
                    }
                }
                if (var132.field3173 && method999(var124)) {
                    var135 = true;
                }
                if (!var135 && field1034 == 0) {
                    field1134[field1135] = var133;
                    field1135 = (field1135 + 1) % 100;
                    String var137 = class265.method4522(class271.method1574(class266.method8(field970)));
                    if (var132.field3177 == -1) {
                        class97.method483(9, var124, var137, class269.method4442(var125));
                    } else {
                        class97.method483(9, Statics.method3220(var132.field3177) + var124, var137, class269.method4442(var125));
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 202) {
                int var138 = field970.method2985();
                boolean var139 = field970.method2971() == 1;
                String var140 = "";
                boolean var141 = false;
                if (var139) {
                    var140 = field970.method3111();
                    if (method999(var140)) {
                        var141 = true;
                    }
                }
                String var142 = field970.method3111();
                if (!var141) {
                    class97.method3203(var138, var140, var142);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 73) {
                int var143 = field970.method3020();
                Statics.field610 = Statics.field739.method2747(var143);
                field972 = -1;
                return true;
            }
            if (field972 == 220) {
                method164(false);
                field972 = -1;
                return true;
            }
            if (field972 == 68) {
                int var144 = field970.method3131();
                int var145 = field970.method3131();
                int var146 = 0;
                if (Statics.field2395 == null || !Statics.field2395.isValid()) {
                    try {
                        Iterator var147 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var147.hasNext()) {
                            GarbageCollectorMXBean var148 = (GarbageCollectorMXBean) var147.next();
                            if (var148.isValid()) {
                                Statics.field2395 = var148;
                                field740 = -1L;
                                field710 = -1L;
                            }
                        }
                    } catch (Throwable var277) {
                    }
                }
                if (Statics.field2395 != null) {
                    long var150 = class176.method3200();
                    long var152 = Statics.field2395.getCollectionTime();
                    if (field710 != -1L) {
                        long var154 = var152 - field710;
                        long var156 = var150 - field740;
                        if (var156 != 0L) {
                            var146 = (int) (var154 * 100L / var156);
                        }
                    }
                    field710 = var152;
                    field740 = var150;
                }
                field968.method3236(148);
                field968.method3026(var144);
                field968.method3026(var145);
                field968.method2955(field731);
                field968.method2976(var146);
                field972 = -1;
                return true;
            }
            if (field972 == 136) {
                field1031 = field970.method3178() * 30;
                field1112 = field1138;
                field972 = -1;
                return true;
            }
            if (field972 == 30) {
                method1570();
                int var160 = field970.method3018();
                int var161 = field970.method2971();
                int var162 = field970.method2999();
                field1051[var162] = var160;
                field1049[var162] = var161;
                field944[var162] = 1;
                for (int var163 = 0; var163 < 98; var163++) {
                    if (var160 >= class223.field2827[var163]) {
                        field944[var162] = var163 + 2;
                    }
                }
                field937[++field1106 - 1 & 0x1F] = var162;
                field972 = -1;
                return true;
            }
            if (field972 == 16) {
                int var164 = field970.method3010();
                class64.method199(var164);
                field964[++field1104 - 1 & 0x1F] = var164 & 0x7FFF;
                field972 = -1;
                return true;
            }
            if (field972 == 213) {
                String var165 = field970.method3111();
                Object[] var166 = new Object[var165.length() + 1];
                for (int var167 = var165.length() - 1; var167 >= 0; var167--) {
                    if (var165.charAt(var167) == 's') {
                        var166[var167 + 1] = field970.method3111();
                    } else {
                        var166[var167 + 1] = Integer.valueOf(field970.method3131());
                    }
                }
                var166[0] = Integer.valueOf(field970.method3131());
                class69 var168 = new class69();
                var168.field850 = var166;
                class82.method730(var168);
                field972 = -1;
                return true;
            }
            if (field972 == 67) {
                field1161 = true;
                Statics.field2498 = field970.method2971();
                Statics.field293 = field970.method2971();
                Statics.field367 = field970.method3178();
                Statics.field825 = field970.method2971();
                Statics.field831 = field970.method2971();
                if (Statics.field831 >= 100) {
                    int var169 = Statics.field2498 * 128 + 64;
                    int var170 = Statics.field293 * 128 + 64;
                    int var171 = method537(var169, var170, Statics.field609) - Statics.field367;
                    int var172 = var169 - Statics.field2408;
                    int var173 = var171 - Statics.field3168;
                    int var174 = var170 - Statics.field1299;
                    int var175 = (int) Math.sqrt((double) (var172 * var172 + var174 * var174));
                    Statics.field326 = (int) (Math.atan2((double) var173, (double) var175) * 325.949D) & 0x7FF;
                    Statics.field1279 = (int) (Math.atan2((double) var172, (double) var174) * -325.949D) & 0x7FF;
                    if (Statics.field326 < 128) {
                        Statics.field326 = 128;
                    }
                    if (Statics.field326 > 383) {
                        Statics.field326 = 383;
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 188) {
                int var176 = field970.method3019();
                int var177 = field970.method3095();
                int var178 = field970.method2999();
                class68 var179 = (class68) field974.method3387((long) var176);
                if (var179 != null) {
                    method1982(var179, var179.field837 != var177);
                }
                class68 var180 = new class68();
                var180.field837 = var177;
                var180.field836 = var178;
                field974.method3374(var180, (long) var176);
                method673(var177);
                class217 var181 = class217.method2254(var176);
                method578(var181);
                if (field1079 != null) {
                    method578(field1079);
                    field1079 = null;
                }
                method3852();
                method2910(Statics.field2629[var176 >> 16], var181, false);
                class82.method3691(var177);
                if (field1075 != -1) {
                    method1411(field1075, 1);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 124) {
                int var182 = field970.method3020();
                int var183 = field970.method3009();
                int var184 = field970.method3095();
                class217 var185 = class217.method2254(var182);
                var185.field2747 = (var183 << 16) + var184;
                field972 = -1;
                return true;
            }
            if (field972 == 20) {
                int var186 = field970.method3009();
                byte var187 = field970.method3003();
                class212.field2598[var186] = var187;
                if (class212.field2599[var186] != var187) {
                    class212.field2599[var186] = var187;
                }
                method561(var186);
                field1101[++field1000 - 1 & 0x1F] = var186;
                field972 = -1;
                return true;
            }
            if (field972 == 144) {
                class95.method1551(field970, field971);
                field972 = -1;
                return true;
            }
            if (field972 == 241) {
                while (field970.field2390 < field971) {
                    int var188 = field970.method2971();
                    boolean var189 = (var188 & 0x1) == 1;
                    String var190 = field970.method3111();
                    String var191 = field970.method3111();
                    field970.method3111();
                    for (int var192 = 0; var192 < field1080; var192++) {
                        class70 var193 = field1081[var192];
                        if (var189) {
                            if (var191.equals(var193.field866)) {
                                var193.field866 = var190;
                                var193.field863 = var191;
                                var190 = null;
                                break;
                            }
                        } else if (var190.equals(var193.field866)) {
                            var193.field866 = var190;
                            var193.field863 = var191;
                            var190 = null;
                            break;
                        }
                    }
                    if (var190 != null && field1080 < 400) {
                        class70 var194 = new class70();
                        field1081[field1080] = var194;
                        var194.field866 = var190;
                        var194.field863 = var191;
                        field1080++;
                    }
                }
                field1192 = field1138;
                field972 = -1;
                return true;
            }
            if (field972 == 111) {
                field1109 = field1138;
                if (field971 == 0) {
                    field1022 = null;
                    field1171 = null;
                    Statics.field23 = 0;
                    Statics.field1352 = null;
                    field972 = -1;
                    return true;
                }
                field1171 = field970.method3111();
                long var195 = field970.method2977();
                long var197 = var195;
                String var199;
                if (var195 <= 0L || var195 >= 6582952005840035281L) {
                    var199 = null;
                } else if (var195 % 37L == 0L) {
                    var199 = null;
                } else {
                    int var200 = 0;
                    for (long var201 = var195; var201 != 0L; var201 /= 37L) {
                        var200++;
                    }
                    StringBuilder var203 = new StringBuilder(var200);
                    while (var197 != 0L) {
                        long var204 = var197;
                        var197 /= 37L;
                        var203.append(class269.field3676[(int) (var204 - var197 * 37L)]);
                    }
                    var199 = var203.reverse().toString();
                }
                field1022 = var199;
                Statics.field2110 = field970.method2972();
                int var206 = field970.method2971();
                if (var206 == 255) {
                    field972 = -1;
                    return true;
                }
                Statics.field23 = var206;
                class75[] var207 = new class75[100];
                for (int var208 = 0; var208 < Statics.field23; var208++) {
                    var207[var208] = new class75();
                    var207[var208].field919 = field970.method3111();
                    var207[var208].field920 = class268.method1000(var207[var208].field919, Statics.field3170);
                    var207[var208].field918 = field970.method3178();
                    var207[var208].field921 = field970.method2972();
                    field970.method3111();
                    if (var207[var208].field919.equals(Statics.field832.field913)) {
                        Statics.field3275 = var207[var208].field921;
                    }
                }
                boolean var209 = false;
                int var210 = Statics.field23;
                while (var210 > 0) {
                    boolean var211 = true;
                    var210--;
                    for (int var212 = 0; var212 < var210; var212++) {
                        if (var207[var212].field920.compareTo(var207[var212 + 1].field920) > 0) {
                            class75 var213 = var207[var212];
                            var207[var212] = var207[var212 + 1];
                            var207[var212 + 1] = var213;
                            var211 = false;
                        }
                    }
                    if (var211) {
                        break;
                    }
                }
                Statics.field1352 = var207;
                field972 = -1;
                return true;
            }
            if (field972 == 168) {
                method1002(true);
                field970.method3237();
                int var214 = field970.method3178();
                class95.method1551(field970, var214);
                field972 = -1;
                return true;
            }
            if (field972 == 181) {
                int var215 = field970.method3178();
                int var216 = field970.method2971();
                int var217 = field970.method3178();
                if (field1153 != 0 && var216 != 0 && field1155 < 50) {
                    field1099[field1155] = var215;
                    field1157[field1155] = var216;
                    field1137[field1155] = var217;
                    field1160[field1155] = null;
                    field1041[field1155] = 0;
                    field1155++;
                }
                field972 = -1;
                return true;
            }
            if (field972 == 63) {
                class79 var221 = new class79();
                var221.field1290 = field970.method3111();
                var221.field1282 = field970.method3178();
                int var222 = field970.method3131();
                var221.field1280 = var222;
                method1026(45);
                Statics.field310.method2789();
                Statics.field310 = null;
                class91.method1568(var221);
                field972 = -1;
                return false;
            }
            if (field972 == 118) {
                int var223 = field970.method3178();
                int var224 = field970.method3131();
                int var225 = field970.method3178();
                int var226 = field970.method3095();
                class217 var227 = class217.method2254(var224);
                if (var227.field2694 != var223 || var227.field2695 != var226 || var227.field2731 != var225) {
                    var227.field2694 = var223;
                    var227.field2695 = var226;
                    var227.field2731 = var225;
                    method578(var227);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 242) {
                field1161 = false;
                for (int var228 = 0; var228 < 5; var228++) {
                    field1030[var228] = false;
                }
                field972 = -1;
                return true;
            }
            if (field972 == 61) {
                Statics.field597 = field970.method2999();
                Statics.field1297 = field970.method3000();
                while (field970.field2390 < field971) {
                    field972 = field970.method2971();
                    method1022();
                }
                field972 = -1;
                return true;
            }
            if (field972 == 221) {
                int var229 = field970.method3019();
                class217 var230 = class217.method2254(var229);
                var230.field2774 = 3;
                var230.field2687 = Statics.field832.field888.method3740();
                method578(var230);
                field972 = -1;
                return true;
            }
            if (field972 == 212) {
                int var231 = field970.method3131();
                int var232 = field970.method3178();
                if (var231 < -70000) {
                    var232 += 32768;
                }
                class217 var233;
                if (var231 >= 0) {
                    var233 = class217.method2254(var231);
                } else {
                    var233 = null;
                }
                if (var233 != null) {
                    for (int var234 = 0; var234 < var233.field2761.length; var234++) {
                        var233.field2761[var234] = 0;
                        var233.field2637[var234] = 0;
                    }
                }
                class64 var235 = (class64) class64.field795.method3387((long) var232);
                if (var235 != null) {
                    for (int var236 = 0; var236 < var235.field799.length; var236++) {
                        var235.field799[var236] = -1;
                        var235.field796[var236] = 0;
                    }
                }
                int var237 = field970.method3178();
                for (int var238 = 0; var238 < var237; var238++) {
                    int var239 = field970.method3095();
                    int var240 = field970.method2971();
                    if (var240 == 255) {
                        var240 = field970.method3019();
                    }
                    if (var233 != null && var238 < var233.field2761.length) {
                        var233.field2761[var238] = var239;
                        var233.field2637[var238] = var240;
                    }
                    class64.method2342(var232, var238, var239 - 1, var240);
                }
                if (var233 != null) {
                    method578(var233);
                }
                method1570();
                field964[++field1104 - 1 & 0x1F] = var232 & 0x7FFF;
                field972 = -1;
                return true;
            }
            if (field972 == 85) {
                method1570();
                field1076 = field970.method2971();
                field1112 = field1138;
                field972 = -1;
                return true;
            }
            if (field972 == 182) {
                Statics.field597 = field970.method2999();
                Statics.field1297 = field970.method3000();
                for (int var241 = Statics.field597; var241 < Statics.field597 + 8; var241++) {
                    for (int var242 = Statics.field1297; var242 < Statics.field1297 + 8; var242++) {
                        if (field1045[Statics.field609][var241][var242] != null) {
                            field1045[Statics.field609][var241][var242] = null;
                            method1598(var241, var242);
                        }
                    }
                }
                for (class76 var243 = (class76) field1046.method3427(); var243 != null; var243 = (class76) field1046.method3435()) {
                    if (var243.field1196 >= Statics.field597 && var243.field1196 < Statics.field597 + 8 && var243.field1197 >= Statics.field1297 && var243.field1197 < Statics.field1297 + 8 && Statics.field609 == var243.field1204) {
                        var243.field1201 = 0;
                    }
                }
                field972 = -1;
                return true;
            }
            if (field972 == 34) {
                int var244 = field970.method3009();
                field1075 = var244;
                this.method1068(false);
                method673(var244);
                class82.method3691(field1075);
                for (int var245 = 0; var245 < 100; var245++) {
                    field1120[var245] = true;
                }
                field972 = -1;
                return true;
            }
            if (field972 == 103) {
                int var246 = field970.method3019();
                class217 var247 = class217.method2254(var246);
                for (int var248 = 0; var248 < var247.field2761.length; var248++) {
                    var247.field2761[var248] = -1;
                    var247.field2761[var248] = 0;
                }
                method578(var247);
                field972 = -1;
                return true;
            }
            if (field972 == 77) {
                field970.field2390 += 28;
                if (field970.method3134()) {
                    class180 var249 = field970;
                    int var250 = field970.field2390 - 28;
                    method982(var249.field2389, var250);
                    class156.method1584(var249, var250);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 122) {
                method1570();
                field948 = field970.method2974();
                field1112 = field1138;
                field972 = -1;
                return true;
            }
            if (field972 == 217) {
                Statics.field3318 = class278.method2253(field970.method2971());
                field972 = -1;
                return true;
            }
            if (field972 == 170) {
                String var251 = field970.method3111();
                int var252 = field970.method3178();
                byte var253 = field970.method2972();
                boolean var254 = false;
                if (var253 == -128) {
                    var254 = true;
                }
                if (var254) {
                    if (Statics.field23 == 0) {
                        field972 = -1;
                        return true;
                    }
                    boolean var255 = false;
                    int var256;
                    for (var256 = 0; var256 < Statics.field23 && (!Statics.field1352[var256].field919.equals(var251) || Statics.field1352[var256].field918 != var252); var256++) {
                    }
                    if (var256 < Statics.field23) {
                        while (var256 < Statics.field23 - 1) {
                            Statics.field1352[var256] = Statics.field1352[var256 + 1];
                            var256++;
                        }
                        Statics.field23--;
                        Statics.field1352[Statics.field23] = null;
                    }
                } else {
                    field970.method3111();
                    class75 var257 = new class75();
                    var257.field919 = var251;
                    var257.field920 = class268.method1000(var257.field919, Statics.field3170);
                    var257.field918 = var252;
                    var257.field921 = var253;
                    int var258;
                    for (var258 = Statics.field23 - 1; var258 >= 0; var258--) {
                        int var259 = Statics.field1352[var258].field920.compareTo(var257.field920);
                        if (var259 == 0) {
                            Statics.field1352[var258].field918 = var252;
                            Statics.field1352[var258].field921 = var253;
                            if (var251.equals(Statics.field832.field913)) {
                                Statics.field3275 = var253;
                            }
                            field1109 = field1138;
                            field972 = -1;
                            return true;
                        }
                        if (var259 < 0) {
                            break;
                        }
                    }
                    if (Statics.field23 >= Statics.field1352.length) {
                        field972 = -1;
                        return true;
                    }
                    for (int var260 = Statics.field23 - 1; var260 > var258; var260--) {
                        Statics.field1352[var260 + 1] = Statics.field1352[var260];
                    }
                    if (Statics.field23 == 0) {
                        Statics.field1352 = new class75[100];
                    }
                    Statics.field1352[var258 + 1] = var257;
                    Statics.field23++;
                    if (var251.equals(Statics.field832.field913)) {
                        Statics.field3275 = var253;
                    }
                }
                field1109 = field1138;
                field972 = -1;
                return true;
            }
            if (field972 == 120) {
                int var261 = field970.method3009();
                if (var261 == 65535) {
                    var261 = -1;
                }
                int var262 = field970.method3018();
                int var263 = field970.method3009();
                if (var263 == 65535) {
                    var263 = -1;
                }
                int var264 = field970.method3020();
                for (int var265 = var263; var265 <= var261; var265++) {
                    long var266 = ((long) var264 << 32) + (long) var265;
                    class193 var268 = field1187.method3387(var266);
                    if (var268 != null) {
                        var268.method3425();
                    }
                    field1187.method3374(new class199(var262), var266);
                }
                field972 = -1;
                return true;
            }
            if (field972 == 50) {
                field1147 = field970.method2971();
                if (field1147 == 255) {
                    field1147 = 0;
                }
                field1102 = field970.method2971();
                if (field1102 == 255) {
                    field1102 = 0;
                }
                field972 = -1;
                return true;
            }
            if (field972 == 223) {
                method1776();
                field972 = -1;
                return false;
            }
            if (field972 == 113) {
                int var269 = field970.method2971();
                if (field970.method2971() == 0) {
                    field1189[var269] = new class17();
                    field970.field2390 += 18;
                } else {
                    field970.field2390--;
                    field1189[var269] = new class17(field970, false);
                }
                field1110 = field1138;
                field972 = -1;
                return true;
            }
            if (field972 == 149) {
                String var270 = field970.method3111();
                int var271 = field970.method3018();
                class217 var272 = class217.method2254(var271);
                if (!var270.equals(var272.field2703)) {
                    var272.field2703 = var270;
                    method578(var272);
                }
                field972 = -1;
                return true;
            }
            class153.method611("" + field972 + class87.field1382 + field976 + class87.field1382 + field977 + class87.field1382 + field971, (Throwable) null);
            method1776();
        } catch (IOException var278) {
            method941();
        } catch (Exception var279) {
            String var275 = "" + field972 + class87.field1382 + field976 + class87.field1382 + field977 + class87.field1382 + field971 + class87.field1382 + (Statics.field352 + Statics.field832.field1265[0]) + class87.field1382 + (Statics.field3706 + Statics.field832.field1266[0]) + class87.field1382;
            for (int var276 = 0; var276 < field971 && var276 < 50; var276++) {
                var275 = var275 + field970.field2389[var276] + class87.field1382;
            }
            class153.method611(var275, var279);
            method1776();
        }
        return true;
    }

    @ObfuscatedName("ba.gy(B)V")
    public static final void method1022() {
        if (field972 == 35) {
            int var0 = field970.method3001();
            int var1 = (var0 >> 4 & 0x7) + Statics.field597;
            int var2 = (var0 & 0x7) + Statics.field1297;
            int var3 = field970.method3009();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class194 var4 = field1045[Statics.field609][var1][var2];
                if (var4 != null) {
                    for (class93 var5 = (class93) var4.method3427(); var5 != null; var5 = (class93) var4.method3435()) {
                        if ((var3 & 0x7FFF) == var5.field1482) {
                            var5.method3425();
                            break;
                        }
                    }
                    if (var4.method3427() == null) {
                        field1045[Statics.field609][var1][var2] = null;
                    }
                    method1598(var1, var2);
                }
            }
        } else if (field972 == 44) {
            int var6 = field970.method2971();
            int var7 = (var6 >> 4 & 0x7) + Statics.field597;
            int var8 = (var6 & 0x7) + Statics.field1297;
            int var9 = field970.method3178();
            int var10 = field970.method3178();
            int var11 = field970.method3178();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class194 var12 = field1045[Statics.field609][var7][var8];
                if (var12 != null) {
                    for (class93 var13 = (class93) var12.method3427(); var13 != null; var13 = (class93) var12.method3435()) {
                        if ((var9 & 0x7FFF) == var13.field1482 && var13.field1480 == var10) {
                            var13.field1480 = var11;
                            break;
                        }
                    }
                    method1598(var7, var8);
                }
            }
        } else if (field972 == 194) {
            int var14 = field970.method2971();
            int var15 = (var14 >> 4 & 0x7) + Statics.field597;
            int var16 = (var14 & 0x7) + Statics.field1297;
            int var17 = var15 + field970.method2972();
            int var18 = var16 + field970.method2972();
            int var19 = field970.method2974();
            int var20 = field970.method3178();
            int var21 = field970.method2971() * 4;
            int var22 = field970.method2971() * 4;
            int var23 = field970.method3178();
            int var24 = field970.method3178();
            int var25 = field970.method2971();
            int var26 = field970.method2971();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var20 != 65535) {
                int var27 = var15 * 128 + 64;
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                class92 var31 = new class92(var20, Statics.field609, var27, var28, method537(var27, var28, Statics.field609) - var21, field933 + var23, field933 + var24, var25, var26, var19, var22);
                var31.method1648(var29, var30, method537(var29, var30, Statics.field609) - var22, field933 + var23);
                field1047.method3429(var31);
            }
        } else if (field972 == 87) {
            int var32 = field970.method2971();
            int var33 = (var32 >> 4 & 0x7) + Statics.field597;
            int var34 = (var32 & 0x7) + Statics.field1297;
            int var35 = field970.method3178();
            int var36 = field970.method2971();
            int var37 = field970.method3178();
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                int var38 = var33 * 128 + 64;
                int var39 = var34 * 128 + 64;
                class83 var40 = new class83(var35, Statics.field609, var38, var39, method537(var38, var39, Statics.field609) - var36, var37, field933);
                field1103.method3429(var40);
            }
        } else if (field972 == 173) {
            int var41 = field970.method3095();
            int var42 = field970.method3001();
            int var43 = (var42 >> 4 & 0x7) + Statics.field597;
            int var44 = (var42 & 0x7) + Statics.field1297;
            int var45 = field970.method3000();
            int var46 = var45 >> 2;
            int var47 = var45 & 0x3;
            int var48 = field990[var46];
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                method471(Statics.field609, var43, var44, var48, var41, var46, var47, 0, -1);
            }
        } else {
            if (field972 == 146) {
                int var49 = field970.method3009();
                byte var50 = field970.method3003();
                int var51 = field970.method3010();
                int var52 = field970.method3010();
                int var53 = field970.method3000();
                int var54 = (var53 >> 4 & 0x7) + Statics.field597;
                int var55 = (var53 & 0x7) + Statics.field1297;
                byte var56 = field970.method3003();
                byte var57 = field970.method3003();
                byte var58 = field970.method3002();
                int var59 = field970.method2971();
                int var60 = var59 >> 2;
                int var61 = var59 & 0x3;
                int var62 = field990[var60];
                int var63 = field970.method3009();
                class74 var64;
                if (field1036 == var52) {
                    var64 = Statics.field832;
                } else {
                    var64 = field1035[var52];
                }
                if (var64 != null) {
                    class256 var65 = class256.method2861(var49);
                    int var66;
                    int var67;
                    if (var61 == 1 || var61 == 3) {
                        var66 = var65.field3452;
                        var67 = var65.field3445;
                    } else {
                        var66 = var65.field3445;
                        var67 = var65.field3452;
                    }
                    int var68 = (var66 >> 1) + var54;
                    int var69 = (var66 + 1 >> 1) + var54;
                    int var70 = (var67 >> 1) + var55;
                    int var71 = (var67 + 1 >> 1) + var55;
                    int[][] var72 = class62.field774[Statics.field609];
                    int var73 = var72[var68][var70] + var72[var69][var70] + var72[var68][var71] + var72[var69][var71] >> 2;
                    int var74 = (var54 << 7) + (var66 << 6);
                    int var75 = (var55 << 7) + (var67 << 6);
                    class132 var76 = var65.method4276(var60, var61, var72, var74, var73, var75);
                    if (var76 != null) {
                        method471(Statics.field609, var54, var55, var62, -1, 0, 0, var63 + 1, var51 + 1);
                        var64.field896 = field933 + var63;
                        var64.field904 = field933 + var51;
                        var64.field901 = var76;
                        var64.field910 = var54 * 128 + var66 * 64;
                        var64.field898 = var55 * 128 + var67 * 64;
                        var64.field899 = var73;
                        if (var56 > var50) {
                            byte var77 = var56;
                            var56 = var50;
                            var50 = var77;
                        }
                        if (var58 > var57) {
                            byte var78 = var58;
                            var58 = var57;
                            var57 = var78;
                        }
                        var64.field902 = var54 + var56;
                        var64.field893 = var50 + var54;
                        var64.field903 = var55 + var58;
                        var64.field905 = var55 + var57;
                    }
                }
            }
            if (field972 == 75) {
                int var79 = field970.method3000();
                int var80 = (var79 >> 4 & 0x7) + Statics.field597;
                int var81 = (var79 & 0x7) + Statics.field1297;
                int var82 = field970.method3000();
                int var83 = var82 >> 2;
                int var84 = var82 & 0x3;
                int var85 = field990[var83];
                int var86 = field970.method3009();
                if (var80 >= 0 && var81 >= 0 && var80 < 103 && var81 < 103) {
                    if (var85 == 0) {
                        class141 var87 = Statics.field28.method2530(Statics.field609, var80, var81);
                        if (var87 != null) {
                            int var88 = var87.field2112 >> 14 & 0x7FFF;
                            if (var83 == 2) {
                                var87.field2108 = new class99(var88, 2, var84 + 4, Statics.field609, var80, var81, var86, false, var87.field2108);
                                var87.field2105 = new class99(var88, 2, var84 + 1 & 0x3, Statics.field609, var80, var81, var86, false, var87.field2105);
                            } else {
                                var87.field2108 = new class99(var88, var83, var84, Statics.field609, var80, var81, var86, false, var87.field2108);
                            }
                        }
                    }
                    if (var85 == 1) {
                        class146 var89 = Statics.field28.method2540(Statics.field609, var80, var81);
                        if (var89 != null) {
                            int var90 = var89.field2160 >> 14 & 0x7FFF;
                            if (var83 == 4 || var83 == 5) {
                                var89.field2159 = new class99(var90, 4, var84, Statics.field609, var80, var81, var86, false, var89.field2159);
                            } else if (var83 == 6) {
                                var89.field2159 = new class99(var90, 4, var84 + 4, Statics.field609, var80, var81, var86, false, var89.field2159);
                            } else if (var83 == 7) {
                                var89.field2159 = new class99(var90, 4, (var84 + 2 & 0x3) + 4, Statics.field609, var80, var81, var86, false, var89.field2159);
                            } else if (var83 == 8) {
                                var89.field2159 = new class99(var90, 4, var84 + 4, Statics.field609, var80, var81, var86, false, var89.field2159);
                                var89.field2157 = new class99(var90, 4, (var84 + 2 & 0x3) + 4, Statics.field609, var80, var81, var86, false, var89.field2157);
                            }
                        }
                    }
                    if (var85 == 2) {
                        class147 var91 = Statics.field28.method2541(Statics.field609, var80, var81);
                        if (var83 == 11) {
                            var83 = 10;
                        }
                        if (var91 != null) {
                            var91.field2168 = new class99(var91.field2176 >> 14 & 0x7FFF, var83, var84, Statics.field609, var80, var81, var86, false, var91.field2168);
                        }
                    }
                    if (var85 == 3) {
                        class128 var92 = Statics.field28.method2654(Statics.field609, var80, var81);
                        if (var92 != null) {
                            var92.field1858 = new class99(var92.field1852 >> 14 & 0x7FFF, 22, var84, Statics.field609, var80, var81, var86, false, var92.field1858);
                        }
                    }
                }
            } else if (field972 == 18) {
                int var93 = field970.method2999();
                int var94 = (var93 >> 4 & 0x7) + Statics.field597;
                int var95 = (var93 & 0x7) + Statics.field1297;
                int var96 = field970.method2999();
                int var97 = var96 >> 2;
                int var98 = var96 & 0x3;
                int var99 = field990[var97];
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    method471(Statics.field609, var94, var95, var99, -1, var97, var98, 0, -1);
                }
            } else {
                if (field972 == 45) {
                    int var100 = field970.method2971();
                    int var101 = (var100 >> 4 & 0x7) + Statics.field597;
                    int var102 = (var100 & 0x7) + Statics.field1297;
                    int var103 = field970.method3178();
                    int var104 = field970.method2971();
                    int var105 = var104 >> 4 & 0xF;
                    int var106 = var104 & 0x7;
                    int var107 = field970.method2971();
                    if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                        int var108 = var105 + 1;
                        if (Statics.field832.field1265[0] >= var101 - var108 && Statics.field832.field1265[0] <= var101 + var108 && Statics.field832.field1266[0] >= var102 - var108 && Statics.field832.field1266[0] <= var102 + var108 && field923 != 0 && var106 > 0 && field1155 < 50) {
                            field1099[field1155] = var103;
                            field1157[field1155] = var106;
                            field1137[field1155] = var107;
                            field1160[field1155] = null;
                            field1041[field1155] = (var101 << 16) + (var102 << 8) + var105;
                            field1155++;
                        }
                    }
                }
                if (field972 == 210) {
                    int var109 = field970.method3000();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field597;
                    int var111 = (var109 & 0x7) + Statics.field1297;
                    int var112 = field970.method3095();
                    int var113 = field970.method3009();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class93 var114 = new class93();
                        var114.field1482 = var112;
                        var114.field1480 = var113;
                        if (field1045[Statics.field609][var110][var111] == null) {
                            field1045[Statics.field609][var110][var111] = new class194();
                        }
                        field1045[Statics.field609][var110][var111].method3429(var114);
                        method1598(var110, var111);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.gu(IIIIIIIIIB)V")
    public static final void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class76 var9 = null;
        for (class76 var10 = (class76) field1046.method3427(); var10 != null; var10 = (class76) field1046.method3435()) {
            if (var10.field1204 == arg0 && var10.field1196 == arg1 && var10.field1197 == arg2 && var10.field1198 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class76();
            var9.field1204 = arg0;
            var9.field1198 = arg3;
            var9.field1196 = arg1;
            var9.field1197 = arg2;
            method2003(var9);
            field1046.method3429(var9);
        }
        var9.field1194 = arg4;
        var9.field1203 = arg5;
        var9.field1202 = arg6;
        var9.field1195 = arg7;
        var9.field1201 = arg8;
    }

    @ObfuscatedName("bf.gn(I)V")
    public static final void method693() {
        for (class76 var0 = (class76) field1046.method3427(); var0 != null; var0 = (class76) field1046.method3435()) {
            if (var0.field1201 == -1) {
                var0.field1195 = 0;
                method2003(var0);
            } else {
                var0.method3425();
            }
        }
    }

    @ObfuscatedName("dx.gt(Lbe;B)V")
    public static final void method2003(class76 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1198 == 0) {
            var1 = Statics.field28.method2575(arg0.field1204, arg0.field1196, arg0.field1197);
        }
        if (arg0.field1198 == 1) {
            var1 = Statics.field28.method2549(arg0.field1204, arg0.field1196, arg0.field1197);
        }
        if (arg0.field1198 == 2) {
            var1 = Statics.field28.method2650(arg0.field1204, arg0.field1196, arg0.field1197);
        }
        if (arg0.field1198 == 3) {
            var1 = Statics.field28.method2546(arg0.field1204, arg0.field1196, arg0.field1197);
        }
        if (var1 != 0) {
            int var5 = Statics.field28.method2547(arg0.field1204, arg0.field1196, arg0.field1197, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1205 = var2;
        arg0.field1200 = var3;
        arg0.field1199 = var4;
    }

    @ObfuscatedName("hp.ho(I)V")
    public static final void method3845() {
        for (class76 var0 = (class76) field1046.method3427(); var0 != null; var0 = (class76) field1046.method3435()) {
            if (var0.field1201 > 0) {
                var0.field1201--;
            }
            if (var0.field1201 != 0) {
                if (var0.field1195 > 0) {
                    var0.field1195--;
                }
                if (var0.field1195 == 0 && var0.field1196 >= 1 && var0.field1197 >= 1 && var0.field1196 <= 102 && var0.field1197 <= 102 && (var0.field1194 < 0 || class62.method314(var0.field1194, var0.field1203))) {
                    method1012(var0.field1204, var0.field1198, var0.field1196, var0.field1197, var0.field1194, var0.field1202, var0.field1203);
                    var0.field1195 = -1;
                    if (var0.field1205 == var0.field1194 && var0.field1205 == -1) {
                        var0.method3425();
                    } else if (var0.field1205 == var0.field1194 && var0.field1202 == var0.field1199 && var0.field1203 == var0.field1200) {
                        var0.method3425();
                    }
                }
            } else if (var0.field1205 < 0 || class62.method314(var0.field1205, var0.field1200)) {
                method1012(var0.field1204, var0.field1198, var0.field1196, var0.field1197, var0.field1205, var0.field1199, var0.field1200);
                var0.method3425();
            }
        }
    }

    @ObfuscatedName("bg.hm(IIIIIIIB)V")
    public static final void method1012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field928 && Statics.field609 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field28.method2575(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field28.method2549(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field28.method2650(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field28.method2546(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field28.method2547(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field28.method2534(arg0, arg2, arg3);
                class256 var15 = class256.method2861(var12);
                if (var15.field3453 != 0) {
                    field987[arg0].method2839(arg2, arg3, var13, var14, var15.field3454);
                }
            }
            if (arg1 == 1) {
                Statics.field28.method2535(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field28.method2536(arg0, arg2, arg3);
                class256 var16 = class256.method2861(var12);
                if (var16.field3445 + arg2 > 103 || var16.field3445 + arg3 > 103 || var16.field3452 + arg2 > 103 || var16.field3452 + arg3 > 103) {
                    return;
                }
                if (var16.field3453 != 0) {
                    field987[arg0].method2845(arg2, arg3, var16.field3445, var16.field3452, var14, var16.field3454);
                }
            }
            if (arg1 == 3) {
                Statics.field28.method2537(arg0, arg2, arg3);
                class256 var17 = class256.method2861(var12);
                if (var17.field3453 == 1) {
                    field987[arg0].method2835(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field770[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class138 var19 = Statics.field28;
        class162 var20 = field987[arg0];
        class256 var21 = class256.method2861(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3452;
            var23 = var21.field3445;
        } else {
            var22 = var21.field3445;
            var23 = var21.field3452;
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
        int[][] var28 = class62.field774[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3455 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3476 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class140 var34;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var34 = var21.method4276(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class99(arg4, 22, arg5, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2523(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3453 == 1) {
                var20.method2830(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class140 var57;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var57 = var21.method4276(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class99(arg4, 10, arg5, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            if (var57 != null) {
                var19.method2527(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3453 != 0) {
                var20.method2828(arg2, arg3, var22, var23, var21.field3454);
            }
        } else if (arg6 >= 12) {
            class140 var35;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var35 = var21.method4276(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class99(arg4, arg6, arg5, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2527(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3453 != 0) {
                var20.method2828(arg2, arg3, var22, var23, var21.field3454);
            }
        } else if (arg6 == 0) {
            class140 var36;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var36 = var21.method4276(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class99(arg4, 0, arg5, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2525(arg0, arg2, arg3, var29, var36, (class140) null, class62.field775[arg5], 0, var32, var33);
            if (var21.field3453 != 0) {
                var20.method2833(arg2, arg3, arg6, arg5, var21.field3454);
            }
        } else if (arg6 == 1) {
            class140 var37;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var37 = var21.method4276(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class99(arg4, 1, arg5, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2525(arg0, arg2, arg3, var29, var37, (class140) null, class62.field786[arg5], 0, var32, var33);
            if (var21.field3453 != 0) {
                var20.method2833(arg2, arg3, arg6, arg5, var21.field3454);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class140 var39;
            class140 var40;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var39 = var21.method4276(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4276(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class99(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3440, true, (class140) null);
                var40 = new class99(arg4, 2, var38, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2525(arg0, arg2, arg3, var29, var39, var40, class62.field775[arg5], class62.field775[var38], var32, var33);
            if (var21.field3453 != 0) {
                var20.method2833(arg2, arg3, arg6, arg5, var21.field3454);
            }
        } else if (arg6 == 3) {
            class140 var41;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var41 = var21.method4276(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class99(arg4, 3, arg5, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2525(arg0, arg2, arg3, var29, var41, (class140) null, class62.field786[arg5], 0, var32, var33);
            if (var21.field3453 != 0) {
                var20.method2833(arg2, arg3, arg6, arg5, var21.field3454);
            }
        } else if (arg6 == 9) {
            class140 var42;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var42 = var21.method4276(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class99(arg4, arg6, arg5, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2527(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3453 != 0) {
                var20.method2828(arg2, arg3, var22, var23, var21.field3454);
            }
        } else if (arg6 == 4) {
            class140 var43;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var43 = var21.method4276(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class99(arg4, 4, arg5, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2639(arg0, arg2, arg3, var29, var43, (class140) null, class62.field775[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2575(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class256.method2861(var45 >> 14 & 0x7FFF).field3475;
            }
            class140 var46;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var46 = var21.method4276(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class99(arg4, 4, arg5, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2639(arg0, arg2, arg3, var29, var46, (class140) null, class62.field775[arg5], 0, class62.field777[arg5] * var44, class62.field781[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2575(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class256.method2861(var48 >> 14 & 0x7FFF).field3475 / 2;
            }
            class140 var49;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var49 = var21.method4276(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class99(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2639(arg0, arg2, arg3, var29, var49, (class140) null, 256, arg5, class62.field769[arg5] * var47, class62.field776[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class140 var51;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var51 = var21.method4276(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class99(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2639(arg0, arg2, arg3, var29, var51, (class140) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2575(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class256.method2861(var53 >> 14 & 0x7FFF).field3475 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class140 var55;
            class140 var56;
            if (var21.field3440 == -1 && var21.field3477 == null) {
                var55 = var21.method4276(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4276(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class99(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3440, true, (class140) null);
                var56 = new class99(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3440, true, (class140) null);
            }
            var19.method2639(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field769[arg5] * var52, class62.field776[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ck.hh(III)V")
    public static final void method1598(int arg0, int arg1) {
        class194 var2 = field1045[Statics.field609][arg0][arg1];
        if (var2 == null) {
            Statics.field28.method2538(Statics.field609, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class93 var5 = null;
        for (class93 var6 = (class93) var2.method3427(); var6 != null; var6 = (class93) var2.method3435()) {
            class257 var7 = class257.method2694(var6.field1482);
            long var8 = (long) var7.field3496;
            if (var7.field3510 == 1) {
                var8 = (long) (var6.field1480 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field28.method2538(Statics.field609, arg0, arg1);
            return;
        }
        var2.method3430(var5);
        class93 var10 = null;
        class93 var11 = null;
        for (class93 var12 = (class93) var2.method3427(); var12 != null; var12 = (class93) var2.method3435()) {
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
        Statics.field28.method2519(Statics.field609, arg0, arg1, method537(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field609), var5, var13, var10, var11);
    }

    @ObfuscatedName("m.hx(ZI)V")
    public static final void method164(boolean arg0) {
        field1038 = 0;
        field966 = 0;
        method688();
        while (field970.method3241(field971) >= 27) {
            int var1 = field970.method3239(15);
            if (var1 == 32767) {
                break;
            }
            boolean var5 = false;
            if (field1131[var1] == null) {
                field1131[var1] = new class85();
                var5 = true;
            }
            class85 var6 = field1131[var1];
            field965[++field954 - 1] = var1;
            var6.field1256 = field933;
            int var7;
            if (arg0) {
                var7 = field970.method3239(8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = field970.method3239(5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            int var8 = field970.method3239(1);
            if (var8 == 1) {
                field967[++field966 - 1] = var1;
            }
            int var9;
            if (arg0) {
                var9 = field970.method3239(8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = field970.method3239(5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            var6.field1367 = class259.method116(field970.method3239(14));
            int var10 = field970.method3239(1);
            int var11 = field1043[field970.method3239(3)];
            if (var5) {
                var6.field1261 = var6.field1210 = var11;
            }
            var6.field1222 = var6.field1367.field3556;
            var6.field1263 = var6.field1367.field3563;
            if (var6.field1263 == 0) {
                var6.field1210 = 0;
            }
            var6.field1218 = var6.field1367.field3574;
            var6.field1219 = var6.field1367.field3579;
            var6.field1220 = var6.field1367.field3564;
            var6.field1221 = var6.field1367.field3565;
            var6.field1267 = var6.field1367.field3550;
            var6.field1254 = var6.field1367.field3586;
            var6.field1228 = var6.field1367.field3561;
            var6.method1575(Statics.field832.field1265[0] + var7, Statics.field832.field1266[0] + var9, var10 == 1);
        }
        field970.method3255();
        method151();
        for (int var2 = 0; var2 < field1038; var2++) {
            int var3 = field1039[var2];
            if (field933 != field1131[var3].field1256) {
                field1131[var3].field1367 = null;
                field1131[var3] = null;
            }
        }
        if (field971 != field970.field2390) {
            throw new RuntimeException(field970.field2390 + class87.field1382 + field971);
        }
        for (int var4 = 0; var4 < field954; var4++) {
            if (field1131[field965[var4]] == null) {
                throw new RuntimeException(var4 + class87.field1382 + field954);
            }
        }
    }

    @ObfuscatedName("bj.hg(I)V")
    public static final void method688() {
        field970.method3238();
        int var0 = field970.method3239(8);
        if (var0 < field954) {
            for (int var1 = var0; var1 < field954; var1++) {
                field1039[++field1038 - 1] = field965[var1];
            }
        }
        if (var0 > field954) {
            throw new RuntimeException("");
        }
        field954 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field965[var2];
            class85 var4 = field1131[var3];
            int var5 = field970.method3239(1);
            if (var5 == 0) {
                field965[++field954 - 1] = var3;
                var4.field1256 = field933;
            } else {
                int var6 = field970.method3239(2);
                if (var6 == 0) {
                    field965[++field954 - 1] = var3;
                    var4.field1256 = field933;
                    field967[++field966 - 1] = var3;
                } else if (var6 == 1) {
                    field965[++field954 - 1] = var3;
                    var4.field1256 = field933;
                    int var7 = field970.method3239(3);
                    var4.method1578(var7, (byte) 1);
                    int var8 = field970.method3239(1);
                    if (var8 == 1) {
                        field967[++field966 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field965[++field954 - 1] = var3;
                    var4.field1256 = field933;
                    int var9 = field970.method3239(3);
                    var4.method1578(var9, (byte) 2);
                    int var10 = field970.method3239(3);
                    var4.method1578(var10, (byte) 2);
                    int var11 = field970.method3239(1);
                    if (var11 == 1) {
                        field967[++field966 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1039[++field1038 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("c.hs(S)V")
    public static final void method151() {
        for (int var0 = 0; var0 < field966; var0++) {
            int var1 = field967[var0];
            class85 var2 = field1131[var1];
            int var3 = field970.method2971();
            if ((var3 & 0x20) != 0) {
                var2.field1223 = field970.method3111();
                var2.field1226 = 100;
            }
            if ((var3 & 0x40) != 0) {
                int var4 = field970.method3010();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field970.method3001();
                if (var2.field1242 == var4 && var4 != -1) {
                    int var6 = class261.method4424(var4).field3620;
                    if (var6 == 1) {
                        var2.field1243 = 0;
                        var2.field1244 = 0;
                        var2.field1269 = var5;
                        var2.field1246 = 0;
                    }
                    if (var6 == 2) {
                        var2.field1246 = 0;
                    }
                } else if (var4 == -1 || var2.field1242 == -1 || class261.method4424(var4).field3618 >= class261.method4424(var2.field1242).field3618) {
                    var2.field1242 = var4;
                    var2.field1243 = 0;
                    var2.field1244 = 0;
                    var2.field1269 = var5;
                    var2.field1246 = 0;
                    var2.field1214 = var2.field1264;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field1215 = field970.method3010();
                int var7 = field970.method3019();
                var2.field1251 = var7 >> 16;
                var2.field1247 = (var7 & 0xFFFF) + field933;
                var2.field1216 = 0;
                var2.field1249 = 0;
                if (var2.field1247 > field933) {
                    var2.field1216 = -1;
                }
                if (var2.field1215 == 65535) {
                    var2.field1215 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var8 = field970.method2999();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = field970.method2985();
                        if (var13 == 32767) {
                            var13 = field970.method2985();
                            var11 = field970.method2985();
                            var10 = field970.method2985();
                            var12 = field970.method2985();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = field970.method2985();
                        }
                        int var14 = field970.method2985();
                        var2.method1415(var13, var11, var10, var12, field933, var14);
                    }
                }
                int var15 = field970.method3000();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = field970.method2985();
                        int var18 = field970.method2985();
                        if (var18 == 32767) {
                            var2.method1418(var17);
                        } else {
                            int var19 = field970.method2985();
                            int var20 = field970.method2999();
                            int var21 = var18 > 0 ? field970.method2999() : var20;
                            var2.method1416(var17, field933, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field1236 = field970.method3010();
                if (var2.field1236 == 65535) {
                    var2.field1236 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var22 = field970.method3010();
                int var23 = field970.method3178();
                int var24 = var2.field1225 - (var22 - Statics.field352 - Statics.field352) * 64;
                int var25 = var2.field1211 - (var23 - Statics.field3706 - Statics.field3706) * 64;
                if (var24 != 0 || var25 != 0) {
                    var2.field1250 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field1367 = class259.method116(field970.method3009());
                var2.field1222 = var2.field1367.field3556;
                var2.field1263 = var2.field1367.field3563;
                var2.field1218 = var2.field1367.field3574;
                var2.field1219 = var2.field1367.field3579;
                var2.field1220 = var2.field1367.field3564;
                var2.field1221 = var2.field1367.field3565;
                var2.field1267 = var2.field1367.field3550;
                var2.field1254 = var2.field1367.field3586;
                var2.field1228 = var2.field1367.field3561;
            }
        }
    }

    @ObfuscatedName("ex.hi(B)V")
    public static void method2718() {
        field926 = 0;
        field1053 = false;
    }

    @ObfuscatedName("ah.hz(I)V")
    public static void method546() {
        method2718();
        field1059[0] = class226.field3090;
        field1060[0] = "";
        field963[0] = 1006;
        field1162[0] = false;
        field926 = 1;
    }

    @ObfuscatedName("eo.hj(III)V")
    public static final void method2698(int arg0, int arg1) {
        if (field926 < 2 && field1068 == 0 && !field1100) {
            return;
        }
        int var2 = field926 - 1;
        String var4;
        if (field1068 == 1 && field926 < 2) {
            var4 = class226.field3001 + class226.field3011 + field1069 + " " + class87.field1383;
        } else if (field1100 && field926 < 2) {
            var4 = field1073 + class226.field3011 + field1088 + " " + class87.field1383;
        } else {
            String var5;
            if (var2 < 0) {
                var5 = "";
            } else if (field1060[var2].length() > 0) {
                var5 = field1059[var2] + class226.field3011 + field1060[var2];
            } else {
                var5 = field1059[var2];
            }
            var4 = var5;
        }
        if (field926 > 2) {
            var4 = var4 + class87.method166(16777215) + " " + '/' + " " + (field926 - 2) + class226.field3005;
        }
        Statics.field2239.method4534(var4, arg0 + 4, arg1 + 15, 16777215, 0, field933 / 1000);
    }

    @ObfuscatedName("av.hf(IIIII)V")
    public static final void method447(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1118; var4++) {
            if (field1125[var4] + field1123[var4] > arg0 && field1123[var4] < arg0 + arg2 && field1126[var4] + field1124[var4] > arg1 && field1124[var4] < arg1 + arg3) {
                field1120[var4] = true;
            }
        }
    }

    @ObfuscatedName("ft.ht(IIIII)V")
    public static final void method3265(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1118; var4++) {
            if (field1125[var4] + field1123[var4] > arg0 && field1123[var4] < arg0 + arg2 && field1126[var4] + field1124[var4] > arg1 && field1124[var4] < arg1 + arg3) {
                field1121[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hy(I)V")
    public final void method1327() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field926 - 1; var2++) {
                if (field963[var2] < 1000 && field963[var2 + 1] > 1000) {
                    String var3 = field1060[var2];
                    field1060[var2] = field1060[var2 + 1];
                    field1060[var2 + 1] = var3;
                    String var4 = field1059[var2];
                    field1059[var2] = field1059[var2 + 1];
                    field1059[var2 + 1] = var4;
                    int var5 = field963[var2];
                    field963[var2] = field963[var2 + 1];
                    field963[var2 + 1] = var5;
                    int var6 = field1055[var2];
                    field1055[var2] = field1055[var2 + 1];
                    field1055[var2 + 1] = var6;
                    int var7 = field1056[var2];
                    field1056[var2] = field1056[var2 + 1];
                    field1056[var2 + 1] = var7;
                    int var8 = field940[var2];
                    field940[var2] = field940[var2 + 1];
                    field940[var2 + 1] = var8;
                    boolean var9 = field1162[var2];
                    field1162[var2] = field1162[var2 + 1];
                    field1162[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field788 != null || field1159 != null) {
            return;
        }
        int var10 = class60.field744;
        if (field1053) {
            if (var10 != 1 && (Statics.field245 || var10 != 4)) {
                int var11 = class60.field757;
                int var12 = class60.field742;
                if (var11 < Statics.field273 - 10 || var11 > Statics.field273 + Statics.field236 + 10 || var12 < Statics.field428 - 10 || var12 > Statics.field428 + Statics.field322 + 10) {
                    field1053 = false;
                    method447(Statics.field273, Statics.field428, Statics.field236, Statics.field322);
                }
            }
            if (var10 == 1 || !Statics.field245 && var10 == 4) {
                int var13 = Statics.field273;
                int var14 = Statics.field428;
                int var15 = Statics.field236;
                int var16 = class60.field758;
                int var17 = class60.field759;
                int var18 = -1;
                for (int var19 = 0; var19 < field926; var19++) {
                    int var20 = (field926 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1) {
                    method996(var18);
                }
                field1053 = false;
                method447(Statics.field273, Statics.field428, Statics.field236, Statics.field322);
            }
            return;
        }
        int var21 = field926 - 1;
        if ((var10 == 1 || !Statics.field245 && var10 == 4) && var21 >= 0) {
            int var23 = field963[var21];
            if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                int var24 = field1055[var21];
                int var25 = field1056[var21];
                class217 var26 = class217.method2254(var25);
                if (class218.method126(method177(var26)) || class218.method2515(method177(var26))) {
                    if (Statics.field788 != null && !field1032 && field926 > 0 && !this.method1095()) {
                        int var27 = field1029;
                        int var28 = field1132;
                        class88 var29 = Statics.field2345;
                        method634(var29.field1390, var29.field1397, var29.field1392, var29.field1391, var29.field1394, var29.field1394, var27, var28);
                        Statics.field2345 = null;
                    }
                    field1032 = false;
                    field1033 = 0;
                    if (Statics.field788 != null) {
                        method578(Statics.field788);
                    }
                    Statics.field788 = class217.method2254(var25);
                    field945 = var24;
                    field1029 = class60.field758;
                    field1132 = class60.field759;
                    if (var21 >= 0) {
                        method37(var21);
                    }
                    method578(Statics.field788);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field245 && var10 == 4) && this.method1095()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field245 && var10 == 4) && field926 > 0) {
            method996(var21);
        }
        if (var10 == 2 && field926 > 0) {
            this.method1067(class60.field758, class60.field759);
        }
    }

    @ObfuscatedName("client.hv(I)Z")
    public final boolean method1095() {
        int var1 = field926 - 1;
        if (field926 > 2) {
            if (field1052 == 1 && !field1162[var1]) {
                return true;
            }
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field963[var1];
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

    @ObfuscatedName("client.hw(III)V")
    public final void method1067(int arg0, int arg1) {
        int var3 = Statics.field2239.method4514(class226.field3004);
        for (int var4 = 0; var4 < field926; var4++) {
            class264 var5 = Statics.field2239;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1060[var4].length() > 0) {
                var6 = field1059[var4] + class226.field3011 + field1060[var4];
            } else {
                var6 = field1059[var4];
            }
            int var7 = var5.method4514(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field926 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field2255) {
            var9 = Statics.field2255 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field722) {
            var10 = Statics.field722 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field28.method2554(Statics.field609, arg0, arg1, false);
        field1053 = true;
        Statics.field273 = var9;
        Statics.field428 = var10;
        Statics.field236 = var3;
        Statics.field322 = field926 * 15 + 22;
    }

    @ObfuscatedName("bd.hp(IB)V")
    public static final void method996(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1055[arg0];
        int var2 = field1056[arg0];
        int var3 = field963[arg0];
        int var4 = field940[arg0];
        String var5 = field1059[arg0];
        String var6 = field1060[arg0];
        method634(var1, var2, var3, var4, var5, var6, class60.field758, class60.field759);
    }

    @ObfuscatedName("ai.hd(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method634(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 43) {
            field968.method3236(104);
            field968.method2956(arg3);
            field968.method3093(arg0);
            field968.method3072(arg1);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 16) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(162);
            field968.method2997(class51.field660[82] ? 1 : 0);
            field968.method3005(Statics.field352 + arg0);
            field968.method2957(Statics.field3706 + arg1);
            field968.method3093(Statics.field3205);
            field968.method3005(Statics.field45);
            field968.method3093(arg3);
            field968.method3072(Statics.field916);
        }
        if (arg2 == 42) {
            field968.method3236(73);
            field968.method3026(arg1);
            field968.method2956(arg3);
            field968.method3093(arg0);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 1) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(42);
            field968.method2956(Statics.field3205);
            field968.method3093(Statics.field352 + arg0);
            field968.method2976(class51.field660[82] ? 1 : 0);
            field968.method2957(arg3 >> 14 & 0x7FFF);
            field968.method3026(Statics.field916);
            field968.method2956(Statics.field3706 + arg1);
            field968.method2956(Statics.field45);
        }
        if (arg2 == 1004) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field968.method3236(27);
            field968.method3093(arg3);
        }
        if (arg2 == 1002) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field968.method3236(46);
            field968.method2956(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 3) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(149);
            field968.method2956(Statics.field352 + arg0);
            field968.method2957(arg3 >> 14 & 0x7FFF);
            field968.method2956(Statics.field3706 + arg1);
            field968.method2996(class51.field660[82] ? 1 : 0);
        }
        if (arg2 == 45) {
            class74 var8 = field1035[arg3];
            if (var8 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(77);
                field968.method2976(class51.field660[82] ? 1 : 0);
                field968.method3005(arg3);
            }
        }
        if (arg2 == 38) {
            method690();
            class217 var9 = class217.method2254(arg1);
            field1068 = 1;
            Statics.field45 = arg0;
            Statics.field916 = arg1;
            Statics.field3205 = arg3;
            method578(var9);
            field1069 = class87.method166(16748608) + class257.method2694(arg3).field3499 + class87.method166(16777215);
            if (field1069 == null) {
                field1069 = "null";
            }
            return;
        }
        if (arg2 == 6) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(37);
            field968.method3093(Statics.field352 + arg0);
            field968.method2996(class51.field660[82] ? 1 : 0);
            field968.method2956(arg3 >> 14 & 0x7FFF);
            field968.method3093(Statics.field3706 + arg1);
        }
        if (arg2 == 26) {
            method2860();
        }
        if (arg2 == 32) {
            field968.method3236(140);
            field968.method2956(arg3);
            field968.method2956(field1071);
            field968.method3093(arg0);
            field968.method3072(Statics.field697);
            field968.method3143(arg1);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 41) {
            field968.method3236(60);
            field968.method3093(arg3);
            field968.method2956(arg0);
            field968.method3026(arg1);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 11) {
            class85 var10 = field1131[arg3];
            if (var10 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(38);
                field968.method2956(arg3);
                field968.method2997(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class85 var11 = field1131[arg3];
            if (var11 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(120);
                field968.method2956(arg3);
                field968.method2996(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field968.method3236(216);
            field968.method3005(arg3);
            field968.method3143(arg1);
            field968.method3093(arg0);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 58) {
            class217 var12 = Statics.method3770(arg1, arg0);
            if (var12 != null) {
                field968.method3236(125);
                field968.method3005(field1170);
                field968.method3026(Statics.field697);
                field968.method2957(var12.field2763);
                field968.method3143(arg1);
                field968.method3093(arg0);
                field968.method2957(field1071);
            }
        }
        if (arg2 == 40) {
            field968.method3236(186);
            field968.method3005(arg0);
            field968.method3093(arg3);
            field968.method3016(arg1);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 4) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(4);
            field968.method3005(Statics.field3706 + arg1);
            field968.method2956(Statics.field352 + arg0);
            field968.method2996(class51.field660[82] ? 1 : 0);
            field968.method2957(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 37) {
            field968.method3236(134);
            field968.method2956(arg3);
            field968.method3016(arg1);
            field968.method3093(arg0);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 48) {
            class74 var13 = field1035[arg3];
            if (var13 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(151);
                field968.method2956(arg3);
                field968.method2976(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class74 var14 = field1035[arg3];
            if (var14 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(121);
                field968.method3093(arg3);
                field968.method2997(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(172);
            field968.method3093(arg3);
            field968.method3005(Statics.field352 + arg0);
            field968.method3093(Statics.field3706 + arg1);
            field968.method2996(class51.field660[82] ? 1 : 0);
        }
        if (arg2 == 12) {
            class85 var15 = field1131[arg3];
            if (var15 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(44);
                field968.method3005(arg3);
                field968.method2996(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            if (field1053) {
                Statics.field28.method2555();
            } else {
                Statics.field28.method2554(Statics.field609, arg0, arg1, true);
            }
        }
        if (arg2 == 44) {
            class74 var16 = field1035[arg3];
            if (var16 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(159);
                field968.method3005(arg3);
                field968.method2997(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            class85 var17 = field1131[arg3];
            if (var17 != null) {
                class259 var18 = var17.field1367;
                if (var18.field3580 != null) {
                    var18 = var18.method4396();
                }
                if (var18 != null) {
                    field968.method3236(124);
                    field968.method3093(var18.field3554);
                }
            }
        }
        if (arg2 == 14) {
            class74 var19 = field1035[arg3];
            if (var19 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(59);
                field968.method3143(Statics.field916);
                field968.method3005(Statics.field3205);
                field968.method3093(arg3);
                field968.method3005(Statics.field45);
                field968.method2997(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field1079 == null) {
            method674(arg1, arg0);
            field1079 = Statics.method3770(arg1, arg0);
            method578(field1079);
        }
        if (arg2 == 1005) {
            class217 var20 = class217.method2254(arg1);
            if (var20 == null || var20.field2637[arg0] < 100000) {
                field968.method3236(27);
                field968.method3093(arg3);
            } else {
                class97.method3203(27, "", var20.field2637[arg0] + " x " + class257.method2694(arg3).field3499);
            }
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 33) {
            field968.method3236(229);
            field968.method3093(arg3);
            field968.method2956(arg0);
            field968.method3143(arg1);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 31) {
            field968.method3236(223);
            field968.method3093(Statics.field45);
            field968.method2956(arg0);
            field968.method3026(arg1);
            field968.method2957(arg3);
            field968.method3093(Statics.field3205);
            field968.method3026(Statics.field916);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 49) {
            class74 var21 = field1035[arg3];
            if (var21 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(80);
                field968.method2955(class51.field660[82] ? 1 : 0);
                field968.method2957(arg3);
            }
        }
        if (arg2 == 15) {
            class74 var22 = field1035[arg3];
            if (var22 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(100);
                field968.method2955(class51.field660[82] ? 1 : 0);
                field968.method3026(Statics.field697);
                field968.method3093(arg3);
                field968.method3005(field1071);
            }
        }
        if (arg2 == 36) {
            field968.method3236(89);
            field968.method3005(arg3);
            field968.method3005(arg0);
            field968.method3026(arg1);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 29) {
            field968.method3236(21);
            field968.method3072(arg1);
            class217 var23 = class217.method2254(arg1);
            if (var23.field2635 != null && var23.field2635[0][0] == 5) {
                int var24 = var23.field2635[0][1];
                if (class212.field2599[var24] != var23.field2757[0]) {
                    class212.field2599[var24] = var23.field2757[0];
                    method561(var24);
                }
            }
        }
        if (arg2 == 2) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(247);
            field968.method3005(arg3 >> 14 & 0x7FFF);
            field968.method3143(Statics.field697);
            field968.method2957(field1071);
            field968.method2957(Statics.field3706 + arg1);
            field968.method3093(Statics.field352 + arg0);
            field968.method2955(class51.field660[82] ? 1 : 0);
        }
        if (arg2 == 24) {
            class217 var25 = class217.method2254(arg1);
            boolean var26 = true;
            if (var25.field2647 > 0) {
                var26 = method129(var25);
            }
            if (var26) {
                field968.method3236(21);
                field968.method3072(arg1);
            }
        }
        if (arg2 == 39) {
            field968.method3236(239);
            field968.method3005(arg0);
            field968.method3005(arg3);
            field968.method3143(arg1);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 18) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(102);
            field968.method3005(Statics.field352 + arg0);
            field968.method2976(class51.field660[82] ? 1 : 0);
            field968.method2957(arg3);
            field968.method3093(Statics.field3706 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var27 = Statics.method3770(arg1, arg0);
            if (var27 != null) {
                method467(arg3, arg1, arg0, var27.field2763, arg5);
            }
        }
        if (arg2 == 10) {
            class85 var28 = field1131[arg3];
            if (var28 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(96);
                field968.method2976(class51.field660[82] ? 1 : 0);
                field968.method3005(arg3);
            }
        }
        if (arg2 == 1001) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(145);
            field968.method2956(Statics.field352 + arg0);
            field968.method2997(class51.field660[82] ? 1 : 0);
            field968.method2956(arg3 >> 14 & 0x7FFF);
            field968.method3093(Statics.field3706 + arg1);
        }
        if (arg2 == 28) {
            field968.method3236(21);
            field968.method3072(arg1);
            class217 var29 = class217.method2254(arg1);
            if (var29.field2635 != null && var29.field2635[0][0] == 5) {
                int var30 = var29.field2635[0][1];
                class212.field2599[var30] = 1 - class212.field2599[var30];
                method561(var30);
            }
        }
        if (arg2 == 50) {
            class74 var31 = field1035[arg3];
            if (var31 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(203);
                field968.method2955(class51.field660[82] ? 1 : 0);
                field968.method3005(arg3);
            }
        }
        if (arg2 == 5) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(6);
            field968.method3093(Statics.field3706 + arg1);
            field968.method2976(class51.field660[82] ? 1 : 0);
            field968.method2957(Statics.field352 + arg0);
            field968.method3005(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 22) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(19);
            field968.method2956(arg3);
            field968.method3005(Statics.field3706 + arg1);
            field968.method2955(class51.field660[82] ? 1 : 0);
            field968.method2957(Statics.field352 + arg0);
        }
        if (arg2 == 47) {
            class74 var32 = field1035[arg3];
            if (var32 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(177);
                field968.method2956(arg3);
                field968.method2996(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class85 var33 = field1131[arg3];
            if (var33 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(182);
                field968.method2957(arg3);
                field968.method2957(Statics.field3205);
                field968.method3093(Statics.field45);
                field968.method2976(class51.field660[82] ? 1 : 0);
                field968.method3026(Statics.field916);
            }
        }
        if (arg2 == 20) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(253);
            field968.method2956(arg3);
            field968.method2997(class51.field660[82] ? 1 : 0);
            field968.method3005(Statics.field352 + arg0);
            field968.method2956(Statics.field3706 + arg1);
        }
        if (arg2 == 17) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(226);
            field968.method3093(Statics.field352 + arg0);
            field968.method3005(Statics.field3706 + arg1);
            field968.method3026(Statics.field697);
            field968.method2997(class51.field660[82] ? 1 : 0);
            field968.method3005(arg3);
            field968.method2957(field1071);
        }
        if (arg2 == 9) {
            class85 var34 = field1131[arg3];
            if (var34 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(65);
                field968.method2955(class51.field660[82] ? 1 : 0);
                field968.method2956(arg3);
            }
        }
        if (arg2 == 51) {
            class74 var35 = field1035[arg3];
            if (var35 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(70);
                field968.method2957(arg3);
                field968.method2997(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class217 var36 = Statics.method3770(arg1, arg0);
            if (var36 != null) {
                method690();
                int var39 = method177(var36);
                int var40 = var39 >> 11 & 0x3F;
                method2781(arg1, arg0, var40, var36.field2763);
                field1068 = 0;
                int var41 = method177(var36);
                int var42 = var41 >> 11 & 0x3F;
                String var43;
                if (var42 == 0) {
                    var43 = null;
                } else if (var36.field2631 == null || var36.field2631.trim().length() == 0) {
                    var43 = null;
                } else {
                    var43 = var36.field2631;
                }
                field1073 = var43;
                if (field1073 == null) {
                    field1073 = "Null";
                }
                if (var36.field2642) {
                    field1088 = var36.field2716 + class87.method166(16777215);
                } else {
                    field1088 = class87.method166(65280) + var36.field2684 + class87.method166(16777215);
                }
            }
            return;
        }
        if (arg2 == 8) {
            class85 var44 = field1131[arg3];
            if (var44 != null) {
                field1048 = arg6;
                field1023 = arg7;
                field1025 = 2;
                field1024 = 0;
                field1147 = arg0;
                field1102 = arg1;
                field968.method3236(91);
                field968.method3143(Statics.field697);
                field968.method2955(class51.field660[82] ? 1 : 0);
                field968.method2957(arg3);
                field968.method3005(field1071);
            }
        }
        if (arg2 == 35) {
            field968.method3236(0);
            field968.method2957(arg0);
            field968.method3143(arg1);
            field968.method3005(arg3);
            field1026 = 0;
            Statics.field883 = class217.method2254(arg1);
            field1027 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1193.method4994(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 21) {
            field1048 = arg6;
            field1023 = arg7;
            field1025 = 2;
            field1024 = 0;
            field1147 = arg0;
            field1102 = arg1;
            field968.method3236(180);
            field968.method3093(arg3);
            field968.method3005(Statics.field352 + arg0);
            field968.method2997(class51.field660[82] ? 1 : 0);
            field968.method3093(Statics.field3706 + arg1);
        }
        if (field1068 != 0) {
            field1068 = 0;
            method578(class217.method2254(Statics.field916));
        }
        if (field1100) {
            method690();
        }
        if (Statics.field883 != null && field1026 == 0) {
            method578(Statics.field883);
        }
    }

    @ObfuscatedName("ee.hc(IIIII)V")
    public static void method2781(int arg0, int arg1, int arg2, int arg3) {
        class217 var4 = Statics.method3770(arg0, arg1);
        if (var4 != null && var4.field2756 != null) {
            class69 var5 = new class69();
            var5.field851 = var4;
            var5.field850 = var4.field2756;
            class82.method730(var5);
        }
        field1170 = arg3;
        field1100 = true;
        Statics.field697 = arg0;
        field1071 = arg1;
        Statics.field1422 = arg2;
        method578(var4);
    }

    @ObfuscatedName("bf.ha(I)V")
    public static void method690() {
        if (!field1100) {
            return;
        }
        class217 var0 = Statics.method3770(Statics.field697, field1071);
        if (var0 != null && var0.field2720 != null) {
            class69 var1 = new class69();
            var1.field851 = var0;
            var1.field850 = var0.field2720;
            class82.method730(var1);
        }
        field1100 = false;
        method578(var0);
    }

    @ObfuscatedName("as.hn(III)V")
    public static void method674(int arg0, int arg1) {
        field968.method3236(119);
        field968.method3093(arg1);
        field968.method3143(arg0);
    }

    @ObfuscatedName("ae.hk(IIIILjava/lang/String;B)V")
    public static void method467(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class217 var5 = Statics.method3770(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2743 != null) {
            class69 var6 = new class69();
            var6.field851 = var5;
            var6.field852 = arg0;
            var6.field854 = arg4;
            var6.field850 = var5.field2743;
            class82.method730(var6);
        }
        boolean var7 = true;
        if (var5.field2647 > 0) {
            var7 = method129(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method177(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field968.method3236(61);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
        if (arg0 == 2) {
            field968.method3236(126);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
        if (arg0 == 3) {
            field968.method3236(156);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
        if (arg0 == 4) {
            field968.method3236(232);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
        if (arg0 == 5) {
            field968.method3236(139);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
        if (arg0 == 6) {
            field968.method3236(130);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
        if (arg0 == 7) {
            field968.method3236(72);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
        if (arg0 == 8) {
            field968.method3236(103);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
        if (arg0 == 9) {
            field968.method3236(8);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
        if (arg0 == 10) {
            field968.method3236(83);
            field968.method3072(arg1);
            field968.method2956(arg2);
            field968.method2956(arg3);
        }
    }

    @ObfuscatedName("hz.hl(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3771(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2695(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("er.he(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method2695(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1053 || field926 >= 500) {
            return;
        }
        field1059[field926] = arg0;
        field1060[field926] = arg1;
        field963[field926] = arg2;
        field940[field926] = arg3;
        field1055[field926] = arg4;
        field1056[field926] = arg5;
        field1162[field926] = arg6;
        field926++;
    }

    @ObfuscatedName("hc.hb(B)V")
    public static void method3852() {
        for (int var0 = 0; var0 < field926; var0++) {
            if (method624(field963[var0])) {
                if (var0 < field926 - 1) {
                    for (int var1 = var0; var1 < field926 - 1; var1++) {
                        field1059[var1] = field1059[var1 + 1];
                        field1060[var1] = field1060[var1 + 1];
                        field963[var1] = field963[var1 + 1];
                        field940[var1] = field940[var1 + 1];
                        field1055[var1] = field1055[var1 + 1];
                        field1056[var1] = field1056[var1 + 1];
                        field1162[var1] = field1162[var1 + 1];
                    }
                }
                field926--;
            }
        }
    }

    @ObfuscatedName("ar.hr(II)Z")
    public static boolean method624(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cu.hq(IIIIB)V")
    public static final void method1600(int arg0, int arg1, int arg2, int arg3) {
        if (field1068 == 0 && !field1100) {
            method3771(class226.field2897, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class133.field1982; var6++) {
            int var7 = class133.field1990[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field28.method2547(Statics.field609, var8, var9, var7) >= 0) {
                    class256 var12 = class256.method2861(var11);
                    if (var12.field3477 != null) {
                        var12 = var12.method4279();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1068 == 1) {
                        method3771(class226.field3001, field1069 + " " + class87.field1383 + " " + class87.method166(65535) + var12.field3435, 1, var7, var8, var9);
                    } else if (!field1100) {
                        String[] var13 = var12.field3463;
                        if (field1086) {
                            var13 = method40(var13);
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
                                    method3771(var13[var14], class87.method166(65535) + var12.field3435, var15, var7, var8, var9);
                                }
                            }
                        }
                        method3771(class226.field3002, class87.method166(65535) + var12.field3435, 1002, var12.field3443 << 14, var8, var9);
                    } else if ((Statics.field1422 & 0x4) == 4) {
                        method3771(field1073, field1088 + " " + class87.field1383 + " " + class87.method166(65535) + var12.field3435, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class85 var16 = field1131[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1367.field3556 == 1 && (var16.field1225 & 0x7F) == 64 && (var16.field1211 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field954; var17++) {
                            class85 var18 = field1131[field965[var17]];
                            if (var18 != null && var16 != var18 && var18.field1367.field3556 == 1 && var16.field1225 == var18.field1225 && var16.field1211 == var18.field1211) {
                                method118(var18.field1367, field965[var17], var8, var9);
                            }
                        }
                        int var19 = class95.field1500;
                        int[] var20 = class95.field1491;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class74 var22 = field1035[var20[var21]];
                            if (var22 != null && var16.field1225 == var22.field1225 && var16.field1211 == var22.field1211) {
                                method444(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method118(var16.field1367, var11, var8, var9);
                }
                if (var10 == 0) {
                    class74 var23 = field1035[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1225 & 0x7F) == 64 && (var23.field1211 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field954; var24++) {
                            class85 var25 = field1131[field965[var24]];
                            if (var25 != null && var25.field1367.field3556 == 1 && var23.field1225 == var25.field1225 && var23.field1211 == var25.field1211) {
                                method118(var25.field1367, field965[var24], var8, var9);
                            }
                        }
                        int var26 = class95.field1500;
                        int[] var27 = class95.field1491;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class74 var29 = field1035[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1225 == var29.field1225 && var23.field1211 == var29.field1211) {
                                method444(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field1044 == var11) {
                        var4 = var7;
                    } else {
                        method444(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class194 var30 = field1045[Statics.field609][var8][var9];
                    if (var30 != null) {
                        for (class93 var31 = (class93) var30.method3439(); var31 != null; var31 = (class93) var30.method3437()) {
                            class257 var32 = class257.method2694(var31.field1482);
                            if (field1068 == 1) {
                                method3771(class226.field3001, field1069 + " " + class87.field1383 + " " + class87.method166(16748608) + var32.field3499, 16, var31.field1482, var8, var9);
                            } else if (!field1100) {
                                String[] var33 = var32.field3500;
                                if (field1086) {
                                    var33 = method40(var33);
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
                                        method3771(var33[var34], class87.method166(16748608) + var32.field3499, var35, var31.field1482, var8, var9);
                                    } else if (var34 == 2) {
                                        method3771(class226.field2852, class87.method166(16748608) + var32.field3499, 20, var31.field1482, var8, var9);
                                    }
                                }
                                method3771(class226.field3002, class87.method166(16748608) + var32.field3499, 1004, var31.field1482, var8, var9);
                            } else if ((Statics.field1422 & 0x1) == 1) {
                                method3771(field1073, field1088 + " " + class87.field1383 + " " + class87.method166(16748608) + var32.field3499, 17, var31.field1482, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class74 var38 = field1035[field1044];
            method444(var38, field1044, var36, var37);
        }
    }

    @ObfuscatedName("j.hu(Lia;IIIS)V")
    public static final void method118(class259 arg0, int arg1, int arg2, int arg3) {
        if (field926 >= 400) {
            return;
        }
        if (arg0.field3580 != null) {
            arg0 = arg0.method4396();
        }
        if (arg0 == null || !arg0.field3583 || arg0.field3585 && field1083 != arg1) {
            return;
        }
        String var4 = arg0.field3559;
        if (arg0.field3572 != 0) {
            var4 = var4 + method445(arg0.field3572, Statics.field832.field911) + " " + class87.field1381 + class226.field3007 + arg0.field3572 + class87.field1379;
        }
        if (arg0.field3585 && field1175) {
            method3771(class226.field3002, class87.method166(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1068 == 1) {
            method3771(class226.field3001, field1069 + " " + class87.field1383 + " " + class87.method166(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1100) {
            int var5 = arg0.field3585 && field1175 ? 2000 : 0;
            String[] var6 = arg0.field3570;
            if (field1086) {
                var6 = method40(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class226.field2974)) {
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
                        method3771(var6[var7], class87.method166(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class226.field2974)) {
                        short var10 = 0;
                        if (field950 != class90.field1407) {
                            if (field950 == class90.field1405 || field950 == class90.field1406 && arg0.field3572 > Statics.field832.field911) {
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
                            method3771(var6[var9], class87.method166(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3585 || !field1175) {
                method3771(class226.field3002, class87.method166(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1422 & 0x2) == 2) {
            method3771(field1073, field1088 + " " + class87.field1383 + " " + class87.method166(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ax.is(Lbk;IIIB)V")
    public static final void method444(class74 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field832 == arg0 || field926 >= 400) {
            return;
        }
        String var4;
        if (arg0.field894 == 0) {
            var4 = arg0.field892[0] + arg0.field913 + arg0.field892[1] + method445(arg0.field911, Statics.field832.field911) + " " + class87.field1381 + class226.field3007 + arg0.field911 + class87.field1379 + arg0.field892[2];
        } else {
            var4 = arg0.field892[0] + arg0.field913 + arg0.field892[1] + " " + class87.field1381 + class226.field3060 + arg0.field894 + class87.field1379 + arg0.field892[2];
        }
        if (field1068 == 1) {
            method3771(class226.field3001, field1069 + " " + class87.field1383 + " " + class87.method166(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1100) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field1158[var5] != null) {
                    short var6 = 0;
                    if (field1158[var5].equalsIgnoreCase(class226.field2974)) {
                        if (field949 == class90.field1407) {
                            continue;
                        }
                        if (field949 == class90.field1405 || field949 == class90.field1406 && arg0.field911 > Statics.field832.field911) {
                            var6 = 2000;
                        }
                        if (Statics.field832.field907 != 0 && arg0.field907 != 0) {
                            if (Statics.field832.field907 == arg0.field907) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field1042[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field1040[var5] + var6;
                    method3771(field1158[var5], class87.method166(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1422 & 0x8) == 8) {
            method3771(field1073, field1088 + " " + class87.field1383 + " " + class87.method166(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field926; var9++) {
            if (field963[var9] == 23) {
                field1060[var9] = class87.method166(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ax.ip(IIB)Ljava/lang/String;")
    public static final String method445(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class87.method166(16711680);
        } else if (var2 < -6) {
            return class87.method166(16723968);
        } else if (var2 < -3) {
            return class87.method166(16740352);
        } else if (var2 < 0) {
            return class87.method166(16756736);
        } else if (var2 > 9) {
            return class87.method166(65280);
        } else if (var2 > 6) {
            return class87.method166(4259584);
        } else if (var2 > 3) {
            return class87.method166(8453888);
        } else if (var2 > 0) {
            return class87.method166(12648192);
        } else {
            return class87.method166(16776960);
        }
    }

    @ObfuscatedName("bf.it(IIIIIIIII)V")
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method263(arg0)) {
            Statics.field808 = null;
            method1599(Statics.field2629[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field808 != null) {
                method1599(Statics.field808, -1412584499, arg1, arg2, arg3, arg4, Statics.field594, Statics.field826, arg7);
                Statics.field808 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1120[var8] = true;
            }
        } else {
            field1120[arg7] = true;
        }
    }

    @ObfuscatedName("cu.ih([Lhj;IIIIIIIIB)V")
    public static final void method1599(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class283.method4723(arg2, arg3, arg4, arg5);
        class135.method2476();
        label981: for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2701 == arg1 || arg1 == -1412584499 && field1159 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1123[field1118] = var10.field2656 + arg6;
                    field1124[field1118] = var10.field2674 + arg7;
                    field1125[field1118] = var10.field2658;
                    field1126[field1118] = var10.field2659;
                    var11 = ++field1118 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2714 = var11;
                var10.field2775 = field933;
                if (!var10.field2642 || !method1010(var10)) {
                    if (var10.field2647 > 0) {
                        method2203(var10);
                    }
                    int var12 = var10.field2656 + arg6;
                    int var13 = var10.field2674 + arg7;
                    int var14 = var10.field2769;
                    if (field1159 == var10) {
                        if (arg1 != -1412584499 && !var10.field2721) {
                            Statics.field808 = arg0;
                            Statics.field594 = arg6;
                            Statics.field826 = arg7;
                            continue;
                        }
                        if (field1091 && field1184) {
                            int var15 = class60.field757;
                            int var16 = class60.field742;
                            int var17 = var15 - field1090;
                            int var18 = var16 - field1169;
                            if (var17 < field1094) {
                                var17 = field1094;
                            }
                            if (var10.field2658 + var17 > field1094 + field961.field2658) {
                                var17 = field1094 + field961.field2658 - var10.field2658;
                            }
                            if (var18 < field1095) {
                                var18 = field1095;
                            }
                            if (var10.field2659 + var18 > field1095 + field961.field2659) {
                                var18 = field1095 + field961.field2659 - var10.field2659;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2721) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2645 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2645 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2658 + var12;
                        int var26 = var10.field2659 + var13;
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
                        int var29 = var10.field2658 + var12;
                        int var30 = var10.field2659 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2642 || var19 < var21 && var20 < var22) {
                        if (var10.field2647 != 0) {
                            if (var10.field2647 == 1336) {
                                if (field939) {
                                    var13 += 15;
                                    Statics.field260.method4510("Fps:" + field731, var10.field2658 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field928) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field928) {
                                        var33 = 16711680;
                                    }
                                    Statics.field260.method4510("Mem:" + var32 + "k", var10.field2658 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2647 == 1337) {
                                field1064 = var12;
                                field1065 = var13;
                                int var36 = var10.field2658;
                                int var37 = var10.field2659;
                                field1019++;
                                method1013();
                                method552();
                                method1001();
                                Statics.method1571(true);
                                int var38 = class95.field1500;
                                int[] var39 = class95.field1491;
                                for (int var40 = 0; var40 < var38; var40++) {
                                    if (field1044 != var39[var40] && field1036 != var39[var40]) {
                                        method234(field1035[var39[var40]], true);
                                    }
                                }
                                Statics.method1571(false);
                                method4481();
                                method85();
                                method7(var12, var13, var36, var37, true);
                                int var41 = field924;
                                int var42 = field1176;
                                int var43 = field1177;
                                int var44 = field1173;
                                class283.method4723(var41, var42, var41 + var43, var42 + var44);
                                class135.method2476();
                                if (!field1161) {
                                    int var45 = field998;
                                    if (field959 / 256 > var45) {
                                        var45 = field959 / 256;
                                    }
                                    if (field1030[4] && field1164[4] + 128 > var45) {
                                        var45 = field1164[4] + 128;
                                    }
                                    int var46 = field1156 & 0x7FF;
                                    method4008(Statics.field2149, method537(Statics.field832.field1225, Statics.field832.field1211, Statics.field609) - field1070, Statics.field2433, var45, var46, var45 * 3 + 600);
                                }
                                int var47;
                                if (field1161) {
                                    int var48;
                                    if (Statics.field869.field1304) {
                                        var48 = Statics.field609;
                                    } else {
                                        int var49 = method537(Statics.field2408, Statics.field1299, Statics.field609);
                                        if (var49 - Statics.field3168 >= 800 || (class62.field770[Statics.field609][Statics.field2408 >> 7][Statics.field1299 >> 7] & 0x4) == 0) {
                                            var48 = 3;
                                        } else {
                                            var48 = Statics.field609;
                                        }
                                    }
                                    var47 = var48;
                                } else {
                                    var47 = method725();
                                }
                                int var50 = Statics.field2408;
                                int var51 = Statics.field3168;
                                int var52 = Statics.field1299;
                                int var53 = Statics.field326;
                                int var54 = Statics.field1279;
                                for (int var55 = 0; var55 < 5; var55++) {
                                    if (field1030[var55]) {
                                        int var56 = (int) (Math.random() * (double) (field1163[var55] * 2 + 1) - (double) field1163[var55] + Math.sin((double) field936[var55] / 100.0D * (double) field1166[var55]) * (double) field1164[var55]);
                                        if (var55 == 0) {
                                            Statics.field2408 += var56;
                                        }
                                        if (var55 == 1) {
                                            Statics.field3168 += var56;
                                        }
                                        if (var55 == 2) {
                                            Statics.field1299 += var56;
                                        }
                                        if (var55 == 3) {
                                            Statics.field1279 = Statics.field1279 + var56 & 0x7FF;
                                        }
                                        if (var55 == 4) {
                                            Statics.field326 += var56;
                                            if (Statics.field326 < 128) {
                                                Statics.field326 = 128;
                                            }
                                            if (Statics.field326 > 383) {
                                                Statics.field326 = 383;
                                            }
                                        }
                                    }
                                }
                                int var57 = class60.field757;
                                int var58 = class60.field742;
                                if (class60.field744 != 0) {
                                    var57 = class60.field758;
                                    var58 = class60.field759;
                                }
                                if (var57 >= var41 && var57 < var41 + var43 && var58 >= var42 && var58 < var42 + var44) {
                                    int var59 = var57 - var41;
                                    int var60 = var58 - var42;
                                    class133.field1994 = var59;
                                    class133.field1987 = var60;
                                    class133.field1989 = true;
                                    class133.field1982 = 0;
                                    class133.field1984 = false;
                                } else {
                                    class133.method3210();
                                }
                                method669();
                                class283.method4704(var41, var42, var43, var44, 0);
                                method669();
                                int var61 = class135.field2010;
                                class135.field2010 = field1179;
                                Statics.field28.method2676(Statics.field2408, Statics.field3168, Statics.field1299, Statics.field326, Statics.field1279, var47);
                                while (true) {
                                    class10 var62 = (class10) class8.field242.method3394();
                                    if (var62 == null) {
                                        class135.field2010 = var61;
                                        method669();
                                        Statics.field28.method2539();
                                        field1008 = 0;
                                        boolean var63 = false;
                                        int var64 = -1;
                                        int var65 = class95.field1500;
                                        int[] var66 = class95.field1491;
                                        for (int var67 = 0; var67 < field954 + var65; var67++) {
                                            class77 var68;
                                            if (var67 < var65) {
                                                var68 = field1035[var66[var67]];
                                                if (field1044 == var66[var67]) {
                                                    var63 = true;
                                                    var64 = var67;
                                                    continue;
                                                }
                                            } else {
                                                var68 = field1131[field965[var67 - var65]];
                                            }
                                            method1(var68, var67, var41, var42, var43, var44);
                                        }
                                        if (var63) {
                                            method1(field1035[field1044], var64, var41, var42, var43, var44);
                                        }
                                        for (int var69 = 0; var69 < field1008; var69++) {
                                            int var70 = field1010[var69];
                                            int var71 = field1011[var69];
                                            int var72 = field1013[var69];
                                            int var73 = field1012[var69];
                                            boolean var74 = true;
                                            while (var74) {
                                                var74 = false;
                                                for (int var75 = 0; var75 < var69; var75++) {
                                                    if (var71 + 2 > field1011[var75] - field1012[var75] && var71 - var73 < field1011[var75] + 2 && var70 - var72 < field1013[var75] + field1010[var75] && var70 + var72 > field1010[var75] - field1013[var75] && field1011[var75] - field1012[var75] < var71) {
                                                        var71 = field1011[var75] - field1012[var75];
                                                        var74 = true;
                                                    }
                                                }
                                            }
                                            field1020 = field1010[var69];
                                            field927 = field1011[var69] = var71;
                                            String var76 = field1017[var69];
                                            if (field1077 == 0) {
                                                int var77 = 16776960;
                                                if (field1014[var69] < 6) {
                                                    var77 = field1111[field1014[var69]];
                                                }
                                                if (field1014[var69] == 6) {
                                                    var77 = field1019 % 20 < 10 ? 16711680 : 16776960;
                                                }
                                                if (field1014[var69] == 7) {
                                                    var77 = field1019 % 20 < 10 ? 255 : 65535;
                                                }
                                                if (field1014[var69] == 8) {
                                                    var77 = field1019 % 20 < 10 ? 45056 : 8454016;
                                                }
                                                if (field1014[var69] == 9) {
                                                    int var78 = 150 - field1122[var69];
                                                    if (var78 < 50) {
                                                        var77 = var78 * 1280 + 16711680;
                                                    } else if (var78 < 100) {
                                                        var77 = 16776960 - (var78 - 50) * 327680;
                                                    } else if (var78 < 150) {
                                                        var77 = (var78 - 100) * 5 + 65280;
                                                    }
                                                }
                                                if (field1014[var69] == 10) {
                                                    int var79 = 150 - field1122[var69];
                                                    if (var79 < 50) {
                                                        var77 = var79 * 5 + 16711680;
                                                    } else if (var79 < 100) {
                                                        var77 = 16711935 - (var79 - 50) * 327680;
                                                    } else if (var79 < 150) {
                                                        var77 = (var79 - 100) * 327680 + 255 - (var79 - 100) * 5;
                                                    }
                                                }
                                                if (field1014[var69] == 11) {
                                                    int var80 = 150 - field1122[var69];
                                                    if (var80 < 50) {
                                                        var77 = 16777215 - var80 * 327685;
                                                    } else if (var80 < 100) {
                                                        var77 = (var80 - 50) * 327685 + 65280;
                                                    } else if (var80 < 150) {
                                                        var77 = 16777215 - (var80 - 100) * 327680;
                                                    }
                                                }
                                                if (field1015[var69] == 0) {
                                                    Statics.field2239.method4511(var76, field1020 + var41, field927 + var42, var77, 0);
                                                }
                                                if (field1015[var69] == 1) {
                                                    Statics.field2239.method4513(var76, field1020 + var41, field927 + var42, var77, 0, field1019);
                                                }
                                                if (field1015[var69] == 2) {
                                                    Statics.field2239.method4524(var76, field1020 + var41, field927 + var42, var77, 0, field1019);
                                                }
                                                if (field1015[var69] == 3) {
                                                    Statics.field2239.method4515(var76, field1020 + var41, field927 + var42, var77, 0, field1019, 150 - field1122[var69]);
                                                }
                                                if (field1015[var69] == 4) {
                                                    int var81 = (150 - field1122[var69]) * (Statics.field2239.method4514(var76) + 100) / 150;
                                                    class283.method4708(field1020 + var41 - 50, var42, field1020 + var41 + 50, var42 + var44);
                                                    Statics.field2239.method4508(var76, field1020 + var41 + 50 - var81, field927 + var42, var77, 0);
                                                    class283.method4723(var41, var42, var41 + var43, var42 + var44);
                                                }
                                                if (field1015[var69] == 5) {
                                                    int var82 = 150 - field1122[var69];
                                                    int var83 = 0;
                                                    if (var82 < 25) {
                                                        var83 = var82 - 25;
                                                    } else if (var82 > 125) {
                                                        var83 = var82 - 125;
                                                    }
                                                    class283.method4708(var41, field927 + var42 - Statics.field2239.field3646 - 1, var41 + var43, field927 + var42 + 5);
                                                    Statics.field2239.method4511(var76, field1020 + var41, field927 + var42 + var83, var77, 0);
                                                    class283.method4723(var41, var42, var41 + var43, var42 + var44);
                                                }
                                            } else {
                                                Statics.field2239.method4511(var76, field1020 + var41, field927 + var42, 16776960, 0);
                                            }
                                        }
                                        method243(var41, var42);
                                        ((class124) Statics.field2021).method2239(field1005);
                                        if (field1025 == 1) {
                                            Statics.field1855[field1024 / 100].method4822(field1048 - 8, field1023 - 8);
                                        }
                                        if (field1025 == 2) {
                                            Statics.field1855[field1024 / 100 + 4].method4822(field1048 - 8, field1023 - 8);
                                        }
                                        method632();
                                        Statics.field2408 = var50;
                                        Statics.field3168 = var51;
                                        Statics.field1299 = var52;
                                        Statics.field326 = var53;
                                        Statics.field1279 = var54;
                                        if (field932) {
                                            byte var84 = 0;
                                            int var85 = class239.field3251 + class239.field3249 + var84;
                                            if (var85 == 0) {
                                                field932 = false;
                                            }
                                        }
                                        if (field932) {
                                            class283.method4704(var41, var42, var43, var44, 0);
                                            method175(class226.field2861, false);
                                        }
                                        field1120[var10.field2714] = true;
                                        class283.method4723(arg2, arg3, arg4, arg5);
                                        continue label981;
                                    }
                                    var62.method33();
                                }
                            }
                            if (var10.field2647 == 1338) {
                                method15(var10, var12, var13, var11);
                                class283.method4723(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2647 == 1339) {
                                method3867(var10, var12, var13, var11);
                                class283.method4723(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2647 == 1400) {
                                Statics.field1193.method4959(var12, var13, var10.field2658, var10.field2659, field933);
                            }
                            if (var10.field2647 == 1401) {
                                Statics.field1193.method4960(var12, var13, var10.field2658, var10.field2659);
                            }
                        }
                        if (var10.field2645 == 0) {
                            if (!var10.field2642 && method1010(var10) && Statics.field3622 != var10) {
                                continue;
                            }
                            if (!var10.field2642) {
                                if (var10.field2765 > var10.field2667 - var10.field2659) {
                                    var10.field2765 = var10.field2667 - var10.field2659;
                                }
                                if (var10.field2765 < 0) {
                                    var10.field2765 = 0;
                                }
                            }
                            method1599(arg0, var10.field2643, var19, var20, var21, var22, var12 - var10.field2664, var13 - var10.field2765, var11);
                            if (var10.field2767 != null) {
                                method1599(var10.field2767, var10.field2643, var19, var20, var21, var22, var12 - var10.field2664, var13 - var10.field2765, var11);
                            }
                            class68 var87 = (class68) field974.method3387((long) var10.field2643);
                            if (var87 != null) {
                                method691(var87.field837, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class283.method4723(arg2, arg3, arg4, arg5);
                            class135.method2476();
                        }
                        if (field1129 || field1057[var11] || field1127 > 1) {
                            if (var10.field2645 == 0 && !var10.field2642 && var10.field2667 > var10.field2659) {
                                int var88 = var10.field2658 + var12;
                                int var89 = var10.field2765;
                                int var90 = var10.field2659;
                                int var91 = var10.field2667;
                                Statics.field1402[0].method4795(var88, var13);
                                Statics.field1402[1].method4795(var88, var13 + var90 - 16);
                                class283.method4704(var88, var13 + 16, 16, var90 - 32, field992);
                                int var92 = (var90 - 32) * var90 / var91;
                                if (var92 < 8) {
                                    var92 = 8;
                                }
                                int var93 = (var90 - 32 - var92) * var89 / (var91 - var90);
                                class283.method4704(var88, var13 + 16 + var93, 16, var92, field993);
                                class283.method4714(var88, var13 + 16 + var93, var92, field934);
                                class283.method4714(var88 + 1, var13 + 16 + var93, var92, field934);
                                class283.method4712(var88, var13 + 16 + var93, 16, field934);
                                class283.method4712(var88, var13 + 17 + var93, 16, field934);
                                class283.method4714(var88 + 15, var13 + 16 + var93, var92, field1062);
                                class283.method4714(var88 + 14, var13 + 17 + var93, var92 - 1, field1062);
                                class283.method4712(var88, var13 + 15 + var93 + var92, 16, field1062);
                                class283.method4712(var88 + 1, var13 + 14 + var93 + var92, 15, field1062);
                            }
                            if (var10.field2645 != 1) {
                                if (var10.field2645 == 2) {
                                    int var94 = 0;
                                    for (int var95 = 0; var95 < var10.field2655; var95++) {
                                        for (int var96 = 0; var96 < var10.field2654; var96++) {
                                            int var97 = (var10.field2709 + 32) * var96 + var12;
                                            int var98 = (var10.field2651 + 32) * var95 + var13;
                                            if (var94 < 20) {
                                                var97 += var10.field2711[var94];
                                                var98 += var10.field2702[var94];
                                            }
                                            if (var10.field2761[var94] > 0) {
                                                boolean var99 = false;
                                                boolean var100 = false;
                                                int var101 = var10.field2761[var94] - 1;
                                                if (var97 + 32 > arg2 && var97 < arg4 && var98 + 32 > arg3 && var98 < arg5 || Statics.field788 == var10 && field945 == var94) {
                                                    class287 var102;
                                                    if (field1068 == 1 && Statics.field45 == var94 && Statics.field916 == var10.field2643) {
                                                        var102 = class257.method1410(var101, var10.field2637[var94], 2, 0, 2, false);
                                                    } else {
                                                        var102 = class257.method1410(var101, var10.field2637[var94], 1, 3153952, 2, false);
                                                    }
                                                    if (var102 == null) {
                                                        method578(var10);
                                                    } else if (Statics.field788 == var10 && field945 == var94) {
                                                        int var103 = class60.field757 - field1029;
                                                        int var104 = class60.field742 - field1132;
                                                        if (var103 < 5 && var103 > -5) {
                                                            var103 = 0;
                                                        }
                                                        if (var104 < 5 && var104 > -5) {
                                                            var104 = 0;
                                                        }
                                                        if (field1033 < 5) {
                                                            var103 = 0;
                                                            var104 = 0;
                                                        }
                                                        var102.method4827(var97 + var103, var98 + var104, 128);
                                                        if (arg1 != -1) {
                                                            class217 var105 = arg0[arg1 & 0xFFFF];
                                                            if (var98 + var104 < class283.field3771 && var105.field2765 > 0) {
                                                                int var106 = field1005 * (class283.field3771 - var98 - var104) / 3;
                                                                if (var106 > field1005 * 10) {
                                                                    var106 = field1005 * 10;
                                                                }
                                                                if (var106 > var105.field2765) {
                                                                    var106 = var105.field2765;
                                                                }
                                                                var105.field2765 -= var106;
                                                                field1132 += var106;
                                                                method578(var105);
                                                            }
                                                            if (var98 + var104 + 32 > class283.field3772 && var105.field2765 < var105.field2667 - var105.field2659) {
                                                                int var107 = field1005 * (var98 + var104 + 32 - class283.field3772) / 3;
                                                                if (var107 > field1005 * 10) {
                                                                    var107 = field1005 * 10;
                                                                }
                                                                if (var107 > var105.field2667 - var105.field2659 - var105.field2765) {
                                                                    var107 = var105.field2667 - var105.field2659 - var105.field2765;
                                                                }
                                                                var105.field2765 += var107;
                                                                field1132 -= var107;
                                                                method578(var105);
                                                            }
                                                        }
                                                    } else if (Statics.field883 == var10 && field1027 == var94) {
                                                        var102.method4827(var97, var98, 128);
                                                    } else {
                                                        var102.method4822(var97, var98);
                                                    }
                                                }
                                            } else if (var10.field2657 != null && var94 < 20) {
                                                class287 var108 = var10.method3787(var94);
                                                if (var108 != null) {
                                                    var108.method4822(var97, var98);
                                                } else if (class217.field2641) {
                                                    method578(var10);
                                                }
                                            }
                                            var94++;
                                        }
                                    }
                                } else if (var10.field2645 == 3) {
                                    int var109;
                                    if (method3(var10)) {
                                        var109 = var10.field2669;
                                        if (Statics.field3622 == var10 && var10.field2671 != 0) {
                                            var109 = var10.field2671;
                                        }
                                    } else {
                                        var109 = var10.field2668;
                                        if (Statics.field3622 == var10 && var10.field2670 != 0) {
                                            var109 = var10.field2670;
                                        }
                                    }
                                    if (var10.field2672) {
                                        switch(var10.field2673.field3784) {
                                            case 1:
                                                class283.method4770(var12, var13, var10.field2658, var10.field2659, var10.field2668, var10.field2669, 256 - (var10.field2769 & 0xFF), 256 - (var10.field2675 & 0xFF));
                                                break;
                                            case 2:
                                                class283.method4734(var12, var13, var10.field2658, var10.field2659, var10.field2668, var10.field2669, 256 - (var10.field2769 & 0xFF), 256 - (var10.field2675 & 0xFF));
                                                break;
                                            case 3:
                                                class283.method4735(var12, var13, var10.field2658, var10.field2659, var10.field2668, var10.field2669, 256 - (var10.field2769 & 0xFF), 256 - (var10.field2675 & 0xFF));
                                                break;
                                            case 4:
                                                class283.method4707(var12, var13, var10.field2658, var10.field2659, var10.field2668, var10.field2669, 256 - (var10.field2769 & 0xFF), 256 - (var10.field2675 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class283.method4704(var12, var13, var10.field2658, var10.field2659, var109);
                                                } else {
                                                    class283.method4703(var12, var13, var10.field2658, var10.field2659, var109, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class283.method4741(var12, var13, var10.field2658, var10.field2659, var109);
                                    } else {
                                        class283.method4697(var12, var13, var10.field2658, var10.field2659, var109, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2645 == 4) {
                                    class264 var110 = var10.method3779();
                                    if (var110 != null) {
                                        String var111 = var10.field2703;
                                        int var112;
                                        if (method3(var10)) {
                                            var112 = var10.field2669;
                                            if (Statics.field3622 == var10 && var10.field2671 != 0) {
                                                var112 = var10.field2671;
                                            }
                                            if (var10.field2730.length() > 0) {
                                                var111 = var10.field2730;
                                            }
                                        } else {
                                            var112 = var10.field2668;
                                            if (Statics.field3622 == var10 && var10.field2670 != 0) {
                                                var112 = var10.field2670;
                                            }
                                        }
                                        if (var10.field2642 && var10.field2763 != -1) {
                                            class257 var113 = class257.method2694(var10.field2763);
                                            var111 = var113.field3499;
                                            if (var111 == null) {
                                                var111 = "null";
                                            }
                                            if ((var113.field3510 == 1 || var10.field2764 != 1) && var10.field2764 != -1) {
                                                var111 = class87.method166(16748608) + var111 + class87.field1385 + " " + 'x' + method149(var10.field2764);
                                            }
                                        }
                                        if (field1079 == var10) {
                                            class226 var10000 = (class226) null;
                                            var111 = class226.field3009;
                                            var112 = var10.field2668;
                                        }
                                        if (!var10.field2642) {
                                            var111 = method3987(var111, var10);
                                        }
                                        var110.method4574(var111, var12, var13, var10.field2658, var10.field2659, var112, var10.field2708 ? 0 : -1, var10.field2706, var10.field2707, var10.field2705);
                                    } else if (class217.field2641) {
                                        method578(var10);
                                    }
                                } else if (var10.field2645 == 5) {
                                    if (var10.field2642) {
                                        class287 var115;
                                        if (var10.field2763 == -1) {
                                            var115 = var10.method3793(false);
                                        } else {
                                            var115 = class257.method1410(var10.field2763, var10.field2764, var10.field2682, var10.field2683, var10.field2760, false);
                                        }
                                        if (var115 != null) {
                                            int var116 = var115.field3799;
                                            int var117 = var115.field3800;
                                            if (var10.field2728) {
                                                class283.method4708(var12, var13, var10.field2658 + var12, var10.field2659 + var13);
                                                int var118 = (var10.field2658 + (var116 - 1)) / var116;
                                                int var119 = (var10.field2659 + (var117 - 1)) / var117;
                                                for (int var120 = 0; var120 < var118; var120++) {
                                                    for (int var121 = 0; var121 < var119; var121++) {
                                                        if (var10.field2680 != 0) {
                                                            var115.method4828(var116 / 2 + var116 * var120 + var12, var117 / 2 + var117 * var121 + var13, var10.field2680, 4096);
                                                        } else if (var14 == 0) {
                                                            var115.method4822(var116 * var120 + var12, var117 * var121 + var13);
                                                        } else {
                                                            var115.method4827(var116 * var120 + var12, var117 * var121 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class283.method4723(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var122 = var10.field2658 * 4096 / var116;
                                                if (var10.field2680 != 0) {
                                                    var115.method4828(var10.field2658 / 2 + var12, var10.field2659 / 2 + var13, var10.field2680, var122);
                                                } else if (var14 != 0) {
                                                    var115.method4829(var12, var13, var10.field2658, var10.field2659, 256 - (var14 & 0xFF));
                                                } else if (var10.field2658 == var116 && var10.field2659 == var117) {
                                                    var115.method4822(var12, var13);
                                                } else {
                                                    var115.method4879(var12, var13, var10.field2658, var10.field2659);
                                                }
                                            }
                                        } else if (class217.field2641) {
                                            method578(var10);
                                        }
                                    } else {
                                        class287 var114 = var10.method3793(method3(var10));
                                        if (var114 != null) {
                                            var114.method4822(var12, var13);
                                        } else if (class217.field2641) {
                                            method578(var10);
                                        }
                                    }
                                } else if (var10.field2645 == 6) {
                                    boolean var123 = method3(var10);
                                    int var124;
                                    if (var123) {
                                        var124 = var10.field2691;
                                    } else {
                                        var124 = var10.field2712;
                                    }
                                    class132 var125 = null;
                                    int var126 = 0;
                                    if (var10.field2763 != -1) {
                                        class257 var127 = class257.method2694(var10.field2763);
                                        if (var127 != null) {
                                            class257 var128 = var127.method4332(var10.field2764);
                                            var125 = var128.method4353(1);
                                            if (var125 == null) {
                                                method578(var10);
                                            } else {
                                                var125.method2358();
                                                var126 = var125.field2103 / 2;
                                            }
                                        }
                                    } else if (var10.field2774 == 5) {
                                        if (var10.field2687 == 0) {
                                            var125 = field1186.method3738((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var125 = Statics.field832.method1030();
                                        }
                                    } else if (var124 == -1) {
                                        var125 = var10.method3781((class261) null, -1, var123, Statics.field832.field888);
                                        if (var125 == null && class217.field2641) {
                                            method578(var10);
                                        }
                                    } else {
                                        class261 var129 = class261.method4424(var124);
                                        var125 = var10.method3781(var129, var10.field2681, var123, Statics.field832.field888);
                                        if (var125 == null && class217.field2641) {
                                            method578(var10);
                                        }
                                    }
                                    class135.method2444(var10.field2658 / 2 + var12, var10.field2659 / 2 + var13);
                                    int var130 = var10.field2731 * class135.field2024[var10.field2694] >> 16;
                                    int var131 = var10.field2731 * class135.field2025[var10.field2694] >> 16;
                                    if (var125 != null) {
                                        if (var10.field2642) {
                                            var125.method2358();
                                            if (var10.field2700) {
                                                var125.method2376(0, var10.field2695, var10.field2696, var10.field2694, var10.field2738, var10.field2693 + var126 + var130, var10.field2693 + var131, var10.field2731);
                                            } else {
                                                var125.method2371(0, var10.field2695, var10.field2696, var10.field2694, var10.field2738, var10.field2693 + var126 + var130, var10.field2693 + var131);
                                            }
                                        } else {
                                            var125.method2371(0, var10.field2695, 0, var10.field2694, 0, var130, var131);
                                        }
                                    }
                                    class135.method2496();
                                } else {
                                    if (var10.field2645 == 7) {
                                        class264 var132 = var10.method3779();
                                        if (var132 == null) {
                                            if (class217.field2641) {
                                                method578(var10);
                                            }
                                            continue;
                                        }
                                        int var133 = 0;
                                        for (int var134 = 0; var134 < var10.field2655; var134++) {
                                            for (int var135 = 0; var135 < var10.field2654; var135++) {
                                                if (var10.field2761[var133] > 0) {
                                                    class257 var136 = class257.method2694(var10.field2761[var133] - 1);
                                                    String var137;
                                                    if (var136.field3510 != 1 && var10.field2637[var133] == 1) {
                                                        var137 = class87.method166(16748608) + var136.field3499 + class87.field1385;
                                                    } else {
                                                        var137 = class87.method166(16748608) + var136.field3499 + class87.field1385 + " " + 'x' + method149(var10.field2637[var133]);
                                                    }
                                                    int var138 = (var10.field2709 + 115) * var135 + var12;
                                                    int var139 = (var10.field2651 + 12) * var134 + var13;
                                                    if (var10.field2706 == 0) {
                                                        var132.method4508(var137, var138, var139, var10.field2668, var10.field2708 ? 0 : -1);
                                                    } else if (var10.field2706 == 1) {
                                                        var132.method4511(var137, var10.field2658 / 2 + var138, var139, var10.field2668, var10.field2708 ? 0 : -1);
                                                    } else {
                                                        var132.method4510(var137, var10.field2658 + var138 - 1, var139, var10.field2668, var10.field2708 ? 0 : -1);
                                                    }
                                                }
                                                var133++;
                                            }
                                        }
                                    }
                                    if (var10.field2645 == 8 && Statics.field2304 == var10 && field1067 == field1066) {
                                        int var140 = 0;
                                        int var141 = 0;
                                        class264 var142 = Statics.field260;
                                        String var143 = var10.field2703;
                                        String var144 = method3987(var143, var10);
                                        while (var144.length() > 0) {
                                            int var145 = var144.indexOf(class87.field1384);
                                            String var146;
                                            if (var145 == -1) {
                                                var146 = var144;
                                                var144 = "";
                                            } else {
                                                var146 = var144.substring(0, var145);
                                                var144 = var144.substring(var145 + 4);
                                            }
                                            int var147 = var142.method4514(var146);
                                            if (var147 > var140) {
                                                var140 = var147;
                                            }
                                            var141 += var142.field3646 + 1;
                                        }
                                        var140 += 6;
                                        var141 += 7;
                                        int var148 = var10.field2658 + var12 - 5 - var140;
                                        int var149 = var10.field2659 + var13 + 5;
                                        if (var148 < var12 + 5) {
                                            var148 = var12 + 5;
                                        }
                                        if (var140 + var148 > arg4) {
                                            var148 = arg4 - var140;
                                        }
                                        if (var141 + var149 > arg5) {
                                            var149 = arg5 - var141;
                                        }
                                        class283.method4704(var148, var149, var140, var141, 16777120);
                                        class283.method4741(var148, var149, var140, var141, 0);
                                        String var150 = var10.field2703;
                                        int var151 = var142.field3646 + var149 + 2;
                                        String var152 = method3987(var150, var10);
                                        while (var152.length() > 0) {
                                            int var153 = var152.indexOf(class87.field1384);
                                            String var154;
                                            if (var153 == -1) {
                                                var154 = var152;
                                                var152 = "";
                                            } else {
                                                var154 = var152.substring(0, var153);
                                                var152 = var152.substring(var153 + 4);
                                            }
                                            var142.method4508(var154, var148 + 3, var151, 0, -1);
                                            var151 += var142.field3646 + 1;
                                        }
                                    }
                                    if (var10.field2645 == 9) {
                                        int var155;
                                        int var156;
                                        int var157;
                                        int var158;
                                        if (var10.field2677) {
                                            var155 = var12;
                                            var156 = var10.field2659 + var13;
                                            var157 = var10.field2658 + var12;
                                            var158 = var13;
                                        } else {
                                            var155 = var12;
                                            var156 = var13;
                                            var157 = var10.field2658 + var12;
                                            var158 = var10.field2659 + var13;
                                        }
                                        if (var10.field2746 == 1) {
                                            class283.method4716(var155, var156, var157, var158, var10.field2668);
                                        } else {
                                            method998(var155, var156, var157, var158, var10.field2668, var10.field2746);
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

    @ObfuscatedName("bo.ig(IIIIIII)V")
    public static final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class283.field3768;
        int var18 = arg1 - class283.field3771;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class135.method2449(var19, var20, var21);
        class135.method2452(var23, var24, var25, var19, var20, var21, arg4);
        class135.method2449(var19, var21, var22);
        class135.method2452(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("ih.ij(Ljava/lang/String;Lhj;I)Ljava/lang/String;")
    public static String method3987(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1409(method45(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field610 != null) {
                    int var6 = Statics.field610.field2223;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field610.field2225 != null) {
                        var5 = (String) Statics.field610.field2225;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("c.iu(II)Ljava/lang/String;")
    public static final String method149(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class87.field1382 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class87.method166(65408) + var1.substring(0, var1.length() - 8) + class226.field3012 + " " + class87.field1381 + var1 + class87.field1379 + class87.field1385;
        } else if (var1.length() > 6) {
            return " " + class87.method166(16777215) + var1.substring(0, var1.length() - 4) + class226.field3014 + " " + class87.field1381 + var1 + class87.field1379 + class87.field1385;
        } else {
            return " " + class87.method166(16776960) + var1 + class87.field1385;
        }
    }

    @ObfuscatedName("client.il(ZI)V")
    public final void method1068(boolean arg0) {
        method4480(field1075, Statics.field2255, Statics.field722, arg0);
    }

    @ObfuscatedName("client.id(Lhj;I)V")
    public void method1069(class217 arg0) {
        class217 var2 = arg0.field2701 == -1 ? null : class217.method2254(arg0.field2701);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2255;
            var4 = Statics.field722;
        } else {
            var3 = var2.field2658;
            var4 = var2.field2659;
        }
        method978(arg0, var3, var4, false);
        method1951(arg0, var3, var4);
    }

    @ObfuscatedName("fn.iq([Lhj;Lhj;ZI)V")
    public static void method2910(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2740 == 0 ? arg1.field2658 : arg1.field2740;
        int var4 = arg1.field2667 == 0 ? arg1.field2659 : arg1.field2667;
        method545(arg0, arg1.field2643, var3, var4, arg2);
        if (arg1.field2767 != null) {
            method545(arg1.field2767, arg1.field2643, var3, var4, arg2);
        }
        class68 var5 = (class68) field974.method3387((long) arg1.field2643);
        if (var5 != null) {
            method4480(var5.field837, var3, var4, arg2);
        }
        if (arg1.field2647 == 1337) {
        }
    }

    @ObfuscatedName("jz.iw(IIIZB)V")
    public static final void method4480(int arg0, int arg1, int arg2, boolean arg3) {
        if (class217.method263(arg0)) {
            method545(Statics.field2629[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("am.iz([Lhj;IIIZI)V")
    public static void method545(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2701 == arg1) {
                method978(var6, arg2, arg3, arg4);
                method1951(var6, arg2, arg3);
                if (var6.field2664 > var6.field2740 - var6.field2658) {
                    var6.field2664 = var6.field2740 - var6.field2658;
                }
                if (var6.field2664 < 0) {
                    var6.field2664 = 0;
                }
                if (var6.field2765 > var6.field2667 - var6.field2659) {
                    var6.field2765 = var6.field2667 - var6.field2659;
                }
                if (var6.field2765 < 0) {
                    var6.field2765 = 0;
                }
                if (var6.field2645 == 0) {
                    method2910(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bn.ix(Lhj;IIZI)V")
    public static void method978(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2658;
        int var5 = arg0.field2659;
        if (arg0.field2650 == 0) {
            arg0.field2658 = arg0.field2654;
        } else if (arg0.field2650 == 1) {
            arg0.field2658 = arg1 - arg0.field2654;
        } else if (arg0.field2650 == 2) {
            arg0.field2658 = arg0.field2654 * arg1 >> 14;
        }
        if (arg0.field2777 == 0) {
            arg0.field2659 = arg0.field2655;
        } else if (arg0.field2777 == 1) {
            arg0.field2659 = arg2 - arg0.field2655;
        } else if (arg0.field2777 == 2) {
            arg0.field2659 = arg0.field2655 * arg2 >> 14;
        }
        if (arg0.field2650 == 4) {
            arg0.field2658 = arg0.field2697 * arg0.field2659 / arg0.field2661;
        }
        if (arg0.field2777 == 4) {
            arg0.field2659 = arg0.field2661 * arg0.field2658 / arg0.field2697;
        }
        if (field1085 && arg0.field2645 == 0) {
            if (arg0.field2659 < 5 && arg0.field2658 < 5) {
                arg0.field2659 = 5;
                arg0.field2658 = 5;
            } else {
                if (arg0.field2659 <= 0) {
                    arg0.field2659 = 5;
                }
                if (arg0.field2658 <= 0) {
                    arg0.field2658 = 5;
                }
            }
        }
        if (arg0.field2647 == 1337) {
            field1087 = arg0;
        }
        if (arg3 && arg0.field2662 != null && (arg0.field2658 != var4 || arg0.field2659 != var5)) {
            class69 var6 = new class69();
            var6.field851 = arg0;
            var6.field850 = arg0.field2662;
            field1114.method3429(var6);
        }
    }

    @ObfuscatedName("dk.ib(Lhj;III)V")
    public static void method1951(class217 arg0, int arg1, int arg2) {
        if (arg0.field2648 == 0) {
            arg0.field2656 = arg0.field2652;
        } else if (arg0.field2648 == 1) {
            arg0.field2656 = (arg1 - arg0.field2658) / 2 + arg0.field2652;
        } else if (arg0.field2648 == 2) {
            arg0.field2656 = arg1 - arg0.field2658 - arg0.field2652;
        } else if (arg0.field2648 == 3) {
            arg0.field2656 = arg0.field2652 * arg1 >> 14;
        } else if (arg0.field2648 == 4) {
            arg0.field2656 = (arg0.field2652 * arg1 >> 14) + (arg1 - arg0.field2658) / 2;
        } else {
            arg0.field2656 = arg1 - arg0.field2658 - (arg0.field2652 * arg1 >> 14);
        }
        if (arg0.field2733 == 0) {
            arg0.field2674 = arg0.field2653;
        } else if (arg0.field2733 == 1) {
            arg0.field2674 = (arg2 - arg0.field2659) / 2 + arg0.field2653;
        } else if (arg0.field2733 == 2) {
            arg0.field2674 = arg2 - arg0.field2659 - arg0.field2653;
        } else if (arg0.field2733 == 3) {
            arg0.field2674 = arg0.field2653 * arg2 >> 14;
        } else if (arg0.field2733 == 4) {
            arg0.field2674 = (arg0.field2653 * arg2 >> 14) + (arg2 - arg0.field2659) / 2;
        } else {
            arg0.field2674 = arg2 - arg0.field2659 - (arg0.field2653 * arg2 >> 14);
        }
        if (!field1085 || arg0.field2645 != 0) {
            return;
        }
        if (arg0.field2656 < 0) {
            arg0.field2656 = 0;
        } else if (arg0.field2658 + arg0.field2656 > arg1) {
            arg0.field2656 = arg1 - arg0.field2658;
        }
        if (arg0.field2674 < 0) {
            arg0.field2674 = 0;
        } else if (arg0.field2674 + arg0.field2659 > arg2) {
            arg0.field2674 = arg2 - arg0.field2659;
        }
    }

    @ObfuscatedName("client.io(II)Ljava/lang/String;")
    public static final String method1409(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("q.ir(Lhj;B)Z")
    public static final boolean method3(class217 arg0) {
        if (arg0.field2762 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2762.length; var1++) {
            int var2 = method45(arg0, var1);
            int var3 = arg0.field2757[var1];
            if (arg0.field2762[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2762[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2762[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("x.iy(Lhj;II)I")
    public static final int method45(class217 arg0, int arg1) {
        if (arg0.field2635 == null || arg1 >= arg0.field2635.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2635[arg1];
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
                    var7 = field1049[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field944[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1051[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method2254(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class257.method2694(var12).field3512 || field1105)) {
                        for (int var13 = 0; var13 < var11.field2761.length; var13++) {
                            if (var12 + 1 == var11.field2761[var13]) {
                                var7 += var11.field2637[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2599[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2827[field944[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2599[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field832.field911;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2828[var14]) {
                            var7 += field944[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method2254(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class257.method2694(var18).field3512 || field1105)) {
                        for (int var19 = 0; var19 < var17.field2761.length; var19++) {
                            if (var18 + 1 == var17.field2761[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1076;
                }
                if (var6 == 12) {
                    var7 = field948;
                }
                if (var6 == 13) {
                    int var20 = class212.field2599[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method1604(var22);
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
                    var7 = (Statics.field832.field1225 >> 7) + Statics.field352;
                }
                if (var6 == 19) {
                    var7 = (Statics.field832.field1211 >> 7) + Statics.field3706;
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

    @ObfuscatedName("ha.ik(Lhj;Lii;IIZB)V")
    public static final void method3854(class217 arg0, class257 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3514;
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
            var7 = class226.field2853;
        }
        if (var6 != -1 && var7 != null) {
            method2695(var7, class87.method166(16748608) + arg1.field3499, var6, arg1.field3497, arg2, arg0.field2643, arg4);
        }
    }

    @ObfuscatedName("bs.ie(Lhj;IIB)V")
    public static final void method726(class217 arg0, int arg1, int arg2) {
        if (arg0.field2713 == 1) {
            method3771(arg0.field2776, "", 24, 0, 0, arg0.field2643);
        }
        if (arg0.field2713 == 2 && !field1100) {
            int var3 = method177(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2631 == null || arg0.field2631.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2631;
            }
            if (var5 != null) {
                method3771(var5, class87.method166(65280) + arg0.field2684, 25, 0, -1, arg0.field2643);
            }
        }
        if (arg0.field2713 == 3) {
            method3771(class226.field3010, "", 26, 0, 0, arg0.field2643);
        }
        if (arg0.field2713 == 4) {
            method3771(arg0.field2776, "", 28, 0, 0, arg0.field2643);
        }
        if (arg0.field2713 == 5) {
            method3771(arg0.field2776, "", 29, 0, 0, arg0.field2643);
        }
        if (arg0.field2713 == 6 && field1079 == null) {
            method3771(arg0.field2776, "", 30, 0, -1, arg0.field2643);
        }
        if (arg0.field2645 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2659; var8++) {
                for (int var9 = 0; var9 < arg0.field2658; var9++) {
                    int var10 = (arg0.field2709 + 32) * var9;
                    int var11 = (arg0.field2651 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2711[var7];
                        var11 += arg0.field2702[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field1178 = var7;
                        Statics.field1499 = arg0;
                        if (arg0.field2761[var7] > 0) {
                            label352: {
                                class257 var12 = class257.method2694(arg0.field2761[var7] - 1);
                                if (field1068 == 1) {
                                    int var13 = method177(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if (Statics.field916 != arg0.field2643 || Statics.field45 != var7) {
                                            method3771(class226.field3001, field1069 + " " + class87.field1383 + " " + class87.method166(16748608) + var12.field3499, 31, var12.field3497, var7, arg0.field2643);
                                        }
                                        break label352;
                                    }
                                }
                                if (field1100) {
                                    int var15 = method177(arg0);
                                    boolean var16 = (var15 >> 30 & 0x1) != 0;
                                    if (var16) {
                                        if ((Statics.field1422 & 0x10) == 16) {
                                            method3771(field1073, field1088 + " " + class87.field1383 + " " + class87.method166(16748608) + var12.field3499, 32, var12.field3497, var7, arg0.field2643);
                                        }
                                        break label352;
                                    }
                                }
                                String[] var17 = var12.field3514;
                                if (field1086) {
                                    String[] var18 = method40(var17);
                                }
                                int var19 = -1;
                                if (field962 && class51.field660[81]) {
                                    var19 = var12.method4339();
                                }
                                int var20 = method177(arg0);
                                boolean var21 = (var20 >> 30 & 0x1) != 0;
                                if (var21) {
                                    for (int var22 = 4; var22 >= 3; var22--) {
                                        if (var19 != var22) {
                                            method3854(arg0, var12, var7, var22, false);
                                        }
                                    }
                                }
                                class218 var10000 = (class218) null;
                                if (class218.method202(method177(arg0))) {
                                    method3771(class226.field3001, class87.method166(16748608) + var12.field3499, 38, var12.field3497, var7, arg0.field2643);
                                }
                                int var23 = method177(arg0);
                                boolean var24 = (var23 >> 30 & 0x1) != 0;
                                if (var24) {
                                    for (int var25 = 2; var25 >= 0; var25--) {
                                        if (var19 != var25) {
                                            method3854(arg0, var12, var7, var25, false);
                                        }
                                    }
                                    if (var19 >= 0) {
                                        method3854(arg0, var12, var7, var19, true);
                                    }
                                }
                                String[] var26 = arg0.field2758;
                                if (field1086) {
                                    var26 = method40(var26);
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
                                            method3771(var26[var27], class87.method166(16748608) + var12.field3499, var28, var12.field3497, var7, arg0.field2643);
                                        }
                                    }
                                }
                                method3771(class226.field3002, class87.method166(16748608) + var12.field3499, 1005, var12.field3497, var7, arg0.field2643);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2642) {
            return;
        }
        if (field1100) {
            int var29 = method177(arg0);
            boolean var30 = (var29 >> 21 & 0x1) != 0;
            if (var30 && (Statics.field1422 & 0x20) == 32) {
                method3771(field1073, field1088 + " " + class87.field1383 + " " + arg0.field2716, 58, 0, arg0.field2644, arg0.field2643);
            }
            return;
        }
        for (int var31 = 9; var31 >= 5; var31--) {
            int var32 = method177(arg0);
            boolean var33 = (var32 >> var31 + 1 & 0x1) != 0;
            String var34;
            if (!var33 && arg0.field2743 == null) {
                var34 = null;
            } else if (arg0.field2717 == null || arg0.field2717.length <= var31 || arg0.field2717[var31] == null || arg0.field2717[var31].trim().length() == 0) {
                var34 = null;
            } else {
                var34 = arg0.field2717[var31];
            }
            if (var34 != null) {
                method3771(var34, arg0.field2716, 1007, var31 + 1, arg0.field2644, arg0.field2643);
            }
        }
        int var36 = method177(arg0);
        int var37 = var36 >> 11 & 0x3F;
        String var38;
        if (var37 == 0) {
            var38 = null;
        } else if (arg0.field2631 == null || arg0.field2631.trim().length() == 0) {
            var38 = null;
        } else {
            var38 = arg0.field2631;
        }
        if (var38 != null) {
            method3771(var38, arg0.field2716, 25, 0, arg0.field2644, arg0.field2643);
        }
        for (int var40 = 4; var40 >= 0; var40--) {
            int var41 = method177(arg0);
            boolean var42 = (var41 >> var40 + 1 & 0x1) != 0;
            String var43;
            if (!var42 && arg0.field2743 == null) {
                var43 = null;
            } else if (arg0.field2717 == null || arg0.field2717.length <= var40 || arg0.field2717[var40] == null || arg0.field2717[var40].trim().length() == 0) {
                var43 = null;
            } else {
                var43 = arg0.field2717[var40];
            }
            if (var43 != null) {
                method3771(var43, arg0.field2716, 57, var40 + 1, arg0.field2644, arg0.field2643);
            }
        }
        if (class218.method3855(method177(arg0))) {
            method3771(class226.field2977, "", 30, 0, arg0.field2644, arg0.field2643);
        }
    }

    @ObfuscatedName("ci.in(IIIIIIII)V")
    public static final void method1764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class217.method263(arg0)) {
            method3834(Statics.field2629[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("hf.ic([Lhj;IIIIIIII)V")
    public static final void method3834(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2642 || var9.field2645 == 0 || var9.field2723 || method177(var9) != 0 || field961 == var9 || var9.field2647 == 1338) && var9.field2701 == arg1 && (!var9.field2642 || !method1010(var9))) {
                int var10 = var9.field2656 + arg6;
                int var11 = var9.field2674 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2645 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2645 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2658 + var10;
                    int var19 = var9.field2659 + var11;
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
                    int var22 = var9.field2658 + var10;
                    int var23 = var9.field2659 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1159 == var9) {
                    field1154 = true;
                    field1097 = var10;
                    field1098 = var11;
                }
                if (!var9.field2642 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field757;
                    int var25 = class60.field742;
                    if (class60.field744 != 0) {
                        var24 = class60.field758;
                        var25 = class60.field759;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2647 == 1337) {
                        if (!field932 && !field1053 && var26) {
                            method1600(var24, var25, var12, var13);
                        }
                    } else if (var9.field2647 != 1338) {
                        if (var9.field2647 == 1400) {
                            Statics.field1193.method5131(class60.field757, class60.field742, var26, var10, var11, var9.field2658, var9.field2659);
                        }
                        if (!field1053 && var26) {
                            if (var9.field2647 == 1400) {
                                Statics.field1193.method5090(var10, var11, var9.field2658, var9.field2659, var24, var25);
                            } else {
                                method726(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2645 == 0) {
                            if (!var9.field2642 && method1010(var9) && Statics.field3622 != var9) {
                                continue;
                            }
                            method3834(arg0, var9.field2643, var12, var13, var14, var15, var10 - var9.field2664, var11 - var9.field2765);
                            if (var9.field2767 != null) {
                                method3834(var9.field2767, var9.field2643, var12, var13, var14, var15, var10 - var9.field2664, var11 - var9.field2765);
                            }
                            class68 var39 = (class68) field974.method3387((long) var9.field2643);
                            if (var39 != null) {
                                if (var39.field836 == 0 && class60.field757 >= var12 && class60.field742 >= var13 && class60.field757 < var14 && class60.field742 < var15 && !field1053 && !field1085) {
                                    for (class69 var40 = (class69) field1114.method3427(); var40 != null; var40 = (class69) field1114.method3435()) {
                                        if (var40.field847) {
                                            var40.method3425();
                                            var40.field851.field2768 = false;
                                        }
                                    }
                                    if (Statics.field555 == 0) {
                                        field1159 = null;
                                        field961 = null;
                                    }
                                    if (!field1053) {
                                        method546();
                                    }
                                }
                                method1764(var39.field837, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2642) {
                            if (var9.field2660) {
                                if (class60.field757 >= var12 && class60.field742 >= var13 && class60.field757 < var14 && class60.field742 < var15) {
                                    for (class69 var41 = (class69) field1114.method3427(); var41 != null; var41 = (class69) field1114.method3435()) {
                                        if (var41.field847) {
                                            var41.method3425();
                                            var41.field851.field2768 = false;
                                        }
                                    }
                                    if (Statics.field555 == 0) {
                                        field1159 = null;
                                        field961 = null;
                                    }
                                    if (!field1053) {
                                        method546();
                                    }
                                }
                            } else if (var9.field2699 && class60.field757 >= var12 && class60.field742 >= var13 && class60.field757 < var14 && class60.field742 < var15) {
                                for (class69 var42 = (class69) field1114.method3427(); var42 != null; var42 = (class69) field1114.method3435()) {
                                    if (var42.field847 && var42.field851.field2744 == var42.field850) {
                                        var42.method3425();
                                    }
                                }
                            }
                            boolean var43;
                            if (class60.field757 >= var12 && class60.field742 >= var13 && class60.field757 < var14 && class60.field742 < var15) {
                                var43 = true;
                            } else {
                                var43 = false;
                            }
                            boolean var44 = false;
                            if ((class60.field751 == 1 || !Statics.field245 && class60.field751 == 4) && var43) {
                                var44 = true;
                            }
                            boolean var45 = false;
                            if ((class60.field744 == 1 || !Statics.field245 && class60.field744 == 4) && class60.field758 >= var12 && class60.field759 >= var13 && class60.field758 < var14 && class60.field759 < var15) {
                                var45 = true;
                            }
                            if (var45) {
                                method1589(var9, class60.field758 - var10, class60.field759 - var11);
                            }
                            if (var9.field2647 == 1400) {
                                Statics.field1193.method4945(class60.field757, class60.field742, var43 & var44, var43 & var45);
                            }
                            if (field1159 != null && field1159 != var9 && var43) {
                                int var46 = method177(var9);
                                boolean var47 = (var46 >> 20 & 0x1) != 0;
                                if (var47) {
                                    field1092 = var9;
                                }
                            }
                            if (field961 == var9) {
                                field1184 = true;
                                field1094 = var10;
                                field1095 = var11;
                            }
                            if (var9.field2723) {
                                if (var43 && field1113 != 0 && var9.field2744 != null) {
                                    class69 var48 = new class69();
                                    var48.field847 = true;
                                    var48.field851 = var9;
                                    var48.field849 = field1113;
                                    var48.field850 = var9.field2744;
                                    field1114.method3429(var48);
                                }
                                if (field1159 != null || Statics.field788 != null || field1053) {
                                    var45 = false;
                                    var44 = false;
                                    var43 = false;
                                }
                                if (!var9.field2710 && var45) {
                                    var9.field2710 = true;
                                    if (var9.field2725 != null) {
                                        class69 var49 = new class69();
                                        var49.field847 = true;
                                        var49.field851 = var9;
                                        var49.field848 = class60.field758 - var10;
                                        var49.field849 = class60.field759 - var11;
                                        var49.field850 = var9.field2725;
                                        field1114.method3429(var49);
                                    }
                                }
                                if (var9.field2710 && var44 && var9.field2636 != null) {
                                    class69 var50 = new class69();
                                    var50.field847 = true;
                                    var50.field851 = var9;
                                    var50.field848 = class60.field757 - var10;
                                    var50.field849 = class60.field742 - var11;
                                    var50.field850 = var9.field2636;
                                    field1114.method3429(var50);
                                }
                                if (var9.field2710 && !var44) {
                                    var9.field2710 = false;
                                    if (var9.field2722 != null) {
                                        class69 var51 = new class69();
                                        var51.field847 = true;
                                        var51.field851 = var9;
                                        var51.field848 = class60.field757 - var10;
                                        var51.field849 = class60.field742 - var11;
                                        var51.field850 = var9.field2722;
                                        field1116.method3429(var51);
                                    }
                                }
                                if (var44 && var9.field2646 != null) {
                                    class69 var52 = new class69();
                                    var52.field847 = true;
                                    var52.field851 = var9;
                                    var52.field848 = class60.field757 - var10;
                                    var52.field849 = class60.field742 - var11;
                                    var52.field850 = var9.field2646;
                                    field1114.method3429(var52);
                                }
                                if (!var9.field2768 && var43) {
                                    var9.field2768 = true;
                                    if (var9.field2729 != null) {
                                        class69 var53 = new class69();
                                        var53.field847 = true;
                                        var53.field851 = var9;
                                        var53.field848 = class60.field757 - var10;
                                        var53.field849 = class60.field742 - var11;
                                        var53.field850 = var9.field2729;
                                        field1114.method3429(var53);
                                    }
                                }
                                if (var9.field2768 && var43 && var9.field2726 != null) {
                                    class69 var54 = new class69();
                                    var54.field847 = true;
                                    var54.field851 = var9;
                                    var54.field848 = class60.field757 - var10;
                                    var54.field849 = class60.field742 - var11;
                                    var54.field850 = var9.field2726;
                                    field1114.method3429(var54);
                                }
                                if (var9.field2768 && !var43) {
                                    var9.field2768 = false;
                                    if (var9.field2735 != null) {
                                        class69 var55 = new class69();
                                        var55.field847 = true;
                                        var55.field851 = var9;
                                        var55.field848 = class60.field757 - var10;
                                        var55.field849 = class60.field742 - var11;
                                        var55.field850 = var9.field2735;
                                        field1116.method3429(var55);
                                    }
                                }
                                if (var9.field2690 != null) {
                                    class69 var56 = new class69();
                                    var56.field851 = var9;
                                    var56.field850 = var9.field2690;
                                    field1172.method3429(var56);
                                }
                                if (var9.field2736 != null && field1000 > var9.field2771) {
                                    if (var9.field2737 == null || field1000 - var9.field2771 > 32) {
                                        class69 var61 = new class69();
                                        var61.field851 = var9;
                                        var61.field850 = var9.field2736;
                                        field1114.method3429(var61);
                                    } else {
                                        label589: for (int var57 = var9.field2771; var57 < field1000; var57++) {
                                            int var58 = field1101[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field2737.length; var59++) {
                                                if (var9.field2737[var59] == var58) {
                                                    class69 var60 = new class69();
                                                    var60.field851 = var9;
                                                    var60.field850 = var9.field2736;
                                                    field1114.method3429(var60);
                                                    break label589;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2771 = field1000;
                                }
                                if (var9.field2676 != null && field1104 > var9.field2649) {
                                    if (var9.field2739 == null || field1104 - var9.field2649 > 32) {
                                        class69 var66 = new class69();
                                        var66.field851 = var9;
                                        var66.field850 = var9.field2676;
                                        field1114.method3429(var66);
                                    } else {
                                        label565: for (int var62 = var9.field2649; var62 < field1104; var62++) {
                                            int var63 = field964[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field2739.length; var64++) {
                                                if (var9.field2739[var64] == var63) {
                                                    class69 var65 = new class69();
                                                    var65.field851 = var9;
                                                    var65.field850 = var9.field2676;
                                                    field1114.method3429(var65);
                                                    break label565;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2649 = field1104;
                                }
                                if (var9.field2752 != null && field1106 > var9.field2773) {
                                    if (var9.field2666 == null || field1106 - var9.field2773 > 32) {
                                        class69 var71 = new class69();
                                        var71.field851 = var9;
                                        var71.field850 = var9.field2752;
                                        field1114.method3429(var71);
                                    } else {
                                        label541: for (int var67 = var9.field2773; var67 < field1106; var67++) {
                                            int var68 = field937[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var9.field2666.length; var69++) {
                                                if (var9.field2666[var69] == var68) {
                                                    class69 var70 = new class69();
                                                    var70.field851 = var9;
                                                    var70.field850 = var9.field2752;
                                                    field1114.method3429(var70);
                                                    break label541;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2773 = field1106;
                                }
                                if (field1107 > var9.field2770 && var9.field2745 != null) {
                                    class69 var72 = new class69();
                                    var72.field851 = var9;
                                    var72.field850 = var9.field2745;
                                    field1114.method3429(var72);
                                }
                                if (field1192 > var9.field2770 && var9.field2704 != null) {
                                    class69 var73 = new class69();
                                    var73.field851 = var9;
                                    var73.field850 = var9.field2704;
                                    field1114.method3429(var73);
                                }
                                if (field1109 > var9.field2770 && var9.field2748 != null) {
                                    class69 var74 = new class69();
                                    var74.field851 = var9;
                                    var74.field850 = var9.field2748;
                                    field1114.method3429(var74);
                                }
                                if (field1110 > var9.field2770 && var9.field2638 != null) {
                                    class69 var75 = new class69();
                                    var75.field851 = var9;
                                    var75.field850 = var9.field2638;
                                    field1114.method3429(var75);
                                }
                                if (field1093 > var9.field2770 && var9.field2754 != null) {
                                    class69 var76 = new class69();
                                    var76.field851 = var9;
                                    var76.field850 = var9.field2754;
                                    field1114.method3429(var76);
                                }
                                if (field1112 > var9.field2770 && var9.field2749 != null) {
                                    class69 var77 = new class69();
                                    var77.field851 = var9;
                                    var77.field850 = var9.field2749;
                                    field1114.method3429(var77);
                                }
                                var9.field2770 = field1138;
                                if (var9.field2772 != null) {
                                    for (int var78 = 0; var78 < field1136; var78++) {
                                        class69 var79 = new class69();
                                        var79.field851 = var9;
                                        var79.field846 = field1016[var78];
                                        var79.field853 = field1096[var78];
                                        var79.field850 = var9.field2772;
                                        field1114.method3429(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field2642 && field1159 == null && Statics.field788 == null && !field1053) {
                            if ((var9.field2734 >= 0 || var9.field2670 != 0) && class60.field757 >= var12 && class60.field742 >= var13 && class60.field757 < var14 && class60.field742 < var15) {
                                if (var9.field2734 >= 0) {
                                    Statics.field3622 = arg0[var9.field2734];
                                } else {
                                    Statics.field3622 = var9;
                                }
                            }
                            if (var9.field2645 == 8 && class60.field757 >= var12 && class60.field742 >= var13 && class60.field757 < var14 && class60.field742 < var15) {
                                Statics.field2304 = var9;
                            }
                            if (var9.field2667 > var9.field2659) {
                                int var80 = var9.field2658 + var10;
                                int var81 = var9.field2659;
                                int var82 = var9.field2667;
                                int var83 = class60.field757;
                                int var84 = class60.field742;
                                if (field1133) {
                                    field997 = 32;
                                } else {
                                    field997 = 0;
                                }
                                field1133 = false;
                                if (class60.field751 == 1 || !Statics.field245 && class60.field751 == 4) {
                                    if (var83 >= var80 && var83 < var80 + 16 && var84 >= var11 && var84 < var11 + 16) {
                                        var9.field2765 -= 4;
                                        method578(var9);
                                    } else if (var83 >= var80 && var83 < var80 + 16 && var84 >= var11 + var81 - 16 && var84 < var11 + var81) {
                                        var9.field2765 += 4;
                                        method578(var9);
                                    } else if (var83 >= var80 - field997 && var83 < field997 + var80 + 16 && var84 >= var11 + 16 && var84 < var11 + var81 - 16) {
                                        int var85 = (var81 - 32) * var81 / var82;
                                        if (var85 < 8) {
                                            var85 = 8;
                                        }
                                        int var86 = var84 - var11 - 16 - var85 / 2;
                                        int var87 = var81 - 32 - var85;
                                        var9.field2765 = (var82 - var81) * var86 / var87;
                                        method578(var9);
                                        field1133 = true;
                                    }
                                }
                                if (field1113 != 0) {
                                    int var88 = var9.field2658;
                                    if (var83 >= var80 - var88 && var84 >= var11 && var83 < var80 + 16 && var84 <= var11 + var81) {
                                        var9.field2765 += field1113 * 45;
                                        method578(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field1149 == 0 || field1149 == 3) && (class60.field744 == 1 || !Statics.field245 && class60.field744 == 4)) {
                        class211 var27 = var9.method3782(true);
                        if (var27 != null) {
                            int var28 = class60.field758 - var10;
                            int var29 = class60.field759 - var11;
                            if (var27.method3707(var28, var29)) {
                                int var30 = var28 - var27.field2590 / 2;
                                int var31 = var29 - var27.field2593 / 2;
                                int var32 = field1156 & 0x7FF;
                                int var33 = class135.field2024[var32];
                                int var34 = class135.field2025[var32];
                                int var35 = var30 * var34 + var31 * var33 >> 11;
                                int var36 = var31 * var34 - var30 * var33 >> 11;
                                int var37 = Statics.field832.field1225 + var35 >> 7;
                                int var38 = Statics.field832.field1211 - var36 >> 7;
                                field968.method3236(133);
                                field968.method2955(18);
                                field968.method2955(class51.field660[82] ? (class51.field660[81] ? 2 : 1) : 0);
                                field968.method2957(Statics.field3706 + var38);
                                field968.method3093(Statics.field352 + var37);
                                field968.method2955(var30);
                                field968.method2955(var31);
                                field968.method2956(field1156);
                                field968.method2955(57);
                                field968.method2955(0);
                                field968.method2955(0);
                                field968.method2955(89);
                                field968.method2956(Statics.field832.field1225);
                                field968.method2956(Statics.field832.field1211);
                                field968.method2955(63);
                                field1147 = var37;
                                field1102 = var38;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("be.iv(III)V")
    public static final void method1411(int arg0, int arg1) {
        if (class217.method263(arg0)) {
            method2224(Statics.field2629[arg0], arg1);
        }
    }

    @ObfuscatedName("dw.ii([Lhj;II)V")
    public static final void method2224(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2645 == 0) {
                    if (var3.field2767 != null) {
                        method2224(var3.field2767, arg1);
                    }
                    class68 var4 = (class68) field974.method3387((long) var3.field2643);
                    if (var4 != null) {
                        method1411(var4.field837, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2750 != null) {
                    class69 var5 = new class69();
                    var5.field851 = var3;
                    var5.field850 = var3.field2750;
                    class82.method730(var5);
                }
                if (arg1 == 1 && var3.field2741 != null) {
                    if (var3.field2644 >= 0) {
                        class217 var6 = class217.method2254(var3.field2643);
                        if (var6 == null || var6.field2767 == null || var3.field2644 >= var6.field2767.length || var6.field2767[var3.field2644] != var3) {
                            continue;
                        }
                    }
                    class69 var7 = new class69();
                    var7.field851 = var3;
                    var7.field850 = var3.field2741;
                    class82.method730(var7);
                }
            }
        }
    }

    @ObfuscatedName("cr.im(Lhj;III)V")
    public static final void method1589(class217 arg0, int arg1, int arg2) {
        if (field1159 != null || field1053 || arg0 == null) {
            return;
        }
        class217 var3 = arg0;
        int var4 = class218.method2730(method177(arg0));
        class217 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class217.method2254(var3.field2701);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class217 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2718;
        }
        if (var7 == null) {
            return;
        }
        field1159 = arg0;
        class217 var9 = arg0;
        int var10 = class218.method2730(method177(arg0));
        class217 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class217.method2254(var9.field2701);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class217 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2718;
        }
        field961 = var13;
        field1090 = arg1;
        field1169 = arg2;
        Statics.field555 = 0;
        field1091 = false;
        int var15 = field926 - 1;
        if (var15 != -1) {
            method37(var15);
        }
        return;
    }

    @ObfuscatedName("client.ia(I)V")
    public final void method1206() {
        method578(field1159);
        Statics.field555++;
        if (field1154 && field1184) {
            int var1 = class60.field757;
            int var2 = class60.field742;
            int var3 = var1 - field1090;
            int var4 = var2 - field1169;
            if (var3 < field1094) {
                var3 = field1094;
            }
            if (field1159.field2658 + var3 > field1094 + field961.field2658) {
                var3 = field1094 + field961.field2658 - field1159.field2658;
            }
            if (var4 < field1095) {
                var4 = field1095;
            }
            if (field1159.field2659 + var4 > field1095 + field961.field2659) {
                var4 = field1095 + field961.field2659 - field1159.field2659;
            }
            int var5 = var3 - field1097;
            int var6 = var4 - field1098;
            int var7 = field1159.field2719;
            if (Statics.field555 > field1159.field2689 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1091 = true;
            }
            int var8 = field961.field2664 + (var3 - field1094);
            int var9 = field961.field2765 + (var4 - field1095);
            if (field1159.field2732 != null && field1091) {
                class69 var10 = new class69();
                var10.field851 = field1159;
                var10.field848 = var8;
                var10.field849 = var9;
                var10.field850 = field1159.field2732;
                class82.method730(var10);
            }
            if (class60.field751 == 0) {
                if (field1091) {
                    if (field1159.field2751 != null) {
                        class69 var11 = new class69();
                        var11.field851 = field1159;
                        var11.field848 = var8;
                        var11.field849 = var9;
                        var11.field856 = field1092;
                        var11.field850 = field1159.field2751;
                        class82.method730(var11);
                    }
                    if (field1092 != null) {
                        class217 var12 = field1159;
                        int var13 = class218.method2730(method177(var12));
                        class217 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class217.method2254(var12.field2701);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            field968.method3236(41);
                            field968.method2956(field1159.field2644);
                            field968.method2956(field1092.field2644);
                            field968.method3005(field1159.field2763);
                            field968.method3143(field1159.field2643);
                            field968.method3093(field1092.field2763);
                            field968.method3072(field1092.field2643);
                        }
                    }
                } else if (this.method1095()) {
                    this.method1067(field1097 + field1090, field1169 + field1098);
                } else if (field926 > 0) {
                    int var16 = field1097 + field1090;
                    int var17 = field1169 + field1098;
                    class88 var18 = Statics.field2345;
                    method634(var18.field1390, var18.field1397, var18.field1392, var18.field1391, var18.field1394, var18.field1394, var16, var17);
                    Statics.field2345 = null;
                }
                field1159 = null;
            }
        } else if (Statics.field555 > 1) {
            field1159 = null;
        }
    }

    @ObfuscatedName("d.if(IB)V")
    public static void method37(int arg0) {
        Statics.field2345 = new class88();
        Statics.field2345.field1390 = field1055[arg0];
        Statics.field2345.field1397 = field1056[arg0];
        Statics.field2345.field1392 = field963[arg0];
        Statics.field2345.field1391 = field940[arg0];
        Statics.field2345.field1394 = field1059[arg0];
    }

    @ObfuscatedName("ak.jt(Lhj;I)V")
    public static void method578(class217 arg0) {
        if (field1058 == arg0.field2775) {
            field1120[arg0.field2714] = true;
        }
    }

    @ObfuscatedName("cg.jz(B)V")
    public static void method1570() {
        for (class68 var0 = (class68) field974.method3377(); var0 != null; var0 = (class68) field974.method3378()) {
            int var1 = var0.field837;
            if (class217.method263(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field2629[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2642;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2464;
                    class217 var6 = class217.method2254(var5);
                    if (var6 != null) {
                        method578(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.jd([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method40(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("as.jh(II)V")
    public static final void method673(int arg0) {
        if (!class217.method263(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2629[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2681 = 0;
                var3.field2766 = 0;
            }
        }
    }

    @ObfuscatedName("ap.jw([Lhj;II)V")
    public static final void method203(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2701 == arg1 && (!var3.field2642 || !method1010(var3))) {
                if (var3.field2645 == 0) {
                    if (!var3.field2642 && method1010(var3) && Statics.field3622 != var3) {
                        continue;
                    }
                    method203(arg0, var3.field2643);
                    if (var3.field2767 != null) {
                        method203(var3.field2767, var3.field2643);
                    }
                    class68 var4 = (class68) field974.method3387((long) var3.field2643);
                    if (var4 != null) {
                        int var5 = var4.field837;
                        if (class217.method263(var5)) {
                            method203(Statics.field2629[var5], -1);
                        }
                    }
                }
                if (var3.field2645 == 6) {
                    if (var3.field2712 != -1 || var3.field2691 != -1) {
                        boolean var6 = method3(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2691;
                        } else {
                            var7 = var3.field2712;
                        }
                        if (var7 != -1) {
                            class261 var8 = class261.method4424(var7);
                            var3.field2766 += field1005;
                            while (var3.field2766 > var8.field3609[var3.field2681]) {
                                var3.field2766 -= var8.field3609[var3.field2681];
                                var3.field2681++;
                                if (var3.field2681 >= var8.field3607.length) {
                                    var3.field2681 -= var8.field3611;
                                    if (var3.field2681 < 0 || var3.field2681 >= var8.field3607.length) {
                                        var3.field2681 = 0;
                                    }
                                }
                                method578(var3);
                            }
                        }
                    }
                    if (var3.field2747 != 0 && !var3.field2642) {
                        int var9 = var3.field2747 >> 16;
                        int var10 = var3.field2747 << 16 >> 16;
                        int var11 = field1005 * var9;
                        int var12 = field1005 * var10;
                        var3.field2694 = var3.field2694 + var11 & 0x7FF;
                        var3.field2695 = var3.field2695 + var12 & 0x7FF;
                        method578(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.jl(II)V")
    public static final void method561(int arg0) {
        method1570();
        for (class81 var1 = (class81) class81.field1324.method3427(); var1 != null; var1 = (class81) class81.field1324.method3435()) {
            if (var1.field1326 != null) {
                var1.method1487();
            }
        }
        int var2 = class242.method997(arg0).field3280;
        if (var2 == 0) {
            return;
        }
        int var3 = class212.field2599[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class135.method2446(0.9D);
                ((class124) Statics.field2021).method2230(0.9D);
            }
            if (var3 == 2) {
                class135.method2446(0.8D);
                ((class124) Statics.field2021).method2230(0.8D);
            }
            if (var3 == 3) {
                class135.method2446(0.7D);
                ((class124) Statics.field2021).method2230(0.7D);
            }
            if (var3 == 4) {
                class135.method2446(0.6D);
                ((class124) Statics.field2021).method2230(0.6D);
            }
            class257.field3541.method3361();
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
            if (field1150 != var4) {
                if (field1150 == 0 && field1151 != -1) {
                    class204.method1573(Statics.field528, field1151, 0, var4, false);
                    field1152 = false;
                } else if (var4 == 0) {
                    class204.method2740();
                    field1152 = false;
                } else {
                    class204.method104(var4);
                }
                field1150 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1153 = 127;
            }
            if (var3 == 1) {
                field1153 = 96;
            }
            if (var3 == 2) {
                field1153 = 64;
            }
            if (var3 == 3) {
                field1153 = 32;
            }
            if (var3 == 4) {
                field1153 = 0;
            }
        }
        if (var2 == 5) {
            field1052 = var3;
        }
        if (var2 == 6) {
            field1077 = var3;
        }
        if (var2 == 9) {
            field1078 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field923 = 127;
            }
            if (var3 == 1) {
                field923 = 96;
            }
            if (var3 == 2) {
                field923 = 64;
            }
            if (var3 == 3) {
                field923 = 32;
            }
            if (var3 == 4) {
                field923 = 0;
            }
        }
        if (var2 == 17) {
            field1083 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field949 = (class90) class169.method233(class90.method2699(), var3);
            if (field949 == null) {
                field949 = class90.field1406;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field1044 = -1;
            } else {
                field1044 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field950 = (class90) class169.method233(class90.method2699(), var3);
            if (field950 == null) {
                field950 = class90.field1406;
            }
        }
    }

    @ObfuscatedName("dw.jy(Lhj;I)V")
    public static final void method2203(class217 arg0) {
        int var1 = arg0.field2647;
        if (var1 == 324) {
            if (field957 == -1) {
                field957 = arg0.field2678;
                field1188 = arg0.field2679;
            }
            if (field1186.field2617) {
                arg0.field2678 = field957;
            } else {
                arg0.field2678 = field1188;
            }
        } else if (var1 == 325) {
            if (field957 == -1) {
                field957 = arg0.field2678;
                field1188 = arg0.field2679;
            }
            if (field1186.field2617) {
                arg0.field2678 = field1188;
            } else {
                arg0.field2678 = field957;
            }
        } else if (var1 == 327) {
            arg0.field2694 = 150;
            arg0.field2695 = (int) (Math.sin((double) field933 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2774 = 5;
            arg0.field2687 = 0;
        } else if (var1 == 328) {
            arg0.field2694 = 150;
            arg0.field2695 = (int) (Math.sin((double) field933 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2774 = 5;
            arg0.field2687 = 1;
        }
    }

    @ObfuscatedName("fw.ji(I)V")
    public static final void method2860() {
        field968.method3236(57);
        for (class68 var0 = (class68) field974.method3377(); var0 != null; var0 = (class68) field974.method3378()) {
            if (var0.field836 == 0 || var0.field836 == 3) {
                method1982(var0, true);
            }
        }
        if (field1079 != null) {
            method578(field1079);
            field1079 = null;
        }
    }

    @ObfuscatedName("dt.jm(Lbq;ZB)V")
    public static final void method1982(class68 arg0, boolean arg1) {
        int var2 = arg0.field837;
        int var3 = (int) arg0.field2464;
        arg0.method3425();
        if (arg1) {
            class217.method6(var2);
        }
        for (class199 var4 = (class199) field1187.method3377(); var4 != null; var4 = (class199) field1187.method3378()) {
            if ((long) var2 == (var4.field2464 >> 48 & 0xFFFFL)) {
                var4.method3425();
            }
        }
        class217 var5 = class217.method2254(var3);
        if (var5 != null) {
            method578(var5);
        }
        method3852();
        if (field1075 != -1) {
            method1411(field1075, 1);
        }
    }

    @ObfuscatedName("j.jg(Lhj;I)Z")
    public static final boolean method129(class217 arg0) {
        int var1 = arg0.field2647;
        if (var1 == 205) {
            field978 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1186.method3735(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1186.method3762(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1186.method3750(false);
        }
        if (var1 == 325) {
            field1186.method3750(true);
        }
        if (var1 == 326) {
            field968.method3236(242);
            field1186.method3748(field968);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("v.jn(Lhj;IIII)V")
    public static final void method15(class217 arg0, int arg1, int arg2, int arg3) {
        method669();
        class211 var4 = arg0.method3782(false);
        if (var4 == null) {
            return;
        }
        class283.method4723(arg1, arg2, var4.field2590 + arg1, var4.field2593 + arg2);
        if (field1149 == 2 || field1149 == 5) {
            class283.method4718(arg1, arg2, 0, var4.field2595, var4.field2592);
        } else {
            int var5 = field1156 & 0x7FF;
            int var6 = Statics.field832.field1225 / 32 + 48;
            int var7 = 464 - Statics.field832.field1211 / 32;
            Statics.field86.method4832(arg1, arg2, var4.field2590, var4.field2593, var6, var7, var5, 256, var4.field2595, var4.field2592);
            for (int var8 = 0; var8 < field1165; var8++) {
                int var9 = field1144[var8] * 4 + 2 - Statics.field832.field1225 / 32;
                int var10 = field1180[var8] * 4 + 2 - Statics.field832.field1211 / 32;
                method41(arg1, arg2, var9, var10, field1146[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class194 var13 = field1045[Statics.field609][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field832.field1225 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field832.field1211 / 32;
                        method41(arg1, arg2, var14, var15, Statics.field499[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field954; var16++) {
                class85 var17 = field1131[field965[var16]];
                if (var17 != null && var17.method1034()) {
                    class259 var18 = var17.field1367;
                    if (var18 != null && var18.field3580 != null) {
                        var18 = var18.method4396();
                    }
                    if (var18 != null && var18.field3566 && var18.field3583) {
                        int var19 = var17.field1225 / 32 - Statics.field832.field1225 / 32;
                        int var20 = var17.field1211 / 32 - Statics.field832.field1211 / 32;
                        method41(arg1, arg2, var19, var20, Statics.field499[1], var4);
                    }
                }
            }
            int var21 = class95.field1500;
            int[] var22 = class95.field1491;
            for (int var23 = 0; var23 < var21; var23++) {
                class74 var24 = field1035[var22[var23]];
                if (var24 != null && var24.method1034() && !var24.field908 && Statics.field832 != var24) {
                    int var25 = var24.field1225 / 32 - Statics.field832.field1225 / 32;
                    int var26 = var24.field1211 / 32 - Statics.field832.field1211 / 32;
                    boolean var27 = false;
                    if (method1647(var24.field913, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field23; var29++) {
                        if (var24.field913.equals(Statics.field1352[var29].field919)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field832.field907 != 0 && var24.field907 != 0 && Statics.field832.field907 == var24.field907) {
                        var30 = true;
                    }
                    if (var27) {
                        method41(arg1, arg2, var25, var26, Statics.field499[3], var4);
                    } else if (var30) {
                        method41(arg1, arg2, var25, var26, Statics.field499[4], var4);
                    } else if (var28) {
                        method41(arg1, arg2, var25, var26, Statics.field499[5], var4);
                    } else {
                        method41(arg1, arg2, var25, var26, Statics.field499[2], var4);
                    }
                }
            }
            if (field941 != 0 && field933 % 20 < 10) {
                if (field941 == 1 && field942 >= 0 && field942 < field1131.length) {
                    class85 var31 = field1131[field942];
                    if (var31 != null) {
                        int var32 = var31.field1225 / 32 - Statics.field832.field1225 / 32;
                        int var33 = var31.field1211 / 32 - Statics.field832.field1211 / 32;
                        method127(arg1, arg2, var32, var33, Statics.field2485[1], var4);
                    }
                }
                if (field941 == 2) {
                    int var34 = field1028 * 4 - Statics.field352 * 4 + 2 - Statics.field832.field1225 / 32;
                    int var35 = field1063 * 4 - Statics.field3706 * 4 + 2 - Statics.field832.field1211 / 32;
                    method127(arg1, arg2, var34, var35, Statics.field2485[1], var4);
                }
                if (field941 == 10 && field1054 >= 0 && field1054 < field1035.length) {
                    class74 var36 = field1035[field1054];
                    if (var36 != null) {
                        int var37 = var36.field1225 / 32 - Statics.field832.field1225 / 32;
                        int var38 = var36.field1211 / 32 - Statics.field832.field1211 / 32;
                        method127(arg1, arg2, var37, var38, Statics.field2485[1], var4);
                    }
                }
            }
            if (field1147 != 0) {
                int var39 = field1147 * 4 + 2 - Statics.field832.field1225 / 32;
                int var40 = field1102 * 4 + 2 - Statics.field832.field1211 / 32;
                method41(arg1, arg2, var39, var40, Statics.field2485[0], var4);
            }
            if (!Statics.field832.field908) {
                class283.method4704(var4.field2590 / 2 + arg1 - 1, var4.field2593 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1121[arg3] = true;
    }

    @ObfuscatedName("hr.jp(Lhj;IIII)V")
    public static final void method3867(class217 arg0, int arg1, int arg2, int arg3) {
        class211 var4 = arg0.method3782(false);
        if (var4 == null) {
            return;
        }
        if (field1149 < 3) {
            Statics.field2495.method4832(arg1, arg2, var4.field2590, var4.field2593, 25, 25, field1156, 256, var4.field2595, var4.field2592);
        } else {
            class283.method4718(arg1, arg2, 0, var4.field2595, var4.field2592);
        }
    }

    @ObfuscatedName("j.jr(IIIILky;Lhh;I)V")
    public static final void method127(int arg0, int arg1, int arg2, int arg3, class287 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method41(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field1156 & 0x7FF;
        int var8 = class135.field2024[var7];
        int var9 = class135.field2025[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2590 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field613.method4824(arg5.field2590 / 2 + arg0 - var17 / 2 + var15, arg5.field2593 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("x.jf(IIIILky;Lhh;B)V")
    public static final void method41(int arg0, int arg1, int arg2, int arg3, class287 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field1156 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class135.field2024[var6];
        int var9 = class135.field2025[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4882(arg5.field2590 / 2 + var10 - arg4.field3799 / 2, arg5.field2593 / 2 - var11 - arg4.field3800 / 2, arg0, arg1, arg5.field2590, arg5.field2593, arg5.field2595, arg5.field2592);
        } else {
            arg4.method4822(arg5.field2590 / 2 + arg0 + var10 - arg4.field3799 / 2, arg5.field2593 / 2 + arg1 - var11 - arg4.field3800 / 2);
        }
    }

    @ObfuscatedName("ch.ja(Ljava/lang/String;ZB)Z")
    public static boolean method1647(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method1000(arg0, Statics.field3170);
        for (int var3 = 0; var3 < field1115; var3++) {
            if (var2.equalsIgnoreCase(class268.method1000(field1182[var3].field823, Statics.field3170)) && (!arg1 || field1182[var3].field818 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method1000(Statics.field832.field913, Statics.field3170))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bo.jj(Ljava/lang/String;I)Z")
    public static boolean method999(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method1000(arg0, Statics.field3170);
        for (int var2 = 0; var2 < field1080; var2++) {
            class70 var3 = field1081[var2];
            if (var1.equalsIgnoreCase(class268.method1000(var3.field866, Statics.field3170))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method1000(var3.field863, Statics.field3170))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gr.jb(Ljava/lang/String;I)V")
    public static final void method3271(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field1115 < 200 || field1037 == 1) || field1115 >= 400) {
            class97.method3203(30, "", class226.field3017);
            return;
        }
        String var1 = class268.method1000(arg0, Statics.field3170);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1115; var2++) {
            class66 var3 = field1182[var2];
            String var4 = class268.method1000(var3.field823, Statics.field3170);
            if (var4 != null && var4.equals(var1)) {
                class97.method3203(30, "", arg0 + class226.field3018);
                return;
            }
            if (var3.field817 != null) {
                String var5 = class268.method1000(var3.field817, Statics.field3170);
                if (var5 != null && var5.equals(var1)) {
                    class97.method3203(30, "", arg0 + class226.field3018);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field1080; var6++) {
            class70 var7 = field1081[var6];
            String var8 = class268.method1000(var7.field866, Statics.field3170);
            if (var8 != null && var8.equals(var1)) {
                class97.method3203(30, "", class226.field3023 + arg0 + class226.field3024);
                return;
            }
            if (var7.field863 != null) {
                String var9 = class268.method1000(var7.field863, Statics.field3170);
                if (var9 != null && var9.equals(var1)) {
                    class97.method3203(30, "", class226.field3023 + arg0 + class226.field3024);
                    return;
                }
            }
        }
        if (class268.method1000(Statics.field832.field913, Statics.field3170).equals(var1)) {
            class97.method3203(30, "", class226.field2966);
        } else {
            field968.method3236(227);
            field968.method2955(class174.method1591(arg0));
            field968.method3117(arg0);
        }
    }

    @ObfuscatedName("ie.jv(Ljava/lang/String;ZI)V")
    public static final void method4203(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1080 < 100 || field1037 == 1) || field1080 >= 400) {
            class97.method3203(31, "", class226.field3019);
            return;
        }
        String var2 = class268.method1000(arg0, Statics.field3170);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1080; var3++) {
            class70 var4 = field1081[var3];
            String var5 = class268.method1000(var4.field866, Statics.field3170);
            if (var5 != null && var5.equals(var2)) {
                class97.method3203(31, "", arg0 + class226.field3020);
                return;
            }
            if (var4.field863 != null) {
                String var6 = class268.method1000(var4.field863, Statics.field3170);
                if (var6 != null && var6.equals(var2)) {
                    class97.method3203(31, "", arg0 + class226.field3020);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1115; var7++) {
            class66 var8 = field1182[var7];
            String var9 = class268.method1000(var8.field823, Statics.field3170);
            if (var9 != null && var9.equals(var2)) {
                class97.method3203(31, "", class226.field2932 + arg0 + class226.field3026);
                return;
            }
            if (var8.field817 != null) {
                String var10 = class268.method1000(var8.field817, Statics.field3170);
                if (var10 != null && var10.equals(var2)) {
                    class97.method3203(31, "", class226.field2932 + arg0 + class226.field3026);
                    return;
                }
            }
        }
        if (class268.method1000(Statics.field832.field913, Statics.field3170).equals(var2)) {
            class97.method3203(31, "", class226.field3041);
        } else {
            field968.method3236(24);
            field968.method2955(class174.method1591(arg0));
            field968.method3117(arg0);
        }
    }

    @ObfuscatedName("bt.ju(Ljava/lang/String;I)V")
    public static final void method991(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method1000(arg0, Statics.field3170);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1115; var2++) {
            class66 var3 = field1182[var2];
            String var4 = var3.field823;
            String var5 = class268.method1000(var4, Statics.field3170);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1115--;
                for (int var7 = var2; var7 < field1115; var7++) {
                    field1182[var7] = field1182[var7 + 1];
                }
                field1192 = field1138;
                field968.method3236(32);
                field968.method2955(class174.method1591(arg0));
                field968.method3117(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("h.jx(Ljava/lang/String;B)V")
    public static final void method103(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method1000(arg0, Statics.field3170);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1080; var2++) {
            class70 var3 = field1081[var2];
            String var4 = var3.field866;
            String var5 = class268.method1000(var4, Statics.field3170);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1080--;
                for (int var7 = var2; var7 < field1080; var7++) {
                    field1081[var7] = field1081[var7 + 1];
                }
                field1192 = field1138;
                field968.method3236(122);
                field968.method2955(class174.method1591(arg0));
                field968.method3117(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("fe.jc(Ljava/lang/String;I)V")
    public static final void method2810(String arg0) {
        if (Statics.field1352 != null) {
            field968.method3236(178);
            field968.method2955(class174.method1591(arg0));
            field968.method3117(arg0);
        }
    }

    @ObfuscatedName("cl.je(Ljava/lang/String;I)V")
    public static final void method1478(String arg0) {
        if (!arg0.equals("")) {
            field968.method3236(174);
            field968.method2955(class174.method1591(arg0));
            field968.method3117(arg0);
        }
    }

    @ObfuscatedName("f.jq(Lhj;B)I")
    public static int method177(class217 arg0) {
        class199 var1 = (class199) field1187.method3387(((long) arg0.field2643 << 32) + (long) arg0.field2644);
        return var1 == null ? arg0.field2715 : var1.field2479;
    }

    @ObfuscatedName("bl.jk(Lhj;I)Z")
    public static boolean method1010(class217 arg0) {
        if (field1085) {
            if (method177(arg0) != 0) {
                return false;
            }
            if (arg0.field2645 == 0) {
                return false;
            }
        }
        return arg0.field2663;
    }

    @ObfuscatedName("u.js(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method60(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field1145 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field1145 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field1145 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field1145 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field1145 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2252 != null) {
            var3 = "/p=" + Statics.field2252;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field929 + "/a=" + Statics.field930 + var3 + "/";
    }

    @ObfuscatedName("jz.jo(Ljava/lang/String;I)V")
    public static void method4487(String arg0) {
        Statics.field2252 = arg0;
        try {
            String var1 = Statics.field243.getParameter(class275.field3722.field3730);
            String var2 = Statics.field243.getParameter(class275.field3727.field3730);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class176.method3200() + 94608000000L;
                class183.field2439.setTime(new Date(var6));
                int var8 = class183.field2439.get(7);
                int var9 = class183.field2439.get(5);
                int var10 = class183.field2439.get(2);
                int var11 = class183.field2439.get(1);
                int var12 = class183.field2439.get(11);
                int var13 = class183.field2439.get(12);
                int var14 = class183.field2439.get(13);
                String var15 = class183.field2440[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class183.field2437[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field243;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("hk.ky(Ljava/lang/String;ZB)V")
    public static void method3858(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field484; var5++) {
            class257 var6 = class257.method2694(var5);
            if ((!arg1 || var6.field3527) && var6.field3532 == -1 && var6.field3499.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2341 = -1;
                    Statics.field32 = null;
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
        Statics.field32 = var3;
        Statics.field301 = 0;
        Statics.field2341 = var4;
        String[] var9 = new String[Statics.field2341];
        for (int var10 = 0; var10 < Statics.field2341; var10++) {
            var9[var10] = class257.method2694(var3[var10]).field3499;
        }
        class171.method36(var9, Statics.field32);
    }

    @ObfuscatedName("bt.ko([BIB)V")
    public static void method982(byte[] arg0, int arg1) {
        if (field943 == null) {
            field943 = new byte[24];
        }
        class184.method3276(arg0, arg1, field943, 0, 24);
    }
}

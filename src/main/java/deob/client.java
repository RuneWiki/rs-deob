package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class162[] field996 = new class162[4];

    @ObfuscatedName("client.ak")
    public static boolean field1189 = true;

    @ObfuscatedName("client.bj")
    public static int field1121 = 1;

    @ObfuscatedName("client.bf")
    public static int field955 = 0;

    @ObfuscatedName("client.bc")
    public static int field923 = 0;

    @ObfuscatedName("client.bn")
    public static boolean field925 = false;

    @ObfuscatedName("client.bd")
    public static boolean field926 = false;

    @ObfuscatedName("client.bl")
    public static int field927 = 0;

    @ObfuscatedName("client.bu")
    public static int field929 = 0;

    @ObfuscatedName("client.bv")
    public static boolean field1124 = true;

    @ObfuscatedName("client.bk")
    public static int field931 = 0;

    @ObfuscatedName("client.bg")
    public static long field1145 = 1L;

    @ObfuscatedName("client.bt")
    public static int field1011 = -1;

    @ObfuscatedName("client.bm")
    public static int field934 = -1;

    @ObfuscatedName("client.bh")
    public static int field935 = -1;

    @ObfuscatedName("client.bw")
    public static boolean field936 = true;

    @ObfuscatedName("client.be")
    public static boolean field937 = false;

    @ObfuscatedName("client.bz")
    public static int field984 = 0;

    @ObfuscatedName("client.bs")
    public static int field939 = 0;

    @ObfuscatedName("client.bp")
    public static int field940 = 0;

    @ObfuscatedName("client.cg")
    public static int field941 = 0;

    @ObfuscatedName("client.co")
    public static int field1015 = 0;

    @ObfuscatedName("client.cu")
    public static int field968 = 0;

    @ObfuscatedName("client.cy")
    public static int field944 = 0;

    @ObfuscatedName("client.cd")
    public static int field945 = 0;

    @ObfuscatedName("client.cx")
    public static int field946 = 0;

    @ObfuscatedName("client.cq")
    public static class90 field947 = class90.field1404;

    @ObfuscatedName("client.cn")
    public static class90 field948 = class90.field1404;

    @ObfuscatedName("client.cl")
    public static int field950 = 0;

    @ObfuscatedName("client.ch")
    public static int field1043 = 0;

    @ObfuscatedName("client.ca")
    public static int field1149 = 0;

    @ObfuscatedName("client.dg")
    public static int field959 = 0;

    @ObfuscatedName("client.df")
    public static int field954 = 0;

    @ObfuscatedName("client.dy")
    public static int field1031 = 0;

    @ObfuscatedName("client.dx")
    public static int field1139 = 0;

    @ObfuscatedName("client.ds")
    public static int field1018 = 0;

    @ObfuscatedName("client.dd")
    public static class150 field958 = class150.field2210;

    @ObfuscatedName("client.dh")
    public static byte[] field982 = null;

    @ObfuscatedName("client.dq")
    public static class85[] field960 = new class85[32768];

    @ObfuscatedName("client.dt")
    public static int field961 = 0;

    @ObfuscatedName("client.dm")
    public static int[] field1029 = new int[32768];

    @ObfuscatedName("client.ed")
    public static int field963 = 0;

    @ObfuscatedName("client.eb")
    public static int[] field964 = new int[250];

    @ObfuscatedName("client.ek")
    public static class180 field965 = new class180(5000);

    @ObfuscatedName("client.em")
    public static class180 field966 = new class180(5000);

    @ObfuscatedName("client.eo")
    public static class180 field967 = new class180(15000);

    @ObfuscatedName("client.ee")
    public static int field1171 = 0;

    @ObfuscatedName("client.et")
    public static int field969 = 0;

    @ObfuscatedName("client.ev")
    public static int field970 = 0;

    @ObfuscatedName("client.ei")
    public static int field1116 = 0;

    @ObfuscatedName("client.eq")
    public static int field972 = 0;

    @ObfuscatedName("client.ec")
    public static int field973 = 0;

    @ObfuscatedName("client.ea")
    public static int field1098 = 0;

    @ObfuscatedName("client.eu")
    public static int field975 = 0;

    @ObfuscatedName("client.ex")
    public static boolean field1146 = false;

    @ObfuscatedName("client.en")
    public static class276 field930 = new class276();

    @ObfuscatedName("client.ez")
    public static HashMap field933 = new HashMap();

    @ObfuscatedName("client.fq")
    public static int field983 = 0;

    @ObfuscatedName("client.fm")
    public static int field980 = 1;

    @ObfuscatedName("client.fy")
    public static int field981 = 0;

    @ObfuscatedName("client.fp")
    public static int field1174 = 1;

    @ObfuscatedName("client.fc")
    public static int field1032 = 0;

    @ObfuscatedName("client.fg")
    public static boolean field986 = false;

    @ObfuscatedName("client.fh")
    public static int[][][] field987 = new int[4][13][13];

    @ObfuscatedName("client.fw")
    public static final int[] field988 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fx")
    public static int field1123 = 0;

    @ObfuscatedName("client.gn")
    public static int field990 = 2301979;

    @ObfuscatedName("client.gp")
    public static int field991 = 5063219;

    @ObfuscatedName("client.gs")
    public static int field1073 = 3353893;

    @ObfuscatedName("client.gh")
    public static int field993 = 7759444;

    @ObfuscatedName("client.gg")
    public static boolean field994 = false;

    @ObfuscatedName("client.gk")
    public static int field995 = 0;

    @ObfuscatedName("client.gu")
    public static int field922 = 128;

    @ObfuscatedName("client.gv")
    public static int field997 = 0;

    @ObfuscatedName("client.gx")
    public static int field1150 = 0;

    @ObfuscatedName("client.gy")
    public static int field942 = 0;

    @ObfuscatedName("client.gi")
    public static int field1154 = 0;

    @ObfuscatedName("client.go")
    public static int field1001 = 0;

    @ObfuscatedName("client.ga")
    public static int field1003 = 50;

    @ObfuscatedName("client.hu")
    public static int field971 = 0;

    @ObfuscatedName("client.hx")
    public static boolean field1004 = false;

    @ObfuscatedName("client.hl")
    public static int field1125 = 0;

    @ObfuscatedName("client.hv")
    public static int field1006 = 0;

    @ObfuscatedName("client.hg")
    public static int field1007 = 50;

    @ObfuscatedName("client.hc")
    public static int[] field1008 = new int[field1007];

    @ObfuscatedName("client.hj")
    public static int[] field1009 = new int[field1007];

    @ObfuscatedName("client.ho")
    public static int[] field1010 = new int[field1007];

    @ObfuscatedName("client.hk")
    public static int[] field1084 = new int[field1007];

    @ObfuscatedName("client.hh")
    public static int[] field1012 = new int[field1007];

    @ObfuscatedName("client.hq")
    public static int[] field1013 = new int[field1007];

    @ObfuscatedName("client.hy")
    public static int[] field1067 = new int[field1007];

    @ObfuscatedName("client.hn")
    public static String[] field1134 = new String[field1007];

    @ObfuscatedName("client.hs")
    public static int[][] field1016 = new int[104][104];

    @ObfuscatedName("client.he")
    public static int field1017 = 0;

    @ObfuscatedName("client.hm")
    public static int field985 = -1;

    @ObfuscatedName("client.hw")
    public static int field1000 = -1;

    @ObfuscatedName("client.ha")
    public static int field1020 = 0;

    @ObfuscatedName("client.hf")
    public static int field1021 = 0;

    @ObfuscatedName("client.hp")
    public static int field1172 = 0;

    @ObfuscatedName("client.hi")
    public static int field1023 = 0;

    @ObfuscatedName("client.hb")
    public static int field1024 = 0;

    @ObfuscatedName("client.hr")
    public static int field1025 = 0;

    @ObfuscatedName("client.it")
    public static String field1068 = null;

    @ObfuscatedName("client.ij")
    public static int field1026 = 0;

    @ObfuscatedName("client.ia")
    public static int field1027 = 0;

    @ObfuscatedName("client.ir")
    public static int field1136 = 0;

    @ObfuscatedName("client.is")
    public static int field1114 = 0;

    @ObfuscatedName("client.iq")
    public static boolean field1106 = false;

    @ObfuscatedName("client.ie")
    public static int field1128 = 0;

    @ObfuscatedName("client.ih")
    public static int field1176 = 0;

    @ObfuscatedName("client.ii")
    public static class74[] field1034 = new class74[2048];

    @ObfuscatedName("client.ig")
    public static int field1179 = -1;

    @ObfuscatedName("client.if")
    public static int field1036 = 0;

    @ObfuscatedName("client.iu")
    public static int field1037 = 0;

    @ObfuscatedName("client.im")
    public static int[] field1038 = new int[1000];

    @ObfuscatedName("client.ic")
    public static final int[] field1039 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.io")
    public static String[] field989 = new String[8];

    @ObfuscatedName("client.iy")
    public static boolean[] field1041 = new boolean[8];

    @ObfuscatedName("client.id")
    public static int[] field1042 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.iw")
    public static int field1062 = -1;

    @ObfuscatedName("client.jl")
    public static class194[][][] field1044 = new class194[4][104][104];

    @ObfuscatedName("client.jk")
    public static class194 field1045 = new class194();

    @ObfuscatedName("client.jf")
    public static class194 field1046 = new class194();

    @ObfuscatedName("client.ju")
    public static class194 field1047 = new class194();

    @ObfuscatedName("client.jm")
    public static int[] field1005 = new int[25];

    @ObfuscatedName("client.jh")
    public static int[] field1049 = new int[25];

    @ObfuscatedName("client.jj")
    public static int[] field1050 = new int[25];

    @ObfuscatedName("client.jn")
    public static int field1051 = 0;

    @ObfuscatedName("client.jo")
    public static boolean field1052 = false;

    @ObfuscatedName("client.jw")
    public static int field1028 = 0;

    @ObfuscatedName("client.jy")
    public static int[] field920 = new int[500];

    @ObfuscatedName("client.jr")
    public static int[] field1085 = new int[500];

    @ObfuscatedName("client.ja")
    public static int[] field1056 = new int[500];

    @ObfuscatedName("client.jp")
    public static int[] field921 = new int[500];

    @ObfuscatedName("client.jt")
    public static String[] field1058 = new String[500];

    @ObfuscatedName("client.js")
    public static String[] field1059 = new String[500];

    @ObfuscatedName("client.je")
    public static boolean[] field1022 = new boolean[500];

    @ObfuscatedName("client.jx")
    public static boolean field1061 = false;

    @ObfuscatedName("client.jc")
    public static boolean field1185 = false;

    @ObfuscatedName("client.jz")
    public static int field1030 = -1;

    @ObfuscatedName("client.kr")
    public static int field1064 = -1;

    @ObfuscatedName("client.kj")
    public static int field1065 = 0;

    @ObfuscatedName("client.kt")
    public static int field1066 = 50;

    @ObfuscatedName("client.ki")
    public static int field974 = 0;

    @ObfuscatedName("client.kw")
    public static boolean field1069 = false;

    @ObfuscatedName("client.ka")
    public static int field1070 = -1;

    @ObfuscatedName("client.ky")
    public static int field1071 = -1;

    @ObfuscatedName("client.km")
    public static String field1072 = null;

    @ObfuscatedName("client.kh")
    public static String field949 = null;

    @ObfuscatedName("client.kk")
    public static int field1074 = -1;

    @ObfuscatedName("client.kc")
    public static class191 field1075 = new class191(8);

    @ObfuscatedName("client.kx")
    public static int field1076 = 0;

    @ObfuscatedName("client.kf")
    public static int field1077 = 0;

    @ObfuscatedName("client.kv")
    public static class217 field1078 = null;

    @ObfuscatedName("client.kl")
    public static int field1079 = 0;

    @ObfuscatedName("client.kg")
    public static int field1080 = 0;

    @ObfuscatedName("client.kb")
    public static int field1081 = 0;

    @ObfuscatedName("client.ks")
    public static int field1082 = -1;

    @ObfuscatedName("client.kq")
    public static boolean field1083 = false;

    @ObfuscatedName("client.kd")
    public static boolean field962 = false;

    @ObfuscatedName("client.ls")
    public static boolean field979 = false;

    @ObfuscatedName("client.lx")
    public static class217 field1086 = null;

    @ObfuscatedName("client.lm")
    public static class217 field1053 = null;

    @ObfuscatedName("client.lt")
    public static class217 field1048 = null;

    @ObfuscatedName("client.ly")
    public static int field1089 = 0;

    @ObfuscatedName("client.lf")
    public static int field1090 = 0;

    @ObfuscatedName("client.le")
    public static class217 field953 = null;

    @ObfuscatedName("client.ll")
    public static boolean field1092 = false;

    @ObfuscatedName("client.ln")
    public static int field1093 = -1;

    @ObfuscatedName("client.la")
    public static int field1094 = -1;

    @ObfuscatedName("client.lg")
    public static boolean field1095 = false;

    @ObfuscatedName("client.lw")
    public static int field1096 = -1;

    @ObfuscatedName("client.lz")
    public static int field1097 = -1;

    @ObfuscatedName("client.lk")
    public static boolean field1160 = false;

    @ObfuscatedName("client.lq")
    public static int field1099 = 1;

    @ObfuscatedName("client.lb")
    public static int[] field1100 = new int[32];

    @ObfuscatedName("client.lo")
    public static int field1101 = 0;

    @ObfuscatedName("client.lv")
    public static int[] field1102 = new int[32];

    @ObfuscatedName("client.li")
    public static int field1103 = 0;

    @ObfuscatedName("client.lj")
    public static int[] field1153 = new int[32];

    @ObfuscatedName("client.mm")
    public static int field1105 = 0;

    @ObfuscatedName("client.mh")
    public static int field1175 = 0;

    @ObfuscatedName("client.mz")
    public static int field1107 = 0;

    @ObfuscatedName("client.mk")
    public static int field1108 = 0;

    @ObfuscatedName("client.mr")
    public static int field1109 = 0;

    @ObfuscatedName("client.mj")
    public static int field1110 = 0;

    @ObfuscatedName("client.mc")
    public static int field1111 = 0;

    @ObfuscatedName("client.my")
    public static int field1112 = 0;

    @ObfuscatedName("client.mn")
    public static class194 field1113 = new class194();

    @ObfuscatedName("client.mg")
    public static class194 field1126 = new class194();

    @ObfuscatedName("client.mi")
    public static class194 field1091 = new class194();

    @ObfuscatedName("client.me")
    public static class191 field1033 = new class191(512);

    @ObfuscatedName("client.ms")
    public static int field1117 = 0;

    @ObfuscatedName("client.mu")
    public static int field1118 = -2;

    @ObfuscatedName("client.mp")
    public static boolean[] field1119 = new boolean[100];

    @ObfuscatedName("client.mv")
    public static boolean[] field1120 = new boolean[100];

    @ObfuscatedName("client.mt")
    public static boolean[] field1035 = new boolean[100];

    @ObfuscatedName("client.mo")
    public static int[] field1122 = new int[100];

    @ObfuscatedName("client.mb")
    public static int[] field1014 = new int[100];

    @ObfuscatedName("client.mf")
    public static int[] field1088 = new int[100];

    @ObfuscatedName("client.mq")
    public static int[] field1131 = new int[100];

    @ObfuscatedName("client.mw")
    public static int field956 = 0;

    @ObfuscatedName("client.md")
    public static long field1127 = 0L;

    @ObfuscatedName("client.nc")
    public static boolean field1040 = true;

    @ObfuscatedName("client.nm")
    public static int[] field1129 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nd")
    public static int field1130 = 0;

    @ObfuscatedName("client.nv")
    public static int field1019 = 0;

    @ObfuscatedName("client.nb")
    public static String field1132 = "";

    @ObfuscatedName("client.ne")
    public static long[] field1133 = new long[100];

    @ObfuscatedName("client.nz")
    public static int field1054 = 0;

    @ObfuscatedName("client.ni")
    public static int field1135 = 0;

    @ObfuscatedName("client.nh")
    public static int[] field1186 = new int[128];

    @ObfuscatedName("client.nl")
    public static int[] field1137 = new int[128];

    @ObfuscatedName("client.nq")
    public static long field1138 = -1L;

    @ObfuscatedName("client.na")
    public static String field978 = null;

    @ObfuscatedName("client.nx")
    public static String field1140 = null;

    @ObfuscatedName("client.oi")
    public static int field1141 = -1;

    @ObfuscatedName("client.oo")
    public static int field1142 = 0;

    @ObfuscatedName("client.oc")
    public static int[] field1143 = new int[1000];

    @ObfuscatedName("client.oq")
    public static int[] field1144 = new int[1000];

    @ObfuscatedName("client.of")
    public static class287[] field1177 = new class287[1000];

    @ObfuscatedName("client.ov")
    public static int field951 = 0;

    @ObfuscatedName("client.ox")
    public static int field1147 = 0;

    @ObfuscatedName("client.ou")
    public static int field1184 = 0;

    @ObfuscatedName("client.oz")
    public static int field977 = 255;

    @ObfuscatedName("client.ot")
    public static int field1087 = -1;

    @ObfuscatedName("client.ol")
    public static boolean field1152 = false;

    @ObfuscatedName("client.oh")
    public static int field943 = 127;

    @ObfuscatedName("client.oj")
    public static int field1115 = 127;

    @ObfuscatedName("client.oy")
    public static int field1155 = 0;

    @ObfuscatedName("client.op")
    public static int[] field1156 = new int[50];

    @ObfuscatedName("client.pi")
    public static int[] field1157 = new int[50];

    @ObfuscatedName("client.pk")
    public static int[] field1158 = new int[50];

    @ObfuscatedName("client.pc")
    public static int[] field1159 = new int[50];

    @ObfuscatedName("client.pg")
    public static class104[] field1104 = new class104[50];

    @ObfuscatedName("client.pt")
    public static boolean field1161 = false;

    @ObfuscatedName("client.pj")
    public static boolean[] field1162 = new boolean[5];

    @ObfuscatedName("client.px")
    public static int[] field1163 = new int[5];

    @ObfuscatedName("client.pa")
    public static int[] field1057 = new int[5];

    @ObfuscatedName("client.pd")
    public static int[] field1165 = new int[5];

    @ObfuscatedName("client.pr")
    public static int[] field1166 = new int[5];

    @ObfuscatedName("client.po")
    public static short field1167 = 256;

    @ObfuscatedName("client.pf")
    public static short field1168 = 205;

    @ObfuscatedName("client.pw")
    public static short field1169 = 256;

    @ObfuscatedName("client.pe")
    public static short field1170 = 320;

    @ObfuscatedName("client.qs")
    public static short field1002 = 1;

    @ObfuscatedName("client.qy")
    public static short field1060 = 32767;

    @ObfuscatedName("client.qc")
    public static short field1173 = 1;

    @ObfuscatedName("client.qn")
    public static short field1063 = 32767;

    @ObfuscatedName("client.qu")
    public static int field932 = 0;

    @ObfuscatedName("client.ql")
    public static int field957 = 0;

    @ObfuscatedName("client.qt")
    public static int field1164 = 0;

    @ObfuscatedName("client.qm")
    public static int field1178 = 0;

    @ObfuscatedName("client.qr")
    public static int field976 = 0;

    @ObfuscatedName("client.qq")
    public static int field952 = 0;

    @ObfuscatedName("client.qh")
    public static int field1181 = 0;

    @ObfuscatedName("client.qi")
    public static class66[] field1182 = new class66[400];

    @ObfuscatedName("client.qa")
    public static class196 field999 = new class196();

    @ObfuscatedName("client.qo")
    public static int field1183 = 0;

    @ObfuscatedName("client.qg")
    public static class70[] field1055 = new class70[400];

    @ObfuscatedName("client.qd")
    public static class214 field1180 = new class214();

    @ObfuscatedName("client.qp")
    public static int field1187 = -1;

    @ObfuscatedName("client.qk")
    public static int field1188 = -1;

    @ObfuscatedName("client.qx")
    public static class17[] field938 = new class17[8];

    @ObfuscatedName("client.ra")
    public static final class73 field1190 = new class73();

    @ObfuscatedName("client.rv")
    public static int[] field1191 = new int[50];

    @ObfuscatedName("client.rq")
    public static int[] field1192 = new int[50];

    @ObfuscatedName("bu.fp(I)Lke;")
    public static class290 method1033() {
        return Statics.field2191;
    }

    @ObfuscatedName("client.aw(B)V")
    public final void method804() {
    }

    public final void init() {
        if (!this.method784()) {
            return;
        }
        class275[] var1 = class275.method46();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class275 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3723);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3723)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class87.field1381)) {
                            field925 = true;
                        } else {
                            field925 = false;
                        }
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class87.field1381)) {
                        }
                    case 3:
                    case 9:
                    case 13:
                    default:
                        break;
                    case 4:
                        class233[] var5 = new class233[] { class233.field3200, class233.field3195, class233.field3193, class233.field3197, class233.field3194, class233.field3198 };
                        Statics.field924 = (class233) class169.method648(var5, Integer.parseInt(var4));
                        if (Statics.field924 == class233.field3198) {
                            Statics.field43 = class291.field3870;
                        } else {
                            Statics.field43 = class291.field3873;
                        }
                        break;
                    case 5:
                        int var6 = Integer.parseInt(var4);
                        class232[] var7 = class232.method3714();
                        int var8 = 0;
                        class232 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class232 var9 = var7[var8];
                            if (var9.field3190 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field2615 = var10;
                        break;
                    case 6:
                        Statics.field928 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field2393 = var4;
                        break;
                    case 8:
                        field1121 = Integer.parseInt(var4);
                        break;
                    case 10:
                        field927 = Integer.parseInt(var4);
                        break;
                    case 11:
                        Statics.field2203 = var4;
                        break;
                    case 12:
                        Statics.field1378 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field955 = Integer.parseInt(var4);
                        break;
                    case 15:
                        field923 = Integer.parseInt(var4);
                }
            }
        }
        class138.field2057 = false;
        field926 = false;
        Statics.field703 = this.getCodeBase().getHost();
        String var11 = Statics.field2615.field3189;
        byte var12 = 0;
        try {
            Statics.field3669 = 17;
            Statics.field859 = var12;
            try {
                Statics.field19 = System.getProperty("os.name");
            } catch (Exception var33) {
                Statics.field19 = "Unknown";
            }
            Statics.field1658 = Statics.field19.toLowerCase();
            try {
                Statics.field1408 = System.getProperty("user.home");
                if (Statics.field1408 != null) {
                    Statics.field1408 = Statics.field1408 + "/";
                }
            } catch (Exception var32) {
            }
            try {
                if (Statics.field1658.startsWith("win")) {
                    if (Statics.field1408 == null) {
                        Statics.field1408 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1408 == null) {
                    Statics.field1408 = System.getenv("HOME");
                }
                if (Statics.field1408 != null) {
                    Statics.field1408 = Statics.field1408 + "/";
                }
            } catch (Exception var31) {
            }
            if (Statics.field1408 == null) {
                Statics.field1408 = "~/";
            }
            Statics.field322 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1408, "/tmp/", "" };
            Statics.field880 = new String[] { ".jagex_cache_" + Statics.field859, ".file_store_" + Statics.field859 };
            label159: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field2257 = class156.method1949("oldschool", var11, var16);
                if (!Statics.field2257.exists()) {
                    Statics.field2257.mkdirs();
                }
                File[] var17 = Statics.field2257.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label159;
                    }
                    File var20 = var18[var19];
                    if (!class156.method1054(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            File var21 = Statics.field2257;
            Statics.field2265 = var21;
            if (!Statics.field2265.exists()) {
                throw new RuntimeException("");
            }
            class158.field2266 = true;
            try {
                File var22 = new File(Statics.field1408, "random.dat");
                if (var22.exists()) {
                    class156.field2259 = new class122(new class123(var22, "rw", 25L), 24, 0);
                } else {
                    label137: for (int var23 = 0; var23 < Statics.field880.length; var23++) {
                        for (int var24 = 0; var24 < Statics.field322.length; var24++) {
                            File var25 = new File(Statics.field322[var24] + Statics.field880[var23] + File.separatorChar + "random.dat");
                            if (var25.exists()) {
                                class156.field2259 = new class122(new class123(var25, "rw", 25L), 24, 0);
                                break label137;
                            }
                        }
                    }
                }
                if (class156.field2259 == null) {
                    RandomAccessFile var26 = new RandomAccessFile(var22, "rw");
                    int var27 = var26.read();
                    var26.seek(0L);
                    var26.write(var27);
                    var26.seek(0L);
                    var26.close();
                    class156.field2259 = new class122(new class123(var22, "rw", 25L), 24, 0);
                }
            } catch (IOException var34) {
            }
            class156.field2262 = new class122(new class123(class158.method2829("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class156.field2261 = new class122(new class123(class158.method2829("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1515 = new class122[Statics.field3669];
            for (int var29 = 0; var29 < Statics.field3669; var29++) {
                Statics.field1515[var29] = new class122(new class123(class158.method2829("main_file_cache.idx" + var29), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var35) {
            class153.method1775((String) null, var35);
        }
        Statics.field1202 = this;
        this.method782(765, 503, 155);
    }

    @ObfuscatedName("client.am(I)V")
    public final void method794() {
        Statics.field2024 = field923 == 0 ? 43594 : field1121 + 40000;
        Statics.field1632 = field923 == 0 ? 443 : field1121 + 50000;
        Statics.field327 = Statics.field2024;
        Statics.field2229 = class215.field2642;
        Statics.field2605 = class215.field2641;
        Statics.field1768 = class215.field2640;
        Statics.field1649 = class215.field2643;
        Statics.field833 = new class148();
        this.method776();
        this.method823();
        Statics.field397 = this.method844();
        Statics.field2553 = new class161(255, class156.field2262, class156.field2261, 500000);
        Statics.field355 = Statics.method130();
        this.method774();
        class57.method1023(this, Statics.field3203);
        if (field923 != 0) {
            field937 = true;
        }
        method1034(Statics.field355.field1306);
    }

    @ObfuscatedName("client.az(I)V")
    public final void method795() {
        field931++;
        this.method1101();
        while (true) {
            class194 var1 = class237.field3238;
            class234 var2;
            synchronized (class237.field3238) {
                var2 = (class234) class237.field3234.method3414();
            }
            if (var2 == null) {
                try {
                    if (class204.field2522 == 1) {
                        int var4 = Statics.field2524.method3557();
                        if (var4 > 0 && Statics.field2524.method3561()) {
                            int var5 = var4 - Statics.field3815;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2524.method3505(var5);
                        } else {
                            Statics.field2524.method3511();
                            Statics.field2524.method3531();
                            if (Statics.field2523 == null) {
                                class204.field2522 = 0;
                            } else {
                                class204.field2522 = 2;
                            }
                            Statics.field517 = null;
                            Statics.field2525 = null;
                        }
                    }
                } catch (Exception var108) {
                    var108.printStackTrace();
                    Statics.field2524.method3511();
                    class204.field2522 = 0;
                    Statics.field517 = null;
                    Statics.field2525 = null;
                    Statics.field2523 = null;
                }
                method225();
                class51 var7 = class51.field664;
                synchronized (class51.field664) {
                    class51.field662++;
                    class51.field667 = class51.field666;
                    class51.field663 = 0;
                    if (class51.field655 >= 0) {
                        while (class51.field658 != class51.field655) {
                            int var9 = class51.field657[class51.field658];
                            class51.field658 = class51.field658 + 1 & 0x7F;
                            if (var9 < 0) {
                                class51.field656[~var9] = false;
                            } else {
                                if (!class51.field656[var9] && class51.field663 < class51.field659.length - 1) {
                                    class51.field659[++class51.field663 - 1] = var9;
                                }
                                class51.field656[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class51.field656[var8] = false;
                        }
                        class51.field655 = class51.field658;
                    }
                    if (class51.field663 > 0) {
                        class51.field662 = 0;
                    }
                    class51.field666 = class51.field665;
                }
                class60 var11 = class60.field740;
                synchronized (class60.field740) {
                    class60.field739 = class60.field741;
                    class60.field746 = class60.field743;
                    class60.field747 = class60.field744;
                    class60.field742 = class60.field750;
                    class60.field753 = class60.field749;
                    class60.field754 = class60.field738;
                    class60.field755 = class60.field751;
                    class60.field750 = 0;
                }
                if (Statics.field397 != null) {
                    int var13 = Statics.field397.method652();
                    field1112 = var13;
                }
                if (field929 == 0) {
                    method1755();
                    class59.method143();
                } else if (field929 == 5) {
                    class91.method2266(this);
                    method1755();
                    class59.method143();
                } else if (field929 == 10 || field929 == 11) {
                    class91.method2266(this);
                } else if (field929 == 20) {
                    class91.method2266(this);
                    this.method1103();
                } else if (field929 == 25) {
                    method228(false);
                    field983 = 0;
                    boolean var14 = true;
                    for (int var15 = 0; var15 < Statics.field530.length; var15++) {
                        if (Statics.field3192[var15] != -1 && Statics.field530[var15] == null) {
                            Statics.field530[var15] = Statics.field3141.method3875(Statics.field3192[var15], 0);
                            if (Statics.field530[var15] == null) {
                                var14 = false;
                                field983++;
                            }
                        }
                        if (Statics.field992[var15] != -1 && Statics.field278[var15] == null) {
                            Statics.field278[var15] = Statics.field3141.method3876(Statics.field992[var15], 0, Statics.field532[var15]);
                            if (Statics.field278[var15] == null) {
                                var14 = false;
                                field983++;
                            }
                        }
                    }
                    if (var14) {
                        field981 = 0;
                        boolean var16 = true;
                        for (int var17 = 0; var17 < Statics.field530.length; var17++) {
                            byte[] var18 = Statics.field278[var17];
                            if (var18 != null) {
                                int var19 = (Statics.field1277[var17] >> 8) * 64 - Statics.field2122;
                                int var20 = (Statics.field1277[var17] & 0xFF) * 64 - Statics.field1505;
                                if (field986) {
                                    var19 = 10;
                                    var20 = 10;
                                }
                                var16 &= class62.method2832(var18, var19, var20);
                            }
                        }
                        if (var16) {
                            if (field1032 != 0) {
                                method81(class226.field2867 + class87.field1385 + class87.field1386 + 100 + "%" + class87.field1383, true);
                            }
                            method225();
                            method232();
                            method225();
                            Statics.field250.method2625();
                            method225();
                            System.gc();
                            for (int var21 = 0; var21 < 4; var21++) {
                                field996[var21].method2833();
                            }
                            for (int var22 = 0; var22 < 4; var22++) {
                                for (int var23 = 0; var23 < 104; var23++) {
                                    for (int var24 = 0; var24 < 104; var24++) {
                                        class62.field765[var22][var23][var24] = 0;
                                    }
                                }
                            }
                            method225();
                            class62.field774 = 99;
                            Statics.field767 = new byte[4][104][104];
                            Statics.field768 = new byte[4][104][104];
                            Statics.field3751 = new byte[4][104][104];
                            Statics.field769 = new byte[4][104][104];
                            Statics.field2351 = new int[4][105][105];
                            Statics.field2412 = new byte[4][105][105];
                            Statics.field763 = new int[105][105];
                            Statics.field2362 = new int[104];
                            Statics.field520 = new int[104];
                            Statics.field263 = new int[104];
                            Statics.field770 = new int[104];
                            Statics.field2333 = new int[104];
                            int var25 = Statics.field530.length;
                            for (class81 var26 = (class81) class81.field1325.method3409(); var26 != null; var26 = (class81) class81.field1325.method3429()) {
                                if (var26.field1314 != null) {
                                    Statics.field1365.method1791(var26.field1314);
                                    var26.field1314 = null;
                                }
                                if (var26.field1316 != null) {
                                    Statics.field1365.method1791(var26.field1316);
                                    var26.field1316 = null;
                                }
                            }
                            class81.field1325.method3416();
                            method228(true);
                            if (!field986) {
                                for (int var27 = 0; var27 < var25; var27++) {
                                    int var28 = (Statics.field1277[var27] >> 8) * 64 - Statics.field2122;
                                    int var29 = (Statics.field1277[var27] & 0xFF) * 64 - Statics.field1505;
                                    byte[] var30 = Statics.field530[var27];
                                    if (var30 != null) {
                                        method225();
                                        class62.method748(var30, var28, var29, Statics.field590 * 8 - 48, Statics.field2246 * 8 - 48, field996);
                                    }
                                }
                                for (int var31 = 0; var31 < var25; var31++) {
                                    int var32 = (Statics.field1277[var31] >> 8) * 64 - Statics.field2122;
                                    int var33 = (Statics.field1277[var31] & 0xFF) * 64 - Statics.field1505;
                                    byte[] var34 = Statics.field530[var31];
                                    if (var34 == null && Statics.field2246 < 800) {
                                        method225();
                                        class62.method711(var32, var33, 64, 64);
                                    }
                                }
                                method228(true);
                                for (int var35 = 0; var35 < var25; var35++) {
                                    byte[] var36 = Statics.field278[var35];
                                    if (var36 != null) {
                                        int var37 = (Statics.field1277[var35] >> 8) * 64 - Statics.field2122;
                                        int var38 = (Statics.field1277[var35] & 0xFF) * 64 - Statics.field1505;
                                        method225();
                                        class62.method2236(var36, var37, var38, Statics.field250, field996);
                                    }
                                }
                            }
                            if (field986) {
                                int var39 = 0;
                                label421: while (true) {
                                    if (var39 >= 4) {
                                        for (int var50 = 0; var50 < 13; var50++) {
                                            for (int var51 = 0; var51 < 13; var51++) {
                                                int var52 = field987[0][var50][var51];
                                                if (var52 == -1) {
                                                    class62.method711(var50 * 8, var51 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method228(true);
                                        int var53 = 0;
                                        while (true) {
                                            if (var53 >= 4) {
                                                break label421;
                                            }
                                            method225();
                                            for (int var54 = 0; var54 < 13; var54++) {
                                                label378: for (int var55 = 0; var55 < 13; var55++) {
                                                    int var56 = field987[var53][var54][var55];
                                                    if (var56 != -1) {
                                                        int var57 = var56 >> 24 & 0x3;
                                                        int var58 = var56 >> 1 & 0x3;
                                                        int var59 = var56 >> 14 & 0x3FF;
                                                        int var60 = var56 >> 3 & 0x7FF;
                                                        int var61 = (var59 / 8 << 8) + var60 / 8;
                                                        for (int var62 = 0; var62 < Statics.field1277.length; var62++) {
                                                            if (Statics.field1277[var62] == var61 && Statics.field278[var62] != null) {
                                                                byte[] var63 = Statics.field278[var62];
                                                                int var64 = var54 * 8;
                                                                int var65 = var55 * 8;
                                                                int var66 = (var59 & 0x7) * 8;
                                                                int var67 = (var60 & 0x7) * 8;
                                                                class138 var68 = Statics.field250;
                                                                class162[] var69 = field996;
                                                                class174 var70 = new class174(var63);
                                                                int var71 = -1;
                                                                while (true) {
                                                                    int var72 = var70.method2969();
                                                                    if (var72 == 0) {
                                                                        continue label378;
                                                                    }
                                                                    var71 += var72;
                                                                    int var73 = 0;
                                                                    while (true) {
                                                                        int var74 = var70.method2969();
                                                                        if (var74 == 0) {
                                                                            break;
                                                                        }
                                                                        var73 += var74 - 1;
                                                                        int var75 = var73 & 0x3F;
                                                                        int var76 = var73 >> 6 & 0x3F;
                                                                        int var77 = var73 >> 12;
                                                                        int var78 = var70.method2955();
                                                                        int var79 = var78 >> 2;
                                                                        int var80 = var78 & 0x3;
                                                                        if (var57 == var77 && var76 >= var66 && var76 < var66 + 8 && var75 >= var67 && var75 < var67 + 8) {
                                                                            class256 var81 = class256.method2710(var71);
                                                                            int var83 = var76 & 0x7;
                                                                            int var84 = var75 & 0x7;
                                                                            int var86 = var81.field3454;
                                                                            int var87 = var81.field3455;
                                                                            if ((var80 & 0x1) == 1) {
                                                                                int var88 = var86;
                                                                                var86 = var87;
                                                                                var87 = var88;
                                                                            }
                                                                            int var89 = var58 & 0x3;
                                                                            int var90;
                                                                            if (var89 == 0) {
                                                                                var90 = var83;
                                                                            } else if (var89 == 1) {
                                                                                var90 = var84;
                                                                            } else if (var89 == 2) {
                                                                                var90 = 7 - var83 - (var86 - 1);
                                                                            } else {
                                                                                var90 = 7 - var84 - (var87 - 1);
                                                                            }
                                                                            int var91 = var64 + var90;
                                                                            int var92 = var65 + class216.method3687(var76 & 0x7, var75 & 0x7, var58, var81.field3454, var81.field3455, var80);
                                                                            if (var91 > 0 && var92 > 0 && var91 < 103 && var92 < 103) {
                                                                                int var93 = var53;
                                                                                if ((class62.field765[1][var91][var92] & 0x2) == 2) {
                                                                                    var93 = var53 - 1;
                                                                                }
                                                                                class162 var94 = null;
                                                                                if (var93 >= 0) {
                                                                                    var94 = var69[var93];
                                                                                }
                                                                                class62.method1510(var53, var91, var92, var71, var58 + var80 & 0x3, var79, var68, var94);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var53++;
                                        }
                                    }
                                    method225();
                                    for (int var40 = 0; var40 < 13; var40++) {
                                        for (int var41 = 0; var41 < 13; var41++) {
                                            boolean var42 = false;
                                            int var43 = field987[var39][var40][var41];
                                            if (var43 != -1) {
                                                int var44 = var43 >> 24 & 0x3;
                                                int var45 = var43 >> 1 & 0x3;
                                                int var46 = var43 >> 14 & 0x3FF;
                                                int var47 = var43 >> 3 & 0x7FF;
                                                int var48 = (var46 / 8 << 8) + var47 / 8;
                                                for (int var49 = 0; var49 < Statics.field1277.length; var49++) {
                                                    if (Statics.field1277[var49] == var48 && Statics.field530[var49] != null) {
                                                        class62.method3249(Statics.field530[var49], var39, var40 * 8, var41 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, field996);
                                                        var42 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var42) {
                                                class62.method17(var39, var40 * 8, var41 * 8);
                                            }
                                        }
                                    }
                                    var39++;
                                }
                            }
                            method228(true);
                            method232();
                            method225();
                            class62.method458(Statics.field250, field996);
                            method228(true);
                            int var95 = class62.field774;
                            if (var95 > Statics.field44) {
                                var95 = Statics.field44;
                            }
                            if (var95 < Statics.field44 - 1) {
                                int var96 = Statics.field44 - 1;
                            }
                            if (field926) {
                                Statics.field250.method2528(class62.field774);
                            } else {
                                Statics.field250.method2528(0);
                            }
                            for (int var97 = 0; var97 < 104; var97++) {
                                for (int var98 = 0; var98 < 104; var98++) {
                                    method643(var97, var98);
                                }
                            }
                            method225();
                            method1773();
                            class256.field3485.method3345();
                            if (Statics.field1202.method803()) {
                                field965.method3210(64);
                                field965.method2942(1057001181);
                            }
                            if (!field986) {
                                int var99 = (Statics.field590 - 6) / 8;
                                int var100 = (Statics.field590 + 6) / 8;
                                int var101 = (Statics.field2246 - 6) / 8;
                                int var102 = (Statics.field2246 + 6) / 8;
                                for (int var103 = var99 - 1; var103 <= var100 + 1; var103++) {
                                    for (int var104 = var101 - 1; var104 <= var102 + 1; var104++) {
                                        if (var103 < var99 || var103 > var100 || var104 < var101 || var104 > var102) {
                                            Statics.field3141.method3925("m" + var103 + "_" + var104);
                                            Statics.field3141.method3925("l" + var103 + "_" + var104);
                                        }
                                    }
                                }
                            }
                            method2525(30);
                            method225();
                            Statics.field767 = (byte[][][]) null;
                            Statics.field768 = (byte[][][]) null;
                            Statics.field3751 = (byte[][][]) null;
                            Statics.field769 = (byte[][][]) null;
                            Statics.field2351 = (int[][][]) null;
                            Statics.field2412 = (byte[][][]) null;
                            Statics.field763 = (int[][]) null;
                            Statics.field2362 = null;
                            Statics.field520 = null;
                            Statics.field263 = null;
                            Statics.field770 = null;
                            Statics.field2333 = null;
                            field965.method3210(254);
                            class59.method143();
                        } else {
                            field1032 = 2;
                        }
                    } else {
                        field1032 = 1;
                    }
                }
                if (field929 == 30) {
                    this.method1104();
                } else if (field929 == 40 || field929 == 45) {
                    this.method1103();
                }
                return;
            }
            var2.field3206.method3975(var2.field3205, (int) var2.field2486, var2.field3204, false);
        }
    }

    @ObfuscatedName("client.av(ZB)V")
    public final void method791(boolean arg0) {
        boolean var2 = class204.method1777();
        if (var2 && field1152 && Statics.field16 != null) {
            Statics.field16.method1925();
        }
        if ((field929 == 10 || field929 == 20 || field929 == 30) && field1127 != 0L && class176.method2725() > field1127) {
            method1034(method135());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field1119[var3] = true;
            }
        }
        if (field929 == 0) {
            this.method798(class91.field1426, class91.field1427, arg0);
        } else if (field929 == 5) {
            class91.method1451(Statics.field828, Statics.field258, Statics.field339, arg0);
        } else if (field929 == 10 || field929 == 11) {
            class91.method1451(Statics.field828, Statics.field258, Statics.field339, arg0);
        } else if (field929 == 20) {
            class91.method1451(Statics.field828, Statics.field258, Statics.field339, arg0);
        } else if (field929 == 25) {
            if (field1032 == 1) {
                if (field983 > field980) {
                    field980 = field983;
                }
                int var4 = (field980 * 50 - field983 * 50) / field980;
                method81(class226.field2867 + class87.field1385 + class87.field1386 + var4 + "%" + class87.field1383, false);
            } else if (field1032 == 2) {
                if (field981 > field1174) {
                    field1174 = field981;
                }
                int var5 = (field1174 * 50 - field981 * 50) / field1174 + 50;
                method81(class226.field2867 + class87.field1385 + class87.field1386 + var5 + "%" + class87.field1383, false);
            } else {
                method81(class226.field2867, false);
            }
        } else if (field929 == 30) {
            this.method1239();
        } else if (field929 == 40) {
            method81(class226.field2868 + class87.field1385 + class226.field2897, false);
        } else if (field929 == 45) {
            method81(class226.field3124, false);
        }
        if (field929 == 30 && field956 == 0 && !arg0 && !field1040) {
            for (int var6 = 0; var6 < field1117; var6++) {
                if (field1120[var6]) {
                    Statics.field276.method754(field1122[var6], field1014[var6], field1088[var6], field1131[var6]);
                    field1120[var6] = false;
                }
            }
        } else if (field929 > 0) {
            Statics.field276.method753(0, 0);
            for (int var7 = 0; var7 < field1117; var7++) {
                field1120[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.an(I)V")
    public final void method797() {
        if (Statics.field2339.method1706()) {
            Statics.field2339.method1729();
        }
        if (Statics.field1654 != null) {
            Statics.field1654.field860 = false;
        }
        Statics.field1654 = null;
        if (Statics.field3676 != null) {
            Statics.field3676.method2791();
            Statics.field3676 = null;
        }
        if (class51.field664 != null) {
            class51 var1 = class51.field664;
            synchronized (class51.field664) {
                class51.field664 = null;
            }
        }
        class60.method197();
        Statics.field397 = null;
        if (Statics.field16 != null) {
            Statics.field16.method1938();
        }
        if (Statics.field567 != null) {
            Statics.field567.method1938();
        }
        class239.method3715();
        Object var3 = class237.field3237;
        synchronized (class237.field3237) {
            if (class237.field3235 != 0) {
                class237.field3235 = 1;
                try {
                    class237.field3237.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field833 != null) {
            Statics.field833.method2716();
            Statics.field833 = null;
        }
        try {
            class156.field2262.method2180();
            for (int var6 = 0; var6 < Statics.field3669; var6++) {
                Statics.field1515[var6].method2180();
            }
            class156.field2261.method2180();
            class156.field2259.method2180();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ek.fj(IB)V")
    public static void method2525(int arg0) {
        if (field929 == arg0) {
            return;
        }
        if (field929 == 0) {
            Statics.field1202.method799();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field954 = 0;
            field1031 = 0;
            field1139 = 0;
            field930.method4624(arg0);
            if (arg0 != 20) {
                method3612(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field689 != null) {
            Statics.field689.method2791();
            Statics.field689 = null;
        }
        if (field929 == 25) {
            field1032 = 0;
            field983 = 0;
            field980 = 1;
            field981 = 0;
            field1174 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class91.method691(Statics.field1194, Statics.field526, true, 0);
        } else if (arg0 == 20) {
            class91.method691(Statics.field1194, Statics.field526, true, field929 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class91.method691(Statics.field1194, Statics.field526, false, 4);
        } else {
            class91.method1453();
        }
        field929 = arg0;
    }

    @ObfuscatedName("client.ff(I)V")
    public void method1101() {
        if (field929 != 1000) {
            boolean var1 = class239.method1776();
            if (!var1) {
                this.method1102();
            }
        }
    }

    @ObfuscatedName("client.fv(B)V")
    public void method1102() {
        if (class239.field3258 >= 4) {
            this.method800("js5crc");
            field929 = 1000;
            return;
        }
        if (class239.field3272 >= 4) {
            if (field929 <= 5) {
                this.method800("js5io");
                field929 = 1000;
                return;
            }
            field1149 = 3000;
            class239.field3272 = 3;
        }
        if (--field1149 + 1 > 0) {
            return;
        }
        try {
            if (field1043 == 0) {
                Statics.field3747 = Statics.field727.method2760(Statics.field703, Statics.field327);
                field1043++;
            }
            if (field1043 == 1) {
                if (Statics.field3747.field2234 == 2) {
                    this.method1307(-1);
                    return;
                }
                if (Statics.field3747.field2234 == 1) {
                    field1043++;
                }
            }
            if (field1043 == 2) {
                Statics.field780 = new class160((Socket) Statics.field3747.field2242, Statics.field727);
                class174 var1 = new class174(5);
                var1.method2970(15);
                var1.method2942(155);
                Statics.field780.method2797(var1.field2409, 0, 5);
                field1043++;
                Statics.field839 = class176.method2725();
            }
            if (field1043 == 3) {
                if (field929 <= 5 || Statics.field780.method2795() > 0) {
                    int var2 = Statics.field780.method2794();
                    if (var2 != 0) {
                        this.method1307(var2);
                        return;
                    }
                    field1043++;
                } else if (class176.method2725() - Statics.field839 > 30000L) {
                    this.method1307(-2);
                    return;
                }
            }
            if (field1043 == 4) {
                class160 var3 = Statics.field780;
                boolean var4 = field929 > 20;
                if (Statics.field3266 != null) {
                    try {
                        Statics.field3266.method2791();
                    } catch (Exception var14) {
                    }
                    Statics.field3266 = null;
                }
                Statics.field3266 = var3;
                class239.method3940(var4);
                class239.field3271.field2405 = 0;
                Statics.field3265 = null;
                Statics.field679 = null;
                class239.field3267 = 0;
                while (true) {
                    class235 var6 = (class235) class239.field3257.method3355();
                    if (var6 == null) {
                        while (true) {
                            class235 var7 = (class235) class239.field3262.method3355();
                            if (var7 == null) {
                                if (class239.field3270 != 0) {
                                    try {
                                        class174 var8 = new class174(4);
                                        var8.method2970(4);
                                        var8.method2970(class239.field3270);
                                        var8.method2940(0);
                                        Statics.field3266.method2797(var8.field2409, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3266.method2791();
                                        } catch (Exception var12) {
                                        }
                                        class239.field3272++;
                                        Statics.field3266 = null;
                                    }
                                }
                                class239.field3253 = 0;
                                Statics.field3269 = class176.method2725();
                                Statics.field3747 = null;
                                Statics.field780 = null;
                                field1043 = 0;
                                field959 = 0;
                                return;
                            }
                            class239.field3259.method3298(var7);
                            class239.field3260.method3358(var7, var7.field2486);
                            class239.field3255++;
                            class239.field3263--;
                        }
                    }
                    class239.field3252.method3358(var6, var6.field2486);
                    class239.field3256++;
                    class239.field3254--;
                }
            }
        } catch (IOException var15) {
            this.method1307(-3);
        }
    }

    @ObfuscatedName("client.fz(IB)V")
    public void method1307(int arg0) {
        Statics.field3747 = null;
        Statics.field780 = null;
        field1043 = 0;
        if (Statics.field327 == Statics.field2024) {
            Statics.field327 = Statics.field1632;
        } else {
            Statics.field327 = Statics.field2024;
        }
        field959++;
        if (field959 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field929 <= 5) {
                this.method800("js5connect_full");
                field929 = 1000;
            } else {
                field1149 = 3000;
            }
        } else if (field959 >= 2 && arg0 == 6) {
            this.method800("js5connect_outofdate");
            field929 = 1000;
        } else if (field959 >= 4) {
            if (field929 <= 5) {
                this.method800("js5connect");
                field929 = 1000;
            } else {
                field1149 = 3000;
            }
        }
    }

    @ObfuscatedName("cm.fk(B)V")
    public static void method1755() {
        if (field950 == 0) {
            Statics.field250 = new class138(4, 104, 104, class62.field781);
            for (int var0 = 0; var0 < 4; var0++) {
                field996[var0] = new class162(104, 104);
            }
            Statics.field34 = new class287(512, 512);
            class91.field1427 = class226.field2870;
            class91.field1426 = 5;
            field950 = 20;
        } else if (field950 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class135.field2016[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class138.method2562(var1, 500, 800, 512, 334);
            class91.field1427 = class226.field2908;
            class91.field1426 = 10;
            field950 = 30;
        } else if (field950 == 30) {
            Statics.field815 = method3503(0, false, true, true);
            Statics.field1502 = method3503(1, false, true, true);
            Statics.field2134 = method3503(2, true, false, true);
            Statics.field919 = method3503(3, false, true, true);
            Statics.field35 = method3503(4, false, true, true);
            Statics.field3141 = method3503(5, true, true, true);
            Statics.field3677 = method3503(6, true, true, false);
            Statics.field1354 = method3503(7, false, true, true);
            Statics.field526 = method3503(8, false, true, true);
            Statics.field255 = method3503(9, false, true, true);
            Statics.field1194 = method3503(10, false, true, true);
            Statics.field2113 = method3503(11, false, true, true);
            Statics.field674 = method3503(12, false, true, true);
            Statics.field459 = method3503(13, true, false, true);
            Statics.field669 = method3503(14, false, true, false);
            Statics.field687 = method3503(15, false, true, true);
            Statics.field584 = method3503(16, false, true, false);
            class91.field1427 = class226.field2872;
            class91.field1426 = 20;
            field950 = 40;
        } else if (field950 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field815.method3971() * 4 / 100;
            int var8 = var7 + Statics.field1502.method3971() * 4 / 100;
            int var9 = var8 + Statics.field2134.method3971() * 2 / 100;
            int var10 = var9 + Statics.field919.method3971() * 2 / 100;
            int var11 = var10 + Statics.field35.method3971() * 6 / 100;
            int var12 = var11 + Statics.field3141.method3971() * 4 / 100;
            int var13 = var12 + Statics.field3677.method3971() * 2 / 100;
            int var14 = var13 + Statics.field1354.method3971() * 58 / 100;
            int var15 = var14 + Statics.field526.method3971() * 2 / 100;
            int var16 = var15 + Statics.field255.method3971() * 2 / 100;
            int var17 = var16 + Statics.field1194.method3971() * 2 / 100;
            int var18 = var17 + Statics.field2113.method3971() * 2 / 100;
            int var19 = var18 + Statics.field674.method3971() * 2 / 100;
            int var20 = var19 + Statics.field459.method3971() * 2 / 100;
            int var21 = var20 + Statics.field669.method3971() * 2 / 100;
            int var22 = var21 + Statics.field687.method3971() * 2 / 100;
            int var23 = var22 + Statics.field584.method3971() * 2 / 100;
            if (var23 == 100) {
                class91.field1427 = class226.field2947;
                class91.field1426 = 30;
                field950 = 45;
            } else {
                if (var23 != 0) {
                    class91.field1427 = class226.field3001 + var23 + "%";
                }
                class91.field1426 = 30;
            }
        } else if (field950 == 45) {
            boolean var24 = !field926;
            Statics.field463 = 22050;
            Statics.field491 = var24;
            Statics.field321 = 2;
            class205 var25 = new class205();
            var25.method3513(9, 128);
            Statics.field16 = class108.method2867(Statics.field727, 0, 22050);
            Statics.field16.method1933(var25);
            class238 var26 = Statics.field687;
            class238 var27 = Statics.field669;
            class238 var28 = Statics.field35;
            Statics.field2519 = var26;
            Statics.field2520 = var27;
            Statics.field2518 = var28;
            Statics.field2524 = var25;
            Statics.field567 = class108.method2867(Statics.field727, 1, 2048);
            Statics.field1365 = new class101();
            Statics.field567.method1933(Statics.field1365);
            Statics.field2114 = new class115(22050, Statics.field463);
            class91.field1427 = class226.field2875;
            class91.field1426 = 35;
            field950 = 50;
            Statics.field800 = new class263(Statics.field526, Statics.field459);
        } else if (field950 == 50) {
            int var29 = class262.method4456().length;
            field933 = Statics.field800.method4462(class262.method4456());
            if (field933.size() < var29) {
                class91.field1427 = class226.field2944 + field933.size() * 100 / var29 + "%";
                class91.field1426 = 40;
            } else {
                Statics.field258 = (class264) field933.get(class262.field3629);
                Statics.field339 = (class264) field933.get(class262.field3625);
                Statics.field828 = (class264) field933.get(class262.field3626);
                Statics.field379 = new class293(true);
                class91.field1427 = class226.field2877;
                class91.field1426 = 40;
                field950 = 60;
            }
        } else if (field950 == 60) {
            class238 var30 = Statics.field1194;
            class238 var31 = Statics.field526;
            int var32 = 0;
            if (var30.method3895("title.jpg", "")) {
                var32++;
            }
            if (var31.method3895("logo", "")) {
                var32++;
            }
            if (var31.method3895("logo_deadman_mode", "")) {
                var32++;
            }
            if (var31.method3895("titlebox", "")) {
                var32++;
            }
            if (var31.method3895("titlebutton", "")) {
                var32++;
            }
            if (var31.method3895("runes", "")) {
                var32++;
            }
            if (var31.method3895("title_mute", "")) {
                var32++;
            }
            if (var31.method3895("options_radio_buttons,0", "")) {
                var32++;
            }
            if (var31.method3895("options_radio_buttons,2", "")) {
                var32++;
            }
            if (var31.method3895("options_radio_buttons,4", "")) {
                var32++;
            }
            if (var31.method3895("options_radio_buttons,6", "")) {
                var32++;
            }
            var31.method3895("sl_back", "");
            var31.method3895("sl_flags", "");
            var31.method3895("sl_arrows", "");
            var31.method3895("sl_stars", "");
            var31.method3895("sl_button", "");
            byte var35 = 11;
            if (var32 < var35) {
                class91.field1427 = class226.field2878 + var32 * 100 / var35 + "%";
                class91.field1426 = 50;
            } else {
                class91.field1427 = class226.field3115;
                class91.field1426 = 50;
                method2525(5);
                field950 = 70;
            }
        } else if (field950 == 70) {
            if (Statics.field2134.method3949()) {
                class260.method2888(Statics.field2134);
                class238 var37 = Statics.field2134;
                Statics.field3342 = var37;
                class238 var38 = Statics.field2134;
                class238 var39 = Statics.field1354;
                Statics.field3358 = var38;
                Statics.field3350 = var39;
                Statics.field3351 = Statics.field3358.method3889(3);
                class256.method10(Statics.field2134, Statics.field1354, field926);
                class259.method1677(Statics.field2134, Statics.field1354);
                class253.method3690(Statics.field2134);
                class238 var40 = Statics.field2134;
                class238 var41 = Statics.field1354;
                boolean var42 = field925;
                class264 var43 = Statics.field258;
                Statics.field301 = var40;
                Statics.field1407 = var41;
                Statics.field617 = var42;
                Statics.field3145 = Statics.field301.method3889(10);
                Statics.field3489 = var43;
                class238 var44 = Statics.field2134;
                class238 var45 = Statics.field815;
                class238 var46 = Statics.field1502;
                Statics.field3612 = var44;
                Statics.field3605 = var45;
                Statics.field3619 = var46;
                class246.method928(Statics.field2134, Statics.field1354);
                class238 var47 = Statics.field2134;
                Statics.field3381 = var47;
                class242.method1705(Statics.field2134);
                class238 var48 = Statics.field919;
                class238 var49 = Statics.field1354;
                class238 var50 = Statics.field526;
                class238 var51 = Statics.field459;
                Statics.field2046 = var48;
                Statics.field2783 = var49;
                Statics.field2682 = var50;
                Statics.field2652 = var51;
                Statics.field2433 = new class217[Statics.field2046.method3887()][];
                Statics.field2649 = new boolean[Statics.field2046.method3887()];
                class241.method1778(Statics.field2134);
                class238 var52 = Statics.field2134;
                Statics.field3406 = var52;
                class238 var53 = Statics.field2134;
                Statics.field3312 = var53;
                class238 var54 = Statics.field2134;
                Statics.field3320 = var54;
                class252.method1037(Statics.field2134);
                Statics.field2339 = new class96();
                class238 var55 = Statics.field2134;
                class238 var56 = Statics.field526;
                class238 var57 = Statics.field459;
                Statics.field3421 = var55;
                Statics.field3412 = var56;
                Statics.field3413 = var57;
                class238 var58 = Statics.field2134;
                class238 var59 = Statics.field526;
                Statics.field3367 = var58;
                Statics.field3362 = var59;
                class243.method2879(Statics.field2134, Statics.field526);
                class91.field1427 = class226.field2881;
                class91.field1426 = 60;
                field950 = 80;
            } else {
                class91.field1427 = class226.field3101 + Statics.field2134.method3977() + "%";
                class91.field1426 = 60;
            }
        } else if (field950 == 80) {
            int var60 = 0;
            if (Statics.field306 == null) {
                Statics.field306 = class288.method1031(Statics.field526, "compass", "");
            } else {
                var60++;
            }
            if (Statics.field303 == null) {
                Statics.field303 = class288.method1031(Statics.field526, "mapedge", "");
            } else {
                var60++;
            }
            if (Statics.field3820 == null) {
                Statics.field3820 = class288.method1046(Statics.field526, "mapscene", "");
            } else {
                var60++;
            }
            if (Statics.field2130 == null) {
                Statics.field2130 = class288.method588(Statics.field526, "headicons_pk", "");
            } else {
                var60++;
            }
            if (Statics.field512 == null) {
                Statics.field512 = class288.method588(Statics.field526, "headicons_prayer", "");
            } else {
                var60++;
            }
            if (Statics.field416 == null) {
                Statics.field416 = class288.method588(Statics.field526, "headicons_hint", "");
            } else {
                var60++;
            }
            if (Statics.field688 == null) {
                Statics.field688 = class288.method588(Statics.field526, "mapmarker", "");
            } else {
                var60++;
            }
            if (Statics.field336 == null) {
                Statics.field336 = class288.method588(Statics.field526, "cross", "");
            } else {
                var60++;
            }
            if (Statics.field756 == null) {
                Statics.field756 = class288.method588(Statics.field526, "mapdots", "");
            } else {
                var60++;
            }
            if (Statics.field433 == null) {
                Statics.field433 = class288.method1046(Statics.field526, "scrollbar", "");
            } else {
                var60++;
            }
            if (Statics.field17 == null) {
                Statics.field17 = class288.method1046(Statics.field526, "mod_icons", "");
            } else {
                var60++;
            }
            if (var60 < 11) {
                class91.field1427 = class226.field2895 + var60 * 100 / 12 + "%";
                class91.field1426 = 70;
            } else {
                Statics.field3663 = Statics.field17;
                Statics.field303.method4796();
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3820[0].method4780(var61 + var64, var62 + var64, var63 + var64);
                class91.field1427 = class226.field2883;
                class91.field1426 = 70;
                field950 = 90;
            }
        } else if (field950 == 90) {
            if (Statics.field255.method3949()) {
                class124 var65 = new class124(Statics.field255, Statics.field526, 20, 0.8D, field926 ? 64 : 128);
                class135.method2485(var65);
                class135.method2510(0.8D);
                class91.field1427 = class226.field2885;
                class91.field1426 = 90;
                field950 = 110;
            } else {
                class91.field1427 = class226.field2884 + Statics.field255.method3977() + "%";
                class91.field1426 = 90;
            }
        } else if (field950 == 110) {
            Statics.field1654 = new class71();
            Statics.field727.method2774(Statics.field1654, 10);
            class91.field1427 = class226.field2886;
            class91.field1426 = 92;
            field950 = 120;
        } else if (field950 == 120) {
            if (Statics.field1194.method3895("huffman", "")) {
                class166 var66 = new class166(Statics.field1194.method3962("huffman", ""));
                class266.method4074(var66);
                class91.field1427 = class226.field2888;
                class91.field1426 = 94;
                field950 = 130;
            } else {
                class91.field1427 = class226.field2887 + "%";
                class91.field1426 = 94;
            }
        } else if (field950 == 130) {
            if (!Statics.field919.method3949()) {
                class91.field1427 = class226.field2889 + Statics.field919.method3977() * 4 / 5 + "%";
                class91.field1426 = 96;
            } else if (!Statics.field674.method3949()) {
                class91.field1427 = class226.field2889 + (80 + Statics.field674.method3977() / 6) + "%";
                class91.field1426 = 96;
            } else if (Statics.field459.method3949()) {
                class91.field1427 = class226.field2917;
                class91.field1426 = 98;
                field950 = 140;
            } else {
                class91.field1427 = class226.field2889 + (96 + Statics.field459.method3977() / 50) + "%";
                class91.field1426 = 96;
            }
        } else if (field950 == 140) {
            class91.field1426 = 100;
            if (Statics.field584.method3945(class41.field562.field560)) {
                if (Statics.field2191 == null) {
                    Statics.field2191 = new class290();
                    Statics.field2191.method4939(Statics.field584, Statics.field828, field933, Statics.field3820);
                }
                int var67 = Statics.field2191.method4940();
                if (var67 < 100) {
                    class91.field1427 = class226.field2891 + (var67 * 9 / 10 + 10) + "%";
                } else {
                    class91.field1427 = class226.field2892;
                    field950 = 150;
                }
            } else {
                class91.field1427 = class226.field2891 + Statics.field584.method3898(class41.field562.field560) / 10 + "%";
            }
        } else if (field950 == 150) {
            method2525(10);
        }
    }

    @ObfuscatedName("gx.fo(IZZZB)Lij;")
    public static class238 method3503(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2262 != null) {
            var4 = new class161(arg0, class156.field2262, Statics.field1515[arg0], 1000000);
        }
        return new class238(var4, Statics.field2553, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fe(B)V")
    public final void method1103() {
        try {
            if (field954 == 0) {
                if (Statics.field3676 != null) {
                    Statics.field3676.method2791();
                    Statics.field3676 = null;
                }
                Statics.field672 = null;
                field1146 = false;
                field1031 = 0;
                field954 = 1;
            }
            if (field954 == 1) {
                if (Statics.field672 == null) {
                    Statics.field672 = Statics.field727.method2760(Statics.field703, Statics.field327);
                }
                if (Statics.field672.field2234 == 2) {
                    throw new IOException();
                }
                if (Statics.field672.field2234 == 1) {
                    Statics.field3676 = new class160((Socket) Statics.field672.field2242, Statics.field727);
                    Statics.field672 = null;
                    field954 = 2;
                }
            }
            if (field954 == 2) {
                field965.field2405 = 0;
                field965.method2970(14);
                Statics.field3676.method2797(field965.field2409, 0, 1);
                field967.field2405 = 0;
                field954 = 3;
            }
            if (field954 == 3) {
                if (Statics.field16 != null) {
                    Statics.field16.method1937();
                }
                if (Statics.field567 != null) {
                    Statics.field567.method1937();
                }
                int var1 = Statics.field3676.method2794();
                if (Statics.field16 != null) {
                    Statics.field16.method1937();
                }
                if (Statics.field567 != null) {
                    Statics.field567.method1937();
                }
                if (var1 != 0) {
                    method3968(var1);
                    return;
                }
                field967.field2405 = 0;
                field954 = 4;
            }
            if (field954 == 4) {
                if (field967.field2405 < 8) {
                    int var2 = Statics.field3676.method2795();
                    if (var2 > 8 - field967.field2405) {
                        var2 = 8 - field967.field2405;
                    }
                    if (var2 > 0) {
                        Statics.field3676.method2796(field967.field2409, field967.field2405, var2);
                        field967.field2405 += var2;
                    }
                }
                if (field967.field2405 == 8) {
                    field967.field2405 = 0;
                    Statics.field876 = field967.method3004();
                    field954 = 5;
                }
            }
            if (field954 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field876 >> 32), (int) (Statics.field876 & 0xFFFFFFFFFFFFFFFFL) };
                field965.field2405 = 0;
                field965.method2970(1);
                field965.method2970(field958.method12());
                field965.method2942(var3[0]);
                field965.method2942(var3[1]);
                field965.method2942(var3[2]);
                field965.method2942(var3[3]);
                switch(field958.field2212) {
                    case 0:
                        field965.field2405 += 8;
                        break;
                    case 1:
                    case 3:
                        field965.method2941(Statics.field2043);
                        field965.field2405 += 5;
                        break;
                    case 2:
                        class180 var4 = field965;
                        LinkedHashMap var5 = Statics.field355.field1309;
                        String var6 = class91.field1432;
                        int var7 = var6.length();
                        int var8 = 0;
                        for (int var9 = 0; var9 < var7; var9++) {
                            var8 = (var8 << 5) - var8 + var6.charAt(var9);
                        }
                        var4.method2942((Integer) var5.get(var8));
                        field965.field2405 += 4;
                }
                field965.method3041(class91.field1433);
                field965.method3149(class89.field1399, class89.field1398);
                field966.field2405 = 0;
                if (field929 == 40) {
                    field966.method2970(18);
                } else {
                    field966.method2970(16);
                }
                field966.method2940(0);
                int var11 = field966.field2405;
                field966.method2942(155);
                field966.method2949(field965.field2409, 0, field965.field2405);
                int var12 = field966.field2405;
                field966.method3041(class91.field1432);
                field966.method2970((field1040 ? 1 : 0) << 1 | (field926 ? 1 : 0));
                field966.method2940(Statics.field762);
                field966.method2940(Statics.field633);
                class180 var13 = field966;
                if (field982 == null) {
                    byte[] var14 = class156.method2711();
                    var13.method2949(var14, 0, var14.length);
                } else {
                    var13.method2949(field982, 0, field982.length);
                }
                field966.method3041(Statics.field2203);
                field966.method2942(Statics.field1378);
                class174 var15 = new class174(Statics.field379.method5122());
                Statics.field379.method5130(var15);
                field966.method2949(var15.field2409, 0, var15.field2409.length);
                field966.method2970(Statics.field928);
                field966.method2942(0);
                field966.method2942(Statics.field815.field3220);
                field966.method2942(Statics.field1502.field3220);
                field966.method2942(Statics.field2134.field3220);
                field966.method2942(Statics.field919.field3220);
                field966.method2942(Statics.field35.field3220);
                field966.method2942(Statics.field3141.field3220);
                field966.method2942(Statics.field3677.field3220);
                field966.method2942(Statics.field1354.field3220);
                field966.method2942(Statics.field526.field3220);
                field966.method2942(Statics.field255.field3220);
                field966.method2942(Statics.field1194.field3220);
                field966.method2942(Statics.field2113.field3220);
                field966.method2942(Statics.field674.field3220);
                field966.method2942(Statics.field459.field3220);
                field966.method2942(Statics.field669.field3220);
                field966.method2942(Statics.field687.field3220);
                field966.method2942(Statics.field584.field3220);
                field966.method2975(var3, var12, field966.field2405);
                field966.method2978(field966.field2405 - var11);
                Statics.field3676.method2797(field966.field2409, 0, field966.field2405);
                field965.method3230(var3);
                for (int var16 = 0; var16 < 4; var16++) {
                    var3[var16] += 50;
                }
                field967.method3230(var3);
                field954 = 6;
            }
            if (field954 == 6 && Statics.field3676.method2795() > 0) {
                int var17 = Statics.field3676.method2794();
                if (var17 == 21 && field929 == 20) {
                    field954 = 7;
                } else if (var17 == 2) {
                    field954 = 9;
                } else if (var17 == 15 && field929 == 40) {
                    field1171 = -1;
                    field954 = 13;
                } else if (var17 == 23 && field1139 < 1) {
                    field1139++;
                    field954 = 0;
                } else if (var17 == 29) {
                    field954 = 11;
                } else {
                    method3968(var17);
                    return;
                }
            }
            if (field954 == 7 && Statics.field3676.method2795() > 0) {
                field1018 = (Statics.field3676.method2794() + 3) * 60;
                field954 = 8;
            }
            if (field954 == 8) {
                field1031 = 0;
                class91.method4(class226.field2896, class226.field3026, field1018 / 60 + class226.field2898);
                if (--field1018 <= 0) {
                    field954 = 0;
                }
            } else {
                if (field954 == 9 && Statics.field3676.method2795() >= 13) {
                    boolean var18 = Statics.field3676.method2794() == 1;
                    Statics.field3676.method2796(field967.field2409, 0, 4);
                    field967.field2405 = 0;
                    boolean var19 = false;
                    if (var18) {
                        int var20 = field967.method3235() << 24;
                        int var21 = var20 | field967.method3235() << 16;
                        int var22 = var21 | field967.method3235() << 8;
                        int var23 = var22 | field967.method3235();
                        String var24 = class91.field1432;
                        int var25 = var24.length();
                        int var26 = 0;
                        for (int var27 = 0; var27 < var25; var27++) {
                            var26 = (var26 << 5) - var26 + var24.charAt(var27);
                        }
                        if (Statics.field355.field1309.size() >= 10 && !Statics.field355.field1309.containsKey(var26)) {
                            Iterator var30 = Statics.field355.field1309.entrySet().iterator();
                            var30.next();
                            var30.remove();
                        }
                        Statics.field355.field1309.put(var26, var23);
                    }
                    if (class91.field1415) {
                        Statics.field355.field1307 = class91.field1432;
                    } else {
                        Statics.field355.field1307 = null;
                    }
                    class80.method51();
                    field1081 = Statics.field3676.method2794();
                    field1083 = Statics.field3676.method2794() == 1;
                    field1179 = Statics.field3676.method2794();
                    field1179 <<= 0x8;
                    field1179 += Statics.field3676.method2794();
                    field1036 = Statics.field3676.method2794();
                    Statics.field3676.method2796(field967.field2409, 0, 1);
                    field967.field2405 = 0;
                    field969 = field967.method3235();
                    Statics.field3676.method2796(field967.field2409, 0, 2);
                    field967.field2405 = 0;
                    field1171 = field967.method3035();
                    try {
                        class53.method694(Statics.field1202, "zap");
                    } catch (Throwable var37) {
                    }
                    field954 = 10;
                }
                if (field954 != 10) {
                    if (field954 == 11 && Statics.field3676.method2795() >= 2) {
                        field967.field2405 = 0;
                        Statics.field3676.method2796(field967.field2409, 0, 2);
                        field967.field2405 = 0;
                        Statics.field614 = field967.method3035();
                        field954 = 12;
                    }
                    if (field954 == 12 && Statics.field3676.method2795() >= Statics.field614) {
                        field967.field2405 = 0;
                        Statics.field3676.method2796(field967.field2409, 0, Statics.field614);
                        field967.field2405 = 0;
                        String var32 = field967.method2964();
                        String var33 = field967.method2964();
                        String var34 = field967.method2964();
                        class91.method4(var32, var33, var34);
                        method2525(10);
                    }
                    if (field954 == 13) {
                        if (field1171 == -1) {
                            if (Statics.field3676.method2795() < 2) {
                                return;
                            }
                            Statics.field3676.method2796(field967.field2409, 0, 2);
                            field967.field2405 = 0;
                            field1171 = field967.method3035();
                        }
                        if (Statics.field3676.method2795() >= field1171) {
                            Statics.field3676.method2796(field967.field2409, 0, field1171);
                            field967.field2405 = 0;
                            int var35 = field1171;
                            field930.method4647();
                            method2740();
                            class95.method233(field967);
                            if (field967.field2405 != var35) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field1031++;
                        if (field1031 > 2000) {
                            if (field1139 < 1) {
                                if (Statics.field327 == Statics.field2024) {
                                    Statics.field327 = Statics.field1632;
                                } else {
                                    Statics.field327 = Statics.field2024;
                                }
                                field1139++;
                                field954 = 0;
                            } else {
                                method3968(-3);
                            }
                        }
                    }
                } else if (Statics.field3676.method2795() >= field1171) {
                    field967.field2405 = 0;
                    Statics.field3676.method2796(field967.field2409, 0, field1171);
                    field930.method4628();
                    method236();
                    class95.method233(field967);
                    Statics.field590 = -1;
                    method1630(false);
                    field969 = -1;
                }
            }
        } catch (IOException var38) {
            if (field1139 < 1) {
                if (Statics.field327 == Statics.field2024) {
                    Statics.field327 = Statics.field1632;
                } else {
                    Statics.field327 = Statics.field2024;
                }
                field1139++;
                field954 = 0;
            } else {
                method3968(-2);
            }
        }
    }

    @ObfuscatedName("ag.fg(I)V")
    public static void method236() {
        field1145 = 1L;
        field935 = -1;
        Statics.field1654.field862 = 0;
        Statics.field596 = true;
        field936 = true;
        field1138 = -1L;
        class282.method2524();
        field965.field2405 = 0;
        field967.field2405 = 0;
        field969 = -1;
        field972 = -1;
        field973 = -1;
        field1098 = -1;
        field970 = 0;
        field984 = 0;
        field975 = 0;
        field939 = 0;
        field1028 = 0;
        field1052 = false;
        class60.method1740(0);
        class97.field1513.clear();
        class97.field1509.method3315();
        class97.field1510.method3482();
        class97.field1511 = 0;
        field974 = 0;
        field1069 = false;
        field1155 = 0;
        field997 = 0;
        field1184 = 0;
        field1141 = -1;
        field951 = 0;
        field1147 = 0;
        field947 = class90.field1404;
        field948 = class90.field1404;
        field961 = 0;
        class95.field1486 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class95.field1479[var0] = null;
            class95.field1478[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field1034[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field960[var2] = null;
        }
        field1062 = -1;
        field1046.method3416();
        field1047.method3416();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field1044[var3][var4][var5] = null;
                }
            }
        }
        field1045 = new class194();
        field1181 = 0;
        field952 = 0;
        field1183 = 0;
        for (int var6 = 0; var6 < Statics.field2453; var6++) {
            class242 var7 = class242.method3180(var6);
            if (var7 != null) {
                class212.field2619[var6] = 0;
                class212.field2621[var6] = 0;
            }
        }
        Statics.field2339.method1711();
        field1082 = -1;
        if (field1074 != -1) {
            class217.method3773(field1074);
        }
        for (class68 var8 = (class68) field1075.method3355(); var8 != null; var8 = (class68) field1075.method3356()) {
            method1452(var8, true);
        }
        field1074 = -1;
        field1075 = new class191(8);
        field1078 = null;
        field1028 = 0;
        field1052 = false;
        field1180.method3763((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field989[var9] = null;
            field1041[var9] = false;
        }
        class64.field799 = new class191(32);
        field1124 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field1119[var10] = true;
        }
        field965.method3210(151);
        field965.method2970(method135());
        field965.method2940(Statics.field762);
        field965.method2940(Statics.field633);
        field978 = null;
        Statics.field350 = 0;
        Statics.field451 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field938[var11] = new class17();
        }
        Statics.field331 = null;
    }

    @ObfuscatedName("eg.fh(I)V")
    public static void method2740() {
        field965.field2405 = 0;
        field967.field2405 = 0;
        field969 = -1;
        field972 = -1;
        field973 = -1;
        field1098 = -1;
        field1171 = 0;
        field970 = 0;
        field984 = 0;
        field1028 = 0;
        field1052 = false;
        field1184 = 0;
        field951 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1034[var0] = null;
        }
        Statics.field2427 = null;
        for (int var1 = 0; var1 < field960.length; var1++) {
            class85 var2 = field960[var1];
            if (var2 != null) {
                var2.field1234 = -1;
                var2.field1235 = false;
            }
        }
        class64.field799 = new class191(32);
        method2525(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1119[var3] = true;
        }
        field965.method3210(151);
        field965.method2970(method135());
        field965.method2940(Statics.field762);
        field965.method2940(Statics.field633);
    }

    @ObfuscatedName("ip.fw(IB)V")
    public static void method3968(int arg0) {
        if (arg0 == -3) {
            class91.method4(class226.field2899, class226.field2900, class226.field2901);
        } else if (arg0 == -2) {
            class91.method4(class226.field2902, class226.field2903, class226.field3055);
        } else if (arg0 == -1) {
            class91.method4(class226.field2905, class226.field2906, class226.field3009);
        } else if (arg0 == 3) {
            class91.field1434 = 3;
        } else if (arg0 == 4) {
            class91.method4(class226.field2977, class226.field3030, class226.field2910);
        } else if (arg0 == 5) {
            class91.method4(class226.field2960, class226.field2962, class226.field3095);
        } else if (arg0 == 6) {
            class91.method4(class226.field2914, class226.field3065, class226.field2992);
        } else if (arg0 == 7) {
            class91.method4(class226.field2918, class226.field2909, class226.field3019);
        } else if (arg0 == 8) {
            class91.method4(class226.field2920, class226.field2952, class226.field2922);
        } else if (arg0 == 9) {
            class91.method4(class226.field2931, class226.field2924, class226.field2925);
        } else if (arg0 == 10) {
            class91.method4(class226.field2926, class226.field2927, class226.field2928);
        } else if (arg0 == 11) {
            class91.method4(class226.field2929, class226.field3024, class226.field3090);
        } else if (arg0 == 12) {
            class91.method4(class226.field2932, class226.field2933, class226.field2934);
        } else if (arg0 == 13) {
            class91.method4(class226.field3112, class226.field2936, class226.field2937);
        } else if (arg0 == 14) {
            class91.method4(class226.field2938, class226.field2939, class226.field2940);
        } else if (arg0 == 16) {
            class91.method4(class226.field2941, class226.field2942, class226.field2943);
        } else if (arg0 == 17) {
            class91.method4(class226.field2874, class226.field2945, class226.field2946);
        } else if (arg0 == 18) {
            class91.method4(class226.field3049, class226.field2948, class226.field3015);
        } else if (arg0 == 19) {
            class91.method4(class226.field2950, class226.field2976, class226.field3070);
        } else if (arg0 == 20) {
            class91.method4(class226.field2904, class226.field2954, class226.field2955);
        } else if (arg0 == 22) {
            class91.method4(class226.field2961, class226.field2921, class226.field2958);
        } else if (arg0 == 23) {
            class91.method4(class226.field3140, class226.field2953, class226.field3121);
        } else if (arg0 == 24) {
            class91.method4(class226.field3089, class226.field2963, class226.field2964);
        } else if (arg0 == 25) {
            class91.method4(class226.field2965, class226.field2951, class226.field2861);
        } else if (arg0 == 26) {
            class91.method4(class226.field2968, class226.field2969, class226.field2970);
        } else if (arg0 == 27) {
            class91.method4(class226.field2971, class226.field3005, class226.field2973);
        } else if (arg0 == 31) {
            class91.method4(class226.field2935, class226.field2981, class226.field3129);
        } else if (arg0 == 32) {
            class91.method4(class226.field2983, class226.field2984, class226.field2985);
        } else if (arg0 == 37) {
            class91.method4(class226.field2986, class226.field2987, class226.field2913);
        } else if (arg0 == 38) {
            class91.method4(class226.field2989, class226.field2990, class226.field3046);
        } else if (arg0 == 55) {
            class91.method4(class226.field3041, class226.field2993, class226.field2994);
        } else if (arg0 == 56) {
            class91.method4(class226.field2995, class226.field2996, class226.field2997);
            method2525(11);
            return;
        } else if (arg0 == 57) {
            class91.method4(class226.field2998, class226.field2999, class226.field3050);
            method2525(11);
            return;
        } else {
            class91.method4(class226.field2930, class226.field3002, class226.field3003);
        }
        method2525(10);
    }

    @ObfuscatedName("fa.ft(B)V")
    public static final void method3255() {
        if (Statics.field3676 != null) {
            Statics.field3676.method2791();
            Statics.field3676 = null;
        }
        method232();
        Statics.field250.method2625();
        for (int var0 = 0; var0 < 4; var0++) {
            field996[var0].method2833();
        }
        System.gc();
        class204.method2697(2);
        field1087 = -1;
        field1152 = false;
        for (class81 var1 = (class81) class81.field1325.method3409(); var1 != null; var1 = (class81) class81.field1325.method3429()) {
            if (var1.field1314 != null) {
                Statics.field1365.method1791(var1.field1314);
                var1.field1314 = null;
            }
            if (var1.field1316 != null) {
                Statics.field1365.method1791(var1.field1316);
                var1.field1316 = null;
            }
        }
        class81.field1325.method3416();
        method2525(10);
    }

    @ObfuscatedName("ad.fs(I)V")
    public static final void method232() {
        class260.method305();
        class247.field3340.method3345();
        class248.field3354.method3345();
        class256.field3441.method3345();
        class256.field3485.method3345();
        class256.field3442.method3345();
        class256.field3478.method3345();
        class259.field3564.method3345();
        class259.field3557.method3345();
        class257.field3493.method3345();
        class257.field3494.method3345();
        class257.field3510.method3345();
        class261.field3608.method3345();
        class261.field3606.method3345();
        class246.field3323.method3345();
        class246.field3324.method3345();
        class251.field3380.method3345();
        class242.method1638();
        class255.method4062();
        class249.field3363.method3345();
        class249.field3364.method3345();
        class253.method2788();
        class252.method1097();
        class243.method142();
        class214.field2629.method3345();
        class217.method2722();
        ((class124) Statics.field2019).method2260();
        class98.field1519.method3345();
        Statics.field815.method3935();
        Statics.field1502.method3935();
        Statics.field919.method3935();
        Statics.field35.method3935();
        Statics.field3141.method3935();
        Statics.field3677.method3935();
        Statics.field1354.method3935();
        Statics.field526.method3935();
        Statics.field255.method3935();
        Statics.field1194.method3935();
        Statics.field2113.method3935();
        Statics.field674.method3935();
    }

    @ObfuscatedName("fr.fx(I)V")
    public static final void method2831() {
        if (field975 > 0) {
            method3255();
        } else {
            field930.method4626();
            method2525(40);
            Statics.field689 = Statics.field3676;
            Statics.field3676 = null;
        }
    }

    @ObfuscatedName("gy.fd(ZI)V")
    public static final void method3612(boolean arg0) {
        if (arg0) {
            field958 = class91.field1439 ? class150.field2208 : class150.field2213;
            return;
        }
        LinkedHashMap var1 = Statics.field355.field1309;
        String var2 = class91.field1432;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field958 = var1.containsKey(var4) ? class150.field2211 : class150.field2210;
    }

    @ObfuscatedName("client.fn(I)V")
    public final void method1104() {
        if (field984 > 1) {
            field984--;
        }
        if (field975 > 0) {
            field975--;
        }
        if (field1146) {
            field1146 = false;
            method2831();
            return;
        }
        if (!field1052) {
            field1028 = 0;
            field1052 = false;
            field1058[0] = class226.field3096;
            field1059[0] = "";
            field1056[0] = 1006;
            field1022[0] = false;
            field1028 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1107(); var1++) {
        }
        if (field929 != 30) {
            return;
        }
        while (class282.method1674()) {
            field965.method3210(255);
            field965.method2970(0);
            int var2 = field965.field2405;
            class282.method1048(field965);
            field965.method3006(field965.field2405 - var2);
        }
        if (field930.field3736) {
            field965.method3210(70);
            field965.method2970(0);
            int var3 = field965.field2405;
            field930.method4631(field965);
            field965.method3006(field965.field2405 - var3);
            field930.method4629();
        }
        Object var4 = Statics.field1654.field861;
        synchronized (Statics.field1654.field861) {
            if (!field1189) {
                Statics.field1654.field862 = 0;
            } else if (class60.field742 != 0 || Statics.field1654.field862 >= 40) {
                field965.method3210(212);
                field965.method2970(0);
                int var5 = field965.field2405;
                int var6 = 0;
                for (int var7 = 0; var7 < Statics.field1654.field862 && field965.field2405 - var5 < 240; var7++) {
                    var6++;
                    int var8 = Statics.field1654.field864[var7];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 502) {
                        var8 = 502;
                    }
                    int var9 = Statics.field1654.field863[var7];
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 764) {
                        var9 = 764;
                    }
                    int var10 = var8 * 765 + var9;
                    if (Statics.field1654.field864[var7] == -1 && Statics.field1654.field863[var7] == -1) {
                        var9 = -1;
                        var8 = -1;
                        var10 = 524287;
                    }
                    if (field1011 != var9 || field934 != var8) {
                        int var11 = var9 - field1011;
                        field1011 = var9;
                        int var12 = var8 - field934;
                        field934 = var8;
                        if (field935 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                            var11 += 32;
                            var12 += 32;
                            field965.method2940((field935 << 12) + (var11 << 6) + var12);
                            field935 = 0;
                        } else if (field935 < 8) {
                            field965.method2941((field935 << 19) + 8388608 + var10);
                            field935 = 0;
                        } else {
                            field965.method2942((field935 << 19) + -1073741824 + var10);
                            field935 = 0;
                        }
                    } else if (field935 < 2047) {
                        field935++;
                    }
                }
                field965.method3006(field965.field2405 - var5);
                if (var6 >= Statics.field1654.field862) {
                    Statics.field1654.field862 = 0;
                } else {
                    Statics.field1654.field862 -= var6;
                    for (int var13 = 0; var13 < Statics.field1654.field862; var13++) {
                        Statics.field1654.field863[var13] = Statics.field1654.field863[var6 + var13];
                        Statics.field1654.field864[var13] = Statics.field1654.field864[var6 + var13];
                    }
                }
            }
        }
        if (class60.field742 == 1 || !Statics.field1651 && class60.field742 == 4 || class60.field742 == 2) {
            long var15 = (class60.field755 - field1145 * -1L) / 50L;
            if (var15 > 4095L) {
                var15 = 4095L;
            }
            field1145 = class60.field755 * -1L;
            int var17 = class60.field754;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > Statics.field633) {
                var17 = Statics.field633;
            }
            int var18 = class60.field753;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > Statics.field762) {
                var18 = Statics.field762;
            }
            int var19 = (int) var15;
            field965.method3210(24);
            field965.method2940((var19 << 1) + (class60.field742 == 2 ? 1 : 0));
            field965.method2940(var18);
            field965.method2940(var17);
        }
        if (class51.field663 > 0) {
            field965.method3210(55);
            field965.method2940(0);
            int var20 = field965.field2405;
            long var21 = class176.method2725();
            for (int var23 = 0; var23 < class51.field663; var23++) {
                long var24 = var21 - field1138;
                if (var24 > 16777215L) {
                    var24 = 16777215L;
                }
                field1138 = var21;
                field965.method3026((int) var24);
                field965.method2982(class51.field659[var23]);
            }
            field965.method2978(field965.field2405 - var20);
        }
        if (field971 > 0) {
            field971--;
        }
        if (class51.field656[96] || class51.field656[97] || class51.field656[98] || class51.field656[99]) {
            field1004 = true;
        }
        if (field1004 && field971 <= 0) {
            field971 = 20;
            field1004 = false;
            field965.method3210(56);
            field965.method3102(field997);
            field965.method3084(field922);
        }
        if (Statics.field596 && !field936) {
            field936 = true;
            field965.method3210(41);
            field965.method2970(1);
        }
        if (!Statics.field596 && field936) {
            field936 = false;
            field965.method3210(41);
            field965.method2970(0);
        }
        if (Statics.field44 != field1141) {
            field1141 = Statics.field44;
            int var26 = Statics.field44;
            int[] var27 = Statics.field34.field3796;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                var27[var29] = 0;
            }
            for (int var30 = 1; var30 < 103; var30++) {
                int var31 = (103 - var30) * 2048 + 24628;
                for (int var32 = 1; var32 < 103; var32++) {
                    if ((class62.field765[var26][var32][var30] & 0x18) == 0) {
                        Statics.field250.method2561(var27, var31, 512, var26, var32, var30);
                    }
                    if (var26 < 3 && (class62.field765[var26 + 1][var32][var30] & 0x8) != 0) {
                        Statics.field250.method2561(var27, var31, 512, var26 + 1, var32, var30);
                    }
                    var31 += 4;
                }
            }
            int var33 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var34 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field34.method4788();
            for (int var35 = 1; var35 < 103; var35++) {
                for (int var36 = 1; var36 < 103; var36++) {
                    if ((class62.field765[var26][var36][var35] & 0x18) == 0) {
                        method450(var26, var36, var35, var33, var34);
                    }
                    if (var26 < 3 && (class62.field765[var26 + 1][var36][var35] & 0x8) != 0) {
                        method450(var26 + 1, var36, var35, var33, var34);
                    }
                }
            }
            field1142 = 0;
            for (int var37 = 0; var37 < 104; var37++) {
                for (int var38 = 0; var38 < 104; var38++) {
                    int var39 = Statics.field250.method2611(Statics.field44, var37, var38);
                    if (var39 != 0) {
                        int var40 = var39 >> 14 & 0x7FFF;
                        int var41 = class256.method2710(var40).field3467;
                        if (var41 >= 0) {
                            field1177[field1142] = Statics.field25[var41].method4037(false);
                            field1143[field1142] = var37;
                            field1144[field1142] = var38;
                            field1142++;
                        }
                    }
                }
            }
            Statics.field276.method4764();
        }
        if (field929 != 30) {
            return;
        }
        method562();
        method1036();
        field970++;
        if (field970 > 750) {
            method2831();
            return;
        }
        int var42 = class95.field1486;
        int[] var43 = class95.field1481;
        for (int var44 = 0; var44 < var42; var44++) {
            class74 var45 = field1034[var43[var44]];
            if (var45 != null) {
                method551(var45, 1);
            }
        }
        for (int var46 = 0; var46 < field961; var46++) {
            int var47 = field1029[var46];
            class85 var48 = field960[var47];
            if (var48 != null) {
                method551(var48, var48.field1370.field3560);
            }
        }
        method7();
        field1123++;
        if (field1023 != 0) {
            field1172 += 20;
            if (field1172 >= 400) {
                field1023 = 0;
            }
        }
        if (Statics.field2032 != null) {
            field1024++;
            if (field1024 >= 15) {
                method165(Statics.field2032);
                Statics.field2032 = null;
            }
        }
        class217 var49 = Statics.field404;
        class217 var50 = Statics.field636;
        Statics.field404 = null;
        Statics.field636 = null;
        field953 = null;
        field1095 = false;
        field1092 = false;
        field1135 = 0;
        while (class51.method1() && field1135 < 128) {
            if (field1081 >= 2 && class51.field656[82] && Statics.field1492 == 66) {
                String var51 = class97.method1528();
                Statics.field1202.method775(var51);
            } else {
                field1137[field1135] = Statics.field1492;
                field1186[field1135] = Statics.field1547;
                field1135++;
            }
        }
        boolean var52 = field1081 >= 2;
        if (var52 && class51.field656[82] && class51.field656[81] && field1112 != 0) {
            int var53 = Statics.field2427.field895 - field1112;
            if (var53 < 0) {
                var53 = 0;
            } else if (var53 > 3) {
                var53 = 3;
            }
            if (Statics.field2427.field895 != var53) {
                int var54 = Statics.field2122 + Statics.field2427.field1263[0];
                int var55 = Statics.field1505 + Statics.field2427.field1264[0];
                field965.method3210(201);
                field965.method3084(var55);
                field965.method2989(var54);
                field965.method2982(var53);
            }
            field1112 = 0;
        }
        if (field1074 != -1) {
            int var56 = field1074;
            int var57 = Statics.field762;
            int var58 = Statics.field633;
            if (class217.method1688(var56)) {
                method93(Statics.field2433[var56], -1, 0, 0, var57, var58, 0, 0);
            }
        }
        field1099++;
        while (true) {
            class69 var59;
            class217 var60;
            class217 var61;
            do {
                var59 = (class69) field1126.method3414();
                if (var59 == null) {
                    while (true) {
                        class69 var62;
                        class217 var63;
                        class217 var64;
                        do {
                            var62 = (class69) field1091.method3414();
                            if (var62 == null) {
                                while (true) {
                                    class69 var65;
                                    class217 var66;
                                    class217 var67;
                                    do {
                                        var65 = (class69) field1113.method3414();
                                        if (var65 == null) {
                                            this.method1108();
                                            if (Statics.field2191 != null) {
                                                Statics.field2191.method4948(Statics.field44, (Statics.field2427.field1243 >> 7) + Statics.field2122, (Statics.field2427.field1209 >> 7) + Statics.field1505, false);
                                                Statics.field2191.method4995();
                                            }
                                            if (field1053 != null) {
                                                this.method1402();
                                            }
                                            if (Statics.field916 != null) {
                                                method165(Statics.field916);
                                                field1128++;
                                                if (class60.field739 == 0) {
                                                    if (field1106) {
                                                        if (Statics.field916 == Statics.field2271 && field1114 != field1026) {
                                                            class217 var68 = Statics.field916;
                                                            byte var69 = 0;
                                                            if (field1077 == 1 && var68.field2663 == 206) {
                                                                var69 = 1;
                                                            }
                                                            if (var68.field2765[field1114] <= 0) {
                                                                var69 = 0;
                                                            }
                                                            if (class218.method483(method4068(var68))) {
                                                                int var70 = field1026;
                                                                int var71 = field1114;
                                                                var68.field2765[var71] = var68.field2765[var70];
                                                                var68.field2778[var71] = var68.field2778[var70];
                                                                var68.field2765[var70] = -1;
                                                                var68.field2778[var70] = 0;
                                                            } else if (var69 == 1) {
                                                                int var72 = field1026;
                                                                int var73 = field1114;
                                                                while (var72 != var73) {
                                                                    if (var72 > var73) {
                                                                        var68.method3780(var72 - 1, var72);
                                                                        var72--;
                                                                    } else if (var72 < var73) {
                                                                        var68.method3780(var72 + 1, var72);
                                                                        var72++;
                                                                    }
                                                                }
                                                            } else {
                                                                var68.method3780(field1114, field1026);
                                                            }
                                                            field965.method3210(185);
                                                            field965.method2989(field1114);
                                                            field965.method2998(Statics.field916.field2739);
                                                            field965.method3102(field1026);
                                                            field965.method2980(var69);
                                                        }
                                                    } else if (this.method1109()) {
                                                        this.method1110(field1027, field1136);
                                                    } else if (field1028 > 0) {
                                                        method1454(field1027, field1136);
                                                    }
                                                    field1024 = 10;
                                                    class60.field742 = 0;
                                                    Statics.field916 = null;
                                                } else if (field1128 >= 5 && (class60.field746 > field1027 + 5 || class60.field746 < field1027 - 5 || class60.field747 > field1136 + 5 || class60.field747 < field1136 - 5)) {
                                                    field1106 = true;
                                                }
                                            }
                                            if (class138.method2575()) {
                                                int var74 = class138.field2101;
                                                int var75 = class138.field2083;
                                                field965.method3210(99);
                                                field965.method2970(5);
                                                field965.method2980(class51.field656[82] ? (class51.field656[81] ? 2 : 1) : 0);
                                                field965.method3102(Statics.field2122 + var74);
                                                field965.method2940(Statics.field1505 + var75);
                                                class138.method2566();
                                                field1020 = class60.field753;
                                                field1021 = class60.field754;
                                                field1023 = 1;
                                                field1172 = 0;
                                                field951 = var74;
                                                field1147 = var75;
                                            }
                                            if (Statics.field404 != var49) {
                                                if (var49 != null) {
                                                    method165(var49);
                                                }
                                                if (Statics.field404 != null) {
                                                    method165(Statics.field404);
                                                }
                                            }
                                            if (Statics.field636 != var50 && field1066 == field1065) {
                                                if (var50 != null) {
                                                    method165(var50);
                                                }
                                                if (Statics.field636 != null) {
                                                    method165(Statics.field636);
                                                }
                                            }
                                            if (Statics.field636 == null) {
                                                if (field1065 > 0) {
                                                    field1065--;
                                                }
                                            } else if (field1065 < field1066) {
                                                field1065++;
                                                if (field1066 == field1065) {
                                                    method165(Statics.field636);
                                                }
                                            }
                                            method1449();
                                            if (field1161) {
                                                int var76 = Statics.field1657 * 128 + 64;
                                                int var77 = Statics.field802 * 128 + 64;
                                                int var78 = method2209(var76, var77, Statics.field44) - Statics.field304;
                                                if (Statics.field2622 < var76) {
                                                    Statics.field2622 += Statics.field831 * (var76 - Statics.field2622) / 1000 + Statics.field2821;
                                                    if (Statics.field2622 > var76) {
                                                        Statics.field2622 = var76;
                                                    }
                                                }
                                                if (Statics.field2622 > var76) {
                                                    Statics.field2622 -= Statics.field831 * (Statics.field2622 - var76) / 1000 + Statics.field2821;
                                                    if (Statics.field2622 < var76) {
                                                        Statics.field2622 = var76;
                                                    }
                                                }
                                                if (Statics.field794 < var78) {
                                                    Statics.field794 += Statics.field831 * (var78 - Statics.field794) / 1000 + Statics.field2821;
                                                    if (Statics.field794 > var78) {
                                                        Statics.field794 = var78;
                                                    }
                                                }
                                                if (Statics.field794 > var78) {
                                                    Statics.field794 -= Statics.field831 * (Statics.field794 - var78) / 1000 + Statics.field2821;
                                                    if (Statics.field794 < var78) {
                                                        Statics.field794 = var78;
                                                    }
                                                }
                                                if (Statics.field1545 < var77) {
                                                    Statics.field1545 += Statics.field831 * (var77 - Statics.field1545) / 1000 + Statics.field2821;
                                                    if (Statics.field1545 > var77) {
                                                        Statics.field1545 = var77;
                                                    }
                                                }
                                                if (Statics.field1545 > var77) {
                                                    Statics.field1545 -= Statics.field831 * (Statics.field1545 - var77) / 1000 + Statics.field2821;
                                                    if (Statics.field1545 < var77) {
                                                        Statics.field1545 = var77;
                                                    }
                                                }
                                                int var79 = Statics.field673 * 128 + 64;
                                                int var80 = Statics.field515 * 128 + 64;
                                                int var81 = method2209(var79, var80, Statics.field44) - Statics.field2360;
                                                int var82 = var79 - Statics.field2622;
                                                int var83 = var81 - Statics.field794;
                                                int var84 = var80 - Statics.field1545;
                                                int var85 = (int) Math.sqrt((double) (var82 * var82 + var84 * var84));
                                                int var86 = (int) (Math.atan2((double) var83, (double) var85) * 325.949D) & 0x7FF;
                                                int var87 = (int) (Math.atan2((double) var82, (double) var84) * -325.949D) & 0x7FF;
                                                if (var86 < 128) {
                                                    var86 = 128;
                                                }
                                                if (var86 > 383) {
                                                    var86 = 383;
                                                }
                                                if (Statics.field257 < var86) {
                                                    Statics.field257 += Statics.field428 * (var86 - Statics.field257) / 1000 + Statics.field2455;
                                                    if (Statics.field257 > var86) {
                                                        Statics.field257 = var86;
                                                    }
                                                }
                                                if (Statics.field257 > var86) {
                                                    Statics.field257 -= Statics.field428 * (Statics.field257 - var86) / 1000 + Statics.field2455;
                                                    if (Statics.field257 < var86) {
                                                        Statics.field257 = var86;
                                                    }
                                                }
                                                int var88 = var87 - Statics.field2419;
                                                if (var88 > 1024) {
                                                    var88 -= 2048;
                                                }
                                                if (var88 < -1024) {
                                                    var88 += 2048;
                                                }
                                                if (var88 > 0) {
                                                    Statics.field2419 += Statics.field428 * var88 / 1000 + Statics.field2455;
                                                    Statics.field2419 &= 0x7FF;
                                                }
                                                if (var88 < 0) {
                                                    Statics.field2419 -= Statics.field428 * -var88 / 1000 + Statics.field2455;
                                                    Statics.field2419 &= 0x7FF;
                                                }
                                                int var89 = var87 - Statics.field2419;
                                                if (var89 > 1024) {
                                                    var89 -= 2048;
                                                }
                                                if (var89 < -1024) {
                                                    var89 += 2048;
                                                }
                                                if (var89 < 0 && var88 > 0 || var89 > 0 && var88 < 0) {
                                                    Statics.field2419 = var87;
                                                }
                                            }
                                            for (int var90 = 0; var90 < 5; var90++) {
                                                int var10002 = field1166[var90]++;
                                            }
                                            Statics.field2339.method1715();
                                            int var91 = class60.method161();
                                            int var92 = class51.method235();
                                            if (var91 > 15000 && var92 > 15000) {
                                                field975 = 250;
                                                class60.method1740(14500);
                                                field965.method3210(149);
                                            }
                                            for (class67 var93 = (class67) field999.method3454(); var93 != null; var93 = (class67) field999.method3460()) {
                                                if ((long) var93.field834 < class176.method2725() / 1000L - 5L) {
                                                    if (var93.field829 > 0) {
                                                        class97.method1053(5, "", var93.field830 + class226.field3004);
                                                    }
                                                    if (var93.field829 == 0) {
                                                        class97.method1053(5, "", var93.field830 + class226.field3117);
                                                    }
                                                    var93.method3466();
                                                }
                                            }
                                            field1116++;
                                            if (field1116 > 50) {
                                                field965.method3210(40);
                                            }
                                            try {
                                                if (Statics.field3676 != null && field965.field2405 > 0) {
                                                    Statics.field3676.method2797(field965.field2409, 0, field965.field2405);
                                                    field965.field2405 = 0;
                                                    field1116 = 0;
                                                }
                                            } catch (IOException var95) {
                                                method2831();
                                            }
                                            return;
                                        }
                                        var66 = var65.field854;
                                        if (var66.field2660 < 0) {
                                            break;
                                        }
                                        var67 = class217.method3237(var66.field2678);
                                    } while (var67 == null || var67.field2705 == null || var66.field2660 >= var67.field2705.length || var67.field2705[var66.field2660] != var66);
                                    class82.method2853(var65);
                                }
                            }
                            var63 = var62.field854;
                            if (var63.field2660 < 0) {
                                break;
                            }
                            var64 = class217.method3237(var63.field2678);
                        } while (var64 == null || var64.field2705 == null || var63.field2660 >= var64.field2705.length || var64.field2705[var63.field2660] != var63);
                        class82.method2853(var62);
                    }
                }
                var60 = var59.field854;
                if (var60.field2660 < 0) {
                    break;
                }
                var61 = class217.method3237(var60.field2678);
            } while (var61 == null || var61.field2705 == null || var60.field2660 >= var61.field2705.length || var61.field2705[var60.field2660] != var60);
            class82.method2853(var59);
        }
    }

    @ObfuscatedName("ah.fa(B)V")
    public static final void method225() {
        if (Statics.field567 != null) {
            Statics.field567.method1924();
        }
        if (Statics.field16 != null) {
            Statics.field16.method1924();
        }
    }

    @ObfuscatedName("bu.gj(B)V")
    public static final void method1036() {
        for (int var0 = 0; var0 < field1155; var0++) {
            int var10002 = field1158[var0]--;
            if (field1158[var0] >= -10) {
                class104 var2 = field1104[var0];
                if (var2 == null) {
                    class104 var10000 = (class104) null;
                    var2 = class104.method1850(Statics.field35, field1156[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1158[var0] += var2.method1852();
                    field1104[var0] = var2;
                }
                if (field1158[var0] < 0) {
                    int var9;
                    if (field1159[var0] == 0) {
                        var9 = field943;
                    } else {
                        int var3 = (field1159[var0] & 0xFF) * 128;
                        int var4 = field1159[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2427.field1243;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1159[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2427.field1209;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1158[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1115 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class106 var10 = var2.method1851().method1893(Statics.field2114);
                        class116 var11 = class116.method2018(var10, 100, var9);
                        var11.method2142(field1157[var0] - 1);
                        Statics.field1365.method1821(var11);
                    }
                    field1158[var0] = -100;
                }
            } else {
                field1155--;
                for (int var1 = var0; var1 < field1155; var1++) {
                    field1156[var1] = field1156[var1 + 1];
                    field1104[var1] = field1104[var1 + 1];
                    field1157[var1] = field1157[var1 + 1];
                    field1158[var1] = field1158[var1 + 1];
                    field1159[var1] = field1159[var1 + 1];
                }
                var0--;
            }
        }
        if (!field1152) {
            return;
        }
        boolean var12;
        if (class204.field2522 == 0) {
            var12 = Statics.field2524.method3561();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field977 != 0 && field1087 != -1) {
                class204.method2819(Statics.field3677, field1087, 0, field977, false);
            }
            field1152 = false;
        }
    }

    @ObfuscatedName("gi.gd(Ljl;IIII)V")
    public static void method3617(class261 arg0, int arg1, int arg2, int arg3) {
        if (field1155 >= 50 || field1115 == 0 || arg0.field3614 == null || arg1 >= arg0.field3614.length) {
            return;
        }
        int var4 = arg0.field3614[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1156[field1155] = var5;
        field1157[field1155] = var6;
        field1158[field1155] = 0;
        field1104[field1155] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1159[field1155] = (var8 << 16) + (var9 << 8) + var7;
        field1155++;
    }

    @ObfuscatedName("bk.gm(IIII)V")
    public static void method1039(int arg0, int arg1, int arg2) {
        if (field943 == 0 || arg1 == 0 || field1155 >= 50) {
            return;
        }
        field1156[field1155] = arg0;
        field1157[field1155] = arg1;
        field1158[field1155] = arg2;
        field1104[field1155] = null;
        field1159[field1155] = 0;
        field1155++;
    }

    @ObfuscatedName("l.ge(Lhj;III)V")
    public static final void method154(class217 arg0, int arg1, int arg2) {
        if (field1184 != 0 && field1184 != 3 || class60.field742 != 1 && Statics.field1651 || class60.field742 != 4) {
            return;
        }
        class211 var3 = arg0.method3784(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field753 - arg1;
        int var5 = class60.field754 - arg2;
        if (!var3.method3709(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2616 / 2;
        int var7 = var5 - var3.field2612 / 2;
        int var8 = field997 & 0x7FF;
        int var9 = class135.field2016[var8];
        int var10 = class135.field2023[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2427.field1243 + var11 >> 7;
        int var14 = Statics.field2427.field1209 - var12 >> 7;
        field965.method3210(116);
        field965.method2970(18);
        field965.method2980(class51.field656[82] ? (class51.field656[81] ? 2 : 1) : 0);
        field965.method3102(Statics.field2122 + var13);
        field965.method2940(Statics.field1505 + var14);
        field965.method2970(var6);
        field965.method2970(var7);
        field965.method2940(field997);
        field965.method2970(57);
        field965.method2970(0);
        field965.method2970(0);
        field965.method2970(89);
        field965.method2940(Statics.field2427.field1243);
        field965.method2940(Statics.field2427.field1209);
        field965.method2970(63);
        field951 = var13;
        field1147 = var14;
    }

    @ObfuscatedName("e.gc(I)V")
    public static final void method7() {
        int[] var0 = class95.field1481;
        for (int var1 = 0; var1 < class95.field1486; var1++) {
            class74 var2 = field1034[var0[var1]];
            if (var2 != null && var2.field1224 > 0) {
                var2.field1224--;
                if (var2.field1224 == 0) {
                    var2.field1221 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field961; var3++) {
            int var4 = field1029[var3];
            class85 var5 = field960[var4];
            if (var5 != null && var5.field1224 > 0) {
                var5.field1224--;
                if (var5.field1224 == 0) {
                    var5.field1221 = null;
                }
            }
        }
    }

    @ObfuscatedName("hx.gr(Ljava/lang/String;I)V")
    public static final void method3716(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field355.field1304 = !Statics.field355.field1304;
            class80.method51();
            if (Statics.field355.field1304) {
                class97.method1053(99, "", "Roofs are now all hidden");
            } else {
                class97.method1053(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field937 = !field937;
        }
        if (field1081 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field244) {
                    class8.field244 = true;
                    class8.field245 = class12.field271;
                } else if (class8.field245 == class12.field271) {
                    class8.field244 = true;
                    class8.field245 = class12.field273;
                } else {
                    class8.field244 = false;
                }
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field937 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field937 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2831();
            }
            if (arg0.equalsIgnoreCase("errortest") && field923 == 2) {
                throw new RuntimeException();
            }
        }
        field965.method3210(153);
        field965.method2970(arg0.length() + 1);
        field965.method3041(arg0);
    }

    @ObfuscatedName("bz.gb(I)V")
    public static final void method1449() {
        int var0 = Statics.field2427.field1243;
        int var1 = Statics.field2427.field1209;
        if (Statics.field2141 - var0 < -500 || Statics.field2141 - var0 > 500 || Statics.field570 - var1 < -500 || Statics.field570 - var1 > 500) {
            Statics.field2141 = var0;
            Statics.field570 = var1;
        }
        if (Statics.field2141 != var0) {
            Statics.field2141 += (var0 - Statics.field2141) / 16;
        }
        if (Statics.field570 != var1) {
            Statics.field570 += (var1 - Statics.field570) / 16;
        }
        if (class60.field739 == 4 && Statics.field1651) {
            int var2 = class60.field747 - field1001;
            field942 = var2 * 2;
            field1001 = var2 == -1 || var2 == 1 ? class60.field747 : (field1001 + class60.field747) / 2;
            int var3 = field1154 - class60.field746;
            field1150 = var3 * 2;
            field1154 = var3 == -1 || var3 == 1 ? class60.field746 : (field1154 + class60.field746) / 2;
        } else {
            if (class51.field656[96]) {
                field1150 += (-24 - field1150) / 2;
            } else if (class51.field656[97]) {
                field1150 += (24 - field1150) / 2;
            } else {
                field1150 /= 2;
            }
            if (class51.field656[98]) {
                field942 += (12 - field942) / 2;
            } else if (class51.field656[99]) {
                field942 += (-12 - field942) / 2;
            } else {
                field942 /= 2;
            }
            field1001 = class60.field747;
            field1154 = class60.field746;
        }
        field997 = field1150 / 2 + field997 & 0x7FF;
        field922 += field942 / 2;
        if (field922 < 128) {
            field922 = 128;
        }
        if (field922 > 383) {
            field922 = 383;
        }
        int var4 = Statics.field2141 >> 7;
        int var5 = Statics.field570 >> 7;
        int var6 = method2209(Statics.field2141, Statics.field570, Statics.field44);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field44;
                    if (var10 < 3 && (class62.field765[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field781[var10][var8][var9];
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
        if (var12 > field1125) {
            field1125 += (var12 - field1125) / 24;
        } else if (var12 < field1125) {
            field1125 += (var12 - field1125) / 80;
        }
    }

    @ObfuscatedName("at.gl(Lbs;II)V")
    public static final void method551(class77 arg0, int arg1) {
        if (arg0.field1256 > field931) {
            method1091(arg0);
        } else if (arg0.field1255 >= field931) {
            method121(arg0);
        } else {
            arg0.field1254 = arg0.field1249;
            if (arg0.field1213 == 0) {
                arg0.field1252 = 0;
            } else {
                label309: {
                    if (arg0.field1240 != -1 && arg0.field1245 == 0) {
                        class261 var2 = class261.method3613(arg0.field1240);
                        if (arg0.field1242 > 0 && var2.field3620 == 0) {
                            arg0.field1252++;
                            break label309;
                        }
                        if (arg0.field1242 <= 0 && var2.field3621 == 0) {
                            arg0.field1252++;
                            break label309;
                        }
                    }
                    int var3 = arg0.field1243;
                    int var4 = arg0.field1209;
                    int var5 = arg0.field1263[arg0.field1213 - 1] * 128 + arg0.field1212 * 64;
                    int var6 = arg0.field1264[arg0.field1213 - 1] * 128 + arg0.field1212 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field1259 = 1280;
                        } else if (var4 > var6) {
                            arg0.field1259 = 1792;
                        } else {
                            arg0.field1259 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field1259 = 768;
                        } else if (var4 > var6) {
                            arg0.field1259 = 256;
                        } else {
                            arg0.field1259 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field1259 = 1024;
                    } else if (var4 > var6) {
                        arg0.field1259 = 0;
                    }
                    byte var7 = arg0.field1265[arg0.field1213 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field1259 - arg0.field1210 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field1261;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field1216;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field1219;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field1218;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field1216;
                        }
                        arg0.field1254 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class85) {
                            var11 = ((class85) arg0).field1370.field3590;
                        }
                        if (var11) {
                            if (arg0.field1259 != arg0.field1210 && arg0.field1234 == -1 && arg0.field1266 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field1213 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field1213 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field1252 > 0 && arg0.field1213 > 1) {
                                var10 = 8;
                                arg0.field1252--;
                            }
                        } else {
                            if (arg0.field1213 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field1213 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field1252 > 0 && arg0.field1213 > 1) {
                                var10 = 8;
                                arg0.field1252--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field1254 == arg0.field1216 && arg0.field1220 != -1) {
                            arg0.field1254 = arg0.field1220;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field1243 += var10;
                                if (arg0.field1243 > var5) {
                                    arg0.field1243 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field1243 -= var10;
                                if (arg0.field1243 < var5) {
                                    arg0.field1243 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field1209 += var10;
                                if (arg0.field1209 > var6) {
                                    arg0.field1209 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field1209 -= var10;
                                if (arg0.field1209 < var6) {
                                    arg0.field1209 = var6;
                                }
                            }
                        }
                        if (arg0.field1243 == var5 && arg0.field1209 == var6) {
                            arg0.field1213--;
                            if (arg0.field1242 > 0) {
                                arg0.field1242--;
                            }
                        }
                    } else {
                        arg0.field1243 = var5;
                        arg0.field1209 = var6;
                        arg0.field1213--;
                        if (arg0.field1242 > 0) {
                            arg0.field1242--;
                        }
                    }
                }
            }
        }
        if (arg0.field1243 < 128 || arg0.field1209 < 128 || arg0.field1243 >= 13184 || arg0.field1209 >= 13184) {
            arg0.field1240 = -1;
            arg0.field1260 = -1;
            arg0.field1256 = 0;
            arg0.field1255 = 0;
            arg0.field1243 = arg0.field1263[0] * 128 + arg0.field1212 * 64;
            arg0.field1209 = arg0.field1264[0] * 128 + arg0.field1212 * 64;
            arg0.method1456();
        }
        if (Statics.field2427 == arg0 && (arg0.field1243 < 1536 || arg0.field1209 < 1536 || arg0.field1243 >= 11776 || arg0.field1209 >= 11776)) {
            arg0.field1240 = -1;
            arg0.field1260 = -1;
            arg0.field1256 = 0;
            arg0.field1255 = 0;
            arg0.field1243 = arg0.field1263[0] * 128 + arg0.field1212 * 64;
            arg0.field1209 = arg0.field1264[0] * 128 + arg0.field1212 * 64;
            arg0.method1456();
        }
        if (arg0.field1266 != 0) {
            if (arg0.field1234 != -1) {
                class77 var12 = null;
                if (arg0.field1234 < 32768) {
                    var12 = field960[arg0.field1234];
                } else if (arg0.field1234 >= 32768) {
                    var12 = field1034[arg0.field1234 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field1243 - var12.field1243;
                    int var14 = arg0.field1209 - var12.field1209;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field1259 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1235) {
                    arg0.field1234 = -1;
                    arg0.field1235 = false;
                }
            }
            if (arg0.field1236 != -1 && (arg0.field1213 == 0 || arg0.field1252 > 0)) {
                arg0.field1259 = arg0.field1236;
                arg0.field1236 = -1;
            }
            int var15 = arg0.field1259 - arg0.field1210 & 0x7FF;
            if (var15 == 0 && arg0.field1235) {
                arg0.field1234 = -1;
                arg0.field1235 = false;
            }
            if (var15 == 0) {
                arg0.field1253 = 0;
            } else {
                arg0.field1253++;
                if (var15 > 1024) {
                    arg0.field1210 -= arg0.field1266;
                    boolean var16 = true;
                    if (var15 < arg0.field1266 || var15 > 2048 - arg0.field1266) {
                        arg0.field1210 = arg0.field1259;
                        var16 = false;
                    }
                    if (arg0.field1254 == arg0.field1249 && (arg0.field1253 > 25 || var16)) {
                        if (arg0.field1267 == -1) {
                            arg0.field1254 = arg0.field1216;
                        } else {
                            arg0.field1254 = arg0.field1267;
                        }
                    }
                } else {
                    arg0.field1210 += arg0.field1266;
                    boolean var17 = true;
                    if (var15 < arg0.field1266 || var15 > 2048 - arg0.field1266) {
                        arg0.field1210 = arg0.field1259;
                        var17 = false;
                    }
                    if (arg0.field1254 == arg0.field1249 && (arg0.field1253 > 25 || var17)) {
                        if (arg0.field1214 == -1) {
                            arg0.field1254 = arg0.field1216;
                        } else {
                            arg0.field1254 = arg0.field1214;
                        }
                    }
                }
                arg0.field1210 &= 0x7FF;
            }
        }
        method4249(arg0);
    }

    @ObfuscatedName("be.gn(Lbs;I)V")
    public static final void method1091(class77 arg0) {
        int var1 = arg0.field1256 - field931;
        int var2 = arg0.field1237 * 128 + arg0.field1212 * 64;
        int var3 = arg0.field1230 * 128 + arg0.field1212 * 64;
        arg0.field1243 += (var2 - arg0.field1243) / var1;
        arg0.field1209 += (var3 - arg0.field1209) / var1;
        arg0.field1252 = 0;
        arg0.field1259 = arg0.field1262;
    }

    @ObfuscatedName("x.gp(Lbs;S)V")
    public static final void method121(class77 arg0) {
        if (field931 == arg0.field1255 || arg0.field1240 == -1 || arg0.field1245 != 0 || arg0.field1208 + 1 > class261.method3613(arg0.field1240).field3611[arg0.field1241]) {
            int var1 = arg0.field1255 - arg0.field1256;
            int var2 = field931 - arg0.field1256;
            int var3 = arg0.field1237 * 128 + arg0.field1212 * 64;
            int var4 = arg0.field1230 * 128 + arg0.field1212 * 64;
            int var5 = arg0.field1251 * 128 + arg0.field1212 * 64;
            int var6 = arg0.field1217 * 128 + arg0.field1212 * 64;
            arg0.field1243 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1209 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1252 = 0;
        arg0.field1259 = arg0.field1262;
        arg0.field1210 = arg0.field1259;
    }

    @ObfuscatedName("in.gs(Lbs;I)V")
    public static final void method4249(class77 arg0) {
        arg0.field1211 = false;
        if (arg0.field1254 != -1) {
            class261 var1 = class261.method3613(arg0.field1254);
            if (var1 == null || var1.field3622 == null) {
                arg0.field1254 = -1;
            } else {
                arg0.field1239++;
                if (arg0.field1228 < var1.field3622.length && arg0.field1239 > var1.field3611[arg0.field1228]) {
                    arg0.field1239 = 1;
                    arg0.field1228++;
                    method3617(var1, arg0.field1228, arg0.field1243, arg0.field1209);
                }
                if (arg0.field1228 >= var1.field3622.length) {
                    arg0.field1239 = 0;
                    arg0.field1228 = 0;
                    method3617(var1, arg0.field1228, arg0.field1243, arg0.field1209);
                }
            }
        }
        if (arg0.field1260 != -1 && field931 >= arg0.field1248) {
            if (arg0.field1250 < 0) {
                arg0.field1250 = 0;
            }
            int var2 = class246.method2787(arg0.field1260).field3327;
            if (var2 == -1) {
                arg0.field1260 = -1;
            } else {
                class261 var3 = class261.method3613(var2);
                if (var3 == null || var3.field3622 == null) {
                    arg0.field1260 = -1;
                } else {
                    arg0.field1247++;
                    if (arg0.field1250 < var3.field3622.length && arg0.field1247 > var3.field3611[arg0.field1250]) {
                        arg0.field1247 = 1;
                        arg0.field1250++;
                        method3617(var3, arg0.field1250, arg0.field1243, arg0.field1209);
                    }
                    if (arg0.field1250 >= var3.field3622.length && (arg0.field1250 < 0 || arg0.field1250 >= var3.field3622.length)) {
                        arg0.field1260 = -1;
                    }
                }
            }
        }
        if (arg0.field1240 != -1 && arg0.field1245 <= 1) {
            class261 var4 = class261.method3613(arg0.field1240);
            if (var4.field3620 == 1 && arg0.field1242 > 0 && arg0.field1256 <= field931 && arg0.field1255 < field931) {
                arg0.field1245 = 1;
                return;
            }
        }
        if (arg0.field1240 != -1 && arg0.field1245 == 0) {
            class261 var5 = class261.method3613(arg0.field1240);
            if (var5 == null || var5.field3622 == null) {
                arg0.field1240 = -1;
            } else {
                arg0.field1208++;
                if (arg0.field1241 < var5.field3622.length && arg0.field1208 > var5.field3611[arg0.field1241]) {
                    arg0.field1208 = 1;
                    arg0.field1241++;
                    method3617(var5, arg0.field1241, arg0.field1243, arg0.field1209);
                }
                if (arg0.field1241 >= var5.field3622.length) {
                    arg0.field1241 -= var5.field3609;
                    arg0.field1244++;
                    if (arg0.field1244 >= var5.field3616) {
                        arg0.field1240 = -1;
                    } else if (arg0.field1241 >= 0 && arg0.field1241 < var5.field3622.length) {
                        method3617(var5, arg0.field1241, arg0.field1243, arg0.field1209);
                    } else {
                        arg0.field1240 = -1;
                    }
                }
                arg0.field1211 = var5.field3615;
            }
        }
        if (arg0.field1245 > 0) {
            arg0.field1245--;
        }
    }

    @ObfuscatedName("e.gh(Lbw;IIS)V")
    public static void method6(class74 arg0, int arg1, int arg2) {
        if (arg0.field1240 == arg1 && arg1 != -1) {
            int var3 = class261.method3613(arg1).field3604;
            if (var3 == 1) {
                arg0.field1241 = 0;
                arg0.field1208 = 0;
                arg0.field1245 = arg2;
                arg0.field1244 = 0;
            }
            if (var3 == 2) {
                arg0.field1244 = 0;
            }
        } else if (arg1 == -1 || arg0.field1240 == -1 || class261.method3613(arg1).field3607 >= class261.method3613(arg0.field1240).field3607) {
            arg0.field1240 = arg1;
            arg0.field1241 = 0;
            arg0.field1208 = 0;
            arg0.field1245 = arg2;
            arg0.field1244 = 0;
            arg0.field1242 = arg0.field1213;
        }
    }

    @ObfuscatedName("h.gg(B)I")
    public static int method135() {
        return field1040 ? 2 : 1;
    }

    @ObfuscatedName("bu.gk(IB)V")
    public static void method1034(int arg0) {
        field1127 = 0L;
        if (arg0 >= 2) {
            field1040 = true;
        } else {
            field1040 = false;
        }
        if (method135() == 1) {
            Statics.field1202.method771(765, 503);
        } else {
            Statics.field1202.method771(7680, 2160);
        }
        if (field929 >= 25) {
            field965.method3210(151);
            field965.method2970(method135());
            field965.method2940(Statics.field762);
            field965.method2940(Statics.field633);
        }
    }

    @ObfuscatedName("client.x(I)V")
    public final void method779() {
        field1127 = class176.method2725() + 500L;
        this.method1172();
        if (field1074 != -1) {
            this.method1106(true);
        }
    }

    @ObfuscatedName("client.gz(B)V")
    public void method1172() {
        int var1 = Statics.field762;
        int var2 = Statics.field633;
        if (this.field714 < var1) {
            int var3 = this.field714;
        }
        if (this.field715 < var2) {
            int var4 = this.field715;
        }
        if (Statics.field355 != null) {
            try {
                class53.method695(Statics.field1202, "resize", new Object[] { method135() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gw(I)V")
    public final void method1239() {
        if (field1074 != -1) {
            int var1 = field1074;
            if (class217.method1688(var1)) {
                method482(Statics.field2433[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1117; var2++) {
            if (field1119[var2]) {
                field1120[var2] = true;
            }
            field1035[var2] = field1119[var2];
            field1119[var2] = false;
        }
        field1118 = field931;
        field1030 = -1;
        field1064 = -1;
        Statics.field2271 = null;
        if (field1074 != -1) {
            field1117 = 0;
            method14(field1074, 0, 0, Statics.field762, Statics.field633, 0, 0, -1);
        }
        class283.method4713();
        if (field1052) {
            int var3 = Statics.field686;
            int var4 = Statics.field269;
            int var5 = Statics.field342;
            int var6 = Statics.field429;
            int var7 = 6116423;
            class283.method4762(var3, var4, var5, var6, var7);
            class283.method4762(var3 + 1, var4 + 1, var5 - 2, 16, 0);
            class283.method4698(var3 + 1, var4 + 18, var5 - 2, var6 - 19, 0);
            Statics.field828.method4480(class226.field3036, var3 + 3, var4 + 14, var7, -1);
            int var8 = class60.field746;
            int var9 = class60.field747;
            for (int var10 = 0; var10 < field1028; var10++) {
                int var11 = (field1028 - 1 - var10) * 15 + var4 + 31;
                int var12 = 16777215;
                if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                    var12 = 16776960;
                }
                Statics.field828.method4480(method1632(var10), var3 + 3, var11, var12, 0);
            }
            int var13 = Statics.field686;
            int var14 = Statics.field269;
            int var15 = Statics.field342;
            int var16 = Statics.field429;
            for (int var17 = 0; var17 < field1117; var17++) {
                if (field1122[var17] + field1088[var17] > var13 && field1122[var17] < var13 + var15 && field1131[var17] + field1014[var17] > var14 && field1014[var17] < var14 + var16) {
                    field1120[var17] = true;
                }
            }
        } else if (field1030 != -1) {
            method1592(field1030, field1064);
        }
        if (field956 == 3) {
            for (int var18 = 0; var18 < field1117; var18++) {
                if (field1035[var18]) {
                    class283.method4686(field1122[var18], field1014[var18], field1088[var18], field1131[var18], 16711935, 128);
                } else if (field1120[var18]) {
                    class283.method4686(field1122[var18], field1014[var18], field1088[var18], field1131[var18], 16711680, 128);
                }
            }
        }
        int var19 = Statics.field44;
        int var20 = Statics.field2427.field1243;
        int var21 = Statics.field2427.field1209;
        int var22 = field1123;
        for (class81 var23 = (class81) class81.field1325.method3409(); var23 != null; var23 = (class81) class81.field1325.method3429()) {
            if (var23.field1319 != -1 || var23.field1323 != null) {
                int var24 = 0;
                if (var20 > var23.field1320) {
                    var24 += var20 - var23.field1320;
                } else if (var20 < var23.field1312) {
                    var24 += var23.field1312 - var20;
                }
                if (var21 > var23.field1317) {
                    var24 += var21 - var23.field1317;
                } else if (var21 < var23.field1327) {
                    var24 += var23.field1327 - var21;
                }
                if (var24 - 64 > var23.field1318 || field1115 == 0 || var23.field1313 != var19) {
                    if (var23.field1314 != null) {
                        Statics.field1365.method1791(var23.field1314);
                        var23.field1314 = null;
                    }
                    if (var23.field1316 != null) {
                        Statics.field1365.method1791(var23.field1316);
                        var23.field1316 = null;
                    }
                } else {
                    var24 -= 64;
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    int var25 = field1115 * (var23.field1318 - var24) / var23.field1318;
                    class104 var10000;
                    if (var23.field1314 != null) {
                        var23.field1314.method2022(var25);
                    } else if (var23.field1319 >= 0) {
                        var10000 = (class104) null;
                        class104 var26 = class104.method1850(Statics.field35, var23.field1319, 0);
                        if (var26 != null) {
                            class106 var27 = var26.method1851().method1893(Statics.field2114);
                            class116 var28 = class116.method2018(var27, 100, var25);
                            var28.method2142(-1);
                            Statics.field1365.method1821(var28);
                            var23.field1314 = var28;
                        }
                    }
                    if (var23.field1316 != null) {
                        var23.field1316.method2022(var25);
                        if (!var23.field1316.method3405()) {
                            var23.field1316 = null;
                        }
                    } else if (var23.field1323 != null && (var23.field1324 -= var22) <= 0) {
                        int var29 = (int) (Math.random() * (double) var23.field1323.length);
                        var10000 = (class104) null;
                        class104 var30 = class104.method1850(Statics.field35, var23.field1323[var29], 0);
                        if (var30 != null) {
                            class106 var31 = var30.method1851().method1893(Statics.field2114);
                            class116 var32 = class116.method2018(var31, 100, var25);
                            var32.method2142(0);
                            Statics.field1365.method1821(var32);
                            var23.field1316 = var32;
                            var23.field1324 = var23.field1321 + (int) (Math.random() * (double) (var23.field1322 - var23.field1321));
                        }
                    }
                }
            }
        }
        field1123 = 0;
    }

    @ObfuscatedName("b.gq(Ljava/lang/String;ZI)V")
    public static final void method81(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field339.method4516(arg0, 250);
        int var6 = Statics.field339.method4478(arg0, 250) * 13;
        class283.method4762(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class283.method4698(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field339.method4484(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2751(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field276.method753(0, 0);
        } else {
            method2728(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("fw.gf(IIIII)V")
    public static final void method3188(int arg0, int arg1, int arg2, int arg3) {
        field1017++;
        if (Statics.field2427.field1243 >> 7 == field951 && Statics.field2427.field1209 >> 7 == field1147) {
            field951 = 0;
        }
        method34(Statics.field2427, false);
        if (field1062 >= 0 && field1034[field1062] != null) {
            method34(field1034[field1062], false);
        }
        method2714(true);
        int var4 = class95.field1486;
        int[] var5 = class95.field1481;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field1062 != var5[var6] && field1179 != var5[var6]) {
                method34(field1034[var5[var6]], true);
            }
        }
        method2714(false);
        method1063();
        method120();
        method532(arg0, arg1, arg2, arg3, true);
        int var7 = field932;
        int var8 = field957;
        int var9 = field1164;
        int var10 = field1178;
        class283.method4679(var7, var8, var7 + var9, var8 + var10);
        class135.method2450();
        if (!field1161) {
            int var11 = field922;
            if (field1125 / 256 > var11) {
                var11 = field1125 / 256;
            }
            if (field1162[4] && field1057[4] + 128 > var11) {
                var11 = field1057[4] + 128;
            }
            int var12 = field997 & 0x7FF;
            method90(Statics.field2141, method2209(Statics.field2427.field1243, Statics.field2427.field1209, Statics.field44) - field1003, Statics.field570, var11, var12, var11 * 3 + 600);
        }
        int var13;
        if (field1161) {
            int var14;
            if (Statics.field355.field1304) {
                var14 = Statics.field44;
            } else {
                int var15 = method2209(Statics.field2622, Statics.field1545, Statics.field44);
                if (var15 - Statics.field794 >= 800 || (class62.field765[Statics.field44][Statics.field2622 >> 7][Statics.field1545 >> 7] & 0x4) == 0) {
                    var14 = 3;
                } else {
                    var14 = Statics.field44;
                }
            }
            var13 = var14;
        } else {
            var13 = method1473();
        }
        int var16 = Statics.field2622;
        int var17 = Statics.field794;
        int var18 = Statics.field1545;
        int var19 = Statics.field257;
        int var20 = Statics.field2419;
        for (int var21 = 0; var21 < 5; var21++) {
            if (field1162[var21]) {
                int var22 = (int) (Math.random() * (double) (field1163[var21] * 2 + 1) - (double) field1163[var21] + Math.sin((double) field1165[var21] / 100.0D * (double) field1166[var21]) * (double) field1057[var21]);
                if (var21 == 0) {
                    Statics.field2622 += var22;
                }
                if (var21 == 1) {
                    Statics.field794 += var22;
                }
                if (var21 == 2) {
                    Statics.field1545 += var22;
                }
                if (var21 == 3) {
                    Statics.field2419 = Statics.field2419 + var22 & 0x7FF;
                }
                if (var21 == 4) {
                    Statics.field257 += var22;
                    if (Statics.field257 < 128) {
                        Statics.field257 = 128;
                    }
                    if (Statics.field257 > 383) {
                        Statics.field257 = 383;
                    }
                }
            }
        }
        int var23 = class60.field746;
        int var24 = class60.field747;
        if (class60.field742 != 0) {
            var23 = class60.field753;
            var24 = class60.field754;
        }
        if (var23 >= var7 && var23 < var7 + var9 && var24 >= var8 && var24 < var8 + var10) {
            int var25 = var23 - var7;
            int var26 = var24 - var8;
            class133.field1986 = var25;
            class133.field1985 = var26;
            class133.field1983 = true;
            class133.field1990 = 0;
            class133.field1984 = false;
        } else {
            class133.field1983 = false;
            class133.field1990 = 0;
        }
        method225();
        class283.method4762(var7, var8, var9, var10, 0);
        method225();
        int var27 = class135.field2010;
        class135.field2010 = field976;
        Statics.field250.method2543(Statics.field2622, Statics.field794, Statics.field1545, Statics.field257, Statics.field2419, var13);
        while (true) {
            class10 var28 = (class10) class8.field248.method3372();
            if (var28 == null) {
                class135.field2010 = var27;
                method225();
                Statics.field250.method2541();
                method25(var7, var8, var9, var10);
                method139(var7, var8);
                ((class124) Statics.field2019).method2258(field1123);
                method304(var7, var8, var9, var10);
                Statics.field2622 = var16;
                Statics.field794 = var17;
                Statics.field1545 = var18;
                Statics.field257 = var19;
                Statics.field2419 = var20;
                if (field1124 && class239.method2778(true, false) == 0) {
                    field1124 = false;
                }
                if (field1124) {
                    class283.method4762(var7, var8, var9, var10, 0);
                    method81(class226.field2867, false);
                }
                return;
            }
            var28.method42();
        }
    }

    @ObfuscatedName("aj.gt(IIIIZB)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        if (var7 < field1173) {
            short var8 = field1173;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1060) {
                var6 = field1060;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class283.method4713();
                    class283.method4762(arg0, arg1, var10, arg3, -16777216);
                    class283.method4762(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1063) {
            short var11 = field1063;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1002) {
                var6 = field1002;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class283.method4713();
                    class283.method4762(arg0, arg1, arg2, var13, -16777216);
                    class283.method4762(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1170 - field1169) * var5 / 100 + field1169;
        field976 = arg3 * var6 * var14 / 85504 << 1;
        if (field1164 != arg2 || field1178 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class135.field2016[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class138.method2562(var15, 500, 800, arg2, arg3);
        }
        field932 = arg0;
        field957 = arg1;
        field1164 = arg2;
        field1178 = arg3;
    }

    @ObfuscatedName("g.gu(Lbw;ZI)V")
    public static void method34(class74 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1074() || arg0.field904) {
            return;
        }
        int var2 = arg0.field887 << 14;
        arg0.field902 = false;
        if ((field926 && class95.field1486 > 50 || class95.field1486 > 200) && arg1 && arg0.field1254 == arg0.field1249) {
            arg0.field902 = true;
        }
        int var3 = arg0.field1243 >> 7;
        int var4 = arg0.field1209 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field897 != null && field931 >= arg0.field892 && field931 < arg0.field893) {
            arg0.field902 = false;
            arg0.field891 = method2209(arg0.field1243, arg0.field1209, Statics.field44);
            Statics.field250.method2581(Statics.field44, arg0.field1243, arg0.field1209, arg0.field891, 60, arg0, arg0.field1210, var2, arg0.field905, arg0.field899, arg0.field884, arg0.field901);
            return;
        }
        if ((arg0.field1243 & 0x7F) == 64 && (arg0.field1209 & 0x7F) == 64) {
            if (field1017 == field1016[var3][var4]) {
                return;
            }
            field1016[var3][var4] = field1017;
        }
        arg0.field891 = method2209(arg0.field1243, arg0.field1209, Statics.field44);
        Statics.field250.method2538(Statics.field44, arg0.field1243, arg0.field1209, arg0.field891, 60, arg0, arg0.field1210, var2, arg0.field1211);
    }

    @ObfuscatedName("eu.gv(ZI)V")
    public static final void method2714(boolean arg0) {
        for (int var1 = 0; var1 < field961; var1++) {
            class85 var2 = field960[field1029[var1]];
            int var3 = (field1029[var1] << 14) + 536870912;
            if (var2 != null && var2.method1074() && var2.field1370.field3579 == arg0 && var2.field1370.method4370()) {
                int var4 = var2.field1243 >> 7;
                int var5 = var2.field1209 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1212 == 1 && (var2.field1243 & 0x7F) == 64 && (var2.field1209 & 0x7F) == 64) {
                        if (field1017 == field1016[var4][var5]) {
                            continue;
                        }
                        field1016[var4][var5] = field1017;
                    }
                    if (!var2.field1370.field3587) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field250.method2538(Statics.field44, var2.field1243, var2.field1209, method2209(var2.field1243 + (var2.field1212 * 64 - 64), var2.field1209 + (var2.field1212 * 64 - 64), Statics.field44), var2.field1212 * 64 - 64 + 60, var2, var2.field1210, var3, var2.field1211);
                }
            }
        }
    }

    @ObfuscatedName("bh.gx(S)V")
    public static final void method1063() {
        for (class92 var0 = (class92) field1046.method3409(); var0 != null; var0 = (class92) field1046.method3429()) {
            if (Statics.field44 != var0.field1454 || field931 > var0.field1462) {
                var0.method3407();
            } else if (field931 >= var0.field1469) {
                if (var0.field1456 > 0) {
                    class85 var1 = field960[var0.field1456 - 1];
                    if (var1 != null && var1.field1243 >= 0 && var1.field1243 < 13312 && var1.field1209 >= 0 && var1.field1209 < 13312) {
                        var0.method1671(var1.field1243, var1.field1209, method2209(var1.field1243, var1.field1209, var0.field1454) - var0.field1451, field931);
                    }
                }
                if (var0.field1456 < 0) {
                    int var2 = -var0.field1456 - 1;
                    class74 var3;
                    if (field1179 == var2) {
                        var3 = Statics.field2427;
                    } else {
                        var3 = field1034[var2];
                    }
                    if (var3 != null && var3.field1243 >= 0 && var3.field1243 < 13312 && var3.field1209 >= 0 && var3.field1209 < 13312) {
                        var0.method1671(var3.field1243, var3.field1209, method2209(var3.field1243, var3.field1209, var0.field1454) - var0.field1451, field931);
                    }
                }
                var0.method1672(field1123);
                Statics.field250.method2538(Statics.field44, (int) var0.field1470, (int) var0.field1459, (int) var0.field1453, 60, var0, var0.field1466, -1, false);
            }
        }
    }

    @ObfuscatedName("x.gy(I)V")
    public static final void method120() {
        for (class83 var0 = (class83) field1047.method3409(); var0 != null; var0 = (class83) field1047.method3429()) {
            if (Statics.field44 != var0.field1352 || var0.field1350) {
                var0.method3407();
            } else if (field931 >= var0.field1349) {
                var0.method1593(field1123);
                if (var0.field1350) {
                    var0.method3407();
                } else {
                    Statics.field250.method2538(var0.field1352, var0.field1351, var0.field1357, var0.field1353, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("bp.gi(I)I")
    public static final int method1473() {
        if (Statics.field355.field1304) {
            return Statics.field44;
        }
        int var0 = 3;
        if (Statics.field257 < 310) {
            int var1 = Statics.field2622 >> 7;
            int var2 = Statics.field1545 >> 7;
            int var3 = Statics.field2427.field1243 >> 7;
            int var4 = Statics.field2427.field1209 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field44;
            }
            if ((class62.field765[Statics.field44][var1][var2] & 0x4) != 0) {
                var0 = Statics.field44;
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
                    if ((class62.field765[Statics.field44][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field44;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class62.field765[Statics.field44][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field44;
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
                    if ((class62.field765[Statics.field44][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field44;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class62.field765[Statics.field44][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field44;
                        }
                    }
                }
            }
        }
        if (Statics.field2427.field1243 >= 0 && Statics.field2427.field1209 >= 0 && Statics.field2427.field1243 < 13312 && Statics.field2427.field1209 < 13312) {
            if ((class62.field765[Statics.field44][Statics.field2427.field1243 >> 7][Statics.field2427.field1209 >> 7] & 0x4) != 0) {
                var0 = Statics.field44;
            }
            return var0;
        } else {
            return Statics.field44;
        }
    }

    @ObfuscatedName("a.go(III)V")
    public static final void method139(int arg0, int arg1) {
        if (field939 == 2) {
            method686((field1015 - Statics.field2122 << 7) + field945, (field968 - Statics.field1505 << 7) + field946, field944 * 2);
            if (field985 > -1 && field931 % 20 < 10) {
                Statics.field416[0].method4794(field985 + arg0 - 12, field1000 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bm.ga(Lbs;IIIIIS)V")
    public static final void method1052(class77 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1074()) {
            return;
        }
        if (arg0 instanceof class85) {
            class259 var6 = ((class85) arg0).field1370;
            if (var6.field3584 != null) {
                var6 = var6.method4369();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class95.field1486;
        int[] var8 = class95.field1481;
        int var9 = 3;
        if (!arg0.field1233.method3376()) {
            method1057(arg0, arg0.field1258 + 15);
            for (class84 var10 = (class84) arg0.field1233.method3373(); var10 != null; var10 = (class84) arg0.field1233.method3374()) {
                class78 var11 = var10.method1600(field931);
                if (var11 != null) {
                    class249 var12 = var10.field1363;
                    class287 var13 = var12.method4132();
                    class287 var14 = var12.method4146();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3375;
                    } else {
                        if (var12.field3368 * 2 < var14.field3798) {
                            var15 = var12.field3368;
                        }
                        var16 = var14.field3798 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field931 - var11.field1272;
                    int var20 = var11.field1274 * var16 / var12.field3375;
                    int var23;
                    if (var11.field1275 > var19) {
                        int var21 = var12.field3371 == 0 ? 0 : var19 / var12.field3371 * var12.field3371;
                        int var22 = var11.field1273 * var16 / var12.field3375;
                        var23 = (var20 - var22) * var21 / var11.field1275 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1275 + var12.field3372 - var19;
                        if (var12.field3366 >= 0) {
                            var17 = (var24 << 8) / (var12.field3372 - var12.field3366);
                        }
                    }
                    if (var11.field1274 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field985 + arg2 - (var16 >> 1);
                    int var26 = field1000 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field985 > -1) {
                            class283.method4762(var25, var26, var23, 5, 65280);
                            class283.method4762(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3801;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4803(var27, var26, var17);
                            class283.method4680(var27, var26, var27 + var28, var26 + var29);
                            var14.method4803(var27, var26, var17);
                        } else {
                            var13.method4794(var27, var26);
                            class283.method4680(var27, var26, var27 + var28, var26 + var29);
                            var14.method4794(var27, var26);
                        }
                        class283.method4679(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1601()) {
                    var10.method3407();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class74 var30 = (class74) arg0;
            if (var30.field904) {
                return;
            }
            if (var30.field886 != -1 || var30.field889 != -1) {
                method1057(arg0, arg0.field1258 + 15);
                if (field985 > -1) {
                    if (var30.field886 != -1) {
                        Statics.field2130[var30.field886].method4794(field985 + arg2 - 12, field1000 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field889 != -1) {
                        Statics.field512[var30.field889].method4794(field985 + arg2 - 12, field1000 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field939 == 10 && field941 == var8[arg1]) {
                method1057(arg0, arg0.field1258 + 15);
                if (field985 > -1) {
                    Statics.field416[1].method4794(field985 + arg2 - 12, field1000 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class85) arg0).field1370;
            if (var31.field3584 != null) {
                var31 = var31.method4369();
            }
            if (var31.field3585 >= 0 && var31.field3585 < Statics.field512.length) {
                method1057(arg0, arg0.field1258 + 15);
                if (field985 > -1) {
                    Statics.field512[var31.field3585].method4794(field985 + arg2 - 12, field1000 + arg3 - 30);
                }
            }
            if (field939 == 1 && field940 == field1029[arg1 - var7] && field931 % 20 < 10) {
                method1057(arg0, arg0.field1258 + 15);
                if (field985 > -1) {
                    Statics.field416[0].method4794(field985 + arg2 - 12, field1000 + arg3 - 28);
                }
            }
        }
        if (arg0.field1221 != null && (arg1 >= var7 || !arg0.field1223 && (field1130 == 4 || !arg0.field1222 && (field1130 == 0 || field1130 == 3 || field1130 == 1 && method561(((class74) arg0).field896, false))))) {
            method1057(arg0, arg0.field1258);
            if (field985 > -1 && field1006 < field1007) {
                field1084[field1006] = Statics.field828.method4552(arg0.field1221) / 2;
                field1010[field1006] = Statics.field828.field3642;
                field1008[field1006] = field985;
                field1009[field1006] = field1000;
                field1012[field1006] = arg0.field1225;
                field1013[field1006] = arg0.field1226;
                field1067[field1006] = arg0.field1224;
                field1134[field1006] = arg0.field1221;
                field1006++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1238[var32];
            int var34 = arg0.field1246[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field931) {
                    continue;
                }
                var35 = class255.method1689(arg0.field1246[var32]);
                var36 = var35.field3423;
                if (var35 != null && var35.field3434 != null) {
                    var35 = var35.method4243();
                    if (var35 == null) {
                        arg0.field1238[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1231[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method1689(var37);
                if (var38 != null && var38.field3434 != null) {
                    var38 = var38.method4243();
                }
            }
            if (var33 - var36 <= field931) {
                if (var35 == null) {
                    arg0.field1238[var32] = -1;
                } else {
                    method1057(arg0, arg0.field1258 / 2);
                    if (field985 > -1) {
                        if (var32 == 1) {
                            field1000 -= 20;
                        }
                        if (var32 == 2) {
                            field985 -= 15;
                            field1000 -= 10;
                        }
                        if (var32 == 3) {
                            field985 += 15;
                            field1000 -= 10;
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
                        class287 var64 = var35.method4222();
                        if (var64 != null) {
                            var43 = var64.field3798;
                            int var65 = var64.field3801;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3797;
                        }
                        class287 var66 = var35.method4223();
                        if (var66 != null) {
                            var44 = var66.field3798;
                            int var67 = var66.field3801;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3797;
                        }
                        class287 var68 = var35.method4246();
                        if (var68 != null) {
                            var45 = var68.field3798;
                            int var69 = var68.field3801;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3797;
                        }
                        class287 var70 = var35.method4225();
                        if (var70 != null) {
                            var46 = var70.field3798;
                            int var71 = var70.field3801;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3797;
                        }
                        if (var38 != null) {
                            var51 = var38.method4222();
                            if (var51 != null) {
                                var55 = var51.field3798;
                                int var72 = var51.field3801;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3797;
                            }
                            var52 = var38.method4223();
                            if (var52 != null) {
                                var56 = var52.field3798;
                                int var73 = var52.field3801;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3797;
                            }
                            var53 = var38.method4246();
                            if (var53 != null) {
                                var57 = var53.field3798;
                                int var74 = var53.field3801;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3797;
                            }
                            var54 = var38.method4225();
                            if (var54 != null) {
                                var58 = var54.field3798;
                                int var75 = var54.field3801;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3797;
                            }
                        }
                        class264 var76 = var35.method4226();
                        if (var76 == null) {
                            var76 = Statics.field258;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field258;
                        } else {
                            var77 = var38.method4226();
                            if (var77 == null) {
                                var77 = Statics.field258;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4247(arg0.field1229[var32]);
                        int var83 = var76.method4552(var82);
                        if (var38 != null) {
                            var79 = var38.method4247(arg0.field1232[var32]);
                            var81 = var77.method4552(var79);
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
                        int var100 = arg0.field1238[var32] - field931;
                        int var101 = var35.field3437 - var35.field3437 * var100 / var35.field3423;
                        int var102 = var35.field3429 * var100 / var35.field3423 + -var35.field3429;
                        int var103 = field985 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1000 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3433 + var104 + 15;
                        int var108 = var107 - var76.field3649;
                        int var109 = var76.field3650 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3433 + var104 + 15;
                            int var111 = var110 - var77.field3649;
                            int var112 = var77.field3650 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3430 >= 0) {
                            var115 = (var100 << 8) / (var35.field3423 - var35.field3430);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4803(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4803(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4803(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4803(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4481(var82, var90 + var103, var107, var35.field3431, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4803(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4803(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4803(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4803(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4481(var79, var98 + var103, var110, var38.field3431, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4794(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4794(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4794(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4794(var93 + var103 - var50, var104);
                            }
                            var76.method4480(var82, var90 + var103, var107, var35.field3431 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4794(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4794(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4794(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4794(var97 + var103 - var62, var104);
                                }
                                var77.method4480(var79, var98 + var103, var110, var38.field3431 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.ht(IIIII)V")
    public static final void method25(int arg0, int arg1, int arg2, int arg3) {
        field1006 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class95.field1486;
        int[] var7 = class95.field1481;
        for (int var8 = 0; var8 < field961 + var6; var8++) {
            class77 var9;
            if (var8 < var6) {
                var9 = field1034[var7[var8]];
                if (field1062 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field960[field1029[var8 - var6]];
            }
            method1052(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1052(field1034[field1062], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field1006; var10++) {
            int var11 = field1008[var10];
            int var12 = field1009[var10];
            int var13 = field1084[var10];
            int var14 = field1010[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field1009[var16] - field1010[var16] && var12 - var14 < field1009[var16] + 2 && var11 - var13 < field1084[var16] + field1008[var16] && var11 + var13 > field1008[var16] - field1084[var16] && field1009[var16] - field1010[var16] < var12) {
                        var12 = field1009[var16] - field1010[var16];
                        var15 = true;
                    }
                }
            }
            field985 = field1008[var10];
            field1000 = field1009[var10] = var12;
            String var17 = field1134[var10];
            if (field1076 == 0) {
                int var18 = 16776960;
                if (field1012[var10] < 6) {
                    var18 = field1129[field1012[var10]];
                }
                if (field1012[var10] == 6) {
                    var18 = field1017 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field1012[var10] == 7) {
                    var18 = field1017 % 20 < 10 ? 255 : 65535;
                }
                if (field1012[var10] == 8) {
                    var18 = field1017 % 20 < 10 ? 45056 : 8454016;
                }
                if (field1012[var10] == 9) {
                    int var19 = 150 - field1067[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field1012[var10] == 10) {
                    int var20 = 150 - field1067[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field1012[var10] == 11) {
                    int var21 = 150 - field1067[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field1013[var10] == 0) {
                    Statics.field828.method4483(var17, field985 + arg0, field1000 + arg1, var18, 0);
                }
                if (field1013[var10] == 1) {
                    Statics.field828.method4485(var17, field985 + arg0, field1000 + arg1, var18, 0, field1017);
                }
                if (field1013[var10] == 2) {
                    Statics.field828.method4555(var17, field985 + arg0, field1000 + arg1, var18, 0, field1017);
                }
                if (field1013[var10] == 3) {
                    Statics.field828.method4487(var17, field985 + arg0, field1000 + arg1, var18, 0, field1017, 150 - field1067[var10]);
                }
                if (field1013[var10] == 4) {
                    int var22 = (150 - field1067[var10]) * (Statics.field828.method4552(var17) + 100) / 150;
                    class283.method4680(field985 + arg0 - 50, arg1, field985 + arg0 + 50, arg1 + arg3);
                    Statics.field828.method4480(var17, field985 + arg0 + 50 - var22, field1000 + arg1, var18, 0);
                    class283.method4679(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field1013[var10] == 5) {
                    int var23 = 150 - field1067[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class283.method4680(arg0, field1000 + arg1 - Statics.field828.field3642 - 1, arg0 + arg2, field1000 + arg1 + 5);
                    Statics.field828.method4483(var17, field985 + arg0, field1000 + arg1 + var24, var18, 0);
                    class283.method4679(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field828.method4483(var17, field985 + arg0, field1000 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("aj.hd(I)V")
    public static final void method538() {
        field1176 = 0;
        int var0 = (Statics.field2427.field1243 >> 7) + Statics.field2122;
        int var1 = (Statics.field2427.field1209 >> 7) + Statics.field1505;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1176 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1176 = 1;
        }
        if (field1176 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1176 = 0;
        }
    }

    @ObfuscatedName("af.hu(IIIIB)V")
    public static final void method304(int arg0, int arg1, int arg2, int arg3) {
        if (field1023 == 1) {
            Statics.field336[field1172 / 100].method4794(field1020 - 8, field1021 - 8);
        }
        if (field1023 == 2) {
            Statics.field336[field1172 / 100 + 4].method4794(field1020 - 8, field1021 - 8);
        }
        method538();
    }

    @ObfuscatedName("bh.hx(Lbs;II)V")
    public static final void method1057(class77 arg0, int arg1) {
        method686(arg0.field1243, arg0.field1209, arg1);
    }

    @ObfuscatedName("ay.hl(IIIB)V")
    public static final void method686(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field985 = -1;
            field1000 = -1;
            return;
        }
        int var3 = method2209(arg0, arg1, Statics.field44) - arg2;
        int var4 = arg0 - Statics.field2622;
        int var5 = var3 - Statics.field794;
        int var6 = arg1 - Statics.field1545;
        int var7 = class135.field2016[Statics.field257];
        int var8 = class135.field2023[Statics.field257];
        int var9 = class135.field2016[Statics.field2419];
        int var10 = class135.field2023[Statics.field2419];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field985 = field976 * var11 / var15 + field1164 / 2;
            field1000 = field976 * var14 / var15 + field1178 / 2;
        } else {
            field985 = -1;
            field1000 = -1;
        }
    }

    @ObfuscatedName("dz.hv(IIIB)I")
    public static final int method2209(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field765[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field781[var5][var3][var4] + class62.field781[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field781[var5][var3][var4 + 1] + class62.field781[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("f.hg(IIIIIII)V")
    public static final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class135.field2016[var6];
            int var12 = class135.field2023[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class135.field2016[var7];
            int var15 = class135.field2023[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2622 = arg0 - var8;
        Statics.field794 = arg1 - var9;
        Statics.field1545 = arg2 - var10;
        Statics.field257 = arg3;
        Statics.field2419 = arg4;
    }

    @ObfuscatedName("cq.hc(ZI)V")
    public static final void method1630(boolean arg0) {
        field986 = arg0;
        if (!field986) {
            int var1 = field967.method2993();
            int var2 = field967.method3018();
            int var3 = field967.method3035();
            Statics.field532 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field532[var4][var5] = field967.method2960();
                }
            }
            Statics.field1277 = new int[var3];
            Statics.field3192 = new int[var3];
            Statics.field992 = new int[var3];
            Statics.field530 = new byte[var3][];
            Statics.field278 = new byte[var3][];
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
                        Statics.field1277[var7] = var10;
                        Statics.field3192[var7] = Statics.field3141.method3896("m" + var8 + "_" + var9);
                        Statics.field992[var7] = Statics.field3141.method3896("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method53(var1, var2, true);
            return;
        }
        int var11 = field967.method2993();
        boolean var12 = field967.method2984() == 1;
        int var13 = field967.method3035();
        int var14 = field967.method3035();
        field967.method3212();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field967.method3213(1);
                    if (var18 == 1) {
                        field987[var15][var16][var17] = field967.method3213(26);
                    } else {
                        field987[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field967.method3208();
        Statics.field532 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field532[var19][var20] = field967.method2960();
            }
        }
        Statics.field1277 = new int[var14];
        Statics.field3192 = new int[var14];
        Statics.field992 = new int[var14];
        Statics.field530 = new byte[var14][];
        Statics.field278 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field987[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field1277[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field1277[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field3192[var21] = Statics.field3141.method3896("m" + var30 + "_" + var31);
                            Statics.field992[var21] = Statics.field3141.method3896("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method53(var13, var11, !var12);
    }

    @ObfuscatedName("o.hj(IIZB)V")
    public static final void method53(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field590 == arg0 && Statics.field2246 == arg1) {
            return;
        }
        Statics.field590 = arg0;
        Statics.field2246 = arg1;
        method2525(25);
        method81(class226.field2867, true);
        int var3 = Statics.field2122;
        int var4 = Statics.field1505;
        Statics.field2122 = (arg0 - 6) * 8;
        Statics.field1505 = (arg1 - 6) * 8;
        int var5 = Statics.field2122 - var3;
        int var6 = Statics.field1505 - var4;
        int var7 = Statics.field2122;
        int var8 = Statics.field1505;
        for (int var9 = 0; var9 < 32768; var9++) {
            class85 var10 = field960[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1263[var11] -= var5;
                    var10.field1264[var11] -= var6;
                }
                var10.field1243 -= var5 * 128;
                var10.field1209 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class74 var13 = field1034[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1263[var14] -= var5;
                    var13.field1264[var14] -= var6;
                }
                var13.field1243 -= var5 * 128;
                var13.field1209 -= var6 * 128;
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
                        field1044[var25][var21][var22] = field1044[var25][var23][var24];
                    } else {
                        field1044[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class76 var26 = (class76) field1045.method3409(); var26 != null; var26 = (class76) field1045.method3429()) {
            var26.field1205 -= var5;
            var26.field1198 -= var6;
            if (var26.field1205 < 0 || var26.field1198 < 0 || var26.field1205 >= 104 || var26.field1198 >= 104) {
                var26.method3407();
            }
        }
        if (field951 != 0) {
            field951 -= var5;
            field1147 -= var6;
        }
        field1155 = 0;
        field1161 = false;
        field1141 = -1;
        field1047.method3416();
        field1046.method3416();
        for (int var27 = 0; var27 < 4; var27++) {
            field996[var27].method2833();
        }
    }

    @ObfuscatedName("ab.ho(ZI)V")
    public static final void method228(boolean arg0) {
        method225();
        field1116++;
        if (field1116 < 50 && !arg0) {
            return;
        }
        field1116 = 0;
        if (field1146 || Statics.field3676 == null) {
            return;
        }
        field965.method3210(40);
        try {
            Statics.field3676.method2797(field965.field2409, 0, field965.field2405);
            field965.field2405 = 0;
        } catch (IOException var2) {
            field1146 = true;
        }
    }

    @ObfuscatedName("aq.hk(IIIIIS)V")
    public static final void method450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field250.method2618(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field250.method2571(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field34.field3796;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class256 var13 = class256.method2710(var12);
            if (var13.field3450 == -1) {
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
                class286 var14 = Statics.field3820[var13.field3450];
                if (var14 != null) {
                    int var15 = (var13.field3454 * 4 - var14.field3791) / 2;
                    int var16 = (var13.field3455 * 4 - var14.field3790) / 2;
                    var14.method4769(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3455) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field250.method2677(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field250.method2571(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class256 var22 = class256.method2710(var21);
            if (var22.field3450 != -1) {
                class286 var23 = Statics.field3820[var22.field3450];
                if (var23 != null) {
                    int var24 = (var22.field3454 * 4 - var23.field3791) / 2;
                    int var25 = (var22.field3455 * 4 - var23.field3790) / 2;
                    var23.method4769(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3455) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field34.field3796;
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
        int var29 = Statics.field250.method2611(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class256 var31 = class256.method2710(var30);
        if (var31.field3450 == -1) {
            return;
        }
        class286 var32 = Statics.field3820[var31.field3450];
        if (var32 != null) {
            int var33 = (var31.field3454 * 4 - var32.field3791) / 2;
            int var34 = (var31.field3455 * 4 - var32.field3790) / 2;
            var32.method4769(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3455) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.hh(B)Z")
    public final boolean method1107() {
        if (Statics.field3676 == null) {
            return false;
        }
        try {
            int var1 = Statics.field3676.method2795();
            if (var1 == 0) {
                return false;
            }
            if (field969 == -1) {
                Statics.field3676.method2796(field967.field2409, 0, 1);
                field967.field2405 = 0;
                field969 = field967.method3235();
                field1171 = class273.field3711[field969];
                var1--;
            }
            if (field1171 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field3676.method2796(field967.field2409, 0, 1);
                field1171 = field967.field2409[0] & 0xFF;
                var1--;
            }
            if (field1171 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field3676.method2796(field967.field2409, 0, 2);
                field967.field2405 = 0;
                field1171 = field967.method3035();
                var1 -= 2;
            }
            if (var1 < field1171) {
                return false;
            }
            field967.field2405 = 0;
            Statics.field3676.method2796(field967.field2409, 0, field1171);
            field930.method4634();
            field970 = 0;
            field1098 = field973;
            field973 = field972;
            field972 = field969;
            if (field969 == 117) {
                int var2 = field967.method3137();
                int var3 = field967.method2984();
                String var4 = field967.method2964();
                if (var3 >= 1 && var3 <= 8) {
                    if (var4.equalsIgnoreCase("null")) {
                        var4 = null;
                    }
                    field989[var3 - 1] = var4;
                    field1041[var3 - 1] = var2 == 0;
                }
                field969 = -1;
                return true;
            }
            if (field969 == 42) {
                int var5 = field967.method2960();
                String var6 = field967.method2964();
                class217 var7 = class217.method3237(var5);
                if (!var6.equals(var7.field2734)) {
                    var7.field2734 = var6;
                    method165(var7);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 126) {
                Statics.field1271 = field967.method2983();
                Statics.field454 = field967.method2983();
                for (int var8 = Statics.field454; var8 < Statics.field454 + 8; var8++) {
                    for (int var9 = Statics.field1271; var9 < Statics.field1271 + 8; var9++) {
                        if (field1044[Statics.field44][var8][var9] != null) {
                            field1044[Statics.field44][var8][var9] = null;
                            method643(var8, var9);
                        }
                    }
                }
                for (class76 var10 = (class76) field1045.method3409(); var10 != null; var10 = (class76) field1045.method3429()) {
                    if (var10.field1205 >= Statics.field454 && var10.field1205 < Statics.field454 + 8 && var10.field1198 >= Statics.field1271 && var10.field1198 < Statics.field1271 + 8 && Statics.field44 == var10.field1203) {
                        var10.field1206 = 0;
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 127) {
                int var11 = field967.method3137();
                int var12 = field967.method2991();
                int var13 = field967.method3002();
                class68 var14 = (class68) field1075.method3352((long) var13);
                if (var14 != null) {
                    method1452(var14, var14.field835 != var12);
                }
                class68 var15 = new class68();
                var15.field835 = var12;
                var15.field836 = var11;
                field1075.method3358(var15, (long) var13);
                method234(var12);
                class217 var16 = class217.method3237(var13);
                method165(var16);
                if (field1078 != null) {
                    method165(field1078);
                    field1078 = null;
                }
                method79();
                method18(Statics.field2433[var13 >> 16], var16, false);
                class82.method196(var12);
                if (field1074 != -1) {
                    int var17 = field1074;
                    if (class217.method1688(var17)) {
                        method4168(Statics.field2433[var17], 1);
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 28) {
                method3255();
                field969 = -1;
                return false;
            }
            if (field969 == 254) {
                int var18 = field967.method3028();
                int var19 = field967.method2994();
                class217 var20 = class217.method3237(var18);
                if (var20.field2650 != var19 || var19 == -1) {
                    var20.field2650 = var19;
                    var20.field2777 = 0;
                    var20.field2782 = 0;
                    method165(var20);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 150) {
                method1630(false);
                field967.method3235();
                int var21 = field967.method3035();
                class95.method455(field967, var21);
                field969 = -1;
                return true;
            }
            if (field969 == 88) {
                field951 = field967.method2955();
                if (field951 == 255) {
                    field951 = 0;
                }
                field1147 = field967.method2955();
                if (field1147 == 255) {
                    field1147 = 0;
                }
                field969 = -1;
                return true;
            }
            if (field969 == 30) {
                int var22 = field967.method3035();
                field1074 = var22;
                this.method1106(false);
                method234(var22);
                class82.method196(field1074);
                for (int var23 = 0; var23 < 100; var23++) {
                    field1119[var23] = true;
                }
                field969 = -1;
                return true;
            }
            if (field969 == 148) {
                method1630(true);
                field967.method3235();
                int var24 = field967.method3035();
                class95.method455(field967, var24);
                field969 = -1;
                return true;
            }
            if (field969 == 86) {
                while (field967.field2405 < field1171) {
                    int var25 = field967.method2955();
                    boolean var26 = (var25 & 0x1) == 1;
                    String var27 = field967.method2964();
                    String var28 = field967.method2964();
                    field967.method2964();
                    for (int var29 = 0; var29 < field1183; var29++) {
                        class70 var30 = field1055[var29];
                        if (var26) {
                            if (var28.equals(var30.field857)) {
                                var30.field857 = var27;
                                var30.field858 = var28;
                                var27 = null;
                                break;
                            }
                        } else if (var27.equals(var30.field857)) {
                            var30.field857 = var27;
                            var30.field858 = var28;
                            var27 = null;
                            break;
                        }
                    }
                    if (var27 != null && field1183 < 400) {
                        class70 var31 = new class70();
                        field1055[field1183] = var31;
                        var31.field857 = var27;
                        var31.field858 = var28;
                        field1183++;
                    }
                }
                field1107 = field1099;
                field969 = -1;
                return true;
            }
            if (field969 == 188) {
                int var32 = field967.method2994();
                int var33 = field967.method3028();
                int var34 = field967.method2958();
                class217 var35 = class217.method3237(var33);
                if (var35.field2668 != var34 || var35.field2669 != var32 || var35.field2646 != 0 || var35.field2665 != 0) {
                    var35.field2668 = var34;
                    var35.field2669 = var32;
                    var35.field2646 = 0;
                    var35.field2665 = 0;
                    method165(var35);
                    this.method1187(var35);
                    if (var35.field2661 == 0) {
                        method18(Statics.field2433[var33 >> 16], var35, false);
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 33) {
                method2265();
                int var36 = field967.method2955();
                int var37 = field967.method2955();
                int var38 = field967.method3002();
                field1050[var37] = var38;
                field1005[var37] = var36;
                field1049[var37] = 1;
                for (int var39 = 0; var39 < 98; var39++) {
                    if (var38 >= class223.field2843[var39]) {
                        field1049[var37] = var39 + 2;
                    }
                }
                field1153[++field1105 - 1 & 0x1F] = var37;
                field969 = -1;
                return true;
            }
            if (field969 == 72) {
                int var40 = field967.method3018();
                if (var40 == 65535) {
                    var40 = -1;
                }
                int var41 = field967.method3002();
                int var42 = field967.method2960();
                int var43 = field967.method3018();
                if (var43 == 65535) {
                    var43 = -1;
                }
                for (int var44 = var40; var44 <= var43; var44++) {
                    long var45 = ((long) var42 << 32) + (long) var44;
                    class193 var47 = field1033.method3352(var45);
                    if (var47 != null) {
                        var47.method3407();
                    }
                    field1033.method3358(new class199(var41), var45);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 97) {
                int var48 = field967.method2955();
                if (field967.method2955() == 0) {
                    field938[var48] = new class17();
                    field967.field2405 += 18;
                } else {
                    field967.field2405--;
                    field938[var48] = new class17(field967, false);
                }
                field1109 = field1099;
                field969 = -1;
                return true;
            }
            if (field969 == 24) {
                int var49 = field967.method2960();
                int var50 = field967.method3035();
                class217 var51 = class217.method3237(var49);
                if (var51 != null && var51.field2661 == 0) {
                    if (var50 > var51.field2683 - var51.field2675) {
                        var50 = var51.field2683 - var51.field2675;
                    }
                    if (var50 < 0) {
                        var50 = 0;
                    }
                    if (var51.field2774 != var50) {
                        var51.field2774 = var50;
                        method165(var51);
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 108) {
                method4607(true);
                field969 = -1;
                return true;
            }
            if (field969 == 109) {
                Statics.field1271 = field967.method2955();
                Statics.field454 = field967.method2955();
                field969 = -1;
                return true;
            }
            if (field969 == 159) {
                field1130 = field967.method2955();
                field1019 = field967.method2955();
                field969 = -1;
                return true;
            }
            if (field969 == 249) {
                method2265();
                field1080 = field967.method2958();
                field1111 = field1099;
                field969 = -1;
                return true;
            }
            if (field969 == 114) {
                field1161 = false;
                for (int var52 = 0; var52 < 5; var52++) {
                    field1162[var52] = false;
                }
                field969 = -1;
                return true;
            }
            if (field969 == 76) {
                method4607(false);
                field969 = -1;
                return true;
            }
            if (field969 == 27) {
                int var53 = field967.method2960();
                int var54 = field967.method2991();
                int var55 = field967.method3035();
                int var56 = field967.method3035();
                class217 var57 = class217.method3237(var53);
                if (var57.field2710 != var55 || var57.field2711 != var54 || var57.field2664 != var56) {
                    var57.field2710 = var55;
                    var57.field2711 = var54;
                    var57.field2664 = var56;
                    method165(var57);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 70) {
                int var58 = field967.method2955();
                int var59 = field967.method2955();
                int var60 = field967.method2955();
                int var61 = field967.method2955();
                field1162[var58] = true;
                field1163[var58] = var59;
                field1057[var58] = var60;
                field1165[var58] = var61;
                field1166[var58] = 0;
                field969 = -1;
                return true;
            }
            if (field969 == 222) {
                int var62 = field967.method3018();
                if (var62 == 65535) {
                    var62 = -1;
                }
                if (var62 == -1 && !field1152) {
                    class204.method1612();
                } else if (var62 != -1 && field1087 != var62 && field977 != 0 && !field1152) {
                    class238 var63 = Statics.field3677;
                    int var64 = field977;
                    class204.field2522 = 1;
                    Statics.field2523 = var63;
                    Statics.field2521 = var62;
                    Statics.field2139 = 0;
                    Statics.field2204 = var64;
                    Statics.field3779 = false;
                    Statics.field3815 = 2;
                }
                field1087 = var62;
                field969 = -1;
                return true;
            }
            if (field969 == 90) {
                int var65 = field967.method3018();
                if (var65 == 65535) {
                    var65 = -1;
                }
                int var66 = field967.method2996();
                if (field977 != 0 && var65 != -1) {
                    class204.method2819(Statics.field2113, var65, 0, field977, false);
                    field1152 = true;
                }
                field969 = -1;
                return true;
            }
            if (field969 == 185) {
                byte var67 = field967.method2987();
                int var68 = field967.method2993();
                class212.field2619[var68] = var67;
                if (class212.field2621[var68] != var67) {
                    class212.field2621[var68] = var67;
                }
                method1038(var68);
                field1100[++field1101 - 1 & 0x1F] = var68;
                field969 = -1;
                return true;
            }
            if (field969 == 219) {
                for (int var69 = 0; var69 < field1034.length; var69++) {
                    if (field1034[var69] != null) {
                        field1034[var69].field1240 = -1;
                    }
                }
                for (int var70 = 0; var70 < field960.length; var70++) {
                    if (field960[var70] != null) {
                        field960[var70].field1240 = -1;
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 226) {
                method2265();
                field1079 = field967.method2955();
                field1111 = field1099;
                field969 = -1;
                return true;
            }
            if (field969 == 233) {
                class180 var71 = field967;
                int var72 = field1171;
                class281 var73 = new class281();
                var73.field3760 = var71.method2955();
                var73.field3757 = var71.method2960();
                var73.field3759 = new int[var73.field3760];
                var73.field3758 = new int[var73.field3760];
                var73.field3761 = new Field[var73.field3760];
                var73.field3762 = new int[var73.field3760];
                var73.field3763 = new Method[var73.field3760];
                var73.field3764 = new byte[var73.field3760][][];
                for (int var74 = 0; var74 < var73.field3760; var74++) {
                    try {
                        int var75 = var71.method2955();
                        if (var75 == 0 || var75 == 1 || var75 == 2) {
                            String var76 = var71.method2964();
                            String var77 = var71.method2964();
                            int var78 = 0;
                            if (var75 == 1) {
                                var78 = var71.method2960();
                            }
                            var73.field3759[var74] = var75;
                            var73.field3762[var74] = var78;
                            if (class282.method539(var76).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var73.field3761[var74] = class282.method539(var76).getDeclaredField(var77);
                        } else if (var75 == 3 || var75 == 4) {
                            String var79 = var71.method2964();
                            String var80 = var71.method2964();
                            int var81 = var71.method2955();
                            String[] var82 = new String[var81];
                            for (int var83 = 0; var83 < var81; var83++) {
                                var82[var83] = var71.method2964();
                            }
                            String var84 = var71.method2964();
                            byte[][] var85 = new byte[var81][];
                            if (var75 == 3) {
                                for (int var86 = 0; var86 < var81; var86++) {
                                    int var87 = var71.method2960();
                                    var85[var86] = new byte[var87];
                                    var71.method2967(var85[var86], 0, var87);
                                }
                            }
                            var73.field3759[var74] = var75;
                            Class[] var88 = new Class[var81];
                            for (int var89 = 0; var89 < var81; var89++) {
                                var88[var89] = class282.method539(var82[var89]);
                            }
                            Class var90 = class282.method539(var84);
                            if (class282.method539(var79).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var91 = class282.method539(var79).getDeclaredMethods();
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
                                            var73.field3763[var74] = var94;
                                        }
                                    }
                                }
                            }
                            var73.field3764[var74] = var85;
                        }
                    } catch (ClassNotFoundException var337) {
                        var73.field3758[var74] = -1;
                    } catch (SecurityException var338) {
                        var73.field3758[var74] = -2;
                    } catch (NullPointerException var339) {
                        var73.field3758[var74] = -3;
                    } catch (Exception var340) {
                        var73.field3758[var74] = -4;
                    } catch (Throwable var341) {
                        var73.field3758[var74] = -5;
                    }
                }
                class282.field3767.method3369(var73);
                field969 = -1;
                return true;
            }
            if (field969 == 190) {
                if (field1074 != -1) {
                    int var103 = field1074;
                    if (class217.method1688(var103)) {
                        method4168(Statics.field2433[var103], 0);
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 58) {
                field1181 = 1;
                field1107 = field1099;
                field969 = -1;
                return true;
            }
            if (field969 == 14) {
                boolean var104 = field967.method2955() == 1;
                if (var104) {
                    Statics.field676 = class176.method2725() - field967.method3004();
                    Statics.field331 = new class14(field967, true);
                } else {
                    Statics.field331 = null;
                }
                field1110 = field1099;
                field969 = -1;
                return true;
            }
            if (field969 == 11) {
                field1161 = true;
                Statics.field1657 = field967.method2955();
                Statics.field802 = field967.method2955();
                Statics.field304 = field967.method3035();
                Statics.field2821 = field967.method2955();
                Statics.field831 = field967.method2955();
                if (Statics.field831 >= 100) {
                    Statics.field2622 = Statics.field1657 * 128 + 64;
                    Statics.field1545 = Statics.field802 * 128 + 64;
                    Statics.field794 = method2209(Statics.field2622, Statics.field1545, Statics.field44) - Statics.field304;
                }
                field969 = -1;
                return true;
            }
            if (field969 == 54) {
                String var105 = field967.method2964();
                int var106 = field967.method3035();
                byte var107 = field967.method2956();
                boolean var108 = false;
                if (var107 == -128) {
                    var108 = true;
                }
                if (var108) {
                    if (Statics.field350 == 0) {
                        field969 = -1;
                        return true;
                    }
                    boolean var109 = false;
                    int var110;
                    for (var110 = 0; var110 < Statics.field350 && (!Statics.field451[var110].field910.equals(var105) || Statics.field451[var110].field912 != var106); var110++) {
                    }
                    if (var110 < Statics.field350) {
                        while (var110 < Statics.field350 - 1) {
                            Statics.field451[var110] = Statics.field451[var110 + 1];
                            var110++;
                        }
                        Statics.field350--;
                        Statics.field451[Statics.field350] = null;
                    }
                } else {
                    field967.method2964();
                    class75 var111 = new class75();
                    var111.field910 = var105;
                    var111.field911 = class268.method3677(var111.field910, Statics.field43);
                    var111.field912 = var106;
                    var111.field913 = var107;
                    int var112;
                    for (var112 = Statics.field350 - 1; var112 >= 0; var112--) {
                        int var113 = Statics.field451[var112].field911.compareTo(var111.field911);
                        if (var113 == 0) {
                            Statics.field451[var112].field912 = var106;
                            Statics.field451[var112].field913 = var107;
                            if (var105.equals(Statics.field2427.field896)) {
                                Statics.field2161 = var107;
                            }
                            field1108 = field1099;
                            field969 = -1;
                            return true;
                        }
                        if (var113 < 0) {
                            break;
                        }
                    }
                    if (Statics.field350 >= Statics.field451.length) {
                        field969 = -1;
                        return true;
                    }
                    for (int var114 = Statics.field350 - 1; var114 > var112; var114--) {
                        Statics.field451[var114 + 1] = Statics.field451[var114];
                    }
                    if (Statics.field350 == 0) {
                        Statics.field451 = new class75[100];
                    }
                    Statics.field451[var112 + 1] = var111;
                    Statics.field350++;
                    if (var105.equals(Statics.field2427.field896)) {
                        Statics.field2161 = var107;
                    }
                }
                field1108 = field1099;
                field969 = -1;
                return true;
            }
            if (field969 == 152) {
                int var115 = field967.method3035();
                int var116 = field967.method2955();
                int var117 = field967.method3035();
                method1039(var115, var116, var117);
                field969 = -1;
                return true;
            }
            if (field969 == 144) {
                String var118 = field967.method2964();
                Object[] var119 = new Object[var118.length() + 1];
                for (int var120 = var118.length() - 1; var120 >= 0; var120--) {
                    if (var118.charAt(var120) == 's') {
                        var119[var120 + 1] = field967.method2964();
                    } else {
                        var119[var120 + 1] = Integer.valueOf(field967.method2960());
                    }
                }
                var119[0] = Integer.valueOf(field967.method2960());
                class69 var121 = new class69();
                var121.field847 = var119;
                class82.method2853(var121);
                field969 = -1;
                return true;
            }
            if (field969 == 197) {
                field939 = field967.method2955();
                if (field939 == 1) {
                    field940 = field967.method3035();
                }
                if (field939 >= 2 && field939 <= 6) {
                    if (field939 == 2) {
                        field945 = 64;
                        field946 = 64;
                    }
                    if (field939 == 3) {
                        field945 = 0;
                        field946 = 64;
                    }
                    if (field939 == 4) {
                        field945 = 128;
                        field946 = 64;
                    }
                    if (field939 == 5) {
                        field945 = 64;
                        field946 = 0;
                    }
                    if (field939 == 6) {
                        field945 = 64;
                        field946 = 128;
                    }
                    field939 = 2;
                    field1015 = field967.method3035();
                    field968 = field967.method3035();
                    field944 = field967.method2955();
                }
                if (field939 == 10) {
                    field941 = field967.method3035();
                }
                field969 = -1;
                return true;
            }
            if (field969 == 2) {
                int var122 = field967.method2960();
                class217 var123 = class217.method3237(var122);
                for (int var124 = 0; var124 < var123.field2765.length; var124++) {
                    var123.field2765[var124] = -1;
                    var123.field2765[var124] = 0;
                }
                method165(var123);
                field969 = -1;
                return true;
            }
            if (field969 == 9) {
                int var125 = field967.method3035();
                int var126 = field967.method3028();
                class212.field2619[var125] = var126;
                if (class212.field2621[var125] != var126) {
                    class212.field2621[var125] = var126;
                }
                method1038(var125);
                field1100[++field1101 - 1 & 0x1F] = var125;
                field969 = -1;
                return true;
            }
            if (field969 == 65) {
                int var127 = field967.method2960();
                int var128 = field967.method3035();
                if (var127 < -70000) {
                    var128 += 32768;
                }
                class217 var129;
                if (var127 >= 0) {
                    var129 = class217.method3237(var127);
                } else {
                    var129 = null;
                }
                while (field967.field2405 < field1171) {
                    int var130 = field967.method2969();
                    int var131 = field967.method3035();
                    int var132 = 0;
                    if (var131 != 0) {
                        var132 = field967.method2955();
                        if (var132 == 255) {
                            var132 = field967.method2960();
                        }
                    }
                    if (var129 != null && var130 >= 0 && var130 < var129.field2765.length) {
                        var129.field2765[var130] = var131;
                        var129.field2778[var130] = var132;
                    }
                    class64.method251(var128, var130, var131 - 1, var132);
                }
                if (var129 != null) {
                    method165(var129);
                }
                method2265();
                field1102[++field1103 - 1 & 0x1F] = var128 & 0x7FFF;
                field969 = -1;
                return true;
            }
            if (field969 == 16) {
                int var133 = field967.method2960();
                int var134 = field967.method3028();
                class68 var135 = (class68) field1075.method3352((long) var133);
                class68 var136 = (class68) field1075.method3352((long) var134);
                if (var136 != null) {
                    method1452(var136, var135 == null || var135.field835 != var136.field835);
                }
                if (var135 != null) {
                    var135.method3407();
                    field1075.method3358(var135, (long) var134);
                }
                class217 var137 = class217.method3237(var133);
                if (var137 != null) {
                    method165(var137);
                }
                class217 var138 = class217.method3237(var134);
                if (var138 != null) {
                    method165(var138);
                    method18(Statics.field2433[var138.field2739 >>> 16], var138, true);
                }
                if (field1074 != -1) {
                    int var139 = field1074;
                    if (class217.method1688(var139)) {
                        method4168(Statics.field2433[var139], 1);
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 18) {
                while (field967.field2405 < field1171) {
                    boolean var140 = field967.method2955() == 1;
                    String var141 = field967.method2964();
                    String var142 = field967.method2964();
                    int var143 = field967.method3035();
                    int var144 = field967.method2955();
                    int var145 = field967.method2955();
                    boolean var146 = (var145 & 0x2) != 0;
                    boolean var147 = (var145 & 0x1) != 0;
                    if (var143 > 0) {
                        field967.method2964();
                        field967.method2955();
                        field967.method2960();
                    }
                    field967.method2964();
                    for (int var148 = 0; var148 < field952; var148++) {
                        class66 var149 = field1182[var148];
                        if (var140) {
                            if (var142.equals(var149.field827)) {
                                var149.field827 = var141;
                                var149.field821 = var142;
                                var141 = null;
                                break;
                            }
                        } else if (var141.equals(var149.field827)) {
                            if (var149.field822 != var143) {
                                boolean var150 = true;
                                for (class67 var151 = (class67) field999.method3454(); var151 != null; var151 = (class67) field999.method3460()) {
                                    if (var151.field830.equals(var141)) {
                                        if (var143 != 0 && var151.field829 == 0) {
                                            var151.method3466();
                                            var150 = false;
                                        } else if (var143 == 0 && var151.field829 != 0) {
                                            var151.method3466();
                                            var150 = false;
                                        }
                                    }
                                }
                                if (var150) {
                                    field999.method3463(new class67(var141, var143));
                                }
                                var149.field822 = var143;
                            }
                            var149.field821 = var142;
                            var149.field823 = var144;
                            var149.field824 = var146;
                            var149.field826 = var147;
                            var141 = null;
                            break;
                        }
                    }
                    if (var141 != null && field952 < 400) {
                        class66 var152 = new class66();
                        field1182[field952] = var152;
                        var152.field827 = var141;
                        var152.field821 = var142;
                        var152.field822 = var143;
                        var152.field823 = var144;
                        var152.field824 = var146;
                        var152.field826 = var147;
                        field952++;
                    }
                }
                field1181 = 2;
                field1107 = field1099;
                boolean var153 = false;
                int var154 = field952;
                while (var154 > 0) {
                    boolean var155 = true;
                    var154--;
                    for (int var156 = 0; var156 < var154; var156++) {
                        boolean var157 = false;
                        class66 var158 = field1182[var156];
                        class66 var159 = field1182[var156 + 1];
                        if (field1121 != var158.field822 && field1121 == var159.field822) {
                            var157 = true;
                        }
                        if (!var157 && var158.field822 == 0 && var159.field822 != 0) {
                            var157 = true;
                        }
                        if (!var157 && !var158.field824 && var159.field824) {
                            var157 = true;
                        }
                        if (!var157 && !var158.field826 && var159.field826) {
                            var157 = true;
                        }
                        if (var157) {
                            class66 var160 = field1182[var156];
                            field1182[var156] = field1182[var156 + 1];
                            field1182[var156 + 1] = var160;
                            var155 = false;
                        }
                    }
                    if (var155) {
                        break;
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 129) {
                int var161 = field967.method2960();
                int var162 = field967.method2960();
                int var163 = 0;
                if (Statics.field357 == null || !Statics.field357.isValid()) {
                    try {
                        Iterator var164 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var164.hasNext()) {
                            GarbageCollectorMXBean var165 = (GarbageCollectorMXBean) var164.next();
                            if (var165.isValid()) {
                                Statics.field357 = var165;
                                field725 = -1L;
                                field731 = -1L;
                            }
                        }
                    } catch (Throwable var336) {
                    }
                }
                if (Statics.field357 != null) {
                    long var167 = class176.method2725();
                    long var169 = Statics.field357.getCollectionTime();
                    if (field731 != -1L) {
                        long var171 = var169 - field731;
                        long var173 = var167 - field725;
                        if (var173 != 0L) {
                            var163 = (int) (var171 * 100L / var173);
                        }
                    }
                    field731 = var169;
                    field725 = var167;
                }
                field965.method3210(228);
                field965.method2982(field711);
                field965.method2981(var163);
                field965.method2942(var161);
                field965.method2942(var162);
                field969 = -1;
                return true;
            }
            if (field969 == 203) {
                field967.field2405 += 28;
                if (field967.method2965()) {
                    class180 var177 = field967;
                    int var178 = field967.field2405 - 28;
                    method469(var177.field2409, var178);
                    if (class156.field2259 != null) {
                        try {
                            class156.field2259.method2181(0L);
                            class156.field2259.method2186(var177.field2409, var178, 24);
                        } catch (Exception var335) {
                        }
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 186) {
                Statics.field552 = class278.method3966(field967.method2955());
                field969 = -1;
                return true;
            }
            if (field969 == 153) {
                int var180 = field967.method3018();
                int var181 = field967.method3028();
                class217 var182 = class217.method3237(var181);
                if (var182.field2702 != 2 || var182.field2677 != var180) {
                    var182.field2702 = 2;
                    var182.field2677 = var180;
                    method165(var182);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 221) {
                for (int var183 = 0; var183 < class212.field2621.length; var183++) {
                    if (class212.field2621[var183] != class212.field2619[var183]) {
                        class212.field2621[var183] = class212.field2619[var183];
                        method1038(var183);
                        field1100[++field1101 - 1 & 0x1F] = var183;
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 235) {
                int var184 = field967.method3035();
                class64 var185 = (class64) class64.field799.method3352((long) var184);
                if (var185 != null) {
                    var185.method3407();
                }
                field1102[++field1103 - 1 & 0x1F] = var184 & 0x7FFF;
                field969 = -1;
                return true;
            }
            if (field969 == 57 || field969 == 40 || field969 == 163 || field969 == 143 || field969 == 44 || field969 == 195 || field969 == 187 || field969 == 23 || field969 == 19 || field969 == 178) {
                method537();
                field969 = -1;
                return true;
            }
            if (field969 == 141) {
                int var186 = field967.method2960();
                class68 var187 = (class68) field1075.method3352((long) var186);
                if (var187 != null) {
                    method1452(var187, true);
                }
                if (field1078 != null) {
                    method165(field1078);
                    field1078 = null;
                }
                field969 = -1;
                return true;
            }
            if (field969 == 182) {
                for (int var188 = 0; var188 < Statics.field2453; var188++) {
                    class242 var189 = class242.method3180(var188);
                    if (var189 != null) {
                        class212.field2619[var188] = 0;
                        class212.field2621[var188] = 0;
                    }
                }
                method2265();
                field1101 += 32;
                field969 = -1;
                return true;
            }
            if (field969 == 208) {
                class95.field1486 = 0;
                for (int var190 = 0; var190 < 2048; var190++) {
                    class95.field1479[var190] = null;
                    class95.field1478[var190] = 1;
                }
                for (int var191 = 0; var191 < 2048; var191++) {
                    field1034[var191] = null;
                }
                class95.method233(field967);
                field969 = -1;
                return true;
            }
            if (field969 == 133) {
                field1184 = field967.method2955();
                field969 = -1;
                return true;
            }
            if (field969 == 55) {
                boolean var192 = field967.method2984() == 1;
                int var193 = field967.method3002();
                class217 var194 = class217.method3237(var193);
                if (var194.field2679 != var192) {
                    var194.field2679 = var192;
                    method165(var194);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 17) {
                int var195 = field1171 + field967.field2405;
                int var196 = field967.method3035();
                int var197 = field967.method3035();
                if (field1074 != var196) {
                    field1074 = var196;
                    this.method1106(false);
                    method234(field1074);
                    class82.method196(field1074);
                    for (int var198 = 0; var198 < 100; var198++) {
                        field1119[var198] = true;
                    }
                }
                while (var197-- > 0) {
                    int var199 = field967.method2960();
                    int var200 = field967.method3035();
                    int var201 = field967.method2955();
                    class68 var202 = (class68) field1075.method3352((long) var199);
                    if (var202 != null && var202.field835 != var200) {
                        method1452(var202, true);
                        var202 = null;
                    }
                    if (var202 == null) {
                        class68 var203 = new class68();
                        var203.field835 = var200;
                        var203.field836 = var201;
                        field1075.method3358(var203, (long) var199);
                        method234(var200);
                        class217 var204 = class217.method3237(var199);
                        method165(var204);
                        if (field1078 != null) {
                            method165(field1078);
                            field1078 = null;
                        }
                        method79();
                        method18(Statics.field2433[var199 >> 16], var204, false);
                        class82.method196(var200);
                        if (field1074 != -1) {
                            int var205 = field1074;
                            if (class217.method1688(var205)) {
                                method4168(Statics.field2433[var205], 1);
                            }
                        }
                        var202 = var203;
                    }
                    var202.field837 = true;
                }
                for (class68 var207 = (class68) field1075.method3355(); var207 != null; var207 = (class68) field1075.method3356()) {
                    if (var207.field837) {
                        var207.field837 = false;
                    } else {
                        method1452(var207, true);
                    }
                }
                field1033 = new class191(512);
                while (field967.field2405 < var195) {
                    int var208 = field967.method2960();
                    int var209 = field967.method3035();
                    int var210 = field967.method3035();
                    int var211 = field967.method2960();
                    for (int var212 = var209; var212 <= var210; var212++) {
                        long var213 = ((long) var208 << 32) + (long) var212;
                        field1033.method3358(new class199(var211), var213);
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 155) {
                class79 var215 = new class79();
                var215.field1292 = field967.method2964();
                var215.field1289 = field967.method3035();
                int var216 = field967.method2960();
                var215.field1290 = var216;
                method2525(45);
                Statics.field3676.method2791();
                Statics.field3676 = null;
                class91.method1631(var215);
                field969 = -1;
                return false;
            }
            if (field969 == 89) {
                int var217 = field967.method2960();
                int var218 = field967.method3035();
                if (var217 < -70000) {
                    var218 += 32768;
                }
                class217 var219;
                if (var217 >= 0) {
                    var219 = class217.method3237(var217);
                } else {
                    var219 = null;
                }
                if (var219 != null) {
                    for (int var220 = 0; var220 < var219.field2765.length; var220++) {
                        var219.field2765[var220] = 0;
                        var219.field2778[var220] = 0;
                    }
                }
                class64 var221 = (class64) class64.field799.method3352((long) var218);
                if (var221 != null) {
                    for (int var222 = 0; var222 < var221.field796.length; var222++) {
                        var221.field796[var222] = -1;
                        var221.field801[var222] = 0;
                    }
                }
                int var223 = field967.method3035();
                for (int var224 = 0; var224 < var223; var224++) {
                    int var225 = field967.method2991();
                    int var226 = field967.method2955();
                    if (var226 == 255) {
                        var226 = field967.method2960();
                    }
                    if (var219 != null && var224 < var219.field2765.length) {
                        var219.field2765[var224] = var225;
                        var219.field2778[var224] = var226;
                    }
                    class64.method251(var218, var224, var225 - 1, var226);
                }
                if (var219 != null) {
                    method165(var219);
                }
                method2265();
                field1102[++field1103 - 1 & 0x1F] = var218 & 0x7FFF;
                field969 = -1;
                return true;
            }
            if (field969 == 115) {
                field1108 = field1099;
                if (field1171 == 0) {
                    field978 = null;
                    field1140 = null;
                    Statics.field350 = 0;
                    Statics.field451 = null;
                    field969 = -1;
                    return true;
                }
                field1140 = field967.method2964();
                long var227 = field967.method3004();
                long var229 = var227;
                String var231;
                if (var227 <= 0L || var227 >= 6582952005840035281L) {
                    var231 = null;
                } else if (var227 % 37L == 0L) {
                    var231 = null;
                } else {
                    int var232 = 0;
                    for (long var233 = var227; var233 != 0L; var233 /= 37L) {
                        var232++;
                    }
                    StringBuilder var235 = new StringBuilder(var232);
                    while (var229 != 0L) {
                        long var236 = var229;
                        var229 /= 37L;
                        var235.append(class269.field3679[(int) (var236 - var229 * 37L)]);
                    }
                    var231 = var235.reverse().toString();
                }
                field978 = var231;
                Statics.field619 = field967.method2956();
                int var238 = field967.method2955();
                if (var238 == 255) {
                    field969 = -1;
                    return true;
                }
                Statics.field350 = var238;
                class75[] var239 = new class75[100];
                for (int var240 = 0; var240 < Statics.field350; var240++) {
                    var239[var240] = new class75();
                    var239[var240].field910 = field967.method2964();
                    var239[var240].field911 = class268.method3677(var239[var240].field910, Statics.field43);
                    var239[var240].field912 = field967.method3035();
                    var239[var240].field913 = field967.method2956();
                    field967.method2964();
                    if (var239[var240].field910.equals(Statics.field2427.field896)) {
                        Statics.field2161 = var239[var240].field913;
                    }
                }
                boolean var241 = false;
                int var242 = Statics.field350;
                while (var242 > 0) {
                    boolean var243 = true;
                    var242--;
                    for (int var244 = 0; var244 < var242; var244++) {
                        if (var239[var244].field911.compareTo(var239[var244 + 1].field911) > 0) {
                            class75 var245 = var239[var244];
                            var239[var244] = var239[var244 + 1];
                            var239[var244 + 1] = var245;
                            var243 = false;
                        }
                    }
                    if (var243) {
                        break;
                    }
                }
                Statics.field451 = var239;
                field969 = -1;
                return true;
            }
            if (field969 == 100) {
                int var246 = field967.method2969();
                boolean var247 = field967.method2955() == 1;
                String var248 = "";
                boolean var249 = false;
                if (var247) {
                    var248 = field967.method2964();
                    if (method2868(var248)) {
                        var249 = true;
                    }
                }
                String var250 = field967.method2964();
                if (!var249) {
                    class97.method1053(var246, var248, var250);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 49) {
                int var251 = field967.method2991();
                int var252 = field967.method3028();
                int var253 = var251 >> 10 & 0x1F;
                int var254 = var251 >> 5 & 0x1F;
                int var255 = var251 & 0x1F;
                int var256 = (var255 << 3) + (var253 << 19) + (var254 << 11);
                class217 var257 = class217.method3237(var252);
                if (var257.field2659 != var256) {
                    var257.field2659 = var256;
                    method165(var257);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 168) {
                String var258 = field967.method2964();
                long var259 = field967.method3004();
                long var261 = (long) field967.method3035();
                long var263 = (long) field967.method3059();
                class231 var265 = (class231) class169.method648(class231.method1094(), field967.method2955());
                long var266 = (var261 << 32) + var263;
                boolean var268 = false;
                for (int var269 = 0; var269 < 100; var269++) {
                    if (field1133[var269] == var266) {
                        var268 = true;
                        break;
                    }
                }
                if (var265.field3184 && method2868(var258)) {
                    var268 = true;
                }
                if (!var268 && field1176 == 0) {
                    field1133[field1054] = var266;
                    field1054 = (field1054 + 1) % 100;
                    String var270 = class265.method4563(class271.method2713(class266.method3865(field967)));
                    if (var265.field3182 == -1) {
                        class97.method471(9, var258, var270, class269.method1476(var259));
                    } else {
                        int var271 = var265.field3182;
                        String var272 = "<img=" + var271 + ">";
                        class97.method471(9, var272 + var258, var270, class269.method1476(var259));
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 83) {
                class95.method455(field967, field1171);
                field969 = -1;
                return true;
            }
            if (field969 == 180) {
                field1161 = true;
                Statics.field673 = field967.method2955();
                Statics.field515 = field967.method2955();
                Statics.field2360 = field967.method3035();
                Statics.field2455 = field967.method2955();
                Statics.field428 = field967.method2955();
                if (Statics.field428 >= 100) {
                    int var273 = Statics.field673 * 128 + 64;
                    int var274 = Statics.field515 * 128 + 64;
                    int var275 = method2209(var273, var274, Statics.field44) - Statics.field2360;
                    int var276 = var273 - Statics.field2622;
                    int var277 = var275 - Statics.field794;
                    int var278 = var274 - Statics.field1545;
                    int var279 = (int) Math.sqrt((double) (var276 * var276 + var278 * var278));
                    Statics.field257 = (int) (Math.atan2((double) var277, (double) var279) * 325.949D) & 0x7FF;
                    Statics.field2419 = (int) (Math.atan2((double) var276, (double) var278) * -325.949D) & 0x7FF;
                    if (Statics.field257 < 128) {
                        Statics.field257 = 128;
                    }
                    if (Statics.field257 > 383) {
                        Statics.field257 = 383;
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 37) {
                String var280 = field967.method2964();
                long var281 = (long) field967.method3035();
                long var283 = (long) field967.method3059();
                class231 var285 = (class231) class169.method648(class231.method1094(), field967.method2955());
                long var286 = (var281 << 32) + var283;
                boolean var288 = false;
                for (int var289 = 0; var289 < 100; var289++) {
                    if (field1133[var289] == var286) {
                        var288 = true;
                        break;
                    }
                }
                if (method2868(var280)) {
                    var288 = true;
                }
                if (!var288 && field1176 == 0) {
                    field1133[field1054] = var286;
                    field1054 = (field1054 + 1) % 100;
                    String var290 = class265.method4563(class271.method2713(class266.method3865(field967)));
                    byte var291;
                    if (var285.field3183) {
                        var291 = 7;
                    } else {
                        var291 = 3;
                    }
                    if (var285.field3182 == -1) {
                        class97.method1053(var291, var280, var290);
                    } else {
                        int var293 = var285.field3182;
                        String var294 = "<img=" + var293 + ">";
                        class97.method1053(var291, var294 + var280, var290);
                    }
                }
                field969 = -1;
                return true;
            }
            if (field969 == 193) {
                int var295 = field967.method3045();
                Statics.field436 = Statics.field727.method2761(var295);
                field969 = -1;
                return true;
            }
            if (field969 == 128) {
                String var296 = field967.method2964();
                Statics.field2203 = var296;
                try {
                    String var297 = Statics.field1202.getParameter(class275.field3730.field3723);
                    String var298 = Statics.field1202.getParameter(class275.field3731.field3723);
                    String var299 = var297 + "settings=" + var296 + "; version=1; path=/; domain=" + var298;
                    String var300;
                    if (var296.length() == 0) {
                        var300 = var299 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var301 = var299 + "; Expires=";
                        long var302 = class176.method2725() + 94608000000L;
                        class183.field2460.setTime(new Date(var302));
                        int var304 = class183.field2460.get(7);
                        int var305 = class183.field2460.get(5);
                        int var306 = class183.field2460.get(2);
                        int var307 = class183.field2460.get(1);
                        int var308 = class183.field2460.get(11);
                        int var309 = class183.field2460.get(12);
                        int var310 = class183.field2460.get(13);
                        String var311 = class183.field2459[var304 - 1] + ", " + var305 / 10 + var305 % 10 + "-" + class183.field2461[0][var306] + "-" + var307 + " " + var308 / 10 + var308 % 10 + ":" + var309 / 10 + var309 % 10 + ":" + var310 / 10 + var310 % 10 + " GMT";
                        var300 = var301 + var311 + "; Max-Age=" + 94608000L;
                    }
                    class53.method692(Statics.field1202, "document.cookie=\"" + var300 + "\"");
                } catch (Throwable var334) {
                }
                field969 = -1;
                return true;
            }
            if (field969 == 146) {
                String var313 = field967.method2964();
                String var314 = class265.method4563(class271.method2713(class266.method3865(field967)));
                class97.method1053(6, var313, var314);
                field969 = -1;
                return true;
            }
            if (field969 == 64) {
                int var315 = field967.method3035();
                int var316 = field967.method2991();
                int var317 = field967.method3045();
                class217 var318 = class217.method3237(var317);
                var318.field2715 = (var316 << 16) + var315;
                field969 = -1;
                return true;
            }
            if (field969 == 20) {
                int var319 = field967.method3045();
                int var320 = field967.method2991();
                if (var320 == 65535) {
                    var320 = -1;
                }
                int var321 = field967.method3045();
                class217 var322 = class217.method3237(var319);
                if (var322.field2680) {
                    var322.field2779 = var320;
                    var322.field2787 = var321;
                    class257 var324 = class257.method637(var320);
                    var322.field2710 = var324.field3505;
                    var322.field2711 = var324.field3506;
                    var322.field2733 = var324.field3507;
                    var322.field2708 = var324.field3540;
                    var322.field2709 = var324.field3509;
                    var322.field2664 = var324.field3538;
                    if (var324.field3512 == 1) {
                        var322.field2717 = 1;
                    } else {
                        var322.field2717 = 2;
                    }
                    if (var322.field2714 > 0) {
                        var322.field2664 = var322.field2664 * 32 / var322.field2714;
                    } else if (var322.field2670 > 0) {
                        var322.field2664 = var322.field2664 * 32 / var322.field2670;
                    }
                    method165(var322);
                } else if (var320 == -1) {
                    var322.field2702 = 0;
                    field969 = -1;
                    return true;
                } else {
                    class257 var323 = class257.method637(var320);
                    var322.field2702 = 4;
                    var322.field2677 = var320;
                    var322.field2710 = var323.field3505;
                    var322.field2711 = var323.field3506;
                    var322.field2664 = var323.field3538 * 100 / var321;
                    method165(var322);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 174) {
                field984 = field967.method3035() * 30;
                field1111 = field1099;
                field969 = -1;
                return true;
            }
            if (field969 == 244) {
                int var325 = field967.method2991();
                int var326 = field967.method3045();
                class217 var327 = class217.method3237(var326);
                if (var327.field2702 != 1 || var327.field2677 != var325) {
                    var327.field2702 = 1;
                    var327.field2677 = var325;
                    method165(var327);
                }
                field969 = -1;
                return true;
            }
            if (field969 == 120) {
                int var328 = field967.method3002();
                class217 var329 = class217.method3237(var328);
                var329.field2702 = 3;
                var329.field2677 = Statics.field2427.field906.method3737();
                method165(var329);
                field969 = -1;
                return true;
            }
            if (field969 == 104) {
                Statics.field454 = field967.method2983();
                Statics.field1271 = field967.method3137();
                while (field967.field2405 < field1171) {
                    field969 = field967.method2955();
                    method537();
                }
                field969 = -1;
                return true;
            }
            class153.method1775("" + field969 + class87.field1380 + field973 + class87.field1380 + field1098 + class87.field1380 + field1171, (Throwable) null);
            method3255();
        } catch (IOException var342) {
            method2831();
        } catch (Exception var343) {
            String var332 = "" + field969 + class87.field1380 + field973 + class87.field1380 + field1098 + class87.field1380 + field1171 + class87.field1380 + (Statics.field2122 + Statics.field2427.field1263[0]) + class87.field1380 + (Statics.field1505 + Statics.field2427.field1264[0]) + class87.field1380;
            for (int var333 = 0; var333 < field1171 && var333 < 50; var333++) {
                var332 = var332 + field967.field2409[var333] + class87.field1380;
            }
            class153.method1775(var332, var343);
            method3255();
        }
        return true;
    }

    @ObfuscatedName("aj.hq(I)V")
    public static final void method537() {
        if (field969 == 195) {
            int var0 = field967.method2983();
            int var1 = (var0 >> 4 & 0x7) + Statics.field454;
            int var2 = (var0 & 0x7) + Statics.field1271;
            int var3 = field967.method3035();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class194 var4 = field1044[Statics.field44][var1][var2];
                if (var4 != null) {
                    for (class93 var5 = (class93) var4.method3409(); var5 != null; var5 = (class93) var4.method3429()) {
                        if ((var3 & 0x7FFF) == var5.field1471) {
                            var5.method3407();
                            break;
                        }
                    }
                    if (var4.method3409() == null) {
                        field1044[Statics.field44][var1][var2] = null;
                    }
                    method643(var1, var2);
                }
            }
        } else if (field969 == 40) {
            int var6 = field967.method2955();
            int var7 = (var6 >> 4 & 0x7) + Statics.field454;
            int var8 = (var6 & 0x7) + Statics.field1271;
            int var9 = field967.method3035();
            int var10 = field967.method3035();
            int var11 = field967.method3035();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class194 var12 = field1044[Statics.field44][var7][var8];
                if (var12 != null) {
                    for (class93 var13 = (class93) var12.method3409(); var13 != null; var13 = (class93) var12.method3429()) {
                        if ((var9 & 0x7FFF) == var13.field1471 && var13.field1472 == var10) {
                            var13.field1472 = var11;
                            break;
                        }
                    }
                    method643(var7, var8);
                }
            }
        } else if (field969 == 143) {
            int var14 = field967.method2955();
            int var15 = (var14 >> 4 & 0x7) + Statics.field454;
            int var16 = (var14 & 0x7) + Statics.field1271;
            int var17 = field967.method3035();
            int var18 = field967.method2955();
            int var19 = field967.method3035();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                int var20 = var15 * 128 + 64;
                int var21 = var16 * 128 + 64;
                class83 var22 = new class83(var17, Statics.field44, var20, var21, method2209(var20, var21, Statics.field44) - var18, var19, field931);
                field1047.method3411(var22);
            }
        } else if (field969 == 19) {
            int var23 = field967.method2983();
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = field988[var24];
            int var27 = field967.method3137();
            int var28 = (var27 >> 4 & 0x7) + Statics.field454;
            int var29 = (var27 & 0x7) + Statics.field1271;
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                method3618(Statics.field44, var28, var29, var26, -1, var24, var25, 0, -1);
            }
        } else if (field969 == 44) {
            int var30 = field967.method2955();
            int var31 = (var30 >> 4 & 0x7) + Statics.field454;
            int var32 = (var30 & 0x7) + Statics.field1271;
            int var33 = var31 + field967.method2956();
            int var34 = var32 + field967.method2956();
            int var35 = field967.method2958();
            int var36 = field967.method3035();
            int var37 = field967.method2955() * 4;
            int var38 = field967.method2955() * 4;
            int var39 = field967.method3035();
            int var40 = field967.method3035();
            int var41 = field967.method2955();
            int var42 = field967.method2955();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                int var46 = var34 * 128 + 64;
                class92 var47 = new class92(var36, Statics.field44, var43, var44, method2209(var43, var44, Statics.field44) - var37, field931 + var39, field931 + var40, var41, var42, var35, var38);
                var47.method1671(var45, var46, method2209(var45, var46, Statics.field44) - var38, field931 + var39);
                field1046.method3411(var47);
            }
        } else {
            if (field969 == 163) {
                byte var48 = field967.method2986();
                int var49 = field967.method2993();
                byte var50 = field967.method2986();
                byte var51 = field967.method2986();
                int var52 = field967.method3018();
                byte var53 = field967.method2956();
                int var54 = field967.method2984();
                int var55 = (var54 >> 4 & 0x7) + Statics.field454;
                int var56 = (var54 & 0x7) + Statics.field1271;
                int var57 = field967.method3018();
                int var58 = field967.method3018();
                int var59 = field967.method3137();
                int var60 = var59 >> 2;
                int var61 = var59 & 0x3;
                int var62 = field988[var60];
                class74 var63;
                if (field1179 == var57) {
                    var63 = Statics.field2427;
                } else {
                    var63 = field1034[var57];
                }
                if (var63 != null) {
                    class256 var64 = class256.method2710(var49);
                    int var65;
                    int var66;
                    if (var61 == 1 || var61 == 3) {
                        var65 = var64.field3455;
                        var66 = var64.field3454;
                    } else {
                        var65 = var64.field3454;
                        var66 = var64.field3455;
                    }
                    int var67 = (var65 >> 1) + var55;
                    int var68 = (var65 + 1 >> 1) + var55;
                    int var69 = (var66 >> 1) + var56;
                    int var70 = (var66 + 1 >> 1) + var56;
                    int[][] var71 = class62.field781[Statics.field44];
                    int var72 = var71[var67][var69] + var71[var68][var69] + var71[var67][var70] + var71[var68][var70] >> 2;
                    int var73 = (var55 << 7) + (var65 << 6);
                    int var74 = (var56 << 7) + (var66 << 6);
                    class132 var75 = var64.method4256(var60, var61, var71, var73, var72, var74);
                    if (var75 != null) {
                        method3618(Statics.field44, var55, var56, var62, -1, 0, 0, var52 + 1, var58 + 1);
                        var63.field892 = field931 + var52;
                        var63.field893 = field931 + var58;
                        var63.field897 = var75;
                        var63.field907 = var55 * 128 + var65 * 64;
                        var63.field885 = var56 * 128 + var66 * 64;
                        var63.field898 = var72;
                        if (var48 > var51) {
                            byte var76 = var48;
                            var48 = var51;
                            var51 = var76;
                        }
                        if (var50 > var53) {
                            byte var77 = var50;
                            var50 = var53;
                            var53 = var77;
                        }
                        var63.field905 = var48 + var55;
                        var63.field884 = var51 + var55;
                        var63.field899 = var50 + var56;
                        var63.field901 = var53 + var56;
                    }
                }
            }
            if (field969 == 178) {
                int var78 = field967.method2984();
                int var79 = (var78 >> 4 & 0x7) + Statics.field454;
                int var80 = (var78 & 0x7) + Statics.field1271;
                int var81 = field967.method2993();
                int var82 = field967.method3137();
                int var83 = var82 >> 2;
                int var84 = var82 & 0x3;
                int var85 = field988[var83];
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                    method3618(Statics.field44, var79, var80, var85, var81, var83, var84, 0, -1);
                }
            } else {
                if (field969 == 57) {
                    int var86 = field967.method2955();
                    int var87 = (var86 >> 4 & 0x7) + Statics.field454;
                    int var88 = (var86 & 0x7) + Statics.field1271;
                    int var89 = field967.method3035();
                    int var90 = field967.method2955();
                    int var91 = var90 >> 4 & 0xF;
                    int var92 = var90 & 0x7;
                    int var93 = field967.method2955();
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        int var94 = var91 + 1;
                        if (Statics.field2427.field1263[0] >= var87 - var94 && Statics.field2427.field1263[0] <= var87 + var94 && Statics.field2427.field1264[0] >= var88 - var94 && Statics.field2427.field1264[0] <= var88 + var94 && field1115 != 0 && var92 > 0 && field1155 < 50) {
                            field1156[field1155] = var89;
                            field1157[field1155] = var92;
                            field1158[field1155] = var93;
                            field1104[field1155] = null;
                            field1159[field1155] = (var87 << 16) + (var88 << 8) + var91;
                            field1155++;
                        }
                    }
                }
                if (field969 == 23) {
                    int var95 = field967.method2983();
                    int var96 = (var95 >> 4 & 0x7) + Statics.field454;
                    int var97 = (var95 & 0x7) + Statics.field1271;
                    int var98 = field967.method2991();
                    int var99 = field967.method2984();
                    int var100 = var99 >> 2;
                    int var101 = var99 & 0x3;
                    int var102 = field988[var100];
                    if (var96 >= 0 && var97 >= 0 && var96 < 103 && var97 < 103) {
                        if (var102 == 0) {
                            class141 var103 = Statics.field250.method2635(Statics.field44, var96, var97);
                            if (var103 != null) {
                                int var104 = var103.field2124 >> 14 & 0x7FFF;
                                if (var100 == 2) {
                                    var103.field2127 = new class99(var104, 2, var101 + 4, Statics.field44, var96, var97, var98, false, var103.field2127);
                                    var103.field2123 = new class99(var104, 2, var101 + 1 & 0x3, Statics.field44, var96, var97, var98, false, var103.field2123);
                                } else {
                                    var103.field2127 = new class99(var104, var100, var101, Statics.field44, var96, var97, var98, false, var103.field2127);
                                }
                            }
                        }
                        if (var102 == 1) {
                            class146 var105 = Statics.field250.method2550(Statics.field44, var96, var97);
                            if (var105 != null) {
                                int var106 = var105.field2162 >> 14 & 0x7FFF;
                                if (var100 == 4 || var100 == 5) {
                                    var105.field2169 = new class99(var106, 4, var101, Statics.field44, var96, var97, var98, false, var105.field2169);
                                } else if (var100 == 6) {
                                    var105.field2169 = new class99(var106, 4, var101 + 4, Statics.field44, var96, var97, var98, false, var105.field2169);
                                } else if (var100 == 7) {
                                    var105.field2169 = new class99(var106, 4, (var101 + 2 & 0x3) + 4, Statics.field44, var96, var97, var98, false, var105.field2169);
                                } else if (var100 == 8) {
                                    var105.field2169 = new class99(var106, 4, var101 + 4, Statics.field44, var96, var97, var98, false, var105.field2169);
                                    var105.field2170 = new class99(var106, 4, (var101 + 2 & 0x3) + 4, Statics.field44, var96, var97, var98, false, var105.field2170);
                                }
                            }
                        }
                        if (var102 == 2) {
                            class147 var107 = Statics.field250.method2551(Statics.field44, var96, var97);
                            if (var100 == 11) {
                                var100 = 10;
                            }
                            if (var107 != null) {
                                var107.field2180 = new class99(var107.field2188 >> 14 & 0x7FFF, var100, var101, Statics.field44, var96, var97, var98, false, var107.field2180);
                            }
                        }
                        if (var102 == 3) {
                            class128 var108 = Statics.field250.method2552(Statics.field44, var96, var97);
                            if (var108 != null) {
                                var108.field1856 = new class99(var108.field1857 >> 14 & 0x7FFF, 22, var101, Statics.field44, var96, var97, var98, false, var108.field1856);
                            }
                        }
                    }
                } else if (field969 == 187) {
                    int var109 = field967.method3018();
                    int var110 = field967.method3035();
                    int var111 = field967.method2983();
                    int var112 = (var111 >> 4 & 0x7) + Statics.field454;
                    int var113 = (var111 & 0x7) + Statics.field1271;
                    if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                        class93 var114 = new class93();
                        var114.field1471 = var109;
                        var114.field1472 = var110;
                        if (field1044[Statics.field44][var112][var113] == null) {
                            field1044[Statics.field44][var112][var113] = new class194();
                        }
                        field1044[Statics.field44][var112][var113].method3411(var114);
                        method643(var112, var113);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gi.hy(IIIIIIIIII)V")
    public static final void method3618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class76 var9 = null;
        for (class76 var10 = (class76) field1045.method3409(); var10 != null; var10 = (class76) field1045.method3429()) {
            if (var10.field1203 == arg0 && var10.field1205 == arg1 && var10.field1198 == arg2 && var10.field1196 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class76();
            var9.field1203 = arg0;
            var9.field1196 = arg3;
            var9.field1205 = arg1;
            var9.field1198 = arg2;
            Statics.method2447(var9);
            field1045.method3411(var9);
        }
        var9.field1197 = arg4;
        var9.field1204 = arg5;
        var9.field1207 = arg6;
        var9.field1195 = arg7;
        var9.field1206 = arg8;
    }

    @ObfuscatedName("cc.hn(B)V")
    public static final void method1773() {
        for (class76 var0 = (class76) field1045.method3409(); var0 != null; var0 = (class76) field1045.method3429()) {
            if (var0.field1206 == -1) {
                var0.field1195 = 0;
                Statics.method2447(var0);
            } else {
                var0.method3407();
            }
        }
    }

    @ObfuscatedName("at.he(I)V")
    public static final void method562() {
        for (class76 var0 = (class76) field1045.method3409(); var0 != null; var0 = (class76) field1045.method3429()) {
            if (var0.field1206 > 0) {
                var0.field1206--;
            }
            if (var0.field1206 == 0) {
                if (var0.field1199 >= 0) {
                    int var1 = var0.field1199;
                    int var2 = var0.field1201;
                    class256 var3 = class256.method2710(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4276(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method467(var0.field1203, var0.field1196, var0.field1205, var0.field1198, var0.field1199, var0.field1200, var0.field1201);
                var0.method3407();
            } else {
                if (var0.field1195 > 0) {
                    var0.field1195--;
                }
                if (var0.field1195 == 0 && var0.field1205 >= 1 && var0.field1198 >= 1 && var0.field1205 <= 102 && var0.field1198 <= 102) {
                    if (var0.field1197 >= 0) {
                        int var5 = var0.field1197;
                        int var6 = var0.field1204;
                        class256 var7 = class256.method2710(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method4276(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method467(var0.field1203, var0.field1196, var0.field1205, var0.field1198, var0.field1197, var0.field1207, var0.field1204);
                    var0.field1195 = -1;
                    if (var0.field1199 == var0.field1197 && var0.field1199 == -1) {
                        var0.method3407();
                    } else if (var0.field1199 == var0.field1197 && var0.field1207 == var0.field1200 && var0.field1204 == var0.field1201) {
                        var0.method3407();
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.hm(IIIIIIII)V")
    public static final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field926 && Statics.field44 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field250.method2618(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field250.method2554(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field250.method2677(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field250.method2611(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field250.method2571(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field250.method2634(arg0, arg2, arg3);
                class256 var15 = class256.method2710(var12);
                if (var15.field3456 != 0) {
                    field996[arg0].method2852(arg2, arg3, var13, var14, var15.field3457);
                }
            }
            if (arg1 == 1) {
                Statics.field250.method2545(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field250.method2546(arg0, arg2, arg3);
                class256 var16 = class256.method2710(var12);
                if (var16.field3454 + arg2 > 103 || var16.field3454 + arg3 > 103 || var16.field3455 + arg2 > 103 || var16.field3455 + arg3 > 103) {
                    return;
                }
                if (var16.field3456 != 0) {
                    field996[arg0].method2841(arg2, arg3, var16.field3454, var16.field3455, var14, var16.field3457);
                }
            }
            if (arg1 == 3) {
                Statics.field250.method2547(arg0, arg2, arg3);
                class256 var17 = class256.method2710(var12);
                if (var17.field3456 == 1) {
                    field996[arg0].method2843(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field765[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method122(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field250, field996[arg0]);
    }

    @ObfuscatedName("ac.hw(III)V")
    public static final void method643(int arg0, int arg1) {
        class194 var2 = field1044[Statics.field44][arg0][arg1];
        if (var2 == null) {
            Statics.field250.method2612(Statics.field44, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class93 var5 = null;
        for (class93 var6 = (class93) var2.method3409(); var6 != null; var6 = (class93) var2.method3429()) {
            class257 var7 = class257.method637(var6.field1471);
            long var8 = (long) var7.field3511;
            if (var7.field3512 == 1) {
                var8 = (long) (var6.field1472 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field250.method2612(Statics.field44, arg0, arg1);
            return;
        }
        var2.method3415(var5);
        class93 var10 = null;
        class93 var11 = null;
        for (class93 var12 = (class93) var2.method3409(); var12 != null; var12 = (class93) var2.method3429()) {
            if (var5.field1471 != var12.field1471) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1471 != var12.field1471 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field250.method2534(Statics.field44, arg0, arg1, method2209(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field44), var5, var13, var10, var11);
    }

    @ObfuscatedName("ji.ha(ZI)V")
    public static final void method4607(boolean arg0) {
        field1037 = 0;
        field963 = 0;
        method461();
        method157(arg0);
        for (int var1 = 0; var1 < field963; var1++) {
            int var2 = field964[var1];
            class85 var3 = field960[var2];
            int var4 = field967.method2955();
            if ((var4 & 0x4) != 0) {
                var3.field1260 = field967.method3018();
                int var5 = field967.method3045();
                var3.field1215 = var5 >> 16;
                var3.field1248 = (var5 & 0xFFFF) + field931;
                var3.field1250 = 0;
                var3.field1247 = 0;
                if (var3.field1248 > field931) {
                    var3.field1250 = -1;
                }
                if (var3.field1260 == 65535) {
                    var3.field1260 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1370 = class259.method1066(field967.method2993());
                var3.field1212 = var3.field1370.field3560;
                var3.field1266 = var3.field1370.field3583;
                var3.field1216 = var3.field1370.field3566;
                var3.field1261 = var3.field1370.field3582;
                var3.field1218 = var3.field1370.field3568;
                var3.field1219 = var3.field1370.field3569;
                var3.field1249 = var3.field1370.field3558;
                var3.field1267 = var3.field1370.field3567;
                var3.field1214 = var3.field1370.field3565;
            }
            if ((var4 & 0x8) != 0) {
                int var6 = field967.method3035();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field967.method2983();
                if (var3.field1240 == var6 && var6 != -1) {
                    int var8 = class261.method3613(var6).field3604;
                    if (var8 == 1) {
                        var3.field1241 = 0;
                        var3.field1208 = 0;
                        var3.field1245 = var7;
                        var3.field1244 = 0;
                    }
                    if (var8 == 2) {
                        var3.field1244 = 0;
                    }
                } else if (var6 == -1 || var3.field1240 == -1 || class261.method3613(var6).field3607 >= class261.method3613(var3.field1240).field3607) {
                    var3.field1240 = var6;
                    var3.field1241 = 0;
                    var3.field1208 = 0;
                    var3.field1245 = var7;
                    var3.field1244 = 0;
                    var3.field1242 = var3.field1213;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var9 = field967.method2991();
                int var10 = field967.method2993();
                int var11 = var3.field1243 - (var9 - Statics.field2122 - Statics.field2122) * 64;
                int var12 = var3.field1209 - (var10 - Statics.field1505 - Statics.field1505) * 64;
                if (var11 != 0 || var12 != 0) {
                    var3.field1236 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1234 = field967.method2993();
                if (var3.field1234 == 65535) {
                    var3.field1234 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1221 = field967.method2964();
                var3.field1224 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var13 = field967.method2983();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = field967.method2969();
                        if (var18 == 32767) {
                            var18 = field967.method2969();
                            var16 = field967.method2969();
                            var15 = field967.method2969();
                            var17 = field967.method2969();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = field967.method2969();
                        }
                        int var19 = field967.method2969();
                        var3.method1458(var18, var16, var15, var17, field931, var19);
                    }
                }
                int var20 = field967.method2983();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = field967.method2969();
                        int var23 = field967.method2969();
                        if (var23 == 32767) {
                            var3.method1459(var22);
                        } else {
                            int var24 = field967.method2969();
                            int var25 = field967.method2983();
                            int var26 = var23 > 0 ? field967.method2984() : var25;
                            var3.method1467(var22, field931, var23, var24, var25, var26);
                        }
                    }
                }
            }
        }
        for (int var27 = 0; var27 < field1037; var27++) {
            int var28 = field1038[var27];
            if (field931 != field960[var28].field1257) {
                field960[var28].field1370 = null;
                field960[var28] = null;
            }
        }
        if (field1171 != field967.field2405) {
            throw new RuntimeException(field967.field2405 + class87.field1380 + field1171);
        }
        for (int var29 = 0; var29 < field961; var29++) {
            if (field960[field1029[var29]] == null) {
                throw new RuntimeException(var29 + class87.field1380 + field961);
            }
        }
    }

    @ObfuscatedName("av.hf(I)V")
    public static final void method461() {
        field967.method3212();
        int var0 = field967.method3213(8);
        if (var0 < field961) {
            for (int var1 = var0; var1 < field961; var1++) {
                field1038[++field1037 - 1] = field1029[var1];
            }
        }
        if (var0 > field961) {
            throw new RuntimeException("");
        }
        field961 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field1029[var2];
            class85 var4 = field960[var3];
            int var5 = field967.method3213(1);
            if (var5 == 0) {
                field1029[++field961 - 1] = var3;
                var4.field1257 = field931;
            } else {
                int var6 = field967.method3213(2);
                if (var6 == 0) {
                    field1029[++field961 - 1] = var3;
                    var4.field1257 = field931;
                    field964[++field963 - 1] = var3;
                } else if (var6 == 1) {
                    field1029[++field961 - 1] = var3;
                    var4.field1257 = field931;
                    int var7 = field967.method3213(3);
                    var4.method1615(var7, (byte) 1);
                    int var8 = field967.method3213(1);
                    if (var8 == 1) {
                        field964[++field963 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field1029[++field961 - 1] = var3;
                    var4.field1257 = field931;
                    int var9 = field967.method3213(3);
                    var4.method1615(var9, (byte) 2);
                    int var10 = field967.method3213(3);
                    var4.method1615(var10, (byte) 2);
                    int var11 = field967.method3213(1);
                    if (var11 == 1) {
                        field964[++field963 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1038[++field1037 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("w.hp(ZI)V")
    public static final void method157(boolean arg0) {
        while (true) {
            if (field967.method3215(field1171) >= 27) {
                int var1 = field967.method3213(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field960[var1] == null) {
                        field960[var1] = new class85();
                        var2 = true;
                    }
                    class85 var3 = field960[var1];
                    field1029[++field961 - 1] = var1;
                    var3.field1257 = field931;
                    int var4;
                    if (arg0) {
                        var4 = field967.method3213(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field967.method3213(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5 = field967.method3213(1);
                    int var6 = field967.method3213(1);
                    if (var6 == 1) {
                        field964[++field963 - 1] = var1;
                    }
                    int var7 = field1042[field967.method3213(3)];
                    if (var2) {
                        var3.field1259 = var3.field1210 = var7;
                    }
                    var3.field1370 = class259.method1066(field967.method3213(14));
                    int var8;
                    if (arg0) {
                        var8 = field967.method3213(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field967.method3213(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field1212 = var3.field1370.field3560;
                    var3.field1266 = var3.field1370.field3583;
                    if (var3.field1266 == 0) {
                        var3.field1210 = 0;
                    }
                    var3.field1216 = var3.field1370.field3566;
                    var3.field1261 = var3.field1370.field3582;
                    var3.field1218 = var3.field1370.field3568;
                    var3.field1219 = var3.field1370.field3569;
                    var3.field1249 = var3.field1370.field3558;
                    var3.field1267 = var3.field1370.field3567;
                    var3.field1214 = var3.field1370.field3565;
                    var3.method1616(Statics.field2427.field1263[0] + var4, Statics.field2427.field1264[0] + var8, var5 == 1);
                    continue;
                }
            }
            field967.method3208();
            return;
        }
    }

    @ObfuscatedName("ay.hi(Lbw;IIBI)V")
    public static final void method680(class74 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1263[0];
        int var5 = arg0.field1264[0];
        int var6 = arg0.method1071();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class163.method589(var4, var5, arg0.method1071(), method49(arg1, arg2), field996[arg0.field895], true, field1191, field1192);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method1076(field1191[var8], field1192[var8], arg3);
            }
        }
    }

    @ObfuscatedName("t.hz(III)Lfy;")
    public static class164 method49(int arg0, int arg1) {
        field1190.field2318 = arg0;
        field1190.field2319 = arg1;
        field1190.field2320 = 1;
        field1190.field2321 = 1;
        return field1190;
    }

    @ObfuscatedName("cy.hb(IIB)V")
    public static final void method1592(int arg0, int arg1) {
        if (field1028 < 2 && field974 == 0 && !field1069) {
            return;
        }
        int var2 = field1028 - 1;
        String var4;
        if (field974 == 1 && field1028 < 2) {
            var4 = class226.field3007 + class226.field3100 + field1068 + " " + class87.field1384;
        } else if (field1069 && field1028 < 2) {
            var4 = field1072 + class226.field3100 + field949 + " " + class87.field1384;
        } else {
            var4 = method1632(var2);
        }
        if (field1028 > 2) {
            var4 = var4 + class87.method961(16777215) + " " + '/' + " " + (field1028 - 2) + class226.field3011;
        }
        Statics.field828.method4488(var4, arg0 + 4, arg1 + 15, 16777215, 0, field931 / 1000);
    }

    @ObfuscatedName("er.hr(IIIIB)V")
    public static final void method2751(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1117; var4++) {
            if (field1122[var4] + field1088[var4] > arg0 && field1122[var4] < arg0 + arg2 && field1131[var4] + field1014[var4] > arg1 && field1014[var4] < arg1 + arg3) {
                field1119[var4] = true;
            }
        }
    }

    @ObfuscatedName("en.il(IIIIS)V")
    public static final void method2728(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1117; var4++) {
            if (field1122[var4] + field1088[var4] > arg0 && field1122[var4] < arg0 + arg2 && field1131[var4] + field1014[var4] > arg1 && field1014[var4] < arg1 + arg3) {
                field1120[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.it(I)V")
    public final void method1108() {
        method40();
        if (Statics.field916 != null || field1053 != null) {
            return;
        }
        int var18;
        int var21;
        int var22;
        label191: {
            int var1 = class60.field742;
            if (field1052) {
                if (var1 != 1 && (Statics.field1651 || var1 != 4)) {
                    int var2 = class60.field746;
                    int var3 = class60.field747;
                    if (var2 < Statics.field686 - 10 || var2 > Statics.field686 + Statics.field342 + 10 || var3 < Statics.field269 - 10 || var3 > Statics.field429 + Statics.field269 + 10) {
                        field1052 = false;
                        method2751(Statics.field686, Statics.field269, Statics.field342, Statics.field429);
                    }
                }
                if (var1 == 1 || !Statics.field1651 && var1 == 4) {
                    int var4 = Statics.field686;
                    int var5 = Statics.field269;
                    int var6 = Statics.field342;
                    int var7 = class60.field753;
                    int var8 = class60.field754;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field1028; var10++) {
                        int var11 = (field1028 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1 && var9 >= 0) {
                        int var12 = field920[var9];
                        int var13 = field1085[var9];
                        int var14 = field1056[var9];
                        int var15 = field921[var9];
                        String var16 = field1058[var9];
                        String var17 = field1059[var9];
                        method4362(var12, var13, var14, var15, var16, var17, class60.field753, class60.field754);
                    }
                    field1052 = false;
                    method2751(Statics.field686, Statics.field269, Statics.field342, Statics.field429);
                }
            } else {
                var18 = field1028 - 1;
                if ((var1 == 1 || !Statics.field1651 && var1 == 4) && var18 >= 0) {
                    int var20 = field1056[var18];
                    if (var20 == 39 || var20 == 40 || var20 == 41 || var20 == 42 || var20 == 43 || var20 == 33 || var20 == 34 || var20 == 35 || var20 == 36 || var20 == 37 || var20 == 38 || var20 == 1005) {
                        var21 = field920[var18];
                        var22 = field1085[var18];
                        class217 var23 = class217.method3237(var22);
                        int var24 = method4068(var23);
                        boolean var25 = (var24 >> 28 & 0x1) != 0;
                        if (var25) {
                            break label191;
                        }
                        class218 var10000 = (class218) null;
                        if (class218.method483(method4068(var23))) {
                            break label191;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field1651 && var1 == 4) && this.method1109()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field1651 && var1 == 4) && field1028 > 0 && var18 >= 0) {
                    int var26 = field920[var18];
                    int var27 = field1085[var18];
                    int var28 = field1056[var18];
                    int var29 = field921[var18];
                    String var30 = field1058[var18];
                    String var31 = field1059[var18];
                    method4362(var26, var27, var28, var29, var30, var31, class60.field753, class60.field754);
                }
                if (var1 == 2 && field1028 > 0) {
                    this.method1110(class60.field753, class60.field754);
                }
            }
            return;
        }
        if (Statics.field916 != null && !field1106 && field1028 > 0 && !this.method1109()) {
            method1454(field1027, field1136);
        }
        field1106 = false;
        field1128 = 0;
        if (Statics.field916 != null) {
            method165(Statics.field916);
        }
        Statics.field916 = class217.method3237(var22);
        field1026 = var21;
        field1027 = class60.field753;
        field1136 = class60.field754;
        if (var18 >= 0) {
            Statics.field240 = new class88();
            Statics.field240.field1393 = field920[var18];
            Statics.field240.field1392 = field1085[var18];
            Statics.field240.field1391 = field1056[var18];
            Statics.field240.field1394 = field921[var18];
            Statics.field240.field1395 = field1058[var18];
        }
        method165(Statics.field916);
    }

    @ObfuscatedName("client.ip(I)Z")
    public final boolean method1109() {
        int var1 = field1028 - 1;
        if (field1028 > 2) {
            if (field1051 == 1 && !field1022[var1]) {
                return true;
            }
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field1056[var1];
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

    @ObfuscatedName("client.ij(III)V")
    public final void method1110(int arg0, int arg1) {
        int var3 = Statics.field828.method4552(class226.field3036);
        for (int var4 = 0; var4 < field1028; var4++) {
            int var5 = Statics.field828.method4552(method1632(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field1028 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field762) {
            var7 = Statics.field762 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field633) {
            var8 = Statics.field633 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field250.method2564(Statics.field44, arg0, arg1, false);
        field1052 = true;
        Statics.field686 = var7;
        Statics.field269 = var8;
        Statics.field342 = var3;
        Statics.field429 = field1028 * 15 + 22;
    }

    @ObfuscatedName("n.ia(Lcn;IIB)V")
    public static final void method163(class88 arg0, int arg1, int arg2) {
        method4362(arg0.field1393, arg0.field1392, arg0.field1391, arg0.field1394, arg0.field1395, arg0.field1395, arg1, arg2);
    }

    @ObfuscatedName("iy.ir(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method4362(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 37) {
            field965.method3210(80);
            field965.method2989(arg0);
            field965.method2998(arg1);
            field965.method3084(arg3);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 50) {
            class74 var8 = field1034[arg3];
            if (var8 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(4);
                field965.method2981(class51.field656[82] ? 1 : 0);
                field965.method2989(arg3);
            }
        }
        if (arg2 == 20) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(186);
            field965.method2989(Statics.field1505 + arg1);
            field965.method2940(arg3);
            field965.method2989(Statics.field2122 + arg0);
            field965.method2981(class51.field656[82] ? 1 : 0);
        }
        if (arg2 == 28) {
            field965.method3210(221);
            field965.method2942(arg1);
            class217 var9 = class217.method3237(arg1);
            if (var9.field2744 != null && var9.field2744[0][0] == 5) {
                int var10 = var9.field2744[0][1];
                class212.field2621[var10] = 1 - class212.field2621[var10];
                method1038(var10);
            }
        }
        if (arg2 == 47) {
            class74 var11 = field1034[arg3];
            if (var11 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(120);
                field965.method2989(arg3);
                field965.method2981(class51.field656[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(193);
            field965.method3084(arg3);
            field965.method3102(Statics.field1505 + arg1);
            field965.method2970(class51.field656[82] ? 1 : 0);
            field965.method2989(Statics.field2122 + arg0);
        }
        if (arg2 == 44) {
            class74 var12 = field1034[arg3];
            if (var12 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(166);
                field965.method2981(class51.field656[82] ? 1 : 0);
                field965.method3084(arg3);
            }
        }
        if (arg2 == 2) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(189);
            field965.method2940(arg3 >> 14 & 0x7FFF);
            field965.method2989(Statics.field2122 + arg0);
            field965.method2998(Statics.field373);
            field965.method2989(field1070);
            field965.method2989(Statics.field1505 + arg1);
            field965.method2982(class51.field656[82] ? 1 : 0);
        }
        if (arg2 == 18) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(21);
            field965.method2989(Statics.field2122 + arg0);
            field965.method2970(class51.field656[82] ? 1 : 0);
            field965.method3102(arg3);
            field965.method3084(Statics.field1505 + arg1);
        }
        if (arg2 == 32) {
            field965.method3210(26);
            field965.method2989(arg3);
            field965.method2999(Statics.field373);
            field965.method2940(arg0);
            field965.method2989(field1070);
            field965.method3001(arg1);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 11) {
            class85 var13 = field960[arg3];
            if (var13 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(161);
                field965.method2982(class51.field656[82] ? 1 : 0);
                field965.method3084(arg3);
            }
        }
        if (arg2 == 13) {
            class85 var14 = field960[arg3];
            if (var14 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(239);
                field965.method2981(class51.field656[82] ? 1 : 0);
                field965.method3084(arg3);
            }
        }
        if (arg2 == 43) {
            field965.method3210(42);
            field965.method3001(arg1);
            field965.method2940(arg0);
            field965.method3102(arg3);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 3) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(160);
            field965.method2989(arg3 >> 14 & 0x7FFF);
            field965.method3084(Statics.field2122 + arg0);
            field965.method2970(class51.field656[82] ? 1 : 0);
            field965.method2989(Statics.field1505 + arg1);
        }
        if (arg2 == 51) {
            class74 var15 = field1034[arg3];
            if (var15 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(65);
                field965.method2970(class51.field656[82] ? 1 : 0);
                field965.method3084(arg3);
            }
        }
        if (arg2 == 4) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(130);
            field965.method3102(Statics.field1505 + arg1);
            field965.method2982(class51.field656[82] ? 1 : 0);
            field965.method2940(arg3 >> 14 & 0x7FFF);
            field965.method3084(Statics.field2122 + arg0);
        }
        if (arg2 == 1003) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            class85 var16 = field960[arg3];
            if (var16 != null) {
                class259 var17 = var16.field1370;
                if (var17.field3584 != null) {
                    var17 = var17.method4369();
                }
                if (var17 != null) {
                    field965.method3210(236);
                    field965.method2940(var17.field3574);
                }
            }
        }
        if (arg2 == 10) {
            class85 var18 = field960[arg3];
            if (var18 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(220);
                field965.method2940(arg3);
                field965.method2981(class51.field656[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(111);
            field965.method3084(Statics.field1505 + arg1);
            field965.method2970(class51.field656[82] ? 1 : 0);
            field965.method3084(arg3 >> 14 & 0x7FFF);
            field965.method3084(Statics.field2122 + arg0);
        }
        if (arg2 == 17) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(25);
            field965.method3102(Statics.field1505 + arg1);
            field965.method3084(field1070);
            field965.method2942(Statics.field373);
            field965.method2940(Statics.field2122 + arg0);
            field965.method2981(class51.field656[82] ? 1 : 0);
            field965.method3084(arg3);
        }
        if (arg2 == 42) {
            field965.method3210(241);
            field965.method3102(arg3);
            field965.method3001(arg1);
            field965.method3084(arg0);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 31) {
            field965.method3210(213);
            field965.method2998(Statics.field372);
            field965.method2940(arg0);
            field965.method2989(arg3);
            field965.method3084(Statics.field820);
            field965.method3001(arg1);
            field965.method3102(Statics.field555);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 19) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(11);
            field965.method2940(Statics.field1505 + arg1);
            field965.method2982(class51.field656[82] ? 1 : 0);
            field965.method3084(arg3);
            field965.method2989(Statics.field2122 + arg0);
        }
        if (arg2 == 40) {
            field965.method3210(202);
            field965.method2999(arg1);
            field965.method2989(arg3);
            field965.method3102(arg0);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 8) {
            class85 var19 = field960[arg3];
            if (var19 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(181);
                field965.method2981(class51.field656[82] ? 1 : 0);
                field965.method3084(arg3);
                field965.method3084(field1070);
                field965.method2999(Statics.field373);
            }
        }
        if (arg2 == 29) {
            field965.method3210(221);
            field965.method2942(arg1);
            class217 var20 = class217.method3237(arg1);
            if (var20.field2744 != null && var20.field2744[0][0] == 5) {
                int var21 = var20.field2744[0][1];
                if (class212.field2621[var21] != var20.field2688[0]) {
                    class212.field2621[var21] = var20.field2688[0];
                    method1038(var21);
                }
            }
        }
        if (arg2 == 26) {
            method3972();
        }
        if (arg2 == 14) {
            class74 var22 = field1034[arg3];
            if (var22 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(104);
                field965.method2940(Statics.field555);
                field965.method2940(arg3);
                field965.method2998(Statics.field372);
                field965.method2970(class51.field656[82] ? 1 : 0);
                field965.method3084(Statics.field820);
            }
        }
        if (arg2 == 58) {
            class217 var23 = class217.method19(arg1, arg0);
            if (var23 != null) {
                field965.method3210(253);
                field965.method2989(field1071);
                field965.method2942(arg1);
                field965.method2989(var23.field2779);
                field965.method2989(field1070);
                field965.method3001(Statics.field373);
                field965.method3102(arg0);
            }
        }
        if (arg2 == 16) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(1);
            field965.method2989(arg3);
            field965.method2998(Statics.field372);
            field965.method3102(Statics.field1505 + arg1);
            field965.method3084(Statics.field2122 + arg0);
            field965.method2982(class51.field656[82] ? 1 : 0);
            field965.method2940(Statics.field555);
            field965.method2940(Statics.field820);
        }
        if (arg2 == 48) {
            class74 var24 = field1034[arg3];
            if (var24 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(214);
                field965.method3102(arg3);
                field965.method2981(class51.field656[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class85 var25 = field960[arg3];
            if (var25 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(46);
                field965.method2998(Statics.field372);
                field965.method2970(class51.field656[82] ? 1 : 0);
                field965.method2940(arg3);
                field965.method3084(Statics.field820);
                field965.method3084(Statics.field555);
            }
        }
        if (arg2 == 34) {
            field965.method3210(218);
            field965.method2940(arg3);
            field965.method3001(arg1);
            field965.method2940(arg0);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 22) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(205);
            field965.method3102(arg3);
            field965.method2980(class51.field656[82] ? 1 : 0);
            field965.method3102(Statics.field1505 + arg1);
            field965.method3102(Statics.field2122 + arg0);
        }
        if (arg2 == 30 && field1078 == null) {
            field965.method3210(250);
            field965.method2942(arg1);
            field965.method3084(arg0);
            field1078 = class217.method19(arg1, arg0);
            method165(field1078);
        }
        if (arg2 == 23) {
            if (field1052) {
                Statics.field250.method2686();
            } else {
                Statics.field250.method2564(Statics.field44, arg0, arg1, true);
            }
        }
        if (arg2 == 24) {
            class217 var26 = class217.method3237(arg1);
            boolean var27 = true;
            if (var26.field2663 > 0) {
                var27 = method4654(var26);
            }
            if (var27) {
                field965.method3210(221);
                field965.method2942(arg1);
            }
        }
        if (arg2 == 45) {
            class74 var28 = field1034[arg3];
            if (var28 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(231);
                field965.method2980(class51.field656[82] ? 1 : 0);
                field965.method2989(arg3);
            }
        }
        if (arg2 == 12) {
            class85 var29 = field960[arg3];
            if (var29 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(61);
                field965.method3084(arg3);
                field965.method2970(class51.field656[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field965.method3210(204);
            field965.method2940(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 41) {
            field965.method3210(102);
            field965.method2989(arg0);
            field965.method3102(arg3);
            field965.method3001(arg1);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 38) {
            method1637();
            class217 var30 = class217.method3237(arg1);
            field974 = 1;
            Statics.field555 = arg0;
            Statics.field372 = arg1;
            Statics.field820 = arg3;
            method165(var30);
            field1068 = class87.method961(16748608) + class257.method637(arg3).field3499 + class87.method961(16777215);
            if (field1068 == null) {
                field1068 = "null";
            }
            return;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var31 = class217.method19(arg1, arg0);
            if (var31 != null) {
                int var32 = var31.field2779;
                class217 var33 = class217.method19(arg1, arg0);
                if (var33 != null) {
                    if (var33.field2759 != null) {
                        class69 var34 = new class69();
                        var34.field854 = var33;
                        var34.field850 = arg3;
                        var34.field853 = arg5;
                        var34.field847 = var33.field2759;
                        class82.method2853(var34);
                    }
                    boolean var35 = true;
                    if (var33.field2663 > 0) {
                        var35 = method4654(var33);
                    }
                    if (var35 && class218.method1988(method4068(var33), arg3 - 1)) {
                        if (arg3 == 1) {
                            field965.method3210(77);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                        if (arg3 == 2) {
                            field965.method3210(60);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                        if (arg3 == 3) {
                            field965.method3210(135);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                        if (arg3 == 4) {
                            field965.method3210(246);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                        if (arg3 == 5) {
                            field965.method3210(152);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                        if (arg3 == 6) {
                            field965.method3210(177);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                        if (arg3 == 7) {
                            field965.method3210(244);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                        if (arg3 == 8) {
                            field965.method3210(109);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                        if (arg3 == 9) {
                            field965.method3210(142);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                        if (arg3 == 10) {
                            field965.method3210(195);
                            field965.method2942(arg1);
                            field965.method2940(arg0);
                            field965.method2940(var32);
                        }
                    }
                }
            }
        }
        if (arg2 == 39) {
            field965.method3210(44);
            field965.method2940(arg3);
            field965.method2989(arg0);
            field965.method3001(arg1);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 36) {
            field965.method3210(0);
            field965.method3084(arg0);
            field965.method3102(arg3);
            field965.method3001(arg1);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 35) {
            field965.method3210(93);
            field965.method3084(arg3);
            field965.method3102(arg0);
            field965.method2998(arg1);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 6) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(167);
            field965.method3084(arg3 >> 14 & 0x7FFF);
            field965.method3084(Statics.field1505 + arg1);
            field965.method3102(Statics.field2122 + arg0);
            field965.method2981(class51.field656[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class74 var36 = field1034[arg3];
            if (var36 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(9);
                field965.method2980(class51.field656[82] ? 1 : 0);
                field965.method3102(arg3);
            }
        }
        if (arg2 == 15) {
            class74 var37 = field1034[arg3];
            if (var37 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(148);
                field965.method3102(field1070);
                field965.method2942(Statics.field373);
                field965.method2970(class51.field656[82] ? 1 : 0);
                field965.method3084(arg3);
            }
        }
        if (arg2 == 25) {
            class217 var38 = class217.method19(arg1, arg0);
            if (var38 != null) {
                method1637();
                method1045(arg1, arg0, class218.method3(method4068(var38)), var38.field2779);
                field974 = 0;
                field1072 = method451(var38);
                if (field1072 == null) {
                    field1072 = "Null";
                }
                if (var38.field2680) {
                    field949 = var38.field2732 + class87.method961(16777215);
                } else {
                    field949 = class87.method961(65280) + var38.field2775 + class87.method961(16777215);
                }
            }
            return;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2191.method4945(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 5) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(86);
            field965.method3084(Statics.field1505 + arg1);
            field965.method3102(arg3 >> 14 & 0x7FFF);
            field965.method2981(class51.field656[82] ? 1 : 0);
            field965.method3102(Statics.field2122 + arg0);
        }
        if (arg2 == 49) {
            class74 var39 = field1034[arg3];
            if (var39 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(5);
                field965.method2981(class51.field656[82] ? 1 : 0);
                field965.method2989(arg3);
            }
        }
        if (arg2 == 33) {
            field965.method3210(171);
            field965.method3001(arg1);
            field965.method3102(arg3);
            field965.method3084(arg0);
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (arg2 == 9) {
            class85 var40 = field960[arg3];
            if (var40 != null) {
                field1020 = arg6;
                field1021 = arg7;
                field1023 = 2;
                field1172 = 0;
                field951 = arg0;
                field1147 = arg1;
                field965.method3210(29);
                field965.method2980(class51.field656[82] ? 1 : 0);
                field965.method3084(arg3);
            }
        }
        if (arg2 == 1004) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field965.method3210(158);
            field965.method3084(arg3);
        }
        if (arg2 == 1) {
            field1020 = arg6;
            field1021 = arg7;
            field1023 = 2;
            field1172 = 0;
            field951 = arg0;
            field1147 = arg1;
            field965.method3210(162);
            field965.method2982(class51.field656[82] ? 1 : 0);
            field965.method3102(arg3 >> 14 & 0x7FFF);
            field965.method3084(Statics.field820);
            field965.method2940(Statics.field1505 + arg1);
            field965.method2940(Statics.field2122 + arg0);
            field965.method2989(Statics.field555);
            field965.method3001(Statics.field372);
        }
        if (arg2 == 1005) {
            class217 var41 = class217.method3237(arg1);
            if (var41 == null || var41.field2778[arg0] < 100000) {
                field965.method3210(158);
                field965.method3084(arg3);
            } else {
                class97.method1053(27, "", var41.field2778[arg0] + " x " + class257.method637(arg3).field3499);
            }
            field1024 = 0;
            Statics.field2032 = class217.method3237(arg1);
            field1025 = arg0;
        }
        if (field974 != 0) {
            field974 = 0;
            method165(class217.method3237(Statics.field372));
        }
        if (field1069) {
            method1637();
        }
        if (Statics.field2032 != null && field1024 == 0) {
            method165(Statics.field2032);
        }
    }

    @ObfuscatedName("ba.is(IIIII)V")
    public static void method1045(int arg0, int arg1, int arg2, int arg3) {
        class217 var4 = class217.method19(arg0, arg1);
        if (var4 != null && var4.field2750 != null) {
            class69 var5 = new class69();
            var5.field854 = var4;
            var5.field847 = var4.field2750;
            class82.method2853(var5);
        }
        field1071 = arg3;
        field1069 = true;
        Statics.field373 = arg0;
        field1070 = arg1;
        Statics.field452 = arg2;
        method165(var4);
    }

    @ObfuscatedName("cl.iq(I)V")
    public static void method1637() {
        if (!field1069) {
            return;
        }
        class217 var0 = class217.method19(Statics.field373, field1070);
        if (var0 != null && var0.field2751 != null) {
            class69 var1 = new class69();
            var1.field854 = var0;
            var1.field847 = var0.field2751;
            class82.method2853(var1);
        }
        field1069 = false;
        method165(var0);
    }

    @ObfuscatedName("g.ie(I)V")
    public static final void method40() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field1028 - 1; var1++) {
                if (field1056[var1] < 1000 && field1056[var1 + 1] > 1000) {
                    String var2 = field1059[var1];
                    field1059[var1] = field1059[var1 + 1];
                    field1059[var1 + 1] = var2;
                    String var3 = field1058[var1];
                    field1058[var1] = field1058[var1 + 1];
                    field1058[var1 + 1] = var3;
                    int var4 = field1056[var1];
                    field1056[var1] = field1056[var1 + 1];
                    field1056[var1 + 1] = var4;
                    int var5 = field920[var1];
                    field920[var1] = field920[var1 + 1];
                    field920[var1 + 1] = var5;
                    int var6 = field1085[var1];
                    field1085[var1] = field1085[var1 + 1];
                    field1085[var1 + 1] = var6;
                    int var7 = field921[var1];
                    field921[var1] = field921[var1 + 1];
                    field921[var1 + 1] = var7;
                    boolean var8 = field1022[var1];
                    field1022[var1] = field1022[var1 + 1];
                    field1022[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("y.ih(Ljava/lang/String;Ljava/lang/String;IIIIS)V")
    public static final void method52(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field1052 || field1028 >= 500) {
            return;
        }
        field1058[field1028] = arg0;
        field1059[field1028] = arg1;
        field1056[field1028] = arg2;
        field921[field1028] = arg3;
        field920[field1028] = arg4;
        field1085[field1028] = arg5;
        field1022[field1028] = var12;
        field1028++;
    }

    @ObfuscatedName("b.ib(B)V")
    public static void method79() {
        for (int var0 = 0; var0 < field1028; var0++) {
            int var1 = field1056[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field1028 - 1) {
                    for (int var3 = var0; var3 < field1028 - 1; var3++) {
                        field1058[var3] = field1058[var3 + 1];
                        field1059[var3] = field1059[var3 + 1];
                        field1056[var3] = field1056[var3 + 1];
                        field921[var3] = field921[var3 + 1];
                        field920[var3] = field920[var3 + 1];
                        field1085[var3] = field1085[var3 + 1];
                        field1022[var3] = field1022[var3 + 1];
                    }
                }
                field1028--;
            }
        }
    }

    @ObfuscatedName("cn.ii(IB)Ljava/lang/String;")
    public static String method1632(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field1059[arg0].length() > 0) {
            return field1058[arg0] + class226.field3100 + field1059[arg0];
        } else {
            return field1058[arg0];
        }
    }

    @ObfuscatedName("de.iv(Lid;IIIB)V")
    public static final void method1970(class259 arg0, int arg1, int arg2, int arg3) {
        if (field1028 >= 400) {
            return;
        }
        if (arg0.field3584 != null) {
            arg0 = arg0.method4369();
        }
        if (arg0 == null || !arg0.field3587 || arg0.field3589 && field1082 != arg1) {
            return;
        }
        String var4 = arg0.field3559;
        if (arg0.field3577 != 0) {
            int var6 = arg0.field3577;
            int var7 = Statics.field2427.field894;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class87.method961(16711680);
            } else if (var8 < -6) {
                var9 = class87.method961(16723968);
            } else if (var8 < -3) {
                var9 = class87.method961(16740352);
            } else if (var8 < 0) {
                var9 = class87.method961(16756736);
            } else if (var8 > 9) {
                var9 = class87.method961(65280);
            } else if (var8 > 6) {
                var9 = class87.method961(4259584);
            } else if (var8 > 3) {
                var9 = class87.method961(8453888);
            } else if (var8 > 0) {
                var9 = class87.method961(12648192);
            } else {
                var9 = class87.method961(16776960);
            }
            var4 = var4 + var9 + " " + class87.field1386 + class226.field3013 + arg0.field3577 + class87.field1383;
        }
        if (arg0.field3589 && field1061) {
            method52(class226.field2915, class87.method961(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field974 == 1) {
            method52(class226.field3007, field1068 + " " + class87.field1384 + " " + class87.method961(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1069) {
            int var10 = arg0.field3589 && field1061 ? 2000 : 0;
            String[] var11 = arg0.field3563;
            if (field979) {
                var11 = method2712(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class226.field3072)) {
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
                        method52(var11[var12], class87.method961(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class226.field3072)) {
                        short var15 = 0;
                        if (field948 != class90.field1404) {
                            if (field948 == class90.field1402 || field948 == class90.field1405 && arg0.field3577 > Statics.field2427.field894) {
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
                            method52(var11[var14], class87.method961(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3589 || !field1061) {
                method52(class226.field2915, class87.method961(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field452 & 0x2) == 2) {
            method52(field1072, field949 + " " + class87.field1384 + " " + class87.method961(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bx.ig(Lbw;IIIS)V")
    public static final void method1029(class74 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2427 == arg0 || field1028 >= 400) {
            return;
        }
        String var9;
        if (arg0.field890 == 0) {
            String var4 = arg0.field900[0] + arg0.field896 + arg0.field900[1];
            int var5 = arg0.field894;
            int var6 = Statics.field2427.field894;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class87.method961(16711680);
            } else if (var7 < -6) {
                var8 = class87.method961(16723968);
            } else if (var7 < -3) {
                var8 = class87.method961(16740352);
            } else if (var7 < 0) {
                var8 = class87.method961(16756736);
            } else if (var7 > 9) {
                var8 = class87.method961(65280);
            } else if (var7 > 6) {
                var8 = class87.method961(4259584);
            } else if (var7 > 3) {
                var8 = class87.method961(8453888);
            } else if (var7 > 0) {
                var8 = class87.method961(12648192);
            } else {
                var8 = class87.method961(16776960);
            }
            var9 = var4 + var8 + " " + class87.field1386 + class226.field3013 + arg0.field894 + class87.field1383 + arg0.field900[2];
        } else {
            var9 = arg0.field900[0] + arg0.field896 + arg0.field900[1] + " " + class87.field1386 + class226.field3014 + arg0.field890 + class87.field1383 + arg0.field900[2];
        }
        if (field974 == 1) {
            method52(class226.field3007, field1068 + " " + class87.field1384 + " " + class87.method961(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1069) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field989[var10] != null) {
                    short var11 = 0;
                    if (field989[var10].equalsIgnoreCase(class226.field3072)) {
                        if (field947 == class90.field1404) {
                            continue;
                        }
                        if (field947 == class90.field1402 || field947 == class90.field1405 && arg0.field894 > Statics.field2427.field894) {
                            var11 = 2000;
                        }
                        if (Statics.field2427.field903 != 0 && arg0.field903 != 0) {
                            if (Statics.field2427.field903 == arg0.field903) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1041[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1039[var10] + var11;
                    method52(field989[var10], class87.method961(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field452 & 0x8) == 8) {
            method52(field1072, field949 + " " + class87.field1384 + " " + class87.method961(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1028; var14++) {
            if (field1056[var14] == 23) {
                field1059[var14] = class87.method961(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("q.iz(IIIIIIIII)V")
    public static final void method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method1688(arg0)) {
            Statics.field458 = null;
            method472(Statics.field2433[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field458 != null) {
                method472(Statics.field458, -1412584499, arg1, arg2, arg3, arg4, Statics.field1359, Statics.field547, arg7);
                Statics.field458 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1119[var8] = true;
            }
        } else {
            field1119[arg7] = true;
        }
    }

    @ObfuscatedName("an.if([Lhj;IIIIIIIII)V")
    public static final void method472(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class283.method4679(arg2, arg3, arg4, arg5);
        class135.method2450();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2678 == arg1 || arg1 == -1412584499 && field1053 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1122[field1117] = var10.field2672 + arg6;
                    field1014[field1117] = var10.field2681 + arg7;
                    field1088[field1117] = var10.field2674;
                    field1131[field1117] = var10.field2675;
                    var11 = ++field1117 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2790 = var11;
                var10.field2791 = field931;
                if (!var10.field2680 || !method1772(var10)) {
                    if (var10.field2663 > 0) {
                        int var12 = var10.field2663;
                        if (var12 == 324) {
                            if (field1187 == -1) {
                                field1187 = var10.field2725;
                                field1188 = var10.field2684;
                            }
                            if (field1180.field2638) {
                                var10.field2725 = field1187;
                            } else {
                                var10.field2725 = field1188;
                            }
                        } else if (var12 == 325) {
                            if (field1187 == -1) {
                                field1187 = var10.field2725;
                                field1188 = var10.field2684;
                            }
                            if (field1180.field2638) {
                                var10.field2725 = field1188;
                            } else {
                                var10.field2725 = field1187;
                            }
                        } else if (var12 == 327) {
                            var10.field2710 = 150;
                            var10.field2711 = (int) (Math.sin((double) field931 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2702 = 5;
                            var10.field2677 = 0;
                        } else if (var12 == 328) {
                            var10.field2710 = 150;
                            var10.field2711 = (int) (Math.sin((double) field931 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2702 = 5;
                            var10.field2677 = 1;
                        }
                    }
                    int var13 = var10.field2672 + arg6;
                    int var14 = var10.field2681 + arg7;
                    int var15 = var10.field2690;
                    if (field1053 == var10) {
                        if (arg1 != -1412584499 && !var10.field2737) {
                            Statics.field458 = arg0;
                            Statics.field1359 = arg6;
                            Statics.field547 = arg7;
                            continue;
                        }
                        if (field1160 && field1092) {
                            int var16 = class60.field746;
                            int var17 = class60.field747;
                            int var18 = var16 - field1089;
                            int var19 = var17 - field1090;
                            if (var18 < field1093) {
                                var18 = field1093;
                            }
                            if (var10.field2674 + var18 > field1093 + field1048.field2674) {
                                var18 = field1093 + field1048.field2674 - var10.field2674;
                            }
                            if (var19 < field1094) {
                                var19 = field1094;
                            }
                            if (var10.field2675 + var19 > field1094 + field1048.field2675) {
                                var19 = field1094 + field1048.field2675 - var10.field2675;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2737) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2661 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2661 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2674 + var13;
                        int var27 = var10.field2675 + var14;
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
                        int var30 = var10.field2674 + var13;
                        int var31 = var10.field2675 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2680 || var20 < var22 && var21 < var23) {
                        if (var10.field2663 != 0) {
                            if (var10.field2663 == 1336) {
                                if (field937) {
                                    var14 += 15;
                                    Statics.field339.method4482("Fps:" + field711, var10.field2674 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field926) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field926) {
                                        var34 = 16711680;
                                    }
                                    Statics.field339.method4482("Mem:" + var33 + "k", var10.field2674 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2663 == 1337) {
                                field1030 = var13;
                                field1064 = var14;
                                method3188(var13, var14, var10.field2674, var10.field2675);
                                field1119[var10.field2790] = true;
                                class283.method4679(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2663 == 1338) {
                                method1092(var10, var13, var14, var11);
                                class283.method4679(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2663 == 1339) {
                                method2(var10, var13, var14, var11);
                                class283.method4679(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2663 == 1400) {
                                Statics.field2191.method4955(var13, var14, var10.field2674, var10.field2675, field931);
                            }
                            if (var10.field2663 == 1401) {
                                Statics.field2191.method5065(var13, var14, var10.field2674, var10.field2675);
                            }
                        }
                        if (var10.field2661 == 0) {
                            if (!var10.field2680 && method1772(var10) && Statics.field404 != var10) {
                                continue;
                            }
                            if (!var10.field2680) {
                                if (var10.field2774 > var10.field2683 - var10.field2675) {
                                    var10.field2774 = var10.field2683 - var10.field2675;
                                }
                                if (var10.field2774 < 0) {
                                    var10.field2774 = 0;
                                }
                            }
                            method472(arg0, var10.field2739, var20, var21, var22, var23, var13 - var10.field2695, var14 - var10.field2774, var11);
                            if (var10.field2705 != null) {
                                method472(var10.field2705, var10.field2739, var20, var21, var22, var23, var13 - var10.field2695, var14 - var10.field2774, var11);
                            }
                            class68 var35 = (class68) field1075.method3352((long) var10.field2739);
                            if (var35 != null) {
                                method14(var35.field835, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class283.method4679(arg2, arg3, arg4, arg5);
                            class135.method2450();
                        }
                        if (field1040 || field1035[var11] || field956 > 1) {
                            if (var10.field2661 == 0 && !var10.field2680 && var10.field2683 > var10.field2675) {
                                int var36 = var10.field2674 + var13;
                                int var37 = var10.field2774;
                                int var38 = var10.field2675;
                                int var39 = var10.field2683;
                                Statics.field433[0].method4769(var36, var14);
                                Statics.field433[1].method4769(var36, var14 + var38 - 16);
                                class283.method4762(var36, var14 + 16, 16, var38 - 32, field990);
                                int var40 = (var38 - 32) * var38 / var39;
                                if (var40 < 8) {
                                    var40 = 8;
                                }
                                int var41 = (var38 - 32 - var40) * var37 / (var39 - var38);
                                class283.method4762(var36, var14 + 16 + var41, 16, var40, field991);
                                class283.method4761(var36, var14 + 16 + var41, var40, field993);
                                class283.method4761(var36 + 1, var14 + 16 + var41, var40, field993);
                                class283.method4696(var36, var14 + 16 + var41, 16, field993);
                                class283.method4696(var36, var14 + 17 + var41, 16, field993);
                                class283.method4761(var36 + 15, var14 + 16 + var41, var40, field1073);
                                class283.method4761(var36 + 14, var14 + 17 + var41, var40 - 1, field1073);
                                class283.method4696(var36, var14 + 15 + var41 + var40, 16, field1073);
                                class283.method4696(var36 + 1, var14 + 14 + var41 + var40, 15, field1073);
                            }
                            if (var10.field2661 != 1) {
                                if (var10.field2661 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var10.field2671; var43++) {
                                        for (int var44 = 0; var44 < var10.field2670; var44++) {
                                            int var45 = (var10.field2701 + 32) * var44 + var13;
                                            int var46 = (var10.field2726 + 32) * var43 + var14;
                                            if (var42 < 20) {
                                                var45 += var10.field2727[var42];
                                                var46 += var10.field2728[var42];
                                            }
                                            if (var10.field2765[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var10.field2765[var42] - 1;
                                                if (var45 + 32 > arg2 && var45 < arg4 && var46 + 32 > arg3 && var46 < arg5 || Statics.field916 == var10 && field1026 == var42) {
                                                    class287 var50;
                                                    if (field974 == 1 && Statics.field555 == var42 && Statics.field372 == var10.field2739) {
                                                        var50 = class257.method156(var49, var10.field2778[var42], 2, 0, 2, false);
                                                    } else {
                                                        var50 = class257.method156(var49, var10.field2778[var42], 1, 3153952, 2, false);
                                                    }
                                                    if (var50 == null) {
                                                        method165(var10);
                                                    } else if (Statics.field916 == var10 && field1026 == var42) {
                                                        int var51 = class60.field746 - field1027;
                                                        int var52 = class60.field747 - field1136;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (field1128 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method4803(var45 + var51, var46 + var52, 128);
                                                        if (arg1 != -1) {
                                                            class217 var53 = arg0[arg1 & 0xFFFF];
                                                            if (var46 + var52 < class283.field3768 && var53.field2774 > 0) {
                                                                int var54 = field1123 * (class283.field3768 - var46 - var52) / 3;
                                                                if (var54 > field1123 * 10) {
                                                                    var54 = field1123 * 10;
                                                                }
                                                                if (var54 > var53.field2774) {
                                                                    var54 = var53.field2774;
                                                                }
                                                                var53.field2774 -= var54;
                                                                field1136 += var54;
                                                                method165(var53);
                                                            }
                                                            if (var46 + var52 + 32 > class283.field3772 && var53.field2774 < var53.field2683 - var53.field2675) {
                                                                int var55 = field1123 * (var46 + var52 + 32 - class283.field3772) / 3;
                                                                if (var55 > field1123 * 10) {
                                                                    var55 = field1123 * 10;
                                                                }
                                                                if (var55 > var53.field2683 - var53.field2675 - var53.field2774) {
                                                                    var55 = var53.field2683 - var53.field2675 - var53.field2774;
                                                                }
                                                                var53.field2774 += var55;
                                                                field1136 -= var55;
                                                                method165(var53);
                                                            }
                                                        }
                                                    } else if (Statics.field2032 == var10 && field1025 == var42) {
                                                        var50.method4803(var45, var46, 128);
                                                    } else {
                                                        var50.method4794(var45, var46);
                                                    }
                                                }
                                            } else if (var10.field2729 != null && var42 < 20) {
                                                class287 var56 = var10.method3782(var42);
                                                if (var56 != null) {
                                                    var56.method4794(var45, var46);
                                                } else if (class217.field2720) {
                                                    method165(var10);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var10.field2661 == 3) {
                                    int var57;
                                    if (method1028(var10)) {
                                        var57 = var10.field2780;
                                        if (Statics.field404 == var10 && var10.field2687 != 0) {
                                            var57 = var10.field2687;
                                        }
                                    } else {
                                        var57 = var10.field2659;
                                        if (Statics.field404 == var10 && var10.field2686 != 0) {
                                            var57 = var10.field2686;
                                        }
                                    }
                                    if (var10.field2651) {
                                        switch(var10.field2689.field3786) {
                                            case 1:
                                                class283.method4688(var13, var14, var10.field2674, var10.field2675, var10.field2659, var10.field2780, 256 - (var10.field2690 & 0xFF), 256 - (var10.field2691 & 0xFF));
                                                break;
                                            case 2:
                                                class283.method4689(var13, var14, var10.field2674, var10.field2675, var10.field2659, var10.field2780, 256 - (var10.field2690 & 0xFF), 256 - (var10.field2691 & 0xFF));
                                                break;
                                            case 3:
                                                class283.method4690(var13, var14, var10.field2674, var10.field2675, var10.field2659, var10.field2780, 256 - (var10.field2690 & 0xFF), 256 - (var10.field2691 & 0xFF));
                                                break;
                                            case 4:
                                                class283.method4691(var13, var14, var10.field2674, var10.field2675, var10.field2659, var10.field2780, 256 - (var10.field2690 & 0xFF), 256 - (var10.field2691 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class283.method4762(var13, var14, var10.field2674, var10.field2675, var57);
                                                } else {
                                                    class283.method4686(var13, var14, var10.field2674, var10.field2675, var57, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class283.method4698(var13, var14, var10.field2674, var10.field2675, var57);
                                    } else {
                                        class283.method4695(var13, var14, var10.field2674, var10.field2675, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2661 == 4) {
                                    class264 var58 = var10.method3789();
                                    if (var58 != null) {
                                        String var59 = var10.field2734;
                                        int var60;
                                        if (method1028(var10)) {
                                            var60 = var10.field2780;
                                            if (Statics.field404 == var10 && var10.field2687 != 0) {
                                                var60 = var10.field2687;
                                            }
                                            if (var10.field2731.length() > 0) {
                                                var59 = var10.field2731;
                                            }
                                        } else {
                                            var60 = var10.field2659;
                                            if (Statics.field404 == var10 && var10.field2686 != 0) {
                                                var60 = var10.field2686;
                                            }
                                        }
                                        if (var10.field2680 && var10.field2779 != -1) {
                                            class257 var61 = class257.method637(var10.field2779);
                                            var59 = var61.field3499;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field3512 == 1 || var10.field2787 != 1) && var10.field2787 != -1) {
                                                var59 = class87.method961(16748608) + var59 + class87.field1379 + " " + 'x' + method140(var10.field2787);
                                            }
                                        }
                                        if (field1078 == var10) {
                                            class226 var10000 = (class226) null;
                                            var59 = class226.field3124;
                                            var60 = var10.field2659;
                                        }
                                        if (!var10.field2680) {
                                            var59 = method3852(var59, var10);
                                        }
                                        var58.method4484(var59, var13, var14, var10.field2674, var10.field2675, var60, var10.field2789 ? 0 : -1, var10.field2722, var10.field2723, var10.field2721);
                                    } else if (class217.field2720) {
                                        method165(var10);
                                    }
                                } else if (var10.field2661 == 5) {
                                    if (var10.field2680) {
                                        class287 var63;
                                        if (var10.field2779 == -1) {
                                            var63 = var10.method3819(false);
                                        } else {
                                            var63 = class257.method156(var10.field2779, var10.field2787, var10.field2698, var10.field2773, var10.field2717, false);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field3800;
                                            int var65 = var63.field3795;
                                            if (var10.field2697) {
                                                class283.method4680(var13, var14, var10.field2674 + var13, var10.field2675 + var14);
                                                int var66 = (var10.field2674 + (var64 - 1)) / var64;
                                                int var67 = (var10.field2675 + (var65 - 1)) / var65;
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var10.field2755 != 0) {
                                                            var63.method4810(var64 / 2 + var64 * var68 + var13, var65 / 2 + var65 * var69 + var14, var10.field2755, 4096);
                                                        } else if (var15 == 0) {
                                                            var63.method4794(var64 * var68 + var13, var65 * var69 + var14);
                                                        } else {
                                                            var63.method4803(var64 * var68 + var13, var65 * var69 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class283.method4679(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var70 = var10.field2674 * 4096 / var64;
                                                if (var10.field2755 != 0) {
                                                    var63.method4810(var10.field2674 / 2 + var13, var10.field2675 / 2 + var14, var10.field2755, var70);
                                                } else if (var15 != 0) {
                                                    var63.method4805(var13, var14, var10.field2674, var10.field2675, 256 - (var15 & 0xFF));
                                                } else if (var10.field2674 == var64 && var10.field2675 == var65) {
                                                    var63.method4794(var13, var14);
                                                } else {
                                                    var63.method4816(var13, var14, var10.field2674, var10.field2675);
                                                }
                                            }
                                        } else if (class217.field2720) {
                                            method165(var10);
                                        }
                                    } else {
                                        class287 var62 = var10.method3819(method1028(var10));
                                        if (var62 != null) {
                                            var62.method4794(var13, var14);
                                        } else if (class217.field2720) {
                                            method165(var10);
                                        }
                                    }
                                } else if (var10.field2661 == 6) {
                                    boolean var71 = method1028(var10);
                                    int var72;
                                    if (var71) {
                                        var72 = var10.field2707;
                                    } else {
                                        var72 = var10.field2650;
                                    }
                                    class132 var73 = null;
                                    int var74 = 0;
                                    if (var10.field2779 != -1) {
                                        class257 var75 = class257.method637(var10.field2779);
                                        if (var75 != null) {
                                            class257 var76 = var75.method4356(var10.field2787);
                                            var73 = var76.method4325(1);
                                            if (var73 == null) {
                                                method165(var10);
                                            } else {
                                                var73.method2364();
                                                var74 = var73.field2115 / 2;
                                            }
                                        }
                                    } else if (var10.field2702 == 5) {
                                        if (var10.field2677 == 0) {
                                            var73 = field1180.method3739((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var73 = Statics.field2427.method1070();
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var10.method3813((class261) null, -1, var71, Statics.field2427.field906);
                                        if (var73 == null && class217.field2720) {
                                            method165(var10);
                                        }
                                    } else {
                                        class261 var77 = class261.method3613(var72);
                                        var73 = var10.method3813(var77, var10.field2777, var71, Statics.field2427.field906);
                                        if (var73 == null && class217.field2720) {
                                            method165(var10);
                                        }
                                    }
                                    class135.method2452(var10.field2674 / 2 + var13, var10.field2675 / 2 + var14);
                                    int var78 = var10.field2664 * class135.field2016[var10.field2710] >> 16;
                                    int var79 = var10.field2664 * class135.field2023[var10.field2710] >> 16;
                                    if (var73 != null) {
                                        if (var10.field2680) {
                                            var73.method2364();
                                            if (var10.field2716) {
                                                var73.method2378(0, var10.field2711, var10.field2733, var10.field2710, var10.field2708, var10.field2709 + var74 + var78, var10.field2709 + var79, var10.field2664);
                                            } else {
                                                var73.method2377(0, var10.field2711, var10.field2733, var10.field2710, var10.field2708, var10.field2709 + var74 + var78, var10.field2709 + var79);
                                            }
                                        } else {
                                            var73.method2377(0, var10.field2711, 0, var10.field2710, 0, var78, var79);
                                        }
                                    }
                                    class135.method2448();
                                } else {
                                    if (var10.field2661 == 7) {
                                        class264 var80 = var10.method3789();
                                        if (var80 == null) {
                                            if (class217.field2720) {
                                                method165(var10);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var10.field2671; var82++) {
                                            for (int var83 = 0; var83 < var10.field2670; var83++) {
                                                if (var10.field2765[var81] > 0) {
                                                    class257 var84 = class257.method637(var10.field2765[var81] - 1);
                                                    String var85;
                                                    if (var84.field3512 != 1 && var10.field2778[var81] == 1) {
                                                        var85 = class87.method961(16748608) + var84.field3499 + class87.field1379;
                                                    } else {
                                                        var85 = class87.method961(16748608) + var84.field3499 + class87.field1379 + " " + 'x' + method140(var10.field2778[var81]);
                                                    }
                                                    int var86 = (var10.field2701 + 115) * var83 + var13;
                                                    int var87 = (var10.field2726 + 12) * var82 + var14;
                                                    if (var10.field2722 == 0) {
                                                        var80.method4480(var85, var86, var87, var10.field2659, var10.field2789 ? 0 : -1);
                                                    } else if (var10.field2722 == 1) {
                                                        var80.method4483(var85, var10.field2674 / 2 + var86, var87, var10.field2659, var10.field2789 ? 0 : -1);
                                                    } else {
                                                        var80.method4482(var85, var10.field2674 + var86 - 1, var87, var10.field2659, var10.field2789 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var10.field2661 == 8 && Statics.field636 == var10 && field1066 == field1065) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class264 var90 = Statics.field339;
                                        String var91 = var10.field2734;
                                        String var92 = method3852(var91, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class87.field1385);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            int var95 = var90.method4552(var94);
                                            if (var95 > var88) {
                                                var88 = var95;
                                            }
                                            var89 += var90.field3642 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var96 = var10.field2674 + var13 - 5 - var88;
                                        int var97 = var10.field2675 + var14 + 5;
                                        if (var96 < var13 + 5) {
                                            var96 = var13 + 5;
                                        }
                                        if (var88 + var96 > arg4) {
                                            var96 = arg4 - var88;
                                        }
                                        if (var89 + var97 > arg5) {
                                            var97 = arg5 - var89;
                                        }
                                        class283.method4762(var96, var97, var88, var89, 16777120);
                                        class283.method4698(var96, var97, var88, var89, 0);
                                        String var98 = var10.field2734;
                                        int var99 = var90.field3642 + var97 + 2;
                                        String var100 = method3852(var98, var10);
                                        while (var100.length() > 0) {
                                            int var101 = var100.indexOf(class87.field1385);
                                            String var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = "";
                                            } else {
                                                var102 = var100.substring(0, var101);
                                                var100 = var100.substring(var101 + 4);
                                            }
                                            var90.method4480(var102, var96 + 3, var99, 0, -1);
                                            var99 += var90.field3642 + 1;
                                        }
                                    }
                                    if (var10.field2661 == 9) {
                                        int var103;
                                        int var104;
                                        int var105;
                                        int var106;
                                        if (var10.field2724) {
                                            var103 = var13;
                                            var104 = var10.field2675 + var14;
                                            var105 = var10.field2674 + var13;
                                            var106 = var14;
                                        } else {
                                            var103 = var13;
                                            var104 = var14;
                                            var105 = var10.field2674 + var13;
                                            var106 = var10.field2675 + var14;
                                        }
                                        if (var10.field2703 == 1) {
                                            class283.method4753(var103, var104, var105, var106, var10.field2659);
                                        } else {
                                            method1022(var103, var104, var105, var106, var10.field2659, var10.field2703);
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

    @ObfuscatedName("bo.ik(IIIIIII)V")
    public static final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class283.field3773;
        int var18 = arg1 - class283.field3768;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class135.method2453(var19, var20, var21);
        class135.method2460(var23, var24, var25, var19, var20, var21, arg4);
        class135.method2453(var19, var21, var22);
        class135.method2460(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("hn.ix(Ljava/lang/String;Lhj;I)Ljava/lang/String;")
    public static String method3852(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1741(method27(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field436 != null) {
                    var5 = class271.method1650(Statics.field436.field2241);
                    if (Statics.field436.field2242 != null) {
                        var5 = (String) Statics.field436.field2242;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("a.iu(IB)Ljava/lang/String;")
    public static final String method140(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class87.field1380 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class87.method961(65408) + var1.substring(0, var1.length() - 8) + class226.field3018 + " " + class87.field1386 + var1 + class87.field1383 + class87.field1379;
        } else if (var1.length() > 6) {
            return " " + class87.method961(16777215) + var1.substring(0, var1.length() - 4) + class226.field2959 + " " + class87.field1386 + var1 + class87.field1383 + class87.field1379;
        } else {
            return " " + class87.method961(16776960) + var1 + class87.field1379;
        }
    }

    @ObfuscatedName("client.im(ZI)V")
    public final void method1106(boolean arg0) {
        int var2 = field1074;
        int var3 = Statics.field762;
        int var4 = Statics.field633;
        if (class217.method1688(var2)) {
            method2699(Statics.field2433[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.in(Lhj;I)V")
    public void method1187(class217 arg0) {
        class217 var2 = arg0.field2678 == -1 ? null : class217.method3237(arg0.field2678);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field762;
            var4 = Statics.field633;
        } else {
            var3 = var2.field2674;
            var4 = var2.field2675;
        }
        method2248(arg0, var3, var4, false);
        method463(arg0, var3, var4);
    }

    @ObfuscatedName("q.ic([Lhj;Lhj;ZI)V")
    public static void method18(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2685 == 0 ? arg1.field2674 : arg1.field2685;
        int var4 = arg1.field2683 == 0 ? arg1.field2675 : arg1.field2683;
        method2699(arg0, arg1.field2739, var3, var4, arg2);
        if (arg1.field2705 != null) {
            method2699(arg1.field2705, arg1.field2739, var3, var4, arg2);
        }
        class68 var5 = (class68) field1075.method3352((long) arg1.field2739);
        if (var5 != null) {
            int var6 = var5.field835;
            if (class217.method1688(var6)) {
                method2699(Statics.field2433[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2663 == 1337) {
        }
    }

    @ObfuscatedName("ev.io([Lhj;IIIZB)V")
    public static void method2699(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2678 == arg1) {
                method2248(var6, arg2, arg3, arg4);
                method463(var6, arg2, arg3);
                if (var6.field2695 > var6.field2685 - var6.field2674) {
                    var6.field2695 = var6.field2685 - var6.field2674;
                }
                if (var6.field2695 < 0) {
                    var6.field2695 = 0;
                }
                if (var6.field2774 > var6.field2683 - var6.field2675) {
                    var6.field2774 = var6.field2683 - var6.field2675;
                }
                if (var6.field2774 < 0) {
                    var6.field2774 = 0;
                }
                if (var6.field2661 == 0) {
                    method18(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("dh.iy(Lhj;IIZI)V")
    public static void method2248(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2674;
        int var5 = arg0.field2675;
        if (arg0.field2666 == 0) {
            arg0.field2674 = arg0.field2670;
        } else if (arg0.field2666 == 1) {
            arg0.field2674 = arg1 - arg0.field2670;
        } else if (arg0.field2666 == 2) {
            arg0.field2674 = arg0.field2670 * arg1 >> 14;
        }
        if (arg0.field2667 == 0) {
            arg0.field2675 = arg0.field2671;
        } else if (arg0.field2667 == 1) {
            arg0.field2675 = arg2 - arg0.field2671;
        } else if (arg0.field2667 == 2) {
            arg0.field2675 = arg0.field2671 * arg2 >> 14;
        }
        if (arg0.field2666 == 4) {
            arg0.field2674 = arg0.field2676 * arg0.field2675 / arg0.field2658;
        }
        if (arg0.field2667 == 4) {
            arg0.field2675 = arg0.field2674 * arg0.field2658 / arg0.field2676;
        }
        if (field962 && arg0.field2661 == 0) {
            if (arg0.field2675 < 5 && arg0.field2674 < 5) {
                arg0.field2675 = 5;
                arg0.field2674 = 5;
            } else {
                if (arg0.field2675 <= 0) {
                    arg0.field2675 = 5;
                }
                if (arg0.field2674 <= 0) {
                    arg0.field2674 = 5;
                }
            }
        }
        if (arg0.field2663 == 1337) {
            field1086 = arg0;
        }
        if (arg3 && arg0.field2768 != null && (arg0.field2674 != var4 || arg0.field2675 != var5)) {
            class69 var6 = new class69();
            var6.field854 = arg0;
            var6.field847 = arg0.field2768;
            field1113.method3411(var6);
        }
    }

    @ObfuscatedName("an.id(Lhj;IIB)V")
    public static void method463(class217 arg0, int arg1, int arg2) {
        if (arg0.field2646 == 0) {
            arg0.field2672 = arg0.field2668;
        } else if (arg0.field2646 == 1) {
            arg0.field2672 = (arg1 - arg0.field2674) / 2 + arg0.field2668;
        } else if (arg0.field2646 == 2) {
            arg0.field2672 = arg1 - arg0.field2674 - arg0.field2668;
        } else if (arg0.field2646 == 3) {
            arg0.field2672 = arg0.field2668 * arg1 >> 14;
        } else if (arg0.field2646 == 4) {
            arg0.field2672 = (arg0.field2668 * arg1 >> 14) + (arg1 - arg0.field2674) / 2;
        } else {
            arg0.field2672 = arg1 - arg0.field2674 - (arg0.field2668 * arg1 >> 14);
        }
        if (arg0.field2665 == 0) {
            arg0.field2681 = arg0.field2669;
        } else if (arg0.field2665 == 1) {
            arg0.field2681 = (arg2 - arg0.field2675) / 2 + arg0.field2669;
        } else if (arg0.field2665 == 2) {
            arg0.field2681 = arg2 - arg0.field2675 - arg0.field2669;
        } else if (arg0.field2665 == 3) {
            arg0.field2681 = arg0.field2669 * arg2 >> 14;
        } else if (arg0.field2665 == 4) {
            arg0.field2681 = (arg0.field2669 * arg2 >> 14) + (arg2 - arg0.field2675) / 2;
        } else {
            arg0.field2681 = arg2 - arg0.field2675 - (arg0.field2669 * arg2 >> 14);
        }
        if (!field962 || arg0.field2661 != 0) {
            return;
        }
        if (arg0.field2672 < 0) {
            arg0.field2672 = 0;
        } else if (arg0.field2674 + arg0.field2672 > arg1) {
            arg0.field2672 = arg1 - arg0.field2674;
        }
        if (arg0.field2681 < 0) {
            arg0.field2681 = 0;
        } else if (arg0.field2681 + arg0.field2675 > arg2) {
            arg0.field2681 = arg2 - arg0.field2675;
        }
    }

    @ObfuscatedName("l.iw(Lhj;IIIIIII)V")
    public static final void method147(class217 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field994) {
            field995 = 32;
        } else {
            field995 = 0;
        }
        field994 = false;
        if (class60.field739 == 1 || !Statics.field1651 && class60.field739 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2774 -= 4;
                method165(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2774 += 4;
                method165(arg0);
            } else if (arg5 >= arg1 - field995 && arg5 < field995 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2774 = (arg4 - arg3) * var8 / var9;
                method165(arg0);
                field994 = true;
            }
        }
        if (field1112 == 0) {
            return;
        }
        int var10 = arg0.field2674;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2774 += field1112 * 45;
            method165(arg0);
        }
    }

    @ObfuscatedName("cj.jl(II)Ljava/lang/String;")
    public static final String method1741(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("bx.jk(Lhj;I)Z")
    public static final boolean method1028(class217 arg0) {
        if (arg0.field2772 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2772.length; var1++) {
            int var2 = method27(arg0, var1);
            int var3 = arg0.field2688[var1];
            if (arg0.field2772[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2772[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2772[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("r.jf(Lhj;II)I")
    public static final int method27(class217 arg0, int arg1) {
        if (arg0.field2744 == null || arg1 >= arg0.field2744.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2744[arg1];
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
                    var7 = field1005[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1049[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1050[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method3237(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class257.method637(var12).field3508 || field925)) {
                        for (int var13 = 0; var13 < var11.field2765.length; var13++) {
                            if (var12 + 1 == var11.field2765[var13]) {
                                var7 += var11.field2778[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2621[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2843[field1049[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2621[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2427.field894;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2844[var14]) {
                            var7 += field1049[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method3237(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class257.method637(var18).field3508 || field925)) {
                        for (int var19 = 0; var19 < var17.field2765.length; var19++) {
                            if (var18 + 1 == var17.field2765[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1079;
                }
                if (var6 == 12) {
                    var7 = field1080;
                }
                if (var6 == 13) {
                    int var20 = class212.field2621[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method1633(var22);
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
                    var7 = (Statics.field2427.field1243 >> 7) + Statics.field2122;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2427.field1209 >> 7) + Statics.field1505;
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

    @ObfuscatedName("et.ju(Lhj;Lio;IIZI)V")
    public static final void method2698(class217 arg0, class257 arg1, int arg2, int arg3, boolean arg4) {
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
            var7 = class226.field2859;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class87.method961(16748608) + arg1.field3499;
        int var11 = arg1.field3497;
        int var13 = arg0.field2739;
        if (field1052 || field1028 >= 500) {
            return;
        }
        field1058[field1028] = var7;
        field1059[field1028] = var9;
        field1056[field1028] = var6;
        field921[field1028] = var11;
        field920[field1028] = arg2;
        field1085[field1028] = var13;
        field1022[field1028] = arg4;
        field1028++;
    }

    @ObfuscatedName("bm.jm(Lhj;III)V")
    public static final void method1055(class217 arg0, int arg1, int arg2) {
        if (arg0.field2662 == 1) {
            method52(arg0.field2747, "", 24, 0, 0, arg0.field2739);
        }
        if (arg0.field2662 == 2 && !field1069) {
            String var3 = method451(arg0);
            if (var3 != null) {
                method52(var3, class87.method961(65280) + arg0.field2775, 25, 0, -1, arg0.field2739);
            }
        }
        if (arg0.field2662 == 3) {
            method52(class226.field3016, "", 26, 0, 0, arg0.field2739);
        }
        if (arg0.field2662 == 4) {
            method52(arg0.field2747, "", 28, 0, 0, arg0.field2739);
        }
        if (arg0.field2662 == 5) {
            method52(arg0.field2747, "", 29, 0, 0, arg0.field2739);
        }
        if (arg0.field2662 == 6 && field1078 == null) {
            method52(arg0.field2747, "", 30, 0, -1, arg0.field2739);
        }
        if (arg0.field2661 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2675; var5++) {
                for (int var6 = 0; var6 < arg0.field2674; var6++) {
                    int var7 = (arg0.field2701 + 32) * var6;
                    int var8 = (arg0.field2726 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2727[var4];
                        var8 += arg0.field2728[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field1114 = var4;
                        Statics.field2271 = arg0;
                        if (arg0.field2765[var4] > 0) {
                            class257 var9 = class257.method637(arg0.field2765[var4] - 1);
                            if (field974 == 1 && class218.method1704(method4068(arg0))) {
                                if (Statics.field372 != arg0.field2739 || Statics.field555 != var4) {
                                    method52(class226.field3007, field1068 + " " + class87.field1384 + " " + class87.method961(16748608) + var9.field3499, 31, var9.field3497, var4, arg0.field2739);
                                }
                            } else if (!field1069 || !class218.method1704(method4068(arg0))) {
                                String[] var10 = var9.field3514;
                                if (field979) {
                                    String[] var11 = method2712(var10);
                                }
                                int var12 = -1;
                                if (field1185 && class51.field656[81]) {
                                    var12 = var9.method4317();
                                }
                                if (class218.method1704(method4068(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != var13) {
                                            method2698(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                if (class218.method306(method4068(arg0))) {
                                    method52(class226.field3007, class87.method961(16748608) + var9.field3499, 38, var9.field3497, var4, arg0.field2739);
                                }
                                if (class218.method1704(method4068(arg0))) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var12 != var14) {
                                            method2698(arg0, var9, var4, var14, false);
                                        }
                                    }
                                    if (var12 >= 0) {
                                        method2698(arg0, var9, var4, var12, true);
                                    }
                                }
                                String[] var15 = arg0.field2730;
                                if (field979) {
                                    var15 = method2712(var15);
                                }
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method52(var15[var16], class87.method961(16748608) + var9.field3499, var17, var9.field3497, var4, arg0.field2739);
                                        }
                                    }
                                }
                                method52(class226.field2915, class87.method961(16748608) + var9.field3499, 1005, var9.field3497, var4, arg0.field2739);
                            } else if ((Statics.field452 & 0x10) == 16) {
                                method52(field1072, field949 + " " + class87.field1384 + " " + class87.method961(16748608) + var9.field3499, 32, var9.field3497, var4, arg0.field2739);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2680) {
            return;
        }
        if (!field1069) {
            for (int var18 = 9; var18 >= 5; var18--) {
                String var19;
                if (!class218.method1988(method4068(arg0), var18) && arg0.field2759 == null) {
                    var19 = null;
                } else if (arg0.field2706 == null || arg0.field2706.length <= var18 || arg0.field2706[var18] == null || arg0.field2706[var18].trim().length() == 0) {
                    var19 = null;
                } else {
                    var19 = arg0.field2706[var18];
                }
                if (var19 != null) {
                    method52(var19, arg0.field2732, 1007, var18 + 1, arg0.field2660, arg0.field2739);
                }
            }
            String var21 = method451(arg0);
            if (var21 != null) {
                method52(var21, arg0.field2732, 25, 0, arg0.field2660, arg0.field2739);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                String var23;
                if (!class218.method1988(method4068(arg0), var22) && arg0.field2759 == null) {
                    var23 = null;
                } else if (arg0.field2706 == null || arg0.field2706.length <= var22 || arg0.field2706[var22] == null || arg0.field2706[var22].trim().length() == 0) {
                    var23 = null;
                } else {
                    var23 = arg0.field2706[var22];
                }
                if (var23 != null) {
                    method52(var23, arg0.field2732, 57, var22 + 1, arg0.field2660, arg0.field2739);
                }
            }
            int var25 = method4068(arg0);
            boolean var26 = (var25 & 0x1) != 0;
            if (var26) {
                method52(class226.field2982, "", 30, 0, arg0.field2660, arg0.field2739);
            }
        } else if (class218.method1021(method4068(arg0)) && (Statics.field452 & 0x20) == 32) {
            method52(field1072, field949 + " " + class87.field1384 + " " + arg0.field2732, 58, 0, arg0.field2660, arg0.field2739);
        }
    }

    @ObfuscatedName("j.jh([Lhj;IIIIIIII)V")
    public static final void method93(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2680 || var9.field2661 == 0 || var9.field2786 || method4068(var9) != 0 || field1048 == var9 || var9.field2663 == 1338) && var9.field2678 == arg1 && (!var9.field2680 || !method1772(var9))) {
                int var10 = var9.field2672 + arg6;
                int var11 = var9.field2681 + arg7;
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
                    int var18 = var9.field2674 + var10;
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
                    int var22 = var9.field2674 + var10;
                    int var23 = var9.field2675 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1053 == var9) {
                    field1095 = true;
                    field1096 = var10;
                    field1097 = var11;
                }
                if (!var9.field2680 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field746;
                    int var25 = class60.field747;
                    if (class60.field742 != 0) {
                        var24 = class60.field753;
                        var25 = class60.field754;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2663 == 1337) {
                        if (!field1124 && !field1052 && var26) {
                            if (field974 == 0 && !field1069) {
                                method52(class226.field2919, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class133.field1990; var29++) {
                                int var30 = class133.field1991[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field250.method2571(Statics.field44, var31, var32, var30) >= 0) {
                                        class256 var35 = class256.method2710(var34);
                                        if (var35.field3486 != null) {
                                            var35 = var35.method4300();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field974 == 1) {
                                            method52(class226.field3007, field1068 + " " + class87.field1384 + " " + class87.method961(65535) + var35.field3458, 1, var30, var31, var32);
                                        } else if (!field1069) {
                                            String[] var36 = var35.field3466;
                                            if (field979) {
                                                var36 = method2712(var36);
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
                                                        method52(var36[var37], class87.method961(65535) + var35.field3458, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            method52(class226.field2915, class87.method961(65535) + var35.field3458, 1002, var35.field3444 << 14, var31, var32);
                                        } else if ((Statics.field452 & 0x4) == 4) {
                                            method52(field1072, field949 + " " + class87.field1384 + " " + class87.method961(65535) + var35.field3458, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class85 var39 = field960[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1370.field3560 == 1 && (var39.field1243 & 0x7F) == 64 && (var39.field1209 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field961; var40++) {
                                                class85 var41 = field960[field1029[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1370.field3560 == 1 && var39.field1243 == var41.field1243 && var39.field1209 == var41.field1209) {
                                                    method1970(var41.field1370, field1029[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class95.field1486;
                                            int[] var43 = class95.field1481;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class74 var45 = field1034[var43[var44]];
                                                if (var45 != null && var39.field1243 == var45.field1243 && var39.field1209 == var45.field1209) {
                                                    method1029(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method1970(var39.field1370, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class74 var46 = field1034[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1243 & 0x7F) == 64 && (var46.field1209 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field961; var47++) {
                                                class85 var48 = field960[field1029[var47]];
                                                if (var48 != null && var48.field1370.field3560 == 1 && var46.field1243 == var48.field1243 && var46.field1209 == var48.field1209) {
                                                    method1970(var48.field1370, field1029[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class95.field1486;
                                            int[] var50 = class95.field1481;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class74 var52 = field1034[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1243 == var52.field1243 && var46.field1209 == var52.field1209) {
                                                    method1029(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field1062 == var34) {
                                            var27 = var30;
                                        } else {
                                            method1029(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class194 var53 = field1044[Statics.field44][var31][var32];
                                        if (var53 != null) {
                                            for (class93 var54 = (class93) var53.method3417(); var54 != null; var54 = (class93) var53.method3419()) {
                                                class257 var55 = class257.method637(var54.field1471);
                                                if (field974 == 1) {
                                                    method52(class226.field3007, field1068 + " " + class87.field1384 + " " + class87.method961(16748608) + var55.field3499, 16, var54.field1471, var31, var32);
                                                } else if (!field1069) {
                                                    String[] var56 = var55.field3534;
                                                    if (field979) {
                                                        var56 = method2712(var56);
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
                                                            method52(var56[var57], class87.method961(16748608) + var55.field3499, var58, var54.field1471, var31, var32);
                                                        } else if (var57 == 2) {
                                                            method52(class226.field3104, class87.method961(16748608) + var55.field3499, 20, var54.field1471, var31, var32);
                                                        }
                                                    }
                                                    method52(class226.field2915, class87.method961(16748608) + var55.field3499, 1004, var54.field1471, var31, var32);
                                                } else if ((Statics.field452 & 0x1) == 1) {
                                                    method52(field1072, field949 + " " + class87.field1384 + " " + class87.method961(16748608) + var55.field3499, 17, var54.field1471, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class74 var61 = field1034[field1062];
                                method1029(var61, field1062, var59, var60);
                            }
                        }
                    } else if (var9.field2663 == 1338) {
                        method154(var9, var10, var11);
                    } else {
                        if (var9.field2663 == 1400) {
                            Statics.field2191.method5044(class60.field746, class60.field747, var26, var10, var11, var9.field2674, var9.field2675);
                        }
                        if (!field1052 && var26) {
                            if (var9.field2663 == 1400) {
                                Statics.field2191.method4988(var10, var11, var9.field2674, var9.field2675, var24, var25);
                            } else {
                                method1055(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2661 == 0) {
                            if (!var9.field2680 && method1772(var9) && Statics.field404 != var9) {
                                continue;
                            }
                            method93(arg0, var9.field2739, var12, var13, var14, var15, var10 - var9.field2695, var11 - var9.field2774);
                            if (var9.field2705 != null) {
                                method93(var9.field2705, var9.field2739, var12, var13, var14, var15, var10 - var9.field2695, var11 - var9.field2774);
                            }
                            class68 var62 = (class68) field1075.method3352((long) var9.field2739);
                            if (var62 != null) {
                                if (var62.field836 == 0 && class60.field746 >= var12 && class60.field747 >= var13 && class60.field746 < var14 && class60.field747 < var15 && !field1052 && !field962) {
                                    for (class69 var63 = (class69) field1113.method3409(); var63 != null; var63 = (class69) field1113.method3429()) {
                                        if (var63.field846) {
                                            var63.method3407();
                                            var63.field854.field2696 = false;
                                        }
                                    }
                                    if (Statics.field2269 == 0) {
                                        field1053 = null;
                                        field1048 = null;
                                    }
                                    if (!field1052) {
                                        field1028 = 0;
                                        field1052 = false;
                                        field1058[0] = class226.field3096;
                                        field1059[0] = "";
                                        field1056[0] = 1006;
                                        field1022[0] = false;
                                        field1028 = 1;
                                    }
                                }
                                int var64 = var62.field835;
                                if (class217.method1688(var64)) {
                                    method93(Statics.field2433[var64], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2680) {
                            if (var9.field2792) {
                                if (class60.field746 >= var12 && class60.field747 >= var13 && class60.field746 < var14 && class60.field747 < var15) {
                                    for (class69 var65 = (class69) field1113.method3409(); var65 != null; var65 = (class69) field1113.method3429()) {
                                        if (var65.field846) {
                                            var65.method3407();
                                            var65.field854.field2696 = false;
                                        }
                                    }
                                    if (Statics.field2269 == 0) {
                                        field1053 = null;
                                        field1048 = null;
                                    }
                                    if (!field1052) {
                                        field1028 = 0;
                                        field1052 = false;
                                        field1058[0] = class226.field3096;
                                        field1059[0] = "";
                                        field1056[0] = 1006;
                                        field1022[0] = false;
                                        field1028 = 1;
                                    }
                                }
                            } else if (var9.field2793 && class60.field746 >= var12 && class60.field747 >= var13 && class60.field746 < var14 && class60.field747 < var15) {
                                for (class69 var66 = (class69) field1113.method3409(); var66 != null; var66 = (class69) field1113.method3429()) {
                                    if (var66.field846 && var66.field854.field2764 == var66.field847) {
                                        var66.method3407();
                                    }
                                }
                            }
                            boolean var67;
                            if (class60.field746 >= var12 && class60.field747 >= var13 && class60.field746 < var14 && class60.field747 < var15) {
                                var67 = true;
                            } else {
                                var67 = false;
                            }
                            boolean var68 = false;
                            if ((class60.field739 == 1 || !Statics.field1651 && class60.field739 == 4) && var67) {
                                var68 = true;
                            }
                            boolean var69 = false;
                            if ((class60.field742 == 1 || !Statics.field1651 && class60.field742 == 4) && class60.field753 >= var12 && class60.field754 >= var13 && class60.field753 < var14 && class60.field754 < var15) {
                                var69 = true;
                            }
                            if (var69) {
                                method5(var9, class60.field753 - var10, class60.field754 - var11);
                            }
                            if (var9.field2663 == 1400) {
                                Statics.field2191.method4991(class60.field746, class60.field747, var67 & var68, var67 & var69);
                            }
                            if (field1053 != null && field1053 != var9 && var67) {
                                int var70 = method4068(var9);
                                boolean var71 = (var70 >> 20 & 0x1) != 0;
                                if (var71) {
                                    field953 = var9;
                                }
                            }
                            if (field1048 == var9) {
                                field1092 = true;
                                field1093 = var10;
                                field1094 = var11;
                            }
                            if (var9.field2786) {
                                if (var67 && field1112 != 0 && var9.field2764 != null) {
                                    class69 var72 = new class69();
                                    var72.field846 = true;
                                    var72.field854 = var9;
                                    var72.field849 = field1112;
                                    var72.field847 = var9.field2764;
                                    field1113.method3411(var72);
                                }
                                if (field1053 != null || Statics.field916 != null || field1052) {
                                    var69 = false;
                                    var68 = false;
                                    var67 = false;
                                }
                                if (!var9.field2785 && var69) {
                                    var9.field2785 = true;
                                    if (var9.field2656 != null) {
                                        class69 var73 = new class69();
                                        var73.field846 = true;
                                        var73.field854 = var9;
                                        var73.field848 = class60.field753 - var10;
                                        var73.field849 = class60.field754 - var11;
                                        var73.field847 = var9.field2656;
                                        field1113.method3411(var73);
                                    }
                                }
                                if (var9.field2785 && var68 && var9.field2742 != null) {
                                    class69 var74 = new class69();
                                    var74.field846 = true;
                                    var74.field854 = var9;
                                    var74.field848 = class60.field746 - var10;
                                    var74.field849 = class60.field747 - var11;
                                    var74.field847 = var9.field2742;
                                    field1113.method3411(var74);
                                }
                                if (var9.field2785 && !var68) {
                                    var9.field2785 = false;
                                    if (var9.field2743 != null) {
                                        class69 var75 = new class69();
                                        var75.field846 = true;
                                        var75.field854 = var9;
                                        var75.field848 = class60.field746 - var10;
                                        var75.field849 = class60.field747 - var11;
                                        var75.field847 = var9.field2743;
                                        field1091.method3411(var75);
                                    }
                                }
                                if (var68 && var9.field2784 != null) {
                                    class69 var76 = new class69();
                                    var76.field846 = true;
                                    var76.field854 = var9;
                                    var76.field848 = class60.field746 - var10;
                                    var76.field849 = class60.field747 - var11;
                                    var76.field847 = var9.field2784;
                                    field1113.method3411(var76);
                                }
                                if (!var9.field2696 && var67) {
                                    var9.field2696 = true;
                                    if (var9.field2745 != null) {
                                        class69 var77 = new class69();
                                        var77.field846 = true;
                                        var77.field854 = var9;
                                        var77.field848 = class60.field746 - var10;
                                        var77.field849 = class60.field747 - var11;
                                        var77.field847 = var9.field2745;
                                        field1113.method3411(var77);
                                    }
                                }
                                if (var9.field2696 && var67 && var9.field2746 != null) {
                                    class69 var78 = new class69();
                                    var78.field846 = true;
                                    var78.field854 = var9;
                                    var78.field848 = class60.field746 - var10;
                                    var78.field849 = class60.field747 - var11;
                                    var78.field847 = var9.field2746;
                                    field1113.method3411(var78);
                                }
                                if (var9.field2696 && !var67) {
                                    var9.field2696 = false;
                                    if (var9.field2788 != null) {
                                        class69 var79 = new class69();
                                        var79.field846 = true;
                                        var79.field854 = var9;
                                        var79.field848 = class60.field746 - var10;
                                        var79.field849 = class60.field747 - var11;
                                        var79.field847 = var9.field2788;
                                        field1091.method3411(var79);
                                    }
                                }
                                if (var9.field2694 != null) {
                                    class69 var80 = new class69();
                                    var80.field854 = var9;
                                    var80.field847 = var9.field2694;
                                    field1126.method3411(var80);
                                }
                                if (var9.field2752 != null && field1101 > var9.field2763) {
                                    if (var9.field2753 == null || field1101 - var9.field2763 > 32) {
                                        class69 var85 = new class69();
                                        var85.field854 = var9;
                                        var85.field847 = var9.field2752;
                                        field1113.method3411(var85);
                                    } else {
                                        label768: for (int var81 = var9.field2763; var81 < field1101; var81++) {
                                            int var82 = field1100[var81 & 0x1F];
                                            for (int var83 = 0; var83 < var9.field2753.length; var83++) {
                                                if (var9.field2753[var83] == var82) {
                                                    class69 var84 = new class69();
                                                    var84.field854 = var9;
                                                    var84.field847 = var9.field2752;
                                                    field1113.method3411(var84);
                                                    break label768;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2763 = field1101;
                                }
                                if (var9.field2754 != null && field1103 > var9.field2712) {
                                    if (var9.field2781 == null || field1103 - var9.field2712 > 32) {
                                        class69 var90 = new class69();
                                        var90.field854 = var9;
                                        var90.field847 = var9.field2754;
                                        field1113.method3411(var90);
                                    } else {
                                        label744: for (int var86 = var9.field2712; var86 < field1103; var86++) {
                                            int var87 = field1102[var86 & 0x1F];
                                            for (int var88 = 0; var88 < var9.field2781.length; var88++) {
                                                if (var9.field2781[var88] == var87) {
                                                    class69 var89 = new class69();
                                                    var89.field854 = var9;
                                                    var89.field847 = var9.field2754;
                                                    field1113.method3411(var89);
                                                    break label744;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2712 = field1103;
                                }
                                if (var9.field2713 != null && field1105 > var9.field2719) {
                                    if (var9.field2757 == null || field1105 - var9.field2719 > 32) {
                                        class69 var95 = new class69();
                                        var95.field854 = var9;
                                        var95.field847 = var9.field2713;
                                        field1113.method3411(var95);
                                    } else {
                                        label720: for (int var91 = var9.field2719; var91 < field1105; var91++) {
                                            int var92 = field1153[var91 & 0x1F];
                                            for (int var93 = 0; var93 < var9.field2757.length; var93++) {
                                                if (var9.field2757[var93] == var92) {
                                                    class69 var94 = new class69();
                                                    var94.field854 = var9;
                                                    var94.field847 = var9.field2713;
                                                    field1113.method3411(var94);
                                                    break label720;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2719 = field1105;
                                }
                                if (field1175 > var9.field2699 && var9.field2761 != null) {
                                    class69 var96 = new class69();
                                    var96.field854 = var9;
                                    var96.field847 = var9.field2761;
                                    field1113.method3411(var96);
                                }
                                if (field1107 > var9.field2699 && var9.field2654 != null) {
                                    class69 var97 = new class69();
                                    var97.field854 = var9;
                                    var97.field847 = var9.field2654;
                                    field1113.method3411(var97);
                                }
                                if (field1108 > var9.field2699 && var9.field2692 != null) {
                                    class69 var98 = new class69();
                                    var98.field854 = var9;
                                    var98.field847 = var9.field2692;
                                    field1113.method3411(var98);
                                }
                                if (field1109 > var9.field2699 && var9.field2769 != null) {
                                    class69 var99 = new class69();
                                    var99.field854 = var9;
                                    var99.field847 = var9.field2769;
                                    field1113.method3411(var99);
                                }
                                if (field1110 > var9.field2699 && var9.field2770 != null) {
                                    class69 var100 = new class69();
                                    var100.field854 = var9;
                                    var100.field847 = var9.field2770;
                                    field1113.method3411(var100);
                                }
                                if (field1111 > var9.field2699 && var9.field2776 != null) {
                                    class69 var101 = new class69();
                                    var101.field854 = var9;
                                    var101.field847 = var9.field2776;
                                    field1113.method3411(var101);
                                }
                                var9.field2699 = field1099;
                                if (var9.field2762 != null) {
                                    for (int var102 = 0; var102 < field1135; var102++) {
                                        class69 var103 = new class69();
                                        var103.field854 = var9;
                                        var103.field852 = field1137[var102];
                                        var103.field845 = field1186[var102];
                                        var103.field847 = var9.field2762;
                                        field1113.method3411(var103);
                                    }
                                }
                            }
                        }
                        if (!var9.field2680 && field1053 == null && Statics.field916 == null && !field1052) {
                            if ((var9.field2741 >= 0 || var9.field2686 != 0) && class60.field746 >= var12 && class60.field747 >= var13 && class60.field746 < var14 && class60.field747 < var15) {
                                if (var9.field2741 >= 0) {
                                    Statics.field404 = arg0[var9.field2741];
                                } else {
                                    Statics.field404 = var9;
                                }
                            }
                            if (var9.field2661 == 8 && class60.field746 >= var12 && class60.field747 >= var13 && class60.field746 < var14 && class60.field747 < var15) {
                                Statics.field636 = var9;
                            }
                            if (var9.field2683 > var9.field2675) {
                                method147(var9, var9.field2674 + var10, var11, var9.field2675, var9.field2683, class60.field746, class60.field747);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ix.jj([Lhj;II)V")
    public static final void method4168(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2661 == 0) {
                    if (var3.field2705 != null) {
                        method4168(var3.field2705, arg1);
                    }
                    class68 var4 = (class68) field1075.method3352((long) var3.field2739);
                    if (var4 != null) {
                        int var5 = var4.field835;
                        if (class217.method1688(var5)) {
                            method4168(Statics.field2433[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2766 != null) {
                    class69 var6 = new class69();
                    var6.field854 = var3;
                    var6.field847 = var3.field2766;
                    class82.method2853(var6);
                }
                if (arg1 == 1 && var3.field2767 != null) {
                    if (var3.field2660 >= 0) {
                        class217 var7 = class217.method3237(var3.field2739);
                        if (var7 == null || var7.field2705 == null || var3.field2660 >= var7.field2705.length || var7.field2705[var3.field2660] != var3) {
                            continue;
                        }
                    }
                    class69 var8 = new class69();
                    var8.field854 = var3;
                    var8.field847 = var3.field2767;
                    class82.method2853(var8);
                }
            }
        }
    }

    @ObfuscatedName("e.jn(Lhj;III)V")
    public static final void method5(class217 arg0, int arg1, int arg2) {
        if (field1053 != null || field1052 || arg0 == null || method1774(arg0) == null) {
            return;
        }
        field1053 = arg0;
        class217 var3 = method3853(arg0);
        if (var3 == null) {
            var3 = arg0.field2771;
        }
        field1048 = var3;
        field1089 = arg1;
        field1090 = arg2;
        Statics.field2269 = 0;
        field1160 = false;
        int var5 = field1028 - 1;
        if (var5 == -1) {
            return;
        }
        Statics.field240 = new class88();
        Statics.field240.field1393 = field920[var5];
        Statics.field240.field1392 = field1085[var5];
        Statics.field240.field1391 = field1056[var5];
        Statics.field240.field1394 = field921[var5];
        Statics.field240.field1395 = field1058[var5];
    }

    @ObfuscatedName("client.jo(I)V")
    public final void method1402() {
        method165(field1053);
        Statics.field2269++;
        if (field1095 && field1092) {
            int var1 = class60.field746;
            int var2 = class60.field747;
            int var3 = var1 - field1089;
            int var4 = var2 - field1090;
            if (var3 < field1093) {
                var3 = field1093;
            }
            if (field1053.field2674 + var3 > field1093 + field1048.field2674) {
                var3 = field1093 + field1048.field2674 - field1053.field2674;
            }
            if (var4 < field1094) {
                var4 = field1094;
            }
            if (field1053.field2675 + var4 > field1094 + field1048.field2675) {
                var4 = field1094 + field1048.field2675 - field1053.field2675;
            }
            int var5 = var3 - field1096;
            int var6 = var4 - field1097;
            int var7 = field1053.field2735;
            if (Statics.field2269 > field1053.field2758 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1160 = true;
            }
            int var8 = field1048.field2695 + (var3 - field1093);
            int var9 = field1048.field2774 + (var4 - field1094);
            if (field1053.field2748 != null && field1160) {
                class69 var10 = new class69();
                var10.field854 = field1053;
                var10.field848 = var8;
                var10.field849 = var9;
                var10.field847 = field1053.field2748;
                class82.method2853(var10);
            }
            if (class60.field739 == 0) {
                if (field1160) {
                    if (field1053.field2749 != null) {
                        class69 var11 = new class69();
                        var11.field854 = field1053;
                        var11.field848 = var8;
                        var11.field849 = var9;
                        var11.field851 = field953;
                        var11.field847 = field1053.field2749;
                        class82.method2853(var11);
                    }
                    if (field953 != null && method3853(field1053) != null) {
                        field965.method3210(173);
                        field965.method2989(field953.field2660);
                        field965.method2940(field953.field2779);
                        field965.method2998(field953.field2739);
                        field965.method3102(field1053.field2779);
                        field965.method3084(field1053.field2660);
                        field965.method2998(field1053.field2739);
                    }
                } else if (this.method1109()) {
                    this.method1110(field1096 + field1089, field1097 + field1090);
                } else if (field1028 > 0) {
                    method1454(field1096 + field1089, field1097 + field1090);
                }
                field1053 = null;
            }
        } else if (Statics.field2269 > 1) {
            field1053 = null;
        }
    }

    @ObfuscatedName("bz.jq(III)V")
    public static void method1454(int arg0, int arg1) {
        method163(Statics.field240, arg0, arg1);
        Statics.field240 = null;
    }

    @ObfuscatedName("m.ji(Lhj;S)V")
    public static void method165(class217 arg0) {
        if (field1118 == arg0.field2791) {
            field1119[arg0.field2790] = true;
        }
    }

    @ObfuscatedName("dj.jv(I)V")
    public static void method2265() {
        for (class68 var0 = (class68) field1075.method3355(); var0 != null; var0 = (class68) field1075.method3356()) {
            int var1 = var0.field835;
            if (class217.method1688(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field2433[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2680;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2486;
                    class217 var6 = class217.method3237(var5);
                    if (var6 != null) {
                        method165(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cc.jg(Lhj;B)Lhj;")
    public static class217 method1774(class217 arg0) {
        class217 var1 = method3853(arg0);
        if (var1 == null) {
            var1 = arg0.field2771;
        }
        return var1;
    }

    @ObfuscatedName("ea.jd([Ljava/lang/String;S)[Ljava/lang/String;")
    public static final String[] method2712(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ad.jw(II)V")
    public static final void method234(int arg0) {
        if (!class217.method1688(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2433[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2777 = 0;
                var3.field2782 = 0;
            }
        }
    }

    @ObfuscatedName("ar.jy([Lhj;II)V")
    public static final void method482(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2678 == arg1 && (!var3.field2680 || !method1772(var3))) {
                if (var3.field2661 == 0) {
                    if (!var3.field2680 && method1772(var3) && Statics.field404 != var3) {
                        continue;
                    }
                    method482(arg0, var3.field2739);
                    if (var3.field2705 != null) {
                        method482(var3.field2705, var3.field2739);
                    }
                    class68 var4 = (class68) field1075.method3352((long) var3.field2739);
                    if (var4 != null) {
                        int var5 = var4.field835;
                        if (class217.method1688(var5)) {
                            method482(Statics.field2433[var5], -1);
                        }
                    }
                }
                if (var3.field2661 == 6) {
                    if (var3.field2650 != -1 || var3.field2707 != -1) {
                        boolean var6 = method1028(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2707;
                        } else {
                            var7 = var3.field2650;
                        }
                        if (var7 != -1) {
                            class261 var8 = class261.method3613(var7);
                            var3.field2782 += field1123;
                            while (var3.field2782 > var8.field3611[var3.field2777]) {
                                var3.field2782 -= var8.field3611[var3.field2777];
                                var3.field2777++;
                                if (var3.field2777 >= var8.field3622.length) {
                                    var3.field2777 -= var8.field3609;
                                    if (var3.field2777 < 0 || var3.field2777 >= var8.field3622.length) {
                                        var3.field2777 = 0;
                                    }
                                }
                                method165(var3);
                            }
                        }
                    }
                    if (var3.field2715 != 0 && !var3.field2680) {
                        int var9 = var3.field2715 >> 16;
                        int var10 = var3.field2715 << 16 >> 16;
                        int var11 = field1123 * var9;
                        int var12 = field1123 * var10;
                        var3.field2710 = var3.field2710 + var11 & 0x7FF;
                        var3.field2711 = var3.field2711 + var12 & 0x7FF;
                        method165(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bk.jr(II)V")
    public static final void method1038(int arg0) {
        method2265();
        class81.method186();
        int var1 = class242.method3180(arg0).field3288;
        if (var1 == 0) {
            return;
        }
        int var2 = class212.field2621[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class135.method2510(0.9D);
                ((class124) Statics.field2019).method2239(0.9D);
            }
            if (var2 == 2) {
                class135.method2510(0.8D);
                ((class124) Statics.field2019).method2239(0.8D);
            }
            if (var2 == 3) {
                class135.method2510(0.7D);
                ((class124) Statics.field2019).method2239(0.7D);
            }
            if (var2 == 4) {
                class135.method2510(0.6D);
                ((class124) Statics.field2019).method2239(0.6D);
            }
            class257.field3510.method3345();
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
            if (field977 != var3) {
                if (field977 == 0 && field1087 != -1) {
                    class204.method2819(Statics.field3677, field1087, 0, var3, false);
                    field1152 = false;
                } else if (var3 == 0) {
                    class204.method1612();
                    field1152 = false;
                } else {
                    class204.method549(var3);
                }
                field977 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field943 = 127;
            }
            if (var2 == 1) {
                field943 = 96;
            }
            if (var2 == 2) {
                field943 = 64;
            }
            if (var2 == 3) {
                field943 = 32;
            }
            if (var2 == 4) {
                field943 = 0;
            }
        }
        if (var1 == 5) {
            field1051 = var2;
        }
        if (var1 == 6) {
            field1076 = var2;
        }
        if (var1 == 9) {
            field1077 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1115 = 127;
            }
            if (var2 == 1) {
                field1115 = 96;
            }
            if (var2 == 2) {
                field1115 = 64;
            }
            if (var2 == 3) {
                field1115 = 32;
            }
            if (var2 == 4) {
                field1115 = 0;
            }
        }
        if (var1 == 17) {
            field1082 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class90[] var4 = new class90[] { class90.field1403, class90.field1404, class90.field1405, class90.field1402 };
            field947 = (class90) class169.method648(var4, var2);
            if (field947 == null) {
                field947 = class90.field1405;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field1062 = -1;
            } else {
                field1062 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class90[] var5 = new class90[] { class90.field1403, class90.field1404, class90.field1405, class90.field1402 };
        field948 = (class90) class169.method648(var5, var2);
        if (field948 == null) {
            field948 = class90.field1405;
        }
    }

    @ObfuscatedName("ij.ja(I)V")
    public static final void method3972() {
        field965.method3210(124);
        for (class68 var0 = (class68) field1075.method3355(); var0 != null; var0 = (class68) field1075.method3356()) {
            if (var0.field836 == 0 || var0.field836 == 3) {
                method1452(var0, true);
            }
        }
        if (field1078 != null) {
            method165(field1078);
            field1078 = null;
        }
    }

    @ObfuscatedName("bz.jp(Lbk;ZB)V")
    public static final void method1452(class68 arg0, boolean arg1) {
        int var2 = arg0.field835;
        int var3 = (int) arg0.field2486;
        arg0.method3407();
        if (arg1) {
            class217.method3773(var2);
        }
        for (class199 var4 = (class199) field1033.method3355(); var4 != null; var4 = (class199) field1033.method3356()) {
            if ((var4.field2486 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3407();
            }
        }
        class217 var5 = class217.method3237(var3);
        if (var5 != null) {
            method165(var5);
        }
        method79();
        if (field1074 != -1) {
            int var6 = field1074;
            if (class217.method1688(var6)) {
                method4168(Statics.field2433[var6], 1);
            }
        }
    }

    @ObfuscatedName("jr.jt(Lhj;I)Z")
    public static final boolean method4654(class217 arg0) {
        int var1 = arg0.field2663;
        if (var1 == 205) {
            field975 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1180.method3745(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1180.method3740(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1180.method3744(false);
        }
        if (var1 == 325) {
            field1180.method3744(true);
        }
        if (var1 == 326) {
            field965.method3210(155);
            field1180.method3741(field965);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("be.js(Lhj;IIIB)V")
    public static final void method1092(class217 arg0, int arg1, int arg2, int arg3) {
        method225();
        class211 var4 = arg0.method3784(false);
        if (var4 == null) {
            return;
        }
        class283.method4679(arg1, arg2, var4.field2616 + arg1, var4.field2612 + arg2);
        if (field1184 == 2 || field1184 == 5) {
            class283.method4701(arg1, arg2, 0, var4.field2617, var4.field2614);
        } else {
            int var5 = field997 & 0x7FF;
            int var6 = Statics.field2427.field1243 / 32 + 48;
            int var7 = 464 - Statics.field2427.field1209 / 32;
            Statics.field34.method4808(arg1, arg2, var4.field2616, var4.field2612, var6, var7, var5, 256, var4.field2617, var4.field2614);
            for (int var8 = 0; var8 < field1142; var8++) {
                int var9 = field1143[var8] * 4 + 2 - Statics.field2427.field1243 / 32;
                int var10 = field1144[var8] * 4 + 2 - Statics.field2427.field1209 / 32;
                Statics.method547(arg1, arg2, var9, var10, field1177[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class194 var13 = field1044[Statics.field44][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2427.field1243 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2427.field1209 / 32;
                        Statics.method547(arg1, arg2, var14, var15, Statics.field756[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field961; var16++) {
                class85 var17 = field960[field1029[var16]];
                if (var17 != null && var17.method1074()) {
                    class259 var18 = var17.field1370;
                    if (var18 != null && var18.field3584 != null) {
                        var18 = var18.method4369();
                    }
                    if (var18 != null && var18.field3575 && var18.field3587) {
                        int var19 = var17.field1243 / 32 - Statics.field2427.field1243 / 32;
                        int var20 = var17.field1209 / 32 - Statics.field2427.field1209 / 32;
                        Statics.method547(arg1, arg2, var19, var20, Statics.field756[1], var4);
                    }
                }
            }
            int var21 = class95.field1486;
            int[] var22 = class95.field1481;
            for (int var23 = 0; var23 < var21; var23++) {
                class74 var24 = field1034[var22[var23]];
                if (var24 != null && var24.method1074() && !var24.field904 && Statics.field2427 != var24) {
                    int var25 = var24.field1243 / 32 - Statics.field2427.field1243 / 32;
                    int var26 = var24.field1209 / 32 - Statics.field2427.field1209 / 32;
                    boolean var27 = false;
                    if (method561(var24.field896, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field350; var29++) {
                        if (var24.field896.equals(Statics.field451[var29].field910)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2427.field903 != 0 && var24.field903 != 0 && Statics.field2427.field903 == var24.field903) {
                        var30 = true;
                    }
                    if (var27) {
                        Statics.method547(arg1, arg2, var25, var26, Statics.field756[3], var4);
                    } else if (var30) {
                        Statics.method547(arg1, arg2, var25, var26, Statics.field756[4], var4);
                    } else if (var28) {
                        Statics.method547(arg1, arg2, var25, var26, Statics.field756[5], var4);
                    } else {
                        Statics.method547(arg1, arg2, var25, var26, Statics.field756[2], var4);
                    }
                }
            }
            if (field939 != 0 && field931 % 20 < 10) {
                if (field939 == 1 && field940 >= 0 && field940 < field960.length) {
                    class85 var31 = field960[field940];
                    if (var31 != null) {
                        int var32 = var31.field1243 / 32 - Statics.field2427.field1243 / 32;
                        int var33 = var31.field1209 / 32 - Statics.field2427.field1209 / 32;
                        method2750(arg1, arg2, var32, var33, Statics.field688[1], var4);
                    }
                }
                if (field939 == 2) {
                    int var34 = field1015 * 4 - Statics.field2122 * 4 + 2 - Statics.field2427.field1243 / 32;
                    int var35 = field968 * 4 - Statics.field1505 * 4 + 2 - Statics.field2427.field1209 / 32;
                    method2750(arg1, arg2, var34, var35, Statics.field688[1], var4);
                }
                if (field939 == 10 && field941 >= 0 && field941 < field1034.length) {
                    class74 var36 = field1034[field941];
                    if (var36 != null) {
                        int var37 = var36.field1243 / 32 - Statics.field2427.field1243 / 32;
                        int var38 = var36.field1209 / 32 - Statics.field2427.field1209 / 32;
                        method2750(arg1, arg2, var37, var38, Statics.field688[1], var4);
                    }
                }
            }
            if (field951 != 0) {
                int var39 = field951 * 4 + 2 - Statics.field2427.field1243 / 32;
                int var40 = field1147 * 4 + 2 - Statics.field2427.field1209 / 32;
                Statics.method547(arg1, arg2, var39, var40, Statics.field688[0], var4);
            }
            if (!Statics.field2427.field904) {
                class283.method4762(var4.field2616 / 2 + arg1 - 1, var4.field2612 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1120[arg3] = true;
    }

    @ObfuscatedName("k.je(Lhj;IIII)V")
    public static final void method2(class217 arg0, int arg1, int arg2, int arg3) {
        class211 var4 = arg0.method3784(false);
        if (var4 == null) {
            return;
        }
        if (field1184 < 3) {
            Statics.field306.method4808(arg1, arg2, var4.field2616, var4.field2612, 25, 25, field997, 256, var4.field2617, var4.field2614);
        } else {
            class283.method4701(arg1, arg2, 0, var4.field2617, var4.field2614);
        }
    }

    @ObfuscatedName("er.jx(IIIILkr;Lhu;I)V")
    public static final void method2750(int arg0, int arg1, int arg2, int arg3, class287 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            Statics.method547(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field997 & 0x7FF;
        int var8 = class135.field2016[var7];
        int var9 = class135.field2023[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2616 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field303.method4809(arg5.field2616 / 2 + arg0 - var17 / 2 + var15, arg5.field2612 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("at.jc(Ljava/lang/String;ZI)Z")
    public static boolean method561(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method3677(arg0, Statics.field43);
        for (int var3 = 0; var3 < field952; var3++) {
            if (var2.equalsIgnoreCase(class268.method3677(field1182[var3].field827, Statics.field43)) && (!arg1 || field1182[var3].field822 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method3677(Statics.field2427.field896, Statics.field43))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fm.jz(Ljava/lang/String;I)Z")
    public static boolean method2868(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method3677(arg0, Statics.field43);
        for (int var2 = 0; var2 < field1183; var2++) {
            class70 var3 = field1055[var2];
            if (var1.equalsIgnoreCase(class268.method3677(var3.field857, Statics.field43))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method3677(var3.field858, Statics.field43))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("an.kr(Ljava/lang/String;I)V")
    public static final void method470(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field952 < 200 || field1036 == 1) || field952 >= 400) {
            class97.method1053(30, "", class226.field3023);
            return;
        }
        String var1 = class268.method3677(arg0, Statics.field43);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field952; var2++) {
            class66 var3 = field1182[var2];
            String var4 = class268.method3677(var3.field827, Statics.field43);
            if (var4 != null && var4.equals(var1)) {
                class97.method1053(30, "", arg0 + class226.field2907);
                return;
            }
            if (var3.field821 != null) {
                String var5 = class268.method3677(var3.field821, Statics.field43);
                if (var5 != null && var5.equals(var1)) {
                    class97.method1053(30, "", arg0 + class226.field2907);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field1183; var6++) {
            class70 var7 = field1055[var6];
            String var8 = class268.method3677(var7.field857, Statics.field43);
            if (var8 != null && var8.equals(var1)) {
                class97.method1053(30, "", class226.field3029 + arg0 + class226.field3078);
                return;
            }
            if (var7.field858 != null) {
                String var9 = class268.method3677(var7.field858, Statics.field43);
                if (var9 != null && var9.equals(var1)) {
                    class97.method1053(30, "", class226.field3029 + arg0 + class226.field3078);
                    return;
                }
            }
        }
        if (class268.method3677(Statics.field2427.field896, Statics.field43).equals(var1)) {
            class97.method1053(30, "", class226.field3027);
        } else {
            field965.method3210(163);
            field965.method2970(class174.method2869(arg0));
            field965.method3041(arg0);
        }
    }

    @ObfuscatedName("dz.ku(Ljava/lang/String;II)V")
    public static final void method2198(String arg0, int arg1) {
        field965.method3210(139);
        field965.method2970(class174.method2869(arg0) + 1);
        field965.method2980(arg1);
        field965.method3041(arg0);
    }

    @ObfuscatedName("er.kp(Ljava/lang/String;I)V")
    public static final void method2749(String arg0) {
        if (Statics.field451 != null) {
            field965.method3210(216);
            field965.method2970(class174.method2869(arg0));
            field965.method3041(arg0);
        }
    }

    @ObfuscatedName("ib.ke(Lhj;I)I")
    public static int method4068(class217 arg0) {
        class199 var1 = (class199) field1033.method3352(((long) arg0.field2739 << 32) + (long) arg0.field2660);
        return var1 == null ? arg0.field2693 : var1.field2500;
    }

    @ObfuscatedName("hs.kj(Lhj;S)Lhj;")
    public static class217 method3853(class217 arg0) {
        int var1 = class218.method2924(method4068(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class217.method3237(arg0.field2678);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cv.kt(Lhj;I)Z")
    public static boolean method1772(class217 arg0) {
        if (field962) {
            if (method4068(arg0) != 0) {
                return false;
            }
            if (arg0.field2661 == 0) {
                return false;
            }
        }
        return arg0.field2679;
    }

    @ObfuscatedName("aq.ki(Lhj;I)Ljava/lang/String;")
    public static String method451(class217 arg0) {
        int var1 = method4068(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2738 == null || arg0.field2738.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2738;
        }
    }

    @ObfuscatedName("at.kn(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method559(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field923 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field923 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field923 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field923 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field923 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2203 != null) {
            var3 = "/p=" + Statics.field2203;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field927 + "/a=" + Statics.field1378 + var3 + "/";
    }

    @ObfuscatedName("g.kw(Ljava/lang/String;ZI)V")
    public static void method41(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3145; var5++) {
            class257 var6 = class257.method637(var5);
            if ((!arg1 || var6.field3539) && var6.field3537 == -1 && var6.field3499.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field371 = -1;
                    Statics.field492 = null;
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
        Statics.field492 = var3;
        Statics.field102 = 0;
        Statics.field371 = var4;
        String[] var9 = new String[Statics.field371];
        for (int var10 = 0; var10 < Statics.field371; var10++) {
            var9[var10] = class257.method637(var3[var10]).field3499;
        }
        class171.method2709(var9, Statics.field492);
    }

    @ObfuscatedName("an.ko([BIS)V")
    public static void method469(byte[] arg0, int arg1) {
        if (field982 == null) {
            field982 = new byte[24];
        }
        class184.method3257(arg0, arg1, field982, 0, 24);
    }
}
